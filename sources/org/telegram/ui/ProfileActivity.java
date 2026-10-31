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
import android.graphics.Color;
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
import android.text.style.CharacterStyle;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ProfileActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, ux, org.telegram.ui.Components.st0, org.telegram.ui.Components.a40, org.telegram.ui.Components.ms0, of0 {
    public static final RectF R6 = new RectF();
    public static final int S6 = org.telegram.messenger.i0.L(16.0f);
    public int A0;
    public boolean A1;
    public int A2;
    public int A3;
    public int A4;
    public float A5;
    public int A6;
    public org.telegram.messenger.ic B0;
    public a0.h B1;
    public ArrayList B2;
    public int B3;
    public int B4;
    public View B5;
    public Boolean B6;
    public int C0;
    public boolean C1;
    public TLRPC.EncryptedChat C2;
    public int C3;
    public int C4;
    public int C5;
    public TLRPC.TL_emojiStatusCollectible C6;
    public Drawable D;
    public int D0;
    public long D1;
    public TLRPC.Chat D2;
    public int D3;
    public int D4;
    public int D5;
    public int D6;
    public Long E;
    public int E0;
    public float E1;
    public TL_bots.BotInfo E2;
    public int E3;
    public int E4;
    public int E5;
    public boolean E6;
    public org.telegram.ui.Components.d5 F;
    public boolean F0;
    public boolean F1;
    public TLRPC.ChannelParticipant F2;
    public int F3;
    public int F4;
    public int F5;
    public int F6;
    public org.telegram.ui.Components.d5 G;
    public boolean G0;
    public boolean G1;
    public TL_account.TL_password G2;
    public int G3;
    public int G4;
    public wg.d G5;
    public int G6;
    public Drawable H;
    public boolean H0;
    public boolean H1;
    public TLRPC.FileLocation H2;
    public int H3;
    public boolean H4;
    public final aw0 H5;
    public int H6;
    public org.telegram.ui.Components.fr I;
    public boolean I0;
    public int I1;
    public TLRPC.FileLocation I2;
    public int I3;
    public boolean I4;
    public org.telegram.ui.Components.kg0 I5;
    public final hi.b I6;
    public org.telegram.ui.Components.fr J;
    public final boolean[] J0;
    public boolean J1;
    public org.telegram.messenger.ic J2;
    public int J3;
    public int J4;
    public float J5;
    public final tg.b J6;
    public org.telegram.ui.Components.kl0 K;
    public boolean K0;
    public boolean K1;
    public final Rect K2;
    public int K3;
    public int K4;
    public int K5;
    public ei.a K6;
    public UndoView L;
    public boolean L0;
    public boolean L1;
    public org.telegram.ui.Cells.p8 L2;
    public int L3;
    public int L4;
    public final fe.b L5;
    public final Paint L6;
    public yx0 M;
    public boolean M0;
    public boolean M1;
    public int M2;
    public int M3;
    public int M4;
    public rw0 M5;
    public Drawable M6;
    public ix0 N;
    public boolean N0;
    public boolean N1;
    public int N2;
    public int N3;
    public boolean N4;
    public AnimatorSet N5;
    public Drawable N6;
    public org.telegram.ui.Components.dw0 O;
    public ImageView O0;
    public boolean O1;
    public int O2;
    public int O3;
    public boolean O4;
    public AnimatorSet O5;
    public Drawable O6;
    public boolean P;
    public org.telegram.ui.ActionBar.p5 P0;
    public float P1;
    public int P2;
    public int P3;
    public int P4;
    public float P5;
    public org.telegram.ui.Components.dq P6;
    public org.telegram.ui.Components.rt0 Q;
    public org.telegram.ui.ActionBar.p5 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public final ArrayList Q4;
    public boolean Q5;
    public final int[] Q6;
    public boolean R;
    public org.telegram.ui.ActionBar.p5 R0;
    public float R1;
    public int R2;
    public int R3;
    public final ArrayList R4;
    public final pw0 R5;
    public org.telegram.ui.Components.nv0 S;
    public org.telegram.ui.ActionBar.p5 S0;
    public int S1;
    public int S2;
    public int S3;
    public int S4;
    public View S5;
    public do0 T;
    public org.telegram.ui.ActionBar.p5 T0;
    public float T1;
    public int T2;
    public int T3;
    public boolean T4;
    public int T5;
    public org.telegram.ui.Components.bi0 U;
    public org.telegram.ui.ActionBar.b1 U0;
    public ValueAnimator U1;
    public int U2;
    public int U3;
    public boolean U4;
    public int U5;
    public org.telegram.ui.Components.bi0 V;
    public org.telegram.ui.ActionBar.b1 V0;
    public boolean V1;
    public int V2;
    public int V3;
    public ow0 V4;
    public CharSequence V5;
    public org.telegram.ui.Components.q30 W;
    public org.telegram.ui.ActionBar.b1 W0;
    public org.telegram.messenger.o6 W1;
    public int W2;
    public int W3;
    public View W4;
    public boolean W5;
    public l0 X;
    public ImageView X0;
    public final HashMap X1;
    public int X2;
    public int X3;
    public int X4;
    public final nw0 X5;
    public fg.i Y;
    public org.telegram.ui.ActionBar.b1 Y0;
    public float Y1;
    public int Y2;
    public int Y3;
    public int Y4;
    public float[] Y5;
    public org.telegram.ui.Components.hg0 Z;
    public m4.n0 Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public int Z4;
    public float Z5;
    public bw0 a;
    public org.telegram.messenger.pp a0;
    public float a1;
    public float a2;
    public int a3;
    public int a4;
    public long a5;
    public float a6;
    public org.telegram.ui.Components.tk0 b;
    public org.telegram.ui.Components.bh0 b0;
    public int b1;
    public float b2;
    public int b3;
    public int b4;
    public boolean b5;
    public boolean b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public dw0 c;
    public org.telegram.ui.Components.ig0 c0;
    public ky0 c1;
    public float c2;
    public int c3;
    public int c4;
    public boolean c5;
    public sx0 c6;
    public xx0 d;
    public org.telegram.ui.Cells.n d0;
    public long d1;
    public float d2;
    public int d3;
    public int d4;
    public String d5;
    public float d6;
    public hy0 e;
    public jw0 e0;
    public long e1;
    public float e2;
    public int e3;
    public int e4;
    public String e5;
    public float e6;
    public kl f;
    public AnimatorSet f0;
    public long f1;
    public float f2;
    public int f3;
    public int f4;
    public String f5;
    public org.telegram.messenger.kp f6;
    public org.telegram.ui.Cells.d4 g0;
    public boolean g1;
    public float g2;
    public int g3;
    public int g4;
    public org.telegram.ui.Components.gg g5;
    public final SparseIntArray g6;
    public String h;
    public ImageView h0;
    public long h1;
    public float h2;
    public int h3;
    public int h4;
    public final HashSet h5;
    public int h6;
    public ImageView i0;
    public boolean i1;
    public ValueAnimator i2;
    public int i3;
    public int i4;
    public CharacterStyle i5;
    public AnimatorSet i6;
    public ImageView j0;
    public boolean j1;
    public float j2;
    public int j3;
    public int j4;
    public final pw0 j5;
    public int j6;
    public ImageView k0;
    public boolean k1;
    public float k2;
    public int k3;
    public int k4;
    public final vw0 k5;
    public int k6;
    public org.telegram.ui.Components.f11 l0;
    public long l1;
    public final float[] l2;
    public int l3;
    public int l4;
    public boolean l5;
    public boolean l6;
    public org.telegram.ui.Components.mg0 m0;
    public boolean m1;
    public boolean m2;
    public int m3;
    public int m4;
    public gx0 m5;
    public boolean m6;
    public String n;
    public kw0 n0;
    public boolean n1;
    public boolean n2;
    public int n3;
    public int n4;
    public float n5;
    public org.telegram.ui.Components.ei0 n6;
    public ay0 o0;
    public boolean o1;
    public boolean o2;
    public int o3;
    public int o4;
    public float o5;
    public final int[] o6;
    public org.telegram.ui.Components.r8 p0;
    public boolean p1;
    public final Paint p2;
    public int p3;
    public int p4;
    public boolean p5;
    public float p6;
    public org.telegram.ui.Components.b40 q0;
    public boolean q1;
    public boolean q2;
    public int q3;
    public int q4;
    public boolean q5;
    public CharSequence q6;
    public lw0 r;
    public int r0;
    public boolean r1;
    public xh.o0 r2;
    public int r3;
    public int r4;
    public ImageReceiver r5;
    public CharSequence r6;
    public org.telegram.ui.Components.ei0 s;
    public org.telegram.ui.Components.f11 s0;
    public boolean s1;
    public xh.n s2;
    public int s3;
    public int s4;
    public FrameLayout s5;
    public boolean s6;
    public org.telegram.ui.Components.yg0 t0;
    public int t1;
    public TLRPC.ChatFull t2;
    public int t3;
    public int t4;
    public FrameLayout[] t5;
    public float t6;
    public mw0 u0;
    public boolean u1;
    public TLRPC.UserFull u2;
    public int u3;
    public int u4;
    public SpannableStringBuilder u5;
    public float u6;
    public rh.g0 v0;
    public boolean v1;
    public org.telegram.ui.Cells.i6 v2;
    public int v3;
    public int v4;
    public SpannableStringBuilder v5;
    public float v6;
    public AnimatorSet w;
    public View w0;
    public boolean w1;
    public boolean w2;
    public int w3;
    public int w4;
    public vh.d[] w5;
    public float w6;
    public Drawable x;
    public final org.telegram.ui.Components.l40 x0;
    public int x1;
    public ly0 x2;
    public int x3;
    public int x4;
    public org.telegram.messenger.video.o x5;
    public iy0 x6;
    public Drawable y;
    public final Paint y0;
    public boolean y1;
    public CharSequence y2;
    public int y3;
    public int y4;
    public FrameLayout y5;
    public oy0 y6;
    public org.telegram.ui.ActionBar.p6 z0;
    public boolean z1;
    public long z2;
    public int z3;
    public int z4;
    public vh.d z5;
    public vh.p2 z6;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static void F3(ProfileActivity profileActivity, boolean z10) {
        Drawable t10 = profileActivity.e0.getImageReceiver().t();
        String str = null;
        if (t10 instanceof org.telegram.ui.Components.g61) {
            profileActivity.e0.w(null, null, t10);
            return;
        }
        if (t10 instanceof org.telegram.ui.Components.s5) {
            org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) t10;
            profileActivity.e0.w(null, null, s5Var);
            if (z10) {
                s5Var.f(profileActivity.e0);
                return;
            }
            return;
        }
        org.telegram.messenger.ic D = profileActivity.n0.D(0);
        if (D != null && D.p == 2) {
            str = "avatar";
        }
        profileActivity.e0.w(D, str, t10);
    }

    public static int I0(ProfileActivity profileActivity) {
        org.telegram.ui.ActionBar.l lVar = profileActivity.actionBar;
        return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + ((lVar == null || !lVar.getOccupyStatusBar()) ? 0 : org.telegram.messenger.i0.m);
    }

    public static void M3(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view == null || view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return;
        }
        RectF rectF2 = R6;
        if (zg.h.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
            yg.d.b(new sa(view, 3), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
        }
    }

    public static void N0(ProfileActivity profileActivity, int i10) {
        boolean F0 = org.telegram.ui.Components.zt0.F0(profileActivity.N.getClosestTab());
        if (i10 == profileActivity.D6 && F0 == profileActivity.E6) {
            return;
        }
        profileActivity.D6 = i10;
        profileActivity.E6 = F0;
        if (F0) {
            if (i10 > 0) {
                profileActivity.w5[0].i(org.telegram.messenger.cd.G(i10, "HideStoriesFromAlbum", new Object[0]), true, true);
                return;
            } else {
                profileActivity.w5[0].i(profileActivity.v5, true, true);
                return;
            }
        }
        if (i10 > 0 || !org.telegram.messenger.vp.r1(profileActivity.currentAccount).T4()) {
            profileActivity.w5[0].i(org.telegram.messenger.cd.G(i10, "ArchiveStories", new Object[0]), true, true);
        } else {
            profileActivity.w5[0].i(profileActivity.u5, true, true);
        }
    }

    public static ValueAnimator O0(final ProfileActivity profileActivity, final boolean z10) {
        if (z10) {
            org.telegram.messenger.i0.Z2(profileActivity.getParentActivity(), profileActivity.classGuid);
            org.telegram.messenger.i0.k3(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.U1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.U1.cancel();
        }
        rh.g0 g0Var = profileActivity.v0;
        if (g0Var != null) {
            g0Var.setActive(!z10);
        }
        int i10 = 0;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(profileActivity.T1, z10 ? 0.0f : 1.0f);
        final float f7 = profileActivity.P1;
        profileActivity.b.setTranslationY(f7);
        profileActivity.b.setVisibility(0);
        profileActivity.T0.setVisibility(0);
        profileActivity.a.setVisibility(0);
        profileActivity.x4(true);
        profileActivity.X.setVisibility(0);
        profileActivity.f.setVisibility(0);
        profileActivity.r.setVisibility(0);
        profileActivity.actionBar.y(profileActivity.T1 > 0.5f);
        int i11 = profileActivity.T1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.p5 p5Var = profileActivity.S0;
        if (p5Var != null) {
            p5Var.setVisibility(i11);
        }
        profileActivity.T0.setVisibility(i11);
        profileActivity.T0.getSearchContainer().setVisibility(profileActivity.T1 <= 0.5f ? 0 : 8);
        profileActivity.b.setEmptyView(profileActivity.O);
        profileActivity.X.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.zv0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.q0(ProfileActivity.this, ofFloat, f7, z10);
            }
        });
        ofFloat.addListener(new xw0(profileActivity, z10, i10));
        if (!z10) {
            profileActivity.U4 = true;
            profileActivity.S4();
            org.telegram.messenger.i0.Y2(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.O.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.f);
        profileActivity.U1 = ofFloat;
        return ofFloat;
    }

    public static void U4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, activity, null);
        x1Var.i0 = false;
        x1Var.show();
        Utilities.e.c(new bk0(x1Var, z10, activity, 6));
    }

    public static SpannableStringBuilder V3(String str, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        ax0 ax0Var = new ax0(9);
        ax0Var.w = str;
        if (ax0Var.c != null) {
            ax0Var.c = null;
            ax0Var.a();
        }
        ax0Var.f = w02;
        ax0Var.n = false;
        spannableStringBuilder.setSpan(ax0Var, 0, spannableStringBuilder.length(), 0);
        g00[] g00VarArr = (g00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), g00.class);
        if (g00VarArr != null) {
            for (g00 g00Var : g00VarArr) {
                g00Var.getClass();
                g00Var.f = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
                g00Var.r = i10;
                g00Var.s = p6Var;
                g00Var.n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static void X4(FrameLayout frameLayout, float f7) {
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(S6 * f7);
        frameLayout.setAlpha(1.0f - f7);
        frameLayout.setVisibility(f7 < 1.0f ? 0 : 4);
    }

    public static void Y(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.iz0.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.z0);
    }

    public static void Z(ProfileActivity profileActivity) {
        TLRPC.Document e;
        org.telegram.ui.Components.wb h;
        if (profileActivity.I2 != null) {
            return;
        }
        if (!profileActivity.p1 || profileActivity.getMessagesController().A3()) {
            if (profileActivity.Z3()) {
                return;
            }
            profileActivity.J4(false);
            return;
        }
        ArrayList l4 = profileActivity.getMessagesController().r7.l(profileActivity.e1);
        if (l4 != null) {
            TLRPC.TL_forumTopic tL_forumTopic = null;
            for (int i10 = 0; tL_forumTopic == null && i10 < l4.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l4.get(i10);
                if (tL_forumTopic2 != null && tL_forumTopic2.id == profileActivity.f1) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
            if (tL_forumTopic != null) {
                long j10 = tL_forumTopic.icon_emoji_id;
                if (j10 == 0 || (e = org.telegram.ui.Components.f5.e(profileActivity.currentAccount, j10)) == null || (h = org.telegram.ui.Components.cc.a0(profileActivity).h(e, 1, new ov0(profileActivity, 2))) == null) {
                    return;
                }
                h.j();
            }
        }
    }

    public static void Z0(ProfileActivity profileActivity, String str, StringBuilder sb2) {
        String[] supportedTypes;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i11].equals(str)) {
                            (codecInfoAt.isEncoder() ? arrayList2 : arrayList).add(Integer.valueOf(i10));
                        } else {
                            i11++;
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            sb2.append("\n");
            sb2.append(arrayList.size());
            sb2.append("+");
            sb2.append(arrayList2.size());
            sb2.append(" ");
            sb2.append(str.substring(6));
            sb2.append(" codecs:\n");
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (i12 > 0) {
                    sb2.append("\n");
                }
                MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList.get(i12)).intValue());
                sb2.append("{d} ");
                sb2.append(codecInfoAt2.getName());
                sb2.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt2.isHardwareAccelerated()) {
                        sb2.append("gpu");
                    }
                    if (codecInfoAt2.isSoftwareOnly()) {
                        sb2.append("cpu");
                    }
                    if (codecInfoAt2.isVendor()) {
                        sb2.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt2.getCapabilitiesForType(str);
                sb2.append("; mi=");
                sb2.append(capabilitiesForType.getMaxSupportedInstances());
                sb2.append(")");
            }
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (i13 > 0 || !arrayList.isEmpty()) {
                    sb2.append("\n");
                }
                MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i13)).intValue());
                sb2.append("{e} ");
                sb2.append(codecInfoAt3.getName());
                sb2.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt3.isHardwareAccelerated()) {
                        sb2.append("gpu");
                    }
                    if (codecInfoAt3.isSoftwareOnly()) {
                        sb2.append("cpu");
                    }
                    if (codecInfoAt3.isVendor()) {
                        sb2.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType2 = codecInfoAt3.getCapabilitiesForType(str);
                sb2.append("; mi=");
                sb2.append(capabilitiesForType2.getMaxSupportedInstances());
                sb2.append(")");
            }
            sb2.append("\n");
        } catch (Exception unused) {
        }
    }

    public static void a0(ProfileActivity profileActivity, TLRPC.User user) {
        if (profileActivity.Y3 >= 0) {
            if (profileActivity.J4 == -1) {
                profileActivity.I5();
                profileActivity.d.f();
            } else {
                profileActivity.C5(false, false);
            }
        }
        if (profileActivity.J4 == -1) {
            if (profileActivity.m2 || org.telegram.messenger.i0.Q1()) {
                profileActivity.a.setPadding(0, profileActivity.i4(), 0, 0);
                profileActivity.i2.cancel();
                float[] fArr = profileActivity.l2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.W4(1.0f);
                profileActivity.P1 = profileActivity.i4();
            } else {
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (profileActivity.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredWidth(), TLObject.FLAG_30);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    xx0 xx0Var = profileActivity.d;
                    if (i10 >= xx0Var.e.M2) {
                        break;
                    }
                    s4.c1 a2 = xx0Var.a(null, xx0Var.d(i10));
                    View view = a2.a;
                    profileActivity.d.t(a2, i10);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i11 += view.getMeasuredHeight();
                    i10++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.i4() + i11) + currentActionBarHeight));
                bw0 bw0Var = profileActivity.a;
                bw0Var.setPadding(0, bw0Var.getPaddingTop(), 0, max);
            }
        }
        profileActivity.L.m(profileActivity.h1, user, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b0(ProfileActivity profileActivity, int i10) {
        boolean z10;
        if (i10 < 0) {
            return;
        }
        Object valueOf = Integer.valueOf(profileActivity.S2);
        hy0 hy0Var = profileActivity.e;
        if (!hy0Var.x) {
            if (!hy0Var.w.isEmpty()) {
                i10--;
            }
            if (i10 < 0 || i10 >= profileActivity.e.w.size()) {
                int e = sc.e.e(1, i10, profileActivity.e.w);
                if (e >= 0 && e < profileActivity.e.d.size()) {
                    valueOf = profileActivity.e.d.get(e);
                    z10 = false;
                    if (!(valueOf instanceof gy0)) {
                        gy0 gy0Var = (gy0) valueOf;
                        org.telegram.ui.ActionBar.z4 parentLayout = profileActivity.getParentLayout();
                        gy0Var.b.run();
                        org.telegram.messenger.i0.j3(parentLayout, gy0Var.c);
                    } else if (valueOf instanceof org.telegram.messenger.hp) {
                        org.telegram.messenger.zs.f(profileActivity.currentAccount).k(org.telegram.messenger.zs.c1, profileActivity.e.E, ((org.telegram.messenger.hp) valueOf).c);
                    }
                    if (z10 || valueOf == null) {
                    }
                    profileActivity.e.E(valueOf);
                    return;
                }
            } else {
                valueOf = profileActivity.e.w.get(i10);
            }
        } else if (i10 < hy0Var.r.size()) {
            valueOf = profileActivity.e.r.get(i10);
        } else {
            int e7 = sc.e.e(1, i10, profileActivity.e.r);
            if (e7 >= 0 && e7 < profileActivity.e.s.size()) {
                valueOf = profileActivity.e.s.get(e7);
            }
        }
        z10 = true;
        if (!(valueOf instanceof gy0)) {
        }
        if (z10) {
        }
    }

    public static void b5(int i10, View view) {
        if (view == null || view.getLayoutParams() == null || view.getLayoutParams().height == i10) {
            return;
        }
        view.getLayoutParams().height = i10;
        if (view.isLaidOut()) {
            view.setBottom(view.getTop() + i10);
        } else {
            view.requestLayout();
        }
    }

    public static void c0(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.u5 u5Var) {
        org.telegram.messenger.ic b10;
        String str;
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            gf.f.r(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().U2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        kg.v1 v1Var = new kg.v1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.z0);
        u5Var.getLocationOnScreen(new int[2]);
        v1Var.n2 = u5Var.h0;
        v1Var.o2 = u5Var.i0;
        v1Var.r2 = u5Var.getScaleX();
        v1Var.p2 = u5Var.getLeft();
        v1Var.q2 = u5Var.getTop();
        v1Var.s2 = u5Var;
        Drawable rightDrawable = u5Var.getRightDrawable();
        org.telegram.ui.Components.d5 d5Var = profileActivity.F;
        if (rightDrawable == d5Var && d5Var != null) {
            Drawable drawable = d5Var.f[0];
            if (drawable instanceof org.telegram.ui.Components.f5) {
                v1Var.r2 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.f5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(profileActivity.getParentActivity());
                    org.telegram.messenger.c00 d = org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.m6, 0.2f, false);
                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.ic.b(document);
                        if (d != null) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.jj.K2(document, false)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        b10 = org.telegram.messenger.ic.b(document);
                        str = "160_160";
                    }
                    String str2 = str;
                    org.telegram.messenger.ic icVar = b10;
                    g9Var.setLayerNum(7);
                    g9Var.setRoundRadius(org.telegram.messenger.i0.L(4.0f));
                    g9Var.m(icVar, str2, org.telegram.messenger.ic.c(w9, document), "140_140", d, document);
                    if (((org.telegram.ui.Components.f5) profileActivity.F.f[0]).c()) {
                        g9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v6, profileActivity.z0), PorterDuff.Mode.SRC_IN));
                        v1Var.u2 = org.telegram.messenger.jj.j1(document);
                    } else {
                        v1Var.u2 = org.telegram.messenger.jj.j1(document);
                    }
                    v1Var.t2 = g9Var;
                    v1Var.w2 = true;
                }
            }
        }
        profileActivity.showDialog(v1Var);
    }

    public static void c1(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.b2, 0.25f) / 0.25f;
        if (profileActivity.p1) {
            profileActivity.t0.setAlpha(1.0f - min);
            profileActivity.t0.setBlurIntensity(0.0f);
            profileActivity.t0.setGooeyEnabled(false);
            profileActivity.t0.setVisibility(profileActivity.b2 >= 1.0f ? 8 : 0);
        } else {
            profileActivity.t0.setHideProgress(profileActivity.b2);
        }
        mw0 mw0Var = profileActivity.u0;
        if (mw0Var != null && profileActivity.I1 != 2) {
            float f7 = profileActivity.b2;
            mw0Var.setAlpha(f7 > 0.0f ? org.telegram.messenger.i0.T1(1.0f, 0.0f, org.telegram.messenger.i0.z1(f7, 0.0f, 0.5f)) : 1.0f);
        }
        profileActivity.w5();
    }

    public static void c5(org.telegram.ui.ActionBar.p5 p5Var, boolean z10, boolean z11) {
        if (c3.i0.t(p5Var)) {
            p5Var.Y(z10, z11);
        } else if (p5Var != null) {
            p5Var.setVisibility(z10 ? 0 : 8);
        }
    }

    public static void d0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        if (tL_error == null) {
            TLRPC.User Z1 = profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.getUserConfig().e()));
            if (Z1 == null) {
                Z1 = profileActivity.getUserConfig().f();
                if (Z1 == null) {
                    return;
                } else {
                    profileActivity.getMessagesController().U3(Z1, false, false);
                }
            } else {
                profileActivity.getUserConfig().w(Z1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(arrayList, org.telegram.messenger.zs.g2, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(arrayList, 800, false, null, false);
            TLRPC.VideoSize x10 = tL_photos_photo.photo.video_sizes.isEmpty() ? null : org.telegram.messenger.b8.x(1000, tL_photos_photo.photo.video_sizes);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            Z1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w9 != null) {
                tL_userProfilePhoto.photo_small = w9.location;
            }
            if (w10 != null) {
                tL_userProfilePhoto.photo_big = w10.location;
            }
            if (w9 != null && profileActivity.H2 != null) {
                org.telegram.messenger.b8.G(profileActivity.currentAccount);
                File K = org.telegram.messenger.b8.K(w9, null, true, true);
                org.telegram.messenger.b8.G(profileActivity.currentAccount);
                org.telegram.messenger.b8.K(profileActivity.H2, null, true, true).renameTo(K);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(profileActivity.H2.volume_id);
                sb2.append("_");
                String p5 = a1.g.p(sb2, profileActivity.H2.local_id, "@50_50");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w9.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.hc.D().S(p5, a1.g.p(sb3, w9.location.local_id, "@50_50"), org.telegram.messenger.ic.m(profileActivity.currentAccount, 1, Z1));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.b8.G(profileActivity.currentAccount);
                new File(str).renameTo(org.telegram.messenger.b8.K(x10, "mp4", true, true));
            } else if (w10 != null && profileActivity.I2 != null) {
                org.telegram.messenger.b8.G(profileActivity.currentAccount);
                File K2 = org.telegram.messenger.b8.K(w10, null, true, true);
                org.telegram.messenger.b8.G(profileActivity.currentAccount);
                org.telegram.messenger.b8.K(profileActivity.I2, null, true, true).renameTo(K2);
            }
            profileActivity.getMessagesController().T0(Z1.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Z1);
            profileActivity.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull a2 = profileActivity.getMessagesController().a2(profileActivity.d1);
            if (a2 != null) {
                a2.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().j2(a2, false);
            }
        }
        profileActivity.n2 = (org.telegram.messenger.i0.Q1() || profileActivity.m2 || !profileActivity.e0.getImageReceiver().L() || org.telegram.messenger.i0.C1()) ? false : true;
        profileActivity.H2 = null;
        profileActivity.I2 = null;
        kw0 kw0Var = profileActivity.n0;
        kw0Var.H0 = true;
        kw0Var.K0 = profileActivity.J2;
        kw0Var.q1 = null;
        kw0Var.r1 = null;
        kw0Var.setCreateThumbFromParent(false);
        profileActivity.H5(true);
        profileActivity.i5(false, true);
        profileActivity.getNotificationCenter().k(org.telegram.messenger.zs.r, Integer.valueOf(org.telegram.messenger.vp.D8));
        profileActivity.getNotificationCenter().k(org.telegram.messenger.zs.j0, new Object[0]);
        profileActivity.getUserConfig().v(true);
    }

    public static boolean e0(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_error tL_error) {
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.vp.r1(profileActivity.currentAccount).e7.edit().putLong("dialog_join_requested_time_" + profileActivity.h1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        boolean z11 = org.telegram.messenger.w3.T(profileActivity.D2) && !profileActivity.D2.megagroup;
        int i10 = org.telegram.ui.Components.u70.q1;
        org.telegram.ui.Components.u70.J0(parentActivity, profileActivity, org.telegram.ui.Components.cc.a0(profileActivity), z11);
        if (!z10 || profileActivity.L4 != -1) {
            profileActivity.I5();
            xx0 xx0Var = profileActivity.d;
            if (xx0Var != null) {
                xx0Var.f();
            }
        }
        if (k2Var instanceof un) {
            ((un) k2Var).Ob(false, true);
        }
        return false;
    }

    public static /* synthetic */ void f0(ProfileActivity profileActivity) {
        org.telegram.messenger.vp.r1(profileActivity.currentAccount).l0(null);
        profileActivity.U.M(0);
        profileActivity.V.M(0);
    }

    public static void g0(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.wb Q = org.telegram.ui.Components.cc.a0(profileActivity).Q(R.raw.contact_check, 36, org.telegram.messenger.cd.L0(2131746871, null));
            Q.j = 5000;
            Q.j();
            return;
        }
        if (tL_birthday == null) {
            userFull.flags2 &= -33;
        } else {
            userFull.flags2 |= 32;
        }
        userFull.birthday = tL_birthday;
        profileActivity.getMessagesStorage().j2(userFull, false);
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.m5.n(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity), R.raw.error, 36);
            return;
        }
        if (profileActivity.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.resourceProvider);
            String L0 = org.telegram.messenger.cd.L0(2131746867, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131746868, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
            profileActivity.showDialog(x1Var);
        }
    }

    public static /* synthetic */ void h0(ProfileActivity profileActivity, Context context, long j10, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            xh.z2.I0(context, profileActivity.currentAccount, profileActivity.u2.starref_program, profileActivity.getUserConfig().e(), profileActivity.z0, false);
        } else {
            xh.z2.J0(context, profileActivity.currentAccount, connectedbotstarref, j10, profileActivity.z0);
        }
    }

    public static /* synthetic */ void i0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.H2 = fileLocation;
            profileActivity.I2 = photoSize2.location;
            profileActivity.e0.j(org.telegram.messenger.ic.e(fileLocation), "50_50", profileActivity.p0, null);
            if (profileActivity.N2 != -1) {
                profileActivity.I5();
                xx0 xx0Var = profileActivity.d;
                if (xx0Var != null) {
                    xx0Var.f();
                }
                profileActivity.x4(true);
            }
            kw0 kw0Var = profileActivity.n0;
            org.telegram.messenger.ic e = org.telegram.messenger.ic.e(profileActivity.I2);
            profileActivity.J2 = e;
            kw0Var.A(e, org.telegram.messenger.ic.e(profileActivity.H2));
            profileActivity.i5(true, false);
        } else {
            if (profileActivity.H2 == null) {
                return;
            }
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i10 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i10 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            profileActivity.h6 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ul0(6, profileActivity, str));
        }
        profileActivity.actionBar.p().requestLayout();
    }

    public static void j0(ProfileActivity profileActivity, Context context, long j10, View view, int i10, float f7, float f10) {
        TLRPC.User Z1;
        xx0 xx0Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.a.C0();
        if (i10 == profileActivity.R3) {
            TLRPC.User Z12 = profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.d1));
            TLRPC.UserFull userFull = profileActivity.u2;
            if (userFull != null && userFull.starref_program != null) {
                long e = profileActivity.getUserConfig().e();
                rh.r.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), e, profileActivity.d1, new au(profileActivity, context, e, 2));
                return;
            } else {
                if (Z12 == null || !Z12.bot_can_edit) {
                    return;
                }
                profileActivity.presentFragment(new xh.i(profileActivity.d1));
                return;
            }
        }
        int i11 = 1;
        if (i10 == profileActivity.P3) {
            boolean z10 = !profileActivity.getMessagesController().q2(j10, profileActivity.f1, null);
            profileActivity.getNotificationsController().G(j10, profileActivity.f1, z10);
            org.telegram.ui.Components.cc.A(profileActivity, z10, null).j();
            profileActivity.u5();
            int i12 = profileActivity.P3;
            if (i12 < 0 || (xx0Var = profileActivity.d) == null) {
                return;
            }
            xx0Var.g(i12);
            return;
        }
        if (i10 == profileActivity.Y3) {
            TLRPC.User Z13 = profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.d1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", Z13.id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.d5);
            bundle.putString("first_name_card", profileActivity.e5);
            bundle.putString("last_name_card", profileActivity.f5);
            ns nsVar = new ns(bundle, profileActivity.z0);
            nsVar.O = new gv0(profileActivity, Z13);
            profileActivity.presentFragment(nsVar);
            return;
        }
        if (i10 == profileActivity.V3) {
            TextView textView = (TextView) org.telegram.ui.Components.s4.h0(profileActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131751509, null), org.telegram.messenger.cd.L0(2131751593, null), org.telegram.messenger.cd.L0(2131751592, null), org.telegram.messenger.cd.L0(2131751599, null), new ov0(profileActivity, i11), profileActivity.z0, false).d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                return;
            }
            return;
        }
        int i13 = 9;
        int i14 = 2;
        if (i10 == profileActivity.W3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
            String L0 = org.telegram.messenger.cd.L0(2131746228, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131746249, null);
            TLRPC.Chat L02 = profileActivity.getMessagesController().L0(Long.valueOf(-profileActivity.a5));
            org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
            if (L02 != null && org.telegram.messenger.w3.w(2, L02)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, profileActivity.getParentActivity(), profileActivity.z0);
                c2VarArr[0] = c2Var;
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                c2VarArr[0].e(org.telegram.messenger.cd.L0(2131753727, null), "", true, false, false);
                c2VarArr[0].setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
                linearLayout.addView(c2VarArr[0], w7.b6.o(-1, -2));
                c2VarArr[0].setOnClickListener(new u10(c2VarArr, i14));
                alertDialog$Builder.o(linearLayout);
            }
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746247, null), new ep0(i13, profileActivity, c2VarArr));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.Components.z11(23));
            TextView textView2 = (TextView) alertDialog$Builder.p().d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.q7, null);
                return;
            }
            return;
        }
        if (i10 == profileActivity.q4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", (int) (profileActivity.h1 & 4294967295L));
            profileActivity.presentFragment(new n60(bundle2));
            return;
        }
        if (i10 == profileActivity.p4) {
            profileActivity.showDialog(org.telegram.ui.Components.s4.U(profileActivity.getParentActivity(), profileActivity.C2, profileActivity.z0).a);
            return;
        }
        if (i10 == profileActivity.M3) {
            profileActivity.E4(view, f7, f10, false);
            return;
        }
        if (i10 == profileActivity.K4) {
            profileActivity.getMessagesController().c5(null, profileActivity.d1);
            if (org.telegram.ui.Components.cc.a(profileActivity)) {
                org.telegram.ui.Components.cc.d(profileActivity, false).j();
                return;
            }
            return;
        }
        if (i10 == profileActivity.Z3) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
                return;
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
                return;
            }
        }
        if (i10 == profileActivity.T3) {
            profileActivity.H4();
            return;
        }
        if (i10 == profileActivity.U3) {
            c01.K0(profileActivity.a(), profileActivity);
            return;
        }
        if (i10 >= profileActivity.t4 && i10 < profileActivity.u4) {
            profileActivity.h(!profileActivity.B2.isEmpty() ? profileActivity.t2.participants.participants.get(((Integer) profileActivity.B2.get(i10 - profileActivity.t4)).intValue()) : profileActivity.t2.participants.participants.get(i10 - profileActivity.t4), false, false, view);
            return;
        }
        if (i10 == profileActivity.v4) {
            profileActivity.I4();
            return;
        }
        if (i10 == profileActivity.K3) {
            profileActivity.P4(f7, f10, i10, view);
            return;
        }
        if (i10 == profileActivity.k4) {
            if (profileActivity.D2 != null) {
                profileActivity.showDialog(new yh.a0(profileActivity, profileActivity.D2.linked_community_id, null, null));
                return;
            } else {
                if (profileActivity.d1 == 0 || (Z1 = profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.d1))) == null) {
                    return;
                }
                profileActivity.showDialog(new yh.a0(profileActivity, Z1.linked_community_id, null, null));
                return;
            }
        }
        int i15 = 5;
        if (i10 == profileActivity.H3) {
            if (profileActivity.t2.location instanceof TLRPC.TL_channelLocation) {
                yb0 yb0Var = new yb0(5);
                long j11 = profileActivity.e1;
                TLRPC.TL_channelLocation tL_channelLocation = (TLRPC.TL_channelLocation) profileActivity.t2.location;
                yb0Var.n0 = -j11;
                yb0Var.H0 = tL_channelLocation;
                profileActivity.presentFragment(yb0Var);
                return;
            }
            return;
        }
        if (i10 == profileActivity.L4) {
            profileActivity.D4(false);
            return;
        }
        if (i10 == profileActivity.w4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.e1);
            bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            pr prVar = new pr(bundle3);
            prVar.B0(profileActivity.t2);
            profileActivity.presentFragment(prVar);
            return;
        }
        if (i10 == profileActivity.x4) {
            profileActivity.presentFragment(new kg.q1(profileActivity.e1));
            return;
        }
        if (i10 == profileActivity.y4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.e1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            pr prVar2 = new pr(bundle4);
            prVar2.B0(profileActivity.t2);
            profileActivity.presentFragment(prVar2);
            return;
        }
        if (i10 == profileActivity.z4) {
            profileActivity.R0.performClick();
            return;
        }
        if (i10 == profileActivity.A4) {
            profileActivity.presentFragment(new rh.i(0, profileActivity.d1));
            return;
        }
        if (i10 == profileActivity.B4) {
            profileActivity.presentFragment(new rh.i(1, profileActivity.d1));
            return;
        }
        if (i10 == profileActivity.C4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.e1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new u61(bundle5));
            return;
        }
        if (i10 == profileActivity.F4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.e1);
            bundle6.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            pr prVar3 = new pr(bundle6);
            prVar3.B0(profileActivity.t2);
            profileActivity.presentFragment(prVar3);
            return;
        }
        if (i10 == profileActivity.e3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
            return;
        }
        if (i10 == profileActivity.g3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.G2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.C0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
            return;
        }
        if (i10 == profileActivity.h3) {
            profileActivity.presentFragment(new DataSettingsActivity());
            return;
        }
        if (i10 == profileActivity.i3) {
            profileActivity.presentFragment(new ThemeActivity(0));
            return;
        }
        if (i10 == profileActivity.j3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
            return;
        }
        if (i10 == profileActivity.l3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
            return;
        }
        if (i10 == profileActivity.k3) {
            profileActivity.presentFragment(new bb0());
            return;
        }
        if (i10 == profileActivity.m3) {
            profileActivity.presentFragment(new SessionsActivity(0));
            return;
        }
        if (i10 == profileActivity.p3) {
            profileActivity.showDialog(org.telegram.ui.Components.s4.T(profileActivity, profileActivity.z0));
            return;
        }
        if (i10 == profileActivity.q3) {
            gf.f.r(profileActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
            return;
        }
        if (i10 == profileActivity.r3) {
            gf.f.r(profileActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
            return;
        }
        if (i10 == profileActivity.u3) {
            U4(profileActivity.getParentActivity(), false);
            return;
        }
        if (i10 == profileActivity.v3) {
            U4(profileActivity.getParentActivity(), true);
            return;
        }
        if (i10 == profileActivity.w3) {
            org.telegram.messenger.f8.a();
            return;
        }
        if (i10 == profileActivity.x3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
            String L03 = org.telegram.messenger.cd.L0(2131754120, null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
            x1Var2.T = L03;
            x1Var2.R = org.telegram.messenger.cd.L0(R.string.AppName, null);
            alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747847, null), new bv0(profileActivity, i13));
            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            profileActivity.showDialog(x1Var2);
            return;
        }
        if (i10 == profileActivity.f3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
            return;
        }
        if (i10 == profileActivity.U2) {
            profileActivity.presentFragment(new oa(null));
            return;
        }
        if (i10 == profileActivity.V2) {
            profileActivity.presentFragment(new UserInfoActivity());
            return;
        }
        if (i10 == profileActivity.S2) {
            profileActivity.presentFragment(new f(3));
            return;
        }
        if (i10 == profileActivity.N2) {
            profileActivity.H4();
            return;
        }
        if (i10 == profileActivity.b4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
            return;
        }
        if (i10 == profileActivity.c4) {
            profileActivity.presentFragment(new rh.h8());
            return;
        }
        if (i10 == profileActivity.d4) {
            profileActivity.presentFragment(new wh.g());
            return;
        }
        if (i10 == profileActivity.e4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
            return;
        }
        if (i10 == profileActivity.f4) {
            mg.i2.l1(0, org.telegram.messenger.y1.a(profileActivity.currentAccount).b());
            return;
        }
        if (i10 == profileActivity.botPermissionLocation) {
            xh.o0 o0Var = profileActivity.r2;
            if (o0Var != null) {
                o0Var.l(!o0Var.g(), new et0(13, profileActivity, view));
                return;
            }
            return;
        }
        if (i10 == profileActivity.botPermissionBiometry) {
            xh.n nVar = profileActivity.s2;
            if (nVar != null) {
                boolean z11 = !nVar.e;
                nVar.f = true;
                nVar.e = z11;
                nVar.k();
                ((org.telegram.ui.Cells.p8) view).setChecked(profileActivity.s2.e);
                return;
            }
            return;
        }
        if (i10 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            p8Var.setChecked(!p8Var.d());
            if (profileActivity.n4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.n4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().n1(profileActivity.d1);
            boolean d = p8Var.d();
            toggleuseremojistatuspermission.enabled = d;
            TLRPC.UserFull userFull2 = profileActivity.u2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = d;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new ul0(i15, profileActivity, r1));
            profileActivity.n4 = sendRequest;
            int[] iArr = {sendRequest};
            return;
        }
        if (i10 == profileActivity.N3) {
            profileActivity.N4 = !profileActivity.N4;
            profileActivity.S4();
            view.requestLayout();
            profileActivity.d.g(profileActivity.N3);
            int i16 = profileActivity.j6;
            if (i16 >= 0) {
                profileActivity.c.h1(i16, profileActivity.k6 - profileActivity.a.getPaddingTop());
                return;
            }
            return;
        }
        if (i10 == profileActivity.O3) {
            profileActivity.M4(false);
            return;
        }
        if (i10 == profileActivity.P2) {
            if (profileActivity.u2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.u2.personal_channel_id);
            profileActivity.presentFragment(new un(bundle7));
            return;
        }
        if (i10 != profileActivity.T2) {
            if (i10 == profileActivity.G3) {
                profileActivity.X3(i10, view);
                return;
            } else {
                profileActivity.P4(f7, f10, i10, view);
                return;
            }
        }
        oy0 oy0Var = profileActivity.y6;
        if ((oy0Var == null || !oy0Var.a()) && !profileActivity.Y3(i10, view)) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (z8Var.d.getDrawable() != null) {
                profileActivity.G4(z8Var.getImageView());
            }
        }
    }

    public static void k0(ProfileActivity profileActivity) {
        mg.l1 l1Var;
        int i10;
        String str;
        TextView[] textViewArr;
        final int i11;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.u2;
        if (userFull == null || userFull.stars_rating == null) {
            return;
        }
        org.telegram.ui.ActionBar.p6 p6Var = null;
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(profileActivity.getParentActivity(), false, 1, null);
        mg.l1 l1Var2 = h.x0;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        final LimitPreviewView limitPreviewView = new LimitPreviewView(R.drawable.filled_rating_crown, 0, 0, profileActivity.getParentActivity(), profileActivity.z0);
        limitPreviewView.setHideNegativeValues(profileActivity.a() != org.telegram.messenger.d20.i(profileActivity.currentAccount).e());
        limitPreviewView.setStarRating(userFull.stars_rating);
        limitPreviewView.setTranslationY(-org.telegram.messenger.i0.L(14.0f));
        linearLayout.addView(limitPreviewView, w7.b6.t(-1, -2, 17, 0, 20, 0, 10));
        int i12 = 17;
        if (userFull.stars_my_pending_rating != null) {
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            linearLayout.addView(frameLayout, w7.b6.t(-1, -2, 17, 40, -12, 40, 20));
            int i13 = 2;
            org.telegram.ui.Components.p80[] p80VarArr = new org.telegram.ui.Components.p80[2];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i13;
                kg.t1 t1Var = new kg.t1(4, parentActivity, p6Var);
                p80VarArr[i14] = t1Var;
                t1Var.setGravity(i12);
                p80VarArr[i14].setTextSize(1, 12.0f);
                org.telegram.ui.ActionBar.a7.V(p80VarArr[i14], org.telegram.ui.ActionBar.t6.y6, null);
                org.telegram.ui.ActionBar.a7.H(p80VarArr[i14], org.telegram.ui.ActionBar.t6.Uc, null);
                frameLayout.addView(p80VarArr[i14], w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
                p80VarArr[i14].setAlpha(i14 == 0 ? 1.0f : 0.0f);
                p80VarArr[i14].setScaleX(i14 == 0 ? 1.0f : 0.8f);
                p80VarArr[i14].setScaleY(i14 == 0 ? 1.0f : 0.8f);
                i14++;
                i13 = i15;
                i12 = 17;
            }
            int i16 = i13;
            final s3 s3Var = new s3(p80VarArr, 21);
            boolean z10 = profileActivity.a() == org.telegram.messenger.d20.i(profileActivity.currentAccount).e();
            long j10 = userFull.stars_rating.stars;
            TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
            l1Var = l1Var2;
            long j11 = (-j10) - (tl_starsRating != null ? tl_starsRating.stars - j10 : 0L);
            int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(profileActivity.currentAccount).getCurrentTime()) / 86400);
            long j12 = userFull.stars_my_pending_rating.stars;
            long j13 = userFull.stars_rating.stars;
            long j14 = j12 - j13;
            if ((j13 >= 0 || z10) && (!z10 || j11 <= 0)) {
                textViewArr = p80VarArr;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String H = org.telegram.messenger.cd.H(',', "StarRatingFuture", max);
                String H2 = org.telegram.messenger.cd.H(',', "StarRatingFuturePendingPoints", (int) j14);
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[0] = H;
                charSequenceArr[1] = "\n";
                charSequenceArr[i16] = H2;
                spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                spannableStringBuilder.append((CharSequence) " ");
                i11 = 0;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.G2(org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(2131745204, null), new Runnable() { // from class: org.telegram.ui.tv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17 = i11;
                        s3 s3Var2 = s3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i17) {
                            case 0:
                                RectF rectF = ProfileActivity.R6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                s3Var2.a(Boolean.TRUE);
                                break;
                            default:
                                RectF rectF2 = ProfileActivity.R6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                s3Var2.a(Boolean.FALSE);
                                break;
                        }
                    }
                }), true));
                textViewArr[0].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.uv0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i17 = i11;
                        s3 s3Var2 = s3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i17) {
                            case 0:
                                RectF rectF = ProfileActivity.R6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                s3Var2.a(Boolean.TRUE);
                                break;
                            default:
                                RectF rectF2 = ProfileActivity.R6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                s3Var2.a(Boolean.FALSE);
                                break;
                        }
                    }
                });
                textViewArr[0].setText(spannableStringBuilder);
            } else {
                boolean z11 = z10;
                textViewArr = p80VarArr;
                org.telegram.ui.ActionBar.a7.V(p80VarArr[0], org.telegram.ui.ActionBar.t6.q7, null);
                if (z11) {
                    textViewArr[0].setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.H(',', "StarRatingLevelNegativeYou", (int) j11)));
                } else {
                    textViewArr[0].setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131745190, org.telegram.messenger.o5.l(org.telegram.messenger.d20.s0, profileActivity.a()))));
                }
                i11 = 0;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String H3 = org.telegram.messenger.cd.H(',', "StarRatingFuturePreview1", max);
            String H4 = org.telegram.messenger.cd.H(',', "StarRatingFuturePreview2", (int) j14);
            CharSequence[] charSequenceArr2 = new CharSequence[3];
            charSequenceArr2[i11] = H3;
            final int i17 = 1;
            charSequenceArr2[1] = "\n";
            charSequenceArr2[i16] = H4;
            spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.G2(org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(2131745203, null), new Runnable() { // from class: org.telegram.ui.tv0
                @Override // java.lang.Runnable
                public final void run() {
                    int i172 = i17;
                    s3 s3Var2 = s3Var;
                    TLRPC.UserFull userFull2 = userFull;
                    LimitPreviewView limitPreviewView2 = limitPreviewView;
                    switch (i172) {
                        case 0:
                            RectF rectF = ProfileActivity.R6;
                            limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            s3Var2.a(Boolean.TRUE);
                            break;
                        default:
                            RectF rectF2 = ProfileActivity.R6;
                            limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                            s3Var2.a(Boolean.FALSE);
                            break;
                    }
                }
            }), true));
            textViewArr[1].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.uv0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i172 = i17;
                    s3 s3Var2 = s3Var;
                    TLRPC.UserFull userFull2 = userFull;
                    LimitPreviewView limitPreviewView2 = limitPreviewView;
                    switch (i172) {
                        case 0:
                            RectF rectF = ProfileActivity.R6;
                            limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            s3Var2.a(Boolean.TRUE);
                            break;
                        default:
                            RectF rectF2 = ProfileActivity.R6;
                            limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                            s3Var2.a(Boolean.FALSE);
                            break;
                    }
                }
            });
            textViewArr[1].setText(spannableStringBuilder2);
        } else {
            l1Var = l1Var2;
        }
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.cd.L0(2131745185, null));
        textView.setTextSize(1, 20.0f);
        int i18 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i18, profileActivity.z0);
        linearLayout.addView(textView, w7.b6.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        if (userFull.id == org.telegram.messenger.d20.i(profileActivity.currentAccount).e()) {
            textView2.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131745186, null)));
            i10 = 1;
        } else {
            i10 = 1;
            org.telegram.messenger.m5.q(null, null, 2131745216, new Object[]{org.telegram.messenger.o5.l(org.telegram.messenger.d20.s0, profileActivity.a())}, textView2);
        }
        textView2.setTextSize(i10, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, i18, profileActivity.z0);
        linearLayout.addView(textView2, w7.b6.t(-1, -2, 17, 20, 0, 20, 12));
        st0 st0Var = new st0(parentActivity, profileActivity.z0);
        st0Var.a.l(org.telegram.messenger.cd.L0(2131745184, null), false);
        String L0 = org.telegram.messenger.cd.L0(2131745219, null);
        int i19 = org.telegram.ui.ActionBar.t6.Ci;
        st0Var.b.setText(org.telegram.messenger.cd.V(null, null, 2131745215, V3(L0, i19, profileActivity.z0)));
        st0Var.d.setVisibility(8);
        ImageView imageView = st0Var.c;
        imageView.setImageResource(R.drawable.menu_gift);
        org.telegram.ui.ActionBar.p6 p6Var2 = profileActivity.z0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.a7.t(imageView, i18, p6Var2, mode);
        linearLayout.addView(st0Var, w7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        st0 st0Var2 = new st0(parentActivity, profileActivity.z0);
        st0Var2.a.l(org.telegram.messenger.cd.L0(2131745183, null), false);
        st0Var2.b.setText(org.telegram.messenger.cd.V(null, null, 2131745214, V3(org.telegram.messenger.cd.L0(2131745219, null), i19, profileActivity.z0)));
        st0Var2.d.setVisibility(8);
        ImageView imageView2 = st0Var2.c;
        imageView2.setImageResource(R.drawable.menu_stars_gift);
        org.telegram.ui.ActionBar.a7.t(imageView2, i18, profileActivity.z0, mode);
        linearLayout.addView(st0Var2, w7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        st0 st0Var3 = new st0(parentActivity, profileActivity.z0);
        st0Var3.a.l(org.telegram.messenger.cd.L0(2131745182, null), false);
        String L02 = org.telegram.messenger.cd.L0(2131745217, null);
        int f7 = org.telegram.ui.ActionBar.t6.I.q() ? i0.b.f(0.25f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.m6, profileActivity.z0), -16777216) : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, profileActivity.z0);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(L02);
        ax0 ax0Var = new ax0(9);
        ax0Var.w = L02;
        if (ax0Var.c != null) {
            str = null;
            ax0Var.c = null;
            ax0Var.a();
        } else {
            str = null;
        }
        ax0Var.f = f7;
        ax0Var.n = false;
        spannableStringBuilder3.setSpan(ax0Var, 0, spannableStringBuilder3.length(), 0);
        st0Var3.b.setText(org.telegram.messenger.cd.V(str, str, 2131745213, spannableStringBuilder3));
        st0Var3.d.setVisibility(8);
        ImageView imageView3 = st0Var3.c;
        imageView3.setImageResource(R.drawable.menu_refund);
        org.telegram.ui.ActionBar.a7.t(imageView3, i18, profileActivity.z0, mode);
        linearLayout.addView(st0Var3, w7.b6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        vh.d dVar = new vh.d(parentActivity, profileActivity.z0, true);
        dVar.setOnClickListener(new vv0(0, l1Var));
        dVar.i(rh.e4.g2(org.telegram.messenger.cd.L0(2131743913, null)), false, true);
        linearLayout.addView(dVar, w7.b6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        h.N = linearLayout;
        h.show();
    }

    public static void l0(ProfileActivity profileActivity, int i10, float f7, float f10) {
        int i11 = 1;
        switch (i10) {
            case 0:
                boolean z10 = profileActivity.p1;
                if (!z10) {
                    if (profileActivity.d1 == 0) {
                        if (profileActivity.e1 != 0) {
                            if (!org.telegram.messenger.w3.c0(profileActivity.getMessagesController().L0(Long.valueOf(profileActivity.e1)))) {
                                if (!profileActivity.b4()) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", profileActivity.e1);
                                    if (profileActivity.getMessagesController().E(bundle, profileActivity, null, null)) {
                                        profileActivity.presentFragment(new un(bundle), false);
                                        break;
                                    }
                                }
                            } else {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", profileActivity.e1);
                                if (profileActivity.getMessagesController().E(bundle2, profileActivity, null, null)) {
                                    profileActivity.presentFragment(new un(bundle2), false);
                                    break;
                                }
                            }
                        }
                    } else {
                        profileActivity.K4();
                        break;
                    }
                } else if (z10) {
                    profileActivity.b4();
                    break;
                }
                break;
            case 1:
                profileActivity.E4(profileActivity.Z, f7, f10, true);
                break;
            case 2:
                profileActivity.L4();
                break;
            case 3:
                profileActivity.C4();
                break;
            case 4:
                profileActivity.F4();
                break;
            case 5:
            case 10:
            case 11:
                profileActivity.B4(false);
                break;
            case 6:
                profileActivity.B4(true);
                break;
            case 7:
                profileActivity.D4(true);
                break;
            case 8:
                c01.K0(profileActivity.a(), profileActivity);
                break;
            case 9:
                profileActivity.v4(false);
                break;
            case 12:
                profileActivity.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, profileActivity.getParentActivity(), profileActivity.z0);
                x1Var.r(200L);
                org.telegram.messenger.vp.r1(profileActivity.currentAccount).O1().k(profileActivity.a(), new org.telegram.ui.Components.vg(27, profileActivity, x1Var), true, profileActivity.z0);
                break;
            case 13:
                profileActivity.A4(true);
                break;
            case 14:
                profileActivity.H4();
                break;
            case 15:
                TLRPC.User f11 = profileActivity.getUserConfig().f();
                if (f11 != null) {
                    org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(profileActivity, profileActivity.Z);
                    H.w = false;
                    H.i = 3;
                    H.c(R.drawable.msg_qrcode, org.telegram.messenger.cd.L0(2131746515, null), new oa0(profileActivity, 24), false);
                    H.c(R.drawable.msg_copy, org.telegram.messenger.cd.L0(2131746693, null), new wv0(f11, i11), false);
                    H.c(R.drawable.msg_edit, org.telegram.messenger.cd.L0(2131746635, null), new oa0(profileActivity, 26), false);
                    H.W = true;
                    H.a0(f7 - org.telegram.messenger.i0.L(8.0f), profileActivity.Z.getMeasuredHeight() - org.telegram.messenger.i0.L(16.0f));
                    H.Z();
                    break;
                }
                break;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 17:
                profileActivity.presentFragment(new e51(null));
                break;
        }
    }

    public static void m0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.a0 == null) {
            if (MediaController.B().Q0 != null && MediaController.B().Q0.a == profileActivity.currentAccount && MediaController.B().Q0.b == profileActivity.a()) {
                profileActivity.a0 = MediaController.B().Q0;
            } else {
                org.telegram.messenger.pp ppVar = new org.telegram.messenger.pp(profileActivity.currentAccount, profileActivity.a());
                profileActivity.a0 = ppVar;
                TLRPC.UserFull userFull = profileActivity.u2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    ArrayList arrayList = ppVar.c;
                    arrayList.clear();
                    ppVar.b();
                    arrayList.add(0, ppVar.d(document));
                }
            }
        }
        if (profileActivity.a0.c.isEmpty()) {
            return;
        }
        if (MediaController.B().Q0 == profileActivity.a0 && MediaController.B().I((org.telegram.messenger.jj) profileActivity.a0.c.get(0))) {
            z10 = true;
        } else {
            MediaController.B().o();
            z10 = false;
        }
        MediaController.B().Q0 = profileActivity.a0;
        MediaController.B().R0.clear();
        MediaController.B().R0.addAll(profileActivity.a0.c);
        if (!z10) {
            MediaController.B().S((org.telegram.messenger.jj) profileActivity.a0.c.get(0));
        }
        profileActivity.showDialog(new org.telegram.ui.Components.w7(profileActivity.getParentActivity(), profileActivity.z0));
    }

    public static void n0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.gb0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new oa0(profileActivity, 20), profileActivity.z0);
    }

    public static void o0(ProfileActivity profileActivity, org.telegram.ui.Cells.c2[] c2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().n1(profileActivity.d1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().i1(profileActivity.a5);
        tL_messages_reportReaction.id = profileActivity.Z4;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new ag.c3(22));
        org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
        if (c2Var != null && c2Var.b()) {
            profileActivity.getMessagesController().f0(-profileActivity.a5, profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.d1)));
        }
        profileActivity.Z4 = 0;
        profileActivity.C5(false, false);
        org.telegram.ui.Components.cc.a0(profileActivity).E(profileActivity.z0).j();
    }

    public static void p0(ProfileActivity profileActivity, Boolean bool) {
        long j10 = profileActivity.d1;
        if (j10 == 0) {
            long j11 = profileActivity.e1;
            j10 = j11 != 0 ? -j11 : profileActivity.h1;
        }
        long j12 = j10;
        if (bool.booleanValue()) {
            org.telegram.messenger.vp.r1(profileActivity.currentAccount).W(profileActivity.a5, j12);
        } else {
            org.telegram.messenger.vp.r1(profileActivity.currentAccount).h0(profileActivity.a5, profileActivity.Z4, j12);
        }
        profileActivity.Z4 = 0;
        profileActivity.C5(false, false);
        org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(profileActivity.getParentActivity(), profileActivity.z0);
        ebVar.d(R.raw.chats_infotip, new String[0]);
        ebVar.b.setText(org.telegram.messenger.cd.L0(2131746419, null));
        org.telegram.ui.Components.cc.a0(profileActivity).b(ebVar, 1500).j();
    }

    public static void q0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f7, boolean z10) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.T1 = floatValue;
        float f10 = (floatValue - 0.5f) / 0.5f;
        float f11 = (0.5f - floatValue) / 0.5f;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        float f12 = -f7;
        profileActivity.S1 = (int) ((1.0f - floatValue) * f12);
        profileActivity.b.setTranslationY(floatValue * f7);
        profileActivity.O.setTranslationY(f7 * profileActivity.T1);
        profileActivity.a.setTranslationY((1.0f - profileActivity.T1) * f12);
        profileActivity.a.setScaleX(1.0f - ((1.0f - profileActivity.T1) * 0.01f));
        profileActivity.a.setScaleY(1.0f - ((1.0f - profileActivity.T1) * 0.01f));
        profileActivity.a.setAlpha(profileActivity.T1);
        profileActivity.x4(true);
        profileActivity.a.setAlpha(f10);
        profileActivity.b.setAlpha(1.0f - profileActivity.T1);
        profileActivity.b.setScaleX((profileActivity.T1 * 0.05f) + 1.0f);
        profileActivity.b.setScaleY((profileActivity.T1 * 0.05f) + 1.0f);
        profileActivity.O.setAlpha(1.0f - f10);
        profileActivity.X.setAlpha(f10);
        profileActivity.e0.setAlpha(f10);
        mw0 mw0Var = profileActivity.u0;
        if (mw0Var != null) {
            mw0Var.setAlpha(f10);
        }
        profileActivity.f.setAlpha(f10);
        profileActivity.r.setAlpha(profileActivity.Q5 ? 0.0f : f10);
        profileActivity.T0.getSearchField().setAlpha(f11);
        if (z10 && profileActivity.T1 < 0.7f) {
            org.telegram.ui.ActionBar.p5 p5Var = profileActivity.T0;
            if (p5Var.F.getWidth() != 0 && !p5Var.e.isFocused()) {
                p5Var.e.requestFocus();
                org.telegram.messenger.i0.J3(p5Var.e);
            }
        }
        profileActivity.T0.getSearchContainer().setVisibility(profileActivity.T1 < 0.5f ? 0 : 8);
        int i10 = profileActivity.T1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.p5 p5Var2 = profileActivity.S0;
        if (p5Var2 != null) {
            p5Var2.setVisibility(i10);
            profileActivity.S0.setAlpha(f10);
        }
        profileActivity.T0.setVisibility(i10);
        profileActivity.actionBar.y(profileActivity.T1 < 0.5f);
        org.telegram.ui.ActionBar.p5 p5Var3 = profileActivity.S0;
        if (p5Var3 != null) {
            p5Var3.setAlpha(f10);
        }
        profileActivity.T0.setAlpha(f10);
        profileActivity.c1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void r1(ProfileActivity profileActivity) {
        if (profileActivity.simpleActionBar == null) {
            return;
        }
        org.telegram.ui.ActionBar.l lVar = profileActivity.actionBar;
        if (lVar != null && lVar.getVisibility() != 4) {
            profileActivity.actionBar.setVisibility(4);
        }
        float actionModeFactor = profileActivity.simpleActionBar.getActionModeFactor();
        fg.i iVar = profileActivity.Y;
        if (iVar != null) {
            float f7 = 1.0f - actionModeFactor;
            if (iVar.getAlpha() != f7) {
                profileActivity.Y.setAlpha(f7);
            }
        }
    }

    public static void x1(ProfileActivity profileActivity, boolean z10) {
        int i10 = z10 ? 8 : 0;
        profileActivity.a.setVisibility(i10);
        profileActivity.b.setVisibility(z10 ? 0 : 8);
        profileActivity.T0.getSearchContainer().setVisibility(z10 ? 0 : 8);
        rh.g0 g0Var = profileActivity.v0;
        if (g0Var != null) {
            g0Var.setActive(!z10);
        }
        profileActivity.actionBar.y(z10);
        profileActivity.X.setVisibility(i10);
        mw0 mw0Var = profileActivity.u0;
        if (mw0Var != null) {
            mw0Var.setVisibility(i10);
        }
        profileActivity.f.setVisibility(i10);
        profileActivity.r.setVisibility(i10);
        org.telegram.ui.ActionBar.p5 p5Var = profileActivity.S0;
        if (p5Var != null) {
            p5Var.setAlpha(1.0f);
            profileActivity.S0.setVisibility(i10);
        }
        profileActivity.T0.setVisibility(i10);
        profileActivity.e0.setAlpha(1.0f);
        profileActivity.X.setAlpha(1.0f);
        mw0 mw0Var2 = profileActivity.u0;
        if (mw0Var2 != null) {
            mw0Var2.setAlpha(1.0f);
        }
        rh.g0 g0Var2 = profileActivity.v0;
        if (g0Var2 != null) {
            g0Var2.setAlpha(1.0f);
        }
        profileActivity.f.setAlpha(1.0f);
        profileActivity.r.setAlpha(profileActivity.Q5 ? 0.0f : 1.0f);
        profileActivity.T0.setAlpha(1.0f);
        profileActivity.a.setAlpha(1.0f);
        profileActivity.b.setAlpha(1.0f);
        profileActivity.O.setAlpha(1.0f);
        if (z10) {
            profileActivity.b.setEmptyView(profileActivity.O);
        } else {
            profileActivity.O.setVisibility(8);
        }
    }

    public static ProfileActivity z4(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new ProfileActivity(bundle, null);
    }

    public final void A4(boolean z10) {
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.d1));
        if (Z1 == null) {
            return;
        }
        if (this.q2 && !org.telegram.messenger.vp.E2(Z1)) {
            if (!this.j1 || z10) {
                org.telegram.ui.Components.s4.r(this, false, this.D2, Z1, this.C2 != null, true, false, true, new gv0(this, Z1));
                return;
            } else {
                getMessagesController().c5(new oa0(this, 6), this.d1);
                finishFragment();
                return;
            }
        }
        if (this.j1) {
            getMessagesController().c5(null, this.d1);
            if (org.telegram.ui.Components.cc.a(this)) {
                org.telegram.ui.Components.cc.d(this, false).j();
                return;
            }
            return;
        }
        if (this.k1) {
            org.telegram.ui.Components.s4.i0(this, this.d1, Z1, null, this.C2, false, null, new ra(this, 4), this.z0);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.z0);
        String L0 = org.telegram.messenger.cd.L0(2131753692, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name)));
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131753693, null), new bv0(this, 2));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, this.z0);
        }
    }

    public final void A5(boolean z10) {
        if (this.S0 == null) {
            return;
        }
        boolean z11 = this.Q5;
        boolean z12 = !z11;
        boolean z13 = this.o2;
        boolean z14 = false;
        c5(this.P0, (z11 || z13 || !this.L0) ? false : true, z10);
        c5(this.Q0, (z11 || z13 || !this.M0) ? false : true, z10);
        c5(this.R0, (z11 || z13 || !this.N0) ? false : true, z10);
        ix0 ix0Var = this.N;
        boolean z15 = (ix0Var == null || ix0Var.I == null || !ix0Var.t0(ix0Var.getClosestTab())) ? false : true;
        c5(this.S0, z12, z10 && !z15);
        ix0 ix0Var2 = this.N;
        if (ix0Var2 != null) {
            boolean z16 = this.Q5;
            if (z10 && !z15) {
                z14 = true;
            }
            if (ix0Var2.p2 != z16) {
                ix0Var2.p2 = z16;
                ix0Var2.P(z10, z14);
            }
        }
    }

    @Override // org.telegram.ui.of0
    public final hi.f B() {
        return getBaseSimpleGlass().h;
    }

    public final void B4(boolean z10) {
        boolean z11 = false;
        if (this.d1 != 0) {
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.d1));
            if (Z1 != null) {
                TLRPC.UserFull userFull = this.u2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.m1.m(Z1, z10, z11, getParentActivity(), this.u2, getAccountInstance());
                return;
            }
            return;
        }
        if (this.e1 != 0) {
            if (getMessagesController().f1(this.e1, false, null) != null) {
                org.telegram.ui.Components.voip.m1.l(this.D2, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            TLRPC.Chat chat = this.D2;
            org.telegram.messenger.c accountInstance = getAccountInstance();
            if (getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.k70.J0(getParentActivity(), -chat.id, accountInstance, new androidx.car.app.utils.a(chat, this, accountInstance, 28));
        }
    }

    public final void B5() {
        TLRPC.User Z1;
        if (!this.r1 || this.W0 == null || this.V0 == null || (Z1 = getMessagesController().Z1(Long.valueOf(this.d1))) == null) {
            return;
        }
        boolean z10 = org.telegram.messenger.h20.n(Z1) != null;
        this.W0.setIcon(z10 ? R.drawable.menu_username_change : R.drawable.menu_username_set);
        this.W0.setText(org.telegram.messenger.cd.L0(z10 ? 2131746635 : 2131746634, null));
        this.V0.setVisibility(org.telegram.messenger.h20.n(Z1) == null ? 8 : 0);
    }

    public final void C4() {
        TLRPC.UserFull userFull = this.u2;
        if (userFull == null || !org.telegram.messenger.h20.b(userFull)) {
            if (this.D2 != null) {
                org.telegram.ui.Components.r30.h.a();
            }
            showDialog(new ph.l1(getParentActivity(), this.currentAccount, a(), null, null));
        } else {
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            if (T != null) {
                org.telegram.messenger.z20.s(org.telegram.messenger.cd.a0(null, null, 2131743768, org.telegram.messenger.o5.t(a())), org.telegram.ui.Components.cc.a0(T), R.raw.error, 36);
            }
        }
    }

    public final void C5(boolean z10, boolean z11) {
        if (this.d == null) {
            if (z10) {
                F5(false);
            }
            I5();
            return;
        }
        if (!z11 && this.a.isInLayout()) {
            bw0 bw0Var = this.a;
            if (bw0Var.G) {
                bw0Var.post(new yv0(0, this, z10));
                return;
            }
            return;
        }
        kx0 kx0Var = new kx0(this);
        kx0Var.b = this.M2;
        kx0Var.f(kx0Var.c);
        kx0Var.e.clear();
        kx0Var.f.clear();
        kx0Var.e.addAll(this.Q4);
        kx0Var.f.addAll(this.R4);
        kx0Var.g = this.t4;
        kx0Var.h = this.u4;
        if (z10) {
            F5(false);
        }
        S4();
        I5();
        kx0Var.f(kx0Var.d);
        try {
            s4.n.c(kx0Var, true).c(this.d);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            this.d.f();
        }
        int i10 = this.j6;
        if (i10 >= 0) {
            this.c.h1(i10, this.k6 - this.a.getPaddingTop());
        }
        org.telegram.messenger.i0.a4(this.a);
    }

    public final void D4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().m(this.D2.id, getUserConfig().f(), 0, null, this, true, new bk0(this, z10, zArr, 5), new bi.o4(this, zArr, z10, this.parentLayout.getLastFragment(), 5), null);
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.I4, new Object[0]);
    }

    public final void D5() {
        if (this.b0 == null || this.r == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0);
        boolean z10 = this.F1;
        if (z10 && this.I1 == 2 && this.X != null) {
            this.b0.setAlpha(this.R1);
            this.b0.f(org.telegram.messenger.i0.L(74.0f) + this.a.getMeasuredWidth(), d4() - org.telegram.messenger.i0.L(74.0f));
            return;
        }
        if (z10) {
            this.b0.setAlpha(this.R1);
        }
        float f7 = currentActionBarHeight;
        float L = this.P1 + f7 + org.telegram.messenger.i0.L(74.0f);
        float min = Math.min(d4(), L - f7);
        this.b0.f(L - min, min - org.telegram.messenger.i0.L(74.0f));
    }

    public final void E4(View view, float f7, float f10, boolean z10) {
        float f11;
        float f12;
        long j10;
        long j11 = this.h1;
        if (j11 == 0) {
            j11 = this.d1;
            if (j11 == 0) {
                j11 = -this.e1;
            }
        }
        long j12 = j11;
        boolean q22 = getMessagesController().q2(j12, this.f1, null);
        if (z10 && (this.p1 || q22)) {
            boolean z11 = !q22;
            getNotificationsController().G(j12, this.f1, z11);
            org.telegram.ui.Components.cc.A(this, z11, null).j();
            u5();
            this.Z.setNotifications(q22);
            return;
        }
        if ((z10 || !org.telegram.messenger.cd.X || f7 > org.telegram.messenger.i0.L(76.0f)) && (org.telegram.messenger.cd.X || f7 < view.getMeasuredWidth() - org.telegram.messenger.i0.L(76.0f))) {
            org.telegram.ui.Components.go goVar = new org.telegram.ui.Components.go(getParentActivity(), this.currentAccount, null, true, new c3.g0(this, j12, 6), this.z0);
            goVar.e(j12, this.f1, this.h5);
            if (org.telegram.messenger.i0.Q1()) {
                ViewGroup view2 = this.parentLayout.getView();
                f11 = view2.getX() + view2.getPaddingLeft() + f7;
                f12 = view2.getY() + view2.getPaddingTop() + f10;
            } else {
                f11 = f7;
                f12 = f10;
            }
            if (z10) {
                f12 += this.Z.getHeight() - org.telegram.messenger.i0.L(12.0f);
            }
            goVar.d(this, view, f11, f12, z10);
            return;
        }
        org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
        boolean z12 = l5Var.e.h;
        boolean z13 = !z12;
        boolean D = getNotificationsController().D(j12, null, false, false);
        String v = org.telegram.messenger.ot.v(j12, this.f1, false);
        if (z12) {
            SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(this.currentAccount).e7.edit();
            if (D) {
                edit.putInt("notify2_" + v, 2);
                j10 = 1;
            } else {
                edit.remove("notify2_" + v);
                j10 = 0L;
            }
            getNotificationsController().N(j12);
            if (this.f1 == 0) {
                getMessagesStorage().E1(j12, j10);
                TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j12);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (D) {
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
        } else {
            SharedPreferences.Editor edit2 = org.telegram.messenger.vp.r1(this.currentAccount).e7.edit();
            if (D) {
                edit2.remove("notify2_" + v);
            } else {
                edit2.putInt("notify2_" + v, 0);
            }
            if (this.f1 == 0) {
                getMessagesStorage().E1(j12, 0L);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().Q.f(j12);
                if (dialog2 != null) {
                    dialog2.notify_settings = new TLRPC.TL_peerNotifySettings();
                }
            }
            edit2.apply();
        }
        u5();
        getNotificationsController().c0(j12, this.f1, true);
        l5Var.setChecked(z13);
        E5(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if ((r0 - getConnectionsManager().getCurrentTime()) <= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r6 == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E5(boolean z10) {
        int i10;
        xx0 xx0Var;
        if (z10 && (i10 = this.M3) >= 0 && (xx0Var = this.d) != null) {
            xx0Var.g(i10);
        }
        org.telegram.ui.Components.hg0 hg0Var = this.Z;
        if (hg0Var == null || this.r1) {
            return;
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(this.currentAccount).e7;
        long j10 = this.h1;
        if (j10 == 0) {
            j10 = this.d1;
            if (j10 == 0) {
                j10 = -this.e1;
            }
        }
        long j11 = j10;
        boolean z11 = false;
        String v = org.telegram.messenger.ot.v(j11, this.f1, false);
        boolean contains = sharedPreferences.contains("notify2_" + v);
        int c10 = org.telegram.messenger.m5.c("notify2_", v, sharedPreferences, 0);
        int c11 = org.telegram.messenger.m5.c("notifyuntil_", v, sharedPreferences, 0);
        if (c10 != 3 || c11 == Integer.MAX_VALUE) {
            if (c10 == 0) {
                if (!contains) {
                    z11 = getNotificationsController().D(j11, null, false, false);
                    hg0Var.setNotifications(z11);
                }
                z11 = true;
                hg0Var.setNotifications(z11);
            }
        }
    }

    public final void F4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.d1 != 0) {
                TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.d1));
                if (Z1 == null) {
                    return;
                }
                if (this.E2 == null || (userFull = this.u2) == null || TextUtils.isEmpty(userFull.about)) {
                    str = String.format("https://" + getMessagesController().U2 + "/%s", org.telegram.messenger.h20.n(Z1));
                } else {
                    str = String.format("%s https://" + getMessagesController().U2 + "/%s", this.u2.about, org.telegram.messenger.h20.n(Z1));
                }
            } else if (this.e1 != 0) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.e1));
                if (L0 == null) {
                    return;
                }
                TLRPC.ChatFull chatFull = this.t2;
                if (chatFull == null || TextUtils.isEmpty(chatFull.about)) {
                    str = String.format("https://" + getMessagesController().U2 + "/%s", org.telegram.messenger.w3.K(L0, false));
                } else {
                    str = String.format("%s\nhttps://" + getMessagesController().U2 + "/%s", this.t2.about, org.telegram.messenger.w3.K(L0, false));
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
            startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131752982, null)), 500);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void F5(boolean z10) {
        int i10;
        TLRPC.UserStatus userStatus;
        boolean z11;
        int i11 = 0;
        this.A2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.B2.clear();
        TLRPC.ChatFull chatFull = this.t2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z11 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z11 || chatFull.participants_count <= 200) {
                return;
            }
            this.A2 = chatFull.online_count;
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i11 < this.t2.participants.participants.size()) {
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.t2.participants.participants.get(i11).user_id));
            if (Z1 != null && (userStatus = Z1.status) != null && ((userStatus.expires > currentTime || Z1.id == getUserConfig().e()) && Z1.status.expires > 10000)) {
                this.A2++;
            }
            this.B2.add(Integer.valueOf(i11));
            if (Z1 != null) {
                if (Z1.bot) {
                    i10 = -110;
                } else if (Z1.self) {
                    i10 = 50000 + currentTime;
                } else {
                    TLRPC.UserStatus userStatus2 = Z1.status;
                    if (userStatus2 != null) {
                        i10 = userStatus2.expires;
                    }
                }
                i11 = c3.i0.j(i10, i11, 1, arrayList);
            }
            i10 = TLObject.FLAG_31;
            i11 = c3.i0.j(i10, i11, 1, arrayList);
        }
        try {
            Collections.sort(this.B2, Comparator$-EL.reversed(Comparator$-CC.comparingInt(new ef(arrayList, 1))));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (z10 && this.d != null && this.t4 > 0) {
            org.telegram.messenger.i0.a4(this.a);
        }
        if (this.N == null || this.J4 == -1) {
            return;
        }
        if ((this.B2.size() > 5 || this.S4 == 2) && this.S4 != 1) {
            this.N.h1(this.B2, this.t2);
        }
    }

    @Override // org.telegram.ui.ux
    public final /* synthetic */ boolean G() {
        return false;
    }

    public final void G3() {
        org.telegram.ui.ActionBar.l lVar;
        if (this.N == null || (lVar = this.actionBar) == null) {
            return;
        }
        int i10 = lVar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
        int[] iArr = org.telegram.ui.Components.zt0.s2;
        int z10 = org.telegram.messenger.m5.z(6.666f, ei.b.d(currentActionBarHeight - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()), currentActionBarHeight);
        int c10 = ei.b.c(i10) + currentActionBarHeight + z10;
        this.T5 = c10;
        this.N.i1(z10, c10, ei.b.c(this.H6), this.H6 + this.F6);
        this.U5 = org.telegram.messenger.i0.L(44.0f) + currentActionBarHeight;
        x5();
        O3();
    }

    public final void G4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.K3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.e1);
            bundle.putLong("user_id", this.d1);
            presentFragment(new qh.i0(bundle));
            return;
        }
        if (view2.getTag() == null || ((Integer) view2.getTag()).intValue() != this.T2) {
            return;
        }
        if (this.d1 == getUserConfig().e()) {
            presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
        } else if (org.telegram.messenger.h20.b(this.u2)) {
            org.telegram.messenger.z20.s(org.telegram.messenger.cd.a0(null, null, 2131743768, org.telegram.messenger.o5.t(this.d1)), org.telegram.ui.Components.cc.a0(this), R.raw.error, 36);
        } else {
            showDialog(new ph.l1(getParentActivity(), this.currentAccount, this.d1, null, null));
        }
    }

    public final void G5() {
        CharSequence charSequence;
        lw0 lw0Var = this.r;
        if (lw0Var == null) {
            return;
        }
        if ((!this.Q5 || (charSequence = this.V5) == null) && (!this.s6 || (charSequence = this.r6) == null)) {
            charSequence = this.q6;
        }
        if (!lw0Var.o(charSequence, !this.F1) || this.fragmentView == null) {
            return;
        }
        x4(false);
    }

    @Override // org.telegram.ui.Components.a40
    public final void H(float f7) {
        org.telegram.ui.Cells.d4 d4Var = this.g0;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(f7);
        this.n0.O(this.J2, f7);
    }

    public final int H3(int i10, Boolean bool) {
        if (this.f6 == null) {
            return i10;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, this.z0);
        int f7 = i0.b.f(0.5f, this.f6.m(org.telegram.ui.ActionBar.t6.I.q()), this.f6.n(org.telegram.ui.ActionBar.t6.I.q()));
        if (org.telegram.ui.ActionBar.t6.e1(w02)) {
            return org.telegram.ui.ActionBar.t6.D(org.telegram.ui.ActionBar.t6.I.q(), w02, f7, i10, (bool == null || bool.booleanValue()) ? f7 : org.telegram.ui.ActionBar.t6.r1(0.7f, f7));
        }
        return (bool == null || bool.booleanValue()) ? f7 : org.telegram.ui.ActionBar.t6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.t6.r1(0.7f, f7));
    }

    public final void H4() {
        org.telegram.ui.Components.bi0 bi0Var;
        if (this.d1 == 0) {
            L4();
            return;
        }
        if (this.q0 == null) {
            K4();
            return;
        }
        TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.currentAccount).Z1(Long.valueOf(org.telegram.messenger.d20.i(this.currentAccount).e()));
        if (Z1 == null) {
            Z1 = org.telegram.messenger.d20.i(this.currentAccount).f();
        }
        if (Z1 == null) {
            return;
        }
        org.telegram.ui.Components.b40 b40Var = this.q0;
        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
        b40Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new oa0(this, 27), new q5(this, 13), 0);
        this.U.M(0);
        this.U.P(43);
        this.V.M(0);
        this.V.P(43);
        org.telegram.ui.Components.hg0 hg0Var = this.Z;
        if (hg0Var != null) {
            org.telegram.ui.Components.eg0 i10 = org.telegram.ui.Components.hg0.i(14, hg0Var.a);
            if (i10 != null && (bi0Var = i10.k) != null) {
                bi0Var.start();
            }
        } else {
            this.s.d();
        }
        org.telegram.ui.Cells.p8 p8Var = this.L2;
        if (p8Var != null) {
            p8Var.getImageView().d();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(73:32|(1:287)(1:36)|(1:38)(1:286)|39|(3:41|(1:43)(1:45)|44)|46|(1:48)|49|(1:51)|52|(1:54)|55|(1:57)(1:285)|58|(4:60|(1:283)(1:64)|65|(58:67|68|(1:70)|71|(1:(1:74)(50:(1:280)(1:78)|79|(1:83)|(1:276)(1:89)|90|(2:92|(2:94|(1:96))(2:216|(1:223)(1:222)))(2:224|(1:226)(2:227|(1:275)(2:233|(1:235)(2:236|(2:238|(1:240)(1:241))(40:242|(1:244)(1:274)|245|(1:273)(1:259)|260|(2:262|(4:264|(1:272)(1:268)|269|(1:271)))|98|(1:215)(1:102)|103|104|105|(1:107)|108|(1:110)|111|(3:113|(1:115)|116)(1:212)|117|(1:119)(1:211)|120|(3:122|(1:124)|125)(1:210)|126|(3:206|(1:208)|209)(2:130|(1:132)(1:205))|133|(2:201|(1:203)(1:204))(1:137)|(1:200)(1:143)|144|(1:199)|147|(2:149|(1:151))|152|(2:154|(1:156))|157|(3:159|(2:161|(1:187)(1:167))(1:188)|168)(4:189|(1:198)(1:195)|196|197)|169|(1:171)|172|(1:186)(1:178)|179|(1:181)|182)))))|97|98|(1:100)|215|103|104|105|(0)|108|(0)|111|(0)(0)|117|(0)(0)|120|(0)(0)|126|(1:128)|206|(0)|209|133|(1:135)|201|(0)(0)|(1:139)|200|144|(0)|199|147|(0)|152|(0)|157|(0)(0)|169|(0)|172|(2:174|176)|186|179|(0)|182))|281|79|(50:81|83|(2:85|87)|276|90|(0)(0)|97|98|(0)|215|103|104|105|(0)|108|(0)|111|(0)(0)|117|(0)(0)|120|(0)(0)|126|(0)|206|(0)|209|133|(0)|201|(0)(0)|(0)|200|144|(0)|199|147|(0)|152|(0)|157|(0)(0)|169|(0)|172|(0)|186|179|(0)|182)|278|83|(0)|276|90|(0)(0)|97|98|(0)|215|103|104|105|(0)|108|(0)|111|(0)(0)|117|(0)(0)|120|(0)(0)|126|(0)|206|(0)|209|133|(0)|201|(0)(0)|(0)|200|144|(0)|199|147|(0)|152|(0)|157|(0)(0)|169|(0)|172|(0)|186|179|(0)|182))(1:284)|282|68|(0)|71|(0)|281|79|(0)|278|83|(0)|276|90|(0)(0)|97|98|(0)|215|103|104|105|(0)|108|(0)|111|(0)(0)|117|(0)(0)|120|(0)(0)|126|(0)|206|(0)|209|133|(0)|201|(0)(0)|(0)|200|144|(0)|199|147|(0)|152|(0)|157|(0)(0)|169|(0)|172|(0)|186|179|(0)|182) */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x064f, code lost:
    
        if (r32.t2.can_view_participants != false) goto L336;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x084d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H5(boolean z10) {
        Object obj;
        boolean z11;
        CharSequence G;
        TLRPC.ChatParticipants chatParticipants;
        boolean z12;
        CharSequence charSequence;
        boolean l4;
        boolean z13;
        org.telegram.messenger.ic m10;
        org.telegram.messenger.ic m11;
        org.telegram.messenger.ic icVar;
        org.telegram.messenger.ic icVar2;
        org.telegram.messenger.ic icVar3;
        View m12;
        TLRPC.Chat chat;
        org.telegram.messenger.ic icVar4;
        int i10;
        TLRPC.VideoSize videoSize;
        org.telegram.ui.Components.g61 g61Var;
        org.telegram.messenger.ic icVar5;
        TLRPC.User user;
        org.telegram.messenger.ic icVar6;
        TLRPC.User user2;
        TLRPC.UserStatus userStatus;
        String str;
        boolean z14;
        org.telegram.ui.ActionBar.i5 i5Var;
        iy0 iy0Var;
        Drawable drawable;
        boolean z15;
        boolean z16;
        boolean z17;
        String str2;
        org.telegram.ui.Components.gg ggVar;
        String str3;
        String str4;
        TL_stars.Tl_starsRating tl_starsRating;
        String str5;
        TL_stars.Tl_starsRating tl_starsRating2;
        org.telegram.messenger.ic icVar7;
        xw xwVar;
        if (this.X == null || this.f == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var == null || z4Var.getFragmentStack().size() < 2) {
            obj = null;
        } else {
            org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            obj = k2Var instanceof org.telegram.ui.Components.gg ? k2Var : null;
            if ((k2Var instanceof ay) && (xwVar = ((ay) k2Var).F3) != null) {
                ex exVar = xwVar.a;
                if (c3.i0.t(exVar)) {
                    obj = exVar;
                }
            }
        }
        if (obj instanceof un) {
            un unVar = (un) obj;
            if (unVar.o1 != null && unVar.f4 == 8) {
                z11 = true;
                this.p5 = false;
                this.q5 = false;
                String str6 = "";
                if (this.d1 == 0) {
                    TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.d1));
                    if (Z1 == null) {
                        return;
                    }
                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                    boolean z18 = userProfilePhoto != null && userProfilePhoto.personal;
                    TLRPC.FileLocation fileLocation = userProfilePhoto != null ? userProfilePhoto.photo_big : null;
                    this.p0.r(Z1);
                    org.telegram.messenger.kp kpVar = this.f6;
                    org.telegram.messenger.kp a2 = org.telegram.messenger.kp.a(Z1.emoji_status);
                    this.f6 = a2;
                    if (a2 == null) {
                        int l10 = org.telegram.messenger.h20.l(Z1);
                        org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(this.currentAccount).s4;
                        this.f6 = lpVar == null ? null : lpVar.d(l10);
                    }
                    if (kpVar != this.f6) {
                        O5();
                    }
                    ky0 ky0Var = this.c1;
                    if (ky0Var != null) {
                        ky0Var.b(org.telegram.messenger.h20.m(Z1), Z1.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    org.telegram.ui.Components.nv0 nv0Var = this.S;
                    if (nv0Var != null) {
                        nv0Var.b.a(this.f6);
                        nv0Var.invalidate();
                    }
                    TLRPC.EmojiStatus emojiStatus = Z1.emoji_status;
                    a5(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null);
                    org.telegram.messenger.ic m13 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.s0, 0, Z1);
                    org.telegram.messenger.ic m14 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.s0, 1, Z1);
                    org.telegram.messenger.ic m15 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.s0, 4, Z1);
                    TLRPC.UserFull userFull = this.u2;
                    if (userFull != null) {
                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                        videoSize = org.telegram.messenger.b8.S((userProfilePhoto2 == null || !userProfilePhoto2.personal) ? userFull.profile_photo : userFull.personal_photo);
                        if (videoSize != null) {
                            g61Var = new org.telegram.ui.Components.g61(videoSize, Z1.premium, 2);
                            org.telegram.messenger.ic C = this.n0.C(m14, m13);
                            if (this.H2 == null) {
                                this.n0.H(g61Var, m13, m14, z10);
                            }
                            if (this.I2 == null) {
                                if (videoSize != null) {
                                    this.e0.setImageDrawable(g61Var);
                                } else {
                                    if (m15 == null || Z1.photo.personal) {
                                        user = Z1;
                                        icVar6 = m14;
                                        jw0 jw0Var = this.e0;
                                        jw0Var.a.u0(C, "g", m13, "100_100", icVar6, "50_50", this.p0, 0L, null, user, 1);
                                        icVar5 = m13;
                                        jw0Var.d();
                                    } else {
                                        this.e0.getImageReceiver().y1 = true;
                                        jw0 jw0Var2 = this.e0;
                                        user = Z1;
                                        icVar6 = m14;
                                        jw0Var2.a.u0(m15, "avatar", m13, "50_50", icVar6, "50_50", this.p0, 0L, null, user, 1);
                                        jw0Var2.d();
                                        icVar5 = m13;
                                    }
                                    if ((icVar6 != null && this.N2 != -1) || (icVar6 == null && this.N2 == -1)) {
                                        C5(false, false);
                                        x4(true);
                                    }
                                    if (icVar5 != null || ((icVar7 = this.B0) != null && icVar5.s == icVar7.s)) {
                                        user2 = user;
                                    } else {
                                        this.B0 = icVar5;
                                        TLRPC.User user3 = user;
                                        getFileLoader().W(icVar5, user3, null, 0, 1);
                                        user2 = user3;
                                    }
                                    CharSequence p5 = org.telegram.messenger.h20.p(user2);
                                    if (user2.id == getUserConfig().e()) {
                                        long j10 = user2.id;
                                        if (j10 == 489000) {
                                            str5 = org.telegram.messenger.cd.L0(2131743642, null);
                                        } else if (j10 == 333000 || j10 == 777000 || j10 == 42777) {
                                            str5 = org.telegram.messenger.cd.L0(2131745578, null);
                                        } else if (org.telegram.messenger.vp.E2(user2)) {
                                            str5 = org.telegram.messenger.cd.L0(2131744351, null);
                                        } else if (this.q2) {
                                            int i11 = user2.bot_active_users;
                                            str5 = i11 != 0 ? org.telegram.messenger.cd.H(',', "BotUsers", i11) : org.telegram.messenger.h20.d(user2);
                                        } else {
                                            boolean[] zArr = this.J0;
                                            zArr[0] = false;
                                            String d02 = org.telegram.messenger.cd.d0(this.currentAccount, user2, zArr, z18 ? new boolean[1] : null);
                                            boolean z19 = (zArr[0] || getUserConfig().q() || (userStatus = user2.status) == null || (!(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) || !userStatus.by_me) ? false : true;
                                            lw0 lw0Var = this.r;
                                            z14 = z19;
                                            str = d02;
                                            if (lw0Var != null) {
                                                z14 = z19;
                                                str = d02;
                                                if (!this.Q5) {
                                                    int i12 = (zArr[0] && this.f6 == null) ? org.telegram.ui.ActionBar.t6.pi : org.telegram.ui.ActionBar.t6.B8;
                                                    lw0Var.setTag(Integer.valueOf(i12));
                                                    z14 = z19;
                                                    str = d02;
                                                    if (!this.o2) {
                                                        this.r.setTextColor(H3(org.telegram.ui.ActionBar.t6.w0(i12, this.z0), Boolean.valueOf(zArr[0])));
                                                        z14 = z19;
                                                        str = d02;
                                                    }
                                                }
                                            }
                                            TLRPC.UserProfilePhoto userProfilePhoto3 = user2.photo;
                                            this.q5 = userProfilePhoto3 == null && userProfilePhoto3.personal;
                                            p5 = org.telegram.messenger.k6.m(p5, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                            if (z11) {
                                                this.e0.setAnimateFromImageReceiver(((un) obj).o1.getAvatarImageView().getImageReceiver());
                                            }
                                            this.f.l(p5, false);
                                            i5Var = this.simpleActionBar;
                                            if (i5Var != null) {
                                                i5Var.setTitle(p5);
                                            }
                                            this.r.setDrawablePadding(org.telegram.messenger.i0.L(9.0f));
                                            this.r.setRightDrawableInside(true);
                                            lw0 lw0Var2 = this.r;
                                            if (z14) {
                                                if (this.x6 == null) {
                                                    iy0 iy0Var2 = new iy0(org.telegram.messenger.cd.L0(2131744908, null));
                                                    this.x6 = iy0Var2;
                                                    iy0Var2.setAlpha((int) (Math.min(1.0f, this.P1 / i4()) * 255.0f));
                                                    this.x6.a(i0.b.f(this.j2, org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.b(0.18f, -0.1f, this.b1)), 603979775));
                                                }
                                                iy0Var = this.x6;
                                            } else {
                                                iy0Var = null;
                                            }
                                            lw0Var2.i(iy0Var);
                                            this.r.setRightDrawableOnClick(z14 ? new iv0(this, 7) : null);
                                            if (this.C2 != null) {
                                                if (this.x == null) {
                                                    this.x = org.telegram.ui.ActionBar.t6.l4.getConstantState().newDrawable().mutate();
                                                }
                                                drawable = this.x;
                                            } else {
                                                drawable = null;
                                            }
                                            this.f.setRightDrawableOutside(false);
                                            z15 = user2.scam;
                                            if (!z15 || user2.fake) {
                                                kl klVar = this.f;
                                                int i13 = !z15 ? 1 : 0;
                                                if (this.K == null) {
                                                    org.telegram.ui.Components.kl0 kl0Var = new org.telegram.ui.Components.kl0(i13);
                                                    this.K = kl0Var;
                                                    kl0Var.b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h8, this.z0));
                                                }
                                                klVar.j(this.K);
                                                this.n = org.telegram.messenger.cd.L0(2131745879, null);
                                            } else if (user2.verified) {
                                                this.f.j(q4());
                                                this.n = org.telegram.messenger.cd.L0(2131754739, null);
                                            } else {
                                                this.f.j(null);
                                                this.n = null;
                                            }
                                            if (!org.telegram.messenger.vp.E2(user2) || org.telegram.messenger.o5.f(user2.emoji_status) == 0) {
                                                getMessagesController().getClass();
                                                if (org.telegram.messenger.vp.A2(user2)) {
                                                    this.f.i(h4(null, true));
                                                    this.h = org.telegram.messenger.cd.L0(2131754802, null);
                                                    z16 = true;
                                                    z17 = false;
                                                } else {
                                                    this.f.i(null);
                                                    this.h = null;
                                                    z16 = false;
                                                    z17 = false;
                                                }
                                            } else {
                                                this.f.i(h4(user2.emoji_status, true));
                                                this.h = org.telegram.messenger.cd.L0(2131754802, null);
                                                z17 = true;
                                                z16 = false;
                                            }
                                            if (drawable == null || this.C2 != null || user2.bot_verification_icon == 0) {
                                                this.f.setLeftDrawableOutside(false);
                                            } else {
                                                this.f.setLeftDrawableOutside(true);
                                                drawable = f4(user2.bot_verification_icon);
                                            }
                                            this.f.setLeftDrawable(drawable);
                                            if (!z17 || z16) {
                                                this.f.setRightDrawableOutside(true);
                                            }
                                            if (user2.self) {
                                                getMessagesController().getClass();
                                                if (org.telegram.messenger.vp.A2(user2)) {
                                                    this.f.setRightDrawableOnClick(new iv0(this, 8));
                                                }
                                            }
                                            if (!user2.self) {
                                                getMessagesController().getClass();
                                                if (org.telegram.messenger.vp.A2(user2)) {
                                                    kl klVar2 = this.f;
                                                    klVar2.setRightDrawableOnClick(new x(this, user2, klVar2, 14));
                                                }
                                            }
                                            if (this.d1 == org.telegram.messenger.d20.i(this.currentAccount).n) {
                                                if (this.p5) {
                                                    TLRPC.UserFull userFull2 = this.u2;
                                                    if (userFull2 == null || (tl_starsRating = userFull2.stars_rating) == null || tl_starsRating.stars >= 0) {
                                                        str3 = null;
                                                        str4 = org.telegram.messenger.cd.L0(2131747842, null);
                                                    } else {
                                                        str3 = null;
                                                        str4 = org.telegram.messenger.cd.L0(2131745191, null).toLowerCase(Locale.ROOT);
                                                    }
                                                } else {
                                                    str3 = null;
                                                    str4 = str;
                                                }
                                                this.r6 = org.telegram.messenger.cd.L0(2131750843, str3);
                                                str2 = str4;
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                                                spannableStringBuilder.append((CharSequence) " d ");
                                                TLRPC.UserProfilePhoto userProfilePhoto4 = user2.photo;
                                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0((userProfilePhoto4 != null && userProfilePhoto4.personal && userProfilePhoto4.has_video) ? 2131751688 : 2131751689, null));
                                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.qs(), str.length() + 1, str.length() + 2, 0);
                                                this.r6 = spannableStringBuilder;
                                                str2 = str;
                                            }
                                            this.q6 = str2;
                                            G5();
                                            ggVar = this.g5;
                                            if (ggVar != null) {
                                                ggVar.r();
                                            }
                                            this.e0.getImageReceiver().O0(PhotoViewer.S1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                                        }
                                    } else if (org.telegram.messenger.h20.q(this.u2)) {
                                        this.p5 = true;
                                        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(this.u2.fallback_photo.sizes, 1000, false, null, false);
                                        str5 = str6;
                                        if (w9 != null) {
                                            this.r5.p0(org.telegram.messenger.ic.i(w9, this.u2.fallback_photo), "50_50", null, 0L, null, org.telegram.messenger.d20.i(this.currentAccount).f(), 0);
                                            str5 = str6;
                                        }
                                    } else {
                                        TLRPC.UserFull userFull3 = this.u2;
                                        str5 = (userFull3 == null || (tl_starsRating2 = userFull3.stars_rating) == null || tl_starsRating2.stars >= 0) ? org.telegram.messenger.cd.L0(2131747842, null) : org.telegram.messenger.cd.L0(2131745191, null).toLowerCase(Locale.ROOT);
                                    }
                                    z14 = false;
                                    str = str5;
                                    TLRPC.UserProfilePhoto userProfilePhoto32 = user2.photo;
                                    this.q5 = userProfilePhoto32 == null && userProfilePhoto32.personal;
                                    p5 = org.telegram.messenger.k6.m(p5, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                    if (z11) {
                                    }
                                    this.f.l(p5, false);
                                    i5Var = this.simpleActionBar;
                                    if (i5Var != null) {
                                    }
                                    this.r.setDrawablePadding(org.telegram.messenger.i0.L(9.0f));
                                    this.r.setRightDrawableInside(true);
                                    lw0 lw0Var22 = this.r;
                                    if (z14) {
                                    }
                                    lw0Var22.i(iy0Var);
                                    this.r.setRightDrawableOnClick(z14 ? new iv0(this, 7) : null);
                                    if (this.C2 != null) {
                                    }
                                    this.f.setRightDrawableOutside(false);
                                    z15 = user2.scam;
                                    if (z15) {
                                    }
                                    kl klVar3 = this.f;
                                    int i132 = !z15 ? 1 : 0;
                                    if (this.K == null) {
                                    }
                                    klVar3.j(this.K);
                                    this.n = org.telegram.messenger.cd.L0(2131745879, null);
                                    if (org.telegram.messenger.vp.E2(user2)) {
                                    }
                                    getMessagesController().getClass();
                                    if (org.telegram.messenger.vp.A2(user2)) {
                                    }
                                    if (drawable == null) {
                                    }
                                    this.f.setLeftDrawableOutside(false);
                                    this.f.setLeftDrawable(drawable);
                                    if (!z17) {
                                    }
                                    this.f.setRightDrawableOutside(true);
                                    if (user2.self) {
                                    }
                                    if (!user2.self) {
                                    }
                                    if (this.d1 == org.telegram.messenger.d20.i(this.currentAccount).n) {
                                    }
                                    this.q6 = str2;
                                    G5();
                                    ggVar = this.g5;
                                    if (ggVar != null) {
                                    }
                                    this.e0.getImageReceiver().O0(PhotoViewer.S1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                                }
                            }
                            icVar5 = m13;
                            user = Z1;
                            icVar6 = m14;
                            if (icVar6 != null) {
                                C5(false, false);
                                x4(true);
                                if (icVar5 != null) {
                                }
                                user2 = user;
                                CharSequence p52 = org.telegram.messenger.h20.p(user2);
                                if (user2.id == getUserConfig().e()) {
                                }
                                z14 = false;
                                str = str5;
                                TLRPC.UserProfilePhoto userProfilePhoto322 = user2.photo;
                                this.q5 = userProfilePhoto322 == null && userProfilePhoto322.personal;
                                p52 = org.telegram.messenger.k6.m(p52, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                if (z11) {
                                }
                                this.f.l(p52, false);
                                i5Var = this.simpleActionBar;
                                if (i5Var != null) {
                                }
                                this.r.setDrawablePadding(org.telegram.messenger.i0.L(9.0f));
                                this.r.setRightDrawableInside(true);
                                lw0 lw0Var222 = this.r;
                                if (z14) {
                                }
                                lw0Var222.i(iy0Var);
                                this.r.setRightDrawableOnClick(z14 ? new iv0(this, 7) : null);
                                if (this.C2 != null) {
                                }
                                this.f.setRightDrawableOutside(false);
                                z15 = user2.scam;
                                if (z15) {
                                }
                                kl klVar32 = this.f;
                                int i1322 = !z15 ? 1 : 0;
                                if (this.K == null) {
                                }
                                klVar32.j(this.K);
                                this.n = org.telegram.messenger.cd.L0(2131745879, null);
                                if (org.telegram.messenger.vp.E2(user2)) {
                                }
                                getMessagesController().getClass();
                                if (org.telegram.messenger.vp.A2(user2)) {
                                }
                                if (drawable == null) {
                                }
                                this.f.setLeftDrawableOutside(false);
                                this.f.setLeftDrawable(drawable);
                                if (!z17) {
                                }
                                this.f.setRightDrawableOutside(true);
                                if (user2.self) {
                                }
                                if (!user2.self) {
                                }
                                if (this.d1 == org.telegram.messenger.d20.i(this.currentAccount).n) {
                                }
                                this.q6 = str2;
                                G5();
                                ggVar = this.g5;
                                if (ggVar != null) {
                                }
                                this.e0.getImageReceiver().O0(PhotoViewer.S1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                            }
                            C5(false, false);
                            x4(true);
                            if (icVar5 != null) {
                            }
                            user2 = user;
                            CharSequence p522 = org.telegram.messenger.h20.p(user2);
                            if (user2.id == getUserConfig().e()) {
                            }
                            z14 = false;
                            str = str5;
                            TLRPC.UserProfilePhoto userProfilePhoto3222 = user2.photo;
                            this.q5 = userProfilePhoto3222 == null && userProfilePhoto3222.personal;
                            p522 = org.telegram.messenger.k6.m(p522, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                            if (z11) {
                            }
                            this.f.l(p522, false);
                            i5Var = this.simpleActionBar;
                            if (i5Var != null) {
                            }
                            this.r.setDrawablePadding(org.telegram.messenger.i0.L(9.0f));
                            this.r.setRightDrawableInside(true);
                            lw0 lw0Var2222 = this.r;
                            if (z14) {
                            }
                            lw0Var2222.i(iy0Var);
                            this.r.setRightDrawableOnClick(z14 ? new iv0(this, 7) : null);
                            if (this.C2 != null) {
                            }
                            this.f.setRightDrawableOutside(false);
                            z15 = user2.scam;
                            if (z15) {
                            }
                            kl klVar322 = this.f;
                            int i13222 = !z15 ? 1 : 0;
                            if (this.K == null) {
                            }
                            klVar322.j(this.K);
                            this.n = org.telegram.messenger.cd.L0(2131745879, null);
                            if (org.telegram.messenger.vp.E2(user2)) {
                            }
                            getMessagesController().getClass();
                            if (org.telegram.messenger.vp.A2(user2)) {
                            }
                            if (drawable == null) {
                            }
                            this.f.setLeftDrawableOutside(false);
                            this.f.setLeftDrawable(drawable);
                            if (!z17) {
                            }
                            this.f.setRightDrawableOutside(true);
                            if (user2.self) {
                            }
                            if (!user2.self) {
                            }
                            if (this.d1 == org.telegram.messenger.d20.i(this.currentAccount).n) {
                            }
                            this.q6 = str2;
                            G5();
                            ggVar = this.g5;
                            if (ggVar != null) {
                            }
                            this.e0.getImageReceiver().O0(PhotoViewer.S1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                        }
                    } else {
                        videoSize = null;
                    }
                    g61Var = null;
                    org.telegram.messenger.ic C2 = this.n0.C(m14, m13);
                    if (this.H2 == null) {
                    }
                    if (this.I2 == null) {
                    }
                    icVar5 = m13;
                    user = Z1;
                    icVar6 = m14;
                    if (icVar6 != null) {
                    }
                    C5(false, false);
                    x4(true);
                    if (icVar5 != null) {
                    }
                    user2 = user;
                    CharSequence p5222 = org.telegram.messenger.h20.p(user2);
                    if (user2.id == getUserConfig().e()) {
                    }
                    z14 = false;
                    str = str5;
                    TLRPC.UserProfilePhoto userProfilePhoto32222 = user2.photo;
                    this.q5 = userProfilePhoto32222 == null && userProfilePhoto32222.personal;
                    p5222 = org.telegram.messenger.k6.m(p5222, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                    if (z11) {
                    }
                    this.f.l(p5222, false);
                    i5Var = this.simpleActionBar;
                    if (i5Var != null) {
                    }
                    this.r.setDrawablePadding(org.telegram.messenger.i0.L(9.0f));
                    this.r.setRightDrawableInside(true);
                    lw0 lw0Var22222 = this.r;
                    if (z14) {
                    }
                    lw0Var22222.i(iy0Var);
                    this.r.setRightDrawableOnClick(z14 ? new iv0(this, 7) : null);
                    if (this.C2 != null) {
                    }
                    this.f.setRightDrawableOutside(false);
                    z15 = user2.scam;
                    if (z15) {
                    }
                    kl klVar3222 = this.f;
                    int i132222 = !z15 ? 1 : 0;
                    if (this.K == null) {
                    }
                    klVar3222.j(this.K);
                    this.n = org.telegram.messenger.cd.L0(2131745879, null);
                    if (org.telegram.messenger.vp.E2(user2)) {
                    }
                    getMessagesController().getClass();
                    if (org.telegram.messenger.vp.A2(user2)) {
                    }
                    if (drawable == null) {
                    }
                    this.f.setLeftDrawableOutside(false);
                    this.f.setLeftDrawable(drawable);
                    if (!z17) {
                    }
                    this.f.setRightDrawableOutside(true);
                    if (user2.self) {
                    }
                    if (!user2.self) {
                    }
                    if (this.d1 == org.telegram.messenger.d20.i(this.currentAccount).n) {
                    }
                    this.q6 = str2;
                    G5();
                    ggVar = this.g5;
                    if (ggVar != null) {
                    }
                    this.e0.getImageReceiver().O0(PhotoViewer.S1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                } else if (this.e1 != 0) {
                    TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.e1));
                    if (L0 != null) {
                        this.D2 = L0;
                    } else {
                        L0 = this.D2;
                    }
                    TLRPC.Chat chat2 = L0;
                    org.telegram.messenger.o6 o6Var = this.W1;
                    if (o6Var != null) {
                        o6Var.g();
                    }
                    org.telegram.messenger.kp kpVar2 = this.f6;
                    org.telegram.messenger.kp a10 = org.telegram.messenger.kp.a(chat2.emoji_status);
                    this.f6 = a10;
                    if (a10 == null) {
                        int I = org.telegram.messenger.w3.I(chat2);
                        org.telegram.messenger.lp lpVar2 = org.telegram.messenger.vp.r1(this.currentAccount).s4;
                        this.f6 = lpVar2 == null ? null : lpVar2.d(I);
                    }
                    if (kpVar2 != this.f6) {
                        O5();
                    }
                    ky0 ky0Var2 = this.c1;
                    if (ky0Var2 != null) {
                        ky0Var2.b(org.telegram.messenger.w3.J(chat2), chat2.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    TLRPC.EmojiStatus emojiStatus2 = chat2.emoji_status;
                    a5(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null);
                    TLRPC.TL_forumTopic f7 = this.p1 ? getMessagesController().r7.f(this.e1, this.f1) : null;
                    if (org.telegram.messenger.w3.T(chat2)) {
                        if (!this.p1) {
                            TLRPC.ChatFull chatFull = this.t2;
                            if (chatFull != null) {
                                TLRPC.Chat chat3 = this.D2;
                                if (!chat3.megagroup) {
                                    if (chatFull.participants_count != 0) {
                                        if (!org.telegram.messenger.w3.N(chat3)) {
                                        }
                                    }
                                }
                            }
                            G = this.D2.megagroup ? org.telegram.messenger.cd.L0(2131748789, null).toLowerCase() : org.telegram.messenger.w3.t0(chat2) ? org.telegram.messenger.cd.L0(2131752318, null).toLowerCase() : org.telegram.messenger.cd.L0(2131752329, null).toLowerCase();
                        }
                        if (this.p1) {
                            int i14 = f7 != null ? f7.totalMessagesCount - 1 : 0;
                            if (i14 > 0) {
                                org.telegram.messenger.cd.G(i14, "messages", Integer.valueOf(i14));
                            } else {
                                org.telegram.messenger.cd.a0("TopicProfileStatus", null, 2131744035, chat2.title);
                            }
                            SpannableString spannableString = new SpannableString(">");
                            spannableString.setSpan(new org.telegram.ui.Components.dq(R.drawable.arrow_newchat, 0), 0, 1, 33);
                            G = new SpannableStringBuilder(chat2.title).append(' ').append((CharSequence) spannableString);
                            z12 = true;
                            if (z11) {
                                un unVar2 = (un) obj;
                                if (unVar2.o1.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.u5) {
                                    ((org.telegram.ui.ActionBar.u5) unVar2.o1.getSubtitleTextView()).getText();
                                } else if (unVar2.o1.getSubtitleTextView() instanceof org.telegram.ui.Components.f6) {
                                    ((org.telegram.ui.Components.f6) unVar2.o1.getSubtitleTextView()).getText();
                                }
                                this.e0.setAnimateFromImageReceiver(unVar2.o1.getAvatarImageView().getImageReceiver());
                            }
                            charSequence = str6;
                            if (this.p1) {
                                if (org.telegram.messenger.w3.p0(chat2)) {
                                    charSequence = org.telegram.messenger.cd.L0(2131752219, null);
                                } else {
                                    String str7 = chat2.title;
                                    charSequence = str7;
                                    if (str7 == null) {
                                        charSequence = null;
                                    }
                                }
                            } else if (f7 != null) {
                                charSequence = f7.title;
                            }
                            if (charSequence == null) {
                                try {
                                    charSequence = org.telegram.messenger.k6.m(charSequence, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                } catch (Exception unused) {
                                }
                                l4 = this.f.l(charSequence, false);
                                org.telegram.ui.ActionBar.i5 i5Var2 = this.simpleActionBar;
                                if (i5Var2 != null) {
                                    i5Var2.setTitle(charSequence);
                                }
                            } else {
                                l4 = false;
                            }
                            this.f.setLeftDrawableOutside(false);
                            this.f.setLeftDrawable((Drawable) null);
                            this.f.setRightDrawableOutside(false);
                            this.f.setRightDrawableOnClick(null);
                            this.n = null;
                            z13 = chat2.scam;
                            if (!z13 || chat2.fake) {
                                kl klVar4 = this.f;
                                int i15 = !z13 ? 1 : 0;
                                if (this.K == null) {
                                    org.telegram.ui.Components.kl0 kl0Var2 = new org.telegram.ui.Components.kl0(i15);
                                    this.K = kl0Var2;
                                    kl0Var2.b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h8, this.z0));
                                }
                                klVar4.j(this.K);
                                this.h = org.telegram.messenger.cd.L0(2131745879, null);
                            } else if (chat2.verified) {
                                this.f.j(q4());
                                this.h = org.telegram.messenger.cd.L0(2131754739, null);
                            } else {
                                this.f.j(null);
                                this.h = null;
                            }
                            if (org.telegram.messenger.o5.f(chat2.emoji_status) == 0) {
                                this.f.i(h4(chat2.emoji_status, false));
                                this.f.setRightDrawableOutside(true);
                                this.h = null;
                                if (org.telegram.messenger.w3.w(1, chat2)) {
                                    this.f.setRightDrawableOnClick(new iv0(this, 9));
                                    if (this.R) {
                                        this.R = true;
                                        getMediaDataController().Y0();
                                    }
                                } else {
                                    TLRPC.EmojiStatus emojiStatus3 = chat2.emoji_status;
                                    if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                                        this.f.setRightDrawableOnClick(new sv0(this, ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug, r8 ? 1 : 0));
                                    }
                                }
                            } else {
                                this.f.i(null);
                            }
                            if (chat2.bot_verification_icon == 0) {
                                this.f.setLeftDrawableOutside(true);
                                this.f.setLeftDrawable(f4(chat2.bot_verification_icon));
                            } else {
                                this.f.setLeftDrawable((Drawable) null);
                            }
                            if (org.telegram.messenger.w3.d0(this.currentAccount, this.h1)) {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) "* ");
                                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.dq(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
                                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.cd.L0(2131751926, null));
                                spannableStringBuilder2.append((CharSequence) " * ");
                                int length = spannableStringBuilder2.length();
                                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.qs(), length - 2, length - 1, 33);
                                spannableStringBuilder2.append(G);
                                G = spannableStringBuilder2;
                            }
                            this.q6 = G;
                            this.r6 = null;
                            G5();
                            if (this.p1) {
                                if (z12) {
                                    this.r.setOnClickListener(new iv0(this, 10));
                                } else {
                                    this.r.setOnClickListener(null);
                                    this.r.setClickable(false);
                                }
                            }
                            if (l4) {
                                x4(true);
                            }
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            TLRPC.FileLocation fileLocation2 = (chatPhoto != null || this.p1) ? null : chatPhoto.photo_big;
                            if (this.p1) {
                                if (org.telegram.messenger.w3.p0(this.D2)) {
                                    TLRPC.Chat u12 = getMessagesController().u1(this.D2.id);
                                    this.p0.q(u12);
                                    m10 = org.telegram.messenger.ic.m(this.currentAccount, 0, u12);
                                    m11 = org.telegram.messenger.ic.m(this.currentAccount, 1, u12);
                                    icVar2 = this.n0.C(m11, m10);
                                } else {
                                    this.p0.q(chat2);
                                    m10 = org.telegram.messenger.ic.m(this.currentAccount, 0, chat2);
                                    m11 = org.telegram.messenger.ic.m(this.currentAccount, 1, chat2);
                                    kw0 kw0Var = this.n0;
                                    if (kw0Var != null) {
                                        icVar2 = kw0Var.C(m11, m10);
                                    } else {
                                        icVar = m10;
                                        icVar2 = null;
                                        icVar3 = m11;
                                    }
                                }
                                icVar = m10;
                                icVar3 = m11;
                            } else {
                                gg.e.p(this.e0, f7, true, true, this.z0);
                                icVar2 = null;
                                icVar = null;
                                icVar3 = null;
                            }
                            boolean H = this.n0.H(null, icVar, icVar3, z10);
                            if ((icVar != null || H) && this.o2 && (m12 = this.c.m(0)) != null) {
                                this.a.w0(0, m12.getTop() - i4(), org.telegram.ui.Components.gr.h);
                            }
                            String str8 = (icVar2 == null && icVar2.p == 2) ? "g" : null;
                            if (this.I2 == null || this.p1) {
                                chat = chat2;
                            } else {
                                chat = chat2;
                                this.e0.m(icVar2, str8, icVar3, "50_50", this.p0, chat);
                            }
                            if (icVar != null && ((icVar4 = this.B0) == null || icVar.s != icVar4.s)) {
                                this.B0 = icVar;
                                getFileLoader().W(icVar, chat, null, 0, 1);
                            }
                            this.e0.getImageReceiver().O0(PhotoViewer.S1(fileLocation2) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                        } else if (!this.D2.megagroup) {
                            org.telegram.messenger.cd.S(new int[1], this.t2.participants_count);
                            if (this.D2.megagroup) {
                                org.telegram.messenger.cd.G(this.t2.participants_count, "Members", new Object[0]);
                                G = org.telegram.messenger.cd.H(',', "Members", this.t2.participants_count);
                            } else {
                                org.telegram.messenger.cd.G(this.t2.participants_count, "Subscribers", new Object[0]);
                                G = org.telegram.messenger.cd.H(',', "Subscribers", this.t2.participants_count);
                            }
                        } else if (this.A2 <= 1 || (i10 = this.t2.participants_count) == 0) {
                            int i16 = this.t2.participants_count;
                            if (i16 == 0) {
                                G = chat2.has_geo ? org.telegram.messenger.cd.L0(2131748657, null).toLowerCase() : org.telegram.messenger.w3.t0(chat2) ? org.telegram.messenger.cd.L0(2131748653, null).toLowerCase() : org.telegram.messenger.cd.L0(2131748656, null).toLowerCase();
                            } else {
                                org.telegram.messenger.cd.G(i16, "Members", new Object[0]);
                                G = org.telegram.messenger.cd.H(',', "Members", this.t2.participants_count);
                            }
                        } else {
                            org.telegram.messenger.cd.G(i10, "Members", new Object[0]);
                            org.telegram.messenger.cd.G(Math.min(this.A2, this.t2.participants_count), "OnlineCount", new Object[0]);
                            G = a1.g.C(org.telegram.messenger.cd.H(',', "Members", this.t2.participants_count), ", ", org.telegram.messenger.cd.H(',', "OnlineCount", Math.min(this.A2, this.t2.participants_count)));
                        }
                    } else if (org.telegram.messenger.w3.k0(chat2)) {
                        G = org.telegram.messenger.cd.L0(2131742854, null);
                    } else if (org.telegram.messenger.w3.l0(chat2)) {
                        G = org.telegram.messenger.cd.L0(2131742860, null);
                    } else {
                        int i17 = chat2.participants_count;
                        TLRPC.ChatFull chatFull2 = this.t2;
                        if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                            i17 = chatParticipants.participants.size();
                        }
                        G = (i17 == 0 || this.A2 <= 1) ? org.telegram.messenger.cd.G(i17, "Members", new Object[0]) : a1.g.C(org.telegram.messenger.cd.G(i17, "Members", new Object[0]), ", ", org.telegram.messenger.cd.G(this.A2, "OnlineCount", new Object[0]));
                    }
                    z12 = false;
                    if (z11) {
                    }
                    charSequence = str6;
                    if (this.p1) {
                    }
                    if (charSequence == null) {
                    }
                    this.f.setLeftDrawableOutside(false);
                    this.f.setLeftDrawable((Drawable) null);
                    this.f.setRightDrawableOutside(false);
                    this.f.setRightDrawableOnClick(null);
                    this.n = null;
                    z13 = chat2.scam;
                    if (z13) {
                    }
                    kl klVar42 = this.f;
                    int i152 = !z13 ? 1 : 0;
                    if (this.K == null) {
                    }
                    klVar42.j(this.K);
                    this.h = org.telegram.messenger.cd.L0(2131745879, null);
                    if (org.telegram.messenger.o5.f(chat2.emoji_status) == 0) {
                    }
                    if (chat2.bot_verification_icon == 0) {
                    }
                    if (org.telegram.messenger.w3.d0(this.currentAccount, this.h1)) {
                    }
                    this.q6 = G;
                    this.r6 = null;
                    G5();
                    if (this.p1) {
                    }
                    if (l4) {
                    }
                    TLRPC.ChatPhoto chatPhoto2 = chat2.photo;
                    if (chatPhoto2 != null) {
                    }
                    if (this.p1) {
                    }
                    boolean H2 = this.n0.H(null, icVar, icVar3, z10);
                    if (icVar != null) {
                    }
                    this.a.w0(0, m12.getTop() - i4(), org.telegram.ui.Components.gr.h);
                    if (icVar2 == null) {
                    }
                    if (this.I2 == null) {
                    }
                    chat = chat2;
                    if (icVar != null) {
                        this.B0 = icVar;
                        getFileLoader().W(icVar, chat, null, 0, 1);
                    }
                    this.e0.getImageReceiver().O0(PhotoViewer.S1(fileLocation2) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                }
                x4(true);
            }
        }
        z11 = false;
        this.p5 = false;
        this.q5 = false;
        String str62 = "";
        if (this.d1 == 0) {
        }
        x4(true);
    }

    @Override // org.telegram.ui.Components.ms0
    public final void I() {
        T4(false);
    }

    public final void I3() {
        int f7;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar == null || this.f == null || this.c1 == null || this.S0 == null || this.P0 == null || this.Q0 == null || this.R0 == null || this.o0 == null) {
            return;
        }
        Float valueOf = Float.valueOf(this.P5);
        pw0 pw0Var = this.R5;
        pw0Var.getClass();
        pw0Var.a(lVar, valueOf);
        if (this.P5 > 0.0f || this.j2 <= 0.0f) {
            return;
        }
        kl klVar = this.f;
        int i10 = -1;
        if (this.f6 != null) {
            f7 = -1;
        } else {
            f7 = i0.b.f(this.j2, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ji, this.z0), -1);
        }
        klVar.setTextColor(f7);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        if (this.f6 == null) {
            i10 = i0.b.f(this.j2, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v8, this.z0), -1);
        }
        lVar2.D(i10, false);
    }

    public final void I4() {
        Bundle g10 = a1.g.g("addToGroup", true);
        g10.putLong("chatId", this.D2.id);
        v50 v50Var = new v50(g10);
        TLRPC.ChatFull chatFull = this.t2;
        v50Var.I = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i10 = 0; i10 < this.t2.participants.participants.size(); i10++) {
                hVar.k(null, this.t2.participants.participants.get(i10).user_id);
            }
            v50Var.J = hVar;
        }
        v50Var.y = new bv0(this, 0);
        presentFragment(v50Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0200, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationToBeDeprecated) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0b39, code lost:
    
        if ((i4() + (r2 + r3)) < r18.a.getMeasuredHeight()) goto L671;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0171, code lost:
    
        if (r10.b.isEmpty() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0192, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0190, code lost:
    
        if (r10.b.isEmpty() == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0b4a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0b52  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0af4  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I5() {
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatParticipants chatParticipants2;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull4;
        int i10;
        bw0 bw0Var;
        org.telegram.ui.Components.hg0 hg0Var;
        org.telegram.ui.Components.bh0 bh0Var;
        int i11;
        long j10;
        boolean z11;
        TLRPC.UserFull userFull;
        boolean z12;
        TLRPC.UserFull userFull2;
        TL_payments.starRefProgram starrefprogram;
        org.telegram.ui.Cells.i6 i6Var;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull5;
        TLRPC.UserFull userFull4;
        TLRPC.ChatFull chatFull6;
        TLRPC.UserFull userFull5;
        TL_bots.BotInfo botInfo;
        TLRPC.UserFull userFull6;
        TLRPC.UserFull userFull7;
        E5(false);
        int i12 = this.M2;
        this.M2 = 0;
        this.N2 = -1;
        this.O2 = -1;
        this.R2 = -1;
        this.S2 = -1;
        this.T2 = -1;
        this.U2 = -1;
        this.V2 = -1;
        this.P2 = -1;
        this.Q2 = -1;
        this.W2 = -1;
        this.Z2 = -1;
        this.a3 = -1;
        this.X2 = -1;
        this.Y2 = -1;
        this.b3 = -1;
        this.c3 = -1;
        this.d3 = -1;
        this.e3 = -1;
        this.f3 = -1;
        this.b4 = -1;
        this.c4 = -1;
        this.d4 = -1;
        this.e4 = -1;
        this.f4 = -1;
        this.g4 = -1;
        this.g3 = -1;
        this.h3 = -1;
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
        this.h4 = -1;
        this.m4 = -1;
        this.botPermissionBiometry = -1;
        this.botPermissionEmojiStatus = -1;
        this.botPermissionLocation = -1;
        this.o4 = -1;
        this.i4 = -1;
        this.j4 = -1;
        this.k4 = -1;
        this.l4 = -1;
        this.T3 = -1;
        this.U3 = -1;
        this.W3 = -1;
        this.V3 = -1;
        this.Y3 = -1;
        this.z3 = -1;
        this.A3 = -1;
        this.C3 = -1;
        this.D3 = -1;
        this.E3 = -1;
        this.F3 = -1;
        this.G3 = -1;
        this.I3 = -1;
        this.H3 = -1;
        this.J3 = -1;
        this.K3 = -1;
        this.p4 = -1;
        this.q4 = -1;
        this.L3 = -1;
        this.X3 = -1;
        this.M3 = -1;
        this.O3 = -1;
        this.N3 = -1;
        this.Q3 = -1;
        this.R3 = -1;
        this.S3 = -1;
        this.r4 = -1;
        this.B3 = -1;
        this.Z3 = -1;
        this.a4 = -1;
        this.s4 = -1;
        this.t4 = -1;
        this.u4 = -1;
        this.v4 = -1;
        this.w4 = -1;
        this.x4 = -1;
        this.y4 = -1;
        this.F4 = -1;
        this.G4 = -1;
        this.D4 = -1;
        this.J4 = -1;
        this.P3 = -1;
        this.z4 = -1;
        this.A4 = -1;
        this.B4 = -1;
        this.C4 = -1;
        this.E4 = -1;
        this.H4 = false;
        boolean z13 = true;
        this.I4 = (this.d1 == 0 || (userFull7 = this.u2) == null || userFull7.wallet_card == null || (this.q0 != null && !this.r1)) ? false : true;
        this.K4 = -1;
        this.L4 = -1;
        this.M4 = -1;
        ArrayList arrayList2 = this.Q4;
        arrayList2.clear();
        ArrayList arrayList3 = this.R4;
        arrayList3.clear();
        org.telegram.ui.Components.rt0 rt0Var = this.Q;
        if (rt0Var != null) {
            int[] iArr = rt0Var.c;
            int i13 = 0;
            while (true) {
                if (i13 >= iArr.length) {
                    z10 = false;
                    break;
                } else {
                    if (iArr[i13] > 0) {
                        z10 = true;
                        break;
                    }
                    i13++;
                }
            }
            if (!z10) {
                z10 = this.Q.f;
            }
            if (!z10) {
                this.Q.getClass();
            }
            if (!z10 && (userFull6 = this.u2) != null) {
                z10 = userFull6.stories_pinned_available;
            }
            if (!z10 && (userFull5 = this.u2) != null && (botInfo = userFull5.bot_info) != null) {
                z10 = botInfo.has_preview_medias;
            }
            if (!z10 && (((userFull4 = this.u2) != null && userFull4.stargifts_count > 0) || ((chatFull6 = this.t2) != null && chatFull6.stargifts_count > 0))) {
                z10 = true;
            }
            if (!z10 && (chatFull5 = this.t2) != null) {
                z10 = chatFull5.stories_pinned_available;
            }
            if (!z10) {
                long j11 = this.e1;
                if (j11 != 0) {
                    org.telegram.messenger.wo K0 = org.telegram.messenger.vp.r1(this.currentAccount).K0(-j11);
                    if (K0 != null) {
                    }
                }
                if (this.q2) {
                    long j12 = this.d1;
                    if (j12 != 0) {
                        org.telegram.messenger.wo K02 = org.telegram.messenger.vp.r1(this.currentAccount).K0(j12);
                        if (K02 != null) {
                        }
                    }
                }
            }
            if (this.d1 == 0) {
                TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.d1));
                TLRPC.UserFull userFull8 = this.u2;
                if (userFull8 != null && userFull8.saved_music != null && (this.q0 == null || this.r1)) {
                    this.H4 = true;
                }
                if (this.z3 < 0 && this.A3 < 0) {
                    if (this.H4 || this.I4 || this.f6 != null || this.Z == null) {
                        int i14 = this.M2;
                        this.M2 = i14 + 1;
                        this.A3 = i14;
                    } else {
                        int i15 = this.M2;
                        this.M2 = i15 + 1;
                        this.z3 = i15;
                    }
                }
                if (!org.telegram.messenger.h20.B(Z1) || this.r1) {
                    String n10 = org.telegram.messenger.h20.n(Z1);
                    TLRPC.UserFull userFull9 = this.u2;
                    boolean z14 = ((userFull9 == null || TextUtils.isEmpty(userFull9.about)) && (Z1 == null || TextUtils.isEmpty(n10))) ? false : true;
                    boolean z15 = (Z1 == null || (TextUtils.isEmpty(Z1.phone) && TextUtils.isEmpty(this.d5))) ? false : true;
                    if (!this.q2 && (userFull3 = this.u2) != null && userFull3.unofficial_security_risk) {
                        int i16 = this.M2;
                        this.i4 = i16;
                        this.M2 = i16 + 2;
                        this.j4 = i16 + 1;
                    }
                    TLRPC.UserFull userFull10 = this.u2;
                    if (userFull10 == null || (userFull10.flags2 & 64) == 0 || ((i6Var = this.v2) != null && i6Var.c && i6Var.d.isEmpty())) {
                        j10 = 0;
                    } else {
                        j10 = 0;
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.u2.personal_channel_id));
                        if (L0 != null && (org.telegram.messenger.w3.t0(L0) || !org.telegram.messenger.w3.r0(L0))) {
                            int i17 = this.M2;
                            this.P2 = i17;
                            this.M2 = i17 + 2;
                            this.Q2 = i17 + 1;
                        }
                    }
                    if (!this.q2 && (z15 || !z14)) {
                        int i18 = this.M2;
                        this.M2 = i18 + 1;
                        this.F3 = i18;
                    }
                    TLRPC.UserFull userFull11 = this.u2;
                    if (userFull11 != null && !TextUtils.isEmpty(userFull11.about)) {
                        int i19 = this.M2;
                        this.M2 = i19 + 1;
                        this.I3 = i19;
                    }
                    if (Z1 != null && n10 != null) {
                        int i20 = this.M2;
                        this.M2 = i20 + 1;
                        this.K3 = i20;
                    }
                    TLRPC.UserFull userFull12 = this.u2;
                    if (userFull12 != null) {
                        if (userFull12.birthday != null) {
                            int i21 = this.M2;
                            this.M2 = i21 + 1;
                            this.T2 = i21;
                        }
                        if (userFull12.business_work_hours != null) {
                            int i22 = this.M2;
                            this.M2 = i22 + 1;
                            this.N3 = i22;
                        }
                        if (userFull12.business_location != null) {
                            int i23 = this.M2;
                            this.M2 = i23 + 1;
                            this.O3 = i23;
                        }
                        if (userFull12.note != null) {
                            int i24 = this.M2;
                            this.M2 = i24 + 1;
                            this.G3 = i24;
                        }
                    }
                    if (this.Z == null && this.d1 != getUserConfig().e()) {
                        int i25 = this.M2;
                        this.M2 = i25 + 1;
                        this.M3 = i25;
                    }
                    boolean z16 = this.q2;
                    if (z16 && Z1 != null && Z1.bot_has_main_app) {
                        int i26 = this.M2;
                        this.M2 = i26 + 1;
                        this.h4 = i26;
                    }
                    int i27 = this.M2;
                    int i28 = i27 + 1;
                    this.M2 = i28;
                    this.Q3 = i27;
                    if (Z1 != null && Z1.linked_community_id != j10) {
                        this.k4 = i28;
                        this.M2 = i27 + 3;
                        this.l4 = i27 + 2;
                    }
                    if (z16 && (userFull2 = this.u2) != null && (starrefprogram = userFull2.starref_program) != null && (starrefprogram.flags & 2) == 0 && getMessagesController().h6) {
                        int i29 = this.M2;
                        this.R3 = i29;
                        this.M2 = i29 + 2;
                        this.S3 = i29 + 1;
                    }
                    if (this.q2) {
                        if (this.r2 == null && getContext() != null) {
                            this.r2 = xh.o0.e(getContext(), this.currentAccount, this.d1);
                        }
                        if (this.s2 == null && getContext() != null) {
                            this.s2 = xh.n.c(getContext(), this.currentAccount, this.d1);
                        }
                        xh.o0 o0Var = this.r2;
                        boolean z17 = o0Var != null && o0Var.b();
                        xh.n nVar = this.s2;
                        boolean z18 = nVar != null && nVar.a();
                        TLRPC.UserFull userFull13 = this.u2;
                        if (userFull13 == null || !userFull13.bot_can_manage_emoji_status) {
                            if (!xh.q3.d((Activity) getContext(), this.currentAccount, this.d1)) {
                                z12 = false;
                                if (!z12 || z17 || z18) {
                                    int i30 = this.M2;
                                    int i31 = i30 + 1;
                                    this.M2 = i31;
                                    this.m4 = i30;
                                    if (z12) {
                                        this.M2 = i30 + 2;
                                        this.botPermissionEmojiStatus = i31;
                                    }
                                    if (z17) {
                                        int i32 = this.M2;
                                        this.M2 = i32 + 1;
                                        this.botPermissionLocation = i32;
                                    }
                                    if (z18) {
                                        int i33 = this.M2;
                                        this.M2 = i33 + 1;
                                        this.botPermissionBiometry = i33;
                                    }
                                    int i34 = this.M2;
                                    this.M2 = i34 + 1;
                                    this.o4 = i34;
                                }
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        int i302 = this.M2;
                        int i312 = i302 + 1;
                        this.M2 = i312;
                        this.m4 = i302;
                        if (z12) {
                        }
                        if (z17) {
                        }
                        if (z18) {
                        }
                        int i342 = this.M2;
                        this.M2 = i342 + 1;
                        this.o4 = i342;
                    }
                    TLRPC.EncryptedChat encryptedChat = this.C2;
                    if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                        int i35 = this.M2;
                        this.p4 = i35;
                        this.q4 = i35 + 1;
                        this.M2 = i35 + 3;
                        this.r4 = i35 + 2;
                    }
                    if (Z1 != null && !this.q2 && encryptedChat == null && Z1.id != getUserConfig().e() && this.j1) {
                        int i36 = this.M2;
                        this.K4 = i36;
                        this.M2 = i36 + 2;
                        this.M4 = i36 + 1;
                    }
                    if (Z1 != null && Z1.bot) {
                        TLRPC.UserFull userFull14 = this.u2;
                        if (userFull14 != null && userFull14.can_view_revenue && rh.r.g(this.currentAccount).i(this.d1) > j10) {
                            int i37 = this.M2;
                            this.M2 = i37 + 1;
                            this.B4 = i37;
                        }
                        if (rh.r.g(this.currentAccount).c(this.d1).amount > j10 || !rh.r.g(this.currentAccount).k(this.d1).a[0].isEmpty()) {
                            int i38 = this.M2;
                            this.M2 = i38 + 1;
                            this.A4 = i38;
                        }
                    }
                    if (Z1 != null && this.q2 && !Z1.bot_nochats) {
                        int i39 = this.M2;
                        this.Z3 = i39;
                        this.M2 = i39 + 2;
                        this.a4 = i39 + 1;
                    } else if (this.A4 >= 0) {
                        z11 = true;
                        if (!this.r1 && this.c5 && Z1 != null && !Z1.contact && !Z1.bot && !org.telegram.messenger.h20.A(Z1.id)) {
                            int i40 = this.M2;
                            this.M2 = i40 + 1;
                            this.Y3 = i40;
                            z11 = true;
                        }
                        if (!this.r1 && this.Z4 != 0 && this.a5 < j10 && org.telegram.messenger.w3.y(13, getMessagesController().L0(Long.valueOf(-this.a5)))) {
                            int i41 = this.M2;
                            this.M2 = i41 + 1;
                            this.V3 = i41;
                            z11 = true;
                        }
                        if (!this.r1 || this.Z4 == 0 || org.telegram.messenger.i5.r(this.currentAccount).x(this.d1)) {
                            z13 = z11;
                        } else {
                            int i42 = this.M2;
                            this.M2 = i42 + 1;
                            this.W3 = i42;
                        }
                        if (z13) {
                            int i43 = this.M2;
                            this.M2 = i43 + 1;
                            this.X3 = i43;
                        }
                        if (!z10 || ((Z1 != null && Z1.bot && Z1.bot_can_edit && Z1.bot_has_main_app) || (!((userFull = this.u2) == null || userFull.common_chats_count == 0) || this.r1))) {
                            int i44 = this.M2;
                            this.M2 = i44 + 1;
                            this.J4 = i44;
                        } else if (this.M4 == -1 && this.n1) {
                            int i45 = this.M2;
                            this.T3 = i45;
                            this.M2 = i45 + 2;
                            this.M4 = i45 + 1;
                        }
                    }
                    z11 = false;
                    if (!this.r1) {
                        int i402 = this.M2;
                        this.M2 = i402 + 1;
                        this.Y3 = i402;
                        z11 = true;
                    }
                    if (!this.r1) {
                        int i412 = this.M2;
                        this.M2 = i412 + 1;
                        this.V3 = i412;
                        z11 = true;
                    }
                    if (this.r1) {
                    }
                    z13 = z11;
                    if (z13) {
                    }
                    if (z10) {
                    }
                    int i442 = this.M2;
                    this.M2 = i442 + 1;
                    this.J4 = i442;
                } else {
                    if (this.I2 == null) {
                        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                        if (userProfilePhoto != null) {
                            TLRPC.FileLocation fileLocation = userProfilePhoto.photo_big;
                            if (!(fileLocation instanceof TLRPC.TL_fileLocation_layer97)) {
                            }
                        }
                        kw0 kw0Var = this.n0;
                        if (kw0Var == null || kw0Var.getRealCount() == 0) {
                            int i46 = this.M2;
                            this.N2 = i46;
                            this.M2 = i46 + 2;
                            this.O2 = i46 + 1;
                        }
                    }
                    int i47 = this.M2;
                    this.R2 = i47;
                    this.S2 = i47 + 1;
                    this.U2 = i47 + 2;
                    this.V2 = i47 + 3;
                    this.M2 = i47 + 5;
                    this.c3 = i47 + 4;
                    Set set = getMessagesController().U3;
                    if (set.contains("PREMIUM_GRACE")) {
                        int i48 = this.M2;
                        this.X2 = i48;
                        this.M2 = i48 + 2;
                        this.Y2 = i48 + 1;
                    } else if (set.contains("VALIDATE_PHONE_NUMBER")) {
                        int i49 = this.M2;
                        this.Z2 = i49;
                        this.M2 = i49 + 2;
                        this.W2 = i49 + 1;
                    } else if (set.contains("VALIDATE_PASSWORD")) {
                        int i50 = this.M2;
                        this.b3 = i50;
                        this.M2 = i50 + 2;
                        this.a3 = i50 + 1;
                    }
                    int i51 = this.M2;
                    this.d3 = i51;
                    this.i3 = i51 + 1;
                    this.g3 = i51 + 2;
                    this.e3 = i51 + 3;
                    this.h3 = i51 + 4;
                    this.M2 = i51 + 6;
                    this.k3 = i51 + 5;
                    if (getMessagesController().E3 || !getMessagesController().P0.isEmpty()) {
                        int i52 = this.M2;
                        this.M2 = i52 + 1;
                        this.j3 = i52;
                    }
                    int i53 = this.M2;
                    this.m3 = i53;
                    this.f3 = i53 + 1;
                    this.M2 = i53 + 3;
                    this.n3 = i53 + 2;
                    if (!getMessagesController().A3()) {
                        int i54 = this.M2;
                        this.M2 = i54 + 1;
                        this.b4 = i54;
                    }
                    if (getMessagesController().R4()) {
                        int i55 = this.M2;
                        this.M2 = i55 + 1;
                        this.c4 = i55;
                    }
                    rh.e6.y(this.currentAccount, true).p();
                    org.telegram.messenger.w0.n();
                    int i56 = this.M2;
                    this.M2 = i56 + 1;
                    this.d4 = i56;
                    if (!getMessagesController().A3()) {
                        int i57 = this.M2;
                        this.M2 = i57 + 1;
                        this.e4 = i57;
                    }
                    if (!getMessagesController().i7) {
                        int i58 = this.M2;
                        this.M2 = i58 + 1;
                        this.f4 = i58;
                    }
                    if (this.b4 >= 0 || this.c4 >= 0 || this.d4 >= 0 || this.e4 >= 0 || this.f4 >= 0) {
                        int i59 = this.M2;
                        this.M2 = i59 + 1;
                        this.g4 = i59;
                    }
                    int i60 = this.M2;
                    this.o3 = i60;
                    this.p3 = i60 + 1;
                    this.q3 = i60 + 2;
                    int i61 = i60 + 4;
                    this.M2 = i61;
                    this.r3 = i60 + 3;
                    boolean z19 = org.telegram.messenger.v2.a;
                    if (z19) {
                        this.s3 = i61;
                        this.M2 = i60 + 6;
                        this.t3 = i60 + 5;
                    }
                    if (z19) {
                        int i62 = this.M2;
                        this.u3 = i62;
                        this.v3 = i62 + 1;
                        this.M2 = i62 + 3;
                        this.w3 = i62 + 2;
                    }
                    int i63 = this.M2;
                    this.x3 = i63;
                    this.M2 = i63 + 2;
                    this.y3 = i63 + 1;
                }
            } else if (this.p1) {
                if (this.z3 < 0 && this.A3 < 0) {
                    if (this.H4 || this.I4 || this.f6 != null || this.Z == null) {
                        int i64 = this.M2;
                        this.M2 = i64 + 1;
                        this.A3 = i64;
                    } else {
                        int i65 = this.M2;
                        this.M2 = i65 + 1;
                        this.z3 = i65;
                    }
                }
                int i66 = this.M2;
                int i67 = i66 + 1;
                this.M2 = i67;
                this.K3 = i66;
                if (this.Z == null) {
                    this.M2 = i66 + 2;
                    this.P3 = i67;
                }
                int i68 = this.M2;
                int i69 = i68 + 1;
                this.M2 = i69;
                this.Q3 = i68;
                if (z10) {
                    this.M2 = i68 + 2;
                    this.J4 = i69;
                }
            } else if (this.e1 != 0) {
                TLRPC.ChatFull chatFull7 = this.t2;
                if ((chatFull7 != null && (!TextUtils.isEmpty(chatFull7.about) || (this.t2.location instanceof TLRPC.TL_channelLocation))) || org.telegram.messenger.w3.t0(this.D2)) {
                    if (this.z3 < 0 && this.A3 < 0) {
                        if (this.H4 || this.I4 || this.f6 != null || this.Z == null) {
                            int i70 = this.M2;
                            this.M2 = i70 + 1;
                            this.A3 = i70;
                        } else {
                            int i71 = this.M2;
                            this.M2 = i71 + 1;
                            this.z3 = i71;
                        }
                    }
                    if (this.Z == null) {
                        int i72 = this.M2;
                        this.M2 = i72 + 1;
                        this.C3 = i72;
                    }
                    TLRPC.ChatFull chatFull8 = this.t2;
                    if (chatFull8 != null) {
                        if (!TextUtils.isEmpty(chatFull8.about)) {
                            int i73 = this.M2;
                            this.M2 = i73 + 1;
                            this.J3 = i73;
                        }
                        if (this.t2.location instanceof TLRPC.TL_channelLocation) {
                            int i74 = this.M2;
                            this.M2 = i74 + 1;
                            this.H3 = i74;
                        }
                    }
                    if (org.telegram.messenger.w3.t0(this.D2)) {
                        int i75 = this.M2;
                        this.M2 = i75 + 1;
                        this.K3 = i75;
                    }
                }
                if (this.z3 < 0 && this.A3 < 0) {
                    if (this.H4 || this.I4 || this.f6 != null || this.Z == null) {
                        int i76 = this.M2;
                        this.M2 = i76 + 1;
                        this.A3 = i76;
                    } else {
                        int i77 = this.M2;
                        this.M2 = i77 + 1;
                        this.z3 = i77;
                    }
                }
                if (this.Z == null) {
                    if (this.C3 != -1) {
                        int i78 = this.M2;
                        this.M2 = i78 + 1;
                        this.L3 = i78;
                    }
                    int i79 = this.M2;
                    this.M2 = i79 + 1;
                    this.M3 = i79;
                }
                int i80 = this.M2;
                if (i80 > 0) {
                    this.M2 = i80 + 1;
                    this.Q3 = i80;
                }
                TLRPC.Chat chat = this.D2;
                if (chat != null && chat.linked_community_id != 0) {
                    int i81 = this.M2;
                    this.k4 = i81;
                    this.M2 = i81 + 2;
                    this.l4 = i81 + 1;
                }
                if (org.telegram.messenger.w3.T(chat)) {
                    TLRPC.Chat chat2 = this.D2;
                    if (!chat2.megagroup) {
                        TLRPC.ChatFull chatFull9 = this.t2;
                        if (chatFull9 != null && (chat2.creator || chatFull9.can_view_participants)) {
                            if (this.Z == null) {
                                int i82 = this.M2;
                                this.M2 = i82 + 1;
                                this.s4 = i82;
                            }
                            int i83 = this.M2;
                            int i84 = i83 + 1;
                            this.M2 = i84;
                            this.w4 = i83;
                            if (chatFull9.requests_pending > 0) {
                                this.M2 = i83 + 2;
                                this.x4 = i84;
                            }
                            int i85 = this.M2;
                            int i86 = i85 + 1;
                            this.M2 = i86;
                            this.y4 = i85;
                            if (chatFull9.banned_count != 0 || chatFull9.kicked_count != 0) {
                                this.M2 = i85 + 2;
                                this.F4 = i86;
                            }
                            if ((chatFull9.can_view_stars_revenue && (rh.r.g(this.currentAccount).c(-this.e1).amount > 0 || !rh.r.g(this.currentAccount).k(-this.e1).a[0].isEmpty())) || ((chatFull4 = this.t2) != null && chatFull4.can_view_revenue && rh.r.g(this.currentAccount).i(-this.e1) > 0)) {
                                int i87 = this.M2;
                                this.M2 = i87 + 1;
                                this.C4 = i87;
                            }
                            int i88 = this.M2;
                            this.z4 = i88;
                            this.M2 = i88 + 2;
                            this.D4 = i88 + 1;
                        }
                        if (org.telegram.messenger.w3.T(this.D2)) {
                            TLRPC.ChatFull chatFull10 = this.t2;
                            if (chatFull10 != null) {
                                if (this.p1 || (chatParticipants = chatFull10.participants) == null || chatParticipants.participants == null || (chatParticipants instanceof TLRPC.TL_chatParticipantsForbidden)) {
                                    if (!org.telegram.messenger.w3.r0(this.D2) && org.telegram.messenger.w3.w(3, this.D2) && this.t2.participants_hidden) {
                                        int i89 = this.M2;
                                        this.v4 = i89;
                                        this.M2 = i89 + 2;
                                        this.G4 = i89 + 1;
                                    }
                                    ix0 ix0Var = this.N;
                                    if (ix0Var != null) {
                                        ix0Var.z1();
                                    }
                                } else {
                                    if (org.telegram.messenger.w3.w(3, this.D2) || (tL_chatBannedRights = this.D2.default_banned_rights) == null || !tL_chatBannedRights.invite_users) {
                                        int i90 = this.M2;
                                        this.M2 = i90 + 1;
                                        this.v4 = i90;
                                    }
                                    if (this.t2.participants.participants.size() <= 5 || !z10) {
                                        if (this.v4 == -1 && this.Z == null) {
                                            int i91 = this.M2;
                                            this.M2 = i91 + 1;
                                            this.s4 = i91;
                                        }
                                        int i92 = this.M2;
                                        this.t4 = i92;
                                        int size = this.t2.participants.participants.size() + i92;
                                        this.u4 = size;
                                        this.M2 = size + 1;
                                        this.G4 = size;
                                        arrayList2.addAll(this.t2.participants.participants);
                                        ArrayList arrayList4 = this.B2;
                                        if (arrayList4 != null) {
                                            arrayList3.addAll(arrayList4);
                                        }
                                        ix0 ix0Var2 = this.N;
                                        if (ix0Var2 != null) {
                                            ix0Var2.h1(null, null);
                                        }
                                    } else {
                                        if (this.v4 != -1) {
                                            int i93 = this.M2;
                                            this.M2 = i93 + 1;
                                            this.G4 = i93;
                                        }
                                        ix0 ix0Var3 = this.N;
                                        if (ix0Var3 != null) {
                                            ix0Var3.h1(this.B2, this.t2);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (this.p1 || (chatFull3 = this.t2) == null || !this.D2.megagroup || (chatParticipants2 = chatFull3.participants) == null || (arrayList = chatParticipants2.participants) == null || arrayList.isEmpty()) {
                                if (!org.telegram.messenger.w3.r0(this.D2) && org.telegram.messenger.w3.w(3, this.D2) && (chatFull2 = this.t2) != null && chatFull2.participants_hidden) {
                                    int i94 = this.M2;
                                    this.v4 = i94;
                                    this.M2 = i94 + 2;
                                    this.G4 = i94 + 1;
                                }
                                ix0 ix0Var4 = this.N;
                                if (ix0Var4 != null) {
                                    ix0Var4.z1();
                                }
                            } else {
                                if (!org.telegram.messenger.w3.r0(this.D2) && org.telegram.messenger.w3.w(3, this.D2) && this.t2.participants_count < getMessagesController().X2) {
                                    int i95 = this.M2;
                                    this.M2 = i95 + 1;
                                    this.v4 = i95;
                                }
                                int size2 = this.t2.participants.participants.size();
                                if ((size2 <= 5 || !z10 || this.S4 == 1) && this.S4 != 2) {
                                    if (this.v4 == -1 && this.Z == null) {
                                        int i96 = this.M2;
                                        this.M2 = i96 + 1;
                                        this.s4 = i96;
                                    }
                                    int i97 = this.M2;
                                    this.t4 = i97;
                                    int i98 = i97 + size2;
                                    this.u4 = i98;
                                    this.M2 = i98 + 1;
                                    this.G4 = i98;
                                    arrayList2.addAll(this.t2.participants.participants);
                                    ArrayList arrayList5 = this.B2;
                                    if (arrayList5 != null) {
                                        arrayList3.addAll(arrayList5);
                                    }
                                    this.S4 = 1;
                                    ix0 ix0Var5 = this.N;
                                    if (ix0Var5 != null) {
                                        ix0Var5.h1(null, null);
                                    }
                                } else {
                                    if (this.v4 != -1) {
                                        int i99 = this.M2;
                                        this.M2 = i99 + 1;
                                        this.G4 = i99;
                                    }
                                    if (this.N != null) {
                                        if (!this.B2.isEmpty()) {
                                            this.S4 = 2;
                                        }
                                        this.N.h1(this.B2, this.t2);
                                    }
                                }
                            }
                            if (this.M4 == -1) {
                                TLRPC.Chat chat3 = this.D2;
                                if (chat3.left && !chat3.kicked) {
                                    long j13 = org.telegram.messenger.vp.w1(this.currentAccount).getLong("dialog_join_requested_time_" + this.h1, -1L);
                                    if (j13 <= 0 || System.currentTimeMillis() - j13 >= 120000) {
                                        org.telegram.ui.Components.hg0 hg0Var2 = this.Z;
                                        if (hg0Var2 == null || !hg0Var2.f()) {
                                            int i100 = this.M2;
                                            this.L4 = i100;
                                            this.M2 = i100 + 2;
                                            this.M4 = i100 + 1;
                                        }
                                        if (z10) {
                                            int i101 = this.M2;
                                            this.M2 = i101 + 1;
                                            this.J4 = i101;
                                        }
                                        if (this.J4 == -1) {
                                            int i102 = this.M2;
                                            this.M2 = i102 + 1;
                                            this.B3 = i102;
                                        }
                                        if (this.actionBar != null) {
                                            i10 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0);
                                        } else {
                                            i10 = 0;
                                        }
                                        if (this.a != null && i12 <= this.M2) {
                                            i11 = this.E0;
                                            if (i11 != 0) {
                                            }
                                            bw0Var = this.a;
                                            if (bw0Var != null) {
                                                bw0Var.setTranslateSelectorPosition(this.N3);
                                            }
                                            hg0Var = this.Z;
                                            if (hg0Var != null) {
                                                hg0Var.o(7, z13);
                                            }
                                            bh0Var = this.b0;
                                            if (bh0Var != null) {
                                                TLRPC.UserFull userFull15 = this.u2;
                                                if (userFull15 != null) {
                                                    bh0Var.setMusicDocument(userFull15.saved_music);
                                                }
                                                this.b0.setVisibility(this.H4 ? 0 : 8);
                                                if (this.I4) {
                                                    this.c0.setBalance(this.u2.wallet_card.balance);
                                                }
                                                this.c0.setVisibility(this.I4 ? 0 : 8);
                                                this.b0.invalidate();
                                                this.c0.invalidate();
                                                return;
                                            }
                                            return;
                                        }
                                        this.C0 = 0;
                                        bw0Var = this.a;
                                        if (bw0Var != null) {
                                        }
                                        hg0Var = this.Z;
                                        if (hg0Var != null) {
                                        }
                                        bh0Var = this.b0;
                                        if (bh0Var != null) {
                                        }
                                    }
                                }
                            }
                        }
                        z13 = false;
                        if (z10) {
                        }
                        if (this.J4 == -1) {
                        }
                        if (this.actionBar != null) {
                        }
                        if (this.a != null) {
                            i11 = this.E0;
                            if (i11 != 0) {
                            }
                            bw0Var = this.a;
                            if (bw0Var != null) {
                            }
                            hg0Var = this.Z;
                            if (hg0Var != null) {
                            }
                            bh0Var = this.b0;
                            if (bh0Var != null) {
                            }
                        }
                        this.C0 = 0;
                        bw0Var = this.a;
                        if (bw0Var != null) {
                        }
                        hg0Var = this.Z;
                        if (hg0Var != null) {
                        }
                        bh0Var = this.b0;
                        if (bh0Var != null) {
                        }
                    }
                }
                TLRPC.ChatFull chatFull11 = this.t2;
                if ((chatFull11 != null && chatFull11.can_view_stars_revenue && (rh.r.g(this.currentAccount).c(-this.e1).amount > 0 || !rh.r.g(this.currentAccount).k(-this.e1).a[0].isEmpty())) || ((chatFull = this.t2) != null && chatFull.can_view_revenue && rh.r.g(this.currentAccount).i(-this.e1) > 0)) {
                    int i103 = this.M2;
                    this.C4 = i103;
                    this.M2 = i103 + 2;
                    this.D4 = i103 + 1;
                }
                if (org.telegram.messenger.w3.T(this.D2)) {
                }
                z13 = false;
                if (z10) {
                }
                if (this.J4 == -1) {
                }
                if (this.actionBar != null) {
                }
                if (this.a != null) {
                }
                this.C0 = 0;
                bw0Var = this.a;
                if (bw0Var != null) {
                }
                hg0Var = this.Z;
                if (hg0Var != null) {
                }
                bh0Var = this.b0;
                if (bh0Var != null) {
                }
            }
            z13 = false;
            if (this.J4 == -1) {
            }
            if (this.actionBar != null) {
            }
            if (this.a != null) {
            }
            this.C0 = 0;
            bw0Var = this.a;
            if (bw0Var != null) {
            }
            hg0Var = this.Z;
            if (hg0Var != null) {
            }
            bh0Var = this.b0;
            if (bh0Var != null) {
            }
        }
        z10 = false;
        if (!z10) {
            z10 = userFull6.stories_pinned_available;
        }
        if (!z10) {
            z10 = botInfo.has_preview_medias;
        }
        if (!z10) {
            z10 = true;
        }
        if (!z10) {
            z10 = chatFull5.stories_pinned_available;
        }
        if (!z10) {
        }
        if (this.d1 == 0) {
        }
        z13 = false;
        if (this.J4 == -1) {
        }
        if (this.actionBar != null) {
        }
        if (this.a != null) {
        }
        this.C0 = 0;
        bw0Var = this.a;
        if (bw0Var != null) {
        }
        hg0Var = this.Z;
        if (hg0Var != null) {
        }
        bh0Var = this.b0;
        if (bh0Var != null) {
        }
    }

    public final void J3() {
        if (this.Y5 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.i2;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.i2.cancel();
        }
        float l4 = Utilities.l(this.P1 / this.E1);
        if (l4 <= 0.0f) {
            return;
        }
        float f7 = (l4 - 0.5f) / 0.5f;
        float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0)) - org.telegram.messenger.i0.L(21.0f));
        this.a2 = org.telegram.messenger.i0.T1(0.42f, this.Y5[0], l4);
        this.Y1 = org.telegram.messenger.i0.T1(this.d6, this.Y5[1], l4);
        this.Z1 = org.telegram.messenger.i0.T1(translationY, this.Y5[2], l4);
        this.b2 = org.telegram.messenger.i0.T1(this.Y5[11], 0.0f, l4);
        this.X.setScaleX(this.a2);
        this.X.setScaleY(this.a2);
        this.X.setTranslationX(this.Y1);
        this.X.setTranslationY(this.Z1);
        org.telegram.ui.Components.nv0 nv0Var = this.S;
        if (nv0Var != null) {
            nv0Var.setAlpha(l4);
        }
        this.e0.setAlpha(1.0f);
        this.X.setAlpha(1.0f);
        mw0 mw0Var = this.u0;
        if (mw0Var != null) {
            mw0Var.invalidate();
        }
        rh.g0 g0Var = this.v0;
        if (g0Var != null) {
            g0Var.e = org.telegram.messenger.i0.T1(0.0f, this.Y5[4], f7);
            this.v0.f = org.telegram.messenger.i0.T1(0.0f, this.Y5[5], l4);
            rh.g0 g0Var2 = this.v0;
            g0Var2.h = true;
            g0Var2.invalidate();
        }
        iy0 iy0Var = this.x6;
        if (iy0Var != null) {
            iy0Var.setAlpha((int) org.telegram.messenger.i0.T1(0.0f, this.Y5[6], l4));
        }
        float L = (((this.a2 * 100.0f) / 42.0f) * org.telegram.messenger.i0.L(42.0f)) - org.telegram.messenger.i0.L(42.0f);
        this.h0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(16.0f) + L);
        this.h0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(-10.0f) + L);
        this.i0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L);
        this.i0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(26.5f) + L);
        this.j0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L);
        this.j0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + L);
        this.k0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L);
        this.k0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + L);
        float T1 = org.telegram.messenger.i0.T1(1.0f, this.Y5[7], l4);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0)) - (org.telegram.messenger.i0.p * 21.0f)))) + org.telegram.messenger.i0.L(1.3f);
        float N = org.telegram.messenger.i0.N(22.7f) + floor;
        this.d2 = org.telegram.messenger.i0.T1(floor, this.Y5[8], l4);
        this.f2 = org.telegram.messenger.i0.T1(N, this.Y5[9], l4);
        float T12 = org.telegram.messenger.i0.T1((this.d6 - org.telegram.messenger.i0.L(109.0f)) + org.telegram.messenger.i0.L(48.0f), this.Y5[12], l4);
        float T13 = org.telegram.messenger.i0.T1((this.d6 - org.telegram.messenger.i0.L(109.0f)) + org.telegram.messenger.i0.L(48.0f), this.Y5[13], l4);
        this.f.setTranslationX(T12);
        this.f.setTranslationY(this.d2);
        this.r.setTranslationX(this.o5 + T13);
        this.r.setTranslationY(this.f2);
        this.c2 = T12;
        this.e2 = T13;
        this.f.setScaleX(T1);
        this.f.setScaleY(T1);
        p5();
        v5(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0));
        y4((int) this.Y5[10], l4, true);
        org.telegram.ui.Components.hg0 hg0Var = this.Z;
        if (hg0Var != null) {
            hg0Var.setAlpha(org.telegram.messenger.i0.T1(0.0f, this.Y5[3], f7));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_photo) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
    
        if (r9 != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J4(boolean z10) {
        TLRPC.Chat L0;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize x10;
        TLRPC.ChatFull chatFull;
        TLRPC.FileLocation fileLocation2;
        TLRPC.VideoSize x11;
        TLRPC.UserFull userFull;
        TLRPC.Photo photo;
        if (this.a.getScrollState() != 1 || z10) {
            kw0 kw0Var = this.n0;
            int realPosition = kw0Var != null ? kw0Var.getRealPosition() : 0;
            kw0 kw0Var2 = this.n0;
            org.telegram.messenger.ic icVar = null;
            org.telegram.messenger.ic G = kw0Var2 != null ? kw0Var2.G(realPosition) : null;
            kw0 kw0Var3 = this.n0;
            TLRPC.Photo F = kw0Var3 != null ? kw0Var3.F(realPosition) : null;
            long j10 = this.d1;
            vw0 vw0Var = this.k5;
            if (j10 == 0) {
                if (this.e1 == 0 || (chatPhoto = (L0 = getMessagesController().L0(Long.valueOf(this.e1))).photo) == null || chatPhoto.photo_big == null) {
                    return;
                }
                PhotoViewer.v1().N2(null, this, null);
                TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                int i10 = chatPhoto2.dc_id;
                if (i10 != 0) {
                    chatPhoto2.photo_big.dc_id = i10;
                }
                if (G == null || (fileLocation = G.f) == null) {
                    fileLocation = chatPhoto2.photo_big;
                }
                TLRPC.FileLocation fileLocation3 = fileLocation;
                if (F == null && (chatFull = this.t2) != null) {
                    TLRPC.Photo photo2 = chatFull.chat_photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        F = photo2;
                    }
                }
                if (F != null && !F.video_sizes.isEmpty() && (x10 = org.telegram.messenger.b8.x(1000, F.video_sizes)) != null) {
                    icVar = org.telegram.messenger.ic.j(x10, F);
                }
                PhotoViewer.v1().h2(null, fileLocation3, G, icVar, null, null, null, 0, vw0Var, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.d1));
            TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null) {
                return;
            }
            PhotoViewer.v1().N2(null, this, null);
            TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
            int i11 = userProfilePhoto2.dc_id;
            if (i11 != 0) {
                userProfilePhoto2.photo_big.dc_id = i11;
            }
            if (G == null || (fileLocation2 = G.f) == null) {
                fileLocation2 = userProfilePhoto2.photo_big;
            }
            TLRPC.FileLocation fileLocation4 = fileLocation2;
            if (F == null && (userFull = this.u2) != null) {
                if (userProfilePhoto2.personal) {
                    photo = userFull.personal_photo;
                }
                photo = userFull.profile_photo;
                boolean z11 = photo instanceof TLRPC.TL_photo;
                if (!z11 || photo.id != userProfilePhoto2.photo_id) {
                    TLRPC.Photo photo3 = userFull.fallback_photo;
                    if ((photo3 instanceof TLRPC.TL_photo) && photo3.id == userProfilePhoto2.photo_id) {
                        F = photo3;
                    }
                }
                F = photo;
            }
            if (F != null && !F.video_sizes.isEmpty() && (x11 = org.telegram.messenger.b8.x(1000, F.video_sizes)) != null) {
                icVar = org.telegram.messenger.ic.j(x11, F);
            }
            PhotoViewer.v1().h2(null, fileLocation4, G, icVar, null, null, null, 0, vw0Var, null, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void J5() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.j0 == null || (imageView = this.k0) == null) {
            return;
        }
        if (!this.K1 || (chat = this.D2) == null || (chat.flags2 & 2048) == 0) {
            imageView.setTag(null);
            this.k0.setVisibility(8);
            this.j0.setTag(null);
            this.j0.setVisibility(8);
            return;
        }
        imageView.setTag(1);
        this.k0.setVisibility(0);
        this.j0.setTag(1);
        this.j0.setVisibility(0);
    }

    public final float K3() {
        return Utilities.l((this.P1 - d4()) / j4());
    }

    public final void K4() {
        TLRPC.User Z1;
        if (this.d1 == 0 || b4() || (Z1 = getMessagesController().Z1(Long.valueOf(this.d1))) == null || (Z1 instanceof TLRPC.TL_userEmpty)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.d1);
        if (getMessagesController().E(bundle, this, null, null)) {
            boolean z10 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
            if (!org.telegram.messenger.i0.Q1() && z10) {
                org.telegram.messenger.zs notificationCenter = getNotificationCenter();
                int i10 = org.telegram.messenger.zs.t;
                notificationCenter.n(this, i10);
                getNotificationCenter().k(i10, new Object[0]);
            }
            int i11 = getArguments().getInt("nearby_distance", -1);
            if (i11 >= 0) {
                bundle.putInt("nearby_distance", i11);
            }
            un unVar = new un(bundle);
            org.telegram.messenger.ui mediaDataController = getMediaDataController();
            TLRPC.Document document = mediaDataController.y0;
            mediaDataController.n1();
            unVar.U9 = document;
            unVar.V9 = false;
            presentFragment(unVar, z10);
            if (!org.telegram.messenger.i0.Q1() || this.I0) {
                return;
            }
            finishFragment();
        }
    }

    public final void K5(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        if ((this.u0 == null && this.v0 == null) || (lVar = this.actionBar) == null || this.simpleActionBar == null) {
            return;
        }
        float f7 = lVar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0.0f;
        int L = org.telegram.messenger.i0.L(7.0f);
        float right = this.simpleActionBar.getBackButton().getRight() + L;
        float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
        mw0 mw0Var = this.u0;
        if (mw0Var != null) {
            float B = c3.i0.B(this.actionBar.getHeight(), f7, 2.0f, f7);
            boolean z11 = Math.abs(right - mw0Var.f0) > 0.1f || Math.abs(menuPillLeft - mw0Var.g0) > 0.1f || Math.abs(B - mw0Var.h0) > 0.1f;
            mw0Var.f0 = right;
            mw0Var.g0 = menuPillLeft;
            if (z10) {
                mw0Var.m0.e(true, menuPillLeft);
            }
            mw0Var.h0 = B;
            if (z11) {
                mw0Var.invalidate();
            }
        }
        rh.g0 g0Var = this.v0;
        if (g0Var != null) {
            float B2 = c3.i0.B(this.actionBar.getHeight(), f7, 2.0f, f7);
            int j42 = j4();
            boolean z12 = Math.abs(right - g0Var.r) > 0.1f || Math.abs(menuPillLeft - g0Var.s) > 0.1f || Math.abs(B2 - g0Var.w) > 0.1f;
            g0Var.r = right;
            g0Var.s = menuPillLeft;
            if (z10) {
                g0Var.D.e(true, menuPillLeft);
            }
            g0Var.w = B2;
            g0Var.y = j42 + B2;
            if (z12) {
                g0Var.invalidate();
            }
        }
    }

    public final void L3() {
        this.Z1 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0)) - org.telegram.messenger.i0.L(21.0f));
        this.a2 = 1.38f;
        this.b2 = 0.0f;
        c4();
        Q4();
        y4(0, 1.0f, true);
        this.c2 = (this.a.getMeasuredWidth() / 2.0f) - (((this.f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin);
        this.e2 = (this.a.getMeasuredWidth() / 2.0f) - ((this.r.getExactWidth() * 0.5f) + (((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin + (this.p5 ? 0 : this.r.getPaddingLeft())));
        this.u6 = this.p5 ? 0.0f : this.r.getPaddingLeft();
        if (this.I1 != 2) {
            this.u0.setAlpha(1.0f);
        }
        this.X.setAlpha(1.0f);
        this.e0.setAlpha(1.0f);
    }

    public final void L4() {
        TLRPC.ChatFull chatFull = this.t2;
        if (chatFull == null || chatFull.linked_chat_id == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.t2.linked_chat_id);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new un(bundle));
        }
    }

    public final void L5() {
        try {
            do0 do0Var = this.T;
            if (do0Var != null && (do0Var.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.T.getForeground()).setColor(i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.z0), 100));
            }
            float f7 = this.P5;
            Drawable drawable = this.D;
            int[] iArr = this.Q6;
            if (drawable != null) {
                int S0 = org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.z0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, this.z0));
                int i10 = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (S0 != i10) {
                    drawable.setColorFilter(new PorterDuffColorFilter(S0, mode));
                }
                iArr[6] = S0;
            }
            Drawable drawable2 = this.M6;
            if (drawable2 != null) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.V6, this.z0);
                int i11 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (w02 != i11) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
                }
                iArr[3] = w02;
            }
            Drawable drawable3 = this.N6;
            if (drawable3 != null) {
                int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v8, this.z0);
                int i12 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (w03 != i12) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(w03, mode3));
                }
                iArr[4] = w03;
            }
            Drawable drawable4 = this.O6;
            if (drawable4 != null) {
                int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, this.z0);
                int i13 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (w04 != i13) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(w04, mode4));
                }
                iArr[5] = w04;
            }
            org.telegram.ui.Components.dq dqVar = this.P6;
            if (dqVar != null) {
                dqVar.y = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.kk, this.z0);
                if (this.a != null) {
                    for (int i14 = 0; i14 < this.a.getChildCount(); i14++) {
                        View childAt = this.a.getChildAt(i14);
                        if (childAt != null) {
                            childAt.invalidate();
                        }
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void M4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.u2;
        if (userFull == null || (tL_businessLocation = userFull.business_location) == null) {
            return;
        }
        int i10 = 0;
        if (tL_businessLocation.geo_point == null || z10) {
            boolean z11 = org.telegram.messenger.v2.a;
            org.telegram.messenger.w0.r();
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?q=" + this.u2.business_location.address, new Object[0]))));
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        yw0 yw0Var = new yw0(3, i10);
        yw0Var.setResourceProvider(this.z0);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.local_id = -1;
        tL_message.peer_id = getMessagesController().y1(a());
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_businessLocation tL_businessLocation2 = this.u2.business_location;
        tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
        tL_messageMediaGeo.address = tL_businessLocation2.address;
        tL_message.media = tL_messageMediaGeo;
        yw0Var.W0 = false;
        yw0Var.H0(new org.telegram.messenger.jj(org.telegram.messenger.d20.s0, tL_message, false, false));
        presentFragment(yw0Var);
    }

    public final void M5() {
        TLRPC.UserFull userFull;
        if (this.X0 == null) {
            return;
        }
        org.telegram.messenger.i0.Y3(this.X0, this.C2 == null && (((userFull = this.u2) != null && userFull.ttl_period > 0) || (this.t2 != null && org.telegram.messenger.w3.y(13, this.D2) && this.t2.ttl_period > 0)), 0.8f, true, this.l5);
    }

    @Override // org.telegram.ui.ux
    public final /* synthetic */ boolean N(ay ayVar) {
        return false;
    }

    public final void N3() {
        s4.c1 c1Var;
        View view;
        if (this.a.getVisibility() != 0) {
            return;
        }
        if (this.P) {
            this.N.setVisibleHeight(this.a.getMeasuredHeight() - this.N.getTop());
        }
        if (this.a.getChildCount() <= 0 || this.F1) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.a.getChildCount()) {
                view = null;
                break;
            } else {
                if (RecyclerView.R(this.a.getChildAt(i10)) == 0) {
                    view = this.a.getChildAt(i10);
                    break;
                }
                i10++;
            }
        }
        if (view != null) {
            bw0 bw0Var = this.a;
            View F = bw0Var.F(view);
            c1Var = (org.telegram.ui.Components.ck0) (F != null ? bw0Var.T(F) : null);
        }
        int top = view == null ? 0 : view.getTop();
        int b10 = c1Var != null ? c1Var.b() : -1;
        if (top < 0 || b10 != 0) {
            top = 0;
        }
        int i11 = 1;
        boolean z10 = this.q0 == null && this.actionBar.n0;
        int i12 = this.J4;
        if (i12 != -1 && !z10) {
            org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) this.a.K(i12);
            z10 = ck0Var != null && ck0Var.a.getTop() <= 0;
        }
        if (this.Q5 != z10) {
            this.Q5 = z10;
            O3();
            AnimatorSet animatorSet = this.N5;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.O5;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            A5(true);
            G5();
            K5(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.actionBar, this.R5, z10 ? 1.0f : 0.0f));
            this.N.K0.setOpen(z10);
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this, this.j5, 0.0f));
            }
            if (this.u0 != null || this.v0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new lv0(this, 3));
                arrayList.add(ofFloat);
            }
            Q3();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.N5 = animatorSet3;
            animatorSet3.playTogether(arrayList);
            this.N5.setInterpolator(org.telegram.ui.Components.gr.f);
            this.N5.addListener(new nw0(this, i11));
            this.N5.setDuration(150L);
            this.N5.start();
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.r4, Boolean.TRUE);
        }
        float f7 = top;
        if (this.P1 == f7 || this.G1) {
            return;
        }
        this.P1 = f7;
        this.c1.invalidate();
        if (this.I1 != 0) {
            this.L1 = this.P1 > ((float) d4());
        }
        x4(true);
    }

    public final void N4(int i10, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        sw0 sw0Var = new sw0(this, user.id, this.e1, tL_chatAdminRights, this.D2.default_banned_rights, tL_chatBannedRights, str, i10, zArr, user);
        sw0Var.X0 = new tw0(this, i10, chatParticipant, z10, zArr);
        presentFragment(sw0Var);
    }

    public final void N5(boolean z10) {
        boolean z11;
        TLRPC.ChatFull chatFull;
        float K3 = K3();
        this.W5 = K3 > 0.2f && !this.V1 && (this.q0 == null || this.N2 == -1);
        Q3();
        org.telegram.ui.Components.ei0 ei0Var = this.s;
        if (ei0Var == null || ei0Var.getVisibility() == 8) {
            z11 = false;
        } else {
            this.s.setTranslationY((((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0)) + this.P1) + this.S1) - org.telegram.messenger.i0.L(29.5f));
            z11 = K3 > 0.2f && !this.V1 && !this.r1 && (this.q0 == null || this.N2 == -1);
            if (z11 && this.e1 != 0) {
                z11 = (!org.telegram.messenger.w3.T(this.D2) || this.D2.megagroup || (chatFull = this.t2) == null || chatFull.linked_chat_id == 0 || (this.C3 == -1 && this.D3 == -1)) ? false : true;
            }
            if (!this.F1) {
                if (z11 != (this.s.getTag() == null)) {
                    if (z11) {
                        this.s.setTag(null);
                    } else {
                        this.s.setTag(0);
                    }
                    AnimatorSet animatorSet = this.w;
                    if (animatorSet != null) {
                        this.w = null;
                        animatorSet.cancel();
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.w = animatorSet2;
                        int i10 = 3;
                        if (z11) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ei0, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ei0, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ei0, Float>) View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ei0, Float>) View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ei0, Float>) View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ei0, Float>) View.ALPHA, 0.0f));
                        }
                        this.w.setDuration(150L);
                        this.w.addListener(new nw0(this, i10));
                        this.w.start();
                    } else {
                        this.s.setScaleX(z11 ? 1.0f : 0.2f);
                        this.s.setScaleY(z11 ? 1.0f : 0.2f);
                        this.s.setAlpha(z11 ? 1.0f : 0.0f);
                    }
                }
            }
        }
        mw0 mw0Var = this.u0;
        if (mw0Var != null) {
            float measuredWidth = this.Y.getMeasuredWidth() - org.telegram.messenger.i0.L(40.0f);
            int i11 = this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0;
            mw0Var.i0 = measuredWidth;
            mw0Var.k0 = z11;
            mw0Var.j0 = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + i11;
            mw0Var.invalidate();
        }
        rh.g0 g0Var = this.v0;
        if (g0Var != null) {
            g0Var.setExpandCoords(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0) + this.P1 + this.S1);
        }
    }

    @Override // org.telegram.ui.Components.a40
    public final void O(boolean z10, boolean z11) {
        org.telegram.ui.Cells.d4 d4Var = this.g0;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(0.0f);
    }

    public final void O3() {
        ix0 ix0Var = this.N;
        if (ix0Var != null) {
            ix0Var.setPagesVisibleOverscanTop((this.Q5 || this.P5 > 0.0f) ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0);
        }
    }

    public final void O4(String str, org.telegram.ui.Cells.g gVar) {
        if (str.startsWith("@")) {
            getMessagesController().v3(str.substring(1), this, 0, gVar);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            ay ayVar = new ay(null);
            ayVar.n2 = str;
            presentFragment(ayVar);
        } else {
            if (!str.startsWith("/") || this.parentLayout.getFragmentStack().size() <= 1) {
                return;
            }
            org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if (k2Var instanceof un) {
                finishFragment();
                ((un) k2Var).Z.Y0(null, str, false, false);
            }
        }
    }

    public final void O5() {
        org.telegram.ui.Components.vq0 vq0Var;
        org.telegram.ui.Components.ur0 ur0Var;
        org.telegram.ui.Components.p80 p80Var;
        int w02;
        this.g6.clear();
        ky0 ky0Var = this.c1;
        if (ky0Var != null) {
            ky0Var.a(this.f6, true);
        }
        lw0 lw0Var = this.r;
        if (lw0Var != null) {
            this.r.setTextColor(i0.b.f(this.j2, H3(lw0Var.getTag() instanceof Integer ? org.telegram.ui.ActionBar.t6.w0(((Integer) this.r.getTag()).intValue(), this.z0) : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, this.z0), Boolean.valueOf(this.J0[0])), -1275068417));
        }
        iy0 iy0Var = this.x6;
        if (iy0Var != null) {
            iy0Var.a(i0.b.f(this.j2, org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.b(0.18f, -0.1f, this.b1)), 603979775));
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.D(i0.b.f(this.P5, this.f6 != null ? -1 : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v8, this.z0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y8, this.z0)), false);
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            org.telegram.messenger.kp kpVar = this.f6;
            lVar2.C(i0.b.f(this.P5, kpVar != null ? 1090519039 : kpVar != null ? 553648127 : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f8, this.z0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z8, this.z0)), false);
        }
        if (this.y != null) {
            org.telegram.messenger.kp kpVar2 = this.f6;
            if (kpVar2 != null) {
                w02 = org.telegram.ui.ActionBar.t6.b(0.1f, org.telegram.ui.ActionBar.t6.I.q() ? -0.1f : -0.08f, i0.b.f(0.4f, kpVar2.g(), this.f6.o(org.telegram.ui.ActionBar.t6.I.q()) ? this.f6.k() : this.f6.i()));
            } else {
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.z0);
            }
            this.y.setColorFilter(org.telegram.messenger.i0.S0(this.P5, 1.0f, w02, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, this.z0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.H != null) {
            this.H.setColorFilter(org.telegram.messenger.i0.S0(this.P5, 1.0f, this.f6 != null ? -1 : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.oi, this.z0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.z0)), PorterDuff.Mode.MULTIPLY);
        }
        kl klVar = this.f;
        if (klVar != null) {
            klVar.setTextColor(i0.b.f(this.j2, i0.b.f(this.P5, this.f6 != null ? -1 : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ji, this.z0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, this.z0)), -1));
        }
        m4.n0 n0Var = this.Z0;
        if (n0Var != null && (p80Var = (org.telegram.ui.Components.p80) n0Var.e) != null) {
            p80Var.invalidate();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.f6 == null ? i0.b.f(this.R1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.dd, this.z0), -1) : -1, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.bh0 bh0Var = this.b0;
        if (bh0Var != null) {
            bh0Var.setColor(this.f6);
        }
        org.telegram.messenger.i0.d0(this.a, new ov0(this, 3));
        ix0 ix0Var = this.N;
        if (ix0Var != null && (ur0Var = ix0Var.K0) != null) {
            ur0Var.updateColors();
        }
        ix0 ix0Var2 = this.N;
        if (ix0Var2 != null && (vq0Var = ix0Var2.a0) != null) {
            vq0Var.m();
        }
        P5();
        r5();
        mw0 mw0Var = this.u0;
        if (mw0Var != null) {
            mw0Var.f(true, true);
        }
        rh.g0 g0Var = this.v0;
        if (g0Var != null) {
            g0Var.a();
        }
    }

    public final void P3() {
        int i10 = this.I1;
        float f7 = 0.0f;
        if (i10 == 1 && (!this.l5 || this.F1)) {
            this.p6 = 0.0f;
        } else if (i10 == 2 && (!this.l5 || this.F1)) {
            lw0 lw0Var = this.r;
            this.p6 = lw0Var == null ? 0.0f : lw0Var.getAlpha();
        } else if (this.d1 == org.telegram.messenger.d20.i(this.currentAccount).n) {
            this.p6 = (1.0f - this.n5) * this.j2;
        } else {
            this.p6 = this.j2 * this.n5;
        }
        boolean z10 = this.d1 == org.telegram.messenger.d20.i(this.currentAccount).n;
        if (z10 && this.p5) {
            this.o5 = org.telegram.messenger.i0.L(28.0f) * this.p6;
            lw0 lw0Var2 = this.r;
            if (lw0Var2 != null) {
                lw0Var2.setTranslationX(l4(this.t6, this.v6));
                this.Y.invalidate();
            }
        }
        if (z10) {
            if (this.p5) {
                f7 = this.j2;
            }
        } else if (this.q5) {
            f7 = this.p6;
        }
        iy0 iy0Var = this.x6;
        if (iy0Var != null) {
            iy0Var.e = 1.0f - f7;
            iy0Var.invalidateSelf();
        }
        this.s6 = f7 > 0.5f;
        G5();
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0476  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P4(float f7, float f10, int i10, View view) {
        TLRPC.Chat L0;
        String K;
        TLRPC.TL_username b10;
        String sb2;
        String str;
        TLRPC.UserFull userFull;
        TLRPC.UserFull userFull2;
        String str2;
        float f11;
        float f12;
        ViewGroup view2;
        View view3 = view;
        int i11 = 4;
        String str3 = "";
        String str4 = null;
        int i12 = 1;
        int i13 = 0;
        if (i10 == this.K3 || i10 == this.U2) {
            if (this.d1 == 0) {
                if (this.e1 != 0 && (L0 = getMessagesController().L0(Long.valueOf(this.e1))) != null && (this.f1 != 0 || org.telegram.messenger.w3.t0(L0))) {
                    K = org.telegram.messenger.w3.K(L0, false);
                    b10 = org.telegram.messenger.o5.b(K, L0.usernames);
                    if (this.d1 != 0) {
                    }
                }
                return false;
            }
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.d1));
            K = org.telegram.messenger.h20.n(Z1);
            if (Z1 != null && K != null) {
                b10 = org.telegram.messenger.o5.b(K, Z1.usernames);
                if (this.d1 != 0) {
                    TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(this.e1));
                    if (org.telegram.messenger.w3.t0(L02)) {
                        StringBuilder sb3 = new StringBuilder("https://");
                        sb3.append(getMessagesController().U2);
                        sb3.append("/");
                        sb3.append(org.telegram.messenger.w3.K(L02, false));
                        if (this.f1 != 0) {
                            str3 = "/" + this.f1;
                        }
                        sb3.append(str3);
                        sb2 = sb3.toString();
                    } else {
                        StringBuilder sb4 = new StringBuilder("https://");
                        sb4.append(getMessagesController().U2);
                        sb4.append("/c/");
                        sb4.append(L02.id);
                        if (this.f1 != 0) {
                            str3 = "/" + this.f1;
                        }
                        sb4.append(str3);
                        sb2 = sb4.toString();
                    }
                    uw0 uw0Var = new uw0(this, getParentActivity(), sb2, sb2);
                    showDialog(uw0Var);
                    if (b10 != null && !b10.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername.username = b10.username;
                        tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo, new vp0(this, b10, uw0Var, i11)), getClassGuid());
                        return true;
                    }
                } else if (!Y3(i10, view3)) {
                    if (b10 != null && !b10.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo2 = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername2 = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername2.username = b10.username;
                        tL_getCollectibleInfo2.collectible = tL_inputCollectibleUsername2;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo2, new ul0(7, this, b10)), getClassGuid());
                        return true;
                    }
                    try {
                        org.telegram.ui.Components.cc.a0(this).i(org.telegram.messenger.cd.L0(2131743691, null)).j();
                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "@" + K));
                        return true;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return true;
                    }
                }
            }
            return false;
            return true;
        }
        if (i10 != this.G3) {
            int i14 = 2;
            if (i10 == this.F3 || i10 == this.S2) {
                if (!Y3(i10, view3)) {
                    TLRPC.User Z12 = getMessagesController().Z1(Long.valueOf(this.d1));
                    if (Z12 != null && (str = Z12.phone) != null && str.length() != 0 && getParentActivity() != null) {
                        if (i10 == this.F3 && Z12.phone.startsWith("888")) {
                            TL_fragment.TL_inputCollectiblePhone tL_inputCollectiblePhone = new TL_fragment.TL_inputCollectiblePhone();
                            String str5 = Z12.phone;
                            tL_inputCollectiblePhone.phone = str5;
                            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo3 = new TL_fragment.TL_getCollectibleInfo();
                            tL_getCollectibleInfo3.collectible = tL_inputCollectiblePhone;
                            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo3, new vp0(this, str5, Z12, 5)), getClassGuid());
                            return true;
                        }
                        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view3);
                        H.W(this.a.U0(view3, false));
                        H.w = false;
                        if (i10 == this.F3) {
                            TLRPC.UserFull userFull3 = this.u2;
                            if (userFull3 != null && userFull3.phone_calls_available) {
                                H.c(R.drawable.msg_calls, org.telegram.messenger.cd.L0(2131752600, null), new ev0(this, Z12, i12), false);
                                if (this.u2.video_calls_available) {
                                    H.c(R.drawable.msg_videocall, org.telegram.messenger.cd.L0(2131743634, null), new ev0(this, Z12, i14), false);
                                }
                            }
                            if (!this.b5) {
                                H.c(R.drawable.msg_calls_regular, org.telegram.messenger.cd.L0(2131752634, null), new ev0(this, Z12, 3), false);
                            }
                        }
                        H.c(R.drawable.msg_copy, org.telegram.messenger.cd.L0(2131751767, null), new ev0(this, Z12, i11), false);
                        if (this.b5) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131754250, null)));
                            int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                            int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                                int i15 = lastIndexOf - 1;
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), indexOf, i15, 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.I6, this.z0), indexOf, i15, 33);
                            }
                            H.k();
                            H.p(13, org.telegram.messenger.i0.L(200.0f), spannableStringBuilder);
                            if (H.z() instanceof TextView) {
                                TextView textView = (TextView) H.z();
                                int i16 = org.telegram.ui.ActionBar.t6.I5;
                                org.telegram.ui.ActionBar.a7.R(textView, org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i16, this.z0), 0, 6), null, org.telegram.ui.ActionBar.a7.N(i16), this.z0);
                                textView.setOnClickListener(new bh.c(18));
                            }
                        }
                        H.Z();
                        return true;
                    }
                }
                return true;
            }
            if (i10 == this.J3 || i10 == this.I3 || i10 == this.H3 || i10 == this.V2) {
                if (i10 != this.V2 || ((userFull = this.u2) != null && !TextUtils.isEmpty(userFull.about))) {
                    if (!Y3(i10, view3)) {
                        if (view3 instanceof org.telegram.ui.Cells.i) {
                            org.telegram.ui.Cells.i iVar = (org.telegram.ui.Cells.i) view3;
                            if (iVar.b0 && iVar.V <= 0.0f) {
                                iVar.h();
                                return false;
                            }
                        }
                        if (i10 == this.H3) {
                            TLRPC.ChatFull chatFull = this.t2;
                            if (chatFull != null) {
                                TLRPC.ChannelLocation channelLocation = chatFull.location;
                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                    str4 = ((TLRPC.TL_channelLocation) channelLocation).address;
                                }
                            }
                        } else if (i10 == this.J3) {
                            TLRPC.ChatFull chatFull2 = this.t2;
                            if (chatFull2 != null) {
                                str4 = chatFull2.about;
                            }
                        } else {
                            TLRPC.UserFull userFull4 = this.u2;
                            if (userFull4 != null) {
                                str4 = userFull4.about;
                            }
                        }
                        String str6 = str4;
                        if (!TextUtils.isEmpty(str6)) {
                            String[] strArr = {"und"};
                            boolean s10 = org.telegram.messenger.vp.r1(this.currentAccount).t7.s();
                            boolean[] zArr = {i10 == this.V2 || i10 == this.J3 || i10 == this.I3};
                            String M0 = org.telegram.ui.Components.m31.M0();
                            org.telegram.messenger.fe feVar = new org.telegram.messenger.fe(this, view3, str6, i10, zArr, strArr, M0, 13);
                            if (zArr[0]) {
                                org.telegram.messenger.js.d(str6, new org.telegram.ui.Components.id(this, strArr, zArr, M0, s10, feVar), new tj0(feVar, 12), false);
                                return true;
                            }
                            feVar.run();
                            return true;
                        }
                    }
                    return true;
                }
            } else if ((i10 == this.N3 || i10 == this.O3) && getParentActivity() != null && (userFull2 = this.u2) != null) {
                if (i10 != this.N3) {
                    if (i10 == this.O3 && !Y3(i10, view3)) {
                        TLRPC.TL_businessLocation tL_businessLocation = this.u2.business_location;
                        if (tL_businessLocation != null) {
                            str2 = tL_businessLocation.address;
                            String str7 = str2;
                            AtomicReference atomicReference = new AtomicReference();
                            org.telegram.ui.Components.eo eoVar = new org.telegram.ui.Components.eo(R.drawable.popup_fixed_alert, i13, 1, getParentActivity(), this.z0);
                            eoVar.U = new Path();
                            eoVar.setFitItems(true);
                            org.telegram.ui.ActionBar.t0.c(false, false, eoVar, R.drawable.msg_copy, org.telegram.messenger.cd.L0(2131751767, null), false, this.z0).setOnClickListener(new ya(this, atomicReference, str7, i10, 4));
                            org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(eoVar, -2, -2);
                            k1Var.e = true;
                            k1Var.c = org.telegram.messenger.zs.x3;
                            k1Var.setOutsideTouchable(true);
                            k1Var.setClippingEnabled(true);
                            k1Var.setAnimationStyle(R.style.PopupContextAnimation);
                            k1Var.setFocusable(true);
                            eoVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                            k1Var.setInputMethodMode(2);
                            k1Var.getContentView().setFocusableInTouchMode(true);
                            atomicReference.set(k1Var);
                            f11 = f7;
                            f12 = f10;
                            while (view3 != null) {
                                f11 += view3.getX();
                                f12 += view3.getY();
                                view3 = (View) view3.getParent();
                            }
                            if (org.telegram.messenger.i0.Q1()) {
                                f11 += view2.getX() + view2.getPaddingLeft();
                                f12 += view2.getY() + view2.getPaddingTop();
                            }
                            k1Var.showAtLocation(getFragmentView(), 0, (int) (f11 - (eoVar.getMeasuredWidth() / 2.0f)), (int) f12);
                            k1Var.b();
                            return true;
                        }
                    }
                    return true;
                }
                TL_account.TL_businessWorkHours tL_businessWorkHours = userFull2.business_work_hours;
                if (tL_businessWorkHours != null) {
                    str2 = ag.h2.j0(this.currentAccount, userFull2.user, tL_businessWorkHours);
                    String str72 = str2;
                    AtomicReference atomicReference2 = new AtomicReference();
                    org.telegram.ui.Components.eo eoVar2 = new org.telegram.ui.Components.eo(R.drawable.popup_fixed_alert, i13, 1, getParentActivity(), this.z0);
                    eoVar2.U = new Path();
                    eoVar2.setFitItems(true);
                    org.telegram.ui.ActionBar.t0.c(false, false, eoVar2, R.drawable.msg_copy, org.telegram.messenger.cd.L0(2131751767, null), false, this.z0).setOnClickListener(new ya(this, atomicReference2, str72, i10, 4));
                    org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(eoVar2, -2, -2);
                    k1Var2.e = true;
                    k1Var2.c = org.telegram.messenger.zs.x3;
                    k1Var2.setOutsideTouchable(true);
                    k1Var2.setClippingEnabled(true);
                    k1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                    k1Var2.setFocusable(true);
                    eoVar2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                    k1Var2.setInputMethodMode(2);
                    k1Var2.getContentView().setFocusableInTouchMode(true);
                    atomicReference2.set(k1Var2);
                    f11 = f7;
                    f12 = f10;
                    while (view3 != null && view3 != getFragmentView()) {
                        f11 += view3.getX();
                        f12 += view3.getY();
                        view3 = (View) view3.getParent();
                    }
                    if (org.telegram.messenger.i0.Q1() && (view2 = this.parentLayout.getView()) != null) {
                        f11 += view2.getX() + view2.getPaddingLeft();
                        f12 += view2.getY() + view2.getPaddingTop();
                    }
                    k1Var2.showAtLocation(getFragmentView(), 0, (int) (f11 - (eoVar2.getMeasuredWidth() / 2.0f)), (int) f12);
                    k1Var2.b();
                    return true;
                }
            }
        }
        return false;
    }

    public final void P5() {
        if (this.s == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.li, this.z0);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.mi, this.z0);
            int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ki, this.z0);
            if (this.f6 != null && org.telegram.ui.ActionBar.t6.e1(w02)) {
                w02 = org.telegram.ui.ActionBar.t6.b(0.05f, -0.04f, this.f6.c(false));
                org.telegram.messenger.kp kpVar = this.f6;
                if (kpVar != null) {
                    int d = kpVar.d(org.telegram.ui.ActionBar.t6.I.q());
                    w03 = org.telegram.ui.ActionBar.t6.D(org.telegram.ui.ActionBar.t6.I.q(), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v6, this.z0), d, w03, d);
                }
                w04 = -1;
            }
            org.telegram.ui.Components.ei0 ei0Var = this.n6;
            org.telegram.ui.Components.ei0 ei0Var2 = this.s;
            int[] iArr = this.o6;
            if (ei0Var == ei0Var2 && iArr[0] == w02 && iArr[1] == w03 && iArr[2] == w04) {
                return;
            }
            this.n6 = ei0Var2;
            iArr[0] = w02;
            iArr[1] = w03;
            iArr[2] = w04;
            Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(mutate, org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(56.0f), w02, w03), 0, 0);
            int L = org.telegram.messenger.i0.L(56.0f);
            int L2 = org.telegram.messenger.i0.L(56.0f);
            eqVar.e = L;
            eqVar.f = L2;
            this.s.setBackground(eqVar);
            this.s.setColorFilter(new PorterDuffColorFilter(w04, mode));
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.st0
    public final void Q() {
        org.telegram.ui.Components.rt0 rt0Var;
        ix0 ix0Var = this.N;
        if (ix0Var != null && (rt0Var = this.Q) != null) {
            ix0Var.setNewMediaCounts(rt0Var.c);
        }
        if (this.d != null) {
            C5(false, false);
        }
        V();
        if (this.u2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void Q3() {
        org.telegram.ui.Components.nv0 nv0Var = this.S;
        if (nv0Var != null) {
            nv0Var.setVisibility(!this.Q5 && this.W5);
        }
    }

    public final void Q4() {
        ValueAnimator valueAnimator;
        if (!this.o2 || (valueAnimator = this.i2) == null || !valueAnimator.isRunning()) {
            R4(K3(), org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0));
        } else {
            this.d2 = this.Z5;
            this.f2 = this.a6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x03de, code lost:
    
        if (org.telegram.messenger.w3.q0(r1, org.telegram.messenger.vp.r1(r1).r7.f(r2.id, r13)) != false) goto L171;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0759  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R3(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        TLRPC.ChatFull chatFull;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z23;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        boolean z24;
        TLRPC.ChatFull chatFull2;
        int i10;
        org.telegram.ui.Components.hg0 hg0Var;
        boolean z25;
        boolean z26;
        boolean z27;
        long j10;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar == null || this.S0 == null) {
            return;
        }
        Context context = lVar.getContext();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.S0.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        this.N0 = false;
        this.L0 = false;
        this.K0 = false;
        this.M0 = false;
        this.z1 = false;
        boolean z28 = true;
        if (this.d1 == 0) {
            if (this.e1 != 0) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.e1));
                this.o1 = false;
                if (this.f1 == 0 && org.telegram.messenger.w3.w(1, L0)) {
                    S3(context);
                }
                if (org.telegram.messenger.w3.T(L0)) {
                    if (this.p1) {
                        int i11 = this.currentAccount;
                        long j11 = this.f1;
                        if (!org.telegram.messenger.w3.y(15, L0)) {
                            if (L0 != null && L0.forum) {
                            }
                        }
                        this.N0 = true;
                    } else if (org.telegram.messenger.w3.N(L0) || (L0.megagroup && org.telegram.messenger.w3.w(1, L0))) {
                        this.N0 = true;
                    }
                    if (this.t2 != null) {
                        if (org.telegram.messenger.w3.w(14, L0) && this.t2.call == null) {
                            this.S0.e(15, R.drawable.msg_voicechat, (!L0.megagroup || L0.gigagroup) ? org.telegram.messenger.cd.L0(2131744922, null) : org.telegram.messenger.cd.L0(2131744920, null));
                            this.o1 = true;
                            if (!L0.megagroup || L0.gigagroup) {
                                z24 = false;
                                z21 = true;
                                chatFull2 = this.t2;
                                if ((!chatFull2.can_view_stats || chatFull2.can_view_revenue || chatFull2.can_view_stars_revenue || getMessagesController().O1().j(a())) && this.f1 == 0) {
                                    this.S0.e(19, R.drawable.msg_stats, org.telegram.messenger.cd.L0(2131744910, null));
                                }
                                org.telegram.messenger.u3 f12 = getMessagesController().f1(this.e1, false, null);
                                this.L0 = f12 == null;
                                z20 = f12 == null || z24;
                            } else {
                                z24 = true;
                            }
                        } else {
                            z24 = false;
                        }
                        z21 = false;
                        chatFull2 = this.t2;
                        if (!chatFull2.can_view_stats) {
                        }
                        this.S0.e(19, R.drawable.msg_stats, org.telegram.messenger.cd.L0(2131744910, null));
                        org.telegram.messenger.u3 f122 = getMessagesController().f1(this.e1, false, null);
                        this.L0 = f122 == null;
                        if (f122 == null) {
                        }
                    } else {
                        z20 = false;
                        z21 = false;
                    }
                    getMessagesController().O1();
                    if (L0 == null || !org.telegram.messenger.w3.R(L0) || (!L0.creator && ((tL_chatAdminRights2 = L0.admin_rights) == null || !tL_chatAdminRights2.post_stories))) {
                        getMessagesController().O1();
                        if (L0 != null && org.telegram.messenger.w3.R(L0) && (L0.creator || ((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.edit_stories))) {
                            this.S0.e(39, R.drawable.msg_archive, org.telegram.messenger.cd.L0(2131747826, null));
                        }
                        z22 = false;
                    } else {
                        this.S0.e(39, R.drawable.msg_archive, org.telegram.messenger.cd.L0(2131747826, null));
                        z22 = true;
                    }
                    if (!L0.megagroup) {
                        if (org.telegram.messenger.w3.t0(L0)) {
                            this.S0.e(10, R.drawable.msg_share, org.telegram.messenger.cd.L0(2131752982, null));
                            z12 = !L0.creator;
                        } else {
                            z12 = false;
                        }
                        boolean z29 = org.telegram.messenger.v2.a;
                        if (getMessagesController().i7) {
                            z23 = false;
                        } else {
                            rh.e6.y(this.currentAccount, false).U();
                            this.S0.e(38, R.drawable.msg_gift_premium, org.telegram.messenger.cd.L0(2131746651, null));
                            org.telegram.ui.ActionBar.p5 p5Var = this.S0;
                            TLRPC.ChatFull chatFull3 = this.t2;
                            p5Var.Q(38, chatFull3 != null && chatFull3.stargifts_available);
                            z23 = true;
                        }
                        TLRPC.ChatFull chatFull4 = this.t2;
                        if (chatFull4 == null || chatFull4.linked_chat_id == 0) {
                            z15 = false;
                        } else {
                            this.S0.e(22, R.drawable.msg_discussion, org.telegram.messenger.cd.L0(2131743581, null));
                            z15 = true;
                        }
                        if (this.f1 == 0) {
                            this.S0.e(14, R.drawable.msg_home, org.telegram.messenger.cd.L0(2131754390, null));
                        }
                        TLRPC.Chat chat = this.D2;
                        if (chat.creator) {
                            this.S0.a(-1);
                            this.S0.e(7, R.drawable.msg_leave, org.telegram.messenger.cd.L0(2131749014, null));
                            this.S0.e(45, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131752422, null)).c(org.telegram.ui.ActionBar.t6.q7, org.telegram.ui.ActionBar.t6.p7);
                        } else if (chat.left || chat.kicked) {
                            z17 = z23;
                            z16 = z21;
                            z13 = z22;
                            z28 = false;
                            z14 = z20;
                        } else {
                            this.S0.e(7, R.drawable.msg_leave, org.telegram.messenger.cd.L0(2131749014, null));
                        }
                        z17 = z23;
                        z16 = z21;
                        z13 = z22;
                        z28 = false;
                        z14 = z20;
                        z11 = true;
                        if (this.q0 == null) {
                        }
                        if (t4()) {
                        }
                        if (this.d1 != 0) {
                            org.telegram.ui.ActionBar.b1 e = this.S0.e(24, R.drawable.msg_report, org.telegram.messenger.cd.L0(2131746248, null));
                            int i12 = org.telegram.ui.ActionBar.t6.p7;
                            e.c(i12, i12);
                        }
                        if (z28) {
                            this.S0.e(31, R.drawable.msg_leave, org.telegram.messenger.cd.L0(2131748754, null));
                        }
                        if (!this.o2) {
                        }
                        this.K0 = this.L0;
                        hg0Var = this.Z;
                        if (hg0Var == null) {
                        }
                        A5(z10);
                        K5(z25);
                    }
                    TLRPC.ChatFull chatFull5 = this.t2;
                    if (chatFull5 == null || !chatFull5.participants_hidden || org.telegram.messenger.w3.N(L0)) {
                        this.z1 = true;
                        this.S0.e(17, R.drawable.msg_search, org.telegram.messenger.cd.L0(2131745774, null));
                    }
                    if (this.p1) {
                        int i13 = this.currentAccount;
                        long j12 = this.f1;
                        if (j12 != 1 && org.telegram.messenger.w3.e(i13, L0, org.telegram.messenger.vp.r1(i13).r7.f(L0.id, j12))) {
                            this.S0.e(23, R.drawable.msg_delete, org.telegram.messenger.cd.J0(1, "DeleteTopics"));
                        }
                    }
                    if (this.f1 == 0) {
                        this.S0.e(14, R.drawable.msg_home, org.telegram.messenger.cd.L0(2131754390, null));
                    }
                    if (L0.creator) {
                        this.S0.a(-1);
                        this.S0.e(7, R.drawable.msg_leave, org.telegram.messenger.cd.L0(2131749001, null));
                        this.S0.e(45, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751531, null)).c(org.telegram.ui.ActionBar.t6.q7, org.telegram.ui.ActionBar.t6.p7);
                    } else if (L0.left || L0.kicked || this.p1) {
                        z16 = z21;
                        z13 = z22;
                        z12 = false;
                        z28 = false;
                        z15 = false;
                        z17 = false;
                        z14 = z20;
                    } else {
                        this.S0.e(7, R.drawable.msg_leave, org.telegram.messenger.cd.L0(2131749001, null));
                    }
                    z16 = z21;
                    z13 = z22;
                    z12 = false;
                    z28 = false;
                    z15 = false;
                    z17 = false;
                    z14 = z20;
                    z11 = true;
                    if (this.q0 == null) {
                        this.S0.e(33, R.drawable.msg_openprofile, org.telegram.messenger.cd.L0(2131745559, null));
                        i10 = 21;
                        this.S0.e(21, R.drawable.msg_gallery, org.telegram.messenger.cd.L0(2131745946, null));
                        this.S0.e(35, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751599, null));
                    } else {
                        i10 = 21;
                        this.S0.e(21, R.drawable.msg_gallery, org.telegram.messenger.cd.L0(2131745946, null));
                    }
                    if (t4()) {
                        this.S0.t(i10);
                    }
                    if (this.d1 != 0 && !this.q2 && !this.r1) {
                        org.telegram.ui.ActionBar.b1 e7 = this.S0.e(24, R.drawable.msg_report, org.telegram.messenger.cd.L0(2131746248, null));
                        int i122 = org.telegram.ui.ActionBar.t6.p7;
                        e7.c(i122, i122);
                    }
                    if (z28 && !this.r1) {
                        this.S0.e(31, R.drawable.msg_leave, org.telegram.messenger.cd.L0(2131748754, null));
                    }
                    if (!this.o2) {
                        this.S0.t(21);
                        this.S0.t(33);
                        this.S0.S(36);
                        this.S0.t(34);
                        this.S0.t(35);
                    }
                    this.K0 = this.L0;
                    hg0Var = this.Z;
                    if (hg0Var == null) {
                        hg0Var.F = true;
                        hg0Var.o(4, z12);
                        this.Z.o(5, this.L0);
                        this.Z.o(6, this.M0);
                        this.Z.o(2, z15);
                        this.Z.o(9, z11);
                        this.Z.o(12, z13);
                        this.Z.o(10, z14);
                        this.Z.o(11, z16);
                        this.Z.o(3, z17);
                        z25 = false;
                        this.M0 = false;
                        this.L0 = false;
                        if (!z15) {
                            if (this.p1) {
                                this.Z.o(0, true);
                            } else {
                                if (this.e1 != 0) {
                                    TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(this.e1));
                                    if (org.telegram.messenger.w3.c0(L02) || org.telegram.messenger.w3.n0(L02)) {
                                        z25 = false;
                                        this.Z.o(0, true);
                                    } else if (!org.telegram.messenger.w3.T(L02)) {
                                        z25 = false;
                                        this.Z.o(0, true);
                                    }
                                }
                                z25 = false;
                            }
                        }
                        org.telegram.ui.Components.hg0 hg0Var2 = this.Z;
                        if (hg0Var2.F) {
                            hg0Var2.F = z25;
                            hg0Var2.d();
                        }
                    } else {
                        z25 = false;
                    }
                    A5(z10);
                    K5(z25);
                }
                if (this.t2 != null) {
                    if (org.telegram.messenger.w3.w(14, L0) && this.t2.call == null) {
                        this.S0.e(15, R.drawable.msg_voicechat, org.telegram.messenger.cd.L0(2131744920, null));
                        this.o1 = true;
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    org.telegram.messenger.u3 f13 = getMessagesController().f1(this.e1, false, null);
                    this.L0 = f13 != null;
                    if (f13 != null || z19) {
                        z18 = true;
                        if (org.telegram.messenger.w3.w(1, L0)) {
                            this.N0 = true;
                        }
                        if (!org.telegram.messenger.w3.k0(L0) && !org.telegram.messenger.w3.l0(L0) && ((chatFull = this.t2) == null || !chatFull.participants_hidden || org.telegram.messenger.w3.N(L0))) {
                            this.z1 = true;
                            this.S0.e(17, R.drawable.msg_search, org.telegram.messenger.cd.L0(2131745774, null));
                        }
                        if (this.f1 == 0) {
                            this.S0.e(14, R.drawable.msg_home, org.telegram.messenger.cd.L0(2131754390, null));
                        }
                        this.S0.e(7, R.drawable.msg_leave, org.telegram.messenger.cd.L0(2131751574, null));
                        z14 = z18;
                        z11 = true;
                        z12 = false;
                        z13 = false;
                    }
                }
                z18 = false;
                if (org.telegram.messenger.w3.w(1, L0)) {
                }
                if (!org.telegram.messenger.w3.k0(L0)) {
                    this.z1 = true;
                    this.S0.e(17, R.drawable.msg_search, org.telegram.messenger.cd.L0(2131745774, null));
                }
                if (this.f1 == 0) {
                }
                this.S0.e(7, R.drawable.msg_leave, org.telegram.messenger.cd.L0(2131751574, null));
                z14 = z18;
                z11 = true;
                z12 = false;
                z13 = false;
            } else {
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
            }
            z28 = false;
            z15 = false;
            z16 = false;
            z17 = false;
            if (this.q0 == null) {
            }
            if (t4()) {
            }
            if (this.d1 != 0) {
            }
            if (z28) {
            }
            if (!this.o2) {
            }
            this.K0 = this.L0;
            hg0Var = this.Z;
            if (hg0Var == null) {
            }
            A5(z10);
            K5(z25);
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.d1));
        if (Z1 == null) {
            return;
        }
        if (org.telegram.messenger.h20.B(Z1)) {
            if (this.r1) {
                org.telegram.ui.Components.hg0 hg0Var3 = this.Z;
                if (hg0Var3 != null) {
                    this.N0 = !(hg0Var3.E == 6);
                } else {
                    this.N0 = true;
                }
            }
            if (!this.I0) {
                this.S0.e(30, R.drawable.msg_edit, org.telegram.messenger.cd.L0(2131751279, null));
                if (this.q0 != null) {
                    this.S0.e(36, R.drawable.msg_addphoto, org.telegram.messenger.cd.L0(2131754392, null));
                }
            }
            this.U0 = this.S0.e(40, R.drawable.menu_profile_colors, org.telegram.messenger.cd.L0(2131746695, null));
            q5();
            if (this.r1) {
                this.W0 = this.S0.e(43, R.drawable.menu_username_change, org.telegram.messenger.cd.L0(2131746635, null));
                this.V0 = this.S0.e(42, R.drawable.msg_link2, org.telegram.messenger.cd.L0(2131746694, null));
                B5();
            }
            z26 = false;
            z27 = false;
        } else {
            if (Z1.bot && Z1.bot_can_edit) {
                this.N0 = true;
            }
            TLRPC.UserFull userFull = this.u2;
            if (userFull != null && userFull.phone_calls_available) {
                this.L0 = true;
                this.M0 = userFull.video_calls_available;
            }
            if (!this.q2 && getContactsController().f0.get(Long.valueOf(this.d1)) != null) {
                if (this.C2 == null) {
                    S3(context);
                }
                if (!TextUtils.isEmpty(Z1.phone)) {
                    this.S0.e(3, R.drawable.msg_share, org.telegram.messenger.cd.L0(2131745479, null));
                }
                this.S0.e(2, R.drawable.msg_block, !this.j1 ? org.telegram.messenger.cd.L0(2131753693, null) : org.telegram.messenger.cd.L0(2131743936, null));
                this.S0.e(4, R.drawable.msg_edit, org.telegram.messenger.cd.L0(2131751283, null));
                this.S0.e(5, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751553, null));
            } else if (org.telegram.messenger.vp.E2(Z1)) {
                if (this.j1) {
                    this.S0.e(2, R.drawable.msg_block, org.telegram.messenger.cd.L0(2131743936, null));
                }
                this.S0.e(14, R.drawable.msg_home, org.telegram.messenger.cd.L0(2131754390, null));
            } else if (a() != 489000) {
                if (this.C2 == null) {
                    S3(context);
                }
                this.S0.e(14, R.drawable.msg_home, org.telegram.messenger.cd.L0(2131754390, null));
                if (this.q2) {
                    this.S0.e(10, R.drawable.msg_share, org.telegram.messenger.cd.L0(2131752982, null));
                    z26 = true;
                } else {
                    this.S0.e(1, R.drawable.msg_addcontact, org.telegram.messenger.cd.L0(2131754453, null));
                    z26 = false;
                }
                if (!TextUtils.isEmpty(Z1.phone)) {
                    this.S0.e(3, R.drawable.msg_share, org.telegram.messenger.cd.L0(2131745479, null));
                }
                if (this.q2) {
                    this.S0.e(44, R.drawable.menu_privacy_policy, org.telegram.messenger.cd.L0(2131753010, null));
                    if (r4()) {
                        this.S0.S(44);
                    } else {
                        this.S0.t(44);
                    }
                    org.telegram.ui.ActionBar.b1 e10 = this.S0.e(24, R.drawable.msg_report, org.telegram.messenger.cd.L0(2131746248, null));
                    int i14 = org.telegram.ui.ActionBar.t6.p7;
                    e10.c(i14, i14);
                    if (this.j1) {
                        this.S0.e(2, R.drawable.msg_retry, org.telegram.messenger.cd.L0(2131752995, null));
                    } else {
                        this.S0.e(2, R.drawable.msg_block2, org.telegram.messenger.cd.L0(2131751575, null)).c(i14, i14);
                    }
                } else {
                    this.S0.e(2, R.drawable.msg_block, !this.j1 ? org.telegram.messenger.cd.L0(2131753693, null) : org.telegram.messenger.cd.L0(2131743936, null));
                }
                if (!org.telegram.messenger.h20.x(Z1) && !this.q2 && this.C2 == null && !this.j1) {
                    j10 = this.d1;
                    if (j10 != 333000 && j10 != 777000 && j10 != 42777) {
                        boolean z30 = org.telegram.messenger.v2.a;
                        if (!Z1.self || Z1.bot || org.telegram.messenger.vp.E2(Z1) || getMessagesController().i7) {
                            z27 = false;
                        } else {
                            rh.e6.y(this.currentAccount, false).U();
                            this.S0.e(38, R.drawable.msg_gift_premium, org.telegram.messenger.cd.L0(2131746652, null));
                            z27 = true;
                        }
                        if (((org.telegram.messenger.j0) getMessagesController().y7.j0.b).c && !org.telegram.messenger.vp.E2(Z1) && !org.telegram.messenger.h20.A(Z1.id)) {
                            this.S0.e(48, R.drawable.ic_gram, org.telegram.messenger.cd.L0(2131743043, null));
                        }
                        this.S0.e(20, R.drawable.msg_secret, org.telegram.messenger.cd.L0(2131744930, null));
                        org.telegram.ui.ActionBar.p5 p5Var2 = this.S0;
                        TL_account.RequirementToContact H2 = getMessagesController().H2(this.d1);
                        p5Var2.Q(20, H2 != null || (H2 instanceof TL_account.requirementToContactEmpty));
                        if (this.u2 != null) {
                            this.S0.e(46, R.drawable.menu_share_off_24, org.telegram.messenger.cd.L0(2131751429, null));
                            this.S0.e(47, R.drawable.menu_share_on_24, org.telegram.messenger.cd.L0(2131751151, null));
                            TLRPC.UserFull userFull2 = this.u2;
                            boolean z31 = (userFull2.noforwards_my_enabled || userFull2.noforwards_peer_enabled) ? false : true;
                            this.S0.Q(46, z31);
                            this.S0.Q(47, !z31);
                        }
                        if (!this.q2 && getContactsController().f0.get(Long.valueOf(this.d1)) != null) {
                            this.S0.e(14, R.drawable.msg_home, org.telegram.messenger.cd.L0(2131754390, null));
                        }
                        z28 = false;
                    }
                }
                z27 = false;
                if (!this.q2) {
                    this.S0.e(14, R.drawable.msg_home, org.telegram.messenger.cd.L0(2131754390, null));
                }
                z28 = false;
            }
            z26 = false;
            if (!org.telegram.messenger.h20.x(Z1)) {
                j10 = this.d1;
                if (j10 != 333000) {
                    boolean z302 = org.telegram.messenger.v2.a;
                    if (Z1.self) {
                    }
                    z27 = false;
                    if (((org.telegram.messenger.j0) getMessagesController().y7.j0.b).c) {
                        this.S0.e(48, R.drawable.ic_gram, org.telegram.messenger.cd.L0(2131743043, null));
                    }
                    this.S0.e(20, R.drawable.msg_secret, org.telegram.messenger.cd.L0(2131744930, null));
                    org.telegram.ui.ActionBar.p5 p5Var22 = this.S0;
                    TL_account.RequirementToContact H22 = getMessagesController().H2(this.d1);
                    p5Var22.Q(20, H22 != null || (H22 instanceof TL_account.requirementToContactEmpty));
                    if (this.u2 != null) {
                    }
                    if (!this.q2) {
                    }
                    z28 = false;
                }
            }
            z27 = false;
            if (!this.q2) {
            }
            z28 = false;
        }
        z17 = z27;
        z13 = false;
        z14 = false;
        z15 = false;
        z16 = false;
        z12 = z26;
        z11 = false;
        if (this.q0 == null) {
        }
        if (t4()) {
        }
        if (this.d1 != 0) {
        }
        if (z28) {
        }
        if (!this.o2) {
        }
        this.K0 = this.L0;
        hg0Var = this.Z;
        if (hg0Var == null) {
        }
        A5(z10);
        K5(z25);
    }

    public final void R4(float f7, float f10) {
        float max = Math.max(0.0f, Math.min(1.0f, (this.P1 - i4()) / ((this.a.getMeasuredWidth() - f10) - j4())));
        float N = ((org.telegram.messenger.i0.N(8.0f) + (org.telegram.messenger.i0.L(42.0f) * ((this.P1 >= ((float) i4()) || max >= 0.33f) ? org.telegram.messenger.i0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) : c3.i0.x(f7, 72.0f, 24.0f, 42.0f)))) * f7) + ((float) Math.floor(this.actionBar.getTranslationY() + (org.telegram.messenger.z20.b(f7, 1.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0) - (org.telegram.messenger.i0.p * 21.0f))));
        this.d2 = (org.telegram.messenger.i0.L(7.0f) * f7) + org.telegram.messenger.i0.L(1.3f) + N;
        this.f2 = (((float) Math.floor(org.telegram.messenger.i0.p * 11.0f)) * f7) + N + org.telegram.messenger.i0.L(24.0f);
    }

    public final void S3(Context context) {
        this.Z0 = new m4.n0(context, this.S0.getPopupLayout().getSwipeBack(), new aw0(this), false, 0, this.z0);
        if (this.h1 > 0 || this.d1 > 0) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, this.z0);
            m4.n0 n0Var = this.Z0;
            org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) n0Var.e;
            if (p80Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131753848, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.N2(org.telegram.messenger.cd.L0(2131753847, null), w02, new org.telegram.ui.Components.tf(n0Var, 11)));
                p80Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.u2;
        org.telegram.ui.Components.f11 a2 = org.telegram.ui.Components.f11.a((userFull == null && this.t2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.t2.ttl_period);
        this.s0 = a2;
        this.Y0 = this.S0.h(0, a2, org.telegram.messenger.cd.L0(2131753846, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z0.a);
        this.S0.a(-1);
        n5();
    }

    public final void S4() {
        bw0 bw0Var = this.a;
        if (bw0Var == null || this.c == null || bw0Var.getChildCount() <= 0 || this.l6) {
            return;
        }
        View view = null;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = -1;
        for (int i12 = 0; i12 < this.a.getChildCount(); i12++) {
            int R = RecyclerView.R(this.a.getChildAt(i12));
            View childAt = this.a.getChildAt(i12);
            if (R != -1 && childAt.getTop() < i10) {
                i10 = childAt.getTop();
                i11 = R;
                view = childAt;
            }
        }
        if (view != null) {
            this.j6 = i11;
            int top = view.getTop();
            this.k6 = top;
            if (this.j6 == 0 && !this.n2 && top > i4()) {
                this.k6 = i4();
            }
            this.c.h1(i11, view.getTop() - this.a.getPaddingTop());
        }
    }

    public final void T3() {
        if (this.fragmentView == null || !this.m6 || this.x2 == null || getParentActivity() == null) {
            return;
        }
        oy0 oy0Var = this.y6;
        if (oy0Var != null) {
            oy0Var.b(this.x2);
            this.y6.invalidate();
        } else {
            oy0 oy0Var2 = new oy0(this, this.x2);
            this.y6 = oy0Var2;
            ((FrameLayout) this.fragmentView).addView(oy0Var2, w7.b6.e(-1, -1, 55));
        }
    }

    public final void T4(boolean z10) {
        int i10 = this.J4;
        if (i10 >= 0) {
            if (!z10) {
                this.c.h1(i10, -this.a.getPaddingTop());
                return;
            }
            ci.p pVar = new ci.p(getParentActivity(), 2, 0.6f);
            pVar.a = this.J4;
            pVar.p = -this.a.getPaddingTop();
            this.c.w0(pVar);
        }
    }

    @Override // org.telegram.ui.Components.a40
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new ed(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 4));
    }

    public final void U3(Context context) {
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            org.telegram.messenger.i0.E2(i5Var);
        }
        ww0 ww0Var = new ww0(this, context, this.z0);
        this.simpleActionBar = ww0Var;
        ww0Var.setTitlesAlpha(0.0f);
        if (!this.l5 && !this.I0 && this.I1 != 0 && this.L1 && !this.M1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        this.simpleActionBar.setMenuOverlayProvider(new cf(3, this));
        if (this.I0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.outline_header_qr_24);
            this.simpleActionBar.setBackButtonContentDescription(org.telegram.messenger.cd.L0(2131746515, null));
        } else {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 23));
        if (this.I0) {
            return;
        }
        View backButton = this.simpleActionBar.getBackButton();
        backButton.setOnLongClickListener(new org.telegram.ui.Components.b0(5, this, backButton));
    }

    @Override // org.telegram.ui.Components.ms0
    public final void V() {
        int i10;
        int i11;
        ix0 ix0Var = this.N;
        if (ix0Var == null || this.r == null) {
            return;
        }
        int closestTab = ix0Var.getClosestTab();
        int[] iArr = this.Q.c;
        if (closestTab == 0) {
            if (iArr[7] <= 0 && iArr[6] <= 0) {
                int i12 = iArr[0];
                if (i12 <= 0) {
                    e5(org.telegram.messenger.cd.L0(2131745427, null));
                    return;
                } else {
                    e5(org.telegram.messenger.cd.G(i12, "Media", new Object[0]));
                    return;
                }
            }
            if (this.N.getPhotosVideosTypeFilter() == 1 || iArr[7] <= 0) {
                e5(org.telegram.messenger.cd.G(iArr[6], "Photos", new Object[0]));
                return;
            }
            if (this.N.getPhotosVideosTypeFilter() == 2 || (i11 = iArr[6]) <= 0) {
                e5(org.telegram.messenger.cd.G(iArr[7], "Videos", new Object[0]));
                return;
            }
            e5(org.telegram.messenger.cd.G(i11, "Photos", new Object[0]) + ", " + org.telegram.messenger.cd.G(iArr[7], "Videos", new Object[0]));
            return;
        }
        if (closestTab == 1) {
            int i13 = iArr[1];
            if (i13 <= 0) {
                e5(org.telegram.messenger.cd.L0(2131750827, null));
                return;
            } else {
                e5(org.telegram.messenger.cd.G(i13, "Files", new Object[0]));
                return;
            }
        }
        if (closestTab == 2) {
            int i14 = iArr[2];
            if (i14 <= 0) {
                e5(org.telegram.messenger.cd.L0(2131743549, null));
                return;
            } else {
                e5(org.telegram.messenger.cd.G(i14, "Voice", new Object[0]));
                return;
            }
        }
        if (closestTab == 3) {
            int i15 = iArr[3];
            if (i15 <= 0) {
                e5(org.telegram.messenger.cd.L0(2131745429, null));
                return;
            } else {
                e5(org.telegram.messenger.cd.G(i15, "Links", new Object[0]));
                return;
            }
        }
        if (closestTab == 4) {
            int i16 = iArr[4];
            if (i16 <= 0) {
                e5(org.telegram.messenger.cd.L0(2131748334, null));
                return;
            } else {
                e5(org.telegram.messenger.cd.G(i16, "MusicFiles", new Object[0]));
                return;
            }
        }
        if (closestTab == 5) {
            int i17 = iArr[5];
            if (i17 <= 0) {
                e5(org.telegram.messenger.cd.L0(2131754879, null));
                return;
            } else {
                e5(org.telegram.messenger.cd.G(i17, "GIFs", new Object[0]));
                return;
            }
        }
        if (closestTab == 6) {
            e5(org.telegram.messenger.cd.G(this.u2.common_chats_count, "CommonGroups", new Object[0]));
            return;
        }
        if (closestTab == 7) {
            e5(this.r.getText());
            return;
        }
        if (closestTab == 8 || org.telegram.ui.Components.zt0.F0(closestTab)) {
            if (this.q2) {
                e5(this.N.d0(false));
                return;
            } else if (this.N.k0(closestTab) > 0) {
                e5(org.telegram.messenger.cd.G(this.N.k0(closestTab), "ProfileStoriesCount", new Object[0]));
                return;
            } else {
                e5(org.telegram.messenger.cd.L0(2131746640, null));
                return;
            }
        }
        if (closestTab == 13) {
            e5(this.N.d0(true));
            return;
        }
        if (closestTab == 9) {
            e5(org.telegram.messenger.cd.G(this.N.k0(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
            return;
        }
        if (closestTab == 10) {
            org.telegram.messenger.wo K0 = org.telegram.messenger.vp.r1(this.currentAccount).K0(a());
            e5(org.telegram.messenger.cd.G(K0 == null ? 0 : K0.b.size() + K0.c, this.q2 ? "Bots" : "Channels", new Object[0]));
            return;
        }
        if (closestTab != 12) {
            if (closestTab == 14) {
                org.telegram.ui.Components.vq0 vq0Var = this.N.a0;
                e5(org.telegram.messenger.cd.H(',', "ProfileGiftsCount", vq0Var != null ? vq0Var.getGiftsCount() : 0));
                return;
            } else {
                if (closestTab == 15) {
                    int i18 = iArr[8];
                    if (i18 <= 0) {
                        e5(org.telegram.messenger.cd.L0(2131745421, null));
                        return;
                    } else {
                        e5(org.telegram.messenger.cd.H(',', "ProfilePollsCount", i18));
                        return;
                    }
                }
                return;
            }
        }
        org.telegram.messenger.gw F1 = getMessagesController().F1();
        long a2 = a();
        ArrayList arrayList = F1.j;
        int i19 = 0;
        while (true) {
            if (i19 >= arrayList.size()) {
                i10 = 0;
                break;
            }
            org.telegram.messenger.fw fwVar = (org.telegram.messenger.fw) arrayList.get(i19);
            if (fwVar.a == a2) {
                i10 = fwVar.e;
                break;
            }
            i19++;
        }
        e5(org.telegram.messenger.cd.G(Math.max(1, i10), "SavedMessagesCount", new Object[0]));
    }

    public final void V4() {
        org.telegram.ui.Components.hg0 hg0Var = this.Z;
        if (hg0Var == null) {
            return;
        }
        if (this.r1) {
            hg0Var.E = 6;
            return;
        }
        if (this.p1) {
            hg0Var.E = 5;
            return;
        }
        if (this.q2) {
            hg0Var.E = 2;
            return;
        }
        if (this.d1 != 0) {
            hg0Var.E = 0;
            return;
        }
        if (this.e1 != 0) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.e1));
            if (!org.telegram.messenger.w3.T(L0)) {
                this.Z.E = 3;
                return;
            }
            if (org.telegram.messenger.w3.n0(L0)) {
                this.Z.E = 3;
            } else if (org.telegram.messenger.w3.c0(L0)) {
                this.Z.E = 4;
            } else {
                this.Z.E = 1;
            }
        }
    }

    public final void W3(float f7) {
        ValueAnimator ofFloat;
        int i10 = 0;
        boolean z10 = f7 > 0.0f;
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.i6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.i6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.x0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new lv0(this, i10));
        this.i6.playTogether(arrayList);
        this.i6.setDuration(z10 ? 150L : 220L);
        if (!z10) {
            this.i6.addListener(new nw0(this, 6));
        }
        this.i6.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W4(float f7) {
        int w02;
        boolean z10;
        iy0 iy0Var;
        int i10;
        int f10;
        rh.g0 g0Var;
        ky0 ky0Var;
        if (this.actionBar == null) {
            return;
        }
        this.glassEngine.g();
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0);
        this.k2 = f7;
        float U1 = org.telegram.messenger.i0.U1(f7, this.l2);
        this.j2 = U1;
        P3();
        this.X.setScaleX(this.a2);
        this.X.setScaleY(this.a2);
        this.X.setTranslationY(org.telegram.messenger.i0.T1((float) Math.ceil(this.Z1), 0.0f, U1));
        this.e0.setRoundRadiusForExpand((int) org.telegram.messenger.i0.T1(p4(), 0.0f, U1));
        jw0 jw0Var = this.e0;
        float f11 = this.a2;
        boolean z11 = this.o2;
        jw0Var.H = U1;
        jw0Var.I = f11;
        jw0Var.G = z11;
        mw0 mw0Var = this.u0;
        if (mw0Var != null) {
            mw0Var.setExpandProgress(U1);
        }
        rh.g0 g0Var2 = this.v0;
        if (g0Var2 != null) {
            g0Var2.setExpandProgress(U1);
        }
        org.telegram.ui.Components.nv0 nv0Var = this.S;
        if (nv0Var != null) {
            nv0Var.setParentExpanded(U1);
        }
        org.telegram.ui.Components.hg0 hg0Var = this.Z;
        if (hg0Var != null) {
            hg0Var.setParentExpanded(U1);
        }
        Y4(U1);
        org.telegram.ui.Components.bh0 bh0Var = this.b0;
        if (bh0Var != null) {
            bh0Var.setParentExpanded(U1);
        }
        org.telegram.ui.ActionBar.p5 p5Var = this.T0;
        if (p5Var != null) {
            float f12 = 1.0f - U1;
            p5Var.setAlpha(f12);
            this.T0.setScaleY(f12);
            this.T0.setVisibility(0);
            org.telegram.ui.ActionBar.p5 p5Var2 = this.T0;
            p5Var2.setClickable(p5Var2.getAlpha() > 0.5f);
        }
        float K3 = K3();
        if (K3 >= 1.0f) {
            this.e0.setAlpha(1.0f);
        }
        if (!this.o2) {
            R4(K3, currentActionBarHeight);
        } else if (this.P1 >= j4() && this.g2 < 0.33f) {
            Q4();
        }
        org.telegram.ui.Components.kl0 kl0Var = this.K;
        if (kl0Var != null) {
            kl0Var.b(i0.b.f(U1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h8, this.z0), Color.argb(org.telegram.messenger.zs.J2, org.telegram.messenger.zs.e4, org.telegram.messenger.zs.e4, org.telegram.messenger.zs.e4)));
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.f6 != null ? -1 : i0.b.f(U1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.dd, this.z0), -1), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.fr frVar = this.I;
        if (frVar != null) {
            frVar.a(U1);
        }
        org.telegram.ui.Components.fr frVar2 = this.J;
        if (frVar2 != null) {
            frVar2.a(U1);
        }
        s5(U1);
        float f13 = this.c2;
        float f14 = this.e2;
        float N = org.telegram.messenger.i0.N(8.0f);
        float N2 = org.telegram.messenger.i0.N(this.o2 ? 8.0f : -24.0f);
        float N3 = org.telegram.messenger.i0.N(18.0f) - ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin;
        float f15 = currentActionBarHeight;
        float d42 = (((this.P1 + f15) - d4()) - org.telegram.messenger.i0.N(30.0f)) - this.f.getBottom();
        float B = c3.i0.B(N3, f13, 2.0f, N + f13);
        float f16 = this.d2;
        float f17 = 1.0f - U1;
        float f18 = f17 * f17;
        float f19 = f17 * 2.0f * U1;
        float f20 = (B * f19) + (f13 * f18);
        float f21 = U1 * U1;
        float f22 = (N3 * f21) + f20;
        float B2 = (d42 * f21) + (c3.i0.B(d42, f16, 2.0f, N2 + f16) * f19) + (f16 * f18);
        float N4 = org.telegram.messenger.i0.N(16.0f) - ((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin;
        float d43 = (((this.P1 + f15) - d4()) - org.telegram.messenger.i0.N(10.0f)) - this.r.getBottom();
        float B3 = c3.i0.B(N4, f14, 2.0f, N + f14);
        float f23 = this.f2;
        float f24 = (N4 * f21) + (B3 * f19) + (f14 * f18);
        float B4 = (f21 * d43) + (f19 * c3.i0.B(d43, f23, 2.0f, N2 + f23)) + (f18 * f23);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0)) - (org.telegram.messenger.i0.p * 21.0f)))) + org.telegram.messenger.i0.L(1.3f);
        float N5 = org.telegram.messenger.i0.N(22.7f) + floor;
        this.f.setTranslationX(f22);
        this.f.setTranslationY(Math.max(floor, B2));
        this.r.setTranslationX(l4(f24, Math.min(1.0f, K3) * this.u6));
        this.r.setTranslationY(m4(Math.max(N5, B4)));
        m5();
        D5();
        Object tag = this.r.getTag();
        if (tag instanceof Integer) {
            Integer num = (Integer) tag;
            w02 = org.telegram.ui.ActionBar.t6.w0(num.intValue(), this.z0);
            if (num.intValue() == org.telegram.ui.ActionBar.t6.pi) {
                z10 = true;
                this.r.setTextColor(i0.b.f(U1, H3(w02, Boolean.valueOf(z10)), -1275068417));
                if (this.P1 > j4()) {
                    this.f.setPivotY(org.telegram.messenger.i0.W1(U1, 0, r5.getMeasuredHeight()));
                    float f25 = (0.12f * K3) + 1.0f;
                    this.f.setScaleX(org.telegram.messenger.i0.T1(f25, 1.38f, U1));
                    this.f.setScaleY(org.telegram.messenger.i0.T1(f25, 1.38f, U1));
                }
                y4(0, Math.min(1.0f, K3), true);
                iy0Var = this.x6;
                if (iy0Var != null) {
                    iy0Var.a(i0.b.f(this.j2, org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.b(0.18f, -0.1f, this.b1)), 603979775));
                }
                kl klVar = this.f;
                if (this.f6 == null) {
                    f10 = -1;
                    i10 = -1;
                } else {
                    i10 = -1;
                    f10 = i0.b.f(this.j2, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ji, this.z0), -1);
                }
                klVar.setTextColor(f10);
                this.actionBar.D(this.f6 == null ? i10 : i0.b.f(U1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v8, this.z0), i10), false);
                this.actionBar.setMenuOffsetSuppressed(true);
                this.e0.setForegroundAlpha(U1);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.X.getLayoutParams();
                layoutParams.width = (int) org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(100.0f), this.a.getMeasuredWidth() / this.a2, U1);
                layoutParams.height = (int) org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(100.0f), (this.P1 + f15) / this.a2, U1);
                c4();
                this.X.requestLayout();
                g0Var = this.v0;
                if (g0Var != null) {
                    g0Var.setExpandProgress(U1);
                }
                p5();
                ky0Var = this.c1;
                if (ky0Var == null && ky0Var.K) {
                    ky0Var.invalidate();
                    return;
                }
            }
        } else {
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, this.z0);
        }
        z10 = false;
        this.r.setTextColor(i0.b.f(U1, H3(w02, Boolean.valueOf(z10)), -1275068417));
        if (this.P1 > j4()) {
        }
        y4(0, Math.min(1.0f, K3), true);
        iy0Var = this.x6;
        if (iy0Var != null) {
        }
        kl klVar2 = this.f;
        if (this.f6 == null) {
        }
        klVar2.setTextColor(f10);
        this.actionBar.D(this.f6 == null ? i10 : i0.b.f(U1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v8, this.z0), i10), false);
        this.actionBar.setMenuOffsetSuppressed(true);
        this.e0.setForegroundAlpha(U1);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.X.getLayoutParams();
        layoutParams2.width = (int) org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(100.0f), this.a.getMeasuredWidth() / this.a2, U1);
        layoutParams2.height = (int) org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(100.0f), (this.P1 + f15) / this.a2, U1);
        c4();
        this.X.requestLayout();
        g0Var = this.v0;
        if (g0Var != null) {
        }
        p5();
        ky0Var = this.c1;
        if (ky0Var == null) {
        }
    }

    @Override // org.telegram.ui.Components.ms0
    public final boolean X() {
        return this.z1;
    }

    public final void X3(int i10, View view) {
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view);
        H.W(this.a.U0(view, false));
        H.w = false;
        H.l(R.drawable.msg_copy, org.telegram.messenger.cd.L0(2131751767, null), new oa0(this, 4), this.u2 != null);
        H.c(R.drawable.msg_edit, org.telegram.messenger.cd.L0(2131751336, null), new oa0(this, 5), false);
        H.c(R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.Components.qq(this, i10, 18), true);
        H.Z();
    }

    public final boolean Y3(final int i10, View view) {
        TLRPC.User f7;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        final int i11 = 0;
        if (this.r1 && (f7 = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.u2;
            if (userFull == null) {
                userFull = getMessagesController().a2(f7.id);
            }
            if (userFull != null) {
                String L0 = org.telegram.messenger.cd.L0(2131751767, null);
                if (i10 == this.J3 || i10 == this.I3 || i10 == this.V2) {
                    str = userFull.about;
                } else if (i10 == this.N3) {
                    str = ag.h2.j0(this.currentAccount, f7, userFull.business_work_hours);
                    L0 = org.telegram.messenger.cd.L0(2131746680, null);
                } else if (i10 == this.O3) {
                    str = userFull.business_location.address;
                    L0 = org.telegram.messenger.cd.L0(2131746675, null);
                } else if (i10 == this.K3) {
                    str = org.telegram.messenger.h20.n(f7);
                    if (str != null) {
                        str = "@".concat(str);
                    }
                    L0 = org.telegram.messenger.cd.L0(2131746693, null);
                } else {
                    str = i10 == this.F3 ? f7.phone : i10 == this.T2 ? UserInfoActivity.d0(this.u2.birthday) : null;
                }
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view);
                H.W(this.a.U0(view, false));
                H.w = false;
                H.i = 3;
                if (i10 == this.O3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, org.telegram.messenger.cd.L0(2131746671, null), new oa0(this, 7), false);
                    }
                    H.c(R.drawable.msg_map, org.telegram.messenger.cd.L0(2131746673, null), new oa0(this, 9), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, L0, new mg0(str, 29), false);
                }
                int i12 = 10;
                final int i13 = 1;
                if (i10 == this.N3) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.cd.L0(2131746679, null), new oa0(this, i12), false);
                    H.c(R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131746678, null), new Runnable(this) { // from class: org.telegram.ui.jv0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i14 = i11;
                            final int i15 = i10;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i14) {
                                case 0:
                                    RectF rectF = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L02 = org.telegram.messenger.cd.L0(2131752762, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                    x1Var.R = L02;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131752763, null);
                                    final int i16 = 1;
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.nv0
                                        @Override // org.telegram.ui.ActionBar.u1
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i17) {
                                            int i18 = i16;
                                            int i19 = i15;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i18) {
                                                case 0:
                                                    RectF rectF2 = ProfileActivity.R6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new pv0(profileActivity2, 3));
                                                    profileActivity2.I5();
                                                    profileActivity2.d.s(i19);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.R6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new pv0(profileActivity2, 1));
                                                    profileActivity2.I5();
                                                    profileActivity2.d.s(i19);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var);
                                    break;
                                default:
                                    RectF rectF2 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L03 = org.telegram.messenger.cd.L0(2131752694, null);
                                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                    x1Var2.R = L03;
                                    x1Var2.T = org.telegram.messenger.cd.L0(2131752695, null);
                                    final int i17 = 0;
                                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.nv0
                                        @Override // org.telegram.ui.ActionBar.u1
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i172) {
                                            int i18 = i17;
                                            int i19 = i15;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i18) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.R6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new pv0(profileActivity2, 3));
                                                    profileActivity2.I5();
                                                    profileActivity2.d.s(i19);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.R6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new pv0(profileActivity2, 1));
                                                    profileActivity2.I5();
                                                    profileActivity2.d.s(i19);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i10 == this.O3) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.cd.L0(2131746674, null), new oa0(this, 11), false);
                    H.c(R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131746672, null), new Runnable(this) { // from class: org.telegram.ui.jv0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i14 = i13;
                            final int i15 = i10;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i14) {
                                case 0:
                                    RectF rectF = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L02 = org.telegram.messenger.cd.L0(2131752762, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                    x1Var.R = L02;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131752763, null);
                                    final int i16 = 1;
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.nv0
                                        @Override // org.telegram.ui.ActionBar.u1
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i172) {
                                            int i18 = i16;
                                            int i19 = i15;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i18) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.R6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new pv0(profileActivity2, 3));
                                                    profileActivity2.I5();
                                                    profileActivity2.d.s(i19);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.R6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new pv0(profileActivity2, 1));
                                                    profileActivity2.I5();
                                                    profileActivity2.d.s(i19);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var);
                                    break;
                                default:
                                    RectF rectF2 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L03 = org.telegram.messenger.cd.L0(2131752694, null);
                                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                    x1Var2.R = L03;
                                    x1Var2.T = org.telegram.messenger.cd.L0(2131752695, null);
                                    final int i17 = 0;
                                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.nv0
                                        @Override // org.telegram.ui.ActionBar.u1
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i172) {
                                            int i18 = i17;
                                            int i19 = i15;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i18) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.R6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new pv0(profileActivity2, 3));
                                                    profileActivity2.I5();
                                                    profileActivity2.d.s(i19);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.R6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new pv0(profileActivity2, 1));
                                                    profileActivity2.I5();
                                                    profileActivity2.d.s(i19);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i10 == this.K3) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.cd.L0(2131746635, null), new oa0(this, 12), false);
                } else if (i10 == this.J3 || i10 == this.I3 || i10 == this.V2) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.cd.L0(2131746692, null), new oa0(this, 13), false);
                } else if (i10 == this.F3) {
                    H.c(R.drawable.menu_storage_path, org.telegram.messenger.cd.L0(2131746661, null), new oa0(this, 14), false);
                } else if (i10 == this.T2) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.cd.L0(2131746738, null), new Runnable(this) { // from class: org.telegram.ui.hv0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i14 = i11;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i14) {
                                case 0:
                                    RectF rectF = ProfileActivity.R6;
                                    profileActivity.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.l(profileActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131751239, null), org.telegram.messenger.cd.L0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.vg(26, profileActivity, userFull2), new oa0(profileActivity, 15), false, false, profileActivity.z0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L02 = org.telegram.messenger.cd.L0(2131753717, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                    x1Var.R = L02;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131753718, null);
                                    final int i15 = 0;
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.mv0
                                        @Override // org.telegram.ui.ActionBar.u1
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i16) {
                                            int i17 = i15;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i17) {
                                                case 0:
                                                    RectF rectF3 = ProfileActivity.R6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().l2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new pv0(profileActivity2, 2));
                                                    profileActivity2.C5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.R6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new pv0(profileActivity2, 0));
                                                    profileActivity2.C5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L03 = org.telegram.messenger.cd.L0(2131746697, null);
                                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                    x1Var2.R = L03;
                                    x1Var2.T = org.telegram.messenger.cd.L0(2131746698, null);
                                    final int i16 = 1;
                                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.mv0
                                        @Override // org.telegram.ui.ActionBar.u1
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i162) {
                                            int i17 = i16;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i17) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.R6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().l2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new pv0(profileActivity2, 2));
                                                    profileActivity2.C5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.R6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new pv0(profileActivity2, 0));
                                                    profileActivity2.C5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var2);
                                    break;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131746336, null), new Runnable(this) { // from class: org.telegram.ui.hv0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i14 = i13;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i14) {
                                case 0:
                                    RectF rectF = ProfileActivity.R6;
                                    profileActivity.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.l(profileActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131751239, null), org.telegram.messenger.cd.L0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.vg(26, profileActivity, userFull2), new oa0(profileActivity, 15), false, false, profileActivity.z0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L02 = org.telegram.messenger.cd.L0(2131753717, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                    x1Var.R = L02;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131753718, null);
                                    final int i15 = 0;
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.mv0
                                        @Override // org.telegram.ui.ActionBar.u1
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i162) {
                                            int i17 = i15;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i17) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.R6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().l2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new pv0(profileActivity2, 2));
                                                    profileActivity2.C5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.R6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new pv0(profileActivity2, 0));
                                                    profileActivity2.C5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L03 = org.telegram.messenger.cd.L0(2131746697, null);
                                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                    x1Var2.R = L03;
                                    x1Var2.T = org.telegram.messenger.cd.L0(2131746698, null);
                                    final int i16 = 1;
                                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.mv0
                                        @Override // org.telegram.ui.ActionBar.u1
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i162) {
                                            int i17 = i16;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i17) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.R6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().l2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new pv0(profileActivity2, 2));
                                                    profileActivity2.C5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.R6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new pv0(profileActivity2, 0));
                                                    profileActivity2.C5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i10 == this.P2) {
                    TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(userFull.personal_channel_id));
                    if (L02 != null && org.telegram.messenger.w3.K(L02, false) != null) {
                        H.c(R.drawable.msg_copy, org.telegram.messenger.cd.L0(2131746696, null), new et0(i12, this, L02), false);
                    }
                    H.c(R.drawable.msg_edit, org.telegram.messenger.cd.L0(2131746699, null), new oa0(this, 8), false);
                    final int i14 = 2;
                    H.c(R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131746336, null), new Runnable(this) { // from class: org.telegram.ui.hv0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i142 = i14;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i142) {
                                case 0:
                                    RectF rectF = ProfileActivity.R6;
                                    profileActivity.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.l(profileActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131751239, null), org.telegram.messenger.cd.L0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.vg(26, profileActivity, userFull2), new oa0(profileActivity, 15), false, false, profileActivity.z0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L022 = org.telegram.messenger.cd.L0(2131753717, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                    x1Var.R = L022;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131753718, null);
                                    final int i15 = 0;
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.mv0
                                        @Override // org.telegram.ui.ActionBar.u1
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i162) {
                                            int i17 = i15;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i17) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.R6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().l2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new pv0(profileActivity2, 2));
                                                    profileActivity2.C5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.R6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new pv0(profileActivity2, 0));
                                                    profileActivity2.C5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String L03 = org.telegram.messenger.cd.L0(2131746697, null);
                                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                    x1Var2.R = L03;
                                    x1Var2.T = org.telegram.messenger.cd.L0(2131746698, null);
                                    final int i16 = 1;
                                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.mv0
                                        @Override // org.telegram.ui.ActionBar.u1
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i162) {
                                            int i17 = i16;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i17) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.R6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().l2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new pv0(profileActivity2, 2));
                                                    profileActivity2.C5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.R6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new pv0(profileActivity2, 0));
                                                    profileActivity2.C5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    profileActivity.showDialog(x1Var2);
                                    break;
                            }
                        }
                    }, true);
                }
                if (H.x() > 0) {
                    H.Z();
                    return true;
                }
            }
        }
        return false;
    }

    public final void Y4(float f7) {
        this.J5 = f7;
        org.telegram.ui.Components.kg0 kg0Var = this.I5;
        if (kg0Var != null) {
            kg0Var.b(f7);
        }
        z5();
    }

    public final boolean Z3() {
        View view;
        if ((this.I0 || (!org.telegram.messenger.i0.Q1() && !this.m2)) && this.e0.getImageReceiver().L() && !org.telegram.messenger.i0.C1()) {
            this.F0 = true;
            this.n2 = true;
            int i10 = 0;
            while (true) {
                if (i10 >= this.a.getChildCount()) {
                    view = null;
                    break;
                }
                if (RecyclerView.R(this.a.getChildAt(i10)) == 0) {
                    view = this.a.getChildAt(i10);
                    break;
                }
                i10++;
            }
            if (view != null) {
                bw0 bw0Var = this.a;
                View F = bw0Var.F(view);
                s4.c1 T = F != null ? bw0Var.T(F) : null;
                if (T != null) {
                    Integer num = (Integer) this.X1.get(Integer.valueOf(T.b()));
                    if (num != null) {
                        this.O1 = true;
                        this.a.w0(0, -(((this.a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.gr.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void Z4(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.t2 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.l1 == 0) {
                this.l1 = -j10;
                getMediaDataController().e0(this.l1, this.classGuid, this.f1);
            }
        }
        ix0 ix0Var = this.N;
        if (ix0Var != null) {
            ix0Var.setChatInfo(this.t2);
        }
        kw0 kw0Var = this.n0;
        if (kw0Var != null && !this.p1) {
            kw0Var.setChatInfo(this.t2);
        }
        mw0 mw0Var = this.u0;
        if (mw0Var != null && (chatFull3 = this.t2) != null) {
            mw0Var.setStories(chatFull3.stories);
        }
        rh.g0 g0Var = this.v0;
        if (g0Var != null) {
            g0Var.a();
        }
        jw0 jw0Var = this.e0;
        if (jw0Var != null) {
            jw0Var.setHasStories(w4());
        }
        a4();
        if (this.e1 != 0) {
            boolean z10 = org.telegram.messenger.v2.a;
            boolean z11 = (getMessagesController().i7 || (chatFull2 = this.t2) == null || !chatFull2.stargifts_available) ? false : true;
            this.S0.Q(38, z11);
            org.telegram.ui.Components.hg0 hg0Var = this.Z;
            if (hg0Var != null) {
                hg0Var.o(3, z11);
            }
        }
    }

    public final long a() {
        long j10 = this.h1;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.d1;
        return j11 != 0 ? j11 : -this.e1;
    }

    public final void a4() {
        TLRPC.Chat chat = this.D2;
        if (chat == null || !chat.megagroup) {
            return;
        }
        TLRPC.ChatFull chatFull = this.t2;
        if (!(chatFull instanceof TLRPC.TL_channelFull) || chatFull.participants == null) {
            return;
        }
        for (int i10 = 0; i10 < this.t2.participants.participants.size(); i10++) {
            TLRPC.ChatParticipant chatParticipant = this.t2.participants.participants.get(i10);
            this.B1.k(chatParticipant, chatParticipant.user_id);
        }
    }

    public final void a5(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Y == null || (tL_emojiStatusCollectible2 = this.C6) == tL_emojiStatusCollectible) {
            return;
        }
        if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
            this.C6 = tL_emojiStatusCollectible;
            vh.p2 p2Var = this.z6;
            int i10 = 1;
            if (p2Var != null) {
                p2Var.e(true);
            }
            if (tL_emojiStatusCollectible == null || TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                return;
            }
            this.B6 = null;
            this.z6 = new vh.p2(getParentActivity(), 3);
            this.A6 = org.telegram.ui.ActionBar.t6.w(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.t6.r1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
            int i11 = 0;
            this.z6.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(2.0f));
            vh.p2 p2Var2 = this.z6;
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
            p2Var2.A0 = true;
            p2Var2.I0 = System.currentTimeMillis();
            p2Var2.B0 = new Path();
            p2Var2.C0 = org.telegram.messenger.i0.N(0.66f) / 2.0f;
            p2Var2.D0 = new Paint(1);
            p2Var2.E0 = new Paint(1);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, r12), org.telegram.ui.ActionBar.t6.r1(1.0f, r12), org.telegram.ui.ActionBar.t6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            p2Var2.H0 = linearGradient;
            p2Var2.E0.setShader(linearGradient);
            p2Var2.F0 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, r12), org.telegram.ui.ActionBar.t6.r1(0.5f, r12), org.telegram.ui.ActionBar.t6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            p2Var2.G0 = new Matrix();
            p2Var2.D0.setShader(p2Var2.F0);
            p2Var2.E0.setStyle(Paint.Style.STROKE);
            p2Var2.E0.setStrokeJoin(Paint.Join.ROUND);
            p2Var2.E0.setStrokeCap(Paint.Cap.ROUND);
            p2Var2.E0.setStrokeWidth(org.telegram.messenger.i0.N(0.66f));
            this.Y.addView(this.z6, w7.b6.c(24.0f, -1));
            this.z6.t(9.33f);
            vh.p2 p2Var3 = this.z6;
            Typeface o10 = org.telegram.messenger.i0.o();
            p2Var3.H.x(o10);
            p2Var3.J.setTypeface(o10);
            this.z6.s(tL_emojiStatusCollectible.title);
            vh.p2 p2Var4 = this.z6;
            p2Var4.d = -1L;
            p2Var4.k(5.66f, 2.66f, 5.66f, 2.66f);
            vh.p2 p2Var5 = this.z6;
            p2Var5.getClass();
            p2Var5.D = org.telegram.messenger.i0.N(4.0f);
            p2Var5.E = org.telegram.messenger.i0.N(2.66f);
            this.z6.r();
            this.z6.q(16.0f);
            this.z6.u();
            this.z6.setOnClickListener(new sv0(this, tL_emojiStatusCollectible.slug, i10));
            if (this.P1 < org.telegram.messenger.i0.L(82.0f)) {
                this.B6 = Boolean.FALSE;
                this.z6.setAlpha(0.0f);
            }
            p5();
            vh.p2 p2Var6 = this.z6;
            Objects.requireNonNull(p2Var6);
            org.telegram.messenger.i0.h3(new wv0(p2Var6, i11), 6000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.h8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f8));
    }

    public final boolean b4() {
        org.telegram.ui.ActionBar.z4 z4Var;
        if (this.I1 == 0 || (z4Var = this.parentLayout) == null || z4Var.getFragmentStack() == null || this.parentLayout.getFragmentStack().size() < 2 || !(this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof un)) {
            return false;
        }
        finishFragment();
        return true;
    }

    public final void c4() {
        if (this.a == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.X.getLayoutParams();
        float x10 = org.telegram.ui.Cells.f1.x(layoutParams.width, this.a2, 0.5f, this.a.getMeasuredWidth() / 2.0f);
        this.Y1 = x10;
        if (this.F1) {
            this.Y1 = org.telegram.messenger.i0.T1(this.d6, x10, this.R1);
        }
        this.X.setTranslationX(this.Y1);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean canBeginSlide() {
        if (this.N.G0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void clearViews() {
        this.f6 = null;
        super.clearViews();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r1 == null) goto L17;
     */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        LaunchActivity launchActivity;
        sn snVar;
        org.telegram.ui.ActionBar.y3 y3Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.k2 lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof un) && (snVar = ((un) lastFragment).xa) != null && (y3Var = snVar.f) != null) {
            if (y3Var != null) {
                TLRPC.ChatTheme chatTheme = y3Var.d;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    }
                }
                tL_starGiftUnique = null;
            }
            this.z0 = lastFragment.getResourceProvider();
        }
        int i10 = 6;
        kg.g1 g1Var = new kg.g1(this, context, this.z0, i10);
        boolean z10 = true;
        g1Var.setForceSkipTouches(true);
        g1Var.setBackgroundColor(0);
        g1Var.C(this.f6 != null ? 553648127 : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f8, this.z0), false);
        int i11 = org.telegram.ui.ActionBar.t6.v8;
        g1Var.D(org.telegram.ui.ActionBar.t6.w0(i11, this.z0), false);
        g1Var.D(org.telegram.ui.ActionBar.t6.w0(i11, this.z0), true);
        g1Var.setCastShadows(false);
        g1Var.setAddToContainer(false);
        g1Var.setClipContent(true);
        if (!this.I0 && (((z4Var = this.parentLayout) == null || !((ActionBarLayout) z4Var).b) && ((org.telegram.messenger.i0.Q1() || this.inBubbleMode) && (!org.telegram.messenger.i0.Q1() || this.inBubbleMode || (z4Var2 = this.parentLayout) == null || (launchActivity = LaunchActivity.I1) == null || z4Var2 != launchActivity.s0)))) {
            z10 = false;
        }
        g1Var.setOccupyStatusBar(z10);
        if (!this.I0) {
            g1Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
            g1Var.getBackButton().setTranslationX(org.telegram.messenger.i0.L(2.0f));
            ImageView backButton = g1Var.getBackButton();
            backButton.setOnLongClickListener(new org.telegram.ui.Components.b0(4, this, backButton));
            return g1Var;
        }
        g1Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        g1Var.getBackButton().setTranslationX(org.telegram.messenger.i0.L(2.0f));
        g1Var.e.setContentDescription(org.telegram.messenger.cd.L0(2131746515, null));
        g1Var.e.setImageResource(R.drawable.outline_header_qr_24);
        g1Var.e.setColorFilter(org.telegram.ui.ActionBar.t6.w0(i11, this.z0), PorterDuff.Mode.SRC_IN);
        g1Var.e.setOnClickListener(new iv0(this, i10));
        return g1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v263, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        tg.b bVar;
        int i10;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        ?? r12;
        TLRPC.Document document;
        int i11;
        Object obj;
        org.telegram.ui.Components.gr grVar;
        int i12;
        TLRPC.UserFull userFull2;
        int i13;
        TLRPC.ChatParticipants chatParticipants;
        un unVar;
        sn snVar;
        org.telegram.ui.ActionBar.t6.Z(context);
        ?? r02 = 0;
        org.telegram.ui.ActionBar.t6.K(context, false);
        org.telegram.ui.ActionBar.k2 lastFragment = this.parentLayout.getLastFragment();
        StateListAnimator stateListAnimator = null;
        if ((lastFragment instanceof un) && (snVar = (unVar = (un) lastFragment).xa) != null && snVar.l() != null) {
            org.telegram.ui.ActionBar.y3 y3Var = unVar.xa.f;
            if (y3Var != null) {
                TLRPC.ChatTheme chatTheme = y3Var.d;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = starGift instanceof TL_stars.TL_starGiftUnique ? (TL_stars.TL_starGiftUnique) starGift : null;
                }
            }
            this.z0 = lastFragment.getResourceProvider();
        }
        this.S1 = 0;
        this.T1 = 1.0f;
        this.V1 = false;
        this.hasOwnBackground = true;
        this.P1 = i4();
        this.actionBar.setActionBarMenuOnItemClick(new dx0(this, context));
        ix0 ix0Var = this.N;
        if (ix0Var != null) {
            ix0Var.N0();
        }
        long j10 = this.h1;
        if (j10 == 0) {
            j10 = this.d1;
            if (j10 == 0) {
                j10 = -this.e1;
            }
        }
        this.fragmentView = new gx0(this, context);
        zg.h hVar = new zg.h(this.fragmentView);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        tg.b bVar2 = this.J6;
        bVar2.g(hVar, viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        if (this.r1) {
            this.s5 = new FrameLayout(context);
            this.t5 = new FrameLayout[2];
            this.w5 = new vh.d[2];
            int i14 = 0;
            for (int i15 = 2; i14 < i15; i15 = 2) {
                dg0 dg0Var = new dg0(context);
                vg.f b10 = getBaseSimpleGlass().c.b(dg0Var, new wg.b(org.telegram.ui.ActionBar.t6.d6, this.z0));
                b10.p(org.telegram.messenger.i0.L(8.0f));
                b10.q(org.telegram.messenger.i0.L(22.0f));
                dg0Var.setBackground(b10);
                this.t5[i14] = new FrameLayout(context);
                this.w5[i14] = new vh.d(context, this.z0);
                this.w5[i14].setRoundRadius(org.telegram.messenger.i0.L(19.0f));
                this.w5[i14].setUseWrapContent(true);
                this.w5[i14].setPadding(org.telegram.messenger.i0.L(16.0f), r02, org.telegram.messenger.i0.L(16.0f), r02);
                if (i14 == 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                    this.u5 = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(R.drawable.filled_premium_camera), r02, 1, 33);
                    this.u5.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.cd.K0(2131744827));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
                    this.v5 = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.dq(R.drawable.filled_add_album), r02, 1, 33);
                    this.v5.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.cd.K0(2131744822));
                    this.w5[i14].h(this.u5, r02);
                } else {
                    this.w5[i14].h(org.telegram.messenger.cd.K0(2131744512), r02);
                }
                dg0Var.setOnClickListener(new bh.f(this, i14, 25));
                w7.e6.b(dg0Var, 0.02f, 1.2f);
                this.w5[i14].setStateListAnimator(stateListAnimator);
                dg0Var.addView(this.w5[i14], w7.b6.e(-2, -1, 17));
                this.t5[i14].addView(dg0Var, w7.b6.e(-2, 60, 1));
                this.s5.addView(this.t5[i14], w7.b6.e(-1, -1, 87));
                if (i14 == 1 || !getMessagesController().T4()) {
                    X4(this.t5[i14], 1.0f);
                }
                i14++;
                r02 = 0;
                stateListAnimator = null;
            }
        }
        TLRPC.ChatFull chatFull2 = this.t2;
        ArrayList arrayList = (chatFull2 == null || (chatParticipants = chatFull2.participants) == null || chatParticipants.participants.size() <= 5) ? null : this.B2;
        if (this.w1) {
            bVar = bVar2;
            z10 = true;
            i10 = 6;
        } else if (!this.s1 || (((userFull = this.u2) == null || userFull.stargifts_count <= 0) && ((chatFull = this.t2) == null || chatFull.stargifts_count <= 0))) {
            z10 = true;
            if (this.q1) {
                i10 = 10;
                bVar = bVar2;
            } else {
                bVar = bVar2;
                i10 = arrayList != null ? 7 : -1;
            }
        } else {
            z10 = true;
            this.v1 = true;
            bVar = bVar2;
            i10 = 14;
        }
        U3(context);
        tg.b bVar3 = bVar;
        org.telegram.ui.Components.rt0 rt0Var = this.Q;
        TLRPC.UserFull userFull3 = this.u2;
        long j11 = j10;
        ix0 ix0Var2 = new ix0(this, context, j11, rt0Var, userFull3 != null ? userFull3.common_chats_count : 0, this.B2, this.t2, userFull3, i10, this.x1, this, this, this.z0, getBaseSimpleGlass().c);
        this.N = ix0Var2;
        ix0Var2.setLayoutParams(new s4.o0(-1, -1));
        int i16 = 4;
        if (this.d1 == 0 || this.q0 == null || this.r1) {
            this.b0 = new org.telegram.ui.Components.bh0(context);
            org.telegram.ui.Components.ig0 ig0Var = new org.telegram.ui.Components.ig0(context);
            this.c0 = ig0Var;
            this.b0.setTrailingView(ig0Var);
            org.telegram.ui.Components.kg0 kg0Var = this.I5;
            if (kg0Var != null) {
                this.b0.setGlassFactory(kg0Var.c);
            }
            this.c0.setOnClickListener(new iv0(this, i16));
            this.b0.setColor(this.f6);
            TLRPC.UserFull userFull4 = this.u2;
            if (userFull4 != null && (document = userFull4.saved_music) != null) {
                this.b0.setMusicDocument(document);
            }
            int i17 = 5;
            this.b0.setOnClickListener(new iv0(this, i17));
            this.Z = new org.telegram.ui.Components.hg0(context, org.telegram.messenger.i0.L(74.0f));
            V4();
            r12 = 0;
            E5(false);
            this.Z.setOnActionClickListener(new bv0(this, i17));
        } else {
            r12 = 0;
        }
        org.telegram.ui.ActionBar.o5 o10 = this.simpleActionBar.o();
        if (this.d1 == getUserConfig().n && !this.r1 && org.telegram.messenger.i5.r(this.currentAccount).v(7) == null) {
            org.telegram.messenger.i5.r(this.currentAccount).C();
        }
        if (this.q0 != null && !this.r1) {
            org.telegram.ui.ActionBar.p5 b11 = o10.b(32, R.drawable.outline_header_search);
            b11.M();
            b11.J(new ag.l3(this, 19));
            this.T0 = b11;
            b11.setContentDescription(org.telegram.messenger.cd.K0(2131745776));
            this.T0.setSearchFieldHint(org.telegram.messenger.cd.K0(2131745776));
            this.N.getSearchItem().setVisibility(8);
            if (this.N.getSearchOptionsItem() != null) {
                this.N.getSearchOptionsItem().setVisibility(8);
            }
            if (this.N.getSaveItem() != null) {
                this.N.getSaveItem().setVisibility(8);
            }
            if (this.m1) {
                this.T0.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.p5 b12 = o10.b(16, R.drawable.profile_video);
        this.Q0 = b12;
        b12.setContentDescription(org.telegram.messenger.cd.K0(2131743637));
        if (this.e1 != 0) {
            this.P0 = o10.b(15, R.drawable.msg_voicechat2);
            if (org.telegram.messenger.w3.W(this.D2)) {
                this.P0.setContentDescription(org.telegram.messenger.cd.K0(2131743473));
            } else {
                this.P0.setContentDescription(org.telegram.messenger.cd.K0(2131743332));
            }
        } else {
            org.telegram.ui.ActionBar.p5 b13 = o10.b(15, R.drawable.call);
            this.P0 = b13;
            b13.setContentDescription(org.telegram.messenger.cd.K0(2131752634));
        }
        if (this.r1) {
            org.telegram.ui.ActionBar.p5 b14 = o10.b(41, R.drawable.group_edit_profile);
            this.R0 = b14;
            b14.setContentDescription(org.telegram.messenger.cd.K0(2131751336));
        } else {
            org.telegram.ui.ActionBar.p5 b15 = o10.b(12, R.drawable.group_edit_profile);
            this.R0 = b15;
            b15.setContentDescription(org.telegram.messenger.cd.K0(2131751336));
        }
        org.telegram.ui.ActionBar.p5 a2 = o10.a();
        this.S0 = a2;
        a2.setSubMenuDelegate(new aw0(this));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.v8, this.z0, PorterDuff.Mode.MULTIPLY);
        org.telegram.messenger.i0.V3(0.8f, this.X0, r12, r12);
        this.X0.setImageResource(R.drawable.msg_mini_autodelete_timer);
        this.S0.addView(this.X0, w7.b6.d(12, 12.0f, 19, 8.0f, 2.0f, 0.0f, 0.0f));
        this.S0.setContentDescription(org.telegram.messenger.cd.K0(2131754839));
        this.S0.L(bVar3, w7.b9.g(this.resourceProvider));
        if (this.a == null || this.q0 == null) {
            i11 = -1;
            obj = null;
        } else {
            int L0 = this.c.L0();
            View m10 = this.c.m(L0);
            if (m10 != null) {
                m10.getTop();
                this.a.getPaddingTop();
            } else {
                L0 = -1;
            }
            i11 = L0;
            obj = this.s.getTag();
        }
        R3(r12);
        this.d = new xx0(this, context);
        this.e = new hy0(context, this);
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8();
        this.p0 = r8Var;
        r8Var.p = 2.3809524f;
        r8Var.t();
        this.fragmentView.setWillNotDraw(r12);
        gx0 gx0Var = (gx0) this.fragmentView;
        this.m5 = gx0Var;
        gx0Var.setClipChildren(r12);
        bw0 bw0Var = new bw0(this, context, this.z0);
        this.a = bw0Var;
        bw0Var.setLegacySections(r12);
        this.a.r1();
        bw0 bw0Var2 = this.a;
        bw0Var2.getClass();
        bw0Var2.setSectionsOverscanTop(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m);
        bw0 bw0Var3 = this.a;
        int i18 = org.telegram.ui.ActionBar.t6.a7;
        org.telegram.ui.ActionBar.a7.i(i18, bw0Var3, this.z0);
        this.a.setVerticalScrollBarEnabled(r12);
        tg.j jVar = new tg.j(this.a, (ViewGroup) this.fragmentView, new m50(this, 1));
        jVar.h = true;
        cw0 cw0Var = new cw0(this);
        this.a.setItemAnimator(cw0Var);
        cw0Var.e = 320L;
        cw0Var.d = 320L;
        cw0Var.c = 320L;
        cw0Var.m = r12;
        cw0Var.S();
        org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.h;
        cw0Var.o(grVar2);
        this.a.setClipToPadding(r12);
        this.a.setClipChildren(r12);
        this.a.setHideIfEmpty(r12);
        dw0 dw0Var = new dw0(this);
        this.c = dw0Var;
        dw0Var.j1(1);
        dw0 dw0Var2 = this.c;
        dw0Var2.r = r12;
        this.a.setLayoutManager(dw0Var2);
        this.a.setGlowColor(r12);
        this.a.setAdapter(this.d);
        frameLayout.addView(this.a, w7.b6.e(-1, -1, 51));
        this.a.setOnItemClickListener(new org.telegram.messenger.voip.d0(this, context, j11, 4));
        this.a.setOnItemLongClickListener(new gw0(this, context));
        if (this.q1 || this.s1 || this.w1) {
            I5();
            I();
            this.l6 = true;
            this.j6 = this.J4;
            this.k6 = r12;
        }
        if (this.T0 != null) {
            org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context);
            this.b = tk0Var;
            tk0Var.setVerticalScrollBarEnabled(r12);
            this.b.setLayoutManager(new s4.a0(1, r12));
            org.telegram.ui.ActionBar.a7.I(this.b, org.telegram.ui.ActionBar.t6.e8, this.z0);
            this.b.setAdapter(this.e);
            this.b.setItemAnimator(null);
            this.b.setVisibility(8);
            this.b.setLayoutAnimation(null);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this.b, this.z0);
            frameLayout.addView(this.b, w7.b6.e(-1, -1, 51));
            this.b.setOnItemClickListener(new g(this, 28));
            this.b.setOnItemLongClickListener(new bv0(this, 6));
            this.b.setOnScrollListener(new hw0(this, r12));
            this.b.o1(1, true);
            org.telegram.ui.Components.dw0 dw0Var3 = new org.telegram.ui.Components.dw0(context);
            this.O = dw0Var3;
            dw0Var3.setAnimateLayoutChange(true);
            this.O.e.setVisibility(8);
            this.O.setVisibility(8);
            frameLayout.addView(this.O);
            this.e.G();
        }
        if (this.D1 != 0) {
            grVar = grVar2;
            TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(this.D1));
            if (this.F2 == null) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = org.telegram.messenger.vp.h1(L02);
                tL_channels_getParticipant.participant = getMessagesController().i1(this.d1);
                i13 = 4;
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new pv0(this, i13));
            } else {
                i13 = 4;
            }
            dg0 dg0Var2 = new dg0(context, i13);
            dg0Var2.setWillNotDraw(r12);
            dg0Var2.setPadding(r12, r12, r12, org.telegram.messenger.i0.n);
            frameLayout.addView(dg0Var2, w7.b6.a(-1.0f, (org.telegram.messenger.i0.n / org.telegram.messenger.i0.p) + 51.0f, 83));
            dg0Var2.setOnClickListener(new rv0(r12, this, L02));
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.p7, this.z0);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setText(org.telegram.messenger.cd.K0(2131753728));
            dg0Var2.addView(textView, w7.b6.d(-2, -2.0f, 17, 0.0f, 1.0f, 0.0f, 0.0f));
            this.a.setPadding(r12, i4(), r12, org.telegram.messenger.i0.L(48.0f));
            this.a.setBottomGlowOffset(org.telegram.messenger.i0.L(48.0f));
        } else {
            grVar = grVar2;
            this.a.setPadding(r12, i4(), r12, r12);
        }
        ky0 ky0Var = new ky0(this, context);
        this.c1 = ky0Var;
        ky0Var.a(this.f6, r12);
        this.c1.setBackgroundColor(getThemedColor(i18));
        frameLayout.addView(this.c1);
        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(context);
        this.d0 = nVar;
        nVar.setPivotX(org.telegram.messenger.i0.L(30.0f));
        this.d0.setPivotY(org.telegram.messenger.i0.L(30.0f));
        int i19 = 22;
        this.X = new l0(this, context, i19);
        this.Y = new fg.i(this, context, i19);
        ImageReceiver imageReceiver = new ImageReceiver(this.Y);
        this.r5 = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(11.0f));
        org.telegram.messenger.i0.V3(1.0f, this.Y, true, r12);
        this.Y.setClipChildren(r12);
        frameLayout.addView(this.Y, w7.b6.d(-1, -1.0f, 8388611, 0.0f, 0.0f, 0.0f, 0.0f));
        this.X.setPivotX(0.0f);
        this.X.setPivotY(0.0f);
        org.telegram.ui.Components.yg0 yg0Var = new org.telegram.ui.Components.yg0(context);
        this.t0 = yg0Var;
        yg0Var.addView(this.X, w7.b6.e(100, 100, 51));
        this.Y.addView(this.t0, w7.b6.c(-1.0f, -1));
        jw0 jw0Var = new jw0(context);
        this.e0 = jw0Var;
        jw0Var.v(d4());
        this.e0.getImageReceiver().T(true);
        this.e0.setRoundRadiusForExpand(p4());
        this.e0.setPivotX(0.0f);
        this.e0.setPivotY(0.0f);
        this.X.addView(this.e0, w7.b6.c(-1.0f, -1));
        this.e0.setOnClickListener(new iv0(this, 11));
        this.e0.setHasStories(w4());
        this.e0.setOnLongClickListener(new s(this, 6));
        org.telegram.ui.Cells.d4 d4Var = new org.telegram.ui.Cells.d4(this, context);
        this.g0 = d4Var;
        d4Var.setSize(org.telegram.messenger.i0.L(26.0f));
        this.g0.setProgressColor(-1);
        this.g0.setNoProgress(r12);
        this.X.addView(this.g0, w7.b6.c(-1.0f, -1));
        ImageView imageView2 = new ImageView(context);
        this.h0 = imageView2;
        imageView2.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f));
        ImageView imageView3 = this.h0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        this.h0.setAlpha(0.0f);
        this.h0.setScaleX(0.85f);
        this.h0.setScaleY(0.85f);
        ImageView imageView4 = this.h0;
        org.telegram.ui.Components.f11 f11Var = new org.telegram.ui.Components.f11(context, null);
        this.l0 = f11Var;
        imageView4.setImageDrawable(f11Var);
        this.h0.setTranslationY(-1.0f);
        frameLayout.addView(this.h0, w7.b6.e(34, 34, 51));
        ImageView imageView5 = new ImageView(context);
        this.i0 = imageView5;
        imageView5.setScaleType(scaleType);
        this.i0.setAlpha(0.0f);
        this.i0.setImageDrawable(new yg.c());
        frameLayout.addView(this.i0, w7.b6.e(16, 16, 51));
        ImageView imageView6 = new ImageView(context);
        this.j0 = imageView6;
        imageView6.setImageResource(R.drawable.star_small_outline);
        org.telegram.ui.ActionBar.a7.t(this.j0, org.telegram.ui.ActionBar.t6.s8, this.z0, PorterDuff.Mode.SRC_IN);
        this.j0.setAlpha(0.0f);
        this.j0.setScaleY(0.0f);
        this.j0.setScaleX(0.0f);
        frameLayout.addView(this.j0, w7.b6.e(20, 20, 51));
        ImageView imageView7 = new ImageView(context);
        this.k0 = imageView7;
        imageView7.setImageResource(R.drawable.star_small_inner);
        this.k0.setAlpha(0.0f);
        this.k0.setScaleY(0.0f);
        this.k0.setScaleX(0.0f);
        frameLayout.addView(this.k0, w7.b6.e(20, 20, 51));
        J5();
        i5(r12, r12);
        kw0 kw0Var = this.n0;
        if (kw0Var != null) {
            kw0Var.K();
        }
        org.telegram.ui.Components.mg0 mg0Var = this.m0;
        if (mg0Var != null) {
            mg0Var.d();
        }
        this.M = new yx0(this, context);
        org.telegram.ui.Components.mg0 mg0Var2 = new org.telegram.ui.Components.mg0(context);
        this.m0 = mg0Var2;
        mg0Var2.setSize(d4());
        long j12 = this.d1;
        if (j12 == 0) {
            j12 = -this.e1;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        long j13 = j12;
        org.telegram.ui.Components.gr grVar3 = grVar;
        bw0 bw0Var4 = this.a;
        jw0 jw0Var2 = this.e0;
        getClassGuid();
        this.n0 = new kw0(this, context, j13, lVar, bw0Var4, jw0Var2, this.M, this.m0);
        if (this.d1 != getUserConfig().n && (userFull2 = this.u2) != null) {
            this.n5 = userFull2.profile_photo == null ? 0.0f : 1.0f;
        }
        if (!this.p1) {
            this.n0.setChatInfo(this.t2);
        }
        this.Y.addView(this.n0);
        this.Y.addView(this.m0, w7.b6.c(138.0f, -1));
        this.Y.addView(this.M);
        org.telegram.ui.Components.hg0 hg0Var = this.Z;
        if (hg0Var != null) {
            this.Y.addView(hg0Var, w7.b6.c(-1.0f, -1));
        }
        org.telegram.ui.Components.bh0 bh0Var = this.b0;
        if (bh0Var != null) {
            this.Y.addView(bh0Var, w7.b6.c(-1.0f, -1));
            this.Y.addView(this.c0, w7.b6.c(-1.0f, -1));
        }
        this.e0.setAvatarsViewPager(this.n0);
        ay0 ay0Var = new ay0(this, context);
        this.o0 = ay0Var;
        this.Y.addView(ay0Var, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.actionBar);
        kl klVar = new kl(this, context, 3);
        this.f = klVar;
        klVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.ji));
        this.f.setPadding(r12, org.telegram.messenger.i0.L(6.0f), r12, org.telegram.messenger.i0.L(4.0f));
        this.f.setTextSizePx(org.telegram.messenger.i0.L(17.5f));
        this.f.setGravity(3);
        this.f.setTypeface(org.telegram.messenger.i0.o());
        this.f.setLeftDrawableTopPadding(-org.telegram.messenger.i0.L(1.3f));
        this.f.setPivotX(0.0f);
        this.f.setPivotY(0.0f);
        this.f.setScrollNonFitText(true);
        this.f.setFocusable(true);
        this.f.setEllipsizeByGradient(true);
        this.Y.addView(this.f, w7.b6.d(-2, -2.0f, 51, 109.0f, -6.0f, 0.0f, 0.0f));
        lw0 lw0Var = new lw0(this, context);
        this.r = lw0Var;
        lw0Var.setEllipsizeByGradient(true);
        this.r.setTextColor(H3(getThemedColor(org.telegram.ui.ActionBar.t6.B8), null));
        this.r.setTextSizePx(org.telegram.messenger.i0.L(13.5f));
        this.r.setGravity(3);
        this.r.setPivotX(org.telegram.messenger.i0.L(8.0f));
        this.r.setPivotY(org.telegram.messenger.i0.L(8.0f));
        this.r.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(2.0f));
        this.r.setFocusable(true);
        this.Y.addView(this.r, w7.b6.d(-2, -2.0f, 51, 105.0f, -2.0f, 4.0f, 0.0f));
        P3();
        this.Y.addView(this.d0);
        org.telegram.ui.Components.nv0 nv0Var = new org.telegram.ui.Components.nv0(context);
        this.S = nv0Var;
        nv0Var.setLayoutParams(w7.b6.d(32, 32.0f, 3, 103.0f, -2.0f, 0.0f, 0.0f));
        this.S.setResourcesProvider(this.z0);
        Q3();
        this.S.setDelegate(new bv0(this, 1));
        this.S.setOnClickListener(new iv0(this, r12));
        TLRPC.UserFull userFull5 = this.u2;
        if (userFull5 != null) {
            this.S.set(userFull5.stars_rating);
        }
        this.Y.addView(this.S);
        int i20 = i11;
        this.u0 = new mw0(this, context, this.currentAccount, a(), this.p1, this.X, this.e0, this.z0, context);
        K5(r12);
        TLRPC.UserFull userFull6 = this.u2;
        if (userFull6 != null) {
            this.u0.setStories(userFull6.stories);
        } else {
            TLRPC.ChatFull chatFull3 = this.t2;
            if (chatFull3 != null) {
                this.u0.setStories(chatFull3.stories);
            }
        }
        jw0 jw0Var3 = this.e0;
        if (jw0Var3 != null) {
            jw0Var3.setHasStories(w4());
        }
        this.Y.addView(this.u0, w7.b6.c(-1.0f, -1));
        rh.g0 g0Var = new rh.g0(context, this.currentAccount, a(), this.X);
        this.v0 = g0Var;
        this.Y.addView(g0Var, (int) r12, w7.b6.c(-1.0f, -1));
        H5(true);
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
        this.s = ei0Var;
        if (this.Z != null) {
            ei0Var.setVisibility(8);
        }
        P5();
        if (this.d1 == 0) {
            this.s.setImageResource(R.drawable.profile_discuss);
            this.s.setContentDescription(org.telegram.messenger.cd.K0(2131743581));
        } else if (this.q0 != null) {
            this.U = new org.telegram.ui.Components.bi0(R.raw.camera_outline, org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f), false, null);
            this.V = new org.telegram.ui.Components.bi0(R.raw.camera_outline, org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(42.0f), false, null);
            org.telegram.ui.Components.hg0 hg0Var2 = this.Z;
            if (hg0Var2 != null) {
                hg0Var2.e();
                this.Z.a();
                this.Z.b();
                this.Z.c();
                org.telegram.ui.Components.hg0 hg0Var3 = this.Z;
                if (hg0Var3.F) {
                    hg0Var3.F = r12;
                    hg0Var3.d();
                }
            } else {
                this.s.setAnimation(this.U);
                this.s.setContentDescription(org.telegram.messenger.cd.K0(2131754905));
                this.s.setPadding(org.telegram.messenger.i0.L(2.0f), r12, r12, org.telegram.messenger.i0.L(2.0f));
            }
        } else {
            org.telegram.ui.Components.hg0 hg0Var4 = this.Z;
            if (hg0Var4 != 0) {
                hg0Var4.o(r12, true);
            }
            this.s.setImageResource(R.drawable.profile_newmsg);
            this.s.setContentDescription(org.telegram.messenger.cd.K0(2131754819));
        }
        this.s.setScaleType(scaleType);
        frameLayout.addView(this.s, w7.b6.d(60, 60.0f, 53, 0.0f, 0.0f, 16.0f, 0.0f));
        this.s.setOnClickListener(new iv0(this, 1));
        x4(r12);
        if (i20 != -1 && obj != null) {
            this.s.setTag(Integer.valueOf((int) r12));
            this.s.setScaleX(0.2f);
            this.s.setScaleY(0.2f);
            this.s.setAlpha(0.0f);
        }
        this.a.setOnScrollListener(new hw0(this, 1));
        UndoView undoView = new UndoView(context, null, r12, this.z0);
        this.L = undoView;
        frameLayout.addView(undoView, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.i2 = ofFloat;
        ofFloat.addUpdateListener(new lv0(this, 1));
        this.i2.setInterpolator(grVar3);
        this.i2.addListener(new nw0(this, r12));
        I5();
        V();
        org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(getParentActivity(), 9);
        this.W = q30Var;
        q30Var.setAlpha(0.0f);
        frameLayout.addView(this.W, w7.b6.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
        this.N.setForwardRestrictedHint(this.W);
        ow0 ow0Var = new ow0(this, (ViewGroup) getParentActivity().getWindow().getDecorView(), frameLayout);
        this.V4 = ow0Var;
        ow0Var.E = new aw0(this);
        this.n0.setPinchToZoomHelper(ow0Var);
        this.x0.setAlpha(r12);
        this.y0.setColor(getThemedColor(org.telegram.ui.ActionBar.t6.i6));
        M5();
        int i21 = 3;
        do0 do0Var = new do0(this, context, i21);
        this.T = do0Var;
        int i22 = org.telegram.ui.ActionBar.t6.d6;
        do0Var.setForeground(new ColorDrawable(i0.b.o(getThemedColor(i22), 100)));
        this.T.setFocusable((boolean) r12);
        this.T.setImportantForAccessibility(2);
        this.T.setOnClickListener(new iv0(this, 2));
        this.T.setVisibility(8);
        this.T.setFitsSystemWindows(true);
        this.m5.addView(this.T, w7.b6.c(-1.0f, -1));
        T3();
        if (this.r1) {
            i12 = 87;
            this.m5.addView(this.s5, w7.b6.e(-1, 60, 87));
        } else {
            i12 = 87;
        }
        org.telegram.ui.Components.hg0 hg0Var5 = this.Z;
        if (hg0Var5 != null && hg0Var5.k()) {
            ImageView imageView8 = new ImageView(context);
            this.O0 = imageView8;
            imageView8.setScaleType(scaleType);
            this.O0.setImageResource(R.drawable.call);
            this.O0.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(org.telegram.messenger.i0.L(48.0f), org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
            layoutParams.topMargin = this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : r12;
            layoutParams.setMarginEnd(layoutParams.width);
            layoutParams.gravity = 8388613;
            frameLayout.addView(this.O0, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y5 = frameLayout2;
        org.telegram.ui.ActionBar.a7.i(i22, frameLayout2, this.z0);
        View view = new View(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, view, this.z0);
        this.y5.addView(view, w7.b6.d(-1, 1.0f / org.telegram.messenger.i0.p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.z5 = new vh.d(context, this.z0);
        this.z5.h(org.telegram.messenger.cd.K0(2131745963), r12);
        this.y5.addView(this.z5, w7.b6.d(-1, 48.0f, org.telegram.messenger.zs.E1, 10.0f, (1.0f / org.telegram.messenger.i0.p) + 10.0f, 10.0f, 10.0f));
        this.z5.setOnClickListener(new iv0(this, i21));
        this.y5.setVisibility(8);
        this.y5.setTranslationY(org.telegram.messenger.i0.L(69.0f));
        this.m5.addView(this.y5, w7.b6.e(-1, -2, i12));
        this.K6 = new ei.a(6, this, jVar);
        h5();
        r0.h0.l(this.fragmentView, new bv0(this, 4));
        return this.fragmentView;
    }

    public final int d4() {
        if (this.d1 == 0 || this.q0 == null || this.r1) {
            return org.telegram.messenger.i0.L(74 + ((this.H4 || this.I4) ? 25 : 0));
        }
        return 0;
    }

    public final void d5(qx0 qx0Var) {
        if (this.i5 == qx0Var) {
            return;
        }
        this.i5 = qx0Var;
        org.telegram.messenger.i0.d0(this.a, new ov0(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        xx0 xx0Var;
        org.telegram.ui.ActionBar.z4 z4Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User Z1;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.Chat chat;
        bw0 bw0Var;
        bw0 bw0Var2;
        org.telegram.ui.Components.ck0 ck0Var;
        int i12 = 18;
        if (i10 == org.telegram.messenger.zs.B5 || i10 == org.telegram.messenger.zs.p3) {
            if (org.telegram.messenger.w3.R(org.telegram.messenger.vp.r1(this.currentAccount).L0(Long.valueOf(this.e1)))) {
                getMessagesController().O1().k(a(), new ag.z0(i12), false, this.z0);
                return;
            }
            return;
        }
        int i13 = 0;
        r8 = false;
        boolean z10 = false;
        if (i10 == org.telegram.messenger.zs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i14 = org.telegram.messenger.vp.D8;
            Object[] objArr2 = ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & TLObject.FLAG_19) == 0) ? false : true;
            if (this.d1 != 0) {
                if (objArr2 != false) {
                    H5(true);
                }
                if ((intValue & 1024) == 0 || (bw0Var2 = this.a) == null || (ck0Var = (org.telegram.ui.Components.ck0) bw0Var2.L(this.F3, false)) == null) {
                    return;
                }
                this.d.t(ck0Var, this.F3);
                return;
            }
            if (this.e1 != 0) {
                int i15 = intValue & TLObject.FLAG_13;
                if (i15 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                    if (i15 != 0) {
                        C5(true, false);
                    } else {
                        F5(true);
                    }
                    H5(true);
                }
                if (!objArr2 == true || (bw0Var = this.a) == null) {
                    return;
                }
                int childCount = bw0Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = this.a.getChildAt(i16);
                    if (childAt instanceof org.telegram.ui.Cells.pa) {
                        ((org.telegram.ui.Cells.pa) childAt).i(intValue);
                    }
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.g1) {
            Long l4 = (Long) objArr[0];
            if (this.t2 == null || (chat = this.D2) == null || chat.id != l4.longValue()) {
                return;
            }
            this.t2.online_count = ((Integer) objArr[1]).intValue();
            F5(true);
            H5(false);
            return;
        }
        if (i10 == org.telegram.messenger.zs.O || i10 == org.telegram.messenger.zs.b1) {
            R3(true);
            return;
        }
        if (i10 == org.telegram.messenger.zs.a0) {
            if (this.i1) {
                org.telegram.messenger.i0.g3(new et0(8, this, objArr));
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.Y) {
            TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
            TLRPC.EncryptedChat encryptedChat2 = this.C2;
            if (encryptedChat2 == null || encryptedChat.id != encryptedChat2.id) {
                return;
            }
            this.C2 = encryptedChat;
            C5(false, false);
            org.telegram.messenger.o6 o6Var = this.W1;
            if (o6Var != null) {
                o6Var.g();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.g0) {
            boolean z11 = this.j1;
            boolean z12 = getMessagesController().G0.indexOfKey(this.d1) >= 0;
            this.j1 = z12;
            if (z11 != z12) {
                R3(true);
                C5(false, false);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.w2) {
            Long l10 = (Long) objArr[0];
            if (this.D2 != null) {
                long longValue = l10.longValue();
                TLRPC.Chat chat2 = this.D2;
                if (longValue == chat2.id && org.telegram.messenger.w3.w(14, chat2)) {
                    TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(this.currentAccount).M0(l10.longValue());
                    if (M0 != null) {
                        TLRPC.ChatFull chatFull4 = this.t2;
                        if (chatFull4 != null) {
                            M0.participants = chatFull4.participants;
                        }
                        this.t2 = M0;
                    }
                    ix0 ix0Var = this.N;
                    if (ix0Var != null) {
                        ix0Var.setChatInfo(this.t2);
                    }
                    TLRPC.ChatFull chatFull5 = this.t2;
                    if (chatFull5 != null && (((inputGroupCall = chatFull5.call) == null && !this.o1) || (inputGroupCall != null && this.o1))) {
                        R3(false);
                    }
                    mw0 mw0Var = this.u0;
                    if (mw0Var != null && (chatFull3 = this.t2) != null) {
                        mw0Var.setStories(chatFull3.stories);
                    }
                    rh.g0 g0Var = this.v0;
                    if (g0Var != null) {
                        g0Var.a();
                    }
                    jw0 jw0Var = this.e0;
                    if (jw0Var != null) {
                        jw0Var.setHasStories(w4());
                    }
                    if (l10.longValue() != 0) {
                        boolean z13 = org.telegram.messenger.v2.a;
                        r7 = (getMessagesController().i7 || (chatFull2 = this.t2) == null || !chatFull2.stargifts_available) ? false : true;
                        this.S0.Q(38, r7);
                        org.telegram.ui.Components.hg0 hg0Var = this.Z;
                        if (hg0Var != null) {
                            hg0Var.o(3, r7);
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
        if (i10 == org.telegram.messenger.zs.T) {
            TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
            if (this.d1 != 0 && (Z1 = getMessagesController().Z1(Long.valueOf(this.d1))) != null && chatFull6.id == Z1.linked_community_id) {
                C5(true, false);
            }
            TLRPC.Chat chat3 = this.D2;
            if (chat3 != null && chatFull6.id == chat3.linked_community_id) {
                C5(true, false);
            }
            if (chatFull6.id == this.e1) {
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                TLRPC.ChatFull chatFull7 = this.t2;
                if ((chatFull7 instanceof TLRPC.TL_channelFull) && chatFull6.participants == null) {
                    chatFull6.participants = chatFull7.participants;
                }
                Object[] objArr3 = chatFull7 == null && (chatFull6 instanceof TLRPC.TL_channelFull);
                this.t2 = chatFull6;
                if (this.l1 == 0) {
                    long j10 = chatFull6.migrated_from_chat_id;
                    if (j10 != 0) {
                        this.l1 = -j10;
                        getMediaDataController().d0(0, this.classGuid, this.l1, this.f1, true);
                    }
                }
                a4();
                kw0 kw0Var = this.n0;
                if (kw0Var != null && !this.p1) {
                    kw0Var.setChatInfo(this.t2);
                }
                C5(true, false);
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.e1));
                if (L0 != null) {
                    this.D2 = L0;
                    R3(true);
                }
                org.telegram.messenger.o6 o6Var2 = this.W1;
                if (o6Var2 != null) {
                    o6Var2.g();
                }
                if (this.D2.megagroup && (objArr3 != false || !booleanValue)) {
                    g4(true);
                }
                n5();
                M5();
                mw0 mw0Var2 = this.u0;
                if (mw0Var2 != null && (chatFull = this.t2) != null) {
                    mw0Var2.setStories(chatFull.stories);
                }
                rh.g0 g0Var2 = this.v0;
                if (g0Var2 != null) {
                    g0Var2.a();
                }
                jw0 jw0Var2 = this.e0;
                if (jw0Var2 != null) {
                    jw0Var2.setHasStories(w4());
                }
                ix0 ix0Var2 = this.N;
                if (ix0Var2 != null) {
                    ix0Var2.setChatInfo(this.t2);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.t) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == org.telegram.messenger.zs.v) {
            long longValue2 = ((Long) objArr[0]).longValue();
            boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
            if (longValue2 == a() && (z4Var = this.parentLayout) != null && z4Var.getFragmentStack().contains(this)) {
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
        if (i10 == org.telegram.messenger.zs.D0) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
            if (botInfo.user_id == this.d1) {
                this.E2 = botInfo;
                C5(false, false);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.E0) {
            if (((Long) objArr[0]).longValue() == this.d1) {
                TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                this.u2 = userFull;
                org.telegram.ui.Components.nv0 nv0Var = this.S;
                if (nv0Var != null) {
                    nv0Var.set(userFull.stars_rating);
                }
                mw0 mw0Var3 = this.u0;
                if (mw0Var3 != null) {
                    mw0Var3.setStories(this.u2.stories);
                }
                rh.g0 g0Var3 = this.v0;
                if (g0Var3 != null) {
                    g0Var3.a();
                }
                jw0 jw0Var3 = this.e0;
                if (jw0Var3 != null) {
                    jw0Var3.setHasStories(w4());
                }
                ix0 ix0Var3 = this.N;
                if (ix0Var3 != null) {
                    ix0Var3.setUserInfo(this.u2);
                }
                if (this.q0 != null) {
                    if (this.d != null && !TextUtils.equals(this.u2.about, this.y2)) {
                        this.d.g(this.V2);
                    }
                    if (this.r1) {
                        C5(false, false);
                    }
                } else {
                    if (this.F1 || this.K0) {
                        this.H1 = true;
                    } else {
                        R3(true);
                    }
                    C5(false, false);
                    ix0 ix0Var4 = this.N;
                    if (ix0Var4 != null) {
                        ix0Var4.setCommonGroupsCount(this.u2.common_chats_count);
                        V();
                        org.telegram.ui.Components.rt0 rt0Var = this.Q;
                        if (rt0Var == null || rt0Var.D) {
                            resumeDelayedFragmentAnimation();
                            x4(true);
                        }
                    }
                }
                n5();
                M5();
                if (this.v2 == null && !u4()) {
                    org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(this.currentAccount);
                    this.v2 = i6Var;
                    oa0 oa0Var = new oa0(this, 17);
                    if (i6Var.c) {
                        oa0Var.run();
                    } else {
                        i6Var.h.add(oa0Var);
                    }
                    this.v2.d(this.u2);
                }
                if (!u4()) {
                    ly0 ly0Var = this.x2;
                    ly0 c10 = ly0.c(this.currentAccount, this.u2, ly0Var);
                    this.x2 = c10;
                    this.w2 = c10 != ly0Var;
                    if (c10 != null) {
                        oa0 oa0Var2 = new oa0(this, i12);
                        if (c10.b) {
                            oa0Var2.run();
                        } else {
                            c10.h.add(oa0Var2);
                        }
                    }
                }
                if (this.S0 != null) {
                    if (r4()) {
                        this.S0.S(44);
                    } else {
                        this.S0.t(44);
                    }
                    TLRPC.UserFull userFull2 = this.u2;
                    if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                        z10 = true;
                    }
                    this.S0.Q(46, z10);
                    this.S0.Q(47, !z10);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.k0) {
            return;
        }
        if (i10 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && a() == ((Long) objArr[0]).longValue()) {
                ArrayList arrayList = (ArrayList) objArr[1];
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i17);
                    if (this.C2 != null) {
                        TLRPC.MessageAction messageAction = jjVar.k.action;
                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (xx0Var = this.d) != null) {
                            xx0Var.f();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.i4) {
            bw0 bw0Var3 = this.a;
            if (bw0Var3 != null) {
                bw0Var3.g1();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.x4) {
            C5(false, false);
            return;
        }
        if (i10 == org.telegram.messenger.zs.s1) {
            int i18 = this.b3;
            int i19 = this.Z2;
            int i20 = this.X2;
            I5();
            xx0 xx0Var2 = this.d;
            if (xx0Var2 != null) {
                if (i18 == this.b3 && i19 == this.Z2 && i20 == this.X2) {
                    return;
                }
                xx0Var2.f();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.q5) {
            if (this.p1) {
                H5(false);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.D1) {
            hy0 hy0Var = this.e;
            if (hy0Var != null) {
                hy0Var.c = hy0.H(this);
                this.e.w.clear();
                this.e.J();
                hy0 hy0Var2 = this.e;
                hy0Var2.I(hy0Var2.D);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.c0) {
            H5(false);
            return;
        }
        if (i10 == org.telegram.messenger.zs.v5 || i10 == org.telegram.messenger.zs.F5) {
            jw0 jw0Var4 = this.e0;
            if (jw0Var4 != null) {
                jw0Var4.setHasStories(w4());
                this.e0.setRoundRadiusForExpand((int) org.telegram.messenger.i0.T1(p4(), 0.0f, this.j2));
            }
            mw0 mw0Var4 = this.u0;
            if (mw0Var4 != null) {
                TLRPC.UserFull userFull3 = this.u2;
                if (userFull3 != null) {
                    mw0Var4.setStories(userFull3.stories);
                    return;
                }
                TLRPC.ChatFull chatFull8 = this.t2;
                if (chatFull8 != null) {
                    mw0Var4.setStories(chatFull8.stories);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.i3) {
            org.telegram.ui.ActionBar.p5 p5Var = this.S0;
            if (p5Var != null) {
                TL_account.RequirementToContact H2 = getMessagesController().H2(this.d1);
                if (H2 != null && !(H2 instanceof TL_account.requirementToContactEmpty)) {
                    r7 = false;
                }
                p5Var.Q(20, r7);
            }
            q5();
            return;
        }
        if (i10 == org.telegram.messenger.zs.f5) {
            q5();
            return;
        }
        if (i10 == org.telegram.messenger.zs.y3) {
            C5(false, false);
            return;
        }
        if (i10 == org.telegram.messenger.zs.C3) {
            C5(false, false);
            return;
        }
        if (i10 == org.telegram.messenger.zs.D3) {
            C5(false, false);
            return;
        }
        if (i10 == org.telegram.messenger.zs.y1) {
            if (a() == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.z4 z4Var2 = this.parentLayout;
                if (z4Var2 == null || z4Var2.getLastFragment() != this) {
                    removeSelfFromStack();
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.f3) {
            long longValue3 = ((Long) objArr[0]).longValue();
            if (this.J4 >= 0 || longValue3 != a()) {
                return;
            }
            I5();
            V();
            xx0 xx0Var3 = this.d;
            if (xx0Var3 != null) {
                xx0Var3.f();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.G3) {
            if (((Long) objArr[0]).longValue() != a() || u4()) {
                return;
            }
            if (this.J4 >= 0) {
                ix0 ix0Var5 = this.N;
                if (ix0Var5 != null) {
                    ix0Var5.K1(true);
                    return;
                }
                return;
            }
            I5();
            V();
            xx0 xx0Var4 = this.d;
            if (xx0Var4 != null) {
                xx0Var4.f();
            }
            org.telegram.messenger.i0.g3(new oa0(this, 19));
            return;
        }
        if (i10 == org.telegram.messenger.zs.V3) {
            if (((Long) objArr[0]).longValue() != a() || this.d1 <= 0) {
                return;
            }
            TLRPC.UserFull a2 = getMessagesController().a2(this.d1);
            if (a2 != null) {
                this.u2 = a2;
            }
            I5();
            V();
            bw0 bw0Var4 = this.a;
            if (bw0Var4 != null && bw0Var4.c0()) {
                this.a.post(new oa0(this, 21));
                return;
            }
            xx0 xx0Var5 = this.d;
            if (xx0Var5 != null) {
                xx0Var5.f();
                return;
            }
            return;
        }
        if (i10 != org.telegram.messenger.zs.W3) {
            return;
        }
        long longValue4 = ((Long) objArr[0]).longValue();
        long longValue5 = ((Long) objArr[1]).longValue();
        TLRPC.Chat chat4 = this.D2;
        if (chat4 == null || chat4.id != longValue4) {
            return;
        }
        String str = (String) objArr[2];
        a0.h hVar = this.B1;
        if (hVar != null && (chatParticipant = (TLRPC.ChatParticipant) hVar.f(longValue5)) != null) {
            chatParticipant.setRank(longValue5, str);
        }
        TLRPC.ChannelParticipant channelParticipant = this.F2;
        if (channelParticipant != null && channelParticipant.user_id == longValue5) {
            channelParticipant.rank = str;
        }
        while (true) {
            ArrayList arrayList2 = this.Q4;
            if (i13 >= arrayList2.size()) {
                org.telegram.messenger.i0.a4(this.a);
                return;
            } else {
                ((TLRPC.ChatParticipant) arrayList2.get(i13)).setRank(longValue5, str);
                i13++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.b40 b40Var = this.q0;
        if (b40Var == null || !b40Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.b40 b40Var = this.q0;
        return (b40Var == null || dialog != b40Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final int e4(ImageReceiver imageReceiver) {
        return imageReceiver.t() instanceof org.telegram.ui.Components.g61 ? ((org.telegram.ui.Components.g61) imageReceiver.t()).a.a() : org.telegram.messenger.i0.p(this.e0.getImageReceiver().n());
    }

    public final void e5(CharSequence charSequence) {
        this.V5 = charSequence;
        G5();
    }

    @Override // org.telegram.ui.Components.ms0
    public final org.telegram.ui.Components.tk0 f() {
        return this.a;
    }

    public final org.telegram.ui.Components.d5 f4(long j10) {
        if (this.G == null) {
            org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(17.0f), 2, this.f, false);
            this.G = d5Var;
            int L = org.telegram.messenger.i0.L(1.0f);
            d5Var.I = 0;
            d5Var.J = L;
            if (this.G0) {
                this.G.a();
            }
        }
        if (j10 != 0) {
            this.G.j(j10, false);
        } else {
            this.G.g(null, false);
        }
        r5();
        return this.G;
    }

    public final void f5(int i10) {
        SharedPreferences d12 = org.telegram.messenger.vp.d1();
        if (org.telegram.messenger.i0.Q1()) {
            return;
        }
        this.J1 = i10 != 0;
        this.K1 = i10 != 0;
        J5();
        if (d12.getBoolean("view_animations", true)) {
            this.I1 = i10;
        } else if (i10 == 2) {
            this.m1 = true;
        }
    }

    @Override // org.telegram.ui.Components.ms0
    public final TLRPC.Chat g() {
        return this.D2;
    }

    public final void g4(boolean z10) {
        a0.h hVar;
        if (this.A1 || (hVar = this.B1) == null || this.t2 == null) {
            return;
        }
        this.A1 = true;
        int i10 = (hVar.m() == 0 || !z10) ? 0 : org.telegram.messenger.zs.X4;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = getMessagesController().g1(this.e1);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = z10 ? 0 : this.B1.m();
        tL_channels_getParticipants.limit = org.telegram.messenger.zs.e3;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new mg.w(this, tL_channels_getParticipants, i10)), this.classGuid);
    }

    public final void g5(TLRPC.UserFull userFull, org.telegram.ui.Cells.i6 i6Var, ly0 ly0Var) {
        this.u2 = userFull;
        org.telegram.ui.Components.nv0 nv0Var = this.S;
        if (nv0Var != null) {
            nv0Var.set(userFull.stars_rating);
        }
        mw0 mw0Var = this.u0;
        if (mw0Var != null) {
            mw0Var.setStories(this.u2.stories);
        }
        rh.g0 g0Var = this.v0;
        if (g0Var != null) {
            g0Var.a();
        }
        jw0 jw0Var = this.e0;
        if (jw0Var != null) {
            jw0Var.setHasStories(w4());
        }
        ix0 ix0Var = this.N;
        if (ix0Var != null) {
            ix0Var.setUserInfo(this.u2);
        }
        if (this.v2 == null) {
            this.v2 = i6Var;
        }
        if (this.v2 == null) {
            this.v2 = new org.telegram.ui.Cells.i6(this.currentAccount);
        }
        org.telegram.ui.Cells.i6 i6Var2 = this.v2;
        oa0 oa0Var = new oa0(this, 23);
        if (i6Var2.c) {
            oa0Var.run();
        } else {
            i6Var2.h.add(oa0Var);
        }
        this.v2.d(this.u2);
        if (this.x2 == null) {
            this.x2 = ly0Var;
        }
        ly0 ly0Var2 = this.x2;
        boolean z10 = true;
        if (ly0Var2 == null) {
            ly0 c10 = ly0.c(this.currentAccount, this.u2, ly0Var2);
            this.x2 = c10;
            this.w2 = c10 != null;
        }
        ly0 ly0Var3 = this.x2;
        if (ly0Var3 != null) {
            oa0 oa0Var2 = new oa0(this, 18);
            if (ly0Var3.b) {
                oa0Var2.run();
            } else {
                ly0Var3.h.add(oa0Var2);
            }
        }
        org.telegram.ui.ActionBar.p5 p5Var = this.S0;
        if (p5Var != null) {
            TL_account.RequirementToContact H2 = getMessagesController().H2(this.d1);
            if (H2 != null && !(H2 instanceof TL_account.requirementToContactEmpty)) {
                z10 = false;
            }
            p5Var.Q(20, z10);
            if (r4()) {
                this.S0.S(44);
            } else {
                this.S0.t(44);
            }
        }
    }

    public float getAvatarAnimationProgress() {
        return this.R1;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ gs0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.z0;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        if (this.z0 != null) {
            return null;
        }
        g6 g6Var = new g6(18, this);
        ArrayList arrayList = new ArrayList();
        ix0 ix0Var = this.N;
        if (ix0Var != null) {
            arrayList.addAll(ix0Var.getThemeDescriptions());
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.e0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.p0}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ki));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.li));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.x6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"detailTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.z6));
        int i10 = org.telegram.ui.ActionBar.t6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 131072, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        int i12 = org.telegram.ui.ActionBar.t6.Ei;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 196608, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 131072, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 196608, new Class[]{org.telegram.ui.Cells.b7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.n6));
        if (this.Q5) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.H}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Cj));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.H}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ni));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.t6.w0(i10, this.z0);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final Drawable getThemedDrawable(String str) {
        org.telegram.ui.ActionBar.p6 p6Var = this.z0;
        Drawable drawable = p6Var != null ? p6Var.getDrawable(str) : null;
        return drawable != null ? drawable : super.getThemedDrawable(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0114, code lost:
    
        if (r25.inviter_id != getUserConfig().e()) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0116, code lost:
    
        if (r26 == false) goto L86;
     */
    @Override // org.telegram.ui.Components.ms0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        boolean z12;
        boolean z13;
        String str;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        TLRPC.ChannelParticipant channelParticipant;
        boolean z22;
        int i10 = 0;
        if (getParentActivity() != null) {
            if (z10) {
                TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(chatParticipant.user_id));
                if (Z1 != null) {
                    long j10 = chatParticipant.user_id;
                    this.z2 = j10;
                    boolean z23 = j10 == getUserConfig().e();
                    if (org.telegram.messenger.w3.T(this.D2)) {
                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        str = channelParticipant.rank;
                        z16 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        z15 = z16 || (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin);
                        z12 = z23;
                        getMessagesController().Z1(Long.valueOf(chatParticipant.user_id));
                        z21 = org.telegram.messenger.w3.w(4, this.D2);
                        boolean z24 = org.telegram.messenger.w3.w(25, this.D2) && (!z15 || ((!z16 && channelParticipant.can_edit) || z12));
                        if (z16 || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit)) {
                            z21 = false;
                            z24 = false;
                        }
                        if ((z12 || (channelParticipant instanceof TLRPC.TL_channelParticipantSelf)) && org.telegram.messenger.w3.h(this.D2)) {
                            z24 = true;
                        }
                        z17 = org.telegram.messenger.w3.w(2, this.D2) && (!((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || z16) || channelParticipant.can_edit);
                        z20 = this.D2.gigagroup ? false : z17;
                        z13 = true;
                        z14 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                        z19 = z24;
                    } else {
                        z12 = z23;
                        z13 = true;
                        str = chatParticipant.rank;
                        z14 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        z15 = z14 || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator);
                        z16 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        TLRPC.Chat chat = this.D2;
                        z17 = chat.creator || ((chatParticipant instanceof TLRPC.TL_chatParticipant) && (org.telegram.messenger.w3.w(2, chat) || chatParticipant.inviter_id == getUserConfig().e()));
                        TLRPC.Chat chat2 = this.D2;
                        boolean z25 = chat2.creator;
                        if (org.telegram.messenger.w3.w(25, chat2)) {
                            z18 = z25;
                            if (z15) {
                                if (!z16) {
                                }
                            }
                            z19 = true;
                            z20 = this.D2.creator;
                            z21 = z18;
                            channelParticipant = null;
                        } else {
                            z18 = z25;
                        }
                        if (!z12 || !org.telegram.messenger.w3.h(this.D2)) {
                            z19 = false;
                            z20 = this.D2.creator;
                            z21 = z18;
                            channelParticipant = null;
                        }
                        z19 = true;
                        z20 = this.D2.creator;
                        z21 = z18;
                        channelParticipant = null;
                    }
                    if (!z12) {
                        z22 = z17;
                    } else if (org.telegram.messenger.w3.h(this.D2) || (z15 && org.telegram.messenger.w3.w(25, this.D2))) {
                        z21 = false;
                        z20 = false;
                        z22 = false;
                        z19 = z13;
                    } else {
                        z21 = false;
                        z20 = false;
                        z22 = false;
                    }
                    boolean z26 = (z21 || z19 || z20 || z22) ? z13 : false;
                    if (z11 || !z26) {
                        return z26;
                    }
                    TLRPC.ChannelParticipant channelParticipant2 = channelParticipant;
                    boolean z27 = z14;
                    dv0 dv0Var = new dv0(this, channelParticipant2, Z1, chatParticipant, z27, str);
                    String str2 = str;
                    Drawable U0 = view.getParent() instanceof org.telegram.ui.Components.tk0 ? ((org.telegram.ui.Components.tk0) view.getParent()).U0(view, false) : null;
                    org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view);
                    H.W(U0);
                    H.w = false;
                    H.l(R.drawable.msg_discussion, org.telegram.messenger.cd.L0(2131745618, null), new ev0(this, Z1, i10), !z12);
                    if (!z12 && (z21 || z19 || z20 || z22)) {
                        H.k();
                    }
                    H.l((z15 || !TextUtils.isEmpty(str2)) ? R.drawable.menu_tag_edit : R.drawable.menu_tag_plus, org.telegram.messenger.cd.L0(z15 ? 2131751303 : TextUtils.isEmpty(str2) ? 2131754400 : 2131751276, null), new ig.k0(this, Z1, str2, z15, z16), z19);
                    H.l(R.drawable.msg_admins, org.telegram.messenger.cd.L0(z27 ? 2131751305 : 2131745564, null), new mg0(dv0Var, 28), z21);
                    H.l(R.drawable.msg_permissions, org.telegram.messenger.cd.L0(2131752540, null), new m90(this, channelParticipant2, chatParticipant, Z1, dv0Var, 15), z20);
                    H.m(R.drawable.msg_remove, new et0(9, this, chatParticipant), org.telegram.messenger.cd.L0(2131749065, null), z22, true);
                    H.S = org.telegram.messenger.zs.U2;
                    H.Z();
                    return z13;
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

    public final org.telegram.ui.Components.d5 h4(TLRPC.EmojiStatus emojiStatus, boolean z10) {
        if (this.F == null) {
            org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 2, this.f, false);
            this.F = d5Var;
            if (this.G0) {
                d5Var.a();
            }
        }
        this.E = null;
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) == 0 || tL_emojiStatus.until > ((int) (System.currentTimeMillis() / 1000))) {
                this.F.j(tL_emojiStatus.document_id, z10);
                this.F.m(false, z10);
            } else {
                this.F.g(n4(), z10);
                this.F.m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
                this.E = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                this.F.j(tL_emojiStatusCollectible.document_id, z10);
                this.F.m(true, z10);
            } else {
                this.F.g(n4(), z10);
                this.F.m(false, z10);
            }
        } else {
            this.F.g(n4(), z10);
            this.F.m(false, z10);
        }
        r5();
        return this.F;
    }

    public final void h5() {
        ei.b baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.kg0 kg0Var = new org.telegram.ui.Components.kg0(this.glassEngine, baseSimpleGlass);
        this.I5 = kg0Var;
        ky0 ky0Var = this.c1;
        if (ky0Var != null) {
            int i10 = ky0Var.H;
            boolean z10 = ky0Var.c;
            if (kg0Var.i != i10 || kg0Var.j != z10) {
                kg0Var.i = i10;
                kg0Var.j = z10;
                kg0Var.a();
            }
        }
        this.I5.b(this.J5);
        org.telegram.ui.Components.hg0 hg0Var = this.Z;
        if (hg0Var != null) {
            hg0Var.setGlassFactory(this.I5.c);
        }
        org.telegram.ui.Components.bh0 bh0Var = this.b0;
        if (bh0Var != null) {
            bh0Var.setGlassFactory(this.I5.c);
        }
        this.simpleActionBar.setButtonsGlass(this.I5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        gx0 gx0Var = this.m5;
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.p6 p6Var = this.z0;
        baseSimpleGlass.k = gx0Var;
        baseSimpleGlass.l = null;
        baseSimpleGlass.g(gx0Var, i5Var, p6Var);
        org.telegram.ui.ActionBar.i5 i5Var2 = this.simpleActionBar;
        org.telegram.ui.Components.kg0 kg0Var2 = this.I5;
        tg.b bVar = kg0Var2.e;
        hi.d dVar = kg0Var2.f;
        i5Var2.n0 = bVar;
        i5Var2.o0 = dVar;
        i5Var2.setBackground(null);
        this.G5 = w7.b9.m(this.z0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.H5);
        z5();
        baseSimpleGlass.m = this.K6;
        View view = new View(getParentActivity());
        this.S5 = view;
        view.setAlpha(0.0f);
        this.m5.getViewTreeObserver().addOnPreDrawListener(new bl(this, 1));
        this.N.y(this.S5);
        View view2 = this.S5;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.B5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        gx0 gx0Var2 = this.m5;
        gx0Var2.addView(this.B5, gx0Var2.indexOfChild(this.Y), w7.b6.e(-1, 0, 48));
        this.glassEngine.b(this.a);
        this.N.setPagesGlassEngine(this.glassEngine);
        this.N.setOnTopPanelShiftChanged(new oa0(this, 22));
        G3();
        w5();
    }

    public final int i4() {
        return d4() + j4();
    }

    public final void i5(boolean z10, boolean z11) {
        if (this.g0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f0 = null;
        }
        if (!z11) {
            if (z10) {
                this.g0.setAlpha(1.0f);
                this.g0.setVisibility(0);
                return;
            } else {
                this.g0.setAlpha(0.0f);
                this.g0.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f0 = animatorSet2;
        int i10 = 1;
        if (z10) {
            this.g0.setVisibility(0);
            this.f0.playTogether(ObjectAnimator.ofFloat(this.g0, (Property<org.telegram.ui.Cells.d4, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.g0, (Property<org.telegram.ui.Cells.d4, Float>) View.ALPHA, 0.0f));
        }
        this.f0.setDuration(180L);
        this.f0.addListener(new xw0(this, z10, i10));
        this.f0.start();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.o2;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        int w02;
        if (this.o2) {
            return false;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && lVar.u()) {
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.w8, this.z0);
        } else if (this.Q5 || this.A5 > 0.5f) {
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.z0);
        } else {
            org.telegram.messenger.kp kpVar = this.f6;
            w02 = kpVar != null ? kpVar.d(org.telegram.ui.ActionBar.t6.I.q()) : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, this.z0);
        }
        return i0.b.h(w02) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r3.contains((int) r7.getX(), ((int) r7.getY()) - r6.actionBar.getMeasuredHeight()) != false) goto L20;
     */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        ix0 ix0Var;
        kw0 kw0Var = this.n0;
        Rect rect = this.K2;
        if (kw0Var != null && kw0Var.getVisibility() == 0 && this.n0.getRealCount() > 1) {
            this.n0.getHitRect(rect);
            if (motionEvent != null) {
            }
        }
        if (this.J4 != -1 && (ix0Var = this.N) != null) {
            if (ix0Var.G0()) {
                this.N.getHitRect(rect);
                if (motionEvent == null || rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
                    ix0 ix0Var2 = this.N;
                    return ix0Var2.getSelectedTab() == ix0Var2.K0.getFirstTabId();
                }
            }
            return false;
        }
        return true;
    }

    public final int j4() {
        return d4() == 0 ? org.telegram.messenger.i0.L(168.0f) : org.telegram.messenger.i0.L(152.0f);
    }

    public final void j5() {
        Long l4;
        if (this.M5 != null) {
            return;
        }
        z21[] z21VarArr = new z21[1];
        Rect rect = org.telegram.messenger.i0.Q;
        kl klVar = this.f;
        if (klVar != null) {
            if (klVar.getRightDrawable() == null) {
                rect.set(this.f.getWidth() - 1, (this.f.getHeight() / 2) - 1, this.f.getWidth() + 1, (this.f.getHeight() / 2) + 1);
            } else {
                rect.set(this.f.getRightDrawable().getBounds());
                rect.offset((int) ((this.f.getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) this.f.getX(), (int) this.f.getY());
            }
        }
        int i10 = this.f.getScaleX() < 1.5f ? 16 : 32;
        int L = (-(this.Y.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(i10);
        float L2 = org.telegram.messenger.i0.L(324.0f);
        Point point = org.telegram.messenger.i0.q;
        int min = (int) Math.min(L2, point.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = w7.u.b(centerX - (min / 2), 0, point.x - min);
        qw0 qw0Var = new qw0(this, this, getParentActivity(), Integer.valueOf(Math.max(0, centerX - b10)), this.D2 == null ? 0 : 9, this.z0, i10, z21VarArr);
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.d1));
        if (Z1 != null) {
            qw0Var.setExpireDateHint(org.telegram.messenger.o5.g(Z1.emoji_status));
        }
        Long l10 = this.E;
        if (l10 != null) {
            qw0Var.setSelected(l10);
        } else {
            org.telegram.ui.Components.d5 d5Var = this.F;
            if (d5Var != null) {
                Drawable drawable = d5Var.f[0];
                if (drawable instanceof org.telegram.ui.Components.f5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.f5) drawable).h());
                    qw0Var.setSelected(l4);
                }
            }
            l4 = null;
            qw0Var.setSelected(l4);
        }
        qw0Var.setSaveState(3);
        qw0Var.y(this.F, this.f);
        rw0 rw0Var = new rw0(this, qw0Var);
        this.M5 = rw0Var;
        z21VarArr[0] = rw0Var;
        int[] iArr = new int[2];
        kl klVar2 = this.f;
        if (klVar2 != null) {
            klVar2.getLocationOnScreen(iArr);
        }
        z21VarArr[0].showAsDropDown(this.fragmentView, b10, L, 51);
        z21VarArr[0].b();
    }

    public final float k4() {
        return Math.max(this.A5, this.P5);
    }

    public final void k5() {
        int i10 = 0;
        this.N.K0.setReordering(false);
        ix0 ix0Var = this.N;
        org.telegram.ui.Components.ur0 ur0Var = ix0Var.K0;
        if (ix0Var.x1 != null && ur0Var != null) {
            boolean A0 = ix0Var.A0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = ur0Var.getTabIds();
            int size = tabIds.size();
            while (i10 < size) {
                Integer num = tabIds.get(i10);
                i10++;
                TLRPC.ProfileTab m0 = org.telegram.ui.Components.zt0.m0(num.intValue(), A0);
                if (m0 != null) {
                    arrayList.add(m0);
                }
            }
        }
        this.N.K1(true);
        this.y5.animate().translationY(org.telegram.messenger.i0.L(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new oa0(this, 25)).start();
        org.telegram.ui.Components.cc.a0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    public final float l4(float f7, float f10) {
        this.t6 = f7;
        this.v6 = f10;
        int i10 = this.I1;
        float l4 = Utilities.l(i10 == 2 ? 1.0f : (this.R1 >= 1.0f || i10 == 0) ? this.j2 : 0.0f);
        org.telegram.ui.Components.nv0 nv0Var = this.S;
        return Math.max(0.0f, (o4() + this.o5) * l4) + c3.i0.z(1.0f, l4, f10 * (nv0Var != null ? nv0Var.getVisibilityFactor() : 0.0f), f7);
    }

    public final void l5() {
        if (!this.o2) {
            lw0 lw0Var = this.r;
            if (lw0Var != null) {
                Object tag = lw0Var.getTag();
                if (tag instanceof Integer) {
                    this.r.setTextColor(H3(org.telegram.ui.ActionBar.t6.w0(((Integer) tag).intValue(), this.z0), Boolean.valueOf(this.J0[0])));
                } else {
                    this.r.setTextColor(H3(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, this.z0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.x;
            if (drawable != null) {
                drawable.setColorFilter(this.f6 != null ? -1 : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.dd, this.z0), PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.kl0 kl0Var = this.K;
            if (kl0Var != null) {
                kl0Var.b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h8, this.z0));
            }
            kl klVar = this.f;
            if (klVar != null) {
                klVar.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ji, this.z0));
            }
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.D(this.f6 == null ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v8, this.z0) : -1, false);
                this.actionBar.C(this.f6 != null ? 553648127 : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f8, this.z0), false);
            }
        }
        r5();
        O5();
    }

    public final float m4(float f7) {
        this.w6 = f7;
        int i10 = this.I1;
        return c3.i0.z(1.0f, Utilities.l(i10 == 2 ? 1.0f : (this.R1 >= 1.0f || i10 == 0) ? this.j2 : 0.0f), this.S != null ? this.S.getVisibilityFactor() * org.telegram.messenger.i0.L(3.0f) : 0.0f, f7);
    }

    public final void m5() {
        l0 l0Var;
        if (this.Z == null || this.r == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0);
        org.telegram.ui.Components.hg0 hg0Var = this.Z;
        boolean z10 = this.F1;
        hg0Var.e = z10;
        if (z10 && this.I1 == 2 && (l0Var = this.X) != null) {
            this.Z.f = this.X.getY() + (this.X.getScaleY() * l0Var.getHeight());
            this.Z.setAlpha(this.R1);
            org.telegram.ui.Components.hg0 hg0Var2 = this.Z;
            float measuredWidth = this.a.getMeasuredWidth();
            hg0Var2.x = org.telegram.messenger.i0.L(74.0f);
            hg0Var2.setTranslationY(measuredWidth);
            hg0Var2.invalidate();
        } else {
            hg0Var.f = -1.0f;
            float f7 = currentActionBarHeight;
            float L = (this.P1 + f7) - org.telegram.messenger.i0.L((this.H4 || this.I4) ? 25.0f : 0.0f);
            float min = Math.min(org.telegram.messenger.i0.L(74.0f), L - f7);
            org.telegram.ui.Components.hg0 hg0Var3 = this.Z;
            hg0Var3.x = min;
            hg0Var3.setTranslationY(L - min);
            hg0Var3.invalidate();
        }
        ImageView imageView = this.O0;
        if (imageView == null || imageView.getTag() == null) {
            return;
        }
        this.Z.getClass();
        if (this.O0.getVisibility() == 0) {
            this.O0.setVisibility(8);
        }
        if (this.O0.getTag() instanceof org.telegram.ui.ActionBar.t0) {
            ((org.telegram.ui.ActionBar.t0) this.O0.getTag()).setAlpha(1.0f);
        }
    }

    public final org.telegram.ui.Components.fr n4() {
        if (this.J == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            this.D = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.z0), PorterDuff.Mode.MULTIPLY);
            this.J = new org.telegram.ui.Components.fr(this.D, getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return this.J;
    }

    public final void n5() {
        if (this.Y0 == null || this.Z0 == null) {
            return;
        }
        TLRPC.UserFull userFull = this.u2;
        int i10 = (userFull == null && this.t2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.t2.ttl_period;
        this.s0.b(i10);
        this.Z0.t(i10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean needDelayOpenAnimation() {
        return this.I1 == 0;
    }

    public final float o4() {
        if (this.S == null) {
            return 0.0f;
        }
        return this.S.getVisibilityFactor() * org.telegram.messenger.i0.L(22.0f);
    }

    public final void o5() {
        if (this.s5 == null) {
            return;
        }
        ix0 ix0Var = this.N;
        boolean z10 = ((ix0Var == null || !ix0Var.isAttachedToWindow()) ? (float) org.telegram.messenger.i0.L(72.0f) : ((float) org.telegram.messenger.i0.L(232.0f)) - (((float) this.a.getMeasuredHeight()) - this.N.getY())) <= 0.0f;
        fe.b bVar = this.L5;
        bVar.a(z10, true);
        float f7 = bVar.e;
        this.s5.setTranslationY(org.telegram.messenger.i0.W1(f7, org.telegram.messenger.i0.L(60.0f), 0));
        this.s5.setAlpha(f7);
        this.s5.setVisibility(f7 <= 0.0f ? 4 : 0);
        org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.w;
        if (wbVar != null) {
            wbVar.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.b40 b40Var = this.q0;
        if (b40Var != null) {
            b40Var.h(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ur0 ur0Var;
        if (super.onBackPressed(z10)) {
            ix0 ix0Var = this.N;
            if (ix0Var == null || (ur0Var = ix0Var.K0) == null || !ur0Var.n0) {
                if (this.J4 == -1 || ix0Var == null || !ix0Var.E1) {
                    return this.actionBar.isEnabled();
                }
                if (z10) {
                    ix0Var.T(true);
                }
            } else if (z10) {
                k5();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.L;
        if (undoView != null) {
            undoView.d(0, true);
        }
        super.onBecomeFullyHidden();
        this.m6 = false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        P5();
        this.m6 = true;
        T3();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        super.onConfigurationChanged(configuration);
        ix0 ix0Var = this.N;
        if (ix0Var != null) {
            ix0Var.onConfigurationChanged(configuration);
        }
        s4();
        if (this.m2 && this.o2 && (m10 = this.c.m(0)) != null) {
            this.a.scrollBy(0, m10.getTop() - i4());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new e7(this, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:264:0x07d0  */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.t0 t0Var;
        boolean z11;
        oy0 oy0Var;
        org.telegram.ui.ActionBar.t0 t0Var2;
        Object obj;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.t0 j10;
        long j11;
        boolean z12;
        TLRPC.Chat chat;
        xw xwVar;
        if (!this.I0) {
            I5();
            if (this.I1 != 0 && this.L1 && !this.o2 && !this.M1) {
                ImageView imageView = this.i0;
                if (imageView != null) {
                    imageView.setAlpha(1.0f);
                }
                ImageView imageView2 = this.h0;
                if (imageView2 != null) {
                    imageView2.setAlpha(1.0f);
                }
                ImageView imageView3 = this.k0;
                if (imageView3 != null) {
                    imageView3.setAlpha(1.0f);
                    this.k0.setScaleX(1.0f);
                    this.k0.setScaleY(1.0f);
                }
                ImageView imageView4 = this.j0;
                if (imageView4 != null) {
                    imageView4.setAlpha(1.0f);
                    this.j0.setScaleX(1.0f);
                    this.j0.setScaleY(1.0f);
                }
                org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
                int i10 = 2;
                if (z4Var != null && z4Var.getFragmentStack().size() >= 2) {
                    Object obj2 = (org.telegram.ui.ActionBar.k2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    if (obj2 instanceof org.telegram.ui.Components.gg) {
                        this.g5 = (org.telegram.ui.Components.gg) obj2;
                    }
                    if ((obj2 instanceof ay) && (xwVar = ((ay) obj2).F3) != null) {
                        ex exVar = xwVar.a;
                        if (c3.i0.t(exVar)) {
                            this.g5 = exVar;
                        }
                    }
                }
                Object obj3 = this.g5;
                if (obj3 instanceof un) {
                    lVar = ((org.telegram.ui.ActionBar.k2) obj3).getActionBar();
                    lVar.setSkipDrawChild(true);
                } else {
                    lVar = null;
                }
                org.telegram.ui.Components.gg ggVar = this.g5;
                boolean z13 = (ggVar instanceof un) && ((un) ggVar).e != null;
                if (ggVar != null) {
                    ImageView imageView5 = this.i0;
                    if (imageView5 != null) {
                        if (!(ggVar instanceof un) || (chat = ((un) ggVar).e) == null || chat.linked_community_id == 0) {
                            imageView5.setTag(null);
                            this.i0.setVisibility(8);
                        } else {
                            imageView5.setTag(1);
                            this.i0.setVisibility(0);
                        }
                    }
                    if (this.l0 != null) {
                        org.telegram.ui.Components.gg ggVar2 = this.g5;
                        if ((ggVar2 instanceof un) && org.telegram.messenger.w3.p0(((un) ggVar2).e)) {
                            this.h0.setTag(null);
                            this.h0.setVisibility(8);
                        } else {
                            TLRPC.EncryptedChat encryptedChat = this.C2;
                            if (encryptedChat != null) {
                                this.l0.b(encryptedChat.ttl);
                                this.h0.setTag(1);
                                this.h0.setVisibility(0);
                            } else {
                                TLRPC.UserFull userFull = this.u2;
                                if (userFull != null) {
                                    this.l0.b(userFull.ttl_period);
                                    if (!this.J1 || this.u2.ttl_period == 0) {
                                        this.h0.setTag(null);
                                        this.h0.setVisibility(8);
                                    } else {
                                        this.h0.setTag(1);
                                        this.h0.setVisibility(0);
                                    }
                                } else {
                                    TLRPC.ChatFull chatFull = this.t2;
                                    if (chatFull != null) {
                                        this.l0.b(chatFull.ttl_period);
                                        if (!this.J1 || this.t2.ttl_period == 0) {
                                            this.h0.setTag(null);
                                            this.h0.setVisibility(8);
                                        } else {
                                            this.h0.setTag(1);
                                            this.h0.setVisibility(0);
                                        }
                                    } else {
                                        this.h0.setTag(null);
                                        this.h0.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                    J5();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(this.I1 == 2 ? 250L : 180L);
                this.a.setLayerType(2, null);
                if (z10) {
                    this.d6 = 0.0f;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.r.getLayoutParams();
                    t0Var = null;
                    layoutParams.rightMargin = (int) ((org.telegram.messenger.i0.p * (-21.0f)) + org.telegram.messenger.i0.L(8.0f));
                    this.r.setLayoutParams(layoutParams);
                    if (this.I1 != 2) {
                        j11 = 0;
                        int ceil = (int) Math.ceil((org.telegram.messenger.i0.p * 21.0f) + (org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(117.0f)));
                        float measureText = (this.f.getPaint().measureText(this.f.getText().toString()) * 1.12f) + this.f.getSideDrawablesSize();
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                        if (ceil < measureText) {
                            layoutParams2.width = (int) Math.ceil(r4 / 1.12f);
                        } else {
                            layoutParams2.width = -2;
                        }
                        this.f.setLayoutParams(layoutParams2);
                        this.Q1 = i4();
                    } else {
                        j11 = 0;
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                        layoutParams3.width = (int) ((org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(32.0f)) / 1.38f);
                        this.f.setLayoutParams(layoutParams3);
                    }
                    this.fragmentView.setBackgroundColor(0);
                    setAvatarAnimationProgress(0.0f);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 0.0f, 1.0f));
                    org.telegram.ui.Components.ei0 ei0Var = this.s;
                    if (ei0Var != null && ei0Var.getTag() == null) {
                        this.s.setScaleX(0.2f);
                        this.s.setScaleY(0.2f);
                        this.s.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ei0, Float>) View.SCALE_X, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ei0, Float>) View.SCALE_Y, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ei0, Float>) View.ALPHA, 1.0f));
                    }
                    mw0 mw0Var = this.u0;
                    if (mw0Var != null && this.I1 == 2) {
                        mw0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.u0, (Property<mw0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.I1 == 2) {
                        this.r0 = e4(this.e0.getImageReceiver());
                        this.f.setTextColor(-1);
                        this.r.setTextColor(-1275068417);
                        this.actionBar.C(1090519039, false);
                        iy0 iy0Var = this.x6;
                        if (iy0Var != null) {
                            iy0Var.a(603979775);
                        }
                        yx0 yx0Var = this.M;
                        yx0Var.E = true;
                        yx0Var.setVisibility(0);
                    }
                    if (this.I1 == 2) {
                        this.f.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<kl, Float>) View.ALPHA, 1.0f));
                    } else {
                        this.f.setAlpha(1.0f);
                    }
                    if (this.u0 != null) {
                        if (a() > j11) {
                            this.u0.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.u0, (Property<mw0, Float>) View.ALPHA, 1.0f));
                        } else {
                            this.u0.setAlpha(1.0f);
                            this.u0.setFragmentTransitionProgress(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.u0, "fragmentTransitionProgress", 1.0f));
                        }
                    }
                    rh.g0 g0Var = this.v0;
                    if (g0Var != null) {
                        g0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.v0, (Property<rh.g0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.h0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.h0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.h0, (Property<ImageView, Float>) View.SCALE_X, 0.85f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.h0, (Property<ImageView, Float>) View.SCALE_Y, 0.85f, 0.0f));
                    }
                    if (this.i0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.i0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.i0, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.i0, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.k0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.k0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.k0, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.k0, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.j0.getTag() != null) {
                        arrayList.add(ObjectAnimator.ofFloat(this.j0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.j0, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.j0, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f));
                    }
                    if (this.L0 && (this.e1 != j11 || z13)) {
                        this.P0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<org.telegram.ui.ActionBar.p5, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.M0) {
                        this.Q0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.p5, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.p5, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.X0.getTag() != null) {
                        this.X0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.X0, (Property<ImageView, Float>) View.ALPHA, 1.0f));
                    }
                    jw0 jw0Var = this.e0;
                    if (jw0Var != null) {
                        jw0Var.setCrossfadeProgress(1.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.e0, jx0.g0, 0.0f));
                    }
                    org.telegram.ui.Components.gg ggVar3 = this.g5;
                    if (ggVar3 != null) {
                        org.telegram.ui.Components.sn q6 = ggVar3.q();
                        if (q6 != null) {
                            org.telegram.ui.Components.on onVar = q6.e;
                            org.telegram.ui.Components.uu0 D = this.g5.D();
                            RectF rectF = zg.h.h;
                            zg.h.c(onVar, D, rectF);
                            this.d6 = rectF.left;
                        }
                        if ((q6 == null || !(q6.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.u5) || ((org.telegram.ui.ActionBar.u5) q6.getSubtitleTextView()).getLeftDrawable() == null) && !q6.S[0]) {
                            z12 = false;
                        } else {
                            this.W4 = q6.getSubtitleTextView();
                            this.Y.invalidate();
                            this.r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<lw0, Float>) View.ALPHA, 1.0f));
                            z12 = true;
                        }
                        setAvatarAnimationProgress(0.0f);
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        if (this.I1 == 2) {
                            this.r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<lw0, Float>) View.ALPHA, 1.0f));
                        } else {
                            this.r.setAlpha(1.0f);
                        }
                    }
                    animatorSet.playTogether(arrayList);
                } else {
                    t0Var = null;
                    this.Q1 = this.P1;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 1.0f, 0.0f));
                    org.telegram.ui.Components.ei0 ei0Var2 = this.s;
                    if (ei0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(ei0Var2, (Property<org.telegram.ui.Components.ei0, Float>) View.SCALE_X, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ei0, Float>) View.SCALE_Y, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ei0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.I1 == 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f, (Property<kl, Float>) View.ALPHA, 0.0f));
                    }
                    mw0 mw0Var2 = this.u0;
                    if (mw0Var2 != null) {
                        if (this.h1 > 0) {
                            arrayList2.add(ObjectAnimator.ofFloat(mw0Var2, (Property<mw0, Float>) View.ALPHA, 0.0f));
                        } else {
                            arrayList2.add(ObjectAnimator.ofFloat(mw0Var2, "fragmentTransitionProgress", 0.0f));
                        }
                    }
                    rh.g0 g0Var2 = this.v0;
                    if (g0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(g0Var2, (Property<rh.g0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.h0.getTag() != null) {
                        this.h0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.h0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.h0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 0.85f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.h0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 0.85f));
                    }
                    if (this.i0.getTag() != null) {
                        this.i0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.i0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.i0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.i0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.k0.getTag() != null) {
                        this.k0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.k0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.k0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.k0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.j0.getTag() != null) {
                        this.j0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.j0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.j0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.j0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.L0 && (this.e1 != 0 || z13)) {
                        this.P0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.P0, (Property<org.telegram.ui.ActionBar.p5, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.M0) {
                        this.Q0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.p5, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.p5, Float>) View.ALPHA, 0.0f));
                    }
                    ImageView imageView6 = this.X0;
                    if (imageView6 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) View.ALPHA, imageView6.getAlpha(), 0.0f));
                    }
                    jw0 jw0Var2 = this.e0;
                    if (jw0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(jw0Var2, jx0.g0, 1.0f));
                    }
                    org.telegram.ui.ActionBar.k2 k2Var = this.parentLayout.getFragmentStack().size() > 1 ? (org.telegram.ui.ActionBar.k2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) : null;
                    if (k2Var instanceof un) {
                        un unVar = (un) k2Var;
                        qj qjVar = unVar.o1;
                        org.telegram.messenger.i0.K(qjVar, new qd0(this, qjVar, unVar, 27));
                        View subtitleTextView = qjVar.getSubtitleTextView();
                        if (((subtitleTextView instanceof org.telegram.ui.ActionBar.u5) && ((org.telegram.ui.ActionBar.u5) subtitleTextView).getLeftDrawable() != null) || qjVar.S[0]) {
                            this.W4 = qjVar.getSubtitleTextView();
                            this.Y.invalidate();
                            arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<lw0, Float>) View.ALPHA, 0.0f));
                            z11 = true;
                            if (!z11 && this.I1 == 2) {
                                arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<lw0, Float>) View.ALPHA, 0.0f));
                            }
                            animatorSet.playTogether(arrayList2);
                            oy0Var = this.y6;
                            if (oy0Var != null) {
                                oy0Var.animate().alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            }
                        }
                    }
                    z11 = false;
                    if (!z11) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<lw0, Float>) View.ALPHA, 0.0f));
                    }
                    animatorSet.playTogether(arrayList2);
                    oy0Var = this.y6;
                    if (oy0Var != null) {
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new lv0(this, i10));
                animatorSet.playTogether(ofFloat);
                if (this.O0 == null || (obj = this.g5) == null || (yVar = ((org.telegram.ui.ActionBar.k2) obj).getActionBar().E) == null || (j10 = yVar.j(32)) == null || j10.getVisibility() != 0) {
                    t0Var2 = t0Var;
                } else {
                    j10.setAlpha(0.0f);
                    if (z10) {
                        this.O0.setVisibility(0);
                    }
                    this.O0.setTag(j10);
                    t0Var2 = j10;
                }
                animatorSet.addListener(new ci.i((Object) this, (Object) lVar, (View) t0Var2, (Object) runnable, 4));
                animatorSet.setInterpolator(this.I1 == 2 ? org.telegram.ui.Components.gr.f : new DecelerateInterpolator());
                org.telegram.messenger.i0.h3(new rr0(animatorSet, 4), 50L);
                return animatorSet;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onDialogDismiss(Dialog dialog) {
        bw0 bw0Var = this.a;
        if (bw0Var != null) {
            bw0Var.g1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0458  */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        long e;
        org.telegram.ui.Components.rt0 rt0Var;
        xx0 xx0Var;
        this.d1 = this.arguments.getLong("user_id", 0L);
        this.e1 = this.arguments.getLong("chat_id", 0L);
        this.f1 = this.arguments.getLong("topic_id", 0L);
        this.g1 = this.arguments.getBoolean("saved", false);
        this.q1 = this.arguments.getBoolean("similar", false);
        this.p1 = this.f1 != 0;
        this.D1 = this.arguments.getLong("ban_chat_id", 0L);
        this.Z4 = this.arguments.getInt("report_reaction_message_id", 0);
        this.a5 = this.arguments.getLong("report_reaction_from_dialog_id", 0L);
        this.c5 = this.arguments.getBoolean("show_add_to_contacts", true);
        this.d5 = af.b.d(this.arguments.getString("vcard_phone"), false);
        this.e5 = this.arguments.getString("vcard_first_name");
        this.f5 = this.arguments.getString("vcard_last_name");
        this.k1 = this.arguments.getBoolean("reportSpam", false);
        this.r1 = this.arguments.getBoolean("my_profile", false);
        this.s1 = this.arguments.getBoolean("open_gifts", false);
        this.u1 = this.arguments.getBoolean("open_gifts_upgradable", false);
        this.t1 = this.arguments.getInt("open_gifts_collection", 0);
        this.w1 = this.arguments.getBoolean("open_common", false);
        this.x1 = this.arguments.getInt("open_story_album_id", -1);
        this.I0 = this.arguments.getBoolean("hasMainTabs", false);
        if (!this.m1) {
            boolean z10 = this.arguments.getBoolean("expandPhoto", false);
            this.m1 = z10;
            if (z10) {
                this.j2 = 1.0f;
                this.n1 = true;
            }
        }
        if (this.d1 == 0) {
            if (this.e1 != 0) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.e1));
                this.D2 = L0;
                if (L0 == null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    getMessagesStorage().a.c(new et0(12, this, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                    }
                    if (this.D2 != null) {
                        getMessagesController().N3(this.D2, true);
                    }
                }
                org.telegram.messenger.o6 o6Var = this.W1;
                if (o6Var != null) {
                    o6Var.g();
                }
                if (this.D2.megagroup) {
                    g4(true);
                } else {
                    this.B1 = null;
                }
                getNotificationCenter().c(this, org.telegram.messenger.zs.T);
                getNotificationCenter().c(this, org.telegram.messenger.zs.g1);
                getNotificationCenter().c(this, org.telegram.messenger.zs.w2);
                getNotificationCenter().c(this, org.telegram.messenger.zs.b1);
                getNotificationCenter().c(this, org.telegram.messenger.zs.p3);
                org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.B5);
                this.B2 = new ArrayList();
                F5(true);
                if (this.t2 == null) {
                    this.t2 = getMessagesController().M0(this.e1);
                }
                if (org.telegram.messenger.w3.T(this.D2)) {
                    getMessagesController().T2(this.classGuid, this.e1, true);
                } else if (this.t2 == null) {
                    this.t2 = getMessagesStorage().F0(this.e1, false, null, false, false, 0);
                }
                u5();
                e = getUserConfig().e();
                if (this.d1 != e) {
                }
                this.r1 = true;
                rt0Var = this.Q;
                if (rt0Var != null) {
                    rt0Var.b(this);
                    this.Q = null;
                }
                if (this.Q == null) {
                }
                this.Q.y.add(this);
                getNotificationCenter().c(this, org.telegram.messenger.zs.r);
                getNotificationCenter().c(this, 1);
                getNotificationCenter().c(this, org.telegram.messenger.zs.t);
                getNotificationCenter().c(this, org.telegram.messenger.zs.v);
                getNotificationCenter().c(this, org.telegram.messenger.zs.q5);
                getNotificationCenter().c(this, org.telegram.messenger.zs.D1);
                getNotificationCenter().c(this, org.telegram.messenger.zs.c0);
                getNotificationCenter().c(this, org.telegram.messenger.zs.v5);
                getNotificationCenter().c(this, org.telegram.messenger.zs.F5);
                getNotificationCenter().c(this, org.telegram.messenger.zs.i3);
                getNotificationCenter().c(this, org.telegram.messenger.zs.f5);
                getNotificationCenter().c(this, org.telegram.messenger.zs.y3);
                getNotificationCenter().c(this, org.telegram.messenger.zs.C3);
                getNotificationCenter().c(this, org.telegram.messenger.zs.D3);
                getNotificationCenter().c(this, org.telegram.messenger.zs.y1);
                getNotificationCenter().c(this, org.telegram.messenger.zs.f3);
                getNotificationCenter().c(this, org.telegram.messenger.zs.G3);
                getNotificationCenter().c(this, org.telegram.messenger.zs.V3);
                getNotificationCenter().c(this, org.telegram.messenger.zs.W3);
                org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
                I5();
                xx0Var = this.d;
                if (xx0Var != null) {
                }
                if (this.arguments.containsKey("preload_messages")) {
                }
                if (this.d1 != 0) {
                    getConnectionsManager().sendRequest(new TL_account.getPassword(), new pv0(this, 5));
                }
                setBulletinDelegate(new z8(this, 8));
                if (this.d1 != 0) {
                    getMessagesController().Q0(null);
                }
                V4();
                this.F6 = !this.I0 ? org.telegram.messenger.i0.L(72.0f) : 0;
                this.G6 = this.I0 ? org.telegram.messenger.i0.L(64.0f) : 0;
                return true;
            }
            return false;
        }
        long j10 = this.arguments.getLong("dialog_id", 0L);
        this.h1 = j10;
        if (j10 != 0) {
            this.C2 = getMessagesController().Z0(Integer.valueOf((int) (this.h1 & 4294967295L)));
        }
        org.telegram.messenger.o6 o6Var2 = this.W1;
        if (o6Var2 != null) {
            o6Var2.g();
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.d1));
        if (Z1 != null) {
            getNotificationCenter().c(this, org.telegram.messenger.zs.O);
            getNotificationCenter().c(this, org.telegram.messenger.zs.s1);
            getNotificationCenter().c(this, org.telegram.messenger.zs.a0);
            getNotificationCenter().c(this, org.telegram.messenger.zs.Y);
            getNotificationCenter().c(this, org.telegram.messenger.zs.g0);
            getNotificationCenter().c(this, org.telegram.messenger.zs.D0);
            getNotificationCenter().c(this, org.telegram.messenger.zs.E0);
            getNotificationCenter().c(this, org.telegram.messenger.zs.k0);
            org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.x4);
            this.j1 = getMessagesController().G0.indexOfKey(this.d1) >= 0;
            if (Z1.bot) {
                this.q2 = true;
                org.telegram.messenger.ui mediaDataController = getMediaDataController();
                long j11 = Z1.id;
                mediaDataController.G0(j11, j11, true, this.classGuid, null);
            }
            this.u2 = getMessagesController().a2(this.d1);
            getMessagesController().U2(getMessagesController().Z1(Long.valueOf(this.d1)), this.classGuid, true, null);
            this.B1 = null;
            if (org.telegram.messenger.h20.B(Z1)) {
                org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(0, true, true);
                this.q0 = b40Var;
                b40Var.H = true;
                b40Var.a = this;
                b40Var.b = this;
                getMediaDataController().x();
                getMessagesController().b3();
                getMessagesController().e3(getUserConfig().f(), true, this.classGuid);
            }
            this.X4 = this.arguments.getInt("actionBarColor", 0);
            e = getUserConfig().e();
            if ((this.d1 != e || this.h1 == e) && !this.r1) {
                this.r1 = true;
            }
            rt0Var = this.Q;
            if (rt0Var != null && rt0Var.s != this.f1) {
                rt0Var.b(this);
                this.Q = null;
            }
            if (this.Q == null) {
                this.Q = new org.telegram.ui.Components.rt0(this);
            }
            this.Q.y.add(this);
            getNotificationCenter().c(this, org.telegram.messenger.zs.r);
            getNotificationCenter().c(this, 1);
            getNotificationCenter().c(this, org.telegram.messenger.zs.t);
            getNotificationCenter().c(this, org.telegram.messenger.zs.v);
            getNotificationCenter().c(this, org.telegram.messenger.zs.q5);
            getNotificationCenter().c(this, org.telegram.messenger.zs.D1);
            getNotificationCenter().c(this, org.telegram.messenger.zs.c0);
            getNotificationCenter().c(this, org.telegram.messenger.zs.v5);
            getNotificationCenter().c(this, org.telegram.messenger.zs.F5);
            getNotificationCenter().c(this, org.telegram.messenger.zs.i3);
            getNotificationCenter().c(this, org.telegram.messenger.zs.f5);
            getNotificationCenter().c(this, org.telegram.messenger.zs.y3);
            getNotificationCenter().c(this, org.telegram.messenger.zs.C3);
            getNotificationCenter().c(this, org.telegram.messenger.zs.D3);
            getNotificationCenter().c(this, org.telegram.messenger.zs.y1);
            getNotificationCenter().c(this, org.telegram.messenger.zs.f3);
            getNotificationCenter().c(this, org.telegram.messenger.zs.G3);
            getNotificationCenter().c(this, org.telegram.messenger.zs.V3);
            getNotificationCenter().c(this, org.telegram.messenger.zs.W3);
            org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
            I5();
            xx0Var = this.d;
            if (xx0Var != null) {
                xx0Var.f();
            }
            if (this.arguments.containsKey("preload_messages")) {
                getMessagesController().s0(this.d1, 0, null);
            }
            if (this.d1 != 0 && org.telegram.messenger.h20.B(getMessagesController().Z1(Long.valueOf(this.d1)))) {
                getConnectionsManager().sendRequest(new TL_account.getPassword(), new pv0(this, 5));
            }
            setBulletinDelegate(new z8(this, 8));
            if (this.d1 != 0 && org.telegram.messenger.h20.B(getMessagesController().Z1(Long.valueOf(this.d1))) && !this.r1) {
                getMessagesController().Q0(null);
            }
            V4();
            this.F6 = !this.I0 ? org.telegram.messenger.i0.L(72.0f) : 0;
            this.G6 = this.I0 ? org.telegram.messenger.i0.L(64.0f) : 0;
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        ix0 ix0Var = this.N;
        if (ix0Var != null) {
            ix0Var.N0();
        }
        org.telegram.ui.Components.rt0 rt0Var = this.Q;
        if (rt0Var != null) {
            rt0Var.b(this);
        }
        org.telegram.ui.Components.rt0 rt0Var2 = this.Q;
        if (rt0Var2 != null) {
            rt0Var2.y.remove(this);
        }
        getNotificationCenter().n(this, org.telegram.messenger.zs.r);
        getNotificationCenter().n(this, org.telegram.messenger.zs.t);
        getNotificationCenter().n(this, org.telegram.messenger.zs.v);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.zs.q5);
        getNotificationCenter().n(this, org.telegram.messenger.zs.D1);
        getNotificationCenter().n(this, org.telegram.messenger.zs.c0);
        getNotificationCenter().n(this, org.telegram.messenger.zs.v5);
        getNotificationCenter().n(this, org.telegram.messenger.zs.F5);
        getNotificationCenter().n(this, org.telegram.messenger.zs.i3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f5);
        getNotificationCenter().n(this, org.telegram.messenger.zs.y3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.C3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.D3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.y1);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.G3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.V3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.W3);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
        kw0 kw0Var = this.n0;
        if (kw0Var != null) {
            kw0Var.K();
        }
        org.telegram.ui.Components.mg0 mg0Var = this.m0;
        if (mg0Var != null) {
            mg0Var.d();
        }
        this.Y5 = null;
        if (this.d1 != 0) {
            getNotificationCenter().n(this, org.telegram.messenger.zs.s1);
            getNotificationCenter().n(this, org.telegram.messenger.zs.O);
            getNotificationCenter().n(this, org.telegram.messenger.zs.a0);
            getNotificationCenter().n(this, org.telegram.messenger.zs.Y);
            getNotificationCenter().n(this, org.telegram.messenger.zs.g0);
            getNotificationCenter().n(this, org.telegram.messenger.zs.D0);
            getNotificationCenter().n(this, org.telegram.messenger.zs.E0);
            getNotificationCenter().n(this, org.telegram.messenger.zs.k0);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.x4);
            getMessagesController().q1.remove(Long.valueOf(this.d1));
        } else if (this.e1 != 0) {
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.B5);
            getNotificationCenter().n(this, org.telegram.messenger.zs.p3);
            getNotificationCenter().n(this, org.telegram.messenger.zs.T);
            getNotificationCenter().n(this, org.telegram.messenger.zs.g1);
            getNotificationCenter().n(this, org.telegram.messenger.zs.w2);
            getNotificationCenter().n(this, org.telegram.messenger.zs.b1);
        }
        jw0 jw0Var = this.e0;
        if (jw0Var != null) {
            jw0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.b40 b40Var = this.q0;
        if (b40Var != null) {
            b40Var.d();
        }
        ow0 ow0Var = this.V4;
        if (ow0Var != null) {
            ow0Var.b();
        }
        ly0 ly0Var = this.x2;
        if (ly0Var != null && this.w2) {
            ly0Var.b(true);
            this.x2 = null;
        }
        org.telegram.messenger.video.o oVar = this.x5;
        if (oVar != null) {
            this.x5 = null;
            org.telegram.messenger.i0.g3(oVar);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        org.telegram.ui.Components.fs0 fs0Var;
        super.onPause();
        UndoView undoView = this.L;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.b40 b40Var = this.q0;
        if (b40Var != null) {
            b40Var.i();
        }
        org.telegram.messenger.o6 o6Var = this.W1;
        if (o6Var != null) {
            o6Var.e();
        }
        ix0 ix0Var = this.N;
        if (ix0Var == null || (fs0Var = ix0Var.V) == null) {
            return;
        }
        fs0Var.e = false;
        if (fs0Var.c != null) {
            fs0Var.a.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.b40 b40Var = this.q0;
        if (b40Var != null) {
            b40Var.j(i10, strArr, iArr);
        }
        if (i10 != 101 && i10 != 102) {
            if (i10 != 103 || this.D2 == null) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= iArr.length) {
                    z11 = true;
                    break;
                } else {
                    if (iArr[i11] != 0) {
                        z11 = false;
                        break;
                    }
                    i11++;
                }
            }
            if (iArr.length <= 0 || !z11) {
                org.telegram.ui.Components.voip.m1.h(getParentActivity(), null, i10);
                return;
            } else {
                org.telegram.ui.Components.voip.m1.l(this.D2, null, getMessagesController().f1(this.e1, false, null) == null, null, getParentActivity(), this, getAccountInstance());
                return;
            }
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.d1));
        if (Z1 == null) {
            return;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= iArr.length) {
                z10 = true;
                break;
            } else {
                if (iArr[i12] != 0) {
                    z10 = false;
                    break;
                }
                i12++;
            }
        }
        if (iArr.length <= 0 || !z10) {
            org.telegram.ui.Components.voip.m1.h(getParentActivity(), null, i10);
            return;
        }
        boolean z12 = i10 == 102;
        TLRPC.UserFull userFull = this.u2;
        org.telegram.ui.Components.voip.m1.m(Z1, z12, userFull != null && userFull.video_calls_available, getParentActivity(), this.u2, getAccountInstance());
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        TLRPC.User Z1;
        do0 do0Var;
        super.onResume();
        ix0 ix0Var = this.N;
        if (ix0Var != null) {
            ix0Var.d1 = true;
            org.telegram.ui.Components.es0 es0Var = ix0Var.J;
            if (es0Var != null) {
                es0Var.f();
            }
            org.telegram.ui.Components.mt0 mt0Var = ix0Var.M;
            if (mt0Var != null) {
                mt0Var.f();
            }
            org.telegram.ui.Components.nt0 nt0Var = ix0Var.L;
            if (nt0Var != null) {
                nt0Var.X(false);
            }
            for (int i10 = 0; i10 < ix0Var.m0.length; i10++) {
                ix0Var.c0(i10);
            }
            org.telegram.ui.Components.fs0 fs0Var = ix0Var.V;
            if (fs0Var != null) {
                fs0Var.e = true;
                if (fs0Var.c != null) {
                    fs0Var.a.onResume();
                }
            }
        }
        s4();
        xx0 xx0Var = this.d;
        if (xx0Var != null) {
            this.T4 = true;
            xx0Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).x() && (do0Var = this.T) != null && do0Var.getVisibility() == 0) {
            this.T.setVisibility(8);
            this.T.setBackground(null);
        }
        org.telegram.ui.Components.b40 b40Var = this.q0;
        if (b40Var != null) {
            b40Var.k();
            setParentActivityTitle(org.telegram.messenger.cd.L0(2131745512, null));
        }
        H5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new e7(this, 5));
        }
        kl klVar = this.f;
        if (klVar != null) {
            setParentActivityTitle(klVar.getText());
        }
        if (this.d1 != 0 && (Z1 = getMessagesController().Z1(Long.valueOf(this.d1))) != null && Z1.photo == null && this.P1 >= i4()) {
            this.i2.cancel();
            float[] fArr = this.l2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            W4(1.0f);
            this.n0.setVisibility(8);
            this.P1 = i4();
            this.n2 = false;
            this.c.h1(0, i4() - this.a.getPaddingTop());
        }
        org.telegram.messenger.o6 o6Var = this.W1;
        if (o6Var != null) {
            o6Var.a();
        }
        B5();
        x4(false);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.y0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, this.z0));
            l5();
            L5();
            I3();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.i5 i5Var;
        if (z10 && (i5Var = this.simpleActionBar) != null) {
            i5Var.setAlpha(1.0f);
        }
        if (z10) {
            if (!z11) {
                int i10 = this.I1;
                if (i10 != 0 && this.L1) {
                    if (i10 == 1) {
                        this.j2 = 0.0f;
                        org.telegram.ui.Components.nv0 nv0Var = this.S;
                        if (nv0Var != null) {
                            nv0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.hg0 hg0Var = this.Z;
                        if (hg0Var != null) {
                            hg0Var.setParentExpanded(0.0f);
                        }
                        Y4(0.0f);
                        org.telegram.ui.Components.bh0 bh0Var = this.b0;
                        if (bh0Var != null) {
                            bh0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.F1 = false;
                    N3();
                    if (this.H1) {
                        R3(true);
                    }
                }
                if (!this.l5) {
                    this.l5 = true;
                    this.U4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.P4);
            do0 do0Var = this.T;
            if (do0Var != null && do0Var.getVisibility() == 0) {
                this.T.setVisibility(8);
                this.T.setBackground(null);
            }
        }
        this.G1 = false;
        P3();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        do0 do0Var = this.T;
        if (do0Var == null || do0Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.T.setAlpha(1.0f - f7);
        } else {
            this.T.setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        ImageView imageView;
        org.telegram.ui.Components.hg0 hg0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.b6 = z10;
        if (z10 && (hg0Var = this.Z) != null) {
            ArrayList arrayList = hg0Var.a;
            if (hg0Var.E == 6) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.ui.Components.eg0 eg0Var = (org.telegram.ui.Components.eg0) arrayList.get(i10);
                    org.telegram.ui.Components.bi0 bi0Var = eg0Var.k;
                    if (bi0Var != null) {
                        if (eg0Var.a == 15) {
                            bi0Var.M(14);
                        } else {
                            bi0Var.M(0);
                        }
                        eg0Var.k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.O0) != null && imageView.getTag() != null && (this.O0.getTag() instanceof org.telegram.ui.ActionBar.t0)) {
            ((org.telegram.ui.ActionBar.t0) this.O0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.I1 != 0 && this.L1 && !this.o2) {
            this.F1 = true;
            if (!z10) {
                if (this.Y5 == null) {
                    this.Y5 = new float[14];
                }
                this.E1 = this.P1;
                this.Y5[0] = this.X.getScaleX();
                this.Y5[1] = this.X.getTranslationX();
                this.Y5[2] = this.X.getTranslationY();
                org.telegram.ui.Components.hg0 hg0Var2 = this.Z;
                if (hg0Var2 != null) {
                    this.Y5[3] = hg0Var2.getAlpha();
                }
                rh.g0 g0Var = this.v0;
                if (g0Var != null) {
                    float[] fArr = this.Y5;
                    fArr[4] = g0Var.e;
                    fArr[5] = g0Var.f;
                }
                if (this.x6 != null) {
                    this.Y5[6] = r0.getAlpha();
                }
                this.Y5[7] = this.f.getScaleX();
                this.Y5[8] = this.f.getTranslationY();
                this.Y5[9] = this.r.getTranslationY();
                this.Y5[10] = this.f.getLayoutParams().width;
                float[] fArr2 = this.Y5;
                fArr2[11] = this.b2;
                fArr2[12] = this.f.getTranslationX();
                this.Y5[13] = this.r.getTranslationX();
                vh.p2 p2Var = this.z6;
                if (p2Var != null) {
                    p2Var.e(true);
                }
            }
        }
        if (z10) {
            if (this.q0 != null) {
                this.P4 = getNotificationCenter().q(new int[]{org.telegram.messenger.zs.s, org.telegram.messenger.zs.t, org.telegram.messenger.zs.W, org.telegram.messenger.zs.X, org.telegram.messenger.zs.E0, org.telegram.messenger.zs.r4}, this.P4, true);
            } else {
                this.P4 = getNotificationCenter().q(new int[]{org.telegram.messenger.zs.s, org.telegram.messenger.zs.t, org.telegram.messenger.zs.W, org.telegram.messenger.zs.X, org.telegram.messenger.zs.r4}, this.P4, true);
            }
            if (!z11 && getParentActivity() != null) {
                this.Y4 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.G1 = true;
        P3();
    }

    public final int p4() {
        if (this.p1) {
            return 0;
        }
        if (this.e1 == 0 || !org.telegram.messenger.w3.c0(getMessagesController().L0(Long.valueOf(this.e1)))) {
            return org.telegram.messenger.i0.L(50.0f);
        }
        return org.telegram.messenger.i0.L(w4() ? 24.0f : 38.0f);
    }

    public final void p5() {
        vh.p2 p2Var = this.z6;
        if (p2Var == null) {
            return;
        }
        p2Var.m(0.0f, (this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX() + (-p2Var.getPaddingLeft()));
        float U1 = org.telegram.messenger.i0.U1(this.k2, this.l2);
        this.z6.setTranslationY(((this.f.getY() + (-r2.getPaddingBottom())) - org.telegram.messenger.i0.L(24.0f)) + org.telegram.messenger.i0.W1(U1, org.telegram.messenger.i0.L(6.0f), -org.telegram.messenger.i0.L(12.0f)));
        this.z6.h(i0.b.f(U1, this.A6, 1342177280));
        boolean z10 = this.P1 >= ((float) org.telegram.messenger.i0.L(82.0f));
        Boolean bool = this.B6;
        if (bool == null || bool.booleanValue() != z10) {
            ViewPropertyAnimator animate = this.z6.animate();
            this.B6 = Boolean.valueOf(z10);
            org.telegram.messenger.z20.m(animate.alpha(z10 ? 1.0f : 0.0f), org.telegram.ui.Components.gr.g, 200L);
        }
    }

    public final org.telegram.ui.Components.fr q4() {
        if (this.I == null) {
            this.y = org.telegram.ui.ActionBar.t6.Q1.getConstantState().newDrawable().mutate();
            this.H = org.telegram.ui.ActionBar.t6.R1.getConstantState().newDrawable().mutate();
            org.telegram.messenger.kp kpVar = this.f6;
            if (kpVar != null) {
                int b10 = org.telegram.ui.ActionBar.t6.b(0.1f, org.telegram.ui.ActionBar.t6.I.q() ? -0.1f : -0.08f, kpVar.o(org.telegram.ui.ActionBar.t6.I.q()) ? this.f6.k() : this.f6.i());
                Drawable drawable = this.y;
                int S0 = org.telegram.messenger.i0.S0(this.P5, 1.0f, b10, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, this.z0));
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(S0, mode);
                this.H.setColorFilter(org.telegram.messenger.i0.S0(this.P5, 1.0f, -1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.z0)), mode);
            }
            this.I = new org.telegram.ui.Components.fr(new org.telegram.ui.Components.eq(this.y, this.H), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return this.I;
    }

    public final void q5() {
        if (getParentActivity() == null || this.U0 == null) {
            return;
        }
        if (getUserConfig().q()) {
            this.U0.setIcon(R.drawable.menu_profile_colors);
            return;
        }
        Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, this.z0), PorterDuff.Mode.SRC_IN));
        this.O6 = drawable;
        Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
        drawable2.setColorFilter(new PorterDuffColorFilter(i0.b.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.U0.setIcon(new zw0(drawable, drawable2, org.telegram.messenger.i0.L(1.0f), -org.telegram.messenger.i0.L(1.0f)));
    }

    public final boolean r4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i10 = 0;
        if (!this.q2 || (userFull = this.u2) == null || (botInfo = userFull.bot_info) == null) {
            return false;
        }
        if (botInfo.privacy_policy_url != null) {
            return true;
        }
        ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
        int size = arrayList.size();
        while (i10 < size) {
            TLRPC.BotCommand botCommand = arrayList.get(i10);
            i10++;
            if ("privacy".equals(botCommand.command)) {
                return true;
            }
        }
        return true;
    }

    public final void r5() {
        s5(this.e6);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.b40 b40Var = this.q0;
        if (b40Var != null) {
            b40Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.Components.ms0
    public final boolean s() {
        return this.b6;
    }

    public final void s4() {
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        this.m2 = point.x > point.y;
    }

    public final void s5(float f7) {
        int S0;
        org.telegram.messenger.kp kpVar = this.f6;
        if (kpVar != null) {
            S0 = i0.b.f(0.25f, kpVar.m(org.telegram.ui.ActionBar.t6.I.q()), -1);
        } else {
            S0 = org.telegram.messenger.i0.S0(this.P5, 1.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.z0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, this.z0));
        }
        int f10 = i0.b.f(f7, S0, -1);
        int i10 = org.telegram.ui.ActionBar.t6.Cj;
        int f11 = i0.b.f(Math.max(this.P5, this.A5), f10, org.telegram.ui.ActionBar.t6.w0(i10, this.z0));
        org.telegram.ui.Components.d5 d5Var = this.F;
        if (d5Var != null) {
            d5Var.k(Integer.valueOf(f11));
        }
        org.telegram.ui.Components.d5 d5Var2 = this.G;
        if (d5Var2 != null) {
            d5Var2.k(Integer.valueOf(i0.b.f(this.P5, i0.b.f(f7, S0, -1711276033), org.telegram.ui.ActionBar.t6.w0(i10, this.z0))));
        }
        this.d0.setColor(f11);
        this.e6 = f7;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.b40 b40Var = this.q0;
        if (b40Var == null || (str = b40Var.f) == null) {
            return;
        }
        bundle.putString("path", str);
    }

    public void setAvatarAnimationProgress(float f7) {
        int w02;
        int w03;
        int w04;
        this.j2 = f7;
        this.R1 = f7;
        P3();
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            i5Var.setAlpha(f7);
        }
        if (this.I1 == 2) {
            this.e0.setProgressToExpand(f7);
            org.telegram.ui.Components.hg0 hg0Var = this.Z;
            if (hg0Var != null) {
                hg0Var.setParentExpanded(f7);
            }
            Y4(f7);
            org.telegram.ui.Components.bh0 bh0Var = this.b0;
            if (bh0Var != null) {
                bh0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.nv0 nv0Var = this.S;
            if (nv0Var != null) {
                nv0Var.setParentExpanded(f7);
            }
            m5();
            D5();
        }
        this.a.setAlpha(f7);
        this.a.setTranslationX(org.telegram.messenger.i0.L(48.0f) - (org.telegram.messenger.i0.L(48.0f) * f7));
        if (this.I1 != 2 || (w02 = this.r0) == 0) {
            if (this.d1 == 0) {
                if (org.telegram.messenger.w3.S(this.currentAccount, this.e1)) {
                    boolean z10 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.p6 p6Var = this.z0;
            int[][] iArr = org.telegram.ui.Components.r8.L;
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, p6Var);
        }
        int i10 = this.X4;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, this.z0);
        }
        this.c1.setBackgroundColor(i0.b.f(f7, i0.b.o(i10, 0), w02));
        org.telegram.ui.Components.f11 f11Var = this.l0;
        int f10 = i0.b.f(f7, i10, w02);
        f11Var.k = true;
        f11Var.b.setColor(f10);
        if (this.f6 != null) {
            w03 = -1;
        } else {
            if (this.d1 == 0) {
                if (org.telegram.messenger.w3.S(this.currentAccount, this.e1)) {
                    boolean z11 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.p6 p6Var2 = this.z0;
            int[][] iArr2 = org.telegram.ui.Components.r8.L;
            w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.g8, p6Var2);
        }
        this.actionBar.D(i0.b.f(this.R1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v8, this.z0), w03), false);
        int w05 = this.f6 == null ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ji, this.z0) : -1;
        int w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, this.z0);
        kl klVar = this.f;
        if (klVar != null && this.I1 != 2) {
            klVar.setTextColor(i0.b.f(f7, w06, w05));
        }
        boolean[] zArr = this.J0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.pi, this.z0);
        } else {
            if (this.d1 == 0) {
                if (org.telegram.messenger.w3.S(this.currentAccount, this.e1)) {
                    boolean z12 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.p6 p6Var3 = this.z0;
            int[][] iArr3 = org.telegram.ui.Components.r8.L;
            w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h8, p6Var3);
        }
        int w07 = org.telegram.ui.ActionBar.t6.w0(zArr[0] ? org.telegram.ui.ActionBar.t6.pa : org.telegram.ui.ActionBar.t6.B8, this.z0);
        lw0 lw0Var = this.r;
        if (lw0Var != null && this.I1 != 2) {
            lw0Var.setTextColor(i0.b.f(f7, w07, H3(w04, Boolean.valueOf(zArr[0]))));
        }
        this.P1 = this.Q1 * f7;
        long j10 = this.d1;
        if (j10 == 0) {
            j10 = this.e1;
        }
        org.telegram.ui.ActionBar.p6 p6Var4 = this.z0;
        int[][] iArr4 = org.telegram.ui.Components.r8.L;
        int w08 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.p8[org.telegram.ui.Components.r8.e(j10)], p6Var4);
        long j11 = this.d1;
        if (j11 == 0) {
            j11 = this.e1;
        }
        int d = org.telegram.ui.Components.r8.d(j11);
        if (w08 != d) {
            this.p0.h(i0.b.f(f7, d, w08));
            this.e0.invalidate();
        }
        int i11 = this.Y4;
        if (i11 != 0) {
            setNavigationBarColor(i0.b.f(f7, i11, getNavigationBarColor()));
        }
        this.c1.invalidate();
        x4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        sx0 sx0Var = this.c6;
        if (sx0Var != null) {
            sx0Var.invalidate();
        }
        if (a() > 0) {
            jw0 jw0Var = this.e0;
            if (jw0Var != null) {
                jw0Var.setProgressToStoriesInsets(this.R1);
            }
            mw0 mw0Var = this.u0;
            if (mw0Var != null) {
                mw0Var.setProgressToStoriesInsets(this.R1);
            }
            rh.g0 g0Var = this.v0;
            if (g0Var != null) {
                g0Var.setProgressToStoriesInsets(this.R1);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setParentLayout(org.telegram.ui.ActionBar.z4 z4Var) {
        super.setParentLayout(z4Var);
        org.telegram.messenger.o6 o6Var = this.W1;
        if (o6Var != null) {
            o6Var.e();
            this.W1 = null;
        }
        if (z4Var == null || z4Var.getParentActivity() == null) {
            return;
        }
        this.W1 = new org.telegram.messenger.o6(z4Var.getParentActivity().getWindow(), new bv0(this, 8));
    }

    public final boolean t4() {
        if (this.D2 != null) {
            return getMessagesController().n2(this.D2);
        }
        org.telegram.messenger.vp messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.u2;
        messagesController.getClass();
        return org.telegram.messenger.vp.I2(userFull);
    }

    public final void t5() {
        this.d0.setScaleX(this.f.getScaleX());
        this.d0.setScaleY(this.f.getScaleY());
        this.d0.b((this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX(), (this.f.getHeight() - (this.f.getScaleY() * (this.f.getHeight() - this.f.getRightDrawableY()))) + this.f.getY());
    }

    @Override // org.telegram.ui.of0
    public final void u() {
        this.a.y0(0);
    }

    public final boolean u4() {
        return (this.q0 == null || this.r1) ? false : true;
    }

    public final void u5() {
        if (this.p1 || !org.telegram.messenger.w3.c0(this.D2)) {
            return;
        }
        org.telegram.messenger.ot notificationsController = getNotificationsController();
        notificationsController.getMessagesStorage().a.c(new org.telegram.messenger.d4(notificationsController, -this.e1, new xv0(this), 6));
    }

    public final void v4(boolean z10) {
        boolean c02 = org.telegram.messenger.w3.c0(this.D2);
        TLRPC.Chat chat = this.D2;
        org.telegram.ui.Components.s4.r(this, false, chat, null, false, c02 || z10 || (chat != null && chat.creator), z10, !c02, new bv0(this, 3));
    }

    public final void v5(float f7) {
        yx0 yx0Var;
        ValueAnimator valueAnimator;
        if (this.o2 || ((yx0Var = this.M) != null && (valueAnimator = yx0Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.M.getLayoutParams();
            layoutParams.width = this.a.getMeasuredWidth();
            layoutParams.height = (int) (this.P1 + f7);
            this.M.requestLayout();
        }
        ky0 ky0Var = this.c1;
        if (ky0Var != null) {
            ky0Var.E.setTranslate(0.0f, this.Z1 - ky0Var.y);
            ky0 ky0Var2 = this.c1;
            RadialGradient radialGradient = ky0Var2.D;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(ky0Var2.E);
            }
            this.c1.invalidate();
        }
        t5();
        m5();
        D5();
    }

    public final boolean w4() {
        return getMessagesController().O1().K(a()) && !this.p1;
    }

    public final void w5() {
        float f7 = 0.0f;
        if (!this.p1 && !this.F1) {
            f7 = w7.u.a((this.b2 - 0.6f) / 0.4f, 0.0f, 1.0f);
        }
        float f10 = this.A5;
        if (f10 != f7) {
            boolean z10 = ((f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1)) > 0) != ((f7 > 0.5f ? 1 : (f7 == 0.5f ? 0 : -1)) > 0);
            this.A5 = f7;
            kl klVar = this.f;
            if (klVar != null) {
                klVar.setTextColor(this.D5);
            }
            lw0 lw0Var = this.r;
            if (lw0Var != null) {
                lw0Var.setTextColor(this.E5);
            }
            r5();
            if (z10) {
                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.r4, Boolean.TRUE);
            }
            ky0 ky0Var = this.c1;
            if (ky0Var != null) {
                ky0Var.invalidate();
            }
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        z5();
        y5();
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ boolean x() {
        return false;
    }

    public final void x4(boolean z10) {
        float f7;
        float f10;
        org.telegram.ui.Components.g9 currentItemView;
        float f11;
        float f12;
        TLRPC.ChatFull chatFull;
        this.glassEngine.g();
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0);
        float K3 = K3();
        bw0 bw0Var = this.a;
        if (bw0Var != null && !this.F1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bw0Var.getLayoutParams();
            if (layoutParams.topMargin != currentActionBarHeight) {
                layoutParams.topMargin = currentActionBarHeight;
                this.a.setLayoutParams(layoutParams);
            }
        }
        N5(z10);
        if (this.X != null) {
            this.a.setTopGlowOffset((int) this.P1);
            this.a.setOverScrollMode((this.P1 <= ((float) i4()) || this.P1 >= ((float) ((d4() + this.a.getMeasuredWidth()) - currentActionBarHeight))) ? 0 : 2);
        }
        if (this.X != null && !this.b6 && this.F1) {
            J3();
            return;
        }
        int i42 = i4();
        if (this.X != null) {
            if (this.Z != null && this.e1 != 0) {
                this.Z.o(2, (!org.telegram.messenger.w3.T(this.D2) || this.D2.megagroup || (chatFull = this.t2) == null || chatFull.linked_chat_id == 0) ? false : true);
            }
            N5(z10);
            float translationY = this.actionBar.getTranslationY() + (org.telegram.messenger.z20.b(K3, 1.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0) - org.telegram.messenger.i0.L(21.0f));
            if (this.F1) {
                this.Z1 = translationY;
            } else {
                org.telegram.ui.Components.yg0 yg0Var = this.t0;
                if (yg0Var != null) {
                    f12 = -org.telegram.messenger.i0.L(29.0f);
                    org.telegram.messenger.ks ksVar = yg0Var.n;
                    if (ksVar != null && ksVar.c) {
                        f12 = ksVar.e.centerY();
                    }
                } else {
                    f12 = -org.telegram.messenger.i0.L(29.0f);
                }
                this.Z1 = org.telegram.messenger.i0.T1(f12, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0)) - org.telegram.messenger.i0.L(21.0f)), K3);
            }
            float f13 = this.F1 ? this.Q1 : this.P1;
            float f14 = i42;
            if (f13 > f14 || this.o2) {
                f7 = 2.0f;
                float max = Math.max(0.0f, Math.min(1.0f, (f13 - f14) / ((this.a.getMeasuredWidth() - currentActionBarHeight) - j4())));
                this.g2 = max;
                f10 = 18.0f;
                this.a2 = (org.telegram.messenger.i0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) / 100.0f) * 42.0f;
                this.b2 = 0.0f;
                mw0 mw0Var = this.u0;
                if (mw0Var != null) {
                    mw0Var.invalidate();
                }
                rh.g0 g0Var = this.v0;
                if (g0Var != null) {
                    g0Var.invalidate();
                }
                float min = Math.min(org.telegram.messenger.i0.N(2000.0f), Math.max(org.telegram.messenger.i0.N(1100.0f), Math.abs(this.h2))) / org.telegram.messenger.i0.N(1100.0f);
                d4();
                boolean z11 = this.n2;
                int i10 = org.telegram.messenger.zs.r4;
                float[] fArr = this.l2;
                if (!z11 || (!this.F0 && this.g2 < 0.33f)) {
                    if (this.o2) {
                        this.o2 = false;
                        org.telegram.messenger.zs.e().k(i10, Boolean.TRUE);
                        org.telegram.ui.ActionBar.p5 p5Var = this.S0;
                        if (p5Var != null) {
                            p5Var.t(21);
                            if (this.q0 != null) {
                                this.S0.t(33);
                                this.S0.t(34);
                                this.S0.t(35);
                                this.S0.S(36);
                                this.S0.S(31);
                            }
                        }
                        org.telegram.ui.ActionBar.p5 p5Var2 = this.T0;
                        if (p5Var2 != null) {
                            p5Var2.setEnabled(!this.y1);
                        }
                        this.M.f(false, min);
                        this.o0.b(min);
                        this.i2.cancel();
                        this.e0.getImageReceiver().t0 = true;
                        this.e0.getImageReceiver().P0(false);
                        float U1 = org.telegram.messenger.i0.U1(this.k2, fArr);
                        fArr[0] = U1;
                        fArr[1] = 0.0f;
                        this.i2.setInterpolator(org.telegram.ui.Components.gr.j);
                        if (this.m2) {
                            this.i2.setDuration(0L);
                        } else {
                            this.i2.setDuration((long) ((U1 * 250.0f) / min));
                        }
                        this.c1.setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, this.z0));
                        if (!this.H0 && (currentItemView = this.n0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().t() instanceof org.telegram.ui.Components.g61) {
                                this.e0.a0 = false;
                            } else {
                                jw0 jw0Var = this.e0;
                                jw0Var.a0 = true;
                                jw0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.i2.addListener(new nw0(this, 5));
                        this.e0.setForegroundAlpha(1.0f);
                        this.X.setVisibility(0);
                        this.n0.setAlpha(0.0f);
                        this.i2.start();
                        this.O1 = false;
                        try {
                            this.X.performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                    }
                    this.X.setScaleX(this.a2);
                    this.X.setScaleY(this.a2);
                    c4();
                    ValueAnimator valueAnimator = this.i2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        Q4();
                        this.f.setTranslationY(this.d2);
                        this.r.setTranslationX(l4(this.e2, this.u6));
                        this.r.setTranslationY(m4(this.f2));
                        p5();
                    }
                } else {
                    if (!this.o2) {
                        if (this.S0 != null) {
                            if (t4()) {
                                this.S0.t(21);
                            } else {
                                this.S0.S(21);
                            }
                            if (this.q0 != null) {
                                this.S0.S(36);
                                this.S0.S(34);
                                this.S0.S(35);
                                this.S0.t(33);
                                this.S0.t(31);
                            }
                        }
                        org.telegram.ui.ActionBar.p5 p5Var3 = this.T0;
                        if (p5Var3 != null) {
                            p5Var3.setEnabled(false);
                        }
                        this.o2 = true;
                        org.telegram.messenger.zs.e().k(i10, Boolean.TRUE);
                        this.M.f(true, min);
                        this.o0.b(min);
                        this.n0.setCreateThumbFromParent(true);
                        this.n0.getAdapter().g();
                        this.i2.cancel();
                        float U12 = org.telegram.messenger.i0.U1(this.k2, fArr);
                        fArr[0] = U12;
                        fArr[1] = 1.0f;
                        mw0 mw0Var2 = this.u0;
                        if (mw0Var2 == null || mw0Var2.x.isEmpty()) {
                            this.i2.setInterpolator(org.telegram.ui.Components.gr.j);
                            this.i2.setDuration((long) (((1.0f - U12) * 250.0f) / min));
                        } else {
                            this.i2.setInterpolator(new u1.a());
                            this.i2.setDuration((long) ((((1.0f - U12) * 1.3f) * 250.0f) / min));
                        }
                        this.i2.addListener(new nw0(this, 4));
                        View m10 = this.c.m(0);
                        if (!this.O1 && m10 != null) {
                            this.N1 = true;
                            this.a.x0(((m10.getTop() - this.a.getMeasuredWidth()) - d4()) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0), (int) this.i2.getDuration(), (Interpolator) this.i2.getInterpolator());
                            this.a.O0 = false;
                        }
                        this.Z5 = this.f.getTranslationY();
                        this.a6 = this.r.getTranslationY();
                        this.i2.start();
                        this.n0.setAlpha(0.0f);
                        this.n0.setVisibility(0);
                        try {
                            this.X.performHapticFeedback(0, 1);
                        } catch (Exception unused2) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.n0.getLayoutParams();
                    int i11 = layoutParams2.height;
                    layoutParams2.width = this.a.getMeasuredWidth();
                    float f15 = currentActionBarHeight + f13;
                    int i12 = (int) f15;
                    layoutParams2.height = i12;
                    if (i11 != i12) {
                        this.n0.requestLayout();
                    }
                    if (!this.i2.isRunning()) {
                        float L = (this.F1 && this.I1 == 2) ? (-(1.0f - this.R1)) * org.telegram.messenger.i0.L(50.0f) : 0.0f;
                        this.f.setTranslationX(org.telegram.messenger.i0.N(18.0f) - this.f.getLeft());
                        this.f.setTranslationY((((f15 - d4()) - org.telegram.messenger.i0.N(30.0f)) - this.f.getBottom()) + L);
                        this.r.setTranslationX(l4(org.telegram.messenger.i0.N(16.0f) - this.r.getLeft(), 0.0f));
                        this.r.setTranslationY(m4((((f15 - d4()) - org.telegram.messenger.i0.N(10.0f)) - this.r.getBottom()) + L));
                        p5();
                    }
                }
            } else {
                f7 = 2.0f;
                f10 = 18.0f;
            }
            boolean z12 = this.F1;
            if (z12 && this.I1 == 2) {
                float f16 = this.d6;
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / f7) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0)) - (org.telegram.messenger.i0.p * 21.0f));
                this.f.setPivotY(r6.getMeasuredHeight());
                this.f.setScaleX(1.38f);
                this.f.setScaleY(1.38f);
                this.a2 = org.telegram.messenger.i0.W1(this.R1, 42, org.telegram.messenger.zs.U1) / 100.0f;
                this.b2 = 0.0f;
                mw0 mw0Var3 = this.u0;
                if (mw0Var3 != null) {
                    mw0Var3.setExpandProgress(1.0f);
                }
                rh.g0 g0Var2 = this.v0;
                if (g0Var2 != null) {
                    g0Var2.setExpandProgress(1.0f);
                }
                this.e0.setRoundRadiusForExpand((int) org.telegram.messenger.i0.T1(p4(), 0.0f, this.R1));
                this.X.setTranslationX(org.telegram.messenger.i0.T1(f16, 0.0f, this.R1));
                this.X.setTranslationY(org.telegram.messenger.i0.T1((float) Math.ceil(translationY2), 0.0f, this.R1));
                float measuredWidth = ((this.a2 * 100.0f) / 42.0f) * (this.X.getMeasuredWidth() - org.telegram.messenger.i0.L(42.0f));
                this.h0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(16.0f) + measuredWidth);
                this.h0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(-10.0f) + measuredWidth);
                this.i0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + measuredWidth);
                this.i0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(26.5f) + measuredWidth);
                this.j0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + measuredWidth);
                this.j0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + measuredWidth);
                this.k0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + measuredWidth);
                this.k0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + measuredWidth);
                this.X.setScaleX(this.a2);
                this.X.setScaleY(this.a2);
                this.n0.setAlpha(0.0f);
                this.n0.setVisibility(0);
                jw0 jw0Var2 = this.e0;
                float f17 = this.R1;
                float f18 = this.a2;
                jw0Var2.H = f17;
                jw0Var2.I = f18;
                jw0Var2.G = true;
                this.M.e(false, f17);
                this.actionBar.D(i0.b.f(this.R1, this.f6 != null ? -1 : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v8, this.z0), -1), false);
                org.telegram.ui.Components.kl0 kl0Var = this.K;
                if (kl0Var != null) {
                    kl0Var.b(i0.b.f(this.R1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h8, this.z0), Color.argb(org.telegram.messenger.zs.J2, org.telegram.messenger.zs.e4, org.telegram.messenger.zs.e4, org.telegram.messenger.zs.e4)));
                }
                Drawable drawable = this.x;
                if (drawable != null) {
                    drawable.setColorFilter(this.f6 == null ? i0.b.f(this.R1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.dd, this.z0), -1) : -1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.fr frVar = this.I;
                if (frVar != null) {
                    frVar.a(this.R1);
                    this.f.invalidate();
                }
                org.telegram.ui.Components.fr frVar2 = this.J;
                if (frVar2 != null) {
                    frVar2.a(this.R1);
                    this.f.invalidate();
                }
                s5(this.R1);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.X.getLayoutParams();
                layoutParams3.width = (int) org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(100.0f), this.a.getMeasuredWidth() / this.a2, this.R1);
                layoutParams3.height = (int) org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(100.0f), (this.P1 + currentActionBarHeight) / this.a2, this.R1);
                this.X.requestLayout();
                p5();
            } else if (f13 <= f14) {
                if (z12) {
                    this.a2 = org.telegram.messenger.i0.W1(K3, 42, 96) / 100.0f;
                    this.b2 = 0.0f;
                    f11 = 1.0f;
                } else {
                    org.telegram.ui.Components.yg0 yg0Var2 = this.t0;
                    this.a2 = org.telegram.messenger.i0.T1(yg0Var2 != null ? yg0Var2.getHiddenAvatarSizeDp() : 24.0f, 96.0f, K3) / 100.0f;
                    f11 = 1.0f;
                    this.b2 = 1.0f - K3;
                }
                org.telegram.ui.Components.hg0 hg0Var = this.Z;
                if (hg0Var != null) {
                    if (this.F1) {
                        hg0Var.setAlpha(this.R1);
                    } else {
                        hg0Var.setAlpha(f11);
                    }
                }
                mw0 mw0Var4 = this.u0;
                if (mw0Var4 != null) {
                    mw0Var4.invalidate();
                }
                rh.g0 g0Var3 = this.v0;
                if (g0Var3 != null) {
                    g0Var3.h = this.F1;
                    float l4 = Utilities.l((K3 - 0.3f) / 0.7f);
                    if (g0Var3.f != l4) {
                        g0Var3.f = l4;
                        g0Var3.invalidate();
                    }
                }
                float f19 = (0.12f * K3) + 1.0f;
                ValueAnimator valueAnimator2 = this.i2;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    this.X.setScaleX(this.a2);
                    this.X.setScaleY(this.a2);
                    c4();
                    this.X.setTranslationY((float) Math.ceil(this.Z1));
                    float L2 = (((this.a2 * 100.0f) / 42.0f) * org.telegram.messenger.i0.L(42.0f)) - org.telegram.messenger.i0.L(42.0f);
                    this.h0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(16.0f) + L2);
                    this.h0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(-10.0f) + L2);
                    this.i0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L2);
                    this.i0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(26.5f) + L2);
                    this.j0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L2);
                    this.j0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + L2);
                    this.k0.setTranslationX(this.X.getX() + org.telegram.messenger.i0.L(28.0f) + L2);
                    this.k0.setTranslationY(this.X.getY() + org.telegram.messenger.i0.L(24.0f) + L2);
                } else {
                    ValueAnimator valueAnimator3 = this.i2;
                    nw0 nw0Var = this.X5;
                    valueAnimator3.removeListener(nw0Var);
                    this.i2.addListener(nw0Var);
                }
                float N = ((org.telegram.messenger.i0.N(8.0f) + (this.X.getScaleY() * this.X.getHeight())) * (this.F1 ? this.R1 : K3)) + ((float) Math.floor(translationY));
                this.d2 = c3.i0.z(1.0f, this.R1, 0.0f, (org.telegram.messenger.i0.L(7.0f) * K3) + org.telegram.messenger.i0.L(1.3f) + N);
                this.f2 = (((float) Math.floor(org.telegram.messenger.i0.p * 11.0f)) * K3) + N + org.telegram.messenger.i0.L(24.0f);
                float L3 = this.F1 ? (this.d6 - org.telegram.messenger.i0.L(109.0f)) + org.telegram.messenger.i0.L(48.0f) : -org.telegram.messenger.i0.N(46.0f);
                iy0 iy0Var = this.x6;
                if (iy0Var != null) {
                    iy0Var.setAlpha((int) (255.0f * K3));
                }
                int measuredWidth2 = this.a.getMeasuredWidth();
                this.f.setScaleX(f19);
                this.f.setScaleY(f19);
                y4(0, K3, false);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                float f20 = measuredWidth2 / f7;
                float min2 = f20 - (((Math.min(this.f.getExactWidth(), layoutParams4.width) * f19) * 0.5f) + layoutParams4.leftMargin);
                float f21 = ((FrameLayout.LayoutParams) this.r.getLayoutParams()).width;
                float paddingLeft = (this.p5 || this.r.getExactWidth() > (f21 - ((float) this.r.getPaddingLeft())) - ((float) this.r.getPaddingRight())) ? 0.0f : this.r.getPaddingLeft();
                float min3 = f20 - ((Math.min(this.r.getExactWidth(), f21) * 0.5f) + (r7.leftMargin + paddingLeft));
                this.c2 = min2;
                this.e2 = min3;
                this.u6 = paddingLeft;
                if (this.F1) {
                    min2 = org.telegram.messenger.i0.T1(L3, min2, K3);
                    min3 = org.telegram.messenger.i0.T1(L3, min3, K3);
                }
                ValueAnimator valueAnimator4 = this.i2;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    this.f.setTranslationX(min2);
                    this.f.setTranslationY(this.d2);
                    this.r.setTranslationX(l4(min3, this.u6 * K3));
                    this.r.setTranslationY(m4(this.f2));
                }
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i13 = layoutParams5.width;
                int min4 = Math.min(layoutParams5.width, (int) ((((org.telegram.messenger.i0.Q1() ? org.telegram.messenger.i0.L(490.0f) : org.telegram.messenger.i0.q.x) - org.telegram.messenger.i0.L(f10)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams5.leftMargin)));
                layoutParams5.width = min4;
                if (min4 != i13) {
                    this.f.requestLayout();
                }
                p5();
            }
            ValueAnimator valueAnimator5 = this.i2;
            if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                y4(0, K3, true);
            }
        }
        v5(currentActionBarHeight);
        if (K3 >= 1.0f) {
            this.e0.setAlpha(1.0f);
        }
    }

    public final void x5() {
        ix0 ix0Var = this.N;
        if (ix0Var == null || this.U5 == 0) {
            return;
        }
        int topPanelShift = ix0Var.getTopPanelShift();
        int i10 = 0;
        if (topPanelShift > 0 && this.N.isAttachedToWindow()) {
            if (this.N.getParent() == this.a) {
                topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.N.getY()));
            }
            i10 = topPanelShift;
        }
        int i11 = this.U5 + i10;
        b5(i11, this.B5);
        b5(i11, this.S5);
    }

    @Override // org.telegram.ui.ux
    public final boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        long j10 = ((org.telegram.messenger.gs) arrayList.get(0)).a;
        Bundle g10 = a1.g.g("scrollToTopOnResume", true);
        if (org.telegram.messenger.o5.C(j10)) {
            g10.putInt("enc_id", (int) (4294967295L & j10));
        } else if (org.telegram.messenger.o5.E(j10)) {
            g10.putLong("user_id", j10);
        } else if (org.telegram.messenger.o5.z(j10)) {
            g10.putLong("chat_id", -j10);
        }
        if (!getMessagesController().E(g10, ayVar, null, null)) {
            return false;
        }
        org.telegram.messenger.zs notificationCenter = getNotificationCenter();
        int i12 = org.telegram.messenger.zs.t;
        notificationCenter.n(this, i12);
        getNotificationCenter().k(i12, new Object[0]);
        presentFragment(new un(g10), true);
        removeSelfFromStack();
        getSendMessagesHelper().r0(org.telegram.messenger.oz.g(getMessagesController().Z1(Long.valueOf(this.d1)), j10, null, null, null, null, z11, i10, i11));
        if (!TextUtils.isEmpty(charSequence)) {
            org.telegram.messenger.qz.a0(org.telegram.messenger.c.a(this.currentAccount), charSequence, j10, 0L, z11, i10, i11);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y4(int i10, float f7, boolean z10) {
        float scaleX;
        float f10;
        int i11;
        int ceil;
        ValueAnimator valueAnimator;
        if (this.P1 > i4() || ((valueAnimator = this.i2) != null && valueAnimator.isRunning())) {
            scaleX = this.f.getScaleX();
        } else {
            if (f7 < 1.0f) {
                f10 = 1.12f;
                scaleX = 1.0f;
                int L = !org.telegram.messenger.i0.Q1() ? org.telegram.messenger.i0.L(490.0f) : org.telegram.messenger.i0.q.x;
                org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
                int max = L - (((int) Math.max(org.telegram.messenger.i0.L(64.0f), (i5Var == null ? i5Var.o().getTargetPillWidth() : org.telegram.messenger.i0.L(46.0f)) + org.telegram.messenger.i0.L(18.0f))) * 2);
                int i12 = (int) (max / (i10 == 0 ? scaleX : 1.0f));
                int A = i10 == 0 ? i10 : org.telegram.messenger.z20.A(18.0f, 2, L);
                if (i10 == 0) {
                    i10 = (int) (A / f10);
                }
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.i;
                int W1 = org.telegram.messenger.i0.W1(grVar.getInterpolation(f7), i12, i10);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i13 = layoutParams.width;
                layoutParams.width = (int) Math.ceil(W1);
                if (z10) {
                    layoutParams.width = Math.min(layoutParams.width, (int) (((L - org.telegram.messenger.i0.L(18.0f)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams.leftMargin)));
                }
                if (z10 && layoutParams.width != i13) {
                    this.f.requestLayout();
                }
                int W12 = org.telegram.messenger.i0.W1(grVar.getInterpolation(f7), max, A);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.r.getLayoutParams();
                i11 = layoutParams2.width;
                ceil = (int) Math.ceil(W12);
                layoutParams2.width = ceil;
                if (i11 == ceil) {
                    this.r.requestLayout();
                    return;
                }
                return;
            }
            scaleX = Math.max(this.f.getScaleX(), 1.12f);
        }
        f10 = scaleX;
        if (!org.telegram.messenger.i0.Q1()) {
        }
        org.telegram.ui.ActionBar.i5 i5Var2 = this.simpleActionBar;
        int max2 = L - (((int) Math.max(org.telegram.messenger.i0.L(64.0f), (i5Var2 == null ? i5Var2.o().getTargetPillWidth() : org.telegram.messenger.i0.L(46.0f)) + org.telegram.messenger.i0.L(18.0f))) * 2);
        int i122 = (int) (max2 / (i10 == 0 ? scaleX : 1.0f));
        if (i10 == 0) {
        }
        if (i10 == 0) {
        }
        org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.i;
        int W13 = org.telegram.messenger.i0.W1(grVar2.getInterpolation(f7), i122, i10);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        int i132 = layoutParams3.width;
        layoutParams3.width = (int) Math.ceil(W13);
        if (z10) {
        }
        if (z10) {
            this.f.requestLayout();
        }
        int W122 = org.telegram.messenger.i0.W1(grVar2.getInterpolation(f7), max2, A);
        FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) this.r.getLayoutParams();
        i11 = layoutParams22.width;
        ceil = (int) Math.ceil(W122);
        layoutParams22.width = ceil;
        if (i11 == ceil) {
        }
    }

    public final void y5() {
        if (this.B5 == null || this.S5 == null) {
            return;
        }
        ix0 ix0Var = this.N;
        boolean z10 = ix0Var != null && ix0Var.getParent() == this.a && this.N.isAttachedToWindow();
        float max = Math.max(this.A5, this.P5);
        this.B5.setAlpha(z10 ? 0.0f : max);
        this.B5.setVisibility((z10 || max <= 0.0f) ? 8 : 0);
        View view = this.S5;
        if (!z10) {
            max = 0.0f;
        }
        view.setAlpha(max);
        if (z10) {
            this.S5.setTranslationY(-(this.N.getY() + this.a.getY()));
        }
    }

    public final void z5() {
        if (this.simpleActionBar == null || this.G5 == null) {
            return;
        }
        org.telegram.ui.Components.kg0 kg0Var = this.I5;
        if (kg0Var != null) {
            float k42 = k4();
            if (kg0Var.l != k42) {
                kg0Var.l = k42;
                kg0Var.a();
            }
        }
        int f7 = i0.b.f(k4(), this.C5, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.z0));
        if (this.F5 != f7) {
            this.F5 = f7;
            org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
            i5Var.l0 = true;
            i5Var.f0 = f7;
            i5Var.updateColors();
        }
        int n02 = this.H5.n0();
        if (this.K5 != n02) {
            this.K5 = n02;
            org.telegram.ui.ActionBar.i5 i5Var2 = this.simpleActionBar;
            vg.f fVar = i5Var2.H;
            if (fVar != null) {
                fVar.updateColors();
                i5Var2.I.updateColors();
                i5Var2.J.updateColors();
            }
            i5Var2.invalidate();
            org.telegram.ui.ActionBar.s5 s5Var = i5Var2.Q;
            if (s5Var != null) {
                s5Var.invalidate();
            }
        }
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.rt0 rt0Var) {
        super(bundle);
        this.h = null;
        this.n = null;
        this.w0 = null;
        int i10 = 2;
        this.x0 = new org.telegram.ui.Components.l40(this, i10);
        this.y0 = new Paint(1);
        this.J0 = new boolean[1];
        this.a1 = 1.0f;
        this.B1 = new a0.h();
        this.L1 = true;
        this.M1 = false;
        this.N1 = false;
        this.O1 = false;
        this.X1 = new HashMap();
        this.l2 = new float[]{0.0f, 1.0f};
        this.p2 = new Paint();
        this.A2 = -1;
        this.K2 = new Rect();
        this.Q4 = new ArrayList();
        this.R4 = new ArrayList();
        this.S4 = 0;
        this.T4 = true;
        this.U4 = true;
        this.X4 = 0;
        this.Y4 = 0;
        this.Z4 = 0;
        this.a5 = 0L;
        this.h5 = new HashSet();
        this.j5 = new pw0(this, 0);
        this.k5 = new vw0(this);
        this.H5 = new aw0(this);
        this.L5 = new fe.b(0, new bv0(this, 7), org.telegram.ui.Components.gr.h, 380L, true);
        this.R5 = new pw0(this, 1);
        this.X5 = new nw0(this, i10);
        this.Y5 = null;
        this.g6 = new SparseIntArray();
        this.i6 = null;
        this.j6 = -1;
        this.o6 = new int[3];
        this.p6 = -1.0f;
        hi.b bVar = new hi.b();
        this.I6 = bVar;
        tg.b bVar2 = new tg.b(bVar);
        this.J6 = bVar2;
        this.L6 = new Paint();
        this.Q6 = new int[7];
        this.Q = rt0Var;
        bVar2.e = new je.b();
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ void T() {
    }
}
