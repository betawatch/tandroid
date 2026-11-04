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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ProfileActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, nw, org.telegram.ui.Components.ps0, org.telegram.ui.Components.e30, org.telegram.ui.Components.lr0, de0 {
    public static final RectF T6 = new RectF();
    public static final int U6 = org.telegram.messenger.g0.L(16.0f);
    public org.telegram.ui.ActionBar.e6 A0;
    public boolean A1;
    public long A2;
    public int A3;
    public int A4;
    public gi.d A5;
    public sw0 A6;
    public int B0;
    public boolean B1;
    public int B2;
    public int B3;
    public int B4;
    public float B5;
    public gi.l3 B6;
    public org.telegram.messenger.ac C0;
    public a0.h C1;
    public ArrayList C2;
    public int C3;
    public int C4;
    public View C5;
    public int C6;
    public int D0;
    public boolean D1;
    public TLRPC.EncryptedChat D2;
    public int D3;
    public int D4;
    public int D5;
    public Boolean D6;
    public Drawable E;
    public int E0;
    public long E1;
    public TLRPC.Chat E2;
    public int E3;
    public int E4;
    public int E5;
    public TLRPC.TL_emojiStatusCollectible E6;
    public Long F;
    public int F0;
    public float F1;
    public TL_bots.BotInfo F2;
    public int F3;
    public int F4;
    public int F5;
    public int F6;
    public org.telegram.ui.Components.e5 G;
    public boolean G0;
    public boolean G1;
    public TLRPC.ChannelParticipant G2;
    public int G3;
    public int G4;
    public int G5;
    public boolean G6;
    public org.telegram.ui.Components.e5 H;
    public boolean H0;
    public boolean H1;
    public TL_account.TL_password H2;
    public int H3;
    public int H4;
    public hh.e H5;
    public int H6;
    public Drawable I;
    public boolean I0;
    public boolean I1;
    public TLRPC.FileLocation I2;
    public int I3;
    public boolean I4;
    public final gu0 I5;
    public int I6;
    public org.telegram.ui.Components.wq J;
    public boolean J0;
    public int J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public boolean J4;
    public org.telegram.ui.Components.kf0 J5;
    public int J6;
    public org.telegram.ui.Components.wq K;
    public final boolean[] K0;
    public boolean K1;
    public org.telegram.messenger.ac K2;
    public int K3;
    public int K4;
    public float K5;
    public final si.b K6;
    public org.telegram.ui.Components.kk0 L;
    public boolean L0;
    public boolean L1;
    public final Rect L2;
    public int L3;
    public int L4;
    public int L5;
    public final eh.c L6;
    public UndoView M;
    public boolean M0;
    public boolean M1;
    public org.telegram.ui.Cells.l8 M2;
    public int M3;
    public int M4;
    public float M5;
    public ci.g M6;
    public cw0 N;
    public boolean N0;
    public boolean N1;
    public int N2;
    public int N3;
    public int N4;
    public final qe.a N5;
    public final Paint N6;
    public mv0 O;
    public boolean O0;
    public boolean O1;
    public int O2;
    public int O3;
    public boolean O4;
    public yu0 O5;
    public Drawable O6;
    public org.telegram.ui.Components.zu0 P;
    public ImageView P0;
    public boolean P1;
    public int P2;
    public int P3;
    public boolean P4;
    public AnimatorSet P5;
    public Drawable P6;
    public boolean Q;
    public org.telegram.ui.ActionBar.f5 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public int Q4;
    public AnimatorSet Q5;
    public Drawable Q6;
    public org.telegram.ui.Components.os0 R;
    public org.telegram.ui.ActionBar.f5 R0;
    public float R1;
    public int R2;
    public int R3;
    public final ArrayList R4;
    public float R5;
    public org.telegram.ui.Components.wp R6;
    public boolean S;
    public org.telegram.ui.ActionBar.f5 S0;
    public float S1;
    public int S2;
    public int S3;
    public final ArrayList S4;
    public boolean S5;
    public final int[] S6;
    public org.telegram.ui.Components.ku0 T;
    public org.telegram.ui.ActionBar.f5 T0;
    public int T1;
    public int T2;
    public int T3;
    public int T4;
    public final wu0 T5;
    public org.telegram.ui.Components.voip.r0 U;
    public org.telegram.ui.ActionBar.f5 U0;
    public float U1;
    public int U2;
    public int U3;
    public boolean U4;
    public View U5;
    public org.telegram.ui.Components.ch0 V;
    public org.telegram.ui.ActionBar.y0 V0;
    public ValueAnimator V1;
    public int V2;
    public int V3;
    public boolean V4;
    public int V5;
    public org.telegram.ui.Components.ch0 W;
    public org.telegram.ui.ActionBar.y0 W0;
    public boolean W1;
    public int W2;
    public int W3;
    public vu0 W4;
    public int W5;
    public gi.l3 X;
    public org.telegram.ui.ActionBar.y0 X0;
    public org.telegram.messenger.n6 X1;
    public int X2;
    public int X3;
    public View X4;
    public CharSequence X5;
    public l0 Y;
    public ImageView Y0;
    public final HashMap Y1;
    public int Y2;
    public int Y3;
    public int Y4;
    public boolean Y5;
    public ai.c0 Z;
    public org.telegram.ui.ActionBar.y0 Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public int Z4;
    public final uu0 Z5;
    public hu0 a;
    public org.telegram.ui.Components.gf0 a0;
    public o4.m0 a1;
    public float a2;
    public int a3;
    public int a4;
    public int a5;
    public float[] a6;
    public org.telegram.ui.Components.tj0 b;
    public org.telegram.messenger.bp b0;
    public float b1;
    public float b2;
    public int b3;
    public int b4;
    public long b5;
    public float b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public ju0 c;
    public org.telegram.ui.Components.cg0 c0;
    public int c1;
    public float c2;
    public int c3;
    public int c4;
    public boolean c5;
    public float c6;
    public bw0 d;
    public org.telegram.ui.Components.hf0 d0;
    public ow0 d1;
    public float d2;
    public int d3;
    public int d4;
    public boolean d5;
    public boolean d6;
    public lw0 e;
    public org.telegram.ui.Cells.o e0;
    public long e1;
    public float e2;
    public int e3;
    public int e4;
    public String e5;
    public wv0 e6;
    public kk f;
    public qu0 f0;
    public long f1;
    public float f2;
    public int f3;
    public int f4;
    public String f5;
    public float f6;
    public AnimatorSet g0;
    public long g1;
    public float g2;
    public int g3;
    public int g4;
    public String g5;
    public float g6;
    public String h;
    public org.telegram.ui.Cells.b4 h0;
    public boolean h1;
    public float h2;
    public int h3;
    public int h4;
    public org.telegram.ui.Components.ig h5;
    public org.telegram.messenger.wo h6;
    public ImageView i0;
    public long i1;
    public float i2;
    public int i3;
    public int i4;
    public final HashSet i5;
    public final SparseIntArray i6;
    public ImageView j0;
    public boolean j1;
    public ValueAnimator j2;
    public int j3;
    public int j4;
    public CharacterStyle j5;
    public int j6;
    public ImageView k0;
    public boolean k1;
    public float k2;
    public int k3;
    public int k4;
    public final wu0 k5;
    public AnimatorSet k6;
    public ImageView l0;
    public boolean l1;
    public float l2;
    public int l3;
    public int l4;
    public final cv0 l5;
    public int l6;
    public org.telegram.ui.Components.zz0 m0;
    public long m1;
    public final float[] m2;
    public int m3;
    public int m4;
    public boolean m5;
    public int m6;
    public String n;
    public org.telegram.ui.Components.nf0 n0;
    public boolean n1;
    public boolean n2;
    public int n3;
    public int n4;
    public kv0 n5;
    public boolean n6;
    public ru0 o0;
    public boolean o1;
    public boolean o2;
    public int o3;
    public int o4;
    public float o5;
    public boolean o6;
    public ew0 p0;
    public boolean p1;
    public boolean p2;
    public int p3;
    public int p4;
    public float p5;
    public org.telegram.ui.Components.fh0 p6;
    public org.telegram.ui.Components.u8 q0;
    public boolean q1;
    public final Paint q2;
    public int q3;
    public int q4;
    public boolean q5;
    public final int[] q6;
    public su0 r;
    public org.telegram.ui.Components.f30 r0;
    public boolean r1;
    public boolean r2;
    public int r3;
    public int r4;
    public boolean r5;
    public float r6;
    public org.telegram.ui.Components.fh0 s;
    public int s0;
    public boolean s1;
    public ii.s0 s2;
    public int s3;
    public int s4;
    public ImageReceiver s5;
    public CharSequence s6;
    public org.telegram.ui.Components.zz0 t0;
    public boolean t1;
    public ii.r t2;
    public int t3;
    public int t4;
    public FrameLayout t5;
    public CharSequence t6;
    public org.telegram.ui.Components.zf0 u0;
    public int u1;
    public TLRPC.ChatFull u2;
    public int u3;
    public int u4;
    public FrameLayout[] u5;
    public boolean u6;
    public tu0 v0;
    public boolean v1;
    public TLRPC.UserFull v2;
    public int v3;
    public int v4;
    public SpannableStringBuilder v5;
    public float v6;
    public AnimatorSet w;
    public ci.z0 w0;
    public boolean w1;
    public org.telegram.ui.Cells.d6 w2;
    public int w3;
    public int w4;
    public SpannableStringBuilder w5;
    public float w6;
    public Drawable x;
    public View x0;
    public boolean x1;
    public boolean x2;
    public int x3;
    public int x4;
    public gi.d[] x5;
    public float x6;
    public Drawable y;
    public final org.telegram.ui.Components.p30 y0;
    public int y1;
    public pw0 y2;
    public int y3;
    public int y4;
    public org.telegram.messenger.video.o y5;
    public float y6;
    public final Paint z0;
    public boolean z1;
    public CharSequence z2;
    public int z3;
    public int z4;
    public FrameLayout z5;
    public mw0 z6;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static ProfileActivity A4(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void G3(ProfileActivity profileActivity, boolean z10) {
        Drawable t10 = profileActivity.f0.getImageReceiver().t();
        String str = null;
        if (t10 instanceof org.telegram.ui.Components.x41) {
            profileActivity.f0.w(null, null, t10);
            return;
        }
        if (t10 instanceof org.telegram.ui.Components.t5) {
            org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) t10;
            profileActivity.f0.w(null, null, t5Var);
            if (z10) {
                t5Var.f(profileActivity.f0);
                return;
            }
            return;
        }
        org.telegram.messenger.ac D = profileActivity.o0.D(0);
        if (D != null && D.p == 2) {
            str = "avatar";
        }
        profileActivity.f0.w(D, str, t10);
    }

    public static int J0(ProfileActivity profileActivity) {
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((kVar == null || !kVar.getOccupyStatusBar()) ? 0 : org.telegram.messenger.g0.m);
    }

    public static void N3(View view, Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        if (view == null || view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return;
        }
        RectF rectF2 = T6;
        if (kh.k.c(view, viewGroup, rectF2) && RectF.intersects(rectF2, rectF)) {
            jh.d.b(new na(view, 3), canvas, rectF, view, viewGroup, (int) (view.getAlpha() * 255.0f));
        }
    }

    public static void O0(ProfileActivity profileActivity, int i3) {
        boolean I0 = org.telegram.ui.Components.ws0.I0(profileActivity.O.getClosestTab());
        if (i3 == profileActivity.F6 && I0 == profileActivity.G6) {
            return;
        }
        profileActivity.F6 = i3;
        profileActivity.G6 = I0;
        if (I0) {
            if (i3 > 0) {
                profileActivity.x5[0].i(org.telegram.messenger.bd.G(i3, "HideStoriesFromAlbum", new Object[0]), true, true);
                return;
            } else {
                profileActivity.x5[0].i(profileActivity.w5, true, true);
                return;
            }
        }
        if (i3 > 0 || !org.telegram.messenger.hp.s1(profileActivity.currentAccount).W4()) {
            profileActivity.x5[0].i(org.telegram.messenger.bd.G(i3, "ArchiveStories", new Object[0]), true, true);
        } else {
            profileActivity.x5[0].i(profileActivity.v5, true, true);
        }
    }

    public static ValueAnimator P0(final ProfileActivity profileActivity, final boolean z10) {
        if (z10) {
            org.telegram.messenger.g0.a3(profileActivity.getParentActivity(), profileActivity.classGuid);
            org.telegram.messenger.g0.l3(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.V1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.V1.cancel();
        }
        ci.z0 z0Var = profileActivity.w0;
        if (z0Var != null) {
            z0Var.setActive(!z10);
        }
        int i3 = 0;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(profileActivity.U1, z10 ? 0.0f : 1.0f);
        final float f10 = profileActivity.Q1;
        profileActivity.b.setTranslationY(f10);
        profileActivity.b.setVisibility(0);
        profileActivity.U0.setVisibility(0);
        profileActivity.a.setVisibility(0);
        profileActivity.y4(true);
        profileActivity.Y.setVisibility(0);
        profileActivity.f.setVisibility(0);
        profileActivity.r.setVisibility(0);
        profileActivity.actionBar.y(profileActivity.U1 > 0.5f);
        int i10 = profileActivity.U1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
        if (f5Var != null) {
            f5Var.setVisibility(i10);
        }
        profileActivity.U0.setVisibility(i10);
        profileActivity.U0.getSearchContainer().setVisibility(profileActivity.U1 <= 0.5f ? 0 : 8);
        profileActivity.b.setEmptyView(profileActivity.P);
        profileActivity.Y.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.eu0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.r0(ProfileActivity.this, ofFloat, f10, z10);
            }
        });
        ofFloat.addListener(new ev0(profileActivity, z10, i3));
        if (!z10) {
            profileActivity.V4 = true;
            profileActivity.T4();
            org.telegram.messenger.g0.Z2(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.f);
        profileActivity.V1 = ofFloat;
        return ofFloat;
    }

    public static void R0(ProfileActivity profileActivity, View view, float f10) {
        if (profileActivity.o2) {
            if (profileActivity.p2) {
                profileActivity.a.w0(0, ((view.getTop() - profileActivity.a.getMeasuredWidth()) - profileActivity.e4()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (profileActivity.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0), org.telegram.ui.Components.xq.h);
                return;
            } else {
                profileActivity.a.w0(0, view.getTop() - profileActivity.j4(), org.telegram.ui.Components.xq.h);
                return;
            }
        }
        boolean z10 = profileActivity.e4() > 0;
        if (z10) {
            float f11 = profileActivity.Q1;
            if (f11 > 0.0f && ((f11 < profileActivity.j4() * 0.6f || f10 < -1000.0f) && profileActivity.Q1 > profileActivity.e4() * 0.6f)) {
                profileActivity.a.w0(0, (int) (profileActivity.Q1 - profileActivity.e4()), org.telegram.ui.Components.xq.h);
                return;
            }
        }
        if (z10) {
            float f12 = profileActivity.Q1;
            if (f12 > 0.0f && f12 < profileActivity.e4() * 0.6f) {
                profileActivity.a.w0(0, (int) profileActivity.Q1, org.telegram.ui.Components.xq.h);
                return;
            }
        }
        if (!z10) {
            float f13 = profileActivity.Q1;
            if (f13 > 0.0f && f10 < -1000.0f) {
                profileActivity.a.w0(0, (int) f13, org.telegram.ui.Components.xq.h);
                return;
            }
        }
        if (profileActivity.Q1 > 0.0f) {
            profileActivity.a.w0(0, view.getTop() - profileActivity.j4(), org.telegram.ui.Components.xq.h);
        }
    }

    public static void V4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, activity, null);
        s1Var.j0 = false;
        s1Var.show();
        Utilities.e.c(new a60(s1Var, z10, activity));
    }

    public static SpannableStringBuilder W3(String str, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        fv0 fv0Var = new fv0(9);
        fv0Var.w = str;
        if (fv0Var.c != null) {
            fv0Var.c = null;
            fv0Var.a();
        }
        fv0Var.f = w02;
        fv0Var.n = false;
        spannableStringBuilder.setSpan(fv0Var, 0, spannableStringBuilder.length(), 0);
        cz[] czVarArr = (cz[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cz.class);
        if (czVarArr != null) {
            for (cz czVar : czVarArr) {
                czVar.getClass();
                czVar.f = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
                czVar.r = i3;
                czVar.s = e6Var;
                czVar.n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static void Y4(FrameLayout frameLayout, float f10) {
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(U6 * f10);
        frameLayout.setAlpha(1.0f - f10);
        frameLayout.setVisibility(f10 < 1.0f ? 0 : 4);
    }

    public static void Z(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.dy0.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.A0);
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document e10;
        org.telegram.ui.Components.ac h;
        if (profileActivity.J2 != null) {
            return;
        }
        if (!profileActivity.q1 || profileActivity.getMessagesController().D3()) {
            if (profileActivity.a4()) {
                return;
            }
            profileActivity.K4(false);
            return;
        }
        ArrayList l10 = profileActivity.getMessagesController().q7.l(profileActivity.f1);
        if (l10 != null) {
            TLRPC.TL_forumTopic tL_forumTopic = null;
            for (int i3 = 0; tL_forumTopic == null && i3 < l10.size(); i3++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l10.get(i3);
                if (tL_forumTopic2 != null && tL_forumTopic2.id == profileActivity.g1) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
            if (tL_forumTopic != null) {
                long j10 = tL_forumTopic.icon_emoji_id;
                if (j10 == 0 || (e10 = org.telegram.ui.Components.g5.e(profileActivity.currentAccount, j10)) == null || (h = org.telegram.ui.Components.fc.a0(profileActivity).h(e10, 1, new vt0(profileActivity, 2))) == null) {
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
            for (int i3 = 0; i3 < codecCount; i3++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i10].equals(str)) {
                            (codecInfoAt.isEncoder() ? arrayList2 : arrayList).add(Integer.valueOf(i3));
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
        if (profileActivity.Z3 >= 0) {
            if (profileActivity.K4 == -1) {
                profileActivity.J5();
                profileActivity.d.f();
            } else {
                profileActivity.D5(false, false);
            }
        }
        if (profileActivity.K4 == -1) {
            if (profileActivity.n2 || org.telegram.messenger.g0.Q1()) {
                profileActivity.a.setPadding(0, profileActivity.j4(), 0, 0);
                profileActivity.j2.cancel();
                float[] fArr = profileActivity.m2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.X4(1.0f);
                profileActivity.Q1 = profileActivity.j4();
            } else {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (profileActivity.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredWidth(), TLObject.FLAG_30);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
                int i3 = 0;
                int i10 = 0;
                while (true) {
                    bw0 bw0Var = profileActivity.d;
                    if (i3 >= bw0Var.e.N2) {
                        break;
                    }
                    u4.d1 a10 = bw0Var.a(null, bw0Var.d(i3));
                    View view = a10.a;
                    profileActivity.d.t(a10, i3);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i10 += view.getMeasuredHeight();
                    i3++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.j4() + i10) + currentActionBarHeight));
                hu0 hu0Var = profileActivity.a;
                hu0Var.setPadding(0, hu0Var.getPaddingTop(), 0, max);
            }
        }
        profileActivity.M.m(profileActivity.i1, user, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c0(ProfileActivity profileActivity, int i3) {
        boolean z10;
        if (i3 < 0) {
            return;
        }
        Object valueOf = Integer.valueOf(profileActivity.T2);
        lw0 lw0Var = profileActivity.e;
        if (!lw0Var.x) {
            if (!lw0Var.w.isEmpty()) {
                i3--;
            }
            if (i3 < 0 || i3 >= profileActivity.e.w.size()) {
                int f10 = k2.p1.f(1, i3, profileActivity.e.w);
                if (f10 >= 0 && f10 < profileActivity.e.d.size()) {
                    valueOf = profileActivity.e.d.get(f10);
                    z10 = false;
                    if (!(valueOf instanceof kw0)) {
                        kw0 kw0Var = (kw0) valueOf;
                        org.telegram.ui.ActionBar.q4 parentLayout = profileActivity.getParentLayout();
                        kw0Var.b.run();
                        org.telegram.messenger.g0.k3(parentLayout, kw0Var.c);
                    } else if (valueOf instanceof org.telegram.messenger.to) {
                        org.telegram.messenger.hs.f(profileActivity.currentAccount).k(org.telegram.messenger.hs.c1, profileActivity.e.F, ((org.telegram.messenger.to) valueOf).c);
                    }
                    if (z10 || valueOf == null) {
                    }
                    profileActivity.e.E(valueOf);
                    return;
                }
            } else {
                valueOf = profileActivity.e.w.get(i3);
            }
        } else if (i3 < lw0Var.r.size()) {
            valueOf = profileActivity.e.r.get(i3);
        } else {
            int f11 = k2.p1.f(1, i3, profileActivity.e.r);
            if (f11 >= 0 && f11 < profileActivity.e.s.size()) {
                valueOf = profileActivity.e.s.get(f11);
            }
        }
        z10 = true;
        if (!(valueOf instanceof kw0)) {
        }
        if (z10) {
        }
    }

    public static void c5(int i3, View view) {
        if (view == null || view.getLayoutParams() == null || view.getLayoutParams().height == i3) {
            return;
        }
        view.getLayoutParams().height = i3;
        if (view.isLaidOut()) {
            view.setBottom(view.getTop() + i3);
        } else {
            view.requestLayout();
        }
    }

    public static void d0(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.k5 k5Var) {
        org.telegram.messenger.ac b10;
        String str;
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            sf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().V2 + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        vg.h1 h1Var = new vg.h1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.A0);
        k5Var.getLocationOnScreen(new int[2]);
        h1Var.o2 = k5Var.i0;
        h1Var.p2 = k5Var.j0;
        h1Var.s2 = k5Var.getScaleX();
        h1Var.q2 = k5Var.getLeft();
        h1Var.r2 = k5Var.getTop();
        h1Var.t2 = k5Var;
        Drawable rightDrawable = k5Var.getRightDrawable();
        org.telegram.ui.Components.e5 e5Var = profileActivity.G;
        if (rightDrawable == e5Var && e5Var != null) {
            Drawable drawable = e5Var.f[0];
            if (drawable instanceof org.telegram.ui.Components.g5) {
                h1Var.s2 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.g5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(profileActivity.getParentActivity());
                    org.telegram.messenger.jz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.ac.b(document);
                        if (d != null) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.zi.L2(document, false)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        b10 = org.telegram.messenger.ac.b(document);
                        str = "160_160";
                    }
                    String str2 = str;
                    org.telegram.messenger.ac acVar = b10;
                    k9Var.setLayerNum(7);
                    k9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                    k9Var.m(acVar, str2, org.telegram.messenger.ac.c(w10, document), "140_140", d, document);
                    if (((org.telegram.ui.Components.g5) profileActivity.G.f[0]).c()) {
                        k9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, profileActivity.A0), PorterDuff.Mode.SRC_IN));
                        h1Var.v2 = org.telegram.messenger.zi.j1(document);
                    } else {
                        h1Var.v2 = org.telegram.messenger.zi.j1(document);
                    }
                    h1Var.u2 = k9Var;
                    h1Var.x2 = true;
                }
            }
        }
        profileActivity.showDialog(h1Var);
    }

    public static void d1(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.c2, 0.25f) / 0.25f;
        if (profileActivity.q1) {
            profileActivity.u0.setAlpha(1.0f - min);
            profileActivity.u0.setBlurIntensity(0.0f);
            profileActivity.u0.setGooeyEnabled(false);
            profileActivity.u0.setVisibility(profileActivity.c2 >= 1.0f ? 8 : 0);
        } else {
            profileActivity.u0.setHideProgress(profileActivity.c2);
        }
        tu0 tu0Var = profileActivity.v0;
        if (tu0Var != null && profileActivity.J1 != 2) {
            float f10 = profileActivity.c2;
            tu0Var.setAlpha(f10 > 0.0f ? org.telegram.messenger.g0.T1(1.0f, 0.0f, org.telegram.messenger.g0.z1(f10, 0.0f, 0.5f)) : 1.0f);
        }
        profileActivity.x5();
    }

    public static void d5(org.telegram.ui.ActionBar.f5 f5Var, boolean z10, boolean z11) {
        if (com.google.android.recaptcha.internal.a.u(f5Var)) {
            f5Var.Y(z10, z11);
        } else if (f5Var != null) {
            f5Var.setVisibility(z10 ? 0 : 8);
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
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.hs.g2, false, null, false);
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
            if (w10 != null && profileActivity.I2 != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                File K = org.telegram.messenger.w7.K(w10, null, true, true);
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                org.telegram.messenger.w7.K(profileActivity.I2, null, true, true).renameTo(K);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(profileActivity.I2.volume_id);
                sb2.append("_");
                String o10 = a1.g.o(profileActivity.I2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.zb.D().S(o10, a1.g.o(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.ac.m(profileActivity.currentAccount, 1, a22));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                new File(str).renameTo(org.telegram.messenger.w7.K(x10, "mp4", true, true));
            } else if (w11 != null && profileActivity.J2 != null) {
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                File K2 = org.telegram.messenger.w7.K(w11, null, true, true);
                org.telegram.messenger.w7.G(profileActivity.currentAccount);
                org.telegram.messenger.w7.K(profileActivity.J2, null, true, true).renameTo(K2);
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
        profileActivity.o2 = (org.telegram.messenger.g0.Q1() || profileActivity.n2 || !profileActivity.f0.getImageReceiver().L() || org.telegram.messenger.g0.C1()) ? false : true;
        profileActivity.I2 = null;
        profileActivity.J2 = null;
        ru0 ru0Var = profileActivity.o0;
        ru0Var.I0 = true;
        ru0Var.L0 = profileActivity.K2;
        ru0Var.r1 = null;
        ru0Var.s1 = null;
        ru0Var.setCreateThumbFromParent(false);
        profileActivity.I5(true);
        profileActivity.j5(false, true);
        profileActivity.getNotificationCenter().k(org.telegram.messenger.hs.r, Integer.valueOf(org.telegram.messenger.hp.C8));
        profileActivity.getNotificationCenter().k(org.telegram.messenger.hs.j0, new Object[0]);
        profileActivity.getUserConfig().v(true);
    }

    public static boolean f0(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_error tL_error) {
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.hp.s1(profileActivity.currentAccount).d7.edit().putLong("dialog_join_requested_time_" + profileActivity.i1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        boolean z11 = org.telegram.messenger.t3.T(profileActivity.E2) && !profileActivity.E2.megagroup;
        int i3 = org.telegram.ui.Components.x60.r1;
        org.telegram.ui.Components.x60.J0(parentActivity, profileActivity, org.telegram.ui.Components.fc.a0(profileActivity), z11);
        if (!z10 || profileActivity.M4 != -1) {
            profileActivity.J5();
            bw0 bw0Var = profileActivity.d;
            if (bw0Var != null) {
                bw0Var.f();
            }
        }
        if (d2Var instanceof wm) {
            ((wm) d2Var).Yb(false, true);
        }
        return false;
    }

    public static /* synthetic */ void g0(ProfileActivity profileActivity) {
        org.telegram.messenger.hp.s1(profileActivity.currentAccount).l0(null);
        profileActivity.V.M(0);
        profileActivity.W.M(0);
    }

    public static void h0(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.ac Q = org.telegram.ui.Components.fc.a0(profileActivity).Q(R.raw.contact_check, 36, org.telegram.messenger.bd.M0(2131746864, null));
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
            org.telegram.messenger.k5.o(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity), R.raw.error, 36);
            return;
        }
        if (profileActivity.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.resourceProvider);
            String M0 = org.telegram.messenger.bd.M0(2131746860, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131746861, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
            profileActivity.showDialog(s1Var);
        }
    }

    public static /* synthetic */ void i0(ProfileActivity profileActivity, Context context, long j10, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            ii.q3.J0(context, profileActivity.currentAccount, profileActivity.v2.starref_program, profileActivity.getUserConfig().e(), profileActivity.A0, false);
        } else {
            ii.q3.K0(context, profileActivity.currentAccount, connectedbotstarref, j10, profileActivity.A0);
        }
    }

    public static /* synthetic */ void j0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.I2 = fileLocation;
            profileActivity.J2 = photoSize2.location;
            profileActivity.f0.j(org.telegram.messenger.ac.e(fileLocation), "50_50", profileActivity.q0, null);
            if (profileActivity.O2 != -1) {
                profileActivity.J5();
                bw0 bw0Var = profileActivity.d;
                if (bw0Var != null) {
                    bw0Var.f();
                }
                profileActivity.y4(true);
            }
            ru0 ru0Var = profileActivity.o0;
            org.telegram.messenger.ac e10 = org.telegram.messenger.ac.e(profileActivity.J2);
            profileActivity.K2 = e10;
            ru0Var.A(e10, org.telegram.messenger.ac.e(profileActivity.I2));
            profileActivity.j5(true, false);
        } else {
            if (profileActivity.I2 == null) {
                return;
            }
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i3 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i3 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            profileActivity.j6 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new xy(25, profileActivity, str));
        }
        profileActivity.actionBar.q().requestLayout();
    }

    public static void k0(ProfileActivity profileActivity, Context context, long j10, View view, int i3, float f10, float f11) {
        TLRPC.User a22;
        bw0 bw0Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.a.C0();
        if (i3 == profileActivity.S3) {
            TLRPC.User a23 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.e1));
            TLRPC.UserFull userFull = profileActivity.v2;
            if (userFull != null && userFull.starref_program != null) {
                long e10 = profileActivity.getUserConfig().e();
                ci.i0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), e10, profileActivity.e1, new ci.u1(profileActivity, context, e10, 3));
                return;
            } else {
                if (a23 == null || !a23.bot_can_edit) {
                    return;
                }
                profileActivity.presentFragment(new ii.k(profileActivity.e1));
                return;
            }
        }
        int i10 = 1;
        if (i3 == profileActivity.Q3) {
            boolean z10 = !profileActivity.getMessagesController().r2(j10, profileActivity.g1, null);
            profileActivity.getNotificationsController().G(j10, profileActivity.g1, z10);
            org.telegram.ui.Components.fc.A(profileActivity, z10, null).j();
            profileActivity.v5();
            int i11 = profileActivity.Q3;
            if (i11 < 0 || (bw0Var = profileActivity.d) == null) {
                return;
            }
            bw0Var.g(i11);
            return;
        }
        if (i3 == profileActivity.Z3) {
            TLRPC.User a24 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.e1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", a24.id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.e5);
            bundle.putString("first_name_card", profileActivity.f5);
            bundle.putString("last_name_card", profileActivity.g5);
            lr lrVar = new lr(bundle, profileActivity.A0);
            lrVar.P = new nt0(profileActivity, a24);
            profileActivity.presentFragment(lrVar);
            return;
        }
        if (i3 == profileActivity.W3) {
            TextView textView = (TextView) org.telegram.ui.Components.t4.h0(profileActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131751509, null), org.telegram.messenger.bd.M0(2131751593, null), org.telegram.messenger.bd.M0(2131751592, null), org.telegram.messenger.bd.M0(2131751599, null), new vt0(profileActivity, i10), profileActivity.A0, false).d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        int i12 = 2;
        if (i3 == profileActivity.X3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
            String M0 = org.telegram.messenger.bd.M0(2131746221, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131746242, null);
            TLRPC.Chat M02 = profileActivity.getMessagesController().M0(Long.valueOf(-profileActivity.b5));
            org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
            if (M02 != null && org.telegram.messenger.t3.w(2, M02)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, profileActivity.getParentActivity(), profileActivity.A0);
                c2VarArr[0] = c2Var;
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                c2VarArr[0].e(org.telegram.messenger.bd.M0(2131753727, null), "", true, false, false);
                c2VarArr[0].setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                linearLayout.addView(c2VarArr[0], b8.mf.o(-1, -2));
                c2VarArr[0].setOnClickListener(new q00(c2VarArr, i12));
                alertDialog$Builder.o(linearLayout);
            }
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746240, null), new rb0(18, profileActivity, c2VarArr));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new u70(8));
            TextView textView2 = (TextView) alertDialog$Builder.p().d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        if (i3 == profileActivity.r4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", (int) (profileActivity.i1 & 4294967295L));
            profileActivity.presentFragment(new j50(bundle2));
            return;
        }
        if (i3 == profileActivity.q4) {
            profileActivity.showDialog(org.telegram.ui.Components.t4.U(profileActivity.getParentActivity(), profileActivity.D2, profileActivity.A0).a);
            return;
        }
        if (i3 == profileActivity.N3) {
            profileActivity.F4(view, f10, f11, false);
            return;
        }
        if (i3 == profileActivity.L4) {
            profileActivity.getMessagesController().f5(null, profileActivity.e1);
            if (org.telegram.ui.Components.fc.a(profileActivity)) {
                org.telegram.ui.Components.fc.d(profileActivity, false).j();
                return;
            }
            return;
        }
        int i13 = 9;
        if (i3 == profileActivity.a4) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
                return;
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                return;
            }
        }
        if (i3 == profileActivity.U3) {
            profileActivity.I4();
            return;
        }
        if (i3 == profileActivity.V3) {
            ey0.K0(profileActivity.a(), profileActivity);
            return;
        }
        if (i3 >= profileActivity.u4 && i3 < profileActivity.v4) {
            profileActivity.h(!profileActivity.C2.isEmpty() ? profileActivity.u2.participants.participants.get(((Integer) profileActivity.C2.get(i3 - profileActivity.u4)).intValue()) : profileActivity.u2.participants.participants.get(i3 - profileActivity.u4), false, false, view);
            return;
        }
        if (i3 == profileActivity.w4) {
            profileActivity.J4();
            return;
        }
        if (i3 == profileActivity.L3) {
            profileActivity.Q4(f10, f11, i3, view);
            return;
        }
        if (i3 == profileActivity.l4) {
            if (profileActivity.E2 != null) {
                profileActivity.showDialog(new ji.b0(profileActivity, profileActivity.E2.linked_community_id, null, null));
                return;
            } else {
                if (profileActivity.e1 == 0 || (a22 = profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.e1))) == null) {
                    return;
                }
                profileActivity.showDialog(new ji.b0(profileActivity, a22.linked_community_id, null, null));
                return;
            }
        }
        if (i3 == profileActivity.I3) {
            if (profileActivity.u2.location instanceof TLRPC.TL_channelLocation) {
                la0 la0Var = new la0(5);
                long j11 = profileActivity.f1;
                TLRPC.TL_channelLocation tL_channelLocation = (TLRPC.TL_channelLocation) profileActivity.u2.location;
                la0Var.m0 = -j11;
                la0Var.C0 = tL_channelLocation;
                profileActivity.presentFragment(la0Var);
                return;
            }
            return;
        }
        if (i3 == profileActivity.M4) {
            profileActivity.E4(false);
            return;
        }
        if (i3 == profileActivity.x4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f1);
            bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            nq nqVar = new nq(bundle3);
            nqVar.C0(profileActivity.u2);
            profileActivity.presentFragment(nqVar);
            return;
        }
        if (i3 == profileActivity.y4) {
            profileActivity.presentFragment(new ai.c7(profileActivity.f1));
            return;
        }
        if (i3 == profileActivity.z4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            nq nqVar2 = new nq(bundle4);
            nqVar2.C0(profileActivity.u2);
            profileActivity.presentFragment(nqVar2);
            return;
        }
        if (i3 == profileActivity.A4) {
            profileActivity.S0.performClick();
            return;
        }
        if (i3 == profileActivity.B4) {
            profileActivity.presentFragment(new ci.v(0, profileActivity.e1));
            return;
        }
        if (i3 == profileActivity.C4) {
            profileActivity.presentFragment(new ci.v(1, profileActivity.e1));
            return;
        }
        if (i3 == profileActivity.D4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new r41(bundle5));
            return;
        }
        if (i3 == profileActivity.G4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f1);
            bundle6.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            nq nqVar3 = new nq(bundle6);
            nqVar3.C0(profileActivity.u2);
            profileActivity.presentFragment(nqVar3);
            return;
        }
        if (i3 == profileActivity.f3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
            return;
        }
        if (i3 == profileActivity.h3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.H2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.D0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
            return;
        }
        if (i3 == profileActivity.i3) {
            profileActivity.presentFragment(new DataSettingsActivity());
            return;
        }
        if (i3 == profileActivity.j3) {
            profileActivity.presentFragment(new ThemeActivity(0));
            return;
        }
        if (i3 == profileActivity.k3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
            return;
        }
        if (i3 == profileActivity.m3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
            return;
        }
        if (i3 == profileActivity.l3) {
            profileActivity.presentFragment(new t90());
            return;
        }
        if (i3 == profileActivity.n3) {
            profileActivity.presentFragment(new SessionsActivity(0));
            return;
        }
        if (i3 == profileActivity.q3) {
            profileActivity.showDialog(org.telegram.ui.Components.t4.T(profileActivity, profileActivity.A0));
            return;
        }
        if (i3 == profileActivity.r3) {
            sf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
            return;
        }
        if (i3 == profileActivity.s3) {
            sf.c.t(profileActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
            return;
        }
        if (i3 == profileActivity.v3) {
            V4(profileActivity.getParentActivity(), false);
            return;
        }
        if (i3 == profileActivity.w3) {
            V4(profileActivity.getParentActivity(), true);
            return;
        }
        if (i3 == profileActivity.x3) {
            org.telegram.messenger.a8.a();
            return;
        }
        if (i3 == profileActivity.y3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
            String M03 = org.telegram.messenger.bd.M0(2131754120, null);
            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
            s1Var2.U = M03;
            s1Var2.S = org.telegram.messenger.bd.M0(R.string.AppName, null);
            alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), new jt0(profileActivity, i13));
            alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            profileActivity.showDialog(s1Var2);
            return;
        }
        if (i3 == profileActivity.g3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
            return;
        }
        if (i3 == profileActivity.V2) {
            profileActivity.presentFragment(new ka(null));
            return;
        }
        if (i3 == profileActivity.W2) {
            profileActivity.presentFragment(new UserInfoActivity());
            return;
        }
        if (i3 == profileActivity.T2) {
            profileActivity.presentFragment(new g(3));
            return;
        }
        if (i3 == profileActivity.O2) {
            profileActivity.I4();
            return;
        }
        if (i3 == profileActivity.c4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
            return;
        }
        if (i3 == profileActivity.d4) {
            profileActivity.presentFragment(new ci.wb());
            return;
        }
        if (i3 == profileActivity.e4) {
            profileActivity.presentFragment(new hi.g());
            return;
        }
        if (i3 == profileActivity.f4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
            return;
        }
        if (i3 == profileActivity.g4) {
            xg.e1.l1(0, org.telegram.messenger.v1.a(profileActivity.currentAccount).b());
            return;
        }
        if (i3 == profileActivity.botPermissionLocation) {
            ii.s0 s0Var = profileActivity.s2;
            if (s0Var != null) {
                s0Var.l(!s0Var.g(), new hk0(25, profileActivity, view));
                return;
            }
            return;
        }
        if (i3 == profileActivity.botPermissionBiometry) {
            ii.r rVar = profileActivity.t2;
            if (rVar != null) {
                boolean z11 = !rVar.e;
                rVar.f = true;
                rVar.e = z11;
                rVar.k();
                ((org.telegram.ui.Cells.l8) view).setChecked(profileActivity.t2.e);
                return;
            }
            return;
        }
        if (i3 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            l8Var.setChecked(!l8Var.d());
            if (profileActivity.o4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.o4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().o1(profileActivity.e1);
            boolean d = l8Var.d();
            toggleuseremojistatuspermission.enabled = d;
            TLRPC.UserFull userFull2 = profileActivity.v2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = d;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new xy(24, profileActivity, r0));
            profileActivity.o4 = sendRequest;
            int[] iArr = {sendRequest};
            return;
        }
        if (i3 == profileActivity.O3) {
            profileActivity.O4 = !profileActivity.O4;
            profileActivity.T4();
            view.requestLayout();
            profileActivity.d.g(profileActivity.O3);
            int i14 = profileActivity.l6;
            if (i14 >= 0) {
                profileActivity.c.h1(i14, profileActivity.m6 - profileActivity.a.getPaddingTop());
                return;
            }
            return;
        }
        if (i3 == profileActivity.P3) {
            profileActivity.N4(false);
            return;
        }
        if (i3 == profileActivity.Q2) {
            if (profileActivity.v2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.v2.personal_channel_id);
            profileActivity.presentFragment(new wm(bundle7));
            return;
        }
        if (i3 != profileActivity.U2) {
            if (i3 == profileActivity.H3) {
                profileActivity.Y3(i3, view);
                return;
            } else {
                profileActivity.Q4(f10, f11, i3, view);
                return;
            }
        }
        sw0 sw0Var = profileActivity.A6;
        if ((sw0Var == null || !sw0Var.a()) && !profileActivity.Z3(i3, view)) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (w8Var.d.getDrawable() != null) {
                profileActivity.H4(w8Var.getImageView());
            }
        }
    }

    public static void l0(ProfileActivity profileActivity) {
        org.telegram.ui.ActionBar.e2 e2Var;
        int i3;
        String str;
        TextView[] textViewArr;
        final int i10;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.v2;
        if (userFull == null || userFull.stars_rating == null) {
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var = null;
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(profileActivity.getParentActivity(), false, 1, null);
        org.telegram.ui.ActionBar.e2 e2Var2 = h.y0;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        final LimitPreviewView limitPreviewView = new LimitPreviewView(R.drawable.filled_rating_crown, 0, 0, profileActivity.getParentActivity(), profileActivity.A0);
        limitPreviewView.setHideNegativeValues(profileActivity.a() != org.telegram.messenger.h10.i(profileActivity.currentAccount).e());
        limitPreviewView.setStarRating(userFull.stars_rating);
        limitPreviewView.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
        linearLayout.addView(limitPreviewView, b8.mf.t(-1, -2, 17, 0, 20, 0, 10));
        int i11 = 17;
        if (userFull.stars_my_pending_rating != null) {
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            linearLayout.addView(frameLayout, b8.mf.t(-1, -2, 17, 40, -12, 40, 20));
            int i12 = 2;
            org.telegram.ui.Components.s70[] s70VarArr = new org.telegram.ui.Components.s70[2];
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i12;
                ai.e2 e2Var3 = new ai.e2(6, parentActivity, e6Var);
                s70VarArr[i13] = e2Var3;
                e2Var3.setGravity(i11);
                s70VarArr[i13].setTextSize(1, 12.0f);
                org.telegram.ui.ActionBar.r6.V(s70VarArr[i13], org.telegram.ui.ActionBar.k6.y6, null);
                org.telegram.ui.ActionBar.r6.H(s70VarArr[i13], org.telegram.ui.ActionBar.k6.Uc, null);
                frameLayout.addView(s70VarArr[i13], b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
                s70VarArr[i13].setAlpha(i13 == 0 ? 1.0f : 0.0f);
                s70VarArr[i13].setScaleX(i13 == 0 ? 1.0f : 0.8f);
                s70VarArr[i13].setScaleY(i13 == 0 ? 1.0f : 0.8f);
                i13++;
                i12 = i14;
                i11 = 17;
            }
            int i15 = i12;
            final s3 s3Var = new s3(s70VarArr, 21);
            boolean z10 = profileActivity.a() == org.telegram.messenger.h10.i(profileActivity.currentAccount).e();
            long j10 = userFull.stars_rating.stars;
            TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
            e2Var = e2Var2;
            long j11 = (-j10) - (tl_starsRating != null ? tl_starsRating.stars - j10 : 0L);
            int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(profileActivity.currentAccount).getCurrentTime()) / 86400);
            long j12 = userFull.stars_my_pending_rating.stars;
            long j13 = userFull.stars_rating.stars;
            long j14 = j12 - j13;
            if ((j13 >= 0 || z10) && (!z10 || j11 <= 0)) {
                textViewArr = s70VarArr;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String H = org.telegram.messenger.bd.H(',', "StarRatingFuture", max);
                String H2 = org.telegram.messenger.bd.H(',', "StarRatingFuturePendingPoints", (int) j14);
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[0] = H;
                charSequenceArr[1] = "\n";
                charSequenceArr[i15] = H2;
                spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                spannableStringBuilder.append((CharSequence) " ");
                i10 = 0;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(2131745196, null), new Runnable() { // from class: org.telegram.ui.au0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16 = i10;
                        s3 s3Var2 = s3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i16) {
                            case 0:
                                RectF rectF = ProfileActivity.T6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                s3Var2.a(Boolean.TRUE);
                                break;
                            default:
                                RectF rectF2 = ProfileActivity.T6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                s3Var2.a(Boolean.FALSE);
                                break;
                        }
                    }
                }), true));
                textViewArr[0].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.bu0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i16 = i10;
                        s3 s3Var2 = s3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i16) {
                            case 0:
                                RectF rectF = ProfileActivity.T6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                s3Var2.a(Boolean.TRUE);
                                break;
                            default:
                                RectF rectF2 = ProfileActivity.T6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                s3Var2.a(Boolean.FALSE);
                                break;
                        }
                    }
                });
                textViewArr[0].setText(spannableStringBuilder);
            } else {
                boolean z11 = z10;
                textViewArr = s70VarArr;
                org.telegram.ui.ActionBar.r6.V(s70VarArr[0], org.telegram.ui.ActionBar.k6.q7, null);
                if (z11) {
                    textViewArr[0].setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.H(',', "StarRatingLevelNegativeYou", (int) j11)));
                } else {
                    textViewArr[0].setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131745182, org.telegram.messenger.m5.l(org.telegram.messenger.h10.t0, profileActivity.a()))));
                }
                i10 = 0;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String H3 = org.telegram.messenger.bd.H(',', "StarRatingFuturePreview1", max);
            String H4 = org.telegram.messenger.bd.H(',', "StarRatingFuturePreview2", (int) j14);
            CharSequence[] charSequenceArr2 = new CharSequence[3];
            charSequenceArr2[i10] = H3;
            final int i16 = 1;
            charSequenceArr2[1] = "\n";
            charSequenceArr2[i15] = H4;
            spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(2131745195, null), new Runnable() { // from class: org.telegram.ui.au0
                @Override // java.lang.Runnable
                public final void run() {
                    int i162 = i16;
                    s3 s3Var2 = s3Var;
                    TLRPC.UserFull userFull2 = userFull;
                    LimitPreviewView limitPreviewView2 = limitPreviewView;
                    switch (i162) {
                        case 0:
                            RectF rectF = ProfileActivity.T6;
                            limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            s3Var2.a(Boolean.TRUE);
                            break;
                        default:
                            RectF rectF2 = ProfileActivity.T6;
                            limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                            s3Var2.a(Boolean.FALSE);
                            break;
                    }
                }
            }), true));
            textViewArr[1].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.bu0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i162 = i16;
                    s3 s3Var2 = s3Var;
                    TLRPC.UserFull userFull2 = userFull;
                    LimitPreviewView limitPreviewView2 = limitPreviewView;
                    switch (i162) {
                        case 0:
                            RectF rectF = ProfileActivity.T6;
                            limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            s3Var2.a(Boolean.TRUE);
                            break;
                        default:
                            RectF rectF2 = ProfileActivity.T6;
                            limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                            s3Var2.a(Boolean.FALSE);
                            break;
                    }
                }
            });
            textViewArr[1].setText(spannableStringBuilder2);
        } else {
            e2Var = e2Var2;
        }
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.bd.M0(2131745177, null));
        textView.setTextSize(1, 20.0f);
        int i17 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i17, profileActivity.A0);
        linearLayout.addView(textView, b8.mf.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        if (userFull.id == org.telegram.messenger.h10.i(profileActivity.currentAccount).e()) {
            textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131745178, null)));
            i3 = 1;
        } else {
            i3 = 1;
            org.telegram.messenger.k5.r(null, null, 2131745208, new Object[]{org.telegram.messenger.m5.l(org.telegram.messenger.h10.t0, profileActivity.a())}, textView2);
        }
        textView2.setTextSize(i3, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, i17, profileActivity.A0);
        linearLayout.addView(textView2, b8.mf.t(-1, -2, 17, 20, 0, 20, 12));
        yr0 yr0Var = new yr0(parentActivity, profileActivity.A0);
        yr0Var.a.l(org.telegram.messenger.bd.M0(2131745176, null), false);
        String M0 = org.telegram.messenger.bd.M0(2131745211, null);
        int i18 = org.telegram.ui.ActionBar.k6.Ci;
        yr0Var.b.setText(org.telegram.messenger.bd.V(null, null, 2131745207, W3(M0, i18, profileActivity.A0)));
        yr0Var.d.setVisibility(8);
        ImageView imageView = yr0Var.c;
        imageView.setImageResource(R.drawable.menu_gift);
        org.telegram.ui.ActionBar.e6 e6Var2 = profileActivity.A0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.r6.t(imageView, i17, e6Var2, mode);
        linearLayout.addView(yr0Var, b8.mf.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        yr0 yr0Var2 = new yr0(parentActivity, profileActivity.A0);
        yr0Var2.a.l(org.telegram.messenger.bd.M0(2131745175, null), false);
        yr0Var2.b.setText(org.telegram.messenger.bd.V(null, null, 2131745206, W3(org.telegram.messenger.bd.M0(2131745211, null), i18, profileActivity.A0)));
        yr0Var2.d.setVisibility(8);
        ImageView imageView2 = yr0Var2.c;
        imageView2.setImageResource(R.drawable.menu_stars_gift);
        org.telegram.ui.ActionBar.r6.t(imageView2, i17, profileActivity.A0, mode);
        linearLayout.addView(yr0Var2, b8.mf.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        yr0 yr0Var3 = new yr0(parentActivity, profileActivity.A0);
        yr0Var3.a.l(org.telegram.messenger.bd.M0(2131745174, null), false);
        String M02 = org.telegram.messenger.bd.M0(2131745209, null);
        int f10 = org.telegram.ui.ActionBar.k6.I.q() ? i0.a.f(0.25f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.m6, profileActivity.A0), -16777216) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, profileActivity.A0);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(M02);
        fv0 fv0Var = new fv0(9);
        fv0Var.w = M02;
        if (fv0Var.c != null) {
            str = null;
            fv0Var.c = null;
            fv0Var.a();
        } else {
            str = null;
        }
        fv0Var.f = f10;
        fv0Var.n = false;
        spannableStringBuilder3.setSpan(fv0Var, 0, spannableStringBuilder3.length(), 0);
        yr0Var3.b.setText(org.telegram.messenger.bd.V(str, str, 2131745205, spannableStringBuilder3));
        yr0Var3.d.setVisibility(8);
        ImageView imageView3 = yr0Var3.c;
        imageView3.setImageResource(R.drawable.menu_refund);
        org.telegram.ui.ActionBar.r6.t(imageView3, i17, profileActivity.A0, mode);
        linearLayout.addView(yr0Var3, b8.mf.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        gi.d dVar = new gi.d(parentActivity, profileActivity.A0, true);
        dVar.setOnClickListener(new cu0(0, e2Var));
        dVar.i(ci.l6.g2(org.telegram.messenger.bd.M0(2131743898, null)), false, true);
        linearLayout.addView(dVar, b8.mf.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        h.O = linearLayout;
        h.show();
    }

    public static void m0(ProfileActivity profileActivity, int i3, float f10, float f11) {
        int i10 = 24;
        switch (i3) {
            case 0:
                boolean z10 = profileActivity.q1;
                if (!z10) {
                    if (profileActivity.e1 == 0) {
                        if (profileActivity.f1 != 0) {
                            if (!org.telegram.messenger.t3.c0(profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.f1)))) {
                                if (!profileActivity.c4()) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", profileActivity.f1);
                                    if (profileActivity.getMessagesController().E(bundle, profileActivity, null, null)) {
                                        profileActivity.presentFragment(new wm(bundle), false);
                                        break;
                                    }
                                }
                            } else {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", profileActivity.f1);
                                if (profileActivity.getMessagesController().E(bundle2, profileActivity, null, null)) {
                                    profileActivity.presentFragment(new wm(bundle2), false);
                                    break;
                                }
                            }
                        }
                    } else {
                        profileActivity.L4();
                        break;
                    }
                } else if (z10) {
                    profileActivity.c4();
                    break;
                }
                break;
            case 1:
                profileActivity.F4(profileActivity.a0, f10, f11, true);
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
                ey0.K0(profileActivity.a(), profileActivity);
                break;
            case 9:
                profileActivity.w4(false);
                break;
            case 12:
                profileActivity.getMessagesController().e7.edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, profileActivity.getParentActivity(), profileActivity.A0);
                s1Var.r(200L);
                org.telegram.messenger.hp.s1(profileActivity.currentAccount).P1().k(profileActivity.a(), new org.telegram.ui.Components.ei(i10, profileActivity, s1Var), true, profileActivity.A0);
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
                    org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(profileActivity, profileActivity.a0);
                    H.w = false;
                    H.i = 3;
                    H.c(R.drawable.msg_qrcode, org.telegram.messenger.bd.M0(2131746508, null), new g90(profileActivity, i10), false);
                    H.c(R.drawable.msg_copy, org.telegram.messenger.bd.M0(2131746686, null), new sg0(f12, 28), false);
                    H.c(R.drawable.msg_edit, org.telegram.messenger.bd.M0(2131746628, null), new g90(profileActivity, 26), false);
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
                profileActivity.presentFragment(new c31(null));
                break;
        }
    }

    public static void n0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.b0 == null) {
            if (MediaController.B().R0 != null && MediaController.B().R0.a == profileActivity.currentAccount && MediaController.B().R0.b == profileActivity.a()) {
                profileActivity.b0 = MediaController.B().R0;
            } else {
                org.telegram.messenger.bp bpVar = new org.telegram.messenger.bp(profileActivity.currentAccount, profileActivity.a());
                profileActivity.b0 = bpVar;
                TLRPC.UserFull userFull = profileActivity.v2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    ArrayList arrayList = bpVar.c;
                    arrayList.clear();
                    bpVar.b();
                    arrayList.add(0, bpVar.d(document));
                }
            }
        }
        if (profileActivity.b0.c.isEmpty()) {
            return;
        }
        if (MediaController.B().R0 == profileActivity.b0 && MediaController.B().I((org.telegram.messenger.zi) profileActivity.b0.c.get(0))) {
            z10 = true;
        } else {
            MediaController.B().o();
            z10 = false;
        }
        MediaController.B().R0 = profileActivity.b0;
        MediaController.B().S0.clear();
        MediaController.B().S0.addAll(profileActivity.b0.c);
        if (!z10) {
            MediaController.B().S((org.telegram.messenger.zi) profileActivity.b0.c.get(0));
        }
        profileActivity.showDialog(new org.telegram.ui.Components.z7(profileActivity.getParentActivity(), profileActivity.A0));
    }

    public static void o0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.ia0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new g90(profileActivity, 20), profileActivity.A0);
    }

    public static void p0(ProfileActivity profileActivity, org.telegram.ui.Cells.c2[] c2VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().o1(profileActivity.e1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().j1(profileActivity.b5);
        tL_messages_reportReaction.id = profileActivity.a5;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new ei.u5(27));
        org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
        if (c2Var != null && c2Var.b()) {
            profileActivity.getMessagesController().f0(-profileActivity.b5, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.e1)));
        }
        profileActivity.a5 = 0;
        profileActivity.D5(false, false);
        org.telegram.ui.Components.fc.a0(profileActivity).E(profileActivity.A0).j();
    }

    public static void q0(ProfileActivity profileActivity, Boolean bool) {
        long j10 = profileActivity.e1;
        if (j10 == 0) {
            long j11 = profileActivity.f1;
            j10 = j11 != 0 ? -j11 : profileActivity.i1;
        }
        long j12 = j10;
        if (bool.booleanValue()) {
            org.telegram.messenger.hp.s1(profileActivity.currentAccount).W(profileActivity.b5, j12);
        } else {
            org.telegram.messenger.hp.s1(profileActivity.currentAccount).h0(profileActivity.b5, profileActivity.a5, j12);
        }
        profileActivity.a5 = 0;
        profileActivity.D5(false, false);
        org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(profileActivity.getParentActivity(), profileActivity.A0);
        ibVar.d(R.raw.chats_infotip, new String[0]);
        ibVar.b.setText(org.telegram.messenger.bd.M0(2131746412, null));
        org.telegram.ui.Components.fc.a0(profileActivity).b(ibVar, 1500).j();
    }

    public static void r0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f10, boolean z10) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.U1 = floatValue;
        float f11 = (floatValue - 0.5f) / 0.5f;
        float f12 = (0.5f - floatValue) / 0.5f;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        float f13 = -f10;
        profileActivity.T1 = (int) ((1.0f - floatValue) * f13);
        profileActivity.b.setTranslationY(floatValue * f10);
        profileActivity.P.setTranslationY(f10 * profileActivity.U1);
        profileActivity.a.setTranslationY((1.0f - profileActivity.U1) * f13);
        profileActivity.a.setScaleX(1.0f - ((1.0f - profileActivity.U1) * 0.01f));
        profileActivity.a.setScaleY(1.0f - ((1.0f - profileActivity.U1) * 0.01f));
        profileActivity.a.setAlpha(profileActivity.U1);
        profileActivity.y4(true);
        profileActivity.a.setAlpha(f11);
        profileActivity.b.setAlpha(1.0f - profileActivity.U1);
        profileActivity.b.setScaleX((profileActivity.U1 * 0.05f) + 1.0f);
        profileActivity.b.setScaleY((profileActivity.U1 * 0.05f) + 1.0f);
        profileActivity.P.setAlpha(1.0f - f11);
        profileActivity.Y.setAlpha(f11);
        profileActivity.f0.setAlpha(f11);
        tu0 tu0Var = profileActivity.v0;
        if (tu0Var != null) {
            tu0Var.setAlpha(f11);
        }
        profileActivity.f.setAlpha(f11);
        profileActivity.r.setAlpha(profileActivity.S5 ? 0.0f : f11);
        profileActivity.U0.getSearchField().setAlpha(f12);
        if (z10 && profileActivity.U1 < 0.7f) {
            org.telegram.ui.ActionBar.f5 f5Var = profileActivity.U0;
            if (f5Var.G.getWidth() != 0 && !f5Var.e.isFocused()) {
                f5Var.e.requestFocus();
                org.telegram.messenger.g0.K3(f5Var.e);
            }
        }
        profileActivity.U0.getSearchContainer().setVisibility(profileActivity.U1 < 0.5f ? 0 : 8);
        int i3 = profileActivity.U1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.f5 f5Var2 = profileActivity.T0;
        if (f5Var2 != null) {
            f5Var2.setVisibility(i3);
            profileActivity.T0.setAlpha(f11);
        }
        profileActivity.U0.setVisibility(i3);
        profileActivity.actionBar.y(profileActivity.U1 < 0.5f);
        org.telegram.ui.ActionBar.f5 f5Var3 = profileActivity.T0;
        if (f5Var3 != null) {
            f5Var3.setAlpha(f11);
        }
        profileActivity.U0.setAlpha(f11);
        profileActivity.d1.invalidate();
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
        ai.c0 c0Var = profileActivity.Z;
        if (c0Var != null) {
            float f10 = 1.0f - actionModeFactor;
            if (c0Var.getAlpha() != f10) {
                profileActivity.Z.setAlpha(f10);
            }
        }
    }

    public static void y1(ProfileActivity profileActivity, boolean z10) {
        int i3 = z10 ? 8 : 0;
        profileActivity.a.setVisibility(i3);
        profileActivity.b.setVisibility(z10 ? 0 : 8);
        profileActivity.U0.getSearchContainer().setVisibility(z10 ? 0 : 8);
        ci.z0 z0Var = profileActivity.w0;
        if (z0Var != null) {
            z0Var.setActive(!z10);
        }
        profileActivity.actionBar.y(z10);
        profileActivity.Y.setVisibility(i3);
        tu0 tu0Var = profileActivity.v0;
        if (tu0Var != null) {
            tu0Var.setVisibility(i3);
        }
        profileActivity.f.setVisibility(i3);
        profileActivity.r.setVisibility(i3);
        org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
        if (f5Var != null) {
            f5Var.setAlpha(1.0f);
            profileActivity.T0.setVisibility(i3);
        }
        profileActivity.U0.setVisibility(i3);
        profileActivity.f0.setAlpha(1.0f);
        profileActivity.Y.setAlpha(1.0f);
        tu0 tu0Var2 = profileActivity.v0;
        if (tu0Var2 != null) {
            tu0Var2.setAlpha(1.0f);
        }
        ci.z0 z0Var2 = profileActivity.w0;
        if (z0Var2 != null) {
            z0Var2.setAlpha(1.0f);
        }
        profileActivity.f.setAlpha(1.0f);
        profileActivity.r.setAlpha(profileActivity.S5 ? 0.0f : 1.0f);
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

    public final void A5() {
        if (this.simpleActionBar == null || this.H5 == null) {
            return;
        }
        org.telegram.ui.Components.kf0 kf0Var = this.J5;
        if (kf0Var != null) {
            float l42 = l4();
            if (kf0Var.l != l42) {
                kf0Var.l = l42;
                kf0Var.a();
            }
        }
        int f10 = i0.a.f(l4(), this.D5, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.A0));
        if (this.G5 != f10) {
            this.G5 = f10;
            org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
            y4Var.m0 = true;
            y4Var.g0 = f10;
            y4Var.updateColors();
        }
        int w02 = this.I5.w0();
        if (this.L5 != w02) {
            this.L5 = w02;
            org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
            gh.g gVar = y4Var2.I;
            if (gVar != null) {
                gVar.updateColors();
                y4Var2.J.updateColors();
                y4Var2.K.updateColors();
            }
            y4Var2.invalidate();
            org.telegram.ui.ActionBar.i5 i5Var = y4Var2.R;
            if (i5Var != null) {
                i5Var.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.de0
    public final si.f B() {
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (pi.q.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    public final void B4(boolean z10) {
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
        if (a22 == null) {
            return;
        }
        if (this.r2 && !org.telegram.messenger.hp.F2(a22)) {
            if (!this.k1 || z10) {
                org.telegram.ui.Components.t4.r(this, false, this.E2, a22, this.D2 != null, true, false, true, new nt0(this, a22));
                return;
            } else {
                getMessagesController().f5(new g90(this, 6), this.e1);
                finishFragment();
                return;
            }
        }
        if (this.k1) {
            getMessagesController().f5(null, this.e1);
            if (org.telegram.ui.Components.fc.a(this)) {
                org.telegram.ui.Components.fc.d(this, false).j();
                return;
            }
            return;
        }
        if (this.l1) {
            org.telegram.ui.Components.t4.i0(this, this.e1, a22, null, this.D2, false, null, new ma(this, 3), this.A0);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.A0);
        String M0 = org.telegram.messenger.bd.M0(2131753692, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name)));
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131753693, null), new jt0(this, 2));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, this.A0);
        }
    }

    public final void B5(boolean z10) {
        if (this.T0 == null) {
            return;
        }
        boolean z11 = this.S5;
        boolean z12 = !z11;
        boolean z13 = this.p2;
        boolean z14 = false;
        d5(this.Q0, (z11 || z13 || !this.M0) ? false : true, z10);
        d5(this.R0, (z11 || z13 || !this.N0) ? false : true, z10);
        d5(this.S0, (z11 || z13 || !this.O0) ? false : true, z10);
        mv0 mv0Var = this.O;
        boolean z15 = (mv0Var == null || mv0Var.J == null || !mv0Var.v0(mv0Var.getClosestTab())) ? false : true;
        d5(this.T0, z12, z10 && !z15);
        mv0 mv0Var2 = this.O;
        if (mv0Var2 != null) {
            boolean z16 = this.S5;
            if (z10 && !z15) {
                z14 = true;
            }
            if (mv0Var2.q2 != z16) {
                mv0Var2.q2 = z16;
                mv0Var2.R(z10, z14);
            }
        }
    }

    public final void C4(boolean z10) {
        boolean z11 = false;
        if (this.e1 != 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
            if (a22 != null) {
                TLRPC.UserFull userFull = this.v2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.n1.m(a22, z10, z11, getParentActivity(), this.v2, getAccountInstance());
                return;
            }
            return;
        }
        if (this.f1 != 0) {
            if (getMessagesController().g1(this.f1, false, null) != null) {
                org.telegram.ui.Components.voip.n1.l(this.E2, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            TLRPC.Chat chat = this.E2;
            org.telegram.messenger.c accountInstance = getAccountInstance();
            if (getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.o60.J0(getParentActivity(), -chat.id, accountInstance, new org.telegram.ui.Components.hr(chat, this, accountInstance, 6));
        }
    }

    public final void C5() {
        TLRPC.User a22;
        if (!this.s1 || this.X0 == null || this.W0 == null || (a22 = getMessagesController().a2(Long.valueOf(this.e1))) == null) {
            return;
        }
        boolean z10 = org.telegram.messenger.l10.n(a22) != null;
        this.X0.setIcon(z10 ? R.drawable.menu_username_change : R.drawable.menu_username_set);
        this.X0.setText(org.telegram.messenger.bd.M0(z10 ? 2131746628 : 2131746627, null));
        this.W0.setVisibility(org.telegram.messenger.l10.n(a22) == null ? 8 : 0);
    }

    public final void D4() {
        TLRPC.UserFull userFull = this.v2;
        if (userFull == null || !org.telegram.messenger.l10.b(userFull)) {
            if (this.E2 != null) {
                org.telegram.ui.Components.v20.h.a();
            }
            showDialog(new ai.b3(getParentActivity(), this.currentAccount, a(), null, null));
        } else {
            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
            if (T != null) {
                org.telegram.messenger.camera.q.s(org.telegram.messenger.bd.a0(null, null, 2131743752, org.telegram.messenger.m5.t(a())), org.telegram.ui.Components.fc.a0(T), R.raw.error, 36);
            }
        }
    }

    public final void D5(boolean z10, boolean z11) {
        if (this.d == null) {
            if (z10) {
                G5(false);
            }
            J5();
            return;
        }
        if (!z11 && this.a.isInLayout()) {
            hu0 hu0Var = this.a;
            if (hu0Var.H) {
                hu0Var.post(new org.telegram.ui.Components.up0(11, this, z10));
                return;
            }
            return;
        }
        ov0 ov0Var = new ov0(this);
        ov0Var.b = this.N2;
        ov0Var.f(ov0Var.c);
        ov0Var.e.clear();
        ov0Var.f.clear();
        ov0Var.e.addAll(this.R4);
        ov0Var.f.addAll(this.S4);
        ov0Var.g = this.u4;
        ov0Var.h = this.v4;
        if (z10) {
            G5(false);
        }
        T4();
        J5();
        ov0Var.f(ov0Var.d);
        try {
            u4.o.c(ov0Var, true).c(this.d);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.d.f();
        }
        int i3 = this.l6;
        if (i3 >= 0) {
            this.c.h1(i3, this.m6 - this.a.getPaddingTop());
        }
        org.telegram.messenger.g0.b4(this.a);
    }

    public final void E4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().m(this.E2.id, getUserConfig().f(), 0, null, this, true, new a60(this, z10, zArr, 8), new ga.b(this, zArr, z10, this.parentLayout.getLastFragment(), 6), null);
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.I4, new Object[0]);
    }

    public final void E5() {
        if (this.c0 == null || this.r == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        boolean z10 = this.G1;
        if (z10 && this.J1 == 2 && this.Y != null) {
            this.c0.setAlpha(this.S1);
            this.c0.f(org.telegram.messenger.g0.L(74.0f) + this.a.getMeasuredWidth(), e4() - org.telegram.messenger.g0.L(74.0f));
            return;
        }
        if (z10) {
            this.c0.setAlpha(this.S1);
        }
        float f10 = currentActionBarHeight;
        float L = this.Q1 + f10 + org.telegram.messenger.g0.L(74.0f);
        float min = Math.min(e4(), L - f10);
        this.c0.f(L - min, min - org.telegram.messenger.g0.L(74.0f));
    }

    public final void F4(View view, float f10, float f11, boolean z10) {
        float f12;
        float f13;
        long j10;
        long j11 = this.i1;
        if (j11 == 0) {
            j11 = this.e1;
            if (j11 == 0) {
                j11 = -this.f1;
            }
        }
        long j12 = j11;
        boolean r22 = getMessagesController().r2(j12, this.g1, null);
        if (z10 && (this.q1 || r22)) {
            boolean z11 = !r22;
            getNotificationsController().G(j12, this.g1, z11);
            org.telegram.ui.Components.fc.A(this, z11, null).j();
            v5();
            this.a0.setNotifications(r22);
            return;
        }
        if ((z10 || !org.telegram.messenger.bd.a0 || f10 > org.telegram.messenger.g0.L(76.0f)) && (org.telegram.messenger.bd.a0 || f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
            org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(getParentActivity(), this.currentAccount, null, true, new b8.ig(this, j12, 6), this.A0);
            xnVar.e(j12, this.g1, this.i5);
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
            xnVar.d(this, view, f12, f13, z10);
            return;
        }
        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
        boolean z12 = h5Var.e.h;
        boolean z13 = !z12;
        boolean D = getNotificationsController().D(j12, null, false, false);
        String v = org.telegram.messenger.us.v(j12, this.g1, false);
        if (z12) {
            SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(this.currentAccount).d7.edit();
            if (D) {
                edit.putInt("notify2_" + v, 2);
                j10 = 1;
            } else {
                edit.remove("notify2_" + v);
                j10 = 0L;
            }
            getNotificationsController().N(j12);
            if (this.g1 == 0) {
                getMessagesStorage().E1(j12, j10);
                TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j12);
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
            SharedPreferences.Editor edit2 = org.telegram.messenger.hp.s1(this.currentAccount).d7.edit();
            if (D) {
                edit2.remove("notify2_" + v);
            } else {
                edit2.putInt("notify2_" + v, 0);
            }
            if (this.g1 == 0) {
                getMessagesStorage().E1(j12, 0L);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().R.f(j12);
                if (dialog2 != null) {
                    dialog2.notify_settings = new TLRPC.TL_peerNotifySettings();
                }
            }
            edit2.apply();
        }
        v5();
        getNotificationsController().c0(j12, this.g1, true);
        h5Var.setChecked(z13);
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
    public final void F5(boolean z10) {
        int i3;
        bw0 bw0Var;
        if (z10 && (i3 = this.N3) >= 0 && (bw0Var = this.d) != null) {
            bw0Var.g(i3);
        }
        org.telegram.ui.Components.gf0 gf0Var = this.a0;
        if (gf0Var == null || this.s1) {
            return;
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(this.currentAccount).d7;
        long j10 = this.i1;
        if (j10 == 0) {
            j10 = this.e1;
            if (j10 == 0) {
                j10 = -this.f1;
            }
        }
        long j11 = j10;
        boolean z11 = false;
        String v = org.telegram.messenger.us.v(j11, this.g1, false);
        boolean contains = sharedPreferences.contains("notify2_" + v);
        int c2 = org.telegram.messenger.k5.c("notify2_", v, sharedPreferences, 0);
        int c10 = org.telegram.messenger.k5.c("notifyuntil_", v, sharedPreferences, 0);
        if (c2 != 3 || c10 == Integer.MAX_VALUE) {
            if (c2 == 0) {
                if (!contains) {
                    z11 = getNotificationsController().D(j11, null, false, false);
                    gf0Var.setNotifications(z11);
                }
                z11 = true;
                gf0Var.setNotifications(z11);
            }
        }
    }

    @Override // org.telegram.ui.nw
    public final /* synthetic */ boolean G() {
        return false;
    }

    public final void G4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.e1 != 0) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
                if (a22 == null) {
                    return;
                }
                if (this.F2 == null || (userFull = this.v2) == null || TextUtils.isEmpty(userFull.about)) {
                    str = String.format("https://" + getMessagesController().V2 + "/%s", org.telegram.messenger.l10.n(a22));
                } else {
                    str = String.format("%s https://" + getMessagesController().V2 + "/%s", this.v2.about, org.telegram.messenger.l10.n(a22));
                }
            } else if (this.f1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                if (M0 == null) {
                    return;
                }
                TLRPC.ChatFull chatFull = this.u2;
                if (chatFull == null || TextUtils.isEmpty(chatFull.about)) {
                    str = String.format("https://" + getMessagesController().V2 + "/%s", org.telegram.messenger.t3.K(M0, false));
                } else {
                    str = String.format("%s\nhttps://" + getMessagesController().V2 + "/%s", this.u2.about, org.telegram.messenger.t3.K(M0, false));
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
            startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131752982, null)), 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void G5(boolean z10) {
        int i3;
        TLRPC.UserStatus userStatus;
        boolean z11;
        int i10 = 0;
        this.B2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.C2.clear();
        TLRPC.ChatFull chatFull = this.u2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z11 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z11 || chatFull.participants_count <= 200) {
                return;
            }
            this.B2 = chatFull.online_count;
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i10 < this.u2.participants.participants.size()) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.u2.participants.participants.get(i10).user_id));
            if (a22 != null && (userStatus = a22.status) != null && ((userStatus.expires > currentTime || a22.id == getUserConfig().e()) && a22.status.expires > 10000)) {
                this.B2++;
            }
            this.C2.add(Integer.valueOf(i10));
            if (a22 != null) {
                if (a22.bot) {
                    i3 = -110;
                } else if (a22.self) {
                    i3 = 50000 + currentTime;
                } else {
                    TLRPC.UserStatus userStatus2 = a22.status;
                    if (userStatus2 != null) {
                        i3 = userStatus2.expires;
                    }
                }
                i10 = com.google.android.recaptcha.internal.a.f(i3, i10, 1, arrayList);
            }
            i3 = TLObject.FLAG_31;
            i10 = com.google.android.recaptcha.internal.a.f(i3, i10, 1, arrayList);
        }
        try {
            Collections.sort(this.C2, Comparator$-EL.reversed(Comparator$-CC.comparingInt(new oe(arrayList, 1))));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (z10 && this.d != null && this.u4 > 0) {
            org.telegram.messenger.g0.b4(this.a);
        }
        if (this.O == null || this.K4 == -1) {
            return;
        }
        if ((this.C2.size() > 5 || this.T4 == 2) && this.T4 != 1) {
            this.O.k1(this.C2, this.u2);
        }
    }

    @Override // org.telegram.ui.Components.e30
    public final void H(float f10) {
        org.telegram.ui.Cells.b4 b4Var = this.h0;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(f10);
        this.o0.O(this.K2, f10);
    }

    public final void H3() {
        org.telegram.ui.ActionBar.k kVar;
        if (this.O == null || (kVar = this.actionBar) == null) {
            return;
        }
        int i3 = kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i3;
        int[] iArr = org.telegram.ui.Components.ws0.t2;
        int z10 = org.telegram.messenger.k5.z(6.666f, pi.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()), currentActionBarHeight);
        int c2 = pi.a.c(i3) + currentActionBarHeight + z10;
        this.V5 = c2;
        this.O.l1(z10, c2, pi.a.c(this.J6), this.J6 + this.H6);
        this.W5 = org.telegram.messenger.g0.L(44.0f) + currentActionBarHeight;
        y5();
        P3();
    }

    public final void H4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.L3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f1);
            bundle.putLong("user_id", this.e1);
            presentFragment(new bi.j0(bundle));
            return;
        }
        if (view2.getTag() == null || ((Integer) view2.getTag()).intValue() != this.U2) {
            return;
        }
        if (this.e1 == getUserConfig().e()) {
            presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
        } else if (org.telegram.messenger.l10.b(this.v2)) {
            org.telegram.messenger.camera.q.s(org.telegram.messenger.bd.a0(null, null, 2131743752, org.telegram.messenger.m5.t(this.e1)), org.telegram.ui.Components.fc.a0(this), R.raw.error, 36);
        } else {
            showDialog(new ai.b3(getParentActivity(), this.currentAccount, this.e1, null, null));
        }
    }

    public final void H5() {
        CharSequence charSequence;
        su0 su0Var = this.r;
        if (su0Var == null) {
            return;
        }
        if ((!this.S5 || (charSequence = this.X5) == null) && (!this.u6 || (charSequence = this.t6) == null)) {
            charSequence = this.s6;
        }
        if (!su0Var.o(charSequence, !this.G1) || this.fragmentView == null) {
            return;
        }
        y4(false);
    }

    @Override // org.telegram.ui.Components.lr0
    public final void I() {
        U4(false);
    }

    public final int I3(int i3, Boolean bool) {
        if (this.h6 == null) {
            return i3;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.A0);
        int f10 = i0.a.f(0.5f, this.h6.m(org.telegram.ui.ActionBar.k6.I.q()), this.h6.n(org.telegram.ui.ActionBar.k6.I.q()));
        if (org.telegram.ui.ActionBar.k6.e1(w02)) {
            return org.telegram.ui.ActionBar.k6.D(org.telegram.ui.ActionBar.k6.I.q(), w02, f10, i3, (bool == null || bool.booleanValue()) ? f10 : org.telegram.ui.ActionBar.k6.r1(0.7f, f10));
        }
        return (bool == null || bool.booleanValue()) ? f10 : org.telegram.ui.ActionBar.k6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.k6.r1(0.7f, f10));
    }

    public final void I4() {
        org.telegram.ui.Components.ch0 ch0Var;
        if (this.e1 == 0) {
            M4();
            return;
        }
        if (this.r0 == null) {
            L4();
            return;
        }
        TLRPC.User a22 = org.telegram.messenger.hp.s1(this.currentAccount).a2(Long.valueOf(org.telegram.messenger.h10.i(this.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.h10.i(this.currentAccount).f();
        }
        if (a22 == null) {
            return;
        }
        org.telegram.ui.Components.f30 f30Var = this.r0;
        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
        f30Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new g90(this, 27), new s5(this, 13), 0);
        this.V.M(0);
        this.V.P(43);
        this.W.M(0);
        this.W.P(43);
        org.telegram.ui.Components.gf0 gf0Var = this.a0;
        if (gf0Var != null) {
            org.telegram.ui.Components.df0 i3 = org.telegram.ui.Components.gf0.i(14, gf0Var.a);
            if (i3 != null && (ch0Var = i3.k) != null) {
                ch0Var.start();
            }
        } else {
            this.s.d();
        }
        org.telegram.ui.Cells.l8 l8Var = this.M2;
        if (l8Var != null) {
            l8Var.getImageView().d();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(73:32|(1:287)(1:36)|(1:38)(1:286)|39|(3:41|(1:43)(1:45)|44)|46|(1:48)|49|(1:51)|52|(1:54)|55|(1:57)(1:285)|58|(4:60|(1:283)(1:64)|65|(58:67|68|(1:70)|71|(1:(1:74)(50:(1:280)(1:78)|79|(1:83)|(1:276)(1:89)|90|(2:92|(2:94|(1:96))(2:216|(1:223)(1:222)))(2:224|(1:226)(2:227|(1:275)(2:233|(1:235)(2:236|(2:238|(1:240)(1:241))(40:242|(1:244)(1:274)|245|(1:273)(1:259)|260|(2:262|(4:264|(1:272)(1:268)|269|(1:271)))|98|(1:215)(1:102)|103|104|105|(1:107)|108|(1:110)|111|(3:113|(1:115)|116)(1:212)|117|(1:119)(1:211)|120|(3:122|(1:124)|125)(1:210)|126|(3:206|(1:208)|209)(2:130|(1:132)(1:205))|133|(2:201|(1:203)(1:204))(1:137)|(1:200)(1:143)|144|(1:199)|147|(2:149|(1:151))|152|(2:154|(1:156))|157|(3:159|(2:161|(1:187)(1:167))(1:188)|168)(4:189|(1:198)(1:195)|196|197)|169|(1:171)|172|(1:186)(1:178)|179|(1:181)|182)))))|97|98|(1:100)|215|103|104|105|(0)|108|(0)|111|(0)(0)|117|(0)(0)|120|(0)(0)|126|(1:128)|206|(0)|209|133|(1:135)|201|(0)(0)|(1:139)|200|144|(0)|199|147|(0)|152|(0)|157|(0)(0)|169|(0)|172|(2:174|176)|186|179|(0)|182))|281|79|(50:81|83|(2:85|87)|276|90|(0)(0)|97|98|(0)|215|103|104|105|(0)|108|(0)|111|(0)(0)|117|(0)(0)|120|(0)(0)|126|(0)|206|(0)|209|133|(0)|201|(0)(0)|(0)|200|144|(0)|199|147|(0)|152|(0)|157|(0)(0)|169|(0)|172|(0)|186|179|(0)|182)|278|83|(0)|276|90|(0)(0)|97|98|(0)|215|103|104|105|(0)|108|(0)|111|(0)(0)|117|(0)(0)|120|(0)(0)|126|(0)|206|(0)|209|133|(0)|201|(0)(0)|(0)|200|144|(0)|199|147|(0)|152|(0)|157|(0)(0)|169|(0)|172|(0)|186|179|(0)|182))(1:284)|282|68|(0)|71|(0)|281|79|(0)|278|83|(0)|276|90|(0)(0)|97|98|(0)|215|103|104|105|(0)|108|(0)|111|(0)(0)|117|(0)(0)|120|(0)(0)|126|(0)|206|(0)|209|133|(0)|201|(0)(0)|(0)|200|144|(0)|199|147|(0)|152|(0)|157|(0)(0)|169|(0)|172|(0)|186|179|(0)|182) */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x064f, code lost:
    
        if (r32.u2.can_view_participants != false) goto L336;
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
    public final void I5(boolean z10) {
        Object obj;
        boolean z11;
        CharSequence G;
        TLRPC.ChatParticipants chatParticipants;
        boolean z12;
        CharSequence charSequence;
        boolean l10;
        boolean z13;
        org.telegram.messenger.ac m10;
        org.telegram.messenger.ac m11;
        org.telegram.messenger.ac acVar;
        org.telegram.messenger.ac acVar2;
        org.telegram.messenger.ac acVar3;
        View m12;
        TLRPC.Chat chat;
        org.telegram.messenger.ac acVar4;
        int i3;
        TLRPC.VideoSize videoSize;
        org.telegram.ui.Components.x41 x41Var;
        org.telegram.messenger.ac acVar5;
        TLRPC.User user;
        org.telegram.messenger.ac acVar6;
        TLRPC.User user2;
        TLRPC.UserStatus userStatus;
        String str;
        boolean z14;
        org.telegram.ui.ActionBar.y4 y4Var;
        mw0 mw0Var;
        Drawable drawable;
        boolean z15;
        boolean z16;
        boolean z17;
        String str2;
        org.telegram.ui.Components.ig igVar;
        String str3;
        String str4;
        TL_stars.Tl_starsRating tl_starsRating;
        String str5;
        TL_stars.Tl_starsRating tl_starsRating2;
        org.telegram.messenger.ac acVar7;
        pv pvVar;
        if (this.Y == null || this.f == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var == null || q4Var.getFragmentStack().size() < 2) {
            obj = null;
        } else {
            org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            obj = d2Var instanceof org.telegram.ui.Components.ig ? d2Var : null;
            if ((d2Var instanceof uw) && (pvVar = ((uw) d2Var).G3) != null) {
                wv wvVar = pvVar.a;
                if (com.google.android.recaptcha.internal.a.u(wvVar)) {
                    obj = wvVar;
                }
            }
        }
        if (obj instanceof wm) {
            wm wmVar = (wm) obj;
            if (wmVar.p1 != null && wmVar.g4 == 8) {
                z11 = true;
                this.q5 = false;
                this.r5 = false;
                String str6 = "";
                if (this.e1 == 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
                    if (a22 == null) {
                        return;
                    }
                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                    boolean z18 = userProfilePhoto != null && userProfilePhoto.personal;
                    TLRPC.FileLocation fileLocation = userProfilePhoto != null ? userProfilePhoto.photo_big : null;
                    this.q0.r(a22);
                    org.telegram.messenger.wo woVar = this.h6;
                    org.telegram.messenger.wo a10 = org.telegram.messenger.wo.a(a22.emoji_status);
                    this.h6 = a10;
                    if (a10 == null) {
                        int l11 = org.telegram.messenger.l10.l(a22);
                        org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(this.currentAccount).r4;
                        this.h6 = xoVar == null ? null : xoVar.d(l11);
                    }
                    if (woVar != this.h6) {
                        P5();
                    }
                    ow0 ow0Var = this.d1;
                    if (ow0Var != null) {
                        ow0Var.b(org.telegram.messenger.l10.m(a22), a22.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    org.telegram.ui.Components.ku0 ku0Var = this.T;
                    if (ku0Var != null) {
                        ku0Var.b.a(this.h6);
                        ku0Var.invalidate();
                    }
                    TLRPC.EmojiStatus emojiStatus = a22.emoji_status;
                    b5(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null);
                    org.telegram.messenger.ac m13 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.t0, 0, a22);
                    org.telegram.messenger.ac m14 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.t0, 1, a22);
                    org.telegram.messenger.ac m15 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.t0, 4, a22);
                    TLRPC.UserFull userFull = this.v2;
                    if (userFull != null) {
                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                        videoSize = org.telegram.messenger.w7.S((userProfilePhoto2 == null || !userProfilePhoto2.personal) ? userFull.profile_photo : userFull.personal_photo);
                        if (videoSize != null) {
                            x41Var = new org.telegram.ui.Components.x41(videoSize, a22.premium, 2);
                            org.telegram.messenger.ac C = this.o0.C(m14, m13);
                            if (this.I2 == null) {
                                this.o0.H(x41Var, m13, m14, z10);
                            }
                            if (this.J2 == null) {
                                if (videoSize != null) {
                                    this.f0.setImageDrawable(x41Var);
                                } else {
                                    if (m15 == null || a22.photo.personal) {
                                        user = a22;
                                        acVar6 = m14;
                                        qu0 qu0Var = this.f0;
                                        qu0Var.a.u0(C, "g", m13, "100_100", acVar6, "50_50", this.q0, 0L, null, user, 1);
                                        acVar5 = m13;
                                        qu0Var.d();
                                    } else {
                                        this.f0.getImageReceiver().z1 = true;
                                        qu0 qu0Var2 = this.f0;
                                        user = a22;
                                        acVar6 = m14;
                                        qu0Var2.a.u0(m15, "avatar", m13, "50_50", acVar6, "50_50", this.q0, 0L, null, user, 1);
                                        qu0Var2.d();
                                        acVar5 = m13;
                                    }
                                    if ((acVar6 != null && this.O2 != -1) || (acVar6 == null && this.O2 == -1)) {
                                        D5(false, false);
                                        y4(true);
                                    }
                                    if (acVar5 != null || ((acVar7 = this.C0) != null && acVar5.s == acVar7.s)) {
                                        user2 = user;
                                    } else {
                                        this.C0 = acVar5;
                                        TLRPC.User user3 = user;
                                        getFileLoader().W(acVar5, user3, null, 0, 1);
                                        user2 = user3;
                                    }
                                    CharSequence p10 = org.telegram.messenger.l10.p(user2);
                                    if (user2.id == getUserConfig().e()) {
                                        long j10 = user2.id;
                                        if (j10 == 489000) {
                                            str5 = org.telegram.messenger.bd.M0(2131743626, null);
                                        } else if (j10 == 333000 || j10 == 777000 || j10 == 42777) {
                                            str5 = org.telegram.messenger.bd.M0(2131745571, null);
                                        } else if (org.telegram.messenger.hp.F2(user2)) {
                                            str5 = org.telegram.messenger.bd.M0(2131744335, null);
                                        } else if (this.r2) {
                                            int i10 = user2.bot_active_users;
                                            str5 = i10 != 0 ? org.telegram.messenger.bd.H(',', "BotUsers", i10) : org.telegram.messenger.l10.d(user2);
                                        } else {
                                            boolean[] zArr = this.K0;
                                            zArr[0] = false;
                                            String d02 = org.telegram.messenger.bd.d0(this.currentAccount, user2, zArr, z18 ? new boolean[1] : null);
                                            boolean z19 = (zArr[0] || getUserConfig().q() || (userStatus = user2.status) == null || (!(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) || !userStatus.by_me) ? false : true;
                                            su0 su0Var = this.r;
                                            z14 = z19;
                                            str = d02;
                                            if (su0Var != null) {
                                                z14 = z19;
                                                str = d02;
                                                if (!this.S5) {
                                                    int i11 = (zArr[0] && this.h6 == null) ? org.telegram.ui.ActionBar.k6.pi : org.telegram.ui.ActionBar.k6.B8;
                                                    su0Var.setTag(Integer.valueOf(i11));
                                                    z14 = z19;
                                                    str = d02;
                                                    if (!this.p2) {
                                                        this.r.setTextColor(I3(org.telegram.ui.ActionBar.k6.w0(i11, this.A0), Boolean.valueOf(zArr[0])));
                                                        z14 = z19;
                                                        str = d02;
                                                    }
                                                }
                                            }
                                            TLRPC.UserProfilePhoto userProfilePhoto3 = user2.photo;
                                            this.r5 = userProfilePhoto3 == null && userProfilePhoto3.personal;
                                            p10 = org.telegram.messenger.i6.m(p10, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                            if (z11) {
                                                this.f0.setAnimateFromImageReceiver(((wm) obj).p1.getAvatarImageView().getImageReceiver());
                                            }
                                            this.f.l(p10, false);
                                            y4Var = this.simpleActionBar;
                                            if (y4Var != null) {
                                                y4Var.setTitle(p10);
                                            }
                                            this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                                            this.r.setRightDrawableInside(true);
                                            su0 su0Var2 = this.r;
                                            if (z14) {
                                                if (this.z6 == null) {
                                                    mw0 mw0Var2 = new mw0(org.telegram.messenger.bd.M0(2131744900, null));
                                                    this.z6 = mw0Var2;
                                                    mw0Var2.setAlpha((int) (Math.min(1.0f, this.Q1 / j4()) * 255.0f));
                                                    this.z6.a(i0.a.f(this.k2, org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.b(0.18f, -0.1f, this.c1)), 603979775));
                                                }
                                                mw0Var = this.z6;
                                            } else {
                                                mw0Var = null;
                                            }
                                            su0Var2.i(mw0Var);
                                            this.r.setRightDrawableOnClick(z14 ? new pt0(this, 7) : null);
                                            if (this.D2 != null) {
                                                if (this.x == null) {
                                                    this.x = org.telegram.ui.ActionBar.k6.l4.getConstantState().newDrawable().mutate();
                                                }
                                                drawable = this.x;
                                            } else {
                                                drawable = null;
                                            }
                                            this.f.setRightDrawableOutside(false);
                                            z15 = user2.scam;
                                            if (!z15 || user2.fake) {
                                                kk kkVar = this.f;
                                                int i12 = !z15 ? 1 : 0;
                                                if (this.L == null) {
                                                    org.telegram.ui.Components.kk0 kk0Var = new org.telegram.ui.Components.kk0(i12);
                                                    this.L = kk0Var;
                                                    kk0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, this.A0));
                                                }
                                                kkVar.j(this.L);
                                                this.n = org.telegram.messenger.bd.M0(2131745872, null);
                                            } else if (user2.verified) {
                                                this.f.j(r4());
                                                this.n = org.telegram.messenger.bd.M0(2131754739, null);
                                            } else {
                                                this.f.j(null);
                                                this.n = null;
                                            }
                                            if (!org.telegram.messenger.hp.F2(user2) || org.telegram.messenger.m5.f(user2.emoji_status) == 0) {
                                                getMessagesController().getClass();
                                                if (org.telegram.messenger.hp.B2(user2)) {
                                                    this.f.i(i4(null, true));
                                                    this.h = org.telegram.messenger.bd.M0(2131754802, null);
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
                                                this.h = org.telegram.messenger.bd.M0(2131754802, null);
                                                z17 = true;
                                                z16 = false;
                                            }
                                            if (drawable == null || this.D2 != null || user2.bot_verification_icon == 0) {
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
                                                if (org.telegram.messenger.hp.B2(user2)) {
                                                    this.f.setRightDrawableOnClick(new pt0(this, 8));
                                                }
                                            }
                                            if (!user2.self) {
                                                getMessagesController().getClass();
                                                if (org.telegram.messenger.hp.B2(user2)) {
                                                    kk kkVar2 = this.f;
                                                    kkVar2.setRightDrawableOnClick(new a0(this, user2, kkVar2, 14));
                                                }
                                            }
                                            if (this.e1 == org.telegram.messenger.h10.i(this.currentAccount).n) {
                                                if (this.q5) {
                                                    TLRPC.UserFull userFull2 = this.v2;
                                                    if (userFull2 == null || (tl_starsRating = userFull2.stars_rating) == null || tl_starsRating.stars >= 0) {
                                                        str3 = null;
                                                        str4 = org.telegram.messenger.bd.M0(2131747834, null);
                                                    } else {
                                                        str3 = null;
                                                        str4 = org.telegram.messenger.bd.M0(2131745183, null).toLowerCase(Locale.ROOT);
                                                    }
                                                } else {
                                                    str3 = null;
                                                    str4 = str;
                                                }
                                                this.t6 = org.telegram.messenger.bd.M0(2131750843, str3);
                                                str2 = str4;
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                                                spannableStringBuilder.append((CharSequence) " d ");
                                                TLRPC.UserProfilePhoto userProfilePhoto4 = user2.photo;
                                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0((userProfilePhoto4 != null && userProfilePhoto4.personal && userProfilePhoto4.has_video) ? 2131751688 : 2131751689, null));
                                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.fs(), str.length() + 1, str.length() + 2, 0);
                                                this.t6 = spannableStringBuilder;
                                                str2 = str;
                                            }
                                            this.s6 = str2;
                                            H5();
                                            igVar = this.h5;
                                            if (igVar != null) {
                                                igVar.s();
                                            }
                                            this.f0.getImageReceiver().O0(PhotoViewer.S1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                                        }
                                    } else if (org.telegram.messenger.l10.q(this.v2)) {
                                        this.q5 = true;
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(this.v2.fallback_photo.sizes, 1000, false, null, false);
                                        str5 = str6;
                                        if (w10 != null) {
                                            this.s5.p0(org.telegram.messenger.ac.i(w10, this.v2.fallback_photo), "50_50", null, 0L, null, org.telegram.messenger.h10.i(this.currentAccount).f(), 0);
                                            str5 = str6;
                                        }
                                    } else {
                                        TLRPC.UserFull userFull3 = this.v2;
                                        str5 = (userFull3 == null || (tl_starsRating2 = userFull3.stars_rating) == null || tl_starsRating2.stars >= 0) ? org.telegram.messenger.bd.M0(2131747834, null) : org.telegram.messenger.bd.M0(2131745183, null).toLowerCase(Locale.ROOT);
                                    }
                                    z14 = false;
                                    str = str5;
                                    TLRPC.UserProfilePhoto userProfilePhoto32 = user2.photo;
                                    this.r5 = userProfilePhoto32 == null && userProfilePhoto32.personal;
                                    p10 = org.telegram.messenger.i6.m(p10, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                    if (z11) {
                                    }
                                    this.f.l(p10, false);
                                    y4Var = this.simpleActionBar;
                                    if (y4Var != null) {
                                    }
                                    this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                                    this.r.setRightDrawableInside(true);
                                    su0 su0Var22 = this.r;
                                    if (z14) {
                                    }
                                    su0Var22.i(mw0Var);
                                    this.r.setRightDrawableOnClick(z14 ? new pt0(this, 7) : null);
                                    if (this.D2 != null) {
                                    }
                                    this.f.setRightDrawableOutside(false);
                                    z15 = user2.scam;
                                    if (z15) {
                                    }
                                    kk kkVar3 = this.f;
                                    int i122 = !z15 ? 1 : 0;
                                    if (this.L == null) {
                                    }
                                    kkVar3.j(this.L);
                                    this.n = org.telegram.messenger.bd.M0(2131745872, null);
                                    if (org.telegram.messenger.hp.F2(user2)) {
                                    }
                                    getMessagesController().getClass();
                                    if (org.telegram.messenger.hp.B2(user2)) {
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
                                    if (this.e1 == org.telegram.messenger.h10.i(this.currentAccount).n) {
                                    }
                                    this.s6 = str2;
                                    H5();
                                    igVar = this.h5;
                                    if (igVar != null) {
                                    }
                                    this.f0.getImageReceiver().O0(PhotoViewer.S1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                                }
                            }
                            acVar5 = m13;
                            user = a22;
                            acVar6 = m14;
                            if (acVar6 != null) {
                                D5(false, false);
                                y4(true);
                                if (acVar5 != null) {
                                }
                                user2 = user;
                                CharSequence p102 = org.telegram.messenger.l10.p(user2);
                                if (user2.id == getUserConfig().e()) {
                                }
                                z14 = false;
                                str = str5;
                                TLRPC.UserProfilePhoto userProfilePhoto322 = user2.photo;
                                this.r5 = userProfilePhoto322 == null && userProfilePhoto322.personal;
                                p102 = org.telegram.messenger.i6.m(p102, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                                if (z11) {
                                }
                                this.f.l(p102, false);
                                y4Var = this.simpleActionBar;
                                if (y4Var != null) {
                                }
                                this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                                this.r.setRightDrawableInside(true);
                                su0 su0Var222 = this.r;
                                if (z14) {
                                }
                                su0Var222.i(mw0Var);
                                this.r.setRightDrawableOnClick(z14 ? new pt0(this, 7) : null);
                                if (this.D2 != null) {
                                }
                                this.f.setRightDrawableOutside(false);
                                z15 = user2.scam;
                                if (z15) {
                                }
                                kk kkVar32 = this.f;
                                int i1222 = !z15 ? 1 : 0;
                                if (this.L == null) {
                                }
                                kkVar32.j(this.L);
                                this.n = org.telegram.messenger.bd.M0(2131745872, null);
                                if (org.telegram.messenger.hp.F2(user2)) {
                                }
                                getMessagesController().getClass();
                                if (org.telegram.messenger.hp.B2(user2)) {
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
                                if (this.e1 == org.telegram.messenger.h10.i(this.currentAccount).n) {
                                }
                                this.s6 = str2;
                                H5();
                                igVar = this.h5;
                                if (igVar != null) {
                                }
                                this.f0.getImageReceiver().O0(PhotoViewer.S1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                            }
                            D5(false, false);
                            y4(true);
                            if (acVar5 != null) {
                            }
                            user2 = user;
                            CharSequence p1022 = org.telegram.messenger.l10.p(user2);
                            if (user2.id == getUserConfig().e()) {
                            }
                            z14 = false;
                            str = str5;
                            TLRPC.UserProfilePhoto userProfilePhoto3222 = user2.photo;
                            this.r5 = userProfilePhoto3222 == null && userProfilePhoto3222.personal;
                            p1022 = org.telegram.messenger.i6.m(p1022, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                            if (z11) {
                            }
                            this.f.l(p1022, false);
                            y4Var = this.simpleActionBar;
                            if (y4Var != null) {
                            }
                            this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                            this.r.setRightDrawableInside(true);
                            su0 su0Var2222 = this.r;
                            if (z14) {
                            }
                            su0Var2222.i(mw0Var);
                            this.r.setRightDrawableOnClick(z14 ? new pt0(this, 7) : null);
                            if (this.D2 != null) {
                            }
                            this.f.setRightDrawableOutside(false);
                            z15 = user2.scam;
                            if (z15) {
                            }
                            kk kkVar322 = this.f;
                            int i12222 = !z15 ? 1 : 0;
                            if (this.L == null) {
                            }
                            kkVar322.j(this.L);
                            this.n = org.telegram.messenger.bd.M0(2131745872, null);
                            if (org.telegram.messenger.hp.F2(user2)) {
                            }
                            getMessagesController().getClass();
                            if (org.telegram.messenger.hp.B2(user2)) {
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
                            if (this.e1 == org.telegram.messenger.h10.i(this.currentAccount).n) {
                            }
                            this.s6 = str2;
                            H5();
                            igVar = this.h5;
                            if (igVar != null) {
                            }
                            this.f0.getImageReceiver().O0(PhotoViewer.S1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                        }
                    } else {
                        videoSize = null;
                    }
                    x41Var = null;
                    org.telegram.messenger.ac C2 = this.o0.C(m14, m13);
                    if (this.I2 == null) {
                    }
                    if (this.J2 == null) {
                    }
                    acVar5 = m13;
                    user = a22;
                    acVar6 = m14;
                    if (acVar6 != null) {
                    }
                    D5(false, false);
                    y4(true);
                    if (acVar5 != null) {
                    }
                    user2 = user;
                    CharSequence p10222 = org.telegram.messenger.l10.p(user2);
                    if (user2.id == getUserConfig().e()) {
                    }
                    z14 = false;
                    str = str5;
                    TLRPC.UserProfilePhoto userProfilePhoto32222 = user2.photo;
                    this.r5 = userProfilePhoto32222 == null && userProfilePhoto32222.personal;
                    p10222 = org.telegram.messenger.i6.m(p10222, this.f.getPaint().getFontMetricsInt(), false, null, 0);
                    if (z11) {
                    }
                    this.f.l(p10222, false);
                    y4Var = this.simpleActionBar;
                    if (y4Var != null) {
                    }
                    this.r.setDrawablePadding(org.telegram.messenger.g0.L(9.0f));
                    this.r.setRightDrawableInside(true);
                    su0 su0Var22222 = this.r;
                    if (z14) {
                    }
                    su0Var22222.i(mw0Var);
                    this.r.setRightDrawableOnClick(z14 ? new pt0(this, 7) : null);
                    if (this.D2 != null) {
                    }
                    this.f.setRightDrawableOutside(false);
                    z15 = user2.scam;
                    if (z15) {
                    }
                    kk kkVar3222 = this.f;
                    int i122222 = !z15 ? 1 : 0;
                    if (this.L == null) {
                    }
                    kkVar3222.j(this.L);
                    this.n = org.telegram.messenger.bd.M0(2131745872, null);
                    if (org.telegram.messenger.hp.F2(user2)) {
                    }
                    getMessagesController().getClass();
                    if (org.telegram.messenger.hp.B2(user2)) {
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
                    if (this.e1 == org.telegram.messenger.h10.i(this.currentAccount).n) {
                    }
                    this.s6 = str2;
                    H5();
                    igVar = this.h5;
                    if (igVar != null) {
                    }
                    this.f0.getImageReceiver().O0(PhotoViewer.S1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                } else if (this.f1 != 0) {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                    if (M0 != null) {
                        this.E2 = M0;
                    } else {
                        M0 = this.E2;
                    }
                    TLRPC.Chat chat2 = M0;
                    org.telegram.messenger.n6 n6Var = this.X1;
                    if (n6Var != null) {
                        n6Var.g();
                    }
                    org.telegram.messenger.wo woVar2 = this.h6;
                    org.telegram.messenger.wo a11 = org.telegram.messenger.wo.a(chat2.emoji_status);
                    this.h6 = a11;
                    if (a11 == null) {
                        int I = org.telegram.messenger.t3.I(chat2);
                        org.telegram.messenger.xo xoVar2 = org.telegram.messenger.hp.s1(this.currentAccount).r4;
                        this.h6 = xoVar2 == null ? null : xoVar2.d(I);
                    }
                    if (woVar2 != this.h6) {
                        P5();
                    }
                    ow0 ow0Var2 = this.d1;
                    if (ow0Var2 != null) {
                        ow0Var2.b(org.telegram.messenger.t3.J(chat2), chat2.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    TLRPC.EmojiStatus emojiStatus2 = chat2.emoji_status;
                    b5(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null);
                    TLRPC.TL_forumTopic f10 = this.q1 ? getMessagesController().q7.f(this.f1, this.g1) : null;
                    if (org.telegram.messenger.t3.T(chat2)) {
                        if (!this.q1) {
                            TLRPC.ChatFull chatFull = this.u2;
                            if (chatFull != null) {
                                TLRPC.Chat chat3 = this.E2;
                                if (!chat3.megagroup) {
                                    if (chatFull.participants_count != 0) {
                                        if (!org.telegram.messenger.t3.N(chat3)) {
                                        }
                                    }
                                }
                            }
                            G = this.E2.megagroup ? org.telegram.messenger.bd.M0(2131748787, null).toLowerCase() : org.telegram.messenger.t3.t0(chat2) ? org.telegram.messenger.bd.M0(2131752318, null).toLowerCase() : org.telegram.messenger.bd.M0(2131752329, null).toLowerCase();
                        }
                        if (this.q1) {
                            int i13 = f10 != null ? f10.totalMessagesCount - 1 : 0;
                            if (i13 > 0) {
                                org.telegram.messenger.bd.G(i13, "messages", Integer.valueOf(i13));
                            } else {
                                org.telegram.messenger.bd.a0("TopicProfileStatus", null, 2131744020, chat2.title);
                            }
                            SpannableString spannableString = new SpannableString(">");
                            spannableString.setSpan(new org.telegram.ui.Components.wp(R.drawable.arrow_newchat, 0), 0, 1, 33);
                            G = new SpannableStringBuilder(chat2.title).append(' ').append((CharSequence) spannableString);
                            z12 = true;
                            if (z11) {
                                wm wmVar2 = (wm) obj;
                                if (wmVar2.p1.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.k5) {
                                    ((org.telegram.ui.ActionBar.k5) wmVar2.p1.getSubtitleTextView()).getText();
                                } else if (wmVar2.p1.getSubtitleTextView() instanceof org.telegram.ui.Components.h6) {
                                    ((org.telegram.ui.Components.h6) wmVar2.p1.getSubtitleTextView()).getText();
                                }
                                this.f0.setAnimateFromImageReceiver(wmVar2.p1.getAvatarImageView().getImageReceiver());
                            }
                            charSequence = str6;
                            if (this.q1) {
                                if (org.telegram.messenger.t3.p0(chat2)) {
                                    charSequence = org.telegram.messenger.bd.M0(2131752219, null);
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
                            z13 = chat2.scam;
                            if (!z13 || chat2.fake) {
                                kk kkVar4 = this.f;
                                int i14 = !z13 ? 1 : 0;
                                if (this.L == null) {
                                    org.telegram.ui.Components.kk0 kk0Var2 = new org.telegram.ui.Components.kk0(i14);
                                    this.L = kk0Var2;
                                    kk0Var2.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, this.A0));
                                }
                                kkVar4.j(this.L);
                                this.h = org.telegram.messenger.bd.M0(2131745872, null);
                            } else if (chat2.verified) {
                                this.f.j(r4());
                                this.h = org.telegram.messenger.bd.M0(2131754739, null);
                            } else {
                                this.f.j(null);
                                this.h = null;
                            }
                            if (org.telegram.messenger.m5.f(chat2.emoji_status) == 0) {
                                this.f.i(i4(chat2.emoji_status, false));
                                this.f.setRightDrawableOutside(true);
                                this.h = null;
                                if (org.telegram.messenger.t3.w(1, chat2)) {
                                    this.f.setRightDrawableOnClick(new pt0(this, 9));
                                    if (this.S) {
                                        this.S = true;
                                        getMediaDataController().Y0();
                                    }
                                } else {
                                    TLRPC.EmojiStatus emojiStatus3 = chat2.emoji_status;
                                    if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                                        this.f.setRightDrawableOnClick(new zt0(this, ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug, r8 ? 1 : 0));
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
                            if (org.telegram.messenger.t3.d0(this.currentAccount, this.i1)) {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) "* ");
                                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wp(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
                                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.M0(2131751926, null));
                                spannableStringBuilder2.append((CharSequence) " * ");
                                int length = spannableStringBuilder2.length();
                                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.fs(), length - 2, length - 1, 33);
                                spannableStringBuilder2.append(G);
                                G = spannableStringBuilder2;
                            }
                            this.s6 = G;
                            this.t6 = null;
                            H5();
                            if (this.q1) {
                                if (z12) {
                                    this.r.setOnClickListener(new pt0(this, 10));
                                } else {
                                    this.r.setOnClickListener(null);
                                    this.r.setClickable(false);
                                }
                            }
                            if (l10) {
                                y4(true);
                            }
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            TLRPC.FileLocation fileLocation2 = (chatPhoto != null || this.q1) ? null : chatPhoto.photo_big;
                            if (this.q1) {
                                if (org.telegram.messenger.t3.p0(this.E2)) {
                                    TLRPC.Chat v12 = getMessagesController().v1(this.E2.id);
                                    this.q0.q(v12);
                                    m10 = org.telegram.messenger.ac.m(this.currentAccount, 0, v12);
                                    m11 = org.telegram.messenger.ac.m(this.currentAccount, 1, v12);
                                    acVar2 = this.o0.C(m11, m10);
                                } else {
                                    this.q0.q(chat2);
                                    m10 = org.telegram.messenger.ac.m(this.currentAccount, 0, chat2);
                                    m11 = org.telegram.messenger.ac.m(this.currentAccount, 1, chat2);
                                    ru0 ru0Var = this.o0;
                                    if (ru0Var != null) {
                                        acVar2 = ru0Var.C(m11, m10);
                                    } else {
                                        acVar = m10;
                                        acVar2 = null;
                                        acVar3 = m11;
                                    }
                                }
                                acVar = m10;
                                acVar3 = m11;
                            } else {
                                rg.c.p(this.f0, f10, true, true, this.A0);
                                acVar2 = null;
                                acVar = null;
                                acVar3 = null;
                            }
                            boolean H = this.o0.H(null, acVar, acVar3, z10);
                            if ((acVar != null || H) && this.p2 && (m12 = this.c.m(0)) != null) {
                                this.a.w0(0, m12.getTop() - j4(), org.telegram.ui.Components.xq.h);
                            }
                            String str8 = (acVar2 == null && acVar2.p == 2) ? "g" : null;
                            if (this.J2 == null || this.q1) {
                                chat = chat2;
                            } else {
                                chat = chat2;
                                this.f0.m(acVar2, str8, acVar3, "50_50", this.q0, chat);
                            }
                            if (acVar != null && ((acVar4 = this.C0) == null || acVar.s != acVar4.s)) {
                                this.C0 = acVar;
                                getFileLoader().W(acVar, chat, null, 0, 1);
                            }
                            this.f0.getImageReceiver().O0(PhotoViewer.S1(fileLocation2) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                        } else if (!this.E2.megagroup) {
                            org.telegram.messenger.bd.S(new int[1], this.u2.participants_count);
                            if (this.E2.megagroup) {
                                org.telegram.messenger.bd.G(this.u2.participants_count, "Members", new Object[0]);
                                G = org.telegram.messenger.bd.H(',', "Members", this.u2.participants_count);
                            } else {
                                org.telegram.messenger.bd.G(this.u2.participants_count, "Subscribers", new Object[0]);
                                G = org.telegram.messenger.bd.H(',', "Subscribers", this.u2.participants_count);
                            }
                        } else if (this.B2 <= 1 || (i3 = this.u2.participants_count) == 0) {
                            int i15 = this.u2.participants_count;
                            if (i15 == 0) {
                                G = chat2.has_geo ? org.telegram.messenger.bd.M0(2131748650, null).toLowerCase() : org.telegram.messenger.t3.t0(chat2) ? org.telegram.messenger.bd.M0(2131748646, null).toLowerCase() : org.telegram.messenger.bd.M0(2131748649, null).toLowerCase();
                            } else {
                                org.telegram.messenger.bd.G(i15, "Members", new Object[0]);
                                G = org.telegram.messenger.bd.H(',', "Members", this.u2.participants_count);
                            }
                        } else {
                            org.telegram.messenger.bd.G(i3, "Members", new Object[0]);
                            org.telegram.messenger.bd.G(Math.min(this.B2, this.u2.participants_count), "OnlineCount", new Object[0]);
                            G = a1.g.C(org.telegram.messenger.bd.H(',', "Members", this.u2.participants_count), ", ", org.telegram.messenger.bd.H(',', "OnlineCount", Math.min(this.B2, this.u2.participants_count)));
                        }
                    } else if (org.telegram.messenger.t3.k0(chat2)) {
                        G = org.telegram.messenger.bd.M0(2131742839, null);
                    } else if (org.telegram.messenger.t3.l0(chat2)) {
                        G = org.telegram.messenger.bd.M0(2131742845, null);
                    } else {
                        int i16 = chat2.participants_count;
                        TLRPC.ChatFull chatFull2 = this.u2;
                        if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                            i16 = chatParticipants.participants.size();
                        }
                        G = (i16 == 0 || this.B2 <= 1) ? org.telegram.messenger.bd.G(i16, "Members", new Object[0]) : a1.g.C(org.telegram.messenger.bd.G(i16, "Members", new Object[0]), ", ", org.telegram.messenger.bd.G(this.B2, "OnlineCount", new Object[0]));
                    }
                    z12 = false;
                    if (z11) {
                    }
                    charSequence = str6;
                    if (this.q1) {
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
                    kk kkVar42 = this.f;
                    int i142 = !z13 ? 1 : 0;
                    if (this.L == null) {
                    }
                    kkVar42.j(this.L);
                    this.h = org.telegram.messenger.bd.M0(2131745872, null);
                    if (org.telegram.messenger.m5.f(chat2.emoji_status) == 0) {
                    }
                    if (chat2.bot_verification_icon == 0) {
                    }
                    if (org.telegram.messenger.t3.d0(this.currentAccount, this.i1)) {
                    }
                    this.s6 = G;
                    this.t6 = null;
                    H5();
                    if (this.q1) {
                    }
                    if (l10) {
                    }
                    TLRPC.ChatPhoto chatPhoto2 = chat2.photo;
                    if (chatPhoto2 != null) {
                    }
                    if (this.q1) {
                    }
                    boolean H2 = this.o0.H(null, acVar, acVar3, z10);
                    if (acVar != null) {
                    }
                    this.a.w0(0, m12.getTop() - j4(), org.telegram.ui.Components.xq.h);
                    if (acVar2 == null) {
                    }
                    if (this.J2 == null) {
                    }
                    chat = chat2;
                    if (acVar != null) {
                        this.C0 = acVar;
                        getFileLoader().W(acVar, chat, null, 0, 1);
                    }
                    this.f0.getImageReceiver().O0(PhotoViewer.S1(fileLocation2) && (getLastStoryViewer() == null || getLastStoryViewer().t0.a != this.f0), this.v0 != null);
                }
                y4(true);
            }
        }
        z11 = false;
        this.q5 = false;
        this.r5 = false;
        String str62 = "";
        if (this.e1 == 0) {
        }
        y4(true);
    }

    public final void J3() {
        int f10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || this.f == null || this.d1 == null || this.T0 == null || this.Q0 == null || this.R0 == null || this.S0 == null || this.p0 == null) {
            return;
        }
        Float valueOf = Float.valueOf(this.R5);
        wu0 wu0Var = this.T5;
        wu0Var.getClass();
        wu0Var.a(kVar, valueOf);
        if (this.R5 > 0.0f || this.k2 <= 0.0f) {
            return;
        }
        kk kkVar = this.f;
        int i3 = -1;
        if (this.h6 != null) {
            f10 = -1;
        } else {
            f10 = i0.a.f(this.k2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ji, this.A0), -1);
        }
        kkVar.setTextColor(f10);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (this.h6 == null) {
            i3 = i0.a.f(this.k2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.A0), -1);
        }
        kVar2.D(i3, false);
    }

    public final void J4() {
        Bundle k10 = a1.g.k("addToGroup", true);
        k10.putLong("chatId", this.E2.id);
        r40 r40Var = new r40(k10);
        TLRPC.ChatFull chatFull = this.u2;
        r40Var.J = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i3 = 0; i3 < this.u2.participants.participants.size(); i3++) {
                hVar.k(null, this.u2.participants.participants.get(i3).user_id);
            }
            r40Var.K = hVar;
        }
        r40Var.y = new jt0(this, 0);
        presentFragment(r40Var);
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
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatParticipants chatParticipants2;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull4;
        int i3;
        hu0 hu0Var;
        org.telegram.ui.Components.gf0 gf0Var;
        org.telegram.ui.Components.cg0 cg0Var;
        int i10;
        long j10;
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
        F5(false);
        int i11 = this.N2;
        this.N2 = 0;
        this.O2 = -1;
        this.P2 = -1;
        this.S2 = -1;
        this.T2 = -1;
        this.U2 = -1;
        this.V2 = -1;
        this.W2 = -1;
        this.Q2 = -1;
        this.R2 = -1;
        this.X2 = -1;
        this.a3 = -1;
        this.b3 = -1;
        this.Y2 = -1;
        this.Z2 = -1;
        this.c3 = -1;
        this.d3 = -1;
        this.e3 = -1;
        this.f3 = -1;
        this.g3 = -1;
        this.c4 = -1;
        this.d4 = -1;
        this.e4 = -1;
        this.f4 = -1;
        this.g4 = -1;
        this.h4 = -1;
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
        this.z3 = -1;
        this.i4 = -1;
        this.n4 = -1;
        this.botPermissionBiometry = -1;
        this.botPermissionEmojiStatus = -1;
        this.botPermissionLocation = -1;
        this.p4 = -1;
        this.j4 = -1;
        this.k4 = -1;
        this.l4 = -1;
        this.m4 = -1;
        this.U3 = -1;
        this.V3 = -1;
        this.X3 = -1;
        this.W3 = -1;
        this.Z3 = -1;
        this.A3 = -1;
        this.B3 = -1;
        this.D3 = -1;
        this.E3 = -1;
        this.F3 = -1;
        this.G3 = -1;
        this.H3 = -1;
        this.J3 = -1;
        this.I3 = -1;
        this.K3 = -1;
        this.L3 = -1;
        this.q4 = -1;
        this.r4 = -1;
        this.M3 = -1;
        this.Y3 = -1;
        this.N3 = -1;
        this.P3 = -1;
        this.O3 = -1;
        this.R3 = -1;
        this.S3 = -1;
        this.T3 = -1;
        this.s4 = -1;
        this.C3 = -1;
        this.a4 = -1;
        this.b4 = -1;
        this.t4 = -1;
        this.u4 = -1;
        this.v4 = -1;
        this.w4 = -1;
        this.x4 = -1;
        this.y4 = -1;
        this.z4 = -1;
        this.G4 = -1;
        this.H4 = -1;
        this.E4 = -1;
        this.K4 = -1;
        this.Q3 = -1;
        this.A4 = -1;
        this.B4 = -1;
        this.C4 = -1;
        this.D4 = -1;
        this.F4 = -1;
        this.I4 = false;
        boolean z13 = true;
        this.J4 = (this.e1 == 0 || (userFull7 = this.v2) == null || userFull7.wallet_card == null || (this.r0 != null && !this.s1)) ? false : true;
        this.L4 = -1;
        this.M4 = -1;
        this.N4 = -1;
        ArrayList arrayList2 = this.R4;
        arrayList2.clear();
        ArrayList arrayList3 = this.S4;
        arrayList3.clear();
        org.telegram.ui.Components.os0 os0Var = this.R;
        if (os0Var != null) {
            int[] iArr = os0Var.c;
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
            if (!z10 && (userFull6 = this.v2) != null) {
                z10 = userFull6.stories_pinned_available;
            }
            if (!z10 && (userFull5 = this.v2) != null && (botInfo = userFull5.bot_info) != null) {
                z10 = botInfo.has_preview_medias;
            }
            if (!z10 && (((userFull4 = this.v2) != null && userFull4.stargifts_count > 0) || ((chatFull6 = this.u2) != null && chatFull6.stargifts_count > 0))) {
                z10 = true;
            }
            if (!z10 && (chatFull5 = this.u2) != null) {
                z10 = chatFull5.stories_pinned_available;
            }
            if (!z10) {
                long j11 = this.f1;
                if (j11 != 0) {
                    org.telegram.messenger.io L0 = org.telegram.messenger.hp.s1(this.currentAccount).L0(-j11);
                    if (L0 != null) {
                    }
                }
                if (this.r2) {
                    long j12 = this.e1;
                    if (j12 != 0) {
                        org.telegram.messenger.io L02 = org.telegram.messenger.hp.s1(this.currentAccount).L0(j12);
                        if (L02 != null) {
                        }
                    }
                }
            }
            if (this.e1 == 0) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
                TLRPC.UserFull userFull8 = this.v2;
                if (userFull8 != null && userFull8.saved_music != null && (this.r0 == null || this.s1)) {
                    this.I4 = true;
                }
                if (this.A3 < 0 && this.B3 < 0) {
                    if (this.I4 || this.J4 || this.h6 != null || this.a0 == null) {
                        int i13 = this.N2;
                        this.N2 = i13 + 1;
                        this.B3 = i13;
                    } else {
                        int i14 = this.N2;
                        this.N2 = i14 + 1;
                        this.A3 = i14;
                    }
                }
                if (!org.telegram.messenger.l10.B(a22) || this.s1) {
                    String n4 = org.telegram.messenger.l10.n(a22);
                    TLRPC.UserFull userFull9 = this.v2;
                    boolean z14 = ((userFull9 == null || TextUtils.isEmpty(userFull9.about)) && (a22 == null || TextUtils.isEmpty(n4))) ? false : true;
                    boolean z15 = (a22 == null || (TextUtils.isEmpty(a22.phone) && TextUtils.isEmpty(this.e5))) ? false : true;
                    if (!this.r2 && (userFull3 = this.v2) != null && userFull3.unofficial_security_risk) {
                        int i15 = this.N2;
                        this.j4 = i15;
                        this.N2 = i15 + 2;
                        this.k4 = i15 + 1;
                    }
                    TLRPC.UserFull userFull10 = this.v2;
                    if (userFull10 == null || (userFull10.flags2 & 64) == 0 || ((d6Var = this.w2) != null && d6Var.c && d6Var.d.isEmpty())) {
                        j10 = 0;
                    } else {
                        j10 = 0;
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.v2.personal_channel_id));
                        if (M0 != null && (org.telegram.messenger.t3.t0(M0) || !org.telegram.messenger.t3.r0(M0))) {
                            int i16 = this.N2;
                            this.Q2 = i16;
                            this.N2 = i16 + 2;
                            this.R2 = i16 + 1;
                        }
                    }
                    if (!this.r2 && (z15 || !z14)) {
                        int i17 = this.N2;
                        this.N2 = i17 + 1;
                        this.G3 = i17;
                    }
                    TLRPC.UserFull userFull11 = this.v2;
                    if (userFull11 != null && !TextUtils.isEmpty(userFull11.about)) {
                        int i18 = this.N2;
                        this.N2 = i18 + 1;
                        this.J3 = i18;
                    }
                    if (a22 != null && n4 != null) {
                        int i19 = this.N2;
                        this.N2 = i19 + 1;
                        this.L3 = i19;
                    }
                    TLRPC.UserFull userFull12 = this.v2;
                    if (userFull12 != null) {
                        if (userFull12.birthday != null) {
                            int i20 = this.N2;
                            this.N2 = i20 + 1;
                            this.U2 = i20;
                        }
                        if (userFull12.business_work_hours != null) {
                            int i21 = this.N2;
                            this.N2 = i21 + 1;
                            this.O3 = i21;
                        }
                        if (userFull12.business_location != null) {
                            int i22 = this.N2;
                            this.N2 = i22 + 1;
                            this.P3 = i22;
                        }
                        if (userFull12.note != null) {
                            int i23 = this.N2;
                            this.N2 = i23 + 1;
                            this.H3 = i23;
                        }
                    }
                    if (this.a0 == null && this.e1 != getUserConfig().e()) {
                        int i24 = this.N2;
                        this.N2 = i24 + 1;
                        this.N3 = i24;
                    }
                    boolean z16 = this.r2;
                    if (z16 && a22 != null && a22.bot_has_main_app) {
                        int i25 = this.N2;
                        this.N2 = i25 + 1;
                        this.i4 = i25;
                    }
                    int i26 = this.N2;
                    int i27 = i26 + 1;
                    this.N2 = i27;
                    this.R3 = i26;
                    if (a22 != null && a22.linked_community_id != j10) {
                        this.l4 = i27;
                        this.N2 = i26 + 3;
                        this.m4 = i26 + 2;
                    }
                    if (z16 && (userFull2 = this.v2) != null && (starrefprogram = userFull2.starref_program) != null && (starrefprogram.flags & 2) == 0 && getMessagesController().g6) {
                        int i28 = this.N2;
                        this.S3 = i28;
                        this.N2 = i28 + 2;
                        this.T3 = i28 + 1;
                    }
                    if (this.r2) {
                        if (this.s2 == null && getContext() != null) {
                            this.s2 = ii.s0.e(getContext(), this.currentAccount, this.e1);
                        }
                        if (this.t2 == null && getContext() != null) {
                            this.t2 = ii.r.c(getContext(), this.currentAccount, this.e1);
                        }
                        ii.s0 s0Var = this.s2;
                        boolean z17 = s0Var != null && s0Var.b();
                        ii.r rVar = this.t2;
                        boolean z18 = rVar != null && rVar.a();
                        TLRPC.UserFull userFull13 = this.v2;
                        if (userFull13 == null || !userFull13.bot_can_manage_emoji_status) {
                            if (!ii.o4.d((Activity) getContext(), this.currentAccount, this.e1)) {
                                z12 = false;
                                if (!z12 || z17 || z18) {
                                    int i29 = this.N2;
                                    int i30 = i29 + 1;
                                    this.N2 = i30;
                                    this.n4 = i29;
                                    if (z12) {
                                        this.N2 = i29 + 2;
                                        this.botPermissionEmojiStatus = i30;
                                    }
                                    if (z17) {
                                        int i31 = this.N2;
                                        this.N2 = i31 + 1;
                                        this.botPermissionLocation = i31;
                                    }
                                    if (z18) {
                                        int i32 = this.N2;
                                        this.N2 = i32 + 1;
                                        this.botPermissionBiometry = i32;
                                    }
                                    int i33 = this.N2;
                                    this.N2 = i33 + 1;
                                    this.p4 = i33;
                                }
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        int i292 = this.N2;
                        int i302 = i292 + 1;
                        this.N2 = i302;
                        this.n4 = i292;
                        if (z12) {
                        }
                        if (z17) {
                        }
                        if (z18) {
                        }
                        int i332 = this.N2;
                        this.N2 = i332 + 1;
                        this.p4 = i332;
                    }
                    TLRPC.EncryptedChat encryptedChat = this.D2;
                    if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                        int i34 = this.N2;
                        this.q4 = i34;
                        this.r4 = i34 + 1;
                        this.N2 = i34 + 3;
                        this.s4 = i34 + 2;
                    }
                    if (a22 != null && !this.r2 && encryptedChat == null && a22.id != getUserConfig().e() && this.k1) {
                        int i35 = this.N2;
                        this.L4 = i35;
                        this.N2 = i35 + 2;
                        this.N4 = i35 + 1;
                    }
                    if (a22 != null && a22.bot) {
                        TLRPC.UserFull userFull14 = this.v2;
                        if (userFull14 != null && userFull14.can_view_revenue && ci.i0.g(this.currentAccount).i(this.e1) > j10) {
                            int i36 = this.N2;
                            this.N2 = i36 + 1;
                            this.C4 = i36;
                        }
                        if (ci.i0.g(this.currentAccount).c(this.e1).amount > j10 || !ci.i0.g(this.currentAccount).k(this.e1).a[0].isEmpty()) {
                            int i37 = this.N2;
                            this.N2 = i37 + 1;
                            this.B4 = i37;
                        }
                    }
                    if (a22 != null && this.r2 && !a22.bot_nochats) {
                        int i38 = this.N2;
                        this.a4 = i38;
                        this.N2 = i38 + 2;
                        this.b4 = i38 + 1;
                    } else if (this.B4 >= 0) {
                        z11 = true;
                        if (!this.s1 && this.d5 && a22 != null && !a22.contact && !a22.bot && !org.telegram.messenger.l10.A(a22.id)) {
                            int i39 = this.N2;
                            this.N2 = i39 + 1;
                            this.Z3 = i39;
                            z11 = true;
                        }
                        if (!this.s1 && this.a5 != 0 && this.b5 < j10 && org.telegram.messenger.t3.y(13, getMessagesController().M0(Long.valueOf(-this.b5)))) {
                            int i40 = this.N2;
                            this.N2 = i40 + 1;
                            this.W3 = i40;
                            z11 = true;
                        }
                        if (!this.s1 || this.a5 == 0 || org.telegram.messenger.g5.r(this.currentAccount).x(this.e1)) {
                            z13 = z11;
                        } else {
                            int i41 = this.N2;
                            this.N2 = i41 + 1;
                            this.X3 = i41;
                        }
                        if (z13) {
                            int i42 = this.N2;
                            this.N2 = i42 + 1;
                            this.Y3 = i42;
                        }
                        if (!z10 || ((a22 != null && a22.bot && a22.bot_can_edit && a22.bot_has_main_app) || (!((userFull = this.v2) == null || userFull.common_chats_count == 0) || this.s1))) {
                            int i43 = this.N2;
                            this.N2 = i43 + 1;
                            this.K4 = i43;
                        } else if (this.N4 == -1 && this.o1) {
                            int i44 = this.N2;
                            this.U3 = i44;
                            this.N2 = i44 + 2;
                            this.N4 = i44 + 1;
                        }
                    }
                    z11 = false;
                    if (!this.s1) {
                        int i392 = this.N2;
                        this.N2 = i392 + 1;
                        this.Z3 = i392;
                        z11 = true;
                    }
                    if (!this.s1) {
                        int i402 = this.N2;
                        this.N2 = i402 + 1;
                        this.W3 = i402;
                        z11 = true;
                    }
                    if (this.s1) {
                    }
                    z13 = z11;
                    if (z13) {
                    }
                    if (z10) {
                    }
                    int i432 = this.N2;
                    this.N2 = i432 + 1;
                    this.K4 = i432;
                } else {
                    if (this.J2 == null) {
                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                        if (userProfilePhoto != null) {
                            TLRPC.FileLocation fileLocation = userProfilePhoto.photo_big;
                            if (!(fileLocation instanceof TLRPC.TL_fileLocation_layer97)) {
                            }
                        }
                        ru0 ru0Var = this.o0;
                        if (ru0Var == null || ru0Var.getRealCount() == 0) {
                            int i45 = this.N2;
                            this.O2 = i45;
                            this.N2 = i45 + 2;
                            this.P2 = i45 + 1;
                        }
                    }
                    int i46 = this.N2;
                    this.S2 = i46;
                    this.T2 = i46 + 1;
                    this.V2 = i46 + 2;
                    this.W2 = i46 + 3;
                    this.N2 = i46 + 5;
                    this.d3 = i46 + 4;
                    Set set = getMessagesController().T3;
                    if (set.contains("PREMIUM_GRACE")) {
                        int i47 = this.N2;
                        this.Y2 = i47;
                        this.N2 = i47 + 2;
                        this.Z2 = i47 + 1;
                    } else if (set.contains("VALIDATE_PHONE_NUMBER")) {
                        int i48 = this.N2;
                        this.a3 = i48;
                        this.N2 = i48 + 2;
                        this.X2 = i48 + 1;
                    } else if (set.contains("VALIDATE_PASSWORD")) {
                        int i49 = this.N2;
                        this.c3 = i49;
                        this.N2 = i49 + 2;
                        this.b3 = i49 + 1;
                    }
                    int i50 = this.N2;
                    this.e3 = i50;
                    this.j3 = i50 + 1;
                    this.h3 = i50 + 2;
                    this.f3 = i50 + 3;
                    this.i3 = i50 + 4;
                    this.N2 = i50 + 6;
                    this.l3 = i50 + 5;
                    if (getMessagesController().F3 || !getMessagesController().Q0.isEmpty()) {
                        int i51 = this.N2;
                        this.N2 = i51 + 1;
                        this.k3 = i51;
                    }
                    int i52 = this.N2;
                    this.n3 = i52;
                    this.g3 = i52 + 1;
                    this.N2 = i52 + 3;
                    this.o3 = i52 + 2;
                    if (!getMessagesController().D3()) {
                        int i53 = this.N2;
                        this.N2 = i53 + 1;
                        this.c4 = i53;
                    }
                    if (getMessagesController().U4()) {
                        int i54 = this.N2;
                        this.N2 = i54 + 1;
                        this.d4 = i54;
                    }
                    ci.e9.y(this.currentAccount, true).p();
                    org.telegram.messenger.t0.n();
                    int i55 = this.N2;
                    this.N2 = i55 + 1;
                    this.e4 = i55;
                    if (!getMessagesController().D3()) {
                        int i56 = this.N2;
                        this.N2 = i56 + 1;
                        this.f4 = i56;
                    }
                    if (!getMessagesController().h7) {
                        int i57 = this.N2;
                        this.N2 = i57 + 1;
                        this.g4 = i57;
                    }
                    if (this.c4 >= 0 || this.d4 >= 0 || this.e4 >= 0 || this.f4 >= 0 || this.g4 >= 0) {
                        int i58 = this.N2;
                        this.N2 = i58 + 1;
                        this.h4 = i58;
                    }
                    int i59 = this.N2;
                    this.p3 = i59;
                    this.q3 = i59 + 1;
                    this.r3 = i59 + 2;
                    int i60 = i59 + 4;
                    this.N2 = i60;
                    this.s3 = i59 + 3;
                    boolean z19 = org.telegram.messenger.r2.a;
                    if (z19) {
                        this.t3 = i60;
                        this.N2 = i59 + 6;
                        this.u3 = i59 + 5;
                    }
                    if (z19) {
                        int i61 = this.N2;
                        this.v3 = i61;
                        this.w3 = i61 + 1;
                        this.N2 = i61 + 3;
                        this.x3 = i61 + 2;
                    }
                    int i62 = this.N2;
                    this.y3 = i62;
                    this.N2 = i62 + 2;
                    this.z3 = i62 + 1;
                }
            } else if (this.q1) {
                if (this.A3 < 0 && this.B3 < 0) {
                    if (this.I4 || this.J4 || this.h6 != null || this.a0 == null) {
                        int i63 = this.N2;
                        this.N2 = i63 + 1;
                        this.B3 = i63;
                    } else {
                        int i64 = this.N2;
                        this.N2 = i64 + 1;
                        this.A3 = i64;
                    }
                }
                int i65 = this.N2;
                int i66 = i65 + 1;
                this.N2 = i66;
                this.L3 = i65;
                if (this.a0 == null) {
                    this.N2 = i65 + 2;
                    this.Q3 = i66;
                }
                int i67 = this.N2;
                int i68 = i67 + 1;
                this.N2 = i68;
                this.R3 = i67;
                if (z10) {
                    this.N2 = i67 + 2;
                    this.K4 = i68;
                }
            } else if (this.f1 != 0) {
                TLRPC.ChatFull chatFull7 = this.u2;
                if ((chatFull7 != null && (!TextUtils.isEmpty(chatFull7.about) || (this.u2.location instanceof TLRPC.TL_channelLocation))) || org.telegram.messenger.t3.t0(this.E2)) {
                    if (this.A3 < 0 && this.B3 < 0) {
                        if (this.I4 || this.J4 || this.h6 != null || this.a0 == null) {
                            int i69 = this.N2;
                            this.N2 = i69 + 1;
                            this.B3 = i69;
                        } else {
                            int i70 = this.N2;
                            this.N2 = i70 + 1;
                            this.A3 = i70;
                        }
                    }
                    if (this.a0 == null) {
                        int i71 = this.N2;
                        this.N2 = i71 + 1;
                        this.D3 = i71;
                    }
                    TLRPC.ChatFull chatFull8 = this.u2;
                    if (chatFull8 != null) {
                        if (!TextUtils.isEmpty(chatFull8.about)) {
                            int i72 = this.N2;
                            this.N2 = i72 + 1;
                            this.K3 = i72;
                        }
                        if (this.u2.location instanceof TLRPC.TL_channelLocation) {
                            int i73 = this.N2;
                            this.N2 = i73 + 1;
                            this.I3 = i73;
                        }
                    }
                    if (org.telegram.messenger.t3.t0(this.E2)) {
                        int i74 = this.N2;
                        this.N2 = i74 + 1;
                        this.L3 = i74;
                    }
                }
                if (this.A3 < 0 && this.B3 < 0) {
                    if (this.I4 || this.J4 || this.h6 != null || this.a0 == null) {
                        int i75 = this.N2;
                        this.N2 = i75 + 1;
                        this.B3 = i75;
                    } else {
                        int i76 = this.N2;
                        this.N2 = i76 + 1;
                        this.A3 = i76;
                    }
                }
                if (this.a0 == null) {
                    if (this.D3 != -1) {
                        int i77 = this.N2;
                        this.N2 = i77 + 1;
                        this.M3 = i77;
                    }
                    int i78 = this.N2;
                    this.N2 = i78 + 1;
                    this.N3 = i78;
                }
                int i79 = this.N2;
                if (i79 > 0) {
                    this.N2 = i79 + 1;
                    this.R3 = i79;
                }
                TLRPC.Chat chat = this.E2;
                if (chat != null && chat.linked_community_id != 0) {
                    int i80 = this.N2;
                    this.l4 = i80;
                    this.N2 = i80 + 2;
                    this.m4 = i80 + 1;
                }
                if (org.telegram.messenger.t3.T(chat)) {
                    TLRPC.Chat chat2 = this.E2;
                    if (!chat2.megagroup) {
                        TLRPC.ChatFull chatFull9 = this.u2;
                        if (chatFull9 != null && (chat2.creator || chatFull9.can_view_participants)) {
                            if (this.a0 == null) {
                                int i81 = this.N2;
                                this.N2 = i81 + 1;
                                this.t4 = i81;
                            }
                            int i82 = this.N2;
                            int i83 = i82 + 1;
                            this.N2 = i83;
                            this.x4 = i82;
                            if (chatFull9.requests_pending > 0) {
                                this.N2 = i82 + 2;
                                this.y4 = i83;
                            }
                            int i84 = this.N2;
                            int i85 = i84 + 1;
                            this.N2 = i85;
                            this.z4 = i84;
                            if (chatFull9.banned_count != 0 || chatFull9.kicked_count != 0) {
                                this.N2 = i84 + 2;
                                this.G4 = i85;
                            }
                            if ((chatFull9.can_view_stars_revenue && (ci.i0.g(this.currentAccount).c(-this.f1).amount > 0 || !ci.i0.g(this.currentAccount).k(-this.f1).a[0].isEmpty())) || ((chatFull4 = this.u2) != null && chatFull4.can_view_revenue && ci.i0.g(this.currentAccount).i(-this.f1) > 0)) {
                                int i86 = this.N2;
                                this.N2 = i86 + 1;
                                this.D4 = i86;
                            }
                            int i87 = this.N2;
                            this.A4 = i87;
                            this.N2 = i87 + 2;
                            this.E4 = i87 + 1;
                        }
                        if (org.telegram.messenger.t3.T(this.E2)) {
                            TLRPC.ChatFull chatFull10 = this.u2;
                            if (chatFull10 != null) {
                                if (this.q1 || (chatParticipants = chatFull10.participants) == null || chatParticipants.participants == null || (chatParticipants instanceof TLRPC.TL_chatParticipantsForbidden)) {
                                    if (!org.telegram.messenger.t3.r0(this.E2) && org.telegram.messenger.t3.w(3, this.E2) && this.u2.participants_hidden) {
                                        int i88 = this.N2;
                                        this.w4 = i88;
                                        this.N2 = i88 + 2;
                                        this.H4 = i88 + 1;
                                    }
                                    mv0 mv0Var = this.O;
                                    if (mv0Var != null) {
                                        mv0Var.C1();
                                    }
                                } else {
                                    if (org.telegram.messenger.t3.w(3, this.E2) || (tL_chatBannedRights = this.E2.default_banned_rights) == null || !tL_chatBannedRights.invite_users) {
                                        int i89 = this.N2;
                                        this.N2 = i89 + 1;
                                        this.w4 = i89;
                                    }
                                    if (this.u2.participants.participants.size() <= 5 || !z10) {
                                        if (this.w4 == -1 && this.a0 == null) {
                                            int i90 = this.N2;
                                            this.N2 = i90 + 1;
                                            this.t4 = i90;
                                        }
                                        int i91 = this.N2;
                                        this.u4 = i91;
                                        int size = this.u2.participants.participants.size() + i91;
                                        this.v4 = size;
                                        this.N2 = size + 1;
                                        this.H4 = size;
                                        arrayList2.addAll(this.u2.participants.participants);
                                        ArrayList arrayList4 = this.C2;
                                        if (arrayList4 != null) {
                                            arrayList3.addAll(arrayList4);
                                        }
                                        mv0 mv0Var2 = this.O;
                                        if (mv0Var2 != null) {
                                            mv0Var2.k1(null, null);
                                        }
                                    } else {
                                        if (this.w4 != -1) {
                                            int i92 = this.N2;
                                            this.N2 = i92 + 1;
                                            this.H4 = i92;
                                        }
                                        mv0 mv0Var3 = this.O;
                                        if (mv0Var3 != null) {
                                            mv0Var3.k1(this.C2, this.u2);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (this.q1 || (chatFull3 = this.u2) == null || !this.E2.megagroup || (chatParticipants2 = chatFull3.participants) == null || (arrayList = chatParticipants2.participants) == null || arrayList.isEmpty()) {
                                if (!org.telegram.messenger.t3.r0(this.E2) && org.telegram.messenger.t3.w(3, this.E2) && (chatFull2 = this.u2) != null && chatFull2.participants_hidden) {
                                    int i93 = this.N2;
                                    this.w4 = i93;
                                    this.N2 = i93 + 2;
                                    this.H4 = i93 + 1;
                                }
                                mv0 mv0Var4 = this.O;
                                if (mv0Var4 != null) {
                                    mv0Var4.C1();
                                }
                            } else {
                                if (!org.telegram.messenger.t3.r0(this.E2) && org.telegram.messenger.t3.w(3, this.E2) && this.u2.participants_count < getMessagesController().Y2) {
                                    int i94 = this.N2;
                                    this.N2 = i94 + 1;
                                    this.w4 = i94;
                                }
                                int size2 = this.u2.participants.participants.size();
                                if ((size2 <= 5 || !z10 || this.T4 == 1) && this.T4 != 2) {
                                    if (this.w4 == -1 && this.a0 == null) {
                                        int i95 = this.N2;
                                        this.N2 = i95 + 1;
                                        this.t4 = i95;
                                    }
                                    int i96 = this.N2;
                                    this.u4 = i96;
                                    int i97 = i96 + size2;
                                    this.v4 = i97;
                                    this.N2 = i97 + 1;
                                    this.H4 = i97;
                                    arrayList2.addAll(this.u2.participants.participants);
                                    ArrayList arrayList5 = this.C2;
                                    if (arrayList5 != null) {
                                        arrayList3.addAll(arrayList5);
                                    }
                                    this.T4 = 1;
                                    mv0 mv0Var5 = this.O;
                                    if (mv0Var5 != null) {
                                        mv0Var5.k1(null, null);
                                    }
                                } else {
                                    if (this.w4 != -1) {
                                        int i98 = this.N2;
                                        this.N2 = i98 + 1;
                                        this.H4 = i98;
                                    }
                                    if (this.O != null) {
                                        if (!this.C2.isEmpty()) {
                                            this.T4 = 2;
                                        }
                                        this.O.k1(this.C2, this.u2);
                                    }
                                }
                            }
                            if (this.N4 == -1) {
                                TLRPC.Chat chat3 = this.E2;
                                if (chat3.left && !chat3.kicked) {
                                    long j13 = org.telegram.messenger.hp.x1(this.currentAccount).getLong("dialog_join_requested_time_" + this.i1, -1L);
                                    if (j13 <= 0 || System.currentTimeMillis() - j13 >= 120000) {
                                        org.telegram.ui.Components.gf0 gf0Var2 = this.a0;
                                        if (gf0Var2 == null || !gf0Var2.f()) {
                                            int i99 = this.N2;
                                            this.M4 = i99;
                                            this.N2 = i99 + 2;
                                            this.N4 = i99 + 1;
                                        }
                                        if (z10) {
                                            int i100 = this.N2;
                                            this.N2 = i100 + 1;
                                            this.K4 = i100;
                                        }
                                        if (this.K4 == -1) {
                                            int i101 = this.N2;
                                            this.N2 = i101 + 1;
                                            this.C3 = i101;
                                        }
                                        if (this.actionBar != null) {
                                            i3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
                                        } else {
                                            i3 = 0;
                                        }
                                        if (this.a != null && i11 <= this.N2) {
                                            i10 = this.F0;
                                            if (i10 != 0) {
                                            }
                                            hu0Var = this.a;
                                            if (hu0Var != null) {
                                                hu0Var.setTranslateSelectorPosition(this.O3);
                                            }
                                            gf0Var = this.a0;
                                            if (gf0Var != null) {
                                                gf0Var.o(7, z13);
                                            }
                                            cg0Var = this.c0;
                                            if (cg0Var != null) {
                                                TLRPC.UserFull userFull15 = this.v2;
                                                if (userFull15 != null) {
                                                    cg0Var.setMusicDocument(userFull15.saved_music);
                                                }
                                                this.c0.setVisibility(this.I4 ? 0 : 8);
                                                if (this.J4) {
                                                    this.d0.setBalance(this.v2.wallet_card.balance);
                                                }
                                                this.d0.setVisibility(this.J4 ? 0 : 8);
                                                this.c0.invalidate();
                                                this.d0.invalidate();
                                                return;
                                            }
                                            return;
                                        }
                                        this.D0 = 0;
                                        hu0Var = this.a;
                                        if (hu0Var != null) {
                                        }
                                        gf0Var = this.a0;
                                        if (gf0Var != null) {
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
                        if (this.K4 == -1) {
                        }
                        if (this.actionBar != null) {
                        }
                        if (this.a != null) {
                            i10 = this.F0;
                            if (i10 != 0) {
                            }
                            hu0Var = this.a;
                            if (hu0Var != null) {
                            }
                            gf0Var = this.a0;
                            if (gf0Var != null) {
                            }
                            cg0Var = this.c0;
                            if (cg0Var != null) {
                            }
                        }
                        this.D0 = 0;
                        hu0Var = this.a;
                        if (hu0Var != null) {
                        }
                        gf0Var = this.a0;
                        if (gf0Var != null) {
                        }
                        cg0Var = this.c0;
                        if (cg0Var != null) {
                        }
                    }
                }
                TLRPC.ChatFull chatFull11 = this.u2;
                if ((chatFull11 != null && chatFull11.can_view_stars_revenue && (ci.i0.g(this.currentAccount).c(-this.f1).amount > 0 || !ci.i0.g(this.currentAccount).k(-this.f1).a[0].isEmpty())) || ((chatFull = this.u2) != null && chatFull.can_view_revenue && ci.i0.g(this.currentAccount).i(-this.f1) > 0)) {
                    int i102 = this.N2;
                    this.D4 = i102;
                    this.N2 = i102 + 2;
                    this.E4 = i102 + 1;
                }
                if (org.telegram.messenger.t3.T(this.E2)) {
                }
                z13 = false;
                if (z10) {
                }
                if (this.K4 == -1) {
                }
                if (this.actionBar != null) {
                }
                if (this.a != null) {
                }
                this.D0 = 0;
                hu0Var = this.a;
                if (hu0Var != null) {
                }
                gf0Var = this.a0;
                if (gf0Var != null) {
                }
                cg0Var = this.c0;
                if (cg0Var != null) {
                }
            }
            z13 = false;
            if (this.K4 == -1) {
            }
            if (this.actionBar != null) {
            }
            if (this.a != null) {
            }
            this.D0 = 0;
            hu0Var = this.a;
            if (hu0Var != null) {
            }
            gf0Var = this.a0;
            if (gf0Var != null) {
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
        if (this.K4 == -1) {
        }
        if (this.actionBar != null) {
        }
        if (this.a != null) {
        }
        this.D0 = 0;
        hu0Var = this.a;
        if (hu0Var != null) {
        }
        gf0Var = this.a0;
        if (gf0Var != null) {
        }
        cg0Var = this.c0;
        if (cg0Var != null) {
        }
    }

    public final void K3() {
        if (this.a6 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.j2;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.j2.cancel();
        }
        float l10 = Utilities.l(this.Q1 / this.F1);
        if (l10 <= 0.0f) {
            return;
        }
        float f10 = (l10 - 0.5f) / 0.5f;
        float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.L(21.0f));
        this.b2 = org.telegram.messenger.g0.T1(0.42f, this.a6[0], l10);
        this.Z1 = org.telegram.messenger.g0.T1(this.f6, this.a6[1], l10);
        this.a2 = org.telegram.messenger.g0.T1(translationY, this.a6[2], l10);
        this.c2 = org.telegram.messenger.g0.T1(this.a6[11], 0.0f, l10);
        this.Y.setScaleX(this.b2);
        this.Y.setScaleY(this.b2);
        this.Y.setTranslationX(this.Z1);
        this.Y.setTranslationY(this.a2);
        org.telegram.ui.Components.ku0 ku0Var = this.T;
        if (ku0Var != null) {
            ku0Var.setAlpha(l10);
        }
        this.f0.setAlpha(1.0f);
        this.Y.setAlpha(1.0f);
        tu0 tu0Var = this.v0;
        if (tu0Var != null) {
            tu0Var.invalidate();
        }
        ci.z0 z0Var = this.w0;
        if (z0Var != null) {
            z0Var.e = org.telegram.messenger.g0.T1(0.0f, this.a6[4], f10);
            this.w0.f = org.telegram.messenger.g0.T1(0.0f, this.a6[5], l10);
            ci.z0 z0Var2 = this.w0;
            z0Var2.h = true;
            z0Var2.invalidate();
        }
        mw0 mw0Var = this.z6;
        if (mw0Var != null) {
            mw0Var.setAlpha((int) org.telegram.messenger.g0.T1(0.0f, this.a6[6], l10));
        }
        float L = (((this.b2 * 100.0f) / 42.0f) * org.telegram.messenger.g0.L(42.0f)) - org.telegram.messenger.g0.L(42.0f);
        this.i0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(16.0f) + L);
        this.i0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(-10.0f) + L);
        this.j0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
        this.j0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(26.5f) + L);
        this.k0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
        this.k0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L);
        this.l0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L);
        this.l0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L);
        float T1 = org.telegram.messenger.g0.T1(1.0f, this.a6[7], l10);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - (org.telegram.messenger.g0.p * 21.0f)))) + org.telegram.messenger.g0.L(1.3f);
        float N = org.telegram.messenger.g0.N(22.7f) + floor;
        this.e2 = org.telegram.messenger.g0.T1(floor, this.a6[8], l10);
        this.g2 = org.telegram.messenger.g0.T1(N, this.a6[9], l10);
        float T12 = org.telegram.messenger.g0.T1((this.f6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f), this.a6[12], l10);
        float T13 = org.telegram.messenger.g0.T1((this.f6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f), this.a6[13], l10);
        this.f.setTranslationX(T12);
        this.f.setTranslationY(this.e2);
        this.r.setTranslationX(this.p5 + T13);
        this.r.setTranslationY(this.g2);
        this.d2 = T12;
        this.f2 = T13;
        this.f.setScaleX(T1);
        this.f.setScaleY(T1);
        q5();
        w5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0));
        z4((int) this.a6[10], l10, true);
        org.telegram.ui.Components.gf0 gf0Var = this.a0;
        if (gf0Var != null) {
            gf0Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, this.a6[3], f10));
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
    public final void K4(boolean z10) {
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
            ru0 ru0Var = this.o0;
            int realPosition = ru0Var != null ? ru0Var.getRealPosition() : 0;
            ru0 ru0Var2 = this.o0;
            org.telegram.messenger.ac acVar = null;
            org.telegram.messenger.ac G = ru0Var2 != null ? ru0Var2.G(realPosition) : null;
            ru0 ru0Var3 = this.o0;
            TLRPC.Photo F = ru0Var3 != null ? ru0Var3.F(realPosition) : null;
            long j10 = this.e1;
            cv0 cv0Var = this.l5;
            if (j10 == 0) {
                if (this.f1 == 0 || (chatPhoto = (M0 = getMessagesController().M0(Long.valueOf(this.f1))).photo) == null || chatPhoto.photo_big == null) {
                    return;
                }
                PhotoViewer.v1().N2(null, this, null);
                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                int i3 = chatPhoto2.dc_id;
                if (i3 != 0) {
                    chatPhoto2.photo_big.dc_id = i3;
                }
                if (G == null || (fileLocation = G.f) == null) {
                    fileLocation = chatPhoto2.photo_big;
                }
                TLRPC.FileLocation fileLocation3 = fileLocation;
                if (F == null && (chatFull = this.u2) != null) {
                    TLRPC.Photo photo2 = chatFull.chat_photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        F = photo2;
                    }
                }
                if (F != null && !F.video_sizes.isEmpty() && (x10 = org.telegram.messenger.w7.x(1000, F.video_sizes)) != null) {
                    acVar = org.telegram.messenger.ac.j(x10, F);
                }
                PhotoViewer.v1().h2(null, fileLocation3, G, acVar, null, null, null, 0, cv0Var, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null) {
                return;
            }
            PhotoViewer.v1().N2(null, this, null);
            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
            int i10 = userProfilePhoto2.dc_id;
            if (i10 != 0) {
                userProfilePhoto2.photo_big.dc_id = i10;
            }
            if (G == null || (fileLocation2 = G.f) == null) {
                fileLocation2 = userProfilePhoto2.photo_big;
            }
            TLRPC.FileLocation fileLocation4 = fileLocation2;
            if (F == null && (userFull = this.v2) != null) {
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
                acVar = org.telegram.messenger.ac.j(x11, F);
            }
            PhotoViewer.v1().h2(null, fileLocation4, G, acVar, null, null, null, 0, cv0Var, null, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void K5() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.k0 == null || (imageView = this.l0) == null) {
            return;
        }
        if (!this.L1 || (chat = this.E2) == null || (chat.flags2 & 2048) == 0) {
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

    public final float L3() {
        return Utilities.l((this.Q1 - e4()) / k4());
    }

    public final void L4() {
        TLRPC.User a22;
        if (this.e1 == 0 || c4() || (a22 = getMessagesController().a2(Long.valueOf(this.e1))) == null || (a22 instanceof TLRPC.TL_userEmpty)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.e1);
        if (getMessagesController().E(bundle, this, null, null)) {
            boolean z10 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
            if (!org.telegram.messenger.g0.Q1() && z10) {
                org.telegram.messenger.hs notificationCenter = getNotificationCenter();
                int i3 = org.telegram.messenger.hs.t;
                notificationCenter.n(this, i3);
                getNotificationCenter().k(i3, new Object[0]);
            }
            int i10 = getArguments().getInt("nearby_distance", -1);
            if (i10 >= 0) {
                bundle.putInt("nearby_distance", i10);
            }
            wm wmVar = new wm(bundle);
            org.telegram.messenger.li mediaDataController = getMediaDataController();
            TLRPC.Document document = mediaDataController.z0;
            mediaDataController.n1();
            wmVar.V9 = document;
            wmVar.W9 = false;
            presentFragment(wmVar, z10);
            if (!org.telegram.messenger.g0.Q1() || this.J0) {
                return;
            }
            finishFragment();
        }
    }

    public final void L5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        if ((this.v0 == null && this.w0 == null) || (kVar = this.actionBar) == null || this.simpleActionBar == null) {
            return;
        }
        float f10 = kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0.0f;
        int L = org.telegram.messenger.g0.L(7.0f);
        float right = this.simpleActionBar.getBackButton().getRight() + L;
        float menuPillLeft = this.simpleActionBar.getMenuPillLeft() - L;
        tu0 tu0Var = this.v0;
        if (tu0Var != null) {
            float z11 = com.google.android.recaptcha.internal.a.z(this.actionBar.getHeight(), f10, 2.0f, f10);
            boolean z12 = Math.abs(right - tu0Var.g0) > 0.1f || Math.abs(menuPillLeft - tu0Var.h0) > 0.1f || Math.abs(z11 - tu0Var.i0) > 0.1f;
            tu0Var.g0 = right;
            tu0Var.h0 = menuPillLeft;
            if (z10) {
                tu0Var.n0.e(true, menuPillLeft);
            }
            tu0Var.i0 = z11;
            if (z12) {
                tu0Var.invalidate();
            }
        }
        ci.z0 z0Var = this.w0;
        if (z0Var != null) {
            float z13 = com.google.android.recaptcha.internal.a.z(this.actionBar.getHeight(), f10, 2.0f, f10);
            int k42 = k4();
            boolean z14 = Math.abs(right - z0Var.r) > 0.1f || Math.abs(menuPillLeft - z0Var.s) > 0.1f || Math.abs(z13 - z0Var.w) > 0.1f;
            z0Var.r = right;
            z0Var.s = menuPillLeft;
            if (z10) {
                z0Var.E.e(true, menuPillLeft);
            }
            z0Var.w = z13;
            z0Var.y = k42 + z13;
            if (z14) {
                z0Var.invalidate();
            }
        }
    }

    public final void M3() {
        this.a2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.L(21.0f));
        this.b2 = 1.38f;
        this.c2 = 0.0f;
        d4();
        R4();
        z4(0, 1.0f, true);
        this.d2 = (this.a.getMeasuredWidth() / 2.0f) - (((this.f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin);
        this.f2 = (this.a.getMeasuredWidth() / 2.0f) - ((this.r.getExactWidth() * 0.5f) + (((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin + (this.q5 ? 0 : this.r.getPaddingLeft())));
        this.w6 = this.q5 ? 0.0f : this.r.getPaddingLeft();
        if (this.J1 != 2) {
            this.v0.setAlpha(1.0f);
        }
        this.Y.setAlpha(1.0f);
        this.f0.setAlpha(1.0f);
    }

    public final void M4() {
        TLRPC.ChatFull chatFull = this.u2;
        if (chatFull == null || chatFull.linked_chat_id == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.u2.linked_chat_id);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new wm(bundle));
        }
    }

    public final void M5() {
        try {
            org.telegram.ui.Components.voip.r0 r0Var = this.U;
            if (r0Var != null && (r0Var.getForeground() instanceof ColorDrawable)) {
                ((ColorDrawable) this.U.getForeground()).setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.A0), 100));
            }
            float f10 = this.R5;
            Drawable drawable = this.E;
            int[] iArr = this.S6;
            if (drawable != null) {
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ni, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.A0));
                int i3 = iArr[6];
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                if (S0 != i3) {
                    drawable.setColorFilter(new PorterDuffColorFilter(S0, mode));
                }
                iArr[6] = S0;
            }
            Drawable drawable2 = this.O6;
            if (drawable2 != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.V6, this.A0);
                int i10 = iArr[3];
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                if (w02 != i10) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
                }
                iArr[3] = w02;
            }
            Drawable drawable3 = this.P6;
            if (drawable3 != null) {
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.A0);
                int i11 = iArr[4];
                PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
                if (w03 != i11) {
                    drawable3.setColorFilter(new PorterDuffColorFilter(w03, mode3));
                }
                iArr[4] = w03;
            }
            Drawable drawable4 = this.Q6;
            if (drawable4 != null) {
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.A0);
                int i12 = iArr[5];
                PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
                if (w04 != i12) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(w04, mode4));
                }
                iArr[5] = w04;
            }
            org.telegram.ui.Components.wp wpVar = this.R6;
            if (wpVar != null) {
                wpVar.y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.kk, this.A0);
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

    @Override // org.telegram.ui.nw
    public final /* synthetic */ boolean N(uw uwVar) {
        return false;
    }

    public final void N4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.v2;
        if (userFull == null || (tL_businessLocation = userFull.business_location) == null) {
            return;
        }
        int i3 = 1;
        if (tL_businessLocation.geo_point == null || z10) {
            boolean z11 = org.telegram.messenger.r2.a;
            org.telegram.messenger.t0.r();
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?q=" + this.v2.business_location.address, new Object[0]))));
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        ei.p8 p8Var = new ei.p8(3, i3);
        p8Var.setResourceProvider(this.A0);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.local_id = -1;
        tL_message.peer_id = getMessagesController().z1(a());
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_businessLocation tL_businessLocation2 = this.v2.business_location;
        tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
        tL_messageMediaGeo.address = tL_businessLocation2.address;
        tL_message.media = tL_messageMediaGeo;
        p8Var.Q0 = false;
        p8Var.G0(new org.telegram.messenger.zi(org.telegram.messenger.h10.t0, tL_message, false, false));
        presentFragment(p8Var);
    }

    public final void N5() {
        TLRPC.UserFull userFull;
        if (this.Y0 == null) {
            return;
        }
        org.telegram.messenger.g0.Z3(this.Y0, this.D2 == null && (((userFull = this.v2) != null && userFull.ttl_period > 0) || (this.u2 != null && org.telegram.messenger.t3.y(13, this.E2) && this.u2.ttl_period > 0)), 0.8f, true, this.m5);
    }

    @Override // org.telegram.ui.Components.e30
    public final void O(boolean z10, boolean z11) {
        org.telegram.ui.Cells.b4 b4Var = this.h0;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(0.0f);
    }

    public final void O3() {
        u4.d1 d1Var;
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
        int i3 = 0;
        while (true) {
            if (i3 >= this.a.getChildCount()) {
                view = null;
                break;
            } else {
                if (RecyclerView.R(this.a.getChildAt(i3)) == 0) {
                    view = this.a.getChildAt(i3);
                    break;
                }
                i3++;
            }
        }
        if (view != null) {
            hu0 hu0Var = this.a;
            View F = hu0Var.F(view);
            d1Var = (org.telegram.ui.Components.bj0) (F != null ? hu0Var.T(F) : null);
        }
        int top = view == null ? 0 : view.getTop();
        int i10 = (top < 0 || (d1Var != null ? d1Var.b() : -1) != 0) ? 0 : top;
        float a10 = view == null ? 1.0f : b8.be.a((-top) / org.telegram.messenger.g0.L(12.0f), 0.0f, 1.0f);
        if (this.M5 != a10) {
            this.M5 = a10;
            z5();
        }
        int i11 = 1;
        boolean z10 = this.r0 == null && this.actionBar.o0;
        int i12 = this.K4;
        if (i12 != -1 && !z10) {
            org.telegram.ui.Components.bj0 bj0Var = (org.telegram.ui.Components.bj0) this.a.K(i12);
            z10 = bj0Var != null && bj0Var.a.getTop() <= 0;
        }
        if (this.S5 != z10) {
            this.S5 = z10;
            P3();
            AnimatorSet animatorSet = this.P5;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.Q5;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            B5(true);
            H5();
            L5(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.actionBar, this.T5, z10 ? 1.0f : 0.0f));
            this.O.L0.setOpen(z10);
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this, this.k5, 0.0f));
            }
            if (this.v0 != null || this.w0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new st0(this, 3));
                arrayList.add(ofFloat);
            }
            R3();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.P5 = animatorSet3;
            animatorSet3.playTogether(arrayList);
            this.P5.setInterpolator(org.telegram.ui.Components.xq.f);
            this.P5.addListener(new uu0(this, i11));
            this.P5.setDuration(150L);
            this.P5.start();
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.r4, Boolean.TRUE);
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
        y4(true);
    }

    public final void O4(int i3, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        zu0 zu0Var = new zu0(this, user.id, this.f1, tL_chatAdminRights, this.E2.default_banned_rights, tL_chatBannedRights, str, i3, zArr, user);
        zu0Var.Y0 = new av0(this, i3, chatParticipant, z10, zArr);
        presentFragment(zu0Var);
    }

    public final void O5(boolean z10) {
        boolean z11;
        TLRPC.ChatFull chatFull;
        float L3 = L3();
        this.Y5 = L3 > 0.2f && !this.W1 && (this.r0 == null || this.O2 == -1);
        R3();
        org.telegram.ui.Components.fh0 fh0Var = this.s;
        if (fh0Var == null || fh0Var.getVisibility() == 8) {
            z11 = false;
        } else {
            this.s.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) + this.Q1) + this.T1) - org.telegram.messenger.g0.L(29.5f));
            z11 = L3 > 0.2f && !this.W1 && !this.s1 && (this.r0 == null || this.O2 == -1);
            if (z11 && this.f1 != 0) {
                z11 = (!org.telegram.messenger.t3.T(this.E2) || this.E2.megagroup || (chatFull = this.u2) == null || chatFull.linked_chat_id == 0 || (this.D3 == -1 && this.E3 == -1)) ? false : true;
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
                        int i3 = 3;
                        if (z11) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.ALPHA, 0.0f));
                        }
                        this.w.setDuration(150L);
                        this.w.addListener(new uu0(this, i3));
                        this.w.start();
                    } else {
                        this.s.setScaleX(z11 ? 1.0f : 0.2f);
                        this.s.setScaleY(z11 ? 1.0f : 0.2f);
                        this.s.setAlpha(z11 ? 1.0f : 0.0f);
                    }
                }
            }
        }
        tu0 tu0Var = this.v0;
        if (tu0Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
            int i10 = this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0;
            tu0Var.j0 = measuredWidth;
            tu0Var.l0 = z11;
            tu0Var.k0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10;
            tu0Var.invalidate();
        }
        ci.z0 z0Var = this.w0;
        if (z0Var != null) {
            z0Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0) + this.Q1 + this.T1);
        }
    }

    public final void P3() {
        mv0 mv0Var = this.O;
        if (mv0Var != null) {
            mv0Var.setPagesVisibleOverscanTop((this.S5 || this.R5 > 0.0f) ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0);
        }
    }

    public final void P4(String str, org.telegram.ui.Cells.g gVar) {
        if (str.startsWith("@")) {
            getMessagesController().y3(str.substring(1), this, 0, gVar);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            uw uwVar = new uw(null);
            uwVar.o2 = str;
            presentFragment(uwVar);
        } else {
            if (!str.startsWith("/") || this.parentLayout.getFragmentStack().size() <= 1) {
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if (d2Var instanceof wm) {
                finishFragment();
                ((wm) d2Var).a0.Z0(null, str, false, false);
            }
        }
    }

    public final void P5() {
        org.telegram.ui.Components.vp0 vp0Var;
        org.telegram.ui.Components.tq0 tq0Var;
        org.telegram.ui.Components.s70 s70Var;
        int w02;
        this.i6.clear();
        ow0 ow0Var = this.d1;
        if (ow0Var != null) {
            ow0Var.a(this.h6, true);
        }
        su0 su0Var = this.r;
        if (su0Var != null) {
            this.r.setTextColor(i0.a.f(this.k2, I3(su0Var.getTag() instanceof Integer ? org.telegram.ui.ActionBar.k6.w0(((Integer) this.r.getTag()).intValue(), this.A0) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.A0), Boolean.valueOf(this.K0[0])), -1275068417));
        }
        mw0 mw0Var = this.z6;
        if (mw0Var != null) {
            mw0Var.a(i0.a.f(this.k2, org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.b(0.18f, -0.1f, this.c1)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.D(i0.a.f(this.R5, this.h6 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y8, this.A0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            org.telegram.messenger.wo woVar = this.h6;
            kVar2.C(i0.a.f(this.R5, woVar != null ? 1090519039 : woVar != null ? 553648127 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f8, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z8, this.A0)), false);
        }
        if (this.y != null) {
            org.telegram.messenger.wo woVar2 = this.h6;
            if (woVar2 != null) {
                w02 = org.telegram.ui.ActionBar.k6.b(0.1f, org.telegram.ui.ActionBar.k6.I.q() ? -0.1f : -0.08f, i0.a.f(0.4f, woVar2.g(), this.h6.o(org.telegram.ui.ActionBar.k6.I.q()) ? this.h6.k() : this.h6.i()));
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ni, this.A0);
            }
            this.y.setColorFilter(org.telegram.messenger.g0.S0(this.R5, 1.0f, w02, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        if (this.I != null) {
            this.I.setColorFilter(org.telegram.messenger.g0.S0(this.R5, 1.0f, this.h6 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.oi, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.A0)), PorterDuff.Mode.MULTIPLY);
        }
        kk kkVar = this.f;
        if (kkVar != null) {
            kkVar.setTextColor(i0.a.f(this.k2, i0.a.f(this.R5, this.h6 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ji, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.A0)), -1));
        }
        o4.m0 m0Var = this.a1;
        if (m0Var != null && (s70Var = (org.telegram.ui.Components.s70) m0Var.e) != null) {
            s70Var.invalidate();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.h6 == null ? i0.a.f(this.S1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.dd, this.A0), -1) : -1, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.cg0 cg0Var = this.c0;
        if (cg0Var != null) {
            cg0Var.setColor(this.h6);
        }
        org.telegram.messenger.g0.d0(this.a, new vt0(this, 3));
        mv0 mv0Var = this.O;
        if (mv0Var != null && (tq0Var = mv0Var.L0) != null) {
            tq0Var.updateColors();
        }
        mv0 mv0Var2 = this.O;
        if (mv0Var2 != null && (vp0Var = mv0Var2.b0) != null) {
            vp0Var.m();
        }
        Q5();
        s5();
        tu0 tu0Var = this.v0;
        if (tu0Var != null) {
            tu0Var.f(true, true);
        }
        ci.z0 z0Var = this.w0;
        if (z0Var != null) {
            z0Var.a();
        }
    }

    @Override // org.telegram.ui.Components.ps0
    public final void Q() {
        org.telegram.ui.Components.os0 os0Var;
        mv0 mv0Var = this.O;
        if (mv0Var != null && (os0Var = this.R) != null) {
            mv0Var.setNewMediaCounts(os0Var.c);
        }
        if (this.d != null) {
            D5(false, false);
        }
        V();
        if (this.v2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void Q3() {
        int i3 = this.J1;
        float f10 = 0.0f;
        if (i3 == 1 && (!this.m5 || this.G1)) {
            this.r6 = 0.0f;
        } else if (i3 == 2 && (!this.m5 || this.G1)) {
            su0 su0Var = this.r;
            this.r6 = su0Var == null ? 0.0f : su0Var.getAlpha();
        } else if (this.e1 == org.telegram.messenger.h10.i(this.currentAccount).n) {
            this.r6 = (1.0f - this.o5) * this.k2;
        } else {
            this.r6 = this.k2 * this.o5;
        }
        boolean z10 = this.e1 == org.telegram.messenger.h10.i(this.currentAccount).n;
        if (z10 && this.q5) {
            this.p5 = org.telegram.messenger.g0.L(28.0f) * this.r6;
            su0 su0Var2 = this.r;
            if (su0Var2 != null) {
                su0Var2.setTranslationX(m4(this.v6, this.x6));
                this.Z.invalidate();
            }
        }
        if (z10) {
            if (this.q5) {
                f10 = this.k2;
            }
        } else if (this.r5) {
            f10 = this.r6;
        }
        mw0 mw0Var = this.z6;
        if (mw0Var != null) {
            mw0Var.e = 1.0f - f10;
            mw0Var.invalidateSelf();
        }
        this.u6 = f10 > 0.5f;
        H5();
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x047f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q4(float f10, float f11, int i3, View view) {
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
        int i10 = 26;
        int i11 = 4;
        String str3 = "";
        String str4 = null;
        int i12 = 1;
        int i13 = 0;
        if (i3 == this.L3 || i3 == this.V2) {
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
            K = org.telegram.messenger.l10.n(a22);
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
                    bv0 bv0Var = new bv0(this, getParentActivity(), sb2, sb2);
                    showDialog(bv0Var);
                    if (b10 != null && !b10.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername.username = b10.username;
                        tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo, new co0(this, b10, bv0Var, i11)), getClassGuid());
                        return true;
                    }
                } else if (!Z3(i3, view3)) {
                    if (b10 != null && !b10.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo2 = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername2 = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername2.username = b10.username;
                        tL_getCollectibleInfo2.collectible = tL_inputCollectibleUsername2;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo2, new xy(i10, this, b10)), getClassGuid());
                        return true;
                    }
                    try {
                        org.telegram.ui.Components.fc.a0(this).i(org.telegram.messenger.bd.M0(2131743675, null)).j();
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
        if (i3 != this.H3) {
            int i14 = 2;
            if (i3 == this.G3 || i3 == this.T2) {
                if (!Z3(i3, view3)) {
                    TLRPC.User a23 = getMessagesController().a2(Long.valueOf(this.e1));
                    if (a23 != null && (str = a23.phone) != null && str.length() != 0 && getParentActivity() != null) {
                        if (i3 == this.G3 && a23.phone.startsWith("888")) {
                            TL_fragment.TL_inputCollectiblePhone tL_inputCollectiblePhone = new TL_fragment.TL_inputCollectiblePhone();
                            String str5 = a23.phone;
                            tL_inputCollectiblePhone.phone = str5;
                            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo3 = new TL_fragment.TL_getCollectibleInfo();
                            tL_getCollectibleInfo3.collectible = tL_inputCollectiblePhone;
                            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo3, new co0(this, str5, a23, 5)), getClassGuid());
                            return true;
                        }
                        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(this, view3);
                        H.W(this.a.U0(view3, false));
                        H.w = false;
                        if (i3 == this.G3) {
                            TLRPC.UserFull userFull3 = this.v2;
                            if (userFull3 != null && userFull3.phone_calls_available) {
                                H.c(R.drawable.msg_calls, org.telegram.messenger.bd.M0(2131752600, null), new lt0(this, a23, i12), false);
                                if (this.v2.video_calls_available) {
                                    H.c(R.drawable.msg_videocall, org.telegram.messenger.bd.M0(2131743618, null), new lt0(this, a23, i14), false);
                                }
                            }
                            if (!this.c5) {
                                H.c(R.drawable.msg_calls_regular, org.telegram.messenger.bd.M0(2131752634, null), new lt0(this, a23, 3), false);
                            }
                        }
                        H.c(R.drawable.msg_copy, org.telegram.messenger.bd.M0(2131751767, null), new lt0(this, a23, i11), false);
                        if (this.c5) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131754250, null)));
                            int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                            int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                                int i15 = lastIndexOf - 1;
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), indexOf, i15, 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.I6, this.A0), indexOf, i15, 33);
                            }
                            H.k();
                            H.p(13, org.telegram.messenger.g0.L(200.0f), spannableStringBuilder);
                            if (H.z() instanceof TextView) {
                                TextView textView = (TextView) H.z();
                                int i16 = org.telegram.ui.ActionBar.k6.I5;
                                org.telegram.ui.ActionBar.r6.R(textView, org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i16, this.A0), 0, 6), null, org.telegram.ui.ActionBar.r6.N(i16), this.A0);
                                textView.setOnClickListener(new ai.t(i10));
                            }
                        }
                        H.Z();
                        return true;
                    }
                }
                return true;
            }
            if (i3 == this.K3 || i3 == this.J3 || i3 == this.I3 || i3 == this.W2) {
                if (i3 != this.W2 || ((userFull = this.v2) != null && !TextUtils.isEmpty(userFull.about))) {
                    if (!Z3(i3, view3)) {
                        if (view3 instanceof org.telegram.ui.Cells.j) {
                            org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view3;
                            if (jVar.c0 && jVar.W <= 0.0f) {
                                jVar.h();
                                return false;
                            }
                        }
                        if (i3 == this.I3) {
                            TLRPC.ChatFull chatFull = this.u2;
                            if (chatFull != null) {
                                TLRPC.ChannelLocation channelLocation = chatFull.location;
                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                    str4 = ((TLRPC.TL_channelLocation) channelLocation).address;
                                }
                            }
                        } else if (i3 == this.K3) {
                            TLRPC.ChatFull chatFull2 = this.u2;
                            if (chatFull2 != null) {
                                str4 = chatFull2.about;
                            }
                        } else {
                            TLRPC.UserFull userFull4 = this.v2;
                            if (userFull4 != null) {
                                str4 = userFull4.about;
                            }
                        }
                        String str6 = str4;
                        if (!TextUtils.isEmpty(str6)) {
                            String[] strArr = {"und"};
                            boolean s6 = org.telegram.messenger.hp.s1(this.currentAccount).s7.s();
                            boolean[] zArr = {i3 == this.W2 || i3 == this.K3 || i3 == this.J3};
                            String M03 = org.telegram.ui.Components.f21.M0();
                            ai.d3 d3Var = new ai.d3(this, view3, str6, i3, zArr, strArr, M03);
                            if (zArr[0]) {
                                org.telegram.messenger.b6.d(str6, new org.telegram.ui.Components.md(this, strArr, zArr, M03, s6, d3Var), new ci0(d3Var, 12), false);
                                return true;
                            }
                            d3Var.run();
                            return true;
                        }
                    }
                    return true;
                }
            } else if ((i3 == this.O3 || i3 == this.P3) && getParentActivity() != null && (userFull2 = this.v2) != null) {
                if (i3 != this.O3) {
                    if (i3 == this.P3 && !Z3(i3, view3)) {
                        TLRPC.TL_businessLocation tL_businessLocation = this.v2.business_location;
                        if (tL_businessLocation != null) {
                            str2 = tL_businessLocation.address;
                            String str7 = str2;
                            AtomicReference atomicReference = new AtomicReference();
                            org.telegram.ui.Components.vn vnVar = new org.telegram.ui.Components.vn(R.drawable.popup_fixed_alert, i13, 1, getParentActivity(), this.A0);
                            vnVar.V = new Path();
                            vnVar.setFitItems(true);
                            org.telegram.ui.ActionBar.q0.c(false, false, vnVar, R.drawable.msg_copy, org.telegram.messenger.bd.M0(2131751767, null), false, this.A0).setOnClickListener(new ei.t5(this, atomicReference, str7, i3, 5));
                            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(vnVar, -2, -2);
                            f1Var.e = true;
                            f1Var.c = org.telegram.messenger.hs.x3;
                            f1Var.setOutsideTouchable(true);
                            f1Var.setClippingEnabled(true);
                            f1Var.setAnimationStyle(R.style.PopupContextAnimation);
                            f1Var.setFocusable(true);
                            vnVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                            f1Var.setInputMethodMode(2);
                            f1Var.getContentView().setFocusableInTouchMode(true);
                            atomicReference.set(f1Var);
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
                            f1Var.showAtLocation(getFragmentView(), 0, (int) (f12 - (vnVar.getMeasuredWidth() / 2.0f)), (int) f13);
                            f1Var.b();
                            return true;
                        }
                    }
                    return true;
                }
                TL_account.TL_businessWorkHours tL_businessWorkHours = userFull2.business_work_hours;
                if (tL_businessWorkHours != null) {
                    str2 = lg.d1.k0(this.currentAccount, userFull2.user, tL_businessWorkHours);
                    String str72 = str2;
                    AtomicReference atomicReference2 = new AtomicReference();
                    org.telegram.ui.Components.vn vnVar2 = new org.telegram.ui.Components.vn(R.drawable.popup_fixed_alert, i13, 1, getParentActivity(), this.A0);
                    vnVar2.V = new Path();
                    vnVar2.setFitItems(true);
                    org.telegram.ui.ActionBar.q0.c(false, false, vnVar2, R.drawable.msg_copy, org.telegram.messenger.bd.M0(2131751767, null), false, this.A0).setOnClickListener(new ei.t5(this, atomicReference2, str72, i3, 5));
                    org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(vnVar2, -2, -2);
                    f1Var2.e = true;
                    f1Var2.c = org.telegram.messenger.hs.x3;
                    f1Var2.setOutsideTouchable(true);
                    f1Var2.setClippingEnabled(true);
                    f1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                    f1Var2.setFocusable(true);
                    vnVar2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                    f1Var2.setInputMethodMode(2);
                    f1Var2.getContentView().setFocusableInTouchMode(true);
                    atomicReference2.set(f1Var2);
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
                    f1Var2.showAtLocation(getFragmentView(), 0, (int) (f12 - (vnVar2.getMeasuredWidth() / 2.0f)), (int) f13);
                    f1Var2.b();
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
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.li, this.A0);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.mi, this.A0);
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ki, this.A0);
            if (this.h6 != null && org.telegram.ui.ActionBar.k6.e1(w02)) {
                w02 = org.telegram.ui.ActionBar.k6.b(0.05f, -0.04f, this.h6.c(false));
                org.telegram.messenger.wo woVar = this.h6;
                if (woVar != null) {
                    int d = woVar.d(org.telegram.ui.ActionBar.k6.I.q());
                    w03 = org.telegram.ui.ActionBar.k6.D(org.telegram.ui.ActionBar.k6.I.q(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, this.A0), d, w03, d);
                }
                w04 = -1;
            }
            org.telegram.ui.Components.fh0 fh0Var = this.p6;
            org.telegram.ui.Components.fh0 fh0Var2 = this.s;
            int[] iArr = this.q6;
            if (fh0Var == fh0Var2 && iArr[0] == w02 && iArr[1] == w03 && iArr[2] == w04) {
                return;
            }
            this.p6 = fh0Var2;
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
        org.telegram.ui.Components.ku0 ku0Var = this.T;
        if (ku0Var != null) {
            ku0Var.setVisibility(!this.S5 && this.Y5);
        }
    }

    public final void R4() {
        ValueAnimator valueAnimator;
        if (!this.p2 || (valueAnimator = this.j2) == null || !valueAnimator.isRunning()) {
            S4(L3(), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0));
        } else {
            this.e2 = this.b6;
            this.g2 = this.c6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x03de, code lost:
    
        if (org.telegram.messenger.t3.q0(r1, org.telegram.messenger.hp.s1(r1).q7.f(r2.id, r13)) != false) goto L171;
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
        int i3;
        org.telegram.ui.Components.gf0 gf0Var;
        boolean z25;
        boolean z26;
        boolean z27;
        long j10;
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
                    T3(context);
                }
                if (org.telegram.messenger.t3.T(M0)) {
                    if (this.q1) {
                        int i10 = this.currentAccount;
                        long j11 = this.g1;
                        if (!org.telegram.messenger.t3.y(15, M0)) {
                            if (M0 != null && M0.forum) {
                            }
                        }
                        this.O0 = true;
                    } else if (org.telegram.messenger.t3.N(M0) || (M0.megagroup && org.telegram.messenger.t3.w(1, M0))) {
                        this.O0 = true;
                    }
                    if (this.u2 != null) {
                        if (org.telegram.messenger.t3.w(14, M0) && this.u2.call == null) {
                            this.T0.e(15, R.drawable.msg_voicechat, (!M0.megagroup || M0.gigagroup) ? org.telegram.messenger.bd.M0(2131744914, null) : org.telegram.messenger.bd.M0(2131744912, null));
                            this.p1 = true;
                            if (!M0.megagroup || M0.gigagroup) {
                                z24 = false;
                                z21 = true;
                                chatFull2 = this.u2;
                                if ((!chatFull2.can_view_stats || chatFull2.can_view_revenue || chatFull2.can_view_stars_revenue || getMessagesController().P1().j(a())) && this.g1 == 0) {
                                    this.T0.e(19, R.drawable.msg_stats, org.telegram.messenger.bd.M0(2131744902, null));
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
                        chatFull2 = this.u2;
                        if (!chatFull2.can_view_stats) {
                        }
                        this.T0.e(19, R.drawable.msg_stats, org.telegram.messenger.bd.M0(2131744902, null));
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
                            this.T0.e(39, R.drawable.msg_archive, org.telegram.messenger.bd.M0(2131747818, null));
                        }
                        z22 = false;
                    } else {
                        this.T0.e(39, R.drawable.msg_archive, org.telegram.messenger.bd.M0(2131747818, null));
                        z22 = true;
                    }
                    if (!M0.megagroup) {
                        if (org.telegram.messenger.t3.t0(M0)) {
                            this.T0.e(10, R.drawable.msg_share, org.telegram.messenger.bd.M0(2131752982, null));
                            z12 = !M0.creator;
                        } else {
                            z12 = false;
                        }
                        boolean z29 = org.telegram.messenger.r2.a;
                        if (getMessagesController().h7) {
                            z23 = false;
                        } else {
                            ci.e9.y(this.currentAccount, false).U();
                            this.T0.e(38, R.drawable.msg_gift_premium, org.telegram.messenger.bd.M0(2131746644, null));
                            org.telegram.ui.ActionBar.f5 f5Var = this.T0;
                            TLRPC.ChatFull chatFull3 = this.u2;
                            f5Var.Q(38, chatFull3 != null && chatFull3.stargifts_available);
                            z23 = true;
                        }
                        TLRPC.ChatFull chatFull4 = this.u2;
                        if (chatFull4 == null || chatFull4.linked_chat_id == 0) {
                            z15 = false;
                        } else {
                            this.T0.e(22, R.drawable.msg_discussion, org.telegram.messenger.bd.M0(2131743565, null));
                            z15 = true;
                        }
                        if (this.g1 == 0) {
                            this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.bd.M0(2131754390, null));
                        }
                        TLRPC.Chat chat = this.E2;
                        if (chat.creator) {
                            this.T0.a(-1);
                            this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.bd.M0(2131749012, null));
                            this.T0.e(45, R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131752422, null)).c(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                        } else if (chat.left || chat.kicked) {
                            z17 = z23;
                            z16 = z21;
                            z13 = z22;
                            z28 = false;
                            z14 = z20;
                        } else {
                            this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.bd.M0(2131749012, null));
                        }
                        z17 = z23;
                        z16 = z21;
                        z13 = z22;
                        z28 = false;
                        z14 = z20;
                        z11 = true;
                        if (this.r0 == null) {
                        }
                        if (u4()) {
                        }
                        if (this.e1 != 0) {
                            org.telegram.ui.ActionBar.y0 e10 = this.T0.e(24, R.drawable.msg_report, org.telegram.messenger.bd.M0(2131746241, null));
                            int i11 = org.telegram.ui.ActionBar.k6.p7;
                            e10.c(i11, i11);
                        }
                        if (z28) {
                            this.T0.e(31, R.drawable.msg_leave, org.telegram.messenger.bd.M0(2131748751, null));
                        }
                        if (!this.p2) {
                        }
                        this.L0 = this.M0;
                        gf0Var = this.a0;
                        if (gf0Var == null) {
                        }
                        B5(z10);
                        L5(z25);
                    }
                    TLRPC.ChatFull chatFull5 = this.u2;
                    if (chatFull5 == null || !chatFull5.participants_hidden || org.telegram.messenger.t3.N(M0)) {
                        this.A1 = true;
                        this.T0.e(17, R.drawable.msg_search, org.telegram.messenger.bd.M0(2131745767, null));
                    }
                    if (this.q1) {
                        int i12 = this.currentAccount;
                        long j12 = this.g1;
                        if (j12 != 1 && org.telegram.messenger.t3.e(i12, M0, org.telegram.messenger.hp.s1(i12).q7.f(M0.id, j12))) {
                            this.T0.e(23, R.drawable.msg_delete, org.telegram.messenger.bd.K0(1, "DeleteTopics"));
                        }
                    }
                    if (this.g1 == 0) {
                        this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.bd.M0(2131754390, null));
                    }
                    if (M0.creator) {
                        this.T0.a(-1);
                        this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.bd.M0(2131748999, null));
                        this.T0.e(45, R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131751531, null)).c(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                    } else if (M0.left || M0.kicked || this.q1) {
                        z16 = z21;
                        z13 = z22;
                        z12 = false;
                        z28 = false;
                        z15 = false;
                        z17 = false;
                        z14 = z20;
                    } else {
                        this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.bd.M0(2131748999, null));
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
                        this.T0.e(33, R.drawable.msg_openprofile, org.telegram.messenger.bd.M0(2131745552, null));
                        i3 = 21;
                        this.T0.e(21, R.drawable.msg_gallery, org.telegram.messenger.bd.M0(2131745939, null));
                        this.T0.e(35, R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131751599, null));
                    } else {
                        i3 = 21;
                        this.T0.e(21, R.drawable.msg_gallery, org.telegram.messenger.bd.M0(2131745939, null));
                    }
                    if (u4()) {
                        this.T0.t(i3);
                    }
                    if (this.e1 != 0 && !this.r2 && !this.s1) {
                        org.telegram.ui.ActionBar.y0 e102 = this.T0.e(24, R.drawable.msg_report, org.telegram.messenger.bd.M0(2131746241, null));
                        int i112 = org.telegram.ui.ActionBar.k6.p7;
                        e102.c(i112, i112);
                    }
                    if (z28 && !this.s1) {
                        this.T0.e(31, R.drawable.msg_leave, org.telegram.messenger.bd.M0(2131748751, null));
                    }
                    if (!this.p2) {
                        this.T0.t(21);
                        this.T0.t(33);
                        this.T0.S(36);
                        this.T0.t(34);
                        this.T0.t(35);
                    }
                    this.L0 = this.M0;
                    gf0Var = this.a0;
                    if (gf0Var == null) {
                        gf0Var.G = true;
                        gf0Var.o(4, z12);
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
                        org.telegram.ui.Components.gf0 gf0Var2 = this.a0;
                        if (gf0Var2.G) {
                            gf0Var2.G = z25;
                            gf0Var2.d();
                        }
                    } else {
                        z25 = false;
                    }
                    B5(z10);
                    L5(z25);
                }
                if (this.u2 != null) {
                    if (org.telegram.messenger.t3.w(14, M0) && this.u2.call == null) {
                        this.T0.e(15, R.drawable.msg_voicechat, org.telegram.messenger.bd.M0(2131744912, null));
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
                        if (!org.telegram.messenger.t3.k0(M0) && !org.telegram.messenger.t3.l0(M0) && ((chatFull = this.u2) == null || !chatFull.participants_hidden || org.telegram.messenger.t3.N(M0))) {
                            this.A1 = true;
                            this.T0.e(17, R.drawable.msg_search, org.telegram.messenger.bd.M0(2131745767, null));
                        }
                        if (this.g1 == 0) {
                            this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.bd.M0(2131754390, null));
                        }
                        this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.bd.M0(2131751574, null));
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
                    this.T0.e(17, R.drawable.msg_search, org.telegram.messenger.bd.M0(2131745767, null));
                }
                if (this.g1 == 0) {
                }
                this.T0.e(7, R.drawable.msg_leave, org.telegram.messenger.bd.M0(2131751574, null));
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
            if (u4()) {
            }
            if (this.e1 != 0) {
            }
            if (z28) {
            }
            if (!this.p2) {
            }
            this.L0 = this.M0;
            gf0Var = this.a0;
            if (gf0Var == null) {
            }
            B5(z10);
            L5(z25);
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
        if (a22 == null) {
            return;
        }
        if (org.telegram.messenger.l10.B(a22)) {
            if (this.s1) {
                org.telegram.ui.Components.gf0 gf0Var3 = this.a0;
                if (gf0Var3 != null) {
                    this.O0 = !(gf0Var3.F == 6);
                } else {
                    this.O0 = true;
                }
            }
            if (!this.J0) {
                this.T0.e(30, R.drawable.msg_edit, org.telegram.messenger.bd.M0(2131751279, null));
                if (this.r0 != null) {
                    this.T0.e(36, R.drawable.msg_addphoto, org.telegram.messenger.bd.M0(2131754392, null));
                }
            }
            this.V0 = this.T0.e(40, R.drawable.menu_profile_colors, org.telegram.messenger.bd.M0(2131746688, null));
            r5();
            if (this.s1) {
                this.X0 = this.T0.e(43, R.drawable.menu_username_change, org.telegram.messenger.bd.M0(2131746628, null));
                this.W0 = this.T0.e(42, R.drawable.msg_link2, org.telegram.messenger.bd.M0(2131746687, null));
                C5();
            }
            z26 = false;
            z27 = false;
        } else {
            if (a22.bot && a22.bot_can_edit) {
                this.O0 = true;
            }
            TLRPC.UserFull userFull = this.v2;
            if (userFull != null && userFull.phone_calls_available) {
                this.M0 = true;
                this.N0 = userFull.video_calls_available;
            }
            if (!this.r2 && getContactsController().g0.get(Long.valueOf(this.e1)) != null) {
                if (this.D2 == null) {
                    T3(context);
                }
                if (!TextUtils.isEmpty(a22.phone)) {
                    this.T0.e(3, R.drawable.msg_share, org.telegram.messenger.bd.M0(2131745471, null));
                }
                this.T0.e(2, R.drawable.msg_block, !this.k1 ? org.telegram.messenger.bd.M0(2131753693, null) : org.telegram.messenger.bd.M0(2131743921, null));
                this.T0.e(4, R.drawable.msg_edit, org.telegram.messenger.bd.M0(2131751283, null));
                this.T0.e(5, R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131751553, null));
            } else if (org.telegram.messenger.hp.F2(a22)) {
                if (this.k1) {
                    this.T0.e(2, R.drawable.msg_block, org.telegram.messenger.bd.M0(2131743921, null));
                }
                this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.bd.M0(2131754390, null));
            } else if (a() != 489000) {
                if (this.D2 == null) {
                    T3(context);
                }
                this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.bd.M0(2131754390, null));
                if (this.r2) {
                    this.T0.e(10, R.drawable.msg_share, org.telegram.messenger.bd.M0(2131752982, null));
                    z26 = true;
                } else {
                    this.T0.e(1, R.drawable.msg_addcontact, org.telegram.messenger.bd.M0(2131754453, null));
                    z26 = false;
                }
                if (!TextUtils.isEmpty(a22.phone)) {
                    this.T0.e(3, R.drawable.msg_share, org.telegram.messenger.bd.M0(2131745471, null));
                }
                if (this.r2) {
                    this.T0.e(44, R.drawable.menu_privacy_policy, org.telegram.messenger.bd.M0(2131753010, null));
                    if (s4()) {
                        this.T0.S(44);
                    } else {
                        this.T0.t(44);
                    }
                    org.telegram.ui.ActionBar.y0 e11 = this.T0.e(24, R.drawable.msg_report, org.telegram.messenger.bd.M0(2131746241, null));
                    int i13 = org.telegram.ui.ActionBar.k6.p7;
                    e11.c(i13, i13);
                    if (this.k1) {
                        this.T0.e(2, R.drawable.msg_retry, org.telegram.messenger.bd.M0(2131752995, null));
                    } else {
                        this.T0.e(2, R.drawable.msg_block2, org.telegram.messenger.bd.M0(2131751575, null)).c(i13, i13);
                    }
                } else {
                    this.T0.e(2, R.drawable.msg_block, !this.k1 ? org.telegram.messenger.bd.M0(2131753693, null) : org.telegram.messenger.bd.M0(2131743921, null));
                }
                if (!org.telegram.messenger.l10.x(a22) && !this.r2 && this.D2 == null && !this.k1) {
                    j10 = this.e1;
                    if (j10 != 333000 && j10 != 777000 && j10 != 42777) {
                        boolean z30 = org.telegram.messenger.r2.a;
                        if (!a22.self || a22.bot || org.telegram.messenger.hp.F2(a22) || getMessagesController().h7) {
                            z27 = false;
                        } else {
                            ci.e9.y(this.currentAccount, false).U();
                            this.T0.e(38, R.drawable.msg_gift_premium, org.telegram.messenger.bd.M0(2131746645, null));
                            z27 = true;
                        }
                        if (((org.telegram.messenger.h0) getMessagesController().x7.j0.b).c && !org.telegram.messenger.hp.F2(a22) && !org.telegram.messenger.l10.A(a22.id)) {
                            this.T0.e(48, R.drawable.ic_gram, org.telegram.messenger.bd.M0(2131743027, null));
                        }
                        this.T0.e(20, R.drawable.msg_secret, org.telegram.messenger.bd.M0(2131744922, null));
                        org.telegram.ui.ActionBar.f5 f5Var2 = this.T0;
                        TL_account.RequirementToContact J2 = getMessagesController().J2(this.e1);
                        f5Var2.Q(20, J2 != null || (J2 instanceof TL_account.requirementToContactEmpty));
                        if (this.v2 != null) {
                            this.T0.e(46, R.drawable.menu_share_off_24, org.telegram.messenger.bd.M0(2131751429, null));
                            this.T0.e(47, R.drawable.menu_share_on_24, org.telegram.messenger.bd.M0(2131751151, null));
                            TLRPC.UserFull userFull2 = this.v2;
                            boolean z31 = (userFull2.noforwards_my_enabled || userFull2.noforwards_peer_enabled) ? false : true;
                            this.T0.Q(46, z31);
                            this.T0.Q(47, !z31);
                        }
                        if (!this.r2 && getContactsController().g0.get(Long.valueOf(this.e1)) != null) {
                            this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.bd.M0(2131754390, null));
                        }
                        z28 = false;
                    }
                }
                z27 = false;
                if (!this.r2) {
                    this.T0.e(14, R.drawable.msg_home, org.telegram.messenger.bd.M0(2131754390, null));
                }
                z28 = false;
            }
            z26 = false;
            if (!org.telegram.messenger.l10.x(a22)) {
                j10 = this.e1;
                if (j10 != 333000) {
                    boolean z302 = org.telegram.messenger.r2.a;
                    if (a22.self) {
                    }
                    z27 = false;
                    if (((org.telegram.messenger.h0) getMessagesController().x7.j0.b).c) {
                        this.T0.e(48, R.drawable.ic_gram, org.telegram.messenger.bd.M0(2131743027, null));
                    }
                    this.T0.e(20, R.drawable.msg_secret, org.telegram.messenger.bd.M0(2131744922, null));
                    org.telegram.ui.ActionBar.f5 f5Var22 = this.T0;
                    TL_account.RequirementToContact J22 = getMessagesController().J2(this.e1);
                    f5Var22.Q(20, J22 != null || (J22 instanceof TL_account.requirementToContactEmpty));
                    if (this.v2 != null) {
                    }
                    if (!this.r2) {
                    }
                    z28 = false;
                }
            }
            z27 = false;
            if (!this.r2) {
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
        if (u4()) {
        }
        if (this.e1 != 0) {
        }
        if (z28) {
        }
        if (!this.p2) {
        }
        this.L0 = this.M0;
        gf0Var = this.a0;
        if (gf0Var == null) {
        }
        B5(z10);
        L5(z25);
    }

    public final void S4(float f10, float f11) {
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - j4()) / ((this.a.getMeasuredWidth() - f11) - k4())));
        float N = ((org.telegram.messenger.g0.N(8.0f) + (org.telegram.messenger.g0.L(42.0f) * ((this.Q1 >= ((float) j4()) || max >= 0.33f) ? org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) : com.google.android.recaptcha.internal.a.x(f10, 72.0f, 24.0f, 42.0f)))) * f10) + ((float) Math.floor(this.actionBar.getTranslationY() + (org.telegram.messenger.camera.q.b(f10, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0) - (org.telegram.messenger.g0.p * 21.0f))));
        this.e2 = (org.telegram.messenger.g0.L(7.0f) * f10) + org.telegram.messenger.g0.L(1.3f) + N;
        this.g2 = (((float) Math.floor(org.telegram.messenger.g0.p * 11.0f)) * f10) + N + org.telegram.messenger.g0.L(24.0f);
    }

    public final void T3(Context context) {
        this.a1 = new o4.m0(context, this.T0.getPopupLayout().getSwipeBack(), new gu0(this), false, 0, this.A0);
        if (this.i1 > 0 || this.e1 > 0) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, this.A0);
            o4.m0 m0Var = this.a1;
            org.telegram.ui.Components.s70 s70Var = (org.telegram.ui.Components.s70) m0Var.e;
            if (s70Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131753848, null));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.O2(org.telegram.messenger.bd.M0(2131753847, null), w02, new org.telegram.ui.Components.vf(m0Var, 10)));
                s70Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.v2;
        org.telegram.ui.Components.zz0 a10 = org.telegram.ui.Components.zz0.a((userFull == null && this.u2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.u2.ttl_period);
        this.t0 = a10;
        this.Z0 = this.T0.h(0, a10, org.telegram.messenger.bd.M0(2131753846, null), (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.a1.a);
        this.T0.a(-1);
        o5();
    }

    public final void T4() {
        hu0 hu0Var = this.a;
        if (hu0Var == null || this.c == null || hu0Var.getChildCount() <= 0 || this.n6) {
            return;
        }
        View view = null;
        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i10 = -1;
        for (int i11 = 0; i11 < this.a.getChildCount(); i11++) {
            int R = RecyclerView.R(this.a.getChildAt(i11));
            View childAt = this.a.getChildAt(i11);
            if (R != -1 && childAt.getTop() < i3) {
                i3 = childAt.getTop();
                i10 = R;
                view = childAt;
            }
        }
        if (view != null) {
            this.l6 = i10;
            int top = view.getTop();
            this.m6 = top;
            if (this.l6 == 0 && !this.o2 && top > j4()) {
                this.m6 = j4();
            }
            this.c.h1(i10, view.getTop() - this.a.getPaddingTop());
        }
    }

    @Override // org.telegram.ui.Components.e30
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ji.j(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final void U3() {
        if (this.fragmentView == null || !this.o6 || this.y2 == null || getParentActivity() == null) {
            return;
        }
        sw0 sw0Var = this.A6;
        if (sw0Var != null) {
            sw0Var.b(this.y2);
            this.A6.invalidate();
        } else {
            sw0 sw0Var2 = new sw0(this, this.y2);
            this.A6 = sw0Var2;
            ((FrameLayout) this.fragmentView).addView(sw0Var2, b8.mf.e(-1, -1, 55));
        }
    }

    public final void U4(boolean z10) {
        int i3 = this.K4;
        if (i3 >= 0) {
            if (!z10) {
                this.c.h1(i3, -this.a.getPaddingTop());
                return;
            }
            ni.m mVar = new ni.m(getParentActivity(), 2, 0.6f);
            mVar.a = this.K4;
            mVar.p = -this.a.getPaddingTop();
            this.c.w0(mVar);
        }
    }

    @Override // org.telegram.ui.Components.lr0
    public final void V() {
        int i3;
        int i10;
        mv0 mv0Var = this.O;
        if (mv0Var == null || this.r == null) {
            return;
        }
        int closestTab = mv0Var.getClosestTab();
        int[] iArr = this.R.c;
        if (closestTab == 0) {
            if (iArr[7] <= 0 && iArr[6] <= 0) {
                int i11 = iArr[0];
                if (i11 <= 0) {
                    f5(org.telegram.messenger.bd.M0(2131745419, null));
                    return;
                } else {
                    f5(org.telegram.messenger.bd.G(i11, "Media", new Object[0]));
                    return;
                }
            }
            if (this.O.getPhotosVideosTypeFilter() == 1 || iArr[7] <= 0) {
                f5(org.telegram.messenger.bd.G(iArr[6], "Photos", new Object[0]));
                return;
            }
            if (this.O.getPhotosVideosTypeFilter() == 2 || (i10 = iArr[6]) <= 0) {
                f5(org.telegram.messenger.bd.G(iArr[7], "Videos", new Object[0]));
                return;
            }
            f5(org.telegram.messenger.bd.G(i10, "Photos", new Object[0]) + ", " + org.telegram.messenger.bd.G(iArr[7], "Videos", new Object[0]));
            return;
        }
        if (closestTab == 1) {
            int i12 = iArr[1];
            if (i12 <= 0) {
                f5(org.telegram.messenger.bd.M0(2131750827, null));
                return;
            } else {
                f5(org.telegram.messenger.bd.G(i12, "Files", new Object[0]));
                return;
            }
        }
        if (closestTab == 2) {
            int i13 = iArr[2];
            if (i13 <= 0) {
                f5(org.telegram.messenger.bd.M0(2131743533, null));
                return;
            } else {
                f5(org.telegram.messenger.bd.G(i13, "Voice", new Object[0]));
                return;
            }
        }
        if (closestTab == 3) {
            int i14 = iArr[3];
            if (i14 <= 0) {
                f5(org.telegram.messenger.bd.M0(2131745421, null));
                return;
            } else {
                f5(org.telegram.messenger.bd.G(i14, "Links", new Object[0]));
                return;
            }
        }
        if (closestTab == 4) {
            int i15 = iArr[4];
            if (i15 <= 0) {
                f5(org.telegram.messenger.bd.M0(2131748327, null));
                return;
            } else {
                f5(org.telegram.messenger.bd.G(i15, "MusicFiles", new Object[0]));
                return;
            }
        }
        if (closestTab == 5) {
            int i16 = iArr[5];
            if (i16 <= 0) {
                f5(org.telegram.messenger.bd.M0(2131754879, null));
                return;
            } else {
                f5(org.telegram.messenger.bd.G(i16, "GIFs", new Object[0]));
                return;
            }
        }
        if (closestTab == 6) {
            f5(org.telegram.messenger.bd.G(this.v2.common_chats_count, "CommonGroups", new Object[0]));
            return;
        }
        if (closestTab == 7) {
            f5(this.r.getText());
            return;
        }
        if (closestTab == 8 || org.telegram.ui.Components.ws0.I0(closestTab)) {
            if (this.r2) {
                f5(this.O.f0(false));
                return;
            } else if (this.O.m0(closestTab) > 0) {
                f5(org.telegram.messenger.bd.G(this.O.m0(closestTab), "ProfileStoriesCount", new Object[0]));
                return;
            } else {
                f5(org.telegram.messenger.bd.M0(2131746633, null));
                return;
            }
        }
        if (closestTab == 13) {
            f5(this.O.f0(true));
            return;
        }
        if (closestTab == 9) {
            f5(org.telegram.messenger.bd.G(this.O.m0(closestTab), "ProfileStoriesArchiveCount", new Object[0]));
            return;
        }
        if (closestTab == 10) {
            org.telegram.messenger.io L0 = org.telegram.messenger.hp.s1(this.currentAccount).L0(a());
            f5(org.telegram.messenger.bd.G(L0 == null ? 0 : L0.b.size() + L0.c, this.r2 ? "Bots" : "Channels", new Object[0]));
            return;
        }
        if (closestTab != 12) {
            if (closestTab == 14) {
                org.telegram.ui.Components.vp0 vp0Var = this.O.b0;
                f5(org.telegram.messenger.bd.H(',', "ProfileGiftsCount", vp0Var != null ? vp0Var.getGiftsCount() : 0));
                return;
            } else {
                if (closestTab == 15) {
                    int i17 = iArr[8];
                    if (i17 <= 0) {
                        f5(org.telegram.messenger.bd.M0(2131745413, null));
                        return;
                    } else {
                        f5(org.telegram.messenger.bd.H(',', "ProfilePollsCount", i17));
                        return;
                    }
                }
                return;
            }
        }
        org.telegram.messenger.nv G1 = getMessagesController().G1();
        long a10 = a();
        ArrayList arrayList = G1.j;
        int i18 = 0;
        while (true) {
            if (i18 >= arrayList.size()) {
                i3 = 0;
                break;
            }
            org.telegram.messenger.mv mvVar = (org.telegram.messenger.mv) arrayList.get(i18);
            if (mvVar.a == a10) {
                i3 = mvVar.e;
                break;
            }
            i18++;
        }
        f5(org.telegram.messenger.bd.G(Math.max(1, i3), "SavedMessagesCount", new Object[0]));
    }

    public final void V3(Context context) {
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            org.telegram.messenger.g0.E2(y4Var);
        }
        dv0 dv0Var = new dv0(this, context, this.A0);
        this.simpleActionBar = dv0Var;
        dv0Var.setTitlesAlpha(0.0f);
        if (!this.m5 && !this.J0 && this.J1 != 0 && this.M1 && !this.N1) {
            this.simpleActionBar.setAlpha(0.0f);
        }
        this.simpleActionBar.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        int i3 = 3;
        this.simpleActionBar.setMenuOverlayProvider(new me(i3, this));
        if (this.J0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.outline_header_qr_24);
            this.simpleActionBar.setBackButtonContentDescription(org.telegram.messenger.bd.M0(2131746508, null));
        } else {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, i3));
        if (this.J0) {
            return;
        }
        View backButton = this.simpleActionBar.getBackButton();
        backButton.setOnLongClickListener(new ei.j2(6, this, backButton));
    }

    public final void W4() {
        org.telegram.ui.Components.gf0 gf0Var = this.a0;
        if (gf0Var == null) {
            return;
        }
        if (this.s1) {
            gf0Var.F = 6;
            return;
        }
        if (this.q1) {
            gf0Var.F = 5;
            return;
        }
        if (this.r2) {
            gf0Var.F = 2;
            return;
        }
        if (this.e1 != 0) {
            gf0Var.F = 0;
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

    @Override // org.telegram.ui.Components.lr0
    public final boolean X() {
        return this.A1;
    }

    public final void X3(float f10) {
        ValueAnimator ofFloat;
        int i3 = 0;
        boolean z10 = f10 > 0.0f;
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.k6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.k6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.y0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new st0(this, i3));
        this.k6.playTogether(arrayList);
        this.k6.setDuration(z10 ? 150L : 220L);
        if (!z10) {
            this.k6.addListener(new uu0(this, 6));
        }
        this.k6.start();
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
        boolean z10;
        mw0 mw0Var;
        int i3;
        int f11;
        ci.z0 z0Var;
        ow0 ow0Var;
        if (this.actionBar == null) {
            return;
        }
        this.glassEngine.g();
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        this.l2 = f10;
        float U1 = org.telegram.messenger.g0.U1(f10, this.m2);
        this.k2 = U1;
        Q3();
        this.Y.setScaleX(this.b2);
        this.Y.setScaleY(this.b2);
        this.Y.setTranslationY(org.telegram.messenger.g0.T1((float) Math.ceil(this.a2), 0.0f, U1));
        this.f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(q4(), 0.0f, U1));
        qu0 qu0Var = this.f0;
        float f12 = this.b2;
        boolean z11 = this.p2;
        qu0Var.I = U1;
        qu0Var.J = f12;
        qu0Var.H = z11;
        tu0 tu0Var = this.v0;
        if (tu0Var != null) {
            tu0Var.setExpandProgress(U1);
        }
        ci.z0 z0Var2 = this.w0;
        if (z0Var2 != null) {
            z0Var2.setExpandProgress(U1);
        }
        org.telegram.ui.Components.ku0 ku0Var = this.T;
        if (ku0Var != null) {
            ku0Var.setParentExpanded(U1);
        }
        org.telegram.ui.Components.gf0 gf0Var = this.a0;
        if (gf0Var != null) {
            gf0Var.setParentExpanded(U1);
        }
        Z4(U1);
        org.telegram.ui.Components.cg0 cg0Var = this.c0;
        if (cg0Var != null) {
            cg0Var.setParentExpanded(U1);
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.U0;
        if (f5Var != null) {
            float f13 = 1.0f - U1;
            f5Var.setAlpha(f13);
            this.U0.setScaleY(f13);
            this.U0.setVisibility(0);
            org.telegram.ui.ActionBar.f5 f5Var2 = this.U0;
            f5Var2.setClickable(f5Var2.getAlpha() > 0.5f);
        }
        float L3 = L3();
        if (L3 >= 1.0f) {
            this.f0.setAlpha(1.0f);
        }
        if (!this.p2) {
            S4(L3, currentActionBarHeight);
        } else if (this.Q1 >= k4() && this.h2 < 0.33f) {
            R4();
        }
        org.telegram.ui.Components.kk0 kk0Var = this.L;
        if (kk0Var != null) {
            kk0Var.b(i0.a.f(U1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, this.A0), Color.argb(org.telegram.messenger.hs.J2, org.telegram.messenger.hs.e4, org.telegram.messenger.hs.e4, org.telegram.messenger.hs.e4)));
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.h6 != null ? -1 : i0.a.f(U1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.dd, this.A0), -1), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.wq wqVar = this.J;
        if (wqVar != null) {
            wqVar.a(U1);
        }
        org.telegram.ui.Components.wq wqVar2 = this.K;
        if (wqVar2 != null) {
            wqVar2.a(U1);
        }
        t5(U1);
        float f14 = this.d2;
        float f15 = this.f2;
        float N = org.telegram.messenger.g0.N(8.0f);
        float N2 = org.telegram.messenger.g0.N(this.p2 ? 8.0f : -24.0f);
        float N3 = org.telegram.messenger.g0.N(18.0f) - ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin;
        float f16 = currentActionBarHeight;
        float e42 = (((this.Q1 + f16) - e4()) - org.telegram.messenger.g0.N(30.0f)) - this.f.getBottom();
        float z12 = com.google.android.recaptcha.internal.a.z(N3, f14, 2.0f, N + f14);
        float f17 = this.e2;
        float f18 = 1.0f - U1;
        float f19 = f18 * f18;
        float f20 = f18 * 2.0f * U1;
        float f21 = (z12 * f20) + (f14 * f19);
        float f22 = U1 * U1;
        float f23 = (N3 * f22) + f21;
        float z13 = (e42 * f22) + (com.google.android.recaptcha.internal.a.z(e42, f17, 2.0f, N2 + f17) * f20) + (f17 * f19);
        float N4 = org.telegram.messenger.g0.N(16.0f) - ((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin;
        float e43 = (((this.Q1 + f16) - e4()) - org.telegram.messenger.g0.N(10.0f)) - this.r.getBottom();
        float z14 = com.google.android.recaptcha.internal.a.z(N4, f15, 2.0f, N + f15);
        float f24 = this.g2;
        float f25 = (N4 * f22) + (z14 * f20) + (f15 * f19);
        float z15 = (f22 * e43) + (f20 * com.google.android.recaptcha.internal.a.z(e43, f24, 2.0f, N2 + f24)) + (f19 * f24);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - (org.telegram.messenger.g0.p * 21.0f)))) + org.telegram.messenger.g0.L(1.3f);
        float N5 = org.telegram.messenger.g0.N(22.7f) + floor;
        this.f.setTranslationX(f23);
        this.f.setTranslationY(Math.max(floor, z13));
        this.r.setTranslationX(m4(f25, Math.min(1.0f, L3) * this.w6));
        this.r.setTranslationY(n4(Math.max(N5, z15)));
        n5();
        E5();
        Object tag = this.r.getTag();
        if (tag instanceof Integer) {
            Integer num = (Integer) tag;
            w02 = org.telegram.ui.ActionBar.k6.w0(num.intValue(), this.A0);
            if (num.intValue() == org.telegram.ui.ActionBar.k6.pi) {
                z10 = true;
                this.r.setTextColor(i0.a.f(U1, I3(w02, Boolean.valueOf(z10)), -1275068417));
                if (this.Q1 > k4()) {
                    this.f.setPivotY(org.telegram.messenger.g0.W1(U1, 0, r5.getMeasuredHeight()));
                    float f26 = (0.12f * L3) + 1.0f;
                    this.f.setScaleX(org.telegram.messenger.g0.T1(f26, 1.38f, U1));
                    this.f.setScaleY(org.telegram.messenger.g0.T1(f26, 1.38f, U1));
                }
                z4(0, Math.min(1.0f, L3), true);
                mw0Var = this.z6;
                if (mw0Var != null) {
                    mw0Var.a(i0.a.f(this.k2, org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.b(0.18f, -0.1f, this.c1)), 603979775));
                }
                kk kkVar = this.f;
                if (this.h6 == null) {
                    f11 = -1;
                    i3 = -1;
                } else {
                    i3 = -1;
                    f11 = i0.a.f(this.k2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ji, this.A0), -1);
                }
                kkVar.setTextColor(f11);
                this.actionBar.D(this.h6 == null ? i3 : i0.a.f(U1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.A0), i3), false);
                this.actionBar.setMenuOffsetSuppressed(true);
                this.f0.setForegroundAlpha(U1);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                layoutParams.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.a.getMeasuredWidth() / this.b2, U1);
                layoutParams.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.Q1 + f16) / this.b2, U1);
                d4();
                this.Y.requestLayout();
                z0Var = this.w0;
                if (z0Var != null) {
                    z0Var.setExpandProgress(U1);
                }
                q5();
                ow0Var = this.d1;
                if (ow0Var == null && ow0Var.L) {
                    ow0Var.invalidate();
                    return;
                }
            }
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.A0);
        }
        z10 = false;
        this.r.setTextColor(i0.a.f(U1, I3(w02, Boolean.valueOf(z10)), -1275068417));
        if (this.Q1 > k4()) {
        }
        z4(0, Math.min(1.0f, L3), true);
        mw0Var = this.z6;
        if (mw0Var != null) {
        }
        kk kkVar2 = this.f;
        if (this.h6 == null) {
        }
        kkVar2.setTextColor(f11);
        this.actionBar.D(this.h6 == null ? i3 : i0.a.f(U1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.A0), i3), false);
        this.actionBar.setMenuOffsetSuppressed(true);
        this.f0.setForegroundAlpha(U1);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
        layoutParams2.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.a.getMeasuredWidth() / this.b2, U1);
        layoutParams2.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.Q1 + f16) / this.b2, U1);
        d4();
        this.Y.requestLayout();
        z0Var = this.w0;
        if (z0Var != null) {
        }
        q5();
        ow0Var = this.d1;
        if (ow0Var == null) {
        }
    }

    public final void Y3(int i3, View view) {
        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(this, view);
        H.W(this.a.U0(view, false));
        H.w = false;
        H.l(R.drawable.msg_copy, org.telegram.messenger.bd.M0(2131751767, null), new g90(this, 4), this.v2 != null);
        H.c(R.drawable.msg_edit, org.telegram.messenger.bd.M0(2131751336, null), new g90(this, 5), false);
        H.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.Components.o2(this, i3, 23), true);
        H.Z();
    }

    public final boolean Z3(final int i3, View view) {
        TLRPC.User f10;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        final int i10 = 0;
        if (this.s1 && (f10 = getUserConfig().f()) != null) {
            final TLRPC.UserFull userFull = this.v2;
            if (userFull == null) {
                userFull = getMessagesController().b2(f10.id);
            }
            if (userFull != null) {
                String M0 = org.telegram.messenger.bd.M0(2131751767, null);
                String M02 = org.telegram.messenger.bd.M0(2131744204, null);
                if (i3 == this.K3 || i3 == this.J3 || i3 == this.W2) {
                    str = userFull.about;
                    if (i3 == this.W2) {
                        M02 = org.telegram.messenger.bd.M0(2131753721, null);
                    }
                } else if (i3 == this.O3) {
                    str = lg.d1.k0(this.currentAccount, f10, userFull.business_work_hours);
                    M0 = org.telegram.messenger.bd.M0(2131746673, null);
                    M02 = org.telegram.messenger.bd.M0(2131752761, null);
                } else if (i3 == this.P3) {
                    str = userFull.business_location.address;
                    M0 = org.telegram.messenger.bd.M0(2131746668, null);
                    M02 = org.telegram.messenger.bd.M0(2131752693, null);
                } else if (i3 == this.L3) {
                    str = org.telegram.messenger.l10.n(f10);
                    if (str != null) {
                        str = "@".concat(str);
                    }
                    M0 = org.telegram.messenger.bd.M0(2131746686, null);
                    M02 = org.telegram.messenger.bd.M0(2131743675, null);
                } else if (i3 == this.G3) {
                    str = f10.phone;
                    M02 = org.telegram.messenger.bd.M0(2131747303, null);
                } else if (i3 == this.U2) {
                    str = UserInfoActivity.e0(this.v2.birthday);
                    M02 = org.telegram.messenger.bd.M0(2131753716, null);
                } else {
                    str = null;
                }
                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(this, view);
                H.W(this.a.U0(view, false));
                H.w = false;
                H.i = 3;
                if (i3 == this.P3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, org.telegram.messenger.bd.M0(2131746664, null), new g90(this, 7), false);
                    }
                    H.c(R.drawable.msg_map, org.telegram.messenger.bd.M0(2131746666, null), new g90(this, 9), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, M0, new hc0(this, str, M02, 26), false);
                }
                final int i11 = 1;
                if (i3 == this.O3) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.bd.M0(2131746672, null), new g90(this, 10), false);
                    H.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131746671, null), new Runnable(this) { // from class: org.telegram.ui.qt0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i12 = i10;
                            final int i13 = i3;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i12) {
                                case 0:
                                    RectF rectF = ProfileActivity.T6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.bd.M0(2131752762, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                    s1Var.S = M03;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131752763, null);
                                    final int i14 = 1;
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.ut0
                                        @Override // org.telegram.ui.ActionBar.p1
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i15) {
                                            int i16 = i14;
                                            int i17 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF2 = ProfileActivity.T6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new wt0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.T6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new wt0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    profileActivity.showDialog(s1Var);
                                    break;
                                default:
                                    RectF rectF2 = ProfileActivity.T6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.bd.M0(2131752694, null);
                                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                                    s1Var2.S = M04;
                                    s1Var2.U = org.telegram.messenger.bd.M0(2131752695, null);
                                    final int i15 = 0;
                                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.ut0
                                        @Override // org.telegram.ui.ActionBar.p1
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i152) {
                                            int i16 = i15;
                                            int i17 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.T6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new wt0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.T6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new wt0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    profileActivity.showDialog(s1Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i3 == this.P3) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.bd.M0(2131746667, null), new g90(this, 11), false);
                    H.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131746665, null), new Runnable(this) { // from class: org.telegram.ui.qt0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i12 = i11;
                            final int i13 = i3;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i12) {
                                case 0:
                                    RectF rectF = ProfileActivity.T6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.bd.M0(2131752762, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                    s1Var.S = M03;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131752763, null);
                                    final int i14 = 1;
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.ut0
                                        @Override // org.telegram.ui.ActionBar.p1
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i152) {
                                            int i16 = i14;
                                            int i17 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.T6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new wt0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.T6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new wt0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    profileActivity.showDialog(s1Var);
                                    break;
                                default:
                                    RectF rectF2 = ProfileActivity.T6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.bd.M0(2131752694, null);
                                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                                    s1Var2.S = M04;
                                    s1Var2.U = org.telegram.messenger.bd.M0(2131752695, null);
                                    final int i15 = 0;
                                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.ut0
                                        @Override // org.telegram.ui.ActionBar.p1
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i152) {
                                            int i16 = i15;
                                            int i17 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i16) {
                                                case 0:
                                                    RectF rectF22 = ProfileActivity.T6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new wt0(profileActivity2, 3));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF3 = ProfileActivity.T6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new wt0(profileActivity2, 1));
                                                    profileActivity2.J5();
                                                    profileActivity2.d.s(i17);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    profileActivity.showDialog(s1Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i3 == this.L3) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.bd.M0(2131746628, null), new g90(this, 12), false);
                } else if (i3 == this.K3 || i3 == this.J3 || i3 == this.W2) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.bd.M0(2131746685, null), new g90(this, 13), false);
                } else if (i3 == this.G3) {
                    H.c(R.drawable.menu_storage_path, org.telegram.messenger.bd.M0(2131746654, null), new g90(this, 14), false);
                } else if (i3 == this.U2) {
                    H.c(R.drawable.msg_edit, org.telegram.messenger.bd.M0(2131746731, null), new Runnable(this) { // from class: org.telegram.ui.ot0
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
                                    RectF rectF = ProfileActivity.T6;
                                    profileActivity.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.l(profileActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131751239, null), org.telegram.messenger.bd.M0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.ei(23, profileActivity, userFull2), new g90(profileActivity, 15), false, false, profileActivity.A0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.T6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.bd.M0(2131753717, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                    s1Var.S = M03;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131753718, null);
                                    final int i13 = 0;
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.tt0
                                        @Override // org.telegram.ui.ActionBar.p1
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i14) {
                                            int i15 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i15) {
                                                case 0:
                                                    RectF rectF3 = ProfileActivity.T6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().m2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new wt0(profileActivity2, 2));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.T6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new wt0(profileActivity2, 0));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    profileActivity.showDialog(s1Var);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.T6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.bd.M0(2131746690, null);
                                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                                    s1Var2.S = M04;
                                    s1Var2.U = org.telegram.messenger.bd.M0(2131746691, null);
                                    final int i14 = 1;
                                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.tt0
                                        @Override // org.telegram.ui.ActionBar.p1
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i142) {
                                            int i15 = i14;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i15) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.T6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().m2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new wt0(profileActivity2, 2));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.T6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new wt0(profileActivity2, 0));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    profileActivity.showDialog(s1Var2);
                                    break;
                            }
                        }
                    }, false);
                    H.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131746329, null), new Runnable(this) { // from class: org.telegram.ui.ot0
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
                                    RectF rectF = ProfileActivity.T6;
                                    profileActivity.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.l(profileActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131751239, null), org.telegram.messenger.bd.M0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.ei(23, profileActivity, userFull2), new g90(profileActivity, 15), false, false, profileActivity.A0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.T6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M03 = org.telegram.messenger.bd.M0(2131753717, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                    s1Var.S = M03;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131753718, null);
                                    final int i13 = 0;
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.tt0
                                        @Override // org.telegram.ui.ActionBar.p1
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i142) {
                                            int i15 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i15) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.T6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().m2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new wt0(profileActivity2, 2));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.T6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new wt0(profileActivity2, 0));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    profileActivity.showDialog(s1Var);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.T6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.bd.M0(2131746690, null);
                                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                                    s1Var2.S = M04;
                                    s1Var2.U = org.telegram.messenger.bd.M0(2131746691, null);
                                    final int i14 = 1;
                                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.tt0
                                        @Override // org.telegram.ui.ActionBar.p1
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i142) {
                                            int i15 = i14;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i15) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.T6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().m2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new wt0(profileActivity2, 2));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.T6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new wt0(profileActivity2, 0));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    profileActivity.showDialog(s1Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i3 == this.Q2) {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(userFull.personal_channel_id));
                    if (M03 != null && org.telegram.messenger.t3.K(M03, false) != null) {
                        H.c(R.drawable.msg_copy, org.telegram.messenger.bd.M0(2131746689, null), new hk0(22, this, M03), false);
                    }
                    H.c(R.drawable.msg_edit, org.telegram.messenger.bd.M0(2131746692, null), new g90(this, 8), false);
                    final int i12 = 2;
                    H.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131746329, null), new Runnable(this) { // from class: org.telegram.ui.ot0
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
                                    RectF rectF = ProfileActivity.T6;
                                    profileActivity.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.l(profileActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131751239, null), org.telegram.messenger.bd.M0(2131751244, null), userFull2.birthday, new org.telegram.ui.Components.ei(23, profileActivity, userFull2), new g90(profileActivity, 15), false, false, profileActivity.A0).b);
                                    break;
                                case 1:
                                    RectF rectF2 = ProfileActivity.T6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M032 = org.telegram.messenger.bd.M0(2131753717, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                    s1Var.S = M032;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131753718, null);
                                    final int i13 = 0;
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.tt0
                                        @Override // org.telegram.ui.ActionBar.p1
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i142) {
                                            int i15 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i15) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.T6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().m2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new wt0(profileActivity2, 2));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.T6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new wt0(profileActivity2, 0));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    profileActivity.showDialog(s1Var);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.T6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String M04 = org.telegram.messenger.bd.M0(2131746690, null);
                                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                                    s1Var2.S = M04;
                                    s1Var2.U = org.telegram.messenger.bd.M0(2131746691, null);
                                    final int i14 = 1;
                                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.tt0
                                        @Override // org.telegram.ui.ActionBar.p1
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i142) {
                                            int i15 = i14;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i15) {
                                                case 0:
                                                    RectF rectF32 = ProfileActivity.T6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().m2();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new wt0(profileActivity2, 2));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                                default:
                                                    RectF rectF4 = ProfileActivity.T6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new wt0(profileActivity2, 0));
                                                    profileActivity2.D5(false, false);
                                                    profileActivity2.getMessagesStorage().j2(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    profileActivity.showDialog(s1Var2);
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
        this.K5 = f10;
        org.telegram.ui.Components.kf0 kf0Var = this.J5;
        if (kf0Var != null) {
            kf0Var.b(f10);
        }
        A5();
    }

    public final long a() {
        long j10 = this.i1;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.e1;
        return j11 != 0 ? j11 : -this.f1;
    }

    public final boolean a4() {
        View view;
        if ((this.J0 || (!org.telegram.messenger.g0.Q1() && !this.n2)) && this.f0.getImageReceiver().L() && !org.telegram.messenger.g0.C1()) {
            this.G0 = true;
            this.o2 = true;
            int i3 = 0;
            while (true) {
                if (i3 >= this.a.getChildCount()) {
                    view = null;
                    break;
                }
                if (RecyclerView.R(this.a.getChildAt(i3)) == 0) {
                    view = this.a.getChildAt(i3);
                    break;
                }
                i3++;
            }
            if (view != null) {
                hu0 hu0Var = this.a;
                View F = hu0Var.F(view);
                u4.d1 T = F != null ? hu0Var.T(F) : null;
                if (T != null) {
                    Integer num = (Integer) this.Y1.get(Integer.valueOf(T.b()));
                    if (num != null) {
                        this.P1 = true;
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
        this.u2 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.m1 == 0) {
                this.m1 = -j10;
                getMediaDataController().e0(this.m1, this.classGuid, this.g1);
            }
        }
        mv0 mv0Var = this.O;
        if (mv0Var != null) {
            mv0Var.setChatInfo(this.u2);
        }
        ru0 ru0Var = this.o0;
        if (ru0Var != null && !this.q1) {
            ru0Var.setChatInfo(this.u2);
        }
        tu0 tu0Var = this.v0;
        if (tu0Var != null && (chatFull3 = this.u2) != null) {
            tu0Var.setStories(chatFull3.stories);
        }
        ci.z0 z0Var = this.w0;
        if (z0Var != null) {
            z0Var.a();
        }
        qu0 qu0Var = this.f0;
        if (qu0Var != null) {
            qu0Var.setHasStories(x4());
        }
        b4();
        if (this.f1 != 0) {
            boolean z10 = org.telegram.messenger.r2.a;
            boolean z11 = (getMessagesController().h7 || (chatFull2 = this.u2) == null || !chatFull2.stargifts_available) ? false : true;
            this.T0.Q(38, z11);
            org.telegram.ui.Components.gf0 gf0Var = this.a0;
            if (gf0Var != null) {
                gf0Var.o(3, z11);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
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
        TLRPC.Chat chat = this.E2;
        if (chat == null || !chat.megagroup) {
            return;
        }
        TLRPC.ChatFull chatFull = this.u2;
        if (!(chatFull instanceof TLRPC.TL_channelFull) || chatFull.participants == null) {
            return;
        }
        for (int i3 = 0; i3 < this.u2.participants.participants.size(); i3++) {
            TLRPC.ChatParticipant chatParticipant = this.u2.participants.participants.get(i3);
            this.C1.k(chatParticipant, chatParticipant.user_id);
        }
    }

    public final void b5(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z == null || (tL_emojiStatusCollectible2 = this.E6) == tL_emojiStatusCollectible) {
            return;
        }
        if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
            this.E6 = tL_emojiStatusCollectible;
            gi.l3 l3Var = this.B6;
            int i3 = 1;
            if (l3Var != null) {
                l3Var.f(true);
            }
            if (tL_emojiStatusCollectible == null || TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                return;
            }
            this.D6 = null;
            this.B6 = new gi.l3(getParentActivity(), 3);
            this.C6 = org.telegram.ui.ActionBar.k6.w(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.k6.r1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
            this.B6.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
            gi.l3 l3Var2 = this.B6;
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
            l3Var2.M0 = true;
            l3Var2.U0 = System.currentTimeMillis();
            l3Var2.N0 = new Path();
            l3Var2.O0 = org.telegram.messenger.g0.N(0.66f) / 2.0f;
            l3Var2.P0 = new Paint(1);
            l3Var2.Q0 = new Paint(1);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, r12), org.telegram.ui.ActionBar.k6.r1(1.0f, r12), org.telegram.ui.ActionBar.k6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            l3Var2.T0 = linearGradient;
            l3Var2.Q0.setShader(linearGradient);
            l3Var2.R0 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, r12), org.telegram.ui.ActionBar.k6.r1(0.5f, r12), org.telegram.ui.ActionBar.k6.r1(0.0f, r12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            l3Var2.S0 = new Matrix();
            l3Var2.P0.setShader(l3Var2.R0);
            l3Var2.Q0.setStyle(Paint.Style.STROKE);
            l3Var2.Q0.setStrokeJoin(Paint.Join.ROUND);
            l3Var2.Q0.setStrokeCap(Paint.Cap.ROUND);
            l3Var2.Q0.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
            this.Z.addView(this.B6, b8.mf.c(24.0f, -1));
            this.B6.v(9.33f);
            gi.l3 l3Var3 = this.B6;
            Typeface o10 = org.telegram.messenger.g0.o();
            l3Var3.I.x(o10);
            l3Var3.K.setTypeface(o10);
            this.B6.u(tL_emojiStatusCollectible.title);
            gi.l3 l3Var4 = this.B6;
            l3Var4.d = -1L;
            l3Var4.n(5.66f, 2.66f, 5.66f, 2.66f);
            gi.l3 l3Var5 = this.B6;
            l3Var5.getClass();
            l3Var5.E = org.telegram.messenger.g0.N(4.0f);
            l3Var5.F = org.telegram.messenger.g0.N(2.66f);
            this.B6.t();
            this.B6.s(16.0f);
            this.B6.w();
            this.B6.setOnClickListener(new zt0(this, tL_emojiStatusCollectible.slug, i3));
            if (this.Q1 < org.telegram.messenger.g0.L(82.0f)) {
                this.D6 = Boolean.FALSE;
                this.B6.setAlpha(0.0f);
            }
            q5();
            gi.l3 l3Var6 = this.B6;
            Objects.requireNonNull(l3Var6);
            org.telegram.messenger.g0.i3(new ky(l3Var6, i3), 6000L);
        }
    }

    public final boolean c4() {
        org.telegram.ui.ActionBar.q4 q4Var;
        if (this.J1 == 0 || (q4Var = this.parentLayout) == null || q4Var.getFragmentStack() == null || this.parentLayout.getFragmentStack().size() < 2 || !(this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof wm)) {
            return false;
        }
        finishFragment();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean canBeginSlide() {
        if (this.O.J0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void clearViews() {
        this.h6 = null;
        super.clearViews();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r1 == null) goto L17;
     */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        LaunchActivity launchActivity;
        um umVar;
        org.telegram.ui.ActionBar.p3 p3Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.d2 lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof wm) && (umVar = ((wm) lastFragment).ya) != null && (p3Var = umVar.f) != null) {
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
        int i3 = 5;
        org.telegram.ui.Components.p7 p7Var = new org.telegram.ui.Components.p7(this, context, this.A0, i3);
        boolean z10 = true;
        p7Var.setForceSkipTouches(true);
        p7Var.setBackgroundColor(0);
        p7Var.C(this.h6 != null ? 553648127 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f8, this.A0), false);
        int i10 = org.telegram.ui.ActionBar.k6.v8;
        p7Var.D(org.telegram.ui.ActionBar.k6.w0(i10, this.A0), false);
        p7Var.D(org.telegram.ui.ActionBar.k6.w0(i10, this.A0), true);
        p7Var.setCastShadows(false);
        p7Var.setAddToContainer(false);
        p7Var.setClipContent(true);
        if (!this.J0 && (((q4Var = this.parentLayout) == null || !((ActionBarLayout) q4Var).b) && ((org.telegram.messenger.g0.Q1() || this.inBubbleMode) && (!org.telegram.messenger.g0.Q1() || this.inBubbleMode || (q4Var2 = this.parentLayout) == null || (launchActivity = LaunchActivity.K1) == null || q4Var2 != launchActivity.t0)))) {
            z10 = false;
        }
        p7Var.setOccupyStatusBar(z10);
        if (!this.J0) {
            p7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
            p7Var.getBackButton().setTranslationX(org.telegram.messenger.g0.L(2.0f));
            ImageView backButton = p7Var.getBackButton();
            backButton.setOnLongClickListener(new ei.j2(i3, this, backButton));
            return p7Var;
        }
        p7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        p7Var.getBackButton().setTranslationX(org.telegram.messenger.g0.L(2.0f));
        p7Var.e.setContentDescription(org.telegram.messenger.bd.M0(2131746508, null));
        p7Var.e.setImageResource(R.drawable.outline_header_qr_24);
        p7Var.e.setColorFilter(org.telegram.ui.ActionBar.k6.w0(i10, this.A0), PorterDuff.Mode.SRC_IN);
        p7Var.e.setOnClickListener(new pt0(this, 6));
        return p7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v253, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v258 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        eh.c cVar;
        int i3;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        ?? r12;
        TLRPC.Document document;
        int i10;
        Object obj;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i11;
        int i12;
        int i13;
        TLRPC.UserFull userFull2;
        TLRPC.ChatParticipants chatParticipants;
        wm wmVar;
        um umVar;
        org.telegram.ui.ActionBar.k6.Z(context);
        ?? r02 = 0;
        org.telegram.ui.ActionBar.k6.K(context, false);
        org.telegram.ui.ActionBar.d2 lastFragment = this.parentLayout.getLastFragment();
        StateListAnimator stateListAnimator = null;
        if ((lastFragment instanceof wm) && (umVar = (wmVar = (wm) lastFragment).ya) != null && umVar.l() != null) {
            org.telegram.ui.ActionBar.p3 p3Var = wmVar.ya.f;
            if (p3Var != null) {
                TLRPC.ChatTheme chatTheme = p3Var.d;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = starGift instanceof TL_stars.TL_starGiftUnique ? (TL_stars.TL_starGiftUnique) starGift : null;
                }
            }
            this.A0 = lastFragment.getResourceProvider();
        }
        this.T1 = 0;
        this.U1 = 1.0f;
        this.W1 = false;
        this.hasOwnBackground = true;
        this.Q1 = j4();
        this.actionBar.setActionBarMenuOnItemClick(new iv0(this, context));
        mv0 mv0Var = this.O;
        if (mv0Var != null) {
            mv0Var.Q0();
        }
        long j10 = this.i1;
        if (j10 == 0) {
            j10 = this.e1;
            if (j10 == 0) {
                j10 = -this.f1;
            }
        }
        this.fragmentView = new kv0(this, context);
        kh.k kVar = new kh.k(this.fragmentView);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        eh.c cVar2 = this.L6;
        cVar2.g(kVar, viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        if (this.s1) {
            this.t5 = new FrameLayout(context);
            this.u5 = new FrameLayout[2];
            this.x5 = new gi.d[2];
            int i14 = 0;
            for (int i15 = 2; i14 < i15; i15 = 2) {
                yg0 yg0Var = new yg0(context);
                gh.g b10 = getBaseSimpleGlass().c.b(yg0Var, new hh.b(org.telegram.ui.ActionBar.k6.d6, this.A0));
                b10.q(org.telegram.messenger.g0.L(8.0f));
                b10.r(org.telegram.messenger.g0.L(22.0f));
                yg0Var.setBackground(b10);
                this.u5[i14] = new FrameLayout(context);
                this.x5[i14] = new gi.d(context, this.A0);
                this.x5[i14].setRoundRadius(org.telegram.messenger.g0.L(19.0f));
                this.x5[i14].setUseWrapContent(true);
                this.x5[i14].setPadding(org.telegram.messenger.g0.L(16.0f), r02, org.telegram.messenger.g0.L(16.0f), r02);
                if (i14 == 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                    this.v5 = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.filled_premium_camera), r02, 1, 33);
                    this.v5.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.bd.L0(2131744819));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
                    this.w5 = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wp(R.drawable.filled_add_album), r02, 1, 33);
                    this.w5.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.bd.L0(2131744814));
                    this.x5[i14].h(this.v5, r02);
                } else {
                    this.x5[i14].h(org.telegram.messenger.bd.L0(2131744496), r02);
                }
                yg0Var.setOnClickListener(new fu0(this, i14, r02));
                b8.pf.b(yg0Var, 0.02f, 1.2f);
                this.x5[i14].setStateListAnimator(stateListAnimator);
                yg0Var.addView(this.x5[i14], b8.mf.e(-2, -1, 17));
                this.u5[i14].addView(yg0Var, b8.mf.e(-2, 60, 1));
                this.t5.addView(this.u5[i14], b8.mf.e(-1, -1, 87));
                if (i14 == 1 || !getMessagesController().W4()) {
                    Y4(this.u5[i14], 1.0f);
                }
                i14++;
                r02 = 0;
                stateListAnimator = null;
            }
        }
        TLRPC.ChatFull chatFull2 = this.u2;
        ArrayList arrayList = (chatFull2 == null || (chatParticipants = chatFull2.participants) == null || chatParticipants.participants.size() <= 5) ? null : this.C2;
        if (this.x1) {
            cVar = cVar2;
            z10 = true;
            i3 = 6;
        } else if (!this.t1 || (((userFull = this.v2) == null || userFull.stargifts_count <= 0) && ((chatFull = this.u2) == null || chatFull.stargifts_count <= 0))) {
            z10 = true;
            if (this.r1) {
                i3 = 10;
                cVar = cVar2;
            } else {
                cVar = cVar2;
                i3 = arrayList != null ? 7 : -1;
            }
        } else {
            z10 = true;
            this.w1 = true;
            cVar = cVar2;
            i3 = 14;
        }
        V3(context);
        eh.c cVar3 = cVar;
        org.telegram.ui.Components.os0 os0Var = this.R;
        TLRPC.UserFull userFull3 = this.v2;
        long j11 = j10;
        mv0 mv0Var2 = new mv0(this, context, j11, os0Var, userFull3 != null ? userFull3.common_chats_count : 0, this.C2, this.u2, userFull3, i3, this.y1, this, this, this.A0, getBaseSimpleGlass().c);
        this.O = mv0Var2;
        mv0Var2.setLayoutParams(new u4.p0(-1, -1));
        int i16 = 4;
        if (this.e1 == 0 || this.r0 == null || this.s1) {
            this.c0 = new org.telegram.ui.Components.cg0(context);
            org.telegram.ui.Components.hf0 hf0Var = new org.telegram.ui.Components.hf0(context);
            this.d0 = hf0Var;
            this.c0.setTrailingView(hf0Var);
            org.telegram.ui.Components.kf0 kf0Var = this.J5;
            if (kf0Var != null) {
                this.c0.setGlassFactory(kf0Var.c);
            }
            this.d0.setOnClickListener(new pt0(this, i16));
            this.c0.setColor(this.h6);
            TLRPC.UserFull userFull4 = this.v2;
            if (userFull4 != null && (document = userFull4.saved_music) != null) {
                this.c0.setMusicDocument(document);
            }
            int i17 = 5;
            this.c0.setOnClickListener(new pt0(this, i17));
            this.a0 = new org.telegram.ui.Components.gf0(context, org.telegram.messenger.g0.L(74.0f));
            W4();
            r12 = 0;
            F5(false);
            this.a0.setOnActionClickListener(new jt0(this, i17));
        } else {
            r12 = 0;
        }
        org.telegram.ui.ActionBar.e5 o10 = this.simpleActionBar.o();
        if (this.e1 == getUserConfig().n && !this.s1) {
            if (org.telegram.messenger.g5.r(this.currentAccount).v(7) == null) {
                org.telegram.messenger.g5.r(this.currentAccount).C();
            }
        }
        if (this.r0 != null && !this.s1) {
            org.telegram.ui.ActionBar.f5 b11 = o10.b(32, R.drawable.outline_header_search);
            b11.M();
            b11.J(new lg.w1(this, 19));
            this.U0 = b11;
            b11.setContentDescription(org.telegram.messenger.bd.L0(2131745769));
            this.U0.setSearchFieldHint(org.telegram.messenger.bd.L0(2131745769));
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
        org.telegram.ui.ActionBar.f5 b12 = o10.b(16, R.drawable.profile_video);
        this.R0 = b12;
        b12.setContentDescription(org.telegram.messenger.bd.L0(2131743621));
        if (this.f1 != 0) {
            this.Q0 = o10.b(15, R.drawable.msg_voicechat2);
            if (org.telegram.messenger.t3.W(this.E2)) {
                this.Q0.setContentDescription(org.telegram.messenger.bd.L0(2131743457));
            } else {
                this.Q0.setContentDescription(org.telegram.messenger.bd.L0(2131743316));
            }
        } else {
            org.telegram.ui.ActionBar.f5 b13 = o10.b(15, R.drawable.call);
            this.Q0 = b13;
            b13.setContentDescription(org.telegram.messenger.bd.L0(2131752634));
        }
        if (this.s1) {
            org.telegram.ui.ActionBar.f5 b14 = o10.b(41, R.drawable.group_edit_profile);
            this.S0 = b14;
            b14.setContentDescription(org.telegram.messenger.bd.L0(2131751336));
        } else {
            org.telegram.ui.ActionBar.f5 b15 = o10.b(12, R.drawable.group_edit_profile);
            this.S0 = b15;
            b15.setContentDescription(org.telegram.messenger.bd.L0(2131751336));
        }
        org.telegram.ui.ActionBar.f5 a10 = o10.a();
        this.T0 = a10;
        a10.setSubMenuDelegate(new gu0(this));
        ImageView imageView = new ImageView(context);
        this.Y0 = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.v8, this.A0, PorterDuff.Mode.MULTIPLY);
        org.telegram.messenger.g0.W3(0.8f, this.Y0, r12, r12);
        this.Y0.setImageResource(R.drawable.msg_mini_autodelete_timer);
        this.T0.addView(this.Y0, b8.mf.d(12, 12.0f, 19, 8.0f, 2.0f, 0.0f, 0.0f));
        this.T0.setContentDescription(org.telegram.messenger.bd.L0(2131754839));
        this.T0.L(cVar3, b8.cd.g(this.resourceProvider));
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
        this.d = new bw0(this, context);
        this.e = new lw0(context, this);
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8();
        this.q0 = u8Var;
        u8Var.p = 2.3809524f;
        u8Var.t();
        this.fragmentView.setWillNotDraw(r12);
        kv0 kv0Var = (kv0) this.fragmentView;
        this.n5 = kv0Var;
        kv0Var.setClipChildren(r12);
        hu0 hu0Var = new hu0(this, context, this.A0);
        this.a = hu0Var;
        hu0Var.setLegacySections(r12);
        this.a.r1();
        hu0 hu0Var2 = this.a;
        hu0Var2.getClass();
        hu0Var2.setSectionsOverscanTop(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m);
        hu0 hu0Var3 = this.a;
        int i18 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.ActionBar.r6.i(i18, hu0Var3, this.A0);
        this.a.setVerticalScrollBarEnabled(r12);
        eh.k kVar2 = new eh.k(this.a, (ViewGroup) this.fragmentView, new i40(this, 1));
        kVar2.h = true;
        iu0 iu0Var = new iu0(this);
        this.a.setItemAnimator(iu0Var);
        int i19 = i10;
        iu0Var.e = 320L;
        iu0Var.d = 320L;
        iu0Var.c = 320L;
        iu0Var.m = r12;
        iu0Var.S();
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        iu0Var.o(xqVar);
        this.a.setClipToPadding(r12);
        this.a.setClipChildren(r12);
        this.a.setHideIfEmpty(r12);
        ju0 ju0Var = new ju0(this);
        this.c = ju0Var;
        ju0Var.j1(1);
        ju0 ju0Var2 = this.c;
        ju0Var2.r = r12;
        this.a.setLayoutManager(ju0Var2);
        this.a.setGlowColor(r12);
        this.a.setAdapter(this.d);
        frameLayout.addView(this.a, b8.mf.e(-1, -1, 51));
        this.a.setOnItemClickListener(new ci.i(this, context, j11, 7));
        this.a.setOnItemLongClickListener(new mu0(this, context));
        if (this.r1 || this.t1 || this.x1) {
            J5();
            I();
            this.n6 = true;
            this.l6 = this.K4;
            this.m6 = r12;
        }
        if (this.U0 != null) {
            org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context);
            this.b = tj0Var;
            tj0Var.setVerticalScrollBarEnabled(r12);
            this.b.setLayoutManager(new u4.b0(1, r12));
            org.telegram.ui.ActionBar.r6.I(this.b, org.telegram.ui.ActionBar.k6.e8, this.A0);
            this.b.setAdapter(this.e);
            e6Var = null;
            this.b.setItemAnimator(null);
            this.b.setVisibility(8);
            this.b.setLayoutAnimation(null);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.b, this.A0);
            frameLayout.addView(this.b, b8.mf.e(-1, -1, 51));
            this.b.setOnItemClickListener(new h(this, 28));
            this.b.setOnItemLongClickListener(new jt0(this, 6));
            this.b.setOnScrollListener(new nu0(this, r12));
            this.b.o1(1, true);
            org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(context);
            this.P = zu0Var;
            zu0Var.setAnimateLayoutChange(true);
            this.P.e.setVisibility(8);
            this.P.setVisibility(8);
            frameLayout.addView(this.P);
            this.e.G();
        } else {
            e6Var = null;
        }
        int i20 = 3;
        if (this.E1 != 0) {
            i12 = i19;
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.E1));
            if (this.G2 == null) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = org.telegram.messenger.hp.i1(M0);
                i11 = i18;
                tL_channels_getParticipant.participant = getMessagesController().j1(this.e1);
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new wt0(this, 4));
            } else {
                i11 = i18;
            }
            yg0 yg0Var2 = new yg0(context, i20);
            yg0Var2.setWillNotDraw(r12);
            yg0Var2.setPadding(r12, r12, r12, org.telegram.messenger.g0.n);
            frameLayout.addView(yg0Var2, b8.mf.a(-1.0f, (org.telegram.messenger.g0.n / org.telegram.messenger.g0.p) + 51.0f, 83));
            yg0Var2.setOnClickListener(new hb0(12, this, M0));
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.p7, this.A0);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.bd.L0(2131753728));
            yg0Var2.addView(textView, b8.mf.d(-2, -2.0f, 17, 0.0f, 1.0f, 0.0f, 0.0f));
            this.a.setPadding(r12, j4(), r12, org.telegram.messenger.g0.L(48.0f));
            this.a.setBottomGlowOffset(org.telegram.messenger.g0.L(48.0f));
        } else {
            i11 = i18;
            i12 = i19;
            this.a.setPadding(r12, j4(), r12, r12);
        }
        ow0 ow0Var = new ow0(this, context);
        this.d1 = ow0Var;
        ow0Var.a(this.h6, r12);
        this.d1.setBackgroundColor(getThemedColor(i11));
        frameLayout.addView(this.d1);
        org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
        this.e0 = oVar;
        oVar.setPivotX(org.telegram.messenger.g0.L(30.0f));
        this.e0.setPivotY(org.telegram.messenger.g0.L(30.0f));
        this.Y = new l0(21, context, this);
        this.Z = new ai.c0(25, context, this);
        ImageReceiver imageReceiver = new ImageReceiver(this.Z);
        this.s5 = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(11.0f));
        org.telegram.messenger.g0.W3(1.0f, this.Z, true, r12);
        this.Z.setClipChildren(r12);
        frameLayout.addView(this.Z, b8.mf.d(-1, -1.0f, 8388611, 0.0f, 0.0f, 0.0f, 0.0f));
        this.Y.setPivotX(0.0f);
        this.Y.setPivotY(0.0f);
        org.telegram.ui.Components.zf0 zf0Var = new org.telegram.ui.Components.zf0(context);
        this.u0 = zf0Var;
        zf0Var.addView(this.Y, b8.mf.e(100, 100, 51));
        this.Z.addView(this.u0, b8.mf.c(-1.0f, -1));
        qu0 qu0Var = new qu0(context);
        this.f0 = qu0Var;
        qu0Var.v(e4());
        this.f0.getImageReceiver().T(true);
        this.f0.setRoundRadiusForExpand(q4());
        this.f0.setPivotX(0.0f);
        this.f0.setPivotY(0.0f);
        this.Y.addView(this.f0, b8.mf.c(-1.0f, -1));
        this.f0.setOnClickListener(new pt0(this, 11));
        this.f0.setHasStories(x4());
        this.f0.setOnLongClickListener(new t(this, 6));
        org.telegram.ui.Cells.b4 b4Var = new org.telegram.ui.Cells.b4(this, context);
        this.h0 = b4Var;
        b4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        this.h0.setProgressColor(-1);
        this.h0.setNoProgress(r12);
        this.Y.addView(this.h0, b8.mf.c(-1.0f, -1));
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
        org.telegram.ui.Components.zz0 zz0Var = new org.telegram.ui.Components.zz0(context, e6Var);
        this.m0 = zz0Var;
        imageView4.setImageDrawable(zz0Var);
        this.i0.setTranslationY(-1.0f);
        frameLayout.addView(this.i0, b8.mf.e(34, 34, 51));
        ImageView imageView5 = new ImageView(context);
        this.j0 = imageView5;
        imageView5.setScaleType(scaleType);
        this.j0.setAlpha(0.0f);
        this.j0.setImageDrawable(new jh.c());
        frameLayout.addView(this.j0, b8.mf.e(16, 16, 51));
        ImageView imageView6 = new ImageView(context);
        this.k0 = imageView6;
        imageView6.setImageResource(R.drawable.star_small_outline);
        org.telegram.ui.ActionBar.r6.t(this.k0, org.telegram.ui.ActionBar.k6.s8, this.A0, PorterDuff.Mode.SRC_IN);
        this.k0.setAlpha(0.0f);
        this.k0.setScaleY(0.0f);
        this.k0.setScaleX(0.0f);
        frameLayout.addView(this.k0, b8.mf.e(20, 20, 51));
        ImageView imageView7 = new ImageView(context);
        this.l0 = imageView7;
        imageView7.setImageResource(R.drawable.star_small_inner);
        this.l0.setAlpha(0.0f);
        this.l0.setScaleY(0.0f);
        this.l0.setScaleX(0.0f);
        frameLayout.addView(this.l0, b8.mf.e(20, 20, 51));
        K5();
        j5(r12, r12);
        ru0 ru0Var = this.o0;
        if (ru0Var != null) {
            ru0Var.K();
        }
        org.telegram.ui.Components.nf0 nf0Var = this.n0;
        if (nf0Var != null) {
            nf0Var.d();
        }
        this.N = new cw0(this, context);
        org.telegram.ui.Components.nf0 nf0Var2 = new org.telegram.ui.Components.nf0(context);
        this.n0 = nf0Var2;
        nf0Var2.setSize(e4());
        int i21 = i12;
        long j12 = this.e1;
        if (j12 == 0) {
            j12 = -this.f1;
        }
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        hu0 hu0Var4 = this.a;
        qu0 qu0Var2 = this.f0;
        getClassGuid();
        int i22 = 3;
        this.o0 = new ru0(this, context, j12, kVar3, hu0Var4, qu0Var2, this.N, this.n0);
        if (this.e1 != getUserConfig().n && (userFull2 = this.v2) != null) {
            this.o5 = userFull2.profile_photo == null ? 0.0f : 1.0f;
        }
        if (!this.q1) {
            this.o0.setChatInfo(this.u2);
        }
        this.Z.addView(this.o0);
        this.Z.addView(this.n0, b8.mf.c(138.0f, -1));
        this.Z.addView(this.N);
        org.telegram.ui.Components.gf0 gf0Var = this.a0;
        if (gf0Var != null) {
            this.Z.addView(gf0Var, b8.mf.c(-1.0f, -1));
        }
        org.telegram.ui.Components.cg0 cg0Var = this.c0;
        if (cg0Var != null) {
            this.Z.addView(cg0Var, b8.mf.c(-1.0f, -1));
            this.Z.addView(this.d0, b8.mf.c(-1.0f, -1));
        }
        this.f0.setAvatarsViewPager(this.o0);
        ew0 ew0Var = new ew0(this, context);
        this.p0 = ew0Var;
        this.Z.addView(ew0Var, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.actionBar);
        kk kkVar = new kk(i22, context, this);
        this.f = kkVar;
        kkVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.ji));
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
        this.Z.addView(this.f, b8.mf.d(-2, -2.0f, 51, 109.0f, -6.0f, 0.0f, 0.0f));
        su0 su0Var = new su0(this, context);
        this.r = su0Var;
        su0Var.setEllipsizeByGradient(true);
        this.r.setTextColor(I3(getThemedColor(org.telegram.ui.ActionBar.k6.B8), null));
        this.r.setTextSizePx(org.telegram.messenger.g0.L(13.5f));
        this.r.setGravity(3);
        this.r.setPivotX(org.telegram.messenger.g0.L(8.0f));
        this.r.setPivotY(org.telegram.messenger.g0.L(8.0f));
        this.r.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        this.r.setFocusable(true);
        this.Z.addView(this.r, b8.mf.d(-2, -2.0f, 51, 105.0f, -2.0f, 4.0f, 0.0f));
        Q3();
        this.Z.addView(this.e0);
        org.telegram.ui.Components.ku0 ku0Var = new org.telegram.ui.Components.ku0(context);
        this.T = ku0Var;
        ku0Var.setLayoutParams(b8.mf.d(32, 32.0f, 3, 103.0f, -2.0f, 0.0f, 0.0f));
        this.T.setResourcesProvider(this.A0);
        R3();
        this.T.setDelegate(new jt0(this, 1));
        this.T.setOnClickListener(new pt0(this, r12));
        TLRPC.UserFull userFull5 = this.v2;
        if (userFull5 != null) {
            this.T.set(userFull5.stars_rating);
        }
        this.Z.addView(this.T);
        this.v0 = new tu0(this, context, this.currentAccount, a(), this.q1, this.Y, this.f0, this.A0, context);
        L5(r12);
        TLRPC.UserFull userFull6 = this.v2;
        if (userFull6 != null) {
            this.v0.setStories(userFull6.stories);
        } else {
            TLRPC.ChatFull chatFull3 = this.u2;
            if (chatFull3 != null) {
                this.v0.setStories(chatFull3.stories);
            }
        }
        qu0 qu0Var3 = this.f0;
        if (qu0Var3 != null) {
            qu0Var3.setHasStories(x4());
        }
        this.Z.addView(this.v0, b8.mf.c(-1.0f, -1));
        ci.z0 z0Var = new ci.z0(context, this.currentAccount, a(), this.Y);
        this.w0 = z0Var;
        this.Z.addView(z0Var, (int) r12, b8.mf.c(-1.0f, -1));
        int i23 = 1;
        I5(true);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        this.s = fh0Var;
        if (this.a0 != null) {
            fh0Var.setVisibility(8);
        }
        Q5();
        if (this.e1 == 0) {
            this.s.setImageResource(R.drawable.profile_discuss);
            this.s.setContentDescription(org.telegram.messenger.bd.L0(2131743565));
        } else if (this.r0 != null) {
            this.V = new org.telegram.ui.Components.ch0(R.raw.camera_outline, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            this.W = new org.telegram.ui.Components.ch0(R.raw.camera_outline, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), false, null);
            org.telegram.ui.Components.gf0 gf0Var2 = this.a0;
            if (gf0Var2 != null) {
                gf0Var2.e();
                this.a0.a();
                this.a0.b();
                this.a0.c();
                org.telegram.ui.Components.gf0 gf0Var3 = this.a0;
                if (gf0Var3.G) {
                    gf0Var3.G = r12;
                    gf0Var3.d();
                }
            } else {
                this.s.setAnimation(this.V);
                this.s.setContentDescription(org.telegram.messenger.bd.L0(2131754905));
                this.s.setPadding(org.telegram.messenger.g0.L(2.0f), r12, r12, org.telegram.messenger.g0.L(2.0f));
            }
        } else {
            org.telegram.ui.Components.gf0 gf0Var4 = this.a0;
            if (gf0Var4 != 0) {
                gf0Var4.o(r12, true);
            }
            this.s.setImageResource(R.drawable.profile_newmsg);
            this.s.setContentDescription(org.telegram.messenger.bd.L0(2131754819));
        }
        this.s.setScaleType(scaleType);
        frameLayout.addView(this.s, b8.mf.d(60, 60.0f, 53, 0.0f, 0.0f, 16.0f, 0.0f));
        this.s.setOnClickListener(new pt0(this, i23));
        y4(r12);
        if (i21 != -1 && obj != null) {
            this.s.setTag(Integer.valueOf((int) r12));
            this.s.setScaleX(0.2f);
            this.s.setScaleY(0.2f);
            this.s.setAlpha(0.0f);
        }
        this.a.setOnScrollListener(new nu0(this, i23));
        UndoView undoView = new UndoView(context, null, r12, this.A0);
        this.M = undoView;
        frameLayout.addView(undoView, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.j2 = ofFloat;
        ofFloat.addUpdateListener(new st0(this, i23));
        this.j2.setInterpolator(xqVar);
        this.j2.addListener(new uu0(this, r12));
        J5();
        V();
        gi.l3 l3Var = new gi.l3(getContext(), 3);
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
        frameLayout.addView(this.X, b8.mf.e(-1, org.telegram.messenger.hs.g2, 55));
        this.O.setForwardRestrictedHint(this.X);
        vu0 vu0Var = new vu0(this, (ViewGroup) getParentActivity().getWindow().getDecorView(), frameLayout);
        this.W4 = vu0Var;
        vu0Var.E = new gu0(this);
        this.o0.setPinchToZoomHelper(vu0Var);
        this.y0.setAlpha(r12);
        this.z0.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.i6));
        N5();
        org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(9, context, this);
        this.U = r0Var;
        int i24 = org.telegram.ui.ActionBar.k6.d6;
        r0Var.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i24), 100)));
        this.U.setFocusable((boolean) r12);
        this.U.setImportantForAccessibility(2);
        this.U.setOnClickListener(new pt0(this, 2));
        this.U.setVisibility(8);
        this.U.setFitsSystemWindows(true);
        this.n5.addView(this.U, b8.mf.c(-1.0f, -1));
        U3();
        if (this.s1) {
            i13 = 87;
            this.n5.addView(this.t5, b8.mf.e(-1, 60, 87));
        } else {
            i13 = 87;
        }
        org.telegram.ui.Components.gf0 gf0Var5 = this.a0;
        if (gf0Var5 != null && gf0Var5.k()) {
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
        this.z5 = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i24, frameLayout2, this.A0);
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, this.A0);
        this.z5.addView(view, b8.mf.d(-1, 1.0f / org.telegram.messenger.g0.p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.A5 = new gi.d(context, this.A0);
        this.A5.h(org.telegram.messenger.bd.L0(2131745956), r12);
        this.z5.addView(this.A5, b8.mf.d(-1, 48.0f, org.telegram.messenger.hs.E1, 10.0f, (1.0f / org.telegram.messenger.g0.p) + 10.0f, 10.0f, 10.0f));
        this.A5.setOnClickListener(new pt0(this, 3));
        this.z5.setVisibility(8);
        this.z5.setTranslationY(org.telegram.messenger.g0.L(69.0f));
        this.n5.addView(this.z5, b8.mf.e(-1, -2, i13));
        this.M6 = new ci.g(7, this, kVar2);
        i5();
        r0.i0.l(this.fragmentView, new jt0(this, 4));
        return this.fragmentView;
    }

    public final void d4() {
        if (this.a == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
        float A = org.telegram.ui.Cells.f1.A(layoutParams.width, this.b2, 0.5f, this.a.getMeasuredWidth() / 2.0f);
        this.Z1 = A;
        if (this.G1) {
            this.Z1 = org.telegram.messenger.g0.T1(this.f6, A, this.S1);
        }
        this.Y.setTranslationX(this.Z1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        bw0 bw0Var;
        org.telegram.ui.ActionBar.q4 q4Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User a22;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.Chat chat;
        hu0 hu0Var;
        hu0 hu0Var2;
        org.telegram.ui.Components.bj0 bj0Var;
        int i11 = 19;
        if (i3 == org.telegram.messenger.hs.B5 || i3 == org.telegram.messenger.hs.p3) {
            if (org.telegram.messenger.t3.R(org.telegram.messenger.hp.s1(this.currentAccount).M0(Long.valueOf(this.f1)))) {
                getMessagesController().P1().k(a(), new ei.e(i11), false, this.A0);
                return;
            }
            return;
        }
        int i12 = 0;
        r8 = false;
        boolean z10 = false;
        if (i3 == org.telegram.messenger.hs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i13 = org.telegram.messenger.hp.C8;
            Object[] objArr2 = ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0 && (intValue & TLObject.FLAG_19) == 0) ? false : true;
            if (this.e1 != 0) {
                if (objArr2 != false) {
                    I5(true);
                }
                if ((intValue & 1024) == 0 || (hu0Var2 = this.a) == null || (bj0Var = (org.telegram.ui.Components.bj0) hu0Var2.L(this.G3, false)) == null) {
                    return;
                }
                this.d.t(bj0Var, this.G3);
                return;
            }
            if (this.f1 != 0) {
                int i14 = intValue & TLObject.FLAG_13;
                if (i14 != 0 || (intValue & 8) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0 || (intValue & 4) != 0 || (524288 & intValue) != 0) {
                    if (i14 != 0) {
                        D5(true, false);
                    } else {
                        G5(true);
                    }
                    I5(true);
                }
                if (!objArr2 == true || (hu0Var = this.a) == null) {
                    return;
                }
                int childCount = hu0Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = this.a.getChildAt(i15);
                    if (childAt instanceof org.telegram.ui.Cells.pa) {
                        ((org.telegram.ui.Cells.pa) childAt).i(intValue);
                    }
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.g1) {
            Long l10 = (Long) objArr[0];
            if (this.u2 == null || (chat = this.E2) == null || chat.id != l10.longValue()) {
                return;
            }
            this.u2.online_count = ((Integer) objArr[1]).intValue();
            G5(true);
            I5(false);
            return;
        }
        if (i3 == org.telegram.messenger.hs.O || i3 == org.telegram.messenger.hs.b1) {
            S3(true);
            return;
        }
        int i16 = 20;
        if (i3 == org.telegram.messenger.hs.a0) {
            if (this.j1) {
                org.telegram.messenger.g0.h3(new hk0(i16, this, objArr));
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.Y) {
            TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
            TLRPC.EncryptedChat encryptedChat2 = this.D2;
            if (encryptedChat2 == null || encryptedChat.id != encryptedChat2.id) {
                return;
            }
            this.D2 = encryptedChat;
            D5(false, false);
            org.telegram.messenger.n6 n6Var = this.X1;
            if (n6Var != null) {
                n6Var.g();
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.g0) {
            boolean z11 = this.k1;
            boolean z12 = getMessagesController().H0.indexOfKey(this.e1) >= 0;
            this.k1 = z12;
            if (z11 != z12) {
                S3(true);
                D5(false, false);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.w2) {
            Long l11 = (Long) objArr[0];
            if (this.E2 != null) {
                long longValue = l11.longValue();
                TLRPC.Chat chat2 = this.E2;
                if (longValue == chat2.id && org.telegram.messenger.t3.w(14, chat2)) {
                    TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(this.currentAccount).N0(l11.longValue());
                    if (N0 != null) {
                        TLRPC.ChatFull chatFull4 = this.u2;
                        if (chatFull4 != null) {
                            N0.participants = chatFull4.participants;
                        }
                        this.u2 = N0;
                    }
                    mv0 mv0Var = this.O;
                    if (mv0Var != null) {
                        mv0Var.setChatInfo(this.u2);
                    }
                    TLRPC.ChatFull chatFull5 = this.u2;
                    if (chatFull5 != null && (((inputGroupCall = chatFull5.call) == null && !this.p1) || (inputGroupCall != null && this.p1))) {
                        S3(false);
                    }
                    tu0 tu0Var = this.v0;
                    if (tu0Var != null && (chatFull3 = this.u2) != null) {
                        tu0Var.setStories(chatFull3.stories);
                    }
                    ci.z0 z0Var = this.w0;
                    if (z0Var != null) {
                        z0Var.a();
                    }
                    qu0 qu0Var = this.f0;
                    if (qu0Var != null) {
                        qu0Var.setHasStories(x4());
                    }
                    if (l11.longValue() != 0) {
                        boolean z13 = org.telegram.messenger.r2.a;
                        r7 = (getMessagesController().h7 || (chatFull2 = this.u2) == null || !chatFull2.stargifts_available) ? false : true;
                        this.T0.Q(38, r7);
                        org.telegram.ui.Components.gf0 gf0Var = this.a0;
                        if (gf0Var != null) {
                            gf0Var.o(3, r7);
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
        if (i3 == org.telegram.messenger.hs.T) {
            TLRPC.ChatFull chatFull6 = (TLRPC.ChatFull) objArr[0];
            if (this.e1 != 0 && (a22 = getMessagesController().a2(Long.valueOf(this.e1))) != null && chatFull6.id == a22.linked_community_id) {
                D5(true, false);
            }
            TLRPC.Chat chat3 = this.E2;
            if (chat3 != null && chatFull6.id == chat3.linked_community_id) {
                D5(true, false);
            }
            if (chatFull6.id == this.f1) {
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                TLRPC.ChatFull chatFull7 = this.u2;
                if ((chatFull7 instanceof TLRPC.TL_channelFull) && chatFull6.participants == null) {
                    chatFull6.participants = chatFull7.participants;
                }
                Object[] objArr3 = chatFull7 == null && (chatFull6 instanceof TLRPC.TL_channelFull);
                this.u2 = chatFull6;
                if (this.m1 == 0) {
                    long j10 = chatFull6.migrated_from_chat_id;
                    if (j10 != 0) {
                        this.m1 = -j10;
                        getMediaDataController().d0(0, this.classGuid, this.m1, this.g1, true);
                    }
                }
                b4();
                ru0 ru0Var = this.o0;
                if (ru0Var != null && !this.q1) {
                    ru0Var.setChatInfo(this.u2);
                }
                D5(true, false);
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                if (M0 != null) {
                    this.E2 = M0;
                    S3(true);
                }
                org.telegram.messenger.n6 n6Var2 = this.X1;
                if (n6Var2 != null) {
                    n6Var2.g();
                }
                if (this.E2.megagroup && (objArr3 != false || !booleanValue)) {
                    h4(true);
                }
                o5();
                N5();
                tu0 tu0Var2 = this.v0;
                if (tu0Var2 != null && (chatFull = this.u2) != null) {
                    tu0Var2.setStories(chatFull.stories);
                }
                ci.z0 z0Var2 = this.w0;
                if (z0Var2 != null) {
                    z0Var2.a();
                }
                qu0 qu0Var2 = this.f0;
                if (qu0Var2 != null) {
                    qu0Var2.setHasStories(x4());
                }
                mv0 mv0Var2 = this.O;
                if (mv0Var2 != null) {
                    mv0Var2.setChatInfo(this.u2);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.t) {
            removeSelfFromStack(true);
            return;
        }
        if (i3 == org.telegram.messenger.hs.v) {
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
        if (i3 == org.telegram.messenger.hs.D0) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
            if (botInfo.user_id == this.e1) {
                this.F2 = botInfo;
                D5(false, false);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.E0) {
            if (((Long) objArr[0]).longValue() == this.e1) {
                TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                this.v2 = userFull;
                org.telegram.ui.Components.ku0 ku0Var = this.T;
                if (ku0Var != null) {
                    ku0Var.set(userFull.stars_rating);
                }
                tu0 tu0Var3 = this.v0;
                if (tu0Var3 != null) {
                    tu0Var3.setStories(this.v2.stories);
                }
                ci.z0 z0Var3 = this.w0;
                if (z0Var3 != null) {
                    z0Var3.a();
                }
                qu0 qu0Var3 = this.f0;
                if (qu0Var3 != null) {
                    qu0Var3.setHasStories(x4());
                }
                mv0 mv0Var3 = this.O;
                if (mv0Var3 != null) {
                    mv0Var3.setUserInfo(this.v2);
                }
                if (this.r0 != null) {
                    if (this.d != null && !TextUtils.equals(this.v2.about, this.z2)) {
                        this.d.g(this.W2);
                    }
                    if (this.s1) {
                        D5(false, false);
                    }
                } else {
                    if (this.G1 || this.L0) {
                        this.I1 = true;
                    } else {
                        S3(true);
                    }
                    D5(false, false);
                    mv0 mv0Var4 = this.O;
                    if (mv0Var4 != null) {
                        mv0Var4.setCommonGroupsCount(this.v2.common_chats_count);
                        V();
                        org.telegram.ui.Components.os0 os0Var = this.R;
                        if (os0Var == null || os0Var.E) {
                            resumeDelayedFragmentAnimation();
                            y4(true);
                        }
                    }
                }
                o5();
                N5();
                if (this.w2 == null && !v4()) {
                    org.telegram.ui.Cells.d6 d6Var = new org.telegram.ui.Cells.d6(this.currentAccount);
                    this.w2 = d6Var;
                    g90 g90Var = new g90(this, 17);
                    if (d6Var.c) {
                        g90Var.run();
                    } else {
                        d6Var.h.add(g90Var);
                    }
                    this.w2.d(this.v2);
                }
                if (!v4()) {
                    pw0 pw0Var = this.y2;
                    pw0 c2 = pw0.c(this.currentAccount, this.v2, pw0Var);
                    this.y2 = c2;
                    this.x2 = c2 != pw0Var;
                    if (c2 != null) {
                        g90 g90Var2 = new g90(this, 18);
                        if (c2.b) {
                            g90Var2.run();
                        } else {
                            c2.h.add(g90Var2);
                        }
                    }
                }
                if (this.T0 != null) {
                    if (s4()) {
                        this.T0.S(44);
                    } else {
                        this.T0.t(44);
                    }
                    TLRPC.UserFull userFull2 = this.v2;
                    if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                        z10 = true;
                    }
                    this.T0.Q(46, z10);
                    this.T0.Q(47, !z10);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.k0) {
            return;
        }
        if (i3 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && a() == ((Long) objArr[0]).longValue()) {
                ArrayList arrayList = (ArrayList) objArr[1];
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i17);
                    if (this.D2 != null) {
                        TLRPC.MessageAction messageAction = ziVar.k.action;
                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (bw0Var = this.d) != null) {
                            bw0Var.f();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.i4) {
            hu0 hu0Var3 = this.a;
            if (hu0Var3 != null) {
                hu0Var3.g1();
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.x4) {
            D5(false, false);
            return;
        }
        if (i3 == org.telegram.messenger.hs.s1) {
            int i18 = this.c3;
            int i19 = this.a3;
            int i20 = this.Y2;
            J5();
            bw0 bw0Var2 = this.d;
            if (bw0Var2 != null) {
                if (i18 == this.c3 && i19 == this.a3 && i20 == this.Y2) {
                    return;
                }
                bw0Var2.f();
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.q5) {
            if (this.q1) {
                I5(false);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.D1) {
            lw0 lw0Var = this.e;
            if (lw0Var != null) {
                lw0Var.c = lw0.H(this);
                this.e.w.clear();
                this.e.J();
                lw0 lw0Var2 = this.e;
                lw0Var2.I(lw0Var2.E);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.c0) {
            I5(false);
            return;
        }
        if (i3 == org.telegram.messenger.hs.v5 || i3 == org.telegram.messenger.hs.F5) {
            qu0 qu0Var4 = this.f0;
            if (qu0Var4 != null) {
                qu0Var4.setHasStories(x4());
                this.f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(q4(), 0.0f, this.k2));
            }
            tu0 tu0Var4 = this.v0;
            if (tu0Var4 != null) {
                TLRPC.UserFull userFull3 = this.v2;
                if (userFull3 != null) {
                    tu0Var4.setStories(userFull3.stories);
                    return;
                }
                TLRPC.ChatFull chatFull8 = this.u2;
                if (chatFull8 != null) {
                    tu0Var4.setStories(chatFull8.stories);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.i3) {
            org.telegram.ui.ActionBar.f5 f5Var = this.T0;
            if (f5Var != null) {
                TL_account.RequirementToContact J2 = getMessagesController().J2(this.e1);
                if (J2 != null && !(J2 instanceof TL_account.requirementToContactEmpty)) {
                    r7 = false;
                }
                f5Var.Q(20, r7);
            }
            r5();
            return;
        }
        if (i3 == org.telegram.messenger.hs.f5) {
            r5();
            return;
        }
        if (i3 == org.telegram.messenger.hs.y3) {
            D5(false, false);
            return;
        }
        if (i3 == org.telegram.messenger.hs.C3) {
            D5(false, false);
            return;
        }
        if (i3 == org.telegram.messenger.hs.D3) {
            D5(false, false);
            return;
        }
        if (i3 == org.telegram.messenger.hs.y1) {
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
        if (i3 == org.telegram.messenger.hs.f3) {
            long longValue3 = ((Long) objArr[0]).longValue();
            if (this.K4 >= 0 || longValue3 != a()) {
                return;
            }
            J5();
            V();
            bw0 bw0Var3 = this.d;
            if (bw0Var3 != null) {
                bw0Var3.f();
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.G3) {
            if (((Long) objArr[0]).longValue() != a() || v4()) {
                return;
            }
            if (this.K4 >= 0) {
                mv0 mv0Var5 = this.O;
                if (mv0Var5 != null) {
                    mv0Var5.N1(true);
                    return;
                }
                return;
            }
            J5();
            V();
            bw0 bw0Var4 = this.d;
            if (bw0Var4 != null) {
                bw0Var4.f();
            }
            org.telegram.messenger.g0.h3(new g90(this, i11));
            return;
        }
        if (i3 == org.telegram.messenger.hs.V3) {
            if (((Long) objArr[0]).longValue() != a() || this.e1 <= 0) {
                return;
            }
            TLRPC.UserFull b22 = getMessagesController().b2(this.e1);
            if (b22 != null) {
                this.v2 = b22;
            }
            J5();
            V();
            hu0 hu0Var4 = this.a;
            if (hu0Var4 != null && hu0Var4.c0()) {
                this.a.post(new g90(this, 21));
                return;
            }
            bw0 bw0Var5 = this.d;
            if (bw0Var5 != null) {
                bw0Var5.f();
                return;
            }
            return;
        }
        if (i3 != org.telegram.messenger.hs.W3) {
            return;
        }
        long longValue4 = ((Long) objArr[0]).longValue();
        long longValue5 = ((Long) objArr[1]).longValue();
        TLRPC.Chat chat4 = this.E2;
        if (chat4 == null || chat4.id != longValue4) {
            return;
        }
        String str = (String) objArr[2];
        a0.h hVar = this.C1;
        if (hVar != null && (chatParticipant = (TLRPC.ChatParticipant) hVar.f(longValue5)) != null) {
            chatParticipant.setRank(longValue5, str);
        }
        TLRPC.ChannelParticipant channelParticipant = this.G2;
        if (channelParticipant != null && channelParticipant.user_id == longValue5) {
            channelParticipant.rank = str;
        }
        while (true) {
            ArrayList arrayList2 = this.R4;
            if (i12 >= arrayList2.size()) {
                org.telegram.messenger.g0.b4(this.a);
                return;
            } else {
                ((TLRPC.ChatParticipant) arrayList2.get(i12)).setRank(longValue5, str);
                i12++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.f30 f30Var = this.r0;
        if (f30Var == null || !f30Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.f30 f30Var = this.r0;
        return (f30Var == null || dialog != f30Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final int e4() {
        if (this.e1 == 0 || this.r0 == null || this.s1) {
            return org.telegram.messenger.g0.L(74 + ((this.I4 || this.J4) ? 25 : 0));
        }
        return 0;
    }

    public final void e5(uv0 uv0Var) {
        if (this.j5 == uv0Var) {
            return;
        }
        this.j5 = uv0Var;
        org.telegram.messenger.g0.d0(this.a, new vt0(this, 0));
    }

    @Override // org.telegram.ui.Components.lr0
    public final org.telegram.ui.Components.tj0 f() {
        return this.a;
    }

    public final int f4(ImageReceiver imageReceiver) {
        return imageReceiver.t() instanceof org.telegram.ui.Components.x41 ? ((org.telegram.ui.Components.x41) imageReceiver.t()).a.a() : org.telegram.messenger.g0.p(this.f0.getImageReceiver().n());
    }

    public final void f5(CharSequence charSequence) {
        this.X5 = charSequence;
        H5();
    }

    @Override // org.telegram.ui.Components.lr0
    public final TLRPC.Chat g() {
        return this.E2;
    }

    public final org.telegram.ui.Components.e5 g4(long j10) {
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
        if (j10 != 0) {
            this.H.j(j10, false);
        } else {
            this.H.g(null, false);
        }
        s5();
        return this.H;
    }

    public final void g5(int i3) {
        SharedPreferences e12 = org.telegram.messenger.hp.e1();
        if (org.telegram.messenger.g0.Q1()) {
            return;
        }
        this.K1 = i3 != 0;
        this.L1 = i3 != 0;
        K5();
        if (e12.getBoolean("view_animations", true)) {
            this.J1 = i3;
        } else if (i3 == 2) {
            this.n1 = true;
        }
    }

    public float getAvatarAnimationProgress() {
        return this.S1;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ mq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.A0;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        if (this.A0 != null) {
            return null;
        }
        h6 h6Var = new h6(18, this);
        ArrayList arrayList = new ArrayList();
        mv0 mv0Var = this.O;
        if (mv0Var != null) {
            arrayList.addAll(mv0Var.getThemeDescriptions());
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.q0}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ki));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.li));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.x6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"detailTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.z6));
        int i3 = org.telegram.ui.ActionBar.k6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 131072, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.Ei;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 196608, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 131072, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 196608, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.n6));
        if (this.S5) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.I}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Cj));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.I}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.y}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ni));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final int getThemedColor(int i3) {
        return org.telegram.ui.ActionBar.k6.w0(i3, this.A0);
    }

    @Override // org.telegram.ui.ActionBar.d2
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
    @Override // org.telegram.ui.Components.lr0
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
        int i3 = 0;
        if (getParentActivity() != null) {
            if (z10) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(chatParticipant.user_id));
                if (a22 != null) {
                    long j10 = chatParticipant.user_id;
                    this.A2 = j10;
                    boolean z23 = j10 == getUserConfig().e();
                    if (org.telegram.messenger.t3.T(this.E2)) {
                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        str = channelParticipant.rank;
                        z16 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        z15 = z16 || (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin);
                        z12 = z23;
                        getMessagesController().a2(Long.valueOf(chatParticipant.user_id));
                        z21 = org.telegram.messenger.t3.w(4, this.E2);
                        boolean z24 = org.telegram.messenger.t3.w(25, this.E2) && (!z15 || ((!z16 && channelParticipant.can_edit) || z12));
                        if (z16 || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit)) {
                            z21 = false;
                            z24 = false;
                        }
                        if ((z12 || (channelParticipant instanceof TLRPC.TL_channelParticipantSelf)) && org.telegram.messenger.t3.h(this.E2)) {
                            z24 = true;
                        }
                        z17 = org.telegram.messenger.t3.w(2, this.E2) && (!((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || z16) || channelParticipant.can_edit);
                        z20 = this.E2.gigagroup ? false : z17;
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
                        TLRPC.Chat chat = this.E2;
                        z17 = chat.creator || ((chatParticipant instanceof TLRPC.TL_chatParticipant) && (org.telegram.messenger.t3.w(2, chat) || chatParticipant.inviter_id == getUserConfig().e()));
                        TLRPC.Chat chat2 = this.E2;
                        boolean z25 = chat2.creator;
                        if (org.telegram.messenger.t3.w(25, chat2)) {
                            z18 = z25;
                            if (z15) {
                                if (!z16) {
                                }
                            }
                            z19 = true;
                            z20 = this.E2.creator;
                            z21 = z18;
                            channelParticipant = null;
                        } else {
                            z18 = z25;
                        }
                        if (!z12 || !org.telegram.messenger.t3.h(this.E2)) {
                            z19 = false;
                            z20 = this.E2.creator;
                            z21 = z18;
                            channelParticipant = null;
                        }
                        z19 = true;
                        z20 = this.E2.creator;
                        z21 = z18;
                        channelParticipant = null;
                    }
                    if (!z12) {
                        z22 = z17;
                    } else if (org.telegram.messenger.t3.h(this.E2) || (z15 && org.telegram.messenger.t3.w(25, this.E2))) {
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
                    kt0 kt0Var = new kt0(this, channelParticipant2, a22, chatParticipant, z27, str);
                    String str2 = str;
                    Drawable U0 = view.getParent() instanceof org.telegram.ui.Components.tj0 ? ((org.telegram.ui.Components.tj0) view.getParent()).U0(view, false) : null;
                    org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(this, view);
                    H.W(U0);
                    H.w = false;
                    H.l(R.drawable.msg_discussion, org.telegram.messenger.bd.M0(2131745611, null), new lt0(this, a22, i3), !z12);
                    if (!z12 && (z21 || z19 || z20 || z22)) {
                        H.k();
                    }
                    H.l((z15 || !TextUtils.isEmpty(str2)) ? R.drawable.menu_tag_edit : R.drawable.menu_tag_plus, org.telegram.messenger.bd.M0(z15 ? 2131751303 : TextUtils.isEmpty(str2) ? 2131754400 : 2131751276, null), new ei.a6(this, a22, str2, z15, z16), z19);
                    H.l(R.drawable.msg_admins, org.telegram.messenger.bd.M0(z27 ? 2131751305 : 2131745557, null), new sg0(kt0Var, 27), z21);
                    H.l(R.drawable.msg_permissions, org.telegram.messenger.bd.M0(2131752540, null), new lq(this, channelParticipant2, chatParticipant, a22, kt0Var, 27), z20);
                    H.m(R.drawable.msg_remove, new hk0(21, this, chatParticipant), org.telegram.messenger.bd.M0(2131749063, null), z22, true);
                    H.S = org.telegram.messenger.hs.U2;
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

    public final void h4(boolean z10) {
        a0.h hVar;
        if (this.B1 || (hVar = this.C1) == null || this.u2 == null) {
            return;
        }
        this.B1 = true;
        int i3 = (hVar.m() == 0 || !z10) ? 0 : org.telegram.messenger.hs.X4;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = getMessagesController().h1(this.f1);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = z10 ? 0 : this.C1.m();
        tL_channels_getParticipants.limit = org.telegram.messenger.hs.e3;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new kg.t(this, tL_channels_getParticipants, i3)), this.classGuid);
    }

    public final void h5(TLRPC.UserFull userFull, org.telegram.ui.Cells.d6 d6Var, pw0 pw0Var) {
        this.v2 = userFull;
        org.telegram.ui.Components.ku0 ku0Var = this.T;
        if (ku0Var != null) {
            ku0Var.set(userFull.stars_rating);
        }
        tu0 tu0Var = this.v0;
        if (tu0Var != null) {
            tu0Var.setStories(this.v2.stories);
        }
        ci.z0 z0Var = this.w0;
        if (z0Var != null) {
            z0Var.a();
        }
        qu0 qu0Var = this.f0;
        if (qu0Var != null) {
            qu0Var.setHasStories(x4());
        }
        mv0 mv0Var = this.O;
        if (mv0Var != null) {
            mv0Var.setUserInfo(this.v2);
        }
        if (this.w2 == null) {
            this.w2 = d6Var;
        }
        if (this.w2 == null) {
            this.w2 = new org.telegram.ui.Cells.d6(this.currentAccount);
        }
        org.telegram.ui.Cells.d6 d6Var2 = this.w2;
        g90 g90Var = new g90(this, 23);
        if (d6Var2.c) {
            g90Var.run();
        } else {
            d6Var2.h.add(g90Var);
        }
        this.w2.d(this.v2);
        if (this.y2 == null) {
            this.y2 = pw0Var;
        }
        pw0 pw0Var2 = this.y2;
        boolean z10 = true;
        if (pw0Var2 == null) {
            pw0 c2 = pw0.c(this.currentAccount, this.v2, pw0Var2);
            this.y2 = c2;
            this.x2 = c2 != null;
        }
        pw0 pw0Var3 = this.y2;
        if (pw0Var3 != null) {
            g90 g90Var2 = new g90(this, 18);
            if (pw0Var3.b) {
                g90Var2.run();
            } else {
                pw0Var3.h.add(g90Var2);
            }
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.T0;
        if (f5Var != null) {
            TL_account.RequirementToContact J2 = getMessagesController().J2(this.e1);
            if (J2 != null && !(J2 instanceof TL_account.requirementToContactEmpty)) {
                z10 = false;
            }
            f5Var.Q(20, z10);
            if (s4()) {
                this.T0.S(44);
            } else {
                this.T0.t(44);
            }
        }
    }

    public final org.telegram.ui.Components.e5 i4(TLRPC.EmojiStatus emojiStatus, boolean z10) {
        if (this.G == null) {
            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 2, this.f, false);
            this.G = e5Var;
            if (this.H0) {
                e5Var.a();
            }
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
        s5();
        return this.G;
    }

    public final void i5() {
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.kf0 kf0Var = new org.telegram.ui.Components.kf0(this.glassEngine, baseSimpleGlass);
        this.J5 = kf0Var;
        ow0 ow0Var = this.d1;
        if (ow0Var != null) {
            int i3 = ow0Var.I;
            boolean z10 = ow0Var.c;
            if (kf0Var.i != i3 || kf0Var.j != z10) {
                kf0Var.i = i3;
                kf0Var.j = z10;
                kf0Var.a();
            }
        }
        this.J5.b(this.K5);
        org.telegram.ui.Components.gf0 gf0Var = this.a0;
        if (gf0Var != null) {
            gf0Var.setGlassFactory(this.J5.c);
        }
        org.telegram.ui.Components.cg0 cg0Var = this.c0;
        if (cg0Var != null) {
            cg0Var.setGlassFactory(this.J5.c);
        }
        this.simpleActionBar.setButtonsGlass(this.J5.d);
        this.simpleActionBar.setMenuGlassStroke(false);
        kv0 kv0Var = this.n5;
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.e6 e6Var = this.A0;
        baseSimpleGlass.l = kv0Var;
        baseSimpleGlass.m = null;
        baseSimpleGlass.g(kv0Var, y4Var, e6Var);
        org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
        org.telegram.ui.Components.kf0 kf0Var2 = this.J5;
        eh.c cVar = kf0Var2.e;
        si.d dVar = kf0Var2.f;
        y4Var2.o0 = cVar;
        y4Var2.p0 = dVar;
        y4Var2.setBackground(null);
        this.H5 = b8.cd.m(this.A0);
        this.simpleActionBar.setButtonsGlassColorProvider(this.I5);
        A5();
        baseSimpleGlass.n = this.M6;
        View view = new View(getParentActivity());
        this.U5 = view;
        view.setAlpha(0.0f);
        this.n5.getViewTreeObserver().addOnPreDrawListener(new bk(this, 1));
        this.O.z(this.U5);
        View view2 = this.U5;
        view2.setBackground(baseSimpleGlass.a(view2));
        View view3 = new View(getParentActivity());
        this.C5 = view3;
        view3.setBackground(baseSimpleGlass.a(view3));
        kv0 kv0Var2 = this.n5;
        kv0Var2.addView(this.C5, kv0Var2.indexOfChild(this.Z), b8.mf.e(-1, 0, 48));
        this.glassEngine.b(this.a);
        this.O.setPagesGlassEngine(this.glassEngine);
        this.O.setOnTopPanelShiftChanged(new g90(this, 22));
        H3();
        x5();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.p2;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        int w02;
        if (this.p2) {
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.v()) {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.w8, this.A0);
        } else if (this.S5 || this.B5 > 0.5f) {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.A0);
        } else {
            org.telegram.messenger.wo woVar = this.h6;
            w02 = woVar != null ? woVar.d(org.telegram.ui.ActionBar.k6.I.q()) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.A0);
        }
        return i0.a.h(w02) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r3.contains((int) r7.getX(), ((int) r7.getY()) - r6.actionBar.getMeasuredHeight()) != false) goto L20;
     */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        mv0 mv0Var;
        ru0 ru0Var = this.o0;
        Rect rect = this.L2;
        if (ru0Var != null && ru0Var.getVisibility() == 0 && this.o0.getRealCount() > 1) {
            this.o0.getHitRect(rect);
            if (motionEvent != null) {
            }
        }
        if (this.K4 != -1 && (mv0Var = this.O) != null) {
            if (mv0Var.J0()) {
                this.O.getHitRect(rect);
                if (motionEvent == null || rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
                    mv0 mv0Var2 = this.O;
                    return mv0Var2.getSelectedTab() == mv0Var2.L0.getFirstTabId();
                }
            }
            return false;
        }
        return true;
    }

    public final int j4() {
        return e4() + k4();
    }

    public final void j5(boolean z10, boolean z11) {
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
        int i3 = 1;
        if (z10) {
            this.h0.setVisibility(0);
            this.g0.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<org.telegram.ui.Cells.b4, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<org.telegram.ui.Cells.b4, Float>) View.ALPHA, 0.0f));
        }
        this.g0.setDuration(180L);
        this.g0.addListener(new ev0(this, z10, i3));
        this.g0.start();
    }

    @Override // org.telegram.ui.de0
    public final si.f k() {
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (pi.q.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final int k4() {
        return e4() == 0 ? org.telegram.messenger.g0.L(168.0f) : org.telegram.messenger.g0.L(152.0f);
    }

    public final void k5() {
        Long l10;
        if (this.O5 != null) {
            return;
        }
        x01[] x01VarArr = new x01[1];
        Rect rect = org.telegram.messenger.g0.Q;
        kk kkVar = this.f;
        if (kkVar != null) {
            if (kkVar.getRightDrawable() == null) {
                rect.set(this.f.getWidth() - 1, (this.f.getHeight() / 2) - 1, this.f.getWidth() + 1, (this.f.getHeight() / 2) + 1);
            } else {
                rect.set(this.f.getRightDrawable().getBounds());
                rect.offset((int) ((this.f.getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) this.f.getX(), (int) this.f.getY());
            }
        }
        int i3 = this.f.getScaleX() < 1.5f ? 16 : 32;
        int L = (-(this.Z.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(i3);
        float L2 = org.telegram.messenger.g0.L(324.0f);
        Point point = org.telegram.messenger.g0.q;
        int min = (int) Math.min(L2, point.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = b8.be.b(centerX - (min / 2), 0, point.x - min);
        xu0 xu0Var = new xu0(this, this, getParentActivity(), Integer.valueOf(Math.max(0, centerX - b10)), this.E2 == null ? 0 : 9, this.A0, i3, x01VarArr);
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
        if (a22 != null) {
            xu0Var.setExpireDateHint(org.telegram.messenger.m5.g(a22.emoji_status));
        }
        Long l11 = this.F;
        if (l11 != null) {
            xu0Var.setSelected(l11);
        } else {
            org.telegram.ui.Components.e5 e5Var = this.G;
            if (e5Var != null) {
                Drawable drawable = e5Var.f[0];
                if (drawable instanceof org.telegram.ui.Components.g5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.g5) drawable).h());
                    xu0Var.setSelected(l10);
                }
            }
            l10 = null;
            xu0Var.setSelected(l10);
        }
        xu0Var.setSaveState(3);
        xu0Var.y(this.G, this.f);
        yu0 yu0Var = new yu0(this, xu0Var);
        this.O5 = yu0Var;
        x01VarArr[0] = yu0Var;
        int[] iArr = new int[2];
        kk kkVar2 = this.f;
        if (kkVar2 != null) {
            kkVar2.getLocationOnScreen(iArr);
        }
        x01VarArr[0].showAsDropDown(this.fragmentView, b10, L, 51);
        x01VarArr[0].b();
    }

    public final float l4() {
        return Math.max(this.B5, this.R5);
    }

    public final void l5() {
        int i3 = 0;
        this.O.L0.setReordering(false);
        mv0 mv0Var = this.O;
        org.telegram.ui.Components.tq0 tq0Var = mv0Var.L0;
        if (mv0Var.y1 != null && tq0Var != null) {
            boolean C0 = mv0Var.C0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = tq0Var.getTabIds();
            int size = tabIds.size();
            while (i3 < size) {
                Integer num = tabIds.get(i3);
                i3++;
                TLRPC.ProfileTab o02 = org.telegram.ui.Components.ws0.o0(num.intValue(), C0);
                if (o02 != null) {
                    arrayList.add(o02);
                }
            }
        }
        this.O.N1(true);
        this.z5.animate().translationY(org.telegram.messenger.g0.L(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new g90(this, 25)).start();
        org.telegram.ui.Components.fc.a0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    public final float m4(float f10, float f11) {
        this.v6 = f10;
        this.x6 = f11;
        int i3 = this.J1;
        float l10 = Utilities.l(i3 == 2 ? 1.0f : (this.S1 >= 1.0f || i3 == 0) ? this.k2 : 0.0f);
        org.telegram.ui.Components.ku0 ku0Var = this.T;
        return Math.max(0.0f, (p4() + this.p5) * l10) + com.google.android.recaptcha.internal.a.y(1.0f, l10, f11 * (ku0Var != null ? ku0Var.getVisibilityFactor() : 0.0f), f10);
    }

    public final void m5() {
        if (!this.p2) {
            su0 su0Var = this.r;
            if (su0Var != null) {
                Object tag = su0Var.getTag();
                if (tag instanceof Integer) {
                    this.r.setTextColor(I3(org.telegram.ui.ActionBar.k6.w0(((Integer) tag).intValue(), this.A0), Boolean.valueOf(this.K0[0])));
                } else {
                    this.r.setTextColor(I3(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.A0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.x;
            if (drawable != null) {
                drawable.setColorFilter(this.h6 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.dd, this.A0), PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.kk0 kk0Var = this.L;
            if (kk0Var != null) {
                kk0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, this.A0));
            }
            kk kkVar = this.f;
            if (kkVar != null) {
                kkVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ji, this.A0));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.D(this.h6 == null ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.A0) : -1, false);
                this.actionBar.C(this.h6 != null ? 553648127 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f8, this.A0), false);
            }
        }
        s5();
        P5();
    }

    public final float n4(float f10) {
        this.y6 = f10;
        int i3 = this.J1;
        return com.google.android.recaptcha.internal.a.y(1.0f, Utilities.l(i3 == 2 ? 1.0f : (this.S1 >= 1.0f || i3 == 0) ? this.k2 : 0.0f), this.T != null ? this.T.getVisibilityFactor() * org.telegram.messenger.g0.L(3.0f) : 0.0f, f10);
    }

    public final void n5() {
        l0 l0Var;
        if (this.a0 == null || this.r == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        org.telegram.ui.Components.gf0 gf0Var = this.a0;
        boolean z10 = this.G1;
        gf0Var.e = z10;
        if (z10 && this.J1 == 2 && (l0Var = this.Y) != null) {
            this.a0.f = this.Y.getY() + (this.Y.getScaleY() * l0Var.getHeight());
            this.a0.setAlpha(this.S1);
            org.telegram.ui.Components.gf0 gf0Var2 = this.a0;
            float measuredWidth = this.a.getMeasuredWidth();
            gf0Var2.x = org.telegram.messenger.g0.L(74.0f);
            gf0Var2.setTranslationY(measuredWidth);
            gf0Var2.invalidate();
        } else {
            gf0Var.f = -1.0f;
            float f10 = currentActionBarHeight;
            float L = (this.Q1 + f10) - org.telegram.messenger.g0.L((this.I4 || this.J4) ? 25.0f : 0.0f);
            float min = Math.min(org.telegram.messenger.g0.L(74.0f), L - f10);
            org.telegram.ui.Components.gf0 gf0Var3 = this.a0;
            gf0Var3.x = min;
            gf0Var3.setTranslationY(L - min);
            gf0Var3.invalidate();
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

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean needDelayOpenAnimation() {
        return this.J1 == 0;
    }

    public final org.telegram.ui.Components.wq o4() {
        if (this.K == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            this.E = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ni, this.A0), PorterDuff.Mode.MULTIPLY);
            this.K = new org.telegram.ui.Components.wq(this.E, getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return this.K;
    }

    public final void o5() {
        if (this.Z0 == null || this.a1 == null) {
            return;
        }
        TLRPC.UserFull userFull = this.v2;
        int i3 = (userFull == null && this.u2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.u2.ttl_period;
        this.t0.b(i3);
        this.a1.t(i3);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        org.telegram.ui.Components.f30 f30Var = this.r0;
        if (f30Var != null) {
            f30Var.h(i3, i10, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.tq0 tq0Var;
        if (super.onBackPressed(z10)) {
            mv0 mv0Var = this.O;
            if (mv0Var == null || (tq0Var = mv0Var.L0) == null || !tq0Var.o0) {
                if (this.K4 == -1 || mv0Var == null || !mv0Var.F1) {
                    return this.actionBar.isEnabled();
                }
                if (z10) {
                    mv0Var.V(true);
                }
            } else if (z10) {
                l5();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        super.onBecomeFullyHidden();
        this.o6 = false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        Q5();
        this.o6 = true;
        U3();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        super.onConfigurationChanged(configuration);
        mv0 mv0Var = this.O;
        if (mv0Var != null) {
            mv0Var.onConfigurationChanged(configuration);
        }
        t4();
        if (this.n2 && this.p2 && (m10 = this.c.m(0)) != null) {
            this.a.scrollBy(0, m10.getTop() - j4());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new f7(this, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:264:0x07d0  */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.q0 q0Var;
        boolean z11;
        sw0 sw0Var;
        org.telegram.ui.ActionBar.q0 q0Var2;
        Object obj;
        org.telegram.ui.ActionBar.x xVar;
        org.telegram.ui.ActionBar.q0 j10;
        long j11;
        boolean z12;
        TLRPC.Chat chat;
        pv pvVar;
        if (!this.J0) {
            J5();
            if (this.J1 != 0 && this.M1 && !this.p2 && !this.N1) {
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
                org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                int i3 = 2;
                if (q4Var != null && q4Var.getFragmentStack().size() >= 2) {
                    Object obj2 = (org.telegram.ui.ActionBar.d2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    if (obj2 instanceof org.telegram.ui.Components.ig) {
                        this.h5 = (org.telegram.ui.Components.ig) obj2;
                    }
                    if ((obj2 instanceof uw) && (pvVar = ((uw) obj2).G3) != null) {
                        wv wvVar = pvVar.a;
                        if (com.google.android.recaptcha.internal.a.u(wvVar)) {
                            this.h5 = wvVar;
                        }
                    }
                }
                Object obj3 = this.h5;
                if (obj3 instanceof wm) {
                    kVar = ((org.telegram.ui.ActionBar.d2) obj3).getActionBar();
                    kVar.setSkipDrawChild(true);
                } else {
                    kVar = null;
                }
                org.telegram.ui.Components.ig igVar = this.h5;
                boolean z13 = (igVar instanceof wm) && ((wm) igVar).e != null;
                if (igVar != null) {
                    ImageView imageView5 = this.j0;
                    if (imageView5 != null) {
                        if (!(igVar instanceof wm) || (chat = ((wm) igVar).e) == null || chat.linked_community_id == 0) {
                            imageView5.setTag(null);
                            this.j0.setVisibility(8);
                        } else {
                            imageView5.setTag(1);
                            this.j0.setVisibility(0);
                        }
                    }
                    if (this.m0 != null) {
                        org.telegram.ui.Components.ig igVar2 = this.h5;
                        if ((igVar2 instanceof wm) && org.telegram.messenger.t3.p0(((wm) igVar2).e)) {
                            this.i0.setTag(null);
                            this.i0.setVisibility(8);
                        } else {
                            TLRPC.EncryptedChat encryptedChat = this.D2;
                            if (encryptedChat != null) {
                                this.m0.b(encryptedChat.ttl);
                                this.i0.setTag(1);
                                this.i0.setVisibility(0);
                            } else {
                                TLRPC.UserFull userFull = this.v2;
                                if (userFull != null) {
                                    this.m0.b(userFull.ttl_period);
                                    if (!this.K1 || this.v2.ttl_period == 0) {
                                        this.i0.setTag(null);
                                        this.i0.setVisibility(8);
                                    } else {
                                        this.i0.setTag(1);
                                        this.i0.setVisibility(0);
                                    }
                                } else {
                                    TLRPC.ChatFull chatFull = this.u2;
                                    if (chatFull != null) {
                                        this.m0.b(chatFull.ttl_period);
                                        if (!this.K1 || this.u2.ttl_period == 0) {
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
                    K5();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(this.J1 == 2 ? 250L : 180L);
                this.a.setLayerType(2, null);
                if (z10) {
                    this.f6 = 0.0f;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.r.getLayoutParams();
                    q0Var = null;
                    layoutParams.rightMargin = (int) ((org.telegram.messenger.g0.p * (-21.0f)) + org.telegram.messenger.g0.L(8.0f));
                    this.r.setLayoutParams(layoutParams);
                    if (this.J1 != 2) {
                        j11 = 0;
                        int ceil = (int) Math.ceil((org.telegram.messenger.g0.p * 21.0f) + (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(117.0f)));
                        float measureText = (this.f.getPaint().measureText(this.f.getText().toString()) * 1.12f) + this.f.getSideDrawablesSize();
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                        if (ceil < measureText) {
                            layoutParams2.width = (int) Math.ceil(r4 / 1.12f);
                        } else {
                            layoutParams2.width = -2;
                        }
                        this.f.setLayoutParams(layoutParams2);
                        this.R1 = j4();
                    } else {
                        j11 = 0;
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
                    tu0 tu0Var = this.v0;
                    if (tu0Var != null && this.J1 == 2) {
                        tu0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.v0, (Property<tu0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.J1 == 2) {
                        this.s0 = f4(this.f0.getImageReceiver());
                        this.f.setTextColor(-1);
                        this.r.setTextColor(-1275068417);
                        this.actionBar.C(1090519039, false);
                        mw0 mw0Var = this.z6;
                        if (mw0Var != null) {
                            mw0Var.a(603979775);
                        }
                        cw0 cw0Var = this.N;
                        cw0Var.F = true;
                        cw0Var.setVisibility(0);
                    }
                    if (this.J1 == 2) {
                        this.f.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<kk, Float>) View.ALPHA, 1.0f));
                    } else {
                        this.f.setAlpha(1.0f);
                    }
                    if (this.v0 != null) {
                        if (a() > j11) {
                            this.v0.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.v0, (Property<tu0, Float>) View.ALPHA, 1.0f));
                        } else {
                            this.v0.setAlpha(1.0f);
                            this.v0.setFragmentTransitionProgress(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.v0, "fragmentTransitionProgress", 1.0f));
                        }
                    }
                    ci.z0 z0Var = this.w0;
                    if (z0Var != null) {
                        z0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.w0, (Property<ci.z0, Float>) View.ALPHA, 1.0f));
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
                    if (this.M0 && (this.f1 != j11 || z13)) {
                        this.Q0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.f5, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.f5, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.O0) {
                        this.S0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.f5, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.Y0.getTag() != null) {
                        this.Y0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.Y0, (Property<ImageView, Float>) View.ALPHA, 1.0f));
                    }
                    qu0 qu0Var = this.f0;
                    if (qu0Var != null) {
                        qu0Var.setCrossfadeProgress(1.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f0, nv0.h0, 0.0f));
                    }
                    org.telegram.ui.Components.ig igVar3 = this.h5;
                    if (igVar3 != null) {
                        org.telegram.ui.Components.jn r5 = igVar3.r();
                        if (r5 != null) {
                            org.telegram.ui.Components.fn fnVar = r5.e;
                            org.telegram.ui.Components.qt0 D = this.h5.D();
                            RectF rectF = kh.k.h;
                            kh.k.c(fnVar, D, rectF);
                            this.f6 = rectF.left;
                        }
                        if ((r5 == null || !(r5.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.k5) || ((org.telegram.ui.ActionBar.k5) r5.getSubtitleTextView()).getLeftDrawable() == null) && !r5.T[0]) {
                            z12 = false;
                        } else {
                            this.X4 = r5.getSubtitleTextView();
                            this.Z.invalidate();
                            this.r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<su0, Float>) View.ALPHA, 1.0f));
                            z12 = true;
                        }
                        setAvatarAnimationProgress(0.0f);
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        if (this.J1 == 2) {
                            this.r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<su0, Float>) View.ALPHA, 1.0f));
                        } else {
                            this.r.setAlpha(1.0f);
                        }
                    }
                    animatorSet.playTogether(arrayList);
                } else {
                    q0Var = null;
                    this.R1 = this.Q1;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 1.0f, 0.0f));
                    org.telegram.ui.Components.fh0 fh0Var2 = this.s;
                    if (fh0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(fh0Var2, (Property<org.telegram.ui.Components.fh0, Float>) View.SCALE_X, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.SCALE_Y, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fh0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.J1 == 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f, (Property<kk, Float>) View.ALPHA, 0.0f));
                    }
                    tu0 tu0Var2 = this.v0;
                    if (tu0Var2 != null) {
                        if (this.i1 > 0) {
                            arrayList2.add(ObjectAnimator.ofFloat(tu0Var2, (Property<tu0, Float>) View.ALPHA, 0.0f));
                        } else {
                            arrayList2.add(ObjectAnimator.ofFloat(tu0Var2, "fragmentTransitionProgress", 0.0f));
                        }
                    }
                    ci.z0 z0Var2 = this.w0;
                    if (z0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(z0Var2, (Property<ci.z0, Float>) View.ALPHA, 0.0f));
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
                        arrayList2.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.f5, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.N0) {
                        this.R0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.f5, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.O0) {
                        this.S0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.f5, Float>) View.ALPHA, 0.0f));
                    }
                    ImageView imageView6 = this.Y0;
                    if (imageView6 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) View.ALPHA, imageView6.getAlpha(), 0.0f));
                    }
                    qu0 qu0Var2 = this.f0;
                    if (qu0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(qu0Var2, nv0.h0, 1.0f));
                    }
                    org.telegram.ui.ActionBar.d2 d2Var = this.parentLayout.getFragmentStack().size() > 1 ? (org.telegram.ui.ActionBar.d2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) : null;
                    if (d2Var instanceof wm) {
                        wm wmVar = (wm) d2Var;
                        qi qiVar = wmVar.p1;
                        org.telegram.messenger.g0.K(qiVar, new hc0(this, qiVar, wmVar, 28));
                        View subtitleTextView = qiVar.getSubtitleTextView();
                        if (((subtitleTextView instanceof org.telegram.ui.ActionBar.k5) && ((org.telegram.ui.ActionBar.k5) subtitleTextView).getLeftDrawable() != null) || qiVar.T[0]) {
                            this.X4 = qiVar.getSubtitleTextView();
                            this.Z.invalidate();
                            arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<su0, Float>) View.ALPHA, 0.0f));
                            z11 = true;
                            if (!z11 && this.J1 == 2) {
                                arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<su0, Float>) View.ALPHA, 0.0f));
                            }
                            animatorSet.playTogether(arrayList2);
                            sw0Var = this.A6;
                            if (sw0Var != null) {
                                sw0Var.animate().alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            }
                        }
                    }
                    z11 = false;
                    if (!z11) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<su0, Float>) View.ALPHA, 0.0f));
                    }
                    animatorSet.playTogether(arrayList2);
                    sw0Var = this.A6;
                    if (sw0Var != null) {
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new st0(this, i3));
                animatorSet.playTogether(ofFloat);
                if (this.P0 == null || (obj = this.h5) == null || (xVar = ((org.telegram.ui.ActionBar.d2) obj).getActionBar().F) == null || (j10 = xVar.j(32)) == null || j10.getVisibility() != 0) {
                    q0Var2 = q0Var;
                } else {
                    j10.setAlpha(0.0f);
                    if (z10) {
                        this.P0.setVisibility(0);
                    }
                    this.P0.setTag(j10);
                    q0Var2 = j10;
                }
                animatorSet.addListener(new kg.g0(this, kVar, q0Var2, runnable, 5));
                animatorSet.setInterpolator(this.J1 == 2 ? org.telegram.ui.Components.xq.f : new DecelerateInterpolator());
                org.telegram.messenger.g0.i3(new xp0(animatorSet, 4), 50L);
                return animatorSet;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onDialogDismiss(Dialog dialog) {
        hu0 hu0Var = this.a;
        if (hu0Var != null) {
            hu0Var.g1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0458  */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        long e10;
        org.telegram.ui.Components.os0 os0Var;
        bw0 bw0Var;
        this.e1 = this.arguments.getLong("user_id", 0L);
        this.f1 = this.arguments.getLong("chat_id", 0L);
        this.g1 = this.arguments.getLong("topic_id", 0L);
        this.h1 = this.arguments.getBoolean("saved", false);
        this.r1 = this.arguments.getBoolean("similar", false);
        this.q1 = this.g1 != 0;
        this.E1 = this.arguments.getLong("ban_chat_id", 0L);
        this.a5 = this.arguments.getInt("report_reaction_message_id", 0);
        this.b5 = this.arguments.getLong("report_reaction_from_dialog_id", 0L);
        this.d5 = this.arguments.getBoolean("show_add_to_contacts", true);
        this.e5 = mf.b.d(this.arguments.getString("vcard_phone"), false);
        this.f5 = this.arguments.getString("vcard_first_name");
        this.g5 = this.arguments.getString("vcard_last_name");
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
                this.k2 = 1.0f;
                this.o1 = true;
            }
        }
        if (this.e1 == 0) {
            if (this.f1 != 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f1));
                this.E2 = M0;
                if (M0 == null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    getMessagesStorage().a.c(new hk0(24, this, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                    if (this.E2 != null) {
                        getMessagesController().Q3(this.E2, true);
                    }
                }
                org.telegram.messenger.n6 n6Var = this.X1;
                if (n6Var != null) {
                    n6Var.g();
                }
                if (this.E2.megagroup) {
                    h4(true);
                } else {
                    this.C1 = null;
                }
                getNotificationCenter().c(this, org.telegram.messenger.hs.T);
                getNotificationCenter().c(this, org.telegram.messenger.hs.g1);
                getNotificationCenter().c(this, org.telegram.messenger.hs.w2);
                getNotificationCenter().c(this, org.telegram.messenger.hs.b1);
                getNotificationCenter().c(this, org.telegram.messenger.hs.p3);
                org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.B5);
                this.C2 = new ArrayList();
                G5(true);
                if (this.u2 == null) {
                    this.u2 = getMessagesController().N0(this.f1);
                }
                if (org.telegram.messenger.t3.T(this.E2)) {
                    getMessagesController().V2(this.classGuid, this.f1, true);
                } else if (this.u2 == null) {
                    this.u2 = getMessagesStorage().F0(this.f1, false, null, false, false, 0);
                }
                v5();
                e10 = getUserConfig().e();
                if (this.e1 != e10) {
                }
                this.s1 = true;
                os0Var = this.R;
                if (os0Var != null) {
                    os0Var.b(this);
                    this.R = null;
                }
                if (this.R == null) {
                }
                this.R.y.add(this);
                getNotificationCenter().c(this, org.telegram.messenger.hs.r);
                getNotificationCenter().c(this, 1);
                getNotificationCenter().c(this, org.telegram.messenger.hs.t);
                getNotificationCenter().c(this, org.telegram.messenger.hs.v);
                getNotificationCenter().c(this, org.telegram.messenger.hs.q5);
                getNotificationCenter().c(this, org.telegram.messenger.hs.D1);
                getNotificationCenter().c(this, org.telegram.messenger.hs.c0);
                getNotificationCenter().c(this, org.telegram.messenger.hs.v5);
                getNotificationCenter().c(this, org.telegram.messenger.hs.F5);
                getNotificationCenter().c(this, org.telegram.messenger.hs.i3);
                getNotificationCenter().c(this, org.telegram.messenger.hs.f5);
                getNotificationCenter().c(this, org.telegram.messenger.hs.y3);
                getNotificationCenter().c(this, org.telegram.messenger.hs.C3);
                getNotificationCenter().c(this, org.telegram.messenger.hs.D3);
                getNotificationCenter().c(this, org.telegram.messenger.hs.y1);
                getNotificationCenter().c(this, org.telegram.messenger.hs.f3);
                getNotificationCenter().c(this, org.telegram.messenger.hs.G3);
                getNotificationCenter().c(this, org.telegram.messenger.hs.V3);
                getNotificationCenter().c(this, org.telegram.messenger.hs.W3);
                org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
                J5();
                bw0Var = this.d;
                if (bw0Var != null) {
                }
                if (this.arguments.containsKey("preload_messages")) {
                }
                if (this.e1 != 0) {
                    getConnectionsManager().sendRequest(new TL_account.getPassword(), new wt0(this, 5));
                }
                setBulletinDelegate(new x8(this, 8));
                if (this.e1 != 0) {
                    getMessagesController().R0(null);
                }
                W4();
                this.H6 = !this.J0 ? org.telegram.messenger.g0.L(72.0f) : 0;
                this.I6 = this.J0 ? org.telegram.messenger.g0.L(64.0f) : 0;
                return true;
            }
            return false;
        }
        long j10 = this.arguments.getLong("dialog_id", 0L);
        this.i1 = j10;
        if (j10 != 0) {
            this.D2 = getMessagesController().a1(Integer.valueOf((int) (this.i1 & 4294967295L)));
        }
        org.telegram.messenger.n6 n6Var2 = this.X1;
        if (n6Var2 != null) {
            n6Var2.g();
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.e1));
        if (a22 != null) {
            getNotificationCenter().c(this, org.telegram.messenger.hs.O);
            getNotificationCenter().c(this, org.telegram.messenger.hs.s1);
            getNotificationCenter().c(this, org.telegram.messenger.hs.a0);
            getNotificationCenter().c(this, org.telegram.messenger.hs.Y);
            getNotificationCenter().c(this, org.telegram.messenger.hs.g0);
            getNotificationCenter().c(this, org.telegram.messenger.hs.D0);
            getNotificationCenter().c(this, org.telegram.messenger.hs.E0);
            getNotificationCenter().c(this, org.telegram.messenger.hs.k0);
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.x4);
            this.k1 = getMessagesController().H0.indexOfKey(this.e1) >= 0;
            if (a22.bot) {
                this.r2 = true;
                org.telegram.messenger.li mediaDataController = getMediaDataController();
                long j11 = a22.id;
                mediaDataController.G0(j11, j11, true, this.classGuid, null);
            }
            this.v2 = getMessagesController().b2(this.e1);
            getMessagesController().W2(getMessagesController().a2(Long.valueOf(this.e1)), this.classGuid, true, null);
            this.C1 = null;
            if (org.telegram.messenger.l10.B(a22)) {
                org.telegram.ui.Components.f30 f30Var = new org.telegram.ui.Components.f30(0, true, true);
                this.r0 = f30Var;
                f30Var.I = true;
                f30Var.a = this;
                f30Var.b = this;
                getMediaDataController().x();
                getMessagesController().d3();
                getMessagesController().g3(getUserConfig().f(), true, this.classGuid);
            }
            this.Y4 = this.arguments.getInt("actionBarColor", 0);
            e10 = getUserConfig().e();
            if ((this.e1 != e10 || this.i1 == e10) && !this.s1) {
                this.s1 = true;
            }
            os0Var = this.R;
            if (os0Var != null && os0Var.s != this.g1) {
                os0Var.b(this);
                this.R = null;
            }
            if (this.R == null) {
                this.R = new org.telegram.ui.Components.os0(this);
            }
            this.R.y.add(this);
            getNotificationCenter().c(this, org.telegram.messenger.hs.r);
            getNotificationCenter().c(this, 1);
            getNotificationCenter().c(this, org.telegram.messenger.hs.t);
            getNotificationCenter().c(this, org.telegram.messenger.hs.v);
            getNotificationCenter().c(this, org.telegram.messenger.hs.q5);
            getNotificationCenter().c(this, org.telegram.messenger.hs.D1);
            getNotificationCenter().c(this, org.telegram.messenger.hs.c0);
            getNotificationCenter().c(this, org.telegram.messenger.hs.v5);
            getNotificationCenter().c(this, org.telegram.messenger.hs.F5);
            getNotificationCenter().c(this, org.telegram.messenger.hs.i3);
            getNotificationCenter().c(this, org.telegram.messenger.hs.f5);
            getNotificationCenter().c(this, org.telegram.messenger.hs.y3);
            getNotificationCenter().c(this, org.telegram.messenger.hs.C3);
            getNotificationCenter().c(this, org.telegram.messenger.hs.D3);
            getNotificationCenter().c(this, org.telegram.messenger.hs.y1);
            getNotificationCenter().c(this, org.telegram.messenger.hs.f3);
            getNotificationCenter().c(this, org.telegram.messenger.hs.G3);
            getNotificationCenter().c(this, org.telegram.messenger.hs.V3);
            getNotificationCenter().c(this, org.telegram.messenger.hs.W3);
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
            J5();
            bw0Var = this.d;
            if (bw0Var != null) {
                bw0Var.f();
            }
            if (this.arguments.containsKey("preload_messages")) {
                getMessagesController().s0(this.e1, 0, null);
            }
            if (this.e1 != 0 && org.telegram.messenger.l10.B(getMessagesController().a2(Long.valueOf(this.e1)))) {
                getConnectionsManager().sendRequest(new TL_account.getPassword(), new wt0(this, 5));
            }
            setBulletinDelegate(new x8(this, 8));
            if (this.e1 != 0 && org.telegram.messenger.l10.B(getMessagesController().a2(Long.valueOf(this.e1))) && !this.s1) {
                getMessagesController().R0(null);
            }
            W4();
            this.H6 = !this.J0 ? org.telegram.messenger.g0.L(72.0f) : 0;
            this.I6 = this.J0 ? org.telegram.messenger.g0.L(64.0f) : 0;
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        mv0 mv0Var = this.O;
        if (mv0Var != null) {
            mv0Var.Q0();
        }
        org.telegram.ui.Components.os0 os0Var = this.R;
        if (os0Var != null) {
            os0Var.b(this);
        }
        org.telegram.ui.Components.os0 os0Var2 = this.R;
        if (os0Var2 != null) {
            os0Var2.y.remove(this);
        }
        getNotificationCenter().n(this, org.telegram.messenger.hs.r);
        getNotificationCenter().n(this, org.telegram.messenger.hs.t);
        getNotificationCenter().n(this, org.telegram.messenger.hs.v);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.hs.q5);
        getNotificationCenter().n(this, org.telegram.messenger.hs.D1);
        getNotificationCenter().n(this, org.telegram.messenger.hs.c0);
        getNotificationCenter().n(this, org.telegram.messenger.hs.v5);
        getNotificationCenter().n(this, org.telegram.messenger.hs.F5);
        getNotificationCenter().n(this, org.telegram.messenger.hs.i3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f5);
        getNotificationCenter().n(this, org.telegram.messenger.hs.y3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.C3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.D3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.y1);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.G3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.V3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.W3);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
        ru0 ru0Var = this.o0;
        if (ru0Var != null) {
            ru0Var.K();
        }
        org.telegram.ui.Components.nf0 nf0Var = this.n0;
        if (nf0Var != null) {
            nf0Var.d();
        }
        this.a6 = null;
        if (this.e1 != 0) {
            getNotificationCenter().n(this, org.telegram.messenger.hs.s1);
            getNotificationCenter().n(this, org.telegram.messenger.hs.O);
            getNotificationCenter().n(this, org.telegram.messenger.hs.a0);
            getNotificationCenter().n(this, org.telegram.messenger.hs.Y);
            getNotificationCenter().n(this, org.telegram.messenger.hs.g0);
            getNotificationCenter().n(this, org.telegram.messenger.hs.D0);
            getNotificationCenter().n(this, org.telegram.messenger.hs.E0);
            getNotificationCenter().n(this, org.telegram.messenger.hs.k0);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.x4);
            getMessagesController().r1.remove(Long.valueOf(this.e1));
        } else if (this.f1 != 0) {
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.B5);
            getNotificationCenter().n(this, org.telegram.messenger.hs.p3);
            getNotificationCenter().n(this, org.telegram.messenger.hs.T);
            getNotificationCenter().n(this, org.telegram.messenger.hs.g1);
            getNotificationCenter().n(this, org.telegram.messenger.hs.w2);
            getNotificationCenter().n(this, org.telegram.messenger.hs.b1);
        }
        qu0 qu0Var = this.f0;
        if (qu0Var != null) {
            qu0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.f30 f30Var = this.r0;
        if (f30Var != null) {
            f30Var.d();
        }
        vu0 vu0Var = this.W4;
        if (vu0Var != null) {
            vu0Var.b();
        }
        pw0 pw0Var = this.y2;
        if (pw0Var != null && this.x2) {
            pw0Var.b(true);
            this.y2 = null;
        }
        org.telegram.messenger.video.o oVar = this.y5;
        if (oVar != null) {
            this.y5 = null;
            org.telegram.messenger.g0.h3(oVar);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        org.telegram.ui.Components.er0 er0Var;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.f30 f30Var = this.r0;
        if (f30Var != null) {
            f30Var.i();
        }
        org.telegram.messenger.n6 n6Var = this.X1;
        if (n6Var != null) {
            n6Var.e();
        }
        mv0 mv0Var = this.O;
        if (mv0Var == null || (er0Var = mv0Var.W) == null) {
            return;
        }
        er0Var.e = false;
        if (er0Var.c != null) {
            er0Var.a.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.f30 f30Var = this.r0;
        if (f30Var != null) {
            f30Var.j(i3, strArr, iArr);
        }
        if (i3 != 101 && i3 != 102) {
            if (i3 != 103 || this.E2 == null) {
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
                org.telegram.ui.Components.voip.n1.h(getParentActivity(), null, i3);
                return;
            } else {
                org.telegram.ui.Components.voip.n1.l(this.E2, null, getMessagesController().g1(this.f1, false, null) == null, null, getParentActivity(), this, getAccountInstance());
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
            org.telegram.ui.Components.voip.n1.h(getParentActivity(), null, i3);
            return;
        }
        boolean z12 = i3 == 102;
        TLRPC.UserFull userFull = this.v2;
        org.telegram.ui.Components.voip.n1.m(a22, z12, userFull != null && userFull.video_calls_available, getParentActivity(), this.v2, getAccountInstance());
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        TLRPC.User a22;
        org.telegram.ui.Components.voip.r0 r0Var;
        super.onResume();
        mv0 mv0Var = this.O;
        if (mv0Var != null) {
            mv0Var.e1 = true;
            org.telegram.ui.Components.dr0 dr0Var = mv0Var.K;
            if (dr0Var != null) {
                dr0Var.f();
            }
            org.telegram.ui.Components.js0 js0Var = mv0Var.N;
            if (js0Var != null) {
                js0Var.f();
            }
            org.telegram.ui.Components.ks0 ks0Var = mv0Var.M;
            if (ks0Var != null) {
                ks0Var.X(false);
            }
            for (int i3 = 0; i3 < mv0Var.n0.length; i3++) {
                mv0Var.e0(i3);
            }
            org.telegram.ui.Components.er0 er0Var = mv0Var.W;
            if (er0Var != null) {
                er0Var.e = true;
                if (er0Var.c != null) {
                    er0Var.a.onResume();
                }
            }
        }
        t4();
        bw0 bw0Var = this.d;
        if (bw0Var != null) {
            this.U4 = true;
            bw0Var.f();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (r0Var = this.U) != null && r0Var.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        org.telegram.ui.Components.f30 f30Var = this.r0;
        if (f30Var != null) {
            f30Var.k();
            setParentActivityTitle(org.telegram.messenger.bd.M0(2131745505, null));
        }
        I5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new f7(this, 5));
        }
        kk kkVar = this.f;
        if (kkVar != null) {
            setParentActivityTitle(kkVar.getText());
        }
        if (this.e1 != 0 && (a22 = getMessagesController().a2(Long.valueOf(this.e1))) != null && a22.photo == null && this.Q1 >= j4()) {
            this.j2.cancel();
            float[] fArr = this.m2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            X4(1.0f);
            this.o0.setVisibility(8);
            this.Q1 = j4();
            this.o2 = false;
            this.c.h1(0, j4() - this.a.getPaddingTop());
        }
        org.telegram.messenger.n6 n6Var = this.X1;
        if (n6Var != null) {
            n6Var.a();
        }
        C5();
        y4(false);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.z0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.A0));
            m5();
            M5();
            J3();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.y4 y4Var;
        if (z10 && (y4Var = this.simpleActionBar) != null) {
            y4Var.setAlpha(1.0f);
        }
        if (z10) {
            if (!z11) {
                int i3 = this.J1;
                if (i3 != 0 && this.M1) {
                    if (i3 == 1) {
                        this.k2 = 0.0f;
                        org.telegram.ui.Components.ku0 ku0Var = this.T;
                        if (ku0Var != null) {
                            ku0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.gf0 gf0Var = this.a0;
                        if (gf0Var != null) {
                            gf0Var.setParentExpanded(0.0f);
                        }
                        Z4(0.0f);
                        org.telegram.ui.Components.cg0 cg0Var = this.c0;
                        if (cg0Var != null) {
                            cg0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    O3();
                    if (this.I1) {
                        S3(true);
                    }
                }
                if (!this.m5) {
                    this.m5 = true;
                    this.V4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().j(this.Q4);
            org.telegram.ui.Components.voip.r0 r0Var = this.U;
            if (r0Var != null && r0Var.getVisibility() == 0) {
                this.U.setVisibility(8);
                this.U.setBackground(null);
            }
        }
        this.H1 = false;
        Q3();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        org.telegram.ui.Components.voip.r0 r0Var = this.U;
        if (r0Var == null || r0Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.U.setAlpha(1.0f - f10);
        } else {
            this.U.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        ImageView imageView;
        org.telegram.ui.Components.gf0 gf0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.d6 = z10;
        if (z10 && (gf0Var = this.a0) != null) {
            ArrayList arrayList = gf0Var.a;
            if (gf0Var.F == 6) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    org.telegram.ui.Components.df0 df0Var = (org.telegram.ui.Components.df0) arrayList.get(i3);
                    org.telegram.ui.Components.ch0 ch0Var = df0Var.k;
                    if (ch0Var != null) {
                        if (df0Var.a == 15) {
                            ch0Var.M(14);
                        } else {
                            ch0Var.M(0);
                        }
                        df0Var.k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.P0) != null && imageView.getTag() != null && (this.P0.getTag() instanceof org.telegram.ui.ActionBar.q0)) {
            ((org.telegram.ui.ActionBar.q0) this.P0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.J1 != 0 && this.M1 && !this.p2) {
            this.G1 = true;
            if (!z10) {
                if (this.a6 == null) {
                    this.a6 = new float[14];
                }
                this.F1 = this.Q1;
                this.a6[0] = this.Y.getScaleX();
                this.a6[1] = this.Y.getTranslationX();
                this.a6[2] = this.Y.getTranslationY();
                org.telegram.ui.Components.gf0 gf0Var2 = this.a0;
                if (gf0Var2 != null) {
                    this.a6[3] = gf0Var2.getAlpha();
                }
                ci.z0 z0Var = this.w0;
                if (z0Var != null) {
                    float[] fArr = this.a6;
                    fArr[4] = z0Var.e;
                    fArr[5] = z0Var.f;
                }
                if (this.z6 != null) {
                    this.a6[6] = r0.getAlpha();
                }
                this.a6[7] = this.f.getScaleX();
                this.a6[8] = this.f.getTranslationY();
                this.a6[9] = this.r.getTranslationY();
                this.a6[10] = this.f.getLayoutParams().width;
                float[] fArr2 = this.a6;
                fArr2[11] = this.c2;
                fArr2[12] = this.f.getTranslationX();
                this.a6[13] = this.r.getTranslationX();
                gi.l3 l3Var = this.B6;
                if (l3Var != null) {
                    l3Var.f(true);
                }
            }
        }
        if (z10) {
            if (this.r0 != null) {
                this.Q4 = getNotificationCenter().q(new int[]{org.telegram.messenger.hs.s, org.telegram.messenger.hs.t, org.telegram.messenger.hs.W, org.telegram.messenger.hs.X, org.telegram.messenger.hs.E0, org.telegram.messenger.hs.r4}, this.Q4, true);
            } else {
                this.Q4 = getNotificationCenter().q(new int[]{org.telegram.messenger.hs.s, org.telegram.messenger.hs.t, org.telegram.messenger.hs.W, org.telegram.messenger.hs.X, org.telegram.messenger.hs.r4}, this.Q4, true);
            }
            if (!z11 && getParentActivity() != null) {
                this.Z4 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.H1 = true;
        Q3();
    }

    public final float p4() {
        if (this.T == null) {
            return 0.0f;
        }
        return this.T.getVisibilityFactor() * org.telegram.messenger.g0.L(22.0f);
    }

    public final void p5() {
        if (this.t5 == null) {
            return;
        }
        mv0 mv0Var = this.O;
        boolean z10 = ((mv0Var == null || !mv0Var.isAttachedToWindow()) ? (float) org.telegram.messenger.g0.L(72.0f) : ((float) org.telegram.messenger.g0.L(232.0f)) - (((float) this.a.getMeasuredHeight()) - this.O.getY())) <= 0.0f;
        qe.a aVar = this.N5;
        aVar.a(z10, true);
        float f10 = aVar.e;
        this.t5.setTranslationY(org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(60.0f), 0));
        this.t5.setAlpha(f10);
        this.t5.setVisibility(f10 <= 0.0f ? 4 : 0);
        org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.w;
        if (acVar != null) {
            acVar.l();
        }
    }

    public final int q4() {
        if (this.q1) {
            return 0;
        }
        if (this.f1 == 0 || !org.telegram.messenger.t3.c0(getMessagesController().M0(Long.valueOf(this.f1)))) {
            return org.telegram.messenger.g0.L(50.0f);
        }
        return org.telegram.messenger.g0.L(x4() ? 24.0f : 38.0f);
    }

    public final void q5() {
        gi.l3 l3Var = this.B6;
        if (l3Var == null) {
            return;
        }
        l3Var.p(0.0f, (this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX() + (-l3Var.getPaddingLeft()));
        float U1 = org.telegram.messenger.g0.U1(this.l2, this.m2);
        this.B6.setTranslationY(((this.f.getY() + (-r2.getPaddingBottom())) - org.telegram.messenger.g0.L(24.0f)) + org.telegram.messenger.g0.W1(U1, org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(12.0f)));
        this.B6.j(i0.a.f(U1, this.C6, 1342177280));
        boolean z10 = this.Q1 >= ((float) org.telegram.messenger.g0.L(82.0f));
        Boolean bool = this.D6;
        if (bool == null || bool.booleanValue() != z10) {
            ViewPropertyAnimator animate = this.B6.animate();
            this.D6 = Boolean.valueOf(z10);
            org.telegram.messenger.camera.q.l(animate.alpha(z10 ? 1.0f : 0.0f), org.telegram.ui.Components.xq.g, 200L);
        }
    }

    public final org.telegram.ui.Components.wq r4() {
        if (this.J == null) {
            this.y = org.telegram.ui.ActionBar.k6.Q1.getConstantState().newDrawable().mutate();
            this.I = org.telegram.ui.ActionBar.k6.R1.getConstantState().newDrawable().mutate();
            org.telegram.messenger.wo woVar = this.h6;
            if (woVar != null) {
                int b10 = org.telegram.ui.ActionBar.k6.b(0.1f, org.telegram.ui.ActionBar.k6.I.q() ? -0.1f : -0.08f, woVar.o(org.telegram.ui.ActionBar.k6.I.q()) ? this.h6.k() : this.h6.i());
                Drawable drawable = this.y;
                int S0 = org.telegram.messenger.g0.S0(this.R5, 1.0f, b10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.A0));
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(S0, mode);
                this.I.setColorFilter(org.telegram.messenger.g0.S0(this.R5, 1.0f, -1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.A0)), mode);
            }
            this.J = new org.telegram.ui.Components.wq(new org.telegram.ui.Components.xp(this.y, this.I), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return this.J;
    }

    public final void r5() {
        if (getParentActivity() == null || this.V0 == null) {
            return;
        }
        if (getUserConfig().q()) {
            this.V0.setIcon(R.drawable.menu_profile_colors);
            return;
        }
        Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.A0), PorterDuff.Mode.SRC_IN));
        this.Q6 = drawable;
        Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
        drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.V0.setIcon(new ei.m2(drawable, drawable2, org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f)));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.f30 f30Var = this.r0;
        if (f30Var != null) {
            f30Var.f = bundle.getString("path");
        }
    }

    public final boolean s4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i3 = 0;
        if (!this.r2 || (userFull = this.v2) == null || (botInfo = userFull.bot_info) == null) {
            return false;
        }
        if (botInfo.privacy_policy_url != null) {
            return true;
        }
        ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
        int size = arrayList.size();
        while (i3 < size) {
            TLRPC.BotCommand botCommand = arrayList.get(i3);
            i3++;
            if ("privacy".equals(botCommand.command)) {
                return true;
            }
        }
        return true;
    }

    public final void s5() {
        t5(this.g6);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.f30 f30Var = this.r0;
        if (f30Var == null || (str = f30Var.f) == null) {
            return;
        }
        bundle.putString("path", str);
    }

    public void setAvatarAnimationProgress(float f10) {
        int w02;
        int w03;
        int w04;
        this.k2 = f10;
        this.S1 = f10;
        Q3();
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.setAlpha(f10);
        }
        if (this.J1 == 2) {
            this.f0.setProgressToExpand(f10);
            org.telegram.ui.Components.gf0 gf0Var = this.a0;
            if (gf0Var != null) {
                gf0Var.setParentExpanded(f10);
            }
            Z4(f10);
            org.telegram.ui.Components.cg0 cg0Var = this.c0;
            if (cg0Var != null) {
                cg0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.ku0 ku0Var = this.T;
            if (ku0Var != null) {
                ku0Var.setParentExpanded(f10);
            }
            n5();
            E5();
        }
        this.a.setAlpha(f10);
        this.a.setTranslationX(org.telegram.messenger.g0.L(48.0f) - (org.telegram.messenger.g0.L(48.0f) * f10));
        if (this.J1 != 2 || (w02 = this.s0) == 0) {
            if (this.e1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f1)) {
                    boolean z10 = this.E2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.e6 e6Var = this.A0;
            int[][] iArr = org.telegram.ui.Components.u8.L;
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, e6Var);
        }
        int i3 = this.Y4;
        if (i3 == 0) {
            i3 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.A0);
        }
        this.d1.setBackgroundColor(i0.a.f(f10, i0.a.o(i3, 0), w02));
        org.telegram.ui.Components.zz0 zz0Var = this.m0;
        int f11 = i0.a.f(f10, i3, w02);
        zz0Var.k = true;
        zz0Var.b.setColor(f11);
        if (this.h6 != null) {
            w03 = -1;
        } else {
            if (this.e1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f1)) {
                    boolean z11 = this.E2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.e6 e6Var2 = this.A0;
            int[][] iArr2 = org.telegram.ui.Components.u8.L;
            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.g8, e6Var2);
        }
        this.actionBar.D(i0.a.f(this.S1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.A0), w03), false);
        int w05 = this.h6 == null ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ji, this.A0) : -1;
        int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, this.A0);
        kk kkVar = this.f;
        if (kkVar != null && this.J1 != 2) {
            kkVar.setTextColor(i0.a.f(f10, w06, w05));
        }
        boolean[] zArr = this.K0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.pi, this.A0);
        } else {
            if (this.e1 == 0) {
                if (org.telegram.messenger.t3.S(this.currentAccount, this.f1)) {
                    boolean z12 = this.E2.megagroup;
                }
            }
            org.telegram.ui.ActionBar.e6 e6Var3 = this.A0;
            int[][] iArr3 = org.telegram.ui.Components.u8.L;
            w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, e6Var3);
        }
        int w07 = org.telegram.ui.ActionBar.k6.w0(zArr[0] ? org.telegram.ui.ActionBar.k6.pa : org.telegram.ui.ActionBar.k6.B8, this.A0);
        su0 su0Var = this.r;
        if (su0Var != null && this.J1 != 2) {
            su0Var.setTextColor(i0.a.f(f10, w07, I3(w04, Boolean.valueOf(zArr[0]))));
        }
        this.Q1 = this.R1 * f10;
        long j10 = this.e1;
        if (j10 == 0) {
            j10 = this.f1;
        }
        org.telegram.ui.ActionBar.e6 e6Var4 = this.A0;
        int[][] iArr4 = org.telegram.ui.Components.u8.L;
        int w08 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[org.telegram.ui.Components.u8.e(j10)], e6Var4);
        long j11 = this.e1;
        if (j11 == 0) {
            j11 = this.f1;
        }
        int d = org.telegram.ui.Components.u8.d(j11);
        if (w08 != d) {
            this.q0.h(i0.a.f(f10, d, w08));
            this.f0.invalidate();
        }
        int i10 = this.Z4;
        if (i10 != 0) {
            setNavigationBarColor(i0.a.f(f10, i10, getNavigationBarColor()));
        }
        this.d1.invalidate();
        y4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        wv0 wv0Var = this.e6;
        if (wv0Var != null) {
            wv0Var.invalidate();
        }
        if (a() > 0) {
            qu0 qu0Var = this.f0;
            if (qu0Var != null) {
                qu0Var.setProgressToStoriesInsets(this.S1);
            }
            tu0 tu0Var = this.v0;
            if (tu0Var != null) {
                tu0Var.setProgressToStoriesInsets(this.S1);
            }
            ci.z0 z0Var = this.w0;
            if (z0Var != null) {
                z0Var.setProgressToStoriesInsets(this.S1);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void setParentLayout(org.telegram.ui.ActionBar.q4 q4Var) {
        super.setParentLayout(q4Var);
        org.telegram.messenger.n6 n6Var = this.X1;
        if (n6Var != null) {
            n6Var.e();
            this.X1 = null;
        }
        if (q4Var == null || q4Var.getParentActivity() == null) {
            return;
        }
        this.X1 = new org.telegram.messenger.n6(q4Var.getParentActivity().getWindow(), new jt0(this, 8));
    }

    @Override // org.telegram.ui.Components.lr0
    public final boolean t() {
        return this.d6;
    }

    public final void t4() {
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        this.n2 = point.x > point.y;
    }

    public final void t5(float f10) {
        int S0;
        org.telegram.messenger.wo woVar = this.h6;
        if (woVar != null) {
            S0 = i0.a.f(0.25f, woVar.m(org.telegram.ui.ActionBar.k6.I.q()), -1);
        } else {
            S0 = org.telegram.messenger.g0.S0(this.R5, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ni, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, this.A0));
        }
        int f11 = i0.a.f(f10, S0, -1);
        int i3 = org.telegram.ui.ActionBar.k6.Cj;
        int f12 = i0.a.f(Math.max(this.R5, this.B5), f11, org.telegram.ui.ActionBar.k6.w0(i3, this.A0));
        org.telegram.ui.Components.e5 e5Var = this.G;
        if (e5Var != null) {
            e5Var.k(Integer.valueOf(f12));
        }
        org.telegram.ui.Components.e5 e5Var2 = this.H;
        if (e5Var2 != null) {
            e5Var2.k(Integer.valueOf(i0.a.f(this.R5, i0.a.f(f10, S0, -1711276033), org.telegram.ui.ActionBar.k6.w0(i3, this.A0))));
        }
        this.e0.setColor(f12);
        this.g6 = f10;
    }

    public final boolean u4() {
        if (this.E2 != null) {
            return getMessagesController().o2(this.E2);
        }
        org.telegram.messenger.hp messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.v2;
        messagesController.getClass();
        return org.telegram.messenger.hp.K2(userFull);
    }

    public final void u5() {
        this.e0.setScaleX(this.f.getScaleX());
        this.e0.setScaleY(this.f.getScaleY());
        this.e0.b((this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX(), (this.f.getHeight() - (this.f.getScaleY() * (this.f.getHeight() - this.f.getRightDrawableY()))) + this.f.getY());
    }

    @Override // org.telegram.ui.de0
    public final void v() {
        this.a.y0(0);
    }

    public final boolean v4() {
        return (this.r0 == null || this.s1) ? false : true;
    }

    public final void v5() {
        if (this.q1 || !org.telegram.messenger.t3.c0(this.E2)) {
            return;
        }
        org.telegram.messenger.us notificationsController = getNotificationsController();
        notificationsController.getMessagesStorage().a.c(new org.telegram.messenger.a4(notificationsController, -this.f1, new du0(this), 6));
    }

    public final void w4(boolean z10) {
        boolean c02 = org.telegram.messenger.t3.c0(this.E2);
        TLRPC.Chat chat = this.E2;
        org.telegram.ui.Components.t4.r(this, false, chat, null, false, c02 || z10 || (chat != null && chat.creator), z10, !c02, new jt0(this, 3));
    }

    public final void w5(float f10) {
        cw0 cw0Var;
        ValueAnimator valueAnimator;
        if (this.p2 || ((cw0Var = this.N) != null && (valueAnimator = cw0Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f10);
            this.N.requestLayout();
        }
        ow0 ow0Var = this.d1;
        if (ow0Var != null) {
            ow0Var.F.setTranslate(0.0f, this.a2 - ow0Var.y);
            ow0 ow0Var2 = this.d1;
            RadialGradient radialGradient = ow0Var2.E;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(ow0Var2.F);
            }
            this.d1.invalidate();
        }
        u5();
        n5();
        E5();
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ boolean x() {
        return false;
    }

    public final boolean x4() {
        return getMessagesController().P1().K(a()) && !this.q1;
    }

    public final void x5() {
        float f10 = 0.0f;
        if (!this.q1 && !this.G1) {
            int e42 = e4();
            f10 = e42 > 0 ? b8.be.a(1.0f - (this.Q1 / e42), 0.0f, 1.0f) : b8.be.a((this.c2 - 0.6f) / 0.4f, 0.0f, 1.0f);
        }
        float f11 = this.B5;
        if (f11 != f10) {
            boolean z10 = ((f11 > 0.5f ? 1 : (f11 == 0.5f ? 0 : -1)) > 0) != ((f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1)) > 0);
            this.B5 = f10;
            kk kkVar = this.f;
            if (kkVar != null) {
                kkVar.setTextColor(this.E5);
            }
            su0 su0Var = this.r;
            if (su0Var != null) {
                su0Var.setTextColor(this.F5);
            }
            s5();
            if (z10) {
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.r4, Boolean.TRUE);
            }
            ow0 ow0Var = this.d1;
            if (ow0Var != null) {
                ow0Var.invalidate();
            }
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        A5();
        z5();
    }

    @Override // org.telegram.ui.nw
    public final boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        long j10 = ((org.telegram.messenger.pr) arrayList.get(0)).a;
        Bundle k10 = a1.g.k("scrollToTopOnResume", true);
        if (org.telegram.messenger.m5.C(j10)) {
            k10.putInt("enc_id", (int) (4294967295L & j10));
        } else if (org.telegram.messenger.m5.E(j10)) {
            k10.putLong("user_id", j10);
        } else if (org.telegram.messenger.m5.z(j10)) {
            k10.putLong("chat_id", -j10);
        }
        if (!getMessagesController().E(k10, uwVar, null, null)) {
            return false;
        }
        org.telegram.messenger.hs notificationCenter = getNotificationCenter();
        int i11 = org.telegram.messenger.hs.t;
        notificationCenter.n(this, i11);
        getNotificationCenter().k(i11, new Object[0]);
        presentFragment(new wm(k10), true);
        removeSelfFromStack();
        getSendMessagesHelper().r0(org.telegram.messenger.wy.g(getMessagesController().a2(Long.valueOf(this.e1)), j10, null, null, null, null, z11, i3, i10));
        if (!TextUtils.isEmpty(charSequence)) {
            org.telegram.messenger.yy.a0(org.telegram.messenger.c.a(this.currentAccount), charSequence, j10, 0L, z11, i3, i10);
        }
        return true;
    }

    public final void y4(boolean z10) {
        float f10;
        float f11;
        org.telegram.ui.Components.k9 currentItemView;
        float f12;
        float f13;
        TLRPC.ChatFull chatFull;
        this.glassEngine.g();
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        float L3 = L3();
        hu0 hu0Var = this.a;
        if (hu0Var != null && !this.G1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hu0Var.getLayoutParams();
            if (layoutParams.topMargin != currentActionBarHeight) {
                layoutParams.topMargin = currentActionBarHeight;
                this.a.setLayoutParams(layoutParams);
            }
        }
        O5(z10);
        if (this.Y != null) {
            this.a.setTopGlowOffset((int) this.Q1);
            this.a.setOverScrollMode((this.Q1 <= ((float) j4()) || this.Q1 >= ((float) ((e4() + this.a.getMeasuredWidth()) - currentActionBarHeight))) ? 0 : 2);
        }
        if (this.Y != null && !this.d6 && this.G1) {
            K3();
            return;
        }
        int j42 = j4();
        if (this.Y != null) {
            if (this.a0 != null && this.f1 != 0) {
                this.a0.o(2, (!org.telegram.messenger.t3.T(this.E2) || this.E2.megagroup || (chatFull = this.u2) == null || chatFull.linked_chat_id == 0) ? false : true);
            }
            O5(z10);
            float translationY = this.actionBar.getTranslationY() + (org.telegram.messenger.camera.q.b(L3, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0) - org.telegram.messenger.g0.L(21.0f));
            if (this.G1) {
                this.a2 = translationY;
            } else {
                org.telegram.ui.Components.zf0 zf0Var = this.u0;
                if (zf0Var != null) {
                    f13 = -org.telegram.messenger.g0.L(29.0f);
                    org.telegram.messenger.tr trVar = zf0Var.n;
                    if (trVar != null && trVar.c) {
                        f13 = trVar.e.centerY();
                    }
                } else {
                    f13 = -org.telegram.messenger.g0.L(29.0f);
                }
                this.a2 = org.telegram.messenger.g0.T1(f13, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.L(21.0f)), L3);
            }
            float f14 = this.G1 ? this.R1 : this.Q1;
            float f15 = j42;
            if (f14 > f15 || this.p2) {
                f10 = 2.0f;
                float max = Math.max(0.0f, Math.min(1.0f, (f14 - f15) / ((this.a.getMeasuredWidth() - currentActionBarHeight) - k4())));
                this.h2 = max;
                f11 = 18.0f;
                this.b2 = (org.telegram.messenger.g0.T1(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) / 100.0f) * 42.0f;
                this.c2 = 0.0f;
                tu0 tu0Var = this.v0;
                if (tu0Var != null) {
                    tu0Var.invalidate();
                }
                ci.z0 z0Var = this.w0;
                if (z0Var != null) {
                    z0Var.invalidate();
                }
                float min = Math.min(org.telegram.messenger.g0.N(2000.0f), Math.max(org.telegram.messenger.g0.N(1100.0f), Math.abs(this.i2))) / org.telegram.messenger.g0.N(1100.0f);
                e4();
                boolean z11 = this.o2;
                int i3 = org.telegram.messenger.hs.r4;
                float[] fArr = this.m2;
                if (!z11 || (!this.G0 && this.h2 < 0.33f)) {
                    if (this.p2) {
                        this.p2 = false;
                        org.telegram.messenger.hs.e().k(i3, Boolean.TRUE);
                        org.telegram.ui.ActionBar.f5 f5Var = this.T0;
                        if (f5Var != null) {
                            f5Var.t(21);
                            if (this.r0 != null) {
                                this.T0.t(33);
                                this.T0.t(34);
                                this.T0.t(35);
                                this.T0.S(36);
                                this.T0.S(31);
                            }
                        }
                        org.telegram.ui.ActionBar.f5 f5Var2 = this.U0;
                        if (f5Var2 != null) {
                            f5Var2.setEnabled(!this.z1);
                        }
                        this.N.f(false, min);
                        this.p0.b(min);
                        this.j2.cancel();
                        this.f0.getImageReceiver().u0 = true;
                        this.f0.getImageReceiver().P0(false);
                        float U1 = org.telegram.messenger.g0.U1(this.l2, fArr);
                        fArr[0] = U1;
                        fArr[1] = 0.0f;
                        this.j2.setInterpolator(org.telegram.ui.Components.xq.j);
                        if (this.n2) {
                            this.j2.setDuration(0L);
                        } else {
                            this.j2.setDuration((long) ((U1 * 250.0f) / min));
                        }
                        this.d1.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.A0));
                        if (!this.I0 && (currentItemView = this.o0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().t() instanceof org.telegram.ui.Components.x41) {
                                this.f0.b0 = false;
                            } else {
                                qu0 qu0Var = this.f0;
                                qu0Var.b0 = true;
                                qu0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().u());
                            }
                        }
                        this.j2.addListener(new uu0(this, 5));
                        this.f0.setForegroundAlpha(1.0f);
                        this.Y.setVisibility(0);
                        this.o0.setAlpha(0.0f);
                        this.j2.start();
                        this.P1 = false;
                        try {
                            this.Y.performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                    }
                    this.Y.setScaleX(this.b2);
                    this.Y.setScaleY(this.b2);
                    d4();
                    ValueAnimator valueAnimator = this.j2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        R4();
                        this.f.setTranslationY(this.e2);
                        this.r.setTranslationX(m4(this.f2, this.w6));
                        this.r.setTranslationY(n4(this.g2));
                        q5();
                    }
                } else {
                    if (!this.p2) {
                        if (this.T0 != null) {
                            if (u4()) {
                                this.T0.t(21);
                            } else {
                                this.T0.S(21);
                            }
                            if (this.r0 != null) {
                                this.T0.S(36);
                                this.T0.S(34);
                                this.T0.S(35);
                                this.T0.t(33);
                                this.T0.t(31);
                            }
                        }
                        org.telegram.ui.ActionBar.f5 f5Var3 = this.U0;
                        if (f5Var3 != null) {
                            f5Var3.setEnabled(false);
                        }
                        this.p2 = true;
                        org.telegram.messenger.hs.e().k(i3, Boolean.TRUE);
                        this.N.f(true, min);
                        this.p0.b(min);
                        this.o0.setCreateThumbFromParent(true);
                        this.o0.getAdapter().g();
                        this.j2.cancel();
                        float U12 = org.telegram.messenger.g0.U1(this.l2, fArr);
                        fArr[0] = U12;
                        fArr[1] = 1.0f;
                        tu0 tu0Var2 = this.v0;
                        if (tu0Var2 == null || tu0Var2.x.isEmpty()) {
                            this.j2.setInterpolator(org.telegram.ui.Components.xq.j);
                            this.j2.setDuration((long) (((1.0f - U12) * 250.0f) / min));
                        } else {
                            this.j2.setInterpolator(new w1.a());
                            this.j2.setDuration((long) ((((1.0f - U12) * 1.3f) * 250.0f) / min));
                        }
                        this.j2.addListener(new uu0(this, 4));
                        View m10 = this.c.m(0);
                        if (!this.P1 && m10 != null) {
                            this.O1 = true;
                            this.a.x0(((m10.getTop() - this.a.getMeasuredWidth()) - e4()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0), (int) this.j2.getDuration(), (Interpolator) this.j2.getInterpolator());
                            this.a.P0 = false;
                        }
                        this.b6 = this.f.getTranslationY();
                        this.c6 = this.r.getTranslationY();
                        this.j2.start();
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
                    if (!this.j2.isRunning()) {
                        float L = (this.G1 && this.J1 == 2) ? (-(1.0f - this.S1)) * org.telegram.messenger.g0.L(50.0f) : 0.0f;
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
            boolean z12 = this.G1;
            if (z12 && this.J1 == 2) {
                float f17 = this.f6;
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / f10) + (this.actionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0)) - (org.telegram.messenger.g0.p * 21.0f));
                this.f.setPivotY(r6.getMeasuredHeight());
                this.f.setScaleX(1.38f);
                this.f.setScaleY(1.38f);
                this.b2 = org.telegram.messenger.g0.W1(this.S1, 42, org.telegram.messenger.hs.U1) / 100.0f;
                this.c2 = 0.0f;
                tu0 tu0Var3 = this.v0;
                if (tu0Var3 != null) {
                    tu0Var3.setExpandProgress(1.0f);
                }
                ci.z0 z0Var2 = this.w0;
                if (z0Var2 != null) {
                    z0Var2.setExpandProgress(1.0f);
                }
                this.f0.setRoundRadiusForExpand((int) org.telegram.messenger.g0.T1(q4(), 0.0f, this.S1));
                this.Y.setTranslationX(org.telegram.messenger.g0.T1(f17, 0.0f, this.S1));
                this.Y.setTranslationY(org.telegram.messenger.g0.T1((float) Math.ceil(translationY2), 0.0f, this.S1));
                float measuredWidth = ((this.b2 * 100.0f) / 42.0f) * (this.Y.getMeasuredWidth() - org.telegram.messenger.g0.L(42.0f));
                this.i0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(16.0f) + measuredWidth);
                this.i0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(-10.0f) + measuredWidth);
                this.j0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.j0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(26.5f) + measuredWidth);
                this.k0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.k0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + measuredWidth);
                this.l0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + measuredWidth);
                this.l0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + measuredWidth);
                this.Y.setScaleX(this.b2);
                this.Y.setScaleY(this.b2);
                this.o0.setAlpha(0.0f);
                this.o0.setVisibility(0);
                qu0 qu0Var2 = this.f0;
                float f18 = this.S1;
                float f19 = this.b2;
                qu0Var2.I = f18;
                qu0Var2.J = f19;
                qu0Var2.H = true;
                this.N.e(false, f18);
                this.actionBar.D(i0.a.f(this.S1, this.h6 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.A0), -1), false);
                org.telegram.ui.Components.kk0 kk0Var = this.L;
                if (kk0Var != null) {
                    kk0Var.b(i0.a.f(this.S1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, this.A0), Color.argb(org.telegram.messenger.hs.J2, org.telegram.messenger.hs.e4, org.telegram.messenger.hs.e4, org.telegram.messenger.hs.e4)));
                }
                Drawable drawable = this.x;
                if (drawable != null) {
                    drawable.setColorFilter(this.h6 == null ? i0.a.f(this.S1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.dd, this.A0), -1) : -1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.wq wqVar = this.J;
                if (wqVar != null) {
                    wqVar.a(this.S1);
                    this.f.invalidate();
                }
                org.telegram.ui.Components.wq wqVar2 = this.K;
                if (wqVar2 != null) {
                    wqVar2.a(this.S1);
                    this.f.invalidate();
                }
                t5(this.S1);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                layoutParams3.width = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), this.a.getMeasuredWidth() / this.b2, this.S1);
                layoutParams3.height = (int) org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(100.0f), (this.Q1 + currentActionBarHeight) / this.b2, this.S1);
                this.Y.requestLayout();
                q5();
            } else if (f14 <= f15) {
                if (z12) {
                    this.b2 = org.telegram.messenger.g0.W1(L3, 42, 96) / 100.0f;
                    this.c2 = 0.0f;
                    f12 = 1.0f;
                } else {
                    org.telegram.ui.Components.zf0 zf0Var2 = this.u0;
                    this.b2 = org.telegram.messenger.g0.T1(zf0Var2 != null ? zf0Var2.getHiddenAvatarSizeDp() : 24.0f, 96.0f, L3) / 100.0f;
                    f12 = 1.0f;
                    this.c2 = 1.0f - L3;
                }
                org.telegram.ui.Components.gf0 gf0Var = this.a0;
                if (gf0Var != null) {
                    if (this.G1) {
                        gf0Var.setAlpha(this.S1);
                    } else {
                        gf0Var.setAlpha(f12);
                    }
                }
                tu0 tu0Var4 = this.v0;
                if (tu0Var4 != null) {
                    tu0Var4.invalidate();
                }
                ci.z0 z0Var3 = this.w0;
                if (z0Var3 != null) {
                    z0Var3.h = this.G1;
                    float l10 = Utilities.l((L3 - 0.3f) / 0.7f);
                    if (z0Var3.f != l10) {
                        z0Var3.f = l10;
                        z0Var3.invalidate();
                    }
                }
                float f20 = (0.12f * L3) + 1.0f;
                ValueAnimator valueAnimator2 = this.j2;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    this.Y.setScaleX(this.b2);
                    this.Y.setScaleY(this.b2);
                    d4();
                    this.Y.setTranslationY((float) Math.ceil(this.a2));
                    float L2 = (((this.b2 * 100.0f) / 42.0f) * org.telegram.messenger.g0.L(42.0f)) - org.telegram.messenger.g0.L(42.0f);
                    this.i0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(16.0f) + L2);
                    this.i0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(-10.0f) + L2);
                    this.j0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L2);
                    this.j0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(26.5f) + L2);
                    this.k0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L2);
                    this.k0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L2);
                    this.l0.setTranslationX(this.Y.getX() + org.telegram.messenger.g0.L(28.0f) + L2);
                    this.l0.setTranslationY(this.Y.getY() + org.telegram.messenger.g0.L(24.0f) + L2);
                } else {
                    ValueAnimator valueAnimator3 = this.j2;
                    uu0 uu0Var = this.Z5;
                    valueAnimator3.removeListener(uu0Var);
                    this.j2.addListener(uu0Var);
                }
                float N = ((org.telegram.messenger.g0.N(8.0f) + (this.Y.getScaleY() * this.Y.getHeight())) * (this.G1 ? this.S1 : L3)) + ((float) Math.floor(translationY));
                this.e2 = com.google.android.recaptcha.internal.a.y(1.0f, this.S1, 0.0f, (org.telegram.messenger.g0.L(7.0f) * L3) + org.telegram.messenger.g0.L(1.3f) + N);
                this.g2 = (((float) Math.floor(org.telegram.messenger.g0.p * 11.0f)) * L3) + N + org.telegram.messenger.g0.L(24.0f);
                float L4 = this.G1 ? (this.f6 - org.telegram.messenger.g0.L(109.0f)) + org.telegram.messenger.g0.L(48.0f) : -org.telegram.messenger.g0.N(46.0f);
                mw0 mw0Var = this.z6;
                if (mw0Var != null) {
                    mw0Var.setAlpha((int) (255.0f * L3));
                }
                int measuredWidth2 = this.a.getMeasuredWidth();
                this.f.setScaleX(f20);
                this.f.setScaleY(f20);
                z4(0, L3, false);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                float f21 = measuredWidth2 / f10;
                float min2 = f21 - (((Math.min(this.f.getExactWidth(), layoutParams4.width) * f20) * 0.5f) + layoutParams4.leftMargin);
                float f22 = ((FrameLayout.LayoutParams) this.r.getLayoutParams()).width;
                float paddingLeft = (this.q5 || this.r.getExactWidth() > (f22 - ((float) this.r.getPaddingLeft())) - ((float) this.r.getPaddingRight())) ? 0.0f : this.r.getPaddingLeft();
                float min3 = f21 - ((Math.min(this.r.getExactWidth(), f22) * 0.5f) + (r7.leftMargin + paddingLeft));
                this.d2 = min2;
                this.f2 = min3;
                this.w6 = paddingLeft;
                if (this.G1) {
                    min2 = org.telegram.messenger.g0.T1(L4, min2, L3);
                    min3 = org.telegram.messenger.g0.T1(L4, min3, L3);
                }
                ValueAnimator valueAnimator4 = this.j2;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    this.f.setTranslationX(min2);
                    this.f.setTranslationY(this.e2);
                    this.r.setTranslationX(m4(min3, this.w6 * L3));
                    this.r.setTranslationY(n4(this.g2));
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
            ValueAnimator valueAnimator5 = this.j2;
            if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                z4(0, L3, true);
            }
        }
        w5(currentActionBarHeight);
        if (L3 >= 1.0f) {
            this.f0.setAlpha(1.0f);
        }
    }

    public final void y5() {
        mv0 mv0Var = this.O;
        if (mv0Var == null || this.W5 == 0) {
            return;
        }
        int topPanelShift = mv0Var.getTopPanelShift();
        int i3 = 0;
        if (topPanelShift > 0 && this.O.isAttachedToWindow()) {
            if (this.O.getParent() == this.a) {
                topPanelShift = Math.max(0, topPanelShift - Math.max(0, (int) this.O.getY()));
            }
            i3 = topPanelShift;
        }
        int i10 = this.W5 + i3;
        c5(i10, this.C5);
        c5(i10, this.U5);
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
    public final void z4(int i3, float f10, boolean z10) {
        float scaleX;
        float f11;
        int i10;
        int ceil;
        ValueAnimator valueAnimator;
        if (this.Q1 > j4() || ((valueAnimator = this.j2) != null && valueAnimator.isRunning())) {
            scaleX = this.f.getScaleX();
        } else {
            if (f10 < 1.0f) {
                f11 = 1.12f;
                scaleX = 1.0f;
                int L = !org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.L(490.0f) : org.telegram.messenger.g0.q.x;
                org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
                int max = L - (((int) Math.max(org.telegram.messenger.g0.L(64.0f), (y4Var == null ? y4Var.o().getTargetPillWidth() : org.telegram.messenger.g0.L(46.0f)) + org.telegram.messenger.g0.L(18.0f))) * 2);
                int i11 = (int) (max / (i3 == 0 ? scaleX : 1.0f));
                int A = i3 == 0 ? i3 : org.telegram.messenger.camera.q.A(18.0f, 2, L);
                if (i3 == 0) {
                    i3 = (int) (A / f11);
                }
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.i;
                int W1 = org.telegram.messenger.g0.W1(xqVar.getInterpolation(f10), i11, i3);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i12 = layoutParams.width;
                layoutParams.width = (int) Math.ceil(W1);
                if (z10) {
                    layoutParams.width = Math.min(layoutParams.width, (int) (((L - org.telegram.messenger.g0.L(18.0f)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams.leftMargin)));
                }
                if (z10 && layoutParams.width != i12) {
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
        int i112 = (int) (max2 / (i3 == 0 ? scaleX : 1.0f));
        if (i3 == 0) {
        }
        if (i3 == 0) {
        }
        org.telegram.ui.Components.xq xqVar2 = org.telegram.ui.Components.xq.i;
        int W13 = org.telegram.messenger.g0.W1(xqVar2.getInterpolation(f10), i112, i3);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        int i122 = layoutParams3.width;
        layoutParams3.width = (int) Math.ceil(W13);
        if (z10) {
        }
        if (z10) {
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
        if (this.C5 == null || this.U5 == null) {
            return;
        }
        mv0 mv0Var = this.O;
        boolean z10 = mv0Var != null && mv0Var.getParent() == this.a && this.O.isAttachedToWindow();
        float max = Math.max(Math.min(this.B5, this.M5), this.R5);
        this.C5.setAlpha(z10 ? 0.0f : max);
        this.C5.setVisibility((z10 || max <= 0.0f) ? 8 : 0);
        View view = this.U5;
        if (!z10) {
            max = 0.0f;
        }
        view.setAlpha(max);
        if (z10) {
            this.U5.setTranslationY(-(this.O.getY() + this.a.getY()));
        }
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.os0 os0Var) {
        super(bundle);
        this.h = null;
        this.n = null;
        this.x0 = null;
        int i3 = 2;
        this.y0 = new org.telegram.ui.Components.p30(this, i3);
        this.z0 = new Paint(1);
        this.K0 = new boolean[1];
        this.b1 = 1.0f;
        this.C1 = new a0.h();
        this.M1 = true;
        this.N1 = false;
        this.O1 = false;
        this.P1 = false;
        this.Y1 = new HashMap();
        this.m2 = new float[]{0.0f, 1.0f};
        this.q2 = new Paint();
        this.B2 = -1;
        this.L2 = new Rect();
        this.R4 = new ArrayList();
        this.S4 = new ArrayList();
        this.T4 = 0;
        this.U4 = true;
        this.V4 = true;
        this.Y4 = 0;
        this.Z4 = 0;
        this.a5 = 0;
        this.b5 = 0L;
        this.i5 = new HashSet();
        this.k5 = new wu0(this, 0);
        this.l5 = new cv0(this);
        this.I5 = new gu0(this);
        this.M5 = 1.0f;
        this.N5 = new qe.a(0, new jt0(this, 7), org.telegram.ui.Components.xq.h, 380L, true);
        this.T5 = new wu0(this, 1);
        this.Z5 = new uu0(this, i3);
        this.a6 = null;
        this.i6 = new SparseIntArray();
        this.k6 = null;
        this.l6 = -1;
        this.q6 = new int[3];
        this.r6 = -1.0f;
        si.b bVar = new si.b();
        this.K6 = bVar;
        eh.c cVar = new eh.c(bVar, bVar, bVar);
        this.L6 = cVar;
        this.N6 = new Paint();
        this.S6 = new int[7];
        this.R = os0Var;
        cVar.g = new ue.b();
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ void T() {
    }
}
