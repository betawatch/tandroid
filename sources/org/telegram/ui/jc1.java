package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.PowerManager;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.EncryptionKeyEmojifier;
import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jc1 implements VoIPService.StateListener, org.telegram.messenger.ls {
    public static jc1 l1;
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public org.telegram.ui.Components.voip.p0 D;
    public boolean D0;
    public TextView E;
    public float E0;
    public org.telegram.ui.Components.voip.h2 F;
    public boolean F0;
    public ic1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public long J0;
    public kg.k K;
    public int L;
    public org.telegram.ui.Components.voip.a2 L0;
    public wg.f1 M;
    public org.telegram.ui.Components.zo M0;
    public e61 N;
    public org.telegram.ui.Components.zo N0;
    public FrameLayout O;
    public ValueAnimator O0;
    public ei.k P;
    public bi.m5 Q;
    public boolean Q0;
    public fi.a5 R;
    public TextView S;
    public org.telegram.ui.ActionBar.n2 T;
    public boolean T0;
    public org.telegram.ui.Components.voip.q U;
    public float U0;
    public float V0;
    public float W0;
    public fc1 X;
    public float X0;
    public org.telegram.ui.Components.voip.n1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.n1 Z;
    public boolean Z0;
    public final int a;
    public boolean a0;
    public float a1;
    public Activity b;
    public TextureViewRenderer b0;
    public float b1;
    public final TLRPC.User c;
    public org.telegram.ui.Components.voip.k2 c0;
    public int c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.k2 d0;
    public int d1;
    public org.telegram.ui.Components.voip.b3 e;
    public org.telegram.ui.Components.voip.e e0;
    public org.telegram.ui.Components.voip.b3 f;
    public boolean f0;
    public boolean f1;
    public View g0;
    public boolean g1;
    public org.telegram.ui.Components.voip.b3 h;
    public View h0;
    public ValueAnimator h1;
    public org.telegram.ui.Components.voip.j1 i0;
    public boolean i1;
    public org.telegram.ui.Components.voip.k2 j1;
    public boolean k1;
    public boolean l0;
    public boolean m0;
    public gc1 n;
    public dc1 n0;
    public int o0;
    public int p0;
    public WindowInsets q0;
    public boolean r0;
    public ec1 s;
    public float s0;
    public cc1 t0;
    public int u0;
    public AccessibilityManager v0;
    public org.telegram.ui.Components.voip.u2 w;
    public org.telegram.ui.Components.voip.r2 x;
    public org.telegram.ui.Components.voip.v2 y;
    public boolean y0;
    public AnimatorSet z0;
    public final org.telegram.ui.Components.voip.i1 r = new org.telegram.ui.Components.voip.i1();
    public final org.telegram.ui.Components.k9[] V = new org.telegram.ui.Components.k9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint j0 = new Paint();
    public final Paint k0 = new Paint();
    public boolean w0 = true;
    public float x0 = 1.0f;
    public final h2.f K0 = new h2.f((int[]) null);
    public final kz0 P0 = new kz0(this, 16);
    public final vb1 R0 = new vb1(this, 12);
    public final vb1 S0 = new vb1(this, 13);
    public float e1 = 1.0f;

    public jc1(int i7) {
        this.a = i7;
        this.c = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(org.telegram.messenger.p10.i(i7).e()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.p0 = -1;
        this.o0 = sharedState.getCallState();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.O4);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.M4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.E2);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.G5);
    }

    public static void a(jc1 jc1Var) {
        jc1 jc1Var2;
        int i7 = 0;
        if (jc1Var.f1) {
            jc1Var.f1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            jc1Var.h1 = ofFloat;
            jc1Var2 = jc1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.h0(jc1Var2, jc1Var.e1, jc1Var.X0, jc1Var.Y0, 1));
            jc1Var2.h1.addListener(new zb1(jc1Var2, i7));
            jc1Var2.h1.setDuration(350L);
            jc1Var2.h1.setInterpolator(org.telegram.ui.Components.wq.f);
            jc1Var2.h1.start();
        } else {
            jc1Var2 = jc1Var;
        }
        jc1Var2.g1 = false;
        jc1Var2.Z0 = false;
    }

    public static void h(int[] iArr, int i7) {
        jc1 jc1Var = l1;
        if (jc1Var != null) {
            if (i7 == 101) {
                if (VoIPService.getSharedState() == null) {
                    jc1Var.t0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    jc1Var.i(new q61(1));
                } else if (!jc1Var.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.y1.h(jc1Var.b, new vb1(jc1Var, 3), i7);
                    return;
                }
            }
            if (i7 == 102) {
                if (VoIPService.getSharedState() == null) {
                    jc1Var.t0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    jc1Var.t();
                }
            }
        }
    }

    public static void n(Activity activity, int i7) {
        jc1 jc1Var = l1;
        if (jc1Var != null && jc1Var.t0.getParent() == null) {
            jc1 jc1Var2 = l1;
            if (jc1Var2 != null) {
                jc1Var2.c0.d.release();
                l1.d0.d.release();
                l1.b0.release();
                cc1 cc1Var = l1.t0;
                if (cc1Var != null) {
                    cc1Var.d();
                }
                l1.c();
            }
            l1 = null;
        }
        if (l1 != null || activity.isFinishing()) {
            return;
        }
        boolean z9 = org.telegram.ui.Components.voip.e2.d() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        jc1 jc1Var3 = new jc1(i7);
        jc1Var3.b = activity;
        l1 = jc1Var3;
        cc1 cc1Var2 = new cc1(activity, !z9, jc1Var3);
        l1.I0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        l1.getClass();
        cc1Var2.setLockOnScreen(l1.I0);
        jc1Var3.t0 = cc1Var2;
        ub1 ub1Var = new ub1(jc1Var3, 3);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(cc1Var2, ub1Var);
        ((WindowManager) activity.getSystemService("window")).addView(cc1Var2, org.telegram.ui.Components.voip.o2.a());
        jc1Var3.s0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        jc1Var3.v0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
        ec1 ec1Var = new ec1(jc1Var3, activity);
        ec1Var.setClipToPadding(false);
        ec1Var.setClipChildren(false);
        ec1Var.setBackgroundColor(-16777216);
        jc1Var3.x();
        jc1Var3.s = ec1Var;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z10 = sharedState != null && sharedState.isConference();
        org.telegram.ui.Components.voip.i1 i1Var = jc1Var3.r;
        jc1Var3.w = new org.telegram.ui.Components.voip.u2(activity, z10, i1Var);
        org.telegram.ui.Components.voip.k2 k2Var = new org.telegram.ui.Components.voip.k2(activity, false, true, false, false);
        jc1Var3.c0 = k2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        k2Var.d.setScalingType(scalingType);
        jc1Var3.c0.d.setEnableHardwareScaler(true);
        jc1Var3.c0.d.setRotateTextureWithScreen(true);
        jc1Var3.c0.a0 = 1;
        ec1Var.addView(jc1Var3.w, c8.ha.c(-1.0f, -1));
        TLRPC.User user = jc1Var3.d;
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(activity, user, i1Var);
        jc1Var3.x = r2Var;
        ec1Var.addView(r2Var, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.voip.v2 v2Var = new org.telegram.ui.Components.voip.v2(activity);
        if (org.telegram.messenger.sc.e(512)) {
            int i10 = org.telegram.ui.ActionBar.m6.a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.get(12);
            calendar.get(11);
            if ((i11 == 11 && i12 >= 24 && i12 <= 31) || (i11 == 0 && i12 == 1)) {
                v2Var.a = new org.telegram.ui.Components.du0(0);
            }
        }
        jc1Var3.y = v2Var;
        ec1Var.addView(v2Var, c8.ha.c(220.0f, -1));
        ec1Var.addView(jc1Var3.c0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new org.telegram.ui.Components.j9(orientation, new int[]{-14994098, -14328963}).f(org.telegram.ui.Components.m.x(0.5f, 1), new g71(jc1Var3, 1), 0L);
        org.telegram.ui.Components.voip.n1 n1Var = new org.telegram.ui.Components.voip.n1(activity);
        jc1Var3.Y = n1Var;
        n1Var.setDelegate(new ub1(jc1Var3, 2));
        jc1Var3.Y.d(1.0f, 1.0f);
        jc1Var3.a0 = true;
        org.telegram.ui.Components.voip.k2 k2Var2 = new org.telegram.ui.Components.voip.k2(activity, true, false);
        jc1Var3.d0 = k2Var2;
        k2Var2.d.setIsCamera(true);
        jc1Var3.d0.d.setUseCameraRotation(true);
        jc1Var3.Y.setOnTapListener(new wb1(jc1Var3, 1));
        jc1Var3.d0.d.setMirror(true);
        jc1Var3.Y.addView(jc1Var3.d0);
        org.telegram.ui.Components.voip.n1 n1Var2 = new org.telegram.ui.Components.voip.n1(activity);
        jc1Var3.Z = n1Var2;
        n1Var2.S = true;
        n1Var2.c(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        jc1Var3.b0 = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        jc1Var3.b0.setIsCamera(false);
        jc1Var3.b0.setFpsReduction(30.0f);
        jc1Var3.b0.setScalingType(scalingType);
        jc1Var3.Z.addView(jc1Var3.b0, c8.ha.e(-1, -2, 17));
        jc1Var3.Z.setOnTapListener(new wb1(jc1Var3, 2));
        jc1Var3.Z.setVisibility(8);
        ec1Var.addView(jc1Var3.Y, c8.ha.c(-2.0f, -2));
        ec1Var.addView(jc1Var3.Z);
        View view = new View(activity);
        jc1Var3.g0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.o(-16777216, org.telegram.messenger.qs.L1)}));
        ec1Var.addView(jc1Var3.g0, c8.ha.e(-1, org.telegram.messenger.qs.q2, 80));
        View view2 = new View(activity);
        jc1Var3.h0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{i0.a.o(-16777216, org.telegram.messenger.qs.n1), 0}));
        ec1Var.addView(jc1Var3.h0, c8.ha.e(-1, org.telegram.messenger.qs.q2, 48));
        e61 e61Var = new e61(22, activity, jc1Var3);
        jc1Var3.N = e61Var;
        e61Var.setOrientation(0);
        jc1Var3.N.setPadding(0, 0, 0, org.telegram.messenger.g0.L(30.0f));
        jc1Var3.N.setClipToPadding(false);
        jc1Var3.N.setContentDescription(org.telegram.messenger.id.M0(2131743302, null));
        jc1Var3.N.setOnClickListener(new wb1(jc1Var3, 3));
        jc1Var3.P = new ei.k(activity, i1Var);
        FrameLayout frameLayout = new FrameLayout(activity);
        jc1Var3.O = frameLayout;
        frameLayout.addView(jc1Var3.P, c8.ha.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        jc1Var3.O.setVisibility(8);
        jc1Var3.O.setOnClickListener(new wb1(jc1Var3, 4));
        fi.a5 a5Var = new fi.a5(activity, i1Var);
        jc1Var3.R = a5Var;
        a5Var.setOrientation(1);
        TextView textView = new TextView(activity);
        jc1Var3.S = textView;
        textView.setText(org.telegram.messenger.id.M0(2131743491, null));
        jc1Var3.S.setTextSize(1, 15.0f);
        jc1Var3.S.setTypeface(org.telegram.messenger.g0.o());
        jc1Var3.S.setTextColor(-1);
        jc1Var3.S.setGravity(17);
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(8, activity, jc1Var3);
        jc1Var3.T = n2Var;
        n2Var.setTextSize(1, 15.0f);
        jc1Var3.T.setTextColor(-1);
        jc1Var3.T.setGravity(17);
        jc1Var3.T.setText(org.telegram.messenger.id.a0("CallEmojiKeyTooltip", null, 2131752627, TextUtils.ellipsize(org.telegram.messenger.t10.j(user, true), jc1Var3.T.getPaint(), org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END)));
        jc1Var3.R.setVisibility(8);
        jc1Var3.R.addView(jc1Var3.S);
        jc1Var3.R.addView(jc1Var3.T, c8.ha.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        jc1Var3.R.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
        int i13 = 0;
        while (i13 < 4) {
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(activity);
            org.telegram.ui.Components.k9[] k9VarArr = jc1Var3.V;
            k9VarArr[i13] = k9Var;
            k9VarArr[i13].getImageReceiver().R0 = true;
            jc1Var3.N.addView(k9VarArr[i13], c8.ha.k(i13 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i13++;
        }
        fc1 fc1Var = new fc1(jc1Var3, activity);
        jc1Var3.X = fc1Var;
        fc1Var.setOrientation(1);
        jc1Var3.X.setFocusable(true);
        jc1Var3.X.setFocusableInTouchMode(true);
        jc1Var3.D = new org.telegram.ui.Components.voip.p0(activity);
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        v8Var.r(user);
        org.telegram.ui.Components.voip.p0 p0Var = jc1Var3.D;
        int i14 = jc1Var3.a;
        p0Var.b.j(org.telegram.messenger.hc.m(i14, 0, user), null, v8Var, user);
        jc1Var3.D.setRoundRadius(org.telegram.messenger.g0.L(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        jc1Var3.E = textView2;
        textView2.setTextSize(1, 28.0f);
        jc1Var3.E.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g5.m(0, user.first_name, user.last_name), jc1Var3.E.getPaint().getFontMetricsInt(), false, null, 0));
        jc1Var3.E.setMaxLines(2);
        jc1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
        jc1Var3.E.setTextColor(-1);
        jc1Var3.E.setGravity(1);
        jc1Var3.E.setImportantForAccessibility(2);
        jc1Var3.X.addView(jc1Var3.E, c8.ha.t(-2, -2, 1, 8, 0, 8, 6));
        org.telegram.ui.Components.voip.h2 h2Var = new org.telegram.ui.Components.voip.h2(activity);
        h2Var.a = new TextView[2];
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            h2Var.a[i15] = new TextView(activity);
            h2Var.a[i15].setTextSize(1, 15.0f);
            h2Var.a[i15].setTextColor(-1);
            h2Var.a[i15].setGravity(1);
            h2Var.addView(h2Var.a[i15]);
            i15++;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        h2Var.c = frameLayout2;
        org.telegram.ui.Components.voip.x0 x0Var = new org.telegram.ui.Components.voip.x0(h2Var, activity, i1Var);
        x0Var.setTextSize(1, 15.0f);
        x0Var.setTextColor(-1);
        x0Var.setGravity(1);
        x0Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f));
        x0Var.setText(org.telegram.messenger.id.M0(2131743217, null));
        frameLayout2.addView(x0Var, c8.ha.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        h2Var.addView(frameLayout2, c8.ha.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        h2Var.b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        h2Var.addView(textView3, c8.ha.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131743253, null));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new kg.o1(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        org.telegram.ui.Components.voip.l2 l2Var = new org.telegram.ui.Components.voip.l2(activity);
        h2Var.d = l2Var;
        h2Var.addView(l2Var, c8.ha.c(-2.0f, -1));
        jc1Var3.F = h2Var;
        WeakHashMap weakHashMap2 = r0.i0.a;
        h2Var.setImportantForAccessibility(4);
        jc1Var3.X.addView(jc1Var3.F, c8.ha.t(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            ic1 ic1Var = new ic1(activity);
            jc1Var3.G = ic1Var;
            long j3 = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i17 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null || i17 > 0) {
                int max = Math.max(i17, groupParticipants == null ? 0 : groupParticipants.size());
                int min = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
                org.telegram.ui.Components.x8 x8Var = ic1Var.b;
                x8Var.i(min);
                int i18 = 0;
                while (i18 < min) {
                    x8Var.j(i18, i14, org.telegram.messenger.qp.s1(i14).e2(org.telegram.messenger.m5.o(groupParticipants.get(i18).peer)));
                    i18++;
                    j3 = j3;
                }
                long j10 = j3;
                x8Var.a(false, true);
                if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && org.telegram.messenger.m5.o(groupParticipants.get(0).peer) == j10))) {
                    ic1Var.setVisibility(8);
                } else {
                    ic1Var.c = new org.telegram.ui.Components.my0(org.telegram.messenger.id.H(',', "Participants", max), 14.0f, org.telegram.messenger.g0.o());
                    ic1Var.setVisibility(0);
                    ic1Var.invalidate();
                }
            } else {
                ic1Var.setVisibility(8);
            }
            jc1Var3.X.addView(jc1Var3.G, c8.ha.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        jc1Var3.X.setClipChildren(false);
        jc1Var3.X.setClipToPadding(false);
        jc1Var3.X.setPadding(0, 0, 0, org.telegram.messenger.g0.L(15.0f));
        jc1Var3.U = new org.telegram.ui.Components.voip.q(activity);
        jc1Var3.Q = new bi.m5(activity, i1Var);
        jc1Var3.U.setAlpha(0.0f);
        jc1Var3.Q.setVisibility(8);
        ec1Var.addView(jc1Var3.D, c8.ha.d(org.telegram.messenger.qs.i3, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        ec1Var.addView(jc1Var3.X, c8.ha.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        ec1Var.addView(jc1Var3.O, c8.ha.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        ec1Var.addView(jc1Var3.R, c8.ha.d(org.telegram.messenger.qs.b5, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        ec1Var.addView(jc1Var3.N, c8.ha.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        ec1Var.addView(jc1Var3.U, c8.ha.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        ec1Var.addView(jc1Var3.Q, c8.ha.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        jc1Var3.i0 = new org.telegram.ui.Components.voip.j1(activity);
        jc1Var3.e = new org.telegram.ui.Components.voip.b3(activity, i1Var);
        jc1Var3.f = new org.telegram.ui.Components.voip.b3(activity, i1Var);
        jc1Var3.h = new org.telegram.ui.Components.voip.b3(activity, i1Var);
        jc1Var3.n = new gc1(activity, 52.0f);
        jc1Var3.e.setTranslationY(org.telegram.messenger.g0.L(100.0f));
        jc1Var3.e.setScaleX(0.0f);
        jc1Var3.e.setScaleY(0.0f);
        jc1Var3.e.animate().setStartDelay(org.telegram.messenger.qs.g2).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        jc1Var3.f.setTranslationY(org.telegram.messenger.g0.L(100.0f));
        jc1Var3.f.setScaleX(0.0f);
        jc1Var3.f.setScaleY(0.0f);
        jc1Var3.f.animate().setStartDelay(org.telegram.messenger.qs.w2).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        jc1Var3.h.setTranslationY(org.telegram.messenger.g0.L(100.0f));
        jc1Var3.h.setScaleX(0.0f);
        jc1Var3.h.setScaleY(0.0f);
        jc1Var3.h.animate().setStartDelay(org.telegram.messenger.qs.M2).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        jc1Var3.n.setTranslationY(org.telegram.messenger.g0.L(100.0f));
        jc1Var3.n.setScaleX(0.0f);
        jc1Var3.n.setScaleY(0.0f);
        jc1Var3.n.animate().setStartDelay(org.telegram.messenger.qs.c3).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        jc1Var3.i0.addView(jc1Var3.e);
        jc1Var3.i0.addView(jc1Var3.f);
        jc1Var3.i0.addView(jc1Var3.h);
        jc1Var3.i0.addView(jc1Var3.n);
        org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
        jc1Var3.e0 = eVar;
        eVar.setListener(new hc1(jc1Var3));
        jc1Var3.e0.setScaleX(1.15f);
        jc1Var3.e0.setScaleY(1.15f);
        ec1Var.addView(jc1Var3.i0, c8.ha.e(-1, -2, 80));
        float f10 = org.telegram.messenger.g0.Q1() ? 100 : 27;
        ec1Var.addView(jc1Var3.e0, c8.ha.d(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(activity);
        jc1Var3.I = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.m6.h0(i0.a.o(-1, 76), 1, -1));
        jc1Var3.I.setImageResource(R.drawable.msg_addcontact);
        jc1Var3.I.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        ec1Var.addView(jc1Var3.I, c8.ha.e(56, 56, 53));
        c8.ka.a(jc1Var3.I);
        ImageView imageView2 = new ImageView(activity);
        jc1Var3.H = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.m6.h0(i0.a.o(-1, 76), 1, -1));
        jc1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
        jc1Var3.H.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        jc1Var3.H.setContentDescription(org.telegram.messenger.id.M0(2131753756, null));
        ec1Var.addView(jc1Var3.H, c8.ha.e(56, 56, 51));
        c8.ka.a(jc1Var3.H);
        int i19 = 6;
        kg.k kVar = new kg.k(activity, i19);
        jc1Var3.K = kVar;
        kVar.setContentDescription(org.telegram.messenger.id.M0(2131743239, null));
        jc1Var3.K.setBackground(org.telegram.ui.ActionBar.m6.h0(i0.a.o(-1, 76), 1, -1));
        jc1Var3.K.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        ec1Var.addView(jc1Var3.K, c8.ha.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        jc1Var3.K.setAlpha(0.0f);
        jc1Var3.K.setOnClickListener(new wb1(jc1Var3, 5));
        jc1Var3.H.setOnClickListener(new wb1(jc1Var3, i19));
        jc1Var3.I.setOnClickListener(new ik0(15, jc1Var3, activity));
        if (jc1Var3.t0.b) {
            jc1Var3.H.setVisibility(8);
            jc1Var3.I.setVisibility(8);
        }
        org.telegram.ui.Components.voip.a2 a2Var = new org.telegram.ui.Components.voip.a2(activity);
        a2Var.a = new HashMap();
        a2Var.b = new ArrayList();
        a2Var.c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        a2Var.r = textPaint;
        a2Var.setOrientation(1);
        a2Var.n = i1Var;
        TransitionSet transitionSet = new TransitionSet();
        a2Var.d = transitionSet;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.i0(3).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        jc1Var3.L0 = a2Var;
        a2Var.setGravity(80);
        jc1Var3.L0.setOnViewsUpdated(new vb1(jc1Var3, 5));
        ec1Var.addView(jc1Var3.L0, c8.ha.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(activity, 3, i1Var, true);
        zoVar.r(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        zoVar.K = alignment;
        zoVar.d = -1L;
        zoVar.q0 = new vb1(jc1Var3, i19);
        zoVar.T = true;
        zoVar.h = org.telegram.messenger.g0.L(320.0f);
        zoVar.e = true;
        zoVar.n(10.0f, 6.0f, 10.0f, 6.0f);
        zoVar.s(8.0f);
        jc1Var3.M0 = zoVar;
        zoVar.u(org.telegram.messenger.id.M0(2131744254, null));
        ec1Var.addView(jc1Var3.M0, c8.ha.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.zo zoVar2 = new org.telegram.ui.Components.zo(activity, 1, i1Var, false);
        zoVar2.r(true);
        zoVar2.K = alignment;
        zoVar2.d = 4000L;
        zoVar2.T = true;
        zoVar2.h = org.telegram.messenger.g0.L(320.0f);
        zoVar2.e = true;
        zoVar2.n(10.0f, 6.0f, 10.0f, 6.0f);
        zoVar2.s(8.0f);
        jc1Var3.N0 = zoVar2;
        zoVar2.u(org.telegram.messenger.id.M0(2131743302, null));
        ec1Var.addView(jc1Var3.N0, c8.ha.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        jc1Var3.y();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!jc1Var3.T0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                jc1Var3.T0 = phoneCall != null && phoneCall.video;
            }
            jc1Var3.f();
        }
        cc1Var2.addView(ec1Var);
        if (z9) {
            jc1Var3.E0 = 0.0f;
            jc1Var3.H0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                jc1Var3.c0.setStub(org.telegram.ui.Components.voip.e2.d().s);
                jc1Var3.d0.setStub(org.telegram.ui.Components.voip.e2.d().r);
            }
            jc1Var3.t0.setAlpha(0.0f);
            jc1Var3.y();
            jc1Var3.D0 = true;
            org.telegram.ui.Components.voip.e2.S = true;
            if (org.telegram.ui.Components.voip.e2.U != null) {
                org.telegram.ui.Components.voip.e2.T.getClass();
                throw null;
            }
            jc1Var3.K0.d();
            org.telegram.messenger.g0.i3(new vb1(jc1Var3, 11), 32L);
        } else {
            jc1Var3.E0 = 1.0f;
            jc1Var3.x();
        }
        org.telegram.ui.Components.voip.f2.d();
    }

    public final ValueAnimator b(boolean z9) {
        char c10;
        float f10;
        float measuredWidth;
        final float measuredHeight;
        final float f11;
        final boolean z10;
        float f12;
        float f13;
        float f14;
        boolean z11;
        float f15;
        this.Y.animate().cancel();
        float f16 = org.telegram.ui.Components.voip.e2.d().d.x + org.telegram.ui.Components.voip.e2.d().E;
        float f17 = org.telegram.ui.Components.voip.e2.d().d.y + org.telegram.ui.Components.voip.e2.d().F;
        final float x10 = this.Y.getX();
        final float y10 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.e2.T.getClass();
        final float measuredWidth2 = f16 - ((this.c0.getMeasuredWidth() - (this.c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f17 - ((this.c0.getMeasuredHeight() - (this.c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f18 = 1.0f;
        if (this.l0) {
            int measuredWidth3 = this.Y.getMeasuredWidth();
            if (!this.m0 || measuredWidth3 == 0) {
                c10 = 0;
                f10 = 4.0f;
                measuredWidth = 1.0f;
                f14 = 1.0f;
                z11 = false;
                f15 = 0.0f;
            } else {
                f15 = (this.t0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c10 = 0;
                f10 = 4.0f;
                measuredWidth = org.telegram.ui.Cells.f1.x(org.telegram.ui.Components.voip.e2.d().f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.e2.d().f * 0.25f) + (f16 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f15)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
                f14 = org.telegram.ui.Cells.f1.x(org.telegram.ui.Components.voip.e2.d().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.e2.d().h * 0.25f) + (f17 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f15)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
                z11 = true;
            }
            measuredHeight = f14;
            z10 = z11;
            f11 = f15;
        } else {
            c10 = 0;
            f10 = 4.0f;
            measuredWidth = f16 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f17 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
            f11 = 0.25f;
            z10 = true;
        }
        final float f19 = measuredWidth;
        final float L = this.l0 ? org.telegram.messenger.g0.L(f10) : 0.0f;
        final float L2 = (org.telegram.messenger.g0.L(f10) * 1.0f) / f11;
        if (this.l0) {
            org.telegram.ui.Components.voip.e2.T.getClass();
            f12 = 1.0f;
            f18 = 0.0f;
        } else {
            f12 = 1.0f;
        }
        float f20 = f12;
        if (z9) {
            if (z10) {
                this.Y.setScaleX(f11);
                this.Y.setScaleY(f11);
                this.Y.setTranslationX(f19);
                this.Y.setTranslationY(measuredHeight);
                this.Y.setCornerRadius(L2);
                this.Y.setAlpha(f18);
            }
            this.c0.setScaleX(0.25f);
            this.c0.setScaleY(0.25f);
            this.c0.setTranslationX(measuredWidth2);
            this.c0.setTranslationY(measuredHeight2);
            f13 = 0.25f;
            this.c0.setRoundCorners((org.telegram.messenger.g0.L(6.0f) * f20) / 0.25f);
        } else {
            f13 = 0.25f;
        }
        float f21 = z9 ? f20 : 0.0f;
        float f22 = z9 ? 0.0f : f20;
        float[] fArr = new float[2];
        fArr[c10] = f21;
        fArr[1] = f22;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.E0 = z9 ? 0.0f : f20;
        x();
        final float f23 = f13;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.yb1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f24 = 1.0f - floatValue;
                jc1 jc1Var = jc1.this;
                jc1Var.E0 = f24;
                jc1Var.x();
                if (z10) {
                    float f25 = (f11 * floatValue) + (scaleX * f24);
                    jc1Var.Y.setScaleX(f25);
                    jc1Var.Y.setScaleY(f25);
                    jc1Var.Y.setTranslationX((f19 * floatValue) + (x10 * f24));
                    jc1Var.Y.setTranslationY((measuredHeight * floatValue) + (y10 * f24));
                    jc1Var.Y.setCornerRadius((L2 * floatValue) + (L * f24));
                    jc1Var.Y.setAlpha((f18 * floatValue) + (1.0f * f24));
                }
                float f26 = (f23 * floatValue) + (1.0f * f24);
                jc1Var.c0.setScaleX(f26);
                jc1Var.c0.setScaleY(f26);
                float f27 = 0.0f * f24;
                float f28 = (measuredWidth2 * floatValue) + f27;
                float f29 = (measuredHeight2 * floatValue) + f27;
                jc1Var.c0.setTranslationX(f28);
                jc1Var.c0.setTranslationY(f29);
                jc1Var.c0.setRoundCorners(((org.telegram.messenger.g0.L(4.0f) * floatValue) * 1.0f) / f26);
                if (!jc1Var.Y.P) {
                    jc1Var.d0.d(false, floatValue);
                }
                jc1Var.t0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void c() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.O4);
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.M4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.E2);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.G5);
        wg.f1 f1Var = this.M;
        if (f1Var != null) {
            f1Var.dismiss();
            this.M = null;
        }
    }

    public final void d(boolean z9) {
        ValueAnimator ofFloat;
        if (this.A0 && this.B0 != z9 && this.w0) {
            this.B0 = z9;
            org.telegram.ui.Components.voip.r2 r2Var = this.x;
            int i7 = 1;
            if (r2Var.K && z9 != r2Var.E) {
                r2Var.E = z9;
                float[] fArr = {1.0f, 0.0f};
                if (z9) {
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                r2Var.c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.q2(r2Var, i7));
                r2Var.c.setInterpolator(org.telegram.ui.Components.wq.f);
                r2Var.c.setDuration(200L);
                r2Var.c.start();
            }
            if (z9) {
                int i10 = org.telegram.messenger.iz.f1;
                if (i10 < 2) {
                    org.telegram.messenger.iz.f1 = i10 + 2;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.iz.f1);
                    edit.apply();
                }
                this.N0.f(true);
                org.telegram.messenger.g0.r(this.R0);
                this.Q0 = false;
                if (this.D.getVisibility() == 0) {
                    this.D.animate().setStartDelay(0L).translationY(org.telegram.messenger.g0.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.wq.f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.wq.g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(org.telegram.messenger.g0.L(140.0f));
                org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f;
                org.telegram.messenger.camera.q.l(translationY, wqVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-org.telegram.messenger.g0.L(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new zb1(this, 3)).setInterpolator(wqVar).start();
            } else {
                if (this.D.getVisibility() == 0) {
                    this.D.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.wq.f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.wq wqVar2 = org.telegram.ui.Components.wq.f;
                duration.setInterpolator(wqVar2).setListener(new org.telegram.ui.Components.s9(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(wqVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.g0.L(120.0f)).setListener(new zb1(this, 4)).setDuration(250L).setInterpolator(wqVar2).start();
            }
            this.p0 = this.o0;
            y();
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.M4) {
            if (this.o0 != 17 || VoIPService.getSharedInstance() == null) {
                return;
            }
            this.d0.d.release();
            this.c0.d.release();
            this.b0.release();
            f();
            VoIPService.getSharedInstance().registerStateListener(this);
            return;
        }
        if (i7 == org.telegram.messenger.qs.i4) {
            v(true);
            return;
        }
        if (i7 == org.telegram.messenger.qs.E2) {
            this.t0.b();
            return;
        }
        if (i7 == org.telegram.messenger.qs.O4) {
            this.D.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
            return;
        }
        if (i7 == org.telegram.messenger.qs.G5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f0 = booleanValue;
            if (booleanValue) {
                this.D.b(true, true);
            }
        }
    }

    public final void e() {
        this.t0.b();
    }

    public final void f() {
        this.d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ac1(this));
        this.c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new bc1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void g() {
        if (this.F0 || this.D0) {
            return;
        }
        dc1 dc1Var = this.n0;
        if (dc1Var != null) {
            dc1Var.a(false, false);
            return;
        }
        if (this.l0 && this.m0 && this.G0) {
            this.G0 = false;
            this.Y.setRelativePosition(this.Z);
            this.a0 = false;
            this.p0 = this.o0;
            y();
            return;
        }
        if (this.B0) {
            d(false);
            return;
        }
        if (this.R.getVisibility() != 8) {
            return;
        }
        if (!this.C0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isConverting()) {
            this.t0.b();
            return;
        }
        if (this.F0 || l1 == null) {
            return;
        }
        this.F0 = true;
        if (VoIPService.getSharedInstance() != null) {
            int measuredHeight = l1.t0.getMeasuredHeight();
            jc1 jc1Var = l1;
            org.telegram.ui.Components.voip.e2.f(jc1Var.b, jc1Var.a, jc1Var.t0.getMeasuredWidth(), measuredHeight, 1);
            WindowInsets windowInsets = l1.q0;
            if (windowInsets != null) {
                org.telegram.ui.Components.voip.e2.V = windowInsets.getSystemWindowInsetTop();
                l1.q0.getSystemWindowInsetBottom();
            }
        }
        if (org.telegram.ui.Components.voip.e2.d() == null) {
            return;
        }
        ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f;
        duration.setInterpolator(wqVar).start();
        this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(wqVar).start();
        this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(wqVar).start();
        this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(wqVar).start();
        this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(wqVar).start();
        this.i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(wqVar).start();
        this.g0.animate().alpha(0.0f).setDuration(350L).setInterpolator(wqVar).start();
        this.h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(wqVar).start();
        this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(wqVar).start();
        this.L0.animate().alpha(0.0f).setDuration(350L).setInterpolator(wqVar).start();
        org.telegram.ui.Components.voip.e2.S = true;
        this.D0 = true;
        ValueAnimator b10 = b(false);
        this.K0.d();
        b10.addListener(new zb1(this, 1));
        b10.setDuration(350L);
        b10.setInterpolator(wqVar);
        b10.start();
    }

    public final void i(Runnable runnable) {
        if (this.f.getVisibility() == 0) {
            this.e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.e0;
            ValueAnimator valueAnimator = eVar.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f.animate().cancel();
        this.e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.e0;
        ValueAnimator valueAnimator2 = eVar2.b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.b0 = null;
            eVar2.U.stop();
        }
        this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, org.telegram.messenger.id.M0(2131743411, null), false, false);
        this.e.d(5, false, false);
        this.h.d(1, false, false);
        this.f.d(3, true, false);
        this.n.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        this.f.setVisibility(0);
        this.n.setAlpha(0.0f);
        this.e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        org.telegram.messenger.g0.L(52.0f);
        final int L = org.telegram.messenger.g0.L(24.0f);
        final int L2 = org.telegram.messenger.g0.L(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.xb1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                jc1 jc1Var = jc1.this;
                jc1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                jc1Var.e0.setTranslationY(L2 * floatValue);
                int i7 = (int) (marginEnd - ((r1 + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i7;
                marginLayoutParams2.rightMargin = i7;
                jc1Var.e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, (Property<org.telegram.ui.Components.voip.e, Float>) View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, (Property<org.telegram.ui.Components.voip.e, Float>) View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, (Property<org.telegram.ui.Components.voip.e, Float>) View.ALPHA, eVar5.getAlpha(), this.e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.v50(17, this, runnable));
        animatorSet.start();
        org.telegram.messenger.g0.i3(new vb1(this, 7), 133L);
    }

    public final void j(org.telegram.ui.Components.voip.b3 b3Var, VoIPService voIPService) {
        if (!this.m0) {
            b3Var.d(2, false, false);
            b3Var.setOnBtnClickedListener(null);
            b3Var.setEnabled(false);
        } else {
            b3Var.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                b3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
            } else {
                b3Var.d(2, voIPService.isSwitchingCamera(), false);
            }
            b3Var.setOnBtnClickedListener(new a7(this, voIPService, b3Var, 23));
        }
    }

    public final void k(org.telegram.ui.Components.voip.b3 b3Var, VoIPService voIPService, boolean z9) {
        b3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.n1 n1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        if (z9) {
            ValueAnimator valueAnimator = n1Var.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(n1Var.K, isMicMute ? 1.0f : 0.0f);
            n1Var.f0 = ofFloat;
            ofFloat.addUpdateListener(n1Var.g0);
            n1Var.f0.setDuration(150L);
            n1Var.f0.start();
        } else {
            ValueAnimator valueAnimator2 = n1Var.f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            n1Var.K = isMicMute ? 1.0f : 0.0f;
            n1Var.invalidate();
        }
        b3Var.setOnBtnClickedListener(new ub1(this, 4));
    }

    public final void l(org.telegram.ui.Components.voip.b3 b3Var, VoIPService voIPService) {
        int i7;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i10 = 0;
        if (voIPService.isBluetoothOn()) {
            b3Var.d(4, false, false);
            i10 = 2;
        } else {
            if (!voipAudioManager.isSpeakerphoneOn()) {
                b3Var.d(5, false, false);
                i7 = 1;
                b3Var.setEnabled(true);
                b3Var.setOnBtnClickedListener(new bg.f0(this, i7, b3Var, voIPService, 9));
            }
            b3Var.d(5, true, false);
        }
        i7 = i10;
        b3Var.setEnabled(true);
        b3Var.setOnBtnClickedListener(new bg.f0(this, i7, b3Var, voIPService, 9));
    }

    public final void m(org.telegram.ui.Components.voip.b3 b3Var, VoIPService voIPService, boolean z9) {
        if (!((this.m0 || this.l0) ? true : voIPService.isVideoAvailable())) {
            b3Var.d(3, true, false);
            b3Var.setOnClickListener(null);
            b3Var.setEnabled(false);
            return;
        }
        if (!this.m0) {
            b3Var.d(3, true, z9);
        } else if (voIPService.isScreencast()) {
            b3Var.d(3, false, z9);
        } else {
            b3Var.d(3, false, z9);
        }
        b3Var.setOnBtnClickedListener(new ub1(this, 5));
        b3Var.setEnabled(true);
    }

    public final void o(boolean z9, boolean z10) {
        boolean z11 = (this.m0 || this.l0) ? false : true;
        if (!z9) {
            this.D.animate().setListener(null).cancel();
            this.D.setTranslationY(0.0f);
            this.D.setAlpha(1.0f);
            this.D.setScaleX(1.0f);
            this.D.setScaleY(1.0f);
            this.D.setVisibility(z11 ? 0 : 8);
        } else if (z11 && this.D.getTag() == null) {
            this.D.animate().setListener(null).cancel();
            this.D.setVisibility(0);
            if (this.B0) {
                if (z10) {
                    this.D.setAlpha(0.0f);
                    this.D.setTranslationY(org.telegram.messenger.g0.L(48.0f));
                    this.D.setScaleX(0.1f);
                    this.D.setScaleY(0.1f);
                }
            } else if (z10) {
                this.D.setAlpha(0.0f);
                this.D.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.wq.f).start();
            } else {
                this.D.setAlpha(0.0f);
                this.D.setTranslationY(-org.telegram.messenger.g0.L(135.0f));
                this.D.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.wq.f).start();
            }
        } else if (!z11 && this.D.getTag() != null) {
            this.D.animate().setListener(null).cancel();
            this.D.setTranslationY(0.0f);
            this.D.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.wq.f).setListener(new zb1(this, 8)).start();
        }
        this.D.setTag(z11 ? 1 : null);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        u(true);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z9) {
        this.p0 = this.o0;
        y();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i7, int i10) {
        this.p0 = this.o0;
        if (i10 == 2 && !this.T0) {
            this.T0 = true;
        }
        org.telegram.ui.Components.voip.f2.d();
        y();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.ui.Components.voip.u2 u2Var;
        if (i7 > 0) {
            this.i1 = true;
        }
        if (this.F == null || (u2Var = this.w) == null) {
            return;
        }
        int i10 = u2Var.V;
        if ((i10 == 2 || i10 == 3) && this.i1) {
            org.telegram.messenger.g0.i3(new org.telegram.ui.Components.q2(this, i7, 27), 400L);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i7) {
        int i10 = this.o0;
        if (i10 != i7) {
            this.p0 = i10;
            this.o0 = i7;
            if (this.t0 != null) {
                y();
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z9) {
        this.p0 = this.o0;
        if (z9 && !this.T0) {
            this.T0 = true;
        }
        y();
    }

    public final void p(CharSequence charSequence) {
        TextView textView;
        if (this.b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3(0, this.b, null);
        boolean[] zArr = new boolean[3];
        m3Var.R = org.telegram.messenger.id.M0(2131743408, null);
        m3Var.T = charSequence;
        m3Var.l0 = org.telegram.messenger.id.M0(2131747831, null);
        m3Var.m0 = null;
        m3Var.show();
        for (int i7 = 0; i7 < 3; i7++) {
            if (zArr[i7] && (textView = (TextView) m3Var.d(-(i7 + 1))) != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, m3Var.i1);
            }
        }
        m3Var.setCanceledOnTouchOutside(true);
        m3Var.setOnDismissListener(new q5(this, 18));
    }

    public final void q(int i7, boolean z9) {
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.w0);
        }
        if (!z9 && (animatorSet = this.z0) != null) {
            animatorSet.removeAllListeners();
            this.z0.cancel();
        }
        if (i7 != 0) {
            boolean z10 = (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() == 0) ? false : z9;
            if (!z9) {
                this.Y.setVisibility(0);
            } else if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 0) {
                if (this.Y.getVisibility() == 8) {
                    this.Y.setAlpha(0.0f);
                    this.Y.setScaleX(0.7f);
                    this.Y.setScaleY(0.7f);
                    this.Y.setVisibility(0);
                }
                AnimatorSet animatorSet2 = this.z0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.z0.cancel();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.n1, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.n1, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.n1, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.z0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.n1 n1Var = this.Y;
                if (n1Var.D < 0.0f) {
                    n1Var.d(1.0f, 1.0f);
                    this.a0 = true;
                }
            }
            this.Y.c(i7 == 2, z10);
            this.a0 = i7 != 2;
        } else if (!z9) {
            this.Y.setVisibility(8);
        } else if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() != 0) {
            AnimatorSet animatorSet4 = this.z0;
            if (animatorSet4 != null) {
                animatorSet4.removeAllListeners();
                this.z0.cancel();
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            org.telegram.ui.Components.voip.n1 n1Var2 = this.Y;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(n1Var2, (Property<org.telegram.ui.Components.voip.n1, Float>) View.ALPHA, n1Var2.getAlpha(), 0.0f));
            if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 2) {
                org.telegram.ui.Components.voip.n1 n1Var3 = this.Y;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n1Var3, (Property<org.telegram.ui.Components.voip.n1, Float>) View.SCALE_X, n1Var3.getScaleX(), 0.7f);
                org.telegram.ui.Components.voip.n1 n1Var4 = this.Y;
                animatorSet5.playTogether(ofFloat, ObjectAnimator.ofFloat(n1Var4, (Property<org.telegram.ui.Components.voip.n1, Float>) View.SCALE_Y, n1Var4.getScaleX(), 0.7f));
            }
            this.z0 = animatorSet5;
            animatorSet5.addListener(new zb1(this, 7));
            this.z0.setDuration(250L).setInterpolator(org.telegram.ui.Components.wq.f);
            this.z0.setStartDelay(50L);
            this.z0.start();
        }
        this.Y.setTag(Integer.valueOf(i7));
    }

    public final void r(boolean z9) {
        int i7;
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        kz0 kz0Var = this.P0;
        if (z9 || !this.w0) {
            if (z9 && !this.w0) {
                this.M0.f(true);
                this.N0.f(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f;
                translationY.setInterpolator(wqVar).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(wqVar).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wqVar).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wqVar).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wqVar).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wqVar).start();
                this.i0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wqVar).start();
                this.g0.animate().alpha(1.0f).setDuration(150L).setInterpolator(wqVar).start();
                this.h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(wqVar).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x0, 1.0f);
                this.O0 = ofFloat;
                ofFloat.addUpdateListener(kz0Var);
                this.O0.setDuration(150L).setInterpolator(wqVar);
                this.O0.start();
                this.i0.setEnabled(true);
            }
            i7 = 0;
        } else {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L);
            org.telegram.ui.Components.wq wqVar2 = org.telegram.ui.Components.wq.f;
            duration.setInterpolator(wqVar2).start();
            this.H.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(wqVar2).start();
            this.I.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(wqVar2).start();
            this.N.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(wqVar2).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(wqVar2).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(wqVar2).start();
            this.i0.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(wqVar2).start();
            this.g0.animate().alpha(0.0f).setDuration(150L).setInterpolator(wqVar2).start();
            this.h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(wqVar2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.x0, 0.0f);
            this.O0 = ofFloat2;
            ofFloat2.addUpdateListener(kz0Var);
            this.O0.setDuration(150L).setInterpolator(wqVar2);
            this.O0.start();
            org.telegram.messenger.g0.r(this.R0);
            this.Q0 = false;
            this.i0.setEnabled(false);
            this.N0.f(true);
            i7 = org.telegram.messenger.qs.g2;
        }
        this.w0 = z9;
        cc1 cc1Var = this.t0;
        if (z9) {
            cc1Var.setSystemUiVisibility(cc1Var.getSystemUiVisibility() & (-5));
        } else {
            cc1Var.setSystemUiVisibility(cc1Var.getSystemUiVisibility() | 4);
        }
        this.L0.animate().translationY((-org.telegram.messenger.g0.L(16.0f)) - (this.w0 ? org.telegram.messenger.g0.L(80.0f) : 0)).setDuration(150L).setStartDelay(i7).setInterpolator(org.telegram.ui.Components.wq.f).start();
    }

    public final void s() {
        if (VoIPService.getSharedInstance() != null) {
            vb1 vb1Var = this.R0;
            org.telegram.messenger.g0.r(vb1Var);
            this.Q0 = false;
            if (this.y0 && this.w0) {
                org.telegram.messenger.g0.i3(vb1Var, 3000L);
                this.Q0 = true;
            }
        }
    }

    public final void t() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.v0.isTouchExplorationEnabled()) {
                this.s.announceForAccessibility(!this.m0 ? org.telegram.messenger.id.M0(2131754732, null) : org.telegram.messenger.id.M0(2131754733, null));
            }
            if (this.m0) {
                this.d0.c();
                sharedInstance.setVideoState(false, 0);
                sharedInstance.clearCamera();
                this.p0 = this.o0;
                y();
                return;
            }
            if (this.n0 == null) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                this.t0.setLockOnScreen(true);
                this.f.getLocationOnScreen(new int[2]);
                dc1 dc1Var = new dc1(this, this.s.getContext(), r0[0], r0[1]);
                this.n0 = dc1Var;
                WindowInsets windowInsets = this.q0;
                if (windowInsets != null) {
                    dc1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                }
                this.s.addView(this.n0);
            }
        }
    }

    public final void u(boolean z9) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (z9) {
            TransitionSet transitionSet = new TransitionSet();
            Transition duration = new org.telegram.ui.ActionBar.i0(4).setDuration(250L);
            org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f;
            transitionSet.addTransition(duration.setInterpolator(wqVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(wqVar));
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.n2.class, true);
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.b3.class, true);
            TransitionManager.beginDelayedTransition(this.i0, transitionSet);
        }
        int i7 = this.o0;
        if (i7 == 11) {
            this.e.setVisibility(8);
            this.f.setVisibility(8);
            this.h.setVisibility(8);
            this.n.setVisibility(8);
            return;
        }
        int i10 = 0;
        if (i7 == 15 || i7 == 17) {
            TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
            if (phoneCall != null && phoneCall.video && i7 == 15) {
                if (sharedInstance.isScreencast() || !(this.m0 || this.l0)) {
                    l(this.e, sharedInstance);
                    this.K.animate().alpha(0.0f).start();
                } else {
                    j(this.e, sharedInstance);
                    if (this.w0) {
                        this.K.animate().alpha(1.0f).start();
                    }
                }
                m(this.f, sharedInstance, false);
                k(this.h, sharedInstance, z9);
            } else {
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.h.setVisibility(8);
            }
            this.n.setVisibility(8);
        } else {
            if (l1 == null) {
                return;
            }
            if (sharedInstance.isScreencast() || !(this.m0 || this.l0)) {
                l(this.e, sharedInstance);
                this.K.setTag(null);
                this.K.animate().alpha(0.0f).start();
            } else {
                j(this.e, sharedInstance);
                if (this.w0) {
                    this.K.setTag(1);
                    this.K.animate().alpha(1.0f).start();
                }
            }
            m(this.f, sharedInstance, false);
            k(this.h, sharedInstance, z9);
            this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, org.telegram.messenger.id.M0(2131743411, null), false, z9);
            this.n.setOnClickListener(new wb1(this, i10));
        }
        if (this.e.getVisibility() == 0) {
            this.e.f = 0;
            i10 = 16;
        }
        if (this.f.getVisibility() == 0) {
            this.f.f = i10;
            i10 += 16;
        }
        if (this.h.getVisibility() == 0) {
            this.h.f = i10;
            i10 += 16;
        }
        if (this.n.getVisibility() == 0) {
            this.n.F = i10;
        }
        w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0165  */
    /* JADX WARN: Type inference failed for: r0v25, types: [org.telegram.ui.Components.k9] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v28, types: [org.telegram.ui.Components.k9] */
    /* JADX WARN: Type inference failed for: r0v29, types: [org.telegram.ui.Components.k9] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [org.telegram.ui.Components.h5] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.k9[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(boolean z9) {
        VoIPService sharedInstance;
        byte[] bArr;
        ?? r62;
        Drawable[] drawableArr;
        boolean z10;
        di.z2 z2Var;
        String[] strArr;
        TLRPC.Document document;
        int i7;
        ?? r52;
        if (this.A0 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean z11 = false;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(sharedInstance.getEncryptionKey());
            byteArrayOutputStream.write(sharedInstance.getGA());
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, false);
            bArr = null;
        }
        if (bArr == null) {
            return;
        }
        String[] emojifyForCall = EncryptionKeyEmojifier.emojifyForCall(Utilities.o(bArr.length, bArr));
        int i10 = 0;
        while (true) {
            r62 = this.V;
            drawableArr = this.W;
            if (i10 >= 4) {
                break;
            }
            org.telegram.messenger.i6.k(emojifyForCall[i10]);
            org.telegram.messenger.e6 g10 = org.telegram.messenger.i6.g(emojifyForCall[i10]);
            if (g10 != null) {
                g10.setBounds(z11 ? 1 : 0, z11 ? 1 : 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                g10.b();
                int[] iArr = new int[1];
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(org.telegram.messenger.g0.L(28.0f));
                CharSequence m10 = org.telegram.messenger.i6.m(emojifyForCall[i10], textPaint.getFontMetricsInt(), z11, iArr, z11 ? 1 : 0);
                boolean z12 = m10 instanceof Spannable;
                int i11 = this.a;
                if (z12) {
                    Spannable spannable = (Spannable) m10;
                    org.telegram.messenger.f6[] f6VarArr = (org.telegram.messenger.f6[]) spannable.getSpans(z11 ? 1 : 0, spannable.length(), org.telegram.messenger.f6.class);
                    org.telegram.ui.Components.q5[] q5VarArr = (org.telegram.ui.Components.q5[]) spannable.getSpans(z11 ? 1 : 0, spannable.length(), org.telegram.ui.Components.q5.class);
                    if (f6VarArr != null) {
                        if ((iArr[z11 ? 1 : 0] - f6VarArr.length) - (q5VarArr == null ? z11 ? 1 : 0 : q5VarArr.length) <= 0) {
                            int length = f6VarArr.length;
                            int i12 = z11 ? 1 : 0;
                            ?? r32 = z11;
                            while (i12 < length) {
                                org.telegram.messenger.f6 f6Var = f6VarArr[i12];
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                tL_inputStickerSetShortName.short_name = "StaticEmoji";
                                TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(i11).l0(tL_inputStickerSetShortName, Integer.valueOf((int) r32), false, true, new r3(this, 27));
                                if (l02 != null) {
                                    String replace = f6Var.d.replace("️", "");
                                    ArrayList<TLRPC.Document> arrayList = l02.documents;
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= size) {
                                            strArr = emojifyForCall;
                                            i7 = length;
                                            document = null;
                                            break;
                                        }
                                        TLRPC.Document document2 = arrayList.get(i13);
                                        i13++;
                                        strArr = emojifyForCall;
                                        document = document2;
                                        ArrayList<TLRPC.Document> arrayList2 = arrayList;
                                        i7 = length;
                                        if (TextUtils.equals(org.telegram.messenger.ij.V(document, null, null).replace("️", ""), replace)) {
                                            break;
                                        }
                                        length = i7;
                                        emojifyForCall = strArr;
                                        arrayList = arrayList2;
                                    }
                                    if (document != null) {
                                        break;
                                    }
                                    i12++;
                                    length = i7;
                                    emojifyForCall = strArr;
                                    r32 = 0;
                                }
                            }
                        }
                    }
                    strArr = emojifyForCall;
                    document = null;
                    if (document == null) {
                        Drawable drawable = drawableArr[i10];
                        if ((drawable instanceof org.telegram.ui.Components.h5) && ((org.telegram.ui.Components.h5) drawable).h() == document.id) {
                            r52 = (org.telegram.ui.Components.h5) drawableArr[i10];
                        } else {
                            org.telegram.ui.Components.h5 h5Var = new org.telegram.ui.Components.h5(21, i11, document);
                            drawableArr[i10] = h5Var;
                            r52 = h5Var;
                        }
                        r52.q(strArr[i10]);
                        r62[i10].setAnimatedEmojiDrawable(r52);
                        r62[i10].getImageReceiver().f();
                        g10 = r52;
                    } else {
                        r62[i10].setImageDrawable(g10);
                        g10 = g10;
                    }
                    r62[i10].setVisibility(8);
                }
                strArr = emojifyForCall;
                document = null;
                if (document == null) {
                }
                r62[i10].setVisibility(8);
            } else {
                strArr = emojifyForCall;
            }
            drawableArr[i10] = g10;
            i10++;
            emojifyForCall = strArr;
            z11 = false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            Drawable drawable2 = drawableArr[i15];
            if (drawable2 instanceof org.telegram.messenger.e6) {
                z10 = ((org.telegram.messenger.e6) drawable2).a();
            } else {
                if ((drawable2 instanceof org.telegram.ui.Components.h5) && (z2Var = ((org.telegram.ui.Components.h5) drawable2).k) != null) {
                    Drawable drawable3 = z2Var.a0;
                    if (!(drawable3 instanceof org.telegram.messenger.e6) || ((org.telegram.messenger.e6) drawable3).a()) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            if (z10) {
                i14++;
            }
        }
        if (i14 == 4) {
            this.A0 = true;
            for (int i16 = 0; i16 < 4; i16++) {
                if (r62[i16].getVisibility() != 0) {
                    r62[i16].setVisibility(0);
                    if (z9) {
                        r62[i16].setAlpha(0.0f);
                        r62[i16].setScaleX(0.0f);
                        r62[i16].setScaleY(0.0f);
                        org.telegram.messenger.camera.q.l(r62[i16].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.wq.k, 250L);
                    }
                }
            }
            this.N0.postDelayed(new vb1(this, 9), 1000L);
        }
    }

    public final void w() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int i7 = sharedInstance.isBluetoothOn() ? R.drawable.calls_bluetooth : VoipAudioManager.get().isSpeakerphoneOn() ? R.drawable.calls_speaker : sharedInstance.isHeadsetPlugged() ? R.drawable.calls_menu_headset : R.drawable.calls_menu_phone;
        if (this.J != i7) {
            org.telegram.messenger.g0.R3(this.K, i7);
        } else {
            this.K.setImageResource(i7);
        }
        this.J = i7;
    }

    public final void x() {
        this.j0.setColor(i0.a.o(-16777216, (int) (this.x0 * 102.0f * this.E0)));
        this.k0.setColor(i0.a.o(-16777216, (int) (127.5f * this.E0)));
        ec1 ec1Var = this.s;
        if (ec1Var != null) {
            ec1Var.invalidate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0a7f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0a9e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0b6b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0bbc  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0bb4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0b00  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0b21  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0af4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0c0a  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0cf4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0d37  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0d53 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0d5e  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0d63  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0d94  */
    /* JADX WARN: Removed duplicated region for block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0d77  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0c1e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:396:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x07df  */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        boolean z9;
        boolean z10;
        int i7;
        boolean z11;
        boolean z12;
        int L;
        boolean z13;
        int i10;
        int childsHight;
        org.telegram.ui.Components.voip.n1 n1Var;
        org.telegram.ui.Components.voip.n1 n1Var2;
        boolean z14;
        boolean z15;
        boolean z16;
        org.telegram.ui.Components.voip.k2 k2Var;
        VideoSink videoSink;
        int i11;
        int i12;
        boolean z17;
        TL_phone.PhoneCall phoneCall;
        VoIPService.SharedUIParams sharedUIParams;
        long j3;
        Layout layout;
        int lineCount;
        float f10;
        float f11;
        float f12;
        TL_phone.PhoneCall phoneCall2;
        float f13;
        boolean z18;
        boolean z19;
        TextView textView;
        int i13;
        if (this.F0 || this.D0) {
            return;
        }
        boolean z20 = true;
        boolean z21 = this.p0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i14 = this.o0;
        TLRPC.User user = this.d;
        int i15 = 2;
        if (i14 == 1 || i14 == 2) {
            this.F.b(org.telegram.messenger.id.M0(2131743419, null), true, z21);
        } else {
            if (i14 != 3) {
                if (i14 == 4) {
                    this.F.b(org.telegram.messenger.id.M0(2131743408, null), false, z21);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : Instance.ERROR_UNKNOWN;
                    if (TextUtils.equals(lastError, Instance.ERROR_UNKNOWN)) {
                        org.telegram.messenger.g0.i3(new vb1(this, 2), 1000L);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_INCOMPATIBLE)) {
                        p(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("VoipPeerIncompatible", null, 2131743263, org.telegram.messenger.g5.m(0, user.first_name, user.last_name))));
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PEER_OUTDATED)) {
                        if (this.T0) {
                            String a02 = org.telegram.messenger.id.a0("VoipPeerVideoOutdated", null, 2131743261, org.telegram.messenger.t10.j(user, true));
                            boolean[] zArr = new boolean[1];
                            org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3(0, this.b, null);
                            boolean[] zArr2 = new boolean[3];
                            m3Var.R = org.telegram.messenger.id.M0(2131743408, null);
                            m3Var.T = org.telegram.messenger.g0.X2(a02);
                            String M0 = org.telegram.messenger.id.M0(2131752589, null);
                            ub1 ub1Var = new ub1(this, 1);
                            m3Var.n0 = M0;
                            m3Var.o0 = ub1Var;
                            String M02 = org.telegram.messenger.id.M0(2131743260, null);
                            ok0 ok0Var = new ok0(23, this, zArr);
                            m3Var.l0 = M02;
                            m3Var.m0 = ok0Var;
                            m3Var.show();
                            for (int i16 = 0; i16 < 3; i16++) {
                                if (zArr2[i16] && (textView = (TextView) m3Var.d(-(i16 + 1))) != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, m3Var.i1);
                                }
                            }
                            m3Var.setCanceledOnTouchOutside(true);
                            m3Var.setOnDismissListener(new bi.u3(this, zArr, 14));
                        } else {
                            p(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("VoipPeerOutdated", null, 2131743262, org.telegram.messenger.t10.j(user, true))));
                        }
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PRIVACY)) {
                        p(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131752606, org.telegram.messenger.g5.m(0, user.first_name, user.last_name))));
                        org.telegram.ui.Components.u4.i0(this.b, this.a, user.id);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_AUDIO_IO)) {
                        p("Error initializing audio hardware");
                    } else if (TextUtils.equals(lastError, Instance.ERROR_LOCALIZED)) {
                        this.t0.b();
                    } else if (TextUtils.equals(lastError, Instance.ERROR_CONNECTION_SERVICE)) {
                        p(org.telegram.messenger.id.M0(2131743410, null));
                    } else {
                        org.telegram.messenger.g0.i3(new vb1(this, 1), 1000L);
                    }
                } else if (i14 != 5) {
                    switch (i14) {
                        case 11:
                            boolean z22 = sharedInstance != null && sharedInstance.hasRate();
                            this.d0.c();
                            if (!z22 || this.F0) {
                                org.telegram.messenger.g0.i3(new vb1(this, 0), 200L);
                                break;
                            } else {
                                if (this.w0) {
                                    int[] iArr = new int[2];
                                    int i17 = org.telegram.messenger.g0.q.x;
                                    this.n.getLocationOnScreen(iArr);
                                    int measuredWidth = ((i17 - iArr[0]) - ((this.n.getMeasuredWidth() - org.telegram.messenger.g0.L(52.0f)) / 2)) - org.telegram.messenger.g0.L(52.0f);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.U.getLayoutParams();
                                    marginLayoutParams.rightMargin = measuredWidth;
                                    marginLayoutParams.leftMargin = measuredWidth;
                                    this.U.setTranslationY(iArr[1]);
                                    this.U.setAlpha(1.0f);
                                    this.U.setLayoutParams(marginLayoutParams);
                                    this.i0.animate().alpha(0.0f).setDuration(80L).start();
                                    org.telegram.messenger.g0.i3(new sb1(0, this, sharedInstance), 2L);
                                    i13 = 0;
                                } else {
                                    this.i0.setVisibility(8);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U.getLayoutParams();
                                    layoutParams.rightMargin = org.telegram.messenger.g0.L(18.0f);
                                    layoutParams.leftMargin = org.telegram.messenger.g0.L(18.0f);
                                    int L2 = org.telegram.messenger.g0.L(36.0f);
                                    layoutParams.bottomMargin = L2;
                                    WindowInsets windowInsets = this.q0;
                                    if (windowInsets != null) {
                                        layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom() + L2;
                                    }
                                    layoutParams.gravity = 80;
                                    this.U.setLayoutParams(layoutParams);
                                    this.U.animate().alpha(1.0f).setDuration(250L).start();
                                    i13 = 0;
                                    this.U.a(new tb1(this, sharedInstance, i13), false);
                                }
                                this.Q.setVisibility(i13);
                                bi.m5 m5Var = this.Q;
                                ub1 ub1Var2 = new ub1(this, i13);
                                org.telegram.ui.Components.voip.c1[] c1VarArr = (org.telegram.ui.Components.voip.c1[]) m5Var.d;
                                m5Var.e = ub1Var2;
                                bi.x5 x5Var = (bi.x5) m5Var.b;
                                x5Var.setVisibility(i13);
                                ((FrameLayout) m5Var.c).setVisibility(i13);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.ALPHA;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x5Var, (Property<bi.x5, Float>) property, 0.0f, 1.0f);
                                Property property2 = View.SCALE_X;
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(x5Var, (Property<bi.x5, Float>) property2, 0.7f, 1.0f);
                                Property property3 = View.SCALE_Y;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(x5Var, (Property<bi.x5, Float>) property3, 0.7f, 1.0f);
                                float f14 = 0.0f;
                                Property property4 = View.TRANSLATION_Y;
                                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(x5Var, (Property<bi.x5, Float>) property4, org.telegram.messenger.g0.L(24.0f), 0.0f));
                                animatorSet.setInterpolator(org.telegram.ui.Components.wq.f);
                                animatorSet.setDuration(250L);
                                int i18 = 0;
                                while (i18 < c1VarArr.length) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    c1VarArr[i18].setAlpha(f14);
                                    float[] fArr = new float[i15];
                                    // fill-array-data instruction
                                    fArr[0] = 0.0f;
                                    fArr[1] = 1.0f;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c1VarArr[i18], (Property<org.telegram.ui.Components.voip.c1, Float>) property, fArr);
                                    float[] fArr2 = new float[i15];
                                    // fill-array-data instruction
                                    fArr2[0] = 0.3f;
                                    fArr2[1] = 1.0f;
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(c1VarArr[i18], (Property<org.telegram.ui.Components.voip.c1, Float>) property2, fArr2);
                                    AnimatorSet animatorSet3 = animatorSet;
                                    float[] fArr3 = new float[i15];
                                    // fill-array-data instruction
                                    fArr3[0] = 0.3f;
                                    fArr3[1] = 1.0f;
                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(c1VarArr[i18], (Property<org.telegram.ui.Components.voip.c1, Float>) property3, fArr3);
                                    org.telegram.ui.Components.voip.c1 c1Var = c1VarArr[i18];
                                    Property property5 = property3;
                                    float[] fArr4 = new float[i15];
                                    fArr4[0] = org.telegram.messenger.g0.L(30.0f);
                                    fArr4[1] = 0.0f;
                                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(c1Var, (Property<org.telegram.ui.Components.voip.c1, Float>) property4, fArr4);
                                    int i19 = i15;
                                    Animator[] animatorArr = new Animator[4];
                                    animatorArr[0] = ofFloat4;
                                    animatorArr[1] = ofFloat5;
                                    animatorArr[i19] = ofFloat6;
                                    animatorArr[3] = ofFloat7;
                                    animatorSet2.playTogether(animatorArr);
                                    animatorSet2.setDuration(250L);
                                    animatorSet2.setStartDelay(i18 * 16);
                                    animatorSet2.start();
                                    i18++;
                                    animatorSet = animatorSet3;
                                    i15 = i19;
                                    property3 = property5;
                                    f14 = 0.0f;
                                }
                                int i20 = i15;
                                animatorSet.start();
                                if (this.B0) {
                                    this.B0 = false;
                                    ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f;
                                    duration.setInterpolator(wqVar).setListener(new org.telegram.ui.Components.s9(this.O)).start();
                                    this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(wqVar).setDuration(250L).start();
                                    this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.g0.L(120.0f)).setListener(new org.telegram.ui.Components.s9(this.O)).setDuration(250L).setInterpolator(wqVar).start();
                                }
                                for (org.telegram.ui.Components.k9 k9Var : this.V) {
                                    k9Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(org.telegram.ui.Components.wq.f).setDuration(250L).start();
                                }
                                this.E.animate().alpha(0.0f).setDuration(70L).setListener(new zb1(this, 5)).start();
                                ViewPropertyAnimator alpha = this.K.animate().alpha(0.0f);
                                org.telegram.ui.Components.wq wqVar2 = org.telegram.ui.Components.wq.f;
                                org.telegram.messenger.camera.q.l(alpha, wqVar2, 250L);
                                this.K.setVisibility(8);
                                this.F.d(false, true);
                                this.F.c(false);
                                org.telegram.ui.Components.voip.l2 l2Var = this.F.d;
                                l2Var.n = true;
                                l2Var.invalidate();
                                org.telegram.ui.Components.voip.p0 p0Var = this.D;
                                p0Var.setShowWaves(false);
                                AnimatorSet animatorSet4 = p0Var.c;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                                AnimatorSet animatorSet5 = new AnimatorSet();
                                p0Var.c = animatorSet5;
                                Property property6 = View.ALPHA;
                                float[] fArr5 = new float[i20];
                                fArr5[0] = p0Var.getAlpha();
                                fArr5[1] = 1.0f;
                                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(p0Var, (Property<org.telegram.ui.Components.voip.p0, Float>) property6, fArr5);
                                Property property7 = View.TRANSLATION_Y;
                                float[] fArr6 = new float[i20];
                                fArr6[0] = p0Var.getTranslationY();
                                fArr6[1] = -org.telegram.messenger.g0.L(24.0f);
                                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(p0Var, (Property<org.telegram.ui.Components.voip.p0, Float>) property7, fArr6);
                                Property property8 = View.SCALE_X;
                                float[] fArr7 = new float[3];
                                fArr7[0] = p0Var.getScaleX();
                                fArr7[1] = 0.9f;
                                fArr7[i20] = 1.0f;
                                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(p0Var, (Property<org.telegram.ui.Components.voip.p0, Float>) property8, fArr7);
                                Property property9 = View.SCALE_Y;
                                float[] fArr8 = new float[3];
                                fArr8[0] = p0Var.getScaleY();
                                fArr8[1] = 0.9f;
                                fArr8[i20] = 1.0f;
                                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(p0Var, (Property<org.telegram.ui.Components.voip.p0, Float>) property9, fArr8);
                                Animator[] animatorArr2 = new Animator[4];
                                animatorArr2[0] = ofFloat8;
                                animatorArr2[1] = ofFloat9;
                                animatorArr2[i20] = ofFloat10;
                                animatorArr2[3] = ofFloat11;
                                animatorSet5.playTogether(animatorArr2);
                                p0Var.c.setInterpolator(wqVar2);
                                p0Var.c.setDuration(300L);
                                p0Var.c.setStartDelay(250L);
                                p0Var.c.start();
                                u(true);
                                this.n.setVisibility(4);
                                this.Z.setAlpha(0.0f);
                                this.Z.setVisibility(8);
                                this.Y.setAlpha(0.0f);
                                this.Y.setVisibility(8);
                                dc1 dc1Var = this.n0;
                                if (dc1Var != null) {
                                    dc1Var.a(false, false);
                                }
                                this.L0.animate().alpha(0.0f).setDuration(250L).start();
                                break;
                            }
                            break;
                        case 12:
                            if (this.p0 != 12) {
                                this.F.b(org.telegram.messenger.id.M0(2131743409, null), true, z21);
                                break;
                            }
                            break;
                        case 13:
                            this.F.b(org.telegram.messenger.id.M0(2131743218, null), true, z21);
                            break;
                        case 14:
                            this.F.b(org.telegram.messenger.id.M0(2131743246, null), true, z21);
                            break;
                        case 15:
                            this.e0.setRetryMod(false);
                            if (sharedState != null && sharedState.isConference()) {
                                this.F.b(org.telegram.messenger.id.M0(2131743298, null), false, z21);
                                this.e0.setTranslationY(0.0f);
                            } else if (sharedState == null || !sharedState.isCallingVideo()) {
                                this.F.b(org.telegram.messenger.id.M0(2131743300, null), false, z21);
                                this.e0.setTranslationY(0.0f);
                            } else {
                                this.F.b(org.telegram.messenger.id.M0(2131743297, null), false, z21);
                                this.e0.setTranslationY(-org.telegram.messenger.g0.L(60.0f));
                            }
                            z9 = false;
                            z10 = false;
                            break;
                        case 16:
                            if (this.p0 != 16) {
                                this.F.b(org.telegram.messenger.id.M0(2131743245, null), true, z21);
                                break;
                            }
                            break;
                        case 17:
                            this.F.b(org.telegram.messenger.id.M0(2131743492, null), false, z21);
                            this.e0.setRetryMod(true);
                            this.m0 = false;
                            this.l0 = false;
                            z9 = false;
                            z10 = false;
                            break;
                    }
                    if (this.n0 == null) {
                        return;
                    }
                    boolean z23 = this.l0 || this.m0;
                    if (sharedInstance != null) {
                        this.l0 = sharedInstance.getRemoteVideoState() == 2;
                        if (sharedInstance.getVideoState(false) != 2) {
                            z18 = true;
                            if (sharedInstance.getVideoState(false) != 1) {
                                z19 = false;
                                this.m0 = z19;
                                if (z19 && !this.T0) {
                                    this.T0 = z18;
                                }
                            }
                        } else {
                            z18 = true;
                        }
                        z19 = z18;
                        this.m0 = z19;
                        if (z19) {
                            this.T0 = z18;
                        }
                    }
                    if (z21) {
                        this.Y.b();
                        this.Z.b();
                    }
                    if (this.l0) {
                        if (this.D0) {
                            f13 = 1.0f;
                        } else {
                            f13 = 1.0f;
                            this.w.setAlpha(1.0f);
                        }
                        if (z21) {
                            this.c0.animate().alpha(f13).setDuration(250L).start();
                        } else {
                            this.c0.animate().cancel();
                            this.c0.setAlpha(f13);
                        }
                        if (!this.c0.d.isFirstFrameRendered() && !this.H0) {
                            i7 = 0;
                            this.l0 = false;
                            if (!this.m0 || this.l0) {
                                this.w.setVisibility(4);
                            } else {
                                this.w.setVisibility(i7);
                                if (z21) {
                                    this.c0.animate().alpha(0.0f).setDuration(250L).start();
                                } else {
                                    this.c0.animate().cancel();
                                    this.c0.setAlpha(0.0f);
                                }
                            }
                            z11 = this.m0;
                            if (z11 || !this.l0) {
                                this.G0 = false;
                            }
                            z12 = (z11 || !this.G0 || org.telegram.messenger.g0.H1(this.b)) ? false : true;
                            o(z21, z23);
                            L = this.D.getTag() != null ? 0 : org.telegram.messenger.g0.L(135.0f) + org.telegram.messenger.g0.L(12.0f);
                            if (z21) {
                                this.e0.setVisibility(z20 ? 0 : 8);
                            } else {
                                if (z20 && this.e0.getTag() == null) {
                                    this.e0.animate().setListener(null).cancel();
                                    if (this.e0.getVisibility() == 8) {
                                        this.e0.setVisibility(0);
                                        this.e0.setAlpha(0.0f);
                                    }
                                    this.e0.animate().alpha(1.0f);
                                }
                                if (!z20 && this.e0.getTag() != null) {
                                    this.e0.animate().setListener(null).cancel();
                                    this.e0.animate().setListener(new zb1(this, 9)).alpha(0.0f);
                                }
                            }
                            this.e0.setEnabled(z20);
                            this.e0.setTag(!z20 ? 1 : null);
                            this.t0.setLockOnScreen(this.I0);
                            z13 = this.o0 != 3 && (this.m0 || this.l0);
                            this.y0 = z13;
                            if (!z13 && !this.w0) {
                                r(true);
                            }
                            if (this.w0 && this.y0 && !this.Q0 && sharedInstance != null) {
                                org.telegram.messenger.g0.i3(this.R0, 3000L);
                                this.Q0 = true;
                            }
                            int i21 = this.o0;
                            boolean z24 = i21 == 11 && this.w0;
                            boolean z25 = (!z20 || i21 == 16 || i21 == 11 || i21 == 12 || i21 == 14 || i21 == 6 || !this.w0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) ? false : true;
                            if (z21) {
                                this.H.setVisibility(z24 ? 0 : 8);
                                this.H.setAlpha(z24 ? 1.0f : 0.0f);
                                this.I.setVisibility(z25 ? 0 : 8);
                                this.I.setAlpha(z25 ? 1.0f : 0.0f);
                                this.L0.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) - (this.w0 ? org.telegram.messenger.g0.L(80.0f) : 0));
                            } else {
                                if (z24) {
                                    f10 = 80.0f;
                                    this.H.animate().alpha(1.0f).start();
                                } else {
                                    f10 = 80.0f;
                                    if (this.H.getVisibility() != 0) {
                                        this.H.setVisibility(0);
                                        f11 = 0.0f;
                                        this.H.setAlpha(0.0f);
                                    } else {
                                        f11 = 0.0f;
                                    }
                                    this.H.animate().alpha(f11).start();
                                }
                                if (z25) {
                                    this.I.animate().alpha(1.0f).start();
                                } else {
                                    if (this.I.getVisibility() != 0) {
                                        this.I.setVisibility(0);
                                        f12 = 0.0f;
                                        this.I.setAlpha(0.0f);
                                    } else {
                                        f12 = 0.0f;
                                    }
                                    this.I.animate().alpha(f12).start();
                                }
                                this.L0.animate().translationY((-org.telegram.messenger.g0.L(16.0f)) - (this.w0 ? org.telegram.messenger.g0.L(f10) : 0)).setDuration(150L).setInterpolator(org.telegram.ui.Components.wq.f).start();
                            }
                            i10 = this.o0;
                            if (i10 != 10 && i10 != 11) {
                                u(z21);
                            }
                            if (z10) {
                                this.F.e(z21);
                            }
                            this.F.d(z9, z21);
                            if (this.D.getVisibility() == 0 && this.B0) {
                                L += org.telegram.messenger.g0.L(24.0f);
                                layout = this.T.getLayout();
                                if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                                    L = com.google.android.recaptcha.internal.a.e(lineCount, 2, org.telegram.messenger.g0.L(20.0f), L);
                                }
                            }
                            if (this.o0 == 11 && !this.m0 && !this.l0) {
                                L -= org.telegram.messenger.g0.L(24.0f);
                            }
                            if (!this.m0 || this.l0) {
                                L -= org.telegram.messenger.g0.L(60.0f);
                            }
                            if (z21) {
                                this.X.setTranslationY(L);
                            } else {
                                if (this.B0 && (this.m0 || this.l0)) {
                                    this.X.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.wq.f).start();
                                    j3 = 250;
                                } else {
                                    j3 = 250;
                                    this.X.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.wq.f).start();
                                }
                                if (L != this.u0) {
                                    ViewPropertyAnimator animate = this.X.animate();
                                    if (this.o0 != 11) {
                                        j3 = 0;
                                    }
                                    animate.setStartDelay(j3).translationY(L).setDuration(200L).setInterpolator(org.telegram.ui.Components.wq.f).start();
                                }
                            }
                            this.u0 = L;
                            boolean z26 = sharedInstance == null && sharedInstance.isScreencast();
                            int i22 = this.o0;
                            this.C0 = i22 == 11 && i22 != 17 && ((this.m0 && !z26) || this.l0);
                            if (sharedInstance != null) {
                                if (this.m0) {
                                    sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                                }
                                this.d0.setIsScreencast(sharedInstance.isScreencast());
                                this.d0.d.setMirror(sharedInstance.isFrontFaceCamera());
                                org.telegram.ui.Components.voip.j2 j2Var = (!this.m0 || sharedInstance.isScreencast()) ? null : this.d0.d;
                                if (!this.k1 || (k2Var = this.j1) == null) {
                                    if (z12) {
                                        videoSink = this.b0;
                                        sharedInstance.setSinks(j2Var, videoSink);
                                        if (z21) {
                                            org.telegram.ui.Components.voip.a2 a2Var = this.L0;
                                            a2Var.f = false;
                                            if (!a2Var.e && a2Var.getParent() != null) {
                                                TransitionManager.beginDelayedTransition(a2Var, a2Var.d);
                                            }
                                        }
                                        if (sharedInstance.isMicMute()) {
                                            this.L0.c("self-muted");
                                        } else {
                                            this.L0.a(R.drawable.calls_mute_mini, org.telegram.messenger.id.M0(2131743286, null), "self-muted");
                                        }
                                        if ((!this.m0 || this.l0) && (((i11 = this.o0) == 3 || i11 == 5) && sharedInstance.getCallDuration() > 500)) {
                                            if (sharedInstance.getRemoteAudioState() != 0) {
                                                org.telegram.ui.Components.voip.a2 a2Var2 = this.L0;
                                                i12 = 1;
                                                a2Var2.a(R.drawable.calls_mute_mini, org.telegram.messenger.id.a0("VoipUserMicrophoneIsOff", null, 2131743227, a2Var2.b(org.telegram.messenger.t10.j(user, true))), "muted");
                                            } else {
                                                i12 = 1;
                                                this.L0.c("muted");
                                            }
                                            if (sharedInstance.getRemoteVideoState() != 0) {
                                                org.telegram.ui.Components.voip.a2 a2Var3 = this.L0;
                                                Object[] objArr = new Object[i12];
                                                objArr[0] = a2Var3.b(org.telegram.messenger.t10.j(user, i12));
                                                a2Var3.a(R.drawable.calls_camera_mini, org.telegram.messenger.id.a0("VoipUserCameraIsOff", null, 2131743228, objArr), MediaStreamTrack.VIDEO_TRACK_KIND);
                                            } else {
                                                this.L0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                            }
                                        } else {
                                            if (sharedInstance.getRemoteAudioState() == 0) {
                                                org.telegram.ui.Components.voip.a2 a2Var4 = this.L0;
                                                a2Var4.a(R.drawable.calls_mute_mini, org.telegram.messenger.id.a0("VoipUserMicrophoneIsOff", null, 2131743227, a2Var4.b(org.telegram.messenger.t10.j(user, true))), "muted");
                                            } else {
                                                this.L0.c("muted");
                                            }
                                            this.L0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                        }
                                        if (this.L0.getChildCount() == 0 && this.l0 && (phoneCall = sharedInstance.privateCall) != null && !phoneCall.video) {
                                            sharedUIParams = sharedInstance.sharedUIParams;
                                            if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                                sharedUIParams.tapToVideoTooltipWasShowed = true;
                                                this.M0.setTranslationY(-((this.s.getMeasuredHeight() - this.i0.getY()) + org.telegram.messenger.g0.L(6.0f)));
                                                this.M0.p(0.0f, this.f.getX() + this.i0.getX() + org.telegram.messenger.g0.L(14.0f));
                                                this.M0.w();
                                                z17 = true;
                                                if (z21) {
                                                    org.telegram.ui.Components.voip.a2 a2Var5 = this.L0;
                                                    if (a2Var5.f) {
                                                        a2Var5.e = z17;
                                                        org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.p5(a2Var5, 4), 700L);
                                                    }
                                                    a2Var5.f = false;
                                                }
                                            }
                                        }
                                        if (this.L0.getChildCount() != 0) {
                                            z17 = true;
                                            this.M0.f(true);
                                            if (z21) {
                                            }
                                        }
                                        z17 = true;
                                        if (z21) {
                                        }
                                    } else {
                                        k2Var = this.c0;
                                    }
                                }
                                videoSink = k2Var.d;
                                sharedInstance.setSinks(j2Var, videoSink);
                                if (z21) {
                                }
                                if (sharedInstance.isMicMute()) {
                                }
                                if (this.m0) {
                                }
                                if (sharedInstance.getRemoteAudioState() != 0) {
                                }
                                if (sharedInstance.getRemoteVideoState() != 0) {
                                }
                                if (this.L0.getChildCount() == 0) {
                                    sharedUIParams = sharedInstance.sharedUIParams;
                                    if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                    }
                                }
                                if (this.L0.getChildCount() != 0) {
                                }
                                z17 = true;
                                if (z21) {
                                }
                            }
                            childsHight = this.L0.getChildsHight();
                            n1Var = this.Z;
                            if (n1Var.getParent() == null && z21) {
                                n1Var.T = childsHight;
                            } else {
                                n1Var.T = childsHight;
                            }
                            n1Var2 = this.Y;
                            if (n1Var2.getParent() == null && z21) {
                                n1Var2.T = childsHight;
                            } else {
                                n1Var2.T = childsHight;
                            }
                            this.Y.setUiVisible(this.w0);
                            this.Z.setUiVisible(this.w0);
                            if (this.m0) {
                                z14 = true;
                                q(0, z21);
                            } else if (!this.l0 || this.G0) {
                                z14 = true;
                                q(1, z21);
                            } else {
                                q(2, z21);
                                z14 = true;
                            }
                            if (!z12 && this.Z.getTag() == null) {
                                this.Z.setIsActive(z14);
                                if (this.Z.getVisibility() != 0) {
                                    this.Z.setVisibility(0);
                                    this.Z.setAlpha(0.0f);
                                    this.Z.setScaleX(0.5f);
                                    this.Z.setScaleY(0.5f);
                                }
                                this.Z.animate().setListener(null).cancel();
                                org.telegram.ui.Components.voip.n1 n1Var3 = this.Z;
                                n1Var3.c0 = true;
                                n1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.wq.f).setStartDelay(150L).withEndAction(new vb1(this, 4)).start();
                                this.Z.setTag(1);
                            } else if (!z12 && this.Z.getTag() != null) {
                                this.Z.setIsActive(false);
                                this.Z.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new zb1(this, 6)).setDuration(150L).setInterpolator(org.telegram.ui.Components.wq.f).start();
                                this.Z.setTag(null);
                            }
                            this.Y.a();
                            this.Z.a();
                            w();
                            if (this.o0 == 3) {
                                this.x.a();
                                this.D.a();
                                int i23 = this.w.V;
                                if (i23 != 2 && i23 != 3) {
                                    int[] iArr2 = new int[2];
                                    this.D.getLocationOnScreen(iArr2);
                                    z15 = true;
                                    this.w.b(org.telegram.messenger.g0.L(106.0f) + iArr2[0], org.telegram.messenger.g0.L(106.0f) + iArr2[1], this.p0 != -1);
                                    z16 = (!this.m0 || this.l0) ? z15 : false;
                                    this.y.setState(z16);
                                    this.x.setState(z16);
                                    this.r.e(z16);
                                    if (this.l0 && !z23 && this.f0) {
                                        this.f0 = false;
                                        if (sharedInstance != null) {
                                            sharedInstance.playStartRecordSound();
                                        }
                                    }
                                    if (z16) {
                                        if (this.h0.getVisibility() != 0) {
                                            this.h0.setVisibility(0);
                                            this.g0.setVisibility(0);
                                        }
                                    } else if (this.h0.getVisibility() != 4) {
                                        this.h0.setVisibility(4);
                                        this.g0.setVisibility(4);
                                    }
                                    vb1 vb1Var = this.S0;
                                    org.telegram.messenger.g0.r(vb1Var);
                                    if (this.o0 == 3) {
                                        org.telegram.messenger.g0.i3(vb1Var, 10000L);
                                        return;
                                    }
                                    return;
                                }
                            }
                            z15 = true;
                            if (this.m0) {
                            }
                            this.y.setState(z16);
                            this.x.setState(z16);
                            this.r.e(z16);
                            if (this.l0) {
                                this.f0 = false;
                                if (sharedInstance != null) {
                                }
                            }
                            if (z16) {
                            }
                            vb1 vb1Var2 = this.S0;
                            org.telegram.messenger.g0.r(vb1Var2);
                            if (this.o0 == 3) {
                            }
                        }
                    }
                    i7 = 0;
                    if (this.m0) {
                    }
                    this.w.setVisibility(4);
                    z11 = this.m0;
                    if (z11) {
                    }
                    this.G0 = false;
                    if (z11) {
                    }
                    o(z21, z23);
                    if (this.D.getTag() != null) {
                    }
                    if (z21) {
                    }
                    this.e0.setEnabled(z20);
                    this.e0.setTag(!z20 ? 1 : null);
                    this.t0.setLockOnScreen(this.I0);
                    if (this.o0 != 3) {
                    }
                    this.y0 = z13;
                    if (!z13) {
                        r(true);
                    }
                    if (this.w0) {
                        org.telegram.messenger.g0.i3(this.R0, 3000L);
                        this.Q0 = true;
                    }
                    int i212 = this.o0;
                    if (i212 == 11) {
                    }
                    if (!z20) {
                    }
                    if (z21) {
                    }
                    i10 = this.o0;
                    if (i10 != 10) {
                        u(z21);
                    }
                    if (z10) {
                    }
                    this.F.d(z9, z21);
                    if (this.D.getVisibility() == 0) {
                        L += org.telegram.messenger.g0.L(24.0f);
                        layout = this.T.getLayout();
                        if (layout != null) {
                            L = com.google.android.recaptcha.internal.a.e(lineCount, 2, org.telegram.messenger.g0.L(20.0f), L);
                        }
                    }
                    if (this.o0 == 11) {
                        L -= org.telegram.messenger.g0.L(24.0f);
                    }
                    if (!this.m0) {
                    }
                    L -= org.telegram.messenger.g0.L(60.0f);
                    if (z21) {
                    }
                    this.u0 = L;
                    if (sharedInstance == null) {
                    }
                    int i222 = this.o0;
                    this.C0 = i222 == 11 && i222 != 17 && ((this.m0 && !z26) || this.l0);
                    if (sharedInstance != null) {
                    }
                    childsHight = this.L0.getChildsHight();
                    n1Var = this.Z;
                    if (n1Var.getParent() == null) {
                    }
                    n1Var.T = childsHight;
                    n1Var2 = this.Y;
                    if (n1Var2.getParent() == null) {
                    }
                    n1Var2.T = childsHight;
                    this.Y.setUiVisible(this.w0);
                    this.Z.setUiVisible(this.w0);
                    if (this.m0) {
                    }
                    if (!z12) {
                    }
                    if (!z12) {
                        this.Z.setIsActive(false);
                        this.Z.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new zb1(this, 6)).setDuration(150L).setInterpolator(org.telegram.ui.Components.wq.f).start();
                        this.Z.setTag(null);
                    }
                    this.Y.a();
                    this.Z.a();
                    w();
                    if (this.o0 == 3) {
                    }
                    z15 = true;
                    if (this.m0) {
                    }
                    this.y.setState(z16);
                    this.x.setState(z16);
                    this.r.e(z16);
                    if (this.l0) {
                    }
                    if (z16) {
                    }
                    vb1 vb1Var22 = this.S0;
                    org.telegram.messenger.g0.r(vb1Var22);
                    if (this.o0 == 3) {
                    }
                }
            }
            v(z21);
            if (this.o0 == 5) {
                z9 = this.r0;
                if (!z9 && this.p0 != 5) {
                    this.F.b(org.telegram.messenger.id.M0(2131743419, null), true, z21);
                }
                z20 = false;
                z10 = false;
                if (this.n0 == null) {
                }
            } else {
                z10 = true;
                this.r0 = true;
                z9 = false;
                z20 = false;
                if (this.n0 == null) {
                }
            }
        }
        z9 = false;
        z20 = false;
        z10 = false;
        if (this.n0 == null) {
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z9) {
    }
}
