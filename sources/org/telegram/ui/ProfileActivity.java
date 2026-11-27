package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class ProfileActivity extends org.telegram.ui.ActionBar.e implements fn7, oj3, xia, yn5, tha, ej6 {
    public static final RectF Z6 = new RectF();
    public static final int a7 = hl.L(16.0f);
    public vnb A0;
    public boolean A1;
    public String A2;
    public int A3;
    public int A4;
    public SpannableStringBuilder A5;
    public boolean A6;
    public byte B0;
    public boolean B1;
    public long B2;
    public int B3;
    public int B4;
    public SpannableStringBuilder B5;
    public float B6;
    public jn5 C0;
    public zh6 C1;
    public int C2;
    public int C3;
    public int C4;
    public c51[] C5;
    public float C6;
    public int D0;
    public boolean D1;
    public ArrayList D2;
    public int D3;
    public int D4;
    public j61 D5;
    public float D6;
    public Drawable E;
    public int E0;
    public long E1;
    public TLRPC.EncryptedChat E2;
    public int E3;
    public int E4;
    public FrameLayout E5;
    public float E6;
    public Long F;
    public int F0;
    public float F1;
    public TLRPC.Chat F2;
    public int F3;
    public int F4;
    public c51 F5;
    public gs8 F6;
    public ul G;
    public boolean G0;
    public boolean G1;
    public TL_bots.BotInfo G2;
    public int G3;
    public int G4;
    public float G5;
    public ns8 G6;
    public ul H;
    public boolean H0;
    public boolean H1;
    public TLRPC.ChannelParticipant H2;
    public int H3;
    public int H4;
    public View H5;
    public kg5 H6;
    public Drawable I;
    public boolean I0;
    public boolean I1;
    public TL_account.TL_password I2;
    public int I3;
    public int I4;
    public int I5;
    public int I6;
    public e43 J;
    public boolean J0;
    public byte J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public int J4;
    public int J5;
    public Boolean J6;
    public e43 K;
    public final boolean[] K0;
    public boolean K1;
    public TLRPC.FileLocation K2;
    public int K3;
    public int K4;
    public int K5;
    public TLRPC.TL_emojiStatusCollectible K6;
    public yt9 L;
    public boolean L0;
    public boolean L1;
    public jn5 L2;
    public int L3;
    public boolean L4;
    public int L5;
    public int L6;
    public UndoView M;
    public boolean M0;
    public boolean M1;
    public final Rect M2;
    public int M3;
    public boolean M4;
    public ol0 M5;
    public boolean M6;
    public xr8 N;
    public boolean N0;
    public boolean N1;
    public skb N2;
    public int N3;
    public int N4;
    public final xh4 N5;
    public int N6;
    public gr8 O;
    public boolean O0;
    public boolean O1;
    public int O2;
    public int O3;
    public int O4;
    public qs8 O5;
    public int O6;
    public z2b P;
    public ImageView P0;
    public boolean P1;
    public int P2;
    public int P3;
    public int P4;
    public float P5;
    public int P6;
    public boolean Q;
    public sla Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public int Q4;
    public int Q5;
    public final nz4 Q6;
    public wia R;
    public sla R0;
    public float R1;
    public int R2;
    public int R3;
    public boolean R4;
    public float R5;
    public final ll0 R6;
    public boolean S;
    public sla S0;
    public float S1;
    public int S2;
    public int S3;
    public boolean S4;
    public final fm0 S5;
    public dg0 S6;
    public jva T;
    public sla T0;
    public float T1;
    public int T2;
    public int T3;
    public int T4;
    public rq8 T5;
    public final Paint T6;
    public tb U;
    public sla U0;
    public int U1;
    public int U2;
    public int U3;
    public final ArrayList U4;
    public AnimatorSet U5;
    public Drawable U6;
    public b29 V;
    public b8 V0;
    public float V1;
    public int V2;
    public int V3;
    public final ArrayList V4;
    public AnimatorSet V5;
    public Drawable V6;
    public b29 W;
    public b8 W0;
    public ValueAnimator W1;
    public int W2;
    public int W3;
    public byte W4;
    public float W5;
    public Drawable W6;
    public kg5 X;
    public b8 X0;
    public boolean X1;
    public int X2;
    public int X3;
    public boolean X4;
    public boolean X5;
    public wm2 X6;
    public d26 Y;
    public ImageView Y0;
    public c34 Y1;
    public int Y2;
    public int Y3;
    public boolean Y4;
    public final oq8 Y5;
    public final int[] Y6;
    public tt Z;
    public b8 Z0;
    public final HashMap Z1;
    public int Z2;
    public int Z3;
    public nq8 Z4;
    public View Z5;
    public zp8 a;
    public ap8 a0;
    public guc a1;
    public float a2;
    public int a3;
    public int a4;
    public View a5;
    public int a6;
    public d79 b;
    public pc7 b0;
    public float b1;
    public float b2;
    public int b3;
    public int b4;
    public float b5;
    public int b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public bq8 c;
    public tu8 c0;
    public int c1;
    public float c2;
    public int c3;
    public int c4;
    public int c5;
    public CharSequence c6;
    public wr8 d;
    public js8 d0;
    public is8 d1;
    public float d2;
    public int d3;
    public int d4;
    public int d5;
    public boolean d6;
    public fs8 e;
    public zm e0;
    public long e1;
    public float e2;
    public int e3;
    public int e4;
    public int e5;
    public final mq8 e6;
    public ns1 f;
    public iq8 f0;
    public long f1;
    public float f2;
    public int f3;
    public int f4;
    public long f5;
    public float[] f6;
    public AnimatorSet g0;
    public long g1;
    public float g2;
    public int g3;
    public int g4;
    public boolean g5;
    public float g6;
    public String h;
    public vb5 h0;
    public boolean h1;
    public float h2;
    public int h3;
    public int h4;
    public boolean h5;
    public float h6;
    public ImageView i0;
    public long i1;
    public float i2;
    public int i3;
    public int i4;
    public String i5;
    public boolean i6;
    public ImageView j0;
    public boolean j1;
    public float j2;
    public int j3;
    public int j4;
    public String j5;
    public qr8 j6;
    public ImageView k0;
    public boolean k1;
    public ValueAnimator k2;
    public int k3;
    public int k4;
    public String k5;
    public float k6;
    public ImageView l0;
    public boolean l1;
    public float l2;
    public int l3;
    public int l4;
    public uj3 l5;
    public final RectF l6;
    public rsb m0;
    public long m1;
    public float m2;
    public int m3;
    public int m4;
    public kz1 m5;
    public float m6;
    public String n;
    public ws8 n0;
    public boolean n1;
    public final float[] n2;
    public int n3;
    public int n4;
    public final HashSet n5;
    public kc7 n6;
    public jq8 o0;
    public boolean o1;
    public boolean o2;
    public int o3;
    public int o4;
    public or8 o5;
    public final SparseIntArray o6;
    public yr8 p0;
    public boolean p1;
    public boolean p2;
    public int p3;
    public int p4;
    public final oq8 p5;
    public int p6;
    public rb0 q0;
    public boolean q1;
    public boolean q2;
    public int q3;
    public int q4;
    public final vq8 q5;
    public AnimatorSet q6;
    public kq8 r;
    public zn5 r0;
    public boolean r1;
    public final Paint r2;
    public int r3;
    public int r4;
    public boolean r5;
    public int r6;
    public e29 s;
    public int s0;
    public boolean s1;
    public boolean s2;
    public int s3;
    public int s4;
    public er8 s5;
    public int s6;
    public rsb t0;
    public boolean t1;
    public tq0 t2;
    public int t3;
    public int t4;
    public float t5;
    public boolean t6;
    public ku8 u0;
    public int u1;
    public uo0 u2;
    public int u3;
    public int u4;
    public float u5;
    public boolean u6;
    public lq8 v0;
    public boolean v1;
    public TLRPC.ChatFull v2;
    public int v3;
    public int v4;
    public boolean v5;
    public e29 v6;
    public AnimatorSet w;
    public gu8 w0;
    public boolean w1;
    public TLRPC.UserFull w2;
    public int w3;
    public int w4;
    public boolean w5;
    public final int[] w6;
    public Drawable x;
    public View x0;
    public boolean x1;
    public ts8 x2;
    public int x3;
    public int x4;
    public ImageReceiver x5;
    public float x6;
    public Drawable y;
    public final hq8 y0;
    public int y1;
    public boolean y2;
    public int y3;
    public int y4;
    public FrameLayout y5;
    public CharSequence y6;
    public final Paint z0;
    public boolean z1;
    public ks8 z2;
    public int z3;
    public int z4;
    public FrameLayout[] z5;
    public CharSequence z6;

    public ProfileActivity(Bundle bundle, wia wiaVar) {
        super(bundle);
        this.h = null;
        this.n = null;
        this.x0 = null;
        this.y0 = new hq8(this, (byte) 0);
        this.z0 = new Paint(1);
        this.K0 = new boolean[1];
        this.b1 = 1.0f;
        this.C1 = new zh6();
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
        this.U4 = new ArrayList();
        this.V4 = new ArrayList();
        this.W4 = (byte) 0;
        this.X4 = true;
        this.Y4 = true;
        this.c5 = 0;
        this.d5 = 0;
        this.e5 = 0;
        this.f5 = 0L;
        this.n5 = new HashSet();
        this.p5 = new oq8(this, (byte) 0);
        this.q5 = new vq8(this);
        this.N5 = new xh4((Object) this, (byte) 24);
        this.R5 = 1.0f;
        this.S5 = new fm0(0, new bp8(this, (byte) 6), k43.h, 380L, true);
        this.Y5 = new oq8(this, (byte) 1);
        this.e6 = new mq8(this, (byte) 2);
        this.f6 = null;
        this.l6 = new RectF();
        this.o6 = new SparseIntArray();
        this.q6 = null;
        this.r6 = -1;
        this.w6 = new int[3];
        this.x6 = -1.0f;
        nz4 nz4Var = new nz4();
        this.Q6 = nz4Var;
        ll0 ll0Var = new ll0(nz4Var, nz4Var, nz4Var);
        this.R6 = ll0Var;
        this.T6 = new Paint();
        this.Y6 = new int[7];
        this.R = wiaVar;
        ll0Var.g = new r89(0, false);
    }

    public static void F1(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view == null || view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return;
        }
        RectF rectF2 = Z6;
        if (yic.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
            uk0.b(new mr0(view, (byte) 7), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
        }
    }

    public static void M2(String str, StringBuilder sb) {
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

    public static SpannableStringBuilder P1(String str, int i, vnb vnbVar) {
        int v0 = aob.v0(i, vnbVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        zq8 zq8Var = new zq8(9);
        zq8Var.w = str;
        if (zq8Var.c != null) {
            zq8Var.c = null;
            zq8Var.a();
        }
        zq8Var.f = v0;
        zq8Var.n = false;
        spannableStringBuilder.setSpan(zq8Var, 0, spannableStringBuilder.length(), 0);
        lf4[] lf4VarArr = (lf4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), lf4.class);
        if (lf4VarArr != null) {
            for (lf4 lf4Var : lf4VarArr) {
                lf4Var.getClass();
                lf4Var.f = aob.v0(i, vnbVar);
                lf4Var.r = i;
                lf4Var.s = vnbVar;
                lf4Var.n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static ProfileActivity Q2(long j) {
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void m3(Activity activity, boolean z) {
        if (activity == null) {
            return;
        }
        id idVar = new id(3, null, activity);
        idVar.j0 = false;
        idVar.show();
        Utilities.e.c(new yn6((Object) idVar, z, (Object) activity, (byte) 16));
    }

    public static void p3(FrameLayout frameLayout, float f) {
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(a7 * f);
        frameLayout.setAlpha(1.0f - f);
        frameLayout.setVisibility(f < 1.0f ? 0 : 4);
    }

    public static void u3(int i, View view) {
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

    public static void v3(sla slaVar, boolean z, boolean z2) {
        if (ik8.A(slaVar)) {
            slaVar.Y(z, z2);
        } else if (slaVar != null) {
            slaVar.setVisibility(z ? 0 : 8);
        }
    }

    @Override // ej6
    public final rz4 A() {
        return getBaseSimpleGlass().d();
    }

    public final int A1(int i, Boolean bool) {
        if (this.n6 == null) {
            return i;
        }
        int v0 = aob.v0(aob.s8, this.A0);
        int f = vm2.f(0.5f, this.n6.m(aob.I.o()), this.n6.n(aob.I.o()));
        if (aob.c1(v0)) {
            return aob.C(aob.I.o(), v0, f, i, (bool == null || bool.booleanValue()) ? f : aob.p1(0.7f, f));
        }
        return (bool == null || bool.booleanValue()) ? f : aob.a(-0.2f, 0.2f, aob.p1(0.7f, f));
    }

    public final void A2() {
        TLRPC.Document e;
        v21 h;
        if (this.K2 == null) {
            int i = 0;
            if (!this.q1 || getMessagesController().M3()) {
                if (T1()) {
                    return;
                }
                a3(false);
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
                if (j == 0 || (e = wl.e(this.currentAccount, j)) == null || (h = d31.b0(this).h(e, 1, new gp8(this, (byte) 3))) == null) {
                    return;
                }
                h.j();
            }
        }
    }

    public final void A3(View view, float f) {
        if (this.p2) {
            if (this.q2) {
                this.a.y0(0, ((view.getTop() - this.a.getMeasuredWidth()) - X1()) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? hl.m : 0), k43.h);
                return;
            } else {
                this.a.y0(0, view.getTop() - d2(), k43.h);
                return;
            }
        }
        boolean z = X1() > 0;
        if (z) {
            float f2 = this.Q1;
            if (f2 > 0.0f && ((f2 < d2() * 0.6f || f < -1000.0f) && this.Q1 > X1() * 0.6f)) {
                this.a.y0(0, (int) (this.Q1 - X1()), k43.h);
                return;
            }
        }
        if (z) {
            float f3 = this.Q1;
            if (f3 > 0.0f && f3 < X1() * 0.6f) {
                this.a.y0(0, (int) this.Q1, k43.h);
                return;
            }
        }
        if (!z) {
            float f4 = this.Q1;
            if (f4 > 0.0f && f < -1000.0f) {
                this.a.y0(0, (int) f4, k43.h);
                return;
            }
        }
        if (this.Q1 > 0.0f) {
            this.a.y0(0, view.getTop() - d2(), k43.h);
        }
    }

    public final void B1() {
        int f;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar == null || this.f == null || this.d1 == null || this.T0 == null || this.Q0 == null || this.R0 == null || this.S0 == null || this.p0 == null) {
            return;
        }
        Float valueOf = Float.valueOf(this.W5);
        oq8 oq8Var = this.Y5;
        oq8Var.getClass();
        oq8Var.a(aVar, valueOf);
        if (this.W5 > 0.0f || this.l2 <= 0.0f) {
            return;
        }
        ns1 ns1Var = this.f;
        int i = -1;
        if (this.n6 != null) {
            f = -1;
        } else {
            f = vm2.f(this.l2, aob.v0(aob.mi, this.A0), -1);
        }
        ns1Var.setTextColor(f);
        org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
        if (this.n6 == null) {
            i = vm2.f(this.l2, aob.v0(aob.v8, this.A0), -1);
        }
        aVar2.H(i, false);
    }

    public final void B2(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        if (tL_error == null) {
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(getUserConfig().e()));
            if (X1 == null) {
                X1 = getUserConfig().f();
                if (X1 == null) {
                    return;
                } else {
                    getMessagesController().i4(X1, false, false);
                }
            } else {
                getUserConfig().v(X1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w = xb4.w(arrayList, jn7.f2, false, null, false);
            TLRPC.PhotoSize w2 = xb4.w(arrayList, 800, false, null, false);
            TLRPC.VideoSize x = tL_photos_photo.photo.video_sizes.isEmpty() ? null : xb4.x(1000, tL_photos_photo.photo.video_sizes);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            X1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w != null) {
                tL_userProfilePhoto.photo_small = w.location;
            }
            if (w2 != null) {
                tL_userProfilePhoto.photo_big = w2.location;
            }
            if (w != null && this.J2 != null) {
                xb4.G(this.currentAccount);
                File J = xb4.J(w, null, true, true);
                xb4.G(this.currentAccount);
                xb4.J(this.J2, null, true, true).renameTo(J);
                StringBuilder sb = new StringBuilder();
                sb.append(this.J2.volume_id);
                sb.append("_");
                String l = uh9.l(sb, this.J2.local_id, "@50_50");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.location.volume_id);
                sb2.append("_");
                in5.z().O(l, uh9.l(sb2, w.location.local_id, "@50_50"), jn5.m(this.currentAccount, 1, X1));
            }
            if (x != null && str != null) {
                xb4.G(this.currentAccount);
                new File(str).renameTo(xb4.J(x, "mp4", true, true));
            } else if (w2 != null && this.K2 != null) {
                xb4.G(this.currentAccount);
                File J2 = xb4.J(w2, null, true, true);
                xb4.G(this.currentAccount);
                xb4.J(this.K2, null, true, true).renameTo(J2);
            }
            getMessagesController().U0(X1.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(X1);
            getMessagesStorage().j1(arrayList2, null, false, true);
            TLRPC.UserFull Y1 = getMessagesController().Y1(this.e1);
            if (Y1 != null) {
                Y1.profile_photo = tL_photos_photo.photo;
                getMessagesStorage().g2(Y1, false);
            }
        }
        this.p2 = (hl.O1() || this.o2 || !this.f0.getImageReceiver().E() || hl.A1()) ? false : true;
        this.J2 = null;
        this.K2 = null;
        jq8 jq8Var = this.o0;
        jq8Var.I0 = true;
        jq8Var.L0 = this.L2;
        jq8Var.r1 = null;
        jq8Var.s1 = null;
        jq8Var.setCreateThumbFromParent(false);
        e4(true);
        C3(false, true);
        getNotificationCenter().k(2, Integer.valueOf(uc7.r5));
        getNotificationCenter().k(jn7.j0, new Object[0]);
        getUserConfig().u(true);
    }

    public final void B3() {
        eg0 baseSimpleGlass = getBaseSimpleGlass();
        qs8 qs8Var = new qs8(this.glassEngine, baseSimpleGlass);
        this.O5 = qs8Var;
        is8 is8Var = this.d1;
        if (is8Var != null) {
            int i = is8Var.I;
            boolean z = is8Var.c;
            if (qs8Var.i != i || qs8Var.j != z) {
                qs8Var.i = i;
                qs8Var.j = z;
                qs8Var.a();
            }
        }
        this.O5.b(this.P5);
        ap8 ap8Var = this.a0;
        if (ap8Var != null) {
            ap8Var.setGlassFactory(this.O5.c);
        }
        tu8 tu8Var = this.c0;
        if (tu8Var != null) {
            tu8Var.setGlassFactory(this.O5.c);
        }
        this.simpleActionBar.setButtonsGlass(this.O5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        baseSimpleGlass.i(this.s5, this.simpleActionBar, this.A0);
        jla jlaVar = this.simpleActionBar;
        qs8 qs8Var2 = this.O5;
        ll0 ll0Var = qs8Var2.e;
        pz4 pz4Var = qs8Var2.f;
        jlaVar.v0 = ll0Var;
        jlaVar.w0 = pz4Var;
        jlaVar.setBackground(null);
        this.M5 = dtd.l(this.A0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.N5);
        W3();
        baseSimpleGlass.o = this.S6;
        View view = new View(getParentActivity());
        this.Z5 = view;
        view.setAlpha(0.0f);
        this.s5.getViewTreeObserver().addOnPreDrawListener(new es1(this, (byte) 4));
        this.O.e(this.Z5);
        View view2 = this.Z5;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.H5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        er8 er8Var = this.s5;
        er8Var.addView(this.H5, er8Var.indexOfChild(this.Z), tre.e(-1, 0, 48));
        this.glassEngine.b(this.a);
        this.O.setPagesGlassEngine(this.glassEngine);
        this.O.setOnTopPanelShiftChanged(new y56(this, (byte) 21));
        z1();
        T3();
    }

    public final void C1() {
        if (this.f6 != null) {
            ValueAnimator valueAnimator = this.k2;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.k2.cancel();
            }
            float l = Utilities.l(this.Q1 / this.F1);
            if (l > 0.0f) {
                float f = (l - 0.5f) / 0.5f;
                float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? hl.m : 0)) - hl.L(21.0f));
                this.c2 = hl.R1(0.42f, this.f6[0], l);
                this.a2 = hl.R1(this.k6, this.f6[1], l);
                this.b2 = hl.R1(translationY, this.f6[2], l);
                this.d2 = hl.R1(this.f6[11], 0.0f, l);
                this.Y.setScaleX(this.c2);
                this.Y.setScaleY(this.c2);
                this.Y.setTranslationX(this.a2);
                this.Y.setTranslationY(this.b2);
                jva jvaVar = this.T;
                if (jvaVar != null) {
                    jvaVar.setAlpha(l);
                }
                this.f0.setAlpha(1.0f);
                this.Y.setAlpha(1.0f);
                lq8 lq8Var = this.v0;
                if (lq8Var != null) {
                    lq8Var.invalidate();
                }
                gu8 gu8Var = this.w0;
                if (gu8Var != null) {
                    gu8Var.e = hl.R1(0.0f, this.f6[4], f);
                    this.w0.f = hl.R1(0.0f, this.f6[5], l);
                    gu8 gu8Var2 = this.w0;
                    gu8Var2.h = true;
                    gu8Var2.invalidate();
                }
                gs8 gs8Var = this.F6;
                if (gs8Var != null) {
                    gs8Var.setAlpha((int) hl.R1(0.0f, this.f6[6], l));
                }
                float L = (((this.c2 * 100.0f) / 42.0f) * hl.L(42.0f)) - hl.L(42.0f);
                this.i0.setTranslationX(this.Y.getX() + hl.L(16.0f) + L);
                this.i0.setTranslationY(this.Y.getY() + hl.L(-10.0f) + L);
                this.j0.setTranslationX(this.Y.getX() + hl.L(28.0f) + L);
                this.j0.setTranslationY(this.Y.getY() + hl.L(26.5f) + L);
                this.k0.setTranslationX(this.Y.getX() + hl.L(28.0f) + L);
                this.k0.setTranslationY(this.Y.getY() + hl.L(24.0f) + L);
                this.l0.setTranslationX(this.Y.getX() + hl.L(28.0f) + L);
                this.l0.setTranslationY(this.Y.getY() + hl.L(24.0f) + L);
                float R1 = hl.R1(j2(0), this.f6[7], l);
                float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? hl.m : 0)) - (hl.p * 21.0f)))) + hl.L(1.3f);
                float N = hl.N(22.7f) + floor;
                this.f2 = hl.R1(floor, this.f6[8], l);
                this.h2 = hl.R1(N, this.f6[9], l);
                float L2 = (this.k6 - hl.L(109.0f)) + hl.L(48.0f);
                float R12 = hl.R1(k2(L2, 0, this.f), this.f6[12], l);
                float R13 = hl.R1(k2(L2 + this.u5, 1, this.r) - this.u5, this.f6[13], l);
                this.f.setTranslationX(R12);
                this.f.setTranslationY(this.f2);
                this.r.setTranslationX(this.u5 + R13);
                this.r.setTranslationY(this.h2);
                this.e2 = R12;
                this.g2 = R13;
                this.f.setScaleX(R1);
                this.f.setScaleY(R1);
                float R14 = hl.R1(j2(1), 1.0f, l);
                this.r.setScaleX(R14);
                this.r.setScaleY(R14);
                K3();
                Q3(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? hl.m : 0));
                P2((int) this.f6[10], l, true);
                ap8 ap8Var = this.a0;
                if (ap8Var != null) {
                    ap8Var.setAlpha(hl.R1(0.0f, this.f6[3], f));
                }
            }
        }
    }

    public final /* synthetic */ void C2(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.J2 = fileLocation;
            this.K2 = photoSize2.location;
            this.f0.m(jn5.e(fileLocation), "50_50", this.q0, null);
            if (this.P2 != -1) {
                f4();
                wr8 wr8Var = this.d;
                if (wr8Var != null) {
                    wr8Var.f();
                }
                O2(true);
            }
            jq8 jq8Var = this.o0;
            jn5 e = jn5.e(this.K2);
            this.L2 = e;
            jq8Var.A(e, jn5.e(this.J2));
            C3(true, false);
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
            this.p6 = getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ol7(this, str, (byte) 14));
        }
        this.actionBar.u().requestLayout();
    }

    public final void C3(boolean z, boolean z2) {
        if (this.h0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.g0 = null;
        }
        if (!z2) {
            vb5 vb5Var = this.h0;
            if (z) {
                vb5Var.setAlpha(1.0f);
                this.h0.setVisibility(0);
                return;
            } else {
                vb5Var.setAlpha(0.0f);
                this.h0.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.g0 = animatorSet2;
        vb5 vb5Var2 = this.h0;
        byte b = 1;
        if (z) {
            vb5Var2.setVisibility(0);
            this.g0.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<vb5, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(vb5Var2, (Property<vb5, Float>) View.ALPHA, 0.0f));
        }
        this.g0.setDuration(180L);
        this.g0.addListener(new xq8(this, z, b));
        this.g0.start();
    }

    public final float D1() {
        return Utilities.l((this.Q1 - X1()) / e2());
    }

    public final void D2(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            v21 Q = d31.b0(this).Q(R.raw.contact_check, 36, ob6.M0(2131746585, null));
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
            bs2.v(null, 2131743534, d31.b0(this), R.raw.error, 36);
            return;
        }
        if (getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
            String M0 = ob6.M0(2131746581, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131746582, null);
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
            showDialog(idVar);
        }
    }

    public final void D3() {
        nx0 nx0Var;
        ax0 ax0Var;
        int i;
        TextView[] textViewArr;
        final byte b;
        Activity parentActivity = getParentActivity();
        final TLRPC.UserFull userFull = this.w2;
        if (userFull == null || userFull.stars_rating == null) {
            return;
        }
        byte b2 = 0;
        vnb vnbVar = null;
        nx0 i2 = ik8.i(getParentActivity(), false, 1, null);
        ax0 ax0Var2 = i2.y0;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        final LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), R.drawable.filled_rating_crown, 0, 0, this.A0);
        limitPreviewView.setHideNegativeValues(a() != yac.h(this.currentAccount).e());
        limitPreviewView.setStarRating(userFull.stars_rating);
        limitPreviewView.setTranslationY(-hl.L(14.0f));
        linearLayout.addView(limitPreviewView, tre.t(-1, -2, 17, 0, 20, 0, 10));
        if (userFull.stars_my_pending_rating != null) {
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            linearLayout.addView(frameLayout, tre.t(-1, -2, 17, 40, -12, 40, 20));
            int i3 = 2;
            p66[] p66VarArr = new p66[2];
            int i4 = 0;
            while (i4 < i3) {
                int i5 = i3;
                byte b3 = b2;
                b21 b21Var = new b21(parentActivity, vnbVar, (byte) 7);
                p66VarArr[i4] = b21Var;
                b21Var.setGravity(17);
                p66VarArr[i4].setTextSize(1, 12.0f);
                yob.X(p66VarArr[i4], aob.y6, null);
                yob.G(p66VarArr[i4], aob.Xc, null);
                frameLayout.addView(p66VarArr[i4], tre.e(-1, -1, jn7.D1));
                p66VarArr[i4].setAlpha(i4 == 0 ? 1.0f : 0.0f);
                p66VarArr[i4].setScaleX(i4 == 0 ? 1.0f : 0.8f);
                p66VarArr[i4].setScaleY(i4 == 0 ? 1.0f : 0.8f);
                i4++;
                i3 = i5;
                b2 = b3;
            }
            final byte b4 = b2;
            int i6 = i3;
            final ii7 ii7Var = new ii7(p66VarArr, (byte) 20);
            byte b5 = a() == yac.h(this.currentAccount).e() ? (byte) 1 : b4;
            long j = userFull.stars_rating.stars;
            TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
            byte b6 = b5;
            long j2 = (-j) - (tl_starsRating != null ? tl_starsRating.stars - j : 0L);
            int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) / 86400);
            long j3 = userFull.stars_my_pending_rating.stars;
            long j4 = userFull.stars_rating.stars;
            long j5 = j3 - j4;
            if ((j4 >= 0 || b6 != 0) && (b6 == 0 || j2 <= 0)) {
                nx0Var = i2;
                textViewArr = p66VarArr;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String H = ob6.H(',', "StarRatingFuture", max);
                String H2 = ob6.H(',', "StarRatingFuturePendingPoints", (int) j5);
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[b4] = H;
                charSequenceArr[1] = "\n";
                charSequenceArr[i6] = H2;
                spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                spannableStringBuilder.append((CharSequence) " ");
                ax0Var = ax0Var2;
                spannableStringBuilder.append((CharSequence) hl.D2(hl.N2(ob6.M0(2131744843, null), -1, i6, new Runnable() { // from class: rp8
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b7 = b4;
                        ii7 ii7Var2 = ii7Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (b7) {
                            case 0:
                                RectF rectF = ProfileActivity.Z6;
                                limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                ii7Var2.a(Boolean.TRUE);
                                break;
                            default:
                                RectF rectF2 = ProfileActivity.Z6;
                                limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                ii7Var2.a(Boolean.FALSE);
                                break;
                        }
                    }
                }, null), true));
                b = b4;
                textViewArr[b4].setOnClickListener(new View.OnClickListener() { // from class: sp8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b7 = b;
                        ii7 ii7Var2 = ii7Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (b7) {
                            case 0:
                                RectF rectF = ProfileActivity.Z6;
                                limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                ii7Var2.a(Boolean.TRUE);
                                break;
                            default:
                                RectF rectF2 = ProfileActivity.Z6;
                                limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                ii7Var2.a(Boolean.FALSE);
                                break;
                        }
                    }
                });
                textViewArr[b].setText(spannableStringBuilder);
            } else {
                textViewArr = p66VarArr;
                nx0Var = i2;
                yob.X(p66VarArr[b4], aob.q7, null);
                if (b6 != 0) {
                    textViewArr[b4].setText(hl.S2(ob6.H(',', "StarRatingLevelNegativeYou", (int) j2)));
                } else {
                    TextView textView = textViewArr[b4];
                    Object[] objArr = new Object[1];
                    objArr[b4] = wf3.k(yac.t0, a());
                    textView.setText(hl.S2(ob6.a0(null, null, 2131744829, objArr)));
                }
                ax0Var = ax0Var2;
                b = b4;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String H3 = ob6.H(',', "StarRatingFuturePreview1", max);
            String H4 = ob6.H(',', "StarRatingFuturePreview2", (int) j5);
            CharSequence[] charSequenceArr2 = new CharSequence[3];
            charSequenceArr2[b] = H3;
            final byte b7 = 1;
            charSequenceArr2[1] = "\n";
            charSequenceArr2[2] = H4;
            spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append((CharSequence) hl.D2(hl.N2(ob6.M0(2131744842, null), -1, 2, new Runnable() { // from class: rp8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b72 = b7;
                    ii7 ii7Var2 = ii7Var;
                    TLRPC.UserFull userFull2 = userFull;
                    LimitPreviewView limitPreviewView2 = limitPreviewView;
                    switch (b72) {
                        case 0:
                            RectF rectF = ProfileActivity.Z6;
                            limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            ii7Var2.a(Boolean.TRUE);
                            break;
                        default:
                            RectF rectF2 = ProfileActivity.Z6;
                            limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                            ii7Var2.a(Boolean.FALSE);
                            break;
                    }
                }
            }, null), true));
            textViewArr[1].setOnClickListener(new View.OnClickListener() { // from class: sp8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b72 = b7;
                    ii7 ii7Var2 = ii7Var;
                    TLRPC.UserFull userFull2 = userFull;
                    LimitPreviewView limitPreviewView2 = limitPreviewView;
                    switch (b72) {
                        case 0:
                            RectF rectF = ProfileActivity.Z6;
                            limitPreviewView2.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            ii7Var2.a(Boolean.TRUE);
                            break;
                        default:
                            RectF rectF2 = ProfileActivity.Z6;
                            limitPreviewView2.d(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                            ii7Var2.a(Boolean.FALSE);
                            break;
                    }
                }
            });
            textViewArr[1].setText(spannableStringBuilder2);
        } else {
            nx0Var = i2;
            ax0Var = ax0Var2;
        }
        TextView textView2 = new TextView(parentActivity);
        textView2.setTypeface(hl.o());
        textView2.setGravity(17);
        textView2.setText(ob6.M0(2131744824, null));
        textView2.setTextSize(1, 20.0f);
        int i7 = aob.G6;
        yob.X(textView2, i7, this.A0);
        linearLayout.addView(textView2, tre.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView3 = new TextView(parentActivity);
        textView3.setGravity(17);
        if (userFull.id == yac.h(this.currentAccount).e()) {
            textView3.setText(hl.S2(ob6.M0(2131744825, null)));
            i = 1;
        } else {
            i = 1;
            uh9.r(null, null, 2131744855, new Object[]{wf3.k(yac.t0, a())}, textView3);
        }
        textView3.setTextSize(i, 14.0f);
        yob.X(textView3, i7, this.A0);
        linearLayout.addView(textView3, tre.t(-1, -2, 17, 20, 0, 20, 12));
        yk8 yk8Var = new yk8(parentActivity, this.A0);
        yk8Var.a.l(ob6.M0(2131744823, null), false);
        String M0 = ob6.M0(2131744858, null);
        int i8 = aob.Fi;
        yk8Var.b.setText(ob6.V(null, null, 2131744854, P1(M0, i8, this.A0)));
        yk8Var.d.setVisibility(8);
        ImageView imageView = yk8Var.c;
        imageView.setImageResource(R.drawable.menu_gift);
        vnb vnbVar2 = this.A0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        yob.s(imageView, i7, vnbVar2, mode);
        linearLayout.addView(yk8Var, tre.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        yk8 yk8Var2 = new yk8(parentActivity, this.A0);
        yk8Var2.a.l(ob6.M0(2131744822, null), false);
        yk8Var2.b.setText(ob6.V(null, null, 2131744853, P1(ob6.M0(2131744858, null), i8, this.A0)));
        yk8Var2.d.setVisibility(8);
        ImageView imageView2 = yk8Var2.c;
        imageView2.setImageResource(R.drawable.menu_stars_gift);
        yob.s(imageView2, i7, this.A0, mode);
        linearLayout.addView(yk8Var2, tre.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        yk8 yk8Var3 = new yk8(parentActivity, this.A0);
        yk8Var3.a.l(ob6.M0(2131744821, null), false);
        String M02 = ob6.M0(2131744856, null);
        int f = aob.I.o() ? vm2.f(0.25f, aob.v0(aob.m6, this.A0), -16777216) : aob.v0(aob.y6, this.A0);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(M02);
        zq8 zq8Var = new zq8(9);
        zq8Var.w = M02;
        if (zq8Var.c != null) {
            zq8Var.c = null;
            zq8Var.a();
        }
        zq8Var.f = f;
        zq8Var.n = false;
        spannableStringBuilder3.setSpan(zq8Var, 0, spannableStringBuilder3.length(), 0);
        yk8Var3.b.setText(ob6.V(null, null, 2131744852, spannableStringBuilder3));
        yk8Var3.d.setVisibility(8);
        ImageView imageView3 = yk8Var3.c;
        imageView3.setImageResource(R.drawable.menu_refund);
        yob.s(imageView3, i7, this.A0, mode);
        linearLayout.addView(yk8Var3, tre.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        c51 c51Var = new c51(this.A0, parentActivity, true);
        c51Var.setOnClickListener(new xy(ax0Var, (byte) 1));
        c51Var.i(wua.l2(ob6.M0(2131743543, null)), false, true);
        linearLayout.addView(c51Var, tre.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        nx0 nx0Var2 = nx0Var;
        nx0Var2.O = linearLayout;
        nx0Var2.show();
    }

    @Override // oj3
    public final boolean E() {
        return false;
    }

    public final void E1() {
        this.b2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? hl.m : 0)) - hl.L(21.0f));
        this.c2 = 1.38f;
        this.d2 = 0.0f;
        W1();
        h3();
        P2(0, 1.0f, true);
        this.e2 = (this.a.getMeasuredWidth() / 2.0f) - (((this.f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin);
        this.g2 = (this.a.getMeasuredWidth() / 2.0f) - ((this.r.getExactWidth() * 0.5f) + (((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin + (this.v5 ? 0 : this.r.getPaddingLeft())));
        this.C6 = this.v5 ? 0.0f : this.r.getPaddingLeft();
        if (this.J1 != 2) {
            this.v0.setAlpha(1.0f);
        }
        this.Y.setAlpha(1.0f);
        this.f0.setAlpha(1.0f);
    }

    public final boolean E2(boolean[] zArr, boolean z, org.telegram.ui.ActionBar.e eVar, TLRPC.TL_error tL_error) {
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        uc7.s1(this.currentAccount).W3.edit().putLong("dialog_join_requested_time_" + this.i1, System.currentTimeMillis()).commit();
        Activity parentActivity = getParentActivity();
        boolean z2 = xc2.T(this.F2) && !this.F2.megagroup;
        int i = jw5.t1;
        jw5.F0(parentActivity, this, d31.b0(this), z2);
        if (!z || this.P4 != -1) {
            f4();
            wr8 wr8Var = this.d;
            if (wr8Var != null) {
                wr8Var.f();
            }
        }
        if (eVar instanceof zu1) {
            ((zu1) eVar).Wb(false, true);
        }
        return false;
    }

    public final void E3() {
        Long l;
        if (this.T5 != null) {
            return;
        }
        d1a[] d1aVarArr = new d1a[1];
        Rect rect = hl.Q;
        ns1 ns1Var = this.f;
        if (ns1Var != null) {
            Drawable rightDrawable = ns1Var.getRightDrawable();
            ns1 ns1Var2 = this.f;
            if (rightDrawable == null) {
                rect.set(ns1Var2.getWidth() - 1, (this.f.getHeight() / 2) - 1, this.f.getWidth() + 1, (this.f.getHeight() / 2) + 1);
            } else {
                rect.set(ns1Var2.getRightDrawable().getBounds());
                rect.offset((int) ((this.f.getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) this.f.getX(), (int) this.f.getY());
            }
        }
        int i = this.f.getScaleX() < 1.5f ? 16 : 32;
        int L = (-(this.Z.getHeight() - rect.centerY())) - hl.L(i);
        float L2 = hl.L(324.0f);
        Point point = hl.q;
        int min = (int) Math.min(L2, point.x * 0.95f);
        int centerX = rect.centerX();
        int b = ete.b(centerX - (min / 2), 0, point.x - min);
        qq8 qq8Var = new qq8(this, this, getParentActivity(), Integer.valueOf(Math.max(0, centerX - b)), this.F2 == null ? 0 : 9, this.A0, i, d1aVarArr);
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e1));
        if (X1 != null) {
            qq8Var.setExpireDateHint(wf3.g(X1.emoji_status));
        }
        Long l2 = this.F;
        if (l2 != null) {
            qq8Var.setSelected(l2);
        } else {
            ul ulVar = this.G;
            if (ulVar != null) {
                Drawable drawable = ulVar.f[0];
                if (drawable instanceof wl) {
                    l = Long.valueOf(((wl) drawable).h());
                    qq8Var.setSelected(l);
                }
            }
            l = null;
            qq8Var.setSelected(l);
        }
        qq8Var.setSaveState(3);
        qq8Var.y(this.G, this.f);
        rq8 rq8Var = new rq8(this, qq8Var);
        this.T5 = rq8Var;
        d1aVarArr[0] = rq8Var;
        int[] iArr = new int[2];
        ns1 ns1Var3 = this.f;
        if (ns1Var3 != null) {
            ns1Var3.getLocationOnScreen(iArr);
        }
        d1aVarArr[0].showAsDropDown(this.fragmentView, b, L, 51);
        d1aVarArr[0].a();
    }

    public final void F2(TLRPC.User user, String str, boolean z, boolean z2) {
        sjb.c(getParentActivity(), this.currentAccount, a(), user, str, z, z2, this.A0);
    }

    public final void F3() {
        int i = 0;
        this.O.L0.setReordering(false);
        gr8 gr8Var = this.O;
        bha bhaVar = gr8Var.L0;
        if (gr8Var.y1 != null && bhaVar != null) {
            boolean m0 = gr8Var.m0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = bhaVar.getTabIds();
            int size = tabIds.size();
            while (i < size) {
                Integer num = tabIds.get(i);
                i++;
                TLRPC.ProfileTab Y = eja.Y(num.intValue(), m0);
                if (Y != null) {
                    arrayList.add(Y);
                }
            }
        }
        this.O.N1(true);
        this.E5.animate().translationY(hl.L(69.0f)).setDuration(180L).setInterpolator(k43.h).withEndAction(new y56(this, (byte) 16)).start();
        d31.b0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    public final void G1() {
        f89 f89Var;
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
                    if (RecyclerView.S(this.a.getChildAt(i)) == 0) {
                        view = this.a.getChildAt(i);
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                zp8 zp8Var = this.a;
                View G = zp8Var.G(view);
                f89Var = (n69) (G != null ? zp8Var.U(G) : null);
            }
            int top = view == null ? 0 : view.getTop();
            int i2 = (top < 0 || (f89Var != null ? f89Var.b() : -1) != 0) ? 0 : top;
            float a = view == null ? 1.0f : ete.a((-top) / hl.L(12.0f), 0.0f, 1.0f);
            if (this.R5 != a) {
                this.R5 = a;
                V3();
            }
            byte b = 1;
            boolean z = this.r0 == null && this.actionBar.o0;
            int i3 = this.N4;
            if (i3 != -1 && !z) {
                n69 n69Var = (n69) this.a.L(i3);
                z = n69Var != null && n69Var.a.getTop() <= 0;
            }
            if (this.X5 != z) {
                this.X5 = z;
                H1();
                AnimatorSet animatorSet = this.U5;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = this.V5;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                X3(true);
                d4();
                i4(false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this.actionBar, this.Y5, z ? 1.0f : 0.0f));
                this.O.L0.setOpen(z);
                if (z) {
                    arrayList.add(ObjectAnimator.ofFloat(this, this.p5, 0.0f));
                }
                if (this.v0 != null || this.w0 != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new op8(this, b));
                    arrayList.add(ofFloat);
                }
                J1();
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.U5 = animatorSet3;
                animatorSet3.playTogether(arrayList);
                this.U5.setInterpolator(k43.f);
                this.U5.addListener(new mq8(this, b));
                this.U5.setDuration(150L);
                this.U5.start();
                jn7.e().k(jn7.u4, Boolean.TRUE);
            }
            float f = i2;
            if (this.Q1 == f || this.H1) {
                return;
            }
            this.Q1 = f;
            this.d1.invalidate();
            if (this.J1 != 0) {
                this.M1 = this.Q1 > ((float) X1());
            }
            O2(true);
        }
    }

    public final /* synthetic */ void G2() {
        uc7.s1(this.currentAccount).j0(null);
        this.V.H(0);
        this.W.H(0);
    }

    public final void G3() {
        if (!this.q2) {
            kq8 kq8Var = this.r;
            if (kq8Var != null) {
                Object tag = kq8Var.getTag();
                boolean z = tag instanceof Integer;
                kq8 kq8Var2 = this.r;
                if (z) {
                    kq8Var2.setTextColor(A1(aob.v0(((Integer) tag).intValue(), this.A0), Boolean.valueOf(this.K0[0])));
                } else {
                    kq8Var2.setTextColor(A1(aob.v0(aob.B8, this.A0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.x;
            if (drawable != null) {
                drawable.setColorFilter(this.n6 != null ? -1 : aob.v0(aob.gd, this.A0), PorterDuff.Mode.MULTIPLY);
            }
            yt9 yt9Var = this.L;
            if (yt9Var != null) {
                yt9Var.b(aob.v0(aob.h8, this.A0));
            }
            ns1 ns1Var = this.f;
            if (ns1Var != null) {
                ns1Var.setTextColor(aob.v0(aob.mi, this.A0));
            }
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null) {
                aVar.H(this.n6 == null ? aob.v0(aob.v8, this.A0) : -1, false);
                this.actionBar.G(this.n6 != null ? 553648127 : aob.v0(aob.f8, this.A0), false);
            }
        }
        M3();
        m4();
    }

    @Override // yn5
    public final void H(float f) {
        vb5 vb5Var = this.h0;
        if (vb5Var == null) {
            return;
        }
        vb5Var.setProgress(f);
        this.o0.O(this.L2, f);
    }

    public final void H1() {
        gr8 gr8Var = this.O;
        if (gr8Var != null) {
            gr8Var.setPagesVisibleOverscanTop((this.X5 || this.W5 > 0.0f) ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0);
        }
    }

    public final void H2(TLRPC.User user) {
        if (this.a4 >= 0) {
            if (this.N4 == -1) {
                f4();
                this.d.f();
            } else {
                Z3(false, false);
            }
        }
        if (this.N4 == -1) {
            if (this.o2 || hl.O1()) {
                this.a.setPadding(0, d2(), 0, 0);
                this.k2.cancel();
                float[] fArr = this.n2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                o3(1.0f);
                this.Q1 = d2();
            } else {
                int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? hl.m : 0);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.a.getMeasuredWidth(), TLObject.FLAG_30);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.a.getMeasuredHeight(), 0);
                int i = 0;
                int i2 = 0;
                while (true) {
                    wr8 wr8Var = this.d;
                    if (i >= wr8Var.e.O2) {
                        break;
                    }
                    f89 a = wr8Var.a(null, wr8Var.d(i));
                    View view = a.a;
                    this.d.t(a, i);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i2 += view.getMeasuredHeight();
                    i++;
                }
                int max = Math.max(0, this.fragmentView.getMeasuredHeight() - ((d2() + i2) + currentActionBarHeight));
                zp8 zp8Var = this.a;
                zp8Var.setPadding(0, zp8Var.getPaddingTop(), 0, max);
            }
        }
        this.M.m(this.i1, user, 8);
    }

    public final void H3() {
        d26 d26Var;
        if (this.a0 == null || this.r == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? hl.m : 0);
        ap8 ap8Var = this.a0;
        boolean z = this.G1;
        ap8Var.e = z;
        if (z && this.J1 == 2 && (d26Var = this.Y) != null) {
            this.a0.f = this.Y.getY() + (this.Y.getScaleY() * d26Var.getHeight());
            this.a0.setAlpha(this.T1);
            ap8 ap8Var2 = this.a0;
            float measuredWidth = this.a.getMeasuredWidth();
            ap8Var2.x = hl.L(74.0f);
            ap8Var2.setTranslationY(measuredWidth);
            ap8Var2.invalidate();
        } else {
            ap8Var.f = -1.0f;
            float f = currentActionBarHeight;
            float L = (this.Q1 + f) - hl.L((this.L4 || this.M4) ? 25.0f : 0.0f);
            float min = Math.min(hl.L(74.0f), L - f);
            ap8 ap8Var3 = this.a0;
            ap8Var3.x = min;
            ap8Var3.setTranslationY(L - min);
            ap8Var3.invalidate();
        }
        ImageView imageView = this.P0;
        if (imageView == null || imageView.getTag() == null) {
            return;
        }
        this.a0.getClass();
        if (this.P0.getVisibility() == 0) {
            this.P0.setVisibility(8);
        }
        if (this.P0.getTag() instanceof s7) {
            ((s7) this.P0.getTag()).setAlpha(1.0f);
        }
    }

    @Override // tha
    public final void I() {
        k3(false);
    }

    public final void I1() {
        byte b = this.J1;
        float f = 0.0f;
        if (b == 1 && (!this.r5 || this.G1)) {
            this.x6 = 0.0f;
        } else if (b != 2 || (this.r5 && !this.G1)) {
            long j = this.e1;
            long j2 = yac.h(this.currentAccount).n;
            float f2 = this.l2;
            float f3 = this.t5;
            if (j == j2) {
                this.x6 = (1.0f - f3) * f2;
            } else {
                this.x6 = f2 * f3;
            }
        } else {
            kq8 kq8Var = this.r;
            this.x6 = kq8Var == null ? 0.0f : kq8Var.getAlpha();
        }
        boolean z = this.e1 == yac.h(this.currentAccount).n;
        if (z && this.v5) {
            this.u5 = hl.L(28.0f) * this.x6;
            kq8 kq8Var2 = this.r;
            if (kq8Var2 != null) {
                kq8Var2.setTranslationX(g2(this.B6, this.D6));
                this.Z.invalidate();
            }
        }
        if (z) {
            if (this.v5) {
                f = this.l2;
            }
        } else if (this.w5) {
            f = this.x6;
        }
        gs8 gs8Var = this.F6;
        if (gs8Var != null) {
            gs8Var.e = 1.0f - f;
            gs8Var.invalidateSelf();
        }
        this.A6 = f > 0.5f;
        d4();
    }

    public final void I2(ValueAnimator valueAnimator, float f, boolean z) {
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
        O2(true);
        this.a.setAlpha(f2);
        this.b.setAlpha(1.0f - this.V1);
        this.b.setScaleX((this.V1 * 0.05f) + 1.0f);
        this.b.setScaleY((this.V1 * 0.05f) + 1.0f);
        this.P.setAlpha(1.0f - f2);
        this.Y.setAlpha(f2);
        this.f0.setAlpha(f2);
        lq8 lq8Var = this.v0;
        if (lq8Var != null) {
            lq8Var.setAlpha(f2);
        }
        this.f.setAlpha(f2);
        this.r.setAlpha(this.X5 ? 0.0f : f2);
        this.U0.getSearchField().setAlpha(f3);
        if (z && this.V1 < 0.7f) {
            sla slaVar = this.U0;
            if (slaVar.G.getWidth() != 0 && !slaVar.e.isFocused()) {
                slaVar.e.requestFocus();
                hl.E3(slaVar.e);
            }
        }
        this.U0.getSearchContainer().setVisibility(this.V1 < 0.5f ? 0 : 8);
        int i = this.V1 > 0.5f ? 0 : 8;
        sla slaVar2 = this.T0;
        if (slaVar2 != null) {
            slaVar2.setVisibility(i);
            this.T0.setAlpha(f2);
        }
        this.U0.setVisibility(i);
        this.actionBar.C(this.V1 < 0.5f);
        sla slaVar3 = this.T0;
        if (slaVar3 != null) {
            slaVar3.setAlpha(f2);
        }
        this.U0.setAlpha(f2);
        this.d1.invalidate();
        this.fragmentView.invalidate();
    }

    public final void I3() {
        if (this.Z0 == null || this.a1 == null) {
            return;
        }
        TLRPC.UserFull userFull = this.w2;
        int i = (userFull == null && this.v2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.v2.ttl_period;
        this.t0.b(i);
        this.a1.B(i);
    }

    public final void J1() {
        jva jvaVar = this.T;
        if (jvaVar != null) {
            jvaVar.setVisibility(!this.X5 && this.d6);
        }
    }

    public final void J2() {
        u57.b(getParentActivity(), this.currentAccount, a(), true, null, new y56(this, (byte) 23), this.A0);
    }

    public final void J3() {
        if (this.y5 != null) {
            gr8 gr8Var = this.O;
            boolean z = ((gr8Var == null || !gr8Var.isAttachedToWindow()) ? (float) hl.L(72.0f) : ((float) hl.L(232.0f)) - (((float) this.a.getMeasuredHeight()) - this.O.getY())) <= 0.0f;
            fm0 fm0Var = this.S5;
            fm0Var.a(z, true);
            float f = fm0Var.e;
            this.y5.setTranslationY(hl.U1(f, hl.L(60.0f), 0));
            this.y5.setAlpha(f);
            this.y5.setVisibility(f <= 0.0f ? 4 : 0);
            v21 v21Var = v21.x;
            if (v21Var != null) {
                v21Var.l();
            }
        }
    }

    public final void K1(int i) {
        boolean t0 = eja.t0(this.O.getClosestTab());
        if (i == this.L6 && t0 == this.M6) {
            return;
        }
        this.L6 = i;
        this.M6 = t0;
        if (t0) {
            c51[] c51VarArr = this.C5;
            if (i > 0) {
                c51VarArr[0].i(ob6.G(i, "HideStoriesFromAlbum", new Object[0]), true, true);
                return;
            } else {
                c51VarArr[0].i(this.B5, true, true);
                return;
            }
        }
        if (i > 0 || !uc7.s1(this.currentAccount).k5()) {
            this.C5[0].i(ob6.G(i, "ArchiveStories", new Object[0]), true, true);
        } else {
            this.C5[0].i(this.A5, true, true);
        }
    }

    public final void K2(TLRPC.EmojiStatus emojiStatus, TLRPC.User user, ns1 ns1Var) {
        jn5 b;
        String str;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            m01.u(getParentActivity(), "https://" + getMessagesController().N2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        kl8 kl8Var = new kl8(this, this.currentAccount, user, null, null, this.A0);
        ns1Var.getLocationOnScreen(new int[2]);
        kl8Var.q2 = ns1Var.i0;
        kl8Var.r2 = ns1Var.j0;
        kl8Var.u2 = ns1Var.getScaleX();
        kl8Var.s2 = ns1Var.getLeft();
        kl8Var.t2 = ns1Var.getTop();
        kl8Var.v2 = ns1Var;
        Drawable rightDrawable = ns1Var.getRightDrawable();
        ul ulVar = this.G;
        if (rightDrawable == ulVar && ulVar != null) {
            Drawable drawable = ulVar.f[0];
            if (drawable instanceof wl) {
                kl8Var.u2 *= 0.98f;
                TLRPC.Document document = ((wl) drawable).e;
                if (document != null) {
                    de0 de0Var = new de0(getParentActivity());
                    ggb d = lp3.d(document.thumbs, aob.m6, 0.2f, false);
                    TLRPC.PhotoSize w = xb4.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b = jn5.b(document);
                        if (d != null) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str = "160_160_g";
                    } else {
                        if (d != null && r47.K2(document, false)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        b = jn5.b(document);
                        str = "160_160";
                    }
                    jn5 jn5Var = b;
                    String str2 = str;
                    de0Var.setLayerNum(7);
                    de0Var.setRoundRadius(hl.L(4.0f));
                    de0Var.j(jn5Var, str2, jn5.c(w, document), "140_140", d, document);
                    if (((wl) this.G.f[0]).c()) {
                        de0Var.setColorFilter(new PorterDuffColorFilter(aob.v0(aob.v6, this.A0), PorterDuff.Mode.SRC_IN));
                        kl8Var.x2 = r47.i1(document);
                    } else {
                        kl8Var.x2 = r47.i1(document);
                    }
                    kl8Var.w2 = de0Var;
                    kl8Var.z2 = true;
                }
            }
        }
        showDialog(kl8Var);
    }

    public final void K3() {
        kg5 kg5Var = this.H6;
        if (kg5Var != null) {
            kg5Var.o(0.0f, (this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX() + (-kg5Var.getPaddingLeft()));
            float S1 = hl.S1(this.m2, this.n2);
            this.H6.setTranslationY(((this.f.getY() + (-r2.getPaddingBottom())) - hl.L(24.0f)) + hl.U1(S1, hl.L(6.0f), -hl.L(12.0f)));
            this.H6.i(vm2.f(S1, this.I6, 1342177280));
            boolean z = this.Q1 >= ((float) hl.L(82.0f));
            Boolean bool = this.J6;
            if (bool == null || bool.booleanValue() != z) {
                ViewPropertyAnimator animate = this.H6.animate();
                this.J6 = Boolean.valueOf(z);
                ik8.t(animate.alpha(z ? 1.0f : 0.0f), k43.g, 200L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x03cd, code lost:
    
        if (xc2.q0(r1, uc7.s1(r1).g4.f(r2.id, r13)) != false) goto L166;
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
    public final void L1(boolean z) {
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
        zn5 zn5Var;
        ap8 ap8Var;
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
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                this.p1 = false;
                if (this.g1 == 0 && xc2.w(1, M0)) {
                    M1(context);
                }
                if (xc2.T(M0)) {
                    if (this.q1) {
                        int i = this.currentAccount;
                        long j2 = this.g1;
                        if (!xc2.y(15, M0)) {
                            if (M0 != null && M0.forum) {
                            }
                        }
                        this.O0 = true;
                    } else if (xc2.N(M0) || (M0.megagroup && xc2.w(1, M0))) {
                        this.O0 = true;
                    }
                    if (this.v2 != null) {
                        if (xc2.w(14, M0) && this.v2.call == null) {
                            this.T0.e(15, R.drawable.msg_voicechat, (!M0.megagroup || M0.gigagroup) ? ob6.M0(2131744561, null) : ob6.M0(2131744559, null));
                            this.p1 = true;
                            if (!M0.megagroup || M0.gigagroup) {
                                z15 = false;
                                z12 = true;
                                chatFull2 = this.v2;
                                if ((!chatFull2.can_view_stats || chatFull2.can_view_revenue || chatFull2.can_view_stars_revenue || getMessagesController().O1().i(a())) && this.g1 == 0) {
                                    this.T0.e(19, R.drawable.msg_stats, ob6.M0(2131744549, null));
                                }
                                vc2 g1 = getMessagesController().g1(this.f1, false, null);
                                this.M0 = g1 == null;
                                z11 = g1 == null || z15;
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
                        this.T0.e(19, R.drawable.msg_stats, ob6.M0(2131744549, null));
                        vc2 g12 = getMessagesController().g1(this.f1, false, null);
                        this.M0 = g12 == null;
                        if (g12 == null) {
                        }
                    } else {
                        z11 = false;
                        z12 = false;
                    }
                    getMessagesController().O1();
                    if (M0 == null || !xc2.R(M0) || (!M0.creator && ((tL_chatAdminRights2 = M0.admin_rights) == null || !tL_chatAdminRights2.post_stories))) {
                        getMessagesController().O1();
                        if (M0 != null && xc2.R(M0) && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.edit_stories))) {
                            this.T0.e(39, R.drawable.msg_archive, ob6.M0(2131747537, null));
                        }
                        z13 = false;
                    } else {
                        this.T0.e(39, R.drawable.msg_archive, ob6.M0(2131747537, null));
                        z13 = true;
                    }
                    if (!M0.megagroup) {
                        if (xc2.t0(M0)) {
                            this.T0.e(10, R.drawable.msg_share, ob6.M0(2131752963, null));
                            z3 = !M0.creator;
                        } else {
                            z3 = false;
                        }
                        boolean z20 = f11.a;
                        if (getMessagesController().N3()) {
                            z14 = false;
                        } else {
                            jxa.v(this.currentAccount, false).U();
                            this.T0.e(38, R.drawable.msg_gift_premium, ob6.M0(2131746363, null));
                            sla slaVar = this.T0;
                            TLRPC.ChatFull chatFull3 = this.v2;
                            slaVar.Q(38, chatFull3 != null && chatFull3.stargifts_available);
                            z14 = true;
                        }
                        TLRPC.ChatFull chatFull4 = this.v2;
                        if (chatFull4 == null || chatFull4.linked_chat_id == 0) {
                            z6 = false;
                        } else {
                            this.T0.e(22, R.drawable.msg_discussion, ob6.M0(2131743207, null));
                            z6 = true;
                        }
                        if (this.g1 == 0) {
                            this.T0.e(14, R.drawable.msg_home, ob6.M0(2131754383, null));
                        }
                        TLRPC.Chat chat = this.F2;
                        if (chat.creator) {
                            this.T0.a(-1);
                            this.T0.e(7, R.drawable.msg_leave, ob6.M0(2131748758, null));
                            this.T0.e(45, R.drawable.msg_delete, ob6.M0(2131752396, null)).c(aob.q7, aob.p7);
                        } else if (chat.left || chat.kicked) {
                            z8 = z14;
                            z7 = z12;
                            z4 = z13;
                            z19 = false;
                            z5 = z11;
                        } else {
                            this.T0.e(7, R.drawable.msg_leave, ob6.M0(2131748758, null));
                        }
                        z8 = z14;
                        z7 = z12;
                        z4 = z13;
                        z19 = false;
                        z5 = z11;
                        z2 = true;
                        zn5Var = this.r0;
                        sla slaVar2 = this.T0;
                        if (zn5Var == null) {
                        }
                        if (q2()) {
                        }
                        if (this.e1 != 0) {
                            b8 e = this.T0.e(24, R.drawable.msg_report, ob6.M0(2131745958, null));
                            int i2 = aob.p7;
                            e.c(i2, i2);
                        }
                        if (z19) {
                            this.T0.e(31, R.drawable.msg_leave, ob6.M0(2131748497, null));
                        }
                        if (!this.q2) {
                        }
                        this.L0 = this.M0;
                        ap8Var = this.a0;
                        if (ap8Var == null) {
                        }
                        X3(z);
                        i4(z16);
                    }
                    TLRPC.ChatFull chatFull5 = this.v2;
                    if (chatFull5 == null || !chatFull5.participants_hidden || xc2.N(M0)) {
                        this.A1 = true;
                        this.T0.e(17, R.drawable.msg_search, ob6.M0(2131745485, null));
                    }
                    if (this.q1) {
                        int i3 = this.currentAccount;
                        long j3 = this.g1;
                        if (j3 != 1 && xc2.e(i3, M0, uc7.s1(i3).g4.f(M0.id, j3))) {
                            this.T0.e(23, R.drawable.msg_delete, ob6.J0(1, "DeleteTopics"));
                        }
                    }
                    if (this.g1 == 0) {
                        this.T0.e(14, R.drawable.msg_home, ob6.M0(2131754383, null));
                    }
                    if (M0.creator) {
                        this.T0.a(-1);
                        this.T0.e(7, R.drawable.msg_leave, ob6.M0(2131748745, null));
                        this.T0.e(45, R.drawable.msg_delete, ob6.M0(2131751495, null)).c(aob.q7, aob.p7);
                    } else if (M0.left || M0.kicked || this.q1) {
                        z7 = z12;
                        z4 = z13;
                        z3 = false;
                        z19 = false;
                        z6 = false;
                        z8 = false;
                        z5 = z11;
                    } else {
                        this.T0.e(7, R.drawable.msg_leave, ob6.M0(2131748745, null));
                    }
                    z7 = z12;
                    z4 = z13;
                    z3 = false;
                    z19 = false;
                    z6 = false;
                    z8 = false;
                    z5 = z11;
                    z2 = true;
                    zn5Var = this.r0;
                    sla slaVar22 = this.T0;
                    if (zn5Var == null) {
                        slaVar22.e(33, R.drawable.msg_openprofile, ob6.M0(2131745270, null));
                        this.T0.e(21, R.drawable.msg_gallery, ob6.M0(2131745657, null));
                        this.T0.e(35, R.drawable.msg_delete, ob6.M0(2131751563, null));
                    } else {
                        slaVar22.e(21, R.drawable.msg_gallery, ob6.M0(2131745657, null));
                    }
                    if (q2()) {
                        this.T0.u(21);
                    }
                    if (this.e1 != 0 && !this.s2 && !this.s1) {
                        b8 e2 = this.T0.e(24, R.drawable.msg_report, ob6.M0(2131745958, null));
                        int i22 = aob.p7;
                        e2.c(i22, i22);
                    }
                    if (z19 && !this.s1) {
                        this.T0.e(31, R.drawable.msg_leave, ob6.M0(2131748497, null));
                    }
                    if (!this.q2) {
                        this.T0.u(21);
                        this.T0.u(33);
                        this.T0.S(36);
                        this.T0.u(34);
                        this.T0.u(35);
                    }
                    this.L0 = this.M0;
                    ap8Var = this.a0;
                    if (ap8Var == null) {
                        ap8Var.G = true;
                        ap8Var.o(4, z3);
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
                                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.f1));
                                    if (xc2.c0(M02) || xc2.n0(M02)) {
                                        z16 = false;
                                        this.a0.o(0, true);
                                    } else if (!xc2.T(M02)) {
                                        z16 = false;
                                        this.a0.o(0, true);
                                    }
                                }
                                z16 = false;
                            }
                        }
                        ap8 ap8Var2 = this.a0;
                        if (ap8Var2.G) {
                            ap8Var2.G = z16;
                            ap8Var2.d();
                        }
                    } else {
                        z16 = false;
                    }
                    X3(z);
                    i4(z16);
                }
                if (this.v2 != null) {
                    if (xc2.w(14, M0) && this.v2.call == null) {
                        this.T0.e(15, R.drawable.msg_voicechat, ob6.M0(2131744559, null));
                        this.p1 = true;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vc2 g13 = getMessagesController().g1(this.f1, false, null);
                    this.M0 = g13 != null;
                    if (g13 != null || z10) {
                        z9 = true;
                        if (xc2.w(1, M0)) {
                            this.O0 = true;
                        }
                        if (!xc2.k0(M0) && !xc2.l0(M0) && ((chatFull = this.v2) == null || !chatFull.participants_hidden || xc2.N(M0))) {
                            this.A1 = true;
                            this.T0.e(17, R.drawable.msg_search, ob6.M0(2131745485, null));
                        }
                        if (this.g1 == 0) {
                            this.T0.e(14, R.drawable.msg_home, ob6.M0(2131754383, null));
                        }
                        this.T0.e(7, R.drawable.msg_leave, ob6.M0(2131751538, null));
                        z5 = z9;
                        z2 = true;
                        z3 = false;
                        z4 = false;
                    }
                }
                z9 = false;
                if (xc2.w(1, M0)) {
                }
                if (!xc2.k0(M0)) {
                    this.A1 = true;
                    this.T0.e(17, R.drawable.msg_search, ob6.M0(2131745485, null));
                }
                if (this.g1 == 0) {
                }
                this.T0.e(7, R.drawable.msg_leave, ob6.M0(2131751538, null));
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
            zn5Var = this.r0;
            sla slaVar222 = this.T0;
            if (zn5Var == null) {
            }
            if (q2()) {
            }
            if (this.e1 != 0) {
            }
            if (z19) {
            }
            if (!this.q2) {
            }
            this.L0 = this.M0;
            ap8Var = this.a0;
            if (ap8Var == null) {
            }
            X3(z);
            i4(z16);
        }
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e1));
        if (X1 == null) {
            return;
        }
        if (lbc.D(X1)) {
            if (this.s1) {
                ap8 ap8Var3 = this.a0;
                if (ap8Var3 != null) {
                    this.O0 = !(ap8Var3.F == 6);
                } else {
                    this.O0 = true;
                }
            }
            if (!this.J0) {
                this.T0.e(30, R.drawable.msg_edit, ob6.M0(2131751243, null));
                if (this.r0 != null) {
                    this.T0.e(36, R.drawable.msg_addphoto, ob6.M0(2131754385, null));
                }
            }
            this.V0 = this.T0.e(40, R.drawable.menu_profile_colors, ob6.M0(2131746407, null));
            L3();
            if (this.s1) {
                this.X0 = this.T0.e(43, R.drawable.menu_username_change, ob6.M0(2131746347, null));
                this.W0 = this.T0.e(42, R.drawable.msg_link2, ob6.M0(2131746406, null));
                Y3();
            }
            z17 = false;
            z18 = false;
        } else {
            if (X1.bot && X1.bot_can_edit) {
                this.O0 = true;
            }
            TLRPC.UserFull userFull = this.w2;
            if (userFull != null && userFull.phone_calls_available) {
                this.M0 = true;
                this.N0 = userFull.video_calls_available;
            }
            if (!this.s2 && getContactsController().g0.get(Long.valueOf(this.e1)) != null) {
                if (this.E2 == null) {
                    M1(context);
                }
                if (!TextUtils.isEmpty(X1.phone)) {
                    this.T0.e(3, R.drawable.msg_share, ob6.M0(2131745189, null));
                }
                this.T0.e(2, R.drawable.msg_block, !this.k1 ? ob6.M0(2131753686, null) : ob6.M0(2131743566, null));
                this.T0.e(4, R.drawable.msg_edit, ob6.M0(2131751247, null));
                this.T0.e(5, R.drawable.msg_delete, ob6.M0(2131751517, null));
            } else if (uc7.K2(X1)) {
                if (this.k1) {
                    this.T0.e(2, R.drawable.msg_block, ob6.M0(2131743566, null));
                }
                this.T0.e(14, R.drawable.msg_home, ob6.M0(2131754383, null));
            } else if (a() != 489000) {
                if (this.E2 == null) {
                    M1(context);
                }
                this.T0.e(14, R.drawable.msg_home, ob6.M0(2131754383, null));
                boolean z21 = this.s2;
                sla slaVar3 = this.T0;
                if (z21) {
                    slaVar3.e(10, R.drawable.msg_share, ob6.M0(2131752963, null));
                    z17 = true;
                } else {
                    slaVar3.e(1, R.drawable.msg_addcontact, ob6.M0(2131754446, null));
                    z17 = false;
                }
                if (!TextUtils.isEmpty(X1.phone)) {
                    this.T0.e(3, R.drawable.msg_share, ob6.M0(2131745189, null));
                }
                boolean z22 = this.s2;
                sla slaVar4 = this.T0;
                if (z22) {
                    slaVar4.e(44, R.drawable.menu_privacy_policy, ob6.M0(2131752994, null));
                    boolean o2 = o2();
                    sla slaVar5 = this.T0;
                    if (o2) {
                        slaVar5.S(44);
                    } else {
                        slaVar5.u(44);
                    }
                    b8 e3 = this.T0.e(24, R.drawable.msg_report, ob6.M0(2131745958, null));
                    int i4 = aob.p7;
                    e3.c(i4, i4);
                    boolean z23 = this.k1;
                    sla slaVar6 = this.T0;
                    if (z23) {
                        slaVar6.e(2, R.drawable.msg_retry, ob6.M0(2131752976, null));
                    } else {
                        slaVar6.e(2, R.drawable.msg_block2, ob6.M0(2131751539, null)).c(i4, i4);
                    }
                } else {
                    slaVar4.e(2, R.drawable.msg_block, !this.k1 ? ob6.M0(2131753686, null) : ob6.M0(2131743566, null));
                }
                if (!lbc.z(X1) && !this.s2 && this.E2 == null && !this.k1) {
                    j = this.e1;
                    if (j != 333000 && j != 777000 && j != 42777) {
                        boolean z24 = f11.a;
                        if (!X1.self || X1.bot || uc7.K2(X1) || getMessagesController().N3()) {
                            z18 = false;
                        } else {
                            jxa.v(this.currentAccount, false).U();
                            this.T0.e(38, R.drawable.msg_gift_premium, ob6.M0(2131746364, null));
                            z18 = true;
                        }
                        if (getMessagesController().k4.v0.f && !uc7.K2(X1) && !lbc.C(X1.id)) {
                            this.T0.e(48, R.drawable.ic_gram, ob6.M0(2131742648, null));
                        }
                        this.T0.e(20, R.drawable.msg_secret, ob6.M0(2131744569, null));
                        sla slaVar7 = this.T0;
                        TL_account.RequirementToContact P2 = getMessagesController().P2(this.e1);
                        slaVar7.Q(20, P2 != null || (P2 instanceof TL_account.requirementToContactEmpty));
                        if (this.w2 != null) {
                            this.T0.e(46, R.drawable.menu_share_off_24, ob6.M0(2131751393, null));
                            this.T0.e(47, R.drawable.menu_share_on_24, ob6.M0(2131751115, null));
                            TLRPC.UserFull userFull2 = this.w2;
                            boolean z25 = (userFull2.noforwards_my_enabled || userFull2.noforwards_peer_enabled) ? false : true;
                            this.T0.Q(46, z25);
                            this.T0.Q(47, !z25);
                        }
                        if (!this.s2 && getContactsController().g0.get(Long.valueOf(this.e1)) != null) {
                            this.T0.e(14, R.drawable.msg_home, ob6.M0(2131754383, null));
                        }
                        z19 = false;
                    }
                }
                z18 = false;
                if (!this.s2) {
                    this.T0.e(14, R.drawable.msg_home, ob6.M0(2131754383, null));
                }
                z19 = false;
            }
            z17 = false;
            if (!lbc.z(X1)) {
                j = this.e1;
                if (j != 333000) {
                    boolean z242 = f11.a;
                    if (X1.self) {
                    }
                    z18 = false;
                    if (getMessagesController().k4.v0.f) {
                        this.T0.e(48, R.drawable.ic_gram, ob6.M0(2131742648, null));
                    }
                    this.T0.e(20, R.drawable.msg_secret, ob6.M0(2131744569, null));
                    sla slaVar72 = this.T0;
                    TL_account.RequirementToContact P22 = getMessagesController().P2(this.e1);
                    slaVar72.Q(20, P22 != null || (P22 instanceof TL_account.requirementToContactEmpty));
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
        zn5Var = this.r0;
        sla slaVar2222 = this.T0;
        if (zn5Var == null) {
        }
        if (q2()) {
        }
        if (this.e1 != 0) {
        }
        if (z19) {
        }
        if (!this.q2) {
        }
        this.L0 = this.M0;
        ap8Var = this.a0;
        if (ap8Var == null) {
        }
        X3(z);
        i4(z16);
    }

    public final void L2(boolean z) {
        boolean c0 = xc2.c0(this.F2);
        TLRPC.Chat chat = this.F2;
        jj.r(this, false, chat, null, false, c0 || z || (chat != null && chat.creator), z, !c0, new bp8(this, (byte) 10));
    }

    public final void L3() {
        if (getParentActivity() == null || this.V0 == null) {
            return;
        }
        if (getUserConfig().p()) {
            this.V0.setIcon(R.drawable.menu_profile_colors);
            return;
        }
        Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
        drawable.setColorFilter(new PorterDuffColorFilter(aob.v0(aob.F8, this.A0), PorterDuff.Mode.SRC_IN));
        this.W6 = drawable;
        Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
        drawable2.setColorFilter(new PorterDuffColorFilter(vm2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.V0.setIcon(new c58(drawable, drawable2, hl.L(1.0f), -hl.L(1.0f)));
    }

    public final void M1(Context context) {
        int i;
        this.a1 = new guc(context, this.T0.getPopupLayout().getSwipeBack(), new aj3((Object) this, (byte) 28), false, 0, this.A0);
        if (this.i1 > 0 || this.e1 > 0) {
            int v0 = aob.v0(aob.n6, this.A0);
            guc gucVar = this.a1;
            p66 p66Var = (p66) gucVar.e;
            if (p66Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) ob6.M0(2131753841, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) hl.K2(ob6.M0(2131753840, null), v0, new pz(gucVar, (byte) 4)));
                p66Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.w2;
        if (userFull == null) {
            TLRPC.ChatFull chatFull = this.v2;
            i = chatFull != null ? chatFull.ttl_period : 0;
        } else {
            i = userFull.ttl_period;
        }
        rsb a = rsb.a(i);
        this.t0 = a;
        this.Z0 = this.T0.i(0, a, ob6.M0(2131753839, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.a1.b);
        this.T0.a(-1);
        I3();
    }

    public final void M3() {
        N3(this.m6);
    }

    public final void N1() {
        if (this.fragmentView == null || !this.u6 || this.z2 == null || getParentActivity() == null) {
            return;
        }
        ns8 ns8Var = this.G6;
        if (ns8Var != null) {
            ns8Var.b(this.z2);
            this.G6.invalidate();
        } else {
            ns8 ns8Var2 = new ns8(this, this.z2);
            this.G6 = ns8Var2;
            ((FrameLayout) this.fragmentView).addView(ns8Var2, tre.e(-1, -1, 55));
        }
    }

    public final boolean N2() {
        return getMessagesController().O1().J(a()) && !this.q1;
    }

    public final void N3(float f) {
        int R0;
        kc7 kc7Var = this.n6;
        if (kc7Var != null) {
            R0 = vm2.f(0.25f, kc7Var.m(aob.I.o()), -1);
        } else {
            R0 = hl.R0(this.W5, 1.0f, aob.v0(aob.qi, this.A0), aob.v0(aob.Fj, this.A0));
        }
        int f2 = vm2.f(f, R0, -1);
        int i = aob.Fj;
        int f3 = vm2.f(Math.max(this.W5, this.G5), f2, aob.v0(i, this.A0));
        ul ulVar = this.G;
        if (ulVar != null) {
            ulVar.k(Integer.valueOf(f3));
        }
        ul ulVar2 = this.H;
        if (ulVar2 != null) {
            ulVar2.k(Integer.valueOf(vm2.f(this.W5, vm2.f(f, R0, -1711276033), aob.v0(i, this.A0))));
        }
        this.e0.setColor(f3);
        this.m6 = f;
    }

    @Override // yn5
    public final void O(boolean z, boolean z2) {
        vb5 vb5Var = this.h0;
        if (vb5Var == null) {
            return;
        }
        vb5Var.setProgress(0.0f);
    }

    public final void O1(Context context) {
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            hl.B2(jlaVar);
        }
        wq8 wq8Var = new wq8(this, context, this.A0);
        this.simpleActionBar = wq8Var;
        wq8Var.setTitlesAlpha(0.0f);
        if (!this.r5 && !this.J0 && this.J1 != 0 && this.M1 && !this.N1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        byte b = 4;
        this.simpleActionBar.setMenuOverlayProvider(new yf0(this, b));
        boolean z = this.J0;
        jla jlaVar2 = this.simpleActionBar;
        if (z) {
            jlaVar2.setBackButtonImage(R.drawable.outline_header_qr_24);
            this.simpleActionBar.setBackButtonContentDescription(ob6.M0(2131746227, null));
        } else {
            jlaVar2.setBackButtonImage(R.drawable.ic_ab_back);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, b));
        if (this.J0) {
            return;
        }
        View backButton = this.simpleActionBar.getBackButton();
        backButton.setOnLongClickListener(new v0(this, backButton, (byte) 6));
    }

    public final void O2(boolean z) {
        float f;
        float f2;
        de0 currentItemView;
        float f3;
        float f4;
        TLRPC.ChatFull chatFull;
        this.glassEngine.g();
        int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? hl.m : 0);
        float D1 = D1();
        S3();
        zp8 zp8Var = this.a;
        if (zp8Var != null && !this.G1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zp8Var.getLayoutParams();
            if (layoutParams.topMargin != currentActionBarHeight) {
                layoutParams.topMargin = currentActionBarHeight;
                this.a.setLayoutParams(layoutParams);
            }
        }
        l4(z);
        if (this.Y != null) {
            this.a.setTopGlowOffset((int) this.Q1);
            this.a.setOverScrollMode((this.Q1 <= ((float) d2()) || this.Q1 >= ((float) ((X1() + this.a.getMeasuredWidth()) - currentActionBarHeight))) ? 0 : 2);
        }
        if (this.Y != null && !this.i6 && this.G1) {
            C1();
            return;
        }
        int d2 = d2();
        if (this.Y != null) {
            if (this.a0 != null && this.f1 != 0) {
                this.a0.o(2, (!xc2.T(this.F2) || this.F2.megagroup || (chatFull = this.v2) == null || chatFull.linked_chat_id == 0) ? false : true);
            }
            l4(z);
            float translationY = this.actionBar.getTranslationY() + (uh9.v(D1, 1.0f, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? hl.m : 0) - hl.L(21.0f));
            if (this.G1) {
                this.b2 = translationY;
            } else {
                ku8 ku8Var = this.u0;
                if (ku8Var != null) {
                    f4 = -hl.L(29.0f);
                    um7 um7Var = ku8Var.n;
                    if (um7Var != null && um7Var.c) {
                        f4 = um7Var.e.centerY();
                    }
                } else {
                    f4 = -hl.L(29.0f);
                }
                this.b2 = hl.R1(f4, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? hl.m : 0)) - hl.L(21.0f)), D1);
            }
            float f5 = this.G1 ? this.S1 : this.Q1;
            float f6 = d2;
            if (f5 > f6 || this.q2) {
                f = 2.0f;
                float w = qu6.w(f5 - f6, (this.a.getMeasuredWidth() - currentActionBarHeight) - e2(), 1.0f, 0.0f);
                this.i2 = w;
                f2 = 18.0f;
                this.c2 = (hl.R1(2.2857144f, 3.2857144f, Math.min(1.0f, w * 3.0f)) / 100.0f) * 42.0f;
                this.d2 = 0.0f;
                lq8 lq8Var = this.v0;
                if (lq8Var != null) {
                    lq8Var.invalidate();
                }
                gu8 gu8Var = this.w0;
                if (gu8Var != null) {
                    gu8Var.invalidate();
                }
                float min = Math.min(hl.N(2000.0f), Math.max(hl.N(1100.0f), Math.abs(this.j2))) / hl.N(1100.0f);
                X1();
                boolean z2 = this.p2;
                int i = jn7.u4;
                float[] fArr = this.n2;
                if (!z2 || (!this.G0 && this.i2 < 0.33f)) {
                    if (this.q2) {
                        this.q2 = false;
                        jn7.e().k(i, Boolean.TRUE);
                        sla slaVar = this.T0;
                        if (slaVar != null) {
                            slaVar.u(21);
                            if (this.r0 != null) {
                                this.T0.u(33);
                                this.T0.u(34);
                                this.T0.u(35);
                                this.T0.S(36);
                                this.T0.S(31);
                            }
                        }
                        sla slaVar2 = this.U0;
                        if (slaVar2 != null) {
                            slaVar2.setEnabled(!this.z1);
                        }
                        this.N.f(false, min);
                        this.p0.b(min);
                        this.k2.cancel();
                        this.f0.getImageReceiver().u0 = true;
                        this.f0.getImageReceiver().w0(false);
                        float S1 = hl.S1(this.m2, fArr);
                        fArr[0] = S1;
                        fArr[1] = 0.0f;
                        this.k2.setInterpolator(k43.j);
                        boolean z3 = this.o2;
                        ValueAnimator valueAnimator = this.k2;
                        if (z3) {
                            valueAnimator.setDuration(0L);
                        } else {
                            valueAnimator.setDuration((long) ((S1 * 250.0f) / min));
                        }
                        this.d1.setBackgroundColor(aob.v0(aob.a7, this.A0));
                        if (!this.I0 && (currentItemView = this.o0.getCurrentItemView()) != null) {
                            boolean z4 = currentItemView.getImageReceiver().t() instanceof idc;
                            iq8 iq8Var = this.f0;
                            if (z4) {
                                iq8Var.b0 = false;
                            } else {
                                iq8Var.b0 = true;
                                iq8Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.k2.addListener(new mq8(this, (byte) 5));
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
                    W1();
                    ValueAnimator valueAnimator2 = this.k2;
                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                        h3();
                        this.f.setTranslationY(this.f2);
                        this.r.setTranslationX(g2(this.g2, this.C6));
                        this.r.setTranslationY(h2(this.h2));
                        K3();
                    }
                } else {
                    if (!this.q2) {
                        if (this.T0 != null) {
                            boolean q2 = q2();
                            sla slaVar3 = this.T0;
                            if (q2) {
                                slaVar3.u(21);
                            } else {
                                slaVar3.S(21);
                            }
                            if (this.r0 != null) {
                                this.T0.S(36);
                                this.T0.S(34);
                                this.T0.S(35);
                                this.T0.u(33);
                                this.T0.u(31);
                            }
                        }
                        sla slaVar4 = this.U0;
                        if (slaVar4 != null) {
                            slaVar4.setEnabled(false);
                        }
                        this.q2 = true;
                        jn7.e().k(i, Boolean.TRUE);
                        this.N.f(true, min);
                        this.p0.b(min);
                        this.o0.setCreateThumbFromParent(true);
                        this.o0.getAdapter().g();
                        this.k2.cancel();
                        float S12 = hl.S1(this.m2, fArr);
                        fArr[0] = S12;
                        fArr[1] = 1.0f;
                        lq8 lq8Var2 = this.v0;
                        if (lq8Var2 == null || lq8Var2.x.isEmpty()) {
                            this.k2.setInterpolator(k43.j);
                            this.k2.setDuration((long) (((1.0f - S12) * 250.0f) / min));
                        } else {
                            this.k2.setInterpolator(new x84());
                            this.k2.setDuration((long) ((((1.0f - S12) * 1.3f) * 250.0f) / min));
                        }
                        this.k2.addListener(new mq8(this, (byte) 4));
                        View m = this.c.m(0);
                        if (!this.P1 && m != null) {
                            this.O1 = true;
                            this.a.z0(((m.getTop() - this.a.getMeasuredWidth()) - X1()) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? hl.m : 0), (int) this.k2.getDuration(), (Interpolator) this.k2.getInterpolator());
                            this.a.P0 = false;
                        }
                        this.g6 = this.f.getTranslationY();
                        this.h6 = this.r.getTranslationY();
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
                    float f7 = currentActionBarHeight + f5;
                    int i3 = (int) f7;
                    layoutParams2.height = i3;
                    if (i2 != i3) {
                        this.o0.requestLayout();
                    }
                    if (!this.k2.isRunning()) {
                        float L = (this.G1 && this.J1 == 2) ? (-(1.0f - this.T1)) * hl.L(50.0f) : 0.0f;
                        this.f.setTranslationX(hl.N(18.0f) - this.f.getLeft());
                        this.f.setTranslationY((((f7 - X1()) - hl.N(30.0f)) - this.f.getBottom()) + L);
                        this.r.setTranslationX(g2(hl.N(16.0f) - this.r.getLeft(), 0.0f));
                        this.r.setTranslationY(h2((((f7 - X1()) - hl.N(10.0f)) - this.r.getBottom()) + L));
                        K3();
                    }
                }
            } else {
                f = 2.0f;
                f2 = 18.0f;
            }
            boolean z5 = this.G1;
            if (z5 && this.J1 == 2) {
                float f8 = this.k6;
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / f) + (this.actionBar.getOccupyStatusBar() ? hl.m : 0)) - (hl.p * 21.0f));
                this.f.setPivotY(r6.getMeasuredHeight());
                this.f.setScaleX(1.38f);
                this.f.setScaleY(1.38f);
                this.c2 = hl.U1(this.T1, 42, jn7.T1) / 100.0f;
                this.d2 = 0.0f;
                lq8 lq8Var3 = this.v0;
                if (lq8Var3 != null) {
                    lq8Var3.setExpandProgress(1.0f);
                }
                gu8 gu8Var2 = this.w0;
                if (gu8Var2 != null) {
                    gu8Var2.setExpandProgress(1.0f);
                }
                this.f0.setRoundRadiusForExpand((int) hl.R1(m2(), 0.0f, this.T1));
                this.Y.setTranslationX(hl.R1(f8, 0.0f, this.T1));
                this.Y.setTranslationY(hl.R1((float) Math.ceil(translationY2), 0.0f, this.T1));
                float measuredWidth = ((this.c2 * 100.0f) / 42.0f) * (this.Y.getMeasuredWidth() - hl.L(42.0f));
                this.i0.setTranslationX(this.Y.getX() + hl.L(16.0f) + measuredWidth);
                this.i0.setTranslationY(this.Y.getY() + hl.L(-10.0f) + measuredWidth);
                this.j0.setTranslationX(this.Y.getX() + hl.L(28.0f) + measuredWidth);
                this.j0.setTranslationY(this.Y.getY() + hl.L(26.5f) + measuredWidth);
                this.k0.setTranslationX(this.Y.getX() + hl.L(28.0f) + measuredWidth);
                this.k0.setTranslationY(this.Y.getY() + hl.L(24.0f) + measuredWidth);
                this.l0.setTranslationX(this.Y.getX() + hl.L(28.0f) + measuredWidth);
                this.l0.setTranslationY(this.Y.getY() + hl.L(24.0f) + measuredWidth);
                this.Y.setScaleX(this.c2);
                this.Y.setScaleY(this.c2);
                this.o0.setAlpha(0.0f);
                this.o0.setVisibility(0);
                iq8 iq8Var2 = this.f0;
                float f9 = this.T1;
                float f10 = this.c2;
                iq8Var2.I = f9;
                iq8Var2.J = f10;
                iq8Var2.H = true;
                this.N.e(false, f9);
                this.actionBar.H(vm2.f(this.T1, this.n6 != null ? -1 : aob.v0(aob.v8, this.A0), -1), false);
                yt9 yt9Var = this.L;
                if (yt9Var != null) {
                    yt9Var.b(vm2.f(this.T1, aob.v0(aob.h8, this.A0), -1275068417));
                }
                Drawable drawable = this.x;
                if (drawable != null) {
                    drawable.setColorFilter(this.n6 == null ? vm2.f(this.T1, aob.v0(aob.gd, this.A0), -1) : -1, PorterDuff.Mode.MULTIPLY);
                }
                e43 e43Var = this.J;
                if (e43Var != null) {
                    e43Var.a(this.T1);
                    this.f.invalidate();
                }
                e43 e43Var2 = this.K;
                if (e43Var2 != null) {
                    e43Var2.a(this.T1);
                    this.f.invalidate();
                }
                N3(this.T1);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                layoutParams3.width = (int) hl.R1(hl.N(100.0f), this.a.getMeasuredWidth() / this.c2, this.T1);
                layoutParams3.height = (int) hl.R1(hl.N(100.0f), (this.Q1 + currentActionBarHeight) / this.c2, this.T1);
                this.Y.requestLayout();
                K3();
            } else if (f5 <= f6) {
                if (z5) {
                    this.c2 = hl.U1(D1, 42, 96) / 100.0f;
                    this.d2 = 0.0f;
                    f3 = 1.0f;
                } else {
                    ku8 ku8Var2 = this.u0;
                    this.c2 = hl.R1(ku8Var2 != null ? ku8Var2.getHiddenAvatarSizeDp() : 24.0f, 96.0f, D1) / 100.0f;
                    f3 = 1.0f;
                    this.d2 = 1.0f - D1;
                }
                ap8 ap8Var = this.a0;
                if (ap8Var != null) {
                    if (this.G1) {
                        ap8Var.setAlpha(this.T1);
                    } else {
                        ap8Var.setAlpha(f3);
                    }
                }
                lq8 lq8Var4 = this.v0;
                if (lq8Var4 != null) {
                    lq8Var4.invalidate();
                }
                gu8 gu8Var3 = this.w0;
                if (gu8Var3 != null) {
                    gu8Var3.h = this.G1;
                    float l = Utilities.l((D1 - 0.3f) / 0.7f);
                    if (gu8Var3.f != l) {
                        gu8Var3.f = l;
                        gu8Var3.invalidate();
                    }
                }
                float R1 = this.G1 ? hl.R1(j2(0), 1.12f, D1) : (0.12f * D1) + 1.0f;
                ValueAnimator valueAnimator3 = this.k2;
                if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                    this.Y.setScaleX(this.c2);
                    this.Y.setScaleY(this.c2);
                    W1();
                    this.Y.setTranslationY((float) Math.ceil(this.b2));
                    float L2 = (((this.c2 * 100.0f) / 42.0f) * hl.L(42.0f)) - hl.L(42.0f);
                    this.i0.setTranslationX(this.Y.getX() + hl.L(16.0f) + L2);
                    this.i0.setTranslationY(this.Y.getY() + hl.L(-10.0f) + L2);
                    this.j0.setTranslationX(this.Y.getX() + hl.L(28.0f) + L2);
                    this.j0.setTranslationY(this.Y.getY() + hl.L(26.5f) + L2);
                    this.k0.setTranslationX(this.Y.getX() + hl.L(28.0f) + L2);
                    this.k0.setTranslationY(this.Y.getY() + hl.L(24.0f) + L2);
                    this.l0.setTranslationX(this.Y.getX() + hl.L(28.0f) + L2);
                    this.l0.setTranslationY(this.Y.getY() + hl.L(24.0f) + L2);
                } else {
                    ValueAnimator valueAnimator4 = this.k2;
                    mq8 mq8Var = this.e6;
                    valueAnimator4.removeListener(mq8Var);
                    this.k2.addListener(mq8Var);
                }
                float N = ((hl.N(8.0f) + (this.Y.getScaleY() * this.Y.getHeight())) * (this.G1 ? this.T1 : D1)) + ((float) Math.floor(translationY));
                this.f2 = qd4.A(1.0f, this.T1, 0.0f, (hl.L(7.0f) * D1) + hl.L(1.3f) + N);
                this.h2 = (((float) Math.floor(hl.p * 11.0f)) * D1) + N + hl.L(24.0f);
                float L3 = this.G1 ? (this.k6 - hl.L(109.0f)) + hl.L(48.0f) : -hl.N(46.0f);
                gs8 gs8Var = this.F6;
                if (gs8Var != null) {
                    gs8Var.setAlpha((int) (255.0f * D1));
                }
                int measuredWidth2 = this.a.getMeasuredWidth();
                this.f.setScaleX(R1);
                this.f.setScaleY(R1);
                float R12 = this.G1 ? hl.R1(j2(1), 1.0f, D1) : 1.0f;
                this.r.setScaleX(R12);
                this.r.setScaleY(R12);
                P2(0, D1, false);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                float f11 = measuredWidth2 / f;
                float min2 = f11 - (((Math.min(this.f.getExactWidth(), layoutParams4.width) * R1) * 0.5f) + layoutParams4.leftMargin);
                float f12 = ((FrameLayout.LayoutParams) this.r.getLayoutParams()).width;
                float paddingLeft = (this.v5 || this.r.getExactWidth() > (f12 - ((float) this.r.getPaddingLeft())) - ((float) this.r.getPaddingRight())) ? 0.0f : this.r.getPaddingLeft();
                float min3 = f11 - ((Math.min(this.r.getExactWidth(), f12) * 0.5f) + (r7.leftMargin + paddingLeft));
                this.e2 = min2;
                this.g2 = min3;
                this.C6 = paddingLeft;
                if (this.G1) {
                    min2 = hl.R1(k2(L3, 0, this.f), min2, D1);
                    min3 = hl.R1(k2(L3, 1, this.r), min3, D1);
                }
                ValueAnimator valueAnimator5 = this.k2;
                if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                    this.f.setTranslationX(min2);
                    this.f.setTranslationY(this.f2);
                    this.r.setTranslationX(g2(min3, this.C6 * D1));
                    this.r.setTranslationY(h2(this.h2));
                }
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i4 = layoutParams5.width;
                int min4 = Math.min(layoutParams5.width, (int) ((((hl.O1() ? hl.L(490.0f) : hl.q.x) - hl.L(f2)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams5.leftMargin)));
                layoutParams5.width = min4;
                if (min4 != i4) {
                    this.f.requestLayout();
                }
                K3();
            }
            ValueAnimator valueAnimator6 = this.k2;
            if (valueAnimator6 == null || !valueAnimator6.isRunning()) {
                P2(0, D1, true);
            }
        }
        Q3(currentActionBarHeight);
        if (D1 >= 1.0f) {
            this.f0.setAlpha(1.0f);
        }
    }

    public final void O3() {
        this.e0.setScaleX(this.f.getScaleX());
        this.e0.setScaleY(this.f.getScaleY());
        this.e0.b((this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX(), (this.f.getHeight() - (this.f.getScaleY() * (this.f.getHeight() - this.f.getRightDrawableY()))) + this.f.getY());
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
    public final void P2(int i, float f, boolean z) {
        float scaleX;
        float f2;
        int i2;
        int i3;
        int ceil;
        ValueAnimator valueAnimator;
        if (this.Q1 > d2() || ((valueAnimator = this.k2) != null && valueAnimator.isRunning())) {
            scaleX = this.f.getScaleX();
        } else {
            if (f < 1.0f) {
                f2 = 1.12f;
                scaleX = 1.0f;
                int L = !hl.O1() ? hl.L(490.0f) : hl.q.x;
                jla jlaVar = this.simpleActionBar;
                int max = L - (((int) Math.max(hl.L(64.0f), (jlaVar == null ? jlaVar.v().getTargetPillWidth() : hl.L(46.0f)) + hl.L(18.0f))) << 1);
                int i4 = (int) (max / (i == 0 ? scaleX : 1.0f));
                if (i == 0) {
                    i2 = i;
                } else {
                    int L2 = L - (hl.L(18.0f) << 1);
                    int i5 = (int) (L2 / f2);
                    i2 = L2;
                    i = i5;
                }
                k43 k43Var = k43.i;
                int U1 = hl.U1(k43Var.getInterpolation(f), i4, i);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i6 = layoutParams.width;
                layoutParams.width = (int) Math.ceil(U1);
                if (z) {
                    int min = Math.min(layoutParams.width, (int) (((L - hl.L(18.0f)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams.leftMargin)));
                    layoutParams.width = min;
                    if (min != i6) {
                        this.f.requestLayout();
                    }
                }
                int U12 = hl.U1(k43Var.getInterpolation(f), max, i2);
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
        if (!hl.O1()) {
        }
        jla jlaVar2 = this.simpleActionBar;
        int max2 = L - (((int) Math.max(hl.L(64.0f), (jlaVar2 == null ? jlaVar2.v().getTargetPillWidth() : hl.L(46.0f)) + hl.L(18.0f))) << 1);
        int i42 = (int) (max2 / (i == 0 ? scaleX : 1.0f));
        if (i == 0) {
        }
        k43 k43Var2 = k43.i;
        int U13 = hl.U1(k43Var2.getInterpolation(f), i42, i);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        int i62 = layoutParams3.width;
        layoutParams3.width = (int) Math.ceil(U13);
        if (z) {
        }
        int U122 = hl.U1(k43Var2.getInterpolation(f), max2, i2);
        FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) this.r.getLayoutParams();
        i3 = layoutParams22.width;
        ceil = (int) Math.ceil(U122);
        layoutParams22.width = ceil;
        if (i3 == ceil) {
        }
    }

    public final void P3() {
        if (this.q1 || !xc2.c0(this.F2)) {
            return;
        }
        ip7 notificationsController = getNotificationsController();
        notificationsController.getMessagesStorage().a.c(new ue2((Object) notificationsController, -this.f1, (Object) new tp8(this, (byte) 0), (byte) 6));
    }

    @Override // xia
    public final void Q() {
        wia wiaVar;
        gr8 gr8Var = this.O;
        if (gr8Var != null && (wiaVar = this.R) != null) {
            gr8Var.setNewMediaCounts(wiaVar.c);
        }
        if (this.d != null) {
            Z3(false, false);
        }
        V();
        if (this.w2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void Q1(float f) {
        ValueAnimator ofFloat;
        boolean z = f > 0.0f;
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.q6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.q6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        byte b = 2;
        if (z) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.y0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new op8(this, b));
        this.q6.playTogether(arrayList);
        this.q6.setDuration(z ? 150L : 220L);
        if (!z) {
            this.q6.addListener(new mq8(this, (byte) 6));
        }
        this.q6.start();
    }

    public final void Q3(float f) {
        xr8 xr8Var;
        ValueAnimator valueAnimator;
        if (this.q2 || ((xr8Var = this.N) != null && (valueAnimator = xr8Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f);
            this.N.requestLayout();
        }
        is8 is8Var = this.d1;
        if (is8Var != null) {
            is8Var.F.setTranslate(0.0f, this.b2 - is8Var.y);
            is8 is8Var2 = this.d1;
            RadialGradient radialGradient = is8Var2.E;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(is8Var2.F);
            }
            this.d1.invalidate();
        }
        O3();
        H3();
        a4();
    }

    public final void R1(int i, View view) {
        fu5 I = fu5.I(this, view);
        I.X(this.a.W0(view, false));
        I.w = false;
        I.k(R.drawable.msg_copy, ob6.M0(2131751732, null), new y56(this, (byte) 4), this.w2 != null);
        I.b(R.drawable.msg_edit, ob6.M0(2131751300, null), new y56(this, (byte) 5), false);
        I.b(R.drawable.msg_delete, ob6.M0(2131746048, null), new me7((Object) this, i, (byte) 8), true);
        I.a0();
    }

    public final void R2(boolean z) {
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e1));
        if (X1 != null) {
            if (this.s2 && !uc7.K2(X1)) {
                if (!this.k1 || z) {
                    jj.r(this, false, this.F2, X1, this.E2 != null, true, false, true, new wp8(this, X1));
                    return;
                } else {
                    getMessagesController().t5(new y56(this, (byte) 25), this.e1);
                    finishFragment();
                    return;
                }
            }
            if (this.k1) {
                getMessagesController().t5(null, this.e1);
                if (d31.a(this)) {
                    d31.d(this, false).j();
                    return;
                }
                return;
            }
            if (this.l1) {
                jj.g0(this, this.e1, X1, null, this.E2, false, null, new ze1(this, (byte) 5), this.A0);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.A0, getParentActivity());
            String M0 = ob6.M0(2131753685, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = hl.S2(ob6.a0("AreYouSureBlockContact2", null, 2131754112, lv2.m(0, X1.first_name, X1.last_name)));
            alertDialog$Builder.j(ob6.M0(2131753686, null), new bp8(this, (byte) 9));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            showDialog(idVar);
            TextView textView = (TextView) idVar.c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, this.A0);
            }
        }
    }

    public final void R3() {
        float min = Math.min(this.d2, 0.25f) / 0.25f;
        boolean z = this.q1;
        ku8 ku8Var = this.u0;
        if (z) {
            ku8Var.setAlpha(1.0f - min);
            this.u0.setBlurIntensity(0.0f);
            this.u0.setGooeyEnabled(false);
            this.u0.setVisibility(this.d2 >= 1.0f ? 8 : 0);
        } else {
            ku8Var.setHideProgress(this.d2);
        }
        lq8 lq8Var = this.v0;
        if (lq8Var != null && this.J1 != 2) {
            float f = this.d2;
            lq8Var.setAlpha(f > 0.0f ? hl.R1(1.0f, 0.0f, hl.x1(f, 0.0f, 0.5f)) : 1.0f);
        }
        T3();
    }

    public final boolean S1(final int i, View view) {
        TLRPC.User f;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        final byte b = 0;
        if (this.s1 && (f = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.w2;
            if (userFull == null) {
                userFull = getMessagesController().Y1(f.id);
            }
            if (userFull != null) {
                String M0 = ob6.M0(2131751732, null);
                String M02 = ob6.M0(2131743847, null);
                if (i == this.L3 || i == this.K3 || i == this.X2) {
                    str = userFull.about;
                    if (i == this.X2) {
                        M02 = ob6.M0(2131753714, null);
                    }
                } else if (i == this.P3) {
                    str = vt7.j0(this.currentAccount, f, userFull.business_work_hours);
                    M0 = ob6.M0(2131746392, null);
                    M02 = ob6.M0(2131752742, null);
                } else if (i == this.Q3) {
                    str = userFull.business_location.address;
                    M0 = ob6.M0(2131746387, null);
                    M02 = ob6.M0(2131752674, null);
                } else if (i == this.M3) {
                    str = lbc.p(f);
                    if (str != null) {
                        str = "@".concat(str);
                    }
                    M0 = ob6.M0(2131746405, null);
                    M02 = ob6.M0(2131743320, null);
                } else if (i == this.H3) {
                    str = f.phone;
                    M02 = ob6.M0(2131747022, null);
                } else if (i == this.V2) {
                    str = UserInfoActivity.c0(this.w2.birthday);
                    M02 = ob6.M0(2131753709, null);
                } else {
                    str = null;
                }
                fu5 I = fu5.I(this, view);
                I.X(this.a.W0(view, false));
                I.w = false;
                I.i = (byte) 3;
                byte b2 = 6;
                if (i == this.Q3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        I.b(R.drawable.msg_view_file, ob6.M0(2131746383, null), new y56(this, b2), false);
                    }
                    I.b(R.drawable.msg_map, ob6.M0(2131746385, null), new y56(this, (byte) 8), false);
                }
                if (str != null) {
                    I.b(R.drawable.msg_copy, M0, new sa8(this, str, M02, b2), false);
                }
                final byte b3 = 1;
                if (i == this.P3) {
                    I.b(R.drawable.msg_edit, ob6.M0(2131746391, null), new y56(this, (byte) 9), false);
                    I.b(R.drawable.msg_delete, ob6.M0(2131746390, null), new Runnable(this) { // from class: jp8
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b;
                            final int i2 = i;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (b4) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = ob6.M0(2131752743, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M03;
                                    idVar.U = ob6.M0(2131752744, null);
                                    final byte b5 = 0;
                                    alertDialog$Builder.j(ob6.M0(2131746048, null), new fd() { // from class: lp8
                                        @Override // fd
                                        public final void w(id idVar2, int i3) {
                                            byte b6 = b5;
                                            int i4 = i2;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b6) {
                                                case 0:
                                                    RectF rectF2 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new mp8(profileActivity2, (byte) 0));
                                                    profileActivity2.f4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new mp8(profileActivity2, (byte) 3));
                                                    profileActivity2.f4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    profileActivity.showDialog(idVar);
                                    break;
                                default:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = ob6.M0(2131752675, null);
                                    id idVar2 = alertDialog$Builder2.a;
                                    idVar2.S = M04;
                                    idVar2.U = ob6.M0(2131752676, null);
                                    final byte b6 = 1;
                                    alertDialog$Builder2.j(ob6.M0(2131746048, null), new fd() { // from class: lp8
                                        @Override // fd
                                        public final void w(id idVar22, int i3) {
                                            byte b62 = b6;
                                            int i4 = i2;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b62) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new mp8(profileActivity2, (byte) 0));
                                                    profileActivity2.f4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new mp8(profileActivity2, (byte) 3));
                                                    profileActivity2.f4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                    profileActivity.showDialog(idVar2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i == this.Q3) {
                    I.b(R.drawable.msg_edit, ob6.M0(2131746386, null), new y56(this, (byte) 10), false);
                    I.b(R.drawable.msg_delete, ob6.M0(2131746384, null), new Runnable(this) { // from class: jp8
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b3;
                            final int i2 = i;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (b4) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = ob6.M0(2131752743, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M03;
                                    idVar.U = ob6.M0(2131752744, null);
                                    final byte b5 = 0;
                                    alertDialog$Builder.j(ob6.M0(2131746048, null), new fd() { // from class: lp8
                                        @Override // fd
                                        public final void w(id idVar22, int i3) {
                                            byte b62 = b5;
                                            int i4 = i2;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b62) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new mp8(profileActivity2, (byte) 0));
                                                    profileActivity2.f4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new mp8(profileActivity2, (byte) 3));
                                                    profileActivity2.f4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    profileActivity.showDialog(idVar);
                                    break;
                                default:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = ob6.M0(2131752675, null);
                                    id idVar2 = alertDialog$Builder2.a;
                                    idVar2.S = M04;
                                    idVar2.U = ob6.M0(2131752676, null);
                                    final byte b6 = 1;
                                    alertDialog$Builder2.j(ob6.M0(2131746048, null), new fd() { // from class: lp8
                                        @Override // fd
                                        public final void w(id idVar22, int i3) {
                                            byte b62 = b6;
                                            int i4 = i2;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b62) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new mp8(profileActivity2, (byte) 0));
                                                    profileActivity2.f4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new mp8(profileActivity2, (byte) 3));
                                                    profileActivity2.f4();
                                                    profileActivity2.d.s(i4);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                    profileActivity.showDialog(idVar2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i == this.M3) {
                    I.b(R.drawable.msg_edit, ob6.M0(2131746347, null), new y56(this, (byte) 11), false);
                } else if (i == this.L3 || i == this.K3 || i == this.X2) {
                    I.b(R.drawable.msg_edit, ob6.M0(2131746404, null), new y56(this, (byte) 12), false);
                } else if (i == this.H3) {
                    I.b(R.drawable.menu_storage_path, ob6.M0(2131746373, null), new y56(this, (byte) 13), false);
                } else if (i == this.V2) {
                    I.b(R.drawable.msg_edit, ob6.M0(2131746452, null), new Runnable(this) { // from class: ip8
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (b4) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    profileActivity.showDialog((nx0) jj.l(profileActivity.getParentActivity(), ob6.M0(2131751203, null), ob6.M0(2131751208, null), userFull2.birthday, new v35(profileActivity, userFull2, (byte) 20), new y56(profileActivity, (byte) 14), false, false, profileActivity.A0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = ob6.M0(2131753710, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M03;
                                    idVar.U = ob6.M0(2131753711, null);
                                    final byte b5 = 1;
                                    alertDialog$Builder.j(ob6.M0(2131746048, null), new fd() { // from class: kp8
                                        @Override // fd
                                        public final void w(id idVar2, int i2) {
                                            byte b6 = b5;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b6) {
                                                case 0:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new mp8(profileActivity2, (byte) 1));
                                                    profileActivity2.Z3(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.Z6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().j2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new mp8(profileActivity2, (byte) 2));
                                                    profileActivity2.Z3(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    profileActivity.showDialog(idVar);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = ob6.M0(2131746409, null);
                                    id idVar2 = alertDialog$Builder2.a;
                                    idVar2.S = M04;
                                    idVar2.U = ob6.M0(2131746410, null);
                                    final byte b6 = 0;
                                    alertDialog$Builder2.j(ob6.M0(2131746048, null), new fd() { // from class: kp8
                                        @Override // fd
                                        public final void w(id idVar22, int i2) {
                                            byte b62 = b6;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b62) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.Z6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new mp8(profileActivity2, (byte) 1));
                                                    profileActivity2.Z3(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.Z6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().j2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new mp8(profileActivity2, (byte) 2));
                                                    profileActivity2.Z3(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                    profileActivity.showDialog(idVar2);
                                    break;
                            }
                        }
                    }, false);
                    I.b(R.drawable.msg_delete, ob6.M0(2131746048, null), new Runnable(this) { // from class: ip8
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b3;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (b4) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    profileActivity.showDialog((nx0) jj.l(profileActivity.getParentActivity(), ob6.M0(2131751203, null), ob6.M0(2131751208, null), userFull2.birthday, new v35(profileActivity, userFull2, (byte) 20), new y56(profileActivity, (byte) 14), false, false, profileActivity.A0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = ob6.M0(2131753710, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M03;
                                    idVar.U = ob6.M0(2131753711, null);
                                    final byte b5 = 1;
                                    alertDialog$Builder.j(ob6.M0(2131746048, null), new fd() { // from class: kp8
                                        @Override // fd
                                        public final void w(id idVar22, int i2) {
                                            byte b62 = b5;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b62) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.Z6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new mp8(profileActivity2, (byte) 1));
                                                    profileActivity2.Z3(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.Z6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().j2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new mp8(profileActivity2, (byte) 2));
                                                    profileActivity2.Z3(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    profileActivity.showDialog(idVar);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = ob6.M0(2131746409, null);
                                    id idVar2 = alertDialog$Builder2.a;
                                    idVar2.S = M04;
                                    idVar2.U = ob6.M0(2131746410, null);
                                    final byte b6 = 0;
                                    alertDialog$Builder2.j(ob6.M0(2131746048, null), new fd() { // from class: kp8
                                        @Override // fd
                                        public final void w(id idVar22, int i2) {
                                            byte b62 = b6;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b62) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.Z6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new mp8(profileActivity2, (byte) 1));
                                                    profileActivity2.Z3(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.Z6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().j2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new mp8(profileActivity2, (byte) 2));
                                                    profileActivity2.Z3(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                    profileActivity.showDialog(idVar2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i == this.R2) {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(userFull.personal_channel_id));
                    if (M03 != null && xc2.K(M03, false) != null) {
                        I.b(R.drawable.msg_copy, ob6.M0(2131746408, null), new hp8(this, M03, b3), false);
                    }
                    I.b(R.drawable.msg_edit, ob6.M0(2131746411, null), new y56(this, (byte) 7), false);
                    final byte b4 = 2;
                    I.b(R.drawable.msg_delete, ob6.M0(2131746048, null), new Runnable(this) { // from class: ip8
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b42 = b4;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (b42) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    profileActivity.showDialog((nx0) jj.l(profileActivity.getParentActivity(), ob6.M0(2131751203, null), ob6.M0(2131751208, null), userFull2.birthday, new v35(profileActivity, userFull2, (byte) 20), new y56(profileActivity, (byte) 14), false, false, profileActivity.A0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M032 = ob6.M0(2131753710, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M032;
                                    idVar.U = ob6.M0(2131753711, null);
                                    final byte b5 = 1;
                                    alertDialog$Builder.j(ob6.M0(2131746048, null), new fd() { // from class: kp8
                                        @Override // fd
                                        public final void w(id idVar22, int i2) {
                                            byte b62 = b5;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b62) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.Z6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new mp8(profileActivity2, (byte) 1));
                                                    profileActivity2.Z3(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.Z6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().j2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new mp8(profileActivity2, (byte) 2));
                                                    profileActivity2.Z3(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    profileActivity.showDialog(idVar);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = ob6.M0(2131746409, null);
                                    id idVar2 = alertDialog$Builder2.a;
                                    idVar2.S = M04;
                                    idVar2.U = ob6.M0(2131746410, null);
                                    final byte b6 = 0;
                                    alertDialog$Builder2.j(ob6.M0(2131746048, null), new fd() { // from class: kp8
                                        @Override // fd
                                        public final void w(id idVar22, int i2) {
                                            byte b62 = b6;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (b62) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.Z6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new mp8(profileActivity2, (byte) 1));
                                                    profileActivity2.Z3(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.Z6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().j2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new mp8(profileActivity2, (byte) 2));
                                                    profileActivity2.Z3(false, false);
                                                    profileActivity2.getMessagesStorage().g2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                    profileActivity.showDialog(idVar2);
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

    public final void S2(boolean z) {
        boolean z2 = false;
        if (this.e1 != 0) {
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e1));
            if (X1 != null) {
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && userFull.video_calls_available) {
                    z2 = true;
                }
                xkc.m(X1, z, z2, getParentActivity(), this.w2, getAccountInstance());
                return;
            }
            return;
        }
        if (this.f1 != 0) {
            vc2 g1 = getMessagesController().g1(this.f1, false, null);
            TLRPC.Chat chat = this.F2;
            if (g1 != null) {
                xkc.l(chat, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            k5 accountInstance = getAccountInstance();
            if (getParentActivity() != null) {
                bw5.E0(getParentActivity(), -chat.id, accountInstance, new o48((Object) chat, (Object) this, (Object) accountInstance, (byte) 20));
            }
        }
    }

    public final void S3() {
        if (this.simpleActionBar != null) {
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null && aVar.getVisibility() != 4) {
                this.actionBar.setVisibility(4);
            }
            float D1 = 1.0f - ((1.0f - D1()) * this.simpleActionBar.getActionModeFactor());
            tt ttVar = this.Z;
            if (ttVar == null || this.R1 == D1) {
                return;
            }
            this.R1 = D1;
            ttVar.invalidate();
        }
    }

    public final boolean T1() {
        View view;
        if ((this.J0 || (!hl.O1() && !this.o2)) && this.f0.getImageReceiver().E() && !hl.A1()) {
            this.G0 = true;
            this.p2 = true;
            int i = 0;
            while (true) {
                if (i >= this.a.getChildCount()) {
                    view = null;
                    break;
                }
                if (RecyclerView.S(this.a.getChildAt(i)) == 0) {
                    view = this.a.getChildAt(i);
                    break;
                }
                i++;
            }
            if (view != null) {
                zp8 zp8Var = this.a;
                View G = zp8Var.G(view);
                f89 U = G != null ? zp8Var.U(G) : null;
                if (U != null) {
                    Integer num = (Integer) this.Z1.get(Integer.valueOf(U.b()));
                    if (num != null) {
                        this.P1 = true;
                        this.a.y0(0, -(((this.a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), k43.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void T2() {
        TLRPC.UserFull userFull = this.w2;
        if (userFull == null || !lbc.c(userFull)) {
            if (this.F2 != null) {
                mg5.h.a();
            }
            showDialog(new yx4(getParentActivity(), this.currentAccount, a(), null, null));
        } else {
            org.telegram.ui.ActionBar.e S = LaunchActivity.S();
            if (S != null) {
                c00.v(ob6.a0(null, null, 2131743397, wf3.s(a())), d31.b0(S), R.raw.error, 36);
            }
        }
    }

    public final void T3() {
        float f = 0.0f;
        if (!this.q1 && !this.G1) {
            int X1 = X1();
            f = X1 > 0 ? ete.a(1.0f - (this.Q1 / X1), 0.0f, 1.0f) : ete.a((this.d2 - 0.6f) / 0.4f, 0.0f, 1.0f);
        }
        float f2 = this.G5;
        if (f2 != f) {
            boolean z = ((f2 > 0.5f ? 1 : (f2 == 0.5f ? 0 : -1)) > 0) != ((f > 0.5f ? 1 : (f == 0.5f ? 0 : -1)) > 0);
            this.G5 = f;
            ns1 ns1Var = this.f;
            if (ns1Var != null) {
                ns1Var.setTextColor(this.J5);
            }
            kq8 kq8Var = this.r;
            if (kq8Var != null) {
                kq8Var.setTextColor(this.K5);
            }
            M3();
            if (z) {
                jn7.e().k(jn7.u4, Boolean.TRUE);
            }
            is8 is8Var = this.d1;
            if (is8Var != null) {
                is8Var.invalidate();
            }
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        W3();
        V3();
    }

    @Override // yn5
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        hl.c3(new yh1((yn5) this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, (byte) 5));
    }

    public final void U1() {
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
            this.C1.k(chatParticipant.user_id, chatParticipant);
        }
    }

    public final void U2(boolean z) {
        boolean[] zArr = {true};
        getMessagesController().k(this.F2.id, getUserConfig().f(), null, this, true, new yn6((Object) this, z, (Object) zArr, (byte) 15), new ag((Object) this, (Object) zArr, z, (Object) this.parentLayout.getLastFragment(), (byte) 5));
        jn7.e().k(jn7.L4, new Object[0]);
    }

    public final void U3() {
        gr8 gr8Var = this.O;
        if (gr8Var == null || this.b6 == 0) {
            return;
        }
        int topPanelShift = gr8Var.getTopPanelShift();
        int i = 0;
        if (topPanelShift > 0 && this.O.isAttachedToWindow()) {
            if (this.O.getParent() == this.a) {
                topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.O.getY()));
            }
            i = topPanelShift;
        }
        int i2 = this.b6 + i;
        u3(i2, this.H5);
        u3(i2, this.Z5);
    }

    @Override // tha
    public final void V() {
        int i;
        int i2;
        gr8 gr8Var = this.O;
        if (gr8Var == null || this.r == null) {
            return;
        }
        int closestTab = gr8Var.getClosestTab();
        int[] iArr = this.R.c;
        if (closestTab == 0) {
            if (iArr[7] <= 0 && iArr[6] <= 0) {
                int i3 = iArr[0];
                if (i3 <= 0) {
                    x3(ob6.M0(2131745137, null));
                    return;
                } else {
                    x3(ob6.G(i3, "Media", new Object[0]));
                    return;
                }
            }
            if (this.O.getPhotosVideosTypeFilter() == 1 || iArr[7] <= 0) {
                x3(ob6.G(iArr[6], "Photos", new Object[0]));
                return;
            }
            if (this.O.getPhotosVideosTypeFilter() == 2 || (i2 = iArr[6]) <= 0) {
                x3(ob6.G(iArr[7], "Videos", new Object[0]));
                return;
            }
            x3(ob6.G(i2, "Photos", new Object[0]) + ", " + ob6.G(iArr[7], "Videos", new Object[0]));
            return;
        }
        if (closestTab == 1) {
            int i4 = iArr[1];
            if (i4 <= 0) {
                x3(ob6.M0(2131750791, null));
                return;
            } else {
                x3(ob6.G(i4, "Files", new Object[0]));
                return;
            }
        }
        if (closestTab == 2) {
            int i5 = iArr[2];
            if (i5 <= 0) {
                x3(ob6.M0(2131743175, null));
                return;
            } else {
                x3(ob6.G(i5, "Voice", new Object[0]));
                return;
            }
        }
        if (closestTab == 3) {
            int i6 = iArr[3];
            if (i6 <= 0) {
                x3(ob6.M0(2131745139, null));
                return;
            } else {
                x3(ob6.G(i6, "Links", new Object[0]));
                return;
            }
        }
        if (closestTab == 4) {
            int i7 = iArr[4];
            if (i7 <= 0) {
                x3(ob6.M0(2131748073, null));
                return;
            } else {
                x3(ob6.G(i7, "MusicFiles", new Object[0]));
                return;
            }
        }
        if (closestTab == 5) {
            int i8 = iArr[5];
            if (i8 <= 0) {
                x3(ob6.M0(2131754875, null));
                return;
            } else {
                x3(ob6.G(i8, "GIFs", new Object[0]));
                return;
            }
        }
        if (closestTab == 6) {
            x3(ob6.G(this.w2.common_chats_count, "CommonGroups", new Object[0]));
            return;
        }
        if (closestTab == 7) {
            x3(this.r.getText());
            return;
        }
        if (closestTab == 8 || eja.t0(closestTab)) {
            boolean z = this.s2;
            gr8 gr8Var2 = this.O;
            if (z) {
                x3(gr8Var2.O(false));
                return;
            } else if (gr8Var2.W(closestTab) > 0) {
                x3(ob6.G(this.O.W(closestTab), "ProfileStoriesCount", new Object[0]));
                return;
            } else {
                x3(ob6.M0(2131746352, null));
                return;
            }
        }
        if (closestTab == 13) {
            x3(this.O.O(true));
            return;
        }
        if (closestTab == 9) {
            x3(ob6.G(this.O.W(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
            return;
        }
        if (closestTab == 10) {
            wb7 L0 = uc7.s1(this.currentAccount).L0(a());
            x3(ob6.G(L0 == null ? 0 : L0.b.size() + L0.c, this.s2 ? "Bots" : "Channels", new Object[0]));
            return;
        }
        if (closestTab != 12) {
            if (closestTab == 14) {
                cga cgaVar = this.O.b0;
                x3(ob6.H(',', "ProfileGiftsCount", cgaVar != null ? cgaVar.getGiftsCount() : 0));
                return;
            } else {
                if (closestTab == 15) {
                    int i9 = iArr[8];
                    if (i9 <= 0) {
                        x3(ob6.M0(2131745131, null));
                        return;
                    } else {
                        x3(ob6.H(',', "ProfilePollsCount", i9));
                        return;
                    }
                }
                return;
            }
        }
        nt9 F1 = getMessagesController().F1();
        long a = a();
        ArrayList arrayList = F1.j;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i = 0;
                break;
            }
            mt9 mt9Var = (mt9) arrayList.get(i10);
            if (mt9Var.a == a) {
                i = mt9Var.e;
                break;
            }
            i10++;
        }
        x3(ob6.G(Math.max(1, i), "SavedMessagesCount", new Object[0]));
    }

    public final boolean V1() {
        wk5 wk5Var;
        if (this.J1 == 0 || (wk5Var = this.parentLayout) == null || wk5Var.getFragmentStack() == null || this.parentLayout.getFragmentStack().size() < 2 || !(this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof zu1)) {
            return false;
        }
        finishFragment();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0052, code lost:
    
        if (r18 <= hl.L(76.0f)) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V2(View view, float f, float f2, boolean z) {
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
        boolean p2 = getMessagesController().p2(j3, this.g1, null);
        if (z) {
            if (this.q1 || p2) {
                boolean z2 = !p2;
                getNotificationsController().G(j3, this.g1, z2);
                d31.A(this, z2, null).j();
                P3();
                this.a0.setNotifications(p2);
                return;
            }
        } else if (ob6.a0) {
        }
        if (ob6.a0 || f < view.getMeasuredWidth() - hl.L(76.0f)) {
            oc2 oc2Var = new oc2(getParentActivity(), this.currentAccount, null, true, new zg2((Object) this, j3, (byte) 5), this.A0);
            oc2Var.e(j3, this.g1, this.n5);
            if (hl.O1()) {
                ViewGroup view2 = this.parentLayout.getView();
                f3 = view2.getX() + view2.getPaddingLeft() + f;
                f4 = view2.getY() + view2.getPaddingTop() + f2;
            } else {
                f3 = f;
                f4 = f2;
            }
            if (z) {
                f4 += this.a0.getHeight() - hl.L(12.0f);
            }
            oc2Var.d(this, view, f3, f4, z);
            return;
        }
        uo7 uo7Var = (uo7) view;
        boolean z3 = uo7Var.e.h;
        boolean z4 = !z3;
        boolean x = getNotificationsController().x(j3, null, false, false);
        String p = ip7.p(j3, this.g1, false);
        int i = this.currentAccount;
        if (z3) {
            SharedPreferences.Editor edit = uc7.s1(i).W3.edit();
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
            SharedPreferences.Editor edit2 = uc7.s1(i).W3.edit();
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
        P3();
        getNotificationsController().c0(j3, this.g1, true);
        uo7Var.setChecked(z4);
        b4(true);
    }

    public final void V3() {
        if (this.H5 == null || this.Z5 == null) {
            return;
        }
        gr8 gr8Var = this.O;
        boolean z = gr8Var != null && gr8Var.getParent() == this.a && this.O.isAttachedToWindow();
        float max = Math.max(Math.min(this.G5, this.R5), this.W5);
        this.H5.setAlpha(z ? 0.0f : max);
        this.H5.setVisibility((z || max <= 0.0f) ? 8 : 0);
        View view = this.Z5;
        if (!z) {
            max = 0.0f;
        }
        view.setAlpha(max);
        if (z) {
            this.Z5.setTranslationY(-(this.O.getY() + this.a.getY()));
        }
    }

    public final void W1() {
        if (this.a == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
        float v = bp1.v(layoutParams.width, this.c2, 0.5f, this.a.getMeasuredWidth() / 2.0f);
        this.a2 = v;
        if (this.G1) {
            v = hl.R1(this.k6, v, this.T1);
            this.a2 = v;
        }
        this.Y.setTranslationX(v);
    }

    public final void W2() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.e1 != 0) {
                TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e1));
                if (X1 == null) {
                    return;
                }
                if (this.G2 == null || (userFull = this.w2) == null || TextUtils.isEmpty(userFull.about)) {
                    str = String.format("https://" + getMessagesController().N2 + "/%s", lbc.p(X1));
                } else {
                    str = String.format("%s https://" + getMessagesController().N2 + "/%s", this.w2.about, lbc.p(X1));
                }
            } else if (this.f1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                if (M0 == null) {
                    return;
                }
                TLRPC.ChatFull chatFull = this.v2;
                if (chatFull == null || TextUtils.isEmpty(chatFull.about)) {
                    str = String.format("https://" + getMessagesController().N2 + "/%s", xc2.K(M0, false));
                } else {
                    str = String.format("%s\nhttps://" + getMessagesController().N2 + "/%s", this.v2.about, xc2.K(M0, false));
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
            startActivityForResult(Intent.createChooser(intent, ob6.M0(2131752963, null)), 500);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void W3() {
        if (this.simpleActionBar == null || this.M5 == null) {
            return;
        }
        qs8 qs8Var = this.O5;
        if (qs8Var != null) {
            float f2 = f2();
            if (qs8Var.l != f2) {
                qs8Var.l = f2;
                qs8Var.a();
            }
        }
        int f = vm2.f(f2(), this.I5, aob.v0(aob.G6, this.A0));
        if (this.L5 != f) {
            this.L5 = f;
            jla jlaVar = this.simpleActionBar;
            jlaVar.s0 = true;
            jlaVar.m0 = f;
            jlaVar.updateColors();
        }
        int Q1 = this.N5.Q1();
        if (this.Q5 != Q1) {
            this.Q5 = Q1;
            this.simpleActionBar.M();
        }
    }

    @Override // tha
    public final boolean X() {
        return this.A1;
    }

    public final int X1() {
        if (this.e1 == 0 || this.r0 == null || this.s1) {
            return hl.L(74 + ((this.L4 || this.M4) ? 25 : 0));
        }
        return 0;
    }

    public final void X2(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.M3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f1);
            bundle.putLong("user_id", this.e1);
            presentFragment(new rz8(bundle));
            return;
        }
        if (view2.getTag() == null || ((Integer) view2.getTag()).intValue() != this.V2) {
            return;
        }
        if (this.e1 == getUserConfig().e()) {
            presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
        } else if (lbc.c(this.w2)) {
            c00.v(ob6.a0(null, null, 2131743397, wf3.s(this.e1)), d31.b0(this), R.raw.error, 36);
        } else {
            showDialog(new yx4(getParentActivity(), this.currentAccount, this.e1, null, null));
        }
    }

    public final void X3(boolean z) {
        gr8 gr8Var;
        if (this.T0 != null) {
            boolean z2 = false;
            boolean z3 = !this.X5 && ((gr8Var = this.O) == null || !gr8Var.o0());
            boolean z4 = this.q2;
            v3(this.Q0, z3 && !z4 && this.M0, z);
            v3(this.R0, z3 && !z4 && this.N0, z);
            v3(this.S0, z3 && this.O0, z);
            gr8 gr8Var2 = this.O;
            boolean z5 = (gr8Var2 == null || gr8Var2.J == null || !gr8Var2.f0(gr8Var2.getClosestTab()) || this.O.o0()) ? false : true;
            v3(this.T0, z3, z && !z5);
            gr8 gr8Var3 = this.O;
            if (gr8Var3 != null) {
                boolean z6 = this.X5;
                if (z && !z5) {
                    z2 = true;
                }
                if (gr8Var3.q2 != z6) {
                    gr8Var3.q2 = z6;
                    gr8Var3.B(z, z2);
                }
            }
        }
    }

    public final int Y1(ImageReceiver imageReceiver) {
        return imageReceiver.t() instanceof idc ? ((idc) imageReceiver.t()).a.a() : hl.p(this.f0.getImageReceiver().n());
    }

    public final void Y2() {
        b29 b29Var;
        if (this.e1 == 0) {
            c3();
            return;
        }
        if (this.r0 == null) {
            b3();
            return;
        }
        TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(yac.h(this.currentAccount).e()));
        if (X1 == null) {
            X1 = yac.h(this.currentAccount).f();
        }
        if (X1 != null) {
            zn5 zn5Var = this.r0;
            TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
            zn5Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new y56(this, (byte) 24), new dl8(this, (byte) 2), 0);
            this.V.H(0);
            this.V.K(43);
            this.W.H(0);
            this.W.K(43);
            ap8 ap8Var = this.a0;
            if (ap8Var != null) {
                xo8 i = ap8.i(14, ap8Var.a);
                if (i != null && (b29Var = i.k) != null) {
                    b29Var.start();
                }
            } else {
                this.s.d();
            }
            skb skbVar = this.N2;
            if (skbVar != null) {
                skbVar.getImageView().d();
            }
        }
    }

    public final void Y3() {
        TLRPC.User X1;
        if (!this.s1 || this.X0 == null || this.W0 == null || (X1 = getMessagesController().X1(Long.valueOf(this.e1))) == null) {
            return;
        }
        boolean z = lbc.p(X1) != null;
        this.X0.setIcon(z ? R.drawable.menu_username_change : R.drawable.menu_username_set);
        this.X0.setText(ob6.M0(z ? 2131746347 : 2131746346, null));
        this.W0.setVisibility(lbc.p(X1) == null ? 8 : 0);
    }

    public final ul Z1(long j) {
        if (this.H == null) {
            ul ulVar = new ul(hl.L(17.0f), 2, this.f, false);
            this.H = ulVar;
            int L = hl.L(1.0f);
            ulVar.J = 0;
            ulVar.K = L;
            if (this.H0) {
                this.H.a();
            }
        }
        ul ulVar2 = this.H;
        if (j != 0) {
            ulVar2.j(j, false);
        } else {
            ulVar2.g(null, false);
        }
        M3();
        return this.H;
    }

    public final void Z2() {
        Bundle l = bs2.l("addToGroup", true);
        l.putLong("chatId", this.F2.id);
        rc5 rc5Var = new rc5(l);
        TLRPC.ChatFull chatFull = this.v2;
        rc5Var.J = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            zh6 zh6Var = new zh6();
            for (int i = 0; i < this.v2.participants.participants.size(); i++) {
                zh6Var.k(this.v2.participants.participants.get(i).user_id, null);
            }
            rc5Var.K = zh6Var;
        }
        rc5Var.y = new bp8(this, (byte) 8);
        presentFragment(rc5Var);
    }

    public final void Z3(boolean z, boolean z2) {
        if (this.d == null) {
            if (z) {
                c4(false);
            }
            f4();
            return;
        }
        if (!z2 && this.a.isInLayout()) {
            zp8 zp8Var = this.a;
            if (zp8Var.H) {
                zp8Var.post(new q38((byte) 2, (Object) this, z));
                return;
            }
            return;
        }
        jr8 jr8Var = new jr8(this);
        jr8Var.a = this.O2;
        jr8Var.e(jr8Var.b);
        ArrayList arrayList = jr8Var.d;
        arrayList.clear();
        ArrayList arrayList2 = jr8Var.e;
        arrayList2.clear();
        arrayList.addAll(this.U4);
        arrayList2.addAll(this.V4);
        jr8Var.f = this.x4;
        jr8Var.g = this.y4;
        if (z) {
            c4(false);
        }
        j3();
        f4();
        jr8Var.e(jr8Var.c);
        try {
            cy7.a(jr8Var, true).c(this.d);
        } catch (Exception e) {
            cc4.g(e, true);
            this.d.f();
        }
        int i = this.r6;
        if (i >= 0) {
            this.c.g1(i, this.s6 - this.a.getPaddingTop());
        }
        hl.V3(this.a);
    }

    public final long a() {
        long j = this.i1;
        if (j != 0) {
            return j;
        }
        long j2 = this.e1;
        return j2 != 0 ? j2 : -this.f1;
    }

    public final void a2(boolean z) {
        zh6 zh6Var;
        if (this.B1 || (zh6Var = this.C1) == null || this.v2 == null) {
            return;
        }
        this.B1 = true;
        final int i = (zh6Var.m() == 0 || !z) ? 0 : jn7.W4;
        final TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = getMessagesController().h1(this.f1);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = z ? 0 : this.C1.m();
        tL_channels_getParticipants.limit = jn7.d3;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: up8
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                RectF rectF = ProfileActivity.Z6;
                hl.d3(new ep8(ProfileActivity.this, tL_error, tLObject, tL_channels_getParticipants, (byte) 1), i);
            }
        }), this.classGuid);
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
    public final void a3(boolean z) {
        TLRPC.Chat M0;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize x;
        TLRPC.ChatFull chatFull;
        TLRPC.FileLocation fileLocation2;
        TLRPC.VideoSize x2;
        TLRPC.UserFull userFull;
        TLRPC.Photo photo;
        if (this.a.getScrollState() != 1 || z) {
            jq8 jq8Var = this.o0;
            int realPosition = jq8Var != null ? jq8Var.getRealPosition() : 0;
            jq8 jq8Var2 = this.o0;
            jn5 jn5Var = null;
            jn5 G = jq8Var2 != null ? jq8Var2.G(realPosition) : null;
            jq8 jq8Var3 = this.o0;
            TLRPC.Photo F = jq8Var3 != null ? jq8Var3.F(realPosition) : null;
            long j = this.e1;
            vq8 vq8Var = this.q5;
            if (j == 0) {
                if (this.f1 == 0 || (chatPhoto = (M0 = getMessagesController().M0(Long.valueOf(this.f1))).photo) == null || chatPhoto.photo_big == null) {
                    return;
                }
                PhotoViewer.q0().T1(null, this, null);
                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
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
                if (F != null && !F.video_sizes.isEmpty() && (x = xb4.x(1000, F.video_sizes)) != null) {
                    jn5Var = jn5.j(x, F);
                }
                PhotoViewer.q0().m1(null, fileLocation3, G, jn5Var, null, null, null, 0, vq8Var, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e1));
            TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null) {
                return;
            }
            PhotoViewer.q0().T1(null, this, null);
            TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
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
            if (F != null && !F.video_sizes.isEmpty() && (x2 = xb4.x(1000, F.video_sizes)) != null) {
                jn5Var = jn5.j(x2, F);
            }
            PhotoViewer.q0().m1(null, fileLocation4, G, jn5Var, null, null, null, 0, vq8Var, null, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void a4() {
        if (this.c0 == null || this.r == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? hl.m : 0);
        boolean z = this.G1;
        if (z && this.J1 == 2 && this.Y != null) {
            this.c0.setAlpha(this.T1);
            this.c0.f(hl.L(74.0f) + this.a.getMeasuredWidth(), X1() - hl.L(74.0f));
            return;
        }
        if (z) {
            this.c0.setAlpha(this.T1);
        }
        float f = currentActionBarHeight;
        float L = this.Q1 + f + hl.L(74.0f);
        float min = Math.min(X1(), L - f);
        this.c0.f(L - min, min - hl.L(74.0f));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.e7));
        hashSet.add(Integer.valueOf(aob.f7));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.K6));
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.yj));
        hashSet.add(Integer.valueOf(aob.xj));
        hashSet.add(Integer.valueOf(aob.wj));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.li));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.h8));
        hashSet.add(Integer.valueOf(aob.si));
        hashSet.add(Integer.valueOf(aob.mi));
        hashSet.add(Integer.valueOf(aob.gd));
        hashSet.add(Integer.valueOf(aob.f8));
    }

    public final ul b2(TLRPC.EmojiStatus emojiStatus, boolean z) {
        if (this.G == null) {
            ul ulVar = new ul(hl.L(24.0f), 2, this.f, false);
            this.G = ulVar;
            if (this.H0) {
                ulVar.a();
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
                this.G.g(i2(), z);
                this.G.m(false, z);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
                this.F = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                this.G.j(tL_emojiStatusCollectible.document_id, z);
                this.G.m(true, z);
            } else {
                this.G.g(i2(), z);
                this.G.m(false, z);
            }
        } else {
            this.G.g(i2(), z);
            this.G.m(false, z);
        }
        M3();
        return this.G;
    }

    public final void b3() {
        TLRPC.User X1;
        if (this.e1 == 0 || V1() || (X1 = getMessagesController().X1(Long.valueOf(this.e1))) == null || (X1 instanceof TLRPC.TL_userEmpty)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.e1);
        if (getMessagesController().C(bundle, this, null, null)) {
            boolean z = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
            if (!hl.O1() && z) {
                jn7 notificationCenter = getNotificationCenter();
                int i = jn7.s;
                notificationCenter.n(this, i);
                getNotificationCenter().k(i, new Object[0]);
            }
            int i2 = getArguments().getInt("nearby_distance", -1);
            if (i2 >= 0) {
                bundle.putInt("nearby_distance", i2);
            }
            zu1 zu1Var = new zu1(bundle);
            ls6 mediaDataController = getMediaDataController();
            TLRPC.Document document = mediaDataController.z0;
            mediaDataController.o1();
            zu1Var.Y9 = document;
            zu1Var.Z9 = false;
            presentFragment(zu1Var, z);
            if (!hl.O1() || this.J0) {
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
    public final void b4(boolean z) {
        int i;
        wr8 wr8Var;
        if (z && (i = this.O3) >= 0 && (wr8Var = this.d) != null) {
            wr8Var.g(i);
        }
        ap8 ap8Var = this.a0;
        if (ap8Var == null || this.s1) {
            return;
        }
        SharedPreferences sharedPreferences = uc7.s1(this.currentAccount).W3;
        long j = this.i1;
        if (j == 0) {
            j = this.e1;
            if (j == 0) {
                j = -this.f1;
            }
        }
        long j2 = j;
        boolean z2 = false;
        String p = ip7.p(j2, this.g1, false);
        boolean contains = sharedPreferences.contains("notify2_" + p);
        int g = qu6.g("notify2_", p, sharedPreferences, 0);
        int g2 = qu6.g("notifyuntil_", p, sharedPreferences, 0);
        if (g != 3 || g2 == Integer.MAX_VALUE) {
            if (g == 0) {
                if (!contains) {
                    z2 = getNotificationsController().x(j2, null, false, false);
                }
                z2 = true;
            }
        }
        ap8Var.setNotifications(z2);
    }

    public final int c2() {
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + ((aVar == null || !aVar.getOccupyStatusBar()) ? 0 : hl.m);
    }

    public final void c3() {
        TLRPC.ChatFull chatFull = this.v2;
        if (chatFull == null || chatFull.linked_chat_id == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.v2.linked_chat_id);
        if (getMessagesController().C(bundle, this, null, null)) {
            presentFragment(new zu1(bundle));
        }
    }

    public final void c4(boolean z) {
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
                TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.v2.participants.participants.get(i2).user_id));
                if (X1 != null && (userStatus = X1.status) != null && ((userStatus.expires > currentTime || X1.id == getUserConfig().e()) && X1.status.expires > 10000)) {
                    this.C2++;
                }
                this.D2.add(Integer.valueOf(i2));
                if (X1 != null) {
                    if (X1.bot) {
                        i = -110;
                    } else if (X1.self) {
                        i = 50000 + currentTime;
                    } else {
                        TLRPC.UserStatus userStatus2 = X1.status;
                        if (userStatus2 != null) {
                            i = userStatus2.expires;
                        }
                    }
                    i2 = qd4.g(i, i2, 1, arrayList);
                }
                i = TLObject.FLAG_31;
                i2 = qd4.g(i, i2, 1, arrayList);
            } else {
                try {
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
        Collections.sort(this.D2, Comparator$-EL.reversed(Comparator$-CC.comparingInt(new kn1(arrayList, b))));
        if (z && this.d != null && this.x4 > 0) {
            hl.V3(this.a);
        }
        if (this.O == null || this.N4 == -1) {
            return;
        }
        if ((this.D2.size() > 5 || this.W4 == 2) && this.W4 != 1) {
            this.O.h1(this.D2, this.v2);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean canBeginSlide() {
        if (this.O.u0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void clearViews() {
        this.n6 = null;
        super.clearViews();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r1 != null) goto L17;
     */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ActionBar.a createActionBar(Context context) {
        wk5 wk5Var;
        wk5 wk5Var2;
        LaunchActivity launchActivity;
        xu1 xu1Var;
        ez3 ez3Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.e lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof zu1) && (xu1Var = ((zu1) lastFragment).Ba) != null && (ez3Var = xu1Var.f) != null) {
            if (ez3Var != null) {
                TLRPC.ChatTheme chatTheme = ez3Var.d;
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
        y10 y10Var = new y10(this, context, this.A0, (byte) 6);
        boolean z = true;
        y10Var.setForceSkipTouches(true);
        y10Var.setBackgroundColor(0);
        y10Var.G(this.n6 != null ? 553648127 : aob.v0(aob.f8, this.A0), false);
        int i = aob.v8;
        y10Var.H(aob.v0(i, this.A0), false);
        y10Var.H(aob.v0(i, this.A0), true);
        y10Var.setCastShadows(false);
        y10Var.setAddToContainer(false);
        y10Var.setClipContent(true);
        if (!this.J0 && (((wk5Var = this.parentLayout) == null || !((ActionBarLayout) wk5Var).b) && ((hl.O1() || this.inBubbleMode) && (!hl.O1() || this.inBubbleMode || (wk5Var2 = this.parentLayout) == null || (launchActivity = LaunchActivity.H1) == null || wk5Var2 != launchActivity.r0)))) {
            z = false;
        }
        y10Var.setOccupyStatusBar(z);
        if (!this.J0) {
            y10Var.setBackButtonDrawable(new gd0(false));
            y10Var.getBackButton().setTranslationX(hl.L(2.0f));
            ImageView backButton = y10Var.getBackButton();
            backButton.setOnLongClickListener(new v0(this, backButton, (byte) 5));
            return y10Var;
        }
        y10Var.setBackButtonDrawable(new gd0(false));
        y10Var.getBackButton().setTranslationX(hl.L(2.0f));
        y10Var.e.setContentDescription(ob6.M0(2131746227, null));
        y10Var.e.setImageResource(R.drawable.outline_header_qr_24);
        y10Var.e.setColorFilter(aob.v0(i, this.A0), PorterDuff.Mode.SRC_IN);
        y10Var.e.setOnClickListener(new fp8(this, (byte) 4));
        return y10Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 != null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v248, types: [android.view.View, zp8] */
    /* JADX WARN: Type inference failed for: r0v250, types: [d79] */
    /* JADX WARN: Type inference failed for: r0v283, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v290 */
    /* JADX WARN: Type inference failed for: r0v35, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v37, types: [android.view.ViewGroup, er8] */
    /* JADX WARN: Type inference failed for: r0v38, types: [d79, zp8] */
    /* JADX WARN: Type inference failed for: r0v42, types: [d79, zp8] */
    /* JADX WARN: Type inference failed for: r0v45, types: [androidx.recyclerview.widget.RecyclerView, zp8] */
    /* JADX WARN: Type inference failed for: r0v46, types: [android.view.ViewGroup, zp8] */
    /* JADX WARN: Type inference failed for: r0v47, types: [d79, zp8] */
    /* JADX WARN: Type inference failed for: r0v50, types: [androidx.recyclerview.widget.RecyclerView, zp8] */
    /* JADX WARN: Type inference failed for: r0v60, types: [android.view.View, zp8] */
    /* JADX WARN: Type inference failed for: r0v61, types: [is8] */
    /* JADX WARN: Type inference failed for: r0v70, types: [android.view.ViewGroup, tt] */
    /* JADX WARN: Type inference failed for: r0v88, types: [org.telegram.ui.Components.RadialProgressView, vb5] */
    /* JADX WARN: Type inference failed for: r12v18, types: [c51[]] */
    /* JADX WARN: Type inference failed for: r12v19, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v24, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r53v0, types: [java.lang.Object, org.telegram.ui.ActionBar.e, org.telegram.ui.ProfileActivity] */
    /* JADX WARN: Type inference failed for: r5v101, types: [android.view.View, android.view.ViewGroup, b6] */
    /* JADX WARN: Type inference failed for: r5v148, types: [c51[]] */
    /* JADX WARN: Type inference failed for: r5v149, types: [c51] */
    /* JADX WARN: Type inference failed for: r5v159, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r5v162, types: [c51[]] */
    /* JADX WARN: Type inference failed for: r5v163, types: [c51] */
    /* JADX WARN: Type inference failed for: r9v34, types: [android.view.ViewGroup] */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ll0 ll0Var;
        int i;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        ?? r13;
        TLRPC.Document document;
        int i2;
        Object obj;
        FrameLayout frameLayout;
        int i3;
        TLRPC.UserFull userFull2;
        FrameLayout frameLayout2;
        TLRPC.ChatParticipants chatParticipants;
        xu1 xu1Var;
        ez3 ez3Var;
        aob.X(context);
        ?? r0 = 0;
        aob.J(context, false);
        org.telegram.ui.ActionBar.e lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof zu1) && (xu1Var = ((zu1) lastFragment).Ba) != null && (ez3Var = xu1Var.f) != null) {
            if (ez3Var != null) {
                TLRPC.ChatTheme chatTheme = ez3Var.d;
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
        this.Q1 = d2();
        this.actionBar.setActionBarMenuOnItemClick(new cr8(this, context));
        gr8 gr8Var = this.O;
        if (gr8Var != null) {
            gr8Var.L0();
        }
        long j = this.i1;
        if (j == 0) {
            j = this.e1;
            if (j == 0) {
                j = -this.f1;
            }
        }
        this.fragmentView = new er8(this, context);
        yic yicVar = new yic(this.fragmentView);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        ll0 ll0Var2 = this.R6;
        ll0Var2.e(yicVar, viewGroup);
        FrameLayout frameLayout3 = (FrameLayout) this.fragmentView;
        byte b = 19;
        int i4 = 2;
        if (this.s1) {
            this.y5 = new FrameLayout(context);
            this.z5 = new FrameLayout[2];
            this.C5 = new c51[2];
            int i5 = 0;
            while (i5 < i4) {
                ir8 ir8Var = new ir8(context);
                jl0 b2 = getBaseSimpleGlass().c.b(ir8Var, new cl0(aob.d6, this.A0));
                b2.q(hl.L(8.0f));
                b2.r(hl.L(22.0f));
                ir8Var.setBackground(b2);
                this.z5[i5] = new FrameLayout(context);
                this.C5[i5] = new c51(context, this.A0);
                this.C5[i5].setRoundRadius(hl.L(19.0f));
                this.C5[i5].setUseWrapContent(true);
                this.C5[i5].setPadding(hl.L(16.0f), r0, hl.L(16.0f), r0);
                if (i5 == 0) {
                    ?? spannableStringBuilder = new SpannableStringBuilder("c");
                    this.A5 = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new wm2(R.drawable.filled_premium_camera), r0, 1, 33);
                    this.A5.append((CharSequence) "  ").append((CharSequence) ob6.L0(2131744466));
                    ?? spannableStringBuilder2 = new SpannableStringBuilder("c");
                    this.B5 = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new wm2(R.drawable.filled_add_album), r0, 1, 33);
                    this.B5.append((CharSequence) "  ").append((CharSequence) ob6.L0(2131744461));
                    this.C5[i5].h(this.A5, r0);
                } else {
                    this.C5[i5].h(ob6.L0(2131744140), r0);
                }
                ir8Var.setOnClickListener(new w0(this, i5, b));
                iye.b(ir8Var, 0.02f, 1.2f);
                this.C5[i5].setStateListAnimator(null);
                ir8Var.addView(this.C5[i5], tre.e(-2, -1, 17));
                this.z5[i5].addView(ir8Var, tre.e(-2, 60, 1));
                this.y5.addView(this.z5[i5], tre.e(-1, -1, 87));
                if (i5 == 1 || !getMessagesController().k5()) {
                    p3(this.z5[i5], 1.0f);
                }
                i5++;
                r0 = 0;
                i4 = 2;
                b = 19;
            }
        }
        TLRPC.ChatFull chatFull2 = this.v2;
        ArrayList arrayList = (chatFull2 == null || (chatParticipants = chatFull2.participants) == null || chatParticipants.participants.size() <= 5) ? null : this.D2;
        if (this.x1) {
            ll0Var = ll0Var2;
            i = 6;
        } else if (this.t1 && (((userFull = this.w2) != null && userFull.stargifts_count > 0) || ((chatFull = this.v2) != null && chatFull.stargifts_count > 0))) {
            this.w1 = true;
            ll0Var = ll0Var2;
            i = 14;
        } else if (this.r1) {
            ll0Var = ll0Var2;
            i = 10;
        } else {
            ll0Var = ll0Var2;
            i = arrayList != null ? 7 : -1;
        }
        O1(context);
        ll0 ll0Var3 = ll0Var;
        wia wiaVar = this.R;
        TLRPC.UserFull userFull3 = this.w2;
        long j2 = j;
        gr8 gr8Var2 = new gr8(this, context, j2, wiaVar, userFull3 != null ? userFull3.common_chats_count : 0, this.D2, this.v2, userFull3, i, this.y1, this, this, this.A0, getBaseSimpleGlass().c);
        this.O = gr8Var2;
        gr8Var2.setLayoutParams(new r79(-1, -1));
        byte b3 = 4;
        byte b4 = 3;
        if (this.e1 == 0 || this.r0 == null || this.s1) {
            this.c0 = new tu8(context);
            js8 js8Var = new js8(context);
            this.d0 = js8Var;
            this.c0.setTrailingView(js8Var);
            qs8 qs8Var = this.O5;
            if (qs8Var != null) {
                this.c0.setGlassFactory(qs8Var.c);
            }
            this.d0.setOnClickListener(new fp8(this, (byte) 2));
            this.c0.setColor(this.n6);
            TLRPC.UserFull userFull4 = this.w2;
            if (userFull4 != null && (document = userFull4.saved_music) != null) {
                this.c0.setMusicDocument(document);
            }
            this.c0.setOnClickListener(new fp8(this, b4));
            this.a0 = new ap8(context, hl.L(74.0f));
            n3();
            r13 = 0;
            b4(false);
            this.a0.setOnActionClickListener(new bp8(this, b3));
        } else {
            r13 = 0;
        }
        rla v = this.simpleActionBar.v();
        if (this.e1 == getUserConfig().n && !this.s1 && lv2.r(this.currentAccount).v(7) == null) {
            lv2.r(this.currentAccount).C();
        }
        if (this.r0 != null && !this.s1) {
            sla a = v.a(32, R.drawable.outline_header_search);
            a.M();
            a.K(new r10(this, (byte) 19));
            this.U0 = a;
            a.setContentDescription(ob6.L0(2131745487));
            this.U0.setSearchFieldHint(ob6.L0(2131745487));
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
        sla a2 = v.a(16, R.drawable.profile_video);
        this.R0 = a2;
        a2.setContentDescription(ob6.L0(2131743266));
        if (this.f1 != 0) {
            this.Q0 = v.a(15, R.drawable.msg_voicechat2);
            boolean W = xc2.W(this.F2);
            sla slaVar = this.Q0;
            if (W) {
                slaVar.setContentDescription(ob6.L0(2131743099));
            } else {
                slaVar.setContentDescription(ob6.L0(2131742958));
            }
        } else {
            sla a3 = v.a(15, R.drawable.call);
            this.Q0 = a3;
            a3.setContentDescription(ob6.L0(2131752615));
        }
        if (this.s1) {
            sla a4 = v.a(41, R.drawable.group_edit_profile);
            this.S0 = a4;
            a4.setContentDescription(ob6.L0(2131751300));
        } else {
            sla a5 = v.a(12, R.drawable.group_edit_profile);
            this.S0 = a5;
            a5.setContentDescription(ob6.L0(2131751300));
        }
        sla a6 = v.a(10, R.drawable.ic_ab_other);
        this.T0 = a6;
        a6.setSubMenuDelegate(new v34(this, (byte) 27));
        ImageView imageView = new ImageView(context);
        this.Y0 = imageView;
        yob.s(imageView, aob.v8, this.A0, PorterDuff.Mode.MULTIPLY);
        hl.Q3(0.8f, this.Y0, r13, r13);
        this.Y0.setImageResource(R.drawable.msg_mini_autodelete_timer);
        this.T0.addView(this.Y0, tre.d(12, 12.0f, 19, 8.0f, 2.0f, 0.0f, 0.0f));
        this.T0.setContentDescription(ob6.L0(2131754834));
        this.T0.L(ll0Var3, dtd.h(this.resourceProvider));
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
        L1(r13);
        this.d = new wr8(this, context);
        this.e = new fs8(this, context);
        rb0 rb0Var = new rb0();
        this.q0 = rb0Var;
        rb0Var.p = 2.3809524f;
        rb0Var.l = true;
        this.fragmentView.setWillNotDraw(r13);
        ?? r02 = (er8) this.fragmentView;
        this.s5 = r02;
        r02.setClipChildren(r13);
        ?? zp8Var = new zp8(this, context, this.A0);
        this.a = zp8Var;
        zp8Var.setLegacySections(r13);
        this.a.s1();
        zp8 zp8Var2 = this.a;
        zp8Var2.getClass();
        zp8Var2.setSectionsOverscanTop(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + hl.m);
        zp8 zp8Var3 = this.a;
        int i6 = aob.a7;
        yob.h(i6, this.A0, zp8Var3);
        this.a.setVerticalScrollBarEnabled(r13);
        lhc lhcVar = new lhc(this.a, (ViewGroup) this.fragmentView, new hc5(this, (byte) 1));
        lhcVar.h = true;
        aq8 aq8Var = new aq8(this);
        this.a.setItemAnimator(aq8Var);
        aq8Var.e = (short) 320;
        aq8Var.d = (short) 320;
        aq8Var.c = (short) 320;
        aq8Var.m = r13;
        aq8Var.C = r13;
        k43 k43Var = k43.h;
        aq8Var.o(k43Var);
        this.a.setClipToPadding(r13);
        this.a.setClipChildren(r13);
        this.a.setHideIfEmpty(r13);
        bq8 bq8Var = new bq8(this);
        this.c = bq8Var;
        bq8Var.i1(1);
        bq8 bq8Var2 = this.c;
        bq8Var2.r = r13;
        this.a.setLayoutManager(bq8Var2);
        this.a.setGlowColor(r13);
        this.a.setAdapter(this.d);
        frameLayout3.addView(this.a, tre.e(-1, -1, 51));
        this.a.setOnItemClickListener(new ps0((Object) this, (Object) context, j2, (byte) 6));
        this.a.setOnItemLongClickListener(new eq8(this, context));
        if (this.r1 || this.t1 || this.x1) {
            f4();
            I();
            this.t6 = true;
            this.r6 = this.N4;
            this.s6 = r13;
        }
        byte b5 = 26;
        if (this.U0 != null) {
            ?? d79Var = new d79(context);
            this.b = d79Var;
            d79Var.setVerticalScrollBarEnabled(r13);
            this.b.setLayoutManager(new x46(1, r13));
            yob.H(this.b, aob.e8, this.A0);
            this.b.setAdapter(this.e);
            this.b.setItemAnimator(null);
            this.b.setVisibility(8);
            this.b.setLayoutAnimation(null);
            yob.h(aob.d6, this.A0, this.b);
            frameLayout3.addView(this.b, tre.e(-1, -1, 51));
            this.b.setOnItemClickListener(new zg4(this, b5));
            this.b.setOnItemLongClickListener(new bp8(this, (byte) 5));
            this.b.setOnScrollListener(new fq8(this, r13));
            this.b.q1(1, true);
            z2b z2bVar = new z2b(context);
            this.P = z2bVar;
            z2bVar.setAnimateLayoutChange(true);
            this.P.e.setVisibility(8);
            this.P.setVisibility(8);
            frameLayout3.addView(this.P);
            this.e.G();
        }
        byte b6 = 29;
        if (this.E1 != 0) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.E1));
            if (this.H2 == null) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = uc7.i1(M0);
                frameLayout2 = frameLayout3;
                tL_channels_getParticipant.participant = getMessagesController().j1(this.e1);
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new mp8(this, (byte) 4));
            } else {
                frameLayout2 = frameLayout3;
            }
            ?? b6Var = new b6(context, b6);
            b6Var.setWillNotDraw(r13);
            b6Var.setPadding(r13, r13, r13, hl.n);
            ?? r9 = frameLayout2;
            r9.addView(b6Var, tre.a(-1.0f, (hl.n / hl.p) + 51.0f, 83));
            b6Var.setOnClickListener(new uv5(this, M0, (byte) 27));
            TextView textView = new TextView(context);
            yob.X(textView, aob.p7, this.A0);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(17);
            textView.setTypeface(hl.o());
            textView.setText(ob6.L0(2131753721));
            b6Var.addView(textView, tre.d(-2, -2.0f, 17, 0.0f, 1.0f, 0.0f, 0.0f));
            this.a.setPadding(r13, d2(), r13, hl.L(48.0f));
            this.a.setBottomGlowOffset(hl.L(48.0f));
            frameLayout = r9;
        } else {
            frameLayout = frameLayout3;
            this.a.setPadding(r13, d2(), r13, r13);
        }
        ?? is8Var = new is8(this, context);
        this.d1 = is8Var;
        is8Var.a(this.n6, r13);
        this.d1.setBackgroundColor(getThemedColor(i6));
        frameLayout.addView(this.d1);
        zm zmVar = new zm(context);
        this.e0 = zmVar;
        zmVar.setPivotX(hl.L(30.0f));
        this.e0.setPivotY(hl.L(30.0f));
        this.Y = new d26((byte) 16, context, this);
        this.Z = new tt(b5, context, (Object) this);
        ImageReceiver imageReceiver = new ImageReceiver(this.Z);
        this.x5 = imageReceiver;
        imageReceiver.q0(hl.L(11.0f));
        hl.Q3(1.0f, this.Z, true, r13);
        this.Z.setClipChildren(r13);
        frameLayout.addView(this.Z, tre.d(-1, -1.0f, 8388611, 0.0f, 0.0f, 0.0f, 0.0f));
        this.Y.setPivotX(0.0f);
        this.Y.setPivotY(0.0f);
        ku8 ku8Var = new ku8(context);
        this.u0 = ku8Var;
        ku8Var.addView(this.Y, tre.e(100, 100, 51));
        this.Z.addView(this.u0, tre.c(-1.0f, -1));
        iq8 iq8Var = new iq8(context);
        this.f0 = iq8Var;
        iq8Var.u(X1());
        this.f0.getImageReceiver().x0 = true;
        this.f0.setRoundRadiusForExpand(m2());
        this.f0.setPivotX(0.0f);
        this.f0.setPivotY(0.0f);
        this.Y.addView(this.f0, tre.c(-1.0f, -1));
        this.f0.setOnClickListener(new fp8(this, (byte) 9));
        this.f0.setHasStories(N2());
        this.f0.setOnLongClickListener(new zs(this, (byte) 11));
        vb5 vb5Var = new vb5((ProfileActivity) this, context);
        this.h0 = vb5Var;
        vb5Var.setSize(hl.L(26.0f));
        this.h0.setProgressColor(-1);
        this.h0.setNoProgress(r13);
        this.Y.addView(this.h0, tre.c(-1.0f, -1));
        ImageView imageView2 = new ImageView(context);
        this.i0 = imageView2;
        imageView2.setPadding(hl.L(10.0f), hl.L(10.0f), hl.L(5.0f), hl.L(5.0f));
        ImageView imageView3 = this.i0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        this.i0.setAlpha(0.0f);
        this.i0.setScaleX(0.85f);
        this.i0.setScaleY(0.85f);
        ImageView imageView4 = this.i0;
        rsb rsbVar = new rsb(context, null);
        this.m0 = rsbVar;
        imageView4.setImageDrawable(rsbVar);
        this.i0.setTranslationY(-1.0f);
        frameLayout.addView(this.i0, tre.e(34, 34, 51));
        ImageView imageView5 = new ImageView(context);
        this.j0 = imageView5;
        imageView5.setScaleType(scaleType);
        this.j0.setAlpha(0.0f);
        this.j0.setImageDrawable(new tk0());
        frameLayout.addView(this.j0, tre.e(16, 16, 51));
        ImageView imageView6 = new ImageView(context);
        this.k0 = imageView6;
        imageView6.setImageResource(R.drawable.star_small_outline);
        yob.s(this.k0, aob.s8, this.A0, PorterDuff.Mode.SRC_IN);
        this.k0.setAlpha(0.0f);
        this.k0.setScaleY(0.0f);
        this.k0.setScaleX(0.0f);
        frameLayout.addView(this.k0, tre.e(20, 20, 51));
        ImageView imageView7 = new ImageView(context);
        this.l0 = imageView7;
        imageView7.setImageResource(R.drawable.star_small_inner);
        this.l0.setAlpha(0.0f);
        this.l0.setScaleY(0.0f);
        this.l0.setScaleX(0.0f);
        frameLayout.addView(this.l0, tre.e(20, 20, 51));
        h4();
        C3(r13, r13);
        jq8 jq8Var = this.o0;
        if (jq8Var != null) {
            jq8Var.K();
        }
        ws8 ws8Var = this.n0;
        if (ws8Var != null) {
            ws8Var.c();
        }
        this.N = new xr8(this, context);
        ws8 ws8Var2 = new ws8(context);
        this.n0 = ws8Var2;
        ws8Var2.setSize(X1());
        long j3 = this.e1;
        if (j3 == 0) {
            j3 = -this.f1;
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        zp8 zp8Var4 = this.a;
        iq8 iq8Var2 = this.f0;
        getClassGuid();
        int i7 = i2;
        ViewGroup viewGroup2 = frameLayout;
        this.o0 = new jq8(this, context, j3, aVar, zp8Var4, iq8Var2, this.N, this.n0);
        if (this.e1 != getUserConfig().n && (userFull2 = this.w2) != null) {
            this.t5 = userFull2.profile_photo == null ? 0.0f : 1.0f;
        }
        if (!this.q1) {
            this.o0.setChatInfo(this.v2);
        }
        this.Z.addView(this.o0);
        this.Z.addView(this.n0, tre.c(138.0f, -1));
        this.Z.addView(this.N);
        ap8 ap8Var = this.a0;
        if (ap8Var != null) {
            this.Z.addView(ap8Var, tre.c(-1.0f, -1));
        }
        tu8 tu8Var = this.c0;
        if (tu8Var != null) {
            this.Z.addView(tu8Var, tre.c(-1.0f, -1));
            this.Z.addView(this.d0, tre.c(-1.0f, -1));
        }
        this.f0.setAvatarsViewPager(this.o0);
        yr8 yr8Var = new yr8(this, context);
        this.p0 = yr8Var;
        this.Z.addView(yr8Var, tre.c(-1.0f, -1));
        viewGroup2.addView(this.actionBar);
        ns1 ns1Var = new ns1((byte) 3, context, this);
        this.f = ns1Var;
        ns1Var.setTextColor(getThemedColor(aob.mi));
        this.f.setPadding(0, hl.L(6.0f), 0, hl.L(4.0f));
        this.f.setTextSizePx(hl.L(17.5f));
        this.f.setGravity(3);
        this.f.setTypeface(hl.o());
        this.f.setLeftDrawableTopPadding(-hl.L(1.3f));
        this.f.setPivotX(0.0f);
        this.f.setPivotY(0.0f);
        this.f.setScrollNonFitText(true);
        this.f.setFocusable(true);
        this.f.setEllipsizeByGradient(true);
        this.Z.addView(this.f, tre.d(-2, -2.0f, 51, 109.0f, -6.0f, 0.0f, 0.0f));
        kq8 kq8Var = new kq8(this, context);
        this.r = kq8Var;
        kq8Var.setEllipsizeByGradient(true);
        this.r.setTextColor(A1(getThemedColor(aob.B8), null));
        this.r.setTextSizePx(hl.L(13.5f));
        this.r.setGravity(3);
        this.r.setPivotX(hl.L(8.0f));
        this.r.setPivotY(hl.L(8.0f));
        this.r.setPadding(hl.L(4.0f), hl.L(2.0f), hl.L(4.0f), hl.L(2.0f));
        this.r.setFocusable(true);
        this.Z.addView(this.r, tre.d(-2, -2.0f, 51, 105.0f, -2.0f, 4.0f, 0.0f));
        I1();
        this.Z.addView(this.e0);
        jva jvaVar = new jva(context);
        this.T = jvaVar;
        jvaVar.setLayoutParams(tre.d(32, 32.0f, 3, 103.0f, -2.0f, 0.0f, 0.0f));
        this.T.setResourcesProvider(this.A0);
        J1();
        this.T.setDelegate(new bp8(this, (byte) 7));
        this.T.setOnClickListener(new fp8(this, (byte) 10));
        TLRPC.UserFull userFull5 = this.w2;
        if (userFull5 != null) {
            this.T.set(userFull5.stars_rating);
        }
        this.Z.addView(this.T);
        this.v0 = new lq8(this, context, this.currentAccount, a(), this.q1, this.Y, this.f0, this.A0, context);
        i4(false);
        TLRPC.UserFull userFull6 = this.w2;
        if (userFull6 != null) {
            this.v0.setStories(userFull6.stories);
        } else {
            TLRPC.ChatFull chatFull3 = this.v2;
            if (chatFull3 != null) {
                this.v0.setStories(chatFull3.stories);
            }
        }
        iq8 iq8Var3 = this.f0;
        if (iq8Var3 != null) {
            iq8Var3.setHasStories(N2());
        }
        this.Z.addView(this.v0, tre.c(-1.0f, -1));
        gu8 gu8Var = new gu8(context, this.currentAccount, a(), this.Y);
        this.w0 = gu8Var;
        this.Z.addView(gu8Var, 0, tre.c(-1.0f, -1));
        e4(true);
        e29 e29Var = new e29(context);
        this.s = e29Var;
        if (this.a0 != null) {
            e29Var.setVisibility(8);
        }
        n4();
        if (this.e1 == 0) {
            this.s.setImageResource(R.drawable.profile_discuss);
            this.s.setContentDescription(ob6.L0(2131743207));
        } else if (this.r0 != null) {
            this.V = new b29(R.raw.camera_outline, hl.L(56.0f), hl.L(56.0f), false, null);
            this.W = new b29(R.raw.camera_outline, hl.L(42.0f), hl.L(42.0f), false, null);
            ap8 ap8Var2 = this.a0;
            if (ap8Var2 != null) {
                ap8Var2.e();
                this.a0.a();
                this.a0.b();
                this.a0.c();
                ap8 ap8Var3 = this.a0;
                if (ap8Var3.G) {
                    ap8Var3.G = false;
                    ap8Var3.d();
                }
            } else {
                this.s.setAnimation(this.V);
                this.s.setContentDescription(ob6.L0(2131754901));
                this.s.setPadding(hl.L(2.0f), 0, 0, hl.L(2.0f));
            }
        } else {
            ap8 ap8Var4 = this.a0;
            if (ap8Var4 != null) {
                ap8Var4.o(0, true);
            }
            this.s.setImageResource(R.drawable.profile_newmsg);
            this.s.setContentDescription(ob6.L0(2131754814));
        }
        this.s.setScaleType(scaleType);
        viewGroup2.addView(this.s, tre.d(60, 60.0f, 53, 0.0f, 0.0f, 16.0f, 0.0f));
        this.s.setOnClickListener(new fp8(this, (byte) 11));
        O2(false);
        if (i7 != -1 && obj != null) {
            this.s.setTag(0);
            this.s.setScaleX(0.2f);
            this.s.setScaleY(0.2f);
            this.s.setAlpha(0.0f);
        }
        this.a.setOnScrollListener(new fq8(this, (byte) 1));
        UndoView undoView = new UndoView(context, null, false, this.A0);
        this.M = undoView;
        viewGroup2.addView(undoView, tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.k2 = ofFloat;
        ofFloat.addUpdateListener(new op8(this, (byte) 3));
        this.k2.setInterpolator(k43Var);
        this.k2.addListener(new mq8(this, (byte) 0));
        f4();
        V();
        kg5 kg5Var = new kg5(getContext(), 3);
        kg5Var.p(true);
        kg5Var.h = hl.L(310.0f);
        kg5Var.d = 2300L;
        kg5Var.U = true;
        kg5Var.e = true;
        kg5Var.m(11.0f, 6.0f, 11.0f, 7.0f);
        kg5Var.v0 = hl.L(4.0f);
        this.X = kg5Var;
        kg5Var.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        this.X.k(getBaseSimpleGlass().c);
        viewGroup2.addView(this.X, tre.e(-1, jn7.f2, 55));
        this.O.setForwardRestrictedHint(this.X);
        nq8 nq8Var = new nq8(this, (ViewGroup) getParentActivity().getWindow().getDecorView(), viewGroup2);
        this.Z4 = nq8Var;
        nq8Var.E = new pq8((Object) this, (byte) 0);
        this.o0.setPinchToZoomHelper(nq8Var);
        this.y0.setAlpha(0);
        this.z0.setColor(getThemedColor(aob.i6));
        k4();
        tb tbVar = new tb((byte) 29, context, this);
        this.U = tbVar;
        int i8 = aob.d6;
        tbVar.setForeground(new ColorDrawable(vm2.o(getThemedColor(i8), 100)));
        this.U.setFocusable(false);
        this.U.setImportantForAccessibility(2);
        this.U.setOnClickListener(new fp8(this, (byte) 0));
        this.U.setVisibility(8);
        this.U.setFitsSystemWindows(true);
        this.s5.addView(this.U, tre.c(-1.0f, -1));
        N1();
        if (this.s1) {
            i3 = 87;
            this.s5.addView(this.y5, tre.e(-1, 60, 87));
        } else {
            i3 = 87;
        }
        ap8 ap8Var5 = this.a0;
        if (ap8Var5 != null && ap8Var5.k()) {
            ImageView imageView8 = new ImageView(context);
            this.P0 = imageView8;
            imageView8.setScaleType(scaleType);
            this.P0.setImageResource(R.drawable.call);
            this.P0.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(hl.L(48.0f), org.telegram.ui.ActionBar.a.getCurrentActionBarHeight());
            layoutParams.topMargin = this.actionBar.getOccupyStatusBar() ? hl.m : 0;
            layoutParams.setMarginEnd(layoutParams.width);
            layoutParams.gravity = 8388613;
            viewGroup2.addView(this.P0, layoutParams);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.E5 = frameLayout4;
        yob.h(i8, this.A0, frameLayout4);
        View view = new View(context);
        yob.h(aob.d7, this.A0, view);
        this.E5.addView(view, tre.d(-1, 1.0f / hl.p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.F5 = new c51(context, this.A0);
        this.F5.h(ob6.L0(2131745674), false);
        this.E5.addView(this.F5, tre.d(-1, 48.0f, jn7.D1, 10.0f, (1.0f / hl.p) + 10.0f, 10.0f, 10.0f));
        this.F5.setOnClickListener(new fp8(this, (byte) 1));
        this.E5.setVisibility(8);
        this.E5.setTranslationY(hl.L(69.0f));
        this.s5.addView(this.E5, tre.e(-1, -2, i3));
        this.S6 = new dg0(this, lhcVar, (byte) 8);
        B3();
        View view2 = this.fragmentView;
        bp8 bp8Var = new bp8(this, (byte) 3);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(view2, bp8Var);
        return this.fragmentView;
    }

    @Override // tha
    public final d79 d() {
        return this.a;
    }

    public final int d2() {
        return X1() + e2();
    }

    public final void d3(boolean z) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.w2;
        if (userFull == null || (tL_businessLocation = userFull.business_location) == null) {
            return;
        }
        byte b = 0;
        if (tL_businessLocation.geo_point == null || z) {
            boolean z2 = f11.a;
            org.telegram.messenger.a.q();
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?q=" + this.w2.business_location.address, new Object[0]))));
                return;
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        yq8 yq8Var = new yq8(3, b);
        yq8Var.setResourceProvider(this.A0);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.local_id = -1;
        tL_message.peer_id = getMessagesController().y1(a());
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_businessLocation tL_businessLocation2 = this.w2.business_location;
        tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
        tL_messageMediaGeo.address = tL_businessLocation2.address;
        tL_message.media = tL_messageMediaGeo;
        yq8Var.V0 = false;
        yq8Var.G0(new r47(yac.t0, tL_message, false, false));
        presentFragment(yq8Var);
    }

    public final void d4() {
        CharSequence charSequence;
        kq8 kq8Var = this.r;
        if (kq8Var != null) {
            if ((!this.X5 || (charSequence = this.c6) == null) && (!this.A6 || (charSequence = this.z6) == null)) {
                charSequence = this.y6;
            }
            if (!kq8Var.o(charSequence, !this.G1) || this.fragmentView == null) {
                return;
            }
            O2(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        wr8 wr8Var;
        wk5 wk5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User X1;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.Chat chat;
        zp8 zp8Var;
        zp8 zp8Var2;
        n69 n69Var;
        if (i == jn7.E5 || i == jn7.r3) {
            if (xc2.R(uc7.s1(this.currentAccount).M0(Long.valueOf(this.f1)))) {
                getMessagesController().O1().j(a(), new bm0((byte) 22), false, this.A0);
                return;
            }
            return;
        }
        int i3 = 0;
        r3 = false;
        boolean z = false;
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i4 = uc7.r5;
            Object[] objArr2 = ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & TLObject.FLAG_19) == 0) ? false : true;
            if (this.e1 != 0) {
                if (objArr2 != false) {
                    e4(true);
                }
                if ((intValue & 1024) == 0 || (zp8Var2 = this.a) == null || (n69Var = (n69) zp8Var2.M(this.H3, false)) == null) {
                    return;
                }
                this.d.t(n69Var, this.H3);
                return;
            }
            if (this.f1 != 0) {
                int i5 = intValue & TLObject.FLAG_13;
                if (i5 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                    if (i5 != 0) {
                        Z3(true, false);
                    } else {
                        c4(true);
                    }
                    e4(true);
                }
                if (!objArr2 == true || (zp8Var = this.a) == null) {
                    return;
                }
                int childCount = zp8Var.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = this.a.getChildAt(i6);
                    if (childAt instanceof vac) {
                        ((vac) childAt).i(intValue);
                    }
                }
                return;
            }
            return;
        }
        if (i == jn7.g1) {
            Long l = (Long) objArr[0];
            if (this.v2 == null || (chat = this.F2) == null || chat.id != l.longValue()) {
                return;
            }
            this.v2.online_count = ((Integer) objArr[1]).intValue();
            c4(true);
            e4(false);
            return;
        }
        if (i == jn7.N || i == jn7.b1) {
            L1(true);
            return;
        }
        if (i == jn7.a0) {
            if (this.j1) {
                hl.c3(new hp8(this, objArr, (byte) 5));
                return;
            }
            return;
        }
        if (i == jn7.Y) {
            TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
            TLRPC.EncryptedChat encryptedChat2 = this.E2;
            if (encryptedChat2 == null || encryptedChat.id != encryptedChat2.id) {
                return;
            }
            this.E2 = encryptedChat;
            Z3(false, false);
            c34 c34Var = this.Y1;
            if (c34Var != null) {
                c34Var.i();
                return;
            }
            return;
        }
        if (i == jn7.g0) {
            boolean z2 = this.k1;
            boolean z3 = getMessagesController().x0.indexOfKey(this.e1) >= 0;
            this.k1 = z3;
            if (z2 != z3) {
                L1(true);
                Z3(false, false);
                return;
            }
            return;
        }
        if (i == jn7.w2) {
            Long l2 = (Long) objArr[0];
            if (this.F2 != null) {
                long longValue = l2.longValue();
                TLRPC.Chat chat2 = this.F2;
                if (longValue == chat2.id && xc2.w(14, chat2)) {
                    TLRPC.ChatFull N0 = uc7.s1(this.currentAccount).N0(l2.longValue());
                    if (N0 != null) {
                        TLRPC.ChatFull chatFull4 = this.v2;
                        if (chatFull4 != null) {
                            N0.participants = chatFull4.participants;
                        }
                        this.v2 = N0;
                    }
                    gr8 gr8Var = this.O;
                    if (gr8Var != null) {
                        gr8Var.setChatInfo(this.v2);
                    }
                    TLRPC.ChatFull chatFull5 = this.v2;
                    if (chatFull5 != null) {
                        TLRPC.InputGroupCall inputGroupCall = chatFull5.call;
                        boolean z4 = this.p1;
                        if (inputGroupCall != null ? z4 : !z4) {
                            L1(false);
                        }
                    }
                    lq8 lq8Var = this.v0;
                    if (lq8Var != null && (chatFull3 = this.v2) != null) {
                        lq8Var.setStories(chatFull3.stories);
                    }
                    gu8 gu8Var = this.w0;
                    if (gu8Var != null) {
                        gu8Var.a();
                    }
                    iq8 iq8Var = this.f0;
                    if (iq8Var != null) {
                        iq8Var.setHasStories(N2());
                    }
                    if (l2.longValue() != 0) {
                        boolean z5 = f11.a;
                        r2 = (getMessagesController().N3() || (chatFull2 = this.v2) == null || !chatFull2.stargifts_available) ? false : true;
                        this.T0.Q(38, r2);
                        ap8 ap8Var = this.a0;
                        if (ap8Var != null) {
                            ap8Var.o(3, r2);
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
        if (i == jn7.T) {
            TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
            if (this.e1 != 0 && (X1 = getMessagesController().X1(Long.valueOf(this.e1))) != null && chatFull6.id == X1.linked_community_id) {
                Z3(true, false);
            }
            TLRPC.Chat chat3 = this.F2;
            if (chat3 != null && chatFull6.id == chat3.linked_community_id) {
                Z3(true, false);
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
                U1();
                jq8 jq8Var = this.o0;
                if (jq8Var != null && !this.q1) {
                    jq8Var.setChatInfo(this.v2);
                }
                Z3(true, false);
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                if (M0 != null) {
                    this.F2 = M0;
                    L1(true);
                }
                c34 c34Var2 = this.Y1;
                if (c34Var2 != null) {
                    c34Var2.i();
                }
                if (this.F2.megagroup && (objArr3 != false || !booleanValue)) {
                    a2(true);
                }
                I3();
                k4();
                lq8 lq8Var2 = this.v0;
                if (lq8Var2 != null && (chatFull = this.v2) != null) {
                    lq8Var2.setStories(chatFull.stories);
                }
                gu8 gu8Var2 = this.w0;
                if (gu8Var2 != null) {
                    gu8Var2.a();
                }
                iq8 iq8Var2 = this.f0;
                if (iq8Var2 != null) {
                    iq8Var2.setHasStories(N2());
                }
                gr8 gr8Var2 = this.O;
                if (gr8Var2 != null) {
                    gr8Var2.setChatInfo(this.v2);
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.s) {
            removeSelfFromStack(true);
            return;
        }
        if (i == jn7.u) {
            long longValue2 = ((Long) objArr[0]).longValue();
            boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
            if (longValue2 == a() && (wk5Var = this.parentLayout) != null && wk5Var.getFragmentStack().contains(this)) {
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
        if (i == jn7.D0) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
            if (botInfo.user_id == this.e1) {
                this.G2 = botInfo;
                Z3(false, false);
                return;
            }
            return;
        }
        if (i == jn7.E0) {
            if (((Long) objArr[0]).longValue() == this.e1) {
                TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                this.w2 = userFull;
                jva jvaVar = this.T;
                if (jvaVar != null) {
                    jvaVar.set(userFull.stars_rating);
                }
                lq8 lq8Var3 = this.v0;
                if (lq8Var3 != null) {
                    lq8Var3.setStories(this.w2.stories);
                }
                gu8 gu8Var3 = this.w0;
                if (gu8Var3 != null) {
                    gu8Var3.a();
                }
                iq8 iq8Var3 = this.f0;
                if (iq8Var3 != null) {
                    iq8Var3.setHasStories(N2());
                }
                gr8 gr8Var3 = this.O;
                if (gr8Var3 != null) {
                    gr8Var3.setUserInfo(this.w2);
                }
                if (this.r0 != null) {
                    if (this.d != null && !TextUtils.equals(this.w2.about, this.A2)) {
                        this.d.g(this.X2);
                    }
                    if (this.s1) {
                        Z3(false, false);
                    }
                } else {
                    if (this.G1 || this.L0) {
                        this.I1 = true;
                    } else {
                        L1(true);
                    }
                    Z3(false, false);
                    gr8 gr8Var4 = this.O;
                    if (gr8Var4 != null) {
                        gr8Var4.setCommonGroupsCount(this.w2.common_chats_count);
                        V();
                        wia wiaVar = this.R;
                        if (wiaVar == null || wiaVar.E) {
                            resumeDelayedFragmentAnimation();
                            O2(true);
                        }
                    }
                }
                I3();
                k4();
                if (this.x2 == null && !s2()) {
                    ts8 ts8Var = new ts8(this.currentAccount);
                    this.x2 = ts8Var;
                    y56 y56Var = new y56(this, (byte) 17);
                    if (ts8Var.c) {
                        y56Var.run();
                    } else {
                        ts8Var.h.add(y56Var);
                    }
                    this.x2.b(this.w2);
                }
                if (!s2()) {
                    ks8 ks8Var = this.z2;
                    ks8 c = ks8.c(this.currentAccount, this.w2, ks8Var);
                    this.z2 = c;
                    this.y2 = c != ks8Var;
                    if (c != null) {
                        y56 y56Var2 = new y56(this, (byte) 18);
                        if (c.b) {
                            y56Var2.run();
                        } else {
                            c.h.add(y56Var2);
                        }
                    }
                }
                if (this.T0 != null) {
                    boolean o2 = o2();
                    sla slaVar = this.T0;
                    if (o2) {
                        slaVar.S(44);
                    } else {
                        slaVar.u(44);
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
        if (i == jn7.k0) {
            return;
        }
        if (i == 1) {
            if (((Boolean) objArr[2]).booleanValue() || a() != ((Long) objArr[0]).longValue()) {
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[1];
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                r47 r47Var = (r47) arrayList.get(i7);
                if (this.E2 != null) {
                    TLRPC.MessageAction messageAction = r47Var.k.action;
                    if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (wr8Var = this.d) != null) {
                        wr8Var.f();
                    }
                }
            }
            return;
        }
        if (i == jn7.l4) {
            zp8 zp8Var3 = this.a;
            if (zp8Var3 != null) {
                zp8Var3.i1();
                return;
            }
            return;
        }
        if (i == jn7.A4) {
            Z3(false, false);
            return;
        }
        if (i == jn7.s1) {
            int i8 = this.d3;
            int i9 = this.b3;
            int i10 = this.Z2;
            f4();
            wr8 wr8Var2 = this.d;
            if (wr8Var2 != null) {
                if (i8 == this.d3 && i9 == this.b3 && i10 == this.Z2) {
                    return;
                }
                wr8Var2.f();
                return;
            }
            return;
        }
        if (i == jn7.t5) {
            if (this.q1) {
                e4(false);
                return;
            }
            return;
        }
        if (i == jn7.D1) {
            fs8 fs8Var = this.e;
            if (fs8Var != null) {
                fs8Var.c = fs8.H(this);
                this.e.w.clear();
                this.e.J();
                fs8 fs8Var2 = this.e;
                fs8Var2.I(fs8Var2.E);
                return;
            }
            return;
        }
        if (i == jn7.c0) {
            e4(false);
            return;
        }
        if (i == jn7.y5 || i == jn7.I5) {
            iq8 iq8Var4 = this.f0;
            if (iq8Var4 != null) {
                iq8Var4.setHasStories(N2());
                this.f0.setRoundRadiusForExpand((int) hl.R1(m2(), 0.0f, this.l2));
            }
            lq8 lq8Var4 = this.v0;
            if (lq8Var4 != null) {
                TLRPC.UserFull userFull3 = this.w2;
                if (userFull3 != null) {
                    lq8Var4.setStories(userFull3.stories);
                    return;
                }
                TLRPC.ChatFull chatFull8 = this.v2;
                if (chatFull8 != null) {
                    lq8Var4.setStories(chatFull8.stories);
                    return;
                }
                return;
            }
            return;
        }
        byte b = 20;
        if (i == jn7.k3) {
            sla slaVar2 = this.T0;
            if (slaVar2 != null) {
                TL_account.RequirementToContact P2 = getMessagesController().P2(this.e1);
                if (P2 != null && !(P2 instanceof TL_account.requirementToContactEmpty)) {
                    r2 = false;
                }
                slaVar2.Q(20, r2);
            }
            L3();
            return;
        }
        if (i == jn7.i5) {
            L3();
            return;
        }
        if (i == jn7.A3) {
            Z3(false, false);
            return;
        }
        if (i == jn7.E3) {
            Z3(false, false);
            return;
        }
        if (i == jn7.F3) {
            Z3(false, false);
            return;
        }
        if (i == jn7.y1) {
            if (a() == ((Long) objArr[0]).longValue()) {
                wk5 wk5Var2 = this.parentLayout;
                if (wk5Var2 == null || wk5Var2.getLastFragment() != this) {
                    removeSelfFromStack();
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            return;
        }
        if (i == jn7.h3) {
            long longValue3 = ((Long) objArr[0]).longValue();
            if (this.N4 >= 0 || longValue3 != a()) {
                return;
            }
            f4();
            V();
            wr8 wr8Var3 = this.d;
            if (wr8Var3 != null) {
                wr8Var3.f();
                return;
            }
            return;
        }
        if (i == jn7.I3) {
            if (((Long) objArr[0]).longValue() != a() || s2()) {
                return;
            }
            if (this.N4 >= 0) {
                gr8 gr8Var5 = this.O;
                if (gr8Var5 != null) {
                    gr8Var5.N1(true);
                    return;
                }
                return;
            }
            f4();
            V();
            wr8 wr8Var4 = this.d;
            if (wr8Var4 != null) {
                wr8Var4.f();
            }
            hl.c3(new y56(this, (byte) 19));
            return;
        }
        if (i == jn7.Y3) {
            if (((Long) objArr[0]).longValue() != a() || this.e1 <= 0) {
                return;
            }
            TLRPC.UserFull Y1 = getMessagesController().Y1(this.e1);
            if (Y1 != null) {
                this.w2 = Y1;
            }
            f4();
            V();
            zp8 zp8Var4 = this.a;
            if (zp8Var4 != null && zp8Var4.e0()) {
                this.a.post(new y56(this, b));
                return;
            }
            wr8 wr8Var5 = this.d;
            if (wr8Var5 != null) {
                wr8Var5.f();
                return;
            }
            return;
        }
        if (i != jn7.Z3) {
            return;
        }
        long longValue4 = ((Long) objArr[0]).longValue();
        long longValue5 = ((Long) objArr[1]).longValue();
        TLRPC.Chat chat4 = this.F2;
        if (chat4 == null || chat4.id != longValue4) {
            return;
        }
        String str = (String) objArr[2];
        zh6 zh6Var = this.C1;
        if (zh6Var != null && (chatParticipant = (TLRPC.ChatParticipant) zh6Var.f(longValue5)) != null) {
            chatParticipant.setRank(longValue5, str);
        }
        TLRPC.ChannelParticipant channelParticipant = this.H2;
        if (channelParticipant != null && channelParticipant.user_id == longValue5) {
            channelParticipant.rank = str;
        }
        while (true) {
            ArrayList arrayList2 = this.U4;
            if (i3 >= arrayList2.size()) {
                hl.V3(this.a);
                return;
            } else {
                ((TLRPC.ChatParticipant) arrayList2.get(i3)).setRank(longValue5, str);
                i3++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void dismissCurrentDialog() {
        zn5 zn5Var = this.r0;
        if (zn5Var == null || !zn5Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean dismissDialogOnPause(Dialog dialog) {
        zn5 zn5Var = this.r0;
        return (zn5Var == null || dialog != zn5Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // tha
    public final TLRPC.Chat e() {
        return this.F2;
    }

    public final int e2() {
        return X1() == 0 ? hl.L(168.0f) : hl.L(152.0f);
    }

    public final void e3(int i, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z) {
        boolean[] zArr = new boolean[1];
        sq8 sq8Var = new sq8(this, user.id, this.f1, tL_chatAdminRights, this.F2.default_banned_rights, tL_chatBannedRights, str, i, zArr, user);
        sq8Var.Y0 = new tq8(this, i, chatParticipant, z, zArr);
        presentFragment(sq8Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(50:(1:285)(1:87)|88|(1:91)|(1:283)(1:97)|98|(2:100|(2:102|(1:104))(2:223|(1:230)(1:229)))(2:231|(1:233)(2:234|(1:282)(2:240|(1:242)(2:243|(2:245|(1:247)(1:248))(40:249|(1:251)(1:281)|252|(1:280)(1:266)|267|(2:269|(4:271|(1:279)(1:275)|276|(1:278)))|106|(1:222)(1:110)|111|112|113|(1:115)|116|(1:118)|119|(3:121|(1:123)|124)(1:219)|125|(1:127)(1:218)|128|(2:130|(1:132))(1:217)|133|(3:213|(1:215)|216)(2:137|(1:139)(1:212))|140|(2:208|(1:210)(1:211))(1:144)|(1:207)(1:150)|151|(1:206)|154|(2:156|(1:158))|159|(2:161|(1:163))|164|(3:166|(2:168|(1:194)(1:174))(1:195)|175)(4:196|(1:205)(1:202)|203|204)|176|(1:178)|179|(1:193)(1:185)|186|(1:188)|189)))))|105|106|(1:108)|222|111|112|113|(0)|116|(0)|119|(0)(0)|125|(0)(0)|128|(0)(0)|133|(1:135)|213|(0)|216|140|(1:142)|208|(0)(0)|(1:146)|207|151|(0)|206|154|(0)|159|(0)|164|(0)(0)|176|(0)|179|(2:181|183)|193|186|(0)|189) */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x065c, code lost:
    
        if (r33.v2.can_view_participants != false) goto L336;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0855 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e4(boolean z) {
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
        jn5 m;
        jn5 m2;
        jn5 C;
        View m3;
        TLRPC.Chat chat;
        jn5 jn5Var;
        int i;
        TLRPC.VideoSize videoSize;
        idc idcVar;
        TLRPC.User user;
        jn5 jn5Var2;
        jn5 jn5Var3;
        TLRPC.User user2;
        TLRPC.UserStatus userStatus;
        boolean z5;
        jla jlaVar;
        gs8 gs8Var;
        Drawable drawable;
        boolean z6;
        boolean F2;
        boolean z7;
        boolean z8;
        kz1 kz1Var;
        String str2;
        TL_stars.Tl_starsRating tl_starsRating;
        TL_stars.Tl_starsRating tl_starsRating2;
        jn5 jn5Var4;
        uj3 uj3Var;
        li3 li3Var;
        if (this.Y == null || this.f == null || getParentActivity() == null) {
            return;
        }
        wk5 wk5Var = this.parentLayout;
        if (wk5Var == null || wk5Var.getFragmentStack().size() < 2) {
            obj = null;
        } else {
            Object obj2 = (org.telegram.ui.ActionBar.e) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            obj = obj2 instanceof kz1 ? obj2 : null;
            if (obj2 instanceof fj6) {
                obj2 = ((fj6) obj2).M;
            }
            if ((obj2 instanceof uj3) && (li3Var = (uj3Var = (uj3) obj2).H3) != null) {
                si3 si3Var = li3Var.a;
                if (ik8.A(si3Var)) {
                    this.l5 = uj3Var;
                    obj = si3Var;
                }
            }
        }
        if (obj instanceof zu1) {
            zu1 zu1Var = (zu1) obj;
            if (zu1Var.p1 != null && zu1Var.g4 == 8) {
                z2 = true;
                this.v5 = false;
                this.w5 = false;
                str = "";
                if (this.e1 == 0) {
                    TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e1));
                    if (X1 == null) {
                        return;
                    }
                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                    boolean z9 = userProfilePhoto != null && userProfilePhoto.personal;
                    TLRPC.FileLocation fileLocation = userProfilePhoto != null ? userProfilePhoto.photo_big : null;
                    this.q0.q(X1);
                    boolean z10 = z9;
                    TLRPC.EmojiStatus emojiStatus = getMessagesController().L2(X1.id) ? null : X1.emoji_status;
                    kc7 kc7Var = this.n6;
                    kc7 a = kc7.a(emojiStatus);
                    this.n6 = a;
                    if (a == null) {
                        int n = lbc.n(X1);
                        lc7 lc7Var = uc7.s1(this.currentAccount).F3;
                        a = lc7Var == null ? null : lc7Var.d(n);
                        this.n6 = a;
                    }
                    if (kc7Var != a) {
                        m4();
                    }
                    is8 is8Var = this.d1;
                    if (is8Var != null) {
                        boolean z11 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
                        is8Var.b(z11 ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).pattern_document_id : lbc.m(X1), z11);
                    }
                    jva jvaVar = this.T;
                    if (jvaVar != null) {
                        jvaVar.b.a(this.n6);
                        jvaVar.invalidate();
                    }
                    s3(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? emojiStatus : null);
                    jn5 m4 = jn5.m(yac.t0, 0, X1);
                    jn5 m5 = jn5.m(yac.t0, 1, X1);
                    jn5 m6 = jn5.m(yac.t0, 4, X1);
                    TLRPC.UserFull userFull = this.w2;
                    if (userFull != null) {
                        TLRPC.UserProfilePhoto userProfilePhoto2 = X1.photo;
                        videoSize = xb4.R((userProfilePhoto2 == null || !userProfilePhoto2.personal) ? userFull.profile_photo : userFull.personal_photo);
                        if (videoSize != null) {
                            idcVar = new idc(videoSize, X1.premium, 2);
                            jn5 C2 = this.o0.C(m5, m4);
                            if (this.J2 == null) {
                                this.o0.H(idcVar, m4, m5, z);
                            }
                            if (this.K2 == null) {
                                if (videoSize != null) {
                                    this.f0.setImageDrawable(idcVar);
                                } else {
                                    if (m6 == null || X1.photo.personal) {
                                        user = X1;
                                        jn5Var3 = m5;
                                        iq8 iq8Var = this.f0;
                                        iq8Var.a.Y(C2, "g", m4, "100_100", jn5Var3, "50_50", this.q0, 0L, null, user, 1);
                                        jn5Var2 = m4;
                                        iq8Var.e();
                                    } else {
                                        this.f0.getImageReceiver().z1 = true;
                                        iq8 iq8Var2 = this.f0;
                                        user = X1;
                                        jn5Var3 = m5;
                                        iq8Var2.a.Y(m6, "avatar", m4, "50_50", jn5Var3, "50_50", this.q0, 0L, null, user, 1);
                                        iq8Var2.e();
                                        jn5Var2 = m4;
                                    }
                                    int i2 = this.P2;
                                    if (jn5Var3 == null ? i2 == -1 : i2 != -1) {
                                        Z3(false, false);
                                        O2(true);
                                    }
                                    if (jn5Var2 != null || ((jn5Var4 = this.C0) != null && jn5Var2.s == jn5Var4.s)) {
                                        user2 = user;
                                    } else {
                                        this.C0 = jn5Var2;
                                        TLRPC.User user3 = user;
                                        getFileLoader().V(jn5Var2, user3, null, 0, 1);
                                        user2 = user3;
                                    }
                                    CharSequence r = lbc.r(user2);
                                    if (user2.id != getUserConfig().e()) {
                                        long j2 = user2.id;
                                        if (j2 == 489000) {
                                            str = ob6.M0(2131743271, null);
                                        } else if (j2 == 333000 || j2 == 777000 || j2 == 42777) {
                                            str = ob6.M0(2131745289, null);
                                        } else if (uc7.K2(user2)) {
                                            str = ob6.M0(2131743978, null);
                                        } else if (this.s2) {
                                            int i3 = user2.bot_active_users;
                                            str = i3 != 0 ? ob6.H(',', "BotUsers", i3) : lbc.e(user2);
                                        } else {
                                            boolean[] zArr = this.K0;
                                            zArr[0] = false;
                                            str = ob6.d0(this.currentAccount, user2, zArr, z10 ? new boolean[1] : null);
                                            boolean z12 = (zArr[0] || getUserConfig().p() || (userStatus = user2.status) == null || (!(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) || !userStatus.by_me) ? false : true;
                                            kq8 kq8Var = this.r;
                                            z5 = z12;
                                            if (kq8Var != null) {
                                                z5 = z12;
                                                if (!this.X5) {
                                                    int i4 = (zArr[0] && this.n6 == null) ? aob.si : aob.B8;
                                                    kq8Var.setTag(Integer.valueOf(i4));
                                                    z5 = z12;
                                                    if (!this.q2) {
                                                        this.r.setTextColor(A1(aob.v0(i4, this.A0), Boolean.valueOf(zArr[0])));
                                                        z5 = z12;
                                                    }
                                                }
                                            }
                                            TLRPC.UserProfilePhoto userProfilePhoto3 = user2.photo;
                                            this.w5 = userProfilePhoto3 == null && userProfilePhoto3.personal;
                                            r = pv3.m(r, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                            if (z2) {
                                                this.f0.setAnimateFromImageReceiver(((zu1) obj).p1.getAvatarImageView().getImageReceiver());
                                            }
                                            this.f.l(r, false);
                                            jlaVar = this.simpleActionBar;
                                            if (jlaVar != null) {
                                                jlaVar.setTitle(r);
                                            }
                                            this.r.setDrawablePadding(hl.L(9.0f));
                                            this.r.setRightDrawableInside(true);
                                            kq8 kq8Var2 = this.r;
                                            if (z5) {
                                                gs8Var = null;
                                            } else {
                                                if (this.F6 == null) {
                                                    gs8 gs8Var2 = new gs8(ob6.M0(2131744547, null));
                                                    this.F6 = gs8Var2;
                                                    gs8Var2.setAlpha((int) (Math.min(1.0f, this.Q1 / d2()) * 255.0f));
                                                    this.F6.a(vm2.f(this.l2, aob.p1(0.5f, aob.a(0.18f, -0.1f, this.c1)), 603979775));
                                                }
                                                gs8Var = this.F6;
                                            }
                                            kq8Var2.i(gs8Var);
                                            this.r.setRightDrawableOnClick(!z5 ? new fp8(this, (byte) 5) : null);
                                            if (this.E2 == null) {
                                                drawable = this.x;
                                                if (drawable == null) {
                                                    drawable = aob.l4.getConstantState().newDrawable().mutate();
                                                    this.x = drawable;
                                                }
                                            } else {
                                                drawable = null;
                                            }
                                            this.f.setRightDrawableOutside(false);
                                            z6 = user2.scam;
                                            if (!z6 || user2.fake) {
                                                ns1 ns1Var = this.f;
                                                int i5 = !z6 ? 1 : 0;
                                                if (this.L == null) {
                                                    yt9 yt9Var = new yt9(i5);
                                                    this.L = yt9Var;
                                                    yt9Var.b(aob.v0(aob.h8, this.A0));
                                                }
                                                ns1Var.j(this.L);
                                                this.n = ob6.M0(2131745590, null);
                                            } else {
                                                boolean z13 = user2.verified;
                                                ns1 ns1Var2 = this.f;
                                                if (z13) {
                                                    ns1Var2.j(n2());
                                                    this.n = ob6.M0(2131754734, null);
                                                } else {
                                                    ns1Var2.j(null);
                                                    this.n = null;
                                                }
                                            }
                                            if (!uc7.K2(user2) || wf3.f(emojiStatus) == 0) {
                                                getMessagesController().getClass();
                                                F2 = uc7.F2(user2);
                                                ns1 ns1Var3 = this.f;
                                                if (F2) {
                                                    ns1Var3.i(null);
                                                    this.h = null;
                                                    z7 = false;
                                                    z8 = false;
                                                } else {
                                                    ns1Var3.i(b2(null, true));
                                                    this.h = ob6.M0(2131754797, null);
                                                    z7 = true;
                                                    z8 = false;
                                                }
                                            } else {
                                                this.f.i(b2(emojiStatus, true));
                                                this.h = ob6.M0(2131754797, null);
                                                z8 = true;
                                                z7 = false;
                                            }
                                            if (drawable == null || this.E2 != null || user2.bot_verification_icon == 0) {
                                                this.f.setLeftDrawableOutside(false);
                                            } else {
                                                this.f.setLeftDrawableOutside(true);
                                                drawable = Z1(user2.bot_verification_icon);
                                            }
                                            this.f.setLeftDrawable(drawable);
                                            if (!z8 || z7) {
                                                this.f.setRightDrawableOutside(true);
                                            }
                                            if (user2.self) {
                                                getMessagesController().getClass();
                                                if (uc7.F2(user2)) {
                                                    this.f.setRightDrawableOnClick(new fp8(this, (byte) 6));
                                                }
                                            }
                                            if (!user2.self) {
                                                getMessagesController().getClass();
                                                if (uc7.F2(user2)) {
                                                    ns1 ns1Var4 = this.f;
                                                    TLRPC.User user4 = user2;
                                                    user2 = user4;
                                                    ns1Var4.setRightDrawableOnClick(new cg((Object) this, (Object) emojiStatus, (Object) user4, (Object) ns1Var4, (byte) 14));
                                                }
                                            }
                                            if (this.e1 != yac.h(this.currentAccount).n) {
                                                if (this.v5) {
                                                    TLRPC.UserFull userFull2 = this.w2;
                                                    if (userFull2 == null || (tl_starsRating = userFull2.stars_rating) == null || tl_starsRating.stars >= 0) {
                                                        str2 = null;
                                                        str = ob6.M0(2131747553, null);
                                                    } else {
                                                        str2 = null;
                                                        str = ob6.M0(2131744830, null).toLowerCase(Locale.ROOT);
                                                    }
                                                } else {
                                                    str2 = null;
                                                }
                                                this.z6 = ob6.M0(2131750807, str2);
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                                                spannableStringBuilder.append((CharSequence) " d ");
                                                TLRPC.UserProfilePhoto userProfilePhoto4 = user2.photo;
                                                spannableStringBuilder.append((CharSequence) ob6.M0((userProfilePhoto4 != null && userProfilePhoto4.personal && userProfilePhoto4.has_video) ? 2131751652 : 2131751653, null));
                                                spannableStringBuilder.setSpan(new np3(), str.length() + 1, str.length() + 2, 0);
                                                this.z6 = spannableStringBuilder;
                                            }
                                            this.y6 = str;
                                            d4();
                                            kz1Var = this.m5;
                                            if (kz1Var != null) {
                                                kz1Var.r();
                                            }
                                            this.f0.getImageReceiver().v0(PhotoViewer.S0(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                                        }
                                    } else if (lbc.s(this.w2)) {
                                        this.v5 = true;
                                        TLRPC.PhotoSize w = xb4.w(this.w2.fallback_photo.sizes, 1000, false, null, false);
                                        if (w != null) {
                                            this.x5.c0(jn5.i(w, this.w2.fallback_photo), "50_50", null, 0L, null, yac.h(this.currentAccount).f(), 0);
                                        }
                                    } else {
                                        TLRPC.UserFull userFull3 = this.w2;
                                        str = (userFull3 == null || (tl_starsRating2 = userFull3.stars_rating) == null || tl_starsRating2.stars >= 0) ? ob6.M0(2131747553, null) : ob6.M0(2131744830, null).toLowerCase(Locale.ROOT);
                                    }
                                    z5 = false;
                                    TLRPC.UserProfilePhoto userProfilePhoto32 = user2.photo;
                                    this.w5 = userProfilePhoto32 == null && userProfilePhoto32.personal;
                                    r = pv3.m(r, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                    if (z2) {
                                    }
                                    this.f.l(r, false);
                                    jlaVar = this.simpleActionBar;
                                    if (jlaVar != null) {
                                    }
                                    this.r.setDrawablePadding(hl.L(9.0f));
                                    this.r.setRightDrawableInside(true);
                                    kq8 kq8Var22 = this.r;
                                    if (z5) {
                                    }
                                    kq8Var22.i(gs8Var);
                                    this.r.setRightDrawableOnClick(!z5 ? new fp8(this, (byte) 5) : null);
                                    if (this.E2 == null) {
                                    }
                                    this.f.setRightDrawableOutside(false);
                                    z6 = user2.scam;
                                    if (z6) {
                                    }
                                    ns1 ns1Var5 = this.f;
                                    int i52 = !z6 ? 1 : 0;
                                    if (this.L == null) {
                                    }
                                    ns1Var5.j(this.L);
                                    this.n = ob6.M0(2131745590, null);
                                    if (uc7.K2(user2)) {
                                    }
                                    getMessagesController().getClass();
                                    F2 = uc7.F2(user2);
                                    ns1 ns1Var32 = this.f;
                                    if (F2) {
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
                                    if (this.e1 != yac.h(this.currentAccount).n) {
                                    }
                                    this.y6 = str;
                                    d4();
                                    kz1Var = this.m5;
                                    if (kz1Var != null) {
                                    }
                                    this.f0.getImageReceiver().v0(PhotoViewer.S0(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                                }
                            }
                            user = X1;
                            jn5Var2 = m4;
                            jn5Var3 = m5;
                            int i22 = this.P2;
                            if (jn5Var3 == null) {
                                Z3(false, false);
                                O2(true);
                                if (jn5Var2 != null) {
                                }
                                user2 = user;
                                CharSequence r2 = lbc.r(user2);
                                if (user2.id != getUserConfig().e()) {
                                }
                                z5 = false;
                                TLRPC.UserProfilePhoto userProfilePhoto322 = user2.photo;
                                this.w5 = userProfilePhoto322 == null && userProfilePhoto322.personal;
                                r2 = pv3.m(r2, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                if (z2) {
                                }
                                this.f.l(r2, false);
                                jlaVar = this.simpleActionBar;
                                if (jlaVar != null) {
                                }
                                this.r.setDrawablePadding(hl.L(9.0f));
                                this.r.setRightDrawableInside(true);
                                kq8 kq8Var222 = this.r;
                                if (z5) {
                                }
                                kq8Var222.i(gs8Var);
                                this.r.setRightDrawableOnClick(!z5 ? new fp8(this, (byte) 5) : null);
                                if (this.E2 == null) {
                                }
                                this.f.setRightDrawableOutside(false);
                                z6 = user2.scam;
                                if (z6) {
                                }
                                ns1 ns1Var52 = this.f;
                                int i522 = !z6 ? 1 : 0;
                                if (this.L == null) {
                                }
                                ns1Var52.j(this.L);
                                this.n = ob6.M0(2131745590, null);
                                if (uc7.K2(user2)) {
                                }
                                getMessagesController().getClass();
                                F2 = uc7.F2(user2);
                                ns1 ns1Var322 = this.f;
                                if (F2) {
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
                                if (this.e1 != yac.h(this.currentAccount).n) {
                                }
                                this.y6 = str;
                                d4();
                                kz1Var = this.m5;
                                if (kz1Var != null) {
                                }
                                this.f0.getImageReceiver().v0(PhotoViewer.S0(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                            } else {
                                Z3(false, false);
                                O2(true);
                                if (jn5Var2 != null) {
                                }
                                user2 = user;
                                CharSequence r22 = lbc.r(user2);
                                if (user2.id != getUserConfig().e()) {
                                }
                                z5 = false;
                                TLRPC.UserProfilePhoto userProfilePhoto3222 = user2.photo;
                                this.w5 = userProfilePhoto3222 == null && userProfilePhoto3222.personal;
                                r22 = pv3.m(r22, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                if (z2) {
                                }
                                this.f.l(r22, false);
                                jlaVar = this.simpleActionBar;
                                if (jlaVar != null) {
                                }
                                this.r.setDrawablePadding(hl.L(9.0f));
                                this.r.setRightDrawableInside(true);
                                kq8 kq8Var2222 = this.r;
                                if (z5) {
                                }
                                kq8Var2222.i(gs8Var);
                                this.r.setRightDrawableOnClick(!z5 ? new fp8(this, (byte) 5) : null);
                                if (this.E2 == null) {
                                }
                                this.f.setRightDrawableOutside(false);
                                z6 = user2.scam;
                                if (z6) {
                                }
                                ns1 ns1Var522 = this.f;
                                int i5222 = !z6 ? 1 : 0;
                                if (this.L == null) {
                                }
                                ns1Var522.j(this.L);
                                this.n = ob6.M0(2131745590, null);
                                if (uc7.K2(user2)) {
                                }
                                getMessagesController().getClass();
                                F2 = uc7.F2(user2);
                                ns1 ns1Var3222 = this.f;
                                if (F2) {
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
                                if (this.e1 != yac.h(this.currentAccount).n) {
                                }
                                this.y6 = str;
                                d4();
                                kz1Var = this.m5;
                                if (kz1Var != null) {
                                }
                                this.f0.getImageReceiver().v0(PhotoViewer.S0(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                            }
                        }
                    } else {
                        videoSize = null;
                    }
                    idcVar = null;
                    jn5 C22 = this.o0.C(m5, m4);
                    if (this.J2 == null) {
                    }
                    if (this.K2 == null) {
                    }
                    user = X1;
                    jn5Var2 = m4;
                    jn5Var3 = m5;
                    int i222 = this.P2;
                    if (jn5Var3 == null) {
                    }
                } else if (this.f1 != 0) {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                    if (M0 != null) {
                        this.F2 = M0;
                    } else {
                        M0 = this.F2;
                    }
                    c34 c34Var = this.Y1;
                    if (c34Var != null) {
                        c34Var.i();
                    }
                    kc7 kc7Var2 = this.n6;
                    kc7 a2 = kc7.a(M0.emoji_status);
                    this.n6 = a2;
                    if (a2 == null) {
                        int I = xc2.I(M0);
                        lc7 lc7Var2 = uc7.s1(this.currentAccount).F3;
                        a2 = lc7Var2 == null ? null : lc7Var2.d(I);
                        this.n6 = a2;
                    }
                    if (kc7Var2 != a2) {
                        m4();
                    }
                    is8 is8Var2 = this.d1;
                    if (is8Var2 != null) {
                        is8Var2.b(xc2.J(M0), M0.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    TLRPC.EmojiStatus emojiStatus2 = M0.emoji_status;
                    s3(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null);
                    TLRPC.TL_forumTopic f2 = this.q1 ? getMessagesController().g4.f(this.f1, this.g1) : null;
                    if (xc2.T(M0)) {
                        if (!this.q1) {
                            TLRPC.ChatFull chatFull = this.v2;
                            if (chatFull != null) {
                                TLRPC.Chat chat2 = this.F2;
                                if (!chat2.megagroup) {
                                    if (chatFull.participants_count != 0) {
                                        if (!xc2.N(chat2)) {
                                        }
                                    }
                                }
                            }
                            G = this.F2.megagroup ? ob6.M0(2131748533, null).toLowerCase() : xc2.t0(M0) ? ob6.M0(2131752288, null).toLowerCase() : ob6.M0(2131752299, null).toLowerCase();
                        }
                        if (this.q1) {
                            int i6 = f2 != null ? f2.totalMessagesCount - 1 : 0;
                            if (i6 > 0) {
                                ob6.G(i6, "messages", Integer.valueOf(i6));
                            } else {
                                ob6.a0("TopicProfileStatus", null, 2131743667, M0.title);
                            }
                            SpannableString spannableString = new SpannableString(">");
                            spannableString.setSpan(new wm2(R.drawable.arrow_newchat, 0), 0, 1, 33);
                            G = new SpannableStringBuilder(M0.title).append(' ').append((CharSequence) spannableString);
                            z3 = true;
                            if (z2) {
                                zu1 zu1Var2 = (zu1) obj;
                                boolean z14 = zu1Var2.p1.getSubtitleTextView() instanceof ema;
                                qq1 qq1Var = zu1Var2.p1;
                                if (z14) {
                                    ((ema) qq1Var.getSubtitleTextView()).getText();
                                } else if (qq1Var.getSubtitleTextView() instanceof in) {
                                    ((in) zu1Var2.p1.getSubtitleTextView()).getText();
                                }
                                this.f0.setAnimateFromImageReceiver(zu1Var2.p1.getAvatarImageView().getImageReceiver());
                            }
                            if (!this.q1) {
                                charSequence = f2 != null ? f2.title : "";
                            } else if (xc2.p0(M0)) {
                                charSequence = ob6.M0(2131752184, null);
                            } else {
                                charSequence = M0.title;
                                if (charSequence == null) {
                                    charSequence = null;
                                }
                            }
                            if (charSequence == null) {
                                try {
                                    charSequence = pv3.m(charSequence, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                } catch (Exception unused) {
                                }
                                l = this.f.l(charSequence, false);
                                jla jlaVar2 = this.simpleActionBar;
                                if (jlaVar2 != null) {
                                    jlaVar2.setTitle(charSequence);
                                }
                            } else {
                                l = false;
                            }
                            this.f.setLeftDrawableOutside(false);
                            this.f.setLeftDrawable((Drawable) null);
                            this.f.setRightDrawableOutside(false);
                            this.f.setRightDrawableOnClick(null);
                            this.n = null;
                            z4 = M0.scam;
                            if (!z4 || M0.fake) {
                                ns1 ns1Var6 = this.f;
                                int i7 = !z4 ? 1 : 0;
                                if (this.L == null) {
                                    yt9 yt9Var2 = new yt9(i7);
                                    this.L = yt9Var2;
                                    yt9Var2.b(aob.v0(aob.h8, this.A0));
                                }
                                ns1Var6.j(this.L);
                                this.h = ob6.M0(2131745590, null);
                            } else {
                                boolean z15 = M0.verified;
                                ns1 ns1Var7 = this.f;
                                if (z15) {
                                    ns1Var7.j(n2());
                                    this.h = ob6.M0(2131754734, null);
                                } else {
                                    ns1Var7.j(null);
                                    this.h = null;
                                }
                            }
                            f = wf3.f(M0.emoji_status);
                            ns1 ns1Var8 = this.f;
                            if (f == 0) {
                                ns1Var8.i(b2(M0.emoji_status, false));
                                this.f.setRightDrawableOutside(true);
                                this.h = null;
                                if (xc2.w(1, M0)) {
                                    this.f.setRightDrawableOnClick(new fp8(this, (byte) 7));
                                    if (this.S) {
                                        this.S = true;
                                        getMediaDataController().Z0();
                                    }
                                } else {
                                    TLRPC.EmojiStatus emojiStatus3 = M0.emoji_status;
                                    if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                                        this.f.setRightDrawableOnClick(new pp8(this, ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug, r9 ? (byte) 1 : (byte) 0));
                                    }
                                }
                            } else {
                                ns1Var8.i(null);
                            }
                            j = M0.bot_verification_icon;
                            ns1 ns1Var9 = this.f;
                            if (j == 0) {
                                ns1Var9.setLeftDrawableOutside(true);
                                this.f.setLeftDrawable(Z1(M0.bot_verification_icon));
                            } else {
                                ns1Var9.setLeftDrawable((Drawable) null);
                            }
                            if (xc2.d0(this.currentAccount, this.i1)) {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) "* ");
                                spannableStringBuilder2.setSpan(new wm2(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
                                spannableStringBuilder2.append((CharSequence) ob6.M0(2131751891, null));
                                spannableStringBuilder2.append((CharSequence) " * ");
                                int length = spannableStringBuilder2.length();
                                spannableStringBuilder2.setSpan(new np3(), length - 2, length - 1, 33);
                                spannableStringBuilder2.append(G);
                                G = spannableStringBuilder2;
                            }
                            this.y6 = G;
                            this.z6 = null;
                            d4();
                            if (this.q1) {
                                kq8 kq8Var3 = this.r;
                                if (z3) {
                                    kq8Var3.setOnClickListener(new fp8(this, (byte) 8));
                                } else {
                                    kq8Var3.setOnClickListener(null);
                                    this.r.setClickable(false);
                                }
                            }
                            if (l) {
                                O2(true);
                            }
                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                            TLRPC.FileLocation fileLocation2 = (chatPhoto != null || this.q1) ? null : chatPhoto.photo_big;
                            if (!this.q1) {
                                ro4.q(this.f0, f2, true, true, this.A0);
                                m2 = null;
                                C = null;
                                m = null;
                            } else if (xc2.p0(this.F2)) {
                                TLRPC.Chat u1 = getMessagesController().u1(this.F2.id);
                                this.q0.p(u1);
                                m = jn5.m(this.currentAccount, 0, u1);
                                m2 = jn5.m(this.currentAccount, 1, u1);
                                C = this.o0.C(m2, m);
                            } else {
                                this.q0.p(M0);
                                m = jn5.m(this.currentAccount, 0, M0);
                                m2 = jn5.m(this.currentAccount, 1, M0);
                                jq8 jq8Var = this.o0;
                                C = jq8Var != null ? jq8Var.C(m2, m) : null;
                            }
                            boolean H = this.o0.H(null, m, m2, z);
                            if ((m != null || H) && this.q2 && (m3 = this.c.m(0)) != null) {
                                this.a.y0(0, m3.getTop() - d2(), k43.h);
                            }
                            String str3 = (C == null && C.p == 2) ? "g" : null;
                            if (this.K2 == null || this.q1) {
                                chat = M0;
                            } else {
                                TLRPC.Chat chat3 = M0;
                                this.f0.j(C, str3, m2, "50_50", this.q0, chat3);
                                chat = chat3;
                            }
                            if (m != null && ((jn5Var = this.C0) == null || m.s != jn5Var.s)) {
                                this.C0 = m;
                                getFileLoader().V(m, chat, null, 0, 1);
                            }
                            this.f0.getImageReceiver().v0(PhotoViewer.S0(fileLocation2) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                        } else if (!this.F2.megagroup) {
                            ob6.S(new int[1], this.v2.participants_count);
                            boolean z16 = this.F2.megagroup;
                            TLRPC.ChatFull chatFull2 = this.v2;
                            if (z16) {
                                ob6.G(chatFull2.participants_count, "Members", new Object[0]);
                                G = ob6.H(',', "Members", this.v2.participants_count);
                            } else {
                                ob6.G(chatFull2.participants_count, "Subscribers", new Object[0]);
                                G = ob6.H(',', "Subscribers", this.v2.participants_count);
                            }
                        } else if (this.C2 <= 1 || (i = this.v2.participants_count) == 0) {
                            int i8 = this.v2.participants_count;
                            if (i8 == 0) {
                                G = M0.has_geo ? ob6.M0(2131748396, null).toLowerCase() : xc2.t0(M0) ? ob6.M0(2131748392, null).toLowerCase() : ob6.M0(2131748395, null).toLowerCase();
                            } else {
                                ob6.G(i8, "Members", new Object[0]);
                                G = ob6.H(',', "Members", this.v2.participants_count);
                            }
                        } else {
                            ob6.G(i, "Members", new Object[0]);
                            ob6.G(Math.min(this.C2, this.v2.participants_count), "OnlineCount", new Object[0]);
                            G = qd4.y(ob6.H(',', "Members", this.v2.participants_count), ", ", ob6.H(',', "OnlineCount", Math.min(this.C2, this.v2.participants_count)));
                        }
                    } else if (xc2.k0(M0)) {
                        G = ob6.M0(2131742460, null);
                    } else if (xc2.l0(M0)) {
                        G = ob6.M0(2131742466, null);
                    } else {
                        int i9 = M0.participants_count;
                        TLRPC.ChatFull chatFull3 = this.v2;
                        if (chatFull3 != null && (chatParticipants = chatFull3.participants) != null) {
                            i9 = chatParticipants.participants.size();
                        }
                        G = (i9 == 0 || this.C2 <= 1) ? ob6.G(i9, "Members", new Object[0]) : qd4.y(ob6.G(i9, "Members", new Object[0]), ", ", ob6.G(this.C2, "OnlineCount", new Object[0]));
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
                    z4 = M0.scam;
                    if (z4) {
                    }
                    ns1 ns1Var62 = this.f;
                    int i72 = !z4 ? 1 : 0;
                    if (this.L == null) {
                    }
                    ns1Var62.j(this.L);
                    this.h = ob6.M0(2131745590, null);
                    f = wf3.f(M0.emoji_status);
                    ns1 ns1Var82 = this.f;
                    if (f == 0) {
                    }
                    j = M0.bot_verification_icon;
                    ns1 ns1Var92 = this.f;
                    if (j == 0) {
                    }
                    if (xc2.d0(this.currentAccount, this.i1)) {
                    }
                    this.y6 = G;
                    this.z6 = null;
                    d4();
                    if (this.q1) {
                    }
                    if (l) {
                    }
                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                    if (chatPhoto2 != null) {
                    }
                    if (!this.q1) {
                    }
                    boolean H2 = this.o0.H(null, m, m2, z);
                    if (m != null) {
                    }
                    this.a.y0(0, m3.getTop() - d2(), k43.h);
                    if (C == null) {
                    }
                    if (this.K2 == null) {
                    }
                    chat = M0;
                    if (m != null) {
                        this.C0 = m;
                        getFileLoader().V(m, chat, null, 0, 1);
                    }
                    this.f0.getImageReceiver().v0(PhotoViewer.S0(fileLocation2) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                }
                O2(true);
            }
        }
        z2 = false;
        this.v5 = false;
        this.w5 = false;
        str = "";
        if (this.e1 == 0) {
        }
        O2(true);
    }

    @Override // yn5
    public final boolean f() {
        return true;
    }

    public final float f2() {
        return Math.max(this.G5, this.W5);
    }

    public final void f3(String str, q1 q1Var) {
        if (str.startsWith("@")) {
            getMessagesController().H3(str.substring(1), this, 0, q1Var);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            uj3 uj3Var = new uj3(null);
            uj3Var.p2 = str;
            presentFragment(uj3Var);
        } else {
            if (!str.startsWith("/") || this.parentLayout.getFragmentStack().size() <= 1) {
                return;
            }
            org.telegram.ui.ActionBar.e eVar = (org.telegram.ui.ActionBar.e) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if (eVar instanceof zu1) {
                finishFragment();
                ((zu1) eVar).a0.L1(null, str, false, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0202, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationToBeDeprecated) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0b4e, code lost:
    
        if ((d2() + (r2 + r3)) < r18.a.getMeasuredHeight()) goto L670;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0175, code lost:
    
        if (r10.b.isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0195, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0193, code lost:
    
        if (r10.b.isEmpty() == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0b17  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0b3a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0b42  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0b5f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f4() {
        boolean z;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatParticipants chatParticipants2;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull4;
        int i;
        zp8 zp8Var;
        ap8 ap8Var;
        tu8 tu8Var;
        int i2;
        long j;
        boolean z2;
        TLRPC.UserFull userFull;
        boolean z3;
        TLRPC.UserFull userFull2;
        TL_payments.starRefProgram starrefprogram;
        ts8 ts8Var;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull5;
        TLRPC.UserFull userFull4;
        TLRPC.ChatFull chatFull6;
        TLRPC.UserFull userFull5;
        TL_bots.BotInfo botInfo;
        TLRPC.UserFull userFull6;
        TLRPC.UserFull userFull7;
        b4(false);
        int i3 = this.O2;
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
        this.q4 = -1;
        this.botPermissionBiometry = -1;
        this.botPermissionEmojiStatus = -1;
        this.botPermissionLocation = -1;
        this.s4 = -1;
        this.m4 = -1;
        this.n4 = -1;
        this.o4 = -1;
        this.p4 = -1;
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
        this.t4 = -1;
        this.u4 = -1;
        this.N3 = -1;
        this.Z3 = -1;
        this.O3 = -1;
        this.Q3 = -1;
        this.P3 = -1;
        this.S3 = -1;
        this.T3 = -1;
        this.U3 = -1;
        this.v4 = -1;
        this.D3 = -1;
        this.b4 = -1;
        this.c4 = -1;
        this.d4 = -1;
        this.e4 = -1;
        this.w4 = -1;
        this.x4 = -1;
        this.y4 = -1;
        this.z4 = -1;
        this.A4 = -1;
        this.B4 = -1;
        this.C4 = -1;
        this.J4 = -1;
        this.K4 = -1;
        this.H4 = -1;
        this.N4 = -1;
        this.R3 = -1;
        this.D4 = -1;
        this.E4 = -1;
        this.F4 = -1;
        this.G4 = -1;
        this.I4 = -1;
        this.L4 = false;
        boolean z4 = true;
        this.M4 = (this.e1 == 0 || (userFull7 = this.w2) == null || userFull7.wallet_card == null || (this.r0 != null && !this.s1)) ? false : true;
        this.O4 = -1;
        this.P4 = -1;
        this.Q4 = -1;
        ArrayList arrayList2 = this.U4;
        arrayList2.clear();
        ArrayList arrayList3 = this.V4;
        arrayList3.clear();
        wia wiaVar = this.R;
        if (wiaVar != null) {
            int[] iArr = wiaVar.c;
            int i4 = 0;
            while (true) {
                if (i4 >= iArr.length) {
                    z = false;
                    break;
                } else {
                    if (iArr[i4] > 0) {
                        z = true;
                        break;
                    }
                    i4++;
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
                long j2 = this.f1;
                if (j2 != 0) {
                    wb7 L0 = uc7.s1(this.currentAccount).L0(-j2);
                    if (L0 != null) {
                    }
                }
                if (this.s2) {
                    long j3 = this.e1;
                    if (j3 != 0) {
                        wb7 L02 = uc7.s1(this.currentAccount).L0(j3);
                        if (L02 != null) {
                        }
                    }
                }
            }
            if (this.e1 == 0) {
                TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e1));
                TLRPC.UserFull userFull8 = this.w2;
                if (userFull8 != null && userFull8.saved_music != null && (this.r0 == null || this.s1)) {
                    this.L4 = true;
                }
                if (this.B3 < 0 && this.C3 < 0) {
                    if (this.L4 || this.M4 || this.n6 != null || this.a0 == null) {
                        int i5 = this.O2;
                        this.O2 = i5 + 1;
                        this.C3 = i5;
                    } else {
                        int i6 = this.O2;
                        this.O2 = i6 + 1;
                        this.B3 = i6;
                    }
                }
                if (!lbc.D(X1) || this.s1) {
                    String p = lbc.p(X1);
                    TLRPC.UserFull userFull9 = this.w2;
                    boolean z5 = ((userFull9 == null || TextUtils.isEmpty(userFull9.about)) && (X1 == null || TextUtils.isEmpty(p))) ? false : true;
                    boolean z6 = (X1 == null || (TextUtils.isEmpty(X1.phone) && TextUtils.isEmpty(this.i5))) ? false : true;
                    if (!this.s2 && (userFull3 = this.w2) != null && userFull3.unofficial_security_risk) {
                        int i7 = this.O2;
                        this.m4 = i7;
                        this.O2 = i7 + 2;
                        this.n4 = i7 + 1;
                    }
                    TLRPC.UserFull userFull10 = this.w2;
                    if (userFull10 == null || (userFull10.flags2 & 64) == 0 || ((ts8Var = this.x2) != null && ts8Var.c && ts8Var.d.isEmpty())) {
                        j = 0;
                    } else {
                        j = 0;
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.w2.personal_channel_id));
                        if (M0 != null && (xc2.t0(M0) || !xc2.r0(M0))) {
                            int i8 = this.O2;
                            this.R2 = i8;
                            this.O2 = i8 + 2;
                            this.S2 = i8 + 1;
                        }
                    }
                    if (!this.s2 && (z6 || !z5)) {
                        int i9 = this.O2;
                        this.O2 = i9 + 1;
                        this.H3 = i9;
                    }
                    TLRPC.UserFull userFull11 = this.w2;
                    if (userFull11 != null && !TextUtils.isEmpty(userFull11.about)) {
                        int i10 = this.O2;
                        this.O2 = i10 + 1;
                        this.K3 = i10;
                    }
                    if (X1 != null && p != null) {
                        int i11 = this.O2;
                        this.O2 = i11 + 1;
                        this.M3 = i11;
                    }
                    TLRPC.UserFull userFull12 = this.w2;
                    if (userFull12 != null) {
                        if (userFull12.birthday != null) {
                            int i12 = this.O2;
                            this.O2 = i12 + 1;
                            this.V2 = i12;
                        }
                        if (userFull12.business_work_hours != null) {
                            int i13 = this.O2;
                            this.O2 = i13 + 1;
                            this.P3 = i13;
                        }
                        if (userFull12.business_location != null) {
                            int i14 = this.O2;
                            this.O2 = i14 + 1;
                            this.Q3 = i14;
                        }
                        if (userFull12.note != null) {
                            int i15 = this.O2;
                            this.O2 = i15 + 1;
                            this.I3 = i15;
                        }
                    }
                    if (this.a0 == null && this.e1 != getUserConfig().e()) {
                        int i16 = this.O2;
                        this.O2 = i16 + 1;
                        this.O3 = i16;
                    }
                    boolean z7 = this.s2;
                    if (z7 && X1 != null && X1.bot_has_main_app) {
                        int i17 = this.O2;
                        this.O2 = i17 + 1;
                        this.l4 = i17;
                    }
                    int i18 = this.O2;
                    int i19 = i18 + 1;
                    this.O2 = i19;
                    this.S3 = i18;
                    if (X1 != null && X1.linked_community_id != j) {
                        this.o4 = i19;
                        this.O2 = i18 + 3;
                        this.p4 = i18 + 2;
                    }
                    if (z7 && (userFull2 = this.w2) != null && (starrefprogram = userFull2.starref_program) != null && (starrefprogram.flags & 2) == 0 && getMessagesController().k4.K2.f()) {
                        int i20 = this.O2;
                        this.T3 = i20;
                        this.O2 = i20 + 2;
                        this.U3 = i20 + 1;
                    }
                    if (this.s2) {
                        if (this.t2 == null && getContext() != null) {
                            this.t2 = tq0.d(getContext(), this.currentAccount, this.e1);
                        }
                        if (this.u2 == null && getContext() != null) {
                            this.u2 = uo0.b(getContext(), this.currentAccount, this.e1);
                        }
                        tq0 tq0Var = this.t2;
                        boolean z8 = tq0Var != null && tq0Var.d;
                        uo0 uo0Var = this.u2;
                        boolean z9 = uo0Var != null && uo0Var.f;
                        TLRPC.UserFull userFull13 = this.w2;
                        if (userFull13 == null || !userFull13.bot_can_manage_emoji_status) {
                            if (!oca.d((Activity) getContext(), this.currentAccount, this.e1)) {
                                z3 = false;
                                if (!z3 || z8 || z9) {
                                    int i21 = this.O2;
                                    int i22 = i21 + 1;
                                    this.O2 = i22;
                                    this.q4 = i21;
                                    if (z3) {
                                        int i23 = i21 + 2;
                                        this.O2 = i23;
                                        this.botPermissionEmojiStatus = i22;
                                        i22 = i23;
                                    }
                                    if (z8) {
                                        int i24 = i22 + 1;
                                        this.O2 = i24;
                                        this.botPermissionLocation = i22;
                                        i22 = i24;
                                    }
                                    if (z9) {
                                        int i25 = i22 + 1;
                                        this.O2 = i25;
                                        this.botPermissionBiometry = i22;
                                        i22 = i25;
                                    }
                                    this.O2 = i22 + 1;
                                    this.s4 = i22;
                                }
                            }
                        }
                        z3 = true;
                        if (!z3) {
                        }
                        int i212 = this.O2;
                        int i222 = i212 + 1;
                        this.O2 = i222;
                        this.q4 = i212;
                        if (z3) {
                        }
                        if (z8) {
                        }
                        if (z9) {
                        }
                        this.O2 = i222 + 1;
                        this.s4 = i222;
                    }
                    TLRPC.EncryptedChat encryptedChat = this.E2;
                    if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                        int i26 = this.O2;
                        this.t4 = i26;
                        this.u4 = i26 + 1;
                        this.O2 = i26 + 3;
                        this.v4 = i26 + 2;
                    }
                    if (X1 != null && !this.s2 && encryptedChat == null && X1.id != getUserConfig().e() && this.k1) {
                        int i27 = this.O2;
                        this.O4 = i27;
                        this.O2 = i27 + 2;
                        this.Q4 = i27 + 1;
                    }
                    if (this.s2 && X1 != null && X1.bot && X1.bot_can_edit) {
                        int i28 = this.O2;
                        this.b4 = i28;
                        this.O2 = i28 + 2;
                        this.c4 = i28 + 1;
                    }
                    if (X1 != null && X1.bot) {
                        TLRPC.UserFull userFull14 = this.w2;
                        if (userFull14 != null && userFull14.can_view_revenue && kt0.g(this.currentAccount).i(this.e1) > j) {
                            int i29 = this.O2;
                            this.O2 = i29 + 1;
                            this.F4 = i29;
                        }
                        if (kt0.g(this.currentAccount).c(this.e1).amount > j || !kt0.g(this.currentAccount).k(this.e1).a[0].isEmpty()) {
                            int i30 = this.O2;
                            this.O2 = i30 + 1;
                            this.E4 = i30;
                        }
                    }
                    if (X1 != null && this.s2 && !X1.bot_nochats) {
                        int i31 = this.O2;
                        this.d4 = i31;
                        this.O2 = i31 + 2;
                        this.e4 = i31 + 1;
                    } else if (this.E4 >= 0) {
                        z2 = true;
                        if (!this.s1 && this.h5 && X1 != null && !X1.contact && !X1.bot && !lbc.C(X1.id)) {
                            int i32 = this.O2;
                            this.O2 = i32 + 1;
                            this.a4 = i32;
                            z2 = true;
                        }
                        if (!this.s1 && this.e5 != 0 && this.f5 < j && xc2.y(13, getMessagesController().M0(Long.valueOf(-this.f5)))) {
                            int i33 = this.O2;
                            this.O2 = i33 + 1;
                            this.X3 = i33;
                            z2 = true;
                        }
                        if (!this.s1 || this.e5 == 0 || lv2.r(this.currentAccount).x(this.e1)) {
                            z4 = z2;
                        } else {
                            int i34 = this.O2;
                            this.O2 = i34 + 1;
                            this.Y3 = i34;
                        }
                        if (z4) {
                            int i35 = this.O2;
                            this.O2 = i35 + 1;
                            this.Z3 = i35;
                        }
                        if (!z || ((X1 != null && X1.bot && X1.bot_can_edit && X1.bot_has_main_app) || (!((userFull = this.w2) == null || userFull.common_chats_count == 0) || this.s1))) {
                            int i36 = this.O2;
                            this.O2 = i36 + 1;
                            this.N4 = i36;
                        } else if (this.Q4 == -1 && this.o1) {
                            int i37 = this.O2;
                            this.V3 = i37;
                            this.O2 = i37 + 2;
                            this.Q4 = i37 + 1;
                        }
                    }
                    z2 = false;
                    if (!this.s1) {
                        int i322 = this.O2;
                        this.O2 = i322 + 1;
                        this.a4 = i322;
                        z2 = true;
                    }
                    if (!this.s1) {
                        int i332 = this.O2;
                        this.O2 = i332 + 1;
                        this.X3 = i332;
                        z2 = true;
                    }
                    if (this.s1) {
                    }
                    z4 = z2;
                    if (z4) {
                    }
                    if (z) {
                    }
                    int i362 = this.O2;
                    this.O2 = i362 + 1;
                    this.N4 = i362;
                } else {
                    if (this.K2 == null) {
                        TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                        if (userProfilePhoto != null) {
                            TLRPC.FileLocation fileLocation = userProfilePhoto.photo_big;
                            if (!(fileLocation instanceof TLRPC.TL_fileLocation_layer97)) {
                            }
                        }
                        jq8 jq8Var = this.o0;
                        if (jq8Var == null || jq8Var.getRealCount() == 0) {
                            int i38 = this.O2;
                            this.P2 = i38;
                            this.O2 = i38 + 2;
                            this.Q2 = i38 + 1;
                        }
                    }
                    int i39 = this.O2;
                    this.T2 = i39;
                    this.U2 = i39 + 1;
                    this.W2 = i39 + 2;
                    this.X2 = i39 + 3;
                    this.O2 = i39 + 5;
                    this.e3 = i39 + 4;
                    Set set = getMessagesController().u3;
                    if (set.contains("PREMIUM_GRACE")) {
                        int i40 = this.O2;
                        this.Z2 = i40;
                        this.O2 = i40 + 2;
                        this.a3 = i40 + 1;
                    } else if (set.contains("VALIDATE_PHONE_NUMBER")) {
                        int i41 = this.O2;
                        this.b3 = i41;
                        this.O2 = i41 + 2;
                        this.Y2 = i41 + 1;
                    } else if (set.contains("VALIDATE_PASSWORD")) {
                        int i42 = this.O2;
                        this.d3 = i42;
                        this.O2 = i42 + 2;
                        this.c3 = i42 + 1;
                    }
                    int i43 = this.O2;
                    this.f3 = i43;
                    this.k3 = i43 + 1;
                    this.i3 = i43 + 2;
                    this.g3 = i43 + 3;
                    this.j3 = i43 + 4;
                    this.O2 = i43 + 6;
                    this.m3 = i43 + 5;
                    if (getMessagesController().k4.P0.f() || !getMessagesController().G0.isEmpty()) {
                        int i44 = this.O2;
                        this.O2 = i44 + 1;
                        this.l3 = i44;
                    }
                    int i45 = this.O2;
                    this.o3 = i45;
                    this.h3 = i45 + 1;
                    this.O2 = i45 + 3;
                    this.p3 = i45 + 2;
                    if (!getMessagesController().M3()) {
                        int i46 = this.O2;
                        this.O2 = i46 + 1;
                        this.f4 = i46;
                    }
                    if (getMessagesController().i5()) {
                        int i47 = this.O2;
                        this.O2 = i47 + 1;
                        this.g4 = i47;
                    }
                    jxa.v(this.currentAccount, true).m();
                    org.telegram.messenger.a.m();
                    int i48 = this.O2;
                    this.O2 = i48 + 1;
                    this.h4 = i48;
                    if (!getMessagesController().M3()) {
                        int i49 = this.O2;
                        this.O2 = i49 + 1;
                        this.i4 = i49;
                    }
                    if (!getMessagesController().N3()) {
                        int i50 = this.O2;
                        this.O2 = i50 + 1;
                        this.j4 = i50;
                    }
                    if (this.f4 >= 0 || this.g4 >= 0 || this.h4 >= 0 || this.i4 >= 0 || this.j4 >= 0) {
                        int i51 = this.O2;
                        this.O2 = i51 + 1;
                        this.k4 = i51;
                    }
                    int i52 = this.O2;
                    this.q3 = i52;
                    this.r3 = i52 + 1;
                    this.s3 = i52 + 2;
                    int i53 = i52 + 4;
                    this.O2 = i53;
                    this.t3 = i52 + 3;
                    boolean z10 = f11.a;
                    if (z10) {
                        this.u3 = i53;
                        i53 = i52 + 6;
                        this.O2 = i53;
                        this.v3 = i52 + 5;
                    }
                    if (z10) {
                        this.w3 = i53;
                        int i54 = i53 + 2;
                        this.x3 = i53 + 1;
                        i53 += 3;
                        this.O2 = i53;
                        this.y3 = i54;
                    }
                    this.z3 = i53;
                    this.O2 = i53 + 2;
                    this.A3 = i53 + 1;
                }
            } else if (this.q1) {
                if (this.B3 < 0 && this.C3 < 0) {
                    if (this.L4 || this.M4 || this.n6 != null || this.a0 == null) {
                        int i55 = this.O2;
                        this.O2 = i55 + 1;
                        this.C3 = i55;
                    } else {
                        int i56 = this.O2;
                        this.O2 = i56 + 1;
                        this.B3 = i56;
                    }
                }
                int i57 = this.O2;
                int i58 = i57 + 1;
                this.O2 = i58;
                this.M3 = i57;
                if (this.a0 == null) {
                    int i59 = i57 + 2;
                    this.O2 = i59;
                    this.R3 = i58;
                    i58 = i59;
                }
                int i60 = i58 + 1;
                this.O2 = i60;
                this.S3 = i58;
                if (z) {
                    this.O2 = i58 + 2;
                    this.N4 = i60;
                }
            } else if (this.f1 != 0) {
                TLRPC.ChatFull chatFull7 = this.v2;
                if ((chatFull7 != null && (!TextUtils.isEmpty(chatFull7.about) || (this.v2.location instanceof TLRPC.TL_channelLocation))) || xc2.t0(this.F2)) {
                    if (this.B3 < 0 && this.C3 < 0) {
                        if (this.L4 || this.M4 || this.n6 != null || this.a0 == null) {
                            int i61 = this.O2;
                            this.O2 = i61 + 1;
                            this.C3 = i61;
                        } else {
                            int i62 = this.O2;
                            this.O2 = i62 + 1;
                            this.B3 = i62;
                        }
                    }
                    if (this.a0 == null) {
                        int i63 = this.O2;
                        this.O2 = i63 + 1;
                        this.E3 = i63;
                    }
                    TLRPC.ChatFull chatFull8 = this.v2;
                    if (chatFull8 != null) {
                        if (!TextUtils.isEmpty(chatFull8.about)) {
                            int i64 = this.O2;
                            this.O2 = i64 + 1;
                            this.L3 = i64;
                        }
                        if (this.v2.location instanceof TLRPC.TL_channelLocation) {
                            int i65 = this.O2;
                            this.O2 = i65 + 1;
                            this.J3 = i65;
                        }
                    }
                    if (xc2.t0(this.F2)) {
                        int i66 = this.O2;
                        this.O2 = i66 + 1;
                        this.M3 = i66;
                    }
                }
                if (this.B3 < 0 && this.C3 < 0) {
                    if (this.L4 || this.M4 || this.n6 != null || this.a0 == null) {
                        int i67 = this.O2;
                        this.O2 = i67 + 1;
                        this.C3 = i67;
                    } else {
                        int i68 = this.O2;
                        this.O2 = i68 + 1;
                        this.B3 = i68;
                    }
                }
                if (this.a0 == null) {
                    if (this.E3 != -1) {
                        int i69 = this.O2;
                        this.O2 = i69 + 1;
                        this.N3 = i69;
                    }
                    int i70 = this.O2;
                    this.O2 = i70 + 1;
                    this.O3 = i70;
                }
                int i71 = this.O2;
                if (i71 > 0) {
                    int i72 = i71 + 1;
                    this.O2 = i72;
                    this.S3 = i71;
                    i71 = i72;
                }
                TLRPC.Chat chat = this.F2;
                if (chat != null && chat.linked_community_id != 0) {
                    this.o4 = i71;
                    this.O2 = i71 + 2;
                    this.p4 = i71 + 1;
                }
                if (xc2.T(chat)) {
                    TLRPC.Chat chat2 = this.F2;
                    if (!chat2.megagroup) {
                        TLRPC.ChatFull chatFull9 = this.v2;
                        if (chatFull9 != null && (chat2.creator || chatFull9.can_view_participants)) {
                            if (this.a0 == null) {
                                int i73 = this.O2;
                                this.O2 = i73 + 1;
                                this.w4 = i73;
                            }
                            int i74 = this.O2;
                            int i75 = i74 + 1;
                            this.O2 = i75;
                            this.A4 = i74;
                            if (chatFull9.requests_pending > 0) {
                                int i76 = i74 + 2;
                                this.O2 = i76;
                                this.B4 = i75;
                                i75 = i76;
                            }
                            int i77 = i75 + 1;
                            this.O2 = i77;
                            this.C4 = i75;
                            if (chatFull9.banned_count != 0 || chatFull9.kicked_count != 0) {
                                this.O2 = i75 + 2;
                                this.J4 = i77;
                            }
                            if ((chatFull9.can_view_stars_revenue && (kt0.g(this.currentAccount).c(-this.f1).amount > 0 || !kt0.g(this.currentAccount).k(-this.f1).a[0].isEmpty())) || ((chatFull4 = this.v2) != null && chatFull4.can_view_revenue && kt0.g(this.currentAccount).i(-this.f1) > 0)) {
                                int i78 = this.O2;
                                this.O2 = i78 + 1;
                                this.G4 = i78;
                            }
                            int i79 = this.O2;
                            this.D4 = i79;
                            this.O2 = i79 + 2;
                            this.H4 = i79 + 1;
                        }
                        if (xc2.T(this.F2)) {
                            TLRPC.ChatFull chatFull10 = this.v2;
                            if (chatFull10 != null) {
                                if (this.q1 || (chatParticipants = chatFull10.participants) == null || chatParticipants.participants == null || (chatParticipants instanceof TLRPC.TL_chatParticipantsForbidden)) {
                                    if (!xc2.r0(this.F2) && xc2.w(3, this.F2) && this.v2.participants_hidden) {
                                        int i80 = this.O2;
                                        this.z4 = i80;
                                        this.O2 = i80 + 2;
                                        this.K4 = i80 + 1;
                                    }
                                    gr8 gr8Var = this.O;
                                    if (gr8Var != null) {
                                        gr8Var.C1();
                                    }
                                } else {
                                    if (xc2.w(3, this.F2) || (tL_chatBannedRights = this.F2.default_banned_rights) == null || !tL_chatBannedRights.invite_users) {
                                        int i81 = this.O2;
                                        this.O2 = i81 + 1;
                                        this.z4 = i81;
                                    }
                                    if (this.v2.participants.participants.size() <= 5 || !z) {
                                        if (this.z4 == -1 && this.a0 == null) {
                                            int i82 = this.O2;
                                            this.O2 = i82 + 1;
                                            this.w4 = i82;
                                        }
                                        int i83 = this.O2;
                                        this.x4 = i83;
                                        int size = this.v2.participants.participants.size() + i83;
                                        this.y4 = size;
                                        this.O2 = size + 1;
                                        this.K4 = size;
                                        arrayList2.addAll(this.v2.participants.participants);
                                        ArrayList arrayList4 = this.D2;
                                        if (arrayList4 != null) {
                                            arrayList3.addAll(arrayList4);
                                        }
                                        gr8 gr8Var2 = this.O;
                                        if (gr8Var2 != null) {
                                            gr8Var2.h1(null, null);
                                        }
                                    } else {
                                        if (this.z4 != -1) {
                                            int i84 = this.O2;
                                            this.O2 = i84 + 1;
                                            this.K4 = i84;
                                        }
                                        gr8 gr8Var3 = this.O;
                                        if (gr8Var3 != null) {
                                            gr8Var3.h1(this.D2, this.v2);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (this.q1 || (chatFull3 = this.v2) == null || !this.F2.megagroup || (chatParticipants2 = chatFull3.participants) == null || (arrayList = chatParticipants2.participants) == null || arrayList.isEmpty()) {
                                if (!xc2.r0(this.F2) && xc2.w(3, this.F2) && (chatFull2 = this.v2) != null && chatFull2.participants_hidden) {
                                    int i85 = this.O2;
                                    this.z4 = i85;
                                    this.O2 = i85 + 2;
                                    this.K4 = i85 + 1;
                                }
                                gr8 gr8Var4 = this.O;
                                if (gr8Var4 != null) {
                                    gr8Var4.C1();
                                }
                            } else {
                                if (!xc2.r0(this.F2) && xc2.w(3, this.F2) && this.v2.participants_count < getMessagesController().Q2) {
                                    int i86 = this.O2;
                                    this.O2 = i86 + 1;
                                    this.z4 = i86;
                                }
                                int size2 = this.v2.participants.participants.size();
                                if ((size2 <= 5 || !z || this.W4 == 1) && this.W4 != 2) {
                                    if (this.z4 == -1 && this.a0 == null) {
                                        int i87 = this.O2;
                                        this.O2 = i87 + 1;
                                        this.w4 = i87;
                                    }
                                    int i88 = this.O2;
                                    this.x4 = i88;
                                    int i89 = i88 + size2;
                                    this.y4 = i89;
                                    this.O2 = i89 + 1;
                                    this.K4 = i89;
                                    arrayList2.addAll(this.v2.participants.participants);
                                    ArrayList arrayList5 = this.D2;
                                    if (arrayList5 != null) {
                                        arrayList3.addAll(arrayList5);
                                    }
                                    this.W4 = (byte) 1;
                                    gr8 gr8Var5 = this.O;
                                    if (gr8Var5 != null) {
                                        gr8Var5.h1(null, null);
                                    }
                                } else {
                                    if (this.z4 != -1) {
                                        int i90 = this.O2;
                                        this.O2 = i90 + 1;
                                        this.K4 = i90;
                                    }
                                    if (this.O != null) {
                                        if (!this.D2.isEmpty()) {
                                            this.W4 = (byte) 2;
                                        }
                                        this.O.h1(this.D2, this.v2);
                                    }
                                }
                            }
                            if (this.Q4 == -1) {
                                TLRPC.Chat chat3 = this.F2;
                                if (chat3.left && !chat3.kicked) {
                                    long j4 = uc7.w1(this.currentAccount).getLong("dialog_join_requested_time_" + this.i1, -1L);
                                    if (j4 <= 0 || System.currentTimeMillis() - j4 >= 120000) {
                                        ap8 ap8Var2 = this.a0;
                                        if (ap8Var2 == null || !ap8Var2.f()) {
                                            int i91 = this.O2;
                                            this.P4 = i91;
                                            this.O2 = i91 + 2;
                                            this.Q4 = i91 + 1;
                                        }
                                        if (z) {
                                            int i92 = this.O2;
                                            this.O2 = i92 + 1;
                                            this.N4 = i92;
                                        }
                                        if (this.N4 == -1) {
                                            int i93 = this.O2;
                                            this.O2 = i93 + 1;
                                            this.D3 = i93;
                                        }
                                        if (this.actionBar != null) {
                                            i = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? hl.m : 0);
                                        } else {
                                            i = 0;
                                        }
                                        if (this.a != null && i3 <= this.O2) {
                                            i2 = this.F0;
                                            if (i2 != 0) {
                                            }
                                            zp8Var = this.a;
                                            if (zp8Var != null) {
                                                zp8Var.setTranslateSelectorPosition(this.P3);
                                            }
                                            ap8Var = this.a0;
                                            if (ap8Var != null) {
                                                ap8Var.o(7, z4);
                                            }
                                            tu8Var = this.c0;
                                            if (tu8Var != null) {
                                                TLRPC.UserFull userFull15 = this.w2;
                                                if (userFull15 != null) {
                                                    tu8Var.setMusicDocument(userFull15.saved_music);
                                                }
                                                this.c0.setVisibility(this.L4 ? 0 : 8);
                                                if (this.M4) {
                                                    this.d0.setBalance(this.w2.wallet_card.balance);
                                                }
                                                this.d0.setVisibility(this.M4 ? 0 : 8);
                                                this.c0.invalidate();
                                                this.d0.invalidate();
                                                return;
                                            }
                                            return;
                                        }
                                        this.D0 = 0;
                                        zp8Var = this.a;
                                        if (zp8Var != null) {
                                        }
                                        ap8Var = this.a0;
                                        if (ap8Var != null) {
                                        }
                                        tu8Var = this.c0;
                                        if (tu8Var != null) {
                                        }
                                    }
                                }
                            }
                        }
                        z4 = false;
                        if (z) {
                        }
                        if (this.N4 == -1) {
                        }
                        if (this.actionBar != null) {
                        }
                        if (this.a != null) {
                            i2 = this.F0;
                            if (i2 != 0) {
                            }
                            zp8Var = this.a;
                            if (zp8Var != null) {
                            }
                            ap8Var = this.a0;
                            if (ap8Var != null) {
                            }
                            tu8Var = this.c0;
                            if (tu8Var != null) {
                            }
                        }
                        this.D0 = 0;
                        zp8Var = this.a;
                        if (zp8Var != null) {
                        }
                        ap8Var = this.a0;
                        if (ap8Var != null) {
                        }
                        tu8Var = this.c0;
                        if (tu8Var != null) {
                        }
                    }
                }
                TLRPC.ChatFull chatFull11 = this.v2;
                if ((chatFull11 != null && chatFull11.can_view_stars_revenue && (kt0.g(this.currentAccount).c(-this.f1).amount > 0 || !kt0.g(this.currentAccount).k(-this.f1).a[0].isEmpty())) || ((chatFull = this.v2) != null && chatFull.can_view_revenue && kt0.g(this.currentAccount).i(-this.f1) > 0)) {
                    int i94 = this.O2;
                    this.G4 = i94;
                    this.O2 = i94 + 2;
                    this.H4 = i94 + 1;
                }
                if (xc2.T(this.F2)) {
                }
                z4 = false;
                if (z) {
                }
                if (this.N4 == -1) {
                }
                if (this.actionBar != null) {
                }
                if (this.a != null) {
                }
                this.D0 = 0;
                zp8Var = this.a;
                if (zp8Var != null) {
                }
                ap8Var = this.a0;
                if (ap8Var != null) {
                }
                tu8Var = this.c0;
                if (tu8Var != null) {
                }
            }
            z4 = false;
            if (this.N4 == -1) {
            }
            if (this.actionBar != null) {
            }
            if (this.a != null) {
            }
            this.D0 = 0;
            zp8Var = this.a;
            if (zp8Var != null) {
            }
            ap8Var = this.a0;
            if (ap8Var != null) {
            }
            tu8Var = this.c0;
            if (tu8Var != null) {
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
        z4 = false;
        if (this.N4 == -1) {
        }
        if (this.actionBar != null) {
        }
        if (this.a != null) {
        }
        this.D0 = 0;
        zp8Var = this.a;
        if (zp8Var != null) {
        }
        ap8Var = this.a0;
        if (ap8Var != null) {
        }
        tu8Var = this.c0;
        if (tu8Var != null) {
        }
    }

    @Override // tha
    public final boolean g(TLRPC.ChatParticipant chatParticipant, boolean z, boolean z2, View view) {
        boolean z3;
        boolean z4;
        String str;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        TLRPC.ChannelParticipant channelParticipant;
        boolean z12;
        byte b = 0;
        if (getParentActivity() != null) {
            if (z) {
                TLRPC.User X1 = getMessagesController().X1(Long.valueOf(chatParticipant.user_id));
                if (X1 != null) {
                    long j = chatParticipant.user_id;
                    this.B2 = j;
                    boolean z13 = j == getUserConfig().e();
                    if (xc2.T(this.F2)) {
                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        str = channelParticipant.rank;
                        z7 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        z6 = z7 || (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin);
                        z3 = z13;
                        getMessagesController().X1(Long.valueOf(chatParticipant.user_id));
                        z9 = xc2.w(4, this.F2);
                        z10 = xc2.w(25, this.F2) && (!z6 || ((!z7 && channelParticipant.can_edit) || z3));
                        if (z7 || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit)) {
                            z9 = false;
                            z10 = false;
                        }
                        if ((z3 || (channelParticipant instanceof TLRPC.TL_channelParticipantSelf)) && xc2.h(this.F2)) {
                            z10 = true;
                        }
                        z8 = xc2.w(2, this.F2) && (!((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || z7) || channelParticipant.can_edit);
                        chat = this.F2;
                        z4 = true;
                        z11 = chat.gigagroup ? false : z8;
                        z5 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                    } else {
                        z3 = z13;
                        z4 = true;
                        str = chatParticipant.rank;
                        z5 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        z6 = z5 || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator);
                        z7 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        TLRPC.Chat chat2 = this.F2;
                        z8 = chat2.creator || ((chatParticipant instanceof TLRPC.TL_chatParticipant) && (xc2.w(2, chat2) || chatParticipant.inviter_id == getUserConfig().e()));
                        TLRPC.Chat chat3 = this.F2;
                        z9 = chat3.creator;
                        z10 = (xc2.w(25, chat3) && (!z6 || ((!z7 && chatParticipant.inviter_id == getUserConfig().e()) || z3))) || (z3 && xc2.h(this.F2));
                        chat = this.F2;
                        z11 = chat.creator;
                        channelParticipant = null;
                    }
                    if (!z3) {
                        z12 = z8;
                    } else if (xc2.h(chat) || (z6 && xc2.w(25, this.F2))) {
                        z9 = false;
                        z11 = false;
                        z12 = false;
                        z10 = z4;
                    } else {
                        z9 = false;
                        z11 = false;
                        z12 = false;
                    }
                    boolean z14 = (z9 || z10 || z11 || z12) ? z4 : false;
                    if (z2 || !z14) {
                        return z14;
                    }
                    TLRPC.ChannelParticipant channelParticipant2 = channelParticipant;
                    boolean z15 = z5;
                    cp8 cp8Var = new cp8(this, channelParticipant2, X1, chatParticipant, z15, str);
                    String str2 = str;
                    Drawable W0 = view.getParent() instanceof d79 ? ((d79) view.getParent()).W0(view, false) : null;
                    fu5 I = fu5.I(this, view);
                    I.X(W0);
                    I.w = false;
                    I.k(R.drawable.msg_discussion, ob6.M0(2131745329, null), new dp8(this, X1, b), !z3);
                    if (!z3 && (z9 || z10 || z11 || z12)) {
                        I.j();
                    }
                    I.k((z6 || !TextUtils.isEmpty(str2)) ? R.drawable.menu_tag_edit : R.drawable.menu_tag_plus, ob6.M0(z6 ? 2131751267 : TextUtils.isEmpty(str2) ? 2131754393 : 2131751240, null), new my6(this, X1, str2, z6, z7), z10);
                    I.k(R.drawable.msg_admins, ob6.M0(z15 ? 2131751269 : 2131745275, null), new uk8(cp8Var, (byte) 5), z9);
                    I.k(R.drawable.msg_permissions, ob6.M0(2131752521, null), new cp7((Object) this, (Object) channelParticipant2, (Object) chatParticipant, (Object) X1, (Object) cp8Var, (byte) 10), z11);
                    I.l(R.drawable.msg_remove, new h68(this, chatParticipant, (byte) 29), ob6.M0(2131748809, null), z12, true);
                    I.Y = jn7.T2;
                    I.a0();
                    return z4;
                }
            } else if (chatParticipant.user_id != getUserConfig().e()) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", chatParticipant.user_id);
                bundle.putBoolean("preload_messages", true);
                presentFragment(new ProfileActivity(bundle, null));
                return true;
            }
        }
        return false;
    }

    public final float g2(float f, float f2) {
        this.B6 = f;
        this.D6 = f2;
        byte b = this.J1;
        float l = Utilities.l(b == 2 ? 1.0f : (this.T1 >= 1.0f || b == 0) ? this.l2 : 0.0f);
        jva jvaVar = this.T;
        return Math.max(0.0f, (l2() + this.u5) * l) + qd4.A(1.0f, l, f2 * (jvaVar != null ? jvaVar.getVisibilityFactor() : 0.0f), f);
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0451  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g3(float f, float f2, int i, View view) {
        TLRPC.Chat M0;
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
        String str3 = "";
        String str4 = null;
        byte b2 = 1;
        int i2 = 0;
        if (i == this.M3 || i == this.W2) {
            if (this.e1 == 0) {
                if (this.f1 != 0 && (M0 = getMessagesController().M0(Long.valueOf(this.f1))) != null && (this.g1 != 0 || xc2.t0(M0))) {
                    K = xc2.K(M0, false);
                    b = wf3.b(K, M0.usernames);
                    if (this.e1 != 0) {
                    }
                }
                return false;
            }
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e1));
            K = lbc.p(X1);
            if (X1 != null && K != null) {
                b = wf3.b(K, X1.usernames);
                if (this.e1 != 0) {
                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.f1));
                    if (xc2.t0(M02)) {
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(getMessagesController().N2);
                        sb2.append("/");
                        sb2.append(xc2.K(M02, false));
                        if (this.g1 != 0) {
                            str3 = "/" + this.g1;
                        }
                        sb2.append(str3);
                        sb = sb2.toString();
                    } else {
                        StringBuilder sb3 = new StringBuilder("https://");
                        sb3.append(getMessagesController().N2);
                        sb3.append("/c/");
                        sb3.append(M02.id);
                        if (this.g1 != 0) {
                            str3 = "/" + this.g1;
                        }
                        sb3.append(str3);
                        sb = sb3.toString();
                    }
                    uq8 uq8Var = new uq8(this, getParentActivity(), sb, sb);
                    showDialog(uq8Var);
                    if (b != null && !b.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername.username = b.username;
                        tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo, new qn8(this, b, uq8Var, b2)), getClassGuid());
                        return true;
                    }
                } else if (!S1(i, view3)) {
                    if (b != null && !b.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo2 = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername2 = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername2.username = b.username;
                        tL_getCollectibleInfo2.collectible = tL_inputCollectibleUsername2;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo2, new ol7(this, b, (byte) 12)), getClassGuid());
                        return true;
                    }
                    try {
                        d31.b0(this).i(ob6.M0(2131743320, null)).j();
                        ((ClipboardManager) org.telegram.messenger.a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "@" + K));
                        return true;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return true;
                    }
                }
            }
            return false;
            return true;
        }
        if (i != this.I3) {
            byte b3 = 2;
            if (i == this.H3 || i == this.U2) {
                if (!S1(i, view3)) {
                    TLRPC.User X12 = getMessagesController().X1(Long.valueOf(this.e1));
                    if (X12 != null && (str = X12.phone) != null && str.length() != 0 && getParentActivity() != null) {
                        if (i == this.H3 && X12.phone.startsWith("888")) {
                            TL_fragment.TL_inputCollectiblePhone tL_inputCollectiblePhone = new TL_fragment.TL_inputCollectiblePhone();
                            String str5 = X12.phone;
                            tL_inputCollectiblePhone.phone = str5;
                            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo3 = new TL_fragment.TL_getCollectibleInfo();
                            tL_getCollectibleInfo3.collectible = tL_inputCollectiblePhone;
                            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo3, new qn8(this, str5, X12, b3)), getClassGuid());
                            return true;
                        }
                        fu5 I = fu5.I(this, view3);
                        I.X(this.a.W0(view3, false));
                        I.w = false;
                        if (i == this.H3) {
                            TLRPC.UserFull userFull3 = this.w2;
                            if (userFull3 != null && userFull3.phone_calls_available) {
                                I.b(R.drawable.msg_calls, ob6.M0(2131752581, null), new dp8(this, X12, b2), false);
                                if (this.w2.video_calls_available) {
                                    I.b(R.drawable.msg_videocall, ob6.M0(2131743263, null), new dp8(this, X12, b3), false);
                                }
                            }
                            if (!this.g5) {
                                I.b(R.drawable.msg_calls_regular, ob6.M0(2131752615, null), new dp8(this, X12, (byte) 3), false);
                            }
                        }
                        I.b(R.drawable.msg_copy, ob6.M0(2131751732, null), new dp8(this, X12, (byte) 4), false);
                        if (this.g5) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hl.S2(ob6.M0(2131754243, null)));
                            int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                            int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                                int i3 = lastIndexOf - 1;
                                spannableStringBuilder.setSpan(new y7c(hl.o()), indexOf, i3, 33);
                                spannableStringBuilder.setSpan(new ho4(aob.I6, this.A0), indexOf, i3, 33);
                            }
                            I.j();
                            byte b4 = 13;
                            I.o(13, hl.L(200.0f), spannableStringBuilder);
                            if (I.A() instanceof TextView) {
                                TextView textView = (TextView) I.A();
                                int i4 = aob.I5;
                                yob.R(textView, aob.Y(aob.v0(i4, this.A0), 0, 6), null, yob.M(i4), this.A0);
                                textView.setOnClickListener(new y00(b4));
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
                    if (!S1(i, view3)) {
                        if (view3 instanceof t1) {
                            t1 t1Var = (t1) view3;
                            if (t1Var.c0 && t1Var.W <= 0.0f) {
                                t1Var.h();
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
                            boolean r = uc7.s1(this.currentAccount).i4.r();
                            boolean[] zArr = {i == this.X2 || i == this.L3 || i == this.K3};
                            String H0 = r3c.H0();
                            st stVar = new st(this, view3, str6, i, zArr, strArr, H0);
                            if (zArr[0]) {
                                xqe.b(str6, new mw1(this, strArr, zArr, H0, r, stVar), new jz7((Object) stVar, (byte) 17), false);
                                return true;
                            }
                            stVar.run();
                            return true;
                        }
                    }
                    return true;
                }
            } else if ((i == this.P3 || i == this.Q3) && getParentActivity() != null && (userFull2 = this.w2) != null) {
                if (i != this.P3) {
                    if (i == this.Q3 && !S1(i, view3)) {
                        TLRPC.TL_businessLocation tL_businessLocation = this.w2.business_location;
                        if (tL_businessLocation != null) {
                            str2 = tL_businessLocation.address;
                            String str7 = str2;
                            AtomicReference atomicReference = new AtomicReference();
                            mc2 mc2Var = new mc2(getParentActivity(), R.drawable.popup_fixed_alert, this.A0, i2, (byte) 1);
                            mc2Var.V = new Path();
                            mc2Var.setFitItems(true);
                            s7.c(false, false, mc2Var, R.drawable.msg_copy, ob6.M0(2131751732, null), false, this.A0).setOnClickListener(new jf((org.telegram.ui.ActionBar.e) this, (Object) atomicReference, (Serializable) str7, i, (byte) 6));
                            n8 n8Var = new n8(mc2Var, -2, -2);
                            n8Var.e = true;
                            n8Var.c = (short) 220;
                            n8Var.setOutsideTouchable(true);
                            n8Var.setClippingEnabled(true);
                            n8Var.setAnimationStyle(R.style.PopupContextAnimation);
                            n8Var.setFocusable(true);
                            mc2Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
                            n8Var.setInputMethodMode(2);
                            n8Var.getContentView().setFocusableInTouchMode(true);
                            atomicReference.set(n8Var);
                            f3 = f;
                            f4 = f2;
                            while (view3 != null) {
                                f3 += view3.getX();
                                f4 += view3.getY();
                                view3 = (View) view3.getParent();
                            }
                            if (hl.O1()) {
                                f3 += view2.getX() + view2.getPaddingLeft();
                                f4 += view2.getY() + view2.getPaddingTop();
                            }
                            n8Var.showAtLocation(getFragmentView(), 0, (int) (f3 - (mc2Var.getMeasuredWidth() / 2.0f)), (int) f4);
                            n8Var.b();
                            return true;
                        }
                    }
                    return true;
                }
                TL_account.TL_businessWorkHours tL_businessWorkHours = userFull2.business_work_hours;
                if (tL_businessWorkHours != null) {
                    str2 = vt7.j0(this.currentAccount, userFull2.user, tL_businessWorkHours);
                    String str72 = str2;
                    AtomicReference atomicReference2 = new AtomicReference();
                    mc2 mc2Var2 = new mc2(getParentActivity(), R.drawable.popup_fixed_alert, this.A0, i2, (byte) 1);
                    mc2Var2.V = new Path();
                    mc2Var2.setFitItems(true);
                    s7.c(false, false, mc2Var2, R.drawable.msg_copy, ob6.M0(2131751732, null), false, this.A0).setOnClickListener(new jf((org.telegram.ui.ActionBar.e) this, (Object) atomicReference2, (Serializable) str72, i, (byte) 6));
                    n8 n8Var2 = new n8(mc2Var2, -2, -2);
                    n8Var2.e = true;
                    n8Var2.c = (short) 220;
                    n8Var2.setOutsideTouchable(true);
                    n8Var2.setClippingEnabled(true);
                    n8Var2.setAnimationStyle(R.style.PopupContextAnimation);
                    n8Var2.setFocusable(true);
                    mc2Var2.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
                    n8Var2.setInputMethodMode(2);
                    n8Var2.getContentView().setFocusableInTouchMode(true);
                    atomicReference2.set(n8Var2);
                    f3 = f;
                    f4 = f2;
                    while (view3 != null && view3 != getFragmentView()) {
                        f3 += view3.getX();
                        f4 += view3.getY();
                        view3 = (View) view3.getParent();
                    }
                    if (hl.O1() && (view2 = this.parentLayout.getView()) != null) {
                        f3 += view2.getX() + view2.getPaddingLeft();
                        f4 += view2.getY() + view2.getPaddingTop();
                    }
                    n8Var2.showAtLocation(getFragmentView(), 0, (int) (f3 - (mc2Var2.getMeasuredWidth() / 2.0f)), (int) f4);
                    n8Var2.b();
                    return true;
                }
            }
        }
        return false;
    }

    public final void g4(boolean z) {
        int i = z ? 8 : 0;
        this.a.setVisibility(i);
        this.b.setVisibility(z ? 0 : 8);
        this.U0.getSearchContainer().setVisibility(z ? 0 : 8);
        gu8 gu8Var = this.w0;
        if (gu8Var != null) {
            gu8Var.setActive(!z);
        }
        this.actionBar.C(z);
        this.Y.setVisibility(i);
        lq8 lq8Var = this.v0;
        if (lq8Var != null) {
            lq8Var.setVisibility(i);
        }
        this.f.setVisibility(i);
        this.r.setVisibility(i);
        sla slaVar = this.T0;
        if (slaVar != null) {
            slaVar.setAlpha(1.0f);
            this.T0.setVisibility(i);
        }
        this.U0.setVisibility(i);
        this.f0.setAlpha(1.0f);
        this.Y.setAlpha(1.0f);
        lq8 lq8Var2 = this.v0;
        if (lq8Var2 != null) {
            lq8Var2.setAlpha(1.0f);
        }
        gu8 gu8Var2 = this.w0;
        if (gu8Var2 != null) {
            gu8Var2.setAlpha(1.0f);
        }
        this.f.setAlpha(1.0f);
        this.r.setAlpha(this.X5 ? 0.0f : 1.0f);
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

    public float getAvatarAnimationProgress() {
        return this.T1;
    }

    @Override // yn5
    public final fd8 getCloseIntoObject() {
        return null;
    }

    @Override // yn5
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final vnb getResourceProvider() {
        return this.A0;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        if (this.A0 != null) {
            return null;
        }
        u00 u00Var = new u00(this, (byte) 15);
        ArrayList arrayList = new ArrayList();
        gr8 gr8Var = this.O;
        if (gr8Var != null) {
            arrayList.addAll(gr8Var.getThemeDescriptions());
        }
        arrayList.add(new apb(this.d1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.a7));
        arrayList.add(new apb(this.f0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.q0}, (zob) null, aob.d8));
        arrayList.add(new apb(this.s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.ni));
        arrayList.add(new apb(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.oi));
        arrayList.add(new apb(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.pi));
        arrayList.add(new apb(this.a, 262144, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.x6));
        arrayList.add(new apb(this.a, 262144, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.p7));
        arrayList.add(new apb(this.a, 262144, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.o6));
        arrayList.add(new apb(this.a, 262144, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.u6));
        arrayList.add(new apb(this.a, 262144, new Class[]{skb.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.v6));
        arrayList.add(new apb(this.a, 0, new Class[]{gca.class}, new String[]{"detailTextView"}, (Drawable[]) null, (zob) null, aob.z6));
        int i = aob.Ji;
        arrayList.add(new apb(this.a, 0, new Class[]{gca.class}, new String[]{"yesButton"}, (Drawable[]) null, (zob) null, i));
        int i2 = aob.Fi;
        arrayList.add(new apb(this.a, 131072, new Class[]{gca.class}, new String[]{"yesButton"}, (Drawable[]) null, (zob) null, i2));
        int i3 = aob.Hi;
        arrayList.add(new apb(this.a, 196608, new Class[]{gca.class}, new String[]{"yesButton"}, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(this.a, 0, new Class[]{gca.class}, new String[]{"noButton"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.a, 131072, new Class[]{gca.class}, new String[]{"noButton"}, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.a, 196608, new Class[]{gca.class}, new String[]{"noButton"}, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(this.a, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.M6));
        arrayList.add(new apb(this.a, 0, new Class[]{uo7.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.N6));
        arrayList.add(new apb(this.a, 0, new Class[]{vac.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, u00Var, aob.n6));
        boolean z = this.X5;
        ns1 ns1Var = this.f;
        Drawable drawable = this.I;
        if (z) {
            arrayList.add(new apb(ns1Var, 0, (Class[]) null, (Paint) null, new Drawable[]{drawable}, (zob) null, aob.Fj));
            arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (zob) null, aob.d6));
            return arrayList;
        }
        arrayList.add(new apb(ns1Var, 0, (Class[]) null, (Paint) null, new Drawable[]{drawable}, (zob) null, aob.ri));
        arrayList.add(new apb(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (zob) null, aob.qi));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final int getThemedColor(int i) {
        return aob.v0(i, this.A0);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final Drawable getThemedDrawable(String str) {
        vnb vnbVar = this.A0;
        Drawable drawable = vnbVar != null ? vnbVar.getDrawable(str) : null;
        return drawable != null ? drawable : super.getThemedDrawable(str);
    }

    public final float h2(float f) {
        this.E6 = f;
        byte b = this.J1;
        return qd4.A(1.0f, Utilities.l(b == 2 ? 1.0f : (this.T1 >= 1.0f || b == 0) ? this.l2 : 0.0f), this.T != null ? this.T.getVisibilityFactor() * hl.L(3.0f) : 0.0f, f);
    }

    public final void h3() {
        ValueAnimator valueAnimator;
        if (!this.q2 || (valueAnimator = this.k2) == null || !valueAnimator.isRunning()) {
            i3(D1(), org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? hl.m : 0));
        } else {
            this.f2 = this.g6;
            this.h2 = this.h6;
        }
    }

    public final void h4() {
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

    public final e43 i2() {
        e43 e43Var = this.K;
        if (e43Var != null) {
            return e43Var;
        }
        Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.E = mutate;
        mutate.setColorFilter(aob.v0(aob.qi, this.A0), PorterDuff.Mode.MULTIPLY);
        e43 e43Var2 = new e43(this.E, getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        this.K = e43Var2;
        return e43Var2;
    }

    public final void i3(float f, float f2) {
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - d2()) / ((this.a.getMeasuredWidth() - f2) - e2())));
        float N = ((hl.N(8.0f) + (hl.L(42.0f) * ((this.Q1 >= ((float) d2()) || max >= 0.33f) ? hl.R1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) : c00.z(f, 72.0f, 24.0f, 42.0f)))) * f) + ((float) Math.floor(this.actionBar.getTranslationY() + (uh9.v(f, 1.0f, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? hl.m : 0) - (hl.p * 21.0f))));
        this.f2 = (hl.L(7.0f) * f) + hl.L(1.3f) + N;
        this.h2 = (((float) Math.floor(hl.p * 11.0f)) * f) + N + hl.L(24.0f);
    }

    public final void i4(boolean z) {
        org.telegram.ui.ActionBar.a aVar;
        if ((this.v0 == null && this.w0 == null) || (aVar = this.actionBar) == null || this.simpleActionBar == null) {
            return;
        }
        float f = aVar.getOccupyStatusBar() ? hl.m : 0.0f;
        int L = hl.L(7.0f);
        float right = this.simpleActionBar.getBackButton().getRight() + L;
        float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
        lq8 lq8Var = this.v0;
        if (lq8Var != null) {
            float z2 = bp1.z(this.actionBar.getHeight(), f, 2.0f, f);
            boolean z3 = Math.abs(right - lq8Var.g0) > 0.1f || Math.abs(menuPillLeft - lq8Var.h0) > 0.1f || Math.abs(z2 - lq8Var.i0) > 0.1f;
            lq8Var.g0 = right;
            lq8Var.h0 = menuPillLeft;
            if (z) {
                lq8Var.n0.e(true, menuPillLeft);
            }
            lq8Var.i0 = z2;
            if (z3) {
                lq8Var.invalidate();
            }
        }
        gu8 gu8Var = this.w0;
        if (gu8Var != null) {
            float z4 = bp1.z(this.actionBar.getHeight(), f, 2.0f, f);
            int e2 = e2();
            boolean z5 = Math.abs(right - gu8Var.r) > 0.1f || Math.abs(menuPillLeft - gu8Var.s) > 0.1f || Math.abs(z4 - gu8Var.w) > 0.1f;
            gu8Var.r = right;
            gu8Var.s = menuPillLeft;
            if (z) {
                gu8Var.E.e(true, menuPillLeft);
            }
            gu8Var.w = z4;
            gu8Var.y = e2 + z4;
            if (z5) {
                gu8Var.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.q2;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        int v0;
        if (this.q2) {
            return false;
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && aVar.z()) {
            v0 = aob.v0(aob.w8, this.A0);
        } else if (this.X5 || this.G5 > 0.5f) {
            v0 = aob.v0(aob.d6, this.A0);
        } else {
            kc7 kc7Var = this.n6;
            v0 = kc7Var != null ? kc7Var.d(aob.I.o()) : aob.v0(aob.s8, this.A0);
        }
        return vm2.h(v0) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r3.contains((int) r7.getX(), ((int) r7.getY()) - r6.actionBar.getMeasuredHeight()) != false) goto L18;
     */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        gr8 gr8Var;
        jq8 jq8Var = this.o0;
        Rect rect = this.M2;
        if (jq8Var != null && jq8Var.getVisibility() == 0 && this.o0.getRealCount() > 1) {
            this.o0.getHitRect(rect);
            if (motionEvent != null) {
            }
        }
        if (this.N4 != -1 && (gr8Var = this.O) != null) {
            if (gr8Var.u0()) {
                this.O.getHitRect(rect);
                if (motionEvent == null || rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
                    gr8 gr8Var2 = this.O;
                    return gr8Var2.getSelectedTab() == gr8Var2.L0.getFirstTabId();
                }
            }
            return false;
        }
        return true;
    }

    @Override // ej6
    public final rz4 j() {
        return getBaseSimpleGlass().c();
    }

    public final float j2(int i) {
        View subtitleTextView;
        ema emaVar;
        kz1 kz1Var = this.m5;
        if (kz1Var == null || (kz1Var instanceof zu1) || kz1Var.p() == null) {
            return 1.0f;
        }
        f82 p = this.m5.p();
        if (i == 0) {
            subtitleTextView = p.getTitleTextView();
            emaVar = this.f;
        } else {
            subtitleTextView = p.getSubtitleTextView();
            emaVar = this.r;
        }
        float textSize = emaVar.getPaint().getTextSize();
        if (!(subtitleTextView instanceof ema) || textSize <= 0.0f) {
            return 1.0f;
        }
        return ((ema) subtitleTextView).getPaint().getTextSize() / textSize;
    }

    public final void j3() {
        zp8 zp8Var = this.a;
        if (zp8Var == null || this.c == null || zp8Var.getChildCount() <= 0 || this.t6) {
            return;
        }
        View view = null;
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i2 = -1;
        for (int i3 = 0; i3 < this.a.getChildCount(); i3++) {
            int S = RecyclerView.S(this.a.getChildAt(i3));
            View childAt = this.a.getChildAt(i3);
            if (S != -1 && childAt.getTop() < i) {
                i = childAt.getTop();
                i2 = S;
                view = childAt;
            }
        }
        if (view != null) {
            this.r6 = i2;
            int top = view.getTop();
            this.s6 = top;
            if (this.r6 == 0 && !this.p2 && top > d2()) {
                this.s6 = d2();
            }
            this.c.g1(i2, view.getTop() - this.a.getPaddingTop());
        }
    }

    public final void j4() {
        try {
            tb tbVar = this.U;
            if (tbVar != null && (tbVar.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.U.getForeground()).setColor(vm2.o(aob.v0(aob.d6, this.A0), 100));
            }
            float f = this.W5;
            Drawable drawable = this.E;
            int[] iArr = this.Y6;
            if (drawable != null) {
                int R0 = hl.R0(f, 1.0f, aob.v0(aob.qi, this.A0), aob.v0(aob.Fj, this.A0));
                int i = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (R0 != i) {
                    drawable.setColorFilter(new PorterDuffColorFilter(R0, mode));
                }
                iArr[6] = R0;
            }
            Drawable drawable2 = this.U6;
            if (drawable2 != null) {
                int v0 = aob.v0(aob.V6, this.A0);
                int i2 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (v0 != i2) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(v0, mode2));
                }
                iArr[3] = v0;
            }
            Drawable drawable3 = this.V6;
            if (drawable3 != null) {
                int v02 = aob.v0(aob.v8, this.A0);
                int i3 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (v02 != i3) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(v02, mode3));
                }
                iArr[4] = v02;
            }
            Drawable drawable4 = this.W6;
            if (drawable4 != null) {
                int v03 = aob.v0(aob.F8, this.A0);
                int i4 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (v03 != i4) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(v03, mode4));
                }
                iArr[5] = v03;
            }
            wm2 wm2Var = this.X6;
            if (wm2Var != null) {
                wm2Var.y = aob.v0(aob.nk, this.A0);
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
            cc4.g(e, true);
        }
    }

    public final float k2(float f, int i, View view) {
        float left;
        int paddingLeft;
        kz1 kz1Var = this.m5;
        if (kz1Var != null && !(kz1Var instanceof zu1) && this.fragmentView != null && (view.getParent() instanceof View)) {
            f82 p = this.m5.p();
            org.telegram.ui.ActionBar.a actionBar = ((org.telegram.ui.ActionBar.e) this.m5).getActionBar();
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
                uj3 uj3Var = this.l5;
                View C = (uj3Var == null || uj3Var.getFragmentView() == null) ? this.m5.C() : this.l5.getFragmentView();
                RectF rectF = this.l6;
                if (yic.c(view2, C, rectF)) {
                    float f2 = rectF.left;
                    if (yic.c((View) view.getParent(), this.fragmentView, rectF)) {
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

    public final void k3(boolean z) {
        int i = this.N4;
        if (i >= 0) {
            if (!z) {
                this.c.g1(i, -this.a.getPaddingTop());
                return;
            }
            z46 z46Var = new z46(getParentActivity(), 2, 0.6f);
            z46Var.a = this.N4;
            z46Var.p = -this.a.getPaddingTop();
            this.c.v0(z46Var);
        }
    }

    public final void k4() {
        TLRPC.UserFull userFull;
        if (this.Y0 == null) {
            return;
        }
        hl.T3(this.Y0, this.E2 == null && (((userFull = this.w2) != null && userFull.ttl_period > 0) || (this.v2 != null && xc2.y(13, this.F2) && this.v2.ttl_period > 0)), 0.8f, true, this.r5);
    }

    public final float l2() {
        if (this.T == null) {
            return 0.0f;
        }
        return this.T.getVisibilityFactor() * hl.L(22.0f);
    }

    public final ValueAnimator l3(final boolean z) {
        if (z) {
            hl.V2(getParentActivity(), this.classGuid);
            hl.g3(getParentActivity(), this.classGuid);
        }
        ValueAnimator valueAnimator = this.W1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.W1.cancel();
        }
        gu8 gu8Var = this.w0;
        if (gu8Var != null) {
            gu8Var.setActive(!z);
        }
        byte b = 0;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V1, z ? 0.0f : 1.0f);
        final float f = this.Q1;
        this.b.setTranslationY(f);
        this.b.setVisibility(0);
        this.U0.setVisibility(0);
        this.a.setVisibility(0);
        O2(true);
        this.Y.setVisibility(0);
        this.f.setVisibility(0);
        this.r.setVisibility(0);
        this.actionBar.C(this.V1 > 0.5f);
        int i = this.V1 > 0.5f ? 0 : 8;
        sla slaVar = this.T0;
        if (slaVar != null) {
            slaVar.setVisibility(i);
        }
        this.U0.setVisibility(i);
        this.U0.getSearchContainer().setVisibility(this.V1 <= 0.5f ? 0 : 8);
        this.b.setEmptyView(this.P);
        this.Y.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yp8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                RectF rectF = ProfileActivity.Z6;
                ProfileActivity.this.I2(ofFloat, f, z);
            }
        });
        ofFloat.addListener(new xq8(this, z, b));
        if (!z) {
            this.Y4 = true;
            j3();
            hl.U2(getParentActivity(), this.classGuid);
            this.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(k43.f);
        this.W1 = ofFloat;
        return ofFloat;
    }

    public final void l4(boolean z) {
        boolean z2;
        TLRPC.ChatFull chatFull;
        float D1 = D1();
        this.d6 = D1 > 0.2f && !this.X1 && (this.r0 == null || this.P2 == -1);
        J1();
        e29 e29Var = this.s;
        if (e29Var == null || e29Var.getVisibility() == 8) {
            z2 = false;
        } else {
            this.s.setTranslationY((((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? hl.m : 0)) + this.Q1) + this.U1) - hl.L(29.5f));
            z2 = D1 > 0.2f && !this.X1 && !this.s1 && (this.r0 == null || this.P2 == -1);
            if (z2 && this.f1 != 0) {
                z2 = (!xc2.T(this.F2) || this.F2.megagroup || (chatFull = this.v2) == null || chatFull.linked_chat_id == 0 || (this.E3 == -1 && this.F3 == -1)) ? false : true;
            }
            if (!this.G1) {
                if (z2 != (this.s.getTag() == null)) {
                    e29 e29Var2 = this.s;
                    if (z2) {
                        e29Var2.setTag(null);
                    } else {
                        e29Var2.setTag(0);
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
                            this.w.playTogether(ObjectAnimator.ofFloat(this.s, (Property<e29, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<e29, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<e29, Float>) View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.s, (Property<e29, Float>) View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.s, (Property<e29, Float>) View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.s, (Property<e29, Float>) View.ALPHA, 0.0f));
                        }
                        this.w.setDuration(150L);
                        this.w.addListener(new mq8(this, b));
                        this.w.start();
                    } else {
                        this.s.setScaleX(z2 ? 1.0f : 0.2f);
                        this.s.setScaleY(z2 ? 1.0f : 0.2f);
                        this.s.setAlpha(z2 ? 1.0f : 0.0f);
                    }
                }
            }
        }
        lq8 lq8Var = this.v0;
        if (lq8Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - hl.L(40.0f);
            int i = this.actionBar.getOccupyStatusBar() ? hl.m : 0;
            lq8Var.j0 = measuredWidth;
            lq8Var.l0 = z2;
            lq8Var.k0 = (org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f) + i;
            lq8Var.invalidate();
        }
        gu8 gu8Var = this.w0;
        if (gu8Var != null) {
            gu8Var.setExpandCoords(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? hl.m : 0) + this.Q1 + this.U1);
        }
    }

    public final int m2() {
        if (this.q1) {
            return 0;
        }
        if (this.f1 == 0 || !xc2.c0(getMessagesController().M0(Long.valueOf(this.f1)))) {
            return hl.L(50.0f);
        }
        return hl.L(N2() ? 24.0f : 38.0f);
    }

    public final void m4() {
        cga cgaVar;
        bha bhaVar;
        p66 p66Var;
        int v0;
        this.o6.clear();
        is8 is8Var = this.d1;
        if (is8Var != null) {
            is8Var.a(this.n6, true);
        }
        kq8 kq8Var = this.r;
        if (kq8Var != null) {
            this.r.setTextColor(vm2.f(this.l2, A1(kq8Var.getTag() instanceof Integer ? aob.v0(((Integer) this.r.getTag()).intValue(), this.A0) : aob.v0(aob.B8, this.A0), Boolean.valueOf(this.K0[0])), -1275068417));
        }
        gs8 gs8Var = this.F6;
        if (gs8Var != null) {
            gs8Var.a(vm2.f(this.l2, aob.p1(0.5f, aob.a(0.18f, -0.1f, this.c1)), 603979775));
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            aVar.H(vm2.f(this.W5, this.n6 != null ? -1 : aob.v0(aob.v8, this.A0), aob.v0(aob.y8, this.A0)), false);
            org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
            kc7 kc7Var = this.n6;
            aVar2.G(vm2.f(this.W5, kc7Var != null ? 1090519039 : kc7Var != null ? 553648127 : aob.v0(aob.f8, this.A0), aob.v0(aob.z8, this.A0)), false);
        }
        if (this.y != null) {
            kc7 kc7Var2 = this.n6;
            if (kc7Var2 != null) {
                int g = kc7Var2.g();
                boolean o = this.n6.o(aob.I.o());
                kc7 kc7Var3 = this.n6;
                v0 = aob.a(0.1f, aob.I.o() ? -0.1f : -0.08f, vm2.f(0.4f, g, o ? kc7Var3.k() : kc7Var3.i()));
            } else {
                v0 = aob.v0(aob.qi, this.A0);
            }
            this.y.setColorFilter(hl.R0(this.W5, 1.0f, v0, aob.v0(aob.Fj, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.I != null) {
            this.I.setColorFilter(hl.R0(this.W5, 1.0f, this.n6 != null ? -1 : aob.v0(aob.ri, this.A0), aob.v0(aob.d6, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        ns1 ns1Var = this.f;
        if (ns1Var != null) {
            ns1Var.setTextColor(vm2.f(this.l2, vm2.f(this.W5, this.n6 != null ? -1 : aob.v0(aob.mi, this.A0), aob.v0(aob.Fj, this.A0)), -1));
        }
        guc gucVar = this.a1;
        if (gucVar != null && (p66Var = (p66) gucVar.e) != null) {
            p66Var.invalidate();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.n6 == null ? vm2.f(this.T1, aob.v0(aob.gd, this.A0), -1) : -1, PorterDuff.Mode.MULTIPLY);
        }
        tu8 tu8Var = this.c0;
        if (tu8Var != null) {
            tu8Var.setColor(this.n6);
        }
        hl.d0(this.a, new gp8(this, (byte) 2));
        gr8 gr8Var = this.O;
        if (gr8Var != null && (bhaVar = gr8Var.L0) != null) {
            bhaVar.updateColors();
        }
        gr8 gr8Var2 = this.O;
        if (gr8Var2 != null && (cgaVar = gr8Var2.b0) != null) {
            cgaVar.m();
        }
        n4();
        M3();
        lq8 lq8Var = this.v0;
        if (lq8Var != null) {
            lq8Var.f(true, true);
        }
        gu8 gu8Var = this.w0;
        if (gu8Var != null) {
            gu8Var.a();
        }
    }

    public final e43 n2() {
        e43 e43Var = this.J;
        if (e43Var != null) {
            return e43Var;
        }
        this.y = aob.Q1.getConstantState().newDrawable().mutate();
        this.I = aob.R1.getConstantState().newDrawable().mutate();
        kc7 kc7Var = this.n6;
        if (kc7Var != null) {
            boolean o = kc7Var.o(aob.I.o());
            kc7 kc7Var2 = this.n6;
            int a = aob.a(0.1f, aob.I.o() ? -0.1f : -0.08f, o ? kc7Var2.k() : kc7Var2.i());
            Drawable drawable = this.y;
            int R0 = hl.R0(this.W5, 1.0f, a, aob.v0(aob.Fj, this.A0));
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(R0, mode);
            this.I.setColorFilter(hl.R0(this.W5, 1.0f, -1, aob.v0(aob.d6, this.A0)), mode);
        }
        e43 e43Var2 = new e43(new zm2(this.y, this.I), getParentActivity().getDrawable(R.drawable.verified_profile));
        this.J = e43Var2;
        return e43Var2;
    }

    public final void n3() {
        ap8 ap8Var = this.a0;
        if (ap8Var != null) {
            if (this.s1) {
                ap8Var.F = (byte) 6;
                return;
            }
            if (this.q1) {
                ap8Var.F = (byte) 5;
                return;
            }
            if (this.s2) {
                ap8Var.F = (byte) 2;
                return;
            }
            if (this.e1 != 0) {
                ap8Var.F = (byte) 0;
                return;
            }
            if (this.f1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                if (!xc2.T(M0)) {
                    this.a0.F = (byte) 3;
                    return;
                }
                boolean n0 = xc2.n0(M0);
                ap8 ap8Var2 = this.a0;
                if (n0) {
                    ap8Var2.F = (byte) 3;
                } else if (xc2.c0(M0)) {
                    ap8Var2.F = (byte) 4;
                } else {
                    ap8Var2.F = (byte) 1;
                }
            }
        }
    }

    public final void n4() {
        if (this.s != null) {
            try {
                int v0 = aob.v0(aob.oi, this.A0);
                int v02 = aob.v0(aob.pi, this.A0);
                int v03 = aob.v0(aob.ni, this.A0);
                if (this.n6 != null && aob.c1(v0)) {
                    v0 = aob.a(0.05f, -0.04f, this.n6.c(false));
                    kc7 kc7Var = this.n6;
                    if (kc7Var != null) {
                        int d = kc7Var.d(aob.I.o());
                        v02 = aob.C(aob.I.o(), aob.v0(aob.v6, this.A0), d, v02, d);
                    }
                    v03 = -1;
                }
                e29 e29Var = this.v6;
                e29 e29Var2 = this.s;
                int[] iArr = this.w6;
                if (e29Var == e29Var2 && iArr[0] == v0 && iArr[1] == v02 && iArr[2] == v03) {
                    return;
                }
                this.v6 = e29Var2;
                iArr[0] = v0;
                iArr[1] = v02;
                iArr[2] = v03;
                Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
                zm2 zm2Var = new zm2(mutate, aob.h0(hl.L(56.0f), v0, v02), 0, 0);
                int L = hl.L(56.0f);
                int L2 = hl.L(56.0f);
                zm2Var.e = L;
                zm2Var.f = L2;
                this.s.setBackground(zm2Var);
                this.s.setColorFilter(new PorterDuffColorFilter(v03, mode));
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean needDelayOpenAnimation() {
        return this.J1 == 0;
    }

    public final boolean o2() {
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
    public final void o3(float f) {
        int v0;
        boolean z;
        gs8 gs8Var;
        int i;
        int f2;
        gu8 gu8Var;
        is8 is8Var;
        if (this.actionBar != null) {
            this.glassEngine.g();
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? hl.m : 0);
            this.m2 = f;
            float S1 = hl.S1(f, this.n2);
            this.l2 = S1;
            I1();
            this.Y.setScaleX(this.c2);
            this.Y.setScaleY(this.c2);
            this.Y.setTranslationY(hl.R1((float) Math.ceil(this.b2), 0.0f, S1));
            this.f0.setRoundRadiusForExpand((int) hl.R1(m2(), 0.0f, S1));
            iq8 iq8Var = this.f0;
            float f3 = this.c2;
            boolean z2 = this.q2;
            iq8Var.I = S1;
            iq8Var.J = f3;
            iq8Var.H = z2;
            lq8 lq8Var = this.v0;
            if (lq8Var != null) {
                lq8Var.setExpandProgress(S1);
            }
            gu8 gu8Var2 = this.w0;
            if (gu8Var2 != null) {
                gu8Var2.setExpandProgress(S1);
            }
            jva jvaVar = this.T;
            if (jvaVar != null) {
                jvaVar.setParentExpanded(S1);
            }
            ap8 ap8Var = this.a0;
            if (ap8Var != null) {
                ap8Var.setParentExpanded(S1);
            }
            q3(S1);
            tu8 tu8Var = this.c0;
            if (tu8Var != null) {
                tu8Var.setParentExpanded(S1);
            }
            sla slaVar = this.U0;
            if (slaVar != null) {
                float f4 = 1.0f - S1;
                slaVar.setAlpha(f4);
                this.U0.setScaleY(f4);
                this.U0.setVisibility(0);
                sla slaVar2 = this.U0;
                slaVar2.setClickable(slaVar2.getAlpha() > 0.5f);
            }
            float D1 = D1();
            if (D1 >= 1.0f) {
                this.f0.setAlpha(1.0f);
            }
            if (!this.q2) {
                i3(D1, currentActionBarHeight);
            } else if (this.Q1 >= e2() && this.i2 < 0.33f) {
                h3();
            }
            yt9 yt9Var = this.L;
            if (yt9Var != null) {
                yt9Var.b(vm2.f(S1, aob.v0(aob.h8, this.A0), -1275068417));
            }
            Drawable drawable = this.x;
            if (drawable != null) {
                drawable.setColorFilter(this.n6 != null ? -1 : vm2.f(S1, aob.v0(aob.gd, this.A0), -1), PorterDuff.Mode.MULTIPLY);
            }
            e43 e43Var = this.J;
            if (e43Var != null) {
                e43Var.a(S1);
            }
            e43 e43Var2 = this.K;
            if (e43Var2 != null) {
                e43Var2.a(S1);
            }
            N3(S1);
            float f5 = this.e2;
            float f6 = this.g2;
            float N = hl.N(8.0f);
            float N2 = hl.N(this.q2 ? 8.0f : -24.0f);
            float N3 = hl.N(18.0f) - ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin;
            float f7 = currentActionBarHeight;
            float X1 = (((this.Q1 + f7) - X1()) - hl.N(30.0f)) - this.f.getBottom();
            float z3 = bp1.z(N3, f5, 2.0f, N + f5);
            float f8 = this.f2;
            float f9 = 1.0f - S1;
            float f10 = f9 * f9;
            float f11 = f9 * 2.0f * S1;
            float f12 = (z3 * f11) + (f5 * f10);
            float f13 = S1 * S1;
            float f14 = (N3 * f13) + f12;
            float z4 = (X1 * f13) + (bp1.z(X1, f8, 2.0f, N2 + f8) * f11) + (f8 * f10);
            float N4 = hl.N(16.0f) - ((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin;
            float X12 = (((this.Q1 + f7) - X1()) - hl.N(10.0f)) - this.r.getBottom();
            float z5 = bp1.z(N4, f6, 2.0f, N + f6);
            float f15 = this.h2;
            float f16 = (N4 * f13) + (z5 * f11) + (f6 * f10);
            float z6 = (f13 * X12) + (f11 * bp1.z(X12, f15, 2.0f, N2 + f15)) + (f10 * f15);
            float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? hl.m : 0)) - (hl.p * 21.0f)))) + hl.L(1.3f);
            float N5 = hl.N(22.7f) + floor;
            this.f.setTranslationX(f14);
            this.f.setTranslationY(Math.max(floor, z4));
            this.r.setTranslationX(g2(f16, Math.min(1.0f, D1) * this.C6));
            this.r.setTranslationY(h2(Math.max(N5, z6)));
            H3();
            a4();
            Object tag = this.r.getTag();
            if (tag instanceof Integer) {
                Integer num = (Integer) tag;
                v0 = aob.v0(num.intValue(), this.A0);
                if (num.intValue() == aob.si) {
                    z = true;
                    this.r.setTextColor(vm2.f(S1, A1(v0, Boolean.valueOf(z)), -1275068417));
                    if (this.Q1 > e2()) {
                        this.f.setPivotY(hl.U1(S1, 0, r4.getMeasuredHeight()));
                        float f17 = (0.12f * D1) + 1.0f;
                        this.f.setScaleX(hl.R1(f17, 1.38f, S1));
                        this.f.setScaleY(hl.R1(f17, 1.38f, S1));
                    }
                    P2(0, Math.min(1.0f, D1), true);
                    gs8Var = this.F6;
                    if (gs8Var != null) {
                        gs8Var.a(vm2.f(this.l2, aob.p1(0.5f, aob.a(0.18f, -0.1f, this.c1)), 603979775));
                    }
                    ns1 ns1Var = this.f;
                    if (this.n6 == null) {
                        f2 = -1;
                        i = -1;
                    } else {
                        i = -1;
                        f2 = vm2.f(this.l2, aob.v0(aob.mi, this.A0), -1);
                    }
                    ns1Var.setTextColor(f2);
                    this.actionBar.H(this.n6 == null ? i : vm2.f(S1, aob.v0(aob.v8, this.A0), i), false);
                    this.actionBar.setMenuOffsetSuppressed(true);
                    this.f0.setForegroundAlpha(S1);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                    layoutParams.width = (int) hl.R1(hl.N(100.0f), this.a.getMeasuredWidth() / this.c2, S1);
                    layoutParams.height = (int) hl.R1(hl.N(100.0f), (this.Q1 + f7) / this.c2, S1);
                    W1();
                    this.Y.requestLayout();
                    gu8Var = this.w0;
                    if (gu8Var != null) {
                        gu8Var.setExpandProgress(S1);
                    }
                    K3();
                    is8Var = this.d1;
                    if (is8Var == null && is8Var.L) {
                        is8Var.invalidate();
                        return;
                    }
                }
            } else {
                v0 = aob.v0(aob.B8, this.A0);
            }
            z = false;
            this.r.setTextColor(vm2.f(S1, A1(v0, Boolean.valueOf(z)), -1275068417));
            if (this.Q1 > e2()) {
            }
            P2(0, Math.min(1.0f, D1), true);
            gs8Var = this.F6;
            if (gs8Var != null) {
            }
            ns1 ns1Var2 = this.f;
            if (this.n6 == null) {
            }
            ns1Var2.setTextColor(f2);
            this.actionBar.H(this.n6 == null ? i : vm2.f(S1, aob.v0(aob.v8, this.A0), i), false);
            this.actionBar.setMenuOffsetSuppressed(true);
            this.f0.setForegroundAlpha(S1);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
            layoutParams2.width = (int) hl.R1(hl.N(100.0f), this.a.getMeasuredWidth() / this.c2, S1);
            layoutParams2.height = (int) hl.R1(hl.N(100.0f), (this.Q1 + f7) / this.c2, S1);
            W1();
            this.Y.requestLayout();
            gu8Var = this.w0;
            if (gu8Var != null) {
            }
            K3();
            is8Var = this.d1;
            if (is8Var == null) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        zn5 zn5Var = this.r0;
        if (zn5Var != null) {
            zn5Var.h(i, i2, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        bha bhaVar;
        if (super.onBackPressed(z)) {
            gr8 gr8Var = this.O;
            if (gr8Var == null || (bhaVar = gr8Var.L0) == null || !bhaVar.o0) {
                if (this.N4 == -1 || gr8Var == null || !gr8Var.F1) {
                    return this.actionBar.isEnabled();
                }
                if (z) {
                    gr8Var.E(true);
                }
            } else if (z) {
                F3();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        super.onBecomeFullyHidden();
        this.u6 = false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        n4();
        this.u6 = true;
        N1();
        if (!this.J0 || this.r5 || (view = this.fragmentView) == null) {
            return;
        }
        this.r5 = true;
        this.Y4 = true;
        view.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onConfigurationChanged(Configuration configuration) {
        View m;
        super.onConfigurationChanged(configuration);
        gr8 gr8Var = this.O;
        if (gr8Var != null) {
            gr8Var.onConfigurationChanged(configuration);
        }
        p2();
        if (this.o2 && this.q2 && (m = this.c.m(0)) != null) {
            this.a.scrollBy(0, m.getTop() - d2());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new gb(this, (byte) 10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0535, code lost:
    
        if (((ema) r0.getSubtitleTextView()).getLeftDrawable() != null) goto L191;
     */
    /* JADX WARN: Removed duplicated region for block: B:280:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0875  */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        org.telegram.ui.ActionBar.a aVar;
        s7 s7Var;
        ns8 ns8Var;
        s7 s7Var2;
        Object obj;
        s6 s6Var;
        s7 j;
        String str;
        long j2;
        float f;
        float f2;
        float f3;
        boolean z2;
        TLRPC.Chat chat;
        uj3 uj3Var;
        li3 li3Var;
        if (!this.J0) {
            f4();
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
                this.l5 = null;
                wk5 wk5Var = this.parentLayout;
                if (wk5Var != null && wk5Var.getFragmentStack().size() >= 2) {
                    Object obj2 = (org.telegram.ui.ActionBar.e) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    if (obj2 instanceof kz1) {
                        this.m5 = (kz1) obj2;
                    }
                    if (obj2 instanceof fj6) {
                        obj2 = ((fj6) obj2).M;
                    }
                    if ((obj2 instanceof uj3) && (li3Var = (uj3Var = (uj3) obj2).H3) != null) {
                        si3 si3Var = li3Var.a;
                        if (ik8.A(si3Var)) {
                            this.l5 = uj3Var;
                            this.m5 = si3Var;
                        }
                    }
                }
                Object obj3 = this.m5;
                if (obj3 == null || ((org.telegram.ui.ActionBar.e) obj3).getActionBar() == null) {
                    aVar = null;
                } else {
                    aVar = ((org.telegram.ui.ActionBar.e) this.m5).getActionBar();
                    aVar.setSkipDrawChild(true);
                }
                kz1 kz1Var = this.m5;
                byte b = 0;
                boolean z3 = (kz1Var instanceof zu1) && ((zu1) kz1Var).e != null;
                if (kz1Var != null) {
                    ImageView imageView5 = this.j0;
                    if (imageView5 != null) {
                        if (!(kz1Var instanceof zu1) || (chat = ((zu1) kz1Var).e) == null || chat.linked_community_id == 0) {
                            imageView5.setTag(null);
                            this.j0.setVisibility(8);
                        } else {
                            imageView5.setTag(1);
                            this.j0.setVisibility(0);
                        }
                    }
                    if (this.m0 != null) {
                        kz1 kz1Var2 = this.m5;
                        if ((kz1Var2 instanceof zu1) && xc2.p0(((zu1) kz1Var2).e)) {
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
                    h4();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(this.J1 == 2 ? 250L : 180L);
                this.a.setLayerType(2, null);
                if (z) {
                    this.k6 = 0.0f;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.r.getLayoutParams();
                    s7Var = null;
                    layoutParams.rightMargin = (int) ((hl.p * (-21.0f)) + hl.L(8.0f));
                    this.r.setLayoutParams(layoutParams);
                    if (this.J1 != 2) {
                        j2 = 0;
                        int ceil = (int) Math.ceil((hl.p * 21.0f) + (hl.q.x - hl.L(117.0f)));
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
                        this.S1 = d2();
                    } else {
                        str = "avatarAnimationProgress";
                        j2 = 0;
                        f = 1.0f;
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                        layoutParams3.width = (int) ((hl.q.x - hl.L(32.0f)) / 1.38f);
                        this.f.setLayoutParams(layoutParams3);
                    }
                    this.fragmentView.setBackgroundColor(0);
                    setAvatarAnimationProgress(0.0f);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, str, 0.0f, 1.0f));
                    e29 e29Var = this.s;
                    if (e29Var != null && e29Var.getTag() == null) {
                        this.s.setScaleX(0.2f);
                        this.s.setScaleY(0.2f);
                        this.s.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<e29, Float>) View.SCALE_X, f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<e29, Float>) View.SCALE_Y, f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<e29, Float>) View.ALPHA, f));
                    }
                    lq8 lq8Var = this.v0;
                    if (lq8Var != null && this.J1 == 2) {
                        lq8Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.v0, (Property<lq8, Float>) View.ALPHA, f));
                    }
                    if (this.J1 == 2) {
                        this.s0 = Y1(this.f0.getImageReceiver());
                        this.f.setTextColor(-1);
                        this.r.setTextColor(-1275068417);
                        this.actionBar.G(1090519039, false);
                        gs8 gs8Var = this.F6;
                        if (gs8Var != null) {
                            gs8Var.a(603979775);
                        }
                        xr8 xr8Var = this.N;
                        xr8Var.F = true;
                        xr8Var.setVisibility(0);
                    }
                    byte b2 = this.J1;
                    ns1 ns1Var = this.f;
                    if (b2 == 2) {
                        ns1Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<ns1, Float>) View.ALPHA, f));
                    } else {
                        ns1Var.setAlpha(f);
                    }
                    if (this.v0 != null) {
                        long a = a();
                        lq8 lq8Var2 = this.v0;
                        if (a > j2) {
                            lq8Var2.setAlpha(0.0f);
                            f2 = 1.0f;
                            arrayList.add(ObjectAnimator.ofFloat(this.v0, (Property<lq8, Float>) View.ALPHA, 1.0f));
                        } else {
                            f2 = 1.0f;
                            lq8Var2.setAlpha(1.0f);
                            this.v0.setFragmentTransitionProgress(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.v0, "fragmentTransitionProgress", 1.0f));
                        }
                    } else {
                        f2 = 1.0f;
                    }
                    gu8 gu8Var = this.w0;
                    if (gu8Var != null) {
                        gu8Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.w0, (Property<gu8, Float>) View.ALPHA, f2));
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
                        arrayList.add(ObjectAnimator.ofFloat(this.Q0, (Property<sla, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<sla, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.O0) {
                        this.S0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<sla, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.Y0.getTag() != null) {
                        this.Y0.setAlpha(0.0f);
                        f3 = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.Y0, (Property<ImageView, Float>) View.ALPHA, 1.0f));
                    } else {
                        f3 = 1.0f;
                    }
                    iq8 iq8Var = this.f0;
                    if (iq8Var != null) {
                        iq8Var.setCrossfadeProgress(f3);
                        arrayList.add(ObjectAnimator.ofFloat(this.f0, hr8.h0, 0.0f));
                    }
                    kz1 kz1Var3 = this.m5;
                    if (kz1Var3 != null) {
                        f82 p = kz1Var3.p();
                        if (p != null) {
                            b82 b82Var = p.e;
                            uj3 uj3Var2 = this.l5;
                            View C = (uj3Var2 == null || uj3Var2.getFragmentView() == null) ? this.m5.C() : this.l5.getFragmentView();
                            RectF rectF = this.l6;
                            this.k6 = yic.c(b82Var, C, rectF) ? rectF.left : 0.0f;
                            if (p.getSubtitleTextView() instanceof ema) {
                            }
                        }
                        if (!p.T[0] && !r2(p)) {
                            z2 = false;
                            setAvatarAnimationProgress(0.0f);
                        }
                        View subtitleTextView = p.getSubtitleTextView();
                        this.a5 = subtitleTextView;
                        this.b5 = ((this.m5 instanceof zu1) || subtitleTextView == null) ? 0.0f : this.r.getPaddingLeft() - this.a5.getPaddingLeft();
                        this.Z.invalidate();
                        this.r.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<kq8, Float>) View.ALPHA, 1.0f));
                        z2 = true;
                        setAvatarAnimationProgress(0.0f);
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        byte b3 = this.J1;
                        kq8 kq8Var = this.r;
                        if (b3 == 2) {
                            kq8Var.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<kq8, Float>) View.ALPHA, 1.0f));
                        } else {
                            kq8Var.setAlpha(1.0f);
                        }
                    }
                    animatorSet.playTogether(arrayList);
                } else {
                    s7Var = null;
                    this.S1 = this.Q1;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 1.0f, 0.0f));
                    e29 e29Var2 = this.s;
                    if (e29Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(e29Var2, (Property<e29, Float>) View.SCALE_X, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.s, (Property<e29, Float>) View.SCALE_Y, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.s, (Property<e29, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.J1 == 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f, (Property<ns1, Float>) View.ALPHA, 0.0f));
                    }
                    lq8 lq8Var3 = this.v0;
                    if (lq8Var3 != null) {
                        if (this.i1 > 0) {
                            arrayList2.add(ObjectAnimator.ofFloat(lq8Var3, (Property<lq8, Float>) View.ALPHA, 0.0f));
                        } else {
                            arrayList2.add(ObjectAnimator.ofFloat(lq8Var3, "fragmentTransitionProgress", 0.0f));
                        }
                    }
                    gu8 gu8Var2 = this.w0;
                    if (gu8Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(gu8Var2, (Property<gu8, Float>) View.ALPHA, 0.0f));
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
                        arrayList2.add(ObjectAnimator.ofFloat(this.Q0, (Property<sla, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.R0, (Property<sla, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.O0) {
                        this.S0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.S0, (Property<sla, Float>) View.ALPHA, 0.0f));
                    }
                    ImageView imageView6 = this.Y0;
                    if (imageView6 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) View.ALPHA, imageView6.getAlpha(), 0.0f));
                    }
                    iq8 iq8Var2 = this.f0;
                    if (iq8Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(iq8Var2, hr8.h0, 1.0f));
                    }
                    org.telegram.ui.ActionBar.e eVar = this.parentLayout.getFragmentStack().size() > 1 ? (org.telegram.ui.ActionBar.e) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) : null;
                    if (eVar instanceof zu1) {
                        zu1 zu1Var = (zu1) eVar;
                        qq1 qq1Var = zu1Var.p1;
                        hl.K(qq1Var, new sa8(this, qq1Var, zu1Var, (byte) 7));
                        View subtitleTextView2 = qq1Var.getSubtitleTextView();
                        if (((subtitleTextView2 instanceof ema) && ((ema) subtitleTextView2).getLeftDrawable() != null) || qq1Var.T[0] || r2(qq1Var)) {
                            this.a5 = qq1Var.getSubtitleTextView();
                            this.Z.invalidate();
                            arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<kq8, Float>) View.ALPHA, 0.0f));
                            animatorSet.playTogether(arrayList2);
                            ns8Var = this.G6;
                            if (ns8Var != null) {
                                ns8Var.animate().alpha(0.0f).setDuration(200L).setInterpolator(k43.h).start();
                            }
                        }
                        if (this.J1 == 2) {
                            arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<kq8, Float>) View.ALPHA, 0.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        ns8Var = this.G6;
                        if (ns8Var != null) {
                        }
                    } else {
                        kz1 kz1Var4 = this.m5;
                        if (kz1Var4 != null && kz1Var4.p() != null) {
                            f82 p2 = this.m5.p();
                            hl.K(p2, new hp8(this, p2, (byte) 3));
                            if (r2(p2)) {
                                View subtitleTextView3 = p2.getSubtitleTextView();
                                this.a5 = subtitleTextView3;
                                this.b5 = ((this.m5 instanceof zu1) || subtitleTextView3 == null) ? 0.0f : this.r.getPaddingLeft() - this.a5.getPaddingLeft();
                                this.Z.invalidate();
                                arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<kq8, Float>) View.ALPHA, 0.0f));
                                animatorSet.playTogether(arrayList2);
                                ns8Var = this.G6;
                                if (ns8Var != null) {
                                }
                            }
                        }
                        if (this.J1 == 2) {
                        }
                        animatorSet.playTogether(arrayList2);
                        ns8Var = this.G6;
                        if (ns8Var != null) {
                        }
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new op8(this, b));
                animatorSet.playTogether(ofFloat);
                if (this.P0 == null || (obj = this.m5) == null || (s6Var = ((org.telegram.ui.ActionBar.e) obj).getActionBar().F) == null || (j = s6Var.j(32)) == null || j.getVisibility() != 0) {
                    s7Var2 = s7Var;
                } else {
                    j.setAlpha(0.0f);
                    if (z) {
                        this.P0.setVisibility(0);
                    }
                    this.P0.setTag(j);
                    s7Var2 = j;
                }
                animatorSet.addListener(new wa2((Object) this, (Object) aVar, (View) s7Var2, (Object) runnable, (byte) 3));
                animatorSet.setInterpolator(this.J1 == 2 ? k43.f : new DecelerateInterpolator());
                hl.d3(new at(animatorSet, (byte) 1), 50L);
                return animatorSet;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onDialogDismiss(Dialog dialog) {
        zp8 zp8Var = this.a;
        if (zp8Var != null) {
            zp8Var.i1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0451  */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        long e;
        wia wiaVar;
        wr8 wr8Var;
        this.e1 = this.arguments.getLong("user_id", 0L);
        this.f1 = this.arguments.getLong("chat_id", 0L);
        this.g1 = this.arguments.getLong("topic_id", 0L);
        this.h1 = this.arguments.getBoolean("saved", false);
        this.r1 = this.arguments.getBoolean("similar", false);
        this.q1 = this.g1 != 0;
        this.E1 = this.arguments.getLong("ban_chat_id", 0L);
        this.e5 = this.arguments.getInt("report_reaction_message_id", 0);
        this.f5 = this.arguments.getLong("report_reaction_from_dialog_id", 0L);
        this.h5 = this.arguments.getBoolean("show_add_to_contacts", true);
        this.i5 = f78.h(this.arguments.getString("vcard_phone"), false);
        this.j5 = this.arguments.getString("vcard_first_name");
        this.k5 = this.arguments.getString("vcard_last_name");
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
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                this.F2 = M0;
                if (M0 == null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    getMessagesStorage().a.c(new hp8(this, countDownLatch, (byte) 4));
                    try {
                        countDownLatch.await();
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                    }
                    if (this.F2 != null) {
                        getMessagesController().a4(this.F2, true);
                    }
                }
                c34 c34Var = this.Y1;
                if (c34Var != null) {
                    c34Var.i();
                }
                if (this.F2.megagroup) {
                    a2(true);
                } else {
                    this.C1 = null;
                }
                getNotificationCenter().b(this, jn7.T);
                getNotificationCenter().b(this, jn7.g1);
                getNotificationCenter().b(this, jn7.w2);
                getNotificationCenter().b(this, jn7.b1);
                getNotificationCenter().b(this, jn7.r3);
                jn7.e().b(this, jn7.E5);
                this.D2 = new ArrayList();
                c4(true);
                if (this.v2 == null) {
                    this.v2 = getMessagesController().N0(this.f1);
                }
                if (xc2.T(this.F2)) {
                    getMessagesController().e3(this.classGuid, this.f1, true);
                } else if (this.v2 == null) {
                    this.v2 = getMessagesStorage().C0(this.f1, false, null, false, false, 0);
                }
                P3();
                e = getUserConfig().e();
                if (this.e1 != e) {
                }
                this.s1 = true;
                wiaVar = this.R;
                if (wiaVar != null) {
                    wiaVar.b(this);
                    this.R = null;
                    wiaVar = null;
                }
                if (wiaVar == null) {
                }
                wiaVar.y.add(this);
                getNotificationCenter().b(this, 2);
                getNotificationCenter().b(this, 1);
                getNotificationCenter().b(this, jn7.s);
                getNotificationCenter().b(this, jn7.u);
                getNotificationCenter().b(this, jn7.t5);
                getNotificationCenter().b(this, jn7.D1);
                getNotificationCenter().b(this, jn7.c0);
                getNotificationCenter().b(this, jn7.y5);
                getNotificationCenter().b(this, jn7.I5);
                getNotificationCenter().b(this, jn7.k3);
                getNotificationCenter().b(this, jn7.i5);
                getNotificationCenter().b(this, jn7.A3);
                getNotificationCenter().b(this, jn7.E3);
                getNotificationCenter().b(this, jn7.F3);
                getNotificationCenter().b(this, jn7.y1);
                getNotificationCenter().b(this, jn7.h3);
                getNotificationCenter().b(this, jn7.I3);
                getNotificationCenter().b(this, jn7.Y3);
                getNotificationCenter().b(this, jn7.Z3);
                jn7.e().b(this, jn7.l4);
                f4();
                wr8Var = this.d;
                if (wr8Var != null) {
                }
                if (this.arguments.containsKey("preload_messages")) {
                }
                if (this.e1 != 0) {
                    getConnectionsManager().sendRequest(new TL_account.getPassword(), new mp8(this, (byte) 5));
                }
                setBulletinDelegate(new t10(this, (byte) 17));
                if (this.e1 != 0) {
                    getMessagesController().R0(null);
                }
                n3();
                this.N6 = !this.J0 ? hl.L(72.0f) : 0;
                this.O6 = this.J0 ? hl.L(64.0f) : 0;
                return true;
            }
            return false;
        }
        long j = this.arguments.getLong("dialog_id", 0L);
        this.i1 = j;
        if (j != 0) {
            this.E2 = getMessagesController().a1(Integer.valueOf((int) (this.i1 & 4294967295L)));
        }
        c34 c34Var2 = this.Y1;
        if (c34Var2 != null) {
            c34Var2.i();
        }
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e1));
        if (X1 != null) {
            getNotificationCenter().b(this, jn7.N);
            getNotificationCenter().b(this, jn7.s1);
            getNotificationCenter().b(this, jn7.a0);
            getNotificationCenter().b(this, jn7.Y);
            getNotificationCenter().b(this, jn7.g0);
            getNotificationCenter().b(this, jn7.D0);
            getNotificationCenter().b(this, jn7.E0);
            getNotificationCenter().b(this, jn7.k0);
            jn7.e().b(this, jn7.A4);
            this.k1 = getMessagesController().x0.indexOfKey(this.e1) >= 0;
            if (X1.bot) {
                this.s2 = true;
                ls6 mediaDataController = getMediaDataController();
                long j2 = X1.id;
                mediaDataController.I0(j2, j2, true, this.classGuid, null);
            }
            this.w2 = getMessagesController().Y1(this.e1);
            getMessagesController().f3(getMessagesController().X1(Long.valueOf(this.e1)), this.classGuid, true, null);
            this.C1 = null;
            if (lbc.D(X1)) {
                zn5 zn5Var = new zn5(0, true, true);
                this.r0 = zn5Var;
                zn5Var.I = true;
                zn5Var.a = this;
                zn5Var.b = this;
                getMediaDataController().z();
                getMessagesController().l3();
                getMessagesController().o3(this.classGuid, getUserConfig().f(), true);
            }
            this.c5 = this.arguments.getInt("actionBarColor", 0);
            e = getUserConfig().e();
            if ((this.e1 != e || this.i1 == e) && !this.s1) {
                this.s1 = true;
            }
            wiaVar = this.R;
            if (wiaVar != null && wiaVar.s != this.g1) {
                wiaVar.b(this);
                this.R = null;
                wiaVar = null;
            }
            if (wiaVar == null) {
                wiaVar = new wia(this);
                this.R = wiaVar;
            }
            wiaVar.y.add(this);
            getNotificationCenter().b(this, 2);
            getNotificationCenter().b(this, 1);
            getNotificationCenter().b(this, jn7.s);
            getNotificationCenter().b(this, jn7.u);
            getNotificationCenter().b(this, jn7.t5);
            getNotificationCenter().b(this, jn7.D1);
            getNotificationCenter().b(this, jn7.c0);
            getNotificationCenter().b(this, jn7.y5);
            getNotificationCenter().b(this, jn7.I5);
            getNotificationCenter().b(this, jn7.k3);
            getNotificationCenter().b(this, jn7.i5);
            getNotificationCenter().b(this, jn7.A3);
            getNotificationCenter().b(this, jn7.E3);
            getNotificationCenter().b(this, jn7.F3);
            getNotificationCenter().b(this, jn7.y1);
            getNotificationCenter().b(this, jn7.h3);
            getNotificationCenter().b(this, jn7.I3);
            getNotificationCenter().b(this, jn7.Y3);
            getNotificationCenter().b(this, jn7.Z3);
            jn7.e().b(this, jn7.l4);
            f4();
            wr8Var = this.d;
            if (wr8Var != null) {
                wr8Var.f();
            }
            if (this.arguments.containsKey("preload_messages")) {
                getMessagesController().r0(this.e1, 0, null);
            }
            if (this.e1 != 0 && lbc.D(getMessagesController().X1(Long.valueOf(this.e1)))) {
                getConnectionsManager().sendRequest(new TL_account.getPassword(), new mp8(this, (byte) 5));
            }
            setBulletinDelegate(new t10(this, (byte) 17));
            if (this.e1 != 0 && lbc.D(getMessagesController().X1(Long.valueOf(this.e1))) && !this.s1) {
                getMessagesController().R0(null);
            }
            n3();
            this.N6 = !this.J0 ? hl.L(72.0f) : 0;
            this.O6 = this.J0 ? hl.L(64.0f) : 0;
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        gr8 gr8Var = this.O;
        if (gr8Var != null) {
            gr8Var.L0();
        }
        wia wiaVar = this.R;
        if (wiaVar != null) {
            wiaVar.b(this);
        }
        wia wiaVar2 = this.R;
        if (wiaVar2 != null) {
            wiaVar2.y.remove(this);
        }
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, jn7.s);
        getNotificationCenter().n(this, jn7.u);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, jn7.t5);
        getNotificationCenter().n(this, jn7.D1);
        getNotificationCenter().n(this, jn7.c0);
        getNotificationCenter().n(this, jn7.y5);
        getNotificationCenter().n(this, jn7.I5);
        getNotificationCenter().n(this, jn7.k3);
        getNotificationCenter().n(this, jn7.i5);
        getNotificationCenter().n(this, jn7.A3);
        getNotificationCenter().n(this, jn7.E3);
        getNotificationCenter().n(this, jn7.F3);
        getNotificationCenter().n(this, jn7.y1);
        getNotificationCenter().n(this, jn7.h3);
        getNotificationCenter().n(this, jn7.I3);
        getNotificationCenter().n(this, jn7.Y3);
        getNotificationCenter().n(this, jn7.Z3);
        jn7.e().n(this, jn7.l4);
        jq8 jq8Var = this.o0;
        if (jq8Var != null) {
            jq8Var.K();
        }
        ws8 ws8Var = this.n0;
        if (ws8Var != null) {
            ws8Var.c();
        }
        this.f6 = null;
        if (this.e1 != 0) {
            getNotificationCenter().n(this, jn7.s1);
            getNotificationCenter().n(this, jn7.N);
            getNotificationCenter().n(this, jn7.a0);
            getNotificationCenter().n(this, jn7.Y);
            getNotificationCenter().n(this, jn7.g0);
            getNotificationCenter().n(this, jn7.D0);
            getNotificationCenter().n(this, jn7.E0);
            getNotificationCenter().n(this, jn7.k0);
            jn7.e().n(this, jn7.A4);
            getMessagesController().h1.remove(Long.valueOf(this.e1));
        } else if (this.f1 != 0) {
            jn7.e().n(this, jn7.E5);
            getNotificationCenter().n(this, jn7.r3);
            getNotificationCenter().n(this, jn7.T);
            getNotificationCenter().n(this, jn7.g1);
            getNotificationCenter().n(this, jn7.w2);
            getNotificationCenter().n(this, jn7.b1);
        }
        iq8 iq8Var = this.f0;
        if (iq8Var != null) {
            iq8Var.setImageDrawable(null);
        }
        zn5 zn5Var = this.r0;
        if (zn5Var != null) {
            zn5Var.c();
        }
        nq8 nq8Var = this.Z4;
        if (nq8Var != null) {
            nq8Var.b();
        }
        ks8 ks8Var = this.z2;
        if (ks8Var != null && this.y2) {
            ks8Var.b(true);
            this.z2 = null;
        }
        j61 j61Var = this.D5;
        if (j61Var != null) {
            this.D5 = null;
            hl.c3(j61Var);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        mha mhaVar;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        zn5 zn5Var = this.r0;
        if (zn5Var != null) {
            zn5Var.i();
        }
        c34 c34Var = this.Y1;
        if (c34Var != null) {
            c34Var.g();
        }
        gr8 gr8Var = this.O;
        if (gr8Var == null || (mhaVar = gr8Var.W) == null) {
            return;
        }
        mhaVar.e = false;
        if (mhaVar.c != null) {
            mhaVar.a.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        boolean z;
        boolean z2;
        zn5 zn5Var = this.r0;
        if (zn5Var != null) {
            zn5Var.j(i, strArr, iArr);
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
                xkc.h(getParentActivity(), null, i);
                return;
            } else {
                xkc.l(this.F2, null, getMessagesController().g1(this.f1, false, null) == null, null, getParentActivity(), this, getAccountInstance());
                return;
            }
        }
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e1));
        if (X1 == null) {
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
            xkc.h(getParentActivity(), null, i);
            return;
        }
        boolean z3 = i == 102;
        TLRPC.UserFull userFull = this.w2;
        xkc.m(X1, z3, userFull != null && userFull.video_calls_available, getParentActivity(), this.w2, getAccountInstance());
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        TLRPC.User X1;
        tb tbVar;
        super.onResume();
        gr8 gr8Var = this.O;
        if (gr8Var != null) {
            gr8Var.e1 = true;
            lha lhaVar = gr8Var.K;
            if (lhaVar != null) {
                lhaVar.f();
            }
            ria riaVar = gr8Var.N;
            if (riaVar != null) {
                riaVar.f();
            }
            sia siaVar = gr8Var.M;
            if (siaVar != null) {
                siaVar.X(false);
            }
            for (int i = 0; i < gr8Var.n0.length; i++) {
                gr8Var.N(i);
            }
            mha mhaVar = gr8Var.W;
            if (mhaVar != null) {
                mhaVar.e = true;
                if (mhaVar.c != null) {
                    mhaVar.a.onResume();
                }
            }
        }
        p2();
        wr8 wr8Var = this.d;
        if (wr8Var != null) {
            this.X4 = true;
            wr8Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).w() && (tbVar = this.U) != null && tbVar.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        zn5 zn5Var = this.r0;
        if (zn5Var != null) {
            zn5Var.k();
            setParentActivityTitle(ob6.M0(2131745223, null));
        }
        e4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new gb(this, (byte) 10));
        }
        ns1 ns1Var = this.f;
        if (ns1Var != null) {
            setParentActivityTitle(ns1Var.getText());
        }
        if (this.e1 != 0 && (X1 = getMessagesController().X1(Long.valueOf(this.e1))) != null && X1.photo == null && this.Q1 >= d2()) {
            this.k2.cancel();
            float[] fArr = this.n2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            o3(1.0f);
            this.o0.setVisibility(8);
            this.Q1 = d2();
            this.p2 = false;
            this.c.g1(0, d2() - this.a.getPaddingTop());
        }
        c34 c34Var = this.Y1;
        if (c34Var != null) {
            c34Var.a();
        }
        Y3();
        O2(false);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.z0.setColor(aob.v0(aob.i6, this.A0));
            G3();
            j4();
            B1();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        jla jlaVar;
        if (z && (jlaVar = this.simpleActionBar) != null) {
            jlaVar.setAlpha(1.0f);
        }
        if (z) {
            if (!z2) {
                byte b = this.J1;
                if (b != 0 && this.M1) {
                    if (b == 1) {
                        this.l2 = 0.0f;
                        jva jvaVar = this.T;
                        if (jvaVar != null) {
                            jvaVar.setParentExpanded(0.0f);
                        }
                        ap8 ap8Var = this.a0;
                        if (ap8Var != null) {
                            ap8Var.setParentExpanded(0.0f);
                        }
                        q3(0.0f);
                        tu8 tu8Var = this.c0;
                        if (tu8Var != null) {
                            tu8Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    G1();
                    if (this.I1) {
                        L1(true);
                    }
                }
                if (!this.r5) {
                    this.r5 = true;
                    this.Y4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.T4);
            tb tbVar = this.U;
            if (tbVar != null && tbVar.getVisibility() == 0) {
                this.U.setVisibility(8);
                this.U.setBackground(null);
            }
        }
        this.H1 = false;
        I1();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        tb tbVar = this.U;
        if (tbVar == null || tbVar.getVisibility() != 0) {
            return;
        }
        tb tbVar2 = this.U;
        if (z) {
            tbVar2.setAlpha(1.0f - f);
        } else {
            tbVar2.setAlpha(f);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        ImageView imageView;
        ap8 ap8Var;
        super.onTransitionAnimationStart(z, z2);
        this.i6 = z;
        if (z && (ap8Var = this.a0) != null) {
            ArrayList arrayList = ap8Var.a;
            if (ap8Var.F == 6) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    xo8 xo8Var = (xo8) arrayList.get(i);
                    b29 b29Var = xo8Var.k;
                    if (b29Var != null) {
                        if (xo8Var.a == 15) {
                            b29Var.H(14);
                        } else {
                            b29Var.H(0);
                        }
                        xo8Var.k.start();
                    }
                }
            }
        }
        if (!z && (imageView = this.P0) != null && imageView.getTag() != null && (this.P0.getTag() instanceof s7)) {
            ((s7) this.P0.getTag()).setAlpha(1.0f);
        }
        if (z ? !z2 : z2) {
            if (this.J1 != 0 && this.M1 && !this.q2) {
                this.G1 = true;
                if (!z) {
                    float[] fArr = this.f6;
                    if (fArr == null) {
                        fArr = new float[14];
                        this.f6 = fArr;
                    }
                    this.F1 = this.Q1;
                    fArr[0] = this.Y.getScaleX();
                    this.f6[1] = this.Y.getTranslationX();
                    this.f6[2] = this.Y.getTranslationY();
                    ap8 ap8Var2 = this.a0;
                    if (ap8Var2 != null) {
                        this.f6[3] = ap8Var2.getAlpha();
                    }
                    gu8 gu8Var = this.w0;
                    if (gu8Var != null) {
                        float[] fArr2 = this.f6;
                        fArr2[4] = gu8Var.e;
                        fArr2[5] = gu8Var.f;
                    }
                    if (this.F6 != null) {
                        this.f6[6] = r0.getAlpha();
                    }
                    this.f6[7] = this.f.getScaleX();
                    this.f6[8] = this.f.getTranslationY();
                    this.f6[9] = this.r.getTranslationY();
                    this.f6[10] = this.f.getLayoutParams().width;
                    float[] fArr3 = this.f6;
                    fArr3[11] = this.d2;
                    fArr3[12] = this.f.getTranslationX();
                    this.f6[13] = this.r.getTranslationX();
                    kg5 kg5Var = this.H6;
                    if (kg5Var != null) {
                        kg5Var.f(true);
                    }
                }
            }
        }
        if (z) {
            if (this.r0 != null) {
                this.T4 = getNotificationCenter().p(new int[]{jn7.r, jn7.s, jn7.W, jn7.X, jn7.E0, jn7.u4}, this.T4, true);
            } else {
                this.T4 = getNotificationCenter().p(new int[]{jn7.r, jn7.s, jn7.W, jn7.X, jn7.u4}, this.T4, true);
            }
            if (!z2 && getParentActivity() != null) {
                this.d5 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.H1 = true;
        I1();
    }

    public final void p2() {
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        this.o2 = point.x > point.y;
    }

    @Override // oj3
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        long j = ((if7) arrayList.get(0)).a;
        Bundle l = bs2.l("scrollToTopOnResume", true);
        if (wf3.B(j)) {
            l.putInt("enc_id", (int) (4294967295L & j));
        } else if (wf3.D(j)) {
            l.putLong("user_id", j);
        } else if (wf3.y(j)) {
            l.putLong("chat_id", -j);
        }
        if (!getMessagesController().C(l, uj3Var, null, null)) {
            return false;
        }
        jn7 notificationCenter = getNotificationCenter();
        int i3 = jn7.s;
        notificationCenter.n(this, i3);
        getNotificationCenter().k(i3, new Object[0]);
        presentFragment(new zu1(l), true);
        removeSelfFromStack();
        getSendMessagesHelper().q0(p7a.g(getMessagesController().X1(Long.valueOf(this.e1)), j, null, null, null, null, z2, i, i2));
        if (!TextUtils.isEmpty(charSequence)) {
            r7a.Z(k5.a(this.currentAccount), charSequence, j, 0L, z2, i, i2);
        }
        return true;
    }

    public final boolean q2() {
        if (this.F2 != null) {
            return getMessagesController().m2(this.F2);
        }
        uc7 messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.w2;
        messagesController.getClass();
        return uc7.Q2(userFull);
    }

    public final void q3(float f) {
        this.P5 = f;
        qs8 qs8Var = this.O5;
        if (qs8Var != null) {
            qs8Var.b(f);
        }
        W3();
    }

    public final boolean r2(f82 f82Var) {
        kz1 kz1Var = this.m5;
        if (((kz1Var instanceof zu1) && !((zu1) kz1Var).x4) || !(f82Var.getSubtitleTextView() instanceof ema)) {
            return false;
        }
        return !TextUtils.equals(((ema) f82Var.getSubtitleTextView()).getText() != null ? r3.toString() : null, this.r.getText() != null ? this.r.getText().toString() : null);
    }

    public final void r3(TLRPC.ChatFull chatFull) {
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
        gr8 gr8Var = this.O;
        if (gr8Var != null) {
            gr8Var.setChatInfo(this.v2);
        }
        jq8 jq8Var = this.o0;
        if (jq8Var != null && !this.q1) {
            jq8Var.setChatInfo(this.v2);
        }
        lq8 lq8Var = this.v0;
        if (lq8Var != null && (chatFull3 = this.v2) != null) {
            lq8Var.setStories(chatFull3.stories);
        }
        gu8 gu8Var = this.w0;
        if (gu8Var != null) {
            gu8Var.a();
        }
        iq8 iq8Var = this.f0;
        if (iq8Var != null) {
            iq8Var.setHasStories(N2());
        }
        U1();
        if (this.f1 != 0) {
            boolean z = f11.a;
            boolean z2 = (getMessagesController().N3() || (chatFull2 = this.v2) == null || !chatFull2.stargifts_available) ? false : true;
            this.T0.Q(38, z2);
            ap8 ap8Var = this.a0;
            if (ap8Var != null) {
                ap8Var.o(3, z2);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void restoreSelfArgs(Bundle bundle) {
        zn5 zn5Var = this.r0;
        if (zn5Var != null) {
            zn5Var.f = bundle.getString("path");
        }
    }

    @Override // oj3
    public final boolean s(uj3 uj3Var) {
        return false;
    }

    public final boolean s2() {
        return (this.r0 == null || this.s1) ? false : true;
    }

    public final void s3(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z == null || (tL_emojiStatusCollectible2 = this.K6) == tL_emojiStatusCollectible) {
            return;
        }
        if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
            this.K6 = tL_emojiStatusCollectible;
            kg5 kg5Var = this.H6;
            byte b = 1;
            if (kg5Var != null) {
                kg5Var.f(true);
            }
            if (tL_emojiStatusCollectible == null || TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                return;
            }
            this.J6 = null;
            this.H6 = new kg5(getParentActivity(), 3);
            this.I6 = aob.v(tL_emojiStatusCollectible.center_color | (-16777216), aob.p1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
            this.H6.setPadding(hl.L(4.0f), 0, hl.L(4.0f), hl.L(2.0f));
            kg5 kg5Var2 = this.H6;
            int p1 = aob.p1(0.5f, tL_emojiStatusCollectible.text_color | (-16777216));
            kg5Var2.M0 = true;
            kg5Var2.U0 = System.currentTimeMillis();
            kg5Var2.N0 = new Path();
            kg5Var2.O0 = hl.N(0.66f) / 2.0f;
            kg5Var2.P0 = new Paint(1);
            kg5Var2.Q0 = new Paint(1);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, hl.L(64.0f), 0.0f, new int[]{aob.p1(0.0f, p1), aob.p1(1.0f, p1), aob.p1(0.0f, p1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            kg5Var2.T0 = linearGradient;
            kg5Var2.Q0.setShader(linearGradient);
            kg5Var2.R0 = new LinearGradient(0.0f, 0.0f, hl.L(64.0f), 0.0f, new int[]{aob.p1(0.0f, p1), aob.p1(0.5f, p1), aob.p1(0.0f, p1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            kg5Var2.S0 = new Matrix();
            kg5Var2.P0.setShader(kg5Var2.R0);
            kg5Var2.Q0.setStyle(Paint.Style.STROKE);
            kg5Var2.Q0.setStrokeJoin(Paint.Join.ROUND);
            kg5Var2.Q0.setStrokeCap(Paint.Cap.ROUND);
            kg5Var2.Q0.setStrokeWidth(hl.N(0.66f));
            this.Z.addView(this.H6, tre.c(24.0f, -1));
            this.H6.u(9.33f);
            kg5 kg5Var3 = this.H6;
            Typeface o = hl.o();
            kg5Var3.I.x(o);
            kg5Var3.K.setTypeface(o);
            this.H6.t(tL_emojiStatusCollectible.title);
            kg5 kg5Var4 = this.H6;
            kg5Var4.d = -1L;
            kg5Var4.m(5.66f, 2.66f, 5.66f, 2.66f);
            kg5 kg5Var5 = this.H6;
            kg5Var5.getClass();
            kg5Var5.E = hl.N(4.0f);
            kg5Var5.F = hl.N(2.66f);
            this.H6.r();
            this.H6.q(16.0f);
            this.H6.v();
            this.H6.setOnClickListener(new pp8(this, tL_emojiStatusCollectible.slug, b));
            if (this.Q1 < hl.L(82.0f)) {
                this.J6 = Boolean.FALSE;
                this.H6.setAlpha(0.0f);
            }
            K3();
            kg5 kg5Var6 = this.H6;
            Objects.requireNonNull(kg5Var6);
            hl.d3(new ug(kg5Var6, (byte) 7), 6000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        zn5 zn5Var = this.r0;
        if (zn5Var == null || (str = zn5Var.f) == null) {
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
        I1();
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            jlaVar.setAlpha(f);
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            aVar.getBackButton().setTranslationX(hl.R1(k2(hl.L(2.0f), 2, this.actionBar.getBackButton()), hl.L(2.0f), f));
        }
        if (this.J1 == 2) {
            this.f0.setProgressToExpand(f);
            ap8 ap8Var = this.a0;
            if (ap8Var != null) {
                ap8Var.setParentExpanded(f);
            }
            q3(f);
            tu8 tu8Var = this.c0;
            if (tu8Var != null) {
                tu8Var.setParentExpanded(f);
            }
            jva jvaVar = this.T;
            if (jvaVar != null) {
                jvaVar.setParentExpanded(f);
            }
            H3();
            a4();
        }
        this.a.setAlpha(f);
        this.a.setTranslationX(hl.L(48.0f) - (hl.L(48.0f) * f));
        if (this.J1 != 2 || (v0 = this.s0) == 0) {
            if (this.e1 == 0) {
                if (xc2.S(this.currentAccount, this.f1)) {
                    boolean z = this.F2.megagroup;
                }
            }
            vnb vnbVar = this.A0;
            int[][] iArr = rb0.L;
            v0 = aob.v0(aob.a7, vnbVar);
        }
        int i = this.c5;
        if (i == 0) {
            i = aob.v0(aob.s8, this.A0);
        }
        this.d1.setBackgroundColor(vm2.f(f, vm2.o(i, 0), v0));
        rsb rsbVar = this.m0;
        int f2 = vm2.f(f, i, v0);
        rsbVar.k = true;
        rsbVar.b.setColor(f2);
        if (this.n6 != null) {
            v02 = -1;
        } else {
            if (this.e1 == 0) {
                if (xc2.S(this.currentAccount, this.f1)) {
                    boolean z2 = this.F2.megagroup;
                }
            }
            vnb vnbVar2 = this.A0;
            int[][] iArr2 = rb0.L;
            v02 = aob.v0(aob.g8, vnbVar2);
        }
        this.actionBar.H(vm2.f(this.T1, aob.v0(aob.v8, this.A0), v02), false);
        int v04 = this.n6 == null ? aob.v0(aob.mi, this.A0) : -1;
        int v05 = aob.v0(aob.A8, this.A0);
        ns1 ns1Var = this.f;
        if (ns1Var != null && this.J1 != 2) {
            ns1Var.setTextColor(vm2.f(f, v05, v04));
        }
        boolean[] zArr = this.K0;
        if (zArr[0]) {
            v03 = aob.v0(aob.si, this.A0);
        } else {
            if (this.e1 == 0) {
                if (xc2.S(this.currentAccount, this.f1)) {
                    boolean z3 = this.F2.megagroup;
                }
            }
            vnb vnbVar3 = this.A0;
            int[][] iArr3 = rb0.L;
            v03 = aob.v0(aob.h8, vnbVar3);
        }
        int v06 = aob.v0(zArr[0] ? aob.pa : aob.B8, this.A0);
        kq8 kq8Var = this.r;
        if (kq8Var != null && this.J1 != 2) {
            kq8Var.setTextColor(vm2.f(f, v06, A1(v03, Boolean.valueOf(zArr[0]))));
        }
        this.Q1 = this.S1 * f;
        long j = this.e1;
        if (j == 0) {
            j = this.f1;
        }
        vnb vnbVar4 = this.A0;
        int[][] iArr4 = rb0.L;
        int v07 = aob.v0(aob.p8[rb0.d(j)], vnbVar4);
        long j2 = this.e1;
        if (j2 == 0) {
            j2 = this.f1;
        }
        int c = rb0.c(j2);
        if (v07 != c) {
            this.q0.g(vm2.f(f, c, v07));
            this.f0.invalidate();
        }
        int i2 = this.d5;
        if (i2 != 0) {
            setNavigationBarColor(vm2.f(f, i2, getNavigationBarColor()));
        }
        this.d1.invalidate();
        O2(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        qr8 qr8Var = this.j6;
        if (qr8Var != null) {
            qr8Var.invalidate();
        }
        if (a() > 0) {
            iq8 iq8Var = this.f0;
            if (iq8Var != null) {
                iq8Var.setProgressToStoriesInsets(this.T1);
            }
            lq8 lq8Var = this.v0;
            if (lq8Var != null) {
                lq8Var.setProgressToStoriesInsets(this.T1);
            }
            gu8 gu8Var = this.w0;
            if (gu8Var != null) {
                gu8Var.setProgressToStoriesInsets(this.T1);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void setParentLayout(wk5 wk5Var) {
        super.setParentLayout(wk5Var);
        c34 c34Var = this.Y1;
        if (c34Var != null) {
            c34Var.g();
            this.Y1 = null;
        }
        if (wk5Var == null || wk5Var.getParentActivity() == null) {
            return;
        }
        this.Y1 = new c34(wk5Var.getParentActivity().getWindow(), new bp8(this, (byte) 0));
    }

    public final void t2() {
        boolean z;
        TLRPC.Document document;
        if (this.b0 == null) {
            if (MediaController.z().R0 != null && MediaController.z().R0.a == this.currentAccount && MediaController.z().R0.b == a()) {
                this.b0 = MediaController.z().R0;
            } else {
                pc7 pc7Var = new pc7(this.currentAccount, a());
                this.b0 = pc7Var;
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    ArrayList arrayList = pc7Var.c;
                    arrayList.clear();
                    pc7Var.b();
                    arrayList.add(0, pc7Var.d(document));
                }
            }
        }
        if (this.b0.c.isEmpty()) {
            return;
        }
        if (MediaController.z().R0 == this.b0 && MediaController.z().H((r47) this.b0.c.get(0))) {
            z = true;
        } else {
            MediaController.z().k();
            z = false;
        }
        MediaController.z().R0 = this.b0;
        MediaController.z().S0.clear();
        MediaController.z().S0.addAll(this.b0.c);
        if (!z) {
            MediaController.z().V((r47) this.b0.c.get(0));
        }
        showDialog(new j20(getParentActivity(), this.A0));
    }

    public final void t3(boolean z) {
        Drawable t = this.f0.getImageReceiver().t();
        String str = null;
        if (t instanceof idc) {
            this.f0.v(null, null, t);
            return;
        }
        if (t instanceof lm) {
            lm lmVar = (lm) t;
            this.f0.v(null, null, lmVar);
            if (z) {
                lmVar.f(this.f0);
                return;
            }
            return;
        }
        jn5 D = this.o0.D(0);
        if (D != null && D.p == 2) {
            str = "avatar";
        }
        this.f0.v(D, str, t);
    }

    @Override // tha
    public final boolean u() {
        return this.i6;
    }

    public final void u2(float f, float f2, int i) {
        byte b = 0;
        switch (i) {
            case 0:
                boolean z = this.q1;
                if (!z) {
                    if (this.e1 == 0) {
                        if (this.f1 != 0) {
                            if (!xc2.c0(getMessagesController().M0(Long.valueOf(this.f1)))) {
                                if (!V1()) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", this.f1);
                                    if (getMessagesController().C(bundle, this, null, null)) {
                                        presentFragment(new zu1(bundle), false);
                                        break;
                                    }
                                }
                            } else {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", this.f1);
                                if (getMessagesController().C(bundle2, this, null, null)) {
                                    presentFragment(new zu1(bundle2), false);
                                    break;
                                }
                            }
                        }
                    } else {
                        b3();
                        break;
                    }
                } else if (z) {
                    V1();
                    break;
                }
                break;
            case 1:
                V2(this.a0, f, f2, true);
                break;
            case 2:
                c3();
                break;
            case 3:
                T2();
                break;
            case 4:
                W2();
                break;
            case 5:
            case 10:
            case 11:
                S2(false);
                break;
            case 6:
                S2(true);
                break;
            case 7:
                U2(true);
                break;
            case 8:
                nb9.G0(a(), this);
                break;
            case 9:
                L2(false);
                break;
            case 12:
                getMessagesController().X3.edit().putBoolean("story_keep", true).apply();
                id idVar = new id(3, this.A0, getParentActivity());
                idVar.q(200L);
                uc7.s1(this.currentAccount).O1().j(a(), new v35(this, idVar, (byte) 21), true, this.A0);
                break;
            case 13:
                R2(true);
                break;
            case 14:
                Y2();
                break;
            case 15:
                TLRPC.User f3 = getUserConfig().f();
                if (f3 != null) {
                    fu5 I = fu5.I(this, this.a0);
                    I.w = false;
                    I.i = (byte) 3;
                    I.b(R.drawable.msg_qrcode, ob6.M0(2131746227, null), new y56(this, (byte) 26), false);
                    I.b(R.drawable.msg_copy, ob6.M0(2131746405, null), new xp8(f3, b), false);
                    I.b(R.drawable.msg_edit, ob6.M0(2131746347, null), new y56(this, (byte) 27), false);
                    I.c0 = true;
                    I.b0(f - hl.L(8.0f), this.a0.getMeasuredHeight() - hl.L(16.0f));
                    I.a0();
                    break;
                }
                break;
            case 16:
                presentFragment(new UserInfoActivity());
                break;
            case 17:
                presentFragment(new tba(null));
                break;
        }
    }

    @Override // ej6
    public final void v() {
        this.a.A0(0);
    }

    public final /* synthetic */ void v2(Context context, long j, TL_payments.connectedBotStarRef connectedbotstarref) {
        int i = this.currentAccount;
        if (connectedbotstarref == null) {
            ng1.J0(context, i, this.w2.starref_program, getUserConfig().e(), this.A0, false);
        } else {
            ng1.K0(context, i, connectedbotstarref, j, this.A0);
        }
    }

    public final void w2(Boolean bool) {
        long j = this.e1;
        if (j == 0) {
            long j2 = this.f1;
            j = j2 != 0 ? -j2 : this.i1;
        }
        long j3 = j;
        boolean booleanValue = bool.booleanValue();
        int i = this.currentAccount;
        if (booleanValue) {
            uc7.s1(i).U(this.f5, j3);
        } else {
            uc7.s1(i).f0(this.f5, this.e5, j3);
        }
        this.e5 = 0;
        Z3(false, false);
        c21 c21Var = new c21(getParentActivity(), this.A0);
        c21Var.h(R.raw.chats_infotip, new String[0]);
        c21Var.b.setText(ob6.M0(2131746131, null));
        d31.b0(this).b(c21Var, 1500).j();
    }

    public final void w3(or8 or8Var) {
        if (this.o5 == or8Var) {
            return;
        }
        this.o5 = or8Var;
        hl.d0(this.a, new gp8(this, (byte) 0));
    }

    @Override // yn5
    public final boolean x() {
        return false;
    }

    public final void x2(sg2[] sg2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = getMessagesController().o1(this.e1);
        tL_messages_reportReaction.peer = getMessagesController().j1(this.f5);
        tL_messages_reportReaction.id = this.e5;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reportReaction, new xe2((byte) 4));
        sg2 sg2Var = sg2VarArr[0];
        if (sg2Var != null && sg2Var.b()) {
            getMessagesController().d0(-this.f5, getMessagesController().X1(Long.valueOf(this.e1)));
        }
        this.e5 = 0;
        Z3(false, false);
        d31.b0(this).E(this.A0).j();
    }

    public final void x3(CharSequence charSequence) {
        this.c6 = charSequence;
        d4();
    }

    public final void y2(Context context, long j, View view, int i, float f, float f2) {
        TLRPC.User X1;
        wr8 wr8Var;
        if (getParentActivity() != null) {
            this.a.E0();
            if (i == this.T3) {
                TLRPC.User X12 = getMessagesController().X1(Long.valueOf(this.e1));
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && userFull.starref_program != null) {
                    long e = getUserConfig().e();
                    kt0.g(this.currentAccount).f(getParentActivity(), e, this.e1, new p4c((Object) this, (Object) context, e, (byte) 7));
                    return;
                } else {
                    if (X12 == null || !X12.bot_can_edit) {
                        return;
                    }
                    presentFragment(new cc(this.e1));
                    return;
                }
            }
            byte b = 1;
            if (i == this.R3) {
                boolean z = !getMessagesController().p2(j, this.g1, null);
                getNotificationsController().G(j, this.g1, z);
                d31.A(this, z, null).j();
                P3();
                int i2 = this.R3;
                if (i2 < 0 || (wr8Var = this.d) == null) {
                    return;
                }
                wr8Var.g(i2);
                return;
            }
            if (i == this.a4) {
                TLRPC.User X13 = getMessagesController().X1(Long.valueOf(this.e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", X13.id);
                bundle.putBoolean("addContact", true);
                bundle.putString("phone", this.i5);
                bundle.putString("first_name_card", this.j5);
                bundle.putString("last_name_card", this.k5);
                cu2 cu2Var = new cu2(bundle, this.A0);
                cu2Var.P = new wp8(this, X13);
                presentFragment(cu2Var);
                return;
            }
            if (i == this.X3) {
                TextView textView = (TextView) jj.f0(getParentActivity(), ob6.M0(2131751473, null), ob6.M0(2131751557, null), ob6.M0(2131751556, null), ob6.M0(2131751563, null), new gp8(this, b), this.A0, false).c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, null);
                    return;
                }
                return;
            }
            byte b2 = 2;
            byte b3 = 0;
            if (i == this.Y3) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.A0, getParentActivity());
                String M0 = ob6.M0(2131745938, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131745959, null);
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(-this.f5));
                sg2[] sg2VarArr = new sg2[1];
                if (M02 != null && xc2.w(2, M02)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    sg2 sg2Var = new sg2(1, this.A0, getParentActivity());
                    sg2VarArr[0] = sg2Var;
                    sg2Var.setBackgroundDrawable(aob.L0(false));
                    sg2VarArr[0].e(ob6.M0(2131753720, null), "", true, false, false);
                    sg2VarArr[0].setPadding(ob6.a0 ? hl.L(16.0f) : hl.L(8.0f), 0, ob6.a0 ? hl.L(8.0f) : hl.L(16.0f), 0);
                    linearLayout.addView(sg2VarArr[0], tre.o(-1, -2));
                    sg2VarArr[0].setOnClickListener(new je(sg2VarArr, (byte) 4));
                    alertDialog$Builder.n(linearLayout);
                }
                alertDialog$Builder.j(ob6.M0(2131745957, null), new m88((Object) this, (Object) sg2VarArr, (byte) 12));
                alertDialog$Builder.g(ob6.M0(2131752570, null), new ku7((byte) 24));
                TextView textView2 = (TextView) alertDialog$Builder.o().c(-1);
                if (textView2 != null) {
                    yob.X(textView2, aob.q7, null);
                    return;
                }
                return;
            }
            if (i == this.u4) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("chat_id", (int) (this.i1 & 4294967295L));
                presentFragment(new am5(bundle2));
                return;
            }
            if (i == this.t4) {
                showDialog(jj.S(getParentActivity(), this.E2, this.A0).a);
                return;
            }
            if (i == this.O3) {
                V2(view, f, f2, false);
                return;
            }
            if (i == this.O4) {
                getMessagesController().t5(null, this.e1);
                if (d31.a(this)) {
                    d31.d(this, false).j();
                    return;
                }
                return;
            }
            if (i == this.b4) {
                kq0.a(this, this.currentAccount, getMessagesController().X1(Long.valueOf(this.e1)));
                return;
            }
            if (i == this.d4) {
                try {
                    this.actionBar.getActionBarMenuOnItemClick().b(9);
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            }
            if (i == this.V3) {
                Y2();
                return;
            }
            if (i == this.W3) {
                nb9.G0(a(), this);
                return;
            }
            if (i >= this.x4 && i < this.y4) {
                boolean isEmpty = this.D2.isEmpty();
                TLRPC.ChatFull chatFull = this.v2;
                g(!isEmpty ? chatFull.participants.participants.get(((Integer) this.D2.get(i - this.x4)).intValue()) : chatFull.participants.participants.get(i - this.x4), false, false, view);
                return;
            }
            if (i == this.z4) {
                Z2();
                return;
            }
            if (i == this.M3) {
                g3(f, f2, i, view);
                return;
            }
            if (i == this.o4) {
                if (this.F2 != null) {
                    showDialog(new xo2(this, this.F2.linked_community_id, null, null));
                    return;
                } else {
                    if (this.e1 == 0 || (X1 = getMessagesController().X1(Long.valueOf(this.e1))) == null) {
                        return;
                    }
                    showDialog(new xo2(this, X1.linked_community_id, null, null));
                    return;
                }
            }
            if (i == this.J3) {
                if (this.v2.location instanceof TLRPC.TL_channelLocation) {
                    uc6 uc6Var = new uc6(5);
                    long j2 = this.f1;
                    TLRPC.TL_channelLocation tL_channelLocation = (TLRPC.TL_channelLocation) this.v2.location;
                    uc6Var.m0 = -j2;
                    uc6Var.H0 = tL_channelLocation;
                    presentFragment(uc6Var);
                    return;
                }
                return;
            }
            if (i == this.P4) {
                U2(false);
                return;
            }
            if (i == this.A4) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", this.f1);
                bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                bg2 bg2Var = new bg2(bundle3);
                bg2Var.B0(this.v2);
                presentFragment(bg2Var);
                return;
            }
            if (i == this.B4) {
                presentFragment(new qu0(this.f1));
                return;
            }
            if (i == this.C4) {
                Bundle bundle4 = new Bundle();
                bundle4.putLong("chat_id", this.f1);
                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                bg2 bg2Var2 = new bg2(bundle4);
                bg2Var2.B0(this.v2);
                presentFragment(bg2Var2);
                return;
            }
            if (i == this.D4) {
                this.S0.performClick();
                return;
            }
            if (i == this.E4) {
                presentFragment(new at0(0, this.e1));
                return;
            }
            if (i == this.F4) {
                presentFragment(new at0(1, this.e1));
                return;
            }
            if (i == this.G4) {
                Bundle bundle5 = new Bundle();
                bundle5.putLong("chat_id", this.f1);
                bundle5.putBoolean("start_from_monetization", true);
                presentFragment(new w1b(bundle5));
                return;
            }
            if (i == this.J4) {
                Bundle bundle6 = new Bundle();
                bundle6.putLong("chat_id", this.f1);
                bundle6.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                bg2 bg2Var3 = new bg2(bundle6);
                bg2Var3.B0(this.v2);
                presentFragment(bg2Var3);
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
                presentFragment(new q86());
                return;
            }
            if (i == this.o3) {
                presentFragment(new SessionsActivity(0));
                return;
            }
            if (i == this.r3) {
                showDialog(jj.R(this, this.A0));
                return;
            }
            if (i == this.s3) {
                m01.u(getParentActivity(), ob6.M0(2131743893, null));
                return;
            }
            if (i == this.t3) {
                m01.u(getParentActivity(), ob6.M0(2131746510, null));
                return;
            }
            if (i == this.w3) {
                m3(getParentActivity(), false);
                return;
            }
            if (i == this.x3) {
                m3(getParentActivity(), true);
                return;
            }
            if (i == this.y3) {
                cc4.a();
                return;
            }
            if (i == this.z3) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, this.A0, getParentActivity());
                    String M03 = ob6.M0(2131754113, null);
                    id idVar2 = alertDialog$Builder2.a;
                    idVar2.U = M03;
                    idVar2.S = ob6.M0(R.string.AppName, null);
                    alertDialog$Builder2.j(ob6.M0(2131747558, null), new bp8(this, b2));
                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                    showDialog(idVar2);
                    return;
                }
                return;
            }
            if (i == this.h3) {
                presentFragment(new LanguageSelectActivity());
                return;
            }
            if (i == this.W2) {
                presentFragment(new ve1(null));
                return;
            }
            if (i == this.X2) {
                presentFragment(new UserInfoActivity());
                return;
            }
            if (i == this.U2) {
                presentFragment(new v8(3));
                return;
            }
            if (i == this.P2) {
                Y2();
                return;
            }
            if (i == this.f4) {
                presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            }
            if (i == this.g4) {
                presentFragment(new nza());
                return;
            }
            if (i == this.h4) {
                presentFragment(new thb());
                return;
            }
            if (i == this.i4) {
                presentFragment(new PremiumPreviewFragment(1, "settings"));
                return;
            }
            if (i == this.j4) {
                bx4.g1(false, pj0.a(this.currentAccount).b());
                return;
            }
            if (i == this.botPermissionLocation) {
                tq0 tq0Var = this.t2;
                if (tq0Var != null) {
                    tq0Var.k(!tq0Var.f(), new hp8(this, view, b3));
                    return;
                }
                return;
            }
            if (i == this.botPermissionBiometry) {
                uo0 uo0Var = this.u2;
                if (uo0Var != null) {
                    boolean z2 = !uo0Var.e;
                    uo0Var.f = true;
                    uo0Var.e = z2;
                    uo0Var.i();
                    ((skb) view).setChecked(this.u2.e);
                    return;
                }
                return;
            }
            if (i == this.botPermissionEmojiStatus) {
                skb skbVar = (skb) view;
                skbVar.setChecked(!skbVar.d());
                if (this.r4 > 0) {
                    getConnectionsManager().cancelRequest(this.r4, true);
                }
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                toggleuseremojistatuspermission.bot = getMessagesController().o1(this.e1);
                boolean d = skbVar.d();
                toggleuseremojistatuspermission.enabled = d;
                TLRPC.UserFull userFull2 = this.w2;
                if (userFull2 != null) {
                    userFull2.bot_can_manage_emoji_status = d;
                }
                int sendRequest = getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new ol7(this, r0, (byte) 13));
                this.r4 = sendRequest;
                int[] iArr = {sendRequest};
                return;
            }
            if (i == this.P3) {
                this.R4 = !this.R4;
                j3();
                view.requestLayout();
                this.d.g(this.P3);
                int i3 = this.r6;
                if (i3 >= 0) {
                    this.c.g1(i3, this.s6 - this.a.getPaddingTop());
                    return;
                }
                return;
            }
            if (i == this.Q3) {
                d3(false);
                return;
            }
            if (i == this.R2) {
                if (this.w2 != null) {
                    Bundle bundle7 = new Bundle();
                    bundle7.putLong("chat_id", this.w2.personal_channel_id);
                    presentFragment(new zu1(bundle7));
                    return;
                }
                return;
            }
            if (i != this.V2) {
                if (i == this.I3) {
                    R1(i, view);
                    return;
                } else {
                    g3(f, f2, i, view);
                    return;
                }
            }
            ns8 ns8Var = this.G6;
            if ((ns8Var == null || !ns8Var.a()) && !S1(i, view)) {
                clb clbVar = (clb) view;
                if (clbVar.d.getDrawable() != null) {
                    X2(clbVar.getImageView());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y3(int i) {
        SharedPreferences e1 = uc7.e1();
        if (hl.O1()) {
            return;
        }
        this.K1 = i != 0;
        this.L1 = i != 0;
        h4();
        if (e1.getBoolean("view_animations", true)) {
            this.J1 = i;
        } else if (i == 2) {
            this.n1 = true;
        }
    }

    public final void z1() {
        org.telegram.ui.ActionBar.a aVar;
        if (this.O == null || (aVar = this.actionBar) == null) {
            return;
        }
        int i = aVar.getOccupyStatusBar() ? hl.m : 0;
        int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i;
        int[] iArr = eja.t2;
        int x = qu6.x(6.666f, eg0.f(currentActionBarHeight - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()), currentActionBarHeight);
        int e = eg0.e(i) + currentActionBarHeight + x;
        this.a6 = e;
        this.O.i1(x, e, eg0.e(this.P6), this.P6 + this.N6);
        this.b6 = hl.L(44.0f) + currentActionBarHeight;
        U3();
        H1();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z2(int i) {
        boolean z;
        if (i >= 0) {
            Object valueOf = Integer.valueOf(this.U2);
            fs8 fs8Var = this.e;
            if (fs8Var.x) {
                int size = fs8Var.r.size();
                fs8 fs8Var2 = this.e;
                if (i < size) {
                    valueOf = fs8Var2.r.get(i);
                } else {
                    int k = bs2.k(1, i, fs8Var2.r);
                    if (k >= 0 && k < this.e.s.size()) {
                        valueOf = this.e.s.get(k);
                    }
                }
            } else {
                if (!fs8Var.w.isEmpty()) {
                    i--;
                }
                if (i < 0 || i >= this.e.w.size()) {
                    int k2 = bs2.k(1, i, this.e.w);
                    if (k2 >= 0 && k2 < this.e.d.size()) {
                        valueOf = this.e.d.get(k2);
                        z = false;
                        if (!(valueOf instanceof es8)) {
                            es8 es8Var = (es8) valueOf;
                            wk5 parentLayout = getParentLayout();
                            es8Var.b.run();
                            hl.f3(parentLayout, es8Var.c);
                        } else if (valueOf instanceof hc7) {
                            jn7.f(this.currentAccount).k(jn7.c1, this.e.F, ((hc7) valueOf).c);
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
            if (!(valueOf instanceof es8)) {
            }
            if (z) {
            }
        }
    }

    public final void z3(TLRPC.UserFull userFull, ts8 ts8Var, ks8 ks8Var) {
        this.w2 = userFull;
        jva jvaVar = this.T;
        if (jvaVar != null) {
            jvaVar.set(userFull.stars_rating);
        }
        lq8 lq8Var = this.v0;
        if (lq8Var != null) {
            lq8Var.setStories(this.w2.stories);
        }
        gu8 gu8Var = this.w0;
        if (gu8Var != null) {
            gu8Var.a();
        }
        iq8 iq8Var = this.f0;
        if (iq8Var != null) {
            iq8Var.setHasStories(N2());
        }
        gr8 gr8Var = this.O;
        if (gr8Var != null) {
            gr8Var.setUserInfo(this.w2);
        }
        ts8 ts8Var2 = this.x2;
        if (ts8Var2 == null) {
            this.x2 = ts8Var;
        } else {
            ts8Var = ts8Var2;
        }
        if (ts8Var == null) {
            ts8Var = new ts8(this.currentAccount);
            this.x2 = ts8Var;
        }
        y56 y56Var = new y56(this, (byte) 22);
        if (ts8Var.c) {
            y56Var.run();
        } else {
            ts8Var.h.add(y56Var);
        }
        this.x2.b(this.w2);
        ks8 ks8Var2 = this.z2;
        if (ks8Var2 == null) {
            this.z2 = ks8Var;
        } else {
            ks8Var = ks8Var2;
        }
        boolean z = true;
        if (ks8Var == null) {
            ks8Var = ks8.c(this.currentAccount, this.w2, ks8Var);
            this.z2 = ks8Var;
            this.y2 = ks8Var != null;
        }
        if (ks8Var != null) {
            y56 y56Var2 = new y56(this, (byte) 18);
            if (ks8Var.b) {
                y56Var2.run();
            } else {
                ks8Var.h.add(y56Var2);
            }
        }
        sla slaVar = this.T0;
        if (slaVar != null) {
            TL_account.RequirementToContact P2 = getMessagesController().P2(this.e1);
            if (P2 != null && !(P2 instanceof TL_account.requirementToContactEmpty)) {
                z = false;
            }
            slaVar.Q(20, z);
            boolean o2 = o2();
            sla slaVar2 = this.T0;
            if (o2) {
                slaVar2.S(44);
            } else {
                slaVar2.u(44);
            }
        }
    }

    @Override // ej6
    public final void F() {
    }

    @Override // yn5
    public final void T() {
    }

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }
}
