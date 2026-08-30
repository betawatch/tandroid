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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class ProfileActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, iy, org.telegram.ui.Components.ru0, org.telegram.ui.Components.v40, org.telegram.ui.Components.jt0, ug0 {
    public int A0;
    public boolean A1;
    public TLRPC.EncryptedChat A2;
    public int A3;
    public int A4;
    public AnimatorSet A5;
    public final Drawable[] B;
    public int B0;
    public long B1;
    public TLRPC.Chat B2;
    public int B3;
    public int B4;
    public float B5;
    public Long C;
    public boolean C0;
    public float C1;
    public TL_bots.BotInfo C2;
    public int C3;
    public int C4;
    public boolean C5;
    public final org.telegram.ui.Components.j5[] D;
    public boolean D0;
    public boolean D1;
    public TLRPC.ChannelParticipant D2;
    public int D3;
    public int D4;
    public final iz0 D5;
    public final org.telegram.ui.Components.j5[] E;
    public boolean E0;
    public boolean E1;
    public TL_account.TL_password E2;
    public int E3;
    public int E4;
    public boolean E5;
    public final Drawable[] F;
    public boolean F0;
    public boolean F1;
    public TLRPC.FileLocation F2;
    public int F3;
    public boolean F4;
    public final jz0 F5;
    public final org.telegram.ui.Components.mr[] G;
    public final boolean[] G0;
    public int G1;
    public TLRPC.FileLocation G2;
    public int G3;
    public int G4;
    public float[] G5;
    public final org.telegram.ui.Components.mr[] H;
    public boolean H0;
    public boolean H1;
    public ImageLocation H2;
    public int H3;
    public int H4;
    public float H5;
    public org.telegram.ui.Components.fm0 I;
    public boolean I0;
    public boolean I1;
    public final Rect I2;
    public int I3;
    public int I4;
    public float I5;
    public UndoView J;
    public boolean J0;
    public boolean J1;
    public org.telegram.ui.Cells.o8 J2;
    public int J3;
    public int J4;
    public boolean J5;
    public h01 K;
    public boolean K0;
    public boolean K1;
    public int K2;
    public int K3;
    public boolean K4;
    public b01 K5;
    public sz0 L;
    public ImageView L0;
    public boolean L1;
    public int L2;
    public int L3;
    public boolean L4;
    public float L5;
    public org.telegram.ui.Components.zw0 M;
    public org.telegram.ui.ActionBar.w0 M0;
    public boolean M1;
    public int M2;
    public int M3;
    public int M4;
    public float M5;
    public boolean N;
    public org.telegram.ui.ActionBar.w0 N0;
    public float N1;
    public int N2;
    public int N3;
    public final ArrayList N4;
    public MessagesController.PeerColor N5;
    public org.telegram.ui.Components.qu0 O;
    public org.telegram.ui.ActionBar.w0 O0;
    public float O1;
    public int O2;
    public int O3;
    public final ArrayList O4;
    public final SparseIntArray O5;
    public boolean P;
    public org.telegram.ui.ActionBar.w0 P0;
    public float P1;
    public int P2;
    public int P3;
    public int P4;
    public int P5;
    public org.telegram.ui.Components.jw0 Q;
    public org.telegram.ui.ActionBar.w0 Q0;
    public int Q1;
    public int Q2;
    public int Q3;
    public boolean Q4;
    public AnimatorSet Q5;
    public gw0 R;
    public org.telegram.ui.ActionBar.w0 R0;
    public float R1;
    public int R2;
    public int R3;
    public boolean R4;
    public int R5;
    public org.telegram.ui.Components.gj0 S;
    public org.telegram.ui.ActionBar.g1 S0;
    public ValueAnimator S1;
    public int S2;
    public int S3;
    public bz0 S4;
    public int S5;
    public org.telegram.ui.Components.gj0 T;
    public org.telegram.ui.ActionBar.g1 T0;
    public boolean T1;
    public int T2;
    public int T3;
    public View T4;
    public boolean T5;
    public org.telegram.ui.Components.k40 U;
    public org.telegram.ui.ActionBar.g1 U0;
    public FlagSecureReason U1;
    public int U2;
    public int U3;
    public int U4;
    public boolean U5;
    public l0 V;
    public ImageView V0;
    public final HashMap V1;
    public int V2;
    public int V3;
    public int V4;
    public float V5;
    public ah.d W;
    public org.telegram.ui.ActionBar.g1 W0;
    public float W1;
    public int W2;
    public int W3;
    public int W4;
    public float W5;
    public org.telegram.ui.Components.jh0 X;
    public org.telegram.ui.Components.h8 X0;
    public float X1;
    public int X2;
    public int X3;
    public long X4;
    public float X5;
    public MessagesController.SavedMusicList Y;
    public float Y0;
    public float Y1;
    public int Y2;
    public int Y3;
    public boolean Y4;
    public s01 Y5;
    public org.telegram.ui.Components.ci0 Z;
    public int Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public boolean Z4;
    public y01 Z5;
    public my0 a;
    public org.telegram.ui.Cells.o a0;
    public u01 a1;
    public float a2;
    public int a3;
    public int a4;
    public String a5;
    public ph.f3 a6;
    public org.telegram.ui.Components.sl0 b;
    public wy0 b0;
    public long b1;
    public float b2;
    public int b3;
    public int b4;
    public String b5;
    public int b6;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionLocation;
    public oy0 c;
    public AnimatorSet c0;
    public long c1;
    public float c2;
    public int c3;
    public int c4;
    public String c5;
    public Boolean c6;
    public g01 d;
    public org.telegram.ui.Cells.y3 d0;
    public long d1;
    public float d2;
    public int d3;
    public int d4;
    public org.telegram.ui.Components.rg d5;
    public TLRPC.TL_emojiStatusCollectible d6;
    public r01 e;
    public ImageView e0;
    public boolean e1;
    public float e2;
    public int e3;
    public int e4;
    public final HashSet e5;
    public int e6;
    public final org.telegram.ui.ActionBar.k5[] f;
    public ImageView f0;
    public long f1;
    public float f2;
    public int f3;
    public int f4;
    public CharacterStyle f5;
    public boolean f6;
    public ImageView g0;
    public boolean g1;
    public ValueAnimator g2;
    public int g3;
    public int g4;
    public final org.telegram.ui.Cells.c2 g5;
    public int g6;
    public String h;
    public ImageView h0;
    public boolean h1;
    public float h2;
    public int h3;
    public int h4;
    public final hz0 h5;
    public int h6;
    public org.telegram.ui.Components.x11 i0;
    public boolean i1;
    public float i2;
    public int i3;
    public int i4;
    public boolean i5;
    public int i6;
    public org.telegram.ui.Components.mh0 j0;
    public long j1;
    public final float[] j2;
    public int j3;
    public int j4;
    public qz0 j5;
    public final ng.e j6;
    public xy0 k0;
    public boolean k1;
    public boolean k2;
    public int k3;
    public int k4;
    public float k5;
    public final sg.d k6;
    public j01 l0;
    public boolean l1;
    public boolean l2;
    public int l3;
    public int l4;
    public float l5;
    public final ng.a l6;
    public org.telegram.ui.Components.z8 m0;
    public boolean m1;
    public boolean m2;
    public int m3;
    public int m4;
    public boolean m5;
    public final sg.b m6;
    public String n;
    public org.telegram.ui.Components.w40 n0;
    public boolean n1;
    public final Paint n2;
    public int n3;
    public int n4;
    public boolean n5;
    public final ng.a n6;
    public int o0;
    public boolean o1;
    public boolean o2;
    public int o3;
    public int o4;
    public ImageReceiver o5;
    public ug.i o6;
    public org.telegram.ui.Components.x11 p0;
    public boolean p1;
    public rh.r0 p2;
    public int p3;
    public int p4;
    public FrameLayout p5;
    public ay0 p6;
    public org.telegram.ui.Components.zh0 q0;
    public boolean q1;
    public rh.q q2;
    public int q3;
    public int q4;
    public FrameLayout[] q5;
    public final ArrayList q6;
    public final org.telegram.ui.ActionBar.k5[] r;
    public zy0 r0;
    public int r1;
    public TLRPC.ChatFull r2;
    public int r3;
    public int r4;
    public SpannableStringBuilder r5;
    public final RectF r6;
    public org.telegram.ui.Components.io0 s;
    public lh.u0 s0;
    public boolean s1;
    public TLRPC.UserFull s2;
    public int s3;
    public int s4;
    public SpannableStringBuilder s5;
    public final RectF s6;
    public View t0;
    public boolean t1;
    public org.telegram.ui.Cells.f6 t2;
    public int t3;
    public int t4;
    public ph.d[] t5;
    public final org.telegram.ui.Components.i50 u0;
    public boolean u1;
    public boolean u2;
    public int u3;
    public int u4;
    public org.telegram.messenger.w8 u5;
    public org.telegram.ui.Components.jj0 v;
    public final Paint v0;
    public int v1;
    public v01 v2;
    public int v3;
    public int v4;
    public FrameLayout v5;
    public AnimatorSet w;
    public org.telegram.ui.ActionBar.f6 w0;
    public boolean w1;
    public CharSequence w2;
    public int w3;
    public int w4;
    public ph.d w5;
    public Drawable x;
    public int x0;
    public boolean x1;
    public long x2;
    public int x3;
    public int x4;
    public final xd.a x5;
    public final Drawable[] y;
    public ImageLocation y0;
    public boolean y1;
    public int y2;
    public int y3;
    public int y4;
    public dz0 y5;
    public int z0;
    public a0.h z1;
    public ArrayList z2;
    public int z3;
    public int z4;
    public AnimatorSet z5;

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public static void B0(ProfileActivity profileActivity) {
        RectF rectF = profileActivity.s6;
        ng.e eVar = profileActivity.j6;
        if (Build.VERSION.SDK_INT < 31 || eVar == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (profileActivity.fragmentView.getMeasuredHeight() - profileActivity.i6) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        profileActivity.r6.set(0.0f, -dp, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.actionBar.getMeasuredHeight() + dp);
        rectF.set(0.0f, dp2, profileActivity.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(2, profileActivity.q6);
        eVar.e(profileActivity.p6, profileActivity.fragmentView.getMeasuredWidth(), profileActivity.fragmentView.getMeasuredHeight());
    }

    public static void G0(ProfileActivity profileActivity, int i10) {
        boolean w02 = org.telegram.ui.Components.yu0.w0(profileActivity.L.getClosestTab());
        if (i10 == profileActivity.e6 && w02 == profileActivity.f6) {
            return;
        }
        profileActivity.e6 = i10;
        profileActivity.f6 = w02;
        if (w02) {
            if (i10 > 0) {
                profileActivity.t5[0].g(LocaleController.formatPluralString("HideStoriesFromAlbum", i10, new Object[0]), true, true);
                return;
            } else {
                profileActivity.t5[0].g(profileActivity.s5, true, true);
                return;
            }
        }
        if (i10 > 0 || !MessagesController.getInstance(profileActivity.currentAccount).storiesEnabled()) {
            profileActivity.t5[0].g(LocaleController.formatPluralString("ArchiveStories", i10, new Object[0]), true, true);
        } else {
            profileActivity.t5[0].g(profileActivity.r5, true, true);
        }
    }

    public static SpannableStringBuilder G3(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        lz0 lz0Var = new lz0(9);
        lz0Var.n = str;
        if (lz0Var.c != null) {
            lz0Var.c = null;
            lz0Var.a();
        }
        lz0Var.f = i10;
        spannableStringBuilder.setSpan(lz0Var, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static ValueAnimator H0(final ProfileActivity profileActivity, final boolean z4) {
        org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.r;
        if (z4) {
            AndroidUtilities.requestAdjustResize(profileActivity.getParentActivity(), profileActivity.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
        }
        ValueAnimator valueAnimator = profileActivity.S1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            profileActivity.S1.cancel();
        }
        lh.u0 u0Var = profileActivity.s0;
        if (u0Var != null) {
            u0Var.setActive(!z4);
        }
        int i10 = 0;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(profileActivity.R1, z4 ? 0.0f : 1.0f);
        final float f10 = profileActivity.N1;
        profileActivity.b.setTranslationY(f10);
        profileActivity.b.setVisibility(0);
        profileActivity.R0.setVisibility(0);
        profileActivity.a.setVisibility(0);
        profileActivity.k4(true);
        profileActivity.V.setVisibility(0);
        profileActivity.f[1].setVisibility(0);
        k5VarArr[1].setVisibility(0);
        k5VarArr[3].setVisibility(0);
        profileActivity.actionBar.v(profileActivity.R1 > 0.5f);
        int i11 = profileActivity.R1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
        if (w0Var != null) {
            w0Var.setVisibility(i11);
        }
        profileActivity.R0.setVisibility(i11);
        profileActivity.R0.getSearchContainer().setVisibility(profileActivity.R1 <= 0.5f ? 0 : 8);
        profileActivity.b.setEmptyView(profileActivity.M);
        profileActivity.V.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.jy0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileActivity.l0(ProfileActivity.this, ofFloat, f10, z4);
            }
        });
        ofFloat.addListener(new kz0(profileActivity, z4, i10));
        if (!z4) {
            profileActivity.R4 = true;
            profileActivity.F4();
            AndroidUtilities.requestAdjustNothing(profileActivity.getParentActivity(), profileActivity.classGuid);
            profileActivity.M.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(org.telegram.ui.Components.nr.f);
        profileActivity.S1 = ofFloat;
        return ofFloat;
    }

    public static void H4(Activity activity, boolean z4) {
        if (activity == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(activity, 3, null);
        d2Var.d0 = false;
        d2Var.show();
        Utilities.globalQueue.postRunnable(new vq0(d2Var, z4, activity, 2));
    }

    public static void S0(ProfileActivity profileActivity, String str, StringBuilder sb) {
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
            sb.append("\n");
            sb.append(arrayList.size());
            sb.append("+");
            sb.append(arrayList2.size());
            sb.append(" ");
            sb.append(str.substring(6));
            sb.append(" codecs:\n");
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (i12 > 0) {
                    sb.append("\n");
                }
                MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList.get(i12)).intValue());
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
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (i13 > 0 || !arrayList.isEmpty()) {
                    sb.append("\n");
                }
                MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i13)).intValue());
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

    public static void U(ProfileActivity profileActivity, TLRPC.User user, org.telegram.ui.ActionBar.k5 k5Var) {
        ImageLocation forDocument;
        String str;
        org.telegram.ui.Components.j5[] j5VarArr = profileActivity.D;
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            af.g.s(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug);
            return;
        }
        eg.e2 e2Var = new eg.e2(profileActivity, profileActivity.currentAccount, user, null, null, profileActivity.w0);
        k5Var.getLocationOnScreen(new int[2]);
        e2Var.s0 = k5Var.e0;
        e2Var.t0 = k5Var.f0;
        e2Var.w0 = k5Var.getScaleX();
        e2Var.u0 = k5Var.getLeft();
        e2Var.v0 = k5Var.getTop();
        e2Var.x0 = k5Var;
        Drawable rightDrawable = k5Var.getRightDrawable();
        org.telegram.ui.Components.j5 j5Var = j5VarArr[1];
        if (rightDrawable == j5Var && j5Var != null) {
            Drawable drawable = j5Var.f[0];
            if (drawable instanceof org.telegram.ui.Components.l5) {
                e2Var.w0 *= 0.98f;
                TLRPC.Document document = ((org.telegram.ui.Components.l5) drawable).e;
                if (document != null) {
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(profileActivity.getParentActivity());
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
                    p9Var.setLayerNum(7);
                    p9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    p9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (((org.telegram.ui.Components.l5) j5VarArr[1].f[0]).c()) {
                        p9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, profileActivity.w0), PorterDuff.Mode.SRC_IN));
                        e2Var.z0 = MessageObject.getInputStickerSet(document);
                    } else {
                        e2Var.z0 = MessageObject.getInputStickerSet(document);
                    }
                    e2Var.y0 = p9Var;
                    e2Var.B0 = true;
                }
            }
        }
        profileActivity.showDialog(e2Var);
    }

    public static void V(ProfileActivity profileActivity) {
        org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.r;
        my0 my0Var = profileActivity.a;
        if (my0Var != null) {
            int childCount = my0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = profileActivity.a.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.va) {
                    ((org.telegram.ui.Cells.va) childAt).j(0);
                }
            }
            profileActivity.a.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, profileActivity.w0));
        }
        if (!profileActivity.m2) {
            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[1];
            if (k5Var != null) {
                Object tag = k5Var.getTag();
                for (int i11 = 0; i11 < 2; i11++) {
                    if (tag instanceof Integer) {
                        k5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.j6.v0(((Integer) tag).intValue(), profileActivity.w0), Boolean.valueOf(profileActivity.G0[0])));
                    } else {
                        k5VarArr[i11 + 1].setTextColor(profileActivity.w3(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, profileActivity.w0), Boolean.TRUE));
                    }
                }
            }
            Drawable drawable = profileActivity.x;
            if (drawable != null) {
                drawable.setColorFilter(profileActivity.N5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pc, profileActivity.w0), PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.fm0 fm0Var = profileActivity.I;
            if (fm0Var != null) {
                fm0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h8, profileActivity.w0));
            }
            org.telegram.ui.ActionBar.k5 k5Var2 = profileActivity.f[1];
            if (k5Var2 != null) {
                k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vh, profileActivity.w0));
            }
            org.telegram.ui.ActionBar.k kVar = profileActivity.actionBar;
            if (kVar != null) {
                kVar.C(profileActivity.N5 == null ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, profileActivity.w0) : -1, false);
                profileActivity.actionBar.B(profileActivity.N5 != null ? 553648127 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f8, profileActivity.w0), false);
            }
        }
        profileActivity.X4();
        profileActivity.o5();
    }

    public static void V0(ProfileActivity profileActivity) {
        float min = Math.min(profileActivity.Z1, 0.25f) / 0.25f;
        if (profileActivity.n1) {
            profileActivity.q0.setAlpha(1.0f - min);
            profileActivity.q0.setBlurIntensity(0.0f);
            profileActivity.q0.setGooeyEnabled(false);
        } else {
            profileActivity.q0.setPullProgress(profileActivity.Z1);
            profileActivity.q0.setBlurIntensity(Math.min((k7.n.a(profileActivity.Z1, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
            org.telegram.ui.Components.zh0 zh0Var = profileActivity.q0;
            float f10 = profileActivity.Z1;
            zh0Var.setGooeyEnabled(f10 > 0.0f && f10 < 1.0f);
        }
        zy0 zy0Var = profileActivity.r0;
        if (zy0Var != null && profileActivity.G1 != 2) {
            float f11 = profileActivity.Z1;
            zy0Var.setAlpha(f11 > 0.0f ? AndroidUtilities.lerp(1.0f, 0.0f, AndroidUtilities.ilerp(f11, 0.0f, 0.5f)) : 1.0f);
        }
        profileActivity.q0.setVisibility(profileActivity.Z1 >= 1.0f ? 8 : 0);
    }

    public static /* synthetic */ void W(ProfileActivity profileActivity) {
        MessagesController.getInstance(profileActivity.currentAccount).deleteUserPhoto(null);
        profileActivity.S.K(0);
        profileActivity.T.K(0);
    }

    public static void X(ProfileActivity profileActivity, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.ic Q = org.telegram.ui.Components.qc.a0(profileActivity).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
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
            kh.a2.v(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity), R.raw.error, 36);
            return;
        }
        if (profileActivity.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.resourceProvider);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            profileActivity.showDialog(alertDialog$Builder.a);
        }
    }

    public static void Y(ProfileActivity profileActivity, int i10, float f10, float f11) {
        switch (i10) {
            case 0:
                boolean z4 = profileActivity.n1;
                if (!z4) {
                    if (profileActivity.b1 == 0) {
                        if (profileActivity.c1 != 0) {
                            if (!ChatObject.isForum(profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.c1)))) {
                                if (!profileActivity.M3()) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", profileActivity.c1);
                                    if (profileActivity.getMessagesController().checkCanOpenChat(bundle, profileActivity)) {
                                        profileActivity.presentFragment(new xn(bundle), false);
                                        break;
                                    }
                                }
                            } else {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", profileActivity.c1);
                                if (profileActivity.getMessagesController().checkCanOpenChat(bundle2, profileActivity)) {
                                    profileActivity.presentFragment(new xn(bundle2), false);
                                    break;
                                }
                            }
                        }
                    } else {
                        profileActivity.x4();
                        break;
                    }
                } else if (z4) {
                    profileActivity.M3();
                    break;
                }
                break;
            case 1:
                profileActivity.r4(profileActivity.X, f10, f11, true);
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
                k31.K(profileActivity.a(), profileActivity);
                break;
            case 9:
                profileActivity.i4(false);
                break;
            case 12:
                profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(profileActivity.getParentActivity(), 3, profileActivity.w0);
                d2Var.q(200L);
                MessagesController.getInstance(profileActivity.currentAccount).getStoriesController().k(profileActivity.a(), new nh.z1(7, profileActivity, d2Var), true, profileActivity.w0);
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
                    org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(profileActivity, profileActivity.X);
                    H.w = false;
                    H.i = 3;
                    H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.QrCode), new ob0(profileActivity, 22), false);
                    H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new el0(currentUser, 28), false);
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new ob0(profileActivity, 23), false);
                    H.W = true;
                    H.a0(f10 - AndroidUtilities.dp(8.0f), profileActivity.X.getMeasuredHeight() - AndroidUtilities.dp(16.0f));
                    H.Z();
                    break;
                }
                break;
            case 16:
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 17:
                profileActivity.presentFragment(new o81(null));
                break;
        }
    }

    public static boolean Z(ProfileActivity profileActivity, boolean[] zArr, boolean z4, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_error tL_error) {
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(profileActivity.currentAccount).edit().putLong("dialog_join_requested_time_" + profileActivity.f1, System.currentTimeMillis()).commit();
        Activity parentActivity = profileActivity.getParentActivity();
        boolean z10 = ChatObject.isChannel(profileActivity.B2) && !profileActivity.B2.megagroup;
        int i10 = org.telegram.ui.Components.h80.r;
        org.telegram.ui.Components.h80.w(parentActivity, profileActivity, org.telegram.ui.Components.qc.a0(profileActivity), z10);
        if (!z4 || profileActivity.I4 != -1) {
            profileActivity.j5();
            g01 g01Var = profileActivity.d;
            if (g01Var != null) {
                g01Var.l();
            }
        }
        if (p2Var instanceof xn) {
            ((xn) p2Var).vb(false, true);
        }
        return false;
    }

    public static void a0(ProfileActivity profileActivity) {
        TLRPC.Document f10;
        org.telegram.ui.Components.ic h;
        if (profileActivity.G2 != null) {
            return;
        }
        if (!profileActivity.n1 || profileActivity.getMessagesController().premiumFeaturesBlocked()) {
            if (profileActivity.K3()) {
                return;
            }
            profileActivity.w4(false);
            return;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = profileActivity.getMessagesController().getTopicsController().getTopics(profileActivity.c1);
        if (topics != null) {
            TLRPC.TL_forumTopic tL_forumTopic = null;
            for (int i10 = 0; tL_forumTopic == null && i10 < topics.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i10);
                if (tL_forumTopic2 != null && tL_forumTopic2.id == profileActivity.d1) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
            if (tL_forumTopic != null) {
                long j10 = tL_forumTopic.icon_emoji_id;
                if (j10 == 0 || (f10 = org.telegram.ui.Components.l5.f(profileActivity.currentAccount, j10)) == null || (h = org.telegram.ui.Components.qc.a0(profileActivity).h(f10, 1, new hy0(profileActivity, 0))) == null) {
                    return;
                }
                h.j();
            }
        }
    }

    public static void b0(ProfileActivity profileActivity, Context context, long j10, View view, int i10, float f10, float f11) {
        TLRPC.User user;
        g01 g01Var;
        if (profileActivity.getParentActivity() == null) {
            return;
        }
        profileActivity.a.B0();
        if (i10 == profileActivity.P3) {
            TLRPC.User user2 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.b1));
            TLRPC.UserFull userFull = profileActivity.s2;
            if (userFull != null && userFull.starref_program != null) {
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                lh.b0.g(profileActivity.currentAccount).f(profileActivity.getParentActivity(), clientUserId, profileActivity.b1, new iu(profileActivity, context, clientUserId, 2));
                return;
            } else {
                if (user2 == null || !user2.bot_can_edit) {
                    return;
                }
                profileActivity.presentFragment(new rh.k(profileActivity.b1));
                return;
            }
        }
        if (i10 == profileActivity.N3) {
            boolean z4 = !profileActivity.getMessagesController().isDialogMuted(j10, profileActivity.d1);
            profileActivity.getNotificationsController().muteDialog(j10, profileActivity.d1, z4);
            org.telegram.ui.Components.qc.A(profileActivity, z4, null).j();
            profileActivity.a5();
            int i11 = profileActivity.N3;
            if (i11 < 0 || (g01Var = profileActivity.d) == null) {
                return;
            }
            g01Var.m(i11);
            return;
        }
        if (i10 == profileActivity.W3) {
            TLRPC.User user3 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.b1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user3.id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", profileActivity.a5);
            bundle.putString("first_name_card", profileActivity.b5);
            bundle.putString("last_name_card", profileActivity.c5);
            ns nsVar = new ns(bundle, profileActivity.w0);
            nsVar.L = new qx0(profileActivity, user3);
            profileActivity.presentFragment(nsVar);
            return;
        }
        if (i10 == profileActivity.T3) {
            TextView textView = (TextView) org.telegram.ui.Components.z4.i0(profileActivity.getParentActivity(), LocaleController.getString(R.string.DeleteReaction), LocaleController.getString(R.string.DeleteAlertReaction), LocaleController.getString(R.string.DeleteAlertReactionAll), LocaleController.getString(R.string.Delete), new hy0(profileActivity, 1), profileActivity.w0, false).d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                return;
            }
            return;
        }
        if (i10 == profileActivity.U3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.w0);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.ReportReaction2);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ReportAlertReaction);
            TLRPC.Chat chat = profileActivity.getMessagesController().getChat(Long.valueOf(-profileActivity.X4));
            org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
            if (chat != null && ChatObject.canBlockUsers(chat)) {
                LinearLayout linearLayout = new LinearLayout(profileActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(profileActivity.getParentActivity(), 1, profileActivity.w0);
                z1VarArr[0] = z1Var;
                z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                z1VarArr[0].e(LocaleController.getString(R.string.BanUser), "", true, false, false);
                z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(z1VarArr[0], k7.b6.n(-1, -2));
                z1VarArr[0].setOnClickListener(new q20(z1VarArr, 2));
                alertDialog$Builder.n(linearLayout);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.ReportChat), new tl0(13, profileActivity, z1VarArr));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new al0(5));
            TextView textView2 = (TextView) alertDialog$Builder.o().d(-1);
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                return;
            }
            return;
        }
        if (i10 == profileActivity.o4) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", DialogObject.getEncryptedChatId(profileActivity.f1));
            profileActivity.presentFragment(new o70(bundle2));
            return;
        }
        if (i10 == profileActivity.n4) {
            profileActivity.showDialog(org.telegram.ui.Components.z4.V(profileActivity.getParentActivity(), profileActivity.A2, profileActivity.w0).a);
            return;
        }
        if (i10 == profileActivity.K3) {
            profileActivity.r4(view, f10, f11, false);
            return;
        }
        if (i10 == profileActivity.H4) {
            profileActivity.getMessagesController().unblockPeer(profileActivity.b1);
            if (org.telegram.ui.Components.qc.a(profileActivity)) {
                org.telegram.ui.Components.qc.d(profileActivity, false).j();
                return;
            }
            return;
        }
        if (i10 == profileActivity.X3) {
            try {
                profileActivity.actionBar.getActionBarMenuOnItemClick().b(9);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i10 == profileActivity.R3) {
            profileActivity.u4();
            return;
        }
        if (i10 == profileActivity.S3) {
            k31.K(profileActivity.a(), profileActivity);
            return;
        }
        if (i10 >= profileActivity.r4 && i10 < profileActivity.s4) {
            profileActivity.h(!profileActivity.z2.isEmpty() ? profileActivity.r2.participants.participants.get(((Integer) profileActivity.z2.get(i10 - profileActivity.r4)).intValue()) : profileActivity.r2.participants.participants.get(i10 - profileActivity.r4), false, false, view);
            return;
        }
        if (i10 == profileActivity.t4) {
            profileActivity.v4();
            return;
        }
        if (i10 == profileActivity.I3) {
            profileActivity.C4(f10, f11, i10, view);
            return;
        }
        if (i10 == profileActivity.i4) {
            if (profileActivity.B2 != null) {
                profileActivity.showDialog(new sh.i0(profileActivity, profileActivity.B2.linked_community_id, null, null));
                return;
            } else {
                if (profileActivity.b1 == 0 || (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.b1))) == null) {
                    return;
                }
                profileActivity.showDialog(new sh.i0(profileActivity, user.linked_community_id, null, null));
                return;
            }
        }
        if (i10 == profileActivity.F3) {
            if (profileActivity.r2.location instanceof TLRPC.TL_channelLocation) {
                ad0 ad0Var = new ad0(5);
                long j11 = profileActivity.c1;
                TLRPC.TL_channelLocation tL_channelLocation = (TLRPC.TL_channelLocation) profileActivity.r2.location;
                ad0Var.b0 = -j11;
                ad0Var.w0 = tL_channelLocation;
                profileActivity.presentFragment(ad0Var);
                return;
            }
            return;
        }
        if (i10 == profileActivity.I4) {
            profileActivity.q4(false);
            return;
        }
        if (i10 == profileActivity.u4) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", profileActivity.c1);
            bundle3.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            pr prVar = new pr(bundle3);
            prVar.x0(profileActivity.r2);
            profileActivity.presentFragment(prVar);
            return;
        }
        if (i10 == profileActivity.v4) {
            profileActivity.presentFragment(new qh0(profileActivity.c1));
            return;
        }
        if (i10 == profileActivity.w4) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", profileActivity.c1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            pr prVar2 = new pr(bundle4);
            prVar2.x0(profileActivity.r2);
            profileActivity.presentFragment(prVar2);
            return;
        }
        if (i10 == profileActivity.x4) {
            profileActivity.P0.performClick();
            return;
        }
        if (i10 == profileActivity.y4) {
            profileActivity.presentFragment(new lh.q(0, profileActivity.b1));
            return;
        }
        if (i10 == profileActivity.z4) {
            profileActivity.presentFragment(new lh.q(1, profileActivity.b1));
            return;
        }
        if (i10 == profileActivity.A4) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", profileActivity.c1);
            bundle5.putBoolean("start_from_monetization", true);
            profileActivity.presentFragment(new ga1(bundle5));
            return;
        }
        if (i10 == profileActivity.D4) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", profileActivity.c1);
            bundle6.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            pr prVar3 = new pr(bundle6);
            prVar3.x0(profileActivity.r2);
            profileActivity.presentFragment(prVar3);
            return;
        }
        if (i10 == profileActivity.c3) {
            profileActivity.presentFragment(new NotificationsSettingsActivity());
            return;
        }
        if (i10 == profileActivity.e3) {
            PrivacySettingsActivity privacySettingsActivity = new PrivacySettingsActivity();
            TL_account.TL_password tL_password = profileActivity.E2;
            privacySettingsActivity.d = tL_password;
            if (tL_password != null) {
                privacySettingsActivity.y0();
            }
            profileActivity.presentFragment(privacySettingsActivity);
            return;
        }
        if (i10 == profileActivity.f3) {
            profileActivity.presentFragment(new DataSettingsActivity());
            return;
        }
        if (i10 == profileActivity.g3) {
            profileActivity.presentFragment(new ThemeActivity(0));
            return;
        }
        if (i10 == profileActivity.h3) {
            profileActivity.presentFragment(new FiltersSetupActivity());
            return;
        }
        if (i10 == profileActivity.j3) {
            profileActivity.presentFragment(new StickersActivity(0, null));
            return;
        }
        if (i10 == profileActivity.i3) {
            profileActivity.presentFragment(new ec0());
            return;
        }
        if (i10 == profileActivity.k3) {
            profileActivity.presentFragment(new SessionsActivity(0));
            return;
        }
        if (i10 == profileActivity.n3) {
            profileActivity.showDialog(org.telegram.ui.Components.z4.U(profileActivity, profileActivity.w0));
            return;
        }
        if (i10 == profileActivity.o3) {
            af.g.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
            return;
        }
        if (i10 == profileActivity.p3) {
            af.g.s(profileActivity.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
            return;
        }
        if (i10 == profileActivity.s3) {
            H4(profileActivity.getParentActivity(), false);
            return;
        }
        if (i10 == profileActivity.t3) {
            H4(profileActivity.getParentActivity(), true);
            return;
        }
        if (i10 == profileActivity.u3) {
            FileLog.cleanupLogs();
            return;
        }
        if (i10 == profileActivity.v3) {
            if (profileActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.w0);
            alertDialog$Builder2.a.Q = LocaleController.getString(R.string.AreYouSure);
            alertDialog$Builder2.a.O = LocaleController.getString(R.string.AppName);
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new px0(profileActivity, 7));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            profileActivity.showDialog(alertDialog$Builder2.a);
            return;
        }
        if (i10 == profileActivity.d3) {
            profileActivity.presentFragment(new LanguageSelectActivity());
            return;
        }
        if (i10 == profileActivity.S2) {
            profileActivity.presentFragment(new pa(null));
            return;
        }
        if (i10 == profileActivity.T2) {
            profileActivity.presentFragment(new UserInfoActivity());
            return;
        }
        if (i10 == profileActivity.Q2) {
            profileActivity.presentFragment(new i(3));
            return;
        }
        if (i10 == profileActivity.L2) {
            profileActivity.u4();
            return;
        }
        if (i10 == profileActivity.Z3) {
            profileActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
            return;
        }
        if (i10 == profileActivity.a4) {
            profileActivity.presentFragment(new lh.ja());
            return;
        }
        if (i10 == profileActivity.b4) {
            profileActivity.presentFragment(new qh.g());
            return;
        }
        if (i10 == profileActivity.c4) {
            profileActivity.presentFragment(new PremiumPreviewFragment(1, "settings"));
            return;
        }
        if (i10 == profileActivity.d4) {
            gg.v2.e0(0, BirthdayController.getInstance(profileActivity.currentAccount).getState());
            return;
        }
        if (i10 == profileActivity.botPermissionLocation) {
            rh.r0 r0Var = profileActivity.p2;
            if (r0Var != null) {
                r0Var.m(!r0Var.g(), new zq0(23, profileActivity, view));
                return;
            }
            return;
        }
        if (i10 == profileActivity.botPermissionBiometry) {
            rh.q qVar = profileActivity.q2;
            if (qVar != null) {
                boolean z10 = !qVar.e;
                qVar.f = true;
                qVar.e = z10;
                qVar.k();
                ((org.telegram.ui.Cells.o8) view).setChecked(profileActivity.q2.e);
                return;
            }
            return;
        }
        if (i10 == profileActivity.botPermissionEmojiStatus) {
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            o8Var.setChecked(!o8Var.b());
            if (profileActivity.l4 > 0) {
                profileActivity.getConnectionsManager().cancelRequest(profileActivity.l4, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = profileActivity.getMessagesController().getInputUser(profileActivity.b1);
            boolean b10 = o8Var.b();
            toggleuseremojistatuspermission.enabled = b10;
            TLRPC.UserFull userFull2 = profileActivity.s2;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = b10;
            }
            int sendRequest = profileActivity.getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new sb0(15, profileActivity, r0));
            profileActivity.l4 = sendRequest;
            int[] iArr = {sendRequest};
            return;
        }
        if (i10 == profileActivity.L3) {
            profileActivity.K4 = !profileActivity.K4;
            profileActivity.F4();
            view.requestLayout();
            profileActivity.d.m(profileActivity.L3);
            int i12 = profileActivity.R5;
            if (i12 >= 0) {
                profileActivity.c.h1(i12, profileActivity.S5 - profileActivity.a.getPaddingTop());
                return;
            }
            return;
        }
        if (i10 == profileActivity.M3) {
            profileActivity.z4(false);
            return;
        }
        if (i10 == profileActivity.N2) {
            if (profileActivity.s2 == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", profileActivity.s2.personal_channel_id);
            profileActivity.presentFragment(new xn(bundle7));
            return;
        }
        if (i10 != profileActivity.R2) {
            if (i10 == profileActivity.E3) {
                profileActivity.I3(i10, view);
                return;
            } else {
                profileActivity.C4(f10, f11, i10, view);
                return;
            }
        }
        y01 y01Var = profileActivity.Z5;
        if ((y01Var == null || !y01Var.a()) && !profileActivity.J3(i10, view)) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (y8Var.d.getDrawable() != null) {
                profileActivity.t4(y8Var.getImageView());
            }
        }
    }

    public static void c0(ProfileActivity profileActivity, org.telegram.ui.Cells.z1[] z1VarArr) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = profileActivity.getMessagesController().getInputUser(profileActivity.b1);
        tL_messages_reportReaction.peer = profileActivity.getMessagesController().getInputPeer(profileActivity.X4);
        tL_messages_reportReaction.id = profileActivity.W4;
        ConnectionsManager.getInstance(profileActivity.currentAccount).sendRequest(tL_messages_reportReaction, new nh.p5(4));
        org.telegram.ui.Cells.z1 z1Var = z1VarArr[0];
        if (z1Var != null && z1Var.b()) {
            profileActivity.getMessagesController().deleteParticipantFromChat(-profileActivity.X4, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.b1)));
        }
        profileActivity.W4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.qc.a0(profileActivity).E(profileActivity.w0).j();
    }

    public static /* synthetic */ void d0(ProfileActivity profileActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            profileActivity.F2 = fileLocation;
            profileActivity.G2 = photoSize2.location;
            profileActivity.b0.h(ImageLocation.getForLocal(fileLocation), "50_50", profileActivity.m0, null);
            if (profileActivity.L2 != -1) {
                profileActivity.j5();
                g01 g01Var = profileActivity.d;
                if (g01Var != null) {
                    g01Var.l();
                }
                profileActivity.k4(true);
            }
            xy0 xy0Var = profileActivity.k0;
            ImageLocation forLocal = ImageLocation.getForLocal(profileActivity.G2);
            profileActivity.H2 = forLocal;
            xy0Var.A(forLocal, ImageLocation.getForLocal(profileActivity.F2));
            profileActivity.P4(true, false);
        } else {
            if (profileActivity.F2 == null) {
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
            profileActivity.P5 = profileActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new sb0(17, profileActivity, str));
        }
        profileActivity.actionBar.n().requestLayout();
    }

    public static void e0(ProfileActivity profileActivity, Boolean bool) {
        long j10 = profileActivity.b1;
        if (j10 == 0) {
            long j11 = profileActivity.c1;
            j10 = j11 != 0 ? -j11 : profileActivity.f1;
        }
        long j12 = j10;
        if (bool.booleanValue()) {
            MessagesController.getInstance(profileActivity.currentAccount).deleteAllReactionsFrom(profileActivity.X4, j12);
        } else {
            MessagesController.getInstance(profileActivity.currentAccount).deleteReactionsFromMessage(profileActivity.X4, j12, profileActivity.W4);
        }
        profileActivity.W4 = 0;
        profileActivity.e5(false, false);
        org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(profileActivity.getParentActivity(), profileActivity.w0);
        qbVar.d(R.raw.chats_infotip, new String[0]);
        qbVar.b.setText(LocaleController.getString(R.string.ReactionDeleteSent));
        org.telegram.ui.Components.qc.a0(profileActivity).b(qbVar, 1500).j();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f0(ProfileActivity profileActivity, int i10) {
        boolean z4;
        if (i10 < 0) {
            return;
        }
        Object valueOf = Integer.valueOf(profileActivity.Q2);
        r01 r01Var = profileActivity.e;
        if (!r01Var.w) {
            if (!r01Var.v.isEmpty()) {
                i10--;
            }
            if (i10 < 0 || i10 >= profileActivity.e.v.size()) {
                int f10 = yh.f(1, i10, profileActivity.e.v);
                if (f10 >= 0 && f10 < profileActivity.e.d.size()) {
                    valueOf = profileActivity.e.d.get(f10);
                    z4 = false;
                    if (!(valueOf instanceof q01)) {
                        q01 q01Var = (q01) valueOf;
                        org.telegram.ui.ActionBar.e5 parentLayout = profileActivity.getParentLayout();
                        q01Var.b.run();
                        AndroidUtilities.scrollToFragmentRow(parentLayout, q01Var.c);
                    } else if (valueOf instanceof MessagesController.FaqSearchResult) {
                        NotificationCenter.getInstance(profileActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, profileActivity.e.B, ((MessagesController.FaqSearchResult) valueOf).url);
                    }
                    if (z4 || valueOf == null) {
                    }
                    profileActivity.e.E(valueOf);
                    return;
                }
            } else {
                valueOf = profileActivity.e.v.get(i10);
            }
        } else if (i10 < r01Var.r.size()) {
            valueOf = profileActivity.e.r.get(i10);
        } else {
            int f11 = yh.f(1, i10, profileActivity.e.r);
            if (f11 >= 0 && f11 < profileActivity.e.s.size()) {
                valueOf = profileActivity.e.s.get(f11);
            }
        }
        z4 = true;
        if (!(valueOf instanceof q01)) {
        }
        if (z4) {
        }
    }

    public static void g0(ProfileActivity profileActivity) {
        boolean z4;
        TLRPC.Document document;
        if (profileActivity.Y == null) {
            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.currentAccount == profileActivity.currentAccount && MediaController.getInstance().currentSavedMusicList.dialogId == profileActivity.a()) {
                profileActivity.Y = MediaController.getInstance().currentSavedMusicList;
            } else {
                MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(profileActivity.currentAccount, profileActivity.a());
                profileActivity.Y = savedMusicList;
                TLRPC.UserFull userFull = profileActivity.s2;
                if (userFull != null && (document = userFull.saved_music) != null) {
                    savedMusicList.setup(document);
                }
            }
        }
        if (profileActivity.Y.list.isEmpty()) {
            return;
        }
        if (MediaController.getInstance().currentSavedMusicList == profileActivity.Y && MediaController.getInstance().isPlayingMessage(profileActivity.Y.list.get(0))) {
            z4 = true;
        } else {
            MediaController.getInstance().cleanup();
            z4 = false;
        }
        MediaController.getInstance().currentSavedMusicList = profileActivity.Y;
        MediaController.getInstance().getPlaylist().clear();
        MediaController.getInstance().getPlaylist().addAll(profileActivity.Y.list);
        if (!z4) {
            MediaController.getInstance().playMessage(profileActivity.Y.list.get(0));
        }
        profileActivity.showDialog(new org.telegram.ui.Components.c8(profileActivity.getParentActivity(), profileActivity.w0));
    }

    public static void h0(ProfileActivity profileActivity) {
        org.telegram.ui.Components.ac0.b(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), true, null, new ob0(profileActivity, 18), profileActivity.w0);
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v33, types: [boolean[], org.telegram.ui.ActionBar.f6] */
    /* JADX WARN: Type inference failed for: r5v41 */
    public static void i0(ProfileActivity profileActivity) {
        LinearLayout linearLayout;
        int i10;
        final int i11;
        final LimitPreviewView limitPreviewView;
        Activity parentActivity = profileActivity.getParentActivity();
        final TLRPC.UserFull userFull = profileActivity.s2;
        if (userFull == null || userFull.stars_rating == null) {
            return;
        }
        ?? r52 = 0;
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(profileActivity.getParentActivity(), null, false, false);
        g3Var.fixNavigationBar();
        Runnable runnable = g3Var.dismissRunnable;
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        linearLayout2.setOrientation(1);
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        LimitPreviewView limitPreviewView2 = new LimitPreviewView(profileActivity.getParentActivity(), R.drawable.filled_rating_crown, 0, profileActivity.w0, 0);
        limitPreviewView2.setHideNegativeValues(profileActivity.a() != UserConfig.getInstance(profileActivity.currentAccount).getClientUserId());
        limitPreviewView2.setStarRating(userFull.stars_rating);
        limitPreviewView2.setTranslationY(-AndroidUtilities.dp(14.0f));
        linearLayout2.addView(limitPreviewView2, k7.b6.t(-1, -2, 17, 0, 20, 0, 10));
        int i12 = 17;
        if (userFull.stars_my_pending_rating != null) {
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            linearLayout2.addView(frameLayout, k7.b6.t(-1, -2, 17, 40, -12, 40, 20));
            TextView[] textViewArr = new org.telegram.ui.Components.e90[2];
            int i13 = 0;
            for (int i14 = 2; i13 < i14; i14 = 2) {
                eg.b2 b2Var = new eg.b2(parentActivity, 5, r52);
                textViewArr[i13] = b2Var;
                b2Var.setGravity(17);
                textViewArr[i13].setTextSize(1, 12.0f);
                textViewArr[i13].setTextColor(org.telegram.ui.ActionBar.j6.w0(r52, org.telegram.ui.ActionBar.j6.y6, false));
                textViewArr[i13].setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(r52, org.telegram.ui.ActionBar.j6.gc, false));
                frameLayout.addView(textViewArr[i13], k7.b6.e(-1, -1, 119));
                textViewArr[i13].setAlpha(i13 == 0 ? 1.0f : 0.0f);
                textViewArr[i13].setScaleX(i13 == 0 ? 1.0f : 0.8f);
                textViewArr[i13].setScaleY(i13 == 0 ? 1.0f : 0.8f);
                i13++;
                r52 = 0;
            }
            final w3 w3Var = new w3(textViewArr, i12);
            boolean z4 = profileActivity.a() == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId();
            long j10 = userFull.stars_rating.stars;
            TL_stars.Tl_starsRating tl_starsRating = userFull.stars_my_pending_rating;
            linearLayout = linearLayout2;
            long j11 = (-j10) - (tl_starsRating != null ? tl_starsRating.stars - j10 : 0L);
            int max = Math.max(1, (userFull.stars_my_pending_rating_date - ConnectionsManager.getInstance(profileActivity.currentAccount).getCurrentTime()) / 86400);
            long j12 = userFull.stars_my_pending_rating.stars;
            long j13 = userFull.stars_rating.stars;
            long j14 = j12 - j13;
            if ((j13 >= 0 || z4) && (!z4 || j11 <= 0)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                i11 = 0;
                spannableStringBuilder.append(TextUtils.concat(LocaleController.formatPluralStringComma("StarRatingFuture", max), "\n", LocaleController.formatPluralStringComma("StarRatingFuturePendingPoints", (int) j14)));
                spannableStringBuilder.append((CharSequence) " ");
                limitPreviewView = limitPreviewView2;
                spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreview), new Runnable() { // from class: org.telegram.ui.ey0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
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
                textViewArr[0].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.fy0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
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
                boolean z10 = z4;
                textViewArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                if (z10) {
                    textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarRatingLevelNegativeYou", (int) j11)));
                } else {
                    textViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarRatingLevelNegativeOther, DialogObject.getName(profileActivity.a()))));
                }
                limitPreviewView = limitPreviewView2;
                i11 = 0;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String formatPluralStringComma = LocaleController.formatPluralStringComma("StarRatingFuturePreview1", max);
            String formatPluralStringComma2 = LocaleController.formatPluralStringComma("StarRatingFuturePreview2", (int) j14);
            CharSequence[] charSequenceArr = new CharSequence[3];
            charSequenceArr[i11] = formatPluralStringComma;
            final int i15 = 1;
            charSequenceArr[1] = "\n";
            charSequenceArr[2] = formatPluralStringComma2;
            spannableStringBuilder2.append(TextUtils.concat(charSequenceArr));
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreviewBack), new Runnable() { // from class: org.telegram.ui.ey0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
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
            textViewArr[1].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.fy0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
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
        int i16 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, profileActivity.w0));
        LinearLayout linearLayout3 = linearLayout;
        linearLayout3.addView(textView, k7.b6.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        if (userFull.id == UserConfig.getInstance(profileActivity.currentAccount).getClientUserId()) {
            org.telegram.messenger.y3.q(R.string.StarRatingSelfDescription, textView2);
            i10 = 1;
        } else {
            i10 = 1;
            b.o(R.string.StarRatingDescription, new Object[]{DialogObject.getName(profileActivity.a())}, textView2);
        }
        textView2.setTextSize(i10, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, profileActivity.w0));
        linearLayout3.addView(textView2, k7.b6.t(-1, -2, 17, 20, 0, 20, 12));
        zv0 zv0Var = new zv0(parentActivity, profileActivity.w0);
        zv0Var.a.l(LocaleController.getString(R.string.StarRatingTitle1), false);
        int i17 = R.string.StarRatingDescription1;
        String string = LocaleController.getString(R.string.StarRatingAdded);
        int i18 = org.telegram.ui.ActionBar.j6.Oh;
        zv0Var.b.setText(LocaleController.formatSpannable(i17, G3(org.telegram.ui.ActionBar.j6.v0(i18, profileActivity.w0), string)));
        zv0Var.d.setVisibility(8);
        int i19 = R.drawable.menu_gift;
        ImageView imageView = zv0Var.c;
        imageView.setImageResource(i19);
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i16, profileActivity.w0));
        linearLayout3.addView(zv0Var, k7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        zv0 zv0Var2 = new zv0(parentActivity, profileActivity.w0);
        zv0Var2.a.l(LocaleController.getString(R.string.StarRatingTitle2), false);
        zv0Var2.b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription2, G3(org.telegram.ui.ActionBar.j6.v0(i18, profileActivity.w0), LocaleController.getString(R.string.StarRatingAdded))));
        zv0Var2.d.setVisibility(8);
        int i20 = R.drawable.menu_stars_gift;
        ImageView imageView2 = zv0Var2.c;
        imageView2.setImageResource(i20);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i16, profileActivity.w0));
        linearLayout3.addView(zv0Var2, k7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        zv0 zv0Var3 = new zv0(parentActivity, profileActivity.w0);
        zv0Var3.a.l(LocaleController.getString(R.string.StarRatingTitle3), false);
        zv0Var3.b.setText(LocaleController.formatSpannable(R.string.StarRatingDescription3, G3(org.telegram.ui.ActionBar.j6.I.q() ? i0.a.d(0.25f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.m6, profileActivity.w0), -16777216) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, profileActivity.w0), LocaleController.getString(R.string.StarRatingDeduces))));
        zv0Var3.d.setVisibility(8);
        int i21 = R.drawable.menu_refund;
        ImageView imageView3 = zv0Var3.c;
        imageView3.setImageResource(i21);
        imageView3.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i16, profileActivity.w0));
        linearLayout3.addView(zv0Var3, k7.b6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        ph.d dVar = new ph.d(parentActivity, profileActivity.w0, true);
        dVar.setOnClickListener(new gy0(0, runnable));
        dVar.g(lh.g5.g2(LocaleController.getString(R.string.Understood)), false, true);
        linearLayout3.addView(dVar, k7.b6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        g3Var.customView = linearLayout3;
        g3Var.show();
    }

    public static void j0(ProfileActivity profileActivity, TLRPC.User user) {
        if (profileActivity.W3 >= 0) {
            if (profileActivity.G4 == -1) {
                profileActivity.j5();
                profileActivity.d.l();
            } else {
                profileActivity.e5(false, false);
            }
        }
        if (profileActivity.G4 == -1) {
            if (profileActivity.k2 || AndroidUtilities.isTablet()) {
                profileActivity.a.setPadding(0, profileActivity.T3(), 0, 0);
                profileActivity.g2.cancel();
                float[] fArr = profileActivity.j2;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                profileActivity.J4(1.0f);
                profileActivity.N1 = profileActivity.T3();
            } else {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (profileActivity.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredWidth(), TLObject.FLAG_30);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    g01 g01Var = profileActivity.d;
                    if (i10 >= g01Var.e.K2) {
                        break;
                    }
                    f2.l1 g10 = g01Var.g(null, g01Var.j(i10));
                    View view = g10.a;
                    profileActivity.d.v(g10, i10);
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i11 += view.getMeasuredHeight();
                    i10++;
                }
                int max = Math.max(0, profileActivity.fragmentView.getMeasuredHeight() - ((profileActivity.T3() + i11) + currentActionBarHeight));
                my0 my0Var = profileActivity.a;
                my0Var.setPadding(0, my0Var.getPaddingTop(), 0, max);
            }
        }
        profileActivity.J.m(profileActivity.f1, user, 8);
    }

    public static /* synthetic */ void k0(ProfileActivity profileActivity, Context context, long j10, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            rh.e3.G0(context, profileActivity.currentAccount, profileActivity.s2.starref_program, profileActivity.getUserConfig().getClientUserId(), profileActivity.w0, false);
        } else {
            rh.e3.H0(context, profileActivity.currentAccount, connectedbotstarref, j10, profileActivity.w0);
        }
    }

    public static void l0(ProfileActivity profileActivity, ValueAnimator valueAnimator, float f10, boolean z4) {
        org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.r;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileActivity.R1 = floatValue;
        float f11 = (floatValue - 0.5f) / 0.5f;
        float f12 = (0.5f - floatValue) / 0.5f;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        float f13 = -f10;
        profileActivity.Q1 = (int) ((1.0f - floatValue) * f13);
        profileActivity.b.setTranslationY(floatValue * f10);
        profileActivity.M.setTranslationY(f10 * profileActivity.R1);
        profileActivity.a.setTranslationY((1.0f - profileActivity.R1) * f13);
        profileActivity.a.setScaleX(1.0f - ((1.0f - profileActivity.R1) * 0.01f));
        profileActivity.a.setScaleY(1.0f - ((1.0f - profileActivity.R1) * 0.01f));
        profileActivity.a.setAlpha(profileActivity.R1);
        profileActivity.k4(true);
        profileActivity.a.setAlpha(f11);
        profileActivity.b.setAlpha(1.0f - profileActivity.R1);
        profileActivity.b.setScaleX((profileActivity.R1 * 0.05f) + 1.0f);
        profileActivity.b.setScaleY((profileActivity.R1 * 0.05f) + 1.0f);
        profileActivity.M.setAlpha(1.0f - f11);
        profileActivity.V.setAlpha(f11);
        profileActivity.b0.setAlpha(f11);
        zy0 zy0Var = profileActivity.r0;
        if (zy0Var != null) {
            zy0Var.setAlpha(f11);
        }
        profileActivity.f[1].setAlpha(f11);
        k5VarArr[1].setAlpha(f11);
        k5VarArr[3].setAlpha(f11);
        profileActivity.R0.getSearchField().setAlpha(f12);
        if (z4 && profileActivity.R1 < 0.7f) {
            org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
            if (w0Var.C.getWidth() != 0 && !w0Var.e.isFocused()) {
                w0Var.e.requestFocus();
                AndroidUtilities.showKeyboard(w0Var.e);
            }
        }
        profileActivity.R0.getSearchContainer().setVisibility(profileActivity.R1 < 0.5f ? 0 : 8);
        int i10 = profileActivity.R1 > 0.5f ? 0 : 8;
        org.telegram.ui.ActionBar.w0 w0Var2 = profileActivity.Q0;
        if (w0Var2 != null) {
            w0Var2.setVisibility(i10);
            profileActivity.Q0.setAlpha(f11);
        }
        profileActivity.R0.setVisibility(i10);
        profileActivity.actionBar.v(profileActivity.R1 < 0.5f);
        org.telegram.ui.ActionBar.w0 w0Var3 = profileActivity.Q0;
        if (w0Var3 != null) {
            w0Var3.setAlpha(f11);
        }
        profileActivity.R0.setAlpha(f11);
        profileActivity.a1.invalidate();
        profileActivity.fragmentView.invalidate();
    }

    public static void m0(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z4, boolean z10) {
        org.telegram.ui.Components.f01.c(profileActivity.getParentActivity(), profileActivity.currentAccount, profileActivity.a(), user, str, z4, z10, profileActivity.w0);
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
            if (closestPhotoSizeWithSize != null && profileActivity.F2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.F2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb = new StringBuilder();
                sb.append(profileActivity.F2.volume_id);
                sb.append("_");
                String m9 = android.support.v4.media.a.m(profileActivity.F2.local_id, "@50_50", sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(closestPhotoSizeWithSize.location.volume_id);
                sb2.append("_");
                ImageLoader.getInstance().replaceImageInCache(m9, android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUserOrChat(profileActivity.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && profileActivity.G2 != null) {
                FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(profileActivity.G2, true).renameTo(FileLoader.getInstance(profileActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            profileActivity.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            profileActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.b1);
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                profileActivity.getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
        profileActivity.l2 = (AndroidUtilities.isTablet() || profileActivity.k2 || !profileActivity.b0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
        profileActivity.F2 = null;
        profileActivity.G2 = null;
        xy0 xy0Var = profileActivity.k0;
        xy0Var.E0 = true;
        xy0Var.H0 = profileActivity.H2;
        xy0Var.n1 = null;
        xy0Var.o1 = null;
        xy0Var.setCreateThumbFromParent(false);
        profileActivity.i5(true);
        profileActivity.P4(false, true);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        profileActivity.getUserConfig().saveConfig(true);
    }

    public static void n1(ProfileActivity profileActivity, boolean z4) {
        org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.f;
        org.telegram.ui.ActionBar.k5[] k5VarArr2 = profileActivity.r;
        int i10 = z4 ? 8 : 0;
        profileActivity.a.setVisibility(i10);
        profileActivity.b.setVisibility(z4 ? 0 : 8);
        profileActivity.R0.getSearchContainer().setVisibility(z4 ? 0 : 8);
        lh.u0 u0Var = profileActivity.s0;
        if (u0Var != null) {
            u0Var.setActive(!z4);
        }
        profileActivity.actionBar.v(z4);
        profileActivity.V.setVisibility(i10);
        zy0 zy0Var = profileActivity.r0;
        if (zy0Var != null) {
            zy0Var.setVisibility(i10);
        }
        k5VarArr[1].setVisibility(i10);
        k5VarArr2[1].setVisibility(i10);
        k5VarArr2[3].setVisibility(i10);
        org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
        if (w0Var != null) {
            w0Var.setAlpha(1.0f);
            profileActivity.Q0.setVisibility(i10);
        }
        profileActivity.R0.setVisibility(i10);
        profileActivity.b0.setAlpha(1.0f);
        profileActivity.V.setAlpha(1.0f);
        zy0 zy0Var2 = profileActivity.r0;
        if (zy0Var2 != null) {
            zy0Var2.setAlpha(1.0f);
        }
        lh.u0 u0Var2 = profileActivity.s0;
        if (u0Var2 != null) {
            u0Var2.setAlpha(1.0f);
        }
        k5VarArr[1].setAlpha(1.0f);
        k5VarArr2[1].setAlpha(1.0f);
        profileActivity.R0.setAlpha(1.0f);
        profileActivity.a.setAlpha(1.0f);
        profileActivity.b.setAlpha(1.0f);
        profileActivity.M.setAlpha(1.0f);
        if (z4) {
            profileActivity.b.setEmptyView(profileActivity.M);
        } else {
            profileActivity.M.setVisibility(8);
        }
    }

    public static void s3(ProfileActivity profileActivity, boolean z4) {
        Drawable drawable = profileActivity.b0.getImageReceiver().getDrawable();
        String str = null;
        if (drawable instanceof org.telegram.ui.Components.s61) {
            profileActivity.b0.u(null, null, drawable);
            return;
        }
        if (drawable instanceof org.telegram.ui.Components.y5) {
            org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) drawable;
            profileActivity.b0.u(null, null, y5Var);
            if (z4) {
                y5Var.f(profileActivity.b0);
                return;
            }
            return;
        }
        ImageLocation D = profileActivity.k0.D(0);
        if (D != null && D.imageType == 2) {
            str = "avatar";
        }
        profileActivity.b0.u(D, str, drawable);
    }

    public final void A3() {
        f2.l1 l1Var;
        View view;
        if (this.a.getVisibility() != 0) {
            return;
        }
        if (this.N) {
            this.L.setVisibleHeight(this.a.getMeasuredHeight() - this.L.getTop());
        }
        if (this.a.getChildCount() <= 0 || this.D1) {
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
            my0 my0Var = this.a;
            View F = my0Var.F(view);
            l1Var = (org.telegram.ui.Components.el0) (F != null ? my0Var.T(F) : null);
        }
        int top = view == null ? 0 : view.getTop();
        int b10 = l1Var != null ? l1Var.b() : -1;
        if (top < 0 || b10 != 0) {
            top = 0;
        }
        boolean z4 = this.n0 == null && this.actionBar.k0;
        int i11 = this.G4;
        if (i11 != -1 && !z4) {
            org.telegram.ui.Components.el0 el0Var = (org.telegram.ui.Components.el0) this.a.K(i11);
            z4 = el0Var != null && el0Var.a.getTop() <= 0;
        }
        if (this.C5 != z4) {
            this.C5 = z4;
            AnimatorSet animatorSet = this.z5;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.A5;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            org.telegram.ui.ActionBar.w0 searchItem = this.L.getSearchItem();
            org.telegram.ui.Components.jj0 searchOptionsItem = this.L.getSearchOptionsItem();
            TextView saveItem = this.L.getSaveItem();
            int i12 = 8;
            if (this.C5) {
                sz0 sz0Var = this.L;
                if (sz0Var.s0(sz0Var.h0[0].C)) {
                    searchItem.setVisibility(0);
                }
                if (searchOptionsItem != null) {
                    searchOptionsItem.setVisibility(0);
                }
                sz0 sz0Var2 = this.L;
                int i13 = sz0Var2.h0[0].C;
                if (i13 == 0 || org.telegram.ui.Components.yu0.p0(i13) || i13 == 11 || i13 == 13 || (i13 == 14 && sz0Var2.S != null)) {
                    this.L.o0.setVisibility(0);
                    this.L.A(true, false);
                } else {
                    this.L.o0.setVisibility(4);
                    this.L.A(false, false);
                }
            } else {
                if (this.I0) {
                    this.N0.setVisibility(0);
                }
                if (this.J0) {
                    this.O0.setVisibility(0);
                }
                if (this.K0) {
                    this.P0.setVisibility(0);
                }
                this.Q0.setVisibility(0);
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
            org.telegram.ui.ActionBar.w0 w0Var = this.N0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z4 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.O0, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z4 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z4 ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z4 ? 0.0f : 1.0f));
            org.telegram.ui.ActionBar.w0 w0Var2 = this.N0;
            Property property2 = View.TRANSLATION_Y;
            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, z4 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.O0, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, z4 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.Q0, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, z4 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, z4 ? -AndroidUtilities.dp(10.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchItem, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z4 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchItem, (Property<org.telegram.ui.ActionBar.w0, Float>) property2, z4 ? 0.0f : AndroidUtilities.dp(10.0f)));
            arrayList.add(ObjectAnimator.ofFloat(this.L.o0, (Property<ImageView, Float>) property, z4 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.L.o0, (Property<ImageView, Float>) property2, z4 ? 0.0f : AndroidUtilities.dp(10.0f)));
            arrayList.add(ObjectAnimator.ofFloat(this.actionBar, this.D5, z4 ? 1.0f : 0.0f));
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.r;
            arrayList.add(ObjectAnimator.ofFloat(k5VarArr[1], (Property<org.telegram.ui.ActionBar.k5, Float>) property, z4 ? 0.0f : 1.0f));
            this.L.F0.setOpen(z4);
            int i14 = 3;
            if (this.p1) {
                arrayList.add(ObjectAnimator.ofFloat(k5VarArr[3], (Property<org.telegram.ui.ActionBar.k5, Float>) property, z4 ? 0.0f : 1.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.io0, Float>) property, z4 ? 1.0f : 0.0f));
            if (z4) {
                arrayList.add(ObjectAnimator.ofFloat(this, this.g5, 0.0f));
            }
            if (this.r0 != null || this.s0 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ux0(this, i14));
                arrayList.add(ofFloat);
            }
            C3();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.z5 = animatorSet3;
            animatorSet3.playTogether(arrayList);
            this.z5.setInterpolator(org.telegram.ui.Components.nr.f);
            this.z5.addListener(new org.telegram.ui.Components.ex0(i12, this, searchItem));
            this.z5.setDuration(150L);
            this.z5.start();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        }
        float f10 = top;
        if (this.N1 == f10 || this.E1) {
            return;
        }
        this.N1 = f10;
        this.a1.invalidate();
        if (this.G1 != 0) {
            this.J1 = this.N1 > ((float) O3());
        }
        k4(true);
    }

    public final void A4(int i10, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4) {
        boolean[] zArr = new boolean[1];
        ez0 ez0Var = new ez0(this, user.id, this.c1, tL_chatAdminRights, this.B2.default_banned_rights, tL_chatBannedRights, str, i10, zArr, user);
        ez0Var.U0 = new fz0(this, i10, chatParticipant, z4, zArr);
        presentFragment(ez0Var);
    }

    public final void B3() {
        int i10 = this.G1;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.r;
        if (i10 == 1 && (!this.i5 || this.D1)) {
            this.V5 = 0.0f;
        } else if (i10 == 2 && (!this.i5 || this.D1)) {
            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[1];
            this.V5 = k5Var == null ? 0.0f : k5Var.getAlpha();
        } else if (this.b1 == UserConfig.getInstance(this.currentAccount).clientUserId) {
            this.V5 = (1.0f - this.k5) * this.h2;
        } else {
            this.V5 = this.h2 * this.k5;
        }
        if (this.b1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
            if (this.n5) {
                org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[2];
                if (k5Var2 != null) {
                    k5Var2.setAlpha(this.V5);
                }
                s01 s01Var = this.Y5;
                if (s01Var != null) {
                    s01Var.e = 1.0f - this.V5;
                    s01Var.invalidateSelf();
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.k5 k5Var3 = k5VarArr[2];
            if (k5Var3 != null) {
                k5Var3.setAlpha(0.0f);
            }
            s01 s01Var2 = this.Y5;
            if (s01Var2 != null) {
                s01Var2.e = 1.0f;
                s01Var2.invalidateSelf();
                return;
            }
            return;
        }
        if (!this.m5) {
            org.telegram.ui.ActionBar.k5 k5Var4 = k5VarArr[2];
            if (k5Var4 != null) {
                k5Var4.setAlpha(0.0f);
                k5VarArr[3].setAlpha(0.0f);
            }
            s01 s01Var3 = this.Y5;
            if (s01Var3 != null) {
                s01Var3.e = 1.0f;
                s01Var3.invalidateSelf();
                return;
            }
            return;
        }
        this.l5 = AndroidUtilities.dp(28.0f) * this.V5;
        org.telegram.ui.ActionBar.k5 k5Var5 = k5VarArr[2];
        if (k5Var5 != null) {
            k5Var5.setAlpha(this.h2);
            k5VarArr[3].setAlpha(1.0f - this.h2);
            k5VarArr[1].setTranslationX(W3(this.W5));
            this.W.invalidate();
            s01 s01Var4 = this.Y5;
            if (s01Var4 != null) {
                s01Var4.e = 1.0f - this.h2;
                s01Var4.invalidateSelf();
            }
        }
    }

    public final void B4(String str, org.telegram.ui.Cells.h hVar) {
        if (str.startsWith("@")) {
            getMessagesController().openByUserName(str.substring(1), this, 0, hVar);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            oy oyVar = new oy(null);
            oyVar.k2 = str;
            presentFragment(oyVar);
        } else {
            if (!str.startsWith("/") || this.parentLayout.getFragmentStack().size() <= 1) {
                return;
            }
            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if (p2Var instanceof xn) {
                finishFragment();
                ((xn) p2Var).V.a1(null, str, false, false);
            }
        }
    }

    @Override // org.telegram.ui.iy
    public final /* synthetic */ boolean C() {
        return false;
    }

    public final void C3() {
        org.telegram.ui.Components.jw0 jw0Var = this.Q;
        if (jw0Var != null) {
            jw0Var.setVisibility(!this.C5 && this.E5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0472  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C4(float f10, float f11, int i10, View view) {
        TLRPC.Chat chat;
        String publicUsername;
        TLRPC.TL_username findUsername;
        String sb;
        String str;
        TLRPC.UserFull userFull;
        TLRPC.UserFull userFull2;
        String str2;
        float f12;
        float f13;
        ViewGroup view2;
        View view3 = view;
        int i11 = 4;
        String str3 = "";
        int i12 = 1;
        int i13 = 0;
        if (i10 == this.I3 || i10 == this.S2) {
            if (this.b1 == 0) {
                if (this.c1 != 0 && (chat = getMessagesController().getChat(Long.valueOf(this.c1))) != null && (this.d1 != 0 || ChatObject.isPublic(chat))) {
                    publicUsername = ChatObject.getPublicUsername(chat);
                    findUsername = DialogObject.findUsername(publicUsername, chat);
                    if (this.b1 != 0) {
                    }
                }
                return false;
            }
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b1));
            publicUsername = UserObject.getPublicUsername(user);
            if (user != null && publicUsername != null) {
                findUsername = DialogObject.findUsername(publicUsername, user);
                if (this.b1 != 0) {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.c1));
                    if (ChatObject.isPublic(chat2)) {
                        StringBuilder sb2 = new StringBuilder("https://");
                        sb2.append(getMessagesController().linkPrefix);
                        sb2.append("/");
                        sb2.append(ChatObject.getPublicUsername(chat2));
                        if (this.d1 != 0) {
                            str3 = "/" + this.d1;
                        }
                        sb2.append(str3);
                        sb = sb2.toString();
                    } else {
                        StringBuilder sb3 = new StringBuilder("https://");
                        sb3.append(getMessagesController().linkPrefix);
                        sb3.append("/c/");
                        sb3.append(chat2.id);
                        if (this.d1 != 0) {
                            str3 = "/" + this.d1;
                        }
                        sb3.append(str3);
                        sb = sb3.toString();
                    }
                    gz0 gz0Var = new gz0(this, getParentActivity(), sb, sb);
                    showDialog(gz0Var);
                    if (findUsername != null && !findUsername.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername.username = findUsername.username;
                        tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo, new rr0(this, findUsername, gz0Var, i11)), getClassGuid());
                        return true;
                    }
                } else if (!J3(i10, view3)) {
                    if (findUsername != null && !findUsername.editable) {
                        TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo2 = new TL_fragment.TL_getCollectibleInfo();
                        TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername2 = new TL_fragment.TL_inputCollectibleUsername();
                        tL_inputCollectibleUsername2.username = findUsername.username;
                        tL_getCollectibleInfo2.collectible = tL_inputCollectibleUsername2;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo2, new sb0(16, this, findUsername)), getClassGuid());
                        return true;
                    }
                    try {
                        org.telegram.ui.Components.qc.a0(this).i(LocaleController.getString(R.string.UsernameCopied)).j();
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
        if (i10 != this.E3) {
            int i14 = 2;
            if (i10 == this.D3 || i10 == this.Q2) {
                if (!J3(i10, view3)) {
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.b1));
                    if (user2 != null && (str = user2.phone) != null && str.length() != 0 && getParentActivity() != null) {
                        if (i10 == this.D3 && user2.phone.startsWith("888")) {
                            TL_fragment.TL_inputCollectiblePhone tL_inputCollectiblePhone = new TL_fragment.TL_inputCollectiblePhone();
                            String str4 = user2.phone;
                            tL_inputCollectiblePhone.phone = str4;
                            TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo3 = new TL_fragment.TL_getCollectibleInfo();
                            tL_getCollectibleInfo3.collectible = tL_inputCollectiblePhone;
                            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getCollectibleInfo3, new rr0(this, str4, user2, 5)), getClassGuid());
                            return true;
                        }
                        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(this, view3);
                        H.W(this.a.V0(view3, false));
                        H.w = false;
                        if (i10 == this.D3) {
                            TLRPC.UserFull userFull3 = this.s2;
                            if (userFull3 != null && userFull3.phone_calls_available) {
                                H.c(R.drawable.msg_calls, LocaleController.getString(R.string.CallViaTelegram), new nx0(this, user2, i12), false);
                                if (this.s2.video_calls_available) {
                                    H.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new nx0(this, user2, i14), false);
                                }
                            }
                            if (!this.Y4) {
                                H.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.Call), new nx0(this, user2, 3), false);
                            }
                        }
                        H.c(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new nx0(this, user2, i11), false);
                        if (this.Y4) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AnonymousNumberNotice)));
                            int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                            int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                                int i15 = lastIndexOf - 1;
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.f51(AndroidUtilities.bold()), indexOf, i15, 33);
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I6, this.w0)), indexOf, i15, 33);
                            }
                            H.k();
                            H.p(13, AndroidUtilities.dp(200.0f), spannableStringBuilder);
                            if (H.z() instanceof TextView) {
                                TextView textView = (TextView) H.z();
                                textView.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, this.w0), 0, 6));
                                textView.setOnClickListener(new dg.m(23));
                            }
                        }
                        H.Z();
                        return true;
                    }
                }
                return true;
            }
            if (i10 == this.H3 || i10 == this.G3 || i10 == this.F3 || i10 == this.T2) {
                if (i10 != this.T2 || ((userFull = this.s2) != null && !TextUtils.isEmpty(userFull.about))) {
                    if (!J3(i10, view3)) {
                        if (view3 instanceof org.telegram.ui.Cells.j) {
                            org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view3;
                            if (jVar.T && jVar.Q <= 0.0f) {
                                jVar.h();
                                return false;
                            }
                        }
                        String str5 = null;
                        if (i10 == this.F3) {
                            TLRPC.ChatFull chatFull = this.r2;
                            if (chatFull != null) {
                                TLRPC.ChannelLocation channelLocation = chatFull.location;
                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                    str5 = ((TLRPC.TL_channelLocation) channelLocation).address;
                                }
                            }
                        } else if (i10 == this.H3) {
                            TLRPC.ChatFull chatFull2 = this.r2;
                            if (chatFull2 != null) {
                                str5 = chatFull2.about;
                            }
                        } else {
                            TLRPC.UserFull userFull4 = this.s2;
                            if (userFull4 != null) {
                                str5 = userFull4.about;
                            }
                        }
                        String str6 = str5;
                        if (!TextUtils.isEmpty(str6)) {
                            String[] strArr = {TranslateController.UNKNOWN_LANGUAGE};
                            boolean isContextTranslateEnabled = MessagesController.getInstance(this.currentAccount).getTranslateController().isContextTranslateEnabled();
                            boolean[] zArr = {i10 == this.T2 || i10 == this.H3 || i10 == this.G3};
                            String B = org.telegram.ui.Components.v31.B();
                            kh.m2 m2Var = new kh.m2(this, view3, str6, i10, zArr, strArr, B);
                            if (!zArr[0]) {
                                m2Var.run();
                                return true;
                            }
                            if (LanguageDetector.hasSupport()) {
                                LanguageDetector.detectLanguage(str6, new org.telegram.messenger.nj(this, strArr, zArr, B, isContextTranslateEnabled, m2Var), new il0(m2Var, 12));
                                return true;
                            }
                            m2Var.run();
                            return true;
                        }
                    }
                    return true;
                }
            } else if ((i10 == this.L3 || i10 == this.M3) && getParentActivity() != null && (userFull2 = this.s2) != null) {
                if (i10 != this.L3) {
                    if (i10 == this.M3 && !J3(i10, view3)) {
                        TLRPC.TL_businessLocation tL_businessLocation = this.s2.business_location;
                        if (tL_businessLocation != null) {
                            str2 = tL_businessLocation.address;
                            String str7 = str2;
                            AtomicReference atomicReference = new AtomicReference();
                            org.telegram.ui.Components.jo joVar = new org.telegram.ui.Components.jo(getParentActivity(), R.drawable.popup_fixed_alert, i13, this.w0, 1);
                            joVar.R = new Path();
                            joVar.setFitItems(true);
                            org.telegram.ui.ActionBar.w0.c(false, false, joVar, R.drawable.msg_copy, LocaleController.getString(R.string.Copy), false, this.w0).setOnClickListener(new nh.o5(this, atomicReference, str7, i10, 5));
                            org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(joVar, -2, -2);
                            p1Var.e = true;
                            p1Var.c = 220;
                            p1Var.setOutsideTouchable(true);
                            p1Var.setClippingEnabled(true);
                            p1Var.setAnimationStyle(R.style.PopupContextAnimation);
                            p1Var.setFocusable(true);
                            joVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            p1Var.setInputMethodMode(2);
                            p1Var.getContentView().setFocusableInTouchMode(true);
                            atomicReference.set(p1Var);
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
                            p1Var.showAtLocation(getFragmentView(), 0, (int) (f12 - (joVar.getMeasuredWidth() / 2.0f)), (int) f13);
                            p1Var.b();
                            return true;
                        }
                    }
                    return true;
                }
                TL_account.TL_businessWorkHours tL_businessWorkHours = userFull2.business_work_hours;
                if (tL_businessWorkHours != null) {
                    str2 = uf.x0.f0(this.currentAccount, userFull2.user, tL_businessWorkHours);
                    String str72 = str2;
                    AtomicReference atomicReference2 = new AtomicReference();
                    org.telegram.ui.Components.jo joVar2 = new org.telegram.ui.Components.jo(getParentActivity(), R.drawable.popup_fixed_alert, i13, this.w0, 1);
                    joVar2.R = new Path();
                    joVar2.setFitItems(true);
                    org.telegram.ui.ActionBar.w0.c(false, false, joVar2, R.drawable.msg_copy, LocaleController.getString(R.string.Copy), false, this.w0).setOnClickListener(new nh.o5(this, atomicReference2, str72, i10, 5));
                    org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(joVar2, -2, -2);
                    p1Var2.e = true;
                    p1Var2.c = 220;
                    p1Var2.setOutsideTouchable(true);
                    p1Var2.setClippingEnabled(true);
                    p1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                    p1Var2.setFocusable(true);
                    joVar2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    p1Var2.setInputMethodMode(2);
                    p1Var2.getContentView().setFocusableInTouchMode(true);
                    atomicReference2.set(p1Var2);
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
                    p1Var2.showAtLocation(getFragmentView(), 0, (int) (f12 - (joVar2.getMeasuredWidth() / 2.0f)), (int) f13);
                    p1Var2.b();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.v40
    public final void D(float f10) {
        org.telegram.ui.Cells.y3 y3Var = this.d0;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(f10);
        this.k0.O(this.H2, f10);
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
    public final void D3(boolean z4) {
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
        boolean z23;
        boolean z24;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        boolean z25;
        TLRPC.ChatFull chatFull2;
        org.telegram.ui.Components.jh0 jh0Var;
        j01 j01Var;
        sz0 sz0Var;
        boolean z26;
        org.telegram.ui.Components.jh0 jh0Var2;
        boolean z27;
        long j10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || this.Q0 == null) {
            return;
        }
        Context context = kVar.getContext();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.Q0.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        this.M0 = null;
        this.K0 = false;
        this.I0 = false;
        this.H0 = false;
        this.J0 = false;
        this.x1 = false;
        if (this.b1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b1));
            if (user == null) {
                return;
            }
            if (UserObject.isUserSelf(user)) {
                if (this.p1) {
                    org.telegram.ui.Components.jh0 jh0Var3 = this.X;
                    if (jh0Var3 != null) {
                        this.K0 = !(jh0Var3.E == 6);
                    } else {
                        this.K0 = true;
                    }
                }
                if (!this.F0) {
                    this.Q0.e(30, R.drawable.msg_edit, LocaleController.getString(R.string.EditInfo));
                    if (this.n0 != null) {
                        this.Q0.e(36, R.drawable.msg_addphoto, LocaleController.getString(R.string.AddPhoto));
                    }
                }
                this.S0 = this.Q0.e(40, R.drawable.menu_profile_colors, LocaleController.getString(R.string.ProfileColorEdit));
                W4();
                if (this.p1) {
                    this.U0 = this.Q0.e(43, R.drawable.menu_username_change, LocaleController.getString(R.string.ProfileUsernameEdit));
                    this.T0 = this.Q0.e(42, R.drawable.msg_link2, LocaleController.getString(R.string.ProfileCopyLink));
                    c5();
                }
                z10 = false;
                z27 = false;
                z12 = true;
            } else {
                if (user.bot && user.bot_can_edit) {
                    this.K0 = true;
                }
                TLRPC.UserFull userFull = this.s2;
                if (userFull != null && userFull.phone_calls_available) {
                    this.I0 = true;
                    this.J0 = userFull.video_calls_available;
                }
                if (!this.o2 && getContactsController().contactsDict.get(Long.valueOf(this.b1)) != null) {
                    if (this.A2 == null) {
                        E3(context);
                    }
                    if (!TextUtils.isEmpty(user.phone)) {
                        this.Q0.e(3, R.drawable.msg_share, LocaleController.getString(R.string.ShareContact));
                    }
                    this.Q0.e(2, R.drawable.msg_block, LocaleController.getString(!this.h1 ? R.string.BlockContact : R.string.Unblock));
                    this.Q0.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditContact));
                    this.Q0.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteContact));
                } else if (MessagesController.isSupportUser(user)) {
                    if (this.h1) {
                        this.Q0.e(2, R.drawable.msg_block, LocaleController.getString(R.string.Unblock));
                    }
                    this.Q0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                } else if (a() != UserObject.VERIFY) {
                    if (this.A2 == null) {
                        E3(context);
                    }
                    this.Q0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    if (this.o2) {
                        this.Q0.e(10, R.drawable.msg_share, LocaleController.getString(R.string.BotShare));
                        z10 = true;
                    } else {
                        this.Q0.e(1, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddContact));
                        z10 = false;
                    }
                    if (!TextUtils.isEmpty(user.phone)) {
                        this.Q0.e(3, R.drawable.msg_share, LocaleController.getString(R.string.ShareContact));
                    }
                    if (this.o2) {
                        this.Q0.e(44, R.drawable.menu_privacy_policy, LocaleController.getString(R.string.BotPrivacyPolicy));
                        if (e4()) {
                            this.Q0.K(44);
                        } else {
                            this.Q0.r(44);
                        }
                        org.telegram.ui.ActionBar.g1 e = this.Q0.e(24, R.drawable.msg_report, LocaleController.getString(R.string.ReportBot));
                        int i10 = org.telegram.ui.ActionBar.j6.p7;
                        e.c(org.telegram.ui.ActionBar.j6.v0(i10, this.w0), org.telegram.ui.ActionBar.j6.v0(i10, this.w0));
                        if (this.h1) {
                            this.Q0.e(2, R.drawable.msg_retry, LocaleController.getString(R.string.BotRestart));
                        } else {
                            this.Q0.e(2, R.drawable.msg_block2, LocaleController.getString(R.string.DeleteAndBlock)).c(org.telegram.ui.ActionBar.j6.v0(i10, this.w0), org.telegram.ui.ActionBar.j6.v0(i10, this.w0));
                        }
                    } else {
                        this.Q0.e(2, R.drawable.msg_block, LocaleController.getString(!this.h1 ? R.string.BlockContact : R.string.Unblock));
                    }
                    if (!UserObject.isDeleted(user) && !this.o2 && this.A2 == null && !this.h1) {
                        j10 = this.b1;
                        if (j10 != 333000 && j10 != 777000 && j10 != 42777) {
                            if (!BuildVars.IS_BILLING_UNAVAILABLE || user.self || user.bot || MessagesController.isSupportUser(user) || getMessagesController().premiumPurchaseBlocked()) {
                                z27 = false;
                            } else {
                                lh.t7.y(this.currentAccount, false).V();
                                this.Q0.e(38, R.drawable.msg_gift_premium, LocaleController.getString(R.string.ProfileSendAGift));
                                z27 = true;
                            }
                            this.Q0.e(20, R.drawable.msg_secret, LocaleController.getString(R.string.StartEncryptedChat));
                            this.Q0.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.b1)));
                            if (this.s2 != null) {
                                this.Q0.e(46, R.drawable.menu_share_off_24, LocaleController.getString(R.string.DisableSharing));
                                this.Q0.e(47, R.drawable.menu_share_on_24, LocaleController.getString(R.string.EnableSharing));
                                TLRPC.UserFull userFull2 = this.s2;
                                boolean z28 = (userFull2.noforwards_my_enabled || userFull2.noforwards_peer_enabled) ? false : true;
                                this.Q0.I(46, z28);
                                this.Q0.I(47, !z28);
                            }
                            if (!this.o2 && getContactsController().contactsDict.get(Long.valueOf(this.b1)) != null) {
                                this.Q0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                            }
                            z12 = false;
                        }
                    }
                    z27 = false;
                    if (!this.o2) {
                        this.Q0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    }
                    z12 = false;
                }
                z10 = false;
                if (!UserObject.isDeleted(user)) {
                    j10 = this.b1;
                    if (j10 != 333000) {
                        if (BuildVars.IS_BILLING_UNAVAILABLE) {
                        }
                        z27 = false;
                        this.Q0.e(20, R.drawable.msg_secret, LocaleController.getString(R.string.StartEncryptedChat));
                        this.Q0.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.b1)));
                        if (this.s2 != null) {
                        }
                        if (!this.o2) {
                        }
                        z12 = false;
                    }
                }
                z27 = false;
                if (!this.o2) {
                }
                z12 = false;
            }
            z13 = z27;
            z11 = false;
        } else {
            if (this.c1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.c1));
                this.m1 = false;
                if (this.d1 == 0 && ChatObject.canChangeChatInfo(chat)) {
                    E3(context);
                }
                if (!ChatObject.isChannel(chat)) {
                    if (this.r2 != null) {
                        if (ChatObject.canManageCalls(chat) && this.r2.call == null) {
                            this.Q0.e(15, R.drawable.msg_voicechat, LocaleController.getString(R.string.StartVoipChat));
                            this.m1 = true;
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        ChatObject.Call groupCall = getMessagesController().getGroupCall(this.c1, false);
                        this.I0 = groupCall != null;
                        if (groupCall != null || z18) {
                            z14 = true;
                            if (ChatObject.canChangeChatInfo(chat)) {
                                this.K0 = true;
                            }
                            if (!ChatObject.isKickedFromChat(chat) && !ChatObject.isLeftFromChat(chat) && ((chatFull = this.r2) == null || !chatFull.participants_hidden || ChatObject.hasAdminRights(chat))) {
                                this.x1 = true;
                                this.Q0.e(17, R.drawable.msg_search, LocaleController.getString(R.string.SearchMembers));
                            }
                            if (this.d1 == 0) {
                                this.Q0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                            }
                            this.Q0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.DeleteAndExit));
                            z11 = z14;
                            z10 = false;
                            z12 = false;
                            z13 = false;
                            z15 = false;
                            z16 = false;
                            z17 = true;
                            z22 = false;
                            if (this.n0 == null) {
                            }
                            if (g4()) {
                            }
                            if (this.b1 != 0) {
                                org.telegram.ui.ActionBar.g1 e6 = this.Q0.e(24, R.drawable.msg_report, LocaleController.getString(R.string.ReportBot));
                                int i11 = org.telegram.ui.ActionBar.j6.p7;
                                e6.c(org.telegram.ui.ActionBar.j6.v0(i11, this.w0), org.telegram.ui.ActionBar.j6.v0(i11, this.w0));
                            }
                            if (z12) {
                                this.Q0.e(31, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
                            }
                            if (!this.m2) {
                            }
                            this.H0 = this.I0;
                            jh0Var = this.X;
                            if (jh0Var != null) {
                            }
                            if (!this.C5) {
                            }
                            j01Var = this.l0;
                            if (j01Var != null) {
                                if (this.K0) {
                                }
                                if (this.I0) {
                                }
                                if (this.J0) {
                                }
                            }
                            sz0Var = this.L;
                            if (sz0Var != null) {
                            }
                            l5(false);
                        }
                    }
                    z14 = false;
                    if (ChatObject.canChangeChatInfo(chat)) {
                    }
                    if (!ChatObject.isKickedFromChat(chat)) {
                        this.x1 = true;
                        this.Q0.e(17, R.drawable.msg_search, LocaleController.getString(R.string.SearchMembers));
                    }
                    if (this.d1 == 0) {
                    }
                    this.Q0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.DeleteAndExit));
                    z11 = z14;
                    z10 = false;
                    z12 = false;
                    z13 = false;
                    z15 = false;
                    z16 = false;
                    z17 = true;
                    z22 = false;
                    if (this.n0 == null) {
                    }
                    if (g4()) {
                    }
                    if (this.b1 != 0) {
                    }
                    if (z12) {
                    }
                    if (!this.m2) {
                    }
                    this.H0 = this.I0;
                    jh0Var = this.X;
                    if (jh0Var != null) {
                    }
                    if (!this.C5) {
                    }
                    j01Var = this.l0;
                    if (j01Var != null) {
                    }
                    sz0Var = this.L;
                    if (sz0Var != null) {
                    }
                    l5(false);
                }
                if (this.n1) {
                    if (ChatObject.canManageTopic(this.currentAccount, chat, this.d1)) {
                        this.K0 = true;
                    }
                } else if (ChatObject.hasAdminRights(chat) || (chat.megagroup && ChatObject.canChangeChatInfo(chat))) {
                    this.K0 = true;
                }
                if (this.r2 != null) {
                    if (ChatObject.canManageCalls(chat) && this.r2.call == null) {
                        this.Q0.e(15, R.drawable.msg_voicechat, LocaleController.getString((!chat.megagroup || chat.gigagroup) ? R.string.StartVoipChannel : R.string.StartVoipChat));
                        this.m1 = true;
                        if (!chat.megagroup || chat.gigagroup) {
                            z25 = false;
                            z20 = true;
                            chatFull2 = this.r2;
                            if ((!chatFull2.can_view_stats || chatFull2.can_view_revenue || chatFull2.can_view_stars_revenue || getMessagesController().getStoriesController().j(a())) && this.d1 == 0) {
                                this.Q0.e(19, R.drawable.msg_stats, LocaleController.getString(R.string.Statistics));
                            }
                            ChatObject.Call groupCall2 = getMessagesController().getGroupCall(this.c1, false);
                            this.I0 = groupCall2 == null;
                            z19 = groupCall2 == null || z25;
                        } else {
                            z25 = true;
                        }
                    } else {
                        z25 = false;
                    }
                    z20 = false;
                    chatFull2 = this.r2;
                    if (!chatFull2.can_view_stats) {
                    }
                    this.Q0.e(19, R.drawable.msg_stats, LocaleController.getString(R.string.Statistics));
                    ChatObject.Call groupCall22 = getMessagesController().getGroupCall(this.c1, false);
                    this.I0 = groupCall22 == null;
                    if (groupCall22 == null) {
                    }
                } else {
                    z19 = false;
                    z20 = false;
                }
                getMessagesController().getStoriesController().getClass();
                if (chat == null || !ChatObject.isBoostSupported(chat) || (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.post_stories))) {
                    getMessagesController().getStoriesController().getClass();
                    if (chat != null && ChatObject.isBoostSupported(chat) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories))) {
                        this.Q0.e(39, R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories));
                    }
                    z21 = false;
                } else {
                    this.Q0.e(39, R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories));
                    z21 = true;
                }
                if (chat.megagroup) {
                    TLRPC.ChatFull chatFull3 = this.r2;
                    if (chatFull3 == null || !chatFull3.participants_hidden || ChatObject.hasAdminRights(chat)) {
                        this.x1 = true;
                        this.Q0.e(17, R.drawable.msg_search, LocaleController.getString(R.string.SearchMembers));
                    }
                    if (this.n1) {
                        z22 = z20;
                        if (ChatObject.canDeleteTopic(this.currentAccount, chat, this.d1)) {
                            this.Q0.e(23, R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1));
                        }
                    } else {
                        z22 = z20;
                    }
                    if (this.d1 == 0) {
                        this.Q0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    }
                    if (chat.creator) {
                        this.Q0.a(-1);
                        this.Q0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMega));
                        this.Q0.e(45, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteMega)).c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, this.w0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, this.w0));
                    } else if (chat.left || chat.kicked || this.n1) {
                        z11 = z19;
                        z15 = z21;
                        z10 = false;
                        z12 = false;
                        z13 = false;
                        z16 = false;
                        z17 = false;
                    } else {
                        this.Q0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMega));
                    }
                    z11 = z19;
                    z15 = z21;
                    z10 = false;
                    z12 = false;
                    z13 = false;
                    z16 = false;
                    z17 = true;
                } else {
                    z22 = z20;
                    if (ChatObject.isPublic(chat)) {
                        this.Q0.e(10, R.drawable.msg_share, LocaleController.getString(R.string.BotShare));
                        z23 = !chat.creator;
                    } else {
                        z23 = false;
                    }
                    if (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked()) {
                        z13 = false;
                    } else {
                        lh.t7.y(this.currentAccount, false).V();
                        this.Q0.e(38, R.drawable.msg_gift_premium, LocaleController.getString(R.string.ProfileSendAGiftToChannel));
                        org.telegram.ui.ActionBar.w0 w0Var = this.Q0;
                        TLRPC.ChatFull chatFull4 = this.r2;
                        w0Var.I(38, chatFull4 != null && chatFull4.stargifts_available);
                        z13 = true;
                    }
                    TLRPC.ChatFull chatFull5 = this.r2;
                    if (chatFull5 == null || chatFull5.linked_chat_id == 0) {
                        z24 = false;
                    } else {
                        this.Q0.e(22, R.drawable.msg_discussion, LocaleController.getString(R.string.ViewDiscussion));
                        z24 = true;
                    }
                    if (this.d1 == 0) {
                        this.Q0.e(14, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
                    }
                    TLRPC.Chat chat2 = this.B2;
                    if (chat2.creator) {
                        this.Q0.a(-1);
                        this.Q0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveChannel));
                        this.Q0.e(45, R.drawable.msg_delete, LocaleController.getString(R.string.ChannelDelete)).c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, this.w0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, this.w0));
                    } else if (chat2.left || chat2.kicked) {
                        boolean z29 = z23;
                        z11 = z19;
                        z10 = z29;
                        z16 = z24;
                        z17 = false;
                        z15 = z21;
                        z12 = false;
                    } else {
                        this.Q0.e(7, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveChannel));
                    }
                    boolean z30 = z23;
                    z11 = z19;
                    z10 = z30;
                    z16 = z24;
                    z17 = true;
                    z15 = z21;
                    z12 = false;
                }
                if (this.n0 == null) {
                    this.Q0.e(33, R.drawable.msg_openprofile, LocaleController.getString(R.string.SetAsMain));
                    this.Q0.e(21, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery));
                    this.Q0.e(35, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
                } else {
                    this.Q0.e(21, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery));
                }
                if (g4()) {
                    this.Q0.r(21);
                }
                if (this.b1 != 0 && !this.o2 && !this.p1) {
                    org.telegram.ui.ActionBar.g1 e62 = this.Q0.e(24, R.drawable.msg_report, LocaleController.getString(R.string.ReportBot));
                    int i112 = org.telegram.ui.ActionBar.j6.p7;
                    e62.c(org.telegram.ui.ActionBar.j6.v0(i112, this.w0), org.telegram.ui.ActionBar.j6.v0(i112, this.w0));
                }
                if (z12 && !this.p1) {
                    this.Q0.e(31, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
                }
                if (!this.m2) {
                    this.Q0.r(21);
                    this.Q0.r(33);
                    this.Q0.K(36);
                    this.Q0.r(34);
                    this.Q0.r(35);
                }
                this.H0 = this.I0;
                jh0Var = this.X;
                if (jh0Var != null) {
                    jh0Var.F = true;
                    jh0Var.o(4, z10);
                    this.X.o(5, this.I0);
                    this.X.o(6, this.J0);
                    this.X.o(2, z16);
                    this.X.o(9, z17);
                    this.X.o(12, z15);
                    this.X.o(10, z11);
                    this.X.o(11, z22);
                    this.X.o(3, z13);
                    this.J0 = false;
                    this.I0 = false;
                    if (!z16) {
                        if (this.n1) {
                            this.X.o(0, true);
                        } else if (this.c1 != 0) {
                            TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(this.c1));
                            if (ChatObject.isForum(chat3) || ChatObject.isMegagroup(chat3)) {
                                z26 = false;
                                this.X.o(0, true);
                            } else if (!ChatObject.isChannel(chat3)) {
                                z26 = false;
                                this.X.o(0, true);
                            }
                            jh0Var2 = this.X;
                            if (jh0Var2.F) {
                                jh0Var2.F = z26;
                                jh0Var2.d();
                            }
                        }
                    }
                    z26 = false;
                    jh0Var2 = this.X;
                    if (jh0Var2.F) {
                    }
                }
                if (!this.C5) {
                    if (this.I0) {
                        if (this.N0.getVisibility() != 0) {
                            this.N0.setVisibility(0);
                            if (z4) {
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
                            if (z4) {
                                this.O0.setAlpha(0.0f);
                                this.O0.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    } else if (this.O0.getVisibility() != 8) {
                        this.O0.setVisibility(8);
                    }
                    if (this.K0) {
                        if (this.P0.getVisibility() != 0) {
                            this.P0.setVisibility(0);
                            if (z4) {
                                this.P0.setAlpha(0.0f);
                                this.P0.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    } else if (this.P0.getVisibility() != 8) {
                        this.P0.setVisibility(8);
                    }
                }
                j01Var = this.l0;
                if (j01Var != null && j01Var.h && !j01Var.d.isRunning()) {
                    if (this.K0) {
                        this.P0.setVisibility(8);
                        this.P0.animate().cancel();
                        this.P0.setAlpha(1.0f);
                    }
                    if (this.I0) {
                        this.N0.setVisibility(8);
                        this.N0.animate().cancel();
                        this.N0.setAlpha(1.0f);
                    }
                    if (this.J0) {
                        this.O0.setVisibility(8);
                        this.O0.animate().cancel();
                        this.O0.setAlpha(1.0f);
                    }
                }
                sz0Var = this.L;
                if (sz0Var != null) {
                    sz0Var.getSearchItem().requestLayout();
                }
                l5(false);
            }
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
        }
        z15 = false;
        z16 = false;
        z17 = false;
        z22 = false;
        if (this.n0 == null) {
        }
        if (g4()) {
        }
        if (this.b1 != 0) {
        }
        if (z12) {
        }
        if (!this.m2) {
        }
        this.H0 = this.I0;
        jh0Var = this.X;
        if (jh0Var != null) {
        }
        if (!this.C5) {
        }
        j01Var = this.l0;
        if (j01Var != null) {
        }
        sz0Var = this.L;
        if (sz0Var != null) {
        }
        l5(false);
    }

    public final void D4() {
        ValueAnimator valueAnimator;
        if (!this.m2 || (valueAnimator = this.g2) == null || !valueAnimator.isRunning()) {
            E4(y3(), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        } else {
            this.b2 = this.H5;
            this.d2 = this.I5;
        }
    }

    @Override // org.telegram.ui.Components.jt0
    public final void E() {
        G4(false);
    }

    public final void E3(Context context) {
        this.X0 = new org.telegram.ui.Components.h8(context, this.Q0.getPopupLayout().getSwipeBack(), new ly0(this), false, 0, this.w0);
        if (this.f1 > 0 || this.b1 > 0) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, this.w0);
            org.telegram.ui.Components.h8 h8Var = this.X0;
            org.telegram.ui.Components.e90 e90Var = h8Var.e;
            if (e90Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AutoDeletePopupDescription));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.AutoDeletePopupDescription2), v02, new org.telegram.ui.Components.fg(h8Var, 10)));
                e90Var.setText(spannableStringBuilder);
            }
        }
        TLRPC.UserFull userFull = this.s2;
        org.telegram.ui.Components.x11 a2 = org.telegram.ui.Components.x11.a((userFull == null && this.r2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.r2.ttl_period);
        this.p0 = a2;
        this.W0 = this.Q0.i(0, a2, LocaleController.getString(R.string.AutoDeletePopupTitle), this.X0.a);
        this.Q0.a(-1);
        T4();
    }

    public final void E4(float f10, float f11) {
        float max = Math.max(0.0f, Math.min(1.0f, (this.N1 - T3()) / ((this.a.getMeasuredWidth() - f11) - U3())));
        float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (AndroidUtilities.dp(42.0f) * ((this.N1 >= ((float) T3()) || max >= 0.33f) ? AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) : e2.c.v(f10, 72.0f, 24.0f, 42.0f)))) * f10) + ((float) Math.floor(this.actionBar.getTranslationY() + ((((1.0f + f10) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f)) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f))));
        this.b2 = (AndroidUtilities.dp(7.0f) * f10) + AndroidUtilities.dp(1.3f) + dpf2;
        this.d2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * f10) + dpf2 + AndroidUtilities.dp(24.0f);
    }

    public final void F3() {
        if (this.fragmentView == null || !this.U5 || this.v2 == null || getParentActivity() == null) {
            return;
        }
        y01 y01Var = this.Z5;
        if (y01Var != null) {
            y01Var.b(this.v2);
            this.Z5.invalidate();
        } else {
            y01 y01Var2 = new y01(this, this.v2);
            this.Z5 = y01Var2;
            ((FrameLayout) this.fragmentView).addView(y01Var2, k7.b6.e(-1, -1, 55));
        }
    }

    public final void F4() {
        my0 my0Var = this.a;
        if (my0Var == null || this.c == null || my0Var.getChildCount() <= 0 || this.T5) {
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
            this.R5 = i11;
            int top = view.getTop();
            this.S5 = top;
            if (this.R5 == 0 && !this.l2 && top > T3()) {
                this.S5 = T3();
            }
            this.c.h1(i11, view.getTop() - this.a.getPaddingTop());
        }
    }

    public final void G4(boolean z4) {
        int i10 = this.G4;
        if (i10 >= 0) {
            if (!z4) {
                this.c.h1(i10, -this.a.getPaddingTop());
                return;
            }
            wh.o oVar = new wh.o(getParentActivity(), 2, 0.6f);
            oVar.a = this.G4;
            oVar.p = -this.a.getPaddingTop();
            this.c.w0(oVar);
        }
    }

    public final void H3(float f10) {
        ValueAnimator ofFloat;
        int i10 = 1;
        boolean z4 = f10 > 0.0f;
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.Q5;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.Q5 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z4) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.u0.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new ux0(this, i10));
        this.Q5.playTogether(arrayList);
        this.Q5.setDuration(z4 ? 150L : 220L);
        if (!z4) {
            this.Q5.addListener(new jz0(this, 4));
        }
        this.Q5.start();
    }

    @Override // org.telegram.ui.Components.v40
    public final void I(boolean z4, boolean z10) {
        org.telegram.ui.Cells.y3 y3Var = this.d0;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(0.0f);
    }

    public final void I3(int i10, View view) {
        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(this, view);
        H.W(this.a.V0(view, false));
        H.w = false;
        H.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new ob0(this, 25), this.s2 != null);
        H.c(R.drawable.msg_edit, LocaleController.getString(R.string.Edit), new ob0(this, 26), false);
        H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.hm(this, i10, 21), true);
        H.Z();
    }

    public final void I4() {
        org.telegram.ui.Components.jh0 jh0Var = this.X;
        if (jh0Var == null) {
            return;
        }
        if (this.p1) {
            jh0Var.E = 6;
            return;
        }
        if (this.n1) {
            jh0Var.E = 5;
            return;
        }
        if (this.o2) {
            jh0Var.E = 2;
            return;
        }
        if (this.b1 != 0) {
            jh0Var.E = 0;
            return;
        }
        if (this.c1 != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.c1));
            if (!ChatObject.isChannel(chat)) {
                this.X.E = 3;
                return;
            }
            if (ChatObject.isMegagroup(chat)) {
                this.X.E = 3;
            } else if (ChatObject.isForum(chat)) {
                this.X.E = 4;
            } else {
                this.X.E = 1;
            }
        }
    }

    public final boolean J3(final int i10, View view) {
        TLRPC.User currentUser;
        String str;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (this.p1 && (currentUser = getUserConfig().getCurrentUser()) != null) {
            final TLRPC.UserFull userFull = this.s2;
            if (userFull == null) {
                userFull = getMessagesController().getUserFull(currentUser.id);
            }
            if (userFull != null) {
                String string = LocaleController.getString(R.string.Copy);
                if (i10 == this.H3 || i10 == this.G3 || i10 == this.T2) {
                    str = userFull.about;
                } else if (i10 == this.L3) {
                    str = uf.x0.f0(this.currentAccount, currentUser, userFull.business_work_hours);
                    string = LocaleController.getString(R.string.ProfileHoursCopy);
                } else if (i10 == this.M3) {
                    str = userFull.business_location.address;
                    string = LocaleController.getString(R.string.ProfileLocationCopy);
                } else if (i10 == this.I3) {
                    str = UserObject.getPublicUsername(currentUser);
                    if (str != null) {
                        str = "@".concat(str);
                    }
                    string = LocaleController.getString(R.string.ProfileCopyUsername);
                } else {
                    str = i10 == this.D3 ? currentUser.phone : i10 == this.R2 ? UserInfoActivity.Z(this.s2.birthday) : null;
                }
                org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(this, view);
                H.W(this.a.V0(view, false));
                H.w = false;
                H.i = 3;
                if (i10 == this.M3 && (tL_businessLocation = userFull.business_location) != null) {
                    if (tL_businessLocation.geo_point != null) {
                        H.c(R.drawable.msg_view_file, LocaleController.getString(R.string.ProfileLocationView), new ob0(this, 5), false);
                    }
                    H.c(R.drawable.msg_map, LocaleController.getString(R.string.ProfileLocationMaps), new ob0(this, 7), false);
                }
                if (str != null) {
                    H.c(R.drawable.msg_copy, string, new el0(str, 26), false);
                }
                if (i10 == this.L3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileHoursEdit), new ob0(this, 8), false);
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
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final int i12 = 0;
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i13 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.xx0
                                        @Override // org.telegram.ui.ActionBar.c2
                                        public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i14) {
                                            switch (i12) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull3 = userFull2;
                                                    userFull3.business_work_hours = null;
                                                    userFull3.flags2 &= -2;
                                                    ProfileActivity profileActivity2 = profileActivity;
                                                    profileActivity2.getConnectionsManager().sendRequest(updatebusinessworkhours, new zx0(profileActivity2, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new zx0(profileActivity3, 1));
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
                                    alertDialog$Builder2.a.O = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.a.Q = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final int i14 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i15 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.xx0
                                        @Override // org.telegram.ui.ActionBar.c2
                                        public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i142) {
                                            switch (i14) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new zx0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new zx0(profileActivity3, 1));
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
                } else if (i10 == this.M3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileLocationEdit), new ob0(this, 9), false);
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
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.BusinessHoursClearTitle);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.BusinessHoursClearMessage);
                                    String string2 = LocaleController.getString(R.string.Remove);
                                    final int i122 = 0;
                                    final TLRPC.UserFull userFull2 = userFull;
                                    final int i13 = i10;
                                    alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.xx0
                                        @Override // org.telegram.ui.ActionBar.c2
                                        public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i142) {
                                            switch (i122) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull2;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new zx0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new zx0(profileActivity3, 1));
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
                                    alertDialog$Builder2.a.O = LocaleController.getString(R.string.BusinessLocationClearTitle);
                                    alertDialog$Builder2.a.Q = LocaleController.getString(R.string.BusinessLocationClearMessage);
                                    String string3 = LocaleController.getString(R.string.Remove);
                                    final int i14 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    final int i15 = i10;
                                    alertDialog$Builder2.k(string3, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.xx0
                                        @Override // org.telegram.ui.ActionBar.c2
                                        public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i142) {
                                            switch (i14) {
                                                case 0:
                                                    TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
                                                    TLRPC.UserFull userFull32 = userFull3;
                                                    userFull32.business_work_hours = null;
                                                    userFull32.flags2 &= -2;
                                                    ProfileActivity profileActivity22 = profileActivity2;
                                                    profileActivity22.getConnectionsManager().sendRequest(updatebusinessworkhours, new zx0(profileActivity22, 0));
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
                                                    profileActivity3.getConnectionsManager().sendRequest(updatebusinesslocation, new zx0(profileActivity3, 1));
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
                } else if (i10 == this.I3) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new ob0(this, 10), false);
                } else if (i10 == this.H3 || i10 == this.G3 || i10 == this.T2) {
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileEditBio), new ob0(this, 11), false);
                } else if (i10 == this.D3) {
                    H.c(R.drawable.menu_storage_path, LocaleController.getString(R.string.ProfilePhoneEdit), new ob0(this, 12), false);
                } else if (i10 == this.R2) {
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
                                    profileActivity.showDialog(org.telegram.ui.Components.z4.m(parentActivity, string2, string3, userFull2.birthday, new org.telegram.ui.Components.vk(23, profileActivity, userFull2), new ob0(profileActivity, 13), false, false, profileActivity.w0).a);
                                    break;
                                case 1:
                                    final ProfileActivity profileActivity2 = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.BirthdayClearTitle);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.BirthdayClearMessage);
                                    String string4 = LocaleController.getString(R.string.Remove);
                                    final int i14 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.vx0
                                        @Override // org.telegram.ui.ActionBar.c2
                                        public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i15) {
                                            switch (i14) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull4 = userFull3;
                                                    userFull4.personal_channel_id = 0L;
                                                    userFull4.personal_channel_message = 0;
                                                    userFull4.flags2 &= -65;
                                                    ProfileActivity profileActivity3 = profileActivity2;
                                                    profileActivity3.getConnectionsManager().sendRequest(updatepersonalchannel, new zx0(profileActivity3, 3));
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
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new zx0(profileActivity4, 2));
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
                                    alertDialog$Builder2.a.O = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                    alertDialog$Builder2.a.Q = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                    String string5 = LocaleController.getString(R.string.Remove);
                                    final int i15 = 0;
                                    final TLRPC.UserFull userFull4 = userFull;
                                    alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.vx0
                                        @Override // org.telegram.ui.ActionBar.c2
                                        public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i152) {
                                            switch (i15) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull4;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity3;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new zx0(profileActivity32, 3));
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
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new zx0(profileActivity4, 2));
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
                                    profileActivity.showDialog(org.telegram.ui.Components.z4.m(parentActivity, string2, string3, userFull2.birthday, new org.telegram.ui.Components.vk(23, profileActivity, userFull2), new ob0(profileActivity, 13), false, false, profileActivity.w0).a);
                                    break;
                                case 1:
                                    final ProfileActivity profileActivity2 = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.BirthdayClearTitle);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.BirthdayClearMessage);
                                    String string4 = LocaleController.getString(R.string.Remove);
                                    final int i142 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.vx0
                                        @Override // org.telegram.ui.ActionBar.c2
                                        public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i152) {
                                            switch (i142) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull3;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity2;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new zx0(profileActivity32, 3));
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
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new zx0(profileActivity4, 2));
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
                                    alertDialog$Builder2.a.O = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                    alertDialog$Builder2.a.Q = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                    String string5 = LocaleController.getString(R.string.Remove);
                                    final int i15 = 0;
                                    final TLRPC.UserFull userFull4 = userFull;
                                    alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.vx0
                                        @Override // org.telegram.ui.ActionBar.c2
                                        public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i152) {
                                            switch (i15) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull4;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity3;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new zx0(profileActivity32, 3));
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
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new zx0(profileActivity4, 2));
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
                } else if (i10 == this.N2) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(userFull.personal_channel_id));
                    if (chat != null && ChatObject.getPublicUsername(chat) != null) {
                        H.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileChannelCopy), new zq0(19, this, chat), false);
                    }
                    H.c(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileChannelChange), new ob0(this, 6), false);
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
                                    profileActivity.showDialog(org.telegram.ui.Components.z4.m(parentActivity, string2, string3, userFull2.birthday, new org.telegram.ui.Components.vk(23, profileActivity, userFull2), new ob0(profileActivity, 13), false, false, profileActivity.w0).a);
                                    break;
                                case 1:
                                    final ProfileActivity profileActivity2 = this.b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity2.getParentActivity());
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.BirthdayClearTitle);
                                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.BirthdayClearMessage);
                                    String string4 = LocaleController.getString(R.string.Remove);
                                    final int i142 = 1;
                                    final TLRPC.UserFull userFull3 = userFull;
                                    alertDialog$Builder.k(string4, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.vx0
                                        @Override // org.telegram.ui.ActionBar.c2
                                        public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i152) {
                                            switch (i142) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull3;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity2;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new zx0(profileActivity32, 3));
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
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new zx0(profileActivity4, 2));
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
                                    alertDialog$Builder2.a.O = LocaleController.getString(R.string.ProfileChannelClearTitle);
                                    alertDialog$Builder2.a.Q = LocaleController.getString(R.string.ProfileChannelClearMessage);
                                    String string5 = LocaleController.getString(R.string.Remove);
                                    final int i152 = 0;
                                    final TLRPC.UserFull userFull4 = userFull;
                                    alertDialog$Builder2.k(string5, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.vx0
                                        @Override // org.telegram.ui.ActionBar.c2
                                        public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i1522) {
                                            switch (i152) {
                                                case 0:
                                                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                                                    updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
                                                    TLRPC.UserFull userFull42 = userFull4;
                                                    userFull42.personal_channel_id = 0L;
                                                    userFull42.personal_channel_message = 0;
                                                    userFull42.flags2 &= -65;
                                                    ProfileActivity profileActivity32 = profileActivity3;
                                                    profileActivity32.getConnectionsManager().sendRequest(updatepersonalchannel, new zx0(profileActivity32, 3));
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
                                                    profileActivity4.getConnectionsManager().sendRequest(updatebirthday, new zx0(profileActivity4, 2));
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
        boolean z4;
        s01 s01Var;
        int i10;
        int d;
        lh.u0 u0Var;
        u01 u01Var;
        if (this.actionBar == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        this.i2 = f10;
        float lerp = AndroidUtilities.lerp(this.j2, f10);
        this.h2 = lerp;
        B3();
        this.V.setScaleX(this.Y1);
        this.V.setScaleY(this.Y1);
        this.V.setTranslationY(AndroidUtilities.lerp((float) Math.ceil(this.X1), 0.0f, lerp));
        this.b0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, lerp));
        wy0 wy0Var = this.b0;
        float f11 = this.Y1;
        boolean z10 = this.m2;
        wy0Var.E = lerp;
        wy0Var.F = f11;
        wy0Var.D = z10;
        zy0 zy0Var = this.r0;
        if (zy0Var != null) {
            zy0Var.setExpandProgress(lerp);
        }
        lh.u0 u0Var2 = this.s0;
        if (u0Var2 != null) {
            u0Var2.setExpandProgress(lerp);
        }
        org.telegram.ui.Components.jw0 jw0Var = this.Q;
        if (jw0Var != null) {
            jw0Var.setParentExpanded(lerp);
        }
        org.telegram.ui.Components.jh0 jh0Var = this.X;
        if (jh0Var != null) {
            jh0Var.setParentExpanded(lerp);
        }
        org.telegram.ui.Components.ci0 ci0Var = this.Z;
        if (ci0Var != null) {
            ci0Var.setParentExpanded(lerp);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.R0;
        if (w0Var != null) {
            float f12 = 1.0f - lerp;
            w0Var.setAlpha(f12);
            this.R0.setScaleY(f12);
            this.R0.setVisibility(0);
            org.telegram.ui.ActionBar.w0 w0Var2 = this.R0;
            w0Var2.setClickable(w0Var2.getAlpha() > 0.5f);
        }
        float y32 = y3();
        if (y32 >= 1.0f) {
            this.b0.setAlpha(1.0f);
        }
        if (!this.m2) {
            E4(y32, currentActionBarHeight);
        } else if (this.N1 >= U3() && this.e2 < 0.33f) {
            D4();
        }
        org.telegram.ui.Components.fm0 fm0Var = this.I;
        if (fm0Var != null) {
            fm0Var.b(i0.a.d(lerp, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h8, this.w0), Color.argb(179, 255, 255, 255)));
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.N5 != null ? -1 : i0.a.d(lerp, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pc, this.w0), -1), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.mr[] mrVarArr = this.G;
        org.telegram.ui.Components.mr mrVar = mrVarArr[0];
        if (mrVar != null) {
            mrVar.b(lerp);
        }
        org.telegram.ui.Components.mr mrVar2 = mrVarArr[1];
        if (mrVar2 != null) {
            mrVar2.b(lerp);
        }
        org.telegram.ui.Components.mr[] mrVarArr2 = this.H;
        org.telegram.ui.Components.mr mrVar3 = mrVarArr2[0];
        if (mrVar3 != null) {
            mrVar3.b(lerp);
        }
        org.telegram.ui.Components.mr mrVar4 = mrVarArr2[1];
        if (mrVar4 != null) {
            mrVar4.b(lerp);
        }
        Y4(lerp);
        float f13 = this.a2;
        float f14 = this.c2;
        if (y32 < 1.0f) {
            f13 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(63.0f), f13, y32);
            f14 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(63.0f), f14, y32);
        }
        float dpf2 = AndroidUtilities.dpf2(8.0f);
        float dpf22 = AndroidUtilities.dpf2(this.m2 ? 8.0f : -24.0f);
        float dpf23 = AndroidUtilities.dpf2(18.0f);
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f;
        float f15 = dpf23 - ((FrameLayout.LayoutParams) k5VarArr[1].getLayoutParams()).leftMargin;
        float f16 = currentActionBarHeight;
        float O3 = (((this.N1 + f16) - O3()) - AndroidUtilities.dpf2(30.0f)) - k5VarArr[1].getBottom();
        float x10 = e2.c.x(f15, f13, 2.0f, dpf2 + f13);
        float f17 = this.b2;
        float f18 = 1.0f - lerp;
        float f19 = f18 * f18;
        float f20 = f18 * 2.0f * lerp;
        float f21 = (x10 * f20) + (f13 * f19);
        float f22 = lerp * lerp;
        float f23 = (f15 * f22) + f21;
        float x11 = (O3 * f22) + (e2.c.x(O3, f17, 2.0f, dpf22 + f17) * f20) + (f17 * f19);
        float dpf24 = AndroidUtilities.dpf2(16.0f);
        org.telegram.ui.ActionBar.k5[] k5VarArr2 = this.r;
        float f24 = dpf24 - ((FrameLayout.LayoutParams) k5VarArr2[1].getLayoutParams()).leftMargin;
        float O32 = (((this.N1 + f16) - O3()) - AndroidUtilities.dpf2(10.0f)) - k5VarArr2[1].getBottom();
        float x12 = e2.c.x(f24, f14, 2.0f, dpf2 + f14);
        float f25 = this.d2;
        float f26 = (f24 * f22) + (x12 * f20) + (f14 * f19);
        float x13 = (f22 * O32) + (f20 * e2.c.x(O32, f25, 2.0f, dpf22 + f25)) + (f19 * f25);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
        float dpf25 = AndroidUtilities.dpf2(22.7f) + floor;
        k5VarArr[1].setTranslationX(f23);
        k5VarArr[1].setTranslationY(Math.max(floor, x11));
        k5VarArr2[1].setTranslationX(W3(f26));
        k5VarArr2[1].setTranslationY(X3(Math.max(dpf25, x13)));
        this.s.setTranslationX(f26);
        this.s.setTranslationY(Math.max(dpf25, x13));
        S4();
        f5();
        Object tag = k5VarArr2[1].getTag();
        if (tag instanceof Integer) {
            Integer num = (Integer) tag;
            v02 = org.telegram.ui.ActionBar.j6.v0(num.intValue(), this.w0);
            if (num.intValue() == org.telegram.ui.ActionBar.j6.Bh) {
                z4 = true;
                k5VarArr2[1].setTextColor(i0.a.d(lerp, w3(v02, Boolean.valueOf(z4)), -1275068417));
                if (this.N1 > U3()) {
                    k5VarArr[1].setPivotY(AndroidUtilities.lerp(0, r4.getMeasuredHeight(), lerp));
                    float f27 = (0.12f * y32) + 1.0f;
                    k5VarArr[1].setScaleX(AndroidUtilities.lerp(f27, 1.38f, lerp));
                    k5VarArr[1].setScaleY(AndroidUtilities.lerp(f27, 1.38f, lerp));
                }
                l4(0, Math.min(1.0f, y32), true);
                s01Var = this.Y5;
                if (s01Var != null) {
                    s01Var.a(i0.a.d(this.h2, org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.b(0.18f, -0.1f, this.Z0)), 603979775));
                }
                org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[1];
                if (this.N5 == null) {
                    d = -1;
                    i10 = -1;
                } else {
                    i10 = -1;
                    d = i0.a.d(this.h2, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vh, this.w0), -1);
                }
                k5Var.setTextColor(d);
                this.actionBar.C(this.N5 == null ? -1 : i0.a.d(lerp, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, this.w0), i10), false);
                this.actionBar.setMenuOffsetSuppressed(true);
                this.b0.setForegroundAlpha(lerp);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.V.getLayoutParams();
                layoutParams.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.a.getMeasuredWidth() / this.Y1, lerp);
                layoutParams.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.N1 + f16) / this.Y1, lerp);
                N3();
                this.V.requestLayout();
                u0Var = this.s0;
                if (u0Var != null) {
                    u0Var.setExpandProgress(lerp);
                }
                V4();
                u01Var = this.a1;
                if (u01Var == null && u01Var.H) {
                    u01Var.invalidate();
                    return;
                }
            }
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, this.w0);
        }
        z4 = false;
        k5VarArr2[1].setTextColor(i0.a.d(lerp, w3(v02, Boolean.valueOf(z4)), -1275068417));
        if (this.N1 > U3()) {
        }
        l4(0, Math.min(1.0f, y32), true);
        s01Var = this.Y5;
        if (s01Var != null) {
        }
        org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[1];
        if (this.N5 == null) {
        }
        k5Var2.setTextColor(d);
        this.actionBar.C(this.N5 == null ? -1 : i0.a.d(lerp, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, this.w0), i10), false);
        this.actionBar.setMenuOffsetSuppressed(true);
        this.b0.setForegroundAlpha(lerp);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.V.getLayoutParams();
        layoutParams2.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.a.getMeasuredWidth() / this.Y1, lerp);
        layoutParams2.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.N1 + f16) / this.Y1, lerp);
        N3();
        this.V.requestLayout();
        u0Var = this.s0;
        if (u0Var != null) {
        }
        V4();
        u01Var = this.a1;
        if (u01Var == null) {
        }
    }

    @Override // org.telegram.ui.iy
    public final /* synthetic */ boolean K(oy oyVar) {
        return false;
    }

    public final boolean K3() {
        View view;
        if ((this.F0 || (!AndroidUtilities.isTablet() && !this.k2)) && this.b0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            this.C0 = true;
            this.l2 = true;
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
                my0 my0Var = this.a;
                View F = my0Var.F(view);
                f2.l1 T = F != null ? my0Var.T(F) : null;
                if (T != null) {
                    Integer num = (Integer) this.V1.get(Integer.valueOf(T.b()));
                    if (num != null) {
                        this.M1 = true;
                        this.a.v0(0, -(((this.a.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight()) + num.intValue()), org.telegram.ui.Components.nr.h);
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
        this.r2 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.j1 == 0) {
                this.j1 = -j10;
                getMediaDataController().getMediaCounts(this.j1, this.d1, this.classGuid);
            }
        }
        sz0 sz0Var = this.L;
        if (sz0Var != null) {
            sz0Var.setChatInfo(this.r2);
        }
        xy0 xy0Var = this.k0;
        if (xy0Var != null && !this.n1) {
            xy0Var.setChatInfo(this.r2);
        }
        zy0 zy0Var = this.r0;
        if (zy0Var != null && (chatFull3 = this.r2) != null) {
            zy0Var.setStories(chatFull3.stories);
        }
        lh.u0 u0Var = this.s0;
        if (u0Var != null) {
            u0Var.a();
        }
        wy0 wy0Var = this.b0;
        if (wy0Var != null) {
            wy0Var.setHasStories(j4());
        }
        L3();
        if (this.c1 != 0) {
            boolean z4 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.r2) == null || !chatFull2.stargifts_available) ? false : true;
            this.Q0.I(38, z4);
            org.telegram.ui.Components.jh0 jh0Var = this.X;
            if (jh0Var != null) {
                jh0Var.o(3, z4);
            }
        }
    }

    public final void L3() {
        TLRPC.Chat chat = this.B2;
        if (chat == null || !chat.megagroup) {
            return;
        }
        TLRPC.ChatFull chatFull = this.r2;
        if (!(chatFull instanceof TLRPC.TL_channelFull) || chatFull.participants == null) {
            return;
        }
        for (int i10 = 0; i10 < this.r2.participants.participants.size(); i10++) {
            TLRPC.ChatParticipant chatParticipant = this.r2.participants.participants.get(i10);
            this.z1.k(chatParticipant, chatParticipant.user_id);
        }
    }

    public final void L4(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.W == null || (tL_emojiStatusCollectible2 = this.d6) == tL_emojiStatusCollectible) {
            return;
        }
        if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
            this.d6 = tL_emojiStatusCollectible;
            ph.f3 f3Var = this.a6;
            int i10 = 1;
            if (f3Var != null) {
                f3Var.e(true);
            }
            if (tL_emojiStatusCollectible == null || TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                return;
            }
            this.c6 = null;
            this.a6 = new ph.f3(getParentActivity(), 3);
            this.b6 = org.telegram.ui.ActionBar.j6.v(tL_emojiStatusCollectible.center_color | (-16777216), org.telegram.ui.ActionBar.j6.l1(0.5f, tL_emojiStatusCollectible.pattern_color | (-16777216)));
            this.a6.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            ph.f3 f3Var2 = this.a6;
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.5f, (-16777216) | tL_emojiStatusCollectible.text_color);
            f3Var2.x0 = true;
            f3Var2.F0 = System.currentTimeMillis();
            f3Var2.y0 = new Path();
            f3Var2.z0 = AndroidUtilities.dpf2(0.66f) / 2.0f;
            f3Var2.A0 = new Paint(1);
            f3Var2.B0 = new Paint(1);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, l1), org.telegram.ui.ActionBar.j6.l1(1.0f, l1), org.telegram.ui.ActionBar.j6.l1(0.0f, l1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            f3Var2.E0 = linearGradient;
            f3Var2.B0.setShader(linearGradient);
            f3Var2.C0 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, l1), org.telegram.ui.ActionBar.j6.l1(0.5f, l1), org.telegram.ui.ActionBar.j6.l1(0.0f, l1)}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
            f3Var2.D0 = new Matrix();
            f3Var2.A0.setShader(f3Var2.C0);
            f3Var2.B0.setStyle(Paint.Style.STROKE);
            f3Var2.B0.setStrokeJoin(Paint.Join.ROUND);
            f3Var2.B0.setStrokeCap(Paint.Cap.ROUND);
            f3Var2.B0.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
            this.W.addView(this.a6, k7.b6.c(24.0f, -1));
            this.a6.u(9.33f);
            ph.f3 f3Var3 = this.a6;
            Typeface bold = AndroidUtilities.bold();
            f3Var3.E.u(bold);
            f3Var3.G.setTypeface(bold);
            this.a6.t(tL_emojiStatusCollectible.title);
            ph.f3 f3Var4 = this.a6;
            f3Var4.d = -1L;
            f3Var4.l(5.66f, 2.66f, 5.66f, 2.66f);
            ph.f3 f3Var5 = this.a6;
            f3Var5.getClass();
            f3Var5.y = AndroidUtilities.dpf2(4.0f);
            f3Var5.B = AndroidUtilities.dpf2(2.66f);
            this.a6.s();
            this.a6.r(16.0f);
            this.a6.v();
            this.a6.setOnClickListener(new dy0(this, tL_emojiStatusCollectible.slug, i10));
            if (this.N1 < AndroidUtilities.dp(82.0f)) {
                this.c6 = Boolean.FALSE;
                this.a6.setAlpha(0.0f);
            }
            V4();
            ph.f3 f3Var6 = this.a6;
            Objects.requireNonNull(f3Var6);
            AndroidUtilities.runOnUIThread(new el0(f3Var6, 27), 6000L);
        }
    }

    @Override // org.telegram.ui.Components.ru0
    public final void M() {
        org.telegram.ui.Components.qu0 qu0Var;
        sz0 sz0Var = this.L;
        if (sz0Var != null && (qu0Var = this.O) != null) {
            sz0Var.setNewMediaCounts(qu0Var.c);
        }
        if (this.d != null) {
            e5(false, false);
        }
        R();
        if (this.s2 != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final boolean M3() {
        org.telegram.ui.ActionBar.e5 e5Var;
        if (this.G1 == 0 || (e5Var = this.parentLayout) == null || e5Var.getFragmentStack() == null || this.parentLayout.getFragmentStack().size() < 2 || !(this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof xn)) {
            return false;
        }
        finishFragment();
        return true;
    }

    public final void M4(zz0 zz0Var) {
        if (this.f5 == zz0Var) {
            return;
        }
        this.f5 = zz0Var;
        AndroidUtilities.forEachViews((RecyclerView) this.a, (h5.d) new yx0(this, 0));
    }

    public final void N3() {
        if (this.a == null) {
            return;
        }
        float measuredWidth = (this.a.getMeasuredWidth() / 2.0f) - ((((FrameLayout.LayoutParams) this.V.getLayoutParams()).width * this.Y1) * 0.5f);
        this.W1 = measuredWidth;
        if (this.D1) {
            this.W1 = AndroidUtilities.lerp(this.L5, measuredWidth, this.P1);
        }
        this.V.setTranslationX(this.W1);
    }

    public final void N4(int i10) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (AndroidUtilities.isTablet()) {
            return;
        }
        this.H1 = i10 != 0;
        this.I1 = i10 != 0;
        k5();
        if (globalMainSettings.getBoolean("view_animations", true)) {
            this.G1 = i10;
        } else if (i10 == 2) {
            this.k1 = true;
        }
    }

    public final int O3() {
        if (this.b1 == 0 || this.n0 == null || this.p1) {
            return AndroidUtilities.dp(74 + (this.F4 ? 25 : 0));
        }
        return 0;
    }

    public final void O4(TLRPC.UserFull userFull, org.telegram.ui.Cells.f6 f6Var, v01 v01Var) {
        this.s2 = userFull;
        org.telegram.ui.Components.jw0 jw0Var = this.Q;
        if (jw0Var != null) {
            jw0Var.set(userFull.stars_rating);
        }
        zy0 zy0Var = this.r0;
        if (zy0Var != null) {
            zy0Var.setStories(this.s2.stories);
        }
        lh.u0 u0Var = this.s0;
        if (u0Var != null) {
            u0Var.a();
        }
        wy0 wy0Var = this.b0;
        if (wy0Var != null) {
            wy0Var.setHasStories(j4());
        }
        sz0 sz0Var = this.L;
        if (sz0Var != null) {
            sz0Var.setUserInfo(this.s2);
        }
        if (this.t2 == null) {
            this.t2 = f6Var;
        }
        if (this.t2 == null) {
            this.t2 = new org.telegram.ui.Cells.f6(this.currentAccount);
        }
        org.telegram.ui.Cells.f6 f6Var2 = this.t2;
        ob0 ob0Var = new ob0(this, 20);
        if (f6Var2.c) {
            ob0Var.run();
        } else {
            f6Var2.h.add(ob0Var);
        }
        this.t2.d(this.s2);
        if (this.v2 == null) {
            this.v2 = v01Var;
        }
        v01 v01Var2 = this.v2;
        if (v01Var2 == null) {
            v01 c3 = v01.c(this.currentAccount, this.s2, v01Var2);
            this.v2 = c3;
            this.u2 = c3 != null;
        }
        v01 v01Var3 = this.v2;
        if (v01Var3 != null) {
            ob0 ob0Var2 = new ob0(this, 16);
            if (v01Var3.b) {
                ob0Var2.run();
            } else {
                v01Var3.h.add(ob0Var2);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.Q0;
        if (w0Var != null) {
            w0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.b1)));
            if (e4()) {
                this.Q0.K(44);
            } else {
                this.Q0.r(44);
            }
        }
    }

    public final int P3(ImageReceiver imageReceiver) {
        return imageReceiver.getDrawable() instanceof org.telegram.ui.Components.s61 ? ((org.telegram.ui.Components.s61) imageReceiver.getDrawable()).a.a() : AndroidUtilities.calcBitmapColor(this.b0.getImageReceiver().getBitmap());
    }

    public final void P4(boolean z4, boolean z10) {
        if (this.d0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.c0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.c0 = null;
        }
        if (!z10) {
            if (z4) {
                this.d0.setAlpha(1.0f);
                this.d0.setVisibility(0);
                return;
            } else {
                this.d0.setAlpha(0.0f);
                this.d0.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.c0 = animatorSet2;
        int i10 = 1;
        if (z4) {
            this.d0.setVisibility(0);
            this.c0.playTogether(ObjectAnimator.ofFloat(this.d0, (Property<org.telegram.ui.Cells.y3, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.d0, (Property<org.telegram.ui.Cells.y3, Float>) View.ALPHA, 0.0f));
        }
        this.c0.setDuration(180L);
        this.c0.addListener(new kz0(this, z4, i10));
        this.c0.start();
    }

    @Override // org.telegram.ui.Components.v40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new cd(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 4));
    }

    public final org.telegram.ui.Components.j5 Q3(int i10, long j10) {
        org.telegram.ui.Components.j5[] j5VarArr = this.E;
        if (j5VarArr[i10] == null) {
            org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(17.0f), i10 == 0 ? 7 : 2, this.f[i10], false);
            j5VarArr[i10] = j5Var;
            int dp = AndroidUtilities.dp(1.0f);
            j5Var.F = 0;
            j5Var.G = dp;
            if (this.D0) {
                j5VarArr[i10].a();
            }
        }
        if (j10 != 0) {
            j5VarArr[i10].j(j10, false);
        } else {
            j5VarArr[i10].g(null, false);
        }
        X4();
        return j5VarArr[i10];
    }

    public final void Q4() {
        Long l10;
        if (this.y5 != null) {
            return;
        }
        g61[] g61VarArr = new g61[1];
        Rect rect = AndroidUtilities.rectTmp2;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f;
        org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[1];
        if (k5Var != null) {
            if (k5Var.getRightDrawable() == null) {
                rect.set(k5VarArr[1].getWidth() - 1, (k5VarArr[1].getHeight() / 2) - 1, k5VarArr[1].getWidth() + 1, (k5VarArr[1].getHeight() / 2) + 1);
            } else {
                rect.set(k5VarArr[1].getRightDrawable().getBounds());
                rect.offset((int) ((k5VarArr[1].getScaleX() - 1.0f) * rect.centerX()), 0);
                rect.offset((int) k5VarArr[1].getX(), (int) k5VarArr[1].getY());
            }
        }
        int i10 = k5VarArr[1].getScaleX() < 1.5f ? 16 : 32;
        int dp = (-(this.W.getHeight() - rect.centerY())) - AndroidUtilities.dp(i10);
        int min = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        int centerX = rect.centerX();
        int b10 = k7.n.b(centerX - (min / 2), 0, AndroidUtilities.displaySize.x - min);
        cz0 cz0Var = new cz0(this, this, getParentActivity(), Integer.valueOf(Math.max(0, centerX - b10)), this.B2 == null ? 0 : 9, this.w0, i10, g61VarArr);
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b1));
        if (user != null) {
            cz0Var.setExpireDateHint(DialogObject.getEmojiStatusUntil(user.emoji_status));
        }
        Long l11 = this.C;
        org.telegram.ui.Components.j5[] j5VarArr = this.D;
        if (l11 != null) {
            cz0Var.setSelected(l11);
        } else {
            org.telegram.ui.Components.j5 j5Var = j5VarArr[1];
            if (j5Var != null) {
                Drawable drawable = j5Var.f[0];
                if (drawable instanceof org.telegram.ui.Components.l5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.l5) drawable).i());
                    cz0Var.setSelected(l10);
                }
            }
            l10 = null;
            cz0Var.setSelected(l10);
        }
        cz0Var.setSaveState(3);
        cz0Var.y(j5VarArr[1], k5VarArr[1]);
        dz0 dz0Var = new dz0(this, cz0Var);
        this.y5 = dz0Var;
        g61VarArr[0] = dz0Var;
        int[] iArr = new int[2];
        org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[1];
        if (k5Var2 != null) {
            k5Var2.getLocationOnScreen(iArr);
        }
        g61VarArr[0].showAsDropDown(this.fragmentView, b10, dp, 51);
        g61VarArr[0].b();
    }

    @Override // org.telegram.ui.Components.jt0
    public final void R() {
        int i10;
        sz0 sz0Var = this.L;
        if (sz0Var == null || this.s == null) {
            return;
        }
        int closestTab = sz0Var.getClosestTab();
        int[] iArr = this.O.c;
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
            if (this.L.getPhotosVideosTypeFilter() == 1 || iArr[7] <= 0) {
                this.s.setText(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]));
                return;
            } else if (this.L.getPhotosVideosTypeFilter() == 2 || (i10 = iArr[6]) <= 0) {
                this.s.setText(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
                return;
            } else {
                this.s.setText(android.support.v4.media.a.z(LocaleController.formatPluralString("Photos", i10, new Object[0]), ", ", LocaleController.formatPluralString("Videos", iArr[7], new Object[0])));
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
            this.s.setText(LocaleController.formatPluralString("CommonGroups", this.s2.common_chats_count, new Object[0]));
            return;
        }
        if (closestTab == 7) {
            this.s.setText(this.r[1].getText());
            return;
        }
        if (closestTab == 8 || org.telegram.ui.Components.yu0.w0(closestTab)) {
            if (this.o2) {
                this.s.setText(this.L.V(false));
                return;
            } else if (this.L.c0(closestTab) > 0) {
                this.s.setText(LocaleController.formatPluralString("ProfileStoriesCount", this.L.c0(closestTab), new Object[0]));
                return;
            } else {
                this.s.setText(LocaleController.getString(R.string.ProfileStoriesCountZero));
                return;
            }
        }
        if (closestTab == 13) {
            this.s.setText(this.L.V(true));
            return;
        }
        if (closestTab == 9) {
            this.s.setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", this.L.c0(closestTab), new Object[0]));
            return;
        }
        if (closestTab == 10) {
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(a());
            this.s.setText(LocaleController.formatPluralString(this.o2 ? "Bots" : "Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]));
            return;
        }
        if (closestTab == 12) {
            this.s.setText(LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, getMessagesController().getSavedMessagesController().getMessagesCount(a())), new Object[0]));
            return;
        }
        if (closestTab == 14) {
            org.telegram.ui.Components.io0 io0Var = this.s;
            org.telegram.ui.Components.or0 or0Var = this.L.S;
            io0Var.setText(LocaleController.formatPluralStringComma("ProfileGiftsCount", or0Var != null ? or0Var.getGiftsCount() : 0));
        } else if (closestTab == 15) {
            int i17 = iArr[8];
            if (i17 <= 0) {
                this.s.setText(LocaleController.getString(R.string.SharedPollTab));
            } else {
                this.s.setText(LocaleController.formatPluralStringComma("ProfilePollsCount", i17));
            }
        }
    }

    public final void R3(boolean z4) {
        a0.h hVar;
        if (this.y1 || (hVar = this.z1) == null || this.r2 == null) {
            return;
        }
        this.y1 = true;
        int i10 = (hVar.m() == 0 || !z4) ? 0 : 300;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.c1);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = z4 ? 0 : this.z1.m();
        tL_channels_getParticipants.limit = 200;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new gg.l0(this, tL_channels_getParticipants, i10)), this.classGuid);
    }

    public final void R4() {
        int i10 = 0;
        this.L.F0.setReordering(false);
        sz0 sz0Var = this.L;
        org.telegram.ui.Components.ns0 ns0Var = sz0Var.F0;
        if (sz0Var.s1 != null && ns0Var != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList<Integer> tabIds = ns0Var.getTabIds();
            int size = tabIds.size();
            while (i10 < size) {
                Integer num = tabIds.get(i10);
                i10++;
                TLRPC.ProfileTab d02 = org.telegram.ui.Components.yu0.d0(num.intValue(), sz0Var.a1 instanceof TLRPC.TL_channelFull);
                if (d02 != null) {
                    arrayList.add(d02);
                }
            }
        }
        this.L.v1(true);
        this.v5.animate().translationY(AndroidUtilities.dp(69.0f)).setDuration(180L).setInterpolator(org.telegram.ui.Components.nr.h).withEndAction(new ob0(this, 21)).start();
        org.telegram.ui.Components.qc.a0(this).Q(R.raw.contact_check, 36, "Tab order changed.").j();
    }

    public final org.telegram.ui.Components.j5 S3(TLRPC.EmojiStatus emojiStatus, boolean z4, int i10) {
        org.telegram.ui.Components.j5[] j5VarArr = this.D;
        if (j5VarArr[i10] == null) {
            org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), i10 == 0 ? 7 : 2, this.f[i10], false);
            j5VarArr[i10] = j5Var;
            if (this.D0) {
                j5Var.a();
            }
        }
        if (i10 == 1) {
            this.C = null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((1 & tL_emojiStatus.flags) == 0 || tL_emojiStatus.until > ((int) (System.currentTimeMillis() / 1000))) {
                j5VarArr[i10].j(tL_emojiStatus.document_id, z4);
                j5VarArr[i10].m(false, z4);
            } else {
                j5VarArr[i10].g(Y3(i10), z4);
                j5VarArr[i10].m(false, z4);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
                if (i10 == 1) {
                    this.C = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                }
                j5VarArr[i10].j(tL_emojiStatusCollectible.document_id, z4);
                j5VarArr[i10].m(true, z4);
            } else {
                j5VarArr[i10].g(Y3(i10), z4);
                j5VarArr[i10].m(false, z4);
            }
        } else {
            j5VarArr[i10].g(Y3(i10), z4);
            j5VarArr[i10].m(false, z4);
        }
        X4();
        return j5VarArr[i10];
    }

    public final void S4() {
        l0 l0Var;
        if (this.X == null || this.r[1] == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        org.telegram.ui.Components.jh0 jh0Var = this.X;
        boolean z4 = this.D1;
        jh0Var.e = z4;
        if (z4 && this.G1 == 2 && (l0Var = this.V) != null) {
            this.X.f = this.V.getY() + (this.V.getScaleY() * l0Var.getHeight());
            this.X.setAlpha(this.P1);
            org.telegram.ui.Components.jh0 jh0Var2 = this.X;
            float measuredWidth = this.a.getMeasuredWidth();
            jh0Var2.B = AndroidUtilities.dp(74.0f);
            jh0Var2.setTranslationY(measuredWidth);
            jh0Var2.invalidate();
        } else {
            jh0Var.f = -1.0f;
            float f10 = currentActionBarHeight;
            float dp = (this.N1 + f10) - AndroidUtilities.dp(this.F4 ? 25.0f : 0.0f);
            float min = Math.min(AndroidUtilities.dp(74.0f), dp - f10);
            org.telegram.ui.Components.jh0 jh0Var3 = this.X;
            jh0Var3.B = min;
            jh0Var3.setTranslationY(dp - min);
            jh0Var3.invalidate();
        }
        ImageView imageView = this.L0;
        if (imageView == null || imageView.getTag() == null) {
            return;
        }
        this.X.getClass();
        if (this.L0.getVisibility() == 0) {
            this.L0.setVisibility(8);
        }
        if (this.L0.getTag() instanceof org.telegram.ui.ActionBar.w0) {
            ((org.telegram.ui.ActionBar.w0) this.L0.getTag()).setAlpha(1.0f);
        }
    }

    @Override // org.telegram.ui.Components.jt0
    public final boolean T() {
        return this.x1;
    }

    public final int T3() {
        return O3() + U3();
    }

    public final void T4() {
        if (this.W0 == null || this.X0 == null) {
            return;
        }
        TLRPC.UserFull userFull = this.s2;
        int i10 = (userFull == null && this.r2 == null) ? 0 : userFull != null ? userFull.ttl_period : this.r2.ttl_period;
        this.p0.b(i10);
        this.X0.b(i10);
    }

    public final int U3() {
        return O3() == 0 ? AndroidUtilities.dp(168.0f) : AndroidUtilities.dp(152.0f);
    }

    public final void U4() {
        if (this.p5 == null) {
            return;
        }
        sz0 sz0Var = this.L;
        boolean z4 = ((sz0Var == null || !sz0Var.isAttachedToWindow()) ? (float) AndroidUtilities.dp(72.0f) : ((float) AndroidUtilities.dp(232.0f)) - (((float) this.a.getMeasuredHeight()) - this.L.getY())) <= 0.0f;
        xd.a aVar = this.x5;
        aVar.a(z4, true);
        float f10 = aVar.e;
        this.p5.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f10));
        this.p5.setAlpha(f10);
        this.p5.setVisibility(f10 <= 0.0f ? 4 : 0);
        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.w;
        if (icVar != null) {
            icVar.l();
        }
    }

    public final Drawable V3() {
        if (this.x == null) {
            this.x = org.telegram.ui.ActionBar.j6.l4.getConstantState().newDrawable().mutate();
        }
        return this.x;
    }

    public final void V4() {
        ph.f3 f3Var = this.a6;
        if (f3Var == null) {
            return;
        }
        float f10 = -f3Var.getPaddingLeft();
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f;
        f3Var.n(0.0f, (k5VarArr[1].getScaleX() * (k5VarArr[1].getRightDrawableX() - (AndroidUtilities.lerp(0.45f, 0.25f, this.h2) * k5VarArr[1].getRightDrawableWidth()))) + k5VarArr[1].getX() + f10);
        float lerp = AndroidUtilities.lerp(this.j2, this.i2);
        this.a6.setTranslationY(((k5VarArr[1].getY() + (-r4.getPaddingBottom())) - AndroidUtilities.dp(24.0f)) + AndroidUtilities.lerp(AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(12.0f), lerp));
        this.a6.h(i0.a.d(lerp, this.b6, 1342177280));
        boolean z4 = this.N1 >= ((float) AndroidUtilities.dp(82.0f));
        Boolean bool = this.c6;
        if (bool == null || bool.booleanValue() != z4) {
            ViewPropertyAnimator animate = this.a6.animate();
            this.c6 = Boolean.valueOf(z4);
            b.p(animate.alpha(z4 ? 1.0f : 0.0f), org.telegram.ui.Components.nr.g, 200L);
        }
    }

    public final float W3(float f10) {
        this.W5 = f10;
        int i10 = this.G1;
        return Math.max(0.0f, (Z3() + this.l5) * Utilities.clamp01(i10 != 2 ? (this.P1 >= 1.0f || i10 == 0) ? this.h2 : 0.0f : 1.0f)) + f10;
    }

    public final void W4() {
        if (getParentActivity() == null || this.S0 == null) {
            return;
        }
        if (getUserConfig().isPremium()) {
            this.S0.setIcon(R.drawable.menu_profile_colors);
            return;
        }
        Drawable drawable = getParentActivity().getDrawable(R.drawable.menu_profile_colors_locked);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, this.w0), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = getParentActivity().getDrawable(R.drawable.msg_gallery_locked2);
        drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.S0.setIcon(new nh.i2(drawable, drawable2, AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f)));
    }

    public final float X3(float f10) {
        this.X5 = f10;
        int i10 = this.G1;
        return e2.c.w(1.0f, Utilities.clamp01(i10 == 2 ? 1.0f : (this.P1 >= 1.0f || i10 == 0) ? this.h2 : 0.0f), this.Q != null ? this.Q.getVisibilityFactor() * AndroidUtilities.dp(3.0f) : 0.0f, f10);
    }

    public final void X4() {
        Y4(this.M5);
    }

    public final org.telegram.ui.Components.mr Y3(int i10) {
        org.telegram.ui.Components.mr[] mrVarArr = this.H;
        if (mrVarArr[i10] == null) {
            Drawable mutate = getParentActivity().getDrawable(R.drawable.msg_premium_liststar).mutate();
            Drawable[] drawableArr = this.B;
            drawableArr[i10] = mutate;
            drawableArr[i10].setColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.w0), PorterDuff.Mode.MULTIPLY);
            mrVarArr[i10] = new org.telegram.ui.Components.mr(drawableArr[i10], getParentActivity().getDrawable(R.drawable.msg_premium_prolfilestar).mutate());
        }
        return mrVarArr[i10];
    }

    public final void Y4(float f10) {
        int i10 = 0;
        while (i10 < 2) {
            MessagesController.PeerColor peerColor = this.N5;
            int offsetColor = (peerColor == null || i10 != 1) ? AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.w0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oi, this.w0), this.B5, 1.0f) : i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), -1);
            int d = i0.a.d(f10, offsetColor, -1);
            int i11 = org.telegram.ui.ActionBar.j6.Oi;
            int d10 = i0.a.d(this.B5, d, org.telegram.ui.ActionBar.j6.v0(i11, this.w0));
            org.telegram.ui.Components.j5 j5Var = this.D[i10];
            if (j5Var != null) {
                j5Var.k(Integer.valueOf(d10));
            }
            org.telegram.ui.Components.j5 j5Var2 = this.E[i10];
            if (j5Var2 != null) {
                j5Var2.k(Integer.valueOf(i0.a.d(this.B5, i0.a.d(f10, offsetColor, -1711276033), org.telegram.ui.ActionBar.j6.v0(i11, this.w0))));
            }
            if (i10 == 1) {
                this.a0.setColor(d10);
            }
            i10++;
        }
        this.M5 = f10;
    }

    public final float Z3() {
        if (this.Q == null) {
            return 0.0f;
        }
        return this.Q.getVisibilityFactor() * AndroidUtilities.dp(22.0f);
    }

    public final void Z4() {
        org.telegram.ui.Cells.o oVar = this.a0;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f;
        oVar.setScaleX(k5VarArr[1].getScaleX());
        this.a0.setScaleY(k5VarArr[1].getScaleY());
        this.a0.b((k5VarArr[1].getScaleX() * k5VarArr[1].getRightDrawableX()) + k5VarArr[1].getX(), (k5VarArr[1].getHeight() - (k5VarArr[1].getScaleY() * (k5VarArr[1].getHeight() - k5VarArr[1].getRightDrawableY()))) + k5VarArr[1].getY());
    }

    public final long a() {
        long j10 = this.f1;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.b1;
        return j11 != 0 ? j11 : -this.c1;
    }

    public final org.telegram.ui.Components.fm0 a4(int i10) {
        if (this.I == null) {
            org.telegram.ui.Components.fm0 fm0Var = new org.telegram.ui.Components.fm0(i10);
            this.I = fm0Var;
            fm0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h8, this.w0));
        }
        return this.I;
    }

    public final void a5() {
        if (this.n1 || !ChatObject.isForum(this.B2)) {
            return;
        }
        getNotificationsController().loadTopicsNotificationsExceptions(-this.c1, new Consumer() { // from class: org.telegram.ui.iy0
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void x(Object obj) {
                ProfileActivity profileActivity = ProfileActivity.this;
                HashSet hashSet = profileActivity.e5;
                ArrayList arrayList = new ArrayList((HashSet) obj);
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    if (profileActivity.getMessagesController().getTopicsController().findTopic(profileActivity.c1, ((Integer) arrayList.get(i10)).intValue()) == null) {
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

    public final s01 b4() {
        if (this.Y5 == null) {
            s01 s01Var = new s01(LocaleController.getString(R.string.StatusHiddenShow));
            this.Y5 = s01Var;
            s01Var.setAlpha((int) (Math.min(1.0f, this.N1 / T3()) * 255.0f));
            this.Y5.a(i0.a.d(this.h2, org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.b(0.18f, -0.1f, this.Z0)), 603979775));
        }
        return this.Y5;
    }

    public final void b5(float f10) {
        h01 h01Var;
        ValueAnimator valueAnimator;
        if (this.m2 || ((h01Var = this.K) != null && (valueAnimator = h01Var.h) != null && valueAnimator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.K.getLayoutParams();
            layoutParams.width = this.a.getMeasuredWidth();
            layoutParams.height = (int) (this.N1 + f10);
            this.K.requestLayout();
        }
        u01 u01Var = this.a1;
        if (u01Var != null) {
            u01Var.B.setTranslate(0.0f, this.X1 - u01Var.x);
            u01 u01Var2 = this.a1;
            RadialGradient radialGradient = u01Var2.y;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(u01Var2.B);
            }
            this.a1.invalidate();
        }
        Z4();
        S4();
        f5();
    }

    public final int c4() {
        if (this.n1) {
            return 0;
        }
        if (this.c1 == 0 || !ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.c1)))) {
            return AndroidUtilities.dp(50.0f);
        }
        return AndroidUtilities.dp(j4() ? 24.0f : 38.0f);
    }

    public final void c5() {
        TLRPC.User user;
        if (!this.p1 || this.U0 == null || this.T0 == null || (user = getMessagesController().getUser(Long.valueOf(this.b1))) == null) {
            return;
        }
        boolean z4 = UserObject.getPublicUsername(user) != null;
        this.U0.setIcon(z4 ? R.drawable.menu_username_change : R.drawable.menu_username_set);
        this.U0.setText(LocaleController.getString(z4 ? R.string.ProfileUsernameEdit : R.string.ProfileUsernameSet));
        this.T0.setVisibility(UserObject.getPublicUsername(user) == null ? 8 : 0);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean canBeginSlide() {
        if (this.L.x0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void clearViews() {
        this.N5 = null;
        super.clearViews();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r1 == null) goto L17;
     */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        vn vnVar;
        org.telegram.ui.ActionBar.e4 e4Var;
        org.telegram.ui.ActionBar.p2 lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof xn) && (vnVar = ((xn) lastFragment).ba) != null && (e4Var = vnVar.f) != null) {
            if (e4Var != null) {
                TLRPC.ChatTheme chatTheme = e4Var.d;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = starGift instanceof TL_stars.TL_starGiftUnique ? (TL_stars.TL_starGiftUnique) starGift : null;
                }
            }
            this.w0 = lastFragment.getResourceProvider();
        }
        eg.l1 l1Var = new eg.l1(this, context, this.w0, 6);
        boolean z4 = true;
        l1Var.setForceSkipTouches(true);
        l1Var.setBackgroundColor(0);
        l1Var.B(this.N5 != null ? 553648127 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f8, this.w0), false);
        int i10 = org.telegram.ui.ActionBar.j6.v8;
        l1Var.C(org.telegram.ui.ActionBar.j6.v0(i10, this.w0), false);
        l1Var.C(org.telegram.ui.ActionBar.j6.v0(i10, this.w0), true);
        l1Var.setCastShadows(false);
        l1Var.setAddToContainer(false);
        l1Var.setClipContent(true);
        if (!this.F0 && (AndroidUtilities.isTablet() || this.inBubbleMode)) {
            z4 = false;
        }
        l1Var.setOccupyStatusBar(z4);
        if (!this.F0) {
            l1Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.i2(false));
            l1Var.getBackButton().setTranslationX(AndroidUtilities.dp(2.0f));
            ImageView backButton = l1Var.getBackButton();
            backButton.setOnLongClickListener(new nh.f2(5, this, backButton));
            return l1Var;
        }
        l1Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.i2(false));
        l1Var.getBackButton().setTranslationX(AndroidUtilities.dp(2.0f));
        l1Var.e.setContentDescription(LocaleController.getString(R.string.QrCode));
        l1Var.e.setImageResource(R.drawable.outline_header_qr_24);
        l1Var.e.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, this.w0), PorterDuff.Mode.SRC_IN);
        l1Var.e.setOnClickListener(new ox0(this, 6));
        return l1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0bae  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0bb8  */
    /* JADX WARN: Type inference failed for: r0v132, types: [org.telegram.ui.ay0] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ng.a aVar;
        int i10;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        ?? r12;
        TLRPC.Document document;
        int i11;
        Object obj;
        org.telegram.ui.ActionBar.f6 f6Var;
        float f10;
        boolean z4;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.Components.zn o10;
        TLRPC.UserFull userFull2;
        TLRPC.ChatParticipants chatParticipants;
        xn xnVar;
        vn vnVar;
        org.telegram.ui.ActionBar.j6.X(context);
        int i15 = 0;
        org.telegram.ui.ActionBar.j6.J(context, false);
        org.telegram.ui.ActionBar.p2 lastFragment = this.parentLayout.getLastFragment();
        StateListAnimator stateListAnimator = null;
        if ((lastFragment instanceof xn) && (vnVar = (xnVar = (xn) lastFragment).ba) != null && vnVar.c() != null) {
            org.telegram.ui.ActionBar.e4 e4Var = xnVar.ba.f;
            if (e4Var != null) {
                TLRPC.ChatTheme chatTheme = e4Var.d;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = starGift instanceof TL_stars.TL_starGiftUnique ? (TL_stars.TL_starGiftUnique) starGift : null;
                }
            }
            this.w0 = lastFragment.getResourceProvider();
        }
        this.Q1 = 0;
        this.R1 = 1.0f;
        this.T1 = false;
        this.hasOwnBackground = true;
        this.N1 = T3();
        this.actionBar.setActionBarMenuOnItemClick(new oz0(this, context));
        sz0 sz0Var = this.L;
        if (sz0Var != null) {
            sz0Var.F0();
        }
        long j10 = this.f1;
        if (j10 == 0) {
            j10 = this.b1;
            if (j10 == 0) {
                j10 = -this.c1;
            }
        }
        this.fragmentView = new qz0(this, context);
        ug.i iVar = new ug.i(this.fragmentView);
        this.o6 = iVar;
        this.l6.f(iVar, (ViewGroup) this.fragmentView);
        ug.i iVar2 = this.o6;
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        ng.a aVar2 = this.n6;
        aVar2.f(iVar2, viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        if (this.p1) {
            this.p5 = new FrameLayout(context);
            this.q5 = new FrameLayout[2];
            this.t5 = new ph.d[2];
            int i16 = 0;
            for (int i17 = 2; i16 < i17; i17 = 2) {
                sg.c cVar = new sg.c();
                int i18 = org.telegram.ui.ActionBar.j6.d6;
                cVar.a(getThemedColor(i18));
                ng.a aVar3 = new ng.a(cVar);
                dh.d dVar = new dh.d(context);
                pg.b b10 = aVar3.b(dVar, new qg.b(i18, this.w0));
                b10.o(AndroidUtilities.dp(8.0f));
                b10.p(AndroidUtilities.dp(22.0f));
                dVar.setBackground(b10);
                this.q5[i16] = new FrameLayout(context);
                this.t5[i16] = new ph.d(context, this.w0);
                this.t5[i16].setRoundRadius(AndroidUtilities.dp(19.0f));
                this.t5[i16].setUseWrapContent(true);
                this.t5[i16].setPadding(AndroidUtilities.dp(16.0f), i15, AndroidUtilities.dp(16.0f), i15);
                if (i16 == 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                    this.r5 = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.mq(R.drawable.filled_premium_camera), i15, 1, 33);
                    this.r5.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
                    this.s5 = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.mq(R.drawable.filled_add_album), i15, 1, 33);
                    this.s5.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAlbumBottomButtonAddStories));
                    this.t5[i16].h(this.r5);
                } else {
                    this.t5[i16].h(LocaleController.getString(R.string.StorySave));
                }
                dVar.setOnClickListener(new lh.y0(this, i16, 21));
                k7.d6.b(dVar, 0.02f, 1.2f);
                this.t5[i16].setStateListAnimator(stateListAnimator);
                dVar.addView(this.t5[i16], k7.b6.e(-2, -1, 17));
                this.q5[i16].addView(dVar, k7.b6.e(-2, 60, 1));
                this.p5.addView(this.q5[i16], k7.b6.e(-1, -1, 87));
                if (i16 == 1 || !getMessagesController().storiesEnabled()) {
                    this.q5[i16].setTranslationY(AndroidUtilities.dp(72.0f));
                }
                i16++;
                i15 = 0;
                stateListAnimator = null;
            }
        }
        TLRPC.ChatFull chatFull2 = this.r2;
        ArrayList arrayList = (chatFull2 == null || (chatParticipants = chatFull2.participants) == null || chatParticipants.participants.size() <= 5) ? null : this.z2;
        if (this.u1) {
            aVar = aVar2;
            i10 = 6;
        } else if (this.q1 && (((userFull = this.s2) != null && userFull.stargifts_count > 0) || ((chatFull = this.r2) != null && chatFull.stargifts_count > 0))) {
            this.t1 = true;
            aVar = aVar2;
            i10 = 14;
        } else if (this.o1) {
            aVar = aVar2;
            i10 = 10;
        } else {
            aVar = aVar2;
            i10 = arrayList != null ? 7 : -1;
        }
        org.telegram.ui.Components.qu0 qu0Var = this.O;
        TLRPC.UserFull userFull3 = this.s2;
        long j11 = j10;
        ng.a aVar4 = aVar;
        sz0 sz0Var2 = new sz0(this, context, j11, qu0Var, userFull3 != null ? userFull3.common_chats_count : 0, this.z2, this.r2, userFull3, i10, this.v1, this, this, this.w0, this.l6);
        this.L = sz0Var2;
        sz0Var2.setLayoutParams(new f2.w0(-1, -1));
        this.L.n0((ViewGroup) this.fragmentView);
        int i19 = 4;
        int i20 = 3;
        if (this.b1 == 0 || this.n0 == null || this.p1) {
            org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(context, this.w0);
            this.Z = ci0Var;
            org.telegram.ui.Components.mh0 mh0Var = this.j0;
            if (mh0Var != null) {
                mh0Var.setMusicView(ci0Var);
            }
            this.Z.setColor(this.N5);
            TLRPC.UserFull userFull4 = this.s2;
            if (userFull4 != null && (document = userFull4.saved_music) != null) {
                this.Z.setMusicDocument(document);
            }
            this.Z.setOnClickListener(new ox0(this, i19));
            this.X = new org.telegram.ui.Components.jh0(context, AndroidUtilities.dp(74.0f));
            I4();
            r12 = 0;
            g5(false);
            this.X.setOnActionClickListener(new px0(this, i20));
        } else {
            r12 = 0;
        }
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        n10.setTranslationX(-AndroidUtilities.dp(5.0f));
        if (this.b1 == getUserConfig().clientUserId && !this.p1 && ContactsController.getInstance(this.currentAccount).getPrivacyRules(7) == null) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
        if (this.n0 != null && !this.p1) {
            org.telegram.ui.ActionBar.w0 a2 = n10.a(32, R.drawable.outline_header_search);
            a2.F();
            a2.E = new fb(this, 14);
            this.R0 = a2;
            a2.setContentDescription(LocaleController.getString(R.string.SearchInSettings));
            this.R0.setSearchFieldHint(LocaleController.getString(R.string.SearchInSettings));
            this.L.getSearchItem().setVisibility(8);
            if (this.L.getSearchOptionsItem() != null) {
                this.L.getSearchOptionsItem().setVisibility(8);
            }
            if (this.L.getSaveItem() != null) {
                this.L.getSaveItem().setVisibility(8);
            }
            if (this.k1) {
                this.R0.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.w0 a10 = n10.a(16, R.drawable.profile_video);
        this.O0 = a10;
        a10.setContentDescription(LocaleController.getString(R.string.VideoCall));
        int i21 = 15;
        if (this.c1 != 0) {
            this.N0 = n10.a(15, R.drawable.msg_voicechat2);
            if (ChatObject.isChannelOrGiga(this.B2)) {
                this.N0.setContentDescription(LocaleController.getString(R.string.VoipChannelVoiceChat));
            } else {
                this.N0.setContentDescription(LocaleController.getString(R.string.VoipGroupVoiceChat));
            }
        } else {
            org.telegram.ui.ActionBar.w0 a11 = n10.a(15, R.drawable.call);
            this.N0 = a11;
            a11.setContentDescription(LocaleController.getString(R.string.Call));
        }
        if (this.p1) {
            org.telegram.ui.ActionBar.w0 a12 = n10.a(41, R.drawable.group_edit_profile);
            this.P0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.Edit));
        } else {
            org.telegram.ui.ActionBar.w0 a13 = n10.a(12, R.drawable.group_edit_profile);
            this.P0 = a13;
            a13.setContentDescription(LocaleController.getString(R.string.Edit));
        }
        org.telegram.ui.ActionBar.w0 c3 = n10.c(10, R.drawable.ic_ab_other, this.w0);
        this.Q0 = c3;
        c3.setSubMenuDelegate(new ly0(this));
        ImageView imageView = new ImageView(context);
        this.V0 = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.v8), PorterDuff.Mode.MULTIPLY));
        AndroidUtilities.updateViewVisibilityAnimated(this.V0, r12, 0.8f, r12);
        this.V0.setImageResource(R.drawable.msg_mini_autodelete_timer);
        this.Q0.addView(this.V0, k7.b6.d(12, 12.0f, 19, 8.0f, 2.0f, 0.0f, 0.0f));
        this.Q0.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.Q0.E(aVar4, rg.b.g(this.resourceProvider));
        if (this.a == null || this.n0 == null) {
            i11 = -1;
            obj = null;
        } else {
            int L0 = this.c.L0();
            View m9 = this.c.m(L0);
            if (m9 != null) {
                m9.getTop();
                this.a.getPaddingTop();
            } else {
                L0 = -1;
            }
            i11 = L0;
            obj = this.v.getTag();
        }
        D3(r12);
        this.d = new g01(this, context);
        this.e = new r01(context, this);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8();
        this.m0 = z8Var;
        z8Var.p = 2.3809524f;
        z8Var.t();
        this.fragmentView.setWillNotDraw(r12);
        qz0 qz0Var = (qz0) this.fragmentView;
        this.j5 = qz0Var;
        qz0Var.K = true;
        my0 my0Var = new my0(this, context, this.w0);
        this.a = my0Var;
        my0Var.p1();
        my0 my0Var2 = this.a;
        my0Var2.getClass();
        int i22 = org.telegram.ui.ActionBar.j6.a7;
        my0Var2.setBackgroundColor(getThemedColor(i22));
        this.a.setVerticalScrollBarEnabled(r12);
        final ng.k kVar = new ng.k(this.a, (ViewGroup) this.fragmentView, new x8(this, 1));
        kVar.h = true;
        ny0 ny0Var = new ny0(this);
        this.a.setItemAnimator(ny0Var);
        ny0Var.e = 320L;
        ny0Var.d = 320L;
        ny0Var.c = 320L;
        ny0Var.m = r12;
        ny0Var.S();
        ny0Var.o(org.telegram.ui.Components.nr.h);
        this.a.setClipToPadding(r12);
        this.a.setHideIfEmpty(r12);
        oy0 oy0Var = new oy0(this);
        this.c = oy0Var;
        oy0Var.j1(1);
        oy0 oy0Var2 = this.c;
        oy0Var2.r = r12;
        this.a.setLayoutManager(oy0Var2);
        this.a.setGlowColor(r12);
        this.a.setAdapter(this.d);
        frameLayout.addView(this.a, k7.b6.e(-1, -1, 51));
        this.a.setOnItemClickListener(new e3.f(this, context, j11, 8));
        this.a.setOnItemLongClickListener(new sy0(this, context));
        if (this.o1 || this.q1 || this.u1) {
            j5();
            E();
            this.T5 = true;
            this.R5 = this.G4;
            this.S5 = r12;
        }
        if (this.R0 != null) {
            org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context);
            this.b = sl0Var;
            sl0Var.setVerticalScrollBarEnabled(r12);
            this.b.setLayoutManager(new f2.i0(1, r12));
            this.b.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.e8));
            this.b.setAdapter(this.e);
            f6Var = null;
            this.b.setItemAnimator(null);
            this.b.setVisibility(8);
            this.b.setLayoutAnimation(null);
            this.b.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            frameLayout.addView(this.b, k7.b6.e(-1, -1, 51));
            this.b.setOnItemClickListener(new j(this, 27));
            this.b.setOnItemLongClickListener(new px0(this, 4));
            this.b.setOnScrollListener(new ty0(this, r12));
            this.b.m1(1, true);
            org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context);
            this.M = zw0Var;
            zw0Var.setAnimateLayoutChange(true);
            this.M.e.setVisibility(8);
            this.M.setVisibility(8);
            frameLayout.addView(this.M);
            this.e.G();
        } else {
            f6Var = null;
        }
        if (this.B1 != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.B1));
            if (this.D2 == null) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(chat);
                tL_channels_getParticipant.participant = getMessagesController().getInputPeer(this.b1);
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new zx0(this, 4));
            }
            dh.d dVar2 = new dh.d(context, 26);
            dVar2.setWillNotDraw(r12);
            dVar2.setPadding(r12, r12, r12, AndroidUtilities.navigationBarHeight);
            frameLayout.addView(dVar2, k7.b6.a(-1.0f, (AndroidUtilities.navigationBarHeight / AndroidUtilities.density) + 51.0f, 83));
            dVar2.setOnClickListener(new gb0(i21, this, chat));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.p7));
            textView.setTextSize(1, 15.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.BanFromTheGroupNoCaps));
            dVar2.addView(textView, k7.b6.d(-2, -2.0f, 17, 0.0f, 1.0f, 0.0f, 0.0f));
            this.a.setPadding(r12, T3(), r12, AndroidUtilities.dp(48.0f));
            this.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f));
        } else {
            this.a.setPadding(r12, T3(), r12, r12);
        }
        u01 u01Var = new u01(this, context);
        this.a1 = u01Var;
        u01Var.a(this.N5, r12);
        this.a1.setBackgroundColor(getThemedColor(i22));
        frameLayout.addView(this.a1);
        this.j5.Q.add(this.a1);
        org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
        this.a0 = oVar;
        oVar.setPivotX(AndroidUtilities.dp(30.0f));
        this.a0.setPivotY(AndroidUtilities.dp(30.0f));
        this.V = new l0(this, context, 20);
        this.W = new ah.d(this, context, 22);
        ImageReceiver imageReceiver = new ImageReceiver(this.W);
        this.o5 = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.W, true, 1.0f, r12);
        frameLayout.addView(this.W, k7.b6.d(-1, -1.0f, 8388611, 0.0f, 0.0f, 0.0f, 0.0f));
        this.V.setPivotX(0.0f);
        this.V.setPivotY(0.0f);
        org.telegram.ui.Components.zh0 zh0Var = new org.telegram.ui.Components.zh0(context);
        this.q0 = zh0Var;
        zh0Var.addView(this.V, k7.b6.e(100, 100, 51));
        this.W.addView(this.q0, k7.b6.c(-1.0f, -1));
        wy0 wy0Var = new wy0(context);
        this.b0 = wy0Var;
        wy0Var.t(O3());
        this.b0.getImageReceiver().setAllowDecodeSingleFrame(true);
        this.b0.setRoundRadiusForExpand(c4());
        this.b0.setPivotX(0.0f);
        this.b0.setPivotY(0.0f);
        this.V.addView(this.b0, k7.b6.c(-1.0f, -1));
        this.b0.setOnClickListener(new ox0(this, 5));
        this.b0.setHasStories(j4());
        this.b0.setOnLongClickListener(new w(this, 6));
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(this, context);
        this.d0 = y3Var;
        y3Var.setSize(AndroidUtilities.dp(26.0f));
        this.d0.setProgressColor(-1);
        this.d0.setNoProgress(r12);
        this.V.addView(this.d0, k7.b6.c(-1.0f, -1));
        ImageView imageView2 = new ImageView(context);
        this.e0 = imageView2;
        imageView2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
        ImageView imageView3 = this.e0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        this.e0.setAlpha(0.0f);
        this.e0.setScaleX(0.85f);
        this.e0.setScaleY(0.85f);
        ImageView imageView4 = this.e0;
        org.telegram.ui.Components.x11 x11Var = new org.telegram.ui.Components.x11(context, f6Var);
        this.i0 = x11Var;
        imageView4.setImageDrawable(x11Var);
        this.e0.setTranslationY(-1.0f);
        frameLayout.addView(this.e0, k7.b6.e(34, 34, 51));
        ImageView imageView5 = new ImageView(context);
        this.f0 = imageView5;
        imageView5.setScaleType(scaleType);
        this.f0.setAlpha(0.0f);
        this.f0.setImageDrawable(new sh.a());
        frameLayout.addView(this.f0, k7.b6.e(16, 16, 51));
        ImageView imageView6 = new ImageView(context);
        this.g0 = imageView6;
        imageView6.setImageResource(R.drawable.star_small_outline);
        this.g0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.s8), PorterDuff.Mode.SRC_IN));
        this.g0.setAlpha(0.0f);
        this.g0.setScaleY(0.0f);
        this.g0.setScaleX(0.0f);
        frameLayout.addView(this.g0, k7.b6.e(20, 20, 51));
        ImageView imageView7 = new ImageView(context);
        this.h0 = imageView7;
        imageView7.setImageResource(R.drawable.star_small_inner);
        this.h0.setAlpha(0.0f);
        this.h0.setScaleY(0.0f);
        this.h0.setScaleX(0.0f);
        frameLayout.addView(this.h0, k7.b6.e(20, 20, 51));
        k5();
        P4(r12, r12);
        xy0 xy0Var = this.k0;
        if (xy0Var != null) {
            xy0Var.K();
        }
        org.telegram.ui.Components.mh0 mh0Var2 = this.j0;
        if (mh0Var2 != null) {
            mh0Var2.e();
        }
        this.K = new h01(this, context);
        org.telegram.ui.Components.mh0 mh0Var3 = new org.telegram.ui.Components.mh0(context);
        this.j0 = mh0Var3;
        mh0Var3.setSize(O3());
        long j12 = this.b1;
        if (j12 == 0) {
            j12 = -this.c1;
        }
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        my0 my0Var3 = this.a;
        int i23 = i11;
        wy0 wy0Var2 = this.b0;
        getClassGuid();
        int i24 = 1;
        this.k0 = new xy0(this, context, j12, kVar2, my0Var3, wy0Var2, this.K, this.j0);
        if (this.b1 != getUserConfig().clientUserId && (userFull2 = this.s2) != null) {
            this.k5 = userFull2.profile_photo == null ? 0.0f : 1.0f;
        }
        if (!this.n1) {
            this.k0.setChatInfo(this.r2);
        }
        this.W.addView(this.k0);
        this.W.addView(this.j0, k7.b6.c(138.0f, -1));
        this.W.addView(this.K);
        org.telegram.ui.Components.jh0 jh0Var = this.X;
        if (jh0Var != null) {
            this.j0.setActionsView(jh0Var);
            this.W.addView(this.X, k7.b6.c(-1.0f, -1));
        }
        org.telegram.ui.Components.ci0 ci0Var2 = this.Z;
        if (ci0Var2 != null) {
            this.j0.setMusicView(ci0Var2);
            this.W.addView(this.Z, k7.b6.c(-1.0f, -1));
        }
        this.b0.setAvatarsViewPager(this.k0);
        j01 j01Var = new j01(this, context);
        this.l0 = j01Var;
        this.W.addView(j01Var, k7.b6.c(-1.0f, -1));
        frameLayout.addView(this.actionBar);
        float f11 = 54 + ((!this.I0 || this.b1 == 0) ? 0 : 54);
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var == null || !(e5Var.getLastFragment() instanceof xn) || (o10 = ((xn) this.parentLayout.getLastFragment()).o()) == null) {
            f10 = f11;
            z4 = false;
        } else {
            boolean z10 = o10.getTitleTextView().getPaddingRight() != 0;
            if (o10.getLayoutParams() != null && o10.getTitleTextView() != null) {
                f11 = ((o10.getWidth() - o10.getTitleTextView().getRight()) + ((ViewGroup.MarginLayoutParams) o10.getLayoutParams()).rightMargin) / AndroidUtilities.density;
            }
            f10 = f11;
            z4 = z10;
        }
        int i25 = 0;
        while (true) {
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.f;
            if (i25 >= k5VarArr.length) {
                break;
            }
            if (this.G1 != 0 || i25 != 0) {
                il ilVar = new il(this, context, 3);
                k5VarArr[i25] = ilVar;
                if (i25 == 1) {
                    ilVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.vh));
                } else {
                    ilVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.A8));
                }
                k5VarArr[i25].setPadding(r12, AndroidUtilities.dp(6.0f), r12, AndroidUtilities.dp(i25 == 0 ? 12.0f : 4.0f));
                k5VarArr[i25].setTextSizePx(AndroidUtilities.dp(17.5f));
                k5VarArr[i25].setGravity(3);
                k5VarArr[i25].setTypeface(AndroidUtilities.bold());
                k5VarArr[i25].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
                k5VarArr[i25].setPivotX(0.0f);
                k5VarArr[i25].setPivotY(0.0f);
                k5VarArr[i25].setAlpha(i25 == 0 ? 0.0f : 1.0f);
                if (i25 == 1) {
                    k5VarArr[i25].setScrollNonFitText(true);
                    k5VarArr[i25].setImportantForAccessibility(2);
                }
                k5VarArr[i25].setFocusable(i25 == 0);
                k5VarArr[i25].setEllipsizeByGradient(true);
                k5VarArr[i25].setRightDrawableOutside(i25 == 0);
                this.W.addView(k5VarArr[i25], k7.b6.d(-2, -2.0f, 51, 109.0f, -6.0f, i25 == 0 ? f10 - (z4 ? 10 : 0) : 0.0f, 0.0f));
            }
            i25++;
        }
        int i26 = 0;
        while (true) {
            org.telegram.ui.ActionBar.k5[] k5VarArr2 = this.r;
            if (i26 >= k5VarArr2.length) {
                break;
            }
            if (i26 == 1) {
                k5VarArr2[i26] = new yy0(this, context);
            } else {
                k5VarArr2[i26] = new org.telegram.ui.Components.z80(context);
            }
            k5VarArr2[i26].setEllipsizeByGradient(true);
            k5VarArr2[i26].setTextColor(w3(getThemedColor(org.telegram.ui.ActionBar.j6.B8), null));
            k5VarArr2[i26].setTextSizePx(AndroidUtilities.dp(13.5f));
            k5VarArr2[i26].setGravity(3);
            k5VarArr2[i26].setAlpha(i26 == 0 ? 0.0f : 1.0f);
            k5VarArr2[i26].setPivotX(AndroidUtilities.dp(8.0f));
            k5VarArr2[i26].setPivotY(AndroidUtilities.dp(8.0f));
            if (i26 == 1 || i26 == 2 || i26 == 3) {
                k5VarArr2[i26].setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            }
            if (i26 > 0) {
                k5VarArr2[i26].setImportantForAccessibility(2);
            }
            k5VarArr2[i26].setFocusable(i26 == 0);
            ah.d dVar3 = this.W;
            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr2[i26];
            if (i26 == 1 || i26 == 2) {
                i13 = 3;
            } else {
                i13 = 3;
                if (i26 != 3) {
                    i14 = 0;
                    dVar3.addView(k5Var, k7.b6.d(-2, -2.0f, 51, 109 - i14, (i26 != 1 || i26 == 2 || i26 == i13) ? -2 : 0, (i26 != 0 ? f10 - (z4 ? 10 : 0) : 8.0f) - ((i26 != 1 || i26 == 2 || i26 == 3) ? 4 : 0), 0.0f));
                    i26++;
                }
            }
            i14 = 4;
            if (i26 != 0) {
            }
            dVar3.addView(k5Var, k7.b6.d(-2, -2.0f, 51, 109 - i14, (i26 != 1 || i26 == 2 || i26 == i13) ? -2 : 0, (i26 != 0 ? f10 - (z4 ? 10 : 0) : 8.0f) - ((i26 != 1 || i26 == 2 || i26 == 3) ? 4 : 0), 0.0f));
            i26++;
        }
        B3();
        this.W.addView(this.a0);
        org.telegram.ui.Components.jw0 jw0Var = new org.telegram.ui.Components.jw0(context);
        this.Q = jw0Var;
        jw0Var.setLayoutParams(k7.b6.d(32, 32.0f, 3, 103.0f, -2.0f, 0.0f, 0.0f));
        this.Q.setResourcesProvider(this.w0);
        C3();
        this.Q.setDelegate(new px0(this, 10));
        this.Q.setOnClickListener(new ox0(this, 0));
        TLRPC.UserFull userFull5 = this.s2;
        if (userFull5 != null) {
            this.Q.set(userFull5.stars_rating);
        }
        this.W.addView(this.Q);
        org.telegram.ui.Components.io0 io0Var = new org.telegram.ui.Components.io0(this, context, context, i24);
        this.s = io0Var;
        io0Var.setAlpha(0.0f);
        this.W.addView(this.s, k7.b6.d(-2, -2.0f, 51, 109.33f, -2.0f, 8.0f, 0.0f));
        this.r0 = new zy0(this, context, this.currentAccount, a(), this.n1, this.V, this.b0, this.w0, context);
        l5(false);
        TLRPC.UserFull userFull6 = this.s2;
        if (userFull6 != null) {
            this.r0.setStories(userFull6.stories);
        } else {
            TLRPC.ChatFull chatFull3 = this.r2;
            if (chatFull3 != null) {
                this.r0.setStories(chatFull3.stories);
            }
        }
        wy0 wy0Var3 = this.b0;
        if (wy0Var3 != null) {
            wy0Var3.setHasStories(j4());
        }
        this.W.addView(this.r0, k7.b6.c(-1.0f, -1));
        lh.u0 u0Var = new lh.u0(context, this.currentAccount, a(), this.V);
        this.s0 = u0Var;
        this.W.addView(u0Var, 0, k7.b6.c(-1.0f, -1));
        i5(true);
        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context);
        this.v = jj0Var;
        if (this.X != null) {
            jj0Var.setVisibility(8);
        }
        p5();
        if (this.b1 == 0) {
            this.v.setImageResource(R.drawable.profile_discuss);
            this.v.setContentDescription(LocaleController.getString(R.string.ViewDiscussion));
        } else if (this.n0 != null) {
            int i27 = R.raw.camera_outline;
            this.S = new org.telegram.ui.Components.gj0(i27, String.valueOf(i27), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            this.T = new org.telegram.ui.Components.gj0(R.raw.camera_outline, android.support.v4.media.a.m(R.raw.camera_outline, "_cell", new StringBuilder()), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
            org.telegram.ui.Components.jh0 jh0Var2 = this.X;
            if (jh0Var2 != null) {
                jh0Var2.e();
                this.X.a();
                this.X.b();
                this.X.c();
                org.telegram.ui.Components.jh0 jh0Var3 = this.X;
                if (jh0Var3.F) {
                    jh0Var3.F = false;
                    jh0Var3.d();
                }
            } else {
                this.v.setAnimation(this.S);
                this.v.setContentDescription(LocaleController.getString(R.string.AccDescrChangeProfilePicture));
                this.v.setPadding(AndroidUtilities.dp(2.0f), 0, 0, AndroidUtilities.dp(2.0f));
            }
        } else {
            org.telegram.ui.Components.jh0 jh0Var4 = this.X;
            if (jh0Var4 != null) {
                jh0Var4.o(0, true);
            }
            this.v.setImageResource(R.drawable.profile_newmsg);
            this.v.setContentDescription(LocaleController.getString(R.string.AccDescrOpenChat));
        }
        org.telegram.ui.Components.jj0 jj0Var2 = this.v;
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        jj0Var2.setScaleType(scaleType2);
        frameLayout.addView(this.v, k7.b6.d(60, 60.0f, 53, 0.0f, 0.0f, 16.0f, 0.0f));
        this.v.setOnClickListener(new ox0(this, i24));
        k4(false);
        if (i23 != -1 && obj != null) {
            this.v.setTag(0);
            this.v.setScaleX(0.2f);
            this.v.setScaleY(0.2f);
            this.v.setAlpha(0.0f);
        }
        this.a.setOnScrollListener(new ty0(this, i24));
        UndoView undoView = new UndoView(context, null, false, this.w0);
        this.J = undoView;
        frameLayout.addView(undoView, k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        int i28 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g2 = ofFloat;
        ofFloat.addUpdateListener(new ux0(this, 0));
        this.g2.setInterpolator(org.telegram.ui.Components.nr.h);
        this.g2.addListener(new az0(this));
        j5();
        R();
        org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(getParentActivity(), 9);
        this.U = k40Var;
        k40Var.setAlpha(0.0f);
        frameLayout.addView(this.U, k7.b6.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
        this.L.setForwardRestrictedHint(this.U);
        bz0 bz0Var = new bz0(this, (ViewGroup) getParentActivity().getWindow().getDecorView(), frameLayout);
        this.S4 = bz0Var;
        bz0Var.E = new ly0(this);
        this.k0.setPinchToZoomHelper(bz0Var);
        this.u0.setAlpha(0);
        this.v0.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.i6));
        this.j5.Q.add(this.L);
        m5();
        gw0 gw0Var = new gw0(this, context, i24);
        this.R = gw0Var;
        if (Build.VERSION.SDK_INT >= 23) {
            gw0Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.d6), 100)));
        }
        this.R.setFocusable(false);
        this.R.setImportantForAccessibility(2);
        this.R.setOnClickListener(new ox0(this, i28));
        this.R.setVisibility(8);
        this.R.setFitsSystemWindows(true);
        this.j5.addView(this.R, k7.b6.c(-1.0f, -1));
        F3();
        if (this.p1) {
            i12 = 87;
            this.j5.addView(this.p5, k7.b6.e(-1, 60, 87));
        } else {
            i12 = 87;
        }
        org.telegram.ui.Components.jh0 jh0Var5 = this.X;
        if (jh0Var5 != null && jh0Var5.l()) {
            ImageView imageView8 = new ImageView(context);
            this.L0 = imageView8;
            imageView8.setScaleType(scaleType2);
            this.L0.setImageResource(R.drawable.call);
            this.L0.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            layoutParams.topMargin = this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.setMarginEnd(layoutParams.width);
            layoutParams.gravity = 8388613;
            frameLayout.addView(this.L0, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.v5 = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        View view = new View(context);
        view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d7));
        this.v5.addView(view, k7.b6.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        ph.d dVar4 = new ph.d(context, this.w0);
        this.w5 = dVar4;
        dVar4.h(LocaleController.getString(R.string.Save));
        this.v5.addView(this.w5, k7.b6.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        this.w5.setOnClickListener(new ox0(this, 3));
        this.v5.setVisibility(8);
        this.v5.setTranslationY(AndroidUtilities.dp(69.0f));
        this.j5.addView(this.v5, k7.b6.e(-1, -2, i12));
        this.p6 = new og.a() { // from class: org.telegram.ui.ay0
            @Override // og.a
            public final void e(Canvas canvas, RectF rectF) {
                kVar.e(canvas, rectF);
                org.telegram.ui.Components.ah ahVar = ProfileActivity.this.L.Z1;
                if (ahVar != null) {
                    ahVar.e(canvas, rectF);
                }
            }

            @Override // og.a
            public final void g(g.x xVar, RectF rectF) {
                xVar.b = true;
            }
        };
        r0.j0.m(this.fragmentView, new px0(this, i28));
        return this.fragmentView;
    }

    public final org.telegram.ui.Components.mr d4(int i10) {
        MessagesController.PeerColor peerColor;
        org.telegram.ui.Components.mr[] mrVarArr = this.G;
        if (mrVarArr[i10] == null) {
            Drawable mutate = org.telegram.ui.ActionBar.j6.Q1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr = this.y;
            drawableArr[i10] = mutate;
            Drawable mutate2 = org.telegram.ui.ActionBar.j6.R1.getConstantState().newDrawable().mutate();
            Drawable[] drawableArr2 = this.F;
            drawableArr2[i10] = mutate2;
            if (i10 == 1 && (peerColor = this.N5) != null) {
                int b10 = org.telegram.ui.ActionBar.j6.b(0.1f, org.telegram.ui.ActionBar.j6.I.q() ? -0.1f : -0.08f, peerColor.hasColor6(org.telegram.ui.ActionBar.j6.I.q()) ? this.N5.getColor5() : this.N5.getColor3());
                Drawable drawable = drawableArr[1];
                int offsetColor = AndroidUtilities.getOffsetColor(b10, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oi, this.w0), this.B5, 1.0f);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(offsetColor, mode);
                drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.w0), this.B5, 1.0f), mode);
            }
            mrVarArr[i10] = new org.telegram.ui.Components.mr(new org.telegram.ui.Components.nq(drawableArr[i10], drawableArr2[i10]), getParentActivity().getDrawable(R.drawable.verified_profile));
        }
        return mrVarArr[i10];
    }

    public final void d5() {
        e5(false, false);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatParticipant chatParticipant;
        g01 g01Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.Chat chat;
        my0 my0Var;
        my0 my0Var2;
        org.telegram.ui.Components.el0 el0Var;
        if (i10 == NotificationCenter.uploadStoryEnd || i10 == NotificationCenter.chatWasBoostedByUser) {
            if (ChatObject.isBoostSupported(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.c1)))) {
                getMessagesController().getStoriesController().k(a(), new nh.e(13), false, this.w0);
                return;
            }
            return;
        }
        int i12 = 0;
        r3 = false;
        boolean z4 = false;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            boolean z10 = ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0 && (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) == 0) ? false : true;
            if (this.b1 != 0) {
                if (z10) {
                    i5(true);
                }
                if ((intValue & MessagesController.UPDATE_MASK_PHONE) == 0 || (my0Var2 = this.a) == null || (el0Var = (org.telegram.ui.Components.el0) my0Var2.L(this.D3, false)) == null) {
                    return;
                }
                this.d.v(el0Var, this.D3);
                return;
            }
            if (this.c1 != 0) {
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0) {
                        e5(true, false);
                    } else {
                        h5(true);
                    }
                    i5(true);
                }
                if (!z10 || (my0Var = this.a) == null) {
                    return;
                }
                int childCount = my0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = this.a.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.va) {
                        ((org.telegram.ui.Cells.va) childAt).j(intValue);
                    }
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
            Long l10 = (Long) objArr[0];
            if (this.r2 == null || (chat = this.B2) == null || chat.id != l10.longValue()) {
                return;
            }
            this.r2.online_count = ((Integer) objArr[1]).intValue();
            h5(true);
            i5(false);
            return;
        }
        if (i10 == NotificationCenter.contactsDidLoad || i10 == NotificationCenter.channelRightsUpdated) {
            D3(true);
            return;
        }
        if (i10 == NotificationCenter.encryptedChatCreated) {
            if (this.g1) {
                AndroidUtilities.runOnUIThread(new zq0(17, this, objArr));
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.encryptedChatUpdated) {
            TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
            TLRPC.EncryptedChat encryptedChat2 = this.A2;
            if (encryptedChat2 == null || encryptedChat.id != encryptedChat2.id) {
                return;
            }
            this.A2 = encryptedChat;
            e5(false, false);
            FlagSecureReason flagSecureReason = this.U1;
            if (flagSecureReason != null) {
                flagSecureReason.invalidate();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.blockedUsersDidLoad) {
            boolean z11 = this.h1;
            boolean z12 = getMessagesController().blockePeers.indexOfKey(this.b1) >= 0;
            this.h1 = z12;
            if (z11 != z12) {
                D3(true);
                e5(false, false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.groupCallUpdated) {
            Long l11 = (Long) objArr[0];
            if (this.B2 != null) {
                long longValue = l11.longValue();
                TLRPC.Chat chat2 = this.B2;
                if (longValue == chat2.id && ChatObject.canManageCalls(chat2)) {
                    TLRPC.ChatFull chatFull4 = MessagesController.getInstance(this.currentAccount).getChatFull(l11.longValue());
                    if (chatFull4 != null) {
                        TLRPC.ChatFull chatFull5 = this.r2;
                        if (chatFull5 != null) {
                            chatFull4.participants = chatFull5.participants;
                        }
                        this.r2 = chatFull4;
                    }
                    sz0 sz0Var = this.L;
                    if (sz0Var != null) {
                        sz0Var.setChatInfo(this.r2);
                    }
                    TLRPC.ChatFull chatFull6 = this.r2;
                    if (chatFull6 != null && (((inputGroupCall = chatFull6.call) == null && !this.m1) || (inputGroupCall != null && this.m1))) {
                        D3(false);
                    }
                    zy0 zy0Var = this.r0;
                    if (zy0Var != null && (chatFull3 = this.r2) != null) {
                        zy0Var.setStories(chatFull3.stories);
                    }
                    lh.u0 u0Var = this.s0;
                    if (u0Var != null) {
                        u0Var.a();
                    }
                    wy0 wy0Var = this.b0;
                    if (wy0Var != null) {
                        wy0Var.setHasStories(j4());
                    }
                    if (l11.longValue() != 0) {
                        boolean z13 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.r2) == null || !chatFull2.stargifts_available) ? false : true;
                        this.Q0.I(38, z13);
                        org.telegram.ui.Components.jh0 jh0Var = this.X;
                        if (jh0Var != null) {
                            jh0Var.o(3, z13);
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
            if (this.b1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.b1))) != null && chatFull7.id == user.linked_community_id) {
                e5(true, false);
            }
            TLRPC.Chat chat3 = this.B2;
            if (chat3 != null && chatFull7.id == chat3.linked_community_id) {
                e5(true, false);
            }
            if (chatFull7.id == this.c1) {
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                TLRPC.ChatFull chatFull8 = this.r2;
                if ((chatFull8 instanceof TLRPC.TL_channelFull) && chatFull7.participants == null) {
                    chatFull7.participants = chatFull8.participants;
                }
                boolean z14 = chatFull8 == null && (chatFull7 instanceof TLRPC.TL_channelFull);
                this.r2 = chatFull7;
                if (this.j1 == 0) {
                    long j10 = chatFull7.migrated_from_chat_id;
                    if (j10 != 0) {
                        this.j1 = -j10;
                        getMediaDataController().getMediaCount(this.j1, this.d1, 0, this.classGuid, true);
                    }
                }
                L3();
                xy0 xy0Var = this.k0;
                if (xy0Var != null && !this.n1) {
                    xy0Var.setChatInfo(this.r2);
                }
                e5(true, false);
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.c1));
                if (chat4 != null) {
                    this.B2 = chat4;
                    D3(true);
                }
                FlagSecureReason flagSecureReason2 = this.U1;
                if (flagSecureReason2 != null) {
                    flagSecureReason2.invalidate();
                }
                if (this.B2.megagroup && (z14 || !booleanValue)) {
                    R3(true);
                }
                T4();
                m5();
                zy0 zy0Var2 = this.r0;
                if (zy0Var2 != null && (chatFull = this.r2) != null) {
                    zy0Var2.setStories(chatFull.stories);
                }
                lh.u0 u0Var2 = this.s0;
                if (u0Var2 != null) {
                    u0Var2.a();
                }
                wy0 wy0Var2 = this.b0;
                if (wy0Var2 != null) {
                    wy0Var2.setHasStories(j4());
                }
                sz0 sz0Var2 = this.L;
                if (sz0Var2 != null) {
                    sz0Var2.setChatInfo(this.r2);
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
            if (botInfo.user_id == this.b1) {
                this.C2 = botInfo;
                e5(false, false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.userInfoDidLoad) {
            if (((Long) objArr[0]).longValue() == this.b1) {
                TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                this.s2 = userFull;
                org.telegram.ui.Components.jw0 jw0Var = this.Q;
                if (jw0Var != null) {
                    jw0Var.set(userFull.stars_rating);
                }
                zy0 zy0Var3 = this.r0;
                if (zy0Var3 != null) {
                    zy0Var3.setStories(this.s2.stories);
                }
                lh.u0 u0Var3 = this.s0;
                if (u0Var3 != null) {
                    u0Var3.a();
                }
                wy0 wy0Var3 = this.b0;
                if (wy0Var3 != null) {
                    wy0Var3.setHasStories(j4());
                }
                sz0 sz0Var3 = this.L;
                if (sz0Var3 != null) {
                    sz0Var3.setUserInfo(this.s2);
                }
                if (this.n0 == null) {
                    if (this.D1 || this.H0) {
                        this.F1 = true;
                    } else {
                        D3(true);
                    }
                    e5(false, false);
                    sz0 sz0Var4 = this.L;
                    if (sz0Var4 != null) {
                        sz0Var4.setCommonGroupsCount(this.s2.common_chats_count);
                        R();
                        org.telegram.ui.Components.qu0 qu0Var = this.O;
                        if (qu0Var == null || qu0Var.y) {
                            resumeDelayedFragmentAnimation();
                            k4(true);
                        }
                    }
                } else if (this.d != null && !TextUtils.equals(this.s2.about, this.w2)) {
                    this.d.m(this.T2);
                }
                T4();
                m5();
                if (this.t2 == null && !h4()) {
                    org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(this.currentAccount);
                    this.t2 = f6Var;
                    ob0 ob0Var = new ob0(this, 15);
                    if (f6Var.c) {
                        ob0Var.run();
                    } else {
                        f6Var.h.add(ob0Var);
                    }
                    this.t2.d(this.s2);
                }
                if (!h4()) {
                    v01 v01Var = this.v2;
                    v01 c3 = v01.c(this.currentAccount, this.s2, v01Var);
                    this.v2 = c3;
                    this.u2 = c3 != v01Var;
                    if (c3 != null) {
                        ob0 ob0Var2 = new ob0(this, 16);
                        if (c3.b) {
                            ob0Var2.run();
                        } else {
                            c3.h.add(ob0Var2);
                        }
                    }
                }
                if (this.Q0 != null) {
                    if (e4()) {
                        this.Q0.K(44);
                    } else {
                        this.Q0.r(44);
                    }
                    TLRPC.UserFull userFull2 = this.s2;
                    if (!userFull2.noforwards_my_enabled && !userFull2.noforwards_peer_enabled) {
                        z4 = true;
                    }
                    this.Q0.I(46, z4);
                    this.Q0.I(47, !z4);
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
                    if (this.A2 != null) {
                        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (g01Var = this.d) != null) {
                            g01Var.l();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            my0 my0Var3 = this.a;
            if (my0Var3 != null) {
                my0Var3.f1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.reloadInterface) {
            e5(false, false);
            return;
        }
        if (i10 == NotificationCenter.newSuggestionsAvailable) {
            int i15 = this.Z2;
            int i16 = this.X2;
            int i17 = this.V2;
            j5();
            g01 g01Var2 = this.d;
            if (g01Var2 != null) {
                if (i15 == this.Z2 && i16 == this.X2 && i17 == this.V2) {
                    return;
                }
                g01Var2.l();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.topicsDidLoaded) {
            if (this.n1) {
                i5(false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateSearchSettings) {
            r01 r01Var = this.e;
            if (r01Var != null) {
                r01Var.c = r01.H(this);
                this.e.v.clear();
                this.e.J();
                r01 r01Var2 = this.e;
                r01Var2.I(r01Var2.y);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.reloadDialogPhotos) {
            i5(false);
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated || i10 == NotificationCenter.storiesReadUpdated) {
            wy0 wy0Var4 = this.b0;
            if (wy0Var4 != null) {
                wy0Var4.setHasStories(j4());
                this.b0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, this.h2));
            }
            zy0 zy0Var4 = this.r0;
            if (zy0Var4 != null) {
                TLRPC.UserFull userFull3 = this.s2;
                if (userFull3 != null) {
                    zy0Var4.setStories(userFull3.stories);
                    return;
                }
                TLRPC.ChatFull chatFull9 = this.r2;
                if (chatFull9 != null) {
                    zy0Var4.setStories(chatFull9.stories);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            org.telegram.ui.ActionBar.w0 w0Var = this.Q0;
            if (w0Var != null) {
                w0Var.I(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.b1)));
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
                org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
                if (e5Var == null || e5Var.getLastFragment() != this) {
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
            if (this.G4 >= 0 || longValue3 != a()) {
                return;
            }
            j5();
            R();
            g01 g01Var3 = this.d;
            if (g01Var3 != null) {
                g01Var3.l();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() != a() || h4()) {
                return;
            }
            if (this.G4 >= 0) {
                sz0 sz0Var5 = this.L;
                if (sz0Var5 != null) {
                    sz0Var5.v1(true);
                    return;
                }
                return;
            }
            j5();
            R();
            g01 g01Var4 = this.d;
            if (g01Var4 != null) {
                g01Var4.l();
            }
            AndroidUtilities.runOnUIThread(new ob0(this, 17));
            return;
        }
        if (i10 == NotificationCenter.profileMusicUpdated) {
            if (((Long) objArr[0]).longValue() != a() || this.b1 <= 0) {
                return;
            }
            TLRPC.UserFull userFull4 = getMessagesController().getUserFull(this.b1);
            if (userFull4 != null) {
                this.s2 = userFull4;
            }
            j5();
            R();
            my0 my0Var4 = this.a;
            if (my0Var4 != null && my0Var4.b0()) {
                this.a.post(new ob0(this, 19));
                return;
            }
            g01 g01Var5 = this.d;
            if (g01Var5 != null) {
                g01Var5.l();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.updatedChatRanks) {
            return;
        }
        long longValue4 = ((Long) objArr[0]).longValue();
        long longValue5 = ((Long) objArr[1]).longValue();
        TLRPC.Chat chat5 = this.B2;
        if (chat5 == null || chat5.id != longValue4) {
            return;
        }
        String str = (String) objArr[2];
        a0.h hVar = this.z1;
        if (hVar != null && (chatParticipant = (TLRPC.ChatParticipant) hVar.f(longValue5)) != null) {
            chatParticipant.setRank(longValue5, str);
        }
        TLRPC.ChannelParticipant channelParticipant = this.D2;
        if (channelParticipant != null && channelParticipant.user_id == longValue5) {
            channelParticipant.rank = str;
        }
        while (true) {
            ArrayList arrayList2 = this.N4;
            if (i12 >= arrayList2.size()) {
                AndroidUtilities.updateVisibleRows(this.a);
                return;
            } else {
                ((TLRPC.ChatParticipant) arrayList2.get(i12)).setRank(longValue5, str);
                i12++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.w40 w40Var = this.n0;
        if (w40Var == null || !w40Var.g(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.w40 w40Var = this.n0;
        return (w40Var == null || dialog != w40Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final boolean e4() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i10 = 0;
        if (!this.o2 || (userFull = this.s2) == null || (botInfo = userFull.bot_info) == null) {
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

    public final void e5(boolean z4, boolean z10) {
        if (this.d == null) {
            if (z4) {
                h5(false);
            }
            j5();
            return;
        }
        if (!z10 && this.a.isInLayout()) {
            my0 my0Var = this.a;
            if (my0Var.D) {
                my0Var.post(new org.telegram.ui.Components.kv0(7, this, z4));
                return;
            }
            return;
        }
        uz0 uz0Var = new uz0(this);
        uz0Var.b = this.K2;
        uz0Var.f(uz0Var.c);
        uz0Var.e.clear();
        uz0Var.f.clear();
        uz0Var.e.addAll(this.N4);
        uz0Var.f.addAll(this.O4);
        uz0Var.g = this.r4;
        uz0Var.h = this.s4;
        if (z4) {
            h5(false);
        }
        F4();
        j5();
        uz0Var.f(uz0Var.d);
        try {
            f2.q.c(uz0Var, true).b(this.d);
        } catch (Exception e) {
            FileLog.e(e);
            this.d.l();
        }
        int i10 = this.R5;
        if (i10 >= 0) {
            this.c.h1(i10, this.S5 - this.a.getPaddingTop());
        }
        AndroidUtilities.updateVisibleRows(this.a);
    }

    @Override // org.telegram.ui.Components.jt0
    public final org.telegram.ui.Components.sl0 f() {
        return this.a;
    }

    public final void f4() {
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        this.k2 = point.x > point.y;
    }

    public final void f5() {
        if (this.Z == null || this.r[1] == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        boolean z4 = this.D1;
        if (z4 && this.G1 == 2 && this.V != null) {
            this.Z.setAlpha(this.P1);
            org.telegram.ui.Components.ci0 ci0Var = this.Z;
            float dp = AndroidUtilities.dp(74.0f) + this.a.getMeasuredWidth();
            ci0Var.I = O3() - AndroidUtilities.dp(74.0f);
            ci0Var.setTranslationY(dp - AndroidUtilities.dp(12.0f));
            ci0Var.invalidate();
            return;
        }
        if (z4) {
            this.Z.setAlpha(this.P1);
        }
        float f10 = currentActionBarHeight;
        float dp2 = this.N1 + f10 + AndroidUtilities.dp(74.0f);
        float min = Math.min(O3(), dp2 - f10);
        org.telegram.ui.Components.ci0 ci0Var2 = this.Z;
        ci0Var2.I = min - AndroidUtilities.dp(74.0f);
        ci0Var2.setTranslationY((dp2 - min) - AndroidUtilities.dp(12.0f));
        ci0Var2.invalidate();
    }

    @Override // org.telegram.ui.Components.jt0
    public final TLRPC.Chat g() {
        return this.B2;
    }

    public final boolean g4() {
        return this.B2 != null ? getMessagesController().isChatNoForwards(this.B2) : getMessagesController().isUserNoForwards(this.s2);
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
    public final void g5(boolean z4) {
        int i10;
        g01 g01Var;
        if (z4 && (i10 = this.K3) >= 0 && (g01Var = this.d) != null) {
            g01Var.m(i10);
        }
        org.telegram.ui.Components.jh0 jh0Var = this.X;
        if (jh0Var == null || this.p1) {
            return;
        }
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        long j10 = this.f1;
        if (j10 == 0) {
            j10 = this.b1;
            if (j10 == 0) {
                j10 = -this.c1;
            }
        }
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, this.d1);
        boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
        boolean z10 = false;
        int c3 = org.telegram.messenger.y3.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
        int c10 = org.telegram.messenger.y3.c(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL, sharedPrefKey, notificationsSettings, 0);
        if (c3 != 3 || c10 == Integer.MAX_VALUE) {
            if (c3 == 0) {
                if (!contains) {
                    z10 = getNotificationsController().isGlobalNotificationsEnabled(j10, false, false);
                    jh0Var.setNotifications(z10);
                }
                z10 = true;
                jh0Var.setNotifications(z10);
            }
        }
    }

    public float getAvatarAnimationProgress() {
        return this.P1;
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ ju0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.w0;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        if (this.w0 != null) {
            return null;
        }
        cy0 cy0Var = new cy0(0, this);
        ArrayList arrayList = new ArrayList();
        sz0 sz0Var = this.L;
        if (sz0Var != null) {
            arrayList.addAll(sz0Var.getThemeDescriptions());
        }
        my0 my0Var = this.a;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(my0Var, 0, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, null, null, null, null, i10));
        my0 my0Var2 = this.a;
        int i11 = org.telegram.ui.ActionBar.j6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(my0Var2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.f8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.pc));
        int i12 = org.telegram.ui.ActionBar.j6.h8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.Bh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, i12));
        org.telegram.ui.Components.io0 io0Var = this.s;
        if (io0Var != null) {
            TextView textView = io0Var.getTextView();
            int i13 = org.telegram.ui.ActionBar.j6.Pi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, cy0Var, i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.s.getNextTextView(), 4, null, null, null, cy0Var, i13));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a1, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        wy0 wy0Var = this.b0;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.r0;
        int i14 = org.telegram.ui.ActionBar.j6.J7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(wy0Var, 0, null, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0, 0, null, null, new Drawable[]{this.m0}, null, org.telegram.ui.ActionBar.j6.d8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 8, null, null, null, null, org.telegram.ui.ActionBar.j6.wh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.xh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.yh));
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.x6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        int i16 = org.telegram.ui.ActionBar.j6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        int i17 = org.telegram.ui.ActionBar.j6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"detailTextView"}, null, null, -1, null, i17));
        int i19 = org.telegram.ui.ActionBar.j6.J6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 2, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"detailTextView"}, null, null, -1, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.Sh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.j6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 131072, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, null, null, -1, null, i21));
        int i22 = org.telegram.ui.ActionBar.j6.Qh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 196608, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"yesButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 131072, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 196608, new Class[]{org.telegram.ui.Cells.y6.class}, new String[]{"noButton"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 4, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.uh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, cy0Var, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, cy0Var, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        int i23 = org.telegram.ui.ActionBar.j6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 4, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.j6.P1, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 2, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.j6.P1, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.j.class}, org.telegram.ui.ActionBar.j6.m0, null, null, org.telegram.ui.ActionBar.j6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"valueTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        boolean z4 = this.C5;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f;
        if (z4) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(k5VarArr[1], 0, null, null, this.F, null, org.telegram.ui.ActionBar.j6.Oi));
            arrayList.add(new org.telegram.ui.ActionBar.l6(k5VarArr[1], 0, null, null, this.y, null, i10));
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(k5VarArr[1], 0, null, null, this.F, null, org.telegram.ui.ActionBar.j6.Ah));
        arrayList.add(new org.telegram.ui.ActionBar.l6(k5VarArr[1], 0, null, null, this.y, null, org.telegram.ui.ActionBar.j6.zh));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.w0);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final Drawable getThemedDrawable(String str) {
        org.telegram.ui.ActionBar.f6 f6Var = this.w0;
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
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z4, boolean z10, View view) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        String str;
        boolean z19;
        TLRPC.ChannelParticipant channelParticipant;
        boolean z20;
        boolean z21;
        if (getParentActivity() != null) {
            if (z4) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                if (user != null) {
                    long j10 = chatParticipant.user_id;
                    this.x2 = j10;
                    boolean z22 = j10 == getUserConfig().getClientUserId();
                    if (ChatObject.isChannel(this.B2)) {
                        channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str2 = channelParticipant.rank;
                        boolean z23 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        boolean z24 = z23 || (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin);
                        getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                        z12 = ChatObject.canAddAdmins(this.B2);
                        boolean z25 = ChatObject.canManageTags(this.B2) && (!z24 || ((!z23 && channelParticipant.can_edit) || z22));
                        if (z23 || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit)) {
                            z12 = false;
                            z25 = false;
                        }
                        if ((z22 || (channelParticipant instanceof TLRPC.TL_channelParticipantSelf)) && ChatObject.canManageMyTag(this.B2)) {
                            z25 = true;
                        }
                        z11 = ChatObject.canBlockUsers(this.B2) && (!((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || z23) || channelParticipant.can_edit);
                        z15 = this.B2.gigagroup ? false : z11;
                        z16 = z23;
                        z17 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                        z18 = z24;
                        z13 = z22;
                        str = str2;
                        z19 = z25;
                    } else {
                        String str3 = chatParticipant.rank;
                        boolean z26 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        boolean z27 = z26 || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator);
                        boolean z28 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        TLRPC.Chat chat = this.B2;
                        z11 = chat.creator || ((chatParticipant instanceof TLRPC.TL_chatParticipant) && (ChatObject.canBlockUsers(chat) || chatParticipant.inviter_id == getUserConfig().getClientUserId()));
                        TLRPC.Chat chat2 = this.B2;
                        z12 = chat2.creator;
                        if (ChatObject.canManageTags(chat2)) {
                            z13 = z22;
                            if (z27) {
                                if (!z28) {
                                }
                            }
                            z14 = true;
                            z15 = this.B2.creator;
                            z16 = z28;
                            z17 = z26;
                            z18 = z27;
                            str = str3;
                            z19 = z14;
                            channelParticipant = null;
                        } else {
                            z13 = z22;
                        }
                        if (!z13 || !ChatObject.canManageMyTag(this.B2)) {
                            z14 = false;
                            z15 = this.B2.creator;
                            z16 = z28;
                            z17 = z26;
                            z18 = z27;
                            str = str3;
                            z19 = z14;
                            channelParticipant = null;
                        }
                        z14 = true;
                        z15 = this.B2.creator;
                        z16 = z28;
                        z17 = z26;
                        z18 = z27;
                        str = str3;
                        z19 = z14;
                        channelParticipant = null;
                    }
                    if (z13) {
                        z20 = (ChatObject.canManageMyTag(this.B2) || (z18 && ChatObject.canManageTags(this.B2))) ? true : z19;
                        z12 = false;
                        z15 = false;
                        z21 = false;
                    } else {
                        z20 = z19;
                        z21 = z11;
                    }
                    boolean z29 = z12 || z20 || z15 || z21;
                    if (z10 || !z29) {
                        return z29;
                    }
                    TLRPC.ChannelParticipant channelParticipant2 = channelParticipant;
                    org.telegram.messenger.ok okVar = new org.telegram.messenger.ok(this, channelParticipant2, user, chatParticipant, z17, str);
                    String str4 = str;
                    boolean z30 = z17;
                    Drawable V0 = view.getParent() instanceof org.telegram.ui.Components.sl0 ? ((org.telegram.ui.Components.sl0) view.getParent()).V0(view, false) : null;
                    org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(this, view);
                    H.W(V0);
                    H.w = false;
                    H.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new nx0(this, user, 0), !z13);
                    if (!z13 && (z12 || z20 || z15 || z21)) {
                        H.k();
                    }
                    H.l((z18 || !TextUtils.isEmpty(str4)) ? R.drawable.menu_tag_edit : R.drawable.menu_tag_plus, LocaleController.getString(z18 ? R.string.EditAdminTag : TextUtils.isEmpty(str4) ? R.string.AddMemberTag : R.string.EditMemberTag), new cg.x0(this, user, str4, z18, z16), z20);
                    H.l(R.drawable.msg_admins, LocaleController.getString(z30 ? R.string.EditAdminRights : R.string.SetAsAdmin), new el0(okVar, 25), z12);
                    H.l(R.drawable.msg_permissions, LocaleController.getString(R.string.ChangePermissions), new org.telegram.ui.Components.jy0(this, channelParticipant2, chatParticipant, user, okVar, 24), z15);
                    H.m(z21, R.drawable.msg_remove, LocaleController.getString(R.string.KickFromGroup), true, new zq0(18, this, chatParticipant));
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
        return (this.n0 == null || this.p1) ? false : true;
    }

    public final void h5(boolean z4) {
        int i10;
        TLRPC.UserStatus userStatus;
        boolean z10;
        int i11 = 0;
        this.y2 = 0;
        int currentTime = getConnectionsManager().getCurrentTime();
        this.z2.clear();
        TLRPC.ChatFull chatFull = this.r2;
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z10 || chatFull.participants_count <= 200) {
                return;
            }
            this.y2 = chatFull.online_count;
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (i11 < this.r2.participants.participants.size()) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.r2.participants.participants.get(i11).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.id == getUserConfig().getClientUserId()) && user.status.expires > 10000)) {
                this.y2++;
            }
            this.z2.add(Integer.valueOf(i11));
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
                i11 = yh.e(i10, i11, 1, arrayList);
            }
            i10 = TLObject.FLAG_31;
            i11 = yh.e(i10, i11, 1, arrayList);
        }
        try {
            Collections.sort(this.z2, Comparator$-EL.reversed(Comparator$-CC.comparingInt(new cf(arrayList, 1))));
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (z4 && this.d != null && this.r4 > 0) {
            AndroidUtilities.updateVisibleRows(this.a);
        }
        if (this.L == null || this.G4 == -1) {
            return;
        }
        if ((this.z2.size() > 5 || this.P4 == 2) && this.P4 != 1) {
            this.L.a1(this.z2, this.r2);
        }
    }

    public final void i4(boolean z4) {
        boolean isForum = ChatObject.isForum(this.B2);
        TLRPC.Chat chat = this.B2;
        org.telegram.ui.Components.z4.s(this, false, chat, null, false, isForum || z4 || (chat != null && chat.creator), z4, !isForum, new px0(this, 1));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(52:35|(1:368)(1:39)|(1:41)(1:367)|42|(3:44|(1:46)(1:48)|47)|49|(1:51)|52|(1:54)|55|(1:57)|58|(1:60)(1:366)|61|(4:63|(1:364)(1:67)|68|(1:70)(1:363))(1:365)|71|(1:73)|74|(1:(1:77)(30:(1:361)(1:81)|82|(1:86)|(1:357)(1:92)|93|(2:95|(2:97|(1:99))(2:295|(1:302)(1:301)))(2:303|(1:305)(2:306|(1:356)(2:312|(1:314)(2:315|(2:317|(1:319)(1:320))(30:321|(1:323)(1:355)|324|(1:354)(1:338)|339|340|(4:344|(1:352)(1:348)|349|(1:351))|353|101|(1:294)(1:105)|106|107|108|(1:110)|111|(4:114|(2:116|117)(21:(1:(1:247)(1:246))(1:121)|(1:(1:230)(2:224|(1:226)(2:227|(1:229))))(1:124)|125|(1:221)(1:128)|129|(1:220)(1:132)|133|(1:135)(1:219)|136|(1:138)(1:218)|139|(4:198|(4:200|(1:217)(2:204|(1:206)(1:216))|207|(2:212|(3:214|184|185)(1:215))(1:211))|187|185)(4:142|(2:196|197)(2:146|(1:148)(5:188|(1:195)|190|191|(1:193)(1:194)))|149|(2:181|(3:183|184|185)(3:186|187|185))(1:153))|(1:180)(2:157|(7:159|160|(1:164)|165|(1:178)(1:169)|170|(2:174|175)))|179|160|(1:164)|165|(1:167)|178|170|(1:177)(3:172|174|175))|118|112)|248|249|(3:251|(1:283)(1:257)|258)(2:284|(10:291|260|(1:262)|263|(1:265)|266|(1:282)(1:272)|273|(1:275)(1:281)|276)(1:290))|259|260|(0)|263|(0)|266|(2:268|270)|282|273|(0)(0)|276)))))|100|101|(1:103)|294|106|107|108|(0)|111|(1:112)|248|249|(0)(0)|259|260|(0)|263|(0)|266|(0)|282|273|(0)(0)|276))|362|82|(30:84|86|(2:88|90)|357|93|(0)(0)|100|101|(0)|294|106|107|108|(0)|111|(1:112)|248|249|(0)(0)|259|260|(0)|263|(0)|266|(0)|282|273|(0)(0)|276)|359|86|(0)|357|93|(0)(0)|100|101|(0)|294|106|107|108|(0)|111|(1:112)|248|249|(0)(0)|259|260|(0)|263|(0)|266|(0)|282|273|(0)(0)|276) */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x081e, code lost:
    
        if (r38.r2.can_view_participants != false) goto L423;
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
    public final void i5(boolean z4) {
        org.telegram.ui.ActionBar.k5[] k5VarArr;
        Object obj;
        boolean z10;
        long j10;
        boolean z11;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str;
        Object obj2;
        org.telegram.ui.ActionBar.k5[] k5VarArr2;
        CharSequence formatPluralString;
        TLRPC.ChatParticipants chatParticipants;
        CharSequence charSequence;
        boolean z12;
        int i10;
        boolean z13;
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        ImageLocation C;
        View m9;
        TLRPC.Chat chat;
        ImageLocation imageLocation;
        CharSequence charSequence2;
        Paint.FontMetricsInt fontMetricsInt;
        boolean z14;
        boolean z15;
        String str2;
        boolean z16;
        String str3;
        TLRPC.ChatFull chatFull;
        String formatShortNumber;
        String str4;
        int i11;
        int i12;
        int i13;
        int i14;
        String formatString;
        org.telegram.ui.ActionBar.k5[] k5VarArr3;
        org.telegram.ui.Components.s61 s61Var;
        TLRPC.VideoSize videoSize;
        ImageLocation imageLocation2;
        TLRPC.User user;
        ImageLocation imageLocation3;
        TLRPC.User user2;
        boolean z17;
        TLRPC.UserStatus userStatus;
        int i15;
        int i16;
        char c3;
        org.telegram.ui.Components.rg rgVar;
        TL_stars.Tl_starsRating tl_starsRating;
        String str5;
        String str6;
        boolean z18;
        boolean z19;
        org.telegram.ui.Components.j5 j5Var;
        TLRPC.FileLocation fileLocation;
        org.telegram.ui.Components.j5 j5Var2;
        TL_stars.Tl_starsRating tl_starsRating2;
        ImageLocation imageLocation4;
        jx jxVar;
        if (this.V == null || (k5VarArr = this.f) == null || getParentActivity() == null) {
            return;
        }
        int connectionState = getConnectionsManager().getConnectionState();
        String string = connectionState == 2 ? LocaleController.getString(R.string.WaitingForNetwork) : connectionState == 1 ? LocaleController.getString(R.string.Connecting) : connectionState == 5 ? LocaleController.getString(R.string.Updating) : connectionState == 4 ? LocaleController.getString(R.string.ConnectingToProxy) : null;
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var == null || e5Var.getFragmentStack().size() < 2) {
            obj = null;
        } else {
            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            obj = p2Var instanceof org.telegram.ui.Components.rg ? p2Var : null;
            if ((p2Var instanceof oy) && (jxVar = ((oy) p2Var).C3) != null) {
                qx qxVar = jxVar.a;
                if (e2.c.s(qxVar)) {
                    obj = qxVar;
                }
            }
        }
        if (obj instanceof xn) {
            xn xnVar = (xn) obj;
            if (xnVar.X0 != null && xnVar.u8() == 8) {
                z10 = true;
                this.m5 = false;
                this.n5 = false;
                j10 = this.b1;
                String str7 = "drawableMuteIcon";
                String str8 = "";
                org.telegram.ui.ActionBar.k5[] k5VarArr4 = this.r;
                if (j10 == 0) {
                    TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(this.b1));
                    if (user3 == null) {
                        return;
                    }
                    TLRPC.UserProfilePhoto userProfilePhoto = user3.photo;
                    boolean z20 = userProfilePhoto != null && userProfilePhoto.personal;
                    TLRPC.FileLocation fileLocation2 = userProfilePhoto != null ? userProfilePhoto.photo_big : null;
                    this.m0.m(this.currentAccount, user3);
                    MessagesController.PeerColor peerColor = this.N5;
                    MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(user3.emoji_status);
                    this.N5 = fromCollectible;
                    if (fromCollectible == null) {
                        int profileColorId = UserObject.getProfileColorId(user3);
                        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).profilePeerColors;
                        this.N5 = peerColors == null ? null : peerColors.getColor(profileColorId);
                    }
                    if (peerColor != this.N5) {
                        o5();
                    }
                    u01 u01Var = this.a1;
                    boolean z21 = z20;
                    if (u01Var != null) {
                        u01Var.b(UserObject.getProfileEmojiId(user3), user3.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    org.telegram.ui.Components.jw0 jw0Var = this.Q;
                    if (jw0Var != null) {
                        jw0Var.b(this.N5);
                    }
                    TLRPC.EmojiStatus emojiStatus = user3.emoji_status;
                    L4(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null);
                    ImageLocation forUserOrChat3 = ImageLocation.getForUserOrChat(user3, 0);
                    ImageLocation forUserOrChat4 = ImageLocation.getForUserOrChat(user3, 1);
                    ImageLocation forUserOrChat5 = ImageLocation.getForUserOrChat(user3, 4);
                    TLRPC.UserFull userFull = this.s2;
                    if (userFull != null) {
                        TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                        videoSize = FileLoader.getVectorMarkupVideoSize((userProfilePhoto2 == null || !userProfilePhoto2.personal) ? userFull.profile_photo : userFull.personal_photo);
                        if (videoSize != null) {
                            k5VarArr3 = k5VarArr;
                            s61Var = new org.telegram.ui.Components.s61(videoSize, user3.premium, 2);
                        } else {
                            k5VarArr3 = k5VarArr;
                            s61Var = null;
                        }
                    } else {
                        k5VarArr3 = k5VarArr;
                        s61Var = null;
                        videoSize = null;
                    }
                    ImageLocation C2 = this.k0.C(forUserOrChat4, forUserOrChat3);
                    if (this.F2 == null) {
                        this.k0.H(s61Var, forUserOrChat3, forUserOrChat4, z4);
                    }
                    if (this.G2 == null) {
                        if (videoSize != null) {
                            this.b0.setImageDrawable(s61Var);
                        } else {
                            if (forUserOrChat5 == null || user3.photo.personal) {
                                user = user3;
                                imageLocation3 = forUserOrChat4;
                                wy0 wy0Var = this.b0;
                                wy0Var.a.setImage(C2, ImageLoader.AUTOPLAY_FILTER, forUserOrChat3, "100_100", imageLocation3, "50_50", this.m0, 0L, null, user, 1);
                                imageLocation2 = forUserOrChat3;
                                wy0Var.d();
                            } else {
                                this.b0.getImageReceiver().setVideoThumbIsSame(true);
                                wy0 wy0Var2 = this.b0;
                                user = user3;
                                imageLocation3 = forUserOrChat4;
                                wy0Var2.a.setImage(forUserOrChat5, "avatar", forUserOrChat3, "50_50", imageLocation3, "50_50", this.m0, 0L, null, user, 1);
                                wy0Var2.d();
                                imageLocation2 = forUserOrChat3;
                            }
                            if ((imageLocation3 != null && this.L2 != -1) || (imageLocation3 == null && this.L2 == -1)) {
                                d5();
                                k4(true);
                            }
                            if (imageLocation2 != null || ((imageLocation4 = this.y0) != null && imageLocation2.photoId == imageLocation4.photoId)) {
                                user2 = user;
                            } else {
                                this.y0 = imageLocation2;
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
                                } else if (this.o2) {
                                    int i17 = user2.bot_active_users;
                                    str8 = i17 != 0 ? LocaleController.formatPluralStringComma("BotUsers", i17, ',') : LocaleController.getString(R.string.Bot);
                                } else {
                                    boolean[] zArr = this.G0;
                                    zArr[0] = false;
                                    str8 = LocaleController.formatUserStatus(this.currentAccount, user2, zArr, z21 ? new boolean[1] : null);
                                    boolean z22 = (zArr[0] || getUserConfig().isPremium() || (userStatus = user2.status) == null || (!(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) || !userStatus.by_me) ? false : true;
                                    org.telegram.ui.ActionBar.k5 k5Var = k5VarArr4[1];
                                    if (k5Var != null && !this.C5) {
                                        int i18 = (zArr[0] && this.N5 == null) ? org.telegram.ui.ActionBar.j6.Bh : org.telegram.ui.ActionBar.j6.B8;
                                        k5Var.setTag(Integer.valueOf(i18));
                                        if (!this.m2) {
                                            k5VarArr4[1].setTextColor(w3(getThemedColor(i18), Boolean.valueOf(zArr[0])));
                                        }
                                    }
                                    z17 = z22;
                                    TLRPC.UserProfilePhoto userProfilePhoto3 = user2.photo;
                                    this.n5 = userProfilePhoto3 == null && userProfilePhoto3.personal;
                                    userName = Emoji.replaceEmoji(userName, k5VarArr3[1].getPaint().getFontMetricsInt(), false);
                                    if (z10) {
                                        this.b0.setAnimateFromImageReceiver(((xn) obj).X0.getAvatarImageView().getImageReceiver());
                                    }
                                    i15 = 0;
                                    while (i15 < 2) {
                                        if (k5VarArr3[i15] == null) {
                                            fileLocation = fileLocation2;
                                            str6 = str7;
                                        } else {
                                            if (i15 == 0 && z10) {
                                                org.telegram.ui.ActionBar.k5 titleTextView = ((xn) obj).X0.getTitleTextView();
                                                k5VarArr3[i15].k(titleTextView.getText());
                                                k5VarArr3[i15].i(titleTextView.getRightDrawable());
                                                k5VarArr3[i15].j(titleTextView.getRightDrawable2());
                                            } else if (i15 != 0 || user2.id == getUserConfig().getClientUserId() || MessagesController.isSupportUser(user2) || (str5 = user2.phone) == null || str5.length() == 0 || getContactsController().contactsDict.get(Long.valueOf(user2.id)) != null || (getContactsController().contactsDict.size() == 0 && getContactsController().isLoadingContacts())) {
                                                k5VarArr3[i15].k(userName);
                                            } else {
                                                k5VarArr3[i15].k(se.b.c().b("+" + user2.phone));
                                            }
                                            if (i15 == 0 && string != null) {
                                                k5VarArr4[i15].k(string);
                                            } else if (i15 == 0 && z10) {
                                                xn xnVar2 = (xn) obj;
                                                if (xnVar2.X0.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.k5) {
                                                    k5VarArr4[i15].k(((org.telegram.ui.ActionBar.k5) xnVar2.X0.getSubtitleTextView()).getText());
                                                } else if (xnVar2.X0.getSubtitleTextView() instanceof org.telegram.ui.Components.k6) {
                                                    k5VarArr4[i15].k(((org.telegram.ui.Components.k6) xnVar2.X0.getSubtitleTextView()).getText());
                                                }
                                            } else {
                                                k5VarArr4[i15].k(str8);
                                            }
                                            k5VarArr4[i15].setDrawablePadding(AndroidUtilities.dp(9.0f));
                                            k5VarArr4[i15].setRightDrawableInside(true);
                                            k5VarArr4[i15].i((i15 == 1 && z17) ? b4() : null);
                                            k5VarArr4[i15].setRightDrawableOnClick((i15 == 1 && z17) ? new ox0(this, 7) : null);
                                            Drawable V3 = this.A2 != null ? V3() : null;
                                            k5VarArr3[i15].setRightDrawableOutside(i15 == 0);
                                            if (i15 != 0 || z10) {
                                                str6 = str7;
                                                if (i15 == 1) {
                                                    boolean z23 = user2.scam;
                                                    if (z23 || user2.fake) {
                                                        k5VarArr3[i15].j(a4(!z23 ? 1 : 0));
                                                    } else if (user2.verified) {
                                                        k5VarArr3[i15].j(d4(i15));
                                                    } else {
                                                        k5VarArr3[i15].j(null);
                                                    }
                                                    if (!MessagesController.isSupportUser(user2) && DialogObject.getEmojiStatusDocumentId(user2.emoji_status) != 0) {
                                                        z18 = true;
                                                        k5VarArr3[i15].i(S3(user2.emoji_status, true, i15));
                                                        z19 = false;
                                                    } else if (getMessagesController().isPremiumUser(user2)) {
                                                        k5VarArr3[i15].i(S3(null, true, i15));
                                                        z19 = true;
                                                        z18 = false;
                                                    } else {
                                                        k5VarArr3[i15].i(null);
                                                    }
                                                }
                                                z19 = false;
                                                z18 = false;
                                            } else {
                                                boolean z24 = user2.scam;
                                                if (z24 || user2.fake) {
                                                    str6 = str7;
                                                    k5VarArr3[i15].j(a4(!z24 ? 1 : 0));
                                                    this.n = LocaleController.getString(R.string.ScamMessage);
                                                } else if (user2.verified) {
                                                    k5VarArr3[i15].j(d4(i15));
                                                    this.n = LocaleController.getString(R.string.AccDescrVerified);
                                                    str6 = str7;
                                                } else {
                                                    MessagesController messagesController = getMessagesController();
                                                    long j12 = this.f1;
                                                    if (j12 == 0) {
                                                        j12 = this.b1;
                                                    }
                                                    String str9 = str7;
                                                    if (messagesController.isDialogMuted(j12, this.d1)) {
                                                        str6 = str9;
                                                        k5VarArr3[i15].j(getThemedDrawable(str6));
                                                        this.n = LocaleController.getString(R.string.NotificationsMuted);
                                                    } else {
                                                        str6 = str9;
                                                        k5VarArr3[i15].j(null);
                                                        this.n = null;
                                                    }
                                                }
                                                if (!MessagesController.isSupportUser(user2) && DialogObject.getEmojiStatusDocumentId(user2.emoji_status) != 0) {
                                                    k5VarArr3[i15].i(S3(user2.emoji_status, false, i15));
                                                    this.h = LocaleController.getString(R.string.AccDescrPremium);
                                                    z19 = false;
                                                    z18 = true;
                                                } else if (getMessagesController().isPremiumUser(user2)) {
                                                    k5VarArr3[i15].i(S3(null, false, i15));
                                                    this.h = LocaleController.getString(R.string.AccDescrPremium);
                                                    z19 = true;
                                                    z18 = false;
                                                } else {
                                                    k5VarArr3[i15].i(null);
                                                    this.h = null;
                                                    z19 = false;
                                                    z18 = false;
                                                }
                                            }
                                            if (V3 == null && this.A2 == null) {
                                                j5Var = V3;
                                                fileLocation = fileLocation2;
                                                if (user2.bot_verification_icon != 0) {
                                                    k5VarArr3[i15].setLeftDrawableOutside(true);
                                                    j5Var2 = Q3(i15, user2.bot_verification_icon);
                                                    k5VarArr3[i15].setLeftDrawable(j5Var2);
                                                    if (i15 == 1 && (z18 || z19)) {
                                                        k5VarArr3[i15].setRightDrawableOutside(true);
                                                    }
                                                    if (!user2.self && getMessagesController().isPremiumUser(user2)) {
                                                        k5VarArr3[i15].setRightDrawableOnClick(new ox0(this, 8));
                                                    }
                                                    if (!user2.self && getMessagesController().isPremiumUser(user2)) {
                                                        org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr3[i15];
                                                        k5Var2.setRightDrawableOnClick(new b0(this, user2, k5Var2, 14));
                                                    }
                                                }
                                            } else {
                                                j5Var = V3;
                                                fileLocation = fileLocation2;
                                            }
                                            k5VarArr3[i15].setLeftDrawableOutside(false);
                                            j5Var2 = j5Var;
                                            k5VarArr3[i15].setLeftDrawable(j5Var2);
                                            if (i15 == 1) {
                                                k5VarArr3[i15].setRightDrawableOutside(true);
                                            }
                                            if (!user2.self) {
                                            }
                                            if (!user2.self) {
                                                org.telegram.ui.ActionBar.k5 k5Var22 = k5VarArr3[i15];
                                                k5Var22.setRightDrawableOnClick(new b0(this, user2, k5Var22, 14));
                                            }
                                        }
                                        i15++;
                                        str7 = str6;
                                        fileLocation2 = fileLocation;
                                    }
                                    TLRPC.FileLocation fileLocation3 = fileLocation2;
                                    if (this.b1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                                        k5VarArr4[2].k(LocaleController.getString(R.string.FallbackTooltip));
                                        TLRPC.UserFull userFull2 = this.s2;
                                        if (userFull2 == null || (tl_starsRating = userFull2.stars_rating) == null || tl_starsRating.stars >= 0) {
                                            k5VarArr4[3].k(LocaleController.getString(R.string.Online));
                                        } else {
                                            k5VarArr4[3].k(LocaleController.getString(R.string.StarRatingLevelNegative).toLowerCase(Locale.ROOT));
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
                                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.zs(), str8.length() + 1, str8.length() + 2, 0);
                                            k5VarArr4[2].k(spannableStringBuilder);
                                        } else {
                                            i16 = 0;
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str8);
                                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.lz(i16), 0, str8.length(), 0);
                                            spannableStringBuilder2.append((CharSequence) " d ");
                                            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.CustomAvatarTooltip));
                                            c3 = 2;
                                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.zs(), str8.length() + 1, str8.length() + 2, 0);
                                            k5VarArr4[2].k(spannableStringBuilder2);
                                            k5VarArr4[c3].setVisibility(i16);
                                            if (!this.T1) {
                                                k5VarArr4[3].setVisibility(i16);
                                            }
                                            rgVar = this.d5;
                                            if (rgVar != null) {
                                                rgVar.p();
                                            }
                                            this.b0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation3) && (getLastStoryViewer() == null || getLastStoryViewer().p0.a != this.b0), this.r0 != null);
                                        }
                                    }
                                    c3 = 2;
                                    k5VarArr4[c3].setVisibility(i16);
                                    if (!this.T1) {
                                    }
                                    rgVar = this.d5;
                                    if (rgVar != null) {
                                    }
                                    this.b0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation3) && (getLastStoryViewer() == null || getLastStoryViewer().p0.a != this.b0), this.r0 != null);
                                }
                            } else if (UserObject.hasFallbackPhoto(this.s2)) {
                                this.m5 = true;
                                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.s2.fallback_photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                if (closestPhotoSizeWithSize != null) {
                                    this.o5.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.s2.fallback_photo), "50_50", (Drawable) null, 0L, (String) null, UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0);
                                }
                            } else {
                                TLRPC.UserFull userFull3 = this.s2;
                                str8 = (userFull3 == null || (tl_starsRating2 = userFull3.stars_rating) == null || tl_starsRating2.stars >= 0) ? LocaleController.getString(R.string.Online) : LocaleController.getString(R.string.StarRatingLevelNegative).toLowerCase(Locale.ROOT);
                            }
                            z17 = false;
                            TLRPC.UserProfilePhoto userProfilePhoto32 = user2.photo;
                            this.n5 = userProfilePhoto32 == null && userProfilePhoto32.personal;
                            userName = Emoji.replaceEmoji(userName, k5VarArr3[1].getPaint().getFontMetricsInt(), false);
                            if (z10) {
                            }
                            i15 = 0;
                            while (i15 < 2) {
                            }
                            TLRPC.FileLocation fileLocation32 = fileLocation2;
                            if (this.b1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                            }
                            c3 = 2;
                            k5VarArr4[c3].setVisibility(i16);
                            if (!this.T1) {
                            }
                            rgVar = this.d5;
                            if (rgVar != null) {
                            }
                            this.b0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation32) && (getLastStoryViewer() == null || getLastStoryViewer().p0.a != this.b0), this.r0 != null);
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
                        z17 = false;
                        TLRPC.UserProfilePhoto userProfilePhoto322 = user2.photo;
                        this.n5 = userProfilePhoto322 == null && userProfilePhoto322.personal;
                        userName2 = Emoji.replaceEmoji(userName2, k5VarArr3[1].getPaint().getFontMetricsInt(), false);
                        if (z10) {
                        }
                        i15 = 0;
                        while (i15 < 2) {
                        }
                        TLRPC.FileLocation fileLocation322 = fileLocation2;
                        if (this.b1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                        }
                        c3 = 2;
                        k5VarArr4[c3].setVisibility(i16);
                        if (!this.T1) {
                        }
                        rgVar = this.d5;
                        if (rgVar != null) {
                        }
                        this.b0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation322) && (getLastStoryViewer() == null || getLastStoryViewer().p0.a != this.b0), this.r0 != null);
                    }
                    d5();
                    k4(true);
                    if (imageLocation2 != null) {
                    }
                    user2 = user;
                    CharSequence userName22 = UserObject.getUserName(user2);
                    if (user2.id != getUserConfig().getClientUserId()) {
                    }
                    z17 = false;
                    TLRPC.UserProfilePhoto userProfilePhoto3222 = user2.photo;
                    this.n5 = userProfilePhoto3222 == null && userProfilePhoto3222.personal;
                    userName22 = Emoji.replaceEmoji(userName22, k5VarArr3[1].getPaint().getFontMetricsInt(), false);
                    if (z10) {
                    }
                    i15 = 0;
                    while (i15 < 2) {
                    }
                    TLRPC.FileLocation fileLocation3222 = fileLocation2;
                    if (this.b1 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                    }
                    c3 = 2;
                    k5VarArr4[c3].setVisibility(i16);
                    if (!this.T1) {
                    }
                    rgVar = this.d5;
                    if (rgVar != null) {
                    }
                    this.b0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation3222) && (getLastStoryViewer() == null || getLastStoryViewer().p0.a != this.b0), this.r0 != null);
                } else if (this.c1 != 0) {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.c1));
                    if (chat2 != null) {
                        this.B2 = chat2;
                    } else {
                        chat2 = this.B2;
                    }
                    FlagSecureReason flagSecureReason = this.U1;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                    }
                    MessagesController.PeerColor peerColor2 = this.N5;
                    MessagesController.PeerColor fromCollectible2 = MessagesController.PeerColor.fromCollectible(chat2.emoji_status);
                    this.N5 = fromCollectible2;
                    if (fromCollectible2 == null) {
                        int profileColorId2 = ChatObject.getProfileColorId(chat2);
                        MessagesController.PeerColors peerColors2 = MessagesController.getInstance(this.currentAccount).profilePeerColors;
                        this.N5 = peerColors2 == null ? null : peerColors2.getColor(profileColorId2);
                    }
                    if (peerColor2 != this.N5) {
                        o5();
                    }
                    u01 u01Var2 = this.a1;
                    if (u01Var2 != null) {
                        u01Var2.b(ChatObject.getProfileEmojiId(chat2), chat2.emoji_status instanceof TLRPC.TL_emojiStatusCollectible);
                    }
                    TLRPC.EmojiStatus emojiStatus2 = chat2.emoji_status;
                    L4(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null);
                    if (this.n1) {
                        z11 = z10;
                        tL_forumTopic = getMessagesController().getTopicsController().findTopic(this.c1, this.d1);
                    } else {
                        z11 = z10;
                        tL_forumTopic = null;
                    }
                    if (ChatObject.isChannel(chat2)) {
                        if (this.n1) {
                            str4 = "Members";
                        } else {
                            TLRPC.ChatFull chatFull2 = this.r2;
                            if (chatFull2 != null) {
                                TLRPC.Chat chat3 = this.B2;
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
                            formatPluralString = this.B2.megagroup ? LocaleController.getString(R.string.Loading).toLowerCase() : ChatObject.isPublic(chat2) ? LocaleController.getString(R.string.ChannelPublic).toLowerCase() : LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                            k5VarArr2 = k5VarArr4;
                            z12 = false;
                            str = str4;
                            obj2 = obj;
                            charSequence = formatPluralString;
                            if (z11) {
                                xn xnVar3 = (xn) obj2;
                                if (xnVar3.X0.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.k5) {
                                    formatPluralString = ((org.telegram.ui.ActionBar.k5) xnVar3.X0.getSubtitleTextView()).getText();
                                } else if (xnVar3.X0.getSubtitleTextView() instanceof org.telegram.ui.Components.k6) {
                                    formatPluralString = ((org.telegram.ui.Components.k6) xnVar3.X0.getSubtitleTextView()).getText();
                                }
                                this.b0.setAnimateFromImageReceiver(xnVar3.X0.getAvatarImageView().getImageReceiver());
                            }
                            i10 = 0;
                            z13 = false;
                            while (i10 < 2) {
                                org.telegram.ui.ActionBar.k5 k5Var3 = k5VarArr[i10];
                                if (k5Var3 == null) {
                                    str3 = string;
                                    charSequence2 = formatPluralString;
                                    z14 = z11;
                                    str2 = str8;
                                } else if (i10 == 0 && z11) {
                                    org.telegram.ui.ActionBar.k5 titleTextView2 = ((xn) obj2).X0.getTitleTextView();
                                    if (k5VarArr[i10].k(titleTextView2.getText())) {
                                        z13 = true;
                                    }
                                    if (k5VarArr[i10].i(titleTextView2.getRightDrawable())) {
                                        z13 = true;
                                    }
                                    charSequence2 = formatPluralString;
                                } else if (this.n1) {
                                    CharSequence charSequence3 = tL_forumTopic == null ? str8 : tL_forumTopic.title;
                                    try {
                                        fontMetricsInt = k5Var3.getPaint().getFontMetricsInt();
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
                                                charSequence4 = Emoji.replaceEmoji(charSequence4, k5VarArr[i10].getPaint().getFontMetricsInt(), false);
                                            } catch (Exception unused3) {
                                            }
                                        }
                                        k5VarArr[i10].setLeftDrawableOutside(false);
                                        k5VarArr[i10].setLeftDrawable((Drawable) null);
                                        k5VarArr[i10].setRightDrawableOutside(i10 == 0);
                                        k5VarArr[i10].setRightDrawableOnClick(null);
                                        if (i10 != 0) {
                                            boolean z25 = chat2.scam;
                                            if (z25 || chat2.fake) {
                                                k5VarArr[i10].j(a4(!z25 ? 1 : 0));
                                                this.h = LocaleController.getString(R.string.ScamMessage);
                                            } else if (chat2.verified) {
                                                k5VarArr[i10].j(d4(i10));
                                                this.h = LocaleController.getString(R.string.AccDescrVerified);
                                            } else {
                                                k5VarArr[i10].j(null);
                                                this.h = null;
                                            }
                                            if (DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) != 0) {
                                                k5VarArr[i10].i(S3(chat2.emoji_status, false, i10));
                                                k5VarArr[i10].setRightDrawableOutside(true);
                                                this.h = null;
                                                if (ChatObject.canChangeChatInfo(chat2)) {
                                                    k5VarArr[i10].setRightDrawableOnClick(new ox0(this, 9));
                                                    if (this.P) {
                                                        this.P = true;
                                                        getMediaDataController().loadRestrictedStatusEmojis();
                                                    }
                                                } else {
                                                    TLRPC.EmojiStatus emojiStatus3 = chat2.emoji_status;
                                                    if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
                                                        z14 = z11;
                                                        k5VarArr[i10].setRightDrawableOnClick(new dy0(this, ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug, 0));
                                                    }
                                                }
                                            }
                                            z14 = z11;
                                        } else {
                                            z14 = z11;
                                            if (!z14) {
                                                boolean z26 = chat2.scam;
                                                if (z26 || chat2.fake) {
                                                    z15 = z13;
                                                    str2 = str8;
                                                    k5VarArr[i10].j(a4(!z26 ? 1 : 0));
                                                } else if (chat2.verified) {
                                                    k5VarArr[i10].j(d4(i10));
                                                    z15 = z13;
                                                    str2 = str8;
                                                } else {
                                                    z15 = z13;
                                                    str2 = str8;
                                                    if (getMessagesController().isDialogMuted(-this.c1, this.d1)) {
                                                        k5VarArr[i10].j(getThemedDrawable("drawableMuteIcon"));
                                                    } else {
                                                        k5VarArr[i10].j(null);
                                                    }
                                                }
                                                if (DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) != 0) {
                                                    k5VarArr[i10].i(S3(chat2.emoji_status, false, i10));
                                                    z16 = true;
                                                    k5VarArr[i10].setRightDrawableOutside(true);
                                                } else {
                                                    z16 = true;
                                                    k5VarArr[i10].i(null);
                                                }
                                                if (chat2.bot_verification_icon == 0) {
                                                    k5VarArr[i10].setLeftDrawableOutside(z16);
                                                    k5VarArr[i10].setLeftDrawable(Q3(i10, chat2.bot_verification_icon));
                                                } else {
                                                    k5VarArr[i10].setLeftDrawable((Drawable) null);
                                                }
                                                if (i10 == 0 || string == null) {
                                                    if (!z14) {
                                                        TLRPC.Chat chat4 = this.B2;
                                                        if ((!chat4.megagroup || this.r2 == null || this.y2 <= 0) && !this.n1) {
                                                            if (i10 == 0 && ChatObject.isChannel(chat4) && (chatFull = this.r2) != null && chatFull.participants_count != 0) {
                                                                TLRPC.Chat chat5 = this.B2;
                                                                if (chat5.megagroup || chat5.broadcast) {
                                                                    int[] iArr = new int[1];
                                                                    if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                                                        int i19 = this.r2.participants_count;
                                                                        iArr[0] = i19;
                                                                        formatShortNumber = String.valueOf(i19);
                                                                    } else {
                                                                        formatShortNumber = LocaleController.formatShortNumber(this.r2.participants_count, iArr);
                                                                    }
                                                                    if (!this.B2.megagroup) {
                                                                        str3 = string;
                                                                        k5VarArr2[i10].k(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber));
                                                                        if (i10 == 1 && this.n1) {
                                                                            if (z12) {
                                                                                k5VarArr2[i10].setOnClickListener(null);
                                                                                k5VarArr2[i10].setClickable(false);
                                                                            } else {
                                                                                k5VarArr2[i10].setOnClickListener(new ox0(this, 10));
                                                                            }
                                                                        }
                                                                        z13 = z15;
                                                                    } else if (this.r2.participants_count != 0) {
                                                                        CharSequence replace = LocaleController.formatPluralString(str, iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber);
                                                                        org.telegram.ui.ActionBar.k5 k5Var4 = k5VarArr2[i10];
                                                                        if (i10 != 0) {
                                                                            replace = v3(replace);
                                                                        }
                                                                        k5Var4.k(replace);
                                                                    } else if (chat2.has_geo) {
                                                                        k5VarArr2[i10].k(LocaleController.getString(R.string.MegaLocation).toLowerCase());
                                                                    } else if (ChatObject.isPublic(chat2)) {
                                                                        k5VarArr2[i10].k(LocaleController.getString(R.string.MegaPublic).toLowerCase());
                                                                    } else {
                                                                        k5VarArr2[i10].k(LocaleController.getString(R.string.MegaPrivate).toLowerCase());
                                                                    }
                                                                }
                                                            }
                                                            str3 = string;
                                                            k5VarArr2[i10].k(i10 == 0 ? charSequence2 : v3(charSequence));
                                                            if (i10 == 1) {
                                                                if (z12) {
                                                                }
                                                            }
                                                            z13 = z15;
                                                        }
                                                    }
                                                    str3 = string;
                                                    k5VarArr2[i10].k(i10 != 0 ? charSequence2 : v3(charSequence));
                                                    if (i10 == 1) {
                                                    }
                                                    z13 = z15;
                                                } else {
                                                    k5VarArr2[i10].k(string);
                                                }
                                                str3 = string;
                                                if (i10 == 1) {
                                                }
                                                z13 = z15;
                                            }
                                        }
                                        z15 = z13;
                                        str2 = str8;
                                        z16 = true;
                                        if (chat2.bot_verification_icon == 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if (!z14) {
                                        }
                                        str3 = string;
                                        k5VarArr2[i10].k(i10 != 0 ? charSequence2 : v3(charSequence));
                                        if (i10 == 1) {
                                        }
                                        z13 = z15;
                                    }
                                }
                                i10++;
                                formatPluralString = charSequence2;
                                str8 = str2;
                                z11 = z14;
                                string = str3;
                            }
                            if (z13) {
                                k4(true);
                            }
                            TLRPC.ChatPhoto chatPhoto = chat2.photo;
                            TLRPC.FileLocation fileLocation4 = (chatPhoto != null || this.n1) ? null : chatPhoto.photo_big;
                            if (this.n1) {
                                ag.f.p(this.b0, tL_forumTopic, true, true, this.w0);
                                forUserOrChat = null;
                                forUserOrChat2 = null;
                            } else {
                                if (ChatObject.isMonoForum(this.B2)) {
                                    TLRPC.Chat monoForumLinkedChat = getMessagesController().getMonoForumLinkedChat(this.B2.id);
                                    this.m0.k(this.currentAccount, monoForumLinkedChat);
                                    ImageLocation forUserOrChat6 = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat, 0);
                                    ImageLocation forUserOrChat7 = ImageLocation.getForUserOrChat(this.currentAccount, monoForumLinkedChat, 1);
                                    C = this.k0.C(forUserOrChat7, forUserOrChat6);
                                    forUserOrChat2 = forUserOrChat7;
                                    forUserOrChat = forUserOrChat6;
                                } else {
                                    this.m0.k(this.currentAccount, chat2);
                                    forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 0);
                                    forUserOrChat2 = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 1);
                                    xy0 xy0Var = this.k0;
                                    if (xy0Var != null) {
                                        C = xy0Var.C(forUserOrChat2, forUserOrChat);
                                    }
                                }
                                boolean H = this.k0.H(null, forUserOrChat, forUserOrChat2, z4);
                                if ((forUserOrChat != null || H) && this.m2) {
                                    m9 = this.c.m(0);
                                    if (m9 != null) {
                                        this.a.v0(0, m9.getTop() - T3(), org.telegram.ui.Components.nr.h);
                                    }
                                }
                                String str10 = (C == null && C.imageType == 2) ? ImageLoader.AUTOPLAY_FILTER : null;
                                if (this.G2 == null || this.n1) {
                                    chat = chat2;
                                } else {
                                    TLRPC.Chat chat6 = chat2;
                                    this.b0.l(C, str10, forUserOrChat2, "50_50", this.m0, chat6);
                                    chat = chat6;
                                }
                                if (forUserOrChat != null && ((imageLocation = this.y0) == null || forUserOrChat.photoId != imageLocation.photoId)) {
                                    this.y0 = forUserOrChat;
                                    getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
                                }
                                this.b0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation4) && (getLastStoryViewer() == null || getLastStoryViewer().p0.a != this.b0), this.r0 == null);
                            }
                            C = null;
                            boolean H2 = this.k0.H(null, forUserOrChat, forUserOrChat2, z4);
                            if (forUserOrChat != null) {
                            }
                            m9 = this.c.m(0);
                            if (m9 != null) {
                            }
                            if (C == null) {
                            }
                            if (this.G2 == null) {
                            }
                            chat = chat2;
                            if (forUserOrChat != null) {
                                this.y0 = forUserOrChat;
                                getFileLoader().loadFile(forUserOrChat, chat, null, 0, 1);
                            }
                            this.b0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation4) && (getLastStoryViewer() == null || getLastStoryViewer().p0.a != this.b0), this.r0 == null);
                        }
                        if (this.n1) {
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
                            spannableString.setSpan(new org.telegram.ui.Components.mq(R.drawable.arrow_newchat), i14, 1, 33);
                            str = str4;
                            obj2 = obj;
                            z12 = true;
                            charSequence = new SpannableStringBuilder(chat2.title).append(' ').append((CharSequence) spannableString);
                            formatPluralString = str11;
                            k5VarArr2 = k5VarArr4;
                        } else {
                            str = str4;
                            if (!this.B2.megagroup) {
                                obj2 = obj;
                                k5VarArr2 = k5VarArr4;
                                LocaleController.formatShortNumber(this.r2.participants_count, new int[1]);
                                if (this.B2.megagroup) {
                                    formatPluralString = LocaleController.formatPluralString(str, this.r2.participants_count, new Object[0]);
                                    charSequence = LocaleController.formatPluralStringComma(str, this.r2.participants_count);
                                } else {
                                    formatPluralString = LocaleController.formatPluralString("Subscribers", this.r2.participants_count, new Object[0]);
                                    charSequence = LocaleController.formatPluralStringComma("Subscribers", this.r2.participants_count);
                                }
                            } else if (this.y2 <= 1 || (i11 = this.r2.participants_count) == 0) {
                                obj2 = obj;
                                k5VarArr2 = k5VarArr4;
                                int i21 = this.r2.participants_count;
                                if (i21 == 0) {
                                    formatPluralString = chat2.has_geo ? LocaleController.getString(R.string.MegaLocation).toLowerCase() : ChatObject.isPublic(chat2) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                                } else {
                                    formatPluralString = LocaleController.formatPluralString(str, i21, new Object[0]);
                                    charSequence = LocaleController.formatPluralStringComma(str, this.r2.participants_count);
                                }
                            } else {
                                obj2 = obj;
                                k5VarArr2 = k5VarArr4;
                                formatPluralString = android.support.v4.media.a.z(LocaleController.formatPluralString(str, i11, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(this.y2, this.r2.participants_count), new Object[0]));
                                z12 = false;
                                charSequence = android.support.v4.media.a.z(LocaleController.formatPluralStringComma(str, this.r2.participants_count), ", ", LocaleController.formatPluralStringComma("OnlineCount", Math.min(this.y2, this.r2.participants_count)));
                            }
                            z12 = false;
                        }
                        if (z11) {
                        }
                        i10 = 0;
                        z13 = false;
                        while (i10 < 2) {
                        }
                        if (z13) {
                        }
                        TLRPC.ChatPhoto chatPhoto2 = chat2.photo;
                        if (chatPhoto2 != null) {
                        }
                        if (this.n1) {
                        }
                        C = null;
                        boolean H22 = this.k0.H(null, forUserOrChat, forUserOrChat2, z4);
                        if (forUserOrChat != null) {
                        }
                        m9 = this.c.m(0);
                        if (m9 != null) {
                        }
                        if (C == null) {
                        }
                        if (this.G2 == null) {
                        }
                        chat = chat2;
                        if (forUserOrChat != null) {
                        }
                        this.b0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation4) && (getLastStoryViewer() == null || getLastStoryViewer().p0.a != this.b0), this.r0 == null);
                    } else {
                        str = "Members";
                        obj2 = obj;
                        k5VarArr2 = k5VarArr4;
                        if (ChatObject.isKickedFromChat(chat2)) {
                            formatPluralString = LocaleController.getString(R.string.YouWereKicked);
                        } else if (ChatObject.isLeftFromChat(chat2)) {
                            formatPluralString = LocaleController.getString(R.string.YouLeft);
                        } else {
                            int i22 = chat2.participants_count;
                            TLRPC.ChatFull chatFull3 = this.r2;
                            if (chatFull3 != null && (chatParticipants = chatFull3.participants) != null) {
                                i22 = chatParticipants.participants.size();
                            }
                            formatPluralString = (i22 == 0 || this.y2 <= 1) ? LocaleController.formatPluralString(str, i22, new Object[0]) : android.support.v4.media.a.z(LocaleController.formatPluralString(str, i22, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", this.y2, new Object[0]));
                        }
                    }
                    charSequence = formatPluralString;
                    z12 = false;
                    if (z11) {
                    }
                    i10 = 0;
                    z13 = false;
                    while (i10 < 2) {
                    }
                    if (z13) {
                    }
                    TLRPC.ChatPhoto chatPhoto22 = chat2.photo;
                    if (chatPhoto22 != null) {
                    }
                    if (this.n1) {
                    }
                    C = null;
                    boolean H222 = this.k0.H(null, forUserOrChat, forUserOrChat2, z4);
                    if (forUserOrChat != null) {
                    }
                    m9 = this.c.m(0);
                    if (m9 != null) {
                    }
                    if (C == null) {
                    }
                    if (this.G2 == null) {
                    }
                    chat = chat2;
                    if (forUserOrChat != null) {
                    }
                    this.b0.getImageReceiver().setVisible(PhotoViewer.O1(fileLocation4) && (getLastStoryViewer() == null || getLastStoryViewer().p0.a != this.b0), this.r0 == null);
                }
                k4(true);
            }
        }
        z10 = false;
        this.m5 = false;
        this.n5 = false;
        j10 = this.b1;
        String str72 = "drawableMuteIcon";
        String str82 = "";
        org.telegram.ui.ActionBar.k5[] k5VarArr42 = this.r;
        if (j10 == 0) {
        }
        k4(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isActionBarCrossfadeEnabled() {
        return !this.m2;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        int bgColor2;
        if (this.m2) {
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.s()) {
            bgColor2 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.w8, this.w0);
        } else if (this.C5) {
            bgColor2 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.w0);
        } else {
            MessagesController.PeerColor peerColor = this.N5;
            bgColor2 = peerColor != null ? peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q()) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, this.w0);
        }
        return i0.a.f(bgColor2) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r3.contains((int) r7.getX(), ((int) r7.getY()) - r6.actionBar.getMeasuredHeight()) != false) goto L20;
     */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        sz0 sz0Var;
        xy0 xy0Var = this.k0;
        Rect rect = this.I2;
        if (xy0Var != null && xy0Var.getVisibility() == 0 && this.k0.getRealCount() > 1) {
            this.k0.getHitRect(rect);
            if (motionEvent != null) {
            }
        }
        if (this.G4 != -1 && (sz0Var = this.L) != null) {
            if (sz0Var.x0()) {
                this.L.getHitRect(rect);
                if (motionEvent == null || rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
                    sz0 sz0Var2 = this.L;
                    return sz0Var2.getSelectedTab() == sz0Var2.F0.getFirstTabId();
                }
            }
            return false;
        }
        return true;
    }

    public final boolean j4() {
        return getMessagesController().getStoriesController().I(a()) && !this.n1;
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
        boolean z4;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatParticipants chatParticipants2;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull4;
        int i10;
        my0 my0Var;
        org.telegram.ui.Components.jh0 jh0Var;
        org.telegram.ui.Components.ci0 ci0Var;
        int i11;
        boolean z10;
        TLRPC.UserFull userFull;
        boolean z11;
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
        int i12 = this.K2;
        this.K2 = 0;
        this.L2 = -1;
        this.M2 = -1;
        this.P2 = -1;
        this.Q2 = -1;
        this.R2 = -1;
        this.S2 = -1;
        this.T2 = -1;
        this.N2 = -1;
        this.O2 = -1;
        this.U2 = -1;
        this.X2 = -1;
        this.Y2 = -1;
        this.V2 = -1;
        this.W2 = -1;
        this.Z2 = -1;
        this.a3 = -1;
        this.b3 = -1;
        this.c3 = -1;
        this.d3 = -1;
        this.Z3 = -1;
        this.a4 = -1;
        this.b4 = -1;
        this.c4 = -1;
        this.d4 = -1;
        this.e4 = -1;
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
        this.w3 = -1;
        this.f4 = -1;
        this.k4 = -1;
        this.botPermissionBiometry = -1;
        this.botPermissionEmojiStatus = -1;
        this.botPermissionLocation = -1;
        this.m4 = -1;
        this.g4 = -1;
        this.h4 = -1;
        this.i4 = -1;
        this.j4 = -1;
        this.R3 = -1;
        this.S3 = -1;
        this.U3 = -1;
        this.T3 = -1;
        this.W3 = -1;
        this.x3 = -1;
        this.y3 = -1;
        this.A3 = -1;
        this.B3 = -1;
        this.C3 = -1;
        this.D3 = -1;
        this.E3 = -1;
        this.G3 = -1;
        this.F3 = -1;
        this.H3 = -1;
        this.I3 = -1;
        this.n4 = -1;
        this.o4 = -1;
        this.J3 = -1;
        this.V3 = -1;
        this.K3 = -1;
        this.M3 = -1;
        this.L3 = -1;
        this.O3 = -1;
        this.P3 = -1;
        this.Q3 = -1;
        this.p4 = -1;
        this.z3 = -1;
        this.X3 = -1;
        this.Y3 = -1;
        this.q4 = -1;
        this.r4 = -1;
        this.s4 = -1;
        this.t4 = -1;
        this.u4 = -1;
        this.v4 = -1;
        this.w4 = -1;
        this.D4 = -1;
        this.E4 = -1;
        this.B4 = -1;
        this.G4 = -1;
        this.N3 = -1;
        this.x4 = -1;
        this.y4 = -1;
        this.z4 = -1;
        this.A4 = -1;
        this.C4 = -1;
        this.F4 = false;
        this.H4 = -1;
        this.I4 = -1;
        this.J4 = -1;
        ArrayList arrayList2 = this.N4;
        arrayList2.clear();
        ArrayList arrayList3 = this.O4;
        arrayList3.clear();
        org.telegram.ui.Components.qu0 qu0Var = this.O;
        boolean z12 = true;
        if (qu0Var != null) {
            int[] iArr = qu0Var.c;
            int i13 = 0;
            while (true) {
                if (i13 >= iArr.length) {
                    z4 = false;
                    break;
                } else {
                    if (iArr[i13] > 0) {
                        z4 = true;
                        break;
                    }
                    i13++;
                }
            }
            if (!z4) {
                z4 = this.O.f;
            }
            if (!z4) {
                this.O.getClass();
            }
            if (!z4 && (userFull6 = this.s2) != null) {
                z4 = userFull6.stories_pinned_available;
            }
            if (!z4 && (userFull5 = this.s2) != null && (botInfo = userFull5.bot_info) != null) {
                z4 = botInfo.has_preview_medias;
            }
            if (!z4 && (((userFull4 = this.s2) != null && userFull4.stargifts_count > 0) || ((chatFull6 = this.r2) != null && chatFull6.stargifts_count > 0))) {
                z4 = true;
            }
            if (!z4 && (chatFull5 = this.r2) != null) {
                z4 = chatFull5.stories_pinned_available;
            }
            if (!z4) {
                long j10 = this.c1;
                if (j10 == 0 || !MessagesController.ChannelRecommendations.hasRecommendations(this.currentAccount, -j10)) {
                    if (this.o2) {
                        long j11 = this.b1;
                        if (j11 != 0) {
                        }
                    }
                }
                z4 = true;
            }
            if (this.b1 == 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b1));
                TLRPC.UserFull userFull7 = this.s2;
                if (userFull7 != null && userFull7.saved_music != null && (this.n0 == null || this.p1)) {
                    this.F4 = true;
                }
                if (this.x3 < 0 && this.y3 < 0) {
                    if (this.F4 || this.N5 != null || this.X == null) {
                        int i14 = this.K2;
                        this.K2 = i14 + 1;
                        this.y3 = i14;
                    } else {
                        int i15 = this.K2;
                        this.K2 = i15 + 1;
                        this.x3 = i15;
                    }
                }
                if (!UserObject.isUserSelf(user) || this.p1) {
                    String publicUsername = UserObject.getPublicUsername(user);
                    TLRPC.UserFull userFull8 = this.s2;
                    boolean z13 = ((userFull8 == null || TextUtils.isEmpty(userFull8.about)) && (user == null || TextUtils.isEmpty(publicUsername))) ? false : true;
                    boolean z14 = (user == null || (TextUtils.isEmpty(user.phone) && TextUtils.isEmpty(this.a5))) ? false : true;
                    if (!this.o2 && (userFull3 = this.s2) != null && userFull3.unofficial_security_risk) {
                        int i16 = this.K2;
                        this.g4 = i16;
                        this.K2 = i16 + 2;
                        this.h4 = i16 + 1;
                    }
                    TLRPC.UserFull userFull9 = this.s2;
                    if (userFull9 != null && (userFull9.flags2 & 64) != 0 && (((f6Var = this.t2) == null || !f6Var.c || !f6Var.d.isEmpty()) && (chat = getMessagesController().getChat(Long.valueOf(this.s2.personal_channel_id))) != null && (ChatObject.isPublic(chat) || !ChatObject.isNotInChat(chat)))) {
                        int i17 = this.K2;
                        this.N2 = i17;
                        this.K2 = i17 + 2;
                        this.O2 = i17 + 1;
                    }
                    if (!this.o2 && (z14 || !z13)) {
                        int i18 = this.K2;
                        this.K2 = i18 + 1;
                        this.D3 = i18;
                    }
                    TLRPC.UserFull userFull10 = this.s2;
                    if (userFull10 != null && !TextUtils.isEmpty(userFull10.about)) {
                        int i19 = this.K2;
                        this.K2 = i19 + 1;
                        this.G3 = i19;
                    }
                    if (user != null && publicUsername != null) {
                        int i20 = this.K2;
                        this.K2 = i20 + 1;
                        this.I3 = i20;
                    }
                    TLRPC.UserFull userFull11 = this.s2;
                    if (userFull11 != null) {
                        if (userFull11.birthday != null) {
                            int i21 = this.K2;
                            this.K2 = i21 + 1;
                            this.R2 = i21;
                        }
                        if (userFull11.business_work_hours != null) {
                            int i22 = this.K2;
                            this.K2 = i22 + 1;
                            this.L3 = i22;
                        }
                        if (userFull11.business_location != null) {
                            int i23 = this.K2;
                            this.K2 = i23 + 1;
                            this.M3 = i23;
                        }
                        if (userFull11.note != null) {
                            int i24 = this.K2;
                            this.K2 = i24 + 1;
                            this.E3 = i24;
                        }
                    }
                    if (this.X == null && this.b1 != getUserConfig().getClientUserId()) {
                        int i25 = this.K2;
                        this.K2 = i25 + 1;
                        this.K3 = i25;
                    }
                    boolean z15 = this.o2;
                    if (z15 && user != null && user.bot_has_main_app) {
                        int i26 = this.K2;
                        this.K2 = i26 + 1;
                        this.f4 = i26;
                    }
                    int i27 = this.K2;
                    int i28 = i27 + 1;
                    this.K2 = i28;
                    this.O3 = i27;
                    if (user != null && user.linked_community_id != 0) {
                        this.i4 = i28;
                        this.K2 = i27 + 3;
                        this.j4 = i27 + 2;
                    }
                    if (z15 && (userFull2 = this.s2) != null && (starrefprogram = userFull2.starref_program) != null && (starrefprogram.flags & 2) == 0 && getMessagesController().starrefConnectAllowed) {
                        int i29 = this.K2;
                        this.P3 = i29;
                        this.K2 = i29 + 2;
                        this.Q3 = i29 + 1;
                    }
                    if (this.o2) {
                        if (this.p2 == null && getContext() != null) {
                            this.p2 = rh.r0.e(getContext(), this.currentAccount, this.b1);
                        }
                        if (this.q2 == null && getContext() != null) {
                            this.q2 = rh.q.c(getContext(), this.currentAccount, this.b1);
                        }
                        rh.r0 r0Var = this.p2;
                        boolean z16 = r0Var != null && r0Var.b();
                        rh.q qVar = this.q2;
                        boolean z17 = qVar != null && qVar.a();
                        TLRPC.UserFull userFull12 = this.s2;
                        if (userFull12 == null || !userFull12.bot_can_manage_emoji_status) {
                            if (!rh.x3.d((Activity) getContext(), this.currentAccount, this.b1)) {
                                z11 = false;
                                if (!z11 || z16 || z17) {
                                    int i30 = this.K2;
                                    int i31 = i30 + 1;
                                    this.K2 = i31;
                                    this.k4 = i30;
                                    if (z11) {
                                        this.K2 = i30 + 2;
                                        this.botPermissionEmojiStatus = i31;
                                    }
                                    if (z16) {
                                        int i32 = this.K2;
                                        this.K2 = i32 + 1;
                                        this.botPermissionLocation = i32;
                                    }
                                    if (z17) {
                                        int i33 = this.K2;
                                        this.K2 = i33 + 1;
                                        this.botPermissionBiometry = i33;
                                    }
                                    int i34 = this.K2;
                                    this.K2 = i34 + 1;
                                    this.m4 = i34;
                                }
                            }
                        }
                        z11 = true;
                        if (!z11) {
                        }
                        int i302 = this.K2;
                        int i312 = i302 + 1;
                        this.K2 = i312;
                        this.k4 = i302;
                        if (z11) {
                        }
                        if (z16) {
                        }
                        if (z17) {
                        }
                        int i342 = this.K2;
                        this.K2 = i342 + 1;
                        this.m4 = i342;
                    }
                    TLRPC.EncryptedChat encryptedChat = this.A2;
                    if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                        int i35 = this.K2;
                        this.n4 = i35;
                        this.o4 = i35 + 1;
                        this.K2 = i35 + 3;
                        this.p4 = i35 + 2;
                    }
                    if (user != null && !this.o2 && encryptedChat == null && user.id != getUserConfig().getClientUserId() && this.h1) {
                        int i36 = this.K2;
                        this.H4 = i36;
                        this.K2 = i36 + 2;
                        this.J4 = i36 + 1;
                    }
                    if (user != null && user.bot) {
                        TLRPC.UserFull userFull13 = this.s2;
                        if (userFull13 != null && userFull13.can_view_revenue && lh.b0.g(this.currentAccount).i(this.b1) > 0) {
                            int i37 = this.K2;
                            this.K2 = i37 + 1;
                            this.z4 = i37;
                        }
                        if (lh.b0.g(this.currentAccount).c(this.b1).amount > 0 || !lh.b0.g(this.currentAccount).k(this.b1).a[0].isEmpty()) {
                            int i38 = this.K2;
                            this.K2 = i38 + 1;
                            this.y4 = i38;
                        }
                    }
                    if (user != null && this.o2 && !user.bot_nochats) {
                        int i39 = this.K2;
                        this.X3 = i39;
                        this.K2 = i39 + 2;
                        this.Y3 = i39 + 1;
                    } else if (this.y4 >= 0) {
                        z10 = true;
                        if (!this.p1 && this.Z4 && user != null && !user.contact && !user.bot && !UserObject.isService(user.id)) {
                            int i40 = this.K2;
                            this.K2 = i40 + 1;
                            this.W3 = i40;
                            z10 = true;
                        }
                        if (!this.p1 && this.W4 != 0 && this.X4 < 0 && ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(-this.X4)), 13)) {
                            int i41 = this.K2;
                            this.K2 = i41 + 1;
                            this.T3 = i41;
                            z10 = true;
                        }
                        if (!this.p1 || this.W4 == 0 || ContactsController.getInstance(this.currentAccount).isContact(this.b1)) {
                            z12 = z10;
                        } else {
                            int i42 = this.K2;
                            this.K2 = i42 + 1;
                            this.U3 = i42;
                        }
                        if (z12) {
                            int i43 = this.K2;
                            this.K2 = i43 + 1;
                            this.V3 = i43;
                        }
                        if (!z4 || ((user != null && user.bot && user.bot_can_edit && user.bot_has_main_app) || (!((userFull = this.s2) == null || userFull.common_chats_count == 0) || this.p1))) {
                            int i44 = this.K2;
                            this.K2 = i44 + 1;
                            this.G4 = i44;
                        } else if (this.J4 == -1 && this.l1) {
                            int i45 = this.K2;
                            this.R3 = i45;
                            this.K2 = i45 + 2;
                            this.J4 = i45 + 1;
                        }
                    }
                    z10 = false;
                    if (!this.p1) {
                        int i402 = this.K2;
                        this.K2 = i402 + 1;
                        this.W3 = i402;
                        z10 = true;
                    }
                    if (!this.p1) {
                        int i412 = this.K2;
                        this.K2 = i412 + 1;
                        this.T3 = i412;
                        z10 = true;
                    }
                    if (this.p1) {
                    }
                    z12 = z10;
                    if (z12) {
                    }
                    if (z4) {
                    }
                    int i442 = this.K2;
                    this.K2 = i442 + 1;
                    this.G4 = i442;
                } else {
                    if (this.G2 == null) {
                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                        if (userProfilePhoto != null) {
                            TLRPC.FileLocation fileLocation = userProfilePhoto.photo_big;
                            if (!(fileLocation instanceof TLRPC.TL_fileLocation_layer97)) {
                            }
                        }
                        xy0 xy0Var = this.k0;
                        if (xy0Var == null || xy0Var.getRealCount() == 0) {
                            int i46 = this.K2;
                            this.L2 = i46;
                            this.K2 = i46 + 2;
                            this.M2 = i46 + 1;
                        }
                    }
                    int i47 = this.K2;
                    this.P2 = i47;
                    this.Q2 = i47 + 1;
                    this.S2 = i47 + 2;
                    this.T2 = i47 + 3;
                    this.K2 = i47 + 5;
                    this.a3 = i47 + 4;
                    Set<String> set = getMessagesController().pendingSuggestions;
                    if (set.contains("PREMIUM_GRACE")) {
                        int i48 = this.K2;
                        this.V2 = i48;
                        this.K2 = i48 + 2;
                        this.W2 = i48 + 1;
                    } else if (set.contains("VALIDATE_PHONE_NUMBER")) {
                        int i49 = this.K2;
                        this.X2 = i49;
                        this.K2 = i49 + 2;
                        this.U2 = i49 + 1;
                    } else if (set.contains("VALIDATE_PASSWORD")) {
                        int i50 = this.K2;
                        this.Z2 = i50;
                        this.K2 = i50 + 2;
                        this.Y2 = i50 + 1;
                    }
                    int i51 = this.K2;
                    this.b3 = i51;
                    this.g3 = i51 + 1;
                    this.e3 = i51 + 2;
                    this.c3 = i51 + 3;
                    this.f3 = i51 + 4;
                    this.K2 = i51 + 6;
                    this.i3 = i51 + 5;
                    if (getMessagesController().filtersEnabled || !getMessagesController().dialogFilters.isEmpty()) {
                        int i52 = this.K2;
                        this.K2 = i52 + 1;
                        this.h3 = i52;
                    }
                    int i53 = this.K2;
                    this.k3 = i53;
                    this.d3 = i53 + 1;
                    this.K2 = i53 + 3;
                    this.l3 = i53 + 2;
                    if (!getMessagesController().premiumFeaturesBlocked()) {
                        int i54 = this.K2;
                        this.K2 = i54 + 1;
                        this.Z3 = i54;
                    }
                    if (getMessagesController().starsPurchaseAvailable()) {
                        int i55 = this.K2;
                        this.K2 = i55 + 1;
                        this.a4 = i55;
                    }
                    lh.t7.y(this.currentAccount, true).p();
                    if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (lh.t7.y(this.currentAccount, true).e && (lh.t7.y(this.currentAccount, true).N() || lh.t7.y(this.currentAccount, true).p().positive()))) {
                        int i56 = this.K2;
                        this.K2 = i56 + 1;
                        this.b4 = i56;
                    }
                    if (!getMessagesController().premiumFeaturesBlocked()) {
                        int i57 = this.K2;
                        this.K2 = i57 + 1;
                        this.c4 = i57;
                    }
                    if (!getMessagesController().premiumPurchaseBlocked()) {
                        int i58 = this.K2;
                        this.K2 = i58 + 1;
                        this.d4 = i58;
                    }
                    if (this.Z3 >= 0 || this.a4 >= 0 || this.b4 >= 0 || this.c4 >= 0 || this.d4 >= 0) {
                        int i59 = this.K2;
                        this.K2 = i59 + 1;
                        this.e4 = i59;
                    }
                    int i60 = this.K2;
                    this.m3 = i60;
                    this.n3 = i60 + 1;
                    this.o3 = i60 + 2;
                    int i61 = i60 + 4;
                    this.K2 = i61;
                    this.p3 = i60 + 3;
                    if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
                        this.q3 = i61;
                        this.K2 = i60 + 6;
                        this.r3 = i60 + 5;
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        int i62 = this.K2;
                        this.s3 = i62;
                        this.t3 = i62 + 1;
                        this.K2 = i62 + 3;
                        this.u3 = i62 + 2;
                    }
                    if (BuildVars.DEBUG_VERSION) {
                        int i63 = this.K2;
                        this.K2 = i63 + 1;
                        this.v3 = i63;
                    }
                    int i64 = this.K2;
                    this.K2 = i64 + 1;
                    this.w3 = i64;
                }
            } else if (this.n1) {
                if (this.x3 < 0 && this.y3 < 0) {
                    if (this.F4 || this.N5 != null || this.X == null) {
                        int i65 = this.K2;
                        this.K2 = i65 + 1;
                        this.y3 = i65;
                    } else {
                        int i66 = this.K2;
                        this.K2 = i66 + 1;
                        this.x3 = i66;
                    }
                }
                int i67 = this.K2;
                int i68 = i67 + 1;
                this.K2 = i68;
                this.I3 = i67;
                if (this.X == null) {
                    this.K2 = i67 + 2;
                    this.N3 = i68;
                }
                int i69 = this.K2;
                int i70 = i69 + 1;
                this.K2 = i70;
                this.O3 = i69;
                if (z4) {
                    this.K2 = i69 + 2;
                    this.G4 = i70;
                }
            } else if (this.c1 != 0) {
                TLRPC.ChatFull chatFull7 = this.r2;
                if ((chatFull7 != null && (!TextUtils.isEmpty(chatFull7.about) || (this.r2.location instanceof TLRPC.TL_channelLocation))) || ChatObject.isPublic(this.B2)) {
                    if (this.x3 < 0 && this.y3 < 0) {
                        if (this.F4 || this.N5 != null || this.X == null) {
                            int i71 = this.K2;
                            this.K2 = i71 + 1;
                            this.y3 = i71;
                        } else {
                            int i72 = this.K2;
                            this.K2 = i72 + 1;
                            this.x3 = i72;
                        }
                    }
                    if (this.X == null) {
                        int i73 = this.K2;
                        this.K2 = i73 + 1;
                        this.A3 = i73;
                    }
                    TLRPC.ChatFull chatFull8 = this.r2;
                    if (chatFull8 != null) {
                        if (!TextUtils.isEmpty(chatFull8.about)) {
                            int i74 = this.K2;
                            this.K2 = i74 + 1;
                            this.H3 = i74;
                        }
                        if (this.r2.location instanceof TLRPC.TL_channelLocation) {
                            int i75 = this.K2;
                            this.K2 = i75 + 1;
                            this.F3 = i75;
                        }
                    }
                    if (ChatObject.isPublic(this.B2)) {
                        int i76 = this.K2;
                        this.K2 = i76 + 1;
                        this.I3 = i76;
                    }
                }
                if (this.x3 < 0 && this.y3 < 0) {
                    if (this.F4 || this.N5 != null || this.X == null) {
                        int i77 = this.K2;
                        this.K2 = i77 + 1;
                        this.y3 = i77;
                    } else {
                        int i78 = this.K2;
                        this.K2 = i78 + 1;
                        this.x3 = i78;
                    }
                }
                if (this.X == null) {
                    if (this.A3 != -1) {
                        int i79 = this.K2;
                        this.K2 = i79 + 1;
                        this.J3 = i79;
                    }
                    int i80 = this.K2;
                    this.K2 = i80 + 1;
                    this.K3 = i80;
                }
                int i81 = this.K2;
                if (i81 > 0) {
                    this.K2 = i81 + 1;
                    this.O3 = i81;
                }
                TLRPC.Chat chat2 = this.B2;
                if (chat2 != null && chat2.linked_community_id != 0) {
                    int i82 = this.K2;
                    this.i4 = i82;
                    this.K2 = i82 + 2;
                    this.j4 = i82 + 1;
                }
                if (ChatObject.isChannel(chat2)) {
                    TLRPC.Chat chat3 = this.B2;
                    if (!chat3.megagroup) {
                        TLRPC.ChatFull chatFull9 = this.r2;
                        if (chatFull9 != null && (chat3.creator || chatFull9.can_view_participants)) {
                            if (this.X == null) {
                                int i83 = this.K2;
                                this.K2 = i83 + 1;
                                this.q4 = i83;
                            }
                            int i84 = this.K2;
                            int i85 = i84 + 1;
                            this.K2 = i85;
                            this.u4 = i84;
                            if (chatFull9.requests_pending > 0) {
                                this.K2 = i84 + 2;
                                this.v4 = i85;
                            }
                            int i86 = this.K2;
                            int i87 = i86 + 1;
                            this.K2 = i87;
                            this.w4 = i86;
                            if (chatFull9.banned_count != 0 || chatFull9.kicked_count != 0) {
                                this.K2 = i86 + 2;
                                this.D4 = i87;
                            }
                            if ((chatFull9.can_view_stars_revenue && (lh.b0.g(this.currentAccount).c(-this.c1).amount > 0 || !lh.b0.g(this.currentAccount).k(-this.c1).a[0].isEmpty())) || ((chatFull4 = this.r2) != null && chatFull4.can_view_revenue && lh.b0.g(this.currentAccount).i(-this.c1) > 0)) {
                                int i88 = this.K2;
                                this.K2 = i88 + 1;
                                this.A4 = i88;
                            }
                            int i89 = this.K2;
                            this.x4 = i89;
                            this.K2 = i89 + 2;
                            this.B4 = i89 + 1;
                        }
                        if (ChatObject.isChannel(this.B2)) {
                            TLRPC.ChatFull chatFull10 = this.r2;
                            if (chatFull10 != null) {
                                if (this.n1 || (chatParticipants = chatFull10.participants) == null || chatParticipants.participants == null || (chatParticipants instanceof TLRPC.TL_chatParticipantsForbidden)) {
                                    if (!ChatObject.isNotInChat(this.B2) && ChatObject.canAddUsers(this.B2) && this.r2.participants_hidden) {
                                        int i90 = this.K2;
                                        this.t4 = i90;
                                        this.K2 = i90 + 2;
                                        this.E4 = i90 + 1;
                                    }
                                    sz0 sz0Var = this.L;
                                    if (sz0Var != null) {
                                        sz0Var.n1();
                                    }
                                } else {
                                    if (ChatObject.canAddUsers(this.B2) || (tL_chatBannedRights = this.B2.default_banned_rights) == null || !tL_chatBannedRights.invite_users) {
                                        int i91 = this.K2;
                                        this.K2 = i91 + 1;
                                        this.t4 = i91;
                                    }
                                    if (this.r2.participants.participants.size() <= 5 || !z4) {
                                        if (this.t4 == -1 && this.X == null) {
                                            int i92 = this.K2;
                                            this.K2 = i92 + 1;
                                            this.q4 = i92;
                                        }
                                        int i93 = this.K2;
                                        this.r4 = i93;
                                        int size = this.r2.participants.participants.size() + i93;
                                        this.s4 = size;
                                        this.K2 = size + 1;
                                        this.E4 = size;
                                        arrayList2.addAll(this.r2.participants.participants);
                                        ArrayList arrayList4 = this.z2;
                                        if (arrayList4 != null) {
                                            arrayList3.addAll(arrayList4);
                                        }
                                        sz0 sz0Var2 = this.L;
                                        if (sz0Var2 != null) {
                                            sz0Var2.a1(null, null);
                                        }
                                    } else {
                                        if (this.t4 != -1) {
                                            int i94 = this.K2;
                                            this.K2 = i94 + 1;
                                            this.E4 = i94;
                                        }
                                        sz0 sz0Var3 = this.L;
                                        if (sz0Var3 != null) {
                                            sz0Var3.a1(this.z2, this.r2);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (this.n1 || (chatFull3 = this.r2) == null || !this.B2.megagroup || (chatParticipants2 = chatFull3.participants) == null || (arrayList = chatParticipants2.participants) == null || arrayList.isEmpty()) {
                                if (!ChatObject.isNotInChat(this.B2) && ChatObject.canAddUsers(this.B2) && (chatFull2 = this.r2) != null && chatFull2.participants_hidden) {
                                    int i95 = this.K2;
                                    this.t4 = i95;
                                    this.K2 = i95 + 2;
                                    this.E4 = i95 + 1;
                                }
                                sz0 sz0Var4 = this.L;
                                if (sz0Var4 != null) {
                                    sz0Var4.n1();
                                }
                            } else {
                                if (!ChatObject.isNotInChat(this.B2) && ChatObject.canAddUsers(this.B2) && this.r2.participants_count < getMessagesController().maxMegagroupCount) {
                                    int i96 = this.K2;
                                    this.K2 = i96 + 1;
                                    this.t4 = i96;
                                }
                                int size2 = this.r2.participants.participants.size();
                                if ((size2 <= 5 || !z4 || this.P4 == 1) && this.P4 != 2) {
                                    if (this.t4 == -1 && this.X == null) {
                                        int i97 = this.K2;
                                        this.K2 = i97 + 1;
                                        this.q4 = i97;
                                    }
                                    int i98 = this.K2;
                                    this.r4 = i98;
                                    int i99 = i98 + size2;
                                    this.s4 = i99;
                                    this.K2 = i99 + 1;
                                    this.E4 = i99;
                                    arrayList2.addAll(this.r2.participants.participants);
                                    ArrayList arrayList5 = this.z2;
                                    if (arrayList5 != null) {
                                        arrayList3.addAll(arrayList5);
                                    }
                                    this.P4 = 1;
                                    sz0 sz0Var5 = this.L;
                                    if (sz0Var5 != null) {
                                        sz0Var5.a1(null, null);
                                    }
                                } else {
                                    if (this.t4 != -1) {
                                        int i100 = this.K2;
                                        this.K2 = i100 + 1;
                                        this.E4 = i100;
                                    }
                                    if (this.L != null) {
                                        if (!this.z2.isEmpty()) {
                                            this.P4 = 2;
                                        }
                                        this.L.a1(this.z2, this.r2);
                                    }
                                }
                            }
                            if (this.J4 == -1) {
                                TLRPC.Chat chat4 = this.B2;
                                if (chat4.left && !chat4.kicked) {
                                    long j12 = MessagesController.getNotificationsSettings(this.currentAccount).getLong("dialog_join_requested_time_" + this.f1, -1L);
                                    if (j12 <= 0 || System.currentTimeMillis() - j12 >= 120000) {
                                        org.telegram.ui.Components.jh0 jh0Var2 = this.X;
                                        if (jh0Var2 == null || !jh0Var2.f()) {
                                            int i101 = this.K2;
                                            this.I4 = i101;
                                            this.K2 = i101 + 2;
                                            this.J4 = i101 + 1;
                                        }
                                        if (z4) {
                                            int i102 = this.K2;
                                            this.K2 = i102 + 1;
                                            this.G4 = i102;
                                        }
                                        if (this.G4 == -1) {
                                            int i103 = this.K2;
                                            this.K2 = i103 + 1;
                                            this.z3 = i103;
                                        }
                                        if (this.actionBar != null) {
                                            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                                        } else {
                                            i10 = 0;
                                        }
                                        if (this.a != null && i12 <= this.K2) {
                                            i11 = this.B0;
                                            if (i11 != 0) {
                                            }
                                            my0Var = this.a;
                                            if (my0Var != null) {
                                                my0Var.setTranslateSelectorPosition(this.L3);
                                            }
                                            jh0Var = this.X;
                                            if (jh0Var != null) {
                                                jh0Var.o(7, z12);
                                            }
                                            ci0Var = this.Z;
                                            if (ci0Var != null) {
                                                TLRPC.UserFull userFull14 = this.s2;
                                                if (userFull14 != null) {
                                                    ci0Var.setMusicDocument(userFull14.saved_music);
                                                }
                                                this.Z.setVisibility(this.F4 ? 0 : 8);
                                                return;
                                            }
                                            return;
                                        }
                                        this.z0 = 0;
                                        my0Var = this.a;
                                        if (my0Var != null) {
                                        }
                                        jh0Var = this.X;
                                        if (jh0Var != null) {
                                        }
                                        ci0Var = this.Z;
                                        if (ci0Var != null) {
                                        }
                                    }
                                }
                            }
                        }
                        z12 = false;
                        if (z4) {
                        }
                        if (this.G4 == -1) {
                        }
                        if (this.actionBar != null) {
                        }
                        if (this.a != null) {
                            i11 = this.B0;
                            if (i11 != 0) {
                            }
                            my0Var = this.a;
                            if (my0Var != null) {
                            }
                            jh0Var = this.X;
                            if (jh0Var != null) {
                            }
                            ci0Var = this.Z;
                            if (ci0Var != null) {
                            }
                        }
                        this.z0 = 0;
                        my0Var = this.a;
                        if (my0Var != null) {
                        }
                        jh0Var = this.X;
                        if (jh0Var != null) {
                        }
                        ci0Var = this.Z;
                        if (ci0Var != null) {
                        }
                    }
                }
                TLRPC.ChatFull chatFull11 = this.r2;
                if ((chatFull11 != null && chatFull11.can_view_stars_revenue && (lh.b0.g(this.currentAccount).c(-this.c1).amount > 0 || !lh.b0.g(this.currentAccount).k(-this.c1).a[0].isEmpty())) || ((chatFull = this.r2) != null && chatFull.can_view_revenue && lh.b0.g(this.currentAccount).i(-this.c1) > 0)) {
                    int i104 = this.K2;
                    this.A4 = i104;
                    this.K2 = i104 + 2;
                    this.B4 = i104 + 1;
                }
                if (ChatObject.isChannel(this.B2)) {
                }
                z12 = false;
                if (z4) {
                }
                if (this.G4 == -1) {
                }
                if (this.actionBar != null) {
                }
                if (this.a != null) {
                }
                this.z0 = 0;
                my0Var = this.a;
                if (my0Var != null) {
                }
                jh0Var = this.X;
                if (jh0Var != null) {
                }
                ci0Var = this.Z;
                if (ci0Var != null) {
                }
            }
            z12 = false;
            if (this.G4 == -1) {
            }
            if (this.actionBar != null) {
            }
            if (this.a != null) {
            }
            this.z0 = 0;
            my0Var = this.a;
            if (my0Var != null) {
            }
            jh0Var = this.X;
            if (jh0Var != null) {
            }
            ci0Var = this.Z;
            if (ci0Var != null) {
            }
        }
        z4 = false;
        if (!z4) {
            z4 = userFull6.stories_pinned_available;
        }
        if (!z4) {
            z4 = botInfo.has_preview_medias;
        }
        if (!z4) {
            z4 = true;
        }
        if (!z4) {
            z4 = chatFull5.stories_pinned_available;
        }
        if (!z4) {
        }
        if (this.b1 == 0) {
        }
        z12 = false;
        if (this.G4 == -1) {
        }
        if (this.actionBar != null) {
        }
        if (this.a != null) {
        }
        this.z0 = 0;
        my0Var = this.a;
        if (my0Var != null) {
        }
        jh0Var = this.X;
        if (jh0Var != null) {
        }
        ci0Var = this.Z;
        if (ci0Var != null) {
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
    public final void k4(boolean z4) {
        ValueAnimator valueAnimator;
        org.telegram.ui.Components.p9 currentItemView;
        boolean z10;
        float f10;
        NotchInfoUtils.NotchInfo notchInfo;
        boolean z11;
        float f11;
        int i10;
        ValueAnimator valueAnimator2;
        NotchInfoUtils.NotchInfo notchInfo2;
        TLRPC.ChatFull chatFull;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        float y32 = y3();
        my0 my0Var = this.a;
        if (my0Var != null && !this.D1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) my0Var.getLayoutParams();
            if (layoutParams.topMargin != currentActionBarHeight) {
                layoutParams.topMargin = currentActionBarHeight;
                this.a.setLayoutParams(layoutParams);
            }
        }
        n5(z4);
        if (this.V != null) {
            this.a.setTopGlowOffset((int) this.N1);
            this.a.setOverScrollMode((this.N1 <= ((float) T3()) || this.N1 >= ((float) ((O3() + this.a.getMeasuredWidth()) - currentActionBarHeight))) ? 0 : 2);
        }
        if (this.V != null && !this.J5 && this.D1) {
            x3();
            return;
        }
        int T3 = T3();
        if (this.V != null) {
            if (this.X != null && this.c1 != 0) {
                this.X.o(2, (!ChatObject.isChannel(this.B2) || this.B2.megagroup || (chatFull = this.r2) == null || chatFull.linked_chat_id == 0) ? false : true);
            }
            n5(z4);
            float translationY = this.actionBar.getTranslationY() + ((((y32 + 1.0f) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f)) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f));
            if (this.D1) {
                this.X1 = translationY;
            } else {
                float f12 = -AndroidUtilities.dp(29.0f);
                org.telegram.ui.Components.zh0 zh0Var = this.q0;
                if (zh0Var != null && (notchInfo2 = zh0Var.n) != null && notchInfo2.isLikelyCircle) {
                    f12 = notchInfo2.bounds.centerY();
                }
                this.X1 = AndroidUtilities.lerp(f12, this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f)), y32);
            }
            float f13 = this.D1 ? this.O1 : this.N1;
            float f14 = T3;
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.r;
            org.telegram.ui.ActionBar.k5[] k5VarArr2 = this.f;
            if (f13 > f14 || this.m2) {
                float max = Math.max(0.0f, Math.min(1.0f, (f13 - f14) / ((this.a.getMeasuredWidth() - currentActionBarHeight) - U3())));
                this.e2 = max;
                this.Y1 = (AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, max * 3.0f)) / 100.0f) * 42.0f;
                this.Z1 = 0.0f;
                zy0 zy0Var = this.r0;
                if (zy0Var != null) {
                    zy0Var.invalidate();
                }
                lh.u0 u0Var = this.s0;
                if (u0Var != null) {
                    u0Var.invalidate();
                }
                float min = Math.min(AndroidUtilities.dpf2(2000.0f), Math.max(AndroidUtilities.dpf2(1100.0f), Math.abs(this.f2))) / AndroidUtilities.dpf2(1100.0f);
                O3();
                boolean z12 = this.l2;
                float[] fArr = this.j2;
                if (!z12 || (!this.C0 && this.e2 < 0.33f)) {
                    if (this.m2) {
                        this.m2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                        org.telegram.ui.ActionBar.w0 w0Var = this.Q0;
                        if (w0Var != null) {
                            w0Var.r(21);
                            if (this.n0 != null) {
                                this.Q0.r(33);
                                this.Q0.r(34);
                                this.Q0.r(35);
                                this.Q0.K(36);
                                this.Q0.K(31);
                            }
                        }
                        org.telegram.ui.ActionBar.w0 w0Var2 = this.R0;
                        if (w0Var2 != null) {
                            w0Var2.setEnabled(!this.w1);
                        }
                        this.K.f(min, false);
                        this.l0.b(min);
                        this.g2.cancel();
                        this.b0.getImageReceiver().setAllowStartAnimation(true);
                        this.b0.getImageReceiver().startAnimation();
                        float lerp = AndroidUtilities.lerp(fArr, this.i2);
                        fArr[0] = lerp;
                        fArr[1] = 0.0f;
                        this.g2.setInterpolator(org.telegram.ui.Components.nr.j);
                        if (this.k2) {
                            this.g2.setDuration(0L);
                        } else {
                            this.g2.setDuration((long) ((lerp * 250.0f) / min));
                        }
                        this.a1.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, this.w0));
                        if (!this.E0 && (currentItemView = this.k0.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().getDrawable() instanceof org.telegram.ui.Components.s61) {
                                this.b0.U = false;
                            } else {
                                wy0 wy0Var = this.b0;
                                wy0Var.U = true;
                                wy0Var.setForegroundImageDrawable(currentItemView.getImageReceiver().getDrawableSafe());
                            }
                        }
                        this.g2.addListener(new jz0(this, 3));
                        this.b0.setForegroundAlpha(1.0f);
                        this.V.setVisibility(0);
                        this.k0.setAlpha(0.0f);
                        this.g2.start();
                        this.M1 = false;
                        try {
                            this.V.performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                            this.V.setScaleX(this.Y1);
                            this.V.setScaleY(this.Y1);
                            N3();
                            valueAnimator = this.g2;
                            if (valueAnimator != null) {
                            }
                            D4();
                            k5VarArr2[1].setTranslationY(this.b2);
                            k5VarArr[1].setTranslationX(W3(this.c2));
                            k5VarArr[1].setTranslationY(X3(this.d2));
                            this.s.setTranslationX(this.c2);
                            this.s.setTranslationY(this.d2);
                            V4();
                            z10 = this.D1;
                            if (!z10) {
                            }
                            if (f13 <= f14) {
                            }
                            z11 = false;
                            if (!z11) {
                            }
                            b5(currentActionBarHeight);
                            if (y32 < 1.0f) {
                            }
                        }
                    }
                    this.V.setScaleX(this.Y1);
                    this.V.setScaleY(this.Y1);
                    N3();
                    valueAnimator = this.g2;
                    if (valueAnimator != null || !valueAnimator.isRunning()) {
                        D4();
                        k5VarArr2[1].setTranslationY(this.b2);
                        k5VarArr[1].setTranslationX(W3(this.c2));
                        k5VarArr[1].setTranslationY(X3(this.d2));
                        this.s.setTranslationX(this.c2);
                        this.s.setTranslationY(this.d2);
                        V4();
                    }
                    z10 = this.D1;
                    if (!z10 && this.G1 == 2) {
                        float f15 = this.L5;
                        float translationY2 = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f));
                        k5VarArr2[0].setTranslationX((this.L5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f));
                        double d = translationY2;
                        k5VarArr2[0].setTranslationY(((float) Math.floor(d)) + AndroidUtilities.dp(1.3f));
                        k5VarArr[0].setTranslationX((this.L5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f));
                        k5VarArr[0].setTranslationY(((float) Math.floor(d)) + AndroidUtilities.dp(24.0f));
                        k5VarArr2[0].setScaleX(1.0f);
                        k5VarArr2[0].setScaleY(1.0f);
                        k5VarArr2[1].setPivotY(r4.getMeasuredHeight());
                        k5VarArr2[1].setScaleX(1.38f);
                        k5VarArr2[1].setScaleY(1.38f);
                        this.Y1 = AndroidUtilities.lerp(42, 138, this.P1) / 100.0f;
                        this.Z1 = 0.0f;
                        zy0 zy0Var2 = this.r0;
                        if (zy0Var2 != null) {
                            zy0Var2.setExpandProgress(1.0f);
                        }
                        lh.u0 u0Var2 = this.s0;
                        if (u0Var2 != null) {
                            u0Var2.setExpandProgress(1.0f);
                        }
                        this.b0.setRoundRadiusForExpand((int) AndroidUtilities.lerp(c4(), 0.0f, this.P1));
                        this.V.setTranslationX(AndroidUtilities.lerp(f15, 0.0f, this.P1));
                        this.V.setTranslationY(AndroidUtilities.lerp((float) Math.ceil(d), 0.0f, this.P1));
                        float measuredWidth = ((this.Y1 * 100.0f) / 42.0f) * (this.V.getMeasuredWidth() - AndroidUtilities.dp(42.0f));
                        this.e0.setTranslationX(this.V.getX() + AndroidUtilities.dp(16.0f) + measuredWidth);
                        this.e0.setTranslationY(this.V.getY() + AndroidUtilities.dp(-10.0f) + measuredWidth);
                        this.f0.setTranslationX(this.V.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                        this.f0.setTranslationY(this.V.getY() + AndroidUtilities.dp(26.5f) + measuredWidth);
                        this.g0.setTranslationX(this.V.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                        this.g0.setTranslationY(this.V.getY() + AndroidUtilities.dp(24.0f) + measuredWidth);
                        this.h0.setTranslationX(this.V.getX() + AndroidUtilities.dp(28.0f) + measuredWidth);
                        this.h0.setTranslationY(this.V.getY() + AndroidUtilities.dp(24.0f) + measuredWidth);
                        this.V.setScaleX(this.Y1);
                        this.V.setScaleY(this.Y1);
                        this.k0.setAlpha(0.0f);
                        this.k0.setVisibility(0);
                        wy0 wy0Var2 = this.b0;
                        float f16 = this.P1;
                        float f17 = this.Y1;
                        wy0Var2.E = f16;
                        wy0Var2.F = f17;
                        wy0Var2.D = true;
                        this.K.e(f16, false);
                        this.actionBar.C(i0.a.d(this.P1, this.N5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, this.w0), -1), false);
                        org.telegram.ui.Components.fm0 fm0Var = this.I;
                        if (fm0Var != null) {
                            fm0Var.b(i0.a.d(this.P1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h8, this.w0), Color.argb(179, 255, 255, 255)));
                        }
                        Drawable drawable = this.x;
                        if (drawable != null) {
                            drawable.setColorFilter(this.N5 == null ? i0.a.d(this.P1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pc, this.w0), -1) : -1, PorterDuff.Mode.MULTIPLY);
                        }
                        org.telegram.ui.Components.mr mrVar = this.G[1];
                        if (mrVar != null) {
                            mrVar.b(this.P1);
                            k5VarArr2[1].invalidate();
                        }
                        org.telegram.ui.Components.mr mrVar2 = this.H[1];
                        if (mrVar2 != null) {
                            mrVar2.b(this.P1);
                            k5VarArr2[1].invalidate();
                        }
                        Y4(this.P1);
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.V.getLayoutParams();
                        layoutParams2.width = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), this.a.getMeasuredWidth() / this.Y1, this.P1);
                        layoutParams2.height = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(100.0f), (this.N1 + currentActionBarHeight) / this.Y1, this.P1);
                        this.V.requestLayout();
                        V4();
                    } else if (f13 <= f14) {
                        if (z10) {
                            this.Y1 = AndroidUtilities.lerp(42, 96, y32) / 100.0f;
                            this.Z1 = 0.0f;
                            f10 = 1.0f;
                        } else {
                            org.telegram.ui.Components.zh0 zh0Var2 = this.q0;
                            this.Y1 = AndroidUtilities.lerp((zh0Var2 == null || (notchInfo = zh0Var2.n) == null || !notchInfo.isLikelyCircle) ? 24.0f : (notchInfo.bounds.width() * 0.5f) / AndroidUtilities.density, 96.0f, y32) / 100.0f;
                            f10 = 1.0f;
                            this.Z1 = 1.0f - y32;
                        }
                        org.telegram.ui.Components.jh0 jh0Var = this.X;
                        if (jh0Var != null) {
                            if (this.D1) {
                                jh0Var.setAlpha(this.P1);
                            } else {
                                jh0Var.setAlpha(f10);
                            }
                        }
                        zy0 zy0Var3 = this.r0;
                        if (zy0Var3 != null) {
                            zy0Var3.invalidate();
                        }
                        lh.u0 u0Var3 = this.s0;
                        if (u0Var3 != null) {
                            u0Var3.h = this.D1;
                            float clamp01 = Utilities.clamp01((y32 - 0.3f) / 0.7f);
                            if (u0Var3.f != clamp01) {
                                u0Var3.f = clamp01;
                                u0Var3.invalidate();
                            }
                        }
                        float f18 = (0.12f * y32) + 1.0f;
                        ValueAnimator valueAnimator3 = this.g2;
                        if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                            this.V.setScaleX(this.Y1);
                            this.V.setScaleY(this.Y1);
                            N3();
                            this.V.setTranslationY((float) Math.ceil(this.X1));
                            float dp = (((this.Y1 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
                            this.e0.setTranslationX(this.V.getX() + AndroidUtilities.dp(16.0f) + dp);
                            this.e0.setTranslationY(this.V.getY() + AndroidUtilities.dp(-10.0f) + dp);
                            this.f0.setTranslationX(this.V.getX() + AndroidUtilities.dp(28.0f) + dp);
                            this.f0.setTranslationY(this.V.getY() + AndroidUtilities.dp(26.5f) + dp);
                            this.g0.setTranslationX(this.V.getX() + AndroidUtilities.dp(28.0f) + dp);
                            this.g0.setTranslationY(this.V.getY() + AndroidUtilities.dp(24.0f) + dp);
                            this.h0.setTranslationX(this.V.getX() + AndroidUtilities.dp(28.0f) + dp);
                            this.h0.setTranslationY(this.V.getY() + AndroidUtilities.dp(24.0f) + dp);
                        } else {
                            ValueAnimator valueAnimator4 = this.g2;
                            jz0 jz0Var = this.F5;
                            valueAnimator4.removeListener(jz0Var);
                            this.g2.addListener(jz0Var);
                        }
                        float dpf2 = ((AndroidUtilities.dpf2(8.0f) + (this.V.getScaleY() * this.V.getHeight())) * (this.D1 ? this.P1 : y32)) + ((float) Math.floor(translationY));
                        this.b2 = e2.c.w(1.0f, this.P1, 0.0f, (AndroidUtilities.dp(7.0f) * y32) + AndroidUtilities.dp(1.3f) + dpf2);
                        this.d2 = (((float) Math.floor(AndroidUtilities.density * 11.0f)) * y32) + dpf2 + AndroidUtilities.dp(24.0f);
                        float dp2 = this.D1 ? (this.L5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f) : -AndroidUtilities.dpf2(46.0f);
                        s01 s01Var = this.Y5;
                        if (s01Var != null) {
                            s01Var.setAlpha((int) (255.0f * y32));
                        }
                        int measuredWidth2 = this.a.getMeasuredWidth();
                        int i11 = 0;
                        boolean z13 = false;
                        while (i11 < k5VarArr2.length) {
                            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr2[i11];
                            if (k5Var == null) {
                                f11 = f18;
                            } else {
                                k5Var.setScaleX(f18);
                                k5VarArr2[i11].setScaleY(f18);
                                if (i11 == 1) {
                                    l4(0, y32, false);
                                    z13 = true;
                                }
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) k5VarArr2[i11].getLayoutParams();
                                float f19 = measuredWidth2;
                                float f20 = f19 / 2.0f;
                                float min2 = f20 - (((Math.min(k5VarArr2[i11].getExactWidth(), i11 == 1 ? layoutParams3.width : f19) * f18) * 0.5f) + layoutParams3.leftMargin);
                                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) k5VarArr[i11].getLayoutParams();
                                float f21 = layoutParams4.leftMargin;
                                float exactWidth = k5VarArr[this.m5 ? 3 : i11].getExactWidth();
                                f11 = f18;
                                if (i11 == 1) {
                                    f19 = layoutParams4.width;
                                }
                                float min3 = f20 - ((Math.min(exactWidth, f19) * 0.5f) + f21);
                                if (i11 == 1) {
                                    this.a2 = min2;
                                    this.c2 = min3;
                                }
                                float lerp2 = AndroidUtilities.lerp(dp2, min2, y32);
                                float lerp3 = AndroidUtilities.lerp(dp2, min3, y32);
                                ValueAnimator valueAnimator5 = this.g2;
                                if (valueAnimator5 == null || !valueAnimator5.isRunning()) {
                                    k5VarArr2[i11].setTranslationX(lerp2);
                                    k5VarArr2[i11].setTranslationY(this.b2);
                                    k5VarArr[i11].setTranslationX(W3(lerp3));
                                    k5VarArr[i11].setTranslationY(X3(this.d2));
                                    i10 = 1;
                                    if (i11 == 1) {
                                        this.s.setTranslationX(lerp3);
                                    }
                                } else {
                                    i10 = 1;
                                }
                                if (i11 == i10) {
                                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) k5VarArr2[i10].getLayoutParams();
                                    int i12 = layoutParams5.width;
                                    int min4 = Math.min(layoutParams5.width, (int) ((((AndroidUtilities.isTablet() ? AndroidUtilities.dp(490.0f) : AndroidUtilities.displaySize.x) - AndroidUtilities.dp(18.0f)) / k5VarArr2[1].getScaleX()) - (k5VarArr2[1].getTranslationX() + layoutParams5.leftMargin)));
                                    layoutParams5.width = min4;
                                    if (min4 != i12) {
                                        k5VarArr2[1].requestLayout();
                                    }
                                }
                            }
                            i11++;
                            f18 = f11;
                        }
                        this.s.setTranslationY(this.d2);
                        V4();
                        z11 = z13;
                        if (!z11 && ((valueAnimator2 = this.g2) == null || !valueAnimator2.isRunning())) {
                            l4(0, y32, true);
                        }
                    }
                    z11 = false;
                    if (!z11) {
                        l4(0, y32, true);
                    }
                } else {
                    if (!this.m2) {
                        if (this.Q0 != null) {
                            if (g4()) {
                                this.Q0.r(21);
                            } else {
                                this.Q0.K(21);
                            }
                            if (this.n0 != null) {
                                this.Q0.K(36);
                                this.Q0.K(34);
                                this.Q0.K(35);
                                this.Q0.r(33);
                                this.Q0.r(31);
                            }
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = this.R0;
                        if (w0Var3 != null) {
                            w0Var3.setEnabled(false);
                        }
                        this.m2 = true;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                        this.K.f(min, true);
                        this.l0.b(min);
                        this.k0.setCreateThumbFromParent(true);
                        this.k0.getAdapter().g();
                        this.g2.cancel();
                        float lerp4 = AndroidUtilities.lerp(fArr, this.i2);
                        fArr[0] = lerp4;
                        fArr[1] = 1.0f;
                        zy0 zy0Var4 = this.r0;
                        if (zy0Var4 == null || zy0Var4.w.isEmpty()) {
                            this.g2.setInterpolator(org.telegram.ui.Components.nr.j);
                            this.g2.setDuration((long) (((1.0f - lerp4) * 250.0f) / min));
                        } else {
                            this.g2.setInterpolator(new u1.a());
                            this.g2.setDuration((long) ((((1.0f - lerp4) * 1.3f) * 250.0f) / min));
                        }
                        this.g2.addListener(new jz0(this, 2));
                        View m9 = this.c.m(0);
                        if (!this.M1 && m9 != null) {
                            this.L1 = true;
                            this.a.w0(((m9.getTop() - this.a.getMeasuredWidth()) - O3()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0), (int) this.g2.getDuration(), (Interpolator) this.g2.getInterpolator());
                            this.a.K0 = false;
                        }
                        this.H5 = k5VarArr2[1].getTranslationY();
                        this.I5 = k5VarArr[1].getTranslationY();
                        this.g2.start();
                        this.k0.setAlpha(0.0f);
                        this.k0.setVisibility(0);
                        try {
                            this.V.performHapticFeedback(0, 1);
                        } catch (Exception unused2) {
                        }
                    }
                    ViewGroup.LayoutParams layoutParams6 = this.k0.getLayoutParams();
                    int i13 = layoutParams6.height;
                    layoutParams6.width = this.a.getMeasuredWidth();
                    float f22 = currentActionBarHeight + f13;
                    int i14 = (int) f22;
                    layoutParams6.height = i14;
                    if (i13 != i14) {
                        this.k0.requestLayout();
                    }
                    if (!this.g2.isRunning()) {
                        float dp3 = (this.D1 && this.G1 == 2) ? (-(1.0f - this.P1)) * AndroidUtilities.dp(50.0f) : 0.0f;
                        k5VarArr2[1].setTranslationX(AndroidUtilities.dpf2(18.0f) - k5VarArr2[1].getLeft());
                        k5VarArr2[1].setTranslationY((((f22 - O3()) - AndroidUtilities.dpf2(30.0f)) - k5VarArr2[1].getBottom()) + dp3);
                        k5VarArr[1].setTranslationX(W3(AndroidUtilities.dpf2(16.0f) - k5VarArr[1].getLeft()));
                        k5VarArr[1].setTranslationY(X3((((f22 - O3()) - AndroidUtilities.dpf2(10.0f)) - k5VarArr[1].getBottom()) + dp3));
                        this.s.setTranslationX(k5VarArr[1].getTranslationX());
                        this.s.setTranslationY(k5VarArr[1].getTranslationY());
                        V4();
                    }
                }
            }
            z10 = this.D1;
            if (!z10) {
            }
            if (f13 <= f14) {
            }
            z11 = false;
            if (!z11) {
            }
        }
        b5(currentActionBarHeight);
        if (y32 < 1.0f) {
            this.b0.setAlpha(1.0f);
        }
    }

    public final void k5() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.g0 == null || (imageView = this.h0) == null) {
            return;
        }
        if (!this.I1 || (chat = this.B2) == null || (chat.flags2 & 2048) == 0) {
            imageView.setTag(null);
            this.h0.setVisibility(8);
            this.g0.setTag(null);
            this.g0.setVisibility(8);
            return;
        }
        imageView.setTag(1);
        this.h0.setVisibility(0);
        this.g0.setTag(1);
        this.g0.setVisibility(0);
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
    public final void l4(int i10, float f10, boolean z4) {
        float scaleX;
        float f11;
        FrameLayout.LayoutParams layoutParams;
        int i11;
        ValueAnimator valueAnimator;
        float f12 = this.N1;
        float T3 = T3();
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f;
        if (f12 > T3 || ((valueAnimator = this.g2) != null && valueAnimator.isRunning())) {
            scaleX = k5VarArr[1].getScaleX();
        } else {
            if (f10 < 1.0f) {
                scaleX = 1.0f;
                f11 = 1.12f;
                int dp = !AndroidUtilities.isTablet() ? AndroidUtilities.dp(490.0f) : AndroidUtilities.displaySize.x;
                int i12 = !this.K0 ? 48 : 0;
                if (this.I0) {
                    i12 += 48;
                }
                if (this.J0) {
                    i12 += 48;
                }
                if (this.R0 != null) {
                    i12 += 48;
                }
                int dp2 = dp - AndroidUtilities.dp((((1.0f - this.B5) * i12) + 40.0f) + ((!this.D1 ? 109 : 47) + 8));
                int i13 = (int) (dp2 / (i10 == 0 ? scaleX : 1.0f));
                int z10 = i10 == 0 ? i10 : b.z(18.0f, 2, dp);
                if (i10 == 0) {
                    i10 = (int) (z10 / f11);
                }
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.i;
                int lerp = AndroidUtilities.lerp(i13, i10, nrVar.getInterpolation(f10));
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) k5VarArr[1].getLayoutParams();
                int i14 = layoutParams2.width;
                layoutParams2.width = (int) Math.ceil(lerp);
                if (z4) {
                    layoutParams2.width = Math.min(layoutParams2.width, (int) (((dp - AndroidUtilities.dp(18.0f)) / k5VarArr[1].getScaleX()) - (k5VarArr[1].getTranslationX() + layoutParams2.leftMargin)));
                }
                if (z4 && layoutParams2.width != i14) {
                    k5VarArr[1].requestLayout();
                }
                int lerp2 = AndroidUtilities.lerp(dp2, z10, nrVar.getInterpolation(f10));
                org.telegram.ui.ActionBar.k5[] k5VarArr2 = this.r;
                layoutParams = (FrameLayout.LayoutParams) k5VarArr2[1].getLayoutParams();
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
                i11 = layoutParams.width;
                int ceil = (int) Math.ceil(lerp2);
                layoutParams.width = ceil;
                layoutParams3.width = ceil;
                if (i11 == layoutParams.width) {
                    k5VarArr2[2].getLayoutParams().width = layoutParams.width;
                    k5VarArr2[2].requestLayout();
                    k5VarArr2[3].getLayoutParams().width = layoutParams.width;
                    k5VarArr2[3].requestLayout();
                    k5VarArr2[1].requestLayout();
                    this.s.requestLayout();
                    return;
                }
                return;
            }
            scaleX = Math.max(k5VarArr[1].getScaleX(), 1.12f);
        }
        f11 = scaleX;
        if (!AndroidUtilities.isTablet()) {
        }
        if (!this.K0) {
        }
        if (this.I0) {
        }
        if (this.J0) {
        }
        if (this.R0 != null) {
        }
        int dp22 = dp - AndroidUtilities.dp((((1.0f - this.B5) * i12) + 40.0f) + ((!this.D1 ? 109 : 47) + 8));
        int i132 = (int) (dp22 / (i10 == 0 ? scaleX : 1.0f));
        if (i10 == 0) {
        }
        if (i10 == 0) {
        }
        org.telegram.ui.Components.nr nrVar2 = org.telegram.ui.Components.nr.i;
        int lerp3 = AndroidUtilities.lerp(i132, i10, nrVar2.getInterpolation(f10));
        FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) k5VarArr[1].getLayoutParams();
        int i142 = layoutParams22.width;
        layoutParams22.width = (int) Math.ceil(lerp3);
        if (z4) {
        }
        if (z4) {
            k5VarArr[1].requestLayout();
        }
        int lerp22 = AndroidUtilities.lerp(dp22, z10, nrVar2.getInterpolation(f10));
        org.telegram.ui.ActionBar.k5[] k5VarArr22 = this.r;
        layoutParams = (FrameLayout.LayoutParams) k5VarArr22[1].getLayoutParams();
        FrameLayout.LayoutParams layoutParams32 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        i11 = layoutParams.width;
        int ceil2 = (int) Math.ceil(lerp22);
        layoutParams.width = ceil2;
        layoutParams32.width = ceil2;
        if (i11 == layoutParams.width) {
        }
    }

    public final void l5(boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        if ((this.r0 == null && this.s0 == null) || (kVar = this.actionBar) == null) {
            return;
        }
        float f10 = kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0.0f;
        float width = this.actionBar.getWidth();
        float max = this.actionBar.getBackButton() != null ? Math.max(0.0f, this.actionBar.getBackButton().getRight()) : 0.0f;
        if (this.actionBar.B != null) {
            for (int i10 = 0; i10 < this.actionBar.B.getChildCount(); i10++) {
                View childAt = this.actionBar.B.getChildAt(i10);
                if (childAt.getAlpha() > 0.0f && childAt.getVisibility() == 0) {
                    float left = this.actionBar.B.getLeft() + ((int) childAt.getX());
                    if (left < width) {
                        width = AndroidUtilities.lerp(width, left, childAt.getAlpha());
                    }
                }
            }
        }
        zy0 zy0Var = this.r0;
        if (zy0Var != null) {
            float x10 = e2.c.x(this.actionBar.getHeight(), f10, 2.0f, f10);
            boolean z10 = Math.abs(max - zy0Var.c0) > 0.1f || Math.abs(width - zy0Var.d0) > 0.1f || Math.abs(x10 - zy0Var.e0) > 0.1f;
            zy0Var.c0 = max;
            zy0Var.d0 = width;
            if (z4) {
                zy0Var.j0.d(width, true);
            }
            zy0Var.e0 = x10;
            if (z10) {
                zy0Var.invalidate();
            }
        }
        lh.u0 u0Var = this.s0;
        if (u0Var != null) {
            float x11 = e2.c.x(this.actionBar.getHeight(), f10, 2.0f, f10);
            int U3 = U3();
            boolean z11 = Math.abs(max - u0Var.r) > 0.1f || Math.abs(width - u0Var.s) > 0.1f || Math.abs(x11 - u0Var.v) > 0.1f;
            u0Var.r = max;
            u0Var.s = width;
            if (z4) {
                u0Var.y.d(width, true);
            }
            u0Var.v = x11;
            u0Var.x = U3 + x11;
            if (z11) {
                u0Var.invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
    
        if (r0.ttl_period > 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0025, code lost:
    
        if (r4.r2.ttl_period > 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5() {
        boolean z4;
        if (this.V0 == null) {
            return;
        }
        if (this.A2 == null) {
            TLRPC.UserFull userFull = this.s2;
            z4 = true;
            if (userFull != null) {
            }
            if (this.r2 != null) {
                if (ChatObject.canUserDoAdminAction(this.B2, 13)) {
                }
            }
        }
        z4 = false;
        AndroidUtilities.updateViewVisibilityAnimated(this.V0, z4, 0.8f, this.i5);
    }

    public final void n4(boolean z4) {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b1));
        if (user == null) {
            return;
        }
        int i10 = 4;
        int i11 = 0;
        if (this.o2 && !MessagesController.isSupportUser(user)) {
            if (!this.h1 || z4) {
                org.telegram.ui.Components.z4.s(this, false, this.B2, user, this.A2 != null, true, false, true, new qx0(this, user));
                return;
            } else {
                getMessagesController().unblockPeer(this.b1, new ob0(this, i10));
                finishFragment();
                return;
            }
        }
        if (this.h1) {
            getMessagesController().unblockPeer(this.b1);
            if (org.telegram.ui.Components.qc.a(this)) {
                org.telegram.ui.Components.qc.d(this, false).j();
                return;
            }
            return;
        }
        if (this.i1) {
            org.telegram.ui.Components.z4.j0(this, this.b1, user, null, this.A2, false, null, new ta(this, i10), this.w0);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.w0);
        String string = LocaleController.getString(R.string.BlockUser);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new px0(this, i11));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, this.w0));
        }
    }

    public final void n5(boolean z4) {
        boolean z10;
        TLRPC.ChatFull chatFull;
        float y32 = y3();
        int i10 = 1;
        this.E5 = y32 > 0.2f && !this.T1 && (this.n0 == null || this.L2 == -1);
        C3();
        org.telegram.ui.Components.jj0 jj0Var = this.v;
        if (jj0Var == null || jj0Var.getVisibility() == 8) {
            z10 = false;
        } else {
            this.v.setTranslationY((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) + this.N1) + this.Q1) - AndroidUtilities.dp(29.5f));
            z10 = y32 > 0.2f && !this.T1 && !this.p1 && (this.n0 == null || this.L2 == -1);
            if (z10 && this.c1 != 0) {
                z10 = (!ChatObject.isChannel(this.B2) || this.B2.megagroup || (chatFull = this.r2) == null || chatFull.linked_chat_id == 0 || (this.A3 == -1 && this.B3 == -1)) ? false : true;
            }
            if (!this.D1) {
                if (z10 != (this.v.getTag() == null)) {
                    if (z10) {
                        this.v.setTag(null);
                    } else {
                        this.v.setTag(0);
                    }
                    AnimatorSet animatorSet = this.w;
                    if (animatorSet != null) {
                        this.w = null;
                        animatorSet.cancel();
                    }
                    if (z4) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.w = animatorSet2;
                        if (z10) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.jj0, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.jj0, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.jj0, Float>) View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.w.playTogether(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.jj0, Float>) View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.jj0, Float>) View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.jj0, Float>) View.ALPHA, 0.0f));
                        }
                        this.w.setDuration(150L);
                        this.w.addListener(new jz0(this, i10));
                        this.w.start();
                    } else {
                        this.v.setScaleX(z10 ? 1.0f : 0.2f);
                        this.v.setScaleY(z10 ? 1.0f : 0.2f);
                        this.v.setAlpha(z10 ? 1.0f : 0.0f);
                    }
                }
            }
        }
        zy0 zy0Var = this.r0;
        if (zy0Var != null) {
            float measuredWidth = this.W.getMeasuredWidth() - AndroidUtilities.dp(40.0f);
            int i11 = this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            zy0Var.f0 = measuredWidth;
            zy0Var.h0 = z10;
            zy0Var.g0 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i11;
            zy0Var.invalidate();
        }
        lh.u0 u0Var = this.s0;
        if (u0Var != null) {
            u0Var.setExpandCoords(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + this.N1 + this.Q1);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean needDelayOpenAnimation() {
        return this.G1 == 0;
    }

    public final void o4(boolean z4) {
        if (this.b1 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b1));
            if (user != null) {
                TLRPC.UserFull userFull = this.s2;
                org.telegram.ui.Components.voip.f2.n(user, z4, userFull != null && userFull.video_calls_available, getParentActivity(), this.s2, getAccountInstance());
                return;
            }
            return;
        }
        if (this.c1 != 0) {
            if (getMessagesController().getGroupCall(this.c1, false) != null) {
                org.telegram.ui.Components.voip.f2.m(this.B2, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            TLRPC.Chat chat = this.B2;
            AccountInstance accountInstance = getAccountInstance();
            if (getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.y70.t(getParentActivity(), -chat.id, accountInstance, new androidx.car.app.utils.a(chat, this, accountInstance, 28));
        }
    }

    public final void o5() {
        org.telegram.ui.Components.or0 or0Var;
        org.telegram.ui.Components.ns0 ns0Var;
        org.telegram.ui.Components.e90 e90Var;
        int v02;
        this.O5.clear();
        u01 u01Var = this.a1;
        if (u01Var != null) {
            u01Var.a(this.N5, true);
        }
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.r;
        org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[1];
        if (k5Var != null) {
            k5VarArr[1].setTextColor(i0.a.d(this.h2, w3(k5Var.getTag() instanceof Integer ? org.telegram.ui.ActionBar.j6.v0(((Integer) k5VarArr[1].getTag()).intValue(), this.w0) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, this.w0), Boolean.valueOf(this.G0[0])), -1275068417));
        }
        s01 s01Var = this.Y5;
        if (s01Var != null) {
            s01Var.a(i0.a.d(this.h2, org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.b(0.18f, -0.1f, this.Z0)), 603979775));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.C(i0.a.d(this.B5, this.N5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, this.w0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y8, this.w0)), false);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            MessagesController.PeerColor peerColor = this.N5;
            kVar2.B(i0.a.d(this.B5, peerColor != null ? 1090519039 : peerColor != null ? 553648127 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f8, this.w0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z8, this.w0)), false);
        }
        Drawable[] drawableArr = this.y;
        if (drawableArr[1] != null) {
            MessagesController.PeerColor peerColor2 = this.N5;
            if (peerColor2 != null) {
                v02 = org.telegram.ui.ActionBar.j6.b(0.1f, org.telegram.ui.ActionBar.j6.I.q() ? -0.1f : -0.08f, i0.a.d(0.4f, peerColor2.getColor2(), this.N5.hasColor6(org.telegram.ui.ActionBar.j6.I.q()) ? this.N5.getColor5() : this.N5.getColor3()));
            } else {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.w0);
            }
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(v02, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oi, this.w0), this.B5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        Drawable[] drawableArr2 = this.F;
        if (drawableArr2[1] != null) {
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(this.N5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, this.w0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.w0), this.B5, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f[1];
        if (k5Var2 != null) {
            k5Var2.setTextColor(i0.a.d(this.h2, i0.a.d(this.B5, this.N5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vh, this.w0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oi, this.w0)), -1));
        }
        org.telegram.ui.Components.h8 h8Var = this.X0;
        if (h8Var != null && (e90Var = h8Var.e) != null) {
            e90Var.invalidate();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setColorFilter(this.N5 == null ? i0.a.d(this.P1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pc, this.w0), -1) : -1, PorterDuff.Mode.MULTIPLY);
        }
        org.telegram.ui.Components.ci0 ci0Var = this.Z;
        if (ci0Var != null) {
            ci0Var.setColor(this.N5);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.a, (h5.d) new yx0(this, 1));
        sz0 sz0Var = this.L;
        if (sz0Var != null && (ns0Var = sz0Var.F0) != null) {
            ns0Var.e();
        }
        sz0 sz0Var2 = this.L;
        if (sz0Var2 != null && (or0Var = sz0Var2.S) != null) {
            or0Var.m();
        }
        p5();
        X4();
        zy0 zy0Var = this.r0;
        if (zy0Var != null) {
            zy0Var.f(true, true);
        }
        lh.u0 u0Var = this.s0;
        if (u0Var != null) {
            u0Var.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.w40 w40Var = this.n0;
        if (w40Var != null) {
            w40Var.i(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.J;
        if (undoView != null) {
            undoView.e(0, true);
        }
        super.onBecomeFullyHidden();
        this.U5 = false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        p5();
        this.U5 = true;
        F3();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onConfigurationChanged(Configuration configuration) {
        View m9;
        org.telegram.ui.Components.ci0 ci0Var;
        org.telegram.ui.Components.jh0 jh0Var;
        super.onConfigurationChanged(configuration);
        sz0 sz0Var = this.L;
        if (sz0Var != null) {
            sz0Var.onConfigurationChanged(configuration);
        }
        f4();
        if (this.k2 && (jh0Var = this.X) != null) {
            jh0Var.i();
        }
        if (this.k2 && (ci0Var = this.Z) != null) {
            ci0Var.b();
        }
        if (this.k2 && this.m2 && (m9 = this.c.m(0)) != null) {
            this.a.scrollBy(0, m9.getTop() - T3());
        }
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new ai(this, 5));
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
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet onCustomTransitionAnimation(boolean z4, Runnable runnable) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        y01 y01Var;
        org.telegram.ui.ActionBar.w0 w0Var;
        Object obj;
        org.telegram.ui.ActionBar.z zVar;
        org.telegram.ui.ActionBar.w0 k10;
        org.telegram.ui.ActionBar.k5[] k5VarArr;
        float f10;
        lh.u0 u0Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        float f11;
        wy0 wy0Var;
        org.telegram.ui.Components.rg rgVar;
        boolean z11;
        TLRPC.Chat chat;
        jx jxVar;
        if (!this.F0) {
            j5();
            if (this.G1 != 0 && this.J1 && !this.m2 && !this.K1) {
                ImageView imageView = this.f0;
                if (imageView != null) {
                    imageView.setAlpha(1.0f);
                }
                ImageView imageView2 = this.e0;
                if (imageView2 != null) {
                    imageView2.setAlpha(1.0f);
                }
                ImageView imageView3 = this.h0;
                if (imageView3 != null) {
                    imageView3.setAlpha(1.0f);
                    this.h0.setScaleX(1.0f);
                    this.h0.setScaleY(1.0f);
                }
                ImageView imageView4 = this.g0;
                if (imageView4 != null) {
                    imageView4.setAlpha(1.0f);
                    this.g0.setScaleX(1.0f);
                    this.g0.setScaleY(1.0f);
                }
                org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
                int i10 = 2;
                if (e5Var != null && e5Var.getFragmentStack().size() >= 2) {
                    Object obj2 = (org.telegram.ui.ActionBar.p2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                    if (obj2 instanceof org.telegram.ui.Components.rg) {
                        this.d5 = (org.telegram.ui.Components.rg) obj2;
                    }
                    if ((obj2 instanceof oy) && (jxVar = ((oy) obj2).C3) != null) {
                        qx qxVar = jxVar.a;
                        if (e2.c.s(qxVar)) {
                            this.d5 = qxVar;
                        }
                    }
                }
                Object obj3 = this.d5;
                if (obj3 instanceof xn) {
                    kVar = ((org.telegram.ui.ActionBar.p2) obj3).getActionBar();
                    kVar.setSkipDrawChild(true);
                } else {
                    kVar = null;
                }
                org.telegram.ui.Components.rg rgVar2 = this.d5;
                boolean z12 = (rgVar2 instanceof xn) && ((xn) rgVar2).e != null;
                if (rgVar2 != null) {
                    ImageView imageView5 = this.f0;
                    if (imageView5 != null) {
                        if (!(rgVar2 instanceof xn) || (chat = ((xn) rgVar2).e) == null || chat.linked_community_id == 0) {
                            imageView5.setTag(null);
                            this.f0.setVisibility(8);
                        } else {
                            imageView5.setTag(1);
                            this.f0.setVisibility(0);
                        }
                    }
                    if (this.i0 != null) {
                        org.telegram.ui.Components.rg rgVar3 = this.d5;
                        if ((rgVar3 instanceof xn) && ChatObject.isMonoForum(((xn) rgVar3).e)) {
                            this.e0.setTag(null);
                            this.e0.setVisibility(8);
                        } else {
                            TLRPC.EncryptedChat encryptedChat = this.A2;
                            if (encryptedChat != null) {
                                this.i0.b(encryptedChat.ttl);
                                this.e0.setTag(1);
                                this.e0.setVisibility(0);
                            } else {
                                TLRPC.UserFull userFull = this.s2;
                                if (userFull != null) {
                                    this.i0.b(userFull.ttl_period);
                                    if (!this.H1 || this.s2.ttl_period == 0) {
                                        this.e0.setTag(null);
                                        this.e0.setVisibility(8);
                                    } else {
                                        this.e0.setTag(1);
                                        this.e0.setVisibility(0);
                                    }
                                } else {
                                    TLRPC.ChatFull chatFull = this.r2;
                                    if (chatFull != null) {
                                        this.i0.b(chatFull.ttl_period);
                                        if (!this.H1 || this.r2.ttl_period == 0) {
                                            this.e0.setTag(null);
                                            this.e0.setVisibility(8);
                                        } else {
                                            this.e0.setTag(1);
                                            this.e0.setVisibility(0);
                                        }
                                    } else {
                                        this.e0.setTag(null);
                                        this.e0.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                    k5();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(this.G1 == 2 ? 250L : 180L);
                this.a.setLayerType(2, null);
                org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
                if (n10.k(10) == null && this.M0 == null) {
                    this.M0 = n10.a(10, R.drawable.ic_ab_other);
                }
                org.telegram.ui.ActionBar.k5[] k5VarArr2 = this.f;
                org.telegram.ui.ActionBar.k5[] k5VarArr3 = this.r;
                if (z4) {
                    this.L5 = 0.0f;
                    int i11 = 0;
                    while (i11 < 2) {
                        i11++;
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k5VarArr3[i11].getLayoutParams();
                        layoutParams.rightMargin = (int) ((AndroidUtilities.density * (-21.0f)) + AndroidUtilities.dp(8.0f));
                        k5VarArr3[i11].setLayoutParams(layoutParams);
                    }
                    if (this.G1 != 2) {
                        int ceil = (int) Math.ceil((AndroidUtilities.density * 21.0f) + (AndroidUtilities.displaySize.x - AndroidUtilities.dp(117.0f)));
                        float measureText = (k5VarArr2[1].getPaint().measureText(k5VarArr2[1].getText().toString()) * 1.12f) + k5VarArr2[1].getSideDrawablesSize();
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) k5VarArr2[1].getLayoutParams();
                        if (ceil < measureText) {
                            k5VarArr = k5VarArr2;
                            layoutParams2.width = (int) Math.ceil(r5 / 1.12f);
                        } else {
                            k5VarArr = k5VarArr2;
                            layoutParams2.width = -2;
                        }
                        k5VarArr[1].setLayoutParams(layoutParams2);
                        this.O1 = T3();
                    } else {
                        k5VarArr = k5VarArr2;
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) k5VarArr[1].getLayoutParams();
                        layoutParams3.width = (int) ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(32.0f)) / 1.38f);
                        k5VarArr[1].setLayoutParams(layoutParams3);
                    }
                    this.fragmentView.setBackgroundColor(0);
                    setAvatarAnimationProgress(0.0f);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 0.0f, 1.0f));
                    org.telegram.ui.Components.jj0 jj0Var = this.v;
                    if (jj0Var != null && jj0Var.getTag() == null) {
                        this.v.setScaleX(0.2f);
                        this.v.setScaleY(0.2f);
                        this.v.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.jj0, Float>) View.SCALE_X, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.jj0, Float>) View.SCALE_Y, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.jj0, Float>) View.ALPHA, 1.0f));
                    }
                    zy0 zy0Var = this.r0;
                    if (zy0Var != null && this.G1 == 2) {
                        zy0Var.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.r0, (Property<zy0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.G1 == 2) {
                        this.o0 = P3(this.b0.getImageReceiver());
                        k5VarArr[1].setTextColor(-1);
                        k5VarArr3[1].setTextColor(-1275068417);
                        this.actionBar.B(1090519039, false);
                        s01 s01Var = this.Y5;
                        if (s01Var != null) {
                            s01Var.a(603979775);
                        }
                        h01 h01Var = this.K;
                        h01Var.B = true;
                        h01Var.setVisibility(0);
                    }
                    int i12 = 0;
                    while (i12 < 2) {
                        k5VarArr[i12].setAlpha(i12 == 0 ? 1.0f : 0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(k5VarArr[i12], (Property<org.telegram.ui.ActionBar.k5, Float>) View.ALPHA, i12 == 0 ? 0.0f : 1.0f));
                        i12++;
                    }
                    if (this.r0 != null) {
                        if (a() > 0) {
                            this.r0.setAlpha(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.r0, (Property<zy0, Float>) View.ALPHA, 1.0f));
                        } else {
                            f10 = 1.0f;
                            this.r0.setAlpha(1.0f);
                            this.r0.setFragmentTransitionProgress(0.0f);
                            arrayList.add(ObjectAnimator.ofFloat(this.r0, "fragmentTransitionProgress", 1.0f));
                            u0Var = this.s0;
                            if (u0Var != null) {
                                u0Var.setAlpha(0.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.s0, (Property<lh.u0, Float>) View.ALPHA, f10));
                            }
                            if (this.e0.getTag() != null) {
                                arrayList.add(ObjectAnimator.ofFloat(this.e0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.e0, (Property<ImageView, Float>) View.SCALE_X, 0.85f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.e0, (Property<ImageView, Float>) View.SCALE_Y, 0.85f, 0.0f));
                            }
                            if (this.f0.getTag() != null) {
                                arrayList.add(ObjectAnimator.ofFloat(this.f0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.f0, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.f0, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f));
                            }
                            if (this.h0.getTag() != null) {
                                arrayList.add(ObjectAnimator.ofFloat(this.h0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.h0, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.h0, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f));
                            }
                            if (this.g0.getTag() != null) {
                                arrayList.add(ObjectAnimator.ofFloat(this.g0, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.g0, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.g0, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f));
                            }
                            w0Var2 = this.M0;
                            if (w0Var2 != null) {
                                w0Var2.setAlpha(1.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.M0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 0.0f));
                            }
                            if (this.I0 && (this.c1 != 0 || z12)) {
                                this.N0.setAlpha(0.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.N0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 1.0f));
                            }
                            if (this.J0) {
                                this.O0.setAlpha(0.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.O0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 1.0f));
                            }
                            if (this.K0) {
                                this.P0.setAlpha(0.0f);
                                arrayList.add(ObjectAnimator.ofFloat(this.P0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 1.0f));
                            }
                            if (this.V0.getTag() == null) {
                                this.V0.setAlpha(0.0f);
                                f11 = 1.0f;
                                arrayList.add(ObjectAnimator.ofFloat(this.V0, (Property<ImageView, Float>) View.ALPHA, 1.0f));
                            } else {
                                f11 = 1.0f;
                            }
                            wy0Var = this.b0;
                            if (wy0Var != null) {
                                wy0Var.setCrossfadeProgress(f11);
                                arrayList.add(ObjectAnimator.ofFloat(this.b0, tz0.d0, 0.0f));
                            }
                            rgVar = this.d5;
                            if (rgVar == null) {
                                org.telegram.ui.Components.zn o10 = rgVar.o();
                                if (o10 != null) {
                                    org.telegram.ui.Components.vn vnVar = o10.e;
                                    org.telegram.ui.Components.qv0 A = this.d5.A();
                                    RectF rectF = ug.i.h;
                                    ug.i.c(vnVar, A, rectF);
                                    this.L5 = rectF.left;
                                }
                                if ((o10 == null || !(o10.getSubtitleTextView() instanceof org.telegram.ui.ActionBar.k5) || ((org.telegram.ui.ActionBar.k5) o10.getSubtitleTextView()).getLeftDrawable() == null) && !o10.P[0]) {
                                    z11 = false;
                                } else {
                                    this.T4 = o10.getSubtitleTextView();
                                    this.W.invalidate();
                                    k5VarArr3[0].setAlpha(0.0f);
                                    k5VarArr3[1].setAlpha(0.0f);
                                    arrayList.add(ObjectAnimator.ofFloat(k5VarArr3[1], (Property<org.telegram.ui.ActionBar.k5, Float>) View.ALPHA, 1.0f));
                                    z11 = true;
                                }
                                setAvatarAnimationProgress(0.0f);
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                int i13 = 0;
                                while (i13 < 2) {
                                    k5VarArr3[i13].setAlpha(i13 == 0 ? 1.0f : 0.0f);
                                    arrayList.add(ObjectAnimator.ofFloat(k5VarArr3[i13], (Property<org.telegram.ui.ActionBar.k5, Float>) View.ALPHA, i13 == 0 ? 0.0f : 1.0f));
                                    i13++;
                                }
                            }
                            animatorSet.playTogether(arrayList);
                        }
                    }
                    f10 = 1.0f;
                    u0Var = this.s0;
                    if (u0Var != null) {
                    }
                    if (this.e0.getTag() != null) {
                    }
                    if (this.f0.getTag() != null) {
                    }
                    if (this.h0.getTag() != null) {
                    }
                    if (this.g0.getTag() != null) {
                    }
                    w0Var2 = this.M0;
                    if (w0Var2 != null) {
                    }
                    if (this.I0) {
                        this.N0.setAlpha(0.0f);
                        arrayList.add(ObjectAnimator.ofFloat(this.N0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.J0) {
                    }
                    if (this.K0) {
                    }
                    if (this.V0.getTag() == null) {
                    }
                    wy0Var = this.b0;
                    if (wy0Var != null) {
                    }
                    rgVar = this.d5;
                    if (rgVar == null) {
                    }
                    if (!z11) {
                    }
                    animatorSet.playTogether(arrayList);
                } else {
                    this.O1 = this.N1;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ObjectAnimator.ofFloat(this, "avatarAnimationProgress", 1.0f, 0.0f));
                    org.telegram.ui.Components.jj0 jj0Var2 = this.v;
                    if (jj0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(jj0Var2, (Property<org.telegram.ui.Components.jj0, Float>) View.SCALE_X, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.jj0, Float>) View.SCALE_Y, 0.2f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.v, (Property<org.telegram.ui.Components.jj0, Float>) View.ALPHA, 0.0f));
                    }
                    int i14 = 0;
                    while (i14 < 2) {
                        arrayList2.add(ObjectAnimator.ofFloat(k5VarArr2[i14], (Property<org.telegram.ui.ActionBar.k5, Float>) View.ALPHA, i14 == 0 ? 1.0f : 0.0f));
                        i14++;
                    }
                    zy0 zy0Var2 = this.r0;
                    if (zy0Var2 != null) {
                        if (this.f1 > 0) {
                            arrayList2.add(ObjectAnimator.ofFloat(zy0Var2, (Property<zy0, Float>) View.ALPHA, 0.0f));
                        } else {
                            arrayList2.add(ObjectAnimator.ofFloat(zy0Var2, "fragmentTransitionProgress", 0.0f));
                        }
                    }
                    lh.u0 u0Var2 = this.s0;
                    if (u0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(u0Var2, (Property<lh.u0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.e0.getTag() != null) {
                        this.e0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.e0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.e0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 0.85f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.e0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 0.85f));
                    }
                    if (this.f0.getTag() != null) {
                        this.f0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.f0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.h0.getTag() != null) {
                        this.h0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.h0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.h0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.h0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f));
                    }
                    if (this.g0.getTag() != null) {
                        this.g0.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.g0, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.g0, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.g0, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f));
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.M0;
                    if (w0Var3 != null) {
                        w0Var3.setAlpha(0.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.M0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 1.0f));
                    }
                    if (this.I0 && (this.c1 != 0 || z12)) {
                        this.N0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.N0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.J0) {
                        this.O0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.O0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.K0) {
                        this.P0.setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.P0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, 0.0f));
                    }
                    ImageView imageView6 = this.V0;
                    if (imageView6 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) View.ALPHA, imageView6.getAlpha(), 0.0f));
                    }
                    wy0 wy0Var2 = this.b0;
                    if (wy0Var2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(wy0Var2, tz0.d0, 1.0f));
                    }
                    org.telegram.ui.ActionBar.p2 p2Var = this.parentLayout.getFragmentStack().size() > 1 ? (org.telegram.ui.ActionBar.p2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) : null;
                    if (p2Var instanceof xn) {
                        xn xnVar = (xn) p2Var;
                        lj ljVar = xnVar.X0;
                        AndroidUtilities.doOnPreDraw(ljVar, new hf0(this, ljVar, xnVar, 24));
                        View subtitleTextView = ljVar.getSubtitleTextView();
                        if (((subtitleTextView instanceof org.telegram.ui.ActionBar.k5) && ((org.telegram.ui.ActionBar.k5) subtitleTextView).getLeftDrawable() != null) || ljVar.P[0]) {
                            this.T4 = ljVar.getSubtitleTextView();
                            this.W.invalidate();
                            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr3[0];
                            Property property = View.ALPHA;
                            arrayList2.add(ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property, 0.0f));
                            arrayList2.add(ObjectAnimator.ofFloat(k5VarArr3[1], (Property<org.telegram.ui.ActionBar.k5, Float>) property, 0.0f));
                            z10 = true;
                            if (!z10) {
                                int i15 = 0;
                                while (i15 < 2) {
                                    arrayList2.add(ObjectAnimator.ofFloat(k5VarArr3[i15], (Property<org.telegram.ui.ActionBar.k5, Float>) View.ALPHA, i15 == 0 ? 1.0f : 0.0f));
                                    i15++;
                                }
                            }
                            animatorSet.playTogether(arrayList2);
                            y01Var = this.Z5;
                            if (y01Var != null) {
                                y01Var.animate().alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.nr.h).start();
                            }
                        }
                    }
                    z10 = false;
                    if (!z10) {
                    }
                    animatorSet.playTogether(arrayList2);
                    y01Var = this.Z5;
                    if (y01Var != null) {
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ux0(this, i10));
                animatorSet.playTogether(ofFloat);
                if (this.L0 == null || (obj = this.d5) == null || (zVar = ((org.telegram.ui.ActionBar.p2) obj).getActionBar().B) == null || (k10 = zVar.k(32)) == null || k10.getVisibility() != 0) {
                    w0Var = null;
                } else {
                    k10.setAlpha(0.0f);
                    if (z4) {
                        this.L0.setVisibility(0);
                    }
                    this.L0.setTag(k10);
                    w0Var = k10;
                }
                animatorSet.addListener(new org.telegram.ui.Components.vs(this, kVar, w0Var, runnable, 3));
                animatorSet.setInterpolator(this.G1 == 2 ? org.telegram.ui.Components.nr.f : new DecelerateInterpolator());
                AndroidUtilities.runOnUIThread(new rt0(animatorSet, 4), 50L);
                return animatorSet;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onDialogDismiss(Dialog dialog) {
        my0 my0Var = this.a;
        if (my0Var != null) {
            my0Var.f1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x044f  */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        long clientUserId;
        org.telegram.ui.Components.qu0 qu0Var;
        g01 g01Var;
        this.b1 = this.arguments.getLong("user_id", 0L);
        this.c1 = this.arguments.getLong("chat_id", 0L);
        this.d1 = this.arguments.getLong("topic_id", 0L);
        this.e1 = this.arguments.getBoolean("saved", false);
        this.o1 = this.arguments.getBoolean("similar", false);
        this.n1 = this.d1 != 0;
        this.B1 = this.arguments.getLong("ban_chat_id", 0L);
        this.W4 = this.arguments.getInt("report_reaction_message_id", 0);
        this.X4 = this.arguments.getLong("report_reaction_from_dialog_id", 0L);
        this.Z4 = this.arguments.getBoolean("show_add_to_contacts", true);
        this.a5 = se.b.d(this.arguments.getString("vcard_phone"), false);
        this.b5 = this.arguments.getString("vcard_first_name");
        this.c5 = this.arguments.getString("vcard_last_name");
        this.i1 = this.arguments.getBoolean("reportSpam", false);
        this.p1 = this.arguments.getBoolean("my_profile", false);
        this.q1 = this.arguments.getBoolean("open_gifts", false);
        this.s1 = this.arguments.getBoolean("open_gifts_upgradable", false);
        this.r1 = this.arguments.getInt("open_gifts_collection", 0);
        this.u1 = this.arguments.getBoolean("open_common", false);
        this.v1 = this.arguments.getInt("open_story_album_id", -1);
        this.F0 = this.arguments.getBoolean("hasMainTabs", false);
        if (!this.k1) {
            boolean z4 = this.arguments.getBoolean("expandPhoto", false);
            this.k1 = z4;
            if (z4) {
                this.h2 = 1.0f;
                this.l1 = true;
            }
        }
        if (this.b1 == 0) {
            if (this.c1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.c1));
                this.B2 = chat;
                if (chat == null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    getMessagesStorage().getStorageQueue().postRunnable(new zq0(21, this, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (this.B2 != null) {
                        getMessagesController().putChat(this.B2, true);
                    }
                }
                FlagSecureReason flagSecureReason = this.U1;
                if (flagSecureReason != null) {
                    flagSecureReason.invalidate();
                }
                if (this.B2.megagroup) {
                    R3(true);
                } else {
                    this.z1 = null;
                }
                getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
                getNotificationCenter().addObserver(this, NotificationCenter.chatOnlineCountDidLoad);
                getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.uploadStoryEnd);
                this.z2 = new ArrayList();
                h5(true);
                if (this.r2 == null) {
                    this.r2 = getMessagesController().getChatFull(this.c1);
                }
                if (ChatObject.isChannel(this.B2)) {
                    getMessagesController().loadFullChat(this.c1, this.classGuid, true);
                } else if (this.r2 == null) {
                    this.r2 = getMessagesStorage().loadChatInfo(this.c1, false, null, false, false);
                }
                a5();
                clientUserId = getUserConfig().getClientUserId();
                if (this.b1 != clientUserId) {
                }
                this.p1 = true;
                qu0Var = this.O;
                if (qu0Var != null) {
                    qu0Var.b(this);
                    this.O = null;
                }
                if (this.O == null) {
                }
                this.O.x.add(this);
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
                g01Var = this.d;
                if (g01Var != null) {
                }
                if (this.arguments.containsKey("preload_messages")) {
                }
                if (this.b1 != 0) {
                    getConnectionsManager().sendRequest(new TL_account.getPassword(), new zx0(this, 5));
                }
                setBulletinDelegate(new a9(this, 8));
                if (this.b1 != 0) {
                    getMessagesController().getContentSettings(null);
                }
                I4();
                this.g6 = !this.F0 ? AndroidUtilities.dp(72.0f) : 0;
                this.h6 = this.F0 ? AndroidUtilities.dp(64.0f) : 0;
                return true;
            }
            return false;
        }
        long j10 = this.arguments.getLong("dialog_id", 0L);
        this.f1 = j10;
        if (j10 != 0) {
            this.A2 = org.telegram.messenger.y3.n(getMessagesController(), this.f1);
        }
        FlagSecureReason flagSecureReason2 = this.U1;
        if (flagSecureReason2 != null) {
            flagSecureReason2.invalidate();
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b1));
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
            this.h1 = getMessagesController().blockePeers.indexOfKey(this.b1) >= 0;
            if (user.bot) {
                this.o2 = true;
                MediaDataController mediaDataController = getMediaDataController();
                long j11 = user.id;
                mediaDataController.loadBotInfo(j11, j11, true, this.classGuid);
            }
            this.s2 = getMessagesController().getUserFull(this.b1);
            getMessagesController().loadFullUser(getMessagesController().getUser(Long.valueOf(this.b1)), this.classGuid, true);
            this.z1 = null;
            if (UserObject.isUserSelf(user)) {
                org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40(0, true, true);
                this.n0 = w40Var;
                w40Var.E = true;
                w40Var.a = this;
                w40Var.b = this;
                getMediaDataController().checkFeaturedStickers();
                getMessagesController().loadSuggestedFilters();
                getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, this.classGuid);
            }
            this.U4 = this.arguments.getInt("actionBarColor", 0);
            clientUserId = getUserConfig().getClientUserId();
            if ((this.b1 != clientUserId || this.f1 == clientUserId) && !this.p1) {
                this.p1 = true;
            }
            qu0Var = this.O;
            if (qu0Var != null && qu0Var.s != this.d1) {
                qu0Var.b(this);
                this.O = null;
            }
            if (this.O == null) {
                this.O = new org.telegram.ui.Components.qu0(this);
            }
            this.O.x.add(this);
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
            g01Var = this.d;
            if (g01Var != null) {
                g01Var.l();
            }
            if (this.arguments.containsKey("preload_messages")) {
                getMessagesController().ensureMessagesLoaded(this.b1, 0, null);
            }
            if (this.b1 != 0 && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(this.b1)))) {
                getConnectionsManager().sendRequest(new TL_account.getPassword(), new zx0(this, 5));
            }
            setBulletinDelegate(new a9(this, 8));
            if (this.b1 != 0 && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(this.b1))) && !this.p1) {
                getMessagesController().getContentSettings(null);
            }
            I4();
            this.g6 = !this.F0 ? AndroidUtilities.dp(72.0f) : 0;
            this.h6 = this.F0 ? AndroidUtilities.dp(64.0f) : 0;
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        sz0 sz0Var = this.L;
        if (sz0Var != null) {
            sz0Var.F0();
        }
        org.telegram.ui.Components.qu0 qu0Var = this.O;
        if (qu0Var != null) {
            qu0Var.b(this);
        }
        org.telegram.ui.Components.qu0 qu0Var2 = this.O;
        if (qu0Var2 != null) {
            qu0Var2.x.remove(this);
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
        xy0 xy0Var = this.k0;
        if (xy0Var != null) {
            xy0Var.K();
        }
        org.telegram.ui.Components.mh0 mh0Var = this.j0;
        if (mh0Var != null) {
            mh0Var.e();
        }
        this.G5 = null;
        if (this.b1 != 0) {
            getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.reloadInterface);
            getMessagesController().cancelLoadFullUser(this.b1);
        } else if (this.c1 != 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatOnlineCountDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        }
        wy0 wy0Var = this.b0;
        if (wy0Var != null) {
            wy0Var.setImageDrawable(null);
        }
        org.telegram.ui.Components.w40 w40Var = this.n0;
        if (w40Var != null) {
            w40Var.e();
        }
        bz0 bz0Var = this.S4;
        if (bz0Var != null) {
            bz0Var.b();
        }
        v01 v01Var = this.v2;
        if (v01Var != null && this.u2) {
            v01Var.b(true);
            this.v2 = null;
        }
        org.telegram.messenger.w8 w8Var = this.u5;
        if (w8Var != null) {
            this.u5 = null;
            AndroidUtilities.runOnUIThread(w8Var);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        org.telegram.ui.Components.dt0 dt0Var;
        super.onPause();
        UndoView undoView = this.J;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.w40 w40Var = this.n0;
        if (w40Var != null) {
            w40Var.j();
        }
        FlagSecureReason flagSecureReason = this.U1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        sz0 sz0Var = this.L;
        if (sz0Var == null || (dt0Var = sz0Var.Q) == null) {
            return;
        }
        dt0Var.e = false;
        if (dt0Var.c != null) {
            dt0Var.a.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z4;
        boolean z10;
        org.telegram.ui.Components.w40 w40Var = this.n0;
        if (w40Var != null) {
            w40Var.k(i10, strArr, iArr);
        }
        if (i10 != 101 && i10 != 102) {
            if (i10 != 103 || this.B2 == null) {
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
                org.telegram.ui.Components.voip.f2.i(getParentActivity(), null, i10);
                return;
            } else {
                org.telegram.ui.Components.voip.f2.m(this.B2, null, getMessagesController().getGroupCall(this.c1, false) == null, null, getParentActivity(), this, getAccountInstance());
                return;
            }
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b1));
        if (user == null) {
            return;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= iArr.length) {
                z4 = true;
                break;
            } else {
                if (iArr[i12] != 0) {
                    z4 = false;
                    break;
                }
                i12++;
            }
        }
        if (iArr.length <= 0 || !z4) {
            org.telegram.ui.Components.voip.f2.i(getParentActivity(), null, i10);
            return;
        }
        boolean z11 = i10 == 102;
        TLRPC.UserFull userFull = this.s2;
        org.telegram.ui.Components.voip.f2.n(user, z11, userFull != null && userFull.video_calls_available, getParentActivity(), this.s2, getAccountInstance());
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        TLRPC.User user;
        gw0 gw0Var;
        super.onResume();
        sz0 sz0Var = this.L;
        if (sz0Var != null) {
            sz0Var.Y0 = true;
            org.telegram.ui.Components.ct0 ct0Var = sz0Var.E;
            if (ct0Var != null) {
                ct0Var.l();
            }
            org.telegram.ui.Components.lu0 lu0Var = sz0Var.H;
            if (lu0Var != null) {
                lu0Var.l();
            }
            org.telegram.ui.Components.mu0 mu0Var = sz0Var.G;
            if (mu0Var != null) {
                mu0Var.X(false);
            }
            for (int i10 = 0; i10 < sz0Var.h0.length; i10++) {
                sz0Var.U(i10);
            }
            org.telegram.ui.Components.dt0 dt0Var = sz0Var.Q;
            if (dt0Var != null) {
                dt0Var.e = true;
                if (dt0Var.c != null) {
                    dt0Var.a.onResume();
                }
            }
        }
        f4();
        g01 g01Var = this.d;
        if (g01Var != null) {
            this.Q4 = true;
            g01Var.l();
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (gw0Var = this.R) != null && gw0Var.getVisibility() == 0) {
            this.R.setVisibility(8);
            this.R.setBackground(null);
        }
        org.telegram.ui.Components.w40 w40Var = this.n0;
        if (w40Var != null) {
            w40Var.l();
            setParentActivityTitle(LocaleController.getString(R.string.Settings));
        }
        i5(true);
        View view = this.fragmentView;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new ai(this, 5));
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.f[1];
        if (k5Var != null) {
            setParentActivityTitle(k5Var.getText());
        }
        if (this.b1 != 0 && (user = getMessagesController().getUser(Long.valueOf(this.b1))) != null && user.photo == null && this.N1 >= T3()) {
            this.g2.cancel();
            float[] fArr = this.j2;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            J4(1.0f);
            this.k0.setVisibility(8);
            this.N1 = T3();
            this.l2 = false;
            this.c.h1(0, T3() - this.a.getPaddingTop());
        }
        FlagSecureReason flagSecureReason = this.U1;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        c5();
        k4(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            if (!z10) {
                int i10 = this.G1;
                if (i10 != 0 && this.J1) {
                    if (i10 == 1) {
                        this.h2 = 0.0f;
                        org.telegram.ui.Components.jw0 jw0Var = this.Q;
                        if (jw0Var != null) {
                            jw0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.jh0 jh0Var = this.X;
                        if (jh0Var != null) {
                            jh0Var.setParentExpanded(0.0f);
                        }
                        org.telegram.ui.Components.ci0 ci0Var = this.Z;
                        if (ci0Var != null) {
                            ci0Var.setParentExpanded(0.0f);
                        }
                    }
                    this.D1 = false;
                    A3();
                    if (this.F1) {
                        D3(true);
                    }
                }
                if (!this.i5) {
                    this.i5 = true;
                    this.R4 = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().onAnimationFinish(this.M4);
            gw0 gw0Var = this.R;
            if (gw0Var != null && gw0Var.getVisibility() == 0) {
                this.R.setVisibility(8);
                this.R.setBackground(null);
            }
        }
        this.E1 = false;
        B3();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        super.onTransitionAnimationProgress(z4, f10);
        gw0 gw0Var = this.R;
        if (gw0Var == null || gw0Var.getVisibility() != 0) {
            return;
        }
        if (z4) {
            this.R.setAlpha(1.0f - f10);
        } else {
            this.R.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        ImageView imageView;
        org.telegram.ui.Components.jh0 jh0Var;
        super.onTransitionAnimationStart(z4, z10);
        this.J5 = z4;
        if (z4 && (jh0Var = this.X) != null) {
            ArrayList arrayList = jh0Var.a;
            if (jh0Var.E == 6) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.ui.Components.gh0 gh0Var = (org.telegram.ui.Components.gh0) arrayList.get(i10);
                    org.telegram.ui.Components.gj0 gj0Var = gh0Var.k;
                    if (gj0Var != null) {
                        if (gh0Var.a == 15) {
                            gj0Var.K(14);
                        } else {
                            gj0Var.K(0);
                        }
                        gh0Var.k.start();
                    }
                }
            }
        }
        if (!z4 && (imageView = this.L0) != null && imageView.getTag() != null && (this.L0.getTag() instanceof org.telegram.ui.ActionBar.w0)) {
            ((org.telegram.ui.ActionBar.w0) this.L0.getTag()).setAlpha(1.0f);
        }
        if (((!z4 && z10) || (z4 && !z10)) && this.G1 != 0 && this.J1 && !this.m2) {
            this.D1 = true;
            if (!z4) {
                if (this.G5 == null) {
                    this.G5 = new float[16];
                }
                this.C1 = this.N1;
                this.G5[0] = this.V.getScaleX();
                this.G5[1] = this.V.getTranslationX();
                this.G5[2] = this.V.getTranslationY();
                org.telegram.ui.Components.jh0 jh0Var2 = this.X;
                if (jh0Var2 != null) {
                    this.G5[3] = jh0Var2.getAlpha();
                }
                lh.u0 u0Var = this.s0;
                if (u0Var != null) {
                    float[] fArr = this.G5;
                    fArr[4] = u0Var.e;
                    fArr[5] = u0Var.f;
                }
                if (this.Y5 != null) {
                    this.G5[6] = r3.getAlpha();
                }
                float[] fArr2 = this.G5;
                org.telegram.ui.ActionBar.k5[] k5VarArr = this.f;
                fArr2[7] = k5VarArr[1].getScaleX();
                this.G5[8] = k5VarArr[1].getTranslationY();
                float[] fArr3 = this.G5;
                org.telegram.ui.ActionBar.k5[] k5VarArr2 = this.r;
                fArr3[9] = k5VarArr2[1].getTranslationY();
                this.G5[10] = k5VarArr[1].getLayoutParams().width;
                this.G5[11] = this.Z1;
                for (int i11 = 0; i11 < k5VarArr.length; i11++) {
                    org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[i11];
                    if (k5Var != null) {
                        int i12 = i11 * 2;
                        this.G5[i12 + 12] = k5Var.getTranslationX();
                        this.G5[i12 + 13] = k5VarArr2[i11].getTranslationX();
                    }
                }
                ph.f3 f3Var = this.a6;
                if (f3Var != null) {
                    f3Var.e(true);
                }
            }
        }
        if (z4) {
            if (this.n0 != null) {
                this.M4 = getNotificationCenter().setAnimationInProgress(this.M4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.needCheckSystemBarColors});
            } else {
                this.M4 = getNotificationCenter().setAnimationInProgress(this.M4, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.needCheckSystemBarColors});
            }
            if (!z10 && getParentActivity() != null) {
                this.V4 = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.E1 = true;
        B3();
    }

    public final void p4() {
        TLRPC.UserFull userFull = this.s2;
        if (userFull == null || !UserObject.areGiftsDisabled(userFull)) {
            if (this.B2 != null) {
                org.telegram.ui.Components.l40.h.a();
            }
            showDialog(new kh.h2(getParentActivity(), this.currentAccount, a(), null, null));
        } else {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                org.telegram.ui.Components.qc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(a())))).j();
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
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.xh, this.w0);
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.yh, this.w0);
            int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wh, this.w0);
            if (this.N5 != null && org.telegram.ui.ActionBar.j6.b1(v02)) {
                v02 = org.telegram.ui.ActionBar.j6.b(0.05f, -0.04f, this.N5.getBgColor1(false));
                MessagesController.PeerColor peerColor = this.N5;
                if (peerColor != null) {
                    int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q());
                    v03 = org.telegram.ui.ActionBar.j6.C(org.telegram.ui.ActionBar.j6.I.q(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, this.w0), bgColor2, v03, bgColor2);
                }
                v04 = -1;
            }
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(mutate, org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(56.0f), v02, v03), 0, 0);
            int dp = AndroidUtilities.dp(56.0f);
            int dp2 = AndroidUtilities.dp(56.0f);
            nqVar.e = dp;
            nqVar.f = dp2;
            this.v.setBackground(nqVar);
            this.v.setColorFilter(new PorterDuffColorFilter(v04, mode));
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.jt0
    public final boolean q() {
        return this.J5;
    }

    public final void q4(boolean z4) {
        boolean[] zArr = {true};
        getMessagesController().addUserToChat(this.B2.id, getUserConfig().getCurrentUser(), 0, null, this, true, new vq0(this, z4, zArr, 1), new o9.b(this, zArr, z4, this.parentLayout.getLastFragment(), 4));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
    }

    public final void r4(View view, float f10, float f11, boolean z4) {
        float f12;
        float f13;
        long j10;
        long j11 = this.f1;
        if (j11 == 0) {
            j11 = this.b1;
            if (j11 == 0) {
                j11 = -this.c1;
            }
        }
        long j12 = j11;
        boolean isDialogMuted = getMessagesController().isDialogMuted(j12, this.d1);
        if (z4 && (this.n1 || isDialogMuted)) {
            boolean z10 = !isDialogMuted;
            getNotificationsController().muteDialog(j12, this.d1, z10);
            org.telegram.ui.Components.qc.A(this, z10, null).j();
            a5();
            this.X.setNotifications(isDialogMuted);
            return;
        }
        if ((z4 || !LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            org.telegram.ui.Components.lo loVar = new org.telegram.ui.Components.lo(getParentActivity(), this.currentAccount, null, true, new f2.c(this, j12, 6), this.w0);
            loVar.d(j12, this.d1, this.e5);
            if (AndroidUtilities.isTablet()) {
                ViewGroup view2 = this.parentLayout.getView();
                f12 = view2.getX() + view2.getPaddingLeft() + f10;
                f13 = view2.getY() + view2.getPaddingTop() + f11;
            } else {
                f12 = f10;
                f13 = f11;
            }
            if (z4) {
                f13 += this.X.getHeight() - AndroidUtilities.dp(12.0f);
            }
            loVar.c(this, view, f12, f13, z4);
            return;
        }
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
        boolean z11 = j5Var.e.h;
        boolean z12 = !z11;
        boolean isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j12, false, false);
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j12, this.d1);
        if (z11) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            if (isGlobalNotificationsEnabled) {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey, 2);
                j10 = 1;
            } else {
                edit.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                j10 = 0L;
            }
            getNotificationsController().removeNotificationsForDialog(j12);
            if (this.d1 == 0) {
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
            if (this.d1 == 0) {
                getMessagesStorage().setDialogFlags(j12, 0L);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j12);
                if (dialog2 != null) {
                    dialog2.notify_settings = new TLRPC.TL_peerNotifySettings();
                }
            }
            edit2.apply();
        }
        a5();
        getNotificationsController().updateServerNotificationsSettings(j12, this.d1);
        j5Var.setChecked(z12);
        g5(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.w40 w40Var = this.n0;
        if (w40Var != null) {
            w40Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.ug0
    public final void s() {
        this.a.x0(0);
    }

    public final void s4() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.b1 != 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b1));
                if (user == null) {
                    return;
                }
                if (this.C2 == null || (userFull = this.s2) == null || TextUtils.isEmpty(userFull.about)) {
                    str = String.format("https://" + getMessagesController().linkPrefix + "/%s", UserObject.getPublicUsername(user));
                } else {
                    str = String.format("%s https://" + getMessagesController().linkPrefix + "/%s", this.s2.about, UserObject.getPublicUsername(user));
                }
            } else if (this.c1 != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.c1));
                if (chat == null) {
                    return;
                }
                TLRPC.ChatFull chatFull = this.r2;
                if (chatFull == null || TextUtils.isEmpty(chatFull.about)) {
                    str = String.format("https://" + getMessagesController().linkPrefix + "/%s", ChatObject.getPublicUsername(chat));
                } else {
                    str = String.format("%s\nhttps://" + getMessagesController().linkPrefix + "/%s", this.r2.about, ChatObject.getPublicUsername(chat));
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

    @Override // org.telegram.ui.ActionBar.p2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.w40 w40Var = this.n0;
        if (w40Var == null || (str = w40Var.f) == null) {
            return;
        }
        bundle.putString("path", str);
    }

    public void setAvatarAnimationProgress(float f10) {
        int v02;
        int v03;
        int v04;
        this.h2 = f10;
        this.P1 = f10;
        B3();
        if (this.G1 == 2) {
            this.b0.setProgressToExpand(f10);
            org.telegram.ui.Components.jh0 jh0Var = this.X;
            if (jh0Var != null) {
                jh0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.ci0 ci0Var = this.Z;
            if (ci0Var != null) {
                ci0Var.setParentExpanded(f10);
            }
            org.telegram.ui.Components.jw0 jw0Var = this.Q;
            if (jw0Var != null) {
                jw0Var.setParentExpanded(f10);
            }
            S4();
            f5();
        }
        this.a.setAlpha(f10);
        this.a.setTranslationX(AndroidUtilities.dp(48.0f) - (AndroidUtilities.dp(48.0f) * f10));
        if (this.G1 != 2 || (v02 = this.o0) == 0) {
            if (this.b1 == 0 && ChatObject.isChannel(this.c1, this.currentAccount)) {
                boolean z4 = this.B2.megagroup;
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.w0;
            int[][] iArr = org.telegram.ui.Components.z8.C;
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var);
        }
        int i10 = this.U4;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, this.w0);
        }
        this.a1.setBackgroundColor(i0.a.d(f10, i0.a.k(i10, 0), v02));
        org.telegram.ui.Components.x11 x11Var = this.i0;
        int d = i0.a.d(f10, i10, v02);
        x11Var.k = true;
        x11Var.b.setColor(d);
        if (this.N5 != null) {
            v03 = -1;
        } else {
            if (this.b1 == 0 && ChatObject.isChannel(this.c1, this.currentAccount)) {
                boolean z10 = this.B2.megagroup;
            }
            org.telegram.ui.ActionBar.f6 f6Var2 = this.w0;
            int[][] iArr2 = org.telegram.ui.Components.z8.C;
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.g8, f6Var2);
        }
        this.actionBar.C(i0.a.d(this.P1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, this.w0), v03), false);
        int v05 = this.N5 == null ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vh, this.w0) : -1;
        int v06 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, this.w0);
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.ActionBar.k5 k5Var = this.f[i11];
            if (k5Var != null && (i11 != 1 || this.G1 != 2)) {
                k5Var.setTextColor(i0.a.d(f10, v06, v05));
            }
        }
        boolean[] zArr = this.G0;
        if (zArr[0]) {
            v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Bh, this.w0);
        } else {
            if (this.b1 == 0 && ChatObject.isChannel(this.c1, this.currentAccount)) {
                boolean z11 = this.B2.megagroup;
            }
            org.telegram.ui.ActionBar.f6 f6Var3 = this.w0;
            int[][] iArr3 = org.telegram.ui.Components.z8.C;
            v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h8, f6Var3);
        }
        int v07 = org.telegram.ui.ActionBar.j6.v0(zArr[0] ? org.telegram.ui.ActionBar.j6.pa : org.telegram.ui.ActionBar.j6.B8, this.w0);
        int i12 = 0;
        while (i12 < 3) {
            org.telegram.ui.ActionBar.k5 k5Var2 = this.r[i12];
            if (k5Var2 != null && i12 != 1 && (i12 != 2 || this.G1 != 2)) {
                k5Var2.setTextColor(i0.a.d(f10, i12 == 0 ? v07 : w3(v07, Boolean.valueOf(zArr[0])), i12 == 0 ? v04 : w3(v04, Boolean.valueOf(zArr[0]))));
            }
            i12++;
        }
        this.N1 = this.O1 * f10;
        long j10 = this.b1;
        if (j10 == 0) {
            j10 = this.c1;
        }
        org.telegram.ui.ActionBar.f6 f6Var4 = this.w0;
        int[][] iArr4 = org.telegram.ui.Components.z8.C;
        int v08 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.z8.e(j10)], f6Var4);
        long j11 = this.b1;
        if (j11 == 0) {
            j11 = this.c1;
        }
        int d10 = org.telegram.ui.Components.z8.d(j11);
        if (v08 != d10) {
            this.m0.h(i0.a.d(f10, d10, v08));
            this.b0.invalidate();
        }
        int i13 = this.V4;
        if (i13 != 0) {
            setNavigationBarColor(i0.a.d(f10, i13, getNavigationBarColor()));
        }
        this.a1.invalidate();
        k4(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        b01 b01Var = this.K5;
        if (b01Var != null) {
            b01Var.invalidate();
        }
        if (a() > 0) {
            wy0 wy0Var = this.b0;
            if (wy0Var != null) {
                wy0Var.setProgressToStoriesInsets(this.P1);
            }
            zy0 zy0Var = this.r0;
            if (zy0Var != null) {
                zy0Var.setProgressToStoriesInsets(this.P1);
            }
            lh.u0 u0Var = this.s0;
            if (u0Var != null) {
                u0Var.setProgressToStoriesInsets(this.P1);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void setParentLayout(org.telegram.ui.ActionBar.e5 e5Var) {
        super.setParentLayout(e5Var);
        FlagSecureReason flagSecureReason = this.U1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
            this.U1 = null;
        }
        if (e5Var == null || e5Var.getParentActivity() == null) {
            return;
        }
        this.U1 = new FlagSecureReason(e5Var.getParentActivity().getWindow(), new px0(this, 6));
    }

    public final void t4(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.I3) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.c1);
            bundle.putLong("user_id", this.b1);
            presentFragment(new m21(bundle));
            return;
        }
        if (view2.getTag() == null || ((Integer) view2.getTag()).intValue() != this.R2) {
            return;
        }
        if (this.b1 == getUserConfig().getClientUserId()) {
            presentFragment(new PremiumPreviewFragment(0, "my_profile_gift"));
        } else if (UserObject.areGiftsDisabled(this.s2)) {
            org.telegram.ui.Components.qc.a0(this).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.b1)))).j();
        } else {
            showDialog(new kh.h2(getParentActivity(), this.currentAccount, this.b1, null, null));
        }
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ boolean u() {
        return false;
    }

    public final void u4() {
        org.telegram.ui.Components.gj0 gj0Var;
        if (this.b1 == 0) {
            y4();
            return;
        }
        if (this.n0 == null) {
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
        org.telegram.ui.Components.w40 w40Var = this.n0;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        w40Var.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new ob0(this, 24), new v5(this, 14), 0);
        this.S.K(0);
        this.S.N(43);
        this.T.K(0);
        this.T.N(43);
        org.telegram.ui.Components.jh0 jh0Var = this.X;
        if (jh0Var != null) {
            org.telegram.ui.Components.gh0 j10 = org.telegram.ui.Components.jh0.j(14, jh0Var.a);
            if (j10 != null && (gj0Var = j10.k) != null) {
                gj0Var.start();
            }
        } else {
            this.v.d();
        }
        org.telegram.ui.Cells.o8 o8Var = this.J2;
        if (o8Var != null) {
            o8Var.getImageView().d();
        }
    }

    public final CharSequence v3(CharSequence charSequence) {
        if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.f1)) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.mq(R.drawable.mini_ephemeral_hidden_16, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityHiddenStatus));
        spannableStringBuilder.append((CharSequence) " * ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.zs(), length - 2, length - 1, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final void v4() {
        Bundle i10 = android.support.v4.media.a.i("addToGroup", true);
        i10.putLong("chatId", this.B2.id);
        y60 y60Var = new y60(i10);
        TLRPC.ChatFull chatFull = this.r2;
        y60Var.F = chatFull;
        if (chatFull != null && chatFull.participants != null) {
            a0.h hVar = new a0.h();
            for (int i11 = 0; i11 < this.r2.participants.participants.size(); i11++) {
                hVar.k(null, this.r2.participants.participants.get(i11).user_id);
            }
            y60Var.G = hVar;
        }
        y60Var.x = new px0(this, 9);
        presentFragment(y60Var);
    }

    @Override // org.telegram.ui.iy
    public final boolean w(oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle i12 = android.support.v4.media.a.i("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j10)) {
            i12.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            i12.putLong("user_id", j10);
        } else if (DialogObject.isChatDialog(j10)) {
            i12.putLong("chat_id", -j10);
        }
        if (!getMessagesController().checkCanOpenChat(i12, oyVar)) {
            return false;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i13 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i13);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i13, new Object[0]);
        presentFragment(new xn(i12), true);
        removeSelfFromStack();
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(getMessagesController().getUser(Long.valueOf(this.b1)), j10, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, i11));
        if (!TextUtils.isEmpty(charSequence)) {
            SendMessagesHelper.prepareSendingText(AccountInstance.getInstance(this.currentAccount), charSequence, j10, z10, i10, i11, 0L);
        }
        return true;
    }

    public final int w3(int i10, Boolean bool) {
        if (this.N5 == null) {
            return i10;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, this.w0);
        int d = i0.a.d(0.5f, this.N5.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), this.N5.getStoryColor2(org.telegram.ui.ActionBar.j6.I.q()));
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
    public final void w4(boolean z4) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize closestVideoSizeWithSize;
        TLRPC.ChatFull chatFull;
        TLRPC.FileLocation fileLocation2;
        TLRPC.VideoSize closestVideoSizeWithSize2;
        TLRPC.UserFull userFull;
        TLRPC.Photo photo;
        if (this.a.getScrollState() != 1 || z4) {
            xy0 xy0Var = this.k0;
            int realPosition = xy0Var != null ? xy0Var.getRealPosition() : 0;
            xy0 xy0Var2 = this.k0;
            ImageLocation imageLocation = null;
            ImageLocation G = xy0Var2 != null ? xy0Var2.G(realPosition) : null;
            xy0 xy0Var3 = this.k0;
            TLRPC.Photo F = xy0Var3 != null ? xy0Var3.F(realPosition) : null;
            long j10 = this.b1;
            hz0 hz0Var = this.h5;
            if (j10 == 0) {
                if (this.c1 == 0 || (chatPhoto = (chat = getMessagesController().getChat(Long.valueOf(this.c1))).photo) == null || chatPhoto.photo_big == null) {
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
                if (F == null && (chatFull = this.r2) != null) {
                    TLRPC.Photo photo2 = chatFull.chat_photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        F = photo2;
                    }
                }
                if (F != null && !F.video_sizes.isEmpty() && (closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(F.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) != null) {
                    imageLocation = ImageLocation.getForPhoto(closestVideoSizeWithSize, F);
                }
                PhotoViewer.t1().e2(null, fileLocation3, G, imageLocation, null, null, null, 0, hz0Var, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.b1));
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
            if (F == null && (userFull = this.s2) != null) {
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
            if (F != null && !F.video_sizes.isEmpty() && (closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(F.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) != null) {
                imageLocation = ImageLocation.getForPhoto(closestVideoSizeWithSize2, F);
            }
            PhotoViewer.t1().e2(null, fileLocation4, G, imageLocation, null, null, null, 0, hz0Var, null, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void x3() {
        if (this.G5 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.g2;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.g2.cancel();
        }
        float clamp01 = Utilities.clamp01(this.N1 / this.C1);
        if (clamp01 <= 0.0f) {
            return;
        }
        float f10 = (clamp01 - 0.5f) / 0.5f;
        float translationY = this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f));
        this.Y1 = AndroidUtilities.lerp(0.42f, this.G5[0], clamp01);
        this.W1 = AndroidUtilities.lerp(this.L5, this.G5[1], clamp01);
        this.X1 = AndroidUtilities.lerp(translationY, this.G5[2], clamp01);
        this.Z1 = AndroidUtilities.lerp(this.G5[11], 0.0f, clamp01);
        this.V.setScaleX(this.Y1);
        this.V.setScaleY(this.Y1);
        this.V.setTranslationX(this.W1);
        this.V.setTranslationY(this.X1);
        org.telegram.ui.Components.jw0 jw0Var = this.Q;
        if (jw0Var != null) {
            jw0Var.setAlpha(clamp01);
        }
        this.b0.setAlpha(1.0f);
        this.V.setAlpha(1.0f);
        zy0 zy0Var = this.r0;
        if (zy0Var != null) {
            zy0Var.invalidate();
        }
        lh.u0 u0Var = this.s0;
        if (u0Var != null) {
            u0Var.e = AndroidUtilities.lerp(0.0f, this.G5[4], f10);
            this.s0.f = AndroidUtilities.lerp(0.0f, this.G5[5], clamp01);
            lh.u0 u0Var2 = this.s0;
            u0Var2.h = true;
            u0Var2.invalidate();
        }
        s01 s01Var = this.Y5;
        if (s01Var != null) {
            s01Var.setAlpha((int) AndroidUtilities.lerp(0.0f, this.G5[6], clamp01));
        }
        float dp = (((this.Y1 * 100.0f) / 42.0f) * AndroidUtilities.dp(42.0f)) - AndroidUtilities.dp(42.0f);
        this.e0.setTranslationX(this.V.getX() + AndroidUtilities.dp(16.0f) + dp);
        this.e0.setTranslationY(this.V.getY() + AndroidUtilities.dp(-10.0f) + dp);
        this.f0.setTranslationX(this.V.getX() + AndroidUtilities.dp(28.0f) + dp);
        this.f0.setTranslationY(this.V.getY() + AndroidUtilities.dp(26.5f) + dp);
        this.g0.setTranslationX(this.V.getX() + AndroidUtilities.dp(28.0f) + dp);
        this.g0.setTranslationY(this.V.getY() + AndroidUtilities.dp(24.0f) + dp);
        this.h0.setTranslationX(this.V.getX() + AndroidUtilities.dp(28.0f) + dp);
        this.h0.setTranslationY(this.V.getY() + AndroidUtilities.dp(24.0f) + dp);
        float lerp = AndroidUtilities.lerp(1.0f, this.G5[7], clamp01);
        float floor = ((float) Math.floor(this.actionBar.getTranslationY() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f)))) + AndroidUtilities.dp(1.3f);
        float dpf2 = AndroidUtilities.dpf2(22.7f) + floor;
        this.b2 = AndroidUtilities.lerp(floor, this.G5[8], clamp01);
        this.d2 = AndroidUtilities.lerp(dpf2, this.G5[9], clamp01);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.f;
            if (i10 >= k5VarArr.length) {
                break;
            }
            if (k5VarArr[i10] != null) {
                int i11 = i10 * 2;
                float lerp2 = AndroidUtilities.lerp((this.L5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.G5[i11 + 12], clamp01);
                float lerp3 = AndroidUtilities.lerp((this.L5 - AndroidUtilities.dp(109.0f)) + AndroidUtilities.dp(48.0f), this.G5[i11 + 13], clamp01);
                k5VarArr[i10].setTranslationX(lerp2);
                k5VarArr[i10].setTranslationY(this.b2);
                org.telegram.ui.ActionBar.k5[] k5VarArr2 = this.r;
                k5VarArr2[i10].setTranslationX(this.l5 + lerp3);
                k5VarArr2[i10].setTranslationY(this.d2);
                if (i10 == 1) {
                    this.a2 = lerp2;
                    this.c2 = lerp3;
                    this.s.setTranslationX(lerp3);
                    this.s.setTranslationY(this.d2);
                }
                k5VarArr[i10].setScaleX(lerp);
                k5VarArr[i10].setScaleY(lerp);
            }
            i10++;
        }
        V4();
        b5(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        l4((int) this.G5[10], clamp01, true);
        org.telegram.ui.Components.jh0 jh0Var = this.X;
        if (jh0Var != null) {
            jh0Var.setAlpha(AndroidUtilities.lerp(0.0f, this.G5[3], f10));
        }
    }

    public final void x4() {
        TLRPC.User user;
        if (this.b1 == 0 || M3() || (user = getMessagesController().getUser(Long.valueOf(this.b1))) == null || (user instanceof TLRPC.TL_userEmpty)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.b1);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            boolean z4 = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
            if (!AndroidUtilities.isTablet() && z4) {
                NotificationCenter notificationCenter = getNotificationCenter();
                int i10 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(this, i10);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
            }
            int i11 = getArguments().getInt("nearby_distance", -1);
            if (i11 >= 0) {
                bundle.putInt("nearby_distance", i11);
            }
            xn xnVar = new xn(bundle);
            xnVar.y9 = getMediaDataController().getGreetingsSticker();
            xnVar.z9 = false;
            presentFragment(xnVar, z4);
            if (!AndroidUtilities.isTablet() || this.F0) {
                return;
            }
            finishFragment();
        }
    }

    @Override // org.telegram.ui.ug0
    public final sg.d y() {
        return this.k6;
    }

    public final float y3() {
        return Utilities.clamp01((this.N1 - O3()) / U3());
    }

    public final void y4() {
        TLRPC.ChatFull chatFull = this.r2;
        if (chatFull == null || chatFull.linked_chat_id == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.r2.linked_chat_id);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new xn(bundle));
        }
    }

    public final void z3() {
        int i10 = 0;
        this.X1 = this.actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.dp(21.0f));
        this.Y1 = 1.38f;
        this.Z1 = 0.0f;
        N3();
        D4();
        l4(0, 1.0f, true);
        while (true) {
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.f;
            if (i10 >= k5VarArr.length) {
                break;
            }
            if (k5VarArr[i10] != null) {
                float measuredWidth = (this.a.getMeasuredWidth() / 2.0f) - (((k5VarArr[i10].getExactWidth() * 1.12f) * 0.5f) + ((FrameLayout.LayoutParams) r4.getLayoutParams()).leftMargin);
                float measuredWidth2 = (this.a.getMeasuredWidth() / 2.0f) - ((this.r[i10].getExactWidth() * 0.5f) + ((FrameLayout.LayoutParams) r3[i10].getLayoutParams()).leftMargin);
                if (i10 == 1) {
                    this.a2 = measuredWidth;
                    this.c2 = measuredWidth2;
                }
            }
            i10++;
        }
        if (this.G1 != 2) {
            this.r0.setAlpha(1.0f);
        }
        this.V.setAlpha(1.0f);
        this.b0.setAlpha(1.0f);
    }

    public final void z4(boolean z4) {
        TLRPC.TL_businessLocation tL_businessLocation;
        TLRPC.UserFull userFull = this.s2;
        if (userFull == null || (tL_businessLocation = userFull.business_location) == null) {
            return;
        }
        if (tL_businessLocation.geo_point == null || z4) {
            String str = BuildVars.isHuaweiStoreApp() ? "mapapp://navigation" : "http://maps.google.com/maps";
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str + "?q=" + this.s2.business_location.address, new Object[0]))));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        nh.i8 i8Var = new nh.i8(3, 1);
        i8Var.setResourceProvider(this.w0);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.local_id = -1;
        tL_message.peer_id = getMessagesController().getPeer(a());
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_businessLocation tL_businessLocation2 = this.s2.business_location;
        tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
        tL_messageMediaGeo.address = tL_businessLocation2.address;
        tL_message.media = tL_messageMediaGeo;
        i8Var.L0 = false;
        i8Var.u0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
        presentFragment(i8Var);
    }

    public ProfileActivity(Bundle bundle, org.telegram.ui.Components.qu0 qu0Var) {
        super(bundle);
        this.f = new org.telegram.ui.ActionBar.k5[2];
        this.h = null;
        this.n = null;
        this.r = new org.telegram.ui.ActionBar.k5[4];
        this.y = new Drawable[2];
        this.B = new Drawable[2];
        this.D = new org.telegram.ui.Components.j5[2];
        this.E = new org.telegram.ui.Components.j5[2];
        this.F = new Drawable[2];
        this.G = new org.telegram.ui.Components.mr[2];
        this.H = new org.telegram.ui.Components.mr[2];
        this.t0 = null;
        this.u0 = new org.telegram.ui.Components.i50(this, 1);
        this.v0 = new Paint(1);
        this.G0 = new boolean[1];
        this.Y0 = 1.0f;
        this.z1 = new a0.h();
        this.J1 = true;
        this.K1 = false;
        this.L1 = false;
        this.M1 = false;
        this.V1 = new HashMap();
        this.j2 = new float[]{0.0f, 1.0f};
        this.n2 = new Paint();
        this.y2 = -1;
        this.I2 = new Rect();
        this.N4 = new ArrayList();
        this.O4 = new ArrayList();
        this.P4 = 0;
        this.Q4 = true;
        this.R4 = true;
        this.U4 = 0;
        this.V4 = 0;
        this.W4 = 0;
        this.X4 = 0L;
        this.e5 = new HashSet();
        this.g5 = new org.telegram.ui.Cells.c2(this);
        this.h5 = new hz0(this);
        this.x5 = new xd.a(0, new px0(this, 8), org.telegram.ui.Components.nr.h, 380L, true);
        this.D5 = new iz0(this);
        this.F5 = new jz0(this, 0);
        this.G5 = null;
        this.O5 = new SparseIntArray();
        this.Q5 = null;
        this.R5 = -1;
        this.V5 = -1.0f;
        sg.b bVar = new sg.b();
        this.m6 = bVar;
        ng.a aVar = new ng.a(bVar);
        this.n6 = aVar;
        ArrayList arrayList = new ArrayList();
        this.q6 = arrayList;
        RectF rectF = new RectF();
        this.r6 = rectF;
        RectF rectF2 = new RectF();
        this.s6 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.O = qu0Var;
        sg.c cVar = new sg.c();
        cVar.a(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.w0));
        if (Build.VERSION.SDK_INT >= 31) {
            this.j6 = new ng.e(false);
            sg.d dVar = new sg.d(null);
            this.k6 = dVar;
            ng.a aVar2 = new ng.a(dVar);
            this.l6 = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
        } else {
            this.j6 = null;
            this.k6 = null;
            this.l6 = new ng.a(cVar);
        }
        aVar.c = new be.b(true);
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ void P() {
    }
}
