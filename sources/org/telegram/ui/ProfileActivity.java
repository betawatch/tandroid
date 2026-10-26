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
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
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
import j$.util.function.Consumer$-CC;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AgentController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotchInfoUtils;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class ProfileActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, ux, org.telegram.ui.Components.tv0, org.telegram.ui.Components.f50, org.telegram.ui.Components.mu0, og0 {
    public static final int R6 = AndroidUtilities.dp(16.0f);
    public int A0;
    public boolean A1;
    public long A2;
    public int A3;
    public int A4;
    public SpannableStringBuilder A5;
    public final ch.f A6;
    public ImageLocation B0;
    public boolean B1;
    public int B2;
    public int B3;
    public int B4;
    public SpannableStringBuilder B5;
    public final hh.d B6;
    public int C0;
    public a0.h C1;
    public ArrayList C2;
    public int C3;
    public int C4;
    public fi.d[] C5;
    public final hh.c C6;
    public int D0;
    public boolean D1;
    public TLRPC.EncryptedChat D2;
    public int D3;
    public int D4;
    public org.telegram.messenger.u8 D5;
    public final ch.b D6;
    public Long E;
    public int E0;
    public long E1;
    public TLRPC.Chat E2;
    public int E3;
    public int E4;
    public FrameLayout E5;
    public final hh.b E6;
    public org.telegram.ui.Components.r5 F;
    public boolean F0;
    public float F1;
    public TL_bots.BotInfo F2;
    public int F3;
    public int F4;
    public fi.d F5;
    public final ch.b F6;
    public org.telegram.ui.Components.r5 G;
    public boolean G0;
    public boolean G1;
    public TLRPC.ChannelParticipant G2;
    public int G3;
    public int G4;
    public final oe.b G5;
    public jh.k G6;
    public Drawable H;
    public boolean H0;
    public boolean H1;
    public TL_account.TL_password H2;
    public int H3;
    public int H4;
    public fz0 H5;
    public bi.g H6;
    public org.telegram.ui.Components.cs I;
    public boolean I0;
    public boolean I1;
    public TLRPC.FileLocation I2;
    public int I3;
    public int I4;
    public AnimatorSet I5;
    public final ArrayList I6;
    public org.telegram.ui.Components.cs J;
    public final boolean[] J0;
    public int J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public int J4;
    public AnimatorSet J5;
    public final RectF J6;
    public org.telegram.ui.Components.en0 K;
    public boolean K0;
    public boolean K1;
    public ImageLocation K2;
    public int K3;
    public int K4;
    public float K5;
    public final RectF K6;
    public UndoView L;
    public boolean L0;
    public boolean L1;
    public final Rect L2;
    public int L3;
    public int L4;
    public boolean L5;
    public final hh.c[] L6;
    public k01 M;
    public boolean M0;
    public boolean M1;
    public org.telegram.ui.Cells.v8 M2;
    public int M3;
    public int M4;
    public final jz0 M5;
    public Drawable M6;
    public vz0 N;
    public boolean N0;
    public boolean N1;
    public int N2;
    public int N3;
    public boolean N4;
    public View N5;
    public Drawable N6;
    public org.telegram.ui.Components.ey0 O;
    public ImageView O0;
    public boolean O1;
    public int O2;
    public int O3;
    public boolean O4;
    public boolean O5;
    public Drawable O6;
    public boolean P;
    public org.telegram.ui.ActionBar.w0 P0;
    public boolean P1;
    public int P2;
    public int P3;
    public int P4;
    public final mz0 P5;
    public org.telegram.ui.Components.zq P6;
    public org.telegram.ui.Components.sv0 Q;
    public org.telegram.ui.ActionBar.w0 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public int Q4;
    public float[] Q5;
    public final int[] Q6;
    public boolean R;
    public org.telegram.ui.ActionBar.w0 R0;
    public float R1;
    public int R2;
    public int R3;
    public int R4;
    public float R5;
    public org.telegram.ui.Components.ox0 S;
    public org.telegram.ui.ActionBar.w0 S0;
    public float S1;
    public int S2;
    public int S3;
    public int S4;
    public float S5;
    public z10 T;
    public org.telegram.ui.ActionBar.w0 T0;
    public int T1;
    public int T2;
    public int T3;
    public boolean T4;
    public boolean T5;
    public org.telegram.ui.Components.xj0 U;
    public org.telegram.ui.ActionBar.w0 U0;
    public float U1;
    public int U2;
    public int U3;
    public boolean U4;
    public e01 U5;
    public org.telegram.ui.Components.xj0 V;
    public org.telegram.ui.ActionBar.g1 V0;
    public ValueAnimator V1;
    public int V2;
    public int V3;
    public int V4;
    public float V5;
    public org.telegram.ui.Components.t40 W;
    public org.telegram.ui.ActionBar.g1 W0;
    public boolean W1;
    public int W2;
    public int W3;
    public final ArrayList W4;
    public float W5;
    public k0 X;
    public org.telegram.ui.ActionBar.g1 X0;
    public FlagSecureReason X1;
    public int X2;
    public int X3;
    public final ArrayList X4;
    public MessagesController.PeerColor X5;
    public bh.p Y;
    public ImageView Y0;
    public final HashMap Y1;
    public int Y2;
    public int Y3;
    public int Y4;
    public final SparseIntArray Y5;
    public org.telegram.ui.Components.bi0 Z;
    public org.telegram.ui.ActionBar.g1 Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public boolean Z4;
    public int Z5;
    public py0 a;
    public MessagesController.SavedMusicList a0;
    public org.telegram.ui.Components.r8 a1;
    public float a2;
    public int a3;
    public int a4;
    public boolean a5;
    public AnimatorSet a6;
    public org.telegram.ui.Components.mm0 b;
    public org.telegram.ui.Components.ui0 b0;
    public float b1;
    public float b2;
    public int b3;
    public int b4;
    public dz0 b5;
    public int b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public ry0 c;
    public org.telegram.ui.Components.ci0 c0;
    public int c1;
    public float c2;
    public int c3;
    public int c4;
    public View c5;
    public int c6;
    public j01 d;
    public org.telegram.ui.Cells.o d0;
    public x01 d1;
    public float d2;
    public int d3;
    public int d4;
    public int d5;
    public boolean d6;
    public u01 e;
    public yy0 e0;
    public long e1;
    public float e2;
    public int e3;
    public int e4;
    public int e5;
    public boolean e6;
    public fl f;
    public AnimatorSet f0;
    public long f1;
    public float f2;
    public int f3;
    public int f4;
    public int f5;
    public org.telegram.ui.Components.ak0 f6;
    public org.telegram.ui.Cells.d4 g0;
    public long g1;
    public float g2;
    public int g3;
    public int g4;
    public long g5;
    public final int[] g6;
    public String h;
    public ImageView h0;
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
    public boolean i5;
    public CharSequence i6;
    public ImageView j0;
    public boolean j1;
    public ValueAnimator j2;
    public int j3;
    public int j4;
    public String j5;
    public CharSequence j6;
    public ImageView k0;
    public boolean k1;
    public float k2;
    public int k3;
    public int k4;
    public String k5;
    public boolean k6;
    public org.telegram.ui.Components.e31 l0;
    public boolean l1;
    public float l2;
    public int l3;
    public int l4;
    public String l5;
    public float l6;
    public org.telegram.ui.Components.ei0 m0;
    public long m1;
    public final float[] m2;
    public int m3;
    public int m4;
    public org.telegram.ui.Components.bh m5;
    public float m6;
    public String n;
    public zy0 n0;
    public boolean n1;
    public boolean n2;
    public int n3;
    public int n4;
    public final HashSet n5;
    public float n6;
    public m01 o0;
    public boolean o1;
    public boolean o2;
    public int o3;
    public int o4;
    public CharacterStyle o5;
    public float o6;
    public org.telegram.ui.Components.j9 p0;
    public boolean p1;
    public boolean p2;
    public int p3;
    public int p4;
    public final org.telegram.ui.Cells.b2 p5;
    public v01 p6;
    public org.telegram.ui.Components.g50 q0;
    public boolean q1;
    public final Paint q2;
    public int q3;
    public int q4;
    public final kz0 q5;
    public b11 q6;
    public az0 r;
    public int r0;
    public boolean r1;
    public boolean r2;
    public int r3;
    public int r4;
    public boolean r5;
    public fi.v3 r6;
    public org.telegram.ui.Components.ak0 s;
    public org.telegram.ui.Components.e31 s0;
    public boolean s1;
    public hi.b1 s2;
    public int s3;
    public int s4;
    public tz0 s5;
    public int s6;
    public org.telegram.ui.Components.ri0 t0;
    public boolean t1;
    public hi.y t2;
    public int t3;
    public int t4;
    public float t5;
    public Boolean t6;
    public bz0 u0;
    public int u1;
    public TLRPC.ChatFull u2;
    public int u3;
    public int u4;
    public float u5;
    public TLRPC.TL_emojiStatusCollectible u6;
    public AnimatorSet v;
    public bi.i1 v0;
    public boolean v1;
    public TLRPC.UserFull v2;
    public int v3;
    public int v4;
    public boolean v5;
    public int v6;
    public Drawable w;
    public View w0;
    public boolean w1;
    public org.telegram.ui.Cells.k6 w2;
    public int w3;
    public int w4;
    public boolean w5;
    public boolean w6;
    public Drawable x;
    public final org.telegram.ui.Components.r50 x0;
    public boolean x1;
    public boolean x2;
    public int x3;
    public int x4;
    public ImageReceiver x5;
    public int x6;
    public Drawable y;
    public final Paint y0;
    public int y1;
    public y01 y2;
    public int y3;
    public int y4;
    public FrameLayout y5;
    public int y6;
    public org.telegram.ui.ActionBar.u6 z0;
    public boolean z1;
    public CharSequence z2;
    public int z3;
    public int z4;
    public FrameLayout[] z5;
    public int z6;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static void C0(ProfileActivity profileActivity) {
        RectF rectF = profileActivity.K6;
        ch.f fVar = profileActivity.A6;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (profileActivity.fragmentView.getMeasuredHeight() - profileActivity.z6) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        profileActivity.J6.set(0.0f, -dp, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.actionBar.getMeasuredHeight() + dp);
        rectF.set(0.0f, dp2, profileActivity.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(2, profileActivity.I6);
        fVar.e(profileActivity.H6, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.fragmentView.getMeasuredHeight());
    }

    public static void H0(ProfileActivity profileActivity, int i10) {
        boolean E0 = org.telegram.ui.Components.aw0.E0(profileActivity.N.getClosestTab());
        if (i10 == profileActivity.v6 && E0 == profileActivity.w6) {
            return;
        }
        profileActivity.v6 = i10;
        profileActivity.w6 = E0;
        if (E0) {
            if (i10 > 0) {
                profileActivity.C5[0].i(LocaleController.formatPluralString("HideStoriesFromAlbum", i10, new Object[0]), true, true);
                return;
            } else {
                profileActivity.C5[0].i(profileActivity.B5, true, true);
                return;
            }
        }
        if (i10 > 0 || !MessagesController.getInstance(profileActivity.currentAccount).storiesEnabled()) {
            profileActivity.C5[0].i(LocaleController.formatPluralString("ArchiveStories", i10, new Object[0]), true, true);
        } else {
            profileActivity.C5[0].i(profileActivity.A5, true, true);
        }
    }

    public static ValueAnimator I0(final ProfileActivity profileActivity, final boolean z10) {
        if (z10) {
            AndroidUtilities.requestAdjustResize(profileActivity.getParentActivity(), profileActivity.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.V1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.V1.cancel();
        }
        bi.i1 i1Var = profileActivity.v0;
        if (i1Var != null) {
            i1Var.setActive(!z10);
        }
        int i10 = 0;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(profileActivity.U1, z10 ? 0.0f : 1.0f);
        final float f7 = profileActivity.Q1;
        profileActivity.b.setTranslationY(f7);
        profileActivity.b.setVisibility(0);
        profileActivity.U0.setVisibility(0);
        profileActivity.a.setVisibility(0);
        profileActivity.r4(true);
        profileActivity.X.setVisibility(0);
        profileActivity.f.setVisibility(0);
        profileActivity.r.setVisibility(0);
        profileActivity.actionBar.t(profileActivity.U1 > 0.5f);
        int i11 = profileActivity.U1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.T0;
        if (w0Var != null) {
            w0Var.setVisibility(i11);
        }
        profileActivity.U0.setVisibility(i11);
        profileActivity.U0.getSearchContainer().setVisibility(profileActivity.U1 <= 0.5f ? 0 : 8);
        profileActivity.b.setEmptyView(profileActivity.O);
        profileActivity.X.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ny0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.g0(ProfileActivity.this, ofFloat, f7, z10);
            }
        });
        ofFloat.addListener(new nz0(profileActivity, z10, i10));
        if (!z10) {
            profileActivity.a5 = true;
            profileActivity.N4();
            AndroidUtilities.requestAdjustNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.O.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.ds.f);
        profileActivity.V1 = ofFloat;
        return ofFloat;
    }

    public static SpannableStringBuilder P3(String str, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        oz0 oz0Var = new oz0(9);
        oz0Var.v = str;
        if (oz0Var.c != null) {
            oz0Var.c = null;
            oz0Var.a();
        }
        oz0Var.f = w02;
        oz0Var.n = false;
        spannableStringBuilder.setSpan(oz0Var, 0, spannableStringBuilder.length(), 0);
        m00[] m00VarArr = (m00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), m00.class);
        if (m00VarArr != null) {
            for (m00 m00Var : m00VarArr) {
                m00Var.getClass();
                m00Var.f = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
                m00Var.r = i10;
                m00Var.s = u6Var;
                m00Var.n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static void P4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(activity, 3, null);
        e2Var.i0 = false;
        e2Var.show();
        Utilities.globalQueue.postRunnable(new d80(e2Var, z10, activity));
    }

    public static void S4(FrameLayout frameLayout, float f7) {
        frameLayout.animate().cancel();
        frameLayout.setTranslationY(R6 * f7);
        frameLayout.setAlpha(1.0f - f7);
        frameLayout.setVisibility(f7 < 1.0f ? 0 : 4);
    }

    public static void V(ProfileActivity profileActivity) {
        TLRPC.Document f7;
        org.telegram.ui.Components.qc h;
        if (profileActivity.J2 != null) {
            return;
        }
        if (!profileActivity.q1 || profileActivity.getMessagesController().premiumFeaturesBlocked()) {
            if (profileActivity.T3()) {
                return;
            }
            profileActivity.E4(false);
            return;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = profileActivity.getMessagesController().getTopicsController().getTopics(profileActivity.f1);
        if (topics != null) {
            TLRPC.TL_forumTopic tL_forumTopic = null;
            for (int i10 = 0; tL_forumTopic == null && i10 < topics.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i10);
                if (tL_forumTopic2 != null && tL_forumTopic2.id == profileActivity.g1) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
            if (tL_forumTopic != null) {
                long j10 = tL_forumTopic.icon_emoji_id;
                if (j10 == 0 || (f7 = org.telegram.ui.Components.t5.f(profileActivity.currentAccount, j10)) == null || (h = org.telegram.ui.Components.wc.b0(profileActivity).h(f7, 1, new ay0(profileActivity, 3))) == null) {
                    return;
                }
                h.j();
            }
        }
    }

    public static void V0(ProfileActivity profileActivity, String str, StringBuilder sb2) {
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

    public static /* synthetic */ void W(ProfileActivity profileActivity) {
        MessagesController.getInstance(profileActivity.currentAccount).deleteUserPhoto(null);
        profileActivity.U.M(0);
        profileActivity.V.M(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void X(ProfileActivity profileActivity, int i10) {
        boolean z10;
        if (i10 < 0) {
            return;
        }
        Object valueOf = Integer.valueOf(profileActivity.T2);
        u01 u01Var = profileActivity.e;
        if (!u01Var.w) {
            if (!u01Var.v.isEmpty()) {
                i10--;
            }
            if (i10 < 0 || i10 >= profileActivity.e.v.size()) {
                int f7 = ic.a.f(1, i10, profileActivity.e.v);
                if (f7 >= 0 && f7 < profileActivity.e.d.size()) {
                    valueOf = profileActivity.e.d.get(f7);
                    z10 = false;
                    if (!(valueOf instanceof t01)) {
                        t01 t01Var = (t01) valueOf;
                        org.telegram.ui.ActionBar.j5 parentLayout = profileActivity.getParentLayout();
                        t01Var.b.run();
                        AndroidUtilities.scrollToFragmentRow(parentLayout, t01Var.c);
                    } else if (valueOf instanceof MessagesController.FaqSearchResult) {
                        NotificationCenter.getInstance(profileActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, profileActivity.e.E, ((MessagesController.FaqSearchResult) valueOf).url);
                    }
                    if (z10 || valueOf == null) {
                    }
                    profileActivity.e.E(valueOf);
                    return;
                }
            } else {
                valueOf = profileActivity.e.v.get(i10);
            }
        } else if (i10 < u01Var.r.size()) {
            valueOf = profileActivity.e.r.get(i10);
        } else {
            int f10 = ic.a.f(1, i10, profileActivity.e.r);
            if (f10 >= 0 && f10 < profileActivity.e.s.size()) {
                valueOf = profileActivity.e.s.get(f10);
            }
        }
        z10 = true;
        if (!(valueOf instanceof t01)) {
        }
        if (z10) {
        }
    }

    public static void Y(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        if (tL_error == null) {
            TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.getUserConfig().getClientUserId()));
            if (user == null) {
                user = profileActivity.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                } else {
                    profileActivity.getMessagesController().putUser(user, false);
                }
            } else {
                profileActivity.getUserConfig().setCurrentUser(user);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
            TLRPC.VideoSize closestVideoSizeWithSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && profileActivity.I2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.I2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(profileActivity.I2.volume_id);
                sb2.append("_");
                String n10 = a1.g.n(profileActivity.I2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(profileActivity.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && profileActivity.J2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.J2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            profileActivity.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            profileActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.e1);
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
        profileActivity.o2 = (AndroidUtilities.isTablet() || profileActivity.n2 || !profileActivity.e0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
        profileActivity.I2 = null;
        profileActivity.J2 = null;
        zy0 zy0Var = profileActivity.n0;
        zy0Var.H0 = true;
        zy0Var.K0 = profileActivity.K2;
        zy0Var.q1 = null;
        zy0Var.r1 = null;
        zy0Var.setCreateThumbFromParent(false);
        profileActivity.u5(true);
        profileActivity.a5(false, true);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        profileActivity.getUserConfig().saveConfig(true);
    }

    public static void Y0(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.c2, 0.25f) / 0.25f;
        if (profileActivity.q1) {
            profileActivity.t0.setAlpha(1.0f - min);
            profileActivity.t0.setBlurIntensity(0.0f);
            profileActivity.t0.setGooeyEnabled(false);
            profileActivity.t0.setVisibility(profileActivity.c2 >= 1.0f ? 8 : 0);
        } else {
            profileActivity.t0.setHideProgress(profileActivity.c2);
        }
        bz0 bz0Var = profileActivity.u0;
        if (bz0Var == null || profileActivity.J1 == 2) {
            return;
        }
        float f7 = profileActivity.c2;
        bz0Var.setAlpha(f7 > 0.0f ? AndroidUtilities.lerp(1.0f, 0.0f, AndroidUtilities.ilerp(f7, 0.0f, 0.5f)) : 1.0f);
    }

    public static /* synthetic */ void Z(ProfileActivity profileActivity, Context context, long j10, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            hi.d4.F0(context, profileActivity.currentAccount, profileActivity.v2.starref_program, profileActivity.getUserConfig().getClientUserId(), profileActivity.z0, false);
        } else {
            hi.d4.G0(context, profileActivity.currentAccount, connectedbotstarref, j10, profileActivity.z0);
        }
    }

    public static void a0(ProfileActivity profileActivity, Context context, long j10, View view, int i10, float f7, float f10) {
        TLRPC.User user;
        j01 j01Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.a.C0();
        if (i10 >= profileActivity.k4 && i10 < profileActivity.l4) {
            AgentController agentController = profileActivity.getMessagesController().getAgentController();
            int i11 = i10 - profileActivity.k4;
            TL_agent.settings settingsVar = agentController.settings;
            if (settingsVar == null || i11 >= settingsVar.keys.size()) {
                return;
            }
            String str = agentController.settings.keys.get(i11).provider;
            if (TextUtils.equals(str, agentController.settings.active_provider)) {
                return;
            }
            agentController.setActiveProvider(str);
            return;
        }
        if (i10 == profileActivity.m4) {
            profileActivity.D4();
            return;
        }
        if (i10 == profileActivity.S3) {
            TLRPC.User user2 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
            TLRPC.UserFull userFull = profileActivity.v2;
            if (userFull != null && userFull.starref_program != null) {
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                bi.m0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), clientUserId, profileActivity.e1, new bi.c2(profileActivity, context, clientUserId, 3));
                return;
            } else {
                if (user2 == null || !user2.bot_can_edit) {
                    return;
                }
                profileActivity.presentFragment(new hi.k(profileActivity.e1));
                return;
            }
        }
        if (i10 == profileActivity.Q3) {
            boolean z10 = !profileActivity.getMessagesController().isDialogMuted(j10, profileActivity.g1);
            profileActivity.getNotificationsController().muteDialog(j10, profileActivity.g1, z10);
            org.telegram.ui.Components.wc.A(profileActivity, z10, null).j();
            profileActivity.m5();
            int i12 = profileActivity.Q3;
            if (i12 < 0 || (j01Var = profileActivity.d) == null) {
                return;
            }
            j01Var.m(i12);
            return;
        }
        if (i10 == profileActivity.Z3) {
            TLRPC.User user3 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user3.id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.j5);
            bundle.putString("first_name_card", profileActivity.k5);
            bundle.putString("last_name_card", profileActivity.l5);
            js jsVar = new js(bundle, profileActivity.z0);
            jsVar.O = new xx0(profileActivity, user3);
            profileActivity.presentFragment(jsVar);
            return;
        }
        if (i10 == profileActivity.W3) {
            TextView textView = (TextView) org.telegram.ui.Components.g5.h0(profileActivity.getParentActivity(), LocaleController.getString(R.string.DeleteReaction), LocaleController.getString(R.string.DeleteAlertReaction), LocaleController.getString(R.string.DeleteAlertReactionAll), LocaleController.getString(R.string.Delete), new ay0(profileActivity, 2), profileActivity.z0, false).d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                return;
            }
            return;
        }
        if (i10 == profileActivity.X3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ReportReaction2);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ReportAlertReaction);
            TLRPC.Chat chat = profileActivity.getMessagesController().getChat(Long.valueOf(-profileActivity.g5));
            org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
            if (chat != null && ChatObject.canBlockUsers(chat)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(profileActivity.getParentActivity(), 1, profileActivity.z0);
                y1VarArr[0] = y1Var;
                y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
                y1VarArr[0].e(LocaleController.getString(R.string.BanUser), "", true, false, false);
                y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(y1VarArr[0], org.telegram.ui.Components.gb1.r(-1, -2));
                y1VarArr[0].setOnClickListener(new i20(y1VarArr, 2));
                alertDialog$Builder.o(linearLayout);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.ReportChat), new af0(16, profileActivity, y1VarArr));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.c1(19));
            TextView textView2 = (TextView) alertDialog$Builder.p().d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q7, null);
                return;
            }
            return;
        }
        if (i10 == profileActivity.w4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", DialogObject.getEncryptedChatId(profileActivity.i1));
            profileActivity.presentFragment(new i70(bundle2));
            return;
        }
        if (i10 == profileActivity.v4) {
            profileActivity.showDialog(org.telegram.ui.Components.g5.U(profileActivity.getParentActivity(), profileActivity.D2, profileActivity.z0).a);
            return;
        }
        if (i10 == profileActivity.N3) {
            profileActivity.y4(view, f7, f10, false);
            return;
        }
        if (i10 == profileActivity.Q4) {
            profileActivity.getMessagesController().unblockPeer(profileActivity.e1);
            if (org.telegram.ui.Components.wc.a(profileActivity)) {
                org.telegram.ui.Components.wc.d(profileActivity, false).j();
                return;
            }
            return;
        }
        if (i10 == profileActivity.a4) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i10 == profileActivity.U3) {
            profileActivity.B4();
            return;
        }
        if (i10 == profileActivity.V3) {
            v21.O(profileActivity.a(), profileActivity);
            return;
        }
        if (i10 >= profileActivity.z4 && i10 < profileActivity.A4) {
            profileActivity.h(!profileActivity.C2.isEmpty() ? profileActivity.u2.participants.participants.get(((Integer) profileActivity.C2.get(i10 - profileActivity.z4)).intValue()) : profileActivity.u2.participants.participants.get(i10 - profileActivity.z4), false, false, view);
            return;
        }
        if (i10 == profileActivity.B4) {
            profileActivity.C4();
            return;
        }
        if (i10 == profileActivity.L3) {
            profileActivity.K4(f7, f10, i10, view);
            return;
        }
        if (i10 == profileActivity.q4) {
            if (profileActivity.E2 != null) {
                profileActivity.showDialog(new ii.j0(profileActivity, profileActivity.E2.linked_community_id, null, null));
                return;
            } else {
                if (profileActivity.e1 == 0 || (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1))) == null) {
                    return;
                }
                profileActivity.showDialog(new ii.j0(profileActivity, user.linked_community_id, null, null));
                return;
            }
        }
        if (i10 == profileActivity.I3) {
            if (profileActivity.u2.location instanceof TLRPC.TL_channelLocation) {
                pc0 pc0Var = new pc0(5);
                long j11 = profileActivity.f1;
                TLRPC.TL_channelLocation tL_channelLocation = (TLRPC.TL_channelLocation) profileActivity.u2.location;
                pc0Var.e0 = -j11;
                pc0Var.y0 = tL_channelLocation;
                profileActivity.presentFragment(pc0Var);
                return;
            }
            return;
        }
        if (i10 == profileActivity.R4) {
            profileActivity.x4(false);
            return;
        }
        if (i10 == profileActivity.C4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f1);
            bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            kr krVar = new kr(bundle3);
            krVar.y0(profileActivity.u2);
            profileActivity.presentFragment(krVar);
            return;
        }
        if (i10 == profileActivity.D4) {
            profileActivity.presentFragment(new kh0(profileActivity.f1));
            return;
        }
        if (i10 == profileActivity.E4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            kr krVar2 = new kr(bundle4);
            krVar2.y0(profileActivity.u2);
            profileActivity.presentFragment(krVar2);
            return;
        }
        if (i10 == profileActivity.F4) {
            profileActivity.S0.performClick();
            return;
        }
        if (i10 == profileActivity.G4) {
            profileActivity.presentFragment(new bi.y(0, profileActivity.e1));
            return;
        }
        if (i10 == profileActivity.H4) {
            profileActivity.presentFragment(new bi.y(1, profileActivity.e1));
            return;
        }
        if (i10 == profileActivity.I4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new w91(bundle5));
            return;
        }
        if (i10 == profileActivity.L4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f1);
            bundle6.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            kr krVar3 = new kr(bundle6);
            krVar3.y0(profileActivity.u2);
            profileActivity.presentFragment(krVar3);
            return;
        }
        if (i10 == profileActivity.f3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
            return;
        }
        if (i10 == profileActivity.h3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.H2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.z0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
            return;
        }
        if (i10 == profileActivity.i3) {
            profileActivity.presentFragment(new DataSettingsActivity());
            return;
        }
        if (i10 == profileActivity.j3) {
            profileActivity.presentFragment(new ThemeActivity(0));
            return;
        }
        if (i10 == profileActivity.k3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
            return;
        }
        if (i10 == profileActivity.m3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
            return;
        }
        if (i10 == profileActivity.l3) {
            profileActivity.presentFragment(new tb0());
            return;
        }
        if (i10 == profileActivity.n3) {
            profileActivity.presentFragment(new SessionsActivity(0));
            return;
        }
        if (i10 == profileActivity.q3) {
            profileActivity.showDialog(org.telegram.ui.Components.g5.T(profileActivity, profileActivity.z0));
            return;
        }
        if (i10 == profileActivity.r3) {
            qf.d.r(profileActivity.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
            return;
        }
        if (i10 == profileActivity.s3) {
            qf.d.r(profileActivity.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
            return;
        }
        if (i10 == profileActivity.v3) {
            P4(profileActivity.getParentActivity(), false);
            return;
        }
        if (i10 == profileActivity.w3) {
            P4(profileActivity.getParentActivity(), true);
            return;
        }
        if (i10 == profileActivity.x3) {
            FileLog.cleanupLogs();
            return;
        }
        if (i10 == profileActivity.y3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
            alertDialog$Builder2.a.T = LocaleController.getString(R.string.AreYouSure);
            alertDialog$Builder2.a.R = LocaleController.getString(R.string.AppName);
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new wx0(profileActivity, 6));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            profileActivity.showDialog(alertDialog$Builder2.a);
            return;
        }
        if (i10 == profileActivity.g3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
            return;
        }
        if (i10 == profileActivity.V2) {
            profileActivity.presentFragment(new ta(null));
            return;
        }
        if (i10 == profileActivity.W2) {
            profileActivity.presentFragment(new UserInfoActivity());
            return;
        }
        if (i10 == profileActivity.T2) {
            profileActivity.presentFragment(new g(3));
            return;
        }
        if (i10 == profileActivity.O2) {
            profileActivity.B4();
            return;
        }
        if (i10 == profileActivity.c4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
            return;
        }
        if (i10 == profileActivity.d4) {
            profileActivity.presentFragment(new bi.dd());
            return;
        }
        if (i10 == profileActivity.e4) {
            profileActivity.presentFragment(new gi.h());
            return;
        }
        if (i10 == profileActivity.f4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
            return;
        }
        if (i10 == profileActivity.g4) {
            vg.n1.e0(0, BirthdayController.getInstance(profileActivity.currentAccount).getState());
            return;
        }
        if (i10 == profileActivity.botPermissionLocation) {
            hi.b1 b1Var = profileActivity.s2;
            if (b1Var != null) {
                b1Var.l(!b1Var.g(), new fy0(2, profileActivity, view));
                return;
            }
            return;
        }
        if (i10 == profileActivity.botPermissionBiometry) {
            hi.y yVar = profileActivity.t2;
            if (yVar != null) {
                boolean z11 = !yVar.e;
                yVar.f = true;
                yVar.e = z11;
                yVar.k();
                ((org.telegram.ui.Cells.v8) view).setChecked(profileActivity.t2.e);
                return;
            }
            return;
        }
        if (i10 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            v8Var.setChecked(!v8Var.d());
            if (profileActivity.t4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.t4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().getInputUser(profileActivity.e1);
            boolean d = v8Var.d();
            toggleuseremojistatuspermission.enabled = d;
            TLRPC.UserFull userFull2 = profileActivity.v2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = d;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new j10(25, profileActivity, r0));
            profileActivity.t4 = sendRequest;
            int[] iArr = {sendRequest};
            return;
        }
        if (i10 == profileActivity.O3) {
            profileActivity.T4 = !profileActivity.T4;
            profileActivity.N4();
            view.requestLayout();
            profileActivity.d.m(profileActivity.O3);
            int i13 = profileActivity.b6;
            if (i13 >= 0) {
                profileActivity.c.h1(i13, profileActivity.c6 - profileActivity.a.getPaddingTop());
                return;
            }
            return;
        }
        if (i10 == profileActivity.P3) {
            profileActivity.H4(false);
            return;
        }
        if (i10 == profileActivity.Q2) {
            if (profileActivity.v2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.v2.personal_channel_id);
            profileActivity.presentFragment(new un(bundle7));
            return;
        }
        if (i10 != profileActivity.U2) {
            if (i10 == profileActivity.H3) {
                profileActivity.R3(i10, view);
                return;
            } else {
                profileActivity.K4(f7, f10, i10, view);
                return;
            }
        }
        b11 b11Var = profileActivity.q6;
        if ((b11Var == null || !b11Var.a()) && !profileActivity.S3(i10, view)) {
            org.telegram.ui.Cells.g9 g9Var = (org.telegram.ui.Cells.g9) view;
            if (g9Var.d.getDrawable() != null) {
                profileActivity.A4(g9Var.getImageView());
            }
        }
    }

    public static void b0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.rc0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new fb0(profileActivity, 20), profileActivity.z0);
    }

    public static void c0(ProfileActivity profileActivity, TLRPC.User user) {
        if (profileActivity.Z3 >= 0) {
            if (profileActivity.P4 == -1) {
                profileActivity.v5();
                profileActivity.d.l();
            } else {
                profileActivity.p5(false, false);
            }
        }
        if (profileActivity.P4 == -1) {
            if (profileActivity.n2 || AndroidUtilities.isTablet()) {
                profileActivity.a.setPadding(0, profileActivity.c4(), 0, 0);
                profileActivity.j2.cancel();
                float[] fArr = profileActivity.m2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.R4(1.0f);
                profileActivity.Q1 = profileActivity.c4();
            } else {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (profileActivity.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredWidth(), TLObject.FLAG_30);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    j01 j01Var = profileActivity.d;
                    if (i10 >= j01Var.e.N2) {
                        break;
                    }
                    s4.e1 g7 = j01Var.g(null, j01Var.j(i10));
                    View view = g7.a;
                    profileActivity.d.v(g7, i10);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i11 += view.getMeasuredHeight();
                    i10++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.c4() + i11) + currentActionBarHeight));
                py0 py0Var = profileActivity.a;
                py0Var.setPadding(0, py0Var.getPaddingTop(), 0, max);
            }
        }
        profileActivity.L.m(profileActivity.i1, user, 8);
    }

    public static void d0(ProfileActivity profileActivity) {
        Runnable runnable;
        final int i10;
        LinearLayout linearLayout;
        int i11;
        final int i12;
        final t3 t3Var;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.v2;
        if (userFull == null || userFull.stars_rating == null) {
            return;
        }
        org.telegram.ui.ActionBar.u6 u6Var = null;
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) profileActivity.getParentActivity(), (org.telegram.ui.ActionBar.u6) null, false);
        k3Var.fixNavigationBar();
        runnable = k3Var.dismissRunnable;
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        linearLayout2.setOrientation(1);
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        final LimitPreviewView limitPreviewView = new LimitPreviewView(profileActivity.getParentActivity(), R.drawable.filled_rating_crown, 0, profileActivity.z0, 0);
        limitPreviewView.setHideNegativeValues(profileActivity.a() != UserConfig.getInstance(profileActivity.currentAccount).getClientUserId());
        limitPreviewView.setStarRating(userFull.stars_rating);
        limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
        linearLayout2.addView(limitPreviewView, org.telegram.ui.Components.gb1.x(-1, -2, 17, 0, 20, 0, 10));
        int i13 = 17;
        if (userFull.stars_my_pending_rating != null) {
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            linearLayout2.addView(frameLayout, org.telegram.ui.Components.gb1.x(-1, -2, 17, 40, -12, 40, 20));
            int i14 = 2;
            TextView[] textViewArr = new org.telegram.ui.Components.z90[2];
            int i15 = 0;
            while (true) {
                int i16 = 3;
                if (i15 >= i14) {
                    break;
                }
                int i17 = i14;
                org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(parentActivity, i16, u6Var);
                textViewArr[i15] = xbVar;
                xbVar.setGravity(i13);
                textViewArr[i15].setTextSize(1, 12.0f);
                org.telegram.ui.ActionBar.f7.V(textViewArr[i15], org.telegram.ui.ActionBar.y6.y6, null);
                org.telegram.ui.ActionBar.f7.H(textViewArr[i15], org.telegram.ui.ActionBar.y6.gc, null);
                frameLayout.addView(textViewArr[i15], org.telegram.ui.Components.gb1.i(-1, -1, 119));
                textViewArr[i15].setAlpha(i15 == 0 ? 1.0f : 0.0f);
                textViewArr[i15].setScaleX(i15 == 0 ? 1.0f : 0.8f);
                textViewArr[i15].setScaleY(i15 == 0 ? 1.0f : 0.8f);
                i15++;
                i14 = i17;
                i13 = 17;
            }
            int i18 = i14;
            t3 t3Var2 = new t3(textViewArr, 21);
            boolean z10 = profileActivity.a() == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId();
            linearLayout = linearLayout2;
            long j10 = userFull.stars_rating.stars;
            TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
            long j11 = (-j10) - (tl_starsRating != null ? tl_starsRating.stars - j10 : 0L);
            int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(profileActivity.currentAccount).getCurrentTime()) / 86400);
            long j12 = userFull.stars_my_pending_rating.stars;
            long j13 = userFull.stars_rating.stars;
            long j14 = j12 - j13;
            if ((j13 >= 0 || z10) && (!z10 || j11 <= 0)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String formatPluralStringComma = LocaleController.formatPluralStringComma("StarRatingFuture", max);
                String formatPluralStringComma2 = LocaleController.formatPluralStringComma("StarRatingFuturePendingPoints", (int) j14);
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[0] = formatPluralStringComma;
                charSequenceArr[1] = "\n";
                charSequenceArr[i18] = formatPluralStringComma2;
                spannableStringBuilder.append(TextUtils.concat(charSequenceArr));
                spannableStringBuilder.append((CharSequence) " ");
                i12 = 0;
                t3Var = t3Var2;
                spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreview), new Runnable() { // from class: org.telegram.ui.iy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i19 = i12;
                        t3 t3Var3 = t3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i19) {
                            case 0:
                                int i20 = ProfileActivity.R6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                t3Var3.run(Boolean.TRUE);
                                break;
                            default:
                                int i21 = ProfileActivity.R6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                t3Var3.run(Boolean.FALSE);
                                break;
                        }
                    }
                }), true));
                textViewArr[0].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.jy0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i19 = i12;
                        t3 t3Var3 = t3Var;
                        TLRPC.UserFull userFull2 = userFull;
                        LimitPreviewView limitPreviewView2 = limitPreviewView;
                        switch (i19) {
                            case 0:
                                int i20 = ProfileActivity.R6;
                                limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                t3Var3.run(Boolean.TRUE);
                                break;
                            default:
                                int i21 = ProfileActivity.R6;
                                limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                                t3Var3.run(Boolean.FALSE);
                                break;
                        }
                    }
                });
                textViewArr[0].setText(spannableStringBuilder);
            } else {
                org.telegram.ui.ActionBar.f7.V(textViewArr[0], org.telegram.ui.ActionBar.y6.q7, null);
                if (z10) {
                    textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarRatingLevelNegativeYou", (int) j11)));
                } else {
                    textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarRatingLevelNegativeOther, DialogObject.getName(profileActivity.a()))));
                }
                i12 = 0;
                t3Var = t3Var2;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String formatPluralStringComma3 = LocaleController.formatPluralStringComma("StarRatingFuturePreview1", max);
            String formatPluralStringComma4 = LocaleController.formatPluralStringComma("StarRatingFuturePreview2", (int) j14);
            CharSequence[] charSequenceArr2 = new CharSequence[3];
            charSequenceArr2[i12] = formatPluralStringComma3;
            i10 = 1;
            charSequenceArr2[1] = "\n";
            charSequenceArr2[i18] = formatPluralStringComma4;
            spannableStringBuilder2.append(TextUtils.concat(charSequenceArr2));
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreviewBack), new Runnable() { // from class: org.telegram.ui.iy0
                @Override // java.lang.Runnable
                public final void run() {
                    int i19 = i10;
                    t3 t3Var3 = t3Var;
                    TLRPC.UserFull userFull2 = userFull;
                    LimitPreviewView limitPreviewView2 = limitPreviewView;
                    switch (i19) {
                        case 0:
                            int i20 = ProfileActivity.R6;
                            limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            t3Var3.run(Boolean.TRUE);
                            break;
                        default:
                            int i21 = ProfileActivity.R6;
                            limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                            t3Var3.run(Boolean.FALSE);
                            break;
                    }
                }
            }), true));
            textViewArr[1].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.jy0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i19 = i10;
                    t3 t3Var3 = t3Var;
                    TLRPC.UserFull userFull2 = userFull;
                    LimitPreviewView limitPreviewView2 = limitPreviewView;
                    switch (i19) {
                        case 0:
                            int i20 = ProfileActivity.R6;
                            limitPreviewView2.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            t3Var3.run(Boolean.TRUE);
                            break;
                        default:
                            int i21 = ProfileActivity.R6;
                            limitPreviewView2.f(userFull2.stars_my_pending_rating, userFull2.stars_rating);
                            t3Var3.run(Boolean.FALSE);
                            break;
                    }
                }
            });
            textViewArr[1].setText(spannableStringBuilder2);
        } else {
            i10 = 1;
            linearLayout = linearLayout2;
        }
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        d3.o(R.string.StarRatingTitle, textView, i10, 20.0f);
        int i19 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i19, profileActivity.z0);
        LinearLayout linearLayout3 = linearLayout;
        linearLayout3.addView(textView, org.telegram.ui.Components.gb1.x(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        if (userFull.id == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
            org.telegram.messenger.t.n(R.string.StarRatingSelfDescription, textView2);
            i11 = 1;
        } else {
            i11 = 1;
            org.telegram.messenger.vh.o(R.string.StarRatingDescription, new Object[]{DialogObject.getName(profileActivity.a())}, textView2);
        }
        textView2.setTextSize(i11, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, i19, profileActivity.z0);
        linearLayout3.addView(textView2, org.telegram.ui.Components.gb1.x(-1, -2, 17, 20, 0, 20, 12));
        gw0 gw0Var = new gw0(parentActivity, profileActivity.z0);
        gw0Var.a.l(LocaleController.getString(R.string.StarRatingTitle1), false);
        int i20 = R.string.StarRatingDescription1;
        String string = LocaleController.getString(R.string.StarRatingAdded);
        int i21 = org.telegram.ui.ActionBar.y6.Oh;
        gw0Var.b.setText(LocaleController.formatSpannable(i20, P3(string, i21, profileActivity.z0)));
        gw0Var.d.setVisibility(8);
        int i22 = R.drawable.menu_gift;
        ImageView imageView = gw0Var.c;
        imageView.setImageResource(i22);
        org.telegram.ui.ActionBar.u6 u6Var2 = profileActivity.z0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.f7.t(imageView, i19, u6Var2, mode);
        linearLayout3.addView(gw0Var, org.telegram.ui.Components.gb1.o(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        gw0 gw0Var2 = new gw0(parentActivity, profileActivity.z0);
        gw0Var2.a.l(LocaleController.getString(R.string.StarRatingTitle2), false);
        gw0Var2.b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription2, P3(LocaleController.getString(R.string.StarRatingAdded), i21, profileActivity.z0)));
        gw0Var2.d.setVisibility(8);
        int i23 = R.drawable.menu_stars_gift;
        ImageView imageView2 = gw0Var2.c;
        imageView2.setImageResource(i23);
        org.telegram.ui.ActionBar.f7.t(imageView2, i19, profileActivity.z0, mode);
        linearLayout3.addView(gw0Var2, org.telegram.ui.Components.gb1.o(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        gw0 gw0Var3 = new gw0(parentActivity, profileActivity.z0);
        gw0Var3.a.l(LocaleController.getString(R.string.StarRatingTitle3), false);
        int i24 = R.string.StarRatingDescription3;
        String string2 = LocaleController.getString(R.string.StarRatingDeduces);
        int f7 = org.telegram.ui.ActionBar.y6.I.q() ? i0.a.f(0.25f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.m6, profileActivity.z0), -16777216) : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.y6, profileActivity.z0);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string2);
        oz0 oz0Var = new oz0(9);
        oz0Var.v = string2;
        if (oz0Var.c != null) {
            oz0Var.c = null;
            oz0Var.a();
        }
        oz0Var.f = f7;
        oz0Var.n = false;
        spannableStringBuilder3.setSpan(oz0Var, 0, spannableStringBuilder3.length(), 0);
        gw0Var3.b.setText(LocaleController.formatSpannable(i24, spannableStringBuilder3));
        gw0Var3.d.setVisibility(8);
        int i25 = R.drawable.menu_refund;
        ImageView imageView3 = gw0Var3.c;
        imageView3.setImageResource(i25);
        org.telegram.ui.ActionBar.f7.t(imageView3, i19, profileActivity.z0, mode);
        linearLayout3.addView(gw0Var3, org.telegram.ui.Components.gb1.o(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        fi.d dVar = new fi.d(parentActivity, profileActivity.z0, true);
        dVar.setOnClickListener(new ky0(0, runnable));
        dVar.i(bi.h7.H2(LocaleController.getString(R.string.Understood)), false, true);
        linearLayout3.addView(dVar, org.telegram.ui.Components.gb1.o(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        k3Var.customView = linearLayout3;
        k3Var.show();
    }

    public static void e0(ProfileActivity profileActivity, int i10, float f7, float f10) {
        switch (i10) {
            case 0:
                boolean z10 = profileActivity.q1;
                if (!z10) {
                    if (profileActivity.e1 == 0) {
                        if (profileActivity.f1 != 0) {
                            if (!ChatObject.isForum(profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f1)))) {
                                if (!profileActivity.V3()) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", profileActivity.f1);
                                    if (profileActivity.getMessagesController().checkCanOpenChat(bundle, profileActivity)) {
                                        profileActivity.presentFragment(new un(bundle), false);
                                        break;
                                    }
                                }
                            } else {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", profileActivity.f1);
                                if (profileActivity.getMessagesController().checkCanOpenChat(bundle2, profileActivity)) {
                                    profileActivity.presentFragment(new un(bundle2), false);
                                    break;
                                }
                            }
                        }
                    } else {
                        profileActivity.F4();
                        break;
                    }
                } else if (z10) {
                    profileActivity.V3();
                    break;
                }
                break;
            case 1:
                profileActivity.y4(profileActivity.Z, f7, f10, true);
                break;
            case 2:
                profileActivity.G4();
                break;
            case 3:
                profileActivity.w4();
                break;
            case 4:
                profileActivity.z4();
                break;
            case 5:
            case 10:
            case 11:
                profileActivity.v4(false);
                break;
            case 6:
                profileActivity.v4(true);
                break;
            case 7:
                profileActivity.x4(true);
                break;
            case 8:
                v21.O(profileActivity.a(), profileActivity);
                break;
            case 9:
                profileActivity.p4(false);
                break;
            case 12:
                profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(profileActivity.getParentActivity(), 3, profileActivity.z0);
                e2Var.r(200L);
                MessagesController.getInstance(profileActivity.currentAccount).getStoriesController().k(profileActivity.a(), new org.telegram.ui.Components.oy(21, profileActivity, e2Var), true, profileActivity.z0);
                break;
            case 13:
                profileActivity.u4(true);
                break;
            case 14:
                profileActivity.B4();
                break;
            case 15:
                TLRPC.User currentUser = profileActivity.getUserConfig().getCurrentUser();
                if (currentUser != null) {
                    org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(profileActivity, profileActivity.Z);
                    H.w = false;
                    H.i = 3;
                    H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.QrCode), new fb0(profileActivity, 22), false);
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new my0(currentUser, 0), false);
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new fb0(profileActivity, 23), false);
                    H.W = true;
                    H.a0(f7 - AndroidUtilities.dp(8.0f), profileActivity.Z.getMeasuredHeight() - AndroidUtilities.dp(16.0f));
                    H.Z();
                    break;
                }
                break;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 17:
                profileActivity.presentFragment(new d81(null));
                break;
        }
    }

    public static void f0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.a0 == null) {
            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.currentAccount == profileActivity.currentAccount && MediaController.getInstance().currentSavedMusicList.dialogId == profileActivity.a()) {
                profileActivity.a0 = MediaController.getInstance().currentSavedMusicList;
            } else {
                MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(profileActivity.currentAccount, profileActivity.a());
                profileActivity.a0 = savedMusicList;
                TLRPC.UserFull userFull = profileActivity.v2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    savedMusicList.setup(document);
                }
            }
        }
        if (profileActivity.a0.list.isEmpty()) {
            return;
        }
        if (MediaController.getInstance().currentSavedMusicList == profileActivity.a0 && MediaController.getInstance().isPlayingMessage(profileActivity.a0.list.get(0))) {
            z10 = true;
        } else {
            MediaController.getInstance().cleanup();
            z10 = false;
        }
        MediaController.getInstance().currentSavedMusicList = profileActivity.a0;
        MediaController.getInstance().getPlaylist().clear();
        MediaController.getInstance().getPlaylist().addAll(profileActivity.a0.list);
        if (!z10) {
            MediaController.getInstance().playMessage(profileActivity.a0.list.get(0));
        }
        profileActivity.showDialog(new org.telegram.ui.Components.m8(profileActivity.getParentActivity(), profileActivity.z0));
    }

    public static void g0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f7, boolean z10) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.U1 = floatValue;
        float f10 = (floatValue - 0.5f) / 0.5f;
        float f11 = (0.5f - floatValue) / 0.5f;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        float f12 = -f7;
        profileActivity.T1 = (int) ((1.0f - floatValue) * f12);
        profileActivity.b.setTranslationY(floatValue * f7);
        profileActivity.O.setTranslationY(f7 * profileActivity.U1);
        profileActivity.a.setTranslationY((1.0f - profileActivity.U1) * f12);
        profileActivity.a.setScaleX(1.0f - ((1.0f - profileActivity.U1) * 0.01f));
        profileActivity.a.setScaleY(1.0f - ((1.0f - profileActivity.U1) * 0.01f));
        profileActivity.a.setAlpha(profileActivity.U1);
        profileActivity.r4(true);
        profileActivity.a.setAlpha(f10);
        profileActivity.b.setAlpha(1.0f - profileActivity.U1);
        profileActivity.b.setScaleX((profileActivity.U1 * 0.05f) + 1.0f);
        profileActivity.b.setScaleY((profileActivity.U1 * 0.05f) + 1.0f);
        profileActivity.O.setAlpha(1.0f - f10);
        profileActivity.X.setAlpha(f10);
        profileActivity.e0.setAlpha(f10);
        bz0 bz0Var = profileActivity.u0;
        if (bz0Var != null) {
            bz0Var.setAlpha(f10);
        }
        profileActivity.f.setAlpha(f10);
        profileActivity.r.setAlpha(profileActivity.L5 ? 0.0f : f10);
        profileActivity.U0.getSearchField().setAlpha(f11);
        if (z10 && profileActivity.U1 < 0.7f) {
            org.telegram.ui.ActionBar.w0 w0Var = profileActivity.U0;
            if (w0Var.F.getWidth() != 0 && !w0Var.e.isFocused()) {
                w0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(w0Var.e);
            }
        }
        profileActivity.U0.getSearchContainer().setVisibility(profileActivity.U1 < 0.5f ? 0 : 8);
        int i10 = profileActivity.U1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.w0 w0Var2 = profileActivity.T0;
        if (w0Var2 != null) {
            w0Var2.setVisibility(i10);
            profileActivity.T0.setAlpha(f10);
        }
        profileActivity.U0.setVisibility(i10);
        profileActivity.actionBar.t(profileActivity.U1 < 0.5f);
        org.telegram.ui.ActionBar.w0 w0Var3 = profileActivity.T0;
        if (w0Var3 != null) {
            w0Var3.setAlpha(f10);
        }
        profileActivity.U0.setAlpha(f10);
        profileActivity.d1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void h0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.i11.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.z0);
    }

    public static boolean i0(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_error tL_error) {
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(profileActivity.currentAccount).edit().putLong("dialog_join_requested_time_" + profileActivity.i1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        boolean z11 = ChatObject.isChannel(profileActivity.E2) && !profileActivity.E2.megagroup;
        int i10 = org.telegram.ui.Components.c90.s;
        org.telegram.ui.Components.c90.w(parentActivity, profileActivity, org.telegram.ui.Components.wc.b0(profileActivity), z11);
        if (!z10 || profileActivity.R4 != -1) {
            profileActivity.v5();
            j01 j01Var = profileActivity.d;
            if (j01Var != null) {
                j01Var.l();
            }
        }
        if (r2Var instanceof un) {
            ((un) r2Var).Gb(false, true);
        }
        return false;
    }

    public static void j0(ProfileActivity profileActivity, org.telegram.ui.Cells.y1[] y1VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().getInputUser(profileActivity.e1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().getInputPeer(profileActivity.g5);
        tL_messages_reportReaction.id = profileActivity.f5;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new di.d6(21));
        org.telegram.ui.Cells.y1 y1Var = y1VarArr[0];
        if (y1Var != null && y1Var.b()) {
            profileActivity.getMessagesController().deleteParticipantFromChat(-profileActivity.g5, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1)));
        }
        profileActivity.f5 = 0;
        profileActivity.p5(false, false);
        org.telegram.ui.Components.wc.b0(profileActivity).E(profileActivity.z0).j();
    }

    public static void k0(ProfileActivity profileActivity, Boolean bool) {
        long j10 = profileActivity.e1;
        if (j10 == 0) {
            long j11 = profileActivity.f1;
            j10 = j11 != 0 ? -j11 : profileActivity.i1;
        }
        long j12 = j10;
        if (bool.booleanValue()) {
            MessagesController.getInstance(profileActivity.currentAccount).deleteAllReactionsFrom(profileActivity.g5, j12);
        } else {
            MessagesController.getInstance(profileActivity.currentAccount).deleteReactionsFromMessage(profileActivity.g5, j12, profileActivity.f5);
        }
        profileActivity.f5 = 0;
        profileActivity.p5(false, false);
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(profileActivity.getParentActivity(), profileActivity.z0);
        ybVar.d(R.raw.chats_infotip, new String[0]);
        ybVar.b.setText(LocaleController.getString(R.string.ReactionDeleteSent));
        org.telegram.ui.Components.wc.b0(profileActivity).b(ybVar, 1500).j();
    }

    public static /* synthetic */ void l0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.I2 = fileLocation;
            profileActivity.J2 = photoSize2.location;
            profileActivity.e0.h(ImageLocation.getForLocal(fileLocation), "50_50", profileActivity.p0, null);
            if (profileActivity.O2 != -1) {
                profileActivity.v5();
                j01 j01Var = profileActivity.d;
                if (j01Var != null) {
                    j01Var.l();
                }
                profileActivity.r4(true);
            }
            zy0 zy0Var = profileActivity.n0;
            ImageLocation forLocal = ImageLocation.getForLocal(profileActivity.J2);
            profileActivity.K2 = forLocal;
            zy0Var.A(forLocal, ImageLocation.getForLocal(profileActivity.I2));
            profileActivity.a5(true, false);
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
                int i10 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i10 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            profileActivity.Z5 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new j10(24, profileActivity, str));
        }
        profileActivity.actionBar.l().requestLayout();
    }

    public static void m0(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.qc R = org.telegram.ui.Components.wc.b0(profileActivity).R(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            R.j = 5000;
            R.j();
            return;
        }
        if (tL_birthday == null) {
            userFull.flags2 &= -33;
        } else {
            userFull.flags2 |= 32;
        }
        userFull.birthday = tL_birthday;
        profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.t.q(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity), R.raw.error, 36);
            return;
        }
        if (profileActivity.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.resourceProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            profileActivity.showDialog(alertDialog$Builder.a);
        }
    }

    public static void m1(ProfileActivity profileActivity) {
        org.telegram.ui.ActionBar.r5 r5Var = profileActivity.simpleActionBar;
        if (r5Var == null) {
            return;
        }
        float max = Math.max(profileActivity.K5, r5Var.getActionModeFactor());
        profileActivity.simpleActionBar.setAlpha(max);
        profileActivity.simpleActionBar.setVisibility(max > 0.0f ? 0 : 8);
        org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
        if (kVar != null) {
            kVar.setAlpha(1.0f - max);
            profileActivity.actionBar.setVisibility(max >= 1.0f ? 4 : 0);
        }
    }

    public static void n0(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.b6 b6Var) {
        ImageLocation forDocument;
        String str;
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            qf.d.r(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        tg.m1 m1Var = new tg.m1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.z0);
        b6Var.getLocationOnScreen(new int[2]);
        m1Var.v0 = b6Var.h0;
        m1Var.w0 = b6Var.i0;
        m1Var.z0 = b6Var.getScaleX();
        m1Var.x0 = b6Var.getLeft();
        m1Var.y0 = b6Var.getTop();
        m1Var.A0 = b6Var;
        Drawable rightDrawable = b6Var.getRightDrawable();
        org.telegram.ui.Components.r5 r5Var = profileActivity.F;
        if (rightDrawable == r5Var && r5Var != null) {
            Drawable drawable = r5Var.f[0];
            if (drawable instanceof org.telegram.ui.Components.t5) {
                m1Var.z0 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.t5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(profileActivity.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.y6.m6, 0.2f);
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                    if ("video/webm".equals(document.mime_type)) {
                        forDocument = ImageLocation.getForDocument(document);
                        if (svgThumb != null) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        str = "160_160_g";
                    } else {
                        if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        forDocument = ImageLocation.getForDocument(document);
                        str = "160_160";
                    }
                    String str2 = str;
                    ImageLocation imageLocation = forDocument;
                    y9Var.setLayerNum(7);
                    y9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    y9Var.l(imageLocation, str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (((org.telegram.ui.Components.t5) profileActivity.F.f[0]).c()) {
                        y9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v6, profileActivity.z0), PorterDuff.Mode.SRC_IN));
                        m1Var.C0 = MessageObject.getInputStickerSet(document);
                    } else {
                        m1Var.C0 = MessageObject.getInputStickerSet(document);
                    }
                    m1Var.B0 = y9Var;
                    m1Var.E0 = true;
                }
            }
        }
        profileActivity.showDialog(m1Var);
    }

    public static void q1(ProfileActivity profileActivity, boolean z10) {
        int i10 = z10 ? 8 : 0;
        profileActivity.a.setVisibility(i10);
        profileActivity.b.setVisibility(z10 ? 0 : 8);
        profileActivity.U0.getSearchContainer().setVisibility(z10 ? 0 : 8);
        bi.i1 i1Var = profileActivity.v0;
        if (i1Var != null) {
            i1Var.setActive(!z10);
        }
        profileActivity.actionBar.t(z10);
        profileActivity.X.setVisibility(i10);
        bz0 bz0Var = profileActivity.u0;
        if (bz0Var != null) {
            bz0Var.setVisibility(i10);
        }
        profileActivity.f.setVisibility(i10);
        profileActivity.r.setVisibility(i10);
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.T0;
        if (w0Var != null) {
            w0Var.setAlpha(1.0f);
            profileActivity.T0.setVisibility(i10);
        }
        profileActivity.U0.setVisibility(i10);
        profileActivity.e0.setAlpha(1.0f);
        profileActivity.X.setAlpha(1.0f);
        bz0 bz0Var2 = profileActivity.u0;
        if (bz0Var2 != null) {
            bz0Var2.setAlpha(1.0f);
        }
        bi.i1 i1Var2 = profileActivity.v0;
        if (i1Var2 != null) {
            i1Var2.setAlpha(1.0f);
        }
        profileActivity.f.setAlpha(1.0f);
        profileActivity.r.setAlpha(profileActivity.L5 ? 0.0f : 1.0f);
        profileActivity.U0.setAlpha(1.0f);
        profileActivity.a.setAlpha(1.0f);
        profileActivity.b.setAlpha(1.0f);
        profileActivity.O.setAlpha(1.0f);
        if (z10) {
            profileActivity.b.setEmptyView(profileActivity.O);
        } else {
            profileActivity.O.setVisibility(8);
        }
    }

    public static ProfileActivity t4(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void z3(ProfileActivity profileActivity, boolean z10) {
        Drawable drawable = profileActivity.e0.getImageReceiver().getDrawable();
        String str = null;
        if (drawable instanceof org.telegram.ui.Components.d81) {
            profileActivity.e0.u(null, null, drawable);
            return;
        }
        if (drawable instanceof org.telegram.ui.Components.g6) {
            org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) drawable;
            profileActivity.e0.u(null, null, g6Var);
            if (z10) {
                g6Var.f(profileActivity.e0);
                return;
            }
            return;
        }
        ImageLocation D = profileActivity.n0.D(0);
        if (D != null && D.imageType == 2) {
            str = "avatar";
        }
        profileActivity.e0.u(D, str, drawable);
    }

    public final void A4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.L3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f1);
            bundle.putLong("user_id", this.e1);
            presentFragment(new ai.z0(bundle));
            return;
        }
        if (view2.getTag() == null || ((Integer) view2.getTag()).intValue() != this.U2) {
            return;
        }
        if (this.e1 == getUserConfig().getClientUserId()) {
            presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
        } else if (UserObject.areGiftsDisabled(this.v2)) {
            org.telegram.ui.Components.wc.b0(this).R(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.e1)))).j();
        } else {
            showDialog(new zh.p1(getParentActivity(), this.currentAccount, this.e1, null, null));
        }
    }

    public final void A5(boolean z10) {
        boolean z11;
        TLRPC.ChatFull chatFull;
        float G3 = G3();
        this.O5 = G3 > 0.2f && !this.W1 && (this.q0 == null || this.O2 == -1);
        K3();
        org.telegram.ui.Components.ak0 ak0Var = this.s;
        if (ak0Var == null || ak0Var.getVisibility() == 8) {
            z11 = false;
        } else {
            this.s.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) + this.Q1) + this.T1) - AndroidUtilities.dp(29.5f));
            z11 = G3 > 0.2f && !this.W1 && !this.s1 && (this.q0 == null || this.O2 == -1);
            if (z11 && this.f1 != 0) {
                z11 = (!ChatObject.isChannel(this.E2) || this.E2.megagroup || (chatFull = this.u2) == null || chatFull.linked_chat_id == 0 || (this.D3 == -1 && this.E3 == -1)) ? false : true;
            }
            if (!this.G1) {
                if (z11 != (this.s.getTag() == null)) {
                    if (z11) {
                        this.s.setTag(null);
                    } else {
                        this.s.setTag(0);
                    }
                    AnimatorSet animatorSet = this.v;
                    if (animatorSet != null) {
                        this.v = null;
                        animatorSet.cancel();
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.v = animatorSet2;
                        int i10 = 2;
                        if (z11) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.v.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ak0, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ak0, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ak0, Float>) View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.v.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ak0, Float>) View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ak0, Float>) View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ak0, Float>) View.ALPHA, 0.0f));
                        }
                        this.v.setDuration(150L);
                        this.v.addListener(new mz0(this, i10));
                        this.v.start();
                    } else {
                        this.s.setScaleX(z11 ? 1.0f : 0.2f);
                        this.s.setScaleY(z11 ? 1.0f : 0.2f);
                        this.s.setAlpha(z11 ? 1.0f : 0.0f);
                    }
                }
            }
        }
        bz0 bz0Var = this.u0;
        if (bz0Var != null) {
            float measuredWidth = this.Y.getMeasuredWidth() - AndroidUtilities.dp(40.0f);
            int i11 = this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            bz0Var.i0 = measuredWidth;
            bz0Var.k0 = z11;
            bz0Var.j0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i11;
            bz0Var.invalidate();
        }
        bi.i1 i1Var = this.v0;
        if (i1Var != null) {
            i1Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + this.Q1 + this.T1);
        }
    }

    public final void B4() {
        org.telegram.ui.Components.xj0 xj0Var;
        if (this.e1 == 0) {
            G4();
            return;
        }
        if (this.q0 == null) {
            F4();
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.g50 g50Var = this.q0;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        g50Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new fb0(this, 24), new u5(this, 13), 0);
        this.U.M(0);
        this.U.P(43);
        this.V.M(0);
        this.V.P(43);
        org.telegram.ui.Components.bi0 bi0Var = this.Z;
        if (bi0Var != null) {
            org.telegram.ui.Components.yh0 j10 = org.telegram.ui.Components.bi0.j(14, bi0Var.a);
            if (j10 != null && (xj0Var = j10.k) != null) {
                xj0Var.start();
            }
        } else {
            this.s.d();
        }
        org.telegram.ui.Cells.v8 v8Var = this.M2;
        if (v8Var != null) {
            v8Var.getImageView().d();
        }
    }

    public final void B5() {
        org.telegram.ui.Components.vs0 vs0Var;
        org.telegram.ui.Components.ut0 ut0Var;
        org.telegram.ui.Components.z90 z90Var;
        int w02;
        this.Y5.clear();
        x01 x01Var = this.d1;
        if (x01Var != null) {
            x01Var.a(this.X5, true);
        }
        az0 az0Var = this.r;
        if (az0Var != null) {
            this.r.setTextColor(i0.a.f(this.k2, D3(az0Var.getTag() instanceof Integer ? org.telegram.ui.ActionBar.y6.w0(((Integer) this.r.getTag()).intValue(), this.z0) : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, this.z0), Boolean.valueOf(this.J0[0])), -1275068417));
        }
        v01 v01Var = this.p6;
        if (v01Var != null) {
            v01Var.a(i0.a.f(this.k2, org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.b(0.18f, -0.1f, this.c1)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.y(i0.a.f(this.K5, this.X5 != null ? -1 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v8, this.z0), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.y8, this.z0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            MessagesController.PeerColor peerColor = this.X5;
            kVar2.x(i0.a.f(this.K5, peerColor != null ? 1090519039 : peerColor != null ? 553648127 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f8, this.z0), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.z8, this.z0)), false);
        }
        if (this.x != null) {
            MessagesController.PeerColor peerColor2 = this.X5;
            if (peerColor2 != null) {
                w02 = org.telegram.ui.ActionBar.y6.b(0.1f, org.telegram.ui.ActionBar.y6.I.q() ? -0.1f : -0.08f, i0.a.f(0.4f, peerColor2.getColor2(), this.X5.hasColor6(org.telegram.ui.ActionBar.y6.I.q()) ? this.X5.getColor5() : this.X5.getColor3()));
            } else {
                w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zh, this.z0);
            }
            this.x.setColorFilter(AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oi, this.z0), this.K5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (this.H != null) {
            this.H.setColorFilter(AndroidUtilities.getOffsetColor(this.X5 != null ? -1 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ah, this.z0), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, this.z0), this.K5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        fl flVar = this.f;
        if (flVar != null) {
            flVar.setTextColor(i0.a.f(this.k2, i0.a.f(this.K5, this.X5 != null ? -1 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.vh, this.z0), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oi, this.z0)), -1));
        }
        org.telegram.ui.Components.r8 r8Var = this.a1;
        if (r8Var != null && (z90Var = r8Var.e) != null) {
            z90Var.invalidate();
        }
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setColorFilter(this.X5 == null ? i0.a.f(this.S1, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.pc, this.z0), -1) : -1, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.ui0 ui0Var = this.b0;
        if (ui0Var != null) {
            ui0Var.setColor(this.X5);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.a, (Utilities.Callback<View>) new ay0(this, 4));
        vz0 vz0Var = this.N;
        if (vz0Var != null && (ut0Var = vz0Var.K0) != null) {
            ut0Var.updateColors();
        }
        vz0 vz0Var2 = this.N;
        if (vz0Var2 != null && (vs0Var = vz0Var2.a0) != null) {
            vs0Var.m();
        }
        C5();
        j5();
        bz0 bz0Var = this.u0;
        if (bz0Var != null) {
            bz0Var.f(true, true);
        }
        bi.i1 i1Var = this.v0;
        if (i1Var != null) {
            i1Var.a();
        }
    }

    @Override // org.telegram.ui.ux
    public final /* synthetic */ boolean C() {
        return false;
    }

    public final void C3() {
        org.telegram.ui.ActionBar.k kVar;
        if (this.N == null || (kVar = this.actionBar) == null) {
            return;
        }
        int i10 = kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
        this.N.h1(-AndroidUtilities.dp(6.0f), oi.a.c(i10) + (currentActionBarHeight - AndroidUtilities.dp(6.0f)), oi.a.c(this.z6), this.z6 + this.x6);
        if (this.N5 != null) {
            int dp = AndroidUtilities.dp(44.0f) + currentActionBarHeight;
            if (this.N5.getLayoutParams().height != dp) {
                this.N5.getLayoutParams().height = dp;
                this.N5.requestLayout();
            }
            this.N5.setTranslationY(-currentActionBarHeight);
        }
        vz0 vz0Var = this.N;
        if (vz0Var != null) {
            vz0Var.setPagesVisibleOverscanTop(this.L5 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0);
        }
    }

    public final void C4() {
        Bundle i10 = a1.g.i("addToGroup", true);
        i10.putLong("chatId", this.E2.id);
        r60 r60Var = new r60(i10);
        TLRPC.ChatFull chatFull = this.u2;
        r60Var.I = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i11 = 0; i11 < this.u2.participants.participants.size(); i11++) {
                hVar.k(null, this.u2.participants.participants.get(i11).user_id);
            }
            r60Var.J = hVar;
        }
        r60Var.x = new wx0(this, 10);
        presentFragment(r60Var);
    }

    public final void C5() {
        if (this.s == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.xh, this.z0);
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.yh, this.z0);
            int w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.wh, this.z0);
            if (this.X5 != null && org.telegram.ui.ActionBar.y6.d1(w02)) {
                w02 = org.telegram.ui.ActionBar.y6.b(0.05f, -0.04f, this.X5.getBgColor1(false));
                MessagesController.PeerColor peerColor = this.X5;
                if (peerColor != null) {
                    int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.y6.I.q());
                    w03 = org.telegram.ui.ActionBar.y6.C(org.telegram.ui.ActionBar.y6.I.q(), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v6, this.z0), bgColor2, w03, bgColor2);
                }
                w04 = -1;
            }
            org.telegram.ui.Components.ak0 ak0Var = this.f6;
            org.telegram.ui.Components.ak0 ak0Var2 = this.s;
            int[] iArr = this.g6;
            if (ak0Var == ak0Var2 && iArr[0] == w02 && iArr[1] == w03 && iArr[2] == w04) {
                return;
            }
            this.f6 = ak0Var2;
            iArr[0] = w02;
            iArr[1] = w03;
            iArr[2] = w04;
            Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
            org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(mutate, org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(56.0f), w02, w03), 0, 0);
            int dp = AndroidUtilities.dp(56.0f);
            int dp2 = AndroidUtilities.dp(56.0f);
            arVar.e = dp;
            arVar.f = dp2;
            this.s.setBackground(arVar);
            this.s.setColorFilter(new PorterDuffColorFilter(w04, mode));
        } catch (Exception unused) {
        }
    }

    public final int D3(int i10, Boolean bool) {
        if (this.X5 == null) {
            return i10;
        }
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.s8, this.z0);
        int f7 = i0.a.f(0.5f, this.X5.getStoryColor1(org.telegram.ui.ActionBar.y6.I.q()), this.X5.getStoryColor2(org.telegram.ui.ActionBar.y6.I.q()));
        if (org.telegram.ui.ActionBar.y6.d1(w02)) {
            return org.telegram.ui.ActionBar.y6.C(org.telegram.ui.ActionBar.y6.I.q(), w02, f7, i10, (bool == null || bool.booleanValue()) ? f7 : org.telegram.ui.ActionBar.y6.o1(0.7f, f7));
        }
        return (bool == null || bool.booleanValue()) ? f7 : org.telegram.ui.ActionBar.y6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.y6.o1(0.7f, f7));
    }

    public final void D4() {
        if (getParentActivity() == null) {
            return;
        }
        new hi.q(getParentActivity(), this.currentAccount, new ay0(this, 0), this.z0).show();
    }

    public final void E3() {
        int f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || this.f == null || this.d1 == null || this.T0 == null || this.Q0 == null || this.R0 == null || this.S0 == null || this.o0 == null) {
            return;
        }
        Float valueOf = Float.valueOf(this.K5);
        jz0 jz0Var = this.M5;
        jz0Var.getClass();
        jz0Var.a(kVar, valueOf);
        if (this.K5 > 0.0f || this.k2 <= 0.0f) {
            return;
        }
        fl flVar = this.f;
        int i10 = -1;
        if (this.X5 != null) {
            f7 = -1;
        } else {
            f7 = i0.a.f(this.k2, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.vh, this.z0), -1);
        }
        flVar.setTextColor(f7);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (this.X5 == null) {
            i10 = i0.a.f(this.k2, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v8, this.z0), -1);
        }
        kVar2.y(i10, false);
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
    public final void E4(boolean z10) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize closestVideoSizeWithSize;
        TLRPC.ChatFull chatFull;
        TLRPC.FileLocation fileLocation2;
        TLRPC.VideoSize closestVideoSizeWithSize2;
        TLRPC.UserFull userFull;
        TLRPC.Photo photo;
        if (this.a.getScrollState() != 1 || z10) {
            zy0 zy0Var = this.n0;
            int realPosition = zy0Var != null ? zy0Var.getRealPosition() : 0;
            zy0 zy0Var2 = this.n0;
            ImageLocation imageLocation = null;
            ImageLocation G = zy0Var2 != null ? zy0Var2.G(realPosition) : null;
            zy0 zy0Var3 = this.n0;
            TLRPC.Photo F = zy0Var3 != null ? zy0Var3.F(realPosition) : null;
            long j10 = this.e1;
            kz0 kz0Var = this.q5;
            if (j10 == 0) {
                if (this.f1 == 0 || (chatPhoto = (chat = getMessagesController().getChat(Long.valueOf(this.f1))).photo) == null || chatPhoto.photo_big == null) {
                    return;
                }
                PhotoViewer.u1().M2(null, this, null);
                TLRPC.ChatPhoto chatPhoto2 = chat.photo;
                int i10 = chatPhoto2.dc_id;
                if (i10 != 0) {
                    chatPhoto2.photo_big.dc_id = i10;
                }
                if (G == null || (fileLocation = G.location) == null) {
                    fileLocation = chatPhoto2.photo_big;
                }
                TLRPC.FileLocation fileLocation3 = fileLocation;
                if (F == null && (chatFull = this.u2) != null) {
                    TLRPC.Photo photo2 = chatFull.chat_photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        F = photo2;
                    }
                }
                if (F != null && !F.video_sizes.isEmpty() && (closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(F.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) != null) {
                    imageLocation = ImageLocation.getForPhoto(closestVideoSizeWithSize, F);
                }
                PhotoViewer.u1().g2(null, fileLocation3, G, imageLocation, null, null, null, 0, kz0Var, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e1));
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null) {
                return;
            }
            PhotoViewer.u1().M2(null, this, null);
            TLRPC.UserProfilePhoto userProfilePhoto2 = user.photo;
            int i11 = userProfilePhoto2.dc_id;
            if (i11 != 0) {
                userProfilePhoto2.photo_big.dc_id = i11;
            }
            if (G == null || (fileLocation2 = G.location) == null) {
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
            if (F != null && !F.video_sizes.isEmpty() && (closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(F.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) != null) {
                imageLocation = ImageLocation.getForPhoto(closestVideoSizeWithSize2, F);
            }
            PhotoViewer.u1().g2(null, fileLocation4, G, imageLocation, null, null, null, 0, kz0Var, null, 0L, 0L, 0L, true, null, null);
        }
    }

    @Override // org.telegram.ui.Components.f50
    public final void F(float f7) {
        org.telegram.ui.Cells.d4 d4Var = this.g0;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(f7);
        this.n0.O(this.K2, f7);
    }

    public final void F3() {
        if (this.Q5 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.j2;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.j2.cancel();
        }
        float clamp01 = Utilities.clamp01(this.Q1 / this.F1);
        if (clamp01 <= 0.0f) {
            return;
        }
        float f7 = (clamp01 - 0.5f) / 0.5f;
        float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f));
        this.b2 = AndroidUtilities.lerp(0.42f, this.Q5[0], clamp01);
        this.Z1 = AndroidUtilities.lerp(this.V5, this.Q5[1], clamp01);
        this.a2 = AndroidUtilities.lerp(translationY, this.Q5[2], clamp01);
        this.c2 = AndroidUtilities.lerp(this.Q5[11], 0.0f, clamp01);
        this.X.setScaleX(this.b2);
        this.X.setScaleY(this.b2);
        this.X.setTranslationX(this.Z1);
        this.X.setTranslationY(this.a2);
        org.telegram.ui.Components.ox0 ox0Var = this.S;
        if (ox0Var != null) {
            ox0Var.setAlpha(clamp01);
        }
        this.e0.setAlpha(1.0f);
        this.X.setAlpha(1.0f);
        bz0 bz0Var = this.u0;
        if (bz0Var != null) {
            bz0Var.invalidate();
        }
        bi.i1 i1Var = this.v0;
        if (i1Var != null) {
            i1Var.e = AndroidUtilities.lerp(0.0f, this.Q5[4], f7);
            this.v0.f = AndroidUtilities.lerp(0.0f, this.Q5[5], clamp01);
            bi.i1 i1Var2 = this.v0;
            i1Var2.h = true;
            i1Var2.invalidate();
        }
        v01 v01Var = this.p6;
        if (v01Var != null) {
            v01Var.setAlpha((int) AndroidUtilities.lerp(0.0f, this.Q5[6], clamp01));
        }
        float dp = (((this.b2 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
        this.h0.setTranslationX(this.X.getX() + AndroidUtilities.dp(16.0f) + dp);
        this.h0.setTranslationY(this.X.getY() + AndroidUtilities.dp(-10.0f) + dp);
        this.i0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + dp);
        this.i0.setTranslationY(this.X.getY() + AndroidUtilities.dp(26.5f) + dp);
        this.j0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + dp);
        this.j0.setTranslationY(this.X.getY() + AndroidUtilities.dp(24.0f) + dp);
        this.k0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + dp);
        this.k0.setTranslationY(this.X.getY() + AndroidUtilities.dp(24.0f) + dp);
        float lerp = AndroidUtilities.lerp(1.0f, this.Q5[7], clamp01);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
        float dpf2 = AndroidUtilities.dpf2(22.7f) + floor;
        this.e2 = AndroidUtilities.lerp(floor, this.Q5[8], clamp01);
        this.g2 = AndroidUtilities.lerp(dpf2, this.Q5[9], clamp01);
        float lerp2 = AndroidUtilities.lerp((this.V5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.Q5[12], clamp01);
        float lerp3 = AndroidUtilities.lerp((this.V5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.Q5[13], clamp01);
        this.f.setTranslationX(lerp2);
        this.f.setTranslationY(this.e2);
        this.r.setTranslationX(this.u5 + lerp3);
        this.r.setTranslationY(this.g2);
        this.d2 = lerp2;
        this.f2 = lerp3;
        this.f.setScaleX(lerp);
        this.f.setScaleY(lerp);
        h5();
        n5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        s4((int) this.Q5[10], clamp01, true);
        org.telegram.ui.Components.bi0 bi0Var = this.Z;
        if (bi0Var != null) {
            bi0Var.setAlpha(AndroidUtilities.lerp(0.0f, this.Q5[3], f7));
        }
    }

    public final void F4() {
        TLRPC.User user;
        if (this.e1 == 0 || V3() || (user = getMessagesController().getUser(Long.valueOf(this.e1))) == null || (user instanceof TLRPC.TL_userEmpty)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.e1);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            boolean z10 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
            if (!AndroidUtilities.isTablet() && z10) {
                NotificationCenter notificationCenter = getNotificationCenter();
                int i10 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(this, i10);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
            }
            int i11 = getArguments().getInt("nearby_distance", -1);
            if (i11 >= 0) {
                bundle.putInt("nearby_distance", i11);
            }
            un unVar = new un(bundle);
            unVar.N9 = getMediaDataController().getGreetingsSticker();
            unVar.O9 = false;
            presentFragment(unVar, z10);
            if (!AndroidUtilities.isTablet() || this.I0) {
                return;
            }
            finishFragment();
        }
    }

    @Override // org.telegram.ui.Components.mu0
    public final void G() {
        O4(false);
    }

    public final float G3() {
        return Utilities.clamp01((this.Q1 - X3()) / d4());
    }

    public final void G4() {
        TLRPC.ChatFull chatFull = this.u2;
        if (chatFull == null || chatFull.linked_chat_id == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.u2.linked_chat_id);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new un(bundle));
        }
    }

    public final void H3() {
        this.a2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f));
        this.b2 = 1.38f;
        this.c2 = 0.0f;
        W3();
        L4();
        s4(0, 1.0f, true);
        this.d2 = (this.a.getMeasuredWidth() / 2.0f) - (((this.f.getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin);
        this.f2 = (this.a.getMeasuredWidth() / 2.0f) - ((this.r.getExactWidth() * 0.5f) + (((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin + (this.v5 ? 0 : this.r.getPaddingLeft())));
        this.m6 = this.v5 ? 0.0f : this.r.getPaddingLeft();
        if (this.J1 != 2) {
            this.u0.setAlpha(1.0f);
        }
        this.X.setAlpha(1.0f);
        this.e0.setAlpha(1.0f);
    }

    public final void H4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.v2;
        if (userFull == null || (tL_businessLocation = userFull.business_location) == null) {
            return;
        }
        if (tL_businessLocation.geo_point == null || z10) {
            String str = BuildVars.isHuaweiStoreApp() ? "mapapp://navigation" : "http://maps.google.com/maps";
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str + "?q=" + this.v2.business_location.address, new Object[0]))));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        di.y8 y8Var = new di.y8(3, 1);
        y8Var.setResourceProvider(this.z0);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.local_id = -1;
        tL_message.peer_id = getMessagesController().getPeer(a());
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_businessLocation tL_businessLocation2 = this.v2.business_location;
        tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
        tL_messageMediaGeo.address = tL_businessLocation2.address;
        tL_message.media = tL_messageMediaGeo;
        y8Var.N0 = false;
        y8Var.v0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
        presentFragment(y8Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I3() {
        s4.e1 e1Var;
        View view;
        if (this.a.getVisibility() != 0) {
            return;
        }
        if (this.P) {
            this.N.setVisibleHeight(this.a.getMeasuredHeight() - this.N.getTop());
        }
        if (this.a.getChildCount() <= 0 || this.G1) {
            return;
        }
        Object[] objArr = 0;
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
            py0 py0Var = this.a;
            View F = py0Var.F(view);
            e1Var = (org.telegram.ui.Components.vl0) (F != null ? py0Var.T(F) : null);
        }
        int top = view == null ? 0 : view.getTop();
        int b10 = e1Var != null ? e1Var.b() : -1;
        if (top < 0 || b10 != 0) {
            top = 0;
        }
        boolean z10 = this.q0 == null && this.actionBar.n0;
        int i11 = this.P4;
        if (i11 != -1 && !z10) {
            org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) this.a.K(i11);
            z10 = vl0Var != null && vl0Var.a.getTop() <= 0;
        }
        if (this.L5 != z10) {
            this.L5 = z10;
            vz0 vz0Var = this.N;
            if (vz0Var != null) {
                vz0Var.setPagesVisibleOverscanTop(z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0);
            }
            AnimatorSet animatorSet = this.I5;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.J5;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            if (!this.L5) {
                if (this.L0) {
                    this.Q0.setVisibility(0);
                }
                if (this.M0) {
                    this.R0.setVisibility(0);
                }
                if (this.N0) {
                    this.S0.setVisibility(0);
                }
                this.T0.setVisibility(0);
            }
            x5(false);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.l().requestLayout();
            }
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.w0 w0Var = this.Q0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.T0, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 0.0f : 1.0f));
            org.telegram.ui.ActionBar.w0 w0Var2 = this.Q0;
            Property property2 = View.TRANSLATION_Y;
            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.T0, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.actionBar, this.M5, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<fl, Float>) property, z10 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<az0, Float>) property, z10 ? 0.0f : 1.0f));
            this.N.K0.setOpen(z10);
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this, this.p5, 0.0f));
            }
            if (this.u0 != null || this.v0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new by0(this, 3));
                arrayList.add(ofFloat);
            }
            K3();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.I5 = animatorSet3;
            animatorSet3.playTogether(arrayList);
            this.I5.setInterpolator(org.telegram.ui.Components.ds.f);
            this.I5.addListener(new mz0(this, objArr == true ? 1 : 0));
            this.I5.setDuration(150L);
            this.I5.start();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        }
        float f7 = top;
        if (this.Q1 == f7 || this.H1) {
            return;
        }
        this.Q1 = f7;
        this.d1.invalidate();
        if (this.J1 != 0) {
            this.M1 = this.Q1 > ((float) X3());
        }
        r4(true);
    }

    public final void I4(int i10, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        gz0 gz0Var = new gz0(this, user.id, this.f1, tL_chatAdminRights, this.E2.default_banned_rights, tL_chatBannedRights, str, i10, zArr, user);
        gz0Var.X0 = new hz0(this, i10, chatParticipant, z10, zArr);
        presentFragment(gz0Var);
    }

    public final void J3() {
        int i10 = this.J1;
        float f7 = 0.0f;
        if (i10 == 1 && (!this.r5 || this.G1)) {
            this.h6 = 0.0f;
        } else if (i10 == 2 && (!this.r5 || this.G1)) {
            az0 az0Var = this.r;
            this.h6 = az0Var == null ? 0.0f : az0Var.getAlpha();
        } else if (this.e1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            this.h6 = (1.0f - this.t5) * this.k2;
        } else {
            this.h6 = this.k2 * this.t5;
        }
        boolean z10 = this.e1 == UserConfig.getInstance(this.currentAccount).clientUserId;
        if (z10 && this.v5) {
            this.u5 = AndroidUtilities.dp(28.0f) * this.h6;
            az0 az0Var2 = this.r;
            if (az0Var2 != null) {
                az0Var2.setTranslationX(e4(this.l6, this.n6));
                this.Y.invalidate();
            }
        }
        if (z10) {
            if (this.v5) {
                f7 = this.k2;
            }
        } else if (this.w5) {
            f7 = this.h6;
        }
        v01 v01Var = this.p6;
        if (v01Var != null) {
            v01Var.e = 1.0f - f7;
            v01Var.invalidateSelf();
        }
        this.k6 = f7 > 0.5f;
        t5();
    }

    public final void J4(String str, org.telegram.ui.Cells.h hVar) {
        if (str.startsWith("@")) {
            getMessagesController().openByUserName(str.substring(1), this, 0, hVar);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            cy cyVar = new cy(null);
            cyVar.n2 = str;
            presentFragment(cyVar);
        } else {
            if (!str.startsWith("/") || this.parentLayout.getFragmentStack().size() <= 1) {
                return;
            }
            org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if (r2Var instanceof un) {
                finishFragment();
                ((un) r2Var).Y.X0(null, str, false, false);
            }
        }
    }

    @Override // org.telegram.ui.ux
    public final /* synthetic */ boolean K(cy cyVar) {
        return false;
    }

    public final void K3() {
        org.telegram.ui.Components.ox0 ox0Var = this.S;
        if (ox0Var != null) {
            ox0Var.setVisibility(!this.L5 && this.O5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0470  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K4(float f7, float f10, int i10, View view) {
        TLRPC.Chat chat;
        String publicUsername;
        TLRPC.TL_username findUsername;
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
        int i12 = 1;
        int i13 = 0;
        if (i10 == this.L3 || i10 == this.V2) {
            if (this.e1 == 0) {
                if (this.f1 != 0 && (chat = getMessagesController().getChat(Long.valueOf(this.f1))) != null && (this.g1 != 0 || ChatObject.isPublic(chat))) {
                    publicUsername = ChatObject.getPublicUsername(chat);
                    findUsername = DialogObject.findUsername(publicUsername, chat);
                    if (this.e1 != 0) {
                    }
                }
                return false;
            }
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e1));
            publicUsername = UserObject.getPublicUsername(user);
            if (user != null && publicUsername != null) {
                findUsername = DialogObject.findUsername(publicUsername, user);
                if (this.e1 != 0) {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.f1));
                    if (ChatObject.isPublic(chat2)) {
                        StringBuilder sb3 = new StringBuilder("https://");
                        sb3.append(getMessagesController().linkPrefix);
                        sb3.append("/");
                        sb3.append(ChatObject.getPublicUsername(chat2));
                        if (this.g1 != 0) {
                            str3 = "/" + this.g1;
                        }
                        sb3.append(str3);
                        sb2 = sb3.toString();
                    } else {
                        StringBuilder sb4 = new StringBuilder("https://");
                        sb4.append(getMessagesController().linkPrefix);
                        sb4.append("/c/");
                        sb4.append(chat2.id);
                        if (this.g1 != 0) {
                            str3 = "/" + this.g1;
                        }
                        sb4.append(str3);
                        sb2 = sb4.toString();
                    }
                    iz0 iz0Var = new iz0(this, getParentActivity(), sb2, sb2);
                    showDialog(iz0Var);
                    if (findUsername != null && !findUsername.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername.username = findUsername.username;
                        tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo, new as0(this, findUsername, iz0Var, i11)), getClassGuid());
                        return true;
                    }
                } else if (!S3(i10, view3)) {
                    if (findUsername != null && !findUsername.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo2 = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername2 = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername2.username = findUsername.username;
                        tL_getCollectibleInfo2.collectible = tL_inputCollectibleUsername2;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo2, new j10(26, this, findUsername)), getClassGuid());
                        return true;
                    }
                    try {
                        org.telegram.ui.Components.wc.b0(this).i(LocaleController.getString(R.string.UsernameCopied)).j();
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "@" + publicUsername));
                        return true;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return true;
                    }
                }
            }
            return false;
            return true;
        }
        if (i10 != this.H3) {
            int i14 = 13;
            int i15 = 2;
            String str4 = null;
            if (i10 == this.G3 || i10 == this.T2) {
                if (!S3(i10, view3)) {
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.e1));
                    if (user2 != null && (str = user2.phone) != null && str.length() != 0 && getParentActivity() != null) {
                        if (i10 == this.G3 && user2.phone.startsWith("888")) {
                            TL_fragment.TL_inputCollectiblePhone tL_inputCollectiblePhone = new TL_fragment.TL_inputCollectiblePhone();
                            String str5 = user2.phone;
                            tL_inputCollectiblePhone.phone = str5;
                            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo3 = new TL_fragment.TL_getCollectibleInfo();
                            tL_getCollectibleInfo3.collectible = tL_inputCollectiblePhone;
                            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo3, new as0(this, str5, user2, 5)), getClassGuid());
                            return true;
                        }
                        org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(this, view3);
                        H.W(this.a.V0(view3, false));
                        H.w = false;
                        if (i10 == this.G3) {
                            TLRPC.UserFull userFull3 = this.v2;
                            if (userFull3 != null && userFull3.phone_calls_available) {
                                H.c(R.drawable.msg_calls, LocaleController.getString(R.string.CallViaTelegram), new ux0(this, user2, i12), false);
                                if (this.v2.video_calls_available) {
                                    H.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new ux0(this, user2, i15), false);
                                }
                            }
                            if (!this.h5) {
                                H.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.Call), new ux0(this, user2, 3), false);
                            }
                        }
                        H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new ux0(this, user2, i11), false);
                        if (this.h5) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AnonymousNumberNotice)));
                            int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                            int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                                int i16 = lastIndexOf - 1;
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.q61(AndroidUtilities.bold()), indexOf, i16, 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.I6, this.z0), indexOf, i16, 33);
                            }
                            H.k();
                            H.p(13, AndroidUtilities.dp(200.0f), spannableStringBuilder);
                            if (H.z() instanceof TextView) {
                                TextView textView = (TextView) H.z();
                                int i17 = org.telegram.ui.ActionBar.y6.I5;
                                org.telegram.ui.ActionBar.f7.R(textView, org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i17, this.z0), 0, 6), null, org.telegram.ui.ActionBar.f7.N(i17), this.z0);
                                textView.setOnClickListener(new bh.f(23));
                            }
                        }
                        H.Z();
                        return true;
                    }
                }
                return true;
            }
            if (i10 == this.K3 || i10 == this.J3 || i10 == this.I3 || i10 == this.W2) {
                if (i10 != this.W2 || ((userFull = this.v2) != null && !TextUtils.isEmpty(userFull.about))) {
                    if (!S3(i10, view3)) {
                        if (view3 instanceof org.telegram.ui.Cells.j) {
                            org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view3;
                            if (jVar.b0 && jVar.V <= 0.0f) {
                                jVar.h();
                                return false;
                            }
                        }
                        if (i10 == this.I3) {
                            TLRPC.ChatFull chatFull = this.u2;
                            if (chatFull != null) {
                                TLRPC.ChannelLocation channelLocation = chatFull.location;
                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                    str4 = ((TLRPC.TL_channelLocation) channelLocation).address;
                                }
                            }
                        } else if (i10 == this.K3) {
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
                            String[] strArr = {TranslateController.UNKNOWN_LANGUAGE};
                            boolean isContextTranslateEnabled = MessagesController.getInstance(this.currentAccount).getTranslateController().isContextTranslateEnabled();
                            boolean[] zArr = {i10 == this.W2 || i10 == this.K3 || i10 == this.J3};
                            String L = org.telegram.ui.Components.f51.L();
                            ig.d1 d1Var = new ig.d1(this, view3, str6, i10, zArr, strArr, L);
                            if (!zArr[0]) {
                                d1Var.run();
                                return true;
                            }
                            if (LanguageDetector.hasSupport()) {
                                LanguageDetector.detectLanguage(str6, new org.telegram.messenger.ik(this, strArr, zArr, L, isContextTranslateEnabled, d1Var), new hl0(d1Var, i14));
                                return true;
                            }
                            d1Var.run();
                            return true;
                        }
                    }
                    return true;
                }
            } else if ((i10 == this.O3 || i10 == this.P3) && getParentActivity() != null && (userFull2 = this.v2) != null) {
                if (i10 != this.O3) {
                    if (i10 == this.P3 && !S3(i10, view3)) {
                        TLRPC.TL_businessLocation tL_businessLocation = this.v2.business_location;
                        if (tL_businessLocation != null) {
                            str2 = tL_businessLocation.address;
                            String str7 = str2;
                            AtomicReference atomicReference = new AtomicReference();
                            org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(getParentActivity(), R.drawable.popup_fixed_alert, i13, this.z0, 1);
                            zoVar.U = new Path();
                            zoVar.setFitItems(true);
                            org.telegram.ui.ActionBar.w0.c(false, false, zoVar, R.drawable.msg_copy, LocaleController.getString(R.string.Copy), false, this.z0).setOnClickListener(new di.c6(this, atomicReference, str7, i10, 5));
                            org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(zoVar, -2, -2);
                            o1Var.e = true;
                            o1Var.c = 220;
                            o1Var.setOutsideTouchable(true);
                            o1Var.setClippingEnabled(true);
                            o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                            o1Var.setFocusable(true);
                            zoVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            o1Var.setInputMethodMode(2);
                            o1Var.getContentView().setFocusableInTouchMode(true);
                            atomicReference.set(o1Var);
                            f11 = f7;
                            f12 = f10;
                            while (view3 != null) {
                                f11 += view3.getX();
                                f12 += view3.getY();
                                view3 = (View) view3.getParent();
                            }
                            if (AndroidUtilities.isTablet()) {
                                f11 += view2.getX() + view2.getPaddingLeft();
                                f12 += view2.getY() + view2.getPaddingTop();
                            }
                            o1Var.showAtLocation(getFragmentView(), 0, (int) (f11 - (zoVar.getMeasuredWidth() / 2.0f)), (int) f12);
                            o1Var.b();
                            return true;
                        }
                    }
                    return true;
                }
                TL_account.TL_businessWorkHours tL_businessWorkHours = userFull2.business_work_hours;
                if (tL_businessWorkHours != null) {
                    str2 = jg.h1.g0(this.currentAccount, userFull2.user, tL_businessWorkHours);
                    String str72 = str2;
                    AtomicReference atomicReference2 = new AtomicReference();
                    org.telegram.ui.Components.zo zoVar2 = new org.telegram.ui.Components.zo(getParentActivity(), R.drawable.popup_fixed_alert, i13, this.z0, 1);
                    zoVar2.U = new Path();
                    zoVar2.setFitItems(true);
                    org.telegram.ui.ActionBar.w0.c(false, false, zoVar2, R.drawable.msg_copy, LocaleController.getString(R.string.Copy), false, this.z0).setOnClickListener(new di.c6(this, atomicReference2, str72, i10, 5));
                    org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(zoVar2, -2, -2);
                    o1Var2.e = true;
                    o1Var2.c = 220;
                    o1Var2.setOutsideTouchable(true);
                    o1Var2.setClippingEnabled(true);
                    o1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                    o1Var2.setFocusable(true);
                    zoVar2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    o1Var2.setInputMethodMode(2);
                    o1Var2.getContentView().setFocusableInTouchMode(true);
                    atomicReference2.set(o1Var2);
                    f11 = f7;
                    f12 = f10;
                    while (view3 != null && view3 != getFragmentView()) {
                        f11 += view3.getX();
                        f12 += view3.getY();
                        view3 = (View) view3.getParent();
                    }
                    if (AndroidUtilities.isTablet() && (view2 = this.parentLayout.getView()) != null) {
                        f11 += view2.getX() + view2.getPaddingLeft();
                        f12 += view2.getY() + view2.getPaddingTop();
                    }
                    o1Var2.showAtLocation(getFragmentView(), 0, (int) (f11 - (zoVar2.getMeasuredWidth() / 2.0f)), (int) f12);
                    o1Var2.b();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.f50
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.Cells.d4 d4Var = this.g0;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x07f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L3(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        TLRPC.ChatFull chatFull;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z24;
        boolean z25;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        boolean z26;
        boolean z27;
        org.telegram.ui.Components.bi0 bi0Var;
        boolean z28;
        boolean z29;
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
        this.P0 = null;
        this.N0 = false;
        this.L0 = false;
        this.K0 = false;
        this.M0 = false;
        this.A1 = false;
        if (this.e1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e1));
            if (user == null) {
                return;
            }
            if (UserObject.isUserSelf(user)) {
                if (this.s1) {
                    org.telegram.ui.Components.bi0 bi0Var2 = this.Z;
                    if (bi0Var2 != null) {
                        this.N0 = !(bi0Var2.H == 6);
                    } else {
                        this.N0 = true;
                    }
                }
                if (!this.I0) {
                    this.T0.e(30, R.drawable.msg_edit, LocaleController.getString(R.string.EditInfo));
                    if (this.q0 != null) {
                        this.T0.e(36, R.drawable.msg_addphoto, LocaleController.getString(R.string.AddPhoto));
                    }
                }
                this.V0 = this.T0.e(40, R.drawable.menu_profile_colors, LocaleController.getString(R.string.ProfileColorEdit));
                i5();
                if (this.s1) {
                    this.X0 = this.T0.e(43, R.drawable.menu_username_change, LocaleController.getString(R.string.ProfileUsernameEdit));
                    this.W0 = this.T0.e(42, R.drawable.msg_link2, LocaleController.getString(R.string.ProfileCopyLink));
                    o5();
                }
                z11 = false;
                z28 = false;
                z29 = true;
            } else {
                if (user.bot && user.bot_can_edit) {
                    this.N0 = true;
                }
                TLRPC.UserFull userFull = this.v2;
                if (userFull != null && userFull.phone_calls_available) {
                    this.L0 = true;
                    this.M0 = userFull.video_calls_available;
                }
                if (!this.r2 && getContactsController().contactsDict.get(Long.valueOf(this.e1)) != null) {
                    if (this.D2 == null) {
                        M3(context);
                    }
                    if (!TextUtils.isEmpty(user.phone)) {
                        this.T0.e(3, R.drawable.msg_share, LocaleController.getString(R.string.ShareContact));
                    }
                    this.T0.e(2, R.drawable.msg_block, LocaleController.getString(!this.k1 ? R.string.BlockContact : R.string.Unblock));
                    this.T0.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditContact));
                    this.T0.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteContact));
                } else if (MessagesController.isSupportUser(user)) {
                    if (this.k1) {
                        this.T0.e(2, R.drawable.msg_block, LocaleController.getString(R.string.Unblock));
                    }
                    this.T0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                } else if (a() != UserObject.VERIFY) {
                    if (this.D2 == null) {
                        M3(context);
                    }
                    this.T0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    if (this.r2) {
                        this.T0.e(10, R.drawable.msg_share, LocaleController.getString(R.string.BotShare));
                        z11 = true;
                    } else {
                        this.T0.e(1, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddContact));
                        z11 = false;
                    }
                    if (!TextUtils.isEmpty(user.phone)) {
                        this.T0.e(3, R.drawable.msg_share, LocaleController.getString(R.string.ShareContact));
                    }
                    if (this.r2) {
                        this.T0.e(44, R.drawable.menu_privacy_policy, LocaleController.getString(R.string.BotPrivacyPolicy));
                        if (k4()) {
                            this.T0.S(44);
                        } else {
                            this.T0.t(44);
                        }
                        org.telegram.ui.ActionBar.g1 e = this.T0.e(24, R.drawable.msg_report, LocaleController.getString(R.string.ReportBot));
                        int i10 = org.telegram.ui.ActionBar.y6.p7;
                        e.c(i10, i10);
                        if (this.k1) {
                            this.T0.e(2, R.drawable.msg_retry, LocaleController.getString(R.string.BotRestart));
                        } else {
                            this.T0.e(2, R.drawable.msg_block2, LocaleController.getString(R.string.DeleteAndBlock)).c(i10, i10);
                        }
                    } else {
                        this.T0.e(2, R.drawable.msg_block, LocaleController.getString(!this.k1 ? R.string.BlockContact : R.string.Unblock));
                    }
                    if (!UserObject.isDeleted(user) && !this.r2 && this.D2 == null && !this.k1) {
                        j10 = this.e1;
                        if (j10 != 333000 && j10 != 777000 && j10 != 42777) {
                            if (!BuildVars.IS_BILLING_UNAVAILABLE || user.self || user.bot || MessagesController.isSupportUser(user) || getMessagesController().premiumPurchaseBlocked()) {
                                z28 = false;
                            } else {
                                bi.ca.y(this.currentAccount, false).V();
                                this.T0.e(38, R.drawable.msg_gift_premium, LocaleController.getString(R.string.ProfileSendAGift));
                                z28 = true;
                            }
                            if (getMessagesController().config.walletAvailable.get() && !MessagesController.isSupportUser(user) && !UserObject.isService(user.id)) {
                                this.T0.e(48, R.drawable.ic_gram, LocaleController.getString(R.string.WalletSendMoney));
                            }
                            this.T0.e(20, R.drawable.msg_secret, LocaleController.getString(R.string.StartEncryptedChat));
                            this.T0.Q(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.e1)));
                            if (this.v2 != null) {
                                this.T0.e(46, R.drawable.menu_share_off_24, LocaleController.getString(R.string.DisableSharing));
                                this.T0.e(47, R.drawable.menu_share_on_24, LocaleController.getString(R.string.EnableSharing));
                                TLRPC.UserFull userFull2 = this.v2;
                                boolean z30 = (userFull2.noforwards_my_enabled || userFull2.noforwards_peer_enabled) ? false : true;
                                this.T0.Q(46, z30);
                                this.T0.Q(47, !z30);
                            }
                            if (!this.r2 && getContactsController().contactsDict.get(Long.valueOf(this.e1)) != null) {
                                this.T0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                            }
                            z29 = false;
                        }
                    }
                    z28 = false;
                    if (!this.r2) {
                        this.T0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    }
                    z29 = false;
                }
                z11 = false;
                if (!UserObject.isDeleted(user)) {
                    j10 = this.e1;
                    if (j10 != 333000) {
                        if (BuildVars.IS_BILLING_UNAVAILABLE) {
                        }
                        z28 = false;
                        if (getMessagesController().config.walletAvailable.get()) {
                            this.T0.e(48, R.drawable.ic_gram, LocaleController.getString(R.string.WalletSendMoney));
                        }
                        this.T0.e(20, R.drawable.msg_secret, LocaleController.getString(R.string.StartEncryptedChat));
                        this.T0.Q(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.e1)));
                        if (this.v2 != null) {
                        }
                        if (!this.r2) {
                        }
                        z29 = false;
                    }
                }
                z28 = false;
                if (!this.r2) {
                }
                z29 = false;
            }
            z15 = false;
            z17 = false;
            z18 = false;
            z13 = z29;
            z16 = z28;
            z12 = false;
            z14 = false;
        } else if (this.f1 != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f1));
            this.p1 = false;
            if (this.g1 == 0 && ChatObject.canChangeChatInfo(chat)) {
                M3(context);
            }
            if (ChatObject.isChannel(chat)) {
                if (this.q1) {
                    if (ChatObject.canManageTopic(this.currentAccount, chat, this.g1)) {
                        this.N0 = true;
                    }
                } else if (ChatObject.hasAdminRights(chat) || (chat.megagroup && ChatObject.canChangeChatInfo(chat))) {
                    this.N0 = true;
                }
                if (this.u2 != null) {
                    if (ChatObject.canManageCalls(chat) && this.u2.call == null) {
                        this.T0.e(15, R.drawable.msg_voicechat, LocaleController.getString((!chat.megagroup || chat.gigagroup) ? R.string.StartVoipChannel : R.string.StartVoipChat));
                        this.p1 = true;
                        if (!chat.megagroup || chat.gigagroup) {
                            z26 = false;
                            z22 = true;
                        } else {
                            z22 = false;
                            z26 = true;
                        }
                    } else {
                        z26 = false;
                        z22 = false;
                    }
                    TLRPC.ChatFull chatFull2 = this.u2;
                    if ((chatFull2.can_view_stats || chatFull2.can_view_revenue || chatFull2.can_view_stars_revenue || getMessagesController().getStoriesController().j(a())) && this.g1 == 0) {
                        this.T0.e(19, R.drawable.msg_stats, LocaleController.getString(R.string.Statistics));
                    }
                    ChatObject.Call groupCall = getMessagesController().getGroupCall(this.f1, false);
                    this.L0 = groupCall != null;
                    z21 = groupCall != null || z26;
                } else {
                    z21 = false;
                    z22 = false;
                }
                getMessagesController().getStoriesController().getClass();
                if (chat == null || !ChatObject.isBoostSupported(chat) || (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.post_stories))) {
                    getMessagesController().getStoriesController().getClass();
                    if (chat != null && ChatObject.isBoostSupported(chat) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories))) {
                        this.T0.e(39, R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories));
                    }
                    z23 = false;
                } else {
                    this.T0.e(39, R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories));
                    z23 = true;
                }
                if (chat.megagroup) {
                    TLRPC.ChatFull chatFull3 = this.u2;
                    if (chatFull3 == null || !chatFull3.participants_hidden || ChatObject.hasAdminRights(chat)) {
                        this.A1 = true;
                        this.T0.e(17, R.drawable.msg_search, LocaleController.getString(R.string.SearchMembers));
                    }
                    if (this.q1 && ChatObject.canDeleteTopic(this.currentAccount, chat, this.g1)) {
                        this.T0.e(23, R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1));
                    }
                    if (this.g1 == 0) {
                        this.T0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    }
                    if (chat.creator) {
                        this.T0.a(-1);
                        this.T0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMega));
                        this.T0.e(45, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteMega)).c(org.telegram.ui.ActionBar.y6.q7, org.telegram.ui.ActionBar.y6.p7);
                    } else if (chat.left || chat.kicked || this.q1) {
                        z12 = z21;
                        z11 = false;
                        z13 = false;
                        z16 = false;
                        z18 = false;
                        z17 = z23;
                        z15 = z22;
                        z14 = false;
                    } else {
                        this.T0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMega));
                    }
                    z12 = z21;
                    z11 = false;
                    z13 = false;
                    z16 = false;
                    z18 = true;
                    z17 = z23;
                    z15 = z22;
                    z14 = false;
                } else {
                    if (ChatObject.isPublic(chat)) {
                        this.T0.e(10, R.drawable.msg_share, LocaleController.getString(R.string.BotShare));
                        z24 = !chat.creator;
                    } else {
                        z24 = false;
                    }
                    if (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked()) {
                        z16 = false;
                    } else {
                        bi.ca.y(this.currentAccount, false).V();
                        this.T0.e(38, R.drawable.msg_gift_premium, LocaleController.getString(R.string.ProfileSendAGiftToChannel));
                        org.telegram.ui.ActionBar.w0 w0Var = this.T0;
                        TLRPC.ChatFull chatFull4 = this.u2;
                        w0Var.Q(38, chatFull4 != null && chatFull4.stargifts_available);
                        z16 = true;
                    }
                    TLRPC.ChatFull chatFull5 = this.u2;
                    if (chatFull5 == null || chatFull5.linked_chat_id == 0) {
                        z25 = false;
                    } else {
                        this.T0.e(22, R.drawable.msg_discussion, LocaleController.getString(R.string.ViewDiscussion));
                        z25 = true;
                    }
                    if (this.g1 == 0) {
                        this.T0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    }
                    TLRPC.Chat chat2 = this.E2;
                    if (chat2.creator) {
                        this.T0.a(-1);
                        this.T0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveChannel));
                        this.T0.e(45, R.drawable.msg_delete, LocaleController.getString(R.string.ChannelDelete)).c(org.telegram.ui.ActionBar.y6.q7, org.telegram.ui.ActionBar.y6.p7);
                    } else if (chat2.left || chat2.kicked) {
                        boolean z31 = z24;
                        z12 = z21;
                        z11 = z31;
                        z18 = false;
                        z17 = z23;
                        z15 = z22;
                        z14 = z25;
                        z13 = false;
                    } else {
                        this.T0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveChannel));
                    }
                    boolean z32 = z24;
                    z12 = z21;
                    z11 = z32;
                    z18 = true;
                    z17 = z23;
                    z15 = z22;
                    z14 = z25;
                    z13 = false;
                }
            } else {
                if (this.u2 != null) {
                    if (ChatObject.canManageCalls(chat) && this.u2.call == null) {
                        this.T0.e(15, R.drawable.msg_voicechat, LocaleController.getString(R.string.StartVoipChat));
                        this.p1 = true;
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    ChatObject.Call groupCall2 = getMessagesController().getGroupCall(this.f1, false);
                    this.L0 = groupCall2 != null;
                    if (groupCall2 != null || z20) {
                        z19 = true;
                        if (ChatObject.canChangeChatInfo(chat)) {
                            this.N0 = true;
                        }
                        if (!ChatObject.isKickedFromChat(chat) && !ChatObject.isLeftFromChat(chat) && ((chatFull = this.u2) == null || !chatFull.participants_hidden || ChatObject.hasAdminRights(chat))) {
                            this.A1 = true;
                            this.T0.e(17, R.drawable.msg_search, LocaleController.getString(R.string.SearchMembers));
                        }
                        if (this.g1 == 0) {
                            this.T0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                        }
                        this.T0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.DeleteAndExit));
                        z12 = z19;
                        z11 = false;
                        z13 = false;
                        z14 = false;
                        z15 = false;
                        z16 = false;
                        z17 = false;
                        z18 = true;
                    }
                }
                z19 = false;
                if (ChatObject.canChangeChatInfo(chat)) {
                }
                if (!ChatObject.isKickedFromChat(chat)) {
                    this.A1 = true;
                    this.T0.e(17, R.drawable.msg_search, LocaleController.getString(R.string.SearchMembers));
                }
                if (this.g1 == 0) {
                }
                this.T0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.DeleteAndExit));
                z12 = z19;
                z11 = false;
                z13 = false;
                z14 = false;
                z15 = false;
                z16 = false;
                z17 = false;
                z18 = true;
            }
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
            z16 = false;
            z17 = false;
            z18 = false;
        }
        if (this.q0 != null) {
            this.T0.e(33, R.drawable.msg_openprofile, LocaleController.getString(R.string.SetAsMain));
            this.T0.e(21, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery));
            this.T0.e(35, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
        } else {
            this.T0.e(21, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery));
        }
        if (n4()) {
            this.T0.t(21);
        }
        boolean z33 = z14;
        if (this.e1 != 0 && !this.r2 && !this.s1) {
            org.telegram.ui.ActionBar.g1 e10 = this.T0.e(24, R.drawable.msg_report, LocaleController.getString(R.string.ReportBot));
            int i11 = org.telegram.ui.ActionBar.y6.p7;
            e10.c(i11, i11);
        }
        if (z13 && !this.s1) {
            this.T0.e(31, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        }
        if (!this.p2) {
            this.T0.t(21);
            this.T0.t(33);
            this.T0.S(36);
            this.T0.t(34);
            this.T0.t(35);
        }
        this.K0 = this.L0;
        org.telegram.ui.Components.bi0 bi0Var3 = this.Z;
        if (bi0Var3 != null) {
            bi0Var3.I = true;
            bi0Var3.o(4, z11);
            this.Z.o(5, this.L0);
            this.Z.o(6, this.M0);
            this.Z.o(2, z33);
            this.Z.o(9, z18);
            this.Z.o(12, z17);
            this.Z.o(10, z12);
            this.Z.o(11, z15);
            this.Z.o(3, z16);
            this.M0 = false;
            this.L0 = false;
            if (!z33) {
                if (this.q1) {
                    this.Z.o(0, true);
                } else {
                    if (this.f1 != 0) {
                        TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(this.f1));
                        if (ChatObject.isForum(chat3) || ChatObject.isMegagroup(chat3)) {
                            z27 = false;
                            this.Z.o(0, true);
                        } else if (!ChatObject.isChannel(chat3)) {
                            z27 = false;
                            this.Z.o(0, true);
                        }
                        bi0Var = this.Z;
                        if (bi0Var.I) {
                            bi0Var.I = z27;
                            bi0Var.d();
                        }
                    }
                    z27 = false;
                    bi0Var = this.Z;
                    if (bi0Var.I) {
                    }
                }
            }
            z27 = false;
            bi0Var = this.Z;
            if (bi0Var.I) {
            }
        }
        if (!this.L5) {
            if (this.L0) {
                if (this.Q0.getVisibility() != 0) {
                    this.Q0.setVisibility(0);
                    if (z10) {
                        this.Q0.setAlpha(0.0f);
                        this.Q0.animate().alpha(1.0f).setDuration(150L).start();
                    }
                }
            } else if (this.Q0.getVisibility() != 8) {
                this.Q0.setVisibility(8);
            }
            if (this.M0) {
                if (this.R0.getVisibility() != 0) {
                    this.R0.setVisibility(0);
                    if (z10) {
                        this.R0.setAlpha(0.0f);
                        this.R0.animate().alpha(1.0f).setDuration(150L).start();
                    }
                }
            } else if (this.R0.getVisibility() != 8) {
                this.R0.setVisibility(8);
            }
            if (this.N0) {
                if (this.S0.getVisibility() != 0) {
                    this.S0.setVisibility(0);
                    if (z10) {
                        this.S0.setAlpha(0.0f);
                        this.S0.animate().alpha(1.0f).setDuration(150L).start();
                    }
                }
            } else if (this.S0.getVisibility() != 8) {
                this.S0.setVisibility(8);
            }
        }
        m01 m01Var = this.o0;
        if (m01Var != null && m01Var.h && !m01Var.d.isRunning()) {
            if (this.N0) {
                this.S0.setVisibility(8);
                this.S0.animate().cancel();
                this.S0.setAlpha(1.0f);
            }
            if (this.L0) {
                this.Q0.setVisibility(8);
                this.Q0.animate().cancel();
                this.Q0.setAlpha(1.0f);
            }
            if (this.M0) {
                this.R0.setVisibility(8);
                this.R0.animate().cancel();
                this.R0.setAlpha(1.0f);
            }
        }
        vz0 vz0Var = this.N;
        if (vz0Var != null) {
            vz0Var.getSearchItem().requestLayout();
        }
        x5(false);
    }

    public final void L4() {
        ValueAnimator valueAnimator;
        if (!this.p2 || (valueAnimator = this.j2) == null || !valueAnimator.isRunning()) {
            M4(G3(), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        } else {
            this.e2 = this.R5;
            this.g2 = this.S5;
        }
    }

    public final void M3(Context context) {
        this.a1 = new org.telegram.ui.Components.r8(context, this.T0.getPopupLayout().getSwipeBack(), new oy0(this), false, 0, this.z0);
        if (this.i1 > 0 || this.e1 > 0) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.n6, this.z0);
            org.telegram.ui.Components.r8 r8Var = this.a1;
            org.telegram.ui.Components.z90 z90Var = r8Var.e;
            if (z90Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AutoDeletePopupDescription));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.AutoDeletePopupDescription2), w02, new org.telegram.ui.Components.pg(r8Var, 11)));
                z90Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.v2;
        org.telegram.ui.Components.e31 a2 = org.telegram.ui.Components.e31.a((userFull == null && this.u2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.u2.ttl_period);
        this.s0 = a2;
        this.Z0 = this.T0.i(0, a2, LocaleController.getString(R.string.AutoDeletePopupTitle), this.a1.a);
        this.T0.a(-1);
        f5();
    }

    public final void M4(float f7, float f10) {
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - c4()) / ((this.a.getMeasuredWidth() - f10) - d4())));
        float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (AndroidUtilities.dp(42.0f) * ((this.Q1 >= ((float) c4()) || max >= 0.33f) ? AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) : c3.h0.x(f7, 72.0f, 24.0f, 42.0f)))) * f7) + ((float) Math.floor(this.actionBar.getTranslationY() + (org.telegram.messenger.vh.a(f7, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) - (AndroidUtilities.density * 21.0f))));
        this.e2 = (AndroidUtilities.dp(7.0f) * f7) + AndroidUtilities.dp(1.3f) + dpf2;
        this.g2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * f7) + dpf2 + AndroidUtilities.dp(24.0f);
    }

    @Override // org.telegram.ui.Components.tv0
    public final void N() {
        org.telegram.ui.Components.sv0 sv0Var;
        vz0 vz0Var = this.N;
        if (vz0Var != null && (sv0Var = this.Q) != null) {
            vz0Var.setNewMediaCounts(sv0Var.c);
        }
        if (this.d != null) {
            p5(false, false);
        }
        S();
        if (this.v2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void N3() {
        if (this.fragmentView == null || !this.e6 || this.y2 == null || getParentActivity() == null) {
            return;
        }
        b11 b11Var = this.q6;
        if (b11Var != null) {
            b11Var.b(this.y2);
            this.q6.invalidate();
        } else {
            b11 b11Var2 = new b11(this, this.y2);
            this.q6 = b11Var2;
            ((FrameLayout) this.fragmentView).addView(b11Var2, org.telegram.ui.Components.gb1.i(-1, -1, 55));
        }
    }

    public final void N4() {
        py0 py0Var = this.a;
        if (py0Var == null || this.c == null || py0Var.getChildCount() <= 0 || this.d6) {
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
            this.b6 = i11;
            int top = view.getTop();
            this.c6 = top;
            if (this.b6 == 0 && !this.o2 && top > c4()) {
                this.c6 = c4();
            }
            this.c.h1(i11, view.getTop() - this.a.getPaddingTop());
        }
    }

    public final void O3(Context context) {
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        if (r5Var != null) {
            AndroidUtilities.removeFromParent(r5Var);
        }
        lz0 lz0Var = new lz0(this, context, this.z0);
        this.simpleActionBar = lz0Var;
        lz0Var.setOccupyStatusBar(this.actionBar.getOccupyStatusBar());
        this.simpleActionBar.setMenuOverlayProvider(new pg(2, this));
        if (this.I0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.outline_header_qr_24);
            this.simpleActionBar.setBackButtonContentDescription(LocaleController.getString(R.string.QrCode));
        } else {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 29));
        this.simpleActionBar.setVisibility(8);
    }

    public final void O4(boolean z10) {
        int i10 = this.P4;
        if (i10 >= 0) {
            if (!z10) {
                this.c.h1(i10, -this.a.getPaddingTop());
                return;
            }
            mi.n nVar = new mi.n(getParentActivity(), 2, 0.6f);
            nVar.a = this.P4;
            nVar.p = -this.a.getPaddingTop();
            this.c.w0(nVar);
        }
    }

    public final void Q3(float f7) {
        ValueAnimator ofFloat;
        int i10 = 0;
        boolean z10 = f7 > 0.0f;
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.a6;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.a6 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.x0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new by0(this, i10));
        this.a6.playTogether(arrayList);
        this.a6.setDuration(z10 ? 150L : 220L);
        if (!z10) {
            this.a6.addListener(new mz0(this, 5));
        }
        this.a6.start();
    }

    public final void Q4() {
        org.telegram.ui.Components.bi0 bi0Var = this.Z;
        if (bi0Var == null) {
            return;
        }
        if (this.s1) {
            bi0Var.H = 6;
            return;
        }
        if (this.q1) {
            bi0Var.H = 5;
            return;
        }
        if (this.r2) {
            bi0Var.H = 2;
            return;
        }
        if (this.e1 != 0) {
            bi0Var.H = 0;
            return;
        }
        if (this.f1 != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f1));
            if (!ChatObject.isChannel(chat)) {
                this.Z.H = 3;
                return;
            }
            if (ChatObject.isMegagroup(chat)) {
                this.Z.H = 3;
            } else if (ChatObject.isForum(chat)) {
                this.Z.H = 4;
            } else {
                this.Z.H = 1;
            }
        }
    }

    @Override // org.telegram.ui.Components.f50
    public final void R(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ii.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final void R3(int i10, View view) {
        org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(this, view);
        H.W(this.a.V0(view, false));
        H.w = false;
        H.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new fb0(this, 26), this.v2 != null);
        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Edit), new fb0(this, 27), false);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.h2(this, i10, 26), true);
        H.Z();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0308  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R4(float f7) {
        int w02;
        boolean z10;
        v01 v01Var;
        int i10;
        int f10;
        bi.i1 i1Var;
        x01 x01Var;
        if (this.actionBar == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        this.l2 = f7;
        float lerp = AndroidUtilities.lerp(this.m2, f7);
        this.k2 = lerp;
        J3();
        this.X.setScaleX(this.b2);
        this.X.setScaleY(this.b2);
        this.X.setTranslationY(AndroidUtilities.lerp((float) Math.ceil(this.a2), 0.0f, lerp));
        this.e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(i4(), 0.0f, lerp));
        yy0 yy0Var = this.e0;
        float f11 = this.b2;
        boolean z11 = this.p2;
        yy0Var.H = lerp;
        yy0Var.I = f11;
        yy0Var.G = z11;
        if (lerp <= 0.0f) {
            org.telegram.ui.Components.bi0 bi0Var = this.Z;
            if (bi0Var != null) {
                bi0Var.i();
            }
            org.telegram.ui.Components.ui0 ui0Var = this.b0;
            if (ui0Var != null) {
                ui0Var.c();
            }
        }
        bz0 bz0Var = this.u0;
        if (bz0Var != null) {
            bz0Var.setExpandProgress(lerp);
        }
        bi.i1 i1Var2 = this.v0;
        if (i1Var2 != null) {
            i1Var2.setExpandProgress(lerp);
        }
        org.telegram.ui.Components.ox0 ox0Var = this.S;
        if (ox0Var != null) {
            ox0Var.setParentExpanded(lerp);
        }
        org.telegram.ui.Components.bi0 bi0Var2 = this.Z;
        if (bi0Var2 != null) {
            bi0Var2.setParentExpanded(lerp);
        }
        org.telegram.ui.Components.ui0 ui0Var2 = this.b0;
        if (ui0Var2 != null) {
            ui0Var2.setParentExpanded(lerp);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.U0;
        if (w0Var != null) {
            float f12 = 1.0f - lerp;
            w0Var.setAlpha(f12);
            this.U0.setScaleY(f12);
            this.U0.setVisibility(0);
            org.telegram.ui.ActionBar.w0 w0Var2 = this.U0;
            w0Var2.setClickable(w0Var2.getAlpha() > 0.5f);
        }
        float G3 = G3();
        if (G3 >= 1.0f) {
            this.e0.setAlpha(1.0f);
        }
        if (!this.p2) {
            M4(G3, currentActionBarHeight);
        } else if (this.Q1 >= d4() && this.h2 < 0.33f) {
            L4();
        }
        org.telegram.ui.Components.en0 en0Var = this.K;
        if (en0Var != null) {
            en0Var.b(i0.a.f(lerp, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h8, this.z0), Color.argb(179, 255, 255, 255)));
        }
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setColorFilter(this.X5 != null ? -1 : i0.a.f(lerp, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.pc, this.z0), -1), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.cs csVar = this.I;
        if (csVar != null) {
            csVar.a(lerp);
        }
        org.telegram.ui.Components.cs csVar2 = this.J;
        if (csVar2 != null) {
            csVar2.a(lerp);
        }
        k5(lerp);
        float f13 = this.d2;
        float f14 = this.f2;
        if (G3 < 1.0f) {
            f13 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(63.0f), f13, G3);
            f14 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(63.0f), f14, G3);
        }
        float dpf2 = AndroidUtilities.dpf2(8.0f);
        float dpf22 = AndroidUtilities.dpf2(this.p2 ? 8.0f : -24.0f);
        float dpf23 = AndroidUtilities.dpf2(18.0f) - ((FrameLayout.LayoutParams) this.f.getLayoutParams()).leftMargin;
        float f15 = currentActionBarHeight;
        float X3 = (((this.Q1 + f15) - X3()) - AndroidUtilities.dpf2(30.0f)) - this.f.getBottom();
        float B = c3.h0.B(dpf23, f13, 2.0f, dpf2 + f13);
        float f16 = this.e2;
        float f17 = 1.0f - lerp;
        float f18 = f17 * f17;
        float f19 = f17 * 2.0f * lerp;
        float f20 = (B * f19) + (f13 * f18);
        float f21 = lerp * lerp;
        float f22 = (dpf23 * f21) + f20;
        float B2 = (X3 * f21) + (c3.h0.B(X3, f16, 2.0f, dpf22 + f16) * f19) + (f16 * f18);
        float dpf24 = AndroidUtilities.dpf2(16.0f) - ((FrameLayout.LayoutParams) this.r.getLayoutParams()).leftMargin;
        float X32 = (((this.Q1 + f15) - X3()) - AndroidUtilities.dpf2(10.0f)) - this.r.getBottom();
        float B3 = c3.h0.B(dpf24, f14, 2.0f, dpf2 + f14);
        float f23 = this.g2;
        float f24 = (dpf24 * f21) + (B3 * f19) + (f14 * f18);
        float B4 = (f21 * X32) + (f19 * c3.h0.B(X32, f23, 2.0f, dpf22 + f23)) + (f18 * f23);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
        float dpf25 = AndroidUtilities.dpf2(22.7f) + floor;
        this.f.setTranslationX(f22);
        this.f.setTranslationY(Math.max(floor, B2));
        this.r.setTranslationX(e4(f24, Math.min(1.0f, G3) * this.m6));
        this.r.setTranslationY(f4(Math.max(dpf25, B4)));
        e5();
        q5();
        Object tag = this.r.getTag();
        if (tag instanceof Integer) {
            Integer num = (Integer) tag;
            w02 = org.telegram.ui.ActionBar.y6.w0(num.intValue(), this.z0);
            if (num.intValue() == org.telegram.ui.ActionBar.y6.Bh) {
                z10 = true;
                this.r.setTextColor(i0.a.f(lerp, D3(w02, Boolean.valueOf(z10)), -1275068417));
                if (this.Q1 > d4()) {
                    this.f.setPivotY(AndroidUtilities.lerp(0, r5.getMeasuredHeight(), lerp));
                    float f25 = (0.12f * G3) + 1.0f;
                    this.f.setScaleX(AndroidUtilities.lerp(f25, 1.38f, lerp));
                    this.f.setScaleY(AndroidUtilities.lerp(f25, 1.38f, lerp));
                }
                s4(0, Math.min(1.0f, G3), true);
                v01Var = this.p6;
                if (v01Var != null) {
                    v01Var.a(i0.a.f(this.k2, org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.b(0.18f, -0.1f, this.c1)), 603979775));
                }
                fl flVar = this.f;
                if (this.X5 == null) {
                    f10 = -1;
                    i10 = -1;
                } else {
                    i10 = -1;
                    f10 = i0.a.f(this.k2, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.vh, this.z0), -1);
                }
                flVar.setTextColor(f10);
                this.actionBar.y(this.X5 == null ? i10 : i0.a.f(lerp, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v8, this.z0), i10), false);
                this.actionBar.setMenuOffsetSuppressed(true);
                this.e0.setForegroundAlpha(lerp);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.X.getLayoutParams();
                layoutParams.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.a.getMeasuredWidth() / this.b2, lerp);
                layoutParams.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.Q1 + f15) / this.b2, lerp);
                W3();
                this.X.requestLayout();
                i1Var = this.v0;
                if (i1Var != null) {
                    i1Var.setExpandProgress(lerp);
                }
                h5();
                x01Var = this.d1;
                if (x01Var == null && x01Var.K) {
                    x01Var.invalidate();
                    return;
                }
            }
        } else {
            w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, this.z0);
        }
        z10 = false;
        this.r.setTextColor(i0.a.f(lerp, D3(w02, Boolean.valueOf(z10)), -1275068417));
        if (this.Q1 > d4()) {
        }
        s4(0, Math.min(1.0f, G3), true);
        v01Var = this.p6;
        if (v01Var != null) {
        }
        fl flVar2 = this.f;
        if (this.X5 == null) {
        }
        flVar2.setTextColor(f10);
        this.actionBar.y(this.X5 == null ? i10 : i0.a.f(lerp, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v8, this.z0), i10), false);
        this.actionBar.setMenuOffsetSuppressed(true);
        this.e0.setForegroundAlpha(lerp);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.X.getLayoutParams();
        layoutParams2.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.a.getMeasuredWidth() / this.b2, lerp);
        layoutParams2.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.Q1 + f15) / this.b2, lerp);
        W3();
        this.X.requestLayout();
        i1Var = this.v0;
        if (i1Var != null) {
        }
        h5();
        x01Var = this.d1;
        if (x01Var == null) {
        }
    }

    @Override // org.telegram.ui.Components.mu0
    public final void S() {
        int i10;
        vz0 vz0Var = this.N;
        if (vz0Var == null || this.simpleActionBar == null) {
            return;
        }
        int closestTab = vz0Var.getClosestTab();
        int[] iArr = this.Q.c;
        if (closestTab == 0) {
            if (iArr[7] <= 0 && iArr[6] <= 0) {
                int i11 = iArr[0];
                if (i11 <= 0) {
                    W4(LocaleController.getString(R.string.SharedMedia));
                    return;
                } else {
                    W4(LocaleController.formatPluralString("Media", i11, new Object[0]));
                    return;
                }
            }
            if (this.N.getPhotosVideosTypeFilter() == 1 || iArr[7] <= 0) {
                W4(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]));
                return;
            }
            if (this.N.getPhotosVideosTypeFilter() == 2 || (i10 = iArr[6]) <= 0) {
                W4(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
                return;
            }
            W4(LocaleController.formatPluralString("Photos", i10, new Object[0]) + ", " + LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
            return;
        }
        if (closestTab == 1) {
            int i12 = iArr[1];
            if (i12 <= 0) {
                W4(LocaleController.getString(R.string.Files));
                return;
            } else {
                W4(LocaleController.formatPluralString("Files", i12, new Object[0]));
                return;
            }
        }
        if (closestTab == 2) {
            int i13 = iArr[2];
            if (i13 <= 0) {
                W4(LocaleController.getString(R.string.Voice));
                return;
            } else {
                W4(LocaleController.formatPluralString("Voice", i13, new Object[0]));
                return;
            }
        }
        if (closestTab == 3) {
            int i14 = iArr[3];
            if (i14 <= 0) {
                W4(LocaleController.getString(R.string.SharedLinks));
                return;
            } else {
                W4(LocaleController.formatPluralString("Links", i14, new Object[0]));
                return;
            }
        }
        if (closestTab == 4) {
            int i15 = iArr[4];
            if (i15 <= 0) {
                W4(LocaleController.getString(R.string.Music));
                return;
            } else {
                W4(LocaleController.formatPluralString("MusicFiles", i15, new Object[0]));
                return;
            }
        }
        if (closestTab == 5) {
            int i16 = iArr[5];
            if (i16 <= 0) {
                W4(LocaleController.getString(R.string.AccDescrGIFs));
                return;
            } else {
                W4(LocaleController.formatPluralString("GIFs", i16, new Object[0]));
                return;
            }
        }
        if (closestTab == 6) {
            W4(LocaleController.formatPluralString("CommonGroups", this.v2.common_chats_count, new Object[0]));
            return;
        }
        if (closestTab == 7) {
            W4(this.r.getText());
            return;
        }
        if (closestTab == 8 || org.telegram.ui.Components.aw0.E0(closestTab)) {
            if (this.r2) {
                W4(this.N.c0(false));
                return;
            } else if (this.N.j0(closestTab) > 0) {
                W4(LocaleController.formatPluralString("ProfileStoriesCount", this.N.j0(closestTab), new Object[0]));
                return;
            } else {
                W4(LocaleController.getString(R.string.ProfileStoriesCountZero));
                return;
            }
        }
        if (closestTab == 13) {
            W4(this.N.c0(true));
            return;
        }
        if (closestTab == 9) {
            W4(LocaleController.formatPluralString("ProfileStoriesArchiveCount", this.N.j0(closestTab), new Object[0]));
            return;
        }
        if (closestTab == 10) {
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(a());
            W4(LocaleController.formatPluralString(this.r2 ? "Bots" : "Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]));
            return;
        }
        if (closestTab == 12) {
            W4(LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, getMessagesController().getSavedMessagesController().getMessagesCount(a())), new Object[0]));
            return;
        }
        if (closestTab == 14) {
            org.telegram.ui.Components.vs0 vs0Var = this.N.a0;
            W4(LocaleController.formatPluralStringComma("ProfileGiftsCount", vs0Var != null ? vs0Var.getGiftsCount() : 0));
        } else if (closestTab == 15) {
            int i17 = iArr[8];
            if (i17 <= 0) {
                W4(LocaleController.getString(R.string.SharedPollTab));
            } else {
                W4(LocaleController.formatPluralStringComma("ProfilePollsCount", i17));
            }
        }
    }

    public final boolean S3(final int i10, View view) {
        TLRPC.User currentUser;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.s1 && (currentUser = getUserConfig().getCurrentUser()) != null) {
            final TLRPC.UserFull userFull = this.v2;
            if (userFull == null) {
                userFull = getMessagesController().getUserFull(currentUser.id);
            }
            if (userFull != null) {
                String string = LocaleController.getString(R.string.Copy);
                if (i10 == this.K3 || i10 == this.J3 || i10 == this.W2) {
                    str = userFull.about;
                } else if (i10 == this.O3) {
                    str = jg.h1.g0(this.currentAccount, currentUser, userFull.business_work_hours);
                    string = LocaleController.getString(R.string.ProfileHoursCopy);
                } else if (i10 == this.P3) {
                    str = userFull.business_location.address;
                    string = LocaleController.getString(R.string.ProfileLocationCopy);
                } else if (i10 == this.L3) {
                    str = UserObject.getPublicUsername(currentUser);
                    if (str != null) {
                        str = "@".concat(str);
                    }
                    string = LocaleController.getString(R.string.ProfileCopyUsername);
                } else {
                    str = i10 == this.G3 ? currentUser.phone : i10 == this.U2 ? UserInfoActivity.a0(this.v2.birthday) : null;
                }
                org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(this, view);
                H.W(this.a.V0(view, false));
                H.w = false;
                H.i = 3;
                if (i10 == this.P3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, LocaleController.getString(R.string.ProfileLocationView), new fb0(this, 5), false);
                    }
                    H.c(R.drawable.msg_map, LocaleController.getString(R.string.ProfileLocationMaps), new fb0(this, 7), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, string, new lj0(str, 28), false);
                }
                if (i10 == this.O3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileHoursEdit), new fb0(this, 8), false);
                    final int i11 = 0;
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileHoursRemove), new Runnable(this) { // from class: org.telegram.ui.zx0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i12 = i11;
                            final int i13 = i10;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i12) {
                                case 0:
                                    int i14 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String string2 = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                    e2Var.R = string2;
                                    e2Var.T = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    final int i15 = 1;
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.cy0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i16) {
                                            int i17 = i15;
                                            int i18 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i17) {
                                                case 0:
                                                    int i19 = ProfileActivity.R6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new ey0(profileActivity2, 0));
                                                    profileActivity2.v5();
                                                    profileActivity2.d.u(i18);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                                default:
                                                    int i20 = ProfileActivity.R6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new ey0(profileActivity2, 2));
                                                    profileActivity2.v5();
                                                    profileActivity2.d.u(i18);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(e2Var);
                                    break;
                                default:
                                    int i16 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String string3 = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
                                    e2Var2.R = string3;
                                    e2Var2.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    final int i17 = 0;
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.cy0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i162) {
                                            int i172 = i17;
                                            int i18 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i172) {
                                                case 0:
                                                    int i19 = ProfileActivity.R6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new ey0(profileActivity2, 0));
                                                    profileActivity2.v5();
                                                    profileActivity2.d.u(i18);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                                default:
                                                    int i20 = ProfileActivity.R6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new ey0(profileActivity2, 2));
                                                    profileActivity2.v5();
                                                    profileActivity2.d.u(i18);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(e2Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i10 == this.P3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileLocationEdit), new fb0(this, 9), false);
                    final int i12 = 1;
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileLocationRemove), new Runnable(this) { // from class: org.telegram.ui.zx0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i122 = i12;
                            final int i13 = i10;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i122) {
                                case 0:
                                    int i14 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String string2 = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                    e2Var.R = string2;
                                    e2Var.T = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    final int i15 = 1;
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.cy0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i162) {
                                            int i172 = i15;
                                            int i18 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i172) {
                                                case 0:
                                                    int i19 = ProfileActivity.R6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new ey0(profileActivity2, 0));
                                                    profileActivity2.v5();
                                                    profileActivity2.d.u(i18);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                                default:
                                                    int i20 = ProfileActivity.R6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new ey0(profileActivity2, 2));
                                                    profileActivity2.v5();
                                                    profileActivity2.d.u(i18);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(e2Var);
                                    break;
                                default:
                                    int i16 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String string3 = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
                                    e2Var2.R = string3;
                                    e2Var2.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    final int i17 = 0;
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.cy0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i162) {
                                            int i172 = i17;
                                            int i18 = i13;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i172) {
                                                case 0:
                                                    int i19 = ProfileActivity.R6;
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    userFull3.business_location = null;
                                                    userFull3.flags2 &= -3;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinesslocation, new ey0(profileActivity2, 0));
                                                    profileActivity2.v5();
                                                    profileActivity2.d.u(i18);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                                default:
                                                    int i20 = ProfileActivity.R6;
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new ey0(profileActivity2, 2));
                                                    profileActivity2.v5();
                                                    profileActivity2.d.u(i18);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(e2Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i10 == this.L3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new fb0(this, 10), false);
                } else if (i10 == this.K3 || i10 == this.J3 || i10 == this.W2) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileEditBio), new fb0(this, 11), false);
                } else if (i10 == this.G3) {
                    H.c(R.drawable.menu_storage_path, LocaleController.getString(R.string.ProfilePhoneEdit), new fb0(this, 12), false);
                } else if (i10 == this.U2) {
                    final int i13 = 0;
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileBirthdayChange), new Runnable(this) { // from class: org.telegram.ui.yx0
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
                                    int i15 = ProfileActivity.R6;
                                    profileActivity.showDialog(org.telegram.ui.Components.g5.l(profileActivity.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), userFull2.birthday, new org.telegram.ui.Components.oy(20, profileActivity, userFull2), new fb0(profileActivity, 14), false, false, profileActivity.z0).a);
                                    break;
                                case 1:
                                    int i16 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String string2 = LocaleController.getString(R.string.BirthdayClearTitle);
                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                    e2Var.R = string2;
                                    e2Var.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                    final int i17 = 0;
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.dy0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i18) {
                                            int i19 = i17;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i19) {
                                                case 0:
                                                    int i20 = ProfileActivity.R6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().invalidateContentSettings();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new ey0(profileActivity2, 3));
                                                    profileActivity2.p5(false, false);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                                default:
                                                    int i21 = ProfileActivity.R6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new ey0(profileActivity2, 1));
                                                    profileActivity2.p5(false, false);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(e2Var);
                                    break;
                                default:
                                    int i18 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String string3 = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
                                    e2Var2.R = string3;
                                    e2Var2.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                    final int i19 = 1;
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.dy0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i182) {
                                            int i192 = i19;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i192) {
                                                case 0:
                                                    int i20 = ProfileActivity.R6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().invalidateContentSettings();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new ey0(profileActivity2, 3));
                                                    profileActivity2.p5(false, false);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                                default:
                                                    int i21 = ProfileActivity.R6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new ey0(profileActivity2, 1));
                                                    profileActivity2.p5(false, false);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(e2Var2);
                                    break;
                            }
                        }
                    }, false);
                    final int i14 = 1;
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) { // from class: org.telegram.ui.yx0
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
                                    int i15 = ProfileActivity.R6;
                                    profileActivity.showDialog(org.telegram.ui.Components.g5.l(profileActivity.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), userFull2.birthday, new org.telegram.ui.Components.oy(20, profileActivity, userFull2), new fb0(profileActivity, 14), false, false, profileActivity.z0).a);
                                    break;
                                case 1:
                                    int i16 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String string2 = LocaleController.getString(R.string.BirthdayClearTitle);
                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                    e2Var.R = string2;
                                    e2Var.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                    final int i17 = 0;
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.dy0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i182) {
                                            int i192 = i17;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i192) {
                                                case 0:
                                                    int i20 = ProfileActivity.R6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().invalidateContentSettings();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new ey0(profileActivity2, 3));
                                                    profileActivity2.p5(false, false);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                                default:
                                                    int i21 = ProfileActivity.R6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new ey0(profileActivity2, 1));
                                                    profileActivity2.p5(false, false);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(e2Var);
                                    break;
                                default:
                                    int i18 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String string3 = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
                                    e2Var2.R = string3;
                                    e2Var2.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                    final int i19 = 1;
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.dy0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i182) {
                                            int i192 = i19;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i192) {
                                                case 0:
                                                    int i20 = ProfileActivity.R6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().invalidateContentSettings();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new ey0(profileActivity2, 3));
                                                    profileActivity2.p5(false, false);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                                default:
                                                    int i21 = ProfileActivity.R6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new ey0(profileActivity2, 1));
                                                    profileActivity2.p5(false, false);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(e2Var2);
                                    break;
                            }
                        }
                    }, true);
                } else if (i10 == this.Q2) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(userFull.personal_channel_id));
                    if (chat != null && ChatObject.getPublicUsername(chat) != null) {
                        H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileChannelCopy), new yl0(29, this, chat), false);
                    }
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileChannelChange), new fb0(this, 6), false);
                    final int i15 = 2;
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) { // from class: org.telegram.ui.yx0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i142 = i15;
                            final TLRPC.UserFull userFull2 = userFull;
                            final ProfileActivity profileActivity = this.b;
                            switch (i142) {
                                case 0:
                                    int i152 = ProfileActivity.R6;
                                    profileActivity.showDialog(org.telegram.ui.Components.g5.l(profileActivity.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), userFull2.birthday, new org.telegram.ui.Components.oy(20, profileActivity, userFull2), new fb0(profileActivity, 14), false, false, profileActivity.z0).a);
                                    break;
                                case 1:
                                    int i16 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String string2 = LocaleController.getString(R.string.BirthdayClearTitle);
                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                    e2Var.R = string2;
                                    e2Var.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                    final int i17 = 0;
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.dy0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i182) {
                                            int i192 = i17;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i192) {
                                                case 0:
                                                    int i20 = ProfileActivity.R6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().invalidateContentSettings();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new ey0(profileActivity2, 3));
                                                    profileActivity2.p5(false, false);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                                default:
                                                    int i21 = ProfileActivity.R6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new ey0(profileActivity2, 1));
                                                    profileActivity2.p5(false, false);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(e2Var);
                                    break;
                                default:
                                    int i18 = ProfileActivity.R6;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    String string3 = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
                                    e2Var2.R = string3;
                                    e2Var2.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                    final int i19 = 1;
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.dy0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i182) {
                                            int i192 = i19;
                                            TLRPC.UserFull userFull3 = userFull2;
                                            ProfileActivity profileActivity2 = profileActivity;
                                            switch (i192) {
                                                case 0:
                                                    int i20 = ProfileActivity.R6;
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    userFull3.birthday = null;
                                                    userFull3.flags2 &= -33;
                                                    profileActivity2.getMessagesController().invalidateContentSettings();
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebirthday, new ey0(profileActivity2, 3));
                                                    profileActivity2.p5(false, false);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                                default:
                                                    int i21 = ProfileActivity.R6;
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    userFull3.personal_channel_id = 0L;
                                                    userFull3.personal_channel_message = 0;
                                                    userFull3.flags2 &= -65;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatepersonalchannel, new ey0(profileActivity2, 1));
                                                    profileActivity2.p5(false, false);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(e2Var2);
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

    public final boolean T3() {
        View view;
        if ((this.I0 || (!AndroidUtilities.isTablet() && !this.n2)) && this.e0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            this.F0 = true;
            this.o2 = true;
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
                py0 py0Var = this.a;
                View F = py0Var.F(view);
                s4.e1 T = F != null ? py0Var.T(F) : null;
                if (T != null) {
                    Integer num = (Integer) this.Y1.get(Integer.valueOf(T.b()));
                    if (num != null) {
                        this.P1 = true;
                        this.a.w0(0, -(((this.a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.ds.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void T4(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.u2 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.m1 == 0) {
                this.m1 = -j10;
                getMediaDataController().getMediaCounts(this.m1, this.g1, this.classGuid);
            }
        }
        vz0 vz0Var = this.N;
        if (vz0Var != null) {
            vz0Var.setChatInfo(this.u2);
        }
        zy0 zy0Var = this.n0;
        if (zy0Var != null && !this.q1) {
            zy0Var.setChatInfo(this.u2);
        }
        bz0 bz0Var = this.u0;
        if (bz0Var != null && (chatFull3 = this.u2) != null) {
            bz0Var.setStories(chatFull3.stories);
        }
        bi.i1 i1Var = this.v0;
        if (i1Var != null) {
            i1Var.a();
        }
        yy0 yy0Var = this.e0;
        if (yy0Var != null) {
            yy0Var.setHasStories(q4());
        }
        U3();
        if (this.f1 != 0) {
            boolean z10 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.u2) == null || !chatFull2.stargifts_available) ? false : true;
            this.T0.Q(38, z10);
            org.telegram.ui.Components.bi0 bi0Var = this.Z;
            if (bi0Var != null) {
                bi0Var.o(3, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.mu0
    public final boolean U() {
        return this.A1;
    }

    public final void U3() {
        TLRPC.Chat chat = this.E2;
        if (chat == null || !chat.megagroup) {
            return;
        }
        TLRPC.ChatFull chatFull = this.u2;
        if (!(chatFull instanceof TLRPC.TL_channelFull) || chatFull.participants == null) {
            return;
        }
        for (int i10 = 0; i10 < this.u2.participants.participants.size(); i10++) {
            TLRPC.ChatParticipant chatParticipant = this.u2.participants.participants.get(i10);
            this.C1.k(chatParticipant, chatParticipant.user_id);
        }
    }

    public final void U4(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Y == null || (tL_emojiStatusCollectible2 = this.u6) == tL_emojiStatusCollectible) {
            return;
        }
        if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
            this.u6 = tL_emojiStatusCollectible;
            fi.v3 v3Var = this.r6;
            int i10 = 1;
            if (v3Var != null) {
                v3Var.e(true);
            }
            if (tL_emojiStatusCollectible == null || TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                return;
            }
            this.t6 = null;
            this.r6 = new fi.v3(getParentActivity(), 3);
            this.s6 = org.telegram.ui.ActionBar.y6.v(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.y6.o1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
            this.r6.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            fi.v3 v3Var2 = this.r6;
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
            v3Var2.A0 = true;
            v3Var2.I0 = System.currentTimeMillis();
            v3Var2.B0 = new Path();
            v3Var2.C0 = AndroidUtilities.dpf2(0.66f) / 2.0f;
            v3Var2.D0 = new Paint(1);
            v3Var2.E0 = new Paint(1);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, o12), org.telegram.ui.ActionBar.y6.o1(1.0f, o12), org.telegram.ui.ActionBar.y6.o1(0.0f, o12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            v3Var2.H0 = linearGradient;
            v3Var2.E0.setShader(linearGradient);
            v3Var2.F0 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, o12), org.telegram.ui.ActionBar.y6.o1(0.5f, o12), org.telegram.ui.ActionBar.y6.o1(0.0f, o12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            v3Var2.G0 = new Matrix();
            v3Var2.D0.setShader(v3Var2.F0);
            v3Var2.E0.setStyle(Paint.Style.STROKE);
            v3Var2.E0.setStrokeJoin(Paint.Join.ROUND);
            v3Var2.E0.setStrokeCap(Paint.Cap.ROUND);
            v3Var2.E0.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
            this.Y.addView(this.r6, org.telegram.ui.Components.gb1.g(24.0f, -1));
            this.r6.t(9.33f);
            fi.v3 v3Var3 = this.r6;
            Typeface bold = AndroidUtilities.bold();
            v3Var3.H.x(bold);
            v3Var3.J.setTypeface(bold);
            this.r6.s(tL_emojiStatusCollectible.title);
            fi.v3 v3Var4 = this.r6;
            v3Var4.d = -1L;
            v3Var4.k(5.66f, 2.66f, 5.66f, 2.66f);
            fi.v3 v3Var5 = this.r6;
            v3Var5.getClass();
            v3Var5.y = AndroidUtilities.dpf2(4.0f);
            v3Var5.E = AndroidUtilities.dpf2(2.66f);
            this.r6.r();
            this.r6.q(16.0f);
            this.r6.u();
            this.r6.setOnClickListener(new hy0(this, tL_emojiStatusCollectible.slug, i10));
            if (this.Q1 < AndroidUtilities.dp(82.0f)) {
                this.t6 = Boolean.FALSE;
                this.r6.setAlpha(0.0f);
            }
            h5();
            fi.v3 v3Var6 = this.r6;
            Objects.requireNonNull(v3Var6);
            AndroidUtilities.runOnUIThread(new lj0(v3Var6, 29), 6000L);
        }
    }

    public final boolean V3() {
        org.telegram.ui.ActionBar.j5 j5Var;
        if (this.J1 == 0 || (j5Var = this.parentLayout) == null || j5Var.getFragmentStack() == null || this.parentLayout.getFragmentStack().size() < 2 || !(this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof un)) {
            return false;
        }
        finishFragment();
        return true;
    }

    public final void V4(c01 c01Var) {
        if (this.o5 == c01Var) {
            return;
        }
        this.o5 = c01Var;
        AndroidUtilities.forEachViews((RecyclerView) this.a, (Utilities.Callback<View>) new ay0(this, 1));
    }

    public final void W3() {
        if (this.a == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.X.getLayoutParams();
        float A = d3.A(layoutParams.width, this.b2, 0.5f, this.a.getMeasuredWidth() / 2.0f);
        this.Z1 = A;
        if (this.G1) {
            this.Z1 = AndroidUtilities.lerp(this.V5, A, this.S1);
        }
        this.X.setTranslationX(this.Z1);
    }

    public final void W4(CharSequence charSequence) {
        this.simpleActionBar.setSubtitleAnimated(charSequence);
    }

    public final int X3() {
        if (this.e1 == 0 || this.q0 == null || this.s1) {
            return AndroidUtilities.dp(74 + ((this.N4 || this.O4) ? 25 : 0));
        }
        return 0;
    }

    public final void X4(int i10) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (AndroidUtilities.isTablet()) {
            return;
        }
        this.K1 = i10 != 0;
        this.L1 = i10 != 0;
        w5();
        if (globalMainSettings.getBoolean("view_animations", true)) {
            this.J1 = i10;
        } else if (i10 == 2) {
            this.n1 = true;
        }
    }

    public final int Y3(ImageReceiver imageReceiver) {
        return imageReceiver.getDrawable() instanceof org.telegram.ui.Components.d81 ? ((org.telegram.ui.Components.d81) imageReceiver.getDrawable()).a.a() : AndroidUtilities.calcBitmapColor(this.e0.getImageReceiver().getBitmap());
    }

    public final void Y4(TLRPC.UserFull userFull, org.telegram.ui.Cells.k6 k6Var, y01 y01Var) {
        this.v2 = userFull;
        org.telegram.ui.Components.ox0 ox0Var = this.S;
        if (ox0Var != null) {
            ox0Var.set(userFull.stars_rating);
        }
        bz0 bz0Var = this.u0;
        if (bz0Var != null) {
            bz0Var.setStories(this.v2.stories);
        }
        bi.i1 i1Var = this.v0;
        if (i1Var != null) {
            i1Var.a();
        }
        yy0 yy0Var = this.e0;
        if (yy0Var != null) {
            yy0Var.setHasStories(q4());
        }
        vz0 vz0Var = this.N;
        if (vz0Var != null) {
            vz0Var.setUserInfo(this.v2);
        }
        if (this.w2 == null) {
            this.w2 = k6Var;
        }
        if (this.w2 == null) {
            this.w2 = new org.telegram.ui.Cells.k6(this.currentAccount);
        }
        org.telegram.ui.Cells.k6 k6Var2 = this.w2;
        fb0 fb0Var = new fb0(this, 21);
        if (k6Var2.c) {
            fb0Var.run();
        } else {
            k6Var2.h.add(fb0Var);
        }
        this.w2.d(this.v2);
        if (this.y2 == null) {
            this.y2 = y01Var;
        }
        y01 y01Var2 = this.y2;
        if (y01Var2 == null) {
            y01 c10 = y01.c(this.currentAccount, this.v2, y01Var2);
            this.y2 = c10;
            this.x2 = c10 != null;
        }
        y01 y01Var3 = this.y2;
        if (y01Var3 != null) {
            fb0 fb0Var2 = new fb0(this, 17);
            if (y01Var3.b) {
                fb0Var2.run();
            } else {
                y01Var3.h.add(fb0Var2);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.T0;
        if (w0Var != null) {
            w0Var.Q(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.e1)));
            if (k4()) {
                this.T0.S(44);
            } else {
                this.T0.t(44);
            }
        }
    }

    public final org.telegram.ui.Components.r5 Z3(long j10) {
        if (this.G == null) {
            org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(AndroidUtilities.dp(17.0f), 2, this.f, false);
            this.G = r5Var;
            int dp = AndroidUtilities.dp(1.0f);
            r5Var.I = 0;
            r5Var.J = dp;
            if (this.G0) {
                this.G.a();
            }
        }
        if (j10 != 0) {
            this.G.j(j10, false);
        } else {
            this.G.g(null, false);
        }
        j5();
        return this.G;
    }

    public final void Z4() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        tz0 tz0Var = this.s5;
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.u6 u6Var = this.z0;
        baseSimpleGlass.g = tz0Var;
        baseSimpleGlass.h = null;
        baseSimpleGlass.f(tz0Var, r5Var, u6Var);
        this.simpleActionBar.setBackground(null);
        baseSimpleGlass.i = this.H6;
        View view = new View(getParentActivity());
        this.N5 = view;
        view.setAlpha(this.K5);
        this.N.y(this.N5);
        View view2 = this.N5;
        view2.setBackground(baseSimpleGlass.a(view2));
        this.glassEngine.b(this.a);
        this.N.setPagesGlassEngine(this.glassEngine);
        C3();
    }

    public final long a() {
        long j10 = this.i1;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.e1;
        return j11 != 0 ? j11 : -this.f1;
    }

    public final void a4(boolean z10) {
        a0.h hVar;
        if (this.B1 || (hVar = this.C1) == null || this.u2 == null) {
            return;
        }
        this.B1 = true;
        int i10 = (hVar.m() == 0 || !z10) ? 0 : 300;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.f1);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = z10 ? 0 : this.C1.m();
        tL_channels_getParticipants.limit = 200;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new ig.u(this, tL_channels_getParticipants, i10)), this.classGuid);
    }

    public final void a5(boolean z10, boolean z11) {
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
        this.f0.addListener(new nz0(this, z10, i10));
        this.f0.start();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.h8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Bh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f8));
    }

    public final org.telegram.ui.Components.r5 b4(TLRPC.EmojiStatus emojiStatus, boolean z10) {
        if (this.F == null) {
            org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), 2, this.f, false);
            this.F = r5Var;
            if (this.G0) {
                r5Var.a();
            }
        }
        this.E = null;
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((tL_emojiStatus.flags & 1) == 0 || tL_emojiStatus.until > ((int) (System.currentTimeMillis() / 1000))) {
                this.F.j(tL_emojiStatus.document_id, z10);
                this.F.m(false, z10);
            } else {
                this.F.g(g4(), z10);
                this.F.m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
                this.E = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                this.F.j(tL_emojiStatusCollectible.document_id, z10);
                this.F.m(true, z10);
            } else {
                this.F.g(g4(), z10);
                this.F.m(false, z10);
            }
        } else {
            this.F.g(g4(), z10);
            this.F.m(false, z10);
        }
        j5();
        return this.F;
    }

    public final void b5() {
        Long l4;
        if (this.H5 != null) {
            return;
        }
        t51[] t51VarArr = new t51[1];
        Rect rect = AndroidUtilities.rectTmp2;
        fl flVar = this.f;
        if (flVar != null) {
            if (flVar.getRightDrawable() == null) {
                rect.set(this.f.getWidth() - 1, (this.f.getHeight() / 2) - 1, this.f.getWidth() + 1, (this.f.getHeight() / 2) + 1);
            } else {
                rect.set(this.f.getRightDrawable().getBounds());
                rect.offset((int) ((this.f.getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) this.f.getX(), (int) this.f.getY());
            }
        }
        int i10 = this.f.getScaleX() < 1.5f ? 16 : 32;
        int dp = (-(this.Y.getHeight() - rect.centerY())) - AndroidUtilities.dp(i10);
        int min = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = a8.ee.b(centerX - (min / 2), 0, AndroidUtilities.displaySize.x - min);
        ez0 ez0Var = new ez0(this, this, getParentActivity(), Integer.valueOf(Math.max(0, centerX - b10)), this.E2 == null ? 0 : 9, this.z0, i10, t51VarArr);
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e1));
        if (user != null) {
            ez0Var.setExpireDateHint(DialogObject.getEmojiStatusUntil(user.emoji_status));
        }
        Long l10 = this.E;
        if (l10 != null) {
            ez0Var.setSelected(l10);
        } else {
            org.telegram.ui.Components.r5 r5Var = this.F;
            if (r5Var != null) {
                Drawable drawable = r5Var.f[0];
                if (drawable instanceof org.telegram.ui.Components.t5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.t5) drawable).i());
                    ez0Var.setSelected(l4);
                }
            }
            l4 = null;
            ez0Var.setSelected(l4);
        }
        ez0Var.setSaveState(3);
        ez0Var.y(this.F, this.f);
        fz0 fz0Var = new fz0(this, ez0Var);
        this.H5 = fz0Var;
        t51VarArr[0] = fz0Var;
        int[] iArr = new int[2];
        fl flVar2 = this.f;
        if (flVar2 != null) {
            flVar2.getLocationOnScreen(iArr);
        }
        t51VarArr[0].showAsDropDown(this.fragmentView, b10, dp, 51);
        t51VarArr[0].b();
    }

    public final int c4() {
        return X3() + d4();
    }

    public final void c5() {
        int i10 = 0;
        this.N.K0.setReordering(false);
        vz0 vz0Var = this.N;
        org.telegram.ui.Components.ut0 ut0Var = vz0Var.K0;
        if (vz0Var.x1 != null && ut0Var != null) {
            boolean z02 = vz0Var.z0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = ut0Var.getTabIds();
            int size = tabIds.size();
            while (i10 < size) {
                Integer num = tabIds.get(i10);
                i10++;
                TLRPC.ProfileTab l02 = org.telegram.ui.Components.aw0.l0(num.intValue(), z02);
                if (l02 != null) {
                    arrayList.add(l02);
                }
            }
        }
        this.N.J1(true);
        this.E5.animate().translationY(AndroidUtilities.dp(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.ds.h).withEndAction(new fb0(this, 25)).start();
        org.telegram.ui.Components.wc.b0(this).R(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean canBeginSlide() {
        if (this.N.F0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void clearViews() {
        this.X5 = null;
        super.clearViews();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r1 == null) goto L17;
     */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        LaunchActivity launchActivity;
        sn snVar;
        org.telegram.ui.ActionBar.h4 h4Var;
        org.telegram.ui.ActionBar.r2 lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof un) && (snVar = ((un) lastFragment).qa) != null && (h4Var = snVar.f) != null) {
            if (h4Var != null) {
                TLRPC.ChatTheme chatTheme = h4Var.d;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = starGift instanceof TL_stars.TL_starGiftUnique ? (TL_stars.TL_starGiftUnique) starGift : null;
                }
            }
            this.z0 = lastFragment.getResourceProvider();
        }
        org.telegram.ui.Components.b8 b8Var = new org.telegram.ui.Components.b8(this, context, this.z0, 5);
        boolean z10 = true;
        b8Var.setForceSkipTouches(true);
        b8Var.setBackgroundColor(0);
        b8Var.x(this.X5 != null ? 553648127 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f8, this.z0), false);
        int i10 = org.telegram.ui.ActionBar.y6.v8;
        b8Var.y(org.telegram.ui.ActionBar.y6.w0(i10, this.z0), false);
        b8Var.y(org.telegram.ui.ActionBar.y6.w0(i10, this.z0), true);
        b8Var.setCastShadows(false);
        b8Var.setAddToContainer(false);
        b8Var.setClipContent(true);
        if (!this.I0 && (((j5Var = this.parentLayout) == null || !((ActionBarLayout) j5Var).b) && ((AndroidUtilities.isTablet() || this.inBubbleMode) && (!AndroidUtilities.isTablet() || this.inBubbleMode || (j5Var2 = this.parentLayout) == null || (launchActivity = LaunchActivity.I1) == null || j5Var2 != launchActivity.s0)))) {
            z10 = false;
        }
        b8Var.setOccupyStatusBar(z10);
        if (!this.I0) {
            b8Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
            b8Var.getBackButton().setTranslationX(AndroidUtilities.dp(2.0f));
            ImageView backButton = b8Var.getBackButton();
            backButton.setOnLongClickListener(new di.l2(5, this, backButton));
            return b8Var;
        }
        b8Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        b8Var.getBackButton().setTranslationX(AndroidUtilities.dp(2.0f));
        b8Var.e.setContentDescription(LocaleController.getString(R.string.QrCode));
        b8Var.e.setImageResource(R.drawable.outline_header_qr_24);
        b8Var.e.setColorFilter(org.telegram.ui.ActionBar.y6.w0(i10, this.z0), PorterDuff.Mode.SRC_IN);
        b8Var.e.setOnClickListener(new vx0(this, 7));
        return b8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v270, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        ch.b bVar;
        int i10;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        ?? r12;
        TLRPC.Document document;
        int i11;
        Object obj;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.Components.ds dsVar;
        int i12;
        TLRPC.UserFull userFull2;
        TLRPC.ChatParticipants chatParticipants;
        un unVar;
        sn snVar;
        org.telegram.ui.ActionBar.y6.Y(context);
        ?? r02 = 0;
        org.telegram.ui.ActionBar.y6.J(context, false);
        org.telegram.ui.ActionBar.r2 lastFragment = this.parentLayout.getLastFragment();
        StateListAnimator stateListAnimator = null;
        if ((lastFragment instanceof un) && (snVar = (unVar = (un) lastFragment).qa) != null && snVar.k() != null) {
            org.telegram.ui.ActionBar.h4 h4Var = unVar.qa.f;
            if (h4Var != null) {
                TLRPC.ChatTheme chatTheme = h4Var.d;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = starGift instanceof TL_stars.TL_starGiftUnique ? (TL_stars.TL_starGiftUnique) starGift : null;
                }
            }
            this.z0 = lastFragment.getResourceProvider();
        }
        this.T1 = 0;
        this.U1 = 1.0f;
        this.W1 = false;
        int i13 = 1;
        this.hasOwnBackground = true;
        this.Q1 = c4();
        this.actionBar.setActionBarMenuOnItemClick(new rz0(this, context));
        vz0 vz0Var = this.N;
        if (vz0Var != null) {
            vz0Var.M0();
        }
        long j10 = this.i1;
        if (j10 == 0) {
            j10 = this.e1;
            if (j10 == 0) {
                j10 = -this.f1;
            }
        }
        this.fragmentView = new tz0(this, context);
        jh.k kVar = new jh.k(this.fragmentView);
        this.G6 = kVar;
        this.D6.g(kVar, (ViewGroup) this.fragmentView);
        jh.k kVar2 = this.G6;
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        ch.b bVar2 = this.F6;
        bVar2.g(kVar2, viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        if (this.s1) {
            this.y5 = new FrameLayout(context);
            this.z5 = new FrameLayout[2];
            this.C5 = new fi.d[2];
            int i14 = 0;
            for (int i15 = 2; i14 < i15; i15 = 2) {
                hh.c cVar = new hh.c();
                int i16 = org.telegram.ui.ActionBar.y6.d6;
                cVar.a(getThemedColor(i16));
                this.L6[i14] = cVar;
                ch.b bVar3 = new ch.b(cVar);
                di.i4 i4Var = new di.i4(context);
                eh.d b10 = bVar3.b(i4Var, new fh.b(i16, this.z0));
                b10.w(AndroidUtilities.dp(8.0f));
                b10.x(AndroidUtilities.dp(22.0f));
                i4Var.setBackground(b10);
                this.z5[i14] = new FrameLayout(context);
                this.C5[i14] = new fi.d(context, this.z0);
                this.C5[i14].setRoundRadius(AndroidUtilities.dp(19.0f));
                this.C5[i14].setUseWrapContent(true);
                this.C5[i14].setPadding(AndroidUtilities.dp(16.0f), r02, AndroidUtilities.dp(16.0f), r02);
                if (i14 == 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                    this.A5 = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(R.drawable.filled_premium_camera), r02, 1, 33);
                    this.A5.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
                    this.B5 = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.zq(R.drawable.filled_add_album), r02, 1, 33);
                    this.B5.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAlbumBottomButtonAddStories));
                    this.C5[i14].h(this.A5, r02);
                } else {
                    this.C5[i14].h(LocaleController.getString(R.string.StorySave), r02);
                }
                i4Var.setOnClickListener(new zv0(this, i14, i13));
                org.telegram.ui.Components.gb1.c(i4Var, 0.02f, 1.2f);
                this.C5[i14].setStateListAnimator(stateListAnimator);
                i4Var.addView(this.C5[i14], org.telegram.ui.Components.gb1.i(-2, -1, 17));
                this.z5[i14].addView(i4Var, org.telegram.ui.Components.gb1.i(-2, 60, 1));
                this.y5.addView(this.z5[i14], org.telegram.ui.Components.gb1.i(-1, -1, 87));
                if (i14 == 1 || !getMessagesController().storiesEnabled()) {
                    S4(this.z5[i14], 1.0f);
                }
                i14++;
                r02 = 0;
                stateListAnimator = null;
            }
        }
        TLRPC.ChatFull chatFull2 = this.u2;
        ArrayList arrayList = (chatFull2 == null || (chatParticipants = chatFull2.participants) == null || chatParticipants.participants.size() <= 5) ? null : this.C2;
        if (this.x1) {
            bVar = bVar2;
            z10 = true;
            i10 = 6;
        } else if (!this.t1 || (((userFull = this.v2) == null || userFull.stargifts_count <= 0) && ((chatFull = this.u2) == null || chatFull.stargifts_count <= 0))) {
            z10 = true;
            if (this.r1) {
                bVar = bVar2;
                i10 = 10;
            } else {
                bVar = bVar2;
                i10 = arrayList != null ? 7 : -1;
            }
        } else {
            z10 = true;
            this.w1 = true;
            bVar = bVar2;
            i10 = 14;
        }
        O3(context);
        ch.b bVar4 = bVar;
        org.telegram.ui.Components.sv0 sv0Var = this.Q;
        TLRPC.UserFull userFull3 = this.v2;
        long j11 = j10;
        vz0 vz0Var2 = new vz0(this, context, j11, sv0Var, userFull3 != null ? userFull3.common_chats_count : 0, this.C2, this.u2, userFull3, i10, this.y1, this, this, this.z0, this.D6);
        this.N = vz0Var2;
        vz0Var2.setLayoutParams(new s4.q0(-1, -1));
        int i17 = 4;
        if (this.e1 == 0 || this.q0 == null || this.s1) {
            this.b0 = new org.telegram.ui.Components.ui0(context);
            org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(context);
            this.c0 = ci0Var;
            this.b0.setTrailingView(ci0Var);
            this.c0.setOnClickListener(new vx0(this, 5));
            org.telegram.ui.Components.ei0 ei0Var = this.m0;
            if (ei0Var != null) {
                ei0Var.setMusicView(this.b0);
            }
            this.b0.setColor(this.X5);
            TLRPC.UserFull userFull4 = this.v2;
            if (userFull4 != null && (document = userFull4.saved_music) != null) {
                this.b0.setMusicDocument(document);
            }
            this.b0.setOnClickListener(new vx0(this, 6));
            this.Z = new org.telegram.ui.Components.bi0(context, AndroidUtilities.dp(74.0f));
            Q4();
            r12 = 0;
            r5(false);
            this.Z.setOnActionClickListener(new wx0(this, i17));
        } else {
            r12 = 0;
        }
        org.telegram.ui.ActionBar.z l4 = this.actionBar.l();
        l4.setTranslationX(-AndroidUtilities.dp(5.0f));
        if (this.e1 == getUserConfig().clientUserId && !this.s1) {
            if (ContactsController.getInstance(this.currentAccount).getPrivacyRules(7) == null) {
                ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
            }
        }
        if (this.q0 != null && !this.s1) {
            org.telegram.ui.ActionBar.w0 J = l4.a(32, R.drawable.outline_header_search).M().J(new jg.e2(this, 17));
            this.U0 = J;
            J.setContentDescription(LocaleController.getString(R.string.SearchInSettings));
            this.U0.setSearchFieldHint(LocaleController.getString(R.string.SearchInSettings));
            this.N.getSearchItem().setVisibility(8);
            if (this.N.getSearchOptionsItem() != null) {
                this.N.getSearchOptionsItem().setVisibility(8);
            }
            if (this.N.getSaveItem() != null) {
                this.N.getSaveItem().setVisibility(8);
            }
            if (this.n1) {
                this.U0.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.w0 a2 = l4.a(16, R.drawable.profile_video);
        this.R0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.VideoCall));
        if (this.f1 != 0) {
            this.Q0 = l4.a(15, R.drawable.msg_voicechat2);
            if (ChatObject.isChannelOrGiga(this.E2)) {
                this.Q0.setContentDescription(LocaleController.getString(R.string.VoipChannelVoiceChat));
            } else {
                this.Q0.setContentDescription(LocaleController.getString(R.string.VoipGroupVoiceChat));
            }
        } else {
            org.telegram.ui.ActionBar.w0 a10 = l4.a(15, R.drawable.call);
            this.Q0 = a10;
            a10.setContentDescription(LocaleController.getString(R.string.Call));
        }
        if (this.s1) {
            org.telegram.ui.ActionBar.w0 a11 = l4.a(41, R.drawable.group_edit_profile);
            this.S0 = a11;
            a11.setContentDescription(LocaleController.getString(R.string.Edit));
        } else {
            org.telegram.ui.ActionBar.w0 a12 = l4.a(12, R.drawable.group_edit_profile);
            this.S0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.Edit));
        }
        org.telegram.ui.ActionBar.w0 c10 = l4.c(10, R.drawable.ic_ab_other, this.z0);
        this.T0 = c10;
        c10.setSubMenuDelegate(new oy0(this));
        ImageView imageView = new ImageView(context);
        this.Y0 = imageView;
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.v8, this.z0, PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.updateViewVisibilityAnimated(this.Y0, r12, 0.8f, r12);
        this.Y0.setImageResource(R.drawable.msg_mini_autodelete_timer);
        this.T0.addView(this.Y0, org.telegram.ui.Components.gb1.h(12, 12.0f, 19, 8.0f, 2.0f, 0.0f, 0.0f));
        this.T0.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.T0.L(bVar4, gh.c.g(this.resourceProvider));
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
        L3(r12);
        this.d = new j01(this, context);
        this.e = new u01(context, this);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9();
        this.p0 = j9Var;
        j9Var.p = 2.3809524f;
        j9Var.t();
        this.fragmentView.setWillNotDraw(r12);
        tz0 tz0Var = (tz0) this.fragmentView;
        this.s5 = tz0Var;
        tz0Var.setClipChildren(r12);
        py0 py0Var = new py0(this, context, this.z0);
        this.a = py0Var;
        py0Var.u1();
        this.a.setSectionsRounding(r12);
        py0 py0Var2 = this.a;
        py0Var2.getClass();
        int i18 = org.telegram.ui.ActionBar.y6.a7;
        org.telegram.ui.ActionBar.f7.i(i18, py0Var2, this.z0);
        this.a.setVerticalScrollBarEnabled(r12);
        ch.j jVar = new ch.j(this.a, (ViewGroup) this.fragmentView, new i60(this, 1));
        jVar.h = true;
        qy0 qy0Var = new qy0(this);
        this.a.setItemAnimator(qy0Var);
        int i19 = i11;
        qy0Var.e = 320L;
        qy0Var.d = 320L;
        qy0Var.c = 320L;
        qy0Var.m = r12;
        qy0Var.S();
        org.telegram.ui.Components.ds dsVar2 = org.telegram.ui.Components.ds.h;
        qy0Var.o(dsVar2);
        this.a.setClipToPadding(r12);
        this.a.setClipChildren(r12);
        this.a.setHideIfEmpty(r12);
        ry0 ry0Var = new ry0(this);
        this.c = ry0Var;
        ry0Var.k1(1);
        ry0 ry0Var2 = this.c;
        ry0Var2.r = r12;
        this.a.setLayoutManager(ry0Var2);
        this.a.setGlowColor(r12);
        this.a.setAdapter(this.d);
        frameLayout.addView(this.a, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        this.a.setOnItemClickListener(new bi.i(this, context, j11, 7));
        this.a.setOnItemLongClickListener(new vy0(this, context));
        if (this.r1 || this.t1 || this.x1) {
            v5();
            G();
            this.d6 = true;
            this.b6 = this.P4;
            this.c6 = r12;
        }
        if (this.U0 != null) {
            org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context);
            this.b = mm0Var;
            mm0Var.setVerticalScrollBarEnabled(r12);
            this.b.setLayoutManager(new s4.c0(1, r12));
            org.telegram.ui.ActionBar.f7.I(this.b, org.telegram.ui.ActionBar.y6.e8, this.z0);
            this.b.setAdapter(this.e);
            u6Var = null;
            this.b.setItemAnimator(null);
            this.b.setVisibility(8);
            this.b.setLayoutAnimation(null);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, this.b, this.z0);
            frameLayout.addView(this.b, org.telegram.ui.Components.gb1.i(-1, -1, 51));
            this.b.setOnItemClickListener(new h(this, 29));
            this.b.setOnItemLongClickListener(new wx0(this, 5));
            this.b.setOnScrollListener(new wy0(this, r12));
            this.b.r1(1, true);
            org.telegram.ui.Components.ey0 ey0Var = new org.telegram.ui.Components.ey0(context);
            this.O = ey0Var;
            ey0Var.setAnimateLayoutChange(true);
            this.O.e.setVisibility(8);
            this.O.setVisibility(8);
            frameLayout.addView(this.O);
            this.e.G();
        } else {
            u6Var = null;
        }
        if (this.E1 != 0) {
            dsVar = dsVar2;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.E1));
            if (this.G2 == null) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(chat);
                tL_channels_getParticipant.participant = getMessagesController().getInputPeer(this.e1);
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new ey0(this, 4));
            }
            di.i4 i4Var2 = new di.i4(context, 26);
            i4Var2.setWillNotDraw(r12);
            i4Var2.setPadding(r12, r12, r12, AndroidUtilities.navigationBarHeight);
            frameLayout.addView(i4Var2, org.telegram.ui.Components.gb1.e(-1.0f, (AndroidUtilities.navigationBarHeight / AndroidUtilities.density) + 51.0f, 83));
            i4Var2.setOnClickListener(new xd0(11, this, chat));
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.p7, this.z0);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.BanFromTheGroupNoCaps));
            i4Var2.addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, 17, 0.0f, 1.0f, 0.0f, 0.0f));
            this.a.setPadding(r12, c4(), r12, AndroidUtilities.dp(48.0f));
            this.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f));
        } else {
            dsVar = dsVar2;
            this.a.setPadding(r12, c4(), r12, r12);
        }
        x01 x01Var = new x01(this, context);
        this.d1 = x01Var;
        x01Var.a(this.X5, r12);
        this.d1.setBackgroundColor(getThemedColor(i18));
        frameLayout.addView(this.d1);
        org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
        this.d0 = oVar;
        oVar.setPivotX(AndroidUtilities.dp(30.0f));
        this.d0.setPivotY(AndroidUtilities.dp(30.0f));
        this.X = new k0(this, context, 21);
        this.Y = new bh.p(this, context, 20);
        ImageReceiver imageReceiver = new ImageReceiver(this.Y);
        this.x5 = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.Y, true, 1.0f, r12);
        frameLayout.addView(this.Y, org.telegram.ui.Components.gb1.h(-1, -1.0f, 8388611, 0.0f, 0.0f, 0.0f, 0.0f));
        this.X.setPivotX(0.0f);
        this.X.setPivotY(0.0f);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.t0 = ri0Var;
        ri0Var.addView(this.X, org.telegram.ui.Components.gb1.i(100, 100, 51));
        this.Y.addView(this.t0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        yy0 yy0Var = new yy0(context);
        this.e0 = yy0Var;
        yy0Var.t(X3());
        this.e0.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.e0.setRoundRadiusForExpand(i4());
        this.e0.setPivotX(0.0f);
        this.e0.setPivotY(0.0f);
        this.X.addView(this.e0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.e0.setOnClickListener(new vx0(this, r12));
        this.e0.setHasStories(q4());
        this.e0.setOnLongClickListener(new t(this, 6));
        org.telegram.ui.Cells.d4 d4Var = new org.telegram.ui.Cells.d4(this, context);
        this.g0 = d4Var;
        d4Var.setSize(AndroidUtilities.dp(26.0f));
        this.g0.setProgressColor(-1);
        this.g0.setNoProgress(r12);
        this.X.addView(this.g0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        ImageView imageView2 = new ImageView(context);
        this.h0 = imageView2;
        imageView2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
        ImageView imageView3 = this.h0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        this.h0.setAlpha(0.0f);
        this.h0.setScaleX(0.85f);
        this.h0.setScaleY(0.85f);
        ImageView imageView4 = this.h0;
        org.telegram.ui.Components.e31 e31Var = new org.telegram.ui.Components.e31(context, u6Var);
        this.l0 = e31Var;
        imageView4.setImageDrawable(e31Var);
        this.h0.setTranslationY(-1.0f);
        frameLayout.addView(this.h0, org.telegram.ui.Components.gb1.i(34, 34, 51));
        ImageView imageView5 = new ImageView(context);
        this.i0 = imageView5;
        imageView5.setScaleType(scaleType);
        this.i0.setAlpha(0.0f);
        this.i0.setImageDrawable(new ii.a());
        frameLayout.addView(this.i0, org.telegram.ui.Components.gb1.i(16, 16, 51));
        ImageView imageView6 = new ImageView(context);
        this.j0 = imageView6;
        imageView6.setImageResource(R.drawable.star_small_outline);
        org.telegram.ui.ActionBar.f7.t(this.j0, org.telegram.ui.ActionBar.y6.s8, this.z0, PorterDuff.Mode.SRC_IN);
        this.j0.setAlpha(0.0f);
        this.j0.setScaleY(0.0f);
        this.j0.setScaleX(0.0f);
        frameLayout.addView(this.j0, org.telegram.ui.Components.gb1.i(20, 20, 51));
        ImageView imageView7 = new ImageView(context);
        this.k0 = imageView7;
        imageView7.setImageResource(R.drawable.star_small_inner);
        this.k0.setAlpha(0.0f);
        this.k0.setScaleY(0.0f);
        this.k0.setScaleX(0.0f);
        frameLayout.addView(this.k0, org.telegram.ui.Components.gb1.i(20, 20, 51));
        w5();
        a5(r12, r12);
        zy0 zy0Var = this.n0;
        if (zy0Var != null) {
            zy0Var.K();
        }
        org.telegram.ui.Components.ei0 ei0Var2 = this.m0;
        if (ei0Var2 != null) {
            ei0Var2.e();
        }
        this.M = new k01(this, context);
        org.telegram.ui.Components.ei0 ei0Var3 = new org.telegram.ui.Components.ei0(context);
        this.m0 = ei0Var3;
        ei0Var3.setSize(X3());
        long j12 = this.e1;
        if (j12 == 0) {
            j12 = -this.f1;
        }
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        py0 py0Var3 = this.a;
        yy0 yy0Var2 = this.e0;
        getClassGuid();
        this.n0 = new zy0(this, context, j12, kVar3, py0Var3, yy0Var2, this.M, this.m0);
        if (this.e1 != getUserConfig().clientUserId && (userFull2 = this.v2) != null) {
            this.t5 = userFull2.profile_photo == null ? 0.0f : 1.0f;
        }
        if (!this.q1) {
            this.n0.setChatInfo(this.u2);
        }
        this.Y.addView(this.n0);
        this.Y.addView(this.m0, org.telegram.ui.Components.gb1.g(138.0f, -1));
        this.Y.addView(this.M);
        org.telegram.ui.Components.bi0 bi0Var = this.Z;
        if (bi0Var != null) {
            this.m0.setActionsView(bi0Var);
            this.Y.addView(this.Z, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        }
        org.telegram.ui.Components.ui0 ui0Var = this.b0;
        if (ui0Var != null) {
            this.m0.setMusicView(ui0Var);
            this.Y.addView(this.b0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            this.Y.addView(this.c0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        }
        this.e0.setAvatarsViewPager(this.n0);
        m01 m01Var = new m01(this, context);
        this.o0 = m01Var;
        this.Y.addView(m01Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        frameLayout.addView(this.actionBar);
        fl flVar = new fl(this, context, 3);
        this.f = flVar;
        flVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.vh));
        this.f.setPadding(r12, AndroidUtilities.dp(6.0f), r12, AndroidUtilities.dp(4.0f));
        this.f.setTextSizePx(AndroidUtilities.dp(17.5f));
        this.f.setGravity(3);
        this.f.setTypeface(AndroidUtilities.bold());
        this.f.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
        this.f.setPivotX(0.0f);
        this.f.setPivotY(0.0f);
        this.f.setScrollNonFitText(true);
        this.f.setFocusable(true);
        this.f.setEllipsizeByGradient(true);
        this.Y.addView(this.f, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 109.0f, -6.0f, 0.0f, 0.0f));
        az0 az0Var = new az0(this, context);
        this.r = az0Var;
        az0Var.setEllipsizeByGradient(true);
        this.r.setTextColor(D3(getThemedColor(org.telegram.ui.ActionBar.y6.B8), null));
        this.r.setTextSizePx(AndroidUtilities.dp(13.5f));
        this.r.setGravity(3);
        this.r.setPivotX(AndroidUtilities.dp(8.0f));
        this.r.setPivotY(AndroidUtilities.dp(8.0f));
        this.r.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        this.r.setFocusable(true);
        this.Y.addView(this.r, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 105.0f, -2.0f, 4.0f, 0.0f));
        J3();
        this.Y.addView(this.d0);
        org.telegram.ui.Components.ox0 ox0Var = new org.telegram.ui.Components.ox0(context);
        this.S = ox0Var;
        ox0Var.setLayoutParams(org.telegram.ui.Components.gb1.h(32, 32.0f, 3, 103.0f, -2.0f, 0.0f, 0.0f));
        this.S.setResourcesProvider(this.z0);
        K3();
        int i20 = 1;
        this.S.setDelegate(new wx0(this, i20));
        this.S.setOnClickListener(new vx0(this, i20));
        TLRPC.UserFull userFull5 = this.v2;
        if (userFull5 != null) {
            this.S.set(userFull5.stars_rating);
        }
        this.Y.addView(this.S);
        this.u0 = new bz0(this, context, this.currentAccount, a(), this.q1, this.X, this.e0, this.z0, context);
        x5(r12);
        TLRPC.UserFull userFull6 = this.v2;
        if (userFull6 != null) {
            this.u0.setStories(userFull6.stories);
        } else {
            TLRPC.ChatFull chatFull3 = this.u2;
            if (chatFull3 != null) {
                this.u0.setStories(chatFull3.stories);
            }
        }
        yy0 yy0Var3 = this.e0;
        if (yy0Var3 != null) {
            yy0Var3.setHasStories(q4());
        }
        this.Y.addView(this.u0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        bi.i1 i1Var = new bi.i1(context, this.currentAccount, a(), this.X);
        this.v0 = i1Var;
        this.Y.addView(i1Var, (int) r12, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        int i21 = 1;
        u5(true);
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(context);
        this.s = ak0Var;
        if (this.Z != null) {
            ak0Var.setVisibility(8);
        }
        C5();
        if (this.e1 == 0) {
            this.s.setImageResource(R.drawable.profile_discuss);
            this.s.setContentDescription(LocaleController.getString(R.string.ViewDiscussion));
        } else if (this.q0 != null) {
            this.U = new org.telegram.ui.Components.xj0(R.raw.camera_outline, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            this.V = new org.telegram.ui.Components.xj0(R.raw.camera_outline, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
            org.telegram.ui.Components.bi0 bi0Var2 = this.Z;
            if (bi0Var2 != null) {
                bi0Var2.e();
                this.Z.a();
                this.Z.b();
                this.Z.c();
                org.telegram.ui.Components.bi0 bi0Var3 = this.Z;
                if (bi0Var3.I) {
                    bi0Var3.I = r12;
                    bi0Var3.d();
                }
            } else {
                this.s.setAnimation(this.U);
                this.s.setContentDescription(LocaleController.getString(R.string.AccDescrChangeProfilePicture));
                this.s.setPadding(AndroidUtilities.dp(2.0f), r12, r12, AndroidUtilities.dp(2.0f));
            }
        } else {
            org.telegram.ui.Components.bi0 bi0Var4 = this.Z;
            if (bi0Var4 != 0) {
                bi0Var4.o(r12, true);
            }
            this.s.setImageResource(R.drawable.profile_newmsg);
            this.s.setContentDescription(LocaleController.getString(R.string.AccDescrOpenChat));
        }
        this.s.setScaleType(scaleType);
        frameLayout.addView(this.s, org.telegram.ui.Components.gb1.h(60, 60.0f, 53, 0.0f, 0.0f, 16.0f, 0.0f));
        this.s.setOnClickListener(new vx0(this, 2));
        r4(r12);
        if (i19 != -1 && obj != null) {
            this.s.setTag(Integer.valueOf((int) r12));
            this.s.setScaleX(0.2f);
            this.s.setScaleY(0.2f);
            this.s.setAlpha(0.0f);
        }
        this.a.setOnScrollListener(new wy0(this, i21));
        UndoView undoView = new UndoView(context, null, r12, this.z0);
        this.L = undoView;
        frameLayout.addView(undoView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.j2 = ofFloat;
        ofFloat.addUpdateListener(new by0(this, i21));
        this.j2.setInterpolator(dsVar);
        this.j2.addListener(new cz0(this));
        v5();
        S();
        int i22 = 9;
        org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(getParentActivity(), 9);
        this.W = t40Var;
        t40Var.setAlpha(0.0f);
        frameLayout.addView(this.W, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
        this.N.setForwardRestrictedHint(this.W);
        dz0 dz0Var = new dz0(this, (ViewGroup) getParentActivity().getWindow().getDecorView(), frameLayout);
        this.b5 = dz0Var;
        dz0Var.E = new oy0(this);
        this.n0.setPinchToZoomHelper(dz0Var);
        this.x0.setAlpha(r12);
        this.y0.setColor(getThemedColor(org.telegram.ui.ActionBar.y6.i6));
        z5();
        z10 z10Var = new z10(this, context, 7);
        this.T = z10Var;
        int i23 = org.telegram.ui.ActionBar.y6.d6;
        z10Var.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i23), 100)));
        this.T.setFocusable((boolean) r12);
        this.T.setImportantForAccessibility(2);
        int i24 = 3;
        this.T.setOnClickListener(new vx0(this, i24));
        this.T.setVisibility(8);
        this.T.setFitsSystemWindows(true);
        this.s5.addView(this.T, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        N3();
        if (this.s1) {
            i12 = 87;
            this.s5.addView(this.y5, org.telegram.ui.Components.gb1.i(-1, 60, 87));
        } else {
            i12 = 87;
        }
        org.telegram.ui.Components.bi0 bi0Var5 = this.Z;
        if (bi0Var5 != null && bi0Var5.l()) {
            ImageView imageView8 = new ImageView(context);
            this.O0 = imageView8;
            imageView8.setScaleType(scaleType);
            this.O0.setImageResource(R.drawable.call);
            this.O0.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            layoutParams.topMargin = this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : r12;
            layoutParams.setMarginEnd(layoutParams.width);
            layoutParams.gravity = 8388613;
            frameLayout.addView(this.O0, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.E5 = frameLayout2;
        org.telegram.ui.ActionBar.f7.i(i23, frameLayout2, this.z0);
        View view = new View(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d7, view, this.z0);
        this.E5.addView(view, org.telegram.ui.Components.gb1.h(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.F5 = new fi.d(context, this.z0);
        this.F5.h(LocaleController.getString(R.string.Save), r12);
        this.E5.addView(this.F5, org.telegram.ui.Components.gb1.h(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        this.F5.setOnClickListener(new vx0(this, 4));
        this.E5.setVisibility(8);
        this.E5.setTranslationY(AndroidUtilities.dp(69.0f));
        this.s5.addView(this.E5, org.telegram.ui.Components.gb1.i(-1, -2, i12));
        this.H6 = new bi.g(i22, this, jVar);
        Z4();
        r0.i0.m(this.fragmentView, new wx0(this, i24));
        return this.fragmentView;
    }

    public final int d4() {
        return X3() == 0 ? AndroidUtilities.dp(168.0f) : AndroidUtilities.dp(152.0f);
    }

    public final void d5() {
        if (!this.p2) {
            az0 az0Var = this.r;
            if (az0Var != null) {
                Object tag = az0Var.getTag();
                if (tag instanceof Integer) {
                    this.r.setTextColor(D3(org.telegram.ui.ActionBar.y6.w0(((Integer) tag).intValue(), this.z0), Boolean.valueOf(this.J0[0])));
                } else {
                    this.r.setTextColor(D3(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, this.z0), Boolean.TRUE));
                }
            }
            Drawable drawable = this.w;
            if (drawable != null) {
                drawable.setColorFilter(this.X5 != null ? -1 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.pc, this.z0), PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.en0 en0Var = this.K;
            if (en0Var != null) {
                en0Var.b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h8, this.z0));
            }
            fl flVar = this.f;
            if (flVar != null) {
                flVar.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.vh, this.z0));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.y(this.X5 == null ? org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v8, this.z0) : -1, false);
                this.actionBar.x(this.X5 != null ? 553648127 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f8, this.z0), false);
            }
        }
        j5();
        B5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        j01 j01Var;
        org.telegram.ui.ActionBar.j5 j5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.Chat chat;
        py0 py0Var;
        py0 py0Var2;
        org.telegram.ui.Components.vl0 vl0Var;
        if (i10 == NotificationCenter.uploadStoryEnd || i10 == NotificationCenter.chatWasBoostedByUser) {
            if (ChatObject.isBoostSupported(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f1)))) {
                getMessagesController().getStoriesController().k(a(), new di.e(19), false, this.z0);
                return;
            }
            return;
        }
        int i12 = 0;
        r3 = false;
        boolean z10 = false;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            Object[] objArr2 = ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0 && (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) == 0) ? false : true;
            if (this.e1 != 0) {
                if (objArr2 != false) {
                    u5(true);
                }
                if ((intValue & MessagesController.UPDATE_MASK_PHONE) == 0 || (py0Var2 = this.a) == null || (vl0Var = (org.telegram.ui.Components.vl0) py0Var2.L(this.G3, false)) == null) {
                    return;
                }
                this.d.v(vl0Var, this.G3);
                return;
            }
            if (this.f1 != 0) {
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0) {
                        p5(true, false);
                    } else {
                        s5(true);
                    }
                    u5(true);
                }
                if (!objArr2 == true || (py0Var = this.a) == null) {
                    return;
                }
                int childCount = py0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = this.a.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.ab) {
                        ((org.telegram.ui.Cells.ab) childAt).i(intValue);
                    }
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
            Long l4 = (Long) objArr[0];
            if (this.u2 == null || (chat = this.E2) == null || chat.id != l4.longValue()) {
                return;
            }
            this.u2.online_count = ((Integer) objArr[1]).intValue();
            s5(true);
            u5(false);
            return;
        }
        if (i10 == NotificationCenter.contactsDidLoad || i10 == NotificationCenter.channelRightsUpdated) {
            L3(true);
            return;
        }
        if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.j1) {
                AndroidUtilities.runOnUIThread(new yl0(26, this, objArr));
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.encryptedChatUpdated) {
            TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
            TLRPC.EncryptedChat encryptedChat2 = this.D2;
            if (encryptedChat2 == null || encryptedChat.id != encryptedChat2.id) {
                return;
            }
            this.D2 = encryptedChat;
            p5(false, false);
            FlagSecureReason flagSecureReason = this.X1;
            if (flagSecureReason != null) {
                flagSecureReason.invalidate();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.blockedUsersDidLoad) {
            boolean z11 = this.k1;
            boolean z12 = getMessagesController().blockePeers.indexOfKey(this.e1) >= 0;
            this.k1 = z12;
            if (z11 != z12) {
                L3(true);
                p5(false, false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.groupCallUpdated) {
            Long l10 = (Long) objArr[0];
            if (this.E2 != null) {
                long longValue = l10.longValue();
                TLRPC.Chat chat2 = this.E2;
                if (longValue == chat2.id && ChatObject.canManageCalls(chat2)) {
                    TLRPC.ChatFull chatFull4 = MessagesController.getInstance(this.currentAccount).getChatFull(l10.longValue());
                    if (chatFull4 != null) {
                        TLRPC.ChatFull chatFull5 = this.u2;
                        if (chatFull5 != null) {
                            chatFull4.participants = chatFull5.participants;
                        }
                        this.u2 = chatFull4;
                    }
                    vz0 vz0Var = this.N;
                    if (vz0Var != null) {
                        vz0Var.setChatInfo(this.u2);
                    }
                    TLRPC.ChatFull chatFull6 = this.u2;
                    if (chatFull6 != null && (((inputGroupCall = chatFull6.call) == null && !this.p1) || (inputGroupCall != null && this.p1))) {
                        L3(false);
                    }
                    bz0 bz0Var = this.u0;
                    if (bz0Var != null && (chatFull3 = this.u2) != null) {
                        bz0Var.setStories(chatFull3.stories);
                    }
                    bi.i1 i1Var = this.v0;
                    if (i1Var != null) {
                        i1Var.a();
                    }
                    yy0 yy0Var = this.e0;
                    if (yy0Var != null) {
                        yy0Var.setHasStories(q4());
                    }
                    if (l10.longValue() != 0) {
                        boolean z13 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.u2) == null || !chatFull2.stargifts_available) ? false : true;
                        this.T0.Q(38, z13);
                        org.telegram.ui.Components.bi0 bi0Var = this.Z;
                        if (bi0Var != null) {
                            bi0Var.o(3, z13);
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
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull7 = (TLRPC.ChatFull) objArr[0];
            if (this.e1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.e1))) != null && chatFull7.id == user.linked_community_id) {
                p5(true, false);
            }
            TLRPC.Chat chat3 = this.E2;
            if (chat3 != null && chatFull7.id == chat3.linked_community_id) {
                p5(true, false);
            }
            if (chatFull7.id == this.f1) {
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                TLRPC.ChatFull chatFull8 = this.u2;
                if ((chatFull8 instanceof TLRPC.TL_channelFull) && chatFull7.participants == null) {
                    chatFull7.participants = chatFull8.participants;
                }
                Object[] objArr3 = chatFull8 == null && (chatFull7 instanceof TLRPC.TL_channelFull);
                this.u2 = chatFull7;
                if (this.m1 == 0) {
                    long j10 = chatFull7.migrated_from_chat_id;
                    if (j10 != 0) {
                        this.m1 = -j10;
                        getMediaDataController().getMediaCount(this.m1, this.g1, 0, this.classGuid, true);
                    }
                }
                U3();
                zy0 zy0Var = this.n0;
                if (zy0Var != null && !this.q1) {
                    zy0Var.setChatInfo(this.u2);
                }
                p5(true, false);
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f1));
                if (chat4 != null) {
                    this.E2 = chat4;
                    L3(true);
                }
                FlagSecureReason flagSecureReason2 = this.X1;
                if (flagSecureReason2 != null) {
                    flagSecureReason2.invalidate();
                }
                if (this.E2.megagroup && (objArr3 != false || !booleanValue)) {
                    a4(true);
                }
                f5();
                z5();
                bz0 bz0Var2 = this.u0;
                if (bz0Var2 != null && (chatFull = this.u2) != null) {
                    bz0Var2.setStories(chatFull.stories);
                }
                bi.i1 i1Var2 = this.v0;
                if (i1Var2 != null) {
                    i1Var2.a();
                }
                yy0 yy0Var2 = this.e0;
                if (yy0Var2 != null) {
                    yy0Var2.setHasStories(q4());
                }
                vz0 vz0Var2 = this.N;
                if (vz0Var2 != null) {
                    vz0Var2.setChatInfo(this.u2);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == NotificationCenter.closeProfileActivity) {
            long longValue2 = ((Long) objArr[0]).longValue();
            boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
            if (longValue2 == a() && (j5Var = this.parentLayout) != null && j5Var.getFragmentStack().contains(this)) {
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
        if (i10 == NotificationCenter.botInfoDidLoad) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
            if (botInfo.user_id == this.e1) {
                this.F2 = botInfo;
                p5(false, false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.userInfoDidLoad) {
            if (((Long) objArr[0]).longValue() == this.e1) {
                TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                this.v2 = userFull;
                org.telegram.ui.Components.ox0 ox0Var = this.S;
                if (ox0Var != null) {
                    ox0Var.set(userFull.stars_rating);
                }
                bz0 bz0Var3 = this.u0;
                if (bz0Var3 != null) {
                    bz0Var3.setStories(this.v2.stories);
                }
                bi.i1 i1Var3 = this.v0;
                if (i1Var3 != null) {
                    i1Var3.a();
                }
                yy0 yy0Var3 = this.e0;
                if (yy0Var3 != null) {
                    yy0Var3.setHasStories(q4());
                }
                vz0 vz0Var3 = this.N;
                if (vz0Var3 != null) {
                    vz0Var3.setUserInfo(this.v2);
                }
                if (this.q0 != null) {
                    if (this.d != null && !TextUtils.equals(this.v2.about, this.z2)) {
                        this.d.m(this.W2);
                    }
                    if (this.s1) {
                        p5(false, false);
                    }
                } else {
                    if (this.G1 || this.K0) {
                        this.I1 = true;
                    } else {
                        L3(true);
                    }
                    p5(false, false);
                    vz0 vz0Var4 = this.N;
                    if (vz0Var4 != null) {
                        vz0Var4.setCommonGroupsCount(this.v2.common_chats_count);
                        S();
                        org.telegram.ui.Components.sv0 sv0Var = this.Q;
                        if (sv0Var == null || sv0Var.y) {
                            resumeDelayedFragmentAnimation();
                            r4(true);
                        }
                    }
                }
                f5();
                z5();
                if (this.w2 == null && !o4()) {
                    org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(this.currentAccount);
                    this.w2 = k6Var;
                    fb0 fb0Var = new fb0(this, 16);
                    if (k6Var.c) {
                        fb0Var.run();
                    } else {
                        k6Var.h.add(fb0Var);
                    }
                    this.w2.d(this.v2);
                }
                if (!o4()) {
                    y01 y01Var = this.y2;
                    y01 c10 = y01.c(this.currentAccount, this.v2, y01Var);
                    this.y2 = c10;
                    this.x2 = c10 != y01Var;
                    if (c10 != null) {
                        fb0 fb0Var2 = new fb0(this, 17);
                        if (c10.b) {
                            fb0Var2.run();
                        } else {
                            c10.h.add(fb0Var2);
                        }
                    }
                }
                if (this.T0 != null) {
                    if (k4()) {
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
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long a2 = a();
            if (a2 == ((Long) objArr[0]).longValue()) {
                DialogObject.isEncryptedDialog(a2);
                ArrayList arrayList = (ArrayList) objArr[1];
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i14);
                    if (this.D2 != null) {
                        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (j01Var = this.d) != null) {
                            j01Var.l();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            py0 py0Var3 = this.a;
            if (py0Var3 != null) {
                py0Var3.g1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.reloadInterface) {
            p5(false, false);
            return;
        }
        if (i10 == NotificationCenter.newSuggestionsAvailable) {
            int i15 = this.c3;
            int i16 = this.a3;
            int i17 = this.Y2;
            v5();
            j01 j01Var2 = this.d;
            if (j01Var2 != null) {
                if (i15 == this.c3 && i16 == this.a3 && i17 == this.Y2) {
                    return;
                }
                j01Var2.l();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.topicsDidLoaded) {
            if (this.q1) {
                u5(false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateSearchSettings) {
            u01 u01Var = this.e;
            if (u01Var != null) {
                u01Var.c = u01.H(this);
                this.e.v.clear();
                this.e.J();
                u01 u01Var2 = this.e;
                u01Var2.I(u01Var2.y);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.reloadDialogPhotos) {
            u5(false);
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated || i10 == NotificationCenter.storiesReadUpdated) {
            yy0 yy0Var4 = this.e0;
            if (yy0Var4 != null) {
                yy0Var4.setHasStories(q4());
                this.e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(i4(), 0.0f, this.k2));
            }
            bz0 bz0Var4 = this.u0;
            if (bz0Var4 != null) {
                TLRPC.UserFull userFull3 = this.v2;
                if (userFull3 != null) {
                    bz0Var4.setStories(userFull3.stories);
                    return;
                }
                TLRPC.ChatFull chatFull9 = this.u2;
                if (chatFull9 != null) {
                    bz0Var4.setStories(chatFull9.stories);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            org.telegram.ui.ActionBar.w0 w0Var = this.T0;
            if (w0Var != null) {
                w0Var.Q(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.e1)));
            }
            i5();
            return;
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            i5();
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            p5(false, false);
            return;
        }
        if (i10 == NotificationCenter.botStarsUpdated) {
            p5(false, false);
            return;
        }
        if (i10 == NotificationCenter.agentSettingsUpdated) {
            if (m4()) {
                p5(false, false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.botStarsTransactionsLoaded) {
            p5(false, false);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted) {
            if (a() == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.j5 j5Var2 = this.parentLayout;
                if (j5Var2 == null || j5Var2.getLastFragment() != this) {
                    removeSelfFromStack();
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.channelRecommendationsLoaded) {
            long longValue3 = ((Long) objArr[0]).longValue();
            if (this.P4 >= 0 || longValue3 != a()) {
                return;
            }
            v5();
            S();
            j01 j01Var3 = this.d;
            if (j01Var3 != null) {
                j01Var3.l();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() != a() || o4()) {
                return;
            }
            if (this.P4 >= 0) {
                vz0 vz0Var5 = this.N;
                if (vz0Var5 != null) {
                    vz0Var5.J1(true);
                    return;
                }
                return;
            }
            v5();
            S();
            j01 j01Var4 = this.d;
            if (j01Var4 != null) {
                j01Var4.l();
            }
            AndroidUtilities.runOnUIThread(new fb0(this, 18));
            return;
        }
        if (i10 == NotificationCenter.profileMusicUpdated) {
            if (((Long) objArr[0]).longValue() != a() || this.e1 <= 0) {
                return;
            }
            TLRPC.UserFull userFull4 = getMessagesController().getUserFull(this.e1);
            if (userFull4 != null) {
                this.v2 = userFull4;
            }
            v5();
            S();
            py0 py0Var4 = this.a;
            if (py0Var4 != null && py0Var4.c0()) {
                this.a.post(new fb0(this, 19));
                return;
            }
            j01 j01Var5 = this.d;
            if (j01Var5 != null) {
                j01Var5.l();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.updatedChatRanks) {
            return;
        }
        long longValue4 = ((Long) objArr[0]).longValue();
        long longValue5 = ((Long) objArr[1]).longValue();
        TLRPC.Chat chat5 = this.E2;
        if (chat5 == null || chat5.id != longValue4) {
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
            ArrayList arrayList2 = this.W4;
            if (i12 >= arrayList2.size()) {
                AndroidUtilities.updateVisibleRows(this.a);
                return;
            } else {
                ((TLRPC.ChatParticipant) arrayList2.get(i12)).setRank(longValue5, str);
                i12++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.g50 g50Var = this.q0;
        if (g50Var == null || !g50Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.g50 g50Var = this.q0;
        return (g50Var == null || dialog != g50Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final float e4(float f7, float f10) {
        this.l6 = f7;
        this.n6 = f10;
        int i10 = this.J1;
        float clamp01 = Utilities.clamp01(i10 == 2 ? 1.0f : (this.S1 >= 1.0f || i10 == 0) ? this.k2 : 0.0f);
        org.telegram.ui.Components.ox0 ox0Var = this.S;
        return Math.max(0.0f, (h4() + this.u5) * clamp01) + c3.h0.z(1.0f, clamp01, f10 * (ox0Var != null ? ox0Var.getVisibilityFactor() : 0.0f), f7);
    }

    public final void e5() {
        k0 k0Var;
        if (this.Z == null || this.r == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        org.telegram.ui.Components.bi0 bi0Var = this.Z;
        boolean z10 = this.G1;
        bi0Var.e = z10;
        if (z10 && this.J1 == 2 && (k0Var = this.X) != null) {
            this.Z.f = this.X.getY() + (this.X.getScaleY() * k0Var.getHeight());
            this.Z.setAlpha(this.S1);
            org.telegram.ui.Components.bi0 bi0Var2 = this.Z;
            float measuredWidth = this.a.getMeasuredWidth();
            bi0Var2.E = AndroidUtilities.dp(74.0f);
            bi0Var2.setTranslationY(measuredWidth);
            bi0Var2.invalidate();
        } else {
            bi0Var.f = -1.0f;
            float f7 = currentActionBarHeight;
            float dp = (this.Q1 + f7) - AndroidUtilities.dp((this.N4 || this.O4) ? 25.0f : 0.0f);
            float min = Math.min(AndroidUtilities.dp(74.0f), dp - f7);
            org.telegram.ui.Components.bi0 bi0Var3 = this.Z;
            bi0Var3.E = min;
            bi0Var3.setTranslationY(dp - min);
            bi0Var3.invalidate();
        }
        ImageView imageView = this.O0;
        if (imageView == null || imageView.getTag() == null) {
            return;
        }
        this.Z.getClass();
        if (this.O0.getVisibility() == 0) {
            this.O0.setVisibility(8);
        }
        if (this.O0.getTag() instanceof org.telegram.ui.ActionBar.w0) {
            ((org.telegram.ui.ActionBar.w0) this.O0.getTag()).setAlpha(1.0f);
        }
    }

    @Override // org.telegram.ui.Components.mu0
    public final org.telegram.ui.Components.mm0 f() {
        return this.a;
    }

    public final float f4(float f7) {
        this.o6 = f7;
        int i10 = this.J1;
        return c3.h0.z(1.0f, Utilities.clamp01(i10 == 2 ? 1.0f : (this.S1 >= 1.0f || i10 == 0) ? this.k2 : 0.0f), this.S != null ? this.S.getVisibilityFactor() * AndroidUtilities.dp(3.0f) : 0.0f, f7);
    }

    public final void f5() {
        if (this.Z0 == null || this.a1 == null) {
            return;
        }
        TLRPC.UserFull userFull = this.v2;
        int i10 = (userFull == null && this.u2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.u2.ttl_period;
        this.s0.b(i10);
        this.a1.b(i10);
    }

    @Override // org.telegram.ui.Components.mu0
    public final TLRPC.Chat g() {
        return this.E2;
    }

    public final org.telegram.ui.Components.cs g4() {
        if (this.J == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            this.y = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zh, this.z0), PorterDuff.Mode.MULTIPLY);
            this.J = new org.telegram.ui.Components.cs(this.y, getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return this.J;
    }

    public final void g5() {
        if (this.y5 == null) {
            return;
        }
        vz0 vz0Var = this.N;
        boolean z10 = ((vz0Var == null || !vz0Var.isAttachedToWindow()) ? (float) AndroidUtilities.dp(72.0f) : ((float) AndroidUtilities.dp(232.0f)) - (((float) this.a.getMeasuredHeight()) - this.N.getY())) <= 0.0f;
        oe.b bVar = this.G5;
        bVar.a(z10, true);
        float f7 = bVar.e;
        this.y5.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f7));
        this.y5.setAlpha(f7);
        this.y5.setVisibility(f7 <= 0.0f ? 4 : 0);
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.x;
        if (qcVar != null) {
            qcVar.l();
        }
    }

    public float getAvatarAnimationProgress() {
        return this.S1;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ qu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.z0;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        if (this.z0 != null) {
            return null;
        }
        j6 j6Var = new j6(19, this);
        ArrayList arrayList = new ArrayList();
        vz0 vz0Var = this.N;
        if (vz0Var != null) {
            arrayList.addAll(vz0Var.getThemeDescriptions());
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.p0}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.s, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.wh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.xh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.yh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.x6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 0, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"detailTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.z6));
        int i10 = org.telegram.ui.ActionBar.y6.Sh;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 0, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 131072, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        int i12 = org.telegram.ui.ActionBar.y6.Qh;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 196608, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 0, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 131072, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 196608, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 0, new Class[]{org.telegram.ui.Cells.n5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 0, new Class[]{org.telegram.ui.Cells.n5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.n6));
        if (this.L5) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.H}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Oi));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.x}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.H}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ah));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f, 0, (Class[]) null, (Paint) null, new Drawable[]{this.x}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.zh));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.y6.w0(i10, this.z0);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final Drawable getThemedDrawable(String str) {
        org.telegram.ui.ActionBar.u6 u6Var = this.z0;
        Drawable drawable = u6Var != null ? u6Var.getDrawable(str) : null;
        return drawable != null ? drawable : super.getThemedDrawable(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0110, code lost:
    
        if (r24.inviter_id != getUserConfig().getClientUserId()) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0112, code lost:
    
        if (r25 == false) goto L85;
     */
    @Override // org.telegram.ui.Components.mu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        String str;
        boolean z21;
        TLRPC.ChannelParticipant channelParticipant;
        boolean z22;
        boolean z23;
        if (getParentActivity() != null) {
            if (z10) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                if (user != null) {
                    long j10 = chatParticipant.user_id;
                    this.A2 = j10;
                    boolean z24 = j10 == getUserConfig().getClientUserId();
                    if (ChatObject.isChannel(this.E2)) {
                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str2 = channelParticipant.rank;
                        boolean z25 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        boolean z26 = z25 || (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin);
                        getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                        z13 = ChatObject.canAddAdmins(this.E2);
                        boolean z27 = ChatObject.canManageTags(this.E2) && (!z26 || ((!z25 && channelParticipant.can_edit) || z24));
                        if (z25 || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit)) {
                            z13 = false;
                            z27 = false;
                        }
                        if ((z24 || (channelParticipant instanceof TLRPC.TL_channelParticipantSelf)) && ChatObject.canManageMyTag(this.E2)) {
                            z27 = true;
                        }
                        z12 = ChatObject.canBlockUsers(this.E2) && (!((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || z25) || channelParticipant.can_edit);
                        z17 = this.E2.gigagroup ? false : z12;
                        z18 = z25;
                        z19 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                        z20 = z26;
                        z14 = z24;
                        str = str2;
                        z21 = z27;
                        z15 = true;
                    } else {
                        String str3 = chatParticipant.rank;
                        boolean z28 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        boolean z29 = z28 || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator);
                        boolean z30 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        TLRPC.Chat chat = this.E2;
                        z12 = chat.creator || ((chatParticipant instanceof TLRPC.TL_chatParticipant) && (ChatObject.canBlockUsers(chat) || chatParticipant.inviter_id == getUserConfig().getClientUserId()));
                        TLRPC.Chat chat2 = this.E2;
                        z13 = chat2.creator;
                        if (ChatObject.canManageTags(chat2)) {
                            z14 = z24;
                            z15 = true;
                            if (z29) {
                                if (!z30) {
                                }
                            }
                            z16 = z15;
                            z17 = this.E2.creator;
                            z18 = z30;
                            z19 = z28;
                            z20 = z29;
                            str = str3;
                            z21 = z16;
                            channelParticipant = null;
                        } else {
                            z14 = z24;
                            z15 = true;
                        }
                        if (!z14 || !ChatObject.canManageMyTag(this.E2)) {
                            z16 = false;
                            z17 = this.E2.creator;
                            z18 = z30;
                            z19 = z28;
                            z20 = z29;
                            str = str3;
                            z21 = z16;
                            channelParticipant = null;
                        }
                        z16 = z15;
                        z17 = this.E2.creator;
                        z18 = z30;
                        z19 = z28;
                        z20 = z29;
                        str = str3;
                        z21 = z16;
                        channelParticipant = null;
                    }
                    if (!z14) {
                        z22 = z21;
                        z23 = z12;
                    } else if (ChatObject.canManageMyTag(this.E2) || (z20 && ChatObject.canManageTags(this.E2))) {
                        z13 = false;
                        z17 = false;
                        z23 = false;
                        z22 = z15;
                    } else {
                        z22 = z21;
                        z13 = false;
                        z17 = false;
                        z23 = false;
                    }
                    boolean z31 = (z13 || z22 || z17 || z23) ? z15 : false;
                    if (z11 || !z31) {
                        return z31;
                    }
                    TLRPC.ChannelParticipant channelParticipant2 = channelParticipant;
                    org.telegram.messenger.kk kkVar = new org.telegram.messenger.kk(this, channelParticipant2, user, chatParticipant, z19, str);
                    String str4 = str;
                    boolean z32 = z19;
                    Drawable V0 = view.getParent() instanceof org.telegram.ui.Components.mm0 ? ((org.telegram.ui.Components.mm0) view.getParent()).V0(view, false) : null;
                    org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(this, view);
                    H.W(V0);
                    H.w = false;
                    boolean z33 = z15;
                    H.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new ux0(this, user, 0), !z14);
                    if (!z14 && (z13 || z22 || z17 || z23)) {
                        H.k();
                    }
                    H.l((z20 || !TextUtils.isEmpty(str4)) ? R.drawable.menu_tag_edit : R.drawable.menu_tag_plus, LocaleController.getString(z20 ? R.string.EditAdminTag : TextUtils.isEmpty(str4) ? R.string.AddMemberTag : R.string.EditMemberTag), new di.i6(this, user, str4, z20, z18), z22);
                    H.l(R.drawable.msg_admins, LocaleController.getString(z32 ? R.string.EditAdminRights : R.string.SetAsAdmin), new lj0(kkVar, 27), z13);
                    H.l(R.drawable.msg_permissions, LocaleController.getString(R.string.ChangePermissions), new org.telegram.ui.Components.i30(this, channelParticipant2, chatParticipant, user, kkVar, 26), z17);
                    H.m(R.drawable.msg_remove, new yl0(27, this, chatParticipant), LocaleController.getString(R.string.KickFromGroup), z23, true);
                    H.S = 190;
                    H.Z();
                    return z33;
                }
            } else if (chatParticipant.user_id != getUserConfig().getClientUserId()) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", chatParticipant.user_id);
                bundle.putBoolean("preload_messages", true);
                presentFragment(new ProfileActivity(bundle, null));
                return true;
            }
        }
        return false;
    }

    public final float h4() {
        if (this.S == null) {
            return 0.0f;
        }
        return this.S.getVisibilityFactor() * AndroidUtilities.dp(22.0f);
    }

    public final void h5() {
        fi.v3 v3Var = this.r6;
        if (v3Var == null) {
            return;
        }
        v3Var.m(0.0f, (this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX() + (-v3Var.getPaddingLeft()));
        float lerp = AndroidUtilities.lerp(this.m2, this.l2);
        this.r6.setTranslationY(((this.f.getY() + (-r2.getPaddingBottom())) - AndroidUtilities.dp(24.0f)) + AndroidUtilities.lerp(AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(12.0f), lerp));
        this.r6.h(i0.a.f(lerp, this.s6, 1342177280));
        boolean z10 = this.Q1 >= ((float) AndroidUtilities.dp(82.0f));
        Boolean bool = this.t6;
        if (bool == null || bool.booleanValue() != z10) {
            ViewPropertyAnimator animate = this.r6.animate();
            this.t6 = Boolean.valueOf(z10);
            org.telegram.messenger.vh.q(animate.alpha(z10 ? 1.0f : 0.0f), org.telegram.ui.Components.ds.g, 200L);
        }
    }

    public final int i4() {
        if (this.q1) {
            return 0;
        }
        if (this.f1 == 0 || !ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.f1)))) {
            return AndroidUtilities.dp(50.0f);
        }
        return AndroidUtilities.dp(q4() ? 24.0f : 38.0f);
    }

    public final void i5() {
        if (getParentActivity() == null || this.V0 == null) {
            return;
        }
        if (getUserConfig().isPremium()) {
            this.V0.setIcon(R.drawable.menu_profile_colors);
            return;
        }
        Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.F8, this.z0), PorterDuff.Mode.SRC_IN));
        this.O6 = drawable;
        Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
        drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.V0.setIcon(new di.o2(drawable, drawable2, AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f)));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.p2;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        int bgColor2;
        if (this.p2) {
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.q()) {
            bgColor2 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.w8, this.z0);
        } else if (this.L5) {
            bgColor2 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, this.z0);
        } else {
            MessagesController.PeerColor peerColor = this.X5;
            bgColor2 = peerColor != null ? peerColor.getBgColor2(org.telegram.ui.ActionBar.y6.I.q()) : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.s8, this.z0);
        }
        return i0.a.h(bgColor2) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r3.contains((int) r7.getX(), ((int) r7.getY()) - r6.actionBar.getMeasuredHeight()) != false) goto L20;
     */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        vz0 vz0Var;
        zy0 zy0Var = this.n0;
        Rect rect = this.L2;
        if (zy0Var != null && zy0Var.getVisibility() == 0 && this.n0.getRealCount() > 1) {
            this.n0.getHitRect(rect);
            if (motionEvent != null) {
            }
        }
        if (this.P4 != -1 && (vz0Var = this.N) != null) {
            if (vz0Var.F0()) {
                this.N.getHitRect(rect);
                if (motionEvent == null || rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
                    vz0 vz0Var2 = this.N;
                    return vz0Var2.getSelectedTab() == vz0Var2.K0.getFirstTabId();
                }
            }
            return false;
        }
        return true;
    }

    public final org.telegram.ui.Components.cs j4() {
        if (this.I == null) {
            this.x = org.telegram.ui.ActionBar.y6.Q1.getConstantState().newDrawable().mutate();
            this.H = org.telegram.ui.ActionBar.y6.R1.getConstantState().newDrawable().mutate();
            MessagesController.PeerColor peerColor = this.X5;
            if (peerColor != null) {
                int b10 = org.telegram.ui.ActionBar.y6.b(0.1f, org.telegram.ui.ActionBar.y6.I.q() ? -0.1f : -0.08f, peerColor.hasColor6(org.telegram.ui.ActionBar.y6.I.q()) ? this.X5.getColor5() : this.X5.getColor3());
                Drawable drawable = this.x;
                int offsetColor = AndroidUtilities.getOffsetColor(b10, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oi, this.z0), this.K5, 1.0f);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(offsetColor, mode);
                this.H.setColorFilter(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, this.z0), this.K5, 1.0f), mode);
            }
            this.I = new org.telegram.ui.Components.cs(new org.telegram.ui.Components.ar(this.x, this.H), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return this.I;
    }

    public final void j5() {
        k5(this.W5);
    }

    public final boolean k4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i10 = 0;
        if (!this.r2 || (userFull = this.v2) == null || (botInfo = userFull.bot_info) == null) {
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

    public final void k5(float f7) {
        MessagesController.PeerColor peerColor = this.X5;
        int f10 = peerColor != null ? i0.a.f(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.y6.I.q()), -1) : AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zh, this.z0), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oi, this.z0), this.K5, 1.0f);
        int f11 = i0.a.f(f7, f10, -1);
        int i10 = org.telegram.ui.ActionBar.y6.Oi;
        int f12 = i0.a.f(this.K5, f11, org.telegram.ui.ActionBar.y6.w0(i10, this.z0));
        org.telegram.ui.Components.r5 r5Var = this.F;
        if (r5Var != null) {
            r5Var.k(Integer.valueOf(f12));
        }
        org.telegram.ui.Components.r5 r5Var2 = this.G;
        if (r5Var2 != null) {
            r5Var2.k(Integer.valueOf(i0.a.f(this.K5, i0.a.f(f7, f10, -1711276033), org.telegram.ui.ActionBar.y6.w0(i10, this.z0))));
        }
        this.d0.setColor(f12);
        this.W5 = f7;
    }

    public final void l4() {
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        this.n2 = point.x > point.y;
    }

    public final void l5() {
        this.d0.setScaleX(this.f.getScaleX());
        this.d0.setScaleY(this.f.getScaleY());
        this.d0.b((this.f.getScaleX() * this.f.getRightDrawableX()) + this.f.getX(), (this.f.getHeight() - (this.f.getScaleY() * (this.f.getHeight() - this.f.getRightDrawableY()))) + this.f.getY());
    }

    public final boolean m4() {
        return this.e1 != 0 && getMessagesController().getAgentController().isAgentBot(this.e1);
    }

    public final void m5() {
        if (this.q1 || !ChatObject.isForum(this.E2)) {
            return;
        }
        getNotificationsController().loadTopicsNotificationsExceptions(-this.f1, new Consumer() { // from class: org.telegram.ui.ly0
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void x(Object obj) {
                ProfileActivity profileActivity = ProfileActivity.this;
                HashSet hashSet = profileActivity.n5;
                ArrayList arrayList = new ArrayList((HashSet) obj);
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    if (profileActivity.getMessagesController().getTopicsController().findTopic(profileActivity.f1, ((Integer) arrayList.get(i10)).intValue()) == null) {
                        arrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                hashSet.clear();
                hashSet.addAll(arrayList);
                profileActivity.r5(true);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$-CC.$default$andThen(this, consumer);
            }
        });
    }

    public final boolean n4() {
        return this.E2 != null ? getMessagesController().isChatNoForwards(this.E2) : getMessagesController().isUserNoForwards(this.v2);
    }

    public final void n5(float f7) {
        k01 k01Var;
        ValueAnimator valueAnimator;
        if (this.p2 || ((k01Var = this.M) != null && (valueAnimator = k01Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.M.getLayoutParams();
            layoutParams.width = this.a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f7);
            this.M.requestLayout();
        }
        x01 x01Var = this.d1;
        if (x01Var != null) {
            x01Var.E.setTranslate(0.0f, this.a2 - x01Var.x);
            x01 x01Var2 = this.d1;
            RadialGradient radialGradient = x01Var2.y;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(x01Var2.E);
            }
            this.d1.invalidate();
        }
        l5();
        e5();
        q5();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean needDelayOpenAnimation() {
        return this.J1 == 0;
    }

    public final boolean o4() {
        return (this.q0 == null || this.s1) ? false : true;
    }

    public final void o5() {
        TLRPC.User user;
        if (!this.s1 || this.X0 == null || this.W0 == null || (user = getMessagesController().getUser(Long.valueOf(this.e1))) == null) {
            return;
        }
        boolean z10 = UserObject.getPublicUsername(user) != null;
        this.X0.setIcon(z10 ? R.drawable.menu_username_change : R.drawable.menu_username_set);
        this.X0.setText(LocaleController.getString(z10 ? R.string.ProfileUsernameEdit : R.string.ProfileUsernameSet));
        this.W0.setVisibility(UserObject.getPublicUsername(user) == null ? 8 : 0);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.g50 g50Var = this.q0;
        if (g50Var != null) {
            g50Var.h(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ut0 ut0Var;
        if (super.onBackPressed(z10)) {
            vz0 vz0Var = this.N;
            if (vz0Var == null || (ut0Var = vz0Var.K0) == null || !ut0Var.n0) {
                if (this.P4 == -1 || vz0Var == null || !vz0Var.E1) {
                    return this.actionBar.isEnabled();
                }
                if (z10) {
                    vz0Var.S(true);
                }
            } else if (z10) {
                c5();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.L;
        if (undoView != null) {
            undoView.d(0, true);
        }
        super.onBecomeFullyHidden();
        this.e6 = false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        C5();
        this.e6 = true;
        N3();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        org.telegram.ui.Components.ui0 ui0Var;
        org.telegram.ui.Components.bi0 bi0Var;
        super.onConfigurationChanged(configuration);
        vz0 vz0Var = this.N;
        if (vz0Var != null) {
            vz0Var.onConfigurationChanged(configuration);
        }
        l4();
        if (this.n2 && (bi0Var = this.Z) != null) {
            bi0Var.i();
        }
        if (this.n2 && (ui0Var = this.b0) != null) {
            ui0Var.c();
        }
        if (this.n2 && this.p2 && (m10 = this.c.m(0)) != null) {
            this.a.scrollBy(0, m10.getTop() - c4());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new i7(this, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0816  */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.w0 w0Var;
        boolean z11;
        b11 b11Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        Object obj;
        org.telegram.ui.ActionBar.z zVar;
        org.telegram.ui.ActionBar.w0 j10;
        long j11;
        boolean z12;
        TLRPC.Chat chat;
        tw twVar;
        if (!this.I0) {
            v5();
            if (this.J1 != 0 && this.M1 && !this.p2 && !this.N1) {
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
                org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
                int i10 = 2;
                if (j5Var != null && j5Var.getFragmentStack().size() >= 2) {
                    Object obj2 = (org.telegram.ui.ActionBar.r2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    if (obj2 instanceof org.telegram.ui.Components.bh) {
                        this.m5 = (org.telegram.ui.Components.bh) obj2;
                    }
                    if ((obj2 instanceof cy) && (twVar = ((cy) obj2).G3) != null) {
                        ax axVar = twVar.a;
                        if (c3.h0.t(axVar)) {
                            this.m5 = axVar;
                        }
                    }
                }
                Object obj3 = this.m5;
                if (obj3 instanceof un) {
                    kVar = ((org.telegram.ui.ActionBar.r2) obj3).getActionBar();
                    kVar.setSkipDrawChild(true);
                } else {
                    kVar = null;
                }
                org.telegram.ui.Components.bh bhVar = this.m5;
                boolean z13 = (bhVar instanceof un) && ((un) bhVar).e != null;
                if (bhVar != null) {
                    ImageView imageView5 = this.i0;
                    if (imageView5 != null) {
                        if (!(bhVar instanceof un) || (chat = ((un) bhVar).e) == null || chat.linked_community_id == 0) {
                            imageView5.setTag(null);
                            this.i0.setVisibility(8);
                        } else {
                            imageView5.setTag(1);
                            this.i0.setVisibility(0);
                        }
                    }
                    if (this.l0 != null) {
                        org.telegram.ui.Components.bh bhVar2 = this.m5;
                        if ((bhVar2 instanceof un) && ChatObject.isMonoForum(((un) bhVar2).e)) {
                            this.h0.setTag(null);
                            this.h0.setVisibility(8);
                        } else {
                            TLRPC.EncryptedChat encryptedChat = this.D2;
                            if (encryptedChat != null) {
                                this.l0.b(encryptedChat.ttl);
                                this.h0.setTag(1);
                                this.h0.setVisibility(0);
                            } else {
                                TLRPC.UserFull userFull = this.v2;
                                if (userFull != null) {
                                    this.l0.b(userFull.ttl_period);
                                    if (!this.K1 || this.v2.ttl_period == 0) {
                                        this.h0.setTag(null);
                                        this.h0.setVisibility(8);
                                    } else {
                                        this.h0.setTag(1);
                                        this.h0.setVisibility(0);
                                    }
                                } else {
                                    TLRPC.ChatFull chatFull = this.u2;
                                    if (chatFull != null) {
                                        this.l0.b(chatFull.ttl_period);
                                        if (!this.K1 || this.u2.ttl_period == 0) {
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
                    w5();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(this.J1 == 2 ? 250L : 180L);
                this.a.setLayerType(2, null);
                org.telegram.ui.ActionBar.z l4 = this.actionBar.l();
                if (l4.j(10) == null && this.P0 == null) {
                    this.P0 = l4.a(10, R.drawable.ic_ab_other);
                }
                if (z10) {
                    this.V5 = 0.0f;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.r.getLayoutParams();
                    w0Var = null;
                    layoutParams.rightMargin = (int) ((AndroidUtilities.density * (-21.0f)) + AndroidUtilities.dp(8.0f));
                    this.r.setLayoutParams(layoutParams);
                    if (this.J1 != 2) {
                        j11 = 0;
                        int ceil = (int) Math.ceil((AndroidUtilities.density * 21.0f) + (AndroidUtilities.displaySize.x - AndroidUtilities.dp(117.0f)));
                        float measureText = (this.f.getPaint().measureText(this.f.getText().toString()) * 1.12f) + this.f.getSideDrawablesSize();
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                        if (ceil < measureText) {
                            layoutParams2.width = (int) Math.ceil(r4 / 1.12f);
                        } else {
                            layoutParams2.width = -2;
                        }
                        this.f.setLayoutParams(layoutParams2);
                        this.R1 = c4();
                    } else {
                        j11 = 0;
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                        layoutParams3.width = (int) ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(32.0f)) / 1.38f);
                        this.f.setLayoutParams(layoutParams3);
                    }
                    this.fragmentView.setBackgroundColor(0);
                    setAvatarAnimationProgress(0.0f);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 0.0f, 1.0f));
                    org.telegram.ui.Components.ak0 ak0Var = this.s;
                    if (ak0Var != null && ak0Var.getTag() == null) {
                        this.s.setScaleX(0.2f);
                        this.s.setScaleY(0.2f);
                        this.s.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ak0, Float>) View.SCALE_X, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ak0, Float>) View.SCALE_Y, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ak0, Float>) View.ALPHA, 1.0f));
                    }
                    bz0 bz0Var = this.u0;
                    if (bz0Var != null && this.J1 == 2) {
                        bz0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.u0, (Property<bz0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.J1 == 2) {
                        this.r0 = Y3(this.e0.getImageReceiver());
                        this.f.setTextColor(-1);
                        this.r.setTextColor(-1275068417);
                        this.actionBar.x(1090519039, false);
                        v01 v01Var = this.p6;
                        if (v01Var != null) {
                            v01Var.a(603979775);
                        }
                        k01 k01Var = this.M;
                        k01Var.E = true;
                        k01Var.setVisibility(0);
                    }
                    if (this.J1 == 2) {
                        this.f.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<fl, Float>) View.ALPHA, 1.0f));
                    } else {
                        this.f.setAlpha(1.0f);
                    }
                    if (this.u0 != null) {
                        if (a() > j11) {
                            this.u0.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.u0, (Property<bz0, Float>) View.ALPHA, 1.0f));
                        } else {
                            this.u0.setAlpha(1.0f);
                            this.u0.setFragmentTransitionProgress(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.u0, "fragmentTransitionProgress", 1.0f));
                        }
                    }
                    bi.i1 i1Var = this.v0;
                    if (i1Var != null) {
                        i1Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.v0, (Property<bi.i1, Float>) View.ALPHA, 1.0f));
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
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.P0;
                    if (w0Var3 != null) {
                        w0Var3.setAlpha(1.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.L0 && (this.f1 != j11 || z13)) {
                        this.Q0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.M0) {
                        this.R0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.N0) {
                        this.S0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.Y0.getTag() != null) {
                        this.Y0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.Y0, (Property<ImageView, Float>) View.ALPHA, 1.0f));
                    }
                    yy0 yy0Var = this.e0;
                    if (yy0Var != null) {
                        yy0Var.setCrossfadeProgress(1.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.e0, wz0.g0, 0.0f));
                    }
                    org.telegram.ui.Components.bh bhVar3 = this.m5;
                    if (bhVar3 != null) {
                        org.telegram.ui.Components.po o10 = bhVar3.o();
                        if (o10 != null) {
                            org.telegram.ui.Components.lo loVar = o10.e;
                            org.telegram.ui.Components.vw0 A = this.m5.A();
                            RectF rectF = jh.k.h;
                            jh.k.c(loVar, A, rectF);
                            this.V5 = rectF.left;
                        }
                        if ((o10 == null || !(o10.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.b6) || ((org.telegram.ui.ActionBar.b6) o10.getSubtitleTextView()).getLeftDrawable() == null) && !o10.S[0]) {
                            z12 = false;
                        } else {
                            this.c5 = o10.getSubtitleTextView();
                            this.Y.invalidate();
                            this.r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<az0, Float>) View.ALPHA, 1.0f));
                            z12 = true;
                        }
                        setAvatarAnimationProgress(0.0f);
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        if (this.J1 == 2) {
                            this.r.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.r, (Property<az0, Float>) View.ALPHA, 1.0f));
                        } else {
                            this.r.setAlpha(1.0f);
                        }
                    }
                    animatorSet.playTogether(arrayList);
                } else {
                    w0Var = null;
                    this.R1 = this.Q1;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 1.0f, 0.0f));
                    org.telegram.ui.Components.ak0 ak0Var2 = this.s;
                    if (ak0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(ak0Var2, (Property<org.telegram.ui.Components.ak0, Float>) View.SCALE_X, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ak0, Float>) View.SCALE_Y, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.ak0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.J1 == 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f, (Property<fl, Float>) View.ALPHA, 0.0f));
                    }
                    bz0 bz0Var2 = this.u0;
                    if (bz0Var2 != null) {
                        if (this.i1 > 0) {
                            arrayList2.add(ObjectAnimator.ofFloat(bz0Var2, (Property<bz0, Float>) View.ALPHA, 0.0f));
                        } else {
                            arrayList2.add(ObjectAnimator.ofFloat(bz0Var2, "fragmentTransitionProgress", 0.0f));
                        }
                    }
                    bi.i1 i1Var2 = this.v0;
                    if (i1Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(i1Var2, (Property<bi.i1, Float>) View.ALPHA, 0.0f));
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
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.P0;
                    if (w0Var4 != null) {
                        w0Var4.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.P0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.L0 && (this.f1 != 0 || z13)) {
                        this.Q0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.M0) {
                        this.R0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.N0) {
                        this.S0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 0.0f));
                    }
                    ImageView imageView6 = this.Y0;
                    if (imageView6 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) View.ALPHA, imageView6.getAlpha(), 0.0f));
                    }
                    yy0 yy0Var2 = this.e0;
                    if (yy0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(yy0Var2, wz0.g0, 1.0f));
                    }
                    org.telegram.ui.ActionBar.r2 r2Var = this.parentLayout.getFragmentStack().size() > 1 ? (org.telegram.ui.ActionBar.r2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) : null;
                    if (r2Var instanceof un) {
                        un unVar = (un) r2Var;
                        ij ijVar = unVar.m1;
                        AndroidUtilities.doOnPreDraw(ijVar, new oe0(this, ijVar, unVar, 27));
                        View subtitleTextView = ijVar.getSubtitleTextView();
                        if (((subtitleTextView instanceof org.telegram.ui.ActionBar.b6) && ((org.telegram.ui.ActionBar.b6) subtitleTextView).getLeftDrawable() != null) || ijVar.S[0]) {
                            this.c5 = ijVar.getSubtitleTextView();
                            this.Y.invalidate();
                            arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<az0, Float>) View.ALPHA, 0.0f));
                            z11 = true;
                            if (!z11 && this.J1 == 2) {
                                arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<az0, Float>) View.ALPHA, 0.0f));
                            }
                            animatorSet.playTogether(arrayList2);
                            b11Var = this.q6;
                            if (b11Var != null) {
                                b11Var.animate().alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.ds.h).start();
                            }
                        }
                    }
                    z11 = false;
                    if (!z11) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.r, (Property<az0, Float>) View.ALPHA, 0.0f));
                    }
                    animatorSet.playTogether(arrayList2);
                    b11Var = this.q6;
                    if (b11Var != null) {
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new by0(this, i10));
                animatorSet.playTogether(ofFloat);
                if (this.O0 == null || (obj = this.m5) == null || (zVar = ((org.telegram.ui.ActionBar.r2) obj).getActionBar().E) == null || (j10 = zVar.j(32)) == null || j10.getVisibility() != 0) {
                    w0Var2 = w0Var;
                } else {
                    j10.setAlpha(0.0f);
                    if (z10) {
                        this.O0.setVisibility(0);
                    }
                    this.O0.setTag(j10);
                    w0Var2 = j10;
                }
                animatorSet.addListener(new ig.k0(this, kVar, w0Var2, runnable, 5));
                animatorSet.setInterpolator(this.J1 == 2 ? org.telegram.ui.Components.ds.f : new DecelerateInterpolator());
                AndroidUtilities.runOnUIThread(new zt0(animatorSet, 4), 50L);
                return animatorSet;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onDialogDismiss(Dialog dialog) {
        py0 py0Var = this.a;
        if (py0Var != null) {
            py0Var.g1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0468  */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        long clientUserId;
        org.telegram.ui.Components.sv0 sv0Var;
        j01 j01Var;
        this.e1 = this.arguments.getLong("user_id", 0L);
        this.f1 = this.arguments.getLong("chat_id", 0L);
        this.g1 = this.arguments.getLong("topic_id", 0L);
        this.h1 = this.arguments.getBoolean("saved", false);
        this.r1 = this.arguments.getBoolean("similar", false);
        this.q1 = this.g1 != 0;
        this.E1 = this.arguments.getLong("ban_chat_id", 0L);
        this.f5 = this.arguments.getInt("report_reaction_message_id", 0);
        this.g5 = this.arguments.getLong("report_reaction_from_dialog_id", 0L);
        this.i5 = this.arguments.getBoolean("show_add_to_contacts", true);
        this.j5 = kf.b.d(this.arguments.getString("vcard_phone"), false);
        this.k5 = this.arguments.getString("vcard_first_name");
        this.l5 = this.arguments.getString("vcard_last_name");
        this.l1 = this.arguments.getBoolean("reportSpam", false);
        this.s1 = this.arguments.getBoolean("my_profile", false);
        this.t1 = this.arguments.getBoolean("open_gifts", false);
        this.v1 = this.arguments.getBoolean("open_gifts_upgradable", false);
        this.u1 = this.arguments.getInt("open_gifts_collection", 0);
        this.x1 = this.arguments.getBoolean("open_common", false);
        this.y1 = this.arguments.getInt("open_story_album_id", -1);
        this.I0 = this.arguments.getBoolean("hasMainTabs", false);
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
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f1));
                this.E2 = chat;
                if (chat == null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    getMessagesStorage().getStorageQueue().postRunnable(new fy0(1, this, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (this.E2 != null) {
                        getMessagesController().putChat(this.E2, true);
                    }
                }
                FlagSecureReason flagSecureReason = this.X1;
                if (flagSecureReason != null) {
                    flagSecureReason.invalidate();
                }
                if (this.E2.megagroup) {
                    a4(true);
                } else {
                    this.C1 = null;
                }
                getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
                getNotificationCenter().addObserver(this, NotificationCenter.chatOnlineCountDidLoad);
                getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.uploadStoryEnd);
                this.C2 = new ArrayList();
                s5(true);
                if (this.u2 == null) {
                    this.u2 = getMessagesController().getChatFull(this.f1);
                }
                if (ChatObject.isChannel(this.E2)) {
                    getMessagesController().loadFullChat(this.f1, this.classGuid, true);
                } else if (this.u2 == null) {
                    this.u2 = getMessagesStorage().loadChatInfo(this.f1, false, null, false, false);
                }
                m5();
                clientUserId = getUserConfig().getClientUserId();
                if (this.e1 != clientUserId) {
                }
                this.s1 = true;
                sv0Var = this.Q;
                if (sv0Var != null) {
                    sv0Var.b(this);
                    this.Q = null;
                }
                if (this.Q == null) {
                }
                this.Q.x.add(this);
                getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
                getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
                getNotificationCenter().addObserver(this, NotificationCenter.closeChats);
                getNotificationCenter().addObserver(this, NotificationCenter.closeProfileActivity);
                getNotificationCenter().addObserver(this, NotificationCenter.topicsDidLoaded);
                getNotificationCenter().addObserver(this, NotificationCenter.updateSearchSettings);
                getNotificationCenter().addObserver(this, NotificationCenter.reloadDialogPhotos);
                getNotificationCenter().addObserver(this, NotificationCenter.storiesUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.storiesReadUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
                getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.botStarsUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.agentSettingsUpdated);
                if (m4()) {
                }
                getNotificationCenter().addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
                getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
                getNotificationCenter().addObserver(this, NotificationCenter.channelRecommendationsLoaded);
                getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
                getNotificationCenter().addObserver(this, NotificationCenter.profileMusicUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.updatedChatRanks);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                v5();
                j01Var = this.d;
                if (j01Var != null) {
                }
                if (this.arguments.containsKey("preload_messages")) {
                }
                if (this.e1 != 0) {
                    getConnectionsManager().sendRequest(new TL_account.getPassword(), new ey0(this, 5));
                }
                setBulletinDelegate(new d9(this, 9));
                if (this.e1 != 0) {
                    getMessagesController().getContentSettings(null);
                }
                Q4();
                this.x6 = !this.I0 ? AndroidUtilities.dp(72.0f) : 0;
                this.y6 = this.I0 ? AndroidUtilities.dp(64.0f) : 0;
                return true;
            }
            return false;
        }
        long j10 = this.arguments.getLong("dialog_id", 0L);
        this.i1 = j10;
        if (j10 != 0) {
            this.D2 = org.telegram.messenger.t.m(getMessagesController(), this.i1);
        }
        FlagSecureReason flagSecureReason2 = this.X1;
        if (flagSecureReason2 != null) {
            flagSecureReason2.invalidate();
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e1));
        if (user != null) {
            getNotificationCenter().addObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().addObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().addObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.reloadInterface);
            this.k1 = getMessagesController().blockePeers.indexOfKey(this.e1) >= 0;
            if (user.bot) {
                this.r2 = true;
                MediaDataController mediaDataController = getMediaDataController();
                long j11 = user.id;
                mediaDataController.loadBotInfo(j11, j11, true, this.classGuid);
            }
            this.v2 = getMessagesController().getUserFull(this.e1);
            getMessagesController().loadFullUser(getMessagesController().getUser(Long.valueOf(this.e1)), this.classGuid, true);
            this.C1 = null;
            if (UserObject.isUserSelf(user)) {
                org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(0, true, true);
                this.q0 = g50Var;
                g50Var.H = true;
                g50Var.a = this;
                g50Var.b = this;
                getMediaDataController().checkFeaturedStickers();
                getMessagesController().loadSuggestedFilters();
                getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, this.classGuid);
            }
            this.d5 = this.arguments.getInt("actionBarColor", 0);
            clientUserId = getUserConfig().getClientUserId();
            if ((this.e1 != clientUserId || this.i1 == clientUserId) && !this.s1) {
                this.s1 = true;
            }
            sv0Var = this.Q;
            if (sv0Var != null && sv0Var.s != this.g1) {
                sv0Var.b(this);
                this.Q = null;
            }
            if (this.Q == null) {
                this.Q = new org.telegram.ui.Components.sv0(this);
            }
            this.Q.x.add(this);
            getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
            getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
            getNotificationCenter().addObserver(this, NotificationCenter.closeChats);
            getNotificationCenter().addObserver(this, NotificationCenter.closeProfileActivity);
            getNotificationCenter().addObserver(this, NotificationCenter.topicsDidLoaded);
            getNotificationCenter().addObserver(this, NotificationCenter.updateSearchSettings);
            getNotificationCenter().addObserver(this, NotificationCenter.reloadDialogPhotos);
            getNotificationCenter().addObserver(this, NotificationCenter.storiesUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.storiesReadUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
            getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.botStarsUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.agentSettingsUpdated);
            if (m4()) {
                getMessagesController().getAgentController().load();
            }
            getNotificationCenter().addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            getNotificationCenter().addObserver(this, NotificationCenter.channelRecommendationsLoaded);
            getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
            getNotificationCenter().addObserver(this, NotificationCenter.profileMusicUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.updatedChatRanks);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            v5();
            j01Var = this.d;
            if (j01Var != null) {
                j01Var.l();
            }
            if (this.arguments.containsKey("preload_messages")) {
                getMessagesController().ensureMessagesLoaded(this.e1, 0, null);
            }
            if (this.e1 != 0 && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(this.e1)))) {
                getConnectionsManager().sendRequest(new TL_account.getPassword(), new ey0(this, 5));
            }
            setBulletinDelegate(new d9(this, 9));
            if (this.e1 != 0 && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(this.e1))) && !this.s1) {
                getMessagesController().getContentSettings(null);
            }
            Q4();
            this.x6 = !this.I0 ? AndroidUtilities.dp(72.0f) : 0;
            this.y6 = this.I0 ? AndroidUtilities.dp(64.0f) : 0;
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        vz0 vz0Var = this.N;
        if (vz0Var != null) {
            vz0Var.M0();
        }
        org.telegram.ui.Components.sv0 sv0Var = this.Q;
        if (sv0Var != null) {
            sv0Var.b(this);
        }
        org.telegram.ui.Components.sv0 sv0Var2 = this.Q;
        if (sv0Var2 != null) {
            sv0Var2.x.remove(this);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        getNotificationCenter().removeObserver(this, NotificationCenter.closeProfileActivity);
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.topicsDidLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateSearchSettings);
        getNotificationCenter().removeObserver(this, NotificationCenter.reloadDialogPhotos);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesReadUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.botStarsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.agentSettingsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.channelRecommendationsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.profileMusicUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.updatedChatRanks);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        zy0 zy0Var = this.n0;
        if (zy0Var != null) {
            zy0Var.K();
        }
        org.telegram.ui.Components.ei0 ei0Var = this.m0;
        if (ei0Var != null) {
            ei0Var.e();
        }
        this.Q5 = null;
        if (this.e1 != 0) {
            getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.reloadInterface);
            getMessagesController().cancelLoadFullUser(this.e1);
        } else if (this.f1 != 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatOnlineCountDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        }
        yy0 yy0Var = this.e0;
        if (yy0Var != null) {
            yy0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.g50 g50Var = this.q0;
        if (g50Var != null) {
            g50Var.d();
        }
        dz0 dz0Var = this.b5;
        if (dz0Var != null) {
            dz0Var.b();
        }
        y01 y01Var = this.y2;
        if (y01Var != null && this.x2) {
            y01Var.b(true);
            this.y2 = null;
        }
        org.telegram.messenger.u8 u8Var = this.D5;
        if (u8Var != null) {
            this.D5 = null;
            AndroidUtilities.runOnUIThread(u8Var);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        org.telegram.ui.Components.fu0 fu0Var;
        super.onPause();
        UndoView undoView = this.L;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.g50 g50Var = this.q0;
        if (g50Var != null) {
            g50Var.i();
        }
        FlagSecureReason flagSecureReason = this.X1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        vz0 vz0Var = this.N;
        if (vz0Var == null || (fu0Var = vz0Var.V) == null) {
            return;
        }
        fu0Var.e = false;
        if (fu0Var.c != null) {
            fu0Var.a.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.g50 g50Var = this.q0;
        if (g50Var != null) {
            g50Var.j(i10, strArr, iArr);
        }
        if (i10 != 101 && i10 != 102) {
            if (i10 != 103 || this.E2 == null) {
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
                org.telegram.ui.Components.voip.g2.h(getParentActivity(), null, i10);
                return;
            } else {
                org.telegram.ui.Components.voip.g2.l(this.E2, null, getMessagesController().getGroupCall(this.f1, false) == null, null, getParentActivity(), this, getAccountInstance());
                return;
            }
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e1));
        if (user == null) {
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
            org.telegram.ui.Components.voip.g2.h(getParentActivity(), null, i10);
            return;
        }
        boolean z12 = i10 == 102;
        TLRPC.UserFull userFull = this.v2;
        org.telegram.ui.Components.voip.g2.m(user, z12, userFull != null && userFull.video_calls_available, getParentActivity(), this.v2, getAccountInstance());
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        TLRPC.User user;
        z10 z10Var;
        super.onResume();
        vz0 vz0Var = this.N;
        if (vz0Var != null) {
            vz0Var.d1 = true;
            org.telegram.ui.Components.eu0 eu0Var = vz0Var.J;
            if (eu0Var != null) {
                eu0Var.l();
            }
            org.telegram.ui.Components.nv0 nv0Var = vz0Var.M;
            if (nv0Var != null) {
                nv0Var.l();
            }
            org.telegram.ui.Components.ov0 ov0Var = vz0Var.L;
            if (ov0Var != null) {
                ov0Var.X(false);
            }
            for (int i10 = 0; i10 < vz0Var.m0.length; i10++) {
                vz0Var.b0(i10);
            }
            org.telegram.ui.Components.fu0 fu0Var = vz0Var.V;
            if (fu0Var != null) {
                fu0Var.e = true;
                if (fu0Var.c != null) {
                    fu0Var.a.onResume();
                }
            }
        }
        l4();
        j01 j01Var = this.d;
        if (j01Var != null) {
            this.Z4 = true;
            j01Var.l();
        }
        if (!((ActionBarLayout) this.parentLayout).x() && (z10Var = this.T) != null && z10Var.getVisibility() == 0) {
            this.T.setVisibility(8);
            this.T.setBackground(null);
        }
        org.telegram.ui.Components.g50 g50Var = this.q0;
        if (g50Var != null) {
            g50Var.k();
            setParentActivityTitle(LocaleController.getString(R.string.Settings));
        }
        u5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new i7(this, 7));
        }
        fl flVar = this.f;
        if (flVar != null) {
            setParentActivityTitle(flVar.getText());
        }
        if (this.e1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.e1))) != null && user.photo == null && this.Q1 >= c4()) {
            this.j2.cancel();
            float[] fArr = this.m2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            R4(1.0f);
            this.n0.setVisibility(8);
            this.Q1 = c4();
            this.o2 = false;
            this.c.h1(0, c4() - this.a.getPaddingTop());
        }
        FlagSecureReason flagSecureReason = this.X1;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        o5();
        r4(false);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.C6.a(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, this.z0));
            this.y0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.i6, this.z0));
            d5();
            y5();
            E3();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (!z11) {
                int i10 = this.J1;
                if (i10 != 0 && this.M1) {
                    if (i10 == 1) {
                        this.k2 = 0.0f;
                        org.telegram.ui.Components.ox0 ox0Var = this.S;
                        if (ox0Var != null) {
                            ox0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.bi0 bi0Var = this.Z;
                        if (bi0Var != null) {
                            bi0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.ui0 ui0Var = this.b0;
                        if (ui0Var != null) {
                            ui0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    I3();
                    if (this.I1) {
                        L3(true);
                    }
                }
                if (!this.r5) {
                    this.r5 = true;
                    this.a5 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().onAnimationFinish(this.V4);
            z10 z10Var = this.T;
            if (z10Var != null && z10Var.getVisibility() == 0) {
                this.T.setVisibility(8);
                this.T.setBackground(null);
            }
        }
        this.H1 = false;
        J3();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        z10 z10Var = this.T;
        if (z10Var == null || z10Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.T.setAlpha(1.0f - f7);
        } else {
            this.T.setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        ImageView imageView;
        org.telegram.ui.Components.bi0 bi0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.T5 = z10;
        if (z10 && (bi0Var = this.Z) != null) {
            ArrayList arrayList = bi0Var.a;
            if (bi0Var.H == 6) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.ui.Components.yh0 yh0Var = (org.telegram.ui.Components.yh0) arrayList.get(i10);
                    org.telegram.ui.Components.xj0 xj0Var = yh0Var.k;
                    if (xj0Var != null) {
                        if (yh0Var.a == 15) {
                            xj0Var.M(14);
                        } else {
                            xj0Var.M(0);
                        }
                        yh0Var.k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.O0) != null && imageView.getTag() != null && (this.O0.getTag() instanceof org.telegram.ui.ActionBar.w0)) {
            ((org.telegram.ui.ActionBar.w0) this.O0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.J1 != 0 && this.M1 && !this.p2) {
            this.G1 = true;
            if (!z10) {
                if (this.Q5 == null) {
                    this.Q5 = new float[14];
                }
                this.F1 = this.Q1;
                this.Q5[0] = this.X.getScaleX();
                this.Q5[1] = this.X.getTranslationX();
                this.Q5[2] = this.X.getTranslationY();
                org.telegram.ui.Components.bi0 bi0Var2 = this.Z;
                if (bi0Var2 != null) {
                    this.Q5[3] = bi0Var2.getAlpha();
                }
                bi.i1 i1Var = this.v0;
                if (i1Var != null) {
                    float[] fArr = this.Q5;
                    fArr[4] = i1Var.e;
                    fArr[5] = i1Var.f;
                }
                if (this.p6 != null) {
                    this.Q5[6] = r0.getAlpha();
                }
                this.Q5[7] = this.f.getScaleX();
                this.Q5[8] = this.f.getTranslationY();
                this.Q5[9] = this.r.getTranslationY();
                this.Q5[10] = this.f.getLayoutParams().width;
                float[] fArr2 = this.Q5;
                fArr2[11] = this.c2;
                fArr2[12] = this.f.getTranslationX();
                this.Q5[13] = this.r.getTranslationX();
                fi.v3 v3Var = this.r6;
                if (v3Var != null) {
                    v3Var.e(true);
                }
            }
        }
        if (z10) {
            if (this.q0 != null) {
                this.V4 = getNotificationCenter().setAnimationInProgress(this.V4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.needCheckSystemBarColors});
            } else {
                this.V4 = getNotificationCenter().setAnimationInProgress(this.V4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.needCheckSystemBarColors});
            }
            if (!z11 && getParentActivity() != null) {
                this.e5 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.H1 = true;
        J3();
    }

    public final void p4(boolean z10) {
        boolean isForum = ChatObject.isForum(this.E2);
        TLRPC.Chat chat = this.E2;
        org.telegram.ui.Components.g5.r(this, false, chat, null, false, isForum || z10 || (chat != null && chat.creator), z10, !isForum, new wx0(this, 2));
    }

    public final void p5(boolean z10, boolean z11) {
        if (this.d == null) {
            if (z10) {
                s5(false);
            }
            v5();
            return;
        }
        if (!z11 && this.a.isInLayout()) {
            py0 py0Var = this.a;
            if (py0Var.G) {
                py0Var.post(new org.telegram.ui.Components.d60(15, this, z10));
                return;
            }
            return;
        }
        xz0 xz0Var = new xz0(this);
        xz0Var.b = this.N2;
        xz0Var.f(xz0Var.c);
        xz0Var.e.clear();
        xz0Var.f.clear();
        xz0Var.e.addAll(this.W4);
        xz0Var.f.addAll(this.X4);
        xz0Var.g = this.z4;
        xz0Var.h = this.A4;
        if (z10) {
            s5(false);
        }
        N4();
        v5();
        xz0Var.f(xz0Var.d);
        try {
            s4.p.c(xz0Var, true).c(this.d);
        } catch (Exception e) {
            FileLog.e(e);
            this.d.l();
        }
        int i10 = this.b6;
        if (i10 >= 0) {
            this.c.h1(i10, this.c6 - this.a.getPaddingTop());
        }
        AndroidUtilities.updateVisibleRows(this.a);
    }

    @Override // org.telegram.ui.Components.mu0
    public final boolean q() {
        return this.T5;
    }

    public final boolean q4() {
        return getMessagesController().getStoriesController().I(a()) && !this.q1;
    }

    public final void q5() {
        if (this.b0 == null || this.r == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        boolean z10 = this.G1;
        if (z10 && this.J1 == 2 && this.X != null) {
            this.b0.setAlpha(this.S1);
            this.b0.h(AndroidUtilities.dp(74.0f) + this.a.getMeasuredWidth(), X3() - AndroidUtilities.dp(74.0f));
            return;
        }
        if (z10) {
            this.b0.setAlpha(this.S1);
        }
        float f7 = currentActionBarHeight;
        float dp = this.Q1 + f7 + AndroidUtilities.dp(74.0f);
        float min = Math.min(X3(), dp - f7);
        this.b0.h(dp - min, min - AndroidUtilities.dp(74.0f));
    }

    public final void r4(boolean z10) {
        float f7;
        float f10;
        org.telegram.ui.Components.y9 currentItemView;
        float f11;
        float f12;
        TLRPC.ChatFull chatFull;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        float G3 = G3();
        py0 py0Var = this.a;
        if (py0Var != null && !this.G1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) py0Var.getLayoutParams();
            if (layoutParams.topMargin != currentActionBarHeight) {
                layoutParams.topMargin = currentActionBarHeight;
                this.a.setLayoutParams(layoutParams);
            }
        }
        A5(z10);
        if (this.X != null) {
            this.a.setTopGlowOffset((int) this.Q1);
            this.a.setOverScrollMode((this.Q1 <= ((float) c4()) || this.Q1 >= ((float) ((X3() + this.a.getMeasuredWidth()) - currentActionBarHeight))) ? 0 : 2);
        }
        if (this.X != null && !this.T5 && this.G1) {
            F3();
            return;
        }
        int c42 = c4();
        if (this.X != null) {
            if (this.Z != null && this.f1 != 0) {
                this.Z.o(2, (!ChatObject.isChannel(this.E2) || this.E2.megagroup || (chatFull = this.u2) == null || chatFull.linked_chat_id == 0) ? false : true);
            }
            A5(z10);
            float translationY = this.actionBar.getTranslationY() + (org.telegram.messenger.vh.a(G3, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) - AndroidUtilities.dp(21.0f));
            if (this.G1) {
                this.a2 = translationY;
            } else {
                org.telegram.ui.Components.ri0 ri0Var = this.t0;
                if (ri0Var != null) {
                    f12 = -AndroidUtilities.dp(29.0f);
                    NotchInfoUtils.NotchInfo notchInfo = ri0Var.n;
                    if (notchInfo != null && notchInfo.isLikelyCircle) {
                        f12 = notchInfo.bounds.centerY();
                    }
                } else {
                    f12 = -AndroidUtilities.dp(29.0f);
                }
                this.a2 = AndroidUtilities.lerp(f12, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f)), G3);
            }
            float f13 = this.G1 ? this.R1 : this.Q1;
            float f14 = c42;
            if (f13 > f14 || this.p2) {
                f7 = 2.0f;
                float max = Math.max(0.0f, Math.min(1.0f, (f13 - f14) / ((this.a.getMeasuredWidth() - currentActionBarHeight) - d4())));
                this.h2 = max;
                f10 = 18.0f;
                this.b2 = (AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) / 100.0f) * 42.0f;
                this.c2 = 0.0f;
                bz0 bz0Var = this.u0;
                if (bz0Var != null) {
                    bz0Var.invalidate();
                }
                bi.i1 i1Var = this.v0;
                if (i1Var != null) {
                    i1Var.invalidate();
                }
                float min = Math.min(AndroidUtilities.dpf2(2000.0f), Math.max(AndroidUtilities.dpf2(1100.0f), Math.abs(this.i2))) / AndroidUtilities.dpf2(1100.0f);
                X3();
                boolean z11 = this.o2;
                float[] fArr = this.m2;
                if (!z11 || (!this.F0 && this.h2 < 0.33f)) {
                    if (this.p2) {
                        this.p2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                        org.telegram.ui.ActionBar.w0 w0Var = this.T0;
                        if (w0Var != null) {
                            w0Var.t(21);
                            if (this.q0 != null) {
                                this.T0.t(33);
                                this.T0.t(34);
                                this.T0.t(35);
                                this.T0.S(36);
                                this.T0.S(31);
                            }
                        }
                        org.telegram.ui.ActionBar.w0 w0Var2 = this.U0;
                        if (w0Var2 != null) {
                            w0Var2.setEnabled(!this.z1);
                        }
                        this.M.f(min, false);
                        this.o0.b(min);
                        this.j2.cancel();
                        this.e0.getImageReceiver().setAllowStartAnimation(true);
                        this.e0.getImageReceiver().startAnimation();
                        float lerp = AndroidUtilities.lerp(fArr, this.l2);
                        fArr[0] = lerp;
                        fArr[1] = 0.0f;
                        this.j2.setInterpolator(org.telegram.ui.Components.ds.j);
                        if (this.n2) {
                            this.j2.setDuration(0L);
                        } else {
                            this.j2.setDuration((long) ((lerp * 250.0f) / min));
                        }
                        this.d1.setBackgroundColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, this.z0));
                        if (!this.H0 && (currentItemView = this.n0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().getDrawable() instanceof org.telegram.ui.Components.d81) {
                                this.e0.a0 = false;
                            } else {
                                yy0 yy0Var = this.e0;
                                yy0Var.a0 = true;
                                yy0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().getDrawableSafe());
                            }
                        }
                        this.j2.addListener(new mz0(this, 4));
                        this.e0.setForegroundAlpha(1.0f);
                        this.X.setVisibility(0);
                        this.n0.setAlpha(0.0f);
                        this.j2.start();
                        this.P1 = false;
                        try {
                            this.X.performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                    }
                    this.X.setScaleX(this.b2);
                    this.X.setScaleY(this.b2);
                    W3();
                    ValueAnimator valueAnimator = this.j2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        L4();
                        this.f.setTranslationY(this.e2);
                        this.r.setTranslationX(e4(this.f2, this.m6));
                        this.r.setTranslationY(f4(this.g2));
                        h5();
                    }
                } else {
                    if (!this.p2) {
                        if (this.T0 != null) {
                            if (n4()) {
                                this.T0.t(21);
                            } else {
                                this.T0.S(21);
                            }
                            if (this.q0 != null) {
                                this.T0.S(36);
                                this.T0.S(34);
                                this.T0.S(35);
                                this.T0.t(33);
                                this.T0.t(31);
                            }
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = this.U0;
                        if (w0Var3 != null) {
                            w0Var3.setEnabled(false);
                        }
                        this.p2 = true;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                        this.M.f(min, true);
                        this.o0.b(min);
                        this.n0.setCreateThumbFromParent(true);
                        this.n0.getAdapter().g();
                        this.j2.cancel();
                        float lerp2 = AndroidUtilities.lerp(fArr, this.l2);
                        fArr[0] = lerp2;
                        fArr[1] = 1.0f;
                        bz0 bz0Var2 = this.u0;
                        if (bz0Var2 == null || bz0Var2.w.isEmpty()) {
                            this.j2.setInterpolator(org.telegram.ui.Components.ds.j);
                            this.j2.setDuration((long) (((1.0f - lerp2) * 250.0f) / min));
                        } else {
                            this.j2.setInterpolator(new u1.a());
                            this.j2.setDuration((long) ((((1.0f - lerp2) * 1.3f) * 250.0f) / min));
                        }
                        this.j2.addListener(new mz0(this, 3));
                        View m10 = this.c.m(0);
                        if (!this.P1 && m10 != null) {
                            this.O1 = true;
                            this.a.x0(((m10.getTop() - this.a.getMeasuredWidth()) - X3()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0), (int) this.j2.getDuration(), (Interpolator) this.j2.getInterpolator());
                            this.a.O0 = false;
                        }
                        this.R5 = this.f.getTranslationY();
                        this.S5 = this.r.getTranslationY();
                        this.j2.start();
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
                    float f15 = currentActionBarHeight + f13;
                    int i11 = (int) f15;
                    layoutParams2.height = i11;
                    if (i10 != i11) {
                        this.n0.requestLayout();
                    }
                    if (!this.j2.isRunning()) {
                        float dp = (this.G1 && this.J1 == 2) ? (-(1.0f - this.S1)) * AndroidUtilities.dp(50.0f) : 0.0f;
                        this.f.setTranslationX(AndroidUtilities.dpf2(18.0f) - this.f.getLeft());
                        this.f.setTranslationY((((f15 - X3()) - AndroidUtilities.dpf2(30.0f)) - this.f.getBottom()) + dp);
                        this.r.setTranslationX(e4(AndroidUtilities.dpf2(16.0f) - this.r.getLeft(), 0.0f));
                        this.r.setTranslationY(f4((((f15 - X3()) - AndroidUtilities.dpf2(10.0f)) - this.r.getBottom()) + dp));
                        h5();
                    }
                }
            } else {
                f7 = 2.0f;
                f10 = 18.0f;
            }
            boolean z12 = this.G1;
            if (z12 && this.J1 == 2) {
                float f16 = this.V5;
                float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / f7) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f));
                this.f.setPivotY(r6.getMeasuredHeight());
                this.f.setScaleX(1.38f);
                this.f.setScaleY(1.38f);
                this.b2 = AndroidUtilities.lerp(42, 138, this.S1) / 100.0f;
                this.c2 = 0.0f;
                bz0 bz0Var3 = this.u0;
                if (bz0Var3 != null) {
                    bz0Var3.setExpandProgress(1.0f);
                }
                bi.i1 i1Var2 = this.v0;
                if (i1Var2 != null) {
                    i1Var2.setExpandProgress(1.0f);
                }
                this.e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(i4(), 0.0f, this.S1));
                this.X.setTranslationX(AndroidUtilities.lerp(f16, 0.0f, this.S1));
                this.X.setTranslationY(AndroidUtilities.lerp((float) Math.ceil(translationY2), 0.0f, this.S1));
                float measuredWidth = ((this.b2 * 100.0f) / 42.0f) * (this.X.getMeasuredWidth() - AndroidUtilities.dp(42.0f));
                this.h0.setTranslationX(this.X.getX() + AndroidUtilities.dp(16.0f) + measuredWidth);
                this.h0.setTranslationY(this.X.getY() + AndroidUtilities.dp(-10.0f) + measuredWidth);
                this.i0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                this.i0.setTranslationY(this.X.getY() + AndroidUtilities.dp(26.5f) + measuredWidth);
                this.j0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                this.j0.setTranslationY(this.X.getY() + AndroidUtilities.dp(24.0f) + measuredWidth);
                this.k0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                this.k0.setTranslationY(this.X.getY() + AndroidUtilities.dp(24.0f) + measuredWidth);
                this.X.setScaleX(this.b2);
                this.X.setScaleY(this.b2);
                this.n0.setAlpha(0.0f);
                this.n0.setVisibility(0);
                yy0 yy0Var2 = this.e0;
                float f17 = this.S1;
                float f18 = this.b2;
                yy0Var2.H = f17;
                yy0Var2.I = f18;
                yy0Var2.G = true;
                this.M.e(f17, false);
                this.actionBar.y(i0.a.f(this.S1, this.X5 != null ? -1 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v8, this.z0), -1), false);
                org.telegram.ui.Components.en0 en0Var = this.K;
                if (en0Var != null) {
                    en0Var.b(i0.a.f(this.S1, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h8, this.z0), Color.argb(179, 255, 255, 255)));
                }
                Drawable drawable = this.w;
                if (drawable != null) {
                    drawable.setColorFilter(this.X5 == null ? i0.a.f(this.S1, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.pc, this.z0), -1) : -1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.cs csVar = this.I;
                if (csVar != null) {
                    csVar.a(this.S1);
                    this.f.invalidate();
                }
                org.telegram.ui.Components.cs csVar2 = this.J;
                if (csVar2 != null) {
                    csVar2.a(this.S1);
                    this.f.invalidate();
                }
                k5(this.S1);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.X.getLayoutParams();
                layoutParams3.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.a.getMeasuredWidth() / this.b2, this.S1);
                layoutParams3.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.Q1 + currentActionBarHeight) / this.b2, this.S1);
                this.X.requestLayout();
                h5();
            } else if (f13 <= f14) {
                if (z12) {
                    this.b2 = AndroidUtilities.lerp(42, 96, G3) / 100.0f;
                    this.c2 = 0.0f;
                    f11 = 1.0f;
                } else {
                    org.telegram.ui.Components.ri0 ri0Var2 = this.t0;
                    this.b2 = AndroidUtilities.lerp(ri0Var2 != null ? ri0Var2.getHiddenAvatarSizeDp() : 24.0f, 96.0f, G3) / 100.0f;
                    f11 = 1.0f;
                    this.c2 = 1.0f - G3;
                }
                org.telegram.ui.Components.bi0 bi0Var = this.Z;
                if (bi0Var != null) {
                    if (this.G1) {
                        bi0Var.setAlpha(this.S1);
                    } else {
                        bi0Var.setAlpha(f11);
                    }
                }
                bz0 bz0Var4 = this.u0;
                if (bz0Var4 != null) {
                    bz0Var4.invalidate();
                }
                bi.i1 i1Var3 = this.v0;
                if (i1Var3 != null) {
                    i1Var3.h = this.G1;
                    float clamp01 = Utilities.clamp01((G3 - 0.3f) / 0.7f);
                    if (i1Var3.f != clamp01) {
                        i1Var3.f = clamp01;
                        i1Var3.invalidate();
                    }
                }
                float f19 = (0.12f * G3) + 1.0f;
                ValueAnimator valueAnimator2 = this.j2;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    this.X.setScaleX(this.b2);
                    this.X.setScaleY(this.b2);
                    W3();
                    this.X.setTranslationY((float) Math.ceil(this.a2));
                    float dp2 = (((this.b2 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
                    this.h0.setTranslationX(this.X.getX() + AndroidUtilities.dp(16.0f) + dp2);
                    this.h0.setTranslationY(this.X.getY() + AndroidUtilities.dp(-10.0f) + dp2);
                    this.i0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + dp2);
                    this.i0.setTranslationY(this.X.getY() + AndroidUtilities.dp(26.5f) + dp2);
                    this.j0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + dp2);
                    this.j0.setTranslationY(this.X.getY() + AndroidUtilities.dp(24.0f) + dp2);
                    this.k0.setTranslationX(this.X.getX() + AndroidUtilities.dp(28.0f) + dp2);
                    this.k0.setTranslationY(this.X.getY() + AndroidUtilities.dp(24.0f) + dp2);
                } else {
                    ValueAnimator valueAnimator3 = this.j2;
                    mz0 mz0Var = this.P5;
                    valueAnimator3.removeListener(mz0Var);
                    this.j2.addListener(mz0Var);
                }
                float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (this.X.getScaleY() * this.X.getHeight())) * (this.G1 ? this.S1 : G3)) + ((float) Math.floor(translationY));
                this.e2 = c3.h0.z(1.0f, this.S1, 0.0f, (AndroidUtilities.dp(7.0f) * G3) + AndroidUtilities.dp(1.3f) + dpf2);
                this.g2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * G3) + dpf2 + AndroidUtilities.dp(24.0f);
                float dp3 = this.G1 ? (this.V5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f) : -AndroidUtilities.dpf2(46.0f);
                v01 v01Var = this.p6;
                if (v01Var != null) {
                    v01Var.setAlpha((int) (255.0f * G3));
                }
                int measuredWidth2 = this.a.getMeasuredWidth();
                this.f.setScaleX(f19);
                this.f.setScaleY(f19);
                s4(0, G3, false);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                float f20 = measuredWidth2 / f7;
                float min2 = f20 - (((Math.min(this.f.getExactWidth(), layoutParams4.width) * f19) * 0.5f) + layoutParams4.leftMargin);
                float f21 = ((FrameLayout.LayoutParams) this.r.getLayoutParams()).width;
                float paddingLeft = (this.v5 || this.r.getExactWidth() > (f21 - ((float) this.r.getPaddingLeft())) - ((float) this.r.getPaddingRight())) ? 0.0f : this.r.getPaddingLeft();
                float min3 = f20 - ((Math.min(this.r.getExactWidth(), f21) * 0.5f) + (r8.leftMargin + paddingLeft));
                this.d2 = min2;
                this.f2 = min3;
                this.m6 = paddingLeft;
                float lerp3 = AndroidUtilities.lerp(dp3, min2, G3);
                float lerp4 = AndroidUtilities.lerp(dp3, min3, G3);
                ValueAnimator valueAnimator4 = this.j2;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    this.f.setTranslationX(lerp3);
                    this.f.setTranslationY(this.e2);
                    this.r.setTranslationX(e4(lerp4, this.m6 * G3));
                    this.r.setTranslationY(f4(this.g2));
                }
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i12 = layoutParams5.width;
                int min4 = Math.min(layoutParams5.width, (int) ((((AndroidUtilities.isTablet() ? AndroidUtilities.dp(490.0f) : AndroidUtilities.displaySize.x) - AndroidUtilities.dp(f10)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams5.leftMargin)));
                layoutParams5.width = min4;
                if (min4 != i12) {
                    this.f.requestLayout();
                }
                h5();
            }
            ValueAnimator valueAnimator5 = this.j2;
            if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                s4(0, G3, true);
            }
        }
        n5(currentActionBarHeight);
        if (G3 >= 1.0f) {
            this.e0.setAlpha(1.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if ((r0 - getConnectionsManager().getCurrentTime()) <= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r5 == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r5(boolean z10) {
        int i10;
        j01 j01Var;
        if (z10 && (i10 = this.N3) >= 0 && (j01Var = this.d) != null) {
            j01Var.m(i10);
        }
        org.telegram.ui.Components.bi0 bi0Var = this.Z;
        if (bi0Var == null || this.s1) {
            return;
        }
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        long j10 = this.i1;
        if (j10 == 0) {
            j10 = this.e1;
            if (j10 == 0) {
                j10 = -this.f1;
            }
        }
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, this.g1);
        boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
        boolean z11 = false;
        int d = org.telegram.messenger.t.d(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
        int d10 = org.telegram.messenger.t.d(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL, sharedPrefKey, notificationsSettings, 0);
        if (d != 3 || d10 == Integer.MAX_VALUE) {
            if (d == 0) {
                if (!contains) {
                    z11 = getNotificationsController().isGlobalNotificationsEnabled(j10, false, false);
                    bi0Var.setNotifications(z11);
                }
                z11 = true;
                bi0Var.setNotifications(z11);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.g50 g50Var = this.q0;
        if (g50Var != null) {
            g50Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.og0
    public final void s() {
        this.a.y0(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s4(int i10, float f7, boolean z10) {
        float scaleX;
        float f10;
        int i11;
        int ceil;
        ValueAnimator valueAnimator;
        if (this.Q1 > c4() || ((valueAnimator = this.j2) != null && valueAnimator.isRunning())) {
            scaleX = this.f.getScaleX();
        } else {
            if (f7 < 1.0f) {
                f10 = 1.12f;
                scaleX = 1.0f;
                int dp = !AndroidUtilities.isTablet() ? AndroidUtilities.dp(490.0f) : AndroidUtilities.displaySize.x;
                int i12 = !this.N0 ? 48 : 0;
                if (this.L0) {
                    i12 += 48;
                }
                if (this.M0) {
                    i12 += 48;
                }
                if (this.U0 != null) {
                    i12 += 48;
                }
                int dp2 = dp - AndroidUtilities.dp((((1.0f - this.K5) * i12) + 40.0f) + ((!this.G1 ? 109 : 47) + 8));
                int i13 = (int) (dp2 / (i10 == 0 ? scaleX : 1.0f));
                int C = i10 == 0 ? i10 : org.telegram.messenger.vh.C(18.0f, 2, dp);
                if (i10 == 0) {
                    i10 = (int) (C / f10);
                }
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.i;
                int lerp = AndroidUtilities.lerp(i13, i10, dsVar.getInterpolation(f7));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                int i14 = layoutParams.width;
                layoutParams.width = (int) Math.ceil(lerp);
                if (z10) {
                    layoutParams.width = Math.min(layoutParams.width, (int) (((dp - AndroidUtilities.dp(18.0f)) / this.f.getScaleX()) - (this.f.getTranslationX() + layoutParams.leftMargin)));
                }
                if (z10 && layoutParams.width != i14) {
                    this.f.requestLayout();
                }
                int lerp2 = AndroidUtilities.lerp(dp2, C, dsVar.getInterpolation(f7));
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.r.getLayoutParams();
                i11 = layoutParams2.width;
                ceil = (int) Math.ceil(lerp2);
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
        if (!AndroidUtilities.isTablet()) {
        }
        if (!this.N0) {
        }
        if (this.L0) {
        }
        if (this.M0) {
        }
        if (this.U0 != null) {
        }
        int dp22 = dp - AndroidUtilities.dp((((1.0f - this.K5) * i12) + 40.0f) + ((!this.G1 ? 109 : 47) + 8));
        int i132 = (int) (dp22 / (i10 == 0 ? scaleX : 1.0f));
        if (i10 == 0) {
        }
        if (i10 == 0) {
        }
        org.telegram.ui.Components.ds dsVar2 = org.telegram.ui.Components.ds.i;
        int lerp3 = AndroidUtilities.lerp(i132, i10, dsVar2.getInterpolation(f7));
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        int i142 = layoutParams3.width;
        layoutParams3.width = (int) Math.ceil(lerp3);
        if (z10) {
        }
        if (z10) {
            this.f.requestLayout();
        }
        int lerp22 = AndroidUtilities.lerp(dp22, C, dsVar2.getInterpolation(f7));
        FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) this.r.getLayoutParams();
        i11 = layoutParams22.width;
        ceil = (int) Math.ceil(lerp22);
        layoutParams22.width = ceil;
        if (i11 == ceil) {
        }
    }

    public final void s5(boolean z10) {
        int i10;
        TLRPC.UserStatus userStatus;
        boolean z11;
        int i11 = 0;
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
        while (i11 < this.u2.participants.participants.size()) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.u2.participants.participants.get(i11).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.id == getUserConfig().getClientUserId()) && user.status.expires > 10000)) {
                this.B2++;
            }
            this.C2.add(Integer.valueOf(i11));
            if (user != null) {
                if (user.bot) {
                    i10 = -110;
                } else if (user.self) {
                    i10 = 50000 + currentTime;
                } else {
                    TLRPC.UserStatus userStatus2 = user.status;
                    if (userStatus2 != null) {
                        i10 = userStatus2.expires;
                    }
                }
                i11 = c3.h0.i(i10, i11, 1, arrayList);
            }
            i10 = TLObject.FLAG_31;
            i11 = c3.h0.i(i10, i11, 1, arrayList);
        }
        try {
            Collections.sort(this.C2, Comparator$-EL.reversed(Comparator$-CC.comparingInt(new bf(arrayList, 1))));
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (z10 && this.d != null && this.z4 > 0) {
            AndroidUtilities.updateVisibleRows(this.a);
        }
        if (this.N == null || this.P4 == -1) {
            return;
        }
        if ((this.C2.size() > 5 || this.Y4 == 2) && this.Y4 != 1) {
            this.N.g1(this.C2, this.u2);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.g50 g50Var = this.q0;
        if (g50Var == null || (str = g50Var.f) == null) {
            return;
        }
        bundle.putString("path", str);
    }

    public void setAvatarAnimationProgress(float f7) {
        int w02;
        int w03;
        int w04;
        this.k2 = f7;
        this.S1 = f7;
        J3();
        if (this.J1 == 2) {
            this.e0.setProgressToExpand(f7);
            org.telegram.ui.Components.bi0 bi0Var = this.Z;
            if (bi0Var != null) {
                bi0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.ui0 ui0Var = this.b0;
            if (ui0Var != null) {
                ui0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.ox0 ox0Var = this.S;
            if (ox0Var != null) {
                ox0Var.setParentExpanded(f7);
            }
            e5();
            q5();
        }
        this.a.setAlpha(f7);
        this.a.setTranslationX(AndroidUtilities.dp(48.0f) - (AndroidUtilities.dp(48.0f) * f7));
        if (this.J1 != 2 || (w02 = this.r0) == 0) {
            if (this.e1 == 0 && ChatObject.isChannel(this.f1, this.currentAccount)) {
                boolean z10 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.u6 u6Var = this.z0;
            int[][] iArr = org.telegram.ui.Components.j9.L;
            w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, u6Var);
        }
        int i10 = this.d5;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.s8, this.z0);
        }
        this.d1.setBackgroundColor(i0.a.f(f7, i0.a.o(i10, 0), w02));
        org.telegram.ui.Components.e31 e31Var = this.l0;
        int f10 = i0.a.f(f7, i10, w02);
        e31Var.k = true;
        e31Var.b.setColor(f10);
        if (this.X5 != null) {
            w03 = -1;
        } else {
            if (this.e1 == 0 && ChatObject.isChannel(this.f1, this.currentAccount)) {
                boolean z11 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.u6 u6Var2 = this.z0;
            int[][] iArr2 = org.telegram.ui.Components.j9.L;
            w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.g8, u6Var2);
        }
        this.actionBar.y(i0.a.f(this.S1, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v8, this.z0), w03), false);
        int w05 = this.X5 == null ? org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.vh, this.z0) : -1;
        int w06 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A8, this.z0);
        fl flVar = this.f;
        if (flVar != null && this.J1 != 2) {
            flVar.setTextColor(i0.a.f(f7, w06, w05));
        }
        boolean[] zArr = this.J0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Bh, this.z0);
        } else {
            if (this.e1 == 0 && ChatObject.isChannel(this.f1, this.currentAccount)) {
                boolean z12 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.u6 u6Var3 = this.z0;
            int[][] iArr3 = org.telegram.ui.Components.j9.L;
            w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h8, u6Var3);
        }
        int w07 = org.telegram.ui.ActionBar.y6.w0(zArr[0] ? org.telegram.ui.ActionBar.y6.pa : org.telegram.ui.ActionBar.y6.B8, this.z0);
        az0 az0Var = this.r;
        if (az0Var != null && this.J1 != 2) {
            az0Var.setTextColor(i0.a.f(f7, w07, D3(w04, Boolean.valueOf(zArr[0]))));
        }
        this.Q1 = this.R1 * f7;
        long j10 = this.e1;
        if (j10 == 0) {
            j10 = this.f1;
        }
        org.telegram.ui.ActionBar.u6 u6Var4 = this.z0;
        int[][] iArr4 = org.telegram.ui.Components.j9.L;
        int w08 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.p8[org.telegram.ui.Components.j9.e(j10)], u6Var4);
        long j11 = this.e1;
        if (j11 == 0) {
            j11 = this.f1;
        }
        int d = org.telegram.ui.Components.j9.d(j11);
        if (w08 != d) {
            this.p0.h(i0.a.f(f7, d, w08));
            this.e0.invalidate();
        }
        int i11 = this.e5;
        if (i11 != 0) {
            setNavigationBarColor(i0.a.f(f7, i11, getNavigationBarColor()));
        }
        this.d1.invalidate();
        r4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        e01 e01Var = this.U5;
        if (e01Var != null) {
            e01Var.invalidate();
        }
        if (a() > 0) {
            yy0 yy0Var = this.e0;
            if (yy0Var != null) {
                yy0Var.setProgressToStoriesInsets(this.S1);
            }
            bz0 bz0Var = this.u0;
            if (bz0Var != null) {
                bz0Var.setProgressToStoriesInsets(this.S1);
            }
            bi.i1 i1Var = this.v0;
            if (i1Var != null) {
                i1Var.setProgressToStoriesInsets(this.S1);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void setParentLayout(org.telegram.ui.ActionBar.j5 j5Var) {
        super.setParentLayout(j5Var);
        FlagSecureReason flagSecureReason = this.X1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
            this.X1 = null;
        }
        if (j5Var == null || j5Var.getParentActivity() == null) {
            return;
        }
        this.X1 = new FlagSecureReason(j5Var.getParentActivity().getWindow(), new wx0(this, 7));
    }

    public final void t5() {
        CharSequence charSequence;
        az0 az0Var = this.r;
        if (az0Var == null) {
            return;
        }
        if (!this.k6 || (charSequence = this.j6) == null) {
            charSequence = this.i6;
        }
        boolean z10 = this.G1;
        oe.e eVar = az0Var.P0;
        CharSequence text = az0Var.getText();
        if (TextUtils.equals(text, charSequence)) {
            az0Var.l(charSequence, false);
            return;
        }
        if (z10 || !az0Var.isAttachedToWindow() || !az0Var.isLaidOut() || az0Var.getVisibility() != 0 || az0Var.getAlpha() <= 0.0f || az0Var.getWidth() <= 0 || az0Var.getHeight() <= 0 || TextUtils.isEmpty(text)) {
            az0Var.Q0 = null;
            eVar.c(1.0f);
        } else {
            Picture picture = new Picture();
            az0Var.n(picture.beginRecording(az0Var.getWidth(), az0Var.getHeight()), 1.0f, 0.0f);
            picture.endRecording();
            eVar.c(0.0f);
            az0Var.Q0 = picture;
            eVar.a(1.0f);
        }
        az0Var.invalidate();
        az0Var.l(charSequence, false);
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ boolean u() {
        return false;
    }

    public final void u4(boolean z10) {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e1));
        if (user == null) {
            return;
        }
        int i10 = 4;
        int i11 = 0;
        if (this.r2 && !MessagesController.isSupportUser(user)) {
            if (!this.k1 || z10) {
                org.telegram.ui.Components.g5.r(this, false, this.E2, user, this.D2 != null, true, false, true, new xx0(this, user));
                return;
            } else {
                getMessagesController().unblockPeer(this.e1, new fb0(this, i10));
                finishFragment();
                return;
            }
        }
        if (this.k1) {
            getMessagesController().unblockPeer(this.e1);
            if (org.telegram.ui.Components.wc.a(this)) {
                org.telegram.ui.Components.wc.d(this, false).j();
                return;
            }
            return;
        }
        if (this.l1) {
            org.telegram.ui.Components.g5.i0(this, this.e1, user, null, this.D2, false, null, new wa(this, i10), this.z0);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.z0);
        String string = LocaleController.getString(R.string.BlockUser);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = string;
        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new wx0(this, i11));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, this.z0);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(73:32|(1:286)(1:36)|(1:38)(1:285)|39|(3:41|(1:43)(1:283)|44)(1:284)|45|(1:47)|48|(1:50)|51|(1:53)|54|(1:56)(1:282)|57|(4:59|(1:280)(1:63)|64|(58:66|67|(1:69)|70|(1:(1:73)(50:(1:277)(1:77)|78|(1:82)|(1:273)(1:88)|89|(2:91|(2:93|(1:95))(2:213|(1:220)(1:219)))(2:221|(1:223)(2:224|(1:272)(2:230|(1:232)(2:233|(2:235|(1:237)(1:238))(40:239|(1:241)(1:271)|242|(1:270)(1:256)|257|(2:259|(4:261|(1:269)(1:265)|266|(1:268)))|97|(1:212)(1:101)|102|103|104|(1:106)|107|(1:109)|110|(3:112|(1:114)|115)(1:209)|116|(1:118)(1:208)|119|(3:121|(1:123)|124)(1:207)|125|(3:203|(1:205)|206)(2:129|(1:131)(1:202))|132|(2:198|(1:200)(1:201))(1:136)|(1:197)(1:142)|143|(1:196)|146|(1:150)|151|(1:155)|156|(3:158|(2:160|(1:167)(1:166))|168)(3:187|(1:195)(1:193)|194)|169|(1:171)|172|(1:186)(1:178)|179|(1:181)|182)))))|96|97|(1:99)|212|102|103|104|(0)|107|(0)|110|(0)(0)|116|(0)(0)|119|(0)(0)|125|(1:127)|203|(0)|206|132|(1:134)|198|(0)(0)|(1:138)|197|143|(0)|196|146|(2:148|150)|151|(2:153|155)|156|(0)(0)|169|(0)|172|(2:174|176)|186|179|(0)|182))|278|78|(50:80|82|(2:84|86)|273|89|(0)(0)|96|97|(0)|212|102|103|104|(0)|107|(0)|110|(0)(0)|116|(0)(0)|119|(0)(0)|125|(0)|203|(0)|206|132|(0)|198|(0)(0)|(0)|197|143|(0)|196|146|(0)|151|(0)|156|(0)(0)|169|(0)|172|(0)|186|179|(0)|182)|275|82|(0)|273|89|(0)(0)|96|97|(0)|212|102|103|104|(0)|107|(0)|110|(0)(0)|116|(0)(0)|119|(0)(0)|125|(0)|203|(0)|206|132|(0)|198|(0)(0)|(0)|197|143|(0)|196|146|(0)|151|(0)|156|(0)(0)|169|(0)|172|(0)|186|179|(0)|182))(1:281)|279|67|(0)|70|(0)|278|78|(0)|275|82|(0)|273|89|(0)(0)|96|97|(0)|212|102|103|104|(0)|107|(0)|110|(0)(0)|116|(0)(0)|119|(0)(0)|125|(0)|203|(0)|206|132|(0)|198|(0)(0)|(0)|197|143|(0)|196|146|(0)|151|(0)|156|(0)(0)|169|(0)|172|(0)|186|179|(0)|182) */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x062c, code lost:
    
        if (r31.u2.can_view_participants != false) goto L335;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0499 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0a69  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x080f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0310  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u5(boolean z10) {
        Object obj;
        boolean z11;
        CharSequence formatPluralString;
        TLRPC.ChatParticipants chatParticipants;
        boolean z12;
        CharSequence charSequence;
        boolean l4;
        boolean z13;
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        ImageLocation C;
        View m10;
        TLRPC.Chat chat;
        ImageLocation imageLocation3;
        int i10;
        long j10;
        TLRPC.VideoSize videoSize;
        org.telegram.ui.Components.d81 d81Var;
        TLRPC.User user;
        ImageLocation imageLocation4;
        TLRPC.User user2;
        TLRPC.UserStatus userStatus;
        String str;
        boolean z14;
        org.telegram.ui.ActionBar.r5 r5Var;
        v01 v01Var;
        Drawable drawable;
        boolean z15;
        boolean z16;
        boolean z17;
        String str2;
        org.telegram.ui.Components.bh bhVar;
        TL_stars.Tl_starsRating tl_starsRating;
        String str3;
        TL_stars.Tl_starsRating tl_starsRating2;
        ImageLocation imageLocation5;
        tw twVar;
        if (this.X == null || this.f == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var == null || j5Var.getFragmentStack().size() < 2) {
            obj = null;
        } else {
            org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            obj = r2Var instanceof org.telegram.ui.Components.bh ? r2Var : null;
            if ((r2Var instanceof cy) && (twVar = ((cy) r2Var).G3) != null) {
                ax axVar = twVar.a;
                if (c3.h0.t(axVar)) {
                    obj = axVar;
                }
            }
        }
        if (obj instanceof un) {
            un unVar = (un) obj;
            if (unVar.m1 != null && unVar.d4 == 8) {
                z11 = true;
                this.v5 = false;
                this.w5 = false;
                String str4 = "";
                if (this.e1 == 0) {
                    TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(this.e1));
                    if (user3 == null) {
                        return;
                    }
                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                    boolean z18 = userProfilePhoto != null && userProfilePhoto.personal;
                    TLRPC.FileLocation fileLocation = userProfilePhoto != null ? userProfilePhoto.photo_big : null;
                    this.p0.m(this.currentAccount, user3);
                    MessagesController.PeerColor peerColor = this.X5;
                    MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(user3.emoji_status);
                    this.X5 = fromCollectible;
                    if (fromCollectible == null) {
                        int profileColorId = UserObject.getProfileColorId(user3);
                        j10 = 0;
                        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).profilePeerColors;
                        this.X5 = peerColors == null ? null : peerColors.getColor(profileColorId);
                    } else {
                        j10 = 0;
                    }
                    if (peerColor != this.X5) {
                        B5();
                    }
                    x01 x01Var = this.d1;
                    if (x01Var != null) {
                        x01Var.b(UserObject.getProfileEmojiId(user3), user3.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    org.telegram.ui.Components.ox0 ox0Var = this.S;
                    if (ox0Var != null) {
                        ox0Var.b.a(this.X5);
                        ox0Var.invalidate();
                    }
                    TLRPC.EmojiStatus emojiStatus = user3.emoji_status;
                    U4(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null);
                    ImageLocation forUserOrChat3 = ImageLocation.getForUserOrChat(user3, 0);
                    ImageLocation forUserOrChat4 = ImageLocation.getForUserOrChat(user3, 1);
                    ImageLocation forUserOrChat5 = ImageLocation.getForUserOrChat(user3, 4);
                    TLRPC.UserFull userFull = this.v2;
                    if (userFull != null) {
                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                        videoSize = FileLoader.getVectorMarkupVideoSize((userProfilePhoto2 == null || !userProfilePhoto2.personal) ? userFull.profile_photo : userFull.personal_photo);
                        if (videoSize != null) {
                            d81Var = new org.telegram.ui.Components.d81(videoSize, user3.premium, 2);
                            ImageLocation C2 = this.n0.C(forUserOrChat4, forUserOrChat3);
                            if (this.I2 == null) {
                                this.n0.H(d81Var, forUserOrChat3, forUserOrChat4, z10);
                            }
                            if (this.J2 == null) {
                                if (videoSize != null) {
                                    this.e0.setImageDrawable(d81Var);
                                } else {
                                    if (forUserOrChat5 == null || user3.photo.personal) {
                                        user = user3;
                                        imageLocation4 = forUserOrChat4;
                                        yy0 yy0Var = this.e0;
                                        yy0Var.a.setImage(C2, ImageLoader.AUTOPLAY_FILTER, forUserOrChat3, "100_100", imageLocation4, "50_50", this.p0, 0L, null, user, 1);
                                        forUserOrChat3 = forUserOrChat3;
                                        yy0Var.d();
                                    } else {
                                        this.e0.getImageReceiver().setVideoThumbIsSame(true);
                                        yy0 yy0Var2 = this.e0;
                                        user = user3;
                                        imageLocation4 = forUserOrChat4;
                                        yy0Var2.a.setImage(forUserOrChat5, "avatar", forUserOrChat3, "50_50", imageLocation4, "50_50", this.p0, 0L, null, user, 1);
                                        yy0Var2.d();
                                        forUserOrChat3 = forUserOrChat3;
                                    }
                                    if ((imageLocation4 != null && this.O2 != -1) || (imageLocation4 == null && this.O2 == -1)) {
                                        p5(false, false);
                                        r4(true);
                                    }
                                    if (forUserOrChat3 != null || ((imageLocation5 = this.B0) != null && forUserOrChat3.photoId == imageLocation5.photoId)) {
                                        user2 = user;
                                    } else {
                                        this.B0 = forUserOrChat3;
                                        TLRPC.User user4 = user;
                                        getFileLoader().loadFile(forUserOrChat3, user4, null, 0, 1);
                                        user2 = user4;
                                    }
                                    CharSequence userName = UserObject.getUserName(user2);
                                    if (user2.id == getUserConfig().getClientUserId()) {
                                        long j11 = user2.id;
                                        if (j11 == UserObject.VERIFY) {
                                            str3 = LocaleController.getString(R.string.VerifyCodesNotifications);
                                        } else if (j11 == 333000 || j11 == 777000 || j11 == 42777) {
                                            str3 = LocaleController.getString(R.string.ServiceNotifications);
                                        } else if (MessagesController.isSupportUser(user2)) {
                                            str3 = LocaleController.getString(R.string.SupportStatus);
                                        } else if (this.r2) {
                                            int i11 = user2.bot_active_users;
                                            str3 = i11 != 0 ? LocaleController.formatPluralStringComma("BotUsers", i11, ',') : UserObject.getBotStatus(user2);
                                        } else {
                                            boolean[] zArr = this.J0;
                                            zArr[0] = false;
                                            String formatUserStatus = LocaleController.formatUserStatus(this.currentAccount, user2, zArr, z18 ? new boolean[1] : null);
                                            boolean z19 = (zArr[0] || getUserConfig().isPremium() || (userStatus = user2.status) == null || (!(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) || !userStatus.by_me) ? false : true;
                                            az0 az0Var = this.r;
                                            z14 = z19;
                                            str = formatUserStatus;
                                            if (az0Var != null) {
                                                z14 = z19;
                                                str = formatUserStatus;
                                                if (!this.L5) {
                                                    int i12 = (zArr[0] && this.X5 == null) ? org.telegram.ui.ActionBar.y6.Bh : org.telegram.ui.ActionBar.y6.B8;
                                                    az0Var.setTag(Integer.valueOf(i12));
                                                    z14 = z19;
                                                    str = formatUserStatus;
                                                    if (!this.p2) {
                                                        this.r.setTextColor(D3(org.telegram.ui.ActionBar.y6.w0(i12, this.z0), Boolean.valueOf(zArr[0])));
                                                        z14 = z19;
                                                        str = formatUserStatus;
                                                    }
                                                }
                                            }
                                            TLRPC.UserProfilePhoto userProfilePhoto3 = user2.photo;
                                            this.w5 = userProfilePhoto3 == null && userProfilePhoto3.personal;
                                            userName = Emoji.replaceEmoji(userName, this.f.getPaint().getFontMetricsInt(), false);
                                            if (z11) {
                                                this.e0.setAnimateFromImageReceiver(((un) obj).m1.getAvatarImageView().getImageReceiver());
                                            }
                                            this.f.l(userName, false);
                                            r5Var = this.simpleActionBar;
                                            if (r5Var != null) {
                                                r5Var.setTitle(userName);
                                            }
                                            this.r.setDrawablePadding(AndroidUtilities.dp(9.0f));
                                            this.r.setRightDrawableInside(true);
                                            az0 az0Var2 = this.r;
                                            if (z14) {
                                                if (this.p6 == null) {
                                                    v01 v01Var2 = new v01(LocaleController.getString(R.string.StatusHiddenShow));
                                                    this.p6 = v01Var2;
                                                    v01Var2.setAlpha((int) (Math.min(1.0f, this.Q1 / c4()) * 255.0f));
                                                    this.p6.a(i0.a.f(this.k2, org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.b(0.18f, -0.1f, this.c1)), 603979775));
                                                }
                                                v01Var = this.p6;
                                            } else {
                                                v01Var = null;
                                            }
                                            az0Var2.i(v01Var);
                                            this.r.setRightDrawableOnClick(z14 ? new vx0(this, 8) : null);
                                            if (this.D2 != null) {
                                                if (this.w == null) {
                                                    this.w = org.telegram.ui.ActionBar.y6.l4.getConstantState().newDrawable().mutate();
                                                }
                                                drawable = this.w;
                                            } else {
                                                drawable = null;
                                            }
                                            this.f.setRightDrawableOutside(false);
                                            z15 = user2.scam;
                                            if (!z15 || user2.fake) {
                                                fl flVar = this.f;
                                                int i13 = !z15 ? 1 : 0;
                                                if (this.K == null) {
                                                    org.telegram.ui.Components.en0 en0Var = new org.telegram.ui.Components.en0(i13);
                                                    this.K = en0Var;
                                                    en0Var.b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h8, this.z0));
                                                }
                                                flVar.j(this.K);
                                                this.n = LocaleController.getString(R.string.ScamMessage);
                                            } else if (user2.verified) {
                                                this.f.j(j4());
                                                this.n = LocaleController.getString(R.string.AccDescrVerified);
                                            } else {
                                                this.f.j(null);
                                                this.n = null;
                                            }
                                            if (MessagesController.isSupportUser(user2) && DialogObject.getEmojiStatusDocumentId(user2.emoji_status) != j10) {
                                                this.f.i(b4(user2.emoji_status, true));
                                                this.h = LocaleController.getString(R.string.AccDescrPremium);
                                                z17 = true;
                                                z16 = false;
                                            } else if (getMessagesController().isPremiumUser(user2)) {
                                                this.f.i(b4(null, true));
                                                this.h = LocaleController.getString(R.string.AccDescrPremium);
                                                z16 = true;
                                                z17 = false;
                                            } else {
                                                this.f.i(null);
                                                this.h = null;
                                                z16 = false;
                                                z17 = false;
                                            }
                                            if (drawable == null || this.D2 != null || user2.bot_verification_icon == j10) {
                                                this.f.setLeftDrawableOutside(false);
                                            } else {
                                                this.f.setLeftDrawableOutside(true);
                                                drawable = Z3(user2.bot_verification_icon);
                                            }
                                            this.f.setLeftDrawable(drawable);
                                            if (!z17 || z16) {
                                                this.f.setRightDrawableOutside(true);
                                            }
                                            if (user2.self && getMessagesController().isPremiumUser(user2)) {
                                                this.f.setRightDrawableOnClick(new vx0(this, 9));
                                            }
                                            if (!user2.self && getMessagesController().isPremiumUser(user2)) {
                                                fl flVar2 = this.f;
                                                flVar2.setRightDrawableOnClick(new z(this, user2, flVar2, 14));
                                            }
                                            if (this.e1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                                String str5 = str;
                                                if (this.v5) {
                                                    TLRPC.UserFull userFull2 = this.v2;
                                                    str5 = (userFull2 == null || (tl_starsRating = userFull2.stars_rating) == null || tl_starsRating.stars >= j10) ? LocaleController.getString(R.string.Online) : LocaleController.getString(R.string.StarRatingLevelNegative).toLowerCase(Locale.ROOT);
                                                }
                                                this.j6 = LocaleController.getString(R.string.FallbackTooltip);
                                                str2 = str5;
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                                                spannableStringBuilder.append((CharSequence) " d ");
                                                TLRPC.UserProfilePhoto userProfilePhoto4 = user2.photo;
                                                spannableStringBuilder.append((CharSequence) LocaleController.getString((userProfilePhoto4 != null && userProfilePhoto4.personal && userProfilePhoto4.has_video) ? R.string.CustomAvatarTooltipVideo : R.string.CustomAvatarTooltip));
                                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.nt(), str.length() + 1, str.length() + 2, 0);
                                                this.j6 = spannableStringBuilder;
                                                str2 = str;
                                            }
                                            this.i6 = str2;
                                            t5();
                                            bhVar = this.m5;
                                            if (bhVar != null) {
                                                bhVar.p();
                                            }
                                            this.e0.getImageReceiver().setVisible(PhotoViewer.R1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                                        }
                                    } else if (UserObject.hasFallbackPhoto(this.v2)) {
                                        this.v5 = true;
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.v2.fallback_photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                        str3 = str4;
                                        if (closestPhotoSizeWithSize != null) {
                                            this.x5.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.v2.fallback_photo), "50_50", (Drawable) null, 0L, (String) null, UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0);
                                            str3 = str4;
                                        }
                                    } else {
                                        TLRPC.UserFull userFull3 = this.v2;
                                        str3 = (userFull3 == null || (tl_starsRating2 = userFull3.stars_rating) == null || tl_starsRating2.stars >= j10) ? LocaleController.getString(R.string.Online) : LocaleController.getString(R.string.StarRatingLevelNegative).toLowerCase(Locale.ROOT);
                                    }
                                    z14 = false;
                                    str = str3;
                                    TLRPC.UserProfilePhoto userProfilePhoto32 = user2.photo;
                                    this.w5 = userProfilePhoto32 == null && userProfilePhoto32.personal;
                                    userName = Emoji.replaceEmoji(userName, this.f.getPaint().getFontMetricsInt(), false);
                                    if (z11) {
                                    }
                                    this.f.l(userName, false);
                                    r5Var = this.simpleActionBar;
                                    if (r5Var != null) {
                                    }
                                    this.r.setDrawablePadding(AndroidUtilities.dp(9.0f));
                                    this.r.setRightDrawableInside(true);
                                    az0 az0Var22 = this.r;
                                    if (z14) {
                                    }
                                    az0Var22.i(v01Var);
                                    this.r.setRightDrawableOnClick(z14 ? new vx0(this, 8) : null);
                                    if (this.D2 != null) {
                                    }
                                    this.f.setRightDrawableOutside(false);
                                    z15 = user2.scam;
                                    if (z15) {
                                    }
                                    fl flVar3 = this.f;
                                    int i132 = !z15 ? 1 : 0;
                                    if (this.K == null) {
                                    }
                                    flVar3.j(this.K);
                                    this.n = LocaleController.getString(R.string.ScamMessage);
                                    if (MessagesController.isSupportUser(user2)) {
                                    }
                                    if (getMessagesController().isPremiumUser(user2)) {
                                    }
                                    if (drawable == null) {
                                    }
                                    this.f.setLeftDrawableOutside(false);
                                    this.f.setLeftDrawable(drawable);
                                    if (!z17) {
                                    }
                                    this.f.setRightDrawableOutside(true);
                                    if (user2.self) {
                                        this.f.setRightDrawableOnClick(new vx0(this, 9));
                                    }
                                    if (!user2.self) {
                                        fl flVar22 = this.f;
                                        flVar22.setRightDrawableOnClick(new z(this, user2, flVar22, 14));
                                    }
                                    if (this.e1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                    }
                                    this.i6 = str2;
                                    t5();
                                    bhVar = this.m5;
                                    if (bhVar != null) {
                                    }
                                    this.e0.getImageReceiver().setVisible(PhotoViewer.R1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                                }
                            }
                            user = user3;
                            imageLocation4 = forUserOrChat4;
                            if (imageLocation4 != null) {
                                p5(false, false);
                                r4(true);
                                if (forUserOrChat3 != null) {
                                }
                                user2 = user;
                                CharSequence userName2 = UserObject.getUserName(user2);
                                if (user2.id == getUserConfig().getClientUserId()) {
                                }
                                z14 = false;
                                str = str3;
                                TLRPC.UserProfilePhoto userProfilePhoto322 = user2.photo;
                                this.w5 = userProfilePhoto322 == null && userProfilePhoto322.personal;
                                userName2 = Emoji.replaceEmoji(userName2, this.f.getPaint().getFontMetricsInt(), false);
                                if (z11) {
                                }
                                this.f.l(userName2, false);
                                r5Var = this.simpleActionBar;
                                if (r5Var != null) {
                                }
                                this.r.setDrawablePadding(AndroidUtilities.dp(9.0f));
                                this.r.setRightDrawableInside(true);
                                az0 az0Var222 = this.r;
                                if (z14) {
                                }
                                az0Var222.i(v01Var);
                                this.r.setRightDrawableOnClick(z14 ? new vx0(this, 8) : null);
                                if (this.D2 != null) {
                                }
                                this.f.setRightDrawableOutside(false);
                                z15 = user2.scam;
                                if (z15) {
                                }
                                fl flVar32 = this.f;
                                int i1322 = !z15 ? 1 : 0;
                                if (this.K == null) {
                                }
                                flVar32.j(this.K);
                                this.n = LocaleController.getString(R.string.ScamMessage);
                                if (MessagesController.isSupportUser(user2)) {
                                }
                                if (getMessagesController().isPremiumUser(user2)) {
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
                                if (this.e1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                }
                                this.i6 = str2;
                                t5();
                                bhVar = this.m5;
                                if (bhVar != null) {
                                }
                                this.e0.getImageReceiver().setVisible(PhotoViewer.R1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                            }
                            p5(false, false);
                            r4(true);
                            if (forUserOrChat3 != null) {
                            }
                            user2 = user;
                            CharSequence userName22 = UserObject.getUserName(user2);
                            if (user2.id == getUserConfig().getClientUserId()) {
                            }
                            z14 = false;
                            str = str3;
                            TLRPC.UserProfilePhoto userProfilePhoto3222 = user2.photo;
                            this.w5 = userProfilePhoto3222 == null && userProfilePhoto3222.personal;
                            userName22 = Emoji.replaceEmoji(userName22, this.f.getPaint().getFontMetricsInt(), false);
                            if (z11) {
                            }
                            this.f.l(userName22, false);
                            r5Var = this.simpleActionBar;
                            if (r5Var != null) {
                            }
                            this.r.setDrawablePadding(AndroidUtilities.dp(9.0f));
                            this.r.setRightDrawableInside(true);
                            az0 az0Var2222 = this.r;
                            if (z14) {
                            }
                            az0Var2222.i(v01Var);
                            this.r.setRightDrawableOnClick(z14 ? new vx0(this, 8) : null);
                            if (this.D2 != null) {
                            }
                            this.f.setRightDrawableOutside(false);
                            z15 = user2.scam;
                            if (z15) {
                            }
                            fl flVar322 = this.f;
                            int i13222 = !z15 ? 1 : 0;
                            if (this.K == null) {
                            }
                            flVar322.j(this.K);
                            this.n = LocaleController.getString(R.string.ScamMessage);
                            if (MessagesController.isSupportUser(user2)) {
                            }
                            if (getMessagesController().isPremiumUser(user2)) {
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
                            if (this.e1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                            }
                            this.i6 = str2;
                            t5();
                            bhVar = this.m5;
                            if (bhVar != null) {
                            }
                            this.e0.getImageReceiver().setVisible(PhotoViewer.R1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                        }
                    } else {
                        videoSize = null;
                    }
                    d81Var = null;
                    ImageLocation C22 = this.n0.C(forUserOrChat4, forUserOrChat3);
                    if (this.I2 == null) {
                    }
                    if (this.J2 == null) {
                    }
                    user = user3;
                    imageLocation4 = forUserOrChat4;
                    if (imageLocation4 != null) {
                    }
                    p5(false, false);
                    r4(true);
                    if (forUserOrChat3 != null) {
                    }
                    user2 = user;
                    CharSequence userName222 = UserObject.getUserName(user2);
                    if (user2.id == getUserConfig().getClientUserId()) {
                    }
                    z14 = false;
                    str = str3;
                    TLRPC.UserProfilePhoto userProfilePhoto32222 = user2.photo;
                    this.w5 = userProfilePhoto32222 == null && userProfilePhoto32222.personal;
                    userName222 = Emoji.replaceEmoji(userName222, this.f.getPaint().getFontMetricsInt(), false);
                    if (z11) {
                    }
                    this.f.l(userName222, false);
                    r5Var = this.simpleActionBar;
                    if (r5Var != null) {
                    }
                    this.r.setDrawablePadding(AndroidUtilities.dp(9.0f));
                    this.r.setRightDrawableInside(true);
                    az0 az0Var22222 = this.r;
                    if (z14) {
                    }
                    az0Var22222.i(v01Var);
                    this.r.setRightDrawableOnClick(z14 ? new vx0(this, 8) : null);
                    if (this.D2 != null) {
                    }
                    this.f.setRightDrawableOutside(false);
                    z15 = user2.scam;
                    if (z15) {
                    }
                    fl flVar3222 = this.f;
                    int i132222 = !z15 ? 1 : 0;
                    if (this.K == null) {
                    }
                    flVar3222.j(this.K);
                    this.n = LocaleController.getString(R.string.ScamMessage);
                    if (MessagesController.isSupportUser(user2)) {
                    }
                    if (getMessagesController().isPremiumUser(user2)) {
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
                    if (this.e1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    }
                    this.i6 = str2;
                    t5();
                    bhVar = this.m5;
                    if (bhVar != null) {
                    }
                    this.e0.getImageReceiver().setVisible(PhotoViewer.R1(fileLocation) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                } else if (this.f1 != 0) {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.f1));
                    if (chat2 != null) {
                        this.E2 = chat2;
                    } else {
                        chat2 = this.E2;
                    }
                    TLRPC.Chat chat3 = chat2;
                    FlagSecureReason flagSecureReason = this.X1;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                    }
                    MessagesController.PeerColor peerColor2 = this.X5;
                    MessagesController.PeerColor fromCollectible2 = MessagesController.PeerColor.fromCollectible(chat3.emoji_status);
                    this.X5 = fromCollectible2;
                    if (fromCollectible2 == null) {
                        int profileColorId2 = ChatObject.getProfileColorId(chat3);
                        MessagesController.PeerColors peerColors2 = MessagesController.getInstance(this.currentAccount).profilePeerColors;
                        this.X5 = peerColors2 == null ? null : peerColors2.getColor(profileColorId2);
                    }
                    if (peerColor2 != this.X5) {
                        B5();
                    }
                    x01 x01Var2 = this.d1;
                    if (x01Var2 != null) {
                        x01Var2.b(ChatObject.getProfileEmojiId(chat3), chat3.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    TLRPC.EmojiStatus emojiStatus2 = chat3.emoji_status;
                    U4(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null);
                    TLRPC.TL_forumTopic findTopic = this.q1 ? getMessagesController().getTopicsController().findTopic(this.f1, this.g1) : null;
                    if (ChatObject.isChannel(chat3)) {
                        if (!this.q1) {
                            TLRPC.ChatFull chatFull = this.u2;
                            if (chatFull != null) {
                                TLRPC.Chat chat4 = this.E2;
                                if (!chat4.megagroup) {
                                    if (chatFull.participants_count != 0) {
                                        if (!ChatObject.hasAdminRights(chat4)) {
                                        }
                                    }
                                }
                            }
                            formatPluralString = this.E2.megagroup ? LocaleController.getString(R.string.Loading).toLowerCase() : ChatObject.isPublic(chat3) ? LocaleController.getString(R.string.ChannelPublic).toLowerCase() : LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                        }
                        if (this.q1) {
                            int i14 = findTopic != null ? findTopic.totalMessagesCount - 1 : 0;
                            if (i14 > 0) {
                                LocaleController.formatPluralString("messages", i14, Integer.valueOf(i14));
                            } else {
                                LocaleController.formatString("TopicProfileStatus", R.string.TopicProfileStatus, chat3.title);
                            }
                            SpannableString spannableString = new SpannableString(">");
                            spannableString.setSpan(new org.telegram.ui.Components.zq(R.drawable.arrow_newchat, 0), 0, 1, 33);
                            formatPluralString = new SpannableStringBuilder(chat3.title).append(' ').append((CharSequence) spannableString);
                            z12 = true;
                            if (z11) {
                                un unVar2 = (un) obj;
                                if (unVar2.m1.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.b6) {
                                    ((org.telegram.ui.ActionBar.b6) unVar2.m1.getSubtitleTextView()).getText();
                                } else if (unVar2.m1.getSubtitleTextView() instanceof org.telegram.ui.Components.s6) {
                                    ((org.telegram.ui.Components.s6) unVar2.m1.getSubtitleTextView()).getText();
                                }
                                this.e0.setAnimateFromImageReceiver(unVar2.m1.getAvatarImageView().getImageReceiver());
                            }
                            charSequence = str4;
                            if (this.q1) {
                                if (ChatObject.isMonoForum(chat3)) {
                                    charSequence = LocaleController.getString(R.string.ChatMessageSuggestions);
                                } else {
                                    String str6 = chat3.title;
                                    charSequence = str6;
                                    if (str6 == null) {
                                        charSequence = null;
                                    }
                                }
                            } else if (findTopic != null) {
                                charSequence = findTopic.title;
                            }
                            if (charSequence == null) {
                                try {
                                    charSequence = Emoji.replaceEmoji(charSequence, this.f.getPaint().getFontMetricsInt(), false);
                                } catch (Exception unused) {
                                }
                                l4 = this.f.l(charSequence, false);
                                org.telegram.ui.ActionBar.r5 r5Var2 = this.simpleActionBar;
                                if (r5Var2 != null) {
                                    r5Var2.setTitle(charSequence);
                                }
                            } else {
                                l4 = false;
                            }
                            this.f.setLeftDrawableOutside(false);
                            this.f.setLeftDrawable((Drawable) null);
                            this.f.setRightDrawableOutside(false);
                            this.f.setRightDrawableOnClick(null);
                            this.n = null;
                            z13 = chat3.scam;
                            if (!z13 || chat3.fake) {
                                fl flVar4 = this.f;
                                int i15 = !z13 ? 1 : 0;
                                if (this.K == null) {
                                    org.telegram.ui.Components.en0 en0Var2 = new org.telegram.ui.Components.en0(i15);
                                    this.K = en0Var2;
                                    en0Var2.b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h8, this.z0));
                                }
                                flVar4.j(this.K);
                                this.h = LocaleController.getString(R.string.ScamMessage);
                            } else if (chat3.verified) {
                                this.f.j(j4());
                                this.h = LocaleController.getString(R.string.AccDescrVerified);
                            } else {
                                this.f.j(null);
                                this.h = null;
                            }
                            if (DialogObject.getEmojiStatusDocumentId(chat3.emoji_status) == 0) {
                                this.f.i(b4(chat3.emoji_status, false));
                                this.f.setRightDrawableOutside(true);
                                this.h = null;
                                if (ChatObject.canChangeChatInfo(chat3)) {
                                    this.f.setRightDrawableOnClick(new vx0(this, 10));
                                    if (this.R) {
                                        this.R = true;
                                        getMediaDataController().loadRestrictedStatusEmojis();
                                    }
                                } else {
                                    TLRPC.EmojiStatus emojiStatus3 = chat3.emoji_status;
                                    if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                                        this.f.setRightDrawableOnClick(new hy0(this, ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug, r8 ? 1 : 0));
                                    }
                                }
                            } else {
                                this.f.i(null);
                            }
                            if (chat3.bot_verification_icon == 0) {
                                this.f.setLeftDrawableOutside(true);
                                this.f.setLeftDrawable(Z3(chat3.bot_verification_icon));
                            } else {
                                this.f.setLeftDrawable((Drawable) null);
                            }
                            if (ChatObject.isHiddenInCommunity(this.currentAccount, this.i1)) {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) "* ");
                                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.zq(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.CommunityHiddenStatus));
                                spannableStringBuilder2.append((CharSequence) " * ");
                                int length = spannableStringBuilder2.length();
                                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.nt(), length - 2, length - 1, 33);
                                spannableStringBuilder2.append(formatPluralString);
                                formatPluralString = spannableStringBuilder2;
                            }
                            this.i6 = formatPluralString;
                            this.j6 = null;
                            t5();
                            if (this.q1) {
                                if (z12) {
                                    this.r.setOnClickListener(new vx0(this, 11));
                                } else {
                                    this.r.setOnClickListener(null);
                                    this.r.setClickable(false);
                                }
                            }
                            if (l4) {
                                r4(true);
                            }
                            TLRPC.ChatPhoto chatPhoto = chat3.photo;
                            TLRPC.FileLocation fileLocation2 = (chatPhoto != null || this.q1) ? null : chatPhoto.photo_big;
                            if (this.q1) {
                                if (ChatObject.isMonoForum(this.E2)) {
                                    TLRPC.Chat monoForumLinkedChat = getMessagesController().getMonoForumLinkedChat(this.E2.id);
                                    this.p0.k(this.currentAccount, monoForumLinkedChat);
                                    forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat, 0);
                                    forUserOrChat2 = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat, 1);
                                    C = this.n0.C(forUserOrChat2, forUserOrChat);
                                } else {
                                    this.p0.k(this.currentAccount, chat3);
                                    forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat3, 0);
                                    forUserOrChat2 = ImageLocation.getForUserOrChat(this.currentAccount, chat3, 1);
                                    zy0 zy0Var = this.n0;
                                    if (zy0Var != null) {
                                        C = zy0Var.C(forUserOrChat2, forUserOrChat);
                                    } else {
                                        imageLocation = forUserOrChat2;
                                        imageLocation2 = null;
                                    }
                                }
                                imageLocation = forUserOrChat2;
                                imageLocation2 = C;
                            } else {
                                pg.d.p(this.e0, findTopic, true, true, this.z0);
                                forUserOrChat = null;
                                imageLocation2 = null;
                                imageLocation = null;
                            }
                            boolean H = this.n0.H(null, forUserOrChat, imageLocation, z10);
                            if ((forUserOrChat != null || H) && this.p2 && (m10 = this.c.m(0)) != null) {
                                this.a.w0(0, m10.getTop() - c4(), org.telegram.ui.Components.ds.h);
                            }
                            String str7 = (imageLocation2 == null && imageLocation2.imageType == 2) ? ImageLoader.AUTOPLAY_FILTER : null;
                            if (this.J2 == null || this.q1) {
                                chat = chat3;
                            } else {
                                chat = chat3;
                                this.e0.l(imageLocation2, str7, imageLocation, "50_50", this.p0, chat);
                            }
                            if (forUserOrChat != null && ((imageLocation3 = this.B0) == null || forUserOrChat.photoId != imageLocation3.photoId)) {
                                this.B0 = forUserOrChat;
                                getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
                            }
                            this.e0.getImageReceiver().setVisible(PhotoViewer.R1(fileLocation2) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                        } else if (!this.E2.megagroup) {
                            LocaleController.formatShortNumber(this.u2.participants_count, new int[1]);
                            if (this.E2.megagroup) {
                                LocaleController.formatPluralString("Members", this.u2.participants_count, new Object[0]);
                                formatPluralString = LocaleController.formatPluralStringComma("Members", this.u2.participants_count);
                            } else {
                                LocaleController.formatPluralString("Subscribers", this.u2.participants_count, new Object[0]);
                                formatPluralString = LocaleController.formatPluralStringComma("Subscribers", this.u2.participants_count);
                            }
                        } else if (this.B2 <= 1 || (i10 = this.u2.participants_count) == 0) {
                            int i16 = this.u2.participants_count;
                            if (i16 == 0) {
                                formatPluralString = chat3.has_geo ? LocaleController.getString(R.string.MegaLocation).toLowerCase() : ChatObject.isPublic(chat3) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                            } else {
                                LocaleController.formatPluralString("Members", i16, new Object[0]);
                                formatPluralString = LocaleController.formatPluralStringComma("Members", this.u2.participants_count);
                            }
                        } else {
                            LocaleController.formatPluralString("Members", i10, new Object[0]);
                            LocaleController.formatPluralString("OnlineCount", Math.min(this.B2, this.u2.participants_count), new Object[0]);
                            formatPluralString = a1.g.D(LocaleController.formatPluralStringComma("Members", this.u2.participants_count), ", ", LocaleController.formatPluralStringComma("OnlineCount", Math.min(this.B2, this.u2.participants_count)));
                        }
                    } else if (ChatObject.isKickedFromChat(chat3)) {
                        formatPluralString = LocaleController.getString(R.string.YouWereKicked);
                    } else if (ChatObject.isLeftFromChat(chat3)) {
                        formatPluralString = LocaleController.getString(R.string.YouLeft);
                    } else {
                        int i17 = chat3.participants_count;
                        TLRPC.ChatFull chatFull2 = this.u2;
                        if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                            i17 = chatParticipants.participants.size();
                        }
                        formatPluralString = (i17 == 0 || this.B2 <= 1) ? LocaleController.formatPluralString("Members", i17, new Object[0]) : a1.g.D(LocaleController.formatPluralString("Members", i17, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", this.B2, new Object[0]));
                    }
                    z12 = false;
                    if (z11) {
                    }
                    charSequence = str4;
                    if (this.q1) {
                    }
                    if (charSequence == null) {
                    }
                    this.f.setLeftDrawableOutside(false);
                    this.f.setLeftDrawable((Drawable) null);
                    this.f.setRightDrawableOutside(false);
                    this.f.setRightDrawableOnClick(null);
                    this.n = null;
                    z13 = chat3.scam;
                    if (z13) {
                    }
                    fl flVar42 = this.f;
                    int i152 = !z13 ? 1 : 0;
                    if (this.K == null) {
                    }
                    flVar42.j(this.K);
                    this.h = LocaleController.getString(R.string.ScamMessage);
                    if (DialogObject.getEmojiStatusDocumentId(chat3.emoji_status) == 0) {
                    }
                    if (chat3.bot_verification_icon == 0) {
                    }
                    if (ChatObject.isHiddenInCommunity(this.currentAccount, this.i1)) {
                    }
                    this.i6 = formatPluralString;
                    this.j6 = null;
                    t5();
                    if (this.q1) {
                    }
                    if (l4) {
                    }
                    TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                    if (chatPhoto2 != null) {
                    }
                    if (this.q1) {
                    }
                    boolean H2 = this.n0.H(null, forUserOrChat, imageLocation, z10);
                    if (forUserOrChat != null) {
                    }
                    this.a.w0(0, m10.getTop() - c4(), org.telegram.ui.Components.ds.h);
                    if (imageLocation2 == null) {
                    }
                    if (this.J2 == null) {
                    }
                    chat = chat3;
                    if (forUserOrChat != null) {
                        this.B0 = forUserOrChat;
                        getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
                    }
                    this.e0.getImageReceiver().setVisible(PhotoViewer.R1(fileLocation2) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                }
                r4(true);
            }
        }
        z11 = false;
        this.v5 = false;
        this.w5 = false;
        String str42 = "";
        if (this.e1 == 0) {
        }
        r4(true);
    }

    @Override // org.telegram.ui.ux
    public final boolean v(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle i12 = a1.g.i("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j10)) {
            i12.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            i12.putLong("user_id", j10);
        } else if (DialogObject.isChatDialog(j10)) {
            i12.putLong("chat_id", -j10);
        }
        if (!getMessagesController().checkCanOpenChat(i12, cyVar)) {
            return false;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i13 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i13);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i13, new Object[0]);
        presentFragment(new un(i12), true);
        removeSelfFromStack();
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(getMessagesController().getUser(Long.valueOf(this.e1)), j10, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z11, i10, i11));
        if (!TextUtils.isEmpty(charSequence)) {
            SendMessagesHelper.prepareSendingText(AccountInstance.getInstance(this.currentAccount), charSequence, j10, z11, i10, i11, 0L);
        }
        return true;
    }

    public final void v4(boolean z10) {
        boolean z11 = false;
        if (this.e1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e1));
            if (user != null) {
                TLRPC.UserFull userFull = this.v2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.g2.m(user, z10, z11, getParentActivity(), this.v2, getAccountInstance());
                return;
            }
            return;
        }
        if (this.f1 != 0) {
            if (getMessagesController().getGroupCall(this.f1, false) != null) {
                org.telegram.ui.Components.voip.g2.l(this.E2, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            TLRPC.Chat chat = this.E2;
            AccountInstance accountInstance = getAccountInstance();
            if (getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.t80.t(getParentActivity(), -chat.id, accountInstance, new org.telegram.ui.Components.qy(chat, this, accountInstance, 5));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0bb8, code lost:
    
        if ((c4() + (r2 + r3)) < r18.a.getMeasuredHeight()) goto L697;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0182, code lost:
    
        if (org.telegram.messenger.MessagesController.ChannelRecommendations.hasRecommendations(r18.currentAccount, r10) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f2, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationToBeDeprecated) == false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0b81  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0ba4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0bac  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0bc0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0bc9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0b9f  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v5() {
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
        py0 py0Var;
        org.telegram.ui.Components.bi0 bi0Var;
        org.telegram.ui.Components.ui0 ui0Var;
        int i11;
        long j10;
        boolean z11;
        TLRPC.UserFull userFull;
        boolean z12;
        TLRPC.UserFull userFull2;
        TL_payments.starRefProgram starrefprogram;
        org.telegram.ui.Cells.k6 k6Var;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull5;
        TLRPC.UserFull userFull4;
        TLRPC.ChatFull chatFull6;
        TLRPC.UserFull userFull5;
        TL_bots.BotInfo botInfo;
        TLRPC.UserFull userFull6;
        TLRPC.UserFull userFull7;
        r5(false);
        int i12 = this.N2;
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
        this.j4 = -1;
        this.k4 = -1;
        this.l4 = -1;
        this.m4 = -1;
        this.n4 = -1;
        this.s4 = -1;
        this.botPermissionBiometry = -1;
        this.botPermissionEmojiStatus = -1;
        this.botPermissionLocation = -1;
        this.u4 = -1;
        this.o4 = -1;
        this.p4 = -1;
        this.q4 = -1;
        this.r4 = -1;
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
        this.v4 = -1;
        this.w4 = -1;
        this.M3 = -1;
        this.Y3 = -1;
        this.N3 = -1;
        this.P3 = -1;
        this.O3 = -1;
        this.R3 = -1;
        this.S3 = -1;
        this.T3 = -1;
        this.x4 = -1;
        this.C3 = -1;
        this.a4 = -1;
        this.b4 = -1;
        this.y4 = -1;
        this.z4 = -1;
        this.A4 = -1;
        this.B4 = -1;
        this.C4 = -1;
        this.D4 = -1;
        this.E4 = -1;
        this.L4 = -1;
        this.M4 = -1;
        this.J4 = -1;
        this.P4 = -1;
        this.Q3 = -1;
        this.F4 = -1;
        this.G4 = -1;
        this.H4 = -1;
        this.I4 = -1;
        this.K4 = -1;
        this.N4 = false;
        boolean z13 = true;
        this.O4 = (this.e1 == 0 || (userFull7 = this.v2) == null || userFull7.wallet_card == null || (this.q0 != null && !this.s1)) ? false : true;
        this.Q4 = -1;
        this.R4 = -1;
        this.S4 = -1;
        ArrayList arrayList2 = this.W4;
        arrayList2.clear();
        ArrayList arrayList3 = this.X4;
        arrayList3.clear();
        org.telegram.ui.Components.sv0 sv0Var = this.Q;
        if (sv0Var != null) {
            int[] iArr = sv0Var.c;
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
                if (j11 == 0 || !MessagesController.ChannelRecommendations.hasRecommendations(this.currentAccount, -j11)) {
                    if (this.r2) {
                        long j12 = this.e1;
                        if (j12 != 0) {
                        }
                    }
                }
                z10 = true;
            }
            if (this.e1 == 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e1));
                TLRPC.UserFull userFull8 = this.v2;
                if (userFull8 != null && userFull8.saved_music != null && (this.q0 == null || this.s1)) {
                    this.N4 = true;
                }
                if (this.A3 < 0 && this.B3 < 0) {
                    if (this.N4 || this.O4 || this.X5 != null || this.Z == null) {
                        int i14 = this.N2;
                        this.N2 = i14 + 1;
                        this.B3 = i14;
                    } else {
                        int i15 = this.N2;
                        this.N2 = i15 + 1;
                        this.A3 = i15;
                    }
                }
                if (!UserObject.isUserSelf(user) || this.s1) {
                    String publicUsername = UserObject.getPublicUsername(user);
                    TLRPC.UserFull userFull9 = this.v2;
                    boolean z14 = ((userFull9 == null || TextUtils.isEmpty(userFull9.about)) && (user == null || TextUtils.isEmpty(publicUsername))) ? false : true;
                    boolean z15 = (user == null || (TextUtils.isEmpty(user.phone) && TextUtils.isEmpty(this.j5))) ? false : true;
                    if (!this.r2 && (userFull3 = this.v2) != null && userFull3.unofficial_security_risk) {
                        int i16 = this.N2;
                        this.o4 = i16;
                        this.N2 = i16 + 2;
                        this.p4 = i16 + 1;
                    }
                    TLRPC.UserFull userFull10 = this.v2;
                    if (userFull10 == null || (userFull10.flags2 & 64) == 0 || ((k6Var = this.w2) != null && k6Var.c && k6Var.d.isEmpty())) {
                        j10 = 0;
                    } else {
                        j10 = 0;
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.v2.personal_channel_id));
                        if (chat != null && (ChatObject.isPublic(chat) || !ChatObject.isNotInChat(chat))) {
                            int i17 = this.N2;
                            this.Q2 = i17;
                            this.N2 = i17 + 2;
                            this.R2 = i17 + 1;
                        }
                    }
                    if (!this.r2 && (z15 || !z14)) {
                        int i18 = this.N2;
                        this.N2 = i18 + 1;
                        this.G3 = i18;
                    }
                    TLRPC.UserFull userFull11 = this.v2;
                    if (userFull11 != null && !TextUtils.isEmpty(userFull11.about)) {
                        int i19 = this.N2;
                        this.N2 = i19 + 1;
                        this.J3 = i19;
                    }
                    if (user != null && publicUsername != null) {
                        int i20 = this.N2;
                        this.N2 = i20 + 1;
                        this.L3 = i20;
                    }
                    TLRPC.UserFull userFull12 = this.v2;
                    if (userFull12 != null) {
                        if (userFull12.birthday != null) {
                            int i21 = this.N2;
                            this.N2 = i21 + 1;
                            this.U2 = i21;
                        }
                        if (userFull12.business_work_hours != null) {
                            int i22 = this.N2;
                            this.N2 = i22 + 1;
                            this.O3 = i22;
                        }
                        if (userFull12.business_location != null) {
                            int i23 = this.N2;
                            this.N2 = i23 + 1;
                            this.P3 = i23;
                        }
                        if (userFull12.note != null) {
                            int i24 = this.N2;
                            this.N2 = i24 + 1;
                            this.H3 = i24;
                        }
                    }
                    if (this.Z == null && this.e1 != getUserConfig().getClientUserId()) {
                        int i25 = this.N2;
                        this.N2 = i25 + 1;
                        this.N3 = i25;
                    }
                    if (this.r2 && user != null && user.bot_has_main_app) {
                        int i26 = this.N2;
                        this.N2 = i26 + 1;
                        this.i4 = i26;
                    }
                    TL_agent.settings settingsVar = m4() ? getMessagesController().getAgentController().settings : null;
                    if (settingsVar != null && settingsVar.keys.isEmpty()) {
                        int i27 = this.N2;
                        this.N2 = i27 + 1;
                        this.j4 = i27;
                    }
                    int i28 = this.N2;
                    this.N2 = i28 + 1;
                    this.R3 = i28;
                    if (settingsVar != null && !settingsVar.keys.isEmpty()) {
                        int i29 = this.N2;
                        this.k4 = i29;
                        int size = settingsVar.keys.size() + i29;
                        this.l4 = size;
                        this.m4 = size;
                        this.N2 = size + 2;
                        this.n4 = size + 1;
                    }
                    if (user != null && user.linked_community_id != j10) {
                        int i30 = this.N2;
                        this.q4 = i30;
                        this.N2 = i30 + 2;
                        this.r4 = i30 + 1;
                    }
                    if (this.r2 && (userFull2 = this.v2) != null && (starrefprogram = userFull2.starref_program) != null && (starrefprogram.flags & 2) == 0 && getMessagesController().starrefConnectAllowed) {
                        int i31 = this.N2;
                        this.S3 = i31;
                        this.N2 = i31 + 2;
                        this.T3 = i31 + 1;
                    }
                    if (this.r2) {
                        if (this.s2 == null && getContext() != null) {
                            this.s2 = hi.b1.e(getContext(), this.currentAccount, this.e1);
                        }
                        if (this.t2 == null && getContext() != null) {
                            this.t2 = hi.y.c(getContext(), this.currentAccount, this.e1);
                        }
                        hi.b1 b1Var = this.s2;
                        boolean z16 = b1Var != null && b1Var.b();
                        hi.y yVar = this.t2;
                        boolean z17 = yVar != null && yVar.a();
                        TLRPC.UserFull userFull13 = this.v2;
                        if (userFull13 == null || !userFull13.bot_can_manage_emoji_status) {
                            if (!hi.a5.d((Activity) getContext(), this.currentAccount, this.e1)) {
                                z12 = false;
                                if (!z12 || z16 || z17) {
                                    int i32 = this.N2;
                                    int i33 = i32 + 1;
                                    this.N2 = i33;
                                    this.s4 = i32;
                                    if (z12) {
                                        this.N2 = i32 + 2;
                                        this.botPermissionEmojiStatus = i33;
                                    }
                                    if (z16) {
                                        int i34 = this.N2;
                                        this.N2 = i34 + 1;
                                        this.botPermissionLocation = i34;
                                    }
                                    if (z17) {
                                        int i35 = this.N2;
                                        this.N2 = i35 + 1;
                                        this.botPermissionBiometry = i35;
                                    }
                                    int i36 = this.N2;
                                    this.N2 = i36 + 1;
                                    this.u4 = i36;
                                }
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        int i322 = this.N2;
                        int i332 = i322 + 1;
                        this.N2 = i332;
                        this.s4 = i322;
                        if (z12) {
                        }
                        if (z16) {
                        }
                        if (z17) {
                        }
                        int i362 = this.N2;
                        this.N2 = i362 + 1;
                        this.u4 = i362;
                    }
                    TLRPC.EncryptedChat encryptedChat = this.D2;
                    if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                        int i37 = this.N2;
                        this.v4 = i37;
                        this.w4 = i37 + 1;
                        this.N2 = i37 + 3;
                        this.x4 = i37 + 2;
                    }
                    if (user != null && !this.r2 && encryptedChat == null && user.id != getUserConfig().getClientUserId() && this.k1) {
                        int i38 = this.N2;
                        this.Q4 = i38;
                        this.N2 = i38 + 2;
                        this.S4 = i38 + 1;
                    }
                    if (user != null && user.bot) {
                        TLRPC.UserFull userFull14 = this.v2;
                        if (userFull14 != null && userFull14.can_view_revenue && bi.m0.g(this.currentAccount).i(this.e1) > j10) {
                            int i39 = this.N2;
                            this.N2 = i39 + 1;
                            this.H4 = i39;
                        }
                        if (bi.m0.g(this.currentAccount).c(this.e1).amount > j10 || !bi.m0.g(this.currentAccount).k(this.e1).a[0].isEmpty()) {
                            int i40 = this.N2;
                            this.N2 = i40 + 1;
                            this.G4 = i40;
                        }
                    }
                    if (user != null && this.r2 && !user.bot_nochats) {
                        int i41 = this.N2;
                        this.a4 = i41;
                        this.N2 = i41 + 2;
                        this.b4 = i41 + 1;
                    } else if (this.G4 >= 0) {
                        z11 = true;
                        if (!this.s1 && this.i5 && user != null && !user.contact && !user.bot && !UserObject.isService(user.id)) {
                            int i42 = this.N2;
                            this.N2 = i42 + 1;
                            this.Z3 = i42;
                            z11 = true;
                        }
                        if (!this.s1 && this.f5 != 0 && this.g5 < j10 && ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(-this.g5)), 13)) {
                            int i43 = this.N2;
                            this.N2 = i43 + 1;
                            this.W3 = i43;
                            z11 = true;
                        }
                        if (!this.s1 || this.f5 == 0 || ContactsController.getInstance(this.currentAccount).isContact(this.e1)) {
                            z13 = z11;
                        } else {
                            int i44 = this.N2;
                            this.N2 = i44 + 1;
                            this.X3 = i44;
                        }
                        if (z13) {
                            int i45 = this.N2;
                            this.N2 = i45 + 1;
                            this.Y3 = i45;
                        }
                        if (!z10 || ((user != null && user.bot && user.bot_can_edit && user.bot_has_main_app) || (!((userFull = this.v2) == null || userFull.common_chats_count == 0) || this.s1))) {
                            int i46 = this.N2;
                            this.N2 = i46 + 1;
                            this.P4 = i46;
                        } else if (this.S4 == -1 && this.o1) {
                            int i47 = this.N2;
                            this.U3 = i47;
                            this.N2 = i47 + 2;
                            this.S4 = i47 + 1;
                        }
                    }
                    z11 = false;
                    if (!this.s1) {
                        int i422 = this.N2;
                        this.N2 = i422 + 1;
                        this.Z3 = i422;
                        z11 = true;
                    }
                    if (!this.s1) {
                        int i432 = this.N2;
                        this.N2 = i432 + 1;
                        this.W3 = i432;
                        z11 = true;
                    }
                    if (this.s1) {
                    }
                    z13 = z11;
                    if (z13) {
                    }
                    if (z10) {
                    }
                    int i462 = this.N2;
                    this.N2 = i462 + 1;
                    this.P4 = i462;
                } else {
                    if (this.J2 == null) {
                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                        if (userProfilePhoto != null) {
                            TLRPC.FileLocation fileLocation = userProfilePhoto.photo_big;
                            if (!(fileLocation instanceof TLRPC.TL_fileLocation_layer97)) {
                            }
                        }
                        zy0 zy0Var = this.n0;
                        if (zy0Var == null || zy0Var.getRealCount() == 0) {
                            int i48 = this.N2;
                            this.O2 = i48;
                            this.N2 = i48 + 2;
                            this.P2 = i48 + 1;
                        }
                    }
                    int i49 = this.N2;
                    this.S2 = i49;
                    this.T2 = i49 + 1;
                    this.V2 = i49 + 2;
                    this.W2 = i49 + 3;
                    this.N2 = i49 + 5;
                    this.d3 = i49 + 4;
                    Set<String> set = getMessagesController().pendingSuggestions;
                    if (set.contains("PREMIUM_GRACE")) {
                        int i50 = this.N2;
                        this.Y2 = i50;
                        this.N2 = i50 + 2;
                        this.Z2 = i50 + 1;
                    } else if (set.contains("VALIDATE_PHONE_NUMBER")) {
                        int i51 = this.N2;
                        this.a3 = i51;
                        this.N2 = i51 + 2;
                        this.X2 = i51 + 1;
                    } else if (set.contains("VALIDATE_PASSWORD")) {
                        int i52 = this.N2;
                        this.c3 = i52;
                        this.N2 = i52 + 2;
                        this.b3 = i52 + 1;
                    }
                    int i53 = this.N2;
                    this.e3 = i53;
                    this.j3 = i53 + 1;
                    this.h3 = i53 + 2;
                    this.f3 = i53 + 3;
                    this.i3 = i53 + 4;
                    this.N2 = i53 + 6;
                    this.l3 = i53 + 5;
                    if (getMessagesController().filtersEnabled || !getMessagesController().dialogFilters.isEmpty()) {
                        int i54 = this.N2;
                        this.N2 = i54 + 1;
                        this.k3 = i54;
                    }
                    int i55 = this.N2;
                    this.n3 = i55;
                    this.g3 = i55 + 1;
                    this.N2 = i55 + 3;
                    this.o3 = i55 + 2;
                    if (!getMessagesController().premiumFeaturesBlocked()) {
                        int i56 = this.N2;
                        this.N2 = i56 + 1;
                        this.c4 = i56;
                    }
                    if (getMessagesController().starsPurchaseAvailable()) {
                        int i57 = this.N2;
                        this.N2 = i57 + 1;
                        this.d4 = i57;
                    }
                    bi.ca.y(this.currentAccount, true).p();
                    if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (bi.ca.y(this.currentAccount, true).e && (bi.ca.y(this.currentAccount, true).N() || bi.ca.y(this.currentAccount, true).p().positive()))) {
                        int i58 = this.N2;
                        this.N2 = i58 + 1;
                        this.e4 = i58;
                    }
                    if (!getMessagesController().premiumFeaturesBlocked()) {
                        int i59 = this.N2;
                        this.N2 = i59 + 1;
                        this.f4 = i59;
                    }
                    if (!getMessagesController().premiumPurchaseBlocked()) {
                        int i60 = this.N2;
                        this.N2 = i60 + 1;
                        this.g4 = i60;
                    }
                    if (this.c4 >= 0 || this.d4 >= 0 || this.e4 >= 0 || this.f4 >= 0 || this.g4 >= 0) {
                        int i61 = this.N2;
                        this.N2 = i61 + 1;
                        this.h4 = i61;
                    }
                    int i62 = this.N2;
                    this.p3 = i62;
                    this.q3 = i62 + 1;
                    this.r3 = i62 + 2;
                    int i63 = i62 + 4;
                    this.N2 = i63;
                    this.s3 = i62 + 3;
                    if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
                        this.t3 = i63;
                        this.N2 = i62 + 6;
                        this.u3 = i62 + 5;
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        int i64 = this.N2;
                        this.v3 = i64;
                        this.w3 = i64 + 1;
                        this.N2 = i64 + 3;
                        this.x3 = i64 + 2;
                    }
                    if (BuildVars.DEBUG_VERSION) {
                        int i65 = this.N2;
                        this.N2 = i65 + 1;
                        this.y3 = i65;
                    }
                    int i66 = this.N2;
                    this.N2 = i66 + 1;
                    this.z3 = i66;
                }
            } else if (this.q1) {
                if (this.A3 < 0 && this.B3 < 0) {
                    if (this.N4 || this.O4 || this.X5 != null || this.Z == null) {
                        int i67 = this.N2;
                        this.N2 = i67 + 1;
                        this.B3 = i67;
                    } else {
                        int i68 = this.N2;
                        this.N2 = i68 + 1;
                        this.A3 = i68;
                    }
                }
                int i69 = this.N2;
                int i70 = i69 + 1;
                this.N2 = i70;
                this.L3 = i69;
                if (this.Z == null) {
                    this.N2 = i69 + 2;
                    this.Q3 = i70;
                }
                int i71 = this.N2;
                int i72 = i71 + 1;
                this.N2 = i72;
                this.R3 = i71;
                if (z10) {
                    this.N2 = i71 + 2;
                    this.P4 = i72;
                }
            } else if (this.f1 != 0) {
                TLRPC.ChatFull chatFull7 = this.u2;
                if ((chatFull7 != null && (!TextUtils.isEmpty(chatFull7.about) || (this.u2.location instanceof TLRPC.TL_channelLocation))) || ChatObject.isPublic(this.E2)) {
                    if (this.A3 < 0 && this.B3 < 0) {
                        if (this.N4 || this.O4 || this.X5 != null || this.Z == null) {
                            int i73 = this.N2;
                            this.N2 = i73 + 1;
                            this.B3 = i73;
                        } else {
                            int i74 = this.N2;
                            this.N2 = i74 + 1;
                            this.A3 = i74;
                        }
                    }
                    if (this.Z == null) {
                        int i75 = this.N2;
                        this.N2 = i75 + 1;
                        this.D3 = i75;
                    }
                    TLRPC.ChatFull chatFull8 = this.u2;
                    if (chatFull8 != null) {
                        if (!TextUtils.isEmpty(chatFull8.about)) {
                            int i76 = this.N2;
                            this.N2 = i76 + 1;
                            this.K3 = i76;
                        }
                        if (this.u2.location instanceof TLRPC.TL_channelLocation) {
                            int i77 = this.N2;
                            this.N2 = i77 + 1;
                            this.I3 = i77;
                        }
                    }
                    if (ChatObject.isPublic(this.E2)) {
                        int i78 = this.N2;
                        this.N2 = i78 + 1;
                        this.L3 = i78;
                    }
                }
                if (this.A3 < 0 && this.B3 < 0) {
                    if (this.N4 || this.O4 || this.X5 != null || this.Z == null) {
                        int i79 = this.N2;
                        this.N2 = i79 + 1;
                        this.B3 = i79;
                    } else {
                        int i80 = this.N2;
                        this.N2 = i80 + 1;
                        this.A3 = i80;
                    }
                }
                if (this.Z == null) {
                    if (this.D3 != -1) {
                        int i81 = this.N2;
                        this.N2 = i81 + 1;
                        this.M3 = i81;
                    }
                    int i82 = this.N2;
                    this.N2 = i82 + 1;
                    this.N3 = i82;
                }
                int i83 = this.N2;
                if (i83 > 0) {
                    this.N2 = i83 + 1;
                    this.R3 = i83;
                }
                TLRPC.Chat chat2 = this.E2;
                if (chat2 != null && chat2.linked_community_id != 0) {
                    int i84 = this.N2;
                    this.q4 = i84;
                    this.N2 = i84 + 2;
                    this.r4 = i84 + 1;
                }
                if (ChatObject.isChannel(chat2)) {
                    TLRPC.Chat chat3 = this.E2;
                    if (!chat3.megagroup) {
                        TLRPC.ChatFull chatFull9 = this.u2;
                        if (chatFull9 != null && (chat3.creator || chatFull9.can_view_participants)) {
                            if (this.Z == null) {
                                int i85 = this.N2;
                                this.N2 = i85 + 1;
                                this.y4 = i85;
                            }
                            int i86 = this.N2;
                            int i87 = i86 + 1;
                            this.N2 = i87;
                            this.C4 = i86;
                            if (chatFull9.requests_pending > 0) {
                                this.N2 = i86 + 2;
                                this.D4 = i87;
                            }
                            int i88 = this.N2;
                            int i89 = i88 + 1;
                            this.N2 = i89;
                            this.E4 = i88;
                            if (chatFull9.banned_count != 0 || chatFull9.kicked_count != 0) {
                                this.N2 = i88 + 2;
                                this.L4 = i89;
                            }
                            if ((chatFull9.can_view_stars_revenue && (bi.m0.g(this.currentAccount).c(-this.f1).amount > 0 || !bi.m0.g(this.currentAccount).k(-this.f1).a[0].isEmpty())) || ((chatFull4 = this.u2) != null && chatFull4.can_view_revenue && bi.m0.g(this.currentAccount).i(-this.f1) > 0)) {
                                int i90 = this.N2;
                                this.N2 = i90 + 1;
                                this.I4 = i90;
                            }
                            int i91 = this.N2;
                            this.F4 = i91;
                            this.N2 = i91 + 2;
                            this.J4 = i91 + 1;
                        }
                        if (ChatObject.isChannel(this.E2)) {
                            TLRPC.ChatFull chatFull10 = this.u2;
                            if (chatFull10 != null) {
                                if (this.q1 || (chatParticipants = chatFull10.participants) == null || chatParticipants.participants == null || (chatParticipants instanceof TLRPC.TL_chatParticipantsForbidden)) {
                                    if (!ChatObject.isNotInChat(this.E2) && ChatObject.canAddUsers(this.E2) && this.u2.participants_hidden) {
                                        int i92 = this.N2;
                                        this.B4 = i92;
                                        this.N2 = i92 + 2;
                                        this.M4 = i92 + 1;
                                    }
                                    vz0 vz0Var = this.N;
                                    if (vz0Var != null) {
                                        vz0Var.y1();
                                    }
                                } else {
                                    if (ChatObject.canAddUsers(this.E2) || (tL_chatBannedRights = this.E2.default_banned_rights) == null || !tL_chatBannedRights.invite_users) {
                                        int i93 = this.N2;
                                        this.N2 = i93 + 1;
                                        this.B4 = i93;
                                    }
                                    if (this.u2.participants.participants.size() <= 5 || !z10) {
                                        if (this.B4 == -1 && this.Z == null) {
                                            int i94 = this.N2;
                                            this.N2 = i94 + 1;
                                            this.y4 = i94;
                                        }
                                        int i95 = this.N2;
                                        this.z4 = i95;
                                        int size2 = this.u2.participants.participants.size() + i95;
                                        this.A4 = size2;
                                        this.N2 = size2 + 1;
                                        this.M4 = size2;
                                        arrayList2.addAll(this.u2.participants.participants);
                                        ArrayList arrayList4 = this.C2;
                                        if (arrayList4 != null) {
                                            arrayList3.addAll(arrayList4);
                                        }
                                        vz0 vz0Var2 = this.N;
                                        if (vz0Var2 != null) {
                                            vz0Var2.g1(null, null);
                                        }
                                    } else {
                                        if (this.B4 != -1) {
                                            int i96 = this.N2;
                                            this.N2 = i96 + 1;
                                            this.M4 = i96;
                                        }
                                        vz0 vz0Var3 = this.N;
                                        if (vz0Var3 != null) {
                                            vz0Var3.g1(this.C2, this.u2);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (this.q1 || (chatFull3 = this.u2) == null || !this.E2.megagroup || (chatParticipants2 = chatFull3.participants) == null || (arrayList = chatParticipants2.participants) == null || arrayList.isEmpty()) {
                                if (!ChatObject.isNotInChat(this.E2) && ChatObject.canAddUsers(this.E2) && (chatFull2 = this.u2) != null && chatFull2.participants_hidden) {
                                    int i97 = this.N2;
                                    this.B4 = i97;
                                    this.N2 = i97 + 2;
                                    this.M4 = i97 + 1;
                                }
                                vz0 vz0Var4 = this.N;
                                if (vz0Var4 != null) {
                                    vz0Var4.y1();
                                }
                            } else {
                                if (!ChatObject.isNotInChat(this.E2) && ChatObject.canAddUsers(this.E2) && this.u2.participants_count < getMessagesController().maxMegagroupCount) {
                                    int i98 = this.N2;
                                    this.N2 = i98 + 1;
                                    this.B4 = i98;
                                }
                                int size3 = this.u2.participants.participants.size();
                                if ((size3 <= 5 || !z10 || this.Y4 == 1) && this.Y4 != 2) {
                                    if (this.B4 == -1 && this.Z == null) {
                                        int i99 = this.N2;
                                        this.N2 = i99 + 1;
                                        this.y4 = i99;
                                    }
                                    int i100 = this.N2;
                                    this.z4 = i100;
                                    int i101 = i100 + size3;
                                    this.A4 = i101;
                                    this.N2 = i101 + 1;
                                    this.M4 = i101;
                                    arrayList2.addAll(this.u2.participants.participants);
                                    ArrayList arrayList5 = this.C2;
                                    if (arrayList5 != null) {
                                        arrayList3.addAll(arrayList5);
                                    }
                                    this.Y4 = 1;
                                    vz0 vz0Var5 = this.N;
                                    if (vz0Var5 != null) {
                                        vz0Var5.g1(null, null);
                                    }
                                } else {
                                    if (this.B4 != -1) {
                                        int i102 = this.N2;
                                        this.N2 = i102 + 1;
                                        this.M4 = i102;
                                    }
                                    if (this.N != null) {
                                        if (!this.C2.isEmpty()) {
                                            this.Y4 = 2;
                                        }
                                        this.N.g1(this.C2, this.u2);
                                    }
                                }
                            }
                            if (this.S4 == -1) {
                                TLRPC.Chat chat4 = this.E2;
                                if (chat4.left && !chat4.kicked) {
                                    long j13 = MessagesController.getNotificationsSettings(this.currentAccount).getLong("dialog_join_requested_time_" + this.i1, -1L);
                                    if (j13 <= 0 || System.currentTimeMillis() - j13 >= 120000) {
                                        org.telegram.ui.Components.bi0 bi0Var2 = this.Z;
                                        if (bi0Var2 == null || !bi0Var2.f()) {
                                            int i103 = this.N2;
                                            this.R4 = i103;
                                            this.N2 = i103 + 2;
                                            this.S4 = i103 + 1;
                                        }
                                        if (z10) {
                                            int i104 = this.N2;
                                            this.N2 = i104 + 1;
                                            this.P4 = i104;
                                        }
                                        if (this.P4 == -1) {
                                            int i105 = this.N2;
                                            this.N2 = i105 + 1;
                                            this.C3 = i105;
                                        }
                                        if (this.actionBar != null) {
                                            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                                        } else {
                                            i10 = 0;
                                        }
                                        if (this.a != null && i12 <= this.N2) {
                                            i11 = this.E0;
                                            if (i11 != 0) {
                                            }
                                            py0Var = this.a;
                                            if (py0Var != null) {
                                                py0Var.setTranslateSelectorPosition(this.O3);
                                            }
                                            bi0Var = this.Z;
                                            if (bi0Var != null) {
                                                bi0Var.o(7, z13);
                                            }
                                            ui0Var = this.b0;
                                            if (ui0Var != null) {
                                                TLRPC.UserFull userFull15 = this.v2;
                                                if (userFull15 != null) {
                                                    ui0Var.setMusicDocument(userFull15.saved_music);
                                                }
                                                this.b0.setVisibility(this.N4 ? 0 : 8);
                                                if (this.O4) {
                                                    this.c0.setBalance(this.v2.wallet_card.balance);
                                                }
                                                this.c0.setVisibility(this.O4 ? 0 : 8);
                                                this.b0.invalidate();
                                                this.c0.invalidate();
                                                return;
                                            }
                                            return;
                                        }
                                        this.C0 = 0;
                                        py0Var = this.a;
                                        if (py0Var != null) {
                                        }
                                        bi0Var = this.Z;
                                        if (bi0Var != null) {
                                        }
                                        ui0Var = this.b0;
                                        if (ui0Var != null) {
                                        }
                                    }
                                }
                            }
                        }
                        z13 = false;
                        if (z10) {
                        }
                        if (this.P4 == -1) {
                        }
                        if (this.actionBar != null) {
                        }
                        if (this.a != null) {
                            i11 = this.E0;
                            if (i11 != 0) {
                            }
                            py0Var = this.a;
                            if (py0Var != null) {
                            }
                            bi0Var = this.Z;
                            if (bi0Var != null) {
                            }
                            ui0Var = this.b0;
                            if (ui0Var != null) {
                            }
                        }
                        this.C0 = 0;
                        py0Var = this.a;
                        if (py0Var != null) {
                        }
                        bi0Var = this.Z;
                        if (bi0Var != null) {
                        }
                        ui0Var = this.b0;
                        if (ui0Var != null) {
                        }
                    }
                }
                TLRPC.ChatFull chatFull11 = this.u2;
                if ((chatFull11 != null && chatFull11.can_view_stars_revenue && (bi.m0.g(this.currentAccount).c(-this.f1).amount > 0 || !bi.m0.g(this.currentAccount).k(-this.f1).a[0].isEmpty())) || ((chatFull = this.u2) != null && chatFull.can_view_revenue && bi.m0.g(this.currentAccount).i(-this.f1) > 0)) {
                    int i106 = this.N2;
                    this.I4 = i106;
                    this.N2 = i106 + 2;
                    this.J4 = i106 + 1;
                }
                if (ChatObject.isChannel(this.E2)) {
                }
                z13 = false;
                if (z10) {
                }
                if (this.P4 == -1) {
                }
                if (this.actionBar != null) {
                }
                if (this.a != null) {
                }
                this.C0 = 0;
                py0Var = this.a;
                if (py0Var != null) {
                }
                bi0Var = this.Z;
                if (bi0Var != null) {
                }
                ui0Var = this.b0;
                if (ui0Var != null) {
                }
            }
            z13 = false;
            if (this.P4 == -1) {
            }
            if (this.actionBar != null) {
            }
            if (this.a != null) {
            }
            this.C0 = 0;
            py0Var = this.a;
            if (py0Var != null) {
            }
            bi0Var = this.Z;
            if (bi0Var != null) {
            }
            ui0Var = this.b0;
            if (ui0Var != null) {
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
        if (this.P4 == -1) {
        }
        if (this.actionBar != null) {
        }
        if (this.a != null) {
        }
        this.C0 = 0;
        py0Var = this.a;
        if (py0Var != null) {
        }
        bi0Var = this.Z;
        if (bi0Var != null) {
        }
        ui0Var = this.b0;
        if (ui0Var != null) {
        }
    }

    public final void w4() {
        TLRPC.UserFull userFull = this.v2;
        if (userFull == null || !UserObject.areGiftsDisabled(userFull)) {
            if (this.E2 != null) {
                org.telegram.ui.Components.u40.h.a();
            }
            showDialog(new zh.p1(getParentActivity(), this.currentAccount, a(), null, null));
        } else {
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (U != null) {
                org.telegram.ui.Components.wc.b0(U).R(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(a())))).j();
            }
        }
    }

    public final void w5() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.j0 == null || (imageView = this.k0) == null) {
            return;
        }
        if (!this.L1 || (chat = this.E2) == null || (chat.flags2 & 2048) == 0) {
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

    public final void x4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().addUserToChat(this.E2.id, getUserConfig().getCurrentUser(), 0, null, this, true, new d80(this, z10, zArr, 8), new ea.b(this, zArr, z10, this.parentLayout.getLastFragment(), 6));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
    }

    public final void x5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        if ((this.u0 == null && this.v0 == null) || (kVar = this.actionBar) == null) {
            return;
        }
        float f7 = kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0.0f;
        float width = this.actionBar.getWidth();
        float max = this.actionBar.getBackButton() != null ? Math.max(0.0f, this.actionBar.getBackButton().getRight()) : 0.0f;
        if (this.actionBar.E != null) {
            for (int i10 = 0; i10 < this.actionBar.E.getChildCount(); i10++) {
                View childAt = this.actionBar.E.getChildAt(i10);
                if (childAt.getAlpha() > 0.0f && childAt.getVisibility() == 0) {
                    float left = this.actionBar.E.getLeft() + ((int) childAt.getX());
                    if (left < width) {
                        width = AndroidUtilities.lerp(width, left, childAt.getAlpha());
                    }
                }
            }
        }
        bz0 bz0Var = this.u0;
        if (bz0Var != null) {
            float B = c3.h0.B(this.actionBar.getHeight(), f7, 2.0f, f7);
            boolean z11 = Math.abs(max - bz0Var.f0) > 0.1f || Math.abs(width - bz0Var.g0) > 0.1f || Math.abs(B - bz0Var.h0) > 0.1f;
            bz0Var.f0 = max;
            bz0Var.g0 = width;
            if (z10) {
                bz0Var.m0.d(width, true);
            }
            bz0Var.h0 = B;
            if (z11) {
                bz0Var.invalidate();
            }
        }
        bi.i1 i1Var = this.v0;
        if (i1Var != null) {
            float B2 = c3.h0.B(this.actionBar.getHeight(), f7, 2.0f, f7);
            int d42 = d4();
            boolean z12 = Math.abs(max - i1Var.r) > 0.1f || Math.abs(width - i1Var.s) > 0.1f || Math.abs(B2 - i1Var.v) > 0.1f;
            i1Var.r = max;
            i1Var.s = width;
            if (z10) {
                i1Var.y.d(width, true);
            }
            i1Var.v = B2;
            i1Var.x = d42 + B2;
            if (z12) {
                i1Var.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.og0
    public final hh.d y() {
        return this.B6;
    }

    public final void y4(View view, float f7, float f10, boolean z10) {
        float f11;
        float f12;
        long j10;
        long j11 = this.i1;
        if (j11 == 0) {
            j11 = this.e1;
            if (j11 == 0) {
                j11 = -this.f1;
            }
        }
        long j12 = j11;
        boolean isDialogMuted = getMessagesController().isDialogMuted(j12, this.g1);
        if (z10 && (this.q1 || isDialogMuted)) {
            boolean z11 = !isDialogMuted;
            getNotificationsController().muteDialog(j12, this.g1, z11);
            org.telegram.ui.Components.wc.A(this, z11, null).j();
            m5();
            this.Z.setNotifications(isDialogMuted);
            return;
        }
        if ((z10 || !LocaleController.isRTL || f7 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f7 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(getParentActivity(), this.currentAccount, null, true, new a8.lg(this, j12, 7), this.z0);
            bpVar.e(j12, this.g1, this.n5);
            if (AndroidUtilities.isTablet()) {
                ViewGroup view2 = this.parentLayout.getView();
                f11 = view2.getX() + view2.getPaddingLeft() + f7;
                f12 = view2.getY() + view2.getPaddingTop() + f10;
            } else {
                f11 = f7;
                f12 = f10;
            }
            if (z10) {
                f12 += this.Z.getHeight() - AndroidUtilities.dp(12.0f);
            }
            bpVar.d(this, view, f11, f12, z10);
            return;
        }
        org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
        boolean z12 = n5Var.e.h;
        boolean z13 = !z12;
        boolean isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j12, false, false);
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j12, this.g1);
        if (z12) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            if (isGlobalNotificationsEnabled) {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey, 2);
                j10 = 1;
            } else {
                edit.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                j10 = 0L;
            }
            getNotificationsController().removeNotificationsForDialog(j12);
            if (this.g1 == 0) {
                getMessagesStorage().setDialogFlags(j12, j10);
                TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j12);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (isGlobalNotificationsEnabled) {
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
        } else {
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            if (isGlobalNotificationsEnabled) {
                edit2.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
            } else {
                edit2.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey, 0);
            }
            if (this.g1 == 0) {
                getMessagesStorage().setDialogFlags(j12, 0L);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j12);
                if (dialog2 != null) {
                    dialog2.notify_settings = new TLRPC.TL_peerNotifySettings();
                }
            }
            edit2.apply();
        }
        m5();
        getNotificationsController().updateServerNotificationsSettings(j12, this.g1);
        n5Var.setChecked(z13);
        r5(true);
    }

    public final void y5() {
        org.telegram.ui.Components.vs0 vs0Var;
        hh.c[] cVarArr = this.L6;
        if (cVarArr != null) {
            for (hh.c cVar : cVarArr) {
                try {
                    if (cVar != null) {
                        cVar.a(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, this.z0));
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            FrameLayout frameLayout = this.y5;
            if (frameLayout != null) {
                frameLayout.invalidate();
            }
        }
        z10 z10Var = this.T;
        if (z10Var != null && (z10Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.T.getForeground()).setColor(i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, this.z0), 100));
        }
        float f7 = this.K5;
        Drawable drawable = this.y;
        int[] iArr = this.Q6;
        if (drawable != null) {
            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zh, this.z0), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oi, this.z0), f7, 1.0f);
            int i10 = iArr[6];
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            if (offsetColor != i10) {
                drawable.setColorFilter(new PorterDuffColorFilter(offsetColor, mode));
            }
            iArr[6] = offsetColor;
        }
        Drawable drawable2 = this.M6;
        if (drawable2 != null) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.V6, this.z0);
            int i11 = iArr[3];
            PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
            if (w02 != i11) {
                drawable2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
            }
            iArr[3] = w02;
        }
        Drawable drawable3 = this.N6;
        if (drawable3 != null) {
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v8, this.z0);
            int i12 = iArr[4];
            PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
            if (w03 != i12) {
                drawable3.setColorFilter(new PorterDuffColorFilter(w03, mode3));
            }
            iArr[4] = w03;
        }
        Drawable drawable4 = this.O6;
        if (drawable4 != null) {
            int w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.F8, this.z0);
            int i13 = iArr[5];
            PorterDuff.Mode mode4 = PorterDuff.Mode.SRC_IN;
            if (w04 != i13) {
                drawable4.setColorFilter(new PorterDuffColorFilter(w04, mode4));
            }
            iArr[5] = w04;
        }
        vz0 vz0Var = this.N;
        if (vz0Var != null && (vs0Var = vz0Var.a0) != null) {
            try {
                hh.c cVar2 = vs0Var.U;
                if (cVar2 != null) {
                    cVar2.a(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, vs0Var.f));
                    vs0Var.invalidate();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        org.telegram.ui.Components.zq zqVar = this.P6;
        if (zqVar != null) {
            zqVar.setOverrideColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.wj, this.z0));
            if (this.a != null) {
                for (int i14 = 0; i14 < this.a.getChildCount(); i14++) {
                    View childAt = this.a.getChildAt(i14);
                    if (childAt != null) {
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    public final void z4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.e1 != 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e1));
                if (user == null) {
                    return;
                }
                if (this.F2 == null || (userFull = this.v2) == null || TextUtils.isEmpty(userFull.about)) {
                    str = String.format("https://" + getMessagesController().linkPrefix + "/%s", UserObject.getPublicUsername(user));
                } else {
                    str = String.format("%s https://" + getMessagesController().linkPrefix + "/%s", this.v2.about, UserObject.getPublicUsername(user));
                }
            } else if (this.f1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f1));
                if (chat == null) {
                    return;
                }
                TLRPC.ChatFull chatFull = this.u2;
                if (chatFull == null || TextUtils.isEmpty(chatFull.about)) {
                    str = String.format("https://" + getMessagesController().linkPrefix + "/%s", ChatObject.getPublicUsername(chat));
                } else {
                    str = String.format("%s\nhttps://" + getMessagesController().linkPrefix + "/%s", this.u2.about, ChatObject.getPublicUsername(chat));
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
            startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.BotShare)), 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
    
        if (r0.ttl_period > 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0025, code lost:
    
        if (r4.u2.ttl_period > 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z5() {
        boolean z10;
        if (this.Y0 == null) {
            return;
        }
        if (this.D2 == null) {
            TLRPC.UserFull userFull = this.v2;
            z10 = true;
            if (userFull != null) {
            }
            if (this.u2 != null) {
                if (ChatObject.canUserDoAdminAction(this.E2, 13)) {
                }
            }
        }
        z10 = false;
        AndroidUtilities.updateViewVisibilityAnimated(this.Y0, z10, 0.8f, this.r5);
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.sv0 sv0Var) {
        super(bundle);
        this.h = null;
        this.n = null;
        this.w0 = null;
        this.x0 = new org.telegram.ui.Components.r50(this, 2);
        this.y0 = new Paint(1);
        this.J0 = new boolean[1];
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
        this.W4 = new ArrayList();
        this.X4 = new ArrayList();
        this.Y4 = 0;
        this.Z4 = true;
        this.a5 = true;
        this.d5 = 0;
        this.e5 = 0;
        this.f5 = 0;
        this.g5 = 0L;
        this.n5 = new HashSet();
        this.p5 = new org.telegram.ui.Cells.b2(this);
        this.q5 = new kz0(this);
        this.G5 = new oe.b(0, new wx0(this, 8), org.telegram.ui.Components.ds.h, 380L, true);
        this.M5 = new jz0(this);
        this.P5 = new mz0(this, 1);
        this.Q5 = null;
        this.Y5 = new SparseIntArray();
        this.a6 = null;
        this.b6 = -1;
        this.g6 = new int[3];
        this.h6 = -1.0f;
        hh.b bVar = new hh.b();
        this.E6 = bVar;
        ch.b bVar2 = new ch.b(bVar);
        this.F6 = bVar2;
        ArrayList arrayList = new ArrayList();
        this.I6 = arrayList;
        RectF rectF = new RectF();
        this.J6 = rectF;
        RectF rectF2 = new RectF();
        this.K6 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.L6 = new hh.c[2];
        this.Q6 = new int[7];
        this.Q = sv0Var;
        hh.c cVar = new hh.c();
        this.C6 = cVar;
        cVar.a(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, this.z0));
        if (Build.VERSION.SDK_INT >= 31) {
            this.A6 = new ch.f();
            hh.d dVar = new hh.d(null);
            this.B6 = dVar;
            ch.b bVar3 = new ch.b(dVar);
            this.D6 = bVar3;
            bVar3.i = LiteMode.isEnabled(262144);
        } else {
            this.A6 = null;
            this.B6 = null;
            this.D6 = new ch.b(cVar);
        }
        bVar2.e = new se.b();
    }

    @Override // org.telegram.ui.og0
    public final /* synthetic */ void D() {
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ void Q() {
    }
}
