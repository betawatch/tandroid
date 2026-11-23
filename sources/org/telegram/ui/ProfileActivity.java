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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class ProfileActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs, ww, org.telegram.ui.Components.ct0, org.telegram.ui.Components.w30, org.telegram.ui.Components.xr0, le0 {
    public static final RectF Z6 = new RectF();
    public static final int a7 = org.telegram.messenger.g0.L(16.0f);
    public org.telegram.ui.ActionBar.h6 A0;
    public boolean A1;
    public CharSequence A2;
    public int A3;
    public int A4;
    public SpannableStringBuilder A5;
    public boolean A6;
    public int B0;
    public boolean B1;
    public long B2;
    public int B3;
    public int B4;
    public SpannableStringBuilder B5;
    public float B6;
    public org.telegram.messenger.gc C0;
    public a0.h C1;
    public int C2;
    public int C3;
    public int C4;
    public hi.e[] C5;
    public float C6;
    public int D0;
    public boolean D1;
    public ArrayList D2;
    public int D3;
    public int D4;
    public ai.o2 D5;
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
    public hi.e F5;
    public xw0 F6;
    public org.telegram.ui.Components.n5 G;
    public boolean G0;
    public boolean G1;
    public TL_bots.BotInfo G2;
    public int G3;
    public int G4;
    public float G5;
    public dx0 G6;
    public org.telegram.ui.Components.n5 H;
    public boolean H0;
    public boolean H1;
    public TLRPC.ChannelParticipant H2;
    public int H3;
    public int H4;
    public View H5;
    public hi.l3 H6;
    public Drawable I;
    public boolean I0;
    public boolean I1;
    public TL_account.TL_password I2;
    public int I3;
    public int I4;
    public int I5;
    public int I6;
    public org.telegram.ui.Components.mr J;
    public boolean J0;
    public int J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public int J4;
    public int J5;
    public Boolean J6;
    public org.telegram.ui.Components.mr K;
    public final boolean[] K0;
    public boolean K1;
    public TLRPC.FileLocation K2;
    public int K3;
    public int K4;
    public int K5;
    public TLRPC.TL_emojiStatusCollectible K6;
    public org.telegram.ui.Components.vk0 L;
    public boolean L0;
    public boolean L1;
    public org.telegram.messenger.gc L2;
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
    public gh.e M5;
    public boolean M6;
    public mw0 N;
    public boolean N0;
    public boolean N1;
    public org.telegram.ui.Cells.n8 N2;
    public int N3;
    public int N4;
    public final pu0 N5;
    public int N6;
    public vv0 O;
    public boolean O0;
    public boolean O1;
    public int O2;
    public int O3;
    public int O4;
    public org.telegram.ui.Components.xf0 O5;
    public int O6;
    public org.telegram.ui.Components.nv0 P;
    public ImageView P0;
    public boolean P1;
    public int P2;
    public int P3;
    public int P4;
    public float P5;
    public int P6;
    public boolean Q;
    public org.telegram.ui.ActionBar.g5 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public int Q4;
    public int Q5;
    public final ui.b Q6;
    public org.telegram.ui.Components.bt0 R;
    public org.telegram.ui.ActionBar.g5 R0;
    public float R1;
    public int R2;
    public int R3;
    public boolean R4;
    public float R5;
    public final dh.c R6;
    public boolean S;
    public org.telegram.ui.ActionBar.g5 S0;
    public float S1;
    public int S2;
    public int S3;
    public boolean S4;
    public final te.a S5;
    public di.f S6;
    public org.telegram.ui.Components.xu0 T;
    public org.telegram.ui.ActionBar.g5 T0;
    public float T1;
    public int T2;
    public int T3;
    public int T4;
    public hv0 T5;
    public final Paint T6;
    public uv U;
    public org.telegram.ui.ActionBar.g5 U0;
    public int U1;
    public int U2;
    public int U3;
    public final ArrayList U4;
    public AnimatorSet U5;
    public Drawable U6;
    public org.telegram.ui.Components.oh0 V;
    public org.telegram.ui.ActionBar.y0 V0;
    public float V1;
    public int V2;
    public int V3;
    public final ArrayList V4;
    public AnimatorSet V5;
    public Drawable V6;
    public org.telegram.ui.Components.oh0 W;
    public org.telegram.ui.ActionBar.y0 W0;
    public ValueAnimator W1;
    public int W2;
    public int W3;
    public int W4;
    public float W5;
    public Drawable W6;
    public hi.l3 X;
    public org.telegram.ui.ActionBar.y0 X0;
    public boolean X1;
    public int X2;
    public int X3;
    public boolean X4;
    public boolean X5;
    public org.telegram.ui.Components.nq X6;
    public k0 Y;
    public ImageView Y0;
    public org.telegram.messenger.n6 Y1;
    public int Y2;
    public int Y3;
    public boolean Y4;
    public final fv0 Y5;
    public final int[] Y6;
    public ai.l0 Z;
    public org.telegram.ui.ActionBar.y0 Z0;
    public final HashMap Z1;
    public int Z2;
    public int Z3;
    public ev0 Z4;
    public View Z5;
    public qu0 a;
    public org.telegram.ui.Components.tf0 a0;
    public org.telegram.messenger.qe a1;
    public float a2;
    public int a3;
    public int a4;
    public View a5;
    public int a6;
    public org.telegram.ui.Components.ek0 b;
    public org.telegram.messenger.hp b0;
    public float b1;
    public float b2;
    public int b3;
    public int b4;
    public float b5;
    public int b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public tu0 c;
    public org.telegram.ui.Components.og0 c0;
    public int c1;
    public float c2;
    public int c3;
    public int c4;
    public int c5;
    public CharSequence c6;
    public lw0 d;
    public org.telegram.ui.Components.uf0 d0;
    public zw0 d1;
    public float d2;
    public int d3;
    public int d4;
    public int d5;
    public boolean d6;
    public ww0 e;
    public org.telegram.ui.Cells.o e0;
    public long e1;
    public float e2;
    public int e3;
    public int e4;
    public int e5;
    public final dv0 e6;
    public pk f;
    public zu0 f0;
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
    public org.telegram.ui.Cells.c4 h0;
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
    public fw0 j6;
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
    public cx l5;
    public final RectF l6;
    public org.telegram.ui.Components.l01 m0;
    public long m1;
    public float m2;
    public int m3;
    public int m4;
    public org.telegram.ui.Components.bh m5;
    public float m6;
    public String n;
    public org.telegram.ui.Components.zf0 n0;
    public boolean n1;
    public final float[] n2;
    public int n3;
    public int n4;
    public final HashSet n5;
    public org.telegram.messenger.cp n6;
    public av0 o0;
    public boolean o1;
    public boolean o2;
    public int o3;
    public int o4;
    public CharacterStyle o5;
    public final SparseIntArray o6;
    public ow0 p0;
    public boolean p1;
    public boolean p2;
    public int p3;
    public int p4;
    public final fv0 p5;
    public int p6;
    public org.telegram.ui.Components.b9 q0;
    public boolean q1;
    public boolean q2;
    public int q3;
    public int q4;
    public final lv0 q5;
    public AnimatorSet q6;
    public bv0 r;
    public org.telegram.ui.Components.x30 r0;
    public boolean r1;
    public final Paint r2;
    public int r3;
    public int r4;
    public boolean r5;
    public int r6;
    public org.telegram.ui.Components.rh0 s;
    public int s0;
    public boolean s1;
    public boolean s2;
    public int s3;
    public int s4;
    public tv0 s5;
    public int s6;
    public org.telegram.ui.Components.l01 t0;
    public boolean t1;
    public ki.r0 t2;
    public int t3;
    public int t4;
    public float t5;
    public boolean t6;
    public org.telegram.ui.Components.lg0 u0;
    public int u1;
    public ki.p u2;
    public int u3;
    public int u4;
    public float u5;
    public boolean u6;
    public cv0 v0;
    public boolean v1;
    public TLRPC.ChatFull v2;
    public int v3;
    public int v4;
    public boolean v5;
    public org.telegram.ui.Components.rh0 v6;
    public AnimatorSet w;
    public di.t0 w0;
    public boolean w1;
    public TLRPC.UserFull w2;
    public int w3;
    public int w4;
    public boolean w5;
    public final int[] w6;
    public Drawable x;
    public View x0;
    public boolean x1;
    public org.telegram.ui.Cells.f6 x2;
    public int x3;
    public int x4;
    public ImageReceiver x5;
    public float x6;
    public Drawable y;
    public final org.telegram.ui.Components.h40 y0;
    public int y1;
    public boolean y2;
    public int y3;
    public int y4;
    public FrameLayout y5;
    public CharSequence y6;
    public final Paint z0;
    public boolean z1;
    public ax0 z2;
    public int z3;
    public int z4;
    public FrameLayout[] z5;
    public CharSequence z6;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static ProfileActivity D4(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void G3(ProfileActivity profileActivity, boolean z10) {
        Drawable t6 = profileActivity.f0.getImageReceiver().t();
        String str = null;
        if (t6 instanceof org.telegram.ui.Components.t51) {
            profileActivity.f0.w(null, null, t6);
            return;
        }
        if (t6 instanceof org.telegram.ui.Components.c6) {
            org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) t6;
            profileActivity.f0.w(null, null, c6Var);
            if (z10) {
                c6Var.f(profileActivity.f0);
                return;
            }
            return;
        }
        org.telegram.messenger.gc D = profileActivity.o0.D(0);
        if (D != null && D.p == 2) {
            str = "avatar";
        }
        profileActivity.f0.w(D, str, t6);
    }

    public static int J0(ProfileActivity profileActivity) {
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((kVar == null || !kVar.getOccupyStatusBar()) ? 0 : org.telegram.messenger.g0.m);
    }

    public static void N3(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view == null || view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return;
        }
        RectF rectF2 = Z6;
        if (jh.k.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
            ih.d.b(new oa(view, 3), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
        }
    }

    public static void O0(ProfileActivity profileActivity, int i7) {
        boolean J0 = org.telegram.ui.Components.jt0.J0(profileActivity.O.getClosestTab());
        if (i7 == profileActivity.L6 && J0 == profileActivity.M6) {
            return;
        }
        profileActivity.L6 = i7;
        profileActivity.M6 = J0;
        if (J0) {
            if (i7 > 0) {
                profileActivity.C5[0].i(org.telegram.messenger.hd.G(i7, "HideStoriesFromAlbum", new Object[0]), true, true);
                return;
            } else {
                profileActivity.C5[0].i(profileActivity.B5, true, true);
                return;
            }
        }
        if (i7 > 0 || !org.telegram.messenger.np.u1(profileActivity.currentAccount).i5()) {
            profileActivity.C5[0].i(org.telegram.messenger.hd.G(i7, "ArchiveStories", new Object[0]), true, true);
        } else {
            profileActivity.C5[0].i(profileActivity.A5, true, true);
        }
    }

    public static ValueAnimator P0(final ProfileActivity profileActivity, final boolean z10) {
        if (z10) {
            org.telegram.messenger.g0.Z2(profileActivity.getParentActivity(), profileActivity.classGuid);
            org.telegram.messenger.g0.k3(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.W1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.W1.cancel();
        }
        di.t0 t0Var = profileActivity.w0;
        if (t0Var != null) {
            t0Var.setActive(!z10);
        }
        int i7 = 0;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(profileActivity.V1, z10 ? 0.0f : 1.0f);
        final float f10 = profileActivity.Q1;
        profileActivity.b.setTranslationY(f10);
        profileActivity.b.setVisibility(0);
        profileActivity.U0.setVisibility(0);
        profileActivity.a.setVisibility(0);
        profileActivity.B4(true);
        profileActivity.Y.setVisibility(0);
        profileActivity.f.setVisibility(0);
        profileActivity.r.setVisibility(0);
        profileActivity.actionBar.A(profileActivity.V1 > 0.5f);
        int i10 = profileActivity.V1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.g5 g5Var = profileActivity.T0;
        if (g5Var != null) {
            g5Var.setVisibility(i10);
        }
        profileActivity.U0.setVisibility(i10);
        profileActivity.U0.getSearchContainer().setVisibility(profileActivity.V1 <= 0.5f ? 0 : 8);
        profileActivity.b.setEmptyView(profileActivity.P);
        profileActivity.Y.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ou0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.b0(ProfileActivity.this, ofFloat, f10, z10);
            }
        });
        ofFloat.addListener(new nv0(profileActivity, z10, i7));
        if (!z10) {
            profileActivity.Y4 = true;
            profileActivity.W4();
            org.telegram.messenger.g0.Y2(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.nr.f);
        profileActivity.W1 = ofFloat;
        return ofFloat;
    }

    public static void R0(ProfileActivity profileActivity, View view, float f10) {
        if (profileActivity.p2) {
            if (profileActivity.q2) {
                profileActivity.a.w0(0, ((view.getTop() - profileActivity.a.getMeasuredWidth()) - profileActivity.e4()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (profileActivity.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0), org.telegram.ui.Components.nr.h);
                return;
            } else {
                profileActivity.a.w0(0, view.getTop() - profileActivity.j4(), org.telegram.ui.Components.nr.h);
                return;
            }
        }
        boolean z10 = profileActivity.e4() > 0;
        if (z10) {
            float f11 = profileActivity.Q1;
            if (f11 > 0.0f && ((f11 < profileActivity.j4() * 0.6f || f10 < -1000.0f) && profileActivity.Q1 > profileActivity.e4() * 0.6f)) {
                profileActivity.a.w0(0, (int) (profileActivity.Q1 - profileActivity.e4()), org.telegram.ui.Components.nr.h);
                return;
            }
        }
        if (z10) {
            float f12 = profileActivity.Q1;
            if (f12 > 0.0f && f12 < profileActivity.e4() * 0.6f) {
                profileActivity.a.w0(0, (int) profileActivity.Q1, org.telegram.ui.Components.nr.h);
                return;
            }
        }
        if (!z10) {
            float f13 = profileActivity.Q1;
            if (f13 > 0.0f && f10 < -1000.0f) {
                profileActivity.a.w0(0, (int) f13, org.telegram.ui.Components.nr.h);
                return;
            }
        }
        if (profileActivity.Q1 > 0.0f) {
            profileActivity.a.w0(0, view.getTop() - profileActivity.j4(), org.telegram.ui.Components.nr.h);
        }
    }

    public static SpannableStringBuilder W3(String str, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
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
        iz[] izVarArr = (iz[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), iz.class);
        if (izVarArr != null) {
            for (iz izVar : izVarArr) {
                izVar.getClass();
                izVar.f = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
                izVar.r = i7;
                izVar.s = h6Var;
                izVar.n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static void Y4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, activity, null);
        t1Var.j0 = false;
        t1Var.show();
        Utilities.e.c(new b80(t1Var, z10, activity, 8));
    }

    public static void Z(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.py0.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.A0);
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document e10;
        org.telegram.ui.Components.gc h;
        if (profileActivity.K2 != null) {
            return;
        }
        if (!profileActivity.q1 || profileActivity.getMessagesController().K3()) {
            if (profileActivity.a4()) {
                return;
            }
            profileActivity.N4(false);
            return;
        }
        ArrayList l10 = profileActivity.getMessagesController().t7.l(profileActivity.f1);
        if (l10 != null) {
            TLRPC.TL_forumTopic tL_forumTopic = null;
            for (int i7 = 0; tL_forumTopic == null && i7 < l10.size(); i7++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l10.get(i7);
                if (tL_forumTopic2 != null && tL_forumTopic2.id == profileActivity.g1) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
            if (tL_forumTopic != null) {
                long j3 = tL_forumTopic.icon_emoji_id;
                if (j3 == 0 || (e10 = org.telegram.ui.Components.p5.e(profileActivity.currentAccount, j3)) == null || (h = org.telegram.ui.Components.lc.b0(profileActivity).h(e10, 1, new gu0(profileActivity, 2))) == null) {
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

    public static void b0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f10, boolean z10) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.V1 = floatValue;
        float f11 = (floatValue - 0.5f) / 0.5f;
        float f12 = (0.5f - floatValue) / 0.5f;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        float f13 = -f10;
        profileActivity.U1 = (int) ((1.0f - floatValue) * f13);
        profileActivity.b.setTranslationY(floatValue * f10);
        profileActivity.P.setTranslationY(f10 * profileActivity.V1);
        profileActivity.a.setTranslationY((1.0f - profileActivity.V1) * f13);
        profileActivity.a.setScaleX(1.0f - ((1.0f - profileActivity.V1) * 0.01f));
        profileActivity.a.setScaleY(1.0f - ((1.0f - profileActivity.V1) * 0.01f));
        profileActivity.a.setAlpha(profileActivity.V1);
        profileActivity.B4(true);
        profileActivity.a.setAlpha(f11);
        profileActivity.b.setAlpha(1.0f - profileActivity.V1);
        profileActivity.b.setScaleX((profileActivity.V1 * 0.05f) + 1.0f);
        profileActivity.b.setScaleY((profileActivity.V1 * 0.05f) + 1.0f);
        profileActivity.P.setAlpha(1.0f - f11);
        profileActivity.Y.setAlpha(f11);
        profileActivity.f0.setAlpha(f11);
        cv0 cv0Var = profileActivity.v0;
        if (cv0Var != null) {
            cv0Var.setAlpha(f11);
        }
        profileActivity.f.setAlpha(f11);
        profileActivity.r.setAlpha(profileActivity.X5 ? 0.0f : f11);
        profileActivity.U0.getSearchField().setAlpha(f12);
        if (z10 && profileActivity.V1 < 0.7f) {
            org.telegram.ui.ActionBar.g5 g5Var = profileActivity.U0;
            if (g5Var.G.getWidth() != 0 && !g5Var.e.isFocused()) {
                g5Var.e.requestFocus();
                org.telegram.messenger.g0.I3(g5Var.e);
            }
        }
        profileActivity.U0.getSearchContainer().setVisibility(profileActivity.V1 < 0.5f ? 0 : 8);
        int i7 = profileActivity.V1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.g5 g5Var2 = profileActivity.T0;
        if (g5Var2 != null) {
            g5Var2.setVisibility(i7);
            profileActivity.T0.setAlpha(f11);
        }
        profileActivity.U0.setVisibility(i7);
        profileActivity.actionBar.A(profileActivity.V1 < 0.5f);
        org.telegram.ui.ActionBar.g5 g5Var3 = profileActivity.T0;
        if (g5Var3 != null) {
            g5Var3.setAlpha(f11);
        }
        profileActivity.U0.setAlpha(f11);
        profileActivity.d1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void b5(FrameLayout frameLayout, float f10) {
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(a7 * f10);
        frameLayout.setAlpha(1.0f - f10);
        frameLayout.setVisibility(f10 < 1.0f ? 0 : 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c0(ProfileActivity profileActivity, int i7) {
        boolean z10;
        if (i7 < 0) {
            return;
        }
        Object valueOf = Integer.valueOf(profileActivity.U2);
        ww0 ww0Var = profileActivity.e;
        if (!ww0Var.x) {
            if (!ww0Var.w.isEmpty()) {
                i7--;
            }
            if (i7 < 0 || i7 >= profileActivity.e.w.size()) {
                int f10 = i5.c.f(1, i7, profileActivity.e.w);
                if (f10 >= 0 && f10 < profileActivity.e.d.size()) {
                    valueOf = profileActivity.e.d.get(f10);
                    z10 = false;
                    if (!(valueOf instanceof vw0)) {
                        vw0 vw0Var = (vw0) valueOf;
                        org.telegram.ui.ActionBar.r4 parentLayout = profileActivity.getParentLayout();
                        vw0Var.b.run();
                        org.telegram.messenger.g0.j3(parentLayout, vw0Var.c);
                    } else if (valueOf instanceof org.telegram.messenger.zo) {
                        org.telegram.messenger.ls.f(profileActivity.currentAccount).k(org.telegram.messenger.ls.c1, profileActivity.e.F, ((org.telegram.messenger.zo) valueOf).c);
                    }
                    if (z10 || valueOf == null) {
                    }
                    profileActivity.e.E(valueOf);
                    return;
                }
            } else {
                valueOf = profileActivity.e.w.get(i7);
            }
        } else if (i7 < ww0Var.r.size()) {
            valueOf = profileActivity.e.r.get(i7);
        } else {
            int f11 = i5.c.f(1, i7, profileActivity.e.r);
            if (f11 >= 0 && f11 < profileActivity.e.s.size()) {
                valueOf = profileActivity.e.s.get(f11);
            }
        }
        z10 = true;
        if (!(valueOf instanceof vw0)) {
        }
        if (z10) {
        }
    }

    public static boolean d0(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_error tL_error) {
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.np.u1(profileActivity.currentAccount).g7.edit().putLong("dialog_join_requested_time_" + profileActivity.i1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        boolean z11 = org.telegram.messenger.v3.T(profileActivity.F2) && !profileActivity.F2.megagroup;
        int i7 = org.telegram.ui.Components.r70.u1;
        org.telegram.ui.Components.r70.K0(parentActivity, profileActivity, org.telegram.ui.Components.lc.b0(profileActivity), z11);
        if (!z10 || profileActivity.P4 != -1) {
            profileActivity.N5();
            lw0 lw0Var = profileActivity.d;
            if (lw0Var != null) {
                lw0Var.f();
            }
        }
        if (g2Var instanceof bn) {
            ((bn) g2Var).cc(false, true);
        }
        return false;
    }

    public static void d1(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.d2, 0.25f) / 0.25f;
        if (profileActivity.q1) {
            profileActivity.u0.setAlpha(1.0f - min);
            profileActivity.u0.setBlurIntensity(0.0f);
            profileActivity.u0.setGooeyEnabled(false);
            profileActivity.u0.setVisibility(profileActivity.d2 >= 1.0f ? 8 : 0);
        } else {
            profileActivity.u0.setHideProgress(profileActivity.d2);
        }
        cv0 cv0Var = profileActivity.v0;
        if (cv0Var != null && profileActivity.J1 != 2) {
            float f10 = profileActivity.d2;
            cv0Var.setAlpha(f10 > 0.0f ? org.telegram.messenger.g0.T1(1.0f, 0.0f, org.telegram.messenger.g0.z1(f10, 0.0f, 0.5f)) : 1.0f);
        }
        profileActivity.B5();
    }

    public static void e0(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.m5 m5Var) {
        org.telegram.messenger.gc b10;
        String str;
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            vf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().X2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        ug.h1 h1Var = new ug.h1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.A0);
        m5Var.getLocationOnScreen(new int[2]);
        h1Var.r2 = m5Var.i0;
        h1Var.s2 = m5Var.j0;
        h1Var.v2 = m5Var.getScaleX();
        h1Var.t2 = m5Var.getLeft();
        h1Var.u2 = m5Var.getTop();
        h1Var.w2 = m5Var;
        Drawable rightDrawable = m5Var.getRightDrawable();
        org.telegram.ui.Components.n5 n5Var = profileActivity.G;
        if (rightDrawable == n5Var && n5Var != null) {
            Drawable drawable = n5Var.f[0];
            if (drawable instanceof org.telegram.ui.Components.p5) {
                h1Var.v2 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.p5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(profileActivity.getParentActivity());
                    org.telegram.messenger.mz d = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.m6.m6, 0.2f, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.gc.b(document);
                        if (d != null) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.gj.K2(document, false)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        b10 = org.telegram.messenger.gc.b(document);
                        str = "160_160";
                    }
                    String str2 = str;
                    org.telegram.messenger.gc gcVar = b10;
                    q9Var.setLayerNum(7);
                    q9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                    q9Var.m(gcVar, str2, org.telegram.messenger.gc.c(w10, document), "140_140", d, document);
                    if (((org.telegram.ui.Components.p5) profileActivity.G.f[0]).c()) {
                        q9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v6, profileActivity.A0), PorterDuff.Mode.SRC_IN));
                        h1Var.y2 = org.telegram.messenger.gj.i1(document);
                    } else {
                        h1Var.y2 = org.telegram.messenger.gj.i1(document);
                    }
                    h1Var.x2 = q9Var;
                    h1Var.A2 = true;
                }
            }
        }
        profileActivity.showDialog(h1Var);
    }

    public static /* synthetic */ void f0(ProfileActivity profileActivity) {
        org.telegram.messenger.np.u1(profileActivity.currentAccount).l0(null);
        profileActivity.V.M(0);
        profileActivity.W.M(0);
    }

    public static void f5(int i7, View view) {
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

    public static /* synthetic */ void g0(ProfileActivity profileActivity, Context context, long j3, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            ki.h3.J0(context, profileActivity.currentAccount, profileActivity.w2.starref_program, profileActivity.getUserConfig().e(), profileActivity.A0, false);
        } else {
            ki.h3.K0(context, profileActivity.currentAccount, connectedbotstarref, j3, profileActivity.A0);
        }
    }

    public static void g5(org.telegram.ui.ActionBar.g5 g5Var, boolean z10, boolean z11) {
        if (com.google.android.gms.internal.vision.e2.s(g5Var)) {
            g5Var.Z(z10, z11);
        } else if (g5Var != null) {
            g5Var.setVisibility(z10 ? 0 : 8);
        }
    }

    public static void h0(ProfileActivity profileActivity, Context context, long j3, View view, int i7, float f10, float f11) {
        TLRPC.User c22;
        lw0 lw0Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.a.C0();
        if (i7 == profileActivity.T3) {
            TLRPC.User c23 = profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.e1));
            TLRPC.UserFull userFull = profileActivity.w2;
            if (userFull != null && userFull.starref_program != null) {
                long e10 = profileActivity.getUserConfig().e();
                di.e0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), e10, profileActivity.e1, new bi.b4(profileActivity, context, e10, 5));
                return;
            } else {
                if (c23 == null || !c23.bot_can_edit) {
                    return;
                }
                profileActivity.presentFragment(new ki.j(profileActivity.e1));
                return;
            }
        }
        int i10 = 1;
        if (i7 == profileActivity.R3) {
            boolean z10 = !profileActivity.getMessagesController().u2(j3, profileActivity.g1, null);
            profileActivity.getNotificationsController().G(j3, profileActivity.g1, z10);
            org.telegram.ui.Components.lc.A(profileActivity, z10, null).j();
            profileActivity.y5();
            int i11 = profileActivity.R3;
            if (i11 < 0 || (lw0Var = profileActivity.d) == null) {
                return;
            }
            lw0Var.g(i11);
            return;
        }
        if (i7 == profileActivity.a4) {
            TLRPC.User c24 = profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.e1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", c24.id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.i5);
            bundle.putString("first_name_card", profileActivity.j5);
            bundle.putString("last_name_card", profileActivity.k5);
            qr qrVar = new qr(bundle, profileActivity.A0);
            qrVar.P = new yt0(profileActivity, c24);
            profileActivity.presentFragment(qrVar);
            return;
        }
        if (i7 == profileActivity.X3) {
            TextView textView = (TextView) org.telegram.ui.Components.c5.f0(profileActivity.getParentActivity(), org.telegram.messenger.hd.N0(2131751496, null), org.telegram.messenger.hd.N0(2131751580, null), org.telegram.messenger.hd.N0(2131751579, null), org.telegram.messenger.hd.N0(2131751586, null), new gu0(profileActivity, i10), profileActivity.A0, false).d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                return;
            }
            return;
        }
        int i12 = 2;
        if (i7 == profileActivity.Y3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
            String N0 = org.telegram.messenger.hd.N0(2131746015, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.hd.N0(2131746036, null);
            TLRPC.Chat O0 = profileActivity.getMessagesController().O0(Long.valueOf(-profileActivity.f5));
            org.telegram.ui.Cells.d2[] d2VarArr = new org.telegram.ui.Cells.d2[1];
            if (O0 != null && org.telegram.messenger.v3.w(2, O0)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, profileActivity.getParentActivity(), profileActivity.A0);
                d2VarArr[0] = d2Var;
                d2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
                d2VarArr[0].e(org.telegram.messenger.hd.N0(2131753724, null), "", true, false, false);
                d2VarArr[0].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                linearLayout.addView(d2VarArr[0], c8.ma.o(-1, -2));
                d2VarArr[0].setOnClickListener(new c10(d2VarArr, i12));
                alertDialog$Builder.o(linearLayout);
            }
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131746034, null), new aj0(13, profileActivity, d2VarArr));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new m60(10));
            TextView textView2 = (TextView) alertDialog$Builder.p().d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.q7, null);
                return;
            }
            return;
        }
        if (i7 == profileActivity.u4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", (int) (profileActivity.i1 & 4294967295L));
            profileActivity.presentFragment(new q50(bundle2));
            return;
        }
        if (i7 == profileActivity.t4) {
            profileActivity.showDialog(org.telegram.ui.Components.c5.S(profileActivity.getParentActivity(), profileActivity.E2, profileActivity.A0).a);
            return;
        }
        if (i7 == profileActivity.O3) {
            profileActivity.I4(view, f10, f11, false);
            return;
        }
        if (i7 == profileActivity.O4) {
            profileActivity.getMessagesController().r5(null, profileActivity.e1);
            if (org.telegram.ui.Components.lc.a(profileActivity)) {
                org.telegram.ui.Components.lc.d(profileActivity, false).j();
                return;
            }
            return;
        }
        if (i7 == profileActivity.b4) {
            ki.h0.a(profileActivity, profileActivity.currentAccount, profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.e1)));
            return;
        }
        int i13 = 9;
        if (i7 == profileActivity.d4) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
                return;
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                return;
            }
        }
        if (i7 == profileActivity.V3) {
            profileActivity.L4();
            return;
        }
        if (i7 == profileActivity.W3) {
            qy0.L0(profileActivity.a(), profileActivity);
            return;
        }
        if (i7 >= profileActivity.x4 && i7 < profileActivity.y4) {
            profileActivity.h(!profileActivity.D2.isEmpty() ? profileActivity.v2.participants.participants.get(((Integer) profileActivity.D2.get(i7 - profileActivity.x4)).intValue()) : profileActivity.v2.participants.participants.get(i7 - profileActivity.x4), false, false, view);
            return;
        }
        if (i7 == profileActivity.z4) {
            profileActivity.M4();
            return;
        }
        if (i7 == profileActivity.M3) {
            profileActivity.T4(f10, f11, i7, view);
            return;
        }
        if (i7 == profileActivity.o4) {
            if (profileActivity.F2 != null) {
                profileActivity.showDialog(new li.d0(profileActivity, profileActivity.F2.linked_community_id, null, null));
                return;
            } else {
                if (profileActivity.e1 == 0 || (c22 = profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.e1))) == null) {
                    return;
                }
                profileActivity.showDialog(new li.d0(profileActivity, c22.linked_community_id, null, null));
                return;
            }
        }
        if (i7 == profileActivity.J3) {
            if (profileActivity.v2.location instanceof TLRPC.TL_channelLocation) {
                qa0 qa0Var = new qa0(5);
                long j10 = profileActivity.f1;
                TLRPC.TL_channelLocation tL_channelLocation = (TLRPC.TL_channelLocation) profileActivity.v2.location;
                qa0Var.m0 = -j10;
                qa0Var.H0 = tL_channelLocation;
                profileActivity.presentFragment(qa0Var);
                return;
            }
            return;
        }
        if (i7 == profileActivity.P4) {
            profileActivity.H4(false);
            return;
        }
        if (i7 == profileActivity.A4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f1);
            bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            rq rqVar = new rq(bundle3);
            rqVar.C0(profileActivity.v2);
            profileActivity.presentFragment(rqVar);
            return;
        }
        if (i7 == profileActivity.B4) {
            profileActivity.presentFragment(new bi.b9(profileActivity.f1));
            return;
        }
        if (i7 == profileActivity.C4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            rq rqVar2 = new rq(bundle4);
            rqVar2.C0(profileActivity.v2);
            profileActivity.presentFragment(rqVar2);
            return;
        }
        if (i7 == profileActivity.D4) {
            profileActivity.S0.performClick();
            return;
        }
        if (i7 == profileActivity.E4) {
            profileActivity.presentFragment(new di.t(0, profileActivity.e1));
            return;
        }
        if (i7 == profileActivity.F4) {
            profileActivity.presentFragment(new di.t(1, profileActivity.e1));
            return;
        }
        if (i7 == profileActivity.G4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new c51(bundle5));
            return;
        }
        if (i7 == profileActivity.J4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f1);
            bundle6.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            rq rqVar3 = new rq(bundle6);
            rqVar3.C0(profileActivity.v2);
            profileActivity.presentFragment(rqVar3);
            return;
        }
        if (i7 == profileActivity.g3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
            return;
        }
        if (i7 == profileActivity.i3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.I2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.D0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
            return;
        }
        if (i7 == profileActivity.j3) {
            profileActivity.presentFragment(new DataSettingsActivity());
            return;
        }
        if (i7 == profileActivity.k3) {
            profileActivity.presentFragment(new ThemeActivity(0));
            return;
        }
        if (i7 == profileActivity.l3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
            return;
        }
        if (i7 == profileActivity.n3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
            return;
        }
        if (i7 == profileActivity.m3) {
            profileActivity.presentFragment(new z90());
            return;
        }
        if (i7 == profileActivity.o3) {
            profileActivity.presentFragment(new SessionsActivity(0));
            return;
        }
        if (i7 == profileActivity.r3) {
            profileActivity.showDialog(org.telegram.ui.Components.c5.R(profileActivity, profileActivity.A0));
            return;
        }
        if (i7 == profileActivity.s3) {
            vf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
            return;
        }
        if (i7 == profileActivity.t3) {
            vf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
            return;
        }
        if (i7 == profileActivity.w3) {
            Y4(profileActivity.getParentActivity(), false);
            return;
        }
        if (i7 == profileActivity.x3) {
            Y4(profileActivity.getParentActivity(), true);
            return;
        }
        if (i7 == profileActivity.y3) {
            org.telegram.messenger.a8.a();
            return;
        }
        if (i7 == profileActivity.z3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
            String N02 = org.telegram.messenger.hd.N0(2131754117, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
            t1Var2.U = N02;
            t1Var2.S = org.telegram.messenger.hd.N0(R.string.AppName, null);
            alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131747637, null), new tt0(profileActivity, i13));
            alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
            profileActivity.showDialog(t1Var2);
            return;
        }
        if (i7 == profileActivity.h3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
            return;
        }
        if (i7 == profileActivity.W2) {
            profileActivity.presentFragment(new la(null));
            return;
        }
        if (i7 == profileActivity.X2) {
            profileActivity.presentFragment(new UserInfoActivity());
            return;
        }
        if (i7 == profileActivity.U2) {
            profileActivity.presentFragment(new g(3));
            return;
        }
        if (i7 == profileActivity.P2) {
            profileActivity.L4();
            return;
        }
        if (i7 == profileActivity.f4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
            return;
        }
        if (i7 == profileActivity.g4) {
            profileActivity.presentFragment(new di.pb());
            return;
        }
        if (i7 == profileActivity.h4) {
            profileActivity.presentFragment(new ii.t());
            return;
        }
        if (i7 == profileActivity.i4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
            return;
        }
        if (i7 == profileActivity.j4) {
            bi.e2.l1(false, org.telegram.messenger.v1.a(profileActivity.currentAccount).b());
            return;
        }
        if (i7 == profileActivity.botPermissionLocation) {
            ki.r0 r0Var = profileActivity.t2;
            if (r0Var != null) {
                r0Var.l(!r0Var.g(), new tr0(14, profileActivity, view));
                return;
            }
            return;
        }
        if (i7 == profileActivity.botPermissionBiometry) {
            ki.p pVar = profileActivity.u2;
            if (pVar != null) {
                boolean z11 = !pVar.e;
                pVar.f = true;
                pVar.e = z11;
                pVar.k();
                ((org.telegram.ui.Cells.n8) view).setChecked(profileActivity.u2.e);
                return;
            }
            return;
        }
        if (i7 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            n8Var.setChecked(!n8Var.d());
            if (profileActivity.r4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.r4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().q1(profileActivity.e1);
            boolean d = n8Var.d();
            toggleuseremojistatuspermission.enabled = d;
            TLRPC.UserFull userFull2 = profileActivity.w2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = d;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new e00(24, profileActivity, r0));
            profileActivity.r4 = sendRequest;
            int[] iArr = {sendRequest};
            return;
        }
        if (i7 == profileActivity.P3) {
            profileActivity.R4 = !profileActivity.R4;
            profileActivity.W4();
            view.requestLayout();
            profileActivity.d.g(profileActivity.P3);
            int i14 = profileActivity.r6;
            if (i14 >= 0) {
                profileActivity.c.h1(i14, profileActivity.s6 - profileActivity.a.getPaddingTop());
                return;
            }
            return;
        }
        if (i7 == profileActivity.Q3) {
            profileActivity.Q4(false);
            return;
        }
        if (i7 == profileActivity.R2) {
            if (profileActivity.w2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.w2.personal_channel_id);
            profileActivity.presentFragment(new bn(bundle7));
            return;
        }
        if (i7 != profileActivity.V2) {
            if (i7 == profileActivity.I3) {
                profileActivity.Y3(i7, view);
                return;
            } else {
                profileActivity.T4(f10, f11, i7, view);
                return;
            }
        }
        dx0 dx0Var = profileActivity.G6;
        if ((dx0Var == null || !dx0Var.a()) && !profileActivity.Z3(i7, view)) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (y8Var.d.getDrawable() != null) {
                profileActivity.K4(y8Var.getImageView());
            }
        }
    }

    public static void i0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        if (tL_error == null) {
            TLRPC.User c22 = profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.getUserConfig().e()));
            if (c22 == null) {
                c22 = profileActivity.getUserConfig().f();
                if (c22 == null) {
                    return;
                } else {
                    profileActivity.getMessagesController().e4(c22, false, false);
                }
            } else {
                profileActivity.getUserConfig().w(c22);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.ls.g2, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 800, false, null, false);
            TLRPC.VideoSize x10 = tL_photos_photo.photo.video_sizes.isEmpty() ? null : org.telegram.messenger.w7.x(1000, tL_photos_photo.photo.video_sizes);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            c22.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w10 != null) {
                tL_userProfilePhoto.photo_small = w10.location;
            }
            if (w11 != null) {
                tL_userProfilePhoto.photo_big = w11.location;
            }
            if (w10 != null && profileActivity.J2 != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                org.telegram.messenger.w7.J(profileActivity.J2, null, true, true).renameTo(J);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(profileActivity.J2.volume_id);
                sb2.append("_");
                String n10 = a8.p0.n(profileActivity.J2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.fc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.gc.m(profileActivity.currentAccount, 1, c22));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                new File(str).renameTo(org.telegram.messenger.w7.J(x10, "mp4", true, true));
            } else if (w11 != null && profileActivity.K2 != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                org.telegram.messenger.w7.J(profileActivity.K2, null, true, true).renameTo(J2);
            }
            profileActivity.getMessagesController().W0(c22.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c22);
            profileActivity.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull d2 = profileActivity.getMessagesController().d2(profileActivity.e1);
            if (d2 != null) {
                d2.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().j2(d2, false);
            }
        }
        profileActivity.p2 = (org.telegram.messenger.g0.Q1() || profileActivity.o2 || !profileActivity.f0.getImageReceiver().L() || org.telegram.messenger.g0.C1()) ? false : true;
        profileActivity.J2 = null;
        profileActivity.K2 = null;
        av0 av0Var = profileActivity.o0;
        av0Var.I0 = true;
        av0Var.L0 = profileActivity.L2;
        av0Var.r1 = null;
        av0Var.s1 = null;
        av0Var.setCreateThumbFromParent(false);
        profileActivity.M5(true);
        profileActivity.m5(false, true);
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ls.r, Integer.valueOf(org.telegram.messenger.np.I8));
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ls.j0, new Object[0]);
        profileActivity.getUserConfig().v(true);
    }

    public static void j0(ProfileActivity profileActivity, TLRPC.User user) {
        if (profileActivity.a4 >= 0) {
            if (profileActivity.N4 == -1) {
                profileActivity.N5();
                profileActivity.d.f();
            } else {
                profileActivity.H5(false, false);
            }
        }
        if (profileActivity.N4 == -1) {
            if (profileActivity.o2 || org.telegram.messenger.g0.Q1()) {
                profileActivity.a.setPadding(0, profileActivity.j4(), 0, 0);
                profileActivity.k2.cancel();
                float[] fArr = profileActivity.n2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.a5(1.0f);
                profileActivity.Q1 = profileActivity.j4();
            } else {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (profileActivity.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredWidth(), TLObject.FLAG_30);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    lw0 lw0Var = profileActivity.d;
                    if (i7 >= lw0Var.e.O2) {
                        break;
                    }
                    v4.f1 a10 = lw0Var.a(null, lw0Var.d(i7));
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
        profileActivity.M.m(profileActivity.i1, user, 8);
    }

    public static void k0(ProfileActivity profileActivity) {
        org.telegram.ui.ActionBar.h2 h2Var;
        int i7;
        String str;
        TextView[] textViewArr;
        final int i10;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.w2;
        if (userFull == null || userFull.stars_rating == null) {
            return;
        }
        org.telegram.ui.ActionBar.h6 h6Var = null;
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.o10.j(profileActivity.getParentActivity(), false, 1, null);
        org.telegram.ui.ActionBar.h2 h2Var2 = j3.y0;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        final LimitPreviewView limitPreviewView = new LimitPreviewView(R.drawable.filled_rating_crown, 0, 0, profileActivity.getParentActivity(), profileActivity.A0);
        limitPreviewView.setHideNegativeValues(profileActivity.a() != org.telegram.messenger.k10.i(profileActivity.currentAccount).e());
        limitPreviewView.setStarRating(userFull.stars_rating);
        limitPreviewView.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
        linearLayout.addView(limitPreviewView, c8.ma.t(-1, -2, 17, 0, 20, 0, 10));
        int i11 = 17;
        if (userFull.stars_my_pending_rating != null) {
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            linearLayout.addView(frameLayout, c8.ma.t(-1, -2, 17, 40, -12, 40, 20));
            int i12 = 2;
            org.telegram.ui.Components.m80[] m80VarArr = new org.telegram.ui.Components.m80[2];
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i12;
                bi.u2 u2Var = new bi.u2(6, parentActivity, h6Var);
                m80VarArr[i13] = u2Var;
                u2Var.setGravity(i11);
                m80VarArr[i13].setTextSize(1, 12.0f);
                org.telegram.ui.ActionBar.t6.U(m80VarArr[i13], org.telegram.ui.ActionBar.m6.y6, null);
                org.telegram.ui.ActionBar.t6.G(m80VarArr[i13], org.telegram.ui.ActionBar.m6.Xc, null);
                frameLayout.addView(m80VarArr[i13], c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
                m80VarArr[i13].setAlpha(i13 == 0 ? 1.0f : 0.0f);
                m80VarArr[i13].setScaleX(i13 == 0 ? 1.0f : 0.8f);
                m80VarArr[i13].setScaleY(i13 == 0 ? 1.0f : 0.8f);
                i13++;
                i12 = i14;
                i11 = 17;
            }
            int i15 = i12;
            final r3 r3Var = new r3(m80VarArr, 23);
            boolean z10 = profileActivity.a() == org.telegram.messenger.k10.i(profileActivity.currentAccount).e();
            long j10 = userFull.stars_rating.stars;
            TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
            h2Var = h2Var2;
            long j11 = (-j10) - (tl_starsRating != null ? tl_starsRating.stars - j10 : 0L);
            int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(profileActivity.currentAccount).getCurrentTime()) / 86400);
            long j12 = userFull.stars_my_pending_rating.stars;
            long j13 = userFull.stars_rating.stars;
            long j14 = j12 - j13;
            if ((j13 >= 0 || z10) && (!z10 || j11 <= 0)) {
                textViewArr = m80VarArr;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String H = org.telegram.messenger.hd.H(',', "StarRatingFuture", max);
                String H2 = org.telegram.messenger.hd.H(',', "StarRatingFuturePendingPoints", (int) j14);
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[0] = H;
                charSequenceArr[1] = "\n";
                charSequenceArr[i15] = H2;
                spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                spannableStringBuilder.append((CharSequence) " ");
                i10 = 0;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.N0(2131744943, null), new Runnable() { // from class: org.telegram.ui.ku0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16 = i10;
                        r3 r3Var2 = r3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i16) {
                            case 0:
                                RectF rectF = ProfileActivity.Z6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                r3Var2.a(Boolean.TRUE);
                                break;
                            default:
                                RectF rectF2 = ProfileActivity.Z6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                r3Var2.a(Boolean.FALSE);
                                break;
                        }
                    }
                }), true));
                textViewArr[0].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.lu0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i16 = i10;
                        r3 r3Var2 = r3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i16) {
                            case 0:
                                RectF rectF = ProfileActivity.Z6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                r3Var2.a(Boolean.TRUE);
                                break;
                            default:
                                RectF rectF2 = ProfileActivity.Z6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                r3Var2.a(Boolean.FALSE);
                                break;
                        }
                    }
                });
                textViewArr[0].setText(spannableStringBuilder);
            } else {
                boolean z11 = z10;
                textViewArr = m80VarArr;
                org.telegram.ui.ActionBar.t6.U(m80VarArr[0], org.telegram.ui.ActionBar.m6.q7, null);
                if (z11) {
                    textViewArr[0].setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.H(',', "StarRatingLevelNegativeYou", (int) j11)));
                } else {
                    textViewArr[0].setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131744929, org.telegram.messenger.n5.l(org.telegram.messenger.k10.t0, profileActivity.a()))));
                }
                i10 = 0;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String H3 = org.telegram.messenger.hd.H(',', "StarRatingFuturePreview1", max);
            String H4 = org.telegram.messenger.hd.H(',', "StarRatingFuturePreview2", (int) j14);
            CharSequence[] charSequenceArr2 = new CharSequence[3];
            charSequenceArr2[i10] = H3;
            final int i16 = 1;
            charSequenceArr2[1] = "\n";
            charSequenceArr2[i15] = H4;
            spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.N0(2131744942, null), new Runnable() { // from class: org.telegram.ui.ku0
                @Override // java.lang.Runnable
                public final void run() {
                    int i162 = i16;
                    r3 r3Var2 = r3Var;
                    TLRPC.UserFull userFull2 = userFull;
                    LimitPreviewView limitPreviewView2 = limitPreviewView;
                    switch (i162) {
                        case 0:
                            RectF rectF = ProfileActivity.Z6;
                            limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            r3Var2.a(Boolean.TRUE);
                            break;
                        default:
                            RectF rectF2 = ProfileActivity.Z6;
                            limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                            r3Var2.a(Boolean.FALSE);
                            break;
                    }
                }
            }), true));
            textViewArr[1].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.lu0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i162 = i16;
                    r3 r3Var2 = r3Var;
                    TLRPC.UserFull userFull2 = userFull;
                    LimitPreviewView limitPreviewView2 = limitPreviewView;
                    switch (i162) {
                        case 0:
                            RectF rectF = ProfileActivity.Z6;
                            limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            r3Var2.a(Boolean.TRUE);
                            break;
                        default:
                            RectF rectF2 = ProfileActivity.Z6;
                            limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                            r3Var2.a(Boolean.FALSE);
                            break;
                    }
                }
            });
            textViewArr[1].setText(spannableStringBuilder2);
        } else {
            h2Var = h2Var2;
        }
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.hd.N0(2131744924, null));
        textView.setTextSize(1, 20.0f);
        int i17 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i17, profileActivity.A0);
        linearLayout.addView(textView, c8.ma.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        if (userFull.id == org.telegram.messenger.k10.i(profileActivity.currentAccount).e()) {
            textView2.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131744925, null)));
            i7 = 1;
        } else {
            i7 = 1;
            org.telegram.messenger.f3.q(null, null, 2131744955, new Object[]{org.telegram.messenger.n5.l(org.telegram.messenger.k10.t0, profileActivity.a())}, textView2);
        }
        textView2.setTextSize(i7, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView2, i17, profileActivity.A0);
        linearLayout.addView(textView2, c8.ma.t(-1, -2, 17, 20, 0, 20, 12));
        js0 js0Var = new js0(parentActivity, profileActivity.A0);
        js0Var.a.l(org.telegram.messenger.hd.N0(2131744923, null), false);
        String N0 = org.telegram.messenger.hd.N0(2131744958, null);
        int i18 = org.telegram.ui.ActionBar.m6.Fi;
        js0Var.b.setText(org.telegram.messenger.hd.V(null, null, 2131744954, W3(N0, i18, profileActivity.A0)));
        js0Var.d.setVisibility(8);
        ImageView imageView = js0Var.c;
        imageView.setImageResource(R.drawable.menu_gift);
        org.telegram.ui.ActionBar.h6 h6Var2 = profileActivity.A0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.t6.s(imageView, i17, h6Var2, mode);
        linearLayout.addView(js0Var, c8.ma.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        js0 js0Var2 = new js0(parentActivity, profileActivity.A0);
        js0Var2.a.l(org.telegram.messenger.hd.N0(2131744922, null), false);
        js0Var2.b.setText(org.telegram.messenger.hd.V(null, null, 2131744953, W3(org.telegram.messenger.hd.N0(2131744958, null), i18, profileActivity.A0)));
        js0Var2.d.setVisibility(8);
        ImageView imageView2 = js0Var2.c;
        imageView2.setImageResource(R.drawable.menu_stars_gift);
        org.telegram.ui.ActionBar.t6.s(imageView2, i17, profileActivity.A0, mode);
        linearLayout.addView(js0Var2, c8.ma.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        js0 js0Var3 = new js0(parentActivity, profileActivity.A0);
        js0Var3.a.l(org.telegram.messenger.hd.N0(2131744921, null), false);
        String N02 = org.telegram.messenger.hd.N0(2131744956, null);
        int f10 = org.telegram.ui.ActionBar.m6.I.q() ? i0.a.f(0.25f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.m6, profileActivity.A0), -16777216) : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.y6, profileActivity.A0);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(N02);
        ov0 ov0Var = new ov0(9);
        ov0Var.w = N02;
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
        js0Var3.b.setText(org.telegram.messenger.hd.V(str, str, 2131744952, spannableStringBuilder3));
        js0Var3.d.setVisibility(8);
        ImageView imageView3 = js0Var3.c;
        imageView3.setImageResource(R.drawable.menu_refund);
        org.telegram.ui.ActionBar.t6.s(imageView3, i17, profileActivity.A0, mode);
        linearLayout.addView(js0Var3, c8.ma.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        hi.e eVar = new hi.e(parentActivity, profileActivity.A0, true);
        eVar.setOnClickListener(new mu0(0, h2Var));
        eVar.i(di.f6.t2(org.telegram.messenger.hd.N0(2131743643, null)), false, true);
        linearLayout.addView(eVar, c8.ma.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        j3.O = linearLayout;
        j3.show();
    }

    public static void l0(ProfileActivity profileActivity, int i7, float f10, float f11) {
        int i10 = 25;
        switch (i7) {
            case 0:
                boolean z10 = profileActivity.q1;
                if (!z10) {
                    if (profileActivity.e1 == 0) {
                        if (profileActivity.f1 != 0) {
                            if (!org.telegram.messenger.v3.c0(profileActivity.getMessagesController().O0(Long.valueOf(profileActivity.f1)))) {
                                if (!profileActivity.c4()) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", profileActivity.f1);
                                    if (profileActivity.getMessagesController().E(bundle, profileActivity, null, null)) {
                                        profileActivity.presentFragment(new bn(bundle), false);
                                        break;
                                    }
                                }
                            } else {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", profileActivity.f1);
                                if (profileActivity.getMessagesController().E(bundle2, profileActivity, null, null)) {
                                    profileActivity.presentFragment(new bn(bundle2), false);
                                    break;
                                }
                            }
                        }
                    } else {
                        profileActivity.O4();
                        break;
                    }
                } else if (z10) {
                    profileActivity.c4();
                    break;
                }
                break;
            case 1:
                profileActivity.I4(profileActivity.a0, f10, f11, true);
                break;
            case 2:
                profileActivity.P4();
                break;
            case 3:
                profileActivity.G4();
                break;
            case 4:
                profileActivity.J4();
                break;
            case 5:
            case 10:
            case 11:
                profileActivity.F4(false);
                break;
            case 6:
                profileActivity.F4(true);
                break;
            case 7:
                profileActivity.H4(true);
                break;
            case 8:
                qy0.L0(profileActivity.a(), profileActivity);
                break;
            case 9:
                profileActivity.z4(false);
                break;
            case 12:
                profileActivity.getMessagesController().h7.edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, profileActivity.getParentActivity(), profileActivity.A0);
                t1Var.r(200L);
                org.telegram.messenger.np.u1(profileActivity.currentAccount).R1().k(profileActivity.a(), new org.telegram.ui.Components.rh(i10, profileActivity, t1Var), true, profileActivity.A0);
                break;
            case 13:
                profileActivity.E4(true);
                break;
            case 14:
                profileActivity.L4();
                break;
            case 15:
                TLRPC.User f12 = profileActivity.getUserConfig().f();
                if (f12 != null) {
                    org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(profileActivity, profileActivity.a0);
                    I.w = false;
                    I.i = 3;
                    I.c(R.drawable.msg_qrcode, org.telegram.messenger.hd.N0(2131746304, null), new n90(profileActivity, i10), false);
                    I.c(R.drawable.msg_copy, org.telegram.messenger.hd.N0(2131746482, null), new hf0(f12, 29), false);
                    I.c(R.drawable.msg_edit, org.telegram.messenger.hd.N0(2131746424, null), new n90(profileActivity, 26), false);
                    I.Z = true;
                    I.b0(f10 - org.telegram.messenger.g0.L(8.0f), profileActivity.a0.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f));
                    I.a0();
                    break;
                }
                break;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 17:
                profileActivity.presentFragment(new o31(null));
                break;
        }
    }

    public static void m0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.b0 == null) {
            if (MediaController.B().R0 != null && MediaController.B().R0.a == profileActivity.currentAccount && MediaController.B().R0.b == profileActivity.a()) {
                profileActivity.b0 = MediaController.B().R0;
            } else {
                org.telegram.messenger.hp hpVar = new org.telegram.messenger.hp(profileActivity.currentAccount, profileActivity.a());
                profileActivity.b0 = hpVar;
                TLRPC.UserFull userFull = profileActivity.w2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    ArrayList arrayList = hpVar.c;
                    arrayList.clear();
                    hpVar.b();
                    arrayList.add(0, hpVar.d(document));
                }
            }
        }
        if (profileActivity.b0.c.isEmpty()) {
            return;
        }
        if (MediaController.B().R0 == profileActivity.b0 && MediaController.B().I((org.telegram.messenger.gj) profileActivity.b0.c.get(0))) {
            z10 = true;
        } else {
            MediaController.B().o();
            z10 = false;
        }
        MediaController.B().R0 = profileActivity.b0;
        MediaController.B().S0.clear();
        MediaController.B().S0.addAll(profileActivity.b0.c);
        if (!z10) {
            MediaController.B().S((org.telegram.messenger.gj) profileActivity.b0.c.get(0));
        }
        profileActivity.showDialog(new org.telegram.ui.Components.f8(profileActivity.getParentActivity(), profileActivity.A0));
    }

    public static void n0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.za0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new n90(profileActivity, 23), profileActivity.A0);
    }

    public static void o0(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.gc Q = org.telegram.ui.Components.lc.b0(profileActivity).Q(R.raw.contact_check, 36, org.telegram.messenger.hd.N0(2131746662, null));
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
            org.telegram.messenger.f3.n(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity), R.raw.error, 36);
            return;
        }
        if (profileActivity.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.resourceProvider);
            String N0 = org.telegram.messenger.hd.N0(2131746658, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.hd.N0(2131746659, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
            profileActivity.showDialog(t1Var);
        }
    }

    public static void p0(ProfileActivity profileActivity, org.telegram.ui.Cells.d2[] d2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().q1(profileActivity.e1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().l1(profileActivity.f5);
        tL_messages_reportReaction.id = profileActivity.e5;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new fi.l5(27));
        org.telegram.ui.Cells.d2 d2Var = d2VarArr[0];
        if (d2Var != null && d2Var.b()) {
            profileActivity.getMessagesController().f0(-profileActivity.f5, profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.e1)));
        }
        profileActivity.e5 = 0;
        profileActivity.H5(false, false);
        org.telegram.ui.Components.lc.b0(profileActivity).E(profileActivity.A0).j();
    }

    public static void q0(ProfileActivity profileActivity, Boolean bool) {
        long j3 = profileActivity.e1;
        if (j3 == 0) {
            long j10 = profileActivity.f1;
            j3 = j10 != 0 ? -j10 : profileActivity.i1;
        }
        long j11 = j3;
        if (bool.booleanValue()) {
            org.telegram.messenger.np.u1(profileActivity.currentAccount).W(profileActivity.f5, j11);
        } else {
            org.telegram.messenger.np.u1(profileActivity.currentAccount).h0(profileActivity.f5, profileActivity.e5, j11);
        }
        profileActivity.e5 = 0;
        profileActivity.H5(false, false);
        org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(profileActivity.getParentActivity(), profileActivity.A0);
        obVar.d(R.raw.chats_infotip, new String[0]);
        obVar.b.setText(org.telegram.messenger.hd.N0(2131746208, null));
        org.telegram.ui.Components.lc.b0(profileActivity).b(obVar, 1500).j();
    }

    public static /* synthetic */ void r0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.J2 = fileLocation;
            profileActivity.K2 = photoSize2.location;
            profileActivity.f0.j(org.telegram.messenger.gc.e(fileLocation), "50_50", profileActivity.q0, null);
            if (profileActivity.P2 != -1) {
                profileActivity.N5();
                lw0 lw0Var = profileActivity.d;
                if (lw0Var != null) {
                    lw0Var.f();
                }
                profileActivity.B4(true);
            }
            av0 av0Var = profileActivity.o0;
            org.telegram.messenger.gc e10 = org.telegram.messenger.gc.e(profileActivity.K2);
            profileActivity.L2 = e10;
            av0Var.A(e10, org.telegram.messenger.gc.e(profileActivity.J2));
            profileActivity.m5(true, false);
        } else {
            if (profileActivity.J2 == null) {
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
            profileActivity.p6 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new e00(23, profileActivity, str));
        }
        profileActivity.actionBar.s().requestLayout();
    }

    public static void y1(ProfileActivity profileActivity, boolean z10) {
        int i7 = z10 ? 8 : 0;
        profileActivity.a.setVisibility(i7);
        profileActivity.b.setVisibility(z10 ? 0 : 8);
        profileActivity.U0.getSearchContainer().setVisibility(z10 ? 0 : 8);
        di.t0 t0Var = profileActivity.w0;
        if (t0Var != null) {
            t0Var.setActive(!z10);
        }
        profileActivity.actionBar.A(z10);
        profileActivity.Y.setVisibility(i7);
        cv0 cv0Var = profileActivity.v0;
        if (cv0Var != null) {
            cv0Var.setVisibility(i7);
        }
        profileActivity.f.setVisibility(i7);
        profileActivity.r.setVisibility(i7);
        org.telegram.ui.ActionBar.g5 g5Var = profileActivity.T0;
        if (g5Var != null) {
            g5Var.setAlpha(1.0f);
            profileActivity.T0.setVisibility(i7);
        }
        profileActivity.U0.setVisibility(i7);
        profileActivity.f0.setAlpha(1.0f);
        profileActivity.Y.setAlpha(1.0f);
        cv0 cv0Var2 = profileActivity.v0;
        if (cv0Var2 != null) {
            cv0Var2.setAlpha(1.0f);
        }
        di.t0 t0Var2 = profileActivity.w0;
        if (t0Var2 != null) {
            t0Var2.setAlpha(1.0f);
        }
        profileActivity.f.setAlpha(1.0f);
        profileActivity.r.setAlpha(profileActivity.X5 ? 0.0f : 1.0f);
        profileActivity.U0.setAlpha(1.0f);
        profileActivity.a.setAlpha(1.0f);
        profileActivity.b.setAlpha(1.0f);
        profileActivity.P.setAlpha(1.0f);
        if (z10) {
            profileActivity.b.setEmptyView(profileActivity.P);
        } else {
            profileActivity.P.setVisibility(8);
        }
    }

    public final boolean A4() {
        return getMessagesController().R1().K(a()) && !this.q1;
    }

    public final void A5() {
        if (this.simpleActionBar == null) {
            return;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getVisibility() != 4) {
            this.actionBar.setVisibility(4);
        }
        float L3 = 1.0f - ((1.0f - L3()) * this.simpleActionBar.getActionModeFactor());
        ai.l0 l0Var = this.Z;
        if (l0Var == null || this.R1 == L3) {
            return;
        }
        this.R1 = L3;
        l0Var.invalidate();
    }

    @Override // org.telegram.ui.le0
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    public final void B4(boolean z10) {
        float f10;
        float f11;
        org.telegram.ui.Components.q9 currentItemView;
        float f12;
        float f13;
        TLRPC.ChatFull chatFull;
        this.glassEngine.g();
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        float L3 = L3();
        A5();
        qu0 qu0Var = this.a;
        if (qu0Var != null && !this.G1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qu0Var.getLayoutParams();
            if (layoutParams.topMargin != currentActionBarHeight) {
                layoutParams.topMargin = currentActionBarHeight;
                this.a.setLayoutParams(layoutParams);
            }
        }
        S5(z10);
        if (this.Y != null) {
            this.a.setTopGlowOffset((int) this.Q1);
            this.a.setOverScrollMode((this.Q1 <= ((float) j4()) || this.Q1 >= ((float) ((e4() + this.a.getMeasuredWidth()) - currentActionBarHeight))) ? 0 : 2);
        }
        if (this.Y != null && !this.i6 && this.G1) {
            K3();
            return;
        }
        int j42 = j4();
        if (this.Y != null) {
            if (this.a0 != null && this.f1 != 0) {
                this.a0.o(2, (!org.telegram.messenger.v3.T(this.F2) || this.F2.megagroup || (chatFull = this.v2) == null || chatFull.linked_chat_id == 0) ? false : true);
            }
            S5(z10);
            float translationY = this.actionBar.getTranslationY() + (org.telegram.messenger.o10.b(L3, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0) - org.telegram.messenger.g0.L(21.0f));
            if (this.G1) {
                this.b2 = translationY;
            } else {
                org.telegram.ui.Components.lg0 lg0Var = this.u0;
                if (lg0Var != null) {
                    f13 = -org.telegram.messenger.g0.L(29.0f);
                    bi.c2 c2Var = lg0Var.n;
                    if (c2Var != null && c2Var.c) {
                        f13 = ((RectF) c2Var.e).centerY();
                    }
                } else {
                    f13 = -org.telegram.messenger.g0.L(29.0f);
                }
                this.b2 = org.telegram.messenger.g0.T1(f13, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.L(21.0f)), L3);
            }
            float f14 = this.G1 ? this.S1 : this.Q1;
            float f15 = j42;
            if (f14 > f15 || this.q2) {
                f10 = 2.0f;
                float C = a8.p0.C(f14 - f15, (this.a.getMeasuredWidth() - currentActionBarHeight) - k4(), 1.0f, 0.0f);
                this.i2 = C;
                f11 = 18.0f;
                this.c2 = (org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, C * 3.0f)) / 100.0f) * 42.0f;
                this.d2 = 0.0f;
                cv0 cv0Var = this.v0;
                if (cv0Var != null) {
                    cv0Var.invalidate();
                }
                di.t0 t0Var = this.w0;
                if (t0Var != null) {
                    t0Var.invalidate();
                }
                float min = Math.min(org.telegram.messenger.g0.N(2000.0f), Math.max(org.telegram.messenger.g0.N(1100.0f), Math.abs(this.j2))) / org.telegram.messenger.g0.N(1100.0f);
                e4();
                boolean z11 = this.p2;
                int i7 = org.telegram.messenger.ls.u4;
                float[] fArr = this.n2;
                if (!z11 || (!this.G0 && this.i2 < 0.33f)) {
                    if (this.q2) {
                        this.q2 = false;
                        org.telegram.messenger.ls.e().k(i7, Boolean.TRUE);
                        org.telegram.ui.ActionBar.g5 g5Var = this.T0;
                        if (g5Var != null) {
                            g5Var.u(21);
                            if (this.r0 != null) {
                                this.T0.u(33);
                                this.T0.u(34);
                                this.T0.u(35);
                                this.T0.T(36);
                                this.T0.T(31);
                            }
                        }
                        org.telegram.ui.ActionBar.g5 g5Var2 = this.U0;
                        if (g5Var2 != null) {
                            g5Var2.setEnabled(!this.z1);
                        }
                        this.N.f(false, min);
                        this.p0.b(min);
                        this.k2.cancel();
                        this.f0.getImageReceiver().u0 = true;
                        this.f0.getImageReceiver().P0(false);
                        float U1 = org.telegram.messenger.g0.U1(this.m2, fArr);
                        fArr[0] = U1;
                        fArr[1] = 0.0f;
                        this.k2.setInterpolator(org.telegram.ui.Components.nr.j);
                        if (this.o2) {
                            this.k2.setDuration(0L);
                        } else {
                            this.k2.setDuration((long) ((U1 * 250.0f) / min));
                        }
                        this.d1.setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.A0));
                        if (!this.I0 && (currentItemView = this.o0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().t() instanceof org.telegram.ui.Components.t51) {
                                this.f0.b0 = false;
                            } else {
                                zu0 zu0Var = this.f0;
                                zu0Var.b0 = true;
                                zu0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.k2.addListener(new dv0(this, 5));
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
                    d4();
                    ValueAnimator valueAnimator = this.k2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        U4();
                        this.f.setTranslationY(this.f2);
                        this.r.setTranslationX(m4(this.g2, this.C6));
                        this.r.setTranslationY(n4(this.h2));
                        t5();
                    }
                } else {
                    if (!this.q2) {
                        if (this.T0 != null) {
                            if (w4()) {
                                this.T0.u(21);
                            } else {
                                this.T0.T(21);
                            }
                            if (this.r0 != null) {
                                this.T0.T(36);
                                this.T0.T(34);
                                this.T0.T(35);
                                this.T0.u(33);
                                this.T0.u(31);
                            }
                        }
                        org.telegram.ui.ActionBar.g5 g5Var3 = this.U0;
                        if (g5Var3 != null) {
                            g5Var3.setEnabled(false);
                        }
                        this.q2 = true;
                        org.telegram.messenger.ls.e().k(i7, Boolean.TRUE);
                        this.N.f(true, min);
                        this.p0.b(min);
                        this.o0.setCreateThumbFromParent(true);
                        this.o0.getAdapter().g();
                        this.k2.cancel();
                        float U12 = org.telegram.messenger.g0.U1(this.m2, fArr);
                        fArr[0] = U12;
                        fArr[1] = 1.0f;
                        cv0 cv0Var2 = this.v0;
                        if (cv0Var2 == null || cv0Var2.x.isEmpty()) {
                            this.k2.setInterpolator(org.telegram.ui.Components.nr.j);
                            this.k2.setDuration((long) (((1.0f - U12) * 250.0f) / min));
                        } else {
                            this.k2.setInterpolator(new x1.a());
                            this.k2.setDuration((long) ((((1.0f - U12) * 1.3f) * 250.0f) / min));
                        }
                        this.k2.addListener(new dv0(this, 4));
                        View m10 = this.c.m(0);
                        if (!this.P1 && m10 != null) {
                            this.O1 = true;
                            this.a.x0(((m10.getTop() - this.a.getMeasuredWidth()) - e4()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0), (int) this.k2.getDuration(), (Interpolator) this.k2.getInterpolator());
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
                    int i10 = layoutParams2.height;
                    layoutParams2.width = this.a.getMeasuredWidth();
                    float f16 = currentActionBarHeight + f14;
                    int i11 = (int) f16;
                    layoutParams2.height = i11;
                    if (i10 != i11) {
                        this.o0.requestLayout();
                    }
                    if (!this.k2.isRunning()) {
                        float L = (this.G1 && this.J1 == 2) ? (-(1.0f - this.T1)) * org.telegram.messenger.g0.L(50.0f) : 0.0f;
                        this.f.setTranslationX(org.telegram.messenger.g0.N(18.0f) - this.f.getLeft());
                        this.f.setTranslationY((((f16 - e4()) - org.telegram.messenger.g0.N(30.0f)) - this.f.getBottom()) + L);
                        this.r.setTranslationX(m4(org.telegram.messenger.g0.N(16.0f) - this.r.getLeft(), 0.0f));
                        this.r.setTranslationY(n4((((f16 - e4()) - org.telegram.messenger.g0.N(10.0f)) - this.r.getBottom()) + L));
                        t5();
                    }
                }
            } else {
                f10 = 2.0f;
                f11 = 18.0f;
            }
            boolean z12 = this.G1;
            if (z12 && this.J1 == 2) {
                float f17 = this.k6;
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / f10) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - (org.telegram.messenger.g0.p * 21.0f));
                this.f.setPivotY(r6.getMeasuredHeight());
                this.f.setScaleX(1.38f);
                this.f.setScaleY(1.38f);
                this.c2 = org.telegram.messenger.g0.W1(this.T1, 42, org.telegram.messenger.ls.U1) / 100.0f;
                this.d2 = 0.0f;
                cv0 cv0Var3 = this.v0;
                if (cv0Var3 != null) {
                    cv0Var3.setExpandProgress(1.0f);
                }
                di.t0 t0Var2 = this.w0;
                if (t0Var2 != null) {
                    t0Var2.setExpandProgress(1.0f);
                }
                this.f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(s4(), 0.0f, this.T1));
                this.Y.setTranslationX(org.telegram.messenger.g0.T1(f17, 0.0f, this.T1));
                this.Y.setTranslationY(org.telegram.messenger.g0.T1((float) Math.ceil(translationY2), 0.0f, this.T1));
                float measuredWidth = ((this.c2 * 100.0f) / 42.0f) * (this.Y.getMeasuredWidth() - org.telegram.messenger.g0.L(42.0f));
                this.i0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(16.0f) + measuredWidth);
                this.i0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(-10.0f) + measuredWidth);
                this.j0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.j0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(26.5f) + measuredWidth);
                this.k0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.k0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + measuredWidth);
                this.l0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.l0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + measuredWidth);
                this.Y.setScaleX(this.c2);
                this.Y.setScaleY(this.c2);
                this.o0.setAlpha(0.0f);
                this.o0.setVisibility(0);
                zu0 zu0Var2 = this.f0;
                float f18 = this.T1;
                float f19 = this.c2;
                zu0Var2.I = f18;
                zu0Var2.J = f19;
                zu0Var2.H = true;
                this.N.e(false, f18);
                this.actionBar.G(i0.a.f(this.T1, this.n6 != null ? -1 : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v8, this.A0), -1), false);
                org.telegram.ui.Components.vk0 vk0Var = this.L;
                if (vk0Var != null) {
                    vk0Var.b(i0.a.f(this.T1, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h8, this.A0), Color.argb(org.telegram.messenger.ls.J2, org.telegram.messenger.ls.e4, org.telegram.messenger.ls.e4, org.telegram.messenger.ls.e4)));
                }
                Drawable drawable = this.x;
                if (drawable != null) {
                    drawable.setColorFilter(this.n6 == null ? i0.a.f(this.T1, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.gd, this.A0), -1) : -1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.mr mrVar = this.J;
                if (mrVar != null) {
                    mrVar.a(this.T1);
                    this.f.invalidate();
                }
                org.telegram.ui.Components.mr mrVar2 = this.K;
                if (mrVar2 != null) {
                    mrVar2.a(this.T1);
                    this.f.invalidate();
                }
                w5(this.T1);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                layoutParams3.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.a.getMeasuredWidth() / this.c2, this.T1);
                layoutParams3.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.Q1 + currentActionBarHeight) / this.c2, this.T1);
                this.Y.requestLayout();
                t5();
            } else if (f14 <= f15) {
                if (z12) {
                    this.c2 = org.telegram.messenger.g0.W1(L3, 42, 96) / 100.0f;
                    this.d2 = 0.0f;
                    f12 = 1.0f;
                } else {
                    org.telegram.ui.Components.lg0 lg0Var2 = this.u0;
                    this.c2 = org.telegram.messenger.g0.T1(lg0Var2 != null ? lg0Var2.getHiddenAvatarSizeDp() : 24.0f, 96.0f, L3) / 100.0f;
                    f12 = 1.0f;
                    this.d2 = 1.0f - L3;
                }
                org.telegram.ui.Components.tf0 tf0Var = this.a0;
                if (tf0Var != null) {
                    if (this.G1) {
                        tf0Var.setAlpha(this.T1);
                    } else {
                        tf0Var.setAlpha(f12);
                    }
                }
                cv0 cv0Var4 = this.v0;
                if (cv0Var4 != null) {
                    cv0Var4.invalidate();
                }
                di.t0 t0Var3 = this.w0;
                if (t0Var3 != null) {
                    t0Var3.h = this.G1;
                    float l10 = Utilities.l((L3 - 0.3f) / 0.7f);
                    if (t0Var3.f != l10) {
                        t0Var3.f = l10;
                        t0Var3.invalidate();
                    }
                }
                float T1 = this.G1 ? org.telegram.messenger.g0.T1(p4(0), 1.12f, L3) : (0.12f * L3) + 1.0f;
                ValueAnimator valueAnimator2 = this.k2;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    this.Y.setScaleX(this.c2);
                    this.Y.setScaleY(this.c2);
                    d4();
                    this.Y.setTranslationY((float) Math.ceil(this.b2));
                    float L2 = (((this.c2 * 100.0f) / 42.0f) * org.telegram.messenger.g0.L(42.0f)) - org.telegram.messenger.g0.L(42.0f);
                    this.i0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(16.0f) + L2);
                    this.i0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(-10.0f) + L2);
                    this.j0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L2);
                    this.j0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(26.5f) + L2);
                    this.k0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L2);
                    this.k0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L2);
                    this.l0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L2);
                    this.l0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L2);
                } else {
                    ValueAnimator valueAnimator3 = this.k2;
                    dv0 dv0Var = this.e6;
                    valueAnimator3.removeListener(dv0Var);
                    this.k2.addListener(dv0Var);
                }
                float N = ((org.telegram.messenger.g0.N(8.0f) + (this.Y.getScaleY() * this.Y.getHeight())) * (this.G1 ? this.T1 : L3)) + ((float) Math.floor(translationY));
                this.f2 = com.google.android.gms.internal.vision.e2.z(1.0f, this.T1, 0.0f, (org.telegram.messenger.g0.L(7.0f) * L3) + org.telegram.messenger.g0.L(1.3f) + N);
                this.h2 = (((float) Math.floor(org.telegram.messenger.g0.p * 11.0f)) * L3) + N + org.telegram.messenger.g0.L(24.0f);
                float L4 = this.G1 ? (this.k6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f) : -org.telegram.messenger.g0.N(46.0f);
                xw0 xw0Var = this.F6;
                if (xw0Var != null) {
                    xw0Var.setAlpha((int) (255.0f * L3));
                }
                int measuredWidth2 = this.a.getMeasuredWidth();
                this.f.setScaleX(T1);
                this.f.setScaleY(T1);
                float T12 = this.G1 ? org.telegram.messenger.g0.T1(p4(1), 1.0f, L3) : 1.0f;
                this.r.setScaleX(T12);
                this.r.setScaleY(T12);
                C4(0, L3, false);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                float f20 = measuredWidth2 / f10;
                float min2 = f20 - (((Math.min(this.f.getExactWidth(), layoutParams4.width) * T1) * 0.5f) + layoutParams4.leftMargin);
                float f21 = ((FrameLayout.LayoutParams) this.r.getLayoutParams()).width;
                float paddingLeft = (this.v5 || this.r.getExactWidth() > (f21 - ((float) this.r.getPaddingLeft())) - ((float) this.r.getPaddingRight())) ? 0.0f : this.r.getPaddingLeft();
                float min3 = f20 - ((Math.min(this.r.getExactWidth(), f21) * 0.5f) + (r7.leftMargin + paddingLeft));
                this.e2 = min2;
                this.g2 = min3;
                this.C6 = paddingLeft;
                if (this.G1) {
                    min2 = org.telegram.messenger.g0.T1(q4(L4, 0, this.f), min2, L3);
                    min3 = org.telegram.messenger.g0.T1(q4(L4, 1, this.r), min3, L3);
                }
                ValueAnimator valueAnimator4 = this.k2;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    this.f.setTranslationX(min2);
                    this.f.setTranslationY(this.f2);
                    this.r.setTranslationX(m4(min3, this.C6 * L3));
                    this.r.setTranslationY(n4(this.h2));
                }
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i12 = layoutParams5.width;
                int min4 = Math.min(layoutParams5.width, (int) ((((org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.L(490.0f) : org.telegram.messenger.g0.q.x) - org.telegram.messenger.g0.L(f11)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams5.leftMargin)));
                layoutParams5.width = min4;
                if (min4 != i12) {
                    this.f.requestLayout();
                }
                t5();
            }
            ValueAnimator valueAnimator5 = this.k2;
            if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                C4(0, L3, true);
            }
        }
        z5(currentActionBarHeight);
        if (L3 >= 1.0f) {
            this.f0.setAlpha(1.0f);
        }
    }

    public final void B5() {
        float f10 = 0.0f;
        if (!this.q1 && !this.G1) {
            int e42 = e4();
            f10 = e42 > 0 ? c8.l9.a(1.0f - (this.Q1 / e42), 0.0f, 1.0f) : c8.l9.a((this.d2 - 0.6f) / 0.4f, 0.0f, 1.0f);
        }
        float f11 = this.G5;
        if (f11 != f10) {
            boolean z10 = ((f11 > 0.5f ? 1 : (f11 == 0.5f ? 0 : -1)) > 0) != ((f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1)) > 0);
            this.G5 = f10;
            pk pkVar = this.f;
            if (pkVar != null) {
                pkVar.setTextColor(this.J5);
            }
            bv0 bv0Var = this.r;
            if (bv0Var != null) {
                bv0Var.setTextColor(this.K5);
            }
            v5();
            if (z10) {
                org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.u4, Boolean.TRUE);
            }
            zw0 zw0Var = this.d1;
            if (zw0Var != null) {
                zw0Var.invalidate();
            }
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        E5();
        D5();
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
    public final void C4(int i7, float f10, boolean z10) {
        float scaleX;
        float f11;
        int i10;
        int ceil;
        ValueAnimator valueAnimator;
        if (this.Q1 > j4() || ((valueAnimator = this.k2) != null && valueAnimator.isRunning())) {
            scaleX = this.f.getScaleX();
        } else {
            if (f10 < 1.0f) {
                f11 = 1.12f;
                scaleX = 1.0f;
                int L = !org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.L(490.0f) : org.telegram.messenger.g0.q.x;
                org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
                int max = L - (((int) Math.max(org.telegram.messenger.g0.L(64.0f), (z4Var == null ? z4Var.t().getTargetPillWidth() : org.telegram.messenger.g0.L(46.0f)) + org.telegram.messenger.g0.L(18.0f))) * 2);
                int i11 = (int) (max / (i7 == 0 ? scaleX : 1.0f));
                int B = i7 == 0 ? i7 : org.telegram.messenger.o10.B(18.0f, 2, L);
                if (i7 == 0) {
                    i7 = (int) (B / f11);
                }
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.i;
                int W1 = org.telegram.messenger.g0.W1(nrVar.getInterpolation(f10), i11, i7);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i12 = layoutParams.width;
                layoutParams.width = (int) Math.ceil(W1);
                if (z10) {
                    layoutParams.width = Math.min(layoutParams.width, (int) (((L - org.telegram.messenger.g0.L(18.0f)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams.leftMargin)));
                }
                if (z10 && layoutParams.width != i12) {
                    this.f.requestLayout();
                }
                int W12 = org.telegram.messenger.g0.W1(nrVar.getInterpolation(f10), max, B);
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
        org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
        int max2 = L - (((int) Math.max(org.telegram.messenger.g0.L(64.0f), (z4Var2 == null ? z4Var2.t().getTargetPillWidth() : org.telegram.messenger.g0.L(46.0f)) + org.telegram.messenger.g0.L(18.0f))) * 2);
        int i112 = (int) (max2 / (i7 == 0 ? scaleX : 1.0f));
        if (i7 == 0) {
        }
        if (i7 == 0) {
        }
        org.telegram.ui.Components.nr nrVar2 = org.telegram.ui.Components.nr.i;
        int W13 = org.telegram.messenger.g0.W1(nrVar2.getInterpolation(f10), i112, i7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        int i122 = layoutParams3.width;
        layoutParams3.width = (int) Math.ceil(W13);
        if (z10) {
        }
        if (z10) {
            this.f.requestLayout();
        }
        int W122 = org.telegram.messenger.g0.W1(nrVar2.getInterpolation(f10), max2, B);
        FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) this.r.getLayoutParams();
        i10 = layoutParams22.width;
        ceil = (int) Math.ceil(W122);
        layoutParams22.width = ceil;
        if (i10 == ceil) {
        }
    }

    public final void C5() {
        vv0 vv0Var = this.O;
        if (vv0Var == null || this.b6 == 0) {
            return;
        }
        int topPanelShift = vv0Var.getTopPanelShift();
        int i7 = 0;
        if (topPanelShift > 0 && this.O.isAttachedToWindow()) {
            if (this.O.getParent() == this.a) {
                topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.O.getY()));
            }
            i7 = topPanelShift;
        }
        int i10 = this.b6 + i7;
        f5(i10, this.H5);
        f5(i10, this.Z5);
    }

    public final void D5() {
        if (this.H5 == null || this.Z5 == null) {
            return;
        }
        vv0 vv0Var = this.O;
        boolean z10 = vv0Var != null && vv0Var.getParent() == this.a && this.O.isAttachedToWindow();
        float max = Math.max(Math.min(this.G5, this.R5), this.W5);
        this.H5.setAlpha(z10 ? 0.0f : max);
        this.H5.setVisibility((z10 || max <= 0.0f) ? 8 : 0);
        View view = this.Z5;
        if (!z10) {
            max = 0.0f;
        }
        view.setAlpha(max);
        if (z10) {
            this.Z5.setTranslationY(-(this.O.getY() + this.a.getY()));
        }
    }

    public final void E4(boolean z10) {
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.e1));
        if (c22 == null) {
            return;
        }
        if (this.s2 && !org.telegram.messenger.np.L2(c22)) {
            if (!this.k1 || z10) {
                org.telegram.ui.Components.c5.r(this, false, this.F2, c22, this.E2 != null, true, false, true, new yt0(this, c22));
                return;
            } else {
                getMessagesController().r5(new n90(this, 6), this.e1);
                finishFragment();
                return;
            }
        }
        if (this.k1) {
            getMessagesController().r5(null, this.e1);
            if (org.telegram.ui.Components.lc.a(this)) {
                org.telegram.ui.Components.lc.d(this, false).j();
                return;
            }
            return;
        }
        if (this.l1) {
            org.telegram.ui.Components.c5.g0(this, this.e1, c22, null, this.E2, false, null, new na(this, 3), this.A0);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.A0);
        String N0 = org.telegram.messenger.hd.N0(2131753689, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("AreYouSureBlockContact2", null, 2131754116, org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name)));
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131753690, null), new tt0(this, 2));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, this.A0);
        }
    }

    public final void E5() {
        if (this.simpleActionBar == null || this.M5 == null) {
            return;
        }
        org.telegram.ui.Components.xf0 xf0Var = this.O5;
        if (xf0Var != null) {
            float l42 = l4();
            if (xf0Var.l != l42) {
                xf0Var.l = l42;
                xf0Var.a();
            }
        }
        int f10 = i0.a.f(l4(), this.I5, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.A0));
        if (this.L5 != f10) {
            this.L5 = f10;
            org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
            z4Var.m0 = true;
            z4Var.g0 = f10;
            z4Var.updateColors();
        }
        int A2 = this.N5.A2();
        if (this.Q5 != A2) {
            this.Q5 = A2;
            org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
            fh.g gVar = z4Var2.I;
            if (gVar != null) {
                gVar.updateColors();
                z4Var2.J.updateColors();
                z4Var2.K.updateColors();
            }
            z4Var2.invalidate();
            org.telegram.ui.ActionBar.j5 j5Var = z4Var2.R;
            if (j5Var != null) {
                j5Var.invalidate();
            }
        }
    }

    public final void F4(boolean z10) {
        boolean z11 = false;
        if (this.e1 != 0) {
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.e1));
            if (c22 != null) {
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.b2.m(c22, z10, z11, getParentActivity(), this.w2, getAccountInstance());
                return;
            }
            return;
        }
        if (this.f1 != 0) {
            if (getMessagesController().i1(this.f1, false, null) != null) {
                org.telegram.ui.Components.voip.b2.l(this.F2, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            TLRPC.Chat chat = this.F2;
            org.telegram.messenger.c accountInstance = getAccountInstance();
            if (getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.i70.K0(getParentActivity(), -chat.id, accountInstance, new org.telegram.ui.Components.tm(chat, this, accountInstance, 7));
        }
    }

    public final void F5(boolean z10) {
        vv0 vv0Var;
        if (this.T0 == null) {
            return;
        }
        boolean z11 = false;
        boolean z12 = !this.X5 && ((vv0Var = this.O) == null || !vv0Var.E0());
        boolean z13 = this.q2;
        g5(this.Q0, z12 && !z13 && this.M0, z10);
        g5(this.R0, z12 && !z13 && this.N0, z10);
        g5(this.S0, z12 && !z13 && this.O0, z10);
        vv0 vv0Var2 = this.O;
        boolean z14 = (vv0Var2 == null || vv0Var2.J == null || !vv0Var2.v0(vv0Var2.getClosestTab()) || this.O.E0()) ? false : true;
        g5(this.T0, z12, z10 && !z14);
        vv0 vv0Var3 = this.O;
        if (vv0Var3 != null) {
            boolean z15 = this.X5;
            if (z10 && !z14) {
                z11 = true;
            }
            if (vv0Var3.q2 != z15) {
                vv0Var3.q2 = z15;
                vv0Var3.R(z10, z11);
            }
        }
    }

    @Override // org.telegram.ui.ww
    public final /* synthetic */ boolean G() {
        return false;
    }

    public final void G4() {
        TLRPC.UserFull userFull = this.w2;
        if (userFull == null || !org.telegram.messenger.p10.c(userFull)) {
            if (this.F2 != null) {
                org.telegram.ui.Components.n30.h.a();
            }
            showDialog(new bi.n3(getParentActivity(), this.currentAccount, a(), null, null));
        } else {
            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
            if (T != null) {
                org.telegram.messenger.o10.u(org.telegram.messenger.hd.a0(null, null, 2131743497, org.telegram.messenger.n5.t(a())), org.telegram.ui.Components.lc.b0(T), R.raw.error, 36);
            }
        }
    }

    public final void G5() {
        TLRPC.User c22;
        if (!this.s1 || this.X0 == null || this.W0 == null || (c22 = getMessagesController().c2(Long.valueOf(this.e1))) == null) {
            return;
        }
        boolean z10 = org.telegram.messenger.p10.o(c22) != null;
        this.X0.setIcon(z10 ? R.drawable.menu_username_change : R.drawable.menu_username_set);
        this.X0.setText(org.telegram.messenger.hd.N0(z10 ? 2131746424 : 2131746423, null));
        this.W0.setVisibility(org.telegram.messenger.p10.o(c22) == null ? 8 : 0);
    }

    public final void H3() {
        org.telegram.ui.ActionBar.k kVar;
        if (this.O == null || (kVar = this.actionBar) == null) {
            return;
        }
        int i7 = kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
        int[] iArr = org.telegram.ui.Components.jt0.t2;
        int z10 = org.telegram.messenger.f3.z(6.666f, ri.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()), currentActionBarHeight);
        int c10 = ri.a.c(i7) + currentActionBarHeight + z10;
        this.a6 = c10;
        this.O.n1(z10, c10, ri.a.c(this.P6), this.P6 + this.N6);
        this.b6 = org.telegram.messenger.g0.L(44.0f) + currentActionBarHeight;
        C5();
        P3();
    }

    public final void H4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().m(this.F2.id, getUserConfig().f(), 0, null, this, true, new b80(this, z10, zArr, 7), new a3.g(this, zArr, z10, this.parentLayout.getLastFragment(), 8), null);
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.L4, new Object[0]);
    }

    public final void H5(boolean z10, boolean z11) {
        if (this.d == null) {
            if (z10) {
                K5(false);
            }
            N5();
            return;
        }
        if (!z11 && this.a.isInLayout()) {
            qu0 qu0Var = this.a;
            if (qu0Var.H) {
                qu0Var.post(new org.telegram.ui.Components.rp0(12, this, z10));
                return;
            }
            return;
        }
        xv0 xv0Var = new xv0(this);
        xv0Var.b = this.O2;
        xv0Var.f(xv0Var.c);
        xv0Var.e.clear();
        xv0Var.f.clear();
        xv0Var.e.addAll(this.U4);
        xv0Var.f.addAll(this.V4);
        xv0Var.g = this.x4;
        xv0Var.h = this.y4;
        if (z10) {
            K5(false);
        }
        W4();
        N5();
        xv0Var.f(xv0Var.d);
        try {
            v4.o.c(xv0Var, true).c(this.d);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.d.f();
        }
        int i7 = this.r6;
        if (i7 >= 0) {
            this.c.h1(i7, this.s6 - this.a.getPaddingTop());
        }
        org.telegram.messenger.g0.Z3(this.a);
    }

    @Override // org.telegram.ui.Components.w30
    public final void I(float f10) {
        org.telegram.ui.Cells.c4 c4Var = this.h0;
        if (c4Var == null) {
            return;
        }
        c4Var.setProgress(f10);
        this.o0.O(this.L2, f10);
    }

    public final int I3(int i7, Boolean bool) {
        if (this.n6 == null) {
            return i7;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.s8, this.A0);
        int f10 = i0.a.f(0.5f, this.n6.m(org.telegram.ui.ActionBar.m6.I.q()), this.n6.n(org.telegram.ui.ActionBar.m6.I.q()));
        if (org.telegram.ui.ActionBar.m6.e1(w02)) {
            return org.telegram.ui.ActionBar.m6.D(org.telegram.ui.ActionBar.m6.I.q(), w02, f10, i7, (bool == null || bool.booleanValue()) ? f10 : org.telegram.ui.ActionBar.m6.r1(0.7f, f10));
        }
        return (bool == null || bool.booleanValue()) ? f10 : org.telegram.ui.ActionBar.m6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.m6.r1(0.7f, f10));
    }

    public final void I4(View view, float f10, float f11, boolean z10) {
        float f12;
        float f13;
        long j3;
        long j10 = this.i1;
        if (j10 == 0) {
            j10 = this.e1;
            if (j10 == 0) {
                j10 = -this.f1;
            }
        }
        long j11 = j10;
        boolean u22 = getMessagesController().u2(j11, this.g1, null);
        if (z10 && (this.q1 || u22)) {
            boolean z11 = !u22;
            getNotificationsController().G(j11, this.g1, z11);
            org.telegram.ui.Components.lc.A(this, z11, null).j();
            y5();
            this.a0.setNotifications(u22);
            return;
        }
        if ((z10 || !org.telegram.messenger.hd.a0 || f10 > org.telegram.messenger.g0.L(76.0f)) && (org.telegram.messenger.hd.a0 || f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
            org.telegram.ui.Components.ro roVar = new org.telegram.ui.Components.ro(getParentActivity(), this.currentAccount, null, true, new a8.va(this, j11, 7), this.A0);
            roVar.e(j11, this.g1, this.n5);
            if (org.telegram.messenger.g0.Q1()) {
                ViewGroup view2 = this.parentLayout.getView();
                f12 = view2.getX() + view2.getPaddingLeft() + f10;
                f13 = view2.getY() + view2.getPaddingTop() + f11;
            } else {
                f12 = f10;
                f13 = f11;
            }
            if (z10) {
                f13 += this.a0.getHeight() - org.telegram.messenger.g0.L(12.0f);
            }
            roVar.d(this, view, f12, f13, z10);
            return;
        }
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
        boolean z12 = j5Var.e.h;
        boolean z13 = !z12;
        boolean D = getNotificationsController().D(j11, null, false, false);
        String v = org.telegram.messenger.ys.v(j11, this.g1, false);
        if (z12) {
            SharedPreferences.Editor edit = org.telegram.messenger.np.u1(this.currentAccount).g7.edit();
            if (D) {
                edit.putInt("notify2_" + v, 2);
                j3 = 1;
            } else {
                edit.remove("notify2_" + v);
                j3 = 0L;
            }
            getNotificationsController().N(j11);
            if (this.g1 == 0) {
                getMessagesStorage().E1(j11, j3);
                TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j11);
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
            SharedPreferences.Editor edit2 = org.telegram.messenger.np.u1(this.currentAccount).g7.edit();
            if (D) {
                edit2.remove("notify2_" + v);
            } else {
                edit2.putInt("notify2_" + v, 0);
            }
            if (this.g1 == 0) {
                getMessagesStorage().E1(j11, 0L);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().R.f(j11);
                if (dialog2 != null) {
                    dialog2.notify_settings = new TLRPC.TL_peerNotifySettings();
                }
            }
            edit2.apply();
        }
        y5();
        getNotificationsController().c0(j11, this.g1, true);
        j5Var.setChecked(z13);
        J5(true);
    }

    public final void I5() {
        if (this.c0 == null || this.r == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        boolean z10 = this.G1;
        if (z10 && this.J1 == 2 && this.Y != null) {
            this.c0.setAlpha(this.T1);
            this.c0.f(org.telegram.messenger.g0.L(74.0f) + this.a.getMeasuredWidth(), e4() - org.telegram.messenger.g0.L(74.0f));
            return;
        }
        if (z10) {
            this.c0.setAlpha(this.T1);
        }
        float f10 = currentActionBarHeight;
        float L = this.Q1 + f10 + org.telegram.messenger.g0.L(74.0f);
        float min = Math.min(e4(), L - f10);
        this.c0.f(L - min, min - org.telegram.messenger.g0.L(74.0f));
    }

    @Override // org.telegram.ui.Components.xr0
    public final void J() {
        X4(false);
    }

    public final void J3() {
        int f10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || this.f == null || this.d1 == null || this.T0 == null || this.Q0 == null || this.R0 == null || this.S0 == null || this.p0 == null) {
            return;
        }
        Float valueOf = Float.valueOf(this.W5);
        fv0 fv0Var = this.Y5;
        fv0Var.getClass();
        fv0Var.a(kVar, valueOf);
        if (this.W5 > 0.0f || this.l2 <= 0.0f) {
            return;
        }
        pk pkVar = this.f;
        int i7 = -1;
        if (this.n6 != null) {
            f10 = -1;
        } else {
            f10 = i0.a.f(this.l2, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.mi, this.A0), -1);
        }
        pkVar.setTextColor(f10);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (this.n6 == null) {
            i7 = i0.a.f(this.l2, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v8, this.A0), -1);
        }
        kVar2.G(i7, false);
    }

    public final void J4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.e1 != 0) {
                TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.e1));
                if (c22 == null) {
                    return;
                }
                if (this.G2 == null || (userFull = this.w2) == null || TextUtils.isEmpty(userFull.about)) {
                    str = String.format("https://" + getMessagesController().X2 + "/%s", org.telegram.messenger.p10.o(c22));
                } else {
                    str = String.format("%s https://" + getMessagesController().X2 + "/%s", this.w2.about, org.telegram.messenger.p10.o(c22));
                }
            } else if (this.f1 != 0) {
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f1));
                if (O0 == null) {
                    return;
                }
                TLRPC.ChatFull chatFull = this.v2;
                if (chatFull == null || TextUtils.isEmpty(chatFull.about)) {
                    str = String.format("https://" + getMessagesController().X2 + "/%s", org.telegram.messenger.v3.K(O0, false));
                } else {
                    str = String.format("%s\nhttps://" + getMessagesController().X2 + "/%s", this.v2.about, org.telegram.messenger.v3.K(O0, false));
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
            startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131752970, null)), 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
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
    public final void J5(boolean z10) {
        int i7;
        lw0 lw0Var;
        if (z10 && (i7 = this.O3) >= 0 && (lw0Var = this.d) != null) {
            lw0Var.g(i7);
        }
        org.telegram.ui.Components.tf0 tf0Var = this.a0;
        if (tf0Var == null || this.s1) {
            return;
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(this.currentAccount).g7;
        long j3 = this.i1;
        if (j3 == 0) {
            j3 = this.e1;
            if (j3 == 0) {
                j3 = -this.f1;
            }
        }
        long j10 = j3;
        boolean z11 = false;
        String v = org.telegram.messenger.ys.v(j10, this.g1, false);
        boolean contains = sharedPreferences.contains("notify2_" + v);
        int c10 = org.telegram.messenger.f3.c("notify2_", v, sharedPreferences, 0);
        int c11 = org.telegram.messenger.f3.c("notifyuntil_", v, sharedPreferences, 0);
        if (c10 != 3 || c11 == Integer.MAX_VALUE) {
            if (c10 == 0) {
                if (!contains) {
                    z11 = getNotificationsController().D(j10, null, false, false);
                    tf0Var.setNotifications(z11);
                }
                z11 = true;
                tf0Var.setNotifications(z11);
            }
        }
    }

    public final void K3() {
        if (this.f6 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.k2;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.k2.cancel();
        }
        float l10 = Utilities.l(this.Q1 / this.F1);
        if (l10 <= 0.0f) {
            return;
        }
        float f10 = (l10 - 0.5f) / 0.5f;
        float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.L(21.0f));
        this.c2 = org.telegram.messenger.g0.T1(0.42f, this.f6[0], l10);
        this.a2 = org.telegram.messenger.g0.T1(this.k6, this.f6[1], l10);
        this.b2 = org.telegram.messenger.g0.T1(translationY, this.f6[2], l10);
        this.d2 = org.telegram.messenger.g0.T1(this.f6[11], 0.0f, l10);
        this.Y.setScaleX(this.c2);
        this.Y.setScaleY(this.c2);
        this.Y.setTranslationX(this.a2);
        this.Y.setTranslationY(this.b2);
        org.telegram.ui.Components.xu0 xu0Var = this.T;
        if (xu0Var != null) {
            xu0Var.setAlpha(l10);
        }
        this.f0.setAlpha(1.0f);
        this.Y.setAlpha(1.0f);
        cv0 cv0Var = this.v0;
        if (cv0Var != null) {
            cv0Var.invalidate();
        }
        di.t0 t0Var = this.w0;
        if (t0Var != null) {
            t0Var.e = org.telegram.messenger.g0.T1(0.0f, this.f6[4], f10);
            this.w0.f = org.telegram.messenger.g0.T1(0.0f, this.f6[5], l10);
            di.t0 t0Var2 = this.w0;
            t0Var2.h = true;
            t0Var2.invalidate();
        }
        xw0 xw0Var = this.F6;
        if (xw0Var != null) {
            xw0Var.setAlpha((int) org.telegram.messenger.g0.T1(0.0f, this.f6[6], l10));
        }
        float L = (((this.c2 * 100.0f) / 42.0f) * org.telegram.messenger.g0.L(42.0f)) - org.telegram.messenger.g0.L(42.0f);
        this.i0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(16.0f) + L);
        this.i0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(-10.0f) + L);
        this.j0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
        this.j0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(26.5f) + L);
        this.k0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
        this.k0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L);
        this.l0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
        this.l0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L);
        float T1 = org.telegram.messenger.g0.T1(p4(0), this.f6[7], l10);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - (org.telegram.messenger.g0.p * 21.0f)))) + org.telegram.messenger.g0.L(1.3f);
        float N = org.telegram.messenger.g0.N(22.7f) + floor;
        this.f2 = org.telegram.messenger.g0.T1(floor, this.f6[8], l10);
        this.h2 = org.telegram.messenger.g0.T1(N, this.f6[9], l10);
        float L2 = (this.k6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f);
        float T12 = org.telegram.messenger.g0.T1(q4(L2, 0, this.f), this.f6[12], l10);
        float T13 = org.telegram.messenger.g0.T1(q4(L2 + this.u5, 1, this.r) - this.u5, this.f6[13], l10);
        this.f.setTranslationX(T12);
        this.f.setTranslationY(this.f2);
        this.r.setTranslationX(this.u5 + T13);
        this.r.setTranslationY(this.h2);
        this.e2 = T12;
        this.g2 = T13;
        this.f.setScaleX(T1);
        this.f.setScaleY(T1);
        float T14 = org.telegram.messenger.g0.T1(p4(1), 1.0f, l10);
        this.r.setScaleX(T14);
        this.r.setScaleY(T14);
        t5();
        z5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0));
        C4((int) this.f6[10], l10, true);
        org.telegram.ui.Components.tf0 tf0Var = this.a0;
        if (tf0Var != null) {
            tf0Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, this.f6[3], f10));
        }
    }

    public final void K4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.M3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f1);
            bundle.putLong("user_id", this.e1);
            presentFragment(new ci.j0(bundle));
            return;
        }
        if (view2.getTag() == null || ((Integer) view2.getTag()).intValue() != this.V2) {
            return;
        }
        if (this.e1 == getUserConfig().e()) {
            presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
        } else if (org.telegram.messenger.p10.c(this.w2)) {
            org.telegram.messenger.o10.u(org.telegram.messenger.hd.a0(null, null, 2131743497, org.telegram.messenger.n5.t(this.e1)), org.telegram.ui.Components.lc.b0(this), R.raw.error, 36);
        } else {
            showDialog(new bi.n3(getParentActivity(), this.currentAccount, this.e1, null, null));
        }
    }

    public final void K5(boolean z10) {
        int i7;
        TLRPC.UserStatus userStatus;
        boolean z11;
        int i10 = 0;
        this.C2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.D2.clear();
        TLRPC.ChatFull chatFull = this.v2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z11 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z11 || chatFull.participants_count <= 200) {
                return;
            }
            this.C2 = chatFull.online_count;
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i10 < this.v2.participants.participants.size()) {
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.v2.participants.participants.get(i10).user_id));
            if (c22 != null && (userStatus = c22.status) != null && ((userStatus.expires > currentTime || c22.id == getUserConfig().e()) && c22.status.expires > 10000)) {
                this.C2++;
            }
            this.D2.add(Integer.valueOf(i10));
            if (c22 != null) {
                if (c22.bot) {
                    i7 = -110;
                } else if (c22.self) {
                    i7 = 50000 + currentTime;
                } else {
                    TLRPC.UserStatus userStatus2 = c22.status;
                    if (userStatus2 != null) {
                        i7 = userStatus2.expires;
                    }
                }
                i10 = com.google.android.gms.internal.vision.e2.f(i7, i10, 1, arrayList);
            }
            i7 = TLObject.FLAG_31;
            i10 = com.google.android.gms.internal.vision.e2.f(i7, i10, 1, arrayList);
        }
        try {
            Collections.sort(this.D2, Comparator$-EL.reversed(Comparator$-CC.comparingInt(new se(arrayList, 1))));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (z10 && this.d != null && this.x4 > 0) {
            org.telegram.messenger.g0.Z3(this.a);
        }
        if (this.O == null || this.N4 == -1) {
            return;
        }
        if ((this.D2.size() > 5 || this.W4 == 2) && this.W4 != 1) {
            this.O.m1(this.D2, this.v2);
        }
    }

    public final float L3() {
        return Utilities.l((this.Q1 - e4()) / k4());
    }

    public final void L4() {
        org.telegram.ui.Components.oh0 oh0Var;
        if (this.e1 == 0) {
            P4();
            return;
        }
        if (this.r0 == null) {
            O4();
            return;
        }
        TLRPC.User c22 = org.telegram.messenger.np.u1(this.currentAccount).c2(Long.valueOf(org.telegram.messenger.k10.i(this.currentAccount).e()));
        if (c22 == null) {
            c22 = org.telegram.messenger.k10.i(this.currentAccount).f();
        }
        if (c22 == null) {
            return;
        }
        org.telegram.ui.Components.x30 x30Var = this.r0;
        TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
        x30Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new n90(this, 27), new q5(this, 13), 0);
        this.V.M(0);
        this.V.P(43);
        this.W.M(0);
        this.W.P(43);
        org.telegram.ui.Components.tf0 tf0Var = this.a0;
        if (tf0Var != null) {
            org.telegram.ui.Components.qf0 i7 = org.telegram.ui.Components.tf0.i(14, tf0Var.a);
            if (i7 != null && (oh0Var = i7.k) != null) {
                oh0Var.start();
            }
        } else {
            this.s.d();
        }
        org.telegram.ui.Cells.n8 n8Var = this.N2;
        if (n8Var != null) {
            n8Var.getImageView().d();
        }
    }

    public final void L5() {
        CharSequence charSequence;
        bv0 bv0Var = this.r;
        if (bv0Var == null) {
            return;
        }
        if ((!this.X5 || (charSequence = this.c6) == null) && (!this.A6 || (charSequence = this.z6) == null)) {
            charSequence = this.y6;
        }
        if (!bv0Var.o(charSequence, !this.G1) || this.fragmentView == null) {
            return;
        }
        B4(false);
    }

    public final void M3() {
        this.b2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.L(21.0f));
        this.c2 = 1.38f;
        this.d2 = 0.0f;
        d4();
        U4();
        C4(0, 1.0f, true);
        this.e2 = (this.a.getMeasuredWidth() / 2.0f) - (((this.f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin);
        this.g2 = (this.a.getMeasuredWidth() / 2.0f) - ((this.r.getExactWidth() * 0.5f) + (((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin + (this.v5 ? 0 : this.r.getPaddingLeft())));
        this.C6 = this.v5 ? 0.0f : this.r.getPaddingLeft();
        if (this.J1 != 2) {
            this.v0.setAlpha(1.0f);
        }
        this.Y.setAlpha(1.0f);
        this.f0.setAlpha(1.0f);
    }

    public final void M4() {
        Bundle k10 = a8.p0.k("addToGroup", true);
        k10.putLong("chatId", this.F2.id);
        z40 z40Var = new z40(k10);
        TLRPC.ChatFull chatFull = this.v2;
        z40Var.J = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i7 = 0; i7 < this.v2.participants.participants.size(); i7++) {
                hVar.k(null, this.v2.participants.participants.get(i7).user_id);
            }
            z40Var.K = hVar;
        }
        z40Var.y = new tt0(this, 0);
        presentFragment(z40Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(73:35|(1:290)(1:39)|(1:41)(1:289)|42|(3:44|(1:46)(1:48)|47)|49|(1:51)|52|(1:54)|55|(1:57)|58|(1:60)(1:288)|61|(4:63|(1:286)(1:67)|68|(58:70|71|(1:73)|74|(1:(1:77)(50:(1:283)(1:81)|82|(1:86)|(1:279)(1:92)|93|(2:95|(2:97|(1:99))(2:219|(1:226)(1:225)))(2:227|(1:229)(2:230|(1:278)(2:236|(1:238)(2:239|(2:241|(1:243)(1:244))(40:245|(1:247)(1:277)|248|(1:276)(1:262)|263|(2:265|(4:267|(1:275)(1:271)|272|(1:274)))|101|(1:218)(1:105)|106|107|108|(1:110)|111|(1:113)|114|(3:116|(1:118)|119)(1:215)|120|(1:122)(1:214)|123|(3:125|(1:127)|128)(1:213)|129|(3:209|(1:211)|212)(2:133|(1:135)(1:208))|136|(2:204|(1:206)(1:207))(1:140)|(1:203)(1:146)|147|(1:202)|150|(2:152|(1:154))|155|(2:157|(1:159))|160|(3:162|(2:164|(1:190)(1:170))(1:191)|171)(4:192|(1:201)(1:198)|199|200)|172|(1:174)|175|(1:189)(1:181)|182|(1:184)|185)))))|100|101|(1:103)|218|106|107|108|(0)|111|(0)|114|(0)(0)|120|(0)(0)|123|(0)(0)|129|(1:131)|209|(0)|212|136|(1:138)|204|(0)(0)|(1:142)|203|147|(0)|202|150|(0)|155|(0)|160|(0)(0)|172|(0)|175|(2:177|179)|189|182|(0)|185))|284|82|(50:84|86|(2:88|90)|279|93|(0)(0)|100|101|(0)|218|106|107|108|(0)|111|(0)|114|(0)(0)|120|(0)(0)|123|(0)(0)|129|(0)|209|(0)|212|136|(0)|204|(0)(0)|(0)|203|147|(0)|202|150|(0)|155|(0)|160|(0)(0)|172|(0)|175|(0)|189|182|(0)|185)|281|86|(0)|279|93|(0)(0)|100|101|(0)|218|106|107|108|(0)|111|(0)|114|(0)(0)|120|(0)(0)|123|(0)(0)|129|(0)|209|(0)|212|136|(0)|204|(0)(0)|(0)|203|147|(0)|202|150|(0)|155|(0)|160|(0)(0)|172|(0)|175|(0)|189|182|(0)|185))(1:287)|285|71|(0)|74|(0)|284|82|(0)|281|86|(0)|279|93|(0)(0)|100|101|(0)|218|106|107|108|(0)|111|(0)|114|(0)(0)|120|(0)(0)|123|(0)(0)|129|(0)|209|(0)|212|136|(0)|204|(0)(0)|(0)|203|147|(0)|202|150|(0)|155|(0)|160|(0)(0)|172|(0)|175|(0)|189|182|(0)|185) */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0659, code lost:
    
        if (r32.v2.can_view_participants != false) goto L339;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0858 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M5(boolean z10) {
        Object obj;
        boolean z11;
        String str;
        CharSequence G;
        TLRPC.ChatParticipants chatParticipants;
        boolean z12;
        CharSequence charSequence;
        boolean l10;
        boolean z13;
        org.telegram.messenger.gc m10;
        org.telegram.messenger.gc m11;
        org.telegram.messenger.gc gcVar;
        org.telegram.messenger.gc gcVar2;
        org.telegram.messenger.gc gcVar3;
        View m12;
        TLRPC.Chat chat;
        org.telegram.messenger.gc gcVar4;
        int i7;
        TLRPC.VideoSize videoSize;
        org.telegram.ui.Components.t51 t51Var;
        org.telegram.messenger.gc gcVar5;
        TLRPC.User user;
        org.telegram.messenger.gc gcVar6;
        TLRPC.User user2;
        TLRPC.UserStatus userStatus;
        boolean z14;
        org.telegram.ui.ActionBar.z4 z4Var;
        xw0 xw0Var;
        Drawable drawable;
        boolean z15;
        boolean z16;
        boolean z17;
        org.telegram.ui.Components.bh bhVar;
        String str2;
        TL_stars.Tl_starsRating tl_starsRating;
        TL_stars.Tl_starsRating tl_starsRating2;
        org.telegram.messenger.gc gcVar7;
        cx cxVar;
        xv xvVar;
        if (this.Y == null || this.f == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var == null || r4Var.getFragmentStack().size() < 2) {
            obj = null;
        } else {
            Object obj2 = (org.telegram.ui.ActionBar.g2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            obj = obj2 instanceof org.telegram.ui.Components.bh ? obj2 : null;
            if (obj2 instanceof me0) {
                obj2 = ((me0) obj2).K;
            }
            if ((obj2 instanceof cx) && (xvVar = (cxVar = (cx) obj2).H3) != null) {
                ew ewVar = xvVar.a;
                if (com.google.android.gms.internal.vision.e2.s(ewVar)) {
                    this.l5 = cxVar;
                    obj = ewVar;
                }
            }
        }
        if (obj instanceof bn) {
            bn bnVar = (bn) obj;
            if (bnVar.p1 != null && bnVar.g4 == 8) {
                z11 = true;
                this.v5 = false;
                this.w5 = false;
                str = "";
                if (this.e1 == 0) {
                    TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.e1));
                    if (c22 == null) {
                        return;
                    }
                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                    boolean z18 = userProfilePhoto != null && userProfilePhoto.personal;
                    TLRPC.FileLocation fileLocation = userProfilePhoto != null ? userProfilePhoto.photo_big : null;
                    this.q0.r(c22);
                    org.telegram.messenger.cp cpVar = this.n6;
                    org.telegram.messenger.cp a10 = org.telegram.messenger.cp.a(c22.emoji_status);
                    this.n6 = a10;
                    if (a10 == null) {
                        int m13 = org.telegram.messenger.p10.m(c22);
                        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(this.currentAccount).u4;
                        this.n6 = dpVar == null ? null : dpVar.d(m13);
                    }
                    if (cpVar != this.n6) {
                        T5();
                    }
                    zw0 zw0Var = this.d1;
                    if (zw0Var != null) {
                        zw0Var.b(org.telegram.messenger.p10.n(c22), c22.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    org.telegram.ui.Components.xu0 xu0Var = this.T;
                    if (xu0Var != null) {
                        xu0Var.b.a(this.n6);
                        xu0Var.invalidate();
                    }
                    TLRPC.EmojiStatus emojiStatus = c22.emoji_status;
                    e5(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null);
                    org.telegram.messenger.gc m14 = org.telegram.messenger.gc.m(org.telegram.messenger.k10.t0, 0, c22);
                    org.telegram.messenger.gc m15 = org.telegram.messenger.gc.m(org.telegram.messenger.k10.t0, 1, c22);
                    org.telegram.messenger.gc m16 = org.telegram.messenger.gc.m(org.telegram.messenger.k10.t0, 4, c22);
                    TLRPC.UserFull userFull = this.w2;
                    if (userFull != null) {
                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                        videoSize = org.telegram.messenger.w7.R((userProfilePhoto2 == null || !userProfilePhoto2.personal) ? userFull.profile_photo : userFull.personal_photo);
                        if (videoSize != null) {
                            t51Var = new org.telegram.ui.Components.t51(videoSize, c22.premium, 2);
                            org.telegram.messenger.gc C = this.o0.C(m15, m14);
                            if (this.J2 == null) {
                                this.o0.H(t51Var, m14, m15, z10);
                            }
                            if (this.K2 == null) {
                                if (videoSize != null) {
                                    this.f0.setImageDrawable(t51Var);
                                } else {
                                    if (m16 == null || c22.photo.personal) {
                                        user = c22;
                                        gcVar6 = m15;
                                        zu0 zu0Var = this.f0;
                                        zu0Var.a.u0(C, "g", m14, "100_100", gcVar6, "50_50", this.q0, 0L, null, user, 1);
                                        gcVar5 = m14;
                                        zu0Var.d();
                                    } else {
                                        this.f0.getImageReceiver().z1 = true;
                                        zu0 zu0Var2 = this.f0;
                                        user = c22;
                                        gcVar6 = m15;
                                        zu0Var2.a.u0(m16, "avatar", m14, "50_50", gcVar6, "50_50", this.q0, 0L, null, user, 1);
                                        zu0Var2.d();
                                        gcVar5 = m14;
                                    }
                                    if ((gcVar6 != null && this.P2 != -1) || (gcVar6 == null && this.P2 == -1)) {
                                        H5(false, false);
                                        B4(true);
                                    }
                                    if (gcVar5 != null || ((gcVar7 = this.C0) != null && gcVar5.s == gcVar7.s)) {
                                        user2 = user;
                                    } else {
                                        this.C0 = gcVar5;
                                        TLRPC.User user3 = user;
                                        getFileLoader().V(gcVar5, user3, null, 0, 1);
                                        user2 = user3;
                                    }
                                    CharSequence q10 = org.telegram.messenger.p10.q(user2);
                                    if (user2.id == getUserConfig().e()) {
                                        long j3 = user2.id;
                                        if (j3 == 489000) {
                                            str = org.telegram.messenger.hd.N0(2131743371, null);
                                        } else if (j3 == 333000 || j3 == 777000 || j3 == 42777) {
                                            str = org.telegram.messenger.hd.N0(2131745365, null);
                                        } else if (org.telegram.messenger.np.L2(user2)) {
                                            str = org.telegram.messenger.hd.N0(2131744082, null);
                                        } else if (this.s2) {
                                            int i10 = user2.bot_active_users;
                                            str = i10 != 0 ? org.telegram.messenger.hd.H(',', "BotUsers", i10) : org.telegram.messenger.p10.e(user2);
                                        } else {
                                            boolean[] zArr = this.K0;
                                            zArr[0] = false;
                                            str = org.telegram.messenger.hd.d0(this.currentAccount, user2, zArr, z18 ? new boolean[1] : null);
                                            boolean z19 = (zArr[0] || getUserConfig().q() || (userStatus = user2.status) == null || (!(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) || !userStatus.by_me) ? false : true;
                                            bv0 bv0Var = this.r;
                                            z14 = z19;
                                            if (bv0Var != null) {
                                                z14 = z19;
                                                if (!this.X5) {
                                                    int i11 = (zArr[0] && this.n6 == null) ? org.telegram.ui.ActionBar.m6.si : org.telegram.ui.ActionBar.m6.B8;
                                                    bv0Var.setTag(Integer.valueOf(i11));
                                                    z14 = z19;
                                                    if (!this.q2) {
                                                        this.r.setTextColor(I3(org.telegram.ui.ActionBar.m6.w0(i11, this.A0), Boolean.valueOf(zArr[0])));
                                                        z14 = z19;
                                                    }
                                                }
                                            }
                                            TLRPC.UserProfilePhoto userProfilePhoto3 = user2.photo;
                                            this.w5 = userProfilePhoto3 == null && userProfilePhoto3.personal;
                                            q10 = org.telegram.messenger.j6.m(q10, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                            if (z11) {
                                                this.f0.setAnimateFromImageReceiver(((bn) obj).p1.getAvatarImageView().getImageReceiver());
                                            }
                                            this.f.l(q10, false);
                                            z4Var = this.simpleActionBar;
                                            if (z4Var != null) {
                                                z4Var.setTitle(q10);
                                            }
                                            this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                                            this.r.setRightDrawableInside(true);
                                            bv0 bv0Var2 = this.r;
                                            if (z14) {
                                                if (this.F6 == null) {
                                                    xw0 xw0Var2 = new xw0(org.telegram.messenger.hd.N0(2131744647, null));
                                                    this.F6 = xw0Var2;
                                                    xw0Var2.setAlpha((int) (Math.min(1.0f, this.Q1 / j4()) * 255.0f));
                                                    this.F6.a(i0.a.f(this.l2, org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.b(0.18f, -0.1f, this.c1)), 603979775));
                                                }
                                                xw0Var = this.F6;
                                            } else {
                                                xw0Var = null;
                                            }
                                            bv0Var2.i(xw0Var);
                                            this.r.setRightDrawableOnClick(z14 ? new au0(this, 7) : null);
                                            if (this.E2 != null) {
                                                if (this.x == null) {
                                                    this.x = org.telegram.ui.ActionBar.m6.l4.getConstantState().newDrawable().mutate();
                                                }
                                                drawable = this.x;
                                            } else {
                                                drawable = null;
                                            }
                                            this.f.setRightDrawableOutside(false);
                                            z15 = user2.scam;
                                            if (!z15 || user2.fake) {
                                                pk pkVar = this.f;
                                                int i12 = !z15 ? 1 : 0;
                                                if (this.L == null) {
                                                    org.telegram.ui.Components.vk0 vk0Var = new org.telegram.ui.Components.vk0(i12);
                                                    this.L = vk0Var;
                                                    vk0Var.b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h8, this.A0));
                                                }
                                                pkVar.j(this.L);
                                                this.n = org.telegram.messenger.hd.N0(2131745666, null);
                                            } else if (user2.verified) {
                                                this.f.j(t4());
                                                this.n = org.telegram.messenger.hd.N0(2131754738, null);
                                            } else {
                                                this.f.j(null);
                                                this.n = null;
                                            }
                                            if (!org.telegram.messenger.np.L2(user2) || org.telegram.messenger.n5.f(user2.emoji_status) == 0) {
                                                getMessagesController().getClass();
                                                if (org.telegram.messenger.np.H2(user2)) {
                                                    this.f.i(i4(null, true));
                                                    this.h = org.telegram.messenger.hd.N0(2131754801, null);
                                                    z16 = true;
                                                    z17 = false;
                                                } else {
                                                    this.f.i(null);
                                                    this.h = null;
                                                    z16 = false;
                                                    z17 = false;
                                                }
                                            } else {
                                                this.f.i(i4(user2.emoji_status, true));
                                                this.h = org.telegram.messenger.hd.N0(2131754801, null);
                                                z17 = true;
                                                z16 = false;
                                            }
                                            if (drawable == null || this.E2 != null || user2.bot_verification_icon == 0) {
                                                this.f.setLeftDrawableOutside(false);
                                            } else {
                                                this.f.setLeftDrawableOutside(true);
                                                drawable = g4(user2.bot_verification_icon);
                                            }
                                            this.f.setLeftDrawable(drawable);
                                            if (!z17 || z16) {
                                                this.f.setRightDrawableOutside(true);
                                            }
                                            if (user2.self) {
                                                getMessagesController().getClass();
                                                if (org.telegram.messenger.np.H2(user2)) {
                                                    this.f.setRightDrawableOnClick(new au0(this, 8));
                                                }
                                            }
                                            if (!user2.self) {
                                                getMessagesController().getClass();
                                                if (org.telegram.messenger.np.H2(user2)) {
                                                    pk pkVar2 = this.f;
                                                    pkVar2.setRightDrawableOnClick(new y(this, user2, pkVar2, 14));
                                                }
                                            }
                                            if (this.e1 == org.telegram.messenger.k10.i(this.currentAccount).n) {
                                                if (this.v5) {
                                                    TLRPC.UserFull userFull2 = this.w2;
                                                    if (userFull2 == null || (tl_starsRating = userFull2.stars_rating) == null || tl_starsRating.stars >= 0) {
                                                        str2 = null;
                                                        str = org.telegram.messenger.hd.N0(2131747632, null);
                                                    } else {
                                                        str2 = null;
                                                        str = org.telegram.messenger.hd.N0(2131744930, null).toLowerCase(Locale.ROOT);
                                                    }
                                                } else {
                                                    str2 = null;
                                                }
                                                this.z6 = org.telegram.messenger.hd.N0(2131750830, str2);
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                                                spannableStringBuilder.append((CharSequence) " d ");
                                                TLRPC.UserProfilePhoto userProfilePhoto4 = user2.photo;
                                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0((userProfilePhoto4 != null && userProfilePhoto4.personal && userProfilePhoto4.has_video) ? 2131751675 : 2131751676, null));
                                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.us(), str.length() + 1, str.length() + 2, 0);
                                                this.z6 = spannableStringBuilder;
                                            }
                                            this.y6 = str;
                                            L5();
                                            bhVar = this.m5;
                                            if (bhVar != null) {
                                                bhVar.s();
                                            }
                                            this.f0.getImageReceiver().O0(PhotoViewer.N1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                                        }
                                    } else if (org.telegram.messenger.p10.r(this.w2)) {
                                        this.v5 = true;
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(this.w2.fallback_photo.sizes, 1000, false, null, false);
                                        if (w10 != null) {
                                            this.x5.p0(org.telegram.messenger.gc.i(w10, this.w2.fallback_photo), "50_50", null, 0L, null, org.telegram.messenger.k10.i(this.currentAccount).f(), 0);
                                        }
                                    } else {
                                        TLRPC.UserFull userFull3 = this.w2;
                                        str = (userFull3 == null || (tl_starsRating2 = userFull3.stars_rating) == null || tl_starsRating2.stars >= 0) ? org.telegram.messenger.hd.N0(2131747632, null) : org.telegram.messenger.hd.N0(2131744930, null).toLowerCase(Locale.ROOT);
                                    }
                                    z14 = false;
                                    TLRPC.UserProfilePhoto userProfilePhoto32 = user2.photo;
                                    this.w5 = userProfilePhoto32 == null && userProfilePhoto32.personal;
                                    q10 = org.telegram.messenger.j6.m(q10, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                    if (z11) {
                                    }
                                    this.f.l(q10, false);
                                    z4Var = this.simpleActionBar;
                                    if (z4Var != null) {
                                    }
                                    this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                                    this.r.setRightDrawableInside(true);
                                    bv0 bv0Var22 = this.r;
                                    if (z14) {
                                    }
                                    bv0Var22.i(xw0Var);
                                    this.r.setRightDrawableOnClick(z14 ? new au0(this, 7) : null);
                                    if (this.E2 != null) {
                                    }
                                    this.f.setRightDrawableOutside(false);
                                    z15 = user2.scam;
                                    if (z15) {
                                    }
                                    pk pkVar3 = this.f;
                                    int i122 = !z15 ? 1 : 0;
                                    if (this.L == null) {
                                    }
                                    pkVar3.j(this.L);
                                    this.n = org.telegram.messenger.hd.N0(2131745666, null);
                                    if (org.telegram.messenger.np.L2(user2)) {
                                    }
                                    getMessagesController().getClass();
                                    if (org.telegram.messenger.np.H2(user2)) {
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
                                    if (this.e1 == org.telegram.messenger.k10.i(this.currentAccount).n) {
                                    }
                                    this.y6 = str;
                                    L5();
                                    bhVar = this.m5;
                                    if (bhVar != null) {
                                    }
                                    this.f0.getImageReceiver().O0(PhotoViewer.N1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                                }
                            }
                            gcVar5 = m14;
                            user = c22;
                            gcVar6 = m15;
                            if (gcVar6 != null) {
                                H5(false, false);
                                B4(true);
                                if (gcVar5 != null) {
                                }
                                user2 = user;
                                CharSequence q102 = org.telegram.messenger.p10.q(user2);
                                if (user2.id == getUserConfig().e()) {
                                }
                                z14 = false;
                                TLRPC.UserProfilePhoto userProfilePhoto322 = user2.photo;
                                this.w5 = userProfilePhoto322 == null && userProfilePhoto322.personal;
                                q102 = org.telegram.messenger.j6.m(q102, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                if (z11) {
                                }
                                this.f.l(q102, false);
                                z4Var = this.simpleActionBar;
                                if (z4Var != null) {
                                }
                                this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                                this.r.setRightDrawableInside(true);
                                bv0 bv0Var222 = this.r;
                                if (z14) {
                                }
                                bv0Var222.i(xw0Var);
                                this.r.setRightDrawableOnClick(z14 ? new au0(this, 7) : null);
                                if (this.E2 != null) {
                                }
                                this.f.setRightDrawableOutside(false);
                                z15 = user2.scam;
                                if (z15) {
                                }
                                pk pkVar32 = this.f;
                                int i1222 = !z15 ? 1 : 0;
                                if (this.L == null) {
                                }
                                pkVar32.j(this.L);
                                this.n = org.telegram.messenger.hd.N0(2131745666, null);
                                if (org.telegram.messenger.np.L2(user2)) {
                                }
                                getMessagesController().getClass();
                                if (org.telegram.messenger.np.H2(user2)) {
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
                                if (this.e1 == org.telegram.messenger.k10.i(this.currentAccount).n) {
                                }
                                this.y6 = str;
                                L5();
                                bhVar = this.m5;
                                if (bhVar != null) {
                                }
                                this.f0.getImageReceiver().O0(PhotoViewer.N1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                            }
                            H5(false, false);
                            B4(true);
                            if (gcVar5 != null) {
                            }
                            user2 = user;
                            CharSequence q1022 = org.telegram.messenger.p10.q(user2);
                            if (user2.id == getUserConfig().e()) {
                            }
                            z14 = false;
                            TLRPC.UserProfilePhoto userProfilePhoto3222 = user2.photo;
                            this.w5 = userProfilePhoto3222 == null && userProfilePhoto3222.personal;
                            q1022 = org.telegram.messenger.j6.m(q1022, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                            if (z11) {
                            }
                            this.f.l(q1022, false);
                            z4Var = this.simpleActionBar;
                            if (z4Var != null) {
                            }
                            this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                            this.r.setRightDrawableInside(true);
                            bv0 bv0Var2222 = this.r;
                            if (z14) {
                            }
                            bv0Var2222.i(xw0Var);
                            this.r.setRightDrawableOnClick(z14 ? new au0(this, 7) : null);
                            if (this.E2 != null) {
                            }
                            this.f.setRightDrawableOutside(false);
                            z15 = user2.scam;
                            if (z15) {
                            }
                            pk pkVar322 = this.f;
                            int i12222 = !z15 ? 1 : 0;
                            if (this.L == null) {
                            }
                            pkVar322.j(this.L);
                            this.n = org.telegram.messenger.hd.N0(2131745666, null);
                            if (org.telegram.messenger.np.L2(user2)) {
                            }
                            getMessagesController().getClass();
                            if (org.telegram.messenger.np.H2(user2)) {
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
                            if (this.e1 == org.telegram.messenger.k10.i(this.currentAccount).n) {
                            }
                            this.y6 = str;
                            L5();
                            bhVar = this.m5;
                            if (bhVar != null) {
                            }
                            this.f0.getImageReceiver().O0(PhotoViewer.N1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                        }
                    } else {
                        videoSize = null;
                    }
                    t51Var = null;
                    org.telegram.messenger.gc C2 = this.o0.C(m15, m14);
                    if (this.J2 == null) {
                    }
                    if (this.K2 == null) {
                    }
                    gcVar5 = m14;
                    user = c22;
                    gcVar6 = m15;
                    if (gcVar6 != null) {
                    }
                    H5(false, false);
                    B4(true);
                    if (gcVar5 != null) {
                    }
                    user2 = user;
                    CharSequence q10222 = org.telegram.messenger.p10.q(user2);
                    if (user2.id == getUserConfig().e()) {
                    }
                    z14 = false;
                    TLRPC.UserProfilePhoto userProfilePhoto32222 = user2.photo;
                    this.w5 = userProfilePhoto32222 == null && userProfilePhoto32222.personal;
                    q10222 = org.telegram.messenger.j6.m(q10222, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                    if (z11) {
                    }
                    this.f.l(q10222, false);
                    z4Var = this.simpleActionBar;
                    if (z4Var != null) {
                    }
                    this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                    this.r.setRightDrawableInside(true);
                    bv0 bv0Var22222 = this.r;
                    if (z14) {
                    }
                    bv0Var22222.i(xw0Var);
                    this.r.setRightDrawableOnClick(z14 ? new au0(this, 7) : null);
                    if (this.E2 != null) {
                    }
                    this.f.setRightDrawableOutside(false);
                    z15 = user2.scam;
                    if (z15) {
                    }
                    pk pkVar3222 = this.f;
                    int i122222 = !z15 ? 1 : 0;
                    if (this.L == null) {
                    }
                    pkVar3222.j(this.L);
                    this.n = org.telegram.messenger.hd.N0(2131745666, null);
                    if (org.telegram.messenger.np.L2(user2)) {
                    }
                    getMessagesController().getClass();
                    if (org.telegram.messenger.np.H2(user2)) {
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
                    if (this.e1 == org.telegram.messenger.k10.i(this.currentAccount).n) {
                    }
                    this.y6 = str;
                    L5();
                    bhVar = this.m5;
                    if (bhVar != null) {
                    }
                    this.f0.getImageReceiver().O0(PhotoViewer.N1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                } else if (this.f1 != 0) {
                    TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f1));
                    if (O0 != null) {
                        this.F2 = O0;
                    } else {
                        O0 = this.F2;
                    }
                    TLRPC.Chat chat2 = O0;
                    org.telegram.messenger.n6 n6Var = this.Y1;
                    if (n6Var != null) {
                        n6Var.g();
                    }
                    org.telegram.messenger.cp cpVar2 = this.n6;
                    org.telegram.messenger.cp a11 = org.telegram.messenger.cp.a(chat2.emoji_status);
                    this.n6 = a11;
                    if (a11 == null) {
                        int I = org.telegram.messenger.v3.I(chat2);
                        org.telegram.messenger.dp dpVar2 = org.telegram.messenger.np.u1(this.currentAccount).u4;
                        this.n6 = dpVar2 == null ? null : dpVar2.d(I);
                    }
                    if (cpVar2 != this.n6) {
                        T5();
                    }
                    zw0 zw0Var2 = this.d1;
                    if (zw0Var2 != null) {
                        zw0Var2.b(org.telegram.messenger.v3.J(chat2), chat2.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    TLRPC.EmojiStatus emojiStatus2 = chat2.emoji_status;
                    e5(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null);
                    TLRPC.TL_forumTopic f10 = this.q1 ? getMessagesController().t7.f(this.f1, this.g1) : null;
                    if (org.telegram.messenger.v3.T(chat2)) {
                        if (!this.q1) {
                            TLRPC.ChatFull chatFull = this.v2;
                            if (chatFull != null) {
                                TLRPC.Chat chat3 = this.F2;
                                if (!chat3.megagroup) {
                                    if (chatFull.participants_count != 0) {
                                        if (!org.telegram.messenger.v3.N(chat3)) {
                                        }
                                    }
                                }
                            }
                            G = this.F2.megagroup ? org.telegram.messenger.hd.N0(2131748586, null).toLowerCase() : org.telegram.messenger.v3.t0(chat2) ? org.telegram.messenger.hd.N0(2131752306, null).toLowerCase() : org.telegram.messenger.hd.N0(2131752317, null).toLowerCase();
                        }
                        if (this.q1) {
                            int i13 = f10 != null ? f10.totalMessagesCount - 1 : 0;
                            if (i13 > 0) {
                                org.telegram.messenger.hd.G(i13, "messages", Integer.valueOf(i13));
                            } else {
                                org.telegram.messenger.hd.a0("TopicProfileStatus", null, 2131743767, chat2.title);
                            }
                            SpannableString spannableString = new SpannableString(">");
                            spannableString.setSpan(new org.telegram.ui.Components.nq(R.drawable.arrow_newchat, 0), 0, 1, 33);
                            G = new SpannableStringBuilder(chat2.title).append(' ').append((CharSequence) spannableString);
                            z12 = true;
                            if (z11) {
                                bn bnVar2 = (bn) obj;
                                if (bnVar2.p1.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.m5) {
                                    ((org.telegram.ui.ActionBar.m5) bnVar2.p1.getSubtitleTextView()).getText();
                                } else if (bnVar2.p1.getSubtitleTextView() instanceof org.telegram.ui.Components.o6) {
                                    ((org.telegram.ui.Components.o6) bnVar2.p1.getSubtitleTextView()).getText();
                                }
                                this.f0.setAnimateFromImageReceiver(bnVar2.p1.getAvatarImageView().getImageReceiver());
                            }
                            if (!this.q1) {
                                charSequence = f10 != null ? f10.title : "";
                            } else if (org.telegram.messenger.v3.p0(chat2)) {
                                charSequence = org.telegram.messenger.hd.N0(2131752207, null);
                            } else {
                                charSequence = chat2.title;
                                if (charSequence == null) {
                                    charSequence = null;
                                }
                            }
                            if (charSequence == null) {
                                try {
                                    charSequence = org.telegram.messenger.j6.m(charSequence, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                } catch (Exception unused) {
                                }
                                l10 = this.f.l(charSequence, false);
                                org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
                                if (z4Var2 != null) {
                                    z4Var2.setTitle(charSequence);
                                }
                            } else {
                                l10 = false;
                            }
                            this.f.setLeftDrawableOutside(false);
                            this.f.setLeftDrawable((Drawable) null);
                            this.f.setRightDrawableOutside(false);
                            this.f.setRightDrawableOnClick(null);
                            this.n = null;
                            z13 = chat2.scam;
                            if (!z13 || chat2.fake) {
                                pk pkVar4 = this.f;
                                int i14 = !z13 ? 1 : 0;
                                if (this.L == null) {
                                    org.telegram.ui.Components.vk0 vk0Var2 = new org.telegram.ui.Components.vk0(i14);
                                    this.L = vk0Var2;
                                    vk0Var2.b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h8, this.A0));
                                }
                                pkVar4.j(this.L);
                                this.h = org.telegram.messenger.hd.N0(2131745666, null);
                            } else if (chat2.verified) {
                                this.f.j(t4());
                                this.h = org.telegram.messenger.hd.N0(2131754738, null);
                            } else {
                                this.f.j(null);
                                this.h = null;
                            }
                            if (org.telegram.messenger.n5.f(chat2.emoji_status) == 0) {
                                this.f.i(i4(chat2.emoji_status, false));
                                this.f.setRightDrawableOutside(true);
                                this.h = null;
                                if (org.telegram.messenger.v3.w(1, chat2)) {
                                    this.f.setRightDrawableOnClick(new au0(this, 9));
                                    if (this.S) {
                                        this.S = true;
                                        getMediaDataController().b1();
                                    }
                                } else {
                                    TLRPC.EmojiStatus emojiStatus3 = chat2.emoji_status;
                                    if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                                        this.f.setRightDrawableOnClick(new ju0(this, ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug, r8 ? 1 : 0));
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
                            if (org.telegram.messenger.v3.d0(this.currentAccount, this.i1)) {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) "* ");
                                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.nq(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
                                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.N0(2131751914, null));
                                spannableStringBuilder2.append((CharSequence) " * ");
                                int length = spannableStringBuilder2.length();
                                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.us(), length - 2, length - 1, 33);
                                spannableStringBuilder2.append(G);
                                G = spannableStringBuilder2;
                            }
                            this.y6 = G;
                            this.z6 = null;
                            L5();
                            if (this.q1) {
                                if (z12) {
                                    this.r.setOnClickListener(new au0(this, 10));
                                } else {
                                    this.r.setOnClickListener(null);
                                    this.r.setClickable(false);
                                }
                            }
                            if (l10) {
                                B4(true);
                            }
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            TLRPC.FileLocation fileLocation2 = (chatPhoto != null || this.q1) ? null : chatPhoto.photo_big;
                            if (this.q1) {
                                if (org.telegram.messenger.v3.p0(this.F2)) {
                                    TLRPC.Chat x12 = getMessagesController().x1(this.F2.id);
                                    this.q0.q(x12);
                                    m10 = org.telegram.messenger.gc.m(this.currentAccount, 0, x12);
                                    m11 = org.telegram.messenger.gc.m(this.currentAccount, 1, x12);
                                    gcVar2 = this.o0.C(m11, m10);
                                } else {
                                    this.q0.q(chat2);
                                    m10 = org.telegram.messenger.gc.m(this.currentAccount, 0, chat2);
                                    m11 = org.telegram.messenger.gc.m(this.currentAccount, 1, chat2);
                                    av0 av0Var = this.o0;
                                    if (av0Var != null) {
                                        gcVar2 = av0Var.C(m11, m10);
                                    } else {
                                        gcVar = m10;
                                        gcVar2 = null;
                                        gcVar3 = m11;
                                    }
                                }
                                gcVar = m10;
                                gcVar3 = m11;
                            } else {
                                qg.c.q(this.f0, f10, true, true, this.A0);
                                gcVar2 = null;
                                gcVar = null;
                                gcVar3 = null;
                            }
                            boolean H = this.o0.H(null, gcVar, gcVar3, z10);
                            if ((gcVar != null || H) && this.q2 && (m12 = this.c.m(0)) != null) {
                                this.a.w0(0, m12.getTop() - j4(), org.telegram.ui.Components.nr.h);
                            }
                            String str3 = (gcVar2 == null && gcVar2.p == 2) ? "g" : null;
                            if (this.K2 == null || this.q1) {
                                chat = chat2;
                            } else {
                                chat = chat2;
                                this.f0.m(gcVar2, str3, gcVar3, "50_50", this.q0, chat);
                            }
                            if (gcVar != null && ((gcVar4 = this.C0) == null || gcVar.s != gcVar4.s)) {
                                this.C0 = gcVar;
                                getFileLoader().V(gcVar, chat, null, 0, 1);
                            }
                            this.f0.getImageReceiver().O0(PhotoViewer.N1(fileLocation2) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                        } else if (!this.F2.megagroup) {
                            org.telegram.messenger.hd.S(new int[1], this.v2.participants_count);
                            if (this.F2.megagroup) {
                                org.telegram.messenger.hd.G(this.v2.participants_count, "Members", new Object[0]);
                                G = org.telegram.messenger.hd.H(',', "Members", this.v2.participants_count);
                            } else {
                                org.telegram.messenger.hd.G(this.v2.participants_count, "Subscribers", new Object[0]);
                                G = org.telegram.messenger.hd.H(',', "Subscribers", this.v2.participants_count);
                            }
                        } else if (this.C2 <= 1 || (i7 = this.v2.participants_count) == 0) {
                            int i15 = this.v2.participants_count;
                            if (i15 == 0) {
                                G = chat2.has_geo ? org.telegram.messenger.hd.N0(2131748449, null).toLowerCase() : org.telegram.messenger.v3.t0(chat2) ? org.telegram.messenger.hd.N0(2131748445, null).toLowerCase() : org.telegram.messenger.hd.N0(2131748448, null).toLowerCase();
                            } else {
                                org.telegram.messenger.hd.G(i15, "Members", new Object[0]);
                                G = org.telegram.messenger.hd.H(',', "Members", this.v2.participants_count);
                            }
                        } else {
                            org.telegram.messenger.hd.G(i7, "Members", new Object[0]);
                            org.telegram.messenger.hd.G(Math.min(this.C2, this.v2.participants_count), "OnlineCount", new Object[0]);
                            G = a8.p0.E(org.telegram.messenger.hd.H(',', "Members", this.v2.participants_count), ", ", org.telegram.messenger.hd.H(',', "OnlineCount", Math.min(this.C2, this.v2.participants_count)));
                        }
                    } else if (org.telegram.messenger.v3.k0(chat2)) {
                        G = org.telegram.messenger.hd.N0(2131742563, null);
                    } else if (org.telegram.messenger.v3.l0(chat2)) {
                        G = org.telegram.messenger.hd.N0(2131742569, null);
                    } else {
                        int i16 = chat2.participants_count;
                        TLRPC.ChatFull chatFull2 = this.v2;
                        if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                            i16 = chatParticipants.participants.size();
                        }
                        G = (i16 == 0 || this.C2 <= 1) ? org.telegram.messenger.hd.G(i16, "Members", new Object[0]) : a8.p0.E(org.telegram.messenger.hd.G(i16, "Members", new Object[0]), ", ", org.telegram.messenger.hd.G(this.C2, "OnlineCount", new Object[0]));
                    }
                    z12 = false;
                    if (z11) {
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
                    z13 = chat2.scam;
                    if (z13) {
                    }
                    pk pkVar42 = this.f;
                    int i142 = !z13 ? 1 : 0;
                    if (this.L == null) {
                    }
                    pkVar42.j(this.L);
                    this.h = org.telegram.messenger.hd.N0(2131745666, null);
                    if (org.telegram.messenger.n5.f(chat2.emoji_status) == 0) {
                    }
                    if (chat2.bot_verification_icon == 0) {
                    }
                    if (org.telegram.messenger.v3.d0(this.currentAccount, this.i1)) {
                    }
                    this.y6 = G;
                    this.z6 = null;
                    L5();
                    if (this.q1) {
                    }
                    if (l10) {
                    }
                    TLRPC.ChatPhoto chatPhoto2 = chat2.photo;
                    if (chatPhoto2 != null) {
                    }
                    if (this.q1) {
                    }
                    boolean H2 = this.o0.H(null, gcVar, gcVar3, z10);
                    if (gcVar != null) {
                    }
                    this.a.w0(0, m12.getTop() - j4(), org.telegram.ui.Components.nr.h);
                    if (gcVar2 == null) {
                    }
                    if (this.K2 == null) {
                    }
                    chat = chat2;
                    if (gcVar != null) {
                        this.C0 = gcVar;
                        getFileLoader().V(gcVar, chat, null, 0, 1);
                    }
                    this.f0.getImageReceiver().O0(PhotoViewer.N1(fileLocation2) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                }
                B4(true);
            }
        }
        z11 = false;
        this.v5 = false;
        this.w5 = false;
        str = "";
        if (this.e1 == 0) {
        }
        B4(true);
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
    public final void N4(boolean z10) {
        TLRPC.Chat O0;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize x10;
        TLRPC.ChatFull chatFull;
        TLRPC.FileLocation fileLocation2;
        TLRPC.VideoSize x11;
        TLRPC.UserFull userFull;
        TLRPC.Photo photo;
        if (this.a.getScrollState() != 1 || z10) {
            av0 av0Var = this.o0;
            int realPosition = av0Var != null ? av0Var.getRealPosition() : 0;
            av0 av0Var2 = this.o0;
            org.telegram.messenger.gc gcVar = null;
            org.telegram.messenger.gc G = av0Var2 != null ? av0Var2.G(realPosition) : null;
            av0 av0Var3 = this.o0;
            TLRPC.Photo F = av0Var3 != null ? av0Var3.F(realPosition) : null;
            long j3 = this.e1;
            lv0 lv0Var = this.q5;
            if (j3 == 0) {
                if (this.f1 == 0 || (chatPhoto = (O0 = getMessagesController().O0(Long.valueOf(this.f1))).photo) == null || chatPhoto.photo_big == null) {
                    return;
                }
                PhotoViewer.p1().I2(null, this, null);
                TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                int i7 = chatPhoto2.dc_id;
                if (i7 != 0) {
                    chatPhoto2.photo_big.dc_id = i7;
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
                if (F != null && !F.video_sizes.isEmpty() && (x10 = org.telegram.messenger.w7.x(1000, F.video_sizes)) != null) {
                    gcVar = org.telegram.messenger.gc.j(x10, F);
                }
                PhotoViewer.p1().d2(null, fileLocation3, G, gcVar, null, null, null, 0, lv0Var, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.e1));
            TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null) {
                return;
            }
            PhotoViewer.p1().I2(null, this, null);
            TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
            int i10 = userProfilePhoto2.dc_id;
            if (i10 != 0) {
                userProfilePhoto2.photo_big.dc_id = i10;
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
                boolean z11 = photo instanceof TLRPC.TL_photo;
                if (!z11 || photo.id != userProfilePhoto2.photo_id) {
                    TLRPC.Photo photo3 = userFull.fallback_photo;
                    if ((photo3 instanceof TLRPC.TL_photo) && photo3.id == userProfilePhoto2.photo_id) {
                        F = photo3;
                    }
                }
                F = photo;
            }
            if (F != null && !F.video_sizes.isEmpty() && (x11 = org.telegram.messenger.w7.x(1000, F.video_sizes)) != null) {
                gcVar = org.telegram.messenger.gc.j(x11, F);
            }
            PhotoViewer.p1().d2(null, fileLocation4, G, gcVar, null, null, null, 0, lv0Var, null, 0L, 0L, 0L, true, null, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0204, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationToBeDeprecated) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0b56, code lost:
    
        if ((j4() + (r2 + r3)) < r18.a.getMeasuredHeight()) goto L679;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0175, code lost:
    
        if (r10.b.isEmpty() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0196, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0194, code lost:
    
        if (r10.b.isEmpty() == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0b2b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0b42  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0b4a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0b5e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0b6f  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0b11  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N5() {
        boolean z10;
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
        org.telegram.ui.Components.tf0 tf0Var;
        org.telegram.ui.Components.og0 og0Var;
        int i10;
        long j3;
        boolean z11;
        TLRPC.UserFull userFull;
        boolean z12;
        TLRPC.UserFull userFull2;
        TL_payments.starRefProgram starrefprogram;
        org.telegram.ui.Cells.f6 f6Var;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull5;
        TLRPC.UserFull userFull4;
        TLRPC.ChatFull chatFull6;
        TLRPC.UserFull userFull5;
        TL_bots.BotInfo botInfo;
        TLRPC.UserFull userFull6;
        TLRPC.UserFull userFull7;
        J5(false);
        int i11 = this.O2;
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
        boolean z13 = true;
        this.M4 = (this.e1 == 0 || (userFull7 = this.w2) == null || userFull7.wallet_card == null || (this.r0 != null && !this.s1)) ? false : true;
        this.O4 = -1;
        this.P4 = -1;
        this.Q4 = -1;
        ArrayList arrayList2 = this.U4;
        arrayList2.clear();
        ArrayList arrayList3 = this.V4;
        arrayList3.clear();
        org.telegram.ui.Components.bt0 bt0Var = this.R;
        if (bt0Var != null) {
            int[] iArr = bt0Var.c;
            int i12 = 0;
            while (true) {
                if (i12 >= iArr.length) {
                    z10 = false;
                    break;
                } else {
                    if (iArr[i12] > 0) {
                        z10 = true;
                        break;
                    }
                    i12++;
                }
            }
            if (!z10) {
                z10 = this.R.f;
            }
            if (!z10) {
                this.R.getClass();
            }
            if (!z10 && (userFull6 = this.w2) != null) {
                z10 = userFull6.stories_pinned_available;
            }
            if (!z10 && (userFull5 = this.w2) != null && (botInfo = userFull5.bot_info) != null) {
                z10 = botInfo.has_preview_medias;
            }
            if (!z10 && (((userFull4 = this.w2) != null && userFull4.stargifts_count > 0) || ((chatFull6 = this.v2) != null && chatFull6.stargifts_count > 0))) {
                z10 = true;
            }
            if (!z10 && (chatFull5 = this.v2) != null) {
                z10 = chatFull5.stories_pinned_available;
            }
            if (!z10) {
                long j10 = this.f1;
                if (j10 != 0) {
                    org.telegram.messenger.oo N0 = org.telegram.messenger.np.u1(this.currentAccount).N0(-j10);
                    if (N0 != null) {
                    }
                }
                if (this.s2) {
                    long j11 = this.e1;
                    if (j11 != 0) {
                        org.telegram.messenger.oo N02 = org.telegram.messenger.np.u1(this.currentAccount).N0(j11);
                        if (N02 != null) {
                        }
                    }
                }
            }
            if (this.e1 == 0) {
                TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.e1));
                TLRPC.UserFull userFull8 = this.w2;
                if (userFull8 != null && userFull8.saved_music != null && (this.r0 == null || this.s1)) {
                    this.L4 = true;
                }
                if (this.B3 < 0 && this.C3 < 0) {
                    if (this.L4 || this.M4 || this.n6 != null || this.a0 == null) {
                        int i13 = this.O2;
                        this.O2 = i13 + 1;
                        this.C3 = i13;
                    } else {
                        int i14 = this.O2;
                        this.O2 = i14 + 1;
                        this.B3 = i14;
                    }
                }
                if (!org.telegram.messenger.p10.C(c22) || this.s1) {
                    String o4 = org.telegram.messenger.p10.o(c22);
                    TLRPC.UserFull userFull9 = this.w2;
                    boolean z14 = ((userFull9 == null || TextUtils.isEmpty(userFull9.about)) && (c22 == null || TextUtils.isEmpty(o4))) ? false : true;
                    boolean z15 = (c22 == null || (TextUtils.isEmpty(c22.phone) && TextUtils.isEmpty(this.i5))) ? false : true;
                    if (!this.s2 && (userFull3 = this.w2) != null && userFull3.unofficial_security_risk) {
                        int i15 = this.O2;
                        this.m4 = i15;
                        this.O2 = i15 + 2;
                        this.n4 = i15 + 1;
                    }
                    TLRPC.UserFull userFull10 = this.w2;
                    if (userFull10 == null || (userFull10.flags2 & 64) == 0 || ((f6Var = this.x2) != null && f6Var.c && f6Var.d.isEmpty())) {
                        j3 = 0;
                    } else {
                        j3 = 0;
                        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.w2.personal_channel_id));
                        if (O0 != null && (org.telegram.messenger.v3.t0(O0) || !org.telegram.messenger.v3.r0(O0))) {
                            int i16 = this.O2;
                            this.R2 = i16;
                            this.O2 = i16 + 2;
                            this.S2 = i16 + 1;
                        }
                    }
                    if (!this.s2 && (z15 || !z14)) {
                        int i17 = this.O2;
                        this.O2 = i17 + 1;
                        this.H3 = i17;
                    }
                    TLRPC.UserFull userFull11 = this.w2;
                    if (userFull11 != null && !TextUtils.isEmpty(userFull11.about)) {
                        int i18 = this.O2;
                        this.O2 = i18 + 1;
                        this.K3 = i18;
                    }
                    if (c22 != null && o4 != null) {
                        int i19 = this.O2;
                        this.O2 = i19 + 1;
                        this.M3 = i19;
                    }
                    TLRPC.UserFull userFull12 = this.w2;
                    if (userFull12 != null) {
                        if (userFull12.birthday != null) {
                            int i20 = this.O2;
                            this.O2 = i20 + 1;
                            this.V2 = i20;
                        }
                        if (userFull12.business_work_hours != null) {
                            int i21 = this.O2;
                            this.O2 = i21 + 1;
                            this.P3 = i21;
                        }
                        if (userFull12.business_location != null) {
                            int i22 = this.O2;
                            this.O2 = i22 + 1;
                            this.Q3 = i22;
                        }
                        if (userFull12.note != null) {
                            int i23 = this.O2;
                            this.O2 = i23 + 1;
                            this.I3 = i23;
                        }
                    }
                    if (this.a0 == null && this.e1 != getUserConfig().e()) {
                        int i24 = this.O2;
                        this.O2 = i24 + 1;
                        this.O3 = i24;
                    }
                    boolean z16 = this.s2;
                    if (z16 && c22 != null && c22.bot_has_main_app) {
                        int i25 = this.O2;
                        this.O2 = i25 + 1;
                        this.l4 = i25;
                    }
                    int i26 = this.O2;
                    int i27 = i26 + 1;
                    this.O2 = i27;
                    this.S3 = i26;
                    if (c22 != null && c22.linked_community_id != j3) {
                        this.o4 = i27;
                        this.O2 = i26 + 3;
                        this.p4 = i26 + 2;
                    }
                    if (z16 && (userFull2 = this.w2) != null && (starrefprogram = userFull2.starref_program) != null && (starrefprogram.flags & 2) == 0 && getMessagesController().j6) {
                        int i28 = this.O2;
                        this.T3 = i28;
                        this.O2 = i28 + 2;
                        this.U3 = i28 + 1;
                    }
                    if (this.s2) {
                        if (this.t2 == null && getContext() != null) {
                            this.t2 = ki.r0.e(getContext(), this.currentAccount, this.e1);
                        }
                        if (this.u2 == null && getContext() != null) {
                            this.u2 = ki.p.c(getContext(), this.currentAccount, this.e1);
                        }
                        ki.r0 r0Var = this.t2;
                        boolean z17 = r0Var != null && r0Var.b();
                        ki.p pVar = this.u2;
                        boolean z18 = pVar != null && pVar.a();
                        TLRPC.UserFull userFull13 = this.w2;
                        if (userFull13 == null || !userFull13.bot_can_manage_emoji_status) {
                            if (!ki.c4.d((Activity) getContext(), this.currentAccount, this.e1)) {
                                z12 = false;
                                if (!z12 || z17 || z18) {
                                    int i29 = this.O2;
                                    int i30 = i29 + 1;
                                    this.O2 = i30;
                                    this.q4 = i29;
                                    if (z12) {
                                        this.O2 = i29 + 2;
                                        this.botPermissionEmojiStatus = i30;
                                    }
                                    if (z17) {
                                        int i31 = this.O2;
                                        this.O2 = i31 + 1;
                                        this.botPermissionLocation = i31;
                                    }
                                    if (z18) {
                                        int i32 = this.O2;
                                        this.O2 = i32 + 1;
                                        this.botPermissionBiometry = i32;
                                    }
                                    int i33 = this.O2;
                                    this.O2 = i33 + 1;
                                    this.s4 = i33;
                                }
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        int i292 = this.O2;
                        int i302 = i292 + 1;
                        this.O2 = i302;
                        this.q4 = i292;
                        if (z12) {
                        }
                        if (z17) {
                        }
                        if (z18) {
                        }
                        int i332 = this.O2;
                        this.O2 = i332 + 1;
                        this.s4 = i332;
                    }
                    TLRPC.EncryptedChat encryptedChat = this.E2;
                    if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                        int i34 = this.O2;
                        this.t4 = i34;
                        this.u4 = i34 + 1;
                        this.O2 = i34 + 3;
                        this.v4 = i34 + 2;
                    }
                    if (c22 != null && !this.s2 && encryptedChat == null && c22.id != getUserConfig().e() && this.k1) {
                        int i35 = this.O2;
                        this.O4 = i35;
                        this.O2 = i35 + 2;
                        this.Q4 = i35 + 1;
                    }
                    if (this.s2 && c22 != null && c22.bot && c22.bot_can_edit) {
                        int i36 = this.O2;
                        this.b4 = i36;
                        this.O2 = i36 + 2;
                        this.c4 = i36 + 1;
                    }
                    if (c22 != null && c22.bot) {
                        TLRPC.UserFull userFull14 = this.w2;
                        if (userFull14 != null && userFull14.can_view_revenue && di.e0.g(this.currentAccount).i(this.e1) > j3) {
                            int i37 = this.O2;
                            this.O2 = i37 + 1;
                            this.F4 = i37;
                        }
                        if (di.e0.g(this.currentAccount).c(this.e1).amount > j3 || !di.e0.g(this.currentAccount).k(this.e1).a[0].isEmpty()) {
                            int i38 = this.O2;
                            this.O2 = i38 + 1;
                            this.E4 = i38;
                        }
                    }
                    if (c22 != null && this.s2 && !c22.bot_nochats) {
                        int i39 = this.O2;
                        this.d4 = i39;
                        this.O2 = i39 + 2;
                        this.e4 = i39 + 1;
                    } else if (this.E4 >= 0) {
                        z11 = true;
                        if (!this.s1 && this.h5 && c22 != null && !c22.contact && !c22.bot && !org.telegram.messenger.p10.B(c22.id)) {
                            int i40 = this.O2;
                            this.O2 = i40 + 1;
                            this.a4 = i40;
                            z11 = true;
                        }
                        if (!this.s1 && this.e5 != 0 && this.f5 < j3 && org.telegram.messenger.v3.y(13, getMessagesController().O0(Long.valueOf(-this.f5)))) {
                            int i41 = this.O2;
                            this.O2 = i41 + 1;
                            this.X3 = i41;
                            z11 = true;
                        }
                        if (!this.s1 || this.e5 == 0 || org.telegram.messenger.i5.r(this.currentAccount).x(this.e1)) {
                            z13 = z11;
                        } else {
                            int i42 = this.O2;
                            this.O2 = i42 + 1;
                            this.Y3 = i42;
                        }
                        if (z13) {
                            int i43 = this.O2;
                            this.O2 = i43 + 1;
                            this.Z3 = i43;
                        }
                        if (!z10 || ((c22 != null && c22.bot && c22.bot_can_edit && c22.bot_has_main_app) || (!((userFull = this.w2) == null || userFull.common_chats_count == 0) || this.s1))) {
                            int i44 = this.O2;
                            this.O2 = i44 + 1;
                            this.N4 = i44;
                        } else if (this.Q4 == -1 && this.o1) {
                            int i45 = this.O2;
                            this.V3 = i45;
                            this.O2 = i45 + 2;
                            this.Q4 = i45 + 1;
                        }
                    }
                    z11 = false;
                    if (!this.s1) {
                        int i402 = this.O2;
                        this.O2 = i402 + 1;
                        this.a4 = i402;
                        z11 = true;
                    }
                    if (!this.s1) {
                        int i412 = this.O2;
                        this.O2 = i412 + 1;
                        this.X3 = i412;
                        z11 = true;
                    }
                    if (this.s1) {
                    }
                    z13 = z11;
                    if (z13) {
                    }
                    if (z10) {
                    }
                    int i442 = this.O2;
                    this.O2 = i442 + 1;
                    this.N4 = i442;
                } else {
                    if (this.K2 == null) {
                        TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                        if (userProfilePhoto != null) {
                            TLRPC.FileLocation fileLocation = userProfilePhoto.photo_big;
                            if (!(fileLocation instanceof TLRPC.TL_fileLocation_layer97)) {
                            }
                        }
                        av0 av0Var = this.o0;
                        if (av0Var == null || av0Var.getRealCount() == 0) {
                            int i46 = this.O2;
                            this.P2 = i46;
                            this.O2 = i46 + 2;
                            this.Q2 = i46 + 1;
                        }
                    }
                    int i47 = this.O2;
                    this.T2 = i47;
                    this.U2 = i47 + 1;
                    this.W2 = i47 + 2;
                    this.X2 = i47 + 3;
                    this.O2 = i47 + 5;
                    this.e3 = i47 + 4;
                    Set set = getMessagesController().V3;
                    if (set.contains("PREMIUM_GRACE")) {
                        int i48 = this.O2;
                        this.Z2 = i48;
                        this.O2 = i48 + 2;
                        this.a3 = i48 + 1;
                    } else if (set.contains("VALIDATE_PHONE_NUMBER")) {
                        int i49 = this.O2;
                        this.b3 = i49;
                        this.O2 = i49 + 2;
                        this.Y2 = i49 + 1;
                    } else if (set.contains("VALIDATE_PASSWORD")) {
                        int i50 = this.O2;
                        this.d3 = i50;
                        this.O2 = i50 + 2;
                        this.c3 = i50 + 1;
                    }
                    int i51 = this.O2;
                    this.f3 = i51;
                    this.k3 = i51 + 1;
                    this.i3 = i51 + 2;
                    this.g3 = i51 + 3;
                    this.j3 = i51 + 4;
                    this.O2 = i51 + 6;
                    this.m3 = i51 + 5;
                    if (getMessagesController().H3 || !getMessagesController().Q0.isEmpty()) {
                        int i52 = this.O2;
                        this.O2 = i52 + 1;
                        this.l3 = i52;
                    }
                    int i53 = this.O2;
                    this.o3 = i53;
                    this.h3 = i53 + 1;
                    this.O2 = i53 + 3;
                    this.p3 = i53 + 2;
                    if (!getMessagesController().K3()) {
                        int i54 = this.O2;
                        this.O2 = i54 + 1;
                        this.f4 = i54;
                    }
                    if (getMessagesController().g5()) {
                        int i55 = this.O2;
                        this.O2 = i55 + 1;
                        this.g4 = i55;
                    }
                    di.y8.y(this.currentAccount, true).p();
                    org.telegram.messenger.t0.n();
                    int i56 = this.O2;
                    this.O2 = i56 + 1;
                    this.h4 = i56;
                    if (!getMessagesController().K3()) {
                        int i57 = this.O2;
                        this.O2 = i57 + 1;
                        this.i4 = i57;
                    }
                    if (!getMessagesController().k7) {
                        int i58 = this.O2;
                        this.O2 = i58 + 1;
                        this.j4 = i58;
                    }
                    if (this.f4 >= 0 || this.g4 >= 0 || this.h4 >= 0 || this.i4 >= 0 || this.j4 >= 0) {
                        int i59 = this.O2;
                        this.O2 = i59 + 1;
                        this.k4 = i59;
                    }
                    int i60 = this.O2;
                    this.q3 = i60;
                    this.r3 = i60 + 1;
                    this.s3 = i60 + 2;
                    int i61 = i60 + 4;
                    this.O2 = i61;
                    this.t3 = i60 + 3;
                    boolean z19 = org.telegram.messenger.s2.a;
                    if (z19) {
                        this.u3 = i61;
                        this.O2 = i60 + 6;
                        this.v3 = i60 + 5;
                    }
                    if (z19) {
                        int i62 = this.O2;
                        this.w3 = i62;
                        this.x3 = i62 + 1;
                        this.O2 = i62 + 3;
                        this.y3 = i62 + 2;
                    }
                    int i63 = this.O2;
                    this.z3 = i63;
                    this.O2 = i63 + 2;
                    this.A3 = i63 + 1;
                }
            } else if (this.q1) {
                if (this.B3 < 0 && this.C3 < 0) {
                    if (this.L4 || this.M4 || this.n6 != null || this.a0 == null) {
                        int i64 = this.O2;
                        this.O2 = i64 + 1;
                        this.C3 = i64;
                    } else {
                        int i65 = this.O2;
                        this.O2 = i65 + 1;
                        this.B3 = i65;
                    }
                }
                int i66 = this.O2;
                int i67 = i66 + 1;
                this.O2 = i67;
                this.M3 = i66;
                if (this.a0 == null) {
                    this.O2 = i66 + 2;
                    this.R3 = i67;
                }
                int i68 = this.O2;
                int i69 = i68 + 1;
                this.O2 = i69;
                this.S3 = i68;
                if (z10) {
                    this.O2 = i68 + 2;
                    this.N4 = i69;
                }
            } else if (this.f1 != 0) {
                TLRPC.ChatFull chatFull7 = this.v2;
                if ((chatFull7 != null && (!TextUtils.isEmpty(chatFull7.about) || (this.v2.location instanceof TLRPC.TL_channelLocation))) || org.telegram.messenger.v3.t0(this.F2)) {
                    if (this.B3 < 0 && this.C3 < 0) {
                        if (this.L4 || this.M4 || this.n6 != null || this.a0 == null) {
                            int i70 = this.O2;
                            this.O2 = i70 + 1;
                            this.C3 = i70;
                        } else {
                            int i71 = this.O2;
                            this.O2 = i71 + 1;
                            this.B3 = i71;
                        }
                    }
                    if (this.a0 == null) {
                        int i72 = this.O2;
                        this.O2 = i72 + 1;
                        this.E3 = i72;
                    }
                    TLRPC.ChatFull chatFull8 = this.v2;
                    if (chatFull8 != null) {
                        if (!TextUtils.isEmpty(chatFull8.about)) {
                            int i73 = this.O2;
                            this.O2 = i73 + 1;
                            this.L3 = i73;
                        }
                        if (this.v2.location instanceof TLRPC.TL_channelLocation) {
                            int i74 = this.O2;
                            this.O2 = i74 + 1;
                            this.J3 = i74;
                        }
                    }
                    if (org.telegram.messenger.v3.t0(this.F2)) {
                        int i75 = this.O2;
                        this.O2 = i75 + 1;
                        this.M3 = i75;
                    }
                }
                if (this.B3 < 0 && this.C3 < 0) {
                    if (this.L4 || this.M4 || this.n6 != null || this.a0 == null) {
                        int i76 = this.O2;
                        this.O2 = i76 + 1;
                        this.C3 = i76;
                    } else {
                        int i77 = this.O2;
                        this.O2 = i77 + 1;
                        this.B3 = i77;
                    }
                }
                if (this.a0 == null) {
                    if (this.E3 != -1) {
                        int i78 = this.O2;
                        this.O2 = i78 + 1;
                        this.N3 = i78;
                    }
                    int i79 = this.O2;
                    this.O2 = i79 + 1;
                    this.O3 = i79;
                }
                int i80 = this.O2;
                if (i80 > 0) {
                    this.O2 = i80 + 1;
                    this.S3 = i80;
                }
                TLRPC.Chat chat = this.F2;
                if (chat != null && chat.linked_community_id != 0) {
                    int i81 = this.O2;
                    this.o4 = i81;
                    this.O2 = i81 + 2;
                    this.p4 = i81 + 1;
                }
                if (org.telegram.messenger.v3.T(chat)) {
                    TLRPC.Chat chat2 = this.F2;
                    if (!chat2.megagroup) {
                        TLRPC.ChatFull chatFull9 = this.v2;
                        if (chatFull9 != null && (chat2.creator || chatFull9.can_view_participants)) {
                            if (this.a0 == null) {
                                int i82 = this.O2;
                                this.O2 = i82 + 1;
                                this.w4 = i82;
                            }
                            int i83 = this.O2;
                            int i84 = i83 + 1;
                            this.O2 = i84;
                            this.A4 = i83;
                            if (chatFull9.requests_pending > 0) {
                                this.O2 = i83 + 2;
                                this.B4 = i84;
                            }
                            int i85 = this.O2;
                            int i86 = i85 + 1;
                            this.O2 = i86;
                            this.C4 = i85;
                            if (chatFull9.banned_count != 0 || chatFull9.kicked_count != 0) {
                                this.O2 = i85 + 2;
                                this.J4 = i86;
                            }
                            if ((chatFull9.can_view_stars_revenue && (di.e0.g(this.currentAccount).c(-this.f1).amount > 0 || !di.e0.g(this.currentAccount).k(-this.f1).a[0].isEmpty())) || ((chatFull4 = this.v2) != null && chatFull4.can_view_revenue && di.e0.g(this.currentAccount).i(-this.f1) > 0)) {
                                int i87 = this.O2;
                                this.O2 = i87 + 1;
                                this.G4 = i87;
                            }
                            int i88 = this.O2;
                            this.D4 = i88;
                            this.O2 = i88 + 2;
                            this.H4 = i88 + 1;
                        }
                        if (org.telegram.messenger.v3.T(this.F2)) {
                            TLRPC.ChatFull chatFull10 = this.v2;
                            if (chatFull10 != null) {
                                if (this.q1 || (chatParticipants = chatFull10.participants) == null || chatParticipants.participants == null || (chatParticipants instanceof TLRPC.TL_chatParticipantsForbidden)) {
                                    if (!org.telegram.messenger.v3.r0(this.F2) && org.telegram.messenger.v3.w(3, this.F2) && this.v2.participants_hidden) {
                                        int i89 = this.O2;
                                        this.z4 = i89;
                                        this.O2 = i89 + 2;
                                        this.K4 = i89 + 1;
                                    }
                                    vv0 vv0Var = this.O;
                                    if (vv0Var != null) {
                                        vv0Var.E1();
                                    }
                                } else {
                                    if (org.telegram.messenger.v3.w(3, this.F2) || (tL_chatBannedRights = this.F2.default_banned_rights) == null || !tL_chatBannedRights.invite_users) {
                                        int i90 = this.O2;
                                        this.O2 = i90 + 1;
                                        this.z4 = i90;
                                    }
                                    if (this.v2.participants.participants.size() <= 5 || !z10) {
                                        if (this.z4 == -1 && this.a0 == null) {
                                            int i91 = this.O2;
                                            this.O2 = i91 + 1;
                                            this.w4 = i91;
                                        }
                                        int i92 = this.O2;
                                        this.x4 = i92;
                                        int size = this.v2.participants.participants.size() + i92;
                                        this.y4 = size;
                                        this.O2 = size + 1;
                                        this.K4 = size;
                                        arrayList2.addAll(this.v2.participants.participants);
                                        ArrayList arrayList4 = this.D2;
                                        if (arrayList4 != null) {
                                            arrayList3.addAll(arrayList4);
                                        }
                                        vv0 vv0Var2 = this.O;
                                        if (vv0Var2 != null) {
                                            vv0Var2.m1(null, null);
                                        }
                                    } else {
                                        if (this.z4 != -1) {
                                            int i93 = this.O2;
                                            this.O2 = i93 + 1;
                                            this.K4 = i93;
                                        }
                                        vv0 vv0Var3 = this.O;
                                        if (vv0Var3 != null) {
                                            vv0Var3.m1(this.D2, this.v2);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (this.q1 || (chatFull3 = this.v2) == null || !this.F2.megagroup || (chatParticipants2 = chatFull3.participants) == null || (arrayList = chatParticipants2.participants) == null || arrayList.isEmpty()) {
                                if (!org.telegram.messenger.v3.r0(this.F2) && org.telegram.messenger.v3.w(3, this.F2) && (chatFull2 = this.v2) != null && chatFull2.participants_hidden) {
                                    int i94 = this.O2;
                                    this.z4 = i94;
                                    this.O2 = i94 + 2;
                                    this.K4 = i94 + 1;
                                }
                                vv0 vv0Var4 = this.O;
                                if (vv0Var4 != null) {
                                    vv0Var4.E1();
                                }
                            } else {
                                if (!org.telegram.messenger.v3.r0(this.F2) && org.telegram.messenger.v3.w(3, this.F2) && this.v2.participants_count < getMessagesController().a3) {
                                    int i95 = this.O2;
                                    this.O2 = i95 + 1;
                                    this.z4 = i95;
                                }
                                int size2 = this.v2.participants.participants.size();
                                if ((size2 <= 5 || !z10 || this.W4 == 1) && this.W4 != 2) {
                                    if (this.z4 == -1 && this.a0 == null) {
                                        int i96 = this.O2;
                                        this.O2 = i96 + 1;
                                        this.w4 = i96;
                                    }
                                    int i97 = this.O2;
                                    this.x4 = i97;
                                    int i98 = i97 + size2;
                                    this.y4 = i98;
                                    this.O2 = i98 + 1;
                                    this.K4 = i98;
                                    arrayList2.addAll(this.v2.participants.participants);
                                    ArrayList arrayList5 = this.D2;
                                    if (arrayList5 != null) {
                                        arrayList3.addAll(arrayList5);
                                    }
                                    this.W4 = 1;
                                    vv0 vv0Var5 = this.O;
                                    if (vv0Var5 != null) {
                                        vv0Var5.m1(null, null);
                                    }
                                } else {
                                    if (this.z4 != -1) {
                                        int i99 = this.O2;
                                        this.O2 = i99 + 1;
                                        this.K4 = i99;
                                    }
                                    if (this.O != null) {
                                        if (!this.D2.isEmpty()) {
                                            this.W4 = 2;
                                        }
                                        this.O.m1(this.D2, this.v2);
                                    }
                                }
                            }
                            if (this.Q4 == -1) {
                                TLRPC.Chat chat3 = this.F2;
                                if (chat3.left && !chat3.kicked) {
                                    long j12 = org.telegram.messenger.np.z1(this.currentAccount).getLong("dialog_join_requested_time_" + this.i1, -1L);
                                    if (j12 <= 0 || System.currentTimeMillis() - j12 >= 120000) {
                                        org.telegram.ui.Components.tf0 tf0Var2 = this.a0;
                                        if (tf0Var2 == null || !tf0Var2.f()) {
                                            int i100 = this.O2;
                                            this.P4 = i100;
                                            this.O2 = i100 + 2;
                                            this.Q4 = i100 + 1;
                                        }
                                        if (z10) {
                                            int i101 = this.O2;
                                            this.O2 = i101 + 1;
                                            this.N4 = i101;
                                        }
                                        if (this.N4 == -1) {
                                            int i102 = this.O2;
                                            this.O2 = i102 + 1;
                                            this.D3 = i102;
                                        }
                                        if (this.actionBar != null) {
                                            i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
                                        } else {
                                            i7 = 0;
                                        }
                                        if (this.a != null && i11 <= this.O2) {
                                            i10 = this.F0;
                                            if (i10 != 0) {
                                            }
                                            qu0Var = this.a;
                                            if (qu0Var != null) {
                                                qu0Var.setTranslateSelectorPosition(this.P3);
                                            }
                                            tf0Var = this.a0;
                                            if (tf0Var != null) {
                                                tf0Var.o(7, z13);
                                            }
                                            og0Var = this.c0;
                                            if (og0Var != null) {
                                                TLRPC.UserFull userFull15 = this.w2;
                                                if (userFull15 != null) {
                                                    og0Var.setMusicDocument(userFull15.saved_music);
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
                                        qu0Var = this.a;
                                        if (qu0Var != null) {
                                        }
                                        tf0Var = this.a0;
                                        if (tf0Var != null) {
                                        }
                                        og0Var = this.c0;
                                        if (og0Var != null) {
                                        }
                                    }
                                }
                            }
                        }
                        z13 = false;
                        if (z10) {
                        }
                        if (this.N4 == -1) {
                        }
                        if (this.actionBar != null) {
                        }
                        if (this.a != null) {
                            i10 = this.F0;
                            if (i10 != 0) {
                            }
                            qu0Var = this.a;
                            if (qu0Var != null) {
                            }
                            tf0Var = this.a0;
                            if (tf0Var != null) {
                            }
                            og0Var = this.c0;
                            if (og0Var != null) {
                            }
                        }
                        this.D0 = 0;
                        qu0Var = this.a;
                        if (qu0Var != null) {
                        }
                        tf0Var = this.a0;
                        if (tf0Var != null) {
                        }
                        og0Var = this.c0;
                        if (og0Var != null) {
                        }
                    }
                }
                TLRPC.ChatFull chatFull11 = this.v2;
                if ((chatFull11 != null && chatFull11.can_view_stars_revenue && (di.e0.g(this.currentAccount).c(-this.f1).amount > 0 || !di.e0.g(this.currentAccount).k(-this.f1).a[0].isEmpty())) || ((chatFull = this.v2) != null && chatFull.can_view_revenue && di.e0.g(this.currentAccount).i(-this.f1) > 0)) {
                    int i103 = this.O2;
                    this.G4 = i103;
                    this.O2 = i103 + 2;
                    this.H4 = i103 + 1;
                }
                if (org.telegram.messenger.v3.T(this.F2)) {
                }
                z13 = false;
                if (z10) {
                }
                if (this.N4 == -1) {
                }
                if (this.actionBar != null) {
                }
                if (this.a != null) {
                }
                this.D0 = 0;
                qu0Var = this.a;
                if (qu0Var != null) {
                }
                tf0Var = this.a0;
                if (tf0Var != null) {
                }
                og0Var = this.c0;
                if (og0Var != null) {
                }
            }
            z13 = false;
            if (this.N4 == -1) {
            }
            if (this.actionBar != null) {
            }
            if (this.a != null) {
            }
            this.D0 = 0;
            qu0Var = this.a;
            if (qu0Var != null) {
            }
            tf0Var = this.a0;
            if (tf0Var != null) {
            }
            og0Var = this.c0;
            if (og0Var != null) {
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
        if (this.e1 == 0) {
        }
        z13 = false;
        if (this.N4 == -1) {
        }
        if (this.actionBar != null) {
        }
        if (this.a != null) {
        }
        this.D0 = 0;
        qu0Var = this.a;
        if (qu0Var != null) {
        }
        tf0Var = this.a0;
        if (tf0Var != null) {
        }
        og0Var = this.c0;
        if (og0Var != null) {
        }
    }

    public final void O3() {
        v4.f1 f1Var;
        View view;
        if (this.a.getVisibility() != 0) {
            return;
        }
        if (this.Q) {
            this.O.setVisibleHeight(this.a.getMeasuredHeight() - this.O.getTop());
        }
        if (this.a.getChildCount() <= 0 || this.G1) {
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
            f1Var = (org.telegram.ui.Components.mj0) (F != null ? qu0Var.T(F) : null);
        }
        int top = view == null ? 0 : view.getTop();
        int i10 = (top < 0 || (f1Var != null ? f1Var.b() : -1) != 0) ? 0 : top;
        float a10 = view == null ? 1.0f : c8.l9.a((-top) / org.telegram.messenger.g0.L(12.0f), 0.0f, 1.0f);
        if (this.R5 != a10) {
            this.R5 = a10;
            D5();
        }
        int i11 = 1;
        boolean z10 = this.r0 == null && this.actionBar.o0;
        int i12 = this.N4;
        if (i12 != -1 && !z10) {
            org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) this.a.K(i12);
            z10 = mj0Var != null && mj0Var.a.getTop() <= 0;
        }
        if (this.X5 != z10) {
            this.X5 = z10;
            P3();
            AnimatorSet animatorSet = this.U5;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.V5;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            F5(true);
            L5();
            P5(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.actionBar, this.Y5, z10 ? 1.0f : 0.0f));
            this.O.L0.setOpen(z10);
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this, this.p5, 0.0f));
            }
            if (this.v0 != null || this.w0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new du0(this, 3));
                arrayList.add(ofFloat);
            }
            R3();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.U5 = animatorSet3;
            animatorSet3.playTogether(arrayList);
            this.U5.setInterpolator(org.telegram.ui.Components.nr.f);
            this.U5.addListener(new dv0(this, i11));
            this.U5.setDuration(150L);
            this.U5.start();
            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.u4, Boolean.TRUE);
        }
        float f10 = i10;
        if (this.Q1 == f10 || this.H1) {
            return;
        }
        this.Q1 = f10;
        this.d1.invalidate();
        if (this.J1 != 0) {
            this.M1 = this.Q1 > ((float) e4());
        }
        B4(true);
    }

    public final void O4() {
        TLRPC.User c22;
        if (this.e1 == 0 || c4() || (c22 = getMessagesController().c2(Long.valueOf(this.e1))) == null || (c22 instanceof TLRPC.TL_userEmpty)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.e1);
        if (getMessagesController().E(bundle, this, null, null)) {
            boolean z10 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
            if (!org.telegram.messenger.g0.Q1() && z10) {
                org.telegram.messenger.ls notificationCenter = getNotificationCenter();
                int i7 = org.telegram.messenger.ls.t;
                notificationCenter.n(this, i7);
                getNotificationCenter().k(i7, new Object[0]);
            }
            int i10 = getArguments().getInt("nearby_distance", -1);
            if (i10 >= 0) {
                bundle.putInt("nearby_distance", i10);
            }
            bn bnVar = new bn(bundle);
            org.telegram.messenger.si mediaDataController = getMediaDataController();
            TLRPC.Document document = mediaDataController.z0;
            mediaDataController.q1();
            bnVar.Y9 = document;
            bnVar.Z9 = false;
            presentFragment(bnVar, z10);
            if (!org.telegram.messenger.g0.Q1() || this.J0) {
                return;
            }
            finishFragment();
        }
    }

    public final void O5() {
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

    @Override // org.telegram.ui.ww
    public final /* synthetic */ boolean P(cx cxVar) {
        return false;
    }

    public final void P3() {
        vv0 vv0Var = this.O;
        if (vv0Var != null) {
            vv0Var.setPagesVisibleOverscanTop((this.X5 || this.W5 > 0.0f) ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0);
        }
    }

    public final void P4() {
        TLRPC.ChatFull chatFull = this.v2;
        if (chatFull == null || chatFull.linked_chat_id == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.v2.linked_chat_id);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new bn(bundle));
        }
    }

    public final void P5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        if ((this.v0 == null && this.w0 == null) || (kVar = this.actionBar) == null || this.simpleActionBar == null) {
            return;
        }
        float f10 = kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0.0f;
        int L = org.telegram.messenger.g0.L(7.0f);
        float right = this.simpleActionBar.getBackButton().getRight() + L;
        float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
        cv0 cv0Var = this.v0;
        if (cv0Var != null) {
            float A = com.google.android.gms.internal.vision.e2.A(this.actionBar.getHeight(), f10, 2.0f, f10);
            boolean z11 = Math.abs(right - cv0Var.g0) > 0.1f || Math.abs(menuPillLeft - cv0Var.h0) > 0.1f || Math.abs(A - cv0Var.i0) > 0.1f;
            cv0Var.g0 = right;
            cv0Var.h0 = menuPillLeft;
            if (z10) {
                cv0Var.n0.e(true, menuPillLeft);
            }
            cv0Var.i0 = A;
            if (z11) {
                cv0Var.invalidate();
            }
        }
        di.t0 t0Var = this.w0;
        if (t0Var != null) {
            float A2 = com.google.android.gms.internal.vision.e2.A(this.actionBar.getHeight(), f10, 2.0f, f10);
            int k42 = k4();
            boolean z12 = Math.abs(right - t0Var.r) > 0.1f || Math.abs(menuPillLeft - t0Var.s) > 0.1f || Math.abs(A2 - t0Var.w) > 0.1f;
            t0Var.r = right;
            t0Var.s = menuPillLeft;
            if (z10) {
                t0Var.E.e(true, menuPillLeft);
            }
            t0Var.w = A2;
            t0Var.y = k42 + A2;
            if (z12) {
                t0Var.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.Components.w30
    public final void Q(boolean z10, boolean z11) {
        org.telegram.ui.Cells.c4 c4Var = this.h0;
        if (c4Var == null) {
            return;
        }
        c4Var.setProgress(0.0f);
    }

    public final void Q3() {
        int i7 = this.J1;
        float f10 = 0.0f;
        if (i7 == 1 && (!this.r5 || this.G1)) {
            this.x6 = 0.0f;
        } else if (i7 == 2 && (!this.r5 || this.G1)) {
            bv0 bv0Var = this.r;
            this.x6 = bv0Var == null ? 0.0f : bv0Var.getAlpha();
        } else if (this.e1 == org.telegram.messenger.k10.i(this.currentAccount).n) {
            this.x6 = (1.0f - this.t5) * this.l2;
        } else {
            this.x6 = this.l2 * this.t5;
        }
        boolean z10 = this.e1 == org.telegram.messenger.k10.i(this.currentAccount).n;
        if (z10 && this.v5) {
            this.u5 = org.telegram.messenger.g0.L(28.0f) * this.x6;
            bv0 bv0Var2 = this.r;
            if (bv0Var2 != null) {
                bv0Var2.setTranslationX(m4(this.B6, this.D6));
                this.Z.invalidate();
            }
        }
        if (z10) {
            if (this.v5) {
                f10 = this.l2;
            }
        } else if (this.w5) {
            f10 = this.x6;
        }
        xw0 xw0Var = this.F6;
        if (xw0Var != null) {
            xw0Var.e = 1.0f - f10;
            xw0Var.invalidateSelf();
        }
        this.A6 = f10 > 0.5f;
        L5();
    }

    public final void Q4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.w2;
        if (userFull == null || (tL_businessLocation = userFull.business_location) == null) {
            return;
        }
        int i7 = 1;
        if (tL_businessLocation.geo_point == null || z10) {
            boolean z11 = org.telegram.messenger.s2.a;
            org.telegram.messenger.t0.r();
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?q=" + this.w2.business_location.address, new Object[0]))));
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        fi.f8 f8Var = new fi.f8(3, i7);
        f8Var.setResourceProvider(this.A0);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.local_id = -1;
        tL_message.peer_id = getMessagesController().B1(a());
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_businessLocation tL_businessLocation2 = this.w2.business_location;
        tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
        tL_messageMediaGeo.address = tL_businessLocation2.address;
        tL_message.media = tL_messageMediaGeo;
        f8Var.V0 = false;
        f8Var.G0(new org.telegram.messenger.gj(org.telegram.messenger.k10.t0, tL_message, false, false));
        presentFragment(f8Var);
    }

    public final void Q5() {
        try {
            uv uvVar = this.U;
            if (uvVar != null && (uvVar.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.U.getForeground()).setColor(i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.A0), 100));
            }
            float f10 = this.W5;
            Drawable drawable = this.E;
            int[] iArr = this.Y6;
            if (drawable != null) {
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.qi, this.A0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fj, this.A0));
                int i7 = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (S0 != i7) {
                    drawable.setColorFilter(new PorterDuffColorFilter(S0, mode));
                }
                iArr[6] = S0;
            }
            Drawable drawable2 = this.U6;
            if (drawable2 != null) {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.V6, this.A0);
                int i10 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (w02 != i10) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
                }
                iArr[3] = w02;
            }
            Drawable drawable3 = this.V6;
            if (drawable3 != null) {
                int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v8, this.A0);
                int i11 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (w03 != i11) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(w03, mode3));
                }
                iArr[4] = w03;
            }
            Drawable drawable4 = this.W6;
            if (drawable4 != null) {
                int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.A0);
                int i12 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (w04 != i12) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(w04, mode4));
                }
                iArr[5] = w04;
            }
            org.telegram.ui.Components.nq nqVar = this.X6;
            if (nqVar != null) {
                nqVar.y = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.nk, this.A0);
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

    @Override // org.telegram.ui.Components.ct0
    public final void R() {
        org.telegram.ui.Components.bt0 bt0Var;
        vv0 vv0Var = this.O;
        if (vv0Var != null && (bt0Var = this.R) != null) {
            vv0Var.setNewMediaCounts(bt0Var.c);
        }
        if (this.d != null) {
            H5(false, false);
        }
        W();
        if (this.w2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void R3() {
        org.telegram.ui.Components.xu0 xu0Var = this.T;
        if (xu0Var != null) {
            xu0Var.setVisibility(!this.X5 && this.d6);
        }
    }

    public final void R4(int i7, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        iv0 iv0Var = new iv0(this, user.id, this.f1, tL_chatAdminRights, this.F2.default_banned_rights, tL_chatBannedRights, str, i7, zArr, user);
        iv0Var.Y0 = new jv0(this, i7, chatParticipant, z10, zArr);
        presentFragment(iv0Var);
    }

    public final void R5() {
        TLRPC.UserFull userFull;
        if (this.Y0 == null) {
            return;
        }
        org.telegram.messenger.g0.X3(this.Y0, this.E2 == null && (((userFull = this.w2) != null && userFull.ttl_period > 0) || (this.v2 != null && org.telegram.messenger.v3.y(13, this.F2) && this.v2.ttl_period > 0)), 0.8f, true, this.r5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x03de, code lost:
    
        if (org.telegram.messenger.v3.q0(r1, org.telegram.messenger.np.u1(r1).t7.f(r2.id, r13)) != false) goto L171;
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
    public final void S3(boolean z10) {
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
        int i7;
        org.telegram.ui.Components.tf0 tf0Var;
        boolean z25;
        boolean z26;
        boolean z27;
        long j3;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || this.T0 == null) {
            return;
        }
        Context context = kVar.getContext();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.T0.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        this.O0 = false;
        this.M0 = false;
        this.L0 = false;
        this.N0 = false;
        this.A1 = false;
        boolean z28 = true;
        if (this.e1 == 0) {
            if (this.f1 != 0) {
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f1));
                this.p1 = false;
                if (this.g1 == 0 && org.telegram.messenger.v3.w(1, O0)) {
                    T3(context);
                }
                if (org.telegram.messenger.v3.T(O0)) {
                    if (this.q1) {
                        int i10 = this.currentAccount;
                        long j10 = this.g1;
                        if (!org.telegram.messenger.v3.y(15, O0)) {
                            if (O0 != null && O0.forum) {
                            }
                        }
                        this.O0 = true;
                    } else if (org.telegram.messenger.v3.N(O0) || (O0.megagroup && org.telegram.messenger.v3.w(1, O0))) {
                        this.O0 = true;
                    }
                    if (this.v2 != null) {
                        if (org.telegram.messenger.v3.w(14, O0) && this.v2.call == null) {
                            this.T0.e(15, R.drawable.msg_voicechat, (!O0.megagroup || O0.gigagroup) ? org.telegram.messenger.hd.N0(2131744661, null) : org.telegram.messenger.hd.N0(2131744659, null));
                            this.p1 = true;
                            if (!O0.megagroup || O0.gigagroup) {
                                z24 = false;
                                z21 = true;
                                chatFull2 = this.v2;
                                if ((!chatFull2.can_view_stats || chatFull2.can_view_revenue || chatFull2.can_view_stars_revenue || getMessagesController().R1().j(a())) && this.g1 == 0) {
                                    this.T0.e(19, R.drawable.msg_stats, org.telegram.messenger.hd.N0(2131744649, null));
                                }
                                org.telegram.messenger.t3 i12 = getMessagesController().i1(this.f1, false, null);
                                this.M0 = i12 == null;
                                z20 = i12 == null || z24;
                            } else {
                                z24 = true;
                            }
                        } else {
                            z24 = false;
                        }
                        z21 = false;
                        chatFull2 = this.v2;
                        if (!chatFull2.can_view_stats) {
                        }
                        this.T0.e(19, R.drawable.msg_stats, org.telegram.messenger.hd.N0(2131744649, null));
                        org.telegram.messenger.t3 i122 = getMessagesController().i1(this.f1, false, null);
                        this.M0 = i122 == null;
                        if (i122 == null) {
                        }
                    } else {
                        z20 = false;
                        z21 = false;
                    }
                    getMessagesController().R1();
                    if (O0 == null || !org.telegram.messenger.v3.R(O0) || (!O0.creator && ((tL_chatAdminRights2 = O0.admin_rights) == null || !tL_chatAdminRights2.post_stories))) {
                        getMessagesController().R1();
                        if (O0 != null && org.telegram.messenger.v3.R(O0) && (O0.creator || ((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.edit_stories))) {
                            this.T0.e(39, R.drawable.msg_archive, org.telegram.messenger.hd.N0(2131747616, null));
                        }
                        z22 = false;
                    } else {
                        this.T0.e(39, R.drawable.msg_archive, org.telegram.messenger.hd.N0(2131747616, null));
                        z22 = true;
                    }
                    if (!O0.megagroup) {
                        if (org.telegram.messenger.v3.t0(O0)) {
                            this.T0.e(10, R.drawable.msg_share, org.telegram.messenger.hd.N0(2131752970, null));
                            z12 = !O0.creator;
                        } else {
                            z12 = false;
                        }
                        boolean z29 = org.telegram.messenger.s2.a;
                        if (getMessagesController().k7) {
                            z23 = false;
                        } else {
                            di.y8.y(this.currentAccount, false).T();
                            this.T0.e(38, R.drawable.msg_gift_premium, org.telegram.messenger.hd.N0(2131746440, null));
                            org.telegram.ui.ActionBar.g5 g5Var = this.T0;
                            TLRPC.ChatFull chatFull3 = this.v2;
                            g5Var.R(38, chatFull3 != null && chatFull3.stargifts_available);
                            z23 = true;
                        }
                        TLRPC.ChatFull chatFull4 = this.v2;
                        if (chatFull4 == null || chatFull4.linked_chat_id == 0) {
                            z15 = false;
                        } else {
                            this.T0.e(22, R.drawable.msg_discussion, org.telegram.messenger.hd.N0(2131743310, null));
                            z15 = true;
                        }
                        if (this.g1 == 0) {
                            this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.N0(2131754387, null));
                        }
                        TLRPC.Chat chat = this.F2;
                        if (chat.creator) {
                            this.T0.a(-1);
                            this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.N0(2131748811, null));
                            this.T0.e(45, R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131752410, null)).c(org.telegram.ui.ActionBar.m6.q7, org.telegram.ui.ActionBar.m6.p7);
                        } else if (chat.left || chat.kicked) {
                            z17 = z23;
                            z16 = z21;
                            z13 = z22;
                            z28 = false;
                            z14 = z20;
                        } else {
                            this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.N0(2131748811, null));
                        }
                        z17 = z23;
                        z16 = z21;
                        z13 = z22;
                        z28 = false;
                        z14 = z20;
                        z11 = true;
                        if (this.r0 == null) {
                        }
                        if (w4()) {
                        }
                        if (this.e1 != 0) {
                            org.telegram.ui.ActionBar.y0 e10 = this.T0.e(24, R.drawable.msg_report, org.telegram.messenger.hd.N0(2131746035, null));
                            int i11 = org.telegram.ui.ActionBar.m6.p7;
                            e10.c(i11, i11);
                        }
                        if (z28) {
                            this.T0.e(31, R.drawable.msg_leave, org.telegram.messenger.hd.N0(2131748550, null));
                        }
                        if (!this.q2) {
                        }
                        this.L0 = this.M0;
                        tf0Var = this.a0;
                        if (tf0Var == null) {
                        }
                        F5(z10);
                        P5(z25);
                    }
                    TLRPC.ChatFull chatFull5 = this.v2;
                    if (chatFull5 == null || !chatFull5.participants_hidden || org.telegram.messenger.v3.N(O0)) {
                        this.A1 = true;
                        this.T0.e(17, R.drawable.msg_search, org.telegram.messenger.hd.N0(2131745561, null));
                    }
                    if (this.q1) {
                        int i13 = this.currentAccount;
                        long j11 = this.g1;
                        if (j11 != 1 && org.telegram.messenger.v3.e(i13, O0, org.telegram.messenger.np.u1(i13).t7.f(O0.id, j11))) {
                            this.T0.e(23, R.drawable.msg_delete, org.telegram.messenger.hd.K0(1, "DeleteTopics"));
                        }
                    }
                    if (this.g1 == 0) {
                        this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.N0(2131754387, null));
                    }
                    if (O0.creator) {
                        this.T0.a(-1);
                        this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.N0(2131748798, null));
                        this.T0.e(45, R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131751518, null)).c(org.telegram.ui.ActionBar.m6.q7, org.telegram.ui.ActionBar.m6.p7);
                    } else if (O0.left || O0.kicked || this.q1) {
                        z16 = z21;
                        z13 = z22;
                        z12 = false;
                        z28 = false;
                        z15 = false;
                        z17 = false;
                        z14 = z20;
                    } else {
                        this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.N0(2131748798, null));
                    }
                    z16 = z21;
                    z13 = z22;
                    z12 = false;
                    z28 = false;
                    z15 = false;
                    z17 = false;
                    z14 = z20;
                    z11 = true;
                    if (this.r0 == null) {
                        this.T0.e(33, R.drawable.msg_openprofile, org.telegram.messenger.hd.N0(2131745346, null));
                        i7 = 21;
                        this.T0.e(21, R.drawable.msg_gallery, org.telegram.messenger.hd.N0(2131745733, null));
                        this.T0.e(35, R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131751586, null));
                    } else {
                        i7 = 21;
                        this.T0.e(21, R.drawable.msg_gallery, org.telegram.messenger.hd.N0(2131745733, null));
                    }
                    if (w4()) {
                        this.T0.u(i7);
                    }
                    if (this.e1 != 0 && !this.s2 && !this.s1) {
                        org.telegram.ui.ActionBar.y0 e102 = this.T0.e(24, R.drawable.msg_report, org.telegram.messenger.hd.N0(2131746035, null));
                        int i112 = org.telegram.ui.ActionBar.m6.p7;
                        e102.c(i112, i112);
                    }
                    if (z28 && !this.s1) {
                        this.T0.e(31, R.drawable.msg_leave, org.telegram.messenger.hd.N0(2131748550, null));
                    }
                    if (!this.q2) {
                        this.T0.u(21);
                        this.T0.u(33);
                        this.T0.T(36);
                        this.T0.u(34);
                        this.T0.u(35);
                    }
                    this.L0 = this.M0;
                    tf0Var = this.a0;
                    if (tf0Var == null) {
                        tf0Var.G = true;
                        tf0Var.o(4, z12);
                        this.a0.o(5, this.M0);
                        this.a0.o(6, this.N0);
                        this.a0.o(2, z15);
                        this.a0.o(9, z11);
                        this.a0.o(12, z13);
                        this.a0.o(10, z14);
                        this.a0.o(11, z16);
                        this.a0.o(3, z17);
                        z25 = false;
                        this.N0 = false;
                        this.M0 = false;
                        if (!z15) {
                            if (this.q1) {
                                this.a0.o(0, true);
                            } else {
                                if (this.f1 != 0) {
                                    TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(this.f1));
                                    if (org.telegram.messenger.v3.c0(O02) || org.telegram.messenger.v3.n0(O02)) {
                                        z25 = false;
                                        this.a0.o(0, true);
                                    } else if (!org.telegram.messenger.v3.T(O02)) {
                                        z25 = false;
                                        this.a0.o(0, true);
                                    }
                                }
                                z25 = false;
                            }
                        }
                        org.telegram.ui.Components.tf0 tf0Var2 = this.a0;
                        if (tf0Var2.G) {
                            tf0Var2.G = z25;
                            tf0Var2.d();
                        }
                    } else {
                        z25 = false;
                    }
                    F5(z10);
                    P5(z25);
                }
                if (this.v2 != null) {
                    if (org.telegram.messenger.v3.w(14, O0) && this.v2.call == null) {
                        this.T0.e(15, R.drawable.msg_voicechat, org.telegram.messenger.hd.N0(2131744659, null));
                        this.p1 = true;
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    org.telegram.messenger.t3 i14 = getMessagesController().i1(this.f1, false, null);
                    this.M0 = i14 != null;
                    if (i14 != null || z19) {
                        z18 = true;
                        if (org.telegram.messenger.v3.w(1, O0)) {
                            this.O0 = true;
                        }
                        if (!org.telegram.messenger.v3.k0(O0) && !org.telegram.messenger.v3.l0(O0) && ((chatFull = this.v2) == null || !chatFull.participants_hidden || org.telegram.messenger.v3.N(O0))) {
                            this.A1 = true;
                            this.T0.e(17, R.drawable.msg_search, org.telegram.messenger.hd.N0(2131745561, null));
                        }
                        if (this.g1 == 0) {
                            this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.N0(2131754387, null));
                        }
                        this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.N0(2131751561, null));
                        z14 = z18;
                        z11 = true;
                        z12 = false;
                        z13 = false;
                    }
                }
                z18 = false;
                if (org.telegram.messenger.v3.w(1, O0)) {
                }
                if (!org.telegram.messenger.v3.k0(O0)) {
                    this.A1 = true;
                    this.T0.e(17, R.drawable.msg_search, org.telegram.messenger.hd.N0(2131745561, null));
                }
                if (this.g1 == 0) {
                }
                this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.N0(2131751561, null));
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
            if (this.r0 == null) {
            }
            if (w4()) {
            }
            if (this.e1 != 0) {
            }
            if (z28) {
            }
            if (!this.q2) {
            }
            this.L0 = this.M0;
            tf0Var = this.a0;
            if (tf0Var == null) {
            }
            F5(z10);
            P5(z25);
        }
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.e1));
        if (c22 == null) {
            return;
        }
        if (org.telegram.messenger.p10.C(c22)) {
            if (this.s1) {
                org.telegram.ui.Components.tf0 tf0Var3 = this.a0;
                if (tf0Var3 != null) {
                    this.O0 = !(tf0Var3.F == 6);
                } else {
                    this.O0 = true;
                }
            }
            if (!this.J0) {
                this.T0.e(30, R.drawable.msg_edit, org.telegram.messenger.hd.N0(2131751266, null));
                if (this.r0 != null) {
                    this.T0.e(36, R.drawable.msg_addphoto, org.telegram.messenger.hd.N0(2131754389, null));
                }
            }
            this.V0 = this.T0.e(40, R.drawable.menu_profile_colors, org.telegram.messenger.hd.N0(2131746484, null));
            u5();
            if (this.s1) {
                this.X0 = this.T0.e(43, R.drawable.menu_username_change, org.telegram.messenger.hd.N0(2131746424, null));
                this.W0 = this.T0.e(42, R.drawable.msg_link2, org.telegram.messenger.hd.N0(2131746483, null));
                G5();
            }
            z26 = false;
            z27 = false;
        } else {
            if (c22.bot && c22.bot_can_edit) {
                this.O0 = true;
            }
            TLRPC.UserFull userFull = this.w2;
            if (userFull != null && userFull.phone_calls_available) {
                this.M0 = true;
                this.N0 = userFull.video_calls_available;
            }
            if (!this.s2 && getContactsController().g0.get(Long.valueOf(this.e1)) != null) {
                if (this.E2 == null) {
                    T3(context);
                }
                if (!TextUtils.isEmpty(c22.phone)) {
                    this.T0.e(3, R.drawable.msg_share, org.telegram.messenger.hd.N0(2131745265, null));
                }
                this.T0.e(2, R.drawable.msg_block, !this.k1 ? org.telegram.messenger.hd.N0(2131753690, null) : org.telegram.messenger.hd.N0(2131743666, null));
                this.T0.e(4, R.drawable.msg_edit, org.telegram.messenger.hd.N0(2131751270, null));
                this.T0.e(5, R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131751540, null));
            } else if (org.telegram.messenger.np.L2(c22)) {
                if (this.k1) {
                    this.T0.e(2, R.drawable.msg_block, org.telegram.messenger.hd.N0(2131743666, null));
                }
                this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.N0(2131754387, null));
            } else if (a() != 489000) {
                if (this.E2 == null) {
                    T3(context);
                }
                this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.N0(2131754387, null));
                if (this.s2) {
                    this.T0.e(10, R.drawable.msg_share, org.telegram.messenger.hd.N0(2131752970, null));
                    z26 = true;
                } else {
                    this.T0.e(1, R.drawable.msg_addcontact, org.telegram.messenger.hd.N0(2131754450, null));
                    z26 = false;
                }
                if (!TextUtils.isEmpty(c22.phone)) {
                    this.T0.e(3, R.drawable.msg_share, org.telegram.messenger.hd.N0(2131745265, null));
                }
                if (this.s2) {
                    this.T0.e(44, R.drawable.menu_privacy_policy, org.telegram.messenger.hd.N0(2131752998, null));
                    if (u4()) {
                        this.T0.T(44);
                    } else {
                        this.T0.u(44);
                    }
                    org.telegram.ui.ActionBar.y0 e11 = this.T0.e(24, R.drawable.msg_report, org.telegram.messenger.hd.N0(2131746035, null));
                    int i15 = org.telegram.ui.ActionBar.m6.p7;
                    e11.c(i15, i15);
                    if (this.k1) {
                        this.T0.e(2, R.drawable.msg_retry, org.telegram.messenger.hd.N0(2131752983, null));
                    } else {
                        this.T0.e(2, R.drawable.msg_block2, org.telegram.messenger.hd.N0(2131751562, null)).c(i15, i15);
                    }
                } else {
                    this.T0.e(2, R.drawable.msg_block, !this.k1 ? org.telegram.messenger.hd.N0(2131753690, null) : org.telegram.messenger.hd.N0(2131743666, null));
                }
                if (!org.telegram.messenger.p10.y(c22) && !this.s2 && this.E2 == null && !this.k1) {
                    j3 = this.e1;
                    if (j3 != 333000 && j3 != 777000 && j3 != 42777) {
                        boolean z30 = org.telegram.messenger.s2.a;
                        if (!c22.self || c22.bot || org.telegram.messenger.np.L2(c22) || getMessagesController().k7) {
                            z27 = false;
                        } else {
                            di.y8.y(this.currentAccount, false).T();
                            this.T0.e(38, R.drawable.msg_gift_premium, org.telegram.messenger.hd.N0(2131746441, null));
                            z27 = true;
                        }
                        if (((org.telegram.messenger.h0) getMessagesController().A7.p0.b).c && !org.telegram.messenger.np.L2(c22) && !org.telegram.messenger.p10.B(c22.id)) {
                            this.T0.e(48, R.drawable.ic_gram, org.telegram.messenger.hd.N0(2131742751, null));
                        }
                        this.T0.e(20, R.drawable.msg_secret, org.telegram.messenger.hd.N0(2131744669, null));
                        org.telegram.ui.ActionBar.g5 g5Var2 = this.T0;
                        TL_account.RequirementToContact P2 = getMessagesController().P2(this.e1);
                        g5Var2.R(20, P2 != null || (P2 instanceof TL_account.requirementToContactEmpty));
                        if (this.w2 != null) {
                            this.T0.e(46, R.drawable.menu_share_off_24, org.telegram.messenger.hd.N0(2131751416, null));
                            this.T0.e(47, R.drawable.menu_share_on_24, org.telegram.messenger.hd.N0(2131751138, null));
                            TLRPC.UserFull userFull2 = this.w2;
                            boolean z31 = (userFull2.noforwards_my_enabled || userFull2.noforwards_peer_enabled) ? false : true;
                            this.T0.R(46, z31);
                            this.T0.R(47, !z31);
                        }
                        if (!this.s2 && getContactsController().g0.get(Long.valueOf(this.e1)) != null) {
                            this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.N0(2131754387, null));
                        }
                        z28 = false;
                    }
                }
                z27 = false;
                if (!this.s2) {
                    this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.N0(2131754387, null));
                }
                z28 = false;
            }
            z26 = false;
            if (!org.telegram.messenger.p10.y(c22)) {
                j3 = this.e1;
                if (j3 != 333000) {
                    boolean z302 = org.telegram.messenger.s2.a;
                    if (c22.self) {
                    }
                    z27 = false;
                    if (((org.telegram.messenger.h0) getMessagesController().A7.p0.b).c) {
                        this.T0.e(48, R.drawable.ic_gram, org.telegram.messenger.hd.N0(2131742751, null));
                    }
                    this.T0.e(20, R.drawable.msg_secret, org.telegram.messenger.hd.N0(2131744669, null));
                    org.telegram.ui.ActionBar.g5 g5Var22 = this.T0;
                    TL_account.RequirementToContact P22 = getMessagesController().P2(this.e1);
                    g5Var22.R(20, P22 != null || (P22 instanceof TL_account.requirementToContactEmpty));
                    if (this.w2 != null) {
                    }
                    if (!this.s2) {
                    }
                    z28 = false;
                }
            }
            z27 = false;
            if (!this.s2) {
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
        if (this.r0 == null) {
        }
        if (w4()) {
        }
        if (this.e1 != 0) {
        }
        if (z28) {
        }
        if (!this.q2) {
        }
        this.L0 = this.M0;
        tf0Var = this.a0;
        if (tf0Var == null) {
        }
        F5(z10);
        P5(z25);
    }

    public final void S4(String str, org.telegram.ui.Cells.g gVar) {
        if (str.startsWith("@")) {
            getMessagesController().F3(str.substring(1), this, 0, gVar);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            cx cxVar = new cx(null);
            cxVar.p2 = str;
            presentFragment(cxVar);
        } else {
            if (!str.startsWith("/") || this.parentLayout.getFragmentStack().size() <= 1) {
                return;
            }
            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if (g2Var instanceof bn) {
                finishFragment();
                ((bn) g2Var).a0.C1(null, str, false, false);
            }
        }
    }

    public final void S5(boolean z10) {
        boolean z11;
        TLRPC.ChatFull chatFull;
        float L3 = L3();
        this.d6 = L3 > 0.2f && !this.X1 && (this.r0 == null || this.P2 == -1);
        R3();
        org.telegram.ui.Components.rh0 rh0Var = this.s;
        if (rh0Var == null || rh0Var.getVisibility() == 8) {
            z11 = false;
        } else {
            this.s.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) + this.Q1) + this.U1) - org.telegram.messenger.g0.L(29.5f));
            z11 = L3 > 0.2f && !this.X1 && !this.s1 && (this.r0 == null || this.P2 == -1);
            if (z11 && this.f1 != 0) {
                z11 = (!org.telegram.messenger.v3.T(this.F2) || this.F2.megagroup || (chatFull = this.v2) == null || chatFull.linked_chat_id == 0 || (this.E3 == -1 && this.F3 == -1)) ? false : true;
            }
            if (!this.G1) {
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
                        int i7 = 3;
                        if (z11) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.rh0, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.rh0, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.rh0, Float>) View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.rh0, Float>) View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.rh0, Float>) View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.rh0, Float>) View.ALPHA, 0.0f));
                        }
                        this.w.setDuration(150L);
                        this.w.addListener(new dv0(this, i7));
                        this.w.start();
                    } else {
                        this.s.setScaleX(z11 ? 1.0f : 0.2f);
                        this.s.setScaleY(z11 ? 1.0f : 0.2f);
                        this.s.setAlpha(z11 ? 1.0f : 0.0f);
                    }
                }
            }
        }
        cv0 cv0Var = this.v0;
        if (cv0Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
            int i10 = this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0;
            cv0Var.j0 = measuredWidth;
            cv0Var.l0 = z11;
            cv0Var.k0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10;
            cv0Var.invalidate();
        }
        di.t0 t0Var = this.w0;
        if (t0Var != null) {
            t0Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0) + this.Q1 + this.U1);
        }
    }

    public final void T3(Context context) {
        this.a1 = new org.telegram.messenger.qe(context, this.T0.getPopupLayout().getSwipeBack(), new pu0(this), false, 0, this.A0);
        if (this.i1 > 0 || this.e1 > 0) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.n6, this.A0);
            org.telegram.messenger.qe qeVar = this.a1;
            org.telegram.ui.Components.m80 m80Var = (org.telegram.ui.Components.m80) qeVar.e;
            if (m80Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131753845, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.O2(org.telegram.messenger.hd.N0(2131753844, null), w02, new org.telegram.ui.Components.og(qeVar, 10)));
                m80Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.w2;
        org.telegram.ui.Components.l01 a10 = org.telegram.ui.Components.l01.a((userFull == null && this.v2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.v2.ttl_period);
        this.t0 = a10;
        this.Z0 = this.T0.i(0, a10, org.telegram.messenger.hd.N0(2131753843, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.a1.b);
        this.T0.a(-1);
        r5();
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x047f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T4(float f10, float f11, int i7, View view) {
        TLRPC.Chat O0;
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
        int i10 = 25;
        int i11 = 4;
        String str3 = "";
        String str4 = null;
        int i12 = 1;
        int i13 = 0;
        if (i7 == this.M3 || i7 == this.W2) {
            if (this.e1 == 0) {
                if (this.f1 != 0 && (O0 = getMessagesController().O0(Long.valueOf(this.f1))) != null && (this.g1 != 0 || org.telegram.messenger.v3.t0(O0))) {
                    K = org.telegram.messenger.v3.K(O0, false);
                    b10 = org.telegram.messenger.n5.b(K, O0.usernames);
                    if (this.e1 != 0) {
                    }
                }
                return false;
            }
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.e1));
            K = org.telegram.messenger.p10.o(c22);
            if (c22 != null && K != null) {
                b10 = org.telegram.messenger.n5.b(K, c22.usernames);
                if (this.e1 != 0) {
                    TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(this.f1));
                    if (org.telegram.messenger.v3.t0(O02)) {
                        StringBuilder sb3 = new StringBuilder("https://");
                        sb3.append(getMessagesController().X2);
                        sb3.append("/");
                        sb3.append(org.telegram.messenger.v3.K(O02, false));
                        if (this.g1 != 0) {
                            str3 = "/" + this.g1;
                        }
                        sb3.append(str3);
                        sb2 = sb3.toString();
                    } else {
                        StringBuilder sb4 = new StringBuilder("https://");
                        sb4.append(getMessagesController().X2);
                        sb4.append("/c/");
                        sb4.append(O02.id);
                        if (this.g1 != 0) {
                            str3 = "/" + this.g1;
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
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo, new mo0(this, b10, kv0Var, i11)), getClassGuid());
                        return true;
                    }
                } else if (!Z3(i7, view3)) {
                    if (b10 != null && !b10.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo2 = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername2 = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername2.username = b10.username;
                        tL_getCollectibleInfo2.collectible = tL_inputCollectibleUsername2;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo2, new e00(i10, this, b10)), getClassGuid());
                        return true;
                    }
                    try {
                        org.telegram.ui.Components.lc.b0(this).i(org.telegram.messenger.hd.N0(2131743420, null)).j();
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
        if (i7 != this.I3) {
            int i14 = 2;
            if (i7 == this.H3 || i7 == this.U2) {
                if (!Z3(i7, view3)) {
                    TLRPC.User c23 = getMessagesController().c2(Long.valueOf(this.e1));
                    if (c23 != null && (str = c23.phone) != null && str.length() != 0 && getParentActivity() != null) {
                        if (i7 == this.H3 && c23.phone.startsWith("888")) {
                            TL_fragment.TL_inputCollectiblePhone tL_inputCollectiblePhone = new TL_fragment.TL_inputCollectiblePhone();
                            String str5 = c23.phone;
                            tL_inputCollectiblePhone.phone = str5;
                            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo3 = new TL_fragment.TL_getCollectibleInfo();
                            tL_getCollectibleInfo3.collectible = tL_inputCollectiblePhone;
                            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo3, new mo0(this, str5, c23, 5)), getClassGuid());
                            return true;
                        }
                        org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(this, view3);
                        I.X(this.a.U0(view3, false));
                        I.w = false;
                        if (i7 == this.H3) {
                            TLRPC.UserFull userFull3 = this.w2;
                            if (userFull3 != null && userFull3.phone_calls_available) {
                                I.c(R.drawable.msg_calls, org.telegram.messenger.hd.N0(2131752588, null), new vt0(this, c23, i12), false);
                                if (this.w2.video_calls_available) {
                                    I.c(R.drawable.msg_videocall, org.telegram.messenger.hd.N0(2131743363, null), new vt0(this, c23, i14), false);
                                }
                            }
                            if (!this.g5) {
                                I.c(R.drawable.msg_calls_regular, org.telegram.messenger.hd.N0(2131752622, null), new vt0(this, c23, 3), false);
                            }
                        }
                        I.c(R.drawable.msg_copy, org.telegram.messenger.hd.N0(2131751755, null), new vt0(this, c23, i11), false);
                        if (this.g5) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131754247, null)));
                            int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                            int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                                int i15 = lastIndexOf - 1;
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.l41(org.telegram.messenger.g0.o()), indexOf, i15, 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.k00(org.telegram.ui.ActionBar.m6.I6, this.A0), indexOf, i15, 33);
                            }
                            I.k();
                            I.p(13, org.telegram.messenger.g0.L(200.0f), spannableStringBuilder);
                            if (I.A() instanceof TextView) {
                                TextView textView = (TextView) I.A();
                                int i16 = org.telegram.ui.ActionBar.m6.I5;
                                org.telegram.ui.ActionBar.t6.Q(textView, org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i16, this.A0), 0, 6), null, org.telegram.ui.ActionBar.t6.M(i16), this.A0);
                                textView.setOnClickListener(new bi.o(i10));
                            }
                        }
                        I.a0();
                        return true;
                    }
                }
                return true;
            }
            if (i7 == this.L3 || i7 == this.K3 || i7 == this.J3 || i7 == this.X2) {
                if (i7 != this.X2 || ((userFull = this.w2) != null && !TextUtils.isEmpty(userFull.about))) {
                    if (!Z3(i7, view3)) {
                        if (view3 instanceof org.telegram.ui.Cells.j) {
                            org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view3;
                            if (jVar.c0 && jVar.W <= 0.0f) {
                                jVar.h();
                                return false;
                            }
                        }
                        if (i7 == this.J3) {
                            TLRPC.ChatFull chatFull = this.v2;
                            if (chatFull != null) {
                                TLRPC.ChannelLocation channelLocation = chatFull.location;
                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                    str4 = ((TLRPC.TL_channelLocation) channelLocation).address;
                                }
                            }
                        } else if (i7 == this.L3) {
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
                            boolean s5 = org.telegram.messenger.np.u1(this.currentAccount).v7.s();
                            boolean[] zArr = {i7 == this.X2 || i7 == this.L3 || i7 == this.K3};
                            String N0 = org.telegram.ui.Components.b31.N0();
                            bi.f5 f5Var = new bi.f5(this, view3, str6, i7, zArr, strArr, N0);
                            if (zArr[0]) {
                                org.telegram.messenger.c6.d(str6, new org.telegram.ui.Components.xd(this, strArr, zArr, N0, s5, f5Var), new qi0(f5Var, 11), false);
                                return true;
                            }
                            f5Var.run();
                            return true;
                        }
                    }
                    return true;
                }
            } else if ((i7 == this.P3 || i7 == this.Q3) && getParentActivity() != null && (userFull2 = this.w2) != null) {
                if (i7 != this.P3) {
                    if (i7 == this.Q3 && !Z3(i7, view3)) {
                        TLRPC.TL_businessLocation tL_businessLocation = this.w2.business_location;
                        if (tL_businessLocation != null) {
                            str2 = tL_businessLocation.address;
                            String str7 = str2;
                            AtomicReference atomicReference = new AtomicReference();
                            org.telegram.ui.Components.po poVar = new org.telegram.ui.Components.po(R.drawable.popup_fixed_alert, i13, 1, getParentActivity(), this.A0);
                            poVar.V = new Path();
                            poVar.setFitItems(true);
                            org.telegram.ui.ActionBar.q0.c(false, false, poVar, R.drawable.msg_copy, org.telegram.messenger.hd.N0(2131751755, null), false, this.A0).setOnClickListener(new fi.k5(this, atomicReference, str7, i7, 7));
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(poVar, -2, -2);
                            g1Var.e = true;
                            g1Var.c = org.telegram.messenger.ls.x3;
                            g1Var.setOutsideTouchable(true);
                            g1Var.setClippingEnabled(true);
                            g1Var.setAnimationStyle(R.style.PopupContextAnimation);
                            g1Var.setFocusable(true);
                            poVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
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
                            g1Var.showAtLocation(getFragmentView(), 0, (int) (f12 - (poVar.getMeasuredWidth() / 2.0f)), (int) f13);
                            g1Var.b();
                            return true;
                        }
                    }
                    return true;
                }
                TL_account.TL_businessWorkHours tL_businessWorkHours = userFull2.business_work_hours;
                if (tL_businessWorkHours != null) {
                    str2 = kg.e1.k0(this.currentAccount, userFull2.user, tL_businessWorkHours);
                    String str72 = str2;
                    AtomicReference atomicReference2 = new AtomicReference();
                    org.telegram.ui.Components.po poVar2 = new org.telegram.ui.Components.po(R.drawable.popup_fixed_alert, i13, 1, getParentActivity(), this.A0);
                    poVar2.V = new Path();
                    poVar2.setFitItems(true);
                    org.telegram.ui.ActionBar.q0.c(false, false, poVar2, R.drawable.msg_copy, org.telegram.messenger.hd.N0(2131751755, null), false, this.A0).setOnClickListener(new fi.k5(this, atomicReference2, str72, i7, 7));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(poVar2, -2, -2);
                    g1Var2.e = true;
                    g1Var2.c = org.telegram.messenger.ls.x3;
                    g1Var2.setOutsideTouchable(true);
                    g1Var2.setClippingEnabled(true);
                    g1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                    g1Var2.setFocusable(true);
                    poVar2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
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
                    g1Var2.showAtLocation(getFragmentView(), 0, (int) (f12 - (poVar2.getMeasuredWidth() / 2.0f)), (int) f13);
                    g1Var2.b();
                    return true;
                }
            }
        }
        return false;
    }

    public final void T5() {
        org.telegram.ui.Components.gq0 gq0Var;
        org.telegram.ui.Components.fr0 fr0Var;
        org.telegram.ui.Components.m80 m80Var;
        int w02;
        this.o6.clear();
        zw0 zw0Var = this.d1;
        if (zw0Var != null) {
            zw0Var.a(this.n6, true);
        }
        bv0 bv0Var = this.r;
        if (bv0Var != null) {
            this.r.setTextColor(i0.a.f(this.l2, I3(bv0Var.getTag() instanceof Integer ? org.telegram.ui.ActionBar.m6.w0(((Integer) this.r.getTag()).intValue(), this.A0) : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, this.A0), Boolean.valueOf(this.K0[0])), -1275068417));
        }
        xw0 xw0Var = this.F6;
        if (xw0Var != null) {
            xw0Var.a(i0.a.f(this.l2, org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.b(0.18f, -0.1f, this.c1)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.G(i0.a.f(this.W5, this.n6 != null ? -1 : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v8, this.A0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.y8, this.A0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            org.telegram.messenger.cp cpVar = this.n6;
            kVar2.F(i0.a.f(this.W5, cpVar != null ? 1090519039 : cpVar != null ? 553648127 : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f8, this.A0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z8, this.A0)), false);
        }
        if (this.y != null) {
            org.telegram.messenger.cp cpVar2 = this.n6;
            if (cpVar2 != null) {
                w02 = org.telegram.ui.ActionBar.m6.b(0.1f, org.telegram.ui.ActionBar.m6.I.q() ? -0.1f : -0.08f, i0.a.f(0.4f, cpVar2.g(), this.n6.o(org.telegram.ui.ActionBar.m6.I.q()) ? this.n6.k() : this.n6.i()));
            } else {
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.qi, this.A0);
            }
            this.y.setColorFilter(org.telegram.messenger.g0.S0(this.W5, 1.0f, w02, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fj, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.I != null) {
            this.I.setColorFilter(org.telegram.messenger.g0.S0(this.W5, 1.0f, this.n6 != null ? -1 : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.ri, this.A0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        pk pkVar = this.f;
        if (pkVar != null) {
            pkVar.setTextColor(i0.a.f(this.l2, i0.a.f(this.W5, this.n6 != null ? -1 : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.mi, this.A0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fj, this.A0)), -1));
        }
        org.telegram.messenger.qe qeVar = this.a1;
        if (qeVar != null && (m80Var = (org.telegram.ui.Components.m80) qeVar.e) != null) {
            m80Var.invalidate();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.n6 == null ? i0.a.f(this.T1, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.gd, this.A0), -1) : -1, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.og0 og0Var = this.c0;
        if (og0Var != null) {
            og0Var.setColor(this.n6);
        }
        org.telegram.messenger.g0.d0(this.a, new gu0(this, 3));
        vv0 vv0Var = this.O;
        if (vv0Var != null && (fr0Var = vv0Var.L0) != null) {
            fr0Var.updateColors();
        }
        vv0 vv0Var2 = this.O;
        if (vv0Var2 != null && (gq0Var = vv0Var2.b0) != null) {
            gq0Var.m();
        }
        U5();
        v5();
        cv0 cv0Var = this.v0;
        if (cv0Var != null) {
            cv0Var.f(true, true);
        }
        di.t0 t0Var = this.w0;
        if (t0Var != null) {
            t0Var.a();
        }
    }

    public final void U3() {
        if (this.fragmentView == null || !this.u6 || this.z2 == null || getParentActivity() == null) {
            return;
        }
        dx0 dx0Var = this.G6;
        if (dx0Var != null) {
            dx0Var.b(this.z2);
            this.G6.invalidate();
        } else {
            dx0 dx0Var2 = new dx0(this, this.z2);
            this.G6 = dx0Var2;
            ((FrameLayout) this.fragmentView).addView(dx0Var2, c8.ma.e(-1, -1, 55));
        }
    }

    public final void U4() {
        ValueAnimator valueAnimator;
        if (!this.q2 || (valueAnimator = this.k2) == null || !valueAnimator.isRunning()) {
            V4(L3(), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0));
        } else {
            this.f2 = this.g6;
            this.h2 = this.h6;
        }
    }

    public final void U5() {
        if (this.s == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.oi, this.A0);
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.pi, this.A0);
            int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.ni, this.A0);
            if (this.n6 != null && org.telegram.ui.ActionBar.m6.e1(w02)) {
                w02 = org.telegram.ui.ActionBar.m6.b(0.05f, -0.04f, this.n6.c(false));
                org.telegram.messenger.cp cpVar = this.n6;
                if (cpVar != null) {
                    int d = cpVar.d(org.telegram.ui.ActionBar.m6.I.q());
                    w03 = org.telegram.ui.ActionBar.m6.D(org.telegram.ui.ActionBar.m6.I.q(), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v6, this.A0), d, w03, d);
                }
                w04 = -1;
            }
            org.telegram.ui.Components.rh0 rh0Var = this.v6;
            org.telegram.ui.Components.rh0 rh0Var2 = this.s;
            int[] iArr = this.w6;
            if (rh0Var == rh0Var2 && iArr[0] == w02 && iArr[1] == w03 && iArr[2] == w04) {
                return;
            }
            this.v6 = rh0Var2;
            iArr[0] = w02;
            iArr[1] = w03;
            iArr[2] = w04;
            Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(mutate, org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(56.0f), w02, w03), 0, 0);
            int L = org.telegram.messenger.g0.L(56.0f);
            int L2 = org.telegram.messenger.g0.L(56.0f);
            oqVar.e = L;
            oqVar.f = L2;
            this.s.setBackground(oqVar);
            this.s.setColorFilter(new PorterDuffColorFilter(w04, mode));
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.w30
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new li.l(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final void V3(Context context) {
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            org.telegram.messenger.g0.E2(z4Var);
        }
        mv0 mv0Var = new mv0(this, context, this.A0);
        this.simpleActionBar = mv0Var;
        mv0Var.setTitlesAlpha(0.0f);
        if (!this.r5 && !this.J0 && this.J1 != 0 && this.M1 && !this.N1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        this.simpleActionBar.setMenuOverlayProvider(new qe(3, this));
        if (this.J0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.outline_header_qr_24);
            this.simpleActionBar.setBackButtonContentDescription(org.telegram.messenger.hd.N0(2131746304, null));
        } else {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 5));
        if (this.J0) {
            return;
        }
        View backButton = this.simpleActionBar.getBackButton();
        backButton.setOnLongClickListener(new fi.z1(6, this, backButton));
    }

    public final void V4(float f10, float f11) {
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - j4()) / ((this.a.getMeasuredWidth() - f11) - k4())));
        float N = ((org.telegram.messenger.g0.N(8.0f) + (org.telegram.messenger.g0.L(42.0f) * ((this.Q1 >= ((float) j4()) || max >= 0.33f) ? org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) : com.google.android.gms.internal.vision.e2.y(f10, 72.0f, 24.0f, 42.0f)))) * f10) + ((float) Math.floor(this.actionBar.getTranslationY() + (org.telegram.messenger.o10.b(f10, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0) - (org.telegram.messenger.g0.p * 21.0f))));
        this.f2 = (org.telegram.messenger.g0.L(7.0f) * f10) + org.telegram.messenger.g0.L(1.3f) + N;
        this.h2 = (((float) Math.floor(org.telegram.messenger.g0.p * 11.0f)) * f10) + N + org.telegram.messenger.g0.L(24.0f);
    }

    @Override // org.telegram.ui.Components.xr0
    public final void W() {
        int i7;
        int i10;
        vv0 vv0Var = this.O;
        if (vv0Var == null || this.r == null) {
            return;
        }
        int closestTab = vv0Var.getClosestTab();
        int[] iArr = this.R.c;
        if (closestTab == 0) {
            if (iArr[7] <= 0 && iArr[6] <= 0) {
                int i11 = iArr[0];
                if (i11 <= 0) {
                    i5(org.telegram.messenger.hd.N0(2131745213, null));
                    return;
                } else {
                    i5(org.telegram.messenger.hd.G(i11, "Media", new Object[0]));
                    return;
                }
            }
            if (this.O.getPhotosVideosTypeFilter() == 1 || iArr[7] <= 0) {
                i5(org.telegram.messenger.hd.G(iArr[6], "Photos", new Object[0]));
                return;
            }
            if (this.O.getPhotosVideosTypeFilter() == 2 || (i10 = iArr[6]) <= 0) {
                i5(org.telegram.messenger.hd.G(iArr[7], "Videos", new Object[0]));
                return;
            }
            i5(org.telegram.messenger.hd.G(i10, "Photos", new Object[0]) + ", " + org.telegram.messenger.hd.G(iArr[7], "Videos", new Object[0]));
            return;
        }
        if (closestTab == 1) {
            int i12 = iArr[1];
            if (i12 <= 0) {
                i5(org.telegram.messenger.hd.N0(2131750814, null));
                return;
            } else {
                i5(org.telegram.messenger.hd.G(i12, "Files", new Object[0]));
                return;
            }
        }
        if (closestTab == 2) {
            int i13 = iArr[2];
            if (i13 <= 0) {
                i5(org.telegram.messenger.hd.N0(2131743278, null));
                return;
            } else {
                i5(org.telegram.messenger.hd.G(i13, "Voice", new Object[0]));
                return;
            }
        }
        if (closestTab == 3) {
            int i14 = iArr[3];
            if (i14 <= 0) {
                i5(org.telegram.messenger.hd.N0(2131745215, null));
                return;
            } else {
                i5(org.telegram.messenger.hd.G(i14, "Links", new Object[0]));
                return;
            }
        }
        if (closestTab == 4) {
            int i15 = iArr[4];
            if (i15 <= 0) {
                i5(org.telegram.messenger.hd.N0(2131748126, null));
                return;
            } else {
                i5(org.telegram.messenger.hd.G(i15, "MusicFiles", new Object[0]));
                return;
            }
        }
        if (closestTab == 5) {
            int i16 = iArr[5];
            if (i16 <= 0) {
                i5(org.telegram.messenger.hd.N0(2131754879, null));
                return;
            } else {
                i5(org.telegram.messenger.hd.G(i16, "GIFs", new Object[0]));
                return;
            }
        }
        if (closestTab == 6) {
            i5(org.telegram.messenger.hd.G(this.w2.common_chats_count, "CommonGroups", new Object[0]));
            return;
        }
        if (closestTab == 7) {
            i5(this.r.getText());
            return;
        }
        if (closestTab == 8 || org.telegram.ui.Components.jt0.J0(closestTab)) {
            if (this.s2) {
                i5(this.O.f0(false));
                return;
            } else if (this.O.m0(closestTab) > 0) {
                i5(org.telegram.messenger.hd.G(this.O.m0(closestTab), "ProfileStoriesCount", new Object[0]));
                return;
            } else {
                i5(org.telegram.messenger.hd.N0(2131746429, null));
                return;
            }
        }
        if (closestTab == 13) {
            i5(this.O.f0(true));
            return;
        }
        if (closestTab == 9) {
            i5(org.telegram.messenger.hd.G(this.O.m0(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
            return;
        }
        if (closestTab == 10) {
            org.telegram.messenger.oo N0 = org.telegram.messenger.np.u1(this.currentAccount).N0(a());
            i5(org.telegram.messenger.hd.G(N0 == null ? 0 : N0.b.size() + N0.c, this.s2 ? "Bots" : "Channels", new Object[0]));
            return;
        }
        if (closestTab != 12) {
            if (closestTab == 14) {
                org.telegram.ui.Components.gq0 gq0Var = this.O.b0;
                i5(org.telegram.messenger.hd.H(',', "ProfileGiftsCount", gq0Var != null ? gq0Var.getGiftsCount() : 0));
                return;
            } else {
                if (closestTab == 15) {
                    int i17 = iArr[8];
                    if (i17 <= 0) {
                        i5(org.telegram.messenger.hd.N0(2131745207, null));
                        return;
                    } else {
                        i5(org.telegram.messenger.hd.H(',', "ProfilePollsCount", i17));
                        return;
                    }
                }
                return;
            }
        }
        org.telegram.messenger.qv I1 = getMessagesController().I1();
        long a10 = a();
        ArrayList arrayList = I1.j;
        int i18 = 0;
        while (true) {
            if (i18 >= arrayList.size()) {
                i7 = 0;
                break;
            }
            org.telegram.messenger.pv pvVar = (org.telegram.messenger.pv) arrayList.get(i18);
            if (pvVar.a == a10) {
                i7 = pvVar.e;
                break;
            }
            i18++;
        }
        i5(org.telegram.messenger.hd.G(Math.max(1, i7), "SavedMessagesCount", new Object[0]));
    }

    public final void W4() {
        qu0 qu0Var = this.a;
        if (qu0Var == null || this.c == null || qu0Var.getChildCount() <= 0 || this.t6) {
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
            this.r6 = i10;
            int top = view.getTop();
            this.s6 = top;
            if (this.r6 == 0 && !this.p2 && top > j4()) {
                this.s6 = j4();
            }
            this.c.h1(i10, view.getTop() - this.a.getPaddingTop());
        }
    }

    public final void X3(float f10) {
        ValueAnimator ofFloat;
        int i7 = 0;
        boolean z10 = f10 > 0.0f;
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.q6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.q6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.y0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new du0(this, i7));
        this.q6.playTogether(arrayList);
        this.q6.setDuration(z10 ? 150L : 220L);
        if (!z10) {
            this.q6.addListener(new dv0(this, 6));
        }
        this.q6.start();
    }

    public final void X4(boolean z10) {
        int i7 = this.N4;
        if (i7 >= 0) {
            if (!z10) {
                this.c.h1(i7, -this.a.getPaddingTop());
                return;
            }
            pi.l lVar = new pi.l(getParentActivity(), 2, 0.6f);
            lVar.a = this.N4;
            lVar.p = -this.a.getPaddingTop();
            this.c.w0(lVar);
        }
    }

    @Override // org.telegram.ui.Components.xr0
    public final boolean Y() {
        return this.A1;
    }

    public final void Y3(int i7, View view) {
        org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(this, view);
        I.X(this.a.U0(view, false));
        I.w = false;
        I.l(R.drawable.msg_copy, org.telegram.messenger.hd.N0(2131751755, null), new n90(this, 4), this.w2 != null);
        I.c(R.drawable.msg_edit, org.telegram.messenger.hd.N0(2131751323, null), new n90(this, 5), false);
        I.c(R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131746125, null), new ii(this, i7, 29), true);
        I.a0();
    }

    public final boolean Z3(final int i7, View view) {
        TLRPC.User f10;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        final int i10 = 0;
        if (this.s1 && (f10 = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.w2;
            if (userFull == null) {
                userFull = getMessagesController().d2(f10.id);
            }
            if (userFull != null) {
                String N0 = org.telegram.messenger.hd.N0(2131751755, null);
                String N02 = org.telegram.messenger.hd.N0(2131743951, null);
                if (i7 == this.L3 || i7 == this.K3 || i7 == this.X2) {
                    str = userFull.about;
                    if (i7 == this.X2) {
                        N02 = org.telegram.messenger.hd.N0(2131753718, null);
                    }
                } else if (i7 == this.P3) {
                    str = kg.e1.k0(this.currentAccount, f10, userFull.business_work_hours);
                    N0 = org.telegram.messenger.hd.N0(2131746469, null);
                    N02 = org.telegram.messenger.hd.N0(2131752749, null);
                } else if (i7 == this.Q3) {
                    str = userFull.business_location.address;
                    N0 = org.telegram.messenger.hd.N0(2131746464, null);
                    N02 = org.telegram.messenger.hd.N0(2131752681, null);
                } else if (i7 == this.M3) {
                    str = org.telegram.messenger.p10.o(f10);
                    if (str != null) {
                        str = "@".concat(str);
                    }
                    N0 = org.telegram.messenger.hd.N0(2131746482, null);
                    N02 = org.telegram.messenger.hd.N0(2131743420, null);
                } else if (i7 == this.H3) {
                    str = f10.phone;
                    N02 = org.telegram.messenger.hd.N0(2131747101, null);
                } else if (i7 == this.V2) {
                    str = UserInfoActivity.e0(this.w2.birthday);
                    N02 = org.telegram.messenger.hd.N0(2131753713, null);
                } else {
                    str = null;
                }
                org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(this, view);
                I.X(this.a.U0(view, false));
                I.w = false;
                I.i = 3;
                if (i7 == this.Q3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        I.c(R.drawable.msg_view_file, org.telegram.messenger.hd.N0(2131746460, null), new n90(this, 7), false);
                    }
                    I.c(R.drawable.msg_map, org.telegram.messenger.hd.N0(2131746462, null), new n90(this, 9), false);
                }
                if (str != null) {
                    I.c(R.drawable.msg_copy, N0, new mc0(this, str, N02, 25), false);
                }
                int i11 = 10;
                final int i12 = 1;
                if (i7 == this.P3) {
                    I.c(R.drawable.msg_edit, org.telegram.messenger.hd.N0(2131746468, null), new n90(this, i11), false);
                    I.c(R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131746467, null), new Runnable(this) { // from class: org.telegram.ui.bu0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i10;
                            final int i14 = i7;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i13) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String N03 = org.telegram.messenger.hd.N0(2131752750, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                    t1Var.S = N03;
                                    t1Var.U = org.telegram.messenger.hd.N0(2131752751, null);
                                    final int i15 = 0;
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.fu0
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i16) {
                                            int i17 = i15;
                                            int i18 = i14;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i17) {
                                                case 0:
                                                    RectF rectF2 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new hu0(profileActivity2, 0));
                                                    profileActivity2.N5();
                                                    profileActivity2.d.s(i18);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new hu0(profileActivity2, 3));
                                                    profileActivity2.N5();
                                                    profileActivity2.d.s(i18);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    profileActivity.showDialog(t1Var);
                                    break;
                                default:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String N04 = org.telegram.messenger.hd.N0(2131752682, null);
                                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                                    t1Var2.S = N04;
                                    t1Var2.U = org.telegram.messenger.hd.N0(2131752683, null);
                                    final int i16 = 1;
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.fu0
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i162) {
                                            int i17 = i16;
                                            int i18 = i14;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i17) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new hu0(profileActivity2, 0));
                                                    profileActivity2.N5();
                                                    profileActivity2.d.s(i18);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new hu0(profileActivity2, 3));
                                                    profileActivity2.N5();
                                                    profileActivity2.d.s(i18);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    profileActivity.showDialog(t1Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i7 == this.Q3) {
                    I.c(R.drawable.msg_edit, org.telegram.messenger.hd.N0(2131746463, null), new n90(this, 11), false);
                    I.c(R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131746461, null), new Runnable(this) { // from class: org.telegram.ui.bu0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i12;
                            final int i14 = i7;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i13) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String N03 = org.telegram.messenger.hd.N0(2131752750, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                    t1Var.S = N03;
                                    t1Var.U = org.telegram.messenger.hd.N0(2131752751, null);
                                    final int i15 = 0;
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.fu0
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i162) {
                                            int i17 = i15;
                                            int i18 = i14;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i17) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new hu0(profileActivity2, 0));
                                                    profileActivity2.N5();
                                                    profileActivity2.d.s(i18);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new hu0(profileActivity2, 3));
                                                    profileActivity2.N5();
                                                    profileActivity2.d.s(i18);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    profileActivity.showDialog(t1Var);
                                    break;
                                default:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String N04 = org.telegram.messenger.hd.N0(2131752682, null);
                                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                                    t1Var2.S = N04;
                                    t1Var2.U = org.telegram.messenger.hd.N0(2131752683, null);
                                    final int i16 = 1;
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.fu0
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i162) {
                                            int i17 = i16;
                                            int i18 = i14;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i17) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new hu0(profileActivity2, 0));
                                                    profileActivity2.N5();
                                                    profileActivity2.d.s(i18);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new hu0(profileActivity2, 3));
                                                    profileActivity2.N5();
                                                    profileActivity2.d.s(i18);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    profileActivity.showDialog(t1Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i7 == this.M3) {
                    I.c(R.drawable.msg_edit, org.telegram.messenger.hd.N0(2131746424, null), new n90(this, 12), false);
                } else if (i7 == this.L3 || i7 == this.K3 || i7 == this.X2) {
                    I.c(R.drawable.msg_edit, org.telegram.messenger.hd.N0(2131746481, null), new n90(this, 13), false);
                } else if (i7 == this.H3) {
                    I.c(R.drawable.menu_storage_path, org.telegram.messenger.hd.N0(2131746450, null), new n90(this, 14), false);
                } else if (i7 == this.V2) {
                    I.c(R.drawable.msg_edit, org.telegram.messenger.hd.N0(2131746529, null), new Runnable(this) { // from class: org.telegram.ui.zt0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i10;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i13) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    profileActivity.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.c5.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.N0(2131751226, null), org.telegram.messenger.hd.N0(2131751231, null), userFull2.birthday, new org.telegram.ui.Components.rh(24, profileActivity, userFull2), new n90(profileActivity, 15), false, false, profileActivity.A0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String N03 = org.telegram.messenger.hd.N0(2131753714, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                    t1Var.S = N03;
                                    t1Var.U = org.telegram.messenger.hd.N0(2131753715, null);
                                    final int i14 = 1;
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.eu0
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i15) {
                                            int i16 = i14;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF3 = ProfileActivity.Z6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new hu0(profileActivity2, 1));
                                                    profileActivity2.H5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.Z6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().o2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new hu0(profileActivity2, 2));
                                                    profileActivity2.H5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    profileActivity.showDialog(t1Var);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String N04 = org.telegram.messenger.hd.N0(2131746486, null);
                                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                                    t1Var2.S = N04;
                                    t1Var2.U = org.telegram.messenger.hd.N0(2131746487, null);
                                    final int i15 = 0;
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.eu0
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i152) {
                                            int i16 = i15;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.Z6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new hu0(profileActivity2, 1));
                                                    profileActivity2.H5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.Z6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().o2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new hu0(profileActivity2, 2));
                                                    profileActivity2.H5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    profileActivity.showDialog(t1Var2);
                                    break;
                            }
                        }
                    }, false);
                    I.c(R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131746125, null), new Runnable(this) { // from class: org.telegram.ui.zt0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i12;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i13) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    profileActivity.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.c5.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.N0(2131751226, null), org.telegram.messenger.hd.N0(2131751231, null), userFull2.birthday, new org.telegram.ui.Components.rh(24, profileActivity, userFull2), new n90(profileActivity, 15), false, false, profileActivity.A0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String N03 = org.telegram.messenger.hd.N0(2131753714, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                    t1Var.S = N03;
                                    t1Var.U = org.telegram.messenger.hd.N0(2131753715, null);
                                    final int i14 = 1;
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.eu0
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i152) {
                                            int i16 = i14;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.Z6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new hu0(profileActivity2, 1));
                                                    profileActivity2.H5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.Z6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().o2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new hu0(profileActivity2, 2));
                                                    profileActivity2.H5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    profileActivity.showDialog(t1Var);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String N04 = org.telegram.messenger.hd.N0(2131746486, null);
                                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                                    t1Var2.S = N04;
                                    t1Var2.U = org.telegram.messenger.hd.N0(2131746487, null);
                                    final int i15 = 0;
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.eu0
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i152) {
                                            int i16 = i15;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.Z6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new hu0(profileActivity2, 1));
                                                    profileActivity2.H5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.Z6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().o2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new hu0(profileActivity2, 2));
                                                    profileActivity2.H5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    profileActivity.showDialog(t1Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i7 == this.R2) {
                    TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(userFull.personal_channel_id));
                    if (O0 != null && org.telegram.messenger.v3.K(O0, false) != null) {
                        I.c(R.drawable.msg_copy, org.telegram.messenger.hd.N0(2131746485, null), new tr0(i11, this, O0), false);
                    }
                    I.c(R.drawable.msg_edit, org.telegram.messenger.hd.N0(2131746488, null), new n90(this, 8), false);
                    final int i13 = 2;
                    I.c(R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131746125, null), new Runnable(this) { // from class: org.telegram.ui.zt0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i132 = i13;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i132) {
                                case 0:
                                    RectF rectF = ProfileActivity.Z6;
                                    profileActivity.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.c5.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.N0(2131751226, null), org.telegram.messenger.hd.N0(2131751231, null), userFull2.birthday, new org.telegram.ui.Components.rh(24, profileActivity, userFull2), new n90(profileActivity, 15), false, false, profileActivity.A0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String N03 = org.telegram.messenger.hd.N0(2131753714, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                    t1Var.S = N03;
                                    t1Var.U = org.telegram.messenger.hd.N0(2131753715, null);
                                    final int i14 = 1;
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.eu0
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i152) {
                                            int i16 = i14;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.Z6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new hu0(profileActivity2, 1));
                                                    profileActivity2.H5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.Z6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().o2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new hu0(profileActivity2, 2));
                                                    profileActivity2.H5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    profileActivity.showDialog(t1Var);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.Z6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String N04 = org.telegram.messenger.hd.N0(2131746486, null);
                                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                                    t1Var2.S = N04;
                                    t1Var2.U = org.telegram.messenger.hd.N0(2131746487, null);
                                    final int i15 = 0;
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131746125, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.eu0
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i152) {
                                            int i16 = i15;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.Z6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new hu0(profileActivity2, 1));
                                                    profileActivity2.H5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.Z6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().o2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new hu0(profileActivity2, 2));
                                                    profileActivity2.H5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    profileActivity.showDialog(t1Var2);
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

    public final void Z4() {
        org.telegram.ui.Components.tf0 tf0Var = this.a0;
        if (tf0Var == null) {
            return;
        }
        if (this.s1) {
            tf0Var.F = 6;
            return;
        }
        if (this.q1) {
            tf0Var.F = 5;
            return;
        }
        if (this.s2) {
            tf0Var.F = 2;
            return;
        }
        if (this.e1 != 0) {
            tf0Var.F = 0;
            return;
        }
        if (this.f1 != 0) {
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f1));
            if (!org.telegram.messenger.v3.T(O0)) {
                this.a0.F = 3;
                return;
            }
            if (org.telegram.messenger.v3.n0(O0)) {
                this.a0.F = 3;
            } else if (org.telegram.messenger.v3.c0(O0)) {
                this.a0.F = 4;
            } else {
                this.a0.F = 1;
            }
        }
    }

    public final long a() {
        long j3 = this.i1;
        if (j3 != 0) {
            return j3;
        }
        long j10 = this.e1;
        return j10 != 0 ? j10 : -this.f1;
    }

    public final boolean a4() {
        View view;
        if ((this.J0 || (!org.telegram.messenger.g0.Q1() && !this.o2)) && this.f0.getImageReceiver().L() && !org.telegram.messenger.g0.C1()) {
            this.G0 = true;
            this.p2 = true;
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
                v4.f1 T = F != null ? qu0Var.T(F) : null;
                if (T != null) {
                    Integer num = (Integer) this.Z1.get(Integer.valueOf(T.b()));
                    if (num != null) {
                        this.P1 = true;
                        this.a.w0(0, -(((this.a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.nr.h);
                        return true;
                    }
                }
            }
        }
        return false;
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
    public final void a5(float f10) {
        int w02;
        boolean z10;
        xw0 xw0Var;
        int i7;
        int f11;
        di.t0 t0Var;
        zw0 zw0Var;
        if (this.actionBar == null) {
            return;
        }
        this.glassEngine.g();
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        this.m2 = f10;
        float U1 = org.telegram.messenger.g0.U1(f10, this.n2);
        this.l2 = U1;
        Q3();
        this.Y.setScaleX(this.c2);
        this.Y.setScaleY(this.c2);
        this.Y.setTranslationY(org.telegram.messenger.g0.T1((float) Math.ceil(this.b2), 0.0f, U1));
        this.f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(s4(), 0.0f, U1));
        zu0 zu0Var = this.f0;
        float f12 = this.c2;
        boolean z11 = this.q2;
        zu0Var.I = U1;
        zu0Var.J = f12;
        zu0Var.H = z11;
        cv0 cv0Var = this.v0;
        if (cv0Var != null) {
            cv0Var.setExpandProgress(U1);
        }
        di.t0 t0Var2 = this.w0;
        if (t0Var2 != null) {
            t0Var2.setExpandProgress(U1);
        }
        org.telegram.ui.Components.xu0 xu0Var = this.T;
        if (xu0Var != null) {
            xu0Var.setParentExpanded(U1);
        }
        org.telegram.ui.Components.tf0 tf0Var = this.a0;
        if (tf0Var != null) {
            tf0Var.setParentExpanded(U1);
        }
        c5(U1);
        org.telegram.ui.Components.og0 og0Var = this.c0;
        if (og0Var != null) {
            og0Var.setParentExpanded(U1);
        }
        org.telegram.ui.ActionBar.g5 g5Var = this.U0;
        if (g5Var != null) {
            float f13 = 1.0f - U1;
            g5Var.setAlpha(f13);
            this.U0.setScaleY(f13);
            this.U0.setVisibility(0);
            org.telegram.ui.ActionBar.g5 g5Var2 = this.U0;
            g5Var2.setClickable(g5Var2.getAlpha() > 0.5f);
        }
        float L3 = L3();
        if (L3 >= 1.0f) {
            this.f0.setAlpha(1.0f);
        }
        if (!this.q2) {
            V4(L3, currentActionBarHeight);
        } else if (this.Q1 >= k4() && this.i2 < 0.33f) {
            U4();
        }
        org.telegram.ui.Components.vk0 vk0Var = this.L;
        if (vk0Var != null) {
            vk0Var.b(i0.a.f(U1, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h8, this.A0), Color.argb(org.telegram.messenger.ls.J2, org.telegram.messenger.ls.e4, org.telegram.messenger.ls.e4, org.telegram.messenger.ls.e4)));
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.n6 != null ? -1 : i0.a.f(U1, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.gd, this.A0), -1), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.mr mrVar = this.J;
        if (mrVar != null) {
            mrVar.a(U1);
        }
        org.telegram.ui.Components.mr mrVar2 = this.K;
        if (mrVar2 != null) {
            mrVar2.a(U1);
        }
        w5(U1);
        float f14 = this.e2;
        float f15 = this.g2;
        float N = org.telegram.messenger.g0.N(8.0f);
        float N2 = org.telegram.messenger.g0.N(this.q2 ? 8.0f : -24.0f);
        float N3 = org.telegram.messenger.g0.N(18.0f) - ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin;
        float f16 = currentActionBarHeight;
        float e42 = (((this.Q1 + f16) - e4()) - org.telegram.messenger.g0.N(30.0f)) - this.f.getBottom();
        float A = com.google.android.gms.internal.vision.e2.A(N3, f14, 2.0f, N + f14);
        float f17 = this.f2;
        float f18 = 1.0f - U1;
        float f19 = f18 * f18;
        float f20 = f18 * 2.0f * U1;
        float f21 = (A * f20) + (f14 * f19);
        float f22 = U1 * U1;
        float f23 = (N3 * f22) + f21;
        float A2 = (e42 * f22) + (com.google.android.gms.internal.vision.e2.A(e42, f17, 2.0f, N2 + f17) * f20) + (f17 * f19);
        float N4 = org.telegram.messenger.g0.N(16.0f) - ((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin;
        float e43 = (((this.Q1 + f16) - e4()) - org.telegram.messenger.g0.N(10.0f)) - this.r.getBottom();
        float A3 = com.google.android.gms.internal.vision.e2.A(N4, f15, 2.0f, N + f15);
        float f24 = this.h2;
        float f25 = (N4 * f22) + (A3 * f20) + (f15 * f19);
        float A4 = (f22 * e43) + (f20 * com.google.android.gms.internal.vision.e2.A(e43, f24, 2.0f, N2 + f24)) + (f19 * f24);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - (org.telegram.messenger.g0.p * 21.0f)))) + org.telegram.messenger.g0.L(1.3f);
        float N5 = org.telegram.messenger.g0.N(22.7f) + floor;
        this.f.setTranslationX(f23);
        this.f.setTranslationY(Math.max(floor, A2));
        this.r.setTranslationX(m4(f25, Math.min(1.0f, L3) * this.C6));
        this.r.setTranslationY(n4(Math.max(N5, A4)));
        q5();
        I5();
        Object tag = this.r.getTag();
        if (tag instanceof Integer) {
            Integer num = (Integer) tag;
            w02 = org.telegram.ui.ActionBar.m6.w0(num.intValue(), this.A0);
            if (num.intValue() == org.telegram.ui.ActionBar.m6.si) {
                z10 = true;
                this.r.setTextColor(i0.a.f(U1, I3(w02, Boolean.valueOf(z10)), -1275068417));
                if (this.Q1 > k4()) {
                    this.f.setPivotY(org.telegram.messenger.g0.W1(U1, 0, r5.getMeasuredHeight()));
                    float f26 = (0.12f * L3) + 1.0f;
                    this.f.setScaleX(org.telegram.messenger.g0.T1(f26, 1.38f, U1));
                    this.f.setScaleY(org.telegram.messenger.g0.T1(f26, 1.38f, U1));
                }
                C4(0, Math.min(1.0f, L3), true);
                xw0Var = this.F6;
                if (xw0Var != null) {
                    xw0Var.a(i0.a.f(this.l2, org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.b(0.18f, -0.1f, this.c1)), 603979775));
                }
                pk pkVar = this.f;
                if (this.n6 == null) {
                    f11 = -1;
                    i7 = -1;
                } else {
                    i7 = -1;
                    f11 = i0.a.f(this.l2, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.mi, this.A0), -1);
                }
                pkVar.setTextColor(f11);
                this.actionBar.G(this.n6 == null ? i7 : i0.a.f(U1, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v8, this.A0), i7), false);
                this.actionBar.setMenuOffsetSuppressed(true);
                this.f0.setForegroundAlpha(U1);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                layoutParams.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.a.getMeasuredWidth() / this.c2, U1);
                layoutParams.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.Q1 + f16) / this.c2, U1);
                d4();
                this.Y.requestLayout();
                t0Var = this.w0;
                if (t0Var != null) {
                    t0Var.setExpandProgress(U1);
                }
                t5();
                zw0Var = this.d1;
                if (zw0Var == null && zw0Var.L) {
                    zw0Var.invalidate();
                    return;
                }
            }
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, this.A0);
        }
        z10 = false;
        this.r.setTextColor(i0.a.f(U1, I3(w02, Boolean.valueOf(z10)), -1275068417));
        if (this.Q1 > k4()) {
        }
        C4(0, Math.min(1.0f, L3), true);
        xw0Var = this.F6;
        if (xw0Var != null) {
        }
        pk pkVar2 = this.f;
        if (this.n6 == null) {
        }
        pkVar2.setTextColor(f11);
        this.actionBar.G(this.n6 == null ? i7 : i0.a.f(U1, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v8, this.A0), i7), false);
        this.actionBar.setMenuOffsetSuppressed(true);
        this.f0.setForegroundAlpha(U1);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
        layoutParams2.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.a.getMeasuredWidth() / this.c2, U1);
        layoutParams2.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.Q1 + f16) / this.c2, U1);
        d4();
        this.Y.requestLayout();
        t0Var = this.w0;
        if (t0Var != null) {
        }
        t5();
        zw0Var = this.d1;
        if (zw0Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f8));
    }

    public final void b4() {
        TLRPC.Chat chat = this.F2;
        if (chat == null || !chat.megagroup) {
            return;
        }
        TLRPC.ChatFull chatFull = this.v2;
        if (!(chatFull instanceof TLRPC.TL_channelFull) || chatFull.participants == null) {
            return;
        }
        for (int i7 = 0; i7 < this.v2.participants.participants.size(); i7++) {
            TLRPC.ChatParticipant chatParticipant = this.v2.participants.participants.get(i7);
            this.C1.k(chatParticipant, chatParticipant.user_id);
        }
    }

    public final boolean c4() {
        org.telegram.ui.ActionBar.r4 r4Var;
        if (this.J1 == 0 || (r4Var = this.parentLayout) == null || r4Var.getFragmentStack() == null || this.parentLayout.getFragmentStack().size() < 2 || !(this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof bn)) {
            return false;
        }
        finishFragment();
        return true;
    }

    public final void c5(float f10) {
        this.P5 = f10;
        org.telegram.ui.Components.xf0 xf0Var = this.O5;
        if (xf0Var != null) {
            xf0Var.b(f10);
        }
        E5();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean canBeginSlide() {
        if (this.O.K0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void clearViews() {
        this.n6 = null;
        super.clearViews();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r1 == null) goto L17;
     */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        LaunchActivity launchActivity;
        zm zmVar;
        org.telegram.ui.ActionBar.s3 s3Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.g2 lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof bn) && (zmVar = ((bn) lastFragment).Ba) != null && (s3Var = zmVar.f) != null) {
            if (s3Var != null) {
                TLRPC.ChatTheme chatTheme = s3Var.d;
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
        int i7 = 5;
        org.telegram.ui.Components.v7 v7Var = new org.telegram.ui.Components.v7(this, context, this.A0, i7);
        boolean z10 = true;
        v7Var.setForceSkipTouches(true);
        v7Var.setBackgroundColor(0);
        v7Var.F(this.n6 != null ? 553648127 : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f8, this.A0), false);
        int i10 = org.telegram.ui.ActionBar.m6.v8;
        v7Var.G(org.telegram.ui.ActionBar.m6.w0(i10, this.A0), false);
        v7Var.G(org.telegram.ui.ActionBar.m6.w0(i10, this.A0), true);
        v7Var.setCastShadows(false);
        v7Var.setAddToContainer(false);
        v7Var.setClipContent(true);
        if (!this.J0 && (((r4Var = this.parentLayout) == null || !((ActionBarLayout) r4Var).b) && ((org.telegram.messenger.g0.Q1() || this.inBubbleMode) && (!org.telegram.messenger.g0.Q1() || this.inBubbleMode || (r4Var2 = this.parentLayout) == null || (launchActivity = LaunchActivity.H1) == null || r4Var2 != launchActivity.r0)))) {
            z10 = false;
        }
        v7Var.setOccupyStatusBar(z10);
        if (!this.J0) {
            v7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
            v7Var.getBackButton().setTranslationX(org.telegram.messenger.g0.L(2.0f));
            ImageView backButton = v7Var.getBackButton();
            backButton.setOnLongClickListener(new fi.z1(i7, this, backButton));
            return v7Var;
        }
        v7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        v7Var.getBackButton().setTranslationX(org.telegram.messenger.g0.L(2.0f));
        v7Var.e.setContentDescription(org.telegram.messenger.hd.N0(2131746304, null));
        v7Var.e.setImageResource(R.drawable.outline_header_qr_24);
        v7Var.e.setColorFilter(org.telegram.ui.ActionBar.m6.w0(i10, this.A0), PorterDuff.Mode.SRC_IN);
        v7Var.e.setOnClickListener(new au0(this, 6));
        return v7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v253, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v260 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        dh.c cVar;
        int i7;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        ?? r12;
        TLRPC.Document document;
        int i10;
        Object obj;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.Components.nr nrVar;
        int i11;
        int i12;
        TLRPC.UserFull userFull2;
        TLRPC.ChatParticipants chatParticipants;
        bn bnVar;
        zm zmVar;
        org.telegram.ui.ActionBar.m6.Z(context);
        ?? r02 = 0;
        org.telegram.ui.ActionBar.m6.K(context, false);
        org.telegram.ui.ActionBar.g2 lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof bn) && (zmVar = (bnVar = (bn) lastFragment).Ba) != null && zmVar.b() != null) {
            org.telegram.ui.ActionBar.s3 s3Var = bnVar.Ba.f;
            if (s3Var != null) {
                TLRPC.ChatTheme chatTheme = s3Var.d;
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
        this.Q1 = j4();
        this.actionBar.setActionBarMenuOnItemClick(new rv0(this, context));
        vv0 vv0Var = this.O;
        if (vv0Var != null) {
            vv0Var.R0();
        }
        long j3 = this.i1;
        if (j3 == 0) {
            j3 = this.e1;
            if (j3 == 0) {
                j3 = -this.f1;
            }
        }
        this.fragmentView = new tv0(this, context);
        jh.k kVar = new jh.k(this.fragmentView);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        dh.c cVar2 = this.R6;
        cVar2.g(kVar, viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        int i13 = 2;
        if (this.s1) {
            this.y5 = new FrameLayout(context);
            this.z5 = new FrameLayout[2];
            this.C5 = new hi.e[2];
            int i14 = 0;
            while (i14 < 2) {
                ih0 ih0Var = new ih0(context);
                fh.g b10 = getBaseSimpleGlass().c.b(ih0Var, new gh.b(org.telegram.ui.ActionBar.m6.d6, this.A0));
                b10.q(org.telegram.messenger.g0.L(8.0f));
                b10.r(org.telegram.messenger.g0.L(22.0f));
                ih0Var.setBackground(b10);
                this.z5[i14] = new FrameLayout(context);
                this.C5[i14] = new hi.e(context, this.A0);
                this.C5[i14].setRoundRadius(org.telegram.messenger.g0.L(19.0f));
                this.C5[i14].setUseWrapContent(true);
                this.C5[i14].setPadding(org.telegram.messenger.g0.L(16.0f), r02, org.telegram.messenger.g0.L(16.0f), r02);
                if (i14 == 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                    this.A5 = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(R.drawable.filled_premium_camera), r02, 1, 33);
                    this.A5.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.M0(2131744566));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
                    this.B5 = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.nq(R.drawable.filled_add_album), r02, 1, 33);
                    this.B5.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.M0(2131744561));
                    this.C5[i14].h(this.A5, r02);
                } else {
                    this.C5[i14].h(org.telegram.messenger.hd.M0(2131744243), r02);
                }
                ih0Var.setOnClickListener(new vm0(this, i14, i13));
                c8.ra.b(ih0Var, 0.02f, 1.2f);
                this.C5[i14].setStateListAnimator(null);
                ih0Var.addView(this.C5[i14], c8.ma.e(-2, -1, 17));
                this.z5[i14].addView(ih0Var, c8.ma.e(-2, 60, 1));
                this.y5.addView(this.z5[i14], c8.ma.e(-1, -1, 87));
                if (i14 == 1 || !getMessagesController().i5()) {
                    b5(this.z5[i14], 1.0f);
                }
                i14++;
                r02 = 0;
            }
        }
        TLRPC.ChatFull chatFull2 = this.v2;
        ArrayList arrayList = (chatFull2 == null || (chatParticipants = chatFull2.participants) == null || chatParticipants.participants.size() <= 5) ? null : this.D2;
        if (this.x1) {
            cVar = cVar2;
            z10 = true;
            i7 = 6;
        } else if (!this.t1 || (((userFull = this.w2) == null || userFull.stargifts_count <= 0) && ((chatFull = this.v2) == null || chatFull.stargifts_count <= 0))) {
            z10 = true;
            if (this.r1) {
                i7 = 10;
                cVar = cVar2;
            } else {
                cVar = cVar2;
                i7 = arrayList != null ? 7 : -1;
            }
        } else {
            z10 = true;
            this.w1 = true;
            cVar = cVar2;
            i7 = 14;
        }
        V3(context);
        dh.c cVar3 = cVar;
        org.telegram.ui.Components.bt0 bt0Var = this.R;
        TLRPC.UserFull userFull3 = this.w2;
        long j10 = j3;
        vv0 vv0Var2 = new vv0(this, context, j10, bt0Var, userFull3 != null ? userFull3.common_chats_count : 0, this.D2, this.v2, userFull3, i7, this.y1, this, this, this.A0, getBaseSimpleGlass().c);
        this.O = vv0Var2;
        vv0Var2.setLayoutParams(new v4.q0(-1, -1));
        int i15 = 4;
        if (this.e1 == 0 || this.r0 == null || this.s1) {
            this.c0 = new org.telegram.ui.Components.og0(context);
            org.telegram.ui.Components.uf0 uf0Var = new org.telegram.ui.Components.uf0(context);
            this.d0 = uf0Var;
            this.c0.setTrailingView(uf0Var);
            org.telegram.ui.Components.xf0 xf0Var = this.O5;
            if (xf0Var != null) {
                this.c0.setGlassFactory(xf0Var.c);
            }
            this.d0.setOnClickListener(new au0(this, i15));
            this.c0.setColor(this.n6);
            TLRPC.UserFull userFull4 = this.w2;
            if (userFull4 != null && (document = userFull4.saved_music) != null) {
                this.c0.setMusicDocument(document);
            }
            int i16 = 5;
            this.c0.setOnClickListener(new au0(this, i16));
            this.a0 = new org.telegram.ui.Components.tf0(context, org.telegram.messenger.g0.L(74.0f));
            Z4();
            r12 = 0;
            J5(false);
            this.a0.setOnActionClickListener(new tt0(this, i16));
        } else {
            r12 = 0;
        }
        org.telegram.ui.ActionBar.f5 t6 = this.simpleActionBar.t();
        if (this.e1 == getUserConfig().n && !this.s1) {
            if (org.telegram.messenger.i5.r(this.currentAccount).v(7) == null) {
                org.telegram.messenger.i5.r(this.currentAccount).C();
            }
        }
        int i17 = 20;
        int i18 = 8;
        if (this.r0 != null && !this.s1) {
            org.telegram.ui.ActionBar.g5 b11 = t6.b(32, R.drawable.outline_header_search);
            b11.N();
            b11.K(new bi.w1(this, i17));
            this.U0 = b11;
            b11.setContentDescription(org.telegram.messenger.hd.M0(2131745563));
            this.U0.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745563));
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
        org.telegram.ui.ActionBar.g5 b12 = t6.b(16, R.drawable.profile_video);
        this.R0 = b12;
        b12.setContentDescription(org.telegram.messenger.hd.M0(2131743366));
        if (this.f1 != 0) {
            this.Q0 = t6.b(15, R.drawable.msg_voicechat2);
            if (org.telegram.messenger.v3.W(this.F2)) {
                this.Q0.setContentDescription(org.telegram.messenger.hd.M0(2131743202));
            } else {
                this.Q0.setContentDescription(org.telegram.messenger.hd.M0(2131743061));
            }
        } else {
            org.telegram.ui.ActionBar.g5 b13 = t6.b(15, R.drawable.call);
            this.Q0 = b13;
            b13.setContentDescription(org.telegram.messenger.hd.M0(2131752622));
        }
        if (this.s1) {
            org.telegram.ui.ActionBar.g5 b14 = t6.b(41, R.drawable.group_edit_profile);
            this.S0 = b14;
            b14.setContentDescription(org.telegram.messenger.hd.M0(2131751323));
        } else {
            org.telegram.ui.ActionBar.g5 b15 = t6.b(12, R.drawable.group_edit_profile);
            this.S0 = b15;
            b15.setContentDescription(org.telegram.messenger.hd.M0(2131751323));
        }
        org.telegram.ui.ActionBar.g5 a10 = t6.a();
        this.T0 = a10;
        a10.setSubMenuDelegate(new pu0(this));
        ImageView imageView = new ImageView(context);
        this.Y0 = imageView;
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.v8, this.A0, PorterDuff.Mode.MULTIPLY);
        org.telegram.messenger.g0.U3(0.8f, this.Y0, r12, r12);
        this.Y0.setImageResource(R.drawable.msg_mini_autodelete_timer);
        this.T0.addView(this.Y0, c8.ma.d(12, 12.0f, 19, 8.0f, 2.0f, 0.0f, 0.0f));
        this.T0.setContentDescription(org.telegram.messenger.hd.M0(2131754838));
        this.T0.M(cVar3, c8.i0.h(this.resourceProvider));
        if (this.a == null || this.r0 == null) {
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
        this.d = new lw0(this, context);
        this.e = new ww0(context, this);
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9();
        this.q0 = b9Var;
        b9Var.p = 2.3809524f;
        b9Var.t();
        this.fragmentView.setWillNotDraw(r12);
        tv0 tv0Var = (tv0) this.fragmentView;
        this.s5 = tv0Var;
        tv0Var.setClipChildren(r12);
        qu0 qu0Var = new qu0(this, context, this.A0);
        this.a = qu0Var;
        qu0Var.setLegacySections(r12);
        this.a.r1();
        qu0 qu0Var2 = this.a;
        qu0Var2.getClass();
        qu0Var2.setSectionsOverscanTop(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
        qu0 qu0Var3 = this.a;
        int i19 = org.telegram.ui.ActionBar.m6.a7;
        org.telegram.ui.ActionBar.t6.h(i19, qu0Var3, this.A0);
        this.a.setVerticalScrollBarEnabled(r12);
        dh.k kVar2 = new dh.k(this.a, (ViewGroup) this.fragmentView, new q40(this, 1));
        kVar2.h = true;
        su0 su0Var = new su0(this);
        this.a.setItemAnimator(su0Var);
        int i20 = i10;
        su0Var.e = 320L;
        su0Var.d = 320L;
        su0Var.c = 320L;
        su0Var.m = r12;
        su0Var.S();
        org.telegram.ui.Components.nr nrVar2 = org.telegram.ui.Components.nr.h;
        su0Var.o(nrVar2);
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
        frameLayout.addView(this.a, c8.ma.e(-1, -1, 51));
        this.a.setOnItemClickListener(new di.h(this, context, j10, 8));
        this.a.setOnItemLongClickListener(new wu0(this, context));
        if (this.r1 || this.t1 || this.x1) {
            N5();
            J();
            this.t6 = true;
            this.r6 = this.N4;
            this.s6 = r12;
        }
        if (this.U0 != null) {
            org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context);
            this.b = ek0Var;
            ek0Var.setVerticalScrollBarEnabled(r12);
            this.b.setLayoutManager(new v4.c0(1, r12));
            org.telegram.ui.ActionBar.t6.H(this.b, org.telegram.ui.ActionBar.m6.e8, this.A0);
            this.b.setAdapter(this.e);
            h6Var = null;
            this.b.setItemAnimator(null);
            this.b.setVisibility(8);
            this.b.setLayoutAnimation(null);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, this.b, this.A0);
            frameLayout.addView(this.b, c8.ma.e(-1, -1, 51));
            this.b.setOnItemClickListener(new h(this, 28));
            this.b.setOnItemLongClickListener(new tt0(this, 6));
            this.b.setOnScrollListener(new xu0(this, r12));
            this.b.o1(1, true);
            org.telegram.ui.Components.nv0 nv0Var = new org.telegram.ui.Components.nv0(context);
            this.P = nv0Var;
            nv0Var.setAnimateLayoutChange(true);
            this.P.e.setVisibility(8);
            this.P.setVisibility(8);
            frameLayout.addView(this.P);
            this.e.G();
        } else {
            h6Var = null;
        }
        int i21 = 3;
        if (this.E1 != 0) {
            i11 = i19;
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.E1));
            if (this.H2 == null) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = org.telegram.messenger.np.k1(O0);
                nrVar = nrVar2;
                tL_channels_getParticipant.participant = getMessagesController().l1(this.e1);
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new hu0(this, 4));
            } else {
                nrVar = nrVar2;
            }
            ih0 ih0Var2 = new ih0(context, i21);
            ih0Var2.setWillNotDraw(r12);
            ih0Var2.setPadding(r12, r12, r12, org.telegram.messenger.g0.n);
            frameLayout.addView(ih0Var2, c8.ma.a(-1.0f, (org.telegram.messenger.g0.n / org.telegram.messenger.g0.p) + 51.0f, 83));
            ih0Var2.setOnClickListener(new jg0(i18, this, O0));
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.p7, this.A0);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.hd.M0(2131753725));
            ih0Var2.addView(textView, c8.ma.d(-2, -2.0f, 17, 0.0f, 1.0f, 0.0f, 0.0f));
            this.a.setPadding(r12, j4(), r12, org.telegram.messenger.g0.L(48.0f));
            this.a.setBottomGlowOffset(org.telegram.messenger.g0.L(48.0f));
        } else {
            nrVar = nrVar2;
            i11 = i19;
            this.a.setPadding(r12, j4(), r12, r12);
        }
        zw0 zw0Var = new zw0(this, context);
        this.d1 = zw0Var;
        zw0Var.a(this.n6, r12);
        this.d1.setBackgroundColor(getThemedColor(i11));
        frameLayout.addView(this.d1);
        org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
        this.e0 = oVar;
        oVar.setPivotX(org.telegram.messenger.g0.L(30.0f));
        this.e0.setPivotY(org.telegram.messenger.g0.L(30.0f));
        this.Y = new k0(21, context, this);
        this.Z = new ai.l0(26, context, this);
        ImageReceiver imageReceiver = new ImageReceiver(this.Z);
        this.x5 = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(11.0f));
        org.telegram.messenger.g0.U3(1.0f, this.Z, true, r12);
        this.Z.setClipChildren(r12);
        frameLayout.addView(this.Z, c8.ma.d(-1, -1.0f, 8388611, 0.0f, 0.0f, 0.0f, 0.0f));
        this.Y.setPivotX(0.0f);
        this.Y.setPivotY(0.0f);
        org.telegram.ui.Components.lg0 lg0Var = new org.telegram.ui.Components.lg0(context);
        this.u0 = lg0Var;
        lg0Var.addView(this.Y, c8.ma.e(100, 100, 51));
        this.Z.addView(this.u0, c8.ma.c(-1.0f, -1));
        zu0 zu0Var = new zu0(context);
        this.f0 = zu0Var;
        zu0Var.v(e4());
        this.f0.getImageReceiver().T(true);
        this.f0.setRoundRadiusForExpand(s4());
        this.f0.setPivotX(0.0f);
        this.f0.setPivotY(0.0f);
        this.Y.addView(this.f0, c8.ma.c(-1.0f, -1));
        this.f0.setOnClickListener(new au0(this, 11));
        this.f0.setHasStories(A4());
        this.f0.setOnLongClickListener(new t(this, 6));
        org.telegram.ui.Cells.c4 c4Var = new org.telegram.ui.Cells.c4(this, context);
        this.h0 = c4Var;
        c4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        this.h0.setProgressColor(-1);
        this.h0.setNoProgress(r12);
        this.Y.addView(this.h0, c8.ma.c(-1.0f, -1));
        ImageView imageView2 = new ImageView(context);
        this.i0 = imageView2;
        imageView2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
        ImageView imageView3 = this.i0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        this.i0.setAlpha(0.0f);
        this.i0.setScaleX(0.85f);
        this.i0.setScaleY(0.85f);
        ImageView imageView4 = this.i0;
        org.telegram.ui.Components.l01 l01Var = new org.telegram.ui.Components.l01(context, h6Var);
        this.m0 = l01Var;
        imageView4.setImageDrawable(l01Var);
        this.i0.setTranslationY(-1.0f);
        frameLayout.addView(this.i0, c8.ma.e(34, 34, 51));
        ImageView imageView5 = new ImageView(context);
        this.j0 = imageView5;
        imageView5.setScaleType(scaleType);
        this.j0.setAlpha(0.0f);
        this.j0.setImageDrawable(new ih.c());
        frameLayout.addView(this.j0, c8.ma.e(16, 16, 51));
        ImageView imageView6 = new ImageView(context);
        this.k0 = imageView6;
        imageView6.setImageResource(R.drawable.star_small_outline);
        org.telegram.ui.ActionBar.t6.s(this.k0, org.telegram.ui.ActionBar.m6.s8, this.A0, PorterDuff.Mode.SRC_IN);
        this.k0.setAlpha(0.0f);
        this.k0.setScaleY(0.0f);
        this.k0.setScaleX(0.0f);
        frameLayout.addView(this.k0, c8.ma.e(20, 20, 51));
        ImageView imageView7 = new ImageView(context);
        this.l0 = imageView7;
        imageView7.setImageResource(R.drawable.star_small_inner);
        this.l0.setAlpha(0.0f);
        this.l0.setScaleY(0.0f);
        this.l0.setScaleX(0.0f);
        frameLayout.addView(this.l0, c8.ma.e(20, 20, 51));
        O5();
        m5(r12, r12);
        av0 av0Var = this.o0;
        if (av0Var != null) {
            av0Var.K();
        }
        org.telegram.ui.Components.zf0 zf0Var = this.n0;
        if (zf0Var != null) {
            zf0Var.d();
        }
        this.N = new mw0(this, context);
        org.telegram.ui.Components.zf0 zf0Var2 = new org.telegram.ui.Components.zf0(context);
        this.n0 = zf0Var2;
        zf0Var2.setSize(e4());
        long j11 = this.e1;
        if (j11 == 0) {
            j11 = -this.f1;
        }
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        qu0 qu0Var4 = this.a;
        zu0 zu0Var2 = this.f0;
        getClassGuid();
        org.telegram.ui.Components.nr nrVar3 = nrVar;
        int i22 = 3;
        this.o0 = new av0(this, context, j11, kVar3, qu0Var4, zu0Var2, this.N, this.n0);
        if (this.e1 != getUserConfig().n && (userFull2 = this.w2) != null) {
            this.t5 = userFull2.profile_photo == null ? 0.0f : 1.0f;
        }
        if (!this.q1) {
            this.o0.setChatInfo(this.v2);
        }
        this.Z.addView(this.o0);
        this.Z.addView(this.n0, c8.ma.c(138.0f, -1));
        this.Z.addView(this.N);
        org.telegram.ui.Components.tf0 tf0Var = this.a0;
        if (tf0Var != null) {
            this.Z.addView(tf0Var, c8.ma.c(-1.0f, -1));
        }
        org.telegram.ui.Components.og0 og0Var = this.c0;
        if (og0Var != null) {
            this.Z.addView(og0Var, c8.ma.c(-1.0f, -1));
            this.Z.addView(this.d0, c8.ma.c(-1.0f, -1));
        }
        this.f0.setAvatarsViewPager(this.o0);
        ow0 ow0Var = new ow0(this, context);
        this.p0 = ow0Var;
        this.Z.addView(ow0Var, c8.ma.c(-1.0f, -1));
        frameLayout.addView(this.actionBar);
        pk pkVar = new pk(i22, context, this);
        this.f = pkVar;
        pkVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.mi));
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
        this.Z.addView(this.f, c8.ma.d(-2, -2.0f, 51, 109.0f, -6.0f, 0.0f, 0.0f));
        bv0 bv0Var = new bv0(this, context);
        this.r = bv0Var;
        bv0Var.setEllipsizeByGradient(true);
        this.r.setTextColor(I3(getThemedColor(org.telegram.ui.ActionBar.m6.B8), null));
        this.r.setTextSizePx(org.telegram.messenger.g0.L(13.5f));
        this.r.setGravity(3);
        this.r.setPivotX(org.telegram.messenger.g0.L(8.0f));
        this.r.setPivotY(org.telegram.messenger.g0.L(8.0f));
        this.r.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        this.r.setFocusable(true);
        this.Z.addView(this.r, c8.ma.d(-2, -2.0f, 51, 105.0f, -2.0f, 4.0f, 0.0f));
        Q3();
        this.Z.addView(this.e0);
        org.telegram.ui.Components.xu0 xu0Var = new org.telegram.ui.Components.xu0(context);
        this.T = xu0Var;
        xu0Var.setLayoutParams(c8.ma.d(32, 32.0f, 3, 103.0f, -2.0f, 0.0f, 0.0f));
        this.T.setResourcesProvider(this.A0);
        R3();
        this.T.setDelegate(new tt0(this, 1));
        this.T.setOnClickListener(new au0(this, r12));
        TLRPC.UserFull userFull5 = this.w2;
        if (userFull5 != null) {
            this.T.set(userFull5.stars_rating);
        }
        this.Z.addView(this.T);
        this.v0 = new cv0(this, context, this.currentAccount, a(), this.q1, this.Y, this.f0, this.A0, context);
        P5(r12);
        TLRPC.UserFull userFull6 = this.w2;
        if (userFull6 != null) {
            this.v0.setStories(userFull6.stories);
        } else {
            TLRPC.ChatFull chatFull3 = this.v2;
            if (chatFull3 != null) {
                this.v0.setStories(chatFull3.stories);
            }
        }
        zu0 zu0Var3 = this.f0;
        if (zu0Var3 != null) {
            zu0Var3.setHasStories(A4());
        }
        this.Z.addView(this.v0, c8.ma.c(-1.0f, -1));
        di.t0 t0Var = new di.t0(context, this.currentAccount, a(), this.Y);
        this.w0 = t0Var;
        this.Z.addView(t0Var, (int) r12, c8.ma.c(-1.0f, -1));
        int i23 = 1;
        M5(true);
        org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(context);
        this.s = rh0Var;
        if (this.a0 != null) {
            rh0Var.setVisibility(8);
        }
        U5();
        if (this.e1 == 0) {
            this.s.setImageResource(R.drawable.profile_discuss);
            this.s.setContentDescription(org.telegram.messenger.hd.M0(2131743310));
        } else if (this.r0 != null) {
            this.V = new org.telegram.ui.Components.oh0(R.raw.camera_outline, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            this.W = new org.telegram.ui.Components.oh0(R.raw.camera_outline, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), false, null);
            org.telegram.ui.Components.tf0 tf0Var2 = this.a0;
            if (tf0Var2 != null) {
                tf0Var2.e();
                this.a0.a();
                this.a0.b();
                this.a0.c();
                org.telegram.ui.Components.tf0 tf0Var3 = this.a0;
                if (tf0Var3.G) {
                    tf0Var3.G = r12;
                    tf0Var3.d();
                }
            } else {
                this.s.setAnimation(this.V);
                this.s.setContentDescription(org.telegram.messenger.hd.M0(2131754905));
                this.s.setPadding(org.telegram.messenger.g0.L(2.0f), r12, r12, org.telegram.messenger.g0.L(2.0f));
            }
        } else {
            org.telegram.ui.Components.tf0 tf0Var4 = this.a0;
            if (tf0Var4 != 0) {
                tf0Var4.o(r12, true);
            }
            this.s.setImageResource(R.drawable.profile_newmsg);
            this.s.setContentDescription(org.telegram.messenger.hd.M0(2131754818));
        }
        this.s.setScaleType(scaleType);
        frameLayout.addView(this.s, c8.ma.d(60, 60.0f, 53, 0.0f, 0.0f, 16.0f, 0.0f));
        this.s.setOnClickListener(new au0(this, i23));
        B4(r12);
        if (i20 != -1 && obj != null) {
            this.s.setTag(Integer.valueOf((int) r12));
            this.s.setScaleX(0.2f);
            this.s.setScaleY(0.2f);
            this.s.setAlpha(0.0f);
        }
        this.a.setOnScrollListener(new xu0(this, i23));
        UndoView undoView = new UndoView(context, null, r12, this.A0);
        this.M = undoView;
        frameLayout.addView(undoView, c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.k2 = ofFloat;
        ofFloat.addUpdateListener(new du0(this, i23));
        this.k2.setInterpolator(nrVar3);
        this.k2.addListener(new dv0(this, r12));
        N5();
        W();
        hi.l3 l3Var = new hi.l3(getContext(), 3);
        l3Var.r(true);
        l3Var.h = org.telegram.messenger.g0.L(310.0f);
        l3Var.d = 2300L;
        l3Var.U = true;
        l3Var.e = true;
        l3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
        l3Var.i(org.telegram.messenger.g0.L(4.0f));
        this.X = l3Var;
        l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), r12, org.telegram.messenger.g0.L(8.0f), r12);
        this.X.l(getBaseSimpleGlass().c);
        frameLayout.addView(this.X, c8.ma.e(-1, org.telegram.messenger.ls.g2, 55));
        this.O.setForwardRestrictedHint(this.X);
        ev0 ev0Var = new ev0(this, (ViewGroup) getParentActivity().getWindow().getDecorView(), frameLayout);
        this.Z4 = ev0Var;
        ev0Var.E = new pu0(this);
        this.o0.setPinchToZoomHelper(ev0Var);
        this.y0.setAlpha(r12);
        this.z0.setColor(getThemedColor(org.telegram.ui.ActionBar.m6.i6));
        R5();
        uv uvVar = new uv(8, context, this);
        this.U = uvVar;
        int i24 = org.telegram.ui.ActionBar.m6.d6;
        uvVar.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i24), 100)));
        this.U.setFocusable((boolean) r12);
        this.U.setImportantForAccessibility(2);
        this.U.setOnClickListener(new au0(this, 2));
        this.U.setVisibility(8);
        this.U.setFitsSystemWindows(true);
        this.s5.addView(this.U, c8.ma.c(-1.0f, -1));
        U3();
        if (this.s1) {
            i12 = 87;
            this.s5.addView(this.y5, c8.ma.e(-1, 60, 87));
        } else {
            i12 = 87;
        }
        org.telegram.ui.Components.tf0 tf0Var5 = this.a0;
        if (tf0Var5 != null && tf0Var5.k()) {
            ImageView imageView8 = new ImageView(context);
            this.P0 = imageView8;
            imageView8.setScaleType(scaleType);
            this.P0.setImageResource(R.drawable.call);
            this.P0.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(org.telegram.messenger.g0.L(48.0f), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            layoutParams.topMargin = this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : r12;
            layoutParams.setMarginEnd(layoutParams.width);
            layoutParams.gravity = 8388613;
            frameLayout.addView(this.P0, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.E5 = frameLayout2;
        org.telegram.ui.ActionBar.t6.h(i24, frameLayout2, this.A0);
        View view = new View(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view, this.A0);
        this.E5.addView(view, c8.ma.d(-1, 1.0f / org.telegram.messenger.g0.p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.F5 = new hi.e(context, this.A0);
        this.F5.h(org.telegram.messenger.hd.M0(2131745750), r12);
        this.E5.addView(this.F5, c8.ma.d(-1, 48.0f, org.telegram.messenger.ls.E1, 10.0f, (1.0f / org.telegram.messenger.g0.p) + 10.0f, 10.0f, 10.0f));
        this.F5.setOnClickListener(new au0(this, 3));
        this.E5.setVisibility(8);
        this.E5.setTranslationY(org.telegram.messenger.g0.L(69.0f));
        this.s5.addView(this.E5, c8.ma.e(-1, -2, i12));
        this.S6 = new di.f(7, this, kVar2);
        l5();
        r0.i0.l(this.fragmentView, new tt0(this, 4));
        return this.fragmentView;
    }

    public final void d4() {
        if (this.a == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
        float z10 = org.telegram.ui.Cells.c0.z(layoutParams.width, this.c2, 0.5f, this.a.getMeasuredWidth() / 2.0f);
        this.a2 = z10;
        if (this.G1) {
            this.a2 = org.telegram.messenger.g0.T1(this.k6, z10, this.T1);
        }
        this.Y.setTranslationX(this.a2);
    }

    public final void d5(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.v2 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.m1 == 0) {
                this.m1 = -j3;
                getMediaDataController().g0(this.m1, this.classGuid, this.g1);
            }
        }
        vv0 vv0Var = this.O;
        if (vv0Var != null) {
            vv0Var.setChatInfo(this.v2);
        }
        av0 av0Var = this.o0;
        if (av0Var != null && !this.q1) {
            av0Var.setChatInfo(this.v2);
        }
        cv0 cv0Var = this.v0;
        if (cv0Var != null && (chatFull3 = this.v2) != null) {
            cv0Var.setStories(chatFull3.stories);
        }
        di.t0 t0Var = this.w0;
        if (t0Var != null) {
            t0Var.a();
        }
        zu0 zu0Var = this.f0;
        if (zu0Var != null) {
            zu0Var.setHasStories(A4());
        }
        b4();
        if (this.f1 != 0) {
            boolean z10 = org.telegram.messenger.s2.a;
            boolean z11 = (getMessagesController().k7 || (chatFull2 = this.v2) == null || !chatFull2.stargifts_available) ? false : true;
            this.T0.R(38, z11);
            org.telegram.ui.Components.tf0 tf0Var = this.a0;
            if (tf0Var != null) {
                tf0Var.o(3, z11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        lw0 lw0Var;
        org.telegram.ui.ActionBar.r4 r4Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User c22;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.Chat chat;
        qu0 qu0Var;
        qu0 qu0Var2;
        org.telegram.ui.Components.mj0 mj0Var;
        if (i7 == org.telegram.messenger.ls.E5 || i7 == org.telegram.messenger.ls.r3) {
            if (org.telegram.messenger.v3.R(org.telegram.messenger.np.u1(this.currentAccount).O0(Long.valueOf(this.f1)))) {
                getMessagesController().R1().k(a(), new fi.e(23), false, this.A0);
                return;
            }
            return;
        }
        int i11 = 0;
        r3 = false;
        boolean z10 = false;
        if (i7 == org.telegram.messenger.ls.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.np.I8;
            Object[] objArr2 = ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & TLObject.FLAG_19) == 0) ? false : true;
            if (this.e1 != 0) {
                if (objArr2 != false) {
                    M5(true);
                }
                if ((intValue & 1024) == 0 || (qu0Var2 = this.a) == null || (mj0Var = (org.telegram.ui.Components.mj0) qu0Var2.L(this.H3, false)) == null) {
                    return;
                }
                this.d.t(mj0Var, this.H3);
                return;
            }
            if (this.f1 != 0) {
                int i13 = intValue & TLObject.FLAG_13;
                if (i13 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                    if (i13 != 0) {
                        H5(true, false);
                    } else {
                        K5(true);
                    }
                    M5(true);
                }
                if (!objArr2 == true || (qu0Var = this.a) == null) {
                    return;
                }
                int childCount = qu0Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = this.a.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.ra) {
                        ((org.telegram.ui.Cells.ra) childAt).i(intValue);
                    }
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.g1) {
            Long l10 = (Long) objArr[0];
            if (this.v2 == null || (chat = this.F2) == null || chat.id != l10.longValue()) {
                return;
            }
            this.v2.online_count = ((Integer) objArr[1]).intValue();
            K5(true);
            M5(false);
            return;
        }
        if (i7 == org.telegram.messenger.ls.O || i7 == org.telegram.messenger.ls.b1) {
            S3(true);
            return;
        }
        if (i7 == org.telegram.messenger.ls.a0) {
            if (this.j1) {
                org.telegram.messenger.g0.g3(new tr0(8, this, objArr));
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.Y) {
            TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
            TLRPC.EncryptedChat encryptedChat2 = this.E2;
            if (encryptedChat2 == null || encryptedChat.id != encryptedChat2.id) {
                return;
            }
            this.E2 = encryptedChat;
            H5(false, false);
            org.telegram.messenger.n6 n6Var = this.Y1;
            if (n6Var != null) {
                n6Var.g();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.g0) {
            boolean z11 = this.k1;
            boolean z12 = getMessagesController().H0.indexOfKey(this.e1) >= 0;
            this.k1 = z12;
            if (z11 != z12) {
                S3(true);
                H5(false, false);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.w2) {
            Long l11 = (Long) objArr[0];
            if (this.F2 != null) {
                long longValue = l11.longValue();
                TLRPC.Chat chat2 = this.F2;
                if (longValue == chat2.id && org.telegram.messenger.v3.w(14, chat2)) {
                    TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(this.currentAccount).P0(l11.longValue());
                    if (P0 != null) {
                        TLRPC.ChatFull chatFull4 = this.v2;
                        if (chatFull4 != null) {
                            P0.participants = chatFull4.participants;
                        }
                        this.v2 = P0;
                    }
                    vv0 vv0Var = this.O;
                    if (vv0Var != null) {
                        vv0Var.setChatInfo(this.v2);
                    }
                    TLRPC.ChatFull chatFull5 = this.v2;
                    if (chatFull5 != null && (((inputGroupCall = chatFull5.call) == null && !this.p1) || (inputGroupCall != null && this.p1))) {
                        S3(false);
                    }
                    cv0 cv0Var = this.v0;
                    if (cv0Var != null && (chatFull3 = this.v2) != null) {
                        cv0Var.setStories(chatFull3.stories);
                    }
                    di.t0 t0Var = this.w0;
                    if (t0Var != null) {
                        t0Var.a();
                    }
                    zu0 zu0Var = this.f0;
                    if (zu0Var != null) {
                        zu0Var.setHasStories(A4());
                    }
                    if (l11.longValue() != 0) {
                        boolean z13 = org.telegram.messenger.s2.a;
                        r2 = (getMessagesController().k7 || (chatFull2 = this.v2) == null || !chatFull2.stargifts_available) ? false : true;
                        this.T0.R(38, r2);
                        org.telegram.ui.Components.tf0 tf0Var = this.a0;
                        if (tf0Var != null) {
                            tf0Var.o(3, r2);
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
        if (i7 == org.telegram.messenger.ls.T) {
            TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
            if (this.e1 != 0 && (c22 = getMessagesController().c2(Long.valueOf(this.e1))) != null && chatFull6.id == c22.linked_community_id) {
                H5(true, false);
            }
            TLRPC.Chat chat3 = this.F2;
            if (chat3 != null && chatFull6.id == chat3.linked_community_id) {
                H5(true, false);
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
                    long j3 = chatFull6.migrated_from_chat_id;
                    if (j3 != 0) {
                        this.m1 = -j3;
                        getMediaDataController().f0(0, this.classGuid, this.m1, this.g1, true);
                    }
                }
                b4();
                av0 av0Var = this.o0;
                if (av0Var != null && !this.q1) {
                    av0Var.setChatInfo(this.v2);
                }
                H5(true, false);
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f1));
                if (O0 != null) {
                    this.F2 = O0;
                    S3(true);
                }
                org.telegram.messenger.n6 n6Var2 = this.Y1;
                if (n6Var2 != null) {
                    n6Var2.g();
                }
                if (this.F2.megagroup && (objArr3 != false || !booleanValue)) {
                    h4(true);
                }
                r5();
                R5();
                cv0 cv0Var2 = this.v0;
                if (cv0Var2 != null && (chatFull = this.v2) != null) {
                    cv0Var2.setStories(chatFull.stories);
                }
                di.t0 t0Var2 = this.w0;
                if (t0Var2 != null) {
                    t0Var2.a();
                }
                zu0 zu0Var2 = this.f0;
                if (zu0Var2 != null) {
                    zu0Var2.setHasStories(A4());
                }
                vv0 vv0Var2 = this.O;
                if (vv0Var2 != null) {
                    vv0Var2.setChatInfo(this.v2);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.t) {
            removeSelfFromStack(true);
            return;
        }
        if (i7 == org.telegram.messenger.ls.v) {
            long longValue2 = ((Long) objArr[0]).longValue();
            boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
            if (longValue2 == a() && (r4Var = this.parentLayout) != null && r4Var.getFragmentStack().contains(this)) {
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
        if (i7 == org.telegram.messenger.ls.D0) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
            if (botInfo.user_id == this.e1) {
                this.G2 = botInfo;
                H5(false, false);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.E0) {
            if (((Long) objArr[0]).longValue() == this.e1) {
                TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                this.w2 = userFull;
                org.telegram.ui.Components.xu0 xu0Var = this.T;
                if (xu0Var != null) {
                    xu0Var.set(userFull.stars_rating);
                }
                cv0 cv0Var3 = this.v0;
                if (cv0Var3 != null) {
                    cv0Var3.setStories(this.w2.stories);
                }
                di.t0 t0Var3 = this.w0;
                if (t0Var3 != null) {
                    t0Var3.a();
                }
                zu0 zu0Var3 = this.f0;
                if (zu0Var3 != null) {
                    zu0Var3.setHasStories(A4());
                }
                vv0 vv0Var3 = this.O;
                if (vv0Var3 != null) {
                    vv0Var3.setUserInfo(this.w2);
                }
                if (this.r0 != null) {
                    if (this.d != null && !TextUtils.equals(this.w2.about, this.A2)) {
                        this.d.g(this.X2);
                    }
                    if (this.s1) {
                        H5(false, false);
                    }
                } else {
                    if (this.G1 || this.L0) {
                        this.I1 = true;
                    } else {
                        S3(true);
                    }
                    H5(false, false);
                    vv0 vv0Var4 = this.O;
                    if (vv0Var4 != null) {
                        vv0Var4.setCommonGroupsCount(this.w2.common_chats_count);
                        W();
                        org.telegram.ui.Components.bt0 bt0Var = this.R;
                        if (bt0Var == null || bt0Var.E) {
                            resumeDelayedFragmentAnimation();
                            B4(true);
                        }
                    }
                }
                r5();
                R5();
                if (this.x2 == null && !y4()) {
                    org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(this.currentAccount);
                    this.x2 = f6Var;
                    n90 n90Var = new n90(this, 17);
                    if (f6Var.c) {
                        n90Var.run();
                    } else {
                        f6Var.h.add(n90Var);
                    }
                    this.x2.d(this.w2);
                }
                if (!y4()) {
                    ax0 ax0Var = this.z2;
                    ax0 c10 = ax0.c(this.currentAccount, this.w2, ax0Var);
                    this.z2 = c10;
                    this.y2 = c10 != ax0Var;
                    if (c10 != null) {
                        n90 n90Var2 = new n90(this, 18);
                        if (c10.b) {
                            n90Var2.run();
                        } else {
                            c10.h.add(n90Var2);
                        }
                    }
                }
                if (this.T0 != null) {
                    if (u4()) {
                        this.T0.T(44);
                    } else {
                        this.T0.u(44);
                    }
                    TLRPC.UserFull userFull2 = this.w2;
                    if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                        z10 = true;
                    }
                    this.T0.R(46, z10);
                    this.T0.R(47, !z10);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.k0) {
            return;
        }
        if (i7 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && a() == ((Long) objArr[0]).longValue()) {
                ArrayList arrayList = (ArrayList) objArr[1];
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i15);
                    if (this.E2 != null) {
                        TLRPC.MessageAction messageAction = gjVar.k.action;
                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (lw0Var = this.d) != null) {
                            lw0Var.f();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.l4) {
            qu0 qu0Var3 = this.a;
            if (qu0Var3 != null) {
                qu0Var3.g1();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.A4) {
            H5(false, false);
            return;
        }
        if (i7 == org.telegram.messenger.ls.s1) {
            int i16 = this.d3;
            int i17 = this.b3;
            int i18 = this.Z2;
            N5();
            lw0 lw0Var2 = this.d;
            if (lw0Var2 != null) {
                if (i16 == this.d3 && i17 == this.b3 && i18 == this.Z2) {
                    return;
                }
                lw0Var2.f();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.t5) {
            if (this.q1) {
                M5(false);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.D1) {
            ww0 ww0Var = this.e;
            if (ww0Var != null) {
                ww0Var.c = ww0.H(this);
                this.e.w.clear();
                this.e.J();
                ww0 ww0Var2 = this.e;
                ww0Var2.I(ww0Var2.E);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.c0) {
            M5(false);
            return;
        }
        if (i7 == org.telegram.messenger.ls.y5 || i7 == org.telegram.messenger.ls.I5) {
            zu0 zu0Var4 = this.f0;
            if (zu0Var4 != null) {
                zu0Var4.setHasStories(A4());
                this.f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(s4(), 0.0f, this.l2));
            }
            cv0 cv0Var4 = this.v0;
            if (cv0Var4 != null) {
                TLRPC.UserFull userFull3 = this.w2;
                if (userFull3 != null) {
                    cv0Var4.setStories(userFull3.stories);
                    return;
                }
                TLRPC.ChatFull chatFull8 = this.v2;
                if (chatFull8 != null) {
                    cv0Var4.setStories(chatFull8.stories);
                    return;
                }
                return;
            }
            return;
        }
        int i19 = 20;
        if (i7 == org.telegram.messenger.ls.k3) {
            org.telegram.ui.ActionBar.g5 g5Var = this.T0;
            if (g5Var != null) {
                TL_account.RequirementToContact P2 = getMessagesController().P2(this.e1);
                if (P2 != null && !(P2 instanceof TL_account.requirementToContactEmpty)) {
                    r2 = false;
                }
                g5Var.R(20, r2);
            }
            u5();
            return;
        }
        if (i7 == org.telegram.messenger.ls.i5) {
            u5();
            return;
        }
        if (i7 == org.telegram.messenger.ls.A3) {
            H5(false, false);
            return;
        }
        if (i7 == org.telegram.messenger.ls.E3) {
            H5(false, false);
            return;
        }
        if (i7 == org.telegram.messenger.ls.F3) {
            H5(false, false);
            return;
        }
        if (i7 == org.telegram.messenger.ls.y1) {
            if (a() == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.r4 r4Var2 = this.parentLayout;
                if (r4Var2 == null || r4Var2.getLastFragment() != this) {
                    removeSelfFromStack();
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.h3) {
            long longValue3 = ((Long) objArr[0]).longValue();
            if (this.N4 >= 0 || longValue3 != a()) {
                return;
            }
            N5();
            W();
            lw0 lw0Var3 = this.d;
            if (lw0Var3 != null) {
                lw0Var3.f();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.I3) {
            if (((Long) objArr[0]).longValue() != a() || y4()) {
                return;
            }
            if (this.N4 >= 0) {
                vv0 vv0Var5 = this.O;
                if (vv0Var5 != null) {
                    vv0Var5.P1(true);
                    return;
                }
                return;
            }
            N5();
            W();
            lw0 lw0Var4 = this.d;
            if (lw0Var4 != null) {
                lw0Var4.f();
            }
            org.telegram.messenger.g0.g3(new n90(this, 19));
            return;
        }
        if (i7 == org.telegram.messenger.ls.Y3) {
            if (((Long) objArr[0]).longValue() != a() || this.e1 <= 0) {
                return;
            }
            TLRPC.UserFull d2 = getMessagesController().d2(this.e1);
            if (d2 != null) {
                this.w2 = d2;
            }
            N5();
            W();
            qu0 qu0Var4 = this.a;
            if (qu0Var4 != null && qu0Var4.c0()) {
                this.a.post(new n90(this, i19));
                return;
            }
            lw0 lw0Var5 = this.d;
            if (lw0Var5 != null) {
                lw0Var5.f();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ls.Z3) {
            return;
        }
        long longValue4 = ((Long) objArr[0]).longValue();
        long longValue5 = ((Long) objArr[1]).longValue();
        TLRPC.Chat chat4 = this.F2;
        if (chat4 == null || chat4.id != longValue4) {
            return;
        }
        String str = (String) objArr[2];
        a0.h hVar = this.C1;
        if (hVar != null && (chatParticipant = (TLRPC.ChatParticipant) hVar.f(longValue5)) != null) {
            chatParticipant.setRank(longValue5, str);
        }
        TLRPC.ChannelParticipant channelParticipant = this.H2;
        if (channelParticipant != null && channelParticipant.user_id == longValue5) {
            channelParticipant.rank = str;
        }
        while (true) {
            ArrayList arrayList2 = this.U4;
            if (i11 >= arrayList2.size()) {
                org.telegram.messenger.g0.Z3(this.a);
                return;
            } else {
                ((TLRPC.ChatParticipant) arrayList2.get(i11)).setRank(longValue5, str);
                i11++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.x30 x30Var = this.r0;
        if (x30Var == null || !x30Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.x30 x30Var = this.r0;
        return (x30Var == null || dialog != x30Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.w30
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final int e4() {
        if (this.e1 == 0 || this.r0 == null || this.s1) {
            return org.telegram.messenger.g0.L(74 + ((this.L4 || this.M4) ? 25 : 0));
        }
        return 0;
    }

    public final void e5(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z == null || (tL_emojiStatusCollectible2 = this.K6) == tL_emojiStatusCollectible) {
            return;
        }
        if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
            this.K6 = tL_emojiStatusCollectible;
            hi.l3 l3Var = this.H6;
            int i7 = 1;
            if (l3Var != null) {
                l3Var.f(true);
            }
            if (tL_emojiStatusCollectible == null || TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                return;
            }
            this.J6 = null;
            this.H6 = new hi.l3(getParentActivity(), 3);
            this.I6 = org.telegram.ui.ActionBar.m6.w(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.m6.r1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
            this.H6.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
            hi.l3 l3Var2 = this.H6;
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
            l3Var2.M0 = true;
            l3Var2.U0 = System.currentTimeMillis();
            l3Var2.N0 = new Path();
            l3Var2.O0 = org.telegram.messenger.g0.N(0.66f) / 2.0f;
            l3Var2.P0 = new Paint(1);
            l3Var2.Q0 = new Paint(1);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, r12), org.telegram.ui.ActionBar.m6.r1(1.0f, r12), org.telegram.ui.ActionBar.m6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            l3Var2.T0 = linearGradient;
            l3Var2.Q0.setShader(linearGradient);
            l3Var2.R0 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, r12), org.telegram.ui.ActionBar.m6.r1(0.5f, r12), org.telegram.ui.ActionBar.m6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            l3Var2.S0 = new Matrix();
            l3Var2.P0.setShader(l3Var2.R0);
            l3Var2.Q0.setStyle(Paint.Style.STROKE);
            l3Var2.Q0.setStrokeJoin(Paint.Join.ROUND);
            l3Var2.Q0.setStrokeCap(Paint.Cap.ROUND);
            l3Var2.Q0.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
            this.Z.addView(this.H6, c8.ma.c(24.0f, -1));
            this.H6.w(9.33f);
            hi.l3 l3Var3 = this.H6;
            Typeface o4 = org.telegram.messenger.g0.o();
            l3Var3.I.x(o4);
            l3Var3.K.setTypeface(o4);
            this.H6.v(tL_emojiStatusCollectible.title);
            hi.l3 l3Var4 = this.H6;
            l3Var4.d = -1L;
            l3Var4.n(5.66f, 2.66f, 5.66f, 2.66f);
            hi.l3 l3Var5 = this.H6;
            l3Var5.getClass();
            l3Var5.E = org.telegram.messenger.g0.N(4.0f);
            l3Var5.F = org.telegram.messenger.g0.N(2.66f);
            this.H6.t();
            this.H6.s(16.0f);
            this.H6.x();
            this.H6.setOnClickListener(new ju0(this, tL_emojiStatusCollectible.slug, i7));
            if (this.Q1 < org.telegram.messenger.g0.L(82.0f)) {
                this.J6 = Boolean.FALSE;
                this.H6.setAlpha(0.0f);
            }
            t5();
            hi.l3 l3Var6 = this.H6;
            Objects.requireNonNull(l3Var6);
            org.telegram.messenger.g0.h3(new sy(l3Var6, i7), 6000L);
        }
    }

    @Override // org.telegram.ui.Components.xr0
    public final org.telegram.ui.Components.ek0 f() {
        return this.a;
    }

    public final int f4(ImageReceiver imageReceiver) {
        return imageReceiver.t() instanceof org.telegram.ui.Components.t51 ? ((org.telegram.ui.Components.t51) imageReceiver.t()).a.a() : org.telegram.messenger.g0.p(this.f0.getImageReceiver().n());
    }

    @Override // org.telegram.ui.Components.xr0
    public final TLRPC.Chat g() {
        return this.F2;
    }

    public final org.telegram.ui.Components.n5 g4(long j3) {
        if (this.H == null) {
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(17.0f), 2, this.f, false);
            this.H = n5Var;
            int L = org.telegram.messenger.g0.L(1.0f);
            n5Var.J = 0;
            n5Var.K = L;
            if (this.H0) {
                this.H.a();
            }
        }
        if (j3 != 0) {
            this.H.j(j3, false);
        } else {
            this.H.g(null, false);
        }
        v5();
        return this.H;
    }

    public float getAvatarAnimationProgress() {
        return this.T1;
    }

    @Override // org.telegram.ui.Components.w30
    public final /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.w30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return this.A0;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        if (this.A0 != null) {
            return null;
        }
        f6 f6Var = new f6(18, this);
        ArrayList arrayList = new ArrayList();
        vv0 vv0Var = this.O;
        if (vv0Var != null) {
            arrayList.addAll(vv0Var.getThemeDescriptions());
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.q0}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.pi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.x6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"detailTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.z6));
        int i7 = org.telegram.ui.ActionBar.m6.Ji;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        int i10 = org.telegram.ui.ActionBar.m6.Fi;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 131072, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        int i11 = org.telegram.ui.ActionBar.m6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 196608, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 131072, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 196608, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.a, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.n6));
        if (this.X5) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.I}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Fj));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d6));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.I}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.qi));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final int getThemedColor(int i7) {
        return org.telegram.ui.ActionBar.m6.w0(i7, this.A0);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final Drawable getThemedDrawable(String str) {
        org.telegram.ui.ActionBar.h6 h6Var = this.A0;
        Drawable drawable = h6Var != null ? h6Var.getDrawable(str) : null;
        return drawable != null ? drawable : super.getThemedDrawable(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0114, code lost:
    
        if (r25.inviter_id != getUserConfig().e()) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0116, code lost:
    
        if (r26 == false) goto L86;
     */
    @Override // org.telegram.ui.Components.xr0
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
        int i7 = 0;
        if (getParentActivity() != null) {
            if (z10) {
                TLRPC.User c22 = getMessagesController().c2(Long.valueOf(chatParticipant.user_id));
                if (c22 != null) {
                    long j3 = chatParticipant.user_id;
                    this.B2 = j3;
                    boolean z23 = j3 == getUserConfig().e();
                    if (org.telegram.messenger.v3.T(this.F2)) {
                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        str = channelParticipant.rank;
                        z16 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        z15 = z16 || (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin);
                        z12 = z23;
                        getMessagesController().c2(Long.valueOf(chatParticipant.user_id));
                        z21 = org.telegram.messenger.v3.w(4, this.F2);
                        boolean z24 = org.telegram.messenger.v3.w(25, this.F2) && (!z15 || ((!z16 && channelParticipant.can_edit) || z12));
                        if (z16 || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit)) {
                            z21 = false;
                            z24 = false;
                        }
                        if ((z12 || (channelParticipant instanceof TLRPC.TL_channelParticipantSelf)) && org.telegram.messenger.v3.h(this.F2)) {
                            z24 = true;
                        }
                        z17 = org.telegram.messenger.v3.w(2, this.F2) && (!((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || z16) || channelParticipant.can_edit);
                        z20 = this.F2.gigagroup ? false : z17;
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
                        TLRPC.Chat chat = this.F2;
                        z17 = chat.creator || ((chatParticipant instanceof TLRPC.TL_chatParticipant) && (org.telegram.messenger.v3.w(2, chat) || chatParticipant.inviter_id == getUserConfig().e()));
                        TLRPC.Chat chat2 = this.F2;
                        boolean z25 = chat2.creator;
                        if (org.telegram.messenger.v3.w(25, chat2)) {
                            z18 = z25;
                            if (z15) {
                                if (!z16) {
                                }
                            }
                            z19 = true;
                            z20 = this.F2.creator;
                            z21 = z18;
                            channelParticipant = null;
                        } else {
                            z18 = z25;
                        }
                        if (!z12 || !org.telegram.messenger.v3.h(this.F2)) {
                            z19 = false;
                            z20 = this.F2.creator;
                            z21 = z18;
                            channelParticipant = null;
                        }
                        z19 = true;
                        z20 = this.F2.creator;
                        z21 = z18;
                        channelParticipant = null;
                    }
                    if (!z12) {
                        z22 = z17;
                    } else if (org.telegram.messenger.v3.h(this.F2) || (z15 && org.telegram.messenger.v3.w(25, this.F2))) {
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
                    ut0 ut0Var = new ut0(this, channelParticipant2, c22, chatParticipant, z27, str);
                    String str2 = str;
                    Drawable U0 = view.getParent() instanceof org.telegram.ui.Components.ek0 ? ((org.telegram.ui.Components.ek0) view.getParent()).U0(view, false) : null;
                    org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(this, view);
                    I.X(U0);
                    I.w = false;
                    I.l(R.drawable.msg_discussion, org.telegram.messenger.hd.N0(2131745405, null), new vt0(this, c22, i7), !z12);
                    if (!z12 && (z21 || z19 || z20 || z22)) {
                        I.k();
                    }
                    I.l((z15 || !TextUtils.isEmpty(str2)) ? R.drawable.menu_tag_edit : R.drawable.menu_tag_plus, org.telegram.messenger.hd.N0(z15 ? 2131751290 : TextUtils.isEmpty(str2) ? 2131754397 : 2131751263, null), new fi.q5(this, c22, str2, z15, z16), z19);
                    I.l(R.drawable.msg_admins, org.telegram.messenger.hd.N0(z27 ? 2131751292 : 2131745351, null), new hf0(ut0Var, 28), z21);
                    I.l(R.drawable.msg_permissions, org.telegram.messenger.hd.N0(2131752528, null), new wt0(this, channelParticipant2, chatParticipant, c22, ut0Var, 0), z20);
                    I.m(R.drawable.msg_remove, new tr0(9, this, chatParticipant), org.telegram.messenger.hd.N0(2131748862, null), z22, true);
                    I.V = org.telegram.messenger.ls.U2;
                    I.a0();
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

    public final void h4(boolean z10) {
        a0.h hVar;
        if (this.B1 || (hVar = this.C1) == null || this.v2 == null) {
            return;
        }
        this.B1 = true;
        int i7 = (hVar.m() == 0 || !z10) ? 0 : org.telegram.messenger.ls.X4;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = getMessagesController().j1(this.f1);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = z10 ? 0 : this.C1.m();
        tL_channels_getParticipants.limit = org.telegram.messenger.ls.e3;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new jg.u(this, tL_channels_getParticipants, i7)), this.classGuid);
    }

    public final void h5(dw0 dw0Var) {
        if (this.o5 == dw0Var) {
            return;
        }
        this.o5 = dw0Var;
        org.telegram.messenger.g0.d0(this.a, new gu0(this, 0));
    }

    public final org.telegram.ui.Components.n5 i4(TLRPC.EmojiStatus emojiStatus, boolean z10) {
        if (this.G == null) {
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(24.0f), 2, this.f, false);
            this.G = n5Var;
            if (this.H0) {
                n5Var.a();
            }
        }
        if (this.G.d()) {
            z10 = false;
        }
        this.F = null;
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) == 0 || tL_emojiStatus.until > ((int) (System.currentTimeMillis() / 1000))) {
                this.G.j(tL_emojiStatus.document_id, z10);
                this.G.m(false, z10);
            } else {
                this.G.g(o4(), z10);
                this.G.m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
                this.F = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                this.G.j(tL_emojiStatusCollectible.document_id, z10);
                this.G.m(true, z10);
            } else {
                this.G.g(o4(), z10);
                this.G.m(false, z10);
            }
        } else {
            this.G.g(o4(), z10);
            this.G.m(false, z10);
        }
        v5();
        return this.G;
    }

    public final void i5(CharSequence charSequence) {
        this.c6 = charSequence;
        L5();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.q2;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isLightStatusBar() {
        int w02;
        if (this.q2) {
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.x()) {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.w8, this.A0);
        } else if (this.X5 || this.G5 > 0.5f) {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.A0);
        } else {
            org.telegram.messenger.cp cpVar = this.n6;
            w02 = cpVar != null ? cpVar.d(org.telegram.ui.ActionBar.m6.I.q()) : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.s8, this.A0);
        }
        return i0.a.h(w02) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r3.contains((int) r7.getX(), ((int) r7.getY()) - r6.actionBar.getMeasuredHeight()) != false) goto L20;
     */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        vv0 vv0Var;
        av0 av0Var = this.o0;
        Rect rect = this.M2;
        if (av0Var != null && av0Var.getVisibility() == 0 && this.o0.getRealCount() > 1) {
            this.o0.getHitRect(rect);
            if (motionEvent != null) {
            }
        }
        if (this.N4 != -1 && (vv0Var = this.O) != null) {
            if (vv0Var.K0()) {
                this.O.getHitRect(rect);
                if (motionEvent == null || rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
                    vv0 vv0Var2 = this.O;
                    return vv0Var2.getSelectedTab() == vv0Var2.L0.getFirstTabId();
                }
            }
            return false;
        }
        return true;
    }

    public final int j4() {
        return e4() + k4();
    }

    public final void j5(int i7) {
        SharedPreferences g12 = org.telegram.messenger.np.g1();
        if (org.telegram.messenger.g0.Q1()) {
            return;
        }
        this.K1 = i7 != 0;
        this.L1 = i7 != 0;
        O5();
        if (g12.getBoolean("view_animations", true)) {
            this.J1 = i7;
        } else if (i7 == 2) {
            this.n1 = true;
        }
    }

    @Override // org.telegram.ui.le0
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final int k4() {
        return e4() == 0 ? org.telegram.messenger.g0.L(168.0f) : org.telegram.messenger.g0.L(152.0f);
    }

    public final void k5(TLRPC.UserFull userFull, org.telegram.ui.Cells.f6 f6Var, ax0 ax0Var) {
        this.w2 = userFull;
        org.telegram.ui.Components.xu0 xu0Var = this.T;
        if (xu0Var != null) {
            xu0Var.set(userFull.stars_rating);
        }
        cv0 cv0Var = this.v0;
        if (cv0Var != null) {
            cv0Var.setStories(this.w2.stories);
        }
        di.t0 t0Var = this.w0;
        if (t0Var != null) {
            t0Var.a();
        }
        zu0 zu0Var = this.f0;
        if (zu0Var != null) {
            zu0Var.setHasStories(A4());
        }
        vv0 vv0Var = this.O;
        if (vv0Var != null) {
            vv0Var.setUserInfo(this.w2);
        }
        if (this.x2 == null) {
            this.x2 = f6Var;
        }
        if (this.x2 == null) {
            this.x2 = new org.telegram.ui.Cells.f6(this.currentAccount);
        }
        org.telegram.ui.Cells.f6 f6Var2 = this.x2;
        n90 n90Var = new n90(this, 22);
        if (f6Var2.c) {
            n90Var.run();
        } else {
            f6Var2.h.add(n90Var);
        }
        this.x2.d(this.w2);
        if (this.z2 == null) {
            this.z2 = ax0Var;
        }
        ax0 ax0Var2 = this.z2;
        boolean z10 = true;
        if (ax0Var2 == null) {
            ax0 c10 = ax0.c(this.currentAccount, this.w2, ax0Var2);
            this.z2 = c10;
            this.y2 = c10 != null;
        }
        ax0 ax0Var3 = this.z2;
        if (ax0Var3 != null) {
            n90 n90Var2 = new n90(this, 18);
            if (ax0Var3.b) {
                n90Var2.run();
            } else {
                ax0Var3.h.add(n90Var2);
            }
        }
        org.telegram.ui.ActionBar.g5 g5Var = this.T0;
        if (g5Var != null) {
            TL_account.RequirementToContact P2 = getMessagesController().P2(this.e1);
            if (P2 != null && !(P2 instanceof TL_account.requirementToContactEmpty)) {
                z10 = false;
            }
            g5Var.R(20, z10);
            if (u4()) {
                this.T0.T(44);
            } else {
                this.T0.u(44);
            }
        }
    }

    public final float l4() {
        return Math.max(this.G5, this.W5);
    }

    public final void l5() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.xf0 xf0Var = new org.telegram.ui.Components.xf0(this.glassEngine, baseSimpleGlass);
        this.O5 = xf0Var;
        zw0 zw0Var = this.d1;
        if (zw0Var != null) {
            int i7 = zw0Var.I;
            boolean z10 = zw0Var.c;
            if (xf0Var.i != i7 || xf0Var.j != z10) {
                xf0Var.i = i7;
                xf0Var.j = z10;
                xf0Var.a();
            }
        }
        this.O5.b(this.P5);
        org.telegram.ui.Components.tf0 tf0Var = this.a0;
        if (tf0Var != null) {
            tf0Var.setGlassFactory(this.O5.c);
        }
        org.telegram.ui.Components.og0 og0Var = this.c0;
        if (og0Var != null) {
            og0Var.setGlassFactory(this.O5.c);
        }
        this.simpleActionBar.setButtonsGlass(this.O5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        tv0 tv0Var = this.s5;
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.h6 h6Var = this.A0;
        baseSimpleGlass.m = tv0Var;
        baseSimpleGlass.n = null;
        baseSimpleGlass.g(tv0Var, z4Var, h6Var);
        org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
        org.telegram.ui.Components.xf0 xf0Var2 = this.O5;
        dh.c cVar = xf0Var2.e;
        ui.d dVar = xf0Var2.f;
        z4Var2.o0 = cVar;
        z4Var2.p0 = dVar;
        z4Var2.setBackground(null);
        this.M5 = c8.i0.m(this.A0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.N5);
        E5();
        baseSimpleGlass.o = this.S6;
        View view = new View(getParentActivity());
        this.Z5 = view;
        view.setAlpha(0.0f);
        this.s5.getViewTreeObserver().addOnPreDrawListener(new gk(this, 1));
        this.O.z(this.Z5);
        View view2 = this.Z5;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.H5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        tv0 tv0Var2 = this.s5;
        tv0Var2.addView(this.H5, tv0Var2.indexOfChild(this.Z), c8.ma.e(-1, 0, 48));
        this.glassEngine.b(this.a);
        this.O.setPagesGlassEngine(this.glassEngine);
        this.O.setOnTopPanelShiftChanged(new n90(this, 21));
        H3();
        B5();
    }

    public final float m4(float f10, float f11) {
        this.B6 = f10;
        this.D6 = f11;
        int i7 = this.J1;
        float l10 = Utilities.l(i7 == 2 ? 1.0f : (this.T1 >= 1.0f || i7 == 0) ? this.l2 : 0.0f);
        org.telegram.ui.Components.xu0 xu0Var = this.T;
        return Math.max(0.0f, (r4() + this.u5) * l10) + com.google.android.gms.internal.vision.e2.z(1.0f, l10, f11 * (xu0Var != null ? xu0Var.getVisibilityFactor() : 0.0f), f10);
    }

    public final void m5(boolean z10, boolean z11) {
        if (this.h0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.g0 = null;
        }
        if (!z11) {
            if (z10) {
                this.h0.setAlpha(1.0f);
                this.h0.setVisibility(0);
                return;
            } else {
                this.h0.setAlpha(0.0f);
                this.h0.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.g0 = animatorSet2;
        int i7 = 1;
        if (z10) {
            this.h0.setVisibility(0);
            this.g0.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<org.telegram.ui.Cells.c4, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<org.telegram.ui.Cells.c4, Float>) View.ALPHA, 0.0f));
        }
        this.g0.setDuration(180L);
        this.g0.addListener(new nv0(this, z10, i7));
        this.g0.start();
    }

    public final float n4(float f10) {
        this.E6 = f10;
        int i7 = this.J1;
        return com.google.android.gms.internal.vision.e2.z(1.0f, Utilities.l(i7 == 2 ? 1.0f : (this.T1 >= 1.0f || i7 == 0) ? this.l2 : 0.0f), this.T != null ? this.T.getVisibilityFactor() * org.telegram.messenger.g0.L(3.0f) : 0.0f, f10);
    }

    public final void n5() {
        Long l10;
        if (this.T5 != null) {
            return;
        }
        j11[] j11VarArr = new j11[1];
        Rect rect = org.telegram.messenger.g0.Q;
        pk pkVar = this.f;
        if (pkVar != null) {
            if (pkVar.getRightDrawable() == null) {
                rect.set(this.f.getWidth() - 1, (this.f.getHeight() / 2) - 1, this.f.getWidth() + 1, (this.f.getHeight() / 2) + 1);
            } else {
                rect.set(this.f.getRightDrawable().getBounds());
                rect.offset((int) ((this.f.getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) this.f.getX(), (int) this.f.getY());
            }
        }
        int i7 = this.f.getScaleX() < 1.5f ? 16 : 32;
        int L = (-(this.Z.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(i7);
        float L2 = org.telegram.messenger.g0.L(324.0f);
        Point point = org.telegram.messenger.g0.q;
        int min = (int) Math.min(L2, point.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = c8.l9.b(centerX - (min / 2), 0, point.x - min);
        gv0 gv0Var = new gv0(this, this, getParentActivity(), Integer.valueOf(Math.max(0, centerX - b10)), this.F2 == null ? 0 : 9, this.A0, i7, j11VarArr);
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.e1));
        if (c22 != null) {
            gv0Var.setExpireDateHint(org.telegram.messenger.n5.g(c22.emoji_status));
        }
        Long l11 = this.F;
        if (l11 != null) {
            gv0Var.setSelected(l11);
        } else {
            org.telegram.ui.Components.n5 n5Var = this.G;
            if (n5Var != null) {
                Drawable drawable = n5Var.f[0];
                if (drawable instanceof org.telegram.ui.Components.p5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.p5) drawable).h());
                    gv0Var.setSelected(l10);
                }
            }
            l10 = null;
            gv0Var.setSelected(l10);
        }
        gv0Var.setSaveState(3);
        gv0Var.y(this.G, this.f);
        hv0 hv0Var = new hv0(this, gv0Var);
        this.T5 = hv0Var;
        j11VarArr[0] = hv0Var;
        int[] iArr = new int[2];
        pk pkVar2 = this.f;
        if (pkVar2 != null) {
            pkVar2.getLocationOnScreen(iArr);
        }
        j11VarArr[0].showAsDropDown(this.fragmentView, b10, L, 51);
        j11VarArr[0].b();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean needDelayOpenAnimation() {
        return this.J1 == 0;
    }

    public final org.telegram.ui.Components.mr o4() {
        if (this.K == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            this.E = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.qi, this.A0), PorterDuff.Mode.MULTIPLY);
            this.K = new org.telegram.ui.Components.mr(this.E, getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return this.K;
    }

    public final void o5() {
        int i7 = 0;
        this.O.L0.setReordering(false);
        vv0 vv0Var = this.O;
        org.telegram.ui.Components.fr0 fr0Var = vv0Var.L0;
        if (vv0Var.y1 != null && fr0Var != null) {
            boolean C0 = vv0Var.C0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = fr0Var.getTabIds();
            int size = tabIds.size();
            while (i7 < size) {
                Integer num = tabIds.get(i7);
                i7++;
                TLRPC.ProfileTab o02 = org.telegram.ui.Components.jt0.o0(num.intValue(), C0);
                if (o02 != null) {
                    arrayList.add(o02);
                }
            }
        }
        this.O.P1(true);
        this.E5.animate().translationY(org.telegram.messenger.g0.L(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.nr.h).withEndAction(new n90(this, 24)).start();
        org.telegram.ui.Components.lc.b0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        org.telegram.ui.Components.x30 x30Var = this.r0;
        if (x30Var != null) {
            x30Var.h(i7, i10, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.fr0 fr0Var;
        if (super.onBackPressed(z10)) {
            vv0 vv0Var = this.O;
            if (vv0Var == null || (fr0Var = vv0Var.L0) == null || !fr0Var.o0) {
                if (this.N4 == -1 || vv0Var == null || !vv0Var.F1) {
                    return this.actionBar.isEnabled();
                }
                if (z10) {
                    vv0Var.V(true);
                }
            } else if (z10) {
                o5();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        super.onBecomeFullyHidden();
        this.u6 = false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        U5();
        this.u6 = true;
        U3();
        if (!this.J0 || this.r5 || (view = this.fragmentView) == null) {
            return;
        }
        this.r5 = true;
        this.Y4 = true;
        view.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        super.onConfigurationChanged(configuration);
        vv0 vv0Var = this.O;
        if (vv0Var != null) {
            vv0Var.onConfigurationChanged(configuration);
        }
        v4();
        if (this.o2 && this.q2 && (m10 = this.c.m(0)) != null) {
            this.a.scrollBy(0, m10.getTop() - j4());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new d7(this, 5));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.q0 q0Var;
        boolean z11;
        org.telegram.ui.ActionBar.q0 q0Var2;
        Object obj;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.q0 j3;
        long j10;
        boolean z12;
        TLRPC.Chat chat;
        cx cxVar;
        xv xvVar;
        if (!this.J0) {
            N5();
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
                org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
                int i7 = 2;
                if (r4Var != null && r4Var.getFragmentStack().size() >= 2) {
                    Object obj2 = (org.telegram.ui.ActionBar.g2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    if (obj2 instanceof org.telegram.ui.Components.bh) {
                        this.m5 = (org.telegram.ui.Components.bh) obj2;
                    }
                    if (obj2 instanceof me0) {
                        obj2 = ((me0) obj2).K;
                    }
                    if ((obj2 instanceof cx) && (xvVar = (cxVar = (cx) obj2).H3) != null) {
                        ew ewVar = xvVar.a;
                        if (com.google.android.gms.internal.vision.e2.s(ewVar)) {
                            this.l5 = cxVar;
                            this.m5 = ewVar;
                        }
                    }
                }
                Object obj3 = this.m5;
                if (obj3 == null || ((org.telegram.ui.ActionBar.g2) obj3).getActionBar() == null) {
                    kVar = null;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.g2) this.m5).getActionBar();
                    kVar.setSkipDrawChild(true);
                }
                org.telegram.ui.Components.bh bhVar = this.m5;
                boolean z13 = (bhVar instanceof bn) && ((bn) bhVar).e != null;
                if (bhVar != null) {
                    ImageView imageView5 = this.j0;
                    if (imageView5 != null) {
                        if (!(bhVar instanceof bn) || (chat = ((bn) bhVar).e) == null || chat.linked_community_id == 0) {
                            imageView5.setTag(null);
                            this.j0.setVisibility(8);
                        } else {
                            imageView5.setTag(1);
                            this.j0.setVisibility(0);
                        }
                    }
                    if (this.m0 != null) {
                        org.telegram.ui.Components.bh bhVar2 = this.m5;
                        if ((bhVar2 instanceof bn) && org.telegram.messenger.v3.p0(((bn) bhVar2).e)) {
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
                    O5();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(this.J1 == 2 ? 250L : 180L);
                this.a.setLayerType(2, null);
                if (z10) {
                    this.k6 = 0.0f;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.r.getLayoutParams();
                    q0Var = null;
                    layoutParams.rightMargin = (int) ((org.telegram.messenger.g0.p * (-21.0f)) + org.telegram.messenger.g0.L(8.0f));
                    this.r.setLayoutParams(layoutParams);
                    if (this.J1 != 2) {
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
                        this.S1 = j4();
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
                    org.telegram.ui.Components.rh0 rh0Var = this.s;
                    if (rh0Var != null && rh0Var.getTag() == null) {
                        this.s.setScaleX(0.2f);
                        this.s.setScaleY(0.2f);
                        this.s.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.rh0, Float>) View.SCALE_X, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.rh0, Float>) View.SCALE_Y, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.rh0, Float>) View.ALPHA, 1.0f));
                    }
                    cv0 cv0Var = this.v0;
                    if (cv0Var != null && this.J1 == 2) {
                        cv0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.v0, (Property<cv0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.J1 == 2) {
                        this.s0 = f4(this.f0.getImageReceiver());
                        this.f.setTextColor(-1);
                        this.r.setTextColor(-1275068417);
                        this.actionBar.F(1090519039, false);
                        xw0 xw0Var = this.F6;
                        if (xw0Var != null) {
                            xw0Var.a(603979775);
                        }
                        mw0 mw0Var = this.N;
                        mw0Var.F = true;
                        mw0Var.setVisibility(0);
                    }
                    if (this.J1 == 2) {
                        this.f.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<pk, Float>) View.ALPHA, 1.0f));
                    } else {
                        this.f.setAlpha(1.0f);
                    }
                    if (this.v0 != null) {
                        if (a() > j10) {
                            this.v0.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.v0, (Property<cv0, Float>) View.ALPHA, 1.0f));
                        } else {
                            this.v0.setAlpha(1.0f);
                            this.v0.setFragmentTransitionProgress(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.v0, "fragmentTransitionProgress", 1.0f));
                        }
                    }
                    di.t0 t0Var = this.w0;
                    if (t0Var != null) {
                        t0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.w0, (Property<di.t0, Float>) View.ALPHA, 1.0f));
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
                    if (this.M0 && (this.f1 != j10 || z13)) {
                        this.Q0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.g5, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.g5, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.O0) {
                        this.S0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.g5, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.Y0.getTag() != null) {
                        this.Y0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.Y0, (Property<ImageView, Float>) View.ALPHA, 1.0f));
                    }
                    zu0 zu0Var = this.f0;
                    if (zu0Var != null) {
                        zu0Var.setCrossfadeProgress(1.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f0, wv0.h0, 0.0f));
                    }
                    org.telegram.ui.Components.bh bhVar3 = this.m5;
                    if (bhVar3 != null) {
                        org.telegram.ui.Components.co r10 = bhVar3.r();
                        if (r10 != null) {
                            org.telegram.ui.Components.yn ynVar = r10.e;
                            cx cxVar2 = this.l5;
                            View E = (cxVar2 == null || cxVar2.getFragmentView() == null) ? this.m5.E() : this.l5.getFragmentView();
                            RectF rectF = this.l6;
                            this.k6 = jh.k.c(ynVar, E, rectF) ? rectF.left : 0.0f;
                        }
                        if ((r10 != null && (r10.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.m5) && ((org.telegram.ui.ActionBar.m5) r10.getSubtitleTextView()).getLeftDrawable() != null) || r10.T[0] || x4(r10)) {
                            View subtitleTextView = r10.getSubtitleTextView();
                            this.a5 = subtitleTextView;
                            this.b5 = ((this.m5 instanceof bn) || subtitleTextView == null) ? 0.0f : this.r.getPaddingLeft() - this.a5.getPaddingLeft();
                            this.Z.invalidate();
                            this.r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<bv0, Float>) View.ALPHA, 1.0f));
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        setAvatarAnimationProgress(0.0f);
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        if (this.J1 == 2) {
                            this.r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<bv0, Float>) View.ALPHA, 1.0f));
                        } else {
                            this.r.setAlpha(1.0f);
                        }
                    }
                    animatorSet.playTogether(arrayList);
                } else {
                    q0Var = null;
                    this.S1 = this.Q1;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 1.0f, 0.0f));
                    org.telegram.ui.Components.rh0 rh0Var2 = this.s;
                    if (rh0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(rh0Var2, (Property<org.telegram.ui.Components.rh0, Float>) View.SCALE_X, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.rh0, Float>) View.SCALE_Y, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.rh0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.J1 == 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f, (Property<pk, Float>) View.ALPHA, 0.0f));
                    }
                    cv0 cv0Var2 = this.v0;
                    if (cv0Var2 != null) {
                        if (this.i1 > 0) {
                            arrayList2.add(ObjectAnimator.ofFloat(cv0Var2, (Property<cv0, Float>) View.ALPHA, 0.0f));
                        } else {
                            arrayList2.add(ObjectAnimator.ofFloat(cv0Var2, "fragmentTransitionProgress", 0.0f));
                        }
                    }
                    di.t0 t0Var2 = this.w0;
                    if (t0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(t0Var2, (Property<di.t0, Float>) View.ALPHA, 0.0f));
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
                    if (this.M0 && (this.f1 != 0 || z13)) {
                        this.Q0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.g5, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.g5, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.O0) {
                        this.S0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.g5, Float>) View.ALPHA, 0.0f));
                    }
                    ImageView imageView6 = this.Y0;
                    if (imageView6 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) View.ALPHA, imageView6.getAlpha(), 0.0f));
                    }
                    zu0 zu0Var2 = this.f0;
                    if (zu0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(zu0Var2, wv0.h0, 1.0f));
                    }
                    org.telegram.ui.ActionBar.g2 g2Var = this.parentLayout.getFragmentStack().size() > 1 ? (org.telegram.ui.ActionBar.g2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) : null;
                    if (g2Var instanceof bn) {
                        bn bnVar = (bn) g2Var;
                        vi viVar = bnVar.p1;
                        org.telegram.messenger.g0.K(viVar, new mc0(this, viVar, bnVar, 27));
                        View subtitleTextView2 = viVar.getSubtitleTextView();
                        if (((subtitleTextView2 instanceof org.telegram.ui.ActionBar.m5) && ((org.telegram.ui.ActionBar.m5) subtitleTextView2).getLeftDrawable() != null) || viVar.T[0]) {
                            this.a5 = viVar.getSubtitleTextView();
                            this.Z.invalidate();
                            arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<bv0, Float>) View.ALPHA, 0.0f));
                            z11 = true;
                        }
                        z11 = false;
                    } else {
                        org.telegram.ui.Components.bh bhVar4 = this.m5;
                        if (bhVar4 != null && bhVar4.r() != null) {
                            org.telegram.ui.Components.co r11 = this.m5.r();
                            org.telegram.messenger.g0.K(r11, new tr0(12, this, r11));
                            if (x4(r11)) {
                                View subtitleTextView3 = r11.getSubtitleTextView();
                                this.a5 = subtitleTextView3;
                                this.b5 = ((this.m5 instanceof bn) || subtitleTextView3 == null) ? 0.0f : this.r.getPaddingLeft() - this.a5.getPaddingLeft();
                                this.Z.invalidate();
                                arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<bv0, Float>) View.ALPHA, 0.0f));
                                z11 = true;
                            }
                        }
                        z11 = false;
                    }
                    if (!z11 && this.J1 == 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<bv0, Float>) View.ALPHA, 0.0f));
                    }
                    animatorSet.playTogether(arrayList2);
                    dx0 dx0Var = this.G6;
                    if (dx0Var != null) {
                        dx0Var.animate().alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.nr.h).start();
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new du0(this, i7));
                animatorSet.playTogether(ofFloat);
                if (this.P0 == null || (obj = this.m5) == null || (yVar = ((org.telegram.ui.ActionBar.g2) obj).getActionBar().F) == null || (j3 = yVar.j(32)) == null || j3.getVisibility() != 0) {
                    q0Var2 = q0Var;
                } else {
                    j3.setAlpha(0.0f);
                    if (z10) {
                        this.P0.setVisibility(0);
                    }
                    this.P0.setTag(j3);
                    q0Var2 = j3;
                }
                animatorSet.addListener(new jg.j0(this, kVar, q0Var2, runnable, 4));
                animatorSet.setInterpolator(this.J1 == 2 ? org.telegram.ui.Components.nr.f : new DecelerateInterpolator());
                org.telegram.messenger.g0.h3(new hq0(animatorSet, 4), 50L);
                return animatorSet;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.g2
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
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        long e10;
        org.telegram.ui.Components.bt0 bt0Var;
        lw0 lw0Var;
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
        this.i5 = pf.b.d(this.arguments.getString("vcard_phone"), false);
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
            boolean z10 = this.arguments.getBoolean("expandPhoto", false);
            this.n1 = z10;
            if (z10) {
                this.l2 = 1.0f;
                this.o1 = true;
            }
        }
        if (this.e1 == 0) {
            if (this.f1 != 0) {
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f1));
                this.F2 = O0;
                if (O0 == null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    getMessagesStorage().a.c(new tr0(13, this, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                    if (this.F2 != null) {
                        getMessagesController().X3(this.F2, true);
                    }
                }
                org.telegram.messenger.n6 n6Var = this.Y1;
                if (n6Var != null) {
                    n6Var.g();
                }
                if (this.F2.megagroup) {
                    h4(true);
                } else {
                    this.C1 = null;
                }
                getNotificationCenter().c(this, org.telegram.messenger.ls.T);
                getNotificationCenter().c(this, org.telegram.messenger.ls.g1);
                getNotificationCenter().c(this, org.telegram.messenger.ls.w2);
                getNotificationCenter().c(this, org.telegram.messenger.ls.b1);
                getNotificationCenter().c(this, org.telegram.messenger.ls.r3);
                org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.E5);
                this.D2 = new ArrayList();
                K5(true);
                if (this.v2 == null) {
                    this.v2 = getMessagesController().P0(this.f1);
                }
                if (org.telegram.messenger.v3.T(this.F2)) {
                    getMessagesController().b3(this.classGuid, this.f1, true);
                } else if (this.v2 == null) {
                    this.v2 = getMessagesStorage().F0(this.f1, false, null, false, false, 0);
                }
                y5();
                e10 = getUserConfig().e();
                if (this.e1 != e10) {
                }
                this.s1 = true;
                bt0Var = this.R;
                if (bt0Var != null) {
                    bt0Var.b(this);
                    this.R = null;
                }
                if (this.R == null) {
                }
                this.R.y.add(this);
                getNotificationCenter().c(this, org.telegram.messenger.ls.r);
                getNotificationCenter().c(this, 1);
                getNotificationCenter().c(this, org.telegram.messenger.ls.t);
                getNotificationCenter().c(this, org.telegram.messenger.ls.v);
                getNotificationCenter().c(this, org.telegram.messenger.ls.t5);
                getNotificationCenter().c(this, org.telegram.messenger.ls.D1);
                getNotificationCenter().c(this, org.telegram.messenger.ls.c0);
                getNotificationCenter().c(this, org.telegram.messenger.ls.y5);
                getNotificationCenter().c(this, org.telegram.messenger.ls.I5);
                getNotificationCenter().c(this, org.telegram.messenger.ls.k3);
                getNotificationCenter().c(this, org.telegram.messenger.ls.i5);
                getNotificationCenter().c(this, org.telegram.messenger.ls.A3);
                getNotificationCenter().c(this, org.telegram.messenger.ls.E3);
                getNotificationCenter().c(this, org.telegram.messenger.ls.F3);
                getNotificationCenter().c(this, org.telegram.messenger.ls.y1);
                getNotificationCenter().c(this, org.telegram.messenger.ls.h3);
                getNotificationCenter().c(this, org.telegram.messenger.ls.I3);
                getNotificationCenter().c(this, org.telegram.messenger.ls.Y3);
                getNotificationCenter().c(this, org.telegram.messenger.ls.Z3);
                org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.l4);
                N5();
                lw0Var = this.d;
                if (lw0Var != null) {
                }
                if (this.arguments.containsKey("preload_messages")) {
                }
                if (this.e1 != 0) {
                    getConnectionsManager().sendRequest(new TL_account.getPassword(), new hu0(this, 5));
                }
                setBulletinDelegate(new z8(this, 8));
                if (this.e1 != 0) {
                    getMessagesController().T0(null);
                }
                Z4();
                this.N6 = !this.J0 ? org.telegram.messenger.g0.L(72.0f) : 0;
                this.O6 = this.J0 ? org.telegram.messenger.g0.L(64.0f) : 0;
                return true;
            }
            return false;
        }
        long j3 = this.arguments.getLong("dialog_id", 0L);
        this.i1 = j3;
        if (j3 != 0) {
            this.E2 = getMessagesController().c1(Integer.valueOf((int) (this.i1 & 4294967295L)));
        }
        org.telegram.messenger.n6 n6Var2 = this.Y1;
        if (n6Var2 != null) {
            n6Var2.g();
        }
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.e1));
        if (c22 != null) {
            getNotificationCenter().c(this, org.telegram.messenger.ls.O);
            getNotificationCenter().c(this, org.telegram.messenger.ls.s1);
            getNotificationCenter().c(this, org.telegram.messenger.ls.a0);
            getNotificationCenter().c(this, org.telegram.messenger.ls.Y);
            getNotificationCenter().c(this, org.telegram.messenger.ls.g0);
            getNotificationCenter().c(this, org.telegram.messenger.ls.D0);
            getNotificationCenter().c(this, org.telegram.messenger.ls.E0);
            getNotificationCenter().c(this, org.telegram.messenger.ls.k0);
            org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.A4);
            this.k1 = getMessagesController().H0.indexOfKey(this.e1) >= 0;
            if (c22.bot) {
                this.s2 = true;
                org.telegram.messenger.si mediaDataController = getMediaDataController();
                long j10 = c22.id;
                mediaDataController.J0(j10, j10, true, this.classGuid, null);
            }
            this.w2 = getMessagesController().d2(this.e1);
            getMessagesController().c3(getMessagesController().c2(Long.valueOf(this.e1)), this.classGuid, true, null);
            this.C1 = null;
            if (org.telegram.messenger.p10.C(c22)) {
                org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(0, true, true);
                this.r0 = x30Var;
                x30Var.I = true;
                x30Var.a = this;
                x30Var.b = this;
                getMediaDataController().z();
                getMessagesController().j3();
                getMessagesController().n3(getUserConfig().f(), true, this.classGuid);
            }
            this.c5 = this.arguments.getInt("actionBarColor", 0);
            e10 = getUserConfig().e();
            if ((this.e1 != e10 || this.i1 == e10) && !this.s1) {
                this.s1 = true;
            }
            bt0Var = this.R;
            if (bt0Var != null && bt0Var.s != this.g1) {
                bt0Var.b(this);
                this.R = null;
            }
            if (this.R == null) {
                this.R = new org.telegram.ui.Components.bt0(this);
            }
            this.R.y.add(this);
            getNotificationCenter().c(this, org.telegram.messenger.ls.r);
            getNotificationCenter().c(this, 1);
            getNotificationCenter().c(this, org.telegram.messenger.ls.t);
            getNotificationCenter().c(this, org.telegram.messenger.ls.v);
            getNotificationCenter().c(this, org.telegram.messenger.ls.t5);
            getNotificationCenter().c(this, org.telegram.messenger.ls.D1);
            getNotificationCenter().c(this, org.telegram.messenger.ls.c0);
            getNotificationCenter().c(this, org.telegram.messenger.ls.y5);
            getNotificationCenter().c(this, org.telegram.messenger.ls.I5);
            getNotificationCenter().c(this, org.telegram.messenger.ls.k3);
            getNotificationCenter().c(this, org.telegram.messenger.ls.i5);
            getNotificationCenter().c(this, org.telegram.messenger.ls.A3);
            getNotificationCenter().c(this, org.telegram.messenger.ls.E3);
            getNotificationCenter().c(this, org.telegram.messenger.ls.F3);
            getNotificationCenter().c(this, org.telegram.messenger.ls.y1);
            getNotificationCenter().c(this, org.telegram.messenger.ls.h3);
            getNotificationCenter().c(this, org.telegram.messenger.ls.I3);
            getNotificationCenter().c(this, org.telegram.messenger.ls.Y3);
            getNotificationCenter().c(this, org.telegram.messenger.ls.Z3);
            org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.l4);
            N5();
            lw0Var = this.d;
            if (lw0Var != null) {
                lw0Var.f();
            }
            if (this.arguments.containsKey("preload_messages")) {
                getMessagesController().t0(this.e1, 0, null);
            }
            if (this.e1 != 0 && org.telegram.messenger.p10.C(getMessagesController().c2(Long.valueOf(this.e1)))) {
                getConnectionsManager().sendRequest(new TL_account.getPassword(), new hu0(this, 5));
            }
            setBulletinDelegate(new z8(this, 8));
            if (this.e1 != 0 && org.telegram.messenger.p10.C(getMessagesController().c2(Long.valueOf(this.e1))) && !this.s1) {
                getMessagesController().T0(null);
            }
            Z4();
            this.N6 = !this.J0 ? org.telegram.messenger.g0.L(72.0f) : 0;
            this.O6 = this.J0 ? org.telegram.messenger.g0.L(64.0f) : 0;
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        vv0 vv0Var = this.O;
        if (vv0Var != null) {
            vv0Var.R0();
        }
        org.telegram.ui.Components.bt0 bt0Var = this.R;
        if (bt0Var != null) {
            bt0Var.b(this);
        }
        org.telegram.ui.Components.bt0 bt0Var2 = this.R;
        if (bt0Var2 != null) {
            bt0Var2.y.remove(this);
        }
        getNotificationCenter().n(this, org.telegram.messenger.ls.r);
        getNotificationCenter().n(this, org.telegram.messenger.ls.t);
        getNotificationCenter().n(this, org.telegram.messenger.ls.v);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.ls.t5);
        getNotificationCenter().n(this, org.telegram.messenger.ls.D1);
        getNotificationCenter().n(this, org.telegram.messenger.ls.c0);
        getNotificationCenter().n(this, org.telegram.messenger.ls.y5);
        getNotificationCenter().n(this, org.telegram.messenger.ls.I5);
        getNotificationCenter().n(this, org.telegram.messenger.ls.k3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.i5);
        getNotificationCenter().n(this, org.telegram.messenger.ls.A3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.E3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.F3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.y1);
        getNotificationCenter().n(this, org.telegram.messenger.ls.h3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.I3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.Y3);
        getNotificationCenter().n(this, org.telegram.messenger.ls.Z3);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.l4);
        av0 av0Var = this.o0;
        if (av0Var != null) {
            av0Var.K();
        }
        org.telegram.ui.Components.zf0 zf0Var = this.n0;
        if (zf0Var != null) {
            zf0Var.d();
        }
        this.f6 = null;
        if (this.e1 != 0) {
            getNotificationCenter().n(this, org.telegram.messenger.ls.s1);
            getNotificationCenter().n(this, org.telegram.messenger.ls.O);
            getNotificationCenter().n(this, org.telegram.messenger.ls.a0);
            getNotificationCenter().n(this, org.telegram.messenger.ls.Y);
            getNotificationCenter().n(this, org.telegram.messenger.ls.g0);
            getNotificationCenter().n(this, org.telegram.messenger.ls.D0);
            getNotificationCenter().n(this, org.telegram.messenger.ls.E0);
            getNotificationCenter().n(this, org.telegram.messenger.ls.k0);
            org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.A4);
            getMessagesController().r1.remove(Long.valueOf(this.e1));
        } else if (this.f1 != 0) {
            org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.E5);
            getNotificationCenter().n(this, org.telegram.messenger.ls.r3);
            getNotificationCenter().n(this, org.telegram.messenger.ls.T);
            getNotificationCenter().n(this, org.telegram.messenger.ls.g1);
            getNotificationCenter().n(this, org.telegram.messenger.ls.w2);
            getNotificationCenter().n(this, org.telegram.messenger.ls.b1);
        }
        zu0 zu0Var = this.f0;
        if (zu0Var != null) {
            zu0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.x30 x30Var = this.r0;
        if (x30Var != null) {
            x30Var.d();
        }
        ev0 ev0Var = this.Z4;
        if (ev0Var != null) {
            ev0Var.b();
        }
        ax0 ax0Var = this.z2;
        if (ax0Var != null && this.y2) {
            ax0Var.b(true);
            this.z2 = null;
        }
        ai.o2 o2Var = this.D5;
        if (o2Var != null) {
            this.D5 = null;
            org.telegram.messenger.g0.g3(o2Var);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        org.telegram.ui.Components.qr0 qr0Var;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.x30 x30Var = this.r0;
        if (x30Var != null) {
            x30Var.i();
        }
        org.telegram.messenger.n6 n6Var = this.Y1;
        if (n6Var != null) {
            n6Var.e();
        }
        vv0 vv0Var = this.O;
        if (vv0Var == null || (qr0Var = vv0Var.W) == null) {
            return;
        }
        qr0Var.e = false;
        if (qr0Var.c != null) {
            qr0Var.a.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.x30 x30Var = this.r0;
        if (x30Var != null) {
            x30Var.j(i7, strArr, iArr);
        }
        if (i7 != 101 && i7 != 102) {
            if (i7 != 103 || this.F2 == null) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= iArr.length) {
                    z11 = true;
                    break;
                } else {
                    if (iArr[i10] != 0) {
                        z11 = false;
                        break;
                    }
                    i10++;
                }
            }
            if (iArr.length <= 0 || !z11) {
                org.telegram.ui.Components.voip.b2.h(getParentActivity(), null, i7);
                return;
            } else {
                org.telegram.ui.Components.voip.b2.l(this.F2, null, getMessagesController().i1(this.f1, false, null) == null, null, getParentActivity(), this, getAccountInstance());
                return;
            }
        }
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.e1));
        if (c22 == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= iArr.length) {
                z10 = true;
                break;
            } else {
                if (iArr[i11] != 0) {
                    z10 = false;
                    break;
                }
                i11++;
            }
        }
        if (iArr.length <= 0 || !z10) {
            org.telegram.ui.Components.voip.b2.h(getParentActivity(), null, i7);
            return;
        }
        boolean z12 = i7 == 102;
        TLRPC.UserFull userFull = this.w2;
        org.telegram.ui.Components.voip.b2.m(c22, z12, userFull != null && userFull.video_calls_available, getParentActivity(), this.w2, getAccountInstance());
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        TLRPC.User c22;
        uv uvVar;
        super.onResume();
        vv0 vv0Var = this.O;
        if (vv0Var != null) {
            vv0Var.e1 = true;
            org.telegram.ui.Components.pr0 pr0Var = vv0Var.K;
            if (pr0Var != null) {
                pr0Var.f();
            }
            org.telegram.ui.Components.ws0 ws0Var = vv0Var.N;
            if (ws0Var != null) {
                ws0Var.f();
            }
            org.telegram.ui.Components.xs0 xs0Var = vv0Var.M;
            if (xs0Var != null) {
                xs0Var.X(false);
            }
            for (int i7 = 0; i7 < vv0Var.n0.length; i7++) {
                vv0Var.e0(i7);
            }
            org.telegram.ui.Components.qr0 qr0Var = vv0Var.W;
            if (qr0Var != null) {
                qr0Var.e = true;
                if (qr0Var.c != null) {
                    qr0Var.a.onResume();
                }
            }
        }
        v4();
        lw0 lw0Var = this.d;
        if (lw0Var != null) {
            this.X4 = true;
            lw0Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (uvVar = this.U) != null && uvVar.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        org.telegram.ui.Components.x30 x30Var = this.r0;
        if (x30Var != null) {
            x30Var.k();
            setParentActivityTitle(org.telegram.messenger.hd.N0(2131745299, null));
        }
        M5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new d7(this, 5));
        }
        pk pkVar = this.f;
        if (pkVar != null) {
            setParentActivityTitle(pkVar.getText());
        }
        if (this.e1 != 0 && (c22 = getMessagesController().c2(Long.valueOf(this.e1))) != null && c22.photo == null && this.Q1 >= j4()) {
            this.k2.cancel();
            float[] fArr = this.n2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            a5(1.0f);
            this.o0.setVisibility(8);
            this.Q1 = j4();
            this.p2 = false;
            this.c.h1(0, j4() - this.a.getPaddingTop());
        }
        org.telegram.messenger.n6 n6Var = this.Y1;
        if (n6Var != null) {
            n6Var.a();
        }
        G5();
        B4(false);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.z0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, this.A0));
            p5();
            Q5();
            J3();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.z4 z4Var;
        if (z10 && (z4Var = this.simpleActionBar) != null) {
            z4Var.setAlpha(1.0f);
        }
        if (z10) {
            if (!z11) {
                int i7 = this.J1;
                if (i7 != 0 && this.M1) {
                    if (i7 == 1) {
                        this.l2 = 0.0f;
                        org.telegram.ui.Components.xu0 xu0Var = this.T;
                        if (xu0Var != null) {
                            xu0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.tf0 tf0Var = this.a0;
                        if (tf0Var != null) {
                            tf0Var.setParentExpanded(0.0f);
                        }
                        c5(0.0f);
                        org.telegram.ui.Components.og0 og0Var = this.c0;
                        if (og0Var != null) {
                            og0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    O3();
                    if (this.I1) {
                        S3(true);
                    }
                }
                if (!this.r5) {
                    this.r5 = true;
                    this.Y4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.T4);
            uv uvVar = this.U;
            if (uvVar != null && uvVar.getVisibility() == 0) {
                this.U.setVisibility(8);
                this.U.setBackground(null);
            }
        }
        this.H1 = false;
        Q3();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        uv uvVar = this.U;
        if (uvVar == null || uvVar.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.U.setAlpha(1.0f - f10);
        } else {
            this.U.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        ImageView imageView;
        org.telegram.ui.Components.tf0 tf0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.i6 = z10;
        if (z10 && (tf0Var = this.a0) != null) {
            ArrayList arrayList = tf0Var.a;
            if (tf0Var.F == 6) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.ui.Components.qf0 qf0Var = (org.telegram.ui.Components.qf0) arrayList.get(i7);
                    org.telegram.ui.Components.oh0 oh0Var = qf0Var.k;
                    if (oh0Var != null) {
                        if (qf0Var.a == 15) {
                            oh0Var.M(14);
                        } else {
                            oh0Var.M(0);
                        }
                        qf0Var.k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.P0) != null && imageView.getTag() != null && (this.P0.getTag() instanceof org.telegram.ui.ActionBar.q0)) {
            ((org.telegram.ui.ActionBar.q0) this.P0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.J1 != 0 && this.M1 && !this.q2) {
            this.G1 = true;
            if (!z10) {
                if (this.f6 == null) {
                    this.f6 = new float[14];
                }
                this.F1 = this.Q1;
                this.f6[0] = this.Y.getScaleX();
                this.f6[1] = this.Y.getTranslationX();
                this.f6[2] = this.Y.getTranslationY();
                org.telegram.ui.Components.tf0 tf0Var2 = this.a0;
                if (tf0Var2 != null) {
                    this.f6[3] = tf0Var2.getAlpha();
                }
                di.t0 t0Var = this.w0;
                if (t0Var != null) {
                    float[] fArr = this.f6;
                    fArr[4] = t0Var.e;
                    fArr[5] = t0Var.f;
                }
                if (this.F6 != null) {
                    this.f6[6] = r0.getAlpha();
                }
                this.f6[7] = this.f.getScaleX();
                this.f6[8] = this.f.getTranslationY();
                this.f6[9] = this.r.getTranslationY();
                this.f6[10] = this.f.getLayoutParams().width;
                float[] fArr2 = this.f6;
                fArr2[11] = this.d2;
                fArr2[12] = this.f.getTranslationX();
                this.f6[13] = this.r.getTranslationX();
                hi.l3 l3Var = this.H6;
                if (l3Var != null) {
                    l3Var.f(true);
                }
            }
        }
        if (z10) {
            if (this.r0 != null) {
                this.T4 = getNotificationCenter().q(new int[]{org.telegram.messenger.ls.s, org.telegram.messenger.ls.t, org.telegram.messenger.ls.W, org.telegram.messenger.ls.X, org.telegram.messenger.ls.E0, org.telegram.messenger.ls.u4}, this.T4, true);
            } else {
                this.T4 = getNotificationCenter().q(new int[]{org.telegram.messenger.ls.s, org.telegram.messenger.ls.t, org.telegram.messenger.ls.W, org.telegram.messenger.ls.X, org.telegram.messenger.ls.u4}, this.T4, true);
            }
            if (!z11 && getParentActivity() != null) {
                this.d5 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.H1 = true;
        Q3();
    }

    public final float p4(int i7) {
        org.telegram.ui.Components.bh bhVar = this.m5;
        if (bhVar == null || (bhVar instanceof bn) || bhVar.r() == null) {
            return 1.0f;
        }
        org.telegram.ui.Components.co r10 = this.m5.r();
        View titleTextView = i7 == 0 ? r10.getTitleTextView() : r10.getSubtitleTextView();
        float textSize = (i7 == 0 ? this.f : this.r).getPaint().getTextSize();
        if (!(titleTextView instanceof org.telegram.ui.ActionBar.m5) || textSize <= 0.0f) {
            return 1.0f;
        }
        return ((org.telegram.ui.ActionBar.m5) titleTextView).getPaint().getTextSize() / textSize;
    }

    public final void p5() {
        if (!this.q2) {
            bv0 bv0Var = this.r;
            if (bv0Var != null) {
                Object tag = bv0Var.getTag();
                if (tag instanceof Integer) {
                    this.r.setTextColor(I3(org.telegram.ui.ActionBar.m6.w0(((Integer) tag).intValue(), this.A0), Boolean.valueOf(this.K0[0])));
                } else {
                    this.r.setTextColor(I3(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, this.A0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.x;
            if (drawable != null) {
                drawable.setColorFilter(this.n6 != null ? -1 : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.gd, this.A0), PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.vk0 vk0Var = this.L;
            if (vk0Var != null) {
                vk0Var.b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h8, this.A0));
            }
            pk pkVar = this.f;
            if (pkVar != null) {
                pkVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.mi, this.A0));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.G(this.n6 == null ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v8, this.A0) : -1, false);
                this.actionBar.F(this.n6 != null ? 553648127 : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f8, this.A0), false);
            }
        }
        v5();
        T5();
    }

    public final float q4(float f10, int i7, View view) {
        float left;
        int paddingLeft;
        org.telegram.ui.Components.bh bhVar = this.m5;
        if (bhVar != null && !(bhVar instanceof bn) && this.fragmentView != null && (view.getParent() instanceof View)) {
            org.telegram.ui.Components.co r10 = this.m5.r();
            org.telegram.ui.ActionBar.k actionBar = ((org.telegram.ui.ActionBar.g2) this.m5).getActionBar();
            View view2 = null;
            if (i7 == 0) {
                if (r10 != null) {
                    view2 = r10.getTitleTextView();
                }
            } else if (i7 == 1) {
                if (r10 != null) {
                    view2 = r10.getSubtitleTextView();
                }
            } else if (actionBar != null) {
                view2 = actionBar.getBackButton();
            }
            if (view2 != null) {
                cx cxVar = this.l5;
                View E = (cxVar == null || cxVar.getFragmentView() == null) ? this.m5.E() : this.l5.getFragmentView();
                RectF rectF = this.l6;
                if (jh.k.c(view2, E, rectF)) {
                    float f11 = rectF.left;
                    if (jh.k.c((View) view.getParent(), this.fragmentView, rectF)) {
                        if (i7 == 2) {
                            left = rectF.left;
                            paddingLeft = view.getLeft();
                        } else {
                            f11 += view2.getPaddingLeft();
                            left = rectF.left + view.getLeft();
                            paddingLeft = view.getPaddingLeft();
                        }
                        return f11 - (left + paddingLeft);
                    }
                }
            }
        }
        return f10;
    }

    public final void q5() {
        k0 k0Var;
        if (this.a0 == null || this.r == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        org.telegram.ui.Components.tf0 tf0Var = this.a0;
        boolean z10 = this.G1;
        tf0Var.e = z10;
        if (z10 && this.J1 == 2 && (k0Var = this.Y) != null) {
            this.a0.f = this.Y.getY() + (this.Y.getScaleY() * k0Var.getHeight());
            this.a0.setAlpha(this.T1);
            org.telegram.ui.Components.tf0 tf0Var2 = this.a0;
            float measuredWidth = this.a.getMeasuredWidth();
            tf0Var2.x = org.telegram.messenger.g0.L(74.0f);
            tf0Var2.setTranslationY(measuredWidth);
            tf0Var2.invalidate();
        } else {
            tf0Var.f = -1.0f;
            float f10 = currentActionBarHeight;
            float L = (this.Q1 + f10) - org.telegram.messenger.g0.L((this.L4 || this.M4) ? 25.0f : 0.0f);
            float min = Math.min(org.telegram.messenger.g0.L(74.0f), L - f10);
            org.telegram.ui.Components.tf0 tf0Var3 = this.a0;
            tf0Var3.x = min;
            tf0Var3.setTranslationY(L - min);
            tf0Var3.invalidate();
        }
        ImageView imageView = this.P0;
        if (imageView == null || imageView.getTag() == null) {
            return;
        }
        this.a0.getClass();
        if (this.P0.getVisibility() == 0) {
            this.P0.setVisibility(8);
        }
        if (this.P0.getTag() instanceof org.telegram.ui.ActionBar.q0) {
            ((org.telegram.ui.ActionBar.q0) this.P0.getTag()).setAlpha(1.0f);
        }
    }

    public final float r4() {
        if (this.T == null) {
            return 0.0f;
        }
        return this.T.getVisibilityFactor() * org.telegram.messenger.g0.L(22.0f);
    }

    public final void r5() {
        if (this.Z0 == null || this.a1 == null) {
            return;
        }
        TLRPC.UserFull userFull = this.w2;
        int i7 = (userFull == null && this.v2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.v2.ttl_period;
        this.t0.b(i7);
        this.a1.u(i7);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.x30 x30Var = this.r0;
        if (x30Var != null) {
            x30Var.f = bundle.getString("path");
        }
    }

    public final int s4() {
        if (this.q1) {
            return 0;
        }
        if (this.f1 == 0 || !org.telegram.messenger.v3.c0(getMessagesController().O0(Long.valueOf(this.f1)))) {
            return org.telegram.messenger.g0.L(50.0f);
        }
        return org.telegram.messenger.g0.L(A4() ? 24.0f : 38.0f);
    }

    public final void s5() {
        if (this.y5 == null) {
            return;
        }
        vv0 vv0Var = this.O;
        boolean z10 = ((vv0Var == null || !vv0Var.isAttachedToWindow()) ? (float) org.telegram.messenger.g0.L(72.0f) : ((float) org.telegram.messenger.g0.L(232.0f)) - (((float) this.a.getMeasuredHeight()) - this.O.getY())) <= 0.0f;
        te.a aVar = this.S5;
        aVar.a(z10, true);
        float f10 = aVar.e;
        this.y5.setTranslationY(org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(60.0f), 0));
        this.y5.setAlpha(f10);
        this.y5.setVisibility(f10 <= 0.0f ? 4 : 0);
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
        if (gcVar != null) {
            gcVar.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.x30 x30Var = this.r0;
        if (x30Var == null || (str = x30Var.f) == null) {
            return;
        }
        bundle.putString("path", str);
    }

    public void setAvatarAnimationProgress(float f10) {
        int w02;
        int w03;
        int w04;
        this.l2 = f10;
        this.T1 = f10;
        Q3();
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.setAlpha(f10);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.getBackButton().setTranslationX(org.telegram.messenger.g0.T1(q4(org.telegram.messenger.g0.L(2.0f), 2, this.actionBar.getBackButton()), org.telegram.messenger.g0.L(2.0f), f10));
        }
        if (this.J1 == 2) {
            this.f0.setProgressToExpand(f10);
            org.telegram.ui.Components.tf0 tf0Var = this.a0;
            if (tf0Var != null) {
                tf0Var.setParentExpanded(f10);
            }
            c5(f10);
            org.telegram.ui.Components.og0 og0Var = this.c0;
            if (og0Var != null) {
                og0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.xu0 xu0Var = this.T;
            if (xu0Var != null) {
                xu0Var.setParentExpanded(f10);
            }
            q5();
            I5();
        }
        this.a.setAlpha(f10);
        this.a.setTranslationX(org.telegram.messenger.g0.L(48.0f) - (org.telegram.messenger.g0.L(48.0f) * f10));
        if (this.J1 != 2 || (w02 = this.s0) == 0) {
            if (this.e1 == 0) {
                if (org.telegram.messenger.v3.S(this.currentAccount, this.f1)) {
                    boolean z10 = this.F2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.h6 h6Var = this.A0;
            int[][] iArr = org.telegram.ui.Components.b9.L;
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, h6Var);
        }
        int i7 = this.c5;
        if (i7 == 0) {
            i7 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.s8, this.A0);
        }
        this.d1.setBackgroundColor(i0.a.f(f10, i0.a.o(i7, 0), w02));
        org.telegram.ui.Components.l01 l01Var = this.m0;
        int f11 = i0.a.f(f10, i7, w02);
        l01Var.k = true;
        l01Var.b.setColor(f11);
        if (this.n6 != null) {
            w03 = -1;
        } else {
            if (this.e1 == 0) {
                if (org.telegram.messenger.v3.S(this.currentAccount, this.f1)) {
                    boolean z11 = this.F2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.h6 h6Var2 = this.A0;
            int[][] iArr2 = org.telegram.ui.Components.b9.L;
            w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.g8, h6Var2);
        }
        this.actionBar.G(i0.a.f(this.T1, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v8, this.A0), w03), false);
        int w05 = this.n6 == null ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.mi, this.A0) : -1;
        int w06 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, this.A0);
        pk pkVar = this.f;
        if (pkVar != null && this.J1 != 2) {
            pkVar.setTextColor(i0.a.f(f10, w06, w05));
        }
        boolean[] zArr = this.K0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.si, this.A0);
        } else {
            if (this.e1 == 0) {
                if (org.telegram.messenger.v3.S(this.currentAccount, this.f1)) {
                    boolean z12 = this.F2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.h6 h6Var3 = this.A0;
            int[][] iArr3 = org.telegram.ui.Components.b9.L;
            w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h8, h6Var3);
        }
        int w07 = org.telegram.ui.ActionBar.m6.w0(zArr[0] ? org.telegram.ui.ActionBar.m6.pa : org.telegram.ui.ActionBar.m6.B8, this.A0);
        bv0 bv0Var = this.r;
        if (bv0Var != null && this.J1 != 2) {
            bv0Var.setTextColor(i0.a.f(f10, w07, I3(w04, Boolean.valueOf(zArr[0]))));
        }
        this.Q1 = this.S1 * f10;
        long j3 = this.e1;
        if (j3 == 0) {
            j3 = this.f1;
        }
        org.telegram.ui.ActionBar.h6 h6Var4 = this.A0;
        int[][] iArr4 = org.telegram.ui.Components.b9.L;
        int w08 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.p8[org.telegram.ui.Components.b9.e(j3)], h6Var4);
        long j10 = this.e1;
        if (j10 == 0) {
            j10 = this.f1;
        }
        int d = org.telegram.ui.Components.b9.d(j10);
        if (w08 != d) {
            this.q0.h(i0.a.f(f10, d, w08));
            this.f0.invalidate();
        }
        int i10 = this.d5;
        if (i10 != 0) {
            setNavigationBarColor(i0.a.f(f10, i10, getNavigationBarColor()));
        }
        this.d1.invalidate();
        B4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        fw0 fw0Var = this.j6;
        if (fw0Var != null) {
            fw0Var.invalidate();
        }
        if (a() > 0) {
            zu0 zu0Var = this.f0;
            if (zu0Var != null) {
                zu0Var.setProgressToStoriesInsets(this.T1);
            }
            cv0 cv0Var = this.v0;
            if (cv0Var != null) {
                cv0Var.setProgressToStoriesInsets(this.T1);
            }
            di.t0 t0Var = this.w0;
            if (t0Var != null) {
                t0Var.setProgressToStoriesInsets(this.T1);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void setParentLayout(org.telegram.ui.ActionBar.r4 r4Var) {
        super.setParentLayout(r4Var);
        org.telegram.messenger.n6 n6Var = this.Y1;
        if (n6Var != null) {
            n6Var.e();
            this.Y1 = null;
        }
        if (r4Var == null || r4Var.getParentActivity() == null) {
            return;
        }
        this.Y1 = new org.telegram.messenger.n6(r4Var.getParentActivity().getWindow(), new tt0(this, 8));
    }

    @Override // org.telegram.ui.Components.xr0
    public final boolean t() {
        return this.i6;
    }

    public final org.telegram.ui.Components.mr t4() {
        if (this.J == null) {
            this.y = org.telegram.ui.ActionBar.m6.Q1.getConstantState().newDrawable().mutate();
            this.I = org.telegram.ui.ActionBar.m6.R1.getConstantState().newDrawable().mutate();
            org.telegram.messenger.cp cpVar = this.n6;
            if (cpVar != null) {
                int b10 = org.telegram.ui.ActionBar.m6.b(0.1f, org.telegram.ui.ActionBar.m6.I.q() ? -0.1f : -0.08f, cpVar.o(org.telegram.ui.ActionBar.m6.I.q()) ? this.n6.k() : this.n6.i());
                Drawable drawable = this.y;
                int S0 = org.telegram.messenger.g0.S0(this.W5, 1.0f, b10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fj, this.A0));
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(S0, mode);
                this.I.setColorFilter(org.telegram.messenger.g0.S0(this.W5, 1.0f, -1, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.A0)), mode);
            }
            this.J = new org.telegram.ui.Components.mr(new org.telegram.ui.Components.oq(this.y, this.I), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return this.J;
    }

    public final void t5() {
        hi.l3 l3Var = this.H6;
        if (l3Var == null) {
            return;
        }
        l3Var.p(0.0f, (this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX() + (-l3Var.getPaddingLeft()));
        float U1 = org.telegram.messenger.g0.U1(this.m2, this.n2);
        this.H6.setTranslationY(((this.f.getY() + (-r2.getPaddingBottom())) - org.telegram.messenger.g0.L(24.0f)) + org.telegram.messenger.g0.W1(U1, org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(12.0f)));
        this.H6.j(i0.a.f(U1, this.I6, 1342177280));
        boolean z10 = this.Q1 >= ((float) org.telegram.messenger.g0.L(82.0f));
        Boolean bool = this.J6;
        if (bool == null || bool.booleanValue() != z10) {
            ViewPropertyAnimator animate = this.H6.animate();
            this.J6 = Boolean.valueOf(z10);
            org.telegram.messenger.o10.o(animate.alpha(z10 ? 1.0f : 0.0f), org.telegram.ui.Components.nr.g, 200L);
        }
    }

    public final boolean u4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i7 = 0;
        if (!this.s2 || (userFull = this.w2) == null || (botInfo = userFull.bot_info) == null) {
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

    public final void u5() {
        if (getParentActivity() == null || this.V0 == null) {
            return;
        }
        if (getUserConfig().q()) {
            this.V0.setIcon(R.drawable.menu_profile_colors);
            return;
        }
        Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.A0), PorterDuff.Mode.SRC_IN));
        this.W6 = drawable;
        Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
        drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.V0.setIcon(new fi.c2(drawable, drawable2, org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f)));
    }

    @Override // org.telegram.ui.le0
    public final void v() {
        this.a.y0(0);
    }

    public final void v4() {
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        this.o2 = point.x > point.y;
    }

    public final void v5() {
        w5(this.m6);
    }

    public final boolean w4() {
        if (this.F2 != null) {
            return getMessagesController().r2(this.F2);
        }
        org.telegram.messenger.np messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.w2;
        messagesController.getClass();
        return org.telegram.messenger.np.Q2(userFull);
    }

    public final void w5(float f10) {
        int S0;
        org.telegram.messenger.cp cpVar = this.n6;
        if (cpVar != null) {
            S0 = i0.a.f(0.25f, cpVar.m(org.telegram.ui.ActionBar.m6.I.q()), -1);
        } else {
            S0 = org.telegram.messenger.g0.S0(this.W5, 1.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.qi, this.A0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fj, this.A0));
        }
        int f11 = i0.a.f(f10, S0, -1);
        int i7 = org.telegram.ui.ActionBar.m6.Fj;
        int f12 = i0.a.f(Math.max(this.W5, this.G5), f11, org.telegram.ui.ActionBar.m6.w0(i7, this.A0));
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.k(Integer.valueOf(f12));
        }
        org.telegram.ui.Components.n5 n5Var2 = this.H;
        if (n5Var2 != null) {
            n5Var2.k(Integer.valueOf(i0.a.f(this.W5, i0.a.f(f10, S0, -1711276033), org.telegram.ui.ActionBar.m6.w0(i7, this.A0))));
        }
        this.e0.setColor(f12);
        this.m6 = f10;
    }

    @Override // org.telegram.ui.Components.w30
    public final /* synthetic */ boolean x() {
        return false;
    }

    public final boolean x4(org.telegram.ui.Components.co coVar) {
        if ((this.m5 instanceof bn) || !(coVar.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.m5)) {
            return false;
        }
        return !TextUtils.equals(((org.telegram.ui.ActionBar.m5) coVar.getSubtitleTextView()).getText() != null ? r3.toString() : null, this.r.getText() != null ? this.r.getText().toString() : null);
    }

    public final void x5() {
        this.e0.setScaleX(this.f.getScaleX());
        this.e0.setScaleY(this.f.getScaleY());
        this.e0.b((this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX(), (this.f.getHeight() - (this.f.getScaleY() * (this.f.getHeight() - this.f.getRightDrawableY()))) + this.f.getY());
    }

    @Override // org.telegram.ui.ww
    public final boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        long j3 = ((org.telegram.messenger.tr) arrayList.get(0)).a;
        Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
        if (org.telegram.messenger.n5.C(j3)) {
            k10.putInt("enc_id", (int) (4294967295L & j3));
        } else if (org.telegram.messenger.n5.E(j3)) {
            k10.putLong("user_id", j3);
        } else if (org.telegram.messenger.n5.z(j3)) {
            k10.putLong("chat_id", -j3);
        }
        if (!getMessagesController().E(k10, cxVar, null, null)) {
            return false;
        }
        org.telegram.messenger.ls notificationCenter = getNotificationCenter();
        int i11 = org.telegram.messenger.ls.t;
        notificationCenter.n(this, i11);
        getNotificationCenter().k(i11, new Object[0]);
        presentFragment(new bn(k10), true);
        removeSelfFromStack();
        getSendMessagesHelper().r0(org.telegram.messenger.yy.g(getMessagesController().c2(Long.valueOf(this.e1)), j3, null, null, null, null, z11, i7, i10));
        if (!TextUtils.isEmpty(charSequence)) {
            org.telegram.messenger.az.a0(org.telegram.messenger.c.a(this.currentAccount), charSequence, j3, 0L, z11, i7, i10);
        }
        return true;
    }

    public final boolean y4() {
        return (this.r0 == null || this.s1) ? false : true;
    }

    public final void y5() {
        if (this.q1 || !org.telegram.messenger.v3.c0(this.F2)) {
            return;
        }
        org.telegram.messenger.ys notificationsController = getNotificationsController();
        notificationsController.getMessagesStorage().a.c(new org.telegram.messenger.d4(notificationsController, -this.f1, new nu0(this), 6));
    }

    public final void z4(boolean z10) {
        boolean c02 = org.telegram.messenger.v3.c0(this.F2);
        TLRPC.Chat chat = this.F2;
        org.telegram.ui.Components.c5.r(this, false, chat, null, false, c02 || z10 || (chat != null && chat.creator), z10, !c02, new tt0(this, 3));
    }

    public final void z5(float f10) {
        mw0 mw0Var;
        ValueAnimator valueAnimator;
        if (this.q2 || ((mw0Var = this.N) != null && (valueAnimator = mw0Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f10);
            this.N.requestLayout();
        }
        zw0 zw0Var = this.d1;
        if (zw0Var != null) {
            zw0Var.F.setTranslate(0.0f, this.b2 - zw0Var.y);
            zw0 zw0Var2 = this.d1;
            RadialGradient radialGradient = zw0Var2.E;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(zw0Var2.F);
            }
            this.d1.invalidate();
        }
        x5();
        q5();
        I5();
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.bt0 bt0Var) {
        super(bundle);
        this.h = null;
        this.n = null;
        this.x0 = null;
        int i7 = 2;
        this.y0 = new org.telegram.ui.Components.h40(this, i7);
        this.z0 = new Paint(1);
        this.K0 = new boolean[1];
        this.b1 = 1.0f;
        this.C1 = new a0.h();
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
        this.W4 = 0;
        this.X4 = true;
        this.Y4 = true;
        this.c5 = 0;
        this.d5 = 0;
        this.e5 = 0;
        this.f5 = 0L;
        this.n5 = new HashSet();
        this.p5 = new fv0(this, 0);
        this.q5 = new lv0(this);
        this.N5 = new pu0(this);
        this.R5 = 1.0f;
        this.S5 = new te.a(0, new tt0(this, 7), org.telegram.ui.Components.nr.h, 380L, true);
        this.Y5 = new fv0(this, 1);
        this.e6 = new dv0(this, i7);
        this.f6 = null;
        this.l6 = new RectF();
        this.o6 = new SparseIntArray();
        this.q6 = null;
        this.r6 = -1;
        this.w6 = new int[3];
        this.x6 = -1.0f;
        ui.b bVar = new ui.b();
        this.Q6 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.R6 = cVar;
        this.T6 = new Paint();
        this.Y6 = new int[7];
        this.R = bt0Var;
        cVar.g = new xe.b();
    }

    @Override // org.telegram.ui.Components.w30
    public final /* synthetic */ void U() {
    }
}
