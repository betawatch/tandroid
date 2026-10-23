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
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public class ProfileActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, xx, org.telegram.ui.Components.qv0, org.telegram.ui.Components.d50, org.telegram.ui.Components.ju0, qg0 {
    public org.telegram.ui.ActionBar.g6 A0;
    public boolean A1;
    public CharSequence A2;
    public int A3;
    public int A4;
    public FrameLayout A5;
    public final ArrayList A6;
    public int B0;
    public boolean B1;
    public long B2;
    public int B3;
    public int B4;
    public ei.d B5;
    public final RectF B6;
    public ImageLocation C0;
    public boolean C1;
    public int C2;
    public int C3;
    public int C4;
    public final ne.b C5;
    public final RectF C6;
    public int D0;
    public a0.h D1;
    public ArrayList D2;
    public int D3;
    public int D4;
    public cz0 D5;
    public final gh.c[] D6;
    public final Drawable[] E;
    public int E0;
    public boolean E1;
    public TLRPC.EncryptedChat E2;
    public int E3;
    public int E4;
    public AnimatorSet E5;
    public Drawable E6;
    public Long F;
    public int F0;
    public long F1;
    public TLRPC.Chat F2;
    public int F3;
    public int F4;
    public AnimatorSet F5;
    public Drawable F6;
    public final org.telegram.ui.Components.p5[] G;
    public boolean G0;
    public float G1;
    public TL_bots.BotInfo G2;
    public int G3;
    public int G4;
    public float G5;
    public Drawable G6;
    public final org.telegram.ui.Components.p5[] H;
    public boolean H0;
    public boolean H1;
    public TLRPC.ChannelParticipant H2;
    public int H3;
    public int H4;
    public boolean H5;
    public org.telegram.ui.Components.xq H6;
    public final Drawable[] I;
    public boolean I0;
    public boolean I1;
    public TL_account.TL_password I2;
    public int I3;
    public int I4;
    public final hz0 I5;
    public final int[] I6;
    public final org.telegram.ui.Components.as[] J;
    public boolean J0;
    public boolean J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public boolean J4;
    public boolean J5;
    public final org.telegram.ui.Components.as[] K;
    public final boolean[] K0;
    public int K1;
    public TLRPC.FileLocation K2;
    public int K3;
    public boolean K4;
    public final iz0 K5;
    public org.telegram.ui.Components.zm0 L;
    public boolean L0;
    public boolean L1;
    public ImageLocation L2;
    public int L3;
    public int L4;
    public float[] L5;
    public UndoView M;
    public boolean M0;
    public boolean M1;
    public final Rect M2;
    public int M3;
    public int M4;
    public float M5;
    public g01 N;
    public boolean N0;
    public boolean N1;
    public org.telegram.ui.Cells.r8 N2;
    public int N3;
    public int N4;
    public float N5;
    public rz0 O;
    public boolean O0;
    public boolean O1;
    public int O2;
    public int O3;
    public int O4;
    public boolean O5;
    public org.telegram.ui.Components.wx0 P;
    public ImageView P0;
    public boolean P1;
    public int P2;
    public int P3;
    public boolean P4;
    public a01 P5;
    public boolean Q;
    public org.telegram.ui.ActionBar.u0 Q0;
    public boolean Q1;
    public int Q2;
    public int Q3;
    public boolean Q4;
    public float Q5;
    public org.telegram.ui.Components.pv0 R;
    public org.telegram.ui.ActionBar.u0 R0;
    public float R1;
    public int R2;
    public int R3;
    public int R4;
    public float R5;
    public boolean S;
    public org.telegram.ui.ActionBar.u0 S0;
    public float S1;
    public int S2;
    public int S3;
    public final ArrayList S4;
    public MessagesController.PeerColor S5;
    public org.telegram.ui.Components.hx0 T;
    public org.telegram.ui.ActionBar.u0 T0;
    public float T1;
    public int T2;
    public int T3;
    public final ArrayList T4;
    public final SparseIntArray T5;
    public e50 U;
    public org.telegram.ui.ActionBar.u0 U0;
    public int U1;
    public int U2;
    public int U3;
    public int U4;
    public int U5;
    public org.telegram.ui.Components.yj0 V;
    public org.telegram.ui.ActionBar.u0 V0;
    public float V1;
    public int V2;
    public int V3;
    public boolean V4;
    public AnimatorSet V5;
    public org.telegram.ui.Components.yj0 W;
    public org.telegram.ui.ActionBar.e1 W0;
    public ValueAnimator W1;
    public int W2;
    public int W3;
    public boolean W4;
    public int W5;
    public org.telegram.ui.Components.r40 X;
    public org.telegram.ui.ActionBar.e1 X0;
    public boolean X1;
    public int X2;
    public int X3;
    public az0 X4;
    public int X5;
    public l0 Y;
    public org.telegram.ui.ActionBar.e1 Y0;
    public FlagSecureReason Y1;
    public int Y2;
    public int Y3;
    public View Y4;
    public boolean Y5;
    public ah.v Z;
    public ImageView Z0;
    public final HashMap Z1;
    public int Z2;
    public int Z3;
    public int Z4;
    public boolean Z5;
    public ly0 a;
    public org.telegram.ui.Components.ci0 a0;
    public org.telegram.ui.ActionBar.e1 a1;
    public float a2;
    public int a3;
    public int a4;
    public int a5;
    public org.telegram.ui.Components.bk0 a6;
    public org.telegram.ui.Components.mm0 b;
    public MessagesController.SavedMusicList b0;
    public org.telegram.ui.Components.p8 b1;
    public float b2;
    public int b3;
    public int b4;
    public int b5;
    public final int[] b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public oy0 c;
    public org.telegram.ui.Components.vi0 c0;
    public float c1;
    public float c2;
    public int c3;
    public int c4;
    public long c5;
    public float c6;
    public f01 d;
    public org.telegram.ui.Components.di0 d0;
    public int d1;
    public float d2;
    public int d3;
    public int d4;
    public boolean d5;
    public float d6;
    public q01 e;
    public org.telegram.ui.Cells.o e0;
    public t01 e1;
    public float e2;
    public int e3;
    public int e4;
    public boolean e5;
    public float e6;
    public final org.telegram.ui.ActionBar.n5[] f;
    public vy0 f0;
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
    public org.telegram.ui.Cells.y3 h0;
    public long h1;
    public float h2;
    public int h3;
    public int h4;
    public String h5;
    public r01 h6;
    public ImageView i0;
    public boolean i1;
    public float i2;
    public int i3;
    public int i4;
    public org.telegram.ui.Components.bh i5;
    public x01 i6;
    public ImageView j0;
    public long j1;
    public float j2;
    public int j3;
    public int j4;
    public final HashSet j5;
    public ei.x3 j6;
    public ImageView k0;
    public boolean k1;
    public ValueAnimator k2;
    public int k3;
    public int k4;
    public CharacterStyle k5;
    public int k6;
    public ImageView l0;
    public boolean l1;
    public float l2;
    public int l3;
    public int l4;
    public final org.telegram.ui.Cells.c2 l5;
    public Boolean l6;
    public org.telegram.ui.Components.w21 m0;
    public boolean m1;
    public float m2;
    public int m3;
    public int m4;
    public final gz0 m5;
    public TLRPC.TL_emojiStatusCollectible m6;
    public String n;
    public org.telegram.ui.Components.fi0 n0;
    public long n1;
    public final float[] n2;
    public int n3;
    public int n4;
    public boolean n5;
    public int n6;
    public wy0 o0;
    public boolean o1;
    public boolean o2;
    public int o3;
    public int o4;
    public pz0 o5;
    public boolean o6;
    public i01 p0;
    public boolean p1;
    public boolean p2;
    public int p3;
    public int p4;
    public float p5;
    public int p6;
    public org.telegram.ui.Components.h9 q0;
    public boolean q1;
    public boolean q2;
    public int q3;
    public int q4;
    public float q5;
    public int q6;
    public final org.telegram.ui.ActionBar.n5[] r;
    public org.telegram.ui.Components.e50 r0;
    public boolean r1;
    public final Paint r2;
    public int r3;
    public int r4;
    public boolean r5;
    public int r6;
    public org.telegram.ui.Components.fp0 s;
    public int s0;
    public boolean s1;
    public boolean s2;
    public int s3;
    public int s4;
    public boolean s5;
    public final bh.f s6;
    public org.telegram.ui.Components.w21 t0;
    public boolean t1;
    public gi.u0 t2;
    public int t3;
    public int t4;
    public ImageReceiver t5;
    public final gh.d t6;
    public org.telegram.ui.Components.si0 u0;
    public boolean u1;
    public gi.r u2;
    public int u3;
    public int u4;
    public FrameLayout u5;
    public final gh.c u6;
    public org.telegram.ui.Components.bk0 v;
    public yy0 v0;
    public int v1;
    public TLRPC.ChatFull v2;
    public int v3;
    public int v4;
    public FrameLayout[] v5;
    public final bh.b v6;
    public AnimatorSet w;
    public ai.j1 w0;
    public boolean w1;
    public TLRPC.UserFull w2;
    public int w3;
    public int w4;
    public SpannableStringBuilder w5;
    public final gh.b w6;
    public Drawable x;
    public View x0;
    public boolean x1;
    public org.telegram.ui.Cells.g6 x2;
    public int x3;
    public int x4;
    public SpannableStringBuilder x5;
    public final bh.b x6;
    public final Drawable[] y;
    public final org.telegram.ui.Components.p50 y0;
    public boolean y1;
    public boolean y2;
    public int y3;
    public int y4;
    public ei.d[] y5;
    public ih.k y6;
    public final Paint z0;
    public int z1;
    public u01 z2;
    public int z3;
    public int z4;
    public org.telegram.messenger.s8 z5;
    public cy0 z6;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static void B0(ProfileActivity profileActivity) {
        RectF rectF = profileActivity.C6;
        bh.f fVar = profileActivity.s6;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (profileActivity.fragmentView.getMeasuredHeight() - profileActivity.r6) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        profileActivity.B6.set(0.0f, -dp, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.actionBar.getMeasuredHeight() + dp);
        rectF.set(0.0f, dp2, profileActivity.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(2, profileActivity.A6);
        fVar.e(profileActivity.z6, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.fragmentView.getMeasuredHeight());
    }

    public static void G0(ProfileActivity profileActivity, int i10) {
        boolean z02 = org.telegram.ui.Components.xv0.z0(profileActivity.O.getClosestTab());
        if (i10 == profileActivity.n6 && z02 == profileActivity.o6) {
            return;
        }
        profileActivity.n6 = i10;
        profileActivity.o6 = z02;
        if (z02) {
            if (i10 > 0) {
                profileActivity.y5[0].i(LocaleController.formatPluralString("HideStoriesFromAlbum", i10, new Object[0]), true, true);
                return;
            } else {
                profileActivity.y5[0].i(profileActivity.x5, true, true);
                return;
            }
        }
        if (i10 > 0 || !MessagesController.getInstance(profileActivity.currentAccount).storiesEnabled()) {
            profileActivity.y5[0].i(LocaleController.formatPluralString("ArchiveStories", i10, new Object[0]), true, true);
        } else {
            profileActivity.y5[0].i(profileActivity.w5, true, true);
        }
    }

    public static ValueAnimator H0(final ProfileActivity profileActivity, final boolean z10) {
        org.telegram.ui.ActionBar.n5[] n5VarArr = profileActivity.r;
        if (z10) {
            AndroidUtilities.requestAdjustResize(profileActivity.getParentActivity(), profileActivity.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.W1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.W1.cancel();
        }
        ai.j1 j1Var = profileActivity.w0;
        if (j1Var != null) {
            j1Var.setActive(!z10);
        }
        int i10 = 0;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(profileActivity.V1, z10 ? 0.0f : 1.0f);
        final float f7 = profileActivity.R1;
        profileActivity.b.setTranslationY(f7);
        profileActivity.b.setVisibility(0);
        profileActivity.V0.setVisibility(0);
        profileActivity.a.setVisibility(0);
        profileActivity.m4(true);
        profileActivity.Y.setVisibility(0);
        profileActivity.f[1].setVisibility(0);
        n5VarArr[1].setVisibility(0);
        n5VarArr[3].setVisibility(0);
        profileActivity.actionBar.v(profileActivity.V1 > 0.5f);
        int i11 = profileActivity.V1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
        if (u0Var != null) {
            u0Var.setVisibility(i11);
        }
        profileActivity.V0.setVisibility(i11);
        profileActivity.V0.getSearchContainer().setVisibility(profileActivity.V1 <= 0.5f ? 0 : 8);
        profileActivity.b.setEmptyView(profileActivity.P);
        profileActivity.Y.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.jy0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.i0(ProfileActivity.this, ofFloat, f7, z10);
            }
        });
        ofFloat.addListener(new jz0(profileActivity, z10, i10));
        if (!z10) {
            profileActivity.W4 = true;
            profileActivity.H4();
            AndroidUtilities.requestAdjustNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.bs.f);
        profileActivity.W1 = ofFloat;
        return ofFloat;
    }

    public static SpannableStringBuilder I3(String str, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        kz0 kz0Var = new kz0(9);
        kz0Var.v = str;
        if (kz0Var.c != null) {
            kz0Var.c = null;
            kz0Var.a();
        }
        kz0Var.f = w02;
        kz0Var.n = false;
        spannableStringBuilder.setSpan(kz0Var, 0, spannableStringBuilder.length(), 0);
        o00[] o00VarArr = (o00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o00.class);
        if (o00VarArr != null) {
            for (o00 o00Var : o00VarArr) {
                o00Var.getClass();
                o00Var.f = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
                o00Var.r = i10;
                o00Var.s = g6Var;
                o00Var.n = true;
            }
        }
        return spannableStringBuilder;
    }

    public static void J4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(activity, 3, null);
        c2Var.i0 = false;
        c2Var.show();
        Utilities.globalQueue.postRunnable(new v90(c2Var, z10, activity, 8));
    }

    public static void O4(Drawable drawable, int i10, int i11, PorterDuff.Mode mode) {
        if (i10 != i11) {
            drawable.setColorFilter(new PorterDuffColorFilter(i10, mode));
        }
    }

    public static void S0(ProfileActivity profileActivity, String str, StringBuilder sb2) {
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

    public static void U(ProfileActivity profileActivity) {
        TLRPC.Document f7;
        org.telegram.ui.Components.qc h;
        if (profileActivity.K2 != null) {
            return;
        }
        if (!profileActivity.r1 || profileActivity.getMessagesController().premiumFeaturesBlocked()) {
            if (profileActivity.M3()) {
                return;
            }
            profileActivity.y4(false);
            return;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = profileActivity.getMessagesController().getTopicsController().getTopics(profileActivity.g1);
        if (topics != null) {
            TLRPC.TL_forumTopic tL_forumTopic = null;
            for (int i10 = 0; tL_forumTopic == null && i10 < topics.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i10);
                if (tL_forumTopic2 != null && tL_forumTopic2.id == profileActivity.h1) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
            if (tL_forumTopic != null) {
                long j10 = tL_forumTopic.icon_emoji_id;
                if (j10 == 0 || (f7 = org.telegram.ui.Components.r5.f(profileActivity.currentAccount, j10)) == null || (h = org.telegram.ui.Components.xc.a0(profileActivity).h(f7, 1, new zx0(profileActivity, 2))) == null) {
                    return;
                }
                h.j();
            }
        }
    }

    public static /* synthetic */ void V(ProfileActivity profileActivity) {
        MessagesController.getInstance(profileActivity.currentAccount).deleteUserPhoto(null);
        profileActivity.V.M(0);
        profileActivity.W.M(0);
    }

    public static void V0(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.d2, 0.25f) / 0.25f;
        if (profileActivity.r1) {
            profileActivity.u0.setAlpha(1.0f - min);
            profileActivity.u0.setBlurIntensity(0.0f);
            profileActivity.u0.setGooeyEnabled(false);
        } else {
            profileActivity.u0.setPullProgress(profileActivity.d2);
            profileActivity.u0.setBlurIntensity(Math.min((w7.r.a(profileActivity.d2, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
            org.telegram.ui.Components.si0 si0Var = profileActivity.u0;
            float f7 = profileActivity.d2;
            si0Var.setGooeyEnabled(f7 > 0.0f && f7 < 1.0f);
        }
        yy0 yy0Var = profileActivity.v0;
        if (yy0Var != null && profileActivity.K1 != 2) {
            float f10 = profileActivity.d2;
            yy0Var.setAlpha(f10 > 0.0f ? AndroidUtilities.lerp(1.0f, 0.0f, AndroidUtilities.ilerp(f10, 0.0f, 0.5f)) : 1.0f);
        }
        profileActivity.u0.setVisibility(profileActivity.d2 >= 1.0f ? 8 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(ProfileActivity profileActivity, int i10) {
        boolean z10;
        if (i10 < 0) {
            return;
        }
        Object valueOf = Integer.valueOf(profileActivity.U2);
        q01 q01Var = profileActivity.e;
        if (!q01Var.w) {
            if (!q01Var.v.isEmpty()) {
                i10--;
            }
            if (i10 < 0 || i10 >= profileActivity.e.v.size()) {
                int g10 = com.google.android.gms.internal.play_billing.k3.g(1, i10, profileActivity.e.v);
                if (g10 >= 0 && g10 < profileActivity.e.d.size()) {
                    valueOf = profileActivity.e.d.get(g10);
                    z10 = false;
                    if (!(valueOf instanceof p01)) {
                        p01 p01Var = (p01) valueOf;
                        org.telegram.ui.ActionBar.h5 parentLayout = profileActivity.getParentLayout();
                        p01Var.b.run();
                        AndroidUtilities.scrollToFragmentRow(parentLayout, p01Var.c);
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
        } else if (i10 < q01Var.r.size()) {
            valueOf = profileActivity.e.r.get(i10);
        } else {
            int g11 = com.google.android.gms.internal.play_billing.k3.g(1, i10, profileActivity.e.r);
            if (g11 >= 0 && g11 < profileActivity.e.s.size()) {
                valueOf = profileActivity.e.s.get(g11);
            }
        }
        z10 = true;
        if (!(valueOf instanceof p01)) {
        }
        if (z10) {
        }
    }

    public static /* synthetic */ void X(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.J2 = fileLocation;
            profileActivity.K2 = photoSize2.location;
            profileActivity.f0.h(ImageLocation.getForLocal(fileLocation), "50_50", profileActivity.q0, null);
            if (profileActivity.P2 != -1) {
                profileActivity.n5();
                f01 f01Var = profileActivity.d;
                if (f01Var != null) {
                    f01Var.l();
                }
                profileActivity.m4(true);
            }
            wy0 wy0Var = profileActivity.o0;
            ImageLocation forLocal = ImageLocation.getForLocal(profileActivity.K2);
            profileActivity.L2 = forLocal;
            wy0Var.A(forLocal, ImageLocation.getForLocal(profileActivity.J2));
            profileActivity.S4(true, false);
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
                int i10 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i10 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            profileActivity.U5 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new a50(22, profileActivity, str));
        }
        profileActivity.actionBar.m().requestLayout();
    }

    public static void Y(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0(profileActivity).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
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
        profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.v0.p(R.string.UnknownError, org.telegram.ui.Components.xc.a0(profileActivity), R.raw.error, 36);
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

    public static /* synthetic */ void Z(ProfileActivity profileActivity, Context context, long j10, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            gi.u3.H0(context, profileActivity.currentAccount, profileActivity.w2.starref_program, profileActivity.getUserConfig().getClientUserId(), profileActivity.A0, false);
        } else {
            gi.u3.I0(context, profileActivity.currentAccount, connectedbotstarref, j10, profileActivity.A0);
        }
    }

    public static void a0(ProfileActivity profileActivity, Context context, long j10, View view, int i10, float f7, float f10) {
        TLRPC.User user;
        f01 f01Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.a.B0();
        if (i10 == profileActivity.T3) {
            TLRPC.User user2 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f1));
            TLRPC.UserFull userFull = profileActivity.w2;
            if (userFull != null && userFull.starref_program != null) {
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                ai.k0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), clientUserId, profileActivity.f1, new ai.f2(profileActivity, context, clientUserId, 3));
                return;
            } else {
                if (user2 == null || !user2.bot_can_edit) {
                    return;
                }
                profileActivity.presentFragment(new gi.l(profileActivity.f1));
                return;
            }
        }
        if (i10 == profileActivity.R3) {
            boolean z10 = !profileActivity.getMessagesController().isDialogMuted(j10, profileActivity.h1);
            profileActivity.getNotificationsController().muteDialog(j10, profileActivity.h1, z10);
            org.telegram.ui.Components.xc.A(profileActivity, z10, null).j();
            profileActivity.e5();
            int i11 = profileActivity.R3;
            if (i11 < 0 || (f01Var = profileActivity.d) == null) {
                return;
            }
            f01Var.m(i11);
            return;
        }
        if (i10 == profileActivity.a4) {
            TLRPC.User user3 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user3.id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.f5);
            bundle.putString("first_name_card", profileActivity.g5);
            bundle.putString("last_name_card", profileActivity.h5);
            hs hsVar = new hs(bundle, profileActivity.A0);
            hsVar.O = new rx0(profileActivity, user3);
            profileActivity.presentFragment(hsVar);
            return;
        }
        if (i10 == profileActivity.X3) {
            TextView textView = (TextView) org.telegram.ui.Components.f5.i0(profileActivity.getParentActivity(), LocaleController.getString(R.string.DeleteReaction), LocaleController.getString(R.string.DeleteAlertReaction), LocaleController.getString(R.string.DeleteAlertReactionAll), LocaleController.getString(R.string.Delete), new zx0(profileActivity, 1), profileActivity.A0, false).d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        if (i10 == profileActivity.Y3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ReportReaction2);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ReportAlertReaction);
            TLRPC.Chat chat = profileActivity.getMessagesController().getChat(Long.valueOf(-profileActivity.c5));
            org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
            if (chat != null && ChatObject.canBlockUsers(chat)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(profileActivity.getParentActivity(), 1, profileActivity.A0);
                z1VarArr[0] = z1Var;
                z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
                z1VarArr[0].e(LocaleController.getString(R.string.BanUser), "", true, false, false);
                z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(z1VarArr[0], w7.z5.n(-1, -2));
                z1VarArr[0].setOnClickListener(new g20(z1VarArr, 2));
                alertDialog$Builder.o(linearLayout);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.ReportChat), new ql0(12, profileActivity, z1VarArr));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wv(16));
            TextView textView2 = (TextView) alertDialog$Builder.p().d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        if (i10 == profileActivity.s4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", DialogObject.getEncryptedChatId(profileActivity.j1));
            profileActivity.presentFragment(new g70(bundle2));
            return;
        }
        if (i10 == profileActivity.r4) {
            profileActivity.showDialog(org.telegram.ui.Components.f5.V(profileActivity.getParentActivity(), profileActivity.E2, profileActivity.A0).a);
            return;
        }
        if (i10 == profileActivity.O3) {
            profileActivity.t4(view, f7, f10, false);
            return;
        }
        if (i10 == profileActivity.M4) {
            profileActivity.getMessagesController().unblockPeer(profileActivity.f1);
            if (org.telegram.ui.Components.xc.a(profileActivity)) {
                org.telegram.ui.Components.xc.d(profileActivity, false).j();
                return;
            }
            return;
        }
        if (i10 == profileActivity.b4) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i10 == profileActivity.V3) {
            profileActivity.w4();
            return;
        }
        if (i10 == profileActivity.W3) {
            s21.O(profileActivity.a(), profileActivity);
            return;
        }
        if (i10 >= profileActivity.v4 && i10 < profileActivity.w4) {
            profileActivity.h(!profileActivity.D2.isEmpty() ? profileActivity.v2.participants.participants.get(((Integer) profileActivity.D2.get(i10 - profileActivity.v4)).intValue()) : profileActivity.v2.participants.participants.get(i10 - profileActivity.v4), false, false, view);
            return;
        }
        if (i10 == profileActivity.x4) {
            profileActivity.x4();
            return;
        }
        if (i10 == profileActivity.M3) {
            profileActivity.E4(f7, f10, i10, view);
            return;
        }
        if (i10 == profileActivity.m4) {
            if (profileActivity.F2 != null) {
                profileActivity.showDialog(new hi.k0(profileActivity, profileActivity.F2.linked_community_id, null, null));
                return;
            } else {
                if (profileActivity.f1 == 0 || (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f1))) == null) {
                    return;
                }
                profileActivity.showDialog(new hi.k0(profileActivity, user.linked_community_id, null, null));
                return;
            }
        }
        if (i10 == profileActivity.J3) {
            if (profileActivity.v2.location instanceof TLRPC.TL_channelLocation) {
                sc0 sc0Var = new sc0(5);
                long j11 = profileActivity.g1;
                TLRPC.TL_channelLocation tL_channelLocation = (TLRPC.TL_channelLocation) profileActivity.v2.location;
                sc0Var.e0 = -j11;
                sc0Var.z0 = tL_channelLocation;
                profileActivity.presentFragment(sc0Var);
                return;
            }
            return;
        }
        if (i10 == profileActivity.N4) {
            profileActivity.s4(false);
            return;
        }
        if (i10 == profileActivity.y4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.g1);
            bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            jr jrVar = new jr(bundle3);
            jrVar.x0(profileActivity.v2);
            profileActivity.presentFragment(jrVar);
            return;
        }
        if (i10 == profileActivity.z4) {
            profileActivity.presentFragment(new nh0(profileActivity.g1));
            return;
        }
        if (i10 == profileActivity.A4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.g1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            jr jrVar2 = new jr(bundle4);
            jrVar2.x0(profileActivity.v2);
            profileActivity.presentFragment(jrVar2);
            return;
        }
        if (i10 == profileActivity.B4) {
            profileActivity.T0.performClick();
            return;
        }
        if (i10 == profileActivity.C4) {
            profileActivity.presentFragment(new ai.x(0, profileActivity.f1));
            return;
        }
        if (i10 == profileActivity.D4) {
            profileActivity.presentFragment(new ai.x(1, profileActivity.f1));
            return;
        }
        if (i10 == profileActivity.E4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.g1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new u91(bundle5));
            return;
        }
        if (i10 == profileActivity.H4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.g1);
            bundle6.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            jr jrVar3 = new jr(bundle6);
            jrVar3.x0(profileActivity.v2);
            profileActivity.presentFragment(jrVar3);
            return;
        }
        if (i10 == profileActivity.g3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
            return;
        }
        if (i10 == profileActivity.i3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.I2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.y0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
            return;
        }
        if (i10 == profileActivity.j3) {
            profileActivity.presentFragment(new DataSettingsActivity());
            return;
        }
        if (i10 == profileActivity.k3) {
            profileActivity.presentFragment(new ThemeActivity(0));
            return;
        }
        if (i10 == profileActivity.l3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
            return;
        }
        if (i10 == profileActivity.n3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
            return;
        }
        if (i10 == profileActivity.m3) {
            profileActivity.presentFragment(new wb0());
            return;
        }
        if (i10 == profileActivity.o3) {
            profileActivity.presentFragment(new SessionsActivity(0));
            return;
        }
        if (i10 == profileActivity.r3) {
            profileActivity.showDialog(org.telegram.ui.Components.f5.U(profileActivity, profileActivity.A0));
            return;
        }
        if (i10 == profileActivity.s3) {
            pf.d.r(profileActivity.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
            return;
        }
        if (i10 == profileActivity.t3) {
            pf.d.r(profileActivity.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
            return;
        }
        if (i10 == profileActivity.w3) {
            J4(profileActivity.getParentActivity(), false);
            return;
        }
        if (i10 == profileActivity.x3) {
            J4(profileActivity.getParentActivity(), true);
            return;
        }
        if (i10 == profileActivity.y3) {
            FileLog.cleanupLogs();
            return;
        }
        if (i10 == profileActivity.z3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
            alertDialog$Builder2.a.T = LocaleController.getString(R.string.AreYouSure);
            alertDialog$Builder2.a.R = LocaleController.getString(R.string.AppName);
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new qx0(profileActivity, 6));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            profileActivity.showDialog(alertDialog$Builder2.a);
            return;
        }
        if (i10 == profileActivity.h3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
            return;
        }
        if (i10 == profileActivity.W2) {
            profileActivity.presentFragment(new sa(null));
            return;
        }
        if (i10 == profileActivity.X2) {
            profileActivity.presentFragment(new UserInfoActivity());
            return;
        }
        if (i10 == profileActivity.U2) {
            profileActivity.presentFragment(new g(3));
            return;
        }
        if (i10 == profileActivity.P2) {
            profileActivity.w4();
            return;
        }
        if (i10 == profileActivity.d4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
            return;
        }
        if (i10 == profileActivity.e4) {
            profileActivity.presentFragment(new ai.nd());
            return;
        }
        if (i10 == profileActivity.f4) {
            profileActivity.presentFragment(new fi.g());
            return;
        }
        if (i10 == profileActivity.g4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
            return;
        }
        if (i10 == profileActivity.h4) {
            ug.l1.e0(0, BirthdayController.getInstance(profileActivity.currentAccount).getState());
            return;
        }
        if (i10 == profileActivity.botPermissionLocation) {
            gi.u0 u0Var = profileActivity.t2;
            if (u0Var != null) {
                u0Var.l(!u0Var.g(), new mv0(12, profileActivity, view));
                return;
            }
            return;
        }
        if (i10 == profileActivity.botPermissionBiometry) {
            gi.r rVar = profileActivity.u2;
            if (rVar != null) {
                boolean z11 = !rVar.e;
                rVar.f = true;
                rVar.e = z11;
                rVar.k();
                ((org.telegram.ui.Cells.r8) view).setChecked(profileActivity.u2.e);
                return;
            }
            return;
        }
        if (i10 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.setChecked(!r8Var.d());
            if (profileActivity.p4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.p4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().getInputUser(profileActivity.f1);
            boolean d = r8Var.d();
            toggleuseremojistatuspermission.enabled = d;
            TLRPC.UserFull userFull2 = profileActivity.w2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = d;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new a50(23, profileActivity, r0));
            profileActivity.p4 = sendRequest;
            int[] iArr = {sendRequest};
            return;
        }
        if (i10 == profileActivity.P3) {
            profileActivity.P4 = !profileActivity.P4;
            profileActivity.H4();
            view.requestLayout();
            profileActivity.d.m(profileActivity.P3);
            int i12 = profileActivity.W5;
            if (i12 >= 0) {
                profileActivity.c.h1(i12, profileActivity.X5 - profileActivity.a.getPaddingTop());
                return;
            }
            return;
        }
        if (i10 == profileActivity.Q3) {
            profileActivity.B4(false);
            return;
        }
        if (i10 == profileActivity.R2) {
            if (profileActivity.w2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.w2.personal_channel_id);
            profileActivity.presentFragment(new sn(bundle7));
            return;
        }
        if (i10 != profileActivity.V2) {
            if (i10 == profileActivity.I3) {
                profileActivity.K3(i10, view);
                return;
            } else {
                profileActivity.E4(f7, f10, i10, view);
                return;
            }
        }
        x01 x01Var = profileActivity.i6;
        if ((x01Var == null || !x01Var.a()) && !profileActivity.L3(i10, view)) {
            org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
            if (c9Var.d.getDrawable() != null) {
                profileActivity.v4(c9Var.getImageView());
            }
        }
    }

    public static void b0(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.n5 n5Var) {
        ImageLocation forDocument;
        String str;
        org.telegram.ui.Components.p5[] p5VarArr = profileActivity.G;
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            pf.d.r(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        sg.m1 m1Var = new sg.m1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.A0);
        n5Var.getLocationOnScreen(new int[2]);
        m1Var.v0 = n5Var.h0;
        m1Var.w0 = n5Var.i0;
        m1Var.z0 = n5Var.getScaleX();
        m1Var.x0 = n5Var.getLeft();
        m1Var.y0 = n5Var.getTop();
        m1Var.A0 = n5Var;
        Drawable rightDrawable = n5Var.getRightDrawable();
        org.telegram.ui.Components.p5 p5Var = p5VarArr[1];
        if (rightDrawable == p5Var && p5Var != null) {
            Drawable drawable = p5Var.f[0];
            if (drawable instanceof org.telegram.ui.Components.r5) {
                m1Var.z0 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.r5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(profileActivity.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f);
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
                    w9Var.setLayerNum(7);
                    w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    w9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (((org.telegram.ui.Components.r5) p5VarArr[1].f[0]).c()) {
                        w9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, profileActivity.A0), PorterDuff.Mode.SRC_IN));
                        m1Var.C0 = MessageObject.getInputStickerSet(document);
                    } else {
                        m1Var.C0 = MessageObject.getInputStickerSet(document);
                    }
                    m1Var.B0 = w9Var;
                    m1Var.E0 = true;
                }
            }
        }
        profileActivity.showDialog(m1Var);
    }

    public static void c0(ProfileActivity profileActivity) {
        Runnable runnable;
        final int i10;
        LinearLayout linearLayout;
        int i11;
        final int i12;
        final u3 u3Var;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.w2;
        if (userFull == null || userFull.stars_rating == null) {
            return;
        }
        org.telegram.ui.ActionBar.g6 g6Var = null;
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) profileActivity.getParentActivity(), (org.telegram.ui.ActionBar.g6) null, false);
        h3Var.fixNavigationBar();
        runnable = h3Var.dismissRunnable;
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        linearLayout2.setOrientation(1);
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        final LimitPreviewView limitPreviewView = new LimitPreviewView(profileActivity.getParentActivity(), R.drawable.filled_rating_crown, 0, profileActivity.A0, 0);
        limitPreviewView.setHideNegativeValues(profileActivity.a() != UserConfig.getInstance(profileActivity.currentAccount).getClientUserId());
        limitPreviewView.setStarRating(userFull.stars_rating);
        limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
        linearLayout2.addView(limitPreviewView, w7.z5.t(-1, -2, 17, 0, 20, 0, 10));
        int i13 = 17;
        if (userFull.stars_my_pending_rating != null) {
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            linearLayout2.addView(frameLayout, w7.z5.t(-1, -2, 17, 40, -12, 40, 20));
            int i14 = 2;
            TextView[] textViewArr = new org.telegram.ui.Components.y90[2];
            int i15 = 0;
            while (true) {
                int i16 = 3;
                if (i15 >= i14) {
                    break;
                }
                int i17 = i14;
                org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(parentActivity, i16, g6Var);
                textViewArr[i15] = xbVar;
                xbVar.setGravity(i13);
                textViewArr[i15].setTextSize(1, 12.0f);
                org.telegram.ui.ActionBar.r6.W(textViewArr[i15], org.telegram.ui.ActionBar.k6.y6, null);
                org.telegram.ui.ActionBar.r6.I(textViewArr[i15], org.telegram.ui.ActionBar.k6.gc, null);
                frameLayout.addView(textViewArr[i15], w7.z5.e(-1, -1, 119));
                textViewArr[i15].setAlpha(i15 == 0 ? 1.0f : 0.0f);
                textViewArr[i15].setScaleX(i15 == 0 ? 1.0f : 0.8f);
                textViewArr[i15].setScaleY(i15 == 0 ? 1.0f : 0.8f);
                i15++;
                i14 = i17;
                i13 = 17;
            }
            int i18 = i14;
            u3 u3Var2 = new u3(textViewArr, 20);
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
                u3Var = u3Var2;
                spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreview), new Runnable() { // from class: org.telegram.ui.fy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                limitPreviewView.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                u3Var.run(Boolean.TRUE);
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.f(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                u3Var.run(Boolean.FALSE);
                                break;
                        }
                    }
                }), true));
                textViewArr[0].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.gy0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                limitPreviewView.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                u3Var.run(Boolean.TRUE);
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.f(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                u3Var.run(Boolean.FALSE);
                                break;
                        }
                    }
                });
                textViewArr[0].setText(spannableStringBuilder);
            } else {
                org.telegram.ui.ActionBar.r6.W(textViewArr[0], org.telegram.ui.ActionBar.k6.q7, null);
                if (z10) {
                    textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarRatingLevelNegativeYou", (int) j11)));
                } else {
                    textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarRatingLevelNegativeOther, DialogObject.getName(profileActivity.a()))));
                }
                i12 = 0;
                u3Var = u3Var2;
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
            spannableStringBuilder2.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreviewBack), new Runnable() { // from class: org.telegram.ui.fy0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            TLRPC.UserFull userFull2 = userFull;
                            limitPreviewView.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            u3Var.run(Boolean.TRUE);
                            break;
                        default:
                            TLRPC.UserFull userFull3 = userFull;
                            limitPreviewView.f(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                            u3Var.run(Boolean.FALSE);
                            break;
                    }
                }
            }), true));
            textViewArr[1].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.gy0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            TLRPC.UserFull userFull2 = userFull;
                            limitPreviewView.f(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            u3Var.run(Boolean.TRUE);
                            break;
                        default:
                            TLRPC.UserFull userFull3 = userFull;
                            limitPreviewView.f(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                            u3Var.run(Boolean.FALSE);
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
        org.telegram.messenger.sl.n(R.string.StarRatingTitle, textView, i10, 20.0f);
        int i19 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i19, profileActivity.A0);
        LinearLayout linearLayout3 = linearLayout;
        linearLayout3.addView(textView, w7.z5.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        if (userFull.id == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
            org.telegram.messenger.v0.m(R.string.StarRatingSelfDescription, textView2);
            i11 = 1;
        } else {
            i11 = 1;
            org.telegram.messenger.sl.r(R.string.StarRatingDescription, new Object[]{DialogObject.getName(profileActivity.a())}, textView2);
        }
        textView2.setTextSize(i11, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView2, i19, profileActivity.A0);
        linearLayout3.addView(textView2, w7.z5.t(-1, -2, 17, 20, 0, 20, 12));
        cw0 cw0Var = new cw0(parentActivity, profileActivity.A0);
        cw0Var.a.l(LocaleController.getString(R.string.StarRatingTitle1), false);
        int i20 = R.string.StarRatingDescription1;
        String string = LocaleController.getString(R.string.StarRatingAdded);
        int i21 = org.telegram.ui.ActionBar.k6.Oh;
        cw0Var.b.setText(LocaleController.formatSpannable(i20, I3(string, i21, profileActivity.A0)));
        cw0Var.d.setVisibility(8);
        int i22 = R.drawable.menu_gift;
        ImageView imageView = cw0Var.c;
        imageView.setImageResource(i22);
        org.telegram.ui.ActionBar.g6 g6Var2 = profileActivity.A0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.r6.t(imageView, i19, g6Var2, mode);
        linearLayout3.addView(cw0Var, w7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        cw0 cw0Var2 = new cw0(parentActivity, profileActivity.A0);
        cw0Var2.a.l(LocaleController.getString(R.string.StarRatingTitle2), false);
        cw0Var2.b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription2, I3(LocaleController.getString(R.string.StarRatingAdded), i21, profileActivity.A0)));
        cw0Var2.d.setVisibility(8);
        int i23 = R.drawable.menu_stars_gift;
        ImageView imageView2 = cw0Var2.c;
        imageView2.setImageResource(i23);
        org.telegram.ui.ActionBar.r6.t(imageView2, i19, profileActivity.A0, mode);
        linearLayout3.addView(cw0Var2, w7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        cw0 cw0Var3 = new cw0(parentActivity, profileActivity.A0);
        cw0Var3.a.l(LocaleController.getString(R.string.StarRatingTitle3), false);
        int i24 = R.string.StarRatingDescription3;
        String string2 = LocaleController.getString(R.string.StarRatingDeduces);
        int f7 = org.telegram.ui.ActionBar.k6.I.q() ? i0.a.f(0.25f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.m6, profileActivity.A0), -16777216) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, profileActivity.A0);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string2);
        kz0 kz0Var = new kz0(9);
        kz0Var.v = string2;
        if (kz0Var.c != null) {
            kz0Var.c = null;
            kz0Var.a();
        }
        kz0Var.f = f7;
        kz0Var.n = false;
        spannableStringBuilder3.setSpan(kz0Var, 0, spannableStringBuilder3.length(), 0);
        cw0Var3.b.setText(LocaleController.formatSpannable(i24, spannableStringBuilder3));
        cw0Var3.d.setVisibility(8);
        int i25 = R.drawable.menu_refund;
        ImageView imageView3 = cw0Var3.c;
        imageView3.setImageResource(i25);
        org.telegram.ui.ActionBar.r6.t(imageView3, i19, profileActivity.A0, mode);
        linearLayout3.addView(cw0Var3, w7.z5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        ei.d dVar = new ei.d(parentActivity, profileActivity.A0, true);
        dVar.setOnClickListener(new hy0(0, runnable));
        dVar.i(ai.l7.H2(LocaleController.getString(R.string.Understood)), false, true);
        linearLayout3.addView(dVar, w7.z5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        h3Var.customView = linearLayout3;
        h3Var.show();
    }

    public static void d0(ProfileActivity profileActivity, int i10, float f7, float f10) {
        switch (i10) {
            case 0:
                boolean z10 = profileActivity.r1;
                if (!z10) {
                    if (profileActivity.f1 == 0) {
                        if (profileActivity.g1 != 0) {
                            if (!ChatObject.isForum(profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.g1)))) {
                                if (!profileActivity.O3()) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", profileActivity.g1);
                                    if (profileActivity.getMessagesController().checkCanOpenChat(bundle, profileActivity)) {
                                        profileActivity.presentFragment(new sn(bundle), false);
                                        break;
                                    }
                                }
                            } else {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", profileActivity.g1);
                                if (profileActivity.getMessagesController().checkCanOpenChat(bundle2, profileActivity)) {
                                    profileActivity.presentFragment(new sn(bundle2), false);
                                    break;
                                }
                            }
                        }
                    } else {
                        profileActivity.z4();
                        break;
                    }
                } else if (z10) {
                    profileActivity.O3();
                    break;
                }
                break;
            case 1:
                profileActivity.t4(profileActivity.a0, f7, f10, true);
                break;
            case 2:
                profileActivity.A4();
                break;
            case 3:
                profileActivity.r4();
                break;
            case 4:
                profileActivity.u4();
                break;
            case 5:
            case 10:
            case 11:
                profileActivity.q4(false);
                break;
            case 6:
                profileActivity.q4(true);
                break;
            case 7:
                profileActivity.s4(true);
                break;
            case 8:
                s21.O(profileActivity.a(), profileActivity);
                break;
            case 9:
                profileActivity.k4(false);
                break;
            case 12:
                profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(profileActivity.getParentActivity(), 3, profileActivity.A0);
                c2Var.r(200L);
                MessagesController.getInstance(profileActivity.currentAccount).getStoriesController().k(profileActivity.a(), new org.telegram.ui.Components.qy(19, profileActivity, c2Var), true, profileActivity.A0);
                break;
            case 13:
                profileActivity.p4(true);
                break;
            case 14:
                profileActivity.w4();
                break;
            case 15:
                TLRPC.User currentUser = profileActivity.getUserConfig().getCurrentUser();
                if (currentUser != null) {
                    org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(profileActivity, profileActivity.a0);
                    H.w = false;
                    H.i = 3;
                    H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.QrCode), new ib0(profileActivity, 22), false);
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new oj0(currentUser, 29), false);
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new ib0(profileActivity, 23), false);
                    H.W = true;
                    H.a0(f7 - AndroidUtilities.dp(8.0f), profileActivity.a0.getMeasuredHeight() - AndroidUtilities.dp(16.0f));
                    H.Z();
                    break;
                }
                break;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 17:
                profileActivity.presentFragment(new c81(null));
                break;
        }
    }

    public static void e0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.b0 == null) {
            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.currentAccount == profileActivity.currentAccount && MediaController.getInstance().currentSavedMusicList.dialogId == profileActivity.a()) {
                profileActivity.b0 = MediaController.getInstance().currentSavedMusicList;
            } else {
                MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(profileActivity.currentAccount, profileActivity.a());
                profileActivity.b0 = savedMusicList;
                TLRPC.UserFull userFull = profileActivity.w2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    savedMusicList.setup(document);
                }
            }
        }
        if (profileActivity.b0.list.isEmpty()) {
            return;
        }
        if (MediaController.getInstance().currentSavedMusicList == profileActivity.b0 && MediaController.getInstance().isPlayingMessage(profileActivity.b0.list.get(0))) {
            z10 = true;
        } else {
            MediaController.getInstance().cleanup();
            z10 = false;
        }
        MediaController.getInstance().currentSavedMusicList = profileActivity.b0;
        MediaController.getInstance().getPlaylist().clear();
        MediaController.getInstance().getPlaylist().addAll(profileActivity.b0.list);
        if (!z10) {
            MediaController.getInstance().playMessage(profileActivity.b0.list.get(0));
        }
        profileActivity.showDialog(new org.telegram.ui.Components.k8(profileActivity.getParentActivity(), profileActivity.A0));
    }

    public static void f0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.vc0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new ib0(profileActivity, 18), profileActivity.A0);
    }

    public static void g0(ProfileActivity profileActivity, TLRPC.User user) {
        if (profileActivity.a4 >= 0) {
            if (profileActivity.L4 == -1) {
                profileActivity.n5();
                profileActivity.d.l();
            } else {
                profileActivity.i5(false, false);
            }
        }
        if (profileActivity.L4 == -1) {
            if (profileActivity.o2 || AndroidUtilities.isTablet()) {
                profileActivity.a.setPadding(0, profileActivity.V3(), 0, 0);
                profileActivity.k2.cancel();
                float[] fArr = profileActivity.n2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.L4(1.0f);
                profileActivity.R1 = profileActivity.V3();
            } else {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (profileActivity.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredWidth(), TLObject.FLAG_30);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    f01 f01Var = profileActivity.d;
                    if (i10 >= f01Var.e.O2) {
                        break;
                    }
                    s4.b1 g10 = f01Var.g(null, f01Var.j(i10));
                    View view = g10.a;
                    profileActivity.d.v(g10, i10);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i11 += view.getMeasuredHeight();
                    i10++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.V3() + i11) + currentActionBarHeight));
                ly0 ly0Var = profileActivity.a;
                ly0Var.setPadding(0, ly0Var.getPaddingTop(), 0, max);
            }
        }
        profileActivity.M.m(profileActivity.j1, user, 8);
    }

    public static void h0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.a11.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.A0);
    }

    public static void i0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f7, boolean z10) {
        org.telegram.ui.ActionBar.n5[] n5VarArr = profileActivity.r;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.V1 = floatValue;
        float f10 = (floatValue - 0.5f) / 0.5f;
        float f11 = (0.5f - floatValue) / 0.5f;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        float f12 = -f7;
        profileActivity.U1 = (int) ((1.0f - floatValue) * f12);
        profileActivity.b.setTranslationY(floatValue * f7);
        profileActivity.P.setTranslationY(f7 * profileActivity.V1);
        profileActivity.a.setTranslationY((1.0f - profileActivity.V1) * f12);
        profileActivity.a.setScaleX(1.0f - ((1.0f - profileActivity.V1) * 0.01f));
        profileActivity.a.setScaleY(1.0f - ((1.0f - profileActivity.V1) * 0.01f));
        profileActivity.a.setAlpha(profileActivity.V1);
        profileActivity.m4(true);
        profileActivity.a.setAlpha(f10);
        profileActivity.b.setAlpha(1.0f - profileActivity.V1);
        profileActivity.b.setScaleX((profileActivity.V1 * 0.05f) + 1.0f);
        profileActivity.b.setScaleY((profileActivity.V1 * 0.05f) + 1.0f);
        profileActivity.P.setAlpha(1.0f - f10);
        profileActivity.Y.setAlpha(f10);
        profileActivity.f0.setAlpha(f10);
        yy0 yy0Var = profileActivity.v0;
        if (yy0Var != null) {
            yy0Var.setAlpha(f10);
        }
        profileActivity.f[1].setAlpha(f10);
        n5VarArr[1].setAlpha(f10);
        n5VarArr[3].setAlpha(f10);
        profileActivity.V0.getSearchField().setAlpha(f11);
        if (z10 && profileActivity.V1 < 0.7f) {
            org.telegram.ui.ActionBar.u0 u0Var = profileActivity.V0;
            if (u0Var.F.getWidth() != 0 && !u0Var.e.isFocused()) {
                u0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(u0Var.e);
            }
        }
        profileActivity.V0.getSearchContainer().setVisibility(profileActivity.V1 < 0.5f ? 0 : 8);
        int i10 = profileActivity.V1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.u0 u0Var2 = profileActivity.U0;
        if (u0Var2 != null) {
            u0Var2.setVisibility(i10);
            profileActivity.U0.setAlpha(f10);
        }
        profileActivity.V0.setVisibility(i10);
        profileActivity.actionBar.v(profileActivity.V1 < 0.5f);
        org.telegram.ui.ActionBar.u0 u0Var3 = profileActivity.U0;
        if (u0Var3 != null) {
            u0Var3.setAlpha(f10);
        }
        profileActivity.V0.setAlpha(f10);
        profileActivity.e1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static boolean j0(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_error tL_error) {
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(profileActivity.currentAccount).edit().putLong("dialog_join_requested_time_" + profileActivity.j1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        boolean z11 = ChatObject.isChannel(profileActivity.F2) && !profileActivity.F2.megagroup;
        int i10 = org.telegram.ui.Components.b90.s;
        org.telegram.ui.Components.b90.x(parentActivity, profileActivity, org.telegram.ui.Components.xc.a0(profileActivity), z11);
        if (!z10 || profileActivity.N4 != -1) {
            profileActivity.n5();
            f01 f01Var = profileActivity.d;
            if (f01Var != null) {
                f01Var.l();
            }
        }
        if (o2Var instanceof sn) {
            ((sn) o2Var).Bb(false, true);
        }
        return false;
    }

    public static void k0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
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
            if (closestPhotoSizeWithSize != null && profileActivity.J2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.J2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(profileActivity.J2.volume_id);
                sb2.append("_");
                String n10 = a1.g.n(profileActivity.J2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(profileActivity.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && profileActivity.K2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.K2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            profileActivity.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            profileActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f1);
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
        profileActivity.p2 = (AndroidUtilities.isTablet() || profileActivity.o2 || !profileActivity.f0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
        profileActivity.J2 = null;
        profileActivity.K2 = null;
        wy0 wy0Var = profileActivity.o0;
        wy0Var.H0 = true;
        wy0Var.K0 = profileActivity.L2;
        wy0Var.q1 = null;
        wy0Var.r1 = null;
        wy0Var.setCreateThumbFromParent(false);
        profileActivity.m5(true);
        profileActivity.S4(false, true);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        profileActivity.getUserConfig().saveConfig(true);
    }

    public static void l0(ProfileActivity profileActivity, org.telegram.ui.Cells.z1[] z1VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().getInputUser(profileActivity.f1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().getInputPeer(profileActivity.c5);
        tL_messages_reportReaction.id = profileActivity.b5;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new ci.d6(8));
        org.telegram.ui.Cells.z1 z1Var = z1VarArr[0];
        if (z1Var != null && z1Var.b()) {
            profileActivity.getMessagesController().deleteParticipantFromChat(-profileActivity.c5, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f1)));
        }
        profileActivity.b5 = 0;
        profileActivity.i5(false, false);
        org.telegram.ui.Components.xc.a0(profileActivity).E(profileActivity.A0).j();
    }

    public static void m0(ProfileActivity profileActivity, Boolean bool) {
        long j10 = profileActivity.f1;
        if (j10 == 0) {
            long j11 = profileActivity.g1;
            j10 = j11 != 0 ? -j11 : profileActivity.j1;
        }
        long j12 = j10;
        if (bool.booleanValue()) {
            MessagesController.getInstance(profileActivity.currentAccount).deleteAllReactionsFrom(profileActivity.c5, j12);
        } else {
            MessagesController.getInstance(profileActivity.currentAccount).deleteReactionsFromMessage(profileActivity.c5, j12, profileActivity.b5);
        }
        profileActivity.b5 = 0;
        profileActivity.i5(false, false);
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(profileActivity.getParentActivity(), profileActivity.A0);
        ybVar.d(R.raw.chats_infotip, new String[0]);
        ybVar.b.setText(LocaleController.getString(R.string.ReactionDeleteSent));
        org.telegram.ui.Components.xc.a0(profileActivity).b(ybVar, 1500).j();
    }

    public static void n1(ProfileActivity profileActivity, boolean z10) {
        org.telegram.ui.ActionBar.n5[] n5VarArr = profileActivity.f;
        org.telegram.ui.ActionBar.n5[] n5VarArr2 = profileActivity.r;
        int i10 = z10 ? 8 : 0;
        profileActivity.a.setVisibility(i10);
        profileActivity.b.setVisibility(z10 ? 0 : 8);
        profileActivity.V0.getSearchContainer().setVisibility(z10 ? 0 : 8);
        ai.j1 j1Var = profileActivity.w0;
        if (j1Var != null) {
            j1Var.setActive(!z10);
        }
        profileActivity.actionBar.v(z10);
        profileActivity.Y.setVisibility(i10);
        yy0 yy0Var = profileActivity.v0;
        if (yy0Var != null) {
            yy0Var.setVisibility(i10);
        }
        n5VarArr[1].setVisibility(i10);
        n5VarArr2[1].setVisibility(i10);
        n5VarArr2[3].setVisibility(i10);
        org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
        if (u0Var != null) {
            u0Var.setAlpha(1.0f);
            profileActivity.U0.setVisibility(i10);
        }
        profileActivity.V0.setVisibility(i10);
        profileActivity.f0.setAlpha(1.0f);
        profileActivity.Y.setAlpha(1.0f);
        yy0 yy0Var2 = profileActivity.v0;
        if (yy0Var2 != null) {
            yy0Var2.setAlpha(1.0f);
        }
        ai.j1 j1Var2 = profileActivity.w0;
        if (j1Var2 != null) {
            j1Var2.setAlpha(1.0f);
        }
        n5VarArr[1].setAlpha(1.0f);
        n5VarArr2[1].setAlpha(1.0f);
        profileActivity.V0.setAlpha(1.0f);
        profileActivity.a.setAlpha(1.0f);
        profileActivity.b.setAlpha(1.0f);
        profileActivity.P.setAlpha(1.0f);
        if (z10) {
            profileActivity.b.setEmptyView(profileActivity.P);
        } else {
            profileActivity.P.setVisibility(8);
        }
    }

    public static ProfileActivity o4(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void t3(ProfileActivity profileActivity, boolean z10) {
        Drawable drawable = profileActivity.f0.getImageReceiver().getDrawable();
        String str = null;
        if (drawable instanceof org.telegram.ui.Components.u71) {
            profileActivity.f0.u(null, null, drawable);
            return;
        }
        if (drawable instanceof org.telegram.ui.Components.e6) {
            org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) drawable;
            profileActivity.f0.u(null, null, e6Var);
            if (z10) {
                e6Var.f(profileActivity.f0);
                return;
            }
            return;
        }
        ImageLocation D = profileActivity.o0.D(0);
        if (D != null && D.imageType == 2) {
            str = "avatar";
        }
        profileActivity.f0.u(D, str, drawable);
    }

    public final float A3() {
        return Utilities.clamp01((this.R1 - Q3()) / W3());
    }

    public final void A4() {
        TLRPC.ChatFull chatFull = this.v2;
        if (chatFull == null || chatFull.linked_chat_id == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.v2.linked_chat_id);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new sn(bundle));
        }
    }

    public final void B3() {
        this.b2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f));
        this.c2 = 1.38f;
        this.d2 = 0.0f;
        P3();
        F4();
        n4(0, 1.0f, true);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.n5[] n5VarArr = this.f;
            if (i10 >= n5VarArr.length) {
                break;
            }
            if (n5VarArr[i10] != null) {
                float measuredWidth = (this.a.getMeasuredWidth() / 2.0f) - (((n5VarArr[i10].getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) r6.getLayoutParams()).leftMargin);
                org.telegram.ui.ActionBar.n5[] n5VarArr2 = this.r;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n5VarArr2[i10].getLayoutParams();
                float measuredWidth2 = (this.a.getMeasuredWidth() / 2.0f) - ((n5VarArr2[i10].getExactWidth() * 0.5f) + (layoutParams.leftMargin + (this.r5 ? 0 : n5VarArr2[i10].getPaddingLeft())));
                if (i10 == 1) {
                    this.e2 = measuredWidth;
                    this.g2 = measuredWidth2;
                    this.e6 = this.r5 ? 0.0f : n5VarArr2[i10].getPaddingLeft();
                }
            }
            i10++;
        }
        if (this.K1 != 2) {
            this.v0.setAlpha(1.0f);
        }
        this.Y.setAlpha(1.0f);
        this.f0.setAlpha(1.0f);
    }

    public final void B4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.w2;
        if (userFull == null || (tL_businessLocation = userFull.business_location) == null) {
            return;
        }
        if (tL_businessLocation.geo_point == null || z10) {
            String str = BuildVars.isHuaweiStoreApp() ? "mapapp://navigation" : "http://maps.google.com/maps";
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str + "?q=" + this.w2.business_location.address, new Object[0]))));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        ci.z8 z8Var = new ci.z8(3, 1);
        z8Var.setResourceProvider(this.A0);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.local_id = -1;
        tL_message.peer_id = getMessagesController().getPeer(a());
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_businessLocation tL_businessLocation2 = this.w2.business_location;
        tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
        tL_messageMediaGeo.address = tL_businessLocation2.address;
        tL_message.media = tL_messageMediaGeo;
        z8Var.O0 = false;
        z8Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
        presentFragment(z8Var);
    }

    @Override // org.telegram.ui.Components.ju0
    public final void C() {
        I4(false);
    }

    public final void C3() {
        s4.b1 b1Var;
        View view;
        if (this.a.getVisibility() != 0) {
            return;
        }
        if (this.Q) {
            this.O.setVisibleHeight(this.a.getMeasuredHeight() - this.O.getTop());
        }
        if (this.a.getChildCount() <= 0 || this.H1) {
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
            ly0 ly0Var = this.a;
            View F = ly0Var.F(view);
            b1Var = (org.telegram.ui.Components.wl0) (F != null ? ly0Var.T(F) : null);
        }
        int top = view == null ? 0 : view.getTop();
        int b10 = b1Var != null ? b1Var.b() : -1;
        if (top < 0 || b10 != 0) {
            top = 0;
        }
        boolean z10 = this.r0 == null && this.actionBar.n0;
        int i11 = this.L4;
        if (i11 != -1 && !z10) {
            org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) this.a.K(i11);
            z10 = wl0Var != null && wl0Var.a.getTop() <= 0;
        }
        if (this.H5 != z10) {
            this.H5 = z10;
            AnimatorSet animatorSet = this.E5;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.F5;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            org.telegram.ui.ActionBar.u0 searchItem = this.O.getSearchItem();
            org.telegram.ui.Components.bk0 searchOptionsItem = this.O.getSearchOptionsItem();
            TextView saveItem = this.O.getSaveItem();
            if (this.H5) {
                rz0 rz0Var = this.O;
                if (rz0Var.v0(rz0Var.k0[0].F)) {
                    searchItem.setVisibility(0);
                }
                if (searchOptionsItem != null) {
                    searchOptionsItem.setVisibility(0);
                }
                rz0 rz0Var2 = this.O;
                int i12 = rz0Var2.k0[0].F;
                if (i12 == 0 || org.telegram.ui.Components.xv0.r0(i12) || i12 == 11 || i12 == 13 || (i12 == 14 && rz0Var2.V != null)) {
                    this.O.r0.setVisibility(0);
                    this.O.A(true, false);
                } else {
                    this.O.r0.setVisibility(4);
                    this.O.A(false, false);
                }
            } else {
                if (this.M0) {
                    this.R0.setVisibility(0);
                }
                if (this.N0) {
                    this.S0.setVisibility(0);
                }
                if (this.O0) {
                    this.T0.setVisibility(0);
                }
                this.U0.setVisibility(0);
                if (searchOptionsItem != null) {
                    searchOptionsItem.setVisibility(8);
                }
                if (saveItem != null) {
                    saveItem.setVisibility(8);
                }
            }
            p5(false);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.m().requestLayout();
            }
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.u0 u0Var = this.R0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<org.telegram.ui.ActionBar.u0, Float>) property, z10 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.u0, Float>) property, z10 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.U0, (Property<org.telegram.ui.ActionBar.u0, Float>) property, z10 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.T0, (Property<org.telegram.ui.ActionBar.u0, Float>) property, z10 ? 0.0f : 1.0f));
            org.telegram.ui.ActionBar.u0 u0Var2 = this.R0;
            Property property2 = View.TRANSLATION_Y;
            arrayList.add(ObjectAnimator.ofFloat(u0Var2, (Property<org.telegram.ui.ActionBar.u0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.u0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.U0, (Property<org.telegram.ui.ActionBar.u0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.T0, (Property<org.telegram.ui.ActionBar.u0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchItem, (Property<org.telegram.ui.ActionBar.u0, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchItem, (Property<org.telegram.ui.ActionBar.u0, Float>) property2, z10 ? 0.0f : AndroidUtilities.dp(10.0f)));
            arrayList.add(ObjectAnimator.ofFloat(this.O.r0, (Property<ImageView, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.O.r0, (Property<ImageView, Float>) property2, z10 ? 0.0f : AndroidUtilities.dp(10.0f)));
            arrayList.add(ObjectAnimator.ofFloat(this.actionBar, this.I5, z10 ? 1.0f : 0.0f));
            org.telegram.ui.ActionBar.n5[] n5VarArr = this.r;
            arrayList.add(ObjectAnimator.ofFloat(n5VarArr[1], (Property<org.telegram.ui.ActionBar.n5, Float>) property, z10 ? 0.0f : 1.0f));
            this.O.I0.setOpen(z10);
            int i13 = 3;
            if (this.t1) {
                arrayList.add(ObjectAnimator.ofFloat(n5VarArr[3], (Property<org.telegram.ui.ActionBar.n5, Float>) property, z10 ? 0.0f : 1.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.fp0, Float>) property, z10 ? 1.0f : 0.0f));
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this, this.l5, 0.0f));
            }
            if (this.v0 != null || this.w0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new wx0(this, i13));
                arrayList.add(ofFloat);
            }
            E3();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.E5 = animatorSet3;
            animatorSet3.playTogether(arrayList);
            this.E5.setInterpolator(org.telegram.ui.Components.bs.f);
            this.E5.addListener(new org.telegram.ui.Components.ql0(12, this, searchItem));
            this.E5.setDuration(150L);
            this.E5.start();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        }
        float f7 = top;
        if (this.R1 == f7 || this.I1) {
            return;
        }
        this.R1 = f7;
        this.e1.invalidate();
        if (this.K1 != 0) {
            this.N1 = this.R1 > ((float) Q3());
        }
        m4(true);
    }

    public final void C4(int i10, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        dz0 dz0Var = new dz0(this, user.id, this.g1, tL_chatAdminRights, this.F2.default_banned_rights, tL_chatBannedRights, str, i10, zArr, user);
        dz0Var.Y0 = new ez0(this, i10, chatParticipant, z10, zArr);
        presentFragment(dz0Var);
    }

    @Override // org.telegram.ui.xx
    public final /* synthetic */ boolean D() {
        return false;
    }

    public final void D3() {
        int i10 = this.K1;
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.r;
        if (i10 == 1 && (!this.n5 || this.H1)) {
            this.c6 = 0.0f;
        } else if (i10 == 2 && (!this.n5 || this.H1)) {
            org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[1];
            this.c6 = n5Var == null ? 0.0f : n5Var.getAlpha();
        } else if (this.f1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            this.c6 = (1.0f - this.p5) * this.l2;
        } else {
            this.c6 = this.l2 * this.p5;
        }
        if (this.f1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
            if (this.s5) {
                org.telegram.ui.ActionBar.n5 n5Var2 = n5VarArr[2];
                if (n5Var2 != null) {
                    n5Var2.setAlpha(this.c6);
                }
                r01 r01Var = this.h6;
                if (r01Var != null) {
                    r01Var.e = 1.0f - this.c6;
                    r01Var.invalidateSelf();
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.n5 n5Var3 = n5VarArr[2];
            if (n5Var3 != null) {
                n5Var3.setAlpha(0.0f);
            }
            r01 r01Var2 = this.h6;
            if (r01Var2 != null) {
                r01Var2.e = 1.0f;
                r01Var2.invalidateSelf();
                return;
            }
            return;
        }
        if (!this.r5) {
            org.telegram.ui.ActionBar.n5 n5Var4 = n5VarArr[2];
            if (n5Var4 != null) {
                n5Var4.setAlpha(0.0f);
                n5VarArr[3].setAlpha(0.0f);
            }
            r01 r01Var3 = this.h6;
            if (r01Var3 != null) {
                r01Var3.e = 1.0f;
                r01Var3.invalidateSelf();
                return;
            }
            return;
        }
        this.q5 = AndroidUtilities.dp(28.0f) * this.c6;
        org.telegram.ui.ActionBar.n5 n5Var5 = n5VarArr[2];
        if (n5Var5 != null) {
            n5Var5.setAlpha(this.l2);
            n5VarArr[3].setAlpha(1.0f - this.l2);
            n5VarArr[1].setTranslationX(Y3(this.d6, this.f6));
            this.Z.invalidate();
            r01 r01Var4 = this.h6;
            if (r01Var4 != null) {
                r01Var4.e = 1.0f - this.l2;
                r01Var4.invalidateSelf();
            }
        }
    }

    public final void D4(String str, org.telegram.ui.Cells.h hVar) {
        if (str.startsWith("@")) {
            getMessagesController().openByUserName(str.substring(1), this, 0, hVar);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            ey eyVar = new ey(null);
            eyVar.n2 = str;
            presentFragment(eyVar);
        } else {
            if (!str.startsWith("/") || this.parentLayout.getFragmentStack().size() <= 1) {
                return;
            }
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if (o2Var instanceof sn) {
                finishFragment();
                ((sn) o2Var).Y.X0(null, str, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final void E(float f7) {
        org.telegram.ui.Cells.y3 y3Var = this.h0;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(f7);
        this.o0.O(this.L2, f7);
    }

    public final void E3() {
        org.telegram.ui.Components.hx0 hx0Var = this.T;
        if (hx0Var != null) {
            hx0Var.setVisibility(!this.H5 && this.J5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0472  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E4(float f7, float f10, int i10, View view) {
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
        if (i10 == this.M3 || i10 == this.W2) {
            if (this.f1 == 0) {
                if (this.g1 != 0 && (chat = getMessagesController().getChat(Long.valueOf(this.g1))) != null && (this.h1 != 0 || ChatObject.isPublic(chat))) {
                    publicUsername = ChatObject.getPublicUsername(chat);
                    findUsername = DialogObject.findUsername(publicUsername, chat);
                    if (this.f1 != 0) {
                    }
                }
                return false;
            }
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f1));
            publicUsername = UserObject.getPublicUsername(user);
            if (user != null && publicUsername != null) {
                findUsername = DialogObject.findUsername(publicUsername, user);
                if (this.f1 != 0) {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.g1));
                    if (ChatObject.isPublic(chat2)) {
                        StringBuilder sb3 = new StringBuilder("https://");
                        sb3.append(getMessagesController().linkPrefix);
                        sb3.append("/");
                        sb3.append(ChatObject.getPublicUsername(chat2));
                        if (this.h1 != 0) {
                            str3 = "/" + this.h1;
                        }
                        sb3.append(str3);
                        sb2 = sb3.toString();
                    } else {
                        StringBuilder sb4 = new StringBuilder("https://");
                        sb4.append(getMessagesController().linkPrefix);
                        sb4.append("/c/");
                        sb4.append(chat2.id);
                        if (this.h1 != 0) {
                            str3 = "/" + this.h1;
                        }
                        sb4.append(str3);
                        sb2 = sb4.toString();
                    }
                    fz0 fz0Var = new fz0(this, getParentActivity(), sb2, sb2);
                    showDialog(fz0Var);
                    if (findUsername != null && !findUsername.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername.username = findUsername.username;
                        tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo, new wr0(this, findUsername, fz0Var, i11)), getClassGuid());
                        return true;
                    }
                } else if (!L3(i10, view3)) {
                    if (findUsername != null && !findUsername.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo2 = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername2 = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername2.username = findUsername.username;
                        tL_getCollectibleInfo2.collectible = tL_inputCollectibleUsername2;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo2, new a50(24, this, findUsername)), getClassGuid());
                        return true;
                    }
                    try {
                        org.telegram.ui.Components.xc.a0(this).i(LocaleController.getString(R.string.UsernameCopied)).j();
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
        if (i10 != this.I3) {
            int i14 = 2;
            String str4 = null;
            if (i10 == this.H3 || i10 == this.U2) {
                if (!L3(i10, view3)) {
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.f1));
                    if (user2 != null && (str = user2.phone) != null && str.length() != 0 && getParentActivity() != null) {
                        if (i10 == this.H3 && user2.phone.startsWith("888")) {
                            TL_fragment.TL_inputCollectiblePhone tL_inputCollectiblePhone = new TL_fragment.TL_inputCollectiblePhone();
                            String str5 = user2.phone;
                            tL_inputCollectiblePhone.phone = str5;
                            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo3 = new TL_fragment.TL_getCollectibleInfo();
                            tL_getCollectibleInfo3.collectible = tL_inputCollectiblePhone;
                            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo3, new wr0(this, str5, user2, 5)), getClassGuid());
                            return true;
                        }
                        org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(this, view3);
                        H.W(this.a.W0(view3, false));
                        H.w = false;
                        if (i10 == this.H3) {
                            TLRPC.UserFull userFull3 = this.w2;
                            if (userFull3 != null && userFull3.phone_calls_available) {
                                H.c(R.drawable.msg_calls, LocaleController.getString(R.string.CallViaTelegram), new px0(this, user2, i12), false);
                                if (this.w2.video_calls_available) {
                                    H.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new px0(this, user2, i14), false);
                                }
                            }
                            if (!this.d5) {
                                H.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.Call), new px0(this, user2, 3), false);
                            }
                        }
                        H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new px0(this, user2, i11), false);
                        if (this.d5) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AnonymousNumberNotice)));
                            int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                            int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                                int i15 = lastIndexOf - 1;
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.j61(AndroidUtilities.bold()), indexOf, i15, 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.k6.I6, this.A0), indexOf, i15, 33);
                            }
                            H.k();
                            H.p(13, AndroidUtilities.dp(200.0f), spannableStringBuilder);
                            if (H.z() instanceof TextView) {
                                TextView textView = (TextView) H.z();
                                int i16 = org.telegram.ui.ActionBar.k6.I5;
                                org.telegram.ui.ActionBar.r6.S(textView, org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i16, this.A0), 0, 6), null, org.telegram.ui.ActionBar.r6.O(i16), this.A0);
                                textView.setOnClickListener(new ah.f(23));
                            }
                        }
                        H.Z();
                        return true;
                    }
                }
                return true;
            }
            if (i10 == this.L3 || i10 == this.K3 || i10 == this.J3 || i10 == this.X2) {
                if (i10 != this.X2 || ((userFull = this.w2) != null && !TextUtils.isEmpty(userFull.about))) {
                    if (!L3(i10, view3)) {
                        if (view3 instanceof org.telegram.ui.Cells.j) {
                            org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view3;
                            if (jVar.b0 && jVar.V <= 0.0f) {
                                jVar.h();
                                return false;
                            }
                        }
                        if (i10 == this.J3) {
                            TLRPC.ChatFull chatFull = this.v2;
                            if (chatFull != null) {
                                TLRPC.ChannelLocation channelLocation = chatFull.location;
                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                    str4 = ((TLRPC.TL_channelLocation) channelLocation).address;
                                }
                            }
                        } else if (i10 == this.L3) {
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
                            String[] strArr = {TranslateController.UNKNOWN_LANGUAGE};
                            boolean isContextTranslateEnabled = MessagesController.getInstance(this.currentAccount).getTranslateController().isContextTranslateEnabled();
                            boolean[] zArr = {i10 == this.X2 || i10 == this.L3 || i10 == this.K3};
                            String L = org.telegram.ui.Components.y41.L();
                            hg.d1 d1Var = new hg.d1(this, view3, str6, i10, zArr, strArr, L);
                            if (!zArr[0]) {
                                d1Var.run();
                                return true;
                            }
                            if (LanguageDetector.hasSupport()) {
                                LanguageDetector.detectLanguage(str6, new org.telegram.messenger.fk(this, strArr, zArr, L, isContextTranslateEnabled, d1Var), new sp0(d1Var, 11));
                                return true;
                            }
                            d1Var.run();
                            return true;
                        }
                    }
                    return true;
                }
            } else if ((i10 == this.P3 || i10 == this.Q3) && getParentActivity() != null && (userFull2 = this.w2) != null) {
                if (i10 != this.P3) {
                    if (i10 == this.Q3 && !L3(i10, view3)) {
                        TLRPC.TL_businessLocation tL_businessLocation = this.w2.business_location;
                        if (tL_businessLocation != null) {
                            str2 = tL_businessLocation.address;
                            String str7 = str2;
                            AtomicReference atomicReference = new AtomicReference();
                            org.telegram.ui.Components.xo xoVar = new org.telegram.ui.Components.xo(getParentActivity(), R.drawable.popup_fixed_alert, i13, this.A0, 1);
                            xoVar.U = new Path();
                            xoVar.setFitItems(true);
                            org.telegram.ui.ActionBar.u0.c(false, false, xoVar, R.drawable.msg_copy, LocaleController.getString(R.string.Copy), false, this.A0).setOnClickListener(new ci.c6(this, atomicReference, str7, i10, 5));
                            org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(xoVar, -2, -2);
                            m1Var.e = true;
                            m1Var.c = 220;
                            m1Var.setOutsideTouchable(true);
                            m1Var.setClippingEnabled(true);
                            m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                            m1Var.setFocusable(true);
                            xoVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            m1Var.setInputMethodMode(2);
                            m1Var.getContentView().setFocusableInTouchMode(true);
                            atomicReference.set(m1Var);
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
                            m1Var.showAtLocation(getFragmentView(), 0, (int) (f11 - (xoVar.getMeasuredWidth() / 2.0f)), (int) f12);
                            m1Var.b();
                            return true;
                        }
                    }
                    return true;
                }
                TL_account.TL_businessWorkHours tL_businessWorkHours = userFull2.business_work_hours;
                if (tL_businessWorkHours != null) {
                    str2 = ig.e1.f0(this.currentAccount, userFull2.user, tL_businessWorkHours);
                    String str72 = str2;
                    AtomicReference atomicReference2 = new AtomicReference();
                    org.telegram.ui.Components.xo xoVar2 = new org.telegram.ui.Components.xo(getParentActivity(), R.drawable.popup_fixed_alert, i13, this.A0, 1);
                    xoVar2.U = new Path();
                    xoVar2.setFitItems(true);
                    org.telegram.ui.ActionBar.u0.c(false, false, xoVar2, R.drawable.msg_copy, LocaleController.getString(R.string.Copy), false, this.A0).setOnClickListener(new ci.c6(this, atomicReference2, str72, i10, 5));
                    org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(xoVar2, -2, -2);
                    m1Var2.e = true;
                    m1Var2.c = 220;
                    m1Var2.setOutsideTouchable(true);
                    m1Var2.setClippingEnabled(true);
                    m1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                    m1Var2.setFocusable(true);
                    xoVar2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    m1Var2.setInputMethodMode(2);
                    m1Var2.getContentView().setFocusableInTouchMode(true);
                    atomicReference2.set(m1Var2);
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
                    m1Var2.showAtLocation(getFragmentView(), 0, (int) (f11 - (xoVar2.getMeasuredWidth() / 2.0f)), (int) f12);
                    m1Var2.b();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x07f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F3(boolean z10) {
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
        org.telegram.ui.Components.ci0 ci0Var;
        boolean z28;
        boolean z29;
        long j10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || this.U0 == null) {
            return;
        }
        Context context = kVar.getContext();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.U0.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        this.Q0 = null;
        this.O0 = false;
        this.M0 = false;
        this.L0 = false;
        this.N0 = false;
        this.B1 = false;
        if (this.f1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f1));
            if (user == null) {
                return;
            }
            if (UserObject.isUserSelf(user)) {
                if (this.t1) {
                    org.telegram.ui.Components.ci0 ci0Var2 = this.a0;
                    if (ci0Var2 != null) {
                        this.O0 = !(ci0Var2.H == 6);
                    } else {
                        this.O0 = true;
                    }
                }
                if (!this.J0) {
                    this.U0.e(30, R.drawable.msg_edit, LocaleController.getString(R.string.EditInfo));
                    if (this.r0 != null) {
                        this.U0.e(36, R.drawable.msg_addphoto, LocaleController.getString(R.string.AddPhoto));
                    }
                }
                this.W0 = this.U0.e(40, R.drawable.menu_profile_colors, LocaleController.getString(R.string.ProfileColorEdit));
                a5();
                if (this.t1) {
                    this.Y0 = this.U0.e(43, R.drawable.menu_username_change, LocaleController.getString(R.string.ProfileUsernameEdit));
                    this.X0 = this.U0.e(42, R.drawable.msg_link2, LocaleController.getString(R.string.ProfileCopyLink));
                    g5();
                }
                z11 = false;
                z28 = false;
                z29 = true;
            } else {
                if (user.bot && user.bot_can_edit) {
                    this.O0 = true;
                }
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && userFull.phone_calls_available) {
                    this.M0 = true;
                    this.N0 = userFull.video_calls_available;
                }
                if (!this.s2 && getContactsController().contactsDict.get(Long.valueOf(this.f1)) != null) {
                    if (this.E2 == null) {
                        G3(context);
                    }
                    if (!TextUtils.isEmpty(user.phone)) {
                        this.U0.e(3, R.drawable.msg_share, LocaleController.getString(R.string.ShareContact));
                    }
                    this.U0.e(2, R.drawable.msg_block, LocaleController.getString(!this.l1 ? R.string.BlockContact : R.string.Unblock));
                    this.U0.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditContact));
                    this.U0.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteContact));
                } else if (MessagesController.isSupportUser(user)) {
                    if (this.l1) {
                        this.U0.e(2, R.drawable.msg_block, LocaleController.getString(R.string.Unblock));
                    }
                    this.U0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                } else if (a() != UserObject.VERIFY) {
                    if (this.E2 == null) {
                        G3(context);
                    }
                    this.U0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    if (this.s2) {
                        this.U0.e(10, R.drawable.msg_share, LocaleController.getString(R.string.BotShare));
                        z11 = true;
                    } else {
                        this.U0.e(1, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddContact));
                        z11 = false;
                    }
                    if (!TextUtils.isEmpty(user.phone)) {
                        this.U0.e(3, R.drawable.msg_share, LocaleController.getString(R.string.ShareContact));
                    }
                    if (this.s2) {
                        this.U0.e(44, R.drawable.menu_privacy_policy, LocaleController.getString(R.string.BotPrivacyPolicy));
                        if (g4()) {
                            this.U0.K(44);
                        } else {
                            this.U0.r(44);
                        }
                        org.telegram.ui.ActionBar.e1 e = this.U0.e(24, R.drawable.msg_report, LocaleController.getString(R.string.ReportBot));
                        int i10 = org.telegram.ui.ActionBar.k6.p7;
                        e.c(i10, i10);
                        if (this.l1) {
                            this.U0.e(2, R.drawable.msg_retry, LocaleController.getString(R.string.BotRestart));
                        } else {
                            this.U0.e(2, R.drawable.msg_block2, LocaleController.getString(R.string.DeleteAndBlock)).c(i10, i10);
                        }
                    } else {
                        this.U0.e(2, R.drawable.msg_block, LocaleController.getString(!this.l1 ? R.string.BlockContact : R.string.Unblock));
                    }
                    if (!UserObject.isDeleted(user) && !this.s2 && this.E2 == null && !this.l1) {
                        j10 = this.f1;
                        if (j10 != 333000 && j10 != 777000 && j10 != 42777) {
                            if (!BuildVars.IS_BILLING_UNAVAILABLE || user.self || user.bot || MessagesController.isSupportUser(user) || getMessagesController().premiumPurchaseBlocked()) {
                                z28 = false;
                            } else {
                                ai.ha.y(this.currentAccount, false).V();
                                this.U0.e(38, R.drawable.msg_gift_premium, LocaleController.getString(R.string.ProfileSendAGift));
                                z28 = true;
                            }
                            if (getMessagesController().config.walletAvailable.get() && !MessagesController.isSupportUser(user) && !UserObject.isService(user.id)) {
                                this.U0.e(48, R.drawable.ic_gram, LocaleController.getString(R.string.WalletSendMoney));
                            }
                            this.U0.e(20, R.drawable.msg_secret, LocaleController.getString(R.string.StartEncryptedChat));
                            this.U0.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f1)));
                            if (this.w2 != null) {
                                this.U0.e(46, R.drawable.menu_share_off_24, LocaleController.getString(R.string.DisableSharing));
                                this.U0.e(47, R.drawable.menu_share_on_24, LocaleController.getString(R.string.EnableSharing));
                                TLRPC.UserFull userFull2 = this.w2;
                                boolean z30 = (userFull2.noforwards_my_enabled || userFull2.noforwards_peer_enabled) ? false : true;
                                this.U0.I(46, z30);
                                this.U0.I(47, !z30);
                            }
                            if (!this.s2 && getContactsController().contactsDict.get(Long.valueOf(this.f1)) != null) {
                                this.U0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                            }
                            z29 = false;
                        }
                    }
                    z28 = false;
                    if (!this.s2) {
                        this.U0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    }
                    z29 = false;
                }
                z11 = false;
                if (!UserObject.isDeleted(user)) {
                    j10 = this.f1;
                    if (j10 != 333000) {
                        if (BuildVars.IS_BILLING_UNAVAILABLE) {
                        }
                        z28 = false;
                        if (getMessagesController().config.walletAvailable.get()) {
                            this.U0.e(48, R.drawable.ic_gram, LocaleController.getString(R.string.WalletSendMoney));
                        }
                        this.U0.e(20, R.drawable.msg_secret, LocaleController.getString(R.string.StartEncryptedChat));
                        this.U0.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f1)));
                        if (this.w2 != null) {
                        }
                        if (!this.s2) {
                        }
                        z29 = false;
                    }
                }
                z28 = false;
                if (!this.s2) {
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
        } else if (this.g1 != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.g1));
            this.q1 = false;
            if (this.h1 == 0 && ChatObject.canChangeChatInfo(chat)) {
                G3(context);
            }
            if (ChatObject.isChannel(chat)) {
                if (this.r1) {
                    if (ChatObject.canManageTopic(this.currentAccount, chat, this.h1)) {
                        this.O0 = true;
                    }
                } else if (ChatObject.hasAdminRights(chat) || (chat.megagroup && ChatObject.canChangeChatInfo(chat))) {
                    this.O0 = true;
                }
                if (this.v2 != null) {
                    if (ChatObject.canManageCalls(chat) && this.v2.call == null) {
                        this.U0.e(15, R.drawable.msg_voicechat, LocaleController.getString((!chat.megagroup || chat.gigagroup) ? R.string.StartVoipChannel : R.string.StartVoipChat));
                        this.q1 = true;
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
                    TLRPC.ChatFull chatFull2 = this.v2;
                    if ((chatFull2.can_view_stats || chatFull2.can_view_revenue || chatFull2.can_view_stars_revenue || getMessagesController().getStoriesController().j(a())) && this.h1 == 0) {
                        this.U0.e(19, R.drawable.msg_stats, LocaleController.getString(R.string.Statistics));
                    }
                    ChatObject.Call groupCall = getMessagesController().getGroupCall(this.g1, false);
                    this.M0 = groupCall != null;
                    z21 = groupCall != null || z26;
                } else {
                    z21 = false;
                    z22 = false;
                }
                getMessagesController().getStoriesController().getClass();
                if (chat == null || !ChatObject.isBoostSupported(chat) || (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.post_stories))) {
                    getMessagesController().getStoriesController().getClass();
                    if (chat != null && ChatObject.isBoostSupported(chat) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories))) {
                        this.U0.e(39, R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories));
                    }
                    z23 = false;
                } else {
                    this.U0.e(39, R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories));
                    z23 = true;
                }
                if (chat.megagroup) {
                    TLRPC.ChatFull chatFull3 = this.v2;
                    if (chatFull3 == null || !chatFull3.participants_hidden || ChatObject.hasAdminRights(chat)) {
                        this.B1 = true;
                        this.U0.e(17, R.drawable.msg_search, LocaleController.getString(R.string.SearchMembers));
                    }
                    if (this.r1 && ChatObject.canDeleteTopic(this.currentAccount, chat, this.h1)) {
                        this.U0.e(23, R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1));
                    }
                    if (this.h1 == 0) {
                        this.U0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    }
                    if (chat.creator) {
                        this.U0.a(-1);
                        this.U0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMega));
                        this.U0.e(45, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteMega)).c(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                    } else if (chat.left || chat.kicked || this.r1) {
                        z12 = z21;
                        z11 = false;
                        z13 = false;
                        z16 = false;
                        z18 = false;
                        z17 = z23;
                        z15 = z22;
                        z14 = false;
                    } else {
                        this.U0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMega));
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
                        this.U0.e(10, R.drawable.msg_share, LocaleController.getString(R.string.BotShare));
                        z24 = !chat.creator;
                    } else {
                        z24 = false;
                    }
                    if (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked()) {
                        z16 = false;
                    } else {
                        ai.ha.y(this.currentAccount, false).V();
                        this.U0.e(38, R.drawable.msg_gift_premium, LocaleController.getString(R.string.ProfileSendAGiftToChannel));
                        org.telegram.ui.ActionBar.u0 u0Var = this.U0;
                        TLRPC.ChatFull chatFull4 = this.v2;
                        u0Var.I(38, chatFull4 != null && chatFull4.stargifts_available);
                        z16 = true;
                    }
                    TLRPC.ChatFull chatFull5 = this.v2;
                    if (chatFull5 == null || chatFull5.linked_chat_id == 0) {
                        z25 = false;
                    } else {
                        this.U0.e(22, R.drawable.msg_discussion, LocaleController.getString(R.string.ViewDiscussion));
                        z25 = true;
                    }
                    if (this.h1 == 0) {
                        this.U0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    }
                    TLRPC.Chat chat2 = this.F2;
                    if (chat2.creator) {
                        this.U0.a(-1);
                        this.U0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveChannel));
                        this.U0.e(45, R.drawable.msg_delete, LocaleController.getString(R.string.ChannelDelete)).c(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
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
                        this.U0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveChannel));
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
                if (this.v2 != null) {
                    if (ChatObject.canManageCalls(chat) && this.v2.call == null) {
                        this.U0.e(15, R.drawable.msg_voicechat, LocaleController.getString(R.string.StartVoipChat));
                        this.q1 = true;
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    ChatObject.Call groupCall2 = getMessagesController().getGroupCall(this.g1, false);
                    this.M0 = groupCall2 != null;
                    if (groupCall2 != null || z20) {
                        z19 = true;
                        if (ChatObject.canChangeChatInfo(chat)) {
                            this.O0 = true;
                        }
                        if (!ChatObject.isKickedFromChat(chat) && !ChatObject.isLeftFromChat(chat) && ((chatFull = this.v2) == null || !chatFull.participants_hidden || ChatObject.hasAdminRights(chat))) {
                            this.B1 = true;
                            this.U0.e(17, R.drawable.msg_search, LocaleController.getString(R.string.SearchMembers));
                        }
                        if (this.h1 == 0) {
                            this.U0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                        }
                        this.U0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.DeleteAndExit));
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
                    this.B1 = true;
                    this.U0.e(17, R.drawable.msg_search, LocaleController.getString(R.string.SearchMembers));
                }
                if (this.h1 == 0) {
                }
                this.U0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.DeleteAndExit));
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
        if (this.r0 != null) {
            this.U0.e(33, R.drawable.msg_openprofile, LocaleController.getString(R.string.SetAsMain));
            this.U0.e(21, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery));
            this.U0.e(35, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
        } else {
            this.U0.e(21, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery));
        }
        if (i4()) {
            this.U0.r(21);
        }
        boolean z33 = z14;
        if (this.f1 != 0 && !this.s2 && !this.t1) {
            org.telegram.ui.ActionBar.e1 e7 = this.U0.e(24, R.drawable.msg_report, LocaleController.getString(R.string.ReportBot));
            int i11 = org.telegram.ui.ActionBar.k6.p7;
            e7.c(i11, i11);
        }
        if (z13 && !this.t1) {
            this.U0.e(31, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        }
        if (!this.q2) {
            this.U0.r(21);
            this.U0.r(33);
            this.U0.K(36);
            this.U0.r(34);
            this.U0.r(35);
        }
        this.L0 = this.M0;
        org.telegram.ui.Components.ci0 ci0Var3 = this.a0;
        if (ci0Var3 != null) {
            ci0Var3.I = true;
            ci0Var3.o(4, z11);
            this.a0.o(5, this.M0);
            this.a0.o(6, this.N0);
            this.a0.o(2, z33);
            this.a0.o(9, z18);
            this.a0.o(12, z17);
            this.a0.o(10, z12);
            this.a0.o(11, z15);
            this.a0.o(3, z16);
            this.N0 = false;
            this.M0 = false;
            if (!z33) {
                if (this.r1) {
                    this.a0.o(0, true);
                } else {
                    if (this.g1 != 0) {
                        TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(this.g1));
                        if (ChatObject.isForum(chat3) || ChatObject.isMegagroup(chat3)) {
                            z27 = false;
                            this.a0.o(0, true);
                        } else if (!ChatObject.isChannel(chat3)) {
                            z27 = false;
                            this.a0.o(0, true);
                        }
                        ci0Var = this.a0;
                        if (ci0Var.I) {
                            ci0Var.I = z27;
                            ci0Var.d();
                        }
                    }
                    z27 = false;
                    ci0Var = this.a0;
                    if (ci0Var.I) {
                    }
                }
            }
            z27 = false;
            ci0Var = this.a0;
            if (ci0Var.I) {
            }
        }
        if (!this.H5) {
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
            if (this.O0) {
                if (this.T0.getVisibility() != 0) {
                    this.T0.setVisibility(0);
                    if (z10) {
                        this.T0.setAlpha(0.0f);
                        this.T0.animate().alpha(1.0f).setDuration(150L).start();
                    }
                }
            } else if (this.T0.getVisibility() != 8) {
                this.T0.setVisibility(8);
            }
        }
        i01 i01Var = this.p0;
        if (i01Var != null && i01Var.h && !i01Var.d.isRunning()) {
            if (this.O0) {
                this.T0.setVisibility(8);
                this.T0.animate().cancel();
                this.T0.setAlpha(1.0f);
            }
            if (this.M0) {
                this.R0.setVisibility(8);
                this.R0.animate().cancel();
                this.R0.setAlpha(1.0f);
            }
            if (this.N0) {
                this.S0.setVisibility(8);
                this.S0.animate().cancel();
                this.S0.setAlpha(1.0f);
            }
        }
        rz0 rz0Var = this.O;
        if (rz0Var != null) {
            rz0Var.getSearchItem().requestLayout();
        }
        p5(false);
    }

    public final void F4() {
        ValueAnimator valueAnimator;
        if (!this.q2 || (valueAnimator = this.k2) == null || !valueAnimator.isRunning()) {
            G4(A3(), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        } else {
            this.f2 = this.M5;
            this.h2 = this.N5;
        }
    }

    public final void G3(Context context) {
        this.b1 = new org.telegram.ui.Components.p8(context, this.U0.getPopupLayout().getSwipeBack(), new ky0(this), false, 0, this.A0);
        if (this.j1 > 0 || this.f1 > 0) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, this.A0);
            org.telegram.ui.Components.p8 p8Var = this.b1;
            org.telegram.ui.Components.y90 y90Var = p8Var.e;
            if (y90Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AutoDeletePopupDescription));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.AutoDeletePopupDescription2), w02, new org.telegram.ui.Components.pg(p8Var, 11)));
                y90Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.w2;
        org.telegram.ui.Components.w21 a2 = org.telegram.ui.Components.w21.a((userFull == null && this.v2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.v2.ttl_period);
        this.t0 = a2;
        this.a1 = this.U0.i(0, a2, LocaleController.getString(R.string.AutoDeletePopupTitle), this.b1.a);
        this.U0.a(-1);
        X4();
    }

    public final void G4(float f7, float f10) {
        float max = Math.max(0.0f, Math.min(1.0f, (this.R1 - V3()) / ((this.a.getMeasuredWidth() - f10) - W3())));
        float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (AndroidUtilities.dp(42.0f) * ((this.R1 >= ((float) V3()) || max >= 0.33f) ? AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) : com.google.android.gms.internal.play_billing.k3.w(f7, 72.0f, 24.0f, 42.0f)))) * f7) + ((float) Math.floor(this.actionBar.getTranslationY() + (org.telegram.messenger.sl.b(f7, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) - (AndroidUtilities.density * 21.0f))));
        this.f2 = (AndroidUtilities.dp(7.0f) * f7) + AndroidUtilities.dp(1.3f) + dpf2;
        this.h2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * f7) + dpf2 + AndroidUtilities.dp(24.0f);
    }

    public final void H3() {
        if (this.fragmentView == null || !this.Z5 || this.z2 == null || getParentActivity() == null) {
            return;
        }
        x01 x01Var = this.i6;
        if (x01Var != null) {
            x01Var.b(this.z2);
            this.i6.invalidate();
        } else {
            x01 x01Var2 = new x01(this, this.z2);
            this.i6 = x01Var2;
            ((FrameLayout) this.fragmentView).addView(x01Var2, w7.z5.e(-1, -1, 55));
        }
    }

    public final void H4() {
        ly0 ly0Var = this.a;
        if (ly0Var == null || this.c == null || ly0Var.getChildCount() <= 0 || this.Y5) {
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
            this.W5 = i11;
            int top = view.getTop();
            this.X5 = top;
            if (this.W5 == 0 && !this.p2 && top > V3()) {
                this.X5 = V3();
            }
            this.c.h1(i11, view.getTop() - this.a.getPaddingTop());
        }
    }

    public final void I4(boolean z10) {
        int i10 = this.L4;
        if (i10 >= 0) {
            if (!z10) {
                this.c.h1(i10, -this.a.getPaddingTop());
                return;
            }
            li.n nVar = new li.n(getParentActivity(), 2, 0.6f);
            nVar.a = this.L4;
            nVar.p = -this.a.getPaddingTop();
            this.c.w0(nVar);
        }
    }

    @Override // org.telegram.ui.xx
    public final /* synthetic */ boolean J(ey eyVar) {
        return false;
    }

    public final void J3(float f7) {
        ValueAnimator ofFloat;
        int i10 = 0;
        boolean z10 = f7 > 0.0f;
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.V5;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.V5 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.y0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new wx0(this, i10));
        this.V5.playTogether(arrayList);
        this.V5.setDuration(z10 ? 150L : 220L);
        if (!z10) {
            this.V5.addListener(new iz0(this, 4));
        }
        this.V5.start();
    }

    @Override // org.telegram.ui.Components.d50
    public final void K(boolean z10, boolean z11) {
        org.telegram.ui.Cells.y3 y3Var = this.h0;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(0.0f);
    }

    public final void K3(int i10, View view) {
        org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(this, view);
        H.W(this.a.W0(view, false));
        H.w = false;
        H.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new ib0(this, 25), this.w2 != null);
        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Edit), new ib0(this, 26), false);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.d2(this, i10, 26), true);
        H.Z();
    }

    public final void K4() {
        org.telegram.ui.Components.ci0 ci0Var = this.a0;
        if (ci0Var == null) {
            return;
        }
        if (this.t1) {
            ci0Var.H = 6;
            return;
        }
        if (this.r1) {
            ci0Var.H = 5;
            return;
        }
        if (this.s2) {
            ci0Var.H = 2;
            return;
        }
        if (this.f1 != 0) {
            ci0Var.H = 0;
            return;
        }
        if (this.g1 != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.g1));
            if (!ChatObject.isChannel(chat)) {
                this.a0.H = 3;
                return;
            }
            if (ChatObject.isMegagroup(chat)) {
                this.a0.H = 3;
            } else if (ChatObject.isForum(chat)) {
                this.a0.H = 4;
            } else {
                this.a0.H = 1;
            }
        }
    }

    public final boolean L3(final int i10, View view) {
        TLRPC.User currentUser;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.t1 && (currentUser = getUserConfig().getCurrentUser()) != null) {
            final TLRPC.UserFull userFull = this.w2;
            if (userFull == null) {
                userFull = getMessagesController().getUserFull(currentUser.id);
            }
            if (userFull != null) {
                String string = LocaleController.getString(R.string.Copy);
                if (i10 == this.L3 || i10 == this.K3 || i10 == this.X2) {
                    str = userFull.about;
                } else if (i10 == this.P3) {
                    str = ig.e1.f0(this.currentAccount, currentUser, userFull.business_work_hours);
                    string = LocaleController.getString(R.string.ProfileHoursCopy);
                } else if (i10 == this.Q3) {
                    str = userFull.business_location.address;
                    string = LocaleController.getString(R.string.ProfileLocationCopy);
                } else if (i10 == this.M3) {
                    str = UserObject.getPublicUsername(currentUser);
                    if (str != null) {
                        str = "@".concat(str);
                    }
                    string = LocaleController.getString(R.string.ProfileCopyUsername);
                } else {
                    str = i10 == this.H3 ? currentUser.phone : i10 == this.V2 ? UserInfoActivity.Z(this.w2.birthday) : null;
                }
                org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(this, view);
                H.W(this.a.W0(view, false));
                H.w = false;
                H.i = 3;
                if (i10 == this.Q3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, LocaleController.getString(R.string.ProfileLocationView), new ib0(this, 5), false);
                    }
                    H.c(R.drawable.msg_map, LocaleController.getString(R.string.ProfileLocationMaps), new ib0(this, 7), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, string, new oj0(str, 27), false);
                }
                if (i10 == this.P3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileHoursEdit), new ib0(this, 8), false);
                    final int i11 = 0;
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileHoursRemove), new Runnable(this) { // from class: org.telegram.ui.tx0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    final ProfileActivity profileActivity = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final int i12 = 0;
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i13 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.yx0
                                        @Override // org.telegram.ui.ActionBar.z1
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i14) {
                                            switch (i12) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull3 = userFull2;
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    ProfileActivity profileActivity2 = profileActivity;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new ay0(profileActivity2, 0));
                                                    profileActivity2.n5();
                                                    profileActivity2.d.u(i13);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull2;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ay0(profileActivity3, 1));
                                                    profileActivity3.n5();
                                                    profileActivity3.d.u(i13);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.a);
                                    break;
                                default:
                                    final ProfileActivity profileActivity2 = this.b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final int i14 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i15 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.yx0
                                        @Override // org.telegram.ui.ActionBar.z1
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i142) {
                                            switch (i14) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new ay0(profileActivity22, 0));
                                                    profileActivity22.n5();
                                                    profileActivity22.d.u(i15);
                                                    profileActivity22.getMessagesStorage().updateUserInfo(userFull32, false);
                                                    break;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ay0(profileActivity3, 1));
                                                    profileActivity3.n5();
                                                    profileActivity3.d.u(i15);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.a);
                                    break;
                            }
                        }
                    }, true);
                } else if (i10 == this.Q3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileLocationEdit), new ib0(this, 9), false);
                    final int i12 = 1;
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileLocationRemove), new Runnable(this) { // from class: org.telegram.ui.tx0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    final ProfileActivity profileActivity = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final int i122 = 0;
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i13 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.yx0
                                        @Override // org.telegram.ui.ActionBar.z1
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i142) {
                                            switch (i122) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull2;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new ay0(profileActivity22, 0));
                                                    profileActivity22.n5();
                                                    profileActivity22.d.u(i13);
                                                    profileActivity22.getMessagesStorage().updateUserInfo(userFull32, false);
                                                    break;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull2;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ay0(profileActivity3, 1));
                                                    profileActivity3.n5();
                                                    profileActivity3.d.u(i13);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity.showDialog(alertDialog$Builder.a);
                                    break;
                                default:
                                    final ProfileActivity profileActivity2 = this.b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder2.a.R = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final int i14 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i15 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.yx0
                                        @Override // org.telegram.ui.ActionBar.z1
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i142) {
                                            switch (i14) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new ay0(profileActivity22, 0));
                                                    profileActivity22.n5();
                                                    profileActivity22.d.u(i15);
                                                    profileActivity22.getMessagesStorage().updateUserInfo(userFull32, false);
                                                    break;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ay0(profileActivity3, 1));
                                                    profileActivity3.n5();
                                                    profileActivity3.d.u(i15);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder2.a);
                                    break;
                            }
                        }
                    }, true);
                } else if (i10 == this.M3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new ib0(this, 10), false);
                } else if (i10 == this.L3 || i10 == this.K3 || i10 == this.X2) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileEditBio), new ib0(this, 11), false);
                } else if (i10 == this.H3) {
                    H.c(R.drawable.menu_storage_path, LocaleController.getString(R.string.ProfilePhoneEdit), new ib0(this, 12), false);
                } else if (i10 == this.V2) {
                    final int i13 = 0;
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileBirthdayChange), new Runnable(this) { // from class: org.telegram.ui.sx0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    ProfileActivity profileActivity = this.b;
                                    Activity parentActivity = profileActivity.getParentActivity();
                                    String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                    String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                    TLRPC.UserFull userFull2 = userFull;
                                    profileActivity.showDialog(org.telegram.ui.Components.f5.m(parentActivity, string2, string3, userFull2.birthday, new org.telegram.ui.Components.qy(18, profileActivity, userFull2), new ib0(profileActivity, 13), false, false, profileActivity.A0).a);
                                    break;
                                case 1:
                                    final ProfileActivity profileActivity2 = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                    String string4 = LocaleController.getString(R.string.Remove);
                                    final int i14 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.xx0
                                        @Override // org.telegram.ui.ActionBar.z1
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i15) {
                                            switch (i14) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.personal_channel_id = 0L;
                                                    userFull4.personal_channel_message = 0;
                                                    userFull4.flags2 &= -65;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatepersonalchannel, new ay0(profileActivity3, 3));
                                                    profileActivity3.i5(false, false);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull5 = userFull3;
                                                    userFull5.birthday = null;
                                                    userFull5.flags2 &= -33;
                                                    ProfileActivity profileActivity4 = profileActivity2;
                                                    profileActivity4.getMessagesController().invalidateContentSettings();
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ay0(profileActivity4, 2));
                                                    profileActivity4.i5(false, false);
                                                    profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder.a);
                                    break;
                                default:
                                    final ProfileActivity profileActivity3 = this.b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                    alertDialog$Builder2.a.R = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                    String string5 = LocaleController.getString(R.string.Remove);
                                    final int i15 = 0;
                                    final TLRPC.UserFull userFull4 = userFull;
                                    alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.xx0
                                        @Override // org.telegram.ui.ActionBar.z1
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i152) {
                                            switch (i15) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull4;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity3;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ay0(profileActivity32, 3));
                                                    profileActivity32.i5(false, false);
                                                    profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull5 = userFull4;
                                                    userFull5.birthday = null;
                                                    userFull5.flags2 &= -33;
                                                    ProfileActivity profileActivity4 = profileActivity3;
                                                    profileActivity4.getMessagesController().invalidateContentSettings();
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ay0(profileActivity4, 2));
                                                    profileActivity4.i5(false, false);
                                                    profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity3.showDialog(alertDialog$Builder2.a);
                                    break;
                            }
                        }
                    }, false);
                    final int i14 = 1;
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) { // from class: org.telegram.ui.sx0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    ProfileActivity profileActivity = this.b;
                                    Activity parentActivity = profileActivity.getParentActivity();
                                    String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                    String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                    TLRPC.UserFull userFull2 = userFull;
                                    profileActivity.showDialog(org.telegram.ui.Components.f5.m(parentActivity, string2, string3, userFull2.birthday, new org.telegram.ui.Components.qy(18, profileActivity, userFull2), new ib0(profileActivity, 13), false, false, profileActivity.A0).a);
                                    break;
                                case 1:
                                    final ProfileActivity profileActivity2 = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                    String string4 = LocaleController.getString(R.string.Remove);
                                    final int i142 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.xx0
                                        @Override // org.telegram.ui.ActionBar.z1
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i152) {
                                            switch (i142) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull3;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity2;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ay0(profileActivity32, 3));
                                                    profileActivity32.i5(false, false);
                                                    profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull5 = userFull3;
                                                    userFull5.birthday = null;
                                                    userFull5.flags2 &= -33;
                                                    ProfileActivity profileActivity4 = profileActivity2;
                                                    profileActivity4.getMessagesController().invalidateContentSettings();
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ay0(profileActivity4, 2));
                                                    profileActivity4.i5(false, false);
                                                    profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder.a);
                                    break;
                                default:
                                    final ProfileActivity profileActivity3 = this.b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                    alertDialog$Builder2.a.R = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                    String string5 = LocaleController.getString(R.string.Remove);
                                    final int i15 = 0;
                                    final TLRPC.UserFull userFull4 = userFull;
                                    alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.xx0
                                        @Override // org.telegram.ui.ActionBar.z1
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i152) {
                                            switch (i15) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull4;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity3;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ay0(profileActivity32, 3));
                                                    profileActivity32.i5(false, false);
                                                    profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull5 = userFull4;
                                                    userFull5.birthday = null;
                                                    userFull5.flags2 &= -33;
                                                    ProfileActivity profileActivity4 = profileActivity3;
                                                    profileActivity4.getMessagesController().invalidateContentSettings();
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ay0(profileActivity4, 2));
                                                    profileActivity4.i5(false, false);
                                                    profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity3.showDialog(alertDialog$Builder2.a);
                                    break;
                            }
                        }
                    }, true);
                } else if (i10 == this.R2) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(userFull.personal_channel_id));
                    if (chat != null && ChatObject.getPublicUsername(chat) != null) {
                        H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileChannelCopy), new mv0(9, this, chat), false);
                    }
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileChannelChange), new ib0(this, 6), false);
                    final int i15 = 2;
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) { // from class: org.telegram.ui.sx0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    ProfileActivity profileActivity = this.b;
                                    Activity parentActivity = profileActivity.getParentActivity();
                                    String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                    String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                    TLRPC.UserFull userFull2 = userFull;
                                    profileActivity.showDialog(org.telegram.ui.Components.f5.m(parentActivity, string2, string3, userFull2.birthday, new org.telegram.ui.Components.qy(18, profileActivity, userFull2), new ib0(profileActivity, 13), false, false, profileActivity.A0).a);
                                    break;
                                case 1:
                                    final ProfileActivity profileActivity2 = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                    String string4 = LocaleController.getString(R.string.Remove);
                                    final int i142 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.xx0
                                        @Override // org.telegram.ui.ActionBar.z1
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i152) {
                                            switch (i142) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull3;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity2;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ay0(profileActivity32, 3));
                                                    profileActivity32.i5(false, false);
                                                    profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull5 = userFull3;
                                                    userFull5.birthday = null;
                                                    userFull5.flags2 &= -33;
                                                    ProfileActivity profileActivity4 = profileActivity2;
                                                    profileActivity4.getMessagesController().invalidateContentSettings();
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ay0(profileActivity4, 2));
                                                    profileActivity4.i5(false, false);
                                                    profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity2.showDialog(alertDialog$Builder.a);
                                    break;
                                default:
                                    final ProfileActivity profileActivity3 = this.b;
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity3.getParentActivity());
                                    alertDialog$Builder2.a.R = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                    String string5 = LocaleController.getString(R.string.Remove);
                                    final int i152 = 0;
                                    final TLRPC.UserFull userFull4 = userFull;
                                    alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.xx0
                                        @Override // org.telegram.ui.ActionBar.z1
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i1522) {
                                            switch (i152) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull4;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity3;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ay0(profileActivity32, 3));
                                                    profileActivity32.i5(false, false);
                                                    profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull5 = userFull4;
                                                    userFull5.birthday = null;
                                                    userFull5.flags2 &= -33;
                                                    ProfileActivity profileActivity4 = profileActivity3;
                                                    profileActivity4.getMessagesController().invalidateContentSettings();
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ay0(profileActivity4, 2));
                                                    profileActivity4.i5(false, false);
                                                    profileActivity4.getMessagesStorage().updateUserInfo(userFull5, false);
                                                    break;
                                            }
                                        }
                                    });
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                    profileActivity3.showDialog(alertDialog$Builder2.a);
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L4(float f7) {
        int w02;
        boolean z10;
        float f10;
        r01 r01Var;
        int i10;
        int f11;
        ai.j1 j1Var;
        t01 t01Var;
        if (this.actionBar == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        this.m2 = f7;
        float lerp = AndroidUtilities.lerp(this.n2, f7);
        this.l2 = lerp;
        D3();
        this.Y.setScaleX(this.c2);
        this.Y.setScaleY(this.c2);
        this.Y.setTranslationY(AndroidUtilities.lerp((float) Math.ceil(this.b2), 0.0f, lerp));
        this.f0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(e4(), 0.0f, lerp));
        vy0 vy0Var = this.f0;
        float f12 = this.c2;
        boolean z11 = this.q2;
        vy0Var.H = lerp;
        vy0Var.I = f12;
        vy0Var.G = z11;
        if (lerp <= 0.0f) {
            org.telegram.ui.Components.ci0 ci0Var = this.a0;
            if (ci0Var != null) {
                ci0Var.i();
            }
            org.telegram.ui.Components.vi0 vi0Var = this.c0;
            if (vi0Var != null) {
                vi0Var.c();
            }
        }
        yy0 yy0Var = this.v0;
        if (yy0Var != null) {
            yy0Var.setExpandProgress(lerp);
        }
        ai.j1 j1Var2 = this.w0;
        if (j1Var2 != null) {
            j1Var2.setExpandProgress(lerp);
        }
        org.telegram.ui.Components.hx0 hx0Var = this.T;
        if (hx0Var != null) {
            hx0Var.setParentExpanded(lerp);
        }
        org.telegram.ui.Components.ci0 ci0Var2 = this.a0;
        if (ci0Var2 != null) {
            ci0Var2.setParentExpanded(lerp);
        }
        org.telegram.ui.Components.vi0 vi0Var2 = this.c0;
        if (vi0Var2 != null) {
            vi0Var2.setParentExpanded(lerp);
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.V0;
        if (u0Var != null) {
            float f13 = 1.0f - lerp;
            u0Var.setAlpha(f13);
            this.V0.setScaleY(f13);
            this.V0.setVisibility(0);
            org.telegram.ui.ActionBar.u0 u0Var2 = this.V0;
            u0Var2.setClickable(u0Var2.getAlpha() > 0.5f);
        }
        float A3 = A3();
        if (A3 >= 1.0f) {
            this.f0.setAlpha(1.0f);
        }
        if (!this.q2) {
            G4(A3, currentActionBarHeight);
        } else if (this.R1 >= W3() && this.i2 < 0.33f) {
            F4();
        }
        org.telegram.ui.Components.zm0 zm0Var = this.L;
        if (zm0Var != null) {
            zm0Var.b(i0.a.f(lerp, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, this.A0), Color.argb(MessagesStorage.LAST_DB_VERSION, 255, 255, 255)));
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.S5 != null ? -1 : i0.a.f(lerp, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.pc, this.A0), -1), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.as[] asVarArr = this.J;
        org.telegram.ui.Components.as asVar = asVarArr[0];
        if (asVar != null) {
            asVar.b(lerp);
        }
        org.telegram.ui.Components.as asVar2 = asVarArr[1];
        if (asVar2 != null) {
            asVar2.b(lerp);
        }
        org.telegram.ui.Components.as[] asVarArr2 = this.K;
        org.telegram.ui.Components.as asVar3 = asVarArr2[0];
        if (asVar3 != null) {
            asVar3.b(lerp);
        }
        org.telegram.ui.Components.as asVar4 = asVarArr2[1];
        if (asVar4 != null) {
            asVar4.b(lerp);
        }
        c5(lerp);
        float f14 = this.e2;
        float f15 = this.g2;
        if (A3 < 1.0f) {
            f14 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(63.0f), f14, A3);
            f15 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(63.0f), f15, A3);
        }
        float dpf2 = AndroidUtilities.dpf2(8.0f);
        float dpf22 = AndroidUtilities.dpf2(this.q2 ? 8.0f : -24.0f);
        float dpf23 = AndroidUtilities.dpf2(18.0f);
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.f;
        float f16 = dpf23 - ((FrameLayout.LayoutParams) n5VarArr[1].getLayoutParams()).leftMargin;
        float f17 = currentActionBarHeight;
        float Q3 = (((this.R1 + f17) - Q3()) - AndroidUtilities.dpf2(30.0f)) - n5VarArr[1].getBottom();
        float z12 = com.google.android.gms.internal.play_billing.k3.z(f16, f14, 2.0f, dpf2 + f14);
        float f18 = this.f2;
        float f19 = 1.0f - lerp;
        float f20 = f19 * f19;
        float f21 = f19 * 2.0f * lerp;
        float f22 = (z12 * f21) + (f14 * f20);
        float f23 = lerp * lerp;
        float f24 = (f16 * f23) + f22;
        float z13 = (Q3 * f23) + (com.google.android.gms.internal.play_billing.k3.z(Q3, f18, 2.0f, dpf22 + f18) * f21) + (f18 * f20);
        float dpf24 = AndroidUtilities.dpf2(16.0f);
        org.telegram.ui.ActionBar.n5[] n5VarArr2 = this.r;
        float f25 = dpf24 - ((FrameLayout.LayoutParams) n5VarArr2[1].getLayoutParams()).leftMargin;
        float Q32 = (((this.R1 + f17) - Q3()) - AndroidUtilities.dpf2(10.0f)) - n5VarArr2[1].getBottom();
        float z14 = com.google.android.gms.internal.play_billing.k3.z(f25, f15, 2.0f, dpf2 + f15);
        float f26 = this.h2;
        float f27 = (f25 * f23) + (z14 * f21) + (f15 * f20);
        float z15 = (f23 * Q32) + (f21 * com.google.android.gms.internal.play_billing.k3.z(Q32, f26, 2.0f, dpf22 + f26)) + (f20 * f26);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
        float dpf25 = AndroidUtilities.dpf2(22.7f) + floor;
        n5VarArr[1].setTranslationX(f24);
        n5VarArr[1].setTranslationY(Math.max(floor, z13));
        n5VarArr2[1].setTranslationX(Y3(f27, Math.min(1.0f, A3) * this.e6));
        n5VarArr2[1].setTranslationY(Z3(Math.max(dpf25, z15)));
        this.s.setTranslationX(f27);
        this.s.setTranslationY(Math.max(dpf25, z15));
        W4();
        j5();
        Object tag = n5VarArr2[1].getTag();
        if (tag instanceof Integer) {
            Integer num = (Integer) tag;
            w02 = org.telegram.ui.ActionBar.k6.w0(num.intValue(), this.A0);
            if (num.intValue() == org.telegram.ui.ActionBar.k6.Bh) {
                z10 = true;
                n5VarArr2[1].setTextColor(i0.a.f(lerp, x3(w02, Boolean.valueOf(z10)), -1275068417));
                if (this.R1 <= W3()) {
                    n5VarArr[1].setPivotY(AndroidUtilities.lerp(0, r4.getMeasuredHeight(), lerp));
                    f10 = 1.0f;
                    float f28 = (0.12f * A3) + 1.0f;
                    n5VarArr[1].setScaleX(AndroidUtilities.lerp(f28, 1.38f, lerp));
                    n5VarArr[1].setScaleY(AndroidUtilities.lerp(f28, 1.38f, lerp));
                } else {
                    f10 = 1.0f;
                }
                n4(0, Math.min(f10, A3), true);
                r01Var = this.h6;
                if (r01Var != null) {
                    r01Var.a(i0.a.f(this.l2, org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.b(0.18f, -0.1f, this.d1)), 603979775));
                }
                org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[1];
                if (this.S5 == null) {
                    f11 = -1;
                    i10 = -1;
                } else {
                    i10 = -1;
                    f11 = i0.a.f(this.l2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vh, this.A0), -1);
                }
                n5Var.setTextColor(f11);
                this.actionBar.B(this.S5 == null ? i10 : i0.a.f(lerp, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.A0), i10), false);
                this.actionBar.setMenuOffsetSuppressed(true);
                this.f0.setForegroundAlpha(lerp);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                layoutParams.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.a.getMeasuredWidth() / this.c2, lerp);
                layoutParams.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.R1 + f17) / this.c2, lerp);
                P3();
                this.Y.requestLayout();
                j1Var = this.w0;
                if (j1Var != null) {
                    j1Var.setExpandProgress(lerp);
                }
                Z4();
                t01Var = this.e1;
                if (t01Var == null && t01Var.K) {
                    t01Var.invalidate();
                    return;
                }
            }
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.A0);
        }
        z10 = false;
        n5VarArr2[1].setTextColor(i0.a.f(lerp, x3(w02, Boolean.valueOf(z10)), -1275068417));
        if (this.R1 <= W3()) {
        }
        n4(0, Math.min(f10, A3), true);
        r01Var = this.h6;
        if (r01Var != null) {
        }
        org.telegram.ui.ActionBar.n5 n5Var2 = n5VarArr[1];
        if (this.S5 == null) {
        }
        n5Var2.setTextColor(f11);
        this.actionBar.B(this.S5 == null ? i10 : i0.a.f(lerp, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.A0), i10), false);
        this.actionBar.setMenuOffsetSuppressed(true);
        this.f0.setForegroundAlpha(lerp);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
        layoutParams2.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.a.getMeasuredWidth() / this.c2, lerp);
        layoutParams2.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.R1 + f17) / this.c2, lerp);
        P3();
        this.Y.requestLayout();
        j1Var = this.w0;
        if (j1Var != null) {
        }
        Z4();
        t01Var = this.e1;
        if (t01Var == null) {
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public final void M() {
        org.telegram.ui.Components.pv0 pv0Var;
        rz0 rz0Var = this.O;
        if (rz0Var != null && (pv0Var = this.R) != null) {
            rz0Var.setNewMediaCounts(pv0Var.c);
        }
        if (this.d != null) {
            i5(false, false);
        }
        R();
        if (this.w2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final boolean M3() {
        View view;
        if ((this.J0 || (!AndroidUtilities.isTablet() && !this.o2)) && this.f0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            this.G0 = true;
            this.p2 = true;
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
                ly0 ly0Var = this.a;
                View F = ly0Var.F(view);
                s4.b1 T = F != null ? ly0Var.T(F) : null;
                if (T != null) {
                    Integer num = (Integer) this.Z1.get(Integer.valueOf(T.b()));
                    if (num != null) {
                        this.Q1 = true;
                        this.a.v0(0, -(((this.a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.bs.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void M4(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.v2 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.n1 == 0) {
                this.n1 = -j10;
                getMediaDataController().getMediaCounts(this.n1, this.h1, this.classGuid);
            }
        }
        rz0 rz0Var = this.O;
        if (rz0Var != null) {
            rz0Var.setChatInfo(this.v2);
        }
        wy0 wy0Var = this.o0;
        if (wy0Var != null && !this.r1) {
            wy0Var.setChatInfo(this.v2);
        }
        yy0 yy0Var = this.v0;
        if (yy0Var != null && (chatFull3 = this.v2) != null) {
            yy0Var.setStories(chatFull3.stories);
        }
        ai.j1 j1Var = this.w0;
        if (j1Var != null) {
            j1Var.a();
        }
        vy0 vy0Var = this.f0;
        if (vy0Var != null) {
            vy0Var.setHasStories(l4());
        }
        N3();
        if (this.g1 != 0) {
            boolean z10 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.v2) == null || !chatFull2.stargifts_available) ? false : true;
            this.U0.I(38, z10);
            org.telegram.ui.Components.ci0 ci0Var = this.a0;
            if (ci0Var != null) {
                ci0Var.o(3, z10);
            }
        }
    }

    public final void N3() {
        TLRPC.Chat chat = this.F2;
        if (chat == null || !chat.megagroup) {
            return;
        }
        TLRPC.ChatFull chatFull = this.v2;
        if (!(chatFull instanceof TLRPC.TL_channelFull) || chatFull.participants == null) {
            return;
        }
        for (int i10 = 0; i10 < this.v2.participants.participants.size(); i10++) {
            TLRPC.ChatParticipant chatParticipant = this.v2.participants.participants.get(i10);
            this.D1.k(chatParticipant, chatParticipant.user_id);
        }
    }

    public final void N4(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z == null || (tL_emojiStatusCollectible2 = this.m6) == tL_emojiStatusCollectible) {
            return;
        }
        if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
            this.m6 = tL_emojiStatusCollectible;
            ei.x3 x3Var = this.j6;
            int i10 = 1;
            if (x3Var != null) {
                x3Var.e(true);
            }
            if (tL_emojiStatusCollectible == null || TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                return;
            }
            this.l6 = null;
            this.j6 = new ei.x3(getParentActivity(), 3);
            this.k6 = org.telegram.ui.ActionBar.k6.v(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.k6.o1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
            this.j6.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            ei.x3 x3Var2 = this.j6;
            int o12 = org.telegram.ui.ActionBar.k6.o1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
            x3Var2.A0 = true;
            x3Var2.I0 = System.currentTimeMillis();
            x3Var2.B0 = new Path();
            x3Var2.C0 = AndroidUtilities.dpf2(0.66f) / 2.0f;
            x3Var2.D0 = new Paint(1);
            x3Var2.E0 = new Paint(1);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, o12), org.telegram.ui.ActionBar.k6.o1(1.0f, o12), org.telegram.ui.ActionBar.k6.o1(0.0f, o12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            x3Var2.H0 = linearGradient;
            x3Var2.E0.setShader(linearGradient);
            x3Var2.F0 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, o12), org.telegram.ui.ActionBar.k6.o1(0.5f, o12), org.telegram.ui.ActionBar.k6.o1(0.0f, o12)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            x3Var2.G0 = new Matrix();
            x3Var2.D0.setShader(x3Var2.F0);
            x3Var2.E0.setStyle(Paint.Style.STROKE);
            x3Var2.E0.setStrokeJoin(Paint.Join.ROUND);
            x3Var2.E0.setStrokeCap(Paint.Cap.ROUND);
            x3Var2.E0.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
            this.Z.addView(this.j6, w7.z5.c(24.0f, -1));
            this.j6.t(9.33f);
            ei.x3 x3Var3 = this.j6;
            Typeface bold = AndroidUtilities.bold();
            x3Var3.H.x(bold);
            x3Var3.J.setTypeface(bold);
            this.j6.s(tL_emojiStatusCollectible.title);
            ei.x3 x3Var4 = this.j6;
            x3Var4.d = -1L;
            x3Var4.k(5.66f, 2.66f, 5.66f, 2.66f);
            ei.x3 x3Var5 = this.j6;
            x3Var5.getClass();
            x3Var5.y = AndroidUtilities.dpf2(4.0f);
            x3Var5.E = AndroidUtilities.dpf2(2.66f);
            this.j6.r();
            this.j6.q(16.0f);
            this.j6.u();
            this.j6.setOnClickListener(new ey0(this, tL_emojiStatusCollectible.slug, i10));
            if (this.R1 < AndroidUtilities.dp(82.0f)) {
                this.l6 = Boolean.FALSE;
                this.j6.setAlpha(0.0f);
            }
            Z4();
            ei.x3 x3Var6 = this.j6;
            Objects.requireNonNull(x3Var6);
            AndroidUtilities.runOnUIThread(new oj0(x3Var6, 28), 6000L);
        }
    }

    public final boolean O3() {
        org.telegram.ui.ActionBar.h5 h5Var;
        if (this.K1 == 0 || (h5Var = this.parentLayout) == null || h5Var.getFragmentStack() == null || this.parentLayout.getFragmentStack().size() < 2 || !(this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof sn)) {
            return false;
        }
        finishFragment();
        return true;
    }

    public final void P3() {
        if (this.a == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
        float x10 = org.telegram.ui.Cells.b1.x(layoutParams.width, this.c2, 0.5f, this.a.getMeasuredWidth() / 2.0f);
        this.a2 = x10;
        if (this.H1) {
            this.a2 = AndroidUtilities.lerp(this.Q5, x10, this.T1);
        }
        this.Y.setTranslationX(this.a2);
    }

    public final void P4(yz0 yz0Var) {
        if (this.k5 == yz0Var) {
            return;
        }
        this.k5 = yz0Var;
        AndroidUtilities.forEachViews((RecyclerView) this.a, (Utilities.Callback<View>) new zx0(this, 0));
    }

    @Override // org.telegram.ui.Components.d50
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new hi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final int Q3() {
        if (this.f1 == 0 || this.r0 == null || this.t1) {
            return AndroidUtilities.dp(74 + ((this.J4 || this.K4) ? 25 : 0));
        }
        return 0;
    }

    public final void Q4(int i10) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (AndroidUtilities.isTablet()) {
            return;
        }
        this.L1 = i10 != 0;
        this.M1 = i10 != 0;
        o5();
        if (globalMainSettings.getBoolean("view_animations", true)) {
            this.K1 = i10;
        } else if (i10 == 2) {
            this.o1 = true;
        }
    }

    @Override // org.telegram.ui.Components.ju0
    public final void R() {
        int i10;
        rz0 rz0Var = this.O;
        if (rz0Var == null || this.s == null) {
            return;
        }
        int closestTab = rz0Var.getClosestTab();
        int[] iArr = this.R.c;
        if (closestTab == 0) {
            if (iArr[7] <= 0 && iArr[6] <= 0) {
                int i11 = iArr[0];
                if (i11 <= 0) {
                    this.s.setText(LocaleController.getString(R.string.SharedMedia));
                    return;
                } else {
                    this.s.setText(LocaleController.formatPluralString("Media", i11, new Object[0]));
                    return;
                }
            }
            if (this.O.getPhotosVideosTypeFilter() == 1 || iArr[7] <= 0) {
                this.s.setText(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]));
                return;
            } else if (this.O.getPhotosVideosTypeFilter() == 2 || (i10 = iArr[6]) <= 0) {
                this.s.setText(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
                return;
            } else {
                this.s.setText(a1.g.D(LocaleController.formatPluralString("Photos", i10, new Object[0]), ", ", LocaleController.formatPluralString("Videos", iArr[7], new Object[0])));
                return;
            }
        }
        if (closestTab == 1) {
            int i12 = iArr[1];
            if (i12 <= 0) {
                this.s.setText(LocaleController.getString(R.string.Files));
                return;
            } else {
                this.s.setText(LocaleController.formatPluralString("Files", i12, new Object[0]));
                return;
            }
        }
        if (closestTab == 2) {
            int i13 = iArr[2];
            if (i13 <= 0) {
                this.s.setText(LocaleController.getString(R.string.Voice));
                return;
            } else {
                this.s.setText(LocaleController.formatPluralString("Voice", i13, new Object[0]));
                return;
            }
        }
        if (closestTab == 3) {
            int i14 = iArr[3];
            if (i14 <= 0) {
                this.s.setText(LocaleController.getString(R.string.SharedLinks));
                return;
            } else {
                this.s.setText(LocaleController.formatPluralString("Links", i14, new Object[0]));
                return;
            }
        }
        if (closestTab == 4) {
            int i15 = iArr[4];
            if (i15 <= 0) {
                this.s.setText(LocaleController.getString(R.string.Music));
                return;
            } else {
                this.s.setText(LocaleController.formatPluralString("MusicFiles", i15, new Object[0]));
                return;
            }
        }
        if (closestTab == 5) {
            int i16 = iArr[5];
            if (i16 <= 0) {
                this.s.setText(LocaleController.getString(R.string.AccDescrGIFs));
                return;
            } else {
                this.s.setText(LocaleController.formatPluralString("GIFs", i16, new Object[0]));
                return;
            }
        }
        if (closestTab == 6) {
            this.s.setText(LocaleController.formatPluralString("CommonGroups", this.w2.common_chats_count, new Object[0]));
            return;
        }
        if (closestTab == 7) {
            this.s.setText(this.r[1].getText());
            return;
        }
        if (closestTab == 8 || org.telegram.ui.Components.xv0.z0(closestTab)) {
            if (this.s2) {
                this.s.setText(this.O.W(false));
                return;
            } else if (this.O.d0(closestTab) > 0) {
                this.s.setText(LocaleController.formatPluralString("ProfileStoriesCount", this.O.d0(closestTab), new Object[0]));
                return;
            } else {
                this.s.setText(LocaleController.getString(R.string.ProfileStoriesCountZero));
                return;
            }
        }
        if (closestTab == 13) {
            this.s.setText(this.O.W(true));
            return;
        }
        if (closestTab == 9) {
            this.s.setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", this.O.d0(closestTab), new Object[0]));
            return;
        }
        if (closestTab == 10) {
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(a());
            this.s.setText(LocaleController.formatPluralString(this.s2 ? "Bots" : "Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]));
            return;
        }
        if (closestTab == 12) {
            this.s.setText(LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, getMessagesController().getSavedMessagesController().getMessagesCount(a())), new Object[0]));
            return;
        }
        if (closestTab == 14) {
            org.telegram.ui.Components.fp0 fp0Var = this.s;
            org.telegram.ui.Components.ns0 ns0Var = this.O.V;
            fp0Var.setText(LocaleController.formatPluralStringComma("ProfileGiftsCount", ns0Var != null ? ns0Var.getGiftsCount() : 0));
        } else if (closestTab == 15) {
            int i17 = iArr[8];
            if (i17 <= 0) {
                this.s.setText(LocaleController.getString(R.string.SharedPollTab));
            } else {
                this.s.setText(LocaleController.formatPluralStringComma("ProfilePollsCount", i17));
            }
        }
    }

    public final int R3(ImageReceiver imageReceiver) {
        return imageReceiver.getDrawable() instanceof org.telegram.ui.Components.u71 ? ((org.telegram.ui.Components.u71) imageReceiver.getDrawable()).a.a() : AndroidUtilities.calcBitmapColor(this.f0.getImageReceiver().getBitmap());
    }

    public final void R4(TLRPC.UserFull userFull, org.telegram.ui.Cells.g6 g6Var, u01 u01Var) {
        this.w2 = userFull;
        org.telegram.ui.Components.hx0 hx0Var = this.T;
        if (hx0Var != null) {
            hx0Var.set(userFull.stars_rating);
        }
        yy0 yy0Var = this.v0;
        if (yy0Var != null) {
            yy0Var.setStories(this.w2.stories);
        }
        ai.j1 j1Var = this.w0;
        if (j1Var != null) {
            j1Var.a();
        }
        vy0 vy0Var = this.f0;
        if (vy0Var != null) {
            vy0Var.setHasStories(l4());
        }
        rz0 rz0Var = this.O;
        if (rz0Var != null) {
            rz0Var.setUserInfo(this.w2);
        }
        if (this.x2 == null) {
            this.x2 = g6Var;
        }
        if (this.x2 == null) {
            this.x2 = new org.telegram.ui.Cells.g6(this.currentAccount);
        }
        org.telegram.ui.Cells.g6 g6Var2 = this.x2;
        ib0 ib0Var = new ib0(this, 20);
        if (g6Var2.c) {
            ib0Var.run();
        } else {
            g6Var2.h.add(ib0Var);
        }
        this.x2.d(this.w2);
        if (this.z2 == null) {
            this.z2 = u01Var;
        }
        u01 u01Var2 = this.z2;
        if (u01Var2 == null) {
            u01 c10 = u01.c(this.currentAccount, this.w2, u01Var2);
            this.z2 = c10;
            this.y2 = c10 != null;
        }
        u01 u01Var3 = this.z2;
        if (u01Var3 != null) {
            ib0 ib0Var2 = new ib0(this, 16);
            if (u01Var3.b) {
                ib0Var2.run();
            } else {
                u01Var3.h.add(ib0Var2);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.U0;
        if (u0Var != null) {
            u0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f1)));
            if (g4()) {
                this.U0.K(44);
            } else {
                this.U0.r(44);
            }
        }
    }

    public final org.telegram.ui.Components.p5 S3(int i10, long j10) {
        org.telegram.ui.Components.p5[] p5VarArr = this.H;
        if (p5VarArr[i10] == null) {
            org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(AndroidUtilities.dp(17.0f), i10 == 0 ? 7 : 2, this.f[i10], false);
            p5VarArr[i10] = p5Var;
            int dp = AndroidUtilities.dp(1.0f);
            p5Var.I = 0;
            p5Var.J = dp;
            if (this.H0) {
                p5VarArr[i10].a();
            }
        }
        if (j10 != 0) {
            p5VarArr[i10].j(j10, false);
        } else {
            p5VarArr[i10].g(null, false);
        }
        b5();
        return p5VarArr[i10];
    }

    public final void S4(boolean z10, boolean z11) {
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
        int i10 = 1;
        if (z10) {
            this.h0.setVisibility(0);
            this.g0.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<org.telegram.ui.Cells.y3, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<org.telegram.ui.Cells.y3, Float>) View.ALPHA, 0.0f));
        }
        this.g0.setDuration(180L);
        this.g0.addListener(new jz0(this, z10, i10));
        this.g0.start();
    }

    @Override // org.telegram.ui.Components.ju0
    public final boolean T() {
        return this.B1;
    }

    public final void T3(boolean z10) {
        a0.h hVar;
        if (this.C1 || (hVar = this.D1) == null || this.v2 == null) {
            return;
        }
        this.C1 = true;
        int i10 = (hVar.m() == 0 || !z10) ? 0 : 300;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.g1);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = z10 ? 0 : this.D1.m();
        tL_channels_getParticipants.limit = 200;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new hg.u(this, tL_channels_getParticipants, i10)), this.classGuid);
    }

    public final void T4() {
        Long l4;
        if (this.D5 != null) {
            return;
        }
        s51[] s51VarArr = new s51[1];
        Rect rect = AndroidUtilities.rectTmp2;
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.f;
        org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[1];
        if (n5Var != null) {
            if (n5Var.getRightDrawable() == null) {
                rect.set(n5VarArr[1].getWidth() - 1, (n5VarArr[1].getHeight() / 2) - 1, n5VarArr[1].getWidth() + 1, (n5VarArr[1].getHeight() / 2) + 1);
            } else {
                rect.set(n5VarArr[1].getRightDrawable().getBounds());
                rect.offset((int) ((n5VarArr[1].getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) n5VarArr[1].getX(), (int) n5VarArr[1].getY());
            }
        }
        int i10 = n5VarArr[1].getScaleX() < 1.5f ? 16 : 32;
        int dp = (-(this.Z.getHeight() - rect.centerY())) - AndroidUtilities.dp(i10);
        int min = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = w7.r.b(centerX - (min / 2), 0, AndroidUtilities.displaySize.x - min);
        bz0 bz0Var = new bz0(this, this, getParentActivity(), Integer.valueOf(Math.max(0, centerX - b10)), this.F2 == null ? 0 : 9, this.A0, i10, s51VarArr);
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f1));
        if (user != null) {
            bz0Var.setExpireDateHint(DialogObject.getEmojiStatusUntil(user.emoji_status));
        }
        Long l10 = this.F;
        org.telegram.ui.Components.p5[] p5VarArr = this.G;
        if (l10 != null) {
            bz0Var.setSelected(l10);
        } else {
            org.telegram.ui.Components.p5 p5Var = p5VarArr[1];
            if (p5Var != null) {
                Drawable drawable = p5Var.f[0];
                if (drawable instanceof org.telegram.ui.Components.r5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.r5) drawable).i());
                    bz0Var.setSelected(l4);
                }
            }
            l4 = null;
            bz0Var.setSelected(l4);
        }
        bz0Var.setSaveState(3);
        bz0Var.y(p5VarArr[1], n5VarArr[1]);
        cz0 cz0Var = new cz0(this, bz0Var);
        this.D5 = cz0Var;
        s51VarArr[0] = cz0Var;
        int[] iArr = new int[2];
        org.telegram.ui.ActionBar.n5 n5Var2 = n5VarArr[1];
        if (n5Var2 != null) {
            n5Var2.getLocationOnScreen(iArr);
        }
        s51VarArr[0].showAsDropDown(this.fragmentView, b10, dp, 51);
        s51VarArr[0].b();
    }

    public final org.telegram.ui.Components.p5 U3(TLRPC.EmojiStatus emojiStatus, boolean z10, int i10) {
        org.telegram.ui.Components.p5[] p5VarArr = this.G;
        if (p5VarArr[i10] == null) {
            org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), i10 == 0 ? 7 : 2, this.f[i10], false);
            p5VarArr[i10] = p5Var;
            if (this.H0) {
                p5Var.a();
            }
        }
        if (i10 == 1) {
            this.F = null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((1 & tL_emojiStatus.flags) == 0 || tL_emojiStatus.until > ((int) (System.currentTimeMillis() / 1000))) {
                p5VarArr[i10].j(tL_emojiStatus.document_id, z10);
                p5VarArr[i10].m(false, z10);
            } else {
                p5VarArr[i10].g(a4(i10), z10);
                p5VarArr[i10].m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
                if (i10 == 1) {
                    this.F = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                }
                p5VarArr[i10].j(tL_emojiStatusCollectible.document_id, z10);
                p5VarArr[i10].m(true, z10);
            } else {
                p5VarArr[i10].g(a4(i10), z10);
                p5VarArr[i10].m(false, z10);
            }
        } else {
            p5VarArr[i10].g(a4(i10), z10);
            p5VarArr[i10].m(false, z10);
        }
        b5();
        return p5VarArr[i10];
    }

    public final void U4() {
        int i10 = 0;
        this.O.I0.setReordering(false);
        rz0 rz0Var = this.O;
        org.telegram.ui.Components.nt0 nt0Var = rz0Var.I0;
        if (rz0Var.v1 != null && nt0Var != null) {
            boolean u02 = rz0Var.u0();
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = nt0Var.getTabIds();
            int size = tabIds.size();
            while (i10 < size) {
                Integer num = tabIds.get(i10);
                i10++;
                TLRPC.ProfileTab f02 = org.telegram.ui.Components.xv0.f0(num.intValue(), u02);
                if (f02 != null) {
                    arrayList.add(f02);
                }
            }
        }
        this.O.A1(true);
        this.A5.animate().translationY(AndroidUtilities.dp(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.bs.h).withEndAction(new ib0(this, 21)).start();
        org.telegram.ui.Components.xc.a0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    public final int V3() {
        return Q3() + W3();
    }

    public final void V4() {
        if (!this.q2) {
            org.telegram.ui.ActionBar.n5[] n5VarArr = this.r;
            org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[1];
            if (n5Var != null) {
                Object tag = n5Var.getTag();
                for (int i10 = 0; i10 < 2; i10++) {
                    if (tag instanceof Integer) {
                        n5VarArr[i10 + 1].setTextColor(x3(org.telegram.ui.ActionBar.k6.w0(((Integer) tag).intValue(), this.A0), Boolean.valueOf(this.K0[0])));
                    } else {
                        n5VarArr[i10 + 1].setTextColor(x3(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.A0), Boolean.TRUE));
                    }
                }
            }
            Drawable drawable = this.x;
            if (drawable != null) {
                drawable.setColorFilter(this.S5 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.pc, this.A0), PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.zm0 zm0Var = this.L;
            if (zm0Var != null) {
                zm0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, this.A0));
            }
            org.telegram.ui.ActionBar.n5 n5Var2 = this.f[1];
            if (n5Var2 != null) {
                n5Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vh, this.A0));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.B(this.S5 == null ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.A0) : -1, false);
                this.actionBar.A(this.S5 != null ? 553648127 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f8, this.A0), false);
            }
        }
        b5();
        t5();
    }

    public final int W3() {
        return Q3() == 0 ? AndroidUtilities.dp(168.0f) : AndroidUtilities.dp(152.0f);
    }

    public final void W4() {
        l0 l0Var;
        if (this.a0 == null || this.r[1] == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        org.telegram.ui.Components.ci0 ci0Var = this.a0;
        boolean z10 = this.H1;
        ci0Var.e = z10;
        if (z10 && this.K1 == 2 && (l0Var = this.Y) != null) {
            this.a0.f = this.Y.getY() + (this.Y.getScaleY() * l0Var.getHeight());
            this.a0.setAlpha(this.T1);
            org.telegram.ui.Components.ci0 ci0Var2 = this.a0;
            float measuredWidth = this.a.getMeasuredWidth();
            ci0Var2.E = AndroidUtilities.dp(74.0f);
            ci0Var2.setTranslationY(measuredWidth);
            ci0Var2.invalidate();
        } else {
            ci0Var.f = -1.0f;
            float f7 = currentActionBarHeight;
            float dp = (this.R1 + f7) - AndroidUtilities.dp((this.J4 || this.K4) ? 25.0f : 0.0f);
            float min = Math.min(AndroidUtilities.dp(74.0f), dp - f7);
            org.telegram.ui.Components.ci0 ci0Var3 = this.a0;
            ci0Var3.E = min;
            ci0Var3.setTranslationY(dp - min);
            ci0Var3.invalidate();
        }
        ImageView imageView = this.P0;
        if (imageView == null || imageView.getTag() == null) {
            return;
        }
        this.a0.getClass();
        if (this.P0.getVisibility() == 0) {
            this.P0.setVisibility(8);
        }
        if (this.P0.getTag() instanceof org.telegram.ui.ActionBar.u0) {
            ((org.telegram.ui.ActionBar.u0) this.P0.getTag()).setAlpha(1.0f);
        }
    }

    public final Drawable X3() {
        if (this.x == null) {
            this.x = org.telegram.ui.ActionBar.k6.l4.getConstantState().newDrawable().mutate();
        }
        return this.x;
    }

    public final void X4() {
        if (this.a1 == null || this.b1 == null) {
            return;
        }
        TLRPC.UserFull userFull = this.w2;
        int i10 = (userFull == null && this.v2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.v2.ttl_period;
        this.t0.b(i10);
        this.b1.b(i10);
    }

    public final float Y3(float f7, float f10) {
        this.d6 = f7;
        this.f6 = f10;
        int i10 = this.K1;
        float clamp01 = Utilities.clamp01(i10 == 2 ? 1.0f : (this.T1 >= 1.0f || i10 == 0) ? this.l2 : 0.0f);
        org.telegram.ui.Components.hx0 hx0Var = this.T;
        return Math.max(0.0f, (b4() + this.q5) * clamp01) + com.google.android.gms.internal.play_billing.k3.y(1.0f, clamp01, f10 * (hx0Var != null ? hx0Var.getVisibilityFactor() : 0.0f), f7);
    }

    public final void Y4() {
        if (this.u5 == null) {
            return;
        }
        rz0 rz0Var = this.O;
        boolean z10 = ((rz0Var == null || !rz0Var.isAttachedToWindow()) ? (float) AndroidUtilities.dp(72.0f) : ((float) AndroidUtilities.dp(232.0f)) - (((float) this.a.getMeasuredHeight()) - this.O.getY())) <= 0.0f;
        ne.b bVar = this.C5;
        bVar.a(z10, true);
        float f7 = bVar.e;
        this.u5.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f7));
        this.u5.setAlpha(f7);
        this.u5.setVisibility(f7 <= 0.0f ? 4 : 0);
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
        if (qcVar != null) {
            qcVar.l();
        }
    }

    public final float Z3(float f7) {
        this.g6 = f7;
        int i10 = this.K1;
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, Utilities.clamp01(i10 == 2 ? 1.0f : (this.T1 >= 1.0f || i10 == 0) ? this.l2 : 0.0f), this.T != null ? this.T.getVisibilityFactor() * AndroidUtilities.dp(3.0f) : 0.0f, f7);
    }

    public final void Z4() {
        ei.x3 x3Var = this.j6;
        if (x3Var == null) {
            return;
        }
        float f7 = -x3Var.getPaddingLeft();
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.f;
        x3Var.m(0.0f, (n5VarArr[1].getScaleX() * n5VarArr[1].getRightDrawableX()) + n5VarArr[1].getX() + f7);
        float lerp = AndroidUtilities.lerp(this.n2, this.m2);
        this.j6.setTranslationY(((n5VarArr[1].getY() + (-r4.getPaddingBottom())) - AndroidUtilities.dp(24.0f)) + AndroidUtilities.lerp(AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(12.0f), lerp));
        this.j6.h(i0.a.f(lerp, this.k6, 1342177280));
        boolean z10 = this.R1 >= ((float) AndroidUtilities.dp(82.0f));
        Boolean bool = this.l6;
        if (bool == null || bool.booleanValue() != z10) {
            ViewPropertyAnimator animate = this.j6.animate();
            this.l6 = Boolean.valueOf(z10);
            org.telegram.messenger.sl.t(animate.alpha(z10 ? 1.0f : 0.0f), org.telegram.ui.Components.bs.g, 200L);
        }
    }

    public final long a() {
        long j10 = this.j1;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.f1;
        return j11 != 0 ? j11 : -this.g1;
    }

    public final org.telegram.ui.Components.as a4(int i10) {
        org.telegram.ui.Components.as[] asVarArr = this.K;
        if (asVarArr[i10] == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            Drawable[] drawableArr = this.E;
            drawableArr[i10] = mutate;
            drawableArr[i10].setColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.zh, this.A0), PorterDuff.Mode.MULTIPLY);
            asVarArr[i10] = new org.telegram.ui.Components.as(drawableArr[i10], getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return asVarArr[i10];
    }

    public final void a5() {
        if (getParentActivity() == null || this.W0 == null) {
            return;
        }
        if (getUserConfig().isPremium()) {
            this.W0.setIcon(R.drawable.menu_profile_colors);
            return;
        }
        Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.A0), PorterDuff.Mode.SRC_IN));
        this.G6 = drawable;
        Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
        drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.W0.setIcon(new ci.o2(drawable, drawable2, AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f)));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f8));
    }

    public final float b4() {
        if (this.T == null) {
            return 0.0f;
        }
        return this.T.getVisibilityFactor() * AndroidUtilities.dp(22.0f);
    }

    public final void b5() {
        c5(this.R5);
    }

    public final org.telegram.ui.Components.zm0 c4(int i10) {
        if (this.L == null) {
            org.telegram.ui.Components.zm0 zm0Var = new org.telegram.ui.Components.zm0(i10);
            this.L = zm0Var;
            zm0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, this.A0));
        }
        return this.L;
    }

    public final void c5(float f7) {
        int i10 = 0;
        while (i10 < 2) {
            MessagesController.PeerColor peerColor = this.S5;
            int offsetColor = (peerColor == null || i10 != 1) ? AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.zh, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oi, this.A0), this.G5, 1.0f) : i0.a.f(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), -1);
            int f10 = i0.a.f(f7, offsetColor, -1);
            int i11 = org.telegram.ui.ActionBar.k6.Oi;
            int f11 = i0.a.f(this.G5, f10, org.telegram.ui.ActionBar.k6.w0(i11, this.A0));
            org.telegram.ui.Components.p5 p5Var = this.G[i10];
            if (p5Var != null) {
                p5Var.k(Integer.valueOf(f11));
            }
            org.telegram.ui.Components.p5 p5Var2 = this.H[i10];
            if (p5Var2 != null) {
                p5Var2.k(Integer.valueOf(i0.a.f(this.G5, i0.a.f(f7, offsetColor, -1711276033), org.telegram.ui.ActionBar.k6.w0(i11, this.A0))));
            }
            if (i10 == 1) {
                this.e0.setColor(f11);
            }
            i10++;
        }
        this.R5 = f7;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean canBeginSlide() {
        if (this.O.A0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void clearViews() {
        this.S5 = null;
        super.clearViews();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r1 == null) goto L17;
     */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        LaunchActivity launchActivity;
        qn qnVar;
        org.telegram.ui.ActionBar.f4 f4Var;
        org.telegram.ui.ActionBar.o2 lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof sn) && (qnVar = ((sn) lastFragment).qa) != null && (f4Var = qnVar.f) != null) {
            if (f4Var != null) {
                TLRPC.ChatTheme chatTheme = f4Var.d;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = starGift instanceof TL_stars.TL_starGiftUnique ? (TL_stars.TL_starGiftUnique) starGift : null;
                }
            }
            this.A0 = lastFragment.getResourceProvider();
        }
        org.telegram.ui.Components.z7 z7Var = new org.telegram.ui.Components.z7(this, context, this.A0, 5);
        boolean z10 = true;
        z7Var.setForceSkipTouches(true);
        z7Var.setBackgroundColor(0);
        z7Var.A(this.S5 != null ? 553648127 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f8, this.A0), false);
        int i10 = org.telegram.ui.ActionBar.k6.v8;
        z7Var.B(org.telegram.ui.ActionBar.k6.w0(i10, this.A0), false);
        z7Var.B(org.telegram.ui.ActionBar.k6.w0(i10, this.A0), true);
        z7Var.setCastShadows(false);
        z7Var.setAddToContainer(false);
        z7Var.setClipContent(true);
        if (!this.J0 && (((h5Var = this.parentLayout) == null || !((ActionBarLayout) h5Var).b) && ((AndroidUtilities.isTablet() || this.inBubbleMode) && (!AndroidUtilities.isTablet() || this.inBubbleMode || (h5Var2 = this.parentLayout) == null || (launchActivity = LaunchActivity.J1) == null || h5Var2 != launchActivity.s0)))) {
            z10 = false;
        }
        z7Var.setOccupyStatusBar(z10);
        if (!this.J0) {
            z7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(false));
            z7Var.getBackButton().setTranslationX(AndroidUtilities.dp(2.0f));
            ImageView backButton = z7Var.getBackButton();
            backButton.setOnLongClickListener(new ci.l2(5, this, backButton));
            return z7Var;
        }
        z7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(false));
        z7Var.getBackButton().setTranslationX(AndroidUtilities.dp(2.0f));
        z7Var.e.setContentDescription(LocaleController.getString(R.string.QrCode));
        z7Var.e.setImageResource(R.drawable.outline_header_qr_24);
        z7Var.e.setColorFilter(org.telegram.ui.ActionBar.k6.w0(i10, this.A0), PorterDuff.Mode.SRC_IN);
        z7Var.e.setOnClickListener(new vx0(this, 6));
        return z7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0bc8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0bd2  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v194, types: [org.telegram.ui.cy0] */
    /* JADX WARN: Type inference failed for: r0v279, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v286 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        bh.b bVar;
        int i10;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        ?? r11;
        TLRPC.Document document;
        int i11;
        Object obj;
        bh.l lVar;
        float f7;
        boolean z11;
        int i12;
        float f10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.Components.oo p5;
        TLRPC.UserFull userFull2;
        TLRPC.ChatParticipants chatParticipants;
        sn snVar;
        qn qnVar;
        org.telegram.ui.ActionBar.k6.Y(context);
        ?? r02 = 0;
        org.telegram.ui.ActionBar.k6.J(context, false);
        org.telegram.ui.ActionBar.o2 lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof sn) && (qnVar = (snVar = (sn) lastFragment).qa) != null && qnVar.k() != null) {
            org.telegram.ui.ActionBar.f4 f4Var = snVar.qa.f;
            if (f4Var != null) {
                TLRPC.ChatTheme chatTheme = f4Var.d;
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
        this.R1 = V3();
        this.actionBar.setActionBarMenuOnItemClick(new nz0(this, context));
        rz0 rz0Var = this.O;
        if (rz0Var != null) {
            rz0Var.I0();
        }
        long j10 = this.j1;
        if (j10 == 0) {
            j10 = this.f1;
            if (j10 == 0) {
                j10 = -this.g1;
            }
        }
        this.fragmentView = new pz0(this, context);
        ih.k kVar = new ih.k(this.fragmentView);
        this.y6 = kVar;
        this.v6.f(kVar, (ViewGroup) this.fragmentView);
        ih.k kVar2 = this.y6;
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        bh.b bVar2 = this.x6;
        bVar2.f(kVar2, viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        int i18 = 26;
        if (this.t1) {
            this.u5 = new FrameLayout(context);
            this.v5 = new FrameLayout[2];
            this.y5 = new ei.d[2];
            int i19 = 0;
            for (int i20 = 2; i19 < i20; i20 = 2) {
                gh.c cVar = new gh.c();
                int i21 = org.telegram.ui.ActionBar.k6.d6;
                cVar.a(getThemedColor(i21));
                this.D6[i19] = cVar;
                bh.b bVar3 = new bh.b(cVar);
                ci.h4 h4Var = new ci.h4(context);
                dh.d b10 = bVar3.b(h4Var, new eh.b(i21, this.A0));
                b10.p(AndroidUtilities.dp(8.0f));
                b10.q(AndroidUtilities.dp(22.0f));
                h4Var.setBackground(b10);
                this.v5[i19] = new FrameLayout(context);
                this.y5[i19] = new ei.d(context, this.A0);
                this.y5[i19].setRoundRadius(AndroidUtilities.dp(19.0f));
                this.y5[i19].setUseWrapContent(true);
                this.y5[i19].setPadding(AndroidUtilities.dp(16.0f), r02, AndroidUtilities.dp(16.0f), r02);
                if (i19 == 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                    this.w5 = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.xq(R.drawable.filled_premium_camera), r02, 1, 33);
                    this.w5.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
                    this.x5 = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.xq(R.drawable.filled_add_album), r02, 1, 33);
                    this.x5.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAlbumBottomButtonAddStories));
                    this.y5[i19].h(this.w5, r02);
                } else {
                    this.y5[i19].h(LocaleController.getString(R.string.StorySave), r02);
                }
                h4Var.setOnClickListener(new ai.n1(this, i19, i18));
                w7.b6.b(h4Var, 0.02f, 1.2f);
                this.y5[i19].setStateListAnimator(null);
                h4Var.addView(this.y5[i19], w7.z5.e(-2, -1, 17));
                this.v5[i19].addView(h4Var, w7.z5.e(-2, 60, 1));
                this.u5.addView(this.v5[i19], w7.z5.e(-1, -1, 87));
                if (i19 == 1 || !getMessagesController().storiesEnabled()) {
                    this.v5[i19].setTranslationY(AndroidUtilities.dp(72.0f));
                }
                i19++;
                r02 = 0;
                i18 = 26;
            }
        }
        TLRPC.ChatFull chatFull2 = this.v2;
        ArrayList arrayList = (chatFull2 == null || (chatParticipants = chatFull2.participants) == null || chatParticipants.participants.size() <= 5) ? null : this.D2;
        if (this.y1) {
            bVar = bVar2;
            z10 = true;
            i10 = 6;
        } else if (!this.u1 || (((userFull = this.w2) == null || userFull.stargifts_count <= 0) && ((chatFull = this.v2) == null || chatFull.stargifts_count <= 0))) {
            z10 = true;
            if (this.s1) {
                bVar = bVar2;
                i10 = 10;
            } else {
                bVar = bVar2;
                i10 = arrayList != null ? 7 : -1;
            }
        } else {
            z10 = true;
            this.x1 = true;
            bVar = bVar2;
            i10 = 14;
        }
        org.telegram.ui.Components.pv0 pv0Var = this.R;
        TLRPC.UserFull userFull3 = this.w2;
        long j11 = j10;
        bh.b bVar4 = bVar;
        rz0 rz0Var2 = new rz0(this, context, j11, pv0Var, userFull3 != null ? userFull3.common_chats_count : 0, this.D2, this.v2, userFull3, i10, this.z1, this, this, this.A0, this.v6);
        this.O = rz0Var2;
        rz0Var2.setLayoutParams(new s4.o0(-1, -1));
        this.O.p0((ViewGroup) this.fragmentView);
        int i22 = 4;
        if (this.f1 == 0 || this.r0 == null || this.t1) {
            this.c0 = new org.telegram.ui.Components.vi0(context);
            org.telegram.ui.Components.di0 di0Var = new org.telegram.ui.Components.di0(context);
            this.d0 = di0Var;
            this.c0.setTrailingView(di0Var);
            this.d0.setOnClickListener(new vx0(this, i22));
            org.telegram.ui.Components.fi0 fi0Var = this.n0;
            if (fi0Var != null) {
                fi0Var.setMusicView(this.c0);
            }
            this.c0.setColor(this.S5);
            TLRPC.UserFull userFull4 = this.w2;
            if (userFull4 != null && (document = userFull4.saved_music) != null) {
                this.c0.setMusicDocument(document);
            }
            this.c0.setOnClickListener(new vx0(this, 5));
            this.a0 = new org.telegram.ui.Components.ci0(context, AndroidUtilities.dp(74.0f));
            K4();
            r11 = 0;
            k5(false);
            this.a0.setOnActionClickListener(new qx0(this, i22));
        } else {
            r11 = 0;
        }
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        m10.setTranslationX(-AndroidUtilities.dp(5.0f));
        if (this.f1 == getUserConfig().clientUserId && !this.t1 && ContactsController.getInstance(this.currentAccount).getPrivacyRules(7) == null) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
        int i23 = 15;
        if (this.r0 != null && !this.t1) {
            org.telegram.ui.ActionBar.u0 a2 = m10.a(32, R.drawable.outline_header_search);
            a2.F();
            a2.H = new ig.b2(this, i23);
            this.V0 = a2;
            a2.setContentDescription(LocaleController.getString(R.string.SearchInSettings));
            this.V0.setSearchFieldHint(LocaleController.getString(R.string.SearchInSettings));
            this.O.getSearchItem().setVisibility(8);
            if (this.O.getSearchOptionsItem() != null) {
                this.O.getSearchOptionsItem().setVisibility(8);
            }
            if (this.O.getSaveItem() != null) {
                this.O.getSaveItem().setVisibility(8);
            }
            if (this.o1) {
                this.V0.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.u0 a10 = m10.a(16, R.drawable.profile_video);
        this.S0 = a10;
        a10.setContentDescription(LocaleController.getString(R.string.VideoCall));
        if (this.g1 != 0) {
            this.R0 = m10.a(15, R.drawable.msg_voicechat2);
            if (ChatObject.isChannelOrGiga(this.F2)) {
                this.R0.setContentDescription(LocaleController.getString(R.string.VoipChannelVoiceChat));
            } else {
                this.R0.setContentDescription(LocaleController.getString(R.string.VoipGroupVoiceChat));
            }
        } else {
            org.telegram.ui.ActionBar.u0 a11 = m10.a(15, R.drawable.call);
            this.R0 = a11;
            a11.setContentDescription(LocaleController.getString(R.string.Call));
        }
        if (this.t1) {
            org.telegram.ui.ActionBar.u0 a12 = m10.a(41, R.drawable.group_edit_profile);
            this.T0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.Edit));
        } else {
            org.telegram.ui.ActionBar.u0 a13 = m10.a(12, R.drawable.group_edit_profile);
            this.T0 = a13;
            a13.setContentDescription(LocaleController.getString(R.string.Edit));
        }
        org.telegram.ui.ActionBar.u0 c10 = m10.c(10, R.drawable.ic_ab_other, this.A0);
        this.U0 = c10;
        c10.setSubMenuDelegate(new ky0(this));
        ImageView imageView = new ImageView(context);
        this.Z0 = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.v8, this.A0, PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.updateViewVisibilityAnimated(this.Z0, r11, 0.8f, r11);
        this.Z0.setImageResource(R.drawable.msg_mini_autodelete_timer);
        this.U0.addView(this.Z0, w7.z5.d(12, 12.0f, 19, 8.0f, 2.0f, 0.0f, 0.0f));
        this.U0.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.U0.E(bVar4, fh.c.g(this.resourceProvider));
        if (this.a == null || this.r0 == null) {
            i11 = -1;
            obj = null;
        } else {
            int L0 = this.c.L0();
            View m11 = this.c.m(L0);
            if (m11 != null) {
                m11.getTop();
                this.a.getPaddingTop();
            } else {
                L0 = -1;
            }
            i11 = L0;
            obj = this.v.getTag();
        }
        F3(r11);
        this.d = new f01(this, context);
        this.e = new q01(context, this);
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9();
        this.q0 = h9Var;
        h9Var.p = 2.3809524f;
        h9Var.t();
        this.fragmentView.setWillNotDraw(r11);
        pz0 pz0Var = (pz0) this.fragmentView;
        this.o5 = pz0Var;
        pz0Var.N = true;
        ly0 ly0Var = new ly0(this, context, this.A0);
        this.a = ly0Var;
        ly0Var.t1();
        this.a.setSectionsRounding(r11);
        ly0 ly0Var2 = this.a;
        ly0Var2.getClass();
        int i24 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.ActionBar.r6.i(i24, ly0Var2, this.A0);
        this.a.setVerticalScrollBarEnabled(r11);
        bh.l lVar2 = new bh.l(this.a, (ViewGroup) this.fragmentView, new dy0(this, r11));
        lVar2.h = true;
        ny0 ny0Var = new ny0(this);
        this.a.setItemAnimator(ny0Var);
        ny0Var.e = 320L;
        ny0Var.d = 320L;
        ny0Var.c = 320L;
        ny0Var.m = r11;
        ny0Var.S();
        ny0Var.o(org.telegram.ui.Components.bs.h);
        this.a.setClipToPadding(r11);
        this.a.setHideIfEmpty(r11);
        oy0 oy0Var = new oy0(this);
        this.c = oy0Var;
        oy0Var.j1(1);
        oy0 oy0Var2 = this.c;
        oy0Var2.r = r11;
        this.a.setLayoutManager(oy0Var2);
        this.a.setGlowColor(r11);
        this.a.setAdapter(this.d);
        frameLayout.addView(this.a, w7.z5.e(-1, -1, 51));
        this.a.setOnItemClickListener(new ai.f(this, context, j11, 7));
        this.a.setOnItemLongClickListener(new sy0(this, context));
        if (this.s1 || this.u1 || this.y1) {
            n5();
            C();
            this.Y5 = true;
            this.W5 = this.L4;
            this.X5 = r11;
        }
        if (this.V0 != null) {
            org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context);
            this.b = mm0Var;
            mm0Var.setVerticalScrollBarEnabled(r11);
            this.b.setLayoutManager(new s4.b0(1, r11));
            org.telegram.ui.ActionBar.r6.J(this.b, org.telegram.ui.ActionBar.k6.e8, this.A0);
            this.b.setAdapter(this.e);
            this.b.setItemAnimator(null);
            this.b.setVisibility(8);
            this.b.setLayoutAnimation(null);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.b, this.A0);
            frameLayout.addView(this.b, w7.z5.e(-1, -1, 51));
            this.b.setOnItemClickListener(new h(this, 29));
            this.b.setOnItemLongClickListener(new qx0(this, 5));
            this.b.setOnScrollListener(new ty0(this, r11));
            this.b.q1(1, true);
            org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context);
            this.P = wx0Var;
            wx0Var.setAnimateLayoutChange(true);
            this.P.e.setVisibility(8);
            this.P.setVisibility(8);
            frameLayout.addView(this.P);
            this.e.G();
        }
        int i25 = 11;
        if (this.F1 != 0) {
            lVar = lVar2;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.F1));
            if (this.H2 == null) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(chat);
                tL_channels_getParticipant.participant = getMessagesController().getInputPeer(this.f1);
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new ay0(this, 4));
            }
            ci.h4 h4Var2 = new ci.h4(context, 26);
            h4Var2.setWillNotDraw(r11);
            h4Var2.setPadding(r11, r11, r11, AndroidUtilities.navigationBarHeight);
            frameLayout.addView(h4Var2, w7.z5.a(-1.0f, (AndroidUtilities.navigationBarHeight / AndroidUtilities.density) + 51.0f, 83));
            h4Var2.setOnClickListener(new ae0(i25, this, chat));
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.p7, this.A0);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.BanFromTheGroupNoCaps));
            h4Var2.addView(textView, w7.z5.d(-2, -2.0f, 17, 0.0f, 1.0f, 0.0f, 0.0f));
            this.a.setPadding(r11, V3(), r11, AndroidUtilities.dp(48.0f));
            this.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f));
        } else {
            lVar = lVar2;
            this.a.setPadding(r11, V3(), r11, r11);
        }
        t01 t01Var = new t01(this, context);
        this.e1 = t01Var;
        t01Var.a(this.S5, r11);
        this.e1.setBackgroundColor(getThemedColor(i24));
        frameLayout.addView(this.e1);
        this.o5.T.add(this.e1);
        org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
        this.e0 = oVar;
        oVar.setPivotX(AndroidUtilities.dp(30.0f));
        this.e0.setPivotY(AndroidUtilities.dp(30.0f));
        this.Y = new l0(this, context, 20);
        this.Z = new ah.v(this, context, 21);
        ImageReceiver imageReceiver = new ImageReceiver(this.Z);
        this.t5 = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.Z, true, 1.0f, r11);
        frameLayout.addView(this.Z, w7.z5.d(-1, -1.0f, 8388611, 0.0f, 0.0f, 0.0f, 0.0f));
        this.Y.setPivotX(0.0f);
        this.Y.setPivotY(0.0f);
        org.telegram.ui.Components.si0 si0Var = new org.telegram.ui.Components.si0(context);
        this.u0 = si0Var;
        si0Var.addView(this.Y, w7.z5.e(100, 100, 51));
        this.Z.addView(this.u0, w7.z5.c(-1.0f, -1));
        vy0 vy0Var = new vy0(context);
        this.f0 = vy0Var;
        vy0Var.t(Q3());
        this.f0.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.f0.setRoundRadiusForExpand(e4());
        this.f0.setPivotX(0.0f);
        this.f0.setPivotY(0.0f);
        this.Y.addView(this.f0, w7.z5.c(-1.0f, -1));
        this.f0.setOnClickListener(new vx0(this, i25));
        this.f0.setHasStories(l4());
        this.f0.setOnLongClickListener(new t(this, 6));
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(this, context);
        this.h0 = y3Var;
        y3Var.setSize(AndroidUtilities.dp(26.0f));
        this.h0.setProgressColor(-1);
        this.h0.setNoProgress(r11);
        this.Y.addView(this.h0, w7.z5.c(-1.0f, -1));
        ImageView imageView2 = new ImageView(context);
        this.i0 = imageView2;
        imageView2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
        ImageView imageView3 = this.i0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        this.i0.setAlpha(0.0f);
        this.i0.setScaleX(0.85f);
        this.i0.setScaleY(0.85f);
        ImageView imageView4 = this.i0;
        org.telegram.ui.Components.w21 w21Var = new org.telegram.ui.Components.w21(context, null);
        this.m0 = w21Var;
        imageView4.setImageDrawable(w21Var);
        this.i0.setTranslationY(-1.0f);
        frameLayout.addView(this.i0, w7.z5.e(34, 34, 51));
        ImageView imageView5 = new ImageView(context);
        this.j0 = imageView5;
        imageView5.setScaleType(scaleType);
        this.j0.setAlpha(0.0f);
        this.j0.setImageDrawable(new hi.a());
        frameLayout.addView(this.j0, w7.z5.e(16, 16, 51));
        ImageView imageView6 = new ImageView(context);
        this.k0 = imageView6;
        imageView6.setImageResource(R.drawable.star_small_outline);
        org.telegram.ui.ActionBar.r6.t(this.k0, org.telegram.ui.ActionBar.k6.s8, this.A0, PorterDuff.Mode.SRC_IN);
        this.k0.setAlpha(0.0f);
        this.k0.setScaleY(0.0f);
        this.k0.setScaleX(0.0f);
        frameLayout.addView(this.k0, w7.z5.e(20, 20, 51));
        ImageView imageView7 = new ImageView(context);
        this.l0 = imageView7;
        imageView7.setImageResource(R.drawable.star_small_inner);
        this.l0.setAlpha(0.0f);
        this.l0.setScaleY(0.0f);
        this.l0.setScaleX(0.0f);
        frameLayout.addView(this.l0, w7.z5.e(20, 20, 51));
        o5();
        S4(r11, r11);
        wy0 wy0Var = this.o0;
        if (wy0Var != null) {
            wy0Var.K();
        }
        org.telegram.ui.Components.fi0 fi0Var2 = this.n0;
        if (fi0Var2 != null) {
            fi0Var2.e();
        }
        this.N = new g01(this, context);
        org.telegram.ui.Components.fi0 fi0Var3 = new org.telegram.ui.Components.fi0(context);
        this.n0 = fi0Var3;
        fi0Var3.setSize(Q3());
        long j12 = this.f1;
        if (j12 == 0) {
            j12 = -this.g1;
        }
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        ly0 ly0Var3 = this.a;
        vy0 vy0Var2 = this.f0;
        getClassGuid();
        int i26 = i11;
        int i27 = 1;
        this.o0 = new wy0(this, context, j12, kVar3, ly0Var3, vy0Var2, this.N, this.n0);
        if (this.f1 != getUserConfig().clientUserId && (userFull2 = this.w2) != null) {
            this.p5 = userFull2.profile_photo == null ? 0.0f : 1.0f;
        }
        if (!this.r1) {
            this.o0.setChatInfo(this.v2);
        }
        this.Z.addView(this.o0);
        this.Z.addView(this.n0, w7.z5.c(138.0f, -1));
        this.Z.addView(this.N);
        org.telegram.ui.Components.ci0 ci0Var = this.a0;
        if (ci0Var != null) {
            this.n0.setActionsView(ci0Var);
            this.Z.addView(this.a0, w7.z5.c(-1.0f, -1));
        }
        org.telegram.ui.Components.vi0 vi0Var = this.c0;
        if (vi0Var != null) {
            this.n0.setMusicView(vi0Var);
            this.Z.addView(this.c0, w7.z5.c(-1.0f, -1));
            this.Z.addView(this.d0, w7.z5.c(-1.0f, -1));
        }
        this.f0.setAvatarsViewPager(this.o0);
        i01 i01Var = new i01(this, context);
        this.p0 = i01Var;
        this.Z.addView(i01Var, w7.z5.c(-1.0f, -1));
        frameLayout.addView(this.actionBar);
        float f11 = 54 + ((!this.M0 || this.f1 == 0) ? 0 : 54);
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var == null || !(h5Var.getLastFragment() instanceof sn) || (p5 = ((sn) this.parentLayout.getLastFragment()).p()) == null) {
            f7 = f11;
            z11 = false;
        } else {
            boolean z12 = p5.getTitleTextView().getPaddingRight() != 0;
            if (p5.getLayoutParams() != null && p5.getTitleTextView() != null) {
                f11 = ((p5.getWidth() - p5.getTitleTextView().getRight()) + ((ViewGroup.MarginLayoutParams) p5.getLayoutParams()).rightMargin) / AndroidUtilities.density;
            }
            f7 = f11;
            z11 = z12;
        }
        int i28 = 0;
        while (true) {
            org.telegram.ui.ActionBar.n5[] n5VarArr = this.f;
            i12 = 3;
            if (i28 >= n5VarArr.length) {
                break;
            }
            if (this.K1 != 0 || i28 != 0) {
                el elVar = new el(this, context, i12);
                n5VarArr[i28] = elVar;
                if (i28 == 1) {
                    elVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.vh));
                } else {
                    elVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.A8));
                }
                n5VarArr[i28].setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(i28 == 0 ? 12.0f : 4.0f));
                n5VarArr[i28].setTextSizePx(AndroidUtilities.dp(17.5f));
                n5VarArr[i28].setGravity(3);
                n5VarArr[i28].setTypeface(AndroidUtilities.bold());
                n5VarArr[i28].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
                n5VarArr[i28].setPivotX(0.0f);
                n5VarArr[i28].setPivotY(0.0f);
                n5VarArr[i28].setAlpha(i28 == 0 ? 0.0f : 1.0f);
                if (i28 == 1) {
                    n5VarArr[i28].setScrollNonFitText(true);
                    n5VarArr[i28].setImportantForAccessibility(2);
                }
                n5VarArr[i28].setFocusable(i28 == 0);
                n5VarArr[i28].setEllipsizeByGradient(true);
                n5VarArr[i28].setRightDrawableOutside(i28 == 0);
                this.Z.addView(n5VarArr[i28], w7.z5.d(-2, -2.0f, 51, 109.0f, -6.0f, i28 == 0 ? f7 - (z11 ? 10 : 0) : 0.0f, 0.0f));
            }
            i28++;
        }
        int i29 = 0;
        while (true) {
            org.telegram.ui.ActionBar.n5[] n5VarArr2 = this.r;
            if (i29 >= n5VarArr2.length) {
                break;
            }
            if (i29 == 1) {
                n5VarArr2[i29] = new xy0(this, context);
            } else {
                n5VarArr2[i29] = new org.telegram.ui.Components.t90(context);
            }
            n5VarArr2[i29].setEllipsizeByGradient(true);
            n5VarArr2[i29].setTextColor(x3(getThemedColor(org.telegram.ui.ActionBar.k6.B8), null));
            n5VarArr2[i29].setTextSizePx(AndroidUtilities.dp(13.5f));
            n5VarArr2[i29].setGravity(i12);
            n5VarArr2[i29].setAlpha(i29 == 0 ? 0.0f : 1.0f);
            n5VarArr2[i29].setPivotX(AndroidUtilities.dp(8.0f));
            n5VarArr2[i29].setPivotY(AndroidUtilities.dp(8.0f));
            if (i29 == 1 || i29 == 2 || i29 == i12) {
                n5VarArr2[i29].setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            }
            if (i29 > 0) {
                n5VarArr2[i29].setImportantForAccessibility(2);
            }
            n5VarArr2[i29].setFocusable(i29 == 0);
            ah.v vVar = this.Z;
            org.telegram.ui.ActionBar.n5 n5Var = n5VarArr2[i29];
            if (i29 == 1 || i29 == 2) {
                i14 = 3;
            } else {
                i14 = 3;
                if (i29 != 3) {
                    i15 = 0;
                    float f12 = 109 - i15;
                    float f13 = (i29 != 1 || i29 == 2 || i29 == i14) ? -2 : 0;
                    float f14 = i29 != 0 ? f7 - (z11 ? 10 : 0) : 8.0f;
                    if (i29 != 1 || i29 == 2) {
                        i16 = 3;
                    } else {
                        i16 = 3;
                        if (i29 != 3) {
                            i17 = 0;
                            vVar.addView(n5Var, w7.z5.d(-2, -2.0f, 51, f12, f13, f14 - i17, 0.0f));
                            i29++;
                            i12 = i16;
                        }
                    }
                    i17 = 4;
                    vVar.addView(n5Var, w7.z5.d(-2, -2.0f, 51, f12, f13, f14 - i17, 0.0f));
                    i29++;
                    i12 = i16;
                }
            }
            i15 = 4;
            float f122 = 109 - i15;
            float f132 = (i29 != 1 || i29 == 2 || i29 == i14) ? -2 : 0;
            if (i29 != 0) {
            }
            if (i29 != 1) {
            }
            i16 = 3;
            i17 = 4;
            vVar.addView(n5Var, w7.z5.d(-2, -2.0f, 51, f122, f132, f14 - i17, 0.0f));
            i29++;
            i12 = i16;
        }
        D3();
        this.Z.addView(this.e0);
        org.telegram.ui.Components.hx0 hx0Var = new org.telegram.ui.Components.hx0(context);
        this.T = hx0Var;
        hx0Var.setLayoutParams(w7.z5.d(32, 32.0f, 3, 103.0f, -2.0f, 0.0f, 0.0f));
        this.T.setResourcesProvider(this.A0);
        E3();
        this.T.setDelegate(new qx0(this, i27));
        this.T.setOnClickListener(new vx0(this, 0));
        TLRPC.UserFull userFull5 = this.w2;
        if (userFull5 != null) {
            this.T.set(userFull5.stars_rating);
        }
        this.Z.addView(this.T);
        org.telegram.ui.Components.fp0 fp0Var = new org.telegram.ui.Components.fp0(this, context, context, i27);
        this.s = fp0Var;
        fp0Var.setAlpha(0.0f);
        this.Z.addView(this.s, w7.z5.d(-2, -2.0f, 51, 109.33f, -2.0f, 8.0f, 0.0f));
        this.v0 = new yy0(this, context, this.currentAccount, a(), this.r1, this.Y, this.f0, this.A0, context);
        p5(false);
        TLRPC.UserFull userFull6 = this.w2;
        if (userFull6 != null) {
            this.v0.setStories(userFull6.stories);
        } else {
            TLRPC.ChatFull chatFull3 = this.v2;
            if (chatFull3 != null) {
                this.v0.setStories(chatFull3.stories);
            }
        }
        vy0 vy0Var3 = this.f0;
        if (vy0Var3 != null) {
            vy0Var3.setHasStories(l4());
        }
        this.Z.addView(this.v0, w7.z5.c(-1.0f, -1));
        ai.j1 j1Var = new ai.j1(context, this.currentAccount, a(), this.Y);
        this.w0 = j1Var;
        this.Z.addView(j1Var, 0, w7.z5.c(-1.0f, -1));
        m5(true);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
        this.v = bk0Var;
        if (this.a0 != null) {
            bk0Var.setVisibility(8);
        }
        u5();
        if (this.f1 == 0) {
            this.v.setImageResource(R.drawable.profile_discuss);
            this.v.setContentDescription(LocaleController.getString(R.string.ViewDiscussion));
        } else if (this.r0 != null) {
            this.V = new org.telegram.ui.Components.yj0(R.raw.camera_outline, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            this.W = new org.telegram.ui.Components.yj0(R.raw.camera_outline, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
            org.telegram.ui.Components.ci0 ci0Var2 = this.a0;
            if (ci0Var2 != null) {
                ci0Var2.e();
                this.a0.a();
                this.a0.b();
                this.a0.c();
                org.telegram.ui.Components.ci0 ci0Var3 = this.a0;
                if (ci0Var3.I) {
                    ci0Var3.I = false;
                    ci0Var3.d();
                }
            } else {
                this.v.setAnimation(this.V);
                this.v.setContentDescription(LocaleController.getString(R.string.AccDescrChangeProfilePicture));
                this.v.setPadding(AndroidUtilities.dp(2.0f), 0, 0, AndroidUtilities.dp(2.0f));
            }
        } else {
            org.telegram.ui.Components.ci0 ci0Var4 = this.a0;
            if (ci0Var4 != null) {
                ci0Var4.o(0, true);
            }
            this.v.setImageResource(R.drawable.profile_newmsg);
            this.v.setContentDescription(LocaleController.getString(R.string.AccDescrOpenChat));
        }
        org.telegram.ui.Components.bk0 bk0Var2 = this.v;
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        bk0Var2.setScaleType(scaleType2);
        frameLayout.addView(this.v, w7.z5.d(60, 60.0f, 53, 0.0f, 0.0f, 16.0f, 0.0f));
        this.v.setOnClickListener(new vx0(this, i27));
        m4(false);
        if (i26 == -1 || obj == null) {
            f10 = 0.0f;
        } else {
            this.v.setTag(0);
            this.v.setScaleX(0.2f);
            this.v.setScaleY(0.2f);
            f10 = 0.0f;
            this.v.setAlpha(0.0f);
        }
        this.a.setOnScrollListener(new ty0(this, i27));
        UndoView undoView = new UndoView(context, null, false, this.A0);
        this.M = undoView;
        frameLayout.addView(undoView, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.k2 = ofFloat;
        ofFloat.addUpdateListener(new wx0(this, i27));
        this.k2.setInterpolator(org.telegram.ui.Components.bs.h);
        this.k2.addListener(new zy0(this));
        n5();
        R();
        org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(getParentActivity(), 9);
        this.X = r40Var;
        r40Var.setAlpha(f10);
        frameLayout.addView(this.X, w7.z5.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
        this.O.setForwardRestrictedHint(this.X);
        az0 az0Var = new az0(this, (ViewGroup) getParentActivity().getWindow().getDecorView(), frameLayout);
        this.X4 = az0Var;
        az0Var.E = new ky0(this);
        this.o0.setPinchToZoomHelper(az0Var);
        this.y0.setAlpha(0);
        this.z0.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.i6));
        this.o5.T.add(this.O);
        r5();
        e50 e50Var = new e50(this, context, 6);
        this.U = e50Var;
        int i30 = org.telegram.ui.ActionBar.k6.d6;
        e50Var.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i30), 100)));
        this.U.setFocusable(false);
        this.U.setImportantForAccessibility(2);
        this.U.setOnClickListener(new vx0(this, 2));
        this.U.setVisibility(8);
        this.U.setFitsSystemWindows(true);
        this.o5.addView(this.U, w7.z5.c(-1.0f, -1));
        H3();
        if (this.t1) {
            i13 = 87;
            this.o5.addView(this.u5, w7.z5.e(-1, 60, 87));
        } else {
            i13 = 87;
        }
        org.telegram.ui.Components.ci0 ci0Var5 = this.a0;
        if (ci0Var5 != null && ci0Var5.l()) {
            ImageView imageView8 = new ImageView(context);
            this.P0 = imageView8;
            imageView8.setScaleType(scaleType2);
            this.P0.setImageResource(R.drawable.call);
            this.P0.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            layoutParams.topMargin = this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.setMarginEnd(layoutParams.width);
            layoutParams.gravity = 8388613;
            frameLayout.addView(this.P0, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.A5 = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i30, frameLayout2, this.A0);
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, this.A0);
        this.A5.addView(view, w7.z5.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        ei.d dVar = new ei.d(context, this.A0);
        this.B5 = dVar;
        dVar.h(LocaleController.getString(R.string.Save), false);
        this.A5.addView(this.B5, w7.z5.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        this.B5.setOnClickListener(new vx0(this, 3));
        this.A5.setVisibility(8);
        this.A5.setTranslationY(AndroidUtilities.dp(69.0f));
        this.o5.addView(this.A5, w7.z5.e(-1, -2, i13));
        final bh.l lVar3 = lVar;
        this.z6 = new ch.a() { // from class: org.telegram.ui.cy0
            @Override // ch.a
            public final void e(bh.a aVar, RectF rectF) {
                aVar.a = true;
            }

            @Override // ch.a
            public final void f(Canvas canvas, RectF rectF) {
                lVar3.f(canvas, rectF);
                org.telegram.ui.Components.kh khVar = ProfileActivity.this.O.d2;
                if (khVar != null) {
                    khVar.f(canvas, rectF);
                }
            }
        };
        r0.i0.l(this.fragmentView, new qx0(this, 3));
        return this.fragmentView;
    }

    public final r01 d4() {
        if (this.h6 == null) {
            r01 r01Var = new r01(LocaleController.getString(R.string.StatusHiddenShow));
            this.h6 = r01Var;
            r01Var.setAlpha((int) (Math.min(1.0f, this.R1 / V3()) * 255.0f));
            this.h6.a(i0.a.f(this.l2, org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.b(0.18f, -0.1f, this.d1)), 603979775));
        }
        return this.h6;
    }

    public final void d5() {
        org.telegram.ui.Cells.o oVar = this.e0;
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.f;
        oVar.setScaleX(n5VarArr[1].getScaleX());
        this.e0.setScaleY(n5VarArr[1].getScaleY());
        this.e0.b((n5VarArr[1].getScaleX() * n5VarArr[1].getRightDrawableX()) + n5VarArr[1].getX(), (n5VarArr[1].getHeight() - (n5VarArr[1].getScaleY() * (n5VarArr[1].getHeight() - n5VarArr[1].getRightDrawableY()))) + n5VarArr[1].getY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        f01 f01Var;
        org.telegram.ui.ActionBar.h5 h5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.Chat chat;
        ly0 ly0Var;
        ly0 ly0Var2;
        org.telegram.ui.Components.wl0 wl0Var;
        if (i10 == NotificationCenter.uploadStoryEnd || i10 == NotificationCenter.chatWasBoostedByUser) {
            if (ChatObject.isBoostSupported(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.g1)))) {
                getMessagesController().getStoriesController().k(a(), new ci.e(19), false, this.A0);
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
            if (this.f1 != 0) {
                if (objArr2 != false) {
                    m5(true);
                }
                if ((intValue & MessagesController.UPDATE_MASK_PHONE) == 0 || (ly0Var2 = this.a) == null || (wl0Var = (org.telegram.ui.Components.wl0) ly0Var2.L(this.H3, false)) == null) {
                    return;
                }
                this.d.v(wl0Var, this.H3);
                return;
            }
            if (this.g1 != 0) {
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0) {
                        i5(true, false);
                    } else {
                        l5(true);
                    }
                    m5(true);
                }
                if (!objArr2 == true || (ly0Var = this.a) == null) {
                    return;
                }
                int childCount = ly0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = this.a.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.wa) {
                        ((org.telegram.ui.Cells.wa) childAt).i(intValue);
                    }
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
            Long l4 = (Long) objArr[0];
            if (this.v2 == null || (chat = this.F2) == null || chat.id != l4.longValue()) {
                return;
            }
            this.v2.online_count = ((Integer) objArr[1]).intValue();
            l5(true);
            m5(false);
            return;
        }
        if (i10 == NotificationCenter.contactsDidLoad || i10 == NotificationCenter.channelRightsUpdated) {
            F3(true);
            return;
        }
        if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.k1) {
                AndroidUtilities.runOnUIThread(new mv0(7, this, objArr));
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.encryptedChatUpdated) {
            TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
            TLRPC.EncryptedChat encryptedChat2 = this.E2;
            if (encryptedChat2 == null || encryptedChat.id != encryptedChat2.id) {
                return;
            }
            this.E2 = encryptedChat;
            i5(false, false);
            FlagSecureReason flagSecureReason = this.Y1;
            if (flagSecureReason != null) {
                flagSecureReason.invalidate();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.blockedUsersDidLoad) {
            boolean z11 = this.l1;
            boolean z12 = getMessagesController().blockePeers.indexOfKey(this.f1) >= 0;
            this.l1 = z12;
            if (z11 != z12) {
                F3(true);
                i5(false, false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.groupCallUpdated) {
            Long l10 = (Long) objArr[0];
            if (this.F2 != null) {
                long longValue = l10.longValue();
                TLRPC.Chat chat2 = this.F2;
                if (longValue == chat2.id && ChatObject.canManageCalls(chat2)) {
                    TLRPC.ChatFull chatFull4 = MessagesController.getInstance(this.currentAccount).getChatFull(l10.longValue());
                    if (chatFull4 != null) {
                        TLRPC.ChatFull chatFull5 = this.v2;
                        if (chatFull5 != null) {
                            chatFull4.participants = chatFull5.participants;
                        }
                        this.v2 = chatFull4;
                    }
                    rz0 rz0Var = this.O;
                    if (rz0Var != null) {
                        rz0Var.setChatInfo(this.v2);
                    }
                    TLRPC.ChatFull chatFull6 = this.v2;
                    if (chatFull6 != null && (((inputGroupCall = chatFull6.call) == null && !this.q1) || (inputGroupCall != null && this.q1))) {
                        F3(false);
                    }
                    yy0 yy0Var = this.v0;
                    if (yy0Var != null && (chatFull3 = this.v2) != null) {
                        yy0Var.setStories(chatFull3.stories);
                    }
                    ai.j1 j1Var = this.w0;
                    if (j1Var != null) {
                        j1Var.a();
                    }
                    vy0 vy0Var = this.f0;
                    if (vy0Var != null) {
                        vy0Var.setHasStories(l4());
                    }
                    if (l10.longValue() != 0) {
                        boolean z13 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.v2) == null || !chatFull2.stargifts_available) ? false : true;
                        this.U0.I(38, z13);
                        org.telegram.ui.Components.ci0 ci0Var = this.a0;
                        if (ci0Var != null) {
                            ci0Var.o(3, z13);
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
            if (this.f1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f1))) != null && chatFull7.id == user.linked_community_id) {
                i5(true, false);
            }
            TLRPC.Chat chat3 = this.F2;
            if (chat3 != null && chatFull7.id == chat3.linked_community_id) {
                i5(true, false);
            }
            if (chatFull7.id == this.g1) {
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                TLRPC.ChatFull chatFull8 = this.v2;
                if ((chatFull8 instanceof TLRPC.TL_channelFull) && chatFull7.participants == null) {
                    chatFull7.participants = chatFull8.participants;
                }
                Object[] objArr3 = chatFull8 == null && (chatFull7 instanceof TLRPC.TL_channelFull);
                this.v2 = chatFull7;
                if (this.n1 == 0) {
                    long j10 = chatFull7.migrated_from_chat_id;
                    if (j10 != 0) {
                        this.n1 = -j10;
                        getMediaDataController().getMediaCount(this.n1, this.h1, 0, this.classGuid, true);
                    }
                }
                N3();
                wy0 wy0Var = this.o0;
                if (wy0Var != null && !this.r1) {
                    wy0Var.setChatInfo(this.v2);
                }
                i5(true, false);
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.g1));
                if (chat4 != null) {
                    this.F2 = chat4;
                    F3(true);
                }
                FlagSecureReason flagSecureReason2 = this.Y1;
                if (flagSecureReason2 != null) {
                    flagSecureReason2.invalidate();
                }
                if (this.F2.megagroup && (objArr3 != false || !booleanValue)) {
                    T3(true);
                }
                X4();
                r5();
                yy0 yy0Var2 = this.v0;
                if (yy0Var2 != null && (chatFull = this.v2) != null) {
                    yy0Var2.setStories(chatFull.stories);
                }
                ai.j1 j1Var2 = this.w0;
                if (j1Var2 != null) {
                    j1Var2.a();
                }
                vy0 vy0Var2 = this.f0;
                if (vy0Var2 != null) {
                    vy0Var2.setHasStories(l4());
                }
                rz0 rz0Var2 = this.O;
                if (rz0Var2 != null) {
                    rz0Var2.setChatInfo(this.v2);
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
            if (longValue2 == a() && (h5Var = this.parentLayout) != null && h5Var.getFragmentStack().contains(this)) {
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
            if (botInfo.user_id == this.f1) {
                this.G2 = botInfo;
                i5(false, false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.userInfoDidLoad) {
            if (((Long) objArr[0]).longValue() == this.f1) {
                TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                this.w2 = userFull;
                org.telegram.ui.Components.hx0 hx0Var = this.T;
                if (hx0Var != null) {
                    hx0Var.set(userFull.stars_rating);
                }
                yy0 yy0Var3 = this.v0;
                if (yy0Var3 != null) {
                    yy0Var3.setStories(this.w2.stories);
                }
                ai.j1 j1Var3 = this.w0;
                if (j1Var3 != null) {
                    j1Var3.a();
                }
                vy0 vy0Var3 = this.f0;
                if (vy0Var3 != null) {
                    vy0Var3.setHasStories(l4());
                }
                rz0 rz0Var3 = this.O;
                if (rz0Var3 != null) {
                    rz0Var3.setUserInfo(this.w2);
                }
                if (this.r0 != null) {
                    if (this.d != null && !TextUtils.equals(this.w2.about, this.A2)) {
                        this.d.m(this.X2);
                    }
                    if (this.t1) {
                        i5(false, false);
                    }
                } else {
                    if (this.H1 || this.L0) {
                        this.J1 = true;
                    } else {
                        F3(true);
                    }
                    i5(false, false);
                    rz0 rz0Var4 = this.O;
                    if (rz0Var4 != null) {
                        rz0Var4.setCommonGroupsCount(this.w2.common_chats_count);
                        R();
                        org.telegram.ui.Components.pv0 pv0Var = this.R;
                        if (pv0Var == null || pv0Var.y) {
                            resumeDelayedFragmentAnimation();
                            m4(true);
                        }
                    }
                }
                X4();
                r5();
                if (this.x2 == null && !j4()) {
                    org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(this.currentAccount);
                    this.x2 = g6Var;
                    ib0 ib0Var = new ib0(this, 15);
                    if (g6Var.c) {
                        ib0Var.run();
                    } else {
                        g6Var.h.add(ib0Var);
                    }
                    this.x2.d(this.w2);
                }
                if (!j4()) {
                    u01 u01Var = this.z2;
                    u01 c10 = u01.c(this.currentAccount, this.w2, u01Var);
                    this.z2 = c10;
                    this.y2 = c10 != u01Var;
                    if (c10 != null) {
                        ib0 ib0Var2 = new ib0(this, 16);
                        if (c10.b) {
                            ib0Var2.run();
                        } else {
                            c10.h.add(ib0Var2);
                        }
                    }
                }
                if (this.U0 != null) {
                    if (g4()) {
                        this.U0.K(44);
                    } else {
                        this.U0.r(44);
                    }
                    TLRPC.UserFull userFull2 = this.w2;
                    if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                        z10 = true;
                    }
                    this.U0.I(46, z10);
                    this.U0.I(47, !z10);
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
                    if (this.E2 != null) {
                        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (f01Var = this.d) != null) {
                            f01Var.l();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            ly0 ly0Var3 = this.a;
            if (ly0Var3 != null) {
                ly0Var3.g1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.reloadInterface) {
            i5(false, false);
            return;
        }
        if (i10 == NotificationCenter.newSuggestionsAvailable) {
            int i15 = this.d3;
            int i16 = this.b3;
            int i17 = this.Z2;
            n5();
            f01 f01Var2 = this.d;
            if (f01Var2 != null) {
                if (i15 == this.d3 && i16 == this.b3 && i17 == this.Z2) {
                    return;
                }
                f01Var2.l();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.topicsDidLoaded) {
            if (this.r1) {
                m5(false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateSearchSettings) {
            q01 q01Var = this.e;
            if (q01Var != null) {
                q01Var.c = q01.H(this);
                this.e.v.clear();
                this.e.J();
                q01 q01Var2 = this.e;
                q01Var2.I(q01Var2.y);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.reloadDialogPhotos) {
            m5(false);
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated || i10 == NotificationCenter.storiesReadUpdated) {
            vy0 vy0Var4 = this.f0;
            if (vy0Var4 != null) {
                vy0Var4.setHasStories(l4());
                this.f0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(e4(), 0.0f, this.l2));
            }
            yy0 yy0Var4 = this.v0;
            if (yy0Var4 != null) {
                TLRPC.UserFull userFull3 = this.w2;
                if (userFull3 != null) {
                    yy0Var4.setStories(userFull3.stories);
                    return;
                }
                TLRPC.ChatFull chatFull9 = this.v2;
                if (chatFull9 != null) {
                    yy0Var4.setStories(chatFull9.stories);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            org.telegram.ui.ActionBar.u0 u0Var = this.U0;
            if (u0Var != null) {
                u0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.f1)));
            }
            a5();
            return;
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            a5();
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            i5(false, false);
            return;
        }
        if (i10 == NotificationCenter.botStarsUpdated) {
            i5(false, false);
            return;
        }
        if (i10 == NotificationCenter.botStarsTransactionsLoaded) {
            i5(false, false);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted) {
            if (a() == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.h5 h5Var2 = this.parentLayout;
                if (h5Var2 == null || h5Var2.getLastFragment() != this) {
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
            if (this.L4 >= 0 || longValue3 != a()) {
                return;
            }
            n5();
            R();
            f01 f01Var3 = this.d;
            if (f01Var3 != null) {
                f01Var3.l();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() != a() || j4()) {
                return;
            }
            if (this.L4 >= 0) {
                rz0 rz0Var5 = this.O;
                if (rz0Var5 != null) {
                    rz0Var5.A1(true);
                    return;
                }
                return;
            }
            n5();
            R();
            f01 f01Var4 = this.d;
            if (f01Var4 != null) {
                f01Var4.l();
            }
            AndroidUtilities.runOnUIThread(new ib0(this, 17));
            return;
        }
        if (i10 == NotificationCenter.profileMusicUpdated) {
            if (((Long) objArr[0]).longValue() != a() || this.f1 <= 0) {
                return;
            }
            TLRPC.UserFull userFull4 = getMessagesController().getUserFull(this.f1);
            if (userFull4 != null) {
                this.w2 = userFull4;
            }
            n5();
            R();
            ly0 ly0Var4 = this.a;
            if (ly0Var4 != null && ly0Var4.b0()) {
                this.a.post(new ib0(this, 19));
                return;
            }
            f01 f01Var5 = this.d;
            if (f01Var5 != null) {
                f01Var5.l();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.updatedChatRanks) {
            return;
        }
        long longValue4 = ((Long) objArr[0]).longValue();
        long longValue5 = ((Long) objArr[1]).longValue();
        TLRPC.Chat chat5 = this.F2;
        if (chat5 == null || chat5.id != longValue4) {
            return;
        }
        String str = (String) objArr[2];
        a0.h hVar = this.D1;
        if (hVar != null && (chatParticipant = (TLRPC.ChatParticipant) hVar.f(longValue5)) != null) {
            chatParticipant.setRank(longValue5, str);
        }
        TLRPC.ChannelParticipant channelParticipant = this.H2;
        if (channelParticipant != null && channelParticipant.user_id == longValue5) {
            channelParticipant.rank = str;
        }
        while (true) {
            ArrayList arrayList2 = this.S4;
            if (i12 >= arrayList2.size()) {
                AndroidUtilities.updateVisibleRows(this.a);
                return;
            } else {
                ((TLRPC.ChatParticipant) arrayList2.get(i12)).setRank(longValue5, str);
                i12++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.e50 e50Var = this.r0;
        if (e50Var == null || !e50Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.e50 e50Var = this.r0;
        return (e50Var == null || dialog != e50Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final int e4() {
        if (this.r1) {
            return 0;
        }
        if (this.g1 == 0 || !ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.g1)))) {
            return AndroidUtilities.dp(50.0f);
        }
        return AndroidUtilities.dp(l4() ? 24.0f : 38.0f);
    }

    public final void e5() {
        if (this.r1 || !ChatObject.isForum(this.F2)) {
            return;
        }
        getNotificationsController().loadTopicsNotificationsExceptions(-this.g1, new Consumer() { // from class: org.telegram.ui.iy0
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void x(Object obj) {
                ProfileActivity profileActivity = ProfileActivity.this;
                HashSet hashSet = profileActivity.j5;
                ArrayList arrayList = new ArrayList((HashSet) obj);
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    if (profileActivity.getMessagesController().getTopicsController().findTopic(profileActivity.g1, ((Integer) arrayList.get(i10)).intValue()) == null) {
                        arrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                hashSet.clear();
                hashSet.addAll(arrayList);
                profileActivity.k5(true);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$-CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // org.telegram.ui.Components.ju0
    public final org.telegram.ui.Components.mm0 f() {
        return this.a;
    }

    public final org.telegram.ui.Components.as f4(int i10) {
        MessagesController.PeerColor peerColor;
        org.telegram.ui.Components.as[] asVarArr = this.J;
        if (asVarArr[i10] == null) {
            Drawable mutate = org.telegram.ui.ActionBar.k6.Q1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr = this.y;
            drawableArr[i10] = mutate;
            Drawable mutate2 = org.telegram.ui.ActionBar.k6.R1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr2 = this.I;
            drawableArr2[i10] = mutate2;
            if (i10 == 1 && (peerColor = this.S5) != null) {
                int b10 = org.telegram.ui.ActionBar.k6.b(0.1f, org.telegram.ui.ActionBar.k6.I.q() ? -0.1f : -0.08f, peerColor.hasColor6(org.telegram.ui.ActionBar.k6.I.q()) ? this.S5.getColor5() : this.S5.getColor3());
                Drawable drawable = drawableArr[1];
                int offsetColor = AndroidUtilities.getOffsetColor(b10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oi, this.A0), this.G5, 1.0f);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(offsetColor, mode);
                drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.A0), this.G5, 1.0f), mode);
            }
            asVarArr[i10] = new org.telegram.ui.Components.as(new org.telegram.ui.Components.yq(drawableArr[i10], drawableArr2[i10]), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return asVarArr[i10];
    }

    public final void f5(float f7) {
        g01 g01Var;
        ValueAnimator valueAnimator;
        if (this.q2 || ((g01Var = this.N) != null && (valueAnimator = g01Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.a.getMeasuredWidth();
            layoutParams.height = (int) (this.R1 + f7);
            this.N.requestLayout();
        }
        t01 t01Var = this.e1;
        if (t01Var != null) {
            t01Var.E.setTranslate(0.0f, this.b2 - t01Var.x);
            t01 t01Var2 = this.e1;
            RadialGradient radialGradient = t01Var2.y;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(t01Var2.E);
            }
            this.e1.invalidate();
        }
        d5();
        W4();
        j5();
    }

    @Override // org.telegram.ui.Components.ju0
    public final TLRPC.Chat g() {
        return this.F2;
    }

    public final boolean g4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i10 = 0;
        if (!this.s2 || (userFull = this.w2) == null || (botInfo = userFull.bot_info) == null) {
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

    public final void g5() {
        TLRPC.User user;
        if (!this.t1 || this.Y0 == null || this.X0 == null || (user = getMessagesController().getUser(Long.valueOf(this.f1))) == null) {
            return;
        }
        boolean z10 = UserObject.getPublicUsername(user) != null;
        this.Y0.setIcon(z10 ? R.drawable.menu_username_change : R.drawable.menu_username_set);
        this.Y0.setText(LocaleController.getString(z10 ? R.string.ProfileUsernameEdit : R.string.ProfileUsernameSet));
        this.X0.setVisibility(UserObject.getPublicUsername(user) == null ? 8 : 0);
    }

    public float getAvatarAnimationProgress() {
        return this.T1;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ mu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.A0;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        if (this.A0 != null) {
            return null;
        }
        i6 i6Var = new i6(19, this);
        ArrayList arrayList = new ArrayList();
        rz0 rz0Var = this.O;
        if (rz0Var != null) {
            arrayList.addAll(rz0Var.getThemeDescriptions());
        }
        org.telegram.ui.Components.fp0 fp0Var = this.s;
        if (fp0Var != null) {
            TextView textView = fp0Var.getTextView();
            int i10 = org.telegram.ui.ActionBar.k6.Pi;
            arrayList.add(new org.telegram.ui.ActionBar.t6(textView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, i10));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.s.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, i10));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e1, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f0, 0, (Class[]) null, (Paint) null, new Drawable[]{this.q0}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.wh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.xh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.yh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.x6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"detailTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.z6));
        int i11 = org.telegram.ui.ActionBar.k6.Sh;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 131072, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.Qh;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 196608, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"yesButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 131072, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 196608, new Class[]{org.telegram.ui.Cells.a7.class}, new String[]{"noButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.n6));
        boolean z10 = this.H5;
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.f;
        if (z10) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(n5VarArr[1], 0, (Class[]) null, (Paint) null, this.I, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
            arrayList.add(new org.telegram.ui.ActionBar.t6(n5VarArr[1], 0, (Class[]) null, (Paint) null, this.y, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(n5VarArr[1], 0, (Class[]) null, (Paint) null, this.I, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ah));
        arrayList.add(new org.telegram.ui.ActionBar.t6(n5VarArr[1], 0, (Class[]) null, (Paint) null, this.y, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.zh));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.k6.w0(i10, this.A0);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final Drawable getThemedDrawable(String str) {
        org.telegram.ui.ActionBar.g6 g6Var = this.A0;
        Drawable drawable = g6Var != null ? g6Var.getDrawable(str) : null;
        return drawable != null ? drawable : super.getThemedDrawable(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0110, code lost:
    
        if (r24.inviter_id != getUserConfig().getClientUserId()) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0112, code lost:
    
        if (r25 == false) goto L85;
     */
    @Override // org.telegram.ui.Components.ju0
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
                    this.B2 = j10;
                    boolean z24 = j10 == getUserConfig().getClientUserId();
                    if (ChatObject.isChannel(this.F2)) {
                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str2 = channelParticipant.rank;
                        boolean z25 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        boolean z26 = z25 || (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin);
                        getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                        z13 = ChatObject.canAddAdmins(this.F2);
                        boolean z27 = ChatObject.canManageTags(this.F2) && (!z26 || ((!z25 && channelParticipant.can_edit) || z24));
                        if (z25 || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit)) {
                            z13 = false;
                            z27 = false;
                        }
                        if ((z24 || (channelParticipant instanceof TLRPC.TL_channelParticipantSelf)) && ChatObject.canManageMyTag(this.F2)) {
                            z27 = true;
                        }
                        z12 = ChatObject.canBlockUsers(this.F2) && (!((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || z25) || channelParticipant.can_edit);
                        z17 = this.F2.gigagroup ? false : z12;
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
                        TLRPC.Chat chat = this.F2;
                        z12 = chat.creator || ((chatParticipant instanceof TLRPC.TL_chatParticipant) && (ChatObject.canBlockUsers(chat) || chatParticipant.inviter_id == getUserConfig().getClientUserId()));
                        TLRPC.Chat chat2 = this.F2;
                        z13 = chat2.creator;
                        if (ChatObject.canManageTags(chat2)) {
                            z14 = z24;
                            z15 = true;
                            if (z29) {
                                if (!z30) {
                                }
                            }
                            z16 = z15;
                            z17 = this.F2.creator;
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
                        if (!z14 || !ChatObject.canManageMyTag(this.F2)) {
                            z16 = false;
                            z17 = this.F2.creator;
                            z18 = z30;
                            z19 = z28;
                            z20 = z29;
                            str = str3;
                            z21 = z16;
                            channelParticipant = null;
                        }
                        z16 = z15;
                        z17 = this.F2.creator;
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
                    } else if (ChatObject.canManageMyTag(this.F2) || (z20 && ChatObject.canManageTags(this.F2))) {
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
                    org.telegram.messenger.hk hkVar = new org.telegram.messenger.hk(this, channelParticipant2, user, chatParticipant, z19, str);
                    String str4 = str;
                    boolean z32 = z19;
                    Drawable W0 = view.getParent() instanceof org.telegram.ui.Components.mm0 ? ((org.telegram.ui.Components.mm0) view.getParent()).W0(view, false) : null;
                    org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(this, view);
                    H.W(W0);
                    H.w = false;
                    boolean z33 = z15;
                    H.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new px0(this, user, 0), !z14);
                    if (!z14 && (z13 || z22 || z17 || z23)) {
                        H.k();
                    }
                    H.l((z20 || !TextUtils.isEmpty(str4)) ? R.drawable.menu_tag_edit : R.drawable.menu_tag_plus, LocaleController.getString(z20 ? R.string.EditAdminTag : TextUtils.isEmpty(str4) ? R.string.AddMemberTag : R.string.EditMemberTag), new ci.i6(this, user, str4, z20, z18), z22);
                    H.l(R.drawable.msg_admins, LocaleController.getString(z32 ? R.string.EditAdminRights : R.string.SetAsAdmin), new oj0(hkVar, 26), z13);
                    H.l(R.drawable.msg_permissions, LocaleController.getString(R.string.ChangePermissions), new org.telegram.ui.Components.g30(this, channelParticipant2, chatParticipant, user, hkVar, 26), z17);
                    H.m(z23, R.drawable.msg_remove, LocaleController.getString(R.string.KickFromGroup), true, new mv0(8, this, chatParticipant));
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

    public final void h4() {
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        this.o2 = point.x > point.y;
    }

    public final void h5() {
        i5(false, false);
    }

    public final boolean i4() {
        return this.F2 != null ? getMessagesController().isChatNoForwards(this.F2) : getMessagesController().isUserNoForwards(this.w2);
    }

    public final void i5(boolean z10, boolean z11) {
        if (this.d == null) {
            if (z10) {
                l5(false);
            }
            n5();
            return;
        }
        if (!z11 && this.a.isInLayout()) {
            ly0 ly0Var = this.a;
            if (ly0Var.G) {
                ly0Var.post(new org.telegram.ui.Components.b60(14, this, z10));
                return;
            }
            return;
        }
        tz0 tz0Var = new tz0(this);
        tz0Var.b = this.O2;
        tz0Var.f(tz0Var.c);
        tz0Var.e.clear();
        tz0Var.f.clear();
        tz0Var.e.addAll(this.S4);
        tz0Var.f.addAll(this.T4);
        tz0Var.g = this.v4;
        tz0Var.h = this.w4;
        if (z10) {
            l5(false);
        }
        H4();
        n5();
        tz0Var.f(tz0Var.d);
        try {
            s4.o.c(tz0Var, true).c(this.d);
        } catch (Exception e) {
            FileLog.e(e);
            this.d.l();
        }
        int i10 = this.W5;
        if (i10 >= 0) {
            this.c.h1(i10, this.X5 - this.a.getPaddingTop());
        }
        AndroidUtilities.updateVisibleRows(this.a);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.q2;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        int bgColor2;
        if (this.q2) {
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.s()) {
            bgColor2 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.w8, this.A0);
        } else if (this.H5) {
            bgColor2 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.A0);
        } else {
            MessagesController.PeerColor peerColor = this.S5;
            bgColor2 = peerColor != null ? peerColor.getBgColor2(org.telegram.ui.ActionBar.k6.I.q()) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.A0);
        }
        return i0.a.h(bgColor2) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r3.contains((int) r7.getX(), ((int) r7.getY()) - r6.actionBar.getMeasuredHeight()) != false) goto L20;
     */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        rz0 rz0Var;
        wy0 wy0Var = this.o0;
        Rect rect = this.M2;
        if (wy0Var != null && wy0Var.getVisibility() == 0 && this.o0.getRealCount() > 1) {
            this.o0.getHitRect(rect);
            if (motionEvent != null) {
            }
        }
        if (this.L4 != -1 && (rz0Var = this.O) != null) {
            if (rz0Var.A0()) {
                this.O.getHitRect(rect);
                if (motionEvent == null || rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
                    rz0 rz0Var2 = this.O;
                    return rz0Var2.getSelectedTab() == rz0Var2.I0.getFirstTabId();
                }
            }
            return false;
        }
        return true;
    }

    public final boolean j4() {
        return (this.r0 == null || this.t1) ? false : true;
    }

    public final void j5() {
        if (this.c0 == null || this.r[1] == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        boolean z10 = this.H1;
        if (z10 && this.K1 == 2 && this.Y != null) {
            this.c0.setAlpha(this.T1);
            this.c0.h(AndroidUtilities.dp(74.0f) + this.a.getMeasuredWidth(), Q3() - AndroidUtilities.dp(74.0f));
            return;
        }
        if (z10) {
            this.c0.setAlpha(this.T1);
        }
        float f7 = currentActionBarHeight;
        float dp = this.R1 + f7 + AndroidUtilities.dp(74.0f);
        float min = Math.min(Q3(), dp - f7);
        this.c0.h(dp - min, min - AndroidUtilities.dp(74.0f));
    }

    public final void k4(boolean z10) {
        boolean isForum = ChatObject.isForum(this.F2);
        TLRPC.Chat chat = this.F2;
        org.telegram.ui.Components.f5.s(this, false, chat, null, false, isForum || z10 || (chat != null && chat.creator), z10, !isForum, new qx0(this, 2));
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
    public final void k5(boolean z10) {
        int i10;
        f01 f01Var;
        if (z10 && (i10 = this.O3) >= 0 && (f01Var = this.d) != null) {
            f01Var.m(i10);
        }
        org.telegram.ui.Components.ci0 ci0Var = this.a0;
        if (ci0Var == null || this.t1) {
            return;
        }
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        long j10 = this.j1;
        if (j10 == 0) {
            j10 = this.f1;
            if (j10 == 0) {
                j10 = -this.g1;
            }
        }
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, this.h1);
        boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
        boolean z11 = false;
        int c10 = org.telegram.messenger.v0.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
        int c11 = org.telegram.messenger.v0.c(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL, sharedPrefKey, notificationsSettings, 0);
        if (c10 != 3 || c11 == Integer.MAX_VALUE) {
            if (c10 == 0) {
                if (!contains) {
                    z11 = getNotificationsController().isGlobalNotificationsEnabled(j10, false, false);
                    ci0Var.setNotifications(z11);
                }
                z11 = true;
                ci0Var.setNotifications(z11);
            }
        }
    }

    public final boolean l4() {
        return getMessagesController().getStoriesController().I(a()) && !this.r1;
    }

    public final void l5(boolean z10) {
        int i10;
        TLRPC.UserStatus userStatus;
        boolean z11;
        int i11 = 0;
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
        while (i11 < this.v2.participants.participants.size()) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.v2.participants.participants.get(i11).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.id == getUserConfig().getClientUserId()) && user.status.expires > 10000)) {
                this.C2++;
            }
            this.D2.add(Integer.valueOf(i11));
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
                i11 = com.google.android.gms.internal.play_billing.k3.f(i10, i11, 1, arrayList);
            }
            i10 = TLObject.FLAG_31;
            i11 = com.google.android.gms.internal.play_billing.k3.f(i10, i11, 1, arrayList);
        }
        try {
            Collections.sort(this.D2, Comparator$-EL.reversed(Comparator$-CC.comparingInt(new cf(arrayList, 1))));
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (z10 && this.d != null && this.v4 > 0) {
            AndroidUtilities.updateVisibleRows(this.a);
        }
        if (this.O == null || this.L4 == -1) {
            return;
        }
        if ((this.D2.size() > 5 || this.U4 == 2) && this.U4 != 1) {
            this.O.d1(this.D2, this.v2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0a93 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0523  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4(boolean z10) {
        ValueAnimator valueAnimator;
        org.telegram.ui.Components.w9 currentItemView;
        boolean z11;
        float f7;
        NotchInfoUtils.NotchInfo notchInfo;
        boolean z12;
        float f10;
        float f11;
        float f12;
        float lerp;
        ValueAnimator valueAnimator2;
        int i10;
        ValueAnimator valueAnimator3;
        NotchInfoUtils.NotchInfo notchInfo2;
        TLRPC.ChatFull chatFull;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        float A3 = A3();
        ly0 ly0Var = this.a;
        if (ly0Var != null && !this.H1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ly0Var.getLayoutParams();
            if (layoutParams.topMargin != currentActionBarHeight) {
                layoutParams.topMargin = currentActionBarHeight;
                this.a.setLayoutParams(layoutParams);
            }
        }
        s5(z10);
        if (this.Y != null) {
            this.a.setTopGlowOffset((int) this.R1);
            this.a.setOverScrollMode((this.R1 <= ((float) V3()) || this.R1 >= ((float) ((Q3() + this.a.getMeasuredWidth()) - currentActionBarHeight))) ? 0 : 2);
        }
        if (this.Y != null && !this.O5 && this.H1) {
            z3();
            return;
        }
        int V3 = V3();
        if (this.Y != null) {
            if (this.a0 != null && this.g1 != 0) {
                this.a0.o(2, (!ChatObject.isChannel(this.F2) || this.F2.megagroup || (chatFull = this.v2) == null || chatFull.linked_chat_id == 0) ? false : true);
            }
            s5(z10);
            float translationY = this.actionBar.getTranslationY() + (org.telegram.messenger.sl.b(A3, 1.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f, this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) - AndroidUtilities.dp(21.0f));
            if (this.H1) {
                this.b2 = translationY;
            } else {
                float f13 = -AndroidUtilities.dp(29.0f);
                org.telegram.ui.Components.si0 si0Var = this.u0;
                if (si0Var != null && (notchInfo2 = si0Var.n) != null && notchInfo2.isLikelyCircle) {
                    f13 = notchInfo2.bounds.centerY();
                }
                this.b2 = AndroidUtilities.lerp(f13, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f)), A3);
            }
            float f14 = this.H1 ? this.S1 : this.R1;
            float f15 = V3;
            org.telegram.ui.ActionBar.n5[] n5VarArr = this.r;
            org.telegram.ui.ActionBar.n5[] n5VarArr2 = this.f;
            if (f14 > f15 || this.q2) {
                float max = Math.max(0.0f, Math.min(1.0f, (f14 - f15) / ((this.a.getMeasuredWidth() - currentActionBarHeight) - W3())));
                this.i2 = max;
                this.c2 = (AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) / 100.0f) * 42.0f;
                this.d2 = 0.0f;
                yy0 yy0Var = this.v0;
                if (yy0Var != null) {
                    yy0Var.invalidate();
                }
                ai.j1 j1Var = this.w0;
                if (j1Var != null) {
                    j1Var.invalidate();
                }
                float min = Math.min(AndroidUtilities.dpf2(2000.0f), Math.max(AndroidUtilities.dpf2(1100.0f), Math.abs(this.j2))) / AndroidUtilities.dpf2(1100.0f);
                Q3();
                boolean z13 = this.p2;
                float[] fArr = this.n2;
                if (!z13 || (!this.G0 && this.i2 < 0.33f)) {
                    if (this.q2) {
                        this.q2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                        org.telegram.ui.ActionBar.u0 u0Var = this.U0;
                        if (u0Var != null) {
                            u0Var.r(21);
                            if (this.r0 != null) {
                                this.U0.r(33);
                                this.U0.r(34);
                                this.U0.r(35);
                                this.U0.K(36);
                                this.U0.K(31);
                            }
                        }
                        org.telegram.ui.ActionBar.u0 u0Var2 = this.V0;
                        if (u0Var2 != null) {
                            u0Var2.setEnabled(!this.A1);
                        }
                        this.N.f(min, false);
                        this.p0.b(min);
                        this.k2.cancel();
                        this.f0.getImageReceiver().setAllowStartAnimation(true);
                        this.f0.getImageReceiver().startAnimation();
                        float lerp2 = AndroidUtilities.lerp(fArr, this.m2);
                        fArr[0] = lerp2;
                        fArr[1] = 0.0f;
                        this.k2.setInterpolator(org.telegram.ui.Components.bs.j);
                        if (this.o2) {
                            this.k2.setDuration(0L);
                        } else {
                            this.k2.setDuration((long) ((lerp2 * 250.0f) / min));
                        }
                        this.e1.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.A0));
                        if (!this.I0 && (currentItemView = this.o0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().getDrawable() instanceof org.telegram.ui.Components.u71) {
                                this.f0.a0 = false;
                            } else {
                                vy0 vy0Var = this.f0;
                                vy0Var.a0 = true;
                                vy0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().getDrawableSafe());
                            }
                        }
                        this.k2.addListener(new iz0(this, 3));
                        this.f0.setForegroundAlpha(1.0f);
                        this.Y.setVisibility(0);
                        this.o0.setAlpha(0.0f);
                        this.k2.start();
                        this.Q1 = false;
                        try {
                            try {
                                this.Y.performHapticFeedback(3, 1);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                        }
                        this.Y.setScaleX(this.c2);
                        this.Y.setScaleY(this.c2);
                        P3();
                        valueAnimator = this.k2;
                        if (valueAnimator != null || !valueAnimator.isRunning()) {
                            F4();
                            n5VarArr2[1].setTranslationY(this.f2);
                            n5VarArr[1].setTranslationX(Y3(this.g2, this.e6));
                            n5VarArr[1].setTranslationY(Z3(this.h2));
                            this.s.setTranslationX(this.g2);
                            this.s.setTranslationY(this.h2);
                            Z4();
                        }
                        z11 = this.H1;
                        if (!z11 && this.K1 == 2) {
                            float f16 = this.Q5;
                            float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f));
                            n5VarArr2[0].setTranslationX((this.Q5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f));
                            double d = translationY2;
                            n5VarArr2[0].setTranslationY(((float) Math.floor(d)) + AndroidUtilities.dp(1.3f));
                            n5VarArr[0].setTranslationX((this.Q5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f));
                            n5VarArr[0].setTranslationY(((float) Math.floor(d)) + AndroidUtilities.dp(24.0f));
                            n5VarArr2[0].setScaleX(1.0f);
                            n5VarArr2[0].setScaleY(1.0f);
                            n5VarArr2[1].setPivotY(r4.getMeasuredHeight());
                            n5VarArr2[1].setScaleX(1.38f);
                            n5VarArr2[1].setScaleY(1.38f);
                            this.c2 = AndroidUtilities.lerp(42, 138, this.T1) / 100.0f;
                            this.d2 = 0.0f;
                            yy0 yy0Var2 = this.v0;
                            if (yy0Var2 != null) {
                                yy0Var2.setExpandProgress(1.0f);
                            }
                            ai.j1 j1Var2 = this.w0;
                            if (j1Var2 != null) {
                                j1Var2.setExpandProgress(1.0f);
                            }
                            this.f0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(e4(), 0.0f, this.T1));
                            this.Y.setTranslationX(AndroidUtilities.lerp(f16, 0.0f, this.T1));
                            this.Y.setTranslationY(AndroidUtilities.lerp((float) Math.ceil(d), 0.0f, this.T1));
                            float measuredWidth = ((this.c2 * 100.0f) / 42.0f) * (this.Y.getMeasuredWidth() - AndroidUtilities.dp(42.0f));
                            this.i0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(16.0f) + measuredWidth);
                            this.i0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(-10.0f) + measuredWidth);
                            this.j0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                            this.j0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(26.5f) + measuredWidth);
                            this.k0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                            this.k0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + measuredWidth);
                            this.l0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                            this.l0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + measuredWidth);
                            this.Y.setScaleX(this.c2);
                            this.Y.setScaleY(this.c2);
                            this.o0.setAlpha(0.0f);
                            this.o0.setVisibility(0);
                            vy0 vy0Var2 = this.f0;
                            float f17 = this.T1;
                            float f18 = this.c2;
                            vy0Var2.H = f17;
                            vy0Var2.I = f18;
                            vy0Var2.G = true;
                            this.N.e(f17, false);
                            this.actionBar.B(i0.a.f(this.T1, this.S5 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.A0), -1), false);
                            org.telegram.ui.Components.zm0 zm0Var = this.L;
                            if (zm0Var != null) {
                                zm0Var.b(i0.a.f(this.T1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, this.A0), Color.argb(MessagesStorage.LAST_DB_VERSION, 255, 255, 255)));
                            }
                            Drawable drawable = this.x;
                            if (drawable != null) {
                                drawable.setColorFilter(this.S5 == null ? i0.a.f(this.T1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.pc, this.A0), -1) : -1, PorterDuff.Mode.MULTIPLY);
                            }
                            org.telegram.ui.Components.as asVar = this.J[1];
                            if (asVar != null) {
                                asVar.b(this.T1);
                                n5VarArr2[1].invalidate();
                            }
                            org.telegram.ui.Components.as asVar2 = this.K[1];
                            if (asVar2 != null) {
                                asVar2.b(this.T1);
                                n5VarArr2[1].invalidate();
                            }
                            c5(this.T1);
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                            layoutParams2.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.a.getMeasuredWidth() / this.c2, this.T1);
                            layoutParams2.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.R1 + currentActionBarHeight) / this.c2, this.T1);
                            this.Y.requestLayout();
                            Z4();
                        } else if (f14 <= f15) {
                            float f19 = 0.5f;
                            if (z11) {
                                this.c2 = AndroidUtilities.lerp(42, 96, A3) / 100.0f;
                                this.d2 = 0.0f;
                                f7 = 1.0f;
                            } else {
                                org.telegram.ui.Components.si0 si0Var2 = this.u0;
                                this.c2 = AndroidUtilities.lerp((si0Var2 == null || (notchInfo = si0Var2.n) == null || !notchInfo.isLikelyCircle) ? 24.0f : (notchInfo.bounds.width() * 0.5f) / AndroidUtilities.density, 96.0f, A3) / 100.0f;
                                f7 = 1.0f;
                                this.d2 = 1.0f - A3;
                            }
                            org.telegram.ui.Components.ci0 ci0Var = this.a0;
                            if (ci0Var != null) {
                                if (this.H1) {
                                    ci0Var.setAlpha(this.T1);
                                } else {
                                    ci0Var.setAlpha(f7);
                                }
                            }
                            yy0 yy0Var3 = this.v0;
                            if (yy0Var3 != null) {
                                yy0Var3.invalidate();
                            }
                            ai.j1 j1Var3 = this.w0;
                            if (j1Var3 != null) {
                                j1Var3.h = this.H1;
                                float clamp01 = Utilities.clamp01((A3 - 0.3f) / 0.7f);
                                if (j1Var3.f != clamp01) {
                                    j1Var3.f = clamp01;
                                    j1Var3.invalidate();
                                }
                            }
                            float f20 = (0.12f * A3) + 1.0f;
                            ValueAnimator valueAnimator4 = this.k2;
                            if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                                this.Y.setScaleX(this.c2);
                                this.Y.setScaleY(this.c2);
                                P3();
                                this.Y.setTranslationY((float) Math.ceil(this.b2));
                                float dp = (((this.c2 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
                                this.i0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(16.0f) + dp);
                                this.i0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(-10.0f) + dp);
                                this.j0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                                this.j0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(26.5f) + dp);
                                this.k0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                                this.k0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + dp);
                                this.l0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                                this.l0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + dp);
                            } else {
                                ValueAnimator valueAnimator5 = this.k2;
                                iz0 iz0Var = this.K5;
                                valueAnimator5.removeListener(iz0Var);
                                this.k2.addListener(iz0Var);
                            }
                            float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (this.Y.getScaleY() * this.Y.getHeight())) * (this.H1 ? this.T1 : A3)) + ((float) Math.floor(translationY));
                            this.f2 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.T1, 0.0f, (AndroidUtilities.dp(7.0f) * A3) + AndroidUtilities.dp(1.3f) + dpf2);
                            this.h2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * A3) + dpf2 + AndroidUtilities.dp(24.0f);
                            float dp2 = this.H1 ? (this.Q5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f) : -AndroidUtilities.dpf2(46.0f);
                            r01 r01Var = this.h6;
                            if (r01Var != null) {
                                r01Var.setAlpha((int) (255.0f * A3));
                            }
                            int measuredWidth2 = this.a.getMeasuredWidth();
                            int i11 = 0;
                            boolean z14 = false;
                            while (i11 < n5VarArr2.length) {
                                org.telegram.ui.ActionBar.n5 n5Var = n5VarArr2[i11];
                                if (n5Var == null) {
                                    f11 = f20;
                                    f10 = f19;
                                } else {
                                    n5Var.setScaleX(f20);
                                    n5VarArr2[i11].setScaleY(f20);
                                    if (i11 == 1) {
                                        n4(0, A3, false);
                                        z14 = true;
                                    }
                                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) n5VarArr2[i11].getLayoutParams();
                                    float f21 = measuredWidth2;
                                    float f22 = f21 / 2.0f;
                                    f10 = f19;
                                    float min2 = f22 - (((Math.min(n5VarArr2[i11].getExactWidth(), i11 == 1 ? layoutParams3.width : f21) * f20) * f10) + layoutParams3.leftMargin);
                                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) n5VarArr[i11].getLayoutParams();
                                    boolean z15 = this.r5;
                                    org.telegram.ui.ActionBar.n5 n5Var2 = n5VarArr[z15 ? 3 : i11];
                                    if (i11 == 1) {
                                        f21 = layoutParams4.width;
                                    }
                                    if (z15) {
                                        f11 = f20;
                                    } else {
                                        f11 = f20;
                                        if (n5Var2.getExactWidth() <= (f21 - n5Var2.getPaddingLeft()) - n5Var2.getPaddingRight()) {
                                            f12 = n5Var2.getPaddingLeft();
                                            float min3 = f22 - ((Math.min(n5Var2.getExactWidth(), f21) * f10) + (layoutParams4.leftMargin + f12));
                                            if (i11 == 1) {
                                                this.e2 = min2;
                                                this.g2 = min3;
                                                this.e6 = f12;
                                            }
                                            float lerp3 = AndroidUtilities.lerp(dp2, min2, A3);
                                            lerp = AndroidUtilities.lerp(dp2, min3, A3);
                                            valueAnimator2 = this.k2;
                                            if (valueAnimator2 == null && valueAnimator2.isRunning()) {
                                                i10 = 1;
                                            } else {
                                                n5VarArr2[i11].setTranslationX(lerp3);
                                                n5VarArr2[i11].setTranslationY(this.f2);
                                                i10 = 1;
                                                n5VarArr[i11].setTranslationX(Y3(lerp, i11 != 1 ? this.e6 * A3 : 0.0f));
                                                n5VarArr[i11].setTranslationY(Z3(this.h2));
                                                if (i11 == 1) {
                                                    this.s.setTranslationX(lerp);
                                                }
                                            }
                                            if (i11 != i10) {
                                                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) n5VarArr2[i10].getLayoutParams();
                                                int i12 = layoutParams5.width;
                                                int min4 = Math.min(layoutParams5.width, (int) ((((AndroidUtilities.isTablet() ? AndroidUtilities.dp(490.0f) : AndroidUtilities.displaySize.x) - AndroidUtilities.dp(18.0f)) / n5VarArr2[1].getScaleX()) - (n5VarArr2[1].getTranslationX() + layoutParams5.leftMargin)));
                                                layoutParams5.width = min4;
                                                if (min4 != i12) {
                                                    n5VarArr2[1].requestLayout();
                                                }
                                            }
                                        }
                                    }
                                    f12 = 0.0f;
                                    float min32 = f22 - ((Math.min(n5Var2.getExactWidth(), f21) * f10) + (layoutParams4.leftMargin + f12));
                                    if (i11 == 1) {
                                    }
                                    float lerp32 = AndroidUtilities.lerp(dp2, min2, A3);
                                    lerp = AndroidUtilities.lerp(dp2, min32, A3);
                                    valueAnimator2 = this.k2;
                                    if (valueAnimator2 == null) {
                                    }
                                    n5VarArr2[i11].setTranslationX(lerp32);
                                    n5VarArr2[i11].setTranslationY(this.f2);
                                    i10 = 1;
                                    n5VarArr[i11].setTranslationX(Y3(lerp, i11 != 1 ? this.e6 * A3 : 0.0f));
                                    n5VarArr[i11].setTranslationY(Z3(this.h2));
                                    if (i11 == 1) {
                                    }
                                    if (i11 != i10) {
                                    }
                                }
                                i11++;
                                f19 = f10;
                                f20 = f11;
                            }
                            this.s.setTranslationY(this.h2);
                            Z4();
                            z12 = z14;
                            if (!z12 && ((valueAnimator3 = this.k2) == null || !valueAnimator3.isRunning())) {
                                n4(0, A3, true);
                            }
                        }
                        z12 = false;
                        if (!z12) {
                            n4(0, A3, true);
                        }
                    }
                    this.Y.setScaleX(this.c2);
                    this.Y.setScaleY(this.c2);
                    P3();
                    valueAnimator = this.k2;
                    if (valueAnimator != null) {
                    }
                    F4();
                    n5VarArr2[1].setTranslationY(this.f2);
                    n5VarArr[1].setTranslationX(Y3(this.g2, this.e6));
                    n5VarArr[1].setTranslationY(Z3(this.h2));
                    this.s.setTranslationX(this.g2);
                    this.s.setTranslationY(this.h2);
                    Z4();
                    z11 = this.H1;
                    if (!z11) {
                    }
                    if (f14 <= f15) {
                    }
                    z12 = false;
                    if (!z12) {
                    }
                } else {
                    if (!this.q2) {
                        if (this.U0 != null) {
                            if (i4()) {
                                this.U0.r(21);
                            } else {
                                this.U0.K(21);
                            }
                            if (this.r0 != null) {
                                this.U0.K(36);
                                this.U0.K(34);
                                this.U0.K(35);
                                this.U0.r(33);
                                this.U0.r(31);
                            }
                        }
                        org.telegram.ui.ActionBar.u0 u0Var3 = this.V0;
                        if (u0Var3 != null) {
                            u0Var3.setEnabled(false);
                        }
                        this.q2 = true;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                        this.N.f(min, true);
                        this.p0.b(min);
                        this.o0.setCreateThumbFromParent(true);
                        this.o0.getAdapter().g();
                        this.k2.cancel();
                        float lerp4 = AndroidUtilities.lerp(fArr, this.m2);
                        fArr[0] = lerp4;
                        fArr[1] = 1.0f;
                        yy0 yy0Var4 = this.v0;
                        if (yy0Var4 == null || yy0Var4.w.isEmpty()) {
                            this.k2.setInterpolator(org.telegram.ui.Components.bs.j);
                            this.k2.setDuration((long) (((1.0f - lerp4) * 250.0f) / min));
                        } else {
                            this.k2.setInterpolator(new u1.a());
                            this.k2.setDuration((long) ((((1.0f - lerp4) * 1.3f) * 250.0f) / min));
                        }
                        this.k2.addListener(new iz0(this, 2));
                        View m10 = this.c.m(0);
                        if (!this.Q1 && m10 != null) {
                            this.P1 = true;
                            this.a.w0(((m10.getTop() - this.a.getMeasuredWidth()) - Q3()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0), (int) this.k2.getDuration(), (Interpolator) this.k2.getInterpolator());
                            this.a.O0 = false;
                        }
                        this.M5 = n5VarArr2[1].getTranslationY();
                        this.N5 = n5VarArr[1].getTranslationY();
                        this.k2.start();
                        this.o0.setAlpha(0.0f);
                        this.o0.setVisibility(0);
                        try {
                            this.Y.performHapticFeedback(0, 1);
                        } catch (Exception unused3) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams6 = this.o0.getLayoutParams();
                    int i13 = layoutParams6.height;
                    layoutParams6.width = this.a.getMeasuredWidth();
                    float f23 = currentActionBarHeight + f14;
                    int i14 = (int) f23;
                    layoutParams6.height = i14;
                    if (i13 != i14) {
                        this.o0.requestLayout();
                    }
                    if (!this.k2.isRunning()) {
                        float dp3 = (this.H1 && this.K1 == 2) ? (-(1.0f - this.T1)) * AndroidUtilities.dp(50.0f) : 0.0f;
                        n5VarArr2[1].setTranslationX(AndroidUtilities.dpf2(18.0f) - n5VarArr2[1].getLeft());
                        n5VarArr2[1].setTranslationY((((f23 - Q3()) - AndroidUtilities.dpf2(30.0f)) - n5VarArr2[1].getBottom()) + dp3);
                        n5VarArr[1].setTranslationX(Y3(AndroidUtilities.dpf2(16.0f) - n5VarArr[1].getLeft(), 0.0f));
                        n5VarArr[1].setTranslationY(Z3((((f23 - Q3()) - AndroidUtilities.dpf2(10.0f)) - n5VarArr[1].getBottom()) + dp3));
                        this.s.setTranslationX(n5VarArr[1].getTranslationX());
                        this.s.setTranslationY(n5VarArr[1].getTranslationY());
                        Z4();
                    }
                }
            }
            z11 = this.H1;
            if (!z11) {
            }
            if (f14 <= f15) {
            }
            z12 = false;
            if (!z12) {
            }
        }
        f5(currentActionBarHeight);
        if (A3 >= 1.0f) {
            this.f0.setAlpha(1.0f);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(53:35|(1:368)(1:39)|(1:41)(1:367)|42|(3:44|(1:46)(1:48)|47)|49|(1:51)|52|(1:54)|55|(1:57)|58|(1:60)(1:366)|61|(4:63|(1:364)(1:67)|68|(38:70|71|(1:73)|74|(1:(1:77)(30:(1:360)(1:81)|82|(1:86)|(1:356)(1:92)|93|(2:95|(2:97|(1:99))(2:294|(1:301)(1:300)))(2:302|(1:304)(2:305|(1:355)(2:311|(1:313)(2:314|(2:316|(1:318)(1:319))(30:320|(1:322)(1:354)|323|(1:353)(1:337)|338|339|(4:343|(1:351)(1:347)|348|(1:350))|352|101|(1:293)(1:105)|106|107|108|(1:110)|111|(4:114|(2:116|117)(19:(1:(1:246)(1:245))(1:121)|(1:(1:229)(2:223|(1:225)(2:226|(1:228))))(1:124)|125|(1:220)(1:128)|129|(1:219)(1:132)|133|(1:135)(1:218)|136|(1:138)(1:217)|139|(4:197|(4:199|(1:216)(2:203|(1:205)(1:215))|206|(2:211|(3:213|183|184)(1:214))(1:210))|186|184)(4:142|(2:195|196)(2:146|(1:148)(5:187|(1:194)|189|190|(1:192)(1:193)))|149|(2:180|(3:182|183|184)(3:185|186|184))(1:153))|(1:179)(1:159)|160|(1:164)|165|(1:178)(1:169)|170|(2:174|175))|118|112)|247|248|(3:250|(1:282)(1:256)|257)(2:283|(10:290|259|(1:261)|262|(1:264)|265|(1:281)(1:271)|272|(1:274)(1:280)|275)(1:289))|258|259|(0)|262|(0)|265|(2:267|269)|281|272|(0)(0)|275)))))|100|101|(1:103)|293|106|107|108|(0)|111|(1:112)|247|248|(0)(0)|258|259|(0)|262|(0)|265|(0)|281|272|(0)(0)|275))|361|82|(30:84|86|(2:88|90)|356|93|(0)(0)|100|101|(0)|293|106|107|108|(0)|111|(1:112)|247|248|(0)(0)|258|259|(0)|262|(0)|265|(0)|281|272|(0)(0)|275)|358|86|(0)|356|93|(0)(0)|100|101|(0)|293|106|107|108|(0)|111|(1:112)|247|248|(0)(0)|258|259|(0)|262|(0)|265|(0)|281|272|(0)(0)|275)(1:362))(1:365)|363|71|(0)|74|(0)|361|82|(0)|358|86|(0)|356|93|(0)(0)|100|101|(0)|293|106|107|108|(0)|111|(1:112)|247|248|(0)(0)|258|259|(0)|262|(0)|265|(0)|281|272|(0)(0)|275) */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x081a, code lost:
    
        if (r34.v2.can_view_participants != false) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0a50, code lost:
    
        if (r20[r10].j(r15.getRightDrawable2()) != false) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0aa8, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0a75, code lost:
    
        if (r20[r10].k(r5) != false) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0a8a, code lost:
    
        if (r20[r10].k(org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChatMessageSuggestions)) != false) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0aa6, code lost:
    
        if (r20[r10].k(r5) != false) goto L519;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0bdf  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0d28  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0d2e  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0d3b  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0c08  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0d1a  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0d1d  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5(boolean z10) {
        org.telegram.ui.ActionBar.n5[] n5VarArr;
        Object obj;
        Object[] objArr;
        long j10;
        org.telegram.ui.ActionBar.n5[] n5VarArr2;
        CharSequence formatPluralString;
        CharSequence charSequence;
        boolean z11;
        TLRPC.ChatParticipants chatParticipants;
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        ImageLocation C;
        boolean z12;
        TLRPC.Chat chat;
        ImageLocation imageLocation;
        CharSequence charSequence2;
        boolean z13;
        Object obj2;
        int i10;
        org.telegram.ui.ActionBar.n5[] n5VarArr3;
        boolean z14;
        String str;
        String str2;
        TLRPC.ChatFull chatFull;
        String formatShortNumber;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z15;
        TLRPC.VideoSize videoSize;
        org.telegram.ui.Components.u71 u71Var;
        TLRPC.User user;
        ImageLocation imageLocation2;
        TLRPC.User user2;
        boolean z16;
        String str3;
        TLRPC.UserStatus userStatus;
        int i15;
        int i16;
        char c10;
        org.telegram.ui.Components.bh bhVar;
        TL_stars.Tl_starsRating tl_starsRating;
        String str4;
        TLRPC.FileLocation fileLocation;
        boolean z17;
        org.telegram.ui.Components.p5 p5Var;
        boolean z18;
        boolean z19;
        org.telegram.ui.Components.p5 p5Var2;
        TL_stars.Tl_starsRating tl_starsRating2;
        ImageLocation imageLocation3;
        yw ywVar;
        if (this.Y == null || (n5VarArr = this.f) == null || getParentActivity() == null) {
            return;
        }
        int connectionState = getConnectionsManager().getConnectionState();
        String string = connectionState == 2 ? LocaleController.getString(R.string.WaitingForNetwork) : connectionState == 1 ? LocaleController.getString(R.string.Connecting) : connectionState == 5 ? LocaleController.getString(R.string.Updating) : connectionState == 4 ? LocaleController.getString(R.string.ConnectingToProxy) : null;
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var == null || h5Var.getFragmentStack().size() < 2) {
            obj = null;
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            obj = o2Var instanceof org.telegram.ui.Components.bh ? o2Var : null;
            if ((o2Var instanceof ey) && (ywVar = ((ey) o2Var).G3) != null) {
                fx fxVar = ywVar.a;
                if (com.google.android.gms.internal.play_billing.k3.s(fxVar)) {
                    obj = fxVar;
                }
            }
        }
        if (obj instanceof sn) {
            sn snVar = (sn) obj;
            if (snVar.m1 != null && snVar.y8() == 8) {
                objArr = true;
                this.r5 = false;
                this.s5 = false;
                j10 = this.f1;
                String str5 = "";
                org.telegram.ui.ActionBar.n5[] n5VarArr4 = this.r;
                if (j10 == 0) {
                    TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(this.f1));
                    if (user3 == null) {
                        return;
                    }
                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                    Object[] objArr2 = userProfilePhoto != null && userProfilePhoto.personal;
                    TLRPC.FileLocation fileLocation2 = userProfilePhoto != null ? userProfilePhoto.photo_big : null;
                    this.q0.m(this.currentAccount, user3);
                    MessagesController.PeerColor peerColor = this.S5;
                    MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(user3.emoji_status);
                    this.S5 = fromCollectible;
                    if (fromCollectible == null) {
                        int profileColorId = UserObject.getProfileColorId(user3);
                        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).profilePeerColors;
                        this.S5 = peerColors == null ? null : peerColors.getColor(profileColorId);
                    }
                    if (peerColor != this.S5) {
                        t5();
                    }
                    t01 t01Var = this.e1;
                    Object[] objArr3 = objArr;
                    if (t01Var != null) {
                        t01Var.b(UserObject.getProfileEmojiId(user3), user3.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    org.telegram.ui.Components.hx0 hx0Var = this.T;
                    if (hx0Var != null) {
                        hx0Var.b(this.S5);
                    }
                    TLRPC.EmojiStatus emojiStatus = user3.emoji_status;
                    N4(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null);
                    ImageLocation forUserOrChat3 = ImageLocation.getForUserOrChat(user3, 0);
                    ImageLocation forUserOrChat4 = ImageLocation.getForUserOrChat(user3, 1);
                    ImageLocation forUserOrChat5 = ImageLocation.getForUserOrChat(user3, 4);
                    TLRPC.UserFull userFull = this.w2;
                    if (userFull != null) {
                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                        videoSize = FileLoader.getVectorMarkupVideoSize((userProfilePhoto2 == null || !userProfilePhoto2.personal) ? userFull.profile_photo : userFull.personal_photo);
                        if (videoSize != null) {
                            z15 = false;
                            u71Var = new org.telegram.ui.Components.u71(videoSize, user3.premium, 2);
                            ImageLocation C2 = this.o0.C(forUserOrChat4, forUserOrChat3);
                            if (this.J2 == null) {
                                this.o0.H(u71Var, forUserOrChat3, forUserOrChat4, z10);
                            }
                            if (this.K2 == null) {
                                if (videoSize != null) {
                                    this.f0.setImageDrawable(u71Var);
                                } else {
                                    if (forUserOrChat5 == null || user3.photo.personal) {
                                        user = user3;
                                        imageLocation2 = forUserOrChat4;
                                        vy0 vy0Var = this.f0;
                                        vy0Var.a.setImage(C2, ImageLoader.AUTOPLAY_FILTER, forUserOrChat3, "100_100", imageLocation2, "50_50", this.q0, 0L, null, user, 1);
                                        forUserOrChat3 = forUserOrChat3;
                                        vy0Var.d();
                                    } else {
                                        this.f0.getImageReceiver().setVideoThumbIsSame(true);
                                        vy0 vy0Var2 = this.f0;
                                        user = user3;
                                        imageLocation2 = forUserOrChat4;
                                        vy0Var2.a.setImage(forUserOrChat5, "avatar", forUserOrChat3, "50_50", imageLocation2, "50_50", this.q0, 0L, null, user, 1);
                                        vy0Var2.d();
                                    }
                                    if ((imageLocation2 != null && this.P2 != -1) || (imageLocation2 == null && this.P2 == -1)) {
                                        h5();
                                        m4(true);
                                    }
                                    if (forUserOrChat3 != null || ((imageLocation3 = this.C0) != null && forUserOrChat3.photoId == imageLocation3.photoId)) {
                                        user2 = user;
                                    } else {
                                        this.C0 = forUserOrChat3;
                                        TLRPC.User user4 = user;
                                        getFileLoader().loadFile(forUserOrChat3, user4, null, 0, 1);
                                        user2 = user4;
                                    }
                                    CharSequence userName = UserObject.getUserName(user2);
                                    if (user2.id == getUserConfig().getClientUserId()) {
                                        long j11 = user2.id;
                                        if (j11 == UserObject.VERIFY) {
                                            str5 = LocaleController.getString(R.string.VerifyCodesNotifications);
                                        } else if (j11 == 333000 || j11 == 777000 || j11 == 42777) {
                                            str5 = LocaleController.getString(R.string.ServiceNotifications);
                                        } else if (MessagesController.isSupportUser(user2)) {
                                            str5 = LocaleController.getString(R.string.SupportStatus);
                                        } else if (this.s2) {
                                            int i17 = user2.bot_active_users;
                                            str5 = i17 != 0 ? LocaleController.formatPluralStringComma("BotUsers", i17, ',') : UserObject.getBotStatus(user2);
                                        } else {
                                            boolean[] zArr = this.K0;
                                            zArr[z15 ? 1 : 0] = z15;
                                            String formatUserStatus = LocaleController.formatUserStatus(this.currentAccount, user2, zArr, objArr2 != false ? new boolean[1] : null);
                                            z16 = (zArr[z15 ? 1 : 0] || getUserConfig().isPremium() || (userStatus = user2.status) == null || !(((userStatus instanceof TLRPC.TL_userStatusRecently) || (userStatus instanceof TLRPC.TL_userStatusLastMonth) || (userStatus instanceof TLRPC.TL_userStatusLastWeek)) && userStatus.by_me)) ? z15 ? 1 : 0 : true;
                                            org.telegram.ui.ActionBar.n5 n5Var = n5VarArr4[1];
                                            if (n5Var != null && !this.H5) {
                                                int i18 = (zArr[z15 ? 1 : 0] && this.S5 == null) ? org.telegram.ui.ActionBar.k6.Bh : org.telegram.ui.ActionBar.k6.B8;
                                                n5Var.setTag(Integer.valueOf(i18));
                                                if (!this.q2) {
                                                    n5VarArr4[1].setTextColor(x3(getThemedColor(i18), Boolean.valueOf(zArr[z15 ? 1 : 0])));
                                                }
                                            }
                                            str3 = formatUserStatus;
                                            TLRPC.UserProfilePhoto userProfilePhoto3 = user2.photo;
                                            this.s5 = (userProfilePhoto3 == null && userProfilePhoto3.personal) ? true : z15 ? 1 : 0;
                                            userName = Emoji.replaceEmoji(userName, n5VarArr[1].getPaint().getFontMetricsInt(), z15 ? 1 : 0);
                                            if (objArr3 != false) {
                                                this.f0.setAnimateFromImageReceiver(((sn) obj).m1.getAvatarImageView().getImageReceiver());
                                            }
                                            i15 = 0;
                                            while (i15 < 2) {
                                                if (n5VarArr[i15] == null) {
                                                    fileLocation = fileLocation2;
                                                    z17 = z16;
                                                } else {
                                                    if (i15 == 0 && objArr3 == true) {
                                                        org.telegram.ui.ActionBar.n5 titleTextView = ((sn) obj).m1.getTitleTextView();
                                                        n5VarArr[i15].k(titleTextView.getText());
                                                        n5VarArr[i15].i(titleTextView.getRightDrawable());
                                                        n5VarArr[i15].j(titleTextView.getRightDrawable2());
                                                    } else if (i15 != 0 || user2.id == getUserConfig().getClientUserId() || MessagesController.isSupportUser(user2) || (str4 = user2.phone) == null || str4.length() == 0 || getContactsController().contactsDict.get(Long.valueOf(user2.id)) != null || (getContactsController().contactsDict.size() == 0 && getContactsController().isLoadingContacts())) {
                                                        n5VarArr[i15].k(userName);
                                                    } else {
                                                        n5VarArr[i15].k(jf.b.c().b("+" + user2.phone));
                                                    }
                                                    if (i15 == 0 && string != null) {
                                                        n5VarArr4[i15].k(string);
                                                    } else if (i15 == 0 && objArr3 == true) {
                                                        sn snVar2 = (sn) obj;
                                                        if (snVar2.m1.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.n5) {
                                                            n5VarArr4[i15].k(((org.telegram.ui.ActionBar.n5) snVar2.m1.getSubtitleTextView()).getText());
                                                        } else if (snVar2.m1.getSubtitleTextView() instanceof org.telegram.ui.Components.q6) {
                                                            n5VarArr4[i15].k(((org.telegram.ui.Components.q6) snVar2.m1.getSubtitleTextView()).getText());
                                                        }
                                                    } else {
                                                        n5VarArr4[i15].k(str3);
                                                    }
                                                    n5VarArr4[i15].setDrawablePadding(AndroidUtilities.dp(9.0f));
                                                    n5VarArr4[i15].setRightDrawableInside(true);
                                                    n5VarArr4[i15].i((i15 == 1 && z16) ? d4() : null);
                                                    n5VarArr4[i15].setRightDrawableOnClick((i15 == 1 && z16) ? new vx0(this, 7) : null);
                                                    Drawable X3 = this.E2 != null ? X3() : null;
                                                    n5VarArr[i15].setRightDrawableOutside(i15 == 0);
                                                    if (i15 != 0 || objArr3 == true) {
                                                        fileLocation = fileLocation2;
                                                        z17 = z16;
                                                        p5Var = X3;
                                                        if (i15 == 1) {
                                                            boolean z20 = user2.scam;
                                                            if (z20 || user2.fake) {
                                                                n5VarArr[i15].j(c4(!z20 ? 1 : 0));
                                                            } else if (user2.verified) {
                                                                n5VarArr[i15].j(f4(i15));
                                                            } else {
                                                                n5VarArr[i15].j(null);
                                                            }
                                                            if (!MessagesController.isSupportUser(user2) && DialogObject.getEmojiStatusDocumentId(user2.emoji_status) != 0) {
                                                                n5VarArr[i15].i(U3(user2.emoji_status, true, i15));
                                                                z18 = true;
                                                                z19 = false;
                                                            } else if (getMessagesController().isPremiumUser(user2)) {
                                                                n5VarArr[i15].i(U3(null, true, i15));
                                                                z19 = true;
                                                                z18 = false;
                                                            } else {
                                                                n5VarArr[i15].i(null);
                                                            }
                                                        }
                                                        z19 = false;
                                                        z18 = false;
                                                    } else {
                                                        boolean z21 = user2.scam;
                                                        if (z21 || user2.fake) {
                                                            fileLocation = fileLocation2;
                                                            z17 = z16;
                                                            p5Var = X3;
                                                            n5VarArr[i15].j(c4(!z21 ? 1 : 0));
                                                            this.n = LocaleController.getString(R.string.ScamMessage);
                                                        } else if (user2.verified) {
                                                            n5VarArr[i15].j(f4(i15));
                                                            this.n = LocaleController.getString(R.string.AccDescrVerified);
                                                            fileLocation = fileLocation2;
                                                            z17 = z16;
                                                            p5Var = X3;
                                                        } else {
                                                            MessagesController messagesController = getMessagesController();
                                                            p5Var = X3;
                                                            long j12 = this.j1;
                                                            if (j12 == 0) {
                                                                j12 = this.f1;
                                                            }
                                                            fileLocation = fileLocation2;
                                                            z17 = z16;
                                                            if (messagesController.isDialogMuted(j12, this.h1)) {
                                                                n5VarArr[i15].j(getThemedDrawable("drawableMuteIcon"));
                                                                this.n = LocaleController.getString(R.string.NotificationsMuted);
                                                            } else {
                                                                n5VarArr[i15].j(null);
                                                                this.n = null;
                                                            }
                                                        }
                                                        if (!MessagesController.isSupportUser(user2) && DialogObject.getEmojiStatusDocumentId(user2.emoji_status) != 0) {
                                                            n5VarArr[i15].i(U3(user2.emoji_status, false, i15));
                                                            this.h = LocaleController.getString(R.string.AccDescrPremium);
                                                            z19 = false;
                                                            z18 = true;
                                                        } else if (getMessagesController().isPremiumUser(user2)) {
                                                            n5VarArr[i15].i(U3(null, false, i15));
                                                            this.h = LocaleController.getString(R.string.AccDescrPremium);
                                                            z19 = true;
                                                            z18 = false;
                                                        } else {
                                                            n5VarArr[i15].i(null);
                                                            this.h = null;
                                                            z19 = false;
                                                            z18 = false;
                                                        }
                                                    }
                                                    if (p5Var == null && this.E2 == null && user2.bot_verification_icon != 0) {
                                                        n5VarArr[i15].setLeftDrawableOutside(true);
                                                        p5Var2 = S3(i15, user2.bot_verification_icon);
                                                    } else {
                                                        n5VarArr[i15].setLeftDrawableOutside(false);
                                                        p5Var2 = p5Var;
                                                    }
                                                    n5VarArr[i15].setLeftDrawable(p5Var2);
                                                    if (i15 == 1 && (z18 || z19)) {
                                                        n5VarArr[i15].setRightDrawableOutside(true);
                                                    }
                                                    if (user2.self && getMessagesController().isPremiumUser(user2)) {
                                                        n5VarArr[i15].setRightDrawableOnClick(new vx0(this, 8));
                                                    }
                                                    if (!user2.self && getMessagesController().isPremiumUser(user2)) {
                                                        org.telegram.ui.ActionBar.n5 n5Var2 = n5VarArr[i15];
                                                        n5Var2.setRightDrawableOnClick(new z(this, user2, n5Var2, 14));
                                                    }
                                                }
                                                i15++;
                                                z16 = z17;
                                                fileLocation2 = fileLocation;
                                            }
                                            TLRPC.FileLocation fileLocation3 = fileLocation2;
                                            if (this.f1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                                n5VarArr4[2].k(LocaleController.getString(R.string.FallbackTooltip));
                                                TLRPC.UserFull userFull2 = this.w2;
                                                if (userFull2 == null || (tl_starsRating = userFull2.stars_rating) == null || tl_starsRating.stars >= 0) {
                                                    n5VarArr4[3].k(LocaleController.getString(R.string.Online));
                                                } else {
                                                    n5VarArr4[3].k(LocaleController.getString(R.string.StarRatingLevelNegative).toLowerCase(Locale.ROOT));
                                                }
                                                i16 = 0;
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto4 = user2.photo;
                                                if (userProfilePhoto4 != null && userProfilePhoto4.personal && userProfilePhoto4.has_video) {
                                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                                                    i16 = 0;
                                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.uz(i16), 0, str3.length(), 0);
                                                    spannableStringBuilder.append((CharSequence) " d ");
                                                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CustomAvatarTooltipVideo));
                                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.lt(), str3.length() + 1, str3.length() + 2, 0);
                                                    n5VarArr4[2].k(spannableStringBuilder);
                                                } else {
                                                    i16 = 0;
                                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str3);
                                                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.uz(i16), 0, str3.length(), 0);
                                                    spannableStringBuilder2.append((CharSequence) " d ");
                                                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.CustomAvatarTooltip));
                                                    c10 = 2;
                                                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.lt(), str3.length() + 1, str3.length() + 2, 0);
                                                    n5VarArr4[2].k(spannableStringBuilder2);
                                                    n5VarArr4[c10].setVisibility(i16);
                                                    if (!this.X1) {
                                                        n5VarArr4[3].setVisibility(i16);
                                                    }
                                                    bhVar = this.i5;
                                                    if (bhVar != null) {
                                                        bhVar.q();
                                                    }
                                                    this.f0.getImageReceiver().setVisible(PhotoViewer.R1(fileLocation3) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.f0), this.v0 == null);
                                                }
                                            }
                                            c10 = 2;
                                            n5VarArr4[c10].setVisibility(i16);
                                            if (!this.X1) {
                                            }
                                            bhVar = this.i5;
                                            if (bhVar != null) {
                                            }
                                            this.f0.getImageReceiver().setVisible(PhotoViewer.R1(fileLocation3) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.f0), this.v0 == null);
                                        }
                                    } else if (UserObject.hasFallbackPhoto(this.w2)) {
                                        this.r5 = true;
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.w2.fallback_photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                        if (closestPhotoSizeWithSize != null) {
                                            this.t5.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.w2.fallback_photo), "50_50", (Drawable) null, 0L, (String) null, UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0);
                                        }
                                    } else {
                                        TLRPC.UserFull userFull3 = this.w2;
                                        str5 = (userFull3 == null || (tl_starsRating2 = userFull3.stars_rating) == null || tl_starsRating2.stars >= 0) ? LocaleController.getString(R.string.Online) : LocaleController.getString(R.string.StarRatingLevelNegative).toLowerCase(Locale.ROOT);
                                    }
                                    str3 = str5;
                                    z16 = z15 ? 1 : 0;
                                    TLRPC.UserProfilePhoto userProfilePhoto32 = user2.photo;
                                    this.s5 = (userProfilePhoto32 == null && userProfilePhoto32.personal) ? true : z15 ? 1 : 0;
                                    userName = Emoji.replaceEmoji(userName, n5VarArr[1].getPaint().getFontMetricsInt(), z15 ? 1 : 0);
                                    if (objArr3 != false) {
                                    }
                                    i15 = 0;
                                    while (i15 < 2) {
                                    }
                                    TLRPC.FileLocation fileLocation32 = fileLocation2;
                                    if (this.f1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                    }
                                    c10 = 2;
                                    n5VarArr4[c10].setVisibility(i16);
                                    if (!this.X1) {
                                    }
                                    bhVar = this.i5;
                                    if (bhVar != null) {
                                    }
                                    this.f0.getImageReceiver().setVisible(PhotoViewer.R1(fileLocation32) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.f0), this.v0 == null);
                                }
                            }
                            user = user3;
                            imageLocation2 = forUserOrChat4;
                            if (imageLocation2 != null) {
                                h5();
                                m4(true);
                                if (forUserOrChat3 != null) {
                                }
                                user2 = user;
                                CharSequence userName2 = UserObject.getUserName(user2);
                                if (user2.id == getUserConfig().getClientUserId()) {
                                }
                                str3 = str5;
                                z16 = z15 ? 1 : 0;
                                TLRPC.UserProfilePhoto userProfilePhoto322 = user2.photo;
                                this.s5 = (userProfilePhoto322 == null && userProfilePhoto322.personal) ? true : z15 ? 1 : 0;
                                userName2 = Emoji.replaceEmoji(userName2, n5VarArr[1].getPaint().getFontMetricsInt(), z15 ? 1 : 0);
                                if (objArr3 != false) {
                                }
                                i15 = 0;
                                while (i15 < 2) {
                                }
                                TLRPC.FileLocation fileLocation322 = fileLocation2;
                                if (this.f1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                }
                                c10 = 2;
                                n5VarArr4[c10].setVisibility(i16);
                                if (!this.X1) {
                                }
                                bhVar = this.i5;
                                if (bhVar != null) {
                                }
                                this.f0.getImageReceiver().setVisible(PhotoViewer.R1(fileLocation322) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.f0), this.v0 == null);
                            }
                            h5();
                            m4(true);
                            if (forUserOrChat3 != null) {
                            }
                            user2 = user;
                            CharSequence userName22 = UserObject.getUserName(user2);
                            if (user2.id == getUserConfig().getClientUserId()) {
                            }
                            str3 = str5;
                            z16 = z15 ? 1 : 0;
                            TLRPC.UserProfilePhoto userProfilePhoto3222 = user2.photo;
                            this.s5 = (userProfilePhoto3222 == null && userProfilePhoto3222.personal) ? true : z15 ? 1 : 0;
                            userName22 = Emoji.replaceEmoji(userName22, n5VarArr[1].getPaint().getFontMetricsInt(), z15 ? 1 : 0);
                            if (objArr3 != false) {
                            }
                            i15 = 0;
                            while (i15 < 2) {
                            }
                            TLRPC.FileLocation fileLocation3222 = fileLocation2;
                            if (this.f1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                            }
                            c10 = 2;
                            n5VarArr4[c10].setVisibility(i16);
                            if (!this.X1) {
                            }
                            bhVar = this.i5;
                            if (bhVar != null) {
                            }
                            this.f0.getImageReceiver().setVisible(PhotoViewer.R1(fileLocation3222) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.f0), this.v0 == null);
                        } else {
                            z15 = false;
                        }
                    } else {
                        z15 = false;
                        videoSize = null;
                    }
                    u71Var = null;
                    ImageLocation C22 = this.o0.C(forUserOrChat4, forUserOrChat3);
                    if (this.J2 == null) {
                    }
                    if (this.K2 == null) {
                    }
                    user = user3;
                    imageLocation2 = forUserOrChat4;
                    if (imageLocation2 != null) {
                    }
                    h5();
                    m4(true);
                    if (forUserOrChat3 != null) {
                    }
                    user2 = user;
                    CharSequence userName222 = UserObject.getUserName(user2);
                    if (user2.id == getUserConfig().getClientUserId()) {
                    }
                    str3 = str5;
                    z16 = z15 ? 1 : 0;
                    TLRPC.UserProfilePhoto userProfilePhoto32222 = user2.photo;
                    this.s5 = (userProfilePhoto32222 == null && userProfilePhoto32222.personal) ? true : z15 ? 1 : 0;
                    userName222 = Emoji.replaceEmoji(userName222, n5VarArr[1].getPaint().getFontMetricsInt(), z15 ? 1 : 0);
                    if (objArr3 != false) {
                    }
                    i15 = 0;
                    while (i15 < 2) {
                    }
                    TLRPC.FileLocation fileLocation32222 = fileLocation2;
                    if (this.f1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    }
                    c10 = 2;
                    n5VarArr4[c10].setVisibility(i16);
                    if (!this.X1) {
                    }
                    bhVar = this.i5;
                    if (bhVar != null) {
                    }
                    this.f0.getImageReceiver().setVisible(PhotoViewer.R1(fileLocation32222) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.f0), this.v0 == null);
                } else {
                    Object[] objArr4 = objArr;
                    if (this.g1 != 0) {
                        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.g1));
                        if (chat2 != null) {
                            this.F2 = chat2;
                        } else {
                            chat2 = this.F2;
                        }
                        FlagSecureReason flagSecureReason = this.Y1;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                        MessagesController.PeerColor peerColor2 = this.S5;
                        MessagesController.PeerColor fromCollectible2 = MessagesController.PeerColor.fromCollectible(chat2.emoji_status);
                        this.S5 = fromCollectible2;
                        if (fromCollectible2 == null) {
                            int profileColorId2 = ChatObject.getProfileColorId(chat2);
                            MessagesController.PeerColors peerColors2 = MessagesController.getInstance(this.currentAccount).profilePeerColors;
                            this.S5 = peerColors2 == null ? null : peerColors2.getColor(profileColorId2);
                        }
                        if (peerColor2 != this.S5) {
                            t5();
                        }
                        t01 t01Var2 = this.e1;
                        if (t01Var2 != null) {
                            t01Var2.b(ChatObject.getProfileEmojiId(chat2), chat2.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                        }
                        TLRPC.EmojiStatus emojiStatus2 = chat2.emoji_status;
                        N4(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null);
                        TLRPC.TL_forumTopic findTopic = this.r1 ? getMessagesController().getTopicsController().findTopic(this.g1, this.h1) : null;
                        String str6 = "Subscribers";
                        if (ChatObject.isChannel(chat2)) {
                            if (!this.r1) {
                                TLRPC.ChatFull chatFull2 = this.v2;
                                if (chatFull2 != null) {
                                    TLRPC.Chat chat3 = this.F2;
                                    if (!chat3.megagroup) {
                                        if (chatFull2.participants_count != 0) {
                                            if (!ChatObject.hasAdminRights(chat3)) {
                                            }
                                        }
                                    }
                                }
                                formatPluralString = this.F2.megagroup ? LocaleController.getString(R.string.Loading).toLowerCase() : ChatObject.isPublic(chat2) ? LocaleController.getString(R.string.ChannelPublic).toLowerCase() : LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                                n5VarArr2 = n5VarArr;
                                charSequence = formatPluralString;
                                z11 = false;
                            }
                            if (this.r1) {
                                if (findTopic != null) {
                                    i12 = 1;
                                    i13 = findTopic.totalMessagesCount - 1;
                                } else {
                                    i12 = 1;
                                    i13 = 0;
                                }
                                if (i13 > 0) {
                                    Object[] objArr5 = new Object[i12];
                                    i14 = 0;
                                    objArr5[0] = Integer.valueOf(i13);
                                    formatPluralString = LocaleController.formatPluralString("messages", i13, objArr5);
                                } else {
                                    i14 = 0;
                                    int i19 = R.string.TopicProfileStatus;
                                    Object[] objArr6 = new Object[i12];
                                    objArr6[0] = chat2.title;
                                    formatPluralString = LocaleController.formatString("TopicProfileStatus", i19, objArr6);
                                }
                                SpannableString spannableString = new SpannableString(">");
                                n5VarArr2 = n5VarArr;
                                spannableString.setSpan(new org.telegram.ui.Components.xq(R.drawable.arrow_newchat), i14, 1, 33);
                                charSequence = new SpannableStringBuilder(chat2.title).append(' ').append((CharSequence) spannableString);
                                z11 = true;
                            } else {
                                n5VarArr2 = n5VarArr;
                                if (!this.F2.megagroup) {
                                    LocaleController.formatShortNumber(this.v2.participants_count, new int[1]);
                                    if (this.F2.megagroup) {
                                        z11 = false;
                                        formatPluralString = LocaleController.formatPluralString("Members", this.v2.participants_count, new Object[0]);
                                        charSequence = LocaleController.formatPluralStringComma("Members", this.v2.participants_count);
                                    } else {
                                        formatPluralString = LocaleController.formatPluralString("Subscribers", this.v2.participants_count, new Object[0]);
                                        charSequence = LocaleController.formatPluralStringComma("Subscribers", this.v2.participants_count);
                                    }
                                } else if (this.C2 <= 1 || (i11 = this.v2.participants_count) == 0) {
                                    int i20 = this.v2.participants_count;
                                    if (i20 == 0) {
                                        formatPluralString = chat2.has_geo ? LocaleController.getString(R.string.MegaLocation).toLowerCase() : ChatObject.isPublic(chat2) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                                        charSequence = formatPluralString;
                                    } else {
                                        formatPluralString = LocaleController.formatPluralString("Members", i20, new Object[0]);
                                        charSequence = LocaleController.formatPluralStringComma("Members", this.v2.participants_count);
                                    }
                                } else {
                                    formatPluralString = a1.g.D(LocaleController.formatPluralString("Members", i11, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(this.C2, this.v2.participants_count), new Object[0]));
                                    charSequence = a1.g.D(LocaleController.formatPluralStringComma("Members", this.v2.participants_count), ", ", LocaleController.formatPluralStringComma("OnlineCount", Math.min(this.C2, this.v2.participants_count)));
                                }
                                z11 = false;
                            }
                        } else {
                            n5VarArr2 = n5VarArr;
                            if (ChatObject.isKickedFromChat(chat2)) {
                                formatPluralString = LocaleController.getString(R.string.YouWereKicked);
                            } else if (ChatObject.isLeftFromChat(chat2)) {
                                formatPluralString = LocaleController.getString(R.string.YouLeft);
                            } else {
                                int i21 = chat2.participants_count;
                                TLRPC.ChatFull chatFull3 = this.v2;
                                if (chatFull3 != null && (chatParticipants = chatFull3.participants) != null) {
                                    i21 = chatParticipants.participants.size();
                                }
                                if (i21 == 0 || this.C2 <= 1) {
                                    formatPluralString = LocaleController.formatPluralString("Members", i21, new Object[0]);
                                } else {
                                    formatPluralString = a1.g.D(LocaleController.formatPluralString("Members", i21, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", this.C2, new Object[0]));
                                    charSequence = formatPluralString;
                                    z11 = false;
                                }
                            }
                            charSequence = formatPluralString;
                            z11 = false;
                        }
                        if (objArr4 != false) {
                            sn snVar3 = (sn) obj;
                            if (snVar3.m1.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.n5) {
                                formatPluralString = ((org.telegram.ui.ActionBar.n5) snVar3.m1.getSubtitleTextView()).getText();
                            } else if (snVar3.m1.getSubtitleTextView() instanceof org.telegram.ui.Components.q6) {
                                formatPluralString = ((org.telegram.ui.Components.q6) snVar3.m1.getSubtitleTextView()).getText();
                            }
                            this.f0.setAnimateFromImageReceiver(snVar3.m1.getAvatarImageView().getImageReceiver());
                        }
                        boolean z22 = false;
                        int i22 = 0;
                        while (i22 < 2) {
                            org.telegram.ui.ActionBar.n5 n5Var3 = n5VarArr2[i22];
                            if (n5Var3 == null) {
                                str = string;
                                charSequence2 = formatPluralString;
                                str2 = str6;
                                obj2 = obj;
                                i10 = i22;
                                n5VarArr3 = n5VarArr4;
                            } else if (i22 == 0 && objArr4 == true) {
                                org.telegram.ui.ActionBar.n5 titleTextView2 = ((sn) obj).m1.getTitleTextView();
                                charSequence2 = formatPluralString;
                                z13 = z22;
                                if (n5VarArr2[i22].k(titleTextView2.getText())) {
                                    z13 = true;
                                }
                                if (n5VarArr2[i22].i(titleTextView2.getRightDrawable())) {
                                    z13 = true;
                                }
                            } else {
                                charSequence2 = formatPluralString;
                                z13 = z22;
                                if (this.r1) {
                                    CharSequence charSequence3 = findTopic == null ? "" : findTopic.title;
                                    try {
                                        charSequence3 = Emoji.replaceEmoji(charSequence3, n5Var3.getPaint().getFontMetricsInt(), false);
                                    } catch (Exception unused) {
                                    }
                                } else if (!ChatObject.isMonoForum(chat2)) {
                                    CharSequence charSequence4 = chat2.title;
                                    if (charSequence4 != null) {
                                        try {
                                            charSequence4 = Emoji.replaceEmoji(charSequence4, n5VarArr2[i22].getPaint().getFontMetricsInt(), false);
                                        } catch (Exception unused2) {
                                        }
                                    }
                                    n5VarArr2[i22].setLeftDrawableOutside(false);
                                    n5VarArr2[i22].setLeftDrawable((Drawable) null);
                                    n5VarArr2[i22].setRightDrawableOutside(i22 == 0);
                                    n5VarArr2[i22].setRightDrawableOnClick(null);
                                    if (i22 != 0) {
                                        boolean z23 = chat2.scam;
                                        if (z23 || chat2.fake) {
                                            n5VarArr2[i22].j(c4(!z23 ? 1 : 0));
                                            this.h = LocaleController.getString(R.string.ScamMessage);
                                        } else if (chat2.verified) {
                                            n5VarArr2[i22].j(f4(i22));
                                            this.h = LocaleController.getString(R.string.AccDescrVerified);
                                        } else {
                                            n5VarArr2[i22].j(null);
                                            this.h = null;
                                        }
                                        if (DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) != 0) {
                                            n5VarArr2[i22].i(U3(chat2.emoji_status, false, i22));
                                            n5VarArr2[i22].setRightDrawableOutside(true);
                                            this.h = null;
                                            if (ChatObject.canChangeChatInfo(chat2)) {
                                                n5VarArr2[i22].setRightDrawableOnClick(new vx0(this, 9));
                                                if (this.S) {
                                                    this.S = true;
                                                    i10 = i22;
                                                    getMediaDataController().loadRestrictedStatusEmojis();
                                                } else {
                                                    i10 = i22;
                                                }
                                            } else {
                                                i10 = i22;
                                                TLRPC.EmojiStatus emojiStatus3 = chat2.emoji_status;
                                                if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                                                    obj2 = obj;
                                                    n5VarArr2[i10].setRightDrawableOnClick(new ey0(this, ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug, 0));
                                                }
                                            }
                                            obj2 = obj;
                                        } else {
                                            obj2 = obj;
                                            i10 = i22;
                                        }
                                    } else {
                                        obj2 = obj;
                                        i10 = i22;
                                        if (objArr4 == false) {
                                            boolean z24 = chat2.scam;
                                            if (z24 || chat2.fake) {
                                                n5VarArr3 = n5VarArr4;
                                                n5VarArr2[i10].j(c4(!z24 ? 1 : 0));
                                            } else if (chat2.verified) {
                                                n5VarArr2[i10].j(f4(i10));
                                                n5VarArr3 = n5VarArr4;
                                            } else {
                                                n5VarArr3 = n5VarArr4;
                                                if (getMessagesController().isDialogMuted(-this.g1, this.h1)) {
                                                    n5VarArr2[i10].j(getThemedDrawable("drawableMuteIcon"));
                                                } else {
                                                    n5VarArr2[i10].j(null);
                                                }
                                            }
                                            if (DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) != 0) {
                                                n5VarArr2[i10].i(U3(chat2.emoji_status, false, i10));
                                                z14 = true;
                                                n5VarArr2[i10].setRightDrawableOutside(true);
                                            } else {
                                                z14 = true;
                                                n5VarArr2[i10].i(null);
                                            }
                                            if (chat2.bot_verification_icon == 0) {
                                                n5VarArr2[i10].setLeftDrawableOutside(z14);
                                                n5VarArr2[i10].setLeftDrawable(S3(i10, chat2.bot_verification_icon));
                                            } else {
                                                n5VarArr2[i10].setLeftDrawable((Drawable) null);
                                            }
                                            if (i10 == 0 || string == null) {
                                                if (objArr4 == false) {
                                                    TLRPC.Chat chat4 = this.F2;
                                                    if ((!chat4.megagroup || this.v2 == null || this.C2 <= 0) && !this.r1) {
                                                        if (i10 == 0 && ChatObject.isChannel(chat4) && (chatFull = this.v2) != null && chatFull.participants_count != 0) {
                                                            TLRPC.Chat chat5 = this.F2;
                                                            if (chat5.megagroup || chat5.broadcast) {
                                                                int[] iArr = new int[1];
                                                                if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                                                    int i23 = this.v2.participants_count;
                                                                    iArr[0] = i23;
                                                                    formatShortNumber = String.valueOf(i23);
                                                                } else {
                                                                    formatShortNumber = LocaleController.formatShortNumber(this.v2.participants_count, iArr);
                                                                }
                                                                if (!this.F2.megagroup) {
                                                                    str = string;
                                                                    str2 = str6;
                                                                    n5VarArr3[i10].k(LocaleController.formatPluralString(str6, iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber));
                                                                    if (i10 == 1) {
                                                                        if (z11) {
                                                                        }
                                                                    }
                                                                    z22 = z13;
                                                                } else if (this.v2.participants_count != 0) {
                                                                    str = string;
                                                                    CharSequence replace = LocaleController.formatPluralString("Members", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber);
                                                                    org.telegram.ui.ActionBar.n5 n5Var4 = n5VarArr3[i10];
                                                                    if (i10 != 0) {
                                                                        replace = w3(replace);
                                                                    }
                                                                    n5Var4.k(replace);
                                                                    str2 = str6;
                                                                    if (i10 == 1 && this.r1) {
                                                                        if (z11) {
                                                                            n5VarArr3[i10].setOnClickListener(null);
                                                                            n5VarArr3[i10].setClickable(false);
                                                                        } else {
                                                                            n5VarArr3[i10].setOnClickListener(new vx0(this, 10));
                                                                        }
                                                                    }
                                                                    z22 = z13;
                                                                } else if (chat2.has_geo) {
                                                                    n5VarArr3[i10].k(LocaleController.getString(R.string.MegaLocation).toLowerCase());
                                                                } else if (ChatObject.isPublic(chat2)) {
                                                                    n5VarArr3[i10].k(LocaleController.getString(R.string.MegaPublic).toLowerCase());
                                                                } else {
                                                                    n5VarArr3[i10].k(LocaleController.getString(R.string.MegaPrivate).toLowerCase());
                                                                }
                                                            }
                                                        }
                                                        str = string;
                                                        str2 = str6;
                                                        n5VarArr3[i10].k(i10 == 0 ? charSequence2 : w3(charSequence));
                                                        if (i10 == 1) {
                                                        }
                                                        z22 = z13;
                                                    }
                                                }
                                                str = string;
                                                str2 = str6;
                                                n5VarArr3[i10].k(i10 != 0 ? charSequence2 : w3(charSequence));
                                                if (i10 == 1) {
                                                }
                                                z22 = z13;
                                            } else {
                                                n5VarArr3[i10].k(string);
                                            }
                                            str = string;
                                            str2 = str6;
                                            if (i10 == 1) {
                                            }
                                            z22 = z13;
                                        }
                                    }
                                    n5VarArr3 = n5VarArr4;
                                    z14 = true;
                                    if (chat2.bot_verification_icon == 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (objArr4 == false) {
                                    }
                                    str = string;
                                    str2 = str6;
                                    n5VarArr3[i10].k(i10 != 0 ? charSequence2 : w3(charSequence));
                                    if (i10 == 1) {
                                    }
                                    z22 = z13;
                                }
                            }
                            i22 = i10 + 1;
                            obj = obj2;
                            str6 = str2;
                            formatPluralString = charSequence2;
                            n5VarArr4 = n5VarArr3;
                            string = str;
                        }
                        if (z22) {
                            m4(true);
                        }
                        TLRPC.ChatPhoto chatPhoto = chat2.photo;
                        TLRPC.FileLocation fileLocation4 = (chatPhoto == null || this.r1) ? null : chatPhoto.photo_big;
                        if (this.r1) {
                            og.d.p(this.f0, findTopic, true, true, this.A0);
                            forUserOrChat2 = null;
                            C = null;
                            forUserOrChat = null;
                        } else if (ChatObject.isMonoForum(this.F2)) {
                            TLRPC.Chat monoForumLinkedChat = getMessagesController().getMonoForumLinkedChat(this.F2.id);
                            this.q0.k(this.currentAccount, monoForumLinkedChat);
                            forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat, 0);
                            forUserOrChat2 = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat, 1);
                            C = this.o0.C(forUserOrChat2, forUserOrChat);
                        } else {
                            this.q0.k(this.currentAccount, chat2);
                            forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 0);
                            forUserOrChat2 = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 1);
                            wy0 wy0Var = this.o0;
                            C = wy0Var != null ? wy0Var.C(forUserOrChat2, forUserOrChat) : null;
                        }
                        boolean H = this.o0.H(null, forUserOrChat, forUserOrChat2, z10);
                        if ((forUserOrChat == null || H) && this.q2) {
                            z12 = false;
                            View m10 = this.c.m(0);
                            if (m10 != null) {
                                this.a.v0(0, m10.getTop() - V3(), org.telegram.ui.Components.bs.h);
                            }
                        } else {
                            z12 = false;
                        }
                        String str7 = (C == null || C.imageType != 2) ? null : ImageLoader.AUTOPLAY_FILTER;
                        if (this.K2 != null || this.r1) {
                            chat = chat2;
                        } else {
                            TLRPC.Chat chat6 = chat2;
                            this.f0.l(C, str7, forUserOrChat2, "50_50", this.q0, chat6);
                            chat = chat6;
                        }
                        if (forUserOrChat != null && ((imageLocation = this.C0) == null || forUserOrChat.photoId != imageLocation.photoId)) {
                            this.C0 = forUserOrChat;
                            getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
                        }
                        this.f0.getImageReceiver().setVisible((PhotoViewer.R1(fileLocation4) || (getLastStoryViewer() != null && getLastStoryViewer().s0.a == this.f0)) ? z12 : true, this.v0 != null ? true : z12);
                    }
                }
                m4(true);
            }
        }
        objArr = false;
        this.r5 = false;
        this.s5 = false;
        j10 = this.f1;
        String str52 = "";
        org.telegram.ui.ActionBar.n5[] n5VarArr42 = this.r;
        if (j10 == 0) {
        }
        m4(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n4(int i10, float f7, boolean z10) {
        float scaleX;
        float f10;
        FrameLayout.LayoutParams layoutParams;
        int i11;
        ValueAnimator valueAnimator;
        float f11 = this.R1;
        float V3 = V3();
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.f;
        if (f11 > V3 || ((valueAnimator = this.k2) != null && valueAnimator.isRunning())) {
            scaleX = n5VarArr[1].getScaleX();
        } else {
            if (f7 < 1.0f) {
                f10 = 1.12f;
                scaleX = 1.0f;
                int dp = !AndroidUtilities.isTablet() ? AndroidUtilities.dp(490.0f) : AndroidUtilities.displaySize.x;
                int i12 = !this.O0 ? 48 : 0;
                if (this.M0) {
                    i12 += 48;
                }
                if (this.N0) {
                    i12 += 48;
                }
                if (this.V0 != null) {
                    i12 += 48;
                }
                int dp2 = dp - AndroidUtilities.dp((((1.0f - this.G5) * i12) + 40.0f) + ((!this.H1 ? 109 : 47) + 8));
                int i13 = (int) (dp2 / (i10 == 0 ? scaleX : 1.0f));
                int B = i10 == 0 ? i10 : org.telegram.messenger.sl.B(18.0f, 2, dp);
                if (i10 == 0) {
                    i10 = (int) (B / f10);
                }
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.i;
                int lerp = AndroidUtilities.lerp(i13, i10, bsVar.getInterpolation(f7));
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) n5VarArr[1].getLayoutParams();
                int i14 = layoutParams2.width;
                layoutParams2.width = (int) Math.ceil(lerp);
                if (z10) {
                    layoutParams2.width = Math.min(layoutParams2.width, (int) (((dp - AndroidUtilities.dp(18.0f)) / n5VarArr[1].getScaleX()) - (n5VarArr[1].getTranslationX() + layoutParams2.leftMargin)));
                }
                if (z10 && layoutParams2.width != i14) {
                    n5VarArr[1].requestLayout();
                }
                int lerp2 = AndroidUtilities.lerp(dp2, B, bsVar.getInterpolation(f7));
                org.telegram.ui.ActionBar.n5[] n5VarArr2 = this.r;
                layoutParams = (FrameLayout.LayoutParams) n5VarArr2[1].getLayoutParams();
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
                i11 = layoutParams.width;
                int ceil = (int) Math.ceil(lerp2);
                layoutParams.width = ceil;
                layoutParams3.width = ceil;
                if (i11 == layoutParams.width) {
                    n5VarArr2[2].getLayoutParams().width = layoutParams.width;
                    n5VarArr2[2].requestLayout();
                    n5VarArr2[3].getLayoutParams().width = layoutParams.width;
                    n5VarArr2[3].requestLayout();
                    n5VarArr2[1].requestLayout();
                    this.s.requestLayout();
                    return;
                }
                return;
            }
            scaleX = Math.max(n5VarArr[1].getScaleX(), 1.12f);
        }
        f10 = scaleX;
        if (!AndroidUtilities.isTablet()) {
        }
        if (!this.O0) {
        }
        if (this.M0) {
        }
        if (this.N0) {
        }
        if (this.V0 != null) {
        }
        int dp22 = dp - AndroidUtilities.dp((((1.0f - this.G5) * i12) + 40.0f) + ((!this.H1 ? 109 : 47) + 8));
        int i132 = (int) (dp22 / (i10 == 0 ? scaleX : 1.0f));
        if (i10 == 0) {
        }
        if (i10 == 0) {
        }
        org.telegram.ui.Components.bs bsVar2 = org.telegram.ui.Components.bs.i;
        int lerp3 = AndroidUtilities.lerp(i132, i10, bsVar2.getInterpolation(f7));
        FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) n5VarArr[1].getLayoutParams();
        int i142 = layoutParams22.width;
        layoutParams22.width = (int) Math.ceil(lerp3);
        if (z10) {
        }
        if (z10) {
            n5VarArr[1].requestLayout();
        }
        int lerp22 = AndroidUtilities.lerp(dp22, B, bsVar2.getInterpolation(f7));
        org.telegram.ui.ActionBar.n5[] n5VarArr22 = this.r;
        layoutParams = (FrameLayout.LayoutParams) n5VarArr22[1].getLayoutParams();
        FrameLayout.LayoutParams layoutParams32 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        i11 = layoutParams.width;
        int ceil2 = (int) Math.ceil(lerp22);
        layoutParams.width = ceil2;
        layoutParams32.width = ceil2;
        if (i11 == layoutParams.width) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0b5f, code lost:
    
        if ((V3() + (r1 + r2)) < r15.a.getMeasuredHeight()) goto L683;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0176, code lost:
    
        if (org.telegram.messenger.MessagesController.ChannelRecommendations.hasRecommendations(r15.currentAccount, r9) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e5, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationToBeDeprecated) == false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0b28  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0b34  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0b1a  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0a5b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n5() {
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
        ly0 ly0Var;
        org.telegram.ui.Components.ci0 ci0Var;
        org.telegram.ui.Components.vi0 vi0Var;
        int i11;
        boolean z11;
        TLRPC.UserFull userFull;
        boolean z12;
        TLRPC.UserFull userFull2;
        TL_payments.starRefProgram starrefprogram;
        org.telegram.ui.Cells.g6 g6Var;
        TLRPC.Chat chat;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull5;
        TLRPC.UserFull userFull4;
        TLRPC.ChatFull chatFull6;
        TLRPC.UserFull userFull5;
        TL_bots.BotInfo botInfo;
        TLRPC.UserFull userFull6;
        TLRPC.UserFull userFull7;
        k5(false);
        int i12 = this.O2;
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
        this.K4 = (this.f1 == 0 || (userFull7 = this.w2) == null || userFull7.wallet_card == null || (this.r0 != null && !this.t1)) ? false : true;
        this.M4 = -1;
        this.N4 = -1;
        this.O4 = -1;
        ArrayList arrayList2 = this.S4;
        arrayList2.clear();
        ArrayList arrayList3 = this.T4;
        arrayList3.clear();
        org.telegram.ui.Components.pv0 pv0Var = this.R;
        if (pv0Var != null) {
            int[] iArr = pv0Var.c;
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
                long j10 = this.g1;
                if (j10 == 0 || !MessagesController.ChannelRecommendations.hasRecommendations(this.currentAccount, -j10)) {
                    if (this.s2) {
                        long j11 = this.f1;
                        if (j11 != 0) {
                        }
                    }
                }
                z10 = true;
            }
            if (this.f1 == 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f1));
                TLRPC.UserFull userFull8 = this.w2;
                if (userFull8 != null && userFull8.saved_music != null && (this.r0 == null || this.t1)) {
                    this.J4 = true;
                }
                if (this.B3 < 0 && this.C3 < 0) {
                    if (this.J4 || this.K4 || this.S5 != null || this.a0 == null) {
                        int i14 = this.O2;
                        this.O2 = i14 + 1;
                        this.C3 = i14;
                    } else {
                        int i15 = this.O2;
                        this.O2 = i15 + 1;
                        this.B3 = i15;
                    }
                }
                if (!UserObject.isUserSelf(user) || this.t1) {
                    String publicUsername = UserObject.getPublicUsername(user);
                    TLRPC.UserFull userFull9 = this.w2;
                    boolean z14 = ((userFull9 == null || TextUtils.isEmpty(userFull9.about)) && (user == null || TextUtils.isEmpty(publicUsername))) ? false : true;
                    boolean z15 = (user == null || (TextUtils.isEmpty(user.phone) && TextUtils.isEmpty(this.f5))) ? false : true;
                    if (!this.s2 && (userFull3 = this.w2) != null && userFull3.unofficial_security_risk) {
                        int i16 = this.O2;
                        this.k4 = i16;
                        this.O2 = i16 + 2;
                        this.l4 = i16 + 1;
                    }
                    TLRPC.UserFull userFull10 = this.w2;
                    if (userFull10 != null && (userFull10.flags2 & 64) != 0 && (((g6Var = this.x2) == null || !g6Var.c || !g6Var.d.isEmpty()) && (chat = getMessagesController().getChat(Long.valueOf(this.w2.personal_channel_id))) != null && (ChatObject.isPublic(chat) || !ChatObject.isNotInChat(chat)))) {
                        int i17 = this.O2;
                        this.R2 = i17;
                        this.O2 = i17 + 2;
                        this.S2 = i17 + 1;
                    }
                    if (!this.s2 && (z15 || !z14)) {
                        int i18 = this.O2;
                        this.O2 = i18 + 1;
                        this.H3 = i18;
                    }
                    TLRPC.UserFull userFull11 = this.w2;
                    if (userFull11 != null && !TextUtils.isEmpty(userFull11.about)) {
                        int i19 = this.O2;
                        this.O2 = i19 + 1;
                        this.K3 = i19;
                    }
                    if (user != null && publicUsername != null) {
                        int i20 = this.O2;
                        this.O2 = i20 + 1;
                        this.M3 = i20;
                    }
                    TLRPC.UserFull userFull12 = this.w2;
                    if (userFull12 != null) {
                        if (userFull12.birthday != null) {
                            int i21 = this.O2;
                            this.O2 = i21 + 1;
                            this.V2 = i21;
                        }
                        if (userFull12.business_work_hours != null) {
                            int i22 = this.O2;
                            this.O2 = i22 + 1;
                            this.P3 = i22;
                        }
                        if (userFull12.business_location != null) {
                            int i23 = this.O2;
                            this.O2 = i23 + 1;
                            this.Q3 = i23;
                        }
                        if (userFull12.note != null) {
                            int i24 = this.O2;
                            this.O2 = i24 + 1;
                            this.I3 = i24;
                        }
                    }
                    if (this.a0 == null && this.f1 != getUserConfig().getClientUserId()) {
                        int i25 = this.O2;
                        this.O2 = i25 + 1;
                        this.O3 = i25;
                    }
                    boolean z16 = this.s2;
                    if (z16 && user != null && user.bot_has_main_app) {
                        int i26 = this.O2;
                        this.O2 = i26 + 1;
                        this.j4 = i26;
                    }
                    int i27 = this.O2;
                    int i28 = i27 + 1;
                    this.O2 = i28;
                    this.S3 = i27;
                    if (user != null && user.linked_community_id != 0) {
                        this.m4 = i28;
                        this.O2 = i27 + 3;
                        this.n4 = i27 + 2;
                    }
                    if (z16 && (userFull2 = this.w2) != null && (starrefprogram = userFull2.starref_program) != null && (starrefprogram.flags & 2) == 0 && getMessagesController().starrefConnectAllowed) {
                        int i29 = this.O2;
                        this.T3 = i29;
                        this.O2 = i29 + 2;
                        this.U3 = i29 + 1;
                    }
                    if (this.s2) {
                        if (this.t2 == null && getContext() != null) {
                            this.t2 = gi.u0.e(getContext(), this.currentAccount, this.f1);
                        }
                        if (this.u2 == null && getContext() != null) {
                            this.u2 = gi.r.c(getContext(), this.currentAccount, this.f1);
                        }
                        gi.u0 u0Var = this.t2;
                        boolean z17 = u0Var != null && u0Var.b();
                        gi.r rVar = this.u2;
                        boolean z18 = rVar != null && rVar.a();
                        TLRPC.UserFull userFull13 = this.w2;
                        if (userFull13 == null || !userFull13.bot_can_manage_emoji_status) {
                            if (!gi.r4.d((Activity) getContext(), this.currentAccount, this.f1)) {
                                z12 = false;
                                if (!z12 || z17 || z18) {
                                    int i30 = this.O2;
                                    int i31 = i30 + 1;
                                    this.O2 = i31;
                                    this.o4 = i30;
                                    if (z12) {
                                        this.O2 = i30 + 2;
                                        this.botPermissionEmojiStatus = i31;
                                    }
                                    if (z17) {
                                        int i32 = this.O2;
                                        this.O2 = i32 + 1;
                                        this.botPermissionLocation = i32;
                                    }
                                    if (z18) {
                                        int i33 = this.O2;
                                        this.O2 = i33 + 1;
                                        this.botPermissionBiometry = i33;
                                    }
                                    int i34 = this.O2;
                                    this.O2 = i34 + 1;
                                    this.q4 = i34;
                                }
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        int i302 = this.O2;
                        int i312 = i302 + 1;
                        this.O2 = i312;
                        this.o4 = i302;
                        if (z12) {
                        }
                        if (z17) {
                        }
                        if (z18) {
                        }
                        int i342 = this.O2;
                        this.O2 = i342 + 1;
                        this.q4 = i342;
                    }
                    TLRPC.EncryptedChat encryptedChat = this.E2;
                    if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                        int i35 = this.O2;
                        this.r4 = i35;
                        this.s4 = i35 + 1;
                        this.O2 = i35 + 3;
                        this.t4 = i35 + 2;
                    }
                    if (user != null && !this.s2 && encryptedChat == null && user.id != getUserConfig().getClientUserId() && this.l1) {
                        int i36 = this.O2;
                        this.M4 = i36;
                        this.O2 = i36 + 2;
                        this.O4 = i36 + 1;
                    }
                    if (user != null && user.bot) {
                        TLRPC.UserFull userFull14 = this.w2;
                        if (userFull14 != null && userFull14.can_view_revenue && ai.k0.g(this.currentAccount).i(this.f1) > 0) {
                            int i37 = this.O2;
                            this.O2 = i37 + 1;
                            this.D4 = i37;
                        }
                        if (ai.k0.g(this.currentAccount).c(this.f1).amount > 0 || !ai.k0.g(this.currentAccount).k(this.f1).a[0].isEmpty()) {
                            int i38 = this.O2;
                            this.O2 = i38 + 1;
                            this.C4 = i38;
                        }
                    }
                    if (user != null && this.s2 && !user.bot_nochats) {
                        int i39 = this.O2;
                        this.b4 = i39;
                        this.O2 = i39 + 2;
                        this.c4 = i39 + 1;
                    } else if (this.C4 >= 0) {
                        z11 = true;
                        if (!this.t1 && this.e5 && user != null && !user.contact && !user.bot && !UserObject.isService(user.id)) {
                            int i40 = this.O2;
                            this.O2 = i40 + 1;
                            this.a4 = i40;
                            z11 = true;
                        }
                        if (!this.t1 && this.b5 != 0 && this.c5 < 0 && ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(-this.c5)), 13)) {
                            int i41 = this.O2;
                            this.O2 = i41 + 1;
                            this.X3 = i41;
                            z11 = true;
                        }
                        if (!this.t1 || this.b5 == 0 || ContactsController.getInstance(this.currentAccount).isContact(this.f1)) {
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
                        if (!z10 || ((user != null && user.bot && user.bot_can_edit && user.bot_has_main_app) || (!((userFull = this.w2) == null || userFull.common_chats_count == 0) || this.t1))) {
                            int i44 = this.O2;
                            this.O2 = i44 + 1;
                            this.L4 = i44;
                        } else if (this.O4 == -1 && this.p1) {
                            int i45 = this.O2;
                            this.V3 = i45;
                            this.O2 = i45 + 2;
                            this.O4 = i45 + 1;
                        }
                    }
                    z11 = false;
                    if (!this.t1) {
                        int i402 = this.O2;
                        this.O2 = i402 + 1;
                        this.a4 = i402;
                        z11 = true;
                    }
                    if (!this.t1) {
                        int i412 = this.O2;
                        this.O2 = i412 + 1;
                        this.X3 = i412;
                        z11 = true;
                    }
                    if (this.t1) {
                    }
                    z13 = z11;
                    if (z13) {
                    }
                    if (z10) {
                    }
                    int i442 = this.O2;
                    this.O2 = i442 + 1;
                    this.L4 = i442;
                } else {
                    if (this.K2 == null) {
                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                        if (userProfilePhoto != null) {
                            TLRPC.FileLocation fileLocation = userProfilePhoto.photo_big;
                            if (!(fileLocation instanceof TLRPC.TL_fileLocation_layer97)) {
                            }
                        }
                        wy0 wy0Var = this.o0;
                        if (wy0Var == null || wy0Var.getRealCount() == 0) {
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
                    Set<String> set = getMessagesController().pendingSuggestions;
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
                    if (getMessagesController().filtersEnabled || !getMessagesController().dialogFilters.isEmpty()) {
                        int i52 = this.O2;
                        this.O2 = i52 + 1;
                        this.l3 = i52;
                    }
                    int i53 = this.O2;
                    this.o3 = i53;
                    this.h3 = i53 + 1;
                    this.O2 = i53 + 3;
                    this.p3 = i53 + 2;
                    if (!getMessagesController().premiumFeaturesBlocked()) {
                        int i54 = this.O2;
                        this.O2 = i54 + 1;
                        this.d4 = i54;
                    }
                    if (getMessagesController().starsPurchaseAvailable()) {
                        int i55 = this.O2;
                        this.O2 = i55 + 1;
                        this.e4 = i55;
                    }
                    ai.ha.y(this.currentAccount, true).p();
                    if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (ai.ha.y(this.currentAccount, true).e && (ai.ha.y(this.currentAccount, true).N() || ai.ha.y(this.currentAccount, true).p().positive()))) {
                        int i56 = this.O2;
                        this.O2 = i56 + 1;
                        this.f4 = i56;
                    }
                    if (!getMessagesController().premiumFeaturesBlocked()) {
                        int i57 = this.O2;
                        this.O2 = i57 + 1;
                        this.g4 = i57;
                    }
                    if (!getMessagesController().premiumPurchaseBlocked()) {
                        int i58 = this.O2;
                        this.O2 = i58 + 1;
                        this.h4 = i58;
                    }
                    if (this.d4 >= 0 || this.e4 >= 0 || this.f4 >= 0 || this.g4 >= 0 || this.h4 >= 0) {
                        int i59 = this.O2;
                        this.O2 = i59 + 1;
                        this.i4 = i59;
                    }
                    int i60 = this.O2;
                    this.q3 = i60;
                    this.r3 = i60 + 1;
                    this.s3 = i60 + 2;
                    int i61 = i60 + 4;
                    this.O2 = i61;
                    this.t3 = i60 + 3;
                    if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
                        this.u3 = i61;
                        this.O2 = i60 + 6;
                        this.v3 = i60 + 5;
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        int i62 = this.O2;
                        this.w3 = i62;
                        this.x3 = i62 + 1;
                        this.O2 = i62 + 3;
                        this.y3 = i62 + 2;
                    }
                    if (BuildVars.DEBUG_VERSION) {
                        int i63 = this.O2;
                        this.O2 = i63 + 1;
                        this.z3 = i63;
                    }
                    int i64 = this.O2;
                    this.O2 = i64 + 1;
                    this.A3 = i64;
                }
            } else if (this.r1) {
                if (this.B3 < 0 && this.C3 < 0) {
                    if (this.J4 || this.K4 || this.S5 != null || this.a0 == null) {
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
                    this.O2 = i67 + 2;
                    this.R3 = i68;
                }
                int i69 = this.O2;
                int i70 = i69 + 1;
                this.O2 = i70;
                this.S3 = i69;
                if (z10) {
                    this.O2 = i69 + 2;
                    this.L4 = i70;
                }
            } else if (this.g1 != 0) {
                TLRPC.ChatFull chatFull7 = this.v2;
                if ((chatFull7 != null && (!TextUtils.isEmpty(chatFull7.about) || (this.v2.location instanceof TLRPC.TL_channelLocation))) || ChatObject.isPublic(this.F2)) {
                    if (this.B3 < 0 && this.C3 < 0) {
                        if (this.J4 || this.K4 || this.S5 != null || this.a0 == null) {
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
                    if (ChatObject.isPublic(this.F2)) {
                        int i76 = this.O2;
                        this.O2 = i76 + 1;
                        this.M3 = i76;
                    }
                }
                if (this.B3 < 0 && this.C3 < 0) {
                    if (this.J4 || this.K4 || this.S5 != null || this.a0 == null) {
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
                    this.O2 = i81 + 1;
                    this.S3 = i81;
                }
                TLRPC.Chat chat2 = this.F2;
                if (chat2 != null && chat2.linked_community_id != 0) {
                    int i82 = this.O2;
                    this.m4 = i82;
                    this.O2 = i82 + 2;
                    this.n4 = i82 + 1;
                }
                if (ChatObject.isChannel(chat2)) {
                    TLRPC.Chat chat3 = this.F2;
                    if (!chat3.megagroup) {
                        TLRPC.ChatFull chatFull9 = this.v2;
                        if (chatFull9 != null && (chat3.creator || chatFull9.can_view_participants)) {
                            if (this.a0 == null) {
                                int i83 = this.O2;
                                this.O2 = i83 + 1;
                                this.u4 = i83;
                            }
                            int i84 = this.O2;
                            int i85 = i84 + 1;
                            this.O2 = i85;
                            this.y4 = i84;
                            if (chatFull9.requests_pending > 0) {
                                this.O2 = i84 + 2;
                                this.z4 = i85;
                            }
                            int i86 = this.O2;
                            int i87 = i86 + 1;
                            this.O2 = i87;
                            this.A4 = i86;
                            if (chatFull9.banned_count != 0 || chatFull9.kicked_count != 0) {
                                this.O2 = i86 + 2;
                                this.H4 = i87;
                            }
                            if ((chatFull9.can_view_stars_revenue && (ai.k0.g(this.currentAccount).c(-this.g1).amount > 0 || !ai.k0.g(this.currentAccount).k(-this.g1).a[0].isEmpty())) || ((chatFull4 = this.v2) != null && chatFull4.can_view_revenue && ai.k0.g(this.currentAccount).i(-this.g1) > 0)) {
                                int i88 = this.O2;
                                this.O2 = i88 + 1;
                                this.E4 = i88;
                            }
                            int i89 = this.O2;
                            this.B4 = i89;
                            this.O2 = i89 + 2;
                            this.F4 = i89 + 1;
                        }
                        if (ChatObject.isChannel(this.F2)) {
                            TLRPC.ChatFull chatFull10 = this.v2;
                            if (chatFull10 != null) {
                                if (this.r1 || (chatParticipants = chatFull10.participants) == null || chatParticipants.participants == null || (chatParticipants instanceof TLRPC.TL_chatParticipantsForbidden)) {
                                    if (!ChatObject.isNotInChat(this.F2) && ChatObject.canAddUsers(this.F2) && this.v2.participants_hidden) {
                                        int i90 = this.O2;
                                        this.x4 = i90;
                                        this.O2 = i90 + 2;
                                        this.I4 = i90 + 1;
                                    }
                                    rz0 rz0Var = this.O;
                                    if (rz0Var != null) {
                                        rz0Var.r1();
                                    }
                                } else {
                                    if (ChatObject.canAddUsers(this.F2) || (tL_chatBannedRights = this.F2.default_banned_rights) == null || !tL_chatBannedRights.invite_users) {
                                        int i91 = this.O2;
                                        this.O2 = i91 + 1;
                                        this.x4 = i91;
                                    }
                                    if (this.v2.participants.participants.size() <= 5 || !z10) {
                                        if (this.x4 == -1 && this.a0 == null) {
                                            int i92 = this.O2;
                                            this.O2 = i92 + 1;
                                            this.u4 = i92;
                                        }
                                        int i93 = this.O2;
                                        this.v4 = i93;
                                        int size = this.v2.participants.participants.size() + i93;
                                        this.w4 = size;
                                        this.O2 = size + 1;
                                        this.I4 = size;
                                        arrayList2.addAll(this.v2.participants.participants);
                                        ArrayList arrayList4 = this.D2;
                                        if (arrayList4 != null) {
                                            arrayList3.addAll(arrayList4);
                                        }
                                        rz0 rz0Var2 = this.O;
                                        if (rz0Var2 != null) {
                                            rz0Var2.d1(null, null);
                                        }
                                    } else {
                                        if (this.x4 != -1) {
                                            int i94 = this.O2;
                                            this.O2 = i94 + 1;
                                            this.I4 = i94;
                                        }
                                        rz0 rz0Var3 = this.O;
                                        if (rz0Var3 != null) {
                                            rz0Var3.d1(this.D2, this.v2);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (this.r1 || (chatFull3 = this.v2) == null || !this.F2.megagroup || (chatParticipants2 = chatFull3.participants) == null || (arrayList = chatParticipants2.participants) == null || arrayList.isEmpty()) {
                                if (!ChatObject.isNotInChat(this.F2) && ChatObject.canAddUsers(this.F2) && (chatFull2 = this.v2) != null && chatFull2.participants_hidden) {
                                    int i95 = this.O2;
                                    this.x4 = i95;
                                    this.O2 = i95 + 2;
                                    this.I4 = i95 + 1;
                                }
                                rz0 rz0Var4 = this.O;
                                if (rz0Var4 != null) {
                                    rz0Var4.r1();
                                }
                            } else {
                                if (!ChatObject.isNotInChat(this.F2) && ChatObject.canAddUsers(this.F2) && this.v2.participants_count < getMessagesController().maxMegagroupCount) {
                                    int i96 = this.O2;
                                    this.O2 = i96 + 1;
                                    this.x4 = i96;
                                }
                                int size2 = this.v2.participants.participants.size();
                                if ((size2 <= 5 || !z10 || this.U4 == 1) && this.U4 != 2) {
                                    if (this.x4 == -1 && this.a0 == null) {
                                        int i97 = this.O2;
                                        this.O2 = i97 + 1;
                                        this.u4 = i97;
                                    }
                                    int i98 = this.O2;
                                    this.v4 = i98;
                                    int i99 = i98 + size2;
                                    this.w4 = i99;
                                    this.O2 = i99 + 1;
                                    this.I4 = i99;
                                    arrayList2.addAll(this.v2.participants.participants);
                                    ArrayList arrayList5 = this.D2;
                                    if (arrayList5 != null) {
                                        arrayList3.addAll(arrayList5);
                                    }
                                    this.U4 = 1;
                                    rz0 rz0Var5 = this.O;
                                    if (rz0Var5 != null) {
                                        rz0Var5.d1(null, null);
                                    }
                                } else {
                                    if (this.x4 != -1) {
                                        int i100 = this.O2;
                                        this.O2 = i100 + 1;
                                        this.I4 = i100;
                                    }
                                    if (this.O != null) {
                                        if (!this.D2.isEmpty()) {
                                            this.U4 = 2;
                                        }
                                        this.O.d1(this.D2, this.v2);
                                    }
                                }
                            }
                            if (this.O4 == -1) {
                                TLRPC.Chat chat4 = this.F2;
                                if (chat4.left && !chat4.kicked) {
                                    long j12 = MessagesController.getNotificationsSettings(this.currentAccount).getLong("dialog_join_requested_time_" + this.j1, -1L);
                                    if (j12 <= 0 || System.currentTimeMillis() - j12 >= 120000) {
                                        org.telegram.ui.Components.ci0 ci0Var2 = this.a0;
                                        if (ci0Var2 == null || !ci0Var2.f()) {
                                            int i101 = this.O2;
                                            this.N4 = i101;
                                            this.O2 = i101 + 2;
                                            this.O4 = i101 + 1;
                                        }
                                        if (z10) {
                                            int i102 = this.O2;
                                            this.O2 = i102 + 1;
                                            this.L4 = i102;
                                        }
                                        if (this.L4 == -1) {
                                            int i103 = this.O2;
                                            this.O2 = i103 + 1;
                                            this.D3 = i103;
                                        }
                                        if (this.actionBar != null) {
                                            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                                        } else {
                                            i10 = 0;
                                        }
                                        if (this.a != null && i12 <= this.O2) {
                                            i11 = this.F0;
                                            if (i11 != 0) {
                                            }
                                            ly0Var = this.a;
                                            if (ly0Var != null) {
                                                ly0Var.setTranslateSelectorPosition(this.P3);
                                            }
                                            ci0Var = this.a0;
                                            if (ci0Var != null) {
                                                ci0Var.o(7, z13);
                                            }
                                            vi0Var = this.c0;
                                            if (vi0Var != null) {
                                                TLRPC.UserFull userFull15 = this.w2;
                                                if (userFull15 != null) {
                                                    vi0Var.setMusicDocument(userFull15.saved_music);
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
                                        ly0Var = this.a;
                                        if (ly0Var != null) {
                                        }
                                        ci0Var = this.a0;
                                        if (ci0Var != null) {
                                        }
                                        vi0Var = this.c0;
                                        if (vi0Var != null) {
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
                            i11 = this.F0;
                            if (i11 != 0) {
                            }
                            ly0Var = this.a;
                            if (ly0Var != null) {
                            }
                            ci0Var = this.a0;
                            if (ci0Var != null) {
                            }
                            vi0Var = this.c0;
                            if (vi0Var != null) {
                            }
                        }
                        this.D0 = 0;
                        ly0Var = this.a;
                        if (ly0Var != null) {
                        }
                        ci0Var = this.a0;
                        if (ci0Var != null) {
                        }
                        vi0Var = this.c0;
                        if (vi0Var != null) {
                        }
                    }
                }
                TLRPC.ChatFull chatFull11 = this.v2;
                if ((chatFull11 != null && chatFull11.can_view_stars_revenue && (ai.k0.g(this.currentAccount).c(-this.g1).amount > 0 || !ai.k0.g(this.currentAccount).k(-this.g1).a[0].isEmpty())) || ((chatFull = this.v2) != null && chatFull.can_view_revenue && ai.k0.g(this.currentAccount).i(-this.g1) > 0)) {
                    int i104 = this.O2;
                    this.E4 = i104;
                    this.O2 = i104 + 2;
                    this.F4 = i104 + 1;
                }
                if (ChatObject.isChannel(this.F2)) {
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
                ly0Var = this.a;
                if (ly0Var != null) {
                }
                ci0Var = this.a0;
                if (ci0Var != null) {
                }
                vi0Var = this.c0;
                if (vi0Var != null) {
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
            ly0Var = this.a;
            if (ly0Var != null) {
            }
            ci0Var = this.a0;
            if (ci0Var != null) {
            }
            vi0Var = this.c0;
            if (vi0Var != null) {
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
        if (this.f1 == 0) {
        }
        z13 = false;
        if (this.L4 == -1) {
        }
        if (this.actionBar != null) {
        }
        if (this.a != null) {
        }
        this.D0 = 0;
        ly0Var = this.a;
        if (ly0Var != null) {
        }
        ci0Var = this.a0;
        if (ci0Var != null) {
        }
        vi0Var = this.c0;
        if (vi0Var != null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean needDelayOpenAnimation() {
        return this.K1 == 0;
    }

    public final void o5() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.k0 == null || (imageView = this.l0) == null) {
            return;
        }
        if (!this.M1 || (chat = this.F2) == null || (chat.flags2 & 2048) == 0) {
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

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.e50 e50Var = this.r0;
        if (e50Var != null) {
            e50Var.h(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        super.onBecomeFullyHidden();
        this.Z5 = false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        u5();
        this.Z5 = true;
        H3();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        org.telegram.ui.Components.vi0 vi0Var;
        org.telegram.ui.Components.ci0 ci0Var;
        super.onConfigurationChanged(configuration);
        rz0 rz0Var = this.O;
        if (rz0Var != null) {
            rz0Var.onConfigurationChanged(configuration);
        }
        h4();
        if (this.o2 && (ci0Var = this.a0) != null) {
            ci0Var.i();
        }
        if (this.o2 && (vi0Var = this.c0) != null) {
            vi0Var.c();
        }
        if (this.o2 && this.q2 && (m10 = this.c.m(0)) != null) {
            this.a.scrollBy(0, m10.getTop() - V3());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new vh(this, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0881  */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        boolean z11;
        x01 x01Var;
        org.telegram.ui.ActionBar.u0 u0Var;
        Object obj;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.u0 k10;
        org.telegram.ui.ActionBar.n5[] n5VarArr;
        float f10;
        ai.j1 j1Var;
        org.telegram.ui.ActionBar.u0 u0Var2;
        float f11;
        vy0 vy0Var;
        org.telegram.ui.Components.bh bhVar;
        boolean z12;
        TLRPC.Chat chat;
        yw ywVar;
        if (!this.J0) {
            n5();
            if (this.K1 != 0 && this.N1 && !this.q2 && !this.O1) {
                ImageView imageView = this.j0;
                float f12 = 1.0f;
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
                org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
                int i10 = 2;
                if (h5Var != null && h5Var.getFragmentStack().size() >= 2) {
                    Object obj2 = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    if (obj2 instanceof org.telegram.ui.Components.bh) {
                        this.i5 = (org.telegram.ui.Components.bh) obj2;
                    }
                    if ((obj2 instanceof ey) && (ywVar = ((ey) obj2).G3) != null) {
                        fx fxVar = ywVar.a;
                        if (com.google.android.gms.internal.play_billing.k3.s(fxVar)) {
                            this.i5 = fxVar;
                        }
                    }
                }
                Object obj3 = this.i5;
                if (obj3 instanceof sn) {
                    kVar = ((org.telegram.ui.ActionBar.o2) obj3).getActionBar();
                    kVar.setSkipDrawChild(true);
                } else {
                    kVar = null;
                }
                org.telegram.ui.Components.bh bhVar2 = this.i5;
                boolean z13 = (bhVar2 instanceof sn) && ((sn) bhVar2).e != null;
                if (bhVar2 != null) {
                    ImageView imageView5 = this.j0;
                    if (imageView5 != null) {
                        if (!(bhVar2 instanceof sn) || (chat = ((sn) bhVar2).e) == null || chat.linked_community_id == 0) {
                            imageView5.setTag(null);
                            this.j0.setVisibility(8);
                        } else {
                            imageView5.setTag(1);
                            this.j0.setVisibility(0);
                        }
                    }
                    if (this.m0 != null) {
                        org.telegram.ui.Components.bh bhVar3 = this.i5;
                        if ((bhVar3 instanceof sn) && ChatObject.isMonoForum(((sn) bhVar3).e)) {
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
                                    if (!this.L1 || this.w2.ttl_period == 0) {
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
                                        if (!this.L1 || this.v2.ttl_period == 0) {
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
                    o5();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(this.K1 == 2 ? 250L : 180L);
                this.a.setLayerType(2, null);
                org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
                if (m10.k(10) == null && this.Q0 == null) {
                    this.Q0 = m10.a(10, R.drawable.ic_ab_other);
                }
                org.telegram.ui.ActionBar.n5[] n5VarArr2 = this.f;
                org.telegram.ui.ActionBar.n5[] n5VarArr3 = this.r;
                if (z10) {
                    this.Q5 = 0.0f;
                    int i11 = 0;
                    while (i11 < 2) {
                        i11++;
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n5VarArr3[i11].getLayoutParams();
                        layoutParams.rightMargin = (int) ((AndroidUtilities.density * (-21.0f)) + AndroidUtilities.dp(8.0f));
                        n5VarArr3[i11].setLayoutParams(layoutParams);
                        f12 = f12;
                    }
                    float f13 = f12;
                    if (this.K1 != 2) {
                        int ceil = (int) Math.ceil((AndroidUtilities.density * 21.0f) + (AndroidUtilities.displaySize.x - AndroidUtilities.dp(117.0f)));
                        float measureText = (n5VarArr2[1].getPaint().measureText(n5VarArr2[1].getText().toString()) * 1.12f) + n5VarArr2[1].getSideDrawablesSize();
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) n5VarArr2[1].getLayoutParams();
                        if (ceil < measureText) {
                            n5VarArr = n5VarArr2;
                            layoutParams2.width = (int) Math.ceil(r5 / 1.12f);
                        } else {
                            n5VarArr = n5VarArr2;
                            layoutParams2.width = -2;
                        }
                        n5VarArr[1].setLayoutParams(layoutParams2);
                        this.S1 = V3();
                    } else {
                        n5VarArr = n5VarArr2;
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) n5VarArr[1].getLayoutParams();
                        layoutParams3.width = (int) ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(32.0f)) / 1.38f);
                        n5VarArr[1].setLayoutParams(layoutParams3);
                    }
                    this.fragmentView.setBackgroundColor(0);
                    setAvatarAnimationProgress(0.0f);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 0.0f, 1.0f));
                    org.telegram.ui.Components.bk0 bk0Var = this.v;
                    if (bk0Var != null && bk0Var.getTag() == null) {
                        this.v.setScaleX(0.2f);
                        this.v.setScaleY(0.2f);
                        this.v.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.bk0, Float>) View.SCALE_X, f13));
                        arrayList.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.bk0, Float>) View.SCALE_Y, f13));
                        arrayList.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.bk0, Float>) View.ALPHA, f13));
                    }
                    yy0 yy0Var = this.v0;
                    if (yy0Var != null && this.K1 == 2) {
                        yy0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.v0, (Property<yy0, Float>) View.ALPHA, f13));
                    }
                    if (this.K1 == 2) {
                        this.s0 = R3(this.f0.getImageReceiver());
                        n5VarArr[1].setTextColor(-1);
                        n5VarArr3[1].setTextColor(-1275068417);
                        this.actionBar.A(1090519039, false);
                        r01 r01Var = this.h6;
                        if (r01Var != null) {
                            r01Var.a(603979775);
                        }
                        g01 g01Var = this.N;
                        g01Var.E = true;
                        g01Var.setVisibility(0);
                    }
                    int i12 = 0;
                    while (i12 < 2) {
                        n5VarArr[i12].setAlpha(i12 == 0 ? f13 : 0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(n5VarArr[i12], (Property<org.telegram.ui.ActionBar.n5, Float>) View.ALPHA, i12 == 0 ? 0.0f : f13));
                        i12++;
                    }
                    if (this.v0 != null) {
                        if (a() > 0) {
                            this.v0.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.v0, (Property<yy0, Float>) View.ALPHA, f13));
                        } else {
                            f10 = f13;
                            this.v0.setAlpha(f10);
                            this.v0.setFragmentTransitionProgress(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.v0, "fragmentTransitionProgress", f10));
                            j1Var = this.w0;
                            if (j1Var != null) {
                                j1Var.setAlpha(0.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.w0, (Property<ai.j1, Float>) View.ALPHA, f10));
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
                            u0Var2 = this.Q0;
                            if (u0Var2 != null) {
                                u0Var2.setAlpha(1.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.u0, Float>) View.ALPHA, 0.0f));
                            }
                            if (this.M0 && (this.g1 != 0 || z13)) {
                                this.R0.setAlpha(0.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.u0, Float>) View.ALPHA, 1.0f));
                            }
                            if (this.N0) {
                                this.S0.setAlpha(0.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.u0, Float>) View.ALPHA, 1.0f));
                            }
                            if (this.O0) {
                                this.T0.setAlpha(0.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.T0, (Property<org.telegram.ui.ActionBar.u0, Float>) View.ALPHA, 1.0f));
                            }
                            if (this.Z0.getTag() == null) {
                                this.Z0.setAlpha(0.0f);
                                f11 = 1.0f;
                                arrayList.add(ObjectAnimator.ofFloat(this.Z0, (Property<ImageView, Float>) View.ALPHA, 1.0f));
                            } else {
                                f11 = 1.0f;
                            }
                            vy0Var = this.f0;
                            if (vy0Var != null) {
                                vy0Var.setCrossfadeProgress(f11);
                                arrayList.add(ObjectAnimator.ofFloat(this.f0, sz0.g0, 0.0f));
                            }
                            bhVar = this.i5;
                            if (bhVar == null) {
                                org.telegram.ui.Components.oo p5 = bhVar.p();
                                if (p5 != null) {
                                    org.telegram.ui.Components.ko koVar = p5.e;
                                    org.telegram.ui.Components.ow0 A = this.i5.A();
                                    RectF rectF = ih.k.h;
                                    ih.k.c(koVar, A, rectF);
                                    this.Q5 = rectF.left;
                                }
                                if ((p5 == null || !(p5.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.n5) || ((org.telegram.ui.ActionBar.n5) p5.getSubtitleTextView()).getLeftDrawable() == null) && !p5.S[0]) {
                                    z12 = false;
                                } else {
                                    this.Y4 = p5.getSubtitleTextView();
                                    this.Z.invalidate();
                                    n5VarArr3[0].setAlpha(0.0f);
                                    n5VarArr3[1].setAlpha(0.0f);
                                    arrayList.add(ObjectAnimator.ofFloat(n5VarArr3[1], (Property<org.telegram.ui.ActionBar.n5, Float>) View.ALPHA, 1.0f));
                                    z12 = true;
                                }
                                setAvatarAnimationProgress(0.0f);
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                int i13 = 0;
                                while (i13 < 2) {
                                    n5VarArr3[i13].setAlpha(i13 == 0 ? 1.0f : 0.0f);
                                    arrayList.add(ObjectAnimator.ofFloat(n5VarArr3[i13], (Property<org.telegram.ui.ActionBar.n5, Float>) View.ALPHA, i13 == 0 ? 0.0f : 1.0f));
                                    i13++;
                                }
                            }
                            animatorSet.playTogether(arrayList);
                        }
                    }
                    f10 = f13;
                    j1Var = this.w0;
                    if (j1Var != null) {
                    }
                    if (this.i0.getTag() != null) {
                    }
                    if (this.j0.getTag() != null) {
                    }
                    if (this.l0.getTag() != null) {
                    }
                    if (this.k0.getTag() != null) {
                    }
                    u0Var2 = this.Q0;
                    if (u0Var2 != null) {
                    }
                    if (this.M0) {
                        this.R0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.u0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.N0) {
                    }
                    if (this.O0) {
                    }
                    if (this.Z0.getTag() == null) {
                    }
                    vy0Var = this.f0;
                    if (vy0Var != null) {
                    }
                    bhVar = this.i5;
                    if (bhVar == null) {
                    }
                    if (!z12) {
                    }
                    animatorSet.playTogether(arrayList);
                } else {
                    this.S1 = this.R1;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 1.0f, 0.0f));
                    org.telegram.ui.Components.bk0 bk0Var2 = this.v;
                    if (bk0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(bk0Var2, (Property<org.telegram.ui.Components.bk0, Float>) View.SCALE_X, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.bk0, Float>) View.SCALE_Y, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.bk0, Float>) View.ALPHA, 0.0f));
                    }
                    int i14 = 0;
                    while (i14 < 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(n5VarArr2[i14], (Property<org.telegram.ui.ActionBar.n5, Float>) View.ALPHA, i14 == 0 ? 1.0f : 0.0f));
                        i14++;
                    }
                    yy0 yy0Var2 = this.v0;
                    if (yy0Var2 != null) {
                        if (this.j1 > 0) {
                            arrayList2.add(ObjectAnimator.ofFloat(yy0Var2, (Property<yy0, Float>) View.ALPHA, 0.0f));
                        } else {
                            arrayList2.add(ObjectAnimator.ofFloat(yy0Var2, "fragmentTransitionProgress", 0.0f));
                        }
                    }
                    ai.j1 j1Var2 = this.w0;
                    if (j1Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(j1Var2, (Property<ai.j1, Float>) View.ALPHA, 0.0f));
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
                    org.telegram.ui.ActionBar.u0 u0Var3 = this.Q0;
                    if (u0Var3 != null) {
                        u0Var3.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.u0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.M0 && (this.g1 != 0 || z13)) {
                        this.R0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.u0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.N0) {
                        this.S0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.u0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.O0) {
                        this.T0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.T0, (Property<org.telegram.ui.ActionBar.u0, Float>) View.ALPHA, 0.0f));
                    }
                    ImageView imageView6 = this.Z0;
                    if (imageView6 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) View.ALPHA, imageView6.getAlpha(), 0.0f));
                    }
                    vy0 vy0Var2 = this.f0;
                    if (vy0Var2 != null) {
                        f7 = 1.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(vy0Var2, sz0.g0, 1.0f));
                    } else {
                        f7 = 1.0f;
                    }
                    org.telegram.ui.ActionBar.o2 o2Var = this.parentLayout.getFragmentStack().size() > 1 ? (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) : null;
                    if (o2Var instanceof sn) {
                        sn snVar = (sn) o2Var;
                        hj hjVar = snVar.m1;
                        AndroidUtilities.doOnPreDraw(hjVar, new re0(this, hjVar, snVar, 26));
                        View subtitleTextView = hjVar.getSubtitleTextView();
                        if (((subtitleTextView instanceof org.telegram.ui.ActionBar.n5) && ((org.telegram.ui.ActionBar.n5) subtitleTextView).getLeftDrawable() != null) || hjVar.S[0]) {
                            this.Y4 = hjVar.getSubtitleTextView();
                            this.Z.invalidate();
                            org.telegram.ui.ActionBar.n5 n5Var = n5VarArr3[0];
                            Property property = View.ALPHA;
                            arrayList2.add(ObjectAnimator.ofFloat(n5Var, (Property<org.telegram.ui.ActionBar.n5, Float>) property, 0.0f));
                            arrayList2.add(ObjectAnimator.ofFloat(n5VarArr3[1], (Property<org.telegram.ui.ActionBar.n5, Float>) property, 0.0f));
                            z11 = true;
                            if (!z11) {
                                int i15 = 0;
                                while (i15 < 2) {
                                    arrayList2.add(ObjectAnimator.ofFloat(n5VarArr3[i15], (Property<org.telegram.ui.ActionBar.n5, Float>) View.ALPHA, i15 == 0 ? f7 : 0.0f));
                                    i15++;
                                }
                            }
                            animatorSet.playTogether(arrayList2);
                            x01Var = this.i6;
                            if (x01Var != null) {
                                x01Var.animate().alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                            }
                        }
                    }
                    z11 = false;
                    if (!z11) {
                    }
                    animatorSet.playTogether(arrayList2);
                    x01Var = this.i6;
                    if (x01Var != null) {
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new wx0(this, i10));
                animatorSet.playTogether(ofFloat);
                if (this.P0 == null || (obj = this.i5) == null || (yVar = ((org.telegram.ui.ActionBar.o2) obj).getActionBar().E) == null || (k10 = yVar.k(32)) == null || k10.getVisibility() != 0) {
                    u0Var = null;
                } else {
                    k10.setAlpha(0.0f);
                    if (z10) {
                        this.P0.setVisibility(0);
                    }
                    this.P0.setTag(k10);
                    u0Var = k10;
                }
                animatorSet.addListener(new hg.j0(this, kVar, u0Var, runnable, 5));
                animatorSet.setInterpolator(this.K1 == 2 ? org.telegram.ui.Components.bs.f : new DecelerateInterpolator());
                AndroidUtilities.runOnUIThread(new vt0(animatorSet, 4), 50L);
                return animatorSet;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onDialogDismiss(Dialog dialog) {
        ly0 ly0Var = this.a;
        if (ly0Var != null) {
            ly0Var.g1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x044f  */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        long clientUserId;
        org.telegram.ui.Components.pv0 pv0Var;
        f01 f01Var;
        this.f1 = this.arguments.getLong("user_id", 0L);
        this.g1 = this.arguments.getLong("chat_id", 0L);
        this.h1 = this.arguments.getLong("topic_id", 0L);
        this.i1 = this.arguments.getBoolean("saved", false);
        this.s1 = this.arguments.getBoolean("similar", false);
        this.r1 = this.h1 != 0;
        this.F1 = this.arguments.getLong("ban_chat_id", 0L);
        this.b5 = this.arguments.getInt("report_reaction_message_id", 0);
        this.c5 = this.arguments.getLong("report_reaction_from_dialog_id", 0L);
        this.e5 = this.arguments.getBoolean("show_add_to_contacts", true);
        this.f5 = jf.b.d(this.arguments.getString("vcard_phone"), false);
        this.g5 = this.arguments.getString("vcard_first_name");
        this.h5 = this.arguments.getString("vcard_last_name");
        this.m1 = this.arguments.getBoolean("reportSpam", false);
        this.t1 = this.arguments.getBoolean("my_profile", false);
        this.u1 = this.arguments.getBoolean("open_gifts", false);
        this.w1 = this.arguments.getBoolean("open_gifts_upgradable", false);
        this.v1 = this.arguments.getInt("open_gifts_collection", 0);
        this.y1 = this.arguments.getBoolean("open_common", false);
        this.z1 = this.arguments.getInt("open_story_album_id", -1);
        this.J0 = this.arguments.getBoolean("hasMainTabs", false);
        if (!this.o1) {
            boolean z10 = this.arguments.getBoolean("expandPhoto", false);
            this.o1 = z10;
            if (z10) {
                this.l2 = 1.0f;
                this.p1 = true;
            }
        }
        if (this.f1 == 0) {
            if (this.g1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.g1));
                this.F2 = chat;
                if (chat == null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    getMessagesStorage().getStorageQueue().postRunnable(new mv0(11, this, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (this.F2 != null) {
                        getMessagesController().putChat(this.F2, true);
                    }
                }
                FlagSecureReason flagSecureReason = this.Y1;
                if (flagSecureReason != null) {
                    flagSecureReason.invalidate();
                }
                if (this.F2.megagroup) {
                    T3(true);
                } else {
                    this.D1 = null;
                }
                getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
                getNotificationCenter().addObserver(this, NotificationCenter.chatOnlineCountDidLoad);
                getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.uploadStoryEnd);
                this.D2 = new ArrayList();
                l5(true);
                if (this.v2 == null) {
                    this.v2 = getMessagesController().getChatFull(this.g1);
                }
                if (ChatObject.isChannel(this.F2)) {
                    getMessagesController().loadFullChat(this.g1, this.classGuid, true);
                } else if (this.v2 == null) {
                    this.v2 = getMessagesStorage().loadChatInfo(this.g1, false, null, false, false);
                }
                e5();
                clientUserId = getUserConfig().getClientUserId();
                if (this.f1 != clientUserId) {
                }
                this.t1 = true;
                pv0Var = this.R;
                if (pv0Var != null) {
                    pv0Var.b(this);
                    this.R = null;
                }
                if (this.R == null) {
                }
                this.R.x.add(this);
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
                getNotificationCenter().addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
                getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
                getNotificationCenter().addObserver(this, NotificationCenter.channelRecommendationsLoaded);
                getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
                getNotificationCenter().addObserver(this, NotificationCenter.profileMusicUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.updatedChatRanks);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                n5();
                f01Var = this.d;
                if (f01Var != null) {
                }
                if (this.arguments.containsKey("preload_messages")) {
                }
                if (this.f1 != 0) {
                    getConnectionsManager().sendRequest(new TL_account.getPassword(), new ay0(this, 5));
                }
                setBulletinDelegate(new b9(this, 8));
                if (this.f1 != 0) {
                    getMessagesController().getContentSettings(null);
                }
                K4();
                this.p6 = !this.J0 ? AndroidUtilities.dp(72.0f) : 0;
                this.q6 = this.J0 ? AndroidUtilities.dp(64.0f) : 0;
                return true;
            }
            return false;
        }
        long j10 = this.arguments.getLong("dialog_id", 0L);
        this.j1 = j10;
        if (j10 != 0) {
            this.E2 = org.telegram.messenger.v0.l(getMessagesController(), this.j1);
        }
        FlagSecureReason flagSecureReason2 = this.Y1;
        if (flagSecureReason2 != null) {
            flagSecureReason2.invalidate();
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f1));
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
            this.l1 = getMessagesController().blockePeers.indexOfKey(this.f1) >= 0;
            if (user.bot) {
                this.s2 = true;
                MediaDataController mediaDataController = getMediaDataController();
                long j11 = user.id;
                mediaDataController.loadBotInfo(j11, j11, true, this.classGuid);
            }
            this.w2 = getMessagesController().getUserFull(this.f1);
            getMessagesController().loadFullUser(getMessagesController().getUser(Long.valueOf(this.f1)), this.classGuid, true);
            this.D1 = null;
            if (UserObject.isUserSelf(user)) {
                org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
                this.r0 = e50Var;
                e50Var.H = true;
                e50Var.a = this;
                e50Var.b = this;
                getMediaDataController().checkFeaturedStickers();
                getMessagesController().loadSuggestedFilters();
                getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, this.classGuid);
            }
            this.Z4 = this.arguments.getInt("actionBarColor", 0);
            clientUserId = getUserConfig().getClientUserId();
            if ((this.f1 != clientUserId || this.j1 == clientUserId) && !this.t1) {
                this.t1 = true;
            }
            pv0Var = this.R;
            if (pv0Var != null && pv0Var.s != this.h1) {
                pv0Var.b(this);
                this.R = null;
            }
            if (this.R == null) {
                this.R = new org.telegram.ui.Components.pv0(this);
            }
            this.R.x.add(this);
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
            getNotificationCenter().addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            getNotificationCenter().addObserver(this, NotificationCenter.channelRecommendationsLoaded);
            getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
            getNotificationCenter().addObserver(this, NotificationCenter.profileMusicUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.updatedChatRanks);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            n5();
            f01Var = this.d;
            if (f01Var != null) {
                f01Var.l();
            }
            if (this.arguments.containsKey("preload_messages")) {
                getMessagesController().ensureMessagesLoaded(this.f1, 0, null);
            }
            if (this.f1 != 0 && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(this.f1)))) {
                getConnectionsManager().sendRequest(new TL_account.getPassword(), new ay0(this, 5));
            }
            setBulletinDelegate(new b9(this, 8));
            if (this.f1 != 0 && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(this.f1))) && !this.t1) {
                getMessagesController().getContentSettings(null);
            }
            K4();
            this.p6 = !this.J0 ? AndroidUtilities.dp(72.0f) : 0;
            this.q6 = this.J0 ? AndroidUtilities.dp(64.0f) : 0;
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        rz0 rz0Var = this.O;
        if (rz0Var != null) {
            rz0Var.I0();
        }
        org.telegram.ui.Components.pv0 pv0Var = this.R;
        if (pv0Var != null) {
            pv0Var.b(this);
        }
        org.telegram.ui.Components.pv0 pv0Var2 = this.R;
        if (pv0Var2 != null) {
            pv0Var2.x.remove(this);
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
        getNotificationCenter().removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.channelRecommendationsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.profileMusicUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.updatedChatRanks);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        wy0 wy0Var = this.o0;
        if (wy0Var != null) {
            wy0Var.K();
        }
        org.telegram.ui.Components.fi0 fi0Var = this.n0;
        if (fi0Var != null) {
            fi0Var.e();
        }
        this.L5 = null;
        if (this.f1 != 0) {
            getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.reloadInterface);
            getMessagesController().cancelLoadFullUser(this.f1);
        } else if (this.g1 != 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatOnlineCountDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        }
        vy0 vy0Var = this.f0;
        if (vy0Var != null) {
            vy0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.e50 e50Var = this.r0;
        if (e50Var != null) {
            e50Var.d();
        }
        az0 az0Var = this.X4;
        if (az0Var != null) {
            az0Var.b();
        }
        u01 u01Var = this.z2;
        if (u01Var != null && this.y2) {
            u01Var.b(true);
            this.z2 = null;
        }
        org.telegram.messenger.s8 s8Var = this.z5;
        if (s8Var != null) {
            this.z5 = null;
            AndroidUtilities.runOnUIThread(s8Var);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        org.telegram.ui.Components.du0 du0Var;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.e50 e50Var = this.r0;
        if (e50Var != null) {
            e50Var.i();
        }
        FlagSecureReason flagSecureReason = this.Y1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        rz0 rz0Var = this.O;
        if (rz0Var == null || (du0Var = rz0Var.T) == null) {
            return;
        }
        du0Var.e = false;
        if (du0Var.c != null) {
            du0Var.a.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.e50 e50Var = this.r0;
        if (e50Var != null) {
            e50Var.j(i10, strArr, iArr);
        }
        if (i10 != 101 && i10 != 102) {
            if (i10 != 103 || this.F2 == null) {
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
                org.telegram.ui.Components.voip.d2.h(getParentActivity(), null, i10);
                return;
            } else {
                org.telegram.ui.Components.voip.d2.l(this.F2, null, getMessagesController().getGroupCall(this.g1, false) == null, null, getParentActivity(), this, getAccountInstance());
                return;
            }
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f1));
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
            org.telegram.ui.Components.voip.d2.h(getParentActivity(), null, i10);
            return;
        }
        boolean z12 = i10 == 102;
        TLRPC.UserFull userFull = this.w2;
        org.telegram.ui.Components.voip.d2.m(user, z12, userFull != null && userFull.video_calls_available, getParentActivity(), this.w2, getAccountInstance());
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        TLRPC.User user;
        e50 e50Var;
        super.onResume();
        rz0 rz0Var = this.O;
        if (rz0Var != null) {
            rz0Var.b1 = true;
            org.telegram.ui.Components.cu0 cu0Var = rz0Var.H;
            if (cu0Var != null) {
                cu0Var.l();
            }
            org.telegram.ui.Components.kv0 kv0Var = rz0Var.K;
            if (kv0Var != null) {
                kv0Var.l();
            }
            org.telegram.ui.Components.lv0 lv0Var = rz0Var.J;
            if (lv0Var != null) {
                lv0Var.X(false);
            }
            for (int i10 = 0; i10 < rz0Var.k0.length; i10++) {
                rz0Var.V(i10);
            }
            org.telegram.ui.Components.du0 du0Var = rz0Var.T;
            if (du0Var != null) {
                du0Var.e = true;
                if (du0Var.c != null) {
                    du0Var.a.onResume();
                }
            }
        }
        h4();
        f01 f01Var = this.d;
        if (f01Var != null) {
            this.V4 = true;
            f01Var.l();
        }
        if (!((ActionBarLayout) this.parentLayout).x() && (e50Var = this.U) != null && e50Var.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        org.telegram.ui.Components.e50 e50Var2 = this.r0;
        if (e50Var2 != null) {
            e50Var2.k();
            setParentActivityTitle(LocaleController.getString(R.string.Settings));
        }
        m5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new vh(this, 5));
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.f[1];
        if (n5Var != null) {
            setParentActivityTitle(n5Var.getText());
        }
        if (this.f1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.f1))) != null && user.photo == null && this.R1 >= V3()) {
            this.k2.cancel();
            float[] fArr = this.n2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            L4(1.0f);
            this.o0.setVisibility(8);
            this.R1 = V3();
            this.p2 = false;
            this.c.h1(0, V3() - this.a.getPaddingTop());
        }
        FlagSecureReason flagSecureReason = this.Y1;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        g5();
        m4(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.u6.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.A0));
            this.z0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.A0));
            V4();
            q5();
            y3();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (!z11) {
                int i10 = this.K1;
                if (i10 != 0 && this.N1) {
                    if (i10 == 1) {
                        this.l2 = 0.0f;
                        org.telegram.ui.Components.hx0 hx0Var = this.T;
                        if (hx0Var != null) {
                            hx0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.ci0 ci0Var = this.a0;
                        if (ci0Var != null) {
                            ci0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.vi0 vi0Var = this.c0;
                        if (vi0Var != null) {
                            vi0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.H1 = false;
                    C3();
                    if (this.J1) {
                        F3(true);
                    }
                }
                if (!this.n5) {
                    this.n5 = true;
                    this.W4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().onAnimationFinish(this.R4);
            e50 e50Var = this.U;
            if (e50Var != null && e50Var.getVisibility() == 0) {
                this.U.setVisibility(8);
                this.U.setBackground(null);
            }
        }
        this.I1 = false;
        D3();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        e50 e50Var = this.U;
        if (e50Var == null || e50Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.U.setAlpha(1.0f - f7);
        } else {
            this.U.setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        ImageView imageView;
        org.telegram.ui.Components.ci0 ci0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.O5 = z10;
        if (z10 && (ci0Var = this.a0) != null) {
            ArrayList arrayList = ci0Var.a;
            if (ci0Var.H == 6) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.ui.Components.zh0 zh0Var = (org.telegram.ui.Components.zh0) arrayList.get(i10);
                    org.telegram.ui.Components.yj0 yj0Var = zh0Var.k;
                    if (yj0Var != null) {
                        if (zh0Var.a == 15) {
                            yj0Var.M(14);
                        } else {
                            yj0Var.M(0);
                        }
                        zh0Var.k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.P0) != null && imageView.getTag() != null && (this.P0.getTag() instanceof org.telegram.ui.ActionBar.u0)) {
            ((org.telegram.ui.ActionBar.u0) this.P0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.K1 != 0 && this.N1 && !this.q2) {
            this.H1 = true;
            if (!z10) {
                if (this.L5 == null) {
                    this.L5 = new float[16];
                }
                this.G1 = this.R1;
                this.L5[0] = this.Y.getScaleX();
                this.L5[1] = this.Y.getTranslationX();
                this.L5[2] = this.Y.getTranslationY();
                org.telegram.ui.Components.ci0 ci0Var2 = this.a0;
                if (ci0Var2 != null) {
                    this.L5[3] = ci0Var2.getAlpha();
                }
                ai.j1 j1Var = this.w0;
                if (j1Var != null) {
                    float[] fArr = this.L5;
                    fArr[4] = j1Var.e;
                    fArr[5] = j1Var.f;
                }
                if (this.h6 != null) {
                    this.L5[6] = r3.getAlpha();
                }
                float[] fArr2 = this.L5;
                org.telegram.ui.ActionBar.n5[] n5VarArr = this.f;
                fArr2[7] = n5VarArr[1].getScaleX();
                this.L5[8] = n5VarArr[1].getTranslationY();
                float[] fArr3 = this.L5;
                org.telegram.ui.ActionBar.n5[] n5VarArr2 = this.r;
                fArr3[9] = n5VarArr2[1].getTranslationY();
                this.L5[10] = n5VarArr[1].getLayoutParams().width;
                this.L5[11] = this.d2;
                for (int i11 = 0; i11 < n5VarArr.length; i11++) {
                    org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[i11];
                    if (n5Var != null) {
                        int i12 = i11 * 2;
                        this.L5[i12 + 12] = n5Var.getTranslationX();
                        this.L5[i12 + 13] = n5VarArr2[i11].getTranslationX();
                    }
                }
                ei.x3 x3Var = this.j6;
                if (x3Var != null) {
                    x3Var.e(true);
                }
            }
        }
        if (z10) {
            if (this.r0 != null) {
                this.R4 = getNotificationCenter().setAnimationInProgress(this.R4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.needCheckSystemBarColors});
            } else {
                this.R4 = getNotificationCenter().setAnimationInProgress(this.R4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.needCheckSystemBarColors});
            }
            if (!z11 && getParentActivity() != null) {
                this.a5 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.I1 = true;
        D3();
    }

    public final void p4(boolean z10) {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f1));
        if (user == null) {
            return;
        }
        int i10 = 4;
        int i11 = 0;
        if (this.s2 && !MessagesController.isSupportUser(user)) {
            if (!this.l1 || z10) {
                org.telegram.ui.Components.f5.s(this, false, this.F2, user, this.E2 != null, true, false, true, new rx0(this, user));
                return;
            } else {
                getMessagesController().unblockPeer(this.f1, new ib0(this, i10));
                finishFragment();
                return;
            }
        }
        if (this.l1) {
            getMessagesController().unblockPeer(this.f1);
            if (org.telegram.ui.Components.xc.a(this)) {
                org.telegram.ui.Components.xc.d(this, false).j();
                return;
            }
            return;
        }
        if (this.m1) {
            org.telegram.ui.Components.f5.j0(this, this.f1, user, null, this.E2, false, null, new va(this, i10), this.A0);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.A0);
        String string = LocaleController.getString(R.string.BlockUser);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = string;
        c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new qx0(this, i11));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, this.A0);
        }
    }

    public final void p5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        if ((this.v0 == null && this.w0 == null) || (kVar = this.actionBar) == null) {
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
        yy0 yy0Var = this.v0;
        if (yy0Var != null) {
            float z11 = com.google.android.gms.internal.play_billing.k3.z(this.actionBar.getHeight(), f7, 2.0f, f7);
            boolean z12 = Math.abs(max - yy0Var.f0) > 0.1f || Math.abs(width - yy0Var.g0) > 0.1f || Math.abs(z11 - yy0Var.h0) > 0.1f;
            yy0Var.f0 = max;
            yy0Var.g0 = width;
            if (z10) {
                yy0Var.m0.d(width, true);
            }
            yy0Var.h0 = z11;
            if (z12) {
                yy0Var.invalidate();
            }
        }
        ai.j1 j1Var = this.w0;
        if (j1Var != null) {
            float z13 = com.google.android.gms.internal.play_billing.k3.z(this.actionBar.getHeight(), f7, 2.0f, f7);
            int W3 = W3();
            boolean z14 = Math.abs(max - j1Var.r) > 0.1f || Math.abs(width - j1Var.s) > 0.1f || Math.abs(z13 - j1Var.v) > 0.1f;
            j1Var.r = max;
            j1Var.s = width;
            if (z10) {
                j1Var.y.d(width, true);
            }
            j1Var.v = z13;
            j1Var.x = W3 + z13;
            if (z14) {
                j1Var.invalidate();
            }
        }
    }

    public final void q4(boolean z10) {
        boolean z11 = false;
        if (this.f1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f1));
            if (user != null) {
                TLRPC.UserFull userFull = this.w2;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.d2.m(user, z10, z11, getParentActivity(), this.w2, getAccountInstance());
                return;
            }
            return;
        }
        if (this.g1 != 0) {
            if (getMessagesController().getGroupCall(this.g1, false) != null) {
                org.telegram.ui.Components.voip.d2.l(this.F2, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            TLRPC.Chat chat = this.F2;
            AccountInstance accountInstance = getAccountInstance();
            if (getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.s80.u(getParentActivity(), -chat.id, accountInstance, new org.telegram.ui.Components.ry(chat, this, accountInstance, 5));
        }
    }

    public final void q5() {
        org.telegram.ui.Components.ns0 ns0Var;
        Drawable drawable;
        Drawable drawable2;
        gh.c[] cVarArr = this.D6;
        if (cVarArr != null) {
            for (gh.c cVar : cVarArr) {
                try {
                    if (cVar != null) {
                        cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.A0));
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            FrameLayout frameLayout = this.u5;
            if (frameLayout != null) {
                frameLayout.invalidate();
            }
        }
        e50 e50Var = this.U;
        if (e50Var != null && (e50Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.U.getForeground()).setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.A0), 100));
        }
        float f7 = this.G5;
        Drawable[] drawableArr = this.y;
        int[] iArr = this.I6;
        if (drawableArr != null && (drawable2 = drawableArr[0]) != null) {
            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.zh, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oi, this.A0), f7, 1.0f);
            O4(drawable2, offsetColor, iArr[0], PorterDuff.Mode.MULTIPLY);
            iArr[0] = offsetColor;
        }
        Drawable[] drawableArr2 = this.I;
        if (drawableArr2 != null && (drawable = drawableArr2[0]) != null) {
            int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ah, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.A0), f7, 1.0f);
            O4(drawable, offsetColor2, iArr[1], PorterDuff.Mode.MULTIPLY);
            iArr[1] = offsetColor2;
        }
        Drawable[] drawableArr3 = this.E;
        if (drawableArr3 != null) {
            int i10 = 0;
            while (i10 < drawableArr3.length) {
                char c10 = 2;
                if (i10 >= 2) {
                    break;
                }
                Drawable drawable3 = drawableArr3[i10];
                if (drawable3 != null) {
                    char c11 = i10 == 0 ? (char) 2 : (char) 6;
                    int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.zh, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oi, this.A0), f7, 1.0f);
                    if (i10 != 0) {
                        c10 = 6;
                    }
                    O4(drawable3, offsetColor3, iArr[c10], PorterDuff.Mode.MULTIPLY);
                    iArr[c11] = offsetColor3;
                }
                i10++;
            }
        }
        Drawable drawable4 = this.E6;
        if (drawable4 != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.V6, this.A0);
            O4(drawable4, w02, iArr[3], PorterDuff.Mode.MULTIPLY);
            iArr[3] = w02;
        }
        Drawable drawable5 = this.F6;
        if (drawable5 != null) {
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.A0);
            O4(drawable5, w03, iArr[4], PorterDuff.Mode.MULTIPLY);
            iArr[4] = w03;
        }
        Drawable drawable6 = this.G6;
        if (drawable6 != null) {
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.A0);
            O4(drawable6, w04, iArr[5], PorterDuff.Mode.SRC_IN);
            iArr[5] = w04;
        }
        rz0 rz0Var = this.O;
        if (rz0Var != null && (ns0Var = rz0Var.V) != null) {
            try {
                gh.c cVar2 = ns0Var.R;
                if (cVar2 != null) {
                    cVar2.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, ns0Var.f));
                    ns0Var.invalidate();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        org.telegram.ui.Components.xq xqVar = this.H6;
        if (xqVar != null) {
            xqVar.setOverrideColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, this.A0));
            if (this.a != null) {
                for (int i11 = 0; i11 < this.a.getChildCount(); i11++) {
                    View childAt = this.a.getChildAt(i11);
                    if (childAt != null) {
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ju0
    public final boolean r() {
        return this.O5;
    }

    public final void r4() {
        TLRPC.UserFull userFull = this.w2;
        if (userFull == null || !UserObject.areGiftsDisabled(userFull)) {
            if (this.F2 != null) {
                org.telegram.ui.Components.s40.h.a();
            }
            showDialog(new yh.o1(getParentActivity(), this.currentAccount, a(), null, null));
        } else {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                org.telegram.ui.Components.xc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(a())))).j();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
    
        if (r0.ttl_period > 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0025, code lost:
    
        if (r4.v2.ttl_period > 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r5() {
        boolean z10;
        if (this.Z0 == null) {
            return;
        }
        if (this.E2 == null) {
            TLRPC.UserFull userFull = this.w2;
            z10 = true;
            if (userFull != null) {
            }
            if (this.v2 != null) {
                if (ChatObject.canUserDoAdminAction(this.F2, 13)) {
                }
            }
        }
        z10 = false;
        AndroidUtilities.updateViewVisibilityAnimated(this.Z0, z10, 0.8f, this.n5);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.e50 e50Var = this.r0;
        if (e50Var != null) {
            e50Var.f = bundle.getString("path");
        }
    }

    public final void s4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().addUserToChat(this.F2.id, getUserConfig().getCurrentUser(), 0, null, this, true, new v90(this, z10, zArr, 7), new da.b(this, zArr, z10, this.parentLayout.getLastFragment(), 6));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
    }

    public final void s5(boolean z10) {
        boolean z11;
        TLRPC.ChatFull chatFull;
        float A3 = A3();
        int i10 = 1;
        this.J5 = A3 > 0.2f && !this.X1 && (this.r0 == null || this.P2 == -1);
        E3();
        org.telegram.ui.Components.bk0 bk0Var = this.v;
        if (bk0Var == null || bk0Var.getVisibility() == 8) {
            z11 = false;
        } else {
            this.v.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) + this.R1) + this.U1) - AndroidUtilities.dp(29.5f));
            z11 = A3 > 0.2f && !this.X1 && !this.t1 && (this.r0 == null || this.P2 == -1);
            if (z11 && this.g1 != 0) {
                z11 = (!ChatObject.isChannel(this.F2) || this.F2.megagroup || (chatFull = this.v2) == null || chatFull.linked_chat_id == 0 || (this.E3 == -1 && this.F3 == -1)) ? false : true;
            }
            if (!this.H1) {
                if (z11 != (this.v.getTag() == null)) {
                    if (z11) {
                        this.v.setTag(null);
                    } else {
                        this.v.setTag(0);
                    }
                    AnimatorSet animatorSet = this.w;
                    if (animatorSet != null) {
                        this.w = null;
                        animatorSet.cancel();
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.w = animatorSet2;
                        if (z11) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.bk0, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.bk0, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.bk0, Float>) View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.bk0, Float>) View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.bk0, Float>) View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.bk0, Float>) View.ALPHA, 0.0f));
                        }
                        this.w.setDuration(150L);
                        this.w.addListener(new iz0(this, i10));
                        this.w.start();
                    } else {
                        this.v.setScaleX(z11 ? 1.0f : 0.2f);
                        this.v.setScaleY(z11 ? 1.0f : 0.2f);
                        this.v.setAlpha(z11 ? 1.0f : 0.0f);
                    }
                }
            }
        }
        yy0 yy0Var = this.v0;
        if (yy0Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - AndroidUtilities.dp(40.0f);
            int i11 = this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            yy0Var.i0 = measuredWidth;
            yy0Var.k0 = z11;
            yy0Var.j0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i11;
            yy0Var.invalidate();
        }
        ai.j1 j1Var = this.w0;
        if (j1Var != null) {
            j1Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + this.R1 + this.U1);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.e50 e50Var = this.r0;
        if (e50Var == null || (str = e50Var.f) == null) {
            return;
        }
        bundle.putString("path", str);
    }

    public void setAvatarAnimationProgress(float f7) {
        int w02;
        int w03;
        int w04;
        this.l2 = f7;
        this.T1 = f7;
        D3();
        if (this.K1 == 2) {
            this.f0.setProgressToExpand(f7);
            org.telegram.ui.Components.ci0 ci0Var = this.a0;
            if (ci0Var != null) {
                ci0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.vi0 vi0Var = this.c0;
            if (vi0Var != null) {
                vi0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.hx0 hx0Var = this.T;
            if (hx0Var != null) {
                hx0Var.setParentExpanded(f7);
            }
            W4();
            j5();
        }
        this.a.setAlpha(f7);
        this.a.setTranslationX(AndroidUtilities.dp(48.0f) - (AndroidUtilities.dp(48.0f) * f7));
        if (this.K1 != 2 || (w02 = this.s0) == 0) {
            if (this.f1 == 0 && ChatObject.isChannel(this.g1, this.currentAccount)) {
                boolean z10 = this.F2.megagroup;
            }
            org.telegram.ui.ActionBar.g6 g6Var = this.A0;
            int[][] iArr = org.telegram.ui.Components.h9.L;
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, g6Var);
        }
        int i10 = this.Z4;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.A0);
        }
        this.e1.setBackgroundColor(i0.a.f(f7, i0.a.o(i10, 0), w02));
        org.telegram.ui.Components.w21 w21Var = this.m0;
        int f10 = i0.a.f(f7, i10, w02);
        w21Var.k = true;
        w21Var.b.setColor(f10);
        if (this.S5 != null) {
            w03 = -1;
        } else {
            if (this.f1 == 0 && ChatObject.isChannel(this.g1, this.currentAccount)) {
                boolean z11 = this.F2.megagroup;
            }
            org.telegram.ui.ActionBar.g6 g6Var2 = this.A0;
            int[][] iArr2 = org.telegram.ui.Components.h9.L;
            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.g8, g6Var2);
        }
        this.actionBar.B(i0.a.f(this.T1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.A0), w03), false);
        int w05 = this.S5 == null ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vh, this.A0) : -1;
        int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, this.A0);
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.ActionBar.n5 n5Var = this.f[i11];
            if (n5Var != null && (i11 != 1 || this.K1 != 2)) {
                n5Var.setTextColor(i0.a.f(f7, w06, w05));
            }
        }
        boolean[] zArr = this.K0;
        if (zArr[0]) {
            w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bh, this.A0);
        } else {
            if (this.f1 == 0 && ChatObject.isChannel(this.g1, this.currentAccount)) {
                boolean z12 = this.F2.megagroup;
            }
            org.telegram.ui.ActionBar.g6 g6Var3 = this.A0;
            int[][] iArr3 = org.telegram.ui.Components.h9.L;
            w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h8, g6Var3);
        }
        int w07 = org.telegram.ui.ActionBar.k6.w0(zArr[0] ? org.telegram.ui.ActionBar.k6.pa : org.telegram.ui.ActionBar.k6.B8, this.A0);
        int i12 = 0;
        while (i12 < 3) {
            org.telegram.ui.ActionBar.n5 n5Var2 = this.r[i12];
            if (n5Var2 != null && i12 != 1 && (i12 != 2 || this.K1 != 2)) {
                n5Var2.setTextColor(i0.a.f(f7, i12 == 0 ? w07 : x3(w07, Boolean.valueOf(zArr[0])), i12 == 0 ? w04 : x3(w04, Boolean.valueOf(zArr[0]))));
            }
            i12++;
        }
        this.R1 = this.S1 * f7;
        long j10 = this.f1;
        if (j10 == 0) {
            j10 = this.g1;
        }
        org.telegram.ui.ActionBar.g6 g6Var4 = this.A0;
        int[][] iArr4 = org.telegram.ui.Components.h9.L;
        int w08 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[org.telegram.ui.Components.h9.e(j10)], g6Var4);
        long j11 = this.f1;
        if (j11 == 0) {
            j11 = this.g1;
        }
        int d = org.telegram.ui.Components.h9.d(j11);
        if (w08 != d) {
            this.q0.h(i0.a.f(f7, d, w08));
            this.f0.invalidate();
        }
        int i13 = this.a5;
        if (i13 != 0) {
            setNavigationBarColor(i0.a.f(f7, i13, getNavigationBarColor()));
        }
        this.e1.invalidate();
        m4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        a01 a01Var = this.P5;
        if (a01Var != null) {
            a01Var.invalidate();
        }
        if (a() > 0) {
            vy0 vy0Var = this.f0;
            if (vy0Var != null) {
                vy0Var.setProgressToStoriesInsets(this.T1);
            }
            yy0 yy0Var = this.v0;
            if (yy0Var != null) {
                yy0Var.setProgressToStoriesInsets(this.T1);
            }
            ai.j1 j1Var = this.w0;
            if (j1Var != null) {
                j1Var.setProgressToStoriesInsets(this.T1);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void setParentLayout(org.telegram.ui.ActionBar.h5 h5Var) {
        super.setParentLayout(h5Var);
        FlagSecureReason flagSecureReason = this.Y1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
            this.Y1 = null;
        }
        if (h5Var == null || h5Var.getParentActivity() == null) {
            return;
        }
        this.Y1 = new FlagSecureReason(h5Var.getParentActivity().getWindow(), new qx0(this, 7));
    }

    @Override // org.telegram.ui.qg0
    public final void t() {
        this.a.x0(0);
    }

    public final void t4(View view, float f7, float f10, boolean z10) {
        float f11;
        float f12;
        long j10;
        long j11 = this.j1;
        if (j11 == 0) {
            j11 = this.f1;
            if (j11 == 0) {
                j11 = -this.g1;
            }
        }
        long j12 = j11;
        boolean isDialogMuted = getMessagesController().isDialogMuted(j12, this.h1);
        if (z10 && (this.r1 || isDialogMuted)) {
            boolean z11 = !isDialogMuted;
            getNotificationsController().muteDialog(j12, this.h1, z11);
            org.telegram.ui.Components.xc.A(this, z11, null).j();
            e5();
            this.a0.setNotifications(isDialogMuted);
            return;
        }
        if ((z10 || !LocaleController.isRTL || f7 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f7 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(getParentActivity(), this.currentAccount, null, true, new ad.d(this, j12, 6), this.A0);
            zoVar.e(j12, this.h1, this.j5);
            if (AndroidUtilities.isTablet()) {
                ViewGroup view2 = this.parentLayout.getView();
                f11 = view2.getX() + view2.getPaddingLeft() + f7;
                f12 = view2.getY() + view2.getPaddingTop() + f10;
            } else {
                f11 = f7;
                f12 = f10;
            }
            if (z10) {
                f12 += this.a0.getHeight() - AndroidUtilities.dp(12.0f);
            }
            zoVar.d(this, view, f11, f12, z10);
            return;
        }
        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
        boolean z12 = i5Var.e.h;
        boolean z13 = !z12;
        boolean isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j12, false, false);
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j12, this.h1);
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
            if (this.h1 == 0) {
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
            if (this.h1 == 0) {
                getMessagesStorage().setDialogFlags(j12, 0L);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j12);
                if (dialog2 != null) {
                    dialog2.notify_settings = new TLRPC.TL_peerNotifySettings();
                }
            }
            edit2.apply();
        }
        e5();
        getNotificationsController().updateServerNotificationsSettings(j12, this.h1);
        i5Var.setChecked(z13);
        k5(true);
    }

    public final void t5() {
        org.telegram.ui.Components.ns0 ns0Var;
        org.telegram.ui.Components.nt0 nt0Var;
        org.telegram.ui.Components.y90 y90Var;
        int w02;
        this.T5.clear();
        t01 t01Var = this.e1;
        if (t01Var != null) {
            t01Var.a(this.S5, true);
        }
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.r;
        org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[1];
        if (n5Var != null) {
            n5VarArr[1].setTextColor(i0.a.f(this.l2, x3(n5Var.getTag() instanceof Integer ? org.telegram.ui.ActionBar.k6.w0(((Integer) n5VarArr[1].getTag()).intValue(), this.A0) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.A0), Boolean.valueOf(this.K0[0])), -1275068417));
        }
        r01 r01Var = this.h6;
        if (r01Var != null) {
            r01Var.a(i0.a.f(this.l2, org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.b(0.18f, -0.1f, this.d1)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.B(i0.a.f(this.G5, this.S5 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y8, this.A0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            MessagesController.PeerColor peerColor = this.S5;
            kVar2.A(i0.a.f(this.G5, peerColor != null ? 1090519039 : peerColor != null ? 553648127 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f8, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z8, this.A0)), false);
        }
        Drawable[] drawableArr = this.y;
        if (drawableArr[1] != null) {
            MessagesController.PeerColor peerColor2 = this.S5;
            if (peerColor2 != null) {
                w02 = org.telegram.ui.ActionBar.k6.b(0.1f, org.telegram.ui.ActionBar.k6.I.q() ? -0.1f : -0.08f, i0.a.f(0.4f, peerColor2.getColor2(), this.S5.hasColor6(org.telegram.ui.ActionBar.k6.I.q()) ? this.S5.getColor5() : this.S5.getColor3()));
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.zh, this.A0);
            }
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oi, this.A0), this.G5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        Drawable[] drawableArr2 = this.I;
        if (drawableArr2[1] != null) {
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(this.S5 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ah, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.A0), this.G5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f[1];
        if (n5Var2 != null) {
            n5Var2.setTextColor(i0.a.f(this.l2, i0.a.f(this.G5, this.S5 != null ? -1 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vh, this.A0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oi, this.A0)), -1));
        }
        org.telegram.ui.Components.p8 p8Var = this.b1;
        if (p8Var != null && (y90Var = p8Var.e) != null) {
            y90Var.invalidate();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.S5 == null ? i0.a.f(this.T1, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.pc, this.A0), -1) : -1, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.vi0 vi0Var = this.c0;
        if (vi0Var != null) {
            vi0Var.setColor(this.S5);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.a, (Utilities.Callback<View>) new zx0(this, 3));
        rz0 rz0Var = this.O;
        if (rz0Var != null && (nt0Var = rz0Var.I0) != null) {
            nt0Var.updateColors();
        }
        rz0 rz0Var2 = this.O;
        if (rz0Var2 != null && (ns0Var = rz0Var2.V) != null) {
            ns0Var.m();
        }
        u5();
        b5();
        yy0 yy0Var = this.v0;
        if (yy0Var != null) {
            yy0Var.f(true, true);
        }
        ai.j1 j1Var = this.w0;
        if (j1Var != null) {
            j1Var.a();
        }
    }

    public final void u4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.f1 != 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f1));
                if (user == null) {
                    return;
                }
                if (this.G2 == null || (userFull = this.w2) == null || TextUtils.isEmpty(userFull.about)) {
                    str = String.format("https://" + getMessagesController().linkPrefix + "/%s", UserObject.getPublicUsername(user));
                } else {
                    str = String.format("%s https://" + getMessagesController().linkPrefix + "/%s", this.w2.about, UserObject.getPublicUsername(user));
                }
            } else if (this.g1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.g1));
                if (chat == null) {
                    return;
                }
                TLRPC.ChatFull chatFull = this.v2;
                if (chatFull == null || TextUtils.isEmpty(chatFull.about)) {
                    str = String.format("https://" + getMessagesController().linkPrefix + "/%s", ChatObject.getPublicUsername(chat));
                } else {
                    str = String.format("%s\nhttps://" + getMessagesController().linkPrefix + "/%s", this.v2.about, ChatObject.getPublicUsername(chat));
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

    public final void u5() {
        if (this.v == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.xh, this.A0);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yh, this.A0);
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wh, this.A0);
            if (this.S5 != null && org.telegram.ui.ActionBar.k6.d1(w02)) {
                w02 = org.telegram.ui.ActionBar.k6.b(0.05f, -0.04f, this.S5.getBgColor1(false));
                MessagesController.PeerColor peerColor = this.S5;
                if (peerColor != null) {
                    int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.k6.I.q());
                    w03 = org.telegram.ui.ActionBar.k6.C(org.telegram.ui.ActionBar.k6.I.q(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, this.A0), bgColor2, w03, bgColor2);
                }
                w04 = -1;
            }
            org.telegram.ui.Components.bk0 bk0Var = this.a6;
            org.telegram.ui.Components.bk0 bk0Var2 = this.v;
            int[] iArr = this.b6;
            if (bk0Var == bk0Var2 && iArr[0] == w02 && iArr[1] == w03 && iArr[2] == w04) {
                return;
            }
            this.a6 = bk0Var2;
            iArr[0] = w02;
            iArr[1] = w03;
            iArr[2] = w04;
            Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
            org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(mutate, org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(56.0f), w02, w03), 0, 0);
            int dp = AndroidUtilities.dp(56.0f);
            int dp2 = AndroidUtilities.dp(56.0f);
            yqVar.e = dp;
            yqVar.f = dp2;
            this.v.setBackground(yqVar);
            this.v.setColorFilter(new PorterDuffColorFilter(w04, mode));
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean v() {
        return false;
    }

    public final void v4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.M3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.g1);
            bundle.putLong("user_id", this.f1);
            presentFragment(new zh.n0(bundle));
            return;
        }
        if (view2.getTag() == null || ((Integer) view2.getTag()).intValue() != this.V2) {
            return;
        }
        if (this.f1 == getUserConfig().getClientUserId()) {
            presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
        } else if (UserObject.areGiftsDisabled(this.w2)) {
            org.telegram.ui.Components.xc.a0(this).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.f1)))).j();
        } else {
            showDialog(new yh.o1(getParentActivity(), this.currentAccount, this.f1, null, null));
        }
    }

    @Override // org.telegram.ui.xx
    public final boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ye1 ye1Var) {
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle h = a1.g.h("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j10)) {
            h.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            h.putLong("user_id", j10);
        } else if (DialogObject.isChatDialog(j10)) {
            h.putLong("chat_id", -j10);
        }
        if (!getMessagesController().checkCanOpenChat(h, eyVar)) {
            return false;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i12 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i12);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
        presentFragment(new sn(h), true);
        removeSelfFromStack();
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(getMessagesController().getUser(Long.valueOf(this.f1)), j10, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z11, i10, i11));
        if (!TextUtils.isEmpty(charSequence)) {
            SendMessagesHelper.prepareSendingText(AccountInstance.getInstance(this.currentAccount), charSequence, j10, z11, i10, i11, 0L);
        }
        return true;
    }

    public final CharSequence w3(CharSequence charSequence) {
        if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.j1)) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.xq(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityHiddenStatus));
        spannableStringBuilder.append((CharSequence) " * ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.lt(), length - 2, length - 1, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final void w4() {
        org.telegram.ui.Components.yj0 yj0Var;
        if (this.f1 == 0) {
            A4();
            return;
        }
        if (this.r0 == null) {
            z4();
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.e50 e50Var = this.r0;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        e50Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new ib0(this, 24), new v5(this, 13), 0);
        this.V.M(0);
        this.V.P(43);
        this.W.M(0);
        this.W.P(43);
        org.telegram.ui.Components.ci0 ci0Var = this.a0;
        if (ci0Var != null) {
            org.telegram.ui.Components.zh0 j10 = org.telegram.ui.Components.ci0.j(14, ci0Var.a);
            if (j10 != null && (yj0Var = j10.k) != null) {
                yj0Var.start();
            }
        } else {
            this.v.d();
        }
        org.telegram.ui.Cells.r8 r8Var = this.N2;
        if (r8Var != null) {
            r8Var.getImageView().d();
        }
    }

    public final int x3(int i10, Boolean bool) {
        if (this.S5 == null) {
            return i10;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.A0);
        int f7 = i0.a.f(0.5f, this.S5.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), this.S5.getStoryColor2(org.telegram.ui.ActionBar.k6.I.q()));
        if (org.telegram.ui.ActionBar.k6.d1(w02)) {
            return org.telegram.ui.ActionBar.k6.C(org.telegram.ui.ActionBar.k6.I.q(), w02, f7, i10, (bool == null || bool.booleanValue()) ? f7 : org.telegram.ui.ActionBar.k6.o1(0.7f, f7));
        }
        return (bool == null || bool.booleanValue()) ? f7 : org.telegram.ui.ActionBar.k6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.k6.o1(0.7f, f7));
    }

    public final void x4() {
        Bundle h = a1.g.h("addToGroup", true);
        h.putLong("chatId", this.F2.id);
        p60 p60Var = new p60(h);
        TLRPC.ChatFull chatFull = this.v2;
        p60Var.I = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i10 = 0; i10 < this.v2.participants.participants.size(); i10++) {
                hVar.k(null, this.v2.participants.participants.get(i10).user_id);
            }
            p60Var.J = hVar;
        }
        p60Var.x = new qx0(this, 10);
        presentFragment(p60Var);
    }

    public final void y3() {
        int f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            org.telegram.ui.ActionBar.n5[] n5VarArr = this.f;
            if (n5VarArr[1] == null || this.e1 == null || this.U0 == null || this.R0 == null || this.S0 == null || this.T0 == null || this.p0 == null) {
                return;
            }
            Float valueOf = Float.valueOf(this.G5);
            hz0 hz0Var = this.I5;
            hz0Var.getClass();
            hz0Var.a(kVar, valueOf);
            if (this.G5 > 0.0f || this.l2 <= 0.0f) {
                return;
            }
            org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[1];
            int i10 = -1;
            if (this.S5 != null) {
                f7 = -1;
            } else {
                f7 = i0.a.f(this.l2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vh, this.A0), -1);
            }
            n5Var.setTextColor(f7);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (this.S5 == null) {
                i10 = i0.a.f(this.l2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, this.A0), -1);
            }
            kVar2.B(i10, false);
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
    public final void y4(boolean z10) {
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
            wy0 wy0Var = this.o0;
            int realPosition = wy0Var != null ? wy0Var.getRealPosition() : 0;
            wy0 wy0Var2 = this.o0;
            ImageLocation imageLocation = null;
            ImageLocation G = wy0Var2 != null ? wy0Var2.G(realPosition) : null;
            wy0 wy0Var3 = this.o0;
            TLRPC.Photo F = wy0Var3 != null ? wy0Var3.F(realPosition) : null;
            long j10 = this.f1;
            gz0 gz0Var = this.m5;
            if (j10 == 0) {
                if (this.g1 == 0 || (chatPhoto = (chat = getMessagesController().getChat(Long.valueOf(this.g1))).photo) == null || chatPhoto.photo_big == null) {
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
                if (F == null && (chatFull = this.v2) != null) {
                    TLRPC.Photo photo2 = chatFull.chat_photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        F = photo2;
                    }
                }
                if (F != null && !F.video_sizes.isEmpty() && (closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(F.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) != null) {
                    imageLocation = ImageLocation.getForPhoto(closestVideoSizeWithSize, F);
                }
                PhotoViewer.u1().g2(null, fileLocation3, G, imageLocation, null, null, null, 0, gz0Var, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f1));
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
            if (F != null && !F.video_sizes.isEmpty() && (closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(F.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) != null) {
                imageLocation = ImageLocation.getForPhoto(closestVideoSizeWithSize2, F);
            }
            PhotoViewer.u1().g2(null, fileLocation4, G, imageLocation, null, null, null, 0, gz0Var, null, 0L, 0L, 0L, true, null, null);
        }
    }

    @Override // org.telegram.ui.qg0
    public final gh.d z() {
        return this.t6;
    }

    public final void z3() {
        if (this.L5 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.k2;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.k2.cancel();
        }
        float clamp01 = Utilities.clamp01(this.R1 / this.G1);
        if (clamp01 <= 0.0f) {
            return;
        }
        float f7 = (clamp01 - 0.5f) / 0.5f;
        float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f));
        this.c2 = AndroidUtilities.lerp(0.42f, this.L5[0], clamp01);
        this.a2 = AndroidUtilities.lerp(this.Q5, this.L5[1], clamp01);
        this.b2 = AndroidUtilities.lerp(translationY, this.L5[2], clamp01);
        this.d2 = AndroidUtilities.lerp(this.L5[11], 0.0f, clamp01);
        this.Y.setScaleX(this.c2);
        this.Y.setScaleY(this.c2);
        this.Y.setTranslationX(this.a2);
        this.Y.setTranslationY(this.b2);
        org.telegram.ui.Components.hx0 hx0Var = this.T;
        if (hx0Var != null) {
            hx0Var.setAlpha(clamp01);
        }
        this.f0.setAlpha(1.0f);
        this.Y.setAlpha(1.0f);
        yy0 yy0Var = this.v0;
        if (yy0Var != null) {
            yy0Var.invalidate();
        }
        ai.j1 j1Var = this.w0;
        if (j1Var != null) {
            j1Var.e = AndroidUtilities.lerp(0.0f, this.L5[4], f7);
            this.w0.f = AndroidUtilities.lerp(0.0f, this.L5[5], clamp01);
            ai.j1 j1Var2 = this.w0;
            j1Var2.h = true;
            j1Var2.invalidate();
        }
        r01 r01Var = this.h6;
        if (r01Var != null) {
            r01Var.setAlpha((int) AndroidUtilities.lerp(0.0f, this.L5[6], clamp01));
        }
        float dp = (((this.c2 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
        this.i0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(16.0f) + dp);
        this.i0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(-10.0f) + dp);
        this.j0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
        this.j0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(26.5f) + dp);
        this.k0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
        this.k0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + dp);
        this.l0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
        this.l0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + dp);
        float lerp = AndroidUtilities.lerp(1.0f, this.L5[7], clamp01);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
        float dpf2 = AndroidUtilities.dpf2(22.7f) + floor;
        this.f2 = AndroidUtilities.lerp(floor, this.L5[8], clamp01);
        this.h2 = AndroidUtilities.lerp(dpf2, this.L5[9], clamp01);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.n5[] n5VarArr = this.f;
            if (i10 >= n5VarArr.length) {
                break;
            }
            if (n5VarArr[i10] != null) {
                int i11 = i10 * 2;
                float lerp2 = AndroidUtilities.lerp((this.Q5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.L5[i11 + 12], clamp01);
                float lerp3 = AndroidUtilities.lerp((this.Q5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.L5[i11 + 13], clamp01);
                n5VarArr[i10].setTranslationX(lerp2);
                n5VarArr[i10].setTranslationY(this.f2);
                org.telegram.ui.ActionBar.n5[] n5VarArr2 = this.r;
                n5VarArr2[i10].setTranslationX(this.q5 + lerp3);
                n5VarArr2[i10].setTranslationY(this.h2);
                if (i10 == 1) {
                    this.e2 = lerp2;
                    this.g2 = lerp3;
                    this.s.setTranslationX(lerp3);
                    this.s.setTranslationY(this.h2);
                }
                n5VarArr[i10].setScaleX(lerp);
                n5VarArr[i10].setScaleY(lerp);
            }
            i10++;
        }
        Z4();
        f5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        n4((int) this.L5[10], clamp01, true);
        org.telegram.ui.Components.ci0 ci0Var = this.a0;
        if (ci0Var != null) {
            ci0Var.setAlpha(AndroidUtilities.lerp(0.0f, this.L5[3], f7));
        }
    }

    public final void z4() {
        TLRPC.User user;
        if (this.f1 == 0 || O3() || (user = getMessagesController().getUser(Long.valueOf(this.f1))) == null || (user instanceof TLRPC.TL_userEmpty)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f1);
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
            sn snVar = new sn(bundle);
            snVar.N9 = getMediaDataController().getGreetingsSticker();
            snVar.O9 = false;
            presentFragment(snVar, z10);
            if (!AndroidUtilities.isTablet() || this.J0) {
                return;
            }
            finishFragment();
        }
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.pv0 pv0Var) {
        super(bundle);
        this.f = new org.telegram.ui.ActionBar.n5[2];
        this.h = null;
        this.n = null;
        this.r = new org.telegram.ui.ActionBar.n5[4];
        this.y = new Drawable[2];
        this.E = new Drawable[2];
        this.G = new org.telegram.ui.Components.p5[2];
        this.H = new org.telegram.ui.Components.p5[2];
        this.I = new Drawable[2];
        this.J = new org.telegram.ui.Components.as[2];
        this.K = new org.telegram.ui.Components.as[2];
        this.x0 = null;
        this.y0 = new org.telegram.ui.Components.p50(this, 2);
        this.z0 = new Paint(1);
        this.K0 = new boolean[1];
        this.c1 = 1.0f;
        this.D1 = new a0.h();
        this.N1 = true;
        this.O1 = false;
        this.P1 = false;
        this.Q1 = false;
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
        this.Z4 = 0;
        this.a5 = 0;
        this.b5 = 0;
        this.c5 = 0L;
        this.j5 = new HashSet();
        this.l5 = new org.telegram.ui.Cells.c2(this);
        this.m5 = new gz0(this);
        this.C5 = new ne.b(0, new qx0(this, 8), org.telegram.ui.Components.bs.h, 380L, true);
        this.I5 = new hz0(this);
        this.K5 = new iz0(this, 0);
        this.L5 = null;
        this.T5 = new SparseIntArray();
        this.V5 = null;
        this.W5 = -1;
        this.b6 = new int[3];
        this.c6 = -1.0f;
        gh.b bVar = new gh.b();
        this.w6 = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.x6 = bVar2;
        ArrayList arrayList = new ArrayList();
        this.A6 = arrayList;
        RectF rectF = new RectF();
        this.B6 = rectF;
        RectF rectF2 = new RectF();
        this.C6 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.D6 = new gh.c[2];
        this.I6 = new int[7];
        this.R = pv0Var;
        gh.c cVar = new gh.c();
        this.u6 = cVar;
        cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.A0));
        if (Build.VERSION.SDK_INT >= 31) {
            this.s6 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.t6 = dVar;
            bh.b bVar3 = new bh.b(dVar);
            this.v6 = bVar3;
            bVar3.i = LiteMode.isEnabled(262144);
        } else {
            this.s6 = null;
            this.t6 = null;
            this.v6 = new bh.b(cVar);
        }
        bVar2.e = new re.b();
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ void P() {
    }
}
