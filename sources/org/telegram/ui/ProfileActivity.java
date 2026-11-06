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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class ProfileActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, qw, org.telegram.ui.Components.qs0, org.telegram.ui.Components.i30, org.telegram.ui.Components.mr0, ie0 {
    public static final RectF S6 = new RectF();
    public static final int T6 = org.telegram.messenger.g0.L(16.0f);
    public int A0;
    public boolean A1;
    public int A2;
    public int A3;
    public int A4;
    public float A5;
    public fi.m3 A6;
    public org.telegram.messenger.hc B0;
    public a0.h B1;
    public ArrayList B2;
    public int B3;
    public int B4;
    public View B5;
    public int B6;
    public int C0;
    public boolean C1;
    public TLRPC.EncryptedChat C2;
    public int C3;
    public int C4;
    public int C5;
    public Boolean C6;
    public Drawable D;
    public int D0;
    public long D1;
    public TLRPC.Chat D2;
    public int D3;
    public int D4;
    public int D5;
    public TLRPC.TL_emojiStatusCollectible D6;
    public Long E;
    public int E0;
    public float E1;
    public TL_bots.BotInfo E2;
    public int E3;
    public int E4;
    public int E5;
    public int E6;
    public org.telegram.ui.Components.g5 F;
    public boolean F0;
    public boolean F1;
    public TLRPC.ChannelParticipant F2;
    public int F3;
    public int F4;
    public int F5;
    public boolean F6;
    public org.telegram.ui.Components.g5 G;
    public boolean G0;
    public boolean G1;
    public TL_account.TL_password G2;
    public int G3;
    public int G4;
    public gh.e G5;
    public int G6;
    public Drawable H;
    public boolean H0;
    public boolean H1;
    public TLRPC.FileLocation H2;
    public int H3;
    public boolean H4;
    public final pu0 H5;
    public int H6;
    public org.telegram.ui.Components.wq I;
    public boolean I0;
    public int I1;
    public TLRPC.FileLocation I2;
    public int I3;
    public boolean I4;
    public org.telegram.ui.Components.if0 I5;
    public int I6;
    public org.telegram.ui.Components.wq J;
    public final boolean[] J0;
    public boolean J1;
    public org.telegram.messenger.hc J2;
    public int J3;
    public int J4;
    public float J5;
    public final ri.b J6;
    public org.telegram.ui.Components.gk0 K;
    public boolean K0;
    public boolean K1;
    public final Rect K2;
    public int K3;
    public int K4;
    public int K5;
    public final dh.c K6;
    public UndoView L;
    public boolean L0;
    public boolean L1;
    public org.telegram.ui.Cells.m8 L2;
    public int L3;
    public int L4;
    public float L5;
    public bi.g L6;
    public kw0 M;
    public boolean M0;
    public boolean M1;
    public int M2;
    public int M3;
    public int M4;
    public final te.a M5;
    public final Paint M6;
    public vv0 N;
    public boolean N0;
    public boolean N1;
    public int N2;
    public int N3;
    public boolean N4;
    public hv0 N5;
    public Drawable N6;
    public org.telegram.ui.Components.av0 O;
    public ImageView O0;
    public boolean O1;
    public int O2;
    public int O3;
    public boolean O4;
    public AnimatorSet O5;
    public Drawable O6;
    public boolean P;
    public org.telegram.ui.ActionBar.f5 P0;
    public float P1;
    public int P2;
    public int P3;
    public int P4;
    public AnimatorSet P5;
    public Drawable P6;
    public org.telegram.ui.Components.ps0 Q;
    public org.telegram.ui.ActionBar.f5 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public final ArrayList Q4;
    public float Q5;
    public org.telegram.ui.Components.wp Q6;
    public boolean R;
    public org.telegram.ui.ActionBar.f5 R0;
    public float R1;
    public int R2;
    public int R3;
    public final ArrayList R4;
    public boolean R5;
    public final int[] R6;
    public org.telegram.ui.Components.lu0 S;
    public org.telegram.ui.ActionBar.f5 S0;
    public int S1;
    public int S2;
    public int S3;
    public int S4;
    public final fv0 S5;
    public l00 T;
    public org.telegram.ui.ActionBar.f5 T0;
    public float T1;
    public int T2;
    public int T3;
    public boolean T4;
    public View T5;
    public org.telegram.ui.Components.zg0 U;
    public org.telegram.ui.ActionBar.z0 U0;
    public ValueAnimator U1;
    public int U2;
    public int U3;
    public boolean U4;
    public int U5;
    public org.telegram.ui.Components.zg0 V;
    public org.telegram.ui.ActionBar.z0 V0;
    public boolean V1;
    public int V2;
    public int V3;
    public ev0 V4;
    public int V5;
    public fi.m3 W;
    public org.telegram.ui.ActionBar.z0 W0;
    public org.telegram.messenger.n6 W1;
    public int W2;
    public int W3;
    public View W4;
    public CharSequence W5;
    public k0 X;
    public ImageView X0;
    public final HashMap X1;
    public int X2;
    public int X3;
    public int X4;
    public boolean X5;
    public bi.x5 Y;
    public org.telegram.ui.ActionBar.z0 Y0;
    public float Y1;
    public int Y2;
    public int Y3;
    public int Y4;
    public final dv0 Y5;
    public org.telegram.ui.Components.ef0 Z;
    public org.telegram.messenger.re Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public int Z4;
    public float[] Z5;
    public qu0 a;
    public org.telegram.messenger.kp a0;
    public float a1;
    public float a2;
    public int a3;
    public int a4;
    public long a5;
    public float a6;
    public org.telegram.ui.Components.pj0 b;
    public org.telegram.ui.Components.zf0 b0;
    public int b1;
    public float b2;
    public int b3;
    public int b4;
    public boolean b5;
    public float b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public tu0 c;
    public org.telegram.ui.Components.ff0 c0;
    public ww0 c1;
    public float c2;
    public int c3;
    public int c4;
    public boolean c5;
    public boolean c6;
    public jw0 d;
    public org.telegram.ui.Cells.o d0;
    public long d1;
    public float d2;
    public int d3;
    public int d4;
    public String d5;
    public ew0 d6;
    public tw0 e;
    public zu0 e0;
    public long e1;
    public float e2;
    public int e3;
    public int e4;
    public String e5;
    public float e6;
    public ok f;
    public AnimatorSet f0;
    public long f1;
    public float f2;
    public int f3;
    public int f4;
    public String f5;
    public float f6;
    public org.telegram.ui.Cells.b4 g0;
    public boolean g1;
    public float g2;
    public int g3;
    public int g4;
    public org.telegram.ui.Components.kg g5;
    public org.telegram.messenger.fp g6;
    public String h;
    public ImageView h0;
    public long h1;
    public float h2;
    public int h3;
    public int h4;
    public final HashSet h5;
    public final SparseIntArray h6;
    public ImageView i0;
    public boolean i1;
    public ValueAnimator i2;
    public int i3;
    public int i4;
    public CharacterStyle i5;
    public int i6;
    public ImageView j0;
    public boolean j1;
    public float j2;
    public int j3;
    public int j4;
    public final fv0 j5;
    public AnimatorSet j6;
    public ImageView k0;
    public boolean k1;
    public float k2;
    public int k3;
    public int k4;
    public final lv0 k5;
    public int k6;
    public org.telegram.ui.Components.a01 l0;
    public long l1;
    public final float[] l2;
    public int l3;
    public int l4;
    public boolean l5;
    public int l6;
    public org.telegram.ui.Components.kf0 m0;
    public boolean m1;
    public boolean m2;
    public int m3;
    public int m4;
    public tv0 m5;
    public boolean m6;
    public String n;
    public av0 n0;
    public boolean n1;
    public boolean n2;
    public int n3;
    public int n4;
    public float n5;
    public boolean n6;
    public mw0 o0;
    public boolean o1;
    public boolean o2;
    public int o3;
    public int o4;
    public float o5;
    public org.telegram.ui.Components.ch0 o6;
    public org.telegram.ui.Components.w8 p0;
    public boolean p1;
    public final Paint p2;
    public int p3;
    public int p4;
    public boolean p5;
    public final int[] p6;
    public org.telegram.ui.Components.j30 q0;
    public boolean q1;
    public boolean q2;
    public int q3;
    public int q4;
    public boolean q5;
    public float q6;
    public bv0 r;
    public int r0;
    public boolean r1;
    public hi.r0 r2;
    public int r3;
    public int r4;
    public ImageReceiver r5;
    public CharSequence r6;
    public org.telegram.ui.Components.ch0 s;
    public org.telegram.ui.Components.a01 s0;
    public boolean s1;
    public hi.p s2;
    public int s3;
    public int s4;
    public FrameLayout s5;
    public CharSequence s6;
    public org.telegram.ui.Components.wf0 t0;
    public int t1;
    public TLRPC.ChatFull t2;
    public int t3;
    public int t4;
    public FrameLayout[] t5;
    public boolean t6;
    public cv0 u0;
    public boolean u1;
    public TLRPC.UserFull u2;
    public int u3;
    public int u4;
    public SpannableStringBuilder u5;
    public float u6;
    public bi.g1 v0;
    public boolean v1;
    public org.telegram.ui.Cells.e6 v2;
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
    public fi.d[] w5;
    public float w6;
    public Drawable x;
    public final org.telegram.ui.Components.t30 x0;
    public int x1;
    public xw0 x2;
    public int x3;
    public int x4;
    public org.telegram.messenger.video.n x5;
    public float x6;
    public Drawable y;
    public final Paint y0;
    public boolean y1;
    public CharSequence y2;
    public int y3;
    public int y4;
    public FrameLayout y5;
    public uw0 y6;
    public org.telegram.ui.ActionBar.f6 z0;
    public boolean z1;
    public long z2;
    public int z3;
    public int z4;
    public fi.d z5;
    public ax0 z6;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static ProfileActivity A4(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void G3(ProfileActivity profileActivity, boolean z9) {
        Drawable t6 = profileActivity.e0.getImageReceiver().t();
        String str = null;
        if (t6 instanceof org.telegram.ui.Components.d51) {
            profileActivity.e0.w(null, null, t6);
            return;
        }
        if (t6 instanceof org.telegram.ui.Components.v5) {
            org.telegram.ui.Components.v5 v5Var = (org.telegram.ui.Components.v5) t6;
            profileActivity.e0.w(null, null, v5Var);
            if (z9) {
                v5Var.f(profileActivity.e0);
                return;
            }
            return;
        }
        org.telegram.messenger.hc D = profileActivity.n0.D(0);
        if (D != null && D.p == 2) {
            str = "avatar";
        }
        profileActivity.e0.w(D, str, t6);
    }

    public static int J0(ProfileActivity profileActivity) {
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((kVar == null || !kVar.getOccupyStatusBar()) ? 0 : org.telegram.messenger.g0.m);
    }

    public static void N3(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view == null || view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return;
        }
        RectF rectF2 = S6;
        if (jh.k.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
            ih.d.b(new oa(view, 3), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
        }
    }

    public static void O0(ProfileActivity profileActivity, int i7) {
        boolean I0 = org.telegram.ui.Components.xs0.I0(profileActivity.N.getClosestTab());
        if (i7 == profileActivity.E6 && I0 == profileActivity.F6) {
            return;
        }
        profileActivity.E6 = i7;
        profileActivity.F6 = I0;
        if (I0) {
            if (i7 > 0) {
                profileActivity.w5[0].i(org.telegram.messenger.hd.G(i7, "HideStoriesFromAlbum", new Object[0]), true, true);
                return;
            } else {
                profileActivity.w5[0].i(profileActivity.v5, true, true);
                return;
            }
        }
        if (i7 > 0 || !org.telegram.messenger.qp.s1(profileActivity.currentAccount).W4()) {
            profileActivity.w5[0].i(org.telegram.messenger.hd.G(i7, "ArchiveStories", new Object[0]), true, true);
        } else {
            profileActivity.w5[0].i(profileActivity.u5, true, true);
        }
    }

    public static ValueAnimator P0(final ProfileActivity profileActivity, final boolean z9) {
        if (z9) {
            org.telegram.messenger.g0.a3(profileActivity.getParentActivity(), profileActivity.classGuid);
            org.telegram.messenger.g0.l3(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.U1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.U1.cancel();
        }
        bi.g1 g1Var = profileActivity.v0;
        if (g1Var != null) {
            g1Var.setActive(!z9);
        }
        int i7 = 0;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(profileActivity.T1, z9 ? 0.0f : 1.0f);
        final float f10 = profileActivity.P1;
        profileActivity.b.setTranslationY(f10);
        profileActivity.b.setVisibility(0);
        profileActivity.T0.setVisibility(0);
        profileActivity.a.setVisibility(0);
        profileActivity.y4(true);
        profileActivity.X.setVisibility(0);
        profileActivity.f.setVisibility(0);
        profileActivity.r.setVisibility(0);
        profileActivity.actionBar.y(profileActivity.T1 > 0.5f);
        int i10 = profileActivity.T1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.f5 f5Var = profileActivity.S0;
        if (f5Var != null) {
            f5Var.setVisibility(i10);
        }
        profileActivity.T0.setVisibility(i10);
        profileActivity.T0.getSearchContainer().setVisibility(profileActivity.T1 <= 0.5f ? 0 : 8);
        profileActivity.b.setEmptyView(profileActivity.O);
        profileActivity.X.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.nu0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.r0(ProfileActivity.this, ofFloat, f10, z9);
            }
        });
        ofFloat.addListener(new nv0(profileActivity, z9, i7));
        if (!z9) {
            profileActivity.U4 = true;
            profileActivity.T4();
            org.telegram.messenger.g0.Z2(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.O.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.f);
        profileActivity.U1 = ofFloat;
        return ofFloat;
    }

    public static void R0(ProfileActivity profileActivity, View view, float f10) {
        if (profileActivity.n2) {
            if (profileActivity.o2) {
                profileActivity.a.w0(0, ((view.getTop() - profileActivity.a.getMeasuredWidth()) - profileActivity.e4()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (profileActivity.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0), org.telegram.ui.Components.xq.h);
                return;
            } else {
                profileActivity.a.w0(0, view.getTop() - profileActivity.j4(), org.telegram.ui.Components.xq.h);
                return;
            }
        }
        boolean z9 = profileActivity.e4() > 0;
        if (z9) {
            float f11 = profileActivity.P1;
            if (f11 > 0.0f && ((f11 < profileActivity.j4() * 0.6f || f10 < -1000.0f) && profileActivity.P1 > profileActivity.e4() * 0.6f)) {
                profileActivity.a.w0(0, (int) (profileActivity.P1 - profileActivity.e4()), org.telegram.ui.Components.xq.h);
                return;
            }
        }
        if (z9) {
            float f12 = profileActivity.P1;
            if (f12 > 0.0f && f12 < profileActivity.e4() * 0.6f) {
                profileActivity.a.w0(0, (int) profileActivity.P1, org.telegram.ui.Components.xq.h);
                return;
            }
        }
        if (!z9) {
            float f13 = profileActivity.P1;
            if (f13 > 0.0f && f10 < -1000.0f) {
                profileActivity.a.w0(0, (int) f13, org.telegram.ui.Components.xq.h);
                return;
            }
        }
        if (profileActivity.P1 > 0.0f) {
            profileActivity.a.w0(0, view.getTop() - profileActivity.j4(), org.telegram.ui.Components.xq.h);
        }
    }

    public static void V4(Activity activity, boolean z9) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, activity, null);
        u1Var.i0 = false;
        u1Var.show();
        Utilities.e.c(new g60(u1Var, z9, activity));
    }

    public static SpannableStringBuilder W3(String str, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        ov0 ov0Var = new ov0(9);
        ov0Var.w = str;
        if (ov0Var.c != null) {
            ov0Var.c = null;
            ov0Var.a();
        }
        ov0Var.f = w02;
        ov0Var.n = false;
        spannableStringBuilder.setSpan(ov0Var, 0, spannableStringBuilder.length(), 0);
        ez[] ezVarArr = (ez[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ez.class);
        if (ezVarArr != null) {
            for (ez ezVar : ezVarArr) {
                ezVar.getClass();
                ezVar.f = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
                ezVar.r = i7;
                ezVar.s = f6Var;
                ezVar.n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static void Y4(FrameLayout frameLayout, float f10) {
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(T6 * f10);
        frameLayout.setAlpha(1.0f - f10);
        frameLayout.setVisibility(f10 < 1.0f ? 0 : 4);
    }

    public static void Z(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z9, boolean z10) {
        org.telegram.ui.Components.ey0.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z9, z10, profileActivity.z0);
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document e10;
        org.telegram.ui.Components.cc h;
        if (profileActivity.I2 != null) {
            return;
        }
        if (!profileActivity.p1 || profileActivity.getMessagesController().D3()) {
            if (profileActivity.a4()) {
                return;
            }
            profileActivity.K4(false);
            return;
        }
        ArrayList l10 = profileActivity.getMessagesController().q7.l(profileActivity.e1);
        if (l10 != null) {
            TLRPC.TL_forumTopic tL_forumTopic = null;
            for (int i7 = 0; tL_forumTopic == null && i7 < l10.size(); i7++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l10.get(i7);
                if (tL_forumTopic2 != null && tL_forumTopic2.id == profileActivity.f1) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
            if (tL_forumTopic != null) {
                long j3 = tL_forumTopic.icon_emoji_id;
                if (j3 == 0 || (e10 = org.telegram.ui.Components.i5.e(profileActivity.currentAccount, j3)) == null || (h = org.telegram.ui.Components.hc.a0(profileActivity).h(e10, 1, new fu0(profileActivity, 2))) == null) {
                    return;
                }
                h.j();
            }
        }
    }

    public static void a1(ProfileActivity profileActivity, String str, StringBuilder sb2) {
        String[] supportedTypes;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < codecCount; i7++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i7);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i10].equals(str)) {
                            (codecInfoAt.isEncoder() ? arrayList2 : arrayList).add(Integer.valueOf(i7));
                        } else {
                            i10++;
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
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i11 > 0) {
                    sb2.append("\n");
                }
                MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList.get(i11)).intValue());
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
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (i12 > 0 || !arrayList.isEmpty()) {
                    sb2.append("\n");
                }
                MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i12)).intValue());
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

    public static void b0(ProfileActivity profileActivity, TLRPC.User user) {
        if (profileActivity.Y3 >= 0) {
            if (profileActivity.J4 == -1) {
                profileActivity.J5();
                profileActivity.d.f();
            } else {
                profileActivity.D5(false, false);
            }
        }
        if (profileActivity.J4 == -1) {
            if (profileActivity.m2 || org.telegram.messenger.g0.Q1()) {
                profileActivity.a.setPadding(0, profileActivity.j4(), 0, 0);
                profileActivity.i2.cancel();
                float[] fArr = profileActivity.l2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.X4(1.0f);
                profileActivity.P1 = profileActivity.j4();
            } else {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (profileActivity.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredWidth(), TLObject.FLAG_30);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    jw0 jw0Var = profileActivity.d;
                    if (i7 >= jw0Var.e.M2) {
                        break;
                    }
                    v4.d1 a10 = jw0Var.a(null, jw0Var.d(i7));
                    View view = a10.a;
                    profileActivity.d.t(a10, i7);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i10 += view.getMeasuredHeight();
                    i7++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.j4() + i10) + currentActionBarHeight));
                qu0 qu0Var = profileActivity.a;
                qu0Var.setPadding(0, qu0Var.getPaddingTop(), 0, max);
            }
        }
        profileActivity.L.m(profileActivity.h1, user, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c0(ProfileActivity profileActivity, int i7) {
        boolean z9;
        if (i7 < 0) {
            return;
        }
        Object valueOf = Integer.valueOf(profileActivity.S2);
        tw0 tw0Var = profileActivity.e;
        if (!tw0Var.x) {
            if (!tw0Var.w.isEmpty()) {
                i7--;
            }
            if (i7 < 0 || i7 >= profileActivity.e.w.size()) {
                int g10 = jg.g.g(1, i7, profileActivity.e.w);
                if (g10 >= 0 && g10 < profileActivity.e.d.size()) {
                    valueOf = profileActivity.e.d.get(g10);
                    z9 = false;
                    if (!(valueOf instanceof sw0)) {
                        sw0 sw0Var = (sw0) valueOf;
                        org.telegram.ui.ActionBar.q4 parentLayout = profileActivity.getParentLayout();
                        sw0Var.b.run();
                        org.telegram.messenger.g0.k3(parentLayout, sw0Var.c);
                    } else if (valueOf instanceof org.telegram.messenger.cp) {
                        org.telegram.messenger.qs.f(profileActivity.currentAccount).k(org.telegram.messenger.qs.c1, profileActivity.e.E, ((org.telegram.messenger.cp) valueOf).c);
                    }
                    if (z9 || valueOf == null) {
                    }
                    profileActivity.e.E(valueOf);
                    return;
                }
            } else {
                valueOf = profileActivity.e.w.get(i7);
            }
        } else if (i7 < tw0Var.r.size()) {
            valueOf = profileActivity.e.r.get(i7);
        } else {
            int g11 = jg.g.g(1, i7, profileActivity.e.r);
            if (g11 >= 0 && g11 < profileActivity.e.s.size()) {
                valueOf = profileActivity.e.s.get(g11);
            }
        }
        z9 = true;
        if (!(valueOf instanceof sw0)) {
        }
        if (z9) {
        }
    }

    public static void c5(int i7, View view) {
        if (view == null || view.getLayoutParams() == null || view.getLayoutParams().height == i7) {
            return;
        }
        view.getLayoutParams().height = i7;
        if (view.isLaidOut()) {
            view.setBottom(view.getTop() + i7);
        } else {
            view.requestLayout();
        }
    }

    public static void d0(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.k5 k5Var) {
        org.telegram.messenger.hc b10;
        String str;
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            vf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().U2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        ug.f1 f1Var = new ug.f1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.z0);
        k5Var.getLocationOnScreen(new int[2]);
        f1Var.n2 = k5Var.h0;
        f1Var.o2 = k5Var.i0;
        f1Var.r2 = k5Var.getScaleX();
        f1Var.p2 = k5Var.getLeft();
        f1Var.q2 = k5Var.getTop();
        f1Var.s2 = k5Var;
        Drawable rightDrawable = k5Var.getRightDrawable();
        org.telegram.ui.Components.g5 g5Var = profileActivity.F;
        if (rightDrawable == g5Var && g5Var != null) {
            Drawable drawable = g5Var.f[0];
            if (drawable instanceof org.telegram.ui.Components.i5) {
                f1Var.r2 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.i5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(profileActivity.getParentActivity());
                    org.telegram.messenger.rz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.hc.b(document);
                        if (d != null) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.ij.L2(document, false)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        b10 = org.telegram.messenger.hc.b(document);
                        str = "160_160";
                    }
                    String str2 = str;
                    org.telegram.messenger.hc hcVar = b10;
                    l9Var.setLayerNum(7);
                    l9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                    l9Var.m(hcVar, str2, org.telegram.messenger.hc.c(w10, document), "140_140", d, document);
                    if (((org.telegram.ui.Components.i5) profileActivity.F.f[0]).c()) {
                        l9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, profileActivity.z0), PorterDuff.Mode.SRC_IN));
                        f1Var.u2 = org.telegram.messenger.ij.j1(document);
                    } else {
                        f1Var.u2 = org.telegram.messenger.ij.j1(document);
                    }
                    f1Var.t2 = l9Var;
                    f1Var.w2 = true;
                }
            }
        }
        profileActivity.showDialog(f1Var);
    }

    public static void d1(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.b2, 0.25f) / 0.25f;
        if (profileActivity.p1) {
            profileActivity.t0.setAlpha(1.0f - min);
            profileActivity.t0.setBlurIntensity(0.0f);
            profileActivity.t0.setGooeyEnabled(false);
            profileActivity.t0.setVisibility(profileActivity.b2 >= 1.0f ? 8 : 0);
        } else {
            profileActivity.t0.setHideProgress(profileActivity.b2);
        }
        cv0 cv0Var = profileActivity.u0;
        if (cv0Var != null && profileActivity.I1 != 2) {
            float f10 = profileActivity.b2;
            cv0Var.setAlpha(f10 > 0.0f ? org.telegram.messenger.g0.T1(1.0f, 0.0f, org.telegram.messenger.g0.z1(f10, 0.0f, 0.5f)) : 1.0f);
        }
        profileActivity.x5();
    }

    public static void d5(org.telegram.ui.ActionBar.f5 f5Var, boolean z9, boolean z10) {
        if (com.google.android.recaptcha.internal.a.u(f5Var)) {
            f5Var.Y(z9, z10);
        } else if (f5Var != null) {
            f5Var.setVisibility(z9 ? 0 : 8);
        }
    }

    public static void e0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        if (tL_error == null) {
            TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.getUserConfig().e()));
            if (a22 == null) {
                a22 = profileActivity.getUserConfig().f();
                if (a22 == null) {
                    return;
                } else {
                    profileActivity.getMessagesController().X3(a22, false, false);
                }
            } else {
                profileActivity.getUserConfig().w(a22);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.qs.g2, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 800, false, null, false);
            TLRPC.VideoSize x10 = tL_photos_photo.photo.video_sizes.isEmpty() ? null : org.telegram.messenger.w7.x(1000, tL_photos_photo.photo.video_sizes);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            a22.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w10 != null) {
                tL_userProfilePhoto.photo_small = w10.location;
            }
            if (w11 != null) {
                tL_userProfilePhoto.photo_big = w11.location;
            }
            if (w10 != null && profileActivity.H2 != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                org.telegram.messenger.w7.J(profileActivity.H2, null, true, true).renameTo(J);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(profileActivity.H2.volume_id);
                sb2.append("_");
                String n10 = a8.p0.n(profileActivity.H2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.gc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.hc.m(profileActivity.currentAccount, 1, a22));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                new File(str).renameTo(org.telegram.messenger.w7.J(x10, "mp4", true, true));
            } else if (w11 != null && profileActivity.I2 != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                org.telegram.messenger.w7.J(profileActivity.I2, null, true, true).renameTo(J2);
            }
            profileActivity.getMessagesController().U0(a22.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a22);
            profileActivity.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull b22 = profileActivity.getMessagesController().b2(profileActivity.d1);
            if (b22 != null) {
                b22.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().j2(b22, false);
            }
        }
        profileActivity.n2 = (org.telegram.messenger.g0.Q1() || profileActivity.m2 || !profileActivity.e0.getImageReceiver().L() || org.telegram.messenger.g0.C1()) ? false : true;
        profileActivity.H2 = null;
        profileActivity.I2 = null;
        av0 av0Var = profileActivity.n0;
        av0Var.H0 = true;
        av0Var.K0 = profileActivity.J2;
        av0Var.q1 = null;
        av0Var.r1 = null;
        av0Var.setCreateThumbFromParent(false);
        profileActivity.I5(true);
        profileActivity.j5(false, true);
        profileActivity.getNotificationCenter().k(org.telegram.messenger.qs.r, Integer.valueOf(org.telegram.messenger.qp.C8));
        profileActivity.getNotificationCenter().k(org.telegram.messenger.qs.j0, new Object[0]);
        profileActivity.getUserConfig().v(true);
    }

    public static boolean f0(ProfileActivity profileActivity, boolean[] zArr, boolean z9, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_error tL_error) {
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.qp.s1(profileActivity.currentAccount).d7.edit().putLong("dialog_join_requested_time_" + profileActivity.h1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        boolean z10 = org.telegram.messenger.t3.T(profileActivity.D2) && !profileActivity.D2.megagroup;
        int i7 = org.telegram.ui.Components.b70.q1;
        org.telegram.ui.Components.b70.J0(parentActivity, profileActivity, org.telegram.ui.Components.hc.a0(profileActivity), z10);
        if (!z9 || profileActivity.L4 != -1) {
            profileActivity.J5();
            jw0 jw0Var = profileActivity.d;
            if (jw0Var != null) {
                jw0Var.f();
            }
        }
        if (f2Var instanceof an) {
            ((an) f2Var).Yb(false, true);
        }
        return false;
    }

    public static /* synthetic */ void g0(ProfileActivity profileActivity) {
        org.telegram.messenger.qp.s1(profileActivity.currentAccount).l0(null);
        profileActivity.U.M(0);
        profileActivity.V.M(0);
    }

    public static void h0(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.cc Q = org.telegram.ui.Components.hc.a0(profileActivity).Q(R.raw.contact_check, 36, org.telegram.messenger.hd.M0(2131746855, null));
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
            org.telegram.messenger.k5.o(null, 2131743880, org.telegram.ui.Components.hc.a0(profileActivity), R.raw.error, 36);
            return;
        }
        if (profileActivity.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.resourceProvider);
            String M0 = org.telegram.messenger.hd.M0(2131746851, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131746852, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
            profileActivity.showDialog(u1Var);
        }
    }

    public static /* synthetic */ void i0(ProfileActivity profileActivity, Context context, long j3, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            hi.q3.J0(context, profileActivity.currentAccount, profileActivity.u2.starref_program, profileActivity.getUserConfig().e(), profileActivity.z0, false);
        } else {
            hi.q3.K0(context, profileActivity.currentAccount, connectedbotstarref, j3, profileActivity.z0);
        }
    }

    public static /* synthetic */ void j0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.H2 = fileLocation;
            profileActivity.I2 = photoSize2.location;
            profileActivity.e0.j(org.telegram.messenger.hc.e(fileLocation), "50_50", profileActivity.p0, null);
            if (profileActivity.N2 != -1) {
                profileActivity.J5();
                jw0 jw0Var = profileActivity.d;
                if (jw0Var != null) {
                    jw0Var.f();
                }
                profileActivity.y4(true);
            }
            av0 av0Var = profileActivity.n0;
            org.telegram.messenger.hc e10 = org.telegram.messenger.hc.e(profileActivity.I2);
            profileActivity.J2 = e10;
            av0Var.A(e10, org.telegram.messenger.hc.e(profileActivity.H2));
            profileActivity.j5(true, false);
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
                int i7 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i7 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            profileActivity.i6 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new h50(22, profileActivity, str));
        }
        profileActivity.actionBar.q().requestLayout();
    }

    public static void k0(ProfileActivity profileActivity, Context context, long j3, View view, int i7, float f10, float f11) {
        TLRPC.User a22;
        jw0 jw0Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.a.C0();
        if (i7 == profileActivity.R3) {
            TLRPC.User a23 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.d1));
            TLRPC.UserFull userFull = profileActivity.u2;
            if (userFull != null && userFull.starref_program != null) {
                long e10 = profileActivity.getUserConfig().e();
                bi.n0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), e10, profileActivity.d1, new bi.b2(profileActivity, context, e10, 3));
                return;
            } else {
                if (a23 == null || !a23.bot_can_edit) {
                    return;
                }
                profileActivity.presentFragment(new hi.j(profileActivity.d1));
                return;
            }
        }
        int i10 = 1;
        if (i7 == profileActivity.P3) {
            boolean z9 = !profileActivity.getMessagesController().r2(j3, profileActivity.f1, null);
            profileActivity.getNotificationsController().G(j3, profileActivity.f1, z9);
            org.telegram.ui.Components.hc.A(profileActivity, z9, null).j();
            profileActivity.v5();
            int i11 = profileActivity.P3;
            if (i11 < 0 || (jw0Var = profileActivity.d) == null) {
                return;
            }
            jw0Var.g(i11);
            return;
        }
        if (i7 == profileActivity.Y3) {
            TLRPC.User a24 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.d1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", a24.id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.d5);
            bundle.putString("first_name_card", profileActivity.e5);
            bundle.putString("last_name_card", profileActivity.f5);
            nr nrVar = new nr(bundle, profileActivity.z0);
            nrVar.O = new xt0(profileActivity, a24);
            profileActivity.presentFragment(nrVar);
            return;
        }
        if (i7 == profileActivity.V3) {
            TextView textView = (TextView) org.telegram.ui.Components.v4.f0(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131751509, null), org.telegram.messenger.hd.M0(2131751593, null), org.telegram.messenger.hd.M0(2131751592, null), org.telegram.messenger.hd.M0(2131751599, null), new fu0(profileActivity, i10), profileActivity.z0, false).d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        int i12 = 3;
        int i13 = 2;
        if (i7 == profileActivity.W3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
            String M0 = org.telegram.messenger.hd.M0(2131746212, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131746233, null);
            TLRPC.Chat M02 = profileActivity.getMessagesController().M0(Long.valueOf(-profileActivity.a5));
            org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
            if (M02 != null && org.telegram.messenger.t3.w(2, M02)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, profileActivity.getParentActivity(), profileActivity.z0);
                c2VarArr[0] = c2Var;
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                c2VarArr[0].e(org.telegram.messenger.hd.M0(2131753727, null), "", true, false, false);
                c2VarArr[0].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                linearLayout.addView(c2VarArr[0], c8.ha.o(-1, -2));
                c2VarArr[0].setOnClickListener(new y00(c2VarArr, i13));
                alertDialog$Builder.o(linearLayout);
            }
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746231, null), new lk0(10, profileActivity, c2VarArr));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new go0(i12));
            TextView textView2 = (TextView) alertDialog$Builder.p().d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        if (i7 == profileActivity.q4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", (int) (profileActivity.h1 & 4294967295L));
            profileActivity.presentFragment(new p50(bundle2));
            return;
        }
        if (i7 == profileActivity.p4) {
            profileActivity.showDialog(org.telegram.ui.Components.v4.S(profileActivity.getParentActivity(), profileActivity.C2, profileActivity.z0).a);
            return;
        }
        if (i7 == profileActivity.M3) {
            profileActivity.F4(view, f10, f11, false);
            return;
        }
        if (i7 == profileActivity.K4) {
            profileActivity.getMessagesController().f5(null, profileActivity.d1);
            if (org.telegram.ui.Components.hc.a(profileActivity)) {
                org.telegram.ui.Components.hc.d(profileActivity, false).j();
                return;
            }
            return;
        }
        int i14 = 9;
        if (i7 == profileActivity.Z3) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
                return;
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                return;
            }
        }
        if (i7 == profileActivity.T3) {
            profileActivity.I4();
            return;
        }
        if (i7 == profileActivity.U3) {
            oy0.K0(profileActivity.a(), profileActivity);
            return;
        }
        if (i7 >= profileActivity.t4 && i7 < profileActivity.u4) {
            profileActivity.h(!profileActivity.B2.isEmpty() ? profileActivity.t2.participants.participants.get(((Integer) profileActivity.B2.get(i7 - profileActivity.t4)).intValue()) : profileActivity.t2.participants.participants.get(i7 - profileActivity.t4), false, false, view);
            return;
        }
        if (i7 == profileActivity.v4) {
            profileActivity.J4();
            return;
        }
        if (i7 == profileActivity.K3) {
            profileActivity.Q4(f10, f11, i7, view);
            return;
        }
        if (i7 == profileActivity.k4) {
            if (profileActivity.D2 != null) {
                profileActivity.showDialog(new ii.d0(profileActivity, profileActivity.D2.linked_community_id, null, null));
                return;
            } else {
                if (profileActivity.d1 == 0 || (a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.d1))) == null) {
                    return;
                }
                profileActivity.showDialog(new ii.d0(profileActivity, a22.linked_community_id, null, null));
                return;
            }
        }
        if (i7 == profileActivity.H3) {
            if (profileActivity.t2.location instanceof TLRPC.TL_channelLocation) {
                pa0 pa0Var = new pa0(5);
                long j10 = profileActivity.e1;
                TLRPC.TL_channelLocation tL_channelLocation = (TLRPC.TL_channelLocation) profileActivity.t2.location;
                pa0Var.l0 = -j10;
                pa0Var.B0 = tL_channelLocation;
                profileActivity.presentFragment(pa0Var);
                return;
            }
            return;
        }
        if (i7 == profileActivity.L4) {
            profileActivity.E4(false);
            return;
        }
        if (i7 == profileActivity.w4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.e1);
            bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            oq oqVar = new oq(bundle3);
            oqVar.C0(profileActivity.t2);
            profileActivity.presentFragment(oqVar);
            return;
        }
        if (i7 == profileActivity.x4) {
            profileActivity.presentFragment(new bi.w4(profileActivity.e1));
            return;
        }
        if (i7 == profileActivity.y4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.e1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            oq oqVar2 = new oq(bundle4);
            oqVar2.C0(profileActivity.t2);
            profileActivity.presentFragment(oqVar2);
            return;
        }
        if (i7 == profileActivity.z4) {
            profileActivity.R0.performClick();
            return;
        }
        if (i7 == profileActivity.A4) {
            profileActivity.presentFragment(new bi.z(0, profileActivity.d1));
            return;
        }
        if (i7 == profileActivity.B4) {
            profileActivity.presentFragment(new bi.z(1, profileActivity.d1));
            return;
        }
        if (i7 == profileActivity.C4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.e1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new c51(bundle5));
            return;
        }
        if (i7 == profileActivity.F4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.e1);
            bundle6.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            oq oqVar3 = new oq(bundle6);
            oqVar3.C0(profileActivity.t2);
            profileActivity.presentFragment(oqVar3);
            return;
        }
        if (i7 == profileActivity.e3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
            return;
        }
        if (i7 == profileActivity.g3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.G2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.D0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
            return;
        }
        if (i7 == profileActivity.h3) {
            profileActivity.presentFragment(new DataSettingsActivity());
            return;
        }
        if (i7 == profileActivity.i3) {
            profileActivity.presentFragment(new ThemeActivity(0));
            return;
        }
        if (i7 == profileActivity.j3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
            return;
        }
        if (i7 == profileActivity.l3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
            return;
        }
        if (i7 == profileActivity.k3) {
            profileActivity.presentFragment(new w90());
            return;
        }
        if (i7 == profileActivity.m3) {
            profileActivity.presentFragment(new SessionsActivity(0));
            return;
        }
        if (i7 == profileActivity.p3) {
            profileActivity.showDialog(org.telegram.ui.Components.v4.R(profileActivity, profileActivity.z0));
            return;
        }
        if (i7 == profileActivity.q3) {
            vf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131744241, null));
            return;
        }
        if (i7 == profileActivity.r3) {
            vf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131746780, null));
            return;
        }
        if (i7 == profileActivity.u3) {
            V4(profileActivity.getParentActivity(), false);
            return;
        }
        if (i7 == profileActivity.v3) {
            V4(profileActivity.getParentActivity(), true);
            return;
        }
        if (i7 == profileActivity.w3) {
            org.telegram.messenger.a8.a();
            return;
        }
        if (i7 == profileActivity.x3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
            String M03 = org.telegram.messenger.hd.M0(2131754120, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
            u1Var2.T = M03;
            u1Var2.R = org.telegram.messenger.hd.M0(R.string.AppName, null);
            alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747830, null), new tt0(profileActivity, i14));
            alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            profileActivity.showDialog(u1Var2);
            return;
        }
        if (i7 == profileActivity.f3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
            return;
        }
        if (i7 == profileActivity.U2) {
            profileActivity.presentFragment(new la(null));
            return;
        }
        if (i7 == profileActivity.V2) {
            profileActivity.presentFragment(new UserInfoActivity());
            return;
        }
        if (i7 == profileActivity.S2) {
            profileActivity.presentFragment(new g(3));
            return;
        }
        if (i7 == profileActivity.N2) {
            profileActivity.I4();
            return;
        }
        if (i7 == profileActivity.b4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
            return;
        }
        if (i7 == profileActivity.c4) {
            profileActivity.presentFragment(new bi.dd());
            return;
        }
        if (i7 == profileActivity.d4) {
            profileActivity.presentFragment(new gi.f());
            return;
        }
        if (i7 == profileActivity.e4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
            return;
        }
        if (i7 == profileActivity.f4) {
            wg.f1.l1(0, org.telegram.messenger.v1.a(profileActivity.currentAccount).b());
            return;
        }
        if (i7 == profileActivity.botPermissionLocation) {
            hi.r0 r0Var = profileActivity.r2;
            if (r0Var != null) {
                r0Var.l(!r0Var.g(), new qn0(20, profileActivity, view));
                return;
            }
            return;
        }
        if (i7 == profileActivity.botPermissionBiometry) {
            hi.p pVar = profileActivity.s2;
            if (pVar != null) {
                boolean z10 = !pVar.e;
                pVar.f = true;
                pVar.e = z10;
                pVar.k();
                ((org.telegram.ui.Cells.m8) view).setChecked(profileActivity.s2.e);
                return;
            }
            return;
        }
        if (i7 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.setChecked(!m8Var.d());
            if (profileActivity.n4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.n4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().o1(profileActivity.d1);
            boolean d = m8Var.d();
            toggleuseremojistatuspermission.enabled = d;
            TLRPC.UserFull userFull2 = profileActivity.u2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = d;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new h50(21, profileActivity, r1));
            profileActivity.n4 = sendRequest;
            int[] iArr = {sendRequest};
            return;
        }
        if (i7 == profileActivity.N3) {
            profileActivity.N4 = !profileActivity.N4;
            profileActivity.T4();
            view.requestLayout();
            profileActivity.d.g(profileActivity.N3);
            int i15 = profileActivity.k6;
            if (i15 >= 0) {
                profileActivity.c.h1(i15, profileActivity.l6 - profileActivity.a.getPaddingTop());
                return;
            }
            return;
        }
        if (i7 == profileActivity.O3) {
            profileActivity.N4(false);
            return;
        }
        if (i7 == profileActivity.P2) {
            if (profileActivity.u2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.u2.personal_channel_id);
            profileActivity.presentFragment(new an(bundle7));
            return;
        }
        if (i7 != profileActivity.T2) {
            if (i7 == profileActivity.G3) {
                profileActivity.Y3(i7, view);
                return;
            } else {
                profileActivity.Q4(f10, f11, i7, view);
                return;
            }
        }
        ax0 ax0Var = profileActivity.z6;
        if ((ax0Var == null || !ax0Var.a()) && !profileActivity.Z3(i7, view)) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (x8Var.d.getDrawable() != null) {
                profileActivity.H4(x8Var.getImageView());
            }
        }
    }

    public static void l0(ProfileActivity profileActivity) {
        org.telegram.ui.ActionBar.g2 g2Var;
        int i7;
        String str;
        final r3 r3Var;
        final int i10;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.u2;
        if (userFull == null || userFull.stars_rating == null) {
            return;
        }
        org.telegram.ui.ActionBar.f6 f6Var = null;
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(profileActivity.getParentActivity(), false, 1, null);
        org.telegram.ui.ActionBar.g2 g2Var2 = h.x0;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        final LimitPreviewView limitPreviewView = new LimitPreviewView(R.drawable.filled_rating_crown, 0, 0, profileActivity.getParentActivity(), profileActivity.z0);
        limitPreviewView.setHideNegativeValues(profileActivity.a() != org.telegram.messenger.p10.i(profileActivity.currentAccount).e());
        limitPreviewView.setStarRating(userFull.stars_rating);
        limitPreviewView.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
        linearLayout.addView(limitPreviewView, c8.ha.t(-1, -2, 17, 0, 20, 0, 10));
        int i11 = 17;
        if (userFull.stars_my_pending_rating != null) {
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            linearLayout.addView(frameLayout, c8.ha.t(-1, -2, 17, 40, -12, 40, 20));
            int i12 = 2;
            TextView[] textViewArr = new org.telegram.ui.Components.w70[2];
            int i13 = 0;
            while (true) {
                int i14 = 3;
                if (i13 >= i12) {
                    break;
                }
                int i15 = i12;
                org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.jb(i14, parentActivity, f6Var);
                textViewArr[i13] = jbVar;
                jbVar.setGravity(i11);
                textViewArr[i13].setTextSize(1, 12.0f);
                org.telegram.ui.ActionBar.r6.V(textViewArr[i13], org.telegram.ui.ActionBar.k6.y6, null);
                org.telegram.ui.ActionBar.r6.H(textViewArr[i13], org.telegram.ui.ActionBar.k6.Uc, null);
                frameLayout.addView(textViewArr[i13], c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
                textViewArr[i13].setAlpha(i13 == 0 ? 1.0f : 0.0f);
                textViewArr[i13].setScaleX(i13 == 0 ? 1.0f : 0.8f);
                textViewArr[i13].setScaleY(i13 == 0 ? 1.0f : 0.8f);
                i13++;
                i12 = i15;
                i11 = 17;
            }
            int i16 = i12;
            r3 r3Var2 = new r3(textViewArr, 22);
            boolean z9 = profileActivity.a() == org.telegram.messenger.p10.i(profileActivity.currentAccount).e();
            long j3 = userFull.stars_rating.stars;
            TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
            g2Var = g2Var2;
            long j10 = (-j3) - (tl_starsRating != null ? tl_starsRating.stars - j3 : 0L);
            int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(profileActivity.currentAccount).getCurrentTime()) / 86400);
            long j11 = userFull.stars_my_pending_rating.stars;
            long j12 = userFull.stars_rating.stars;
            long j13 = j11 - j12;
            if ((j12 >= 0 || z9) && (!z9 || j10 <= 0)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String H = org.telegram.messenger.hd.H(',', "StarRatingFuture", max);
                String H2 = org.telegram.messenger.hd.H(',', "StarRatingFuturePendingPoints", (int) j13);
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[0] = H;
                charSequenceArr[1] = "\n";
                charSequenceArr[i16] = H2;
                spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                spannableStringBuilder.append((CharSequence) " ");
                r3Var = r3Var2;
                i10 = 0;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131745187, null), new Runnable() { // from class: org.telegram.ui.ju0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17 = i10;
                        r3 r3Var3 = r3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i17) {
                            case 0:
                                RectF rectF = ProfileActivity.S6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                r3Var3.a(Boolean.TRUE);
                                break;
                            default:
                                RectF rectF2 = ProfileActivity.S6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                r3Var3.a(Boolean.FALSE);
                                break;
                        }
                    }
                }), true));
                textViewArr[0].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ku0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i17 = i10;
                        r3 r3Var3 = r3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i17) {
                            case 0:
                                RectF rectF = ProfileActivity.S6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                r3Var3.a(Boolean.TRUE);
                                break;
                            default:
                                RectF rectF2 = ProfileActivity.S6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                r3Var3.a(Boolean.FALSE);
                                break;
                        }
                    }
                });
                textViewArr[0].setText(spannableStringBuilder);
            } else {
                org.telegram.ui.ActionBar.r6.V(textViewArr[0], org.telegram.ui.ActionBar.k6.q7, null);
                if (z9) {
                    textViewArr[0].setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "StarRatingLevelNegativeYou", (int) j10)));
                } else {
                    textViewArr[0].setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131745173, org.telegram.messenger.m5.l(org.telegram.messenger.p10.s0, profileActivity.a()))));
                }
                r3Var = r3Var2;
                i10 = 0;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String H3 = org.telegram.messenger.hd.H(',', "StarRatingFuturePreview1", max);
            String H4 = org.telegram.messenger.hd.H(',', "StarRatingFuturePreview2", (int) j13);
            CharSequence[] charSequenceArr2 = new CharSequence[3];
            charSequenceArr2[i10] = H3;
            final r3 r3Var3 = r3Var;
            final int i17 = 1;
            charSequenceArr2[1] = "\n";
            charSequenceArr2[i16] = H4;
            spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131745186, null), new Runnable() { // from class: org.telegram.ui.ju0
                @Override // java.lang.Runnable
                public final void run() {
                    int i172 = i17;
                    r3 r3Var32 = r3Var3;
                    TLRPC.UserFull userFull2 = userFull;
                    LimitPreviewView limitPreviewView2 = limitPreviewView;
                    switch (i172) {
                        case 0:
                            RectF rectF = ProfileActivity.S6;
                            limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            r3Var32.a(Boolean.TRUE);
                            break;
                        default:
                            RectF rectF2 = ProfileActivity.S6;
                            limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                            r3Var32.a(Boolean.FALSE);
                            break;
                    }
                }
            }), true));
            textViewArr[1].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ku0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i172 = i17;
                    r3 r3Var32 = r3Var3;
                    TLRPC.UserFull userFull2 = userFull;
                    LimitPreviewView limitPreviewView2 = limitPreviewView;
                    switch (i172) {
                        case 0:
                            RectF rectF = ProfileActivity.S6;
                            limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            r3Var32.a(Boolean.TRUE);
                            break;
                        default:
                            RectF rectF2 = ProfileActivity.S6;
                            limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                            r3Var32.a(Boolean.FALSE);
                            break;
                    }
                }
            });
            textViewArr[1].setText(spannableStringBuilder2);
        } else {
            g2Var = g2Var2;
        }
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.hd.M0(2131745168, null));
        textView.setTextSize(1, 20.0f);
        int i18 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i18, profileActivity.z0);
        linearLayout.addView(textView, c8.ha.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        if (userFull.id == org.telegram.messenger.p10.i(profileActivity.currentAccount).e()) {
            textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131745169, null)));
            i7 = 1;
        } else {
            i7 = 1;
            org.telegram.messenger.k5.r(null, null, 2131745199, new Object[]{org.telegram.messenger.m5.l(org.telegram.messenger.p10.s0, profileActivity.a())}, textView2);
        }
        textView2.setTextSize(i7, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, i18, profileActivity.z0);
        linearLayout.addView(textView2, c8.ha.t(-1, -2, 17, 20, 0, 20, 12));
        is0 is0Var = new is0(parentActivity, profileActivity.z0);
        is0Var.a.l(org.telegram.messenger.hd.M0(2131745167, null), false);
        String M0 = org.telegram.messenger.hd.M0(2131745202, null);
        int i19 = org.telegram.ui.ActionBar.k6.Ci;
        is0Var.b.setText(org.telegram.messenger.hd.V(null, null, 2131745198, W3(M0, i19, profileActivity.z0)));
        is0Var.d.setVisibility(8);
        ImageView imageView = is0Var.c;
        imageView.setImageResource(R.drawable.menu_gift);
        org.telegram.ui.ActionBar.f6 f6Var2 = profileActivity.z0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.r6.t(imageView, i18, f6Var2, mode);
        linearLayout.addView(is0Var, c8.ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        is0 is0Var2 = new is0(parentActivity, profileActivity.z0);
        is0Var2.a.l(org.telegram.messenger.hd.M0(2131745166, null), false);
        is0Var2.b.setText(org.telegram.messenger.hd.V(null, null, 2131745197, W3(org.telegram.messenger.hd.M0(2131745202, null), i19, profileActivity.z0)));
        is0Var2.d.setVisibility(8);
        ImageView imageView2 = is0Var2.c;
        imageView2.setImageResource(R.drawable.menu_stars_gift);
        org.telegram.ui.ActionBar.r6.t(imageView2, i18, profileActivity.z0, mode);
        linearLayout.addView(is0Var2, c8.ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        is0 is0Var3 = new is0(parentActivity, profileActivity.z0);
        is0Var3.a.l(org.telegram.messenger.hd.M0(2131745165, null), false);
        String M02 = org.telegram.messenger.hd.M0(2131745200, null);
        int f10 = org.telegram.ui.ActionBar.k6.I.q() ? i0.a.f(0.25f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.m6, profileActivity.z0), -16777216) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, profileActivity.z0);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(M02);
        ov0 ov0Var = new ov0(9);
        ov0Var.w = M02;
        if (ov0Var.c != null) {
            str = null;
            ov0Var.c = null;
            ov0Var.a();
        } else {
            str = null;
        }
        ov0Var.f = f10;
        ov0Var.n = false;
        spannableStringBuilder3.setSpan(ov0Var, 0, spannableStringBuilder3.length(), 0);
        is0Var3.b.setText(org.telegram.messenger.hd.V(str, str, 2131745196, spannableStringBuilder3));
        is0Var3.d.setVisibility(8);
        ImageView imageView3 = is0Var3.c;
        imageView3.setImageResource(R.drawable.menu_refund);
        org.telegram.ui.ActionBar.r6.t(imageView3, i18, profileActivity.z0, mode);
        linearLayout.addView(is0Var3, c8.ha.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        fi.d dVar = new fi.d(parentActivity, profileActivity.z0, true);
        dVar.setOnClickListener(new lu0(0, g2Var));
        dVar.i(bi.k7.g2(org.telegram.messenger.hd.M0(2131743889, null)), false, true);
        linearLayout.addView(dVar, c8.ha.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        h.N = linearLayout;
        h.show();
    }

    public static void m0(ProfileActivity profileActivity, int i7, float f10, float f11) {
        switch (i7) {
            case 0:
                boolean z9 = profileActivity.p1;
                if (!z9) {
                    if (profileActivity.d1 == 0) {
                        if (profileActivity.e1 != 0) {
                            if (!org.telegram.messenger.t3.c0(profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.e1)))) {
                                if (!profileActivity.c4()) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", profileActivity.e1);
                                    if (profileActivity.getMessagesController().E(bundle, profileActivity, null, null)) {
                                        profileActivity.presentFragment(new an(bundle), false);
                                        break;
                                    }
                                }
                            } else {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", profileActivity.e1);
                                if (profileActivity.getMessagesController().E(bundle2, profileActivity, null, null)) {
                                    profileActivity.presentFragment(new an(bundle2), false);
                                    break;
                                }
                            }
                        }
                    } else {
                        profileActivity.L4();
                        break;
                    }
                } else if (z9) {
                    profileActivity.c4();
                    break;
                }
                break;
            case 1:
                profileActivity.F4(profileActivity.Z, f10, f11, true);
                break;
            case 2:
                profileActivity.M4();
                break;
            case 3:
                profileActivity.D4();
                break;
            case 4:
                profileActivity.G4();
                break;
            case 5:
            case 10:
            case 11:
                profileActivity.C4(false);
                break;
            case 6:
                profileActivity.C4(true);
                break;
            case 7:
                profileActivity.E4(true);
                break;
            case 8:
                oy0.K0(profileActivity.a(), profileActivity);
                break;
            case 9:
                profileActivity.w4(false);
                break;
            case 12:
                profileActivity.getMessagesController().e7.edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, profileActivity.getParentActivity(), profileActivity.z0);
                u1Var.r(200L);
                org.telegram.messenger.qp.s1(profileActivity.currentAccount).P1().k(profileActivity.a(), new org.telegram.ui.Components.ex(21, profileActivity, u1Var), true, profileActivity.z0);
                break;
            case 13:
                profileActivity.B4(true);
                break;
            case 14:
                profileActivity.I4();
                break;
            case 15:
                TLRPC.User f12 = profileActivity.getUserConfig().f();
                if (f12 != null) {
                    org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(profileActivity, profileActivity.Z);
                    H.w = false;
                    H.i = 3;
                    H.c(R.drawable.msg_qrcode, org.telegram.messenger.hd.M0(2131746499, null), new j90(profileActivity, 24), false);
                    H.c(R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131746677, null), new ef0(f12, 29), false);
                    H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131746619, null), new j90(profileActivity, 26), false);
                    H.W = true;
                    H.a0(f10 - org.telegram.messenger.g0.L(8.0f), profileActivity.Z.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f));
                    H.Z();
                    break;
                }
                break;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 17:
                profileActivity.presentFragment(new m31(null));
                break;
        }
    }

    public static void n0(ProfileActivity profileActivity) {
        boolean z9;
        TLRPC.Document document;
        if (profileActivity.a0 == null) {
            if (MediaController.B().Q0 != null && MediaController.B().Q0.a == profileActivity.currentAccount && MediaController.B().Q0.b == profileActivity.a()) {
                profileActivity.a0 = MediaController.B().Q0;
            } else {
                org.telegram.messenger.kp kpVar = new org.telegram.messenger.kp(profileActivity.currentAccount, profileActivity.a());
                profileActivity.a0 = kpVar;
                TLRPC.UserFull userFull = profileActivity.u2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    ArrayList arrayList = kpVar.c;
                    arrayList.clear();
                    kpVar.b();
                    arrayList.add(0, kpVar.d(document));
                }
            }
        }
        if (profileActivity.a0.c.isEmpty()) {
            return;
        }
        if (MediaController.B().Q0 == profileActivity.a0 && MediaController.B().I((org.telegram.messenger.ij) profileActivity.a0.c.get(0))) {
            z9 = true;
        } else {
            MediaController.B().o();
            z9 = false;
        }
        MediaController.B().Q0 = profileActivity.a0;
        MediaController.B().R0.clear();
        MediaController.B().R0.addAll(profileActivity.a0.c);
        if (!z9) {
            MediaController.B().S((org.telegram.messenger.ij) profileActivity.a0.c.get(0));
        }
        profileActivity.showDialog(new org.telegram.ui.Components.b8(profileActivity.getParentActivity(), profileActivity.z0));
    }

    public static void o0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.na0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new j90(profileActivity, 20), profileActivity.z0);
    }

    public static void p0(ProfileActivity profileActivity, org.telegram.ui.Cells.c2[] c2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().o1(profileActivity.d1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().j1(profileActivity.a5);
        tL_messages_reportReaction.id = profileActivity.Z4;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new di.u5(27));
        org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
        if (c2Var != null && c2Var.b()) {
            profileActivity.getMessagesController().f0(-profileActivity.a5, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.d1)));
        }
        profileActivity.Z4 = 0;
        profileActivity.D5(false, false);
        org.telegram.ui.Components.hc.a0(profileActivity).E(profileActivity.z0).j();
    }

    public static void q0(ProfileActivity profileActivity, Boolean bool) {
        long j3 = profileActivity.d1;
        if (j3 == 0) {
            long j10 = profileActivity.e1;
            j3 = j10 != 0 ? -j10 : profileActivity.h1;
        }
        long j11 = j3;
        if (bool.booleanValue()) {
            org.telegram.messenger.qp.s1(profileActivity.currentAccount).W(profileActivity.a5, j11);
        } else {
            org.telegram.messenger.qp.s1(profileActivity.currentAccount).h0(profileActivity.a5, profileActivity.Z4, j11);
        }
        profileActivity.Z4 = 0;
        profileActivity.D5(false, false);
        org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(profileActivity.getParentActivity(), profileActivity.z0);
        kbVar.d(R.raw.chats_infotip, new String[0]);
        kbVar.b.setText(org.telegram.messenger.hd.M0(2131746403, null));
        org.telegram.ui.Components.hc.a0(profileActivity).b(kbVar, 1500).j();
    }

    public static void r0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f10, boolean z9) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.T1 = floatValue;
        float f11 = (floatValue - 0.5f) / 0.5f;
        float f12 = (0.5f - floatValue) / 0.5f;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        float f13 = -f10;
        profileActivity.S1 = (int) ((1.0f - floatValue) * f13);
        profileActivity.b.setTranslationY(floatValue * f10);
        profileActivity.O.setTranslationY(f10 * profileActivity.T1);
        profileActivity.a.setTranslationY((1.0f - profileActivity.T1) * f13);
        profileActivity.a.setScaleX(1.0f - ((1.0f - profileActivity.T1) * 0.01f));
        profileActivity.a.setScaleY(1.0f - ((1.0f - profileActivity.T1) * 0.01f));
        profileActivity.a.setAlpha(profileActivity.T1);
        profileActivity.y4(true);
        profileActivity.a.setAlpha(f11);
        profileActivity.b.setAlpha(1.0f - profileActivity.T1);
        profileActivity.b.setScaleX((profileActivity.T1 * 0.05f) + 1.0f);
        profileActivity.b.setScaleY((profileActivity.T1 * 0.05f) + 1.0f);
        profileActivity.O.setAlpha(1.0f - f11);
        profileActivity.X.setAlpha(f11);
        profileActivity.e0.setAlpha(f11);
        cv0 cv0Var = profileActivity.u0;
        if (cv0Var != null) {
            cv0Var.setAlpha(f11);
        }
        profileActivity.f.setAlpha(f11);
        profileActivity.r.setAlpha(profileActivity.R5 ? 0.0f : f11);
        profileActivity.T0.getSearchField().setAlpha(f12);
        if (z9 && profileActivity.T1 < 0.7f) {
            org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
            if (f5Var.F.getWidth() != 0 && !f5Var.e.isFocused()) {
                f5Var.e.requestFocus();
                org.telegram.messenger.g0.K3(f5Var.e);
            }
        }
        profileActivity.T0.getSearchContainer().setVisibility(profileActivity.T1 < 0.5f ? 0 : 8);
        int i7 = profileActivity.T1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.f5 f5Var2 = profileActivity.S0;
        if (f5Var2 != null) {
            f5Var2.setVisibility(i7);
            profileActivity.S0.setAlpha(f11);
        }
        profileActivity.T0.setVisibility(i7);
        profileActivity.actionBar.y(profileActivity.T1 < 0.5f);
        org.telegram.ui.ActionBar.f5 f5Var3 = profileActivity.S0;
        if (f5Var3 != null) {
            f5Var3.setAlpha(f11);
        }
        profileActivity.T0.setAlpha(f11);
        profileActivity.c1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void s1(ProfileActivity profileActivity) {
        if (profileActivity.simpleActionBar == null) {
            return;
        }
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (kVar != null && kVar.getVisibility() != 4) {
            profileActivity.actionBar.setVisibility(4);
        }
        float actionModeFactor = profileActivity.simpleActionBar.getActionModeFactor();
        bi.x5 x5Var = profileActivity.Y;
        if (x5Var != null) {
            float f10 = 1.0f - actionModeFactor;
            if (x5Var.getAlpha() != f10) {
                profileActivity.Y.setAlpha(f10);
            }
        }
    }

    public static void y1(ProfileActivity profileActivity, boolean z9) {
        int i7 = z9 ? 8 : 0;
        profileActivity.a.setVisibility(i7);
        profileActivity.b.setVisibility(z9 ? 0 : 8);
        profileActivity.T0.getSearchContainer().setVisibility(z9 ? 0 : 8);
        bi.g1 g1Var = profileActivity.v0;
        if (g1Var != null) {
            g1Var.setActive(!z9);
        }
        profileActivity.actionBar.y(z9);
        profileActivity.X.setVisibility(i7);
        cv0 cv0Var = profileActivity.u0;
        if (cv0Var != null) {
            cv0Var.setVisibility(i7);
        }
        profileActivity.f.setVisibility(i7);
        profileActivity.r.setVisibility(i7);
        org.telegram.ui.ActionBar.f5 f5Var = profileActivity.S0;
        if (f5Var != null) {
            f5Var.setAlpha(1.0f);
            profileActivity.S0.setVisibility(i7);
        }
        profileActivity.T0.setVisibility(i7);
        profileActivity.e0.setAlpha(1.0f);
        profileActivity.X.setAlpha(1.0f);
        cv0 cv0Var2 = profileActivity.u0;
        if (cv0Var2 != null) {
            cv0Var2.setAlpha(1.0f);
        }
        bi.g1 g1Var2 = profileActivity.v0;
        if (g1Var2 != null) {
            g1Var2.setAlpha(1.0f);
        }
        profileActivity.f.setAlpha(1.0f);
        profileActivity.r.setAlpha(profileActivity.R5 ? 0.0f : 1.0f);
        profileActivity.T0.setAlpha(1.0f);
        profileActivity.a.setAlpha(1.0f);
        profileActivity.b.setAlpha(1.0f);
        profileActivity.O.setAlpha(1.0f);
        if (z9) {
            profileActivity.b.setEmptyView(profileActivity.O);
        } else {
            profileActivity.O.setVisibility(8);
        }
    }

    public final void A5() {
        if (this.simpleActionBar == null || this.G5 == null) {
            return;
        }
        org.telegram.ui.Components.if0 if0Var = this.I5;
        if (if0Var != null) {
            float l42 = l4();
            if (if0Var.l != l42) {
                if0Var.l = l42;
                if0Var.a();
            }
        }
        int f10 = i0.a.f(l4(), this.C5, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.z0));
        if (this.F5 != f10) {
            this.F5 = f10;
            org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
            y4Var.l0 = true;
            y4Var.f0 = f10;
            y4Var.updateColors();
        }
        int e12 = this.H5.e1();
        if (this.K5 != e12) {
            this.K5 = e12;
            org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
            fh.g gVar = y4Var2.H;
            if (gVar != null) {
                gVar.updateColors();
                y4Var2.I.updateColors();
                y4Var2.J.updateColors();
            }
            y4Var2.invalidate();
            org.telegram.ui.ActionBar.i5 i5Var = y4Var2.Q;
            if (i5Var != null) {
                i5Var.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ie0
    public final ri.f B() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    public final void B4(boolean z9) {
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.d1));
        if (a22 == null) {
            return;
        }
        if (this.q2 && !org.telegram.messenger.qp.F2(a22)) {
            if (!this.j1 || z9) {
                org.telegram.ui.Components.v4.r(this, false, this.D2, a22, this.C2 != null, true, false, true, new xt0(this, a22));
                return;
            } else {
                getMessagesController().f5(new j90(this, 6), this.d1);
                finishFragment();
                return;
            }
        }
        if (this.j1) {
            getMessagesController().f5(null, this.d1);
            if (org.telegram.ui.Components.hc.a(this)) {
                org.telegram.ui.Components.hc.d(this, false).j();
                return;
            }
            return;
        }
        if (this.k1) {
            org.telegram.ui.Components.v4.g0(this, this.d1, a22, null, this.C2, false, null, new na(this, 3), this.z0);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.z0);
        String M0 = org.telegram.messenger.hd.M0(2131753692, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name)));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753693, null), new tt0(this, 2));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, this.z0);
        }
    }

    public final void B5(boolean z9) {
        if (this.S0 == null) {
            return;
        }
        boolean z10 = this.R5;
        boolean z11 = !z10;
        boolean z12 = this.o2;
        boolean z13 = false;
        d5(this.P0, (z10 || z12 || !this.L0) ? false : true, z9);
        d5(this.Q0, (z10 || z12 || !this.M0) ? false : true, z9);
        d5(this.R0, (z10 || z12 || !this.N0) ? false : true, z9);
        vv0 vv0Var = this.N;
        boolean z14 = (vv0Var == null || vv0Var.I == null || !vv0Var.v0(vv0Var.getClosestTab())) ? false : true;
        d5(this.S0, z11, z9 && !z14);
        vv0 vv0Var2 = this.N;
        if (vv0Var2 != null) {
            boolean z15 = this.R5;
            if (z9 && !z14) {
                z13 = true;
            }
            if (vv0Var2.p2 != z15) {
                vv0Var2.p2 = z15;
                vv0Var2.R(z9, z13);
            }
        }
    }

    public final void C4(boolean z9) {
        boolean z10 = false;
        if (this.d1 != 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.d1));
            if (a22 != null) {
                TLRPC.UserFull userFull = this.u2;
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                }
                org.telegram.ui.Components.voip.y1.m(a22, z9, z10, getParentActivity(), this.u2, getAccountInstance());
                return;
            }
            return;
        }
        if (this.e1 != 0) {
            if (getMessagesController().g1(this.e1, false, null) != null) {
                org.telegram.ui.Components.voip.y1.l(this.D2, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            TLRPC.Chat chat = this.D2;
            org.telegram.messenger.c accountInstance = getAccountInstance();
            if (getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.t60.J0(getParentActivity(), -chat.id, accountInstance, new org.telegram.ui.Components.hr(chat, this, accountInstance, 6));
        }
    }

    public final void C5() {
        TLRPC.User a22;
        if (!this.r1 || this.W0 == null || this.V0 == null || (a22 = getMessagesController().a2(Long.valueOf(this.d1))) == null) {
            return;
        }
        boolean z9 = org.telegram.messenger.t10.n(a22) != null;
        this.W0.setIcon(z9 ? R.drawable.menu_username_change : R.drawable.menu_username_set);
        this.W0.setText(org.telegram.messenger.hd.M0(z9 ? 2131746619 : 2131746618, null));
        this.V0.setVisibility(org.telegram.messenger.t10.n(a22) == null ? 8 : 0);
    }

    public final void D4() {
        TLRPC.UserFull userFull = this.u2;
        if (userFull == null || !org.telegram.messenger.t10.b(userFull)) {
            if (this.D2 != null) {
                org.telegram.ui.Components.z20.h.a();
            }
            showDialog(new zh.h1(getParentActivity(), this.currentAccount, a(), null, null));
        } else {
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (T != null) {
                org.telegram.messenger.camera.q.s(org.telegram.messenger.hd.a0(null, null, 2131743743, org.telegram.messenger.m5.t(a())), org.telegram.ui.Components.hc.a0(T), R.raw.error, 36);
            }
        }
    }

    public final void D5(boolean z9, boolean z10) {
        if (this.d == null) {
            if (z9) {
                G5(false);
            }
            J5();
            return;
        }
        if (!z10 && this.a.isInLayout()) {
            qu0 qu0Var = this.a;
            if (qu0Var.G) {
                qu0Var.post(new org.telegram.ui.Components.tp0(11, this, z9));
                return;
            }
            return;
        }
        xv0 xv0Var = new xv0(this);
        xv0Var.b = this.M2;
        xv0Var.f(xv0Var.c);
        xv0Var.e.clear();
        xv0Var.f.clear();
        xv0Var.e.addAll(this.Q4);
        xv0Var.f.addAll(this.R4);
        xv0Var.g = this.t4;
        xv0Var.h = this.u4;
        if (z9) {
            G5(false);
        }
        T4();
        J5();
        xv0Var.f(xv0Var.d);
        try {
            v4.o.c(xv0Var, true).c(this.d);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.d.f();
        }
        int i7 = this.k6;
        if (i7 >= 0) {
            this.c.h1(i7, this.l6 - this.a.getPaddingTop());
        }
        org.telegram.messenger.g0.b4(this.a);
    }

    public final void E4(boolean z9) {
        boolean[] zArr = {true};
        getMessagesController().m(this.D2.id, getUserConfig().f(), 0, null, this, true, new g60(this, z9, zArr, 8), new a3.g(this, zArr, z9, this.parentLayout.getLastFragment(), 7), null);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.I4, new Object[0]);
    }

    public final void E5() {
        if (this.b0 == null || this.r == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        boolean z9 = this.F1;
        if (z9 && this.I1 == 2 && this.X != null) {
            this.b0.setAlpha(this.R1);
            this.b0.f(org.telegram.messenger.g0.L(74.0f) + this.a.getMeasuredWidth(), e4() - org.telegram.messenger.g0.L(74.0f));
            return;
        }
        if (z9) {
            this.b0.setAlpha(this.R1);
        }
        float f10 = currentActionBarHeight;
        float L = this.P1 + f10 + org.telegram.messenger.g0.L(74.0f);
        float min = Math.min(e4(), L - f10);
        this.b0.f(L - min, min - org.telegram.messenger.g0.L(74.0f));
    }

    public final void F4(View view, float f10, float f11, boolean z9) {
        float f12;
        float f13;
        long j3;
        long j10 = this.h1;
        if (j10 == 0) {
            j10 = this.d1;
            if (j10 == 0) {
                j10 = -this.e1;
            }
        }
        long j11 = j10;
        boolean r22 = getMessagesController().r2(j11, this.f1, null);
        if (z9 && (this.p1 || r22)) {
            boolean z10 = !r22;
            getNotificationsController().G(j11, this.f1, z10);
            org.telegram.ui.Components.hc.A(this, z10, null).j();
            v5();
            this.Z.setNotifications(r22);
            return;
        }
        if ((z9 || !org.telegram.messenger.hd.a0 || f10 > org.telegram.messenger.g0.L(76.0f)) && (org.telegram.messenger.hd.a0 || f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
            org.telegram.ui.Components.yn ynVar = new org.telegram.ui.Components.yn(getParentActivity(), this.currentAccount, null, true, new a8.ua(this, j11, 7), this.z0);
            ynVar.e(j11, this.f1, this.h5);
            if (org.telegram.messenger.g0.Q1()) {
                ViewGroup view2 = this.parentLayout.getView();
                f12 = view2.getX() + view2.getPaddingLeft() + f10;
                f13 = view2.getY() + view2.getPaddingTop() + f11;
            } else {
                f12 = f10;
                f13 = f11;
            }
            if (z9) {
                f13 += this.Z.getHeight() - org.telegram.messenger.g0.L(12.0f);
            }
            ynVar.d(this, view, f12, f13, z9);
            return;
        }
        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
        boolean z11 = h5Var.e.h;
        boolean z12 = !z11;
        boolean D = getNotificationsController().D(j11, null, false, false);
        String v = org.telegram.messenger.dt.v(j11, this.f1, false);
        if (z11) {
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.currentAccount).d7.edit();
            if (D) {
                edit.putInt("notify2_" + v, 2);
                j3 = 1;
            } else {
                edit.remove("notify2_" + v);
                j3 = 0L;
            }
            getNotificationsController().N(j11);
            if (this.f1 == 0) {
                getMessagesStorage().E1(j11, j3);
                TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j11);
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
            SharedPreferences.Editor edit2 = org.telegram.messenger.qp.s1(this.currentAccount).d7.edit();
            if (D) {
                edit2.remove("notify2_" + v);
            } else {
                edit2.putInt("notify2_" + v, 0);
            }
            if (this.f1 == 0) {
                getMessagesStorage().E1(j11, 0L);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().Q.f(j11);
                if (dialog2 != null) {
                    dialog2.notify_settings = new TLRPC.TL_peerNotifySettings();
                }
            }
            edit2.apply();
        }
        v5();
        getNotificationsController().c0(j11, this.f1, true);
        h5Var.setChecked(z12);
        F5(true);
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
    public final void F5(boolean z9) {
        int i7;
        jw0 jw0Var;
        if (z9 && (i7 = this.M3) >= 0 && (jw0Var = this.d) != null) {
            jw0Var.g(i7);
        }
        org.telegram.ui.Components.ef0 ef0Var = this.Z;
        if (ef0Var == null || this.r1) {
            return;
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(this.currentAccount).d7;
        long j3 = this.h1;
        if (j3 == 0) {
            j3 = this.d1;
            if (j3 == 0) {
                j3 = -this.e1;
            }
        }
        long j10 = j3;
        boolean z10 = false;
        String v = org.telegram.messenger.dt.v(j10, this.f1, false);
        boolean contains = sharedPreferences.contains("notify2_" + v);
        int c10 = org.telegram.messenger.k5.c("notify2_", v, sharedPreferences, 0);
        int c11 = org.telegram.messenger.k5.c("notifyuntil_", v, sharedPreferences, 0);
        if (c10 != 3 || c11 == Integer.MAX_VALUE) {
            if (c10 == 0) {
                if (!contains) {
                    z10 = getNotificationsController().D(j10, null, false, false);
                    ef0Var.setNotifications(z10);
                }
                z10 = true;
                ef0Var.setNotifications(z10);
            }
        }
    }

    @Override // org.telegram.ui.qw
    public final /* synthetic */ boolean G() {
        return false;
    }

    public final void G4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.d1 != 0) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.d1));
                if (a22 == null) {
                    return;
                }
                if (this.E2 == null || (userFull = this.u2) == null || TextUtils.isEmpty(userFull.about)) {
                    str = String.format("https://" + getMessagesController().U2 + "/%s", org.telegram.messenger.t10.n(a22));
                } else {
                    str = String.format("%s https://" + getMessagesController().U2 + "/%s", this.u2.about, org.telegram.messenger.t10.n(a22));
                }
            } else if (this.e1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.e1));
                if (M0 == null) {
                    return;
                }
                TLRPC.ChatFull chatFull = this.t2;
                if (chatFull == null || TextUtils.isEmpty(chatFull.about)) {
                    str = String.format("https://" + getMessagesController().U2 + "/%s", org.telegram.messenger.t3.K(M0, false));
                } else {
                    str = String.format("%s\nhttps://" + getMessagesController().U2 + "/%s", this.t2.about, org.telegram.messenger.t3.K(M0, false));
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
            startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131752982, null)), 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void G5(boolean z9) {
        int i7;
        TLRPC.UserStatus userStatus;
        boolean z10;
        int i10 = 0;
        this.A2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.B2.clear();
        TLRPC.ChatFull chatFull = this.t2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z10 || chatFull.participants_count <= 200) {
                return;
            }
            this.A2 = chatFull.online_count;
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i10 < this.t2.participants.participants.size()) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.t2.participants.participants.get(i10).user_id));
            if (a22 != null && (userStatus = a22.status) != null && ((userStatus.expires > currentTime || a22.id == getUserConfig().e()) && a22.status.expires > 10000)) {
                this.A2++;
            }
            this.B2.add(Integer.valueOf(i10));
            if (a22 != null) {
                if (a22.bot) {
                    i7 = -110;
                } else if (a22.self) {
                    i7 = 50000 + currentTime;
                } else {
                    TLRPC.UserStatus userStatus2 = a22.status;
                    if (userStatus2 != null) {
                        i7 = userStatus2.expires;
                    }
                }
                i10 = com.google.android.recaptcha.internal.a.f(i7, i10, 1, arrayList);
            }
            i7 = TLObject.FLAG_31;
            i10 = com.google.android.recaptcha.internal.a.f(i7, i10, 1, arrayList);
        }
        try {
            Collections.sort(this.B2, Comparator$-EL.reversed(Comparator$-CC.comparingInt(new re(arrayList, 1))));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (z9 && this.d != null && this.t4 > 0) {
            org.telegram.messenger.g0.b4(this.a);
        }
        if (this.N == null || this.J4 == -1) {
            return;
        }
        if ((this.B2.size() > 5 || this.S4 == 2) && this.S4 != 1) {
            this.N.k1(this.B2, this.t2);
        }
    }

    @Override // org.telegram.ui.Components.i30
    public final void H(float f10) {
        org.telegram.ui.Cells.b4 b4Var = this.g0;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(f10);
        this.n0.O(this.J2, f10);
    }

    public final void H3() {
        org.telegram.ui.ActionBar.k kVar;
        if (this.N == null || (kVar = this.actionBar) == null) {
            return;
        }
        int i7 = kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
        int[] iArr = org.telegram.ui.Components.xs0.s2;
        int z9 = org.telegram.messenger.k5.z(6.666f, oi.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()), currentActionBarHeight);
        int c10 = oi.a.c(i7) + currentActionBarHeight + z9;
        this.U5 = c10;
        this.N.l1(z9, c10, oi.a.c(this.I6), this.I6 + this.G6);
        this.V5 = org.telegram.messenger.g0.L(44.0f) + currentActionBarHeight;
        y5();
        P3();
    }

    public final void H4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.K3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.e1);
            bundle.putLong("user_id", this.d1);
            presentFragment(new ai.s0(bundle));
            return;
        }
        if (view2.getTag() == null || ((Integer) view2.getTag()).intValue() != this.T2) {
            return;
        }
        if (this.d1 == getUserConfig().e()) {
            presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
        } else if (org.telegram.messenger.t10.b(this.u2)) {
            org.telegram.messenger.camera.q.s(org.telegram.messenger.hd.a0(null, null, 2131743743, org.telegram.messenger.m5.t(this.d1)), org.telegram.ui.Components.hc.a0(this), R.raw.error, 36);
        } else {
            showDialog(new zh.h1(getParentActivity(), this.currentAccount, this.d1, null, null));
        }
    }

    public final void H5() {
        CharSequence charSequence;
        bv0 bv0Var = this.r;
        if (bv0Var == null) {
            return;
        }
        if ((!this.R5 || (charSequence = this.W5) == null) && (!this.t6 || (charSequence = this.s6) == null)) {
            charSequence = this.r6;
        }
        if (!bv0Var.o(charSequence, !this.F1) || this.fragmentView == null) {
            return;
        }
        y4(false);
    }

    @Override // org.telegram.ui.Components.mr0
    public final void I() {
        U4(false);
    }

    public final int I3(int i7, Boolean bool) {
        if (this.g6 == null) {
            return i7;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.z0);
        int f10 = i0.a.f(0.5f, this.g6.m(org.telegram.ui.ActionBar.k6.I.q()), this.g6.n(org.telegram.ui.ActionBar.k6.I.q()));
        if (org.telegram.ui.ActionBar.k6.e1(w02)) {
            return org.telegram.ui.ActionBar.k6.D(org.telegram.ui.ActionBar.k6.I.q(), w02, f10, i7, (bool == null || bool.booleanValue()) ? f10 : org.telegram.ui.ActionBar.k6.r1(0.7f, f10));
        }
        return (bool == null || bool.booleanValue()) ? f10 : org.telegram.ui.ActionBar.k6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.k6.r1(0.7f, f10));
    }

    public final void I4() {
        org.telegram.ui.Components.zg0 zg0Var;
        if (this.d1 == 0) {
            M4();
            return;
        }
        if (this.q0 == null) {
            L4();
            return;
        }
        TLRPC.User a22 = org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(org.telegram.messenger.p10.i(this.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.p10.i(this.currentAccount).f();
        }
        if (a22 == null) {
            return;
        }
        org.telegram.ui.Components.j30 j30Var = this.q0;
        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
        j30Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new j90(this, 27), new q5(this, 13), 0);
        this.U.M(0);
        this.U.P(43);
        this.V.M(0);
        this.V.P(43);
        org.telegram.ui.Components.ef0 ef0Var = this.Z;
        if (ef0Var != null) {
            org.telegram.ui.Components.bf0 i7 = org.telegram.ui.Components.ef0.i(14, ef0Var.a);
            if (i7 != null && (zg0Var = i7.k) != null) {
                zg0Var.start();
            }
        } else {
            this.s.d();
        }
        org.telegram.ui.Cells.m8 m8Var = this.L2;
        if (m8Var != null) {
            m8Var.getImageView().d();
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
    public final void I5(boolean z9) {
        Object obj;
        boolean z10;
        CharSequence G;
        TLRPC.ChatParticipants chatParticipants;
        boolean z11;
        CharSequence charSequence;
        boolean l10;
        boolean z12;
        org.telegram.messenger.hc m10;
        org.telegram.messenger.hc m11;
        org.telegram.messenger.hc hcVar;
        org.telegram.messenger.hc hcVar2;
        org.telegram.messenger.hc hcVar3;
        View m12;
        TLRPC.Chat chat;
        org.telegram.messenger.hc hcVar4;
        int i7;
        TLRPC.VideoSize videoSize;
        org.telegram.ui.Components.d51 d51Var;
        org.telegram.messenger.hc hcVar5;
        TLRPC.User user;
        org.telegram.messenger.hc hcVar6;
        TLRPC.User user2;
        TLRPC.UserStatus userStatus;
        String str;
        boolean z13;
        org.telegram.ui.ActionBar.y4 y4Var;
        uw0 uw0Var;
        Drawable drawable;
        boolean z14;
        boolean z15;
        boolean z16;
        String str2;
        org.telegram.ui.Components.kg kgVar;
        String str3;
        String str4;
        TL_stars.Tl_starsRating tl_starsRating;
        String str5;
        TL_stars.Tl_starsRating tl_starsRating2;
        org.telegram.messenger.hc hcVar7;
        sv svVar;
        if (this.X == null || this.f == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var == null || q4Var.getFragmentStack().size() < 2) {
            obj = null;
        } else {
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            obj = f2Var instanceof org.telegram.ui.Components.kg ? f2Var : null;
            if ((f2Var instanceof ww) && (svVar = ((ww) f2Var).F3) != null) {
                zv zvVar = svVar.a;
                if (com.google.android.recaptcha.internal.a.u(zvVar)) {
                    obj = zvVar;
                }
            }
        }
        if (obj instanceof an) {
            an anVar = (an) obj;
            if (anVar.o1 != null && anVar.f4 == 8) {
                z10 = true;
                this.p5 = false;
                this.q5 = false;
                String str6 = "";
                if (this.d1 == 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.d1));
                    if (a22 == null) {
                        return;
                    }
                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                    boolean z17 = userProfilePhoto != null && userProfilePhoto.personal;
                    TLRPC.FileLocation fileLocation = userProfilePhoto != null ? userProfilePhoto.photo_big : null;
                    this.p0.r(a22);
                    org.telegram.messenger.fp fpVar = this.g6;
                    org.telegram.messenger.fp a10 = org.telegram.messenger.fp.a(a22.emoji_status);
                    this.g6 = a10;
                    if (a10 == null) {
                        int l11 = org.telegram.messenger.t10.l(a22);
                        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(this.currentAccount).r4;
                        this.g6 = gpVar == null ? null : gpVar.d(l11);
                    }
                    if (fpVar != this.g6) {
                        P5();
                    }
                    ww0 ww0Var = this.c1;
                    if (ww0Var != null) {
                        ww0Var.b(org.telegram.messenger.t10.m(a22), a22.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    org.telegram.ui.Components.lu0 lu0Var = this.S;
                    if (lu0Var != null) {
                        lu0Var.b.a(this.g6);
                        lu0Var.invalidate();
                    }
                    TLRPC.EmojiStatus emojiStatus = a22.emoji_status;
                    b5(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null);
                    org.telegram.messenger.hc m13 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.s0, 0, a22);
                    org.telegram.messenger.hc m14 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.s0, 1, a22);
                    org.telegram.messenger.hc m15 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.s0, 4, a22);
                    TLRPC.UserFull userFull = this.u2;
                    if (userFull != null) {
                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                        videoSize = org.telegram.messenger.w7.R((userProfilePhoto2 == null || !userProfilePhoto2.personal) ? userFull.profile_photo : userFull.personal_photo);
                        if (videoSize != null) {
                            d51Var = new org.telegram.ui.Components.d51(videoSize, a22.premium, 2);
                            org.telegram.messenger.hc C = this.n0.C(m14, m13);
                            if (this.H2 == null) {
                                this.n0.H(d51Var, m13, m14, z9);
                            }
                            if (this.I2 == null) {
                                if (videoSize != null) {
                                    this.e0.setImageDrawable(d51Var);
                                } else {
                                    if (m15 == null || a22.photo.personal) {
                                        user = a22;
                                        hcVar6 = m14;
                                        zu0 zu0Var = this.e0;
                                        zu0Var.a.u0(C, "g", m13, "100_100", hcVar6, "50_50", this.p0, 0L, null, user, 1);
                                        hcVar5 = m13;
                                        zu0Var.d();
                                    } else {
                                        this.e0.getImageReceiver().y1 = true;
                                        zu0 zu0Var2 = this.e0;
                                        user = a22;
                                        hcVar6 = m14;
                                        zu0Var2.a.u0(m15, "avatar", m13, "50_50", hcVar6, "50_50", this.p0, 0L, null, user, 1);
                                        zu0Var2.d();
                                        hcVar5 = m13;
                                    }
                                    if ((hcVar6 != null && this.N2 != -1) || (hcVar6 == null && this.N2 == -1)) {
                                        D5(false, false);
                                        y4(true);
                                    }
                                    if (hcVar5 != null || ((hcVar7 = this.B0) != null && hcVar5.s == hcVar7.s)) {
                                        user2 = user;
                                    } else {
                                        this.B0 = hcVar5;
                                        TLRPC.User user3 = user;
                                        getFileLoader().V(hcVar5, user3, null, 0, 1);
                                        user2 = user3;
                                    }
                                    CharSequence p10 = org.telegram.messenger.t10.p(user2);
                                    if (user2.id == getUserConfig().e()) {
                                        long j3 = user2.id;
                                        if (j3 == 489000) {
                                            str5 = org.telegram.messenger.hd.M0(2131743617, null);
                                        } else if (j3 == 333000 || j3 == 777000 || j3 == 42777) {
                                            str5 = org.telegram.messenger.hd.M0(2131745562, null);
                                        } else if (org.telegram.messenger.qp.F2(user2)) {
                                            str5 = org.telegram.messenger.hd.M0(2131744326, null);
                                        } else if (this.q2) {
                                            int i10 = user2.bot_active_users;
                                            str5 = i10 != 0 ? org.telegram.messenger.hd.H(',', "BotUsers", i10) : org.telegram.messenger.t10.d(user2);
                                        } else {
                                            boolean[] zArr = this.J0;
                                            zArr[0] = false;
                                            String d02 = org.telegram.messenger.hd.d0(this.currentAccount, user2, zArr, z17 ? new boolean[1] : null);
                                            boolean z18 = (zArr[0] || getUserConfig().q() || (userStatus = user2.status) == null || (!(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) || !userStatus.by_me) ? false : true;
                                            bv0 bv0Var = this.r;
                                            z13 = z18;
                                            str = d02;
                                            if (bv0Var != null) {
                                                z13 = z18;
                                                str = d02;
                                                if (!this.R5) {
                                                    int i11 = (zArr[0] && this.g6 == null) ? org.telegram.ui.ActionBar.k6.pi : org.telegram.ui.ActionBar.k6.B8;
                                                    bv0Var.setTag(Integer.valueOf(i11));
                                                    z13 = z18;
                                                    str = d02;
                                                    if (!this.o2) {
                                                        this.r.setTextColor(I3(org.telegram.ui.ActionBar.k6.w0(i11, this.z0), Boolean.valueOf(zArr[0])));
                                                        z13 = z18;
                                                        str = d02;
                                                    }
                                                }
                                            }
                                            TLRPC.UserProfilePhoto userProfilePhoto3 = user2.photo;
                                            this.q5 = userProfilePhoto3 == null && userProfilePhoto3.personal;
                                            p10 = org.telegram.messenger.i6.m(p10, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                            if (z10) {
                                                this.e0.setAnimateFromImageReceiver(((an) obj).o1.getAvatarImageView().getImageReceiver());
                                            }
                                            this.f.l(p10, false);
                                            y4Var = this.simpleActionBar;
                                            if (y4Var != null) {
                                                y4Var.setTitle(p10);
                                            }
                                            this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                                            this.r.setRightDrawableInside(true);
                                            bv0 bv0Var2 = this.r;
                                            if (z13) {
                                                if (this.y6 == null) {
                                                    uw0 uw0Var2 = new uw0(org.telegram.messenger.hd.M0(2131744891, null));
                                                    this.y6 = uw0Var2;
                                                    uw0Var2.setAlpha((int) (Math.min(1.0f, this.P1 / j4()) * 255.0f));
                                                    this.y6.a(i0.a.f(this.j2, org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.b(0.18f, -0.1f, this.b1)), 603979775));
                                                }
                                                uw0Var = this.y6;
                                            } else {
                                                uw0Var = null;
                                            }
                                            bv0Var2.i(uw0Var);
                                            this.r.setRightDrawableOnClick(z13 ? new zt0(this, 7) : null);
                                            if (this.C2 != null) {
                                                if (this.x == null) {
                                                    this.x = org.telegram.ui.ActionBar.k6.l4.getConstantState().newDrawable().mutate();
                                                }
                                                drawable = this.x;
                                            } else {
                                                drawable = null;
                                            }
                                            this.f.setRightDrawableOutside(false);
                                            z14 = user2.scam;
                                            if (!z14 || user2.fake) {
                                                ok okVar = this.f;
                                                int i12 = !z14 ? 1 : 0;
                                                if (this.K == null) {
                                                    org.telegram.ui.Components.gk0 gk0Var = new org.telegram.ui.Components.gk0(i12);
                                                    this.K = gk0Var;
                                                    gk0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, this.z0));
                                                }
                                                okVar.j(this.K);
                                                this.n = org.telegram.messenger.hd.M0(2131745863, null);
                                            } else if (user2.verified) {
                                                this.f.j(r4());
                                                this.n = org.telegram.messenger.hd.M0(2131754739, null);
                                            } else {
                                                this.f.j(null);
                                                this.n = null;
                                            }
                                            if (!org.telegram.messenger.qp.F2(user2) || org.telegram.messenger.m5.f(user2.emoji_status) == 0) {
                                                getMessagesController().getClass();
                                                if (org.telegram.messenger.qp.B2(user2)) {
                                                    this.f.i(i4(null, true));
                                                    this.h = org.telegram.messenger.hd.M0(2131754802, null);
                                                    z15 = true;
                                                    z16 = false;
                                                } else {
                                                    this.f.i(null);
                                                    this.h = null;
                                                    z15 = false;
                                                    z16 = false;
                                                }
                                            } else {
                                                this.f.i(i4(user2.emoji_status, true));
                                                this.h = org.telegram.messenger.hd.M0(2131754802, null);
                                                z16 = true;
                                                z15 = false;
                                            }
                                            if (drawable == null || this.C2 != null || user2.bot_verification_icon == 0) {
                                                this.f.setLeftDrawableOutside(false);
                                            } else {
                                                this.f.setLeftDrawableOutside(true);
                                                drawable = g4(user2.bot_verification_icon);
                                            }
                                            this.f.setLeftDrawable(drawable);
                                            if (!z16 || z15) {
                                                this.f.setRightDrawableOutside(true);
                                            }
                                            if (user2.self) {
                                                getMessagesController().getClass();
                                                if (org.telegram.messenger.qp.B2(user2)) {
                                                    this.f.setRightDrawableOnClick(new zt0(this, 8));
                                                }
                                            }
                                            if (!user2.self) {
                                                getMessagesController().getClass();
                                                if (org.telegram.messenger.qp.B2(user2)) {
                                                    ok okVar2 = this.f;
                                                    okVar2.setRightDrawableOnClick(new z(this, user2, okVar2, 14));
                                                }
                                            }
                                            if (this.d1 == org.telegram.messenger.p10.i(this.currentAccount).n) {
                                                if (this.p5) {
                                                    TLRPC.UserFull userFull2 = this.u2;
                                                    if (userFull2 == null || (tl_starsRating = userFull2.stars_rating) == null || tl_starsRating.stars >= 0) {
                                                        str3 = null;
                                                        str4 = org.telegram.messenger.hd.M0(2131747825, null);
                                                    } else {
                                                        str3 = null;
                                                        str4 = org.telegram.messenger.hd.M0(2131745174, null).toLowerCase(Locale.ROOT);
                                                    }
                                                } else {
                                                    str3 = null;
                                                    str4 = str;
                                                }
                                                this.s6 = org.telegram.messenger.hd.M0(2131750843, str3);
                                                str2 = str4;
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                                                spannableStringBuilder.append((CharSequence) " d ");
                                                TLRPC.UserProfilePhoto userProfilePhoto4 = user2.photo;
                                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0((userProfilePhoto4 != null && userProfilePhoto4.personal && userProfilePhoto4.has_video) ? 2131751688 : 2131751689, null));
                                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.fs(), str.length() + 1, str.length() + 2, 0);
                                                this.s6 = spannableStringBuilder;
                                                str2 = str;
                                            }
                                            this.r6 = str2;
                                            H5();
                                            kgVar = this.g5;
                                            if (kgVar != null) {
                                                kgVar.s();
                                            }
                                            this.e0.getImageReceiver().O0(PhotoViewer.N1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                                        }
                                    } else if (org.telegram.messenger.t10.q(this.u2)) {
                                        this.p5 = true;
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(this.u2.fallback_photo.sizes, 1000, false, null, false);
                                        str5 = str6;
                                        if (w10 != null) {
                                            this.r5.p0(org.telegram.messenger.hc.i(w10, this.u2.fallback_photo), "50_50", null, 0L, null, org.telegram.messenger.p10.i(this.currentAccount).f(), 0);
                                            str5 = str6;
                                        }
                                    } else {
                                        TLRPC.UserFull userFull3 = this.u2;
                                        str5 = (userFull3 == null || (tl_starsRating2 = userFull3.stars_rating) == null || tl_starsRating2.stars >= 0) ? org.telegram.messenger.hd.M0(2131747825, null) : org.telegram.messenger.hd.M0(2131745174, null).toLowerCase(Locale.ROOT);
                                    }
                                    z13 = false;
                                    str = str5;
                                    TLRPC.UserProfilePhoto userProfilePhoto32 = user2.photo;
                                    this.q5 = userProfilePhoto32 == null && userProfilePhoto32.personal;
                                    p10 = org.telegram.messenger.i6.m(p10, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                    if (z10) {
                                    }
                                    this.f.l(p10, false);
                                    y4Var = this.simpleActionBar;
                                    if (y4Var != null) {
                                    }
                                    this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                                    this.r.setRightDrawableInside(true);
                                    bv0 bv0Var22 = this.r;
                                    if (z13) {
                                    }
                                    bv0Var22.i(uw0Var);
                                    this.r.setRightDrawableOnClick(z13 ? new zt0(this, 7) : null);
                                    if (this.C2 != null) {
                                    }
                                    this.f.setRightDrawableOutside(false);
                                    z14 = user2.scam;
                                    if (z14) {
                                    }
                                    ok okVar3 = this.f;
                                    int i122 = !z14 ? 1 : 0;
                                    if (this.K == null) {
                                    }
                                    okVar3.j(this.K);
                                    this.n = org.telegram.messenger.hd.M0(2131745863, null);
                                    if (org.telegram.messenger.qp.F2(user2)) {
                                    }
                                    getMessagesController().getClass();
                                    if (org.telegram.messenger.qp.B2(user2)) {
                                    }
                                    if (drawable == null) {
                                    }
                                    this.f.setLeftDrawableOutside(false);
                                    this.f.setLeftDrawable(drawable);
                                    if (!z16) {
                                    }
                                    this.f.setRightDrawableOutside(true);
                                    if (user2.self) {
                                    }
                                    if (!user2.self) {
                                    }
                                    if (this.d1 == org.telegram.messenger.p10.i(this.currentAccount).n) {
                                    }
                                    this.r6 = str2;
                                    H5();
                                    kgVar = this.g5;
                                    if (kgVar != null) {
                                    }
                                    this.e0.getImageReceiver().O0(PhotoViewer.N1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                                }
                            }
                            hcVar5 = m13;
                            user = a22;
                            hcVar6 = m14;
                            if (hcVar6 != null) {
                                D5(false, false);
                                y4(true);
                                if (hcVar5 != null) {
                                }
                                user2 = user;
                                CharSequence p102 = org.telegram.messenger.t10.p(user2);
                                if (user2.id == getUserConfig().e()) {
                                }
                                z13 = false;
                                str = str5;
                                TLRPC.UserProfilePhoto userProfilePhoto322 = user2.photo;
                                this.q5 = userProfilePhoto322 == null && userProfilePhoto322.personal;
                                p102 = org.telegram.messenger.i6.m(p102, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                if (z10) {
                                }
                                this.f.l(p102, false);
                                y4Var = this.simpleActionBar;
                                if (y4Var != null) {
                                }
                                this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                                this.r.setRightDrawableInside(true);
                                bv0 bv0Var222 = this.r;
                                if (z13) {
                                }
                                bv0Var222.i(uw0Var);
                                this.r.setRightDrawableOnClick(z13 ? new zt0(this, 7) : null);
                                if (this.C2 != null) {
                                }
                                this.f.setRightDrawableOutside(false);
                                z14 = user2.scam;
                                if (z14) {
                                }
                                ok okVar32 = this.f;
                                int i1222 = !z14 ? 1 : 0;
                                if (this.K == null) {
                                }
                                okVar32.j(this.K);
                                this.n = org.telegram.messenger.hd.M0(2131745863, null);
                                if (org.telegram.messenger.qp.F2(user2)) {
                                }
                                getMessagesController().getClass();
                                if (org.telegram.messenger.qp.B2(user2)) {
                                }
                                if (drawable == null) {
                                }
                                this.f.setLeftDrawableOutside(false);
                                this.f.setLeftDrawable(drawable);
                                if (!z16) {
                                }
                                this.f.setRightDrawableOutside(true);
                                if (user2.self) {
                                }
                                if (!user2.self) {
                                }
                                if (this.d1 == org.telegram.messenger.p10.i(this.currentAccount).n) {
                                }
                                this.r6 = str2;
                                H5();
                                kgVar = this.g5;
                                if (kgVar != null) {
                                }
                                this.e0.getImageReceiver().O0(PhotoViewer.N1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                            }
                            D5(false, false);
                            y4(true);
                            if (hcVar5 != null) {
                            }
                            user2 = user;
                            CharSequence p1022 = org.telegram.messenger.t10.p(user2);
                            if (user2.id == getUserConfig().e()) {
                            }
                            z13 = false;
                            str = str5;
                            TLRPC.UserProfilePhoto userProfilePhoto3222 = user2.photo;
                            this.q5 = userProfilePhoto3222 == null && userProfilePhoto3222.personal;
                            p1022 = org.telegram.messenger.i6.m(p1022, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                            if (z10) {
                            }
                            this.f.l(p1022, false);
                            y4Var = this.simpleActionBar;
                            if (y4Var != null) {
                            }
                            this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                            this.r.setRightDrawableInside(true);
                            bv0 bv0Var2222 = this.r;
                            if (z13) {
                            }
                            bv0Var2222.i(uw0Var);
                            this.r.setRightDrawableOnClick(z13 ? new zt0(this, 7) : null);
                            if (this.C2 != null) {
                            }
                            this.f.setRightDrawableOutside(false);
                            z14 = user2.scam;
                            if (z14) {
                            }
                            ok okVar322 = this.f;
                            int i12222 = !z14 ? 1 : 0;
                            if (this.K == null) {
                            }
                            okVar322.j(this.K);
                            this.n = org.telegram.messenger.hd.M0(2131745863, null);
                            if (org.telegram.messenger.qp.F2(user2)) {
                            }
                            getMessagesController().getClass();
                            if (org.telegram.messenger.qp.B2(user2)) {
                            }
                            if (drawable == null) {
                            }
                            this.f.setLeftDrawableOutside(false);
                            this.f.setLeftDrawable(drawable);
                            if (!z16) {
                            }
                            this.f.setRightDrawableOutside(true);
                            if (user2.self) {
                            }
                            if (!user2.self) {
                            }
                            if (this.d1 == org.telegram.messenger.p10.i(this.currentAccount).n) {
                            }
                            this.r6 = str2;
                            H5();
                            kgVar = this.g5;
                            if (kgVar != null) {
                            }
                            this.e0.getImageReceiver().O0(PhotoViewer.N1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                        }
                    } else {
                        videoSize = null;
                    }
                    d51Var = null;
                    org.telegram.messenger.hc C2 = this.n0.C(m14, m13);
                    if (this.H2 == null) {
                    }
                    if (this.I2 == null) {
                    }
                    hcVar5 = m13;
                    user = a22;
                    hcVar6 = m14;
                    if (hcVar6 != null) {
                    }
                    D5(false, false);
                    y4(true);
                    if (hcVar5 != null) {
                    }
                    user2 = user;
                    CharSequence p10222 = org.telegram.messenger.t10.p(user2);
                    if (user2.id == getUserConfig().e()) {
                    }
                    z13 = false;
                    str = str5;
                    TLRPC.UserProfilePhoto userProfilePhoto32222 = user2.photo;
                    this.q5 = userProfilePhoto32222 == null && userProfilePhoto32222.personal;
                    p10222 = org.telegram.messenger.i6.m(p10222, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                    if (z10) {
                    }
                    this.f.l(p10222, false);
                    y4Var = this.simpleActionBar;
                    if (y4Var != null) {
                    }
                    this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                    this.r.setRightDrawableInside(true);
                    bv0 bv0Var22222 = this.r;
                    if (z13) {
                    }
                    bv0Var22222.i(uw0Var);
                    this.r.setRightDrawableOnClick(z13 ? new zt0(this, 7) : null);
                    if (this.C2 != null) {
                    }
                    this.f.setRightDrawableOutside(false);
                    z14 = user2.scam;
                    if (z14) {
                    }
                    ok okVar3222 = this.f;
                    int i122222 = !z14 ? 1 : 0;
                    if (this.K == null) {
                    }
                    okVar3222.j(this.K);
                    this.n = org.telegram.messenger.hd.M0(2131745863, null);
                    if (org.telegram.messenger.qp.F2(user2)) {
                    }
                    getMessagesController().getClass();
                    if (org.telegram.messenger.qp.B2(user2)) {
                    }
                    if (drawable == null) {
                    }
                    this.f.setLeftDrawableOutside(false);
                    this.f.setLeftDrawable(drawable);
                    if (!z16) {
                    }
                    this.f.setRightDrawableOutside(true);
                    if (user2.self) {
                    }
                    if (!user2.self) {
                    }
                    if (this.d1 == org.telegram.messenger.p10.i(this.currentAccount).n) {
                    }
                    this.r6 = str2;
                    H5();
                    kgVar = this.g5;
                    if (kgVar != null) {
                    }
                    this.e0.getImageReceiver().O0(PhotoViewer.N1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                } else if (this.e1 != 0) {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.e1));
                    if (M0 != null) {
                        this.D2 = M0;
                    } else {
                        M0 = this.D2;
                    }
                    TLRPC.Chat chat2 = M0;
                    org.telegram.messenger.n6 n6Var = this.W1;
                    if (n6Var != null) {
                        n6Var.g();
                    }
                    org.telegram.messenger.fp fpVar2 = this.g6;
                    org.telegram.messenger.fp a11 = org.telegram.messenger.fp.a(chat2.emoji_status);
                    this.g6 = a11;
                    if (a11 == null) {
                        int I = org.telegram.messenger.t3.I(chat2);
                        org.telegram.messenger.gp gpVar2 = org.telegram.messenger.qp.s1(this.currentAccount).r4;
                        this.g6 = gpVar2 == null ? null : gpVar2.d(I);
                    }
                    if (fpVar2 != this.g6) {
                        P5();
                    }
                    ww0 ww0Var2 = this.c1;
                    if (ww0Var2 != null) {
                        ww0Var2.b(org.telegram.messenger.t3.J(chat2), chat2.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    TLRPC.EmojiStatus emojiStatus2 = chat2.emoji_status;
                    b5(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null);
                    TLRPC.TL_forumTopic f10 = this.p1 ? getMessagesController().q7.f(this.e1, this.f1) : null;
                    if (org.telegram.messenger.t3.T(chat2)) {
                        if (!this.p1) {
                            TLRPC.ChatFull chatFull = this.t2;
                            if (chatFull != null) {
                                TLRPC.Chat chat3 = this.D2;
                                if (!chat3.megagroup) {
                                    if (chatFull.participants_count != 0) {
                                        if (!org.telegram.messenger.t3.N(chat3)) {
                                        }
                                    }
                                }
                            }
                            G = this.D2.megagroup ? org.telegram.messenger.hd.M0(2131748778, null).toLowerCase() : org.telegram.messenger.t3.t0(chat2) ? org.telegram.messenger.hd.M0(2131752318, null).toLowerCase() : org.telegram.messenger.hd.M0(2131752329, null).toLowerCase();
                        }
                        if (this.p1) {
                            int i13 = f10 != null ? f10.totalMessagesCount - 1 : 0;
                            if (i13 > 0) {
                                org.telegram.messenger.hd.G(i13, "messages", Integer.valueOf(i13));
                            } else {
                                org.telegram.messenger.hd.a0("TopicProfileStatus", null, 2131744011, chat2.title);
                            }
                            SpannableString spannableString = new SpannableString(">");
                            spannableString.setSpan(new org.telegram.ui.Components.wp(R.drawable.arrow_newchat, 0), 0, 1, 33);
                            G = new SpannableStringBuilder(chat2.title).append(' ').append((CharSequence) spannableString);
                            z11 = true;
                            if (z10) {
                                an anVar2 = (an) obj;
                                if (anVar2.o1.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.k5) {
                                    ((org.telegram.ui.ActionBar.k5) anVar2.o1.getSubtitleTextView()).getText();
                                } else if (anVar2.o1.getSubtitleTextView() instanceof org.telegram.ui.Components.j6) {
                                    ((org.telegram.ui.Components.j6) anVar2.o1.getSubtitleTextView()).getText();
                                }
                                this.e0.setAnimateFromImageReceiver(anVar2.o1.getAvatarImageView().getImageReceiver());
                            }
                            charSequence = str6;
                            if (this.p1) {
                                if (org.telegram.messenger.t3.p0(chat2)) {
                                    charSequence = org.telegram.messenger.hd.M0(2131752219, null);
                                } else {
                                    String str7 = chat2.title;
                                    charSequence = str7;
                                    if (str7 == null) {
                                        charSequence = null;
                                    }
                                }
                            } else if (f10 != null) {
                                charSequence = f10.title;
                            }
                            if (charSequence == null) {
                                try {
                                    charSequence = org.telegram.messenger.i6.m(charSequence, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                } catch (Exception unused) {
                                }
                                l10 = this.f.l(charSequence, false);
                                org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
                                if (y4Var2 != null) {
                                    y4Var2.setTitle(charSequence);
                                }
                            } else {
                                l10 = false;
                            }
                            this.f.setLeftDrawableOutside(false);
                            this.f.setLeftDrawable((Drawable) null);
                            this.f.setRightDrawableOutside(false);
                            this.f.setRightDrawableOnClick(null);
                            this.n = null;
                            z12 = chat2.scam;
                            if (!z12 || chat2.fake) {
                                ok okVar4 = this.f;
                                int i14 = !z12 ? 1 : 0;
                                if (this.K == null) {
                                    org.telegram.ui.Components.gk0 gk0Var2 = new org.telegram.ui.Components.gk0(i14);
                                    this.K = gk0Var2;
                                    gk0Var2.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, this.z0));
                                }
                                okVar4.j(this.K);
                                this.h = org.telegram.messenger.hd.M0(2131745863, null);
                            } else if (chat2.verified) {
                                this.f.j(r4());
                                this.h = org.telegram.messenger.hd.M0(2131754739, null);
                            } else {
                                this.f.j(null);
                                this.h = null;
                            }
                            if (org.telegram.messenger.m5.f(chat2.emoji_status) == 0) {
                                this.f.i(i4(chat2.emoji_status, false));
                                this.f.setRightDrawableOutside(true);
                                this.h = null;
                                if (org.telegram.messenger.t3.w(1, chat2)) {
                                    this.f.setRightDrawableOnClick(new zt0(this, 9));
                                    if (this.R) {
                                        this.R = true;
                                        getMediaDataController().Y0();
                                    }
                                } else {
                                    TLRPC.EmojiStatus emojiStatus3 = chat2.emoji_status;
                                    if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                                        this.f.setRightDrawableOnClick(new iu0(this, ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug, r8 ? 1 : 0));
                                    }
                                }
                            } else {
                                this.f.i(null);
                            }
                            if (chat2.bot_verification_icon == 0) {
                                this.f.setLeftDrawableOutside(true);
                                this.f.setLeftDrawable(g4(chat2.bot_verification_icon));
                            } else {
                                this.f.setLeftDrawable((Drawable) null);
                            }
                            if (org.telegram.messenger.t3.d0(this.currentAccount, this.h1)) {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) "* ");
                                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wp(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
                                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131751926, null));
                                spannableStringBuilder2.append((CharSequence) " * ");
                                int length = spannableStringBuilder2.length();
                                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.fs(), length - 2, length - 1, 33);
                                spannableStringBuilder2.append(G);
                                G = spannableStringBuilder2;
                            }
                            this.r6 = G;
                            this.s6 = null;
                            H5();
                            if (this.p1) {
                                if (z11) {
                                    this.r.setOnClickListener(new zt0(this, 10));
                                } else {
                                    this.r.setOnClickListener(null);
                                    this.r.setClickable(false);
                                }
                            }
                            if (l10) {
                                y4(true);
                            }
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            TLRPC.FileLocation fileLocation2 = (chatPhoto != null || this.p1) ? null : chatPhoto.photo_big;
                            if (this.p1) {
                                if (org.telegram.messenger.t3.p0(this.D2)) {
                                    TLRPC.Chat v12 = getMessagesController().v1(this.D2.id);
                                    this.p0.q(v12);
                                    m10 = org.telegram.messenger.hc.m(this.currentAccount, 0, v12);
                                    m11 = org.telegram.messenger.hc.m(this.currentAccount, 1, v12);
                                    hcVar2 = this.n0.C(m11, m10);
                                } else {
                                    this.p0.q(chat2);
                                    m10 = org.telegram.messenger.hc.m(this.currentAccount, 0, chat2);
                                    m11 = org.telegram.messenger.hc.m(this.currentAccount, 1, chat2);
                                    av0 av0Var = this.n0;
                                    if (av0Var != null) {
                                        hcVar2 = av0Var.C(m11, m10);
                                    } else {
                                        hcVar = m10;
                                        hcVar2 = null;
                                        hcVar3 = m11;
                                    }
                                }
                                hcVar = m10;
                                hcVar3 = m11;
                            } else {
                                qg.d.p(this.e0, f10, true, true, this.z0);
                                hcVar2 = null;
                                hcVar = null;
                                hcVar3 = null;
                            }
                            boolean H = this.n0.H(null, hcVar, hcVar3, z9);
                            if ((hcVar != null || H) && this.o2 && (m12 = this.c.m(0)) != null) {
                                this.a.w0(0, m12.getTop() - j4(), org.telegram.ui.Components.xq.h);
                            }
                            String str8 = (hcVar2 == null && hcVar2.p == 2) ? "g" : null;
                            if (this.I2 == null || this.p1) {
                                chat = chat2;
                            } else {
                                chat = chat2;
                                this.e0.m(hcVar2, str8, hcVar3, "50_50", this.p0, chat);
                            }
                            if (hcVar != null && ((hcVar4 = this.B0) == null || hcVar.s != hcVar4.s)) {
                                this.B0 = hcVar;
                                getFileLoader().V(hcVar, chat, null, 0, 1);
                            }
                            this.e0.getImageReceiver().O0(PhotoViewer.N1(fileLocation2) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                        } else if (!this.D2.megagroup) {
                            org.telegram.messenger.hd.S(new int[1], this.t2.participants_count);
                            if (this.D2.megagroup) {
                                org.telegram.messenger.hd.G(this.t2.participants_count, "Members", new Object[0]);
                                G = org.telegram.messenger.hd.H(',', "Members", this.t2.participants_count);
                            } else {
                                org.telegram.messenger.hd.G(this.t2.participants_count, "Subscribers", new Object[0]);
                                G = org.telegram.messenger.hd.H(',', "Subscribers", this.t2.participants_count);
                            }
                        } else if (this.A2 <= 1 || (i7 = this.t2.participants_count) == 0) {
                            int i15 = this.t2.participants_count;
                            if (i15 == 0) {
                                G = chat2.has_geo ? org.telegram.messenger.hd.M0(2131748641, null).toLowerCase() : org.telegram.messenger.t3.t0(chat2) ? org.telegram.messenger.hd.M0(2131748637, null).toLowerCase() : org.telegram.messenger.hd.M0(2131748640, null).toLowerCase();
                            } else {
                                org.telegram.messenger.hd.G(i15, "Members", new Object[0]);
                                G = org.telegram.messenger.hd.H(',', "Members", this.t2.participants_count);
                            }
                        } else {
                            org.telegram.messenger.hd.G(i7, "Members", new Object[0]);
                            org.telegram.messenger.hd.G(Math.min(this.A2, this.t2.participants_count), "OnlineCount", new Object[0]);
                            G = a8.p0.D(org.telegram.messenger.hd.H(',', "Members", this.t2.participants_count), ", ", org.telegram.messenger.hd.H(',', "OnlineCount", Math.min(this.A2, this.t2.participants_count)));
                        }
                    } else if (org.telegram.messenger.t3.k0(chat2)) {
                        G = org.telegram.messenger.hd.M0(2131742830, null);
                    } else if (org.telegram.messenger.t3.l0(chat2)) {
                        G = org.telegram.messenger.hd.M0(2131742836, null);
                    } else {
                        int i16 = chat2.participants_count;
                        TLRPC.ChatFull chatFull2 = this.t2;
                        if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                            i16 = chatParticipants.participants.size();
                        }
                        G = (i16 == 0 || this.A2 <= 1) ? org.telegram.messenger.hd.G(i16, "Members", new Object[0]) : a8.p0.D(org.telegram.messenger.hd.G(i16, "Members", new Object[0]), ", ", org.telegram.messenger.hd.G(this.A2, "OnlineCount", new Object[0]));
                    }
                    z11 = false;
                    if (z10) {
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
                    z12 = chat2.scam;
                    if (z12) {
                    }
                    ok okVar42 = this.f;
                    int i142 = !z12 ? 1 : 0;
                    if (this.K == null) {
                    }
                    okVar42.j(this.K);
                    this.h = org.telegram.messenger.hd.M0(2131745863, null);
                    if (org.telegram.messenger.m5.f(chat2.emoji_status) == 0) {
                    }
                    if (chat2.bot_verification_icon == 0) {
                    }
                    if (org.telegram.messenger.t3.d0(this.currentAccount, this.h1)) {
                    }
                    this.r6 = G;
                    this.s6 = null;
                    H5();
                    if (this.p1) {
                    }
                    if (l10) {
                    }
                    TLRPC.ChatPhoto chatPhoto2 = chat2.photo;
                    if (chatPhoto2 != null) {
                    }
                    if (this.p1) {
                    }
                    boolean H2 = this.n0.H(null, hcVar, hcVar3, z9);
                    if (hcVar != null) {
                    }
                    this.a.w0(0, m12.getTop() - j4(), org.telegram.ui.Components.xq.h);
                    if (hcVar2 == null) {
                    }
                    if (this.I2 == null) {
                    }
                    chat = chat2;
                    if (hcVar != null) {
                        this.B0 = hcVar;
                        getFileLoader().V(hcVar, chat, null, 0, 1);
                    }
                    this.e0.getImageReceiver().O0(PhotoViewer.N1(fileLocation2) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                }
                y4(true);
            }
        }
        z10 = false;
        this.p5 = false;
        this.q5 = false;
        String str62 = "";
        if (this.d1 == 0) {
        }
        y4(true);
    }

    public final void J3() {
        int f10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || this.f == null || this.c1 == null || this.S0 == null || this.P0 == null || this.Q0 == null || this.R0 == null || this.o0 == null) {
            return;
        }
        Float valueOf = Float.valueOf(this.Q5);
        fv0 fv0Var = this.S5;
        fv0Var.getClass();
        fv0Var.a(kVar, valueOf);
        if (this.Q5 > 0.0f || this.j2 <= 0.0f) {
            return;
        }
        ok okVar = this.f;
        int i7 = -1;
        if (this.g6 != null) {
            f10 = -1;
        } else {
            f10 = i0.a.f(this.j2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ji, this.z0), -1);
        }
        okVar.setTextColor(f10);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (this.g6 == null) {
            i7 = i0.a.f(this.j2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.z0), -1);
        }
        kVar2.D(i7, false);
    }

    public final void J4() {
        Bundle k10 = a8.p0.k("addToGroup", true);
        k10.putLong("chatId", this.D2.id);
        w40 w40Var = new w40(k10);
        TLRPC.ChatFull chatFull = this.t2;
        w40Var.I = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i7 = 0; i7 < this.t2.participants.participants.size(); i7++) {
                hVar.k(null, this.t2.participants.participants.get(i7).user_id);
            }
            w40Var.J = hVar;
        }
        w40Var.y = new tt0(this, 0);
        presentFragment(w40Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0200, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationToBeDeprecated) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0b39, code lost:
    
        if ((j4() + (r2 + r3)) < r18.a.getMeasuredHeight()) goto L671;
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
    public final void J5() {
        boolean z9;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatParticipants chatParticipants2;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull4;
        int i7;
        qu0 qu0Var;
        org.telegram.ui.Components.ef0 ef0Var;
        org.telegram.ui.Components.zf0 zf0Var;
        int i10;
        long j3;
        boolean z10;
        TLRPC.UserFull userFull;
        boolean z11;
        TLRPC.UserFull userFull2;
        TL_payments.starRefProgram starrefprogram;
        org.telegram.ui.Cells.e6 e6Var;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull5;
        TLRPC.UserFull userFull4;
        TLRPC.ChatFull chatFull6;
        TLRPC.UserFull userFull5;
        TL_bots.BotInfo botInfo;
        TLRPC.UserFull userFull6;
        TLRPC.UserFull userFull7;
        F5(false);
        int i11 = this.M2;
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
        boolean z12 = true;
        this.I4 = (this.d1 == 0 || (userFull7 = this.u2) == null || userFull7.wallet_card == null || (this.q0 != null && !this.r1)) ? false : true;
        this.K4 = -1;
        this.L4 = -1;
        this.M4 = -1;
        ArrayList arrayList2 = this.Q4;
        arrayList2.clear();
        ArrayList arrayList3 = this.R4;
        arrayList3.clear();
        org.telegram.ui.Components.ps0 ps0Var = this.Q;
        if (ps0Var != null) {
            int[] iArr = ps0Var.c;
            int i12 = 0;
            while (true) {
                if (i12 >= iArr.length) {
                    z9 = false;
                    break;
                } else {
                    if (iArr[i12] > 0) {
                        z9 = true;
                        break;
                    }
                    i12++;
                }
            }
            if (!z9) {
                z9 = this.Q.f;
            }
            if (!z9) {
                this.Q.getClass();
            }
            if (!z9 && (userFull6 = this.u2) != null) {
                z9 = userFull6.stories_pinned_available;
            }
            if (!z9 && (userFull5 = this.u2) != null && (botInfo = userFull5.bot_info) != null) {
                z9 = botInfo.has_preview_medias;
            }
            if (!z9 && (((userFull4 = this.u2) != null && userFull4.stargifts_count > 0) || ((chatFull6 = this.t2) != null && chatFull6.stargifts_count > 0))) {
                z9 = true;
            }
            if (!z9 && (chatFull5 = this.t2) != null) {
                z9 = chatFull5.stories_pinned_available;
            }
            if (!z9) {
                long j10 = this.e1;
                if (j10 != 0) {
                    org.telegram.messenger.ro L0 = org.telegram.messenger.qp.s1(this.currentAccount).L0(-j10);
                    if (L0 != null) {
                    }
                }
                if (this.q2) {
                    long j11 = this.d1;
                    if (j11 != 0) {
                        org.telegram.messenger.ro L02 = org.telegram.messenger.qp.s1(this.currentAccount).L0(j11);
                        if (L02 != null) {
                        }
                    }
                }
            }
            if (this.d1 == 0) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.d1));
                TLRPC.UserFull userFull8 = this.u2;
                if (userFull8 != null && userFull8.saved_music != null && (this.q0 == null || this.r1)) {
                    this.H4 = true;
                }
                if (this.z3 < 0 && this.A3 < 0) {
                    if (this.H4 || this.I4 || this.g6 != null || this.Z == null) {
                        int i13 = this.M2;
                        this.M2 = i13 + 1;
                        this.A3 = i13;
                    } else {
                        int i14 = this.M2;
                        this.M2 = i14 + 1;
                        this.z3 = i14;
                    }
                }
                if (!org.telegram.messenger.t10.B(a22) || this.r1) {
                    String n10 = org.telegram.messenger.t10.n(a22);
                    TLRPC.UserFull userFull9 = this.u2;
                    boolean z13 = ((userFull9 == null || TextUtils.isEmpty(userFull9.about)) && (a22 == null || TextUtils.isEmpty(n10))) ? false : true;
                    boolean z14 = (a22 == null || (TextUtils.isEmpty(a22.phone) && TextUtils.isEmpty(this.d5))) ? false : true;
                    if (!this.q2 && (userFull3 = this.u2) != null && userFull3.unofficial_security_risk) {
                        int i15 = this.M2;
                        this.i4 = i15;
                        this.M2 = i15 + 2;
                        this.j4 = i15 + 1;
                    }
                    TLRPC.UserFull userFull10 = this.u2;
                    if (userFull10 == null || (userFull10.flags2 & 64) == 0 || ((e6Var = this.v2) != null && e6Var.c && e6Var.d.isEmpty())) {
                        j3 = 0;
                    } else {
                        j3 = 0;
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.u2.personal_channel_id));
                        if (M0 != null && (org.telegram.messenger.t3.t0(M0) || !org.telegram.messenger.t3.r0(M0))) {
                            int i16 = this.M2;
                            this.P2 = i16;
                            this.M2 = i16 + 2;
                            this.Q2 = i16 + 1;
                        }
                    }
                    if (!this.q2 && (z14 || !z13)) {
                        int i17 = this.M2;
                        this.M2 = i17 + 1;
                        this.F3 = i17;
                    }
                    TLRPC.UserFull userFull11 = this.u2;
                    if (userFull11 != null && !TextUtils.isEmpty(userFull11.about)) {
                        int i18 = this.M2;
                        this.M2 = i18 + 1;
                        this.I3 = i18;
                    }
                    if (a22 != null && n10 != null) {
                        int i19 = this.M2;
                        this.M2 = i19 + 1;
                        this.K3 = i19;
                    }
                    TLRPC.UserFull userFull12 = this.u2;
                    if (userFull12 != null) {
                        if (userFull12.birthday != null) {
                            int i20 = this.M2;
                            this.M2 = i20 + 1;
                            this.T2 = i20;
                        }
                        if (userFull12.business_work_hours != null) {
                            int i21 = this.M2;
                            this.M2 = i21 + 1;
                            this.N3 = i21;
                        }
                        if (userFull12.business_location != null) {
                            int i22 = this.M2;
                            this.M2 = i22 + 1;
                            this.O3 = i22;
                        }
                        if (userFull12.note != null) {
                            int i23 = this.M2;
                            this.M2 = i23 + 1;
                            this.G3 = i23;
                        }
                    }
                    if (this.Z == null && this.d1 != getUserConfig().e()) {
                        int i24 = this.M2;
                        this.M2 = i24 + 1;
                        this.M3 = i24;
                    }
                    boolean z15 = this.q2;
                    if (z15 && a22 != null && a22.bot_has_main_app) {
                        int i25 = this.M2;
                        this.M2 = i25 + 1;
                        this.h4 = i25;
                    }
                    int i26 = this.M2;
                    int i27 = i26 + 1;
                    this.M2 = i27;
                    this.Q3 = i26;
                    if (a22 != null && a22.linked_community_id != j3) {
                        this.k4 = i27;
                        this.M2 = i26 + 3;
                        this.l4 = i26 + 2;
                    }
                    if (z15 && (userFull2 = this.u2) != null && (starrefprogram = userFull2.starref_program) != null && (starrefprogram.flags & 2) == 0 && getMessagesController().g6) {
                        int i28 = this.M2;
                        this.R3 = i28;
                        this.M2 = i28 + 2;
                        this.S3 = i28 + 1;
                    }
                    if (this.q2) {
                        if (this.r2 == null && getContext() != null) {
                            this.r2 = hi.r0.e(getContext(), this.currentAccount, this.d1);
                        }
                        if (this.s2 == null && getContext() != null) {
                            this.s2 = hi.p.c(getContext(), this.currentAccount, this.d1);
                        }
                        hi.r0 r0Var = this.r2;
                        boolean z16 = r0Var != null && r0Var.b();
                        hi.p pVar = this.s2;
                        boolean z17 = pVar != null && pVar.a();
                        TLRPC.UserFull userFull13 = this.u2;
                        if (userFull13 == null || !userFull13.bot_can_manage_emoji_status) {
                            if (!hi.o4.d((Activity) getContext(), this.currentAccount, this.d1)) {
                                z11 = false;
                                if (!z11 || z16 || z17) {
                                    int i29 = this.M2;
                                    int i30 = i29 + 1;
                                    this.M2 = i30;
                                    this.m4 = i29;
                                    if (z11) {
                                        this.M2 = i29 + 2;
                                        this.botPermissionEmojiStatus = i30;
                                    }
                                    if (z16) {
                                        int i31 = this.M2;
                                        this.M2 = i31 + 1;
                                        this.botPermissionLocation = i31;
                                    }
                                    if (z17) {
                                        int i32 = this.M2;
                                        this.M2 = i32 + 1;
                                        this.botPermissionBiometry = i32;
                                    }
                                    int i33 = this.M2;
                                    this.M2 = i33 + 1;
                                    this.o4 = i33;
                                }
                            }
                        }
                        z11 = true;
                        if (!z11) {
                        }
                        int i292 = this.M2;
                        int i302 = i292 + 1;
                        this.M2 = i302;
                        this.m4 = i292;
                        if (z11) {
                        }
                        if (z16) {
                        }
                        if (z17) {
                        }
                        int i332 = this.M2;
                        this.M2 = i332 + 1;
                        this.o4 = i332;
                    }
                    TLRPC.EncryptedChat encryptedChat = this.C2;
                    if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                        int i34 = this.M2;
                        this.p4 = i34;
                        this.q4 = i34 + 1;
                        this.M2 = i34 + 3;
                        this.r4 = i34 + 2;
                    }
                    if (a22 != null && !this.q2 && encryptedChat == null && a22.id != getUserConfig().e() && this.j1) {
                        int i35 = this.M2;
                        this.K4 = i35;
                        this.M2 = i35 + 2;
                        this.M4 = i35 + 1;
                    }
                    if (a22 != null && a22.bot) {
                        TLRPC.UserFull userFull14 = this.u2;
                        if (userFull14 != null && userFull14.can_view_revenue && bi.n0.g(this.currentAccount).i(this.d1) > j3) {
                            int i36 = this.M2;
                            this.M2 = i36 + 1;
                            this.B4 = i36;
                        }
                        if (bi.n0.g(this.currentAccount).c(this.d1).amount > j3 || !bi.n0.g(this.currentAccount).k(this.d1).a[0].isEmpty()) {
                            int i37 = this.M2;
                            this.M2 = i37 + 1;
                            this.A4 = i37;
                        }
                    }
                    if (a22 != null && this.q2 && !a22.bot_nochats) {
                        int i38 = this.M2;
                        this.Z3 = i38;
                        this.M2 = i38 + 2;
                        this.a4 = i38 + 1;
                    } else if (this.A4 >= 0) {
                        z10 = true;
                        if (!this.r1 && this.c5 && a22 != null && !a22.contact && !a22.bot && !org.telegram.messenger.t10.A(a22.id)) {
                            int i39 = this.M2;
                            this.M2 = i39 + 1;
                            this.Y3 = i39;
                            z10 = true;
                        }
                        if (!this.r1 && this.Z4 != 0 && this.a5 < j3 && org.telegram.messenger.t3.y(13, getMessagesController().M0(Long.valueOf(-this.a5)))) {
                            int i40 = this.M2;
                            this.M2 = i40 + 1;
                            this.V3 = i40;
                            z10 = true;
                        }
                        if (!this.r1 || this.Z4 == 0 || org.telegram.messenger.g5.r(this.currentAccount).x(this.d1)) {
                            z12 = z10;
                        } else {
                            int i41 = this.M2;
                            this.M2 = i41 + 1;
                            this.W3 = i41;
                        }
                        if (z12) {
                            int i42 = this.M2;
                            this.M2 = i42 + 1;
                            this.X3 = i42;
                        }
                        if (!z9 || ((a22 != null && a22.bot && a22.bot_can_edit && a22.bot_has_main_app) || (!((userFull = this.u2) == null || userFull.common_chats_count == 0) || this.r1))) {
                            int i43 = this.M2;
                            this.M2 = i43 + 1;
                            this.J4 = i43;
                        } else if (this.M4 == -1 && this.n1) {
                            int i44 = this.M2;
                            this.T3 = i44;
                            this.M2 = i44 + 2;
                            this.M4 = i44 + 1;
                        }
                    }
                    z10 = false;
                    if (!this.r1) {
                        int i392 = this.M2;
                        this.M2 = i392 + 1;
                        this.Y3 = i392;
                        z10 = true;
                    }
                    if (!this.r1) {
                        int i402 = this.M2;
                        this.M2 = i402 + 1;
                        this.V3 = i402;
                        z10 = true;
                    }
                    if (this.r1) {
                    }
                    z12 = z10;
                    if (z12) {
                    }
                    if (z9) {
                    }
                    int i432 = this.M2;
                    this.M2 = i432 + 1;
                    this.J4 = i432;
                } else {
                    if (this.I2 == null) {
                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                        if (userProfilePhoto != null) {
                            TLRPC.FileLocation fileLocation = userProfilePhoto.photo_big;
                            if (!(fileLocation instanceof TLRPC.TL_fileLocation_layer97)) {
                            }
                        }
                        av0 av0Var = this.n0;
                        if (av0Var == null || av0Var.getRealCount() == 0) {
                            int i45 = this.M2;
                            this.N2 = i45;
                            this.M2 = i45 + 2;
                            this.O2 = i45 + 1;
                        }
                    }
                    int i46 = this.M2;
                    this.R2 = i46;
                    this.S2 = i46 + 1;
                    this.U2 = i46 + 2;
                    this.V2 = i46 + 3;
                    this.M2 = i46 + 5;
                    this.c3 = i46 + 4;
                    Set set = getMessagesController().S3;
                    if (set.contains("PREMIUM_GRACE")) {
                        int i47 = this.M2;
                        this.X2 = i47;
                        this.M2 = i47 + 2;
                        this.Y2 = i47 + 1;
                    } else if (set.contains("VALIDATE_PHONE_NUMBER")) {
                        int i48 = this.M2;
                        this.Z2 = i48;
                        this.M2 = i48 + 2;
                        this.W2 = i48 + 1;
                    } else if (set.contains("VALIDATE_PASSWORD")) {
                        int i49 = this.M2;
                        this.b3 = i49;
                        this.M2 = i49 + 2;
                        this.a3 = i49 + 1;
                    }
                    int i50 = this.M2;
                    this.d3 = i50;
                    this.i3 = i50 + 1;
                    this.g3 = i50 + 2;
                    this.e3 = i50 + 3;
                    this.h3 = i50 + 4;
                    this.M2 = i50 + 6;
                    this.k3 = i50 + 5;
                    if (getMessagesController().E3 || !getMessagesController().P0.isEmpty()) {
                        int i51 = this.M2;
                        this.M2 = i51 + 1;
                        this.j3 = i51;
                    }
                    int i52 = this.M2;
                    this.m3 = i52;
                    this.f3 = i52 + 1;
                    this.M2 = i52 + 3;
                    this.n3 = i52 + 2;
                    if (!getMessagesController().D3()) {
                        int i53 = this.M2;
                        this.M2 = i53 + 1;
                        this.b4 = i53;
                    }
                    if (getMessagesController().U4()) {
                        int i54 = this.M2;
                        this.M2 = i54 + 1;
                        this.c4 = i54;
                    }
                    bi.ea.y(this.currentAccount, true).p();
                    org.telegram.messenger.t0.n();
                    int i55 = this.M2;
                    this.M2 = i55 + 1;
                    this.d4 = i55;
                    if (!getMessagesController().D3()) {
                        int i56 = this.M2;
                        this.M2 = i56 + 1;
                        this.e4 = i56;
                    }
                    if (!getMessagesController().h7) {
                        int i57 = this.M2;
                        this.M2 = i57 + 1;
                        this.f4 = i57;
                    }
                    if (this.b4 >= 0 || this.c4 >= 0 || this.d4 >= 0 || this.e4 >= 0 || this.f4 >= 0) {
                        int i58 = this.M2;
                        this.M2 = i58 + 1;
                        this.g4 = i58;
                    }
                    int i59 = this.M2;
                    this.o3 = i59;
                    this.p3 = i59 + 1;
                    this.q3 = i59 + 2;
                    int i60 = i59 + 4;
                    this.M2 = i60;
                    this.r3 = i59 + 3;
                    boolean z18 = org.telegram.messenger.r2.a;
                    if (z18) {
                        this.s3 = i60;
                        this.M2 = i59 + 6;
                        this.t3 = i59 + 5;
                    }
                    if (z18) {
                        int i61 = this.M2;
                        this.u3 = i61;
                        this.v3 = i61 + 1;
                        this.M2 = i61 + 3;
                        this.w3 = i61 + 2;
                    }
                    int i62 = this.M2;
                    this.x3 = i62;
                    this.M2 = i62 + 2;
                    this.y3 = i62 + 1;
                }
            } else if (this.p1) {
                if (this.z3 < 0 && this.A3 < 0) {
                    if (this.H4 || this.I4 || this.g6 != null || this.Z == null) {
                        int i63 = this.M2;
                        this.M2 = i63 + 1;
                        this.A3 = i63;
                    } else {
                        int i64 = this.M2;
                        this.M2 = i64 + 1;
                        this.z3 = i64;
                    }
                }
                int i65 = this.M2;
                int i66 = i65 + 1;
                this.M2 = i66;
                this.K3 = i65;
                if (this.Z == null) {
                    this.M2 = i65 + 2;
                    this.P3 = i66;
                }
                int i67 = this.M2;
                int i68 = i67 + 1;
                this.M2 = i68;
                this.Q3 = i67;
                if (z9) {
                    this.M2 = i67 + 2;
                    this.J4 = i68;
                }
            } else if (this.e1 != 0) {
                TLRPC.ChatFull chatFull7 = this.t2;
                if ((chatFull7 != null && (!TextUtils.isEmpty(chatFull7.about) || (this.t2.location instanceof TLRPC.TL_channelLocation))) || org.telegram.messenger.t3.t0(this.D2)) {
                    if (this.z3 < 0 && this.A3 < 0) {
                        if (this.H4 || this.I4 || this.g6 != null || this.Z == null) {
                            int i69 = this.M2;
                            this.M2 = i69 + 1;
                            this.A3 = i69;
                        } else {
                            int i70 = this.M2;
                            this.M2 = i70 + 1;
                            this.z3 = i70;
                        }
                    }
                    if (this.Z == null) {
                        int i71 = this.M2;
                        this.M2 = i71 + 1;
                        this.C3 = i71;
                    }
                    TLRPC.ChatFull chatFull8 = this.t2;
                    if (chatFull8 != null) {
                        if (!TextUtils.isEmpty(chatFull8.about)) {
                            int i72 = this.M2;
                            this.M2 = i72 + 1;
                            this.J3 = i72;
                        }
                        if (this.t2.location instanceof TLRPC.TL_channelLocation) {
                            int i73 = this.M2;
                            this.M2 = i73 + 1;
                            this.H3 = i73;
                        }
                    }
                    if (org.telegram.messenger.t3.t0(this.D2)) {
                        int i74 = this.M2;
                        this.M2 = i74 + 1;
                        this.K3 = i74;
                    }
                }
                if (this.z3 < 0 && this.A3 < 0) {
                    if (this.H4 || this.I4 || this.g6 != null || this.Z == null) {
                        int i75 = this.M2;
                        this.M2 = i75 + 1;
                        this.A3 = i75;
                    } else {
                        int i76 = this.M2;
                        this.M2 = i76 + 1;
                        this.z3 = i76;
                    }
                }
                if (this.Z == null) {
                    if (this.C3 != -1) {
                        int i77 = this.M2;
                        this.M2 = i77 + 1;
                        this.L3 = i77;
                    }
                    int i78 = this.M2;
                    this.M2 = i78 + 1;
                    this.M3 = i78;
                }
                int i79 = this.M2;
                if (i79 > 0) {
                    this.M2 = i79 + 1;
                    this.Q3 = i79;
                }
                TLRPC.Chat chat = this.D2;
                if (chat != null && chat.linked_community_id != 0) {
                    int i80 = this.M2;
                    this.k4 = i80;
                    this.M2 = i80 + 2;
                    this.l4 = i80 + 1;
                }
                if (org.telegram.messenger.t3.T(chat)) {
                    TLRPC.Chat chat2 = this.D2;
                    if (!chat2.megagroup) {
                        TLRPC.ChatFull chatFull9 = this.t2;
                        if (chatFull9 != null && (chat2.creator || chatFull9.can_view_participants)) {
                            if (this.Z == null) {
                                int i81 = this.M2;
                                this.M2 = i81 + 1;
                                this.s4 = i81;
                            }
                            int i82 = this.M2;
                            int i83 = i82 + 1;
                            this.M2 = i83;
                            this.w4 = i82;
                            if (chatFull9.requests_pending > 0) {
                                this.M2 = i82 + 2;
                                this.x4 = i83;
                            }
                            int i84 = this.M2;
                            int i85 = i84 + 1;
                            this.M2 = i85;
                            this.y4 = i84;
                            if (chatFull9.banned_count != 0 || chatFull9.kicked_count != 0) {
                                this.M2 = i84 + 2;
                                this.F4 = i85;
                            }
                            if ((chatFull9.can_view_stars_revenue && (bi.n0.g(this.currentAccount).c(-this.e1).amount > 0 || !bi.n0.g(this.currentAccount).k(-this.e1).a[0].isEmpty())) || ((chatFull4 = this.t2) != null && chatFull4.can_view_revenue && bi.n0.g(this.currentAccount).i(-this.e1) > 0)) {
                                int i86 = this.M2;
                                this.M2 = i86 + 1;
                                this.C4 = i86;
                            }
                            int i87 = this.M2;
                            this.z4 = i87;
                            this.M2 = i87 + 2;
                            this.D4 = i87 + 1;
                        }
                        if (org.telegram.messenger.t3.T(this.D2)) {
                            TLRPC.ChatFull chatFull10 = this.t2;
                            if (chatFull10 != null) {
                                if (this.p1 || (chatParticipants = chatFull10.participants) == null || chatParticipants.participants == null || (chatParticipants instanceof TLRPC.TL_chatParticipantsForbidden)) {
                                    if (!org.telegram.messenger.t3.r0(this.D2) && org.telegram.messenger.t3.w(3, this.D2) && this.t2.participants_hidden) {
                                        int i88 = this.M2;
                                        this.v4 = i88;
                                        this.M2 = i88 + 2;
                                        this.G4 = i88 + 1;
                                    }
                                    vv0 vv0Var = this.N;
                                    if (vv0Var != null) {
                                        vv0Var.C1();
                                    }
                                } else {
                                    if (org.telegram.messenger.t3.w(3, this.D2) || (tL_chatBannedRights = this.D2.default_banned_rights) == null || !tL_chatBannedRights.invite_users) {
                                        int i89 = this.M2;
                                        this.M2 = i89 + 1;
                                        this.v4 = i89;
                                    }
                                    if (this.t2.participants.participants.size() <= 5 || !z9) {
                                        if (this.v4 == -1 && this.Z == null) {
                                            int i90 = this.M2;
                                            this.M2 = i90 + 1;
                                            this.s4 = i90;
                                        }
                                        int i91 = this.M2;
                                        this.t4 = i91;
                                        int size = this.t2.participants.participants.size() + i91;
                                        this.u4 = size;
                                        this.M2 = size + 1;
                                        this.G4 = size;
                                        arrayList2.addAll(this.t2.participants.participants);
                                        ArrayList arrayList4 = this.B2;
                                        if (arrayList4 != null) {
                                            arrayList3.addAll(arrayList4);
                                        }
                                        vv0 vv0Var2 = this.N;
                                        if (vv0Var2 != null) {
                                            vv0Var2.k1(null, null);
                                        }
                                    } else {
                                        if (this.v4 != -1) {
                                            int i92 = this.M2;
                                            this.M2 = i92 + 1;
                                            this.G4 = i92;
                                        }
                                        vv0 vv0Var3 = this.N;
                                        if (vv0Var3 != null) {
                                            vv0Var3.k1(this.B2, this.t2);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (this.p1 || (chatFull3 = this.t2) == null || !this.D2.megagroup || (chatParticipants2 = chatFull3.participants) == null || (arrayList = chatParticipants2.participants) == null || arrayList.isEmpty()) {
                                if (!org.telegram.messenger.t3.r0(this.D2) && org.telegram.messenger.t3.w(3, this.D2) && (chatFull2 = this.t2) != null && chatFull2.participants_hidden) {
                                    int i93 = this.M2;
                                    this.v4 = i93;
                                    this.M2 = i93 + 2;
                                    this.G4 = i93 + 1;
                                }
                                vv0 vv0Var4 = this.N;
                                if (vv0Var4 != null) {
                                    vv0Var4.C1();
                                }
                            } else {
                                if (!org.telegram.messenger.t3.r0(this.D2) && org.telegram.messenger.t3.w(3, this.D2) && this.t2.participants_count < getMessagesController().X2) {
                                    int i94 = this.M2;
                                    this.M2 = i94 + 1;
                                    this.v4 = i94;
                                }
                                int size2 = this.t2.participants.participants.size();
                                if ((size2 <= 5 || !z9 || this.S4 == 1) && this.S4 != 2) {
                                    if (this.v4 == -1 && this.Z == null) {
                                        int i95 = this.M2;
                                        this.M2 = i95 + 1;
                                        this.s4 = i95;
                                    }
                                    int i96 = this.M2;
                                    this.t4 = i96;
                                    int i97 = i96 + size2;
                                    this.u4 = i97;
                                    this.M2 = i97 + 1;
                                    this.G4 = i97;
                                    arrayList2.addAll(this.t2.participants.participants);
                                    ArrayList arrayList5 = this.B2;
                                    if (arrayList5 != null) {
                                        arrayList3.addAll(arrayList5);
                                    }
                                    this.S4 = 1;
                                    vv0 vv0Var5 = this.N;
                                    if (vv0Var5 != null) {
                                        vv0Var5.k1(null, null);
                                    }
                                } else {
                                    if (this.v4 != -1) {
                                        int i98 = this.M2;
                                        this.M2 = i98 + 1;
                                        this.G4 = i98;
                                    }
                                    if (this.N != null) {
                                        if (!this.B2.isEmpty()) {
                                            this.S4 = 2;
                                        }
                                        this.N.k1(this.B2, this.t2);
                                    }
                                }
                            }
                            if (this.M4 == -1) {
                                TLRPC.Chat chat3 = this.D2;
                                if (chat3.left && !chat3.kicked) {
                                    long j12 = org.telegram.messenger.qp.x1(this.currentAccount).getLong("dialog_join_requested_time_" + this.h1, -1L);
                                    if (j12 <= 0 || System.currentTimeMillis() - j12 >= 120000) {
                                        org.telegram.ui.Components.ef0 ef0Var2 = this.Z;
                                        if (ef0Var2 == null || !ef0Var2.f()) {
                                            int i99 = this.M2;
                                            this.L4 = i99;
                                            this.M2 = i99 + 2;
                                            this.M4 = i99 + 1;
                                        }
                                        if (z9) {
                                            int i100 = this.M2;
                                            this.M2 = i100 + 1;
                                            this.J4 = i100;
                                        }
                                        if (this.J4 == -1) {
                                            int i101 = this.M2;
                                            this.M2 = i101 + 1;
                                            this.B3 = i101;
                                        }
                                        if (this.actionBar != null) {
                                            i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
                                        } else {
                                            i7 = 0;
                                        }
                                        if (this.a != null && i11 <= this.M2) {
                                            i10 = this.E0;
                                            if (i10 != 0) {
                                            }
                                            qu0Var = this.a;
                                            if (qu0Var != null) {
                                                qu0Var.setTranslateSelectorPosition(this.N3);
                                            }
                                            ef0Var = this.Z;
                                            if (ef0Var != null) {
                                                ef0Var.o(7, z12);
                                            }
                                            zf0Var = this.b0;
                                            if (zf0Var != null) {
                                                TLRPC.UserFull userFull15 = this.u2;
                                                if (userFull15 != null) {
                                                    zf0Var.setMusicDocument(userFull15.saved_music);
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
                                        qu0Var = this.a;
                                        if (qu0Var != null) {
                                        }
                                        ef0Var = this.Z;
                                        if (ef0Var != null) {
                                        }
                                        zf0Var = this.b0;
                                        if (zf0Var != null) {
                                        }
                                    }
                                }
                            }
                        }
                        z12 = false;
                        if (z9) {
                        }
                        if (this.J4 == -1) {
                        }
                        if (this.actionBar != null) {
                        }
                        if (this.a != null) {
                            i10 = this.E0;
                            if (i10 != 0) {
                            }
                            qu0Var = this.a;
                            if (qu0Var != null) {
                            }
                            ef0Var = this.Z;
                            if (ef0Var != null) {
                            }
                            zf0Var = this.b0;
                            if (zf0Var != null) {
                            }
                        }
                        this.C0 = 0;
                        qu0Var = this.a;
                        if (qu0Var != null) {
                        }
                        ef0Var = this.Z;
                        if (ef0Var != null) {
                        }
                        zf0Var = this.b0;
                        if (zf0Var != null) {
                        }
                    }
                }
                TLRPC.ChatFull chatFull11 = this.t2;
                if ((chatFull11 != null && chatFull11.can_view_stars_revenue && (bi.n0.g(this.currentAccount).c(-this.e1).amount > 0 || !bi.n0.g(this.currentAccount).k(-this.e1).a[0].isEmpty())) || ((chatFull = this.t2) != null && chatFull.can_view_revenue && bi.n0.g(this.currentAccount).i(-this.e1) > 0)) {
                    int i102 = this.M2;
                    this.C4 = i102;
                    this.M2 = i102 + 2;
                    this.D4 = i102 + 1;
                }
                if (org.telegram.messenger.t3.T(this.D2)) {
                }
                z12 = false;
                if (z9) {
                }
                if (this.J4 == -1) {
                }
                if (this.actionBar != null) {
                }
                if (this.a != null) {
                }
                this.C0 = 0;
                qu0Var = this.a;
                if (qu0Var != null) {
                }
                ef0Var = this.Z;
                if (ef0Var != null) {
                }
                zf0Var = this.b0;
                if (zf0Var != null) {
                }
            }
            z12 = false;
            if (this.J4 == -1) {
            }
            if (this.actionBar != null) {
            }
            if (this.a != null) {
            }
            this.C0 = 0;
            qu0Var = this.a;
            if (qu0Var != null) {
            }
            ef0Var = this.Z;
            if (ef0Var != null) {
            }
            zf0Var = this.b0;
            if (zf0Var != null) {
            }
        }
        z9 = false;
        if (!z9) {
            z9 = userFull6.stories_pinned_available;
        }
        if (!z9) {
            z9 = botInfo.has_preview_medias;
        }
        if (!z9) {
            z9 = true;
        }
        if (!z9) {
            z9 = chatFull5.stories_pinned_available;
        }
        if (!z9) {
        }
        if (this.d1 == 0) {
        }
        z12 = false;
        if (this.J4 == -1) {
        }
        if (this.actionBar != null) {
        }
        if (this.a != null) {
        }
        this.C0 = 0;
        qu0Var = this.a;
        if (qu0Var != null) {
        }
        ef0Var = this.Z;
        if (ef0Var != null) {
        }
        zf0Var = this.b0;
        if (zf0Var != null) {
        }
    }

    public final void K3() {
        if (this.Z5 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.i2;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.i2.cancel();
        }
        float l10 = Utilities.l(this.P1 / this.E1);
        if (l10 <= 0.0f) {
            return;
        }
        float f10 = (l10 - 0.5f) / 0.5f;
        float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.L(21.0f));
        this.a2 = org.telegram.messenger.g0.T1(0.42f, this.Z5[0], l10);
        this.Y1 = org.telegram.messenger.g0.T1(this.e6, this.Z5[1], l10);
        this.Z1 = org.telegram.messenger.g0.T1(translationY, this.Z5[2], l10);
        this.b2 = org.telegram.messenger.g0.T1(this.Z5[11], 0.0f, l10);
        this.X.setScaleX(this.a2);
        this.X.setScaleY(this.a2);
        this.X.setTranslationX(this.Y1);
        this.X.setTranslationY(this.Z1);
        org.telegram.ui.Components.lu0 lu0Var = this.S;
        if (lu0Var != null) {
            lu0Var.setAlpha(l10);
        }
        this.e0.setAlpha(1.0f);
        this.X.setAlpha(1.0f);
        cv0 cv0Var = this.u0;
        if (cv0Var != null) {
            cv0Var.invalidate();
        }
        bi.g1 g1Var = this.v0;
        if (g1Var != null) {
            g1Var.e = org.telegram.messenger.g0.T1(0.0f, this.Z5[4], f10);
            this.v0.f = org.telegram.messenger.g0.T1(0.0f, this.Z5[5], l10);
            bi.g1 g1Var2 = this.v0;
            g1Var2.h = true;
            g1Var2.invalidate();
        }
        uw0 uw0Var = this.y6;
        if (uw0Var != null) {
            uw0Var.setAlpha((int) org.telegram.messenger.g0.T1(0.0f, this.Z5[6], l10));
        }
        float L = (((this.a2 * 100.0f) / 42.0f) * org.telegram.messenger.g0.L(42.0f)) - org.telegram.messenger.g0.L(42.0f);
        this.h0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(16.0f) + L);
        this.h0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(-10.0f) + L);
        this.i0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L);
        this.i0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(26.5f) + L);
        this.j0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L);
        this.j0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + L);
        this.k0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L);
        this.k0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + L);
        float T1 = org.telegram.messenger.g0.T1(1.0f, this.Z5[7], l10);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - (org.telegram.messenger.g0.p * 21.0f)))) + org.telegram.messenger.g0.L(1.3f);
        float N = org.telegram.messenger.g0.N(22.7f) + floor;
        this.d2 = org.telegram.messenger.g0.T1(floor, this.Z5[8], l10);
        this.f2 = org.telegram.messenger.g0.T1(N, this.Z5[9], l10);
        float T12 = org.telegram.messenger.g0.T1((this.e6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f), this.Z5[12], l10);
        float T13 = org.telegram.messenger.g0.T1((this.e6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f), this.Z5[13], l10);
        this.f.setTranslationX(T12);
        this.f.setTranslationY(this.d2);
        this.r.setTranslationX(this.o5 + T13);
        this.r.setTranslationY(this.f2);
        this.c2 = T12;
        this.e2 = T13;
        this.f.setScaleX(T1);
        this.f.setScaleY(T1);
        q5();
        w5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0));
        z4((int) this.Z5[10], l10, true);
        org.telegram.ui.Components.ef0 ef0Var = this.Z;
        if (ef0Var != null) {
            ef0Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, this.Z5[3], f10));
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
    public final void K4(boolean z9) {
        TLRPC.Chat M0;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize x10;
        TLRPC.ChatFull chatFull;
        TLRPC.FileLocation fileLocation2;
        TLRPC.VideoSize x11;
        TLRPC.UserFull userFull;
        TLRPC.Photo photo;
        if (this.a.getScrollState() != 1 || z9) {
            av0 av0Var = this.n0;
            int realPosition = av0Var != null ? av0Var.getRealPosition() : 0;
            av0 av0Var2 = this.n0;
            org.telegram.messenger.hc hcVar = null;
            org.telegram.messenger.hc G = av0Var2 != null ? av0Var2.G(realPosition) : null;
            av0 av0Var3 = this.n0;
            TLRPC.Photo F = av0Var3 != null ? av0Var3.F(realPosition) : null;
            long j3 = this.d1;
            lv0 lv0Var = this.k5;
            if (j3 == 0) {
                if (this.e1 == 0 || (chatPhoto = (M0 = getMessagesController().M0(Long.valueOf(this.e1))).photo) == null || chatPhoto.photo_big == null) {
                    return;
                }
                PhotoViewer.p1().H2(null, this, null);
                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                int i7 = chatPhoto2.dc_id;
                if (i7 != 0) {
                    chatPhoto2.photo_big.dc_id = i7;
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
                if (F != null && !F.video_sizes.isEmpty() && (x10 = org.telegram.messenger.w7.x(1000, F.video_sizes)) != null) {
                    hcVar = org.telegram.messenger.hc.j(x10, F);
                }
                PhotoViewer.p1().c2(null, fileLocation3, G, hcVar, null, null, null, 0, lv0Var, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.d1));
            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null) {
                return;
            }
            PhotoViewer.p1().H2(null, this, null);
            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
            int i10 = userProfilePhoto2.dc_id;
            if (i10 != 0) {
                userProfilePhoto2.photo_big.dc_id = i10;
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
                boolean z10 = photo instanceof TLRPC.TL_photo;
                if (!z10 || photo.id != userProfilePhoto2.photo_id) {
                    TLRPC.Photo photo3 = userFull.fallback_photo;
                    if ((photo3 instanceof TLRPC.TL_photo) && photo3.id == userProfilePhoto2.photo_id) {
                        F = photo3;
                    }
                }
                F = photo;
            }
            if (F != null && !F.video_sizes.isEmpty() && (x11 = org.telegram.messenger.w7.x(1000, F.video_sizes)) != null) {
                hcVar = org.telegram.messenger.hc.j(x11, F);
            }
            PhotoViewer.p1().c2(null, fileLocation4, G, hcVar, null, null, null, 0, lv0Var, null, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void K5() {
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

    public final float L3() {
        return Utilities.l((this.P1 - e4()) / k4());
    }

    public final void L4() {
        TLRPC.User a22;
        if (this.d1 == 0 || c4() || (a22 = getMessagesController().a2(Long.valueOf(this.d1))) == null || (a22 instanceof TLRPC.TL_userEmpty)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.d1);
        if (getMessagesController().E(bundle, this, null, null)) {
            boolean z9 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
            if (!org.telegram.messenger.g0.Q1() && z9) {
                org.telegram.messenger.qs notificationCenter = getNotificationCenter();
                int i7 = org.telegram.messenger.qs.t;
                notificationCenter.n(this, i7);
                getNotificationCenter().k(i7, new Object[0]);
            }
            int i10 = getArguments().getInt("nearby_distance", -1);
            if (i10 >= 0) {
                bundle.putInt("nearby_distance", i10);
            }
            an anVar = new an(bundle);
            org.telegram.messenger.ui mediaDataController = getMediaDataController();
            TLRPC.Document document = mediaDataController.y0;
            mediaDataController.n1();
            anVar.U9 = document;
            anVar.V9 = false;
            presentFragment(anVar, z9);
            if (!org.telegram.messenger.g0.Q1() || this.I0) {
                return;
            }
            finishFragment();
        }
    }

    public final void L5(boolean z9) {
        org.telegram.ui.ActionBar.k kVar;
        if ((this.u0 == null && this.v0 == null) || (kVar = this.actionBar) == null || this.simpleActionBar == null) {
            return;
        }
        float f10 = kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0.0f;
        int L = org.telegram.messenger.g0.L(7.0f);
        float right = this.simpleActionBar.getBackButton().getRight() + L;
        float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
        cv0 cv0Var = this.u0;
        if (cv0Var != null) {
            float A = com.google.android.recaptcha.internal.a.A(this.actionBar.getHeight(), f10, 2.0f, f10);
            boolean z10 = Math.abs(right - cv0Var.f0) > 0.1f || Math.abs(menuPillLeft - cv0Var.g0) > 0.1f || Math.abs(A - cv0Var.h0) > 0.1f;
            cv0Var.f0 = right;
            cv0Var.g0 = menuPillLeft;
            if (z9) {
                cv0Var.m0.e(true, menuPillLeft);
            }
            cv0Var.h0 = A;
            if (z10) {
                cv0Var.invalidate();
            }
        }
        bi.g1 g1Var = this.v0;
        if (g1Var != null) {
            float A2 = com.google.android.recaptcha.internal.a.A(this.actionBar.getHeight(), f10, 2.0f, f10);
            int k42 = k4();
            boolean z11 = Math.abs(right - g1Var.r) > 0.1f || Math.abs(menuPillLeft - g1Var.s) > 0.1f || Math.abs(A2 - g1Var.w) > 0.1f;
            g1Var.r = right;
            g1Var.s = menuPillLeft;
            if (z9) {
                g1Var.D.e(true, menuPillLeft);
            }
            g1Var.w = A2;
            g1Var.y = k42 + A2;
            if (z11) {
                g1Var.invalidate();
            }
        }
    }

    public final void M3() {
        this.Z1 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.L(21.0f));
        this.a2 = 1.38f;
        this.b2 = 0.0f;
        d4();
        R4();
        z4(0, 1.0f, true);
        this.c2 = (this.a.getMeasuredWidth() / 2.0f) - (((this.f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin);
        this.e2 = (this.a.getMeasuredWidth() / 2.0f) - ((this.r.getExactWidth() * 0.5f) + (((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin + (this.p5 ? 0 : this.r.getPaddingLeft())));
        this.v6 = this.p5 ? 0.0f : this.r.getPaddingLeft();
        if (this.I1 != 2) {
            this.u0.setAlpha(1.0f);
        }
        this.X.setAlpha(1.0f);
        this.e0.setAlpha(1.0f);
    }

    public final void M4() {
        TLRPC.ChatFull chatFull = this.t2;
        if (chatFull == null || chatFull.linked_chat_id == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.t2.linked_chat_id);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new an(bundle));
        }
    }

    public final void M5() {
        try {
            l00 l00Var = this.T;
            if (l00Var != null && (l00Var.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.T.getForeground()).setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.z0), 100));
            }
            float f10 = this.Q5;
            Drawable drawable = this.D;
            int[] iArr = this.R6;
            if (drawable != null) {
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ni, this.z0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.z0));
                int i7 = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (S0 != i7) {
                    drawable.setColorFilter(new PorterDuffColorFilter(S0, mode));
                }
                iArr[6] = S0;
            }
            Drawable drawable2 = this.N6;
            if (drawable2 != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.V6, this.z0);
                int i10 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (w02 != i10) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
                }
                iArr[3] = w02;
            }
            Drawable drawable3 = this.O6;
            if (drawable3 != null) {
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.z0);
                int i11 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (w03 != i11) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(w03, mode3));
                }
                iArr[4] = w03;
            }
            Drawable drawable4 = this.P6;
            if (drawable4 != null) {
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.z0);
                int i12 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (w04 != i12) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(w04, mode4));
                }
                iArr[5] = w04;
            }
            org.telegram.ui.Components.wp wpVar = this.Q6;
            if (wpVar != null) {
                wpVar.y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.kk, this.z0);
                if (this.a != null) {
                    for (int i13 = 0; i13 < this.a.getChildCount(); i13++) {
                        View childAt = this.a.getChildAt(i13);
                        if (childAt != null) {
                            childAt.invalidate();
                        }
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.qw
    public final /* synthetic */ boolean N(ww wwVar) {
        return false;
    }

    public final void N4(boolean z9) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.u2;
        if (userFull == null || (tL_businessLocation = userFull.business_location) == null) {
            return;
        }
        int i7 = 1;
        if (tL_businessLocation.geo_point == null || z9) {
            boolean z10 = org.telegram.messenger.r2.a;
            org.telegram.messenger.t0.r();
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?q=" + this.u2.business_location.address, new Object[0]))));
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        di.p8 p8Var = new di.p8(3, i7);
        p8Var.setResourceProvider(this.z0);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.local_id = -1;
        tL_message.peer_id = getMessagesController().z1(a());
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_businessLocation tL_businessLocation2 = this.u2.business_location;
        tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
        tL_messageMediaGeo.address = tL_businessLocation2.address;
        tL_message.media = tL_messageMediaGeo;
        p8Var.P0 = false;
        p8Var.G0(new org.telegram.messenger.ij(org.telegram.messenger.p10.s0, tL_message, false, false));
        presentFragment(p8Var);
    }

    public final void N5() {
        TLRPC.UserFull userFull;
        if (this.X0 == null) {
            return;
        }
        org.telegram.messenger.g0.Z3(this.X0, this.C2 == null && (((userFull = this.u2) != null && userFull.ttl_period > 0) || (this.t2 != null && org.telegram.messenger.t3.y(13, this.D2) && this.t2.ttl_period > 0)), 0.8f, true, this.l5);
    }

    @Override // org.telegram.ui.Components.i30
    public final void O(boolean z9, boolean z10) {
        org.telegram.ui.Cells.b4 b4Var = this.g0;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(0.0f);
    }

    public final void O3() {
        v4.d1 d1Var;
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
        int i7 = 0;
        while (true) {
            if (i7 >= this.a.getChildCount()) {
                view = null;
                break;
            } else {
                if (RecyclerView.R(this.a.getChildAt(i7)) == 0) {
                    view = this.a.getChildAt(i7);
                    break;
                }
                i7++;
            }
        }
        if (view != null) {
            qu0 qu0Var = this.a;
            View F = qu0Var.F(view);
            d1Var = (org.telegram.ui.Components.xi0) (F != null ? qu0Var.T(F) : null);
        }
        int top = view == null ? 0 : view.getTop();
        int i10 = (top < 0 || (d1Var != null ? d1Var.b() : -1) != 0) ? 0 : top;
        float a10 = view == null ? 1.0f : c8.j9.a((-top) / org.telegram.messenger.g0.L(12.0f), 0.0f, 1.0f);
        if (this.L5 != a10) {
            this.L5 = a10;
            z5();
        }
        int i11 = 1;
        boolean z9 = this.q0 == null && this.actionBar.n0;
        int i12 = this.J4;
        if (i12 != -1 && !z9) {
            org.telegram.ui.Components.xi0 xi0Var = (org.telegram.ui.Components.xi0) this.a.K(i12);
            z9 = xi0Var != null && xi0Var.a.getTop() <= 0;
        }
        if (this.R5 != z9) {
            this.R5 = z9;
            P3();
            AnimatorSet animatorSet = this.O5;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.P5;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            B5(true);
            H5();
            L5(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.actionBar, this.S5, z9 ? 1.0f : 0.0f));
            this.N.K0.setOpen(z9);
            if (z9) {
                arrayList.add(ObjectAnimator.ofFloat(this, this.j5, 0.0f));
            }
            if (this.u0 != null || this.v0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new cu0(this, 3));
                arrayList.add(ofFloat);
            }
            R3();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.O5 = animatorSet3;
            animatorSet3.playTogether(arrayList);
            this.O5.setInterpolator(org.telegram.ui.Components.xq.f);
            this.O5.addListener(new dv0(this, i11));
            this.O5.setDuration(150L);
            this.O5.start();
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, Boolean.TRUE);
        }
        float f10 = i10;
        if (this.P1 == f10 || this.G1) {
            return;
        }
        this.P1 = f10;
        this.c1.invalidate();
        if (this.I1 != 0) {
            this.L1 = this.P1 > ((float) e4());
        }
        y4(true);
    }

    public final void O4(int i7, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9) {
        boolean[] zArr = new boolean[1];
        iv0 iv0Var = new iv0(this, user.id, this.e1, tL_chatAdminRights, this.D2.default_banned_rights, tL_chatBannedRights, str, i7, zArr, user);
        iv0Var.X0 = new jv0(this, i7, chatParticipant, z9, zArr);
        presentFragment(iv0Var);
    }

    public final void O5(boolean z9) {
        boolean z10;
        TLRPC.ChatFull chatFull;
        float L3 = L3();
        this.X5 = L3 > 0.2f && !this.V1 && (this.q0 == null || this.N2 == -1);
        R3();
        org.telegram.ui.Components.ch0 ch0Var = this.s;
        if (ch0Var == null || ch0Var.getVisibility() == 8) {
            z10 = false;
        } else {
            this.s.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) + this.P1) + this.S1) - org.telegram.messenger.g0.L(29.5f));
            z10 = L3 > 0.2f && !this.V1 && !this.r1 && (this.q0 == null || this.N2 == -1);
            if (z10 && this.e1 != 0) {
                z10 = (!org.telegram.messenger.t3.T(this.D2) || this.D2.megagroup || (chatFull = this.t2) == null || chatFull.linked_chat_id == 0 || (this.C3 == -1 && this.D3 == -1)) ? false : true;
            }
            if (!this.F1) {
                if (z10 != (this.s.getTag() == null)) {
                    if (z10) {
                        this.s.setTag(null);
                    } else {
                        this.s.setTag(0);
                    }
                    AnimatorSet animatorSet = this.w;
                    if (animatorSet != null) {
                        this.w = null;
                        animatorSet.cancel();
                    }
                    if (z9) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.w = animatorSet2;
                        int i7 = 3;
                        if (z10) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ch0, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ch0, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ch0, Float>) View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ch0, Float>) View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ch0, Float>) View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ch0, Float>) View.ALPHA, 0.0f));
                        }
                        this.w.setDuration(150L);
                        this.w.addListener(new dv0(this, i7));
                        this.w.start();
                    } else {
                        this.s.setScaleX(z10 ? 1.0f : 0.2f);
                        this.s.setScaleY(z10 ? 1.0f : 0.2f);
                        this.s.setAlpha(z10 ? 1.0f : 0.0f);
                    }
                }
            }
        }
        cv0 cv0Var = this.u0;
        if (cv0Var != null) {
            float measuredWidth = this.Y.getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
            int i10 = this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0;
            cv0Var.i0 = measuredWidth;
            cv0Var.k0 = z10;
            cv0Var.j0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10;
            cv0Var.invalidate();
        }
        bi.g1 g1Var = this.v0;
        if (g1Var != null) {
            g1Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0) + this.P1 + this.S1);
        }
    }

    public final void P3() {
        vv0 vv0Var = this.N;
        if (vv0Var != null) {
            vv0Var.setPagesVisibleOverscanTop((this.R5 || this.Q5 > 0.0f) ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0);
        }
    }

    public final void P4(String str, org.telegram.ui.Cells.g gVar) {
        if (str.startsWith("@")) {
            getMessagesController().y3(str.substring(1), this, 0, gVar);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            ww wwVar = new ww(null);
            wwVar.n2 = str;
            presentFragment(wwVar);
        } else {
            if (!str.startsWith("/") || this.parentLayout.getFragmentStack().size() <= 1) {
                return;
            }
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if (f2Var instanceof an) {
                finishFragment();
                ((an) f2Var).Z.Z0(null, str, false, false);
            }
        }
    }

    public final void P5() {
        org.telegram.ui.Components.up0 up0Var;
        org.telegram.ui.Components.tq0 tq0Var;
        org.telegram.ui.Components.w70 w70Var;
        int w02;
        this.h6.clear();
        ww0 ww0Var = this.c1;
        if (ww0Var != null) {
            ww0Var.a(this.g6, true);
        }
        bv0 bv0Var = this.r;
        if (bv0Var != null) {
            this.r.setTextColor(i0.a.f(this.j2, I3(bv0Var.getTag() instanceof Integer ? org.telegram.ui.ActionBar.k6.w0(((Integer) this.r.getTag()).intValue(), this.z0) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.z0), Boolean.valueOf(this.J0[0])), -1275068417));
        }
        uw0 uw0Var = this.y6;
        if (uw0Var != null) {
            uw0Var.a(i0.a.f(this.j2, org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.b(0.18f, -0.1f, this.b1)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.D(i0.a.f(this.Q5, this.g6 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.z0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y8, this.z0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            org.telegram.messenger.fp fpVar = this.g6;
            kVar2.C(i0.a.f(this.Q5, fpVar != null ? 1090519039 : fpVar != null ? 553648127 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f8, this.z0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z8, this.z0)), false);
        }
        if (this.y != null) {
            org.telegram.messenger.fp fpVar2 = this.g6;
            if (fpVar2 != null) {
                w02 = org.telegram.ui.ActionBar.k6.b(0.1f, org.telegram.ui.ActionBar.k6.I.q() ? -0.1f : -0.08f, i0.a.f(0.4f, fpVar2.g(), this.g6.o(org.telegram.ui.ActionBar.k6.I.q()) ? this.g6.k() : this.g6.i()));
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ni, this.z0);
            }
            this.y.setColorFilter(org.telegram.messenger.g0.S0(this.Q5, 1.0f, w02, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.z0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.H != null) {
            this.H.setColorFilter(org.telegram.messenger.g0.S0(this.Q5, 1.0f, this.g6 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.oi, this.z0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.z0)), PorterDuff.Mode.MULTIPLY);
        }
        ok okVar = this.f;
        if (okVar != null) {
            okVar.setTextColor(i0.a.f(this.j2, i0.a.f(this.Q5, this.g6 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ji, this.z0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.z0)), -1));
        }
        org.telegram.messenger.re reVar = this.Z0;
        if (reVar != null && (w70Var = (org.telegram.ui.Components.w70) reVar.e) != null) {
            w70Var.invalidate();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.g6 == null ? i0.a.f(this.R1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.dd, this.z0), -1) : -1, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.zf0 zf0Var = this.b0;
        if (zf0Var != null) {
            zf0Var.setColor(this.g6);
        }
        org.telegram.messenger.g0.d0(this.a, new fu0(this, 3));
        vv0 vv0Var = this.N;
        if (vv0Var != null && (tq0Var = vv0Var.K0) != null) {
            tq0Var.updateColors();
        }
        vv0 vv0Var2 = this.N;
        if (vv0Var2 != null && (up0Var = vv0Var2.a0) != null) {
            up0Var.m();
        }
        Q5();
        s5();
        cv0 cv0Var = this.u0;
        if (cv0Var != null) {
            cv0Var.f(true, true);
        }
        bi.g1 g1Var = this.v0;
        if (g1Var != null) {
            g1Var.a();
        }
    }

    @Override // org.telegram.ui.Components.qs0
    public final void Q() {
        org.telegram.ui.Components.ps0 ps0Var;
        vv0 vv0Var = this.N;
        if (vv0Var != null && (ps0Var = this.Q) != null) {
            vv0Var.setNewMediaCounts(ps0Var.c);
        }
        if (this.d != null) {
            D5(false, false);
        }
        V();
        if (this.u2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void Q3() {
        int i7 = this.I1;
        float f10 = 0.0f;
        if (i7 == 1 && (!this.l5 || this.F1)) {
            this.q6 = 0.0f;
        } else if (i7 == 2 && (!this.l5 || this.F1)) {
            bv0 bv0Var = this.r;
            this.q6 = bv0Var == null ? 0.0f : bv0Var.getAlpha();
        } else if (this.d1 == org.telegram.messenger.p10.i(this.currentAccount).n) {
            this.q6 = (1.0f - this.n5) * this.j2;
        } else {
            this.q6 = this.j2 * this.n5;
        }
        boolean z9 = this.d1 == org.telegram.messenger.p10.i(this.currentAccount).n;
        if (z9 && this.p5) {
            this.o5 = org.telegram.messenger.g0.L(28.0f) * this.q6;
            bv0 bv0Var2 = this.r;
            if (bv0Var2 != null) {
                bv0Var2.setTranslationX(m4(this.u6, this.w6));
                this.Y.invalidate();
            }
        }
        if (z9) {
            if (this.p5) {
                f10 = this.j2;
            }
        } else if (this.q5) {
            f10 = this.q6;
        }
        uw0 uw0Var = this.y6;
        if (uw0Var != null) {
            uw0Var.e = 1.0f - f10;
            uw0Var.invalidateSelf();
        }
        this.t6 = f10 > 0.5f;
        H5();
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0476  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q4(float f10, float f11, int i7, View view) {
        TLRPC.Chat M0;
        String K;
        TLRPC.TL_username b10;
        String sb2;
        String str;
        TLRPC.UserFull userFull;
        TLRPC.UserFull userFull2;
        String str2;
        float f12;
        float f13;
        ViewGroup view2;
        View view3 = view;
        int i10 = 4;
        String str3 = "";
        String str4 = null;
        int i11 = 1;
        int i12 = 0;
        if (i7 == this.K3 || i7 == this.U2) {
            if (this.d1 == 0) {
                if (this.e1 != 0 && (M0 = getMessagesController().M0(Long.valueOf(this.e1))) != null && (this.f1 != 0 || org.telegram.messenger.t3.t0(M0))) {
                    K = org.telegram.messenger.t3.K(M0, false);
                    b10 = org.telegram.messenger.m5.b(K, M0.usernames);
                    if (this.d1 != 0) {
                    }
                }
                return false;
            }
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.d1));
            K = org.telegram.messenger.t10.n(a22);
            if (a22 != null && K != null) {
                b10 = org.telegram.messenger.m5.b(K, a22.usernames);
                if (this.d1 != 0) {
                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.e1));
                    if (org.telegram.messenger.t3.t0(M02)) {
                        StringBuilder sb3 = new StringBuilder("https://");
                        sb3.append(getMessagesController().U2);
                        sb3.append("/");
                        sb3.append(org.telegram.messenger.t3.K(M02, false));
                        if (this.f1 != 0) {
                            str3 = "/" + this.f1;
                        }
                        sb3.append(str3);
                        sb2 = sb3.toString();
                    } else {
                        StringBuilder sb4 = new StringBuilder("https://");
                        sb4.append(getMessagesController().U2);
                        sb4.append("/c/");
                        sb4.append(M02.id);
                        if (this.f1 != 0) {
                            str3 = "/" + this.f1;
                        }
                        sb4.append(str3);
                        sb2 = sb4.toString();
                    }
                    kv0 kv0Var = new kv0(this, getParentActivity(), sb2, sb2);
                    showDialog(kv0Var);
                    if (b10 != null && !b10.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername.username = b10.username;
                        tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo, new lo0(this, b10, kv0Var, i10)), getClassGuid());
                        return true;
                    }
                } else if (!Z3(i7, view3)) {
                    if (b10 != null && !b10.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo2 = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername2 = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername2.username = b10.username;
                        tL_getCollectibleInfo2.collectible = tL_inputCollectibleUsername2;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo2, new h50(23, this, b10)), getClassGuid());
                        return true;
                    }
                    try {
                        org.telegram.ui.Components.hc.a0(this).i(org.telegram.messenger.hd.M0(2131743666, null)).j();
                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "@" + K));
                        return true;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return true;
                    }
                }
            }
            return false;
            return true;
        }
        if (i7 != this.G3) {
            int i13 = 2;
            if (i7 == this.F3 || i7 == this.S2) {
                if (!Z3(i7, view3)) {
                    TLRPC.User a23 = getMessagesController().a2(Long.valueOf(this.d1));
                    if (a23 != null && (str = a23.phone) != null && str.length() != 0 && getParentActivity() != null) {
                        if (i7 == this.F3 && a23.phone.startsWith("888")) {
                            TL_fragment.TL_inputCollectiblePhone tL_inputCollectiblePhone = new TL_fragment.TL_inputCollectiblePhone();
                            String str5 = a23.phone;
                            tL_inputCollectiblePhone.phone = str5;
                            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo3 = new TL_fragment.TL_getCollectibleInfo();
                            tL_getCollectibleInfo3.collectible = tL_inputCollectiblePhone;
                            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo3, new lo0(this, str5, a23, 5)), getClassGuid());
                            return true;
                        }
                        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, view3);
                        H.W(this.a.U0(view3, false));
                        H.w = false;
                        if (i7 == this.F3) {
                            TLRPC.UserFull userFull3 = this.u2;
                            if (userFull3 != null && userFull3.phone_calls_available) {
                                H.c(R.drawable.msg_calls, org.telegram.messenger.hd.M0(2131752600, null), new vt0(this, a23, i11), false);
                                if (this.u2.video_calls_available) {
                                    H.c(R.drawable.msg_videocall, org.telegram.messenger.hd.M0(2131743609, null), new vt0(this, a23, i13), false);
                                }
                            }
                            if (!this.b5) {
                                H.c(R.drawable.msg_calls_regular, org.telegram.messenger.hd.M0(2131752634, null), new vt0(this, a23, 3), false);
                            }
                        }
                        H.c(R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131751767, null), new vt0(this, a23, i10), false);
                        if (this.b5) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131754250, null)));
                            int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                            int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                                int i14 = lastIndexOf - 1;
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), indexOf, i14, 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.I6, this.z0), indexOf, i14, 33);
                            }
                            H.k();
                            H.p(13, org.telegram.messenger.g0.L(200.0f), spannableStringBuilder);
                            if (H.z() instanceof TextView) {
                                TextView textView = (TextView) H.z();
                                int i15 = org.telegram.ui.ActionBar.k6.I5;
                                org.telegram.ui.ActionBar.r6.R(textView, org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i15, this.z0), 0, 6), null, org.telegram.ui.ActionBar.r6.N(i15), this.z0);
                                textView.setOnClickListener(new bi.l1(20));
                            }
                        }
                        H.Z();
                        return true;
                    }
                }
                return true;
            }
            if (i7 == this.J3 || i7 == this.I3 || i7 == this.H3 || i7 == this.V2) {
                if (i7 != this.V2 || ((userFull = this.u2) != null && !TextUtils.isEmpty(userFull.about))) {
                    if (!Z3(i7, view3)) {
                        if (view3 instanceof org.telegram.ui.Cells.j) {
                            org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view3;
                            if (jVar.b0 && jVar.V <= 0.0f) {
                                jVar.h();
                                return false;
                            }
                        }
                        if (i7 == this.H3) {
                            TLRPC.ChatFull chatFull = this.t2;
                            if (chatFull != null) {
                                TLRPC.ChannelLocation channelLocation = chatFull.location;
                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                    str4 = ((TLRPC.TL_channelLocation) channelLocation).address;
                                }
                            }
                        } else if (i7 == this.J3) {
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
                            boolean s5 = org.telegram.messenger.qp.s1(this.currentAccount).s7.s();
                            boolean[] zArr = {i7 == this.V2 || i7 == this.J3 || i7 == this.I3};
                            String M03 = org.telegram.ui.Components.k21.M0();
                            jg.c1 c1Var = new jg.c1(this, view3, str6, i7, zArr, strArr, M03);
                            if (zArr[0]) {
                                org.telegram.messenger.b6.d(str6, new org.telegram.ui.Components.od(this, strArr, zArr, M03, s5, c1Var), new li0(c1Var, 11), false);
                                return true;
                            }
                            c1Var.run();
                            return true;
                        }
                    }
                    return true;
                }
            } else if ((i7 == this.N3 || i7 == this.O3) && getParentActivity() != null && (userFull2 = this.u2) != null) {
                if (i7 != this.N3) {
                    if (i7 == this.O3 && !Z3(i7, view3)) {
                        TLRPC.TL_businessLocation tL_businessLocation = this.u2.business_location;
                        if (tL_businessLocation != null) {
                            str2 = tL_businessLocation.address;
                            String str7 = str2;
                            AtomicReference atomicReference = new AtomicReference();
                            org.telegram.ui.Components.wn wnVar = new org.telegram.ui.Components.wn(R.drawable.popup_fixed_alert, i12, 1, getParentActivity(), this.z0);
                            wnVar.U = new Path();
                            wnVar.setFitItems(true);
                            org.telegram.ui.ActionBar.r0.c(false, false, wnVar, R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131751767, null), false, this.z0).setOnClickListener(new di.t5(this, atomicReference, str7, i7, 5));
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(wnVar, -2, -2);
                            g1Var.e = true;
                            g1Var.c = org.telegram.messenger.qs.x3;
                            g1Var.setOutsideTouchable(true);
                            g1Var.setClippingEnabled(true);
                            g1Var.setAnimationStyle(R.style.PopupContextAnimation);
                            g1Var.setFocusable(true);
                            wnVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            g1Var.setInputMethodMode(2);
                            g1Var.getContentView().setFocusableInTouchMode(true);
                            atomicReference.set(g1Var);
                            f12 = f10;
                            f13 = f11;
                            while (view3 != null) {
                                f12 += view3.getX();
                                f13 += view3.getY();
                                view3 = (View) view3.getParent();
                            }
                            if (org.telegram.messenger.g0.Q1()) {
                                f12 += view2.getX() + view2.getPaddingLeft();
                                f13 += view2.getY() + view2.getPaddingTop();
                            }
                            g1Var.showAtLocation(getFragmentView(), 0, (int) (f12 - (wnVar.getMeasuredWidth() / 2.0f)), (int) f13);
                            g1Var.b();
                            return true;
                        }
                    }
                    return true;
                }
                TL_account.TL_businessWorkHours tL_businessWorkHours = userFull2.business_work_hours;
                if (tL_businessWorkHours != null) {
                    str2 = kg.c1.k0(this.currentAccount, userFull2.user, tL_businessWorkHours);
                    String str72 = str2;
                    AtomicReference atomicReference2 = new AtomicReference();
                    org.telegram.ui.Components.wn wnVar2 = new org.telegram.ui.Components.wn(R.drawable.popup_fixed_alert, i12, 1, getParentActivity(), this.z0);
                    wnVar2.U = new Path();
                    wnVar2.setFitItems(true);
                    org.telegram.ui.ActionBar.r0.c(false, false, wnVar2, R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131751767, null), false, this.z0).setOnClickListener(new di.t5(this, atomicReference2, str72, i7, 5));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(wnVar2, -2, -2);
                    g1Var2.e = true;
                    g1Var2.c = org.telegram.messenger.qs.x3;
                    g1Var2.setOutsideTouchable(true);
                    g1Var2.setClippingEnabled(true);
                    g1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                    g1Var2.setFocusable(true);
                    wnVar2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                    g1Var2.setInputMethodMode(2);
                    g1Var2.getContentView().setFocusableInTouchMode(true);
                    atomicReference2.set(g1Var2);
                    f12 = f10;
                    f13 = f11;
                    while (view3 != null && view3 != getFragmentView()) {
                        f12 += view3.getX();
                        f13 += view3.getY();
                        view3 = (View) view3.getParent();
                    }
                    if (org.telegram.messenger.g0.Q1() && (view2 = this.parentLayout.getView()) != null) {
                        f12 += view2.getX() + view2.getPaddingLeft();
                        f13 += view2.getY() + view2.getPaddingTop();
                    }
                    g1Var2.showAtLocation(getFragmentView(), 0, (int) (f12 - (wnVar2.getMeasuredWidth() / 2.0f)), (int) f13);
                    g1Var2.b();
                    return true;
                }
            }
        }
        return false;
    }

    public final void Q5() {
        if (this.s == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.li, this.z0);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.mi, this.z0);
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ki, this.z0);
            if (this.g6 != null && org.telegram.ui.ActionBar.k6.e1(w02)) {
                w02 = org.telegram.ui.ActionBar.k6.b(0.05f, -0.04f, this.g6.c(false));
                org.telegram.messenger.fp fpVar = this.g6;
                if (fpVar != null) {
                    int d = fpVar.d(org.telegram.ui.ActionBar.k6.I.q());
                    w03 = org.telegram.ui.ActionBar.k6.D(org.telegram.ui.ActionBar.k6.I.q(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, this.z0), d, w03, d);
                }
                w04 = -1;
            }
            org.telegram.ui.Components.ch0 ch0Var = this.o6;
            org.telegram.ui.Components.ch0 ch0Var2 = this.s;
            int[] iArr = this.p6;
            if (ch0Var == ch0Var2 && iArr[0] == w02 && iArr[1] == w03 && iArr[2] == w04) {
                return;
            }
            this.o6 = ch0Var2;
            iArr[0] = w02;
            iArr[1] = w03;
            iArr[2] = w04;
            Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(mutate, org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(56.0f), w02, w03), 0, 0);
            int L = org.telegram.messenger.g0.L(56.0f);
            int L2 = org.telegram.messenger.g0.L(56.0f);
            xpVar.e = L;
            xpVar.f = L2;
            this.s.setBackground(xpVar);
            this.s.setColorFilter(new PorterDuffColorFilter(w04, mode));
        } catch (Exception unused) {
        }
    }

    public final void R3() {
        org.telegram.ui.Components.lu0 lu0Var = this.S;
        if (lu0Var != null) {
            lu0Var.setVisibility(!this.R5 && this.X5);
        }
    }

    public final void R4() {
        ValueAnimator valueAnimator;
        if (!this.o2 || (valueAnimator = this.i2) == null || !valueAnimator.isRunning()) {
            S4(L3(), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0));
        } else {
            this.d2 = this.a6;
            this.f2 = this.b6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x03de, code lost:
    
        if (org.telegram.messenger.t3.q0(r1, org.telegram.messenger.qp.s1(r1).q7.f(r2.id, r13)) != false) goto L171;
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
    public final void S3(boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        TLRPC.ChatFull chatFull;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z22;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        boolean z23;
        TLRPC.ChatFull chatFull2;
        int i7;
        org.telegram.ui.Components.ef0 ef0Var;
        boolean z24;
        boolean z25;
        boolean z26;
        long j3;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || this.S0 == null) {
            return;
        }
        Context context = kVar.getContext();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.S0.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        this.N0 = false;
        this.L0 = false;
        this.K0 = false;
        this.M0 = false;
        this.z1 = false;
        boolean z27 = true;
        if (this.d1 == 0) {
            if (this.e1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.e1));
                this.o1 = false;
                if (this.f1 == 0 && org.telegram.messenger.t3.w(1, M0)) {
                    T3(context);
                }
                if (org.telegram.messenger.t3.T(M0)) {
                    if (this.p1) {
                        int i10 = this.currentAccount;
                        long j10 = this.f1;
                        if (!org.telegram.messenger.t3.y(15, M0)) {
                            if (M0 != null && M0.forum) {
                            }
                        }
                        this.N0 = true;
                    } else if (org.telegram.messenger.t3.N(M0) || (M0.megagroup && org.telegram.messenger.t3.w(1, M0))) {
                        this.N0 = true;
                    }
                    if (this.t2 != null) {
                        if (org.telegram.messenger.t3.w(14, M0) && this.t2.call == null) {
                            this.S0.e(15, R.drawable.msg_voicechat, (!M0.megagroup || M0.gigagroup) ? org.telegram.messenger.hd.M0(2131744905, null) : org.telegram.messenger.hd.M0(2131744903, null));
                            this.o1 = true;
                            if (!M0.megagroup || M0.gigagroup) {
                                z23 = false;
                                z20 = true;
                                chatFull2 = this.t2;
                                if ((!chatFull2.can_view_stats || chatFull2.can_view_revenue || chatFull2.can_view_stars_revenue || getMessagesController().P1().j(a())) && this.f1 == 0) {
                                    this.S0.e(19, R.drawable.msg_stats, org.telegram.messenger.hd.M0(2131744893, null));
                                }
                                org.telegram.messenger.r3 g12 = getMessagesController().g1(this.e1, false, null);
                                this.L0 = g12 == null;
                                z19 = g12 == null || z23;
                            } else {
                                z23 = true;
                            }
                        } else {
                            z23 = false;
                        }
                        z20 = false;
                        chatFull2 = this.t2;
                        if (!chatFull2.can_view_stats) {
                        }
                        this.S0.e(19, R.drawable.msg_stats, org.telegram.messenger.hd.M0(2131744893, null));
                        org.telegram.messenger.r3 g122 = getMessagesController().g1(this.e1, false, null);
                        this.L0 = g122 == null;
                        if (g122 == null) {
                        }
                    } else {
                        z19 = false;
                        z20 = false;
                    }
                    getMessagesController().P1();
                    if (M0 == null || !org.telegram.messenger.t3.R(M0) || (!M0.creator && ((tL_chatAdminRights2 = M0.admin_rights) == null || !tL_chatAdminRights2.post_stories))) {
                        getMessagesController().P1();
                        if (M0 != null && org.telegram.messenger.t3.R(M0) && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.edit_stories))) {
                            this.S0.e(39, R.drawable.msg_archive, org.telegram.messenger.hd.M0(2131747809, null));
                        }
                        z21 = false;
                    } else {
                        this.S0.e(39, R.drawable.msg_archive, org.telegram.messenger.hd.M0(2131747809, null));
                        z21 = true;
                    }
                    if (!M0.megagroup) {
                        if (org.telegram.messenger.t3.t0(M0)) {
                            this.S0.e(10, R.drawable.msg_share, org.telegram.messenger.hd.M0(2131752982, null));
                            z11 = !M0.creator;
                        } else {
                            z11 = false;
                        }
                        boolean z28 = org.telegram.messenger.r2.a;
                        if (getMessagesController().h7) {
                            z22 = false;
                        } else {
                            bi.ea.y(this.currentAccount, false).U();
                            this.S0.e(38, R.drawable.msg_gift_premium, org.telegram.messenger.hd.M0(2131746635, null));
                            org.telegram.ui.ActionBar.f5 f5Var = this.S0;
                            TLRPC.ChatFull chatFull3 = this.t2;
                            f5Var.Q(38, chatFull3 != null && chatFull3.stargifts_available);
                            z22 = true;
                        }
                        TLRPC.ChatFull chatFull4 = this.t2;
                        if (chatFull4 == null || chatFull4.linked_chat_id == 0) {
                            z14 = false;
                        } else {
                            this.S0.e(22, R.drawable.msg_discussion, org.telegram.messenger.hd.M0(2131743556, null));
                            z14 = true;
                        }
                        if (this.f1 == 0) {
                            this.S0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.M0(2131754390, null));
                        }
                        TLRPC.Chat chat = this.D2;
                        if (chat.creator) {
                            this.S0.a(-1);
                            this.S0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131749003, null));
                            this.S0.e(45, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131752422, null)).c(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                        } else if (chat.left || chat.kicked) {
                            z16 = z22;
                            z15 = z20;
                            z12 = z21;
                            z27 = false;
                            z13 = z19;
                        } else {
                            this.S0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131749003, null));
                        }
                        z16 = z22;
                        z15 = z20;
                        z12 = z21;
                        z27 = false;
                        z13 = z19;
                        z10 = true;
                        if (this.q0 == null) {
                        }
                        if (u4()) {
                        }
                        if (this.d1 != 0) {
                            org.telegram.ui.ActionBar.z0 e10 = this.S0.e(24, R.drawable.msg_report, org.telegram.messenger.hd.M0(2131746232, null));
                            int i11 = org.telegram.ui.ActionBar.k6.p7;
                            e10.c(i11, i11);
                        }
                        if (z27) {
                            this.S0.e(31, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131748742, null));
                        }
                        if (!this.o2) {
                        }
                        this.K0 = this.L0;
                        ef0Var = this.Z;
                        if (ef0Var == null) {
                        }
                        B5(z9);
                        L5(z24);
                    }
                    TLRPC.ChatFull chatFull5 = this.t2;
                    if (chatFull5 == null || !chatFull5.participants_hidden || org.telegram.messenger.t3.N(M0)) {
                        this.z1 = true;
                        this.S0.e(17, R.drawable.msg_search, org.telegram.messenger.hd.M0(2131745758, null));
                    }
                    if (this.p1) {
                        int i12 = this.currentAccount;
                        long j11 = this.f1;
                        if (j11 != 1 && org.telegram.messenger.t3.e(i12, M0, org.telegram.messenger.qp.s1(i12).q7.f(M0.id, j11))) {
                            this.S0.e(23, R.drawable.msg_delete, org.telegram.messenger.hd.K0(1, "DeleteTopics"));
                        }
                    }
                    if (this.f1 == 0) {
                        this.S0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.M0(2131754390, null));
                    }
                    if (M0.creator) {
                        this.S0.a(-1);
                        this.S0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131748990, null));
                        this.S0.e(45, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751531, null)).c(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                    } else if (M0.left || M0.kicked || this.p1) {
                        z15 = z20;
                        z12 = z21;
                        z11 = false;
                        z27 = false;
                        z14 = false;
                        z16 = false;
                        z13 = z19;
                    } else {
                        this.S0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131748990, null));
                    }
                    z15 = z20;
                    z12 = z21;
                    z11 = false;
                    z27 = false;
                    z14 = false;
                    z16 = false;
                    z13 = z19;
                    z10 = true;
                    if (this.q0 == null) {
                        this.S0.e(33, R.drawable.msg_openprofile, org.telegram.messenger.hd.M0(2131745543, null));
                        i7 = 21;
                        this.S0.e(21, R.drawable.msg_gallery, org.telegram.messenger.hd.M0(2131745930, null));
                        this.S0.e(35, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751599, null));
                    } else {
                        i7 = 21;
                        this.S0.e(21, R.drawable.msg_gallery, org.telegram.messenger.hd.M0(2131745930, null));
                    }
                    if (u4()) {
                        this.S0.t(i7);
                    }
                    if (this.d1 != 0 && !this.q2 && !this.r1) {
                        org.telegram.ui.ActionBar.z0 e102 = this.S0.e(24, R.drawable.msg_report, org.telegram.messenger.hd.M0(2131746232, null));
                        int i112 = org.telegram.ui.ActionBar.k6.p7;
                        e102.c(i112, i112);
                    }
                    if (z27 && !this.r1) {
                        this.S0.e(31, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131748742, null));
                    }
                    if (!this.o2) {
                        this.S0.t(21);
                        this.S0.t(33);
                        this.S0.S(36);
                        this.S0.t(34);
                        this.S0.t(35);
                    }
                    this.K0 = this.L0;
                    ef0Var = this.Z;
                    if (ef0Var == null) {
                        ef0Var.F = true;
                        ef0Var.o(4, z11);
                        this.Z.o(5, this.L0);
                        this.Z.o(6, this.M0);
                        this.Z.o(2, z14);
                        this.Z.o(9, z10);
                        this.Z.o(12, z12);
                        this.Z.o(10, z13);
                        this.Z.o(11, z15);
                        this.Z.o(3, z16);
                        z24 = false;
                        this.M0 = false;
                        this.L0 = false;
                        if (!z14) {
                            if (this.p1) {
                                this.Z.o(0, true);
                            } else {
                                if (this.e1 != 0) {
                                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.e1));
                                    if (org.telegram.messenger.t3.c0(M02) || org.telegram.messenger.t3.n0(M02)) {
                                        z24 = false;
                                        this.Z.o(0, true);
                                    } else if (!org.telegram.messenger.t3.T(M02)) {
                                        z24 = false;
                                        this.Z.o(0, true);
                                    }
                                }
                                z24 = false;
                            }
                        }
                        org.telegram.ui.Components.ef0 ef0Var2 = this.Z;
                        if (ef0Var2.F) {
                            ef0Var2.F = z24;
                            ef0Var2.d();
                        }
                    } else {
                        z24 = false;
                    }
                    B5(z9);
                    L5(z24);
                }
                if (this.t2 != null) {
                    if (org.telegram.messenger.t3.w(14, M0) && this.t2.call == null) {
                        this.S0.e(15, R.drawable.msg_voicechat, org.telegram.messenger.hd.M0(2131744903, null));
                        this.o1 = true;
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    org.telegram.messenger.r3 g13 = getMessagesController().g1(this.e1, false, null);
                    this.L0 = g13 != null;
                    if (g13 != null || z18) {
                        z17 = true;
                        if (org.telegram.messenger.t3.w(1, M0)) {
                            this.N0 = true;
                        }
                        if (!org.telegram.messenger.t3.k0(M0) && !org.telegram.messenger.t3.l0(M0) && ((chatFull = this.t2) == null || !chatFull.participants_hidden || org.telegram.messenger.t3.N(M0))) {
                            this.z1 = true;
                            this.S0.e(17, R.drawable.msg_search, org.telegram.messenger.hd.M0(2131745758, null));
                        }
                        if (this.f1 == 0) {
                            this.S0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.M0(2131754390, null));
                        }
                        this.S0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131751574, null));
                        z13 = z17;
                        z10 = true;
                        z11 = false;
                        z12 = false;
                    }
                }
                z17 = false;
                if (org.telegram.messenger.t3.w(1, M0)) {
                }
                if (!org.telegram.messenger.t3.k0(M0)) {
                    this.z1 = true;
                    this.S0.e(17, R.drawable.msg_search, org.telegram.messenger.hd.M0(2131745758, null));
                }
                if (this.f1 == 0) {
                }
                this.S0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131751574, null));
                z13 = z17;
                z10 = true;
                z11 = false;
                z12 = false;
            } else {
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            z27 = false;
            z14 = false;
            z15 = false;
            z16 = false;
            if (this.q0 == null) {
            }
            if (u4()) {
            }
            if (this.d1 != 0) {
            }
            if (z27) {
            }
            if (!this.o2) {
            }
            this.K0 = this.L0;
            ef0Var = this.Z;
            if (ef0Var == null) {
            }
            B5(z9);
            L5(z24);
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.d1));
        if (a22 == null) {
            return;
        }
        if (org.telegram.messenger.t10.B(a22)) {
            if (this.r1) {
                org.telegram.ui.Components.ef0 ef0Var3 = this.Z;
                if (ef0Var3 != null) {
                    this.N0 = !(ef0Var3.E == 6);
                } else {
                    this.N0 = true;
                }
            }
            if (!this.I0) {
                this.S0.e(30, R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131751279, null));
                if (this.q0 != null) {
                    this.S0.e(36, R.drawable.msg_addphoto, org.telegram.messenger.hd.M0(2131754392, null));
                }
            }
            this.U0 = this.S0.e(40, R.drawable.menu_profile_colors, org.telegram.messenger.hd.M0(2131746679, null));
            r5();
            if (this.r1) {
                this.W0 = this.S0.e(43, R.drawable.menu_username_change, org.telegram.messenger.hd.M0(2131746619, null));
                this.V0 = this.S0.e(42, R.drawable.msg_link2, org.telegram.messenger.hd.M0(2131746678, null));
                C5();
            }
            z25 = false;
            z26 = false;
        } else {
            if (a22.bot && a22.bot_can_edit) {
                this.N0 = true;
            }
            TLRPC.UserFull userFull = this.u2;
            if (userFull != null && userFull.phone_calls_available) {
                this.L0 = true;
                this.M0 = userFull.video_calls_available;
            }
            if (!this.q2 && getContactsController().f0.get(Long.valueOf(this.d1)) != null) {
                if (this.C2 == null) {
                    T3(context);
                }
                if (!TextUtils.isEmpty(a22.phone)) {
                    this.S0.e(3, R.drawable.msg_share, org.telegram.messenger.hd.M0(2131745462, null));
                }
                this.S0.e(2, R.drawable.msg_block, !this.j1 ? org.telegram.messenger.hd.M0(2131753693, null) : org.telegram.messenger.hd.M0(2131743912, null));
                this.S0.e(4, R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131751283, null));
                this.S0.e(5, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751553, null));
            } else if (org.telegram.messenger.qp.F2(a22)) {
                if (this.j1) {
                    this.S0.e(2, R.drawable.msg_block, org.telegram.messenger.hd.M0(2131743912, null));
                }
                this.S0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.M0(2131754390, null));
            } else if (a() != 489000) {
                if (this.C2 == null) {
                    T3(context);
                }
                this.S0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.M0(2131754390, null));
                if (this.q2) {
                    this.S0.e(10, R.drawable.msg_share, org.telegram.messenger.hd.M0(2131752982, null));
                    z25 = true;
                } else {
                    this.S0.e(1, R.drawable.msg_addcontact, org.telegram.messenger.hd.M0(2131754453, null));
                    z25 = false;
                }
                if (!TextUtils.isEmpty(a22.phone)) {
                    this.S0.e(3, R.drawable.msg_share, org.telegram.messenger.hd.M0(2131745462, null));
                }
                if (this.q2) {
                    this.S0.e(44, R.drawable.menu_privacy_policy, org.telegram.messenger.hd.M0(2131753010, null));
                    if (s4()) {
                        this.S0.S(44);
                    } else {
                        this.S0.t(44);
                    }
                    org.telegram.ui.ActionBar.z0 e11 = this.S0.e(24, R.drawable.msg_report, org.telegram.messenger.hd.M0(2131746232, null));
                    int i13 = org.telegram.ui.ActionBar.k6.p7;
                    e11.c(i13, i13);
                    if (this.j1) {
                        this.S0.e(2, R.drawable.msg_retry, org.telegram.messenger.hd.M0(2131752995, null));
                    } else {
                        this.S0.e(2, R.drawable.msg_block2, org.telegram.messenger.hd.M0(2131751575, null)).c(i13, i13);
                    }
                } else {
                    this.S0.e(2, R.drawable.msg_block, !this.j1 ? org.telegram.messenger.hd.M0(2131753693, null) : org.telegram.messenger.hd.M0(2131743912, null));
                }
                if (!org.telegram.messenger.t10.x(a22) && !this.q2 && this.C2 == null && !this.j1) {
                    j3 = this.d1;
                    if (j3 != 333000 && j3 != 777000 && j3 != 42777) {
                        boolean z29 = org.telegram.messenger.r2.a;
                        if (!a22.self || a22.bot || org.telegram.messenger.qp.F2(a22) || getMessagesController().h7) {
                            z26 = false;
                        } else {
                            bi.ea.y(this.currentAccount, false).U();
                            this.S0.e(38, R.drawable.msg_gift_premium, org.telegram.messenger.hd.M0(2131746636, null));
                            z26 = true;
                        }
                        if (((org.telegram.messenger.h0) getMessagesController().x7.j0.b).c && !org.telegram.messenger.qp.F2(a22) && !org.telegram.messenger.t10.A(a22.id)) {
                            this.S0.e(48, R.drawable.ic_gram, org.telegram.messenger.hd.M0(2131743018, null));
                        }
                        this.S0.e(20, R.drawable.msg_secret, org.telegram.messenger.hd.M0(2131744913, null));
                        org.telegram.ui.ActionBar.f5 f5Var2 = this.S0;
                        TL_account.RequirementToContact J2 = getMessagesController().J2(this.d1);
                        f5Var2.Q(20, J2 != null || (J2 instanceof TL_account.requirementToContactEmpty));
                        if (this.u2 != null) {
                            this.S0.e(46, R.drawable.menu_share_off_24, org.telegram.messenger.hd.M0(2131751429, null));
                            this.S0.e(47, R.drawable.menu_share_on_24, org.telegram.messenger.hd.M0(2131751151, null));
                            TLRPC.UserFull userFull2 = this.u2;
                            boolean z30 = (userFull2.noforwards_my_enabled || userFull2.noforwards_peer_enabled) ? false : true;
                            this.S0.Q(46, z30);
                            this.S0.Q(47, !z30);
                        }
                        if (!this.q2 && getContactsController().f0.get(Long.valueOf(this.d1)) != null) {
                            this.S0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.M0(2131754390, null));
                        }
                        z27 = false;
                    }
                }
                z26 = false;
                if (!this.q2) {
                    this.S0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.M0(2131754390, null));
                }
                z27 = false;
            }
            z25 = false;
            if (!org.telegram.messenger.t10.x(a22)) {
                j3 = this.d1;
                if (j3 != 333000) {
                    boolean z292 = org.telegram.messenger.r2.a;
                    if (a22.self) {
                    }
                    z26 = false;
                    if (((org.telegram.messenger.h0) getMessagesController().x7.j0.b).c) {
                        this.S0.e(48, R.drawable.ic_gram, org.telegram.messenger.hd.M0(2131743018, null));
                    }
                    this.S0.e(20, R.drawable.msg_secret, org.telegram.messenger.hd.M0(2131744913, null));
                    org.telegram.ui.ActionBar.f5 f5Var22 = this.S0;
                    TL_account.RequirementToContact J22 = getMessagesController().J2(this.d1);
                    f5Var22.Q(20, J22 != null || (J22 instanceof TL_account.requirementToContactEmpty));
                    if (this.u2 != null) {
                    }
                    if (!this.q2) {
                    }
                    z27 = false;
                }
            }
            z26 = false;
            if (!this.q2) {
            }
            z27 = false;
        }
        z16 = z26;
        z12 = false;
        z13 = false;
        z14 = false;
        z15 = false;
        z11 = z25;
        z10 = false;
        if (this.q0 == null) {
        }
        if (u4()) {
        }
        if (this.d1 != 0) {
        }
        if (z27) {
        }
        if (!this.o2) {
        }
        this.K0 = this.L0;
        ef0Var = this.Z;
        if (ef0Var == null) {
        }
        B5(z9);
        L5(z24);
    }

    public final void S4(float f10, float f11) {
        float max = Math.max(0.0f, Math.min(1.0f, (this.P1 - j4()) / ((this.a.getMeasuredWidth() - f11) - k4())));
        float N = ((org.telegram.messenger.g0.N(8.0f) + (org.telegram.messenger.g0.L(42.0f) * ((this.P1 >= ((float) j4()) || max >= 0.33f) ? org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) : com.google.android.recaptcha.internal.a.y(f10, 72.0f, 24.0f, 42.0f)))) * f10) + ((float) Math.floor(this.actionBar.getTranslationY() + (org.telegram.messenger.camera.q.b(f10, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0) - (org.telegram.messenger.g0.p * 21.0f))));
        this.d2 = (org.telegram.messenger.g0.L(7.0f) * f10) + org.telegram.messenger.g0.L(1.3f) + N;
        this.f2 = (((float) Math.floor(org.telegram.messenger.g0.p * 11.0f)) * f10) + N + org.telegram.messenger.g0.L(24.0f);
    }

    public final void T3(Context context) {
        this.Z0 = new org.telegram.messenger.re(context, this.S0.getPopupLayout().getSwipeBack(), new pu0(this), false, 0, this.z0);
        if (this.h1 > 0 || this.d1 > 0) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, this.z0);
            org.telegram.messenger.re reVar = this.Z0;
            org.telegram.ui.Components.w70 w70Var = (org.telegram.ui.Components.w70) reVar.e;
            if (w70Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131753848, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.O2(org.telegram.messenger.hd.M0(2131753847, null), w02, new org.telegram.ui.Components.xf(reVar, 10)));
                w70Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.u2;
        org.telegram.ui.Components.a01 a10 = org.telegram.ui.Components.a01.a((userFull == null && this.t2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.t2.ttl_period);
        this.s0 = a10;
        this.Y0 = this.S0.h(0, a10, org.telegram.messenger.hd.M0(2131753846, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z0.b);
        this.S0.a(-1);
        o5();
    }

    public final void T4() {
        qu0 qu0Var = this.a;
        if (qu0Var == null || this.c == null || qu0Var.getChildCount() <= 0 || this.m6) {
            return;
        }
        View view = null;
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i10 = -1;
        for (int i11 = 0; i11 < this.a.getChildCount(); i11++) {
            int R = RecyclerView.R(this.a.getChildAt(i11));
            View childAt = this.a.getChildAt(i11);
            if (R != -1 && childAt.getTop() < i7) {
                i7 = childAt.getTop();
                i10 = R;
                view = childAt;
            }
        }
        if (view != null) {
            this.k6 = i10;
            int top = view.getTop();
            this.l6 = top;
            if (this.k6 == 0 && !this.n2 && top > j4()) {
                this.l6 = j4();
            }
            this.c.h1(i10, view.getTop() - this.a.getPaddingTop());
        }
    }

    @Override // org.telegram.ui.Components.i30
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ii.l(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final void U3() {
        if (this.fragmentView == null || !this.n6 || this.x2 == null || getParentActivity() == null) {
            return;
        }
        ax0 ax0Var = this.z6;
        if (ax0Var != null) {
            ax0Var.b(this.x2);
            this.z6.invalidate();
        } else {
            ax0 ax0Var2 = new ax0(this, this.x2);
            this.z6 = ax0Var2;
            ((FrameLayout) this.fragmentView).addView(ax0Var2, c8.ha.e(-1, -1, 55));
        }
    }

    public final void U4(boolean z9) {
        int i7 = this.J4;
        if (i7 >= 0) {
            if (!z9) {
                this.c.h1(i7, -this.a.getPaddingTop());
                return;
            }
            mi.m mVar = new mi.m(getParentActivity(), 2, 0.6f);
            mVar.a = this.J4;
            mVar.p = -this.a.getPaddingTop();
            this.c.w0(mVar);
        }
    }

    @Override // org.telegram.ui.Components.mr0
    public final void V() {
        int i7;
        int i10;
        vv0 vv0Var = this.N;
        if (vv0Var == null || this.r == null) {
            return;
        }
        int closestTab = vv0Var.getClosestTab();
        int[] iArr = this.Q.c;
        if (closestTab == 0) {
            if (iArr[7] <= 0 && iArr[6] <= 0) {
                int i11 = iArr[0];
                if (i11 <= 0) {
                    f5(org.telegram.messenger.hd.M0(2131745410, null));
                    return;
                } else {
                    f5(org.telegram.messenger.hd.G(i11, "Media", new Object[0]));
                    return;
                }
            }
            if (this.N.getPhotosVideosTypeFilter() == 1 || iArr[7] <= 0) {
                f5(org.telegram.messenger.hd.G(iArr[6], "Photos", new Object[0]));
                return;
            }
            if (this.N.getPhotosVideosTypeFilter() == 2 || (i10 = iArr[6]) <= 0) {
                f5(org.telegram.messenger.hd.G(iArr[7], "Videos", new Object[0]));
                return;
            }
            f5(org.telegram.messenger.hd.G(i10, "Photos", new Object[0]) + ", " + org.telegram.messenger.hd.G(iArr[7], "Videos", new Object[0]));
            return;
        }
        if (closestTab == 1) {
            int i12 = iArr[1];
            if (i12 <= 0) {
                f5(org.telegram.messenger.hd.M0(2131750827, null));
                return;
            } else {
                f5(org.telegram.messenger.hd.G(i12, "Files", new Object[0]));
                return;
            }
        }
        if (closestTab == 2) {
            int i13 = iArr[2];
            if (i13 <= 0) {
                f5(org.telegram.messenger.hd.M0(2131743524, null));
                return;
            } else {
                f5(org.telegram.messenger.hd.G(i13, "Voice", new Object[0]));
                return;
            }
        }
        if (closestTab == 3) {
            int i14 = iArr[3];
            if (i14 <= 0) {
                f5(org.telegram.messenger.hd.M0(2131745412, null));
                return;
            } else {
                f5(org.telegram.messenger.hd.G(i14, "Links", new Object[0]));
                return;
            }
        }
        if (closestTab == 4) {
            int i15 = iArr[4];
            if (i15 <= 0) {
                f5(org.telegram.messenger.hd.M0(2131748318, null));
                return;
            } else {
                f5(org.telegram.messenger.hd.G(i15, "MusicFiles", new Object[0]));
                return;
            }
        }
        if (closestTab == 5) {
            int i16 = iArr[5];
            if (i16 <= 0) {
                f5(org.telegram.messenger.hd.M0(2131754879, null));
                return;
            } else {
                f5(org.telegram.messenger.hd.G(i16, "GIFs", new Object[0]));
                return;
            }
        }
        if (closestTab == 6) {
            f5(org.telegram.messenger.hd.G(this.u2.common_chats_count, "CommonGroups", new Object[0]));
            return;
        }
        if (closestTab == 7) {
            f5(this.r.getText());
            return;
        }
        if (closestTab == 8 || org.telegram.ui.Components.xs0.I0(closestTab)) {
            if (this.q2) {
                f5(this.N.f0(false));
                return;
            } else if (this.N.m0(closestTab) > 0) {
                f5(org.telegram.messenger.hd.G(this.N.m0(closestTab), "ProfileStoriesCount", new Object[0]));
                return;
            } else {
                f5(org.telegram.messenger.hd.M0(2131746624, null));
                return;
            }
        }
        if (closestTab == 13) {
            f5(this.N.f0(true));
            return;
        }
        if (closestTab == 9) {
            f5(org.telegram.messenger.hd.G(this.N.m0(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
            return;
        }
        if (closestTab == 10) {
            org.telegram.messenger.ro L0 = org.telegram.messenger.qp.s1(this.currentAccount).L0(a());
            f5(org.telegram.messenger.hd.G(L0 == null ? 0 : L0.b.size() + L0.c, this.q2 ? "Bots" : "Channels", new Object[0]));
            return;
        }
        if (closestTab != 12) {
            if (closestTab == 14) {
                org.telegram.ui.Components.up0 up0Var = this.N.a0;
                f5(org.telegram.messenger.hd.H(',', "ProfileGiftsCount", up0Var != null ? up0Var.getGiftsCount() : 0));
                return;
            } else {
                if (closestTab == 15) {
                    int i17 = iArr[8];
                    if (i17 <= 0) {
                        f5(org.telegram.messenger.hd.M0(2131745404, null));
                        return;
                    } else {
                        f5(org.telegram.messenger.hd.H(',', "ProfilePollsCount", i17));
                        return;
                    }
                }
                return;
            }
        }
        org.telegram.messenger.vv G1 = getMessagesController().G1();
        long a10 = a();
        ArrayList arrayList = G1.j;
        int i18 = 0;
        while (true) {
            if (i18 >= arrayList.size()) {
                i7 = 0;
                break;
            }
            org.telegram.messenger.uv uvVar = (org.telegram.messenger.uv) arrayList.get(i18);
            if (uvVar.a == a10) {
                i7 = uvVar.e;
                break;
            }
            i18++;
        }
        f5(org.telegram.messenger.hd.G(Math.max(1, i7), "SavedMessagesCount", new Object[0]));
    }

    public final void V3(Context context) {
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            org.telegram.messenger.g0.E2(y4Var);
        }
        mv0 mv0Var = new mv0(this, context, this.z0);
        this.simpleActionBar = mv0Var;
        mv0Var.setTitlesAlpha(0.0f);
        if (!this.l5 && !this.I0 && this.I1 != 0 && this.L1 && !this.M1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        this.simpleActionBar.setMenuOverlayProvider(new pe(3, this));
        if (this.I0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.outline_header_qr_24);
            this.simpleActionBar.setBackButtonContentDescription(org.telegram.messenger.hd.M0(2131746499, null));
        } else {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new nt0(this, 2));
        if (this.I0) {
            return;
        }
        View backButton = this.simpleActionBar.getBackButton();
        backButton.setOnLongClickListener(new di.f2(6, this, backButton));
    }

    public final void W4() {
        org.telegram.ui.Components.ef0 ef0Var = this.Z;
        if (ef0Var == null) {
            return;
        }
        if (this.r1) {
            ef0Var.E = 6;
            return;
        }
        if (this.p1) {
            ef0Var.E = 5;
            return;
        }
        if (this.q2) {
            ef0Var.E = 2;
            return;
        }
        if (this.d1 != 0) {
            ef0Var.E = 0;
            return;
        }
        if (this.e1 != 0) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.e1));
            if (!org.telegram.messenger.t3.T(M0)) {
                this.Z.E = 3;
                return;
            }
            if (org.telegram.messenger.t3.n0(M0)) {
                this.Z.E = 3;
            } else if (org.telegram.messenger.t3.c0(M0)) {
                this.Z.E = 4;
            } else {
                this.Z.E = 1;
            }
        }
    }

    @Override // org.telegram.ui.Components.mr0
    public final boolean X() {
        return this.z1;
    }

    public final void X3(float f10) {
        ValueAnimator ofFloat;
        int i7 = 0;
        boolean z9 = f10 > 0.0f;
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.j6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.j6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z9) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.x0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new cu0(this, i7));
        this.j6.playTogether(arrayList);
        this.j6.setDuration(z9 ? 150L : 220L);
        if (!z9) {
            this.j6.addListener(new dv0(this, 6));
        }
        this.j6.start();
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
    public final void X4(float f10) {
        int w02;
        boolean z9;
        uw0 uw0Var;
        int i7;
        int f11;
        bi.g1 g1Var;
        ww0 ww0Var;
        if (this.actionBar == null) {
            return;
        }
        this.glassEngine.g();
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        this.k2 = f10;
        float U1 = org.telegram.messenger.g0.U1(f10, this.l2);
        this.j2 = U1;
        Q3();
        this.X.setScaleX(this.a2);
        this.X.setScaleY(this.a2);
        this.X.setTranslationY(org.telegram.messenger.g0.T1((float) Math.ceil(this.Z1), 0.0f, U1));
        this.e0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(q4(), 0.0f, U1));
        zu0 zu0Var = this.e0;
        float f12 = this.a2;
        boolean z10 = this.o2;
        zu0Var.H = U1;
        zu0Var.I = f12;
        zu0Var.G = z10;
        cv0 cv0Var = this.u0;
        if (cv0Var != null) {
            cv0Var.setExpandProgress(U1);
        }
        bi.g1 g1Var2 = this.v0;
        if (g1Var2 != null) {
            g1Var2.setExpandProgress(U1);
        }
        org.telegram.ui.Components.lu0 lu0Var = this.S;
        if (lu0Var != null) {
            lu0Var.setParentExpanded(U1);
        }
        org.telegram.ui.Components.ef0 ef0Var = this.Z;
        if (ef0Var != null) {
            ef0Var.setParentExpanded(U1);
        }
        Z4(U1);
        org.telegram.ui.Components.zf0 zf0Var = this.b0;
        if (zf0Var != null) {
            zf0Var.setParentExpanded(U1);
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.T0;
        if (f5Var != null) {
            float f13 = 1.0f - U1;
            f5Var.setAlpha(f13);
            this.T0.setScaleY(f13);
            this.T0.setVisibility(0);
            org.telegram.ui.ActionBar.f5 f5Var2 = this.T0;
            f5Var2.setClickable(f5Var2.getAlpha() > 0.5f);
        }
        float L3 = L3();
        if (L3 >= 1.0f) {
            this.e0.setAlpha(1.0f);
        }
        if (!this.o2) {
            S4(L3, currentActionBarHeight);
        } else if (this.P1 >= k4() && this.g2 < 0.33f) {
            R4();
        }
        org.telegram.ui.Components.gk0 gk0Var = this.K;
        if (gk0Var != null) {
            gk0Var.b(i0.a.f(U1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, this.z0), Color.argb(org.telegram.messenger.qs.J2, org.telegram.messenger.qs.e4, org.telegram.messenger.qs.e4, org.telegram.messenger.qs.e4)));
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.g6 != null ? -1 : i0.a.f(U1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.dd, this.z0), -1), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.wq wqVar = this.I;
        if (wqVar != null) {
            wqVar.a(U1);
        }
        org.telegram.ui.Components.wq wqVar2 = this.J;
        if (wqVar2 != null) {
            wqVar2.a(U1);
        }
        t5(U1);
        float f14 = this.c2;
        float f15 = this.e2;
        float N = org.telegram.messenger.g0.N(8.0f);
        float N2 = org.telegram.messenger.g0.N(this.o2 ? 8.0f : -24.0f);
        float N3 = org.telegram.messenger.g0.N(18.0f) - ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin;
        float f16 = currentActionBarHeight;
        float e42 = (((this.P1 + f16) - e4()) - org.telegram.messenger.g0.N(30.0f)) - this.f.getBottom();
        float A = com.google.android.recaptcha.internal.a.A(N3, f14, 2.0f, N + f14);
        float f17 = this.d2;
        float f18 = 1.0f - U1;
        float f19 = f18 * f18;
        float f20 = f18 * 2.0f * U1;
        float f21 = (A * f20) + (f14 * f19);
        float f22 = U1 * U1;
        float f23 = (N3 * f22) + f21;
        float A2 = (e42 * f22) + (com.google.android.recaptcha.internal.a.A(e42, f17, 2.0f, N2 + f17) * f20) + (f17 * f19);
        float N4 = org.telegram.messenger.g0.N(16.0f) - ((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin;
        float e43 = (((this.P1 + f16) - e4()) - org.telegram.messenger.g0.N(10.0f)) - this.r.getBottom();
        float A3 = com.google.android.recaptcha.internal.a.A(N4, f15, 2.0f, N + f15);
        float f24 = this.f2;
        float f25 = (N4 * f22) + (A3 * f20) + (f15 * f19);
        float A4 = (f22 * e43) + (f20 * com.google.android.recaptcha.internal.a.A(e43, f24, 2.0f, N2 + f24)) + (f19 * f24);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - (org.telegram.messenger.g0.p * 21.0f)))) + org.telegram.messenger.g0.L(1.3f);
        float N5 = org.telegram.messenger.g0.N(22.7f) + floor;
        this.f.setTranslationX(f23);
        this.f.setTranslationY(Math.max(floor, A2));
        this.r.setTranslationX(m4(f25, Math.min(1.0f, L3) * this.v6));
        this.r.setTranslationY(n4(Math.max(N5, A4)));
        n5();
        E5();
        Object tag = this.r.getTag();
        if (tag instanceof Integer) {
            Integer num = (Integer) tag;
            w02 = org.telegram.ui.ActionBar.k6.w0(num.intValue(), this.z0);
            if (num.intValue() == org.telegram.ui.ActionBar.k6.pi) {
                z9 = true;
                this.r.setTextColor(i0.a.f(U1, I3(w02, Boolean.valueOf(z9)), -1275068417));
                if (this.P1 > k4()) {
                    this.f.setPivotY(org.telegram.messenger.g0.W1(U1, 0, r5.getMeasuredHeight()));
                    float f26 = (0.12f * L3) + 1.0f;
                    this.f.setScaleX(org.telegram.messenger.g0.T1(f26, 1.38f, U1));
                    this.f.setScaleY(org.telegram.messenger.g0.T1(f26, 1.38f, U1));
                }
                z4(0, Math.min(1.0f, L3), true);
                uw0Var = this.y6;
                if (uw0Var != null) {
                    uw0Var.a(i0.a.f(this.j2, org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.b(0.18f, -0.1f, this.b1)), 603979775));
                }
                ok okVar = this.f;
                if (this.g6 == null) {
                    f11 = -1;
                    i7 = -1;
                } else {
                    i7 = -1;
                    f11 = i0.a.f(this.j2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ji, this.z0), -1);
                }
                okVar.setTextColor(f11);
                this.actionBar.D(this.g6 == null ? i7 : i0.a.f(U1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.z0), i7), false);
                this.actionBar.setMenuOffsetSuppressed(true);
                this.e0.setForegroundAlpha(U1);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.X.getLayoutParams();
                layoutParams.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.a.getMeasuredWidth() / this.a2, U1);
                layoutParams.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.P1 + f16) / this.a2, U1);
                d4();
                this.X.requestLayout();
                g1Var = this.v0;
                if (g1Var != null) {
                    g1Var.setExpandProgress(U1);
                }
                q5();
                ww0Var = this.c1;
                if (ww0Var == null && ww0Var.K) {
                    ww0Var.invalidate();
                    return;
                }
            }
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.z0);
        }
        z9 = false;
        this.r.setTextColor(i0.a.f(U1, I3(w02, Boolean.valueOf(z9)), -1275068417));
        if (this.P1 > k4()) {
        }
        z4(0, Math.min(1.0f, L3), true);
        uw0Var = this.y6;
        if (uw0Var != null) {
        }
        ok okVar2 = this.f;
        if (this.g6 == null) {
        }
        okVar2.setTextColor(f11);
        this.actionBar.D(this.g6 == null ? i7 : i0.a.f(U1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.z0), i7), false);
        this.actionBar.setMenuOffsetSuppressed(true);
        this.e0.setForegroundAlpha(U1);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.X.getLayoutParams();
        layoutParams2.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.a.getMeasuredWidth() / this.a2, U1);
        layoutParams2.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.P1 + f16) / this.a2, U1);
        d4();
        this.X.requestLayout();
        g1Var = this.v0;
        if (g1Var != null) {
        }
        q5();
        ww0Var = this.c1;
        if (ww0Var == null) {
        }
    }

    public final void Y3(int i7, View view) {
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, view);
        H.W(this.a.U0(view, false));
        H.w = false;
        H.l(R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131751767, null), new j90(this, 4), this.u2 != null);
        H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131751336, null), new j90(this, 5), false);
        H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.Components.r2(this, i7, 23), true);
        H.Z();
    }

    public final boolean Z3(final int i7, View view) {
        TLRPC.User f10;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        final int i10 = 0;
        if (this.r1 && (f10 = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.u2;
            if (userFull == null) {
                userFull = getMessagesController().b2(f10.id);
            }
            if (userFull != null) {
                String M0 = org.telegram.messenger.hd.M0(2131751767, null);
                String M02 = org.telegram.messenger.hd.M0(2131744195, null);
                if (i7 == this.J3 || i7 == this.I3 || i7 == this.V2) {
                    str = userFull.about;
                    if (i7 == this.V2) {
                        M02 = org.telegram.messenger.hd.M0(2131753721, null);
                    }
                } else if (i7 == this.N3) {
                    str = kg.c1.k0(this.currentAccount, f10, userFull.business_work_hours);
                    M0 = org.telegram.messenger.hd.M0(2131746664, null);
                    M02 = org.telegram.messenger.hd.M0(2131752761, null);
                } else if (i7 == this.O3) {
                    str = userFull.business_location.address;
                    M0 = org.telegram.messenger.hd.M0(2131746659, null);
                    M02 = org.telegram.messenger.hd.M0(2131752693, null);
                } else if (i7 == this.K3) {
                    str = org.telegram.messenger.t10.n(f10);
                    if (str != null) {
                        str = "@".concat(str);
                    }
                    M0 = org.telegram.messenger.hd.M0(2131746677, null);
                    M02 = org.telegram.messenger.hd.M0(2131743666, null);
                } else if (i7 == this.F3) {
                    str = f10.phone;
                    M02 = org.telegram.messenger.hd.M0(2131747294, null);
                } else if (i7 == this.T2) {
                    str = UserInfoActivity.e0(this.u2.birthday);
                    M02 = org.telegram.messenger.hd.M0(2131753716, null);
                } else {
                    str = null;
                }
                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, view);
                H.W(this.a.U0(view, false));
                H.w = false;
                H.i = 3;
                if (i7 == this.O3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, org.telegram.messenger.hd.M0(2131746655, null), new j90(this, 7), false);
                    }
                    H.c(R.drawable.msg_map, org.telegram.messenger.hd.M0(2131746657, null), new j90(this, 9), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, M0, new mc0(this, str, M02, 25), false);
                }
                final int i11 = 1;
                if (i7 == this.N3) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131746663, null), new j90(this, 10), false);
                    H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131746662, null), new Runnable(this) { // from class: org.telegram.ui.au0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i12 = i10;
                            final int i13 = i7;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i12) {
                                case 0:
                                    RectF rectF = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.hd.M0(2131752762, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                    u1Var.R = M03;
                                    u1Var.T = org.telegram.messenger.hd.M0(2131752763, null);
                                    final int i14 = 1;
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.eu0
                                        @Override // org.telegram.ui.ActionBar.r1
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i15) {
                                            int i16 = i14;
                                            int i17 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF2 = ProfileActivity.S6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new gu0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.S6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new gu0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var);
                                    break;
                                default:
                                    RectF rectF2 = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.hd.M0(2131752694, null);
                                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                                    u1Var2.R = M04;
                                    u1Var2.T = org.telegram.messenger.hd.M0(2131752695, null);
                                    final int i15 = 0;
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.eu0
                                        @Override // org.telegram.ui.ActionBar.r1
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i152) {
                                            int i16 = i15;
                                            int i17 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.S6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new gu0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.S6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new gu0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i7 == this.O3) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131746658, null), new j90(this, 11), false);
                    H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131746656, null), new Runnable(this) { // from class: org.telegram.ui.au0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i12 = i11;
                            final int i13 = i7;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i12) {
                                case 0:
                                    RectF rectF = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.hd.M0(2131752762, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                    u1Var.R = M03;
                                    u1Var.T = org.telegram.messenger.hd.M0(2131752763, null);
                                    final int i14 = 1;
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.eu0
                                        @Override // org.telegram.ui.ActionBar.r1
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i152) {
                                            int i16 = i14;
                                            int i17 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.S6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new gu0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.S6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new gu0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var);
                                    break;
                                default:
                                    RectF rectF2 = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.hd.M0(2131752694, null);
                                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                                    u1Var2.R = M04;
                                    u1Var2.T = org.telegram.messenger.hd.M0(2131752695, null);
                                    final int i15 = 0;
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.eu0
                                        @Override // org.telegram.ui.ActionBar.r1
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i152) {
                                            int i16 = i15;
                                            int i17 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.S6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new gu0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.S6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new gu0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i7 == this.K3) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131746619, null), new j90(this, 12), false);
                } else if (i7 == this.J3 || i7 == this.I3 || i7 == this.V2) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131746676, null), new j90(this, 13), false);
                } else if (i7 == this.F3) {
                    H.c(R.drawable.menu_storage_path, org.telegram.messenger.hd.M0(2131746645, null), new j90(this, 14), false);
                } else if (i7 == this.T2) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131746722, null), new Runnable(this) { // from class: org.telegram.ui.yt0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i12 = i10;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i12) {
                                case 0:
                                    RectF rectF = ProfileActivity.S6;
                                    profileActivity.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131751239, null), org.telegram.messenger.hd.M0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.ex(20, profileActivity, userFull2), new j90(profileActivity, 15), false, false, profileActivity.z0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.hd.M0(2131753717, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                    u1Var.R = M03;
                                    u1Var.T = org.telegram.messenger.hd.M0(2131753718, null);
                                    final int i13 = 0;
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.du0
                                        @Override // org.telegram.ui.ActionBar.r1
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i14) {
                                            int i15 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i15) {
                                                case 0:
                                                    RectF rectF3 = ProfileActivity.S6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().m2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new gu0(profileActivity2, 2));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.S6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new gu0(profileActivity2, 0));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.hd.M0(2131746681, null);
                                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                                    u1Var2.R = M04;
                                    u1Var2.T = org.telegram.messenger.hd.M0(2131746682, null);
                                    final int i14 = 1;
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.du0
                                        @Override // org.telegram.ui.ActionBar.r1
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i142) {
                                            int i15 = i14;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i15) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.S6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().m2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new gu0(profileActivity2, 2));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.S6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new gu0(profileActivity2, 0));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var2);
                                    break;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131746320, null), new Runnable(this) { // from class: org.telegram.ui.yt0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i12 = i11;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i12) {
                                case 0:
                                    RectF rectF = ProfileActivity.S6;
                                    profileActivity.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131751239, null), org.telegram.messenger.hd.M0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.ex(20, profileActivity, userFull2), new j90(profileActivity, 15), false, false, profileActivity.z0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.hd.M0(2131753717, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                    u1Var.R = M03;
                                    u1Var.T = org.telegram.messenger.hd.M0(2131753718, null);
                                    final int i13 = 0;
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.du0
                                        @Override // org.telegram.ui.ActionBar.r1
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i142) {
                                            int i15 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i15) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.S6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().m2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new gu0(profileActivity2, 2));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.S6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new gu0(profileActivity2, 0));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.hd.M0(2131746681, null);
                                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                                    u1Var2.R = M04;
                                    u1Var2.T = org.telegram.messenger.hd.M0(2131746682, null);
                                    final int i14 = 1;
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.du0
                                        @Override // org.telegram.ui.ActionBar.r1
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i142) {
                                            int i15 = i14;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i15) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.S6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().m2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new gu0(profileActivity2, 2));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.S6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new gu0(profileActivity2, 0));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i7 == this.P2) {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(userFull.personal_channel_id));
                    if (M03 != null && org.telegram.messenger.t3.K(M03, false) != null) {
                        H.c(R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131746680, null), new qn0(17, this, M03), false);
                    }
                    H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131746683, null), new j90(this, 8), false);
                    final int i12 = 2;
                    H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131746320, null), new Runnable(this) { // from class: org.telegram.ui.yt0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i122 = i12;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i122) {
                                case 0:
                                    RectF rectF = ProfileActivity.S6;
                                    profileActivity.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131751239, null), org.telegram.messenger.hd.M0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.ex(20, profileActivity, userFull2), new j90(profileActivity, 15), false, false, profileActivity.z0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M032 = org.telegram.messenger.hd.M0(2131753717, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                    u1Var.R = M032;
                                    u1Var.T = org.telegram.messenger.hd.M0(2131753718, null);
                                    final int i13 = 0;
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.du0
                                        @Override // org.telegram.ui.ActionBar.r1
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i142) {
                                            int i15 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i15) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.S6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().m2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new gu0(profileActivity2, 2));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.S6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new gu0(profileActivity2, 0));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.S6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.hd.M0(2131746681, null);
                                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                                    u1Var2.R = M04;
                                    u1Var2.T = org.telegram.messenger.hd.M0(2131746682, null);
                                    final int i14 = 1;
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746320, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.du0
                                        @Override // org.telegram.ui.ActionBar.r1
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i142) {
                                            int i15 = i14;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i15) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.S6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().m2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new gu0(profileActivity2, 2));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.S6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new gu0(profileActivity2, 0));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(u1Var2);
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

    public final void Z4(float f10) {
        this.J5 = f10;
        org.telegram.ui.Components.if0 if0Var = this.I5;
        if (if0Var != null) {
            if0Var.b(f10);
        }
        A5();
    }

    public final long a() {
        long j3 = this.h1;
        if (j3 != 0) {
            return j3;
        }
        long j10 = this.d1;
        return j10 != 0 ? j10 : -this.e1;
    }

    public final boolean a4() {
        View view;
        if ((this.I0 || (!org.telegram.messenger.g0.Q1() && !this.m2)) && this.e0.getImageReceiver().L() && !org.telegram.messenger.g0.C1()) {
            this.F0 = true;
            this.n2 = true;
            int i7 = 0;
            while (true) {
                if (i7 >= this.a.getChildCount()) {
                    view = null;
                    break;
                }
                if (RecyclerView.R(this.a.getChildAt(i7)) == 0) {
                    view = this.a.getChildAt(i7);
                    break;
                }
                i7++;
            }
            if (view != null) {
                qu0 qu0Var = this.a;
                View F = qu0Var.F(view);
                v4.d1 T = F != null ? qu0Var.T(F) : null;
                if (T != null) {
                    Integer num = (Integer) this.X1.get(Integer.valueOf(T.b()));
                    if (num != null) {
                        this.O1 = true;
                        this.a.w0(0, -(((this.a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.xq.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void a5(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.t2 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.l1 == 0) {
                this.l1 = -j3;
                getMediaDataController().e0(this.l1, this.classGuid, this.f1);
            }
        }
        vv0 vv0Var = this.N;
        if (vv0Var != null) {
            vv0Var.setChatInfo(this.t2);
        }
        av0 av0Var = this.n0;
        if (av0Var != null && !this.p1) {
            av0Var.setChatInfo(this.t2);
        }
        cv0 cv0Var = this.u0;
        if (cv0Var != null && (chatFull3 = this.t2) != null) {
            cv0Var.setStories(chatFull3.stories);
        }
        bi.g1 g1Var = this.v0;
        if (g1Var != null) {
            g1Var.a();
        }
        zu0 zu0Var = this.e0;
        if (zu0Var != null) {
            zu0Var.setHasStories(x4());
        }
        b4();
        if (this.e1 != 0) {
            boolean z9 = org.telegram.messenger.r2.a;
            boolean z10 = (getMessagesController().h7 || (chatFull2 = this.t2) == null || !chatFull2.stargifts_available) ? false : true;
            this.S0.Q(38, z10);
            org.telegram.ui.Components.ef0 ef0Var = this.Z;
            if (ef0Var != null) {
                ef0Var.o(3, z10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f8));
    }

    public final void b4() {
        TLRPC.Chat chat = this.D2;
        if (chat == null || !chat.megagroup) {
            return;
        }
        TLRPC.ChatFull chatFull = this.t2;
        if (!(chatFull instanceof TLRPC.TL_channelFull) || chatFull.participants == null) {
            return;
        }
        for (int i7 = 0; i7 < this.t2.participants.participants.size(); i7++) {
            TLRPC.ChatParticipant chatParticipant = this.t2.participants.participants.get(i7);
            this.B1.k(chatParticipant, chatParticipant.user_id);
        }
    }

    public final void b5(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Y == null || (tL_emojiStatusCollectible2 = this.D6) == tL_emojiStatusCollectible) {
            return;
        }
        if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
            this.D6 = tL_emojiStatusCollectible;
            fi.m3 m3Var = this.A6;
            int i7 = 1;
            if (m3Var != null) {
                m3Var.f(true);
            }
            if (tL_emojiStatusCollectible == null || TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                return;
            }
            this.C6 = null;
            this.A6 = new fi.m3(getParentActivity(), 3);
            this.B6 = org.telegram.ui.ActionBar.k6.w(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.k6.r1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
            this.A6.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
            fi.m3 m3Var2 = this.A6;
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
            m3Var2.L0 = true;
            m3Var2.T0 = System.currentTimeMillis();
            m3Var2.M0 = new Path();
            m3Var2.N0 = org.telegram.messenger.g0.N(0.66f) / 2.0f;
            m3Var2.O0 = new Paint(1);
            m3Var2.P0 = new Paint(1);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, r12), org.telegram.ui.ActionBar.k6.r1(1.0f, r12), org.telegram.ui.ActionBar.k6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            m3Var2.S0 = linearGradient;
            m3Var2.P0.setShader(linearGradient);
            m3Var2.Q0 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, r12), org.telegram.ui.ActionBar.k6.r1(0.5f, r12), org.telegram.ui.ActionBar.k6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            m3Var2.R0 = new Matrix();
            m3Var2.O0.setShader(m3Var2.Q0);
            m3Var2.P0.setStyle(Paint.Style.STROKE);
            m3Var2.P0.setStrokeJoin(Paint.Join.ROUND);
            m3Var2.P0.setStrokeCap(Paint.Cap.ROUND);
            m3Var2.P0.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
            this.Y.addView(this.A6, c8.ha.c(24.0f, -1));
            this.A6.v(9.33f);
            fi.m3 m3Var3 = this.A6;
            Typeface o4 = org.telegram.messenger.g0.o();
            m3Var3.H.x(o4);
            m3Var3.J.setTypeface(o4);
            this.A6.u(tL_emojiStatusCollectible.title);
            fi.m3 m3Var4 = this.A6;
            m3Var4.d = -1L;
            m3Var4.n(5.66f, 2.66f, 5.66f, 2.66f);
            fi.m3 m3Var5 = this.A6;
            m3Var5.getClass();
            m3Var5.D = org.telegram.messenger.g0.N(4.0f);
            m3Var5.E = org.telegram.messenger.g0.N(2.66f);
            this.A6.t();
            this.A6.s(16.0f);
            this.A6.w();
            this.A6.setOnClickListener(new iu0(this, tL_emojiStatusCollectible.slug, i7));
            if (this.P1 < org.telegram.messenger.g0.L(82.0f)) {
                this.C6 = Boolean.FALSE;
                this.A6.setAlpha(0.0f);
            }
            q5();
            fi.m3 m3Var6 = this.A6;
            Objects.requireNonNull(m3Var6);
            org.telegram.messenger.g0.i3(new oy(m3Var6, i7), 6000L);
        }
    }

    public final boolean c4() {
        org.telegram.ui.ActionBar.q4 q4Var;
        if (this.I1 == 0 || (q4Var = this.parentLayout) == null || q4Var.getFragmentStack() == null || this.parentLayout.getFragmentStack().size() < 2 || !(this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof an)) {
            return false;
        }
        finishFragment();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean canBeginSlide() {
        if (this.N.J0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void clearViews() {
        this.g6 = null;
        super.clearViews();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r1 == null) goto L17;
     */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        LaunchActivity launchActivity;
        ym ymVar;
        org.telegram.ui.ActionBar.r3 r3Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.f2 lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof an) && (ymVar = ((an) lastFragment).xa) != null && (r3Var = ymVar.f) != null) {
            if (r3Var != null) {
                TLRPC.ChatTheme chatTheme = r3Var.d;
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
        int i7 = 5;
        org.telegram.ui.Components.r7 r7Var = new org.telegram.ui.Components.r7(this, context, this.z0, i7);
        boolean z9 = true;
        r7Var.setForceSkipTouches(true);
        r7Var.setBackgroundColor(0);
        r7Var.C(this.g6 != null ? 553648127 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f8, this.z0), false);
        int i10 = org.telegram.ui.ActionBar.k6.v8;
        r7Var.D(org.telegram.ui.ActionBar.k6.w0(i10, this.z0), false);
        r7Var.D(org.telegram.ui.ActionBar.k6.w0(i10, this.z0), true);
        r7Var.setCastShadows(false);
        r7Var.setAddToContainer(false);
        r7Var.setClipContent(true);
        if (!this.I0 && (((q4Var = this.parentLayout) == null || !((ActionBarLayout) q4Var).b) && ((org.telegram.messenger.g0.Q1() || this.inBubbleMode) && (!org.telegram.messenger.g0.Q1() || this.inBubbleMode || (q4Var2 = this.parentLayout) == null || (launchActivity = LaunchActivity.G1) == null || q4Var2 != launchActivity.q0)))) {
            z9 = false;
        }
        r7Var.setOccupyStatusBar(z9);
        if (!this.I0) {
            r7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
            r7Var.getBackButton().setTranslationX(org.telegram.messenger.g0.L(2.0f));
            ImageView backButton = r7Var.getBackButton();
            backButton.setOnLongClickListener(new di.f2(i7, this, backButton));
            return r7Var;
        }
        r7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        r7Var.getBackButton().setTranslationX(org.telegram.messenger.g0.L(2.0f));
        r7Var.e.setContentDescription(org.telegram.messenger.hd.M0(2131746499, null));
        r7Var.e.setImageResource(R.drawable.outline_header_qr_24);
        r7Var.e.setColorFilter(org.telegram.ui.ActionBar.k6.w0(i10, this.z0), PorterDuff.Mode.SRC_IN);
        r7Var.e.setOnClickListener(new zt0(this, 6));
        return r7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v257, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v262 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z9;
        dh.c cVar;
        int i7;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        ?? r12;
        TLRPC.Document document;
        int i10;
        Object obj;
        org.telegram.ui.ActionBar.f6 f6Var;
        dh.k kVar;
        int i11;
        TLRPC.UserFull userFull2;
        TLRPC.ChatParticipants chatParticipants;
        an anVar;
        ym ymVar;
        org.telegram.ui.ActionBar.k6.Z(context);
        ?? r02 = 0;
        org.telegram.ui.ActionBar.k6.K(context, false);
        org.telegram.ui.ActionBar.f2 lastFragment = this.parentLayout.getLastFragment();
        StateListAnimator stateListAnimator = null;
        if ((lastFragment instanceof an) && (ymVar = (anVar = (an) lastFragment).xa) != null && ymVar.l() != null) {
            org.telegram.ui.ActionBar.r3 r3Var = anVar.xa.f;
            if (r3Var != null) {
                TLRPC.ChatTheme chatTheme = r3Var.d;
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
        this.P1 = j4();
        this.actionBar.setActionBarMenuOnItemClick(new rv0(this, context));
        vv0 vv0Var = this.N;
        if (vv0Var != null) {
            vv0Var.Q0();
        }
        long j3 = this.h1;
        if (j3 == 0) {
            j3 = this.d1;
            if (j3 == 0) {
                j3 = -this.e1;
            }
        }
        this.fragmentView = new tv0(this, context);
        jh.k kVar2 = new jh.k(this.fragmentView);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        dh.c cVar2 = this.K6;
        cVar2.g(kVar2, viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        if (this.r1) {
            this.s5 = new FrameLayout(context);
            this.t5 = new FrameLayout[2];
            this.w5 = new fi.d[2];
            int i12 = 0;
            for (int i13 = 2; i12 < i13; i13 = 2) {
                sq0 sq0Var = new sq0(context);
                fh.g b10 = getBaseSimpleGlass().c.b(sq0Var, new gh.b(org.telegram.ui.ActionBar.k6.d6, this.z0));
                b10.q(org.telegram.messenger.g0.L(8.0f));
                b10.r(org.telegram.messenger.g0.L(22.0f));
                sq0Var.setBackground(b10);
                this.t5[i12] = new FrameLayout(context);
                this.w5[i12] = new fi.d(context, this.z0);
                this.w5[i12].setRoundRadius(org.telegram.messenger.g0.L(19.0f));
                this.w5[i12].setUseWrapContent(true);
                this.w5[i12].setPadding(org.telegram.messenger.g0.L(16.0f), r02, org.telegram.messenger.g0.L(16.0f), r02);
                if (i12 == 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                    this.u5 = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.filled_premium_camera), r02, 1, 33);
                    this.u5.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.L0(2131744810));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
                    this.v5 = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wp(R.drawable.filled_add_album), r02, 1, 33);
                    this.v5.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.L0(2131744805));
                    this.w5[i12].h(this.u5, r02);
                } else {
                    this.w5[i12].h(org.telegram.messenger.hd.L0(2131744487), r02);
                }
                sq0Var.setOnClickListener(new ou0(this, i12, r02));
                c8.ka.b(sq0Var, 0.02f, 1.2f);
                this.w5[i12].setStateListAnimator(stateListAnimator);
                sq0Var.addView(this.w5[i12], c8.ha.e(-2, -1, 17));
                this.t5[i12].addView(sq0Var, c8.ha.e(-2, 60, 1));
                this.s5.addView(this.t5[i12], c8.ha.e(-1, -1, 87));
                if (i12 == 1 || !getMessagesController().W4()) {
                    Y4(this.t5[i12], 1.0f);
                }
                i12++;
                r02 = 0;
                stateListAnimator = null;
            }
        }
        TLRPC.ChatFull chatFull2 = this.t2;
        ArrayList arrayList = (chatFull2 == null || (chatParticipants = chatFull2.participants) == null || chatParticipants.participants.size() <= 5) ? null : this.B2;
        if (this.w1) {
            cVar = cVar2;
            z9 = true;
            i7 = 6;
        } else if (!this.s1 || (((userFull = this.u2) == null || userFull.stargifts_count <= 0) && ((chatFull = this.t2) == null || chatFull.stargifts_count <= 0))) {
            z9 = true;
            if (this.q1) {
                i7 = 10;
                cVar = cVar2;
            } else {
                cVar = cVar2;
                i7 = arrayList != null ? 7 : -1;
            }
        } else {
            z9 = true;
            this.v1 = true;
            cVar = cVar2;
            i7 = 14;
        }
        V3(context);
        dh.c cVar3 = cVar;
        org.telegram.ui.Components.ps0 ps0Var = this.Q;
        TLRPC.UserFull userFull3 = this.u2;
        long j10 = j3;
        vv0 vv0Var2 = new vv0(this, context, j10, ps0Var, userFull3 != null ? userFull3.common_chats_count : 0, this.B2, this.t2, userFull3, i7, this.x1, this, this, this.z0, getBaseSimpleGlass().c);
        this.N = vv0Var2;
        vv0Var2.setLayoutParams(new v4.o0(-1, -1));
        int i14 = 4;
        if (this.d1 == 0 || this.q0 == null || this.r1) {
            this.b0 = new org.telegram.ui.Components.zf0(context);
            org.telegram.ui.Components.ff0 ff0Var = new org.telegram.ui.Components.ff0(context);
            this.c0 = ff0Var;
            this.b0.setTrailingView(ff0Var);
            org.telegram.ui.Components.if0 if0Var = this.I5;
            if (if0Var != null) {
                this.b0.setGlassFactory(if0Var.c);
            }
            this.c0.setOnClickListener(new zt0(this, i14));
            this.b0.setColor(this.g6);
            TLRPC.UserFull userFull4 = this.u2;
            if (userFull4 != null && (document = userFull4.saved_music) != null) {
                this.b0.setMusicDocument(document);
            }
            int i15 = 5;
            this.b0.setOnClickListener(new zt0(this, i15));
            this.Z = new org.telegram.ui.Components.ef0(context, org.telegram.messenger.g0.L(74.0f));
            W4();
            r12 = 0;
            F5(false);
            this.Z.setOnActionClickListener(new tt0(this, i15));
        } else {
            r12 = 0;
        }
        org.telegram.ui.ActionBar.e5 o4 = this.simpleActionBar.o();
        if (this.d1 == getUserConfig().n && !this.r1) {
            if (org.telegram.messenger.g5.r(this.currentAccount).v(7) == null) {
                org.telegram.messenger.g5.r(this.currentAccount).C();
            }
        }
        if (this.q0 != null && !this.r1) {
            org.telegram.ui.ActionBar.f5 b11 = o4.b(32, R.drawable.outline_header_search);
            b11.M();
            b11.J(new kg.v1(this, 19));
            this.T0 = b11;
            b11.setContentDescription(org.telegram.messenger.hd.L0(2131745760));
            this.T0.setSearchFieldHint(org.telegram.messenger.hd.L0(2131745760));
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
        org.telegram.ui.ActionBar.f5 b12 = o4.b(16, R.drawable.profile_video);
        this.Q0 = b12;
        b12.setContentDescription(org.telegram.messenger.hd.L0(2131743612));
        if (this.e1 != 0) {
            this.P0 = o4.b(15, R.drawable.msg_voicechat2);
            if (org.telegram.messenger.t3.W(this.D2)) {
                this.P0.setContentDescription(org.telegram.messenger.hd.L0(2131743448));
            } else {
                this.P0.setContentDescription(org.telegram.messenger.hd.L0(2131743307));
            }
        } else {
            org.telegram.ui.ActionBar.f5 b13 = o4.b(15, R.drawable.call);
            this.P0 = b13;
            b13.setContentDescription(org.telegram.messenger.hd.L0(2131752634));
        }
        if (this.r1) {
            org.telegram.ui.ActionBar.f5 b14 = o4.b(41, R.drawable.group_edit_profile);
            this.R0 = b14;
            b14.setContentDescription(org.telegram.messenger.hd.L0(2131751336));
        } else {
            org.telegram.ui.ActionBar.f5 b15 = o4.b(12, R.drawable.group_edit_profile);
            this.R0 = b15;
            b15.setContentDescription(org.telegram.messenger.hd.L0(2131751336));
        }
        org.telegram.ui.ActionBar.f5 a10 = o4.a();
        this.S0 = a10;
        a10.setSubMenuDelegate(new pu0(this));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.v8, this.z0, PorterDuff.Mode.MULTIPLY);
        org.telegram.messenger.g0.W3(0.8f, this.X0, r12, r12);
        this.X0.setImageResource(R.drawable.msg_mini_autodelete_timer);
        this.S0.addView(this.X0, c8.ha.d(12, 12.0f, 19, 8.0f, 2.0f, 0.0f, 0.0f));
        this.S0.setContentDescription(org.telegram.messenger.hd.L0(2131754839));
        this.S0.L(cVar3, c8.g0.g(this.resourceProvider));
        if (this.a == null || this.q0 == null) {
            i10 = -1;
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
            i10 = L0;
            obj = this.s.getTag();
        }
        S3(r12);
        this.d = new jw0(this, context);
        this.e = new tw0(context, this);
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8();
        this.p0 = w8Var;
        w8Var.p = 2.3809524f;
        w8Var.t();
        this.fragmentView.setWillNotDraw(r12);
        tv0 tv0Var = (tv0) this.fragmentView;
        this.m5 = tv0Var;
        tv0Var.setClipChildren(r12);
        qu0 qu0Var = new qu0(this, context, this.z0);
        this.a = qu0Var;
        qu0Var.setLegacySections(r12);
        this.a.r1();
        qu0 qu0Var2 = this.a;
        qu0Var2.getClass();
        qu0Var2.setSectionsOverscanTop(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
        qu0 qu0Var3 = this.a;
        int i16 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.ActionBar.r6.i(i16, qu0Var3, this.z0);
        this.a.setVerticalScrollBarEnabled(r12);
        int i17 = 1;
        dh.k kVar3 = new dh.k(this.a, (ViewGroup) this.fragmentView, new n40(this, 1));
        kVar3.h = true;
        su0 su0Var = new su0(this);
        this.a.setItemAnimator(su0Var);
        int i18 = i10;
        su0Var.e = 320L;
        su0Var.d = 320L;
        su0Var.c = 320L;
        su0Var.m = r12;
        su0Var.S();
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        su0Var.o(xqVar);
        this.a.setClipToPadding(r12);
        this.a.setClipChildren(r12);
        this.a.setHideIfEmpty(r12);
        tu0 tu0Var = new tu0(this);
        this.c = tu0Var;
        tu0Var.j1(1);
        tu0 tu0Var2 = this.c;
        tu0Var2.r = r12;
        this.a.setLayoutManager(tu0Var2);
        this.a.setGlowColor(r12);
        this.a.setAdapter(this.d);
        frameLayout.addView(this.a, c8.ha.e(-1, -1, 51));
        this.a.setOnItemClickListener(new bi.i(this, context, j10, 7));
        this.a.setOnItemLongClickListener(new wu0(this, context));
        if (this.q1 || this.s1 || this.w1) {
            J5();
            I();
            this.m6 = true;
            this.k6 = this.J4;
            this.l6 = r12;
        }
        if (this.T0 != null) {
            org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context);
            this.b = pj0Var;
            pj0Var.setVerticalScrollBarEnabled(r12);
            this.b.setLayoutManager(new v4.b0(1, r12));
            org.telegram.ui.ActionBar.r6.I(this.b, org.telegram.ui.ActionBar.k6.e8, this.z0);
            this.b.setAdapter(this.e);
            f6Var = null;
            this.b.setItemAnimator(null);
            this.b.setVisibility(8);
            this.b.setLayoutAnimation(null);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.b, this.z0);
            frameLayout.addView(this.b, c8.ha.e(-1, -1, 51));
            this.b.setOnItemClickListener(new h(this, 28));
            this.b.setOnItemLongClickListener(new tt0(this, 6));
            this.b.setOnScrollListener(new xu0(this, r12));
            this.b.o1(1, true);
            org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(context);
            this.O = av0Var;
            av0Var.setAnimateLayoutChange(true);
            this.O.e.setVisibility(8);
            this.O.setVisibility(8);
            frameLayout.addView(this.O);
            this.e.G();
        } else {
            f6Var = null;
        }
        if (this.D1 != 0) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.D1));
            if (this.F2 == null) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = org.telegram.messenger.qp.i1(M0);
                kVar = kVar3;
                tL_channels_getParticipant.participant = getMessagesController().j1(this.d1);
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new gu0(this, 4));
            } else {
                kVar = kVar3;
            }
            sq0 sq0Var2 = new sq0(context, i17);
            sq0Var2.setWillNotDraw(r12);
            sq0Var2.setPadding(r12, r12, r12, org.telegram.messenger.g0.n);
            frameLayout.addView(sq0Var2, c8.ha.a(-1.0f, (org.telegram.messenger.g0.n / org.telegram.messenger.g0.p) + 51.0f, 83));
            sq0Var2.setOnClickListener(new fk0(6, this, M0));
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.p7, this.z0);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.hd.L0(2131753728));
            sq0Var2.addView(textView, c8.ha.d(-2, -2.0f, 17, 0.0f, 1.0f, 0.0f, 0.0f));
            this.a.setPadding(r12, j4(), r12, org.telegram.messenger.g0.L(48.0f));
            this.a.setBottomGlowOffset(org.telegram.messenger.g0.L(48.0f));
        } else {
            kVar = kVar3;
            this.a.setPadding(r12, j4(), r12, r12);
        }
        ww0 ww0Var = new ww0(this, context);
        this.c1 = ww0Var;
        ww0Var.a(this.g6, r12);
        this.c1.setBackgroundColor(getThemedColor(i16));
        frameLayout.addView(this.c1);
        org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
        this.d0 = oVar;
        oVar.setPivotX(org.telegram.messenger.g0.L(30.0f));
        this.d0.setPivotY(org.telegram.messenger.g0.L(30.0f));
        this.X = new k0(21, context, this);
        this.Y = new bi.x5(23, context, this);
        ImageReceiver imageReceiver = new ImageReceiver(this.Y);
        this.r5 = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(11.0f));
        org.telegram.messenger.g0.W3(1.0f, this.Y, true, r12);
        this.Y.setClipChildren(r12);
        frameLayout.addView(this.Y, c8.ha.d(-1, -1.0f, 8388611, 0.0f, 0.0f, 0.0f, 0.0f));
        this.X.setPivotX(0.0f);
        this.X.setPivotY(0.0f);
        org.telegram.ui.Components.wf0 wf0Var = new org.telegram.ui.Components.wf0(context);
        this.t0 = wf0Var;
        wf0Var.addView(this.X, c8.ha.e(100, 100, 51));
        this.Y.addView(this.t0, c8.ha.c(-1.0f, -1));
        zu0 zu0Var = new zu0(context);
        this.e0 = zu0Var;
        zu0Var.v(e4());
        this.e0.getImageReceiver().T(true);
        this.e0.setRoundRadiusForExpand(q4());
        this.e0.setPivotX(0.0f);
        this.e0.setPivotY(0.0f);
        this.X.addView(this.e0, c8.ha.c(-1.0f, -1));
        this.e0.setOnClickListener(new zt0(this, 11));
        this.e0.setHasStories(x4());
        this.e0.setOnLongClickListener(new t(this, 6));
        org.telegram.ui.Cells.b4 b4Var = new org.telegram.ui.Cells.b4(this, context);
        this.g0 = b4Var;
        b4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        this.g0.setProgressColor(-1);
        this.g0.setNoProgress(r12);
        this.X.addView(this.g0, c8.ha.c(-1.0f, -1));
        ImageView imageView2 = new ImageView(context);
        this.h0 = imageView2;
        imageView2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
        ImageView imageView3 = this.h0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        this.h0.setAlpha(0.0f);
        this.h0.setScaleX(0.85f);
        this.h0.setScaleY(0.85f);
        ImageView imageView4 = this.h0;
        org.telegram.ui.Components.a01 a01Var = new org.telegram.ui.Components.a01(context, f6Var);
        this.l0 = a01Var;
        imageView4.setImageDrawable(a01Var);
        this.h0.setTranslationY(-1.0f);
        frameLayout.addView(this.h0, c8.ha.e(34, 34, 51));
        ImageView imageView5 = new ImageView(context);
        this.i0 = imageView5;
        imageView5.setScaleType(scaleType);
        this.i0.setAlpha(0.0f);
        this.i0.setImageDrawable(new ih.c());
        frameLayout.addView(this.i0, c8.ha.e(16, 16, 51));
        ImageView imageView6 = new ImageView(context);
        this.j0 = imageView6;
        imageView6.setImageResource(R.drawable.star_small_outline);
        org.telegram.ui.ActionBar.r6.t(this.j0, org.telegram.ui.ActionBar.k6.s8, this.z0, PorterDuff.Mode.SRC_IN);
        this.j0.setAlpha(0.0f);
        this.j0.setScaleY(0.0f);
        this.j0.setScaleX(0.0f);
        frameLayout.addView(this.j0, c8.ha.e(20, 20, 51));
        ImageView imageView7 = new ImageView(context);
        this.k0 = imageView7;
        imageView7.setImageResource(R.drawable.star_small_inner);
        this.k0.setAlpha(0.0f);
        this.k0.setScaleY(0.0f);
        this.k0.setScaleX(0.0f);
        frameLayout.addView(this.k0, c8.ha.e(20, 20, 51));
        K5();
        j5(r12, r12);
        av0 av0Var2 = this.n0;
        if (av0Var2 != null) {
            av0Var2.K();
        }
        org.telegram.ui.Components.kf0 kf0Var = this.m0;
        if (kf0Var != null) {
            kf0Var.d();
        }
        this.M = new kw0(this, context);
        org.telegram.ui.Components.kf0 kf0Var2 = new org.telegram.ui.Components.kf0(context);
        this.m0 = kf0Var2;
        kf0Var2.setSize(e4());
        long j11 = this.d1;
        if (j11 == 0) {
            j11 = -this.e1;
        }
        org.telegram.ui.ActionBar.k kVar4 = this.actionBar;
        qu0 qu0Var4 = this.a;
        long j12 = j11;
        zu0 zu0Var2 = this.e0;
        getClassGuid();
        dh.k kVar5 = kVar;
        this.n0 = new av0(this, context, j12, kVar4, qu0Var4, zu0Var2, this.M, this.m0);
        if (this.d1 != getUserConfig().n && (userFull2 = this.u2) != null) {
            this.n5 = userFull2.profile_photo == null ? 0.0f : 1.0f;
        }
        if (!this.p1) {
            this.n0.setChatInfo(this.t2);
        }
        this.Y.addView(this.n0);
        this.Y.addView(this.m0, c8.ha.c(138.0f, -1));
        this.Y.addView(this.M);
        org.telegram.ui.Components.ef0 ef0Var = this.Z;
        if (ef0Var != null) {
            this.Y.addView(ef0Var, c8.ha.c(-1.0f, -1));
        }
        org.telegram.ui.Components.zf0 zf0Var = this.b0;
        if (zf0Var != null) {
            this.Y.addView(zf0Var, c8.ha.c(-1.0f, -1));
            this.Y.addView(this.c0, c8.ha.c(-1.0f, -1));
        }
        this.e0.setAvatarsViewPager(this.n0);
        mw0 mw0Var = new mw0(this, context);
        this.o0 = mw0Var;
        this.Y.addView(mw0Var, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.actionBar);
        ok okVar = new ok(3, context, this);
        this.f = okVar;
        okVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.ji));
        this.f.setPadding(r12, org.telegram.messenger.g0.L(6.0f), r12, org.telegram.messenger.g0.L(4.0f));
        this.f.setTextSizePx(org.telegram.messenger.g0.L(17.5f));
        this.f.setGravity(3);
        this.f.setTypeface(org.telegram.messenger.g0.o());
        this.f.setLeftDrawableTopPadding(-org.telegram.messenger.g0.L(1.3f));
        this.f.setPivotX(0.0f);
        this.f.setPivotY(0.0f);
        this.f.setScrollNonFitText(true);
        this.f.setFocusable(true);
        this.f.setEllipsizeByGradient(true);
        this.Y.addView(this.f, c8.ha.d(-2, -2.0f, 51, 109.0f, -6.0f, 0.0f, 0.0f));
        bv0 bv0Var = new bv0(this, context);
        this.r = bv0Var;
        bv0Var.setEllipsizeByGradient(true);
        this.r.setTextColor(I3(getThemedColor(org.telegram.ui.ActionBar.k6.B8), null));
        this.r.setTextSizePx(org.telegram.messenger.g0.L(13.5f));
        this.r.setGravity(3);
        this.r.setPivotX(org.telegram.messenger.g0.L(8.0f));
        this.r.setPivotY(org.telegram.messenger.g0.L(8.0f));
        this.r.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        this.r.setFocusable(true);
        this.Y.addView(this.r, c8.ha.d(-2, -2.0f, 51, 105.0f, -2.0f, 4.0f, 0.0f));
        Q3();
        this.Y.addView(this.d0);
        org.telegram.ui.Components.lu0 lu0Var = new org.telegram.ui.Components.lu0(context);
        this.S = lu0Var;
        lu0Var.setLayoutParams(c8.ha.d(32, 32.0f, 3, 103.0f, -2.0f, 0.0f, 0.0f));
        this.S.setResourcesProvider(this.z0);
        R3();
        this.S.setDelegate(new tt0(this, i17));
        this.S.setOnClickListener(new zt0(this, r12));
        TLRPC.UserFull userFull5 = this.u2;
        if (userFull5 != null) {
            this.S.set(userFull5.stars_rating);
        }
        this.Y.addView(this.S);
        this.u0 = new cv0(this, context, this.currentAccount, a(), this.p1, this.X, this.e0, this.z0, context);
        L5(r12);
        TLRPC.UserFull userFull6 = this.u2;
        if (userFull6 != null) {
            this.u0.setStories(userFull6.stories);
        } else {
            TLRPC.ChatFull chatFull3 = this.t2;
            if (chatFull3 != null) {
                this.u0.setStories(chatFull3.stories);
            }
        }
        zu0 zu0Var3 = this.e0;
        if (zu0Var3 != null) {
            zu0Var3.setHasStories(x4());
        }
        this.Y.addView(this.u0, c8.ha.c(-1.0f, -1));
        bi.g1 g1Var = new bi.g1(context, this.currentAccount, a(), this.X);
        this.v0 = g1Var;
        this.Y.addView(g1Var, (int) r12, c8.ha.c(-1.0f, -1));
        I5(true);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
        this.s = ch0Var;
        if (this.Z != null) {
            ch0Var.setVisibility(8);
        }
        Q5();
        if (this.d1 == 0) {
            this.s.setImageResource(R.drawable.profile_discuss);
            this.s.setContentDescription(org.telegram.messenger.hd.L0(2131743556));
        } else if (this.q0 != null) {
            this.U = new org.telegram.ui.Components.zg0(R.raw.camera_outline, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            this.V = new org.telegram.ui.Components.zg0(R.raw.camera_outline, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), false, null);
            org.telegram.ui.Components.ef0 ef0Var2 = this.Z;
            if (ef0Var2 != null) {
                ef0Var2.e();
                this.Z.a();
                this.Z.b();
                this.Z.c();
                org.telegram.ui.Components.ef0 ef0Var3 = this.Z;
                if (ef0Var3.F) {
                    ef0Var3.F = r12;
                    ef0Var3.d();
                }
            } else {
                this.s.setAnimation(this.U);
                this.s.setContentDescription(org.telegram.messenger.hd.L0(2131754905));
                this.s.setPadding(org.telegram.messenger.g0.L(2.0f), r12, r12, org.telegram.messenger.g0.L(2.0f));
            }
        } else {
            org.telegram.ui.Components.ef0 ef0Var4 = this.Z;
            if (ef0Var4 != 0) {
                ef0Var4.o(r12, true);
            }
            this.s.setImageResource(R.drawable.profile_newmsg);
            this.s.setContentDescription(org.telegram.messenger.hd.L0(2131754819));
        }
        this.s.setScaleType(scaleType);
        frameLayout.addView(this.s, c8.ha.d(60, 60.0f, 53, 0.0f, 0.0f, 16.0f, 0.0f));
        this.s.setOnClickListener(new zt0(this, i17));
        y4(r12);
        if (i18 != -1 && obj != null) {
            this.s.setTag(Integer.valueOf((int) r12));
            this.s.setScaleX(0.2f);
            this.s.setScaleY(0.2f);
            this.s.setAlpha(0.0f);
        }
        this.a.setOnScrollListener(new xu0(this, i17));
        UndoView undoView = new UndoView(context, null, r12, this.z0);
        this.L = undoView;
        frameLayout.addView(undoView, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.i2 = ofFloat;
        ofFloat.addUpdateListener(new cu0(this, i17));
        this.i2.setInterpolator(xqVar);
        this.i2.addListener(new dv0(this, r12));
        J5();
        V();
        int i19 = 3;
        fi.m3 m3Var = new fi.m3(getContext(), 3);
        m3Var.r(true);
        m3Var.h = org.telegram.messenger.g0.L(310.0f);
        m3Var.d = 2300L;
        m3Var.T = true;
        m3Var.e = true;
        m3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
        m3Var.i(org.telegram.messenger.g0.L(4.0f));
        this.W = m3Var;
        m3Var.setPadding(org.telegram.messenger.g0.L(8.0f), r12, org.telegram.messenger.g0.L(8.0f), r12);
        this.W.l(getBaseSimpleGlass().c);
        frameLayout.addView(this.W, c8.ha.e(-1, org.telegram.messenger.qs.g2, 55));
        this.N.setForwardRestrictedHint(this.W);
        ev0 ev0Var = new ev0(this, (ViewGroup) getParentActivity().getWindow().getDecorView(), frameLayout);
        this.V4 = ev0Var;
        ev0Var.E = new pu0(this);
        this.n0.setPinchToZoomHelper(ev0Var);
        this.x0.setAlpha(r12);
        this.y0.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.i6));
        N5();
        l00 l00Var = new l00(7, context, this);
        this.T = l00Var;
        int i20 = org.telegram.ui.ActionBar.k6.d6;
        l00Var.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i20), 100)));
        this.T.setFocusable((boolean) r12);
        this.T.setImportantForAccessibility(2);
        this.T.setOnClickListener(new zt0(this, 2));
        this.T.setVisibility(8);
        this.T.setFitsSystemWindows(true);
        this.m5.addView(this.T, c8.ha.c(-1.0f, -1));
        U3();
        if (this.r1) {
            i11 = 87;
            this.m5.addView(this.s5, c8.ha.e(-1, 60, 87));
        } else {
            i11 = 87;
        }
        org.telegram.ui.Components.ef0 ef0Var5 = this.Z;
        if (ef0Var5 != null && ef0Var5.k()) {
            ImageView imageView8 = new ImageView(context);
            this.O0 = imageView8;
            imageView8.setScaleType(scaleType);
            this.O0.setImageResource(R.drawable.call);
            this.O0.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(org.telegram.messenger.g0.L(48.0f), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            layoutParams.topMargin = this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : r12;
            layoutParams.setMarginEnd(layoutParams.width);
            layoutParams.gravity = 8388613;
            frameLayout.addView(this.O0, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y5 = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i20, frameLayout2, this.z0);
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, this.z0);
        this.y5.addView(view, c8.ha.d(-1, 1.0f / org.telegram.messenger.g0.p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.z5 = new fi.d(context, this.z0);
        this.z5.h(org.telegram.messenger.hd.L0(2131745947), r12);
        this.y5.addView(this.z5, c8.ha.d(-1, 48.0f, org.telegram.messenger.qs.E1, 10.0f, (1.0f / org.telegram.messenger.g0.p) + 10.0f, 10.0f, 10.0f));
        this.z5.setOnClickListener(new zt0(this, i19));
        this.y5.setVisibility(8);
        this.y5.setTranslationY(org.telegram.messenger.g0.L(69.0f));
        this.m5.addView(this.y5, c8.ha.e(-1, -2, i11));
        this.L6 = new bi.g(9, this, kVar5);
        i5();
        r0.i0.l(this.fragmentView, new tt0(this, 4));
        return this.fragmentView;
    }

    public final void d4() {
        if (this.a == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.X.getLayoutParams();
        float x10 = org.telegram.ui.Cells.f1.x(layoutParams.width, this.a2, 0.5f, this.a.getMeasuredWidth() / 2.0f);
        this.Y1 = x10;
        if (this.F1) {
            this.Y1 = org.telegram.messenger.g0.T1(this.e6, x10, this.R1);
        }
        this.X.setTranslationX(this.Y1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        jw0 jw0Var;
        org.telegram.ui.ActionBar.q4 q4Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User a22;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.Chat chat;
        qu0 qu0Var;
        qu0 qu0Var2;
        org.telegram.ui.Components.xi0 xi0Var;
        if (i7 == org.telegram.messenger.qs.B5 || i7 == org.telegram.messenger.qs.p3) {
            if (org.telegram.messenger.t3.R(org.telegram.messenger.qp.s1(this.currentAccount).M0(Long.valueOf(this.e1)))) {
                getMessagesController().P1().k(a(), new di.e(22), false, this.z0);
                return;
            }
            return;
        }
        int i11 = 0;
        r3 = false;
        boolean z9 = false;
        if (i7 == org.telegram.messenger.qs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.qp.C8;
            Object[] objArr2 = ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & TLObject.FLAG_19) == 0) ? false : true;
            if (this.d1 != 0) {
                if (objArr2 != false) {
                    I5(true);
                }
                if ((intValue & 1024) == 0 || (qu0Var2 = this.a) == null || (xi0Var = (org.telegram.ui.Components.xi0) qu0Var2.L(this.F3, false)) == null) {
                    return;
                }
                this.d.t(xi0Var, this.F3);
                return;
            }
            if (this.e1 != 0) {
                int i13 = intValue & TLObject.FLAG_13;
                if (i13 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                    if (i13 != 0) {
                        D5(true, false);
                    } else {
                        G5(true);
                    }
                    I5(true);
                }
                if (!objArr2 == true || (qu0Var = this.a) == null) {
                    return;
                }
                int childCount = qu0Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = this.a.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.pa) {
                        ((org.telegram.ui.Cells.pa) childAt).i(intValue);
                    }
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.g1) {
            Long l10 = (Long) objArr[0];
            if (this.t2 == null || (chat = this.D2) == null || chat.id != l10.longValue()) {
                return;
            }
            this.t2.online_count = ((Integer) objArr[1]).intValue();
            G5(true);
            I5(false);
            return;
        }
        if (i7 == org.telegram.messenger.qs.O || i7 == org.telegram.messenger.qs.b1) {
            S3(true);
            return;
        }
        if (i7 == org.telegram.messenger.qs.a0) {
            if (this.i1) {
                org.telegram.messenger.g0.h3(new qn0(15, this, objArr));
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.Y) {
            TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
            TLRPC.EncryptedChat encryptedChat2 = this.C2;
            if (encryptedChat2 == null || encryptedChat.id != encryptedChat2.id) {
                return;
            }
            this.C2 = encryptedChat;
            D5(false, false);
            org.telegram.messenger.n6 n6Var = this.W1;
            if (n6Var != null) {
                n6Var.g();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.g0) {
            boolean z10 = this.j1;
            boolean z11 = getMessagesController().G0.indexOfKey(this.d1) >= 0;
            this.j1 = z11;
            if (z10 != z11) {
                S3(true);
                D5(false, false);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.w2) {
            Long l11 = (Long) objArr[0];
            if (this.D2 != null) {
                long longValue = l11.longValue();
                TLRPC.Chat chat2 = this.D2;
                if (longValue == chat2.id && org.telegram.messenger.t3.w(14, chat2)) {
                    TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.currentAccount).N0(l11.longValue());
                    if (N0 != null) {
                        TLRPC.ChatFull chatFull4 = this.t2;
                        if (chatFull4 != null) {
                            N0.participants = chatFull4.participants;
                        }
                        this.t2 = N0;
                    }
                    vv0 vv0Var = this.N;
                    if (vv0Var != null) {
                        vv0Var.setChatInfo(this.t2);
                    }
                    TLRPC.ChatFull chatFull5 = this.t2;
                    if (chatFull5 != null && (((inputGroupCall = chatFull5.call) == null && !this.o1) || (inputGroupCall != null && this.o1))) {
                        S3(false);
                    }
                    cv0 cv0Var = this.u0;
                    if (cv0Var != null && (chatFull3 = this.t2) != null) {
                        cv0Var.setStories(chatFull3.stories);
                    }
                    bi.g1 g1Var = this.v0;
                    if (g1Var != null) {
                        g1Var.a();
                    }
                    zu0 zu0Var = this.e0;
                    if (zu0Var != null) {
                        zu0Var.setHasStories(x4());
                    }
                    if (l11.longValue() != 0) {
                        boolean z12 = org.telegram.messenger.r2.a;
                        r2 = (getMessagesController().h7 || (chatFull2 = this.t2) == null || !chatFull2.stargifts_available) ? false : true;
                        this.S0.Q(38, r2);
                        org.telegram.ui.Components.ef0 ef0Var = this.Z;
                        if (ef0Var != null) {
                            ef0Var.o(3, r2);
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
        if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
            if (this.d1 != 0 && (a22 = getMessagesController().a2(Long.valueOf(this.d1))) != null && chatFull6.id == a22.linked_community_id) {
                D5(true, false);
            }
            TLRPC.Chat chat3 = this.D2;
            if (chat3 != null && chatFull6.id == chat3.linked_community_id) {
                D5(true, false);
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
                    long j3 = chatFull6.migrated_from_chat_id;
                    if (j3 != 0) {
                        this.l1 = -j3;
                        getMediaDataController().d0(0, this.classGuid, this.l1, this.f1, true);
                    }
                }
                b4();
                av0 av0Var = this.n0;
                if (av0Var != null && !this.p1) {
                    av0Var.setChatInfo(this.t2);
                }
                D5(true, false);
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.e1));
                if (M0 != null) {
                    this.D2 = M0;
                    S3(true);
                }
                org.telegram.messenger.n6 n6Var2 = this.W1;
                if (n6Var2 != null) {
                    n6Var2.g();
                }
                if (this.D2.megagroup && (objArr3 != false || !booleanValue)) {
                    h4(true);
                }
                o5();
                N5();
                cv0 cv0Var2 = this.u0;
                if (cv0Var2 != null && (chatFull = this.t2) != null) {
                    cv0Var2.setStories(chatFull.stories);
                }
                bi.g1 g1Var2 = this.v0;
                if (g1Var2 != null) {
                    g1Var2.a();
                }
                zu0 zu0Var2 = this.e0;
                if (zu0Var2 != null) {
                    zu0Var2.setHasStories(x4());
                }
                vv0 vv0Var2 = this.N;
                if (vv0Var2 != null) {
                    vv0Var2.setChatInfo(this.t2);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.t) {
            removeSelfFromStack(true);
            return;
        }
        if (i7 == org.telegram.messenger.qs.v) {
            long longValue2 = ((Long) objArr[0]).longValue();
            boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
            if (longValue2 == a() && (q4Var = this.parentLayout) != null && q4Var.getFragmentStack().contains(this)) {
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
        if (i7 == org.telegram.messenger.qs.D0) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
            if (botInfo.user_id == this.d1) {
                this.E2 = botInfo;
                D5(false, false);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.E0) {
            if (((Long) objArr[0]).longValue() == this.d1) {
                TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                this.u2 = userFull;
                org.telegram.ui.Components.lu0 lu0Var = this.S;
                if (lu0Var != null) {
                    lu0Var.set(userFull.stars_rating);
                }
                cv0 cv0Var3 = this.u0;
                if (cv0Var3 != null) {
                    cv0Var3.setStories(this.u2.stories);
                }
                bi.g1 g1Var3 = this.v0;
                if (g1Var3 != null) {
                    g1Var3.a();
                }
                zu0 zu0Var3 = this.e0;
                if (zu0Var3 != null) {
                    zu0Var3.setHasStories(x4());
                }
                vv0 vv0Var3 = this.N;
                if (vv0Var3 != null) {
                    vv0Var3.setUserInfo(this.u2);
                }
                if (this.q0 != null) {
                    if (this.d != null && !TextUtils.equals(this.u2.about, this.y2)) {
                        this.d.g(this.V2);
                    }
                    if (this.r1) {
                        D5(false, false);
                    }
                } else {
                    if (this.F1 || this.K0) {
                        this.H1 = true;
                    } else {
                        S3(true);
                    }
                    D5(false, false);
                    vv0 vv0Var4 = this.N;
                    if (vv0Var4 != null) {
                        vv0Var4.setCommonGroupsCount(this.u2.common_chats_count);
                        V();
                        org.telegram.ui.Components.ps0 ps0Var = this.Q;
                        if (ps0Var == null || ps0Var.D) {
                            resumeDelayedFragmentAnimation();
                            y4(true);
                        }
                    }
                }
                o5();
                N5();
                if (this.v2 == null && !v4()) {
                    org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(this.currentAccount);
                    this.v2 = e6Var;
                    j90 j90Var = new j90(this, 17);
                    if (e6Var.c) {
                        j90Var.run();
                    } else {
                        e6Var.h.add(j90Var);
                    }
                    this.v2.d(this.u2);
                }
                if (!v4()) {
                    xw0 xw0Var = this.x2;
                    xw0 c10 = xw0.c(this.currentAccount, this.u2, xw0Var);
                    this.x2 = c10;
                    this.w2 = c10 != xw0Var;
                    if (c10 != null) {
                        j90 j90Var2 = new j90(this, 18);
                        if (c10.b) {
                            j90Var2.run();
                        } else {
                            c10.h.add(j90Var2);
                        }
                    }
                }
                if (this.S0 != null) {
                    if (s4()) {
                        this.S0.S(44);
                    } else {
                        this.S0.t(44);
                    }
                    TLRPC.UserFull userFull2 = this.u2;
                    if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                        z9 = true;
                    }
                    this.S0.Q(46, z9);
                    this.S0.Q(47, !z9);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.k0) {
            return;
        }
        if (i7 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && a() == ((Long) objArr[0]).longValue()) {
                ArrayList arrayList = (ArrayList) objArr[1];
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i15);
                    if (this.C2 != null) {
                        TLRPC.MessageAction messageAction = ijVar.k.action;
                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (jw0Var = this.d) != null) {
                            jw0Var.f();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.i4) {
            qu0 qu0Var3 = this.a;
            if (qu0Var3 != null) {
                qu0Var3.g1();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.x4) {
            D5(false, false);
            return;
        }
        if (i7 == org.telegram.messenger.qs.s1) {
            int i16 = this.b3;
            int i17 = this.Z2;
            int i18 = this.X2;
            J5();
            jw0 jw0Var2 = this.d;
            if (jw0Var2 != null) {
                if (i16 == this.b3 && i17 == this.Z2 && i18 == this.X2) {
                    return;
                }
                jw0Var2.f();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.q5) {
            if (this.p1) {
                I5(false);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.D1) {
            tw0 tw0Var = this.e;
            if (tw0Var != null) {
                tw0Var.c = tw0.H(this);
                this.e.w.clear();
                this.e.J();
                tw0 tw0Var2 = this.e;
                tw0Var2.I(tw0Var2.D);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.c0) {
            I5(false);
            return;
        }
        if (i7 == org.telegram.messenger.qs.v5 || i7 == org.telegram.messenger.qs.F5) {
            zu0 zu0Var4 = this.e0;
            if (zu0Var4 != null) {
                zu0Var4.setHasStories(x4());
                this.e0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(q4(), 0.0f, this.j2));
            }
            cv0 cv0Var4 = this.u0;
            if (cv0Var4 != null) {
                TLRPC.UserFull userFull3 = this.u2;
                if (userFull3 != null) {
                    cv0Var4.setStories(userFull3.stories);
                    return;
                }
                TLRPC.ChatFull chatFull8 = this.t2;
                if (chatFull8 != null) {
                    cv0Var4.setStories(chatFull8.stories);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.i3) {
            org.telegram.ui.ActionBar.f5 f5Var = this.S0;
            if (f5Var != null) {
                TL_account.RequirementToContact J2 = getMessagesController().J2(this.d1);
                if (J2 != null && !(J2 instanceof TL_account.requirementToContactEmpty)) {
                    r2 = false;
                }
                f5Var.Q(20, r2);
            }
            r5();
            return;
        }
        if (i7 == org.telegram.messenger.qs.f5) {
            r5();
            return;
        }
        if (i7 == org.telegram.messenger.qs.y3) {
            D5(false, false);
            return;
        }
        if (i7 == org.telegram.messenger.qs.C3) {
            D5(false, false);
            return;
        }
        if (i7 == org.telegram.messenger.qs.D3) {
            D5(false, false);
            return;
        }
        if (i7 == org.telegram.messenger.qs.y1) {
            if (a() == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.q4 q4Var2 = this.parentLayout;
                if (q4Var2 == null || q4Var2.getLastFragment() != this) {
                    removeSelfFromStack();
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.f3) {
            long longValue3 = ((Long) objArr[0]).longValue();
            if (this.J4 >= 0 || longValue3 != a()) {
                return;
            }
            J5();
            V();
            jw0 jw0Var3 = this.d;
            if (jw0Var3 != null) {
                jw0Var3.f();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.G3) {
            if (((Long) objArr[0]).longValue() != a() || v4()) {
                return;
            }
            if (this.J4 >= 0) {
                vv0 vv0Var5 = this.N;
                if (vv0Var5 != null) {
                    vv0Var5.N1(true);
                    return;
                }
                return;
            }
            J5();
            V();
            jw0 jw0Var4 = this.d;
            if (jw0Var4 != null) {
                jw0Var4.f();
            }
            org.telegram.messenger.g0.h3(new j90(this, 19));
            return;
        }
        if (i7 == org.telegram.messenger.qs.V3) {
            if (((Long) objArr[0]).longValue() != a() || this.d1 <= 0) {
                return;
            }
            TLRPC.UserFull b22 = getMessagesController().b2(this.d1);
            if (b22 != null) {
                this.u2 = b22;
            }
            J5();
            V();
            qu0 qu0Var4 = this.a;
            if (qu0Var4 != null && qu0Var4.c0()) {
                this.a.post(new j90(this, 21));
                return;
            }
            jw0 jw0Var5 = this.d;
            if (jw0Var5 != null) {
                jw0Var5.f();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.qs.W3) {
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
            if (i11 >= arrayList2.size()) {
                org.telegram.messenger.g0.b4(this.a);
                return;
            } else {
                ((TLRPC.ChatParticipant) arrayList2.get(i11)).setRank(longValue5, str);
                i11++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.j30 j30Var = this.q0;
        if (j30Var == null || !j30Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.j30 j30Var = this.q0;
        return (j30Var == null || dialog != j30Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final int e4() {
        if (this.d1 == 0 || this.q0 == null || this.r1) {
            return org.telegram.messenger.g0.L(74 + ((this.H4 || this.I4) ? 25 : 0));
        }
        return 0;
    }

    public final void e5(cw0 cw0Var) {
        if (this.i5 == cw0Var) {
            return;
        }
        this.i5 = cw0Var;
        org.telegram.messenger.g0.d0(this.a, new fu0(this, 0));
    }

    @Override // org.telegram.ui.Components.mr0
    public final org.telegram.ui.Components.pj0 f() {
        return this.a;
    }

    public final int f4(ImageReceiver imageReceiver) {
        return imageReceiver.t() instanceof org.telegram.ui.Components.d51 ? ((org.telegram.ui.Components.d51) imageReceiver.t()).a.a() : org.telegram.messenger.g0.p(this.e0.getImageReceiver().n());
    }

    public final void f5(CharSequence charSequence) {
        this.W5 = charSequence;
        H5();
    }

    @Override // org.telegram.ui.Components.mr0
    public final TLRPC.Chat g() {
        return this.D2;
    }

    public final org.telegram.ui.Components.g5 g4(long j3) {
        if (this.G == null) {
            org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(17.0f), 2, this.f, false);
            this.G = g5Var;
            int L = org.telegram.messenger.g0.L(1.0f);
            g5Var.I = 0;
            g5Var.J = L;
            if (this.G0) {
                this.G.a();
            }
        }
        if (j3 != 0) {
            this.G.j(j3, false);
        } else {
            this.G.g(null, false);
        }
        s5();
        return this.G;
    }

    public final void g5(int i7) {
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        if (org.telegram.messenger.g0.Q1()) {
            return;
        }
        this.J1 = i7 != 0;
        this.K1 = i7 != 0;
        K5();
        if (e12.getBoolean("view_animations", true)) {
            this.I1 = i7;
        } else if (i7 == 2) {
            this.m1 = true;
        }
    }

    public float getAvatarAnimationProgress() {
        return this.R1;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.z0;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        if (this.z0 != null) {
            return null;
        }
        f6 f6Var = new f6(18, this);
        ArrayList arrayList = new ArrayList();
        vv0 vv0Var = this.N;
        if (vv0Var != null) {
            arrayList.addAll(vv0Var.getThemeDescriptions());
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.p0}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ki));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.li));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.x6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"detailTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.z6));
        int i7 = org.telegram.ui.ActionBar.k6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 131072, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.Ei;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 196608, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 131072, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 196608, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.n6));
        if (this.R5) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.H}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Cj));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.H}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ni));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final int getThemedColor(int i7) {
        return org.telegram.ui.ActionBar.k6.w0(i7, this.z0);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final Drawable getThemedDrawable(String str) {
        org.telegram.ui.ActionBar.f6 f6Var = this.z0;
        Drawable drawable = f6Var != null ? f6Var.getDrawable(str) : null;
        return drawable != null ? drawable : super.getThemedDrawable(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0114, code lost:
    
        if (r25.inviter_id != getUserConfig().e()) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0116, code lost:
    
        if (r26 == false) goto L86;
     */
    @Override // org.telegram.ui.Components.mr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z9, boolean z10, View view) {
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        TLRPC.ChannelParticipant channelParticipant;
        boolean z21;
        int i7 = 0;
        if (getParentActivity() != null) {
            if (z9) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(chatParticipant.user_id));
                if (a22 != null) {
                    long j3 = chatParticipant.user_id;
                    this.z2 = j3;
                    boolean z22 = j3 == getUserConfig().e();
                    if (org.telegram.messenger.t3.T(this.D2)) {
                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        str = channelParticipant.rank;
                        z15 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        z14 = z15 || (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin);
                        z11 = z22;
                        getMessagesController().a2(Long.valueOf(chatParticipant.user_id));
                        z20 = org.telegram.messenger.t3.w(4, this.D2);
                        boolean z23 = org.telegram.messenger.t3.w(25, this.D2) && (!z14 || ((!z15 && channelParticipant.can_edit) || z11));
                        if (z15 || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit)) {
                            z20 = false;
                            z23 = false;
                        }
                        if ((z11 || (channelParticipant instanceof TLRPC.TL_channelParticipantSelf)) && org.telegram.messenger.t3.h(this.D2)) {
                            z23 = true;
                        }
                        z16 = org.telegram.messenger.t3.w(2, this.D2) && (!((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || z15) || channelParticipant.can_edit);
                        z19 = this.D2.gigagroup ? false : z16;
                        z12 = true;
                        z13 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                        z18 = z23;
                    } else {
                        z11 = z22;
                        z12 = true;
                        str = chatParticipant.rank;
                        z13 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        z14 = z13 || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator);
                        z15 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        TLRPC.Chat chat = this.D2;
                        z16 = chat.creator || ((chatParticipant instanceof TLRPC.TL_chatParticipant) && (org.telegram.messenger.t3.w(2, chat) || chatParticipant.inviter_id == getUserConfig().e()));
                        TLRPC.Chat chat2 = this.D2;
                        boolean z24 = chat2.creator;
                        if (org.telegram.messenger.t3.w(25, chat2)) {
                            z17 = z24;
                            if (z14) {
                                if (!z15) {
                                }
                            }
                            z18 = true;
                            z19 = this.D2.creator;
                            z20 = z17;
                            channelParticipant = null;
                        } else {
                            z17 = z24;
                        }
                        if (!z11 || !org.telegram.messenger.t3.h(this.D2)) {
                            z18 = false;
                            z19 = this.D2.creator;
                            z20 = z17;
                            channelParticipant = null;
                        }
                        z18 = true;
                        z19 = this.D2.creator;
                        z20 = z17;
                        channelParticipant = null;
                    }
                    if (!z11) {
                        z21 = z16;
                    } else if (org.telegram.messenger.t3.h(this.D2) || (z14 && org.telegram.messenger.t3.w(25, this.D2))) {
                        z20 = false;
                        z19 = false;
                        z21 = false;
                        z18 = z12;
                    } else {
                        z20 = false;
                        z19 = false;
                        z21 = false;
                    }
                    boolean z25 = (z20 || z18 || z19 || z21) ? z12 : false;
                    if (z10 || !z25) {
                        return z25;
                    }
                    TLRPC.ChannelParticipant channelParticipant2 = channelParticipant;
                    boolean z26 = z13;
                    ut0 ut0Var = new ut0(this, channelParticipant2, a22, chatParticipant, z26, str);
                    String str2 = str;
                    Drawable U0 = view.getParent() instanceof org.telegram.ui.Components.pj0 ? ((org.telegram.ui.Components.pj0) view.getParent()).U0(view, false) : null;
                    org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, view);
                    H.W(U0);
                    H.w = false;
                    H.l(R.drawable.msg_discussion, org.telegram.messenger.hd.M0(2131745602, null), new vt0(this, a22, i7), !z11);
                    if (!z11 && (z20 || z18 || z19 || z21)) {
                        H.k();
                    }
                    H.l((z14 || !TextUtils.isEmpty(str2)) ? R.drawable.menu_tag_edit : R.drawable.menu_tag_plus, org.telegram.messenger.hd.M0(z14 ? 2131751303 : TextUtils.isEmpty(str2) ? 2131754400 : 2131751276, null), new di.z5(this, a22, str2, z14, z15), z18);
                    H.l(R.drawable.msg_admins, org.telegram.messenger.hd.M0(z26 ? 2131751305 : 2131745548, null), new ef0(ut0Var, 28), z20);
                    H.l(R.drawable.msg_permissions, org.telegram.messenger.hd.M0(2131752540, null), new org.telegram.ui.Components.jv0(this, channelParticipant2, chatParticipant, a22, ut0Var, 25), z19);
                    H.m(R.drawable.msg_remove, new qn0(16, this, chatParticipant), org.telegram.messenger.hd.M0(2131749054, null), z21, true);
                    H.S = org.telegram.messenger.qs.U2;
                    H.Z();
                    return z12;
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

    public final void h4(boolean z9) {
        a0.h hVar;
        if (this.A1 || (hVar = this.B1) == null || this.t2 == null) {
            return;
        }
        this.A1 = true;
        int i7 = (hVar.m() == 0 || !z9) ? 0 : org.telegram.messenger.qs.X4;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = getMessagesController().h1(this.e1);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = z9 ? 0 : this.B1.m();
        tL_channels_getParticipants.limit = org.telegram.messenger.qs.e3;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new jg.v(this, tL_channels_getParticipants, i7)), this.classGuid);
    }

    public final void h5(TLRPC.UserFull userFull, org.telegram.ui.Cells.e6 e6Var, xw0 xw0Var) {
        this.u2 = userFull;
        org.telegram.ui.Components.lu0 lu0Var = this.S;
        if (lu0Var != null) {
            lu0Var.set(userFull.stars_rating);
        }
        cv0 cv0Var = this.u0;
        if (cv0Var != null) {
            cv0Var.setStories(this.u2.stories);
        }
        bi.g1 g1Var = this.v0;
        if (g1Var != null) {
            g1Var.a();
        }
        zu0 zu0Var = this.e0;
        if (zu0Var != null) {
            zu0Var.setHasStories(x4());
        }
        vv0 vv0Var = this.N;
        if (vv0Var != null) {
            vv0Var.setUserInfo(this.u2);
        }
        if (this.v2 == null) {
            this.v2 = e6Var;
        }
        if (this.v2 == null) {
            this.v2 = new org.telegram.ui.Cells.e6(this.currentAccount);
        }
        org.telegram.ui.Cells.e6 e6Var2 = this.v2;
        j90 j90Var = new j90(this, 23);
        if (e6Var2.c) {
            j90Var.run();
        } else {
            e6Var2.h.add(j90Var);
        }
        this.v2.d(this.u2);
        if (this.x2 == null) {
            this.x2 = xw0Var;
        }
        xw0 xw0Var2 = this.x2;
        boolean z9 = true;
        if (xw0Var2 == null) {
            xw0 c10 = xw0.c(this.currentAccount, this.u2, xw0Var2);
            this.x2 = c10;
            this.w2 = c10 != null;
        }
        xw0 xw0Var3 = this.x2;
        if (xw0Var3 != null) {
            j90 j90Var2 = new j90(this, 18);
            if (xw0Var3.b) {
                j90Var2.run();
            } else {
                xw0Var3.h.add(j90Var2);
            }
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.S0;
        if (f5Var != null) {
            TL_account.RequirementToContact J2 = getMessagesController().J2(this.d1);
            if (J2 != null && !(J2 instanceof TL_account.requirementToContactEmpty)) {
                z9 = false;
            }
            f5Var.Q(20, z9);
            if (s4()) {
                this.S0.S(44);
            } else {
                this.S0.t(44);
            }
        }
    }

    public final org.telegram.ui.Components.g5 i4(TLRPC.EmojiStatus emojiStatus, boolean z9) {
        if (this.F == null) {
            org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 2, this.f, false);
            this.F = g5Var;
            if (this.G0) {
                g5Var.a();
            }
        }
        if (this.F.d()) {
            z9 = false;
        }
        this.E = null;
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) == 0 || tL_emojiStatus.until > ((int) (System.currentTimeMillis() / 1000))) {
                this.F.j(tL_emojiStatus.document_id, z9);
                this.F.m(false, z9);
            } else {
                this.F.g(o4(), z9);
                this.F.m(false, z9);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
                this.E = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                this.F.j(tL_emojiStatusCollectible.document_id, z9);
                this.F.m(true, z9);
            } else {
                this.F.g(o4(), z9);
                this.F.m(false, z9);
            }
        } else {
            this.F.g(o4(), z9);
            this.F.m(false, z9);
        }
        s5();
        return this.F;
    }

    public final void i5() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.if0 if0Var = new org.telegram.ui.Components.if0(this.glassEngine, baseSimpleGlass);
        this.I5 = if0Var;
        ww0 ww0Var = this.c1;
        if (ww0Var != null) {
            int i7 = ww0Var.H;
            boolean z9 = ww0Var.c;
            if (if0Var.i != i7 || if0Var.j != z9) {
                if0Var.i = i7;
                if0Var.j = z9;
                if0Var.a();
            }
        }
        this.I5.b(this.J5);
        org.telegram.ui.Components.ef0 ef0Var = this.Z;
        if (ef0Var != null) {
            ef0Var.setGlassFactory(this.I5.c);
        }
        org.telegram.ui.Components.zf0 zf0Var = this.b0;
        if (zf0Var != null) {
            zf0Var.setGlassFactory(this.I5.c);
        }
        this.simpleActionBar.setButtonsGlass(this.I5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        tv0 tv0Var = this.m5;
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.f6 f6Var = this.z0;
        baseSimpleGlass.m = tv0Var;
        baseSimpleGlass.n = null;
        baseSimpleGlass.g(tv0Var, y4Var, f6Var);
        org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
        org.telegram.ui.Components.if0 if0Var2 = this.I5;
        dh.c cVar = if0Var2.e;
        ri.d dVar = if0Var2.f;
        y4Var2.n0 = cVar;
        y4Var2.o0 = dVar;
        y4Var2.setBackground(null);
        this.G5 = c8.g0.m(this.z0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.H5);
        A5();
        baseSimpleGlass.o = this.L6;
        View view = new View(getParentActivity());
        this.T5 = view;
        view.setAlpha(0.0f);
        this.m5.getViewTreeObserver().addOnPreDrawListener(new fk(this, 1));
        this.N.z(this.T5);
        View view2 = this.T5;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.B5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        tv0 tv0Var2 = this.m5;
        tv0Var2.addView(this.B5, tv0Var2.indexOfChild(this.Y), c8.ha.e(-1, 0, 48));
        this.glassEngine.b(this.a);
        this.N.setPagesGlassEngine(this.glassEngine);
        this.N.setOnTopPanelShiftChanged(new j90(this, 22));
        H3();
        x5();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.o2;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        int w02;
        if (this.o2) {
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.v()) {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.w8, this.z0);
        } else if (this.R5 || this.A5 > 0.5f) {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.z0);
        } else {
            org.telegram.messenger.fp fpVar = this.g6;
            w02 = fpVar != null ? fpVar.d(org.telegram.ui.ActionBar.k6.I.q()) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.z0);
        }
        return i0.a.h(w02) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r3.contains((int) r7.getX(), ((int) r7.getY()) - r6.actionBar.getMeasuredHeight()) != false) goto L20;
     */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        vv0 vv0Var;
        av0 av0Var = this.n0;
        Rect rect = this.K2;
        if (av0Var != null && av0Var.getVisibility() == 0 && this.n0.getRealCount() > 1) {
            this.n0.getHitRect(rect);
            if (motionEvent != null) {
            }
        }
        if (this.J4 != -1 && (vv0Var = this.N) != null) {
            if (vv0Var.J0()) {
                this.N.getHitRect(rect);
                if (motionEvent == null || rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
                    vv0 vv0Var2 = this.N;
                    return vv0Var2.getSelectedTab() == vv0Var2.K0.getFirstTabId();
                }
            }
            return false;
        }
        return true;
    }

    public final int j4() {
        return e4() + k4();
    }

    public final void j5(boolean z9, boolean z10) {
        if (this.g0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.f0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f0 = null;
        }
        if (!z10) {
            if (z9) {
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
        int i7 = 1;
        if (z9) {
            this.g0.setVisibility(0);
            this.f0.playTogether(ObjectAnimator.ofFloat(this.g0, (Property<org.telegram.ui.Cells.b4, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.g0, (Property<org.telegram.ui.Cells.b4, Float>) View.ALPHA, 0.0f));
        }
        this.f0.setDuration(180L);
        this.f0.addListener(new nv0(this, z9, i7));
        this.f0.start();
    }

    @Override // org.telegram.ui.ie0
    public final ri.f k() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final int k4() {
        return e4() == 0 ? org.telegram.messenger.g0.L(168.0f) : org.telegram.messenger.g0.L(152.0f);
    }

    public final void k5() {
        Long l10;
        if (this.N5 != null) {
            return;
        }
        h11[] h11VarArr = new h11[1];
        Rect rect = org.telegram.messenger.g0.Q;
        ok okVar = this.f;
        if (okVar != null) {
            if (okVar.getRightDrawable() == null) {
                rect.set(this.f.getWidth() - 1, (this.f.getHeight() / 2) - 1, this.f.getWidth() + 1, (this.f.getHeight() / 2) + 1);
            } else {
                rect.set(this.f.getRightDrawable().getBounds());
                rect.offset((int) ((this.f.getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) this.f.getX(), (int) this.f.getY());
            }
        }
        int i7 = this.f.getScaleX() < 1.5f ? 16 : 32;
        int L = (-(this.Y.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(i7);
        float L2 = org.telegram.messenger.g0.L(324.0f);
        Point point = org.telegram.messenger.g0.q;
        int min = (int) Math.min(L2, point.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = c8.j9.b(centerX - (min / 2), 0, point.x - min);
        gv0 gv0Var = new gv0(this, this, getParentActivity(), Integer.valueOf(Math.max(0, centerX - b10)), this.D2 == null ? 0 : 9, this.z0, i7, h11VarArr);
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.d1));
        if (a22 != null) {
            gv0Var.setExpireDateHint(org.telegram.messenger.m5.g(a22.emoji_status));
        }
        Long l11 = this.E;
        if (l11 != null) {
            gv0Var.setSelected(l11);
        } else {
            org.telegram.ui.Components.g5 g5Var = this.F;
            if (g5Var != null) {
                Drawable drawable = g5Var.f[0];
                if (drawable instanceof org.telegram.ui.Components.i5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.i5) drawable).h());
                    gv0Var.setSelected(l10);
                }
            }
            l10 = null;
            gv0Var.setSelected(l10);
        }
        gv0Var.setSaveState(3);
        gv0Var.y(this.F, this.f);
        hv0 hv0Var = new hv0(this, gv0Var);
        this.N5 = hv0Var;
        h11VarArr[0] = hv0Var;
        int[] iArr = new int[2];
        ok okVar2 = this.f;
        if (okVar2 != null) {
            okVar2.getLocationOnScreen(iArr);
        }
        h11VarArr[0].showAsDropDown(this.fragmentView, b10, L, 51);
        h11VarArr[0].b();
    }

    public final float l4() {
        return Math.max(this.A5, this.Q5);
    }

    public final void l5() {
        int i7 = 0;
        this.N.K0.setReordering(false);
        vv0 vv0Var = this.N;
        org.telegram.ui.Components.tq0 tq0Var = vv0Var.K0;
        if (vv0Var.x1 != null && tq0Var != null) {
            boolean C0 = vv0Var.C0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = tq0Var.getTabIds();
            int size = tabIds.size();
            while (i7 < size) {
                Integer num = tabIds.get(i7);
                i7++;
                TLRPC.ProfileTab o02 = org.telegram.ui.Components.xs0.o0(num.intValue(), C0);
                if (o02 != null) {
                    arrayList.add(o02);
                }
            }
        }
        this.N.N1(true);
        this.y5.animate().translationY(org.telegram.messenger.g0.L(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new j90(this, 25)).start();
        org.telegram.ui.Components.hc.a0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    public final float m4(float f10, float f11) {
        this.u6 = f10;
        this.w6 = f11;
        int i7 = this.I1;
        float l10 = Utilities.l(i7 == 2 ? 1.0f : (this.R1 >= 1.0f || i7 == 0) ? this.j2 : 0.0f);
        org.telegram.ui.Components.lu0 lu0Var = this.S;
        return Math.max(0.0f, (p4() + this.o5) * l10) + com.google.android.recaptcha.internal.a.z(1.0f, l10, f11 * (lu0Var != null ? lu0Var.getVisibilityFactor() : 0.0f), f10);
    }

    public final void m5() {
        if (!this.o2) {
            bv0 bv0Var = this.r;
            if (bv0Var != null) {
                Object tag = bv0Var.getTag();
                if (tag instanceof Integer) {
                    this.r.setTextColor(I3(org.telegram.ui.ActionBar.k6.w0(((Integer) tag).intValue(), this.z0), Boolean.valueOf(this.J0[0])));
                } else {
                    this.r.setTextColor(I3(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.z0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.x;
            if (drawable != null) {
                drawable.setColorFilter(this.g6 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.dd, this.z0), PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.gk0 gk0Var = this.K;
            if (gk0Var != null) {
                gk0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, this.z0));
            }
            ok okVar = this.f;
            if (okVar != null) {
                okVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ji, this.z0));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.D(this.g6 == null ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.z0) : -1, false);
                this.actionBar.C(this.g6 != null ? 553648127 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f8, this.z0), false);
            }
        }
        s5();
        P5();
    }

    public final float n4(float f10) {
        this.x6 = f10;
        int i7 = this.I1;
        return com.google.android.recaptcha.internal.a.z(1.0f, Utilities.l(i7 == 2 ? 1.0f : (this.R1 >= 1.0f || i7 == 0) ? this.j2 : 0.0f), this.S != null ? this.S.getVisibilityFactor() * org.telegram.messenger.g0.L(3.0f) : 0.0f, f10);
    }

    public final void n5() {
        k0 k0Var;
        if (this.Z == null || this.r == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        org.telegram.ui.Components.ef0 ef0Var = this.Z;
        boolean z9 = this.F1;
        ef0Var.e = z9;
        if (z9 && this.I1 == 2 && (k0Var = this.X) != null) {
            this.Z.f = this.X.getY() + (this.X.getScaleY() * k0Var.getHeight());
            this.Z.setAlpha(this.R1);
            org.telegram.ui.Components.ef0 ef0Var2 = this.Z;
            float measuredWidth = this.a.getMeasuredWidth();
            ef0Var2.x = org.telegram.messenger.g0.L(74.0f);
            ef0Var2.setTranslationY(measuredWidth);
            ef0Var2.invalidate();
        } else {
            ef0Var.f = -1.0f;
            float f10 = currentActionBarHeight;
            float L = (this.P1 + f10) - org.telegram.messenger.g0.L((this.H4 || this.I4) ? 25.0f : 0.0f);
            float min = Math.min(org.telegram.messenger.g0.L(74.0f), L - f10);
            org.telegram.ui.Components.ef0 ef0Var3 = this.Z;
            ef0Var3.x = min;
            ef0Var3.setTranslationY(L - min);
            ef0Var3.invalidate();
        }
        ImageView imageView = this.O0;
        if (imageView == null || imageView.getTag() == null) {
            return;
        }
        this.Z.getClass();
        if (this.O0.getVisibility() == 0) {
            this.O0.setVisibility(8);
        }
        if (this.O0.getTag() instanceof org.telegram.ui.ActionBar.r0) {
            ((org.telegram.ui.ActionBar.r0) this.O0.getTag()).setAlpha(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean needDelayOpenAnimation() {
        return this.I1 == 0;
    }

    public final org.telegram.ui.Components.wq o4() {
        if (this.J == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            this.D = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ni, this.z0), PorterDuff.Mode.MULTIPLY);
            this.J = new org.telegram.ui.Components.wq(this.D, getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return this.J;
    }

    public final void o5() {
        if (this.Y0 == null || this.Z0 == null) {
            return;
        }
        TLRPC.UserFull userFull = this.u2;
        int i7 = (userFull == null && this.t2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.t2.ttl_period;
        this.s0.b(i7);
        this.Z0.t(i7);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        org.telegram.ui.Components.j30 j30Var = this.q0;
        if (j30Var != null) {
            j30Var.h(i7, i10, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.tq0 tq0Var;
        if (super.onBackPressed(z9)) {
            vv0 vv0Var = this.N;
            if (vv0Var == null || (tq0Var = vv0Var.K0) == null || !tq0Var.n0) {
                if (this.J4 == -1 || vv0Var == null || !vv0Var.E1) {
                    return this.actionBar.isEnabled();
                }
                if (z9) {
                    vv0Var.V(true);
                }
            } else if (z9) {
                l5();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.L;
        if (undoView != null) {
            undoView.d(0, true);
        }
        super.onBecomeFullyHidden();
        this.n6 = false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        Q5();
        this.n6 = true;
        U3();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        super.onConfigurationChanged(configuration);
        vv0 vv0Var = this.N;
        if (vv0Var != null) {
            vv0Var.onConfigurationChanged(configuration);
        }
        t4();
        if (this.m2 && this.o2 && (m10 = this.c.m(0)) != null) {
            this.a.scrollBy(0, m10.getTop() - j4());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new e7(this, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:264:0x07d0  */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet onCustomTransitionAnimation(boolean z9, Runnable runnable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.r0 r0Var;
        boolean z10;
        ax0 ax0Var;
        org.telegram.ui.ActionBar.r0 r0Var2;
        Object obj;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.r0 j3;
        long j10;
        boolean z11;
        TLRPC.Chat chat;
        sv svVar;
        if (!this.I0) {
            J5();
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
                org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                int i7 = 2;
                if (q4Var != null && q4Var.getFragmentStack().size() >= 2) {
                    Object obj2 = (org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    if (obj2 instanceof org.telegram.ui.Components.kg) {
                        this.g5 = (org.telegram.ui.Components.kg) obj2;
                    }
                    if ((obj2 instanceof ww) && (svVar = ((ww) obj2).F3) != null) {
                        zv zvVar = svVar.a;
                        if (com.google.android.recaptcha.internal.a.u(zvVar)) {
                            this.g5 = zvVar;
                        }
                    }
                }
                Object obj3 = this.g5;
                if (obj3 instanceof an) {
                    kVar = ((org.telegram.ui.ActionBar.f2) obj3).getActionBar();
                    kVar.setSkipDrawChild(true);
                } else {
                    kVar = null;
                }
                org.telegram.ui.Components.kg kgVar = this.g5;
                boolean z12 = (kgVar instanceof an) && ((an) kgVar).e != null;
                if (kgVar != null) {
                    ImageView imageView5 = this.i0;
                    if (imageView5 != null) {
                        if (!(kgVar instanceof an) || (chat = ((an) kgVar).e) == null || chat.linked_community_id == 0) {
                            imageView5.setTag(null);
                            this.i0.setVisibility(8);
                        } else {
                            imageView5.setTag(1);
                            this.i0.setVisibility(0);
                        }
                    }
                    if (this.l0 != null) {
                        org.telegram.ui.Components.kg kgVar2 = this.g5;
                        if ((kgVar2 instanceof an) && org.telegram.messenger.t3.p0(((an) kgVar2).e)) {
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
                    K5();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(this.I1 == 2 ? 250L : 180L);
                this.a.setLayerType(2, null);
                if (z9) {
                    this.e6 = 0.0f;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.r.getLayoutParams();
                    r0Var = null;
                    layoutParams.rightMargin = (int) ((org.telegram.messenger.g0.p * (-21.0f)) + org.telegram.messenger.g0.L(8.0f));
                    this.r.setLayoutParams(layoutParams);
                    if (this.I1 != 2) {
                        j10 = 0;
                        int ceil = (int) Math.ceil((org.telegram.messenger.g0.p * 21.0f) + (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(117.0f)));
                        float measureText = (this.f.getPaint().measureText(this.f.getText().toString()) * 1.12f) + this.f.getSideDrawablesSize();
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                        if (ceil < measureText) {
                            layoutParams2.width = (int) Math.ceil(r4 / 1.12f);
                        } else {
                            layoutParams2.width = -2;
                        }
                        this.f.setLayoutParams(layoutParams2);
                        this.Q1 = j4();
                    } else {
                        j10 = 0;
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                        layoutParams3.width = (int) ((org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(32.0f)) / 1.38f);
                        this.f.setLayoutParams(layoutParams3);
                    }
                    this.fragmentView.setBackgroundColor(0);
                    setAvatarAnimationProgress(0.0f);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 0.0f, 1.0f));
                    org.telegram.ui.Components.ch0 ch0Var = this.s;
                    if (ch0Var != null && ch0Var.getTag() == null) {
                        this.s.setScaleX(0.2f);
                        this.s.setScaleY(0.2f);
                        this.s.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ch0, Float>) View.SCALE_X, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ch0, Float>) View.SCALE_Y, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ch0, Float>) View.ALPHA, 1.0f));
                    }
                    cv0 cv0Var = this.u0;
                    if (cv0Var != null && this.I1 == 2) {
                        cv0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.u0, (Property<cv0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.I1 == 2) {
                        this.r0 = f4(this.e0.getImageReceiver());
                        this.f.setTextColor(-1);
                        this.r.setTextColor(-1275068417);
                        this.actionBar.C(1090519039, false);
                        uw0 uw0Var = this.y6;
                        if (uw0Var != null) {
                            uw0Var.a(603979775);
                        }
                        kw0 kw0Var = this.M;
                        kw0Var.E = true;
                        kw0Var.setVisibility(0);
                    }
                    if (this.I1 == 2) {
                        this.f.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<ok, Float>) View.ALPHA, 1.0f));
                    } else {
                        this.f.setAlpha(1.0f);
                    }
                    if (this.u0 != null) {
                        if (a() > j10) {
                            this.u0.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.u0, (Property<cv0, Float>) View.ALPHA, 1.0f));
                        } else {
                            this.u0.setAlpha(1.0f);
                            this.u0.setFragmentTransitionProgress(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.u0, "fragmentTransitionProgress", 1.0f));
                        }
                    }
                    bi.g1 g1Var = this.v0;
                    if (g1Var != null) {
                        g1Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.v0, (Property<bi.g1, Float>) View.ALPHA, 1.0f));
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
                    if (this.L0 && (this.e1 != j10 || z12)) {
                        this.P0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<org.telegram.ui.ActionBar.f5, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.M0) {
                        this.Q0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.f5, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.f5, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.X0.getTag() != null) {
                        this.X0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.X0, (Property<ImageView, Float>) View.ALPHA, 1.0f));
                    }
                    zu0 zu0Var = this.e0;
                    if (zu0Var != null) {
                        zu0Var.setCrossfadeProgress(1.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.e0, wv0.g0, 0.0f));
                    }
                    org.telegram.ui.Components.kg kgVar3 = this.g5;
                    if (kgVar3 != null) {
                        org.telegram.ui.Components.kn r10 = kgVar3.r();
                        if (r10 != null) {
                            org.telegram.ui.Components.gn gnVar = r10.e;
                            org.telegram.ui.Components.rt0 D = this.g5.D();
                            RectF rectF = jh.k.h;
                            jh.k.c(gnVar, D, rectF);
                            this.e6 = rectF.left;
                        }
                        if ((r10 == null || !(r10.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.k5) || ((org.telegram.ui.ActionBar.k5) r10.getSubtitleTextView()).getLeftDrawable() == null) && !r10.S[0]) {
                            z11 = false;
                        } else {
                            this.W4 = r10.getSubtitleTextView();
                            this.Y.invalidate();
                            this.r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<bv0, Float>) View.ALPHA, 1.0f));
                            z11 = true;
                        }
                        setAvatarAnimationProgress(0.0f);
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        if (this.I1 == 2) {
                            this.r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<bv0, Float>) View.ALPHA, 1.0f));
                        } else {
                            this.r.setAlpha(1.0f);
                        }
                    }
                    animatorSet.playTogether(arrayList);
                } else {
                    r0Var = null;
                    this.Q1 = this.P1;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 1.0f, 0.0f));
                    org.telegram.ui.Components.ch0 ch0Var2 = this.s;
                    if (ch0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(ch0Var2, (Property<org.telegram.ui.Components.ch0, Float>) View.SCALE_X, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ch0, Float>) View.SCALE_Y, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ch0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.I1 == 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f, (Property<ok, Float>) View.ALPHA, 0.0f));
                    }
                    cv0 cv0Var2 = this.u0;
                    if (cv0Var2 != null) {
                        if (this.h1 > 0) {
                            arrayList2.add(ObjectAnimator.ofFloat(cv0Var2, (Property<cv0, Float>) View.ALPHA, 0.0f));
                        } else {
                            arrayList2.add(ObjectAnimator.ofFloat(cv0Var2, "fragmentTransitionProgress", 0.0f));
                        }
                    }
                    bi.g1 g1Var2 = this.v0;
                    if (g1Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(g1Var2, (Property<bi.g1, Float>) View.ALPHA, 0.0f));
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
                    if (this.L0 && (this.e1 != 0 || z12)) {
                        this.P0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.P0, (Property<org.telegram.ui.ActionBar.f5, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.M0) {
                        this.Q0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.f5, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.f5, Float>) View.ALPHA, 0.0f));
                    }
                    ImageView imageView6 = this.X0;
                    if (imageView6 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) View.ALPHA, imageView6.getAlpha(), 0.0f));
                    }
                    zu0 zu0Var2 = this.e0;
                    if (zu0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(zu0Var2, wv0.g0, 1.0f));
                    }
                    org.telegram.ui.ActionBar.f2 f2Var = this.parentLayout.getFragmentStack().size() > 1 ? (org.telegram.ui.ActionBar.f2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) : null;
                    if (f2Var instanceof an) {
                        an anVar = (an) f2Var;
                        ui uiVar = anVar.o1;
                        org.telegram.messenger.g0.K(uiVar, new mc0(this, uiVar, anVar, 27));
                        View subtitleTextView = uiVar.getSubtitleTextView();
                        if (((subtitleTextView instanceof org.telegram.ui.ActionBar.k5) && ((org.telegram.ui.ActionBar.k5) subtitleTextView).getLeftDrawable() != null) || uiVar.S[0]) {
                            this.W4 = uiVar.getSubtitleTextView();
                            this.Y.invalidate();
                            arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<bv0, Float>) View.ALPHA, 0.0f));
                            z10 = true;
                            if (!z10 && this.I1 == 2) {
                                arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<bv0, Float>) View.ALPHA, 0.0f));
                            }
                            animatorSet.playTogether(arrayList2);
                            ax0Var = this.z6;
                            if (ax0Var != null) {
                                ax0Var.animate().alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            }
                        }
                    }
                    z10 = false;
                    if (!z10) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<bv0, Float>) View.ALPHA, 0.0f));
                    }
                    animatorSet.playTogether(arrayList2);
                    ax0Var = this.z6;
                    if (ax0Var != null) {
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new cu0(this, i7));
                animatorSet.playTogether(ofFloat);
                if (this.O0 == null || (obj = this.g5) == null || (yVar = ((org.telegram.ui.ActionBar.f2) obj).getActionBar().E) == null || (j3 = yVar.j(32)) == null || j3.getVisibility() != 0) {
                    r0Var2 = r0Var;
                } else {
                    j3.setAlpha(0.0f);
                    if (z9) {
                        this.O0.setVisibility(0);
                    }
                    this.O0.setTag(j3);
                    r0Var2 = j3;
                }
                animatorSet.addListener(new jg.j0(this, kVar, r0Var2, runnable, 5));
                animatorSet.setInterpolator(this.I1 == 2 ? org.telegram.ui.Components.xq.f : new DecelerateInterpolator());
                org.telegram.messenger.g0.i3(new gq0(animatorSet, 4), 50L);
                return animatorSet;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onDialogDismiss(Dialog dialog) {
        qu0 qu0Var = this.a;
        if (qu0Var != null) {
            qu0Var.g1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0458  */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        long e10;
        org.telegram.ui.Components.ps0 ps0Var;
        jw0 jw0Var;
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
        this.d5 = pf.b.d(this.arguments.getString("vcard_phone"), false);
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
            boolean z9 = this.arguments.getBoolean("expandPhoto", false);
            this.m1 = z9;
            if (z9) {
                this.j2 = 1.0f;
                this.n1 = true;
            }
        }
        if (this.d1 == 0) {
            if (this.e1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.e1));
                this.D2 = M0;
                if (M0 == null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    getMessagesStorage().a.c(new qn0(19, this, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                    if (this.D2 != null) {
                        getMessagesController().Q3(this.D2, true);
                    }
                }
                org.telegram.messenger.n6 n6Var = this.W1;
                if (n6Var != null) {
                    n6Var.g();
                }
                if (this.D2.megagroup) {
                    h4(true);
                } else {
                    this.B1 = null;
                }
                getNotificationCenter().c(this, org.telegram.messenger.qs.T);
                getNotificationCenter().c(this, org.telegram.messenger.qs.g1);
                getNotificationCenter().c(this, org.telegram.messenger.qs.w2);
                getNotificationCenter().c(this, org.telegram.messenger.qs.b1);
                getNotificationCenter().c(this, org.telegram.messenger.qs.p3);
                org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.B5);
                this.B2 = new ArrayList();
                G5(true);
                if (this.t2 == null) {
                    this.t2 = getMessagesController().N0(this.e1);
                }
                if (org.telegram.messenger.t3.T(this.D2)) {
                    getMessagesController().V2(this.classGuid, this.e1, true);
                } else if (this.t2 == null) {
                    this.t2 = getMessagesStorage().F0(this.e1, false, null, false, false, 0);
                }
                v5();
                e10 = getUserConfig().e();
                if (this.d1 != e10) {
                }
                this.r1 = true;
                ps0Var = this.Q;
                if (ps0Var != null) {
                    ps0Var.b(this);
                    this.Q = null;
                }
                if (this.Q == null) {
                }
                this.Q.y.add(this);
                getNotificationCenter().c(this, org.telegram.messenger.qs.r);
                getNotificationCenter().c(this, 1);
                getNotificationCenter().c(this, org.telegram.messenger.qs.t);
                getNotificationCenter().c(this, org.telegram.messenger.qs.v);
                getNotificationCenter().c(this, org.telegram.messenger.qs.q5);
                getNotificationCenter().c(this, org.telegram.messenger.qs.D1);
                getNotificationCenter().c(this, org.telegram.messenger.qs.c0);
                getNotificationCenter().c(this, org.telegram.messenger.qs.v5);
                getNotificationCenter().c(this, org.telegram.messenger.qs.F5);
                getNotificationCenter().c(this, org.telegram.messenger.qs.i3);
                getNotificationCenter().c(this, org.telegram.messenger.qs.f5);
                getNotificationCenter().c(this, org.telegram.messenger.qs.y3);
                getNotificationCenter().c(this, org.telegram.messenger.qs.C3);
                getNotificationCenter().c(this, org.telegram.messenger.qs.D3);
                getNotificationCenter().c(this, org.telegram.messenger.qs.y1);
                getNotificationCenter().c(this, org.telegram.messenger.qs.f3);
                getNotificationCenter().c(this, org.telegram.messenger.qs.G3);
                getNotificationCenter().c(this, org.telegram.messenger.qs.V3);
                getNotificationCenter().c(this, org.telegram.messenger.qs.W3);
                org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
                J5();
                jw0Var = this.d;
                if (jw0Var != null) {
                }
                if (this.arguments.containsKey("preload_messages")) {
                }
                if (this.d1 != 0) {
                    getConnectionsManager().sendRequest(new TL_account.getPassword(), new gu0(this, 5));
                }
                setBulletinDelegate(new y8(this, 8));
                if (this.d1 != 0) {
                    getMessagesController().R0(null);
                }
                W4();
                this.G6 = !this.I0 ? org.telegram.messenger.g0.L(72.0f) : 0;
                this.H6 = this.I0 ? org.telegram.messenger.g0.L(64.0f) : 0;
                return true;
            }
            return false;
        }
        long j3 = this.arguments.getLong("dialog_id", 0L);
        this.h1 = j3;
        if (j3 != 0) {
            this.C2 = getMessagesController().a1(Integer.valueOf((int) (this.h1 & 4294967295L)));
        }
        org.telegram.messenger.n6 n6Var2 = this.W1;
        if (n6Var2 != null) {
            n6Var2.g();
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.d1));
        if (a22 != null) {
            getNotificationCenter().c(this, org.telegram.messenger.qs.O);
            getNotificationCenter().c(this, org.telegram.messenger.qs.s1);
            getNotificationCenter().c(this, org.telegram.messenger.qs.a0);
            getNotificationCenter().c(this, org.telegram.messenger.qs.Y);
            getNotificationCenter().c(this, org.telegram.messenger.qs.g0);
            getNotificationCenter().c(this, org.telegram.messenger.qs.D0);
            getNotificationCenter().c(this, org.telegram.messenger.qs.E0);
            getNotificationCenter().c(this, org.telegram.messenger.qs.k0);
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.x4);
            this.j1 = getMessagesController().G0.indexOfKey(this.d1) >= 0;
            if (a22.bot) {
                this.q2 = true;
                org.telegram.messenger.ui mediaDataController = getMediaDataController();
                long j10 = a22.id;
                mediaDataController.G0(j10, j10, true, this.classGuid, null);
            }
            this.u2 = getMessagesController().b2(this.d1);
            getMessagesController().W2(getMessagesController().a2(Long.valueOf(this.d1)), this.classGuid, true, null);
            this.B1 = null;
            if (org.telegram.messenger.t10.B(a22)) {
                org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(0, true, true);
                this.q0 = j30Var;
                j30Var.H = true;
                j30Var.a = this;
                j30Var.b = this;
                getMediaDataController().x();
                getMessagesController().d3();
                getMessagesController().g3(getUserConfig().f(), true, this.classGuid);
            }
            this.X4 = this.arguments.getInt("actionBarColor", 0);
            e10 = getUserConfig().e();
            if ((this.d1 != e10 || this.h1 == e10) && !this.r1) {
                this.r1 = true;
            }
            ps0Var = this.Q;
            if (ps0Var != null && ps0Var.s != this.f1) {
                ps0Var.b(this);
                this.Q = null;
            }
            if (this.Q == null) {
                this.Q = new org.telegram.ui.Components.ps0(this);
            }
            this.Q.y.add(this);
            getNotificationCenter().c(this, org.telegram.messenger.qs.r);
            getNotificationCenter().c(this, 1);
            getNotificationCenter().c(this, org.telegram.messenger.qs.t);
            getNotificationCenter().c(this, org.telegram.messenger.qs.v);
            getNotificationCenter().c(this, org.telegram.messenger.qs.q5);
            getNotificationCenter().c(this, org.telegram.messenger.qs.D1);
            getNotificationCenter().c(this, org.telegram.messenger.qs.c0);
            getNotificationCenter().c(this, org.telegram.messenger.qs.v5);
            getNotificationCenter().c(this, org.telegram.messenger.qs.F5);
            getNotificationCenter().c(this, org.telegram.messenger.qs.i3);
            getNotificationCenter().c(this, org.telegram.messenger.qs.f5);
            getNotificationCenter().c(this, org.telegram.messenger.qs.y3);
            getNotificationCenter().c(this, org.telegram.messenger.qs.C3);
            getNotificationCenter().c(this, org.telegram.messenger.qs.D3);
            getNotificationCenter().c(this, org.telegram.messenger.qs.y1);
            getNotificationCenter().c(this, org.telegram.messenger.qs.f3);
            getNotificationCenter().c(this, org.telegram.messenger.qs.G3);
            getNotificationCenter().c(this, org.telegram.messenger.qs.V3);
            getNotificationCenter().c(this, org.telegram.messenger.qs.W3);
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
            J5();
            jw0Var = this.d;
            if (jw0Var != null) {
                jw0Var.f();
            }
            if (this.arguments.containsKey("preload_messages")) {
                getMessagesController().s0(this.d1, 0, null);
            }
            if (this.d1 != 0 && org.telegram.messenger.t10.B(getMessagesController().a2(Long.valueOf(this.d1)))) {
                getConnectionsManager().sendRequest(new TL_account.getPassword(), new gu0(this, 5));
            }
            setBulletinDelegate(new y8(this, 8));
            if (this.d1 != 0 && org.telegram.messenger.t10.B(getMessagesController().a2(Long.valueOf(this.d1))) && !this.r1) {
                getMessagesController().R0(null);
            }
            W4();
            this.G6 = !this.I0 ? org.telegram.messenger.g0.L(72.0f) : 0;
            this.H6 = this.I0 ? org.telegram.messenger.g0.L(64.0f) : 0;
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        vv0 vv0Var = this.N;
        if (vv0Var != null) {
            vv0Var.Q0();
        }
        org.telegram.ui.Components.ps0 ps0Var = this.Q;
        if (ps0Var != null) {
            ps0Var.b(this);
        }
        org.telegram.ui.Components.ps0 ps0Var2 = this.Q;
        if (ps0Var2 != null) {
            ps0Var2.y.remove(this);
        }
        getNotificationCenter().n(this, org.telegram.messenger.qs.r);
        getNotificationCenter().n(this, org.telegram.messenger.qs.t);
        getNotificationCenter().n(this, org.telegram.messenger.qs.v);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.q5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.D1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.c0);
        getNotificationCenter().n(this, org.telegram.messenger.qs.v5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.F5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.i3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.y3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.C3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.D3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.y1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.G3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.V3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.W3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        av0 av0Var = this.n0;
        if (av0Var != null) {
            av0Var.K();
        }
        org.telegram.ui.Components.kf0 kf0Var = this.m0;
        if (kf0Var != null) {
            kf0Var.d();
        }
        this.Z5 = null;
        if (this.d1 != 0) {
            getNotificationCenter().n(this, org.telegram.messenger.qs.s1);
            getNotificationCenter().n(this, org.telegram.messenger.qs.O);
            getNotificationCenter().n(this, org.telegram.messenger.qs.a0);
            getNotificationCenter().n(this, org.telegram.messenger.qs.Y);
            getNotificationCenter().n(this, org.telegram.messenger.qs.g0);
            getNotificationCenter().n(this, org.telegram.messenger.qs.D0);
            getNotificationCenter().n(this, org.telegram.messenger.qs.E0);
            getNotificationCenter().n(this, org.telegram.messenger.qs.k0);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.x4);
            getMessagesController().q1.remove(Long.valueOf(this.d1));
        } else if (this.e1 != 0) {
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.B5);
            getNotificationCenter().n(this, org.telegram.messenger.qs.p3);
            getNotificationCenter().n(this, org.telegram.messenger.qs.T);
            getNotificationCenter().n(this, org.telegram.messenger.qs.g1);
            getNotificationCenter().n(this, org.telegram.messenger.qs.w2);
            getNotificationCenter().n(this, org.telegram.messenger.qs.b1);
        }
        zu0 zu0Var = this.e0;
        if (zu0Var != null) {
            zu0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.j30 j30Var = this.q0;
        if (j30Var != null) {
            j30Var.d();
        }
        ev0 ev0Var = this.V4;
        if (ev0Var != null) {
            ev0Var.b();
        }
        xw0 xw0Var = this.x2;
        if (xw0Var != null && this.w2) {
            xw0Var.b(true);
            this.x2 = null;
        }
        org.telegram.messenger.video.n nVar = this.x5;
        if (nVar != null) {
            this.x5 = null;
            org.telegram.messenger.g0.h3(nVar);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        org.telegram.ui.Components.er0 er0Var;
        super.onPause();
        UndoView undoView = this.L;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.j30 j30Var = this.q0;
        if (j30Var != null) {
            j30Var.i();
        }
        org.telegram.messenger.n6 n6Var = this.W1;
        if (n6Var != null) {
            n6Var.e();
        }
        vv0 vv0Var = this.N;
        if (vv0Var == null || (er0Var = vv0Var.V) == null) {
            return;
        }
        er0Var.e = false;
        if (er0Var.c != null) {
            er0Var.a.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        boolean z9;
        boolean z10;
        org.telegram.ui.Components.j30 j30Var = this.q0;
        if (j30Var != null) {
            j30Var.j(i7, strArr, iArr);
        }
        if (i7 != 101 && i7 != 102) {
            if (i7 != 103 || this.D2 == null) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= iArr.length) {
                    z10 = true;
                    break;
                } else {
                    if (iArr[i10] != 0) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            }
            if (iArr.length <= 0 || !z10) {
                org.telegram.ui.Components.voip.y1.h(getParentActivity(), null, i7);
                return;
            } else {
                org.telegram.ui.Components.voip.y1.l(this.D2, null, getMessagesController().g1(this.e1, false, null) == null, null, getParentActivity(), this, getAccountInstance());
                return;
            }
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.d1));
        if (a22 == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= iArr.length) {
                z9 = true;
                break;
            } else {
                if (iArr[i11] != 0) {
                    z9 = false;
                    break;
                }
                i11++;
            }
        }
        if (iArr.length <= 0 || !z9) {
            org.telegram.ui.Components.voip.y1.h(getParentActivity(), null, i7);
            return;
        }
        boolean z11 = i7 == 102;
        TLRPC.UserFull userFull = this.u2;
        org.telegram.ui.Components.voip.y1.m(a22, z11, userFull != null && userFull.video_calls_available, getParentActivity(), this.u2, getAccountInstance());
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        TLRPC.User a22;
        l00 l00Var;
        super.onResume();
        vv0 vv0Var = this.N;
        if (vv0Var != null) {
            vv0Var.d1 = true;
            org.telegram.ui.Components.dr0 dr0Var = vv0Var.J;
            if (dr0Var != null) {
                dr0Var.f();
            }
            org.telegram.ui.Components.ks0 ks0Var = vv0Var.M;
            if (ks0Var != null) {
                ks0Var.f();
            }
            org.telegram.ui.Components.ls0 ls0Var = vv0Var.L;
            if (ls0Var != null) {
                ls0Var.X(false);
            }
            for (int i7 = 0; i7 < vv0Var.m0.length; i7++) {
                vv0Var.e0(i7);
            }
            org.telegram.ui.Components.er0 er0Var = vv0Var.V;
            if (er0Var != null) {
                er0Var.e = true;
                if (er0Var.c != null) {
                    er0Var.a.onResume();
                }
            }
        }
        t4();
        jw0 jw0Var = this.d;
        if (jw0Var != null) {
            this.T4 = true;
            jw0Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (l00Var = this.T) != null && l00Var.getVisibility() == 0) {
            this.T.setVisibility(8);
            this.T.setBackground(null);
        }
        org.telegram.ui.Components.j30 j30Var = this.q0;
        if (j30Var != null) {
            j30Var.k();
            setParentActivityTitle(org.telegram.messenger.hd.M0(2131745496, null));
        }
        I5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new e7(this, 5));
        }
        ok okVar = this.f;
        if (okVar != null) {
            setParentActivityTitle(okVar.getText());
        }
        if (this.d1 != 0 && (a22 = getMessagesController().a2(Long.valueOf(this.d1))) != null && a22.photo == null && this.P1 >= j4()) {
            this.i2.cancel();
            float[] fArr = this.l2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            X4(1.0f);
            this.n0.setVisibility(8);
            this.P1 = j4();
            this.n2 = false;
            this.c.h1(0, j4() - this.a.getPaddingTop());
        }
        org.telegram.messenger.n6 n6Var = this.W1;
        if (n6Var != null) {
            n6Var.a();
        }
        C5();
        y4(false);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.y0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.z0));
            m5();
            M5();
            J3();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        org.telegram.ui.ActionBar.y4 y4Var;
        if (z9 && (y4Var = this.simpleActionBar) != null) {
            y4Var.setAlpha(1.0f);
        }
        if (z9) {
            if (!z10) {
                int i7 = this.I1;
                if (i7 != 0 && this.L1) {
                    if (i7 == 1) {
                        this.j2 = 0.0f;
                        org.telegram.ui.Components.lu0 lu0Var = this.S;
                        if (lu0Var != null) {
                            lu0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.ef0 ef0Var = this.Z;
                        if (ef0Var != null) {
                            ef0Var.setParentExpanded(0.0f);
                        }
                        Z4(0.0f);
                        org.telegram.ui.Components.zf0 zf0Var = this.b0;
                        if (zf0Var != null) {
                            zf0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.F1 = false;
                    O3();
                    if (this.H1) {
                        S3(true);
                    }
                }
                if (!this.l5) {
                    this.l5 = true;
                    this.U4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.P4);
            l00 l00Var = this.T;
            if (l00Var != null && l00Var.getVisibility() == 0) {
                this.T.setVisibility(8);
                this.T.setBackground(null);
            }
        }
        this.G1 = false;
        Q3();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        super.onTransitionAnimationProgress(z9, f10);
        l00 l00Var = this.T;
        if (l00Var == null || l00Var.getVisibility() != 0) {
            return;
        }
        if (z9) {
            this.T.setAlpha(1.0f - f10);
        } else {
            this.T.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        ImageView imageView;
        org.telegram.ui.Components.ef0 ef0Var;
        super.onTransitionAnimationStart(z9, z10);
        this.c6 = z9;
        if (z9 && (ef0Var = this.Z) != null) {
            ArrayList arrayList = ef0Var.a;
            if (ef0Var.E == 6) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.ui.Components.bf0 bf0Var = (org.telegram.ui.Components.bf0) arrayList.get(i7);
                    org.telegram.ui.Components.zg0 zg0Var = bf0Var.k;
                    if (zg0Var != null) {
                        if (bf0Var.a == 15) {
                            zg0Var.M(14);
                        } else {
                            zg0Var.M(0);
                        }
                        bf0Var.k.start();
                    }
                }
            }
        }
        if (!z9 && (imageView = this.O0) != null && imageView.getTag() != null && (this.O0.getTag() instanceof org.telegram.ui.ActionBar.r0)) {
            ((org.telegram.ui.ActionBar.r0) this.O0.getTag()).setAlpha(1.0f);
        }
        if (((!z9 && z10) || (z9 && !z10)) && this.I1 != 0 && this.L1 && !this.o2) {
            this.F1 = true;
            if (!z9) {
                if (this.Z5 == null) {
                    this.Z5 = new float[14];
                }
                this.E1 = this.P1;
                this.Z5[0] = this.X.getScaleX();
                this.Z5[1] = this.X.getTranslationX();
                this.Z5[2] = this.X.getTranslationY();
                org.telegram.ui.Components.ef0 ef0Var2 = this.Z;
                if (ef0Var2 != null) {
                    this.Z5[3] = ef0Var2.getAlpha();
                }
                bi.g1 g1Var = this.v0;
                if (g1Var != null) {
                    float[] fArr = this.Z5;
                    fArr[4] = g1Var.e;
                    fArr[5] = g1Var.f;
                }
                if (this.y6 != null) {
                    this.Z5[6] = r0.getAlpha();
                }
                this.Z5[7] = this.f.getScaleX();
                this.Z5[8] = this.f.getTranslationY();
                this.Z5[9] = this.r.getTranslationY();
                this.Z5[10] = this.f.getLayoutParams().width;
                float[] fArr2 = this.Z5;
                fArr2[11] = this.b2;
                fArr2[12] = this.f.getTranslationX();
                this.Z5[13] = this.r.getTranslationX();
                fi.m3 m3Var = this.A6;
                if (m3Var != null) {
                    m3Var.f(true);
                }
            }
        }
        if (z9) {
            if (this.q0 != null) {
                this.P4 = getNotificationCenter().q(new int[]{org.telegram.messenger.qs.s, org.telegram.messenger.qs.t, org.telegram.messenger.qs.W, org.telegram.messenger.qs.X, org.telegram.messenger.qs.E0, org.telegram.messenger.qs.r4}, this.P4, true);
            } else {
                this.P4 = getNotificationCenter().q(new int[]{org.telegram.messenger.qs.s, org.telegram.messenger.qs.t, org.telegram.messenger.qs.W, org.telegram.messenger.qs.X, org.telegram.messenger.qs.r4}, this.P4, true);
            }
            if (!z10 && getParentActivity() != null) {
                this.Y4 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.G1 = true;
        Q3();
    }

    public final float p4() {
        if (this.S == null) {
            return 0.0f;
        }
        return this.S.getVisibilityFactor() * org.telegram.messenger.g0.L(22.0f);
    }

    public final void p5() {
        if (this.s5 == null) {
            return;
        }
        vv0 vv0Var = this.N;
        boolean z9 = ((vv0Var == null || !vv0Var.isAttachedToWindow()) ? (float) org.telegram.messenger.g0.L(72.0f) : ((float) org.telegram.messenger.g0.L(232.0f)) - (((float) this.a.getMeasuredHeight()) - this.N.getY())) <= 0.0f;
        te.a aVar = this.M5;
        aVar.a(z9, true);
        float f10 = aVar.e;
        this.s5.setTranslationY(org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(60.0f), 0));
        this.s5.setAlpha(f10);
        this.s5.setVisibility(f10 <= 0.0f ? 4 : 0);
        org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.w;
        if (ccVar != null) {
            ccVar.l();
        }
    }

    public final int q4() {
        if (this.p1) {
            return 0;
        }
        if (this.e1 == 0 || !org.telegram.messenger.t3.c0(getMessagesController().M0(Long.valueOf(this.e1)))) {
            return org.telegram.messenger.g0.L(50.0f);
        }
        return org.telegram.messenger.g0.L(x4() ? 24.0f : 38.0f);
    }

    public final void q5() {
        fi.m3 m3Var = this.A6;
        if (m3Var == null) {
            return;
        }
        m3Var.p(0.0f, (this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX() + (-m3Var.getPaddingLeft()));
        float U1 = org.telegram.messenger.g0.U1(this.k2, this.l2);
        this.A6.setTranslationY(((this.f.getY() + (-r2.getPaddingBottom())) - org.telegram.messenger.g0.L(24.0f)) + org.telegram.messenger.g0.W1(U1, org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(12.0f)));
        this.A6.j(i0.a.f(U1, this.B6, 1342177280));
        boolean z9 = this.P1 >= ((float) org.telegram.messenger.g0.L(82.0f));
        Boolean bool = this.C6;
        if (bool == null || bool.booleanValue() != z9) {
            ViewPropertyAnimator animate = this.A6.animate();
            this.C6 = Boolean.valueOf(z9);
            org.telegram.messenger.camera.q.l(animate.alpha(z9 ? 1.0f : 0.0f), org.telegram.ui.Components.xq.g, 200L);
        }
    }

    public final org.telegram.ui.Components.wq r4() {
        if (this.I == null) {
            this.y = org.telegram.ui.ActionBar.k6.Q1.getConstantState().newDrawable().mutate();
            this.H = org.telegram.ui.ActionBar.k6.R1.getConstantState().newDrawable().mutate();
            org.telegram.messenger.fp fpVar = this.g6;
            if (fpVar != null) {
                int b10 = org.telegram.ui.ActionBar.k6.b(0.1f, org.telegram.ui.ActionBar.k6.I.q() ? -0.1f : -0.08f, fpVar.o(org.telegram.ui.ActionBar.k6.I.q()) ? this.g6.k() : this.g6.i());
                Drawable drawable = this.y;
                int S0 = org.telegram.messenger.g0.S0(this.Q5, 1.0f, b10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.z0));
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(S0, mode);
                this.H.setColorFilter(org.telegram.messenger.g0.S0(this.Q5, 1.0f, -1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.z0)), mode);
            }
            this.I = new org.telegram.ui.Components.wq(new org.telegram.ui.Components.xp(this.y, this.H), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return this.I;
    }

    public final void r5() {
        if (getParentActivity() == null || this.U0 == null) {
            return;
        }
        if (getUserConfig().q()) {
            this.U0.setIcon(R.drawable.menu_profile_colors);
            return;
        }
        Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.z0), PorterDuff.Mode.SRC_IN));
        this.P6 = drawable;
        Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
        drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.U0.setIcon(new di.i2(drawable, drawable2, org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f)));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.j30 j30Var = this.q0;
        if (j30Var != null) {
            j30Var.f = bundle.getString("path");
        }
    }

    public final boolean s4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i7 = 0;
        if (!this.q2 || (userFull = this.u2) == null || (botInfo = userFull.bot_info) == null) {
            return false;
        }
        if (botInfo.privacy_policy_url != null) {
            return true;
        }
        ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
        int size = arrayList.size();
        while (i7 < size) {
            TLRPC.BotCommand botCommand = arrayList.get(i7);
            i7++;
            if ("privacy".equals(botCommand.command)) {
                return true;
            }
        }
        return true;
    }

    public final void s5() {
        t5(this.f6);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.j30 j30Var = this.q0;
        if (j30Var == null || (str = j30Var.f) == null) {
            return;
        }
        bundle.putString("path", str);
    }

    public void setAvatarAnimationProgress(float f10) {
        int w02;
        int w03;
        int w04;
        this.j2 = f10;
        this.R1 = f10;
        Q3();
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.setAlpha(f10);
        }
        if (this.I1 == 2) {
            this.e0.setProgressToExpand(f10);
            org.telegram.ui.Components.ef0 ef0Var = this.Z;
            if (ef0Var != null) {
                ef0Var.setParentExpanded(f10);
            }
            Z4(f10);
            org.telegram.ui.Components.zf0 zf0Var = this.b0;
            if (zf0Var != null) {
                zf0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.lu0 lu0Var = this.S;
            if (lu0Var != null) {
                lu0Var.setParentExpanded(f10);
            }
            n5();
            E5();
        }
        this.a.setAlpha(f10);
        this.a.setTranslationX(org.telegram.messenger.g0.L(48.0f) - (org.telegram.messenger.g0.L(48.0f) * f10));
        if (this.I1 != 2 || (w02 = this.r0) == 0) {
            if (this.d1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.e1)) {
                    boolean z9 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.z0;
            int[][] iArr = org.telegram.ui.Components.w8.L;
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, f6Var);
        }
        int i7 = this.X4;
        if (i7 == 0) {
            i7 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.z0);
        }
        this.c1.setBackgroundColor(i0.a.f(f10, i0.a.o(i7, 0), w02));
        org.telegram.ui.Components.a01 a01Var = this.l0;
        int f11 = i0.a.f(f10, i7, w02);
        a01Var.k = true;
        a01Var.b.setColor(f11);
        if (this.g6 != null) {
            w03 = -1;
        } else {
            if (this.d1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.e1)) {
                    boolean z10 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.f6 f6Var2 = this.z0;
            int[][] iArr2 = org.telegram.ui.Components.w8.L;
            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.g8, f6Var2);
        }
        this.actionBar.D(i0.a.f(this.R1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.z0), w03), false);
        int w05 = this.g6 == null ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ji, this.z0) : -1;
        int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, this.z0);
        ok okVar = this.f;
        if (okVar != null && this.I1 != 2) {
            okVar.setTextColor(i0.a.f(f10, w06, w05));
        }
        boolean[] zArr = this.J0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.pi, this.z0);
        } else {
            if (this.d1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.e1)) {
                    boolean z11 = this.D2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.f6 f6Var3 = this.z0;
            int[][] iArr3 = org.telegram.ui.Components.w8.L;
            w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, f6Var3);
        }
        int w07 = org.telegram.ui.ActionBar.k6.w0(zArr[0] ? org.telegram.ui.ActionBar.k6.pa : org.telegram.ui.ActionBar.k6.B8, this.z0);
        bv0 bv0Var = this.r;
        if (bv0Var != null && this.I1 != 2) {
            bv0Var.setTextColor(i0.a.f(f10, w07, I3(w04, Boolean.valueOf(zArr[0]))));
        }
        this.P1 = this.Q1 * f10;
        long j3 = this.d1;
        if (j3 == 0) {
            j3 = this.e1;
        }
        org.telegram.ui.ActionBar.f6 f6Var4 = this.z0;
        int[][] iArr4 = org.telegram.ui.Components.w8.L;
        int w08 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[org.telegram.ui.Components.w8.e(j3)], f6Var4);
        long j10 = this.d1;
        if (j10 == 0) {
            j10 = this.e1;
        }
        int d = org.telegram.ui.Components.w8.d(j10);
        if (w08 != d) {
            this.p0.h(i0.a.f(f10, d, w08));
            this.e0.invalidate();
        }
        int i10 = this.Y4;
        if (i10 != 0) {
            setNavigationBarColor(i0.a.f(f10, i10, getNavigationBarColor()));
        }
        this.c1.invalidate();
        y4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        ew0 ew0Var = this.d6;
        if (ew0Var != null) {
            ew0Var.invalidate();
        }
        if (a() > 0) {
            zu0 zu0Var = this.e0;
            if (zu0Var != null) {
                zu0Var.setProgressToStoriesInsets(this.R1);
            }
            cv0 cv0Var = this.u0;
            if (cv0Var != null) {
                cv0Var.setProgressToStoriesInsets(this.R1);
            }
            bi.g1 g1Var = this.v0;
            if (g1Var != null) {
                g1Var.setProgressToStoriesInsets(this.R1);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void setParentLayout(org.telegram.ui.ActionBar.q4 q4Var) {
        super.setParentLayout(q4Var);
        org.telegram.messenger.n6 n6Var = this.W1;
        if (n6Var != null) {
            n6Var.e();
            this.W1 = null;
        }
        if (q4Var == null || q4Var.getParentActivity() == null) {
            return;
        }
        this.W1 = new org.telegram.messenger.n6(q4Var.getParentActivity().getWindow(), new tt0(this, 8));
    }

    @Override // org.telegram.ui.Components.mr0
    public final boolean t() {
        return this.c6;
    }

    public final void t4() {
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        this.m2 = point.x > point.y;
    }

    public final void t5(float f10) {
        int S0;
        org.telegram.messenger.fp fpVar = this.g6;
        if (fpVar != null) {
            S0 = i0.a.f(0.25f, fpVar.m(org.telegram.ui.ActionBar.k6.I.q()), -1);
        } else {
            S0 = org.telegram.messenger.g0.S0(this.Q5, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ni, this.z0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.z0));
        }
        int f11 = i0.a.f(f10, S0, -1);
        int i7 = org.telegram.ui.ActionBar.k6.Cj;
        int f12 = i0.a.f(Math.max(this.Q5, this.A5), f11, org.telegram.ui.ActionBar.k6.w0(i7, this.z0));
        org.telegram.ui.Components.g5 g5Var = this.F;
        if (g5Var != null) {
            g5Var.k(Integer.valueOf(f12));
        }
        org.telegram.ui.Components.g5 g5Var2 = this.G;
        if (g5Var2 != null) {
            g5Var2.k(Integer.valueOf(i0.a.f(this.Q5, i0.a.f(f10, S0, -1711276033), org.telegram.ui.ActionBar.k6.w0(i7, this.z0))));
        }
        this.d0.setColor(f12);
        this.f6 = f10;
    }

    public final boolean u4() {
        if (this.D2 != null) {
            return getMessagesController().o2(this.D2);
        }
        org.telegram.messenger.qp messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.u2;
        messagesController.getClass();
        return org.telegram.messenger.qp.K2(userFull);
    }

    public final void u5() {
        this.d0.setScaleX(this.f.getScaleX());
        this.d0.setScaleY(this.f.getScaleY());
        this.d0.b((this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX(), (this.f.getHeight() - (this.f.getScaleY() * (this.f.getHeight() - this.f.getRightDrawableY()))) + this.f.getY());
    }

    @Override // org.telegram.ui.ie0
    public final void v() {
        this.a.y0(0);
    }

    public final boolean v4() {
        return (this.q0 == null || this.r1) ? false : true;
    }

    public final void v5() {
        if (this.p1 || !org.telegram.messenger.t3.c0(this.D2)) {
            return;
        }
        org.telegram.messenger.dt notificationsController = getNotificationsController();
        notificationsController.getMessagesStorage().a.c(new org.telegram.messenger.a4(notificationsController, -this.e1, new mu0(this), 6));
    }

    public final void w4(boolean z9) {
        boolean c02 = org.telegram.messenger.t3.c0(this.D2);
        TLRPC.Chat chat = this.D2;
        org.telegram.ui.Components.v4.r(this, false, chat, null, false, c02 || z9 || (chat != null && chat.creator), z9, !c02, new tt0(this, 3));
    }

    public final void w5(float f10) {
        kw0 kw0Var;
        ValueAnimator valueAnimator;
        if (this.o2 || ((kw0Var = this.M) != null && (valueAnimator = kw0Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.M.getLayoutParams();
            layoutParams.width = this.a.getMeasuredWidth();
            layoutParams.height = (int) (this.P1 + f10);
            this.M.requestLayout();
        }
        ww0 ww0Var = this.c1;
        if (ww0Var != null) {
            ww0Var.E.setTranslate(0.0f, this.Z1 - ww0Var.y);
            ww0 ww0Var2 = this.c1;
            RadialGradient radialGradient = ww0Var2.D;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(ww0Var2.E);
            }
            this.c1.invalidate();
        }
        u5();
        n5();
        E5();
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ boolean x() {
        return false;
    }

    public final boolean x4() {
        return getMessagesController().P1().K(a()) && !this.p1;
    }

    public final void x5() {
        float f10 = 0.0f;
        if (!this.p1 && !this.F1) {
            int e42 = e4();
            f10 = e42 > 0 ? c8.j9.a(1.0f - (this.P1 / e42), 0.0f, 1.0f) : c8.j9.a((this.b2 - 0.6f) / 0.4f, 0.0f, 1.0f);
        }
        float f11 = this.A5;
        if (f11 != f10) {
            boolean z9 = ((f11 > 0.5f ? 1 : (f11 == 0.5f ? 0 : -1)) > 0) != ((f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1)) > 0);
            this.A5 = f10;
            ok okVar = this.f;
            if (okVar != null) {
                okVar.setTextColor(this.D5);
            }
            bv0 bv0Var = this.r;
            if (bv0Var != null) {
                bv0Var.setTextColor(this.E5);
            }
            s5();
            if (z9) {
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, Boolean.TRUE);
            }
            ww0 ww0Var = this.c1;
            if (ww0Var != null) {
                ww0Var.invalidate();
            }
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        A5();
        z5();
    }

    @Override // org.telegram.ui.qw
    public final boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, v91 v91Var) {
        long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).a;
        Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
        if (org.telegram.messenger.m5.C(j3)) {
            k10.putInt("enc_id", (int) (4294967295L & j3));
        } else if (org.telegram.messenger.m5.E(j3)) {
            k10.putLong("user_id", j3);
        } else if (org.telegram.messenger.m5.z(j3)) {
            k10.putLong("chat_id", -j3);
        }
        if (!getMessagesController().E(k10, wwVar, null, null)) {
            return false;
        }
        org.telegram.messenger.qs notificationCenter = getNotificationCenter();
        int i11 = org.telegram.messenger.qs.t;
        notificationCenter.n(this, i11);
        getNotificationCenter().k(i11, new Object[0]);
        presentFragment(new an(k10), true);
        removeSelfFromStack();
        getSendMessagesHelper().r0(org.telegram.messenger.ez.g(getMessagesController().a2(Long.valueOf(this.d1)), j3, null, null, null, null, z10, i7, i10));
        if (!TextUtils.isEmpty(charSequence)) {
            org.telegram.messenger.gz.a0(org.telegram.messenger.c.a(this.currentAccount), charSequence, j3, 0L, z10, i7, i10);
        }
        return true;
    }

    public final void y4(boolean z9) {
        float f10;
        float f11;
        org.telegram.ui.Components.l9 currentItemView;
        float f12;
        float f13;
        TLRPC.ChatFull chatFull;
        this.glassEngine.g();
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        float L3 = L3();
        qu0 qu0Var = this.a;
        if (qu0Var != null && !this.F1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qu0Var.getLayoutParams();
            if (layoutParams.topMargin != currentActionBarHeight) {
                layoutParams.topMargin = currentActionBarHeight;
                this.a.setLayoutParams(layoutParams);
            }
        }
        O5(z9);
        if (this.X != null) {
            this.a.setTopGlowOffset((int) this.P1);
            this.a.setOverScrollMode((this.P1 <= ((float) j4()) || this.P1 >= ((float) ((e4() + this.a.getMeasuredWidth()) - currentActionBarHeight))) ? 0 : 2);
        }
        if (this.X != null && !this.c6 && this.F1) {
            K3();
            return;
        }
        int j42 = j4();
        if (this.X != null) {
            if (this.Z != null && this.e1 != 0) {
                this.Z.o(2, (!org.telegram.messenger.t3.T(this.D2) || this.D2.megagroup || (chatFull = this.t2) == null || chatFull.linked_chat_id == 0) ? false : true);
            }
            O5(z9);
            float translationY = this.actionBar.getTranslationY() + (org.telegram.messenger.camera.q.b(L3, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0) - org.telegram.messenger.g0.L(21.0f));
            if (this.F1) {
                this.Z1 = translationY;
            } else {
                org.telegram.ui.Components.wf0 wf0Var = this.t0;
                if (wf0Var != null) {
                    f13 = -org.telegram.messenger.g0.L(29.0f);
                    org.telegram.messenger.bs bsVar = wf0Var.n;
                    if (bsVar != null && bsVar.c) {
                        f13 = bsVar.e.centerY();
                    }
                } else {
                    f13 = -org.telegram.messenger.g0.L(29.0f);
                }
                this.Z1 = org.telegram.messenger.g0.T1(f13, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.L(21.0f)), L3);
            }
            float f14 = this.F1 ? this.Q1 : this.P1;
            float f15 = j42;
            if (f14 > f15 || this.o2) {
                f10 = 2.0f;
                float max = Math.max(0.0f, Math.min(1.0f, (f14 - f15) / ((this.a.getMeasuredWidth() - currentActionBarHeight) - k4())));
                this.g2 = max;
                f11 = 18.0f;
                this.a2 = (org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) / 100.0f) * 42.0f;
                this.b2 = 0.0f;
                cv0 cv0Var = this.u0;
                if (cv0Var != null) {
                    cv0Var.invalidate();
                }
                bi.g1 g1Var = this.v0;
                if (g1Var != null) {
                    g1Var.invalidate();
                }
                float min = Math.min(org.telegram.messenger.g0.N(2000.0f), Math.max(org.telegram.messenger.g0.N(1100.0f), Math.abs(this.h2))) / org.telegram.messenger.g0.N(1100.0f);
                e4();
                boolean z10 = this.n2;
                int i7 = org.telegram.messenger.qs.r4;
                float[] fArr = this.l2;
                if (!z10 || (!this.F0 && this.g2 < 0.33f)) {
                    if (this.o2) {
                        this.o2 = false;
                        org.telegram.messenger.qs.e().k(i7, Boolean.TRUE);
                        org.telegram.ui.ActionBar.f5 f5Var = this.S0;
                        if (f5Var != null) {
                            f5Var.t(21);
                            if (this.q0 != null) {
                                this.S0.t(33);
                                this.S0.t(34);
                                this.S0.t(35);
                                this.S0.S(36);
                                this.S0.S(31);
                            }
                        }
                        org.telegram.ui.ActionBar.f5 f5Var2 = this.T0;
                        if (f5Var2 != null) {
                            f5Var2.setEnabled(!this.y1);
                        }
                        this.M.f(false, min);
                        this.o0.b(min);
                        this.i2.cancel();
                        this.e0.getImageReceiver().t0 = true;
                        this.e0.getImageReceiver().P0(false);
                        float U1 = org.telegram.messenger.g0.U1(this.k2, fArr);
                        fArr[0] = U1;
                        fArr[1] = 0.0f;
                        this.i2.setInterpolator(org.telegram.ui.Components.xq.j);
                        if (this.m2) {
                            this.i2.setDuration(0L);
                        } else {
                            this.i2.setDuration((long) ((U1 * 250.0f) / min));
                        }
                        this.c1.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.z0));
                        if (!this.H0 && (currentItemView = this.n0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().t() instanceof org.telegram.ui.Components.d51) {
                                this.e0.a0 = false;
                            } else {
                                zu0 zu0Var = this.e0;
                                zu0Var.a0 = true;
                                zu0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.i2.addListener(new dv0(this, 5));
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
                    d4();
                    ValueAnimator valueAnimator = this.i2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        R4();
                        this.f.setTranslationY(this.d2);
                        this.r.setTranslationX(m4(this.e2, this.v6));
                        this.r.setTranslationY(n4(this.f2));
                        q5();
                    }
                } else {
                    if (!this.o2) {
                        if (this.S0 != null) {
                            if (u4()) {
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
                        org.telegram.ui.ActionBar.f5 f5Var3 = this.T0;
                        if (f5Var3 != null) {
                            f5Var3.setEnabled(false);
                        }
                        this.o2 = true;
                        org.telegram.messenger.qs.e().k(i7, Boolean.TRUE);
                        this.M.f(true, min);
                        this.o0.b(min);
                        this.n0.setCreateThumbFromParent(true);
                        this.n0.getAdapter().g();
                        this.i2.cancel();
                        float U12 = org.telegram.messenger.g0.U1(this.k2, fArr);
                        fArr[0] = U12;
                        fArr[1] = 1.0f;
                        cv0 cv0Var2 = this.u0;
                        if (cv0Var2 == null || cv0Var2.x.isEmpty()) {
                            this.i2.setInterpolator(org.telegram.ui.Components.xq.j);
                            this.i2.setDuration((long) (((1.0f - U12) * 250.0f) / min));
                        } else {
                            this.i2.setInterpolator(new x1.a());
                            this.i2.setDuration((long) ((((1.0f - U12) * 1.3f) * 250.0f) / min));
                        }
                        this.i2.addListener(new dv0(this, 4));
                        View m10 = this.c.m(0);
                        if (!this.O1 && m10 != null) {
                            this.N1 = true;
                            this.a.x0(((m10.getTop() - this.a.getMeasuredWidth()) - e4()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0), (int) this.i2.getDuration(), (Interpolator) this.i2.getInterpolator());
                            this.a.O0 = false;
                        }
                        this.a6 = this.f.getTranslationY();
                        this.b6 = this.r.getTranslationY();
                        this.i2.start();
                        this.n0.setAlpha(0.0f);
                        this.n0.setVisibility(0);
                        try {
                            this.X.performHapticFeedback(0, 1);
                        } catch (Exception unused2) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.n0.getLayoutParams();
                    int i10 = layoutParams2.height;
                    layoutParams2.width = this.a.getMeasuredWidth();
                    float f16 = currentActionBarHeight + f14;
                    int i11 = (int) f16;
                    layoutParams2.height = i11;
                    if (i10 != i11) {
                        this.n0.requestLayout();
                    }
                    if (!this.i2.isRunning()) {
                        float L = (this.F1 && this.I1 == 2) ? (-(1.0f - this.R1)) * org.telegram.messenger.g0.L(50.0f) : 0.0f;
                        this.f.setTranslationX(org.telegram.messenger.g0.N(18.0f) - this.f.getLeft());
                        this.f.setTranslationY((((f16 - e4()) - org.telegram.messenger.g0.N(30.0f)) - this.f.getBottom()) + L);
                        this.r.setTranslationX(m4(org.telegram.messenger.g0.N(16.0f) - this.r.getLeft(), 0.0f));
                        this.r.setTranslationY(n4((((f16 - e4()) - org.telegram.messenger.g0.N(10.0f)) - this.r.getBottom()) + L));
                        q5();
                    }
                }
            } else {
                f10 = 2.0f;
                f11 = 18.0f;
            }
            boolean z11 = this.F1;
            if (z11 && this.I1 == 2) {
                float f17 = this.e6;
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / f10) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - (org.telegram.messenger.g0.p * 21.0f));
                this.f.setPivotY(r6.getMeasuredHeight());
                this.f.setScaleX(1.38f);
                this.f.setScaleY(1.38f);
                this.a2 = org.telegram.messenger.g0.W1(this.R1, 42, org.telegram.messenger.qs.U1) / 100.0f;
                this.b2 = 0.0f;
                cv0 cv0Var3 = this.u0;
                if (cv0Var3 != null) {
                    cv0Var3.setExpandProgress(1.0f);
                }
                bi.g1 g1Var2 = this.v0;
                if (g1Var2 != null) {
                    g1Var2.setExpandProgress(1.0f);
                }
                this.e0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(q4(), 0.0f, this.R1));
                this.X.setTranslationX(org.telegram.messenger.g0.T1(f17, 0.0f, this.R1));
                this.X.setTranslationY(org.telegram.messenger.g0.T1((float) Math.ceil(translationY2), 0.0f, this.R1));
                float measuredWidth = ((this.a2 * 100.0f) / 42.0f) * (this.X.getMeasuredWidth() - org.telegram.messenger.g0.L(42.0f));
                this.h0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(16.0f) + measuredWidth);
                this.h0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(-10.0f) + measuredWidth);
                this.i0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.i0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(26.5f) + measuredWidth);
                this.j0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.j0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + measuredWidth);
                this.k0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.k0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + measuredWidth);
                this.X.setScaleX(this.a2);
                this.X.setScaleY(this.a2);
                this.n0.setAlpha(0.0f);
                this.n0.setVisibility(0);
                zu0 zu0Var2 = this.e0;
                float f18 = this.R1;
                float f19 = this.a2;
                zu0Var2.H = f18;
                zu0Var2.I = f19;
                zu0Var2.G = true;
                this.M.e(false, f18);
                this.actionBar.D(i0.a.f(this.R1, this.g6 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.z0), -1), false);
                org.telegram.ui.Components.gk0 gk0Var = this.K;
                if (gk0Var != null) {
                    gk0Var.b(i0.a.f(this.R1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, this.z0), Color.argb(org.telegram.messenger.qs.J2, org.telegram.messenger.qs.e4, org.telegram.messenger.qs.e4, org.telegram.messenger.qs.e4)));
                }
                Drawable drawable = this.x;
                if (drawable != null) {
                    drawable.setColorFilter(this.g6 == null ? i0.a.f(this.R1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.dd, this.z0), -1) : -1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.wq wqVar = this.I;
                if (wqVar != null) {
                    wqVar.a(this.R1);
                    this.f.invalidate();
                }
                org.telegram.ui.Components.wq wqVar2 = this.J;
                if (wqVar2 != null) {
                    wqVar2.a(this.R1);
                    this.f.invalidate();
                }
                t5(this.R1);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.X.getLayoutParams();
                layoutParams3.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.a.getMeasuredWidth() / this.a2, this.R1);
                layoutParams3.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.P1 + currentActionBarHeight) / this.a2, this.R1);
                this.X.requestLayout();
                q5();
            } else if (f14 <= f15) {
                if (z11) {
                    this.a2 = org.telegram.messenger.g0.W1(L3, 42, 96) / 100.0f;
                    this.b2 = 0.0f;
                    f12 = 1.0f;
                } else {
                    org.telegram.ui.Components.wf0 wf0Var2 = this.t0;
                    this.a2 = org.telegram.messenger.g0.T1(wf0Var2 != null ? wf0Var2.getHiddenAvatarSizeDp() : 24.0f, 96.0f, L3) / 100.0f;
                    f12 = 1.0f;
                    this.b2 = 1.0f - L3;
                }
                org.telegram.ui.Components.ef0 ef0Var = this.Z;
                if (ef0Var != null) {
                    if (this.F1) {
                        ef0Var.setAlpha(this.R1);
                    } else {
                        ef0Var.setAlpha(f12);
                    }
                }
                cv0 cv0Var4 = this.u0;
                if (cv0Var4 != null) {
                    cv0Var4.invalidate();
                }
                bi.g1 g1Var3 = this.v0;
                if (g1Var3 != null) {
                    g1Var3.h = this.F1;
                    float l10 = Utilities.l((L3 - 0.3f) / 0.7f);
                    if (g1Var3.f != l10) {
                        g1Var3.f = l10;
                        g1Var3.invalidate();
                    }
                }
                float f20 = (0.12f * L3) + 1.0f;
                ValueAnimator valueAnimator2 = this.i2;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    this.X.setScaleX(this.a2);
                    this.X.setScaleY(this.a2);
                    d4();
                    this.X.setTranslationY((float) Math.ceil(this.Z1));
                    float L2 = (((this.a2 * 100.0f) / 42.0f) * org.telegram.messenger.g0.L(42.0f)) - org.telegram.messenger.g0.L(42.0f);
                    this.h0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(16.0f) + L2);
                    this.h0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(-10.0f) + L2);
                    this.i0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L2);
                    this.i0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(26.5f) + L2);
                    this.j0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L2);
                    this.j0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + L2);
                    this.k0.setTranslationX(this.X.getX() + org.telegram.messenger.g0.L(28.0f) + L2);
                    this.k0.setTranslationY(this.X.getY() + org.telegram.messenger.g0.L(24.0f) + L2);
                } else {
                    ValueAnimator valueAnimator3 = this.i2;
                    dv0 dv0Var = this.Y5;
                    valueAnimator3.removeListener(dv0Var);
                    this.i2.addListener(dv0Var);
                }
                float N = ((org.telegram.messenger.g0.N(8.0f) + (this.X.getScaleY() * this.X.getHeight())) * (this.F1 ? this.R1 : L3)) + ((float) Math.floor(translationY));
                this.d2 = com.google.android.recaptcha.internal.a.z(1.0f, this.R1, 0.0f, (org.telegram.messenger.g0.L(7.0f) * L3) + org.telegram.messenger.g0.L(1.3f) + N);
                this.f2 = (((float) Math.floor(org.telegram.messenger.g0.p * 11.0f)) * L3) + N + org.telegram.messenger.g0.L(24.0f);
                float L4 = this.F1 ? (this.e6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f) : -org.telegram.messenger.g0.N(46.0f);
                uw0 uw0Var = this.y6;
                if (uw0Var != null) {
                    uw0Var.setAlpha((int) (255.0f * L3));
                }
                int measuredWidth2 = this.a.getMeasuredWidth();
                this.f.setScaleX(f20);
                this.f.setScaleY(f20);
                z4(0, L3, false);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                float f21 = measuredWidth2 / f10;
                float min2 = f21 - (((Math.min(this.f.getExactWidth(), layoutParams4.width) * f20) * 0.5f) + layoutParams4.leftMargin);
                float f22 = ((FrameLayout.LayoutParams) this.r.getLayoutParams()).width;
                float paddingLeft = (this.p5 || this.r.getExactWidth() > (f22 - ((float) this.r.getPaddingLeft())) - ((float) this.r.getPaddingRight())) ? 0.0f : this.r.getPaddingLeft();
                float min3 = f21 - ((Math.min(this.r.getExactWidth(), f22) * 0.5f) + (r7.leftMargin + paddingLeft));
                this.c2 = min2;
                this.e2 = min3;
                this.v6 = paddingLeft;
                if (this.F1) {
                    min2 = org.telegram.messenger.g0.T1(L4, min2, L3);
                    min3 = org.telegram.messenger.g0.T1(L4, min3, L3);
                }
                ValueAnimator valueAnimator4 = this.i2;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    this.f.setTranslationX(min2);
                    this.f.setTranslationY(this.d2);
                    this.r.setTranslationX(m4(min3, this.v6 * L3));
                    this.r.setTranslationY(n4(this.f2));
                }
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i12 = layoutParams5.width;
                int min4 = Math.min(layoutParams5.width, (int) ((((org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.L(490.0f) : org.telegram.messenger.g0.q.x) - org.telegram.messenger.g0.L(f11)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams5.leftMargin)));
                layoutParams5.width = min4;
                if (min4 != i12) {
                    this.f.requestLayout();
                }
                q5();
            }
            ValueAnimator valueAnimator5 = this.i2;
            if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                z4(0, L3, true);
            }
        }
        w5(currentActionBarHeight);
        if (L3 >= 1.0f) {
            this.e0.setAlpha(1.0f);
        }
    }

    public final void y5() {
        vv0 vv0Var = this.N;
        if (vv0Var == null || this.V5 == 0) {
            return;
        }
        int topPanelShift = vv0Var.getTopPanelShift();
        int i7 = 0;
        if (topPanelShift > 0 && this.N.isAttachedToWindow()) {
            if (this.N.getParent() == this.a) {
                topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.N.getY()));
            }
            i7 = topPanelShift;
        }
        int i10 = this.V5 + i7;
        c5(i10, this.B5);
        c5(i10, this.T5);
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
    public final void z4(int i7, float f10, boolean z9) {
        float scaleX;
        float f11;
        int i10;
        int ceil;
        ValueAnimator valueAnimator;
        if (this.P1 > j4() || ((valueAnimator = this.i2) != null && valueAnimator.isRunning())) {
            scaleX = this.f.getScaleX();
        } else {
            if (f10 < 1.0f) {
                f11 = 1.12f;
                scaleX = 1.0f;
                int L = !org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.L(490.0f) : org.telegram.messenger.g0.q.x;
                org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
                int max = L - (((int) Math.max(org.telegram.messenger.g0.L(64.0f), (y4Var == null ? y4Var.o().getTargetPillWidth() : org.telegram.messenger.g0.L(46.0f)) + org.telegram.messenger.g0.L(18.0f))) * 2);
                int i11 = (int) (max / (i7 == 0 ? scaleX : 1.0f));
                int A = i7 == 0 ? i7 : org.telegram.messenger.camera.q.A(18.0f, 2, L);
                if (i7 == 0) {
                    i7 = (int) (A / f11);
                }
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.i;
                int W1 = org.telegram.messenger.g0.W1(xqVar.getInterpolation(f10), i11, i7);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i12 = layoutParams.width;
                layoutParams.width = (int) Math.ceil(W1);
                if (z9) {
                    layoutParams.width = Math.min(layoutParams.width, (int) (((L - org.telegram.messenger.g0.L(18.0f)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams.leftMargin)));
                }
                if (z9 && layoutParams.width != i12) {
                    this.f.requestLayout();
                }
                int W12 = org.telegram.messenger.g0.W1(xqVar.getInterpolation(f10), max, A);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.r.getLayoutParams();
                i10 = layoutParams2.width;
                ceil = (int) Math.ceil(W12);
                layoutParams2.width = ceil;
                if (i10 == ceil) {
                    this.r.requestLayout();
                    return;
                }
                return;
            }
            scaleX = Math.max(this.f.getScaleX(), 1.12f);
        }
        f11 = scaleX;
        if (!org.telegram.messenger.g0.Q1()) {
        }
        org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
        int max2 = L - (((int) Math.max(org.telegram.messenger.g0.L(64.0f), (y4Var2 == null ? y4Var2.o().getTargetPillWidth() : org.telegram.messenger.g0.L(46.0f)) + org.telegram.messenger.g0.L(18.0f))) * 2);
        int i112 = (int) (max2 / (i7 == 0 ? scaleX : 1.0f));
        if (i7 == 0) {
        }
        if (i7 == 0) {
        }
        org.telegram.ui.Components.xq xqVar2 = org.telegram.ui.Components.xq.i;
        int W13 = org.telegram.messenger.g0.W1(xqVar2.getInterpolation(f10), i112, i7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        int i122 = layoutParams3.width;
        layoutParams3.width = (int) Math.ceil(W13);
        if (z9) {
        }
        if (z9) {
            this.f.requestLayout();
        }
        int W122 = org.telegram.messenger.g0.W1(xqVar2.getInterpolation(f10), max2, A);
        FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) this.r.getLayoutParams();
        i10 = layoutParams22.width;
        ceil = (int) Math.ceil(W122);
        layoutParams22.width = ceil;
        if (i10 == ceil) {
        }
    }

    public final void z5() {
        if (this.B5 == null || this.T5 == null) {
            return;
        }
        vv0 vv0Var = this.N;
        boolean z9 = vv0Var != null && vv0Var.getParent() == this.a && this.N.isAttachedToWindow();
        float max = Math.max(Math.min(this.A5, this.L5), this.Q5);
        this.B5.setAlpha(z9 ? 0.0f : max);
        this.B5.setVisibility((z9 || max <= 0.0f) ? 8 : 0);
        View view = this.T5;
        if (!z9) {
            max = 0.0f;
        }
        view.setAlpha(max);
        if (z9) {
            this.T5.setTranslationY(-(this.N.getY() + this.a.getY()));
        }
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.ps0 ps0Var) {
        super(bundle);
        this.h = null;
        this.n = null;
        this.w0 = null;
        int i7 = 2;
        this.x0 = new org.telegram.ui.Components.t30(this, i7);
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
        this.j5 = new fv0(this, 0);
        this.k5 = new lv0(this);
        this.H5 = new pu0(this);
        this.L5 = 1.0f;
        this.M5 = new te.a(0, new tt0(this, 7), org.telegram.ui.Components.xq.h, 380L, true);
        this.S5 = new fv0(this, 1);
        this.Y5 = new dv0(this, i7);
        this.Z5 = null;
        this.h6 = new SparseIntArray();
        this.j6 = null;
        this.k6 = -1;
        this.p6 = new int[3];
        this.q6 = -1.0f;
        ri.b bVar = new ri.b();
        this.J6 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.K6 = cVar;
        this.M6 = new Paint();
        this.R6 = new int[7];
        this.Q = ps0Var;
        cVar.g = new xe.b();
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ void T() {
    }
}
