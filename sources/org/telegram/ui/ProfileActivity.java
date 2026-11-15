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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class ProfileActivity extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, sw, org.telegram.ui.Components.rs0, org.telegram.ui.Components.l30, org.telegram.ui.Components.nr0, ie0 {
    public static final RectF X6 = new RectF();
    public static final int Y6 = org.telegram.messenger.g0.L(16.0f);
    public org.telegram.ui.ActionBar.e6 A0;
    public boolean A1;
    public CharSequence A2;
    public int A3;
    public int A4;
    public hi.d[] A5;
    public float A6;
    public int B0;
    public boolean B1;
    public long B2;
    public int B3;
    public int B4;
    public ai.l2 B5;
    public float B6;
    public org.telegram.messenger.gc C0;
    public a0.h C1;
    public int C2;
    public int C3;
    public int C4;
    public FrameLayout C5;
    public float C6;
    public int D0;
    public boolean D1;
    public ArrayList D2;
    public int D3;
    public int D4;
    public hi.d D5;
    public tw0 D6;
    public Drawable E;
    public int E0;
    public long E1;
    public TLRPC.EncryptedChat E2;
    public int E3;
    public int E4;
    public float E5;
    public zw0 E6;
    public Long F;
    public int F0;
    public float F1;
    public TLRPC.Chat F2;
    public int F3;
    public int F4;
    public View F5;
    public hi.l3 F6;
    public org.telegram.ui.Components.e5 G;
    public boolean G0;
    public boolean G1;
    public TL_bots.BotInfo G2;
    public int G3;
    public int G4;
    public int G5;
    public int G6;
    public org.telegram.ui.Components.e5 H;
    public boolean H0;
    public boolean H1;
    public TLRPC.ChannelParticipant H2;
    public int H3;
    public int H4;
    public int H5;
    public Boolean H6;
    public Drawable I;
    public boolean I0;
    public boolean I1;
    public TL_account.TL_password I2;
    public int I3;
    public int I4;
    public int I5;
    public TLRPC.TL_emojiStatusCollectible I6;
    public org.telegram.ui.Components.dr J;
    public boolean J0;
    public int J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public boolean J4;
    public int J5;
    public int J6;
    public org.telegram.ui.Components.dr K;
    public final boolean[] K0;
    public boolean K1;
    public TLRPC.FileLocation K2;
    public int K3;
    public boolean K4;
    public gh.e K5;
    public boolean K6;
    public org.telegram.ui.Components.lk0 L;
    public boolean L0;
    public boolean L1;
    public org.telegram.messenger.gc L2;
    public int L3;
    public int L4;
    public final nu0 L5;
    public int L6;
    public UndoView M;
    public boolean M0;
    public boolean M1;
    public final Rect M2;
    public int M3;
    public int M4;
    public org.telegram.ui.Components.lf0 M5;
    public int M6;
    public jw0 N;
    public boolean N0;
    public boolean N1;
    public org.telegram.ui.Cells.l8 N2;
    public int N3;
    public int N4;
    public float N5;
    public int N6;
    public uv0 O;
    public boolean O0;
    public boolean O1;
    public int O2;
    public int O3;
    public int O4;
    public int O5;
    public final ui.b O6;
    public org.telegram.ui.Components.cv0 P;
    public ImageView P0;
    public boolean P1;
    public int P2;
    public int P3;
    public boolean P4;
    public float P5;
    public final dh.c P6;
    public boolean Q;
    public org.telegram.ui.ActionBar.d5 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public boolean Q4;
    public final te.a Q5;
    public di.f Q6;
    public org.telegram.ui.Components.qs0 R;
    public org.telegram.ui.ActionBar.d5 R0;
    public float R1;
    public int R2;
    public int R3;
    public int R4;
    public fv0 R5;
    public final Paint R6;
    public boolean S;
    public org.telegram.ui.ActionBar.d5 S0;
    public float S1;
    public int S2;
    public int S3;
    public final ArrayList S4;
    public AnimatorSet S5;
    public Drawable S6;
    public org.telegram.ui.Components.mu0 T;
    public org.telegram.ui.ActionBar.d5 T0;
    public float T1;
    public int T2;
    public int T3;
    public final ArrayList T4;
    public AnimatorSet T5;
    public Drawable T6;
    public rv U;
    public org.telegram.ui.ActionBar.d5 U0;
    public int U1;
    public int U2;
    public int U3;
    public int U4;
    public float U5;
    public Drawable U6;
    public org.telegram.ui.Components.ch0 V;
    public org.telegram.ui.ActionBar.z0 V0;
    public float V1;
    public int V2;
    public int V3;
    public boolean V4;
    public boolean V5;
    public org.telegram.ui.Components.eq V6;
    public org.telegram.ui.Components.ch0 W;
    public org.telegram.ui.ActionBar.z0 W0;
    public ValueAnimator W1;
    public int W2;
    public int W3;
    public boolean W4;
    public final dv0 W5;
    public final int[] W6;
    public hi.l3 X;
    public org.telegram.ui.ActionBar.z0 X0;
    public boolean X1;
    public int X2;
    public int X3;
    public cv0 X4;
    public View X5;
    public k0 Y;
    public ImageView Y0;
    public org.telegram.messenger.n6 Y1;
    public int Y2;
    public int Y3;
    public View Y4;
    public int Y5;
    public ai.k0 Z;
    public org.telegram.ui.ActionBar.z0 Z0;
    public final HashMap Z1;
    public int Z2;
    public int Z3;
    public float Z4;
    public int Z5;
    public ou0 a;
    public org.telegram.ui.Components.hf0 a0;
    public org.telegram.messenger.qe a1;
    public float a2;
    public int a3;
    public int a4;
    public int a5;
    public CharSequence a6;
    public org.telegram.ui.Components.uj0 b;
    public org.telegram.messenger.hp b0;
    public float b1;
    public float b2;
    public int b3;
    public int b4;
    public int b5;
    public boolean b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public ru0 c;
    public org.telegram.ui.Components.cg0 c0;
    public int c1;
    public float c2;
    public int c3;
    public int c4;
    public int c5;
    public final bv0 c6;
    public iw0 d;
    public org.telegram.ui.Components.if0 d0;
    public vw0 d1;
    public float d2;
    public int d3;
    public int d4;
    public long d5;
    public float[] d6;
    public sw0 e;
    public org.telegram.ui.Cells.o e0;
    public long e1;
    public float e2;
    public int e3;
    public int e4;
    public boolean e5;
    public float e6;
    public ok f;
    public xu0 f0;
    public long f1;
    public float f2;
    public int f3;
    public int f4;
    public boolean f5;
    public float f6;
    public AnimatorSet g0;
    public long g1;
    public float g2;
    public int g3;
    public int g4;
    public String g5;
    public boolean g6;
    public String h;
    public org.telegram.ui.Cells.b4 h0;
    public boolean h1;
    public float h2;
    public int h3;
    public int h4;
    public String h5;
    public dw0 h6;
    public ImageView i0;
    public long i1;
    public float i2;
    public int i3;
    public int i4;
    public String i5;
    public float i6;
    public ImageView j0;
    public boolean j1;
    public float j2;
    public int j3;
    public int j4;
    public yw j5;
    public final RectF j6;
    public ImageView k0;
    public boolean k1;
    public ValueAnimator k2;
    public int k3;
    public int k4;
    public org.telegram.ui.Components.qg k5;
    public float k6;
    public ImageView l0;
    public boolean l1;
    public float l2;
    public int l3;
    public int l4;
    public final HashSet l5;
    public org.telegram.messenger.cp l6;
    public org.telegram.ui.Components.c01 m0;
    public long m1;
    public float m2;
    public int m3;
    public int m4;
    public CharacterStyle m5;
    public final SparseIntArray m6;
    public String n;
    public org.telegram.ui.Components.nf0 n0;
    public boolean n1;
    public final float[] n2;
    public int n3;
    public int n4;
    public final dv0 n5;
    public int n6;
    public yu0 o0;
    public boolean o1;
    public boolean o2;
    public int o3;
    public int o4;
    public final jv0 o5;
    public AnimatorSet o6;
    public lw0 p0;
    public boolean p1;
    public boolean p2;
    public int p3;
    public int p4;
    public boolean p5;
    public int p6;
    public org.telegram.ui.Components.t8 q0;
    public boolean q1;
    public boolean q2;
    public int q3;
    public int q4;
    public sv0 q5;
    public int q6;
    public zu0 r;
    public org.telegram.ui.Components.m30 r0;
    public boolean r1;
    public final Paint r2;
    public int r3;
    public int r4;
    public float r5;
    public boolean r6;
    public org.telegram.ui.Components.fh0 s;
    public int s0;
    public boolean s1;
    public boolean s2;
    public int s3;
    public int s4;
    public float s5;
    public boolean s6;
    public org.telegram.ui.Components.c01 t0;
    public boolean t1;
    public ki.s0 t2;
    public int t3;
    public int t4;
    public boolean t5;
    public org.telegram.ui.Components.fh0 t6;
    public org.telegram.ui.Components.zf0 u0;
    public int u1;
    public ki.r u2;
    public int u3;
    public int u4;
    public boolean u5;
    public final int[] u6;
    public av0 v0;
    public boolean v1;
    public TLRPC.ChatFull v2;
    public int v3;
    public int v4;
    public ImageReceiver v5;
    public float v6;
    public AnimatorSet w;
    public di.u0 w0;
    public boolean w1;
    public TLRPC.UserFull w2;
    public int w3;
    public int w4;
    public FrameLayout w5;
    public CharSequence w6;
    public Drawable x;
    public View x0;
    public boolean x1;
    public org.telegram.ui.Cells.d6 x2;
    public int x3;
    public int x4;
    public FrameLayout[] x5;
    public CharSequence x6;
    public Drawable y;
    public final org.telegram.ui.Components.w30 y0;
    public int y1;
    public boolean y2;
    public int y3;
    public int y4;
    public SpannableStringBuilder y5;
    public boolean y6;
    public final Paint z0;
    public boolean z1;
    public ww0 z2;
    public int z3;
    public int z4;
    public SpannableStringBuilder z5;
    public float z6;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static ProfileActivity C4(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void F3(ProfileActivity profileActivity, boolean z10) {
        Drawable t6 = profileActivity.f0.getImageReceiver().t();
        String str = null;
        if (t6 instanceof org.telegram.ui.Components.g51) {
            profileActivity.f0.w(null, null, t6);
            return;
        }
        if (t6 instanceof org.telegram.ui.Components.t5) {
            org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) t6;
            profileActivity.f0.w(null, null, t5Var);
            if (z10) {
                t5Var.f(profileActivity.f0);
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

    public static void M3(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view == null || view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return;
        }
        RectF rectF2 = X6;
        if (jh.k.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
            ih.d.b(new oa(view, 3), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
        }
    }

    public static void O0(ProfileActivity profileActivity, int i7) {
        boolean J0 = org.telegram.ui.Components.ys0.J0(profileActivity.O.getClosestTab());
        if (i7 == profileActivity.J6 && J0 == profileActivity.K6) {
            return;
        }
        profileActivity.J6 = i7;
        profileActivity.K6 = J0;
        if (J0) {
            if (i7 > 0) {
                profileActivity.A5[0].i(org.telegram.messenger.hd.G(i7, "HideStoriesFromAlbum", new Object[0]), true, true);
                return;
            } else {
                profileActivity.A5[0].i(profileActivity.z5, true, true);
                return;
            }
        }
        if (i7 > 0 || !org.telegram.messenger.np.s1(profileActivity.currentAccount).X4()) {
            profileActivity.A5[0].i(org.telegram.messenger.hd.G(i7, "ArchiveStories", new Object[0]), true, true);
        } else {
            profileActivity.A5[0].i(profileActivity.y5, true, true);
        }
    }

    public static ValueAnimator P0(final ProfileActivity profileActivity, final boolean z10) {
        if (z10) {
            org.telegram.messenger.g0.a3(profileActivity.getParentActivity(), profileActivity.classGuid);
            org.telegram.messenger.g0.l3(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.W1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.W1.cancel();
        }
        di.u0 u0Var = profileActivity.w0;
        if (u0Var != null) {
            u0Var.setActive(!z10);
        }
        int i7 = 0;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(profileActivity.V1, z10 ? 0.0f : 1.0f);
        final float f10 = profileActivity.Q1;
        profileActivity.b.setTranslationY(f10);
        profileActivity.b.setVisibility(0);
        profileActivity.U0.setVisibility(0);
        profileActivity.a.setVisibility(0);
        profileActivity.A4(true);
        profileActivity.Y.setVisibility(0);
        profileActivity.f.setVisibility(0);
        profileActivity.r.setVisibility(0);
        profileActivity.actionBar.A(profileActivity.V1 > 0.5f);
        int i10 = profileActivity.V1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.d5 d5Var = profileActivity.T0;
        if (d5Var != null) {
            d5Var.setVisibility(i10);
        }
        profileActivity.U0.setVisibility(i10);
        profileActivity.U0.getSearchContainer().setVisibility(profileActivity.V1 <= 0.5f ? 0 : 8);
        profileActivity.b.setEmptyView(profileActivity.P);
        profileActivity.Y.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.lu0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.b0(ProfileActivity.this, ofFloat, f10, z10);
            }
        });
        ofFloat.addListener(new lv0(profileActivity, z10, i7));
        if (!z10) {
            profileActivity.W4 = true;
            profileActivity.V4();
            org.telegram.messenger.g0.Z2(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.er.f);
        profileActivity.W1 = ofFloat;
        return ofFloat;
    }

    public static void R0(ProfileActivity profileActivity, View view, float f10) {
        if (profileActivity.p2) {
            if (profileActivity.q2) {
                profileActivity.a.w0(0, ((view.getTop() - profileActivity.a.getMeasuredWidth()) - profileActivity.d4()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (profileActivity.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0), org.telegram.ui.Components.er.h);
                return;
            } else {
                profileActivity.a.w0(0, view.getTop() - profileActivity.i4(), org.telegram.ui.Components.er.h);
                return;
            }
        }
        boolean z10 = profileActivity.d4() > 0;
        if (z10) {
            float f11 = profileActivity.Q1;
            if (f11 > 0.0f && ((f11 < profileActivity.i4() * 0.6f || f10 < -1000.0f) && profileActivity.Q1 > profileActivity.d4() * 0.6f)) {
                profileActivity.a.w0(0, (int) (profileActivity.Q1 - profileActivity.d4()), org.telegram.ui.Components.er.h);
                return;
            }
        }
        if (z10) {
            float f12 = profileActivity.Q1;
            if (f12 > 0.0f && f12 < profileActivity.d4() * 0.6f) {
                profileActivity.a.w0(0, (int) profileActivity.Q1, org.telegram.ui.Components.er.h);
                return;
            }
        }
        if (!z10) {
            float f13 = profileActivity.Q1;
            if (f13 > 0.0f && f10 < -1000.0f) {
                profileActivity.a.w0(0, (int) f13, org.telegram.ui.Components.er.h);
                return;
            }
        }
        if (profileActivity.Q1 > 0.0f) {
            profileActivity.a.w0(0, view.getTop() - profileActivity.i4(), org.telegram.ui.Components.er.h);
        }
    }

    public static SpannableStringBuilder V3(String str, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        mv0 mv0Var = new mv0(9);
        mv0Var.w = str;
        if (mv0Var.c != null) {
            mv0Var.c = null;
            mv0Var.a();
        }
        mv0Var.f = w02;
        mv0Var.n = false;
        spannableStringBuilder.setSpan(mv0Var, 0, spannableStringBuilder.length(), 0);
        fz[] fzVarArr = (fz[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), fz.class);
        if (fzVarArr != null) {
            for (fz fzVar : fzVarArr) {
                fzVar.getClass();
                fzVar.f = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
                fzVar.r = i7;
                fzVar.s = e6Var;
                fzVar.n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static void X4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, activity, null);
        t1Var.j0 = false;
        t1Var.show();
        Utilities.e.c(new f60(t1Var, z10, activity));
    }

    public static void Z(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.gy0.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.A0);
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document e10;
        org.telegram.ui.Components.xb h;
        if (profileActivity.K2 != null) {
            return;
        }
        if (!profileActivity.q1 || profileActivity.getMessagesController().D3()) {
            if (profileActivity.Z3()) {
                return;
            }
            profileActivity.M4(false);
            return;
        }
        ArrayList l10 = profileActivity.getMessagesController().r7.l(profileActivity.f1);
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
                if (j3 == 0 || (e10 = org.telegram.ui.Components.g5.e(profileActivity.currentAccount, j3)) == null || (h = org.telegram.ui.Components.cc.a0(profileActivity).h(e10, 1, new du0(profileActivity, 2))) == null) {
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

    public static void a5(FrameLayout frameLayout, float f10) {
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(Y6 * f10);
        frameLayout.setAlpha(1.0f - f10);
        frameLayout.setVisibility(f10 < 1.0f ? 0 : 4);
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
        profileActivity.A4(true);
        profileActivity.a.setAlpha(f11);
        profileActivity.b.setAlpha(1.0f - profileActivity.V1);
        profileActivity.b.setScaleX((profileActivity.V1 * 0.05f) + 1.0f);
        profileActivity.b.setScaleY((profileActivity.V1 * 0.05f) + 1.0f);
        profileActivity.P.setAlpha(1.0f - f11);
        profileActivity.Y.setAlpha(f11);
        profileActivity.f0.setAlpha(f11);
        av0 av0Var = profileActivity.v0;
        if (av0Var != null) {
            av0Var.setAlpha(f11);
        }
        profileActivity.f.setAlpha(f11);
        profileActivity.r.setAlpha(profileActivity.V5 ? 0.0f : f11);
        profileActivity.U0.getSearchField().setAlpha(f12);
        if (z10 && profileActivity.V1 < 0.7f) {
            org.telegram.ui.ActionBar.d5 d5Var = profileActivity.U0;
            if (d5Var.G.getWidth() != 0 && !d5Var.e.isFocused()) {
                d5Var.e.requestFocus();
                org.telegram.messenger.g0.J3(d5Var.e);
            }
        }
        profileActivity.U0.getSearchContainer().setVisibility(profileActivity.V1 < 0.5f ? 0 : 8);
        int i7 = profileActivity.V1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.d5 d5Var2 = profileActivity.T0;
        if (d5Var2 != null) {
            d5Var2.setVisibility(i7);
            profileActivity.T0.setAlpha(f11);
        }
        profileActivity.U0.setVisibility(i7);
        profileActivity.actionBar.A(profileActivity.V1 < 0.5f);
        org.telegram.ui.ActionBar.d5 d5Var3 = profileActivity.T0;
        if (d5Var3 != null) {
            d5Var3.setAlpha(f11);
        }
        profileActivity.U0.setAlpha(f11);
        profileActivity.d1.invalidate();
        profileActivity.fragmentView.invalidate();
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
        sw0 sw0Var = profileActivity.e;
        if (!sw0Var.x) {
            if (!sw0Var.w.isEmpty()) {
                i7--;
            }
            if (i7 < 0 || i7 >= profileActivity.e.w.size()) {
                int f10 = i5.c.f(1, i7, profileActivity.e.w);
                if (f10 >= 0 && f10 < profileActivity.e.d.size()) {
                    valueOf = profileActivity.e.d.get(f10);
                    z10 = false;
                    if (!(valueOf instanceof rw0)) {
                        rw0 rw0Var = (rw0) valueOf;
                        org.telegram.ui.ActionBar.o4 parentLayout = profileActivity.getParentLayout();
                        rw0Var.b.run();
                        org.telegram.messenger.g0.k3(parentLayout, rw0Var.c);
                    } else if (valueOf instanceof org.telegram.messenger.zo) {
                        org.telegram.messenger.ns.f(profileActivity.currentAccount).k(org.telegram.messenger.ns.c1, profileActivity.e.F, ((org.telegram.messenger.zo) valueOf).c);
                    }
                    if (z10 || valueOf == null) {
                    }
                    profileActivity.e.E(valueOf);
                    return;
                }
            } else {
                valueOf = profileActivity.e.w.get(i7);
            }
        } else if (i7 < sw0Var.r.size()) {
            valueOf = profileActivity.e.r.get(i7);
        } else {
            int f11 = i5.c.f(1, i7, profileActivity.e.r);
            if (f11 >= 0 && f11 < profileActivity.e.s.size()) {
                valueOf = profileActivity.e.s.get(f11);
            }
        }
        z10 = true;
        if (!(valueOf instanceof rw0)) {
        }
        if (z10) {
        }
    }

    public static boolean d0(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_error tL_error) {
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.np.s1(profileActivity.currentAccount).e7.edit().putLong("dialog_join_requested_time_" + profileActivity.i1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        boolean z11 = org.telegram.messenger.t3.T(profileActivity.F2) && !profileActivity.F2.megagroup;
        int i7 = org.telegram.ui.Components.e70.u1;
        org.telegram.ui.Components.e70.J0(parentActivity, profileActivity, org.telegram.ui.Components.cc.a0(profileActivity), z11);
        if (!z10 || profileActivity.N4 != -1) {
            profileActivity.M5();
            iw0 iw0Var = profileActivity.d;
            if (iw0Var != null) {
                iw0Var.f();
            }
        }
        if (e2Var instanceof an) {
            ((an) e2Var).cc(false, true);
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
        av0 av0Var = profileActivity.v0;
        if (av0Var != null && profileActivity.J1 != 2) {
            float f10 = profileActivity.d2;
            av0Var.setAlpha(f10 > 0.0f ? org.telegram.messenger.g0.T1(1.0f, 0.0f, org.telegram.messenger.g0.z1(f10, 0.0f, 0.5f)) : 1.0f);
        }
        profileActivity.A5();
    }

    public static void e0(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.j5 j5Var) {
        org.telegram.messenger.gc b10;
        String str;
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            vf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().V2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        ug.g1 g1Var = new ug.g1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.A0);
        j5Var.getLocationOnScreen(new int[2]);
        g1Var.r2 = j5Var.i0;
        g1Var.s2 = j5Var.j0;
        g1Var.v2 = j5Var.getScaleX();
        g1Var.t2 = j5Var.getLeft();
        g1Var.u2 = j5Var.getTop();
        g1Var.w2 = j5Var;
        Drawable rightDrawable = j5Var.getRightDrawable();
        org.telegram.ui.Components.e5 e5Var = profileActivity.G;
        if (rightDrawable == e5Var && e5Var != null) {
            Drawable drawable = e5Var.f[0];
            if (drawable instanceof org.telegram.ui.Components.g5) {
                g1Var.v2 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.g5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(profileActivity.getParentActivity());
                    org.telegram.messenger.pz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.j6.m6, 0.2f, false);
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
                    i9Var.setLayerNum(7);
                    i9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                    i9Var.m(gcVar, str2, org.telegram.messenger.gc.c(w10, document), "140_140", d, document);
                    if (((org.telegram.ui.Components.g5) profileActivity.G.f[0]).c()) {
                        i9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.v6, profileActivity.A0), PorterDuff.Mode.SRC_IN));
                        g1Var.y2 = org.telegram.messenger.gj.i1(document);
                    } else {
                        g1Var.y2 = org.telegram.messenger.gj.i1(document);
                    }
                    g1Var.x2 = i9Var;
                    g1Var.A2 = true;
                }
            }
        }
        profileActivity.showDialog(g1Var);
    }

    public static void e5(int i7, View view) {
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

    public static /* synthetic */ void f0(ProfileActivity profileActivity) {
        org.telegram.messenger.np.s1(profileActivity.currentAccount).l0(null);
        profileActivity.V.M(0);
        profileActivity.W.M(0);
    }

    public static void f5(org.telegram.ui.ActionBar.d5 d5Var, boolean z10, boolean z11) {
        if (com.google.android.gms.internal.vision.e2.s(d5Var)) {
            d5Var.Z(z10, z11);
        } else if (d5Var != null) {
            d5Var.setVisibility(z10 ? 0 : 8);
        }
    }

    public static /* synthetic */ void g0(ProfileActivity profileActivity, Context context, long j3, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            ki.n3.J0(context, profileActivity.currentAccount, profileActivity.w2.starref_program, profileActivity.getUserConfig().e(), profileActivity.A0, false);
        } else {
            ki.n3.K0(context, profileActivity.currentAccount, connectedbotstarref, j3, profileActivity.A0);
        }
    }

    public static void h0(ProfileActivity profileActivity, Context context, long j3, View view, int i7, float f10, float f11) {
        TLRPC.User a22;
        iw0 iw0Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.a.C0();
        if (i7 == profileActivity.T3) {
            TLRPC.User a23 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.e1));
            TLRPC.UserFull userFull = profileActivity.w2;
            if (userFull != null && userFull.starref_program != null) {
                long e10 = profileActivity.getUserConfig().e();
                di.e0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), e10, profileActivity.e1, new di.o1(profileActivity, context, e10, 3));
                return;
            } else {
                if (a23 == null || !a23.bot_can_edit) {
                    return;
                }
                profileActivity.presentFragment(new ki.k(profileActivity.e1));
                return;
            }
        }
        int i10 = 1;
        if (i7 == profileActivity.R3) {
            boolean z10 = !profileActivity.getMessagesController().r2(j3, profileActivity.g1, null);
            profileActivity.getNotificationsController().G(j3, profileActivity.g1, z10);
            org.telegram.ui.Components.cc.A(profileActivity, z10, null).j();
            profileActivity.x5();
            int i11 = profileActivity.R3;
            if (i11 < 0 || (iw0Var = profileActivity.d) == null) {
                return;
            }
            iw0Var.g(i11);
            return;
        }
        if (i7 == profileActivity.a4) {
            TLRPC.User a24 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.e1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", a24.id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.g5);
            bundle.putString("first_name_card", profileActivity.h5);
            bundle.putString("last_name_card", profileActivity.i5);
            pr prVar = new pr(bundle, profileActivity.A0);
            prVar.P = new ut0(profileActivity, a24);
            profileActivity.presentFragment(prVar);
            return;
        }
        if (i7 == profileActivity.X3) {
            TextView textView = (TextView) org.telegram.ui.Components.t4.f0(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131751508, null), org.telegram.messenger.hd.M0(2131751592, null), org.telegram.messenger.hd.M0(2131751591, null), org.telegram.messenger.hd.M0(2131751598, null), new du0(profileActivity, i10), profileActivity.A0, false).d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
                return;
            }
            return;
        }
        int i12 = 9;
        int i13 = 2;
        if (i7 == profileActivity.Y3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
            String M0 = org.telegram.messenger.hd.M0(2131746211, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131746232, null);
            TLRPC.Chat M02 = profileActivity.getMessagesController().M0(Long.valueOf(-profileActivity.d5));
            org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
            if (M02 != null && org.telegram.messenger.t3.w(2, M02)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, profileActivity.getParentActivity(), profileActivity.A0);
                c2VarArr[0] = c2Var;
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                c2VarArr[0].e(org.telegram.messenger.hd.M0(2131753727, null), "", true, false, false);
                c2VarArr[0].setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                linearLayout.addView(c2VarArr[0], c8.ja.o(-1, -2));
                c2VarArr[0].setOnClickListener(new z00(c2VarArr, i13));
                alertDialog$Builder.o(linearLayout);
            }
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746230, null), new xi0(14, profileActivity, c2VarArr));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new t70(i12));
            TextView textView2 = (TextView) alertDialog$Builder.p().d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.q7, null);
                return;
            }
            return;
        }
        if (i7 == profileActivity.s4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", (int) (profileActivity.i1 & 4294967295L));
            profileActivity.presentFragment(new o50(bundle2));
            return;
        }
        if (i7 == profileActivity.r4) {
            profileActivity.showDialog(org.telegram.ui.Components.t4.S(profileActivity.getParentActivity(), profileActivity.E2, profileActivity.A0).a);
            return;
        }
        if (i7 == profileActivity.O3) {
            profileActivity.H4(view, f10, f11, false);
            return;
        }
        if (i7 == profileActivity.M4) {
            profileActivity.getMessagesController().g5(null, profileActivity.e1);
            if (org.telegram.ui.Components.cc.a(profileActivity)) {
                org.telegram.ui.Components.cc.d(profileActivity, false).j();
                return;
            }
            return;
        }
        if (i7 == profileActivity.b4) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
                return;
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                return;
            }
        }
        if (i7 == profileActivity.V3) {
            profileActivity.K4();
            return;
        }
        if (i7 == profileActivity.W3) {
            my0.K0(profileActivity.a(), profileActivity);
            return;
        }
        if (i7 >= profileActivity.v4 && i7 < profileActivity.w4) {
            profileActivity.h(!profileActivity.D2.isEmpty() ? profileActivity.v2.participants.participants.get(((Integer) profileActivity.D2.get(i7 - profileActivity.v4)).intValue()) : profileActivity.v2.participants.participants.get(i7 - profileActivity.v4), false, false, view);
            return;
        }
        if (i7 == profileActivity.x4) {
            profileActivity.L4();
            return;
        }
        if (i7 == profileActivity.M3) {
            profileActivity.S4(f10, f11, i7, view);
            return;
        }
        if (i7 == profileActivity.m4) {
            if (profileActivity.F2 != null) {
                profileActivity.showDialog(new li.d0(profileActivity, profileActivity.F2.linked_community_id, null, null));
                return;
            } else {
                if (profileActivity.e1 == 0 || (a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.e1))) == null) {
                    return;
                }
                profileActivity.showDialog(new li.d0(profileActivity, a22.linked_community_id, null, null));
                return;
            }
        }
        if (i7 == profileActivity.J3) {
            if (profileActivity.v2.location instanceof TLRPC.TL_channelLocation) {
                pa0 pa0Var = new pa0(5);
                long j10 = profileActivity.f1;
                TLRPC.TL_channelLocation tL_channelLocation = (TLRPC.TL_channelLocation) profileActivity.v2.location;
                pa0Var.m0 = -j10;
                pa0Var.C0 = tL_channelLocation;
                profileActivity.presentFragment(pa0Var);
                return;
            }
            return;
        }
        if (i7 == profileActivity.N4) {
            profileActivity.G4(false);
            return;
        }
        if (i7 == profileActivity.y4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f1);
            bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            qq qqVar = new qq(bundle3);
            qqVar.C0(profileActivity.v2);
            profileActivity.presentFragment(qqVar);
            return;
        }
        if (i7 == profileActivity.z4) {
            profileActivity.presentFragment(new bi.t6(profileActivity.f1));
            return;
        }
        if (i7 == profileActivity.A4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            qq qqVar2 = new qq(bundle4);
            qqVar2.C0(profileActivity.v2);
            profileActivity.presentFragment(qqVar2);
            return;
        }
        if (i7 == profileActivity.B4) {
            profileActivity.S0.performClick();
            return;
        }
        if (i7 == profileActivity.C4) {
            profileActivity.presentFragment(new di.t(0, profileActivity.e1));
            return;
        }
        if (i7 == profileActivity.D4) {
            profileActivity.presentFragment(new di.t(1, profileActivity.e1));
            return;
        }
        if (i7 == profileActivity.E4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new z41(bundle5));
            return;
        }
        if (i7 == profileActivity.H4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f1);
            bundle6.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            qq qqVar3 = new qq(bundle6);
            qqVar3.C0(profileActivity.v2);
            profileActivity.presentFragment(qqVar3);
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
            profileActivity.presentFragment(new x90());
            return;
        }
        if (i7 == profileActivity.o3) {
            profileActivity.presentFragment(new SessionsActivity(0));
            return;
        }
        if (i7 == profileActivity.r3) {
            profileActivity.showDialog(org.telegram.ui.Components.t4.R(profileActivity, profileActivity.A0));
            return;
        }
        if (i7 == profileActivity.s3) {
            vf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
            return;
        }
        if (i7 == profileActivity.t3) {
            vf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
            return;
        }
        if (i7 == profileActivity.w3) {
            X4(profileActivity.getParentActivity(), false);
            return;
        }
        if (i7 == profileActivity.x3) {
            X4(profileActivity.getParentActivity(), true);
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
            String M03 = org.telegram.messenger.hd.M0(2131754120, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
            t1Var2.U = M03;
            t1Var2.S = org.telegram.messenger.hd.M0(R.string.AppName, null);
            alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747831, null), new qt0(profileActivity, i12));
            alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
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
            profileActivity.K4();
            return;
        }
        if (i7 == profileActivity.d4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
            return;
        }
        if (i7 == profileActivity.e4) {
            profileActivity.presentFragment(new di.lb());
            return;
        }
        if (i7 == profileActivity.f4) {
            profileActivity.presentFragment(new ii.f());
            return;
        }
        if (i7 == profileActivity.g4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
            return;
        }
        if (i7 == profileActivity.h4) {
            wg.c1.l1(0, org.telegram.messenger.v1.a(profileActivity.currentAccount).b());
            return;
        }
        if (i7 == profileActivity.botPermissionLocation) {
            ki.s0 s0Var = profileActivity.t2;
            if (s0Var != null) {
                s0Var.l(!s0Var.g(), new mp0(17, profileActivity, view));
                return;
            }
            return;
        }
        if (i7 == profileActivity.botPermissionBiometry) {
            ki.r rVar = profileActivity.u2;
            if (rVar != null) {
                boolean z11 = !rVar.e;
                rVar.f = true;
                rVar.e = z11;
                rVar.k();
                ((org.telegram.ui.Cells.l8) view).setChecked(profileActivity.u2.e);
                return;
            }
            return;
        }
        if (i7 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            l8Var.setChecked(!l8Var.d());
            if (profileActivity.p4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.p4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().o1(profileActivity.e1);
            boolean d = l8Var.d();
            toggleuseremojistatuspermission.enabled = d;
            TLRPC.UserFull userFull2 = profileActivity.w2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = d;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new b00(24, profileActivity, r1));
            profileActivity.p4 = sendRequest;
            int[] iArr = {sendRequest};
            return;
        }
        if (i7 == profileActivity.P3) {
            profileActivity.P4 = !profileActivity.P4;
            profileActivity.V4();
            view.requestLayout();
            profileActivity.d.g(profileActivity.P3);
            int i14 = profileActivity.p6;
            if (i14 >= 0) {
                profileActivity.c.h1(i14, profileActivity.q6 - profileActivity.a.getPaddingTop());
                return;
            }
            return;
        }
        if (i7 == profileActivity.Q3) {
            profileActivity.P4(false);
            return;
        }
        if (i7 == profileActivity.R2) {
            if (profileActivity.w2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.w2.personal_channel_id);
            profileActivity.presentFragment(new an(bundle7));
            return;
        }
        if (i7 != profileActivity.V2) {
            if (i7 == profileActivity.I3) {
                profileActivity.X3(i7, view);
                return;
            } else {
                profileActivity.S4(f10, f11, i7, view);
                return;
            }
        }
        zw0 zw0Var = profileActivity.E6;
        if ((zw0Var == null || !zw0Var.a()) && !profileActivity.Y3(i7, view)) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (w8Var.d.getDrawable() != null) {
                profileActivity.J4(w8Var.getImageView());
            }
        }
    }

    public static void i0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
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
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.ns.g2, false, null, false);
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
                org.telegram.messenger.fc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.gc.m(profileActivity.currentAccount, 1, a22));
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
            profileActivity.getMessagesController().U0(a22.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a22);
            profileActivity.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull b22 = profileActivity.getMessagesController().b2(profileActivity.e1);
            if (b22 != null) {
                b22.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().j2(b22, false);
            }
        }
        profileActivity.p2 = (org.telegram.messenger.g0.Q1() || profileActivity.o2 || !profileActivity.f0.getImageReceiver().L() || org.telegram.messenger.g0.C1()) ? false : true;
        profileActivity.J2 = null;
        profileActivity.K2 = null;
        yu0 yu0Var = profileActivity.o0;
        yu0Var.I0 = true;
        yu0Var.L0 = profileActivity.L2;
        yu0Var.r1 = null;
        yu0Var.s1 = null;
        yu0Var.setCreateThumbFromParent(false);
        profileActivity.L5(true);
        profileActivity.l5(false, true);
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ns.r, Integer.valueOf(org.telegram.messenger.np.D8));
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ns.j0, new Object[0]);
        profileActivity.getUserConfig().v(true);
    }

    public static void j0(ProfileActivity profileActivity, TLRPC.User user) {
        if (profileActivity.a4 >= 0) {
            if (profileActivity.L4 == -1) {
                profileActivity.M5();
                profileActivity.d.f();
            } else {
                profileActivity.G5(false, false);
            }
        }
        if (profileActivity.L4 == -1) {
            if (profileActivity.o2 || org.telegram.messenger.g0.Q1()) {
                profileActivity.a.setPadding(0, profileActivity.i4(), 0, 0);
                profileActivity.k2.cancel();
                float[] fArr = profileActivity.n2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.Z4(1.0f);
                profileActivity.Q1 = profileActivity.i4();
            } else {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (profileActivity.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredWidth(), TLObject.FLAG_30);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    iw0 iw0Var = profileActivity.d;
                    if (i7 >= iw0Var.e.O2) {
                        break;
                    }
                    v4.e1 a10 = iw0Var.a(null, iw0Var.d(i7));
                    View view = a10.a;
                    profileActivity.d.t(a10, i7);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i10 += view.getMeasuredHeight();
                    i7++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.i4() + i10) + currentActionBarHeight));
                ou0 ou0Var = profileActivity.a;
                ou0Var.setPadding(0, ou0Var.getPaddingTop(), 0, max);
            }
        }
        profileActivity.M.m(profileActivity.i1, user, 8);
    }

    public static void k0(ProfileActivity profileActivity) {
        org.telegram.ui.ActionBar.f2 f2Var;
        int i7;
        String str;
        TextView[] textViewArr;
        final int i10;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.w2;
        if (userFull == null || userFull.stars_rating == null) {
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var = null;
        org.telegram.ui.ActionBar.u2 i11 = org.telegram.messenger.i20.i(profileActivity.getParentActivity(), false, 1, null);
        org.telegram.ui.ActionBar.f2 f2Var2 = i11.y0;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        final LimitPreviewView limitPreviewView = new LimitPreviewView(R.drawable.filled_rating_crown, 0, 0, profileActivity.getParentActivity(), profileActivity.A0);
        limitPreviewView.setHideNegativeValues(profileActivity.a() != org.telegram.messenger.m10.i(profileActivity.currentAccount).e());
        limitPreviewView.setStarRating(userFull.stars_rating);
        limitPreviewView.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
        linearLayout.addView(limitPreviewView, c8.ja.t(-1, -2, 17, 0, 20, 0, 10));
        int i12 = 17;
        if (userFull.stars_my_pending_rating != null) {
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            linearLayout.addView(frameLayout, c8.ja.t(-1, -2, 17, 40, -12, 40, 20));
            int i13 = 2;
            org.telegram.ui.Components.z70[] z70VarArr = new org.telegram.ui.Components.z70[2];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i13;
                bi.w1 w1Var = new bi.w1(6, parentActivity, e6Var);
                z70VarArr[i14] = w1Var;
                w1Var.setGravity(i12);
                z70VarArr[i14].setTextSize(1, 12.0f);
                org.telegram.ui.ActionBar.q6.U(z70VarArr[i14], org.telegram.ui.ActionBar.j6.y6, null);
                org.telegram.ui.ActionBar.q6.G(z70VarArr[i14], org.telegram.ui.ActionBar.j6.Xc, null);
                frameLayout.addView(z70VarArr[i14], c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
                z70VarArr[i14].setAlpha(i14 == 0 ? 1.0f : 0.0f);
                z70VarArr[i14].setScaleX(i14 == 0 ? 1.0f : 0.8f);
                z70VarArr[i14].setScaleY(i14 == 0 ? 1.0f : 0.8f);
                i14++;
                i13 = i15;
                i12 = 17;
            }
            int i16 = i13;
            final r3 r3Var = new r3(z70VarArr, 22);
            boolean z10 = profileActivity.a() == org.telegram.messenger.m10.i(profileActivity.currentAccount).e();
            long j3 = userFull.stars_rating.stars;
            TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
            f2Var = f2Var2;
            long j10 = (-j3) - (tl_starsRating != null ? tl_starsRating.stars - j3 : 0L);
            int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(profileActivity.currentAccount).getCurrentTime()) / 86400);
            long j11 = userFull.stars_my_pending_rating.stars;
            long j12 = userFull.stars_rating.stars;
            long j13 = j11 - j12;
            if ((j12 >= 0 || z10) && (!z10 || j10 <= 0)) {
                textViewArr = z70VarArr;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String H = org.telegram.messenger.hd.H(',', "StarRatingFuture", max);
                String H2 = org.telegram.messenger.hd.H(',', "StarRatingFuturePendingPoints", (int) j13);
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[0] = H;
                charSequenceArr[1] = "\n";
                charSequenceArr[i16] = H2;
                spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                spannableStringBuilder.append((CharSequence) " ");
                i10 = 0;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131745186, null), new Runnable() { // from class: org.telegram.ui.hu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17 = i10;
                        r3 r3Var2 = r3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i17) {
                            case 0:
                                RectF rectF = ProfileActivity.X6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                r3Var2.a(Boolean.TRUE);
                                break;
                            default:
                                RectF rectF2 = ProfileActivity.X6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                r3Var2.a(Boolean.FALSE);
                                break;
                        }
                    }
                }), true));
                textViewArr[0].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iu0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i17 = i10;
                        r3 r3Var2 = r3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i17) {
                            case 0:
                                RectF rectF = ProfileActivity.X6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                r3Var2.a(Boolean.TRUE);
                                break;
                            default:
                                RectF rectF2 = ProfileActivity.X6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                r3Var2.a(Boolean.FALSE);
                                break;
                        }
                    }
                });
                textViewArr[0].setText(spannableStringBuilder);
            } else {
                boolean z11 = z10;
                textViewArr = z70VarArr;
                org.telegram.ui.ActionBar.q6.U(z70VarArr[0], org.telegram.ui.ActionBar.j6.q7, null);
                if (z11) {
                    textViewArr[0].setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "StarRatingLevelNegativeYou", (int) j10)));
                } else {
                    textViewArr[0].setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131745172, org.telegram.messenger.m5.l(org.telegram.messenger.m10.t0, profileActivity.a()))));
                }
                i10 = 0;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String H3 = org.telegram.messenger.hd.H(',', "StarRatingFuturePreview1", max);
            String H4 = org.telegram.messenger.hd.H(',', "StarRatingFuturePreview2", (int) j13);
            CharSequence[] charSequenceArr2 = new CharSequence[3];
            charSequenceArr2[i10] = H3;
            final int i17 = 1;
            charSequenceArr2[1] = "\n";
            charSequenceArr2[i16] = H4;
            spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131745185, null), new Runnable() { // from class: org.telegram.ui.hu0
                @Override // java.lang.Runnable
                public final void run() {
                    int i172 = i17;
                    r3 r3Var2 = r3Var;
                    TLRPC.UserFull userFull2 = userFull;
                    LimitPreviewView limitPreviewView2 = limitPreviewView;
                    switch (i172) {
                        case 0:
                            RectF rectF = ProfileActivity.X6;
                            limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            r3Var2.a(Boolean.TRUE);
                            break;
                        default:
                            RectF rectF2 = ProfileActivity.X6;
                            limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                            r3Var2.a(Boolean.FALSE);
                            break;
                    }
                }
            }), true));
            textViewArr[1].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iu0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i172 = i17;
                    r3 r3Var2 = r3Var;
                    TLRPC.UserFull userFull2 = userFull;
                    LimitPreviewView limitPreviewView2 = limitPreviewView;
                    switch (i172) {
                        case 0:
                            RectF rectF = ProfileActivity.X6;
                            limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            r3Var2.a(Boolean.TRUE);
                            break;
                        default:
                            RectF rectF2 = ProfileActivity.X6;
                            limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                            r3Var2.a(Boolean.FALSE);
                            break;
                    }
                }
            });
            textViewArr[1].setText(spannableStringBuilder2);
        } else {
            f2Var = f2Var2;
        }
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.hd.M0(2131745167, null));
        textView.setTextSize(1, 20.0f);
        int i18 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i18, profileActivity.A0);
        linearLayout.addView(textView, c8.ja.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        if (userFull.id == org.telegram.messenger.m10.i(profileActivity.currentAccount).e()) {
            textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131745168, null)));
            i7 = 1;
        } else {
            i7 = 1;
            org.telegram.messenger.k5.q(null, null, 2131745198, new Object[]{org.telegram.messenger.m5.l(org.telegram.messenger.m10.t0, profileActivity.a())}, textView2);
        }
        textView2.setTextSize(i7, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView2, i18, profileActivity.A0);
        linearLayout.addView(textView2, c8.ja.t(-1, -2, 17, 20, 0, 20, 12));
        fs0 fs0Var = new fs0(parentActivity, profileActivity.A0);
        fs0Var.a.l(org.telegram.messenger.hd.M0(2131745166, null), false);
        String M0 = org.telegram.messenger.hd.M0(2131745201, null);
        int i19 = org.telegram.ui.ActionBar.j6.Fi;
        fs0Var.b.setText(org.telegram.messenger.hd.V(null, null, 2131745197, V3(M0, i19, profileActivity.A0)));
        fs0Var.d.setVisibility(8);
        ImageView imageView = fs0Var.c;
        imageView.setImageResource(R.drawable.menu_gift);
        org.telegram.ui.ActionBar.e6 e6Var2 = profileActivity.A0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.q6.s(imageView, i18, e6Var2, mode);
        linearLayout.addView(fs0Var, c8.ja.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        fs0 fs0Var2 = new fs0(parentActivity, profileActivity.A0);
        fs0Var2.a.l(org.telegram.messenger.hd.M0(2131745165, null), false);
        fs0Var2.b.setText(org.telegram.messenger.hd.V(null, null, 2131745196, V3(org.telegram.messenger.hd.M0(2131745201, null), i19, profileActivity.A0)));
        fs0Var2.d.setVisibility(8);
        ImageView imageView2 = fs0Var2.c;
        imageView2.setImageResource(R.drawable.menu_stars_gift);
        org.telegram.ui.ActionBar.q6.s(imageView2, i18, profileActivity.A0, mode);
        linearLayout.addView(fs0Var2, c8.ja.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        fs0 fs0Var3 = new fs0(parentActivity, profileActivity.A0);
        fs0Var3.a.l(org.telegram.messenger.hd.M0(2131745164, null), false);
        String M02 = org.telegram.messenger.hd.M0(2131745199, null);
        int f10 = org.telegram.ui.ActionBar.j6.I.q() ? i0.a.f(0.25f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.m6, profileActivity.A0), -16777216) : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.y6, profileActivity.A0);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(M02);
        mv0 mv0Var = new mv0(9);
        mv0Var.w = M02;
        if (mv0Var.c != null) {
            str = null;
            mv0Var.c = null;
            mv0Var.a();
        } else {
            str = null;
        }
        mv0Var.f = f10;
        mv0Var.n = false;
        spannableStringBuilder3.setSpan(mv0Var, 0, spannableStringBuilder3.length(), 0);
        fs0Var3.b.setText(org.telegram.messenger.hd.V(str, str, 2131745195, spannableStringBuilder3));
        fs0Var3.d.setVisibility(8);
        ImageView imageView3 = fs0Var3.c;
        imageView3.setImageResource(R.drawable.menu_refund);
        org.telegram.ui.ActionBar.q6.s(imageView3, i18, profileActivity.A0, mode);
        linearLayout.addView(fs0Var3, c8.ja.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        hi.d dVar = new hi.d(parentActivity, profileActivity.A0, true);
        dVar.setOnClickListener(new ju0(0, f2Var));
        dVar.i(di.c6.h2(org.telegram.messenger.hd.M0(2131743888, null)), false, true);
        linearLayout.addView(dVar, c8.ja.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        i11.O = linearLayout;
        i11.show();
    }

    public static void l0(ProfileActivity profileActivity, int i7, float f10, float f11) {
        int i10 = 26;
        switch (i7) {
            case 0:
                boolean z10 = profileActivity.q1;
                if (!z10) {
                    if (profileActivity.e1 == 0) {
                        if (profileActivity.f1 != 0) {
                            if (!org.telegram.messenger.t3.c0(profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.f1)))) {
                                if (!profileActivity.b4()) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", profileActivity.f1);
                                    if (profileActivity.getMessagesController().E(bundle, profileActivity, null, null)) {
                                        profileActivity.presentFragment(new an(bundle), false);
                                        break;
                                    }
                                }
                            } else {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", profileActivity.f1);
                                if (profileActivity.getMessagesController().E(bundle2, profileActivity, null, null)) {
                                    profileActivity.presentFragment(new an(bundle2), false);
                                    break;
                                }
                            }
                        }
                    } else {
                        profileActivity.N4();
                        break;
                    }
                } else if (z10) {
                    profileActivity.b4();
                    break;
                }
                break;
            case 1:
                profileActivity.H4(profileActivity.a0, f10, f11, true);
                break;
            case 2:
                profileActivity.O4();
                break;
            case 3:
                profileActivity.F4();
                break;
            case 4:
                profileActivity.I4();
                break;
            case 5:
            case 10:
            case 11:
                profileActivity.E4(false);
                break;
            case 6:
                profileActivity.E4(true);
                break;
            case 7:
                profileActivity.G4(true);
                break;
            case 8:
                my0.K0(profileActivity.a(), profileActivity);
                break;
            case 9:
                profileActivity.y4(false);
                break;
            case 12:
                profileActivity.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, profileActivity.getParentActivity(), profileActivity.A0);
                t1Var.r(200L);
                org.telegram.messenger.np.s1(profileActivity.currentAccount).P1().k(profileActivity.a(), new org.telegram.ui.Components.gh(i10, profileActivity, t1Var), true, profileActivity.A0);
                break;
            case 13:
                profileActivity.D4(true);
                break;
            case 14:
                profileActivity.K4();
                break;
            case 15:
                TLRPC.User f12 = profileActivity.getUserConfig().f();
                if (f12 != null) {
                    org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(profileActivity, profileActivity.a0);
                    H.w = false;
                    H.i = 3;
                    H.c(R.drawable.msg_qrcode, org.telegram.messenger.hd.M0(2131746500, null), new k90(profileActivity, 25), false);
                    H.c(R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131746678, null), new ef0(f12, 29), false);
                    H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131746620, null), new k90(profileActivity, i10), false);
                    H.W = true;
                    H.a0(f10 - org.telegram.messenger.g0.L(8.0f), profileActivity.a0.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f));
                    H.Z();
                    break;
                }
                break;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 17:
                profileActivity.presentFragment(new k31(null));
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
        profileActivity.showDialog(new org.telegram.ui.Components.y7(profileActivity.getParentActivity(), profileActivity.A0));
    }

    public static void n0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.oa0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new k90(profileActivity, 23), profileActivity.A0);
    }

    public static void o0(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.xb Q = org.telegram.ui.Components.cc.a0(profileActivity).Q(R.raw.contact_check, 36, org.telegram.messenger.hd.M0(2131746856, null));
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
            org.telegram.messenger.k5.n(null, 2131743879, org.telegram.ui.Components.cc.a0(profileActivity), R.raw.error, 36);
            return;
        }
        if (profileActivity.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.resourceProvider);
            String M0 = org.telegram.messenger.hd.M0(2131746852, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131746853, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
            profileActivity.showDialog(t1Var);
        }
    }

    public static void p0(ProfileActivity profileActivity, org.telegram.ui.Cells.c2[] c2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().o1(profileActivity.e1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().j1(profileActivity.d5);
        tL_messages_reportReaction.id = profileActivity.c5;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new fi.m5(27));
        org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
        if (c2Var != null && c2Var.b()) {
            profileActivity.getMessagesController().f0(-profileActivity.d5, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.e1)));
        }
        profileActivity.c5 = 0;
        profileActivity.G5(false, false);
        org.telegram.ui.Components.cc.a0(profileActivity).E(profileActivity.A0).j();
    }

    public static void q0(ProfileActivity profileActivity, Boolean bool) {
        long j3 = profileActivity.e1;
        if (j3 == 0) {
            long j10 = profileActivity.f1;
            j3 = j10 != 0 ? -j10 : profileActivity.i1;
        }
        long j11 = j3;
        if (bool.booleanValue()) {
            org.telegram.messenger.np.s1(profileActivity.currentAccount).W(profileActivity.d5, j11);
        } else {
            org.telegram.messenger.np.s1(profileActivity.currentAccount).h0(profileActivity.d5, profileActivity.c5, j11);
        }
        profileActivity.c5 = 0;
        profileActivity.G5(false, false);
        org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(profileActivity.getParentActivity(), profileActivity.A0);
        fbVar.d(R.raw.chats_infotip, new String[0]);
        fbVar.b.setText(org.telegram.messenger.hd.M0(2131746404, null));
        org.telegram.ui.Components.cc.a0(profileActivity).b(fbVar, 1500).j();
    }

    public static /* synthetic */ void r0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.J2 = fileLocation;
            profileActivity.K2 = photoSize2.location;
            profileActivity.f0.j(org.telegram.messenger.gc.e(fileLocation), "50_50", profileActivity.q0, null);
            if (profileActivity.P2 != -1) {
                profileActivity.M5();
                iw0 iw0Var = profileActivity.d;
                if (iw0Var != null) {
                    iw0Var.f();
                }
                profileActivity.A4(true);
            }
            yu0 yu0Var = profileActivity.o0;
            org.telegram.messenger.gc e10 = org.telegram.messenger.gc.e(profileActivity.K2);
            profileActivity.L2 = e10;
            yu0Var.A(e10, org.telegram.messenger.gc.e(profileActivity.J2));
            profileActivity.l5(true, false);
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
            profileActivity.n6 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new b00(23, profileActivity, str));
        }
        profileActivity.actionBar.s().requestLayout();
    }

    public static void y1(ProfileActivity profileActivity, boolean z10) {
        int i7 = z10 ? 8 : 0;
        profileActivity.a.setVisibility(i7);
        profileActivity.b.setVisibility(z10 ? 0 : 8);
        profileActivity.U0.getSearchContainer().setVisibility(z10 ? 0 : 8);
        di.u0 u0Var = profileActivity.w0;
        if (u0Var != null) {
            u0Var.setActive(!z10);
        }
        profileActivity.actionBar.A(z10);
        profileActivity.Y.setVisibility(i7);
        av0 av0Var = profileActivity.v0;
        if (av0Var != null) {
            av0Var.setVisibility(i7);
        }
        profileActivity.f.setVisibility(i7);
        profileActivity.r.setVisibility(i7);
        org.telegram.ui.ActionBar.d5 d5Var = profileActivity.T0;
        if (d5Var != null) {
            d5Var.setAlpha(1.0f);
            profileActivity.T0.setVisibility(i7);
        }
        profileActivity.U0.setVisibility(i7);
        profileActivity.f0.setAlpha(1.0f);
        profileActivity.Y.setAlpha(1.0f);
        av0 av0Var2 = profileActivity.v0;
        if (av0Var2 != null) {
            av0Var2.setAlpha(1.0f);
        }
        di.u0 u0Var2 = profileActivity.w0;
        if (u0Var2 != null) {
            u0Var2.setAlpha(1.0f);
        }
        profileActivity.f.setAlpha(1.0f);
        profileActivity.r.setAlpha(profileActivity.V5 ? 0.0f : 1.0f);
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

    public final void A4(boolean z10) {
        float f10;
        float f11;
        org.telegram.ui.Components.i9 currentItemView;
        float f12;
        float f13;
        TLRPC.ChatFull chatFull;
        this.glassEngine.g();
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        float K3 = K3();
        z5();
        ou0 ou0Var = this.a;
        if (ou0Var != null && !this.G1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ou0Var.getLayoutParams();
            if (layoutParams.topMargin != currentActionBarHeight) {
                layoutParams.topMargin = currentActionBarHeight;
                this.a.setLayoutParams(layoutParams);
            }
        }
        R5(z10);
        if (this.Y != null) {
            this.a.setTopGlowOffset((int) this.Q1);
            this.a.setOverScrollMode((this.Q1 <= ((float) i4()) || this.Q1 >= ((float) ((d4() + this.a.getMeasuredWidth()) - currentActionBarHeight))) ? 0 : 2);
        }
        if (this.Y != null && !this.g6 && this.G1) {
            J3();
            return;
        }
        int i42 = i4();
        if (this.Y != null) {
            if (this.a0 != null && this.f1 != 0) {
                this.a0.o(2, (!org.telegram.messenger.t3.T(this.F2) || this.F2.megagroup || (chatFull = this.v2) == null || chatFull.linked_chat_id == 0) ? false : true);
            }
            R5(z10);
            float translationY = this.actionBar.getTranslationY() + (org.telegram.messenger.i20.b(K3, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0) - org.telegram.messenger.g0.L(21.0f));
            if (this.G1) {
                this.b2 = translationY;
            } else {
                org.telegram.ui.Components.zf0 zf0Var = this.u0;
                if (zf0Var != null) {
                    f13 = -org.telegram.messenger.g0.L(29.0f);
                    org.telegram.messenger.yr yrVar = zf0Var.n;
                    if (yrVar != null && yrVar.c) {
                        f13 = yrVar.e.centerY();
                    }
                } else {
                    f13 = -org.telegram.messenger.g0.L(29.0f);
                }
                this.b2 = org.telegram.messenger.g0.T1(f13, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.L(21.0f)), K3);
            }
            float f14 = this.G1 ? this.S1 : this.Q1;
            float f15 = i42;
            if (f14 > f15 || this.q2) {
                f10 = 2.0f;
                float C = a8.p0.C(f14 - f15, (this.a.getMeasuredWidth() - currentActionBarHeight) - j4(), 1.0f, 0.0f);
                this.i2 = C;
                f11 = 18.0f;
                this.c2 = (org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, C * 3.0f)) / 100.0f) * 42.0f;
                this.d2 = 0.0f;
                av0 av0Var = this.v0;
                if (av0Var != null) {
                    av0Var.invalidate();
                }
                di.u0 u0Var = this.w0;
                if (u0Var != null) {
                    u0Var.invalidate();
                }
                float min = Math.min(org.telegram.messenger.g0.N(2000.0f), Math.max(org.telegram.messenger.g0.N(1100.0f), Math.abs(this.j2))) / org.telegram.messenger.g0.N(1100.0f);
                d4();
                boolean z11 = this.p2;
                int i7 = org.telegram.messenger.ns.r4;
                float[] fArr = this.n2;
                if (!z11 || (!this.G0 && this.i2 < 0.33f)) {
                    if (this.q2) {
                        this.q2 = false;
                        org.telegram.messenger.ns.e().k(i7, Boolean.TRUE);
                        org.telegram.ui.ActionBar.d5 d5Var = this.T0;
                        if (d5Var != null) {
                            d5Var.u(21);
                            if (this.r0 != null) {
                                this.T0.u(33);
                                this.T0.u(34);
                                this.T0.u(35);
                                this.T0.T(36);
                                this.T0.T(31);
                            }
                        }
                        org.telegram.ui.ActionBar.d5 d5Var2 = this.U0;
                        if (d5Var2 != null) {
                            d5Var2.setEnabled(!this.z1);
                        }
                        this.N.f(false, min);
                        this.p0.b(min);
                        this.k2.cancel();
                        this.f0.getImageReceiver().u0 = true;
                        this.f0.getImageReceiver().P0(false);
                        float U1 = org.telegram.messenger.g0.U1(this.m2, fArr);
                        fArr[0] = U1;
                        fArr[1] = 0.0f;
                        this.k2.setInterpolator(org.telegram.ui.Components.er.j);
                        if (this.o2) {
                            this.k2.setDuration(0L);
                        } else {
                            this.k2.setDuration((long) ((U1 * 250.0f) / min));
                        }
                        this.d1.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, this.A0));
                        if (!this.I0 && (currentItemView = this.o0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().t() instanceof org.telegram.ui.Components.g51) {
                                this.f0.b0 = false;
                            } else {
                                xu0 xu0Var = this.f0;
                                xu0Var.b0 = true;
                                xu0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.k2.addListener(new bv0(this, 5));
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
                    c4();
                    ValueAnimator valueAnimator = this.k2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        T4();
                        this.f.setTranslationY(this.f2);
                        this.r.setTranslationX(l4(this.g2, this.A6));
                        this.r.setTranslationY(m4(this.h2));
                        s5();
                    }
                } else {
                    if (!this.q2) {
                        if (this.T0 != null) {
                            if (v4()) {
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
                        org.telegram.ui.ActionBar.d5 d5Var3 = this.U0;
                        if (d5Var3 != null) {
                            d5Var3.setEnabled(false);
                        }
                        this.q2 = true;
                        org.telegram.messenger.ns.e().k(i7, Boolean.TRUE);
                        this.N.f(true, min);
                        this.p0.b(min);
                        this.o0.setCreateThumbFromParent(true);
                        this.o0.getAdapter().g();
                        this.k2.cancel();
                        float U12 = org.telegram.messenger.g0.U1(this.m2, fArr);
                        fArr[0] = U12;
                        fArr[1] = 1.0f;
                        av0 av0Var2 = this.v0;
                        if (av0Var2 == null || av0Var2.x.isEmpty()) {
                            this.k2.setInterpolator(org.telegram.ui.Components.er.j);
                            this.k2.setDuration((long) (((1.0f - U12) * 250.0f) / min));
                        } else {
                            this.k2.setInterpolator(new x1.a());
                            this.k2.setDuration((long) ((((1.0f - U12) * 1.3f) * 250.0f) / min));
                        }
                        this.k2.addListener(new bv0(this, 4));
                        View m10 = this.c.m(0);
                        if (!this.P1 && m10 != null) {
                            this.O1 = true;
                            this.a.x0(((m10.getTop() - this.a.getMeasuredWidth()) - d4()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0), (int) this.k2.getDuration(), (Interpolator) this.k2.getInterpolator());
                            this.a.P0 = false;
                        }
                        this.e6 = this.f.getTranslationY();
                        this.f6 = this.r.getTranslationY();
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
                        this.f.setTranslationY((((f16 - d4()) - org.telegram.messenger.g0.N(30.0f)) - this.f.getBottom()) + L);
                        this.r.setTranslationX(l4(org.telegram.messenger.g0.N(16.0f) - this.r.getLeft(), 0.0f));
                        this.r.setTranslationY(m4((((f16 - d4()) - org.telegram.messenger.g0.N(10.0f)) - this.r.getBottom()) + L));
                        s5();
                    }
                }
            } else {
                f10 = 2.0f;
                f11 = 18.0f;
            }
            boolean z12 = this.G1;
            if (z12 && this.J1 == 2) {
                float f17 = this.i6;
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / f10) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - (org.telegram.messenger.g0.p * 21.0f));
                this.f.setPivotY(r6.getMeasuredHeight());
                this.f.setScaleX(1.38f);
                this.f.setScaleY(1.38f);
                this.c2 = org.telegram.messenger.g0.W1(this.T1, 42, org.telegram.messenger.ns.U1) / 100.0f;
                this.d2 = 0.0f;
                av0 av0Var3 = this.v0;
                if (av0Var3 != null) {
                    av0Var3.setExpandProgress(1.0f);
                }
                di.u0 u0Var2 = this.w0;
                if (u0Var2 != null) {
                    u0Var2.setExpandProgress(1.0f);
                }
                this.f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(r4(), 0.0f, this.T1));
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
                xu0 xu0Var2 = this.f0;
                float f18 = this.T1;
                float f19 = this.c2;
                xu0Var2.I = f18;
                xu0Var2.J = f19;
                xu0Var2.H = true;
                this.N.e(false, f18);
                this.actionBar.H(i0.a.f(this.T1, this.l6 != null ? -1 : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.v8, this.A0), -1), false);
                org.telegram.ui.Components.lk0 lk0Var = this.L;
                if (lk0Var != null) {
                    lk0Var.b(i0.a.f(this.T1, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h8, this.A0), Color.argb(org.telegram.messenger.ns.J2, org.telegram.messenger.ns.e4, org.telegram.messenger.ns.e4, org.telegram.messenger.ns.e4)));
                }
                Drawable drawable = this.x;
                if (drawable != null) {
                    drawable.setColorFilter(this.l6 == null ? i0.a.f(this.T1, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.gd, this.A0), -1) : -1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.dr drVar = this.J;
                if (drVar != null) {
                    drVar.a(this.T1);
                    this.f.invalidate();
                }
                org.telegram.ui.Components.dr drVar2 = this.K;
                if (drVar2 != null) {
                    drVar2.a(this.T1);
                    this.f.invalidate();
                }
                v5(this.T1);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                layoutParams3.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.a.getMeasuredWidth() / this.c2, this.T1);
                layoutParams3.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.Q1 + currentActionBarHeight) / this.c2, this.T1);
                this.Y.requestLayout();
                s5();
            } else if (f14 <= f15) {
                if (z12) {
                    this.c2 = org.telegram.messenger.g0.W1(K3, 42, 96) / 100.0f;
                    this.d2 = 0.0f;
                    f12 = 1.0f;
                } else {
                    org.telegram.ui.Components.zf0 zf0Var2 = this.u0;
                    this.c2 = org.telegram.messenger.g0.T1(zf0Var2 != null ? zf0Var2.getHiddenAvatarSizeDp() : 24.0f, 96.0f, K3) / 100.0f;
                    f12 = 1.0f;
                    this.d2 = 1.0f - K3;
                }
                org.telegram.ui.Components.hf0 hf0Var = this.a0;
                if (hf0Var != null) {
                    if (this.G1) {
                        hf0Var.setAlpha(this.T1);
                    } else {
                        hf0Var.setAlpha(f12);
                    }
                }
                av0 av0Var4 = this.v0;
                if (av0Var4 != null) {
                    av0Var4.invalidate();
                }
                di.u0 u0Var3 = this.w0;
                if (u0Var3 != null) {
                    u0Var3.h = this.G1;
                    float l10 = Utilities.l((K3 - 0.3f) / 0.7f);
                    if (u0Var3.f != l10) {
                        u0Var3.f = l10;
                        u0Var3.invalidate();
                    }
                }
                float T1 = this.G1 ? org.telegram.messenger.g0.T1(o4(0), 1.12f, K3) : (0.12f * K3) + 1.0f;
                ValueAnimator valueAnimator2 = this.k2;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    this.Y.setScaleX(this.c2);
                    this.Y.setScaleY(this.c2);
                    c4();
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
                    bv0 bv0Var = this.c6;
                    valueAnimator3.removeListener(bv0Var);
                    this.k2.addListener(bv0Var);
                }
                float N = ((org.telegram.messenger.g0.N(8.0f) + (this.Y.getScaleY() * this.Y.getHeight())) * (this.G1 ? this.T1 : K3)) + ((float) Math.floor(translationY));
                this.f2 = com.google.android.gms.internal.vision.e2.z(1.0f, this.T1, 0.0f, (org.telegram.messenger.g0.L(7.0f) * K3) + org.telegram.messenger.g0.L(1.3f) + N);
                this.h2 = (((float) Math.floor(org.telegram.messenger.g0.p * 11.0f)) * K3) + N + org.telegram.messenger.g0.L(24.0f);
                float L3 = this.G1 ? (this.i6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f) : -org.telegram.messenger.g0.N(46.0f);
                tw0 tw0Var = this.D6;
                if (tw0Var != null) {
                    tw0Var.setAlpha((int) (255.0f * K3));
                }
                int measuredWidth2 = this.a.getMeasuredWidth();
                this.f.setScaleX(T1);
                this.f.setScaleY(T1);
                float T12 = this.G1 ? org.telegram.messenger.g0.T1(o4(1), 1.0f, K3) : 1.0f;
                this.r.setScaleX(T12);
                this.r.setScaleY(T12);
                B4(0, K3, false);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                float f20 = measuredWidth2 / f10;
                float min2 = f20 - (((Math.min(this.f.getExactWidth(), layoutParams4.width) * T1) * 0.5f) + layoutParams4.leftMargin);
                float f21 = ((FrameLayout.LayoutParams) this.r.getLayoutParams()).width;
                float paddingLeft = (this.t5 || this.r.getExactWidth() > (f21 - ((float) this.r.getPaddingLeft())) - ((float) this.r.getPaddingRight())) ? 0.0f : this.r.getPaddingLeft();
                float min3 = f20 - ((Math.min(this.r.getExactWidth(), f21) * 0.5f) + (r7.leftMargin + paddingLeft));
                this.e2 = min2;
                this.g2 = min3;
                this.A6 = paddingLeft;
                if (this.G1) {
                    min2 = org.telegram.messenger.g0.T1(p4(L3, 0, this.f), min2, K3);
                    min3 = org.telegram.messenger.g0.T1(p4(L3, 1, this.r), min3, K3);
                }
                ValueAnimator valueAnimator4 = this.k2;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    this.f.setTranslationX(min2);
                    this.f.setTranslationY(this.f2);
                    this.r.setTranslationX(l4(min3, this.A6 * K3));
                    this.r.setTranslationY(m4(this.h2));
                }
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i12 = layoutParams5.width;
                int min4 = Math.min(layoutParams5.width, (int) ((((org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.L(490.0f) : org.telegram.messenger.g0.q.x) - org.telegram.messenger.g0.L(f11)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams5.leftMargin)));
                layoutParams5.width = min4;
                if (min4 != i12) {
                    this.f.requestLayout();
                }
                s5();
            }
            ValueAnimator valueAnimator5 = this.k2;
            if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                B4(0, K3, true);
            }
        }
        y5(currentActionBarHeight);
        if (K3 >= 1.0f) {
            this.f0.setAlpha(1.0f);
        }
    }

    public final void A5() {
        float f10 = 0.0f;
        if (!this.q1 && !this.G1) {
            int d42 = d4();
            f10 = d42 > 0 ? c8.i9.a(1.0f - (this.Q1 / d42), 0.0f, 1.0f) : c8.i9.a((this.d2 - 0.6f) / 0.4f, 0.0f, 1.0f);
        }
        float f11 = this.E5;
        if (f11 != f10) {
            boolean z10 = ((f11 > 0.5f ? 1 : (f11 == 0.5f ? 0 : -1)) > 0) != ((f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1)) > 0);
            this.E5 = f10;
            ok okVar = this.f;
            if (okVar != null) {
                okVar.setTextColor(this.H5);
            }
            zu0 zu0Var = this.r;
            if (zu0Var != null) {
                zu0Var.setTextColor(this.I5);
            }
            u5();
            if (z10) {
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.r4, Boolean.TRUE);
            }
            vw0 vw0Var = this.d1;
            if (vw0Var != null) {
                vw0Var.invalidate();
            }
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        D5();
        C5();
    }

    @Override // org.telegram.ui.ie0
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
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
    public final void B4(int i7, float f10, boolean z10) {
        float scaleX;
        float f11;
        int i10;
        int ceil;
        ValueAnimator valueAnimator;
        if (this.Q1 > i4() || ((valueAnimator = this.k2) != null && valueAnimator.isRunning())) {
            scaleX = this.f.getScaleX();
        } else {
            if (f10 < 1.0f) {
                f11 = 1.12f;
                scaleX = 1.0f;
                int L = !org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.L(490.0f) : org.telegram.messenger.g0.q.x;
                org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
                int max = L - (((int) Math.max(org.telegram.messenger.g0.L(64.0f), (w4Var == null ? w4Var.r().getTargetPillWidth() : org.telegram.messenger.g0.L(46.0f)) + org.telegram.messenger.g0.L(18.0f))) * 2);
                int i11 = (int) (max / (i7 == 0 ? scaleX : 1.0f));
                int A = i7 == 0 ? i7 : org.telegram.messenger.i20.A(18.0f, 2, L);
                if (i7 == 0) {
                    i7 = (int) (A / f11);
                }
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.i;
                int W1 = org.telegram.messenger.g0.W1(erVar.getInterpolation(f10), i11, i7);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i12 = layoutParams.width;
                layoutParams.width = (int) Math.ceil(W1);
                if (z10) {
                    layoutParams.width = Math.min(layoutParams.width, (int) (((L - org.telegram.messenger.g0.L(18.0f)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams.leftMargin)));
                }
                if (z10 && layoutParams.width != i12) {
                    this.f.requestLayout();
                }
                int W12 = org.telegram.messenger.g0.W1(erVar.getInterpolation(f10), max, A);
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
        org.telegram.ui.ActionBar.w4 w4Var2 = this.simpleActionBar;
        int max2 = L - (((int) Math.max(org.telegram.messenger.g0.L(64.0f), (w4Var2 == null ? w4Var2.r().getTargetPillWidth() : org.telegram.messenger.g0.L(46.0f)) + org.telegram.messenger.g0.L(18.0f))) * 2);
        int i112 = (int) (max2 / (i7 == 0 ? scaleX : 1.0f));
        if (i7 == 0) {
        }
        if (i7 == 0) {
        }
        org.telegram.ui.Components.er erVar2 = org.telegram.ui.Components.er.i;
        int W13 = org.telegram.messenger.g0.W1(erVar2.getInterpolation(f10), i112, i7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        int i122 = layoutParams3.width;
        layoutParams3.width = (int) Math.ceil(W13);
        if (z10) {
        }
        if (z10) {
            this.f.requestLayout();
        }
        int W122 = org.telegram.messenger.g0.W1(erVar2.getInterpolation(f10), max2, A);
        FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) this.r.getLayoutParams();
        i10 = layoutParams22.width;
        ceil = (int) Math.ceil(W122);
        layoutParams22.width = ceil;
        if (i10 == ceil) {
        }
    }

    public final void B5() {
        uv0 uv0Var = this.O;
        if (uv0Var == null || this.Z5 == 0) {
            return;
        }
        int topPanelShift = uv0Var.getTopPanelShift();
        int i7 = 0;
        if (topPanelShift > 0 && this.O.isAttachedToWindow()) {
            if (this.O.getParent() == this.a) {
                topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.O.getY()));
            }
            i7 = topPanelShift;
        }
        int i10 = this.Z5 + i7;
        e5(i10, this.F5);
        e5(i10, this.X5);
    }

    public final void C5() {
        if (this.F5 == null || this.X5 == null) {
            return;
        }
        uv0 uv0Var = this.O;
        boolean z10 = uv0Var != null && uv0Var.getParent() == this.a && this.O.isAttachedToWindow();
        float max = Math.max(Math.min(this.E5, this.P5), this.U5);
        this.F5.setAlpha(z10 ? 0.0f : max);
        this.F5.setVisibility((z10 || max <= 0.0f) ? 8 : 0);
        View view = this.X5;
        if (!z10) {
            max = 0.0f;
        }
        view.setAlpha(max);
        if (z10) {
            this.X5.setTranslationY(-(this.O.getY() + this.a.getY()));
        }
    }

    public final void D4(boolean z10) {
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
        if (a22 == null) {
            return;
        }
        if (this.s2 && !org.telegram.messenger.np.F2(a22)) {
            if (!this.k1 || z10) {
                org.telegram.ui.Components.t4.r(this, false, this.F2, a22, this.E2 != null, true, false, true, new ut0(this, a22));
                return;
            } else {
                getMessagesController().g5(new k90(this, 6), this.e1);
                finishFragment();
                return;
            }
        }
        if (this.k1) {
            getMessagesController().g5(null, this.e1);
            if (org.telegram.ui.Components.cc.a(this)) {
                org.telegram.ui.Components.cc.d(this, false).j();
                return;
            }
            return;
        }
        if (this.l1) {
            org.telegram.ui.Components.t4.g0(this, this.e1, a22, null, this.E2, false, null, new na(this, 3), this.A0);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.A0);
        String M0 = org.telegram.messenger.hd.M0(2131753692, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name)));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753693, null), new qt0(this, 2));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, this.A0);
        }
    }

    public final void D5() {
        if (this.simpleActionBar == null || this.K5 == null) {
            return;
        }
        org.telegram.ui.Components.lf0 lf0Var = this.M5;
        if (lf0Var != null) {
            float k42 = k4();
            if (lf0Var.l != k42) {
                lf0Var.l = k42;
                lf0Var.a();
            }
        }
        int f10 = i0.a.f(k4(), this.G5, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, this.A0));
        if (this.J5 != f10) {
            this.J5 = f10;
            org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
            w4Var.m0 = true;
            w4Var.g0 = f10;
            w4Var.updateColors();
        }
        int A2 = this.L5.A2();
        if (this.O5 != A2) {
            this.O5 = A2;
            org.telegram.ui.ActionBar.w4 w4Var2 = this.simpleActionBar;
            fh.g gVar = w4Var2.I;
            if (gVar != null) {
                gVar.updateColors();
                w4Var2.J.updateColors();
                w4Var2.K.updateColors();
            }
            w4Var2.invalidate();
            org.telegram.ui.ActionBar.g5 g5Var = w4Var2.R;
            if (g5Var != null) {
                g5Var.invalidate();
            }
        }
    }

    public final void E4(boolean z10) {
        boolean z11 = false;
        if (this.e1 != 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
            if (a22 != null) {
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.c2.m(a22, z10, z11, getParentActivity(), this.w2, getAccountInstance());
                return;
            }
            return;
        }
        if (this.f1 != 0) {
            if (getMessagesController().g1(this.f1, false, null) != null) {
                org.telegram.ui.Components.voip.c2.l(this.F2, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            TLRPC.Chat chat = this.F2;
            org.telegram.messenger.c accountInstance = getAccountInstance();
            if (getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.v60.J0(getParentActivity(), -chat.id, accountInstance, new org.telegram.ui.Components.km(chat, this, accountInstance, 7));
        }
    }

    public final void E5(boolean z10) {
        uv0 uv0Var;
        if (this.T0 == null) {
            return;
        }
        boolean z11 = false;
        boolean z12 = !this.V5 && ((uv0Var = this.O) == null || !uv0Var.E0());
        boolean z13 = this.q2;
        f5(this.Q0, z12 && !z13 && this.M0, z10);
        f5(this.R0, z12 && !z13 && this.N0, z10);
        f5(this.S0, z12 && !z13 && this.O0, z10);
        uv0 uv0Var2 = this.O;
        boolean z14 = (uv0Var2 == null || uv0Var2.J == null || !uv0Var2.v0(uv0Var2.getClosestTab()) || this.O.E0()) ? false : true;
        f5(this.T0, z12, z10 && !z14);
        uv0 uv0Var3 = this.O;
        if (uv0Var3 != null) {
            boolean z15 = this.V5;
            if (z10 && !z14) {
                z11 = true;
            }
            if (uv0Var3.q2 != z15) {
                uv0Var3.q2 = z15;
                uv0Var3.R(z10, z11);
            }
        }
    }

    public final void F4() {
        TLRPC.UserFull userFull = this.w2;
        if (userFull == null || !org.telegram.messenger.q10.b(userFull)) {
            if (this.F2 != null) {
                org.telegram.ui.Components.c30.h.a();
            }
            showDialog(new bi.s2(getParentActivity(), this.currentAccount, a(), null, null));
        } else {
            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            if (T != null) {
                org.telegram.messenger.i20.t(org.telegram.messenger.hd.a0(null, null, 2131743742, org.telegram.messenger.m5.t(a())), org.telegram.ui.Components.cc.a0(T), R.raw.error, 36);
            }
        }
    }

    public final void F5() {
        TLRPC.User a22;
        if (!this.s1 || this.X0 == null || this.W0 == null || (a22 = getMessagesController().a2(Long.valueOf(this.e1))) == null) {
            return;
        }
        boolean z10 = org.telegram.messenger.q10.n(a22) != null;
        this.X0.setIcon(z10 ? R.drawable.menu_username_change : R.drawable.menu_username_set);
        this.X0.setText(org.telegram.messenger.hd.M0(z10 ? 2131746620 : 2131746619, null));
        this.W0.setVisibility(org.telegram.messenger.q10.n(a22) == null ? 8 : 0);
    }

    public final void G3() {
        org.telegram.ui.ActionBar.k kVar;
        if (this.O == null || (kVar = this.actionBar) == null) {
            return;
        }
        int i7 = kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
        int[] iArr = org.telegram.ui.Components.ys0.t2;
        int z10 = org.telegram.messenger.k5.z(6.666f, ri.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()), currentActionBarHeight);
        int c10 = ri.a.c(i7) + currentActionBarHeight + z10;
        this.Y5 = c10;
        this.O.n1(z10, c10, ri.a.c(this.N6), this.N6 + this.L6);
        this.Z5 = org.telegram.messenger.g0.L(44.0f) + currentActionBarHeight;
        B5();
        O3();
    }

    public final void G4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().m(this.F2.id, getUserConfig().f(), 0, null, this, true, new f60(this, z10, zArr, 8), new a3.g(this, zArr, z10, this.parentLayout.getLastFragment(), 7), null);
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.I4, new Object[0]);
    }

    public final void G5(boolean z10, boolean z11) {
        if (this.d == null) {
            if (z10) {
                J5(false);
            }
            M5();
            return;
        }
        if (!z11 && this.a.isInLayout()) {
            ou0 ou0Var = this.a;
            if (ou0Var.H) {
                ou0Var.post(new org.telegram.ui.Components.fp0(12, this, z10));
                return;
            }
            return;
        }
        wv0 wv0Var = new wv0(this);
        wv0Var.b = this.O2;
        wv0Var.f(wv0Var.c);
        wv0Var.e.clear();
        wv0Var.f.clear();
        wv0Var.e.addAll(this.S4);
        wv0Var.f.addAll(this.T4);
        wv0Var.g = this.v4;
        wv0Var.h = this.w4;
        if (z10) {
            J5(false);
        }
        V4();
        M5();
        wv0Var.f(wv0Var.d);
        try {
            v4.o.c(wv0Var, true).c(this.d);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.d.f();
        }
        int i7 = this.p6;
        if (i7 >= 0) {
            this.c.h1(i7, this.q6 - this.a.getPaddingTop());
        }
        org.telegram.messenger.g0.a4(this.a);
    }

    @Override // org.telegram.ui.sw
    public final /* synthetic */ boolean H() {
        return false;
    }

    public final int H3(int i7, Boolean bool) {
        if (this.l6 == null) {
            return i7;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.s8, this.A0);
        int f10 = i0.a.f(0.5f, this.l6.m(org.telegram.ui.ActionBar.j6.I.q()), this.l6.n(org.telegram.ui.ActionBar.j6.I.q()));
        if (org.telegram.ui.ActionBar.j6.e1(w02)) {
            return org.telegram.ui.ActionBar.j6.D(org.telegram.ui.ActionBar.j6.I.q(), w02, f10, i7, (bool == null || bool.booleanValue()) ? f10 : org.telegram.ui.ActionBar.j6.r1(0.7f, f10));
        }
        return (bool == null || bool.booleanValue()) ? f10 : org.telegram.ui.ActionBar.j6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.j6.r1(0.7f, f10));
    }

    public final void H4(View view, float f10, float f11, boolean z10) {
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
        boolean r22 = getMessagesController().r2(j11, this.g1, null);
        if (z10 && (this.q1 || r22)) {
            boolean z11 = !r22;
            getNotificationsController().G(j11, this.g1, z11);
            org.telegram.ui.Components.cc.A(this, z11, null).j();
            x5();
            this.a0.setNotifications(r22);
            return;
        }
        if ((z10 || !org.telegram.messenger.hd.a0 || f10 > org.telegram.messenger.g0.L(76.0f)) && (org.telegram.messenger.hd.a0 || f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
            org.telegram.ui.Components.io ioVar = new org.telegram.ui.Components.io(getParentActivity(), this.currentAccount, null, true, new a8.va(this, j11, 7), this.A0);
            ioVar.e(j11, this.g1, this.l5);
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
            ioVar.d(this, view, f12, f13, z10);
            return;
        }
        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
        boolean z12 = h5Var.e.h;
        boolean z13 = !z12;
        boolean D = getNotificationsController().D(j11, null, false, false);
        String v = org.telegram.messenger.at.v(j11, this.g1, false);
        if (z12) {
            SharedPreferences.Editor edit = org.telegram.messenger.np.s1(this.currentAccount).e7.edit();
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
            SharedPreferences.Editor edit2 = org.telegram.messenger.np.s1(this.currentAccount).e7.edit();
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
        x5();
        getNotificationsController().c0(j11, this.g1, true);
        h5Var.setChecked(z13);
        I5(true);
    }

    public final void H5() {
        if (this.c0 == null || this.r == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        boolean z10 = this.G1;
        if (z10 && this.J1 == 2 && this.Y != null) {
            this.c0.setAlpha(this.T1);
            this.c0.f(org.telegram.messenger.g0.L(74.0f) + this.a.getMeasuredWidth(), d4() - org.telegram.messenger.g0.L(74.0f));
            return;
        }
        if (z10) {
            this.c0.setAlpha(this.T1);
        }
        float f10 = currentActionBarHeight;
        float L = this.Q1 + f10 + org.telegram.messenger.g0.L(74.0f);
        float min = Math.min(d4(), L - f10);
        this.c0.f(L - min, min - org.telegram.messenger.g0.L(74.0f));
    }

    @Override // org.telegram.ui.Components.l30
    public final void I(float f10) {
        org.telegram.ui.Cells.b4 b4Var = this.h0;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(f10);
        this.o0.O(this.L2, f10);
    }

    public final void I3() {
        int f10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || this.f == null || this.d1 == null || this.T0 == null || this.Q0 == null || this.R0 == null || this.S0 == null || this.p0 == null) {
            return;
        }
        Float valueOf = Float.valueOf(this.U5);
        dv0 dv0Var = this.W5;
        dv0Var.getClass();
        dv0Var.a(kVar, valueOf);
        if (this.U5 > 0.0f || this.l2 <= 0.0f) {
            return;
        }
        ok okVar = this.f;
        int i7 = -1;
        if (this.l6 != null) {
            f10 = -1;
        } else {
            f10 = i0.a.f(this.l2, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.mi, this.A0), -1);
        }
        okVar.setTextColor(f10);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (this.l6 == null) {
            i7 = i0.a.f(this.l2, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.v8, this.A0), -1);
        }
        kVar2.H(i7, false);
    }

    public final void I4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.e1 != 0) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
                if (a22 == null) {
                    return;
                }
                if (this.G2 == null || (userFull = this.w2) == null || TextUtils.isEmpty(userFull.about)) {
                    str = String.format("https://" + getMessagesController().V2 + "/%s", org.telegram.messenger.q10.n(a22));
                } else {
                    str = String.format("%s https://" + getMessagesController().V2 + "/%s", this.w2.about, org.telegram.messenger.q10.n(a22));
                }
            } else if (this.f1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                if (M0 == null) {
                    return;
                }
                TLRPC.ChatFull chatFull = this.v2;
                if (chatFull == null || TextUtils.isEmpty(chatFull.about)) {
                    str = String.format("https://" + getMessagesController().V2 + "/%s", org.telegram.messenger.t3.K(M0, false));
                } else {
                    str = String.format("%s\nhttps://" + getMessagesController().V2 + "/%s", this.v2.about, org.telegram.messenger.t3.K(M0, false));
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if ((r0 - getConnectionsManager().getCurrentTime()) <= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r6 == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I5(boolean z10) {
        int i7;
        iw0 iw0Var;
        if (z10 && (i7 = this.O3) >= 0 && (iw0Var = this.d) != null) {
            iw0Var.g(i7);
        }
        org.telegram.ui.Components.hf0 hf0Var = this.a0;
        if (hf0Var == null || this.s1) {
            return;
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(this.currentAccount).e7;
        long j3 = this.i1;
        if (j3 == 0) {
            j3 = this.e1;
            if (j3 == 0) {
                j3 = -this.f1;
            }
        }
        long j10 = j3;
        boolean z11 = false;
        String v = org.telegram.messenger.at.v(j10, this.g1, false);
        boolean contains = sharedPreferences.contains("notify2_" + v);
        int c10 = org.telegram.messenger.k5.c("notify2_", v, sharedPreferences, 0);
        int c11 = org.telegram.messenger.k5.c("notifyuntil_", v, sharedPreferences, 0);
        if (c10 != 3 || c11 == Integer.MAX_VALUE) {
            if (c10 == 0) {
                if (!contains) {
                    z11 = getNotificationsController().D(j10, null, false, false);
                    hf0Var.setNotifications(z11);
                }
                z11 = true;
                hf0Var.setNotifications(z11);
            }
        }
    }

    @Override // org.telegram.ui.Components.nr0
    public final void J() {
        W4(false);
    }

    public final void J3() {
        if (this.d6 == null) {
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
        this.c2 = org.telegram.messenger.g0.T1(0.42f, this.d6[0], l10);
        this.a2 = org.telegram.messenger.g0.T1(this.i6, this.d6[1], l10);
        this.b2 = org.telegram.messenger.g0.T1(translationY, this.d6[2], l10);
        this.d2 = org.telegram.messenger.g0.T1(this.d6[11], 0.0f, l10);
        this.Y.setScaleX(this.c2);
        this.Y.setScaleY(this.c2);
        this.Y.setTranslationX(this.a2);
        this.Y.setTranslationY(this.b2);
        org.telegram.ui.Components.mu0 mu0Var = this.T;
        if (mu0Var != null) {
            mu0Var.setAlpha(l10);
        }
        this.f0.setAlpha(1.0f);
        this.Y.setAlpha(1.0f);
        av0 av0Var = this.v0;
        if (av0Var != null) {
            av0Var.invalidate();
        }
        di.u0 u0Var = this.w0;
        if (u0Var != null) {
            u0Var.e = org.telegram.messenger.g0.T1(0.0f, this.d6[4], f10);
            this.w0.f = org.telegram.messenger.g0.T1(0.0f, this.d6[5], l10);
            di.u0 u0Var2 = this.w0;
            u0Var2.h = true;
            u0Var2.invalidate();
        }
        tw0 tw0Var = this.D6;
        if (tw0Var != null) {
            tw0Var.setAlpha((int) org.telegram.messenger.g0.T1(0.0f, this.d6[6], l10));
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
        float T1 = org.telegram.messenger.g0.T1(o4(0), this.d6[7], l10);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - (org.telegram.messenger.g0.p * 21.0f)))) + org.telegram.messenger.g0.L(1.3f);
        float N = org.telegram.messenger.g0.N(22.7f) + floor;
        this.f2 = org.telegram.messenger.g0.T1(floor, this.d6[8], l10);
        this.h2 = org.telegram.messenger.g0.T1(N, this.d6[9], l10);
        float L2 = (this.i6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f);
        float T12 = org.telegram.messenger.g0.T1(p4(L2, 0, this.f), this.d6[12], l10);
        float T13 = org.telegram.messenger.g0.T1(p4(L2 + this.s5, 1, this.r) - this.s5, this.d6[13], l10);
        this.f.setTranslationX(T12);
        this.f.setTranslationY(this.f2);
        this.r.setTranslationX(this.s5 + T13);
        this.r.setTranslationY(this.h2);
        this.e2 = T12;
        this.g2 = T13;
        this.f.setScaleX(T1);
        this.f.setScaleY(T1);
        float T14 = org.telegram.messenger.g0.T1(o4(1), 1.0f, l10);
        this.r.setScaleX(T14);
        this.r.setScaleY(T14);
        s5();
        y5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0));
        B4((int) this.d6[10], l10, true);
        org.telegram.ui.Components.hf0 hf0Var = this.a0;
        if (hf0Var != null) {
            hf0Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, this.d6[3], f10));
        }
    }

    public final void J4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.M3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f1);
            bundle.putLong("user_id", this.e1);
            presentFragment(new ci.i0(bundle));
            return;
        }
        if (view2.getTag() == null || ((Integer) view2.getTag()).intValue() != this.V2) {
            return;
        }
        if (this.e1 == getUserConfig().e()) {
            presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
        } else if (org.telegram.messenger.q10.b(this.w2)) {
            org.telegram.messenger.i20.t(org.telegram.messenger.hd.a0(null, null, 2131743742, org.telegram.messenger.m5.t(this.e1)), org.telegram.ui.Components.cc.a0(this), R.raw.error, 36);
        } else {
            showDialog(new bi.s2(getParentActivity(), this.currentAccount, this.e1, null, null));
        }
    }

    public final void J5(boolean z10) {
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
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.v2.participants.participants.get(i10).user_id));
            if (a22 != null && (userStatus = a22.status) != null && ((userStatus.expires > currentTime || a22.id == getUserConfig().e()) && a22.status.expires > 10000)) {
                this.C2++;
            }
            this.D2.add(Integer.valueOf(i10));
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
                i10 = com.google.android.gms.internal.vision.e2.f(i7, i10, 1, arrayList);
            }
            i7 = TLObject.FLAG_31;
            i10 = com.google.android.gms.internal.vision.e2.f(i7, i10, 1, arrayList);
        }
        try {
            Collections.sort(this.D2, Comparator$-EL.reversed(Comparator$-CC.comparingInt(new pe(arrayList, 1))));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (z10 && this.d != null && this.v4 > 0) {
            org.telegram.messenger.g0.a4(this.a);
        }
        if (this.O == null || this.L4 == -1) {
            return;
        }
        if ((this.D2.size() > 5 || this.U4 == 2) && this.U4 != 1) {
            this.O.m1(this.D2, this.v2);
        }
    }

    public final float K3() {
        return Utilities.l((this.Q1 - d4()) / j4());
    }

    public final void K4() {
        org.telegram.ui.Components.ch0 ch0Var;
        if (this.e1 == 0) {
            O4();
            return;
        }
        if (this.r0 == null) {
            N4();
            return;
        }
        TLRPC.User a22 = org.telegram.messenger.np.s1(this.currentAccount).a2(Long.valueOf(org.telegram.messenger.m10.i(this.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.m10.i(this.currentAccount).f();
        }
        if (a22 == null) {
            return;
        }
        org.telegram.ui.Components.m30 m30Var = this.r0;
        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
        m30Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new k90(this, 27), new q5(this, 13), 0);
        this.V.M(0);
        this.V.P(43);
        this.W.M(0);
        this.W.P(43);
        org.telegram.ui.Components.hf0 hf0Var = this.a0;
        if (hf0Var != null) {
            org.telegram.ui.Components.ef0 i7 = org.telegram.ui.Components.hf0.i(14, hf0Var.a);
            if (i7 != null && (ch0Var = i7.k) != null) {
                ch0Var.start();
            }
        } else {
            this.s.d();
        }
        org.telegram.ui.Cells.l8 l8Var = this.N2;
        if (l8Var != null) {
            l8Var.getImageView().d();
        }
    }

    public final void K5() {
        CharSequence charSequence;
        zu0 zu0Var = this.r;
        if (zu0Var == null) {
            return;
        }
        if ((!this.V5 || (charSequence = this.a6) == null) && (!this.y6 || (charSequence = this.x6) == null)) {
            charSequence = this.w6;
        }
        if (!zu0Var.o(charSequence, !this.G1) || this.fragmentView == null) {
            return;
        }
        A4(false);
    }

    public final void L3() {
        this.b2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.L(21.0f));
        this.c2 = 1.38f;
        this.d2 = 0.0f;
        c4();
        T4();
        B4(0, 1.0f, true);
        this.e2 = (this.a.getMeasuredWidth() / 2.0f) - (((this.f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin);
        this.g2 = (this.a.getMeasuredWidth() / 2.0f) - ((this.r.getExactWidth() * 0.5f) + (((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin + (this.t5 ? 0 : this.r.getPaddingLeft())));
        this.A6 = this.t5 ? 0.0f : this.r.getPaddingLeft();
        if (this.J1 != 2) {
            this.v0.setAlpha(1.0f);
        }
        this.Y.setAlpha(1.0f);
        this.f0.setAlpha(1.0f);
    }

    public final void L4() {
        Bundle k10 = a8.p0.k("addToGroup", true);
        k10.putLong("chatId", this.F2.id);
        w40 w40Var = new w40(k10);
        TLRPC.ChatFull chatFull = this.v2;
        w40Var.J = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i7 = 0; i7 < this.v2.participants.participants.size(); i7++) {
                hVar.k(null, this.v2.participants.participants.get(i7).user_id);
            }
            w40Var.K = hVar;
        }
        w40Var.y = new qt0(this, 0);
        presentFragment(w40Var);
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
    public final void L5(boolean z10) {
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
        org.telegram.ui.Components.g51 g51Var;
        org.telegram.messenger.gc gcVar5;
        TLRPC.User user;
        org.telegram.messenger.gc gcVar6;
        TLRPC.User user2;
        TLRPC.UserStatus userStatus;
        boolean z14;
        org.telegram.ui.ActionBar.w4 w4Var;
        tw0 tw0Var;
        Drawable drawable;
        boolean z15;
        boolean z16;
        boolean z17;
        org.telegram.ui.Components.qg qgVar;
        String str2;
        TL_stars.Tl_starsRating tl_starsRating;
        TL_stars.Tl_starsRating tl_starsRating2;
        org.telegram.messenger.gc gcVar7;
        yw ywVar;
        uv uvVar;
        if (this.Y == null || this.f == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var == null || o4Var.getFragmentStack().size() < 2) {
            obj = null;
        } else {
            Object obj2 = (org.telegram.ui.ActionBar.e2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            obj = obj2 instanceof org.telegram.ui.Components.qg ? obj2 : null;
            if (obj2 instanceof je0) {
                obj2 = ((je0) obj2).K;
            }
            if ((obj2 instanceof yw) && (uvVar = (ywVar = (yw) obj2).H3) != null) {
                bw bwVar = uvVar.a;
                if (com.google.android.gms.internal.vision.e2.s(bwVar)) {
                    this.j5 = ywVar;
                    obj = bwVar;
                }
            }
        }
        if (obj instanceof an) {
            an anVar = (an) obj;
            if (anVar.p1 != null && anVar.g4 == 8) {
                z11 = true;
                this.t5 = false;
                this.u5 = false;
                str = "";
                if (this.e1 == 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
                    if (a22 == null) {
                        return;
                    }
                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                    boolean z18 = userProfilePhoto != null && userProfilePhoto.personal;
                    TLRPC.FileLocation fileLocation = userProfilePhoto != null ? userProfilePhoto.photo_big : null;
                    this.q0.r(a22);
                    org.telegram.messenger.cp cpVar = this.l6;
                    org.telegram.messenger.cp a10 = org.telegram.messenger.cp.a(a22.emoji_status);
                    this.l6 = a10;
                    if (a10 == null) {
                        int l11 = org.telegram.messenger.q10.l(a22);
                        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(this.currentAccount).s4;
                        this.l6 = dpVar == null ? null : dpVar.d(l11);
                    }
                    if (cpVar != this.l6) {
                        S5();
                    }
                    vw0 vw0Var = this.d1;
                    if (vw0Var != null) {
                        vw0Var.b(org.telegram.messenger.q10.m(a22), a22.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    org.telegram.ui.Components.mu0 mu0Var = this.T;
                    if (mu0Var != null) {
                        mu0Var.b.a(this.l6);
                        mu0Var.invalidate();
                    }
                    TLRPC.EmojiStatus emojiStatus = a22.emoji_status;
                    d5(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null);
                    org.telegram.messenger.gc m13 = org.telegram.messenger.gc.m(org.telegram.messenger.m10.t0, 0, a22);
                    org.telegram.messenger.gc m14 = org.telegram.messenger.gc.m(org.telegram.messenger.m10.t0, 1, a22);
                    org.telegram.messenger.gc m15 = org.telegram.messenger.gc.m(org.telegram.messenger.m10.t0, 4, a22);
                    TLRPC.UserFull userFull = this.w2;
                    if (userFull != null) {
                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                        videoSize = org.telegram.messenger.w7.R((userProfilePhoto2 == null || !userProfilePhoto2.personal) ? userFull.profile_photo : userFull.personal_photo);
                        if (videoSize != null) {
                            g51Var = new org.telegram.ui.Components.g51(videoSize, a22.premium, 2);
                            org.telegram.messenger.gc C = this.o0.C(m14, m13);
                            if (this.J2 == null) {
                                this.o0.H(g51Var, m13, m14, z10);
                            }
                            if (this.K2 == null) {
                                if (videoSize != null) {
                                    this.f0.setImageDrawable(g51Var);
                                } else {
                                    if (m15 == null || a22.photo.personal) {
                                        user = a22;
                                        gcVar6 = m14;
                                        xu0 xu0Var = this.f0;
                                        xu0Var.a.u0(C, "g", m13, "100_100", gcVar6, "50_50", this.q0, 0L, null, user, 1);
                                        gcVar5 = m13;
                                        xu0Var.e();
                                    } else {
                                        this.f0.getImageReceiver().z1 = true;
                                        xu0 xu0Var2 = this.f0;
                                        user = a22;
                                        gcVar6 = m14;
                                        xu0Var2.a.u0(m15, "avatar", m13, "50_50", gcVar6, "50_50", this.q0, 0L, null, user, 1);
                                        xu0Var2.e();
                                        gcVar5 = m13;
                                    }
                                    if ((gcVar6 != null && this.P2 != -1) || (gcVar6 == null && this.P2 == -1)) {
                                        G5(false, false);
                                        A4(true);
                                    }
                                    if (gcVar5 != null || ((gcVar7 = this.C0) != null && gcVar5.s == gcVar7.s)) {
                                        user2 = user;
                                    } else {
                                        this.C0 = gcVar5;
                                        TLRPC.User user3 = user;
                                        getFileLoader().V(gcVar5, user3, null, 0, 1);
                                        user2 = user3;
                                    }
                                    CharSequence p10 = org.telegram.messenger.q10.p(user2);
                                    if (user2.id == getUserConfig().e()) {
                                        long j3 = user2.id;
                                        if (j3 == 489000) {
                                            str = org.telegram.messenger.hd.M0(2131743616, null);
                                        } else if (j3 == 333000 || j3 == 777000 || j3 == 42777) {
                                            str = org.telegram.messenger.hd.M0(2131745561, null);
                                        } else if (org.telegram.messenger.np.F2(user2)) {
                                            str = org.telegram.messenger.hd.M0(2131744325, null);
                                        } else if (this.s2) {
                                            int i10 = user2.bot_active_users;
                                            str = i10 != 0 ? org.telegram.messenger.hd.H(',', "BotUsers", i10) : org.telegram.messenger.q10.d(user2);
                                        } else {
                                            boolean[] zArr = this.K0;
                                            zArr[0] = false;
                                            str = org.telegram.messenger.hd.d0(this.currentAccount, user2, zArr, z18 ? new boolean[1] : null);
                                            boolean z19 = (zArr[0] || getUserConfig().q() || (userStatus = user2.status) == null || (!(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) || !userStatus.by_me) ? false : true;
                                            zu0 zu0Var = this.r;
                                            z14 = z19;
                                            if (zu0Var != null) {
                                                z14 = z19;
                                                if (!this.V5) {
                                                    int i11 = (zArr[0] && this.l6 == null) ? org.telegram.ui.ActionBar.j6.si : org.telegram.ui.ActionBar.j6.B8;
                                                    zu0Var.setTag(Integer.valueOf(i11));
                                                    z14 = z19;
                                                    if (!this.q2) {
                                                        this.r.setTextColor(H3(org.telegram.ui.ActionBar.j6.w0(i11, this.A0), Boolean.valueOf(zArr[0])));
                                                        z14 = z19;
                                                    }
                                                }
                                            }
                                            TLRPC.UserProfilePhoto userProfilePhoto3 = user2.photo;
                                            this.u5 = userProfilePhoto3 == null && userProfilePhoto3.personal;
                                            p10 = org.telegram.messenger.j6.m(p10, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                            if (z11) {
                                                this.f0.setAnimateFromImageReceiver(((an) obj).p1.getAvatarImageView().getImageReceiver());
                                            }
                                            this.f.l(p10, false);
                                            w4Var = this.simpleActionBar;
                                            if (w4Var != null) {
                                                w4Var.setTitle(p10);
                                            }
                                            this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                                            this.r.setRightDrawableInside(true);
                                            zu0 zu0Var2 = this.r;
                                            if (z14) {
                                                if (this.D6 == null) {
                                                    tw0 tw0Var2 = new tw0(org.telegram.messenger.hd.M0(2131744890, null));
                                                    this.D6 = tw0Var2;
                                                    tw0Var2.setAlpha((int) (Math.min(1.0f, this.Q1 / i4()) * 255.0f));
                                                    this.D6.a(i0.a.f(this.l2, org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.b(0.18f, -0.1f, this.c1)), 603979775));
                                                }
                                                tw0Var = this.D6;
                                            } else {
                                                tw0Var = null;
                                            }
                                            zu0Var2.i(tw0Var);
                                            this.r.setRightDrawableOnClick(z14 ? new wt0(this, 7) : null);
                                            if (this.E2 != null) {
                                                if (this.x == null) {
                                                    this.x = org.telegram.ui.ActionBar.j6.l4.getConstantState().newDrawable().mutate();
                                                }
                                                drawable = this.x;
                                            } else {
                                                drawable = null;
                                            }
                                            this.f.setRightDrawableOutside(false);
                                            z15 = user2.scam;
                                            if (!z15 || user2.fake) {
                                                ok okVar = this.f;
                                                int i12 = !z15 ? 1 : 0;
                                                if (this.L == null) {
                                                    org.telegram.ui.Components.lk0 lk0Var = new org.telegram.ui.Components.lk0(i12);
                                                    this.L = lk0Var;
                                                    lk0Var.b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h8, this.A0));
                                                }
                                                okVar.j(this.L);
                                                this.n = org.telegram.messenger.hd.M0(2131745862, null);
                                            } else if (user2.verified) {
                                                this.f.j(s4());
                                                this.n = org.telegram.messenger.hd.M0(2131754739, null);
                                            } else {
                                                this.f.j(null);
                                                this.n = null;
                                            }
                                            if (!org.telegram.messenger.np.F2(user2) || org.telegram.messenger.m5.f(user2.emoji_status) == 0) {
                                                getMessagesController().getClass();
                                                if (org.telegram.messenger.np.B2(user2)) {
                                                    this.f.i(h4(null, true));
                                                    this.h = org.telegram.messenger.hd.M0(2131754802, null);
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
                                                this.h = org.telegram.messenger.hd.M0(2131754802, null);
                                                z17 = true;
                                                z16 = false;
                                            }
                                            if (drawable == null || this.E2 != null || user2.bot_verification_icon == 0) {
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
                                                if (org.telegram.messenger.np.B2(user2)) {
                                                    this.f.setRightDrawableOnClick(new wt0(this, 8));
                                                }
                                            }
                                            if (!user2.self) {
                                                getMessagesController().getClass();
                                                if (org.telegram.messenger.np.B2(user2)) {
                                                    ok okVar2 = this.f;
                                                    okVar2.setRightDrawableOnClick(new y(this, user2, okVar2, 14));
                                                }
                                            }
                                            if (this.e1 == org.telegram.messenger.m10.i(this.currentAccount).n) {
                                                if (this.t5) {
                                                    TLRPC.UserFull userFull2 = this.w2;
                                                    if (userFull2 == null || (tl_starsRating = userFull2.stars_rating) == null || tl_starsRating.stars >= 0) {
                                                        str2 = null;
                                                        str = org.telegram.messenger.hd.M0(2131747826, null);
                                                    } else {
                                                        str2 = null;
                                                        str = org.telegram.messenger.hd.M0(2131745173, null).toLowerCase(Locale.ROOT);
                                                    }
                                                } else {
                                                    str2 = null;
                                                }
                                                this.x6 = org.telegram.messenger.hd.M0(2131750842, str2);
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                                                spannableStringBuilder.append((CharSequence) " d ");
                                                TLRPC.UserProfilePhoto userProfilePhoto4 = user2.photo;
                                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0((userProfilePhoto4 != null && userProfilePhoto4.personal && userProfilePhoto4.has_video) ? 2131751687 : 2131751688, null));
                                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.ls(), str.length() + 1, str.length() + 2, 0);
                                                this.x6 = spannableStringBuilder;
                                            }
                                            this.w6 = str;
                                            K5();
                                            qgVar = this.k5;
                                            if (qgVar != null) {
                                                qgVar.s();
                                            }
                                            this.f0.getImageReceiver().O0(PhotoViewer.N1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                                        }
                                    } else if (org.telegram.messenger.q10.q(this.w2)) {
                                        this.t5 = true;
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(this.w2.fallback_photo.sizes, 1000, false, null, false);
                                        if (w10 != null) {
                                            this.v5.p0(org.telegram.messenger.gc.i(w10, this.w2.fallback_photo), "50_50", null, 0L, null, org.telegram.messenger.m10.i(this.currentAccount).f(), 0);
                                        }
                                    } else {
                                        TLRPC.UserFull userFull3 = this.w2;
                                        str = (userFull3 == null || (tl_starsRating2 = userFull3.stars_rating) == null || tl_starsRating2.stars >= 0) ? org.telegram.messenger.hd.M0(2131747826, null) : org.telegram.messenger.hd.M0(2131745173, null).toLowerCase(Locale.ROOT);
                                    }
                                    z14 = false;
                                    TLRPC.UserProfilePhoto userProfilePhoto32 = user2.photo;
                                    this.u5 = userProfilePhoto32 == null && userProfilePhoto32.personal;
                                    p10 = org.telegram.messenger.j6.m(p10, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                    if (z11) {
                                    }
                                    this.f.l(p10, false);
                                    w4Var = this.simpleActionBar;
                                    if (w4Var != null) {
                                    }
                                    this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                                    this.r.setRightDrawableInside(true);
                                    zu0 zu0Var22 = this.r;
                                    if (z14) {
                                    }
                                    zu0Var22.i(tw0Var);
                                    this.r.setRightDrawableOnClick(z14 ? new wt0(this, 7) : null);
                                    if (this.E2 != null) {
                                    }
                                    this.f.setRightDrawableOutside(false);
                                    z15 = user2.scam;
                                    if (z15) {
                                    }
                                    ok okVar3 = this.f;
                                    int i122 = !z15 ? 1 : 0;
                                    if (this.L == null) {
                                    }
                                    okVar3.j(this.L);
                                    this.n = org.telegram.messenger.hd.M0(2131745862, null);
                                    if (org.telegram.messenger.np.F2(user2)) {
                                    }
                                    getMessagesController().getClass();
                                    if (org.telegram.messenger.np.B2(user2)) {
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
                                    if (this.e1 == org.telegram.messenger.m10.i(this.currentAccount).n) {
                                    }
                                    this.w6 = str;
                                    K5();
                                    qgVar = this.k5;
                                    if (qgVar != null) {
                                    }
                                    this.f0.getImageReceiver().O0(PhotoViewer.N1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                                }
                            }
                            gcVar5 = m13;
                            user = a22;
                            gcVar6 = m14;
                            if (gcVar6 != null) {
                                G5(false, false);
                                A4(true);
                                if (gcVar5 != null) {
                                }
                                user2 = user;
                                CharSequence p102 = org.telegram.messenger.q10.p(user2);
                                if (user2.id == getUserConfig().e()) {
                                }
                                z14 = false;
                                TLRPC.UserProfilePhoto userProfilePhoto322 = user2.photo;
                                this.u5 = userProfilePhoto322 == null && userProfilePhoto322.personal;
                                p102 = org.telegram.messenger.j6.m(p102, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                if (z11) {
                                }
                                this.f.l(p102, false);
                                w4Var = this.simpleActionBar;
                                if (w4Var != null) {
                                }
                                this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                                this.r.setRightDrawableInside(true);
                                zu0 zu0Var222 = this.r;
                                if (z14) {
                                }
                                zu0Var222.i(tw0Var);
                                this.r.setRightDrawableOnClick(z14 ? new wt0(this, 7) : null);
                                if (this.E2 != null) {
                                }
                                this.f.setRightDrawableOutside(false);
                                z15 = user2.scam;
                                if (z15) {
                                }
                                ok okVar32 = this.f;
                                int i1222 = !z15 ? 1 : 0;
                                if (this.L == null) {
                                }
                                okVar32.j(this.L);
                                this.n = org.telegram.messenger.hd.M0(2131745862, null);
                                if (org.telegram.messenger.np.F2(user2)) {
                                }
                                getMessagesController().getClass();
                                if (org.telegram.messenger.np.B2(user2)) {
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
                                if (this.e1 == org.telegram.messenger.m10.i(this.currentAccount).n) {
                                }
                                this.w6 = str;
                                K5();
                                qgVar = this.k5;
                                if (qgVar != null) {
                                }
                                this.f0.getImageReceiver().O0(PhotoViewer.N1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                            }
                            G5(false, false);
                            A4(true);
                            if (gcVar5 != null) {
                            }
                            user2 = user;
                            CharSequence p1022 = org.telegram.messenger.q10.p(user2);
                            if (user2.id == getUserConfig().e()) {
                            }
                            z14 = false;
                            TLRPC.UserProfilePhoto userProfilePhoto3222 = user2.photo;
                            this.u5 = userProfilePhoto3222 == null && userProfilePhoto3222.personal;
                            p1022 = org.telegram.messenger.j6.m(p1022, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                            if (z11) {
                            }
                            this.f.l(p1022, false);
                            w4Var = this.simpleActionBar;
                            if (w4Var != null) {
                            }
                            this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                            this.r.setRightDrawableInside(true);
                            zu0 zu0Var2222 = this.r;
                            if (z14) {
                            }
                            zu0Var2222.i(tw0Var);
                            this.r.setRightDrawableOnClick(z14 ? new wt0(this, 7) : null);
                            if (this.E2 != null) {
                            }
                            this.f.setRightDrawableOutside(false);
                            z15 = user2.scam;
                            if (z15) {
                            }
                            ok okVar322 = this.f;
                            int i12222 = !z15 ? 1 : 0;
                            if (this.L == null) {
                            }
                            okVar322.j(this.L);
                            this.n = org.telegram.messenger.hd.M0(2131745862, null);
                            if (org.telegram.messenger.np.F2(user2)) {
                            }
                            getMessagesController().getClass();
                            if (org.telegram.messenger.np.B2(user2)) {
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
                            if (this.e1 == org.telegram.messenger.m10.i(this.currentAccount).n) {
                            }
                            this.w6 = str;
                            K5();
                            qgVar = this.k5;
                            if (qgVar != null) {
                            }
                            this.f0.getImageReceiver().O0(PhotoViewer.N1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                        }
                    } else {
                        videoSize = null;
                    }
                    g51Var = null;
                    org.telegram.messenger.gc C2 = this.o0.C(m14, m13);
                    if (this.J2 == null) {
                    }
                    if (this.K2 == null) {
                    }
                    gcVar5 = m13;
                    user = a22;
                    gcVar6 = m14;
                    if (gcVar6 != null) {
                    }
                    G5(false, false);
                    A4(true);
                    if (gcVar5 != null) {
                    }
                    user2 = user;
                    CharSequence p10222 = org.telegram.messenger.q10.p(user2);
                    if (user2.id == getUserConfig().e()) {
                    }
                    z14 = false;
                    TLRPC.UserProfilePhoto userProfilePhoto32222 = user2.photo;
                    this.u5 = userProfilePhoto32222 == null && userProfilePhoto32222.personal;
                    p10222 = org.telegram.messenger.j6.m(p10222, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                    if (z11) {
                    }
                    this.f.l(p10222, false);
                    w4Var = this.simpleActionBar;
                    if (w4Var != null) {
                    }
                    this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                    this.r.setRightDrawableInside(true);
                    zu0 zu0Var22222 = this.r;
                    if (z14) {
                    }
                    zu0Var22222.i(tw0Var);
                    this.r.setRightDrawableOnClick(z14 ? new wt0(this, 7) : null);
                    if (this.E2 != null) {
                    }
                    this.f.setRightDrawableOutside(false);
                    z15 = user2.scam;
                    if (z15) {
                    }
                    ok okVar3222 = this.f;
                    int i122222 = !z15 ? 1 : 0;
                    if (this.L == null) {
                    }
                    okVar3222.j(this.L);
                    this.n = org.telegram.messenger.hd.M0(2131745862, null);
                    if (org.telegram.messenger.np.F2(user2)) {
                    }
                    getMessagesController().getClass();
                    if (org.telegram.messenger.np.B2(user2)) {
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
                    if (this.e1 == org.telegram.messenger.m10.i(this.currentAccount).n) {
                    }
                    this.w6 = str;
                    K5();
                    qgVar = this.k5;
                    if (qgVar != null) {
                    }
                    this.f0.getImageReceiver().O0(PhotoViewer.N1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                } else if (this.f1 != 0) {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                    if (M0 != null) {
                        this.F2 = M0;
                    } else {
                        M0 = this.F2;
                    }
                    TLRPC.Chat chat2 = M0;
                    org.telegram.messenger.n6 n6Var = this.Y1;
                    if (n6Var != null) {
                        n6Var.g();
                    }
                    org.telegram.messenger.cp cpVar2 = this.l6;
                    org.telegram.messenger.cp a11 = org.telegram.messenger.cp.a(chat2.emoji_status);
                    this.l6 = a11;
                    if (a11 == null) {
                        int I = org.telegram.messenger.t3.I(chat2);
                        org.telegram.messenger.dp dpVar2 = org.telegram.messenger.np.s1(this.currentAccount).s4;
                        this.l6 = dpVar2 == null ? null : dpVar2.d(I);
                    }
                    if (cpVar2 != this.l6) {
                        S5();
                    }
                    vw0 vw0Var2 = this.d1;
                    if (vw0Var2 != null) {
                        vw0Var2.b(org.telegram.messenger.t3.J(chat2), chat2.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    TLRPC.EmojiStatus emojiStatus2 = chat2.emoji_status;
                    d5(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null);
                    TLRPC.TL_forumTopic f10 = this.q1 ? getMessagesController().r7.f(this.f1, this.g1) : null;
                    if (org.telegram.messenger.t3.T(chat2)) {
                        if (!this.q1) {
                            TLRPC.ChatFull chatFull = this.v2;
                            if (chatFull != null) {
                                TLRPC.Chat chat3 = this.F2;
                                if (!chat3.megagroup) {
                                    if (chatFull.participants_count != 0) {
                                        if (!org.telegram.messenger.t3.N(chat3)) {
                                        }
                                    }
                                }
                            }
                            G = this.F2.megagroup ? org.telegram.messenger.hd.M0(2131748779, null).toLowerCase() : org.telegram.messenger.t3.t0(chat2) ? org.telegram.messenger.hd.M0(2131752318, null).toLowerCase() : org.telegram.messenger.hd.M0(2131752329, null).toLowerCase();
                        }
                        if (this.q1) {
                            int i13 = f10 != null ? f10.totalMessagesCount - 1 : 0;
                            if (i13 > 0) {
                                org.telegram.messenger.hd.G(i13, "messages", Integer.valueOf(i13));
                            } else {
                                org.telegram.messenger.hd.a0("TopicProfileStatus", null, 2131744010, chat2.title);
                            }
                            SpannableString spannableString = new SpannableString(">");
                            spannableString.setSpan(new org.telegram.ui.Components.eq(R.drawable.arrow_newchat, 0), 0, 1, 33);
                            G = new SpannableStringBuilder(chat2.title).append(' ').append((CharSequence) spannableString);
                            z12 = true;
                            if (z11) {
                                an anVar2 = (an) obj;
                                if (anVar2.p1.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.j5) {
                                    ((org.telegram.ui.ActionBar.j5) anVar2.p1.getSubtitleTextView()).getText();
                                } else if (anVar2.p1.getSubtitleTextView() instanceof org.telegram.ui.Components.h6) {
                                    ((org.telegram.ui.Components.h6) anVar2.p1.getSubtitleTextView()).getText();
                                }
                                this.f0.setAnimateFromImageReceiver(anVar2.p1.getAvatarImageView().getImageReceiver());
                            }
                            if (!this.q1) {
                                charSequence = f10 != null ? f10.title : "";
                            } else if (org.telegram.messenger.t3.p0(chat2)) {
                                charSequence = org.telegram.messenger.hd.M0(2131752219, null);
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
                                org.telegram.ui.ActionBar.w4 w4Var2 = this.simpleActionBar;
                                if (w4Var2 != null) {
                                    w4Var2.setTitle(charSequence);
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
                                ok okVar4 = this.f;
                                int i14 = !z13 ? 1 : 0;
                                if (this.L == null) {
                                    org.telegram.ui.Components.lk0 lk0Var2 = new org.telegram.ui.Components.lk0(i14);
                                    this.L = lk0Var2;
                                    lk0Var2.b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h8, this.A0));
                                }
                                okVar4.j(this.L);
                                this.h = org.telegram.messenger.hd.M0(2131745862, null);
                            } else if (chat2.verified) {
                                this.f.j(s4());
                                this.h = org.telegram.messenger.hd.M0(2131754739, null);
                            } else {
                                this.f.j(null);
                                this.h = null;
                            }
                            if (org.telegram.messenger.m5.f(chat2.emoji_status) == 0) {
                                this.f.i(h4(chat2.emoji_status, false));
                                this.f.setRightDrawableOutside(true);
                                this.h = null;
                                if (org.telegram.messenger.t3.w(1, chat2)) {
                                    this.f.setRightDrawableOnClick(new wt0(this, 9));
                                    if (this.S) {
                                        this.S = true;
                                        getMediaDataController().Y0();
                                    }
                                } else {
                                    TLRPC.EmojiStatus emojiStatus3 = chat2.emoji_status;
                                    if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                                        this.f.setRightDrawableOnClick(new gu0(this, ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug, r8 ? 1 : 0));
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
                            if (org.telegram.messenger.t3.d0(this.currentAccount, this.i1)) {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) "* ");
                                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.eq(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
                                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131751926, null));
                                spannableStringBuilder2.append((CharSequence) " * ");
                                int length = spannableStringBuilder2.length();
                                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.ls(), length - 2, length - 1, 33);
                                spannableStringBuilder2.append(G);
                                G = spannableStringBuilder2;
                            }
                            this.w6 = G;
                            this.x6 = null;
                            K5();
                            if (this.q1) {
                                if (z12) {
                                    this.r.setOnClickListener(new wt0(this, 10));
                                } else {
                                    this.r.setOnClickListener(null);
                                    this.r.setClickable(false);
                                }
                            }
                            if (l10) {
                                A4(true);
                            }
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            TLRPC.FileLocation fileLocation2 = (chatPhoto != null || this.q1) ? null : chatPhoto.photo_big;
                            if (this.q1) {
                                if (org.telegram.messenger.t3.p0(this.F2)) {
                                    TLRPC.Chat v12 = getMessagesController().v1(this.F2.id);
                                    this.q0.q(v12);
                                    m10 = org.telegram.messenger.gc.m(this.currentAccount, 0, v12);
                                    m11 = org.telegram.messenger.gc.m(this.currentAccount, 1, v12);
                                    gcVar2 = this.o0.C(m11, m10);
                                } else {
                                    this.q0.q(chat2);
                                    m10 = org.telegram.messenger.gc.m(this.currentAccount, 0, chat2);
                                    m11 = org.telegram.messenger.gc.m(this.currentAccount, 1, chat2);
                                    yu0 yu0Var = this.o0;
                                    if (yu0Var != null) {
                                        gcVar2 = yu0Var.C(m11, m10);
                                    } else {
                                        gcVar = m10;
                                        gcVar2 = null;
                                        gcVar3 = m11;
                                    }
                                }
                                gcVar = m10;
                                gcVar3 = m11;
                            } else {
                                qg.c.p(this.f0, f10, true, true, this.A0);
                                gcVar2 = null;
                                gcVar = null;
                                gcVar3 = null;
                            }
                            boolean H = this.o0.H(null, gcVar, gcVar3, z10);
                            if ((gcVar != null || H) && this.q2 && (m12 = this.c.m(0)) != null) {
                                this.a.w0(0, m12.getTop() - i4(), org.telegram.ui.Components.er.h);
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
                                G = chat2.has_geo ? org.telegram.messenger.hd.M0(2131748642, null).toLowerCase() : org.telegram.messenger.t3.t0(chat2) ? org.telegram.messenger.hd.M0(2131748638, null).toLowerCase() : org.telegram.messenger.hd.M0(2131748641, null).toLowerCase();
                            } else {
                                org.telegram.messenger.hd.G(i15, "Members", new Object[0]);
                                G = org.telegram.messenger.hd.H(',', "Members", this.v2.participants_count);
                            }
                        } else {
                            org.telegram.messenger.hd.G(i7, "Members", new Object[0]);
                            org.telegram.messenger.hd.G(Math.min(this.C2, this.v2.participants_count), "OnlineCount", new Object[0]);
                            G = a8.p0.E(org.telegram.messenger.hd.H(',', "Members", this.v2.participants_count), ", ", org.telegram.messenger.hd.H(',', "OnlineCount", Math.min(this.C2, this.v2.participants_count)));
                        }
                    } else if (org.telegram.messenger.t3.k0(chat2)) {
                        G = org.telegram.messenger.hd.M0(2131742829, null);
                    } else if (org.telegram.messenger.t3.l0(chat2)) {
                        G = org.telegram.messenger.hd.M0(2131742835, null);
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
                    ok okVar42 = this.f;
                    int i142 = !z13 ? 1 : 0;
                    if (this.L == null) {
                    }
                    okVar42.j(this.L);
                    this.h = org.telegram.messenger.hd.M0(2131745862, null);
                    if (org.telegram.messenger.m5.f(chat2.emoji_status) == 0) {
                    }
                    if (chat2.bot_verification_icon == 0) {
                    }
                    if (org.telegram.messenger.t3.d0(this.currentAccount, this.i1)) {
                    }
                    this.w6 = G;
                    this.x6 = null;
                    K5();
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
                    this.a.w0(0, m12.getTop() - i4(), org.telegram.ui.Components.er.h);
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
                A4(true);
            }
        }
        z11 = false;
        this.t5 = false;
        this.u5 = false;
        str = "";
        if (this.e1 == 0) {
        }
        A4(true);
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
    public final void M4(boolean z10) {
        TLRPC.Chat M0;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize x10;
        TLRPC.ChatFull chatFull;
        TLRPC.FileLocation fileLocation2;
        TLRPC.VideoSize x11;
        TLRPC.UserFull userFull;
        TLRPC.Photo photo;
        if (this.a.getScrollState() != 1 || z10) {
            yu0 yu0Var = this.o0;
            int realPosition = yu0Var != null ? yu0Var.getRealPosition() : 0;
            yu0 yu0Var2 = this.o0;
            org.telegram.messenger.gc gcVar = null;
            org.telegram.messenger.gc G = yu0Var2 != null ? yu0Var2.G(realPosition) : null;
            yu0 yu0Var3 = this.o0;
            TLRPC.Photo F = yu0Var3 != null ? yu0Var3.F(realPosition) : null;
            long j3 = this.e1;
            jv0 jv0Var = this.o5;
            if (j3 == 0) {
                if (this.f1 == 0 || (chatPhoto = (M0 = getMessagesController().M0(Long.valueOf(this.f1))).photo) == null || chatPhoto.photo_big == null) {
                    return;
                }
                PhotoViewer.p1().I2(null, this, null);
                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
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
                PhotoViewer.p1().d2(null, fileLocation3, G, gcVar, null, null, null, 0, jv0Var, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null) {
                return;
            }
            PhotoViewer.p1().I2(null, this, null);
            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
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
            PhotoViewer.p1().d2(null, fileLocation4, G, gcVar, null, null, null, 0, jv0Var, null, 0L, 0L, 0L, true, null, null);
        }
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
    public final void M5() {
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
        ou0 ou0Var;
        org.telegram.ui.Components.hf0 hf0Var;
        org.telegram.ui.Components.cg0 cg0Var;
        int i10;
        long j3;
        boolean z11;
        TLRPC.UserFull userFull;
        boolean z12;
        TLRPC.UserFull userFull2;
        TL_payments.starRefProgram starrefprogram;
        org.telegram.ui.Cells.d6 d6Var;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull5;
        TLRPC.UserFull userFull4;
        TLRPC.ChatFull chatFull6;
        TLRPC.UserFull userFull5;
        TL_bots.BotInfo botInfo;
        TLRPC.UserFull userFull6;
        TLRPC.UserFull userFull7;
        I5(false);
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
        this.d4 = -1;
        this.e4 = -1;
        this.f4 = -1;
        this.g4 = -1;
        this.h4 = -1;
        this.i4 = -1;
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
        this.j4 = -1;
        this.o4 = -1;
        this.botPermissionBiometry = -1;
        this.botPermissionEmojiStatus = -1;
        this.botPermissionLocation = -1;
        this.q4 = -1;
        this.k4 = -1;
        this.l4 = -1;
        this.m4 = -1;
        this.n4 = -1;
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
        this.r4 = -1;
        this.s4 = -1;
        this.N3 = -1;
        this.Z3 = -1;
        this.O3 = -1;
        this.Q3 = -1;
        this.P3 = -1;
        this.S3 = -1;
        this.T3 = -1;
        this.U3 = -1;
        this.t4 = -1;
        this.D3 = -1;
        this.b4 = -1;
        this.c4 = -1;
        this.u4 = -1;
        this.v4 = -1;
        this.w4 = -1;
        this.x4 = -1;
        this.y4 = -1;
        this.z4 = -1;
        this.A4 = -1;
        this.H4 = -1;
        this.I4 = -1;
        this.F4 = -1;
        this.L4 = -1;
        this.R3 = -1;
        this.B4 = -1;
        this.C4 = -1;
        this.D4 = -1;
        this.E4 = -1;
        this.G4 = -1;
        this.J4 = false;
        boolean z13 = true;
        this.K4 = (this.e1 == 0 || (userFull7 = this.w2) == null || userFull7.wallet_card == null || (this.r0 != null && !this.s1)) ? false : true;
        this.M4 = -1;
        this.N4 = -1;
        this.O4 = -1;
        ArrayList arrayList2 = this.S4;
        arrayList2.clear();
        ArrayList arrayList3 = this.T4;
        arrayList3.clear();
        org.telegram.ui.Components.qs0 qs0Var = this.R;
        if (qs0Var != null) {
            int[] iArr = qs0Var.c;
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
                    org.telegram.messenger.oo L0 = org.telegram.messenger.np.s1(this.currentAccount).L0(-j10);
                    if (L0 != null) {
                    }
                }
                if (this.s2) {
                    long j11 = this.e1;
                    if (j11 != 0) {
                        org.telegram.messenger.oo L02 = org.telegram.messenger.np.s1(this.currentAccount).L0(j11);
                        if (L02 != null) {
                        }
                    }
                }
            }
            if (this.e1 == 0) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
                TLRPC.UserFull userFull8 = this.w2;
                if (userFull8 != null && userFull8.saved_music != null && (this.r0 == null || this.s1)) {
                    this.J4 = true;
                }
                if (this.B3 < 0 && this.C3 < 0) {
                    if (this.J4 || this.K4 || this.l6 != null || this.a0 == null) {
                        int i13 = this.O2;
                        this.O2 = i13 + 1;
                        this.C3 = i13;
                    } else {
                        int i14 = this.O2;
                        this.O2 = i14 + 1;
                        this.B3 = i14;
                    }
                }
                if (!org.telegram.messenger.q10.B(a22) || this.s1) {
                    String n10 = org.telegram.messenger.q10.n(a22);
                    TLRPC.UserFull userFull9 = this.w2;
                    boolean z14 = ((userFull9 == null || TextUtils.isEmpty(userFull9.about)) && (a22 == null || TextUtils.isEmpty(n10))) ? false : true;
                    boolean z15 = (a22 == null || (TextUtils.isEmpty(a22.phone) && TextUtils.isEmpty(this.g5))) ? false : true;
                    if (!this.s2 && (userFull3 = this.w2) != null && userFull3.unofficial_security_risk) {
                        int i15 = this.O2;
                        this.k4 = i15;
                        this.O2 = i15 + 2;
                        this.l4 = i15 + 1;
                    }
                    TLRPC.UserFull userFull10 = this.w2;
                    if (userFull10 == null || (userFull10.flags2 & 64) == 0 || ((d6Var = this.x2) != null && d6Var.c && d6Var.d.isEmpty())) {
                        j3 = 0;
                    } else {
                        j3 = 0;
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.w2.personal_channel_id));
                        if (M0 != null && (org.telegram.messenger.t3.t0(M0) || !org.telegram.messenger.t3.r0(M0))) {
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
                    if (a22 != null && n10 != null) {
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
                    if (z16 && a22 != null && a22.bot_has_main_app) {
                        int i25 = this.O2;
                        this.O2 = i25 + 1;
                        this.j4 = i25;
                    }
                    int i26 = this.O2;
                    int i27 = i26 + 1;
                    this.O2 = i27;
                    this.S3 = i26;
                    if (a22 != null && a22.linked_community_id != j3) {
                        this.m4 = i27;
                        this.O2 = i26 + 3;
                        this.n4 = i26 + 2;
                    }
                    if (z16 && (userFull2 = this.w2) != null && (starrefprogram = userFull2.starref_program) != null && (starrefprogram.flags & 2) == 0 && getMessagesController().h6) {
                        int i28 = this.O2;
                        this.T3 = i28;
                        this.O2 = i28 + 2;
                        this.U3 = i28 + 1;
                    }
                    if (this.s2) {
                        if (this.t2 == null && getContext() != null) {
                            this.t2 = ki.s0.e(getContext(), this.currentAccount, this.e1);
                        }
                        if (this.u2 == null && getContext() != null) {
                            this.u2 = ki.r.c(getContext(), this.currentAccount, this.e1);
                        }
                        ki.s0 s0Var = this.t2;
                        boolean z17 = s0Var != null && s0Var.b();
                        ki.r rVar = this.u2;
                        boolean z18 = rVar != null && rVar.a();
                        TLRPC.UserFull userFull13 = this.w2;
                        if (userFull13 == null || !userFull13.bot_can_manage_emoji_status) {
                            if (!ki.i4.d((Activity) getContext(), this.currentAccount, this.e1)) {
                                z12 = false;
                                if (!z12 || z17 || z18) {
                                    int i29 = this.O2;
                                    int i30 = i29 + 1;
                                    this.O2 = i30;
                                    this.o4 = i29;
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
                                    this.q4 = i33;
                                }
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        int i292 = this.O2;
                        int i302 = i292 + 1;
                        this.O2 = i302;
                        this.o4 = i292;
                        if (z12) {
                        }
                        if (z17) {
                        }
                        if (z18) {
                        }
                        int i332 = this.O2;
                        this.O2 = i332 + 1;
                        this.q4 = i332;
                    }
                    TLRPC.EncryptedChat encryptedChat = this.E2;
                    if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                        int i34 = this.O2;
                        this.r4 = i34;
                        this.s4 = i34 + 1;
                        this.O2 = i34 + 3;
                        this.t4 = i34 + 2;
                    }
                    if (a22 != null && !this.s2 && encryptedChat == null && a22.id != getUserConfig().e() && this.k1) {
                        int i35 = this.O2;
                        this.M4 = i35;
                        this.O2 = i35 + 2;
                        this.O4 = i35 + 1;
                    }
                    if (a22 != null && a22.bot) {
                        TLRPC.UserFull userFull14 = this.w2;
                        if (userFull14 != null && userFull14.can_view_revenue && di.e0.g(this.currentAccount).i(this.e1) > j3) {
                            int i36 = this.O2;
                            this.O2 = i36 + 1;
                            this.D4 = i36;
                        }
                        if (di.e0.g(this.currentAccount).c(this.e1).amount > j3 || !di.e0.g(this.currentAccount).k(this.e1).a[0].isEmpty()) {
                            int i37 = this.O2;
                            this.O2 = i37 + 1;
                            this.C4 = i37;
                        }
                    }
                    if (a22 != null && this.s2 && !a22.bot_nochats) {
                        int i38 = this.O2;
                        this.b4 = i38;
                        this.O2 = i38 + 2;
                        this.c4 = i38 + 1;
                    } else if (this.C4 >= 0) {
                        z11 = true;
                        if (!this.s1 && this.f5 && a22 != null && !a22.contact && !a22.bot && !org.telegram.messenger.q10.A(a22.id)) {
                            int i39 = this.O2;
                            this.O2 = i39 + 1;
                            this.a4 = i39;
                            z11 = true;
                        }
                        if (!this.s1 && this.c5 != 0 && this.d5 < j3 && org.telegram.messenger.t3.y(13, getMessagesController().M0(Long.valueOf(-this.d5)))) {
                            int i40 = this.O2;
                            this.O2 = i40 + 1;
                            this.X3 = i40;
                            z11 = true;
                        }
                        if (!this.s1 || this.c5 == 0 || org.telegram.messenger.g5.r(this.currentAccount).x(this.e1)) {
                            z13 = z11;
                        } else {
                            int i41 = this.O2;
                            this.O2 = i41 + 1;
                            this.Y3 = i41;
                        }
                        if (z13) {
                            int i42 = this.O2;
                            this.O2 = i42 + 1;
                            this.Z3 = i42;
                        }
                        if (!z10 || ((a22 != null && a22.bot && a22.bot_can_edit && a22.bot_has_main_app) || (!((userFull = this.w2) == null || userFull.common_chats_count == 0) || this.s1))) {
                            int i43 = this.O2;
                            this.O2 = i43 + 1;
                            this.L4 = i43;
                        } else if (this.O4 == -1 && this.o1) {
                            int i44 = this.O2;
                            this.V3 = i44;
                            this.O2 = i44 + 2;
                            this.O4 = i44 + 1;
                        }
                    }
                    z11 = false;
                    if (!this.s1) {
                        int i392 = this.O2;
                        this.O2 = i392 + 1;
                        this.a4 = i392;
                        z11 = true;
                    }
                    if (!this.s1) {
                        int i402 = this.O2;
                        this.O2 = i402 + 1;
                        this.X3 = i402;
                        z11 = true;
                    }
                    if (this.s1) {
                    }
                    z13 = z11;
                    if (z13) {
                    }
                    if (z10) {
                    }
                    int i432 = this.O2;
                    this.O2 = i432 + 1;
                    this.L4 = i432;
                } else {
                    if (this.K2 == null) {
                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                        if (userProfilePhoto != null) {
                            TLRPC.FileLocation fileLocation = userProfilePhoto.photo_big;
                            if (!(fileLocation instanceof TLRPC.TL_fileLocation_layer97)) {
                            }
                        }
                        yu0 yu0Var = this.o0;
                        if (yu0Var == null || yu0Var.getRealCount() == 0) {
                            int i45 = this.O2;
                            this.P2 = i45;
                            this.O2 = i45 + 2;
                            this.Q2 = i45 + 1;
                        }
                    }
                    int i46 = this.O2;
                    this.T2 = i46;
                    this.U2 = i46 + 1;
                    this.W2 = i46 + 2;
                    this.X2 = i46 + 3;
                    this.O2 = i46 + 5;
                    this.e3 = i46 + 4;
                    Set set = getMessagesController().T3;
                    if (set.contains("PREMIUM_GRACE")) {
                        int i47 = this.O2;
                        this.Z2 = i47;
                        this.O2 = i47 + 2;
                        this.a3 = i47 + 1;
                    } else if (set.contains("VALIDATE_PHONE_NUMBER")) {
                        int i48 = this.O2;
                        this.b3 = i48;
                        this.O2 = i48 + 2;
                        this.Y2 = i48 + 1;
                    } else if (set.contains("VALIDATE_PASSWORD")) {
                        int i49 = this.O2;
                        this.d3 = i49;
                        this.O2 = i49 + 2;
                        this.c3 = i49 + 1;
                    }
                    int i50 = this.O2;
                    this.f3 = i50;
                    this.k3 = i50 + 1;
                    this.i3 = i50 + 2;
                    this.g3 = i50 + 3;
                    this.j3 = i50 + 4;
                    this.O2 = i50 + 6;
                    this.m3 = i50 + 5;
                    if (getMessagesController().F3 || !getMessagesController().Q0.isEmpty()) {
                        int i51 = this.O2;
                        this.O2 = i51 + 1;
                        this.l3 = i51;
                    }
                    int i52 = this.O2;
                    this.o3 = i52;
                    this.h3 = i52 + 1;
                    this.O2 = i52 + 3;
                    this.p3 = i52 + 2;
                    if (!getMessagesController().D3()) {
                        int i53 = this.O2;
                        this.O2 = i53 + 1;
                        this.d4 = i53;
                    }
                    if (getMessagesController().V4()) {
                        int i54 = this.O2;
                        this.O2 = i54 + 1;
                        this.e4 = i54;
                    }
                    di.u8.y(this.currentAccount, true).p();
                    org.telegram.messenger.t0.n();
                    int i55 = this.O2;
                    this.O2 = i55 + 1;
                    this.f4 = i55;
                    if (!getMessagesController().D3()) {
                        int i56 = this.O2;
                        this.O2 = i56 + 1;
                        this.g4 = i56;
                    }
                    if (!getMessagesController().i7) {
                        int i57 = this.O2;
                        this.O2 = i57 + 1;
                        this.h4 = i57;
                    }
                    if (this.d4 >= 0 || this.e4 >= 0 || this.f4 >= 0 || this.g4 >= 0 || this.h4 >= 0) {
                        int i58 = this.O2;
                        this.O2 = i58 + 1;
                        this.i4 = i58;
                    }
                    int i59 = this.O2;
                    this.q3 = i59;
                    this.r3 = i59 + 1;
                    this.s3 = i59 + 2;
                    int i60 = i59 + 4;
                    this.O2 = i60;
                    this.t3 = i59 + 3;
                    boolean z19 = org.telegram.messenger.r2.a;
                    if (z19) {
                        this.u3 = i60;
                        this.O2 = i59 + 6;
                        this.v3 = i59 + 5;
                    }
                    if (z19) {
                        int i61 = this.O2;
                        this.w3 = i61;
                        this.x3 = i61 + 1;
                        this.O2 = i61 + 3;
                        this.y3 = i61 + 2;
                    }
                    int i62 = this.O2;
                    this.z3 = i62;
                    this.O2 = i62 + 2;
                    this.A3 = i62 + 1;
                }
            } else if (this.q1) {
                if (this.B3 < 0 && this.C3 < 0) {
                    if (this.J4 || this.K4 || this.l6 != null || this.a0 == null) {
                        int i63 = this.O2;
                        this.O2 = i63 + 1;
                        this.C3 = i63;
                    } else {
                        int i64 = this.O2;
                        this.O2 = i64 + 1;
                        this.B3 = i64;
                    }
                }
                int i65 = this.O2;
                int i66 = i65 + 1;
                this.O2 = i66;
                this.M3 = i65;
                if (this.a0 == null) {
                    this.O2 = i65 + 2;
                    this.R3 = i66;
                }
                int i67 = this.O2;
                int i68 = i67 + 1;
                this.O2 = i68;
                this.S3 = i67;
                if (z10) {
                    this.O2 = i67 + 2;
                    this.L4 = i68;
                }
            } else if (this.f1 != 0) {
                TLRPC.ChatFull chatFull7 = this.v2;
                if ((chatFull7 != null && (!TextUtils.isEmpty(chatFull7.about) || (this.v2.location instanceof TLRPC.TL_channelLocation))) || org.telegram.messenger.t3.t0(this.F2)) {
                    if (this.B3 < 0 && this.C3 < 0) {
                        if (this.J4 || this.K4 || this.l6 != null || this.a0 == null) {
                            int i69 = this.O2;
                            this.O2 = i69 + 1;
                            this.C3 = i69;
                        } else {
                            int i70 = this.O2;
                            this.O2 = i70 + 1;
                            this.B3 = i70;
                        }
                    }
                    if (this.a0 == null) {
                        int i71 = this.O2;
                        this.O2 = i71 + 1;
                        this.E3 = i71;
                    }
                    TLRPC.ChatFull chatFull8 = this.v2;
                    if (chatFull8 != null) {
                        if (!TextUtils.isEmpty(chatFull8.about)) {
                            int i72 = this.O2;
                            this.O2 = i72 + 1;
                            this.L3 = i72;
                        }
                        if (this.v2.location instanceof TLRPC.TL_channelLocation) {
                            int i73 = this.O2;
                            this.O2 = i73 + 1;
                            this.J3 = i73;
                        }
                    }
                    if (org.telegram.messenger.t3.t0(this.F2)) {
                        int i74 = this.O2;
                        this.O2 = i74 + 1;
                        this.M3 = i74;
                    }
                }
                if (this.B3 < 0 && this.C3 < 0) {
                    if (this.J4 || this.K4 || this.l6 != null || this.a0 == null) {
                        int i75 = this.O2;
                        this.O2 = i75 + 1;
                        this.C3 = i75;
                    } else {
                        int i76 = this.O2;
                        this.O2 = i76 + 1;
                        this.B3 = i76;
                    }
                }
                if (this.a0 == null) {
                    if (this.E3 != -1) {
                        int i77 = this.O2;
                        this.O2 = i77 + 1;
                        this.N3 = i77;
                    }
                    int i78 = this.O2;
                    this.O2 = i78 + 1;
                    this.O3 = i78;
                }
                int i79 = this.O2;
                if (i79 > 0) {
                    this.O2 = i79 + 1;
                    this.S3 = i79;
                }
                TLRPC.Chat chat = this.F2;
                if (chat != null && chat.linked_community_id != 0) {
                    int i80 = this.O2;
                    this.m4 = i80;
                    this.O2 = i80 + 2;
                    this.n4 = i80 + 1;
                }
                if (org.telegram.messenger.t3.T(chat)) {
                    TLRPC.Chat chat2 = this.F2;
                    if (!chat2.megagroup) {
                        TLRPC.ChatFull chatFull9 = this.v2;
                        if (chatFull9 != null && (chat2.creator || chatFull9.can_view_participants)) {
                            if (this.a0 == null) {
                                int i81 = this.O2;
                                this.O2 = i81 + 1;
                                this.u4 = i81;
                            }
                            int i82 = this.O2;
                            int i83 = i82 + 1;
                            this.O2 = i83;
                            this.y4 = i82;
                            if (chatFull9.requests_pending > 0) {
                                this.O2 = i82 + 2;
                                this.z4 = i83;
                            }
                            int i84 = this.O2;
                            int i85 = i84 + 1;
                            this.O2 = i85;
                            this.A4 = i84;
                            if (chatFull9.banned_count != 0 || chatFull9.kicked_count != 0) {
                                this.O2 = i84 + 2;
                                this.H4 = i85;
                            }
                            if ((chatFull9.can_view_stars_revenue && (di.e0.g(this.currentAccount).c(-this.f1).amount > 0 || !di.e0.g(this.currentAccount).k(-this.f1).a[0].isEmpty())) || ((chatFull4 = this.v2) != null && chatFull4.can_view_revenue && di.e0.g(this.currentAccount).i(-this.f1) > 0)) {
                                int i86 = this.O2;
                                this.O2 = i86 + 1;
                                this.E4 = i86;
                            }
                            int i87 = this.O2;
                            this.B4 = i87;
                            this.O2 = i87 + 2;
                            this.F4 = i87 + 1;
                        }
                        if (org.telegram.messenger.t3.T(this.F2)) {
                            TLRPC.ChatFull chatFull10 = this.v2;
                            if (chatFull10 != null) {
                                if (this.q1 || (chatParticipants = chatFull10.participants) == null || chatParticipants.participants == null || (chatParticipants instanceof TLRPC.TL_chatParticipantsForbidden)) {
                                    if (!org.telegram.messenger.t3.r0(this.F2) && org.telegram.messenger.t3.w(3, this.F2) && this.v2.participants_hidden) {
                                        int i88 = this.O2;
                                        this.x4 = i88;
                                        this.O2 = i88 + 2;
                                        this.I4 = i88 + 1;
                                    }
                                    uv0 uv0Var = this.O;
                                    if (uv0Var != null) {
                                        uv0Var.E1();
                                    }
                                } else {
                                    if (org.telegram.messenger.t3.w(3, this.F2) || (tL_chatBannedRights = this.F2.default_banned_rights) == null || !tL_chatBannedRights.invite_users) {
                                        int i89 = this.O2;
                                        this.O2 = i89 + 1;
                                        this.x4 = i89;
                                    }
                                    if (this.v2.participants.participants.size() <= 5 || !z10) {
                                        if (this.x4 == -1 && this.a0 == null) {
                                            int i90 = this.O2;
                                            this.O2 = i90 + 1;
                                            this.u4 = i90;
                                        }
                                        int i91 = this.O2;
                                        this.v4 = i91;
                                        int size = this.v2.participants.participants.size() + i91;
                                        this.w4 = size;
                                        this.O2 = size + 1;
                                        this.I4 = size;
                                        arrayList2.addAll(this.v2.participants.participants);
                                        ArrayList arrayList4 = this.D2;
                                        if (arrayList4 != null) {
                                            arrayList3.addAll(arrayList4);
                                        }
                                        uv0 uv0Var2 = this.O;
                                        if (uv0Var2 != null) {
                                            uv0Var2.m1(null, null);
                                        }
                                    } else {
                                        if (this.x4 != -1) {
                                            int i92 = this.O2;
                                            this.O2 = i92 + 1;
                                            this.I4 = i92;
                                        }
                                        uv0 uv0Var3 = this.O;
                                        if (uv0Var3 != null) {
                                            uv0Var3.m1(this.D2, this.v2);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (this.q1 || (chatFull3 = this.v2) == null || !this.F2.megagroup || (chatParticipants2 = chatFull3.participants) == null || (arrayList = chatParticipants2.participants) == null || arrayList.isEmpty()) {
                                if (!org.telegram.messenger.t3.r0(this.F2) && org.telegram.messenger.t3.w(3, this.F2) && (chatFull2 = this.v2) != null && chatFull2.participants_hidden) {
                                    int i93 = this.O2;
                                    this.x4 = i93;
                                    this.O2 = i93 + 2;
                                    this.I4 = i93 + 1;
                                }
                                uv0 uv0Var4 = this.O;
                                if (uv0Var4 != null) {
                                    uv0Var4.E1();
                                }
                            } else {
                                if (!org.telegram.messenger.t3.r0(this.F2) && org.telegram.messenger.t3.w(3, this.F2) && this.v2.participants_count < getMessagesController().Y2) {
                                    int i94 = this.O2;
                                    this.O2 = i94 + 1;
                                    this.x4 = i94;
                                }
                                int size2 = this.v2.participants.participants.size();
                                if ((size2 <= 5 || !z10 || this.U4 == 1) && this.U4 != 2) {
                                    if (this.x4 == -1 && this.a0 == null) {
                                        int i95 = this.O2;
                                        this.O2 = i95 + 1;
                                        this.u4 = i95;
                                    }
                                    int i96 = this.O2;
                                    this.v4 = i96;
                                    int i97 = i96 + size2;
                                    this.w4 = i97;
                                    this.O2 = i97 + 1;
                                    this.I4 = i97;
                                    arrayList2.addAll(this.v2.participants.participants);
                                    ArrayList arrayList5 = this.D2;
                                    if (arrayList5 != null) {
                                        arrayList3.addAll(arrayList5);
                                    }
                                    this.U4 = 1;
                                    uv0 uv0Var5 = this.O;
                                    if (uv0Var5 != null) {
                                        uv0Var5.m1(null, null);
                                    }
                                } else {
                                    if (this.x4 != -1) {
                                        int i98 = this.O2;
                                        this.O2 = i98 + 1;
                                        this.I4 = i98;
                                    }
                                    if (this.O != null) {
                                        if (!this.D2.isEmpty()) {
                                            this.U4 = 2;
                                        }
                                        this.O.m1(this.D2, this.v2);
                                    }
                                }
                            }
                            if (this.O4 == -1) {
                                TLRPC.Chat chat3 = this.F2;
                                if (chat3.left && !chat3.kicked) {
                                    long j12 = org.telegram.messenger.np.x1(this.currentAccount).getLong("dialog_join_requested_time_" + this.i1, -1L);
                                    if (j12 <= 0 || System.currentTimeMillis() - j12 >= 120000) {
                                        org.telegram.ui.Components.hf0 hf0Var2 = this.a0;
                                        if (hf0Var2 == null || !hf0Var2.f()) {
                                            int i99 = this.O2;
                                            this.N4 = i99;
                                            this.O2 = i99 + 2;
                                            this.O4 = i99 + 1;
                                        }
                                        if (z10) {
                                            int i100 = this.O2;
                                            this.O2 = i100 + 1;
                                            this.L4 = i100;
                                        }
                                        if (this.L4 == -1) {
                                            int i101 = this.O2;
                                            this.O2 = i101 + 1;
                                            this.D3 = i101;
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
                                            ou0Var = this.a;
                                            if (ou0Var != null) {
                                                ou0Var.setTranslateSelectorPosition(this.P3);
                                            }
                                            hf0Var = this.a0;
                                            if (hf0Var != null) {
                                                hf0Var.o(7, z13);
                                            }
                                            cg0Var = this.c0;
                                            if (cg0Var != null) {
                                                TLRPC.UserFull userFull15 = this.w2;
                                                if (userFull15 != null) {
                                                    cg0Var.setMusicDocument(userFull15.saved_music);
                                                }
                                                this.c0.setVisibility(this.J4 ? 0 : 8);
                                                if (this.K4) {
                                                    this.d0.setBalance(this.w2.wallet_card.balance);
                                                }
                                                this.d0.setVisibility(this.K4 ? 0 : 8);
                                                this.c0.invalidate();
                                                this.d0.invalidate();
                                                return;
                                            }
                                            return;
                                        }
                                        this.D0 = 0;
                                        ou0Var = this.a;
                                        if (ou0Var != null) {
                                        }
                                        hf0Var = this.a0;
                                        if (hf0Var != null) {
                                        }
                                        cg0Var = this.c0;
                                        if (cg0Var != null) {
                                        }
                                    }
                                }
                            }
                        }
                        z13 = false;
                        if (z10) {
                        }
                        if (this.L4 == -1) {
                        }
                        if (this.actionBar != null) {
                        }
                        if (this.a != null) {
                            i10 = this.F0;
                            if (i10 != 0) {
                            }
                            ou0Var = this.a;
                            if (ou0Var != null) {
                            }
                            hf0Var = this.a0;
                            if (hf0Var != null) {
                            }
                            cg0Var = this.c0;
                            if (cg0Var != null) {
                            }
                        }
                        this.D0 = 0;
                        ou0Var = this.a;
                        if (ou0Var != null) {
                        }
                        hf0Var = this.a0;
                        if (hf0Var != null) {
                        }
                        cg0Var = this.c0;
                        if (cg0Var != null) {
                        }
                    }
                }
                TLRPC.ChatFull chatFull11 = this.v2;
                if ((chatFull11 != null && chatFull11.can_view_stars_revenue && (di.e0.g(this.currentAccount).c(-this.f1).amount > 0 || !di.e0.g(this.currentAccount).k(-this.f1).a[0].isEmpty())) || ((chatFull = this.v2) != null && chatFull.can_view_revenue && di.e0.g(this.currentAccount).i(-this.f1) > 0)) {
                    int i102 = this.O2;
                    this.E4 = i102;
                    this.O2 = i102 + 2;
                    this.F4 = i102 + 1;
                }
                if (org.telegram.messenger.t3.T(this.F2)) {
                }
                z13 = false;
                if (z10) {
                }
                if (this.L4 == -1) {
                }
                if (this.actionBar != null) {
                }
                if (this.a != null) {
                }
                this.D0 = 0;
                ou0Var = this.a;
                if (ou0Var != null) {
                }
                hf0Var = this.a0;
                if (hf0Var != null) {
                }
                cg0Var = this.c0;
                if (cg0Var != null) {
                }
            }
            z13 = false;
            if (this.L4 == -1) {
            }
            if (this.actionBar != null) {
            }
            if (this.a != null) {
            }
            this.D0 = 0;
            ou0Var = this.a;
            if (ou0Var != null) {
            }
            hf0Var = this.a0;
            if (hf0Var != null) {
            }
            cg0Var = this.c0;
            if (cg0Var != null) {
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
        if (this.L4 == -1) {
        }
        if (this.actionBar != null) {
        }
        if (this.a != null) {
        }
        this.D0 = 0;
        ou0Var = this.a;
        if (ou0Var != null) {
        }
        hf0Var = this.a0;
        if (hf0Var != null) {
        }
        cg0Var = this.c0;
        if (cg0Var != null) {
        }
    }

    public final void N3() {
        v4.e1 e1Var;
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
            ou0 ou0Var = this.a;
            View F = ou0Var.F(view);
            e1Var = (org.telegram.ui.Components.cj0) (F != null ? ou0Var.T(F) : null);
        }
        int top = view == null ? 0 : view.getTop();
        int i10 = (top < 0 || (e1Var != null ? e1Var.b() : -1) != 0) ? 0 : top;
        float a10 = view == null ? 1.0f : c8.i9.a((-top) / org.telegram.messenger.g0.L(12.0f), 0.0f, 1.0f);
        if (this.P5 != a10) {
            this.P5 = a10;
            C5();
        }
        int i11 = 1;
        boolean z10 = this.r0 == null && this.actionBar.o0;
        int i12 = this.L4;
        if (i12 != -1 && !z10) {
            org.telegram.ui.Components.cj0 cj0Var = (org.telegram.ui.Components.cj0) this.a.K(i12);
            z10 = cj0Var != null && cj0Var.a.getTop() <= 0;
        }
        if (this.V5 != z10) {
            this.V5 = z10;
            O3();
            AnimatorSet animatorSet = this.S5;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.T5;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            E5(true);
            K5();
            O5(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.actionBar, this.W5, z10 ? 1.0f : 0.0f));
            this.O.L0.setOpen(z10);
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this, this.n5, 0.0f));
            }
            if (this.v0 != null || this.w0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new zt0(this, 3));
                arrayList.add(ofFloat);
            }
            Q3();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.S5 = animatorSet3;
            animatorSet3.playTogether(arrayList);
            this.S5.setInterpolator(org.telegram.ui.Components.er.f);
            this.S5.addListener(new bv0(this, i11));
            this.S5.setDuration(150L);
            this.S5.start();
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.r4, Boolean.TRUE);
        }
        float f10 = i10;
        if (this.Q1 == f10 || this.H1) {
            return;
        }
        this.Q1 = f10;
        this.d1.invalidate();
        if (this.J1 != 0) {
            this.M1 = this.Q1 > ((float) d4());
        }
        A4(true);
    }

    public final void N4() {
        TLRPC.User a22;
        if (this.e1 == 0 || b4() || (a22 = getMessagesController().a2(Long.valueOf(this.e1))) == null || (a22 instanceof TLRPC.TL_userEmpty)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.e1);
        if (getMessagesController().E(bundle, this, null, null)) {
            boolean z10 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
            if (!org.telegram.messenger.g0.Q1() && z10) {
                org.telegram.messenger.ns notificationCenter = getNotificationCenter();
                int i7 = org.telegram.messenger.ns.t;
                notificationCenter.n(this, i7);
                getNotificationCenter().k(i7, new Object[0]);
            }
            int i10 = getArguments().getInt("nearby_distance", -1);
            if (i10 >= 0) {
                bundle.putInt("nearby_distance", i10);
            }
            an anVar = new an(bundle);
            org.telegram.messenger.si mediaDataController = getMediaDataController();
            TLRPC.Document document = mediaDataController.z0;
            mediaDataController.n1();
            anVar.X9 = document;
            anVar.Y9 = false;
            presentFragment(anVar, z10);
            if (!org.telegram.messenger.g0.Q1() || this.J0) {
                return;
            }
            finishFragment();
        }
    }

    public final void N5() {
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

    @Override // org.telegram.ui.Components.l30
    public final void O(boolean z10, boolean z11) {
        org.telegram.ui.Cells.b4 b4Var = this.h0;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(0.0f);
    }

    public final void O3() {
        uv0 uv0Var = this.O;
        if (uv0Var != null) {
            uv0Var.setPagesVisibleOverscanTop((this.V5 || this.U5 > 0.0f) ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0);
        }
    }

    public final void O4() {
        TLRPC.ChatFull chatFull = this.v2;
        if (chatFull == null || chatFull.linked_chat_id == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.v2.linked_chat_id);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new an(bundle));
        }
    }

    public final void O5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        if ((this.v0 == null && this.w0 == null) || (kVar = this.actionBar) == null || this.simpleActionBar == null) {
            return;
        }
        float f10 = kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0.0f;
        int L = org.telegram.messenger.g0.L(7.0f);
        float right = this.simpleActionBar.getBackButton().getRight() + L;
        float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
        av0 av0Var = this.v0;
        if (av0Var != null) {
            float A = com.google.android.gms.internal.vision.e2.A(this.actionBar.getHeight(), f10, 2.0f, f10);
            boolean z11 = Math.abs(right - av0Var.g0) > 0.1f || Math.abs(menuPillLeft - av0Var.h0) > 0.1f || Math.abs(A - av0Var.i0) > 0.1f;
            av0Var.g0 = right;
            av0Var.h0 = menuPillLeft;
            if (z10) {
                av0Var.n0.e(true, menuPillLeft);
            }
            av0Var.i0 = A;
            if (z11) {
                av0Var.invalidate();
            }
        }
        di.u0 u0Var = this.w0;
        if (u0Var != null) {
            float A2 = com.google.android.gms.internal.vision.e2.A(this.actionBar.getHeight(), f10, 2.0f, f10);
            int j42 = j4();
            boolean z12 = Math.abs(right - u0Var.r) > 0.1f || Math.abs(menuPillLeft - u0Var.s) > 0.1f || Math.abs(A2 - u0Var.w) > 0.1f;
            u0Var.r = right;
            u0Var.s = menuPillLeft;
            if (z10) {
                u0Var.E.e(true, menuPillLeft);
            }
            u0Var.w = A2;
            u0Var.y = j42 + A2;
            if (z12) {
                u0Var.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.sw
    public final /* synthetic */ boolean P(yw ywVar) {
        return false;
    }

    public final void P3() {
        int i7 = this.J1;
        float f10 = 0.0f;
        if (i7 == 1 && (!this.p5 || this.G1)) {
            this.v6 = 0.0f;
        } else if (i7 == 2 && (!this.p5 || this.G1)) {
            zu0 zu0Var = this.r;
            this.v6 = zu0Var == null ? 0.0f : zu0Var.getAlpha();
        } else if (this.e1 == org.telegram.messenger.m10.i(this.currentAccount).n) {
            this.v6 = (1.0f - this.r5) * this.l2;
        } else {
            this.v6 = this.l2 * this.r5;
        }
        boolean z10 = this.e1 == org.telegram.messenger.m10.i(this.currentAccount).n;
        if (z10 && this.t5) {
            this.s5 = org.telegram.messenger.g0.L(28.0f) * this.v6;
            zu0 zu0Var2 = this.r;
            if (zu0Var2 != null) {
                zu0Var2.setTranslationX(l4(this.z6, this.B6));
                this.Z.invalidate();
            }
        }
        if (z10) {
            if (this.t5) {
                f10 = this.l2;
            }
        } else if (this.u5) {
            f10 = this.v6;
        }
        tw0 tw0Var = this.D6;
        if (tw0Var != null) {
            tw0Var.e = 1.0f - f10;
            tw0Var.invalidateSelf();
        }
        this.y6 = f10 > 0.5f;
        K5();
    }

    public final void P4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.w2;
        if (userFull == null || (tL_businessLocation = userFull.business_location) == null) {
            return;
        }
        int i7 = 1;
        if (tL_businessLocation.geo_point == null || z10) {
            boolean z11 = org.telegram.messenger.r2.a;
            org.telegram.messenger.t0.r();
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?q=" + this.w2.business_location.address, new Object[0]))));
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        fi.i8 i8Var = new fi.i8(3, i7);
        i8Var.setResourceProvider(this.A0);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.local_id = -1;
        tL_message.peer_id = getMessagesController().z1(a());
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_businessLocation tL_businessLocation2 = this.w2.business_location;
        tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
        tL_messageMediaGeo.address = tL_businessLocation2.address;
        tL_message.media = tL_messageMediaGeo;
        i8Var.Q0 = false;
        i8Var.G0(new org.telegram.messenger.gj(org.telegram.messenger.m10.t0, tL_message, false, false));
        presentFragment(i8Var);
    }

    public final void P5() {
        try {
            rv rvVar = this.U;
            if (rvVar != null && (rvVar.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.U.getForeground()).setColor(i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.A0), 100));
            }
            float f10 = this.U5;
            Drawable drawable = this.E;
            int[] iArr = this.W6;
            if (drawable != null) {
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.qi, this.A0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fj, this.A0));
                int i7 = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (S0 != i7) {
                    drawable.setColorFilter(new PorterDuffColorFilter(S0, mode));
                }
                iArr[6] = S0;
            }
            Drawable drawable2 = this.S6;
            if (drawable2 != null) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.V6, this.A0);
                int i10 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (w02 != i10) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
                }
                iArr[3] = w02;
            }
            Drawable drawable3 = this.T6;
            if (drawable3 != null) {
                int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.v8, this.A0);
                int i11 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (w03 != i11) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(w03, mode3));
                }
                iArr[4] = w03;
            }
            Drawable drawable4 = this.U6;
            if (drawable4 != null) {
                int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, this.A0);
                int i12 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (w04 != i12) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(w04, mode4));
                }
                iArr[5] = w04;
            }
            org.telegram.ui.Components.eq eqVar = this.V6;
            if (eqVar != null) {
                eqVar.y = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.nk, this.A0);
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

    public final void Q3() {
        org.telegram.ui.Components.mu0 mu0Var = this.T;
        if (mu0Var != null) {
            mu0Var.setVisibility(!this.V5 && this.b6);
        }
    }

    public final void Q4(int i7, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        gv0 gv0Var = new gv0(this, user.id, this.f1, tL_chatAdminRights, this.F2.default_banned_rights, tL_chatBannedRights, str, i7, zArr, user);
        gv0Var.Y0 = new hv0(this, i7, chatParticipant, z10, zArr);
        presentFragment(gv0Var);
    }

    public final void Q5() {
        TLRPC.UserFull userFull;
        if (this.Y0 == null) {
            return;
        }
        org.telegram.messenger.g0.Y3(this.Y0, this.E2 == null && (((userFull = this.w2) != null && userFull.ttl_period > 0) || (this.v2 != null && org.telegram.messenger.t3.y(13, this.F2) && this.v2.ttl_period > 0)), 0.8f, true, this.p5);
    }

    @Override // org.telegram.ui.Components.rs0
    public final void R() {
        org.telegram.ui.Components.qs0 qs0Var;
        uv0 uv0Var = this.O;
        if (uv0Var != null && (qs0Var = this.R) != null) {
            uv0Var.setNewMediaCounts(qs0Var.c);
        }
        if (this.d != null) {
            G5(false, false);
        }
        W();
        if (this.w2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x03de, code lost:
    
        if (org.telegram.messenger.t3.q0(r1, org.telegram.messenger.np.s1(r1).r7.f(r2.id, r13)) != false) goto L171;
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
        int i7;
        org.telegram.ui.Components.hf0 hf0Var;
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
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                this.p1 = false;
                if (this.g1 == 0 && org.telegram.messenger.t3.w(1, M0)) {
                    S3(context);
                }
                if (org.telegram.messenger.t3.T(M0)) {
                    if (this.q1) {
                        int i10 = this.currentAccount;
                        long j10 = this.g1;
                        if (!org.telegram.messenger.t3.y(15, M0)) {
                            if (M0 != null && M0.forum) {
                            }
                        }
                        this.O0 = true;
                    } else if (org.telegram.messenger.t3.N(M0) || (M0.megagroup && org.telegram.messenger.t3.w(1, M0))) {
                        this.O0 = true;
                    }
                    if (this.v2 != null) {
                        if (org.telegram.messenger.t3.w(14, M0) && this.v2.call == null) {
                            this.T0.e(15, R.drawable.msg_voicechat, (!M0.megagroup || M0.gigagroup) ? org.telegram.messenger.hd.M0(2131744904, null) : org.telegram.messenger.hd.M0(2131744902, null));
                            this.p1 = true;
                            if (!M0.megagroup || M0.gigagroup) {
                                z24 = false;
                                z21 = true;
                                chatFull2 = this.v2;
                                if ((!chatFull2.can_view_stats || chatFull2.can_view_revenue || chatFull2.can_view_stars_revenue || getMessagesController().P1().j(a())) && this.g1 == 0) {
                                    this.T0.e(19, R.drawable.msg_stats, org.telegram.messenger.hd.M0(2131744892, null));
                                }
                                org.telegram.messenger.r3 g12 = getMessagesController().g1(this.f1, false, null);
                                this.M0 = g12 == null;
                                z20 = g12 == null || z24;
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
                        this.T0.e(19, R.drawable.msg_stats, org.telegram.messenger.hd.M0(2131744892, null));
                        org.telegram.messenger.r3 g122 = getMessagesController().g1(this.f1, false, null);
                        this.M0 = g122 == null;
                        if (g122 == null) {
                        }
                    } else {
                        z20 = false;
                        z21 = false;
                    }
                    getMessagesController().P1();
                    if (M0 == null || !org.telegram.messenger.t3.R(M0) || (!M0.creator && ((tL_chatAdminRights2 = M0.admin_rights) == null || !tL_chatAdminRights2.post_stories))) {
                        getMessagesController().P1();
                        if (M0 != null && org.telegram.messenger.t3.R(M0) && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.edit_stories))) {
                            this.T0.e(39, R.drawable.msg_archive, org.telegram.messenger.hd.M0(2131747810, null));
                        }
                        z22 = false;
                    } else {
                        this.T0.e(39, R.drawable.msg_archive, org.telegram.messenger.hd.M0(2131747810, null));
                        z22 = true;
                    }
                    if (!M0.megagroup) {
                        if (org.telegram.messenger.t3.t0(M0)) {
                            this.T0.e(10, R.drawable.msg_share, org.telegram.messenger.hd.M0(2131752982, null));
                            z12 = !M0.creator;
                        } else {
                            z12 = false;
                        }
                        boolean z29 = org.telegram.messenger.r2.a;
                        if (getMessagesController().i7) {
                            z23 = false;
                        } else {
                            di.u8.y(this.currentAccount, false).U();
                            this.T0.e(38, R.drawable.msg_gift_premium, org.telegram.messenger.hd.M0(2131746636, null));
                            org.telegram.ui.ActionBar.d5 d5Var = this.T0;
                            TLRPC.ChatFull chatFull3 = this.v2;
                            d5Var.R(38, chatFull3 != null && chatFull3.stargifts_available);
                            z23 = true;
                        }
                        TLRPC.ChatFull chatFull4 = this.v2;
                        if (chatFull4 == null || chatFull4.linked_chat_id == 0) {
                            z15 = false;
                        } else {
                            this.T0.e(22, R.drawable.msg_discussion, org.telegram.messenger.hd.M0(2131743555, null));
                            z15 = true;
                        }
                        if (this.g1 == 0) {
                            this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.M0(2131754390, null));
                        }
                        TLRPC.Chat chat = this.F2;
                        if (chat.creator) {
                            this.T0.a(-1);
                            this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131749004, null));
                            this.T0.e(45, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131752422, null)).c(org.telegram.ui.ActionBar.j6.q7, org.telegram.ui.ActionBar.j6.p7);
                        } else if (chat.left || chat.kicked) {
                            z17 = z23;
                            z16 = z21;
                            z13 = z22;
                            z28 = false;
                            z14 = z20;
                        } else {
                            this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131749004, null));
                        }
                        z17 = z23;
                        z16 = z21;
                        z13 = z22;
                        z28 = false;
                        z14 = z20;
                        z11 = true;
                        if (this.r0 == null) {
                        }
                        if (v4()) {
                        }
                        if (this.e1 != 0) {
                            org.telegram.ui.ActionBar.z0 e10 = this.T0.e(24, R.drawable.msg_report, org.telegram.messenger.hd.M0(2131746231, null));
                            int i11 = org.telegram.ui.ActionBar.j6.p7;
                            e10.c(i11, i11);
                        }
                        if (z28) {
                            this.T0.e(31, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131748743, null));
                        }
                        if (!this.q2) {
                        }
                        this.L0 = this.M0;
                        hf0Var = this.a0;
                        if (hf0Var == null) {
                        }
                        E5(z10);
                        O5(z25);
                    }
                    TLRPC.ChatFull chatFull5 = this.v2;
                    if (chatFull5 == null || !chatFull5.participants_hidden || org.telegram.messenger.t3.N(M0)) {
                        this.A1 = true;
                        this.T0.e(17, R.drawable.msg_search, org.telegram.messenger.hd.M0(2131745757, null));
                    }
                    if (this.q1) {
                        int i12 = this.currentAccount;
                        long j11 = this.g1;
                        if (j11 != 1 && org.telegram.messenger.t3.e(i12, M0, org.telegram.messenger.np.s1(i12).r7.f(M0.id, j11))) {
                            this.T0.e(23, R.drawable.msg_delete, org.telegram.messenger.hd.K0(1, "DeleteTopics"));
                        }
                    }
                    if (this.g1 == 0) {
                        this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.M0(2131754390, null));
                    }
                    if (M0.creator) {
                        this.T0.a(-1);
                        this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131748991, null));
                        this.T0.e(45, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751530, null)).c(org.telegram.ui.ActionBar.j6.q7, org.telegram.ui.ActionBar.j6.p7);
                    } else if (M0.left || M0.kicked || this.q1) {
                        z16 = z21;
                        z13 = z22;
                        z12 = false;
                        z28 = false;
                        z15 = false;
                        z17 = false;
                        z14 = z20;
                    } else {
                        this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131748991, null));
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
                        this.T0.e(33, R.drawable.msg_openprofile, org.telegram.messenger.hd.M0(2131745542, null));
                        i7 = 21;
                        this.T0.e(21, R.drawable.msg_gallery, org.telegram.messenger.hd.M0(2131745929, null));
                        this.T0.e(35, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751598, null));
                    } else {
                        i7 = 21;
                        this.T0.e(21, R.drawable.msg_gallery, org.telegram.messenger.hd.M0(2131745929, null));
                    }
                    if (v4()) {
                        this.T0.u(i7);
                    }
                    if (this.e1 != 0 && !this.s2 && !this.s1) {
                        org.telegram.ui.ActionBar.z0 e102 = this.T0.e(24, R.drawable.msg_report, org.telegram.messenger.hd.M0(2131746231, null));
                        int i112 = org.telegram.ui.ActionBar.j6.p7;
                        e102.c(i112, i112);
                    }
                    if (z28 && !this.s1) {
                        this.T0.e(31, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131748743, null));
                    }
                    if (!this.q2) {
                        this.T0.u(21);
                        this.T0.u(33);
                        this.T0.T(36);
                        this.T0.u(34);
                        this.T0.u(35);
                    }
                    this.L0 = this.M0;
                    hf0Var = this.a0;
                    if (hf0Var == null) {
                        hf0Var.G = true;
                        hf0Var.o(4, z12);
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
                                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.f1));
                                    if (org.telegram.messenger.t3.c0(M02) || org.telegram.messenger.t3.n0(M02)) {
                                        z25 = false;
                                        this.a0.o(0, true);
                                    } else if (!org.telegram.messenger.t3.T(M02)) {
                                        z25 = false;
                                        this.a0.o(0, true);
                                    }
                                }
                                z25 = false;
                            }
                        }
                        org.telegram.ui.Components.hf0 hf0Var2 = this.a0;
                        if (hf0Var2.G) {
                            hf0Var2.G = z25;
                            hf0Var2.d();
                        }
                    } else {
                        z25 = false;
                    }
                    E5(z10);
                    O5(z25);
                }
                if (this.v2 != null) {
                    if (org.telegram.messenger.t3.w(14, M0) && this.v2.call == null) {
                        this.T0.e(15, R.drawable.msg_voicechat, org.telegram.messenger.hd.M0(2131744902, null));
                        this.p1 = true;
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    org.telegram.messenger.r3 g13 = getMessagesController().g1(this.f1, false, null);
                    this.M0 = g13 != null;
                    if (g13 != null || z19) {
                        z18 = true;
                        if (org.telegram.messenger.t3.w(1, M0)) {
                            this.O0 = true;
                        }
                        if (!org.telegram.messenger.t3.k0(M0) && !org.telegram.messenger.t3.l0(M0) && ((chatFull = this.v2) == null || !chatFull.participants_hidden || org.telegram.messenger.t3.N(M0))) {
                            this.A1 = true;
                            this.T0.e(17, R.drawable.msg_search, org.telegram.messenger.hd.M0(2131745757, null));
                        }
                        if (this.g1 == 0) {
                            this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.M0(2131754390, null));
                        }
                        this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131751573, null));
                        z14 = z18;
                        z11 = true;
                        z12 = false;
                        z13 = false;
                    }
                }
                z18 = false;
                if (org.telegram.messenger.t3.w(1, M0)) {
                }
                if (!org.telegram.messenger.t3.k0(M0)) {
                    this.A1 = true;
                    this.T0.e(17, R.drawable.msg_search, org.telegram.messenger.hd.M0(2131745757, null));
                }
                if (this.g1 == 0) {
                }
                this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.hd.M0(2131751573, null));
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
            if (v4()) {
            }
            if (this.e1 != 0) {
            }
            if (z28) {
            }
            if (!this.q2) {
            }
            this.L0 = this.M0;
            hf0Var = this.a0;
            if (hf0Var == null) {
            }
            E5(z10);
            O5(z25);
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
        if (a22 == null) {
            return;
        }
        if (org.telegram.messenger.q10.B(a22)) {
            if (this.s1) {
                org.telegram.ui.Components.hf0 hf0Var3 = this.a0;
                if (hf0Var3 != null) {
                    this.O0 = !(hf0Var3.F == 6);
                } else {
                    this.O0 = true;
                }
            }
            if (!this.J0) {
                this.T0.e(30, R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131751278, null));
                if (this.r0 != null) {
                    this.T0.e(36, R.drawable.msg_addphoto, org.telegram.messenger.hd.M0(2131754392, null));
                }
            }
            this.V0 = this.T0.e(40, R.drawable.menu_profile_colors, org.telegram.messenger.hd.M0(2131746680, null));
            t5();
            if (this.s1) {
                this.X0 = this.T0.e(43, R.drawable.menu_username_change, org.telegram.messenger.hd.M0(2131746620, null));
                this.W0 = this.T0.e(42, R.drawable.msg_link2, org.telegram.messenger.hd.M0(2131746679, null));
                F5();
            }
            z26 = false;
            z27 = false;
        } else {
            if (a22.bot && a22.bot_can_edit) {
                this.O0 = true;
            }
            TLRPC.UserFull userFull = this.w2;
            if (userFull != null && userFull.phone_calls_available) {
                this.M0 = true;
                this.N0 = userFull.video_calls_available;
            }
            if (!this.s2 && getContactsController().g0.get(Long.valueOf(this.e1)) != null) {
                if (this.E2 == null) {
                    S3(context);
                }
                if (!TextUtils.isEmpty(a22.phone)) {
                    this.T0.e(3, R.drawable.msg_share, org.telegram.messenger.hd.M0(2131745461, null));
                }
                this.T0.e(2, R.drawable.msg_block, !this.k1 ? org.telegram.messenger.hd.M0(2131753693, null) : org.telegram.messenger.hd.M0(2131743911, null));
                this.T0.e(4, R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131751282, null));
                this.T0.e(5, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751552, null));
            } else if (org.telegram.messenger.np.F2(a22)) {
                if (this.k1) {
                    this.T0.e(2, R.drawable.msg_block, org.telegram.messenger.hd.M0(2131743911, null));
                }
                this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.M0(2131754390, null));
            } else if (a() != 489000) {
                if (this.E2 == null) {
                    S3(context);
                }
                this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.M0(2131754390, null));
                if (this.s2) {
                    this.T0.e(10, R.drawable.msg_share, org.telegram.messenger.hd.M0(2131752982, null));
                    z26 = true;
                } else {
                    this.T0.e(1, R.drawable.msg_addcontact, org.telegram.messenger.hd.M0(2131754453, null));
                    z26 = false;
                }
                if (!TextUtils.isEmpty(a22.phone)) {
                    this.T0.e(3, R.drawable.msg_share, org.telegram.messenger.hd.M0(2131745461, null));
                }
                if (this.s2) {
                    this.T0.e(44, R.drawable.menu_privacy_policy, org.telegram.messenger.hd.M0(2131753010, null));
                    if (t4()) {
                        this.T0.T(44);
                    } else {
                        this.T0.u(44);
                    }
                    org.telegram.ui.ActionBar.z0 e11 = this.T0.e(24, R.drawable.msg_report, org.telegram.messenger.hd.M0(2131746231, null));
                    int i13 = org.telegram.ui.ActionBar.j6.p7;
                    e11.c(i13, i13);
                    if (this.k1) {
                        this.T0.e(2, R.drawable.msg_retry, org.telegram.messenger.hd.M0(2131752995, null));
                    } else {
                        this.T0.e(2, R.drawable.msg_block2, org.telegram.messenger.hd.M0(2131751574, null)).c(i13, i13);
                    }
                } else {
                    this.T0.e(2, R.drawable.msg_block, !this.k1 ? org.telegram.messenger.hd.M0(2131753693, null) : org.telegram.messenger.hd.M0(2131743911, null));
                }
                if (!org.telegram.messenger.q10.x(a22) && !this.s2 && this.E2 == null && !this.k1) {
                    j3 = this.e1;
                    if (j3 != 333000 && j3 != 777000 && j3 != 42777) {
                        boolean z30 = org.telegram.messenger.r2.a;
                        if (!a22.self || a22.bot || org.telegram.messenger.np.F2(a22) || getMessagesController().i7) {
                            z27 = false;
                        } else {
                            di.u8.y(this.currentAccount, false).U();
                            this.T0.e(38, R.drawable.msg_gift_premium, org.telegram.messenger.hd.M0(2131746637, null));
                            z27 = true;
                        }
                        if (((org.telegram.messenger.h0) getMessagesController().y7.j0.b).c && !org.telegram.messenger.np.F2(a22) && !org.telegram.messenger.q10.A(a22.id)) {
                            this.T0.e(48, R.drawable.ic_gram, org.telegram.messenger.hd.M0(2131743017, null));
                        }
                        this.T0.e(20, R.drawable.msg_secret, org.telegram.messenger.hd.M0(2131744912, null));
                        org.telegram.ui.ActionBar.d5 d5Var2 = this.T0;
                        TL_account.RequirementToContact J2 = getMessagesController().J2(this.e1);
                        d5Var2.R(20, J2 != null || (J2 instanceof TL_account.requirementToContactEmpty));
                        if (this.w2 != null) {
                            this.T0.e(46, R.drawable.menu_share_off_24, org.telegram.messenger.hd.M0(2131751428, null));
                            this.T0.e(47, R.drawable.menu_share_on_24, org.telegram.messenger.hd.M0(2131751150, null));
                            TLRPC.UserFull userFull2 = this.w2;
                            boolean z31 = (userFull2.noforwards_my_enabled || userFull2.noforwards_peer_enabled) ? false : true;
                            this.T0.R(46, z31);
                            this.T0.R(47, !z31);
                        }
                        if (!this.s2 && getContactsController().g0.get(Long.valueOf(this.e1)) != null) {
                            this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.M0(2131754390, null));
                        }
                        z28 = false;
                    }
                }
                z27 = false;
                if (!this.s2) {
                    this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.hd.M0(2131754390, null));
                }
                z28 = false;
            }
            z26 = false;
            if (!org.telegram.messenger.q10.x(a22)) {
                j3 = this.e1;
                if (j3 != 333000) {
                    boolean z302 = org.telegram.messenger.r2.a;
                    if (a22.self) {
                    }
                    z27 = false;
                    if (((org.telegram.messenger.h0) getMessagesController().y7.j0.b).c) {
                        this.T0.e(48, R.drawable.ic_gram, org.telegram.messenger.hd.M0(2131743017, null));
                    }
                    this.T0.e(20, R.drawable.msg_secret, org.telegram.messenger.hd.M0(2131744912, null));
                    org.telegram.ui.ActionBar.d5 d5Var22 = this.T0;
                    TL_account.RequirementToContact J22 = getMessagesController().J2(this.e1);
                    d5Var22.R(20, J22 != null || (J22 instanceof TL_account.requirementToContactEmpty));
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
        if (v4()) {
        }
        if (this.e1 != 0) {
        }
        if (z28) {
        }
        if (!this.q2) {
        }
        this.L0 = this.M0;
        hf0Var = this.a0;
        if (hf0Var == null) {
        }
        E5(z10);
        O5(z25);
    }

    public final void R4(String str, org.telegram.ui.Cells.g gVar) {
        if (str.startsWith("@")) {
            getMessagesController().y3(str.substring(1), this, 0, gVar);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            yw ywVar = new yw(null);
            ywVar.p2 = str;
            presentFragment(ywVar);
        } else {
            if (!str.startsWith("/") || this.parentLayout.getFragmentStack().size() <= 1) {
                return;
            }
            org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if (e2Var instanceof an) {
                finishFragment();
                ((an) e2Var).a0.q1(null, str, false, false);
            }
        }
    }

    public final void R5(boolean z10) {
        boolean z11;
        TLRPC.ChatFull chatFull;
        float K3 = K3();
        this.b6 = K3 > 0.2f && !this.X1 && (this.r0 == null || this.P2 == -1);
        Q3();
        org.telegram.ui.Components.fh0 fh0Var = this.s;
        if (fh0Var == null || fh0Var.getVisibility() == 8) {
            z11 = false;
        } else {
            this.s.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) + this.Q1) + this.U1) - org.telegram.messenger.g0.L(29.5f));
            z11 = K3 > 0.2f && !this.X1 && !this.s1 && (this.r0 == null || this.P2 == -1);
            if (z11 && this.f1 != 0) {
                z11 = (!org.telegram.messenger.t3.T(this.F2) || this.F2.megagroup || (chatFull = this.v2) == null || chatFull.linked_chat_id == 0 || (this.E3 == -1 && this.F3 == -1)) ? false : true;
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
                            this.w.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.ALPHA, 0.0f));
                        }
                        this.w.setDuration(150L);
                        this.w.addListener(new bv0(this, i7));
                        this.w.start();
                    } else {
                        this.s.setScaleX(z11 ? 1.0f : 0.2f);
                        this.s.setScaleY(z11 ? 1.0f : 0.2f);
                        this.s.setAlpha(z11 ? 1.0f : 0.0f);
                    }
                }
            }
        }
        av0 av0Var = this.v0;
        if (av0Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
            int i10 = this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0;
            av0Var.j0 = measuredWidth;
            av0Var.l0 = z11;
            av0Var.k0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10;
            av0Var.invalidate();
        }
        di.u0 u0Var = this.w0;
        if (u0Var != null) {
            u0Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0) + this.Q1 + this.U1);
        }
    }

    public final void S3(Context context) {
        this.a1 = new org.telegram.messenger.qe(context, this.T0.getPopupLayout().getSwipeBack(), new nu0(this), false, 0, this.A0);
        if (this.i1 > 0 || this.e1 > 0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.n6, this.A0);
            org.telegram.messenger.qe qeVar = this.a1;
            org.telegram.ui.Components.z70 z70Var = (org.telegram.ui.Components.z70) qeVar.e;
            if (z70Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131753848, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.O2(org.telegram.messenger.hd.M0(2131753847, null), w02, new org.telegram.ui.Components.dg(qeVar, 10)));
                z70Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.w2;
        org.telegram.ui.Components.c01 a10 = org.telegram.ui.Components.c01.a((userFull == null && this.v2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.v2.ttl_period);
        this.t0 = a10;
        this.Z0 = this.T0.i(0, a10, org.telegram.messenger.hd.M0(2131753846, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.a1.b);
        this.T0.a(-1);
        q5();
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0476  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S4(float f10, float f11, int i7, View view) {
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
        if (i7 == this.M3 || i7 == this.W2) {
            if (this.e1 == 0) {
                if (this.f1 != 0 && (M0 = getMessagesController().M0(Long.valueOf(this.f1))) != null && (this.g1 != 0 || org.telegram.messenger.t3.t0(M0))) {
                    K = org.telegram.messenger.t3.K(M0, false);
                    b10 = org.telegram.messenger.m5.b(K, M0.usernames);
                    if (this.e1 != 0) {
                    }
                }
                return false;
            }
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
            K = org.telegram.messenger.q10.n(a22);
            if (a22 != null && K != null) {
                b10 = org.telegram.messenger.m5.b(K, a22.usernames);
                if (this.e1 != 0) {
                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.f1));
                    if (org.telegram.messenger.t3.t0(M02)) {
                        StringBuilder sb3 = new StringBuilder("https://");
                        sb3.append(getMessagesController().V2);
                        sb3.append("/");
                        sb3.append(org.telegram.messenger.t3.K(M02, false));
                        if (this.g1 != 0) {
                            str3 = "/" + this.g1;
                        }
                        sb3.append(str3);
                        sb2 = sb3.toString();
                    } else {
                        StringBuilder sb4 = new StringBuilder("https://");
                        sb4.append(getMessagesController().V2);
                        sb4.append("/c/");
                        sb4.append(M02.id);
                        if (this.g1 != 0) {
                            str3 = "/" + this.g1;
                        }
                        sb4.append(str3);
                        sb2 = sb4.toString();
                    }
                    iv0 iv0Var = new iv0(this, getParentActivity(), sb2, sb2);
                    showDialog(iv0Var);
                    if (b10 != null && !b10.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername.username = b10.username;
                        tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo, new jo0(this, b10, iv0Var, i10)), getClassGuid());
                        return true;
                    }
                } else if (!Y3(i7, view3)) {
                    if (b10 != null && !b10.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo2 = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername2 = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername2.username = b10.username;
                        tL_getCollectibleInfo2.collectible = tL_inputCollectibleUsername2;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo2, new b00(25, this, b10)), getClassGuid());
                        return true;
                    }
                    try {
                        org.telegram.ui.Components.cc.a0(this).i(org.telegram.messenger.hd.M0(2131743665, null)).j();
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
            int i13 = 2;
            if (i7 == this.H3 || i7 == this.U2) {
                if (!Y3(i7, view3)) {
                    TLRPC.User a23 = getMessagesController().a2(Long.valueOf(this.e1));
                    if (a23 != null && (str = a23.phone) != null && str.length() != 0 && getParentActivity() != null) {
                        if (i7 == this.H3 && a23.phone.startsWith("888")) {
                            TL_fragment.TL_inputCollectiblePhone tL_inputCollectiblePhone = new TL_fragment.TL_inputCollectiblePhone();
                            String str5 = a23.phone;
                            tL_inputCollectiblePhone.phone = str5;
                            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo3 = new TL_fragment.TL_getCollectibleInfo();
                            tL_getCollectibleInfo3.collectible = tL_inputCollectiblePhone;
                            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo3, new jo0(this, str5, a23, 5)), getClassGuid());
                            return true;
                        }
                        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(this, view3);
                        H.W(this.a.U0(view3, false));
                        H.w = false;
                        if (i7 == this.H3) {
                            TLRPC.UserFull userFull3 = this.w2;
                            if (userFull3 != null && userFull3.phone_calls_available) {
                                H.c(R.drawable.msg_calls, org.telegram.messenger.hd.M0(2131752600, null), new st0(this, a23, i11), false);
                                if (this.w2.video_calls_available) {
                                    H.c(R.drawable.msg_videocall, org.telegram.messenger.hd.M0(2131743608, null), new st0(this, a23, i13), false);
                                }
                            }
                            if (!this.e5) {
                                H.c(R.drawable.msg_calls_regular, org.telegram.messenger.hd.M0(2131752634, null), new st0(this, a23, 3), false);
                            }
                        }
                        H.c(R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131751767, null), new st0(this, a23, i10), false);
                        if (this.e5) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131754250, null)));
                            int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                            int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                                int i14 = lastIndexOf - 1;
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.y31(org.telegram.messenger.g0.o()), indexOf, i14, 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.b00(org.telegram.ui.ActionBar.j6.I6, this.A0), indexOf, i14, 33);
                            }
                            H.k();
                            H.p(13, org.telegram.messenger.g0.L(200.0f), spannableStringBuilder);
                            if (H.z() instanceof TextView) {
                                TextView textView = (TextView) H.z();
                                int i15 = org.telegram.ui.ActionBar.j6.I5;
                                org.telegram.ui.ActionBar.q6.Q(textView, org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i15, this.A0), 0, 6), null, org.telegram.ui.ActionBar.q6.M(i15), this.A0);
                                textView.setOnClickListener(new bi.o(23));
                            }
                        }
                        H.Z();
                        return true;
                    }
                }
                return true;
            }
            if (i7 == this.L3 || i7 == this.K3 || i7 == this.J3 || i7 == this.X2) {
                if (i7 != this.X2 || ((userFull = this.w2) != null && !TextUtils.isEmpty(userFull.about))) {
                    if (!Y3(i7, view3)) {
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
                            boolean s5 = org.telegram.messenger.np.s1(this.currentAccount).t7.s();
                            boolean[] zArr = {i7 == this.X2 || i7 == this.L3 || i7 == this.K3};
                            String M03 = org.telegram.ui.Components.p21.M0();
                            bi.u2 u2Var = new bi.u2(this, view3, str6, i7, zArr, strArr, M03);
                            if (zArr[0]) {
                                org.telegram.messenger.b6.d(str6, new org.telegram.ui.Components.pd(this, strArr, zArr, M03, s5, u2Var), new ni0(u2Var, 11), false);
                                return true;
                            }
                            u2Var.run();
                            return true;
                        }
                    }
                    return true;
                }
            } else if ((i7 == this.P3 || i7 == this.Q3) && getParentActivity() != null && (userFull2 = this.w2) != null) {
                if (i7 != this.P3) {
                    if (i7 == this.Q3 && !Y3(i7, view3)) {
                        TLRPC.TL_businessLocation tL_businessLocation = this.w2.business_location;
                        if (tL_businessLocation != null) {
                            str2 = tL_businessLocation.address;
                            String str7 = str2;
                            AtomicReference atomicReference = new AtomicReference();
                            org.telegram.ui.Components.go goVar = new org.telegram.ui.Components.go(R.drawable.popup_fixed_alert, i12, 1, getParentActivity(), this.A0);
                            goVar.V = new Path();
                            goVar.setFitItems(true);
                            org.telegram.ui.ActionBar.q0.c(false, false, goVar, R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131751767, null), false, this.A0).setOnClickListener(new fi.l5(this, atomicReference, str7, i7, 5));
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(goVar, -2, -2);
                            g1Var.e = true;
                            g1Var.c = org.telegram.messenger.ns.x3;
                            g1Var.setOutsideTouchable(true);
                            g1Var.setClippingEnabled(true);
                            g1Var.setAnimationStyle(R.style.PopupContextAnimation);
                            g1Var.setFocusable(true);
                            goVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
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
                            g1Var.showAtLocation(getFragmentView(), 0, (int) (f12 - (goVar.getMeasuredWidth() / 2.0f)), (int) f13);
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
                    org.telegram.ui.Components.go goVar2 = new org.telegram.ui.Components.go(R.drawable.popup_fixed_alert, i12, 1, getParentActivity(), this.A0);
                    goVar2.V = new Path();
                    goVar2.setFitItems(true);
                    org.telegram.ui.ActionBar.q0.c(false, false, goVar2, R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131751767, null), false, this.A0).setOnClickListener(new fi.l5(this, atomicReference2, str72, i7, 5));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(goVar2, -2, -2);
                    g1Var2.e = true;
                    g1Var2.c = org.telegram.messenger.ns.x3;
                    g1Var2.setOutsideTouchable(true);
                    g1Var2.setClippingEnabled(true);
                    g1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                    g1Var2.setFocusable(true);
                    goVar2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
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
                    g1Var2.showAtLocation(getFragmentView(), 0, (int) (f12 - (goVar2.getMeasuredWidth() / 2.0f)), (int) f13);
                    g1Var2.b();
                    return true;
                }
            }
        }
        return false;
    }

    public final void S5() {
        org.telegram.ui.Components.wp0 wp0Var;
        org.telegram.ui.Components.vq0 vq0Var;
        org.telegram.ui.Components.z70 z70Var;
        int w02;
        this.m6.clear();
        vw0 vw0Var = this.d1;
        if (vw0Var != null) {
            vw0Var.a(this.l6, true);
        }
        zu0 zu0Var = this.r;
        if (zu0Var != null) {
            this.r.setTextColor(i0.a.f(this.l2, H3(zu0Var.getTag() instanceof Integer ? org.telegram.ui.ActionBar.j6.w0(((Integer) this.r.getTag()).intValue(), this.A0) : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B8, this.A0), Boolean.valueOf(this.K0[0])), -1275068417));
        }
        tw0 tw0Var = this.D6;
        if (tw0Var != null) {
            tw0Var.a(i0.a.f(this.l2, org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.b(0.18f, -0.1f, this.c1)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.H(i0.a.f(this.U5, this.l6 != null ? -1 : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.v8, this.A0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.y8, this.A0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            org.telegram.messenger.cp cpVar = this.l6;
            kVar2.F(i0.a.f(this.U5, cpVar != null ? 1090519039 : cpVar != null ? 553648127 : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f8, this.A0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.z8, this.A0)), false);
        }
        if (this.y != null) {
            org.telegram.messenger.cp cpVar2 = this.l6;
            if (cpVar2 != null) {
                w02 = org.telegram.ui.ActionBar.j6.b(0.1f, org.telegram.ui.ActionBar.j6.I.q() ? -0.1f : -0.08f, i0.a.f(0.4f, cpVar2.g(), this.l6.o(org.telegram.ui.ActionBar.j6.I.q()) ? this.l6.k() : this.l6.i()));
            } else {
                w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.qi, this.A0);
            }
            this.y.setColorFilter(org.telegram.messenger.g0.S0(this.U5, 1.0f, w02, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fj, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.I != null) {
            this.I.setColorFilter(org.telegram.messenger.g0.S0(this.U5, 1.0f, this.l6 != null ? -1 : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.ri, this.A0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        ok okVar = this.f;
        if (okVar != null) {
            okVar.setTextColor(i0.a.f(this.l2, i0.a.f(this.U5, this.l6 != null ? -1 : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.mi, this.A0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fj, this.A0)), -1));
        }
        org.telegram.messenger.qe qeVar = this.a1;
        if (qeVar != null && (z70Var = (org.telegram.ui.Components.z70) qeVar.e) != null) {
            z70Var.invalidate();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.l6 == null ? i0.a.f(this.T1, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.gd, this.A0), -1) : -1, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.cg0 cg0Var = this.c0;
        if (cg0Var != null) {
            cg0Var.setColor(this.l6);
        }
        org.telegram.messenger.g0.d0(this.a, new du0(this, 3));
        uv0 uv0Var = this.O;
        if (uv0Var != null && (vq0Var = uv0Var.L0) != null) {
            vq0Var.updateColors();
        }
        uv0 uv0Var2 = this.O;
        if (uv0Var2 != null && (wp0Var = uv0Var2.b0) != null) {
            wp0Var.m();
        }
        T5();
        u5();
        av0 av0Var = this.v0;
        if (av0Var != null) {
            av0Var.f(true, true);
        }
        di.u0 u0Var = this.w0;
        if (u0Var != null) {
            u0Var.a();
        }
    }

    public final void T3() {
        if (this.fragmentView == null || !this.s6 || this.z2 == null || getParentActivity() == null) {
            return;
        }
        zw0 zw0Var = this.E6;
        if (zw0Var != null) {
            zw0Var.b(this.z2);
            this.E6.invalidate();
        } else {
            zw0 zw0Var2 = new zw0(this, this.z2);
            this.E6 = zw0Var2;
            ((FrameLayout) this.fragmentView).addView(zw0Var2, c8.ja.e(-1, -1, 55));
        }
    }

    public final void T4() {
        ValueAnimator valueAnimator;
        if (!this.q2 || (valueAnimator = this.k2) == null || !valueAnimator.isRunning()) {
            U4(K3(), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0));
        } else {
            this.f2 = this.e6;
            this.h2 = this.f6;
        }
    }

    public final void T5() {
        if (this.s == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.oi, this.A0);
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.pi, this.A0);
            int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.ni, this.A0);
            if (this.l6 != null && org.telegram.ui.ActionBar.j6.e1(w02)) {
                w02 = org.telegram.ui.ActionBar.j6.b(0.05f, -0.04f, this.l6.c(false));
                org.telegram.messenger.cp cpVar = this.l6;
                if (cpVar != null) {
                    int d = cpVar.d(org.telegram.ui.ActionBar.j6.I.q());
                    w03 = org.telegram.ui.ActionBar.j6.D(org.telegram.ui.ActionBar.j6.I.q(), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.v6, this.A0), d, w03, d);
                }
                w04 = -1;
            }
            org.telegram.ui.Components.fh0 fh0Var = this.t6;
            org.telegram.ui.Components.fh0 fh0Var2 = this.s;
            int[] iArr = this.u6;
            if (fh0Var == fh0Var2 && iArr[0] == w02 && iArr[1] == w03 && iArr[2] == w04) {
                return;
            }
            this.t6 = fh0Var2;
            iArr[0] = w02;
            iArr[1] = w03;
            iArr[2] = w04;
            Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(mutate, org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(56.0f), w02, w03), 0, 0);
            int L = org.telegram.messenger.g0.L(56.0f);
            int L2 = org.telegram.messenger.g0.L(56.0f);
            fqVar.e = L;
            fqVar.f = L2;
            this.s.setBackground(fqVar);
            this.s.setColorFilter(new PorterDuffColorFilter(w04, mode));
        } catch (Exception unused) {
        }
    }

    public final void U3(Context context) {
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            org.telegram.messenger.g0.E2(w4Var);
        }
        kv0 kv0Var = new kv0(this, context, this.A0);
        this.simpleActionBar = kv0Var;
        kv0Var.setTitlesAlpha(0.0f);
        if (!this.p5 && !this.J0 && this.J1 != 0 && this.M1 && !this.N1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        int i7 = 3;
        this.simpleActionBar.setMenuOverlayProvider(new ne(i7, this));
        if (this.J0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.outline_header_qr_24);
            this.simpleActionBar.setBackButtonContentDescription(org.telegram.messenger.hd.M0(2131746500, null));
        } else {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, i7));
        if (this.J0) {
            return;
        }
        View backButton = this.simpleActionBar.getBackButton();
        backButton.setOnLongClickListener(new fi.b2(6, this, backButton));
    }

    public final void U4(float f10, float f11) {
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - i4()) / ((this.a.getMeasuredWidth() - f11) - j4())));
        float N = ((org.telegram.messenger.g0.N(8.0f) + (org.telegram.messenger.g0.L(42.0f) * ((this.Q1 >= ((float) i4()) || max >= 0.33f) ? org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) : com.google.android.gms.internal.vision.e2.y(f10, 72.0f, 24.0f, 42.0f)))) * f10) + ((float) Math.floor(this.actionBar.getTranslationY() + (org.telegram.messenger.i20.b(f10, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0) - (org.telegram.messenger.g0.p * 21.0f))));
        this.f2 = (org.telegram.messenger.g0.L(7.0f) * f10) + org.telegram.messenger.g0.L(1.3f) + N;
        this.h2 = (((float) Math.floor(org.telegram.messenger.g0.p * 11.0f)) * f10) + N + org.telegram.messenger.g0.L(24.0f);
    }

    @Override // org.telegram.ui.Components.l30
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new li.j(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final void V4() {
        ou0 ou0Var = this.a;
        if (ou0Var == null || this.c == null || ou0Var.getChildCount() <= 0 || this.r6) {
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
            this.p6 = i10;
            int top = view.getTop();
            this.q6 = top;
            if (this.p6 == 0 && !this.p2 && top > i4()) {
                this.q6 = i4();
            }
            this.c.h1(i10, view.getTop() - this.a.getPaddingTop());
        }
    }

    @Override // org.telegram.ui.Components.nr0
    public final void W() {
        int i7;
        int i10;
        uv0 uv0Var = this.O;
        if (uv0Var == null || this.r == null) {
            return;
        }
        int closestTab = uv0Var.getClosestTab();
        int[] iArr = this.R.c;
        if (closestTab == 0) {
            if (iArr[7] <= 0 && iArr[6] <= 0) {
                int i11 = iArr[0];
                if (i11 <= 0) {
                    h5(org.telegram.messenger.hd.M0(2131745409, null));
                    return;
                } else {
                    h5(org.telegram.messenger.hd.G(i11, "Media", new Object[0]));
                    return;
                }
            }
            if (this.O.getPhotosVideosTypeFilter() == 1 || iArr[7] <= 0) {
                h5(org.telegram.messenger.hd.G(iArr[6], "Photos", new Object[0]));
                return;
            }
            if (this.O.getPhotosVideosTypeFilter() == 2 || (i10 = iArr[6]) <= 0) {
                h5(org.telegram.messenger.hd.G(iArr[7], "Videos", new Object[0]));
                return;
            }
            h5(org.telegram.messenger.hd.G(i10, "Photos", new Object[0]) + ", " + org.telegram.messenger.hd.G(iArr[7], "Videos", new Object[0]));
            return;
        }
        if (closestTab == 1) {
            int i12 = iArr[1];
            if (i12 <= 0) {
                h5(org.telegram.messenger.hd.M0(2131750826, null));
                return;
            } else {
                h5(org.telegram.messenger.hd.G(i12, "Files", new Object[0]));
                return;
            }
        }
        if (closestTab == 2) {
            int i13 = iArr[2];
            if (i13 <= 0) {
                h5(org.telegram.messenger.hd.M0(2131743523, null));
                return;
            } else {
                h5(org.telegram.messenger.hd.G(i13, "Voice", new Object[0]));
                return;
            }
        }
        if (closestTab == 3) {
            int i14 = iArr[3];
            if (i14 <= 0) {
                h5(org.telegram.messenger.hd.M0(2131745411, null));
                return;
            } else {
                h5(org.telegram.messenger.hd.G(i14, "Links", new Object[0]));
                return;
            }
        }
        if (closestTab == 4) {
            int i15 = iArr[4];
            if (i15 <= 0) {
                h5(org.telegram.messenger.hd.M0(2131748319, null));
                return;
            } else {
                h5(org.telegram.messenger.hd.G(i15, "MusicFiles", new Object[0]));
                return;
            }
        }
        if (closestTab == 5) {
            int i16 = iArr[5];
            if (i16 <= 0) {
                h5(org.telegram.messenger.hd.M0(2131754879, null));
                return;
            } else {
                h5(org.telegram.messenger.hd.G(i16, "GIFs", new Object[0]));
                return;
            }
        }
        if (closestTab == 6) {
            h5(org.telegram.messenger.hd.G(this.w2.common_chats_count, "CommonGroups", new Object[0]));
            return;
        }
        if (closestTab == 7) {
            h5(this.r.getText());
            return;
        }
        if (closestTab == 8 || org.telegram.ui.Components.ys0.J0(closestTab)) {
            if (this.s2) {
                h5(this.O.f0(false));
                return;
            } else if (this.O.m0(closestTab) > 0) {
                h5(org.telegram.messenger.hd.G(this.O.m0(closestTab), "ProfileStoriesCount", new Object[0]));
                return;
            } else {
                h5(org.telegram.messenger.hd.M0(2131746625, null));
                return;
            }
        }
        if (closestTab == 13) {
            h5(this.O.f0(true));
            return;
        }
        if (closestTab == 9) {
            h5(org.telegram.messenger.hd.G(this.O.m0(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
            return;
        }
        if (closestTab == 10) {
            org.telegram.messenger.oo L0 = org.telegram.messenger.np.s1(this.currentAccount).L0(a());
            h5(org.telegram.messenger.hd.G(L0 == null ? 0 : L0.b.size() + L0.c, this.s2 ? "Bots" : "Channels", new Object[0]));
            return;
        }
        if (closestTab != 12) {
            if (closestTab == 14) {
                org.telegram.ui.Components.wp0 wp0Var = this.O.b0;
                h5(org.telegram.messenger.hd.H(',', "ProfileGiftsCount", wp0Var != null ? wp0Var.getGiftsCount() : 0));
                return;
            } else {
                if (closestTab == 15) {
                    int i17 = iArr[8];
                    if (i17 <= 0) {
                        h5(org.telegram.messenger.hd.M0(2131745403, null));
                        return;
                    } else {
                        h5(org.telegram.messenger.hd.H(',', "ProfilePollsCount", i17));
                        return;
                    }
                }
                return;
            }
        }
        org.telegram.messenger.tv G1 = getMessagesController().G1();
        long a10 = a();
        ArrayList arrayList = G1.j;
        int i18 = 0;
        while (true) {
            if (i18 >= arrayList.size()) {
                i7 = 0;
                break;
            }
            org.telegram.messenger.sv svVar = (org.telegram.messenger.sv) arrayList.get(i18);
            if (svVar.a == a10) {
                i7 = svVar.e;
                break;
            }
            i18++;
        }
        h5(org.telegram.messenger.hd.G(Math.max(1, i7), "SavedMessagesCount", new Object[0]));
    }

    public final void W3(float f10) {
        ValueAnimator ofFloat;
        int i7 = 0;
        boolean z10 = f10 > 0.0f;
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.o6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.o6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.y0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new zt0(this, i7));
        this.o6.playTogether(arrayList);
        this.o6.setDuration(z10 ? 150L : 220L);
        if (!z10) {
            this.o6.addListener(new bv0(this, 6));
        }
        this.o6.start();
    }

    public final void W4(boolean z10) {
        int i7 = this.L4;
        if (i7 >= 0) {
            if (!z10) {
                this.c.h1(i7, -this.a.getPaddingTop());
                return;
            }
            pi.l lVar = new pi.l(getParentActivity(), 2, 0.6f);
            lVar.a = this.L4;
            lVar.p = -this.a.getPaddingTop();
            this.c.w0(lVar);
        }
    }

    public final void X3(int i7, View view) {
        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(this, view);
        H.W(this.a.U0(view, false));
        H.w = false;
        H.l(R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131751767, null), new k90(this, 4), this.w2 != null);
        H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131751335, null), new k90(this, 5), false);
        H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.Components.a2(this, i7, 26), true);
        H.Z();
    }

    @Override // org.telegram.ui.Components.nr0
    public final boolean Y() {
        return this.A1;
    }

    public final boolean Y3(final int i7, View view) {
        TLRPC.User f10;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        final int i10 = 0;
        if (this.s1 && (f10 = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.w2;
            if (userFull == null) {
                userFull = getMessagesController().b2(f10.id);
            }
            if (userFull != null) {
                String M0 = org.telegram.messenger.hd.M0(2131751767, null);
                String M02 = org.telegram.messenger.hd.M0(2131744194, null);
                if (i7 == this.L3 || i7 == this.K3 || i7 == this.X2) {
                    str = userFull.about;
                    if (i7 == this.X2) {
                        M02 = org.telegram.messenger.hd.M0(2131753721, null);
                    }
                } else if (i7 == this.P3) {
                    str = kg.c1.k0(this.currentAccount, f10, userFull.business_work_hours);
                    M0 = org.telegram.messenger.hd.M0(2131746665, null);
                    M02 = org.telegram.messenger.hd.M0(2131752761, null);
                } else if (i7 == this.Q3) {
                    str = userFull.business_location.address;
                    M0 = org.telegram.messenger.hd.M0(2131746660, null);
                    M02 = org.telegram.messenger.hd.M0(2131752693, null);
                } else if (i7 == this.M3) {
                    str = org.telegram.messenger.q10.n(f10);
                    if (str != null) {
                        str = "@".concat(str);
                    }
                    M0 = org.telegram.messenger.hd.M0(2131746678, null);
                    M02 = org.telegram.messenger.hd.M0(2131743665, null);
                } else if (i7 == this.H3) {
                    str = f10.phone;
                    M02 = org.telegram.messenger.hd.M0(2131747295, null);
                } else if (i7 == this.V2) {
                    str = UserInfoActivity.e0(this.w2.birthday);
                    M02 = org.telegram.messenger.hd.M0(2131753716, null);
                } else {
                    str = null;
                }
                org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(this, view);
                H.W(this.a.U0(view, false));
                H.w = false;
                H.i = 3;
                if (i7 == this.Q3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, org.telegram.messenger.hd.M0(2131746656, null), new k90(this, 7), false);
                    }
                    H.c(R.drawable.msg_map, org.telegram.messenger.hd.M0(2131746658, null), new k90(this, 9), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, M0, new lc0(this, str, M02, 25), false);
                }
                final int i11 = 1;
                if (i7 == this.P3) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131746664, null), new k90(this, 10), false);
                    H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131746663, null), new Runnable(this) { // from class: org.telegram.ui.xt0
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
                                    RectF rectF = ProfileActivity.X6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.hd.M0(2131752762, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                    t1Var.S = M03;
                                    t1Var.U = org.telegram.messenger.hd.M0(2131752763, null);
                                    final int i14 = 0;
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.bu0
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i15) {
                                            int i16 = i14;
                                            int i17 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF2 = ProfileActivity.X6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new eu0(profileActivity2, 0));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.X6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new eu0(profileActivity2, 3));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(t1Var);
                                    break;
                                default:
                                    RectF rectF2 = ProfileActivity.X6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.hd.M0(2131752694, null);
                                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                                    t1Var2.S = M04;
                                    t1Var2.U = org.telegram.messenger.hd.M0(2131752695, null);
                                    final int i15 = 1;
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.bu0
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i152) {
                                            int i16 = i15;
                                            int i17 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.X6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new eu0(profileActivity2, 0));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.X6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new eu0(profileActivity2, 3));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(t1Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i7 == this.Q3) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131746659, null), new k90(this, 11), false);
                    H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131746657, null), new Runnable(this) { // from class: org.telegram.ui.xt0
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
                                    RectF rectF = ProfileActivity.X6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.hd.M0(2131752762, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                    t1Var.S = M03;
                                    t1Var.U = org.telegram.messenger.hd.M0(2131752763, null);
                                    final int i14 = 0;
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.bu0
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i152) {
                                            int i16 = i14;
                                            int i17 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.X6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new eu0(profileActivity2, 0));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.X6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new eu0(profileActivity2, 3));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(t1Var);
                                    break;
                                default:
                                    RectF rectF2 = ProfileActivity.X6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.hd.M0(2131752694, null);
                                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                                    t1Var2.S = M04;
                                    t1Var2.U = org.telegram.messenger.hd.M0(2131752695, null);
                                    final int i15 = 1;
                                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.bu0
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i152) {
                                            int i16 = i15;
                                            int i17 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.X6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new eu0(profileActivity2, 0));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.X6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new eu0(profileActivity2, 3));
                                                    profileActivity2.M5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    profileActivity.showDialog(t1Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i7 == this.M3) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131746620, null), new k90(this, 12), false);
                } else {
                    int i12 = 13;
                    if (i7 == this.L3 || i7 == this.K3 || i7 == this.X2) {
                        H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131746677, null), new k90(this, i12), false);
                    } else if (i7 == this.H3) {
                        H.c(R.drawable.menu_storage_path, org.telegram.messenger.hd.M0(2131746646, null), new k90(this, 14), false);
                    } else if (i7 == this.V2) {
                        H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131746723, null), new Runnable(this) { // from class: org.telegram.ui.vt0
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
                                        RectF rectF = ProfileActivity.X6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131751238, null), org.telegram.messenger.hd.M0(2131751243, null), userFull2.birthday, new org.telegram.ui.Components.gh(25, profileActivity, userFull2), new k90(profileActivity, 15), false, false, profileActivity.A0).b);
                                        break;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.X6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = org.telegram.messenger.hd.M0(2131753717, null);
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                        t1Var.S = M03;
                                        t1Var.U = org.telegram.messenger.hd.M0(2131753718, null);
                                        final int i14 = 1;
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.au0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i15) {
                                                int i16 = i14;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i16) {
                                                    case 0:
                                                        RectF rectF3 = ProfileActivity.X6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        break;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.X6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        break;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(t1Var);
                                        break;
                                    default:
                                        RectF rectF3 = ProfileActivity.X6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = org.telegram.messenger.hd.M0(2131746682, null);
                                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                                        t1Var2.S = M04;
                                        t1Var2.U = org.telegram.messenger.hd.M0(2131746683, null);
                                        final int i15 = 0;
                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.au0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i152) {
                                                int i16 = i15;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i16) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.X6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        break;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.X6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        break;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(t1Var2);
                                        break;
                                }
                            }
                        }, false);
                        H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131746321, null), new Runnable(this) { // from class: org.telegram.ui.vt0
                            public final /* synthetic */ ProfileActivity b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i13 = i11;
                                final TLRPC.UserFull userFull2 = userFull;
                                final ProfileActivity profileActivity = this.b;
                                switch (i13) {
                                    case 0:
                                        RectF rectF = ProfileActivity.X6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131751238, null), org.telegram.messenger.hd.M0(2131751243, null), userFull2.birthday, new org.telegram.ui.Components.gh(25, profileActivity, userFull2), new k90(profileActivity, 15), false, false, profileActivity.A0).b);
                                        break;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.X6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M03 = org.telegram.messenger.hd.M0(2131753717, null);
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                        t1Var.S = M03;
                                        t1Var.U = org.telegram.messenger.hd.M0(2131753718, null);
                                        final int i14 = 1;
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.au0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i152) {
                                                int i16 = i14;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i16) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.X6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        break;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.X6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        break;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(t1Var);
                                        break;
                                    default:
                                        RectF rectF3 = ProfileActivity.X6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = org.telegram.messenger.hd.M0(2131746682, null);
                                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                                        t1Var2.S = M04;
                                        t1Var2.U = org.telegram.messenger.hd.M0(2131746683, null);
                                        final int i15 = 0;
                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.au0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i152) {
                                                int i16 = i15;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i16) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.X6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        break;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.X6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        break;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(t1Var2);
                                        break;
                                }
                            }
                        }, true);
                    } else if (i7 == this.R2) {
                        TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(userFull.personal_channel_id));
                        if (M03 != null && org.telegram.messenger.t3.K(M03, false) != null) {
                            H.c(R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131746681, null), new mp0(i12, this, M03), false);
                        }
                        H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131746684, null), new k90(this, 8), false);
                        final int i13 = 2;
                        H.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131746321, null), new Runnable(this) { // from class: org.telegram.ui.vt0
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
                                        RectF rectF = ProfileActivity.X6;
                                        profileActivity.showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.l(profileActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131751238, null), org.telegram.messenger.hd.M0(2131751243, null), userFull2.birthday, new org.telegram.ui.Components.gh(25, profileActivity, userFull2), new k90(profileActivity, 15), false, false, profileActivity.A0).b);
                                        break;
                                    case 1:
                                        RectF rectF2 = ProfileActivity.X6;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M032 = org.telegram.messenger.hd.M0(2131753717, null);
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                        t1Var.S = M032;
                                        t1Var.U = org.telegram.messenger.hd.M0(2131753718, null);
                                        final int i14 = 1;
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.au0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i152) {
                                                int i16 = i14;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i16) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.X6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        break;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.X6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        break;
                                                }
                                            }
                                        });
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(t1Var);
                                        break;
                                    default:
                                        RectF rectF3 = ProfileActivity.X6;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                        String M04 = org.telegram.messenger.hd.M0(2131746682, null);
                                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                                        t1Var2.S = M04;
                                        t1Var2.U = org.telegram.messenger.hd.M0(2131746683, null);
                                        final int i15 = 0;
                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746321, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.au0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i152) {
                                                int i16 = i15;
                                                TLRPC.UserFull userFull3 = userFull2;
                                                ProfileActivity profileActivity2 = profileActivity;
                                                switch (i16) {
                                                    case 0:
                                                        RectF rectF32 = ProfileActivity.X6;
                                                        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                        userFull3.personal_channel_id = 0L;
                                                        userFull3.personal_channel_message = 0;
                                                        userFull3.flags2 &= -65;
                                                        profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new eu0(profileActivity2, 1));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        break;
                                                    default:
                                                        RectF rectF4 = ProfileActivity.X6;
                                                        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                        userFull3.birthday = null;
                                                        userFull3.flags2 &= -33;
                                                        profileActivity2.getMessagesController().m2();
                                                        profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new eu0(profileActivity2, 2));
                                                        profileActivity2.G5(false, false);
                                                        profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                        break;
                                                }
                                            }
                                        });
                                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        profileActivity.showDialog(t1Var2);
                                        break;
                                }
                            }
                        }, true);
                    }
                }
                if (H.x() > 0) {
                    H.Z();
                    return true;
                }
            }
        }
        return false;
    }

    public final void Y4() {
        org.telegram.ui.Components.hf0 hf0Var = this.a0;
        if (hf0Var == null) {
            return;
        }
        if (this.s1) {
            hf0Var.F = 6;
            return;
        }
        if (this.q1) {
            hf0Var.F = 5;
            return;
        }
        if (this.s2) {
            hf0Var.F = 2;
            return;
        }
        if (this.e1 != 0) {
            hf0Var.F = 0;
            return;
        }
        if (this.f1 != 0) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
            if (!org.telegram.messenger.t3.T(M0)) {
                this.a0.F = 3;
                return;
            }
            if (org.telegram.messenger.t3.n0(M0)) {
                this.a0.F = 3;
            } else if (org.telegram.messenger.t3.c0(M0)) {
                this.a0.F = 4;
            } else {
                this.a0.F = 1;
            }
        }
    }

    public final boolean Z3() {
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
                ou0 ou0Var = this.a;
                View F = ou0Var.F(view);
                v4.e1 T = F != null ? ou0Var.T(F) : null;
                if (T != null) {
                    Integer num = (Integer) this.Z1.get(Integer.valueOf(T.b()));
                    if (num != null) {
                        this.P1 = true;
                        this.a.w0(0, -(((this.a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.er.h);
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
    public final void Z4(float f10) {
        int w02;
        boolean z10;
        tw0 tw0Var;
        int i7;
        int f11;
        di.u0 u0Var;
        vw0 vw0Var;
        if (this.actionBar == null) {
            return;
        }
        this.glassEngine.g();
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        this.m2 = f10;
        float U1 = org.telegram.messenger.g0.U1(f10, this.n2);
        this.l2 = U1;
        P3();
        this.Y.setScaleX(this.c2);
        this.Y.setScaleY(this.c2);
        this.Y.setTranslationY(org.telegram.messenger.g0.T1((float) Math.ceil(this.b2), 0.0f, U1));
        this.f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(r4(), 0.0f, U1));
        xu0 xu0Var = this.f0;
        float f12 = this.c2;
        boolean z11 = this.q2;
        xu0Var.I = U1;
        xu0Var.J = f12;
        xu0Var.H = z11;
        av0 av0Var = this.v0;
        if (av0Var != null) {
            av0Var.setExpandProgress(U1);
        }
        di.u0 u0Var2 = this.w0;
        if (u0Var2 != null) {
            u0Var2.setExpandProgress(U1);
        }
        org.telegram.ui.Components.mu0 mu0Var = this.T;
        if (mu0Var != null) {
            mu0Var.setParentExpanded(U1);
        }
        org.telegram.ui.Components.hf0 hf0Var = this.a0;
        if (hf0Var != null) {
            hf0Var.setParentExpanded(U1);
        }
        b5(U1);
        org.telegram.ui.Components.cg0 cg0Var = this.c0;
        if (cg0Var != null) {
            cg0Var.setParentExpanded(U1);
        }
        org.telegram.ui.ActionBar.d5 d5Var = this.U0;
        if (d5Var != null) {
            float f13 = 1.0f - U1;
            d5Var.setAlpha(f13);
            this.U0.setScaleY(f13);
            this.U0.setVisibility(0);
            org.telegram.ui.ActionBar.d5 d5Var2 = this.U0;
            d5Var2.setClickable(d5Var2.getAlpha() > 0.5f);
        }
        float K3 = K3();
        if (K3 >= 1.0f) {
            this.f0.setAlpha(1.0f);
        }
        if (!this.q2) {
            U4(K3, currentActionBarHeight);
        } else if (this.Q1 >= j4() && this.i2 < 0.33f) {
            T4();
        }
        org.telegram.ui.Components.lk0 lk0Var = this.L;
        if (lk0Var != null) {
            lk0Var.b(i0.a.f(U1, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h8, this.A0), Color.argb(org.telegram.messenger.ns.J2, org.telegram.messenger.ns.e4, org.telegram.messenger.ns.e4, org.telegram.messenger.ns.e4)));
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.l6 != null ? -1 : i0.a.f(U1, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.gd, this.A0), -1), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.dr drVar = this.J;
        if (drVar != null) {
            drVar.a(U1);
        }
        org.telegram.ui.Components.dr drVar2 = this.K;
        if (drVar2 != null) {
            drVar2.a(U1);
        }
        v5(U1);
        float f14 = this.e2;
        float f15 = this.g2;
        float N = org.telegram.messenger.g0.N(8.0f);
        float N2 = org.telegram.messenger.g0.N(this.q2 ? 8.0f : -24.0f);
        float N3 = org.telegram.messenger.g0.N(18.0f) - ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin;
        float f16 = currentActionBarHeight;
        float d42 = (((this.Q1 + f16) - d4()) - org.telegram.messenger.g0.N(30.0f)) - this.f.getBottom();
        float A = com.google.android.gms.internal.vision.e2.A(N3, f14, 2.0f, N + f14);
        float f17 = this.f2;
        float f18 = 1.0f - U1;
        float f19 = f18 * f18;
        float f20 = f18 * 2.0f * U1;
        float f21 = (A * f20) + (f14 * f19);
        float f22 = U1 * U1;
        float f23 = (N3 * f22) + f21;
        float A2 = (d42 * f22) + (com.google.android.gms.internal.vision.e2.A(d42, f17, 2.0f, N2 + f17) * f20) + (f17 * f19);
        float N4 = org.telegram.messenger.g0.N(16.0f) - ((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin;
        float d43 = (((this.Q1 + f16) - d4()) - org.telegram.messenger.g0.N(10.0f)) - this.r.getBottom();
        float A3 = com.google.android.gms.internal.vision.e2.A(N4, f15, 2.0f, N + f15);
        float f24 = this.h2;
        float f25 = (N4 * f22) + (A3 * f20) + (f15 * f19);
        float A4 = (f22 * d43) + (f20 * com.google.android.gms.internal.vision.e2.A(d43, f24, 2.0f, N2 + f24)) + (f19 * f24);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - (org.telegram.messenger.g0.p * 21.0f)))) + org.telegram.messenger.g0.L(1.3f);
        float N5 = org.telegram.messenger.g0.N(22.7f) + floor;
        this.f.setTranslationX(f23);
        this.f.setTranslationY(Math.max(floor, A2));
        this.r.setTranslationX(l4(f25, Math.min(1.0f, K3) * this.A6));
        this.r.setTranslationY(m4(Math.max(N5, A4)));
        p5();
        H5();
        Object tag = this.r.getTag();
        if (tag instanceof Integer) {
            Integer num = (Integer) tag;
            w02 = org.telegram.ui.ActionBar.j6.w0(num.intValue(), this.A0);
            if (num.intValue() == org.telegram.ui.ActionBar.j6.si) {
                z10 = true;
                this.r.setTextColor(i0.a.f(U1, H3(w02, Boolean.valueOf(z10)), -1275068417));
                if (this.Q1 > j4()) {
                    this.f.setPivotY(org.telegram.messenger.g0.W1(U1, 0, r5.getMeasuredHeight()));
                    float f26 = (0.12f * K3) + 1.0f;
                    this.f.setScaleX(org.telegram.messenger.g0.T1(f26, 1.38f, U1));
                    this.f.setScaleY(org.telegram.messenger.g0.T1(f26, 1.38f, U1));
                }
                B4(0, Math.min(1.0f, K3), true);
                tw0Var = this.D6;
                if (tw0Var != null) {
                    tw0Var.a(i0.a.f(this.l2, org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.b(0.18f, -0.1f, this.c1)), 603979775));
                }
                ok okVar = this.f;
                if (this.l6 == null) {
                    f11 = -1;
                    i7 = -1;
                } else {
                    i7 = -1;
                    f11 = i0.a.f(this.l2, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.mi, this.A0), -1);
                }
                okVar.setTextColor(f11);
                this.actionBar.H(this.l6 == null ? i7 : i0.a.f(U1, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.v8, this.A0), i7), false);
                this.actionBar.setMenuOffsetSuppressed(true);
                this.f0.setForegroundAlpha(U1);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                layoutParams.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.a.getMeasuredWidth() / this.c2, U1);
                layoutParams.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.Q1 + f16) / this.c2, U1);
                c4();
                this.Y.requestLayout();
                u0Var = this.w0;
                if (u0Var != null) {
                    u0Var.setExpandProgress(U1);
                }
                s5();
                vw0Var = this.d1;
                if (vw0Var == null && vw0Var.L) {
                    vw0Var.invalidate();
                    return;
                }
            }
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B8, this.A0);
        }
        z10 = false;
        this.r.setTextColor(i0.a.f(U1, H3(w02, Boolean.valueOf(z10)), -1275068417));
        if (this.Q1 > j4()) {
        }
        B4(0, Math.min(1.0f, K3), true);
        tw0Var = this.D6;
        if (tw0Var != null) {
        }
        ok okVar2 = this.f;
        if (this.l6 == null) {
        }
        okVar2.setTextColor(f11);
        this.actionBar.H(this.l6 == null ? i7 : i0.a.f(U1, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.v8, this.A0), i7), false);
        this.actionBar.setMenuOffsetSuppressed(true);
        this.f0.setForegroundAlpha(U1);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
        layoutParams2.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.a.getMeasuredWidth() / this.c2, U1);
        layoutParams2.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.Q1 + f16) / this.c2, U1);
        c4();
        this.Y.requestLayout();
        u0Var = this.w0;
        if (u0Var != null) {
        }
        s5();
        vw0Var = this.d1;
        if (vw0Var == null) {
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

    public final void a4() {
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

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.h8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f8));
    }

    public final boolean b4() {
        org.telegram.ui.ActionBar.o4 o4Var;
        if (this.J1 == 0 || (o4Var = this.parentLayout) == null || o4Var.getFragmentStack() == null || this.parentLayout.getFragmentStack().size() < 2 || !(this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof an)) {
            return false;
        }
        finishFragment();
        return true;
    }

    public final void b5(float f10) {
        this.N5 = f10;
        org.telegram.ui.Components.lf0 lf0Var = this.M5;
        if (lf0Var != null) {
            lf0Var.b(f10);
        }
        D5();
    }

    public final void c4() {
        if (this.a == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
        float x10 = org.telegram.ui.Cells.y0.x(layoutParams.width, this.c2, 0.5f, this.a.getMeasuredWidth() / 2.0f);
        this.a2 = x10;
        if (this.G1) {
            this.a2 = org.telegram.messenger.g0.T1(this.i6, x10, this.T1);
        }
        this.Y.setTranslationX(this.a2);
    }

    public final void c5(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.v2 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.m1 == 0) {
                this.m1 = -j3;
                getMediaDataController().e0(this.m1, this.classGuid, this.g1);
            }
        }
        uv0 uv0Var = this.O;
        if (uv0Var != null) {
            uv0Var.setChatInfo(this.v2);
        }
        yu0 yu0Var = this.o0;
        if (yu0Var != null && !this.q1) {
            yu0Var.setChatInfo(this.v2);
        }
        av0 av0Var = this.v0;
        if (av0Var != null && (chatFull3 = this.v2) != null) {
            av0Var.setStories(chatFull3.stories);
        }
        di.u0 u0Var = this.w0;
        if (u0Var != null) {
            u0Var.a();
        }
        xu0 xu0Var = this.f0;
        if (xu0Var != null) {
            xu0Var.setHasStories(z4());
        }
        a4();
        if (this.f1 != 0) {
            boolean z10 = org.telegram.messenger.r2.a;
            boolean z11 = (getMessagesController().i7 || (chatFull2 = this.v2) == null || !chatFull2.stargifts_available) ? false : true;
            this.T0.R(38, z11);
            org.telegram.ui.Components.hf0 hf0Var = this.a0;
            if (hf0Var != null) {
                hf0Var.o(3, z11);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean canBeginSlide() {
        if (this.O.K0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void clearViews() {
        this.l6 = null;
        super.clearViews();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r1 == null) goto L17;
     */
    @Override // org.telegram.ui.ActionBar.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        LaunchActivity launchActivity;
        ym ymVar;
        org.telegram.ui.ActionBar.p3 p3Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.e2 lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof an) && (ymVar = ((an) lastFragment).Aa) != null && (p3Var = ymVar.f) != null) {
            if (p3Var != null) {
                TLRPC.ChatTheme chatTheme = p3Var.d;
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
        org.telegram.ui.Components.o7 o7Var = new org.telegram.ui.Components.o7(this, context, this.A0, i7);
        boolean z10 = true;
        o7Var.setForceSkipTouches(true);
        o7Var.setBackgroundColor(0);
        o7Var.F(this.l6 != null ? 553648127 : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f8, this.A0), false);
        int i10 = org.telegram.ui.ActionBar.j6.v8;
        o7Var.H(org.telegram.ui.ActionBar.j6.w0(i10, this.A0), false);
        o7Var.H(org.telegram.ui.ActionBar.j6.w0(i10, this.A0), true);
        o7Var.setCastShadows(false);
        o7Var.setAddToContainer(false);
        o7Var.setClipContent(true);
        if (!this.J0 && (((o4Var = this.parentLayout) == null || !((ActionBarLayout) o4Var).b) && ((org.telegram.messenger.g0.Q1() || this.inBubbleMode) && (!org.telegram.messenger.g0.Q1() || this.inBubbleMode || (o4Var2 = this.parentLayout) == null || (launchActivity = LaunchActivity.H1) == null || o4Var2 != launchActivity.r0)))) {
            z10 = false;
        }
        o7Var.setOccupyStatusBar(z10);
        if (!this.J0) {
            o7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
            o7Var.getBackButton().setTranslationX(org.telegram.messenger.g0.L(2.0f));
            ImageView backButton = o7Var.getBackButton();
            backButton.setOnLongClickListener(new fi.b2(i7, this, backButton));
            return o7Var;
        }
        o7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        o7Var.getBackButton().setTranslationX(org.telegram.messenger.g0.L(2.0f));
        o7Var.e.setContentDescription(org.telegram.messenger.hd.M0(2131746500, null));
        o7Var.e.setImageResource(R.drawable.outline_header_qr_24);
        o7Var.e.setColorFilter(org.telegram.ui.ActionBar.j6.w0(i10, this.A0), PorterDuff.Mode.SRC_IN);
        o7Var.e.setOnClickListener(new wt0(this, 6));
        return o7Var;
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
    @Override // org.telegram.ui.ActionBar.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        int i7;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        ?? r12;
        TLRPC.Document document;
        int i10;
        Object obj;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i11;
        int i12;
        TLRPC.UserFull userFull2;
        TLRPC.ChatParticipants chatParticipants;
        an anVar;
        ym ymVar;
        org.telegram.ui.ActionBar.j6.Z(context);
        ?? r02 = 0;
        org.telegram.ui.ActionBar.j6.K(context, false);
        org.telegram.ui.ActionBar.e2 lastFragment = this.parentLayout.getLastFragment();
        StateListAnimator stateListAnimator = null;
        if ((lastFragment instanceof an) && (ymVar = (anVar = (an) lastFragment).Aa) != null && ymVar.l() != null) {
            org.telegram.ui.ActionBar.p3 p3Var = anVar.Aa.f;
            if (p3Var != null) {
                TLRPC.ChatTheme chatTheme = p3Var.d;
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
        this.Q1 = i4();
        this.actionBar.setActionBarMenuOnItemClick(new pv0(this, context));
        uv0 uv0Var = this.O;
        if (uv0Var != null) {
            uv0Var.R0();
        }
        long j3 = this.i1;
        if (j3 == 0) {
            j3 = this.e1;
            if (j3 == 0) {
                j3 = -this.f1;
            }
        }
        this.fragmentView = new sv0(this, context);
        jh.k kVar = new jh.k(this.fragmentView);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        dh.c cVar = this.P6;
        cVar.g(kVar, viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        if (this.s1) {
            this.w5 = new FrameLayout(context);
            this.x5 = new FrameLayout[2];
            this.A5 = new hi.d[2];
            int i13 = 0;
            for (int i14 = 2; i13 < i14; i14 = 2) {
                eh0 eh0Var = new eh0(context);
                fh.g b10 = getBaseSimpleGlass().c.b(eh0Var, new gh.b(org.telegram.ui.ActionBar.j6.d6, this.A0));
                b10.q(org.telegram.messenger.g0.L(8.0f));
                b10.r(org.telegram.messenger.g0.L(22.0f));
                eh0Var.setBackground(b10);
                this.x5[i13] = new FrameLayout(context);
                this.A5[i13] = new hi.d(context, this.A0);
                this.A5[i13].setRoundRadius(org.telegram.messenger.g0.L(19.0f));
                this.A5[i13].setUseWrapContent(true);
                this.A5[i13].setPadding(org.telegram.messenger.g0.L(16.0f), r02, org.telegram.messenger.g0.L(16.0f), r02);
                if (i13 == 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                    this.y5 = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.filled_premium_camera), r02, 1, 33);
                    this.y5.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.L0(2131744809));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
                    this.z5 = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.eq(R.drawable.filled_add_album), r02, 1, 33);
                    this.z5.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.L0(2131744804));
                    this.A5[i13].h(this.y5, r02);
                } else {
                    this.A5[i13].h(org.telegram.messenger.hd.L0(2131744486), r02);
                }
                eh0Var.setOnClickListener(new mu0(this, i13, r02));
                c8.na.b(eh0Var, 0.02f, 1.2f);
                this.A5[i13].setStateListAnimator(stateListAnimator);
                eh0Var.addView(this.A5[i13], c8.ja.e(-2, -1, 17));
                this.x5[i13].addView(eh0Var, c8.ja.e(-2, 60, 1));
                this.w5.addView(this.x5[i13], c8.ja.e(-1, -1, 87));
                if (i13 == 1 || !getMessagesController().X4()) {
                    a5(this.x5[i13], 1.0f);
                }
                i13++;
                r02 = 0;
                stateListAnimator = null;
            }
        }
        TLRPC.ChatFull chatFull2 = this.v2;
        ArrayList arrayList = (chatFull2 == null || (chatParticipants = chatFull2.participants) == null || chatParticipants.participants.size() <= 5) ? null : this.D2;
        if (this.x1) {
            i7 = 6;
            z10 = true;
        } else if (!this.t1 || (((userFull = this.w2) == null || userFull.stargifts_count <= 0) && ((chatFull = this.v2) == null || chatFull.stargifts_count <= 0))) {
            z10 = true;
            i7 = this.r1 ? 10 : arrayList != null ? 7 : -1;
        } else {
            z10 = true;
            this.w1 = true;
            i7 = 14;
        }
        U3(context);
        int i15 = i7;
        org.telegram.ui.Components.qs0 qs0Var = this.R;
        TLRPC.UserFull userFull3 = this.w2;
        long j10 = j3;
        uv0 uv0Var2 = new uv0(this, context, j10, qs0Var, userFull3 != null ? userFull3.common_chats_count : 0, this.D2, this.v2, userFull3, i15, this.y1, this, this, this.A0, getBaseSimpleGlass().c);
        this.O = uv0Var2;
        uv0Var2.setLayoutParams(new v4.p0(-1, -1));
        int i16 = 4;
        if (this.e1 == 0 || this.r0 == null || this.s1) {
            this.c0 = new org.telegram.ui.Components.cg0(context);
            org.telegram.ui.Components.if0 if0Var = new org.telegram.ui.Components.if0(context);
            this.d0 = if0Var;
            this.c0.setTrailingView(if0Var);
            org.telegram.ui.Components.lf0 lf0Var = this.M5;
            if (lf0Var != null) {
                this.c0.setGlassFactory(lf0Var.c);
            }
            this.d0.setOnClickListener(new wt0(this, i16));
            this.c0.setColor(this.l6);
            TLRPC.UserFull userFull4 = this.w2;
            if (userFull4 != null && (document = userFull4.saved_music) != null) {
                this.c0.setMusicDocument(document);
            }
            int i17 = 5;
            this.c0.setOnClickListener(new wt0(this, i17));
            this.a0 = new org.telegram.ui.Components.hf0(context, org.telegram.messenger.g0.L(74.0f));
            Y4();
            r12 = 0;
            I5(false);
            this.a0.setOnActionClickListener(new qt0(this, i17));
        } else {
            r12 = 0;
        }
        org.telegram.ui.ActionBar.c5 r10 = this.simpleActionBar.r();
        if (this.e1 == getUserConfig().n && !this.s1) {
            if (org.telegram.messenger.g5.r(this.currentAccount).v(7) == null) {
                org.telegram.messenger.g5.r(this.currentAccount).C();
            }
        }
        if (this.r0 != null && !this.s1) {
            org.telegram.ui.ActionBar.d5 b11 = r10.b(32, R.drawable.outline_header_search);
            b11.N();
            b11.K(new kg.x1(this, 19));
            this.U0 = b11;
            b11.setContentDescription(org.telegram.messenger.hd.L0(2131745759));
            this.U0.setSearchFieldHint(org.telegram.messenger.hd.L0(2131745759));
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
        org.telegram.ui.ActionBar.d5 b12 = r10.b(16, R.drawable.profile_video);
        this.R0 = b12;
        b12.setContentDescription(org.telegram.messenger.hd.L0(2131743611));
        if (this.f1 != 0) {
            this.Q0 = r10.b(15, R.drawable.msg_voicechat2);
            if (org.telegram.messenger.t3.W(this.F2)) {
                this.Q0.setContentDescription(org.telegram.messenger.hd.L0(2131743447));
            } else {
                this.Q0.setContentDescription(org.telegram.messenger.hd.L0(2131743306));
            }
        } else {
            org.telegram.ui.ActionBar.d5 b13 = r10.b(15, R.drawable.call);
            this.Q0 = b13;
            b13.setContentDescription(org.telegram.messenger.hd.L0(2131752634));
        }
        if (this.s1) {
            org.telegram.ui.ActionBar.d5 b14 = r10.b(41, R.drawable.group_edit_profile);
            this.S0 = b14;
            b14.setContentDescription(org.telegram.messenger.hd.L0(2131751335));
        } else {
            org.telegram.ui.ActionBar.d5 b15 = r10.b(12, R.drawable.group_edit_profile);
            this.S0 = b15;
            b15.setContentDescription(org.telegram.messenger.hd.L0(2131751335));
        }
        org.telegram.ui.ActionBar.d5 a10 = r10.a();
        this.T0 = a10;
        a10.setSubMenuDelegate(new nu0(this));
        ImageView imageView = new ImageView(context);
        this.Y0 = imageView;
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.v8, this.A0, PorterDuff.Mode.MULTIPLY);
        org.telegram.messenger.g0.V3(0.8f, this.Y0, r12, r12);
        this.Y0.setImageResource(R.drawable.msg_mini_autodelete_timer);
        this.T0.addView(this.Y0, c8.ja.d(12, 12.0f, 19, 8.0f, 2.0f, 0.0f, 0.0f));
        this.T0.setContentDescription(org.telegram.messenger.hd.L0(2131754839));
        this.T0.M(cVar, c8.g0.g(this.resourceProvider));
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
        R3(r12);
        this.d = new iw0(this, context);
        this.e = new sw0(context, this);
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8();
        this.q0 = t8Var;
        t8Var.p = 2.3809524f;
        t8Var.t();
        this.fragmentView.setWillNotDraw(r12);
        sv0 sv0Var = (sv0) this.fragmentView;
        this.q5 = sv0Var;
        sv0Var.setClipChildren(r12);
        ou0 ou0Var = new ou0(this, context, this.A0);
        this.a = ou0Var;
        ou0Var.setLegacySections(r12);
        this.a.r1();
        ou0 ou0Var2 = this.a;
        ou0Var2.getClass();
        ou0Var2.setSectionsOverscanTop(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
        ou0 ou0Var3 = this.a;
        int i18 = org.telegram.ui.ActionBar.j6.a7;
        org.telegram.ui.ActionBar.q6.h(i18, ou0Var3, this.A0);
        this.a.setVerticalScrollBarEnabled(r12);
        dh.k kVar2 = new dh.k(this.a, (ViewGroup) this.fragmentView, new n40(this, 1));
        kVar2.h = true;
        qu0 qu0Var = new qu0(this);
        this.a.setItemAnimator(qu0Var);
        int i19 = i10;
        qu0Var.e = 320L;
        qu0Var.d = 320L;
        qu0Var.c = 320L;
        qu0Var.m = r12;
        qu0Var.S();
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        qu0Var.o(erVar);
        this.a.setClipToPadding(r12);
        this.a.setClipChildren(r12);
        this.a.setHideIfEmpty(r12);
        ru0 ru0Var = new ru0(this);
        this.c = ru0Var;
        ru0Var.j1(1);
        ru0 ru0Var2 = this.c;
        ru0Var2.r = r12;
        this.a.setLayoutManager(ru0Var2);
        this.a.setGlowColor(r12);
        this.a.setAdapter(this.d);
        frameLayout.addView(this.a, c8.ja.e(-1, -1, 51));
        this.a.setOnItemClickListener(new di.h(this, context, j10, 7));
        this.a.setOnItemLongClickListener(new uu0(this, context));
        if (this.r1 || this.t1 || this.x1) {
            M5();
            J();
            this.r6 = true;
            this.p6 = this.L4;
            this.q6 = r12;
        }
        if (this.U0 != null) {
            org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context);
            this.b = uj0Var;
            uj0Var.setVerticalScrollBarEnabled(r12);
            this.b.setLayoutManager(new v4.b0(1, r12));
            org.telegram.ui.ActionBar.q6.H(this.b, org.telegram.ui.ActionBar.j6.e8, this.A0);
            this.b.setAdapter(this.e);
            e6Var = null;
            this.b.setItemAnimator(null);
            this.b.setVisibility(8);
            this.b.setLayoutAnimation(null);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, this.b, this.A0);
            frameLayout.addView(this.b, c8.ja.e(-1, -1, 51));
            this.b.setOnItemClickListener(new h(this, 28));
            this.b.setOnItemLongClickListener(new qt0(this, 6));
            this.b.setOnScrollListener(new vu0(this, r12));
            this.b.o1(1, true);
            org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context);
            this.P = cv0Var;
            cv0Var.setAnimateLayoutChange(true);
            this.P.e.setVisibility(8);
            this.P.setVisibility(8);
            frameLayout.addView(this.P);
            this.e.G();
        } else {
            e6Var = null;
        }
        int i20 = 3;
        if (this.E1 != 0) {
            i11 = i18;
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.E1));
            if (this.H2 == null) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = org.telegram.messenger.np.i1(M0);
                tL_channels_getParticipant.participant = getMessagesController().j1(this.e1);
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new eu0(this, 4));
            }
            eh0 eh0Var2 = new eh0(context, i20);
            eh0Var2.setWillNotDraw(r12);
            eh0Var2.setPadding(r12, r12, r12, org.telegram.messenger.g0.n);
            frameLayout.addView(eh0Var2, c8.ja.a(-1.0f, (org.telegram.messenger.g0.n / org.telegram.messenger.g0.p) + 51.0f, 83));
            eh0Var2.setOnClickListener(new a90(14, this, M0));
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.p7, this.A0);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.hd.L0(2131753728));
            eh0Var2.addView(textView, c8.ja.d(-2, -2.0f, 17, 0.0f, 1.0f, 0.0f, 0.0f));
            this.a.setPadding(r12, i4(), r12, org.telegram.messenger.g0.L(48.0f));
            this.a.setBottomGlowOffset(org.telegram.messenger.g0.L(48.0f));
        } else {
            i11 = i18;
            this.a.setPadding(r12, i4(), r12, r12);
        }
        vw0 vw0Var = new vw0(this, context);
        this.d1 = vw0Var;
        vw0Var.a(this.l6, r12);
        this.d1.setBackgroundColor(getThemedColor(i11));
        frameLayout.addView(this.d1);
        org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
        this.e0 = oVar;
        oVar.setPivotX(org.telegram.messenger.g0.L(30.0f));
        this.e0.setPivotY(org.telegram.messenger.g0.L(30.0f));
        this.Y = new k0(21, context, this);
        this.Z = new ai.k0(25, context, this);
        ImageReceiver imageReceiver = new ImageReceiver(this.Z);
        this.v5 = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(11.0f));
        org.telegram.messenger.g0.V3(1.0f, this.Z, true, r12);
        this.Z.setClipChildren(r12);
        frameLayout.addView(this.Z, c8.ja.d(-1, -1.0f, 8388611, 0.0f, 0.0f, 0.0f, 0.0f));
        this.Y.setPivotX(0.0f);
        this.Y.setPivotY(0.0f);
        org.telegram.ui.Components.zf0 zf0Var = new org.telegram.ui.Components.zf0(context);
        this.u0 = zf0Var;
        zf0Var.addView(this.Y, c8.ja.e(100, 100, 51));
        this.Z.addView(this.u0, c8.ja.c(-1.0f, -1));
        xu0 xu0Var = new xu0(context);
        this.f0 = xu0Var;
        xu0Var.v(d4());
        this.f0.getImageReceiver().T(true);
        this.f0.setRoundRadiusForExpand(r4());
        this.f0.setPivotX(0.0f);
        this.f0.setPivotY(0.0f);
        this.Y.addView(this.f0, c8.ja.c(-1.0f, -1));
        this.f0.setOnClickListener(new wt0(this, 11));
        this.f0.setHasStories(z4());
        this.f0.setOnLongClickListener(new t(this, 6));
        org.telegram.ui.Cells.b4 b4Var = new org.telegram.ui.Cells.b4(this, context);
        this.h0 = b4Var;
        b4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        this.h0.setProgressColor(-1);
        this.h0.setNoProgress(r12);
        this.Y.addView(this.h0, c8.ja.c(-1.0f, -1));
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
        org.telegram.ui.Components.c01 c01Var = new org.telegram.ui.Components.c01(context, e6Var);
        this.m0 = c01Var;
        imageView4.setImageDrawable(c01Var);
        this.i0.setTranslationY(-1.0f);
        frameLayout.addView(this.i0, c8.ja.e(34, 34, 51));
        ImageView imageView5 = new ImageView(context);
        this.j0 = imageView5;
        imageView5.setScaleType(scaleType);
        this.j0.setAlpha(0.0f);
        this.j0.setImageDrawable(new ih.c());
        frameLayout.addView(this.j0, c8.ja.e(16, 16, 51));
        ImageView imageView6 = new ImageView(context);
        this.k0 = imageView6;
        imageView6.setImageResource(R.drawable.star_small_outline);
        org.telegram.ui.ActionBar.q6.s(this.k0, org.telegram.ui.ActionBar.j6.s8, this.A0, PorterDuff.Mode.SRC_IN);
        this.k0.setAlpha(0.0f);
        this.k0.setScaleY(0.0f);
        this.k0.setScaleX(0.0f);
        frameLayout.addView(this.k0, c8.ja.e(20, 20, 51));
        ImageView imageView7 = new ImageView(context);
        this.l0 = imageView7;
        imageView7.setImageResource(R.drawable.star_small_inner);
        this.l0.setAlpha(0.0f);
        this.l0.setScaleY(0.0f);
        this.l0.setScaleX(0.0f);
        frameLayout.addView(this.l0, c8.ja.e(20, 20, 51));
        N5();
        l5(r12, r12);
        yu0 yu0Var = this.o0;
        if (yu0Var != null) {
            yu0Var.K();
        }
        org.telegram.ui.Components.nf0 nf0Var = this.n0;
        if (nf0Var != null) {
            nf0Var.d();
        }
        this.N = new jw0(this, context);
        org.telegram.ui.Components.nf0 nf0Var2 = new org.telegram.ui.Components.nf0(context);
        this.n0 = nf0Var2;
        nf0Var2.setSize(d4());
        long j11 = this.e1;
        if (j11 == 0) {
            j11 = -this.f1;
        }
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        ou0 ou0Var4 = this.a;
        long j12 = j11;
        xu0 xu0Var2 = this.f0;
        getClassGuid();
        int i21 = 3;
        this.o0 = new yu0(this, context, j12, kVar3, ou0Var4, xu0Var2, this.N, this.n0);
        if (this.e1 != getUserConfig().n && (userFull2 = this.w2) != null) {
            this.r5 = userFull2.profile_photo == null ? 0.0f : 1.0f;
        }
        if (!this.q1) {
            this.o0.setChatInfo(this.v2);
        }
        this.Z.addView(this.o0);
        this.Z.addView(this.n0, c8.ja.c(138.0f, -1));
        this.Z.addView(this.N);
        org.telegram.ui.Components.hf0 hf0Var = this.a0;
        if (hf0Var != null) {
            this.Z.addView(hf0Var, c8.ja.c(-1.0f, -1));
        }
        org.telegram.ui.Components.cg0 cg0Var = this.c0;
        if (cg0Var != null) {
            this.Z.addView(cg0Var, c8.ja.c(-1.0f, -1));
            this.Z.addView(this.d0, c8.ja.c(-1.0f, -1));
        }
        this.f0.setAvatarsViewPager(this.o0);
        lw0 lw0Var = new lw0(this, context);
        this.p0 = lw0Var;
        this.Z.addView(lw0Var, c8.ja.c(-1.0f, -1));
        frameLayout.addView(this.actionBar);
        ok okVar = new ok(i21, context, this);
        this.f = okVar;
        okVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.mi));
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
        this.Z.addView(this.f, c8.ja.d(-2, -2.0f, 51, 109.0f, -6.0f, 0.0f, 0.0f));
        zu0 zu0Var = new zu0(this, context);
        this.r = zu0Var;
        zu0Var.setEllipsizeByGradient(true);
        this.r.setTextColor(H3(getThemedColor(org.telegram.ui.ActionBar.j6.B8), null));
        this.r.setTextSizePx(org.telegram.messenger.g0.L(13.5f));
        this.r.setGravity(3);
        this.r.setPivotX(org.telegram.messenger.g0.L(8.0f));
        this.r.setPivotY(org.telegram.messenger.g0.L(8.0f));
        this.r.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        this.r.setFocusable(true);
        this.Z.addView(this.r, c8.ja.d(-2, -2.0f, 51, 105.0f, -2.0f, 4.0f, 0.0f));
        P3();
        this.Z.addView(this.e0);
        org.telegram.ui.Components.mu0 mu0Var = new org.telegram.ui.Components.mu0(context);
        this.T = mu0Var;
        mu0Var.setLayoutParams(c8.ja.d(32, 32.0f, 3, 103.0f, -2.0f, 0.0f, 0.0f));
        this.T.setResourcesProvider(this.A0);
        Q3();
        this.T.setDelegate(new qt0(this, 1));
        this.T.setOnClickListener(new wt0(this, r12));
        TLRPC.UserFull userFull5 = this.w2;
        if (userFull5 != null) {
            this.T.set(userFull5.stars_rating);
        }
        this.Z.addView(this.T);
        this.v0 = new av0(this, context, this.currentAccount, a(), this.q1, this.Y, this.f0, this.A0, context);
        O5(r12);
        TLRPC.UserFull userFull6 = this.w2;
        if (userFull6 != null) {
            this.v0.setStories(userFull6.stories);
        } else {
            TLRPC.ChatFull chatFull3 = this.v2;
            if (chatFull3 != null) {
                this.v0.setStories(chatFull3.stories);
            }
        }
        xu0 xu0Var3 = this.f0;
        if (xu0Var3 != null) {
            xu0Var3.setHasStories(z4());
        }
        this.Z.addView(this.v0, c8.ja.c(-1.0f, -1));
        di.u0 u0Var = new di.u0(context, this.currentAccount, a(), this.Y);
        this.w0 = u0Var;
        this.Z.addView(u0Var, (int) r12, c8.ja.c(-1.0f, -1));
        L5(true);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        this.s = fh0Var;
        if (this.a0 != null) {
            fh0Var.setVisibility(8);
        }
        T5();
        if (this.e1 == 0) {
            this.s.setImageResource(R.drawable.profile_discuss);
            this.s.setContentDescription(org.telegram.messenger.hd.L0(2131743555));
        } else if (this.r0 != null) {
            this.V = new org.telegram.ui.Components.ch0(R.raw.camera_outline, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            this.W = new org.telegram.ui.Components.ch0(R.raw.camera_outline, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), false, null);
            org.telegram.ui.Components.hf0 hf0Var2 = this.a0;
            if (hf0Var2 != null) {
                hf0Var2.e();
                this.a0.a();
                this.a0.b();
                this.a0.c();
                org.telegram.ui.Components.hf0 hf0Var3 = this.a0;
                if (hf0Var3.G) {
                    hf0Var3.G = r12;
                    hf0Var3.d();
                }
            } else {
                this.s.setAnimation(this.V);
                this.s.setContentDescription(org.telegram.messenger.hd.L0(2131754905));
                this.s.setPadding(org.telegram.messenger.g0.L(2.0f), r12, r12, org.telegram.messenger.g0.L(2.0f));
            }
        } else {
            org.telegram.ui.Components.hf0 hf0Var4 = this.a0;
            if (hf0Var4 != 0) {
                hf0Var4.o(r12, true);
            }
            this.s.setImageResource(R.drawable.profile_newmsg);
            this.s.setContentDescription(org.telegram.messenger.hd.L0(2131754819));
        }
        this.s.setScaleType(scaleType);
        frameLayout.addView(this.s, c8.ja.d(60, 60.0f, 53, 0.0f, 0.0f, 16.0f, 0.0f));
        this.s.setOnClickListener(new wt0(this, 1));
        A4(r12);
        if (i19 != -1 && obj != null) {
            this.s.setTag(Integer.valueOf((int) r12));
            this.s.setScaleX(0.2f);
            this.s.setScaleY(0.2f);
            this.s.setAlpha(0.0f);
        }
        this.a.setOnScrollListener(new vu0(this, 1));
        UndoView undoView = new UndoView(context, null, r12, this.A0);
        this.M = undoView;
        frameLayout.addView(undoView, c8.ja.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.k2 = ofFloat;
        ofFloat.addUpdateListener(new zt0(this, 1));
        this.k2.setInterpolator(erVar);
        this.k2.addListener(new bv0(this, r12));
        M5();
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
        frameLayout.addView(this.X, c8.ja.e(-1, org.telegram.messenger.ns.g2, 55));
        this.O.setForwardRestrictedHint(this.X);
        cv0 cv0Var2 = new cv0(this, (ViewGroup) getParentActivity().getWindow().getDecorView(), frameLayout);
        this.X4 = cv0Var2;
        cv0Var2.E = new nu0(this);
        this.o0.setPinchToZoomHelper(cv0Var2);
        this.y0.setAlpha(r12);
        this.z0.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.i6));
        Q5();
        rv rvVar = new rv(8, context, this);
        this.U = rvVar;
        int i22 = org.telegram.ui.ActionBar.j6.d6;
        rvVar.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i22), 100)));
        this.U.setFocusable((boolean) r12);
        this.U.setImportantForAccessibility(2);
        this.U.setOnClickListener(new wt0(this, 2));
        this.U.setVisibility(8);
        this.U.setFitsSystemWindows(true);
        this.q5.addView(this.U, c8.ja.c(-1.0f, -1));
        T3();
        if (this.s1) {
            i12 = 87;
            this.q5.addView(this.w5, c8.ja.e(-1, 60, 87));
        } else {
            i12 = 87;
        }
        org.telegram.ui.Components.hf0 hf0Var5 = this.a0;
        if (hf0Var5 != null && hf0Var5.k()) {
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
        this.C5 = frameLayout2;
        org.telegram.ui.ActionBar.q6.h(i22, frameLayout2, this.A0);
        View view = new View(context);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d7, view, this.A0);
        this.C5.addView(view, c8.ja.d(-1, 1.0f / org.telegram.messenger.g0.p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.D5 = new hi.d(context, this.A0);
        this.D5.h(org.telegram.messenger.hd.L0(2131745946), r12);
        this.C5.addView(this.D5, c8.ja.d(-1, 48.0f, org.telegram.messenger.ns.E1, 10.0f, (1.0f / org.telegram.messenger.g0.p) + 10.0f, 10.0f, 10.0f));
        this.D5.setOnClickListener(new wt0(this, 3));
        this.C5.setVisibility(8);
        this.C5.setTranslationY(org.telegram.messenger.g0.L(69.0f));
        this.q5.addView(this.C5, c8.ja.e(-1, -2, i12));
        this.Q6 = new di.f(7, this, kVar2);
        k5();
        r0.i0.l(this.fragmentView, new qt0(this, 4));
        return this.fragmentView;
    }

    public final int d4() {
        if (this.e1 == 0 || this.r0 == null || this.s1) {
            return org.telegram.messenger.g0.L(74 + ((this.J4 || this.K4) ? 25 : 0));
        }
        return 0;
    }

    public final void d5(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z == null || (tL_emojiStatusCollectible2 = this.I6) == tL_emojiStatusCollectible) {
            return;
        }
        if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
            this.I6 = tL_emojiStatusCollectible;
            hi.l3 l3Var = this.F6;
            int i7 = 1;
            if (l3Var != null) {
                l3Var.f(true);
            }
            if (tL_emojiStatusCollectible == null || TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                return;
            }
            this.H6 = null;
            this.F6 = new hi.l3(getParentActivity(), 3);
            this.G6 = org.telegram.ui.ActionBar.j6.w(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.j6.r1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
            this.F6.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
            hi.l3 l3Var2 = this.F6;
            int r12 = org.telegram.ui.ActionBar.j6.r1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
            l3Var2.M0 = true;
            l3Var2.U0 = System.currentTimeMillis();
            l3Var2.N0 = new Path();
            l3Var2.O0 = org.telegram.messenger.g0.N(0.66f) / 2.0f;
            l3Var2.P0 = new Paint(1);
            l3Var2.Q0 = new Paint(1);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, r12), org.telegram.ui.ActionBar.j6.r1(1.0f, r12), org.telegram.ui.ActionBar.j6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            l3Var2.T0 = linearGradient;
            l3Var2.Q0.setShader(linearGradient);
            l3Var2.R0 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, r12), org.telegram.ui.ActionBar.j6.r1(0.5f, r12), org.telegram.ui.ActionBar.j6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            l3Var2.S0 = new Matrix();
            l3Var2.P0.setShader(l3Var2.R0);
            l3Var2.Q0.setStyle(Paint.Style.STROKE);
            l3Var2.Q0.setStrokeJoin(Paint.Join.ROUND);
            l3Var2.Q0.setStrokeCap(Paint.Cap.ROUND);
            l3Var2.Q0.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
            this.Z.addView(this.F6, c8.ja.c(24.0f, -1));
            this.F6.v(9.33f);
            hi.l3 l3Var3 = this.F6;
            Typeface o4 = org.telegram.messenger.g0.o();
            l3Var3.I.x(o4);
            l3Var3.K.setTypeface(o4);
            this.F6.u(tL_emojiStatusCollectible.title);
            hi.l3 l3Var4 = this.F6;
            l3Var4.d = -1L;
            l3Var4.n(5.66f, 2.66f, 5.66f, 2.66f);
            hi.l3 l3Var5 = this.F6;
            l3Var5.getClass();
            l3Var5.E = org.telegram.messenger.g0.N(4.0f);
            l3Var5.F = org.telegram.messenger.g0.N(2.66f);
            this.F6.t();
            this.F6.s(16.0f);
            this.F6.w();
            this.F6.setOnClickListener(new gu0(this, tL_emojiStatusCollectible.slug, i7));
            if (this.Q1 < org.telegram.messenger.g0.L(82.0f)) {
                this.H6 = Boolean.FALSE;
                this.F6.setAlpha(0.0f);
            }
            s5();
            hi.l3 l3Var6 = this.F6;
            Objects.requireNonNull(l3Var6);
            org.telegram.messenger.g0.i3(new py(l3Var6, i7), 6000L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        iw0 iw0Var;
        org.telegram.ui.ActionBar.o4 o4Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User a22;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.Chat chat;
        ou0 ou0Var;
        ou0 ou0Var2;
        org.telegram.ui.Components.cj0 cj0Var;
        if (i7 == org.telegram.messenger.ns.B5 || i7 == org.telegram.messenger.ns.p3) {
            if (org.telegram.messenger.t3.R(org.telegram.messenger.np.s1(this.currentAccount).M0(Long.valueOf(this.f1)))) {
                getMessagesController().P1().k(a(), new fi.e(22), false, this.A0);
                return;
            }
            return;
        }
        int i11 = 0;
        r3 = false;
        boolean z10 = false;
        if (i7 == org.telegram.messenger.ns.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.np.D8;
            Object[] objArr2 = ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & TLObject.FLAG_19) == 0) ? false : true;
            if (this.e1 != 0) {
                if (objArr2 != false) {
                    L5(true);
                }
                if ((intValue & 1024) == 0 || (ou0Var2 = this.a) == null || (cj0Var = (org.telegram.ui.Components.cj0) ou0Var2.L(this.H3, false)) == null) {
                    return;
                }
                this.d.t(cj0Var, this.H3);
                return;
            }
            if (this.f1 != 0) {
                int i13 = intValue & TLObject.FLAG_13;
                if (i13 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                    if (i13 != 0) {
                        G5(true, false);
                    } else {
                        J5(true);
                    }
                    L5(true);
                }
                if (!objArr2 == true || (ou0Var = this.a) == null) {
                    return;
                }
                int childCount = ou0Var.getChildCount();
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
        if (i7 == org.telegram.messenger.ns.g1) {
            Long l10 = (Long) objArr[0];
            if (this.v2 == null || (chat = this.F2) == null || chat.id != l10.longValue()) {
                return;
            }
            this.v2.online_count = ((Integer) objArr[1]).intValue();
            J5(true);
            L5(false);
            return;
        }
        if (i7 == org.telegram.messenger.ns.O || i7 == org.telegram.messenger.ns.b1) {
            R3(true);
            return;
        }
        if (i7 == org.telegram.messenger.ns.a0) {
            if (this.j1) {
                org.telegram.messenger.g0.h3(new mp0(11, this, objArr));
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.Y) {
            TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
            TLRPC.EncryptedChat encryptedChat2 = this.E2;
            if (encryptedChat2 == null || encryptedChat.id != encryptedChat2.id) {
                return;
            }
            this.E2 = encryptedChat;
            G5(false, false);
            org.telegram.messenger.n6 n6Var = this.Y1;
            if (n6Var != null) {
                n6Var.g();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.g0) {
            boolean z11 = this.k1;
            boolean z12 = getMessagesController().H0.indexOfKey(this.e1) >= 0;
            this.k1 = z12;
            if (z11 != z12) {
                R3(true);
                G5(false, false);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.w2) {
            Long l11 = (Long) objArr[0];
            if (this.F2 != null) {
                long longValue = l11.longValue();
                TLRPC.Chat chat2 = this.F2;
                if (longValue == chat2.id && org.telegram.messenger.t3.w(14, chat2)) {
                    TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(this.currentAccount).N0(l11.longValue());
                    if (N0 != null) {
                        TLRPC.ChatFull chatFull4 = this.v2;
                        if (chatFull4 != null) {
                            N0.participants = chatFull4.participants;
                        }
                        this.v2 = N0;
                    }
                    uv0 uv0Var = this.O;
                    if (uv0Var != null) {
                        uv0Var.setChatInfo(this.v2);
                    }
                    TLRPC.ChatFull chatFull5 = this.v2;
                    if (chatFull5 != null && (((inputGroupCall = chatFull5.call) == null && !this.p1) || (inputGroupCall != null && this.p1))) {
                        R3(false);
                    }
                    av0 av0Var = this.v0;
                    if (av0Var != null && (chatFull3 = this.v2) != null) {
                        av0Var.setStories(chatFull3.stories);
                    }
                    di.u0 u0Var = this.w0;
                    if (u0Var != null) {
                        u0Var.a();
                    }
                    xu0 xu0Var = this.f0;
                    if (xu0Var != null) {
                        xu0Var.setHasStories(z4());
                    }
                    if (l11.longValue() != 0) {
                        boolean z13 = org.telegram.messenger.r2.a;
                        r2 = (getMessagesController().i7 || (chatFull2 = this.v2) == null || !chatFull2.stargifts_available) ? false : true;
                        this.T0.R(38, r2);
                        org.telegram.ui.Components.hf0 hf0Var = this.a0;
                        if (hf0Var != null) {
                            hf0Var.o(3, r2);
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
        if (i7 == org.telegram.messenger.ns.T) {
            TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
            if (this.e1 != 0 && (a22 = getMessagesController().a2(Long.valueOf(this.e1))) != null && chatFull6.id == a22.linked_community_id) {
                G5(true, false);
            }
            TLRPC.Chat chat3 = this.F2;
            if (chat3 != null && chatFull6.id == chat3.linked_community_id) {
                G5(true, false);
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
                        getMediaDataController().d0(0, this.classGuid, this.m1, this.g1, true);
                    }
                }
                a4();
                yu0 yu0Var = this.o0;
                if (yu0Var != null && !this.q1) {
                    yu0Var.setChatInfo(this.v2);
                }
                G5(true, false);
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                if (M0 != null) {
                    this.F2 = M0;
                    R3(true);
                }
                org.telegram.messenger.n6 n6Var2 = this.Y1;
                if (n6Var2 != null) {
                    n6Var2.g();
                }
                if (this.F2.megagroup && (objArr3 != false || !booleanValue)) {
                    g4(true);
                }
                q5();
                Q5();
                av0 av0Var2 = this.v0;
                if (av0Var2 != null && (chatFull = this.v2) != null) {
                    av0Var2.setStories(chatFull.stories);
                }
                di.u0 u0Var2 = this.w0;
                if (u0Var2 != null) {
                    u0Var2.a();
                }
                xu0 xu0Var2 = this.f0;
                if (xu0Var2 != null) {
                    xu0Var2.setHasStories(z4());
                }
                uv0 uv0Var2 = this.O;
                if (uv0Var2 != null) {
                    uv0Var2.setChatInfo(this.v2);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.t) {
            removeSelfFromStack(true);
            return;
        }
        if (i7 == org.telegram.messenger.ns.v) {
            long longValue2 = ((Long) objArr[0]).longValue();
            boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
            if (longValue2 == a() && (o4Var = this.parentLayout) != null && o4Var.getFragmentStack().contains(this)) {
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
        if (i7 == org.telegram.messenger.ns.D0) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
            if (botInfo.user_id == this.e1) {
                this.G2 = botInfo;
                G5(false, false);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.E0) {
            if (((Long) objArr[0]).longValue() == this.e1) {
                TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                this.w2 = userFull;
                org.telegram.ui.Components.mu0 mu0Var = this.T;
                if (mu0Var != null) {
                    mu0Var.set(userFull.stars_rating);
                }
                av0 av0Var3 = this.v0;
                if (av0Var3 != null) {
                    av0Var3.setStories(this.w2.stories);
                }
                di.u0 u0Var3 = this.w0;
                if (u0Var3 != null) {
                    u0Var3.a();
                }
                xu0 xu0Var3 = this.f0;
                if (xu0Var3 != null) {
                    xu0Var3.setHasStories(z4());
                }
                uv0 uv0Var3 = this.O;
                if (uv0Var3 != null) {
                    uv0Var3.setUserInfo(this.w2);
                }
                if (this.r0 != null) {
                    if (this.d != null && !TextUtils.equals(this.w2.about, this.A2)) {
                        this.d.g(this.X2);
                    }
                    if (this.s1) {
                        G5(false, false);
                    }
                } else {
                    if (this.G1 || this.L0) {
                        this.I1 = true;
                    } else {
                        R3(true);
                    }
                    G5(false, false);
                    uv0 uv0Var4 = this.O;
                    if (uv0Var4 != null) {
                        uv0Var4.setCommonGroupsCount(this.w2.common_chats_count);
                        W();
                        org.telegram.ui.Components.qs0 qs0Var = this.R;
                        if (qs0Var == null || qs0Var.E) {
                            resumeDelayedFragmentAnimation();
                            A4(true);
                        }
                    }
                }
                q5();
                Q5();
                if (this.x2 == null && !x4()) {
                    org.telegram.ui.Cells.d6 d6Var = new org.telegram.ui.Cells.d6(this.currentAccount);
                    this.x2 = d6Var;
                    k90 k90Var = new k90(this, 17);
                    if (d6Var.c) {
                        k90Var.run();
                    } else {
                        d6Var.h.add(k90Var);
                    }
                    this.x2.d(this.w2);
                }
                if (!x4()) {
                    ww0 ww0Var = this.z2;
                    ww0 c10 = ww0.c(this.currentAccount, this.w2, ww0Var);
                    this.z2 = c10;
                    this.y2 = c10 != ww0Var;
                    if (c10 != null) {
                        k90 k90Var2 = new k90(this, 18);
                        if (c10.b) {
                            k90Var2.run();
                        } else {
                            c10.h.add(k90Var2);
                        }
                    }
                }
                if (this.T0 != null) {
                    if (t4()) {
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
        if (i7 == org.telegram.messenger.ns.k0) {
            return;
        }
        if (i7 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && a() == ((Long) objArr[0]).longValue()) {
                ArrayList arrayList = (ArrayList) objArr[1];
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i15);
                    if (this.E2 != null) {
                        TLRPC.MessageAction messageAction = gjVar.k.action;
                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (iw0Var = this.d) != null) {
                            iw0Var.f();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.i4) {
            ou0 ou0Var3 = this.a;
            if (ou0Var3 != null) {
                ou0Var3.g1();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.x4) {
            G5(false, false);
            return;
        }
        if (i7 == org.telegram.messenger.ns.s1) {
            int i16 = this.d3;
            int i17 = this.b3;
            int i18 = this.Z2;
            M5();
            iw0 iw0Var2 = this.d;
            if (iw0Var2 != null) {
                if (i16 == this.d3 && i17 == this.b3 && i18 == this.Z2) {
                    return;
                }
                iw0Var2.f();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.q5) {
            if (this.q1) {
                L5(false);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.D1) {
            sw0 sw0Var = this.e;
            if (sw0Var != null) {
                sw0Var.c = sw0.H(this);
                this.e.w.clear();
                this.e.J();
                sw0 sw0Var2 = this.e;
                sw0Var2.I(sw0Var2.E);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.c0) {
            L5(false);
            return;
        }
        if (i7 == org.telegram.messenger.ns.v5 || i7 == org.telegram.messenger.ns.F5) {
            xu0 xu0Var4 = this.f0;
            if (xu0Var4 != null) {
                xu0Var4.setHasStories(z4());
                this.f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(r4(), 0.0f, this.l2));
            }
            av0 av0Var4 = this.v0;
            if (av0Var4 != null) {
                TLRPC.UserFull userFull3 = this.w2;
                if (userFull3 != null) {
                    av0Var4.setStories(userFull3.stories);
                    return;
                }
                TLRPC.ChatFull chatFull8 = this.v2;
                if (chatFull8 != null) {
                    av0Var4.setStories(chatFull8.stories);
                    return;
                }
                return;
            }
            return;
        }
        int i19 = 20;
        if (i7 == org.telegram.messenger.ns.i3) {
            org.telegram.ui.ActionBar.d5 d5Var = this.T0;
            if (d5Var != null) {
                TL_account.RequirementToContact J2 = getMessagesController().J2(this.e1);
                if (J2 != null && !(J2 instanceof TL_account.requirementToContactEmpty)) {
                    r2 = false;
                }
                d5Var.R(20, r2);
            }
            t5();
            return;
        }
        if (i7 == org.telegram.messenger.ns.f5) {
            t5();
            return;
        }
        if (i7 == org.telegram.messenger.ns.y3) {
            G5(false, false);
            return;
        }
        if (i7 == org.telegram.messenger.ns.C3) {
            G5(false, false);
            return;
        }
        if (i7 == org.telegram.messenger.ns.D3) {
            G5(false, false);
            return;
        }
        if (i7 == org.telegram.messenger.ns.y1) {
            if (a() == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.o4 o4Var2 = this.parentLayout;
                if (o4Var2 == null || o4Var2.getLastFragment() != this) {
                    removeSelfFromStack();
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.f3) {
            long longValue3 = ((Long) objArr[0]).longValue();
            if (this.L4 >= 0 || longValue3 != a()) {
                return;
            }
            M5();
            W();
            iw0 iw0Var3 = this.d;
            if (iw0Var3 != null) {
                iw0Var3.f();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.G3) {
            if (((Long) objArr[0]).longValue() != a() || x4()) {
                return;
            }
            if (this.L4 >= 0) {
                uv0 uv0Var5 = this.O;
                if (uv0Var5 != null) {
                    uv0Var5.P1(true);
                    return;
                }
                return;
            }
            M5();
            W();
            iw0 iw0Var4 = this.d;
            if (iw0Var4 != null) {
                iw0Var4.f();
            }
            org.telegram.messenger.g0.h3(new k90(this, 19));
            return;
        }
        if (i7 == org.telegram.messenger.ns.V3) {
            if (((Long) objArr[0]).longValue() != a() || this.e1 <= 0) {
                return;
            }
            TLRPC.UserFull b22 = getMessagesController().b2(this.e1);
            if (b22 != null) {
                this.w2 = b22;
            }
            M5();
            W();
            ou0 ou0Var4 = this.a;
            if (ou0Var4 != null && ou0Var4.c0()) {
                this.a.post(new k90(this, i19));
                return;
            }
            iw0 iw0Var5 = this.d;
            if (iw0Var5 != null) {
                iw0Var5.f();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ns.W3) {
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
            ArrayList arrayList2 = this.S4;
            if (i11 >= arrayList2.size()) {
                org.telegram.messenger.g0.a4(this.a);
                return;
            } else {
                ((TLRPC.ChatParticipant) arrayList2.get(i11)).setRank(longValue5, str);
                i11++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.m30 m30Var = this.r0;
        if (m30Var == null || !m30Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.m30 m30Var = this.r0;
        return (m30Var == null || dialog != m30Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final int e4(ImageReceiver imageReceiver) {
        return imageReceiver.t() instanceof org.telegram.ui.Components.g51 ? ((org.telegram.ui.Components.g51) imageReceiver.t()).a.a() : org.telegram.messenger.g0.p(this.f0.getImageReceiver().n());
    }

    @Override // org.telegram.ui.Components.nr0
    public final org.telegram.ui.Components.uj0 f() {
        return this.a;
    }

    public final org.telegram.ui.Components.e5 f4(long j3) {
        if (this.H == null) {
            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(17.0f), 2, this.f, false);
            this.H = e5Var;
            int L = org.telegram.messenger.g0.L(1.0f);
            e5Var.J = 0;
            e5Var.K = L;
            if (this.H0) {
                this.H.a();
            }
        }
        if (j3 != 0) {
            this.H.j(j3, false);
        } else {
            this.H.g(null, false);
        }
        u5();
        return this.H;
    }

    @Override // org.telegram.ui.Components.nr0
    public final TLRPC.Chat g() {
        return this.F2;
    }

    public final void g4(boolean z10) {
        a0.h hVar;
        if (this.B1 || (hVar = this.C1) == null || this.v2 == null) {
            return;
        }
        this.B1 = true;
        int i7 = (hVar.m() == 0 || !z10) ? 0 : org.telegram.messenger.ns.X4;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = getMessagesController().h1(this.f1);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = z10 ? 0 : this.C1.m();
        tL_channels_getParticipants.limit = org.telegram.messenger.ns.e3;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new jg.u(this, tL_channels_getParticipants, i7)), this.classGuid);
    }

    public final void g5(bw0 bw0Var) {
        if (this.m5 == bw0Var) {
            return;
        }
        this.m5 = bw0Var;
        org.telegram.messenger.g0.d0(this.a, new du0(this, 0));
    }

    public float getAvatarAnimationProgress() {
        return this.T1;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ uq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.A0;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        if (this.A0 != null) {
            return null;
        }
        g6 g6Var = new g6(18, this);
        ArrayList arrayList = new ArrayList();
        uv0 uv0Var = this.O;
        if (uv0Var != null) {
            arrayList.addAll(uv0Var.getThemeDescriptions());
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.q0}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.d8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.pi));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.x6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"detailTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.z6));
        int i7 = org.telegram.ui.ActionBar.j6.Ji;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 131072, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 196608, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 131072, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 196608, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.n6));
        if (this.V5) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.I}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Fj));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.d6));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.I}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.qi));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final int getThemedColor(int i7) {
        return org.telegram.ui.ActionBar.j6.w0(i7, this.A0);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final Drawable getThemedDrawable(String str) {
        org.telegram.ui.ActionBar.e6 e6Var = this.A0;
        Drawable drawable = e6Var != null ? e6Var.getDrawable(str) : null;
        return drawable != null ? drawable : super.getThemedDrawable(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0114, code lost:
    
        if (r25.inviter_id != getUserConfig().e()) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0116, code lost:
    
        if (r26 == false) goto L86;
     */
    @Override // org.telegram.ui.Components.nr0
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
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(chatParticipant.user_id));
                if (a22 != null) {
                    long j3 = chatParticipant.user_id;
                    this.B2 = j3;
                    boolean z23 = j3 == getUserConfig().e();
                    if (org.telegram.messenger.t3.T(this.F2)) {
                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        str = channelParticipant.rank;
                        z16 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        z15 = z16 || (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin);
                        z12 = z23;
                        getMessagesController().a2(Long.valueOf(chatParticipant.user_id));
                        z21 = org.telegram.messenger.t3.w(4, this.F2);
                        boolean z24 = org.telegram.messenger.t3.w(25, this.F2) && (!z15 || ((!z16 && channelParticipant.can_edit) || z12));
                        if (z16 || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit)) {
                            z21 = false;
                            z24 = false;
                        }
                        if ((z12 || (channelParticipant instanceof TLRPC.TL_channelParticipantSelf)) && org.telegram.messenger.t3.h(this.F2)) {
                            z24 = true;
                        }
                        z17 = org.telegram.messenger.t3.w(2, this.F2) && (!((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || z16) || channelParticipant.can_edit);
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
                        z17 = chat.creator || ((chatParticipant instanceof TLRPC.TL_chatParticipant) && (org.telegram.messenger.t3.w(2, chat) || chatParticipant.inviter_id == getUserConfig().e()));
                        TLRPC.Chat chat2 = this.F2;
                        boolean z25 = chat2.creator;
                        if (org.telegram.messenger.t3.w(25, chat2)) {
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
                        if (!z12 || !org.telegram.messenger.t3.h(this.F2)) {
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
                    } else if (org.telegram.messenger.t3.h(this.F2) || (z15 && org.telegram.messenger.t3.w(25, this.F2))) {
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
                    rt0 rt0Var = new rt0(this, channelParticipant2, a22, chatParticipant, z27, str);
                    String str2 = str;
                    Drawable U0 = view.getParent() instanceof org.telegram.ui.Components.uj0 ? ((org.telegram.ui.Components.uj0) view.getParent()).U0(view, false) : null;
                    org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(this, view);
                    H.W(U0);
                    H.w = false;
                    H.l(R.drawable.msg_discussion, org.telegram.messenger.hd.M0(2131745601, null), new st0(this, a22, i7), !z12);
                    if (!z12 && (z21 || z19 || z20 || z22)) {
                        H.k();
                    }
                    H.l((z15 || !TextUtils.isEmpty(str2)) ? R.drawable.menu_tag_edit : R.drawable.menu_tag_plus, org.telegram.messenger.hd.M0(z15 ? 2131751302 : TextUtils.isEmpty(str2) ? 2131754400 : 2131751275, null), new fi.r5(this, a22, str2, z15, z16), z19);
                    H.l(R.drawable.msg_admins, org.telegram.messenger.hd.M0(z27 ? 2131751304 : 2131745547, null), new ef0(rt0Var, 28), z21);
                    H.l(R.drawable.msg_permissions, org.telegram.messenger.hd.M0(2131752540, null), new hp(this, channelParticipant2, chatParticipant, a22, rt0Var, 29), z20);
                    H.m(R.drawable.msg_remove, new mp0(12, this, chatParticipant), org.telegram.messenger.hd.M0(2131749055, null), z22, true);
                    H.S = org.telegram.messenger.ns.U2;
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

    public final org.telegram.ui.Components.e5 h4(TLRPC.EmojiStatus emojiStatus, boolean z10) {
        if (this.G == null) {
            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 2, this.f, false);
            this.G = e5Var;
            if (this.H0) {
                e5Var.a();
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
                this.G.g(n4(), z10);
                this.G.m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
                this.F = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                this.G.j(tL_emojiStatusCollectible.document_id, z10);
                this.G.m(true, z10);
            } else {
                this.G.g(n4(), z10);
                this.G.m(false, z10);
            }
        } else {
            this.G.g(n4(), z10);
            this.G.m(false, z10);
        }
        u5();
        return this.G;
    }

    public final void h5(CharSequence charSequence) {
        this.a6 = charSequence;
        K5();
    }

    public final int i4() {
        return d4() + j4();
    }

    public final void i5(int i7) {
        SharedPreferences e12 = org.telegram.messenger.np.e1();
        if (org.telegram.messenger.g0.Q1()) {
            return;
        }
        this.K1 = i7 != 0;
        this.L1 = i7 != 0;
        N5();
        if (e12.getBoolean("view_animations", true)) {
            this.J1 = i7;
        } else if (i7 == 2) {
            this.n1 = true;
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.q2;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        int w02;
        if (this.q2) {
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.x()) {
            w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.w8, this.A0);
        } else if (this.V5 || this.E5 > 0.5f) {
            w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.A0);
        } else {
            org.telegram.messenger.cp cpVar = this.l6;
            w02 = cpVar != null ? cpVar.d(org.telegram.ui.ActionBar.j6.I.q()) : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.s8, this.A0);
        }
        return i0.a.h(w02) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r3.contains((int) r7.getX(), ((int) r7.getY()) - r6.actionBar.getMeasuredHeight()) != false) goto L20;
     */
    @Override // org.telegram.ui.ActionBar.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        uv0 uv0Var;
        yu0 yu0Var = this.o0;
        Rect rect = this.M2;
        if (yu0Var != null && yu0Var.getVisibility() == 0 && this.o0.getRealCount() > 1) {
            this.o0.getHitRect(rect);
            if (motionEvent != null) {
            }
        }
        if (this.L4 != -1 && (uv0Var = this.O) != null) {
            if (uv0Var.K0()) {
                this.O.getHitRect(rect);
                if (motionEvent == null || rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
                    uv0 uv0Var2 = this.O;
                    return uv0Var2.getSelectedTab() == uv0Var2.L0.getFirstTabId();
                }
            }
            return false;
        }
        return true;
    }

    public final int j4() {
        return d4() == 0 ? org.telegram.messenger.g0.L(168.0f) : org.telegram.messenger.g0.L(152.0f);
    }

    public final void j5(TLRPC.UserFull userFull, org.telegram.ui.Cells.d6 d6Var, ww0 ww0Var) {
        this.w2 = userFull;
        org.telegram.ui.Components.mu0 mu0Var = this.T;
        if (mu0Var != null) {
            mu0Var.set(userFull.stars_rating);
        }
        av0 av0Var = this.v0;
        if (av0Var != null) {
            av0Var.setStories(this.w2.stories);
        }
        di.u0 u0Var = this.w0;
        if (u0Var != null) {
            u0Var.a();
        }
        xu0 xu0Var = this.f0;
        if (xu0Var != null) {
            xu0Var.setHasStories(z4());
        }
        uv0 uv0Var = this.O;
        if (uv0Var != null) {
            uv0Var.setUserInfo(this.w2);
        }
        if (this.x2 == null) {
            this.x2 = d6Var;
        }
        if (this.x2 == null) {
            this.x2 = new org.telegram.ui.Cells.d6(this.currentAccount);
        }
        org.telegram.ui.Cells.d6 d6Var2 = this.x2;
        k90 k90Var = new k90(this, 22);
        if (d6Var2.c) {
            k90Var.run();
        } else {
            d6Var2.h.add(k90Var);
        }
        this.x2.d(this.w2);
        if (this.z2 == null) {
            this.z2 = ww0Var;
        }
        ww0 ww0Var2 = this.z2;
        boolean z10 = true;
        if (ww0Var2 == null) {
            ww0 c10 = ww0.c(this.currentAccount, this.w2, ww0Var2);
            this.z2 = c10;
            this.y2 = c10 != null;
        }
        ww0 ww0Var3 = this.z2;
        if (ww0Var3 != null) {
            k90 k90Var2 = new k90(this, 18);
            if (ww0Var3.b) {
                k90Var2.run();
            } else {
                ww0Var3.h.add(k90Var2);
            }
        }
        org.telegram.ui.ActionBar.d5 d5Var = this.T0;
        if (d5Var != null) {
            TL_account.RequirementToContact J2 = getMessagesController().J2(this.e1);
            if (J2 != null && !(J2 instanceof TL_account.requirementToContactEmpty)) {
                z10 = false;
            }
            d5Var.R(20, z10);
            if (t4()) {
                this.T0.T(44);
            } else {
                this.T0.u(44);
            }
        }
    }

    @Override // org.telegram.ui.ie0
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final float k4() {
        return Math.max(this.E5, this.U5);
    }

    public final void k5() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.lf0 lf0Var = new org.telegram.ui.Components.lf0(this.glassEngine, baseSimpleGlass);
        this.M5 = lf0Var;
        vw0 vw0Var = this.d1;
        if (vw0Var != null) {
            int i7 = vw0Var.I;
            boolean z10 = vw0Var.c;
            if (lf0Var.i != i7 || lf0Var.j != z10) {
                lf0Var.i = i7;
                lf0Var.j = z10;
                lf0Var.a();
            }
        }
        this.M5.b(this.N5);
        org.telegram.ui.Components.hf0 hf0Var = this.a0;
        if (hf0Var != null) {
            hf0Var.setGlassFactory(this.M5.c);
        }
        org.telegram.ui.Components.cg0 cg0Var = this.c0;
        if (cg0Var != null) {
            cg0Var.setGlassFactory(this.M5.c);
        }
        this.simpleActionBar.setButtonsGlass(this.M5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        sv0 sv0Var = this.q5;
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.e6 e6Var = this.A0;
        baseSimpleGlass.m = sv0Var;
        baseSimpleGlass.n = null;
        baseSimpleGlass.g(sv0Var, w4Var, e6Var);
        org.telegram.ui.ActionBar.w4 w4Var2 = this.simpleActionBar;
        org.telegram.ui.Components.lf0 lf0Var2 = this.M5;
        dh.c cVar = lf0Var2.e;
        ui.d dVar = lf0Var2.f;
        w4Var2.o0 = cVar;
        w4Var2.p0 = dVar;
        w4Var2.setBackground(null);
        this.K5 = c8.g0.l(this.A0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.L5);
        D5();
        baseSimpleGlass.o = this.Q6;
        View view = new View(getParentActivity());
        this.X5 = view;
        view.setAlpha(0.0f);
        this.q5.getViewTreeObserver().addOnPreDrawListener(new fk(this, 1));
        this.O.z(this.X5);
        View view2 = this.X5;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.F5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        sv0 sv0Var2 = this.q5;
        sv0Var2.addView(this.F5, sv0Var2.indexOfChild(this.Z), c8.ja.e(-1, 0, 48));
        this.glassEngine.b(this.a);
        this.O.setPagesGlassEngine(this.glassEngine);
        this.O.setOnTopPanelShiftChanged(new k90(this, 21));
        G3();
        A5();
    }

    public final float l4(float f10, float f11) {
        this.z6 = f10;
        this.B6 = f11;
        int i7 = this.J1;
        float l10 = Utilities.l(i7 == 2 ? 1.0f : (this.T1 >= 1.0f || i7 == 0) ? this.l2 : 0.0f);
        org.telegram.ui.Components.mu0 mu0Var = this.T;
        return Math.max(0.0f, (q4() + this.s5) * l10) + com.google.android.gms.internal.vision.e2.z(1.0f, l10, f11 * (mu0Var != null ? mu0Var.getVisibilityFactor() : 0.0f), f10);
    }

    public final void l5(boolean z10, boolean z11) {
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
            this.g0.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<org.telegram.ui.Cells.b4, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<org.telegram.ui.Cells.b4, Float>) View.ALPHA, 0.0f));
        }
        this.g0.setDuration(180L);
        this.g0.addListener(new lv0(this, z10, i7));
        this.g0.start();
    }

    public final float m4(float f10) {
        this.C6 = f10;
        int i7 = this.J1;
        return com.google.android.gms.internal.vision.e2.z(1.0f, Utilities.l(i7 == 2 ? 1.0f : (this.T1 >= 1.0f || i7 == 0) ? this.l2 : 0.0f), this.T != null ? this.T.getVisibilityFactor() * org.telegram.messenger.g0.L(3.0f) : 0.0f, f10);
    }

    public final void m5() {
        Long l10;
        if (this.R5 != null) {
            return;
        }
        e11[] e11VarArr = new e11[1];
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
        int L = (-(this.Z.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(i7);
        float L2 = org.telegram.messenger.g0.L(324.0f);
        Point point = org.telegram.messenger.g0.q;
        int min = (int) Math.min(L2, point.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = c8.i9.b(centerX - (min / 2), 0, point.x - min);
        ev0 ev0Var = new ev0(this, this, getParentActivity(), Integer.valueOf(Math.max(0, centerX - b10)), this.F2 == null ? 0 : 9, this.A0, i7, e11VarArr);
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
        if (a22 != null) {
            ev0Var.setExpireDateHint(org.telegram.messenger.m5.g(a22.emoji_status));
        }
        Long l11 = this.F;
        if (l11 != null) {
            ev0Var.setSelected(l11);
        } else {
            org.telegram.ui.Components.e5 e5Var = this.G;
            if (e5Var != null) {
                Drawable drawable = e5Var.f[0];
                if (drawable instanceof org.telegram.ui.Components.g5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.g5) drawable).h());
                    ev0Var.setSelected(l10);
                }
            }
            l10 = null;
            ev0Var.setSelected(l10);
        }
        ev0Var.setSaveState(3);
        ev0Var.y(this.G, this.f);
        fv0 fv0Var = new fv0(this, ev0Var);
        this.R5 = fv0Var;
        e11VarArr[0] = fv0Var;
        int[] iArr = new int[2];
        ok okVar2 = this.f;
        if (okVar2 != null) {
            okVar2.getLocationOnScreen(iArr);
        }
        e11VarArr[0].showAsDropDown(this.fragmentView, b10, L, 51);
        e11VarArr[0].b();
    }

    public final org.telegram.ui.Components.dr n4() {
        if (this.K == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            this.E = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.qi, this.A0), PorterDuff.Mode.MULTIPLY);
            this.K = new org.telegram.ui.Components.dr(this.E, getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return this.K;
    }

    public final void n5() {
        int i7 = 0;
        this.O.L0.setReordering(false);
        uv0 uv0Var = this.O;
        org.telegram.ui.Components.vq0 vq0Var = uv0Var.L0;
        if (uv0Var.y1 != null && vq0Var != null) {
            boolean C0 = uv0Var.C0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = vq0Var.getTabIds();
            int size = tabIds.size();
            while (i7 < size) {
                Integer num = tabIds.get(i7);
                i7++;
                TLRPC.ProfileTab o02 = org.telegram.ui.Components.ys0.o0(num.intValue(), C0);
                if (o02 != null) {
                    arrayList.add(o02);
                }
            }
        }
        this.O.P1(true);
        this.C5.animate().translationY(org.telegram.messenger.g0.L(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.er.h).withEndAction(new k90(this, 24)).start();
        org.telegram.ui.Components.cc.a0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean needDelayOpenAnimation() {
        return this.J1 == 0;
    }

    public final float o4(int i7) {
        org.telegram.ui.Components.qg qgVar = this.k5;
        if (qgVar == null || (qgVar instanceof an) || qgVar.r() == null) {
            return 1.0f;
        }
        org.telegram.ui.Components.sn r10 = this.k5.r();
        View titleTextView = i7 == 0 ? r10.getTitleTextView() : r10.getSubtitleTextView();
        float textSize = (i7 == 0 ? this.f : this.r).getPaint().getTextSize();
        if (!(titleTextView instanceof org.telegram.ui.ActionBar.j5) || textSize <= 0.0f) {
            return 1.0f;
        }
        return ((org.telegram.ui.ActionBar.j5) titleTextView).getPaint().getTextSize() / textSize;
    }

    public final void o5() {
        if (!this.q2) {
            zu0 zu0Var = this.r;
            if (zu0Var != null) {
                Object tag = zu0Var.getTag();
                if (tag instanceof Integer) {
                    this.r.setTextColor(H3(org.telegram.ui.ActionBar.j6.w0(((Integer) tag).intValue(), this.A0), Boolean.valueOf(this.K0[0])));
                } else {
                    this.r.setTextColor(H3(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B8, this.A0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.x;
            if (drawable != null) {
                drawable.setColorFilter(this.l6 != null ? -1 : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.gd, this.A0), PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.lk0 lk0Var = this.L;
            if (lk0Var != null) {
                lk0Var.b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h8, this.A0));
            }
            ok okVar = this.f;
            if (okVar != null) {
                okVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.mi, this.A0));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.H(this.l6 == null ? org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.v8, this.A0) : -1, false);
                this.actionBar.F(this.l6 != null ? 553648127 : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f8, this.A0), false);
            }
        }
        u5();
        S5();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        org.telegram.ui.Components.m30 m30Var = this.r0;
        if (m30Var != null) {
            m30Var.h(i7, i10, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.vq0 vq0Var;
        if (super.onBackPressed(z10)) {
            uv0 uv0Var = this.O;
            if (uv0Var == null || (vq0Var = uv0Var.L0) == null || !vq0Var.o0) {
                if (this.L4 == -1 || uv0Var == null || !uv0Var.F1) {
                    return this.actionBar.isEnabled();
                }
                if (z10) {
                    uv0Var.V(true);
                }
            } else if (z10) {
                n5();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        super.onBecomeFullyHidden();
        this.s6 = false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        T5();
        this.s6 = true;
        T3();
        if (!this.J0 || this.p5 || (view = this.fragmentView) == null) {
            return;
        }
        this.p5 = true;
        this.W4 = true;
        view.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        super.onConfigurationChanged(configuration);
        uv0 uv0Var = this.O;
        if (uv0Var != null) {
            uv0Var.onConfigurationChanged(configuration);
        }
        u4();
        if (this.o2 && this.q2 && (m10 = this.c.m(0)) != null) {
            this.a.scrollBy(0, m10.getTop() - i4());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new e7(this, 5));
    }

    @Override // org.telegram.ui.ActionBar.e2
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
        yw ywVar;
        uv uvVar;
        if (!this.J0) {
            M5();
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
                this.j5 = null;
                org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
                int i7 = 2;
                if (o4Var != null && o4Var.getFragmentStack().size() >= 2) {
                    Object obj2 = (org.telegram.ui.ActionBar.e2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    if (obj2 instanceof org.telegram.ui.Components.qg) {
                        this.k5 = (org.telegram.ui.Components.qg) obj2;
                    }
                    if (obj2 instanceof je0) {
                        obj2 = ((je0) obj2).K;
                    }
                    if ((obj2 instanceof yw) && (uvVar = (ywVar = (yw) obj2).H3) != null) {
                        bw bwVar = uvVar.a;
                        if (com.google.android.gms.internal.vision.e2.s(bwVar)) {
                            this.j5 = ywVar;
                            this.k5 = bwVar;
                        }
                    }
                }
                Object obj3 = this.k5;
                if (obj3 == null || ((org.telegram.ui.ActionBar.e2) obj3).getActionBar() == null) {
                    kVar = null;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.e2) this.k5).getActionBar();
                    kVar.setSkipDrawChild(true);
                }
                org.telegram.ui.Components.qg qgVar = this.k5;
                boolean z13 = (qgVar instanceof an) && ((an) qgVar).e != null;
                if (qgVar != null) {
                    ImageView imageView5 = this.j0;
                    if (imageView5 != null) {
                        if (!(qgVar instanceof an) || (chat = ((an) qgVar).e) == null || chat.linked_community_id == 0) {
                            imageView5.setTag(null);
                            this.j0.setVisibility(8);
                        } else {
                            imageView5.setTag(1);
                            this.j0.setVisibility(0);
                        }
                    }
                    if (this.m0 != null) {
                        org.telegram.ui.Components.qg qgVar2 = this.k5;
                        if ((qgVar2 instanceof an) && org.telegram.messenger.t3.p0(((an) qgVar2).e)) {
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
                    N5();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(this.J1 == 2 ? 250L : 180L);
                this.a.setLayerType(2, null);
                if (z10) {
                    this.i6 = 0.0f;
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
                        this.S1 = i4();
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
                    org.telegram.ui.Components.fh0 fh0Var = this.s;
                    if (fh0Var != null && fh0Var.getTag() == null) {
                        this.s.setScaleX(0.2f);
                        this.s.setScaleY(0.2f);
                        this.s.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.SCALE_X, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.SCALE_Y, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.ALPHA, 1.0f));
                    }
                    av0 av0Var = this.v0;
                    if (av0Var != null && this.J1 == 2) {
                        av0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.v0, (Property<av0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.J1 == 2) {
                        this.s0 = e4(this.f0.getImageReceiver());
                        this.f.setTextColor(-1);
                        this.r.setTextColor(-1275068417);
                        this.actionBar.F(1090519039, false);
                        tw0 tw0Var = this.D6;
                        if (tw0Var != null) {
                            tw0Var.a(603979775);
                        }
                        jw0 jw0Var = this.N;
                        jw0Var.F = true;
                        jw0Var.setVisibility(0);
                    }
                    if (this.J1 == 2) {
                        this.f.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<ok, Float>) View.ALPHA, 1.0f));
                    } else {
                        this.f.setAlpha(1.0f);
                    }
                    if (this.v0 != null) {
                        if (a() > j10) {
                            this.v0.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.v0, (Property<av0, Float>) View.ALPHA, 1.0f));
                        } else {
                            this.v0.setAlpha(1.0f);
                            this.v0.setFragmentTransitionProgress(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.v0, "fragmentTransitionProgress", 1.0f));
                        }
                    }
                    di.u0 u0Var = this.w0;
                    if (u0Var != null) {
                        u0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.w0, (Property<di.u0, Float>) View.ALPHA, 1.0f));
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
                        arrayList.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.d5, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.d5, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.O0) {
                        this.S0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.d5, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.Y0.getTag() != null) {
                        this.Y0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.Y0, (Property<ImageView, Float>) View.ALPHA, 1.0f));
                    }
                    xu0 xu0Var = this.f0;
                    if (xu0Var != null) {
                        xu0Var.setCrossfadeProgress(1.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f0, vv0.h0, 0.0f));
                    }
                    org.telegram.ui.Components.qg qgVar3 = this.k5;
                    if (qgVar3 != null) {
                        org.telegram.ui.Components.sn r10 = qgVar3.r();
                        if (r10 != null) {
                            org.telegram.ui.Components.on onVar = r10.e;
                            yw ywVar2 = this.j5;
                            View D = (ywVar2 == null || ywVar2.getFragmentView() == null) ? this.k5.D() : this.j5.getFragmentView();
                            RectF rectF = this.j6;
                            this.i6 = jh.k.c(onVar, D, rectF) ? rectF.left : 0.0f;
                        }
                        if ((r10 != null && (r10.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.j5) && ((org.telegram.ui.ActionBar.j5) r10.getSubtitleTextView()).getLeftDrawable() != null) || r10.T[0] || w4(r10)) {
                            View subtitleTextView = r10.getSubtitleTextView();
                            this.Y4 = subtitleTextView;
                            this.Z4 = ((this.k5 instanceof an) || subtitleTextView == null) ? 0.0f : this.r.getPaddingLeft() - this.Y4.getPaddingLeft();
                            this.Z.invalidate();
                            this.r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<zu0, Float>) View.ALPHA, 1.0f));
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
                            arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<zu0, Float>) View.ALPHA, 1.0f));
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
                    org.telegram.ui.Components.fh0 fh0Var2 = this.s;
                    if (fh0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(fh0Var2, (Property<org.telegram.ui.Components.fh0, Float>) View.SCALE_X, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.SCALE_Y, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.J1 == 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f, (Property<ok, Float>) View.ALPHA, 0.0f));
                    }
                    av0 av0Var2 = this.v0;
                    if (av0Var2 != null) {
                        if (this.i1 > 0) {
                            arrayList2.add(ObjectAnimator.ofFloat(av0Var2, (Property<av0, Float>) View.ALPHA, 0.0f));
                        } else {
                            arrayList2.add(ObjectAnimator.ofFloat(av0Var2, "fragmentTransitionProgress", 0.0f));
                        }
                    }
                    di.u0 u0Var2 = this.w0;
                    if (u0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(u0Var2, (Property<di.u0, Float>) View.ALPHA, 0.0f));
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
                        arrayList2.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.d5, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.d5, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.O0) {
                        this.S0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.d5, Float>) View.ALPHA, 0.0f));
                    }
                    ImageView imageView6 = this.Y0;
                    if (imageView6 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) View.ALPHA, imageView6.getAlpha(), 0.0f));
                    }
                    xu0 xu0Var2 = this.f0;
                    if (xu0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(xu0Var2, vv0.h0, 1.0f));
                    }
                    org.telegram.ui.ActionBar.e2 e2Var = this.parentLayout.getFragmentStack().size() > 1 ? (org.telegram.ui.ActionBar.e2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) : null;
                    if (e2Var instanceof an) {
                        an anVar = (an) e2Var;
                        ui uiVar = anVar.p1;
                        org.telegram.messenger.g0.K(uiVar, new lc0(this, uiVar, anVar, 27));
                        View subtitleTextView2 = uiVar.getSubtitleTextView();
                        if (((subtitleTextView2 instanceof org.telegram.ui.ActionBar.j5) && ((org.telegram.ui.ActionBar.j5) subtitleTextView2).getLeftDrawable() != null) || uiVar.T[0]) {
                            this.Y4 = uiVar.getSubtitleTextView();
                            this.Z.invalidate();
                            arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<zu0, Float>) View.ALPHA, 0.0f));
                            z11 = true;
                        }
                        z11 = false;
                    } else {
                        org.telegram.ui.Components.qg qgVar4 = this.k5;
                        if (qgVar4 != null && qgVar4.r() != null) {
                            org.telegram.ui.Components.sn r11 = this.k5.r();
                            org.telegram.messenger.g0.K(r11, new mp0(15, this, r11));
                            if (w4(r11)) {
                                View subtitleTextView3 = r11.getSubtitleTextView();
                                this.Y4 = subtitleTextView3;
                                this.Z4 = ((this.k5 instanceof an) || subtitleTextView3 == null) ? 0.0f : this.r.getPaddingLeft() - this.Y4.getPaddingLeft();
                                this.Z.invalidate();
                                arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<zu0, Float>) View.ALPHA, 0.0f));
                                z11 = true;
                            }
                        }
                        z11 = false;
                    }
                    if (!z11 && this.J1 == 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<zu0, Float>) View.ALPHA, 0.0f));
                    }
                    animatorSet.playTogether(arrayList2);
                    zw0 zw0Var = this.E6;
                    if (zw0Var != null) {
                        zw0Var.animate().alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.er.h).start();
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new zt0(this, i7));
                animatorSet.playTogether(ofFloat);
                if (this.P0 == null || (obj = this.k5) == null || (yVar = ((org.telegram.ui.ActionBar.e2) obj).getActionBar().F) == null || (j3 = yVar.j(32)) == null || j3.getVisibility() != 0) {
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
                animatorSet.setInterpolator(this.J1 == 2 ? org.telegram.ui.Components.er.f : new DecelerateInterpolator());
                org.telegram.messenger.g0.i3(new fq0(animatorSet, 4), 50L);
                return animatorSet;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onDialogDismiss(Dialog dialog) {
        ou0 ou0Var = this.a;
        if (ou0Var != null) {
            ou0Var.g1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0458  */
    @Override // org.telegram.ui.ActionBar.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        long e10;
        org.telegram.ui.Components.qs0 qs0Var;
        iw0 iw0Var;
        this.e1 = this.arguments.getLong("user_id", 0L);
        this.f1 = this.arguments.getLong("chat_id", 0L);
        this.g1 = this.arguments.getLong("topic_id", 0L);
        this.h1 = this.arguments.getBoolean("saved", false);
        this.r1 = this.arguments.getBoolean("similar", false);
        this.q1 = this.g1 != 0;
        this.E1 = this.arguments.getLong("ban_chat_id", 0L);
        this.c5 = this.arguments.getInt("report_reaction_message_id", 0);
        this.d5 = this.arguments.getLong("report_reaction_from_dialog_id", 0L);
        this.f5 = this.arguments.getBoolean("show_add_to_contacts", true);
        this.g5 = pf.b.d(this.arguments.getString("vcard_phone"), false);
        this.h5 = this.arguments.getString("vcard_first_name");
        this.i5 = this.arguments.getString("vcard_last_name");
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
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                this.F2 = M0;
                if (M0 == null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    getMessagesStorage().a.c(new mp0(16, this, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                    if (this.F2 != null) {
                        getMessagesController().Q3(this.F2, true);
                    }
                }
                org.telegram.messenger.n6 n6Var = this.Y1;
                if (n6Var != null) {
                    n6Var.g();
                }
                if (this.F2.megagroup) {
                    g4(true);
                } else {
                    this.C1 = null;
                }
                getNotificationCenter().c(this, org.telegram.messenger.ns.T);
                getNotificationCenter().c(this, org.telegram.messenger.ns.g1);
                getNotificationCenter().c(this, org.telegram.messenger.ns.w2);
                getNotificationCenter().c(this, org.telegram.messenger.ns.b1);
                getNotificationCenter().c(this, org.telegram.messenger.ns.p3);
                org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.B5);
                this.D2 = new ArrayList();
                J5(true);
                if (this.v2 == null) {
                    this.v2 = getMessagesController().N0(this.f1);
                }
                if (org.telegram.messenger.t3.T(this.F2)) {
                    getMessagesController().V2(this.classGuid, this.f1, true);
                } else if (this.v2 == null) {
                    this.v2 = getMessagesStorage().F0(this.f1, false, null, false, false, 0);
                }
                x5();
                e10 = getUserConfig().e();
                if (this.e1 != e10) {
                }
                this.s1 = true;
                qs0Var = this.R;
                if (qs0Var != null) {
                    qs0Var.b(this);
                    this.R = null;
                }
                if (this.R == null) {
                }
                this.R.y.add(this);
                getNotificationCenter().c(this, org.telegram.messenger.ns.r);
                getNotificationCenter().c(this, 1);
                getNotificationCenter().c(this, org.telegram.messenger.ns.t);
                getNotificationCenter().c(this, org.telegram.messenger.ns.v);
                getNotificationCenter().c(this, org.telegram.messenger.ns.q5);
                getNotificationCenter().c(this, org.telegram.messenger.ns.D1);
                getNotificationCenter().c(this, org.telegram.messenger.ns.c0);
                getNotificationCenter().c(this, org.telegram.messenger.ns.v5);
                getNotificationCenter().c(this, org.telegram.messenger.ns.F5);
                getNotificationCenter().c(this, org.telegram.messenger.ns.i3);
                getNotificationCenter().c(this, org.telegram.messenger.ns.f5);
                getNotificationCenter().c(this, org.telegram.messenger.ns.y3);
                getNotificationCenter().c(this, org.telegram.messenger.ns.C3);
                getNotificationCenter().c(this, org.telegram.messenger.ns.D3);
                getNotificationCenter().c(this, org.telegram.messenger.ns.y1);
                getNotificationCenter().c(this, org.telegram.messenger.ns.f3);
                getNotificationCenter().c(this, org.telegram.messenger.ns.G3);
                getNotificationCenter().c(this, org.telegram.messenger.ns.V3);
                getNotificationCenter().c(this, org.telegram.messenger.ns.W3);
                org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.i4);
                M5();
                iw0Var = this.d;
                if (iw0Var != null) {
                }
                if (this.arguments.containsKey("preload_messages")) {
                }
                if (this.e1 != 0) {
                    getConnectionsManager().sendRequest(new TL_account.getPassword(), new eu0(this, 5));
                }
                setBulletinDelegate(new y8(this, 8));
                if (this.e1 != 0) {
                    getMessagesController().R0(null);
                }
                Y4();
                this.L6 = !this.J0 ? org.telegram.messenger.g0.L(72.0f) : 0;
                this.M6 = this.J0 ? org.telegram.messenger.g0.L(64.0f) : 0;
                return true;
            }
            return false;
        }
        long j3 = this.arguments.getLong("dialog_id", 0L);
        this.i1 = j3;
        if (j3 != 0) {
            this.E2 = getMessagesController().a1(Integer.valueOf((int) (this.i1 & 4294967295L)));
        }
        org.telegram.messenger.n6 n6Var2 = this.Y1;
        if (n6Var2 != null) {
            n6Var2.g();
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
        if (a22 != null) {
            getNotificationCenter().c(this, org.telegram.messenger.ns.O);
            getNotificationCenter().c(this, org.telegram.messenger.ns.s1);
            getNotificationCenter().c(this, org.telegram.messenger.ns.a0);
            getNotificationCenter().c(this, org.telegram.messenger.ns.Y);
            getNotificationCenter().c(this, org.telegram.messenger.ns.g0);
            getNotificationCenter().c(this, org.telegram.messenger.ns.D0);
            getNotificationCenter().c(this, org.telegram.messenger.ns.E0);
            getNotificationCenter().c(this, org.telegram.messenger.ns.k0);
            org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.x4);
            this.k1 = getMessagesController().H0.indexOfKey(this.e1) >= 0;
            if (a22.bot) {
                this.s2 = true;
                org.telegram.messenger.si mediaDataController = getMediaDataController();
                long j10 = a22.id;
                mediaDataController.G0(j10, j10, true, this.classGuid, null);
            }
            this.w2 = getMessagesController().b2(this.e1);
            getMessagesController().W2(getMessagesController().a2(Long.valueOf(this.e1)), this.classGuid, true, null);
            this.C1 = null;
            if (org.telegram.messenger.q10.B(a22)) {
                org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(0, true, true);
                this.r0 = m30Var;
                m30Var.I = true;
                m30Var.a = this;
                m30Var.b = this;
                getMediaDataController().x();
                getMessagesController().d3();
                getMessagesController().g3(getUserConfig().f(), true, this.classGuid);
            }
            this.a5 = this.arguments.getInt("actionBarColor", 0);
            e10 = getUserConfig().e();
            if ((this.e1 != e10 || this.i1 == e10) && !this.s1) {
                this.s1 = true;
            }
            qs0Var = this.R;
            if (qs0Var != null && qs0Var.s != this.g1) {
                qs0Var.b(this);
                this.R = null;
            }
            if (this.R == null) {
                this.R = new org.telegram.ui.Components.qs0(this);
            }
            this.R.y.add(this);
            getNotificationCenter().c(this, org.telegram.messenger.ns.r);
            getNotificationCenter().c(this, 1);
            getNotificationCenter().c(this, org.telegram.messenger.ns.t);
            getNotificationCenter().c(this, org.telegram.messenger.ns.v);
            getNotificationCenter().c(this, org.telegram.messenger.ns.q5);
            getNotificationCenter().c(this, org.telegram.messenger.ns.D1);
            getNotificationCenter().c(this, org.telegram.messenger.ns.c0);
            getNotificationCenter().c(this, org.telegram.messenger.ns.v5);
            getNotificationCenter().c(this, org.telegram.messenger.ns.F5);
            getNotificationCenter().c(this, org.telegram.messenger.ns.i3);
            getNotificationCenter().c(this, org.telegram.messenger.ns.f5);
            getNotificationCenter().c(this, org.telegram.messenger.ns.y3);
            getNotificationCenter().c(this, org.telegram.messenger.ns.C3);
            getNotificationCenter().c(this, org.telegram.messenger.ns.D3);
            getNotificationCenter().c(this, org.telegram.messenger.ns.y1);
            getNotificationCenter().c(this, org.telegram.messenger.ns.f3);
            getNotificationCenter().c(this, org.telegram.messenger.ns.G3);
            getNotificationCenter().c(this, org.telegram.messenger.ns.V3);
            getNotificationCenter().c(this, org.telegram.messenger.ns.W3);
            org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.i4);
            M5();
            iw0Var = this.d;
            if (iw0Var != null) {
                iw0Var.f();
            }
            if (this.arguments.containsKey("preload_messages")) {
                getMessagesController().s0(this.e1, 0, null);
            }
            if (this.e1 != 0 && org.telegram.messenger.q10.B(getMessagesController().a2(Long.valueOf(this.e1)))) {
                getConnectionsManager().sendRequest(new TL_account.getPassword(), new eu0(this, 5));
            }
            setBulletinDelegate(new y8(this, 8));
            if (this.e1 != 0 && org.telegram.messenger.q10.B(getMessagesController().a2(Long.valueOf(this.e1))) && !this.s1) {
                getMessagesController().R0(null);
            }
            Y4();
            this.L6 = !this.J0 ? org.telegram.messenger.g0.L(72.0f) : 0;
            this.M6 = this.J0 ? org.telegram.messenger.g0.L(64.0f) : 0;
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        uv0 uv0Var = this.O;
        if (uv0Var != null) {
            uv0Var.R0();
        }
        org.telegram.ui.Components.qs0 qs0Var = this.R;
        if (qs0Var != null) {
            qs0Var.b(this);
        }
        org.telegram.ui.Components.qs0 qs0Var2 = this.R;
        if (qs0Var2 != null) {
            qs0Var2.y.remove(this);
        }
        getNotificationCenter().n(this, org.telegram.messenger.ns.r);
        getNotificationCenter().n(this, org.telegram.messenger.ns.t);
        getNotificationCenter().n(this, org.telegram.messenger.ns.v);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.ns.q5);
        getNotificationCenter().n(this, org.telegram.messenger.ns.D1);
        getNotificationCenter().n(this, org.telegram.messenger.ns.c0);
        getNotificationCenter().n(this, org.telegram.messenger.ns.v5);
        getNotificationCenter().n(this, org.telegram.messenger.ns.F5);
        getNotificationCenter().n(this, org.telegram.messenger.ns.i3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f5);
        getNotificationCenter().n(this, org.telegram.messenger.ns.y3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.C3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.D3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.y1);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.G3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.V3);
        getNotificationCenter().n(this, org.telegram.messenger.ns.W3);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.i4);
        yu0 yu0Var = this.o0;
        if (yu0Var != null) {
            yu0Var.K();
        }
        org.telegram.ui.Components.nf0 nf0Var = this.n0;
        if (nf0Var != null) {
            nf0Var.d();
        }
        this.d6 = null;
        if (this.e1 != 0) {
            getNotificationCenter().n(this, org.telegram.messenger.ns.s1);
            getNotificationCenter().n(this, org.telegram.messenger.ns.O);
            getNotificationCenter().n(this, org.telegram.messenger.ns.a0);
            getNotificationCenter().n(this, org.telegram.messenger.ns.Y);
            getNotificationCenter().n(this, org.telegram.messenger.ns.g0);
            getNotificationCenter().n(this, org.telegram.messenger.ns.D0);
            getNotificationCenter().n(this, org.telegram.messenger.ns.E0);
            getNotificationCenter().n(this, org.telegram.messenger.ns.k0);
            org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.x4);
            getMessagesController().r1.remove(Long.valueOf(this.e1));
        } else if (this.f1 != 0) {
            org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.B5);
            getNotificationCenter().n(this, org.telegram.messenger.ns.p3);
            getNotificationCenter().n(this, org.telegram.messenger.ns.T);
            getNotificationCenter().n(this, org.telegram.messenger.ns.g1);
            getNotificationCenter().n(this, org.telegram.messenger.ns.w2);
            getNotificationCenter().n(this, org.telegram.messenger.ns.b1);
        }
        xu0 xu0Var = this.f0;
        if (xu0Var != null) {
            xu0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.m30 m30Var = this.r0;
        if (m30Var != null) {
            m30Var.d();
        }
        cv0 cv0Var = this.X4;
        if (cv0Var != null) {
            cv0Var.b();
        }
        ww0 ww0Var = this.z2;
        if (ww0Var != null && this.y2) {
            ww0Var.b(true);
            this.z2 = null;
        }
        ai.l2 l2Var = this.B5;
        if (l2Var != null) {
            this.B5 = null;
            org.telegram.messenger.g0.h3(l2Var);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onPause() {
        org.telegram.ui.Components.gr0 gr0Var;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.m30 m30Var = this.r0;
        if (m30Var != null) {
            m30Var.i();
        }
        org.telegram.messenger.n6 n6Var = this.Y1;
        if (n6Var != null) {
            n6Var.e();
        }
        uv0 uv0Var = this.O;
        if (uv0Var == null || (gr0Var = uv0Var.W) == null) {
            return;
        }
        gr0Var.e = false;
        if (gr0Var.c != null) {
            gr0Var.a.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.m30 m30Var = this.r0;
        if (m30Var != null) {
            m30Var.j(i7, strArr, iArr);
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
                org.telegram.ui.Components.voip.c2.h(getParentActivity(), null, i7);
                return;
            } else {
                org.telegram.ui.Components.voip.c2.l(this.F2, null, getMessagesController().g1(this.f1, false, null) == null, null, getParentActivity(), this, getAccountInstance());
                return;
            }
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
        if (a22 == null) {
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
            org.telegram.ui.Components.voip.c2.h(getParentActivity(), null, i7);
            return;
        }
        boolean z12 = i7 == 102;
        TLRPC.UserFull userFull = this.w2;
        org.telegram.ui.Components.voip.c2.m(a22, z12, userFull != null && userFull.video_calls_available, getParentActivity(), this.w2, getAccountInstance());
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        TLRPC.User a22;
        rv rvVar;
        super.onResume();
        uv0 uv0Var = this.O;
        if (uv0Var != null) {
            uv0Var.e1 = true;
            org.telegram.ui.Components.fr0 fr0Var = uv0Var.K;
            if (fr0Var != null) {
                fr0Var.f();
            }
            org.telegram.ui.Components.ls0 ls0Var = uv0Var.N;
            if (ls0Var != null) {
                ls0Var.f();
            }
            org.telegram.ui.Components.ms0 ms0Var = uv0Var.M;
            if (ms0Var != null) {
                ms0Var.X(false);
            }
            for (int i7 = 0; i7 < uv0Var.n0.length; i7++) {
                uv0Var.e0(i7);
            }
            org.telegram.ui.Components.gr0 gr0Var = uv0Var.W;
            if (gr0Var != null) {
                gr0Var.e = true;
                if (gr0Var.c != null) {
                    gr0Var.a.onResume();
                }
            }
        }
        u4();
        iw0 iw0Var = this.d;
        if (iw0Var != null) {
            this.V4 = true;
            iw0Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (rvVar = this.U) != null && rvVar.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        org.telegram.ui.Components.m30 m30Var = this.r0;
        if (m30Var != null) {
            m30Var.k();
            setParentActivityTitle(org.telegram.messenger.hd.M0(2131745495, null));
        }
        L5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new e7(this, 5));
        }
        ok okVar = this.f;
        if (okVar != null) {
            setParentActivityTitle(okVar.getText());
        }
        if (this.e1 != 0 && (a22 = getMessagesController().a2(Long.valueOf(this.e1))) != null && a22.photo == null && this.Q1 >= i4()) {
            this.k2.cancel();
            float[] fArr = this.n2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            Z4(1.0f);
            this.o0.setVisibility(8);
            this.Q1 = i4();
            this.p2 = false;
            this.c.h1(0, i4() - this.a.getPaddingTop());
        }
        org.telegram.messenger.n6 n6Var = this.Y1;
        if (n6Var != null) {
            n6Var.a();
        }
        F5();
        A4(false);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.z0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i6, this.A0));
            o5();
            P5();
            I3();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.w4 w4Var;
        if (z10 && (w4Var = this.simpleActionBar) != null) {
            w4Var.setAlpha(1.0f);
        }
        if (z10) {
            if (!z11) {
                int i7 = this.J1;
                if (i7 != 0 && this.M1) {
                    if (i7 == 1) {
                        this.l2 = 0.0f;
                        org.telegram.ui.Components.mu0 mu0Var = this.T;
                        if (mu0Var != null) {
                            mu0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.hf0 hf0Var = this.a0;
                        if (hf0Var != null) {
                            hf0Var.setParentExpanded(0.0f);
                        }
                        b5(0.0f);
                        org.telegram.ui.Components.cg0 cg0Var = this.c0;
                        if (cg0Var != null) {
                            cg0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    N3();
                    if (this.I1) {
                        R3(true);
                    }
                }
                if (!this.p5) {
                    this.p5 = true;
                    this.W4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.R4);
            rv rvVar = this.U;
            if (rvVar != null && rvVar.getVisibility() == 0) {
                this.U.setVisibility(8);
                this.U.setBackground(null);
            }
        }
        this.H1 = false;
        P3();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        rv rvVar = this.U;
        if (rvVar == null || rvVar.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.U.setAlpha(1.0f - f10);
        } else {
            this.U.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        ImageView imageView;
        org.telegram.ui.Components.hf0 hf0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.g6 = z10;
        if (z10 && (hf0Var = this.a0) != null) {
            ArrayList arrayList = hf0Var.a;
            if (hf0Var.F == 6) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.ui.Components.ef0 ef0Var = (org.telegram.ui.Components.ef0) arrayList.get(i7);
                    org.telegram.ui.Components.ch0 ch0Var = ef0Var.k;
                    if (ch0Var != null) {
                        if (ef0Var.a == 15) {
                            ch0Var.M(14);
                        } else {
                            ch0Var.M(0);
                        }
                        ef0Var.k.start();
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
                if (this.d6 == null) {
                    this.d6 = new float[14];
                }
                this.F1 = this.Q1;
                this.d6[0] = this.Y.getScaleX();
                this.d6[1] = this.Y.getTranslationX();
                this.d6[2] = this.Y.getTranslationY();
                org.telegram.ui.Components.hf0 hf0Var2 = this.a0;
                if (hf0Var2 != null) {
                    this.d6[3] = hf0Var2.getAlpha();
                }
                di.u0 u0Var = this.w0;
                if (u0Var != null) {
                    float[] fArr = this.d6;
                    fArr[4] = u0Var.e;
                    fArr[5] = u0Var.f;
                }
                if (this.D6 != null) {
                    this.d6[6] = r0.getAlpha();
                }
                this.d6[7] = this.f.getScaleX();
                this.d6[8] = this.f.getTranslationY();
                this.d6[9] = this.r.getTranslationY();
                this.d6[10] = this.f.getLayoutParams().width;
                float[] fArr2 = this.d6;
                fArr2[11] = this.d2;
                fArr2[12] = this.f.getTranslationX();
                this.d6[13] = this.r.getTranslationX();
                hi.l3 l3Var = this.F6;
                if (l3Var != null) {
                    l3Var.f(true);
                }
            }
        }
        if (z10) {
            if (this.r0 != null) {
                this.R4 = getNotificationCenter().q(new int[]{org.telegram.messenger.ns.s, org.telegram.messenger.ns.t, org.telegram.messenger.ns.W, org.telegram.messenger.ns.X, org.telegram.messenger.ns.E0, org.telegram.messenger.ns.r4}, this.R4, true);
            } else {
                this.R4 = getNotificationCenter().q(new int[]{org.telegram.messenger.ns.s, org.telegram.messenger.ns.t, org.telegram.messenger.ns.W, org.telegram.messenger.ns.X, org.telegram.messenger.ns.r4}, this.R4, true);
            }
            if (!z11 && getParentActivity() != null) {
                this.b5 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.H1 = true;
        P3();
    }

    public final float p4(float f10, int i7, View view) {
        float left;
        int paddingLeft;
        org.telegram.ui.Components.qg qgVar = this.k5;
        if (qgVar != null && !(qgVar instanceof an) && this.fragmentView != null && (view.getParent() instanceof View)) {
            org.telegram.ui.Components.sn r10 = this.k5.r();
            org.telegram.ui.ActionBar.k actionBar = ((org.telegram.ui.ActionBar.e2) this.k5).getActionBar();
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
                yw ywVar = this.j5;
                View D = (ywVar == null || ywVar.getFragmentView() == null) ? this.k5.D() : this.j5.getFragmentView();
                RectF rectF = this.j6;
                if (jh.k.c(view2, D, rectF)) {
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

    public final void p5() {
        k0 k0Var;
        if (this.a0 == null || this.r == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        org.telegram.ui.Components.hf0 hf0Var = this.a0;
        boolean z10 = this.G1;
        hf0Var.e = z10;
        if (z10 && this.J1 == 2 && (k0Var = this.Y) != null) {
            this.a0.f = this.Y.getY() + (this.Y.getScaleY() * k0Var.getHeight());
            this.a0.setAlpha(this.T1);
            org.telegram.ui.Components.hf0 hf0Var2 = this.a0;
            float measuredWidth = this.a.getMeasuredWidth();
            hf0Var2.x = org.telegram.messenger.g0.L(74.0f);
            hf0Var2.setTranslationY(measuredWidth);
            hf0Var2.invalidate();
        } else {
            hf0Var.f = -1.0f;
            float f10 = currentActionBarHeight;
            float L = (this.Q1 + f10) - org.telegram.messenger.g0.L((this.J4 || this.K4) ? 25.0f : 0.0f);
            float min = Math.min(org.telegram.messenger.g0.L(74.0f), L - f10);
            org.telegram.ui.Components.hf0 hf0Var3 = this.a0;
            hf0Var3.x = min;
            hf0Var3.setTranslationY(L - min);
            hf0Var3.invalidate();
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

    public final float q4() {
        if (this.T == null) {
            return 0.0f;
        }
        return this.T.getVisibilityFactor() * org.telegram.messenger.g0.L(22.0f);
    }

    public final void q5() {
        if (this.Z0 == null || this.a1 == null) {
            return;
        }
        TLRPC.UserFull userFull = this.w2;
        int i7 = (userFull == null && this.v2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.v2.ttl_period;
        this.t0.b(i7);
        this.a1.u(i7);
    }

    public final int r4() {
        if (this.q1) {
            return 0;
        }
        if (this.f1 == 0 || !org.telegram.messenger.t3.c0(getMessagesController().M0(Long.valueOf(this.f1)))) {
            return org.telegram.messenger.g0.L(50.0f);
        }
        return org.telegram.messenger.g0.L(z4() ? 24.0f : 38.0f);
    }

    public final void r5() {
        if (this.w5 == null) {
            return;
        }
        uv0 uv0Var = this.O;
        boolean z10 = ((uv0Var == null || !uv0Var.isAttachedToWindow()) ? (float) org.telegram.messenger.g0.L(72.0f) : ((float) org.telegram.messenger.g0.L(232.0f)) - (((float) this.a.getMeasuredHeight()) - this.O.getY())) <= 0.0f;
        te.a aVar = this.Q5;
        aVar.a(z10, true);
        float f10 = aVar.e;
        this.w5.setTranslationY(org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(60.0f), 0));
        this.w5.setAlpha(f10);
        this.w5.setVisibility(f10 <= 0.0f ? 4 : 0);
        org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.w;
        if (xbVar != null) {
            xbVar.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.m30 m30Var = this.r0;
        if (m30Var != null) {
            m30Var.f = bundle.getString("path");
        }
    }

    public final org.telegram.ui.Components.dr s4() {
        if (this.J == null) {
            this.y = org.telegram.ui.ActionBar.j6.Q1.getConstantState().newDrawable().mutate();
            this.I = org.telegram.ui.ActionBar.j6.R1.getConstantState().newDrawable().mutate();
            org.telegram.messenger.cp cpVar = this.l6;
            if (cpVar != null) {
                int b10 = org.telegram.ui.ActionBar.j6.b(0.1f, org.telegram.ui.ActionBar.j6.I.q() ? -0.1f : -0.08f, cpVar.o(org.telegram.ui.ActionBar.j6.I.q()) ? this.l6.k() : this.l6.i());
                Drawable drawable = this.y;
                int S0 = org.telegram.messenger.g0.S0(this.U5, 1.0f, b10, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fj, this.A0));
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(S0, mode);
                this.I.setColorFilter(org.telegram.messenger.g0.S0(this.U5, 1.0f, -1, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.A0)), mode);
            }
            this.J = new org.telegram.ui.Components.dr(new org.telegram.ui.Components.fq(this.y, this.I), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return this.J;
    }

    public final void s5() {
        hi.l3 l3Var = this.F6;
        if (l3Var == null) {
            return;
        }
        l3Var.p(0.0f, (this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX() + (-l3Var.getPaddingLeft()));
        float U1 = org.telegram.messenger.g0.U1(this.m2, this.n2);
        this.F6.setTranslationY(((this.f.getY() + (-r2.getPaddingBottom())) - org.telegram.messenger.g0.L(24.0f)) + org.telegram.messenger.g0.W1(U1, org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(12.0f)));
        this.F6.j(i0.a.f(U1, this.G6, 1342177280));
        boolean z10 = this.Q1 >= ((float) org.telegram.messenger.g0.L(82.0f));
        Boolean bool = this.H6;
        if (bool == null || bool.booleanValue() != z10) {
            ViewPropertyAnimator animate = this.F6.animate();
            this.H6 = Boolean.valueOf(z10);
            org.telegram.messenger.i20.n(animate.alpha(z10 ? 1.0f : 0.0f), org.telegram.ui.Components.er.g, 200L);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.m30 m30Var = this.r0;
        if (m30Var == null || (str = m30Var.f) == null) {
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
        P3();
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            w4Var.setAlpha(f10);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.getBackButton().setTranslationX(org.telegram.messenger.g0.T1(p4(org.telegram.messenger.g0.L(2.0f), 2, this.actionBar.getBackButton()), org.telegram.messenger.g0.L(2.0f), f10));
        }
        if (this.J1 == 2) {
            this.f0.setProgressToExpand(f10);
            org.telegram.ui.Components.hf0 hf0Var = this.a0;
            if (hf0Var != null) {
                hf0Var.setParentExpanded(f10);
            }
            b5(f10);
            org.telegram.ui.Components.cg0 cg0Var = this.c0;
            if (cg0Var != null) {
                cg0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.mu0 mu0Var = this.T;
            if (mu0Var != null) {
                mu0Var.setParentExpanded(f10);
            }
            p5();
            H5();
        }
        this.a.setAlpha(f10);
        this.a.setTranslationX(org.telegram.messenger.g0.L(48.0f) - (org.telegram.messenger.g0.L(48.0f) * f10));
        if (this.J1 != 2 || (w02 = this.s0) == 0) {
            if (this.e1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f1)) {
                    boolean z10 = this.F2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.e6 e6Var = this.A0;
            int[][] iArr = org.telegram.ui.Components.t8.L;
            w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, e6Var);
        }
        int i7 = this.a5;
        if (i7 == 0) {
            i7 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.s8, this.A0);
        }
        this.d1.setBackgroundColor(i0.a.f(f10, i0.a.o(i7, 0), w02));
        org.telegram.ui.Components.c01 c01Var = this.m0;
        int f11 = i0.a.f(f10, i7, w02);
        c01Var.k = true;
        c01Var.b.setColor(f11);
        if (this.l6 != null) {
            w03 = -1;
        } else {
            if (this.e1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f1)) {
                    boolean z11 = this.F2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.e6 e6Var2 = this.A0;
            int[][] iArr2 = org.telegram.ui.Components.t8.L;
            w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.g8, e6Var2);
        }
        this.actionBar.H(i0.a.f(this.T1, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.v8, this.A0), w03), false);
        int w05 = this.l6 == null ? org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.mi, this.A0) : -1;
        int w06 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A8, this.A0);
        ok okVar = this.f;
        if (okVar != null && this.J1 != 2) {
            okVar.setTextColor(i0.a.f(f10, w06, w05));
        }
        boolean[] zArr = this.K0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.si, this.A0);
        } else {
            if (this.e1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f1)) {
                    boolean z12 = this.F2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.e6 e6Var3 = this.A0;
            int[][] iArr3 = org.telegram.ui.Components.t8.L;
            w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h8, e6Var3);
        }
        int w07 = org.telegram.ui.ActionBar.j6.w0(zArr[0] ? org.telegram.ui.ActionBar.j6.pa : org.telegram.ui.ActionBar.j6.B8, this.A0);
        zu0 zu0Var = this.r;
        if (zu0Var != null && this.J1 != 2) {
            zu0Var.setTextColor(i0.a.f(f10, w07, H3(w04, Boolean.valueOf(zArr[0]))));
        }
        this.Q1 = this.S1 * f10;
        long j3 = this.e1;
        if (j3 == 0) {
            j3 = this.f1;
        }
        org.telegram.ui.ActionBar.e6 e6Var4 = this.A0;
        int[][] iArr4 = org.telegram.ui.Components.t8.L;
        int w08 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.t8.e(j3)], e6Var4);
        long j10 = this.e1;
        if (j10 == 0) {
            j10 = this.f1;
        }
        int d = org.telegram.ui.Components.t8.d(j10);
        if (w08 != d) {
            this.q0.h(i0.a.f(f10, d, w08));
            this.f0.invalidate();
        }
        int i10 = this.b5;
        if (i10 != 0) {
            setNavigationBarColor(i0.a.f(f10, i10, getNavigationBarColor()));
        }
        this.d1.invalidate();
        A4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        dw0 dw0Var = this.h6;
        if (dw0Var != null) {
            dw0Var.invalidate();
        }
        if (a() > 0) {
            xu0 xu0Var = this.f0;
            if (xu0Var != null) {
                xu0Var.setProgressToStoriesInsets(this.T1);
            }
            av0 av0Var = this.v0;
            if (av0Var != null) {
                av0Var.setProgressToStoriesInsets(this.T1);
            }
            di.u0 u0Var = this.w0;
            if (u0Var != null) {
                u0Var.setProgressToStoriesInsets(this.T1);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void setParentLayout(org.telegram.ui.ActionBar.o4 o4Var) {
        super.setParentLayout(o4Var);
        org.telegram.messenger.n6 n6Var = this.Y1;
        if (n6Var != null) {
            n6Var.e();
            this.Y1 = null;
        }
        if (o4Var == null || o4Var.getParentActivity() == null) {
            return;
        }
        this.Y1 = new org.telegram.messenger.n6(o4Var.getParentActivity().getWindow(), new qt0(this, 8));
    }

    @Override // org.telegram.ui.Components.nr0
    public final boolean t() {
        return this.g6;
    }

    public final boolean t4() {
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

    public final void t5() {
        if (getParentActivity() == null || this.V0 == null) {
            return;
        }
        if (getUserConfig().q()) {
            this.V0.setIcon(R.drawable.menu_profile_colors);
            return;
        }
        Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, this.A0), PorterDuff.Mode.SRC_IN));
        this.U6 = drawable;
        Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
        drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.V0.setIcon(new fi.e2(drawable, drawable2, org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f)));
    }

    public final void u4() {
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        this.o2 = point.x > point.y;
    }

    public final void u5() {
        v5(this.k6);
    }

    @Override // org.telegram.ui.ie0
    public final void v() {
        this.a.y0(0);
    }

    public final boolean v4() {
        if (this.F2 != null) {
            return getMessagesController().o2(this.F2);
        }
        org.telegram.messenger.np messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.w2;
        messagesController.getClass();
        return org.telegram.messenger.np.K2(userFull);
    }

    public final void v5(float f10) {
        int S0;
        org.telegram.messenger.cp cpVar = this.l6;
        if (cpVar != null) {
            S0 = i0.a.f(0.25f, cpVar.m(org.telegram.ui.ActionBar.j6.I.q()), -1);
        } else {
            S0 = org.telegram.messenger.g0.S0(this.U5, 1.0f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.qi, this.A0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fj, this.A0));
        }
        int f11 = i0.a.f(f10, S0, -1);
        int i7 = org.telegram.ui.ActionBar.j6.Fj;
        int f12 = i0.a.f(Math.max(this.U5, this.E5), f11, org.telegram.ui.ActionBar.j6.w0(i7, this.A0));
        org.telegram.ui.Components.e5 e5Var = this.G;
        if (e5Var != null) {
            e5Var.k(Integer.valueOf(f12));
        }
        org.telegram.ui.Components.e5 e5Var2 = this.H;
        if (e5Var2 != null) {
            e5Var2.k(Integer.valueOf(i0.a.f(this.U5, i0.a.f(f10, S0, -1711276033), org.telegram.ui.ActionBar.j6.w0(i7, this.A0))));
        }
        this.e0.setColor(f12);
        this.k6 = f10;
    }

    public final boolean w4(org.telegram.ui.Components.sn snVar) {
        if ((this.k5 instanceof an) || !(snVar.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.j5)) {
            return false;
        }
        return !TextUtils.equals(((org.telegram.ui.ActionBar.j5) snVar.getSubtitleTextView()).getText() != null ? r3.toString() : null, this.r.getText() != null ? this.r.getText().toString() : null);
    }

    public final void w5() {
        this.e0.setScaleX(this.f.getScaleX());
        this.e0.setScaleY(this.f.getScaleY());
        this.e0.b((this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX(), (this.f.getHeight() - (this.f.getScaleY() * (this.f.getHeight() - this.f.getRightDrawableY()))) + this.f.getY());
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ boolean x() {
        return false;
    }

    public final boolean x4() {
        return (this.r0 == null || this.s1) ? false : true;
    }

    public final void x5() {
        if (this.q1 || !org.telegram.messenger.t3.c0(this.F2)) {
            return;
        }
        org.telegram.messenger.at notificationsController = getNotificationsController();
        notificationsController.getMessagesStorage().a.c(new org.telegram.messenger.a4(notificationsController, -this.f1, new ku0(this), 6));
    }

    @Override // org.telegram.ui.sw
    public final boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        long j3 = ((org.telegram.messenger.ur) arrayList.get(0)).a;
        Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
        if (org.telegram.messenger.m5.C(j3)) {
            k10.putInt("enc_id", (int) (4294967295L & j3));
        } else if (org.telegram.messenger.m5.E(j3)) {
            k10.putLong("user_id", j3);
        } else if (org.telegram.messenger.m5.z(j3)) {
            k10.putLong("chat_id", -j3);
        }
        if (!getMessagesController().E(k10, ywVar, null, null)) {
            return false;
        }
        org.telegram.messenger.ns notificationCenter = getNotificationCenter();
        int i11 = org.telegram.messenger.ns.t;
        notificationCenter.n(this, i11);
        getNotificationCenter().k(i11, new Object[0]);
        presentFragment(new an(k10), true);
        removeSelfFromStack();
        getSendMessagesHelper().r0(org.telegram.messenger.cz.g(getMessagesController().a2(Long.valueOf(this.e1)), j3, null, null, null, null, z11, i7, i10));
        if (!TextUtils.isEmpty(charSequence)) {
            org.telegram.messenger.ez.a0(org.telegram.messenger.c.a(this.currentAccount), charSequence, j3, 0L, z11, i7, i10);
        }
        return true;
    }

    public final void y4(boolean z10) {
        boolean c02 = org.telegram.messenger.t3.c0(this.F2);
        TLRPC.Chat chat = this.F2;
        org.telegram.ui.Components.t4.r(this, false, chat, null, false, c02 || z10 || (chat != null && chat.creator), z10, !c02, new qt0(this, 3));
    }

    public final void y5(float f10) {
        jw0 jw0Var;
        ValueAnimator valueAnimator;
        if (this.q2 || ((jw0Var = this.N) != null && (valueAnimator = jw0Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f10);
            this.N.requestLayout();
        }
        vw0 vw0Var = this.d1;
        if (vw0Var != null) {
            vw0Var.F.setTranslate(0.0f, this.b2 - vw0Var.y);
            vw0 vw0Var2 = this.d1;
            RadialGradient radialGradient = vw0Var2.E;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(vw0Var2.F);
            }
            this.d1.invalidate();
        }
        w5();
        p5();
        H5();
    }

    public final boolean z4() {
        return getMessagesController().P1().K(a()) && !this.q1;
    }

    public final void z5() {
        if (this.simpleActionBar == null) {
            return;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getVisibility() != 4) {
            this.actionBar.setVisibility(4);
        }
        float K3 = 1.0f - ((1.0f - K3()) * this.simpleActionBar.getActionModeFactor());
        ai.k0 k0Var = this.Z;
        if (k0Var == null || this.R1 == K3) {
            return;
        }
        this.R1 = K3;
        k0Var.invalidate();
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.qs0 qs0Var) {
        super(bundle);
        this.h = null;
        this.n = null;
        this.x0 = null;
        int i7 = 2;
        this.y0 = new org.telegram.ui.Components.w30(this, i7);
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
        this.S4 = new ArrayList();
        this.T4 = new ArrayList();
        this.U4 = 0;
        this.V4 = true;
        this.W4 = true;
        this.a5 = 0;
        this.b5 = 0;
        this.c5 = 0;
        this.d5 = 0L;
        this.l5 = new HashSet();
        this.n5 = new dv0(this, 0);
        this.o5 = new jv0(this);
        this.L5 = new nu0(this);
        this.P5 = 1.0f;
        this.Q5 = new te.a(0, new qt0(this, 7), org.telegram.ui.Components.er.h, 380L, true);
        this.W5 = new dv0(this, 1);
        this.c6 = new bv0(this, i7);
        this.d6 = null;
        this.j6 = new RectF();
        this.m6 = new SparseIntArray();
        this.o6 = null;
        this.p6 = -1;
        this.u6 = new int[3];
        this.v6 = -1.0f;
        ui.b bVar = new ui.b();
        this.O6 = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.P6 = cVar;
        this.R6 = new Paint();
        this.W6 = new int[7];
        this.R = qs0Var;
        cVar.g = new xe.b();
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ void U() {
    }
}
