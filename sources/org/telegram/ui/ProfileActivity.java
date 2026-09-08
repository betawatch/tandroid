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
import android.text.style.ForegroundColorSpan;
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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class ProfileActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, oy, org.telegram.ui.Components.qu0, org.telegram.ui.Components.t40, org.telegram.ui.Components.jt0, dh0 {
    public int A0;
    public boolean A1;
    public long A2;
    public int A3;
    public int A4;
    public final le.b A5;
    public ImageLocation B0;
    public boolean B1;
    public int B2;
    public int B3;
    public int B4;
    public wz0 B5;
    public int C0;
    public a0.i C1;
    public ArrayList C2;
    public int C3;
    public int C4;
    public AnimatorSet C5;
    public int D0;
    public boolean D1;
    public TLRPC.EncryptedChat D2;
    public int D3;
    public int D4;
    public AnimatorSet D5;
    public final Drawable[] E;
    public int E0;
    public long E1;
    public TLRPC.Chat E2;
    public int E3;
    public int E4;
    public float E5;
    public Long F;
    public boolean F0;
    public float F1;
    public TL_bots.BotInfo F2;
    public int F3;
    public int F4;
    public boolean F5;
    public final org.telegram.ui.Components.o5[] G;
    public boolean G0;
    public boolean G1;
    public TLRPC.ChannelParticipant G2;
    public int G3;
    public int G4;
    public final b01 G5;
    public final org.telegram.ui.Components.o5[] H;
    public boolean H0;
    public boolean H1;
    public TL_account.TL_password H2;
    public int H3;
    public int H4;
    public boolean H5;
    public final Drawable[] I;
    public boolean I0;
    public boolean I1;
    public TLRPC.FileLocation I2;
    public int I3;
    public boolean I4;
    public final c01 I5;
    public final org.telegram.ui.Components.or[] J;
    public final boolean[] J0;
    public int J1;
    public TLRPC.FileLocation J2;
    public int J3;
    public int J4;
    public float[] J5;
    public final org.telegram.ui.Components.or[] K;
    public boolean K0;
    public boolean K1;
    public ImageLocation K2;
    public int K3;
    public int K4;
    public float K5;
    public org.telegram.ui.Components.xl0 L;
    public boolean L0;
    public boolean L1;
    public final Rect L2;
    public int L3;
    public int L4;
    public float L5;
    public UndoView M;
    public boolean M0;
    public boolean M1;
    public org.telegram.ui.Cells.r8 M2;
    public int M3;
    public int M4;
    public boolean M5;
    public b11 N;
    public boolean N0;
    public boolean N1;
    public int N2;
    public int N3;
    public boolean N4;
    public v01 N5;
    public m01 O;
    public ImageView O0;
    public boolean O1;
    public int O2;
    public int O3;
    public boolean O4;
    public float O5;
    public org.telegram.ui.Components.xw0 P;
    public org.telegram.ui.ActionBar.v0 P0;
    public boolean P1;
    public int P2;
    public int P3;
    public int P4;
    public float P5;
    public boolean Q;
    public org.telegram.ui.ActionBar.v0 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public final ArrayList Q4;
    public MessagesController.PeerColor Q5;
    public org.telegram.ui.Components.pu0 R;
    public org.telegram.ui.ActionBar.v0 R0;
    public float R1;
    public int R2;
    public int R3;
    public final ArrayList R4;
    public final SparseIntArray R5;
    public boolean S;
    public org.telegram.ui.ActionBar.v0 S0;
    public float S1;
    public int S2;
    public int S3;
    public int S4;
    public int S5;
    public org.telegram.ui.Components.hw0 T;
    public org.telegram.ui.ActionBar.v0 T0;
    public int T1;
    public int T2;
    public int T3;
    public boolean T4;
    public AnimatorSet T5;
    public t50 U;
    public org.telegram.ui.ActionBar.v0 U0;
    public float U1;
    public int U2;
    public int U3;
    public boolean U4;
    public int U5;
    public org.telegram.ui.Components.xi0 V;
    public org.telegram.ui.ActionBar.f1 V0;
    public ValueAnimator V1;
    public int V2;
    public int V3;
    public uz0 V4;
    public int V5;
    public org.telegram.ui.Components.xi0 W;
    public org.telegram.ui.ActionBar.f1 W0;
    public boolean W1;
    public int W2;
    public int W3;
    public View W4;
    public boolean W5;
    public org.telegram.ui.Components.i40 X;
    public org.telegram.ui.ActionBar.f1 X0;
    public FlagSecureReason X1;
    public int X2;
    public int X3;
    public int X4;
    public boolean X5;
    public j0 Y;
    public ImageView Y0;
    public final HashMap Y1;
    public int Y2;
    public int Y3;
    public int Y4;
    public float Y5;
    public ah.w Z;
    public org.telegram.ui.ActionBar.f1 Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public int Z4;
    public float Z5;
    public gz0 a;
    public org.telegram.ui.Components.dh0 a0;
    public org.telegram.ui.Components.q8 a1;
    public float a2;
    public int a3;
    public int a4;
    public long a5;
    public float a6;
    public org.telegram.ui.Components.ll0 b;
    public MessagesController.SavedMusicList b0;
    public float b1;
    public float b2;
    public int b3;
    public int b4;
    public boolean b5;
    public m11 b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public iz0 c;
    public org.telegram.ui.Components.vh0 c0;
    public int c1;
    public float c2;
    public int c3;
    public int c4;
    public boolean c5;
    public s11 c6;
    public a11 d;
    public org.telegram.ui.Cells.o d0;
    public o11 d1;
    public float d2;
    public int d3;
    public int d4;
    public String d5;
    public di.f4 d6;
    public l11 e;
    public pz0 e0;
    public long e1;
    public float e2;
    public int e3;
    public int e4;
    public String e5;
    public int e6;
    public final org.telegram.ui.ActionBar.j5[] f;
    public AnimatorSet f0;
    public long f1;
    public float f2;
    public int f3;
    public int f4;
    public String f5;
    public Boolean f6;
    public org.telegram.ui.Cells.y3 g0;
    public long g1;
    public float g2;
    public int g3;
    public int g4;
    public org.telegram.ui.Components.ch g5;
    public TLRPC.TL_emojiStatusCollectible g6;
    public String h;
    public ImageView h0;
    public boolean h1;
    public float h2;
    public int h3;
    public int h4;
    public final HashSet h5;
    public int h6;
    public ImageView i0;
    public long i1;
    public float i2;
    public int i3;
    public int i4;
    public CharacterStyle i5;
    public boolean i6;
    public ImageView j0;
    public boolean j1;
    public ValueAnimator j2;
    public int j3;
    public int j4;
    public final org.telegram.ui.Cells.c2 j5;
    public int j6;
    public ImageView k0;
    public boolean k1;
    public float k2;
    public int k3;
    public int k4;
    public final a01 k5;
    public int k6;
    public org.telegram.ui.Components.u11 l0;
    public boolean l1;
    public float l2;
    public int l3;
    public int l4;
    public boolean l5;
    public int l6;
    public org.telegram.ui.Components.fh0 m0;
    public long m1;
    public final float[] m2;
    public int m3;
    public int m4;
    public k01 m5;
    public final bh.f m6;
    public String n;
    public qz0 n0;
    public boolean n1;
    public boolean n2;
    public int n3;
    public int n4;
    public float n5;
    public final gh.d n6;
    public d11 o0;
    public boolean o1;
    public boolean o2;
    public int o3;
    public int o4;
    public float o5;
    public final bh.b o6;
    public org.telegram.ui.Components.i9 p0;
    public boolean p1;
    public boolean p2;
    public int p3;
    public int p4;
    public boolean p5;
    public final gh.b p6;
    public org.telegram.ui.Components.u40 q0;
    public boolean q1;
    public final Paint q2;
    public int q3;
    public int q4;
    public boolean q5;
    public final bh.b q6;
    public final org.telegram.ui.ActionBar.j5[] r;
    public int r0;
    public boolean r1;
    public boolean r2;
    public int r3;
    public int r4;
    public ImageReceiver r5;
    public ih.k r6;
    public org.telegram.ui.Components.do0 s;
    public org.telegram.ui.Components.u11 s0;
    public boolean s1;
    public fi.w0 s2;
    public int s3;
    public int s4;
    public FrameLayout s5;
    public uy0 s6;
    public org.telegram.ui.Components.sh0 t0;
    public boolean t1;
    public fi.s t2;
    public int t3;
    public int t4;
    public FrameLayout[] t5;
    public final ArrayList t6;
    public sz0 u0;
    public int u1;
    public TLRPC.ChatFull u2;
    public int u3;
    public int u4;
    public SpannableStringBuilder u5;
    public final RectF u6;
    public org.telegram.ui.Components.aj0 v;
    public zh.g0 v0;
    public boolean v1;
    public TLRPC.UserFull v2;
    public int v3;
    public int v4;
    public SpannableStringBuilder v5;
    public final RectF v6;
    public AnimatorSet w;
    public View w0;
    public boolean w1;
    public org.telegram.ui.Cells.f6 w2;
    public int w3;
    public int w4;
    public di.d[] w5;
    public Drawable x;
    public final org.telegram.ui.Components.f50 x0;
    public boolean x1;
    public boolean x2;
    public int x3;
    public int x4;
    public org.telegram.messenger.t8 x5;
    public final Drawable[] y;
    public final Paint y0;
    public int y1;
    public p11 y2;
    public int y3;
    public int y4;
    public FrameLayout y5;
    public org.telegram.ui.ActionBar.f6 z0;
    public boolean z1;
    public CharSequence z2;
    public int z3;
    public int z4;
    public di.d z5;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static void B0(ProfileActivity profileActivity) {
        RectF rectF = profileActivity.v6;
        bh.f fVar = profileActivity.m6;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (profileActivity.fragmentView.getMeasuredHeight() - profileActivity.l6) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        profileActivity.u6.set(0.0f, -dp, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.actionBar.getMeasuredHeight() + dp);
        rectF.set(0.0f, dp2, profileActivity.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(2, profileActivity.t6);
        fVar.e(profileActivity.s6, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.fragmentView.getMeasuredHeight());
    }

    public static void G0(ProfileActivity profileActivity, int i10) {
        boolean w02 = org.telegram.ui.Components.xu0.w0(profileActivity.O.getClosestTab());
        if (i10 == profileActivity.h6 && w02 == profileActivity.i6) {
            return;
        }
        profileActivity.h6 = i10;
        profileActivity.i6 = w02;
        if (w02) {
            if (i10 > 0) {
                profileActivity.w5[0].g(LocaleController.formatPluralString("HideStoriesFromAlbum", i10, new Object[0]), true, true);
                return;
            } else {
                profileActivity.w5[0].g(profileActivity.v5, true, true);
                return;
            }
        }
        if (i10 > 0 || !MessagesController.getInstance(profileActivity.currentAccount).storiesEnabled()) {
            profileActivity.w5[0].g(LocaleController.formatPluralString("ArchiveStories", i10, new Object[0]), true, true);
        } else {
            profileActivity.w5[0].g(profileActivity.u5, true, true);
        }
    }

    public static SpannableStringBuilder G3(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        e01 e01Var = new e01(9);
        e01Var.n = str;
        if (e01Var.c != null) {
            e01Var.c = null;
            e01Var.a();
        }
        e01Var.f = i10;
        spannableStringBuilder.setSpan(e01Var, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static ValueAnimator H0(final ProfileActivity profileActivity, final boolean z10) {
        org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.r;
        if (z10) {
            AndroidUtilities.requestAdjustResize(profileActivity.getParentActivity(), profileActivity.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.V1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.V1.cancel();
        }
        zh.g0 g0Var = profileActivity.v0;
        if (g0Var != null) {
            g0Var.setActive(!z10);
        }
        int i10 = 0;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(profileActivity.U1, z10 ? 0.0f : 1.0f);
        final float f7 = profileActivity.Q1;
        profileActivity.b.setTranslationY(f7);
        profileActivity.b.setVisibility(0);
        profileActivity.U0.setVisibility(0);
        profileActivity.a.setVisibility(0);
        profileActivity.k4(true);
        profileActivity.Y.setVisibility(0);
        profileActivity.f[1].setVisibility(0);
        j5VarArr[1].setVisibility(0);
        j5VarArr[3].setVisibility(0);
        profileActivity.actionBar.v(profileActivity.U1 > 0.5f);
        int i11 = profileActivity.U1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.v0 v0Var = profileActivity.T0;
        if (v0Var != null) {
            v0Var.setVisibility(i11);
        }
        profileActivity.U0.setVisibility(i11);
        profileActivity.U0.getSearchContainer().setVisibility(profileActivity.U1 <= 0.5f ? 0 : 8);
        profileActivity.b.setEmptyView(profileActivity.P);
        profileActivity.Y.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ez0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.l0(ProfileActivity.this, ofFloat, f7, z10);
            }
        });
        ofFloat.addListener(new d01(profileActivity, z10, i10));
        if (!z10) {
            profileActivity.U4 = true;
            profileActivity.F4();
            AndroidUtilities.requestAdjustNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.P.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.pr.f);
        profileActivity.V1 = ofFloat;
        return ofFloat;
    }

    public static void H4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(activity, 3, null);
        b2Var.g0 = false;
        b2Var.show();
        Utilities.globalQueue.postRunnable(new dm0(b2Var, z10, activity, 6));
    }

    public static void S0(ProfileActivity profileActivity, String str, StringBuilder sb2) {
        String[] supportedTypes;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
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

    public static void U(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.j5 j5Var) {
        ImageLocation forDocument;
        String str;
        org.telegram.ui.Components.o5[] o5VarArr = profileActivity.G;
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            of.f.s(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        sg.o1 o1Var = new sg.o1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.z0);
        j5Var.getLocationOnScreen(new int[2]);
        o1Var.v0 = j5Var.h0;
        o1Var.w0 = j5Var.i0;
        o1Var.z0 = j5Var.getScaleX();
        o1Var.x0 = j5Var.getLeft();
        o1Var.y0 = j5Var.getTop();
        o1Var.A0 = j5Var;
        Drawable rightDrawable = j5Var.getRightDrawable();
        org.telegram.ui.Components.o5 o5Var = o5VarArr[1];
        if (rightDrawable == o5Var && o5Var != null) {
            Drawable drawable = o5Var.f[0];
            if (drawable instanceof org.telegram.ui.Components.q5) {
                o1Var.z0 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.q5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(profileActivity.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.m6, 0.2f);
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
                    x9Var.setLayerNum(7);
                    x9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    x9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (((org.telegram.ui.Components.q5) o5VarArr[1].f[0]).c()) {
                        x9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, profileActivity.z0), PorterDuff.Mode.SRC_IN));
                        o1Var.C0 = MessageObject.getInputStickerSet(document);
                    } else {
                        o1Var.C0 = MessageObject.getInputStickerSet(document);
                    }
                    o1Var.B0 = x9Var;
                    o1Var.E0 = true;
                }
            }
        }
        profileActivity.showDialog(o1Var);
    }

    public static void V(ProfileActivity profileActivity) {
        org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.r;
        gz0 gz0Var = profileActivity.a;
        if (gz0Var != null) {
            int childCount = gz0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = profileActivity.a.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.za) {
                    ((org.telegram.ui.Cells.za) childAt).j(0);
                }
            }
            profileActivity.a.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, profileActivity.z0));
        }
        if (!profileActivity.p2) {
            org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[1];
            if (j5Var != null) {
                Object tag = j5Var.getTag();
                for (int i11 = 0; i11 < 2; i11++) {
                    if (tag instanceof Integer) {
                        j5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.j6.v0(((Integer) tag).intValue(), profileActivity.z0), Boolean.valueOf(profileActivity.J0[0])));
                    } else {
                        j5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, profileActivity.z0), Boolean.TRUE));
                    }
                }
            }
            Drawable drawable = profileActivity.x;
            if (drawable != null) {
                drawable.setColorFilter(profileActivity.Q5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pc, profileActivity.z0), PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.xl0 xl0Var = profileActivity.L;
            if (xl0Var != null) {
                xl0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h8, profileActivity.z0));
            }
            org.telegram.ui.ActionBar.j5 j5Var2 = profileActivity.f[1];
            if (j5Var2 != null) {
                j5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vh, profileActivity.z0));
            }
            org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
            if (kVar != null) {
                kVar.C(profileActivity.Q5 == null ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, profileActivity.z0) : -1, false);
                profileActivity.actionBar.B(profileActivity.Q5 != null ? 553648127 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f8, profileActivity.z0), false);
            }
        }
        profileActivity.X4();
        profileActivity.o5();
    }

    public static void V0(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.c2, 0.25f) / 0.25f;
        if (profileActivity.q1) {
            profileActivity.t0.setAlpha(1.0f - min);
            profileActivity.t0.setBlurIntensity(0.0f);
            profileActivity.t0.setGooeyEnabled(false);
        } else {
            profileActivity.t0.setPullProgress(profileActivity.c2);
            profileActivity.t0.setBlurIntensity(Math.min((w7.p.a(profileActivity.c2, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
            org.telegram.ui.Components.sh0 sh0Var = profileActivity.t0;
            float f7 = profileActivity.c2;
            sh0Var.setGooeyEnabled(f7 > 0.0f && f7 < 1.0f);
        }
        sz0 sz0Var = profileActivity.u0;
        if (sz0Var != null && profileActivity.J1 != 2) {
            float f10 = profileActivity.c2;
            sz0Var.setAlpha(f10 > 0.0f ? AndroidUtilities.lerp(1.0f, 0.0f, AndroidUtilities.ilerp(f10, 0.0f, 0.5f)) : 1.0f);
        }
        profileActivity.t0.setVisibility(profileActivity.c2 >= 1.0f ? 8 : 0);
    }

    public static /* synthetic */ void W(ProfileActivity profileActivity) {
        MessagesController.getInstance(profileActivity.currentAccount).deleteUserPhoto(null);
        profileActivity.V.K(0);
        profileActivity.W.K(0);
    }

    public static void X(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.qc Q = org.telegram.ui.Components.yc.a0(profileActivity).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
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
            org.telegram.messenger.w1.o(R.string.UnknownError, org.telegram.ui.Components.yc.a0(profileActivity), R.raw.error, 36);
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

    public static void Y(ProfileActivity profileActivity, int i10, float f7, float f10) {
        switch (i10) {
            case 0:
                boolean z10 = profileActivity.q1;
                if (!z10) {
                    if (profileActivity.e1 == 0) {
                        if (profileActivity.f1 != 0) {
                            if (!ChatObject.isForum(profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f1)))) {
                                if (!profileActivity.M3()) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", profileActivity.f1);
                                    if (profileActivity.getMessagesController().checkCanOpenChat(bundle, profileActivity)) {
                                        profileActivity.presentFragment(new co(bundle), false);
                                        break;
                                    }
                                }
                            } else {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", profileActivity.f1);
                                if (profileActivity.getMessagesController().checkCanOpenChat(bundle2, profileActivity)) {
                                    profileActivity.presentFragment(new co(bundle2), false);
                                    break;
                                }
                            }
                        }
                    } else {
                        profileActivity.x4();
                        break;
                    }
                } else if (z10) {
                    profileActivity.M3();
                    break;
                }
                break;
            case 1:
                profileActivity.r4(profileActivity.a0, f7, f10, true);
                break;
            case 2:
                profileActivity.y4();
                break;
            case 3:
                profileActivity.p4();
                break;
            case 4:
                profileActivity.s4();
                break;
            case 5:
            case 10:
            case 11:
                profileActivity.o4(false);
                break;
            case 6:
                profileActivity.o4(true);
                break;
            case 7:
                profileActivity.q4(true);
                break;
            case 8:
                e41.L(profileActivity.a(), profileActivity);
                break;
            case 9:
                profileActivity.i4(false);
                break;
            case 12:
                profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(profileActivity.getParentActivity(), 3, profileActivity.z0);
                b2Var.q(200L);
                MessagesController.getInstance(profileActivity.currentAccount).getStoriesController().k(profileActivity.a(), new bi.t2(9, profileActivity, b2Var), true, profileActivity.z0);
                break;
            case 13:
                profileActivity.n4(true);
                break;
            case 14:
                profileActivity.u4();
                break;
            case 15:
                TLRPC.User currentUser = profileActivity.getUserConfig().getCurrentUser();
                if (currentUser != null) {
                    org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(profileActivity, profileActivity.a0);
                    H.w = false;
                    H.i = 3;
                    H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.QrCode), new yb0(profileActivity, 22), false);
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new rl0(currentUser, 27), false);
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new yb0(profileActivity, 23), false);
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
                profileActivity.presentFragment(new i91(null));
                break;
        }
    }

    public static boolean Z(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_error tL_error) {
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(profileActivity.currentAccount).edit().putLong("dialog_join_requested_time_" + profileActivity.i1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        boolean z11 = ChatObject.isChannel(profileActivity.E2) && !profileActivity.E2.megagroup;
        int i10 = org.telegram.ui.Components.g80.r;
        org.telegram.ui.Components.g80.w(parentActivity, profileActivity, org.telegram.ui.Components.yc.a0(profileActivity), z11);
        if (!z10 || profileActivity.L4 != -1) {
            profileActivity.j5();
            a11 a11Var = profileActivity.d;
            if (a11Var != null) {
                a11Var.l();
            }
        }
        if (n2Var instanceof co) {
            ((co) n2Var).vb(false, true);
        }
        return false;
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document f7;
        org.telegram.ui.Components.qc h;
        if (profileActivity.J2 != null) {
            return;
        }
        if (!profileActivity.q1 || profileActivity.getMessagesController().premiumFeaturesBlocked()) {
            if (profileActivity.K3()) {
                return;
            }
            profileActivity.w4(false);
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
                long j3 = tL_forumTopic.icon_emoji_id;
                if (j3 == 0 || (f7 = org.telegram.ui.Components.q5.f(profileActivity.currentAccount, j3)) == null || (h = org.telegram.ui.Components.yc.a0(profileActivity).h(f7, 1, new cz0(profileActivity, 0))) == null) {
                    return;
                }
                h.j();
            }
        }
    }

    public static void b0(ProfileActivity profileActivity, Context context, long j3, View view, int i10, float f7, float f10) {
        TLRPC.User user;
        a11 a11Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.a.B0();
        if (i10 == profileActivity.S3) {
            TLRPC.User user2 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
            TLRPC.UserFull userFull = profileActivity.v2;
            if (userFull != null && userFull.starref_program != null) {
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                zh.o.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), clientUserId, profileActivity.e1, new lu(profileActivity, context, clientUserId, 2));
                return;
            } else {
                if (user2 == null || !user2.bot_can_edit) {
                    return;
                }
                profileActivity.presentFragment(new fi.m(profileActivity.e1));
                return;
            }
        }
        if (i10 == profileActivity.Q3) {
            boolean z10 = !profileActivity.getMessagesController().isDialogMuted(j3, profileActivity.g1);
            profileActivity.getNotificationsController().muteDialog(j3, profileActivity.g1, z10);
            org.telegram.ui.Components.yc.A(profileActivity, z10, null).j();
            profileActivity.a5();
            int i11 = profileActivity.Q3;
            if (i11 < 0 || (a11Var = profileActivity.d) == null) {
                return;
            }
            a11Var.m(i11);
            return;
        }
        if (i10 == profileActivity.Z3) {
            TLRPC.User user3 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user3.id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.d5);
            bundle.putString("first_name_card", profileActivity.e5);
            bundle.putString("last_name_card", profileActivity.f5);
            ss ssVar = new ss(bundle, profileActivity.z0);
            ssVar.O = new ly0(profileActivity, user3);
            profileActivity.presentFragment(ssVar);
            return;
        }
        if (i10 == profileActivity.W3) {
            TextView textView = (TextView) org.telegram.ui.Components.e5.i0(profileActivity.getParentActivity(), LocaleController.getString(R.string.DeleteReaction), LocaleController.getString(R.string.DeleteAlertReaction), LocaleController.getString(R.string.DeleteAlertReactionAll), LocaleController.getString(R.string.Delete), new cz0(profileActivity, 1), profileActivity.z0, false).d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                return;
            }
            return;
        }
        if (i10 == profileActivity.X3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ReportReaction2);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ReportAlertReaction);
            TLRPC.Chat chat = profileActivity.getMessagesController().getChat(Long.valueOf(-profileActivity.a5));
            org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
            if (chat != null && ChatObject.canBlockUsers(chat)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(profileActivity.getParentActivity(), 1, profileActivity.z0);
                z1VarArr[0] = z1Var;
                z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                z1VarArr[0].e(LocaleController.getString(R.string.BanUser), "", true, false, false);
                z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(z1VarArr[0], w7.x5.n(-1, -2));
                z1VarArr[0].setOnClickListener(new w20(z1VarArr, 2));
                alertDialog$Builder.n(linearLayout);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.ReportChat), new qv0(5, profileActivity, z1VarArr));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new sw0(1));
            TextView textView2 = (TextView) alertDialog$Builder.o().d(-1);
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                return;
            }
            return;
        }
        if (i10 == profileActivity.r4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", DialogObject.getEncryptedChatId(profileActivity.i1));
            profileActivity.presentFragment(new w70(bundle2));
            return;
        }
        if (i10 == profileActivity.q4) {
            profileActivity.showDialog(org.telegram.ui.Components.e5.V(profileActivity.getParentActivity(), profileActivity.D2, profileActivity.z0).a);
            return;
        }
        if (i10 == profileActivity.N3) {
            profileActivity.r4(view, f7, f10, false);
            return;
        }
        if (i10 == profileActivity.K4) {
            profileActivity.getMessagesController().unblockPeer(profileActivity.e1);
            if (org.telegram.ui.Components.yc.a(profileActivity)) {
                org.telegram.ui.Components.yc.d(profileActivity, false).j();
                return;
            }
            return;
        }
        if (i10 == profileActivity.a4) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        if (i10 == profileActivity.U3) {
            profileActivity.u4();
            return;
        }
        if (i10 == profileActivity.V3) {
            e41.L(profileActivity.a(), profileActivity);
            return;
        }
        if (i10 >= profileActivity.u4 && i10 < profileActivity.v4) {
            profileActivity.h(!profileActivity.C2.isEmpty() ? profileActivity.u2.participants.participants.get(((Integer) profileActivity.C2.get(i10 - profileActivity.u4)).intValue()) : profileActivity.u2.participants.participants.get(i10 - profileActivity.u4), false, false, view);
            return;
        }
        if (i10 == profileActivity.w4) {
            profileActivity.v4();
            return;
        }
        if (i10 == profileActivity.L3) {
            profileActivity.C4(f7, f10, i10, view);
            return;
        }
        if (i10 == profileActivity.l4) {
            if (profileActivity.E2 != null) {
                profileActivity.showDialog(new gi.k0(profileActivity, profileActivity.E2.linked_community_id, null, null));
                return;
            } else {
                if (profileActivity.e1 == 0 || (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1))) == null) {
                    return;
                }
                profileActivity.showDialog(new gi.k0(profileActivity, user.linked_community_id, null, null));
                return;
            }
        }
        if (i10 == profileActivity.I3) {
            if (profileActivity.u2.location instanceof TLRPC.TL_channelLocation) {
                id0 id0Var = new id0(5);
                long j10 = profileActivity.f1;
                TLRPC.TL_channelLocation tL_channelLocation = (TLRPC.TL_channelLocation) profileActivity.u2.location;
                id0Var.e0 = -j10;
                id0Var.z0 = tL_channelLocation;
                profileActivity.presentFragment(id0Var);
                return;
            }
            return;
        }
        if (i10 == profileActivity.L4) {
            profileActivity.q4(false);
            return;
        }
        if (i10 == profileActivity.x4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.f1);
            bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            vr vrVar = new vr(bundle3);
            vrVar.x0(profileActivity.u2);
            profileActivity.presentFragment(vrVar);
            return;
        }
        if (i10 == profileActivity.y4) {
            profileActivity.presentFragment(new zh0(profileActivity.f1));
            return;
        }
        if (i10 == profileActivity.z4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.f1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            vr vrVar2 = new vr(bundle4);
            vrVar2.x0(profileActivity.u2);
            profileActivity.presentFragment(vrVar2);
            return;
        }
        if (i10 == profileActivity.A4) {
            profileActivity.S0.performClick();
            return;
        }
        if (i10 == profileActivity.B4) {
            profileActivity.presentFragment(new zh.g(0, profileActivity.e1));
            return;
        }
        if (i10 == profileActivity.C4) {
            profileActivity.presentFragment(new zh.g(1, profileActivity.e1));
            return;
        }
        if (i10 == profileActivity.D4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.f1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new bb1(bundle5));
            return;
        }
        if (i10 == profileActivity.G4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.f1);
            bundle6.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            vr vrVar3 = new vr(bundle6);
            vrVar3.x0(profileActivity.u2);
            profileActivity.presentFragment(vrVar3);
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
                privacySettingsActivity.y0();
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
            profileActivity.presentFragment(new nc0());
            return;
        }
        if (i10 == profileActivity.n3) {
            profileActivity.presentFragment(new SessionsActivity(0));
            return;
        }
        if (i10 == profileActivity.q3) {
            profileActivity.showDialog(org.telegram.ui.Components.e5.U(profileActivity, profileActivity.z0));
            return;
        }
        if (i10 == profileActivity.r3) {
            of.f.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
            return;
        }
        if (i10 == profileActivity.s3) {
            of.f.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
            return;
        }
        if (i10 == profileActivity.v3) {
            H4(profileActivity.getParentActivity(), false);
            return;
        }
        if (i10 == profileActivity.w3) {
            H4(profileActivity.getParentActivity(), true);
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
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new ky0(profileActivity, 7));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            profileActivity.showDialog(alertDialog$Builder2.a);
            return;
        }
        if (i10 == profileActivity.g3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
            return;
        }
        if (i10 == profileActivity.V2) {
            profileActivity.presentFragment(new qa(null));
            return;
        }
        if (i10 == profileActivity.W2) {
            profileActivity.presentFragment(new UserInfoActivity());
            return;
        }
        if (i10 == profileActivity.T2) {
            profileActivity.presentFragment(new h(3));
            return;
        }
        if (i10 == profileActivity.O2) {
            profileActivity.u4();
            return;
        }
        if (i10 == profileActivity.c4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
            return;
        }
        if (i10 == profileActivity.d4) {
            profileActivity.presentFragment(new zh.v7());
            return;
        }
        if (i10 == profileActivity.e4) {
            profileActivity.presentFragment(new ei.i());
            return;
        }
        if (i10 == profileActivity.f4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
            return;
        }
        if (i10 == profileActivity.g4) {
            ug.n1.e0(0, BirthdayController.getInstance(profileActivity.currentAccount).getState());
            return;
        }
        if (i10 == profileActivity.botPermissionLocation) {
            fi.w0 w0Var = profileActivity.s2;
            if (w0Var != null) {
                w0Var.m(!w0Var.g(), new rx0(11, profileActivity, view));
                return;
            }
            return;
        }
        if (i10 == profileActivity.botPermissionBiometry) {
            fi.s sVar = profileActivity.t2;
            if (sVar != null) {
                boolean z11 = !sVar.e;
                sVar.f = true;
                sVar.e = z11;
                sVar.k();
                ((org.telegram.ui.Cells.r8) view).setChecked(profileActivity.t2.e);
                return;
            }
            return;
        }
        if (i10 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.setChecked(!r8Var.b());
            if (profileActivity.o4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.o4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().getInputUser(profileActivity.e1);
            boolean b10 = r8Var.b();
            toggleuseremojistatuspermission.enabled = b10;
            TLRPC.UserFull userFull2 = profileActivity.v2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = b10;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new bc0(15, profileActivity, r0));
            profileActivity.o4 = sendRequest;
            int[] iArr = {sendRequest};
            return;
        }
        if (i10 == profileActivity.O3) {
            profileActivity.N4 = !profileActivity.N4;
            profileActivity.F4();
            view.requestLayout();
            profileActivity.d.m(profileActivity.O3);
            int i12 = profileActivity.U5;
            if (i12 >= 0) {
                profileActivity.c.h1(i12, profileActivity.V5 - profileActivity.a.getPaddingTop());
                return;
            }
            return;
        }
        if (i10 == profileActivity.P3) {
            profileActivity.z4(false);
            return;
        }
        if (i10 == profileActivity.Q2) {
            if (profileActivity.v2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.v2.personal_channel_id);
            profileActivity.presentFragment(new co(bundle7));
            return;
        }
        if (i10 != profileActivity.U2) {
            if (i10 == profileActivity.H3) {
                profileActivity.I3(i10, view);
                return;
            } else {
                profileActivity.C4(f7, f10, i10, view);
                return;
            }
        }
        s11 s11Var = profileActivity.c6;
        if ((s11Var == null || !s11Var.a()) && !profileActivity.J3(i10, view)) {
            org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
            if (c9Var.d.getDrawable() != null) {
                profileActivity.t4(c9Var.getImageView());
            }
        }
    }

    public static void c0(ProfileActivity profileActivity, org.telegram.ui.Cells.z1[] z1VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().getInputUser(profileActivity.e1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().getInputPeer(profileActivity.a5);
        tL_messages_reportReaction.id = profileActivity.Z4;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new bi.c7(8));
        org.telegram.ui.Cells.z1 z1Var = z1VarArr[0];
        if (z1Var != null && z1Var.b()) {
            profileActivity.getMessagesController().deleteParticipantFromChat(-profileActivity.a5, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1)));
        }
        profileActivity.Z4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.yc.a0(profileActivity).E(profileActivity.z0).j();
    }

    public static /* synthetic */ void d0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.I2 = fileLocation;
            profileActivity.J2 = photoSize2.location;
            profileActivity.e0.h(ImageLocation.getForLocal(fileLocation), "50_50", profileActivity.p0, null);
            if (profileActivity.O2 != -1) {
                profileActivity.j5();
                a11 a11Var = profileActivity.d;
                if (a11Var != null) {
                    a11Var.l();
                }
                profileActivity.k4(true);
            }
            qz0 qz0Var = profileActivity.n0;
            ImageLocation forLocal = ImageLocation.getForLocal(profileActivity.J2);
            profileActivity.K2 = forLocal;
            qz0Var.A(forLocal, ImageLocation.getForLocal(profileActivity.I2));
            profileActivity.P4(true, false);
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
            profileActivity.S5 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new bc0(17, profileActivity, str));
        }
        profileActivity.actionBar.n().requestLayout();
    }

    public static void e0(ProfileActivity profileActivity, Boolean bool) {
        long j3 = profileActivity.e1;
        if (j3 == 0) {
            long j10 = profileActivity.f1;
            j3 = j10 != 0 ? -j10 : profileActivity.i1;
        }
        long j11 = j3;
        if (bool.booleanValue()) {
            MessagesController.getInstance(profileActivity.currentAccount).deleteAllReactionsFrom(profileActivity.a5, j11);
        } else {
            MessagesController.getInstance(profileActivity.currentAccount).deleteReactionsFromMessage(profileActivity.a5, j11, profileActivity.Z4);
        }
        profileActivity.Z4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(profileActivity.getParentActivity(), profileActivity.z0);
        ybVar.d(R.raw.chats_infotip, new String[0]);
        ybVar.b.setText(LocaleController.getString(R.string.ReactionDeleteSent));
        org.telegram.ui.Components.yc.a0(profileActivity).b(ybVar, 1500).j();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f0(ProfileActivity profileActivity, int i10) {
        boolean z10;
        if (i10 < 0) {
            return;
        }
        Object valueOf = Integer.valueOf(profileActivity.T2);
        l11 l11Var = profileActivity.e;
        if (!l11Var.w) {
            if (!l11Var.v.isEmpty()) {
                i10--;
            }
            if (i10 < 0 || i10 >= profileActivity.e.v.size()) {
                int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, profileActivity.e.v);
                if (f7 >= 0 && f7 < profileActivity.e.d.size()) {
                    valueOf = profileActivity.e.d.get(f7);
                    z10 = false;
                    if (!(valueOf instanceof k11)) {
                        k11 k11Var = (k11) valueOf;
                        org.telegram.ui.ActionBar.d5 parentLayout = profileActivity.getParentLayout();
                        k11Var.b.run();
                        AndroidUtilities.scrollToFragmentRow(parentLayout, k11Var.c);
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
        } else if (i10 < l11Var.r.size()) {
            valueOf = profileActivity.e.r.get(i10);
        } else {
            int f10 = com.google.android.gms.internal.vision.e2.f(1, i10, profileActivity.e.r);
            if (f10 >= 0 && f10 < profileActivity.e.s.size()) {
                valueOf = profileActivity.e.s.get(f10);
            }
        }
        z10 = true;
        if (!(valueOf instanceof k11)) {
        }
        if (z10) {
        }
    }

    public static void g0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.b0 == null) {
            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.currentAccount == profileActivity.currentAccount && MediaController.getInstance().currentSavedMusicList.dialogId == profileActivity.a()) {
                profileActivity.b0 = MediaController.getInstance().currentSavedMusicList;
            } else {
                MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(profileActivity.currentAccount, profileActivity.a());
                profileActivity.b0 = savedMusicList;
                TLRPC.UserFull userFull = profileActivity.v2;
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
        profileActivity.showDialog(new org.telegram.ui.Components.k8(profileActivity.getParentActivity(), profileActivity.z0));
    }

    public static void h0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.ac0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new yb0(profileActivity, 18), profileActivity.z0);
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean[], org.telegram.ui.ActionBar.f6] */
    public static void i0(ProfileActivity profileActivity) {
        Runnable runnable;
        LinearLayout linearLayout;
        int i10;
        TextView[] textViewArr;
        final int i11;
        final t3 t3Var;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.v2;
        if (userFull == null || userFull.stars_rating == null) {
            return;
        }
        ?? r62 = 0;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) profileActivity.getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
        f3Var.fixNavigationBar();
        runnable = f3Var.dismissRunnable;
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        linearLayout2.setOrientation(1);
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        final LimitPreviewView limitPreviewView = new LimitPreviewView(profileActivity.getParentActivity(), R.drawable.filled_rating_crown, 0, profileActivity.z0, 0);
        limitPreviewView.setHideNegativeValues(profileActivity.a() != UserConfig.getInstance(profileActivity.currentAccount).getClientUserId());
        limitPreviewView.setStarRating(userFull.stars_rating);
        limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
        linearLayout2.addView(limitPreviewView, w7.x5.t(-1, -2, 17, 0, 20, 0, 10));
        int i12 = 17;
        if (userFull.stars_my_pending_rating != null) {
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            linearLayout2.addView(frameLayout, w7.x5.t(-1, -2, 17, 40, -12, 40, 20));
            int i13 = 2;
            org.telegram.ui.Components.d90[] d90VarArr = new org.telegram.ui.Components.d90[2];
            int i14 = 0;
            while (true) {
                int i15 = 3;
                if (i14 >= i13) {
                    break;
                }
                org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(parentActivity, i15, r62);
                d90VarArr[i14] = xbVar;
                xbVar.setGravity(17);
                d90VarArr[i14].setTextSize(1, 12.0f);
                d90VarArr[i14].setTextColor(org.telegram.ui.ActionBar.j6.w0(r62, org.telegram.ui.ActionBar.j6.y6, false));
                d90VarArr[i14].setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(r62, org.telegram.ui.ActionBar.j6.gc, false));
                frameLayout.addView(d90VarArr[i14], w7.x5.e(-1, -1, 119));
                d90VarArr[i14].setAlpha(i14 == 0 ? 1.0f : 0.0f);
                d90VarArr[i14].setScaleX(i14 == 0 ? 1.0f : 0.8f);
                d90VarArr[i14].setScaleY(i14 == 0 ? 1.0f : 0.8f);
                i14++;
                r62 = 0;
                i13 = 2;
            }
            t3 t3Var2 = new t3(d90VarArr, i12);
            boolean z10 = profileActivity.a() == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId();
            long j3 = userFull.stars_rating.stars;
            TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
            boolean z11 = z10;
            long j10 = (-j3) - (tl_starsRating != null ? tl_starsRating.stars - j3 : 0L);
            int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(profileActivity.currentAccount).getCurrentTime()) / 86400);
            long j11 = userFull.stars_my_pending_rating.stars;
            linearLayout = linearLayout2;
            long j12 = userFull.stars_rating.stars;
            long j13 = j11 - j12;
            if ((j12 >= 0 || z11) && (!z11 || j10 <= 0)) {
                textViewArr = d90VarArr;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                i11 = 0;
                spannableStringBuilder.append(TextUtils.concat(LocaleController.formatPluralStringComma("StarRatingFuture", max), "\n", LocaleController.formatPluralStringComma("StarRatingFuturePendingPoints", (int) j13)));
                spannableStringBuilder.append((CharSequence) " ");
                t3Var = t3Var2;
                spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreview), new Runnable() { // from class: org.telegram.ui.zy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                t3Var.run(Boolean.TRUE);
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                t3Var.run(Boolean.FALSE);
                                break;
                        }
                    }
                }), true));
                textViewArr[0].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.az0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                t3Var.run(Boolean.TRUE);
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                t3Var.run(Boolean.FALSE);
                                break;
                        }
                    }
                });
                textViewArr[0].setText(spannableStringBuilder);
            } else {
                textViewArr = d90VarArr;
                i11 = 0;
                d90VarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                if (z11) {
                    textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarRatingLevelNegativeYou", (int) j10)));
                    t3Var = t3Var2;
                } else {
                    textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarRatingLevelNegativeOther, DialogObject.getName(profileActivity.a()))));
                    t3Var = t3Var2;
                    i11 = 0;
                }
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String formatPluralStringComma = LocaleController.formatPluralStringComma("StarRatingFuturePreview1", max);
            String formatPluralStringComma2 = LocaleController.formatPluralStringComma("StarRatingFuturePreview2", (int) j13);
            CharSequence[] charSequenceArr = new CharSequence[3];
            charSequenceArr[i11] = formatPluralStringComma;
            final int i16 = 1;
            charSequenceArr[1] = "\n";
            charSequenceArr[2] = formatPluralStringComma2;
            spannableStringBuilder2.append(TextUtils.concat(charSequenceArr));
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreviewBack), new Runnable() { // from class: org.telegram.ui.zy0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            TLRPC.UserFull userFull2 = userFull;
                            limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            t3Var.run(Boolean.TRUE);
                            break;
                        default:
                            TLRPC.UserFull userFull3 = userFull;
                            limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                            t3Var.run(Boolean.FALSE);
                            break;
                    }
                }
            }), true));
            textViewArr[1].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.az0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            TLRPC.UserFull userFull2 = userFull;
                            limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            t3Var.run(Boolean.TRUE);
                            break;
                        default:
                            TLRPC.UserFull userFull3 = userFull;
                            limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                            t3Var.run(Boolean.FALSE);
                            break;
                    }
                }
            });
            textViewArr[1].setText(spannableStringBuilder2);
        } else {
            linearLayout = linearLayout2;
        }
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarRatingTitle));
        textView.setTextSize(1, 20.0f);
        int i17 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i17, profileActivity.z0));
        LinearLayout linearLayout3 = linearLayout;
        linearLayout3.addView(textView, w7.x5.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        if (userFull.id == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
            org.telegram.messenger.w1.n(R.string.StarRatingSelfDescription, textView2);
            i10 = 1;
        } else {
            i10 = 1;
            org.telegram.messenger.wl.p(R.string.StarRatingDescription, new Object[]{DialogObject.getName(profileActivity.a())}, textView2);
        }
        textView2.setTextSize(i10, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i17, profileActivity.z0));
        linearLayout3.addView(textView2, w7.x5.t(-1, -2, 17, 20, 0, 20, 12));
        uw0 uw0Var = new uw0(parentActivity, profileActivity.z0);
        uw0Var.a.l(LocaleController.getString(R.string.StarRatingTitle1), false);
        int i18 = R.string.StarRatingDescription1;
        String string = LocaleController.getString(R.string.StarRatingAdded);
        int i19 = org.telegram.ui.ActionBar.j6.Oh;
        uw0Var.b.setText(LocaleController.formatSpannable(i18, G3(org.telegram.ui.ActionBar.j6.v0(i19, profileActivity.z0), string)));
        uw0Var.d.setVisibility(8);
        int i20 = R.drawable.menu_gift;
        ImageView imageView = uw0Var.c;
        imageView.setImageResource(i20);
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i17, profileActivity.z0));
        linearLayout3.addView(uw0Var, w7.x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        uw0 uw0Var2 = new uw0(parentActivity, profileActivity.z0);
        uw0Var2.a.l(LocaleController.getString(R.string.StarRatingTitle2), false);
        uw0Var2.b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription2, G3(org.telegram.ui.ActionBar.j6.v0(i19, profileActivity.z0), LocaleController.getString(R.string.StarRatingAdded))));
        uw0Var2.d.setVisibility(8);
        int i21 = R.drawable.menu_stars_gift;
        ImageView imageView2 = uw0Var2.c;
        imageView2.setImageResource(i21);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i17, profileActivity.z0));
        linearLayout3.addView(uw0Var2, w7.x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        uw0 uw0Var3 = new uw0(parentActivity, profileActivity.z0);
        uw0Var3.a.l(LocaleController.getString(R.string.StarRatingTitle3), false);
        uw0Var3.b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription3, G3(org.telegram.ui.ActionBar.j6.I.q() ? i0.a.d(0.25f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.m6, profileActivity.z0), -16777216) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, profileActivity.z0), LocaleController.getString(R.string.StarRatingDeduces))));
        uw0Var3.d.setVisibility(8);
        int i22 = R.drawable.menu_refund;
        ImageView imageView3 = uw0Var3.c;
        imageView3.setImageResource(i22);
        imageView3.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i17, profileActivity.z0));
        linearLayout3.addView(uw0Var3, w7.x5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        di.d dVar = new di.d(parentActivity, profileActivity.z0, true);
        dVar.setOnClickListener(new bz0(0, runnable));
        dVar.g(zh.w3.g2(LocaleController.getString(R.string.Understood)), false, true);
        linearLayout3.addView(dVar, w7.x5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        f3Var.customView = linearLayout3;
        f3Var.show();
    }

    public static void j0(ProfileActivity profileActivity, TLRPC.User user) {
        if (profileActivity.Z3 >= 0) {
            if (profileActivity.J4 == -1) {
                profileActivity.j5();
                profileActivity.d.l();
            } else {
                profileActivity.e5(false, false);
            }
        }
        if (profileActivity.J4 == -1) {
            if (profileActivity.n2 || AndroidUtilities.isTablet()) {
                profileActivity.a.setPadding(0, profileActivity.T3(), 0, 0);
                profileActivity.j2.cancel();
                float[] fArr = profileActivity.m2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.J4(1.0f);
                profileActivity.Q1 = profileActivity.T3();
            } else {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (profileActivity.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredWidth(), TLObject.FLAG_30);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    a11 a11Var = profileActivity.d;
                    if (i10 >= a11Var.e.N2) {
                        break;
                    }
                    s4.c1 g10 = a11Var.g(null, a11Var.j(i10));
                    View view = g10.a;
                    profileActivity.d.v(g10, i10);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i11 += view.getMeasuredHeight();
                    i10++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.T3() + i11) + currentActionBarHeight));
                gz0 gz0Var = profileActivity.a;
                gz0Var.setPadding(0, gz0Var.getPaddingTop(), 0, max);
            }
        }
        profileActivity.M.m(profileActivity.i1, user, 8);
    }

    public static /* synthetic */ void k0(ProfileActivity profileActivity, Context context, long j3, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            fi.e4.G0(context, profileActivity.currentAccount, profileActivity.v2.starref_program, profileActivity.getUserConfig().getClientUserId(), profileActivity.z0, false);
        } else {
            fi.e4.H0(context, profileActivity.currentAccount, connectedbotstarref, j3, profileActivity.z0);
        }
    }

    public static void l0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f7, boolean z10) {
        org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.r;
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
        profileActivity.P.setTranslationY(f7 * profileActivity.U1);
        profileActivity.a.setTranslationY((1.0f - profileActivity.U1) * f12);
        profileActivity.a.setScaleX(1.0f - ((1.0f - profileActivity.U1) * 0.01f));
        profileActivity.a.setScaleY(1.0f - ((1.0f - profileActivity.U1) * 0.01f));
        profileActivity.a.setAlpha(profileActivity.U1);
        profileActivity.k4(true);
        profileActivity.a.setAlpha(f10);
        profileActivity.b.setAlpha(1.0f - profileActivity.U1);
        profileActivity.b.setScaleX((profileActivity.U1 * 0.05f) + 1.0f);
        profileActivity.b.setScaleY((profileActivity.U1 * 0.05f) + 1.0f);
        profileActivity.P.setAlpha(1.0f - f10);
        profileActivity.Y.setAlpha(f10);
        profileActivity.e0.setAlpha(f10);
        sz0 sz0Var = profileActivity.u0;
        if (sz0Var != null) {
            sz0Var.setAlpha(f10);
        }
        profileActivity.f[1].setAlpha(f10);
        j5VarArr[1].setAlpha(f10);
        j5VarArr[3].setAlpha(f10);
        profileActivity.U0.getSearchField().setAlpha(f11);
        if (z10 && profileActivity.U1 < 0.7f) {
            org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
            if (v0Var.F.getWidth() != 0 && !v0Var.e.isFocused()) {
                v0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(v0Var.e);
            }
        }
        profileActivity.U0.getSearchContainer().setVisibility(profileActivity.U1 < 0.5f ? 0 : 8);
        int i10 = profileActivity.U1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.v0 v0Var2 = profileActivity.T0;
        if (v0Var2 != null) {
            v0Var2.setVisibility(i10);
            profileActivity.T0.setAlpha(f10);
        }
        profileActivity.U0.setVisibility(i10);
        profileActivity.actionBar.v(profileActivity.U1 < 0.5f);
        org.telegram.ui.ActionBar.v0 v0Var3 = profileActivity.T0;
        if (v0Var3 != null) {
            v0Var3.setAlpha(f10);
        }
        profileActivity.U0.setAlpha(f10);
        profileActivity.d1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void m0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.a01.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.z0);
    }

    public static ProfileActivity m4(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void n0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
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
                String n10 = a4.a.n(profileActivity.I2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(profileActivity.currentAccount, user, 1), false);
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
        qz0 qz0Var = profileActivity.n0;
        qz0Var.H0 = true;
        qz0Var.K0 = profileActivity.K2;
        qz0Var.q1 = null;
        qz0Var.r1 = null;
        qz0Var.setCreateThumbFromParent(false);
        profileActivity.i5(true);
        profileActivity.P4(false, true);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        profileActivity.getUserConfig().saveConfig(true);
    }

    public static void n1(ProfileActivity profileActivity, boolean z10) {
        org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.f;
        org.telegram.ui.ActionBar.j5[] j5VarArr2 = profileActivity.r;
        int i10 = z10 ? 8 : 0;
        profileActivity.a.setVisibility(i10);
        profileActivity.b.setVisibility(z10 ? 0 : 8);
        profileActivity.U0.getSearchContainer().setVisibility(z10 ? 0 : 8);
        zh.g0 g0Var = profileActivity.v0;
        if (g0Var != null) {
            g0Var.setActive(!z10);
        }
        profileActivity.actionBar.v(z10);
        profileActivity.Y.setVisibility(i10);
        sz0 sz0Var = profileActivity.u0;
        if (sz0Var != null) {
            sz0Var.setVisibility(i10);
        }
        j5VarArr[1].setVisibility(i10);
        j5VarArr2[1].setVisibility(i10);
        j5VarArr2[3].setVisibility(i10);
        org.telegram.ui.ActionBar.v0 v0Var = profileActivity.T0;
        if (v0Var != null) {
            v0Var.setAlpha(1.0f);
            profileActivity.T0.setVisibility(i10);
        }
        profileActivity.U0.setVisibility(i10);
        profileActivity.e0.setAlpha(1.0f);
        profileActivity.Y.setAlpha(1.0f);
        sz0 sz0Var2 = profileActivity.u0;
        if (sz0Var2 != null) {
            sz0Var2.setAlpha(1.0f);
        }
        zh.g0 g0Var2 = profileActivity.v0;
        if (g0Var2 != null) {
            g0Var2.setAlpha(1.0f);
        }
        j5VarArr[1].setAlpha(1.0f);
        j5VarArr2[1].setAlpha(1.0f);
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

    public static void s3(ProfileActivity profileActivity, boolean z10) {
        Drawable drawable = profileActivity.e0.getImageReceiver().getDrawable();
        String str = null;
        if (drawable instanceof org.telegram.ui.Components.q61) {
            profileActivity.e0.u(null, null, drawable);
            return;
        }
        if (drawable instanceof org.telegram.ui.Components.d6) {
            org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) drawable;
            profileActivity.e0.u(null, null, d6Var);
            if (z10) {
                d6Var.f(profileActivity.e0);
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

    public final void A3() {
        s4.c1 c1Var;
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
            gz0 gz0Var = this.a;
            View F = gz0Var.F(view);
            c1Var = (org.telegram.ui.Components.vk0) (F != null ? gz0Var.T(F) : null);
        }
        int top = view == null ? 0 : view.getTop();
        int b10 = c1Var != null ? c1Var.b() : -1;
        if (top < 0 || b10 != 0) {
            top = 0;
        }
        boolean z10 = this.q0 == null && this.actionBar.n0;
        int i11 = this.J4;
        if (i11 != -1 && !z10) {
            org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) this.a.K(i11);
            z10 = vk0Var != null && vk0Var.a.getTop() <= 0;
        }
        if (this.F5 != z10) {
            this.F5 = z10;
            AnimatorSet animatorSet = this.C5;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.D5;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            org.telegram.ui.ActionBar.v0 searchItem = this.O.getSearchItem();
            org.telegram.ui.Components.aj0 searchOptionsItem = this.O.getSearchOptionsItem();
            TextView saveItem = this.O.getSaveItem();
            int i12 = 11;
            if (this.F5) {
                m01 m01Var = this.O;
                if (m01Var.s0(m01Var.k0[0].F)) {
                    searchItem.setVisibility(0);
                }
                if (searchOptionsItem != null) {
                    searchOptionsItem.setVisibility(0);
                }
                m01 m01Var2 = this.O;
                int i13 = m01Var2.k0[0].F;
                if (i13 == 0 || org.telegram.ui.Components.xu0.p0(i13) || i13 == 11 || i13 == 13 || (i13 == 14 && m01Var2.V != null)) {
                    this.O.r0.setVisibility(0);
                    this.O.A(true, false);
                } else {
                    this.O.r0.setVisibility(4);
                    this.O.A(false, false);
                }
            } else {
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
                if (searchOptionsItem != null) {
                    searchOptionsItem.setVisibility(8);
                }
                if (saveItem != null) {
                    saveItem.setVisibility(8);
                }
            }
            l5(false);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.n().requestLayout();
            }
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.ActionBar.v0 v0Var = this.Q0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.T0, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 0.0f : 1.0f));
            org.telegram.ui.ActionBar.v0 v0Var2 = this.Q0;
            Property property2 = View.TRANSLATION_Y;
            arrayList.add(ObjectAnimator.ofFloat(v0Var2, (Property<org.telegram.ui.ActionBar.v0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.v0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.T0, (Property<org.telegram.ui.ActionBar.v0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.v0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchItem, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchItem, (Property<org.telegram.ui.ActionBar.v0, Float>) property2, z10 ? 0.0f : AndroidUtilities.dp(10.0f)));
            arrayList.add(ObjectAnimator.ofFloat(this.O.r0, (Property<ImageView, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.O.r0, (Property<ImageView, Float>) property2, z10 ? 0.0f : AndroidUtilities.dp(10.0f)));
            arrayList.add(ObjectAnimator.ofFloat(this.actionBar, this.G5, z10 ? 1.0f : 0.0f));
            org.telegram.ui.ActionBar.j5[] j5VarArr = this.r;
            arrayList.add(ObjectAnimator.ofFloat(j5VarArr[1], (Property<org.telegram.ui.ActionBar.j5, Float>) property, z10 ? 0.0f : 1.0f));
            this.O.I0.setOpen(z10);
            int i14 = 3;
            if (this.s1) {
                arrayList.add(ObjectAnimator.ofFloat(j5VarArr[3], (Property<org.telegram.ui.ActionBar.j5, Float>) property, z10 ? 0.0f : 1.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.do0, Float>) property, z10 ? 1.0f : 0.0f));
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this, this.j5, 0.0f));
            }
            if (this.u0 != null || this.v0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new py0(this, i14));
                arrayList.add(ofFloat);
            }
            C3();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.C5 = animatorSet3;
            animatorSet3.playTogether(arrayList);
            this.C5.setInterpolator(org.telegram.ui.Components.pr.f);
            this.C5.addListener(new org.telegram.ui.Components.pk0(i12, this, searchItem));
            this.C5.setDuration(150L);
            this.C5.start();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        }
        float f7 = top;
        if (this.Q1 == f7 || this.H1) {
            return;
        }
        this.Q1 = f7;
        this.d1.invalidate();
        if (this.J1 != 0) {
            this.M1 = this.Q1 > ((float) O3());
        }
        k4(true);
    }

    public final void A4(int i10, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        xz0 xz0Var = new xz0(this, user.id, this.f1, tL_chatAdminRights, this.E2.default_banned_rights, tL_chatBannedRights, str, i10, zArr, user);
        xz0Var.X0 = new yz0(this, i10, chatParticipant, z10, zArr);
        presentFragment(xz0Var);
    }

    @Override // org.telegram.ui.oy
    public final /* synthetic */ boolean B() {
        return false;
    }

    public final void B3() {
        int i10 = this.J1;
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.r;
        if (i10 == 1 && (!this.l5 || this.G1)) {
            this.Y5 = 0.0f;
        } else if (i10 == 2 && (!this.l5 || this.G1)) {
            org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[1];
            this.Y5 = j5Var == null ? 0.0f : j5Var.getAlpha();
        } else if (this.e1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            this.Y5 = (1.0f - this.n5) * this.k2;
        } else {
            this.Y5 = this.k2 * this.n5;
        }
        if (this.e1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
            if (this.q5) {
                org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[2];
                if (j5Var2 != null) {
                    j5Var2.setAlpha(this.Y5);
                }
                m11 m11Var = this.b6;
                if (m11Var != null) {
                    m11Var.e = 1.0f - this.Y5;
                    m11Var.invalidateSelf();
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.j5 j5Var3 = j5VarArr[2];
            if (j5Var3 != null) {
                j5Var3.setAlpha(0.0f);
            }
            m11 m11Var2 = this.b6;
            if (m11Var2 != null) {
                m11Var2.e = 1.0f;
                m11Var2.invalidateSelf();
                return;
            }
            return;
        }
        if (!this.p5) {
            org.telegram.ui.ActionBar.j5 j5Var4 = j5VarArr[2];
            if (j5Var4 != null) {
                j5Var4.setAlpha(0.0f);
                j5VarArr[3].setAlpha(0.0f);
            }
            m11 m11Var3 = this.b6;
            if (m11Var3 != null) {
                m11Var3.e = 1.0f;
                m11Var3.invalidateSelf();
                return;
            }
            return;
        }
        this.o5 = AndroidUtilities.dp(28.0f) * this.Y5;
        org.telegram.ui.ActionBar.j5 j5Var5 = j5VarArr[2];
        if (j5Var5 != null) {
            j5Var5.setAlpha(this.k2);
            j5VarArr[3].setAlpha(1.0f - this.k2);
            j5VarArr[1].setTranslationX(W3(this.Z5));
            this.Z.invalidate();
            m11 m11Var4 = this.b6;
            if (m11Var4 != null) {
                m11Var4.e = 1.0f - this.k2;
                m11Var4.invalidateSelf();
            }
        }
    }

    public final void B4(String str, org.telegram.ui.Cells.h hVar) {
        if (str.startsWith("@")) {
            getMessagesController().openByUserName(str.substring(1), this, 0, hVar);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            uy uyVar = new uy(null);
            uyVar.n2 = str;
            presentFragment(uyVar);
        } else {
            if (!str.startsWith("/") || this.parentLayout.getFragmentStack().size() <= 1) {
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if (n2Var instanceof co) {
                finishFragment();
                ((co) n2Var).Y.a1(null, str, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final void C(float f7) {
        org.telegram.ui.Cells.y3 y3Var = this.g0;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(f7);
        this.n0.O(this.K2, f7);
    }

    public final void C3() {
        org.telegram.ui.Components.hw0 hw0Var = this.T;
        if (hw0Var != null) {
            hw0Var.setVisibility(!this.F5 && this.H5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0472  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C4(float f7, float f10, int i10, View view) {
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
                    zz0 zz0Var = new zz0(this, getParentActivity(), sb2, sb2);
                    showDialog(zz0Var);
                    if (findUsername != null && !findUsername.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername.username = findUsername.username;
                        tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo, new ms0(this, findUsername, zz0Var, i11)), getClassGuid());
                        return true;
                    }
                } else if (!J3(i10, view3)) {
                    if (findUsername != null && !findUsername.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo2 = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername2 = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername2.username = findUsername.username;
                        tL_getCollectibleInfo2.collectible = tL_inputCollectibleUsername2;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo2, new bc0(16, this, findUsername)), getClassGuid());
                        return true;
                    }
                    try {
                        org.telegram.ui.Components.yc.a0(this).i(LocaleController.getString(R.string.UsernameCopied)).j();
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "@" + publicUsername));
                        return true;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return true;
                    }
                }
            }
            return false;
            return true;
        }
        if (i10 != this.H3) {
            int i14 = 2;
            if (i10 == this.G3 || i10 == this.T2) {
                if (!J3(i10, view3)) {
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.e1));
                    if (user2 != null && (str = user2.phone) != null && str.length() != 0 && getParentActivity() != null) {
                        if (i10 == this.G3 && user2.phone.startsWith("888")) {
                            TL_fragment.TL_inputCollectiblePhone tL_inputCollectiblePhone = new TL_fragment.TL_inputCollectiblePhone();
                            String str4 = user2.phone;
                            tL_inputCollectiblePhone.phone = str4;
                            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo3 = new TL_fragment.TL_getCollectibleInfo();
                            tL_getCollectibleInfo3.collectible = tL_inputCollectiblePhone;
                            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo3, new ms0(this, str4, user2, 5)), getClassGuid());
                            return true;
                        }
                        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(this, view3);
                        H.W(this.a.U0(view3, false));
                        H.w = false;
                        if (i10 == this.G3) {
                            TLRPC.UserFull userFull3 = this.v2;
                            if (userFull3 != null && userFull3.phone_calls_available) {
                                H.c(R.drawable.msg_calls, LocaleController.getString(R.string.CallViaTelegram), new iy0(this, user2, i12), false);
                                if (this.v2.video_calls_available) {
                                    H.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new iy0(this, user2, i14), false);
                                }
                            }
                            if (!this.b5) {
                                H.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.Call), new iy0(this, user2, 3), false);
                            }
                        }
                        H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new iy0(this, user2, i11), false);
                        if (this.b5) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AnonymousNumberNotice)));
                            int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                            int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                                int i15 = lastIndexOf - 1;
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), indexOf, i15, 33);
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I6, this.z0)), indexOf, i15, 33);
                            }
                            H.k();
                            H.p(13, AndroidUtilities.dp(200.0f), spannableStringBuilder);
                            if (H.z() instanceof TextView) {
                                TextView textView = (TextView) H.z();
                                textView.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, this.z0), 0, 6));
                                textView.setOnClickListener(new ah.f(22));
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
                    if (!J3(i10, view3)) {
                        if (view3 instanceof org.telegram.ui.Cells.j) {
                            org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view3;
                            if (jVar.W && jVar.T <= 0.0f) {
                                jVar.h();
                                return false;
                            }
                        }
                        String str5 = null;
                        if (i10 == this.I3) {
                            TLRPC.ChatFull chatFull = this.u2;
                            if (chatFull != null) {
                                TLRPC.ChannelLocation channelLocation = chatFull.location;
                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                    str5 = ((TLRPC.TL_channelLocation) channelLocation).address;
                                }
                            }
                        } else if (i10 == this.K3) {
                            TLRPC.ChatFull chatFull2 = this.u2;
                            if (chatFull2 != null) {
                                str5 = chatFull2.about;
                            }
                        } else {
                            TLRPC.UserFull userFull4 = this.v2;
                            if (userFull4 != null) {
                                str5 = userFull4.about;
                            }
                        }
                        String str6 = str5;
                        if (!TextUtils.isEmpty(str6)) {
                            String[] strArr = {TranslateController.UNKNOWN_LANGUAGE};
                            boolean isContextTranslateEnabled = MessagesController.getInstance(this.currentAccount).getTranslateController().isContextTranslateEnabled();
                            boolean[] zArr = {i10 == this.W2 || i10 == this.K3 || i10 == this.J3};
                            String B = org.telegram.ui.Components.u31.B();
                            hg.e1 e1Var = new hg.e1(this, view3, str6, i10, zArr, strArr, B);
                            if (!zArr[0]) {
                                e1Var.run();
                                return true;
                            }
                            if (LanguageDetector.hasSupport()) {
                                LanguageDetector.detectLanguage(str6, new org.telegram.messenger.lj(this, strArr, zArr, B, isContextTranslateEnabled, e1Var), new vl0(e1Var, 12));
                                return true;
                            }
                            e1Var.run();
                            return true;
                        }
                    }
                    return true;
                }
            } else if ((i10 == this.O3 || i10 == this.P3) && getParentActivity() != null && (userFull2 = this.v2) != null) {
                if (i10 != this.O3) {
                    if (i10 == this.P3 && !J3(i10, view3)) {
                        TLRPC.TL_businessLocation tL_businessLocation = this.v2.business_location;
                        if (tL_businessLocation != null) {
                            str2 = tL_businessLocation.address;
                            String str7 = str2;
                            AtomicReference atomicReference = new AtomicReference();
                            org.telegram.ui.Components.mo moVar = new org.telegram.ui.Components.mo(getParentActivity(), R.drawable.popup_fixed_alert, i13, this.z0, 1);
                            moVar.U = new Path();
                            moVar.setFitItems(true);
                            org.telegram.ui.ActionBar.v0.c(false, false, moVar, R.drawable.msg_copy, LocaleController.getString(R.string.Copy), false, this.z0).setOnClickListener(new bi.b7(this, atomicReference, str7, i10, 5));
                            org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(moVar, -2, -2);
                            n1Var.e = true;
                            n1Var.c = 220;
                            n1Var.setOutsideTouchable(true);
                            n1Var.setClippingEnabled(true);
                            n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                            n1Var.setFocusable(true);
                            moVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            n1Var.setInputMethodMode(2);
                            n1Var.getContentView().setFocusableInTouchMode(true);
                            atomicReference.set(n1Var);
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
                            n1Var.showAtLocation(getFragmentView(), 0, (int) (f11 - (moVar.getMeasuredWidth() / 2.0f)), (int) f12);
                            n1Var.b();
                            return true;
                        }
                    }
                    return true;
                }
                TL_account.TL_businessWorkHours tL_businessWorkHours = userFull2.business_work_hours;
                if (tL_businessWorkHours != null) {
                    str2 = ig.g1.f0(this.currentAccount, userFull2.user, tL_businessWorkHours);
                    String str72 = str2;
                    AtomicReference atomicReference2 = new AtomicReference();
                    org.telegram.ui.Components.mo moVar2 = new org.telegram.ui.Components.mo(getParentActivity(), R.drawable.popup_fixed_alert, i13, this.z0, 1);
                    moVar2.U = new Path();
                    moVar2.setFitItems(true);
                    org.telegram.ui.ActionBar.v0.c(false, false, moVar2, R.drawable.msg_copy, LocaleController.getString(R.string.Copy), false, this.z0).setOnClickListener(new bi.b7(this, atomicReference2, str72, i10, 5));
                    org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(moVar2, -2, -2);
                    n1Var2.e = true;
                    n1Var2.c = 220;
                    n1Var2.setOutsideTouchable(true);
                    n1Var2.setClippingEnabled(true);
                    n1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                    n1Var2.setFocusable(true);
                    moVar2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    n1Var2.setInputMethodMode(2);
                    n1Var2.getContentView().setFocusableInTouchMode(true);
                    atomicReference2.set(n1Var2);
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
                    n1Var2.showAtLocation(getFragmentView(), 0, (int) (f11 - (moVar2.getMeasuredWidth() / 2.0f)), (int) f12);
                    n1Var2.b();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.jt0
    public final void D() {
        G4(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0804  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D3(boolean z10) {
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
        boolean z24;
        boolean z25;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        boolean z26;
        TLRPC.ChatFull chatFull2;
        org.telegram.ui.Components.dh0 dh0Var;
        d11 d11Var;
        m01 m01Var;
        boolean z27;
        org.telegram.ui.Components.dh0 dh0Var2;
        boolean z28;
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
                    org.telegram.ui.Components.dh0 dh0Var3 = this.a0;
                    if (dh0Var3 != null) {
                        this.N0 = !(dh0Var3.H == 6);
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
                W4();
                if (this.s1) {
                    this.X0 = this.T0.e(43, R.drawable.menu_username_change, LocaleController.getString(R.string.ProfileUsernameEdit));
                    this.W0 = this.T0.e(42, R.drawable.msg_link2, LocaleController.getString(R.string.ProfileCopyLink));
                    c5();
                }
                z11 = false;
                z28 = false;
                z13 = true;
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
                        E3(context);
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
                        E3(context);
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
                        if (e4()) {
                            this.T0.K(44);
                        } else {
                            this.T0.r(44);
                        }
                        org.telegram.ui.ActionBar.f1 e7 = this.T0.e(24, R.drawable.msg_report, LocaleController.getString(R.string.ReportBot));
                        int i10 = org.telegram.ui.ActionBar.j6.p7;
                        e7.c(org.telegram.ui.ActionBar.j6.v0(i10, this.z0), org.telegram.ui.ActionBar.j6.v0(i10, this.z0));
                        if (this.k1) {
                            this.T0.e(2, R.drawable.msg_retry, LocaleController.getString(R.string.BotRestart));
                        } else {
                            this.T0.e(2, R.drawable.msg_block2, LocaleController.getString(R.string.DeleteAndBlock)).c(org.telegram.ui.ActionBar.j6.v0(i10, this.z0), org.telegram.ui.ActionBar.j6.v0(i10, this.z0));
                        }
                    } else {
                        this.T0.e(2, R.drawable.msg_block, LocaleController.getString(!this.k1 ? R.string.BlockContact : R.string.Unblock));
                    }
                    if (!UserObject.isDeleted(user) && !this.r2 && this.D2 == null && !this.k1) {
                        j3 = this.e1;
                        if (j3 != 333000 && j3 != 777000 && j3 != 42777) {
                            if (!BuildVars.IS_BILLING_UNAVAILABLE || user.self || user.bot || MessagesController.isSupportUser(user) || getMessagesController().premiumPurchaseBlocked()) {
                                z28 = false;
                            } else {
                                zh.s5.y(this.currentAccount, false).V();
                                this.T0.e(38, R.drawable.msg_gift_premium, LocaleController.getString(R.string.ProfileSendAGift));
                                z28 = true;
                            }
                            this.T0.e(20, R.drawable.msg_secret, LocaleController.getString(R.string.StartEncryptedChat));
                            this.T0.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.e1)));
                            if (this.v2 != null) {
                                this.T0.e(46, R.drawable.menu_share_off_24, LocaleController.getString(R.string.DisableSharing));
                                this.T0.e(47, R.drawable.menu_share_on_24, LocaleController.getString(R.string.EnableSharing));
                                TLRPC.UserFull userFull2 = this.v2;
                                boolean z29 = (userFull2.noforwards_my_enabled || userFull2.noforwards_peer_enabled) ? false : true;
                                this.T0.I(46, z29);
                                this.T0.I(47, !z29);
                            }
                            if (!this.r2 && getContactsController().contactsDict.get(Long.valueOf(this.e1)) != null) {
                                this.T0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                            }
                            z13 = false;
                        }
                    }
                    z28 = false;
                    if (!this.r2) {
                        this.T0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    }
                    z13 = false;
                }
                z11 = false;
                if (!UserObject.isDeleted(user)) {
                    j3 = this.e1;
                    if (j3 != 333000) {
                        if (BuildVars.IS_BILLING_UNAVAILABLE) {
                        }
                        z28 = false;
                        this.T0.e(20, R.drawable.msg_secret, LocaleController.getString(R.string.StartEncryptedChat));
                        this.T0.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.e1)));
                        if (this.v2 != null) {
                        }
                        if (!this.r2) {
                        }
                        z13 = false;
                    }
                }
                z28 = false;
                if (!this.r2) {
                }
                z13 = false;
            }
            z14 = z28;
            z12 = false;
        } else {
            if (this.f1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f1));
                this.p1 = false;
                if (this.g1 == 0 && ChatObject.canChangeChatInfo(chat)) {
                    E3(context);
                }
                if (!ChatObject.isChannel(chat)) {
                    if (this.u2 != null) {
                        if (ChatObject.canManageCalls(chat) && this.u2.call == null) {
                            this.T0.e(15, R.drawable.msg_voicechat, LocaleController.getString(R.string.StartVoipChat));
                            this.p1 = true;
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        ChatObject.Call groupCall = getMessagesController().getGroupCall(this.f1, false);
                        this.L0 = groupCall != null;
                        if (groupCall != null || z19) {
                            z15 = true;
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
                            z12 = z15;
                            z11 = false;
                            z13 = false;
                            z14 = false;
                            z16 = false;
                            z17 = false;
                            z18 = true;
                            z23 = false;
                            if (this.q0 == null) {
                            }
                            if (g4()) {
                            }
                            if (this.e1 != 0) {
                                org.telegram.ui.ActionBar.f1 e10 = this.T0.e(24, R.drawable.msg_report, LocaleController.getString(R.string.ReportBot));
                                int i11 = org.telegram.ui.ActionBar.j6.p7;
                                e10.c(org.telegram.ui.ActionBar.j6.v0(i11, this.z0), org.telegram.ui.ActionBar.j6.v0(i11, this.z0));
                            }
                            if (z13) {
                                this.T0.e(31, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
                            }
                            if (!this.p2) {
                            }
                            this.K0 = this.L0;
                            dh0Var = this.a0;
                            if (dh0Var != null) {
                            }
                            if (!this.F5) {
                            }
                            d11Var = this.o0;
                            if (d11Var != null) {
                                if (this.N0) {
                                }
                                if (this.L0) {
                                }
                                if (this.M0) {
                                }
                            }
                            m01Var = this.O;
                            if (m01Var != null) {
                            }
                            l5(false);
                        }
                    }
                    z15 = false;
                    if (ChatObject.canChangeChatInfo(chat)) {
                    }
                    if (!ChatObject.isKickedFromChat(chat)) {
                        this.A1 = true;
                        this.T0.e(17, R.drawable.msg_search, LocaleController.getString(R.string.SearchMembers));
                    }
                    if (this.g1 == 0) {
                    }
                    this.T0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.DeleteAndExit));
                    z12 = z15;
                    z11 = false;
                    z13 = false;
                    z14 = false;
                    z16 = false;
                    z17 = false;
                    z18 = true;
                    z23 = false;
                    if (this.q0 == null) {
                    }
                    if (g4()) {
                    }
                    if (this.e1 != 0) {
                    }
                    if (z13) {
                    }
                    if (!this.p2) {
                    }
                    this.K0 = this.L0;
                    dh0Var = this.a0;
                    if (dh0Var != null) {
                    }
                    if (!this.F5) {
                    }
                    d11Var = this.o0;
                    if (d11Var != null) {
                    }
                    m01Var = this.O;
                    if (m01Var != null) {
                    }
                    l5(false);
                }
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
                            z21 = true;
                            chatFull2 = this.u2;
                            if ((!chatFull2.can_view_stats || chatFull2.can_view_revenue || chatFull2.can_view_stars_revenue || getMessagesController().getStoriesController().j(a())) && this.g1 == 0) {
                                this.T0.e(19, R.drawable.msg_stats, LocaleController.getString(R.string.Statistics));
                            }
                            ChatObject.Call groupCall2 = getMessagesController().getGroupCall(this.f1, false);
                            this.L0 = groupCall2 == null;
                            z20 = groupCall2 == null || z26;
                        } else {
                            z26 = true;
                        }
                    } else {
                        z26 = false;
                    }
                    z21 = false;
                    chatFull2 = this.u2;
                    if (!chatFull2.can_view_stats) {
                    }
                    this.T0.e(19, R.drawable.msg_stats, LocaleController.getString(R.string.Statistics));
                    ChatObject.Call groupCall22 = getMessagesController().getGroupCall(this.f1, false);
                    this.L0 = groupCall22 == null;
                    if (groupCall22 == null) {
                    }
                } else {
                    z20 = false;
                    z21 = false;
                }
                getMessagesController().getStoriesController().getClass();
                if (chat == null || !ChatObject.isBoostSupported(chat) || (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.post_stories))) {
                    getMessagesController().getStoriesController().getClass();
                    if (chat != null && ChatObject.isBoostSupported(chat) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories))) {
                        this.T0.e(39, R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories));
                    }
                    z22 = false;
                } else {
                    this.T0.e(39, R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories));
                    z22 = true;
                }
                if (chat.megagroup) {
                    TLRPC.ChatFull chatFull3 = this.u2;
                    if (chatFull3 == null || !chatFull3.participants_hidden || ChatObject.hasAdminRights(chat)) {
                        this.A1 = true;
                        this.T0.e(17, R.drawable.msg_search, LocaleController.getString(R.string.SearchMembers));
                    }
                    if (this.q1) {
                        z23 = z21;
                        if (ChatObject.canDeleteTopic(this.currentAccount, chat, this.g1)) {
                            this.T0.e(23, R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1));
                        }
                    } else {
                        z23 = z21;
                    }
                    if (this.g1 == 0) {
                        this.T0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    }
                    if (chat.creator) {
                        this.T0.a(-1);
                        this.T0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMega));
                        this.T0.e(45, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteMega)).c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, this.z0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, this.z0));
                    } else if (chat.left || chat.kicked || this.q1) {
                        z12 = z20;
                        z16 = z22;
                        z11 = false;
                        z13 = false;
                        z14 = false;
                        z17 = false;
                        z18 = false;
                    } else {
                        this.T0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMega));
                    }
                    z12 = z20;
                    z16 = z22;
                    z11 = false;
                    z13 = false;
                    z14 = false;
                    z17 = false;
                    z18 = true;
                } else {
                    z23 = z21;
                    if (ChatObject.isPublic(chat)) {
                        this.T0.e(10, R.drawable.msg_share, LocaleController.getString(R.string.BotShare));
                        z24 = !chat.creator;
                    } else {
                        z24 = false;
                    }
                    if (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked()) {
                        z14 = false;
                    } else {
                        zh.s5.y(this.currentAccount, false).V();
                        this.T0.e(38, R.drawable.msg_gift_premium, LocaleController.getString(R.string.ProfileSendAGiftToChannel));
                        org.telegram.ui.ActionBar.v0 v0Var = this.T0;
                        TLRPC.ChatFull chatFull4 = this.u2;
                        v0Var.I(38, chatFull4 != null && chatFull4.stargifts_available);
                        z14 = true;
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
                        this.T0.e(45, R.drawable.msg_delete, LocaleController.getString(R.string.ChannelDelete)).c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, this.z0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, this.z0));
                    } else if (chat2.left || chat2.kicked) {
                        boolean z30 = z24;
                        z12 = z20;
                        z11 = z30;
                        z17 = z25;
                        z18 = false;
                        z16 = z22;
                        z13 = false;
                    } else {
                        this.T0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveChannel));
                    }
                    boolean z31 = z24;
                    z12 = z20;
                    z11 = z31;
                    z17 = z25;
                    z18 = true;
                    z16 = z22;
                    z13 = false;
                }
                if (this.q0 == null) {
                    this.T0.e(33, R.drawable.msg_openprofile, LocaleController.getString(R.string.SetAsMain));
                    this.T0.e(21, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery));
                    this.T0.e(35, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
                } else {
                    this.T0.e(21, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery));
                }
                if (g4()) {
                    this.T0.r(21);
                }
                if (this.e1 != 0 && !this.r2 && !this.s1) {
                    org.telegram.ui.ActionBar.f1 e102 = this.T0.e(24, R.drawable.msg_report, LocaleController.getString(R.string.ReportBot));
                    int i112 = org.telegram.ui.ActionBar.j6.p7;
                    e102.c(org.telegram.ui.ActionBar.j6.v0(i112, this.z0), org.telegram.ui.ActionBar.j6.v0(i112, this.z0));
                }
                if (z13 && !this.s1) {
                    this.T0.e(31, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
                }
                if (!this.p2) {
                    this.T0.r(21);
                    this.T0.r(33);
                    this.T0.K(36);
                    this.T0.r(34);
                    this.T0.r(35);
                }
                this.K0 = this.L0;
                dh0Var = this.a0;
                if (dh0Var != null) {
                    dh0Var.I = true;
                    dh0Var.o(4, z11);
                    this.a0.o(5, this.L0);
                    this.a0.o(6, this.M0);
                    this.a0.o(2, z17);
                    this.a0.o(9, z18);
                    this.a0.o(12, z16);
                    this.a0.o(10, z12);
                    this.a0.o(11, z23);
                    this.a0.o(3, z14);
                    this.M0 = false;
                    this.L0 = false;
                    if (!z17) {
                        if (this.q1) {
                            this.a0.o(0, true);
                        } else if (this.f1 != 0) {
                            TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(this.f1));
                            if (ChatObject.isForum(chat3) || ChatObject.isMegagroup(chat3)) {
                                z27 = false;
                                this.a0.o(0, true);
                            } else if (!ChatObject.isChannel(chat3)) {
                                z27 = false;
                                this.a0.o(0, true);
                            }
                            dh0Var2 = this.a0;
                            if (dh0Var2.I) {
                                dh0Var2.I = z27;
                                dh0Var2.d();
                            }
                        }
                    }
                    z27 = false;
                    dh0Var2 = this.a0;
                    if (dh0Var2.I) {
                    }
                }
                if (!this.F5) {
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
                d11Var = this.o0;
                if (d11Var != null && d11Var.h && !d11Var.d.isRunning()) {
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
                m01Var = this.O;
                if (m01Var != null) {
                    m01Var.getSearchItem().requestLayout();
                }
                l5(false);
            }
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
        }
        z16 = false;
        z17 = false;
        z18 = false;
        z23 = false;
        if (this.q0 == null) {
        }
        if (g4()) {
        }
        if (this.e1 != 0) {
        }
        if (z13) {
        }
        if (!this.p2) {
        }
        this.K0 = this.L0;
        dh0Var = this.a0;
        if (dh0Var != null) {
        }
        if (!this.F5) {
        }
        d11Var = this.o0;
        if (d11Var != null) {
        }
        m01Var = this.O;
        if (m01Var != null) {
        }
        l5(false);
    }

    public final void D4() {
        ValueAnimator valueAnimator;
        if (!this.p2 || (valueAnimator = this.j2) == null || !valueAnimator.isRunning()) {
            E4(y3(), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        } else {
            this.e2 = this.K5;
            this.g2 = this.L5;
        }
    }

    public final void E3(Context context) {
        this.a1 = new org.telegram.ui.Components.q8(context, this.T0.getPopupLayout().getSwipeBack(), new fz0(this), false, 0, this.z0);
        if (this.i1 > 0 || this.e1 > 0) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, this.z0);
            org.telegram.ui.Components.q8 q8Var = this.a1;
            org.telegram.ui.Components.d90 d90Var = q8Var.e;
            if (d90Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AutoDeletePopupDescription));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.AutoDeletePopupDescription2), v02, new org.telegram.ui.Components.pg(q8Var, 10)));
                d90Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.v2;
        org.telegram.ui.Components.u11 a2 = org.telegram.ui.Components.u11.a((userFull == null && this.u2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.u2.ttl_period);
        this.s0 = a2;
        this.Z0 = this.T0.i(0, a2, LocaleController.getString(R.string.AutoDeletePopupTitle), this.a1.a);
        this.T0.a(-1);
        T4();
    }

    public final void E4(float f7, float f10) {
        float max = Math.max(0.0f, Math.min(1.0f, (this.Q1 - T3()) / ((this.a.getMeasuredWidth() - f10) - U3())));
        float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (AndroidUtilities.dp(42.0f) * ((this.Q1 >= ((float) T3()) || max >= 0.33f) ? AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) : com.google.android.gms.internal.vision.e2.y(f7, 72.0f, 24.0f, 42.0f)))) * f7) + ((float) Math.floor(this.actionBar.getTranslationY() + ((((1.0f + f7) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f)) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f))));
        this.e2 = (AndroidUtilities.dp(7.0f) * f7) + AndroidUtilities.dp(1.3f) + dpf2;
        this.g2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * f7) + dpf2 + AndroidUtilities.dp(24.0f);
    }

    public final void F3() {
        if (this.fragmentView == null || !this.X5 || this.y2 == null || getParentActivity() == null) {
            return;
        }
        s11 s11Var = this.c6;
        if (s11Var != null) {
            s11Var.b(this.y2);
            this.c6.invalidate();
        } else {
            s11 s11Var2 = new s11(this, this.y2);
            this.c6 = s11Var2;
            ((FrameLayout) this.fragmentView).addView(s11Var2, w7.x5.e(-1, -1, 55));
        }
    }

    public final void F4() {
        gz0 gz0Var = this.a;
        if (gz0Var == null || this.c == null || gz0Var.getChildCount() <= 0 || this.W5) {
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
            this.U5 = i11;
            int top = view.getTop();
            this.V5 = top;
            if (this.U5 == 0 && !this.o2 && top > T3()) {
                this.V5 = T3();
            }
            this.c.h1(i11, view.getTop() - this.a.getPaddingTop());
        }
    }

    public final void G4(boolean z10) {
        int i10 = this.J4;
        if (i10 >= 0) {
            if (!z10) {
                this.c.h1(i10, -this.a.getPaddingTop());
                return;
            }
            ki.p pVar = new ki.p(getParentActivity(), 2, 0.6f);
            pVar.a = this.J4;
            pVar.p = -this.a.getPaddingTop();
            this.c.w0(pVar);
        }
    }

    public final void H3(float f7) {
        ValueAnimator ofFloat;
        int i10 = 1;
        boolean z10 = f7 > 0.0f;
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.T5;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.T5 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.x0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new py0(this, i10));
        this.T5.playTogether(arrayList);
        this.T5.setDuration(z10 ? 150L : 220L);
        if (!z10) {
            this.T5.addListener(new c01(this, 4));
        }
        this.T5.start();
    }

    public final void I3(int i10, View view) {
        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(this, view);
        H.W(this.a.U0(view, false));
        H.w = false;
        H.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new yb0(this, 25), this.v2 != null);
        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Edit), new yb0(this, 26), false);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.m8(this, i10, 24), true);
        H.Z();
    }

    public final void I4() {
        org.telegram.ui.Components.dh0 dh0Var = this.a0;
        if (dh0Var == null) {
            return;
        }
        if (this.s1) {
            dh0Var.H = 6;
            return;
        }
        if (this.q1) {
            dh0Var.H = 5;
            return;
        }
        if (this.r2) {
            dh0Var.H = 2;
            return;
        }
        if (this.e1 != 0) {
            dh0Var.H = 0;
            return;
        }
        if (this.f1 != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f1));
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

    public final boolean J3(final int i10, View view) {
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
                    str = ig.g1.f0(this.currentAccount, currentUser, userFull.business_work_hours);
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
                    str = i10 == this.G3 ? currentUser.phone : i10 == this.U2 ? UserInfoActivity.Z(this.v2.birthday) : null;
                }
                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(this, view);
                H.W(this.a.U0(view, false));
                H.w = false;
                H.i = 3;
                if (i10 == this.P3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, LocaleController.getString(R.string.ProfileLocationView), new yb0(this, 5), false);
                    }
                    H.c(R.drawable.msg_map, LocaleController.getString(R.string.ProfileLocationMaps), new yb0(this, 7), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, string, new rl0(str, 25), false);
                }
                if (i10 == this.O3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileHoursEdit), new yb0(this, 8), false);
                    final int i11 = 0;
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileHoursRemove), new Runnable(this) { // from class: org.telegram.ui.oy0
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
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.ry0
                                        @Override // org.telegram.ui.ActionBar.a2
                                        public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i14) {
                                            switch (i12) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull3 = userFull2;
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    ProfileActivity profileActivity2 = profileActivity;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new ty0(profileActivity2, 0));
                                                    profileActivity2.j5();
                                                    profileActivity2.d.u(i13);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull2;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ty0(profileActivity3, 1));
                                                    profileActivity3.j5();
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
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.ry0
                                        @Override // org.telegram.ui.ActionBar.a2
                                        public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i142) {
                                            switch (i14) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new ty0(profileActivity22, 0));
                                                    profileActivity22.j5();
                                                    profileActivity22.d.u(i15);
                                                    profileActivity22.getMessagesStorage().updateUserInfo(userFull32, false);
                                                    break;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ty0(profileActivity3, 1));
                                                    profileActivity3.j5();
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
                } else if (i10 == this.P3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileLocationEdit), new yb0(this, 9), false);
                    final int i12 = 1;
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileLocationRemove), new Runnable(this) { // from class: org.telegram.ui.oy0
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
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.ry0
                                        @Override // org.telegram.ui.ActionBar.a2
                                        public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i142) {
                                            switch (i122) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull2;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new ty0(profileActivity22, 0));
                                                    profileActivity22.j5();
                                                    profileActivity22.d.u(i13);
                                                    profileActivity22.getMessagesStorage().updateUserInfo(userFull32, false);
                                                    break;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull2;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ty0(profileActivity3, 1));
                                                    profileActivity3.j5();
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
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.ry0
                                        @Override // org.telegram.ui.ActionBar.a2
                                        public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i142) {
                                            switch (i14) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new ty0(profileActivity22, 0));
                                                    profileActivity22.j5();
                                                    profileActivity22.d.u(i15);
                                                    profileActivity22.getMessagesStorage().updateUserInfo(userFull32, false);
                                                    break;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ty0(profileActivity3, 1));
                                                    profileActivity3.j5();
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
                } else if (i10 == this.L3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new yb0(this, 10), false);
                } else if (i10 == this.K3 || i10 == this.J3 || i10 == this.W2) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileEditBio), new yb0(this, 11), false);
                } else if (i10 == this.G3) {
                    H.c(R.drawable.menu_storage_path, LocaleController.getString(R.string.ProfilePhoneEdit), new yb0(this, 12), false);
                } else if (i10 == this.U2) {
                    final int i13 = 0;
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileBirthdayChange), new Runnable(this) { // from class: org.telegram.ui.ny0
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
                                    profileActivity.showDialog(org.telegram.ui.Components.e5.m(parentActivity, string2, string3, userFull2.birthday, new oj0(5, profileActivity, userFull2), new yb0(profileActivity, 13), false, false, profileActivity.z0).a);
                                    break;
                                case 1:
                                    final ProfileActivity profileActivity2 = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                    String string4 = LocaleController.getString(R.string.Remove);
                                    final int i14 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.qy0
                                        @Override // org.telegram.ui.ActionBar.a2
                                        public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i15) {
                                            switch (i14) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.personal_channel_id = 0L;
                                                    userFull4.personal_channel_message = 0;
                                                    userFull4.flags2 &= -65;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatepersonalchannel, new ty0(profileActivity3, 3));
                                                    profileActivity3.e5(false, false);
                                                    profileActivity3.getMessagesStorage().updateUserInfo(userFull4, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull5 = userFull3;
                                                    userFull5.birthday = null;
                                                    userFull5.flags2 &= -33;
                                                    ProfileActivity profileActivity4 = profileActivity2;
                                                    profileActivity4.getMessagesController().invalidateContentSettings();
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ty0(profileActivity4, 2));
                                                    profileActivity4.e5(false, false);
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
                                    alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.qy0
                                        @Override // org.telegram.ui.ActionBar.a2
                                        public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i152) {
                                            switch (i15) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull4;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity3;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ty0(profileActivity32, 3));
                                                    profileActivity32.e5(false, false);
                                                    profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull5 = userFull4;
                                                    userFull5.birthday = null;
                                                    userFull5.flags2 &= -33;
                                                    ProfileActivity profileActivity4 = profileActivity3;
                                                    profileActivity4.getMessagesController().invalidateContentSettings();
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ty0(profileActivity4, 2));
                                                    profileActivity4.e5(false, false);
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
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) { // from class: org.telegram.ui.ny0
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
                                    profileActivity.showDialog(org.telegram.ui.Components.e5.m(parentActivity, string2, string3, userFull2.birthday, new oj0(5, profileActivity, userFull2), new yb0(profileActivity, 13), false, false, profileActivity.z0).a);
                                    break;
                                case 1:
                                    final ProfileActivity profileActivity2 = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                    String string4 = LocaleController.getString(R.string.Remove);
                                    final int i142 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.qy0
                                        @Override // org.telegram.ui.ActionBar.a2
                                        public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i152) {
                                            switch (i142) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull3;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity2;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ty0(profileActivity32, 3));
                                                    profileActivity32.e5(false, false);
                                                    profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull5 = userFull3;
                                                    userFull5.birthday = null;
                                                    userFull5.flags2 &= -33;
                                                    ProfileActivity profileActivity4 = profileActivity2;
                                                    profileActivity4.getMessagesController().invalidateContentSettings();
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ty0(profileActivity4, 2));
                                                    profileActivity4.e5(false, false);
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
                                    alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.qy0
                                        @Override // org.telegram.ui.ActionBar.a2
                                        public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i152) {
                                            switch (i15) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull4;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity3;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ty0(profileActivity32, 3));
                                                    profileActivity32.e5(false, false);
                                                    profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull5 = userFull4;
                                                    userFull5.birthday = null;
                                                    userFull5.flags2 &= -33;
                                                    ProfileActivity profileActivity4 = profileActivity3;
                                                    profileActivity4.getMessagesController().invalidateContentSettings();
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ty0(profileActivity4, 2));
                                                    profileActivity4.e5(false, false);
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
                } else if (i10 == this.Q2) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(userFull.personal_channel_id));
                    if (chat != null && ChatObject.getPublicUsername(chat) != null) {
                        H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileChannelCopy), new rx0(7, this, chat), false);
                    }
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileChannelChange), new yb0(this, 6), false);
                    final int i15 = 2;
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) { // from class: org.telegram.ui.ny0
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
                                    profileActivity.showDialog(org.telegram.ui.Components.e5.m(parentActivity, string2, string3, userFull2.birthday, new oj0(5, profileActivity, userFull2), new yb0(profileActivity, 13), false, false, profileActivity.z0).a);
                                    break;
                                case 1:
                                    final ProfileActivity profileActivity2 = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.BirthdayClearTitle);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.BirthdayClearMessage);
                                    String string4 = LocaleController.getString(R.string.Remove);
                                    final int i142 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.qy0
                                        @Override // org.telegram.ui.ActionBar.a2
                                        public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i152) {
                                            switch (i142) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull3;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity2;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ty0(profileActivity32, 3));
                                                    profileActivity32.e5(false, false);
                                                    profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull5 = userFull3;
                                                    userFull5.birthday = null;
                                                    userFull5.flags2 &= -33;
                                                    ProfileActivity profileActivity4 = profileActivity2;
                                                    profileActivity4.getMessagesController().invalidateContentSettings();
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ty0(profileActivity4, 2));
                                                    profileActivity4.e5(false, false);
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
                                    alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.qy0
                                        @Override // org.telegram.ui.ActionBar.a2
                                        public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i1522) {
                                            switch (i152) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull4;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity3;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ty0(profileActivity32, 3));
                                                    profileActivity32.e5(false, false);
                                                    profileActivity32.getMessagesStorage().updateUserInfo(userFull42, false);
                                                    break;
                                                default:
                                                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                                                    TLRPC.UserFull userFull5 = userFull4;
                                                    userFull5.birthday = null;
                                                    userFull5.flags2 &= -33;
                                                    ProfileActivity profileActivity4 = profileActivity3;
                                                    profileActivity4.getMessagesController().invalidateContentSettings();
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ty0(profileActivity4, 2));
                                                    profileActivity4.e5(false, false);
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

    /* JADX WARN: Removed duplicated region for block: B:72:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J4(float f7) {
        int v02;
        boolean z10;
        m11 m11Var;
        int i10;
        int d;
        zh.g0 g0Var;
        o11 o11Var;
        if (this.actionBar == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        this.l2 = f7;
        float lerp = AndroidUtilities.lerp(this.m2, f7);
        this.k2 = lerp;
        B3();
        this.Y.setScaleX(this.b2);
        this.Y.setScaleY(this.b2);
        this.Y.setTranslationY(AndroidUtilities.lerp((float) Math.ceil(this.a2), 0.0f, lerp));
        this.e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, lerp));
        pz0 pz0Var = this.e0;
        float f10 = this.b2;
        boolean z11 = this.p2;
        pz0Var.H = lerp;
        pz0Var.I = f10;
        pz0Var.G = z11;
        sz0 sz0Var = this.u0;
        if (sz0Var != null) {
            sz0Var.setExpandProgress(lerp);
        }
        zh.g0 g0Var2 = this.v0;
        if (g0Var2 != null) {
            g0Var2.setExpandProgress(lerp);
        }
        org.telegram.ui.Components.hw0 hw0Var = this.T;
        if (hw0Var != null) {
            hw0Var.setParentExpanded(lerp);
        }
        org.telegram.ui.Components.dh0 dh0Var = this.a0;
        if (dh0Var != null) {
            dh0Var.setParentExpanded(lerp);
        }
        org.telegram.ui.Components.vh0 vh0Var = this.c0;
        if (vh0Var != null) {
            vh0Var.setParentExpanded(lerp);
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.U0;
        if (v0Var != null) {
            float f11 = 1.0f - lerp;
            v0Var.setAlpha(f11);
            this.U0.setScaleY(f11);
            this.U0.setVisibility(0);
            org.telegram.ui.ActionBar.v0 v0Var2 = this.U0;
            v0Var2.setClickable(v0Var2.getAlpha() > 0.5f);
        }
        float y3 = y3();
        if (y3 >= 1.0f) {
            this.e0.setAlpha(1.0f);
        }
        if (!this.p2) {
            E4(y3, currentActionBarHeight);
        } else if (this.Q1 >= U3() && this.h2 < 0.33f) {
            D4();
        }
        org.telegram.ui.Components.xl0 xl0Var = this.L;
        if (xl0Var != null) {
            xl0Var.b(i0.a.d(lerp, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h8, this.z0), Color.argb(179, 255, 255, 255)));
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.Q5 != null ? -1 : i0.a.d(lerp, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pc, this.z0), -1), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.or[] orVarArr = this.J;
        org.telegram.ui.Components.or orVar = orVarArr[0];
        if (orVar != null) {
            orVar.b(lerp);
        }
        org.telegram.ui.Components.or orVar2 = orVarArr[1];
        if (orVar2 != null) {
            orVar2.b(lerp);
        }
        org.telegram.ui.Components.or[] orVarArr2 = this.K;
        org.telegram.ui.Components.or orVar3 = orVarArr2[0];
        if (orVar3 != null) {
            orVar3.b(lerp);
        }
        org.telegram.ui.Components.or orVar4 = orVarArr2[1];
        if (orVar4 != null) {
            orVar4.b(lerp);
        }
        Y4(lerp);
        float f12 = this.d2;
        float f13 = this.f2;
        if (y3 < 1.0f) {
            f12 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(63.0f), f12, y3);
            f13 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(63.0f), f13, y3);
        }
        float dpf2 = AndroidUtilities.dpf2(8.0f);
        float dpf22 = AndroidUtilities.dpf2(this.p2 ? 8.0f : -24.0f);
        float dpf23 = AndroidUtilities.dpf2(18.0f);
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.f;
        float f14 = dpf23 - ((FrameLayout.LayoutParams) j5VarArr[1].getLayoutParams()).leftMargin;
        float f15 = currentActionBarHeight;
        float O3 = (((this.Q1 + f15) - O3()) - AndroidUtilities.dpf2(30.0f)) - j5VarArr[1].getBottom();
        float A = com.google.android.gms.internal.vision.e2.A(f14, f12, 2.0f, dpf2 + f12);
        float f16 = this.e2;
        float f17 = 1.0f - lerp;
        float f18 = f17 * f17;
        float f19 = f17 * 2.0f * lerp;
        float f20 = (A * f19) + (f12 * f18);
        float f21 = lerp * lerp;
        float f22 = (f14 * f21) + f20;
        float A2 = (O3 * f21) + (com.google.android.gms.internal.vision.e2.A(O3, f16, 2.0f, dpf22 + f16) * f19) + (f16 * f18);
        float dpf24 = AndroidUtilities.dpf2(16.0f);
        org.telegram.ui.ActionBar.j5[] j5VarArr2 = this.r;
        float f23 = dpf24 - ((FrameLayout.LayoutParams) j5VarArr2[1].getLayoutParams()).leftMargin;
        float O32 = (((this.Q1 + f15) - O3()) - AndroidUtilities.dpf2(10.0f)) - j5VarArr2[1].getBottom();
        float A3 = com.google.android.gms.internal.vision.e2.A(f23, f13, 2.0f, dpf2 + f13);
        float f24 = this.g2;
        float f25 = (f23 * f21) + (A3 * f19) + (f13 * f18);
        float A4 = (f21 * O32) + (f19 * com.google.android.gms.internal.vision.e2.A(O32, f24, 2.0f, dpf22 + f24)) + (f18 * f24);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
        float dpf25 = AndroidUtilities.dpf2(22.7f) + floor;
        j5VarArr[1].setTranslationX(f22);
        j5VarArr[1].setTranslationY(Math.max(floor, A2));
        j5VarArr2[1].setTranslationX(W3(f25));
        j5VarArr2[1].setTranslationY(X3(Math.max(dpf25, A4)));
        this.s.setTranslationX(f25);
        this.s.setTranslationY(Math.max(dpf25, A4));
        S4();
        f5();
        Object tag = j5VarArr2[1].getTag();
        if (tag instanceof Integer) {
            Integer num = (Integer) tag;
            v02 = org.telegram.ui.ActionBar.j6.v0(num.intValue(), this.z0);
            if (num.intValue() == org.telegram.ui.ActionBar.j6.Bh) {
                z10 = true;
                j5VarArr2[1].setTextColor(i0.a.d(lerp, w3(v02, Boolean.valueOf(z10)), -1275068417));
                if (this.Q1 > U3()) {
                    j5VarArr[1].setPivotY(AndroidUtilities.lerp(0, r4.getMeasuredHeight(), lerp));
                    float f26 = (0.12f * y3) + 1.0f;
                    j5VarArr[1].setScaleX(AndroidUtilities.lerp(f26, 1.38f, lerp));
                    j5VarArr[1].setScaleY(AndroidUtilities.lerp(f26, 1.38f, lerp));
                }
                l4(0, Math.min(1.0f, y3), true);
                m11Var = this.b6;
                if (m11Var != null) {
                    m11Var.a(i0.a.d(this.k2, org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.b(0.18f, -0.1f, this.c1)), 603979775));
                }
                org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[1];
                if (this.Q5 == null) {
                    d = -1;
                    i10 = -1;
                } else {
                    i10 = -1;
                    d = i0.a.d(this.k2, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vh, this.z0), -1);
                }
                j5Var.setTextColor(d);
                this.actionBar.C(this.Q5 == null ? -1 : i0.a.d(lerp, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, this.z0), i10), false);
                this.actionBar.setMenuOffsetSuppressed(true);
                this.e0.setForegroundAlpha(lerp);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                layoutParams.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.a.getMeasuredWidth() / this.b2, lerp);
                layoutParams.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.Q1 + f15) / this.b2, lerp);
                N3();
                this.Y.requestLayout();
                g0Var = this.v0;
                if (g0Var != null) {
                    g0Var.setExpandProgress(lerp);
                }
                V4();
                o11Var = this.d1;
                if (o11Var == null && o11Var.K) {
                    o11Var.invalidate();
                    return;
                }
            }
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, this.z0);
        }
        z10 = false;
        j5VarArr2[1].setTextColor(i0.a.d(lerp, w3(v02, Boolean.valueOf(z10)), -1275068417));
        if (this.Q1 > U3()) {
        }
        l4(0, Math.min(1.0f, y3), true);
        m11Var = this.b6;
        if (m11Var != null) {
        }
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[1];
        if (this.Q5 == null) {
        }
        j5Var2.setTextColor(d);
        this.actionBar.C(this.Q5 == null ? -1 : i0.a.d(lerp, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, this.z0), i10), false);
        this.actionBar.setMenuOffsetSuppressed(true);
        this.e0.setForegroundAlpha(lerp);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
        layoutParams2.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.a.getMeasuredWidth() / this.b2, lerp);
        layoutParams2.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.Q1 + f15) / this.b2, lerp);
        N3();
        this.Y.requestLayout();
        g0Var = this.v0;
        if (g0Var != null) {
        }
        V4();
        o11Var = this.d1;
        if (o11Var == null) {
        }
    }

    @Override // org.telegram.ui.oy
    public final /* synthetic */ boolean K(uy uyVar) {
        return false;
    }

    public final boolean K3() {
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
                gz0 gz0Var = this.a;
                View F = gz0Var.F(view);
                s4.c1 T = F != null ? gz0Var.T(F) : null;
                if (T != null) {
                    Integer num = (Integer) this.Y1.get(Integer.valueOf(T.b()));
                    if (num != null) {
                        this.P1 = true;
                        this.a.v0(0, -(((this.a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.pr.h);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void K4(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.u2 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.m1 == 0) {
                this.m1 = -j3;
                getMediaDataController().getMediaCounts(this.m1, this.g1, this.classGuid);
            }
        }
        m01 m01Var = this.O;
        if (m01Var != null) {
            m01Var.setChatInfo(this.u2);
        }
        qz0 qz0Var = this.n0;
        if (qz0Var != null && !this.q1) {
            qz0Var.setChatInfo(this.u2);
        }
        sz0 sz0Var = this.u0;
        if (sz0Var != null && (chatFull3 = this.u2) != null) {
            sz0Var.setStories(chatFull3.stories);
        }
        zh.g0 g0Var = this.v0;
        if (g0Var != null) {
            g0Var.a();
        }
        pz0 pz0Var = this.e0;
        if (pz0Var != null) {
            pz0Var.setHasStories(j4());
        }
        L3();
        if (this.f1 != 0) {
            boolean z10 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.u2) == null || !chatFull2.stargifts_available) ? false : true;
            this.T0.I(38, z10);
            org.telegram.ui.Components.dh0 dh0Var = this.a0;
            if (dh0Var != null) {
                dh0Var.o(3, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.Cells.y3 y3Var = this.g0;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(0.0f);
    }

    public final void L3() {
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

    public final void L4(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.Z == null || (tL_emojiStatusCollectible2 = this.g6) == tL_emojiStatusCollectible) {
            return;
        }
        if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
            this.g6 = tL_emojiStatusCollectible;
            di.f4 f4Var = this.d6;
            int i10 = 1;
            if (f4Var != null) {
                f4Var.e(true);
            }
            if (tL_emojiStatusCollectible == null || TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                return;
            }
            this.f6 = null;
            this.d6 = new di.f4(getParentActivity(), 3);
            this.e6 = org.telegram.ui.ActionBar.j6.v(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.j6.l1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
            this.d6.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            di.f4 f4Var2 = this.d6;
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
            f4Var2.A0 = true;
            f4Var2.I0 = System.currentTimeMillis();
            f4Var2.B0 = new Path();
            f4Var2.C0 = AndroidUtilities.dpf2(0.66f) / 2.0f;
            f4Var2.D0 = new Paint(1);
            f4Var2.E0 = new Paint(1);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, l1), org.telegram.ui.ActionBar.j6.l1(1.0f, l1), org.telegram.ui.ActionBar.j6.l1(0.0f, l1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            f4Var2.H0 = linearGradient;
            f4Var2.E0.setShader(linearGradient);
            f4Var2.F0 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, l1), org.telegram.ui.ActionBar.j6.l1(0.5f, l1), org.telegram.ui.ActionBar.j6.l1(0.0f, l1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            f4Var2.G0 = new Matrix();
            f4Var2.D0.setShader(f4Var2.F0);
            f4Var2.E0.setStyle(Paint.Style.STROKE);
            f4Var2.E0.setStrokeJoin(Paint.Join.ROUND);
            f4Var2.E0.setStrokeCap(Paint.Cap.ROUND);
            f4Var2.E0.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
            this.Z.addView(this.d6, w7.x5.c(24.0f, -1));
            this.d6.t(9.33f);
            di.f4 f4Var3 = this.d6;
            Typeface bold = AndroidUtilities.bold();
            f4Var3.H.u(bold);
            f4Var3.J.setTypeface(bold);
            this.d6.s(tL_emojiStatusCollectible.title);
            di.f4 f4Var4 = this.d6;
            f4Var4.d = -1L;
            f4Var4.k(5.66f, 2.66f, 5.66f, 2.66f);
            di.f4 f4Var5 = this.d6;
            f4Var5.getClass();
            f4Var5.y = AndroidUtilities.dpf2(4.0f);
            f4Var5.E = AndroidUtilities.dpf2(2.66f);
            this.d6.r();
            this.d6.q(16.0f);
            this.d6.u();
            this.d6.setOnClickListener(new yy0(this, tL_emojiStatusCollectible.slug, i10));
            if (this.Q1 < AndroidUtilities.dp(82.0f)) {
                this.f6 = Boolean.FALSE;
                this.d6.setAlpha(0.0f);
            }
            V4();
            di.f4 f4Var6 = this.d6;
            Objects.requireNonNull(f4Var6);
            AndroidUtilities.runOnUIThread(new rl0(f4Var6, 26), 6000L);
        }
    }

    @Override // org.telegram.ui.Components.qu0
    public final void M() {
        org.telegram.ui.Components.pu0 pu0Var;
        m01 m01Var = this.O;
        if (m01Var != null && (pu0Var = this.R) != null) {
            m01Var.setNewMediaCounts(pu0Var.c);
        }
        if (this.d != null) {
            e5(false, false);
        }
        R();
        if (this.v2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final boolean M3() {
        org.telegram.ui.ActionBar.d5 d5Var;
        if (this.J1 == 0 || (d5Var = this.parentLayout) == null || d5Var.getFragmentStack() == null || this.parentLayout.getFragmentStack().size() < 2 || !(this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof co)) {
            return false;
        }
        finishFragment();
        return true;
    }

    public final void M4(t01 t01Var) {
        if (this.i5 == t01Var) {
            return;
        }
        this.i5 = t01Var;
        AndroidUtilities.forEachViews((RecyclerView) this.a, (e2.h) new sy0(this, 0));
    }

    public final void N3() {
        if (this.a == null) {
            return;
        }
        float measuredWidth = (this.a.getMeasuredWidth() / 2.0f) - ((((FrameLayout.LayoutParams) this.Y.getLayoutParams()).width * this.b2) * 0.5f);
        this.Z1 = measuredWidth;
        if (this.G1) {
            this.Z1 = AndroidUtilities.lerp(this.O5, measuredWidth, this.S1);
        }
        this.Y.setTranslationX(this.Z1);
    }

    public final void N4(int i10) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (AndroidUtilities.isTablet()) {
            return;
        }
        this.K1 = i10 != 0;
        this.L1 = i10 != 0;
        k5();
        if (globalMainSettings.getBoolean("view_animations", true)) {
            this.J1 = i10;
        } else if (i10 == 2) {
            this.n1 = true;
        }
    }

    public final int O3() {
        if (this.e1 == 0 || this.q0 == null || this.s1) {
            return AndroidUtilities.dp(74 + (this.I4 ? 25 : 0));
        }
        return 0;
    }

    public final void O4(TLRPC.UserFull userFull, org.telegram.ui.Cells.f6 f6Var, p11 p11Var) {
        this.v2 = userFull;
        org.telegram.ui.Components.hw0 hw0Var = this.T;
        if (hw0Var != null) {
            hw0Var.set(userFull.stars_rating);
        }
        sz0 sz0Var = this.u0;
        if (sz0Var != null) {
            sz0Var.setStories(this.v2.stories);
        }
        zh.g0 g0Var = this.v0;
        if (g0Var != null) {
            g0Var.a();
        }
        pz0 pz0Var = this.e0;
        if (pz0Var != null) {
            pz0Var.setHasStories(j4());
        }
        m01 m01Var = this.O;
        if (m01Var != null) {
            m01Var.setUserInfo(this.v2);
        }
        if (this.w2 == null) {
            this.w2 = f6Var;
        }
        if (this.w2 == null) {
            this.w2 = new org.telegram.ui.Cells.f6(this.currentAccount);
        }
        org.telegram.ui.Cells.f6 f6Var2 = this.w2;
        yb0 yb0Var = new yb0(this, 20);
        if (f6Var2.c) {
            yb0Var.run();
        } else {
            f6Var2.h.add(yb0Var);
        }
        this.w2.d(this.v2);
        if (this.y2 == null) {
            this.y2 = p11Var;
        }
        p11 p11Var2 = this.y2;
        if (p11Var2 == null) {
            p11 c10 = p11.c(this.currentAccount, this.v2, p11Var2);
            this.y2 = c10;
            this.x2 = c10 != null;
        }
        p11 p11Var3 = this.y2;
        if (p11Var3 != null) {
            yb0 yb0Var2 = new yb0(this, 16);
            if (p11Var3.b) {
                yb0Var2.run();
            } else {
                p11Var3.h.add(yb0Var2);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.T0;
        if (v0Var != null) {
            v0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.e1)));
            if (e4()) {
                this.T0.K(44);
            } else {
                this.T0.r(44);
            }
        }
    }

    public final int P3(ImageReceiver imageReceiver) {
        return imageReceiver.getDrawable() instanceof org.telegram.ui.Components.q61 ? ((org.telegram.ui.Components.q61) imageReceiver.getDrawable()).a.a() : AndroidUtilities.calcBitmapColor(this.e0.getImageReceiver().getBitmap());
    }

    public final void P4(boolean z10, boolean z11) {
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
            this.f0.playTogether(ObjectAnimator.ofFloat(this.g0, (Property<org.telegram.ui.Cells.y3, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.g0, (Property<org.telegram.ui.Cells.y3, Float>) View.ALPHA, 0.0f));
        }
        this.f0.setDuration(180L);
        this.f0.addListener(new d01(this, z10, i10));
        this.f0.start();
    }

    @Override // org.telegram.ui.Components.t40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new gi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final org.telegram.ui.Components.o5 Q3(int i10, long j3) {
        org.telegram.ui.Components.o5[] o5VarArr = this.H;
        if (o5VarArr[i10] == null) {
            org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(AndroidUtilities.dp(17.0f), i10 == 0 ? 7 : 2, this.f[i10], false);
            o5VarArr[i10] = o5Var;
            int dp = AndroidUtilities.dp(1.0f);
            o5Var.I = 0;
            o5Var.J = dp;
            if (this.G0) {
                o5VarArr[i10].a();
            }
        }
        if (j3 != 0) {
            o5VarArr[i10].j(j3, false);
        } else {
            o5VarArr[i10].g(null, false);
        }
        X4();
        return o5VarArr[i10];
    }

    public final void Q4() {
        Long l4;
        if (this.B5 != null) {
            return;
        }
        a71[] a71VarArr = new a71[1];
        Rect rect = AndroidUtilities.rectTmp2;
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.f;
        org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[1];
        if (j5Var != null) {
            if (j5Var.getRightDrawable() == null) {
                rect.set(j5VarArr[1].getWidth() - 1, (j5VarArr[1].getHeight() / 2) - 1, j5VarArr[1].getWidth() + 1, (j5VarArr[1].getHeight() / 2) + 1);
            } else {
                rect.set(j5VarArr[1].getRightDrawable().getBounds());
                rect.offset((int) ((j5VarArr[1].getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) j5VarArr[1].getX(), (int) j5VarArr[1].getY());
            }
        }
        int i10 = j5VarArr[1].getScaleX() < 1.5f ? 16 : 32;
        int dp = (-(this.Z.getHeight() - rect.centerY())) - AndroidUtilities.dp(i10);
        int min = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = w7.p.b(centerX - (min / 2), 0, AndroidUtilities.displaySize.x - min);
        vz0 vz0Var = new vz0(this, this, getParentActivity(), Integer.valueOf(Math.max(0, centerX - b10)), this.E2 == null ? 0 : 9, this.z0, i10, a71VarArr);
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e1));
        if (user != null) {
            vz0Var.setExpireDateHint(DialogObject.getEmojiStatusUntil(user.emoji_status));
        }
        Long l10 = this.F;
        org.telegram.ui.Components.o5[] o5VarArr = this.G;
        if (l10 != null) {
            vz0Var.setSelected(l10);
        } else {
            org.telegram.ui.Components.o5 o5Var = o5VarArr[1];
            if (o5Var != null) {
                Drawable drawable = o5Var.f[0];
                if (drawable instanceof org.telegram.ui.Components.q5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.q5) drawable).i());
                    vz0Var.setSelected(l4);
                }
            }
            l4 = null;
            vz0Var.setSelected(l4);
        }
        vz0Var.setSaveState(3);
        vz0Var.y(o5VarArr[1], j5VarArr[1]);
        wz0 wz0Var = new wz0(this, vz0Var);
        this.B5 = wz0Var;
        a71VarArr[0] = wz0Var;
        int[] iArr = new int[2];
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[1];
        if (j5Var2 != null) {
            j5Var2.getLocationOnScreen(iArr);
        }
        a71VarArr[0].showAsDropDown(this.fragmentView, b10, dp, 51);
        a71VarArr[0].b();
    }

    @Override // org.telegram.ui.Components.jt0
    public final void R() {
        int i10;
        m01 m01Var = this.O;
        if (m01Var == null || this.s == null) {
            return;
        }
        int closestTab = m01Var.getClosestTab();
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
                this.s.setText(a4.a.C(LocaleController.formatPluralString("Photos", i10, new Object[0]), ", ", LocaleController.formatPluralString("Videos", iArr[7], new Object[0])));
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
            this.s.setText(LocaleController.formatPluralString("CommonGroups", this.v2.common_chats_count, new Object[0]));
            return;
        }
        if (closestTab == 7) {
            this.s.setText(this.r[1].getText());
            return;
        }
        if (closestTab == 8 || org.telegram.ui.Components.xu0.w0(closestTab)) {
            if (this.r2) {
                this.s.setText(this.O.V(false));
                return;
            } else if (this.O.c0(closestTab) > 0) {
                this.s.setText(LocaleController.formatPluralString("ProfileStoriesCount", this.O.c0(closestTab), new Object[0]));
                return;
            } else {
                this.s.setText(LocaleController.getString(R.string.ProfileStoriesCountZero));
                return;
            }
        }
        if (closestTab == 13) {
            this.s.setText(this.O.V(true));
            return;
        }
        if (closestTab == 9) {
            this.s.setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", this.O.c0(closestTab), new Object[0]));
            return;
        }
        if (closestTab == 10) {
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(a());
            this.s.setText(LocaleController.formatPluralString(this.r2 ? "Bots" : "Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]));
            return;
        }
        if (closestTab == 12) {
            this.s.setText(LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, getMessagesController().getSavedMessagesController().getMessagesCount(a())), new Object[0]));
            return;
        }
        if (closestTab == 14) {
            org.telegram.ui.Components.do0 do0Var = this.s;
            org.telegram.ui.Components.nr0 nr0Var = this.O.V;
            do0Var.setText(LocaleController.formatPluralStringComma("ProfileGiftsCount", nr0Var != null ? nr0Var.getGiftsCount() : 0));
        } else if (closestTab == 15) {
            int i17 = iArr[8];
            if (i17 <= 0) {
                this.s.setText(LocaleController.getString(R.string.SharedPollTab));
            } else {
                this.s.setText(LocaleController.formatPluralStringComma("ProfilePollsCount", i17));
            }
        }
    }

    public final void R3(boolean z10) {
        a0.i iVar;
        if (this.B1 || (iVar = this.C1) == null || this.u2 == null) {
            return;
        }
        this.B1 = true;
        int i10 = (iVar.m() == 0 || !z10) ? 0 : 300;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.f1);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = z10 ? 0 : this.C1.m();
        tL_channels_getParticipants.limit = 200;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new hg.u(this, tL_channels_getParticipants, i10)), this.classGuid);
    }

    public final void R4() {
        int i10 = 0;
        this.O.I0.setReordering(false);
        m01 m01Var = this.O;
        org.telegram.ui.Components.ns0 ns0Var = m01Var.I0;
        if (m01Var.v1 != null && ns0Var != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = ns0Var.getTabIds();
            int size = tabIds.size();
            while (i10 < size) {
                Integer num = tabIds.get(i10);
                i10++;
                TLRPC.ProfileTab d02 = org.telegram.ui.Components.xu0.d0(num.intValue(), m01Var.d1 instanceof TLRPC.TL_channelFull);
                if (d02 != null) {
                    arrayList.add(d02);
                }
            }
        }
        this.O.v1(true);
        this.y5.animate().translationY(AndroidUtilities.dp(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.pr.h).withEndAction(new yb0(this, 21)).start();
        org.telegram.ui.Components.yc.a0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    public final org.telegram.ui.Components.o5 S3(TLRPC.EmojiStatus emojiStatus, boolean z10, int i10) {
        org.telegram.ui.Components.o5[] o5VarArr = this.G;
        if (o5VarArr[i10] == null) {
            org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), i10 == 0 ? 7 : 2, this.f[i10], false);
            o5VarArr[i10] = o5Var;
            if (this.G0) {
                o5Var.a();
            }
        }
        if (i10 == 1) {
            this.F = null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((1 & tL_emojiStatus.flags) == 0 || tL_emojiStatus.until > ((int) (System.currentTimeMillis() / 1000))) {
                o5VarArr[i10].j(tL_emojiStatus.document_id, z10);
                o5VarArr[i10].m(false, z10);
            } else {
                o5VarArr[i10].g(Y3(i10), z10);
                o5VarArr[i10].m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
                if (i10 == 1) {
                    this.F = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                }
                o5VarArr[i10].j(tL_emojiStatusCollectible.document_id, z10);
                o5VarArr[i10].m(true, z10);
            } else {
                o5VarArr[i10].g(Y3(i10), z10);
                o5VarArr[i10].m(false, z10);
            }
        } else {
            o5VarArr[i10].g(Y3(i10), z10);
            o5VarArr[i10].m(false, z10);
        }
        X4();
        return o5VarArr[i10];
    }

    public final void S4() {
        j0 j0Var;
        if (this.a0 == null || this.r[1] == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        org.telegram.ui.Components.dh0 dh0Var = this.a0;
        boolean z10 = this.G1;
        dh0Var.e = z10;
        if (z10 && this.J1 == 2 && (j0Var = this.Y) != null) {
            this.a0.f = this.Y.getY() + (this.Y.getScaleY() * j0Var.getHeight());
            this.a0.setAlpha(this.S1);
            org.telegram.ui.Components.dh0 dh0Var2 = this.a0;
            float measuredWidth = this.a.getMeasuredWidth();
            dh0Var2.E = AndroidUtilities.dp(74.0f);
            dh0Var2.setTranslationY(measuredWidth);
            dh0Var2.invalidate();
        } else {
            dh0Var.f = -1.0f;
            float f7 = currentActionBarHeight;
            float dp = (this.Q1 + f7) - AndroidUtilities.dp(this.I4 ? 25.0f : 0.0f);
            float min = Math.min(AndroidUtilities.dp(74.0f), dp - f7);
            org.telegram.ui.Components.dh0 dh0Var3 = this.a0;
            dh0Var3.E = min;
            dh0Var3.setTranslationY(dp - min);
            dh0Var3.invalidate();
        }
        ImageView imageView = this.O0;
        if (imageView == null || imageView.getTag() == null) {
            return;
        }
        this.a0.getClass();
        if (this.O0.getVisibility() == 0) {
            this.O0.setVisibility(8);
        }
        if (this.O0.getTag() instanceof org.telegram.ui.ActionBar.v0) {
            ((org.telegram.ui.ActionBar.v0) this.O0.getTag()).setAlpha(1.0f);
        }
    }

    @Override // org.telegram.ui.Components.jt0
    public final boolean T() {
        return this.A1;
    }

    public final int T3() {
        return O3() + U3();
    }

    public final void T4() {
        if (this.Z0 == null || this.a1 == null) {
            return;
        }
        TLRPC.UserFull userFull = this.v2;
        int i10 = (userFull == null && this.u2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.u2.ttl_period;
        this.s0.b(i10);
        this.a1.b(i10);
    }

    public final int U3() {
        return O3() == 0 ? AndroidUtilities.dp(168.0f) : AndroidUtilities.dp(152.0f);
    }

    public final void U4() {
        if (this.s5 == null) {
            return;
        }
        m01 m01Var = this.O;
        boolean z10 = ((m01Var == null || !m01Var.isAttachedToWindow()) ? (float) AndroidUtilities.dp(72.0f) : ((float) AndroidUtilities.dp(232.0f)) - (((float) this.a.getMeasuredHeight()) - this.O.getY())) <= 0.0f;
        le.b bVar = this.A5;
        bVar.a(z10, true);
        float f7 = bVar.e;
        this.s5.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f7));
        this.s5.setAlpha(f7);
        this.s5.setVisibility(f7 <= 0.0f ? 4 : 0);
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
        if (qcVar != null) {
            qcVar.l();
        }
    }

    public final Drawable V3() {
        if (this.x == null) {
            this.x = org.telegram.ui.ActionBar.j6.l4.getConstantState().newDrawable().mutate();
        }
        return this.x;
    }

    public final void V4() {
        di.f4 f4Var = this.d6;
        if (f4Var == null) {
            return;
        }
        float f7 = -f4Var.getPaddingLeft();
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.f;
        f4Var.m(0.0f, (j5VarArr[1].getScaleX() * (j5VarArr[1].getRightDrawableX() - (AndroidUtilities.lerp(0.45f, 0.25f, this.k2) * j5VarArr[1].getRightDrawableWidth()))) + j5VarArr[1].getX() + f7);
        float lerp = AndroidUtilities.lerp(this.m2, this.l2);
        this.d6.setTranslationY(((j5VarArr[1].getY() + (-r4.getPaddingBottom())) - AndroidUtilities.dp(24.0f)) + AndroidUtilities.lerp(AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(12.0f), lerp));
        this.d6.h(i0.a.d(lerp, this.e6, 1342177280));
        boolean z10 = this.Q1 >= ((float) AndroidUtilities.dp(82.0f));
        Boolean bool = this.f6;
        if (bool == null || bool.booleanValue() != z10) {
            ViewPropertyAnimator animate = this.d6.animate();
            this.f6 = Boolean.valueOf(z10);
            org.telegram.messenger.wl.q(animate.alpha(z10 ? 1.0f : 0.0f), org.telegram.ui.Components.pr.g, 200L);
        }
    }

    public final float W3(float f7) {
        this.Z5 = f7;
        int i10 = this.J1;
        return Math.max(0.0f, (Z3() + this.o5) * Utilities.clamp01(i10 != 2 ? (this.S1 >= 1.0f || i10 == 0) ? this.k2 : 0.0f : 1.0f)) + f7;
    }

    public final void W4() {
        if (getParentActivity() == null || this.V0 == null) {
            return;
        }
        if (getUserConfig().isPremium()) {
            this.V0.setIcon(R.drawable.menu_profile_colors);
            return;
        }
        Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, this.z0), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
        drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.V0.setIcon(new bi.g3(drawable, drawable2, AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f)));
    }

    public final float X3(float f7) {
        this.a6 = f7;
        int i10 = this.J1;
        return com.google.android.gms.internal.vision.e2.z(1.0f, Utilities.clamp01(i10 == 2 ? 1.0f : (this.S1 >= 1.0f || i10 == 0) ? this.k2 : 0.0f), this.T != null ? this.T.getVisibilityFactor() * AndroidUtilities.dp(3.0f) : 0.0f, f7);
    }

    public final void X4() {
        Y4(this.P5);
    }

    public final org.telegram.ui.Components.or Y3(int i10) {
        org.telegram.ui.Components.or[] orVarArr = this.K;
        if (orVarArr[i10] == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            Drawable[] drawableArr = this.E;
            drawableArr[i10] = mutate;
            drawableArr[i10].setColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.z0), PorterDuff.Mode.MULTIPLY);
            orVarArr[i10] = new org.telegram.ui.Components.or(drawableArr[i10], getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return orVarArr[i10];
    }

    public final void Y4(float f7) {
        int i10 = 0;
        while (i10 < 2) {
            MessagesController.PeerColor peerColor = this.Q5;
            int offsetColor = (peerColor == null || i10 != 1) ? AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.z0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oi, this.z0), this.E5, 1.0f) : i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), -1);
            int d = i0.a.d(f7, offsetColor, -1);
            int i11 = org.telegram.ui.ActionBar.j6.Oi;
            int d10 = i0.a.d(this.E5, d, org.telegram.ui.ActionBar.j6.v0(i11, this.z0));
            org.telegram.ui.Components.o5 o5Var = this.G[i10];
            if (o5Var != null) {
                o5Var.k(Integer.valueOf(d10));
            }
            org.telegram.ui.Components.o5 o5Var2 = this.H[i10];
            if (o5Var2 != null) {
                o5Var2.k(Integer.valueOf(i0.a.d(this.E5, i0.a.d(f7, offsetColor, -1711276033), org.telegram.ui.ActionBar.j6.v0(i11, this.z0))));
            }
            if (i10 == 1) {
                this.d0.setColor(d10);
            }
            i10++;
        }
        this.P5 = f7;
    }

    public final float Z3() {
        if (this.T == null) {
            return 0.0f;
        }
        return this.T.getVisibilityFactor() * AndroidUtilities.dp(22.0f);
    }

    public final void Z4() {
        org.telegram.ui.Cells.o oVar = this.d0;
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.f;
        oVar.setScaleX(j5VarArr[1].getScaleX());
        this.d0.setScaleY(j5VarArr[1].getScaleY());
        this.d0.b((j5VarArr[1].getScaleX() * j5VarArr[1].getRightDrawableX()) + j5VarArr[1].getX(), (j5VarArr[1].getHeight() - (j5VarArr[1].getScaleY() * (j5VarArr[1].getHeight() - j5VarArr[1].getRightDrawableY()))) + j5VarArr[1].getY());
    }

    public final long a() {
        long j3 = this.i1;
        if (j3 != 0) {
            return j3;
        }
        long j10 = this.e1;
        return j10 != 0 ? j10 : -this.f1;
    }

    public final org.telegram.ui.Components.xl0 a4(int i10) {
        if (this.L == null) {
            org.telegram.ui.Components.xl0 xl0Var = new org.telegram.ui.Components.xl0(i10);
            this.L = xl0Var;
            xl0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h8, this.z0));
        }
        return this.L;
    }

    public final void a5() {
        if (this.q1 || !ChatObject.isForum(this.E2)) {
            return;
        }
        getNotificationsController().loadTopicsNotificationsExceptions(-this.f1, new Consumer() { // from class: org.telegram.ui.dz0
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void x(Object obj) {
                ProfileActivity profileActivity = ProfileActivity.this;
                HashSet hashSet = profileActivity.h5;
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
                profileActivity.g5(true);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$-CC.$default$andThen(this, consumer);
            }
        });
    }

    public final m11 b4() {
        if (this.b6 == null) {
            m11 m11Var = new m11(LocaleController.getString(R.string.StatusHiddenShow));
            this.b6 = m11Var;
            m11Var.setAlpha((int) (Math.min(1.0f, this.Q1 / T3()) * 255.0f));
            this.b6.a(i0.a.d(this.k2, org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.b(0.18f, -0.1f, this.c1)), 603979775));
        }
        return this.b6;
    }

    public final void b5(float f7) {
        b11 b11Var;
        ValueAnimator valueAnimator;
        if (this.p2 || ((b11Var = this.N) != null && (valueAnimator = b11Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            layoutParams.width = this.a.getMeasuredWidth();
            layoutParams.height = (int) (this.Q1 + f7);
            this.N.requestLayout();
        }
        o11 o11Var = this.d1;
        if (o11Var != null) {
            o11Var.E.setTranslate(0.0f, this.a2 - o11Var.x);
            o11 o11Var2 = this.d1;
            RadialGradient radialGradient = o11Var2.y;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(o11Var2.E);
            }
            this.d1.invalidate();
        }
        Z4();
        S4();
        f5();
    }

    public final int c4() {
        if (this.q1) {
            return 0;
        }
        if (this.f1 == 0 || !ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.f1)))) {
            return AndroidUtilities.dp(50.0f);
        }
        return AndroidUtilities.dp(j4() ? 24.0f : 38.0f);
    }

    public final void c5() {
        TLRPC.User user;
        if (!this.s1 || this.X0 == null || this.W0 == null || (user = getMessagesController().getUser(Long.valueOf(this.e1))) == null) {
            return;
        }
        boolean z10 = UserObject.getPublicUsername(user) != null;
        this.X0.setIcon(z10 ? R.drawable.menu_username_change : R.drawable.menu_username_set);
        this.X0.setText(LocaleController.getString(z10 ? R.string.ProfileUsernameEdit : R.string.ProfileUsernameSet));
        this.W0.setVisibility(UserObject.getPublicUsername(user) == null ? 8 : 0);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        if (this.O.x0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void clearViews() {
        this.Q5 = null;
        super.clearViews();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r1 == null) goto L17;
     */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        ao aoVar;
        org.telegram.ui.ActionBar.d4 d4Var;
        org.telegram.ui.ActionBar.n2 lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof co) && (aoVar = ((co) lastFragment).ea) != null && (d4Var = aoVar.f) != null) {
            if (d4Var != null) {
                TLRPC.ChatTheme chatTheme = d4Var.d;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = starGift instanceof TL_stars.TL_starGiftUnique ? (TL_stars.TL_starGiftUnique) starGift : null;
                }
            }
            this.z0 = lastFragment.getResourceProvider();
        }
        org.telegram.ui.Components.z7 z7Var = new org.telegram.ui.Components.z7(this, context, this.z0, 5);
        boolean z10 = true;
        z7Var.setForceSkipTouches(true);
        z7Var.setBackgroundColor(0);
        z7Var.B(this.Q5 != null ? 553648127 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f8, this.z0), false);
        int i10 = org.telegram.ui.ActionBar.j6.v8;
        z7Var.C(org.telegram.ui.ActionBar.j6.v0(i10, this.z0), false);
        z7Var.C(org.telegram.ui.ActionBar.j6.v0(i10, this.z0), true);
        z7Var.setCastShadows(false);
        z7Var.setAddToContainer(false);
        z7Var.setClipContent(true);
        if (!this.I0 && (AndroidUtilities.isTablet() || this.inBubbleMode)) {
            z10 = false;
        }
        z7Var.setOccupyStatusBar(z10);
        if (!this.I0) {
            z7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
            z7Var.getBackButton().setTranslationX(AndroidUtilities.dp(2.0f));
            ImageView backButton = z7Var.getBackButton();
            backButton.setOnLongClickListener(new bi.d3(5, this, backButton));
            return z7Var;
        }
        z7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
        z7Var.getBackButton().setTranslationX(AndroidUtilities.dp(2.0f));
        z7Var.e.setContentDescription(LocaleController.getString(R.string.QrCode));
        z7Var.e.setImageResource(R.drawable.outline_header_qr_24);
        z7Var.e.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, this.z0), PorterDuff.Mode.SRC_IN);
        z7Var.e.setOnClickListener(new jy0(this, 6));
        return z7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0ba9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0bb3  */
    /* JADX WARN: Type inference failed for: r0v132, types: [org.telegram.ui.uy0] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        bh.b bVar;
        int i10;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        ?? r12;
        TLRPC.Document document;
        int i11;
        Object obj;
        org.telegram.ui.ActionBar.f6 f6Var;
        float f7;
        boolean z10;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.Components.co n10;
        TLRPC.UserFull userFull2;
        TLRPC.ChatParticipants chatParticipants;
        co coVar;
        ao aoVar;
        org.telegram.ui.ActionBar.j6.X(context);
        int i15 = 0;
        org.telegram.ui.ActionBar.j6.J(context, false);
        org.telegram.ui.ActionBar.n2 lastFragment = this.parentLayout.getLastFragment();
        StateListAnimator stateListAnimator = null;
        if ((lastFragment instanceof co) && (aoVar = (coVar = (co) lastFragment).ea) != null && aoVar.c() != null) {
            org.telegram.ui.ActionBar.d4 d4Var = coVar.ea.f;
            if (d4Var != null) {
                TLRPC.ChatTheme chatTheme = d4Var.d;
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
        this.hasOwnBackground = true;
        this.Q1 = T3();
        this.actionBar.setActionBarMenuOnItemClick(new i01(this, context));
        m01 m01Var = this.O;
        if (m01Var != null) {
            m01Var.F0();
        }
        long j3 = this.i1;
        if (j3 == 0) {
            j3 = this.e1;
            if (j3 == 0) {
                j3 = -this.f1;
            }
        }
        this.fragmentView = new k01(this, context);
        ih.k kVar = new ih.k(this.fragmentView);
        this.r6 = kVar;
        this.o6.f(kVar, (ViewGroup) this.fragmentView);
        ih.k kVar2 = this.r6;
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        bh.b bVar2 = this.q6;
        bVar2.f(kVar2, viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        if (this.s1) {
            this.s5 = new FrameLayout(context);
            this.t5 = new FrameLayout[2];
            this.w5 = new di.d[2];
            int i16 = 0;
            for (int i17 = 2; i16 < i17; i17 = 2) {
                gh.c cVar = new gh.c();
                int i18 = org.telegram.ui.ActionBar.j6.d6;
                cVar.a(getThemedColor(i18));
                bh.b bVar3 = new bh.b(cVar);
                bi.g5 g5Var = new bi.g5(context);
                dh.d b10 = bVar3.b(g5Var, new eh.b(i18, this.z0));
                b10.o(AndroidUtilities.dp(8.0f));
                b10.p(AndroidUtilities.dp(22.0f));
                g5Var.setBackground(b10);
                this.t5[i16] = new FrameLayout(context);
                this.w5[i16] = new di.d(context, this.z0);
                this.w5[i16].setRoundRadius(AndroidUtilities.dp(19.0f));
                this.w5[i16].setUseWrapContent(true);
                this.w5[i16].setPadding(AndroidUtilities.dp(16.0f), i15, AndroidUtilities.dp(16.0f), i15);
                if (i16 == 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                    this.u5 = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(R.drawable.filled_premium_camera), i15, 1, 33);
                    this.u5.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
                    this.v5 = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.nq(R.drawable.filled_add_album), i15, 1, 33);
                    this.v5.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAlbumBottomButtonAddStories));
                    this.w5[i16].h(this.u5);
                } else {
                    this.w5[i16].h(LocaleController.getString(R.string.StorySave));
                }
                g5Var.setOnClickListener(new di.o4(this, i16, 24));
                w7.z5.b(g5Var, 0.02f, 1.2f);
                this.w5[i16].setStateListAnimator(stateListAnimator);
                g5Var.addView(this.w5[i16], w7.x5.e(-2, -1, 17));
                this.t5[i16].addView(g5Var, w7.x5.e(-2, 60, 1));
                this.s5.addView(this.t5[i16], w7.x5.e(-1, -1, 87));
                if (i16 == 1 || !getMessagesController().storiesEnabled()) {
                    this.t5[i16].setTranslationY(AndroidUtilities.dp(72.0f));
                }
                i16++;
                i15 = 0;
                stateListAnimator = null;
            }
        }
        TLRPC.ChatFull chatFull2 = this.u2;
        ArrayList arrayList = (chatFull2 == null || (chatParticipants = chatFull2.participants) == null || chatParticipants.participants.size() <= 5) ? null : this.C2;
        if (this.x1) {
            bVar = bVar2;
            i10 = 6;
        } else if (this.t1 && (((userFull = this.v2) != null && userFull.stargifts_count > 0) || ((chatFull = this.u2) != null && chatFull.stargifts_count > 0))) {
            this.w1 = true;
            bVar = bVar2;
            i10 = 14;
        } else if (this.r1) {
            bVar = bVar2;
            i10 = 10;
        } else {
            bVar = bVar2;
            i10 = arrayList != null ? 7 : -1;
        }
        org.telegram.ui.Components.pu0 pu0Var = this.R;
        TLRPC.UserFull userFull3 = this.v2;
        long j10 = j3;
        bh.b bVar4 = bVar;
        m01 m01Var2 = new m01(this, context, j10, pu0Var, userFull3 != null ? userFull3.common_chats_count : 0, this.C2, this.u2, userFull3, i10, this.y1, this, this, this.z0, this.o6);
        this.O = m01Var2;
        m01Var2.setLayoutParams(new s4.p0(-1, -1));
        this.O.n0((ViewGroup) this.fragmentView);
        int i19 = 4;
        int i20 = 3;
        if (this.e1 == 0 || this.q0 == null || this.s1) {
            org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(context, this.z0);
            this.c0 = vh0Var;
            org.telegram.ui.Components.fh0 fh0Var = this.m0;
            if (fh0Var != null) {
                fh0Var.setMusicView(vh0Var);
            }
            this.c0.setColor(this.Q5);
            TLRPC.UserFull userFull4 = this.v2;
            if (userFull4 != null && (document = userFull4.saved_music) != null) {
                this.c0.setMusicDocument(document);
            }
            this.c0.setOnClickListener(new jy0(this, i19));
            this.a0 = new org.telegram.ui.Components.dh0(context, AndroidUtilities.dp(74.0f));
            I4();
            r12 = 0;
            g5(false);
            this.a0.setOnActionClickListener(new ky0(this, i20));
        } else {
            r12 = 0;
        }
        org.telegram.ui.ActionBar.z n11 = this.actionBar.n();
        n11.setTranslationX(-AndroidUtilities.dp(5.0f));
        if (this.e1 == getUserConfig().clientUserId && !this.s1 && ContactsController.getInstance(this.currentAccount).getPrivacyRules(7) == null) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
        int i21 = 15;
        if (this.q0 != null && !this.s1) {
            org.telegram.ui.ActionBar.v0 a2 = n11.a(32, R.drawable.outline_header_search);
            a2.F();
            a2.H = new ig.d2(this, i21);
            this.U0 = a2;
            a2.setContentDescription(LocaleController.getString(R.string.SearchInSettings));
            this.U0.setSearchFieldHint(LocaleController.getString(R.string.SearchInSettings));
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
        org.telegram.ui.ActionBar.v0 a10 = n11.a(16, R.drawable.profile_video);
        this.R0 = a10;
        a10.setContentDescription(LocaleController.getString(R.string.VideoCall));
        if (this.f1 != 0) {
            this.Q0 = n11.a(15, R.drawable.msg_voicechat2);
            if (ChatObject.isChannelOrGiga(this.E2)) {
                this.Q0.setContentDescription(LocaleController.getString(R.string.VoipChannelVoiceChat));
            } else {
                this.Q0.setContentDescription(LocaleController.getString(R.string.VoipGroupVoiceChat));
            }
        } else {
            org.telegram.ui.ActionBar.v0 a11 = n11.a(15, R.drawable.call);
            this.Q0 = a11;
            a11.setContentDescription(LocaleController.getString(R.string.Call));
        }
        if (this.s1) {
            org.telegram.ui.ActionBar.v0 a12 = n11.a(41, R.drawable.group_edit_profile);
            this.S0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.Edit));
        } else {
            org.telegram.ui.ActionBar.v0 a13 = n11.a(12, R.drawable.group_edit_profile);
            this.S0 = a13;
            a13.setContentDescription(LocaleController.getString(R.string.Edit));
        }
        org.telegram.ui.ActionBar.v0 c10 = n11.c(10, R.drawable.ic_ab_other, this.z0);
        this.T0 = c10;
        c10.setSubMenuDelegate(new fz0(this));
        ImageView imageView = new ImageView(context);
        this.Y0 = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.v8), PorterDuff.Mode.MULTIPLY));
        AndroidUtilities.updateViewVisibilityAnimated(this.Y0, r12, 0.8f, r12);
        this.Y0.setImageResource(R.drawable.msg_mini_autodelete_timer);
        this.T0.addView(this.Y0, w7.x5.d(12, 12.0f, 19, 8.0f, 2.0f, 0.0f, 0.0f));
        this.T0.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.T0.E(bVar4, fh.b.g(this.resourceProvider));
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
            obj = this.v.getTag();
        }
        D3(r12);
        this.d = new a11(this, context);
        this.e = new l11(context, this);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9();
        this.p0 = i9Var;
        i9Var.p = 2.3809524f;
        i9Var.t();
        this.fragmentView.setWillNotDraw(r12);
        k01 k01Var = (k01) this.fragmentView;
        this.m5 = k01Var;
        k01Var.N = true;
        gz0 gz0Var = new gz0(this, context, this.z0);
        this.a = gz0Var;
        gz0Var.o1();
        gz0 gz0Var2 = this.a;
        gz0Var2.getClass();
        int i22 = org.telegram.ui.ActionBar.j6.a7;
        gz0Var2.setBackgroundColor(getThemedColor(i22));
        this.a.setVerticalScrollBarEnabled(r12);
        final bh.l lVar = new bh.l(this.a, (ViewGroup) this.fragmentView, new v8(this, 1));
        lVar.h = true;
        hz0 hz0Var = new hz0(this);
        this.a.setItemAnimator(hz0Var);
        hz0Var.e = 320L;
        hz0Var.d = 320L;
        hz0Var.c = 320L;
        hz0Var.m = r12;
        hz0Var.S();
        hz0Var.o(org.telegram.ui.Components.pr.h);
        this.a.setClipToPadding(r12);
        this.a.setHideIfEmpty(r12);
        iz0 iz0Var = new iz0(this);
        this.c = iz0Var;
        iz0Var.j1(1);
        iz0 iz0Var2 = this.c;
        iz0Var2.r = r12;
        this.a.setLayoutManager(iz0Var2);
        this.a.setGlowColor(r12);
        this.a.setAdapter(this.d);
        frameLayout.addView(this.a, w7.x5.e(-1, -1, 51));
        this.a.setOnItemClickListener(new di.s9(this, context, j10, 5));
        this.a.setOnItemLongClickListener(new mz0(this, context));
        if (this.r1 || this.t1 || this.x1) {
            j5();
            D();
            this.W5 = true;
            this.U5 = this.J4;
            this.V5 = r12;
        }
        if (this.U0 != null) {
            org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context);
            this.b = ll0Var;
            ll0Var.setVerticalScrollBarEnabled(r12);
            this.b.setLayoutManager(new s4.c0(1, r12));
            this.b.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.e8));
            this.b.setAdapter(this.e);
            f6Var = null;
            this.b.setItemAnimator(null);
            this.b.setVisibility(8);
            this.b.setLayoutAnimation(null);
            this.b.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            frameLayout.addView(this.b, w7.x5.e(-1, -1, 51));
            this.b.setOnItemClickListener(new i(this, 28));
            this.b.setOnItemLongClickListener(new ky0(this, 4));
            this.b.setOnScrollListener(new nz0(this, r12));
            this.b.l1(1, true);
            org.telegram.ui.Components.xw0 xw0Var = new org.telegram.ui.Components.xw0(context);
            this.P = xw0Var;
            xw0Var.setAnimateLayoutChange(true);
            this.P.e.setVisibility(8);
            this.P.setVisibility(8);
            frameLayout.addView(this.P);
            this.e.G();
        } else {
            f6Var = null;
        }
        if (this.E1 != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.E1));
            if (this.G2 == null) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(chat);
                tL_channels_getParticipant.participant = getMessagesController().getInputPeer(this.e1);
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new ty0(this, 4));
            }
            bi.g5 g5Var2 = new bi.g5(context, 26);
            g5Var2.setWillNotDraw(r12);
            g5Var2.setPadding(r12, r12, r12, AndroidUtilities.navigationBarHeight);
            frameLayout.addView(g5Var2, w7.x5.a(-1.0f, (AndroidUtilities.navigationBarHeight / AndroidUtilities.density) + 51.0f, 83));
            g5Var2.setOnClickListener(new wy0(r12, this, chat));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.p7));
            textView.setTextSize(1, 15.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.BanFromTheGroupNoCaps));
            g5Var2.addView(textView, w7.x5.d(-2, -2.0f, 17, 0.0f, 1.0f, 0.0f, 0.0f));
            this.a.setPadding(r12, T3(), r12, AndroidUtilities.dp(48.0f));
            this.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f));
        } else {
            this.a.setPadding(r12, T3(), r12, r12);
        }
        o11 o11Var = new o11(this, context);
        this.d1 = o11Var;
        o11Var.a(this.Q5, r12);
        this.d1.setBackgroundColor(getThemedColor(i22));
        frameLayout.addView(this.d1);
        this.m5.T.add(this.d1);
        org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
        this.d0 = oVar;
        oVar.setPivotX(AndroidUtilities.dp(30.0f));
        this.d0.setPivotY(AndroidUtilities.dp(30.0f));
        this.Y = new j0(this, context, 20);
        this.Z = new ah.w(this, context, 21);
        ImageReceiver imageReceiver = new ImageReceiver(this.Z);
        this.r5 = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.Z, true, 1.0f, r12);
        frameLayout.addView(this.Z, w7.x5.d(-1, -1.0f, 8388611, 0.0f, 0.0f, 0.0f, 0.0f));
        this.Y.setPivotX(0.0f);
        this.Y.setPivotY(0.0f);
        org.telegram.ui.Components.sh0 sh0Var = new org.telegram.ui.Components.sh0(context);
        this.t0 = sh0Var;
        sh0Var.addView(this.Y, w7.x5.e(100, 100, 51));
        this.Z.addView(this.t0, w7.x5.c(-1.0f, -1));
        pz0 pz0Var = new pz0(context);
        this.e0 = pz0Var;
        pz0Var.t(O3());
        this.e0.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.e0.setRoundRadiusForExpand(c4());
        this.e0.setPivotX(0.0f);
        this.e0.setPivotY(0.0f);
        this.Y.addView(this.e0, w7.x5.c(-1.0f, -1));
        this.e0.setOnClickListener(new jy0(this, 5));
        this.e0.setHasStories(j4());
        this.e0.setOnLongClickListener(new u(this, 6));
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(this, context);
        this.g0 = y3Var;
        y3Var.setSize(AndroidUtilities.dp(26.0f));
        this.g0.setProgressColor(-1);
        this.g0.setNoProgress(r12);
        this.Y.addView(this.g0, w7.x5.c(-1.0f, -1));
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
        org.telegram.ui.Components.u11 u11Var = new org.telegram.ui.Components.u11(context, f6Var);
        this.l0 = u11Var;
        imageView4.setImageDrawable(u11Var);
        this.h0.setTranslationY(-1.0f);
        frameLayout.addView(this.h0, w7.x5.e(34, 34, 51));
        ImageView imageView5 = new ImageView(context);
        this.i0 = imageView5;
        imageView5.setScaleType(scaleType);
        this.i0.setAlpha(0.0f);
        this.i0.setImageDrawable(new gi.a());
        frameLayout.addView(this.i0, w7.x5.e(16, 16, 51));
        ImageView imageView6 = new ImageView(context);
        this.j0 = imageView6;
        imageView6.setImageResource(R.drawable.star_small_outline);
        this.j0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.s8), PorterDuff.Mode.SRC_IN));
        this.j0.setAlpha(0.0f);
        this.j0.setScaleY(0.0f);
        this.j0.setScaleX(0.0f);
        frameLayout.addView(this.j0, w7.x5.e(20, 20, 51));
        ImageView imageView7 = new ImageView(context);
        this.k0 = imageView7;
        imageView7.setImageResource(R.drawable.star_small_inner);
        this.k0.setAlpha(0.0f);
        this.k0.setScaleY(0.0f);
        this.k0.setScaleX(0.0f);
        frameLayout.addView(this.k0, w7.x5.e(20, 20, 51));
        k5();
        P4(r12, r12);
        qz0 qz0Var = this.n0;
        if (qz0Var != null) {
            qz0Var.K();
        }
        org.telegram.ui.Components.fh0 fh0Var2 = this.m0;
        if (fh0Var2 != null) {
            fh0Var2.e();
        }
        this.N = new b11(this, context);
        org.telegram.ui.Components.fh0 fh0Var3 = new org.telegram.ui.Components.fh0(context);
        this.m0 = fh0Var3;
        fh0Var3.setSize(O3());
        long j11 = this.e1;
        if (j11 == 0) {
            j11 = -this.f1;
        }
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i23 = i11;
        gz0 gz0Var3 = this.a;
        pz0 pz0Var2 = this.e0;
        getClassGuid();
        int i24 = 1;
        this.n0 = new qz0(this, context, j11, kVar3, gz0Var3, pz0Var2, this.N, this.m0);
        if (this.e1 != getUserConfig().clientUserId && (userFull2 = this.v2) != null) {
            this.n5 = userFull2.profile_photo == null ? 0.0f : 1.0f;
        }
        if (!this.q1) {
            this.n0.setChatInfo(this.u2);
        }
        this.Z.addView(this.n0);
        this.Z.addView(this.m0, w7.x5.c(138.0f, -1));
        this.Z.addView(this.N);
        org.telegram.ui.Components.dh0 dh0Var = this.a0;
        if (dh0Var != null) {
            this.m0.setActionsView(dh0Var);
            this.Z.addView(this.a0, w7.x5.c(-1.0f, -1));
        }
        org.telegram.ui.Components.vh0 vh0Var2 = this.c0;
        if (vh0Var2 != null) {
            this.m0.setMusicView(vh0Var2);
            this.Z.addView(this.c0, w7.x5.c(-1.0f, -1));
        }
        this.e0.setAvatarsViewPager(this.n0);
        d11 d11Var = new d11(this, context);
        this.o0 = d11Var;
        this.Z.addView(d11Var, w7.x5.c(-1.0f, -1));
        frameLayout.addView(this.actionBar);
        float f10 = 54 + ((!this.L0 || this.e1 == 0) ? 0 : 54);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var == null || !(d5Var.getLastFragment() instanceof co) || (n10 = ((co) this.parentLayout.getLastFragment()).n()) == null) {
            f7 = f10;
            z10 = false;
        } else {
            boolean z11 = n10.getTitleTextView().getPaddingRight() != 0;
            if (n10.getLayoutParams() != null && n10.getTitleTextView() != null) {
                f10 = ((n10.getWidth() - n10.getTitleTextView().getRight()) + ((ViewGroup.MarginLayoutParams) n10.getLayoutParams()).rightMargin) / AndroidUtilities.density;
            }
            f7 = f10;
            z10 = z11;
        }
        int i25 = 0;
        while (true) {
            org.telegram.ui.ActionBar.j5[] j5VarArr = this.f;
            if (i25 >= j5VarArr.length) {
                break;
            }
            if (this.J1 != 0 || i25 != 0) {
                ll llVar = new ll(this, context, 3);
                j5VarArr[i25] = llVar;
                if (i25 == 1) {
                    llVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.vh));
                } else {
                    llVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.A8));
                }
                j5VarArr[i25].setPadding(r12, AndroidUtilities.dp(6.0f), r12, AndroidUtilities.dp(i25 == 0 ? 12.0f : 4.0f));
                j5VarArr[i25].setTextSizePx(AndroidUtilities.dp(17.5f));
                j5VarArr[i25].setGravity(3);
                j5VarArr[i25].setTypeface(AndroidUtilities.bold());
                j5VarArr[i25].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
                j5VarArr[i25].setPivotX(0.0f);
                j5VarArr[i25].setPivotY(0.0f);
                j5VarArr[i25].setAlpha(i25 == 0 ? 0.0f : 1.0f);
                if (i25 == 1) {
                    j5VarArr[i25].setScrollNonFitText(true);
                    j5VarArr[i25].setImportantForAccessibility(2);
                }
                j5VarArr[i25].setFocusable(i25 == 0);
                j5VarArr[i25].setEllipsizeByGradient(true);
                j5VarArr[i25].setRightDrawableOutside(i25 == 0);
                this.Z.addView(j5VarArr[i25], w7.x5.d(-2, -2.0f, 51, 109.0f, -6.0f, i25 == 0 ? f7 - (z10 ? 10 : 0) : 0.0f, 0.0f));
            }
            i25++;
        }
        int i26 = 0;
        while (true) {
            org.telegram.ui.ActionBar.j5[] j5VarArr2 = this.r;
            if (i26 >= j5VarArr2.length) {
                break;
            }
            if (i26 == 1) {
                j5VarArr2[i26] = new rz0(this, context);
            } else {
                j5VarArr2[i26] = new org.telegram.ui.Components.y80(context);
            }
            j5VarArr2[i26].setEllipsizeByGradient(true);
            j5VarArr2[i26].setTextColor(w3(getThemedColor(org.telegram.ui.ActionBar.j6.B8), null));
            j5VarArr2[i26].setTextSizePx(AndroidUtilities.dp(13.5f));
            j5VarArr2[i26].setGravity(3);
            j5VarArr2[i26].setAlpha(i26 == 0 ? 0.0f : 1.0f);
            j5VarArr2[i26].setPivotX(AndroidUtilities.dp(8.0f));
            j5VarArr2[i26].setPivotY(AndroidUtilities.dp(8.0f));
            if (i26 == 1 || i26 == 2 || i26 == 3) {
                j5VarArr2[i26].setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            }
            if (i26 > 0) {
                j5VarArr2[i26].setImportantForAccessibility(2);
            }
            j5VarArr2[i26].setFocusable(i26 == 0);
            ah.w wVar = this.Z;
            org.telegram.ui.ActionBar.j5 j5Var = j5VarArr2[i26];
            if (i26 == 1 || i26 == 2) {
                i13 = 3;
            } else {
                i13 = 3;
                if (i26 != 3) {
                    i14 = 0;
                    wVar.addView(j5Var, w7.x5.d(-2, -2.0f, 51, 109 - i14, (i26 != 1 || i26 == 2 || i26 == i13) ? -2 : 0, (i26 != 0 ? f7 - (z10 ? 10 : 0) : 8.0f) - ((i26 != 1 || i26 == 2 || i26 == 3) ? 4 : 0), 0.0f));
                    i26++;
                }
            }
            i14 = 4;
            if (i26 != 0) {
            }
            wVar.addView(j5Var, w7.x5.d(-2, -2.0f, 51, 109 - i14, (i26 != 1 || i26 == 2 || i26 == i13) ? -2 : 0, (i26 != 0 ? f7 - (z10 ? 10 : 0) : 8.0f) - ((i26 != 1 || i26 == 2 || i26 == 3) ? 4 : 0), 0.0f));
            i26++;
        }
        B3();
        this.Z.addView(this.d0);
        org.telegram.ui.Components.hw0 hw0Var = new org.telegram.ui.Components.hw0(context);
        this.T = hw0Var;
        hw0Var.setLayoutParams(w7.x5.d(32, 32.0f, 3, 103.0f, -2.0f, 0.0f, 0.0f));
        this.T.setResourcesProvider(this.z0);
        C3();
        this.T.setDelegate(new ky0(this, 10));
        this.T.setOnClickListener(new jy0(this, 0));
        TLRPC.UserFull userFull5 = this.v2;
        if (userFull5 != null) {
            this.T.set(userFull5.stars_rating);
        }
        this.Z.addView(this.T);
        org.telegram.ui.Components.do0 do0Var = new org.telegram.ui.Components.do0(this, context, context, i24);
        this.s = do0Var;
        do0Var.setAlpha(0.0f);
        this.Z.addView(this.s, w7.x5.d(-2, -2.0f, 51, 109.33f, -2.0f, 8.0f, 0.0f));
        this.u0 = new sz0(this, context, this.currentAccount, a(), this.q1, this.Y, this.e0, this.z0, context);
        l5(false);
        TLRPC.UserFull userFull6 = this.v2;
        if (userFull6 != null) {
            this.u0.setStories(userFull6.stories);
        } else {
            TLRPC.ChatFull chatFull3 = this.u2;
            if (chatFull3 != null) {
                this.u0.setStories(chatFull3.stories);
            }
        }
        pz0 pz0Var3 = this.e0;
        if (pz0Var3 != null) {
            pz0Var3.setHasStories(j4());
        }
        this.Z.addView(this.u0, w7.x5.c(-1.0f, -1));
        zh.g0 g0Var = new zh.g0(context, this.currentAccount, a(), this.Y);
        this.v0 = g0Var;
        this.Z.addView(g0Var, 0, w7.x5.c(-1.0f, -1));
        i5(true);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        this.v = aj0Var;
        if (this.a0 != null) {
            aj0Var.setVisibility(8);
        }
        p5();
        if (this.e1 == 0) {
            this.v.setImageResource(R.drawable.profile_discuss);
            this.v.setContentDescription(LocaleController.getString(R.string.ViewDiscussion));
        } else if (this.q0 != null) {
            this.V = new org.telegram.ui.Components.xi0(R.raw.camera_outline, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            this.W = new org.telegram.ui.Components.xi0(R.raw.camera_outline, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
            org.telegram.ui.Components.dh0 dh0Var2 = this.a0;
            if (dh0Var2 != null) {
                dh0Var2.e();
                this.a0.a();
                this.a0.b();
                this.a0.c();
                org.telegram.ui.Components.dh0 dh0Var3 = this.a0;
                if (dh0Var3.I) {
                    dh0Var3.I = false;
                    dh0Var3.d();
                }
            } else {
                this.v.setAnimation(this.V);
                this.v.setContentDescription(LocaleController.getString(R.string.AccDescrChangeProfilePicture));
                this.v.setPadding(AndroidUtilities.dp(2.0f), 0, 0, AndroidUtilities.dp(2.0f));
            }
        } else {
            org.telegram.ui.Components.dh0 dh0Var4 = this.a0;
            if (dh0Var4 != null) {
                dh0Var4.o(0, true);
            }
            this.v.setImageResource(R.drawable.profile_newmsg);
            this.v.setContentDescription(LocaleController.getString(R.string.AccDescrOpenChat));
        }
        org.telegram.ui.Components.aj0 aj0Var2 = this.v;
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        aj0Var2.setScaleType(scaleType2);
        frameLayout.addView(this.v, w7.x5.d(60, 60.0f, 53, 0.0f, 0.0f, 16.0f, 0.0f));
        this.v.setOnClickListener(new jy0(this, i24));
        k4(false);
        if (i23 != -1 && obj != null) {
            this.v.setTag(0);
            this.v.setScaleX(0.2f);
            this.v.setScaleY(0.2f);
            this.v.setAlpha(0.0f);
        }
        this.a.setOnScrollListener(new nz0(this, i24));
        UndoView undoView = new UndoView(context, null, false, this.z0);
        this.M = undoView;
        frameLayout.addView(undoView, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        int i27 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.j2 = ofFloat;
        ofFloat.addUpdateListener(new py0(this, 0));
        this.j2.setInterpolator(org.telegram.ui.Components.pr.h);
        this.j2.addListener(new tz0(this));
        j5();
        R();
        org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(getParentActivity(), 9);
        this.X = i40Var;
        i40Var.setAlpha(0.0f);
        frameLayout.addView(this.X, w7.x5.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
        this.O.setForwardRestrictedHint(this.X);
        uz0 uz0Var = new uz0(this, (ViewGroup) getParentActivity().getWindow().getDecorView(), frameLayout);
        this.V4 = uz0Var;
        uz0Var.E = new fz0(this);
        this.n0.setPinchToZoomHelper(uz0Var);
        this.x0.setAlpha(0);
        this.y0.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.i6));
        this.m5.T.add(this.O);
        m5();
        t50 t50Var = new t50(this, context, 6);
        this.U = t50Var;
        if (Build.VERSION.SDK_INT >= 23) {
            t50Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.d6), 100)));
        }
        this.U.setFocusable(false);
        this.U.setImportantForAccessibility(2);
        this.U.setOnClickListener(new jy0(this, i27));
        this.U.setVisibility(8);
        this.U.setFitsSystemWindows(true);
        this.m5.addView(this.U, w7.x5.c(-1.0f, -1));
        F3();
        if (this.s1) {
            i12 = 87;
            this.m5.addView(this.s5, w7.x5.e(-1, 60, 87));
        } else {
            i12 = 87;
        }
        org.telegram.ui.Components.dh0 dh0Var5 = this.a0;
        if (dh0Var5 != null && dh0Var5.l()) {
            ImageView imageView8 = new ImageView(context);
            this.O0 = imageView8;
            imageView8.setScaleType(scaleType2);
            this.O0.setImageResource(R.drawable.call);
            this.O0.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            layoutParams.topMargin = this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.setMarginEnd(layoutParams.width);
            layoutParams.gravity = 8388613;
            frameLayout.addView(this.O0, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y5 = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        View view = new View(context);
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d7));
        this.y5.addView(view, w7.x5.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        di.d dVar = new di.d(context, this.z0);
        this.z5 = dVar;
        dVar.h(LocaleController.getString(R.string.Save));
        this.y5.addView(this.z5, w7.x5.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        this.z5.setOnClickListener(new jy0(this, 3));
        this.y5.setVisibility(8);
        this.y5.setTranslationY(AndroidUtilities.dp(69.0f));
        this.m5.addView(this.y5, w7.x5.e(-1, -2, i12));
        this.s6 = new ch.a() { // from class: org.telegram.ui.uy0
            @Override // ch.a
            public final void e(bh.a aVar, RectF rectF) {
                aVar.a = true;
            }

            @Override // ch.a
            public final void f(Canvas canvas, RectF rectF) {
                lVar.f(canvas, rectF);
                org.telegram.ui.Components.lh lhVar = ProfileActivity.this.O.c2;
                if (lhVar != null) {
                    lhVar.f(canvas, rectF);
                }
            }
        };
        r0.i0.m(this.fragmentView, new ky0(this, i27));
        return this.fragmentView;
    }

    public final org.telegram.ui.Components.or d4(int i10) {
        MessagesController.PeerColor peerColor;
        org.telegram.ui.Components.or[] orVarArr = this.J;
        if (orVarArr[i10] == null) {
            Drawable mutate = org.telegram.ui.ActionBar.j6.Q1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr = this.y;
            drawableArr[i10] = mutate;
            Drawable mutate2 = org.telegram.ui.ActionBar.j6.R1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr2 = this.I;
            drawableArr2[i10] = mutate2;
            if (i10 == 1 && (peerColor = this.Q5) != null) {
                int b10 = org.telegram.ui.ActionBar.j6.b(0.1f, org.telegram.ui.ActionBar.j6.I.q() ? -0.1f : -0.08f, peerColor.hasColor6(org.telegram.ui.ActionBar.j6.I.q()) ? this.Q5.getColor5() : this.Q5.getColor3());
                Drawable drawable = drawableArr[1];
                int offsetColor = AndroidUtilities.getOffsetColor(b10, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oi, this.z0), this.E5, 1.0f);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(offsetColor, mode);
                drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.z0), this.E5, 1.0f), mode);
            }
            orVarArr[i10] = new org.telegram.ui.Components.or(new org.telegram.ui.Components.oq(drawableArr[i10], drawableArr2[i10]), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return orVarArr[i10];
    }

    public final void d5() {
        e5(false, false);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        a11 a11Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.Chat chat;
        gz0 gz0Var;
        gz0 gz0Var2;
        org.telegram.ui.Components.vk0 vk0Var;
        if (i10 == NotificationCenter.uploadStoryEnd || i10 == NotificationCenter.chatWasBoostedByUser) {
            if (ChatObject.isBoostSupported(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f1)))) {
                getMessagesController().getStoriesController().k(a(), new bi.f(28), false, this.z0);
                return;
            }
            return;
        }
        int i12 = 0;
        r3 = false;
        boolean z10 = false;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            boolean z11 = ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0 && (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) == 0) ? false : true;
            if (this.e1 != 0) {
                if (z11) {
                    i5(true);
                }
                if ((intValue & MessagesController.UPDATE_MASK_PHONE) == 0 || (gz0Var2 = this.a) == null || (vk0Var = (org.telegram.ui.Components.vk0) gz0Var2.L(this.G3, false)) == null) {
                    return;
                }
                this.d.v(vk0Var, this.G3);
                return;
            }
            if (this.f1 != 0) {
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0) {
                        e5(true, false);
                    } else {
                        h5(true);
                    }
                    i5(true);
                }
                if (!z11 || (gz0Var = this.a) == null) {
                    return;
                }
                int childCount = gz0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = this.a.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.za) {
                        ((org.telegram.ui.Cells.za) childAt).j(intValue);
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
            h5(true);
            i5(false);
            return;
        }
        if (i10 == NotificationCenter.contactsDidLoad || i10 == NotificationCenter.channelRightsUpdated) {
            D3(true);
            return;
        }
        if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.j1) {
                AndroidUtilities.runOnUIThread(new rx0(5, this, objArr));
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
            e5(false, false);
            FlagSecureReason flagSecureReason = this.X1;
            if (flagSecureReason != null) {
                flagSecureReason.invalidate();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.blockedUsersDidLoad) {
            boolean z12 = this.k1;
            boolean z13 = getMessagesController().blockePeers.indexOfKey(this.e1) >= 0;
            this.k1 = z13;
            if (z12 != z13) {
                D3(true);
                e5(false, false);
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
                    m01 m01Var = this.O;
                    if (m01Var != null) {
                        m01Var.setChatInfo(this.u2);
                    }
                    TLRPC.ChatFull chatFull6 = this.u2;
                    if (chatFull6 != null && (((inputGroupCall = chatFull6.call) == null && !this.p1) || (inputGroupCall != null && this.p1))) {
                        D3(false);
                    }
                    sz0 sz0Var = this.u0;
                    if (sz0Var != null && (chatFull3 = this.u2) != null) {
                        sz0Var.setStories(chatFull3.stories);
                    }
                    zh.g0 g0Var = this.v0;
                    if (g0Var != null) {
                        g0Var.a();
                    }
                    pz0 pz0Var = this.e0;
                    if (pz0Var != null) {
                        pz0Var.setHasStories(j4());
                    }
                    if (l10.longValue() != 0) {
                        boolean z14 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.u2) == null || !chatFull2.stargifts_available) ? false : true;
                        this.T0.I(38, z14);
                        org.telegram.ui.Components.dh0 dh0Var = this.a0;
                        if (dh0Var != null) {
                            dh0Var.o(3, z14);
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
                e5(true, false);
            }
            TLRPC.Chat chat3 = this.E2;
            if (chat3 != null && chatFull7.id == chat3.linked_community_id) {
                e5(true, false);
            }
            if (chatFull7.id == this.f1) {
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                TLRPC.ChatFull chatFull8 = this.u2;
                if ((chatFull8 instanceof TLRPC.TL_channelFull) && chatFull7.participants == null) {
                    chatFull7.participants = chatFull8.participants;
                }
                boolean z15 = chatFull8 == null && (chatFull7 instanceof TLRPC.TL_channelFull);
                this.u2 = chatFull7;
                if (this.m1 == 0) {
                    long j3 = chatFull7.migrated_from_chat_id;
                    if (j3 != 0) {
                        this.m1 = -j3;
                        getMediaDataController().getMediaCount(this.m1, this.g1, 0, this.classGuid, true);
                    }
                }
                L3();
                qz0 qz0Var = this.n0;
                if (qz0Var != null && !this.q1) {
                    qz0Var.setChatInfo(this.u2);
                }
                e5(true, false);
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f1));
                if (chat4 != null) {
                    this.E2 = chat4;
                    D3(true);
                }
                FlagSecureReason flagSecureReason2 = this.X1;
                if (flagSecureReason2 != null) {
                    flagSecureReason2.invalidate();
                }
                if (this.E2.megagroup && (z15 || !booleanValue)) {
                    R3(true);
                }
                T4();
                m5();
                sz0 sz0Var2 = this.u0;
                if (sz0Var2 != null && (chatFull = this.u2) != null) {
                    sz0Var2.setStories(chatFull.stories);
                }
                zh.g0 g0Var2 = this.v0;
                if (g0Var2 != null) {
                    g0Var2.a();
                }
                pz0 pz0Var2 = this.e0;
                if (pz0Var2 != null) {
                    pz0Var2.setHasStories(j4());
                }
                m01 m01Var2 = this.O;
                if (m01Var2 != null) {
                    m01Var2.setChatInfo(this.u2);
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
            if (longValue2 == a()) {
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
                e5(false, false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.userInfoDidLoad) {
            if (((Long) objArr[0]).longValue() == this.e1) {
                TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                this.v2 = userFull;
                org.telegram.ui.Components.hw0 hw0Var = this.T;
                if (hw0Var != null) {
                    hw0Var.set(userFull.stars_rating);
                }
                sz0 sz0Var3 = this.u0;
                if (sz0Var3 != null) {
                    sz0Var3.setStories(this.v2.stories);
                }
                zh.g0 g0Var3 = this.v0;
                if (g0Var3 != null) {
                    g0Var3.a();
                }
                pz0 pz0Var3 = this.e0;
                if (pz0Var3 != null) {
                    pz0Var3.setHasStories(j4());
                }
                m01 m01Var3 = this.O;
                if (m01Var3 != null) {
                    m01Var3.setUserInfo(this.v2);
                }
                if (this.q0 == null) {
                    if (this.G1 || this.K0) {
                        this.I1 = true;
                    } else {
                        D3(true);
                    }
                    e5(false, false);
                    m01 m01Var4 = this.O;
                    if (m01Var4 != null) {
                        m01Var4.setCommonGroupsCount(this.v2.common_chats_count);
                        R();
                        org.telegram.ui.Components.pu0 pu0Var = this.R;
                        if (pu0Var == null || pu0Var.y) {
                            resumeDelayedFragmentAnimation();
                            k4(true);
                        }
                    }
                } else if (this.d != null && !TextUtils.equals(this.v2.about, this.z2)) {
                    this.d.m(this.W2);
                }
                T4();
                m5();
                if (this.w2 == null && !h4()) {
                    org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(this.currentAccount);
                    this.w2 = f6Var;
                    yb0 yb0Var = new yb0(this, 15);
                    if (f6Var.c) {
                        yb0Var.run();
                    } else {
                        f6Var.h.add(yb0Var);
                    }
                    this.w2.d(this.v2);
                }
                if (!h4()) {
                    p11 p11Var = this.y2;
                    p11 c10 = p11.c(this.currentAccount, this.v2, p11Var);
                    this.y2 = c10;
                    this.x2 = c10 != p11Var;
                    if (c10 != null) {
                        yb0 yb0Var2 = new yb0(this, 16);
                        if (c10.b) {
                            yb0Var2.run();
                        } else {
                            c10.h.add(yb0Var2);
                        }
                    }
                }
                if (this.T0 != null) {
                    if (e4()) {
                        this.T0.K(44);
                    } else {
                        this.T0.r(44);
                    }
                    TLRPC.UserFull userFull2 = this.v2;
                    if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                        z10 = true;
                    }
                    this.T0.I(46, z10);
                    this.T0.I(47, !z10);
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
                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (a11Var = this.d) != null) {
                            a11Var.l();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            gz0 gz0Var3 = this.a;
            if (gz0Var3 != null) {
                gz0Var3.e1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.reloadInterface) {
            e5(false, false);
            return;
        }
        if (i10 == NotificationCenter.newSuggestionsAvailable) {
            int i15 = this.c3;
            int i16 = this.a3;
            int i17 = this.Y2;
            j5();
            a11 a11Var2 = this.d;
            if (a11Var2 != null) {
                if (i15 == this.c3 && i16 == this.a3 && i17 == this.Y2) {
                    return;
                }
                a11Var2.l();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.topicsDidLoaded) {
            if (this.q1) {
                i5(false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateSearchSettings) {
            l11 l11Var = this.e;
            if (l11Var != null) {
                l11Var.c = l11.H(this);
                this.e.v.clear();
                this.e.J();
                l11 l11Var2 = this.e;
                l11Var2.I(l11Var2.y);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.reloadDialogPhotos) {
            i5(false);
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated || i10 == NotificationCenter.storiesReadUpdated) {
            pz0 pz0Var4 = this.e0;
            if (pz0Var4 != null) {
                pz0Var4.setHasStories(j4());
                this.e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, this.k2));
            }
            sz0 sz0Var4 = this.u0;
            if (sz0Var4 != null) {
                TLRPC.UserFull userFull3 = this.v2;
                if (userFull3 != null) {
                    sz0Var4.setStories(userFull3.stories);
                    return;
                }
                TLRPC.ChatFull chatFull9 = this.u2;
                if (chatFull9 != null) {
                    sz0Var4.setStories(chatFull9.stories);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            org.telegram.ui.ActionBar.v0 v0Var = this.T0;
            if (v0Var != null) {
                v0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.e1)));
            }
            W4();
            return;
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            W4();
            return;
        }
        if (i10 == NotificationCenter.starBalanceUpdated) {
            e5(false, false);
            return;
        }
        if (i10 == NotificationCenter.botStarsUpdated) {
            e5(false, false);
            return;
        }
        if (i10 == NotificationCenter.botStarsTransactionsLoaded) {
            e5(false, false);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted) {
            if (a() == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
                if (d5Var == null || d5Var.getLastFragment() != this) {
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
            if (this.J4 >= 0 || longValue3 != a()) {
                return;
            }
            j5();
            R();
            a11 a11Var3 = this.d;
            if (a11Var3 != null) {
                a11Var3.l();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() != a() || h4()) {
                return;
            }
            if (this.J4 >= 0) {
                m01 m01Var5 = this.O;
                if (m01Var5 != null) {
                    m01Var5.v1(true);
                    return;
                }
                return;
            }
            j5();
            R();
            a11 a11Var4 = this.d;
            if (a11Var4 != null) {
                a11Var4.l();
            }
            AndroidUtilities.runOnUIThread(new yb0(this, 17));
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
            j5();
            R();
            gz0 gz0Var4 = this.a;
            if (gz0Var4 != null && gz0Var4.b0()) {
                this.a.post(new yb0(this, 19));
                return;
            }
            a11 a11Var5 = this.d;
            if (a11Var5 != null) {
                a11Var5.l();
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
        a0.i iVar = this.C1;
        if (iVar != null && (chatParticipant = (TLRPC.ChatParticipant) iVar.f(longValue5)) != null) {
            chatParticipant.setRank(longValue5, str);
        }
        TLRPC.ChannelParticipant channelParticipant = this.G2;
        if (channelParticipant != null && channelParticipant.user_id == longValue5) {
            channelParticipant.rank = str;
        }
        while (true) {
            ArrayList arrayList2 = this.Q4;
            if (i12 >= arrayList2.size()) {
                AndroidUtilities.updateVisibleRows(this.a);
                return;
            } else {
                ((TLRPC.ChatParticipant) arrayList2.get(i12)).setRank(longValue5, str);
                i12++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.u40 u40Var = this.q0;
        if (u40Var == null || !u40Var.g(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.u40 u40Var = this.q0;
        return (u40Var == null || dialog != u40Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final boolean e4() {
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

    public final void e5(boolean z10, boolean z11) {
        if (this.d == null) {
            if (z10) {
                h5(false);
            }
            j5();
            return;
        }
        if (!z11 && this.a.isInLayout()) {
            gz0 gz0Var = this.a;
            if (gz0Var.G) {
                gz0Var.post(new org.telegram.ui.Components.mr0(9, this, z10));
                return;
            }
            return;
        }
        o01 o01Var = new o01(this);
        o01Var.b = this.N2;
        o01Var.f(o01Var.c);
        o01Var.e.clear();
        o01Var.f.clear();
        o01Var.e.addAll(this.Q4);
        o01Var.f.addAll(this.R4);
        o01Var.g = this.u4;
        o01Var.h = this.v4;
        if (z10) {
            h5(false);
        }
        F4();
        j5();
        o01Var.f(o01Var.d);
        try {
            s4.o.c(o01Var, true).b(this.d);
        } catch (Exception e7) {
            FileLog.e(e7);
            this.d.l();
        }
        int i10 = this.U5;
        if (i10 >= 0) {
            this.c.h1(i10, this.V5 - this.a.getPaddingTop());
        }
        AndroidUtilities.updateVisibleRows(this.a);
    }

    @Override // org.telegram.ui.Components.jt0
    public final org.telegram.ui.Components.ll0 f() {
        return this.a;
    }

    public final void f4() {
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        this.n2 = point.x > point.y;
    }

    public final void f5() {
        if (this.c0 == null || this.r[1] == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        boolean z10 = this.G1;
        if (z10 && this.J1 == 2 && this.Y != null) {
            this.c0.setAlpha(this.S1);
            org.telegram.ui.Components.vh0 vh0Var = this.c0;
            float dp = AndroidUtilities.dp(74.0f) + this.a.getMeasuredWidth();
            vh0Var.L = O3() - AndroidUtilities.dp(74.0f);
            vh0Var.setTranslationY(dp - AndroidUtilities.dp(12.0f));
            vh0Var.invalidate();
            return;
        }
        if (z10) {
            this.c0.setAlpha(this.S1);
        }
        float f7 = currentActionBarHeight;
        float dp2 = this.Q1 + f7 + AndroidUtilities.dp(74.0f);
        float min = Math.min(O3(), dp2 - f7);
        org.telegram.ui.Components.vh0 vh0Var2 = this.c0;
        vh0Var2.L = min - AndroidUtilities.dp(74.0f);
        vh0Var2.setTranslationY((dp2 - min) - AndroidUtilities.dp(12.0f));
        vh0Var2.invalidate();
    }

    @Override // org.telegram.ui.Components.jt0
    public final TLRPC.Chat g() {
        return this.E2;
    }

    public final boolean g4() {
        return this.E2 != null ? getMessagesController().isChatNoForwards(this.E2) : getMessagesController().isUserNoForwards(this.v2);
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
    public final void g5(boolean z10) {
        int i10;
        a11 a11Var;
        if (z10 && (i10 = this.N3) >= 0 && (a11Var = this.d) != null) {
            a11Var.m(i10);
        }
        org.telegram.ui.Components.dh0 dh0Var = this.a0;
        if (dh0Var == null || this.s1) {
            return;
        }
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        long j3 = this.i1;
        if (j3 == 0) {
            j3 = this.e1;
            if (j3 == 0) {
                j3 = -this.f1;
            }
        }
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, this.g1);
        boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
        boolean z11 = false;
        int c10 = org.telegram.messenger.w1.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
        int c11 = org.telegram.messenger.w1.c(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL, sharedPrefKey, notificationsSettings, 0);
        if (c10 != 3 || c11 == Integer.MAX_VALUE) {
            if (c10 == 0) {
                if (!contains) {
                    z11 = getNotificationsController().isGlobalNotificationsEnabled(j3, false, false);
                    dh0Var.setNotifications(z11);
                }
                z11 = true;
                dh0Var.setNotifications(z11);
            }
        }
    }

    public float getAvatarAnimationProgress() {
        return this.S1;
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ cv0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.z0;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        if (this.z0 != null) {
            return null;
        }
        xy0 xy0Var = new xy0(0, this);
        ArrayList arrayList = new ArrayList();
        m01 m01Var = this.O;
        if (m01Var != null) {
            arrayList.addAll(m01Var.getThemeDescriptions());
        }
        gz0 gz0Var = this.a;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(gz0Var, 0, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, null, null, null, null, i10));
        gz0 gz0Var2 = this.a;
        int i11 = org.telegram.ui.ActionBar.j6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(gz0Var2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.f8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.pc));
        int i12 = org.telegram.ui.ActionBar.j6.h8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.Bh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, i12));
        org.telegram.ui.Components.do0 do0Var = this.s;
        if (do0Var != null) {
            TextView textView = do0Var.getTextView();
            int i13 = org.telegram.ui.ActionBar.j6.Pi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, xy0Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.s.getNextTextView(), 4, null, null, null, xy0Var, i13));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d1, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        pz0 pz0Var = this.e0;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.r0;
        int i14 = org.telegram.ui.ActionBar.j6.J7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(pz0Var, 0, null, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0, 0, null, null, new Drawable[]{this.p0}, null, org.telegram.ui.ActionBar.j6.d8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 8, null, null, null, null, org.telegram.ui.ActionBar.j6.wh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.xh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.yh));
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.x6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        int i16 = org.telegram.ui.ActionBar.j6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i15));
        int i17 = org.telegram.ui.ActionBar.j6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"detailTextView"}, null, null, -1, null, i17));
        int i19 = org.telegram.ui.ActionBar.j6.J6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 2, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"detailTextView"}, null, null, -1, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.Sh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"yesButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.j6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 131072, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"yesButton"}, null, null, -1, null, i21));
        int i22 = org.telegram.ui.ActionBar.j6.Qh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 196608, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"yesButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"noButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 131072, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"noButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 196608, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"noButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.i5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 4, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.uh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusColor"}, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusOnlineColor"}, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.za.class}, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        int i23 = org.telegram.ui.ActionBar.j6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 4, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.j6.P1, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 2, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.j6.P1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.j6.m0, null, null, org.telegram.ui.ActionBar.j6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        boolean z10 = this.F5;
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.f;
        if (z10) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(j5VarArr[1], 0, null, null, this.I, null, org.telegram.ui.ActionBar.j6.Oi));
            arrayList.add(new org.telegram.ui.ActionBar.l6(j5VarArr[1], 0, null, null, this.y, null, i10));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(j5VarArr[1], 0, null, null, this.I, null, org.telegram.ui.ActionBar.j6.Ah));
        arrayList.add(new org.telegram.ui.ActionBar.l6(j5VarArr[1], 0, null, null, this.y, null, org.telegram.ui.ActionBar.j6.zh));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.z0);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Drawable getThemedDrawable(String str) {
        org.telegram.ui.ActionBar.f6 f6Var = this.z0;
        Drawable drawable = f6Var != null ? f6Var.getDrawable(str) : null;
        return drawable != null ? drawable : super.getThemedDrawable(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0110, code lost:
    
        if (r24.inviter_id != getUserConfig().getClientUserId()) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0112, code lost:
    
        if (r25 == false) goto L85;
     */
    @Override // org.telegram.ui.Components.jt0
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
        String str;
        boolean z20;
        TLRPC.ChannelParticipant channelParticipant;
        boolean z21;
        boolean z22;
        if (getParentActivity() != null) {
            if (z10) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                if (user != null) {
                    long j3 = chatParticipant.user_id;
                    this.A2 = j3;
                    boolean z23 = j3 == getUserConfig().getClientUserId();
                    if (ChatObject.isChannel(this.E2)) {
                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str2 = channelParticipant.rank;
                        boolean z24 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        boolean z25 = z24 || (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin);
                        getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                        z13 = ChatObject.canAddAdmins(this.E2);
                        boolean z26 = ChatObject.canManageTags(this.E2) && (!z25 || ((!z24 && channelParticipant.can_edit) || z23));
                        if (z24 || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit)) {
                            z13 = false;
                            z26 = false;
                        }
                        if ((z23 || (channelParticipant instanceof TLRPC.TL_channelParticipantSelf)) && ChatObject.canManageMyTag(this.E2)) {
                            z26 = true;
                        }
                        z12 = ChatObject.canBlockUsers(this.E2) && (!((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || z24) || channelParticipant.can_edit);
                        z16 = this.E2.gigagroup ? false : z12;
                        z17 = z24;
                        z18 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                        z19 = z25;
                        z14 = z23;
                        str = str2;
                        z20 = z26;
                    } else {
                        String str3 = chatParticipant.rank;
                        boolean z27 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        boolean z28 = z27 || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator);
                        boolean z29 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        TLRPC.Chat chat = this.E2;
                        z12 = chat.creator || ((chatParticipant instanceof TLRPC.TL_chatParticipant) && (ChatObject.canBlockUsers(chat) || chatParticipant.inviter_id == getUserConfig().getClientUserId()));
                        TLRPC.Chat chat2 = this.E2;
                        z13 = chat2.creator;
                        if (ChatObject.canManageTags(chat2)) {
                            z14 = z23;
                            if (z28) {
                                if (!z29) {
                                }
                            }
                            z15 = true;
                            z16 = this.E2.creator;
                            z17 = z29;
                            z18 = z27;
                            z19 = z28;
                            str = str3;
                            z20 = z15;
                            channelParticipant = null;
                        } else {
                            z14 = z23;
                        }
                        if (!z14 || !ChatObject.canManageMyTag(this.E2)) {
                            z15 = false;
                            z16 = this.E2.creator;
                            z17 = z29;
                            z18 = z27;
                            z19 = z28;
                            str = str3;
                            z20 = z15;
                            channelParticipant = null;
                        }
                        z15 = true;
                        z16 = this.E2.creator;
                        z17 = z29;
                        z18 = z27;
                        z19 = z28;
                        str = str3;
                        z20 = z15;
                        channelParticipant = null;
                    }
                    if (z14) {
                        z21 = (ChatObject.canManageMyTag(this.E2) || (z19 && ChatObject.canManageTags(this.E2))) ? true : z20;
                        z13 = false;
                        z16 = false;
                        z22 = false;
                    } else {
                        z21 = z20;
                        z22 = z12;
                    }
                    boolean z30 = z13 || z21 || z16 || z22;
                    if (z11 || !z30) {
                        return z30;
                    }
                    TLRPC.ChannelParticipant channelParticipant2 = channelParticipant;
                    org.telegram.messenger.nk nkVar = new org.telegram.messenger.nk(this, channelParticipant2, user, chatParticipant, z18, str);
                    String str4 = str;
                    boolean z31 = z18;
                    Drawable U0 = view.getParent() instanceof org.telegram.ui.Components.ll0 ? ((org.telegram.ui.Components.ll0) view.getParent()).U0(view, false) : null;
                    org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(this, view);
                    H.W(U0);
                    H.w = false;
                    H.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new iy0(this, user, 0), !z14);
                    if (!z14 && (z13 || z21 || z16 || z22)) {
                        H.k();
                    }
                    H.l((z19 || !TextUtils.isEmpty(str4)) ? R.drawable.menu_tag_edit : R.drawable.menu_tag_plus, LocaleController.getString(z19 ? R.string.EditAdminTag : TextUtils.isEmpty(str4) ? R.string.AddMemberTag : R.string.EditMemberTag), new bi.i7(this, user, str4, z19, z17), z21);
                    H.l(R.drawable.msg_admins, LocaleController.getString(z31 ? R.string.EditAdminRights : R.string.SetAsAdmin), new rl0(nkVar, 24), z13);
                    H.l(R.drawable.msg_permissions, LocaleController.getString(R.string.ChangePermissions), new h90(this, channelParticipant2, chatParticipant, user, nkVar, 18), z16);
                    H.m(z22, R.drawable.msg_remove, LocaleController.getString(R.string.KickFromGroup), true, new rx0(6, this, chatParticipant));
                    H.S = 190;
                    H.Z();
                    return true;
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

    public final boolean h4() {
        return (this.q0 == null || this.s1) ? false : true;
    }

    public final void h5(boolean z10) {
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
                i11 = com.google.android.gms.internal.vision.e2.e(i10, i11, 1, arrayList);
            }
            i10 = TLObject.FLAG_31;
            i11 = com.google.android.gms.internal.vision.e2.e(i10, i11, 1, arrayList);
        }
        try {
            Collections.sort(this.C2, Comparator$-EL.reversed(Comparator$-CC.comparingInt(new gf(arrayList, 1))));
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (z10 && this.d != null && this.u4 > 0) {
            AndroidUtilities.updateVisibleRows(this.a);
        }
        if (this.O == null || this.J4 == -1) {
            return;
        }
        if ((this.C2.size() > 5 || this.S4 == 2) && this.S4 != 1) {
            this.O.a1(this.C2, this.u2);
        }
    }

    public final void i4(boolean z10) {
        boolean isForum = ChatObject.isForum(this.E2);
        TLRPC.Chat chat = this.E2;
        org.telegram.ui.Components.e5.s(this, false, chat, null, false, isForum || z10 || (chat != null && chat.creator), z10, !isForum, new ky0(this, 1));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(52:35|(1:368)(1:39)|(1:41)(1:367)|42|(3:44|(1:46)(1:48)|47)|49|(1:51)|52|(1:54)|55|(1:57)|58|(1:60)(1:366)|61|(4:63|(1:364)(1:67)|68|(1:70)(1:363))(1:365)|71|(1:73)|74|(1:(1:77)(30:(1:361)(1:81)|82|(1:86)|(1:357)(1:92)|93|(2:95|(2:97|(1:99))(2:295|(1:302)(1:301)))(2:303|(1:305)(2:306|(1:356)(2:312|(1:314)(2:315|(2:317|(1:319)(1:320))(30:321|(1:323)(1:355)|324|(1:354)(1:338)|339|340|(4:344|(1:352)(1:348)|349|(1:351))|353|101|(1:294)(1:105)|106|107|108|(1:110)|111|(4:114|(2:116|117)(21:(1:(1:247)(1:246))(1:121)|(1:(1:230)(2:224|(1:226)(2:227|(1:229))))(1:124)|125|(1:221)(1:128)|129|(1:220)(1:132)|133|(1:135)(1:219)|136|(1:138)(1:218)|139|(4:198|(4:200|(1:217)(2:204|(1:206)(1:216))|207|(2:212|(3:214|184|185)(1:215))(1:211))|187|185)(4:142|(2:196|197)(2:146|(1:148)(5:188|(1:195)|190|191|(1:193)(1:194)))|149|(2:181|(3:183|184|185)(3:186|187|185))(1:153))|(1:180)(2:157|(7:159|160|(1:164)|165|(1:178)(1:169)|170|(2:174|175)))|179|160|(1:164)|165|(1:167)|178|170|(1:177)(3:172|174|175))|118|112)|248|249|(3:251|(1:283)(1:257)|258)(2:284|(10:291|260|(1:262)|263|(1:265)|266|(1:282)(1:272)|273|(1:275)(1:281)|276)(1:290))|259|260|(0)|263|(0)|266|(2:268|270)|282|273|(0)(0)|276)))))|100|101|(1:103)|294|106|107|108|(0)|111|(1:112)|248|249|(0)(0)|259|260|(0)|263|(0)|266|(0)|282|273|(0)(0)|276))|362|82|(30:84|86|(2:88|90)|357|93|(0)(0)|100|101|(0)|294|106|107|108|(0)|111|(1:112)|248|249|(0)(0)|259|260|(0)|263|(0)|266|(0)|282|273|(0)(0)|276)|359|86|(0)|357|93|(0)(0)|100|101|(0)|294|106|107|108|(0)|111|(1:112)|248|249|(0)(0)|259|260|(0)|263|(0)|266|(0)|282|273|(0)(0)|276) */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x081e, code lost:
    
        if (r38.u2.can_view_participants != false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0a79, code lost:
    
        if (r2[r10].j(r7.getRightDrawable2()) != false) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0ad9, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0aa2, code lost:
    
        if (r2[r10].k(r13) != false) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0ab9, code lost:
    
        if (r2[r10].k(org.telegram.messenger.LocaleController.getString(org.telegram.messenger.R.string.ChatMessageSuggestions)) != false) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0ad7, code lost:
    
        if (r2[r10].k(r8) != false) goto L532;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0c0f  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0d4b  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0d51  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0d5e  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0c36  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0d3d  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0d40  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0c20  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0d7a  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0d82  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0d8e  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0df5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0e19  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0e29  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0e47  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0e70  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0e89  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0e8b  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0e07  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0d9a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i5(boolean z10) {
        org.telegram.ui.ActionBar.j5[] j5VarArr;
        Object obj;
        boolean z11;
        long j3;
        boolean z12;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str;
        Object obj2;
        org.telegram.ui.ActionBar.j5[] j5VarArr2;
        CharSequence formatPluralString;
        TLRPC.ChatParticipants chatParticipants;
        CharSequence charSequence;
        boolean z13;
        int i10;
        boolean z14;
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        ImageLocation C;
        View m10;
        TLRPC.Chat chat;
        ImageLocation imageLocation;
        CharSequence charSequence2;
        Paint.FontMetricsInt fontMetricsInt;
        boolean z15;
        boolean z16;
        String str2;
        boolean z17;
        String str3;
        TLRPC.ChatFull chatFull;
        String formatShortNumber;
        String str4;
        int i11;
        int i12;
        int i13;
        int i14;
        String formatString;
        org.telegram.ui.ActionBar.j5[] j5VarArr3;
        org.telegram.ui.Components.q61 q61Var;
        TLRPC.VideoSize videoSize;
        ImageLocation imageLocation2;
        TLRPC.User user;
        ImageLocation imageLocation3;
        TLRPC.User user2;
        boolean z18;
        TLRPC.UserStatus userStatus;
        int i15;
        int i16;
        char c10;
        org.telegram.ui.Components.ch chVar;
        TL_stars.Tl_starsRating tl_starsRating;
        String str5;
        String str6;
        boolean z19;
        boolean z20;
        org.telegram.ui.Components.o5 o5Var;
        TLRPC.FileLocation fileLocation;
        org.telegram.ui.Components.o5 o5Var2;
        TL_stars.Tl_starsRating tl_starsRating2;
        ImageLocation imageLocation4;
        ox oxVar;
        if (this.Y == null || (j5VarArr = this.f) == null || getParentActivity() == null) {
            return;
        }
        int connectionState = getConnectionsManager().getConnectionState();
        String string = connectionState == 2 ? LocaleController.getString(R.string.WaitingForNetwork) : connectionState == 1 ? LocaleController.getString(R.string.Connecting) : connectionState == 5 ? LocaleController.getString(R.string.Updating) : connectionState == 4 ? LocaleController.getString(R.string.ConnectingToProxy) : null;
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var == null || d5Var.getFragmentStack().size() < 2) {
            obj = null;
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            obj = n2Var instanceof org.telegram.ui.Components.ch ? n2Var : null;
            if ((n2Var instanceof uy) && (oxVar = ((uy) n2Var).F3) != null) {
                vx vxVar = oxVar.a;
                if (com.google.android.gms.internal.vision.e2.u(vxVar)) {
                    obj = vxVar;
                }
            }
        }
        if (obj instanceof co) {
            co coVar = (co) obj;
            if (coVar.a1 != null && coVar.u8() == 8) {
                z11 = true;
                this.p5 = false;
                this.q5 = false;
                j3 = this.e1;
                String str7 = "drawableMuteIcon";
                String str8 = "";
                org.telegram.ui.ActionBar.j5[] j5VarArr4 = this.r;
                if (j3 == 0) {
                    TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(this.e1));
                    if (user3 == null) {
                        return;
                    }
                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                    boolean z21 = userProfilePhoto != null && userProfilePhoto.personal;
                    TLRPC.FileLocation fileLocation2 = userProfilePhoto != null ? userProfilePhoto.photo_big : null;
                    this.p0.m(this.currentAccount, user3);
                    MessagesController.PeerColor peerColor = this.Q5;
                    MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(user3.emoji_status);
                    this.Q5 = fromCollectible;
                    if (fromCollectible == null) {
                        int profileColorId = UserObject.getProfileColorId(user3);
                        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).profilePeerColors;
                        this.Q5 = peerColors == null ? null : peerColors.getColor(profileColorId);
                    }
                    if (peerColor != this.Q5) {
                        o5();
                    }
                    o11 o11Var = this.d1;
                    boolean z22 = z21;
                    if (o11Var != null) {
                        o11Var.b(UserObject.getProfileEmojiId(user3), user3.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    org.telegram.ui.Components.hw0 hw0Var = this.T;
                    if (hw0Var != null) {
                        hw0Var.b(this.Q5);
                    }
                    TLRPC.EmojiStatus emojiStatus = user3.emoji_status;
                    L4(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null);
                    ImageLocation forUserOrChat3 = ImageLocation.getForUserOrChat(user3, 0);
                    ImageLocation forUserOrChat4 = ImageLocation.getForUserOrChat(user3, 1);
                    ImageLocation forUserOrChat5 = ImageLocation.getForUserOrChat(user3, 4);
                    TLRPC.UserFull userFull = this.v2;
                    if (userFull != null) {
                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                        videoSize = FileLoader.getVectorMarkupVideoSize((userProfilePhoto2 == null || !userProfilePhoto2.personal) ? userFull.profile_photo : userFull.personal_photo);
                        if (videoSize != null) {
                            j5VarArr3 = j5VarArr;
                            q61Var = new org.telegram.ui.Components.q61(videoSize, user3.premium, 2);
                        } else {
                            j5VarArr3 = j5VarArr;
                            q61Var = null;
                        }
                    } else {
                        j5VarArr3 = j5VarArr;
                        q61Var = null;
                        videoSize = null;
                    }
                    ImageLocation C2 = this.n0.C(forUserOrChat4, forUserOrChat3);
                    if (this.I2 == null) {
                        this.n0.H(q61Var, forUserOrChat3, forUserOrChat4, z10);
                    }
                    if (this.J2 == null) {
                        if (videoSize != null) {
                            this.e0.setImageDrawable(q61Var);
                        } else {
                            if (forUserOrChat5 == null || user3.photo.personal) {
                                user = user3;
                                imageLocation3 = forUserOrChat4;
                                pz0 pz0Var = this.e0;
                                pz0Var.a.setImage(C2, ImageLoader.AUTOPLAY_FILTER, forUserOrChat3, "100_100", imageLocation3, "50_50", this.p0, 0L, null, user, 1);
                                imageLocation2 = forUserOrChat3;
                                pz0Var.d();
                            } else {
                                this.e0.getImageReceiver().setVideoThumbIsSame(true);
                                pz0 pz0Var2 = this.e0;
                                user = user3;
                                imageLocation3 = forUserOrChat4;
                                pz0Var2.a.setImage(forUserOrChat5, "avatar", forUserOrChat3, "50_50", imageLocation3, "50_50", this.p0, 0L, null, user, 1);
                                pz0Var2.d();
                                imageLocation2 = forUserOrChat3;
                            }
                            if ((imageLocation3 != null && this.O2 != -1) || (imageLocation3 == null && this.O2 == -1)) {
                                d5();
                                k4(true);
                            }
                            if (imageLocation2 != null || ((imageLocation4 = this.B0) != null && imageLocation2.photoId == imageLocation4.photoId)) {
                                user2 = user;
                            } else {
                                this.B0 = imageLocation2;
                                TLRPC.User user4 = user;
                                getFileLoader().loadFile(imageLocation2, user4, null, 0, 1);
                                user2 = user4;
                            }
                            CharSequence userName = UserObject.getUserName(user2);
                            if (user2.id != getUserConfig().getClientUserId()) {
                                long j10 = user2.id;
                                if (j10 == UserObject.VERIFY) {
                                    str8 = LocaleController.getString(R.string.VerifyCodesNotifications);
                                } else if (j10 == 333000 || j10 == 777000 || j10 == 42777) {
                                    str8 = LocaleController.getString(R.string.ServiceNotifications);
                                } else if (MessagesController.isSupportUser(user2)) {
                                    str8 = LocaleController.getString(R.string.SupportStatus);
                                } else if (this.r2) {
                                    int i17 = user2.bot_active_users;
                                    str8 = i17 != 0 ? LocaleController.formatPluralStringComma("BotUsers", i17, ',') : LocaleController.getString(R.string.Bot);
                                } else {
                                    boolean[] zArr = this.J0;
                                    zArr[0] = false;
                                    str8 = LocaleController.formatUserStatus(this.currentAccount, user2, zArr, z22 ? new boolean[1] : null);
                                    boolean z23 = (zArr[0] || getUserConfig().isPremium() || (userStatus = user2.status) == null || (!(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) || !userStatus.by_me) ? false : true;
                                    org.telegram.ui.ActionBar.j5 j5Var = j5VarArr4[1];
                                    if (j5Var != null && !this.F5) {
                                        int i18 = (zArr[0] && this.Q5 == null) ? org.telegram.ui.ActionBar.j6.Bh : org.telegram.ui.ActionBar.j6.B8;
                                        j5Var.setTag(Integer.valueOf(i18));
                                        if (!this.p2) {
                                            j5VarArr4[1].setTextColor(w3(getThemedColor(i18), Boolean.valueOf(zArr[0])));
                                        }
                                    }
                                    z18 = z23;
                                    TLRPC.UserProfilePhoto userProfilePhoto3 = user2.photo;
                                    this.q5 = userProfilePhoto3 == null && userProfilePhoto3.personal;
                                    userName = Emoji.replaceEmoji(userName, j5VarArr3[1].getPaint().getFontMetricsInt(), false);
                                    if (z11) {
                                        this.e0.setAnimateFromImageReceiver(((co) obj).a1.getAvatarImageView().getImageReceiver());
                                    }
                                    i15 = 0;
                                    while (i15 < 2) {
                                        if (j5VarArr3[i15] == null) {
                                            fileLocation = fileLocation2;
                                            str6 = str7;
                                        } else {
                                            if (i15 == 0 && z11) {
                                                org.telegram.ui.ActionBar.j5 titleTextView = ((co) obj).a1.getTitleTextView();
                                                j5VarArr3[i15].k(titleTextView.getText());
                                                j5VarArr3[i15].i(titleTextView.getRightDrawable());
                                                j5VarArr3[i15].j(titleTextView.getRightDrawable2());
                                            } else if (i15 != 0 || user2.id == getUserConfig().getClientUserId() || MessagesController.isSupportUser(user2) || (str5 = user2.phone) == null || str5.length() == 0 || getContactsController().contactsDict.get(Long.valueOf(user2.id)) != null || (getContactsController().contactsDict.size() == 0 && getContactsController().isLoadingContacts())) {
                                                j5VarArr3[i15].k(userName);
                                            } else {
                                                j5VarArr3[i15].k(gf.b.c().b("+" + user2.phone));
                                            }
                                            if (i15 == 0 && string != null) {
                                                j5VarArr4[i15].k(string);
                                            } else if (i15 == 0 && z11) {
                                                co coVar2 = (co) obj;
                                                if (coVar2.a1.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.j5) {
                                                    j5VarArr4[i15].k(((org.telegram.ui.ActionBar.j5) coVar2.a1.getSubtitleTextView()).getText());
                                                } else if (coVar2.a1.getSubtitleTextView() instanceof org.telegram.ui.Components.q6) {
                                                    j5VarArr4[i15].k(((org.telegram.ui.Components.q6) coVar2.a1.getSubtitleTextView()).getText());
                                                }
                                            } else {
                                                j5VarArr4[i15].k(str8);
                                            }
                                            j5VarArr4[i15].setDrawablePadding(AndroidUtilities.dp(9.0f));
                                            j5VarArr4[i15].setRightDrawableInside(true);
                                            j5VarArr4[i15].i((i15 == 1 && z18) ? b4() : null);
                                            j5VarArr4[i15].setRightDrawableOnClick((i15 == 1 && z18) ? new jy0(this, 7) : null);
                                            Drawable V3 = this.D2 != null ? V3() : null;
                                            j5VarArr3[i15].setRightDrawableOutside(i15 == 0);
                                            if (i15 != 0 || z11) {
                                                str6 = str7;
                                                if (i15 == 1) {
                                                    boolean z24 = user2.scam;
                                                    if (z24 || user2.fake) {
                                                        j5VarArr3[i15].j(a4(!z24 ? 1 : 0));
                                                    } else if (user2.verified) {
                                                        j5VarArr3[i15].j(d4(i15));
                                                    } else {
                                                        j5VarArr3[i15].j(null);
                                                    }
                                                    if (!MessagesController.isSupportUser(user2) && DialogObject.getEmojiStatusDocumentId(user2.emoji_status) != 0) {
                                                        z19 = true;
                                                        j5VarArr3[i15].i(S3(user2.emoji_status, true, i15));
                                                        z20 = false;
                                                    } else if (getMessagesController().isPremiumUser(user2)) {
                                                        j5VarArr3[i15].i(S3(null, true, i15));
                                                        z20 = true;
                                                        z19 = false;
                                                    } else {
                                                        j5VarArr3[i15].i(null);
                                                    }
                                                }
                                                z20 = false;
                                                z19 = false;
                                            } else {
                                                boolean z25 = user2.scam;
                                                if (z25 || user2.fake) {
                                                    str6 = str7;
                                                    j5VarArr3[i15].j(a4(!z25 ? 1 : 0));
                                                    this.n = LocaleController.getString(R.string.ScamMessage);
                                                } else if (user2.verified) {
                                                    j5VarArr3[i15].j(d4(i15));
                                                    this.n = LocaleController.getString(R.string.AccDescrVerified);
                                                    str6 = str7;
                                                } else {
                                                    MessagesController messagesController = getMessagesController();
                                                    long j11 = this.i1;
                                                    if (j11 == 0) {
                                                        j11 = this.e1;
                                                    }
                                                    String str9 = str7;
                                                    if (messagesController.isDialogMuted(j11, this.g1)) {
                                                        str6 = str9;
                                                        j5VarArr3[i15].j(getThemedDrawable(str6));
                                                        this.n = LocaleController.getString(R.string.NotificationsMuted);
                                                    } else {
                                                        str6 = str9;
                                                        j5VarArr3[i15].j(null);
                                                        this.n = null;
                                                    }
                                                }
                                                if (!MessagesController.isSupportUser(user2) && DialogObject.getEmojiStatusDocumentId(user2.emoji_status) != 0) {
                                                    j5VarArr3[i15].i(S3(user2.emoji_status, false, i15));
                                                    this.h = LocaleController.getString(R.string.AccDescrPremium);
                                                    z20 = false;
                                                    z19 = true;
                                                } else if (getMessagesController().isPremiumUser(user2)) {
                                                    j5VarArr3[i15].i(S3(null, false, i15));
                                                    this.h = LocaleController.getString(R.string.AccDescrPremium);
                                                    z20 = true;
                                                    z19 = false;
                                                } else {
                                                    j5VarArr3[i15].i(null);
                                                    this.h = null;
                                                    z20 = false;
                                                    z19 = false;
                                                }
                                            }
                                            if (V3 == null && this.D2 == null) {
                                                o5Var = V3;
                                                fileLocation = fileLocation2;
                                                if (user2.bot_verification_icon != 0) {
                                                    j5VarArr3[i15].setLeftDrawableOutside(true);
                                                    o5Var2 = Q3(i15, user2.bot_verification_icon);
                                                    j5VarArr3[i15].setLeftDrawable(o5Var2);
                                                    if (i15 == 1 && (z19 || z20)) {
                                                        j5VarArr3[i15].setRightDrawableOutside(true);
                                                    }
                                                    if (!user2.self && getMessagesController().isPremiumUser(user2)) {
                                                        j5VarArr3[i15].setRightDrawableOnClick(new jy0(this, 8));
                                                    }
                                                    if (!user2.self && getMessagesController().isPremiumUser(user2)) {
                                                        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr3[i15];
                                                        j5Var2.setRightDrawableOnClick(new z(this, user2, j5Var2, 14));
                                                    }
                                                }
                                            } else {
                                                o5Var = V3;
                                                fileLocation = fileLocation2;
                                            }
                                            j5VarArr3[i15].setLeftDrawableOutside(false);
                                            o5Var2 = o5Var;
                                            j5VarArr3[i15].setLeftDrawable(o5Var2);
                                            if (i15 == 1) {
                                                j5VarArr3[i15].setRightDrawableOutside(true);
                                            }
                                            if (!user2.self) {
                                            }
                                            if (!user2.self) {
                                                org.telegram.ui.ActionBar.j5 j5Var22 = j5VarArr3[i15];
                                                j5Var22.setRightDrawableOnClick(new z(this, user2, j5Var22, 14));
                                            }
                                        }
                                        i15++;
                                        str7 = str6;
                                        fileLocation2 = fileLocation;
                                    }
                                    TLRPC.FileLocation fileLocation3 = fileLocation2;
                                    if (this.e1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                                        j5VarArr4[2].k(LocaleController.getString(R.string.FallbackTooltip));
                                        TLRPC.UserFull userFull2 = this.v2;
                                        if (userFull2 == null || (tl_starsRating = userFull2.stars_rating) == null || tl_starsRating.stars >= 0) {
                                            j5VarArr4[3].k(LocaleController.getString(R.string.Online));
                                        } else {
                                            j5VarArr4[3].k(LocaleController.getString(R.string.StarRatingLevelNegative).toLowerCase(Locale.ROOT));
                                        }
                                        i16 = 0;
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto4 = user2.photo;
                                        if (userProfilePhoto4 != null && userProfilePhoto4.personal && userProfilePhoto4.has_video) {
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str8);
                                            i16 = 0;
                                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lz(i16), 0, str8.length(), 0);
                                            spannableStringBuilder.append((CharSequence) " d ");
                                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CustomAvatarTooltipVideo));
                                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.at(), str8.length() + 1, str8.length() + 2, 0);
                                            j5VarArr4[2].k(spannableStringBuilder);
                                        } else {
                                            i16 = 0;
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str8);
                                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.lz(i16), 0, str8.length(), 0);
                                            spannableStringBuilder2.append((CharSequence) " d ");
                                            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.CustomAvatarTooltip));
                                            c10 = 2;
                                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.at(), str8.length() + 1, str8.length() + 2, 0);
                                            j5VarArr4[2].k(spannableStringBuilder2);
                                            j5VarArr4[c10].setVisibility(i16);
                                            if (!this.W1) {
                                                j5VarArr4[3].setVisibility(i16);
                                            }
                                            chVar = this.g5;
                                            if (chVar != null) {
                                                chVar.o();
                                            }
                                            this.e0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation3) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                                        }
                                    }
                                    c10 = 2;
                                    j5VarArr4[c10].setVisibility(i16);
                                    if (!this.W1) {
                                    }
                                    chVar = this.g5;
                                    if (chVar != null) {
                                    }
                                    this.e0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation3) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                                }
                            } else if (UserObject.hasFallbackPhoto(this.v2)) {
                                this.p5 = true;
                                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.v2.fallback_photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                if (closestPhotoSizeWithSize != null) {
                                    this.r5.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.v2.fallback_photo), "50_50", (Drawable) null, 0L, (String) null, UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0);
                                }
                            } else {
                                TLRPC.UserFull userFull3 = this.v2;
                                str8 = (userFull3 == null || (tl_starsRating2 = userFull3.stars_rating) == null || tl_starsRating2.stars >= 0) ? LocaleController.getString(R.string.Online) : LocaleController.getString(R.string.StarRatingLevelNegative).toLowerCase(Locale.ROOT);
                            }
                            z18 = false;
                            TLRPC.UserProfilePhoto userProfilePhoto32 = user2.photo;
                            this.q5 = userProfilePhoto32 == null && userProfilePhoto32.personal;
                            userName = Emoji.replaceEmoji(userName, j5VarArr3[1].getPaint().getFontMetricsInt(), false);
                            if (z11) {
                            }
                            i15 = 0;
                            while (i15 < 2) {
                            }
                            TLRPC.FileLocation fileLocation32 = fileLocation2;
                            if (this.e1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                            }
                            c10 = 2;
                            j5VarArr4[c10].setVisibility(i16);
                            if (!this.W1) {
                            }
                            chVar = this.g5;
                            if (chVar != null) {
                            }
                            this.e0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation32) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                        }
                    }
                    imageLocation2 = forUserOrChat3;
                    user = user3;
                    imageLocation3 = forUserOrChat4;
                    if (imageLocation3 != null) {
                        d5();
                        k4(true);
                        if (imageLocation2 != null) {
                        }
                        user2 = user;
                        CharSequence userName2 = UserObject.getUserName(user2);
                        if (user2.id != getUserConfig().getClientUserId()) {
                        }
                        z18 = false;
                        TLRPC.UserProfilePhoto userProfilePhoto322 = user2.photo;
                        this.q5 = userProfilePhoto322 == null && userProfilePhoto322.personal;
                        userName2 = Emoji.replaceEmoji(userName2, j5VarArr3[1].getPaint().getFontMetricsInt(), false);
                        if (z11) {
                        }
                        i15 = 0;
                        while (i15 < 2) {
                        }
                        TLRPC.FileLocation fileLocation322 = fileLocation2;
                        if (this.e1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                        }
                        c10 = 2;
                        j5VarArr4[c10].setVisibility(i16);
                        if (!this.W1) {
                        }
                        chVar = this.g5;
                        if (chVar != null) {
                        }
                        this.e0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation322) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                    }
                    d5();
                    k4(true);
                    if (imageLocation2 != null) {
                    }
                    user2 = user;
                    CharSequence userName22 = UserObject.getUserName(user2);
                    if (user2.id != getUserConfig().getClientUserId()) {
                    }
                    z18 = false;
                    TLRPC.UserProfilePhoto userProfilePhoto3222 = user2.photo;
                    this.q5 = userProfilePhoto3222 == null && userProfilePhoto3222.personal;
                    userName22 = Emoji.replaceEmoji(userName22, j5VarArr3[1].getPaint().getFontMetricsInt(), false);
                    if (z11) {
                    }
                    i15 = 0;
                    while (i15 < 2) {
                    }
                    TLRPC.FileLocation fileLocation3222 = fileLocation2;
                    if (this.e1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                    }
                    c10 = 2;
                    j5VarArr4[c10].setVisibility(i16);
                    if (!this.W1) {
                    }
                    chVar = this.g5;
                    if (chVar != null) {
                    }
                    this.e0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation3222) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 != null);
                } else if (this.f1 != 0) {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.f1));
                    if (chat2 != null) {
                        this.E2 = chat2;
                    } else {
                        chat2 = this.E2;
                    }
                    FlagSecureReason flagSecureReason = this.X1;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                    }
                    MessagesController.PeerColor peerColor2 = this.Q5;
                    MessagesController.PeerColor fromCollectible2 = MessagesController.PeerColor.fromCollectible(chat2.emoji_status);
                    this.Q5 = fromCollectible2;
                    if (fromCollectible2 == null) {
                        int profileColorId2 = ChatObject.getProfileColorId(chat2);
                        MessagesController.PeerColors peerColors2 = MessagesController.getInstance(this.currentAccount).profilePeerColors;
                        this.Q5 = peerColors2 == null ? null : peerColors2.getColor(profileColorId2);
                    }
                    if (peerColor2 != this.Q5) {
                        o5();
                    }
                    o11 o11Var2 = this.d1;
                    if (o11Var2 != null) {
                        o11Var2.b(ChatObject.getProfileEmojiId(chat2), chat2.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    TLRPC.EmojiStatus emojiStatus2 = chat2.emoji_status;
                    L4(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null);
                    if (this.q1) {
                        z12 = z11;
                        tL_forumTopic = getMessagesController().getTopicsController().findTopic(this.f1, this.g1);
                    } else {
                        z12 = z11;
                        tL_forumTopic = null;
                    }
                    if (ChatObject.isChannel(chat2)) {
                        if (this.q1) {
                            str4 = "Members";
                        } else {
                            TLRPC.ChatFull chatFull2 = this.u2;
                            if (chatFull2 != null) {
                                TLRPC.Chat chat3 = this.E2;
                                str4 = "Members";
                                if (!chat3.megagroup) {
                                    if (chatFull2.participants_count != 0) {
                                        if (!ChatObject.hasAdminRights(chat3)) {
                                        }
                                    }
                                }
                            } else {
                                str4 = "Members";
                            }
                            formatPluralString = this.E2.megagroup ? LocaleController.getString(R.string.Loading).toLowerCase() : ChatObject.isPublic(chat2) ? LocaleController.getString(R.string.ChannelPublic).toLowerCase() : LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                            j5VarArr2 = j5VarArr4;
                            z13 = false;
                            str = str4;
                            obj2 = obj;
                            charSequence = formatPluralString;
                            if (z12) {
                                co coVar3 = (co) obj2;
                                if (coVar3.a1.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.j5) {
                                    formatPluralString = ((org.telegram.ui.ActionBar.j5) coVar3.a1.getSubtitleTextView()).getText();
                                } else if (coVar3.a1.getSubtitleTextView() instanceof org.telegram.ui.Components.q6) {
                                    formatPluralString = ((org.telegram.ui.Components.q6) coVar3.a1.getSubtitleTextView()).getText();
                                }
                                this.e0.setAnimateFromImageReceiver(coVar3.a1.getAvatarImageView().getImageReceiver());
                            }
                            i10 = 0;
                            z14 = false;
                            while (i10 < 2) {
                                org.telegram.ui.ActionBar.j5 j5Var3 = j5VarArr[i10];
                                if (j5Var3 == null) {
                                    str3 = string;
                                    charSequence2 = formatPluralString;
                                    z15 = z12;
                                    str2 = str8;
                                } else if (i10 == 0 && z12) {
                                    org.telegram.ui.ActionBar.j5 titleTextView2 = ((co) obj2).a1.getTitleTextView();
                                    if (j5VarArr[i10].k(titleTextView2.getText())) {
                                        z14 = true;
                                    }
                                    if (j5VarArr[i10].i(titleTextView2.getRightDrawable())) {
                                        z14 = true;
                                    }
                                    charSequence2 = formatPluralString;
                                } else if (this.q1) {
                                    CharSequence charSequence3 = tL_forumTopic == null ? str8 : tL_forumTopic.title;
                                    try {
                                        fontMetricsInt = j5Var3.getPaint().getFontMetricsInt();
                                        charSequence2 = formatPluralString;
                                    } catch (Exception unused) {
                                        charSequence2 = formatPluralString;
                                    }
                                    try {
                                        charSequence3 = Emoji.replaceEmoji(charSequence3, fontMetricsInt, false);
                                    } catch (Exception unused2) {
                                    }
                                } else {
                                    charSequence2 = formatPluralString;
                                    if (!ChatObject.isMonoForum(chat2)) {
                                        CharSequence charSequence4 = chat2.title;
                                        if (charSequence4 != null) {
                                            try {
                                                charSequence4 = Emoji.replaceEmoji(charSequence4, j5VarArr[i10].getPaint().getFontMetricsInt(), false);
                                            } catch (Exception unused3) {
                                            }
                                        }
                                        j5VarArr[i10].setLeftDrawableOutside(false);
                                        j5VarArr[i10].setLeftDrawable((Drawable) null);
                                        j5VarArr[i10].setRightDrawableOutside(i10 == 0);
                                        j5VarArr[i10].setRightDrawableOnClick(null);
                                        if (i10 != 0) {
                                            boolean z26 = chat2.scam;
                                            if (z26 || chat2.fake) {
                                                j5VarArr[i10].j(a4(!z26 ? 1 : 0));
                                                this.h = LocaleController.getString(R.string.ScamMessage);
                                            } else if (chat2.verified) {
                                                j5VarArr[i10].j(d4(i10));
                                                this.h = LocaleController.getString(R.string.AccDescrVerified);
                                            } else {
                                                j5VarArr[i10].j(null);
                                                this.h = null;
                                            }
                                            if (DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) != 0) {
                                                j5VarArr[i10].i(S3(chat2.emoji_status, false, i10));
                                                j5VarArr[i10].setRightDrawableOutside(true);
                                                this.h = null;
                                                if (ChatObject.canChangeChatInfo(chat2)) {
                                                    j5VarArr[i10].setRightDrawableOnClick(new jy0(this, 9));
                                                    if (this.S) {
                                                        this.S = true;
                                                        getMediaDataController().loadRestrictedStatusEmojis();
                                                    }
                                                } else {
                                                    TLRPC.EmojiStatus emojiStatus3 = chat2.emoji_status;
                                                    if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                                                        z15 = z12;
                                                        j5VarArr[i10].setRightDrawableOnClick(new yy0(this, ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug, 0));
                                                    }
                                                }
                                            }
                                            z15 = z12;
                                        } else {
                                            z15 = z12;
                                            if (!z15) {
                                                boolean z27 = chat2.scam;
                                                if (z27 || chat2.fake) {
                                                    z16 = z14;
                                                    str2 = str8;
                                                    j5VarArr[i10].j(a4(!z27 ? 1 : 0));
                                                } else if (chat2.verified) {
                                                    j5VarArr[i10].j(d4(i10));
                                                    z16 = z14;
                                                    str2 = str8;
                                                } else {
                                                    z16 = z14;
                                                    str2 = str8;
                                                    if (getMessagesController().isDialogMuted(-this.f1, this.g1)) {
                                                        j5VarArr[i10].j(getThemedDrawable("drawableMuteIcon"));
                                                    } else {
                                                        j5VarArr[i10].j(null);
                                                    }
                                                }
                                                if (DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) != 0) {
                                                    j5VarArr[i10].i(S3(chat2.emoji_status, false, i10));
                                                    z17 = true;
                                                    j5VarArr[i10].setRightDrawableOutside(true);
                                                } else {
                                                    z17 = true;
                                                    j5VarArr[i10].i(null);
                                                }
                                                if (chat2.bot_verification_icon == 0) {
                                                    j5VarArr[i10].setLeftDrawableOutside(z17);
                                                    j5VarArr[i10].setLeftDrawable(Q3(i10, chat2.bot_verification_icon));
                                                } else {
                                                    j5VarArr[i10].setLeftDrawable((Drawable) null);
                                                }
                                                if (i10 == 0 || string == null) {
                                                    if (!z15) {
                                                        TLRPC.Chat chat4 = this.E2;
                                                        if ((!chat4.megagroup || this.u2 == null || this.B2 <= 0) && !this.q1) {
                                                            if (i10 == 0 && ChatObject.isChannel(chat4) && (chatFull = this.u2) != null && chatFull.participants_count != 0) {
                                                                TLRPC.Chat chat5 = this.E2;
                                                                if (chat5.megagroup || chat5.broadcast) {
                                                                    int[] iArr = new int[1];
                                                                    if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                                                        int i19 = this.u2.participants_count;
                                                                        iArr[0] = i19;
                                                                        formatShortNumber = String.valueOf(i19);
                                                                    } else {
                                                                        formatShortNumber = LocaleController.formatShortNumber(this.u2.participants_count, iArr);
                                                                    }
                                                                    if (!this.E2.megagroup) {
                                                                        str3 = string;
                                                                        j5VarArr2[i10].k(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber));
                                                                        if (i10 == 1 && this.q1) {
                                                                            if (z13) {
                                                                                j5VarArr2[i10].setOnClickListener(null);
                                                                                j5VarArr2[i10].setClickable(false);
                                                                            } else {
                                                                                j5VarArr2[i10].setOnClickListener(new jy0(this, 10));
                                                                            }
                                                                        }
                                                                        z14 = z16;
                                                                    } else if (this.u2.participants_count != 0) {
                                                                        CharSequence replace = LocaleController.formatPluralString(str, iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber);
                                                                        org.telegram.ui.ActionBar.j5 j5Var4 = j5VarArr2[i10];
                                                                        if (i10 != 0) {
                                                                            replace = v3(replace);
                                                                        }
                                                                        j5Var4.k(replace);
                                                                    } else if (chat2.has_geo) {
                                                                        j5VarArr2[i10].k(LocaleController.getString(R.string.MegaLocation).toLowerCase());
                                                                    } else if (ChatObject.isPublic(chat2)) {
                                                                        j5VarArr2[i10].k(LocaleController.getString(R.string.MegaPublic).toLowerCase());
                                                                    } else {
                                                                        j5VarArr2[i10].k(LocaleController.getString(R.string.MegaPrivate).toLowerCase());
                                                                    }
                                                                }
                                                            }
                                                            str3 = string;
                                                            j5VarArr2[i10].k(i10 == 0 ? charSequence2 : v3(charSequence));
                                                            if (i10 == 1) {
                                                                if (z13) {
                                                                }
                                                            }
                                                            z14 = z16;
                                                        }
                                                    }
                                                    str3 = string;
                                                    j5VarArr2[i10].k(i10 != 0 ? charSequence2 : v3(charSequence));
                                                    if (i10 == 1) {
                                                    }
                                                    z14 = z16;
                                                } else {
                                                    j5VarArr2[i10].k(string);
                                                }
                                                str3 = string;
                                                if (i10 == 1) {
                                                }
                                                z14 = z16;
                                            }
                                        }
                                        z16 = z14;
                                        str2 = str8;
                                        z17 = true;
                                        if (chat2.bot_verification_icon == 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if (!z15) {
                                        }
                                        str3 = string;
                                        j5VarArr2[i10].k(i10 != 0 ? charSequence2 : v3(charSequence));
                                        if (i10 == 1) {
                                        }
                                        z14 = z16;
                                    }
                                }
                                i10++;
                                formatPluralString = charSequence2;
                                str8 = str2;
                                z12 = z15;
                                string = str3;
                            }
                            if (z14) {
                                k4(true);
                            }
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            TLRPC.FileLocation fileLocation4 = (chatPhoto != null || this.q1) ? null : chatPhoto.photo_big;
                            if (this.q1) {
                                og.d.p(this.e0, tL_forumTopic, true, true, this.z0);
                                forUserOrChat = null;
                                forUserOrChat2 = null;
                            } else {
                                if (ChatObject.isMonoForum(this.E2)) {
                                    TLRPC.Chat monoForumLinkedChat = getMessagesController().getMonoForumLinkedChat(this.E2.id);
                                    this.p0.k(this.currentAccount, monoForumLinkedChat);
                                    ImageLocation forUserOrChat6 = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat, 0);
                                    ImageLocation forUserOrChat7 = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat, 1);
                                    C = this.n0.C(forUserOrChat7, forUserOrChat6);
                                    forUserOrChat2 = forUserOrChat7;
                                    forUserOrChat = forUserOrChat6;
                                } else {
                                    this.p0.k(this.currentAccount, chat2);
                                    forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 0);
                                    forUserOrChat2 = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 1);
                                    qz0 qz0Var = this.n0;
                                    if (qz0Var != null) {
                                        C = qz0Var.C(forUserOrChat2, forUserOrChat);
                                    }
                                }
                                boolean H = this.n0.H(null, forUserOrChat, forUserOrChat2, z10);
                                if ((forUserOrChat != null || H) && this.p2) {
                                    m10 = this.c.m(0);
                                    if (m10 != null) {
                                        this.a.v0(0, m10.getTop() - T3(), org.telegram.ui.Components.pr.h);
                                    }
                                }
                                String str10 = (C == null && C.imageType == 2) ? ImageLoader.AUTOPLAY_FILTER : null;
                                if (this.J2 == null || this.q1) {
                                    chat = chat2;
                                } else {
                                    TLRPC.Chat chat6 = chat2;
                                    this.e0.l(C, str10, forUserOrChat2, "50_50", this.p0, chat6);
                                    chat = chat6;
                                }
                                if (forUserOrChat != null && ((imageLocation = this.B0) == null || forUserOrChat.photoId != imageLocation.photoId)) {
                                    this.B0 = forUserOrChat;
                                    getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
                                }
                                this.e0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation4) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 == null);
                            }
                            C = null;
                            boolean H2 = this.n0.H(null, forUserOrChat, forUserOrChat2, z10);
                            if (forUserOrChat != null) {
                            }
                            m10 = this.c.m(0);
                            if (m10 != null) {
                            }
                            if (C == null) {
                            }
                            if (this.J2 == null) {
                            }
                            chat = chat2;
                            if (forUserOrChat != null) {
                                this.B0 = forUserOrChat;
                                getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
                            }
                            this.e0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation4) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 == null);
                        }
                        if (this.q1) {
                            if (tL_forumTopic != null) {
                                i12 = 1;
                                i13 = tL_forumTopic.totalMessagesCount - 1;
                            } else {
                                i12 = 1;
                                i13 = 0;
                            }
                            if (i13 > 0) {
                                Object[] objArr = new Object[i12];
                                i14 = 0;
                                objArr[0] = Integer.valueOf(i13);
                                formatString = LocaleController.formatPluralString("messages", i13, objArr);
                            } else {
                                i14 = 0;
                                int i20 = R.string.TopicProfileStatus;
                                Object[] objArr2 = new Object[i12];
                                objArr2[0] = chat2.title;
                                formatString = LocaleController.formatString("TopicProfileStatus", i20, objArr2);
                            }
                            SpannableString spannableString = new SpannableString(">");
                            String str11 = formatString;
                            spannableString.setSpan(new org.telegram.ui.Components.nq(R.drawable.arrow_newchat), i14, 1, 33);
                            str = str4;
                            obj2 = obj;
                            z13 = true;
                            charSequence = new SpannableStringBuilder(chat2.title).append(' ').append((CharSequence) spannableString);
                            formatPluralString = str11;
                            j5VarArr2 = j5VarArr4;
                        } else {
                            str = str4;
                            if (!this.E2.megagroup) {
                                obj2 = obj;
                                j5VarArr2 = j5VarArr4;
                                LocaleController.formatShortNumber(this.u2.participants_count, new int[1]);
                                if (this.E2.megagroup) {
                                    formatPluralString = LocaleController.formatPluralString(str, this.u2.participants_count, new Object[0]);
                                    charSequence = LocaleController.formatPluralStringComma(str, this.u2.participants_count);
                                } else {
                                    formatPluralString = LocaleController.formatPluralString("Subscribers", this.u2.participants_count, new Object[0]);
                                    charSequence = LocaleController.formatPluralStringComma("Subscribers", this.u2.participants_count);
                                }
                            } else if (this.B2 <= 1 || (i11 = this.u2.participants_count) == 0) {
                                obj2 = obj;
                                j5VarArr2 = j5VarArr4;
                                int i21 = this.u2.participants_count;
                                if (i21 == 0) {
                                    formatPluralString = chat2.has_geo ? LocaleController.getString(R.string.MegaLocation).toLowerCase() : ChatObject.isPublic(chat2) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                                } else {
                                    formatPluralString = LocaleController.formatPluralString(str, i21, new Object[0]);
                                    charSequence = LocaleController.formatPluralStringComma(str, this.u2.participants_count);
                                }
                            } else {
                                obj2 = obj;
                                j5VarArr2 = j5VarArr4;
                                formatPluralString = a4.a.C(LocaleController.formatPluralString(str, i11, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(this.B2, this.u2.participants_count), new Object[0]));
                                z13 = false;
                                charSequence = a4.a.C(LocaleController.formatPluralStringComma(str, this.u2.participants_count), ", ", LocaleController.formatPluralStringComma("OnlineCount", Math.min(this.B2, this.u2.participants_count)));
                            }
                            z13 = false;
                        }
                        if (z12) {
                        }
                        i10 = 0;
                        z14 = false;
                        while (i10 < 2) {
                        }
                        if (z14) {
                        }
                        TLRPC.ChatPhoto chatPhoto2 = chat2.photo;
                        if (chatPhoto2 != null) {
                        }
                        if (this.q1) {
                        }
                        C = null;
                        boolean H22 = this.n0.H(null, forUserOrChat, forUserOrChat2, z10);
                        if (forUserOrChat != null) {
                        }
                        m10 = this.c.m(0);
                        if (m10 != null) {
                        }
                        if (C == null) {
                        }
                        if (this.J2 == null) {
                        }
                        chat = chat2;
                        if (forUserOrChat != null) {
                        }
                        this.e0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation4) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 == null);
                    } else {
                        str = "Members";
                        obj2 = obj;
                        j5VarArr2 = j5VarArr4;
                        if (ChatObject.isKickedFromChat(chat2)) {
                            formatPluralString = LocaleController.getString(R.string.YouWereKicked);
                        } else if (ChatObject.isLeftFromChat(chat2)) {
                            formatPluralString = LocaleController.getString(R.string.YouLeft);
                        } else {
                            int i22 = chat2.participants_count;
                            TLRPC.ChatFull chatFull3 = this.u2;
                            if (chatFull3 != null && (chatParticipants = chatFull3.participants) != null) {
                                i22 = chatParticipants.participants.size();
                            }
                            formatPluralString = (i22 == 0 || this.B2 <= 1) ? LocaleController.formatPluralString(str, i22, new Object[0]) : a4.a.C(LocaleController.formatPluralString(str, i22, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", this.B2, new Object[0]));
                        }
                    }
                    charSequence = formatPluralString;
                    z13 = false;
                    if (z12) {
                    }
                    i10 = 0;
                    z14 = false;
                    while (i10 < 2) {
                    }
                    if (z14) {
                    }
                    TLRPC.ChatPhoto chatPhoto22 = chat2.photo;
                    if (chatPhoto22 != null) {
                    }
                    if (this.q1) {
                    }
                    C = null;
                    boolean H222 = this.n0.H(null, forUserOrChat, forUserOrChat2, z10);
                    if (forUserOrChat != null) {
                    }
                    m10 = this.c.m(0);
                    if (m10 != null) {
                    }
                    if (C == null) {
                    }
                    if (this.J2 == null) {
                    }
                    chat = chat2;
                    if (forUserOrChat != null) {
                    }
                    this.e0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation4) && (getLastStoryViewer() == null || getLastStoryViewer().s0.a != this.e0), this.u0 == null);
                }
                k4(true);
            }
        }
        z11 = false;
        this.p5 = false;
        this.q5 = false;
        j3 = this.e1;
        String str72 = "drawableMuteIcon";
        String str82 = "";
        org.telegram.ui.ActionBar.j5[] j5VarArr42 = this.r;
        if (j3 == 0) {
        }
        k4(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.p2;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        int bgColor2;
        if (this.p2) {
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.s()) {
            bgColor2 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.w8, this.z0);
        } else if (this.F5) {
            bgColor2 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.z0);
        } else {
            MessagesController.PeerColor peerColor = this.Q5;
            bgColor2 = peerColor != null ? peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q()) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, this.z0);
        }
        return i0.a.f(bgColor2) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r3.contains((int) r7.getX(), ((int) r7.getY()) - r6.actionBar.getMeasuredHeight()) != false) goto L20;
     */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        m01 m01Var;
        qz0 qz0Var = this.n0;
        Rect rect = this.L2;
        if (qz0Var != null && qz0Var.getVisibility() == 0 && this.n0.getRealCount() > 1) {
            this.n0.getHitRect(rect);
            if (motionEvent != null) {
            }
        }
        if (this.J4 != -1 && (m01Var = this.O) != null) {
            if (m01Var.x0()) {
                this.O.getHitRect(rect);
                if (motionEvent == null || rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
                    m01 m01Var2 = this.O;
                    return m01Var2.getSelectedTab() == m01Var2.I0.getFirstTabId();
                }
            }
            return false;
        }
        return true;
    }

    public final boolean j4() {
        return getMessagesController().getStoriesController().I(a()) && !this.q1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0b34, code lost:
    
        if ((T3() + (r1 + r2)) < r15.a.getMeasuredHeight()) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015b, code lost:
    
        if (org.telegram.messenger.MessagesController.ChannelRecommendations.hasRecommendations(r15.currentAccount, r9) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c6, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationToBeDeprecated) == false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0afd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0b28  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0b45  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0b1b  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0aef  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0a30  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j5() {
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
        gz0 gz0Var;
        org.telegram.ui.Components.dh0 dh0Var;
        org.telegram.ui.Components.vh0 vh0Var;
        int i11;
        boolean z11;
        TLRPC.UserFull userFull;
        boolean z12;
        TLRPC.UserFull userFull2;
        TL_payments.starRefProgram starrefprogram;
        org.telegram.ui.Cells.f6 f6Var;
        TLRPC.Chat chat;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull5;
        TLRPC.UserFull userFull4;
        TLRPC.ChatFull chatFull6;
        TLRPC.UserFull userFull5;
        TL_bots.BotInfo botInfo;
        TLRPC.UserFull userFull6;
        g5(false);
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
        this.J4 = -1;
        this.Q3 = -1;
        this.A4 = -1;
        this.B4 = -1;
        this.C4 = -1;
        this.D4 = -1;
        this.F4 = -1;
        this.I4 = false;
        this.K4 = -1;
        this.L4 = -1;
        this.M4 = -1;
        ArrayList arrayList2 = this.Q4;
        arrayList2.clear();
        ArrayList arrayList3 = this.R4;
        arrayList3.clear();
        org.telegram.ui.Components.pu0 pu0Var = this.R;
        boolean z13 = true;
        if (pu0Var != null) {
            int[] iArr = pu0Var.c;
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
                long j3 = this.f1;
                if (j3 == 0 || !MessagesController.ChannelRecommendations.hasRecommendations(this.currentAccount, -j3)) {
                    if (this.r2) {
                        long j10 = this.e1;
                        if (j10 != 0) {
                        }
                    }
                }
                z10 = true;
            }
            if (this.e1 == 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e1));
                TLRPC.UserFull userFull7 = this.v2;
                if (userFull7 != null && userFull7.saved_music != null && (this.q0 == null || this.s1)) {
                    this.I4 = true;
                }
                if (this.A3 < 0 && this.B3 < 0) {
                    if (this.I4 || this.Q5 != null || this.a0 == null) {
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
                    TLRPC.UserFull userFull8 = this.v2;
                    boolean z14 = ((userFull8 == null || TextUtils.isEmpty(userFull8.about)) && (user == null || TextUtils.isEmpty(publicUsername))) ? false : true;
                    boolean z15 = (user == null || (TextUtils.isEmpty(user.phone) && TextUtils.isEmpty(this.d5))) ? false : true;
                    if (!this.r2 && (userFull3 = this.v2) != null && userFull3.unofficial_security_risk) {
                        int i16 = this.N2;
                        this.j4 = i16;
                        this.N2 = i16 + 2;
                        this.k4 = i16 + 1;
                    }
                    TLRPC.UserFull userFull9 = this.v2;
                    if (userFull9 != null && (userFull9.flags2 & 64) != 0 && (((f6Var = this.w2) == null || !f6Var.c || !f6Var.d.isEmpty()) && (chat = getMessagesController().getChat(Long.valueOf(this.v2.personal_channel_id))) != null && (ChatObject.isPublic(chat) || !ChatObject.isNotInChat(chat)))) {
                        int i17 = this.N2;
                        this.Q2 = i17;
                        this.N2 = i17 + 2;
                        this.R2 = i17 + 1;
                    }
                    if (!this.r2 && (z15 || !z14)) {
                        int i18 = this.N2;
                        this.N2 = i18 + 1;
                        this.G3 = i18;
                    }
                    TLRPC.UserFull userFull10 = this.v2;
                    if (userFull10 != null && !TextUtils.isEmpty(userFull10.about)) {
                        int i19 = this.N2;
                        this.N2 = i19 + 1;
                        this.J3 = i19;
                    }
                    if (user != null && publicUsername != null) {
                        int i20 = this.N2;
                        this.N2 = i20 + 1;
                        this.L3 = i20;
                    }
                    TLRPC.UserFull userFull11 = this.v2;
                    if (userFull11 != null) {
                        if (userFull11.birthday != null) {
                            int i21 = this.N2;
                            this.N2 = i21 + 1;
                            this.U2 = i21;
                        }
                        if (userFull11.business_work_hours != null) {
                            int i22 = this.N2;
                            this.N2 = i22 + 1;
                            this.O3 = i22;
                        }
                        if (userFull11.business_location != null) {
                            int i23 = this.N2;
                            this.N2 = i23 + 1;
                            this.P3 = i23;
                        }
                        if (userFull11.note != null) {
                            int i24 = this.N2;
                            this.N2 = i24 + 1;
                            this.H3 = i24;
                        }
                    }
                    if (this.a0 == null && this.e1 != getUserConfig().getClientUserId()) {
                        int i25 = this.N2;
                        this.N2 = i25 + 1;
                        this.N3 = i25;
                    }
                    boolean z16 = this.r2;
                    if (z16 && user != null && user.bot_has_main_app) {
                        int i26 = this.N2;
                        this.N2 = i26 + 1;
                        this.i4 = i26;
                    }
                    int i27 = this.N2;
                    int i28 = i27 + 1;
                    this.N2 = i28;
                    this.R3 = i27;
                    if (user != null && user.linked_community_id != 0) {
                        this.l4 = i28;
                        this.N2 = i27 + 3;
                        this.m4 = i27 + 2;
                    }
                    if (z16 && (userFull2 = this.v2) != null && (starrefprogram = userFull2.starref_program) != null && (starrefprogram.flags & 2) == 0 && getMessagesController().starrefConnectAllowed) {
                        int i29 = this.N2;
                        this.S3 = i29;
                        this.N2 = i29 + 2;
                        this.T3 = i29 + 1;
                    }
                    if (this.r2) {
                        if (this.s2 == null && getContext() != null) {
                            this.s2 = fi.w0.e(getContext(), this.currentAccount, this.e1);
                        }
                        if (this.t2 == null && getContext() != null) {
                            this.t2 = fi.s.c(getContext(), this.currentAccount, this.e1);
                        }
                        fi.w0 w0Var = this.s2;
                        boolean z17 = w0Var != null && w0Var.b();
                        fi.s sVar = this.t2;
                        boolean z18 = sVar != null && sVar.a();
                        TLRPC.UserFull userFull12 = this.v2;
                        if (userFull12 == null || !userFull12.bot_can_manage_emoji_status) {
                            if (!fi.d5.d((Activity) getContext(), this.currentAccount, this.e1)) {
                                z12 = false;
                                if (!z12 || z17 || z18) {
                                    int i30 = this.N2;
                                    int i31 = i30 + 1;
                                    this.N2 = i31;
                                    this.n4 = i30;
                                    if (z12) {
                                        this.N2 = i30 + 2;
                                        this.botPermissionEmojiStatus = i31;
                                    }
                                    if (z17) {
                                        int i32 = this.N2;
                                        this.N2 = i32 + 1;
                                        this.botPermissionLocation = i32;
                                    }
                                    if (z18) {
                                        int i33 = this.N2;
                                        this.N2 = i33 + 1;
                                        this.botPermissionBiometry = i33;
                                    }
                                    int i34 = this.N2;
                                    this.N2 = i34 + 1;
                                    this.p4 = i34;
                                }
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        int i302 = this.N2;
                        int i312 = i302 + 1;
                        this.N2 = i312;
                        this.n4 = i302;
                        if (z12) {
                        }
                        if (z17) {
                        }
                        if (z18) {
                        }
                        int i342 = this.N2;
                        this.N2 = i342 + 1;
                        this.p4 = i342;
                    }
                    TLRPC.EncryptedChat encryptedChat = this.D2;
                    if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                        int i35 = this.N2;
                        this.q4 = i35;
                        this.r4 = i35 + 1;
                        this.N2 = i35 + 3;
                        this.s4 = i35 + 2;
                    }
                    if (user != null && !this.r2 && encryptedChat == null && user.id != getUserConfig().getClientUserId() && this.k1) {
                        int i36 = this.N2;
                        this.K4 = i36;
                        this.N2 = i36 + 2;
                        this.M4 = i36 + 1;
                    }
                    if (user != null && user.bot) {
                        TLRPC.UserFull userFull13 = this.v2;
                        if (userFull13 != null && userFull13.can_view_revenue && zh.o.g(this.currentAccount).i(this.e1) > 0) {
                            int i37 = this.N2;
                            this.N2 = i37 + 1;
                            this.C4 = i37;
                        }
                        if (zh.o.g(this.currentAccount).c(this.e1).amount > 0 || !zh.o.g(this.currentAccount).k(this.e1).a[0].isEmpty()) {
                            int i38 = this.N2;
                            this.N2 = i38 + 1;
                            this.B4 = i38;
                        }
                    }
                    if (user != null && this.r2 && !user.bot_nochats) {
                        int i39 = this.N2;
                        this.a4 = i39;
                        this.N2 = i39 + 2;
                        this.b4 = i39 + 1;
                    } else if (this.B4 >= 0) {
                        z11 = true;
                        if (!this.s1 && this.c5 && user != null && !user.contact && !user.bot && !UserObject.isService(user.id)) {
                            int i40 = this.N2;
                            this.N2 = i40 + 1;
                            this.Z3 = i40;
                            z11 = true;
                        }
                        if (!this.s1 && this.Z4 != 0 && this.a5 < 0 && ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(-this.a5)), 13)) {
                            int i41 = this.N2;
                            this.N2 = i41 + 1;
                            this.W3 = i41;
                            z11 = true;
                        }
                        if (!this.s1 || this.Z4 == 0 || ContactsController.getInstance(this.currentAccount).isContact(this.e1)) {
                            z13 = z11;
                        } else {
                            int i42 = this.N2;
                            this.N2 = i42 + 1;
                            this.X3 = i42;
                        }
                        if (z13) {
                            int i43 = this.N2;
                            this.N2 = i43 + 1;
                            this.Y3 = i43;
                        }
                        if (!z10 || ((user != null && user.bot && user.bot_can_edit && user.bot_has_main_app) || (!((userFull = this.v2) == null || userFull.common_chats_count == 0) || this.s1))) {
                            int i44 = this.N2;
                            this.N2 = i44 + 1;
                            this.J4 = i44;
                        } else if (this.M4 == -1 && this.o1) {
                            int i45 = this.N2;
                            this.U3 = i45;
                            this.N2 = i45 + 2;
                            this.M4 = i45 + 1;
                        }
                    }
                    z11 = false;
                    if (!this.s1) {
                        int i402 = this.N2;
                        this.N2 = i402 + 1;
                        this.Z3 = i402;
                        z11 = true;
                    }
                    if (!this.s1) {
                        int i412 = this.N2;
                        this.N2 = i412 + 1;
                        this.W3 = i412;
                        z11 = true;
                    }
                    if (this.s1) {
                    }
                    z13 = z11;
                    if (z13) {
                    }
                    if (z10) {
                    }
                    int i442 = this.N2;
                    this.N2 = i442 + 1;
                    this.J4 = i442;
                } else {
                    if (this.J2 == null) {
                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                        if (userProfilePhoto != null) {
                            TLRPC.FileLocation fileLocation = userProfilePhoto.photo_big;
                            if (!(fileLocation instanceof TLRPC.TL_fileLocation_layer97)) {
                            }
                        }
                        qz0 qz0Var = this.n0;
                        if (qz0Var == null || qz0Var.getRealCount() == 0) {
                            int i46 = this.N2;
                            this.O2 = i46;
                            this.N2 = i46 + 2;
                            this.P2 = i46 + 1;
                        }
                    }
                    int i47 = this.N2;
                    this.S2 = i47;
                    this.T2 = i47 + 1;
                    this.V2 = i47 + 2;
                    this.W2 = i47 + 3;
                    this.N2 = i47 + 5;
                    this.d3 = i47 + 4;
                    Set<String> set = getMessagesController().pendingSuggestions;
                    if (set.contains("PREMIUM_GRACE")) {
                        int i48 = this.N2;
                        this.Y2 = i48;
                        this.N2 = i48 + 2;
                        this.Z2 = i48 + 1;
                    } else if (set.contains("VALIDATE_PHONE_NUMBER")) {
                        int i49 = this.N2;
                        this.a3 = i49;
                        this.N2 = i49 + 2;
                        this.X2 = i49 + 1;
                    } else if (set.contains("VALIDATE_PASSWORD")) {
                        int i50 = this.N2;
                        this.c3 = i50;
                        this.N2 = i50 + 2;
                        this.b3 = i50 + 1;
                    }
                    int i51 = this.N2;
                    this.e3 = i51;
                    this.j3 = i51 + 1;
                    this.h3 = i51 + 2;
                    this.f3 = i51 + 3;
                    this.i3 = i51 + 4;
                    this.N2 = i51 + 6;
                    this.l3 = i51 + 5;
                    if (getMessagesController().filtersEnabled || !getMessagesController().dialogFilters.isEmpty()) {
                        int i52 = this.N2;
                        this.N2 = i52 + 1;
                        this.k3 = i52;
                    }
                    int i53 = this.N2;
                    this.n3 = i53;
                    this.g3 = i53 + 1;
                    this.N2 = i53 + 3;
                    this.o3 = i53 + 2;
                    if (!getMessagesController().premiumFeaturesBlocked()) {
                        int i54 = this.N2;
                        this.N2 = i54 + 1;
                        this.c4 = i54;
                    }
                    if (getMessagesController().starsPurchaseAvailable()) {
                        int i55 = this.N2;
                        this.N2 = i55 + 1;
                        this.d4 = i55;
                    }
                    zh.s5.y(this.currentAccount, true).p();
                    if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (zh.s5.y(this.currentAccount, true).e && (zh.s5.y(this.currentAccount, true).N() || zh.s5.y(this.currentAccount, true).p().positive()))) {
                        int i56 = this.N2;
                        this.N2 = i56 + 1;
                        this.e4 = i56;
                    }
                    if (!getMessagesController().premiumFeaturesBlocked()) {
                        int i57 = this.N2;
                        this.N2 = i57 + 1;
                        this.f4 = i57;
                    }
                    if (!getMessagesController().premiumPurchaseBlocked()) {
                        int i58 = this.N2;
                        this.N2 = i58 + 1;
                        this.g4 = i58;
                    }
                    if (this.c4 >= 0 || this.d4 >= 0 || this.e4 >= 0 || this.f4 >= 0 || this.g4 >= 0) {
                        int i59 = this.N2;
                        this.N2 = i59 + 1;
                        this.h4 = i59;
                    }
                    int i60 = this.N2;
                    this.p3 = i60;
                    this.q3 = i60 + 1;
                    this.r3 = i60 + 2;
                    int i61 = i60 + 4;
                    this.N2 = i61;
                    this.s3 = i60 + 3;
                    if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
                        this.t3 = i61;
                        this.N2 = i60 + 6;
                        this.u3 = i60 + 5;
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        int i62 = this.N2;
                        this.v3 = i62;
                        this.w3 = i62 + 1;
                        this.N2 = i62 + 3;
                        this.x3 = i62 + 2;
                    }
                    if (BuildVars.DEBUG_VERSION) {
                        int i63 = this.N2;
                        this.N2 = i63 + 1;
                        this.y3 = i63;
                    }
                    int i64 = this.N2;
                    this.N2 = i64 + 1;
                    this.z3 = i64;
                }
            } else if (this.q1) {
                if (this.A3 < 0 && this.B3 < 0) {
                    if (this.I4 || this.Q5 != null || this.a0 == null) {
                        int i65 = this.N2;
                        this.N2 = i65 + 1;
                        this.B3 = i65;
                    } else {
                        int i66 = this.N2;
                        this.N2 = i66 + 1;
                        this.A3 = i66;
                    }
                }
                int i67 = this.N2;
                int i68 = i67 + 1;
                this.N2 = i68;
                this.L3 = i67;
                if (this.a0 == null) {
                    this.N2 = i67 + 2;
                    this.Q3 = i68;
                }
                int i69 = this.N2;
                int i70 = i69 + 1;
                this.N2 = i70;
                this.R3 = i69;
                if (z10) {
                    this.N2 = i69 + 2;
                    this.J4 = i70;
                }
            } else if (this.f1 != 0) {
                TLRPC.ChatFull chatFull7 = this.u2;
                if ((chatFull7 != null && (!TextUtils.isEmpty(chatFull7.about) || (this.u2.location instanceof TLRPC.TL_channelLocation))) || ChatObject.isPublic(this.E2)) {
                    if (this.A3 < 0 && this.B3 < 0) {
                        if (this.I4 || this.Q5 != null || this.a0 == null) {
                            int i71 = this.N2;
                            this.N2 = i71 + 1;
                            this.B3 = i71;
                        } else {
                            int i72 = this.N2;
                            this.N2 = i72 + 1;
                            this.A3 = i72;
                        }
                    }
                    if (this.a0 == null) {
                        int i73 = this.N2;
                        this.N2 = i73 + 1;
                        this.D3 = i73;
                    }
                    TLRPC.ChatFull chatFull8 = this.u2;
                    if (chatFull8 != null) {
                        if (!TextUtils.isEmpty(chatFull8.about)) {
                            int i74 = this.N2;
                            this.N2 = i74 + 1;
                            this.K3 = i74;
                        }
                        if (this.u2.location instanceof TLRPC.TL_channelLocation) {
                            int i75 = this.N2;
                            this.N2 = i75 + 1;
                            this.I3 = i75;
                        }
                    }
                    if (ChatObject.isPublic(this.E2)) {
                        int i76 = this.N2;
                        this.N2 = i76 + 1;
                        this.L3 = i76;
                    }
                }
                if (this.A3 < 0 && this.B3 < 0) {
                    if (this.I4 || this.Q5 != null || this.a0 == null) {
                        int i77 = this.N2;
                        this.N2 = i77 + 1;
                        this.B3 = i77;
                    } else {
                        int i78 = this.N2;
                        this.N2 = i78 + 1;
                        this.A3 = i78;
                    }
                }
                if (this.a0 == null) {
                    if (this.D3 != -1) {
                        int i79 = this.N2;
                        this.N2 = i79 + 1;
                        this.M3 = i79;
                    }
                    int i80 = this.N2;
                    this.N2 = i80 + 1;
                    this.N3 = i80;
                }
                int i81 = this.N2;
                if (i81 > 0) {
                    this.N2 = i81 + 1;
                    this.R3 = i81;
                }
                TLRPC.Chat chat2 = this.E2;
                if (chat2 != null && chat2.linked_community_id != 0) {
                    int i82 = this.N2;
                    this.l4 = i82;
                    this.N2 = i82 + 2;
                    this.m4 = i82 + 1;
                }
                if (ChatObject.isChannel(chat2)) {
                    TLRPC.Chat chat3 = this.E2;
                    if (!chat3.megagroup) {
                        TLRPC.ChatFull chatFull9 = this.u2;
                        if (chatFull9 != null && (chat3.creator || chatFull9.can_view_participants)) {
                            if (this.a0 == null) {
                                int i83 = this.N2;
                                this.N2 = i83 + 1;
                                this.t4 = i83;
                            }
                            int i84 = this.N2;
                            int i85 = i84 + 1;
                            this.N2 = i85;
                            this.x4 = i84;
                            if (chatFull9.requests_pending > 0) {
                                this.N2 = i84 + 2;
                                this.y4 = i85;
                            }
                            int i86 = this.N2;
                            int i87 = i86 + 1;
                            this.N2 = i87;
                            this.z4 = i86;
                            if (chatFull9.banned_count != 0 || chatFull9.kicked_count != 0) {
                                this.N2 = i86 + 2;
                                this.G4 = i87;
                            }
                            if ((chatFull9.can_view_stars_revenue && (zh.o.g(this.currentAccount).c(-this.f1).amount > 0 || !zh.o.g(this.currentAccount).k(-this.f1).a[0].isEmpty())) || ((chatFull4 = this.u2) != null && chatFull4.can_view_revenue && zh.o.g(this.currentAccount).i(-this.f1) > 0)) {
                                int i88 = this.N2;
                                this.N2 = i88 + 1;
                                this.D4 = i88;
                            }
                            int i89 = this.N2;
                            this.A4 = i89;
                            this.N2 = i89 + 2;
                            this.E4 = i89 + 1;
                        }
                        if (ChatObject.isChannel(this.E2)) {
                            TLRPC.ChatFull chatFull10 = this.u2;
                            if (chatFull10 != null) {
                                if (this.q1 || (chatParticipants = chatFull10.participants) == null || chatParticipants.participants == null || (chatParticipants instanceof TLRPC.TL_chatParticipantsForbidden)) {
                                    if (!ChatObject.isNotInChat(this.E2) && ChatObject.canAddUsers(this.E2) && this.u2.participants_hidden) {
                                        int i90 = this.N2;
                                        this.w4 = i90;
                                        this.N2 = i90 + 2;
                                        this.H4 = i90 + 1;
                                    }
                                    m01 m01Var = this.O;
                                    if (m01Var != null) {
                                        m01Var.n1();
                                    }
                                } else {
                                    if (ChatObject.canAddUsers(this.E2) || (tL_chatBannedRights = this.E2.default_banned_rights) == null || !tL_chatBannedRights.invite_users) {
                                        int i91 = this.N2;
                                        this.N2 = i91 + 1;
                                        this.w4 = i91;
                                    }
                                    if (this.u2.participants.participants.size() <= 5 || !z10) {
                                        if (this.w4 == -1 && this.a0 == null) {
                                            int i92 = this.N2;
                                            this.N2 = i92 + 1;
                                            this.t4 = i92;
                                        }
                                        int i93 = this.N2;
                                        this.u4 = i93;
                                        int size = this.u2.participants.participants.size() + i93;
                                        this.v4 = size;
                                        this.N2 = size + 1;
                                        this.H4 = size;
                                        arrayList2.addAll(this.u2.participants.participants);
                                        ArrayList arrayList4 = this.C2;
                                        if (arrayList4 != null) {
                                            arrayList3.addAll(arrayList4);
                                        }
                                        m01 m01Var2 = this.O;
                                        if (m01Var2 != null) {
                                            m01Var2.a1(null, null);
                                        }
                                    } else {
                                        if (this.w4 != -1) {
                                            int i94 = this.N2;
                                            this.N2 = i94 + 1;
                                            this.H4 = i94;
                                        }
                                        m01 m01Var3 = this.O;
                                        if (m01Var3 != null) {
                                            m01Var3.a1(this.C2, this.u2);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (this.q1 || (chatFull3 = this.u2) == null || !this.E2.megagroup || (chatParticipants2 = chatFull3.participants) == null || (arrayList = chatParticipants2.participants) == null || arrayList.isEmpty()) {
                                if (!ChatObject.isNotInChat(this.E2) && ChatObject.canAddUsers(this.E2) && (chatFull2 = this.u2) != null && chatFull2.participants_hidden) {
                                    int i95 = this.N2;
                                    this.w4 = i95;
                                    this.N2 = i95 + 2;
                                    this.H4 = i95 + 1;
                                }
                                m01 m01Var4 = this.O;
                                if (m01Var4 != null) {
                                    m01Var4.n1();
                                }
                            } else {
                                if (!ChatObject.isNotInChat(this.E2) && ChatObject.canAddUsers(this.E2) && this.u2.participants_count < getMessagesController().maxMegagroupCount) {
                                    int i96 = this.N2;
                                    this.N2 = i96 + 1;
                                    this.w4 = i96;
                                }
                                int size2 = this.u2.participants.participants.size();
                                if ((size2 <= 5 || !z10 || this.S4 == 1) && this.S4 != 2) {
                                    if (this.w4 == -1 && this.a0 == null) {
                                        int i97 = this.N2;
                                        this.N2 = i97 + 1;
                                        this.t4 = i97;
                                    }
                                    int i98 = this.N2;
                                    this.u4 = i98;
                                    int i99 = i98 + size2;
                                    this.v4 = i99;
                                    this.N2 = i99 + 1;
                                    this.H4 = i99;
                                    arrayList2.addAll(this.u2.participants.participants);
                                    ArrayList arrayList5 = this.C2;
                                    if (arrayList5 != null) {
                                        arrayList3.addAll(arrayList5);
                                    }
                                    this.S4 = 1;
                                    m01 m01Var5 = this.O;
                                    if (m01Var5 != null) {
                                        m01Var5.a1(null, null);
                                    }
                                } else {
                                    if (this.w4 != -1) {
                                        int i100 = this.N2;
                                        this.N2 = i100 + 1;
                                        this.H4 = i100;
                                    }
                                    if (this.O != null) {
                                        if (!this.C2.isEmpty()) {
                                            this.S4 = 2;
                                        }
                                        this.O.a1(this.C2, this.u2);
                                    }
                                }
                            }
                            if (this.M4 == -1) {
                                TLRPC.Chat chat4 = this.E2;
                                if (chat4.left && !chat4.kicked) {
                                    long j11 = MessagesController.getNotificationsSettings(this.currentAccount).getLong("dialog_join_requested_time_" + this.i1, -1L);
                                    if (j11 <= 0 || System.currentTimeMillis() - j11 >= 120000) {
                                        org.telegram.ui.Components.dh0 dh0Var2 = this.a0;
                                        if (dh0Var2 == null || !dh0Var2.f()) {
                                            int i101 = this.N2;
                                            this.L4 = i101;
                                            this.N2 = i101 + 2;
                                            this.M4 = i101 + 1;
                                        }
                                        if (z10) {
                                            int i102 = this.N2;
                                            this.N2 = i102 + 1;
                                            this.J4 = i102;
                                        }
                                        if (this.J4 == -1) {
                                            int i103 = this.N2;
                                            this.N2 = i103 + 1;
                                            this.C3 = i103;
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
                                            gz0Var = this.a;
                                            if (gz0Var != null) {
                                                gz0Var.setTranslateSelectorPosition(this.O3);
                                            }
                                            dh0Var = this.a0;
                                            if (dh0Var != null) {
                                                dh0Var.o(7, z13);
                                            }
                                            vh0Var = this.c0;
                                            if (vh0Var != null) {
                                                TLRPC.UserFull userFull14 = this.v2;
                                                if (userFull14 != null) {
                                                    vh0Var.setMusicDocument(userFull14.saved_music);
                                                }
                                                this.c0.setVisibility(this.I4 ? 0 : 8);
                                                return;
                                            }
                                            return;
                                        }
                                        this.C0 = 0;
                                        gz0Var = this.a;
                                        if (gz0Var != null) {
                                        }
                                        dh0Var = this.a0;
                                        if (dh0Var != null) {
                                        }
                                        vh0Var = this.c0;
                                        if (vh0Var != null) {
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
                            gz0Var = this.a;
                            if (gz0Var != null) {
                            }
                            dh0Var = this.a0;
                            if (dh0Var != null) {
                            }
                            vh0Var = this.c0;
                            if (vh0Var != null) {
                            }
                        }
                        this.C0 = 0;
                        gz0Var = this.a;
                        if (gz0Var != null) {
                        }
                        dh0Var = this.a0;
                        if (dh0Var != null) {
                        }
                        vh0Var = this.c0;
                        if (vh0Var != null) {
                        }
                    }
                }
                TLRPC.ChatFull chatFull11 = this.u2;
                if ((chatFull11 != null && chatFull11.can_view_stars_revenue && (zh.o.g(this.currentAccount).c(-this.f1).amount > 0 || !zh.o.g(this.currentAccount).k(-this.f1).a[0].isEmpty())) || ((chatFull = this.u2) != null && chatFull.can_view_revenue && zh.o.g(this.currentAccount).i(-this.f1) > 0)) {
                    int i104 = this.N2;
                    this.D4 = i104;
                    this.N2 = i104 + 2;
                    this.E4 = i104 + 1;
                }
                if (ChatObject.isChannel(this.E2)) {
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
                gz0Var = this.a;
                if (gz0Var != null) {
                }
                dh0Var = this.a0;
                if (dh0Var != null) {
                }
                vh0Var = this.c0;
                if (vh0Var != null) {
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
            gz0Var = this.a;
            if (gz0Var != null) {
            }
            dh0Var = this.a0;
            if (dh0Var != null) {
            }
            vh0Var = this.c0;
            if (vh0Var != null) {
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
        if (this.J4 == -1) {
        }
        if (this.actionBar != null) {
        }
        if (this.a != null) {
        }
        this.C0 = 0;
        gz0Var = this.a;
        if (gz0Var != null) {
        }
        dh0Var = this.a0;
        if (dh0Var != null) {
        }
        vh0Var = this.c0;
        if (vh0Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0aae  */
    /* JADX WARN: Removed duplicated region for block: B:307:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0528  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k4(boolean z10) {
        ValueAnimator valueAnimator;
        org.telegram.ui.Components.x9 currentItemView;
        boolean z11;
        float f7;
        NotchInfoUtils.NotchInfo notchInfo;
        boolean z12;
        float f10;
        int i10;
        ValueAnimator valueAnimator2;
        NotchInfoUtils.NotchInfo notchInfo2;
        TLRPC.ChatFull chatFull;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        float y3 = y3();
        gz0 gz0Var = this.a;
        if (gz0Var != null && !this.G1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gz0Var.getLayoutParams();
            if (layoutParams.topMargin != currentActionBarHeight) {
                layoutParams.topMargin = currentActionBarHeight;
                this.a.setLayoutParams(layoutParams);
            }
        }
        n5(z10);
        if (this.Y != null) {
            this.a.setTopGlowOffset((int) this.Q1);
            this.a.setOverScrollMode((this.Q1 <= ((float) T3()) || this.Q1 >= ((float) ((O3() + this.a.getMeasuredWidth()) - currentActionBarHeight))) ? 0 : 2);
        }
        if (this.Y != null && !this.M5 && this.G1) {
            x3();
            return;
        }
        int T3 = T3();
        if (this.Y != null) {
            if (this.a0 != null && this.f1 != 0) {
                this.a0.o(2, (!ChatObject.isChannel(this.E2) || this.E2.megagroup || (chatFull = this.u2) == null || chatFull.linked_chat_id == 0) ? false : true);
            }
            n5(z10);
            float translationY = this.actionBar.getTranslationY() + ((((y3 + 1.0f) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f)) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f));
            if (this.G1) {
                this.a2 = translationY;
            } else {
                float f11 = -AndroidUtilities.dp(29.0f);
                org.telegram.ui.Components.sh0 sh0Var = this.t0;
                if (sh0Var != null && (notchInfo2 = sh0Var.n) != null && notchInfo2.isLikelyCircle) {
                    f11 = notchInfo2.bounds.centerY();
                }
                this.a2 = AndroidUtilities.lerp(f11, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f)), y3);
            }
            float f12 = this.G1 ? this.R1 : this.Q1;
            float f13 = T3;
            org.telegram.ui.ActionBar.j5[] j5VarArr = this.r;
            org.telegram.ui.ActionBar.j5[] j5VarArr2 = this.f;
            if (f12 > f13 || this.p2) {
                float max = Math.max(0.0f, Math.min(1.0f, (f12 - f13) / ((this.a.getMeasuredWidth() - currentActionBarHeight) - U3())));
                this.h2 = max;
                this.b2 = (AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) / 100.0f) * 42.0f;
                this.c2 = 0.0f;
                sz0 sz0Var = this.u0;
                if (sz0Var != null) {
                    sz0Var.invalidate();
                }
                zh.g0 g0Var = this.v0;
                if (g0Var != null) {
                    g0Var.invalidate();
                }
                float min = Math.min(AndroidUtilities.dpf2(2000.0f), Math.max(AndroidUtilities.dpf2(1100.0f), Math.abs(this.i2))) / AndroidUtilities.dpf2(1100.0f);
                O3();
                boolean z13 = this.o2;
                float[] fArr = this.m2;
                if (!z13 || (!this.F0 && this.h2 < 0.33f)) {
                    if (this.p2) {
                        this.p2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                        org.telegram.ui.ActionBar.v0 v0Var = this.T0;
                        if (v0Var != null) {
                            v0Var.r(21);
                            if (this.q0 != null) {
                                this.T0.r(33);
                                this.T0.r(34);
                                this.T0.r(35);
                                this.T0.K(36);
                                this.T0.K(31);
                            }
                        }
                        org.telegram.ui.ActionBar.v0 v0Var2 = this.U0;
                        if (v0Var2 != null) {
                            v0Var2.setEnabled(!this.z1);
                        }
                        this.N.f(min, false);
                        this.o0.b(min);
                        this.j2.cancel();
                        this.e0.getImageReceiver().setAllowStartAnimation(true);
                        this.e0.getImageReceiver().startAnimation();
                        float lerp = AndroidUtilities.lerp(fArr, this.l2);
                        fArr[0] = lerp;
                        fArr[1] = 0.0f;
                        this.j2.setInterpolator(org.telegram.ui.Components.pr.j);
                        if (this.n2) {
                            this.j2.setDuration(0L);
                        } else {
                            this.j2.setDuration((long) ((lerp * 250.0f) / min));
                        }
                        this.d1.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, this.z0));
                        if (!this.H0 && (currentItemView = this.n0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().getDrawable() instanceof org.telegram.ui.Components.q61) {
                                this.e0.a0 = false;
                            } else {
                                pz0 pz0Var = this.e0;
                                pz0Var.a0 = true;
                                pz0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().getDrawableSafe());
                            }
                        }
                        this.j2.addListener(new c01(this, 3));
                        this.e0.setForegroundAlpha(1.0f);
                        this.Y.setVisibility(0);
                        this.n0.setAlpha(0.0f);
                        this.j2.start();
                        this.P1 = false;
                        try {
                            this.Y.performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                            this.Y.setScaleX(this.b2);
                            this.Y.setScaleY(this.b2);
                            N3();
                            valueAnimator = this.j2;
                            if (valueAnimator != null) {
                            }
                            D4();
                            j5VarArr2[1].setTranslationY(this.e2);
                            j5VarArr[1].setTranslationX(W3(this.f2));
                            j5VarArr[1].setTranslationY(X3(this.g2));
                            this.s.setTranslationX(this.f2);
                            this.s.setTranslationY(this.g2);
                            V4();
                            z11 = this.G1;
                            if (!z11) {
                            }
                            if (f12 <= f13) {
                            }
                            z12 = false;
                            if (!z12) {
                            }
                            b5(currentActionBarHeight);
                            if (y3 < 1.0f) {
                            }
                        }
                    }
                    this.Y.setScaleX(this.b2);
                    this.Y.setScaleY(this.b2);
                    N3();
                    valueAnimator = this.j2;
                    if (valueAnimator != null || !valueAnimator.isRunning()) {
                        D4();
                        j5VarArr2[1].setTranslationY(this.e2);
                        j5VarArr[1].setTranslationX(W3(this.f2));
                        j5VarArr[1].setTranslationY(X3(this.g2));
                        this.s.setTranslationX(this.f2);
                        this.s.setTranslationY(this.g2);
                        V4();
                    }
                    z11 = this.G1;
                    if (!z11 && this.J1 == 2) {
                        float f14 = this.O5;
                        float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f));
                        j5VarArr2[0].setTranslationX((this.O5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f));
                        double d = translationY2;
                        j5VarArr2[0].setTranslationY(((float) Math.floor(d)) + AndroidUtilities.dp(1.3f));
                        j5VarArr[0].setTranslationX((this.O5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f));
                        j5VarArr[0].setTranslationY(((float) Math.floor(d)) + AndroidUtilities.dp(24.0f));
                        j5VarArr2[0].setScaleX(1.0f);
                        j5VarArr2[0].setScaleY(1.0f);
                        j5VarArr2[1].setPivotY(r4.getMeasuredHeight());
                        j5VarArr2[1].setScaleX(1.38f);
                        j5VarArr2[1].setScaleY(1.38f);
                        this.b2 = AndroidUtilities.lerp(42, 138, this.S1) / 100.0f;
                        this.c2 = 0.0f;
                        sz0 sz0Var2 = this.u0;
                        if (sz0Var2 != null) {
                            sz0Var2.setExpandProgress(1.0f);
                        }
                        zh.g0 g0Var2 = this.v0;
                        if (g0Var2 != null) {
                            g0Var2.setExpandProgress(1.0f);
                        }
                        this.e0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, this.S1));
                        this.Y.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, this.S1));
                        this.Y.setTranslationY(AndroidUtilities.lerp((float) Math.ceil(d), 0.0f, this.S1));
                        float measuredWidth = ((this.b2 * 100.0f) / 42.0f) * (this.Y.getMeasuredWidth() - AndroidUtilities.dp(42.0f));
                        this.h0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(16.0f) + measuredWidth);
                        this.h0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(-10.0f) + measuredWidth);
                        this.i0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                        this.i0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(26.5f) + measuredWidth);
                        this.j0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                        this.j0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + measuredWidth);
                        this.k0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                        this.k0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + measuredWidth);
                        this.Y.setScaleX(this.b2);
                        this.Y.setScaleY(this.b2);
                        this.n0.setAlpha(0.0f);
                        this.n0.setVisibility(0);
                        pz0 pz0Var2 = this.e0;
                        float f15 = this.S1;
                        float f16 = this.b2;
                        pz0Var2.H = f15;
                        pz0Var2.I = f16;
                        pz0Var2.G = true;
                        this.N.e(f15, false);
                        this.actionBar.C(i0.a.d(this.S1, this.Q5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, this.z0), -1), false);
                        org.telegram.ui.Components.xl0 xl0Var = this.L;
                        if (xl0Var != null) {
                            xl0Var.b(i0.a.d(this.S1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h8, this.z0), Color.argb(179, 255, 255, 255)));
                        }
                        Drawable drawable = this.x;
                        if (drawable != null) {
                            drawable.setColorFilter(this.Q5 == null ? i0.a.d(this.S1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pc, this.z0), -1) : -1, PorterDuff.Mode.MULTIPLY);
                        }
                        org.telegram.ui.Components.or orVar = this.J[1];
                        if (orVar != null) {
                            orVar.b(this.S1);
                            j5VarArr2[1].invalidate();
                        }
                        org.telegram.ui.Components.or orVar2 = this.K[1];
                        if (orVar2 != null) {
                            orVar2.b(this.S1);
                            j5VarArr2[1].invalidate();
                        }
                        Y4(this.S1);
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Y.getLayoutParams();
                        layoutParams2.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.a.getMeasuredWidth() / this.b2, this.S1);
                        layoutParams2.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.Q1 + currentActionBarHeight) / this.b2, this.S1);
                        this.Y.requestLayout();
                        V4();
                    } else if (f12 <= f13) {
                        if (z11) {
                            this.b2 = AndroidUtilities.lerp(42, 96, y3) / 100.0f;
                            this.c2 = 0.0f;
                            f7 = 1.0f;
                        } else {
                            org.telegram.ui.Components.sh0 sh0Var2 = this.t0;
                            this.b2 = AndroidUtilities.lerp((sh0Var2 == null || (notchInfo = sh0Var2.n) == null || !notchInfo.isLikelyCircle) ? 24.0f : (notchInfo.bounds.width() * 0.5f) / AndroidUtilities.density, 96.0f, y3) / 100.0f;
                            f7 = 1.0f;
                            this.c2 = 1.0f - y3;
                        }
                        org.telegram.ui.Components.dh0 dh0Var = this.a0;
                        if (dh0Var != null) {
                            if (this.G1) {
                                dh0Var.setAlpha(this.S1);
                            } else {
                                dh0Var.setAlpha(f7);
                            }
                        }
                        sz0 sz0Var3 = this.u0;
                        if (sz0Var3 != null) {
                            sz0Var3.invalidate();
                        }
                        zh.g0 g0Var3 = this.v0;
                        if (g0Var3 != null) {
                            g0Var3.h = this.G1;
                            float clamp01 = Utilities.clamp01((y3 - 0.3f) / 0.7f);
                            if (g0Var3.f != clamp01) {
                                g0Var3.f = clamp01;
                                g0Var3.invalidate();
                            }
                        }
                        float f17 = (0.12f * y3) + 1.0f;
                        ValueAnimator valueAnimator3 = this.j2;
                        if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                            this.Y.setScaleX(this.b2);
                            this.Y.setScaleY(this.b2);
                            N3();
                            this.Y.setTranslationY((float) Math.ceil(this.a2));
                            float dp = (((this.b2 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
                            this.h0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(16.0f) + dp);
                            this.h0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(-10.0f) + dp);
                            this.i0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                            this.i0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(26.5f) + dp);
                            this.j0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                            this.j0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + dp);
                            this.k0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
                            this.k0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + dp);
                        } else {
                            ValueAnimator valueAnimator4 = this.j2;
                            c01 c01Var = this.I5;
                            valueAnimator4.removeListener(c01Var);
                            this.j2.addListener(c01Var);
                        }
                        float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (this.Y.getScaleY() * this.Y.getHeight())) * (this.G1 ? this.S1 : y3)) + ((float) Math.floor(translationY));
                        this.e2 = com.google.android.gms.internal.vision.e2.z(1.0f, this.S1, 0.0f, (AndroidUtilities.dp(7.0f) * y3) + AndroidUtilities.dp(1.3f) + dpf2);
                        this.g2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * y3) + dpf2 + AndroidUtilities.dp(24.0f);
                        float dp2 = this.G1 ? (this.O5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f) : -AndroidUtilities.dpf2(46.0f);
                        m11 m11Var = this.b6;
                        if (m11Var != null) {
                            m11Var.setAlpha((int) (255.0f * y3));
                        }
                        int measuredWidth2 = this.a.getMeasuredWidth();
                        int i11 = 0;
                        boolean z14 = false;
                        while (i11 < j5VarArr2.length) {
                            org.telegram.ui.ActionBar.j5 j5Var = j5VarArr2[i11];
                            if (j5Var == null) {
                                f10 = f17;
                            } else {
                                j5Var.setScaleX(f17);
                                j5VarArr2[i11].setScaleY(f17);
                                if (i11 == 1) {
                                    l4(0, y3, false);
                                    z14 = true;
                                }
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) j5VarArr2[i11].getLayoutParams();
                                float f18 = measuredWidth2;
                                float f19 = f18 / 2.0f;
                                float min2 = f19 - (((Math.min(j5VarArr2[i11].getExactWidth(), i11 == 1 ? layoutParams3.width : f18) * f17) * 0.5f) + layoutParams3.leftMargin);
                                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) j5VarArr[i11].getLayoutParams();
                                float f20 = layoutParams4.leftMargin;
                                float exactWidth = j5VarArr[this.p5 ? 3 : i11].getExactWidth();
                                f10 = f17;
                                if (i11 == 1) {
                                    f18 = layoutParams4.width;
                                }
                                float min3 = f19 - ((Math.min(exactWidth, f18) * 0.5f) + f20);
                                if (i11 == 1) {
                                    this.d2 = min2;
                                    this.f2 = min3;
                                }
                                float lerp2 = AndroidUtilities.lerp(dp2, min2, y3);
                                float lerp3 = AndroidUtilities.lerp(dp2, min3, y3);
                                ValueAnimator valueAnimator5 = this.j2;
                                if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                                    j5VarArr2[i11].setTranslationX(lerp2);
                                    j5VarArr2[i11].setTranslationY(this.e2);
                                    j5VarArr[i11].setTranslationX(W3(lerp3));
                                    j5VarArr[i11].setTranslationY(X3(this.g2));
                                    i10 = 1;
                                    if (i11 == 1) {
                                        this.s.setTranslationX(lerp3);
                                    }
                                } else {
                                    i10 = 1;
                                }
                                if (i11 == i10) {
                                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) j5VarArr2[i10].getLayoutParams();
                                    int i12 = layoutParams5.width;
                                    int min4 = Math.min(layoutParams5.width, (int) ((((AndroidUtilities.isTablet() ? AndroidUtilities.dp(490.0f) : AndroidUtilities.displaySize.x) - AndroidUtilities.dp(18.0f)) / j5VarArr2[1].getScaleX()) - (j5VarArr2[1].getTranslationX() + layoutParams5.leftMargin)));
                                    layoutParams5.width = min4;
                                    if (min4 != i12) {
                                        j5VarArr2[1].requestLayout();
                                    }
                                }
                            }
                            i11++;
                            f17 = f10;
                        }
                        this.s.setTranslationY(this.g2);
                        V4();
                        z12 = z14;
                        if (!z12 && ((valueAnimator2 = this.j2) == null || !valueAnimator2.isRunning())) {
                            l4(0, y3, true);
                        }
                    }
                    z12 = false;
                    if (!z12) {
                        l4(0, y3, true);
                    }
                } else {
                    if (!this.p2) {
                        if (this.T0 != null) {
                            if (g4()) {
                                this.T0.r(21);
                            } else {
                                this.T0.K(21);
                            }
                            if (this.q0 != null) {
                                this.T0.K(36);
                                this.T0.K(34);
                                this.T0.K(35);
                                this.T0.r(33);
                                this.T0.r(31);
                            }
                        }
                        org.telegram.ui.ActionBar.v0 v0Var3 = this.U0;
                        if (v0Var3 != null) {
                            v0Var3.setEnabled(false);
                        }
                        this.p2 = true;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                        this.N.f(min, true);
                        this.o0.b(min);
                        this.n0.setCreateThumbFromParent(true);
                        this.n0.getAdapter().g();
                        this.j2.cancel();
                        float lerp4 = AndroidUtilities.lerp(fArr, this.l2);
                        fArr[0] = lerp4;
                        fArr[1] = 1.0f;
                        sz0 sz0Var4 = this.u0;
                        if (sz0Var4 == null || sz0Var4.w.isEmpty()) {
                            this.j2.setInterpolator(org.telegram.ui.Components.pr.j);
                            this.j2.setDuration((long) (((1.0f - lerp4) * 250.0f) / min));
                        } else {
                            this.j2.setInterpolator(new u1.a());
                            this.j2.setDuration((long) ((((1.0f - lerp4) * 1.3f) * 250.0f) / min));
                        }
                        this.j2.addListener(new c01(this, 2));
                        View m10 = this.c.m(0);
                        if (!this.P1 && m10 != null) {
                            this.O1 = true;
                            this.a.w0(((m10.getTop() - this.a.getMeasuredWidth()) - O3()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0), (int) this.j2.getDuration(), (Interpolator) this.j2.getInterpolator());
                            this.a.N0 = false;
                        }
                        this.K5 = j5VarArr2[1].getTranslationY();
                        this.L5 = j5VarArr[1].getTranslationY();
                        this.j2.start();
                        this.n0.setAlpha(0.0f);
                        this.n0.setVisibility(0);
                        try {
                            this.Y.performHapticFeedback(0, 1);
                        } catch (Exception unused2) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams6 = this.n0.getLayoutParams();
                    int i13 = layoutParams6.height;
                    layoutParams6.width = this.a.getMeasuredWidth();
                    float f21 = currentActionBarHeight + f12;
                    int i14 = (int) f21;
                    layoutParams6.height = i14;
                    if (i13 != i14) {
                        this.n0.requestLayout();
                    }
                    if (!this.j2.isRunning()) {
                        float dp3 = (this.G1 && this.J1 == 2) ? (-(1.0f - this.S1)) * AndroidUtilities.dp(50.0f) : 0.0f;
                        j5VarArr2[1].setTranslationX(AndroidUtilities.dpf2(18.0f) - j5VarArr2[1].getLeft());
                        j5VarArr2[1].setTranslationY((((f21 - O3()) - AndroidUtilities.dpf2(30.0f)) - j5VarArr2[1].getBottom()) + dp3);
                        j5VarArr[1].setTranslationX(W3(AndroidUtilities.dpf2(16.0f) - j5VarArr[1].getLeft()));
                        j5VarArr[1].setTranslationY(X3((((f21 - O3()) - AndroidUtilities.dpf2(10.0f)) - j5VarArr[1].getBottom()) + dp3));
                        this.s.setTranslationX(j5VarArr[1].getTranslationX());
                        this.s.setTranslationY(j5VarArr[1].getTranslationY());
                        V4();
                    }
                }
            }
            z11 = this.G1;
            if (!z11) {
            }
            if (f12 <= f13) {
            }
            z12 = false;
            if (!z12) {
            }
        }
        b5(currentActionBarHeight);
        if (y3 < 1.0f) {
            this.e0.setAlpha(1.0f);
        }
    }

    public final void k5() {
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l4(int i10, float f7, boolean z10) {
        float scaleX;
        float f10;
        FrameLayout.LayoutParams layoutParams;
        int i11;
        ValueAnimator valueAnimator;
        float f11 = this.Q1;
        float T3 = T3();
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.f;
        if (f11 > T3 || ((valueAnimator = this.j2) != null && valueAnimator.isRunning())) {
            scaleX = j5VarArr[1].getScaleX();
        } else {
            if (f7 < 1.0f) {
                scaleX = 1.0f;
                f10 = 1.12f;
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
                int dp2 = dp - AndroidUtilities.dp((((1.0f - this.E5) * i12) + 40.0f) + ((!this.G1 ? 109 : 47) + 8));
                int i13 = (int) (dp2 / (i10 == 0 ? scaleX : 1.0f));
                int A = i10 == 0 ? i10 : org.telegram.messenger.wl.A(18.0f, 2, dp);
                if (i10 == 0) {
                    i10 = (int) (A / f10);
                }
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.i;
                int lerp = AndroidUtilities.lerp(i13, i10, prVar.getInterpolation(f7));
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) j5VarArr[1].getLayoutParams();
                int i14 = layoutParams2.width;
                layoutParams2.width = (int) Math.ceil(lerp);
                if (z10) {
                    layoutParams2.width = Math.min(layoutParams2.width, (int) (((dp - AndroidUtilities.dp(18.0f)) / j5VarArr[1].getScaleX()) - (j5VarArr[1].getTranslationX() + layoutParams2.leftMargin)));
                }
                if (z10 && layoutParams2.width != i14) {
                    j5VarArr[1].requestLayout();
                }
                int lerp2 = AndroidUtilities.lerp(dp2, A, prVar.getInterpolation(f7));
                org.telegram.ui.ActionBar.j5[] j5VarArr2 = this.r;
                layoutParams = (FrameLayout.LayoutParams) j5VarArr2[1].getLayoutParams();
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
                i11 = layoutParams.width;
                int ceil = (int) Math.ceil(lerp2);
                layoutParams.width = ceil;
                layoutParams3.width = ceil;
                if (i11 == layoutParams.width) {
                    j5VarArr2[2].getLayoutParams().width = layoutParams.width;
                    j5VarArr2[2].requestLayout();
                    j5VarArr2[3].getLayoutParams().width = layoutParams.width;
                    j5VarArr2[3].requestLayout();
                    j5VarArr2[1].requestLayout();
                    this.s.requestLayout();
                    return;
                }
                return;
            }
            scaleX = Math.max(j5VarArr[1].getScaleX(), 1.12f);
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
        int dp22 = dp - AndroidUtilities.dp((((1.0f - this.E5) * i12) + 40.0f) + ((!this.G1 ? 109 : 47) + 8));
        int i132 = (int) (dp22 / (i10 == 0 ? scaleX : 1.0f));
        if (i10 == 0) {
        }
        if (i10 == 0) {
        }
        org.telegram.ui.Components.pr prVar2 = org.telegram.ui.Components.pr.i;
        int lerp3 = AndroidUtilities.lerp(i132, i10, prVar2.getInterpolation(f7));
        FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) j5VarArr[1].getLayoutParams();
        int i142 = layoutParams22.width;
        layoutParams22.width = (int) Math.ceil(lerp3);
        if (z10) {
        }
        if (z10) {
            j5VarArr[1].requestLayout();
        }
        int lerp22 = AndroidUtilities.lerp(dp22, A, prVar2.getInterpolation(f7));
        org.telegram.ui.ActionBar.j5[] j5VarArr22 = this.r;
        layoutParams = (FrameLayout.LayoutParams) j5VarArr22[1].getLayoutParams();
        FrameLayout.LayoutParams layoutParams32 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        i11 = layoutParams.width;
        int ceil2 = (int) Math.ceil(lerp22);
        layoutParams.width = ceil2;
        layoutParams32.width = ceil2;
        if (i11 == layoutParams.width) {
        }
    }

    public final void l5(boolean z10) {
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
        sz0 sz0Var = this.u0;
        if (sz0Var != null) {
            float A = com.google.android.gms.internal.vision.e2.A(this.actionBar.getHeight(), f7, 2.0f, f7);
            boolean z11 = Math.abs(max - sz0Var.f0) > 0.1f || Math.abs(width - sz0Var.g0) > 0.1f || Math.abs(A - sz0Var.h0) > 0.1f;
            sz0Var.f0 = max;
            sz0Var.g0 = width;
            if (z10) {
                sz0Var.m0.d(width, true);
            }
            sz0Var.h0 = A;
            if (z11) {
                sz0Var.invalidate();
            }
        }
        zh.g0 g0Var = this.v0;
        if (g0Var != null) {
            float A2 = com.google.android.gms.internal.vision.e2.A(this.actionBar.getHeight(), f7, 2.0f, f7);
            int U3 = U3();
            boolean z12 = Math.abs(max - g0Var.r) > 0.1f || Math.abs(width - g0Var.s) > 0.1f || Math.abs(A2 - g0Var.v) > 0.1f;
            g0Var.r = max;
            g0Var.s = width;
            if (z10) {
                g0Var.y.d(width, true);
            }
            g0Var.v = A2;
            g0Var.x = U3 + A2;
            if (z12) {
                g0Var.invalidate();
            }
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
    public final void m5() {
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
        AndroidUtilities.updateViewVisibilityAnimated(this.Y0, z10, 0.8f, this.l5);
    }

    public final void n4(boolean z10) {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e1));
        if (user == null) {
            return;
        }
        int i10 = 4;
        int i11 = 0;
        if (this.r2 && !MessagesController.isSupportUser(user)) {
            if (!this.k1 || z10) {
                org.telegram.ui.Components.e5.s(this, false, this.E2, user, this.D2 != null, true, false, true, new ly0(this, user));
                return;
            } else {
                getMessagesController().unblockPeer(this.e1, new yb0(this, i10));
                finishFragment();
                return;
            }
        }
        if (this.k1) {
            getMessagesController().unblockPeer(this.e1);
            if (org.telegram.ui.Components.yc.a(this)) {
                org.telegram.ui.Components.yc.d(this, false).j();
                return;
            }
            return;
        }
        if (this.l1) {
            org.telegram.ui.Components.e5.j0(this, this.e1, user, null, this.D2, false, null, new va(this, i10), this.z0);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.z0);
        String string = LocaleController.getString(R.string.BlockUser);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new ky0(this, i11));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, this.z0));
        }
    }

    public final void n5(boolean z10) {
        boolean z11;
        TLRPC.ChatFull chatFull;
        float y3 = y3();
        int i10 = 1;
        this.H5 = y3 > 0.2f && !this.W1 && (this.q0 == null || this.O2 == -1);
        C3();
        org.telegram.ui.Components.aj0 aj0Var = this.v;
        if (aj0Var == null || aj0Var.getVisibility() == 8) {
            z11 = false;
        } else {
            this.v.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) + this.Q1) + this.T1) - AndroidUtilities.dp(29.5f));
            z11 = y3 > 0.2f && !this.W1 && !this.s1 && (this.q0 == null || this.O2 == -1);
            if (z11 && this.f1 != 0) {
                z11 = (!ChatObject.isChannel(this.E2) || this.E2.megagroup || (chatFull = this.u2) == null || chatFull.linked_chat_id == 0 || (this.D3 == -1 && this.E3 == -1)) ? false : true;
            }
            if (!this.G1) {
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
                            this.w.playTogether(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.aj0, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.aj0, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.aj0, Float>) View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.aj0, Float>) View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.aj0, Float>) View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.aj0, Float>) View.ALPHA, 0.0f));
                        }
                        this.w.setDuration(150L);
                        this.w.addListener(new c01(this, i10));
                        this.w.start();
                    } else {
                        this.v.setScaleX(z11 ? 1.0f : 0.2f);
                        this.v.setScaleY(z11 ? 1.0f : 0.2f);
                        this.v.setAlpha(z11 ? 1.0f : 0.0f);
                    }
                }
            }
        }
        sz0 sz0Var = this.u0;
        if (sz0Var != null) {
            float measuredWidth = this.Z.getMeasuredWidth() - AndroidUtilities.dp(40.0f);
            int i11 = this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            sz0Var.i0 = measuredWidth;
            sz0Var.k0 = z11;
            sz0Var.j0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i11;
            sz0Var.invalidate();
        }
        zh.g0 g0Var = this.v0;
        if (g0Var != null) {
            g0Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + this.Q1 + this.T1);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean needDelayOpenAnimation() {
        return this.J1 == 0;
    }

    public final void o4(boolean z10) {
        if (this.e1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e1));
            if (user != null) {
                TLRPC.UserFull userFull = this.v2;
                org.telegram.ui.Components.voip.d2.m(user, z10, userFull != null && userFull.video_calls_available, getParentActivity(), this.v2, getAccountInstance());
                return;
            }
            return;
        }
        if (this.f1 != 0) {
            if (getMessagesController().getGroupCall(this.f1, false) != null) {
                org.telegram.ui.Components.voip.d2.l(this.E2, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            TLRPC.Chat chat = this.E2;
            AccountInstance accountInstance = getAccountInstance();
            if (getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.w70.t(getParentActivity(), -chat.id, accountInstance, new org.telegram.ui.Components.s50(chat, this, accountInstance, 3));
        }
    }

    public final void o5() {
        org.telegram.ui.Components.nr0 nr0Var;
        org.telegram.ui.Components.ns0 ns0Var;
        org.telegram.ui.Components.d90 d90Var;
        int v02;
        this.R5.clear();
        o11 o11Var = this.d1;
        if (o11Var != null) {
            o11Var.a(this.Q5, true);
        }
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.r;
        org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[1];
        if (j5Var != null) {
            j5VarArr[1].setTextColor(i0.a.d(this.k2, w3(j5Var.getTag() instanceof Integer ? org.telegram.ui.ActionBar.j6.v0(((Integer) j5VarArr[1].getTag()).intValue(), this.z0) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, this.z0), Boolean.valueOf(this.J0[0])), -1275068417));
        }
        m11 m11Var = this.b6;
        if (m11Var != null) {
            m11Var.a(i0.a.d(this.k2, org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.b(0.18f, -0.1f, this.c1)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.C(i0.a.d(this.E5, this.Q5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, this.z0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y8, this.z0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            MessagesController.PeerColor peerColor = this.Q5;
            kVar2.B(i0.a.d(this.E5, peerColor != null ? 1090519039 : peerColor != null ? 553648127 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f8, this.z0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z8, this.z0)), false);
        }
        Drawable[] drawableArr = this.y;
        if (drawableArr[1] != null) {
            MessagesController.PeerColor peerColor2 = this.Q5;
            if (peerColor2 != null) {
                v02 = org.telegram.ui.ActionBar.j6.b(0.1f, org.telegram.ui.ActionBar.j6.I.q() ? -0.1f : -0.08f, i0.a.d(0.4f, peerColor2.getColor2(), this.Q5.hasColor6(org.telegram.ui.ActionBar.j6.I.q()) ? this.Q5.getColor5() : this.Q5.getColor3()));
            } else {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.z0);
            }
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(v02, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oi, this.z0), this.E5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        Drawable[] drawableArr2 = this.I;
        if (drawableArr2[1] != null) {
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(this.Q5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, this.z0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.z0), this.E5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f[1];
        if (j5Var2 != null) {
            j5Var2.setTextColor(i0.a.d(this.k2, i0.a.d(this.E5, this.Q5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vh, this.z0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oi, this.z0)), -1));
        }
        org.telegram.ui.Components.q8 q8Var = this.a1;
        if (q8Var != null && (d90Var = q8Var.e) != null) {
            d90Var.invalidate();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.Q5 == null ? i0.a.d(this.S1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pc, this.z0), -1) : -1, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.vh0 vh0Var = this.c0;
        if (vh0Var != null) {
            vh0Var.setColor(this.Q5);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.a, (e2.h) new sy0(this, 1));
        m01 m01Var = this.O;
        if (m01Var != null && (ns0Var = m01Var.I0) != null) {
            ns0Var.d();
        }
        m01 m01Var2 = this.O;
        if (m01Var2 != null && (nr0Var = m01Var2.V) != null) {
            nr0Var.m();
        }
        p5();
        X4();
        sz0 sz0Var = this.u0;
        if (sz0Var != null) {
            sz0Var.f(true, true);
        }
        zh.g0 g0Var = this.v0;
        if (g0Var != null) {
            g0Var.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.u40 u40Var = this.q0;
        if (u40Var != null) {
            u40Var.i(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.e(0, true);
        }
        super.onBecomeFullyHidden();
        this.X5 = false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        p5();
        this.X5 = true;
        F3();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        org.telegram.ui.Components.vh0 vh0Var;
        org.telegram.ui.Components.dh0 dh0Var;
        super.onConfigurationChanged(configuration);
        m01 m01Var = this.O;
        if (m01Var != null) {
            m01Var.onConfigurationChanged(configuration);
        }
        f4();
        if (this.n2 && (dh0Var = this.a0) != null) {
            dh0Var.i();
        }
        if (this.n2 && (vh0Var = this.c0) != null) {
            vh0Var.b();
        }
        if (this.n2 && this.p2 && (m10 = this.c.m(0)) != null) {
            this.a.scrollBy(0, m10.getTop() - T3());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new ei(this, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0884  */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        s11 s11Var;
        org.telegram.ui.ActionBar.v0 v0Var;
        Object obj;
        org.telegram.ui.ActionBar.z zVar;
        org.telegram.ui.ActionBar.v0 k10;
        org.telegram.ui.ActionBar.j5[] j5VarArr;
        float f7;
        zh.g0 g0Var;
        org.telegram.ui.ActionBar.v0 v0Var2;
        float f10;
        pz0 pz0Var;
        org.telegram.ui.Components.ch chVar;
        boolean z12;
        TLRPC.Chat chat;
        ox oxVar;
        if (!this.I0) {
            j5();
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
                org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
                int i10 = 2;
                if (d5Var != null && d5Var.getFragmentStack().size() >= 2) {
                    Object obj2 = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    if (obj2 instanceof org.telegram.ui.Components.ch) {
                        this.g5 = (org.telegram.ui.Components.ch) obj2;
                    }
                    if ((obj2 instanceof uy) && (oxVar = ((uy) obj2).F3) != null) {
                        vx vxVar = oxVar.a;
                        if (com.google.android.gms.internal.vision.e2.u(vxVar)) {
                            this.g5 = vxVar;
                        }
                    }
                }
                Object obj3 = this.g5;
                if (obj3 instanceof co) {
                    kVar = ((org.telegram.ui.ActionBar.n2) obj3).getActionBar();
                    kVar.setSkipDrawChild(true);
                } else {
                    kVar = null;
                }
                org.telegram.ui.Components.ch chVar2 = this.g5;
                boolean z13 = (chVar2 instanceof co) && ((co) chVar2).e != null;
                if (chVar2 != null) {
                    ImageView imageView5 = this.i0;
                    if (imageView5 != null) {
                        if (!(chVar2 instanceof co) || (chat = ((co) chVar2).e) == null || chat.linked_community_id == 0) {
                            imageView5.setTag(null);
                            this.i0.setVisibility(8);
                        } else {
                            imageView5.setTag(1);
                            this.i0.setVisibility(0);
                        }
                    }
                    if (this.l0 != null) {
                        org.telegram.ui.Components.ch chVar3 = this.g5;
                        if ((chVar3 instanceof co) && ChatObject.isMonoForum(((co) chVar3).e)) {
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
                    k5();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(this.J1 == 2 ? 250L : 180L);
                this.a.setLayerType(2, null);
                org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
                if (n10.k(10) == null && this.P0 == null) {
                    this.P0 = n10.a(10, R.drawable.ic_ab_other);
                }
                org.telegram.ui.ActionBar.j5[] j5VarArr2 = this.f;
                org.telegram.ui.ActionBar.j5[] j5VarArr3 = this.r;
                if (z10) {
                    this.O5 = 0.0f;
                    int i11 = 0;
                    while (i11 < 2) {
                        i11++;
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j5VarArr3[i11].getLayoutParams();
                        layoutParams.rightMargin = (int) ((AndroidUtilities.density * (-21.0f)) + AndroidUtilities.dp(8.0f));
                        j5VarArr3[i11].setLayoutParams(layoutParams);
                    }
                    if (this.J1 != 2) {
                        int ceil = (int) Math.ceil((AndroidUtilities.density * 21.0f) + (AndroidUtilities.displaySize.x - AndroidUtilities.dp(117.0f)));
                        float measureText = (j5VarArr2[1].getPaint().measureText(j5VarArr2[1].getText().toString()) * 1.12f) + j5VarArr2[1].getSideDrawablesSize();
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) j5VarArr2[1].getLayoutParams();
                        if (ceil < measureText) {
                            j5VarArr = j5VarArr2;
                            layoutParams2.width = (int) Math.ceil(r5 / 1.12f);
                        } else {
                            j5VarArr = j5VarArr2;
                            layoutParams2.width = -2;
                        }
                        j5VarArr[1].setLayoutParams(layoutParams2);
                        this.R1 = T3();
                    } else {
                        j5VarArr = j5VarArr2;
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) j5VarArr[1].getLayoutParams();
                        layoutParams3.width = (int) ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(32.0f)) / 1.38f);
                        j5VarArr[1].setLayoutParams(layoutParams3);
                    }
                    this.fragmentView.setBackgroundColor(0);
                    setAvatarAnimationProgress(0.0f);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 0.0f, 1.0f));
                    org.telegram.ui.Components.aj0 aj0Var = this.v;
                    if (aj0Var != null && aj0Var.getTag() == null) {
                        this.v.setScaleX(0.2f);
                        this.v.setScaleY(0.2f);
                        this.v.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.aj0, Float>) View.SCALE_X, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.aj0, Float>) View.SCALE_Y, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.aj0, Float>) View.ALPHA, 1.0f));
                    }
                    sz0 sz0Var = this.u0;
                    if (sz0Var != null && this.J1 == 2) {
                        sz0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.u0, (Property<sz0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.J1 == 2) {
                        this.r0 = P3(this.e0.getImageReceiver());
                        j5VarArr[1].setTextColor(-1);
                        j5VarArr3[1].setTextColor(-1275068417);
                        this.actionBar.B(1090519039, false);
                        m11 m11Var = this.b6;
                        if (m11Var != null) {
                            m11Var.a(603979775);
                        }
                        b11 b11Var = this.N;
                        b11Var.E = true;
                        b11Var.setVisibility(0);
                    }
                    int i12 = 0;
                    while (i12 < 2) {
                        j5VarArr[i12].setAlpha(i12 == 0 ? 1.0f : 0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(j5VarArr[i12], (Property<org.telegram.ui.ActionBar.j5, Float>) View.ALPHA, i12 == 0 ? 0.0f : 1.0f));
                        i12++;
                    }
                    if (this.u0 != null) {
                        if (a() > 0) {
                            this.u0.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.u0, (Property<sz0, Float>) View.ALPHA, 1.0f));
                        } else {
                            f7 = 1.0f;
                            this.u0.setAlpha(1.0f);
                            this.u0.setFragmentTransitionProgress(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.u0, "fragmentTransitionProgress", 1.0f));
                            g0Var = this.v0;
                            if (g0Var != null) {
                                g0Var.setAlpha(0.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.v0, (Property<zh.g0, Float>) View.ALPHA, f7));
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
                            v0Var2 = this.P0;
                            if (v0Var2 != null) {
                                v0Var2.setAlpha(1.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 0.0f));
                            }
                            if (this.L0 && (this.f1 != 0 || z13)) {
                                this.Q0.setAlpha(0.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 1.0f));
                            }
                            if (this.M0) {
                                this.R0.setAlpha(0.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 1.0f));
                            }
                            if (this.N0) {
                                this.S0.setAlpha(0.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 1.0f));
                            }
                            if (this.Y0.getTag() == null) {
                                this.Y0.setAlpha(0.0f);
                                f10 = 1.0f;
                                arrayList.add(ObjectAnimator.ofFloat(this.Y0, (Property<ImageView, Float>) View.ALPHA, 1.0f));
                            } else {
                                f10 = 1.0f;
                            }
                            pz0Var = this.e0;
                            if (pz0Var != null) {
                                pz0Var.setCrossfadeProgress(f10);
                                arrayList.add(ObjectAnimator.ofFloat(this.e0, n01.g0, 0.0f));
                            }
                            chVar = this.g5;
                            if (chVar == null) {
                                org.telegram.ui.Components.co n11 = chVar.n();
                                if (n11 != null) {
                                    org.telegram.ui.Components.yn ynVar = n11.e;
                                    org.telegram.ui.Components.ov0 y3 = this.g5.y();
                                    RectF rectF = ih.k.h;
                                    ih.k.c(ynVar, y3, rectF);
                                    this.O5 = rectF.left;
                                }
                                if ((n11 == null || !(n11.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.j5) || ((org.telegram.ui.ActionBar.j5) n11.getSubtitleTextView()).getLeftDrawable() == null) && !n11.S[0]) {
                                    z12 = false;
                                } else {
                                    this.W4 = n11.getSubtitleTextView();
                                    this.Z.invalidate();
                                    j5VarArr3[0].setAlpha(0.0f);
                                    j5VarArr3[1].setAlpha(0.0f);
                                    arrayList.add(ObjectAnimator.ofFloat(j5VarArr3[1], (Property<org.telegram.ui.ActionBar.j5, Float>) View.ALPHA, 1.0f));
                                    z12 = true;
                                }
                                setAvatarAnimationProgress(0.0f);
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                int i13 = 0;
                                while (i13 < 2) {
                                    j5VarArr3[i13].setAlpha(i13 == 0 ? 1.0f : 0.0f);
                                    arrayList.add(ObjectAnimator.ofFloat(j5VarArr3[i13], (Property<org.telegram.ui.ActionBar.j5, Float>) View.ALPHA, i13 == 0 ? 0.0f : 1.0f));
                                    i13++;
                                }
                            }
                            animatorSet.playTogether(arrayList);
                        }
                    }
                    f7 = 1.0f;
                    g0Var = this.v0;
                    if (g0Var != null) {
                    }
                    if (this.h0.getTag() != null) {
                    }
                    if (this.i0.getTag() != null) {
                    }
                    if (this.k0.getTag() != null) {
                    }
                    if (this.j0.getTag() != null) {
                    }
                    v0Var2 = this.P0;
                    if (v0Var2 != null) {
                    }
                    if (this.L0) {
                        this.Q0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.M0) {
                    }
                    if (this.N0) {
                    }
                    if (this.Y0.getTag() == null) {
                    }
                    pz0Var = this.e0;
                    if (pz0Var != null) {
                    }
                    chVar = this.g5;
                    if (chVar == null) {
                    }
                    if (!z12) {
                    }
                    animatorSet.playTogether(arrayList);
                } else {
                    this.R1 = this.Q1;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 1.0f, 0.0f));
                    org.telegram.ui.Components.aj0 aj0Var2 = this.v;
                    if (aj0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(aj0Var2, (Property<org.telegram.ui.Components.aj0, Float>) View.SCALE_X, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.aj0, Float>) View.SCALE_Y, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.aj0, Float>) View.ALPHA, 0.0f));
                    }
                    int i14 = 0;
                    while (i14 < 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(j5VarArr2[i14], (Property<org.telegram.ui.ActionBar.j5, Float>) View.ALPHA, i14 == 0 ? 1.0f : 0.0f));
                        i14++;
                    }
                    sz0 sz0Var2 = this.u0;
                    if (sz0Var2 != null) {
                        if (this.i1 > 0) {
                            arrayList2.add(ObjectAnimator.ofFloat(sz0Var2, (Property<sz0, Float>) View.ALPHA, 0.0f));
                        } else {
                            arrayList2.add(ObjectAnimator.ofFloat(sz0Var2, "fragmentTransitionProgress", 0.0f));
                        }
                    }
                    zh.g0 g0Var2 = this.v0;
                    if (g0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(g0Var2, (Property<zh.g0, Float>) View.ALPHA, 0.0f));
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
                    org.telegram.ui.ActionBar.v0 v0Var3 = this.P0;
                    if (v0Var3 != null) {
                        v0Var3.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.P0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.L0 && (this.f1 != 0 || z13)) {
                        this.Q0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.M0) {
                        this.R0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.R0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.N0) {
                        this.S0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.S0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, 0.0f));
                    }
                    ImageView imageView6 = this.Y0;
                    if (imageView6 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) View.ALPHA, imageView6.getAlpha(), 0.0f));
                    }
                    pz0 pz0Var2 = this.e0;
                    if (pz0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(pz0Var2, n01.g0, 1.0f));
                    }
                    org.telegram.ui.ActionBar.n2 n2Var = this.parentLayout.getFragmentStack().size() > 1 ? (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) : null;
                    if (n2Var instanceof co) {
                        co coVar = (co) n2Var;
                        pj pjVar = coVar.a1;
                        AndroidUtilities.doOnPreDraw(pjVar, new pf0(this, pjVar, coVar, 24));
                        View subtitleTextView = pjVar.getSubtitleTextView();
                        if (((subtitleTextView instanceof org.telegram.ui.ActionBar.j5) && ((org.telegram.ui.ActionBar.j5) subtitleTextView).getLeftDrawable() != null) || pjVar.S[0]) {
                            this.W4 = pjVar.getSubtitleTextView();
                            this.Z.invalidate();
                            org.telegram.ui.ActionBar.j5 j5Var = j5VarArr3[0];
                            Property property = View.ALPHA;
                            arrayList2.add(ObjectAnimator.ofFloat(j5Var, (Property<org.telegram.ui.ActionBar.j5, Float>) property, 0.0f));
                            arrayList2.add(ObjectAnimator.ofFloat(j5VarArr3[1], (Property<org.telegram.ui.ActionBar.j5, Float>) property, 0.0f));
                            z11 = true;
                            if (!z11) {
                                int i15 = 0;
                                while (i15 < 2) {
                                    arrayList2.add(ObjectAnimator.ofFloat(j5VarArr3[i15], (Property<org.telegram.ui.ActionBar.j5, Float>) View.ALPHA, i15 == 0 ? 1.0f : 0.0f));
                                    i15++;
                                }
                            }
                            animatorSet.playTogether(arrayList2);
                            s11Var = this.c6;
                            if (s11Var != null) {
                                s11Var.animate().alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.pr.h).start();
                            }
                        }
                    }
                    z11 = false;
                    if (!z11) {
                    }
                    animatorSet.playTogether(arrayList2);
                    s11Var = this.c6;
                    if (s11Var != null) {
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new py0(this, i10));
                animatorSet.playTogether(ofFloat);
                if (this.O0 == null || (obj = this.g5) == null || (zVar = ((org.telegram.ui.ActionBar.n2) obj).getActionBar().E) == null || (k10 = zVar.k(32)) == null || k10.getVisibility() != 0) {
                    v0Var = null;
                } else {
                    k10.setAlpha(0.0f);
                    if (z10) {
                        this.O0.setVisibility(0);
                    }
                    this.O0.setTag(k10);
                    v0Var = k10;
                }
                animatorSet.addListener(new hg.k0(this, kVar, v0Var, runnable, 5));
                animatorSet.setInterpolator(this.J1 == 2 ? org.telegram.ui.Components.pr.f : new DecelerateInterpolator());
                AndroidUtilities.runOnUIThread(new lu0(animatorSet, 4), 50L);
                return animatorSet;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onDialogDismiss(Dialog dialog) {
        gz0 gz0Var = this.a;
        if (gz0Var != null) {
            gz0Var.e1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x044f  */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        long clientUserId;
        org.telegram.ui.Components.pu0 pu0Var;
        a11 a11Var;
        this.e1 = this.arguments.getLong("user_id", 0L);
        this.f1 = this.arguments.getLong("chat_id", 0L);
        this.g1 = this.arguments.getLong("topic_id", 0L);
        this.h1 = this.arguments.getBoolean("saved", false);
        this.r1 = this.arguments.getBoolean("similar", false);
        this.q1 = this.g1 != 0;
        this.E1 = this.arguments.getLong("ban_chat_id", 0L);
        this.Z4 = this.arguments.getInt("report_reaction_message_id", 0);
        this.a5 = this.arguments.getLong("report_reaction_from_dialog_id", 0L);
        this.c5 = this.arguments.getBoolean("show_add_to_contacts", true);
        this.d5 = gf.b.d(this.arguments.getString("vcard_phone"), false);
        this.e5 = this.arguments.getString("vcard_first_name");
        this.f5 = this.arguments.getString("vcard_last_name");
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
                    getMessagesStorage().getStorageQueue().postRunnable(new rx0(9, this, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
                    R3(true);
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
                h5(true);
                if (this.u2 == null) {
                    this.u2 = getMessagesController().getChatFull(this.f1);
                }
                if (ChatObject.isChannel(this.E2)) {
                    getMessagesController().loadFullChat(this.f1, this.classGuid, true);
                } else if (this.u2 == null) {
                    this.u2 = getMessagesStorage().loadChatInfo(this.f1, false, null, false, false);
                }
                a5();
                clientUserId = getUserConfig().getClientUserId();
                if (this.e1 != clientUserId) {
                }
                this.s1 = true;
                pu0Var = this.R;
                if (pu0Var != null) {
                    pu0Var.b(this);
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
                j5();
                a11Var = this.d;
                if (a11Var != null) {
                }
                if (this.arguments.containsKey("preload_messages")) {
                }
                if (this.e1 != 0) {
                    getConnectionsManager().sendRequest(new TL_account.getPassword(), new ty0(this, 5));
                }
                setBulletinDelegate(new z8(this, 8));
                if (this.e1 != 0) {
                    getMessagesController().getContentSettings(null);
                }
                I4();
                this.j6 = !this.I0 ? AndroidUtilities.dp(72.0f) : 0;
                this.k6 = this.I0 ? AndroidUtilities.dp(64.0f) : 0;
                return true;
            }
            return false;
        }
        long j3 = this.arguments.getLong("dialog_id", 0L);
        this.i1 = j3;
        if (j3 != 0) {
            this.D2 = org.telegram.messenger.w1.m(getMessagesController(), this.i1);
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
                long j10 = user.id;
                mediaDataController.loadBotInfo(j10, j10, true, this.classGuid);
            }
            this.v2 = getMessagesController().getUserFull(this.e1);
            getMessagesController().loadFullUser(getMessagesController().getUser(Long.valueOf(this.e1)), this.classGuid, true);
            this.C1 = null;
            if (UserObject.isUserSelf(user)) {
                org.telegram.ui.Components.u40 u40Var = new org.telegram.ui.Components.u40(0, true, true);
                this.q0 = u40Var;
                u40Var.H = true;
                u40Var.a = this;
                u40Var.b = this;
                getMediaDataController().checkFeaturedStickers();
                getMessagesController().loadSuggestedFilters();
                getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, this.classGuid);
            }
            this.X4 = this.arguments.getInt("actionBarColor", 0);
            clientUserId = getUserConfig().getClientUserId();
            if ((this.e1 != clientUserId || this.i1 == clientUserId) && !this.s1) {
                this.s1 = true;
            }
            pu0Var = this.R;
            if (pu0Var != null && pu0Var.s != this.g1) {
                pu0Var.b(this);
                this.R = null;
            }
            if (this.R == null) {
                this.R = new org.telegram.ui.Components.pu0(this);
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
            j5();
            a11Var = this.d;
            if (a11Var != null) {
                a11Var.l();
            }
            if (this.arguments.containsKey("preload_messages")) {
                getMessagesController().ensureMessagesLoaded(this.e1, 0, null);
            }
            if (this.e1 != 0 && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(this.e1)))) {
                getConnectionsManager().sendRequest(new TL_account.getPassword(), new ty0(this, 5));
            }
            setBulletinDelegate(new z8(this, 8));
            if (this.e1 != 0 && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(this.e1))) && !this.s1) {
                getMessagesController().getContentSettings(null);
            }
            I4();
            this.j6 = !this.I0 ? AndroidUtilities.dp(72.0f) : 0;
            this.k6 = this.I0 ? AndroidUtilities.dp(64.0f) : 0;
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        m01 m01Var = this.O;
        if (m01Var != null) {
            m01Var.F0();
        }
        org.telegram.ui.Components.pu0 pu0Var = this.R;
        if (pu0Var != null) {
            pu0Var.b(this);
        }
        org.telegram.ui.Components.pu0 pu0Var2 = this.R;
        if (pu0Var2 != null) {
            pu0Var2.x.remove(this);
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
        qz0 qz0Var = this.n0;
        if (qz0Var != null) {
            qz0Var.K();
        }
        org.telegram.ui.Components.fh0 fh0Var = this.m0;
        if (fh0Var != null) {
            fh0Var.e();
        }
        this.J5 = null;
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
        pz0 pz0Var = this.e0;
        if (pz0Var != null) {
            pz0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.u40 u40Var = this.q0;
        if (u40Var != null) {
            u40Var.e();
        }
        uz0 uz0Var = this.V4;
        if (uz0Var != null) {
            uz0Var.b();
        }
        p11 p11Var = this.y2;
        if (p11Var != null && this.x2) {
            p11Var.b(true);
            this.y2 = null;
        }
        org.telegram.messenger.t8 t8Var = this.x5;
        if (t8Var != null) {
            this.x5 = null;
            AndroidUtilities.runOnUIThread(t8Var);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        org.telegram.ui.Components.dt0 dt0Var;
        super.onPause();
        UndoView undoView = this.M;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.u40 u40Var = this.q0;
        if (u40Var != null) {
            u40Var.j();
        }
        FlagSecureReason flagSecureReason = this.X1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        m01 m01Var = this.O;
        if (m01Var == null || (dt0Var = m01Var.T) == null) {
            return;
        }
        dt0Var.e = false;
        if (dt0Var.c != null) {
            dt0Var.a.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.u40 u40Var = this.q0;
        if (u40Var != null) {
            u40Var.k(i10, strArr, iArr);
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
                org.telegram.ui.Components.voip.d2.h(getParentActivity(), null, i10);
                return;
            } else {
                org.telegram.ui.Components.voip.d2.l(this.E2, null, getMessagesController().getGroupCall(this.f1, false) == null, null, getParentActivity(), this, getAccountInstance());
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
            org.telegram.ui.Components.voip.d2.h(getParentActivity(), null, i10);
            return;
        }
        boolean z12 = i10 == 102;
        TLRPC.UserFull userFull = this.v2;
        org.telegram.ui.Components.voip.d2.m(user, z12, userFull != null && userFull.video_calls_available, getParentActivity(), this.v2, getAccountInstance());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        TLRPC.User user;
        t50 t50Var;
        super.onResume();
        m01 m01Var = this.O;
        if (m01Var != null) {
            m01Var.b1 = true;
            org.telegram.ui.Components.ct0 ct0Var = m01Var.H;
            if (ct0Var != null) {
                ct0Var.l();
            }
            org.telegram.ui.Components.ku0 ku0Var = m01Var.K;
            if (ku0Var != null) {
                ku0Var.l();
            }
            org.telegram.ui.Components.lu0 lu0Var = m01Var.J;
            if (lu0Var != null) {
                lu0Var.X(false);
            }
            for (int i10 = 0; i10 < m01Var.k0.length; i10++) {
                m01Var.U(i10);
            }
            org.telegram.ui.Components.dt0 dt0Var = m01Var.T;
            if (dt0Var != null) {
                dt0Var.e = true;
                if (dt0Var.c != null) {
                    dt0Var.a.onResume();
                }
            }
        }
        f4();
        a11 a11Var = this.d;
        if (a11Var != null) {
            this.T4 = true;
            a11Var.l();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (t50Var = this.U) != null && t50Var.getVisibility() == 0) {
            this.U.setVisibility(8);
            this.U.setBackground(null);
        }
        org.telegram.ui.Components.u40 u40Var = this.q0;
        if (u40Var != null) {
            u40Var.l();
            setParentActivityTitle(LocaleController.getString(R.string.Settings));
        }
        i5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new ei(this, 5));
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.f[1];
        if (j5Var != null) {
            setParentActivityTitle(j5Var.getText());
        }
        if (this.e1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.e1))) != null && user.photo == null && this.Q1 >= T3()) {
            this.j2.cancel();
            float[] fArr = this.m2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            J4(1.0f);
            this.n0.setVisibility(8);
            this.Q1 = T3();
            this.o2 = false;
            this.c.h1(0, T3() - this.a.getPaddingTop());
        }
        FlagSecureReason flagSecureReason = this.X1;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        c5();
        k4(false);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (!z11) {
                int i10 = this.J1;
                if (i10 != 0 && this.M1) {
                    if (i10 == 1) {
                        this.k2 = 0.0f;
                        org.telegram.ui.Components.hw0 hw0Var = this.T;
                        if (hw0Var != null) {
                            hw0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.dh0 dh0Var = this.a0;
                        if (dh0Var != null) {
                            dh0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.vh0 vh0Var = this.c0;
                        if (vh0Var != null) {
                            vh0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.G1 = false;
                    A3();
                    if (this.I1) {
                        D3(true);
                    }
                }
                if (!this.l5) {
                    this.l5 = true;
                    this.U4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().onAnimationFinish(this.P4);
            t50 t50Var = this.U;
            if (t50Var != null && t50Var.getVisibility() == 0) {
                this.U.setVisibility(8);
                this.U.setBackground(null);
            }
        }
        this.H1 = false;
        B3();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        t50 t50Var = this.U;
        if (t50Var == null || t50Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.U.setAlpha(1.0f - f7);
        } else {
            this.U.setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        ImageView imageView;
        org.telegram.ui.Components.dh0 dh0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.M5 = z10;
        if (z10 && (dh0Var = this.a0) != null) {
            ArrayList arrayList = dh0Var.a;
            if (dh0Var.H == 6) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.ui.Components.ah0 ah0Var = (org.telegram.ui.Components.ah0) arrayList.get(i10);
                    org.telegram.ui.Components.xi0 xi0Var = ah0Var.k;
                    if (xi0Var != null) {
                        if (ah0Var.a == 15) {
                            xi0Var.K(14);
                        } else {
                            xi0Var.K(0);
                        }
                        ah0Var.k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.O0) != null && imageView.getTag() != null && (this.O0.getTag() instanceof org.telegram.ui.ActionBar.v0)) {
            ((org.telegram.ui.ActionBar.v0) this.O0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.J1 != 0 && this.M1 && !this.p2) {
            this.G1 = true;
            if (!z10) {
                if (this.J5 == null) {
                    this.J5 = new float[16];
                }
                this.F1 = this.Q1;
                this.J5[0] = this.Y.getScaleX();
                this.J5[1] = this.Y.getTranslationX();
                this.J5[2] = this.Y.getTranslationY();
                org.telegram.ui.Components.dh0 dh0Var2 = this.a0;
                if (dh0Var2 != null) {
                    this.J5[3] = dh0Var2.getAlpha();
                }
                zh.g0 g0Var = this.v0;
                if (g0Var != null) {
                    float[] fArr = this.J5;
                    fArr[4] = g0Var.e;
                    fArr[5] = g0Var.f;
                }
                if (this.b6 != null) {
                    this.J5[6] = r3.getAlpha();
                }
                float[] fArr2 = this.J5;
                org.telegram.ui.ActionBar.j5[] j5VarArr = this.f;
                fArr2[7] = j5VarArr[1].getScaleX();
                this.J5[8] = j5VarArr[1].getTranslationY();
                float[] fArr3 = this.J5;
                org.telegram.ui.ActionBar.j5[] j5VarArr2 = this.r;
                fArr3[9] = j5VarArr2[1].getTranslationY();
                this.J5[10] = j5VarArr[1].getLayoutParams().width;
                this.J5[11] = this.c2;
                for (int i11 = 0; i11 < j5VarArr.length; i11++) {
                    org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[i11];
                    if (j5Var != null) {
                        int i12 = i11 * 2;
                        this.J5[i12 + 12] = j5Var.getTranslationX();
                        this.J5[i12 + 13] = j5VarArr2[i11].getTranslationX();
                    }
                }
                di.f4 f4Var = this.d6;
                if (f4Var != null) {
                    f4Var.e(true);
                }
            }
        }
        if (z10) {
            if (this.q0 != null) {
                this.P4 = getNotificationCenter().setAnimationInProgress(this.P4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.needCheckSystemBarColors});
            } else {
                this.P4 = getNotificationCenter().setAnimationInProgress(this.P4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.needCheckSystemBarColors});
            }
            if (!z11 && getParentActivity() != null) {
                this.Y4 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.H1 = true;
        B3();
    }

    @Override // org.telegram.ui.Components.jt0
    public final boolean p() {
        return this.M5;
    }

    public final void p4() {
        TLRPC.UserFull userFull = this.v2;
        if (userFull == null || !UserObject.areGiftsDisabled(userFull)) {
            if (this.E2 != null) {
                org.telegram.ui.Components.j40.h.a();
            }
            showDialog(new yh.p1(getParentActivity(), this.currentAccount, a(), null, null));
        } else {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                org.telegram.ui.Components.yc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(a())))).j();
            }
        }
    }

    public final void p5() {
        if (this.v == null) {
            return;
        }
        try {
            Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.xh, this.z0);
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.yh, this.z0);
            int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wh, this.z0);
            if (this.Q5 != null && org.telegram.ui.ActionBar.j6.b1(v02)) {
                v02 = org.telegram.ui.ActionBar.j6.b(0.05f, -0.04f, this.Q5.getBgColor1(false));
                MessagesController.PeerColor peerColor = this.Q5;
                if (peerColor != null) {
                    int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q());
                    v03 = org.telegram.ui.ActionBar.j6.C(org.telegram.ui.ActionBar.j6.I.q(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, this.z0), bgColor2, v03, bgColor2);
                }
                v04 = -1;
            }
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(mutate, org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(56.0f), v02, v03), 0, 0);
            int dp = AndroidUtilities.dp(56.0f);
            int dp2 = AndroidUtilities.dp(56.0f);
            oqVar.e = dp;
            oqVar.f = dp2;
            this.v.setBackground(oqVar);
            this.v.setColorFilter(new PorterDuffColorFilter(v04, mode));
        } catch (Exception unused) {
        }
    }

    public final void q4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().addUserToChat(this.E2.id, getUserConfig().getCurrentUser(), 0, null, this, true, new dm0(this, z10, zArr, 5), new ca.b(this, zArr, z10, this.parentLayout.getLastFragment(), 6));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
    }

    @Override // org.telegram.ui.dh0
    public final void r() {
        this.a.x0(0);
    }

    public final void r4(View view, float f7, float f10, boolean z10) {
        float f11;
        float f12;
        long j3;
        long j10 = this.i1;
        if (j10 == 0) {
            j10 = this.e1;
            if (j10 == 0) {
                j10 = -this.f1;
            }
        }
        long j11 = j10;
        boolean isDialogMuted = getMessagesController().isDialogMuted(j11, this.g1);
        if (z10 && (this.q1 || isDialogMuted)) {
            boolean z11 = !isDialogMuted;
            getNotificationsController().muteDialog(j11, this.g1, z11);
            org.telegram.ui.Components.yc.A(this, z11, null).j();
            a5();
            this.a0.setNotifications(isDialogMuted);
            return;
        }
        if ((z10 || !LocaleController.isRTL || f7 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f7 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(getParentActivity(), this.currentAccount, null, true, new e6.n(this, j11, 5), this.z0);
            ooVar.d(j11, this.g1, this.h5);
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
            ooVar.c(this, view, f11, f12, z10);
            return;
        }
        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
        boolean z12 = i5Var.e.h;
        boolean z13 = !z12;
        boolean isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j11, false, false);
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, this.g1);
        if (z12) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            if (isGlobalNotificationsEnabled) {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey, 2);
                j3 = 1;
            } else {
                edit.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                j3 = 0L;
            }
            getNotificationsController().removeNotificationsForDialog(j11);
            if (this.g1 == 0) {
                getMessagesStorage().setDialogFlags(j11, j3);
                TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j11);
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
                getMessagesStorage().setDialogFlags(j11, 0L);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j11);
                if (dialog2 != null) {
                    dialog2.notify_settings = new TLRPC.TL_peerNotifySettings();
                }
            }
            edit2.apply();
        }
        a5();
        getNotificationsController().updateServerNotificationsSettings(j11, this.g1);
        i5Var.setChecked(z13);
        g5(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.u40 u40Var = this.q0;
        if (u40Var != null) {
            u40Var.f = bundle.getString("path");
        }
    }

    public final void s4() {
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.u40 u40Var = this.q0;
        if (u40Var == null || (str = u40Var.f) == null) {
            return;
        }
        bundle.putString("path", str);
    }

    public void setAvatarAnimationProgress(float f7) {
        int v02;
        int v03;
        int v04;
        this.k2 = f7;
        this.S1 = f7;
        B3();
        if (this.J1 == 2) {
            this.e0.setProgressToExpand(f7);
            org.telegram.ui.Components.dh0 dh0Var = this.a0;
            if (dh0Var != null) {
                dh0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.vh0 vh0Var = this.c0;
            if (vh0Var != null) {
                vh0Var.setParentExpanded(f7);
            }
            org.telegram.ui.Components.hw0 hw0Var = this.T;
            if (hw0Var != null) {
                hw0Var.setParentExpanded(f7);
            }
            S4();
            f5();
        }
        this.a.setAlpha(f7);
        this.a.setTranslationX(AndroidUtilities.dp(48.0f) - (AndroidUtilities.dp(48.0f) * f7));
        if (this.J1 != 2 || (v02 = this.r0) == 0) {
            if (this.e1 == 0 && ChatObject.isChannel(this.f1, this.currentAccount)) {
                boolean z10 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.z0;
            int[][] iArr = org.telegram.ui.Components.i9.C;
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var);
        }
        int i10 = this.X4;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, this.z0);
        }
        this.d1.setBackgroundColor(i0.a.d(f7, i0.a.k(i10, 0), v02));
        org.telegram.ui.Components.u11 u11Var = this.l0;
        int d = i0.a.d(f7, i10, v02);
        u11Var.k = true;
        u11Var.b.setColor(d);
        if (this.Q5 != null) {
            v03 = -1;
        } else {
            if (this.e1 == 0 && ChatObject.isChannel(this.f1, this.currentAccount)) {
                boolean z11 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.f6 f6Var2 = this.z0;
            int[][] iArr2 = org.telegram.ui.Components.i9.C;
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.g8, f6Var2);
        }
        this.actionBar.C(i0.a.d(this.S1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, this.z0), v03), false);
        int v05 = this.Q5 == null ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vh, this.z0) : -1;
        int v06 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, this.z0);
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.ActionBar.j5 j5Var = this.f[i11];
            if (j5Var != null && (i11 != 1 || this.J1 != 2)) {
                j5Var.setTextColor(i0.a.d(f7, v06, v05));
            }
        }
        boolean[] zArr = this.J0;
        if (zArr[0]) {
            v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Bh, this.z0);
        } else {
            if (this.e1 == 0 && ChatObject.isChannel(this.f1, this.currentAccount)) {
                boolean z12 = this.E2.megagroup;
            }
            org.telegram.ui.ActionBar.f6 f6Var3 = this.z0;
            int[][] iArr3 = org.telegram.ui.Components.i9.C;
            v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h8, f6Var3);
        }
        int v07 = org.telegram.ui.ActionBar.j6.v0(zArr[0] ? org.telegram.ui.ActionBar.j6.pa : org.telegram.ui.ActionBar.j6.B8, this.z0);
        int i12 = 0;
        while (i12 < 3) {
            org.telegram.ui.ActionBar.j5 j5Var2 = this.r[i12];
            if (j5Var2 != null && i12 != 1 && (i12 != 2 || this.J1 != 2)) {
                j5Var2.setTextColor(i0.a.d(f7, i12 == 0 ? v07 : w3(v07, Boolean.valueOf(zArr[0])), i12 == 0 ? v04 : w3(v04, Boolean.valueOf(zArr[0]))));
            }
            i12++;
        }
        this.Q1 = this.R1 * f7;
        long j3 = this.e1;
        if (j3 == 0) {
            j3 = this.f1;
        }
        org.telegram.ui.ActionBar.f6 f6Var4 = this.z0;
        int[][] iArr4 = org.telegram.ui.Components.i9.C;
        int v08 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.i9.e(j3)], f6Var4);
        long j10 = this.e1;
        if (j10 == 0) {
            j10 = this.f1;
        }
        int d10 = org.telegram.ui.Components.i9.d(j10);
        if (v08 != d10) {
            this.p0.h(i0.a.d(f7, d10, v08));
            this.e0.invalidate();
        }
        int i13 = this.Y4;
        if (i13 != 0) {
            setNavigationBarColor(i0.a.d(f7, i13, getNavigationBarColor()));
        }
        this.d1.invalidate();
        k4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        v01 v01Var = this.N5;
        if (v01Var != null) {
            v01Var.invalidate();
        }
        if (a() > 0) {
            pz0 pz0Var = this.e0;
            if (pz0Var != null) {
                pz0Var.setProgressToStoriesInsets(this.S1);
            }
            sz0 sz0Var = this.u0;
            if (sz0Var != null) {
                sz0Var.setProgressToStoriesInsets(this.S1);
            }
            zh.g0 g0Var = this.v0;
            if (g0Var != null) {
                g0Var.setProgressToStoriesInsets(this.S1);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setParentLayout(org.telegram.ui.ActionBar.d5 d5Var) {
        super.setParentLayout(d5Var);
        FlagSecureReason flagSecureReason = this.X1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
            this.X1 = null;
        }
        if (d5Var == null || d5Var.getParentActivity() == null) {
            return;
        }
        this.X1 = new FlagSecureReason(d5Var.getParentActivity().getWindow(), new ky0(this, 6));
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ boolean t() {
        return false;
    }

    public final void t4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.L3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.f1);
            bundle.putLong("user_id", this.e1);
            presentFragment(new g31(bundle));
            return;
        }
        if (view2.getTag() == null || ((Integer) view2.getTag()).intValue() != this.U2) {
            return;
        }
        if (this.e1 == getUserConfig().getClientUserId()) {
            presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
        } else if (UserObject.areGiftsDisabled(this.v2)) {
            org.telegram.ui.Components.yc.a0(this).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.e1)))).j();
        } else {
            showDialog(new yh.p1(getParentActivity(), this.currentAccount, this.e1, null, null));
        }
    }

    @Override // org.telegram.ui.oy
    public final boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle i12 = a4.a.i("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j3)) {
            i12.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
        } else if (DialogObject.isUserDialog(j3)) {
            i12.putLong("user_id", j3);
        } else if (DialogObject.isChatDialog(j3)) {
            i12.putLong("chat_id", -j3);
        }
        if (!getMessagesController().checkCanOpenChat(i12, uyVar)) {
            return false;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i13 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i13);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i13, new Object[0]);
        presentFragment(new co(i12), true);
        removeSelfFromStack();
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(getMessagesController().getUser(Long.valueOf(this.e1)), j3, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z11, i10, i11));
        if (!TextUtils.isEmpty(charSequence)) {
            SendMessagesHelper.prepareSendingText(AccountInstance.getInstance(this.currentAccount), charSequence, j3, z11, i10, i11, 0L);
        }
        return true;
    }

    public final void u4() {
        org.telegram.ui.Components.xi0 xi0Var;
        if (this.e1 == 0) {
            y4();
            return;
        }
        if (this.q0 == null) {
            x4();
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.u40 u40Var = this.q0;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        u40Var.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new yb0(this, 24), new r5(this, 14), 0);
        this.V.K(0);
        this.V.N(43);
        this.W.K(0);
        this.W.N(43);
        org.telegram.ui.Components.dh0 dh0Var = this.a0;
        if (dh0Var != null) {
            org.telegram.ui.Components.ah0 j3 = org.telegram.ui.Components.dh0.j(14, dh0Var.a);
            if (j3 != null && (xi0Var = j3.k) != null) {
                xi0Var.start();
            }
        } else {
            this.v.d();
        }
        org.telegram.ui.Cells.r8 r8Var = this.M2;
        if (r8Var != null) {
            r8Var.getImageView().d();
        }
    }

    public final CharSequence v3(CharSequence charSequence) {
        if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.i1)) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityHiddenStatus));
        spannableStringBuilder.append((CharSequence) " * ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.at(), length - 2, length - 1, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final void v4() {
        Bundle i10 = a4.a.i("addToGroup", true);
        i10.putLong("chatId", this.E2.id);
        f70 f70Var = new f70(i10);
        TLRPC.ChatFull chatFull = this.u2;
        f70Var.I = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.i iVar = new a0.i();
            for (int i11 = 0; i11 < this.u2.participants.participants.size(); i11++) {
                iVar.k(null, this.u2.participants.participants.get(i11).user_id);
            }
            f70Var.J = iVar;
        }
        f70Var.x = new ky0(this, 9);
        presentFragment(f70Var);
    }

    public final int w3(int i10, Boolean bool) {
        if (this.Q5 == null) {
            return i10;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, this.z0);
        int d = i0.a.d(0.5f, this.Q5.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), this.Q5.getStoryColor2(org.telegram.ui.ActionBar.j6.I.q()));
        if (org.telegram.ui.ActionBar.j6.b1(v02)) {
            return org.telegram.ui.ActionBar.j6.C(org.telegram.ui.ActionBar.j6.I.q(), v02, d, i10, (bool == null || bool.booleanValue()) ? d : org.telegram.ui.ActionBar.j6.l1(0.7f, d));
        }
        return (bool == null || bool.booleanValue()) ? d : org.telegram.ui.ActionBar.j6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.j6.l1(0.7f, d));
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
    public final void w4(boolean z10) {
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
            qz0 qz0Var = this.n0;
            int realPosition = qz0Var != null ? qz0Var.getRealPosition() : 0;
            qz0 qz0Var2 = this.n0;
            ImageLocation imageLocation = null;
            ImageLocation G = qz0Var2 != null ? qz0Var2.G(realPosition) : null;
            qz0 qz0Var3 = this.n0;
            TLRPC.Photo F = qz0Var3 != null ? qz0Var3.F(realPosition) : null;
            long j3 = this.e1;
            a01 a01Var = this.k5;
            if (j3 == 0) {
                if (this.f1 == 0 || (chatPhoto = (chat = getMessagesController().getChat(Long.valueOf(this.f1))).photo) == null || chatPhoto.photo_big == null) {
                    return;
                }
                PhotoViewer.t1().K2(null, this, null);
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
                PhotoViewer.t1().e2(null, fileLocation3, G, imageLocation, null, null, null, 0, a01Var, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e1));
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null) {
                return;
            }
            PhotoViewer.t1().K2(null, this, null);
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
            PhotoViewer.t1().e2(null, fileLocation4, G, imageLocation, null, null, null, 0, a01Var, null, 0L, 0L, 0L, true, null, null);
        }
    }

    @Override // org.telegram.ui.dh0
    public final gh.d x() {
        return this.n6;
    }

    public final void x3() {
        if (this.J5 == null) {
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
        this.b2 = AndroidUtilities.lerp(0.42f, this.J5[0], clamp01);
        this.Z1 = AndroidUtilities.lerp(this.O5, this.J5[1], clamp01);
        this.a2 = AndroidUtilities.lerp(translationY, this.J5[2], clamp01);
        this.c2 = AndroidUtilities.lerp(this.J5[11], 0.0f, clamp01);
        this.Y.setScaleX(this.b2);
        this.Y.setScaleY(this.b2);
        this.Y.setTranslationX(this.Z1);
        this.Y.setTranslationY(this.a2);
        org.telegram.ui.Components.hw0 hw0Var = this.T;
        if (hw0Var != null) {
            hw0Var.setAlpha(clamp01);
        }
        this.e0.setAlpha(1.0f);
        this.Y.setAlpha(1.0f);
        sz0 sz0Var = this.u0;
        if (sz0Var != null) {
            sz0Var.invalidate();
        }
        zh.g0 g0Var = this.v0;
        if (g0Var != null) {
            g0Var.e = AndroidUtilities.lerp(0.0f, this.J5[4], f7);
            this.v0.f = AndroidUtilities.lerp(0.0f, this.J5[5], clamp01);
            zh.g0 g0Var2 = this.v0;
            g0Var2.h = true;
            g0Var2.invalidate();
        }
        m11 m11Var = this.b6;
        if (m11Var != null) {
            m11Var.setAlpha((int) AndroidUtilities.lerp(0.0f, this.J5[6], clamp01));
        }
        float dp = (((this.b2 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
        this.h0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(16.0f) + dp);
        this.h0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(-10.0f) + dp);
        this.i0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
        this.i0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(26.5f) + dp);
        this.j0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
        this.j0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + dp);
        this.k0.setTranslationX(this.Y.getX() + AndroidUtilities.dp(28.0f) + dp);
        this.k0.setTranslationY(this.Y.getY() + AndroidUtilities.dp(24.0f) + dp);
        float lerp = AndroidUtilities.lerp(1.0f, this.J5[7], clamp01);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
        float dpf2 = AndroidUtilities.dpf2(22.7f) + floor;
        this.e2 = AndroidUtilities.lerp(floor, this.J5[8], clamp01);
        this.g2 = AndroidUtilities.lerp(dpf2, this.J5[9], clamp01);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.j5[] j5VarArr = this.f;
            if (i10 >= j5VarArr.length) {
                break;
            }
            if (j5VarArr[i10] != null) {
                int i11 = i10 * 2;
                float lerp2 = AndroidUtilities.lerp((this.O5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.J5[i11 + 12], clamp01);
                float lerp3 = AndroidUtilities.lerp((this.O5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.J5[i11 + 13], clamp01);
                j5VarArr[i10].setTranslationX(lerp2);
                j5VarArr[i10].setTranslationY(this.e2);
                org.telegram.ui.ActionBar.j5[] j5VarArr2 = this.r;
                j5VarArr2[i10].setTranslationX(this.o5 + lerp3);
                j5VarArr2[i10].setTranslationY(this.g2);
                if (i10 == 1) {
                    this.d2 = lerp2;
                    this.f2 = lerp3;
                    this.s.setTranslationX(lerp3);
                    this.s.setTranslationY(this.g2);
                }
                j5VarArr[i10].setScaleX(lerp);
                j5VarArr[i10].setScaleY(lerp);
            }
            i10++;
        }
        V4();
        b5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        l4((int) this.J5[10], clamp01, true);
        org.telegram.ui.Components.dh0 dh0Var = this.a0;
        if (dh0Var != null) {
            dh0Var.setAlpha(AndroidUtilities.lerp(0.0f, this.J5[3], f7));
        }
    }

    public final void x4() {
        TLRPC.User user;
        if (this.e1 == 0 || M3() || (user = getMessagesController().getUser(Long.valueOf(this.e1))) == null || (user instanceof TLRPC.TL_userEmpty)) {
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
            co coVar = new co(bundle);
            coVar.B9 = getMediaDataController().getGreetingsSticker();
            coVar.C9 = false;
            presentFragment(coVar, z10);
            if (!AndroidUtilities.isTablet() || this.I0) {
                return;
            }
            finishFragment();
        }
    }

    public final float y3() {
        return Utilities.clamp01((this.Q1 - O3()) / U3());
    }

    public final void y4() {
        TLRPC.ChatFull chatFull = this.u2;
        if (chatFull == null || chatFull.linked_chat_id == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.u2.linked_chat_id);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new co(bundle));
        }
    }

    public final void z3() {
        int i10 = 0;
        this.a2 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f));
        this.b2 = 1.38f;
        this.c2 = 0.0f;
        N3();
        D4();
        l4(0, 1.0f, true);
        while (true) {
            org.telegram.ui.ActionBar.j5[] j5VarArr = this.f;
            if (i10 >= j5VarArr.length) {
                break;
            }
            if (j5VarArr[i10] != null) {
                float measuredWidth = (this.a.getMeasuredWidth() / 2.0f) - (((j5VarArr[i10].getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) r4.getLayoutParams()).leftMargin);
                float measuredWidth2 = (this.a.getMeasuredWidth() / 2.0f) - ((this.r[i10].getExactWidth() * 0.5f) + ((FrameLayout.LayoutParams) r3[i10].getLayoutParams()).leftMargin);
                if (i10 == 1) {
                    this.d2 = measuredWidth;
                    this.f2 = measuredWidth2;
                }
            }
            i10++;
        }
        if (this.J1 != 2) {
            this.u0.setAlpha(1.0f);
        }
        this.Y.setAlpha(1.0f);
        this.e0.setAlpha(1.0f);
    }

    public final void z4(boolean z10) {
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
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        bi.pa paVar = new bi.pa(3, 1);
        paVar.setResourceProvider(this.z0);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.local_id = -1;
        tL_message.peer_id = getMessagesController().getPeer(a());
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_businessLocation tL_businessLocation2 = this.v2.business_location;
        tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
        tL_messageMediaGeo.address = tL_businessLocation2.address;
        tL_message.media = tL_messageMediaGeo;
        paVar.O0 = false;
        paVar.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
        presentFragment(paVar);
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.pu0 pu0Var) {
        super(bundle);
        this.f = new org.telegram.ui.ActionBar.j5[2];
        this.h = null;
        this.n = null;
        this.r = new org.telegram.ui.ActionBar.j5[4];
        this.y = new Drawable[2];
        this.E = new Drawable[2];
        this.G = new org.telegram.ui.Components.o5[2];
        this.H = new org.telegram.ui.Components.o5[2];
        this.I = new Drawable[2];
        this.J = new org.telegram.ui.Components.or[2];
        this.K = new org.telegram.ui.Components.or[2];
        this.w0 = null;
        this.x0 = new org.telegram.ui.Components.f50(this, 1);
        this.y0 = new Paint(1);
        this.J0 = new boolean[1];
        this.b1 = 1.0f;
        this.C1 = new a0.i();
        this.M1 = true;
        this.N1 = false;
        this.O1 = false;
        this.P1 = false;
        this.Y1 = new HashMap();
        this.m2 = new float[]{0.0f, 1.0f};
        this.q2 = new Paint();
        this.B2 = -1;
        this.L2 = new Rect();
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
        this.j5 = new org.telegram.ui.Cells.c2(this);
        this.k5 = new a01(this);
        this.A5 = new le.b(0, new ky0(this, 8), org.telegram.ui.Components.pr.h, 380L, true);
        this.G5 = new b01(this);
        this.I5 = new c01(this, 0);
        this.J5 = null;
        this.R5 = new SparseIntArray();
        this.T5 = null;
        this.U5 = -1;
        this.Y5 = -1.0f;
        gh.b bVar = new gh.b();
        this.p6 = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.q6 = bVar2;
        ArrayList arrayList = new ArrayList();
        this.t6 = arrayList;
        RectF rectF = new RectF();
        this.u6 = rectF;
        RectF rectF2 = new RectF();
        this.v6 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.R = pu0Var;
        gh.c cVar = new gh.c();
        cVar.a(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.z0));
        if (Build.VERSION.SDK_INT >= 31) {
            this.m6 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.n6 = dVar;
            bh.b bVar3 = new bh.b(dVar);
            this.o6 = bVar3;
            bVar3.f = LiteMode.isEnabled(262144);
        } else {
            this.m6 = null;
            this.n6 = null;
            this.o6 = new bh.b(cVar);
        }
        bVar2.c = new pe.b(true);
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ void P() {
    }
}
