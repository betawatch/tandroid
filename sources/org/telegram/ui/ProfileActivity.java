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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ProfileActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, wx, org.telegram.ui.Components.xt0, org.telegram.ui.Components.d40, org.telegram.ui.Components.qs0, mg0 {
    public final Drawable[] A;
    public int A0;
    public long A1;
    public TLRPC.Chat A2;
    public int A3;
    public int A4;
    public float A5;
    public Long B;
    public boolean B0;
    public float B1;
    public TL_bots.BotInfo B2;
    public int B3;
    public int B4;
    public boolean B5;
    public final org.telegram.ui.Components.i5[] C;
    public boolean C0;
    public boolean C1;
    public TLRPC.ChannelParticipant C2;
    public int C3;
    public int C4;
    public final xy0 C5;
    public final org.telegram.ui.Components.i5[] D;
    public boolean D0;
    public boolean D1;
    public TL_account.TL_password D2;
    public int D3;
    public int D4;
    public boolean D5;
    public final Drawable[] E;
    public boolean E0;
    public boolean E1;
    public TLRPC.FileLocation E2;
    public int E3;
    public boolean E4;
    public final yy0 E5;
    public final org.telegram.ui.Components.fr[] F;
    public final boolean[] F0;
    public int F1;
    public TLRPC.FileLocation F2;
    public int F3;
    public int F4;
    public float[] F5;
    public final org.telegram.ui.Components.fr[] G;
    public boolean G0;
    public boolean G1;
    public ImageLocation G2;
    public int G3;
    public int G4;
    public float G5;
    public org.telegram.ui.Components.il0 H;
    public boolean H0;
    public boolean H1;
    public final Rect H2;
    public int H3;
    public int H4;
    public float H5;
    public UndoView I;
    public boolean I0;
    public boolean I1;
    public org.telegram.ui.Cells.p8 I2;
    public int I3;
    public int I4;
    public boolean I5;
    public wz0 J;
    public boolean J0;
    public boolean J1;
    public int J2;
    public int J3;
    public boolean J4;
    public qz0 J5;
    public hz0 K;
    public ImageView K0;
    public boolean K1;
    public int K2;
    public int K3;
    public boolean K4;
    public float K5;
    public org.telegram.ui.Components.gw0 L;
    public org.telegram.ui.ActionBar.w0 L0;
    public boolean L1;
    public int L2;
    public int L3;
    public int L4;
    public float L5;
    public boolean M;
    public org.telegram.ui.ActionBar.w0 M0;
    public float M1;
    public int M2;
    public int M3;
    public final ArrayList M4;
    public MessagesController.PeerColor M5;
    public org.telegram.ui.Components.wt0 N;
    public org.telegram.ui.ActionBar.w0 N0;
    public float N1;
    public int N2;
    public int N3;
    public final ArrayList N4;
    public final SparseIntArray N5;
    public boolean O;
    public org.telegram.ui.ActionBar.w0 O0;
    public float O1;
    public int O2;
    public int O3;
    public int O4;
    public int O5;
    public org.telegram.ui.Components.qv0 P;
    public org.telegram.ui.ActionBar.w0 P0;
    public int P1;
    public int P2;
    public int P3;
    public boolean P4;
    public AnimatorSet P5;
    public yi0 Q;
    public org.telegram.ui.ActionBar.w0 Q0;
    public float Q1;
    public int Q2;
    public int Q3;
    public boolean Q4;
    public int Q5;
    public org.telegram.ui.Components.mi0 R;
    public org.telegram.ui.ActionBar.g1 R0;
    public ValueAnimator R1;
    public int R2;
    public int R3;
    public qy0 R4;
    public int R5;
    public org.telegram.ui.Components.mi0 S;
    public org.telegram.ui.ActionBar.g1 S0;
    public boolean S1;
    public int S2;
    public int S3;
    public View S4;
    public boolean S5;
    public org.telegram.ui.Components.s30 T;
    public org.telegram.ui.ActionBar.g1 T0;
    public FlagSecureReason T1;
    public int T2;
    public int T3;
    public int T4;
    public boolean T5;
    public m0 U;
    public ImageView U0;
    public final HashMap U1;
    public int U2;
    public int U3;
    public int U4;
    public float U5;
    public fh.v V;
    public org.telegram.ui.ActionBar.g1 V0;
    public float V1;
    public int V2;
    public int V3;
    public int V4;
    public float V5;
    public org.telegram.ui.Components.pg0 W;
    public org.telegram.ui.Components.h8 W0;
    public float W1;
    public int W2;
    public int W3;
    public long W4;
    public float W5;
    public MessagesController.SavedMusicList X;
    public float X0;
    public float X1;
    public int X2;
    public int X3;
    public boolean X4;
    public g01 X5;
    public org.telegram.ui.Components.hh0 Y;
    public int Y0;
    public float Y1;
    public int Y2;
    public int Y3;
    public boolean Y4;
    public m01 Y5;
    public org.telegram.ui.Cells.o Z;
    public i01 Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public String Z4;
    public kh.x3 Z5;
    public by0 a;
    public ly0 a0;
    public long a1;
    public float a2;
    public int a3;
    public int a4;
    public String a5;
    public int a6;
    public org.telegram.ui.Components.wk0 b;
    public AnimatorSet b0;
    public long b1;
    public float b2;
    public int b3;
    public int b4;
    public String b5;
    public Boolean b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public dy0 c;
    public org.telegram.ui.Cells.z3 c0;
    public long c1;
    public float c2;
    public int c3;
    public int c4;
    public org.telegram.ui.Components.rg c5;
    public TLRPC.TL_emojiStatusCollectible c6;
    public vz0 d;
    public ImageView d0;
    public boolean d1;
    public float d2;
    public int d3;
    public int d4;
    public final HashSet d5;
    public int d6;
    public f01 e;
    public ImageView e0;
    public long e1;
    public float e2;
    public int e3;
    public int e4;
    public CharacterStyle e5;
    public boolean e6;
    public final org.telegram.ui.ActionBar.h5[] f;
    public ImageView f0;
    public boolean f1;
    public ValueAnimator f2;
    public int f3;
    public int f4;
    public final org.telegram.ui.Cells.c2 f5;
    public int f6;
    public ImageView g0;
    public boolean g1;
    public float g2;
    public int g3;
    public int g4;
    public final wy0 g5;
    public int g6;
    public String h;
    public org.telegram.ui.Components.b11 h0;
    public boolean h1;
    public float h2;
    public int h3;
    public int h4;
    public boolean h5;
    public int h6;
    public org.telegram.ui.Components.rg0 i0;
    public long i1;
    public final float[] i2;
    public int i3;
    public int i4;
    public fz0 i5;
    public final ig.e i6;
    public my0 j0;
    public boolean j1;
    public boolean j2;
    public int j3;
    public int j4;
    public float j5;
    public final ng.d j6;
    public yz0 k0;
    public boolean k1;
    public boolean k2;
    public int k3;
    public int k4;
    public float k5;
    public final ig.a k6;
    public org.telegram.ui.Components.z8 l0;
    public boolean l1;
    public boolean l2;
    public int l3;
    public int l4;
    public boolean l5;
    public final ng.b l6;
    public org.telegram.ui.Components.e40 m0;
    public boolean m1;
    public final Paint m2;
    public int m3;
    public int m4;
    public boolean m5;
    public final ig.a m6;
    public String n;
    public int n0;
    public boolean n1;
    public boolean n2;
    public int n3;
    public int n4;
    public ImageReceiver n5;
    public pg.i n6;
    public org.telegram.ui.Components.b11 o0;
    public boolean o1;
    public mh.u0 o2;
    public int o3;
    public int o4;
    public FrameLayout o5;
    public px0 o6;
    public org.telegram.ui.Components.eh0 p0;
    public boolean p1;
    public mh.r p2;
    public int p3;
    public int p4;
    public FrameLayout[] p5;
    public final ArrayList p6;
    public oy0 q0;
    public int q1;
    public TLRPC.ChatFull q2;
    public int q3;
    public int q4;
    public SpannableStringBuilder q5;
    public final RectF q6;
    public final org.telegram.ui.ActionBar.h5[] r;
    public gh.v0 r0;
    public boolean r1;
    public TLRPC.UserFull r2;
    public int r3;
    public int r4;
    public SpannableStringBuilder r5;
    public final RectF r6;
    public org.telegram.ui.Components.nn0 s;
    public View s0;
    public boolean s1;
    public org.telegram.ui.Cells.f6 s2;
    public int s3;
    public int s4;
    public kh.d[] s5;
    public final org.telegram.ui.Components.p40 t0;
    public boolean t1;
    public boolean t2;
    public int t3;
    public int t4;
    public org.telegram.messenger.q8 t5;
    public final Paint u0;
    public int u1;
    public j01 u2;
    public int u3;
    public int u4;
    public FrameLayout u5;
    public org.telegram.ui.Components.pi0 v;
    public org.telegram.ui.ActionBar.b6 v0;
    public boolean v1;
    public CharSequence v2;
    public int v3;
    public int v4;
    public kh.d v5;
    public AnimatorSet w;
    public int w0;
    public boolean w1;
    public long w2;
    public int w3;
    public int w4;
    public final td.a w5;
    public Drawable x;
    public ImageLocation x0;
    public boolean x1;
    public int x2;
    public int x3;
    public int x4;
    public sy0 x5;
    public final Drawable[] y;
    public int y0;
    public a0.h y1;
    public ArrayList y2;
    public int y3;
    public int y4;
    public AnimatorSet y5;
    public int z0;
    public boolean z1;
    public TLRPC.EncryptedChat z2;
    public int z3;
    public int z4;
    public AnimatorSet z5;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static void A0(ProfileActivity profileActivity) {
        RectF rectF = profileActivity.r6;
        ig.e eVar = profileActivity.i6;
        if (Build.VERSION.SDK_INT < 31 || eVar == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (profileActivity.fragmentView.getMeasuredHeight() - profileActivity.h6) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        profileActivity.q6.set(0.0f, -dp, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.actionBar.getMeasuredHeight() + dp);
        rectF.set(0.0f, dp2, profileActivity.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(2, profileActivity.p6);
        eVar.e(profileActivity.o6, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.fragmentView.getMeasuredHeight());
    }

    public static void F0(ProfileActivity profileActivity, int i9) {
        boolean w02 = org.telegram.ui.Components.eu0.w0(profileActivity.K.getClosestTab());
        if (i9 == profileActivity.d6 && w02 == profileActivity.e6) {
            return;
        }
        profileActivity.d6 = i9;
        profileActivity.e6 = w02;
        if (w02) {
            if (i9 > 0) {
                profileActivity.s5[0].g(LocaleController.formatPluralString("HideStoriesFromAlbum", i9, new Object[0]), true, true);
                return;
            } else {
                profileActivity.s5[0].g(profileActivity.r5, true, true);
                return;
            }
        }
        if (i9 > 0 || !MessagesController.getInstance(profileActivity.currentAccount).storiesEnabled()) {
            profileActivity.s5[0].g(LocaleController.formatPluralString("ArchiveStories", i9, new Object[0]), true, true);
        } else {
            profileActivity.s5[0].g(profileActivity.q5, true, true);
        }
    }

    public static ValueAnimator G0(final ProfileActivity profileActivity, final boolean z10) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.r;
        if (z10) {
            AndroidUtilities.requestAdjustResize(profileActivity.getParentActivity(), profileActivity.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.R1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.R1.cancel();
        }
        gh.v0 v0Var = profileActivity.r0;
        if (v0Var != null) {
            v0Var.setActive(!z10);
        }
        int i9 = 0;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(profileActivity.Q1, z10 ? 0.0f : 1.0f);
        final float f10 = profileActivity.M1;
        profileActivity.b.setTranslationY(f10);
        profileActivity.b.setVisibility(0);
        profileActivity.Q0.setVisibility(0);
        profileActivity.a.setVisibility(0);
        profileActivity.k4(true);
        profileActivity.U.setVisibility(0);
        profileActivity.f[1].setVisibility(0);
        h5VarArr[1].setVisibility(0);
        h5VarArr[3].setVisibility(0);
        profileActivity.actionBar.v(profileActivity.Q1 > 0.5f);
        int i10 = profileActivity.Q1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.P0;
        if (w0Var != null) {
            w0Var.setVisibility(i10);
        }
        profileActivity.Q0.setVisibility(i10);
        profileActivity.Q0.getSearchContainer().setVisibility(profileActivity.Q1 <= 0.5f ? 0 : 8);
        profileActivity.b.setEmptyView(profileActivity.L);
        profileActivity.U.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.zx0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.k0(ProfileActivity.this, ofFloat, f10, z10);
            }
        });
        ofFloat.addListener(new zy0(profileActivity, z10, i9));
        if (!z10) {
            profileActivity.Q4 = true;
            profileActivity.F4();
            AndroidUtilities.requestAdjustNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.L.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.f);
        profileActivity.R1 = ofFloat;
        return ofFloat;
    }

    public static SpannableStringBuilder G3(int i9, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        az0 az0Var = new az0(9);
        az0Var.n = str;
        if (az0Var.c != null) {
            az0Var.c = null;
            az0Var.a();
        }
        az0Var.f = i9;
        spannableStringBuilder.setSpan(az0Var, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static void H4(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(activity, 3, null);
        c2Var.c0 = false;
        c2Var.show();
        Utilities.globalQueue.postRunnable(new np0(c2Var, z10, activity, 4));
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
            for (int i9 = 0; i9 < codecCount; i9++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i9);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i10].equals(str)) {
                            (codecInfoAt.isEncoder() ? arrayList2 : arrayList).add(Integer.valueOf(i9));
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

    public static void T(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.h5 h5Var) {
        ImageLocation forDocument;
        String str;
        org.telegram.ui.Components.i5[] i5VarArr = profileActivity.C;
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            ve.e.s(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        zf.k1 k1Var = new zf.k1(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.v0);
        h5Var.getLocationOnScreen(new int[2]);
        k1Var.r0 = h5Var.d0;
        k1Var.s0 = h5Var.e0;
        k1Var.v0 = h5Var.getScaleX();
        k1Var.t0 = h5Var.getLeft();
        k1Var.u0 = h5Var.getTop();
        k1Var.w0 = h5Var;
        Drawable rightDrawable = h5Var.getRightDrawable();
        org.telegram.ui.Components.i5 i5Var = i5VarArr[1];
        if (rightDrawable == i5Var && i5Var != null) {
            Drawable drawable = i5Var.f[0];
            if (drawable instanceof org.telegram.ui.Components.k5) {
                k1Var.v0 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.k5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(profileActivity.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.f6.m6, 0.2f);
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
                    o9Var.setLayerNum(7);
                    o9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    o9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (((org.telegram.ui.Components.k5) i5VarArr[1].f[0]).c()) {
                        o9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v6, profileActivity.v0), PorterDuff.Mode.SRC_IN));
                        k1Var.y0 = MessageObject.getInputStickerSet(document);
                    } else {
                        k1Var.y0 = MessageObject.getInputStickerSet(document);
                    }
                    k1Var.x0 = o9Var;
                    k1Var.A0 = true;
                }
            }
        }
        profileActivity.showDialog(k1Var);
    }

    public static void U(ProfileActivity profileActivity) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.r;
        by0 by0Var = profileActivity.a;
        if (by0Var != null) {
            int childCount = by0Var.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = profileActivity.a.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.va) {
                    ((org.telegram.ui.Cells.va) childAt).j(0);
                }
            }
            profileActivity.a.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, profileActivity.v0));
        }
        if (!profileActivity.l2) {
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
            if (h5Var != null) {
                Object tag = h5Var.getTag();
                for (int i10 = 0; i10 < 2; i10++) {
                    if (tag instanceof Integer) {
                        h5VarArr[i10 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.f6.v0(((Integer) tag).intValue(), profileActivity.v0), Boolean.valueOf(profileActivity.F0[0])));
                    } else {
                        h5VarArr[i10 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B8, profileActivity.v0), Boolean.TRUE));
                    }
                }
            }
            Drawable drawable = profileActivity.x;
            if (drawable != null) {
                drawable.setColorFilter(profileActivity.M5 != null ? -1 : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.pc, profileActivity.v0), PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.il0 il0Var = profileActivity.H;
            if (il0Var != null) {
                il0Var.b(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h8, profileActivity.v0));
            }
            org.telegram.ui.ActionBar.h5 h5Var2 = profileActivity.f[1];
            if (h5Var2 != null) {
                h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.vh, profileActivity.v0));
            }
            org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
            if (kVar != null) {
                kVar.C(profileActivity.M5 == null ? org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v8, profileActivity.v0) : -1, false);
                profileActivity.actionBar.A(profileActivity.M5 != null ? 553648127 : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f8, profileActivity.v0), false);
            }
        }
        profileActivity.X4();
        profileActivity.o5();
    }

    public static /* synthetic */ void V(ProfileActivity profileActivity) {
        MessagesController.getInstance(profileActivity.currentAccount).deleteUserPhoto(null);
        profileActivity.R.K(0);
        profileActivity.S.K(0);
    }

    public static void V0(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.Y1, 0.25f) / 0.25f;
        if (profileActivity.m1) {
            profileActivity.p0.setAlpha(1.0f - min);
            profileActivity.p0.setBlurIntensity(0.0f);
            profileActivity.p0.setGooeyEnabled(false);
        } else {
            profileActivity.p0.setPullProgress(profileActivity.Y1);
            profileActivity.p0.setBlurIntensity(Math.min((g7.n.a(profileActivity.Y1, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
            org.telegram.ui.Components.eh0 eh0Var = profileActivity.p0;
            float f10 = profileActivity.Y1;
            eh0Var.setGooeyEnabled(f10 > 0.0f && f10 < 1.0f);
        }
        oy0 oy0Var = profileActivity.q0;
        if (oy0Var != null && profileActivity.F1 != 2) {
            float f11 = profileActivity.Y1;
            oy0Var.setAlpha(f11 > 0.0f ? AndroidUtilities.lerp(1.0f, 0.0f, AndroidUtilities.ilerp(f11, 0.0f, 0.5f)) : 1.0f);
        }
        profileActivity.p0.setVisibility(profileActivity.Y1 >= 1.0f ? 8 : 0);
    }

    public static void W(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.gc Q = org.telegram.ui.Components.oc.a0(profileActivity).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
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
            org.telegram.messenger.l0.p(R.string.UnknownError, org.telegram.ui.Components.oc.a0(profileActivity), R.raw.error, 36);
            return;
        }
        if (profileActivity.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.resourceProvider);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            profileActivity.showDialog(alertDialog$Builder.a);
        }
    }

    public static void X(ProfileActivity profileActivity, int i9, float f10, float f11) {
        switch (i9) {
            case 0:
                boolean z10 = profileActivity.m1;
                if (!z10) {
                    if (profileActivity.a1 == 0) {
                        if (profileActivity.b1 != 0) {
                            if (!ChatObject.isForum(profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.b1)))) {
                                if (!profileActivity.M3()) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", profileActivity.b1);
                                    if (profileActivity.getMessagesController().checkCanOpenChat(bundle, profileActivity)) {
                                        profileActivity.presentFragment(new qn(bundle), false);
                                        break;
                                    }
                                }
                            } else {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", profileActivity.b1);
                                if (profileActivity.getMessagesController().checkCanOpenChat(bundle2, profileActivity)) {
                                    profileActivity.presentFragment(new qn(bundle2), false);
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
                profileActivity.r4(profileActivity.W, f10, f11, true);
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
                y21.K(profileActivity.a(), profileActivity);
                break;
            case 9:
                profileActivity.i4(false);
                break;
            case 12:
                profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(profileActivity.getParentActivity(), 3, profileActivity.v0);
                c2Var.q(200L);
                MessagesController.getInstance(profileActivity.currentAccount).getStoriesController().k(profileActivity.a(), new ih.a2(7, profileActivity, c2Var), true, profileActivity.v0);
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
                    org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(profileActivity, profileActivity.W);
                    H.w = false;
                    H.i = 3;
                    H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.QrCode), new cb0(profileActivity, 22), false);
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new zk0(currentUser, 28), false);
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new cb0(profileActivity, 23), false);
                    H.W = true;
                    H.a0(f10 - AndroidUtilities.dp(8.0f), profileActivity.W.getMeasuredHeight() - AndroidUtilities.dp(16.0f));
                    H.Z();
                    break;
                }
                break;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 17:
                profileActivity.presentFragment(new z71(null));
                break;
        }
    }

    public static boolean Y(ProfileActivity profileActivity, boolean[] zArr, boolean z10, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_error tL_error) {
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(profileActivity.currentAccount).edit().putLong("dialog_join_requested_time_" + profileActivity.e1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        boolean z11 = ChatObject.isChannel(profileActivity.A2) && !profileActivity.A2.megagroup;
        int i9 = org.telegram.ui.Components.p70.r;
        org.telegram.ui.Components.p70.w(parentActivity, profileActivity, org.telegram.ui.Components.oc.a0(profileActivity), z11);
        if (!z10 || profileActivity.H4 != -1) {
            profileActivity.j5();
            vz0 vz0Var = profileActivity.d;
            if (vz0Var != null) {
                vz0Var.l();
            }
        }
        if (o2Var instanceof qn) {
            ((qn) o2Var).vb(false, true);
        }
        return false;
    }

    public static void Z(ProfileActivity profileActivity) {
        TLRPC.Document f10;
        org.telegram.ui.Components.gc h;
        if (profileActivity.F2 != null) {
            return;
        }
        if (!profileActivity.m1 || profileActivity.getMessagesController().premiumFeaturesBlocked()) {
            if (profileActivity.K3()) {
                return;
            }
            profileActivity.w4(false);
            return;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = profileActivity.getMessagesController().getTopicsController().getTopics(profileActivity.b1);
        if (topics != null) {
            TLRPC.TL_forumTopic tL_forumTopic = null;
            for (int i9 = 0; tL_forumTopic == null && i9 < topics.size(); i9++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i9);
                if (tL_forumTopic2 != null && tL_forumTopic2.id == profileActivity.c1) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
            if (tL_forumTopic != null) {
                long j10 = tL_forumTopic.icon_emoji_id;
                if (j10 == 0 || (f10 = org.telegram.ui.Components.k5.f(profileActivity.currentAccount, j10)) == null || (h = org.telegram.ui.Components.oc.a0(profileActivity).h(f10, 1, new xx0(profileActivity, 0))) == null) {
                    return;
                }
                h.j();
            }
        }
    }

    public static void a0(ProfileActivity profileActivity, Context context, long j10, View view, int i9, float f10, float f11) {
        TLRPC.User user;
        vz0 vz0Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.a.B0();
        if (i9 == profileActivity.O3) {
            TLRPC.User user2 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.a1));
            TLRPC.UserFull userFull = profileActivity.r2;
            if (userFull != null && userFull.starref_program != null) {
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                gh.c0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), clientUserId, profileActivity.a1, new zt(profileActivity, context, clientUserId, 2));
                return;
            } else {
                if (user2 == null || !user2.bot_can_edit) {
                    return;
                }
                profileActivity.presentFragment(new mh.l(profileActivity.a1));
                return;
            }
        }
        if (i9 == profileActivity.M3) {
            boolean z10 = !profileActivity.getMessagesController().isDialogMuted(j10, profileActivity.c1);
            profileActivity.getNotificationsController().muteDialog(j10, profileActivity.c1, z10);
            org.telegram.ui.Components.oc.A(profileActivity, z10, null).j();
            profileActivity.a5();
            int i10 = profileActivity.M3;
            if (i10 < 0 || (vz0Var = profileActivity.d) == null) {
                return;
            }
            vz0Var.m(i10);
            return;
        }
        if (i9 == profileActivity.V3) {
            TLRPC.User user3 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.a1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user3.id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.Z4);
            bundle.putString("first_name_card", profileActivity.a5);
            bundle.putString("last_name_card", profileActivity.b5);
            is isVar = new is(bundle, profileActivity.v0);
            isVar.K = new gx0(profileActivity, user3);
            profileActivity.presentFragment(isVar);
            return;
        }
        if (i9 == profileActivity.S3) {
            TextView textView = (TextView) org.telegram.ui.Components.y4.i0(profileActivity.getParentActivity(), LocaleController.getString(R.string.DeleteReaction), LocaleController.getString(R.string.DeleteAlertReaction), LocaleController.getString(R.string.DeleteAlertReactionAll), LocaleController.getString(R.string.Delete), new xx0(profileActivity, 1), profileActivity.v0, false).d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                return;
            }
            return;
        }
        if (i9 == profileActivity.T3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.v0);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.ReportReaction2);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ReportAlertReaction);
            TLRPC.Chat chat = profileActivity.getMessagesController().getChat(Long.valueOf(-profileActivity.W4));
            org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
            if (chat != null && ChatObject.canBlockUsers(chat)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(profileActivity.getParentActivity(), 1, profileActivity.v0);
                z1VarArr[0] = z1Var;
                z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                z1VarArr[0].e(LocaleController.getString(R.string.BanUser), "", true, false, false);
                z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(z1VarArr[0], g7.e6.n(-1, -2));
                z1VarArr[0].setOnClickListener(new c20(z1VarArr, 2));
                alertDialog$Builder.n(linearLayout);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.ReportChat), new nl0(14, profileActivity, z1VarArr));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fk0(6));
            TextView textView2 = (TextView) alertDialog$Builder.o().d(-1);
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                return;
            }
            return;
        }
        if (i9 == profileActivity.n4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", DialogObject.getEncryptedChatId(profileActivity.e1));
            profileActivity.presentFragment(new b70(bundle2));
            return;
        }
        if (i9 == profileActivity.m4) {
            profileActivity.showDialog(org.telegram.ui.Components.y4.V(profileActivity.getParentActivity(), profileActivity.z2, profileActivity.v0).a);
            return;
        }
        if (i9 == profileActivity.J3) {
            profileActivity.r4(view, f10, f11, false);
            return;
        }
        if (i9 == profileActivity.G4) {
            profileActivity.getMessagesController().unblockPeer(profileActivity.a1);
            if (org.telegram.ui.Components.oc.a(profileActivity)) {
                org.telegram.ui.Components.oc.d(profileActivity, false).j();
                return;
            }
            return;
        }
        if (i9 == profileActivity.W3) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        if (i9 == profileActivity.Q3) {
            profileActivity.u4();
            return;
        }
        if (i9 == profileActivity.R3) {
            y21.K(profileActivity.a(), profileActivity);
            return;
        }
        if (i9 >= profileActivity.q4 && i9 < profileActivity.r4) {
            profileActivity.h(!profileActivity.y2.isEmpty() ? profileActivity.q2.participants.participants.get(((Integer) profileActivity.y2.get(i9 - profileActivity.q4)).intValue()) : profileActivity.q2.participants.participants.get(i9 - profileActivity.q4), false, false, view);
            return;
        }
        if (i9 == profileActivity.s4) {
            profileActivity.v4();
            return;
        }
        if (i9 == profileActivity.H3) {
            profileActivity.C4(f10, f11, i9, view);
            return;
        }
        if (i9 == profileActivity.h4) {
            if (profileActivity.A2 != null) {
                profileActivity.showDialog(new nh.j0(profileActivity, profileActivity.A2.linked_community_id, null, null));
                return;
            } else {
                if (profileActivity.a1 == 0 || (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.a1))) == null) {
                    return;
                }
                profileActivity.showDialog(new nh.j0(profileActivity, user.linked_community_id, null, null));
                return;
            }
        }
        if (i9 == profileActivity.E3) {
            if (profileActivity.q2.location instanceof TLRPC.TL_channelLocation) {
                pc0 pc0Var = new pc0(5);
                long j11 = profileActivity.b1;
                TLRPC.TL_channelLocation tL_channelLocation = (TLRPC.TL_channelLocation) profileActivity.q2.location;
                pc0Var.a0 = -j11;
                pc0Var.v0 = tL_channelLocation;
                profileActivity.presentFragment(pc0Var);
                return;
            }
            return;
        }
        if (i9 == profileActivity.H4) {
            profileActivity.q4(false);
            return;
        }
        if (i9 == profileActivity.t4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.b1);
            bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            jr jrVar = new jr(bundle3);
            jrVar.w0(profileActivity.q2);
            profileActivity.presentFragment(jrVar);
            return;
        }
        if (i9 == profileActivity.u4) {
            profileActivity.presentFragment(new ih0(profileActivity.b1));
            return;
        }
        if (i9 == profileActivity.v4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.b1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            jr jrVar2 = new jr(bundle4);
            jrVar2.w0(profileActivity.q2);
            profileActivity.presentFragment(jrVar2);
            return;
        }
        if (i9 == profileActivity.w4) {
            profileActivity.O0.performClick();
            return;
        }
        if (i9 == profileActivity.x4) {
            profileActivity.presentFragment(new gh.r(0, profileActivity.a1));
            return;
        }
        if (i9 == profileActivity.y4) {
            profileActivity.presentFragment(new gh.r(1, profileActivity.a1));
            return;
        }
        if (i9 == profileActivity.z4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.b1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new s91(bundle5));
            return;
        }
        if (i9 == profileActivity.C4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.b1);
            bundle6.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            jr jrVar3 = new jr(bundle6);
            jrVar3.w0(profileActivity.q2);
            profileActivity.presentFragment(jrVar3);
            return;
        }
        if (i9 == profileActivity.b3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
            return;
        }
        if (i9 == profileActivity.d3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.D2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.x0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
            return;
        }
        if (i9 == profileActivity.e3) {
            profileActivity.presentFragment(new DataSettingsActivity());
            return;
        }
        if (i9 == profileActivity.f3) {
            profileActivity.presentFragment(new ThemeActivity(0));
            return;
        }
        if (i9 == profileActivity.g3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
            return;
        }
        if (i9 == profileActivity.i3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
            return;
        }
        if (i9 == profileActivity.h3) {
            profileActivity.presentFragment(new sb0());
            return;
        }
        if (i9 == profileActivity.j3) {
            profileActivity.presentFragment(new SessionsActivity(0));
            return;
        }
        if (i9 == profileActivity.m3) {
            profileActivity.showDialog(org.telegram.ui.Components.y4.U(profileActivity, profileActivity.v0));
            return;
        }
        if (i9 == profileActivity.n3) {
            ve.e.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
            return;
        }
        if (i9 == profileActivity.o3) {
            ve.e.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
            return;
        }
        if (i9 == profileActivity.r3) {
            H4(profileActivity.getParentActivity(), false);
            return;
        }
        if (i9 == profileActivity.s3) {
            H4(profileActivity.getParentActivity(), true);
            return;
        }
        if (i9 == profileActivity.t3) {
            FileLog.cleanupLogs();
            return;
        }
        if (i9 == profileActivity.u3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.v0);
            alertDialog$Builder2.a.P = LocaleController.getString(R.string.AreYouSure);
            alertDialog$Builder2.a.N = LocaleController.getString(R.string.AppName);
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new fx0(profileActivity, 7));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            profileActivity.showDialog(alertDialog$Builder2.a);
            return;
        }
        if (i9 == profileActivity.c3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
            return;
        }
        if (i9 == profileActivity.R2) {
            profileActivity.presentFragment(new ma(null));
            return;
        }
        if (i9 == profileActivity.S2) {
            profileActivity.presentFragment(new UserInfoActivity());
            return;
        }
        if (i9 == profileActivity.P2) {
            profileActivity.presentFragment(new h(3));
            return;
        }
        if (i9 == profileActivity.K2) {
            profileActivity.u4();
            return;
        }
        if (i9 == profileActivity.Y3) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
            return;
        }
        if (i9 == profileActivity.Z3) {
            profileActivity.presentFragment(new gh.oa());
            return;
        }
        if (i9 == profileActivity.a4) {
            profileActivity.presentFragment(new lh.g());
            return;
        }
        if (i9 == profileActivity.b4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
            return;
        }
        if (i9 == profileActivity.c4) {
            bg.g3.d0(0, BirthdayController.getInstance(profileActivity.currentAccount).getState());
            return;
        }
        if (i9 == profileActivity.botPermissionLocation) {
            mh.u0 u0Var = profileActivity.o2;
            if (u0Var != null) {
                u0Var.m(!u0Var.g(), new ys0(17, profileActivity, view));
                return;
            }
            return;
        }
        if (i9 == profileActivity.botPermissionBiometry) {
            mh.r rVar = profileActivity.p2;
            if (rVar != null) {
                boolean z11 = !rVar.e;
                rVar.f = true;
                rVar.e = z11;
                rVar.k();
                ((org.telegram.ui.Cells.p8) view).setChecked(profileActivity.p2.e);
                return;
            }
            return;
        }
        if (i9 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            p8Var.setChecked(!p8Var.b());
            if (profileActivity.k4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.k4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().getInputUser(profileActivity.a1);
            boolean b10 = p8Var.b();
            toggleuseremojistatuspermission.enabled = b10;
            TLRPC.UserFull userFull2 = profileActivity.r2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = b10;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new v40(22, profileActivity, r0));
            profileActivity.k4 = sendRequest;
            int[] iArr = {sendRequest};
            return;
        }
        if (i9 == profileActivity.K3) {
            profileActivity.J4 = !profileActivity.J4;
            profileActivity.F4();
            view.requestLayout();
            profileActivity.d.m(profileActivity.K3);
            int i11 = profileActivity.Q5;
            if (i11 >= 0) {
                profileActivity.c.h1(i11, profileActivity.R5 - profileActivity.a.getPaddingTop());
                return;
            }
            return;
        }
        if (i9 == profileActivity.L3) {
            profileActivity.z4(false);
            return;
        }
        if (i9 == profileActivity.M2) {
            if (profileActivity.r2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.r2.personal_channel_id);
            profileActivity.presentFragment(new qn(bundle7));
            return;
        }
        if (i9 != profileActivity.Q2) {
            if (i9 == profileActivity.D3) {
                profileActivity.I3(i9, view);
                return;
            } else {
                profileActivity.C4(f10, f11, i9, view);
                return;
            }
        }
        m01 m01Var = profileActivity.Y5;
        if ((m01Var == null || !m01Var.a()) && !profileActivity.J3(i9, view)) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (z8Var.d.getDrawable() != null) {
                profileActivity.t4(z8Var.getImageView());
            }
        }
    }

    public static void b0(ProfileActivity profileActivity, org.telegram.ui.Cells.z1[] z1VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().getInputUser(profileActivity.a1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().getInputPeer(profileActivity.W4);
        tL_messages_reportReaction.id = profileActivity.V4;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new ih.q5(5));
        org.telegram.ui.Cells.z1 z1Var = z1VarArr[0];
        if (z1Var != null && z1Var.b()) {
            profileActivity.getMessagesController().deleteParticipantFromChat(-profileActivity.W4, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.a1)));
        }
        profileActivity.V4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.oc.a0(profileActivity).E(profileActivity.v0).j();
    }

    public static /* synthetic */ void c0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.E2 = fileLocation;
            profileActivity.F2 = photoSize2.location;
            profileActivity.a0.h(ImageLocation.getForLocal(fileLocation), "50_50", profileActivity.l0, null);
            if (profileActivity.K2 != -1) {
                profileActivity.j5();
                vz0 vz0Var = profileActivity.d;
                if (vz0Var != null) {
                    vz0Var.l();
                }
                profileActivity.k4(true);
            }
            my0 my0Var = profileActivity.j0;
            ImageLocation forLocal = ImageLocation.getForLocal(profileActivity.F2);
            profileActivity.G2 = forLocal;
            my0Var.A(forLocal, ImageLocation.getForLocal(profileActivity.E2));
            profileActivity.P4(true, false);
        } else {
            if (profileActivity.E2 == null) {
                return;
            }
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i9 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i9 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            profileActivity.O5 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new v40(24, profileActivity, str));
        }
        profileActivity.actionBar.n().requestLayout();
    }

    public static void d0(ProfileActivity profileActivity, Boolean bool) {
        long j10 = profileActivity.a1;
        if (j10 == 0) {
            long j11 = profileActivity.b1;
            j10 = j11 != 0 ? -j11 : profileActivity.e1;
        }
        long j12 = j10;
        if (bool.booleanValue()) {
            MessagesController.getInstance(profileActivity.currentAccount).deleteAllReactionsFrom(profileActivity.W4, j12);
        } else {
            MessagesController.getInstance(profileActivity.currentAccount).deleteReactionsFromMessage(profileActivity.W4, j12, profileActivity.V4);
        }
        profileActivity.V4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(profileActivity.getParentActivity(), profileActivity.v0);
        obVar.d(R.raw.chats_infotip, new String[0]);
        obVar.b.setText(LocaleController.getString(R.string.ReactionDeleteSent));
        org.telegram.ui.Components.oc.a0(profileActivity).b(obVar, 1500).j();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e0(ProfileActivity profileActivity, int i9) {
        boolean z10;
        if (i9 < 0) {
            return;
        }
        Object valueOf = Integer.valueOf(profileActivity.P2);
        f01 f01Var = profileActivity.e;
        if (!f01Var.w) {
            if (!f01Var.v.isEmpty()) {
                i9--;
            }
            if (i9 < 0 || i9 >= profileActivity.e.v.size()) {
                int g10 = j3.r0.g(1, i9, profileActivity.e.v);
                if (g10 >= 0 && g10 < profileActivity.e.d.size()) {
                    valueOf = profileActivity.e.d.get(g10);
                    z10 = false;
                    if (!(valueOf instanceof e01)) {
                        e01 e01Var = (e01) valueOf;
                        org.telegram.ui.ActionBar.b5 parentLayout = profileActivity.getParentLayout();
                        e01Var.b.run();
                        AndroidUtilities.scrollToFragmentRow(parentLayout, e01Var.c);
                    } else if (valueOf instanceof MessagesController.FaqSearchResult) {
                        NotificationCenter.getInstance(profileActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, profileActivity.e.A, ((MessagesController.FaqSearchResult) valueOf).url);
                    }
                    if (z10 || valueOf == null) {
                    }
                    profileActivity.e.E(valueOf);
                    return;
                }
            } else {
                valueOf = profileActivity.e.v.get(i9);
            }
        } else if (i9 < f01Var.r.size()) {
            valueOf = profileActivity.e.r.get(i9);
        } else {
            int g11 = j3.r0.g(1, i9, profileActivity.e.r);
            if (g11 >= 0 && g11 < profileActivity.e.s.size()) {
                valueOf = profileActivity.e.s.get(g11);
            }
        }
        z10 = true;
        if (!(valueOf instanceof e01)) {
        }
        if (z10) {
        }
    }

    public static void f0(ProfileActivity profileActivity) {
        boolean z10;
        TLRPC.Document document;
        if (profileActivity.X == null) {
            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.currentAccount == profileActivity.currentAccount && MediaController.getInstance().currentSavedMusicList.dialogId == profileActivity.a()) {
                profileActivity.X = MediaController.getInstance().currentSavedMusicList;
            } else {
                MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(profileActivity.currentAccount, profileActivity.a());
                profileActivity.X = savedMusicList;
                TLRPC.UserFull userFull = profileActivity.r2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    savedMusicList.setup(document);
                }
            }
        }
        if (profileActivity.X.list.isEmpty()) {
            return;
        }
        if (MediaController.getInstance().currentSavedMusicList == profileActivity.X && MediaController.getInstance().isPlayingMessage(profileActivity.X.list.get(0))) {
            z10 = true;
        } else {
            MediaController.getInstance().cleanup();
            z10 = false;
        }
        MediaController.getInstance().currentSavedMusicList = profileActivity.X;
        MediaController.getInstance().getPlaylist().clear();
        MediaController.getInstance().getPlaylist().addAll(profileActivity.X.list);
        if (!z10) {
            MediaController.getInstance().playMessage(profileActivity.X.list.get(0));
        }
        profileActivity.showDialog(new org.telegram.ui.Components.c8(profileActivity.getParentActivity(), profileActivity.v0));
    }

    public static void g0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.gb0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new cb0(profileActivity, 18), profileActivity.v0);
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v33, types: [boolean[], org.telegram.ui.ActionBar.b6] */
    /* JADX WARN: Type inference failed for: r5v41 */
    public static void h0(ProfileActivity profileActivity) {
        LinearLayout linearLayout;
        int i9;
        final int i10;
        final LimitPreviewView limitPreviewView;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.r2;
        if (userFull == null || userFull.stars_rating == null) {
            return;
        }
        ?? r52 = 0;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(profileActivity.getParentActivity(), null, false, false);
        f3Var.fixNavigationBar();
        Runnable runnable = f3Var.dismissRunnable;
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        linearLayout2.setOrientation(1);
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        LimitPreviewView limitPreviewView2 = new LimitPreviewView(profileActivity.getParentActivity(), R.drawable.filled_rating_crown, 0, profileActivity.v0, 0);
        limitPreviewView2.setHideNegativeValues(profileActivity.a() != UserConfig.getInstance(profileActivity.currentAccount).getClientUserId());
        limitPreviewView2.setStarRating(userFull.stars_rating);
        limitPreviewView2.setTranslationY(-AndroidUtilities.dp(14.0f));
        linearLayout2.addView(limitPreviewView2, g7.e6.t(-1, -2, 17, 0, 20, 0, 10));
        int i11 = 17;
        if (userFull.stars_my_pending_rating != null) {
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            linearLayout2.addView(frameLayout, g7.e6.t(-1, -2, 17, 40, -12, 40, 20));
            TextView[] textViewArr = new org.telegram.ui.Components.l80[2];
            int i12 = 0;
            for (int i13 = 2; i12 < i13; i13 = 2) {
                fh.e4 e4Var = new fh.e4(parentActivity, 4, r52);
                textViewArr[i12] = e4Var;
                e4Var.setGravity(17);
                textViewArr[i12].setTextSize(1, 12.0f);
                textViewArr[i12].setTextColor(org.telegram.ui.ActionBar.f6.w0(r52, org.telegram.ui.ActionBar.f6.y6, false));
                textViewArr[i12].setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(r52, org.telegram.ui.ActionBar.f6.gc, false));
                frameLayout.addView(textViewArr[i12], g7.e6.e(-1, -1, 119));
                textViewArr[i12].setAlpha(i12 == 0 ? 1.0f : 0.0f);
                textViewArr[i12].setScaleX(i12 == 0 ? 1.0f : 0.8f);
                textViewArr[i12].setScaleY(i12 == 0 ? 1.0f : 0.8f);
                i12++;
                r52 = 0;
            }
            final w3 w3Var = new w3(textViewArr, i11);
            boolean z10 = profileActivity.a() == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId();
            long j10 = userFull.stars_rating.stars;
            TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
            linearLayout = linearLayout2;
            long j11 = (-j10) - (tl_starsRating != null ? tl_starsRating.stars - j10 : 0L);
            int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(profileActivity.currentAccount).getCurrentTime()) / 86400);
            long j12 = userFull.stars_my_pending_rating.stars;
            long j13 = userFull.stars_rating.stars;
            long j14 = j12 - j13;
            if ((j13 >= 0 || z10) && (!z10 || j11 <= 0)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                i10 = 0;
                spannableStringBuilder.append(TextUtils.concat(LocaleController.formatPluralStringComma("StarRatingFuture", max), "\n", LocaleController.formatPluralStringComma("StarRatingFuturePendingPoints", (int) j14)));
                spannableStringBuilder.append((CharSequence) " ");
                limitPreviewView = limitPreviewView2;
                spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreview), new Runnable() { // from class: org.telegram.ui.ux0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                w3Var.run(Boolean.TRUE);
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                w3Var.run(Boolean.FALSE);
                                break;
                        }
                    }
                }), true));
                textViewArr[0].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.vx0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                                w3Var.run(Boolean.TRUE);
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                                w3Var.run(Boolean.FALSE);
                                break;
                        }
                    }
                });
                textViewArr[0].setText(spannableStringBuilder);
            } else {
                boolean z11 = z10;
                textViewArr[0].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                if (z11) {
                    textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarRatingLevelNegativeYou", (int) j11)));
                } else {
                    textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarRatingLevelNegativeOther, DialogObject.getName(profileActivity.a()))));
                }
                limitPreviewView = limitPreviewView2;
                i10 = 0;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String formatPluralStringComma = LocaleController.formatPluralStringComma("StarRatingFuturePreview1", max);
            String formatPluralStringComma2 = LocaleController.formatPluralStringComma("StarRatingFuturePreview2", (int) j14);
            CharSequence[] charSequenceArr = new CharSequence[3];
            charSequenceArr[i10] = formatPluralStringComma;
            final int i14 = 1;
            charSequenceArr[1] = "\n";
            charSequenceArr[2] = formatPluralStringComma2;
            spannableStringBuilder2.append(TextUtils.concat(charSequenceArr));
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreviewBack), new Runnable() { // from class: org.telegram.ui.ux0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            TLRPC.UserFull userFull2 = userFull;
                            limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            w3Var.run(Boolean.TRUE);
                            break;
                        default:
                            TLRPC.UserFull userFull3 = userFull;
                            limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                            w3Var.run(Boolean.FALSE);
                            break;
                    }
                }
            }), true));
            textViewArr[1].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.vx0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            TLRPC.UserFull userFull2 = userFull;
                            limitPreviewView.d(userFull2.stars_rating, userFull2.stars_my_pending_rating);
                            w3Var.run(Boolean.TRUE);
                            break;
                        default:
                            TLRPC.UserFull userFull3 = userFull;
                            limitPreviewView.d(userFull3.stars_my_pending_rating, userFull3.stars_rating);
                            w3Var.run(Boolean.FALSE);
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
        int i15 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i15, profileActivity.v0));
        LinearLayout linearLayout3 = linearLayout;
        linearLayout3.addView(textView, g7.e6.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        if (userFull.id == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
            org.telegram.messenger.l0.m(R.string.StarRatingSelfDescription, textView2);
            i9 = 1;
        } else {
            i9 = 1;
            org.telegram.messenger.ll.q(R.string.StarRatingDescription, new Object[]{DialogObject.getName(profileActivity.a())}, textView2);
        }
        textView2.setTextSize(i9, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i15, profileActivity.v0));
        linearLayout3.addView(textView2, g7.e6.t(-1, -2, 17, 20, 0, 20, 12));
        qv0 qv0Var = new qv0(parentActivity, profileActivity.v0);
        qv0Var.a.l(LocaleController.getString(R.string.StarRatingTitle1), false);
        int i16 = R.string.StarRatingDescription1;
        String string = LocaleController.getString(R.string.StarRatingAdded);
        int i17 = org.telegram.ui.ActionBar.f6.Oh;
        qv0Var.b.setText(LocaleController.formatSpannable(i16, G3(org.telegram.ui.ActionBar.f6.v0(i17, profileActivity.v0), string)));
        qv0Var.d.setVisibility(8);
        int i18 = R.drawable.menu_gift;
        ImageView imageView = qv0Var.c;
        imageView.setImageResource(i18);
        imageView.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i15, profileActivity.v0));
        linearLayout3.addView(qv0Var, g7.e6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        qv0 qv0Var2 = new qv0(parentActivity, profileActivity.v0);
        qv0Var2.a.l(LocaleController.getString(R.string.StarRatingTitle2), false);
        qv0Var2.b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription2, G3(org.telegram.ui.ActionBar.f6.v0(i17, profileActivity.v0), LocaleController.getString(R.string.StarRatingAdded))));
        qv0Var2.d.setVisibility(8);
        int i19 = R.drawable.menu_stars_gift;
        ImageView imageView2 = qv0Var2.c;
        imageView2.setImageResource(i19);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i15, profileActivity.v0));
        linearLayout3.addView(qv0Var2, g7.e6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        qv0 qv0Var3 = new qv0(parentActivity, profileActivity.v0);
        qv0Var3.a.l(LocaleController.getString(R.string.StarRatingTitle3), false);
        qv0Var3.b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription3, G3(org.telegram.ui.ActionBar.f6.I.q() ? i0.a.d(0.25f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.m6, profileActivity.v0), -16777216) : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, profileActivity.v0), LocaleController.getString(R.string.StarRatingDeduces))));
        qv0Var3.d.setVisibility(8);
        int i20 = R.drawable.menu_refund;
        ImageView imageView3 = qv0Var3.c;
        imageView3.setImageResource(i20);
        imageView3.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i15, profileActivity.v0));
        linearLayout3.addView(qv0Var3, g7.e6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        kh.d dVar = new kh.d(parentActivity, profileActivity.v0, true);
        dVar.setOnClickListener(new wx0(0, runnable));
        dVar.g(gh.k5.g2(LocaleController.getString(R.string.Understood)), false, true);
        linearLayout3.addView(dVar, g7.e6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        f3Var.customView = linearLayout3;
        f3Var.show();
    }

    public static void i0(ProfileActivity profileActivity, TLRPC.User user) {
        if (profileActivity.V3 >= 0) {
            if (profileActivity.F4 == -1) {
                profileActivity.j5();
                profileActivity.d.l();
            } else {
                profileActivity.e5(false, false);
            }
        }
        if (profileActivity.F4 == -1) {
            if (profileActivity.j2 || AndroidUtilities.isTablet()) {
                profileActivity.a.setPadding(0, profileActivity.T3(), 0, 0);
                profileActivity.f2.cancel();
                float[] fArr = profileActivity.i2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.J4(1.0f);
                profileActivity.M1 = profileActivity.T3();
            } else {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (profileActivity.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredWidth(), TLObject.FLAG_30);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    vz0 vz0Var = profileActivity.d;
                    if (i9 >= vz0Var.e.J2) {
                        break;
                    }
                    f2.q1 g10 = vz0Var.g(null, vz0Var.j(i9));
                    View view = g10.a;
                    profileActivity.d.v(g10, i9);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i10 += view.getMeasuredHeight();
                    i9++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.T3() + i10) + currentActionBarHeight));
                by0 by0Var = profileActivity.a;
                by0Var.setPadding(0, by0Var.getPaddingTop(), 0, max);
            }
        }
        profileActivity.I.m(profileActivity.e1, user, 8);
    }

    public static /* synthetic */ void j0(ProfileActivity profileActivity, Context context, long j10, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            mh.u3.F0(context, profileActivity.currentAccount, profileActivity.r2.starref_program, profileActivity.getUserConfig().getClientUserId(), profileActivity.v0, false);
        } else {
            mh.u3.G0(context, profileActivity.currentAccount, connectedbotstarref, j10, profileActivity.v0);
        }
    }

    public static void k0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f10, boolean z10) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.r;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.Q1 = floatValue;
        float f11 = (floatValue - 0.5f) / 0.5f;
        float f12 = (0.5f - floatValue) / 0.5f;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        float f13 = -f10;
        profileActivity.P1 = (int) ((1.0f - floatValue) * f13);
        profileActivity.b.setTranslationY(floatValue * f10);
        profileActivity.L.setTranslationY(f10 * profileActivity.Q1);
        profileActivity.a.setTranslationY((1.0f - profileActivity.Q1) * f13);
        profileActivity.a.setScaleX(1.0f - ((1.0f - profileActivity.Q1) * 0.01f));
        profileActivity.a.setScaleY(1.0f - ((1.0f - profileActivity.Q1) * 0.01f));
        profileActivity.a.setAlpha(profileActivity.Q1);
        profileActivity.k4(true);
        profileActivity.a.setAlpha(f11);
        profileActivity.b.setAlpha(1.0f - profileActivity.Q1);
        profileActivity.b.setScaleX((profileActivity.Q1 * 0.05f) + 1.0f);
        profileActivity.b.setScaleY((profileActivity.Q1 * 0.05f) + 1.0f);
        profileActivity.L.setAlpha(1.0f - f11);
        profileActivity.U.setAlpha(f11);
        profileActivity.a0.setAlpha(f11);
        oy0 oy0Var = profileActivity.q0;
        if (oy0Var != null) {
            oy0Var.setAlpha(f11);
        }
        profileActivity.f[1].setAlpha(f11);
        h5VarArr[1].setAlpha(f11);
        h5VarArr[3].setAlpha(f11);
        profileActivity.Q0.getSearchField().setAlpha(f12);
        if (z10 && profileActivity.Q1 < 0.7f) {
            org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
            if (w0Var.B.getWidth() != 0 && !w0Var.e.isFocused()) {
                w0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(w0Var.e);
            }
        }
        profileActivity.Q0.getSearchContainer().setVisibility(profileActivity.Q1 < 0.5f ? 0 : 8);
        int i9 = profileActivity.Q1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.w0 w0Var2 = profileActivity.P0;
        if (w0Var2 != null) {
            w0Var2.setVisibility(i9);
            profileActivity.P0.setAlpha(f11);
        }
        profileActivity.Q0.setVisibility(i9);
        profileActivity.actionBar.v(profileActivity.Q1 < 0.5f);
        org.telegram.ui.ActionBar.w0 w0Var3 = profileActivity.P0;
        if (w0Var3 != null) {
            w0Var3.setAlpha(f11);
        }
        profileActivity.Q0.setAlpha(f11);
        profileActivity.Z0.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void l0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        org.telegram.ui.Components.iz0.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z10, z11, profileActivity.v0);
    }

    public static void m0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
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
            if (closestPhotoSizeWithSize != null && profileActivity.E2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.E2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(profileActivity.E2.volume_id);
                sb2.append("_");
                String l10 = aa.d.l(profileActivity.E2.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(l10, aa.d.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(profileActivity.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && profileActivity.F2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.F2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            profileActivity.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            profileActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.a1);
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
        profileActivity.k2 = (AndroidUtilities.isTablet() || profileActivity.j2 || !profileActivity.a0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
        profileActivity.E2 = null;
        profileActivity.F2 = null;
        my0 my0Var = profileActivity.j0;
        my0Var.D0 = true;
        my0Var.G0 = profileActivity.G2;
        my0Var.m1 = null;
        my0Var.n1 = null;
        my0Var.setCreateThumbFromParent(false);
        profileActivity.i5(true);
        profileActivity.P4(false, true);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        profileActivity.getUserConfig().saveConfig(true);
    }

    public static ProfileActivity m4(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new ProfileActivity(bundle, null);
    }

    public static void n1(ProfileActivity profileActivity, boolean z10) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f;
        org.telegram.ui.ActionBar.h5[] h5VarArr2 = profileActivity.r;
        int i9 = z10 ? 8 : 0;
        profileActivity.a.setVisibility(i9);
        profileActivity.b.setVisibility(z10 ? 0 : 8);
        profileActivity.Q0.getSearchContainer().setVisibility(z10 ? 0 : 8);
        gh.v0 v0Var = profileActivity.r0;
        if (v0Var != null) {
            v0Var.setActive(!z10);
        }
        profileActivity.actionBar.v(z10);
        profileActivity.U.setVisibility(i9);
        oy0 oy0Var = profileActivity.q0;
        if (oy0Var != null) {
            oy0Var.setVisibility(i9);
        }
        h5VarArr[1].setVisibility(i9);
        h5VarArr2[1].setVisibility(i9);
        h5VarArr2[3].setVisibility(i9);
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.P0;
        if (w0Var != null) {
            w0Var.setAlpha(1.0f);
            profileActivity.P0.setVisibility(i9);
        }
        profileActivity.Q0.setVisibility(i9);
        profileActivity.a0.setAlpha(1.0f);
        profileActivity.U.setAlpha(1.0f);
        oy0 oy0Var2 = profileActivity.q0;
        if (oy0Var2 != null) {
            oy0Var2.setAlpha(1.0f);
        }
        gh.v0 v0Var2 = profileActivity.r0;
        if (v0Var2 != null) {
            v0Var2.setAlpha(1.0f);
        }
        h5VarArr[1].setAlpha(1.0f);
        h5VarArr2[1].setAlpha(1.0f);
        profileActivity.Q0.setAlpha(1.0f);
        profileActivity.a.setAlpha(1.0f);
        profileActivity.b.setAlpha(1.0f);
        profileActivity.L.setAlpha(1.0f);
        if (z10) {
            profileActivity.b.setEmptyView(profileActivity.L);
        } else {
            profileActivity.L.setVisibility(8);
        }
    }

    public static void s3(ProfileActivity profileActivity, boolean z10) {
        Drawable drawable = profileActivity.a0.getImageReceiver().getDrawable();
        String str = null;
        if (drawable instanceof org.telegram.ui.Components.u51) {
            profileActivity.a0.u(null, null, drawable);
            return;
        }
        if (drawable instanceof org.telegram.ui.Components.x5) {
            org.telegram.ui.Components.x5 x5Var = (org.telegram.ui.Components.x5) drawable;
            profileActivity.a0.u(null, null, x5Var);
            if (z10) {
                x5Var.f(profileActivity.a0);
                return;
            }
            return;
        }
        ImageLocation D = profileActivity.j0.D(0);
        if (D != null && D.imageType == 2) {
            str = "avatar";
        }
        profileActivity.a0.u(D, str, drawable);
    }

    public final void A3() {
        f2.q1 q1Var;
        View view;
        if (this.a.getVisibility() != 0) {
            return;
        }
        if (this.M) {
            this.K.setVisibleHeight(this.a.getMeasuredHeight() - this.K.getTop());
        }
        if (this.a.getChildCount() <= 0 || this.C1) {
            return;
        }
        int i9 = 0;
        while (true) {
            if (i9 >= this.a.getChildCount()) {
                view = null;
                break;
            } else {
                if (RecyclerView.R(this.a.getChildAt(i9)) == 0) {
                    view = this.a.getChildAt(i9);
                    break;
                }
                i9++;
            }
        }
        if (view != null) {
            by0 by0Var = this.a;
            View F = by0Var.F(view);
            q1Var = (org.telegram.ui.Components.ik0) (F != null ? by0Var.T(F) : null);
        }
        int top = view == null ? 0 : view.getTop();
        int b10 = q1Var != null ? q1Var.b() : -1;
        if (top < 0 || b10 != 0) {
            top = 0;
        }
        boolean z10 = this.m0 == null && this.actionBar.j0;
        int i10 = this.F4;
        if (i10 != -1 && !z10) {
            org.telegram.ui.Components.ik0 ik0Var = (org.telegram.ui.Components.ik0) this.a.K(i10);
            z10 = ik0Var != null && ik0Var.a.getTop() <= 0;
        }
        if (this.B5 != z10) {
            this.B5 = z10;
            AnimatorSet animatorSet = this.y5;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.z5;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            org.telegram.ui.ActionBar.w0 searchItem = this.K.getSearchItem();
            org.telegram.ui.Components.pi0 searchOptionsItem = this.K.getSearchOptionsItem();
            TextView saveItem = this.K.getSaveItem();
            if (this.B5) {
                hz0 hz0Var = this.K;
                if (hz0Var.s0(hz0Var.g0[0].B)) {
                    searchItem.setVisibility(0);
                }
                if (searchOptionsItem != null) {
                    searchOptionsItem.setVisibility(0);
                }
                hz0 hz0Var2 = this.K;
                int i11 = hz0Var2.g0[0].B;
                if (i11 == 0 || org.telegram.ui.Components.eu0.p0(i11) || i11 == 11 || i11 == 13 || (i11 == 14 && hz0Var2.R != null)) {
                    this.K.n0.setVisibility(0);
                    this.K.A(true, false);
                } else {
                    this.K.n0.setVisibility(4);
                    this.K.A(false, false);
                }
            } else {
                if (this.H0) {
                    this.M0.setVisibility(0);
                }
                if (this.I0) {
                    this.N0.setVisibility(0);
                }
                if (this.J0) {
                    this.O0.setVisibility(0);
                }
                this.P0.setVisibility(0);
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
            org.telegram.ui.ActionBar.w0 w0Var = this.M0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.N0, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.O0, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 0.0f : 1.0f));
            org.telegram.ui.ActionBar.w0 w0Var2 = this.M0;
            Property property2 = View.TRANSLATION_Y;
            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.N0, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.O0, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, z10 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchItem, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchItem, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, z10 ? 0.0f : AndroidUtilities.dp(10.0f)));
            arrayList.add(ObjectAnimator.ofFloat(this.K.n0, (Property<ImageView, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.K.n0, (Property<ImageView, Float>) property2, z10 ? 0.0f : AndroidUtilities.dp(10.0f)));
            arrayList.add(ObjectAnimator.ofFloat(this.actionBar, this.C5, z10 ? 1.0f : 0.0f));
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.r;
            arrayList.add(ObjectAnimator.ofFloat(h5VarArr[1], (Property<org.telegram.ui.ActionBar.h5, Float>) property, z10 ? 0.0f : 1.0f));
            this.K.E0.setOpen(z10);
            int i12 = 3;
            if (this.o1) {
                arrayList.add(ObjectAnimator.ofFloat(h5VarArr[3], (Property<org.telegram.ui.ActionBar.h5, Float>) property, z10 ? 0.0f : 1.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.nn0, Float>) property, z10 ? 1.0f : 0.0f));
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this, this.f5, 0.0f));
            }
            if (this.q0 != null || this.r0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new kx0(this, i12));
                arrayList.add(ofFloat);
            }
            C3();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.y5 = animatorSet3;
            animatorSet3.playTogether(arrayList);
            this.y5.setInterpolator(org.telegram.ui.Components.gr.f);
            this.y5.addListener(new org.telegram.ui.Components.su0(9, this, searchItem));
            this.y5.setDuration(150L);
            this.y5.start();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        }
        float f10 = top;
        if (this.M1 == f10 || this.D1) {
            return;
        }
        this.M1 = f10;
        this.Z0.invalidate();
        if (this.F1 != 0) {
            this.I1 = this.M1 > ((float) O3());
        }
        k4(true);
    }

    public final void A4(int i9, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        boolean[] zArr = new boolean[1];
        ty0 ty0Var = new ty0(this, user.id, this.b1, tL_chatAdminRights, this.A2.default_banned_rights, tL_chatBannedRights, str, i9, zArr, user);
        ty0Var.T0 = new uy0(this, i9, chatParticipant, z10, zArr);
        presentFragment(ty0Var);
    }

    public final void B3() {
        int i9 = this.F1;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.r;
        if (i9 == 1 && (!this.h5 || this.C1)) {
            this.U5 = 0.0f;
        } else if (i9 == 2 && (!this.h5 || this.C1)) {
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
            this.U5 = h5Var == null ? 0.0f : h5Var.getAlpha();
        } else if (this.a1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            this.U5 = (1.0f - this.j5) * this.g2;
        } else {
            this.U5 = this.g2 * this.j5;
        }
        if (this.a1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
            if (this.m5) {
                org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[2];
                if (h5Var2 != null) {
                    h5Var2.setAlpha(this.U5);
                }
                g01 g01Var = this.X5;
                if (g01Var != null) {
                    g01Var.e = 1.0f - this.U5;
                    g01Var.invalidateSelf();
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[2];
            if (h5Var3 != null) {
                h5Var3.setAlpha(0.0f);
            }
            g01 g01Var2 = this.X5;
            if (g01Var2 != null) {
                g01Var2.e = 1.0f;
                g01Var2.invalidateSelf();
                return;
            }
            return;
        }
        if (!this.l5) {
            org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr[2];
            if (h5Var4 != null) {
                h5Var4.setAlpha(0.0f);
                h5VarArr[3].setAlpha(0.0f);
            }
            g01 g01Var3 = this.X5;
            if (g01Var3 != null) {
                g01Var3.e = 1.0f;
                g01Var3.invalidateSelf();
                return;
            }
            return;
        }
        this.k5 = AndroidUtilities.dp(28.0f) * this.U5;
        org.telegram.ui.ActionBar.h5 h5Var5 = h5VarArr[2];
        if (h5Var5 != null) {
            h5Var5.setAlpha(this.g2);
            h5VarArr[3].setAlpha(1.0f - this.g2);
            h5VarArr[1].setTranslationX(W3(this.V5));
            this.V.invalidate();
            g01 g01Var4 = this.X5;
            if (g01Var4 != null) {
                g01Var4.e = 1.0f - this.g2;
                g01Var4.invalidateSelf();
            }
        }
    }

    public final void B4(String str, org.telegram.ui.Cells.h hVar) {
        if (str.startsWith("@")) {
            getMessagesController().openByUserName(str.substring(1), this, 0, hVar);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            dy dyVar = new dy(null);
            dyVar.j2 = str;
            presentFragment(dyVar);
        } else {
            if (!str.startsWith("/") || this.parentLayout.getFragmentStack().size() <= 1) {
                return;
            }
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if (o2Var instanceof qn) {
                finishFragment();
                ((qn) o2Var).U.a1(null, str, false, false);
            }
        }
    }

    @Override // org.telegram.ui.wx
    public final /* synthetic */ boolean C() {
        return false;
    }

    public final void C3() {
        org.telegram.ui.Components.qv0 qv0Var = this.P;
        if (qv0Var != null) {
            qv0Var.setVisibility(!this.B5 && this.D5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0472  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C4(float f10, float f11, int i9, View view) {
        TLRPC.Chat chat;
        String publicUsername;
        TLRPC.TL_username findUsername;
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
        int i11 = 1;
        int i12 = 0;
        if (i9 == this.H3 || i9 == this.R2) {
            if (this.a1 == 0) {
                if (this.b1 != 0 && (chat = getMessagesController().getChat(Long.valueOf(this.b1))) != null && (this.c1 != 0 || ChatObject.isPublic(chat))) {
                    publicUsername = ChatObject.getPublicUsername(chat);
                    findUsername = DialogObject.findUsername(publicUsername, chat);
                    if (this.a1 != 0) {
                    }
                }
                return false;
            }
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.a1));
            publicUsername = UserObject.getPublicUsername(user);
            if (user != null && publicUsername != null) {
                findUsername = DialogObject.findUsername(publicUsername, user);
                if (this.a1 != 0) {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.b1));
                    if (ChatObject.isPublic(chat2)) {
                        StringBuilder sb3 = new StringBuilder("https://");
                        sb3.append(getMessagesController().linkPrefix);
                        sb3.append("/");
                        sb3.append(ChatObject.getPublicUsername(chat2));
                        if (this.c1 != 0) {
                            str3 = "/" + this.c1;
                        }
                        sb3.append(str3);
                        sb2 = sb3.toString();
                    } else {
                        StringBuilder sb4 = new StringBuilder("https://");
                        sb4.append(getMessagesController().linkPrefix);
                        sb4.append("/c/");
                        sb4.append(chat2.id);
                        if (this.c1 != 0) {
                            str3 = "/" + this.c1;
                        }
                        sb4.append(str3);
                        sb2 = sb4.toString();
                    }
                    vy0 vy0Var = new vy0(this, getParentActivity(), sb2, sb2);
                    showDialog(vy0Var);
                    if (findUsername != null && !findUsername.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername.username = findUsername.username;
                        tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo, new kr0(this, findUsername, vy0Var, i10)), getClassGuid());
                        return true;
                    }
                } else if (!J3(i9, view3)) {
                    if (findUsername != null && !findUsername.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo2 = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername2 = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername2.username = findUsername.username;
                        tL_getCollectibleInfo2.collectible = tL_inputCollectibleUsername2;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo2, new v40(23, this, findUsername)), getClassGuid());
                        return true;
                    }
                    try {
                        org.telegram.ui.Components.oc.a0(this).i(LocaleController.getString(R.string.UsernameCopied)).j();
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "@" + publicUsername));
                        return true;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return true;
                    }
                }
            }
            return false;
            return true;
        }
        if (i9 != this.D3) {
            int i13 = 2;
            if (i9 == this.C3 || i9 == this.P2) {
                if (!J3(i9, view3)) {
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.a1));
                    if (user2 != null && (str = user2.phone) != null && str.length() != 0 && getParentActivity() != null) {
                        if (i9 == this.C3 && user2.phone.startsWith("888")) {
                            TL_fragment.TL_inputCollectiblePhone tL_inputCollectiblePhone = new TL_fragment.TL_inputCollectiblePhone();
                            String str4 = user2.phone;
                            tL_inputCollectiblePhone.phone = str4;
                            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo3 = new TL_fragment.TL_getCollectibleInfo();
                            tL_getCollectibleInfo3.collectible = tL_inputCollectiblePhone;
                            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo3, new kr0(this, str4, user2, 5)), getClassGuid());
                            return true;
                        }
                        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(this, view3);
                        H.W(this.a.V0(view3, false));
                        H.w = false;
                        if (i9 == this.C3) {
                            TLRPC.UserFull userFull3 = this.r2;
                            if (userFull3 != null && userFull3.phone_calls_available) {
                                H.c(R.drawable.msg_calls, LocaleController.getString(R.string.CallViaTelegram), new dx0(this, user2, i11), false);
                                if (this.r2.video_calls_available) {
                                    H.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new dx0(this, user2, i13), false);
                                }
                            }
                            if (!this.X4) {
                                H.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.Call), new dx0(this, user2, 3), false);
                            }
                        }
                        H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new dx0(this, user2, i10), false);
                        if (this.X4) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AnonymousNumberNotice)));
                            int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                            int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                                int i14 = lastIndexOf - 1;
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), indexOf, i14, 33);
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I6, this.v0)), indexOf, i14, 33);
                            }
                            H.k();
                            H.p(13, AndroidUtilities.dp(200.0f), spannableStringBuilder);
                            if (H.z() instanceof TextView) {
                                TextView textView = (TextView) H.z();
                                textView.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I5, this.v0), 0, 6));
                                textView.setOnClickListener(new fh.n(24));
                            }
                        }
                        H.Z();
                        return true;
                    }
                }
                return true;
            }
            if (i9 == this.G3 || i9 == this.F3 || i9 == this.E3 || i9 == this.S2) {
                if (i9 != this.S2 || ((userFull = this.r2) != null && !TextUtils.isEmpty(userFull.about))) {
                    if (!J3(i9, view3)) {
                        if (view3 instanceof org.telegram.ui.Cells.j) {
                            org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view3;
                            if (jVar.S && jVar.P <= 0.0f) {
                                jVar.h();
                                return false;
                            }
                        }
                        String str5 = null;
                        if (i9 == this.E3) {
                            TLRPC.ChatFull chatFull = this.q2;
                            if (chatFull != null) {
                                TLRPC.ChannelLocation channelLocation = chatFull.location;
                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                    str5 = ((TLRPC.TL_channelLocation) channelLocation).address;
                                }
                            }
                        } else if (i9 == this.G3) {
                            TLRPC.ChatFull chatFull2 = this.q2;
                            if (chatFull2 != null) {
                                str5 = chatFull2.about;
                            }
                        } else {
                            TLRPC.UserFull userFull4 = this.r2;
                            if (userFull4 != null) {
                                str5 = userFull4.about;
                            }
                        }
                        String str6 = str5;
                        if (!TextUtils.isEmpty(str6)) {
                            String[] strArr = {TranslateController.UNKNOWN_LANGUAGE};
                            boolean isContextTranslateEnabled = MessagesController.getInstance(this.currentAccount).getTranslateController().isContextTranslateEnabled();
                            boolean[] zArr = {i9 == this.S2 || i9 == this.G3 || i9 == this.F3};
                            String A = org.telegram.ui.Components.z21.A();
                            fh.u2 u2Var = new fh.u2(this, view3, str6, i9, zArr, strArr, A);
                            if (!zArr[0]) {
                                u2Var.run();
                                return true;
                            }
                            if (LanguageDetector.hasSupport()) {
                                LanguageDetector.detectLanguage(str6, new org.telegram.messenger.cj(this, strArr, zArr, A, isContextTranslateEnabled, u2Var), new dl0(u2Var, 12));
                                return true;
                            }
                            u2Var.run();
                            return true;
                        }
                    }
                    return true;
                }
            } else if ((i9 == this.K3 || i9 == this.L3) && getParentActivity() != null && (userFull2 = this.r2) != null) {
                if (i9 != this.K3) {
                    if (i9 == this.L3 && !J3(i9, view3)) {
                        TLRPC.TL_businessLocation tL_businessLocation = this.r2.business_location;
                        if (tL_businessLocation != null) {
                            str2 = tL_businessLocation.address;
                            String str7 = str2;
                            AtomicReference atomicReference = new AtomicReference();
                            org.telegram.ui.Components.co coVar = new org.telegram.ui.Components.co(getParentActivity(), R.drawable.popup_fixed_alert, i12, this.v0, 1);
                            coVar.Q = new Path();
                            coVar.setFitItems(true);
                            org.telegram.ui.ActionBar.w0.c(false, false, coVar, R.drawable.msg_copy, LocaleController.getString(R.string.Copy), false, this.v0).setOnClickListener(new ih.p5(this, atomicReference, str7, i9, 5));
                            org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(coVar, -2, -2);
                            o1Var.e = true;
                            o1Var.c = 220;
                            o1Var.setOutsideTouchable(true);
                            o1Var.setClippingEnabled(true);
                            o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                            o1Var.setFocusable(true);
                            coVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            o1Var.setInputMethodMode(2);
                            o1Var.getContentView().setFocusableInTouchMode(true);
                            atomicReference.set(o1Var);
                            f12 = f10;
                            f13 = f11;
                            while (view3 != null) {
                                f12 += view3.getX();
                                f13 += view3.getY();
                                view3 = (View) view3.getParent();
                            }
                            if (AndroidUtilities.isTablet()) {
                                f12 += view2.getX() + view2.getPaddingLeft();
                                f13 += view2.getY() + view2.getPaddingTop();
                            }
                            o1Var.showAtLocation(getFragmentView(), 0, (int) (f12 - (coVar.getMeasuredWidth() / 2.0f)), (int) f13);
                            o1Var.b();
                            return true;
                        }
                    }
                    return true;
                }
                TL_account.TL_businessWorkHours tL_businessWorkHours = userFull2.business_work_hours;
                if (tL_businessWorkHours != null) {
                    str2 = pf.y0.e0(this.currentAccount, userFull2.user, tL_businessWorkHours);
                    String str72 = str2;
                    AtomicReference atomicReference2 = new AtomicReference();
                    org.telegram.ui.Components.co coVar2 = new org.telegram.ui.Components.co(getParentActivity(), R.drawable.popup_fixed_alert, i12, this.v0, 1);
                    coVar2.Q = new Path();
                    coVar2.setFitItems(true);
                    org.telegram.ui.ActionBar.w0.c(false, false, coVar2, R.drawable.msg_copy, LocaleController.getString(R.string.Copy), false, this.v0).setOnClickListener(new ih.p5(this, atomicReference2, str72, i9, 5));
                    org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(coVar2, -2, -2);
                    o1Var2.e = true;
                    o1Var2.c = 220;
                    o1Var2.setOutsideTouchable(true);
                    o1Var2.setClippingEnabled(true);
                    o1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                    o1Var2.setFocusable(true);
                    coVar2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    o1Var2.setInputMethodMode(2);
                    o1Var2.getContentView().setFocusableInTouchMode(true);
                    atomicReference2.set(o1Var2);
                    f12 = f10;
                    f13 = f11;
                    while (view3 != null && view3 != getFragmentView()) {
                        f12 += view3.getX();
                        f13 += view3.getY();
                        view3 = (View) view3.getParent();
                    }
                    if (AndroidUtilities.isTablet() && (view2 = this.parentLayout.getView()) != null) {
                        f12 += view2.getX() + view2.getPaddingLeft();
                        f13 += view2.getY() + view2.getPaddingTop();
                    }
                    o1Var2.showAtLocation(getFragmentView(), 0, (int) (f12 - (coVar2.getMeasuredWidth() / 2.0f)), (int) f13);
                    o1Var2.b();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.d40
    public final void D(float f10) {
        org.telegram.ui.Cells.z3 z3Var = this.c0;
        if (z3Var == null) {
            return;
        }
        z3Var.setProgress(f10);
        this.j0.O(this.G2, f10);
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
        org.telegram.ui.Components.pg0 pg0Var;
        yz0 yz0Var;
        hz0 hz0Var;
        boolean z27;
        org.telegram.ui.Components.pg0 pg0Var2;
        boolean z28;
        long j10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || this.P0 == null) {
            return;
        }
        Context context = kVar.getContext();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.P0.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        this.L0 = null;
        this.J0 = false;
        this.H0 = false;
        this.G0 = false;
        this.I0 = false;
        this.w1 = false;
        if (this.a1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.a1));
            if (user == null) {
                return;
            }
            if (UserObject.isUserSelf(user)) {
                if (this.o1) {
                    org.telegram.ui.Components.pg0 pg0Var3 = this.W;
                    if (pg0Var3 != null) {
                        this.J0 = !(pg0Var3.D == 6);
                    } else {
                        this.J0 = true;
                    }
                }
                if (!this.E0) {
                    this.P0.e(30, R.drawable.msg_edit, LocaleController.getString(R.string.EditInfo));
                    if (this.m0 != null) {
                        this.P0.e(36, R.drawable.msg_addphoto, LocaleController.getString(R.string.AddPhoto));
                    }
                }
                this.R0 = this.P0.e(40, R.drawable.menu_profile_colors, LocaleController.getString(R.string.ProfileColorEdit));
                W4();
                if (this.o1) {
                    this.T0 = this.P0.e(43, R.drawable.menu_username_change, LocaleController.getString(R.string.ProfileUsernameEdit));
                    this.S0 = this.P0.e(42, R.drawable.msg_link2, LocaleController.getString(R.string.ProfileCopyLink));
                    c5();
                }
                z11 = false;
                z28 = false;
                z13 = true;
            } else {
                if (user.bot && user.bot_can_edit) {
                    this.J0 = true;
                }
                TLRPC.UserFull userFull = this.r2;
                if (userFull != null && userFull.phone_calls_available) {
                    this.H0 = true;
                    this.I0 = userFull.video_calls_available;
                }
                if (!this.n2 && getContactsController().contactsDict.get(Long.valueOf(this.a1)) != null) {
                    if (this.z2 == null) {
                        E3(context);
                    }
                    if (!TextUtils.isEmpty(user.phone)) {
                        this.P0.e(3, R.drawable.msg_share, LocaleController.getString(R.string.ShareContact));
                    }
                    this.P0.e(2, R.drawable.msg_block, LocaleController.getString(!this.g1 ? R.string.BlockContact : R.string.Unblock));
                    this.P0.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditContact));
                    this.P0.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteContact));
                } else if (MessagesController.isSupportUser(user)) {
                    if (this.g1) {
                        this.P0.e(2, R.drawable.msg_block, LocaleController.getString(R.string.Unblock));
                    }
                    this.P0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                } else if (a() != UserObject.VERIFY) {
                    if (this.z2 == null) {
                        E3(context);
                    }
                    this.P0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    if (this.n2) {
                        this.P0.e(10, R.drawable.msg_share, LocaleController.getString(R.string.BotShare));
                        z11 = true;
                    } else {
                        this.P0.e(1, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddContact));
                        z11 = false;
                    }
                    if (!TextUtils.isEmpty(user.phone)) {
                        this.P0.e(3, R.drawable.msg_share, LocaleController.getString(R.string.ShareContact));
                    }
                    if (this.n2) {
                        this.P0.e(44, R.drawable.menu_privacy_policy, LocaleController.getString(R.string.BotPrivacyPolicy));
                        if (e4()) {
                            this.P0.K(44);
                        } else {
                            this.P0.r(44);
                        }
                        org.telegram.ui.ActionBar.g1 e10 = this.P0.e(24, R.drawable.msg_report, LocaleController.getString(R.string.ReportBot));
                        int i9 = org.telegram.ui.ActionBar.f6.p7;
                        e10.c(org.telegram.ui.ActionBar.f6.v0(i9, this.v0), org.telegram.ui.ActionBar.f6.v0(i9, this.v0));
                        if (this.g1) {
                            this.P0.e(2, R.drawable.msg_retry, LocaleController.getString(R.string.BotRestart));
                        } else {
                            this.P0.e(2, R.drawable.msg_block2, LocaleController.getString(R.string.DeleteAndBlock)).c(org.telegram.ui.ActionBar.f6.v0(i9, this.v0), org.telegram.ui.ActionBar.f6.v0(i9, this.v0));
                        }
                    } else {
                        this.P0.e(2, R.drawable.msg_block, LocaleController.getString(!this.g1 ? R.string.BlockContact : R.string.Unblock));
                    }
                    if (!UserObject.isDeleted(user) && !this.n2 && this.z2 == null && !this.g1) {
                        j10 = this.a1;
                        if (j10 != 333000 && j10 != 777000 && j10 != 42777) {
                            if (!BuildVars.IS_BILLING_UNAVAILABLE || user.self || user.bot || MessagesController.isSupportUser(user) || getMessagesController().premiumPurchaseBlocked()) {
                                z28 = false;
                            } else {
                                gh.v7.y(this.currentAccount, false).V();
                                this.P0.e(38, R.drawable.msg_gift_premium, LocaleController.getString(R.string.ProfileSendAGift));
                                z28 = true;
                            }
                            this.P0.e(20, R.drawable.msg_secret, LocaleController.getString(R.string.StartEncryptedChat));
                            this.P0.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.a1)));
                            if (this.r2 != null) {
                                this.P0.e(46, R.drawable.menu_share_off_24, LocaleController.getString(R.string.DisableSharing));
                                this.P0.e(47, R.drawable.menu_share_on_24, LocaleController.getString(R.string.EnableSharing));
                                TLRPC.UserFull userFull2 = this.r2;
                                boolean z29 = (userFull2.noforwards_my_enabled || userFull2.noforwards_peer_enabled) ? false : true;
                                this.P0.I(46, z29);
                                this.P0.I(47, !z29);
                            }
                            if (!this.n2 && getContactsController().contactsDict.get(Long.valueOf(this.a1)) != null) {
                                this.P0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                            }
                            z13 = false;
                        }
                    }
                    z28 = false;
                    if (!this.n2) {
                        this.P0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    }
                    z13 = false;
                }
                z11 = false;
                if (!UserObject.isDeleted(user)) {
                    j10 = this.a1;
                    if (j10 != 333000) {
                        if (BuildVars.IS_BILLING_UNAVAILABLE) {
                        }
                        z28 = false;
                        this.P0.e(20, R.drawable.msg_secret, LocaleController.getString(R.string.StartEncryptedChat));
                        this.P0.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.a1)));
                        if (this.r2 != null) {
                        }
                        if (!this.n2) {
                        }
                        z13 = false;
                    }
                }
                z28 = false;
                if (!this.n2) {
                }
                z13 = false;
            }
            z14 = z28;
            z12 = false;
        } else {
            if (this.b1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.b1));
                this.l1 = false;
                if (this.c1 == 0 && ChatObject.canChangeChatInfo(chat)) {
                    E3(context);
                }
                if (!ChatObject.isChannel(chat)) {
                    if (this.q2 != null) {
                        if (ChatObject.canManageCalls(chat) && this.q2.call == null) {
                            this.P0.e(15, R.drawable.msg_voicechat, LocaleController.getString(R.string.StartVoipChat));
                            this.l1 = true;
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        ChatObject.Call groupCall = getMessagesController().getGroupCall(this.b1, false);
                        this.H0 = groupCall != null;
                        if (groupCall != null || z19) {
                            z15 = true;
                            if (ChatObject.canChangeChatInfo(chat)) {
                                this.J0 = true;
                            }
                            if (!ChatObject.isKickedFromChat(chat) && !ChatObject.isLeftFromChat(chat) && ((chatFull = this.q2) == null || !chatFull.participants_hidden || ChatObject.hasAdminRights(chat))) {
                                this.w1 = true;
                                this.P0.e(17, R.drawable.msg_search, LocaleController.getString(R.string.SearchMembers));
                            }
                            if (this.c1 == 0) {
                                this.P0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                            }
                            this.P0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.DeleteAndExit));
                            z12 = z15;
                            z11 = false;
                            z13 = false;
                            z14 = false;
                            z16 = false;
                            z17 = false;
                            z18 = true;
                            z23 = false;
                            if (this.m0 == null) {
                            }
                            if (g4()) {
                            }
                            if (this.a1 != 0) {
                                org.telegram.ui.ActionBar.g1 e11 = this.P0.e(24, R.drawable.msg_report, LocaleController.getString(R.string.ReportBot));
                                int i10 = org.telegram.ui.ActionBar.f6.p7;
                                e11.c(org.telegram.ui.ActionBar.f6.v0(i10, this.v0), org.telegram.ui.ActionBar.f6.v0(i10, this.v0));
                            }
                            if (z13) {
                                this.P0.e(31, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
                            }
                            if (!this.l2) {
                            }
                            this.G0 = this.H0;
                            pg0Var = this.W;
                            if (pg0Var != null) {
                            }
                            if (!this.B5) {
                            }
                            yz0Var = this.k0;
                            if (yz0Var != null) {
                                if (this.J0) {
                                }
                                if (this.H0) {
                                }
                                if (this.I0) {
                                }
                            }
                            hz0Var = this.K;
                            if (hz0Var != null) {
                            }
                            l5(false);
                        }
                    }
                    z15 = false;
                    if (ChatObject.canChangeChatInfo(chat)) {
                    }
                    if (!ChatObject.isKickedFromChat(chat)) {
                        this.w1 = true;
                        this.P0.e(17, R.drawable.msg_search, LocaleController.getString(R.string.SearchMembers));
                    }
                    if (this.c1 == 0) {
                    }
                    this.P0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.DeleteAndExit));
                    z12 = z15;
                    z11 = false;
                    z13 = false;
                    z14 = false;
                    z16 = false;
                    z17 = false;
                    z18 = true;
                    z23 = false;
                    if (this.m0 == null) {
                    }
                    if (g4()) {
                    }
                    if (this.a1 != 0) {
                    }
                    if (z13) {
                    }
                    if (!this.l2) {
                    }
                    this.G0 = this.H0;
                    pg0Var = this.W;
                    if (pg0Var != null) {
                    }
                    if (!this.B5) {
                    }
                    yz0Var = this.k0;
                    if (yz0Var != null) {
                    }
                    hz0Var = this.K;
                    if (hz0Var != null) {
                    }
                    l5(false);
                }
                if (this.m1) {
                    if (ChatObject.canManageTopic(this.currentAccount, chat, this.c1)) {
                        this.J0 = true;
                    }
                } else if (ChatObject.hasAdminRights(chat) || (chat.megagroup && ChatObject.canChangeChatInfo(chat))) {
                    this.J0 = true;
                }
                if (this.q2 != null) {
                    if (ChatObject.canManageCalls(chat) && this.q2.call == null) {
                        this.P0.e(15, R.drawable.msg_voicechat, LocaleController.getString((!chat.megagroup || chat.gigagroup) ? R.string.StartVoipChannel : R.string.StartVoipChat));
                        this.l1 = true;
                        if (!chat.megagroup || chat.gigagroup) {
                            z26 = false;
                            z21 = true;
                            chatFull2 = this.q2;
                            if ((!chatFull2.can_view_stats || chatFull2.can_view_revenue || chatFull2.can_view_stars_revenue || getMessagesController().getStoriesController().j(a())) && this.c1 == 0) {
                                this.P0.e(19, R.drawable.msg_stats, LocaleController.getString(R.string.Statistics));
                            }
                            ChatObject.Call groupCall2 = getMessagesController().getGroupCall(this.b1, false);
                            this.H0 = groupCall2 == null;
                            z20 = groupCall2 == null || z26;
                        } else {
                            z26 = true;
                        }
                    } else {
                        z26 = false;
                    }
                    z21 = false;
                    chatFull2 = this.q2;
                    if (!chatFull2.can_view_stats) {
                    }
                    this.P0.e(19, R.drawable.msg_stats, LocaleController.getString(R.string.Statistics));
                    ChatObject.Call groupCall22 = getMessagesController().getGroupCall(this.b1, false);
                    this.H0 = groupCall22 == null;
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
                        this.P0.e(39, R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories));
                    }
                    z22 = false;
                } else {
                    this.P0.e(39, R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories));
                    z22 = true;
                }
                if (chat.megagroup) {
                    TLRPC.ChatFull chatFull3 = this.q2;
                    if (chatFull3 == null || !chatFull3.participants_hidden || ChatObject.hasAdminRights(chat)) {
                        this.w1 = true;
                        this.P0.e(17, R.drawable.msg_search, LocaleController.getString(R.string.SearchMembers));
                    }
                    if (this.m1) {
                        z23 = z21;
                        if (ChatObject.canDeleteTopic(this.currentAccount, chat, this.c1)) {
                            this.P0.e(23, R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1));
                        }
                    } else {
                        z23 = z21;
                    }
                    if (this.c1 == 0) {
                        this.P0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    }
                    if (chat.creator) {
                        this.P0.a(-1);
                        this.P0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMega));
                        this.P0.e(45, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteMega)).c(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q7, this.v0), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p7, this.v0));
                    } else if (chat.left || chat.kicked || this.m1) {
                        z12 = z20;
                        z16 = z22;
                        z11 = false;
                        z13 = false;
                        z14 = false;
                        z17 = false;
                        z18 = false;
                    } else {
                        this.P0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMega));
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
                        this.P0.e(10, R.drawable.msg_share, LocaleController.getString(R.string.BotShare));
                        z24 = !chat.creator;
                    } else {
                        z24 = false;
                    }
                    if (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked()) {
                        z14 = false;
                    } else {
                        gh.v7.y(this.currentAccount, false).V();
                        this.P0.e(38, R.drawable.msg_gift_premium, LocaleController.getString(R.string.ProfileSendAGiftToChannel));
                        org.telegram.ui.ActionBar.w0 w0Var = this.P0;
                        TLRPC.ChatFull chatFull4 = this.q2;
                        w0Var.I(38, chatFull4 != null && chatFull4.stargifts_available);
                        z14 = true;
                    }
                    TLRPC.ChatFull chatFull5 = this.q2;
                    if (chatFull5 == null || chatFull5.linked_chat_id == 0) {
                        z25 = false;
                    } else {
                        this.P0.e(22, R.drawable.msg_discussion, LocaleController.getString(R.string.ViewDiscussion));
                        z25 = true;
                    }
                    if (this.c1 == 0) {
                        this.P0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    }
                    TLRPC.Chat chat2 = this.A2;
                    if (chat2.creator) {
                        this.P0.a(-1);
                        this.P0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveChannel));
                        this.P0.e(45, R.drawable.msg_delete, LocaleController.getString(R.string.ChannelDelete)).c(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q7, this.v0), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p7, this.v0));
                    } else if (chat2.left || chat2.kicked) {
                        boolean z30 = z24;
                        z12 = z20;
                        z11 = z30;
                        z17 = z25;
                        z18 = false;
                        z16 = z22;
                        z13 = false;
                    } else {
                        this.P0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveChannel));
                    }
                    boolean z31 = z24;
                    z12 = z20;
                    z11 = z31;
                    z17 = z25;
                    z18 = true;
                    z16 = z22;
                    z13 = false;
                }
                if (this.m0 == null) {
                    this.P0.e(33, R.drawable.msg_openprofile, LocaleController.getString(R.string.SetAsMain));
                    this.P0.e(21, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery));
                    this.P0.e(35, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
                } else {
                    this.P0.e(21, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery));
                }
                if (g4()) {
                    this.P0.r(21);
                }
                if (this.a1 != 0 && !this.n2 && !this.o1) {
                    org.telegram.ui.ActionBar.g1 e112 = this.P0.e(24, R.drawable.msg_report, LocaleController.getString(R.string.ReportBot));
                    int i102 = org.telegram.ui.ActionBar.f6.p7;
                    e112.c(org.telegram.ui.ActionBar.f6.v0(i102, this.v0), org.telegram.ui.ActionBar.f6.v0(i102, this.v0));
                }
                if (z13 && !this.o1) {
                    this.P0.e(31, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
                }
                if (!this.l2) {
                    this.P0.r(21);
                    this.P0.r(33);
                    this.P0.K(36);
                    this.P0.r(34);
                    this.P0.r(35);
                }
                this.G0 = this.H0;
                pg0Var = this.W;
                if (pg0Var != null) {
                    pg0Var.E = true;
                    pg0Var.o(4, z11);
                    this.W.o(5, this.H0);
                    this.W.o(6, this.I0);
                    this.W.o(2, z17);
                    this.W.o(9, z18);
                    this.W.o(12, z16);
                    this.W.o(10, z12);
                    this.W.o(11, z23);
                    this.W.o(3, z14);
                    this.I0 = false;
                    this.H0 = false;
                    if (!z17) {
                        if (this.m1) {
                            this.W.o(0, true);
                        } else if (this.b1 != 0) {
                            TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(this.b1));
                            if (ChatObject.isForum(chat3) || ChatObject.isMegagroup(chat3)) {
                                z27 = false;
                                this.W.o(0, true);
                            } else if (!ChatObject.isChannel(chat3)) {
                                z27 = false;
                                this.W.o(0, true);
                            }
                            pg0Var2 = this.W;
                            if (pg0Var2.E) {
                                pg0Var2.E = z27;
                                pg0Var2.d();
                            }
                        }
                    }
                    z27 = false;
                    pg0Var2 = this.W;
                    if (pg0Var2.E) {
                    }
                }
                if (!this.B5) {
                    if (this.H0) {
                        if (this.M0.getVisibility() != 0) {
                            this.M0.setVisibility(0);
                            if (z10) {
                                this.M0.setAlpha(0.0f);
                                this.M0.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    } else if (this.M0.getVisibility() != 8) {
                        this.M0.setVisibility(8);
                    }
                    if (this.I0) {
                        if (this.N0.getVisibility() != 0) {
                            this.N0.setVisibility(0);
                            if (z10) {
                                this.N0.setAlpha(0.0f);
                                this.N0.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    } else if (this.N0.getVisibility() != 8) {
                        this.N0.setVisibility(8);
                    }
                    if (this.J0) {
                        if (this.O0.getVisibility() != 0) {
                            this.O0.setVisibility(0);
                            if (z10) {
                                this.O0.setAlpha(0.0f);
                                this.O0.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    } else if (this.O0.getVisibility() != 8) {
                        this.O0.setVisibility(8);
                    }
                }
                yz0Var = this.k0;
                if (yz0Var != null && yz0Var.h && !yz0Var.d.isRunning()) {
                    if (this.J0) {
                        this.O0.setVisibility(8);
                        this.O0.animate().cancel();
                        this.O0.setAlpha(1.0f);
                    }
                    if (this.H0) {
                        this.M0.setVisibility(8);
                        this.M0.animate().cancel();
                        this.M0.setAlpha(1.0f);
                    }
                    if (this.I0) {
                        this.N0.setVisibility(8);
                        this.N0.animate().cancel();
                        this.N0.setAlpha(1.0f);
                    }
                }
                hz0Var = this.K;
                if (hz0Var != null) {
                    hz0Var.getSearchItem().requestLayout();
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
        if (this.m0 == null) {
        }
        if (g4()) {
        }
        if (this.a1 != 0) {
        }
        if (z13) {
        }
        if (!this.l2) {
        }
        this.G0 = this.H0;
        pg0Var = this.W;
        if (pg0Var != null) {
        }
        if (!this.B5) {
        }
        yz0Var = this.k0;
        if (yz0Var != null) {
        }
        hz0Var = this.K;
        if (hz0Var != null) {
        }
        l5(false);
    }

    public final void D4() {
        ValueAnimator valueAnimator;
        if (!this.l2 || (valueAnimator = this.f2) == null || !valueAnimator.isRunning()) {
            E4(y3(), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        } else {
            this.a2 = this.G5;
            this.c2 = this.H5;
        }
    }

    @Override // org.telegram.ui.Components.qs0
    public final void E() {
        G4(false);
    }

    public final void E3(Context context) {
        this.W0 = new org.telegram.ui.Components.h8(context, this.P0.getPopupLayout().getSwipeBack(), new ay0(this), false, 0, this.v0);
        if (this.e1 > 0 || this.a1 > 0) {
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.n6, this.v0);
            org.telegram.ui.Components.h8 h8Var = this.W0;
            org.telegram.ui.Components.l80 l80Var = h8Var.e;
            if (l80Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AutoDeletePopupDescription));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.AutoDeletePopupDescription2), v02, new org.telegram.ui.Components.fg(h8Var, 10)));
                l80Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.r2;
        org.telegram.ui.Components.b11 a2 = org.telegram.ui.Components.b11.a((userFull == null && this.q2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.q2.ttl_period);
        this.o0 = a2;
        this.V0 = this.P0.i(0, a2, LocaleController.getString(R.string.AutoDeletePopupTitle), this.W0.a);
        this.P0.a(-1);
        T4();
    }

    public final void E4(float f10, float f11) {
        float max = Math.max(0.0f, Math.min(1.0f, (this.M1 - T3()) / ((this.a.getMeasuredWidth() - f11) - U3())));
        float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (AndroidUtilities.dp(42.0f) * ((this.M1 >= ((float) T3()) || max >= 0.33f) ? AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) : e2.c.y(f10, 72.0f, 24.0f, 42.0f)))) * f10) + ((float) Math.floor(this.actionBar.getTranslationY() + ((((1.0f + f10) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f)) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f))));
        this.a2 = (AndroidUtilities.dp(7.0f) * f10) + AndroidUtilities.dp(1.3f) + dpf2;
        this.c2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * f10) + dpf2 + AndroidUtilities.dp(24.0f);
    }

    public final void F3() {
        if (this.fragmentView == null || !this.T5 || this.u2 == null || getParentActivity() == null) {
            return;
        }
        m01 m01Var = this.Y5;
        if (m01Var != null) {
            m01Var.b(this.u2);
            this.Y5.invalidate();
        } else {
            m01 m01Var2 = new m01(this, this.u2);
            this.Y5 = m01Var2;
            ((FrameLayout) this.fragmentView).addView(m01Var2, g7.e6.e(-1, -1, 55));
        }
    }

    public final void F4() {
        by0 by0Var = this.a;
        if (by0Var == null || this.c == null || by0Var.getChildCount() <= 0 || this.S5) {
            return;
        }
        View view = null;
        int i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i10 = -1;
        for (int i11 = 0; i11 < this.a.getChildCount(); i11++) {
            int R = RecyclerView.R(this.a.getChildAt(i11));
            View childAt = this.a.getChildAt(i11);
            if (R != -1 && childAt.getTop() < i9) {
                i9 = childAt.getTop();
                i10 = R;
                view = childAt;
            }
        }
        if (view != null) {
            this.Q5 = i10;
            int top = view.getTop();
            this.R5 = top;
            if (this.Q5 == 0 && !this.k2 && top > T3()) {
                this.R5 = T3();
            }
            this.c.h1(i10, view.getTop() - this.a.getPaddingTop());
        }
    }

    public final void G4(boolean z10) {
        int i9 = this.F4;
        if (i9 >= 0) {
            if (!z10) {
                this.c.h1(i9, -this.a.getPaddingTop());
                return;
            }
            rh.n nVar = new rh.n(getParentActivity(), 2, 0.6f);
            nVar.a = this.F4;
            nVar.p = -this.a.getPaddingTop();
            this.c.w0(nVar);
        }
    }

    public final void H3(float f10) {
        ValueAnimator ofFloat;
        int i9 = 1;
        boolean z10 = f10 > 0.0f;
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.P5;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.P5 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.t0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new kx0(this, i9));
        this.P5.playTogether(arrayList);
        this.P5.setDuration(z10 ? 150L : 220L);
        if (!z10) {
            this.P5.addListener(new yy0(this, 4));
        }
        this.P5.start();
    }

    @Override // org.telegram.ui.wx
    public final /* synthetic */ boolean I(dy dyVar) {
        return false;
    }

    public final void I3(int i9, View view) {
        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(this, view);
        H.W(this.a.V0(view, false));
        H.w = false;
        H.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new cb0(this, 25), this.r2 != null);
        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Edit), new cb0(this, 26), false);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.qd(this, i9, 22), true);
        H.Z();
    }

    public final void I4() {
        org.telegram.ui.Components.pg0 pg0Var = this.W;
        if (pg0Var == null) {
            return;
        }
        if (this.o1) {
            pg0Var.D = 6;
            return;
        }
        if (this.m1) {
            pg0Var.D = 5;
            return;
        }
        if (this.n2) {
            pg0Var.D = 2;
            return;
        }
        if (this.a1 != 0) {
            pg0Var.D = 0;
            return;
        }
        if (this.b1 != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.b1));
            if (!ChatObject.isChannel(chat)) {
                this.W.D = 3;
                return;
            }
            if (ChatObject.isMegagroup(chat)) {
                this.W.D = 3;
            } else if (ChatObject.isForum(chat)) {
                this.W.D = 4;
            } else {
                this.W.D = 1;
            }
        }
    }

    @Override // org.telegram.ui.Components.d40
    public final void J(boolean z10, boolean z11) {
        org.telegram.ui.Cells.z3 z3Var = this.c0;
        if (z3Var == null) {
            return;
        }
        z3Var.setProgress(0.0f);
    }

    public final boolean J3(final int i9, View view) {
        TLRPC.User currentUser;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.o1 && (currentUser = getUserConfig().getCurrentUser()) != null) {
            final TLRPC.UserFull userFull = this.r2;
            if (userFull == null) {
                userFull = getMessagesController().getUserFull(currentUser.id);
            }
            if (userFull != null) {
                String string = LocaleController.getString(R.string.Copy);
                if (i9 == this.G3 || i9 == this.F3 || i9 == this.S2) {
                    str = userFull.about;
                } else if (i9 == this.K3) {
                    str = pf.y0.e0(this.currentAccount, currentUser, userFull.business_work_hours);
                    string = LocaleController.getString(R.string.ProfileHoursCopy);
                } else if (i9 == this.L3) {
                    str = userFull.business_location.address;
                    string = LocaleController.getString(R.string.ProfileLocationCopy);
                } else if (i9 == this.H3) {
                    str = UserObject.getPublicUsername(currentUser);
                    if (str != null) {
                        str = "@".concat(str);
                    }
                    string = LocaleController.getString(R.string.ProfileCopyUsername);
                } else {
                    str = i9 == this.C3 ? currentUser.phone : i9 == this.Q2 ? UserInfoActivity.Y(this.r2.birthday) : null;
                }
                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(this, view);
                H.W(this.a.V0(view, false));
                H.w = false;
                H.i = 3;
                if (i9 == this.L3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, LocaleController.getString(R.string.ProfileLocationView), new cb0(this, 5), false);
                    }
                    H.c(R.drawable.msg_map, LocaleController.getString(R.string.ProfileLocationMaps), new cb0(this, 7), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, string, new zk0(str, 26), false);
                }
                if (i9 == this.K3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileHoursEdit), new cb0(this, 8), false);
                    final int i10 = 0;
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileHoursRemove), new Runnable(this) { // from class: org.telegram.ui.jx0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    final ProfileActivity profileActivity = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity());
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final int i11 = 0;
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i12 = i9;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.mx0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i13) {
                                            switch (i11) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull3 = userFull2;
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    ProfileActivity profileActivity2 = profileActivity;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new ox0(profileActivity2, 0));
                                                    profileActivity2.j5();
                                                    profileActivity2.d.u(i12);
                                                    profileActivity2.getMessagesStorage().updateUserInfo(userFull3, false);
                                                    break;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull2;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ox0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i12);
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
                                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final int i13 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i14 = i9;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.mx0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i132) {
                                            switch (i13) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new ox0(profileActivity22, 0));
                                                    profileActivity22.j5();
                                                    profileActivity22.d.u(i14);
                                                    profileActivity22.getMessagesStorage().updateUserInfo(userFull32, false);
                                                    break;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ox0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i14);
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
                } else if (i9 == this.L3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileLocationEdit), new cb0(this, 9), false);
                    final int i11 = 1;
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.ProfileLocationRemove), new Runnable(this) { // from class: org.telegram.ui.jx0
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
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final int i112 = 0;
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i12 = i9;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.mx0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i132) {
                                            switch (i112) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull2;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new ox0(profileActivity22, 0));
                                                    profileActivity22.j5();
                                                    profileActivity22.d.u(i12);
                                                    profileActivity22.getMessagesStorage().updateUserInfo(userFull32, false);
                                                    break;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull2;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ox0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i12);
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
                                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final int i13 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i14 = i9;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.mx0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i132) {
                                            switch (i13) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new ox0(profileActivity22, 0));
                                                    profileActivity22.j5();
                                                    profileActivity22.d.u(i14);
                                                    profileActivity22.getMessagesStorage().updateUserInfo(userFull32, false);
                                                    break;
                                                default:
                                                    TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.business_location = null;
                                                    userFull4.flags2 &= -3;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new ox0(profileActivity3, 1));
                                                    profileActivity3.j5();
                                                    profileActivity3.d.u(i14);
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
                } else if (i9 == this.H3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new cb0(this, 10), false);
                } else if (i9 == this.G3 || i9 == this.F3 || i9 == this.S2) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileEditBio), new cb0(this, 11), false);
                } else if (i9 == this.C3) {
                    H.c(R.drawable.menu_storage_path, LocaleController.getString(R.string.ProfilePhoneEdit), new cb0(this, 12), false);
                } else if (i9 == this.Q2) {
                    final int i12 = 0;
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileBirthdayChange), new Runnable(this) { // from class: org.telegram.ui.ix0
                        public final /* synthetic */ ProfileActivity b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    ProfileActivity profileActivity = this.b;
                                    Activity parentActivity = profileActivity.getParentActivity();
                                    String string2 = LocaleController.getString(R.string.EditProfileBirthdayTitle);
                                    String string3 = LocaleController.getString(R.string.EditProfileBirthdayButton);
                                    TLRPC.UserFull userFull2 = userFull;
                                    profileActivity.showDialog(org.telegram.ui.Components.y4.m(parentActivity, string2, string3, userFull2.birthday, new eb0(8, profileActivity, userFull2), new cb0(profileActivity, 13), false, false, profileActivity.v0).a);
                                    break;
                                case 1:
                                    final ProfileActivity profileActivity2 = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.BirthdayClearTitle);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.BirthdayClearMessage);
                                    String string4 = LocaleController.getString(R.string.Remove);
                                    final int i13 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.lx0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i14) {
                                            switch (i13) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.personal_channel_id = 0L;
                                                    userFull4.personal_channel_message = 0;
                                                    userFull4.flags2 &= -65;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatepersonalchannel, new ox0(profileActivity3, 3));
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
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ox0(profileActivity4, 2));
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
                                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                    String string5 = LocaleController.getString(R.string.Remove);
                                    final int i14 = 0;
                                    final TLRPC.UserFull userFull4 = userFull;
                                    alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.lx0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i142) {
                                            switch (i14) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull4;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity3;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ox0(profileActivity32, 3));
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
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ox0(profileActivity4, 2));
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
                    final int i13 = 1;
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) { // from class: org.telegram.ui.ix0
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
                                    profileActivity.showDialog(org.telegram.ui.Components.y4.m(parentActivity, string2, string3, userFull2.birthday, new eb0(8, profileActivity, userFull2), new cb0(profileActivity, 13), false, false, profileActivity.v0).a);
                                    break;
                                case 1:
                                    final ProfileActivity profileActivity2 = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.BirthdayClearTitle);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.BirthdayClearMessage);
                                    String string4 = LocaleController.getString(R.string.Remove);
                                    final int i132 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.lx0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i142) {
                                            switch (i132) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull3;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity2;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ox0(profileActivity32, 3));
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
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ox0(profileActivity4, 2));
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
                                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                    String string5 = LocaleController.getString(R.string.Remove);
                                    final int i14 = 0;
                                    final TLRPC.UserFull userFull4 = userFull;
                                    alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.lx0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i142) {
                                            switch (i14) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull4;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity3;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ox0(profileActivity32, 3));
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
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ox0(profileActivity4, 2));
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
                } else if (i9 == this.M2) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(userFull.personal_channel_id));
                    if (chat != null && ChatObject.getPublicUsername(chat) != null) {
                        H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileChannelCopy), new ys0(13, this, chat), false);
                    }
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileChannelChange), new cb0(this, 6), false);
                    final int i14 = 2;
                    H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new Runnable(this) { // from class: org.telegram.ui.ix0
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
                                    profileActivity.showDialog(org.telegram.ui.Components.y4.m(parentActivity, string2, string3, userFull2.birthday, new eb0(8, profileActivity, userFull2), new cb0(profileActivity, 13), false, false, profileActivity.v0).a);
                                    break;
                                case 1:
                                    final ProfileActivity profileActivity2 = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.BirthdayClearTitle);
                                    alertDialog$Builder.a.P = LocaleController.getString(R.string.BirthdayClearMessage);
                                    String string4 = LocaleController.getString(R.string.Remove);
                                    final int i132 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.lx0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i142) {
                                            switch (i132) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull3;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity2;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ox0(profileActivity32, 3));
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
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ox0(profileActivity4, 2));
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
                                    alertDialog$Builder2.a.N = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                    alertDialog$Builder2.a.P = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                    String string5 = LocaleController.getString(R.string.Remove);
                                    final int i142 = 0;
                                    final TLRPC.UserFull userFull4 = userFull;
                                    alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.lx0
                                        @Override // org.telegram.ui.ActionBar.b2
                                        public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i1422) {
                                            switch (i142) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull4;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity3;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new ox0(profileActivity32, 3));
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
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new ox0(profileActivity4, 2));
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
    public final void J4(float f10) {
        int v02;
        boolean z10;
        g01 g01Var;
        int i9;
        int d;
        gh.v0 v0Var;
        i01 i01Var;
        if (this.actionBar == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        this.h2 = f10;
        float lerp = AndroidUtilities.lerp(this.i2, f10);
        this.g2 = lerp;
        B3();
        this.U.setScaleX(this.X1);
        this.U.setScaleY(this.X1);
        this.U.setTranslationY(AndroidUtilities.lerp((float) Math.ceil(this.W1), 0.0f, lerp));
        this.a0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, lerp));
        ly0 ly0Var = this.a0;
        float f11 = this.X1;
        boolean z11 = this.l2;
        ly0Var.D = lerp;
        ly0Var.E = f11;
        ly0Var.C = z11;
        oy0 oy0Var = this.q0;
        if (oy0Var != null) {
            oy0Var.setExpandProgress(lerp);
        }
        gh.v0 v0Var2 = this.r0;
        if (v0Var2 != null) {
            v0Var2.setExpandProgress(lerp);
        }
        org.telegram.ui.Components.qv0 qv0Var = this.P;
        if (qv0Var != null) {
            qv0Var.setParentExpanded(lerp);
        }
        org.telegram.ui.Components.pg0 pg0Var = this.W;
        if (pg0Var != null) {
            pg0Var.setParentExpanded(lerp);
        }
        org.telegram.ui.Components.hh0 hh0Var = this.Y;
        if (hh0Var != null) {
            hh0Var.setParentExpanded(lerp);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.Q0;
        if (w0Var != null) {
            float f12 = 1.0f - lerp;
            w0Var.setAlpha(f12);
            this.Q0.setScaleY(f12);
            this.Q0.setVisibility(0);
            org.telegram.ui.ActionBar.w0 w0Var2 = this.Q0;
            w0Var2.setClickable(w0Var2.getAlpha() > 0.5f);
        }
        float y32 = y3();
        if (y32 >= 1.0f) {
            this.a0.setAlpha(1.0f);
        }
        if (!this.l2) {
            E4(y32, currentActionBarHeight);
        } else if (this.M1 >= U3() && this.d2 < 0.33f) {
            D4();
        }
        org.telegram.ui.Components.il0 il0Var = this.H;
        if (il0Var != null) {
            il0Var.b(i0.a.d(lerp, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h8, this.v0), Color.argb(179, 255, 255, 255)));
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.M5 != null ? -1 : i0.a.d(lerp, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.pc, this.v0), -1), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.fr[] frVarArr = this.F;
        org.telegram.ui.Components.fr frVar = frVarArr[0];
        if (frVar != null) {
            frVar.b(lerp);
        }
        org.telegram.ui.Components.fr frVar2 = frVarArr[1];
        if (frVar2 != null) {
            frVar2.b(lerp);
        }
        org.telegram.ui.Components.fr[] frVarArr2 = this.G;
        org.telegram.ui.Components.fr frVar3 = frVarArr2[0];
        if (frVar3 != null) {
            frVar3.b(lerp);
        }
        org.telegram.ui.Components.fr frVar4 = frVarArr2[1];
        if (frVar4 != null) {
            frVar4.b(lerp);
        }
        Y4(lerp);
        float f13 = this.Z1;
        float f14 = this.b2;
        if (y32 < 1.0f) {
            f13 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(63.0f), f13, y32);
            f14 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(63.0f), f14, y32);
        }
        float dpf2 = AndroidUtilities.dpf2(8.0f);
        float dpf22 = AndroidUtilities.dpf2(this.l2 ? 8.0f : -24.0f);
        float dpf23 = AndroidUtilities.dpf2(18.0f);
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f;
        float f15 = dpf23 - ((FrameLayout.LayoutParams) h5VarArr[1].getLayoutParams()).leftMargin;
        float f16 = currentActionBarHeight;
        float O3 = (((this.M1 + f16) - O3()) - AndroidUtilities.dpf2(30.0f)) - h5VarArr[1].getBottom();
        float A = e2.c.A(f15, f13, 2.0f, dpf2 + f13);
        float f17 = this.a2;
        float f18 = 1.0f - lerp;
        float f19 = f18 * f18;
        float f20 = f18 * 2.0f * lerp;
        float f21 = (A * f20) + (f13 * f19);
        float f22 = lerp * lerp;
        float f23 = (f15 * f22) + f21;
        float A2 = (O3 * f22) + (e2.c.A(O3, f17, 2.0f, dpf22 + f17) * f20) + (f17 * f19);
        float dpf24 = AndroidUtilities.dpf2(16.0f);
        org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.r;
        float f24 = dpf24 - ((FrameLayout.LayoutParams) h5VarArr2[1].getLayoutParams()).leftMargin;
        float O32 = (((this.M1 + f16) - O3()) - AndroidUtilities.dpf2(10.0f)) - h5VarArr2[1].getBottom();
        float A3 = e2.c.A(f24, f14, 2.0f, dpf2 + f14);
        float f25 = this.c2;
        float f26 = (f24 * f22) + (A3 * f20) + (f14 * f19);
        float A4 = (f22 * O32) + (f20 * e2.c.A(O32, f25, 2.0f, dpf22 + f25)) + (f19 * f25);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
        float dpf25 = AndroidUtilities.dpf2(22.7f) + floor;
        h5VarArr[1].setTranslationX(f23);
        h5VarArr[1].setTranslationY(Math.max(floor, A2));
        h5VarArr2[1].setTranslationX(W3(f26));
        h5VarArr2[1].setTranslationY(X3(Math.max(dpf25, A4)));
        this.s.setTranslationX(f26);
        this.s.setTranslationY(Math.max(dpf25, A4));
        S4();
        f5();
        Object tag = h5VarArr2[1].getTag();
        if (tag instanceof Integer) {
            Integer num = (Integer) tag;
            v02 = org.telegram.ui.ActionBar.f6.v0(num.intValue(), this.v0);
            if (num.intValue() == org.telegram.ui.ActionBar.f6.Bh) {
                z10 = true;
                h5VarArr2[1].setTextColor(i0.a.d(lerp, w3(v02, Boolean.valueOf(z10)), -1275068417));
                if (this.M1 > U3()) {
                    h5VarArr[1].setPivotY(AndroidUtilities.lerp(0, r4.getMeasuredHeight(), lerp));
                    float f27 = (0.12f * y32) + 1.0f;
                    h5VarArr[1].setScaleX(AndroidUtilities.lerp(f27, 1.38f, lerp));
                    h5VarArr[1].setScaleY(AndroidUtilities.lerp(f27, 1.38f, lerp));
                }
                l4(0, Math.min(1.0f, y32), true);
                g01Var = this.X5;
                if (g01Var != null) {
                    g01Var.a(i0.a.d(this.g2, org.telegram.ui.ActionBar.f6.l1(0.5f, org.telegram.ui.ActionBar.f6.b(0.18f, -0.1f, this.Y0)), 603979775));
                }
                org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
                if (this.M5 == null) {
                    d = -1;
                    i9 = -1;
                } else {
                    i9 = -1;
                    d = i0.a.d(this.g2, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.vh, this.v0), -1);
                }
                h5Var.setTextColor(d);
                this.actionBar.C(this.M5 == null ? -1 : i0.a.d(lerp, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v8, this.v0), i9), false);
                this.actionBar.setMenuOffsetSuppressed(true);
                this.a0.setForegroundAlpha(lerp);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U.getLayoutParams();
                layoutParams.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.a.getMeasuredWidth() / this.X1, lerp);
                layoutParams.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.M1 + f16) / this.X1, lerp);
                N3();
                this.U.requestLayout();
                v0Var = this.r0;
                if (v0Var != null) {
                    v0Var.setExpandProgress(lerp);
                }
                V4();
                i01Var = this.Z0;
                if (i01Var == null && i01Var.G) {
                    i01Var.invalidate();
                    return;
                }
            }
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B8, this.v0);
        }
        z10 = false;
        h5VarArr2[1].setTextColor(i0.a.d(lerp, w3(v02, Boolean.valueOf(z10)), -1275068417));
        if (this.M1 > U3()) {
        }
        l4(0, Math.min(1.0f, y32), true);
        g01Var = this.X5;
        if (g01Var != null) {
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[1];
        if (this.M5 == null) {
        }
        h5Var2.setTextColor(d);
        this.actionBar.C(this.M5 == null ? -1 : i0.a.d(lerp, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v8, this.v0), i9), false);
        this.actionBar.setMenuOffsetSuppressed(true);
        this.a0.setForegroundAlpha(lerp);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.U.getLayoutParams();
        layoutParams2.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.a.getMeasuredWidth() / this.X1, lerp);
        layoutParams2.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.M1 + f16) / this.X1, lerp);
        N3();
        this.U.requestLayout();
        v0Var = this.r0;
        if (v0Var != null) {
        }
        V4();
        i01Var = this.Z0;
        if (i01Var == null) {
        }
    }

    public final boolean K3() {
        View view;
        if ((this.E0 || (!AndroidUtilities.isTablet() && !this.j2)) && this.a0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            this.B0 = true;
            this.k2 = true;
            int i9 = 0;
            while (true) {
                if (i9 >= this.a.getChildCount()) {
                    view = null;
                    break;
                }
                if (RecyclerView.R(this.a.getChildAt(i9)) == 0) {
                    view = this.a.getChildAt(i9);
                    break;
                }
                i9++;
            }
            if (view != null) {
                by0 by0Var = this.a;
                View F = by0Var.F(view);
                f2.q1 T = F != null ? by0Var.T(F) : null;
                if (T != null) {
                    Integer num = (Integer) this.U1.get(Integer.valueOf(T.b()));
                    if (num != null) {
                        this.L1 = true;
                        this.a.v0(0, -(((this.a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.gr.h);
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
        this.q2 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.i1 == 0) {
                this.i1 = -j10;
                getMediaDataController().getMediaCounts(this.i1, this.c1, this.classGuid);
            }
        }
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.setChatInfo(this.q2);
        }
        my0 my0Var = this.j0;
        if (my0Var != null && !this.m1) {
            my0Var.setChatInfo(this.q2);
        }
        oy0 oy0Var = this.q0;
        if (oy0Var != null && (chatFull3 = this.q2) != null) {
            oy0Var.setStories(chatFull3.stories);
        }
        gh.v0 v0Var = this.r0;
        if (v0Var != null) {
            v0Var.a();
        }
        ly0 ly0Var = this.a0;
        if (ly0Var != null) {
            ly0Var.setHasStories(j4());
        }
        L3();
        if (this.b1 != 0) {
            boolean z10 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.q2) == null || !chatFull2.stargifts_available) ? false : true;
            this.P0.I(38, z10);
            org.telegram.ui.Components.pg0 pg0Var = this.W;
            if (pg0Var != null) {
                pg0Var.o(3, z10);
            }
        }
    }

    @Override // org.telegram.ui.Components.xt0
    public final void L() {
        org.telegram.ui.Components.wt0 wt0Var;
        hz0 hz0Var = this.K;
        if (hz0Var != null && (wt0Var = this.N) != null) {
            hz0Var.setNewMediaCounts(wt0Var.c);
        }
        if (this.d != null) {
            e5(false, false);
        }
        Q();
        if (this.r2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void L3() {
        TLRPC.Chat chat = this.A2;
        if (chat == null || !chat.megagroup) {
            return;
        }
        TLRPC.ChatFull chatFull = this.q2;
        if (!(chatFull instanceof TLRPC.TL_channelFull) || chatFull.participants == null) {
            return;
        }
        for (int i9 = 0; i9 < this.q2.participants.participants.size(); i9++) {
            TLRPC.ChatParticipant chatParticipant = this.q2.participants.participants.get(i9);
            this.y1.k(chatParticipant, chatParticipant.user_id);
        }
    }

    public final void L4(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.V == null || (tL_emojiStatusCollectible2 = this.c6) == tL_emojiStatusCollectible) {
            return;
        }
        if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
            this.c6 = tL_emojiStatusCollectible;
            kh.x3 x3Var = this.Z5;
            int i9 = 1;
            if (x3Var != null) {
                x3Var.e(true);
            }
            if (tL_emojiStatusCollectible == null || TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                return;
            }
            this.b6 = null;
            this.Z5 = new kh.x3(getParentActivity(), 3);
            this.a6 = org.telegram.ui.ActionBar.f6.v(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.f6.l1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
            this.Z5.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            kh.x3 x3Var2 = this.Z5;
            int l1 = org.telegram.ui.ActionBar.f6.l1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
            x3Var2.w0 = true;
            x3Var2.E0 = System.currentTimeMillis();
            x3Var2.x0 = new Path();
            x3Var2.y0 = AndroidUtilities.dpf2(0.66f) / 2.0f;
            x3Var2.z0 = new Paint(1);
            x3Var2.A0 = new Paint(1);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.f6.l1(0.0f, l1), org.telegram.ui.ActionBar.f6.l1(1.0f, l1), org.telegram.ui.ActionBar.f6.l1(0.0f, l1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            x3Var2.D0 = linearGradient;
            x3Var2.A0.setShader(linearGradient);
            x3Var2.B0 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.f6.l1(0.0f, l1), org.telegram.ui.ActionBar.f6.l1(0.5f, l1), org.telegram.ui.ActionBar.f6.l1(0.0f, l1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            x3Var2.C0 = new Matrix();
            x3Var2.z0.setShader(x3Var2.B0);
            x3Var2.A0.setStyle(Paint.Style.STROKE);
            x3Var2.A0.setStrokeJoin(Paint.Join.ROUND);
            x3Var2.A0.setStrokeCap(Paint.Cap.ROUND);
            x3Var2.A0.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
            this.V.addView(this.Z5, g7.e6.c(24.0f, -1));
            this.Z5.u(9.33f);
            kh.x3 x3Var3 = this.Z5;
            Typeface bold = AndroidUtilities.bold();
            x3Var3.D.u(bold);
            x3Var3.F.setTypeface(bold);
            this.Z5.t(tL_emojiStatusCollectible.title);
            kh.x3 x3Var4 = this.Z5;
            x3Var4.d = -1L;
            x3Var4.l(5.66f, 2.66f, 5.66f, 2.66f);
            kh.x3 x3Var5 = this.Z5;
            x3Var5.getClass();
            x3Var5.y = AndroidUtilities.dpf2(4.0f);
            x3Var5.A = AndroidUtilities.dpf2(2.66f);
            this.Z5.s();
            this.Z5.r(16.0f);
            this.Z5.v();
            this.Z5.setOnClickListener(new tx0(this, tL_emojiStatusCollectible.slug, i9));
            if (this.M1 < AndroidUtilities.dp(82.0f)) {
                this.b6 = Boolean.FALSE;
                this.Z5.setAlpha(0.0f);
            }
            V4();
            kh.x3 x3Var6 = this.Z5;
            Objects.requireNonNull(x3Var6);
            AndroidUtilities.runOnUIThread(new zk0(x3Var6, 27), 6000L);
        }
    }

    public final boolean M3() {
        org.telegram.ui.ActionBar.b5 b5Var;
        if (this.F1 == 0 || (b5Var = this.parentLayout) == null || b5Var.getFragmentStack() == null || this.parentLayout.getFragmentStack().size() < 2 || !(this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof qn)) {
            return false;
        }
        finishFragment();
        return true;
    }

    public final void M4(oz0 oz0Var) {
        if (this.e5 == oz0Var) {
            return;
        }
        this.e5 = oz0Var;
        AndroidUtilities.forEachViews((RecyclerView) this.a, (d5.d) new nx0(this, 0));
    }

    public final void N3() {
        if (this.a == null) {
            return;
        }
        float measuredWidth = (this.a.getMeasuredWidth() / 2.0f) - ((((FrameLayout.LayoutParams) this.U.getLayoutParams()).width * this.X1) * 0.5f);
        this.V1 = measuredWidth;
        if (this.C1) {
            this.V1 = AndroidUtilities.lerp(this.K5, measuredWidth, this.O1);
        }
        this.U.setTranslationX(this.V1);
    }

    public final void N4(int i9) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (AndroidUtilities.isTablet()) {
            return;
        }
        this.G1 = i9 != 0;
        this.H1 = i9 != 0;
        k5();
        if (globalMainSettings.getBoolean("view_animations", true)) {
            this.F1 = i9;
        } else if (i9 == 2) {
            this.j1 = true;
        }
    }

    public final int O3() {
        if (this.a1 == 0 || this.m0 == null || this.o1) {
            return AndroidUtilities.dp(74 + (this.E4 ? 25 : 0));
        }
        return 0;
    }

    public final void O4(TLRPC.UserFull userFull, org.telegram.ui.Cells.f6 f6Var, j01 j01Var) {
        this.r2 = userFull;
        org.telegram.ui.Components.qv0 qv0Var = this.P;
        if (qv0Var != null) {
            qv0Var.set(userFull.stars_rating);
        }
        oy0 oy0Var = this.q0;
        if (oy0Var != null) {
            oy0Var.setStories(this.r2.stories);
        }
        gh.v0 v0Var = this.r0;
        if (v0Var != null) {
            v0Var.a();
        }
        ly0 ly0Var = this.a0;
        if (ly0Var != null) {
            ly0Var.setHasStories(j4());
        }
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.setUserInfo(this.r2);
        }
        if (this.s2 == null) {
            this.s2 = f6Var;
        }
        if (this.s2 == null) {
            this.s2 = new org.telegram.ui.Cells.f6(this.currentAccount);
        }
        org.telegram.ui.Cells.f6 f6Var2 = this.s2;
        cb0 cb0Var = new cb0(this, 20);
        if (f6Var2.c) {
            cb0Var.run();
        } else {
            f6Var2.h.add(cb0Var);
        }
        this.s2.d(this.r2);
        if (this.u2 == null) {
            this.u2 = j01Var;
        }
        j01 j01Var2 = this.u2;
        if (j01Var2 == null) {
            j01 c10 = j01.c(this.currentAccount, this.r2, j01Var2);
            this.u2 = c10;
            this.t2 = c10 != null;
        }
        j01 j01Var3 = this.u2;
        if (j01Var3 != null) {
            cb0 cb0Var2 = new cb0(this, 16);
            if (j01Var3.b) {
                cb0Var2.run();
            } else {
                j01Var3.h.add(cb0Var2);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.P0;
        if (w0Var != null) {
            w0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.a1)));
            if (e4()) {
                this.P0.K(44);
            } else {
                this.P0.r(44);
            }
        }
    }

    @Override // org.telegram.ui.Components.d40
    public final void P(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new nh.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    public final int P3(ImageReceiver imageReceiver) {
        return imageReceiver.getDrawable() instanceof org.telegram.ui.Components.u51 ? ((org.telegram.ui.Components.u51) imageReceiver.getDrawable()).a.a() : AndroidUtilities.calcBitmapColor(this.a0.getImageReceiver().getBitmap());
    }

    public final void P4(boolean z10, boolean z11) {
        if (this.c0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.b0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.b0 = null;
        }
        if (!z11) {
            if (z10) {
                this.c0.setAlpha(1.0f);
                this.c0.setVisibility(0);
                return;
            } else {
                this.c0.setAlpha(0.0f);
                this.c0.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.b0 = animatorSet2;
        int i9 = 1;
        if (z10) {
            this.c0.setVisibility(0);
            this.b0.playTogether(ObjectAnimator.ofFloat(this.c0, (Property<org.telegram.ui.Cells.z3, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.c0, (Property<org.telegram.ui.Cells.z3, Float>) View.ALPHA, 0.0f));
        }
        this.b0.setDuration(180L);
        this.b0.addListener(new zy0(this, z10, i9));
        this.b0.start();
    }

    @Override // org.telegram.ui.Components.qs0
    public final void Q() {
        int i9;
        hz0 hz0Var = this.K;
        if (hz0Var == null || this.s == null) {
            return;
        }
        int closestTab = hz0Var.getClosestTab();
        int[] iArr = this.N.c;
        if (closestTab == 0) {
            if (iArr[7] <= 0 && iArr[6] <= 0) {
                int i10 = iArr[0];
                if (i10 <= 0) {
                    this.s.setText(LocaleController.getString(R.string.SharedMedia));
                    return;
                } else {
                    this.s.setText(LocaleController.formatPluralString("Media", i10, new Object[0]));
                    return;
                }
            }
            if (this.K.getPhotosVideosTypeFilter() == 1 || iArr[7] <= 0) {
                this.s.setText(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]));
                return;
            } else if (this.K.getPhotosVideosTypeFilter() == 2 || (i9 = iArr[6]) <= 0) {
                this.s.setText(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
                return;
            } else {
                this.s.setText(aa.d.z(LocaleController.formatPluralString("Photos", i9, new Object[0]), ", ", LocaleController.formatPluralString("Videos", iArr[7], new Object[0])));
                return;
            }
        }
        if (closestTab == 1) {
            int i11 = iArr[1];
            if (i11 <= 0) {
                this.s.setText(LocaleController.getString(R.string.Files));
                return;
            } else {
                this.s.setText(LocaleController.formatPluralString("Files", i11, new Object[0]));
                return;
            }
        }
        if (closestTab == 2) {
            int i12 = iArr[2];
            if (i12 <= 0) {
                this.s.setText(LocaleController.getString(R.string.Voice));
                return;
            } else {
                this.s.setText(LocaleController.formatPluralString("Voice", i12, new Object[0]));
                return;
            }
        }
        if (closestTab == 3) {
            int i13 = iArr[3];
            if (i13 <= 0) {
                this.s.setText(LocaleController.getString(R.string.SharedLinks));
                return;
            } else {
                this.s.setText(LocaleController.formatPluralString("Links", i13, new Object[0]));
                return;
            }
        }
        if (closestTab == 4) {
            int i14 = iArr[4];
            if (i14 <= 0) {
                this.s.setText(LocaleController.getString(R.string.Music));
                return;
            } else {
                this.s.setText(LocaleController.formatPluralString("MusicFiles", i14, new Object[0]));
                return;
            }
        }
        if (closestTab == 5) {
            int i15 = iArr[5];
            if (i15 <= 0) {
                this.s.setText(LocaleController.getString(R.string.AccDescrGIFs));
                return;
            } else {
                this.s.setText(LocaleController.formatPluralString("GIFs", i15, new Object[0]));
                return;
            }
        }
        if (closestTab == 6) {
            this.s.setText(LocaleController.formatPluralString("CommonGroups", this.r2.common_chats_count, new Object[0]));
            return;
        }
        if (closestTab == 7) {
            this.s.setText(this.r[1].getText());
            return;
        }
        if (closestTab == 8 || org.telegram.ui.Components.eu0.w0(closestTab)) {
            if (this.n2) {
                this.s.setText(this.K.V(false));
                return;
            } else if (this.K.c0(closestTab) > 0) {
                this.s.setText(LocaleController.formatPluralString("ProfileStoriesCount", this.K.c0(closestTab), new Object[0]));
                return;
            } else {
                this.s.setText(LocaleController.getString(R.string.ProfileStoriesCountZero));
                return;
            }
        }
        if (closestTab == 13) {
            this.s.setText(this.K.V(true));
            return;
        }
        if (closestTab == 9) {
            this.s.setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", this.K.c0(closestTab), new Object[0]));
            return;
        }
        if (closestTab == 10) {
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(a());
            this.s.setText(LocaleController.formatPluralString(this.n2 ? "Bots" : "Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]));
            return;
        }
        if (closestTab == 12) {
            this.s.setText(LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, getMessagesController().getSavedMessagesController().getMessagesCount(a())), new Object[0]));
            return;
        }
        if (closestTab == 14) {
            org.telegram.ui.Components.nn0 nn0Var = this.s;
            org.telegram.ui.Components.vq0 vq0Var = this.K.R;
            nn0Var.setText(LocaleController.formatPluralStringComma("ProfileGiftsCount", vq0Var != null ? vq0Var.getGiftsCount() : 0));
        } else if (closestTab == 15) {
            int i16 = iArr[8];
            if (i16 <= 0) {
                this.s.setText(LocaleController.getString(R.string.SharedPollTab));
            } else {
                this.s.setText(LocaleController.formatPluralStringComma("ProfilePollsCount", i16));
            }
        }
    }

    public final org.telegram.ui.Components.i5 Q3(int i9, long j10) {
        org.telegram.ui.Components.i5[] i5VarArr = this.D;
        if (i5VarArr[i9] == null) {
            org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(17.0f), i9 == 0 ? 7 : 2, this.f[i9], false);
            i5VarArr[i9] = i5Var;
            int dp = AndroidUtilities.dp(1.0f);
            i5Var.E = 0;
            i5Var.F = dp;
            if (this.C0) {
                i5VarArr[i9].a();
            }
        }
        if (j10 != 0) {
            i5VarArr[i9].j(j10, false);
        } else {
            i5VarArr[i9].g(null, false);
        }
        X4();
        return i5VarArr[i9];
    }

    public final void Q4() {
        Long l10;
        if (this.x5 != null) {
            return;
        }
        s51[] s51VarArr = new s51[1];
        Rect rect = AndroidUtilities.rectTmp2;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
        if (h5Var != null) {
            if (h5Var.getRightDrawable() == null) {
                rect.set(h5VarArr[1].getWidth() - 1, (h5VarArr[1].getHeight() / 2) - 1, h5VarArr[1].getWidth() + 1, (h5VarArr[1].getHeight() / 2) + 1);
            } else {
                rect.set(h5VarArr[1].getRightDrawable().getBounds());
                rect.offset((int) ((h5VarArr[1].getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) h5VarArr[1].getX(), (int) h5VarArr[1].getY());
            }
        }
        int i9 = h5VarArr[1].getScaleX() < 1.5f ? 16 : 32;
        int dp = (-(this.V.getHeight() - rect.centerY())) - AndroidUtilities.dp(i9);
        int min = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = g7.n.b(centerX - (min / 2), 0, AndroidUtilities.displaySize.x - min);
        ry0 ry0Var = new ry0(this, this, getParentActivity(), Integer.valueOf(Math.max(0, centerX - b10)), this.A2 == null ? 0 : 9, this.v0, i9, s51VarArr);
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.a1));
        if (user != null) {
            ry0Var.setExpireDateHint(DialogObject.getEmojiStatusUntil(user.emoji_status));
        }
        Long l11 = this.B;
        org.telegram.ui.Components.i5[] i5VarArr = this.C;
        if (l11 != null) {
            ry0Var.setSelected(l11);
        } else {
            org.telegram.ui.Components.i5 i5Var = i5VarArr[1];
            if (i5Var != null) {
                Drawable drawable = i5Var.f[0];
                if (drawable instanceof org.telegram.ui.Components.k5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.k5) drawable).i());
                    ry0Var.setSelected(l10);
                }
            }
            l10 = null;
            ry0Var.setSelected(l10);
        }
        ry0Var.setSaveState(3);
        ry0Var.y(i5VarArr[1], h5VarArr[1]);
        sy0 sy0Var = new sy0(this, ry0Var);
        this.x5 = sy0Var;
        s51VarArr[0] = sy0Var;
        int[] iArr = new int[2];
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[1];
        if (h5Var2 != null) {
            h5Var2.getLocationOnScreen(iArr);
        }
        s51VarArr[0].showAsDropDown(this.fragmentView, b10, dp, 51);
        s51VarArr[0].b();
    }

    public final void R3(boolean z10) {
        a0.h hVar;
        if (this.x1 || (hVar = this.y1) == null || this.q2 == null) {
            return;
        }
        this.x1 = true;
        int i9 = (hVar.m() == 0 || !z10) ? 0 : 300;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.b1);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = z10 ? 0 : this.y1.m();
        tL_channels_getParticipants.limit = 200;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new bg.q0(this, tL_channels_getParticipants, i9)), this.classGuid);
    }

    public final void R4() {
        int i9 = 0;
        this.K.E0.setReordering(false);
        hz0 hz0Var = this.K;
        org.telegram.ui.Components.ur0 ur0Var = hz0Var.E0;
        if (hz0Var.r1 != null && ur0Var != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = ur0Var.getTabIds();
            int size = tabIds.size();
            while (i9 < size) {
                Integer num = tabIds.get(i9);
                i9++;
                TLRPC.ProfileTab d02 = org.telegram.ui.Components.eu0.d0(num.intValue(), hz0Var.Z0 instanceof TLRPC.TL_channelFull);
                if (d02 != null) {
                    arrayList.add(d02);
                }
            }
        }
        this.K.v1(true);
        this.u5.animate().translationY(AndroidUtilities.dp(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new cb0(this, 21)).start();
        org.telegram.ui.Components.oc.a0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    @Override // org.telegram.ui.Components.qs0
    public final boolean S() {
        return this.w1;
    }

    public final org.telegram.ui.Components.i5 S3(TLRPC.EmojiStatus emojiStatus, boolean z10, int i9) {
        org.telegram.ui.Components.i5[] i5VarArr = this.C;
        if (i5VarArr[i9] == null) {
            org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), i9 == 0 ? 7 : 2, this.f[i9], false);
            i5VarArr[i9] = i5Var;
            if (this.C0) {
                i5Var.a();
            }
        }
        if (i9 == 1) {
            this.B = null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((1 & tL_emojiStatus.flags) == 0 || tL_emojiStatus.until > ((int) (System.currentTimeMillis() / 1000))) {
                i5VarArr[i9].j(tL_emojiStatus.document_id, z10);
                i5VarArr[i9].m(false, z10);
            } else {
                i5VarArr[i9].g(Y3(i9), z10);
                i5VarArr[i9].m(false, z10);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
                if (i9 == 1) {
                    this.B = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                }
                i5VarArr[i9].j(tL_emojiStatusCollectible.document_id, z10);
                i5VarArr[i9].m(true, z10);
            } else {
                i5VarArr[i9].g(Y3(i9), z10);
                i5VarArr[i9].m(false, z10);
            }
        } else {
            i5VarArr[i9].g(Y3(i9), z10);
            i5VarArr[i9].m(false, z10);
        }
        X4();
        return i5VarArr[i9];
    }

    public final void S4() {
        m0 m0Var;
        if (this.W == null || this.r[1] == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        org.telegram.ui.Components.pg0 pg0Var = this.W;
        boolean z10 = this.C1;
        pg0Var.e = z10;
        if (z10 && this.F1 == 2 && (m0Var = this.U) != null) {
            this.W.f = this.U.getY() + (this.U.getScaleY() * m0Var.getHeight());
            this.W.setAlpha(this.O1);
            org.telegram.ui.Components.pg0 pg0Var2 = this.W;
            float measuredWidth = this.a.getMeasuredWidth();
            pg0Var2.A = AndroidUtilities.dp(74.0f);
            pg0Var2.setTranslationY(measuredWidth);
            pg0Var2.invalidate();
        } else {
            pg0Var.f = -1.0f;
            float f10 = currentActionBarHeight;
            float dp = (this.M1 + f10) - AndroidUtilities.dp(this.E4 ? 25.0f : 0.0f);
            float min = Math.min(AndroidUtilities.dp(74.0f), dp - f10);
            org.telegram.ui.Components.pg0 pg0Var3 = this.W;
            pg0Var3.A = min;
            pg0Var3.setTranslationY(dp - min);
            pg0Var3.invalidate();
        }
        ImageView imageView = this.K0;
        if (imageView == null || imageView.getTag() == null) {
            return;
        }
        this.W.getClass();
        if (this.K0.getVisibility() == 0) {
            this.K0.setVisibility(8);
        }
        if (this.K0.getTag() instanceof org.telegram.ui.ActionBar.w0) {
            ((org.telegram.ui.ActionBar.w0) this.K0.getTag()).setAlpha(1.0f);
        }
    }

    public final int T3() {
        return O3() + U3();
    }

    public final void T4() {
        if (this.V0 == null || this.W0 == null) {
            return;
        }
        TLRPC.UserFull userFull = this.r2;
        int i9 = (userFull == null && this.q2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.q2.ttl_period;
        this.o0.b(i9);
        this.W0.b(i9);
    }

    public final int U3() {
        return O3() == 0 ? AndroidUtilities.dp(168.0f) : AndroidUtilities.dp(152.0f);
    }

    public final void U4() {
        if (this.o5 == null) {
            return;
        }
        hz0 hz0Var = this.K;
        boolean z10 = ((hz0Var == null || !hz0Var.isAttachedToWindow()) ? (float) AndroidUtilities.dp(72.0f) : ((float) AndroidUtilities.dp(232.0f)) - (((float) this.a.getMeasuredHeight()) - this.K.getY())) <= 0.0f;
        td.a aVar = this.w5;
        aVar.a(z10, true);
        float f10 = aVar.e;
        this.o5.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f10));
        this.o5.setAlpha(f10);
        this.o5.setVisibility(f10 <= 0.0f ? 4 : 0);
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
        if (gcVar != null) {
            gcVar.l();
        }
    }

    public final Drawable V3() {
        if (this.x == null) {
            this.x = org.telegram.ui.ActionBar.f6.l4.getConstantState().newDrawable().mutate();
        }
        return this.x;
    }

    public final void V4() {
        kh.x3 x3Var = this.Z5;
        if (x3Var == null) {
            return;
        }
        float f10 = -x3Var.getPaddingLeft();
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f;
        x3Var.n(0.0f, (h5VarArr[1].getScaleX() * (h5VarArr[1].getRightDrawableX() - (AndroidUtilities.lerp(0.45f, 0.25f, this.g2) * h5VarArr[1].getRightDrawableWidth()))) + h5VarArr[1].getX() + f10);
        float lerp = AndroidUtilities.lerp(this.i2, this.h2);
        this.Z5.setTranslationY(((h5VarArr[1].getY() + (-r4.getPaddingBottom())) - AndroidUtilities.dp(24.0f)) + AndroidUtilities.lerp(AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(12.0f), lerp));
        this.Z5.h(i0.a.d(lerp, this.a6, 1342177280));
        boolean z10 = this.M1 >= ((float) AndroidUtilities.dp(82.0f));
        Boolean bool = this.b6;
        if (bool == null || bool.booleanValue() != z10) {
            ViewPropertyAnimator animate = this.Z5.animate();
            this.b6 = Boolean.valueOf(z10);
            org.telegram.messenger.ll.r(animate.alpha(z10 ? 1.0f : 0.0f), org.telegram.ui.Components.gr.g, 200L);
        }
    }

    public final float W3(float f10) {
        this.V5 = f10;
        int i9 = this.F1;
        return Math.max(0.0f, (Z3() + this.k5) * Utilities.clamp01(i9 != 2 ? (this.O1 >= 1.0f || i9 == 0) ? this.g2 : 0.0f : 1.0f)) + f10;
    }

    public final void W4() {
        if (getParentActivity() == null || this.R0 == null) {
            return;
        }
        if (getUserConfig().isPremium()) {
            this.R0.setIcon(R.drawable.menu_profile_colors);
            return;
        }
        Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, this.v0), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
        drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.R0.setIcon(new ih.j2(drawable, drawable2, AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f)));
    }

    public final float X3(float f10) {
        this.W5 = f10;
        int i9 = this.F1;
        return e2.c.z(1.0f, Utilities.clamp01(i9 == 2 ? 1.0f : (this.O1 >= 1.0f || i9 == 0) ? this.g2 : 0.0f), this.P != null ? this.P.getVisibilityFactor() * AndroidUtilities.dp(3.0f) : 0.0f, f10);
    }

    public final void X4() {
        Y4(this.L5);
    }

    public final org.telegram.ui.Components.fr Y3(int i9) {
        org.telegram.ui.Components.fr[] frVarArr = this.G;
        if (frVarArr[i9] == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            Drawable[] drawableArr = this.A;
            drawableArr[i9] = mutate;
            drawableArr[i9].setColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, this.v0), PorterDuff.Mode.MULTIPLY);
            frVarArr[i9] = new org.telegram.ui.Components.fr(drawableArr[i9], getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return frVarArr[i9];
    }

    public final void Y4(float f10) {
        int i9 = 0;
        while (i9 < 2) {
            MessagesController.PeerColor peerColor = this.M5;
            int offsetColor = (peerColor == null || i9 != 1) ? AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, this.v0), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oi, this.v0), this.A5, 1.0f) : i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.f6.I.q()), -1);
            int d = i0.a.d(f10, offsetColor, -1);
            int i10 = org.telegram.ui.ActionBar.f6.Oi;
            int d9 = i0.a.d(this.A5, d, org.telegram.ui.ActionBar.f6.v0(i10, this.v0));
            org.telegram.ui.Components.i5 i5Var = this.C[i9];
            if (i5Var != null) {
                i5Var.k(Integer.valueOf(d9));
            }
            org.telegram.ui.Components.i5 i5Var2 = this.D[i9];
            if (i5Var2 != null) {
                i5Var2.k(Integer.valueOf(i0.a.d(this.A5, i0.a.d(f10, offsetColor, -1711276033), org.telegram.ui.ActionBar.f6.v0(i10, this.v0))));
            }
            if (i9 == 1) {
                this.Z.setColor(d9);
            }
            i9++;
        }
        this.L5 = f10;
    }

    public final float Z3() {
        if (this.P == null) {
            return 0.0f;
        }
        return this.P.getVisibilityFactor() * AndroidUtilities.dp(22.0f);
    }

    public final void Z4() {
        org.telegram.ui.Cells.o oVar = this.Z;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f;
        oVar.setScaleX(h5VarArr[1].getScaleX());
        this.Z.setScaleY(h5VarArr[1].getScaleY());
        this.Z.b((h5VarArr[1].getScaleX() * h5VarArr[1].getRightDrawableX()) + h5VarArr[1].getX(), (h5VarArr[1].getHeight() - (h5VarArr[1].getScaleY() * (h5VarArr[1].getHeight() - h5VarArr[1].getRightDrawableY()))) + h5VarArr[1].getY());
    }

    public final long a() {
        long j10 = this.e1;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.a1;
        return j11 != 0 ? j11 : -this.b1;
    }

    public final org.telegram.ui.Components.il0 a4(int i9) {
        if (this.H == null) {
            org.telegram.ui.Components.il0 il0Var = new org.telegram.ui.Components.il0(i9);
            this.H = il0Var;
            il0Var.b(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h8, this.v0));
        }
        return this.H;
    }

    public final void a5() {
        if (this.m1 || !ChatObject.isForum(this.A2)) {
            return;
        }
        getNotificationsController().loadTopicsNotificationsExceptions(-this.b1, new Consumer() { // from class: org.telegram.ui.yx0
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void x(Object obj) {
                ProfileActivity profileActivity = ProfileActivity.this;
                HashSet hashSet = profileActivity.d5;
                ArrayList arrayList = new ArrayList((HashSet) obj);
                int i9 = 0;
                while (i9 < arrayList.size()) {
                    if (profileActivity.getMessagesController().getTopicsController().findTopic(profileActivity.b1, ((Integer) arrayList.get(i9)).intValue()) == null) {
                        arrayList.remove(i9);
                        i9--;
                    }
                    i9++;
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

    public final g01 b4() {
        if (this.X5 == null) {
            g01 g01Var = new g01(LocaleController.getString(R.string.StatusHiddenShow));
            this.X5 = g01Var;
            g01Var.setAlpha((int) (Math.min(1.0f, this.M1 / T3()) * 255.0f));
            this.X5.a(i0.a.d(this.g2, org.telegram.ui.ActionBar.f6.l1(0.5f, org.telegram.ui.ActionBar.f6.b(0.18f, -0.1f, this.Y0)), 603979775));
        }
        return this.X5;
    }

    public final void b5(float f10) {
        wz0 wz0Var;
        ValueAnimator valueAnimator;
        if (this.l2 || ((wz0Var = this.J) != null && (valueAnimator = wz0Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.J.getLayoutParams();
            layoutParams.width = this.a.getMeasuredWidth();
            layoutParams.height = (int) (this.M1 + f10);
            this.J.requestLayout();
        }
        i01 i01Var = this.Z0;
        if (i01Var != null) {
            i01Var.A.setTranslate(0.0f, this.W1 - i01Var.x);
            i01 i01Var2 = this.Z0;
            RadialGradient radialGradient = i01Var2.y;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(i01Var2.A);
            }
            this.Z0.invalidate();
        }
        Z4();
        S4();
        f5();
    }

    public final int c4() {
        if (this.m1) {
            return 0;
        }
        if (this.b1 == 0 || !ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.b1)))) {
            return AndroidUtilities.dp(50.0f);
        }
        return AndroidUtilities.dp(j4() ? 24.0f : 38.0f);
    }

    public final void c5() {
        TLRPC.User user;
        if (!this.o1 || this.T0 == null || this.S0 == null || (user = getMessagesController().getUser(Long.valueOf(this.a1))) == null) {
            return;
        }
        boolean z10 = UserObject.getPublicUsername(user) != null;
        this.T0.setIcon(z10 ? R.drawable.menu_username_change : R.drawable.menu_username_set);
        this.T0.setText(LocaleController.getString(z10 ? R.string.ProfileUsernameEdit : R.string.ProfileUsernameSet));
        this.S0.setVisibility(UserObject.getPublicUsername(user) == null ? 8 : 0);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean canBeginSlide() {
        if (this.K.x0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void clearViews() {
        this.M5 = null;
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
        on onVar;
        org.telegram.ui.ActionBar.b4 b4Var;
        org.telegram.ui.ActionBar.o2 lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof qn) && (onVar = ((qn) lastFragment).aa) != null && (b4Var = onVar.f) != null) {
            if (b4Var != null) {
                TLRPC.ChatTheme chatTheme = b4Var.d;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = starGift instanceof TL_stars.TL_starGiftUnique ? (TL_stars.TL_starGiftUnique) starGift : null;
                }
            }
            this.v0 = lastFragment.getResourceProvider();
        }
        org.telegram.ui.Components.r7 r7Var = new org.telegram.ui.Components.r7(this, context, this.v0, 5);
        boolean z10 = true;
        r7Var.setForceSkipTouches(true);
        r7Var.setBackgroundColor(0);
        r7Var.A(this.M5 != null ? 553648127 : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f8, this.v0), false);
        int i9 = org.telegram.ui.ActionBar.f6.v8;
        r7Var.C(org.telegram.ui.ActionBar.f6.v0(i9, this.v0), false);
        r7Var.C(org.telegram.ui.ActionBar.f6.v0(i9, this.v0), true);
        r7Var.setCastShadows(false);
        r7Var.setAddToContainer(false);
        r7Var.setClipContent(true);
        if (!this.E0 && (AndroidUtilities.isTablet() || this.inBubbleMode)) {
            z10 = false;
        }
        r7Var.setOccupyStatusBar(z10);
        if (!this.E0) {
            r7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(false));
            r7Var.getBackButton().setTranslationX(AndroidUtilities.dp(2.0f));
            ImageView backButton = r7Var.getBackButton();
            backButton.setOnLongClickListener(new ih.g2(5, this, backButton));
            return r7Var;
        }
        r7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(false));
        r7Var.getBackButton().setTranslationX(AndroidUtilities.dp(2.0f));
        r7Var.e.setContentDescription(LocaleController.getString(R.string.QrCode));
        r7Var.e.setImageResource(R.drawable.outline_header_qr_24);
        r7Var.e.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, this.v0), PorterDuff.Mode.SRC_IN);
        r7Var.e.setOnClickListener(new ex0(this, 6));
        return r7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0bb5  */
    /* JADX WARN: Type inference failed for: r0v131, types: [org.telegram.ui.px0] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ig.a aVar;
        int i9;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        ?? r12;
        TLRPC.Document document;
        int i10;
        Object obj;
        int i11;
        float f10;
        boolean z10;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.Components.tn o6;
        TLRPC.UserFull userFull2;
        TLRPC.Chat chat;
        TLRPC.ChatParticipants chatParticipants;
        qn qnVar;
        on onVar;
        org.telegram.ui.ActionBar.f6.X(context);
        int i15 = 0;
        org.telegram.ui.ActionBar.f6.J(context, false);
        org.telegram.ui.ActionBar.o2 lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof qn) && (onVar = (qnVar = (qn) lastFragment).aa) != null && onVar.c() != null) {
            org.telegram.ui.ActionBar.b4 b4Var = qnVar.aa.f;
            if (b4Var != null) {
                TLRPC.ChatTheme chatTheme = b4Var.d;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = starGift instanceof TL_stars.TL_starGiftUnique ? (TL_stars.TL_starGiftUnique) starGift : null;
                }
            }
            this.v0 = lastFragment.getResourceProvider();
        }
        this.P1 = 0;
        this.Q1 = 1.0f;
        this.S1 = false;
        this.hasOwnBackground = true;
        this.M1 = T3();
        this.actionBar.setActionBarMenuOnItemClick(new dz0(this, context));
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.F0();
        }
        long j10 = this.e1;
        if (j10 == 0) {
            j10 = this.a1;
            if (j10 == 0) {
                j10 = -this.b1;
            }
        }
        this.fragmentView = new fz0(this, context);
        pg.i iVar = new pg.i(this.fragmentView);
        this.n6 = iVar;
        this.k6.f(iVar, (ViewGroup) this.fragmentView);
        pg.i iVar2 = this.n6;
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        ig.a aVar2 = this.m6;
        aVar2.f(iVar2, viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        int i16 = 23;
        if (this.o1) {
            this.o5 = new FrameLayout(context);
            this.p5 = new FrameLayout[2];
            this.s5 = new kh.d[2];
            int i17 = 0;
            for (int i18 = 2; i17 < i18; i18 = 2) {
                ng.c cVar = new ng.c();
                int i19 = org.telegram.ui.ActionBar.f6.d6;
                cVar.a(getThemedColor(i19));
                ig.a aVar3 = new ig.a(cVar);
                dh.g gVar = new dh.g(context);
                kg.d b10 = aVar3.b(gVar, new lg.b(i19, this.v0));
                b10.o(AndroidUtilities.dp(8.0f));
                b10.p(AndroidUtilities.dp(22.0f));
                gVar.setBackground(b10);
                this.p5[i17] = new FrameLayout(context);
                this.s5[i17] = new kh.d(context, this.v0);
                this.s5[i17].setRoundRadius(AndroidUtilities.dp(19.0f));
                this.s5[i17].setUseWrapContent(true);
                this.s5[i17].setPadding(AndroidUtilities.dp(16.0f), i15, AndroidUtilities.dp(16.0f), i15);
                if (i17 == 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                    this.q5 = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.filled_premium_camera), i15, 1, 33);
                    this.q5.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
                    this.r5 = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.eq(R.drawable.filled_add_album), i15, 1, 33);
                    this.r5.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAlbumBottomButtonAddStories));
                    this.s5[i17].h(this.q5);
                } else {
                    this.s5[i17].h(LocaleController.getString(R.string.StorySave));
                }
                gVar.setOnClickListener(new gh.z0(this, i17, i16));
                g7.g6.b(gVar, 0.02f, 1.2f);
                this.s5[i17].setStateListAnimator(null);
                gVar.addView(this.s5[i17], g7.e6.e(-2, -1, 17));
                this.p5[i17].addView(gVar, g7.e6.e(-2, 60, 1));
                this.o5.addView(this.p5[i17], g7.e6.e(-1, -1, 87));
                if (i17 == 1 || !getMessagesController().storiesEnabled()) {
                    this.p5[i17].setTranslationY(AndroidUtilities.dp(72.0f));
                }
                i17++;
                i15 = 0;
                i16 = 23;
            }
        }
        TLRPC.ChatFull chatFull2 = this.q2;
        ArrayList arrayList = (chatFull2 == null || (chatParticipants = chatFull2.participants) == null || chatParticipants.participants.size() <= 5) ? null : this.y2;
        if (this.t1) {
            aVar = aVar2;
            i9 = 6;
        } else if (this.p1 && (((userFull = this.r2) != null && userFull.stargifts_count > 0) || ((chatFull = this.q2) != null && chatFull.stargifts_count > 0))) {
            this.s1 = true;
            aVar = aVar2;
            i9 = 14;
        } else if (this.n1) {
            aVar = aVar2;
            i9 = 10;
        } else {
            aVar = aVar2;
            i9 = arrayList != null ? 7 : -1;
        }
        org.telegram.ui.Components.wt0 wt0Var = this.N;
        TLRPC.UserFull userFull3 = this.r2;
        long j11 = j10;
        ig.a aVar4 = aVar;
        hz0 hz0Var2 = new hz0(this, context, j11, wt0Var, userFull3 != null ? userFull3.common_chats_count : 0, this.y2, this.q2, userFull3, i9, this.u1, this, this, this.v0, this.k6);
        this.K = hz0Var2;
        hz0Var2.setLayoutParams(new f2.a1(-1, -1));
        this.K.n0((ViewGroup) this.fragmentView);
        int i20 = 4;
        int i21 = 3;
        if (this.a1 == 0 || this.m0 == null || this.o1) {
            org.telegram.ui.Components.hh0 hh0Var = new org.telegram.ui.Components.hh0(context, this.v0);
            this.Y = hh0Var;
            org.telegram.ui.Components.rg0 rg0Var = this.i0;
            if (rg0Var != null) {
                rg0Var.setMusicView(hh0Var);
            }
            this.Y.setColor(this.M5);
            TLRPC.UserFull userFull4 = this.r2;
            if (userFull4 != null && (document = userFull4.saved_music) != null) {
                this.Y.setMusicDocument(document);
            }
            this.Y.setOnClickListener(new ex0(this, i20));
            this.W = new org.telegram.ui.Components.pg0(context, AndroidUtilities.dp(74.0f));
            I4();
            r12 = 0;
            g5(false);
            this.W.setOnActionClickListener(new fx0(this, i21));
        } else {
            r12 = 0;
        }
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        n10.setTranslationX(-AndroidUtilities.dp(5.0f));
        if (this.a1 == getUserConfig().clientUserId && !this.o1 && ContactsController.getInstance(this.currentAccount).getPrivacyRules(7) == null) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
        if (this.m0 != null && !this.o1) {
            org.telegram.ui.ActionBar.w0 a2 = n10.a(32, R.drawable.outline_header_search);
            a2.F();
            a2.D = new cb(this, 14);
            this.Q0 = a2;
            a2.setContentDescription(LocaleController.getString(R.string.SearchInSettings));
            this.Q0.setSearchFieldHint(LocaleController.getString(R.string.SearchInSettings));
            this.K.getSearchItem().setVisibility(8);
            if (this.K.getSearchOptionsItem() != null) {
                this.K.getSearchOptionsItem().setVisibility(8);
            }
            if (this.K.getSaveItem() != null) {
                this.K.getSaveItem().setVisibility(8);
            }
            if (this.j1) {
                this.Q0.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.w0 a3 = n10.a(16, R.drawable.profile_video);
        this.N0 = a3;
        a3.setContentDescription(LocaleController.getString(R.string.VideoCall));
        if (this.b1 != 0) {
            this.M0 = n10.a(15, R.drawable.msg_voicechat2);
            if (ChatObject.isChannelOrGiga(this.A2)) {
                this.M0.setContentDescription(LocaleController.getString(R.string.VoipChannelVoiceChat));
            } else {
                this.M0.setContentDescription(LocaleController.getString(R.string.VoipGroupVoiceChat));
            }
        } else {
            org.telegram.ui.ActionBar.w0 a10 = n10.a(15, R.drawable.call);
            this.M0 = a10;
            a10.setContentDescription(LocaleController.getString(R.string.Call));
        }
        if (this.o1) {
            org.telegram.ui.ActionBar.w0 a11 = n10.a(41, R.drawable.group_edit_profile);
            this.O0 = a11;
            a11.setContentDescription(LocaleController.getString(R.string.Edit));
        } else {
            org.telegram.ui.ActionBar.w0 a12 = n10.a(12, R.drawable.group_edit_profile);
            this.O0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.Edit));
        }
        org.telegram.ui.ActionBar.w0 c10 = n10.c(10, R.drawable.ic_ab_other, this.v0);
        this.P0 = c10;
        c10.setSubMenuDelegate(new ay0(this));
        ImageView imageView = new ImageView(context);
        this.U0 = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.v8), PorterDuff.Mode.MULTIPLY));
        AndroidUtilities.updateViewVisibilityAnimated(this.U0, r12, 0.8f, r12);
        this.U0.setImageResource(R.drawable.msg_mini_autodelete_timer);
        this.P0.addView(this.U0, g7.e6.d(12, 12.0f, 19, 8.0f, 2.0f, 0.0f, 0.0f));
        this.P0.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.P0.E(aVar4, mg.c.g(this.resourceProvider));
        if (this.a == null || this.m0 == null) {
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
            obj = this.v.getTag();
        }
        D3(r12);
        this.d = new vz0(this, context);
        this.e = new f01(context, this);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8();
        this.l0 = z8Var;
        z8Var.p = 2.3809524f;
        z8Var.t();
        this.fragmentView.setWillNotDraw(r12);
        fz0 fz0Var = (fz0) this.fragmentView;
        this.i5 = fz0Var;
        fz0Var.J = true;
        by0 by0Var = new by0(this, context, this.v0);
        this.a = by0Var;
        by0Var.p1();
        by0 by0Var2 = this.a;
        by0Var2.getClass();
        int i22 = org.telegram.ui.ActionBar.f6.a7;
        by0Var2.setBackgroundColor(getThemedColor(i22));
        this.a.setVerticalScrollBarEnabled(r12);
        final ig.k kVar = new ig.k(this.a, (ViewGroup) this.fragmentView, new u8(this, 1));
        kVar.h = true;
        cy0 cy0Var = new cy0(this);
        this.a.setItemAnimator(cy0Var);
        int i23 = i10;
        cy0Var.e = 320L;
        cy0Var.d = 320L;
        cy0Var.c = 320L;
        cy0Var.m = r12;
        cy0Var.S();
        cy0Var.o(org.telegram.ui.Components.gr.h);
        this.a.setClipToPadding(r12);
        this.a.setHideIfEmpty(r12);
        dy0 dy0Var = new dy0(this);
        this.c = dy0Var;
        dy0Var.j1(1);
        dy0 dy0Var2 = this.c;
        dy0Var2.r = r12;
        this.a.setLayoutManager(dy0Var2);
        this.a.setGlowColor(r12);
        this.a.setAdapter(this.d);
        frameLayout.addView(this.a, g7.e6.e(-1, -1, 51));
        this.a.setOnItemClickListener(new b9.a(this, context, j11, 9));
        this.a.setOnItemLongClickListener(new hy0(this, context));
        if (this.n1 || this.p1 || this.t1) {
            j5();
            E();
            this.S5 = true;
            this.Q5 = this.F4;
            this.R5 = r12;
        }
        if (this.Q0 != null) {
            org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context);
            this.b = wk0Var;
            wk0Var.setVerticalScrollBarEnabled(r12);
            this.b.setLayoutManager(new f2.m0(1, r12));
            this.b.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.f6.e8));
            this.b.setAdapter(this.e);
            this.b.setItemAnimator(null);
            this.b.setVisibility(8);
            this.b.setLayoutAnimation(null);
            this.b.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
            frameLayout.addView(this.b, g7.e6.e(-1, -1, 51));
            this.b.setOnItemClickListener(new i(this, 27));
            this.b.setOnItemLongClickListener(new fx0(this, i20));
            this.b.setOnScrollListener(new iy0(this, r12));
            this.b.m1(1, true);
            org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(context);
            this.L = gw0Var;
            gw0Var.setAnimateLayoutChange(true);
            this.L.e.setVisibility(8);
            this.L.setVisibility(8);
            frameLayout.addView(this.L);
            this.e.G();
        }
        if (this.A1 != 0) {
            i11 = i23;
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.A1));
            if (this.C2 == null) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(chat2);
                chat = chat2;
                tL_channels_getParticipant.participant = getMessagesController().getInputPeer(this.a1);
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new ox0(this, i20));
            } else {
                chat = chat2;
            }
            dh.g gVar2 = new dh.g(context, 25);
            gVar2.setWillNotDraw(r12);
            gVar2.setPadding(r12, r12, r12, AndroidUtilities.navigationBarHeight);
            frameLayout.addView(gVar2, g7.e6.a(-1.0f, (AndroidUtilities.navigationBarHeight / AndroidUtilities.density) + 51.0f, 83));
            gVar2.setOnClickListener(new v80(17, this, chat));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.p7));
            textView.setTextSize(1, 15.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.BanFromTheGroupNoCaps));
            gVar2.addView(textView, g7.e6.d(-2, -2.0f, 17, 0.0f, 1.0f, 0.0f, 0.0f));
            this.a.setPadding(r12, T3(), r12, AndroidUtilities.dp(48.0f));
            this.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f));
        } else {
            i11 = i23;
            this.a.setPadding(r12, T3(), r12, r12);
        }
        i01 i01Var = new i01(this, context);
        this.Z0 = i01Var;
        i01Var.a(this.M5, r12);
        this.Z0.setBackgroundColor(getThemedColor(i22));
        frameLayout.addView(this.Z0);
        this.i5.P.add(this.Z0);
        org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
        this.Z = oVar;
        oVar.setPivotX(AndroidUtilities.dp(30.0f));
        this.Z.setPivotY(AndroidUtilities.dp(30.0f));
        this.U = new m0(this, context, 20);
        this.V = new fh.v(this, context, 21);
        ImageReceiver imageReceiver = new ImageReceiver(this.V);
        this.n5 = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.V, true, 1.0f, r12);
        frameLayout.addView(this.V, g7.e6.d(-1, -1.0f, 8388611, 0.0f, 0.0f, 0.0f, 0.0f));
        this.U.setPivotX(0.0f);
        this.U.setPivotY(0.0f);
        org.telegram.ui.Components.eh0 eh0Var = new org.telegram.ui.Components.eh0(context);
        this.p0 = eh0Var;
        eh0Var.addView(this.U, g7.e6.e(100, 100, 51));
        this.V.addView(this.p0, g7.e6.c(-1.0f, -1));
        ly0 ly0Var = new ly0(context);
        this.a0 = ly0Var;
        ly0Var.t(O3());
        this.a0.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.a0.setRoundRadiusForExpand(c4());
        this.a0.setPivotX(0.0f);
        this.a0.setPivotY(0.0f);
        this.U.addView(this.a0, g7.e6.c(-1.0f, -1));
        this.a0.setOnClickListener(new ex0(this, 5));
        this.a0.setHasStories(j4());
        this.a0.setOnLongClickListener(new u(this, 6));
        org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(this, context);
        this.c0 = z3Var;
        z3Var.setSize(AndroidUtilities.dp(26.0f));
        this.c0.setProgressColor(-1);
        this.c0.setNoProgress(r12);
        this.U.addView(this.c0, g7.e6.c(-1.0f, -1));
        ImageView imageView2 = new ImageView(context);
        this.d0 = imageView2;
        imageView2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
        ImageView imageView3 = this.d0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        this.d0.setAlpha(0.0f);
        this.d0.setScaleX(0.85f);
        this.d0.setScaleY(0.85f);
        ImageView imageView4 = this.d0;
        org.telegram.ui.Components.b11 b11Var = new org.telegram.ui.Components.b11(context, null);
        this.h0 = b11Var;
        imageView4.setImageDrawable(b11Var);
        this.d0.setTranslationY(-1.0f);
        frameLayout.addView(this.d0, g7.e6.e(34, 34, 51));
        ImageView imageView5 = new ImageView(context);
        this.e0 = imageView5;
        imageView5.setScaleType(scaleType);
        this.e0.setAlpha(0.0f);
        this.e0.setImageDrawable(new nh.a());
        frameLayout.addView(this.e0, g7.e6.e(16, 16, 51));
        ImageView imageView6 = new ImageView(context);
        this.f0 = imageView6;
        imageView6.setImageResource(R.drawable.star_small_outline);
        this.f0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.s8), PorterDuff.Mode.SRC_IN));
        this.f0.setAlpha(0.0f);
        this.f0.setScaleY(0.0f);
        this.f0.setScaleX(0.0f);
        frameLayout.addView(this.f0, g7.e6.e(20, 20, 51));
        ImageView imageView7 = new ImageView(context);
        this.g0 = imageView7;
        imageView7.setImageResource(R.drawable.star_small_inner);
        this.g0.setAlpha(0.0f);
        this.g0.setScaleY(0.0f);
        this.g0.setScaleX(0.0f);
        frameLayout.addView(this.g0, g7.e6.e(20, 20, 51));
        k5();
        P4(r12, r12);
        my0 my0Var = this.j0;
        if (my0Var != null) {
            my0Var.K();
        }
        org.telegram.ui.Components.rg0 rg0Var2 = this.i0;
        if (rg0Var2 != null) {
            rg0Var2.e();
        }
        this.J = new wz0(this, context);
        org.telegram.ui.Components.rg0 rg0Var3 = new org.telegram.ui.Components.rg0(context);
        this.i0 = rg0Var3;
        rg0Var3.setSize(O3());
        long j12 = this.a1;
        if (j12 == 0) {
            j12 = -this.b1;
        }
        int i24 = i11;
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        by0 by0Var3 = this.a;
        long j13 = j12;
        ly0 ly0Var2 = this.a0;
        getClassGuid();
        int i25 = 1;
        this.j0 = new my0(this, context, j13, kVar2, by0Var3, ly0Var2, this.J, this.i0);
        if (this.a1 != getUserConfig().clientUserId && (userFull2 = this.r2) != null) {
            this.j5 = userFull2.profile_photo == null ? 0.0f : 1.0f;
        }
        if (!this.m1) {
            this.j0.setChatInfo(this.q2);
        }
        this.V.addView(this.j0);
        this.V.addView(this.i0, g7.e6.c(138.0f, -1));
        this.V.addView(this.J);
        org.telegram.ui.Components.pg0 pg0Var = this.W;
        if (pg0Var != null) {
            this.i0.setActionsView(pg0Var);
            this.V.addView(this.W, g7.e6.c(-1.0f, -1));
        }
        org.telegram.ui.Components.hh0 hh0Var2 = this.Y;
        if (hh0Var2 != null) {
            this.i0.setMusicView(hh0Var2);
            this.V.addView(this.Y, g7.e6.c(-1.0f, -1));
        }
        this.a0.setAvatarsViewPager(this.j0);
        yz0 yz0Var = new yz0(this, context);
        this.k0 = yz0Var;
        this.V.addView(yz0Var, g7.e6.c(-1.0f, -1));
        frameLayout.addView(this.actionBar);
        float f11 = 54 + ((!this.H0 || this.a1 == 0) ? 0 : 54);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var == null || !(b5Var.getLastFragment() instanceof qn) || (o6 = ((qn) this.parentLayout.getLastFragment()).o()) == null) {
            f10 = f11;
            z10 = false;
        } else {
            boolean z11 = o6.getTitleTextView().getPaddingRight() != 0;
            if (o6.getLayoutParams() != null && o6.getTitleTextView() != null) {
                f11 = ((o6.getWidth() - o6.getTitleTextView().getRight()) + ((ViewGroup.MarginLayoutParams) o6.getLayoutParams()).rightMargin) / AndroidUtilities.density;
            }
            f10 = f11;
            z10 = z11;
        }
        int i26 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.f;
            if (i26 >= h5VarArr.length) {
                break;
            }
            if (this.F1 != 0 || i26 != 0) {
                zk zkVar = new zk(this, context, 3);
                h5VarArr[i26] = zkVar;
                if (i26 == 1) {
                    zkVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.vh));
                } else {
                    zkVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.A8));
                }
                h5VarArr[i26].setPadding(r12, AndroidUtilities.dp(6.0f), r12, AndroidUtilities.dp(i26 == 0 ? 12.0f : 4.0f));
                h5VarArr[i26].setTextSizePx(AndroidUtilities.dp(17.5f));
                h5VarArr[i26].setGravity(3);
                h5VarArr[i26].setTypeface(AndroidUtilities.bold());
                h5VarArr[i26].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
                h5VarArr[i26].setPivotX(0.0f);
                h5VarArr[i26].setPivotY(0.0f);
                h5VarArr[i26].setAlpha(i26 == 0 ? 0.0f : 1.0f);
                if (i26 == 1) {
                    h5VarArr[i26].setScrollNonFitText(true);
                    h5VarArr[i26].setImportantForAccessibility(2);
                }
                h5VarArr[i26].setFocusable(i26 == 0);
                h5VarArr[i26].setEllipsizeByGradient(true);
                h5VarArr[i26].setRightDrawableOutside(i26 == 0);
                this.V.addView(h5VarArr[i26], g7.e6.d(-2, -2.0f, 51, 109.0f, -6.0f, i26 == 0 ? f10 - (z10 ? 10 : 0) : 0.0f, 0.0f));
            }
            i26++;
        }
        int i27 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.r;
            if (i27 >= h5VarArr2.length) {
                break;
            }
            if (i27 == 1) {
                h5VarArr2[i27] = new ny0(this, context);
            } else {
                h5VarArr2[i27] = new org.telegram.ui.Components.g80(context);
            }
            h5VarArr2[i27].setEllipsizeByGradient(true);
            h5VarArr2[i27].setTextColor(w3(getThemedColor(org.telegram.ui.ActionBar.f6.B8), null));
            h5VarArr2[i27].setTextSizePx(AndroidUtilities.dp(13.5f));
            h5VarArr2[i27].setGravity(3);
            h5VarArr2[i27].setAlpha(i27 == 0 ? 0.0f : 1.0f);
            h5VarArr2[i27].setPivotX(AndroidUtilities.dp(8.0f));
            h5VarArr2[i27].setPivotY(AndroidUtilities.dp(8.0f));
            if (i27 == 1 || i27 == 2 || i27 == 3) {
                h5VarArr2[i27].setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            }
            if (i27 > 0) {
                h5VarArr2[i27].setImportantForAccessibility(2);
            }
            h5VarArr2[i27].setFocusable(i27 == 0);
            fh.v vVar = this.V;
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr2[i27];
            if (i27 == 1 || i27 == 2) {
                i13 = 3;
            } else {
                i13 = 3;
                if (i27 != 3) {
                    i14 = 0;
                    vVar.addView(h5Var, g7.e6.d(-2, -2.0f, 51, 109 - i14, (i27 != 1 || i27 == 2 || i27 == i13) ? -2 : 0, (i27 != 0 ? f10 - (z10 ? 10 : 0) : 8.0f) - ((i27 != 1 || i27 == 2 || i27 == 3) ? 4 : 0), 0.0f));
                    i27++;
                }
            }
            i14 = 4;
            if (i27 != 0) {
            }
            vVar.addView(h5Var, g7.e6.d(-2, -2.0f, 51, 109 - i14, (i27 != 1 || i27 == 2 || i27 == i13) ? -2 : 0, (i27 != 0 ? f10 - (z10 ? 10 : 0) : 8.0f) - ((i27 != 1 || i27 == 2 || i27 == 3) ? 4 : 0), 0.0f));
            i27++;
        }
        B3();
        this.V.addView(this.Z);
        org.telegram.ui.Components.qv0 qv0Var = new org.telegram.ui.Components.qv0(context);
        this.P = qv0Var;
        qv0Var.setLayoutParams(g7.e6.d(32, 32.0f, 3, 103.0f, -2.0f, 0.0f, 0.0f));
        this.P.setResourcesProvider(this.v0);
        C3();
        this.P.setDelegate(new fx0(this, 10));
        this.P.setOnClickListener(new ex0(this, r12));
        TLRPC.UserFull userFull5 = this.r2;
        if (userFull5 != null) {
            this.P.set(userFull5.stars_rating);
        }
        this.V.addView(this.P);
        org.telegram.ui.Components.nn0 nn0Var = new org.telegram.ui.Components.nn0(this, context, context, i25);
        this.s = nn0Var;
        nn0Var.setAlpha(0.0f);
        this.V.addView(this.s, g7.e6.d(-2, -2.0f, 51, 109.33f, -2.0f, 8.0f, 0.0f));
        this.q0 = new oy0(this, context, this.currentAccount, a(), this.m1, this.U, this.a0, this.v0, context);
        l5(r12);
        TLRPC.UserFull userFull6 = this.r2;
        if (userFull6 != null) {
            this.q0.setStories(userFull6.stories);
        } else {
            TLRPC.ChatFull chatFull3 = this.q2;
            if (chatFull3 != null) {
                this.q0.setStories(chatFull3.stories);
            }
        }
        ly0 ly0Var3 = this.a0;
        if (ly0Var3 != null) {
            ly0Var3.setHasStories(j4());
        }
        this.V.addView(this.q0, g7.e6.c(-1.0f, -1));
        gh.v0 v0Var = new gh.v0(context, this.currentAccount, a(), this.U);
        this.r0 = v0Var;
        this.V.addView(v0Var, (int) r12, g7.e6.c(-1.0f, -1));
        i5(true);
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
        this.v = pi0Var;
        if (this.W != null) {
            pi0Var.setVisibility(8);
        }
        p5();
        if (this.a1 == 0) {
            this.v.setImageResource(R.drawable.profile_discuss);
            this.v.setContentDescription(LocaleController.getString(R.string.ViewDiscussion));
        } else if (this.m0 != null) {
            int i28 = R.raw.camera_outline;
            this.R = new org.telegram.ui.Components.mi0(i28, String.valueOf(i28), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            this.S = new org.telegram.ui.Components.mi0(R.raw.camera_outline, aa.d.l(R.raw.camera_outline, "_cell", new StringBuilder()), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
            org.telegram.ui.Components.pg0 pg0Var2 = this.W;
            if (pg0Var2 != null) {
                pg0Var2.e();
                this.W.a();
                this.W.b();
                this.W.c();
                org.telegram.ui.Components.pg0 pg0Var3 = this.W;
                if (pg0Var3.E) {
                    pg0Var3.E = r12;
                    pg0Var3.d();
                }
            } else {
                this.v.setAnimation(this.R);
                this.v.setContentDescription(LocaleController.getString(R.string.AccDescrChangeProfilePicture));
                this.v.setPadding(AndroidUtilities.dp(2.0f), r12, r12, AndroidUtilities.dp(2.0f));
            }
        } else {
            org.telegram.ui.Components.pg0 pg0Var4 = this.W;
            if (pg0Var4 != 0) {
                pg0Var4.o(r12, true);
            }
            this.v.setImageResource(R.drawable.profile_newmsg);
            this.v.setContentDescription(LocaleController.getString(R.string.AccDescrOpenChat));
        }
        org.telegram.ui.Components.pi0 pi0Var2 = this.v;
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        pi0Var2.setScaleType(scaleType2);
        frameLayout.addView(this.v, g7.e6.d(60, 60.0f, 53, 0.0f, 0.0f, 16.0f, 0.0f));
        this.v.setOnClickListener(new ex0(this, 1));
        k4(r12);
        if (i24 != -1 && obj != null) {
            this.v.setTag(Integer.valueOf((int) r12));
            this.v.setScaleX(0.2f);
            this.v.setScaleY(0.2f);
            this.v.setAlpha(0.0f);
        }
        this.a.setOnScrollListener(new iy0(this, 1));
        UndoView undoView = new UndoView(context, null, r12, this.v0);
        this.I = undoView;
        frameLayout.addView(undoView, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        int i29 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2 = ofFloat;
        ofFloat.addUpdateListener(new kx0(this, r12));
        this.f2.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f2.addListener(new py0(this));
        j5();
        Q();
        org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(getParentActivity(), 9);
        this.T = s30Var;
        s30Var.setAlpha(0.0f);
        frameLayout.addView(this.T, g7.e6.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
        this.K.setForwardRestrictedHint(this.T);
        qy0 qy0Var = new qy0(this, (ViewGroup) getParentActivity().getWindow().getDecorView(), frameLayout);
        this.R4 = qy0Var;
        qy0Var.E = new ay0(this);
        this.j0.setPinchToZoomHelper(qy0Var);
        this.t0.setAlpha(r12);
        this.u0.setColor(getThemedColor(org.telegram.ui.ActionBar.f6.i6));
        this.i5.P.add(this.K);
        m5();
        yi0 yi0Var = new yi0(this, context, 5);
        this.Q = yi0Var;
        if (Build.VERSION.SDK_INT >= 23) {
            yi0Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(org.telegram.ui.ActionBar.f6.d6), 100)));
        }
        this.Q.setFocusable((boolean) r12);
        this.Q.setImportantForAccessibility(2);
        this.Q.setOnClickListener(new ex0(this, i29));
        this.Q.setVisibility(8);
        this.Q.setFitsSystemWindows(true);
        this.i5.addView(this.Q, g7.e6.c(-1.0f, -1));
        F3();
        if (this.o1) {
            i12 = 87;
            this.i5.addView(this.o5, g7.e6.e(-1, 60, 87));
        } else {
            i12 = 87;
        }
        org.telegram.ui.Components.pg0 pg0Var5 = this.W;
        if (pg0Var5 != null && pg0Var5.l()) {
            ImageView imageView8 = new ImageView(context);
            this.K0 = imageView8;
            imageView8.setScaleType(scaleType2);
            this.K0.setImageResource(R.drawable.call);
            this.K0.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            layoutParams.topMargin = this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.setMarginEnd(layoutParams.width);
            layoutParams.gravity = 8388613;
            frameLayout.addView(this.K0, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.u5 = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        View view = new View(context);
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d7));
        this.u5.addView(view, g7.e6.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        kh.d dVar = new kh.d(context, this.v0);
        this.v5 = dVar;
        dVar.h(LocaleController.getString(R.string.Save));
        this.u5.addView(this.v5, g7.e6.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        this.v5.setOnClickListener(new ex0(this, 3));
        this.u5.setVisibility(8);
        this.u5.setTranslationY(AndroidUtilities.dp(69.0f));
        this.i5.addView(this.u5, g7.e6.e(-1, -2, i12));
        this.o6 = new jg.a() { // from class: org.telegram.ui.px0
            @Override // jg.a
            public final void e(Canvas canvas, RectF rectF) {
                kVar.e(canvas, rectF);
                org.telegram.ui.Components.ah ahVar = ProfileActivity.this.K.Y1;
                if (ahVar != null) {
                    ahVar.e(canvas, rectF);
                }
            }

            @Override // jg.a
            public final void g(g.x xVar, RectF rectF) {
                xVar.b = true;
            }
        };
        r0.j0.m(this.fragmentView, new fx0(this, i29));
        return this.fragmentView;
    }

    public final org.telegram.ui.Components.fr d4(int i9) {
        MessagesController.PeerColor peerColor;
        org.telegram.ui.Components.fr[] frVarArr = this.F;
        if (frVarArr[i9] == null) {
            Drawable mutate = org.telegram.ui.ActionBar.f6.Q1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr = this.y;
            drawableArr[i9] = mutate;
            Drawable mutate2 = org.telegram.ui.ActionBar.f6.R1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr2 = this.E;
            drawableArr2[i9] = mutate2;
            if (i9 == 1 && (peerColor = this.M5) != null) {
                int b10 = org.telegram.ui.ActionBar.f6.b(0.1f, org.telegram.ui.ActionBar.f6.I.q() ? -0.1f : -0.08f, peerColor.hasColor6(org.telegram.ui.ActionBar.f6.I.q()) ? this.M5.getColor5() : this.M5.getColor3());
                Drawable drawable = drawableArr[1];
                int offsetColor = AndroidUtilities.getOffsetColor(b10, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oi, this.v0), this.A5, 1.0f);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(offsetColor, mode);
                drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, this.v0), this.A5, 1.0f), mode);
            }
            frVarArr[i9] = new org.telegram.ui.Components.fr(new org.telegram.ui.Components.fq(drawableArr[i9], drawableArr2[i9]), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return frVarArr[i9];
    }

    public final void d5() {
        e5(false, false);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        vz0 vz0Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.Chat chat;
        by0 by0Var;
        by0 by0Var2;
        org.telegram.ui.Components.ik0 ik0Var;
        if (i9 == NotificationCenter.uploadStoryEnd || i9 == NotificationCenter.chatWasBoostedByUser) {
            if (ChatObject.isBoostSupported(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.b1)))) {
                getMessagesController().getStoriesController().k(a(), new ih.e(12), false, this.v0);
                return;
            }
            return;
        }
        int i11 = 0;
        r3 = false;
        boolean z10 = false;
        if (i9 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            boolean z11 = ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0 && (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) == 0) ? false : true;
            if (this.a1 != 0) {
                if (z11) {
                    i5(true);
                }
                if ((intValue & MessagesController.UPDATE_MASK_PHONE) == 0 || (by0Var2 = this.a) == null || (ik0Var = (org.telegram.ui.Components.ik0) by0Var2.L(this.C3, false)) == null) {
                    return;
                }
                this.d.v(ik0Var, this.C3);
                return;
            }
            if (this.b1 != 0) {
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0) {
                        e5(true, false);
                    } else {
                        h5(true);
                    }
                    i5(true);
                }
                if (!z11 || (by0Var = this.a) == null) {
                    return;
                }
                int childCount = by0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.a.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.va) {
                        ((org.telegram.ui.Cells.va) childAt).j(intValue);
                    }
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.chatOnlineCountDidLoad) {
            Long l10 = (Long) objArr[0];
            if (this.q2 == null || (chat = this.A2) == null || chat.id != l10.longValue()) {
                return;
            }
            this.q2.online_count = ((Integer) objArr[1]).intValue();
            h5(true);
            i5(false);
            return;
        }
        if (i9 == NotificationCenter.contactsDidLoad || i9 == NotificationCenter.channelRightsUpdated) {
            D3(true);
            return;
        }
        if (i9 == NotificationCenter.encryptedChatCreated) {
            if (this.f1) {
                AndroidUtilities.runOnUIThread(new ys0(11, this, objArr));
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.encryptedChatUpdated) {
            TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
            TLRPC.EncryptedChat encryptedChat2 = this.z2;
            if (encryptedChat2 == null || encryptedChat.id != encryptedChat2.id) {
                return;
            }
            this.z2 = encryptedChat;
            e5(false, false);
            FlagSecureReason flagSecureReason = this.T1;
            if (flagSecureReason != null) {
                flagSecureReason.invalidate();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.blockedUsersDidLoad) {
            boolean z12 = this.g1;
            boolean z13 = getMessagesController().blockePeers.indexOfKey(this.a1) >= 0;
            this.g1 = z13;
            if (z12 != z13) {
                D3(true);
                e5(false, false);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.groupCallUpdated) {
            Long l11 = (Long) objArr[0];
            if (this.A2 != null) {
                long longValue = l11.longValue();
                TLRPC.Chat chat2 = this.A2;
                if (longValue == chat2.id && ChatObject.canManageCalls(chat2)) {
                    TLRPC.ChatFull chatFull4 = MessagesController.getInstance(this.currentAccount).getChatFull(l11.longValue());
                    if (chatFull4 != null) {
                        TLRPC.ChatFull chatFull5 = this.q2;
                        if (chatFull5 != null) {
                            chatFull4.participants = chatFull5.participants;
                        }
                        this.q2 = chatFull4;
                    }
                    hz0 hz0Var = this.K;
                    if (hz0Var != null) {
                        hz0Var.setChatInfo(this.q2);
                    }
                    TLRPC.ChatFull chatFull6 = this.q2;
                    if (chatFull6 != null && (((inputGroupCall = chatFull6.call) == null && !this.l1) || (inputGroupCall != null && this.l1))) {
                        D3(false);
                    }
                    oy0 oy0Var = this.q0;
                    if (oy0Var != null && (chatFull3 = this.q2) != null) {
                        oy0Var.setStories(chatFull3.stories);
                    }
                    gh.v0 v0Var = this.r0;
                    if (v0Var != null) {
                        v0Var.a();
                    }
                    ly0 ly0Var = this.a0;
                    if (ly0Var != null) {
                        ly0Var.setHasStories(j4());
                    }
                    if (l11.longValue() != 0) {
                        boolean z14 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.q2) == null || !chatFull2.stargifts_available) ? false : true;
                        this.P0.I(38, z14);
                        org.telegram.ui.Components.pg0 pg0Var = this.W;
                        if (pg0Var != null) {
                            pg0Var.o(3, z14);
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
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull7 = (TLRPC.ChatFull) objArr[0];
            if (this.a1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.a1))) != null && chatFull7.id == user.linked_community_id) {
                e5(true, false);
            }
            TLRPC.Chat chat3 = this.A2;
            if (chat3 != null && chatFull7.id == chat3.linked_community_id) {
                e5(true, false);
            }
            if (chatFull7.id == this.b1) {
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                TLRPC.ChatFull chatFull8 = this.q2;
                if ((chatFull8 instanceof TLRPC.TL_channelFull) && chatFull7.participants == null) {
                    chatFull7.participants = chatFull8.participants;
                }
                boolean z15 = chatFull8 == null && (chatFull7 instanceof TLRPC.TL_channelFull);
                this.q2 = chatFull7;
                if (this.i1 == 0) {
                    long j10 = chatFull7.migrated_from_chat_id;
                    if (j10 != 0) {
                        this.i1 = -j10;
                        getMediaDataController().getMediaCount(this.i1, this.c1, 0, this.classGuid, true);
                    }
                }
                L3();
                my0 my0Var = this.j0;
                if (my0Var != null && !this.m1) {
                    my0Var.setChatInfo(this.q2);
                }
                e5(true, false);
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.b1));
                if (chat4 != null) {
                    this.A2 = chat4;
                    D3(true);
                }
                FlagSecureReason flagSecureReason2 = this.T1;
                if (flagSecureReason2 != null) {
                    flagSecureReason2.invalidate();
                }
                if (this.A2.megagroup && (z15 || !booleanValue)) {
                    R3(true);
                }
                T4();
                m5();
                oy0 oy0Var2 = this.q0;
                if (oy0Var2 != null && (chatFull = this.q2) != null) {
                    oy0Var2.setStories(chatFull.stories);
                }
                gh.v0 v0Var2 = this.r0;
                if (v0Var2 != null) {
                    v0Var2.a();
                }
                ly0 ly0Var2 = this.a0;
                if (ly0Var2 != null) {
                    ly0Var2.setHasStories(j4());
                }
                hz0 hz0Var2 = this.K;
                if (hz0Var2 != null) {
                    hz0Var2.setChatInfo(this.q2);
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i9 == NotificationCenter.closeProfileActivity) {
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
        if (i9 == NotificationCenter.botInfoDidLoad) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
            if (botInfo.user_id == this.a1) {
                this.B2 = botInfo;
                e5(false, false);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.userInfoDidLoad) {
            if (((Long) objArr[0]).longValue() == this.a1) {
                TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                this.r2 = userFull;
                org.telegram.ui.Components.qv0 qv0Var = this.P;
                if (qv0Var != null) {
                    qv0Var.set(userFull.stars_rating);
                }
                oy0 oy0Var3 = this.q0;
                if (oy0Var3 != null) {
                    oy0Var3.setStories(this.r2.stories);
                }
                gh.v0 v0Var3 = this.r0;
                if (v0Var3 != null) {
                    v0Var3.a();
                }
                ly0 ly0Var3 = this.a0;
                if (ly0Var3 != null) {
                    ly0Var3.setHasStories(j4());
                }
                hz0 hz0Var3 = this.K;
                if (hz0Var3 != null) {
                    hz0Var3.setUserInfo(this.r2);
                }
                if (this.m0 == null) {
                    if (this.C1 || this.G0) {
                        this.E1 = true;
                    } else {
                        D3(true);
                    }
                    e5(false, false);
                    hz0 hz0Var4 = this.K;
                    if (hz0Var4 != null) {
                        hz0Var4.setCommonGroupsCount(this.r2.common_chats_count);
                        Q();
                        org.telegram.ui.Components.wt0 wt0Var = this.N;
                        if (wt0Var == null || wt0Var.y) {
                            resumeDelayedFragmentAnimation();
                            k4(true);
                        }
                    }
                } else if (this.d != null && !TextUtils.equals(this.r2.about, this.v2)) {
                    this.d.m(this.S2);
                }
                T4();
                m5();
                if (this.s2 == null && !h4()) {
                    org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(this.currentAccount);
                    this.s2 = f6Var;
                    cb0 cb0Var = new cb0(this, 15);
                    if (f6Var.c) {
                        cb0Var.run();
                    } else {
                        f6Var.h.add(cb0Var);
                    }
                    this.s2.d(this.r2);
                }
                if (!h4()) {
                    j01 j01Var = this.u2;
                    j01 c10 = j01.c(this.currentAccount, this.r2, j01Var);
                    this.u2 = c10;
                    this.t2 = c10 != j01Var;
                    if (c10 != null) {
                        cb0 cb0Var2 = new cb0(this, 16);
                        if (c10.b) {
                            cb0Var2.run();
                        } else {
                            c10.h.add(cb0Var2);
                        }
                    }
                }
                if (this.P0 != null) {
                    if (e4()) {
                        this.P0.K(44);
                    } else {
                        this.P0.r(44);
                    }
                    TLRPC.UserFull userFull2 = this.r2;
                    if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                        z10 = true;
                    }
                    this.P0.I(46, z10);
                    this.P0.I(47, !z10);
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.privacyRulesUpdated) {
            return;
        }
        if (i9 == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long a2 = a();
            if (a2 == ((Long) objArr[0]).longValue()) {
                DialogObject.isEncryptedDialog(a2);
                ArrayList arrayList = (ArrayList) objArr[1];
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i13);
                    if (this.z2 != null) {
                        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (vz0Var = this.d) != null) {
                            vz0Var.l();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.emojiLoaded) {
            by0 by0Var3 = this.a;
            if (by0Var3 != null) {
                by0Var3.f1();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.reloadInterface) {
            e5(false, false);
            return;
        }
        if (i9 == NotificationCenter.newSuggestionsAvailable) {
            int i14 = this.Y2;
            int i15 = this.W2;
            int i16 = this.U2;
            j5();
            vz0 vz0Var2 = this.d;
            if (vz0Var2 != null) {
                if (i14 == this.Y2 && i15 == this.W2 && i16 == this.U2) {
                    return;
                }
                vz0Var2.l();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.topicsDidLoaded) {
            if (this.m1) {
                i5(false);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.updateSearchSettings) {
            f01 f01Var = this.e;
            if (f01Var != null) {
                f01Var.c = f01.H(this);
                this.e.v.clear();
                this.e.J();
                f01 f01Var2 = this.e;
                f01Var2.I(f01Var2.y);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.reloadDialogPhotos) {
            i5(false);
            return;
        }
        if (i9 == NotificationCenter.storiesUpdated || i9 == NotificationCenter.storiesReadUpdated) {
            ly0 ly0Var4 = this.a0;
            if (ly0Var4 != null) {
                ly0Var4.setHasStories(j4());
                this.a0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, this.g2));
            }
            oy0 oy0Var4 = this.q0;
            if (oy0Var4 != null) {
                TLRPC.UserFull userFull3 = this.r2;
                if (userFull3 != null) {
                    oy0Var4.setStories(userFull3.stories);
                    return;
                }
                TLRPC.ChatFull chatFull9 = this.q2;
                if (chatFull9 != null) {
                    oy0Var4.setStories(chatFull9.stories);
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.userIsPremiumBlockedUpadted) {
            org.telegram.ui.ActionBar.w0 w0Var = this.P0;
            if (w0Var != null) {
                w0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.a1)));
            }
            W4();
            return;
        }
        if (i9 == NotificationCenter.currentUserPremiumStatusChanged) {
            W4();
            return;
        }
        if (i9 == NotificationCenter.starBalanceUpdated) {
            e5(false, false);
            return;
        }
        if (i9 == NotificationCenter.botStarsUpdated) {
            e5(false, false);
            return;
        }
        if (i9 == NotificationCenter.botStarsTransactionsLoaded) {
            e5(false, false);
            return;
        }
        if (i9 == NotificationCenter.dialogDeleted) {
            if (a() == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var == null || b5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            return;
        }
        if (i9 == NotificationCenter.channelRecommendationsLoaded) {
            long longValue3 = ((Long) objArr[0]).longValue();
            if (this.F4 >= 0 || longValue3 != a()) {
                return;
            }
            j5();
            Q();
            vz0 vz0Var3 = this.d;
            if (vz0Var3 != null) {
                vz0Var3.l();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() != a() || h4()) {
                return;
            }
            if (this.F4 >= 0) {
                hz0 hz0Var5 = this.K;
                if (hz0Var5 != null) {
                    hz0Var5.v1(true);
                    return;
                }
                return;
            }
            j5();
            Q();
            vz0 vz0Var4 = this.d;
            if (vz0Var4 != null) {
                vz0Var4.l();
            }
            AndroidUtilities.runOnUIThread(new cb0(this, 17));
            return;
        }
        if (i9 == NotificationCenter.profileMusicUpdated) {
            if (((Long) objArr[0]).longValue() != a() || this.a1 <= 0) {
                return;
            }
            TLRPC.UserFull userFull4 = getMessagesController().getUserFull(this.a1);
            if (userFull4 != null) {
                this.r2 = userFull4;
            }
            j5();
            Q();
            by0 by0Var4 = this.a;
            if (by0Var4 != null && by0Var4.b0()) {
                this.a.post(new cb0(this, 19));
                return;
            }
            vz0 vz0Var5 = this.d;
            if (vz0Var5 != null) {
                vz0Var5.l();
                return;
            }
            return;
        }
        if (i9 != NotificationCenter.updatedChatRanks) {
            return;
        }
        long longValue4 = ((Long) objArr[0]).longValue();
        long longValue5 = ((Long) objArr[1]).longValue();
        TLRPC.Chat chat5 = this.A2;
        if (chat5 == null || chat5.id != longValue4) {
            return;
        }
        String str = (String) objArr[2];
        a0.h hVar = this.y1;
        if (hVar != null && (chatParticipant = (TLRPC.ChatParticipant) hVar.f(longValue5)) != null) {
            chatParticipant.setRank(longValue5, str);
        }
        TLRPC.ChannelParticipant channelParticipant = this.C2;
        if (channelParticipant != null && channelParticipant.user_id == longValue5) {
            channelParticipant.rank = str;
        }
        while (true) {
            ArrayList arrayList2 = this.M4;
            if (i11 >= arrayList2.size()) {
                AndroidUtilities.updateVisibleRows(this.a);
                return;
            } else {
                ((TLRPC.ChatParticipant) arrayList2.get(i11)).setRank(longValue5, str);
                i11++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.e40 e40Var = this.m0;
        if (e40Var == null || !e40Var.g(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.e40 e40Var = this.m0;
        return (e40Var == null || dialog != e40Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final boolean e4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i9 = 0;
        if (!this.n2 || (userFull = this.r2) == null || (botInfo = userFull.bot_info) == null) {
            return false;
        }
        if (botInfo.privacy_policy_url != null) {
            return true;
        }
        ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
        int size = arrayList.size();
        while (i9 < size) {
            TLRPC.BotCommand botCommand = arrayList.get(i9);
            i9++;
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
            by0 by0Var = this.a;
            if (by0Var.C) {
                by0Var.post(new org.telegram.ui.Components.a50(13, this, z10));
                return;
            }
            return;
        }
        jz0 jz0Var = new jz0(this);
        jz0Var.b = this.J2;
        jz0Var.f(jz0Var.c);
        jz0Var.e.clear();
        jz0Var.f.clear();
        jz0Var.e.addAll(this.M4);
        jz0Var.f.addAll(this.N4);
        jz0Var.g = this.q4;
        jz0Var.h = this.r4;
        if (z10) {
            h5(false);
        }
        F4();
        j5();
        jz0Var.f(jz0Var.d);
        try {
            f2.s.c(jz0Var, true).b(this.d);
        } catch (Exception e10) {
            FileLog.e(e10);
            this.d.l();
        }
        int i9 = this.Q5;
        if (i9 >= 0) {
            this.c.h1(i9, this.R5 - this.a.getPaddingTop());
        }
        AndroidUtilities.updateVisibleRows(this.a);
    }

    @Override // org.telegram.ui.Components.qs0
    public final org.telegram.ui.Components.wk0 f() {
        return this.a;
    }

    public final void f4() {
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        this.j2 = point.x > point.y;
    }

    public final void f5() {
        if (this.Y == null || this.r[1] == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        boolean z10 = this.C1;
        if (z10 && this.F1 == 2 && this.U != null) {
            this.Y.setAlpha(this.O1);
            org.telegram.ui.Components.hh0 hh0Var = this.Y;
            float dp = AndroidUtilities.dp(74.0f) + this.a.getMeasuredWidth();
            hh0Var.H = O3() - AndroidUtilities.dp(74.0f);
            hh0Var.setTranslationY(dp - AndroidUtilities.dp(12.0f));
            hh0Var.invalidate();
            return;
        }
        if (z10) {
            this.Y.setAlpha(this.O1);
        }
        float f10 = currentActionBarHeight;
        float dp2 = this.M1 + f10 + AndroidUtilities.dp(74.0f);
        float min = Math.min(O3(), dp2 - f10);
        org.telegram.ui.Components.hh0 hh0Var2 = this.Y;
        hh0Var2.H = min - AndroidUtilities.dp(74.0f);
        hh0Var2.setTranslationY((dp2 - min) - AndroidUtilities.dp(12.0f));
        hh0Var2.invalidate();
    }

    @Override // org.telegram.ui.Components.qs0
    public final TLRPC.Chat g() {
        return this.A2;
    }

    public final boolean g4() {
        return this.A2 != null ? getMessagesController().isChatNoForwards(this.A2) : getMessagesController().isUserNoForwards(this.r2);
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
        int i9;
        vz0 vz0Var;
        if (z10 && (i9 = this.J3) >= 0 && (vz0Var = this.d) != null) {
            vz0Var.m(i9);
        }
        org.telegram.ui.Components.pg0 pg0Var = this.W;
        if (pg0Var == null || this.o1) {
            return;
        }
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        long j10 = this.e1;
        if (j10 == 0) {
            j10 = this.a1;
            if (j10 == 0) {
                j10 = -this.b1;
            }
        }
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, this.c1);
        boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
        boolean z11 = false;
        int c10 = org.telegram.messenger.l0.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
        int c11 = org.telegram.messenger.l0.c(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL, sharedPrefKey, notificationsSettings, 0);
        if (c10 != 3 || c11 == Integer.MAX_VALUE) {
            if (c10 == 0) {
                if (!contains) {
                    z11 = getNotificationsController().isGlobalNotificationsEnabled(j10, false, false);
                    pg0Var.setNotifications(z11);
                }
                z11 = true;
                pg0Var.setNotifications(z11);
            }
        }
    }

    public float getAvatarAnimationProgress() {
        return this.O1;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ bu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return this.v0;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        if (this.v0 != null) {
            return null;
        }
        sx0 sx0Var = new sx0(0, this);
        ArrayList arrayList = new ArrayList();
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            arrayList.addAll(hz0Var.getThemeDescriptions());
        }
        by0 by0Var = this.a;
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(by0Var, 0, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, null, null, null, null, i9));
        by0 by0Var2 = this.a;
        int i10 = org.telegram.ui.ActionBar.f6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(by0Var2, 0, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.f8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.pc));
        int i11 = org.telegram.ui.ActionBar.f6.h8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.vh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.Bh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, i11));
        org.telegram.ui.Components.nn0 nn0Var = this.s;
        if (nn0Var != null) {
            TextView textView = nn0Var.getTextView();
            int i12 = org.telegram.ui.ActionBar.f6.Pi;
            arrayList.add(new org.telegram.ui.ActionBar.h6(textView, 4, null, null, null, sx0Var, i12));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.s.getNextTextView(), 4, null, null, null, sx0Var, i12));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Z0, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        ly0 ly0Var = this.a0;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.f6.r0;
        int i13 = org.telegram.ui.ActionBar.f6.J7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(ly0Var, 0, null, null, drawableArr, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0, 0, null, null, new Drawable[]{this.l0}, null, org.telegram.ui.ActionBar.f6.d8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 8, null, null, null, null, org.telegram.ui.ActionBar.f6.wh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.xh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.yh));
        int i14 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.x6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        int i15 = org.telegram.ui.ActionBar.f6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i16 = org.telegram.ui.ActionBar.f6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, i16));
        int i17 = org.telegram.ui.ActionBar.f6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"detailTextView"}, null, null, -1, null, i16));
        int i18 = org.telegram.ui.ActionBar.f6.J6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 2, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"detailTextView"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.f6.Sh;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, null, null, -1, null, i19));
        int i20 = org.telegram.ui.ActionBar.f6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 131072, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.f6.Qh;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 196608, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 131072, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 196608, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 4, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.uh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, drawableArr, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.I, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.Fi));
        int i22 = org.telegram.ui.ActionBar.f6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.I, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.I, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i22));
        int i23 = org.telegram.ui.ActionBar.f6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.I, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.I, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.I, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.I, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 4, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.f6.P1, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 2, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.f6.P1, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.f6.m0, null, null, org.telegram.ui.ActionBar.f6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.f6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"valueTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        boolean z10 = this.B5;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f;
        if (z10) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(h5VarArr[1], 0, null, null, this.E, null, org.telegram.ui.ActionBar.f6.Oi));
            arrayList.add(new org.telegram.ui.ActionBar.h6(h5VarArr[1], 0, null, null, this.y, null, i9));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(h5VarArr[1], 0, null, null, this.E, null, org.telegram.ui.ActionBar.f6.Ah));
        arrayList.add(new org.telegram.ui.ActionBar.h6(h5VarArr[1], 0, null, null, this.y, null, org.telegram.ui.ActionBar.f6.zh));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final int getThemedColor(int i9) {
        return org.telegram.ui.ActionBar.f6.v0(i9, this.v0);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final Drawable getThemedDrawable(String str) {
        org.telegram.ui.ActionBar.b6 b6Var = this.v0;
        Drawable drawable = b6Var != null ? b6Var.getDrawable(str) : null;
        return drawable != null ? drawable : super.getThemedDrawable(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0110, code lost:
    
        if (r24.inviter_id != getUserConfig().getClientUserId()) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0112, code lost:
    
        if (r25 == false) goto L85;
     */
    @Override // org.telegram.ui.Components.qs0
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
                    long j10 = chatParticipant.user_id;
                    this.w2 = j10;
                    boolean z23 = j10 == getUserConfig().getClientUserId();
                    if (ChatObject.isChannel(this.A2)) {
                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str2 = channelParticipant.rank;
                        boolean z24 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        boolean z25 = z24 || (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin);
                        getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                        z13 = ChatObject.canAddAdmins(this.A2);
                        boolean z26 = ChatObject.canManageTags(this.A2) && (!z25 || ((!z24 && channelParticipant.can_edit) || z23));
                        if (z24 || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit)) {
                            z13 = false;
                            z26 = false;
                        }
                        if ((z23 || (channelParticipant instanceof TLRPC.TL_channelParticipantSelf)) && ChatObject.canManageMyTag(this.A2)) {
                            z26 = true;
                        }
                        z12 = ChatObject.canBlockUsers(this.A2) && (!((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || z24) || channelParticipant.can_edit);
                        z16 = this.A2.gigagroup ? false : z12;
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
                        TLRPC.Chat chat = this.A2;
                        z12 = chat.creator || ((chatParticipant instanceof TLRPC.TL_chatParticipant) && (ChatObject.canBlockUsers(chat) || chatParticipant.inviter_id == getUserConfig().getClientUserId()));
                        TLRPC.Chat chat2 = this.A2;
                        z13 = chat2.creator;
                        if (ChatObject.canManageTags(chat2)) {
                            z14 = z23;
                            if (z28) {
                                if (!z29) {
                                }
                            }
                            z15 = true;
                            z16 = this.A2.creator;
                            z17 = z29;
                            z18 = z27;
                            z19 = z28;
                            str = str3;
                            z20 = z15;
                            channelParticipant = null;
                        } else {
                            z14 = z23;
                        }
                        if (!z14 || !ChatObject.canManageMyTag(this.A2)) {
                            z15 = false;
                            z16 = this.A2.creator;
                            z17 = z29;
                            z18 = z27;
                            z19 = z28;
                            str = str3;
                            z20 = z15;
                            channelParticipant = null;
                        }
                        z15 = true;
                        z16 = this.A2.creator;
                        z17 = z29;
                        z18 = z27;
                        z19 = z28;
                        str = str3;
                        z20 = z15;
                        channelParticipant = null;
                    }
                    if (z14) {
                        z21 = (ChatObject.canManageMyTag(this.A2) || (z19 && ChatObject.canManageTags(this.A2))) ? true : z20;
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
                    org.telegram.messenger.dk dkVar = new org.telegram.messenger.dk(this, channelParticipant2, user, chatParticipant, z18, str);
                    String str4 = str;
                    boolean z31 = z18;
                    Drawable V0 = view.getParent() instanceof org.telegram.ui.Components.wk0 ? ((org.telegram.ui.Components.wk0) view.getParent()).V0(view, false) : null;
                    org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(this, view);
                    H.W(V0);
                    H.w = false;
                    H.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new dx0(this, user, 0), !z14);
                    if (!z14 && (z13 || z21 || z16 || z22)) {
                        H.k();
                    }
                    H.l((z19 || !TextUtils.isEmpty(str4)) ? R.drawable.menu_tag_edit : R.drawable.menu_tag_plus, LocaleController.getString(z19 ? R.string.EditAdminTag : TextUtils.isEmpty(str4) ? R.string.AddMemberTag : R.string.EditMemberTag), new ih.u5(this, user, str4, z19, z17), z21);
                    H.l(R.drawable.msg_admins, LocaleController.getString(z31 ? R.string.EditAdminRights : R.string.SetAsAdmin), new zk0(dkVar, 25), z13);
                    H.l(R.drawable.msg_permissions, LocaleController.getString(R.string.ChangePermissions), new hr(this, channelParticipant2, chatParticipant, user, dkVar, 27), z16);
                    H.m(z22, R.drawable.msg_remove, LocaleController.getString(R.string.KickFromGroup), true, new ys0(12, this, chatParticipant));
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
        return (this.m0 == null || this.o1) ? false : true;
    }

    public final void h5(boolean z10) {
        int i9;
        TLRPC.UserStatus userStatus;
        boolean z11;
        int i10 = 0;
        this.x2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.y2.clear();
        TLRPC.ChatFull chatFull = this.q2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z11 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z11 || chatFull.participants_count <= 200) {
                return;
            }
            this.x2 = chatFull.online_count;
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i10 < this.q2.participants.participants.size()) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.q2.participants.participants.get(i10).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.id == getUserConfig().getClientUserId()) && user.status.expires > 10000)) {
                this.x2++;
            }
            this.y2.add(Integer.valueOf(i10));
            if (user != null) {
                if (user.bot) {
                    i9 = -110;
                } else if (user.self) {
                    i9 = 50000 + currentTime;
                } else {
                    TLRPC.UserStatus userStatus2 = user.status;
                    if (userStatus2 != null) {
                        i9 = userStatus2.expires;
                    }
                }
                i10 = j3.r0.e(i9, i10, 1, arrayList);
            }
            i9 = TLObject.FLAG_31;
            i10 = j3.r0.e(i9, i10, 1, arrayList);
        }
        try {
            Collections.sort(this.y2, Comparator$-EL.reversed(Comparator$-CC.comparingInt(new xe(arrayList, 1))));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (z10 && this.d != null && this.q4 > 0) {
            AndroidUtilities.updateVisibleRows(this.a);
        }
        if (this.K == null || this.F4 == -1) {
            return;
        }
        if ((this.y2.size() > 5 || this.O4 == 2) && this.O4 != 1) {
            this.K.a1(this.y2, this.q2);
        }
    }

    public final void i4(boolean z10) {
        boolean isForum = ChatObject.isForum(this.A2);
        TLRPC.Chat chat = this.A2;
        org.telegram.ui.Components.y4.s(this, false, chat, null, false, isForum || z10 || (chat != null && chat.creator), z10, !isForum, new fx0(this, 1));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(52:35|(1:368)(1:39)|(1:41)(1:367)|42|(3:44|(1:46)(1:48)|47)|49|(1:51)|52|(1:54)|55|(1:57)|58|(1:60)(1:366)|61|(4:63|(1:364)(1:67)|68|(1:70)(1:363))(1:365)|71|(1:73)|74|(1:(1:77)(30:(1:361)(1:81)|82|(1:86)|(1:357)(1:92)|93|(2:95|(2:97|(1:99))(2:295|(1:302)(1:301)))(2:303|(1:305)(2:306|(1:356)(2:312|(1:314)(2:315|(2:317|(1:319)(1:320))(30:321|(1:323)(1:355)|324|(1:354)(1:338)|339|340|(4:344|(1:352)(1:348)|349|(1:351))|353|101|(1:294)(1:105)|106|107|108|(1:110)|111|(4:114|(2:116|117)(21:(1:(1:247)(1:246))(1:121)|(1:(1:230)(2:224|(1:226)(2:227|(1:229))))(1:124)|125|(1:221)(1:128)|129|(1:220)(1:132)|133|(1:135)(1:219)|136|(1:138)(1:218)|139|(4:198|(4:200|(1:217)(2:204|(1:206)(1:216))|207|(2:212|(3:214|184|185)(1:215))(1:211))|187|185)(4:142|(2:196|197)(2:146|(1:148)(5:188|(1:195)|190|191|(1:193)(1:194)))|149|(2:181|(3:183|184|185)(3:186|187|185))(1:153))|(1:180)(2:157|(7:159|160|(1:164)|165|(1:178)(1:169)|170|(2:174|175)))|179|160|(1:164)|165|(1:167)|178|170|(1:177)(3:172|174|175))|118|112)|248|249|(3:251|(1:283)(1:257)|258)(2:284|(10:291|260|(1:262)|263|(1:265)|266|(1:282)(1:272)|273|(1:275)(1:281)|276)(1:290))|259|260|(0)|263|(0)|266|(2:268|270)|282|273|(0)(0)|276)))))|100|101|(1:103)|294|106|107|108|(0)|111|(1:112)|248|249|(0)(0)|259|260|(0)|263|(0)|266|(0)|282|273|(0)(0)|276))|362|82|(30:84|86|(2:88|90)|357|93|(0)(0)|100|101|(0)|294|106|107|108|(0)|111|(1:112)|248|249|(0)(0)|259|260|(0)|263|(0)|266|(0)|282|273|(0)(0)|276)|359|86|(0)|357|93|(0)(0)|100|101|(0)|294|106|107|108|(0)|111|(1:112)|248|249|(0)(0)|259|260|(0)|263|(0)|266|(0)|282|273|(0)(0)|276) */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x081e, code lost:
    
        if (r38.q2.can_view_participants != false) goto L423;
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
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        Object obj;
        boolean z11;
        long j10;
        boolean z12;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str;
        Object obj2;
        org.telegram.ui.ActionBar.h5[] h5VarArr2;
        CharSequence formatPluralString;
        TLRPC.ChatParticipants chatParticipants;
        CharSequence charSequence;
        boolean z13;
        int i9;
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
        int i10;
        int i11;
        int i12;
        int i13;
        String formatString;
        org.telegram.ui.ActionBar.h5[] h5VarArr3;
        org.telegram.ui.Components.u51 u51Var;
        TLRPC.VideoSize videoSize;
        ImageLocation imageLocation2;
        TLRPC.User user;
        ImageLocation imageLocation3;
        TLRPC.User user2;
        boolean z18;
        TLRPC.UserStatus userStatus;
        int i14;
        int i15;
        char c10;
        org.telegram.ui.Components.rg rgVar;
        TL_stars.Tl_starsRating tl_starsRating;
        String str5;
        String str6;
        boolean z19;
        boolean z20;
        org.telegram.ui.Components.i5 i5Var;
        TLRPC.FileLocation fileLocation;
        org.telegram.ui.Components.i5 i5Var2;
        TL_stars.Tl_starsRating tl_starsRating2;
        ImageLocation imageLocation4;
        yw ywVar;
        if (this.U == null || (h5VarArr = this.f) == null || getParentActivity() == null) {
            return;
        }
        int connectionState = getConnectionsManager().getConnectionState();
        String string = connectionState == 2 ? LocaleController.getString(R.string.WaitingForNetwork) : connectionState == 1 ? LocaleController.getString(R.string.Connecting) : connectionState == 5 ? LocaleController.getString(R.string.Updating) : connectionState == 4 ? LocaleController.getString(R.string.ConnectingToProxy) : null;
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var == null || b5Var.getFragmentStack().size() < 2) {
            obj = null;
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            obj = o2Var instanceof org.telegram.ui.Components.rg ? o2Var : null;
            if ((o2Var instanceof dy) && (ywVar = ((dy) o2Var).B3) != null) {
                fx fxVar = ywVar.a;
                if (e2.c.v(fxVar)) {
                    obj = fxVar;
                }
            }
        }
        if (obj instanceof qn) {
            qn qnVar = (qn) obj;
            if (qnVar.W0 != null && qnVar.u8() == 8) {
                z11 = true;
                this.l5 = false;
                this.m5 = false;
                j10 = this.a1;
                String str7 = "drawableMuteIcon";
                String str8 = "";
                org.telegram.ui.ActionBar.h5[] h5VarArr4 = this.r;
                if (j10 == 0) {
                    TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(this.a1));
                    if (user3 == null) {
                        return;
                    }
                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                    boolean z21 = userProfilePhoto != null && userProfilePhoto.personal;
                    TLRPC.FileLocation fileLocation2 = userProfilePhoto != null ? userProfilePhoto.photo_big : null;
                    this.l0.m(this.currentAccount, user3);
                    MessagesController.PeerColor peerColor = this.M5;
                    MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(user3.emoji_status);
                    this.M5 = fromCollectible;
                    if (fromCollectible == null) {
                        int profileColorId = UserObject.getProfileColorId(user3);
                        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).profilePeerColors;
                        this.M5 = peerColors == null ? null : peerColors.getColor(profileColorId);
                    }
                    if (peerColor != this.M5) {
                        o5();
                    }
                    i01 i01Var = this.Z0;
                    boolean z22 = z21;
                    if (i01Var != null) {
                        i01Var.b(UserObject.getProfileEmojiId(user3), user3.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    org.telegram.ui.Components.qv0 qv0Var = this.P;
                    if (qv0Var != null) {
                        qv0Var.b(this.M5);
                    }
                    TLRPC.EmojiStatus emojiStatus = user3.emoji_status;
                    L4(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null);
                    ImageLocation forUserOrChat3 = ImageLocation.getForUserOrChat(user3, 0);
                    ImageLocation forUserOrChat4 = ImageLocation.getForUserOrChat(user3, 1);
                    ImageLocation forUserOrChat5 = ImageLocation.getForUserOrChat(user3, 4);
                    TLRPC.UserFull userFull = this.r2;
                    if (userFull != null) {
                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                        videoSize = FileLoader.getVectorMarkupVideoSize((userProfilePhoto2 == null || !userProfilePhoto2.personal) ? userFull.profile_photo : userFull.personal_photo);
                        if (videoSize != null) {
                            h5VarArr3 = h5VarArr;
                            u51Var = new org.telegram.ui.Components.u51(videoSize, user3.premium, 2);
                        } else {
                            h5VarArr3 = h5VarArr;
                            u51Var = null;
                        }
                    } else {
                        h5VarArr3 = h5VarArr;
                        u51Var = null;
                        videoSize = null;
                    }
                    ImageLocation C2 = this.j0.C(forUserOrChat4, forUserOrChat3);
                    if (this.E2 == null) {
                        this.j0.H(u51Var, forUserOrChat3, forUserOrChat4, z10);
                    }
                    if (this.F2 == null) {
                        if (videoSize != null) {
                            this.a0.setImageDrawable(u51Var);
                        } else {
                            if (forUserOrChat5 == null || user3.photo.personal) {
                                user = user3;
                                imageLocation3 = forUserOrChat4;
                                ly0 ly0Var = this.a0;
                                ly0Var.a.setImage(C2, ImageLoader.AUTOPLAY_FILTER, forUserOrChat3, "100_100", imageLocation3, "50_50", this.l0, 0L, null, user, 1);
                                imageLocation2 = forUserOrChat3;
                                ly0Var.d();
                            } else {
                                this.a0.getImageReceiver().setVideoThumbIsSame(true);
                                ly0 ly0Var2 = this.a0;
                                user = user3;
                                imageLocation3 = forUserOrChat4;
                                ly0Var2.a.setImage(forUserOrChat5, "avatar", forUserOrChat3, "50_50", imageLocation3, "50_50", this.l0, 0L, null, user, 1);
                                ly0Var2.d();
                                imageLocation2 = forUserOrChat3;
                            }
                            if ((imageLocation3 != null && this.K2 != -1) || (imageLocation3 == null && this.K2 == -1)) {
                                d5();
                                k4(true);
                            }
                            if (imageLocation2 != null || ((imageLocation4 = this.x0) != null && imageLocation2.photoId == imageLocation4.photoId)) {
                                user2 = user;
                            } else {
                                this.x0 = imageLocation2;
                                TLRPC.User user4 = user;
                                getFileLoader().loadFile(imageLocation2, user4, null, 0, 1);
                                user2 = user4;
                            }
                            CharSequence userName = UserObject.getUserName(user2);
                            if (user2.id != getUserConfig().getClientUserId()) {
                                long j11 = user2.id;
                                if (j11 == UserObject.VERIFY) {
                                    str8 = LocaleController.getString(R.string.VerifyCodesNotifications);
                                } else if (j11 == 333000 || j11 == 777000 || j11 == 42777) {
                                    str8 = LocaleController.getString(R.string.ServiceNotifications);
                                } else if (MessagesController.isSupportUser(user2)) {
                                    str8 = LocaleController.getString(R.string.SupportStatus);
                                } else if (this.n2) {
                                    int i16 = user2.bot_active_users;
                                    str8 = i16 != 0 ? LocaleController.formatPluralStringComma("BotUsers", i16, ',') : LocaleController.getString(R.string.Bot);
                                } else {
                                    boolean[] zArr = this.F0;
                                    zArr[0] = false;
                                    str8 = LocaleController.formatUserStatus(this.currentAccount, user2, zArr, z22 ? new boolean[1] : null);
                                    boolean z23 = (zArr[0] || getUserConfig().isPremium() || (userStatus = user2.status) == null || (!(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) || !userStatus.by_me) ? false : true;
                                    org.telegram.ui.ActionBar.h5 h5Var = h5VarArr4[1];
                                    if (h5Var != null && !this.B5) {
                                        int i17 = (zArr[0] && this.M5 == null) ? org.telegram.ui.ActionBar.f6.Bh : org.telegram.ui.ActionBar.f6.B8;
                                        h5Var.setTag(Integer.valueOf(i17));
                                        if (!this.l2) {
                                            h5VarArr4[1].setTextColor(w3(getThemedColor(i17), Boolean.valueOf(zArr[0])));
                                        }
                                    }
                                    z18 = z23;
                                    TLRPC.UserProfilePhoto userProfilePhoto3 = user2.photo;
                                    this.m5 = userProfilePhoto3 == null && userProfilePhoto3.personal;
                                    userName = Emoji.replaceEmoji(userName, h5VarArr3[1].getPaint().getFontMetricsInt(), false);
                                    if (z11) {
                                        this.a0.setAnimateFromImageReceiver(((qn) obj).W0.getAvatarImageView().getImageReceiver());
                                    }
                                    i14 = 0;
                                    while (i14 < 2) {
                                        if (h5VarArr3[i14] == null) {
                                            fileLocation = fileLocation2;
                                            str6 = str7;
                                        } else {
                                            if (i14 == 0 && z11) {
                                                org.telegram.ui.ActionBar.h5 titleTextView = ((qn) obj).W0.getTitleTextView();
                                                h5VarArr3[i14].k(titleTextView.getText());
                                                h5VarArr3[i14].i(titleTextView.getRightDrawable());
                                                h5VarArr3[i14].j(titleTextView.getRightDrawable2());
                                            } else if (i14 != 0 || user2.id == getUserConfig().getClientUserId() || MessagesController.isSupportUser(user2) || (str5 = user2.phone) == null || str5.length() == 0 || getContactsController().contactsDict.get(Long.valueOf(user2.id)) != null || (getContactsController().contactsDict.size() == 0 && getContactsController().isLoadingContacts())) {
                                                h5VarArr3[i14].k(userName);
                                            } else {
                                                h5VarArr3[i14].k(ne.b.c().b("+" + user2.phone));
                                            }
                                            if (i14 == 0 && string != null) {
                                                h5VarArr4[i14].k(string);
                                            } else if (i14 == 0 && z11) {
                                                qn qnVar2 = (qn) obj;
                                                if (qnVar2.W0.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.h5) {
                                                    h5VarArr4[i14].k(((org.telegram.ui.ActionBar.h5) qnVar2.W0.getSubtitleTextView()).getText());
                                                } else if (qnVar2.W0.getSubtitleTextView() instanceof org.telegram.ui.Components.j6) {
                                                    h5VarArr4[i14].k(((org.telegram.ui.Components.j6) qnVar2.W0.getSubtitleTextView()).getText());
                                                }
                                            } else {
                                                h5VarArr4[i14].k(str8);
                                            }
                                            h5VarArr4[i14].setDrawablePadding(AndroidUtilities.dp(9.0f));
                                            h5VarArr4[i14].setRightDrawableInside(true);
                                            h5VarArr4[i14].i((i14 == 1 && z18) ? b4() : null);
                                            h5VarArr4[i14].setRightDrawableOnClick((i14 == 1 && z18) ? new ex0(this, 7) : null);
                                            Drawable V3 = this.z2 != null ? V3() : null;
                                            h5VarArr3[i14].setRightDrawableOutside(i14 == 0);
                                            if (i14 != 0 || z11) {
                                                str6 = str7;
                                                if (i14 == 1) {
                                                    boolean z24 = user2.scam;
                                                    if (z24 || user2.fake) {
                                                        h5VarArr3[i14].j(a4(!z24 ? 1 : 0));
                                                    } else if (user2.verified) {
                                                        h5VarArr3[i14].j(d4(i14));
                                                    } else {
                                                        h5VarArr3[i14].j(null);
                                                    }
                                                    if (!MessagesController.isSupportUser(user2) && DialogObject.getEmojiStatusDocumentId(user2.emoji_status) != 0) {
                                                        z19 = true;
                                                        h5VarArr3[i14].i(S3(user2.emoji_status, true, i14));
                                                        z20 = false;
                                                    } else if (getMessagesController().isPremiumUser(user2)) {
                                                        h5VarArr3[i14].i(S3(null, true, i14));
                                                        z20 = true;
                                                        z19 = false;
                                                    } else {
                                                        h5VarArr3[i14].i(null);
                                                    }
                                                }
                                                z20 = false;
                                                z19 = false;
                                            } else {
                                                boolean z25 = user2.scam;
                                                if (z25 || user2.fake) {
                                                    str6 = str7;
                                                    h5VarArr3[i14].j(a4(!z25 ? 1 : 0));
                                                    this.n = LocaleController.getString(R.string.ScamMessage);
                                                } else if (user2.verified) {
                                                    h5VarArr3[i14].j(d4(i14));
                                                    this.n = LocaleController.getString(R.string.AccDescrVerified);
                                                    str6 = str7;
                                                } else {
                                                    MessagesController messagesController = getMessagesController();
                                                    long j12 = this.e1;
                                                    if (j12 == 0) {
                                                        j12 = this.a1;
                                                    }
                                                    String str9 = str7;
                                                    if (messagesController.isDialogMuted(j12, this.c1)) {
                                                        str6 = str9;
                                                        h5VarArr3[i14].j(getThemedDrawable(str6));
                                                        this.n = LocaleController.getString(R.string.NotificationsMuted);
                                                    } else {
                                                        str6 = str9;
                                                        h5VarArr3[i14].j(null);
                                                        this.n = null;
                                                    }
                                                }
                                                if (!MessagesController.isSupportUser(user2) && DialogObject.getEmojiStatusDocumentId(user2.emoji_status) != 0) {
                                                    h5VarArr3[i14].i(S3(user2.emoji_status, false, i14));
                                                    this.h = LocaleController.getString(R.string.AccDescrPremium);
                                                    z20 = false;
                                                    z19 = true;
                                                } else if (getMessagesController().isPremiumUser(user2)) {
                                                    h5VarArr3[i14].i(S3(null, false, i14));
                                                    this.h = LocaleController.getString(R.string.AccDescrPremium);
                                                    z20 = true;
                                                    z19 = false;
                                                } else {
                                                    h5VarArr3[i14].i(null);
                                                    this.h = null;
                                                    z20 = false;
                                                    z19 = false;
                                                }
                                            }
                                            if (V3 == null && this.z2 == null) {
                                                i5Var = V3;
                                                fileLocation = fileLocation2;
                                                if (user2.bot_verification_icon != 0) {
                                                    h5VarArr3[i14].setLeftDrawableOutside(true);
                                                    i5Var2 = Q3(i14, user2.bot_verification_icon);
                                                    h5VarArr3[i14].setLeftDrawable(i5Var2);
                                                    if (i14 == 1 && (z19 || z20)) {
                                                        h5VarArr3[i14].setRightDrawableOutside(true);
                                                    }
                                                    if (!user2.self && getMessagesController().isPremiumUser(user2)) {
                                                        h5VarArr3[i14].setRightDrawableOnClick(new ex0(this, 8));
                                                    }
                                                    if (!user2.self && getMessagesController().isPremiumUser(user2)) {
                                                        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr3[i14];
                                                        h5Var2.setRightDrawableOnClick(new b0(this, user2, h5Var2, 14));
                                                    }
                                                }
                                            } else {
                                                i5Var = V3;
                                                fileLocation = fileLocation2;
                                            }
                                            h5VarArr3[i14].setLeftDrawableOutside(false);
                                            i5Var2 = i5Var;
                                            h5VarArr3[i14].setLeftDrawable(i5Var2);
                                            if (i14 == 1) {
                                                h5VarArr3[i14].setRightDrawableOutside(true);
                                            }
                                            if (!user2.self) {
                                            }
                                            if (!user2.self) {
                                                org.telegram.ui.ActionBar.h5 h5Var22 = h5VarArr3[i14];
                                                h5Var22.setRightDrawableOnClick(new b0(this, user2, h5Var22, 14));
                                            }
                                        }
                                        i14++;
                                        str7 = str6;
                                        fileLocation2 = fileLocation;
                                    }
                                    TLRPC.FileLocation fileLocation3 = fileLocation2;
                                    if (this.a1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                                        h5VarArr4[2].k(LocaleController.getString(R.string.FallbackTooltip));
                                        TLRPC.UserFull userFull2 = this.r2;
                                        if (userFull2 == null || (tl_starsRating = userFull2.stars_rating) == null || tl_starsRating.stars >= 0) {
                                            h5VarArr4[3].k(LocaleController.getString(R.string.Online));
                                        } else {
                                            h5VarArr4[3].k(LocaleController.getString(R.string.StarRatingLevelNegative).toLowerCase(Locale.ROOT));
                                        }
                                        i15 = 0;
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto4 = user2.photo;
                                        if (userProfilePhoto4 != null && userProfilePhoto4.personal && userProfilePhoto4.has_video) {
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str8);
                                            i15 = 0;
                                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.xy(i15), 0, str8.length(), 0);
                                            spannableStringBuilder.append((CharSequence) " d ");
                                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CustomAvatarTooltipVideo));
                                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.qs(), str8.length() + 1, str8.length() + 2, 0);
                                            h5VarArr4[2].k(spannableStringBuilder);
                                        } else {
                                            i15 = 0;
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str8);
                                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.xy(i15), 0, str8.length(), 0);
                                            spannableStringBuilder2.append((CharSequence) " d ");
                                            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.CustomAvatarTooltip));
                                            c10 = 2;
                                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.qs(), str8.length() + 1, str8.length() + 2, 0);
                                            h5VarArr4[2].k(spannableStringBuilder2);
                                            h5VarArr4[c10].setVisibility(i15);
                                            if (!this.S1) {
                                                h5VarArr4[3].setVisibility(i15);
                                            }
                                            rgVar = this.c5;
                                            if (rgVar != null) {
                                                rgVar.p();
                                            }
                                            this.a0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation3) && (getLastStoryViewer() == null || getLastStoryViewer().o0.a != this.a0), this.q0 != null);
                                        }
                                    }
                                    c10 = 2;
                                    h5VarArr4[c10].setVisibility(i15);
                                    if (!this.S1) {
                                    }
                                    rgVar = this.c5;
                                    if (rgVar != null) {
                                    }
                                    this.a0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation3) && (getLastStoryViewer() == null || getLastStoryViewer().o0.a != this.a0), this.q0 != null);
                                }
                            } else if (UserObject.hasFallbackPhoto(this.r2)) {
                                this.l5 = true;
                                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.r2.fallback_photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                if (closestPhotoSizeWithSize != null) {
                                    this.n5.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.r2.fallback_photo), "50_50", (Drawable) null, 0L, (String) null, UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0);
                                }
                            } else {
                                TLRPC.UserFull userFull3 = this.r2;
                                str8 = (userFull3 == null || (tl_starsRating2 = userFull3.stars_rating) == null || tl_starsRating2.stars >= 0) ? LocaleController.getString(R.string.Online) : LocaleController.getString(R.string.StarRatingLevelNegative).toLowerCase(Locale.ROOT);
                            }
                            z18 = false;
                            TLRPC.UserProfilePhoto userProfilePhoto32 = user2.photo;
                            this.m5 = userProfilePhoto32 == null && userProfilePhoto32.personal;
                            userName = Emoji.replaceEmoji(userName, h5VarArr3[1].getPaint().getFontMetricsInt(), false);
                            if (z11) {
                            }
                            i14 = 0;
                            while (i14 < 2) {
                            }
                            TLRPC.FileLocation fileLocation32 = fileLocation2;
                            if (this.a1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                            }
                            c10 = 2;
                            h5VarArr4[c10].setVisibility(i15);
                            if (!this.S1) {
                            }
                            rgVar = this.c5;
                            if (rgVar != null) {
                            }
                            this.a0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation32) && (getLastStoryViewer() == null || getLastStoryViewer().o0.a != this.a0), this.q0 != null);
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
                        this.m5 = userProfilePhoto322 == null && userProfilePhoto322.personal;
                        userName2 = Emoji.replaceEmoji(userName2, h5VarArr3[1].getPaint().getFontMetricsInt(), false);
                        if (z11) {
                        }
                        i14 = 0;
                        while (i14 < 2) {
                        }
                        TLRPC.FileLocation fileLocation322 = fileLocation2;
                        if (this.a1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                        }
                        c10 = 2;
                        h5VarArr4[c10].setVisibility(i15);
                        if (!this.S1) {
                        }
                        rgVar = this.c5;
                        if (rgVar != null) {
                        }
                        this.a0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation322) && (getLastStoryViewer() == null || getLastStoryViewer().o0.a != this.a0), this.q0 != null);
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
                    this.m5 = userProfilePhoto3222 == null && userProfilePhoto3222.personal;
                    userName22 = Emoji.replaceEmoji(userName22, h5VarArr3[1].getPaint().getFontMetricsInt(), false);
                    if (z11) {
                    }
                    i14 = 0;
                    while (i14 < 2) {
                    }
                    TLRPC.FileLocation fileLocation3222 = fileLocation2;
                    if (this.a1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                    }
                    c10 = 2;
                    h5VarArr4[c10].setVisibility(i15);
                    if (!this.S1) {
                    }
                    rgVar = this.c5;
                    if (rgVar != null) {
                    }
                    this.a0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation3222) && (getLastStoryViewer() == null || getLastStoryViewer().o0.a != this.a0), this.q0 != null);
                } else if (this.b1 != 0) {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.b1));
                    if (chat2 != null) {
                        this.A2 = chat2;
                    } else {
                        chat2 = this.A2;
                    }
                    FlagSecureReason flagSecureReason = this.T1;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                    }
                    MessagesController.PeerColor peerColor2 = this.M5;
                    MessagesController.PeerColor fromCollectible2 = MessagesController.PeerColor.fromCollectible(chat2.emoji_status);
                    this.M5 = fromCollectible2;
                    if (fromCollectible2 == null) {
                        int profileColorId2 = ChatObject.getProfileColorId(chat2);
                        MessagesController.PeerColors peerColors2 = MessagesController.getInstance(this.currentAccount).profilePeerColors;
                        this.M5 = peerColors2 == null ? null : peerColors2.getColor(profileColorId2);
                    }
                    if (peerColor2 != this.M5) {
                        o5();
                    }
                    i01 i01Var2 = this.Z0;
                    if (i01Var2 != null) {
                        i01Var2.b(ChatObject.getProfileEmojiId(chat2), chat2.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    TLRPC.EmojiStatus emojiStatus2 = chat2.emoji_status;
                    L4(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null);
                    if (this.m1) {
                        z12 = z11;
                        tL_forumTopic = getMessagesController().getTopicsController().findTopic(this.b1, this.c1);
                    } else {
                        z12 = z11;
                        tL_forumTopic = null;
                    }
                    if (ChatObject.isChannel(chat2)) {
                        if (this.m1) {
                            str4 = "Members";
                        } else {
                            TLRPC.ChatFull chatFull2 = this.q2;
                            if (chatFull2 != null) {
                                TLRPC.Chat chat3 = this.A2;
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
                            formatPluralString = this.A2.megagroup ? LocaleController.getString(R.string.Loading).toLowerCase() : ChatObject.isPublic(chat2) ? LocaleController.getString(R.string.ChannelPublic).toLowerCase() : LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                            h5VarArr2 = h5VarArr4;
                            z13 = false;
                            str = str4;
                            obj2 = obj;
                            charSequence = formatPluralString;
                            if (z12) {
                                qn qnVar3 = (qn) obj2;
                                if (qnVar3.W0.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.h5) {
                                    formatPluralString = ((org.telegram.ui.ActionBar.h5) qnVar3.W0.getSubtitleTextView()).getText();
                                } else if (qnVar3.W0.getSubtitleTextView() instanceof org.telegram.ui.Components.j6) {
                                    formatPluralString = ((org.telegram.ui.Components.j6) qnVar3.W0.getSubtitleTextView()).getText();
                                }
                                this.a0.setAnimateFromImageReceiver(qnVar3.W0.getAvatarImageView().getImageReceiver());
                            }
                            i9 = 0;
                            z14 = false;
                            while (i9 < 2) {
                                org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[i9];
                                if (h5Var3 == null) {
                                    str3 = string;
                                    charSequence2 = formatPluralString;
                                    z15 = z12;
                                    str2 = str8;
                                } else if (i9 == 0 && z12) {
                                    org.telegram.ui.ActionBar.h5 titleTextView2 = ((qn) obj2).W0.getTitleTextView();
                                    if (h5VarArr[i9].k(titleTextView2.getText())) {
                                        z14 = true;
                                    }
                                    if (h5VarArr[i9].i(titleTextView2.getRightDrawable())) {
                                        z14 = true;
                                    }
                                    charSequence2 = formatPluralString;
                                } else if (this.m1) {
                                    CharSequence charSequence3 = tL_forumTopic == null ? str8 : tL_forumTopic.title;
                                    try {
                                        fontMetricsInt = h5Var3.getPaint().getFontMetricsInt();
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
                                                charSequence4 = Emoji.replaceEmoji(charSequence4, h5VarArr[i9].getPaint().getFontMetricsInt(), false);
                                            } catch (Exception unused3) {
                                            }
                                        }
                                        h5VarArr[i9].setLeftDrawableOutside(false);
                                        h5VarArr[i9].setLeftDrawable((Drawable) null);
                                        h5VarArr[i9].setRightDrawableOutside(i9 == 0);
                                        h5VarArr[i9].setRightDrawableOnClick(null);
                                        if (i9 != 0) {
                                            boolean z26 = chat2.scam;
                                            if (z26 || chat2.fake) {
                                                h5VarArr[i9].j(a4(!z26 ? 1 : 0));
                                                this.h = LocaleController.getString(R.string.ScamMessage);
                                            } else if (chat2.verified) {
                                                h5VarArr[i9].j(d4(i9));
                                                this.h = LocaleController.getString(R.string.AccDescrVerified);
                                            } else {
                                                h5VarArr[i9].j(null);
                                                this.h = null;
                                            }
                                            if (DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) != 0) {
                                                h5VarArr[i9].i(S3(chat2.emoji_status, false, i9));
                                                h5VarArr[i9].setRightDrawableOutside(true);
                                                this.h = null;
                                                if (ChatObject.canChangeChatInfo(chat2)) {
                                                    h5VarArr[i9].setRightDrawableOnClick(new ex0(this, 9));
                                                    if (this.O) {
                                                        this.O = true;
                                                        getMediaDataController().loadRestrictedStatusEmojis();
                                                    }
                                                } else {
                                                    TLRPC.EmojiStatus emojiStatus3 = chat2.emoji_status;
                                                    if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                                                        z15 = z12;
                                                        h5VarArr[i9].setRightDrawableOnClick(new tx0(this, ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug, 0));
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
                                                    h5VarArr[i9].j(a4(!z27 ? 1 : 0));
                                                } else if (chat2.verified) {
                                                    h5VarArr[i9].j(d4(i9));
                                                    z16 = z14;
                                                    str2 = str8;
                                                } else {
                                                    z16 = z14;
                                                    str2 = str8;
                                                    if (getMessagesController().isDialogMuted(-this.b1, this.c1)) {
                                                        h5VarArr[i9].j(getThemedDrawable("drawableMuteIcon"));
                                                    } else {
                                                        h5VarArr[i9].j(null);
                                                    }
                                                }
                                                if (DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) != 0) {
                                                    h5VarArr[i9].i(S3(chat2.emoji_status, false, i9));
                                                    z17 = true;
                                                    h5VarArr[i9].setRightDrawableOutside(true);
                                                } else {
                                                    z17 = true;
                                                    h5VarArr[i9].i(null);
                                                }
                                                if (chat2.bot_verification_icon == 0) {
                                                    h5VarArr[i9].setLeftDrawableOutside(z17);
                                                    h5VarArr[i9].setLeftDrawable(Q3(i9, chat2.bot_verification_icon));
                                                } else {
                                                    h5VarArr[i9].setLeftDrawable((Drawable) null);
                                                }
                                                if (i9 == 0 || string == null) {
                                                    if (!z15) {
                                                        TLRPC.Chat chat4 = this.A2;
                                                        if ((!chat4.megagroup || this.q2 == null || this.x2 <= 0) && !this.m1) {
                                                            if (i9 == 0 && ChatObject.isChannel(chat4) && (chatFull = this.q2) != null && chatFull.participants_count != 0) {
                                                                TLRPC.Chat chat5 = this.A2;
                                                                if (chat5.megagroup || chat5.broadcast) {
                                                                    int[] iArr = new int[1];
                                                                    if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                                                        int i18 = this.q2.participants_count;
                                                                        iArr[0] = i18;
                                                                        formatShortNumber = String.valueOf(i18);
                                                                    } else {
                                                                        formatShortNumber = LocaleController.formatShortNumber(this.q2.participants_count, iArr);
                                                                    }
                                                                    if (!this.A2.megagroup) {
                                                                        str3 = string;
                                                                        h5VarArr2[i9].k(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber));
                                                                        if (i9 == 1 && this.m1) {
                                                                            if (z13) {
                                                                                h5VarArr2[i9].setOnClickListener(null);
                                                                                h5VarArr2[i9].setClickable(false);
                                                                            } else {
                                                                                h5VarArr2[i9].setOnClickListener(new ex0(this, 10));
                                                                            }
                                                                        }
                                                                        z14 = z16;
                                                                    } else if (this.q2.participants_count != 0) {
                                                                        CharSequence replace = LocaleController.formatPluralString(str, iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber);
                                                                        org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr2[i9];
                                                                        if (i9 != 0) {
                                                                            replace = v3(replace);
                                                                        }
                                                                        h5Var4.k(replace);
                                                                    } else if (chat2.has_geo) {
                                                                        h5VarArr2[i9].k(LocaleController.getString(R.string.MegaLocation).toLowerCase());
                                                                    } else if (ChatObject.isPublic(chat2)) {
                                                                        h5VarArr2[i9].k(LocaleController.getString(R.string.MegaPublic).toLowerCase());
                                                                    } else {
                                                                        h5VarArr2[i9].k(LocaleController.getString(R.string.MegaPrivate).toLowerCase());
                                                                    }
                                                                }
                                                            }
                                                            str3 = string;
                                                            h5VarArr2[i9].k(i9 == 0 ? charSequence2 : v3(charSequence));
                                                            if (i9 == 1) {
                                                                if (z13) {
                                                                }
                                                            }
                                                            z14 = z16;
                                                        }
                                                    }
                                                    str3 = string;
                                                    h5VarArr2[i9].k(i9 != 0 ? charSequence2 : v3(charSequence));
                                                    if (i9 == 1) {
                                                    }
                                                    z14 = z16;
                                                } else {
                                                    h5VarArr2[i9].k(string);
                                                }
                                                str3 = string;
                                                if (i9 == 1) {
                                                }
                                                z14 = z16;
                                            }
                                        }
                                        z16 = z14;
                                        str2 = str8;
                                        z17 = true;
                                        if (chat2.bot_verification_icon == 0) {
                                        }
                                        if (i9 == 0) {
                                        }
                                        if (!z15) {
                                        }
                                        str3 = string;
                                        h5VarArr2[i9].k(i9 != 0 ? charSequence2 : v3(charSequence));
                                        if (i9 == 1) {
                                        }
                                        z14 = z16;
                                    }
                                }
                                i9++;
                                formatPluralString = charSequence2;
                                str8 = str2;
                                z12 = z15;
                                string = str3;
                            }
                            if (z14) {
                                k4(true);
                            }
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            TLRPC.FileLocation fileLocation4 = (chatPhoto != null || this.m1) ? null : chatPhoto.photo_big;
                            if (this.m1) {
                                vf.c.p(this.a0, tL_forumTopic, true, true, this.v0);
                                forUserOrChat = null;
                                forUserOrChat2 = null;
                            } else {
                                if (ChatObject.isMonoForum(this.A2)) {
                                    TLRPC.Chat monoForumLinkedChat = getMessagesController().getMonoForumLinkedChat(this.A2.id);
                                    this.l0.k(this.currentAccount, monoForumLinkedChat);
                                    ImageLocation forUserOrChat6 = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat, 0);
                                    ImageLocation forUserOrChat7 = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat, 1);
                                    C = this.j0.C(forUserOrChat7, forUserOrChat6);
                                    forUserOrChat2 = forUserOrChat7;
                                    forUserOrChat = forUserOrChat6;
                                } else {
                                    this.l0.k(this.currentAccount, chat2);
                                    forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 0);
                                    forUserOrChat2 = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 1);
                                    my0 my0Var = this.j0;
                                    if (my0Var != null) {
                                        C = my0Var.C(forUserOrChat2, forUserOrChat);
                                    }
                                }
                                boolean H = this.j0.H(null, forUserOrChat, forUserOrChat2, z10);
                                if ((forUserOrChat != null || H) && this.l2) {
                                    m10 = this.c.m(0);
                                    if (m10 != null) {
                                        this.a.v0(0, m10.getTop() - T3(), org.telegram.ui.Components.gr.h);
                                    }
                                }
                                String str10 = (C == null && C.imageType == 2) ? ImageLoader.AUTOPLAY_FILTER : null;
                                if (this.F2 == null || this.m1) {
                                    chat = chat2;
                                } else {
                                    TLRPC.Chat chat6 = chat2;
                                    this.a0.l(C, str10, forUserOrChat2, "50_50", this.l0, chat6);
                                    chat = chat6;
                                }
                                if (forUserOrChat != null && ((imageLocation = this.x0) == null || forUserOrChat.photoId != imageLocation.photoId)) {
                                    this.x0 = forUserOrChat;
                                    getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
                                }
                                this.a0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation4) && (getLastStoryViewer() == null || getLastStoryViewer().o0.a != this.a0), this.q0 == null);
                            }
                            C = null;
                            boolean H2 = this.j0.H(null, forUserOrChat, forUserOrChat2, z10);
                            if (forUserOrChat != null) {
                            }
                            m10 = this.c.m(0);
                            if (m10 != null) {
                            }
                            if (C == null) {
                            }
                            if (this.F2 == null) {
                            }
                            chat = chat2;
                            if (forUserOrChat != null) {
                                this.x0 = forUserOrChat;
                                getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
                            }
                            this.a0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation4) && (getLastStoryViewer() == null || getLastStoryViewer().o0.a != this.a0), this.q0 == null);
                        }
                        if (this.m1) {
                            if (tL_forumTopic != null) {
                                i11 = 1;
                                i12 = tL_forumTopic.totalMessagesCount - 1;
                            } else {
                                i11 = 1;
                                i12 = 0;
                            }
                            if (i12 > 0) {
                                Object[] objArr = new Object[i11];
                                i13 = 0;
                                objArr[0] = Integer.valueOf(i12);
                                formatString = LocaleController.formatPluralString("messages", i12, objArr);
                            } else {
                                i13 = 0;
                                int i19 = R.string.TopicProfileStatus;
                                Object[] objArr2 = new Object[i11];
                                objArr2[0] = chat2.title;
                                formatString = LocaleController.formatString("TopicProfileStatus", i19, objArr2);
                            }
                            SpannableString spannableString = new SpannableString(">");
                            String str11 = formatString;
                            spannableString.setSpan(new org.telegram.ui.Components.eq(R.drawable.arrow_newchat), i13, 1, 33);
                            str = str4;
                            obj2 = obj;
                            z13 = true;
                            charSequence = new SpannableStringBuilder(chat2.title).append(' ').append((CharSequence) spannableString);
                            formatPluralString = str11;
                            h5VarArr2 = h5VarArr4;
                        } else {
                            str = str4;
                            if (!this.A2.megagroup) {
                                obj2 = obj;
                                h5VarArr2 = h5VarArr4;
                                LocaleController.formatShortNumber(this.q2.participants_count, new int[1]);
                                if (this.A2.megagroup) {
                                    formatPluralString = LocaleController.formatPluralString(str, this.q2.participants_count, new Object[0]);
                                    charSequence = LocaleController.formatPluralStringComma(str, this.q2.participants_count);
                                } else {
                                    formatPluralString = LocaleController.formatPluralString("Subscribers", this.q2.participants_count, new Object[0]);
                                    charSequence = LocaleController.formatPluralStringComma("Subscribers", this.q2.participants_count);
                                }
                            } else if (this.x2 <= 1 || (i10 = this.q2.participants_count) == 0) {
                                obj2 = obj;
                                h5VarArr2 = h5VarArr4;
                                int i20 = this.q2.participants_count;
                                if (i20 == 0) {
                                    formatPluralString = chat2.has_geo ? LocaleController.getString(R.string.MegaLocation).toLowerCase() : ChatObject.isPublic(chat2) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                                } else {
                                    formatPluralString = LocaleController.formatPluralString(str, i20, new Object[0]);
                                    charSequence = LocaleController.formatPluralStringComma(str, this.q2.participants_count);
                                }
                            } else {
                                obj2 = obj;
                                h5VarArr2 = h5VarArr4;
                                formatPluralString = aa.d.z(LocaleController.formatPluralString(str, i10, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(this.x2, this.q2.participants_count), new Object[0]));
                                z13 = false;
                                charSequence = aa.d.z(LocaleController.formatPluralStringComma(str, this.q2.participants_count), ", ", LocaleController.formatPluralStringComma("OnlineCount", Math.min(this.x2, this.q2.participants_count)));
                            }
                            z13 = false;
                        }
                        if (z12) {
                        }
                        i9 = 0;
                        z14 = false;
                        while (i9 < 2) {
                        }
                        if (z14) {
                        }
                        TLRPC.ChatPhoto chatPhoto2 = chat2.photo;
                        if (chatPhoto2 != null) {
                        }
                        if (this.m1) {
                        }
                        C = null;
                        boolean H22 = this.j0.H(null, forUserOrChat, forUserOrChat2, z10);
                        if (forUserOrChat != null) {
                        }
                        m10 = this.c.m(0);
                        if (m10 != null) {
                        }
                        if (C == null) {
                        }
                        if (this.F2 == null) {
                        }
                        chat = chat2;
                        if (forUserOrChat != null) {
                        }
                        this.a0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation4) && (getLastStoryViewer() == null || getLastStoryViewer().o0.a != this.a0), this.q0 == null);
                    } else {
                        str = "Members";
                        obj2 = obj;
                        h5VarArr2 = h5VarArr4;
                        if (ChatObject.isKickedFromChat(chat2)) {
                            formatPluralString = LocaleController.getString(R.string.YouWereKicked);
                        } else if (ChatObject.isLeftFromChat(chat2)) {
                            formatPluralString = LocaleController.getString(R.string.YouLeft);
                        } else {
                            int i21 = chat2.participants_count;
                            TLRPC.ChatFull chatFull3 = this.q2;
                            if (chatFull3 != null && (chatParticipants = chatFull3.participants) != null) {
                                i21 = chatParticipants.participants.size();
                            }
                            formatPluralString = (i21 == 0 || this.x2 <= 1) ? LocaleController.formatPluralString(str, i21, new Object[0]) : aa.d.z(LocaleController.formatPluralString(str, i21, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", this.x2, new Object[0]));
                        }
                    }
                    charSequence = formatPluralString;
                    z13 = false;
                    if (z12) {
                    }
                    i9 = 0;
                    z14 = false;
                    while (i9 < 2) {
                    }
                    if (z14) {
                    }
                    TLRPC.ChatPhoto chatPhoto22 = chat2.photo;
                    if (chatPhoto22 != null) {
                    }
                    if (this.m1) {
                    }
                    C = null;
                    boolean H222 = this.j0.H(null, forUserOrChat, forUserOrChat2, z10);
                    if (forUserOrChat != null) {
                    }
                    m10 = this.c.m(0);
                    if (m10 != null) {
                    }
                    if (C == null) {
                    }
                    if (this.F2 == null) {
                    }
                    chat = chat2;
                    if (forUserOrChat != null) {
                    }
                    this.a0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation4) && (getLastStoryViewer() == null || getLastStoryViewer().o0.a != this.a0), this.q0 == null);
                }
                k4(true);
            }
        }
        z11 = false;
        this.l5 = false;
        this.m5 = false;
        j10 = this.a1;
        String str72 = "drawableMuteIcon";
        String str82 = "";
        org.telegram.ui.ActionBar.h5[] h5VarArr42 = this.r;
        if (j10 == 0) {
        }
        k4(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.l2;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        int bgColor2;
        if (this.l2) {
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.s()) {
            bgColor2 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.w8, this.v0);
        } else if (this.B5) {
            bgColor2 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, this.v0);
        } else {
            MessagesController.PeerColor peerColor = this.M5;
            bgColor2 = peerColor != null ? peerColor.getBgColor2(org.telegram.ui.ActionBar.f6.I.q()) : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.s8, this.v0);
        }
        return i0.a.f(bgColor2) > 0.699999988079071d;
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
        hz0 hz0Var;
        my0 my0Var = this.j0;
        Rect rect = this.H2;
        if (my0Var != null && my0Var.getVisibility() == 0 && this.j0.getRealCount() > 1) {
            this.j0.getHitRect(rect);
            if (motionEvent != null) {
            }
        }
        if (this.F4 != -1 && (hz0Var = this.K) != null) {
            if (hz0Var.x0()) {
                this.K.getHitRect(rect);
                if (motionEvent == null || rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
                    hz0 hz0Var2 = this.K;
                    return hz0Var2.getSelectedTab() == hz0Var2.E0.getFirstTabId();
                }
            }
            return false;
        }
        return true;
    }

    public final boolean j4() {
        return getMessagesController().getStoriesController().I(a()) && !this.m1;
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
        int i9;
        by0 by0Var;
        org.telegram.ui.Components.pg0 pg0Var;
        org.telegram.ui.Components.hh0 hh0Var;
        int i10;
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
        int i11 = this.J2;
        this.J2 = 0;
        this.K2 = -1;
        this.L2 = -1;
        this.O2 = -1;
        this.P2 = -1;
        this.Q2 = -1;
        this.R2 = -1;
        this.S2 = -1;
        this.M2 = -1;
        this.N2 = -1;
        this.T2 = -1;
        this.W2 = -1;
        this.X2 = -1;
        this.U2 = -1;
        this.V2 = -1;
        this.Y2 = -1;
        this.Z2 = -1;
        this.a3 = -1;
        this.b3 = -1;
        this.c3 = -1;
        this.Y3 = -1;
        this.Z3 = -1;
        this.a4 = -1;
        this.b4 = -1;
        this.c4 = -1;
        this.d4 = -1;
        this.d3 = -1;
        this.e3 = -1;
        this.f3 = -1;
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
        this.e4 = -1;
        this.j4 = -1;
        this.botPermissionBiometry = -1;
        this.botPermissionEmojiStatus = -1;
        this.botPermissionLocation = -1;
        this.l4 = -1;
        this.f4 = -1;
        this.g4 = -1;
        this.h4 = -1;
        this.i4 = -1;
        this.Q3 = -1;
        this.R3 = -1;
        this.T3 = -1;
        this.S3 = -1;
        this.V3 = -1;
        this.w3 = -1;
        this.x3 = -1;
        this.z3 = -1;
        this.A3 = -1;
        this.B3 = -1;
        this.C3 = -1;
        this.D3 = -1;
        this.F3 = -1;
        this.E3 = -1;
        this.G3 = -1;
        this.H3 = -1;
        this.m4 = -1;
        this.n4 = -1;
        this.I3 = -1;
        this.U3 = -1;
        this.J3 = -1;
        this.L3 = -1;
        this.K3 = -1;
        this.N3 = -1;
        this.O3 = -1;
        this.P3 = -1;
        this.o4 = -1;
        this.y3 = -1;
        this.W3 = -1;
        this.X3 = -1;
        this.p4 = -1;
        this.q4 = -1;
        this.r4 = -1;
        this.s4 = -1;
        this.t4 = -1;
        this.u4 = -1;
        this.v4 = -1;
        this.C4 = -1;
        this.D4 = -1;
        this.A4 = -1;
        this.F4 = -1;
        this.M3 = -1;
        this.w4 = -1;
        this.x4 = -1;
        this.y4 = -1;
        this.z4 = -1;
        this.B4 = -1;
        this.E4 = false;
        this.G4 = -1;
        this.H4 = -1;
        this.I4 = -1;
        ArrayList arrayList2 = this.M4;
        arrayList2.clear();
        ArrayList arrayList3 = this.N4;
        arrayList3.clear();
        org.telegram.ui.Components.wt0 wt0Var = this.N;
        boolean z13 = true;
        if (wt0Var != null) {
            int[] iArr = wt0Var.c;
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
                z10 = this.N.f;
            }
            if (!z10) {
                this.N.getClass();
            }
            if (!z10 && (userFull6 = this.r2) != null) {
                z10 = userFull6.stories_pinned_available;
            }
            if (!z10 && (userFull5 = this.r2) != null && (botInfo = userFull5.bot_info) != null) {
                z10 = botInfo.has_preview_medias;
            }
            if (!z10 && (((userFull4 = this.r2) != null && userFull4.stargifts_count > 0) || ((chatFull6 = this.q2) != null && chatFull6.stargifts_count > 0))) {
                z10 = true;
            }
            if (!z10 && (chatFull5 = this.q2) != null) {
                z10 = chatFull5.stories_pinned_available;
            }
            if (!z10) {
                long j10 = this.b1;
                if (j10 == 0 || !MessagesController.ChannelRecommendations.hasRecommendations(this.currentAccount, -j10)) {
                    if (this.n2) {
                        long j11 = this.a1;
                        if (j11 != 0) {
                        }
                    }
                }
                z10 = true;
            }
            if (this.a1 == 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.a1));
                TLRPC.UserFull userFull7 = this.r2;
                if (userFull7 != null && userFull7.saved_music != null && (this.m0 == null || this.o1)) {
                    this.E4 = true;
                }
                if (this.w3 < 0 && this.x3 < 0) {
                    if (this.E4 || this.M5 != null || this.W == null) {
                        int i13 = this.J2;
                        this.J2 = i13 + 1;
                        this.x3 = i13;
                    } else {
                        int i14 = this.J2;
                        this.J2 = i14 + 1;
                        this.w3 = i14;
                    }
                }
                if (!UserObject.isUserSelf(user) || this.o1) {
                    String publicUsername = UserObject.getPublicUsername(user);
                    TLRPC.UserFull userFull8 = this.r2;
                    boolean z14 = ((userFull8 == null || TextUtils.isEmpty(userFull8.about)) && (user == null || TextUtils.isEmpty(publicUsername))) ? false : true;
                    boolean z15 = (user == null || (TextUtils.isEmpty(user.phone) && TextUtils.isEmpty(this.Z4))) ? false : true;
                    if (!this.n2 && (userFull3 = this.r2) != null && userFull3.unofficial_security_risk) {
                        int i15 = this.J2;
                        this.f4 = i15;
                        this.J2 = i15 + 2;
                        this.g4 = i15 + 1;
                    }
                    TLRPC.UserFull userFull9 = this.r2;
                    if (userFull9 != null && (userFull9.flags2 & 64) != 0 && (((f6Var = this.s2) == null || !f6Var.c || !f6Var.d.isEmpty()) && (chat = getMessagesController().getChat(Long.valueOf(this.r2.personal_channel_id))) != null && (ChatObject.isPublic(chat) || !ChatObject.isNotInChat(chat)))) {
                        int i16 = this.J2;
                        this.M2 = i16;
                        this.J2 = i16 + 2;
                        this.N2 = i16 + 1;
                    }
                    if (!this.n2 && (z15 || !z14)) {
                        int i17 = this.J2;
                        this.J2 = i17 + 1;
                        this.C3 = i17;
                    }
                    TLRPC.UserFull userFull10 = this.r2;
                    if (userFull10 != null && !TextUtils.isEmpty(userFull10.about)) {
                        int i18 = this.J2;
                        this.J2 = i18 + 1;
                        this.F3 = i18;
                    }
                    if (user != null && publicUsername != null) {
                        int i19 = this.J2;
                        this.J2 = i19 + 1;
                        this.H3 = i19;
                    }
                    TLRPC.UserFull userFull11 = this.r2;
                    if (userFull11 != null) {
                        if (userFull11.birthday != null) {
                            int i20 = this.J2;
                            this.J2 = i20 + 1;
                            this.Q2 = i20;
                        }
                        if (userFull11.business_work_hours != null) {
                            int i21 = this.J2;
                            this.J2 = i21 + 1;
                            this.K3 = i21;
                        }
                        if (userFull11.business_location != null) {
                            int i22 = this.J2;
                            this.J2 = i22 + 1;
                            this.L3 = i22;
                        }
                        if (userFull11.note != null) {
                            int i23 = this.J2;
                            this.J2 = i23 + 1;
                            this.D3 = i23;
                        }
                    }
                    if (this.W == null && this.a1 != getUserConfig().getClientUserId()) {
                        int i24 = this.J2;
                        this.J2 = i24 + 1;
                        this.J3 = i24;
                    }
                    boolean z16 = this.n2;
                    if (z16 && user != null && user.bot_has_main_app) {
                        int i25 = this.J2;
                        this.J2 = i25 + 1;
                        this.e4 = i25;
                    }
                    int i26 = this.J2;
                    int i27 = i26 + 1;
                    this.J2 = i27;
                    this.N3 = i26;
                    if (user != null && user.linked_community_id != 0) {
                        this.h4 = i27;
                        this.J2 = i26 + 3;
                        this.i4 = i26 + 2;
                    }
                    if (z16 && (userFull2 = this.r2) != null && (starrefprogram = userFull2.starref_program) != null && (starrefprogram.flags & 2) == 0 && getMessagesController().starrefConnectAllowed) {
                        int i28 = this.J2;
                        this.O3 = i28;
                        this.J2 = i28 + 2;
                        this.P3 = i28 + 1;
                    }
                    if (this.n2) {
                        if (this.o2 == null && getContext() != null) {
                            this.o2 = mh.u0.e(getContext(), this.currentAccount, this.a1);
                        }
                        if (this.p2 == null && getContext() != null) {
                            this.p2 = mh.r.c(getContext(), this.currentAccount, this.a1);
                        }
                        mh.u0 u0Var = this.o2;
                        boolean z17 = u0Var != null && u0Var.b();
                        mh.r rVar = this.p2;
                        boolean z18 = rVar != null && rVar.a();
                        TLRPC.UserFull userFull12 = this.r2;
                        if (userFull12 == null || !userFull12.bot_can_manage_emoji_status) {
                            if (!mh.q4.d((Activity) getContext(), this.currentAccount, this.a1)) {
                                z12 = false;
                                if (!z12 || z17 || z18) {
                                    int i29 = this.J2;
                                    int i30 = i29 + 1;
                                    this.J2 = i30;
                                    this.j4 = i29;
                                    if (z12) {
                                        this.J2 = i29 + 2;
                                        this.botPermissionEmojiStatus = i30;
                                    }
                                    if (z17) {
                                        int i31 = this.J2;
                                        this.J2 = i31 + 1;
                                        this.botPermissionLocation = i31;
                                    }
                                    if (z18) {
                                        int i32 = this.J2;
                                        this.J2 = i32 + 1;
                                        this.botPermissionBiometry = i32;
                                    }
                                    int i33 = this.J2;
                                    this.J2 = i33 + 1;
                                    this.l4 = i33;
                                }
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        int i292 = this.J2;
                        int i302 = i292 + 1;
                        this.J2 = i302;
                        this.j4 = i292;
                        if (z12) {
                        }
                        if (z17) {
                        }
                        if (z18) {
                        }
                        int i332 = this.J2;
                        this.J2 = i332 + 1;
                        this.l4 = i332;
                    }
                    TLRPC.EncryptedChat encryptedChat = this.z2;
                    if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                        int i34 = this.J2;
                        this.m4 = i34;
                        this.n4 = i34 + 1;
                        this.J2 = i34 + 3;
                        this.o4 = i34 + 2;
                    }
                    if (user != null && !this.n2 && encryptedChat == null && user.id != getUserConfig().getClientUserId() && this.g1) {
                        int i35 = this.J2;
                        this.G4 = i35;
                        this.J2 = i35 + 2;
                        this.I4 = i35 + 1;
                    }
                    if (user != null && user.bot) {
                        TLRPC.UserFull userFull13 = this.r2;
                        if (userFull13 != null && userFull13.can_view_revenue && gh.c0.g(this.currentAccount).i(this.a1) > 0) {
                            int i36 = this.J2;
                            this.J2 = i36 + 1;
                            this.y4 = i36;
                        }
                        if (gh.c0.g(this.currentAccount).c(this.a1).amount > 0 || !gh.c0.g(this.currentAccount).k(this.a1).a[0].isEmpty()) {
                            int i37 = this.J2;
                            this.J2 = i37 + 1;
                            this.x4 = i37;
                        }
                    }
                    if (user != null && this.n2 && !user.bot_nochats) {
                        int i38 = this.J2;
                        this.W3 = i38;
                        this.J2 = i38 + 2;
                        this.X3 = i38 + 1;
                    } else if (this.x4 >= 0) {
                        z11 = true;
                        if (!this.o1 && this.Y4 && user != null && !user.contact && !user.bot && !UserObject.isService(user.id)) {
                            int i39 = this.J2;
                            this.J2 = i39 + 1;
                            this.V3 = i39;
                            z11 = true;
                        }
                        if (!this.o1 && this.V4 != 0 && this.W4 < 0 && ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(-this.W4)), 13)) {
                            int i40 = this.J2;
                            this.J2 = i40 + 1;
                            this.S3 = i40;
                            z11 = true;
                        }
                        if (!this.o1 || this.V4 == 0 || ContactsController.getInstance(this.currentAccount).isContact(this.a1)) {
                            z13 = z11;
                        } else {
                            int i41 = this.J2;
                            this.J2 = i41 + 1;
                            this.T3 = i41;
                        }
                        if (z13) {
                            int i42 = this.J2;
                            this.J2 = i42 + 1;
                            this.U3 = i42;
                        }
                        if (!z10 || ((user != null && user.bot && user.bot_can_edit && user.bot_has_main_app) || (!((userFull = this.r2) == null || userFull.common_chats_count == 0) || this.o1))) {
                            int i43 = this.J2;
                            this.J2 = i43 + 1;
                            this.F4 = i43;
                        } else if (this.I4 == -1 && this.k1) {
                            int i44 = this.J2;
                            this.Q3 = i44;
                            this.J2 = i44 + 2;
                            this.I4 = i44 + 1;
                        }
                    }
                    z11 = false;
                    if (!this.o1) {
                        int i392 = this.J2;
                        this.J2 = i392 + 1;
                        this.V3 = i392;
                        z11 = true;
                    }
                    if (!this.o1) {
                        int i402 = this.J2;
                        this.J2 = i402 + 1;
                        this.S3 = i402;
                        z11 = true;
                    }
                    if (this.o1) {
                    }
                    z13 = z11;
                    if (z13) {
                    }
                    if (z10) {
                    }
                    int i432 = this.J2;
                    this.J2 = i432 + 1;
                    this.F4 = i432;
                } else {
                    if (this.F2 == null) {
                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                        if (userProfilePhoto != null) {
                            TLRPC.FileLocation fileLocation = userProfilePhoto.photo_big;
                            if (!(fileLocation instanceof TLRPC.TL_fileLocation_layer97)) {
                            }
                        }
                        my0 my0Var = this.j0;
                        if (my0Var == null || my0Var.getRealCount() == 0) {
                            int i45 = this.J2;
                            this.K2 = i45;
                            this.J2 = i45 + 2;
                            this.L2 = i45 + 1;
                        }
                    }
                    int i46 = this.J2;
                    this.O2 = i46;
                    this.P2 = i46 + 1;
                    this.R2 = i46 + 2;
                    this.S2 = i46 + 3;
                    this.J2 = i46 + 5;
                    this.Z2 = i46 + 4;
                    Set<String> set = getMessagesController().pendingSuggestions;
                    if (set.contains("PREMIUM_GRACE")) {
                        int i47 = this.J2;
                        this.U2 = i47;
                        this.J2 = i47 + 2;
                        this.V2 = i47 + 1;
                    } else if (set.contains("VALIDATE_PHONE_NUMBER")) {
                        int i48 = this.J2;
                        this.W2 = i48;
                        this.J2 = i48 + 2;
                        this.T2 = i48 + 1;
                    } else if (set.contains("VALIDATE_PASSWORD")) {
                        int i49 = this.J2;
                        this.Y2 = i49;
                        this.J2 = i49 + 2;
                        this.X2 = i49 + 1;
                    }
                    int i50 = this.J2;
                    this.a3 = i50;
                    this.f3 = i50 + 1;
                    this.d3 = i50 + 2;
                    this.b3 = i50 + 3;
                    this.e3 = i50 + 4;
                    this.J2 = i50 + 6;
                    this.h3 = i50 + 5;
                    if (getMessagesController().filtersEnabled || !getMessagesController().dialogFilters.isEmpty()) {
                        int i51 = this.J2;
                        this.J2 = i51 + 1;
                        this.g3 = i51;
                    }
                    int i52 = this.J2;
                    this.j3 = i52;
                    this.c3 = i52 + 1;
                    this.J2 = i52 + 3;
                    this.k3 = i52 + 2;
                    if (!getMessagesController().premiumFeaturesBlocked()) {
                        int i53 = this.J2;
                        this.J2 = i53 + 1;
                        this.Y3 = i53;
                    }
                    if (getMessagesController().starsPurchaseAvailable()) {
                        int i54 = this.J2;
                        this.J2 = i54 + 1;
                        this.Z3 = i54;
                    }
                    gh.v7.y(this.currentAccount, true).p();
                    if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (gh.v7.y(this.currentAccount, true).e && (gh.v7.y(this.currentAccount, true).N() || gh.v7.y(this.currentAccount, true).p().positive()))) {
                        int i55 = this.J2;
                        this.J2 = i55 + 1;
                        this.a4 = i55;
                    }
                    if (!getMessagesController().premiumFeaturesBlocked()) {
                        int i56 = this.J2;
                        this.J2 = i56 + 1;
                        this.b4 = i56;
                    }
                    if (!getMessagesController().premiumPurchaseBlocked()) {
                        int i57 = this.J2;
                        this.J2 = i57 + 1;
                        this.c4 = i57;
                    }
                    if (this.Y3 >= 0 || this.Z3 >= 0 || this.a4 >= 0 || this.b4 >= 0 || this.c4 >= 0) {
                        int i58 = this.J2;
                        this.J2 = i58 + 1;
                        this.d4 = i58;
                    }
                    int i59 = this.J2;
                    this.l3 = i59;
                    this.m3 = i59 + 1;
                    this.n3 = i59 + 2;
                    int i60 = i59 + 4;
                    this.J2 = i60;
                    this.o3 = i59 + 3;
                    if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
                        this.p3 = i60;
                        this.J2 = i59 + 6;
                        this.q3 = i59 + 5;
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        int i61 = this.J2;
                        this.r3 = i61;
                        this.s3 = i61 + 1;
                        this.J2 = i61 + 3;
                        this.t3 = i61 + 2;
                    }
                    if (BuildVars.DEBUG_VERSION) {
                        int i62 = this.J2;
                        this.J2 = i62 + 1;
                        this.u3 = i62;
                    }
                    int i63 = this.J2;
                    this.J2 = i63 + 1;
                    this.v3 = i63;
                }
            } else if (this.m1) {
                if (this.w3 < 0 && this.x3 < 0) {
                    if (this.E4 || this.M5 != null || this.W == null) {
                        int i64 = this.J2;
                        this.J2 = i64 + 1;
                        this.x3 = i64;
                    } else {
                        int i65 = this.J2;
                        this.J2 = i65 + 1;
                        this.w3 = i65;
                    }
                }
                int i66 = this.J2;
                int i67 = i66 + 1;
                this.J2 = i67;
                this.H3 = i66;
                if (this.W == null) {
                    this.J2 = i66 + 2;
                    this.M3 = i67;
                }
                int i68 = this.J2;
                int i69 = i68 + 1;
                this.J2 = i69;
                this.N3 = i68;
                if (z10) {
                    this.J2 = i68 + 2;
                    this.F4 = i69;
                }
            } else if (this.b1 != 0) {
                TLRPC.ChatFull chatFull7 = this.q2;
                if ((chatFull7 != null && (!TextUtils.isEmpty(chatFull7.about) || (this.q2.location instanceof TLRPC.TL_channelLocation))) || ChatObject.isPublic(this.A2)) {
                    if (this.w3 < 0 && this.x3 < 0) {
                        if (this.E4 || this.M5 != null || this.W == null) {
                            int i70 = this.J2;
                            this.J2 = i70 + 1;
                            this.x3 = i70;
                        } else {
                            int i71 = this.J2;
                            this.J2 = i71 + 1;
                            this.w3 = i71;
                        }
                    }
                    if (this.W == null) {
                        int i72 = this.J2;
                        this.J2 = i72 + 1;
                        this.z3 = i72;
                    }
                    TLRPC.ChatFull chatFull8 = this.q2;
                    if (chatFull8 != null) {
                        if (!TextUtils.isEmpty(chatFull8.about)) {
                            int i73 = this.J2;
                            this.J2 = i73 + 1;
                            this.G3 = i73;
                        }
                        if (this.q2.location instanceof TLRPC.TL_channelLocation) {
                            int i74 = this.J2;
                            this.J2 = i74 + 1;
                            this.E3 = i74;
                        }
                    }
                    if (ChatObject.isPublic(this.A2)) {
                        int i75 = this.J2;
                        this.J2 = i75 + 1;
                        this.H3 = i75;
                    }
                }
                if (this.w3 < 0 && this.x3 < 0) {
                    if (this.E4 || this.M5 != null || this.W == null) {
                        int i76 = this.J2;
                        this.J2 = i76 + 1;
                        this.x3 = i76;
                    } else {
                        int i77 = this.J2;
                        this.J2 = i77 + 1;
                        this.w3 = i77;
                    }
                }
                if (this.W == null) {
                    if (this.z3 != -1) {
                        int i78 = this.J2;
                        this.J2 = i78 + 1;
                        this.I3 = i78;
                    }
                    int i79 = this.J2;
                    this.J2 = i79 + 1;
                    this.J3 = i79;
                }
                int i80 = this.J2;
                if (i80 > 0) {
                    this.J2 = i80 + 1;
                    this.N3 = i80;
                }
                TLRPC.Chat chat2 = this.A2;
                if (chat2 != null && chat2.linked_community_id != 0) {
                    int i81 = this.J2;
                    this.h4 = i81;
                    this.J2 = i81 + 2;
                    this.i4 = i81 + 1;
                }
                if (ChatObject.isChannel(chat2)) {
                    TLRPC.Chat chat3 = this.A2;
                    if (!chat3.megagroup) {
                        TLRPC.ChatFull chatFull9 = this.q2;
                        if (chatFull9 != null && (chat3.creator || chatFull9.can_view_participants)) {
                            if (this.W == null) {
                                int i82 = this.J2;
                                this.J2 = i82 + 1;
                                this.p4 = i82;
                            }
                            int i83 = this.J2;
                            int i84 = i83 + 1;
                            this.J2 = i84;
                            this.t4 = i83;
                            if (chatFull9.requests_pending > 0) {
                                this.J2 = i83 + 2;
                                this.u4 = i84;
                            }
                            int i85 = this.J2;
                            int i86 = i85 + 1;
                            this.J2 = i86;
                            this.v4 = i85;
                            if (chatFull9.banned_count != 0 || chatFull9.kicked_count != 0) {
                                this.J2 = i85 + 2;
                                this.C4 = i86;
                            }
                            if ((chatFull9.can_view_stars_revenue && (gh.c0.g(this.currentAccount).c(-this.b1).amount > 0 || !gh.c0.g(this.currentAccount).k(-this.b1).a[0].isEmpty())) || ((chatFull4 = this.q2) != null && chatFull4.can_view_revenue && gh.c0.g(this.currentAccount).i(-this.b1) > 0)) {
                                int i87 = this.J2;
                                this.J2 = i87 + 1;
                                this.z4 = i87;
                            }
                            int i88 = this.J2;
                            this.w4 = i88;
                            this.J2 = i88 + 2;
                            this.A4 = i88 + 1;
                        }
                        if (ChatObject.isChannel(this.A2)) {
                            TLRPC.ChatFull chatFull10 = this.q2;
                            if (chatFull10 != null) {
                                if (this.m1 || (chatParticipants = chatFull10.participants) == null || chatParticipants.participants == null || (chatParticipants instanceof TLRPC.TL_chatParticipantsForbidden)) {
                                    if (!ChatObject.isNotInChat(this.A2) && ChatObject.canAddUsers(this.A2) && this.q2.participants_hidden) {
                                        int i89 = this.J2;
                                        this.s4 = i89;
                                        this.J2 = i89 + 2;
                                        this.D4 = i89 + 1;
                                    }
                                    hz0 hz0Var = this.K;
                                    if (hz0Var != null) {
                                        hz0Var.n1();
                                    }
                                } else {
                                    if (ChatObject.canAddUsers(this.A2) || (tL_chatBannedRights = this.A2.default_banned_rights) == null || !tL_chatBannedRights.invite_users) {
                                        int i90 = this.J2;
                                        this.J2 = i90 + 1;
                                        this.s4 = i90;
                                    }
                                    if (this.q2.participants.participants.size() <= 5 || !z10) {
                                        if (this.s4 == -1 && this.W == null) {
                                            int i91 = this.J2;
                                            this.J2 = i91 + 1;
                                            this.p4 = i91;
                                        }
                                        int i92 = this.J2;
                                        this.q4 = i92;
                                        int size = this.q2.participants.participants.size() + i92;
                                        this.r4 = size;
                                        this.J2 = size + 1;
                                        this.D4 = size;
                                        arrayList2.addAll(this.q2.participants.participants);
                                        ArrayList arrayList4 = this.y2;
                                        if (arrayList4 != null) {
                                            arrayList3.addAll(arrayList4);
                                        }
                                        hz0 hz0Var2 = this.K;
                                        if (hz0Var2 != null) {
                                            hz0Var2.a1(null, null);
                                        }
                                    } else {
                                        if (this.s4 != -1) {
                                            int i93 = this.J2;
                                            this.J2 = i93 + 1;
                                            this.D4 = i93;
                                        }
                                        hz0 hz0Var3 = this.K;
                                        if (hz0Var3 != null) {
                                            hz0Var3.a1(this.y2, this.q2);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (this.m1 || (chatFull3 = this.q2) == null || !this.A2.megagroup || (chatParticipants2 = chatFull3.participants) == null || (arrayList = chatParticipants2.participants) == null || arrayList.isEmpty()) {
                                if (!ChatObject.isNotInChat(this.A2) && ChatObject.canAddUsers(this.A2) && (chatFull2 = this.q2) != null && chatFull2.participants_hidden) {
                                    int i94 = this.J2;
                                    this.s4 = i94;
                                    this.J2 = i94 + 2;
                                    this.D4 = i94 + 1;
                                }
                                hz0 hz0Var4 = this.K;
                                if (hz0Var4 != null) {
                                    hz0Var4.n1();
                                }
                            } else {
                                if (!ChatObject.isNotInChat(this.A2) && ChatObject.canAddUsers(this.A2) && this.q2.participants_count < getMessagesController().maxMegagroupCount) {
                                    int i95 = this.J2;
                                    this.J2 = i95 + 1;
                                    this.s4 = i95;
                                }
                                int size2 = this.q2.participants.participants.size();
                                if ((size2 <= 5 || !z10 || this.O4 == 1) && this.O4 != 2) {
                                    if (this.s4 == -1 && this.W == null) {
                                        int i96 = this.J2;
                                        this.J2 = i96 + 1;
                                        this.p4 = i96;
                                    }
                                    int i97 = this.J2;
                                    this.q4 = i97;
                                    int i98 = i97 + size2;
                                    this.r4 = i98;
                                    this.J2 = i98 + 1;
                                    this.D4 = i98;
                                    arrayList2.addAll(this.q2.participants.participants);
                                    ArrayList arrayList5 = this.y2;
                                    if (arrayList5 != null) {
                                        arrayList3.addAll(arrayList5);
                                    }
                                    this.O4 = 1;
                                    hz0 hz0Var5 = this.K;
                                    if (hz0Var5 != null) {
                                        hz0Var5.a1(null, null);
                                    }
                                } else {
                                    if (this.s4 != -1) {
                                        int i99 = this.J2;
                                        this.J2 = i99 + 1;
                                        this.D4 = i99;
                                    }
                                    if (this.K != null) {
                                        if (!this.y2.isEmpty()) {
                                            this.O4 = 2;
                                        }
                                        this.K.a1(this.y2, this.q2);
                                    }
                                }
                            }
                            if (this.I4 == -1) {
                                TLRPC.Chat chat4 = this.A2;
                                if (chat4.left && !chat4.kicked) {
                                    long j12 = MessagesController.getNotificationsSettings(this.currentAccount).getLong("dialog_join_requested_time_" + this.e1, -1L);
                                    if (j12 <= 0 || System.currentTimeMillis() - j12 >= 120000) {
                                        org.telegram.ui.Components.pg0 pg0Var2 = this.W;
                                        if (pg0Var2 == null || !pg0Var2.f()) {
                                            int i100 = this.J2;
                                            this.H4 = i100;
                                            this.J2 = i100 + 2;
                                            this.I4 = i100 + 1;
                                        }
                                        if (z10) {
                                            int i101 = this.J2;
                                            this.J2 = i101 + 1;
                                            this.F4 = i101;
                                        }
                                        if (this.F4 == -1) {
                                            int i102 = this.J2;
                                            this.J2 = i102 + 1;
                                            this.y3 = i102;
                                        }
                                        if (this.actionBar != null) {
                                            i9 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                                        } else {
                                            i9 = 0;
                                        }
                                        if (this.a != null && i11 <= this.J2) {
                                            i10 = this.A0;
                                            if (i10 != 0) {
                                            }
                                            by0Var = this.a;
                                            if (by0Var != null) {
                                                by0Var.setTranslateSelectorPosition(this.K3);
                                            }
                                            pg0Var = this.W;
                                            if (pg0Var != null) {
                                                pg0Var.o(7, z13);
                                            }
                                            hh0Var = this.Y;
                                            if (hh0Var != null) {
                                                TLRPC.UserFull userFull14 = this.r2;
                                                if (userFull14 != null) {
                                                    hh0Var.setMusicDocument(userFull14.saved_music);
                                                }
                                                this.Y.setVisibility(this.E4 ? 0 : 8);
                                                return;
                                            }
                                            return;
                                        }
                                        this.y0 = 0;
                                        by0Var = this.a;
                                        if (by0Var != null) {
                                        }
                                        pg0Var = this.W;
                                        if (pg0Var != null) {
                                        }
                                        hh0Var = this.Y;
                                        if (hh0Var != null) {
                                        }
                                    }
                                }
                            }
                        }
                        z13 = false;
                        if (z10) {
                        }
                        if (this.F4 == -1) {
                        }
                        if (this.actionBar != null) {
                        }
                        if (this.a != null) {
                            i10 = this.A0;
                            if (i10 != 0) {
                            }
                            by0Var = this.a;
                            if (by0Var != null) {
                            }
                            pg0Var = this.W;
                            if (pg0Var != null) {
                            }
                            hh0Var = this.Y;
                            if (hh0Var != null) {
                            }
                        }
                        this.y0 = 0;
                        by0Var = this.a;
                        if (by0Var != null) {
                        }
                        pg0Var = this.W;
                        if (pg0Var != null) {
                        }
                        hh0Var = this.Y;
                        if (hh0Var != null) {
                        }
                    }
                }
                TLRPC.ChatFull chatFull11 = this.q2;
                if ((chatFull11 != null && chatFull11.can_view_stars_revenue && (gh.c0.g(this.currentAccount).c(-this.b1).amount > 0 || !gh.c0.g(this.currentAccount).k(-this.b1).a[0].isEmpty())) || ((chatFull = this.q2) != null && chatFull.can_view_revenue && gh.c0.g(this.currentAccount).i(-this.b1) > 0)) {
                    int i103 = this.J2;
                    this.z4 = i103;
                    this.J2 = i103 + 2;
                    this.A4 = i103 + 1;
                }
                if (ChatObject.isChannel(this.A2)) {
                }
                z13 = false;
                if (z10) {
                }
                if (this.F4 == -1) {
                }
                if (this.actionBar != null) {
                }
                if (this.a != null) {
                }
                this.y0 = 0;
                by0Var = this.a;
                if (by0Var != null) {
                }
                pg0Var = this.W;
                if (pg0Var != null) {
                }
                hh0Var = this.Y;
                if (hh0Var != null) {
                }
            }
            z13 = false;
            if (this.F4 == -1) {
            }
            if (this.actionBar != null) {
            }
            if (this.a != null) {
            }
            this.y0 = 0;
            by0Var = this.a;
            if (by0Var != null) {
            }
            pg0Var = this.W;
            if (pg0Var != null) {
            }
            hh0Var = this.Y;
            if (hh0Var != null) {
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
        if (this.a1 == 0) {
        }
        z13 = false;
        if (this.F4 == -1) {
        }
        if (this.actionBar != null) {
        }
        if (this.a != null) {
        }
        this.y0 = 0;
        by0Var = this.a;
        if (by0Var != null) {
        }
        pg0Var = this.W;
        if (pg0Var != null) {
        }
        hh0Var = this.Y;
        if (hh0Var != null) {
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
        org.telegram.ui.Components.o9 currentItemView;
        boolean z11;
        float f10;
        NotchInfoUtils.NotchInfo notchInfo;
        boolean z12;
        float f11;
        int i9;
        ValueAnimator valueAnimator2;
        NotchInfoUtils.NotchInfo notchInfo2;
        TLRPC.ChatFull chatFull;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        float y32 = y3();
        by0 by0Var = this.a;
        if (by0Var != null && !this.C1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) by0Var.getLayoutParams();
            if (layoutParams.topMargin != currentActionBarHeight) {
                layoutParams.topMargin = currentActionBarHeight;
                this.a.setLayoutParams(layoutParams);
            }
        }
        n5(z10);
        if (this.U != null) {
            this.a.setTopGlowOffset((int) this.M1);
            this.a.setOverScrollMode((this.M1 <= ((float) T3()) || this.M1 >= ((float) ((O3() + this.a.getMeasuredWidth()) - currentActionBarHeight))) ? 0 : 2);
        }
        if (this.U != null && !this.I5 && this.C1) {
            x3();
            return;
        }
        int T3 = T3();
        if (this.U != null) {
            if (this.W != null && this.b1 != 0) {
                this.W.o(2, (!ChatObject.isChannel(this.A2) || this.A2.megagroup || (chatFull = this.q2) == null || chatFull.linked_chat_id == 0) ? false : true);
            }
            n5(z10);
            float translationY = this.actionBar.getTranslationY() + ((((y32 + 1.0f) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f)) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f));
            if (this.C1) {
                this.W1 = translationY;
            } else {
                float f12 = -AndroidUtilities.dp(29.0f);
                org.telegram.ui.Components.eh0 eh0Var = this.p0;
                if (eh0Var != null && (notchInfo2 = eh0Var.n) != null && notchInfo2.isLikelyCircle) {
                    f12 = notchInfo2.bounds.centerY();
                }
                this.W1 = AndroidUtilities.lerp(f12, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f)), y32);
            }
            float f13 = this.C1 ? this.N1 : this.M1;
            float f14 = T3;
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.r;
            org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.f;
            if (f13 > f14 || this.l2) {
                float max = Math.max(0.0f, Math.min(1.0f, (f13 - f14) / ((this.a.getMeasuredWidth() - currentActionBarHeight) - U3())));
                this.d2 = max;
                this.X1 = (AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) / 100.0f) * 42.0f;
                this.Y1 = 0.0f;
                oy0 oy0Var = this.q0;
                if (oy0Var != null) {
                    oy0Var.invalidate();
                }
                gh.v0 v0Var = this.r0;
                if (v0Var != null) {
                    v0Var.invalidate();
                }
                float min = Math.min(AndroidUtilities.dpf2(2000.0f), Math.max(AndroidUtilities.dpf2(1100.0f), Math.abs(this.e2))) / AndroidUtilities.dpf2(1100.0f);
                O3();
                boolean z13 = this.k2;
                float[] fArr = this.i2;
                if (!z13 || (!this.B0 && this.d2 < 0.33f)) {
                    if (this.l2) {
                        this.l2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                        org.telegram.ui.ActionBar.w0 w0Var = this.P0;
                        if (w0Var != null) {
                            w0Var.r(21);
                            if (this.m0 != null) {
                                this.P0.r(33);
                                this.P0.r(34);
                                this.P0.r(35);
                                this.P0.K(36);
                                this.P0.K(31);
                            }
                        }
                        org.telegram.ui.ActionBar.w0 w0Var2 = this.Q0;
                        if (w0Var2 != null) {
                            w0Var2.setEnabled(!this.v1);
                        }
                        this.J.f(min, false);
                        this.k0.b(min);
                        this.f2.cancel();
                        this.a0.getImageReceiver().setAllowStartAnimation(true);
                        this.a0.getImageReceiver().startAnimation();
                        float lerp = AndroidUtilities.lerp(fArr, this.h2);
                        fArr[0] = lerp;
                        fArr[1] = 0.0f;
                        this.f2.setInterpolator(org.telegram.ui.Components.gr.j);
                        if (this.j2) {
                            this.f2.setDuration(0L);
                        } else {
                            this.f2.setDuration((long) ((lerp * 250.0f) / min));
                        }
                        this.Z0.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, this.v0));
                        if (!this.D0 && (currentItemView = this.j0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().getDrawable() instanceof org.telegram.ui.Components.u51) {
                                this.a0.T = false;
                            } else {
                                ly0 ly0Var = this.a0;
                                ly0Var.T = true;
                                ly0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().getDrawableSafe());
                            }
                        }
                        this.f2.addListener(new yy0(this, 3));
                        this.a0.setForegroundAlpha(1.0f);
                        this.U.setVisibility(0);
                        this.j0.setAlpha(0.0f);
                        this.f2.start();
                        this.L1 = false;
                        try {
                            this.U.performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                            this.U.setScaleX(this.X1);
                            this.U.setScaleY(this.X1);
                            N3();
                            valueAnimator = this.f2;
                            if (valueAnimator != null) {
                            }
                            D4();
                            h5VarArr2[1].setTranslationY(this.a2);
                            h5VarArr[1].setTranslationX(W3(this.b2));
                            h5VarArr[1].setTranslationY(X3(this.c2));
                            this.s.setTranslationX(this.b2);
                            this.s.setTranslationY(this.c2);
                            V4();
                            z11 = this.C1;
                            if (!z11) {
                            }
                            if (f13 <= f14) {
                            }
                            z12 = false;
                            if (!z12) {
                            }
                            b5(currentActionBarHeight);
                            if (y32 < 1.0f) {
                            }
                        }
                    }
                    this.U.setScaleX(this.X1);
                    this.U.setScaleY(this.X1);
                    N3();
                    valueAnimator = this.f2;
                    if (valueAnimator != null || !valueAnimator.isRunning()) {
                        D4();
                        h5VarArr2[1].setTranslationY(this.a2);
                        h5VarArr[1].setTranslationX(W3(this.b2));
                        h5VarArr[1].setTranslationY(X3(this.c2));
                        this.s.setTranslationX(this.b2);
                        this.s.setTranslationY(this.c2);
                        V4();
                    }
                    z11 = this.C1;
                    if (!z11 && this.F1 == 2) {
                        float f15 = this.K5;
                        float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f));
                        h5VarArr2[0].setTranslationX((this.K5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f));
                        double d = translationY2;
                        h5VarArr2[0].setTranslationY(((float) Math.floor(d)) + AndroidUtilities.dp(1.3f));
                        h5VarArr[0].setTranslationX((this.K5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f));
                        h5VarArr[0].setTranslationY(((float) Math.floor(d)) + AndroidUtilities.dp(24.0f));
                        h5VarArr2[0].setScaleX(1.0f);
                        h5VarArr2[0].setScaleY(1.0f);
                        h5VarArr2[1].setPivotY(r4.getMeasuredHeight());
                        h5VarArr2[1].setScaleX(1.38f);
                        h5VarArr2[1].setScaleY(1.38f);
                        this.X1 = AndroidUtilities.lerp(42, 138, this.O1) / 100.0f;
                        this.Y1 = 0.0f;
                        oy0 oy0Var2 = this.q0;
                        if (oy0Var2 != null) {
                            oy0Var2.setExpandProgress(1.0f);
                        }
                        gh.v0 v0Var2 = this.r0;
                        if (v0Var2 != null) {
                            v0Var2.setExpandProgress(1.0f);
                        }
                        this.a0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, this.O1));
                        this.U.setTranslationX(AndroidUtilities.lerp(f15, 0.0f, this.O1));
                        this.U.setTranslationY(AndroidUtilities.lerp((float) Math.ceil(d), 0.0f, this.O1));
                        float measuredWidth = ((this.X1 * 100.0f) / 42.0f) * (this.U.getMeasuredWidth() - AndroidUtilities.dp(42.0f));
                        this.d0.setTranslationX(this.U.getX() + AndroidUtilities.dp(16.0f) + measuredWidth);
                        this.d0.setTranslationY(this.U.getY() + AndroidUtilities.dp(-10.0f) + measuredWidth);
                        this.e0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                        this.e0.setTranslationY(this.U.getY() + AndroidUtilities.dp(26.5f) + measuredWidth);
                        this.f0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                        this.f0.setTranslationY(this.U.getY() + AndroidUtilities.dp(24.0f) + measuredWidth);
                        this.g0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                        this.g0.setTranslationY(this.U.getY() + AndroidUtilities.dp(24.0f) + measuredWidth);
                        this.U.setScaleX(this.X1);
                        this.U.setScaleY(this.X1);
                        this.j0.setAlpha(0.0f);
                        this.j0.setVisibility(0);
                        ly0 ly0Var2 = this.a0;
                        float f16 = this.O1;
                        float f17 = this.X1;
                        ly0Var2.D = f16;
                        ly0Var2.E = f17;
                        ly0Var2.C = true;
                        this.J.e(f16, false);
                        this.actionBar.C(i0.a.d(this.O1, this.M5 != null ? -1 : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v8, this.v0), -1), false);
                        org.telegram.ui.Components.il0 il0Var = this.H;
                        if (il0Var != null) {
                            il0Var.b(i0.a.d(this.O1, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h8, this.v0), Color.argb(179, 255, 255, 255)));
                        }
                        Drawable drawable = this.x;
                        if (drawable != null) {
                            drawable.setColorFilter(this.M5 == null ? i0.a.d(this.O1, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.pc, this.v0), -1) : -1, PorterDuff.Mode.MULTIPLY);
                        }
                        org.telegram.ui.Components.fr frVar = this.F[1];
                        if (frVar != null) {
                            frVar.b(this.O1);
                            h5VarArr2[1].invalidate();
                        }
                        org.telegram.ui.Components.fr frVar2 = this.G[1];
                        if (frVar2 != null) {
                            frVar2.b(this.O1);
                            h5VarArr2[1].invalidate();
                        }
                        Y4(this.O1);
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.U.getLayoutParams();
                        layoutParams2.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.a.getMeasuredWidth() / this.X1, this.O1);
                        layoutParams2.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.M1 + currentActionBarHeight) / this.X1, this.O1);
                        this.U.requestLayout();
                        V4();
                    } else if (f13 <= f14) {
                        if (z11) {
                            this.X1 = AndroidUtilities.lerp(42, 96, y32) / 100.0f;
                            this.Y1 = 0.0f;
                            f10 = 1.0f;
                        } else {
                            org.telegram.ui.Components.eh0 eh0Var2 = this.p0;
                            this.X1 = AndroidUtilities.lerp((eh0Var2 == null || (notchInfo = eh0Var2.n) == null || !notchInfo.isLikelyCircle) ? 24.0f : (notchInfo.bounds.width() * 0.5f) / AndroidUtilities.density, 96.0f, y32) / 100.0f;
                            f10 = 1.0f;
                            this.Y1 = 1.0f - y32;
                        }
                        org.telegram.ui.Components.pg0 pg0Var = this.W;
                        if (pg0Var != null) {
                            if (this.C1) {
                                pg0Var.setAlpha(this.O1);
                            } else {
                                pg0Var.setAlpha(f10);
                            }
                        }
                        oy0 oy0Var3 = this.q0;
                        if (oy0Var3 != null) {
                            oy0Var3.invalidate();
                        }
                        gh.v0 v0Var3 = this.r0;
                        if (v0Var3 != null) {
                            v0Var3.h = this.C1;
                            float clamp01 = Utilities.clamp01((y32 - 0.3f) / 0.7f);
                            if (v0Var3.f != clamp01) {
                                v0Var3.f = clamp01;
                                v0Var3.invalidate();
                            }
                        }
                        float f18 = (0.12f * y32) + 1.0f;
                        ValueAnimator valueAnimator3 = this.f2;
                        if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                            this.U.setScaleX(this.X1);
                            this.U.setScaleY(this.X1);
                            N3();
                            this.U.setTranslationY((float) Math.ceil(this.W1));
                            float dp = (((this.X1 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
                            this.d0.setTranslationX(this.U.getX() + AndroidUtilities.dp(16.0f) + dp);
                            this.d0.setTranslationY(this.U.getY() + AndroidUtilities.dp(-10.0f) + dp);
                            this.e0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + dp);
                            this.e0.setTranslationY(this.U.getY() + AndroidUtilities.dp(26.5f) + dp);
                            this.f0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + dp);
                            this.f0.setTranslationY(this.U.getY() + AndroidUtilities.dp(24.0f) + dp);
                            this.g0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + dp);
                            this.g0.setTranslationY(this.U.getY() + AndroidUtilities.dp(24.0f) + dp);
                        } else {
                            ValueAnimator valueAnimator4 = this.f2;
                            yy0 yy0Var = this.E5;
                            valueAnimator4.removeListener(yy0Var);
                            this.f2.addListener(yy0Var);
                        }
                        float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (this.U.getScaleY() * this.U.getHeight())) * (this.C1 ? this.O1 : y32)) + ((float) Math.floor(translationY));
                        this.a2 = e2.c.z(1.0f, this.O1, 0.0f, (AndroidUtilities.dp(7.0f) * y32) + AndroidUtilities.dp(1.3f) + dpf2);
                        this.c2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * y32) + dpf2 + AndroidUtilities.dp(24.0f);
                        float dp2 = this.C1 ? (this.K5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f) : -AndroidUtilities.dpf2(46.0f);
                        g01 g01Var = this.X5;
                        if (g01Var != null) {
                            g01Var.setAlpha((int) (255.0f * y32));
                        }
                        int measuredWidth2 = this.a.getMeasuredWidth();
                        int i10 = 0;
                        boolean z14 = false;
                        while (i10 < h5VarArr2.length) {
                            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr2[i10];
                            if (h5Var == null) {
                                f11 = f18;
                            } else {
                                h5Var.setScaleX(f18);
                                h5VarArr2[i10].setScaleY(f18);
                                if (i10 == 1) {
                                    l4(0, y32, false);
                                    z14 = true;
                                }
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) h5VarArr2[i10].getLayoutParams();
                                float f19 = measuredWidth2;
                                float f20 = f19 / 2.0f;
                                float min2 = f20 - (((Math.min(h5VarArr2[i10].getExactWidth(), i10 == 1 ? layoutParams3.width : f19) * f18) * 0.5f) + layoutParams3.leftMargin);
                                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) h5VarArr[i10].getLayoutParams();
                                float f21 = layoutParams4.leftMargin;
                                float exactWidth = h5VarArr[this.l5 ? 3 : i10].getExactWidth();
                                f11 = f18;
                                if (i10 == 1) {
                                    f19 = layoutParams4.width;
                                }
                                float min3 = f20 - ((Math.min(exactWidth, f19) * 0.5f) + f21);
                                if (i10 == 1) {
                                    this.Z1 = min2;
                                    this.b2 = min3;
                                }
                                float lerp2 = AndroidUtilities.lerp(dp2, min2, y32);
                                float lerp3 = AndroidUtilities.lerp(dp2, min3, y32);
                                ValueAnimator valueAnimator5 = this.f2;
                                if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                                    h5VarArr2[i10].setTranslationX(lerp2);
                                    h5VarArr2[i10].setTranslationY(this.a2);
                                    h5VarArr[i10].setTranslationX(W3(lerp3));
                                    h5VarArr[i10].setTranslationY(X3(this.c2));
                                    i9 = 1;
                                    if (i10 == 1) {
                                        this.s.setTranslationX(lerp3);
                                    }
                                } else {
                                    i9 = 1;
                                }
                                if (i10 == i9) {
                                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) h5VarArr2[i9].getLayoutParams();
                                    int i11 = layoutParams5.width;
                                    int min4 = Math.min(layoutParams5.width, (int) ((((AndroidUtilities.isTablet() ? AndroidUtilities.dp(490.0f) : AndroidUtilities.displaySize.x) - AndroidUtilities.dp(18.0f)) / h5VarArr2[1].getScaleX()) - (h5VarArr2[1].getTranslationX() + layoutParams5.leftMargin)));
                                    layoutParams5.width = min4;
                                    if (min4 != i11) {
                                        h5VarArr2[1].requestLayout();
                                    }
                                }
                            }
                            i10++;
                            f18 = f11;
                        }
                        this.s.setTranslationY(this.c2);
                        V4();
                        z12 = z14;
                        if (!z12 && ((valueAnimator2 = this.f2) == null || !valueAnimator2.isRunning())) {
                            l4(0, y32, true);
                        }
                    }
                    z12 = false;
                    if (!z12) {
                        l4(0, y32, true);
                    }
                } else {
                    if (!this.l2) {
                        if (this.P0 != null) {
                            if (g4()) {
                                this.P0.r(21);
                            } else {
                                this.P0.K(21);
                            }
                            if (this.m0 != null) {
                                this.P0.K(36);
                                this.P0.K(34);
                                this.P0.K(35);
                                this.P0.r(33);
                                this.P0.r(31);
                            }
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = this.Q0;
                        if (w0Var3 != null) {
                            w0Var3.setEnabled(false);
                        }
                        this.l2 = true;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                        this.J.f(min, true);
                        this.k0.b(min);
                        this.j0.setCreateThumbFromParent(true);
                        this.j0.getAdapter().g();
                        this.f2.cancel();
                        float lerp4 = AndroidUtilities.lerp(fArr, this.h2);
                        fArr[0] = lerp4;
                        fArr[1] = 1.0f;
                        oy0 oy0Var4 = this.q0;
                        if (oy0Var4 == null || oy0Var4.w.isEmpty()) {
                            this.f2.setInterpolator(org.telegram.ui.Components.gr.j);
                            this.f2.setDuration((long) (((1.0f - lerp4) * 250.0f) / min));
                        } else {
                            this.f2.setInterpolator(new u1.a());
                            this.f2.setDuration((long) ((((1.0f - lerp4) * 1.3f) * 250.0f) / min));
                        }
                        this.f2.addListener(new yy0(this, 2));
                        View m10 = this.c.m(0);
                        if (!this.L1 && m10 != null) {
                            this.K1 = true;
                            this.a.w0(((m10.getTop() - this.a.getMeasuredWidth()) - O3()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0), (int) this.f2.getDuration(), (Interpolator) this.f2.getInterpolator());
                            this.a.J0 = false;
                        }
                        this.G5 = h5VarArr2[1].getTranslationY();
                        this.H5 = h5VarArr[1].getTranslationY();
                        this.f2.start();
                        this.j0.setAlpha(0.0f);
                        this.j0.setVisibility(0);
                        try {
                            this.U.performHapticFeedback(0, 1);
                        } catch (Exception unused2) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams6 = this.j0.getLayoutParams();
                    int i12 = layoutParams6.height;
                    layoutParams6.width = this.a.getMeasuredWidth();
                    float f22 = currentActionBarHeight + f13;
                    int i13 = (int) f22;
                    layoutParams6.height = i13;
                    if (i12 != i13) {
                        this.j0.requestLayout();
                    }
                    if (!this.f2.isRunning()) {
                        float dp3 = (this.C1 && this.F1 == 2) ? (-(1.0f - this.O1)) * AndroidUtilities.dp(50.0f) : 0.0f;
                        h5VarArr2[1].setTranslationX(AndroidUtilities.dpf2(18.0f) - h5VarArr2[1].getLeft());
                        h5VarArr2[1].setTranslationY((((f22 - O3()) - AndroidUtilities.dpf2(30.0f)) - h5VarArr2[1].getBottom()) + dp3);
                        h5VarArr[1].setTranslationX(W3(AndroidUtilities.dpf2(16.0f) - h5VarArr[1].getLeft()));
                        h5VarArr[1].setTranslationY(X3((((f22 - O3()) - AndroidUtilities.dpf2(10.0f)) - h5VarArr[1].getBottom()) + dp3));
                        this.s.setTranslationX(h5VarArr[1].getTranslationX());
                        this.s.setTranslationY(h5VarArr[1].getTranslationY());
                        V4();
                    }
                }
            }
            z11 = this.C1;
            if (!z11) {
            }
            if (f13 <= f14) {
            }
            z12 = false;
            if (!z12) {
            }
        }
        b5(currentActionBarHeight);
        if (y32 < 1.0f) {
            this.a0.setAlpha(1.0f);
        }
    }

    public final void k5() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.f0 == null || (imageView = this.g0) == null) {
            return;
        }
        if (!this.H1 || (chat = this.A2) == null || (chat.flags2 & 2048) == 0) {
            imageView.setTag(null);
            this.g0.setVisibility(8);
            this.f0.setTag(null);
            this.f0.setVisibility(8);
            return;
        }
        imageView.setTag(1);
        this.g0.setVisibility(0);
        this.f0.setTag(1);
        this.f0.setVisibility(0);
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
    public final void l4(int i9, float f10, boolean z10) {
        float scaleX;
        float f11;
        FrameLayout.LayoutParams layoutParams;
        int i10;
        ValueAnimator valueAnimator;
        float f12 = this.M1;
        float T3 = T3();
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f;
        if (f12 > T3 || ((valueAnimator = this.f2) != null && valueAnimator.isRunning())) {
            scaleX = h5VarArr[1].getScaleX();
        } else {
            if (f10 < 1.0f) {
                scaleX = 1.0f;
                f11 = 1.12f;
                int dp = !AndroidUtilities.isTablet() ? AndroidUtilities.dp(490.0f) : AndroidUtilities.displaySize.x;
                int i11 = !this.J0 ? 48 : 0;
                if (this.H0) {
                    i11 += 48;
                }
                if (this.I0) {
                    i11 += 48;
                }
                if (this.Q0 != null) {
                    i11 += 48;
                }
                int dp2 = dp - AndroidUtilities.dp((((1.0f - this.A5) * i11) + 40.0f) + ((!this.C1 ? 109 : 47) + 8));
                int i12 = (int) (dp2 / (i9 == 0 ? scaleX : 1.0f));
                int A = i9 == 0 ? i9 : org.telegram.messenger.ll.A(18.0f, 2, dp);
                if (i9 == 0) {
                    i9 = (int) (A / f11);
                }
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.i;
                int lerp = AndroidUtilities.lerp(i12, i9, grVar.getInterpolation(f10));
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) h5VarArr[1].getLayoutParams();
                int i13 = layoutParams2.width;
                layoutParams2.width = (int) Math.ceil(lerp);
                if (z10) {
                    layoutParams2.width = Math.min(layoutParams2.width, (int) (((dp - AndroidUtilities.dp(18.0f)) / h5VarArr[1].getScaleX()) - (h5VarArr[1].getTranslationX() + layoutParams2.leftMargin)));
                }
                if (z10 && layoutParams2.width != i13) {
                    h5VarArr[1].requestLayout();
                }
                int lerp2 = AndroidUtilities.lerp(dp2, A, grVar.getInterpolation(f10));
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.r;
                layoutParams = (FrameLayout.LayoutParams) h5VarArr2[1].getLayoutParams();
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
                i10 = layoutParams.width;
                int ceil = (int) Math.ceil(lerp2);
                layoutParams.width = ceil;
                layoutParams3.width = ceil;
                if (i10 == layoutParams.width) {
                    h5VarArr2[2].getLayoutParams().width = layoutParams.width;
                    h5VarArr2[2].requestLayout();
                    h5VarArr2[3].getLayoutParams().width = layoutParams.width;
                    h5VarArr2[3].requestLayout();
                    h5VarArr2[1].requestLayout();
                    this.s.requestLayout();
                    return;
                }
                return;
            }
            scaleX = Math.max(h5VarArr[1].getScaleX(), 1.12f);
        }
        f11 = scaleX;
        if (!AndroidUtilities.isTablet()) {
        }
        if (!this.J0) {
        }
        if (this.H0) {
        }
        if (this.I0) {
        }
        if (this.Q0 != null) {
        }
        int dp22 = dp - AndroidUtilities.dp((((1.0f - this.A5) * i11) + 40.0f) + ((!this.C1 ? 109 : 47) + 8));
        int i122 = (int) (dp22 / (i9 == 0 ? scaleX : 1.0f));
        if (i9 == 0) {
        }
        if (i9 == 0) {
        }
        org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.i;
        int lerp3 = AndroidUtilities.lerp(i122, i9, grVar2.getInterpolation(f10));
        FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) h5VarArr[1].getLayoutParams();
        int i132 = layoutParams22.width;
        layoutParams22.width = (int) Math.ceil(lerp3);
        if (z10) {
        }
        if (z10) {
            h5VarArr[1].requestLayout();
        }
        int lerp22 = AndroidUtilities.lerp(dp22, A, grVar2.getInterpolation(f10));
        org.telegram.ui.ActionBar.h5[] h5VarArr22 = this.r;
        layoutParams = (FrameLayout.LayoutParams) h5VarArr22[1].getLayoutParams();
        FrameLayout.LayoutParams layoutParams32 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        i10 = layoutParams.width;
        int ceil2 = (int) Math.ceil(lerp22);
        layoutParams.width = ceil2;
        layoutParams32.width = ceil2;
        if (i10 == layoutParams.width) {
        }
    }

    public final void l5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        if ((this.q0 == null && this.r0 == null) || (kVar = this.actionBar) == null) {
            return;
        }
        float f10 = kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0.0f;
        float width = this.actionBar.getWidth();
        float max = this.actionBar.getBackButton() != null ? Math.max(0.0f, this.actionBar.getBackButton().getRight()) : 0.0f;
        if (this.actionBar.A != null) {
            for (int i9 = 0; i9 < this.actionBar.A.getChildCount(); i9++) {
                View childAt = this.actionBar.A.getChildAt(i9);
                if (childAt.getAlpha() > 0.0f && childAt.getVisibility() == 0) {
                    float left = this.actionBar.A.getLeft() + ((int) childAt.getX());
                    if (left < width) {
                        width = AndroidUtilities.lerp(width, left, childAt.getAlpha());
                    }
                }
            }
        }
        oy0 oy0Var = this.q0;
        if (oy0Var != null) {
            float A = e2.c.A(this.actionBar.getHeight(), f10, 2.0f, f10);
            boolean z11 = Math.abs(max - oy0Var.b0) > 0.1f || Math.abs(width - oy0Var.c0) > 0.1f || Math.abs(A - oy0Var.d0) > 0.1f;
            oy0Var.b0 = max;
            oy0Var.c0 = width;
            if (z10) {
                oy0Var.i0.d(width, true);
            }
            oy0Var.d0 = A;
            if (z11) {
                oy0Var.invalidate();
            }
        }
        gh.v0 v0Var = this.r0;
        if (v0Var != null) {
            float A2 = e2.c.A(this.actionBar.getHeight(), f10, 2.0f, f10);
            int U3 = U3();
            boolean z12 = Math.abs(max - v0Var.r) > 0.1f || Math.abs(width - v0Var.s) > 0.1f || Math.abs(A2 - v0Var.v) > 0.1f;
            v0Var.r = max;
            v0Var.s = width;
            if (z10) {
                v0Var.y.d(width, true);
            }
            v0Var.v = A2;
            v0Var.x = U3 + A2;
            if (z12) {
                v0Var.invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
    
        if (r0.ttl_period > 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0025, code lost:
    
        if (r4.q2.ttl_period > 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5() {
        boolean z10;
        if (this.U0 == null) {
            return;
        }
        if (this.z2 == null) {
            TLRPC.UserFull userFull = this.r2;
            z10 = true;
            if (userFull != null) {
            }
            if (this.q2 != null) {
                if (ChatObject.canUserDoAdminAction(this.A2, 13)) {
                }
            }
        }
        z10 = false;
        AndroidUtilities.updateViewVisibilityAnimated(this.U0, z10, 0.8f, this.h5);
    }

    public final void n4(boolean z10) {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.a1));
        if (user == null) {
            return;
        }
        int i9 = 4;
        int i10 = 0;
        if (this.n2 && !MessagesController.isSupportUser(user)) {
            if (!this.g1 || z10) {
                org.telegram.ui.Components.y4.s(this, false, this.A2, user, this.z2 != null, true, false, true, new gx0(this, user));
                return;
            } else {
                getMessagesController().unblockPeer(this.a1, new cb0(this, i9));
                finishFragment();
                return;
            }
        }
        if (this.g1) {
            getMessagesController().unblockPeer(this.a1);
            if (org.telegram.ui.Components.oc.a(this)) {
                org.telegram.ui.Components.oc.d(this, false).j();
                return;
            }
            return;
        }
        if (this.h1) {
            org.telegram.ui.Components.y4.j0(this, this.a1, user, null, this.z2, false, null, new qa(this, i9), this.v0);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.v0);
        String string = LocaleController.getString(R.string.BlockUser);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new fx0(this, i10));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q7, this.v0));
        }
    }

    public final void n5(boolean z10) {
        boolean z11;
        TLRPC.ChatFull chatFull;
        float y32 = y3();
        int i9 = 1;
        this.D5 = y32 > 0.2f && !this.S1 && (this.m0 == null || this.K2 == -1);
        C3();
        org.telegram.ui.Components.pi0 pi0Var = this.v;
        if (pi0Var == null || pi0Var.getVisibility() == 8) {
            z11 = false;
        } else {
            this.v.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) + this.M1) + this.P1) - AndroidUtilities.dp(29.5f));
            z11 = y32 > 0.2f && !this.S1 && !this.o1 && (this.m0 == null || this.K2 == -1);
            if (z11 && this.b1 != 0) {
                z11 = (!ChatObject.isChannel(this.A2) || this.A2.megagroup || (chatFull = this.q2) == null || chatFull.linked_chat_id == 0 || (this.z3 == -1 && this.A3 == -1)) ? false : true;
            }
            if (!this.C1) {
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
                            this.w.playTogether(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.pi0, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.pi0, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.pi0, Float>) View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.pi0, Float>) View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.pi0, Float>) View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.pi0, Float>) View.ALPHA, 0.0f));
                        }
                        this.w.setDuration(150L);
                        this.w.addListener(new yy0(this, i9));
                        this.w.start();
                    } else {
                        this.v.setScaleX(z11 ? 1.0f : 0.2f);
                        this.v.setScaleY(z11 ? 1.0f : 0.2f);
                        this.v.setAlpha(z11 ? 1.0f : 0.0f);
                    }
                }
            }
        }
        oy0 oy0Var = this.q0;
        if (oy0Var != null) {
            float measuredWidth = this.V.getMeasuredWidth() - AndroidUtilities.dp(40.0f);
            int i10 = this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            oy0Var.e0 = measuredWidth;
            oy0Var.g0 = z11;
            oy0Var.f0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10;
            oy0Var.invalidate();
        }
        gh.v0 v0Var = this.r0;
        if (v0Var != null) {
            v0Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + this.M1 + this.P1);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean needDelayOpenAnimation() {
        return this.F1 == 0;
    }

    public final void o4(boolean z10) {
        if (this.a1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.a1));
            if (user != null) {
                TLRPC.UserFull userFull = this.r2;
                org.telegram.ui.Components.voip.e2.n(user, z10, userFull != null && userFull.video_calls_available, getParentActivity(), this.r2, getAccountInstance());
                return;
            }
            return;
        }
        if (this.b1 != 0) {
            if (getMessagesController().getGroupCall(this.b1, false) != null) {
                org.telegram.ui.Components.voip.e2.m(this.A2, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            TLRPC.Chat chat = this.A2;
            AccountInstance accountInstance = getAccountInstance();
            if (getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.g70.t(getParentActivity(), -chat.id, accountInstance, new org.telegram.ui.Components.hq0(chat, this, accountInstance, 2));
        }
    }

    public final void o5() {
        org.telegram.ui.Components.vq0 vq0Var;
        org.telegram.ui.Components.ur0 ur0Var;
        org.telegram.ui.Components.l80 l80Var;
        int v02;
        this.N5.clear();
        i01 i01Var = this.Z0;
        if (i01Var != null) {
            i01Var.a(this.M5, true);
        }
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.r;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
        if (h5Var != null) {
            h5VarArr[1].setTextColor(i0.a.d(this.g2, w3(h5Var.getTag() instanceof Integer ? org.telegram.ui.ActionBar.f6.v0(((Integer) h5VarArr[1].getTag()).intValue(), this.v0) : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B8, this.v0), Boolean.valueOf(this.F0[0])), -1275068417));
        }
        g01 g01Var = this.X5;
        if (g01Var != null) {
            g01Var.a(i0.a.d(this.g2, org.telegram.ui.ActionBar.f6.l1(0.5f, org.telegram.ui.ActionBar.f6.b(0.18f, -0.1f, this.Y0)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.C(i0.a.d(this.A5, this.M5 != null ? -1 : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v8, this.v0), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y8, this.v0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            MessagesController.PeerColor peerColor = this.M5;
            kVar2.A(i0.a.d(this.A5, peerColor != null ? 1090519039 : peerColor != null ? 553648127 : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f8, this.v0), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z8, this.v0)), false);
        }
        Drawable[] drawableArr = this.y;
        if (drawableArr[1] != null) {
            MessagesController.PeerColor peerColor2 = this.M5;
            if (peerColor2 != null) {
                v02 = org.telegram.ui.ActionBar.f6.b(0.1f, org.telegram.ui.ActionBar.f6.I.q() ? -0.1f : -0.08f, i0.a.d(0.4f, peerColor2.getColor2(), this.M5.hasColor6(org.telegram.ui.ActionBar.f6.I.q()) ? this.M5.getColor5() : this.M5.getColor3()));
            } else {
                v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, this.v0);
            }
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(v02, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oi, this.v0), this.A5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        Drawable[] drawableArr2 = this.E;
        if (drawableArr2[1] != null) {
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(this.M5 != null ? -1 : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ah, this.v0), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, this.v0), this.A5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f[1];
        if (h5Var2 != null) {
            h5Var2.setTextColor(i0.a.d(this.g2, i0.a.d(this.A5, this.M5 != null ? -1 : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.vh, this.v0), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oi, this.v0)), -1));
        }
        org.telegram.ui.Components.h8 h8Var = this.W0;
        if (h8Var != null && (l80Var = h8Var.e) != null) {
            l80Var.invalidate();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.M5 == null ? i0.a.d(this.O1, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.pc, this.v0), -1) : -1, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.hh0 hh0Var = this.Y;
        if (hh0Var != null) {
            hh0Var.setColor(this.M5);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.a, (d5.d) new nx0(this, 1));
        hz0 hz0Var = this.K;
        if (hz0Var != null && (ur0Var = hz0Var.E0) != null) {
            ur0Var.d();
        }
        hz0 hz0Var2 = this.K;
        if (hz0Var2 != null && (vq0Var = hz0Var2.R) != null) {
            vq0Var.m();
        }
        p5();
        X4();
        oy0 oy0Var = this.q0;
        if (oy0Var != null) {
            oy0Var.f(true, true);
        }
        gh.v0 v0Var = this.r0;
        if (v0Var != null) {
            v0Var.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        org.telegram.ui.Components.e40 e40Var = this.m0;
        if (e40Var != null) {
            e40Var.i(i9, i10, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.I;
        if (undoView != null) {
            undoView.e(0, true);
        }
        super.onBecomeFullyHidden();
        this.T5 = false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        p5();
        this.T5 = true;
        F3();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        View m10;
        org.telegram.ui.Components.hh0 hh0Var;
        org.telegram.ui.Components.pg0 pg0Var;
        super.onConfigurationChanged(configuration);
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.onConfigurationChanged(configuration);
        }
        f4();
        if (this.j2 && (pg0Var = this.W) != null) {
            pg0Var.i();
        }
        if (this.j2 && (hh0Var = this.Y) != null) {
            hh0Var.b();
        }
        if (this.j2 && this.l2 && (m10 = this.c.m(0)) != null) {
            this.a.scrollBy(0, m10.getTop() - T3());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new sh(this, 5));
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
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        m01 m01Var;
        org.telegram.ui.ActionBar.w0 w0Var;
        Object obj;
        org.telegram.ui.ActionBar.z zVar;
        org.telegram.ui.ActionBar.w0 k10;
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        float f10;
        gh.v0 v0Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        float f11;
        ly0 ly0Var;
        org.telegram.ui.Components.rg rgVar;
        boolean z12;
        TLRPC.Chat chat;
        yw ywVar;
        if (!this.E0) {
            j5();
            if (this.F1 != 0 && this.I1 && !this.l2 && !this.J1) {
                ImageView imageView = this.e0;
                if (imageView != null) {
                    imageView.setAlpha(1.0f);
                }
                ImageView imageView2 = this.d0;
                if (imageView2 != null) {
                    imageView2.setAlpha(1.0f);
                }
                ImageView imageView3 = this.g0;
                if (imageView3 != null) {
                    imageView3.setAlpha(1.0f);
                    this.g0.setScaleX(1.0f);
                    this.g0.setScaleY(1.0f);
                }
                ImageView imageView4 = this.f0;
                if (imageView4 != null) {
                    imageView4.setAlpha(1.0f);
                    this.f0.setScaleX(1.0f);
                    this.f0.setScaleY(1.0f);
                }
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                int i9 = 2;
                if (b5Var != null && b5Var.getFragmentStack().size() >= 2) {
                    Object obj2 = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    if (obj2 instanceof org.telegram.ui.Components.rg) {
                        this.c5 = (org.telegram.ui.Components.rg) obj2;
                    }
                    if ((obj2 instanceof dy) && (ywVar = ((dy) obj2).B3) != null) {
                        fx fxVar = ywVar.a;
                        if (e2.c.v(fxVar)) {
                            this.c5 = fxVar;
                        }
                    }
                }
                Object obj3 = this.c5;
                if (obj3 instanceof qn) {
                    kVar = ((org.telegram.ui.ActionBar.o2) obj3).getActionBar();
                    kVar.setSkipDrawChild(true);
                } else {
                    kVar = null;
                }
                org.telegram.ui.Components.rg rgVar2 = this.c5;
                boolean z13 = (rgVar2 instanceof qn) && ((qn) rgVar2).e != null;
                if (rgVar2 != null) {
                    ImageView imageView5 = this.e0;
                    if (imageView5 != null) {
                        if (!(rgVar2 instanceof qn) || (chat = ((qn) rgVar2).e) == null || chat.linked_community_id == 0) {
                            imageView5.setTag(null);
                            this.e0.setVisibility(8);
                        } else {
                            imageView5.setTag(1);
                            this.e0.setVisibility(0);
                        }
                    }
                    if (this.h0 != null) {
                        org.telegram.ui.Components.rg rgVar3 = this.c5;
                        if ((rgVar3 instanceof qn) && ChatObject.isMonoForum(((qn) rgVar3).e)) {
                            this.d0.setTag(null);
                            this.d0.setVisibility(8);
                        } else {
                            TLRPC.EncryptedChat encryptedChat = this.z2;
                            if (encryptedChat != null) {
                                this.h0.b(encryptedChat.ttl);
                                this.d0.setTag(1);
                                this.d0.setVisibility(0);
                            } else {
                                TLRPC.UserFull userFull = this.r2;
                                if (userFull != null) {
                                    this.h0.b(userFull.ttl_period);
                                    if (!this.G1 || this.r2.ttl_period == 0) {
                                        this.d0.setTag(null);
                                        this.d0.setVisibility(8);
                                    } else {
                                        this.d0.setTag(1);
                                        this.d0.setVisibility(0);
                                    }
                                } else {
                                    TLRPC.ChatFull chatFull = this.q2;
                                    if (chatFull != null) {
                                        this.h0.b(chatFull.ttl_period);
                                        if (!this.G1 || this.q2.ttl_period == 0) {
                                            this.d0.setTag(null);
                                            this.d0.setVisibility(8);
                                        } else {
                                            this.d0.setTag(1);
                                            this.d0.setVisibility(0);
                                        }
                                    } else {
                                        this.d0.setTag(null);
                                        this.d0.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                    k5();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(this.F1 == 2 ? 250L : 180L);
                this.a.setLayerType(2, null);
                org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
                if (n10.k(10) == null && this.L0 == null) {
                    this.L0 = n10.a(10, R.drawable.ic_ab_other);
                }
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.f;
                org.telegram.ui.ActionBar.h5[] h5VarArr3 = this.r;
                if (z10) {
                    this.K5 = 0.0f;
                    int i10 = 0;
                    while (i10 < 2) {
                        i10++;
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h5VarArr3[i10].getLayoutParams();
                        layoutParams.rightMargin = (int) ((AndroidUtilities.density * (-21.0f)) + AndroidUtilities.dp(8.0f));
                        h5VarArr3[i10].setLayoutParams(layoutParams);
                    }
                    if (this.F1 != 2) {
                        int ceil = (int) Math.ceil((AndroidUtilities.density * 21.0f) + (AndroidUtilities.displaySize.x - AndroidUtilities.dp(117.0f)));
                        float measureText = (h5VarArr2[1].getPaint().measureText(h5VarArr2[1].getText().toString()) * 1.12f) + h5VarArr2[1].getSideDrawablesSize();
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) h5VarArr2[1].getLayoutParams();
                        if (ceil < measureText) {
                            h5VarArr = h5VarArr2;
                            layoutParams2.width = (int) Math.ceil(r5 / 1.12f);
                        } else {
                            h5VarArr = h5VarArr2;
                            layoutParams2.width = -2;
                        }
                        h5VarArr[1].setLayoutParams(layoutParams2);
                        this.N1 = T3();
                    } else {
                        h5VarArr = h5VarArr2;
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) h5VarArr[1].getLayoutParams();
                        layoutParams3.width = (int) ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(32.0f)) / 1.38f);
                        h5VarArr[1].setLayoutParams(layoutParams3);
                    }
                    this.fragmentView.setBackgroundColor(0);
                    setAvatarAnimationProgress(0.0f);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 0.0f, 1.0f));
                    org.telegram.ui.Components.pi0 pi0Var = this.v;
                    if (pi0Var != null && pi0Var.getTag() == null) {
                        this.v.setScaleX(0.2f);
                        this.v.setScaleY(0.2f);
                        this.v.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.pi0, Float>) View.SCALE_X, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.pi0, Float>) View.SCALE_Y, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.pi0, Float>) View.ALPHA, 1.0f));
                    }
                    oy0 oy0Var = this.q0;
                    if (oy0Var != null && this.F1 == 2) {
                        oy0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.q0, (Property<oy0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.F1 == 2) {
                        this.n0 = P3(this.a0.getImageReceiver());
                        h5VarArr[1].setTextColor(-1);
                        h5VarArr3[1].setTextColor(-1275068417);
                        this.actionBar.A(1090519039, false);
                        g01 g01Var = this.X5;
                        if (g01Var != null) {
                            g01Var.a(603979775);
                        }
                        wz0 wz0Var = this.J;
                        wz0Var.A = true;
                        wz0Var.setVisibility(0);
                    }
                    int i11 = 0;
                    while (i11 < 2) {
                        h5VarArr[i11].setAlpha(i11 == 0 ? 1.0f : 0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(h5VarArr[i11], (Property<org.telegram.ui.ActionBar.h5, Float>) View.ALPHA, i11 == 0 ? 0.0f : 1.0f));
                        i11++;
                    }
                    if (this.q0 != null) {
                        if (a() > 0) {
                            this.q0.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.q0, (Property<oy0, Float>) View.ALPHA, 1.0f));
                        } else {
                            f10 = 1.0f;
                            this.q0.setAlpha(1.0f);
                            this.q0.setFragmentTransitionProgress(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.q0, "fragmentTransitionProgress", 1.0f));
                            v0Var = this.r0;
                            if (v0Var != null) {
                                v0Var.setAlpha(0.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.r0, (Property<gh.v0, Float>) View.ALPHA, f10));
                            }
                            if (this.d0.getTag() != null) {
                                arrayList.add(ObjectAnimator.ofFloat(this.d0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.d0, (Property<ImageView, Float>) View.SCALE_X, 0.85f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.d0, (Property<ImageView, Float>) View.SCALE_Y, 0.85f, 0.0f));
                            }
                            if (this.e0.getTag() != null) {
                                arrayList.add(ObjectAnimator.ofFloat(this.e0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.e0, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.e0, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f));
                            }
                            if (this.g0.getTag() != null) {
                                arrayList.add(ObjectAnimator.ofFloat(this.g0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.g0, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.g0, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f));
                            }
                            if (this.f0.getTag() != null) {
                                arrayList.add(ObjectAnimator.ofFloat(this.f0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.f0, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.f0, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f));
                            }
                            w0Var2 = this.L0;
                            if (w0Var2 != null) {
                                w0Var2.setAlpha(1.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.L0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 0.0f));
                            }
                            if (this.H0 && (this.b1 != 0 || z13)) {
                                this.M0.setAlpha(0.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.M0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 1.0f));
                            }
                            if (this.I0) {
                                this.N0.setAlpha(0.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.N0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 1.0f));
                            }
                            if (this.J0) {
                                this.O0.setAlpha(0.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.O0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 1.0f));
                            }
                            if (this.U0.getTag() == null) {
                                this.U0.setAlpha(0.0f);
                                f11 = 1.0f;
                                arrayList.add(ObjectAnimator.ofFloat(this.U0, (Property<ImageView, Float>) View.ALPHA, 1.0f));
                            } else {
                                f11 = 1.0f;
                            }
                            ly0Var = this.a0;
                            if (ly0Var != null) {
                                ly0Var.setCrossfadeProgress(f11);
                                arrayList.add(ObjectAnimator.ofFloat(this.a0, iz0.c0, 0.0f));
                            }
                            rgVar = this.c5;
                            if (rgVar == null) {
                                org.telegram.ui.Components.tn o6 = rgVar.o();
                                if (o6 != null) {
                                    org.telegram.ui.Components.pn pnVar = o6.e;
                                    org.telegram.ui.Components.xu0 z14 = this.c5.z();
                                    RectF rectF = pg.i.h;
                                    pg.i.c(pnVar, z14, rectF);
                                    this.K5 = rectF.left;
                                }
                                if ((o6 == null || !(o6.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.h5) || ((org.telegram.ui.ActionBar.h5) o6.getSubtitleTextView()).getLeftDrawable() == null) && !o6.O[0]) {
                                    z12 = false;
                                } else {
                                    this.S4 = o6.getSubtitleTextView();
                                    this.V.invalidate();
                                    h5VarArr3[0].setAlpha(0.0f);
                                    h5VarArr3[1].setAlpha(0.0f);
                                    arrayList.add(ObjectAnimator.ofFloat(h5VarArr3[1], (Property<org.telegram.ui.ActionBar.h5, Float>) View.ALPHA, 1.0f));
                                    z12 = true;
                                }
                                setAvatarAnimationProgress(0.0f);
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                int i12 = 0;
                                while (i12 < 2) {
                                    h5VarArr3[i12].setAlpha(i12 == 0 ? 1.0f : 0.0f);
                                    arrayList.add(ObjectAnimator.ofFloat(h5VarArr3[i12], (Property<org.telegram.ui.ActionBar.h5, Float>) View.ALPHA, i12 == 0 ? 0.0f : 1.0f));
                                    i12++;
                                }
                            }
                            animatorSet.playTogether(arrayList);
                        }
                    }
                    f10 = 1.0f;
                    v0Var = this.r0;
                    if (v0Var != null) {
                    }
                    if (this.d0.getTag() != null) {
                    }
                    if (this.e0.getTag() != null) {
                    }
                    if (this.g0.getTag() != null) {
                    }
                    if (this.f0.getTag() != null) {
                    }
                    w0Var2 = this.L0;
                    if (w0Var2 != null) {
                    }
                    if (this.H0) {
                        this.M0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.M0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.I0) {
                    }
                    if (this.J0) {
                    }
                    if (this.U0.getTag() == null) {
                    }
                    ly0Var = this.a0;
                    if (ly0Var != null) {
                    }
                    rgVar = this.c5;
                    if (rgVar == null) {
                    }
                    if (!z12) {
                    }
                    animatorSet.playTogether(arrayList);
                } else {
                    this.N1 = this.M1;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 1.0f, 0.0f));
                    org.telegram.ui.Components.pi0 pi0Var2 = this.v;
                    if (pi0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(pi0Var2, (Property<org.telegram.ui.Components.pi0, Float>) View.SCALE_X, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.pi0, Float>) View.SCALE_Y, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.pi0, Float>) View.ALPHA, 0.0f));
                    }
                    int i13 = 0;
                    while (i13 < 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(h5VarArr2[i13], (Property<org.telegram.ui.ActionBar.h5, Float>) View.ALPHA, i13 == 0 ? 1.0f : 0.0f));
                        i13++;
                    }
                    oy0 oy0Var2 = this.q0;
                    if (oy0Var2 != null) {
                        if (this.e1 > 0) {
                            arrayList2.add(ObjectAnimator.ofFloat(oy0Var2, (Property<oy0, Float>) View.ALPHA, 0.0f));
                        } else {
                            arrayList2.add(ObjectAnimator.ofFloat(oy0Var2, "fragmentTransitionProgress", 0.0f));
                        }
                    }
                    gh.v0 v0Var2 = this.r0;
                    if (v0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(v0Var2, (Property<gh.v0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.d0.getTag() != null) {
                        this.d0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.d0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.d0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 0.85f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.d0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 0.85f));
                    }
                    if (this.e0.getTag() != null) {
                        this.e0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.e0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.e0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.e0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.g0.getTag() != null) {
                        this.g0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.g0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.g0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.g0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.f0.getTag() != null) {
                        this.f0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f));
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.L0;
                    if (w0Var3 != null) {
                        w0Var3.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.L0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.H0 && (this.b1 != 0 || z13)) {
                        this.M0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.M0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.I0) {
                        this.N0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.N0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.J0) {
                        this.O0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.O0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 0.0f));
                    }
                    ImageView imageView6 = this.U0;
                    if (imageView6 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) View.ALPHA, imageView6.getAlpha(), 0.0f));
                    }
                    ly0 ly0Var2 = this.a0;
                    if (ly0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(ly0Var2, iz0.c0, 1.0f));
                    }
                    org.telegram.ui.ActionBar.o2 o2Var = this.parentLayout.getFragmentStack().size() > 1 ? (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) : null;
                    if (o2Var instanceof qn) {
                        qn qnVar = (qn) o2Var;
                        dj djVar = qnVar.W0;
                        AndroidUtilities.doOnPreDraw(djVar, new ye0(this, djVar, qnVar, 24));
                        View subtitleTextView = djVar.getSubtitleTextView();
                        if (((subtitleTextView instanceof org.telegram.ui.ActionBar.h5) && ((org.telegram.ui.ActionBar.h5) subtitleTextView).getLeftDrawable() != null) || djVar.O[0]) {
                            this.S4 = djVar.getSubtitleTextView();
                            this.V.invalidate();
                            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr3[0];
                            Property property = View.ALPHA;
                            arrayList2.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f));
                            arrayList2.add(ObjectAnimator.ofFloat(h5VarArr3[1], (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f));
                            z11 = true;
                            if (!z11) {
                                int i14 = 0;
                                while (i14 < 2) {
                                    arrayList2.add(ObjectAnimator.ofFloat(h5VarArr3[i14], (Property<org.telegram.ui.ActionBar.h5, Float>) View.ALPHA, i14 == 0 ? 1.0f : 0.0f));
                                    i14++;
                                }
                            }
                            animatorSet.playTogether(arrayList2);
                            m01Var = this.Y5;
                            if (m01Var != null) {
                                m01Var.animate().alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            }
                        }
                    }
                    z11 = false;
                    if (!z11) {
                    }
                    animatorSet.playTogether(arrayList2);
                    m01Var = this.Y5;
                    if (m01Var != null) {
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new kx0(this, i9));
                animatorSet.playTogether(ofFloat);
                if (this.K0 == null || (obj = this.c5) == null || (zVar = ((org.telegram.ui.ActionBar.o2) obj).getActionBar().A) == null || (k10 = zVar.k(32)) == null || k10.getVisibility() != 0) {
                    w0Var = null;
                } else {
                    k10.setAlpha(0.0f);
                    if (z10) {
                        this.K0.setVisibility(0);
                    }
                    this.K0.setTag(k10);
                    w0Var = k10;
                }
                animatorSet.addListener(new of.h0(this, kVar, w0Var, runnable, 4));
                animatorSet.setInterpolator(this.F1 == 2 ? org.telegram.ui.Components.gr.f : new DecelerateInterpolator());
                AndroidUtilities.runOnUIThread(new kt0(animatorSet, 4), 50L);
                return animatorSet;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onDialogDismiss(Dialog dialog) {
        by0 by0Var = this.a;
        if (by0Var != null) {
            by0Var.f1();
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
        org.telegram.ui.Components.wt0 wt0Var;
        vz0 vz0Var;
        this.a1 = this.arguments.getLong("user_id", 0L);
        this.b1 = this.arguments.getLong("chat_id", 0L);
        this.c1 = this.arguments.getLong("topic_id", 0L);
        this.d1 = this.arguments.getBoolean("saved", false);
        this.n1 = this.arguments.getBoolean("similar", false);
        this.m1 = this.c1 != 0;
        this.A1 = this.arguments.getLong("ban_chat_id", 0L);
        this.V4 = this.arguments.getInt("report_reaction_message_id", 0);
        this.W4 = this.arguments.getLong("report_reaction_from_dialog_id", 0L);
        this.Y4 = this.arguments.getBoolean("show_add_to_contacts", true);
        this.Z4 = ne.b.d(this.arguments.getString("vcard_phone"), false);
        this.a5 = this.arguments.getString("vcard_first_name");
        this.b5 = this.arguments.getString("vcard_last_name");
        this.h1 = this.arguments.getBoolean("reportSpam", false);
        this.o1 = this.arguments.getBoolean("my_profile", false);
        this.p1 = this.arguments.getBoolean("open_gifts", false);
        this.r1 = this.arguments.getBoolean("open_gifts_upgradable", false);
        this.q1 = this.arguments.getInt("open_gifts_collection", 0);
        this.t1 = this.arguments.getBoolean("open_common", false);
        this.u1 = this.arguments.getInt("open_story_album_id", -1);
        this.E0 = this.arguments.getBoolean("hasMainTabs", false);
        if (!this.j1) {
            boolean z10 = this.arguments.getBoolean("expandPhoto", false);
            this.j1 = z10;
            if (z10) {
                this.g2 = 1.0f;
                this.k1 = true;
            }
        }
        if (this.a1 == 0) {
            if (this.b1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.b1));
                this.A2 = chat;
                if (chat == null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    getMessagesStorage().getStorageQueue().postRunnable(new ys0(15, this, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (this.A2 != null) {
                        getMessagesController().putChat(this.A2, true);
                    }
                }
                FlagSecureReason flagSecureReason = this.T1;
                if (flagSecureReason != null) {
                    flagSecureReason.invalidate();
                }
                if (this.A2.megagroup) {
                    R3(true);
                } else {
                    this.y1 = null;
                }
                getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
                getNotificationCenter().addObserver(this, NotificationCenter.chatOnlineCountDidLoad);
                getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.uploadStoryEnd);
                this.y2 = new ArrayList();
                h5(true);
                if (this.q2 == null) {
                    this.q2 = getMessagesController().getChatFull(this.b1);
                }
                if (ChatObject.isChannel(this.A2)) {
                    getMessagesController().loadFullChat(this.b1, this.classGuid, true);
                } else if (this.q2 == null) {
                    this.q2 = getMessagesStorage().loadChatInfo(this.b1, false, null, false, false);
                }
                a5();
                clientUserId = getUserConfig().getClientUserId();
                if (this.a1 != clientUserId) {
                }
                this.o1 = true;
                wt0Var = this.N;
                if (wt0Var != null) {
                    wt0Var.b(this);
                    this.N = null;
                }
                if (this.N == null) {
                }
                this.N.x.add(this);
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
                vz0Var = this.d;
                if (vz0Var != null) {
                }
                if (this.arguments.containsKey("preload_messages")) {
                }
                if (this.a1 != 0) {
                    getConnectionsManager().sendRequest(new TL_account.getPassword(), new ox0(this, 5));
                }
                setBulletinDelegate(new x8(this, 8));
                if (this.a1 != 0) {
                    getMessagesController().getContentSettings(null);
                }
                I4();
                this.f6 = !this.E0 ? AndroidUtilities.dp(72.0f) : 0;
                this.g6 = this.E0 ? AndroidUtilities.dp(64.0f) : 0;
                return true;
            }
            return false;
        }
        long j10 = this.arguments.getLong("dialog_id", 0L);
        this.e1 = j10;
        if (j10 != 0) {
            this.z2 = org.telegram.messenger.l0.l(getMessagesController(), this.e1);
        }
        FlagSecureReason flagSecureReason2 = this.T1;
        if (flagSecureReason2 != null) {
            flagSecureReason2.invalidate();
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.a1));
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
            this.g1 = getMessagesController().blockePeers.indexOfKey(this.a1) >= 0;
            if (user.bot) {
                this.n2 = true;
                MediaDataController mediaDataController = getMediaDataController();
                long j11 = user.id;
                mediaDataController.loadBotInfo(j11, j11, true, this.classGuid);
            }
            this.r2 = getMessagesController().getUserFull(this.a1);
            getMessagesController().loadFullUser(getMessagesController().getUser(Long.valueOf(this.a1)), this.classGuid, true);
            this.y1 = null;
            if (UserObject.isUserSelf(user)) {
                org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(0, true, true);
                this.m0 = e40Var;
                e40Var.D = true;
                e40Var.a = this;
                e40Var.b = this;
                getMediaDataController().checkFeaturedStickers();
                getMessagesController().loadSuggestedFilters();
                getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, this.classGuid);
            }
            this.T4 = this.arguments.getInt("actionBarColor", 0);
            clientUserId = getUserConfig().getClientUserId();
            if ((this.a1 != clientUserId || this.e1 == clientUserId) && !this.o1) {
                this.o1 = true;
            }
            wt0Var = this.N;
            if (wt0Var != null && wt0Var.s != this.c1) {
                wt0Var.b(this);
                this.N = null;
            }
            if (this.N == null) {
                this.N = new org.telegram.ui.Components.wt0(this);
            }
            this.N.x.add(this);
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
            vz0Var = this.d;
            if (vz0Var != null) {
                vz0Var.l();
            }
            if (this.arguments.containsKey("preload_messages")) {
                getMessagesController().ensureMessagesLoaded(this.a1, 0, null);
            }
            if (this.a1 != 0 && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(this.a1)))) {
                getConnectionsManager().sendRequest(new TL_account.getPassword(), new ox0(this, 5));
            }
            setBulletinDelegate(new x8(this, 8));
            if (this.a1 != 0 && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(this.a1))) && !this.o1) {
                getMessagesController().getContentSettings(null);
            }
            I4();
            this.f6 = !this.E0 ? AndroidUtilities.dp(72.0f) : 0;
            this.g6 = this.E0 ? AndroidUtilities.dp(64.0f) : 0;
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.F0();
        }
        org.telegram.ui.Components.wt0 wt0Var = this.N;
        if (wt0Var != null) {
            wt0Var.b(this);
        }
        org.telegram.ui.Components.wt0 wt0Var2 = this.N;
        if (wt0Var2 != null) {
            wt0Var2.x.remove(this);
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
        my0 my0Var = this.j0;
        if (my0Var != null) {
            my0Var.K();
        }
        org.telegram.ui.Components.rg0 rg0Var = this.i0;
        if (rg0Var != null) {
            rg0Var.e();
        }
        this.F5 = null;
        if (this.a1 != 0) {
            getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.reloadInterface);
            getMessagesController().cancelLoadFullUser(this.a1);
        } else if (this.b1 != 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatOnlineCountDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        }
        ly0 ly0Var = this.a0;
        if (ly0Var != null) {
            ly0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.e40 e40Var = this.m0;
        if (e40Var != null) {
            e40Var.e();
        }
        qy0 qy0Var = this.R4;
        if (qy0Var != null) {
            qy0Var.b();
        }
        j01 j01Var = this.u2;
        if (j01Var != null && this.t2) {
            j01Var.b(true);
            this.u2 = null;
        }
        org.telegram.messenger.q8 q8Var = this.t5;
        if (q8Var != null) {
            this.t5 = null;
            AndroidUtilities.runOnUIThread(q8Var);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        org.telegram.ui.Components.ks0 ks0Var;
        super.onPause();
        UndoView undoView = this.I;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.e40 e40Var = this.m0;
        if (e40Var != null) {
            e40Var.j();
        }
        FlagSecureReason flagSecureReason = this.T1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        hz0 hz0Var = this.K;
        if (hz0Var == null || (ks0Var = hz0Var.P) == null) {
            return;
        }
        ks0Var.e = false;
        if (ks0Var.c != null) {
            ks0Var.a.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.e40 e40Var = this.m0;
        if (e40Var != null) {
            e40Var.k(i9, strArr, iArr);
        }
        if (i9 != 101 && i9 != 102) {
            if (i9 != 103 || this.A2 == null) {
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
                org.telegram.ui.Components.voip.e2.i(getParentActivity(), null, i9);
                return;
            } else {
                org.telegram.ui.Components.voip.e2.m(this.A2, null, getMessagesController().getGroupCall(this.b1, false) == null, null, getParentActivity(), this, getAccountInstance());
                return;
            }
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.a1));
        if (user == null) {
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
            org.telegram.ui.Components.voip.e2.i(getParentActivity(), null, i9);
            return;
        }
        boolean z12 = i9 == 102;
        TLRPC.UserFull userFull = this.r2;
        org.telegram.ui.Components.voip.e2.n(user, z12, userFull != null && userFull.video_calls_available, getParentActivity(), this.r2, getAccountInstance());
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        TLRPC.User user;
        yi0 yi0Var;
        super.onResume();
        hz0 hz0Var = this.K;
        if (hz0Var != null) {
            hz0Var.X0 = true;
            org.telegram.ui.Components.js0 js0Var = hz0Var.D;
            if (js0Var != null) {
                js0Var.l();
            }
            org.telegram.ui.Components.rt0 rt0Var = hz0Var.G;
            if (rt0Var != null) {
                rt0Var.l();
            }
            org.telegram.ui.Components.st0 st0Var = hz0Var.F;
            if (st0Var != null) {
                st0Var.X(false);
            }
            for (int i9 = 0; i9 < hz0Var.g0.length; i9++) {
                hz0Var.U(i9);
            }
            org.telegram.ui.Components.ks0 ks0Var = hz0Var.P;
            if (ks0Var != null) {
                ks0Var.e = true;
                if (ks0Var.c != null) {
                    ks0Var.a.onResume();
                }
            }
        }
        f4();
        vz0 vz0Var = this.d;
        if (vz0Var != null) {
            this.P4 = true;
            vz0Var.l();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (yi0Var = this.Q) != null && yi0Var.getVisibility() == 0) {
            this.Q.setVisibility(8);
            this.Q.setBackground(null);
        }
        org.telegram.ui.Components.e40 e40Var = this.m0;
        if (e40Var != null) {
            e40Var.l();
            setParentActivityTitle(LocaleController.getString(R.string.Settings));
        }
        i5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new sh(this, 5));
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f[1];
        if (h5Var != null) {
            setParentActivityTitle(h5Var.getText());
        }
        if (this.a1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.a1))) != null && user.photo == null && this.M1 >= T3()) {
            this.f2.cancel();
            float[] fArr = this.i2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            J4(1.0f);
            this.j0.setVisibility(8);
            this.M1 = T3();
            this.k2 = false;
            this.c.h1(0, T3() - this.a.getPaddingTop());
        }
        FlagSecureReason flagSecureReason = this.T1;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        c5();
        k4(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (!z11) {
                int i9 = this.F1;
                if (i9 != 0 && this.I1) {
                    if (i9 == 1) {
                        this.g2 = 0.0f;
                        org.telegram.ui.Components.qv0 qv0Var = this.P;
                        if (qv0Var != null) {
                            qv0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.pg0 pg0Var = this.W;
                        if (pg0Var != null) {
                            pg0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.hh0 hh0Var = this.Y;
                        if (hh0Var != null) {
                            hh0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.C1 = false;
                    A3();
                    if (this.E1) {
                        D3(true);
                    }
                }
                if (!this.h5) {
                    this.h5 = true;
                    this.Q4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().onAnimationFinish(this.L4);
            yi0 yi0Var = this.Q;
            if (yi0Var != null && yi0Var.getVisibility() == 0) {
                this.Q.setVisibility(8);
                this.Q.setBackground(null);
            }
        }
        this.D1 = false;
        B3();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        yi0 yi0Var = this.Q;
        if (yi0Var == null || yi0Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.Q.setAlpha(1.0f - f10);
        } else {
            this.Q.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        ImageView imageView;
        org.telegram.ui.Components.pg0 pg0Var;
        super.onTransitionAnimationStart(z10, z11);
        this.I5 = z10;
        if (z10 && (pg0Var = this.W) != null) {
            ArrayList arrayList = pg0Var.a;
            if (pg0Var.D == 6) {
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    org.telegram.ui.Components.mg0 mg0Var = (org.telegram.ui.Components.mg0) arrayList.get(i9);
                    org.telegram.ui.Components.mi0 mi0Var = mg0Var.k;
                    if (mi0Var != null) {
                        if (mg0Var.a == 15) {
                            mi0Var.K(14);
                        } else {
                            mi0Var.K(0);
                        }
                        mg0Var.k.start();
                    }
                }
            }
        }
        if (!z10 && (imageView = this.K0) != null && imageView.getTag() != null && (this.K0.getTag() instanceof org.telegram.ui.ActionBar.w0)) {
            ((org.telegram.ui.ActionBar.w0) this.K0.getTag()).setAlpha(1.0f);
        }
        if (((!z10 && z11) || (z10 && !z11)) && this.F1 != 0 && this.I1 && !this.l2) {
            this.C1 = true;
            if (!z10) {
                if (this.F5 == null) {
                    this.F5 = new float[16];
                }
                this.B1 = this.M1;
                this.F5[0] = this.U.getScaleX();
                this.F5[1] = this.U.getTranslationX();
                this.F5[2] = this.U.getTranslationY();
                org.telegram.ui.Components.pg0 pg0Var2 = this.W;
                if (pg0Var2 != null) {
                    this.F5[3] = pg0Var2.getAlpha();
                }
                gh.v0 v0Var = this.r0;
                if (v0Var != null) {
                    float[] fArr = this.F5;
                    fArr[4] = v0Var.e;
                    fArr[5] = v0Var.f;
                }
                if (this.X5 != null) {
                    this.F5[6] = r3.getAlpha();
                }
                float[] fArr2 = this.F5;
                org.telegram.ui.ActionBar.h5[] h5VarArr = this.f;
                fArr2[7] = h5VarArr[1].getScaleX();
                this.F5[8] = h5VarArr[1].getTranslationY();
                float[] fArr3 = this.F5;
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.r;
                fArr3[9] = h5VarArr2[1].getTranslationY();
                this.F5[10] = h5VarArr[1].getLayoutParams().width;
                this.F5[11] = this.Y1;
                for (int i10 = 0; i10 < h5VarArr.length; i10++) {
                    org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i10];
                    if (h5Var != null) {
                        int i11 = i10 * 2;
                        this.F5[i11 + 12] = h5Var.getTranslationX();
                        this.F5[i11 + 13] = h5VarArr2[i10].getTranslationX();
                    }
                }
                kh.x3 x3Var = this.Z5;
                if (x3Var != null) {
                    x3Var.e(true);
                }
            }
        }
        if (z10) {
            if (this.m0 != null) {
                this.L4 = getNotificationCenter().setAnimationInProgress(this.L4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.needCheckSystemBarColors});
            } else {
                this.L4 = getNotificationCenter().setAnimationInProgress(this.L4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.needCheckSystemBarColors});
            }
            if (!z11 && getParentActivity() != null) {
                this.U4 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.D1 = true;
        B3();
    }

    public final void p4() {
        TLRPC.UserFull userFull = this.r2;
        if (userFull == null || !UserObject.areGiftsDisabled(userFull)) {
            if (this.A2 != null) {
                org.telegram.ui.Components.t30.h.a();
            }
            showDialog(new fh.p2(getParentActivity(), this.currentAccount, a(), null, null));
        } else {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                org.telegram.ui.Components.oc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(a())))).j();
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
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.xh, this.v0);
            int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.yh, this.v0);
            int v04 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.wh, this.v0);
            if (this.M5 != null && org.telegram.ui.ActionBar.f6.b1(v02)) {
                v02 = org.telegram.ui.ActionBar.f6.b(0.05f, -0.04f, this.M5.getBgColor1(false));
                MessagesController.PeerColor peerColor = this.M5;
                if (peerColor != null) {
                    int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.f6.I.q());
                    v03 = org.telegram.ui.ActionBar.f6.C(org.telegram.ui.ActionBar.f6.I.q(), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v6, this.v0), bgColor2, v03, bgColor2);
                }
                v04 = -1;
            }
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(mutate, org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(56.0f), v02, v03), 0, 0);
            int dp = AndroidUtilities.dp(56.0f);
            int dp2 = AndroidUtilities.dp(56.0f);
            fqVar.e = dp;
            fqVar.f = dp2;
            this.v.setBackground(fqVar);
            this.v.setColorFilter(new PorterDuffColorFilter(v04, mode));
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.qs0
    public final boolean q() {
        return this.I5;
    }

    public final void q4(boolean z10) {
        boolean[] zArr = {true};
        getMessagesController().addUserToChat(this.A2.id, getUserConfig().getCurrentUser(), 0, null, this, true, new np0(this, z10, zArr, 3), new k9.b(this, zArr, z10, this.parentLayout.getLastFragment(), 5));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
    }

    public final void r4(View view, float f10, float f11, boolean z10) {
        float f12;
        float f13;
        long j10;
        long j11 = this.e1;
        if (j11 == 0) {
            j11 = this.a1;
            if (j11 == 0) {
                j11 = -this.b1;
            }
        }
        long j12 = j11;
        boolean isDialogMuted = getMessagesController().isDialogMuted(j12, this.c1);
        if (z10 && (this.m1 || isDialogMuted)) {
            boolean z11 = !isDialogMuted;
            getNotificationsController().muteDialog(j12, this.c1, z11);
            org.telegram.ui.Components.oc.A(this, z11, null).j();
            a5();
            this.W.setNotifications(isDialogMuted);
            return;
        }
        if ((z10 || !LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            org.telegram.ui.Components.fo foVar = new org.telegram.ui.Components.fo(getParentActivity(), this.currentAccount, null, true, new f2.d(this, j12, 8), this.v0);
            foVar.d(j12, this.c1, this.d5);
            if (AndroidUtilities.isTablet()) {
                ViewGroup view2 = this.parentLayout.getView();
                f12 = view2.getX() + view2.getPaddingLeft() + f10;
                f13 = view2.getY() + view2.getPaddingTop() + f11;
            } else {
                f12 = f10;
                f13 = f11;
            }
            if (z10) {
                f13 += this.W.getHeight() - AndroidUtilities.dp(12.0f);
            }
            foVar.c(this, view, f12, f13, z10);
            return;
        }
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
        boolean z12 = j5Var.e.h;
        boolean z13 = !z12;
        boolean isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j12, false, false);
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j12, this.c1);
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
            if (this.c1 == 0) {
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
            if (this.c1 == 0) {
                getMessagesStorage().setDialogFlags(j12, 0L);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j12);
                if (dialog2 != null) {
                    dialog2.notify_settings = new TLRPC.TL_peerNotifySettings();
                }
            }
            edit2.apply();
        }
        a5();
        getNotificationsController().updateServerNotificationsSettings(j12, this.c1);
        j5Var.setChecked(z13);
        g5(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.e40 e40Var = this.m0;
        if (e40Var != null) {
            e40Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.mg0
    public final void s() {
        this.a.x0(0);
    }

    public final void s4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.a1 != 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.a1));
                if (user == null) {
                    return;
                }
                if (this.B2 == null || (userFull = this.r2) == null || TextUtils.isEmpty(userFull.about)) {
                    str = String.format("https://" + getMessagesController().linkPrefix + "/%s", UserObject.getPublicUsername(user));
                } else {
                    str = String.format("%s https://" + getMessagesController().linkPrefix + "/%s", this.r2.about, UserObject.getPublicUsername(user));
                }
            } else if (this.b1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.b1));
                if (chat == null) {
                    return;
                }
                TLRPC.ChatFull chatFull = this.q2;
                if (chatFull == null || TextUtils.isEmpty(chatFull.about)) {
                    str = String.format("https://" + getMessagesController().linkPrefix + "/%s", ChatObject.getPublicUsername(chat));
                } else {
                    str = String.format("%s\nhttps://" + getMessagesController().linkPrefix + "/%s", this.q2.about, ChatObject.getPublicUsername(chat));
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.e40 e40Var = this.m0;
        if (e40Var == null || (str = e40Var.f) == null) {
            return;
        }
        bundle.putString("path", str);
    }

    public void setAvatarAnimationProgress(float f10) {
        int v02;
        int v03;
        int v04;
        this.g2 = f10;
        this.O1 = f10;
        B3();
        if (this.F1 == 2) {
            this.a0.setProgressToExpand(f10);
            org.telegram.ui.Components.pg0 pg0Var = this.W;
            if (pg0Var != null) {
                pg0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.hh0 hh0Var = this.Y;
            if (hh0Var != null) {
                hh0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.qv0 qv0Var = this.P;
            if (qv0Var != null) {
                qv0Var.setParentExpanded(f10);
            }
            S4();
            f5();
        }
        this.a.setAlpha(f10);
        this.a.setTranslationX(AndroidUtilities.dp(48.0f) - (AndroidUtilities.dp(48.0f) * f10));
        if (this.F1 != 2 || (v02 = this.n0) == 0) {
            if (this.a1 == 0 && ChatObject.isChannel(this.b1, this.currentAccount)) {
                boolean z10 = this.A2.megagroup;
            }
            org.telegram.ui.ActionBar.b6 b6Var = this.v0;
            int[][] iArr = org.telegram.ui.Components.z8.C;
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, b6Var);
        }
        int i9 = this.T4;
        if (i9 == 0) {
            i9 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.s8, this.v0);
        }
        this.Z0.setBackgroundColor(i0.a.d(f10, i0.a.k(i9, 0), v02));
        org.telegram.ui.Components.b11 b11Var = this.h0;
        int d = i0.a.d(f10, i9, v02);
        b11Var.k = true;
        b11Var.b.setColor(d);
        if (this.M5 != null) {
            v03 = -1;
        } else {
            if (this.a1 == 0 && ChatObject.isChannel(this.b1, this.currentAccount)) {
                boolean z11 = this.A2.megagroup;
            }
            org.telegram.ui.ActionBar.b6 b6Var2 = this.v0;
            int[][] iArr2 = org.telegram.ui.Components.z8.C;
            v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.g8, b6Var2);
        }
        this.actionBar.C(i0.a.d(this.O1, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v8, this.v0), v03), false);
        int v05 = this.M5 == null ? org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.vh, this.v0) : -1;
        int v06 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A8, this.v0);
        for (int i10 = 0; i10 < 2; i10++) {
            org.telegram.ui.ActionBar.h5 h5Var = this.f[i10];
            if (h5Var != null && (i10 != 1 || this.F1 != 2)) {
                h5Var.setTextColor(i0.a.d(f10, v06, v05));
            }
        }
        boolean[] zArr = this.F0;
        if (zArr[0]) {
            v04 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Bh, this.v0);
        } else {
            if (this.a1 == 0 && ChatObject.isChannel(this.b1, this.currentAccount)) {
                boolean z12 = this.A2.megagroup;
            }
            org.telegram.ui.ActionBar.b6 b6Var3 = this.v0;
            int[][] iArr3 = org.telegram.ui.Components.z8.C;
            v04 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h8, b6Var3);
        }
        int v07 = org.telegram.ui.ActionBar.f6.v0(zArr[0] ? org.telegram.ui.ActionBar.f6.pa : org.telegram.ui.ActionBar.f6.B8, this.v0);
        int i11 = 0;
        while (i11 < 3) {
            org.telegram.ui.ActionBar.h5 h5Var2 = this.r[i11];
            if (h5Var2 != null && i11 != 1 && (i11 != 2 || this.F1 != 2)) {
                h5Var2.setTextColor(i0.a.d(f10, i11 == 0 ? v07 : w3(v07, Boolean.valueOf(zArr[0])), i11 == 0 ? v04 : w3(v04, Boolean.valueOf(zArr[0]))));
            }
            i11++;
        }
        this.M1 = this.N1 * f10;
        long j10 = this.a1;
        if (j10 == 0) {
            j10 = this.b1;
        }
        org.telegram.ui.ActionBar.b6 b6Var4 = this.v0;
        int[][] iArr4 = org.telegram.ui.Components.z8.C;
        int v08 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[org.telegram.ui.Components.z8.e(j10)], b6Var4);
        long j11 = this.a1;
        if (j11 == 0) {
            j11 = this.b1;
        }
        int d9 = org.telegram.ui.Components.z8.d(j11);
        if (v08 != d9) {
            this.l0.h(i0.a.d(f10, d9, v08));
            this.a0.invalidate();
        }
        int i12 = this.U4;
        if (i12 != 0) {
            setNavigationBarColor(i0.a.d(f10, i12, getNavigationBarColor()));
        }
        this.Z0.invalidate();
        k4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        qz0 qz0Var = this.J5;
        if (qz0Var != null) {
            qz0Var.invalidate();
        }
        if (a() > 0) {
            ly0 ly0Var = this.a0;
            if (ly0Var != null) {
                ly0Var.setProgressToStoriesInsets(this.O1);
            }
            oy0 oy0Var = this.q0;
            if (oy0Var != null) {
                oy0Var.setProgressToStoriesInsets(this.O1);
            }
            gh.v0 v0Var = this.r0;
            if (v0Var != null) {
                v0Var.setProgressToStoriesInsets(this.O1);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void setParentLayout(org.telegram.ui.ActionBar.b5 b5Var) {
        super.setParentLayout(b5Var);
        FlagSecureReason flagSecureReason = this.T1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
            this.T1 = null;
        }
        if (b5Var == null || b5Var.getParentActivity() == null) {
            return;
        }
        this.T1 = new FlagSecureReason(b5Var.getParentActivity().getWindow(), new fx0(this, 6));
    }

    public final void t4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.H3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.b1);
            bundle.putLong("user_id", this.a1);
            presentFragment(new z11(bundle));
            return;
        }
        if (view2.getTag() == null || ((Integer) view2.getTag()).intValue() != this.Q2) {
            return;
        }
        if (this.a1 == getUserConfig().getClientUserId()) {
            presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
        } else if (UserObject.areGiftsDisabled(this.r2)) {
            org.telegram.ui.Components.oc.a0(this).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.a1)))).j();
        } else {
            showDialog(new fh.p2(getParentActivity(), this.currentAccount, this.a1, null, null));
        }
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ boolean u() {
        return false;
    }

    public final void u4() {
        org.telegram.ui.Components.mi0 mi0Var;
        if (this.a1 == 0) {
            y4();
            return;
        }
        if (this.m0 == null) {
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
        org.telegram.ui.Components.e40 e40Var = this.m0;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        e40Var.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new cb0(this, 24), new r5(this, 14), 0);
        this.R.K(0);
        this.R.N(43);
        this.S.K(0);
        this.S.N(43);
        org.telegram.ui.Components.pg0 pg0Var = this.W;
        if (pg0Var != null) {
            org.telegram.ui.Components.mg0 j10 = org.telegram.ui.Components.pg0.j(14, pg0Var.a);
            if (j10 != null && (mi0Var = j10.k) != null) {
                mi0Var.start();
            }
        } else {
            this.v.d();
        }
        org.telegram.ui.Cells.p8 p8Var = this.I2;
        if (p8Var != null) {
            p8Var.getImageView().d();
        }
    }

    @Override // org.telegram.ui.wx
    public final boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle i11 = aa.d.i("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j10)) {
            i11.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            i11.putLong("user_id", j10);
        } else if (DialogObject.isChatDialog(j10)) {
            i11.putLong("chat_id", -j10);
        }
        if (!getMessagesController().checkCanOpenChat(i11, dyVar)) {
            return false;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i12 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i12);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
        presentFragment(new qn(i11), true);
        removeSelfFromStack();
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(getMessagesController().getUser(Long.valueOf(this.a1)), j10, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z11, i9, i10));
        if (!TextUtils.isEmpty(charSequence)) {
            SendMessagesHelper.prepareSendingText(AccountInstance.getInstance(this.currentAccount), charSequence, j10, z11, i9, i10, 0L);
        }
        return true;
    }

    public final CharSequence v3(CharSequence charSequence) {
        if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.e1)) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityHiddenStatus));
        spannableStringBuilder.append((CharSequence) " * ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.qs(), length - 2, length - 1, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final void v4() {
        Bundle i9 = aa.d.i("addToGroup", true);
        i9.putLong("chatId", this.A2.id);
        k60 k60Var = new k60(i9);
        TLRPC.ChatFull chatFull = this.q2;
        k60Var.E = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i10 = 0; i10 < this.q2.participants.participants.size(); i10++) {
                hVar.k(null, this.q2.participants.participants.get(i10).user_id);
            }
            k60Var.F = hVar;
        }
        k60Var.x = new fx0(this, 9);
        presentFragment(k60Var);
    }

    public final int w3(int i9, Boolean bool) {
        if (this.M5 == null) {
            return i9;
        }
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.s8, this.v0);
        int d = i0.a.d(0.5f, this.M5.getStoryColor1(org.telegram.ui.ActionBar.f6.I.q()), this.M5.getStoryColor2(org.telegram.ui.ActionBar.f6.I.q()));
        if (org.telegram.ui.ActionBar.f6.b1(v02)) {
            return org.telegram.ui.ActionBar.f6.C(org.telegram.ui.ActionBar.f6.I.q(), v02, d, i9, (bool == null || bool.booleanValue()) ? d : org.telegram.ui.ActionBar.f6.l1(0.7f, d));
        }
        return (bool == null || bool.booleanValue()) ? d : org.telegram.ui.ActionBar.f6.b(-0.2f, 0.2f, org.telegram.ui.ActionBar.f6.l1(0.7f, d));
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
            my0 my0Var = this.j0;
            int realPosition = my0Var != null ? my0Var.getRealPosition() : 0;
            my0 my0Var2 = this.j0;
            ImageLocation imageLocation = null;
            ImageLocation G = my0Var2 != null ? my0Var2.G(realPosition) : null;
            my0 my0Var3 = this.j0;
            TLRPC.Photo F = my0Var3 != null ? my0Var3.F(realPosition) : null;
            long j10 = this.a1;
            wy0 wy0Var = this.g5;
            if (j10 == 0) {
                if (this.b1 == 0 || (chatPhoto = (chat = getMessagesController().getChat(Long.valueOf(this.b1))).photo) == null || chatPhoto.photo_big == null) {
                    return;
                }
                PhotoViewer.t1().K2(null, this, null);
                TLRPC.ChatPhoto chatPhoto2 = chat.photo;
                int i9 = chatPhoto2.dc_id;
                if (i9 != 0) {
                    chatPhoto2.photo_big.dc_id = i9;
                }
                if (G == null || (fileLocation = G.location) == null) {
                    fileLocation = chatPhoto2.photo_big;
                }
                TLRPC.FileLocation fileLocation3 = fileLocation;
                if (F == null && (chatFull = this.q2) != null) {
                    TLRPC.Photo photo2 = chatFull.chat_photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        F = photo2;
                    }
                }
                if (F != null && !F.video_sizes.isEmpty() && (closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(F.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) != null) {
                    imageLocation = ImageLocation.getForPhoto(closestVideoSizeWithSize, F);
                }
                PhotoViewer.t1().e2(null, fileLocation3, G, imageLocation, null, null, null, 0, wy0Var, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.a1));
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null) {
                return;
            }
            PhotoViewer.t1().K2(null, this, null);
            TLRPC.UserProfilePhoto userProfilePhoto2 = user.photo;
            int i10 = userProfilePhoto2.dc_id;
            if (i10 != 0) {
                userProfilePhoto2.photo_big.dc_id = i10;
            }
            if (G == null || (fileLocation2 = G.location) == null) {
                fileLocation2 = userProfilePhoto2.photo_big;
            }
            TLRPC.FileLocation fileLocation4 = fileLocation2;
            if (F == null && (userFull = this.r2) != null) {
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
            PhotoViewer.t1().e2(null, fileLocation4, G, imageLocation, null, null, null, 0, wy0Var, null, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void x3() {
        if (this.F5 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f2;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f2.cancel();
        }
        float clamp01 = Utilities.clamp01(this.M1 / this.B1);
        if (clamp01 <= 0.0f) {
            return;
        }
        float f10 = (clamp01 - 0.5f) / 0.5f;
        float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f));
        this.X1 = AndroidUtilities.lerp(0.42f, this.F5[0], clamp01);
        this.V1 = AndroidUtilities.lerp(this.K5, this.F5[1], clamp01);
        this.W1 = AndroidUtilities.lerp(translationY, this.F5[2], clamp01);
        this.Y1 = AndroidUtilities.lerp(this.F5[11], 0.0f, clamp01);
        this.U.setScaleX(this.X1);
        this.U.setScaleY(this.X1);
        this.U.setTranslationX(this.V1);
        this.U.setTranslationY(this.W1);
        org.telegram.ui.Components.qv0 qv0Var = this.P;
        if (qv0Var != null) {
            qv0Var.setAlpha(clamp01);
        }
        this.a0.setAlpha(1.0f);
        this.U.setAlpha(1.0f);
        oy0 oy0Var = this.q0;
        if (oy0Var != null) {
            oy0Var.invalidate();
        }
        gh.v0 v0Var = this.r0;
        if (v0Var != null) {
            v0Var.e = AndroidUtilities.lerp(0.0f, this.F5[4], f10);
            this.r0.f = AndroidUtilities.lerp(0.0f, this.F5[5], clamp01);
            gh.v0 v0Var2 = this.r0;
            v0Var2.h = true;
            v0Var2.invalidate();
        }
        g01 g01Var = this.X5;
        if (g01Var != null) {
            g01Var.setAlpha((int) AndroidUtilities.lerp(0.0f, this.F5[6], clamp01));
        }
        float dp = (((this.X1 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
        this.d0.setTranslationX(this.U.getX() + AndroidUtilities.dp(16.0f) + dp);
        this.d0.setTranslationY(this.U.getY() + AndroidUtilities.dp(-10.0f) + dp);
        this.e0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + dp);
        this.e0.setTranslationY(this.U.getY() + AndroidUtilities.dp(26.5f) + dp);
        this.f0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + dp);
        this.f0.setTranslationY(this.U.getY() + AndroidUtilities.dp(24.0f) + dp);
        this.g0.setTranslationX(this.U.getX() + AndroidUtilities.dp(28.0f) + dp);
        this.g0.setTranslationY(this.U.getY() + AndroidUtilities.dp(24.0f) + dp);
        float lerp = AndroidUtilities.lerp(1.0f, this.F5[7], clamp01);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
        float dpf2 = AndroidUtilities.dpf2(22.7f) + floor;
        this.a2 = AndroidUtilities.lerp(floor, this.F5[8], clamp01);
        this.c2 = AndroidUtilities.lerp(dpf2, this.F5[9], clamp01);
        int i9 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.f;
            if (i9 >= h5VarArr.length) {
                break;
            }
            if (h5VarArr[i9] != null) {
                int i10 = i9 * 2;
                float lerp2 = AndroidUtilities.lerp((this.K5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.F5[i10 + 12], clamp01);
                float lerp3 = AndroidUtilities.lerp((this.K5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.F5[i10 + 13], clamp01);
                h5VarArr[i9].setTranslationX(lerp2);
                h5VarArr[i9].setTranslationY(this.a2);
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = this.r;
                h5VarArr2[i9].setTranslationX(this.k5 + lerp3);
                h5VarArr2[i9].setTranslationY(this.c2);
                if (i9 == 1) {
                    this.Z1 = lerp2;
                    this.b2 = lerp3;
                    this.s.setTranslationX(lerp3);
                    this.s.setTranslationY(this.c2);
                }
                h5VarArr[i9].setScaleX(lerp);
                h5VarArr[i9].setScaleY(lerp);
            }
            i9++;
        }
        V4();
        b5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        l4((int) this.F5[10], clamp01, true);
        org.telegram.ui.Components.pg0 pg0Var = this.W;
        if (pg0Var != null) {
            pg0Var.setAlpha(AndroidUtilities.lerp(0.0f, this.F5[3], f10));
        }
    }

    public final void x4() {
        TLRPC.User user;
        if (this.a1 == 0 || M3() || (user = getMessagesController().getUser(Long.valueOf(this.a1))) == null || (user instanceof TLRPC.TL_userEmpty)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a1);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            boolean z10 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
            if (!AndroidUtilities.isTablet() && z10) {
                NotificationCenter notificationCenter = getNotificationCenter();
                int i9 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(this, i9);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i9, new Object[0]);
            }
            int i10 = getArguments().getInt("nearby_distance", -1);
            if (i10 >= 0) {
                bundle.putInt("nearby_distance", i10);
            }
            qn qnVar = new qn(bundle);
            qnVar.x9 = getMediaDataController().getGreetingsSticker();
            qnVar.y9 = false;
            presentFragment(qnVar, z10);
            if (!AndroidUtilities.isTablet() || this.E0) {
                return;
            }
            finishFragment();
        }
    }

    @Override // org.telegram.ui.mg0
    public final ng.d y() {
        return this.j6;
    }

    public final float y3() {
        return Utilities.clamp01((this.M1 - O3()) / U3());
    }

    public final void y4() {
        TLRPC.ChatFull chatFull = this.q2;
        if (chatFull == null || chatFull.linked_chat_id == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.q2.linked_chat_id);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new qn(bundle));
        }
    }

    public final void z3() {
        int i9 = 0;
        this.W1 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f));
        this.X1 = 1.38f;
        this.Y1 = 0.0f;
        N3();
        D4();
        l4(0, 1.0f, true);
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.f;
            if (i9 >= h5VarArr.length) {
                break;
            }
            if (h5VarArr[i9] != null) {
                float measuredWidth = (this.a.getMeasuredWidth() / 2.0f) - (((h5VarArr[i9].getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) r4.getLayoutParams()).leftMargin);
                float measuredWidth2 = (this.a.getMeasuredWidth() / 2.0f) - ((this.r[i9].getExactWidth() * 0.5f) + ((FrameLayout.LayoutParams) r3[i9].getLayoutParams()).leftMargin);
                if (i9 == 1) {
                    this.Z1 = measuredWidth;
                    this.b2 = measuredWidth2;
                }
            }
            i9++;
        }
        if (this.F1 != 2) {
            this.q0.setAlpha(1.0f);
        }
        this.U.setAlpha(1.0f);
        this.a0.setAlpha(1.0f);
    }

    public final void z4(boolean z10) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.r2;
        if (userFull == null || (tL_businessLocation = userFull.business_location) == null) {
            return;
        }
        if (tL_businessLocation.geo_point == null || z10) {
            String str = BuildVars.isHuaweiStoreApp() ? "mapapp://navigation" : "http://maps.google.com/maps";
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str + "?q=" + this.r2.business_location.address, new Object[0]))));
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        ih.m8 m8Var = new ih.m8(3, 1);
        m8Var.setResourceProvider(this.v0);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.local_id = -1;
        tL_message.peer_id = getMessagesController().getPeer(a());
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_businessLocation tL_businessLocation2 = this.r2.business_location;
        tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
        tL_messageMediaGeo.address = tL_businessLocation2.address;
        tL_message.media = tL_messageMediaGeo;
        m8Var.K0 = false;
        m8Var.t0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
        presentFragment(m8Var);
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.wt0 wt0Var) {
        super(bundle);
        this.f = new org.telegram.ui.ActionBar.h5[2];
        this.h = null;
        this.n = null;
        this.r = new org.telegram.ui.ActionBar.h5[4];
        this.y = new Drawable[2];
        this.A = new Drawable[2];
        this.C = new org.telegram.ui.Components.i5[2];
        this.D = new org.telegram.ui.Components.i5[2];
        this.E = new Drawable[2];
        this.F = new org.telegram.ui.Components.fr[2];
        this.G = new org.telegram.ui.Components.fr[2];
        this.s0 = null;
        this.t0 = new org.telegram.ui.Components.p40(this, 1);
        this.u0 = new Paint(1);
        this.F0 = new boolean[1];
        this.X0 = 1.0f;
        this.y1 = new a0.h();
        this.I1 = true;
        this.J1 = false;
        this.K1 = false;
        this.L1 = false;
        this.U1 = new HashMap();
        this.i2 = new float[]{0.0f, 1.0f};
        this.m2 = new Paint();
        this.x2 = -1;
        this.H2 = new Rect();
        this.M4 = new ArrayList();
        this.N4 = new ArrayList();
        this.O4 = 0;
        this.P4 = true;
        this.Q4 = true;
        this.T4 = 0;
        this.U4 = 0;
        this.V4 = 0;
        this.W4 = 0L;
        this.d5 = new HashSet();
        this.f5 = new org.telegram.ui.Cells.c2(this);
        this.g5 = new wy0(this);
        this.w5 = new td.a(0, new fx0(this, 8), org.telegram.ui.Components.gr.h, 380L, true);
        this.C5 = new xy0(this);
        this.E5 = new yy0(this, 0);
        this.F5 = null;
        this.N5 = new SparseIntArray();
        this.P5 = null;
        this.Q5 = -1;
        this.U5 = -1.0f;
        ng.b bVar = new ng.b();
        this.l6 = bVar;
        ig.a aVar = new ig.a(bVar);
        this.m6 = aVar;
        ArrayList arrayList = new ArrayList();
        this.p6 = arrayList;
        RectF rectF = new RectF();
        this.q6 = rectF;
        RectF rectF2 = new RectF();
        this.r6 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.N = wt0Var;
        ng.c cVar = new ng.c();
        cVar.a(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, this.v0));
        if (Build.VERSION.SDK_INT >= 31) {
            this.i6 = new ig.e(false);
            ng.d dVar = new ng.d(null);
            this.j6 = dVar;
            ig.a aVar2 = new ig.a(dVar);
            this.k6 = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
        } else {
            this.i6 = null;
            this.j6 = null;
            this.k6 = new ig.a(cVar);
        }
        aVar.c = new xd.b(true);
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ void O() {
    }
}
