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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class hc1 implements VoIPService.StateListener, org.telegram.messenger.fs {
    public static hc1 m1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public org.telegram.ui.Components.voip.p0 E;
    public boolean E0;
    public TextView F;
    public float F0;
    public org.telegram.ui.Components.voip.k2 G;
    public boolean G0;
    public gc1 H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public ImageView J;
    public boolean J0;
    public int K;
    public long K0;
    public kg.k L;
    public int M;
    public org.telegram.ui.Components.voip.d2 M0;
    public wg.d1 N;
    public org.telegram.ui.Components.pp N0;
    public d61 O;
    public org.telegram.ui.Components.pp O0;
    public FrameLayout P;
    public ValueAnimator P0;
    public gi.j Q;
    public di.n4 R;
    public boolean R0;
    public hi.x4 S;
    public TextView T;
    public org.telegram.ui.ActionBar.o2 U;
    public boolean U0;
    public org.telegram.ui.Components.voip.q V;
    public float V0;
    public float W0;
    public float X0;
    public dc1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.q1 Z;
    public float Z0;
    public final int a;
    public org.telegram.ui.Components.voip.q1 a0;
    public boolean a1;
    public Activity b;
    public boolean b0;
    public float b1;
    public final TLRPC.User c;
    public TextureViewRenderer c0;
    public float c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.n2 d0;
    public int d1;
    public org.telegram.ui.Components.voip.e3 e;
    public org.telegram.ui.Components.voip.n2 e0;
    public int e1;
    public org.telegram.ui.Components.voip.e3 f;
    public org.telegram.ui.Components.voip.e f0;
    public boolean g0;
    public boolean g1;
    public org.telegram.ui.Components.voip.e3 h;
    public View h0;
    public boolean h1;
    public View i0;
    public ValueAnimator i1;
    public org.telegram.ui.Components.voip.m1 j0;
    public boolean j1;
    public org.telegram.ui.Components.voip.n2 k1;
    public boolean l1;
    public boolean m0;
    public ec1 n;
    public boolean n0;
    public bc1 o0;
    public int p0;
    public int q0;
    public WindowInsets r0;
    public cc1 s;
    public boolean s0;
    public float t0;
    public ac1 u0;
    public int v0;
    public org.telegram.ui.Components.voip.x2 w;
    public AccessibilityManager w0;
    public org.telegram.ui.Components.voip.u2 x;
    public org.telegram.ui.Components.voip.y2 y;
    public boolean z0;
    public final org.telegram.ui.Components.voip.l1 r = new org.telegram.ui.Components.voip.l1();
    public final org.telegram.ui.Components.q9[] W = new org.telegram.ui.Components.q9[4];
    public final Drawable[] X = new Drawable[4];
    public final Paint k0 = new Paint();
    public final Paint l0 = new Paint();
    public boolean x0 = true;
    public float y0 = 1.0f;
    public final h2.f L0 = new h2.f((int[]) null);
    public final iz0 Q0 = new iz0(this, 16);
    public final tb1 S0 = new tb1(this, 12);
    public final tb1 T0 = new tb1(this, 13);
    public float f1 = 1.0f;

    public hc1(int i7) {
        this.a = i7;
        this.c = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(org.telegram.messenger.j10.i(i7).e()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.q0 = -1;
        this.p0 = sharedState.getCallState();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.R4);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.P4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.l4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.E2);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.J5);
    }

    public static void a(hc1 hc1Var) {
        hc1 hc1Var2;
        int i7 = 0;
        if (hc1Var.g1) {
            hc1Var.g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            hc1Var.i1 = ofFloat;
            hc1Var2 = hc1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.h0(hc1Var2, hc1Var.f1, hc1Var.Y0, hc1Var.Z0, 1));
            hc1Var2.i1.addListener(new xb1(hc1Var2, i7));
            hc1Var2.i1.setDuration(350L);
            hc1Var2.i1.setInterpolator(org.telegram.ui.Components.lr.f);
            hc1Var2.i1.start();
        } else {
            hc1Var2 = hc1Var;
        }
        hc1Var2.h1 = false;
        hc1Var2.a1 = false;
    }

    public static void h(int[] iArr, int i7) {
        hc1 hc1Var = m1;
        if (hc1Var != null) {
            if (i7 == 101) {
                if (VoIPService.getSharedState() == null) {
                    hc1Var.u0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    hc1Var.i(new dd0(7));
                } else if (!hc1Var.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.b2.h(hc1Var.b, new tb1(hc1Var, 3), i7);
                    return;
                }
            }
            if (i7 == 102) {
                if (VoIPService.getSharedState() == null) {
                    hc1Var.u0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    hc1Var.t();
                }
            }
        }
    }

    public static void n(Activity activity, int i7) {
        hc1 hc1Var = m1;
        if (hc1Var != null && hc1Var.u0.getParent() == null) {
            hc1 hc1Var2 = m1;
            if (hc1Var2 != null) {
                hc1Var2.d0.d.release();
                m1.e0.d.release();
                m1.c0.release();
                ac1 ac1Var = m1.u0;
                if (ac1Var != null) {
                    ac1Var.d();
                }
                m1.c();
            }
            m1 = null;
        }
        if (m1 != null || activity.isFinishing()) {
            return;
        }
        boolean z10 = org.telegram.ui.Components.voip.h2.d() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        hc1 hc1Var3 = new hc1(i7);
        hc1Var3.b = activity;
        m1 = hc1Var3;
        ac1 ac1Var2 = new ac1(activity, !z10, hc1Var3);
        m1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        m1.getClass();
        ac1Var2.setLockOnScreen(m1.J0);
        hc1Var3.u0 = ac1Var2;
        sb1 sb1Var = new sb1(hc1Var3, 3);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(ac1Var2, sb1Var);
        ((WindowManager) activity.getSystemService("window")).addView(ac1Var2, org.telegram.ui.Components.voip.r2.a());
        hc1Var3.t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        hc1Var3.w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
        cc1 cc1Var = new cc1(hc1Var3, activity);
        cc1Var.setClipToPadding(false);
        cc1Var.setClipChildren(false);
        cc1Var.setBackgroundColor(-16777216);
        hc1Var3.x();
        hc1Var3.s = cc1Var;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z11 = sharedState != null && sharedState.isConference();
        org.telegram.ui.Components.voip.l1 l1Var = hc1Var3.r;
        hc1Var3.w = new org.telegram.ui.Components.voip.x2(activity, z11, l1Var);
        org.telegram.ui.Components.voip.n2 n2Var = new org.telegram.ui.Components.voip.n2(activity, false, true, false, false);
        hc1Var3.d0 = n2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        n2Var.d.setScalingType(scalingType);
        hc1Var3.d0.d.setEnableHardwareScaler(true);
        hc1Var3.d0.d.setRotateTextureWithScreen(true);
        hc1Var3.d0.b0 = 1;
        cc1Var.addView(hc1Var3.w, c8.ma.c(-1.0f, -1));
        TLRPC.User user = hc1Var3.d;
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(activity, user, l1Var);
        hc1Var3.x = u2Var;
        cc1Var.addView(u2Var, c8.ma.c(-1.0f, -1));
        org.telegram.ui.Components.voip.y2 y2Var = new org.telegram.ui.Components.voip.y2(activity);
        if (org.telegram.messenger.pc.e(512)) {
            int i10 = org.telegram.ui.ActionBar.n6.a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.get(12);
            calendar.get(11);
            if ((i11 == 11 && i12 >= 24 && i12 <= 31) || (i11 == 0 && i12 == 1)) {
                y2Var.a = new org.telegram.ui.Components.lu0(0);
            }
        }
        hc1Var3.y = y2Var;
        cc1Var.addView(y2Var, c8.ma.c(220.0f, -1));
        cc1Var.addView(hc1Var3.d0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new org.telegram.ui.Components.p9(orientation, new int[]{-14994098, -14328963}).f(org.telegram.ui.Cells.c5.y(0.5f, 1), new f71(hc1Var3, 1), 0L);
        org.telegram.ui.Components.voip.q1 q1Var = new org.telegram.ui.Components.voip.q1(activity);
        hc1Var3.Z = q1Var;
        q1Var.setDelegate(new sb1(hc1Var3, 2));
        hc1Var3.Z.d(1.0f, 1.0f);
        hc1Var3.b0 = true;
        org.telegram.ui.Components.voip.n2 n2Var2 = new org.telegram.ui.Components.voip.n2(activity, true, false);
        hc1Var3.e0 = n2Var2;
        n2Var2.d.setIsCamera(true);
        hc1Var3.e0.d.setUseCameraRotation(true);
        hc1Var3.Z.setOnTapListener(new ub1(hc1Var3, 1));
        hc1Var3.e0.d.setMirror(true);
        hc1Var3.Z.addView(hc1Var3.e0);
        org.telegram.ui.Components.voip.q1 q1Var2 = new org.telegram.ui.Components.voip.q1(activity);
        hc1Var3.a0 = q1Var2;
        q1Var2.T = true;
        q1Var2.c(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        hc1Var3.c0 = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        hc1Var3.c0.setIsCamera(false);
        hc1Var3.c0.setFpsReduction(30.0f);
        hc1Var3.c0.setScalingType(scalingType);
        hc1Var3.a0.addView(hc1Var3.c0, c8.ma.e(-1, -2, 17));
        hc1Var3.a0.setOnTapListener(new ub1(hc1Var3, 2));
        hc1Var3.a0.setVisibility(8);
        cc1Var.addView(hc1Var3.Z, c8.ma.c(-2.0f, -2));
        cc1Var.addView(hc1Var3.a0);
        View view = new View(activity);
        hc1Var3.h0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.o(-16777216, org.telegram.messenger.ks.L1)}));
        cc1Var.addView(hc1Var3.h0, c8.ma.e(-1, org.telegram.messenger.ks.q2, 80));
        View view2 = new View(activity);
        hc1Var3.i0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{i0.a.o(-16777216, org.telegram.messenger.ks.n1), 0}));
        cc1Var.addView(hc1Var3.i0, c8.ma.e(-1, org.telegram.messenger.ks.q2, 48));
        d61 d61Var = new d61(23, activity, hc1Var3);
        hc1Var3.O = d61Var;
        d61Var.setOrientation(0);
        hc1Var3.O.setPadding(0, 0, 0, org.telegram.messenger.g0.L(30.0f));
        hc1Var3.O.setClipToPadding(false);
        hc1Var3.O.setContentDescription(org.telegram.messenger.gd.M0(2131743065, null));
        hc1Var3.O.setOnClickListener(new ub1(hc1Var3, 3));
        hc1Var3.Q = new gi.j(activity, l1Var);
        FrameLayout frameLayout = new FrameLayout(activity);
        hc1Var3.P = frameLayout;
        frameLayout.addView(hc1Var3.Q, c8.ma.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        hc1Var3.P.setVisibility(8);
        hc1Var3.P.setOnClickListener(new ub1(hc1Var3, 4));
        hi.x4 x4Var = new hi.x4(activity, l1Var);
        hc1Var3.S = x4Var;
        x4Var.setOrientation(1);
        TextView textView = new TextView(activity);
        hc1Var3.T = textView;
        textView.setText(org.telegram.messenger.gd.M0(2131743254, null));
        hc1Var3.T.setTextSize(1, 15.0f);
        hc1Var3.T.setTypeface(org.telegram.messenger.g0.o());
        hc1Var3.T.setTextColor(-1);
        hc1Var3.T.setGravity(17);
        org.telegram.ui.ActionBar.o2 o2Var = new org.telegram.ui.ActionBar.o2(8, activity, hc1Var3);
        hc1Var3.U = o2Var;
        o2Var.setTextSize(1, 15.0f);
        hc1Var3.U.setTextColor(-1);
        hc1Var3.U.setGravity(17);
        hc1Var3.U.setText(org.telegram.messenger.gd.a0("CallEmojiKeyTooltip", null, 2131752616, TextUtils.ellipsize(org.telegram.messenger.o10.k(user, true), hc1Var3.U.getPaint(), org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END)));
        hc1Var3.S.setVisibility(8);
        hc1Var3.S.addView(hc1Var3.T);
        hc1Var3.S.addView(hc1Var3.U, c8.ma.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        hc1Var3.S.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
        int i13 = 0;
        while (i13 < 4) {
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(activity);
            org.telegram.ui.Components.q9[] q9VarArr = hc1Var3.W;
            q9VarArr[i13] = q9Var;
            q9VarArr[i13].getImageReceiver().S0 = true;
            hc1Var3.O.addView(q9VarArr[i13], c8.ma.k(i13 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i13++;
        }
        dc1 dc1Var = new dc1(hc1Var3, activity);
        hc1Var3.Y = dc1Var;
        dc1Var.setOrientation(1);
        hc1Var3.Y.setFocusable(true);
        hc1Var3.Y.setFocusableInTouchMode(true);
        hc1Var3.E = new org.telegram.ui.Components.voip.p0(activity);
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        b9Var.r(user);
        org.telegram.ui.Components.voip.p0 p0Var = hc1Var3.E;
        int i14 = hc1Var3.a;
        p0Var.b.j(org.telegram.messenger.fc.m(i14, 0, user), null, b9Var, user);
        hc1Var3.E.setRoundRadius(org.telegram.messenger.g0.L(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        hc1Var3.F = textView2;
        textView2.setTextSize(1, 28.0f);
        hc1Var3.F.setText(org.telegram.messenger.j6.m(org.telegram.messenger.i5.m(0, user.first_name, user.last_name), hc1Var3.F.getPaint().getFontMetricsInt(), false, null, 0));
        hc1Var3.F.setMaxLines(2);
        hc1Var3.F.setEllipsize(TextUtils.TruncateAt.END);
        hc1Var3.F.setTextColor(-1);
        hc1Var3.F.setGravity(1);
        hc1Var3.F.setImportantForAccessibility(2);
        hc1Var3.Y.addView(hc1Var3.F, c8.ma.t(-2, -2, 1, 8, 0, 8, 6));
        org.telegram.ui.Components.voip.k2 k2Var = new org.telegram.ui.Components.voip.k2(activity);
        k2Var.a = new TextView[2];
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            k2Var.a[i15] = new TextView(activity);
            k2Var.a[i15].setTextSize(1, 15.0f);
            k2Var.a[i15].setTextColor(-1);
            k2Var.a[i15].setGravity(1);
            k2Var.addView(k2Var.a[i15]);
            i15++;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        k2Var.c = frameLayout2;
        org.telegram.ui.Components.voip.a1 a1Var = new org.telegram.ui.Components.voip.a1(k2Var, activity, l1Var);
        a1Var.setTextSize(1, 15.0f);
        a1Var.setTextColor(-1);
        a1Var.setGravity(1);
        a1Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f));
        a1Var.setText(org.telegram.messenger.gd.M0(2131742980, null));
        frameLayout2.addView(a1Var, c8.ma.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        k2Var.addView(frameLayout2, c8.ma.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        k2Var.b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        k2Var.addView(textView3, c8.ma.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.M0(2131743016, null));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new kg.r1(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        org.telegram.ui.Components.voip.o2 o2Var2 = new org.telegram.ui.Components.voip.o2(activity);
        k2Var.d = o2Var2;
        k2Var.addView(o2Var2, c8.ma.c(-2.0f, -1));
        hc1Var3.G = k2Var;
        WeakHashMap weakHashMap2 = r0.i0.a;
        k2Var.setImportantForAccessibility(4);
        hc1Var3.Y.addView(hc1Var3.G, c8.ma.t(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            gc1 gc1Var = new gc1(activity);
            hc1Var3.H = gc1Var;
            long j3 = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i17 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null || i17 > 0) {
                int max = Math.max(i17, groupParticipants == null ? 0 : groupParticipants.size());
                int min = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
                org.telegram.ui.Components.d9 d9Var = gc1Var.b;
                d9Var.i(min);
                int i18 = 0;
                while (i18 < min) {
                    d9Var.j(i18, i14, org.telegram.messenger.mp.u1(i14).g2(org.telegram.messenger.n5.o(groupParticipants.get(i18).peer)));
                    i18++;
                    j3 = j3;
                }
                long j10 = j3;
                d9Var.a(false, true);
                if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && org.telegram.messenger.n5.o(groupParticipants.get(0).peer) == j10))) {
                    gc1Var.setVisibility(8);
                } else {
                    gc1Var.c = new org.telegram.ui.Components.vy0(org.telegram.messenger.gd.H(',', "Participants", max), 14.0f, org.telegram.messenger.g0.o());
                    gc1Var.setVisibility(0);
                    gc1Var.invalidate();
                }
            } else {
                gc1Var.setVisibility(8);
            }
            hc1Var3.Y.addView(hc1Var3.H, c8.ma.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        hc1Var3.Y.setClipChildren(false);
        hc1Var3.Y.setClipToPadding(false);
        hc1Var3.Y.setPadding(0, 0, 0, org.telegram.messenger.g0.L(15.0f));
        hc1Var3.V = new org.telegram.ui.Components.voip.q(activity);
        hc1Var3.R = new di.n4(activity, l1Var);
        hc1Var3.V.setAlpha(0.0f);
        hc1Var3.R.setVisibility(8);
        cc1Var.addView(hc1Var3.E, c8.ma.d(org.telegram.messenger.ks.i3, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        cc1Var.addView(hc1Var3.Y, c8.ma.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        cc1Var.addView(hc1Var3.P, c8.ma.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        cc1Var.addView(hc1Var3.S, c8.ma.d(org.telegram.messenger.ks.b5, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        cc1Var.addView(hc1Var3.O, c8.ma.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        cc1Var.addView(hc1Var3.V, c8.ma.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        cc1Var.addView(hc1Var3.R, c8.ma.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        hc1Var3.j0 = new org.telegram.ui.Components.voip.m1(activity);
        hc1Var3.e = new org.telegram.ui.Components.voip.e3(activity, l1Var);
        hc1Var3.f = new org.telegram.ui.Components.voip.e3(activity, l1Var);
        hc1Var3.h = new org.telegram.ui.Components.voip.e3(activity, l1Var);
        hc1Var3.n = new ec1(activity, 52.0f);
        hc1Var3.e.setTranslationY(org.telegram.messenger.g0.L(100.0f));
        hc1Var3.e.setScaleX(0.0f);
        hc1Var3.e.setScaleY(0.0f);
        hc1Var3.e.animate().setStartDelay(org.telegram.messenger.ks.g2).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        hc1Var3.f.setTranslationY(org.telegram.messenger.g0.L(100.0f));
        hc1Var3.f.setScaleX(0.0f);
        hc1Var3.f.setScaleY(0.0f);
        hc1Var3.f.animate().setStartDelay(org.telegram.messenger.ks.w2).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        hc1Var3.h.setTranslationY(org.telegram.messenger.g0.L(100.0f));
        hc1Var3.h.setScaleX(0.0f);
        hc1Var3.h.setScaleY(0.0f);
        hc1Var3.h.animate().setStartDelay(org.telegram.messenger.ks.M2).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        hc1Var3.n.setTranslationY(org.telegram.messenger.g0.L(100.0f));
        hc1Var3.n.setScaleX(0.0f);
        hc1Var3.n.setScaleY(0.0f);
        hc1Var3.n.animate().setStartDelay(org.telegram.messenger.ks.c3).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        hc1Var3.j0.addView(hc1Var3.e);
        hc1Var3.j0.addView(hc1Var3.f);
        hc1Var3.j0.addView(hc1Var3.h);
        hc1Var3.j0.addView(hc1Var3.n);
        org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
        hc1Var3.f0 = eVar;
        eVar.setListener(new fc1(hc1Var3));
        hc1Var3.f0.setScaleX(1.15f);
        hc1Var3.f0.setScaleY(1.15f);
        cc1Var.addView(hc1Var3.j0, c8.ma.e(-1, -2, 80));
        float f10 = org.telegram.messenger.g0.Q1() ? 100 : 27;
        cc1Var.addView(hc1Var3.f0, c8.ma.d(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(activity);
        hc1Var3.J = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(i0.a.o(-1, 76), 1, -1));
        hc1Var3.J.setImageResource(R.drawable.msg_addcontact);
        hc1Var3.J.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        cc1Var.addView(hc1Var3.J, c8.ma.e(56, 56, 53));
        c8.ra.a(hc1Var3.J);
        ImageView imageView2 = new ImageView(activity);
        hc1Var3.I = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.n6.h0(i0.a.o(-1, 76), 1, -1));
        hc1Var3.I.setImageResource(R.drawable.msg_call_minimize_shadow);
        hc1Var3.I.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        hc1Var3.I.setContentDescription(org.telegram.messenger.gd.M0(2131753754, null));
        cc1Var.addView(hc1Var3.I, c8.ma.e(56, 56, 51));
        c8.ra.a(hc1Var3.I);
        kg.k kVar = new kg.k(activity, 5);
        hc1Var3.L = kVar;
        kVar.setContentDescription(org.telegram.messenger.gd.M0(2131743002, null));
        hc1Var3.L.setBackground(org.telegram.ui.ActionBar.n6.h0(i0.a.o(-1, 76), 1, -1));
        hc1Var3.L.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        cc1Var.addView(hc1Var3.L, c8.ma.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        hc1Var3.L.setAlpha(0.0f);
        hc1Var3.L.setOnClickListener(new ub1(hc1Var3, 5));
        int i19 = 6;
        hc1Var3.I.setOnClickListener(new ub1(hc1Var3, i19));
        hc1Var3.J.setOnClickListener(new cd0(19, hc1Var3, activity));
        if (hc1Var3.u0.b) {
            hc1Var3.I.setVisibility(8);
            hc1Var3.J.setVisibility(8);
        }
        org.telegram.ui.Components.voip.d2 d2Var = new org.telegram.ui.Components.voip.d2(activity);
        d2Var.a = new HashMap();
        d2Var.b = new ArrayList();
        d2Var.c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        d2Var.r = textPaint;
        d2Var.setOrientation(1);
        d2Var.n = l1Var;
        TransitionSet transitionSet = new TransitionSet();
        d2Var.d = transitionSet;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.j0(3).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        hc1Var3.M0 = d2Var;
        d2Var.setGravity(80);
        hc1Var3.M0.setOnViewsUpdated(new tb1(hc1Var3, 5));
        cc1Var.addView(hc1Var3.M0, c8.ma.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.pp ppVar = new org.telegram.ui.Components.pp(activity, 3, l1Var, true);
        ppVar.r(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        ppVar.L = alignment;
        ppVar.d = -1L;
        ppVar.r0 = new tb1(hc1Var3, i19);
        ppVar.U = true;
        ppVar.h = org.telegram.messenger.g0.L(320.0f);
        ppVar.e = true;
        ppVar.n(10.0f, 6.0f, 10.0f, 6.0f);
        ppVar.s(8.0f);
        hc1Var3.N0 = ppVar;
        ppVar.v(org.telegram.messenger.gd.M0(2131744019, null));
        cc1Var.addView(hc1Var3.N0, c8.ma.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.pp ppVar2 = new org.telegram.ui.Components.pp(activity, 1, l1Var, false);
        ppVar2.r(true);
        ppVar2.L = alignment;
        ppVar2.d = 4000L;
        ppVar2.U = true;
        ppVar2.h = org.telegram.messenger.g0.L(320.0f);
        ppVar2.e = true;
        ppVar2.n(10.0f, 6.0f, 10.0f, 6.0f);
        ppVar2.s(8.0f);
        hc1Var3.O0 = ppVar2;
        ppVar2.v(org.telegram.messenger.gd.M0(2131743065, null));
        cc1Var.addView(hc1Var3.O0, c8.ma.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        hc1Var3.y();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!hc1Var3.U0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                hc1Var3.U0 = phoneCall != null && phoneCall.video;
            }
            hc1Var3.f();
        }
        ac1Var2.addView(cc1Var);
        if (z10) {
            hc1Var3.F0 = 0.0f;
            hc1Var3.I0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                hc1Var3.d0.setStub(org.telegram.ui.Components.voip.h2.d().s);
                hc1Var3.e0.setStub(org.telegram.ui.Components.voip.h2.d().r);
            }
            hc1Var3.u0.setAlpha(0.0f);
            hc1Var3.y();
            hc1Var3.E0 = true;
            org.telegram.ui.Components.voip.h2.T = true;
            if (org.telegram.ui.Components.voip.h2.V != null) {
                org.telegram.ui.Components.voip.h2.U.getClass();
                throw null;
            }
            hc1Var3.L0.d();
            org.telegram.messenger.g0.h3(new tb1(hc1Var3, 11), 32L);
        } else {
            hc1Var3.F0 = 1.0f;
            hc1Var3.x();
        }
        org.telegram.ui.Components.voip.i2.g();
    }

    public final ValueAnimator b(boolean z10) {
        char c10;
        float f10;
        float measuredWidth;
        final float measuredHeight;
        final float f11;
        final boolean z11;
        float f12;
        float f13;
        float f14;
        boolean z12;
        float f15;
        this.Z.animate().cancel();
        float f16 = org.telegram.ui.Components.voip.h2.d().d.x + org.telegram.ui.Components.voip.h2.d().F;
        float f17 = org.telegram.ui.Components.voip.h2.d().d.y + org.telegram.ui.Components.voip.h2.d().G;
        final float x10 = this.Z.getX();
        final float y10 = this.Z.getY();
        final float scaleX = this.Z.getScaleX();
        org.telegram.ui.Components.voip.h2.U.getClass();
        final float measuredWidth2 = f16 - ((this.d0.getMeasuredWidth() - (this.d0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f17 - ((this.d0.getMeasuredHeight() - (this.d0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f18 = 1.0f;
        if (this.m0) {
            int measuredWidth3 = this.Z.getMeasuredWidth();
            if (!this.n0 || measuredWidth3 == 0) {
                c10 = 0;
                f10 = 4.0f;
                measuredWidth = 1.0f;
                f14 = 1.0f;
                z12 = false;
                f15 = 0.0f;
            } else {
                f15 = (this.u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c10 = 0;
                f10 = 4.0f;
                measuredWidth = org.telegram.ui.Cells.c0.z(org.telegram.ui.Components.voip.h2.d().f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.h2.d().f * 0.25f) + (f16 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * f15)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
                f14 = org.telegram.ui.Cells.c0.z(org.telegram.ui.Components.voip.h2.d().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.h2.d().h * 0.25f) + (f17 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * f15)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
                z12 = true;
            }
            measuredHeight = f14;
            z11 = z12;
            f11 = f15;
        } else {
            c10 = 0;
            f10 = 4.0f;
            measuredWidth = f16 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f17 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * 0.25f)) / 2.0f);
            f11 = 0.25f;
            z11 = true;
        }
        final float f19 = measuredWidth;
        final float L = this.m0 ? org.telegram.messenger.g0.L(f10) : 0.0f;
        final float L2 = (org.telegram.messenger.g0.L(f10) * 1.0f) / f11;
        if (this.m0) {
            org.telegram.ui.Components.voip.h2.U.getClass();
            f12 = 1.0f;
            f18 = 0.0f;
        } else {
            f12 = 1.0f;
        }
        float f20 = f12;
        if (z10) {
            if (z11) {
                this.Z.setScaleX(f11);
                this.Z.setScaleY(f11);
                this.Z.setTranslationX(f19);
                this.Z.setTranslationY(measuredHeight);
                this.Z.setCornerRadius(L2);
                this.Z.setAlpha(f18);
            }
            this.d0.setScaleX(0.25f);
            this.d0.setScaleY(0.25f);
            this.d0.setTranslationX(measuredWidth2);
            this.d0.setTranslationY(measuredHeight2);
            f13 = 0.25f;
            this.d0.setRoundCorners((org.telegram.messenger.g0.L(6.0f) * f20) / 0.25f);
        } else {
            f13 = 0.25f;
        }
        float f21 = z10 ? f20 : 0.0f;
        float f22 = z10 ? 0.0f : f20;
        float[] fArr = new float[2];
        fArr[c10] = f21;
        fArr[1] = f22;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.F0 = z10 ? 0.0f : f20;
        x();
        final float f23 = f13;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.wb1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f24 = 1.0f - floatValue;
                hc1 hc1Var = hc1.this;
                hc1Var.F0 = f24;
                hc1Var.x();
                if (z11) {
                    float f25 = (f11 * floatValue) + (scaleX * f24);
                    hc1Var.Z.setScaleX(f25);
                    hc1Var.Z.setScaleY(f25);
                    hc1Var.Z.setTranslationX((f19 * floatValue) + (x10 * f24));
                    hc1Var.Z.setTranslationY((measuredHeight * floatValue) + (y10 * f24));
                    hc1Var.Z.setCornerRadius((L2 * floatValue) + (L * f24));
                    hc1Var.Z.setAlpha((f18 * floatValue) + (1.0f * f24));
                }
                float f26 = (f23 * floatValue) + (1.0f * f24);
                hc1Var.d0.setScaleX(f26);
                hc1Var.d0.setScaleY(f26);
                float f27 = 0.0f * f24;
                float f28 = (measuredWidth2 * floatValue) + f27;
                float f29 = (measuredHeight2 * floatValue) + f27;
                hc1Var.d0.setTranslationX(f28);
                hc1Var.d0.setTranslationY(f29);
                hc1Var.d0.setRoundCorners(((org.telegram.messenger.g0.L(4.0f) * floatValue) * 1.0f) / f26);
                if (!hc1Var.Z.Q) {
                    hc1Var.e0.d(false, floatValue);
                }
                hc1Var.u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void c() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.R4);
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.P4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.l4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.E2);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.J5);
        wg.d1 d1Var = this.N;
        if (d1Var != null) {
            d1Var.dismiss();
            this.N = null;
        }
    }

    public final void d(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.u2 u2Var = this.x;
            int i7 = 1;
            if (u2Var.L && z10 != u2Var.F) {
                u2Var.F = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                u2Var.c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.t2(u2Var, i7));
                u2Var.c.setInterpolator(org.telegram.ui.Components.lr.f);
                u2Var.c.setDuration(200L);
                u2Var.c.start();
            }
            if (z10) {
                int i10 = org.telegram.messenger.bz.f1;
                if (i10 < 2) {
                    org.telegram.messenger.bz.f1 = i10 + 2;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.bz.f1);
                    edit.apply();
                }
                this.O0.f(true);
                org.telegram.messenger.g0.r(this.S0);
                this.R0 = false;
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(0L).translationY(org.telegram.messenger.g0.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.lr.f).start();
                }
                this.P.animate().setListener(null).cancel();
                this.P.setVisibility(0);
                this.P.setAlpha(0.0f);
                this.P.setScaleX(0.3f);
                this.P.setScaleY(0.3f);
                this.P.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.lr.g).start();
                ViewPropertyAnimator translationY = this.O.animate().scaleX(1.72f).scaleY(1.72f).translationY(org.telegram.messenger.g0.L(140.0f));
                org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.f;
                org.telegram.messenger.n10.o(translationY, lrVar, 400L);
                this.S.animate().setListener(null).cancel();
                this.S.setVisibility(0);
                this.S.setTranslationY(-org.telegram.messenger.g0.L(120.0f));
                this.S.setScaleX(0.7f);
                this.S.setScaleY(0.7f);
                this.S.setAlpha(0.0f);
                this.S.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new xb1(this, 3)).setInterpolator(lrVar).start();
            } else {
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.lr.f).start();
                }
                this.P.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.lr lrVar2 = org.telegram.ui.Components.lr.f;
                duration.setInterpolator(lrVar2).setListener(new on(this.P)).start();
                this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(lrVar2).setDuration(280L).start();
                this.S.animate().setListener(null).cancel();
                this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.g0.L(120.0f)).setListener(new xb1(this, 4)).setDuration(250L).setInterpolator(lrVar2).start();
            }
            this.q0 = this.p0;
            y();
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.P4) {
            if (this.p0 != 17 || VoIPService.getSharedInstance() == null) {
                return;
            }
            this.e0.d.release();
            this.d0.d.release();
            this.c0.release();
            f();
            VoIPService.getSharedInstance().registerStateListener(this);
            return;
        }
        if (i7 == org.telegram.messenger.ks.l4) {
            v(true);
            return;
        }
        if (i7 == org.telegram.messenger.ks.E2) {
            this.u0.b();
            return;
        }
        if (i7 == org.telegram.messenger.ks.R4) {
            this.E.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
            return;
        }
        if (i7 == org.telegram.messenger.ks.J5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.g0 = booleanValue;
            if (booleanValue) {
                this.E.b(true, true);
            }
        }
    }

    public final void e() {
        this.u0.b();
    }

    public final void f() {
        this.e0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new yb1(this));
        this.d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new zb1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.c0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void g() {
        if (this.G0 || this.E0) {
            return;
        }
        bc1 bc1Var = this.o0;
        if (bc1Var != null) {
            bc1Var.a(false, false);
            return;
        }
        if (this.m0 && this.n0 && this.H0) {
            this.H0 = false;
            this.Z.setRelativePosition(this.a0);
            this.b0 = false;
            this.q0 = this.p0;
            y();
            return;
        }
        if (this.C0) {
            d(false);
            return;
        }
        if (this.S.getVisibility() != 8) {
            return;
        }
        if (!this.D0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isConverting()) {
            this.u0.b();
            return;
        }
        if (this.G0 || m1 == null) {
            return;
        }
        this.G0 = true;
        if (VoIPService.getSharedInstance() != null) {
            int measuredHeight = m1.u0.getMeasuredHeight();
            hc1 hc1Var = m1;
            org.telegram.ui.Components.voip.h2.f(hc1Var.b, hc1Var.a, hc1Var.u0.getMeasuredWidth(), measuredHeight, 1);
            WindowInsets windowInsets = m1.r0;
            if (windowInsets != null) {
                org.telegram.ui.Components.voip.h2.W = windowInsets.getSystemWindowInsetTop();
                m1.r0.getSystemWindowInsetBottom();
            }
        }
        if (org.telegram.ui.Components.voip.h2.d() == null) {
            return;
        }
        ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).setDuration(150L);
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.f;
        duration.setInterpolator(lrVar).start();
        this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(lrVar).start();
        this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(lrVar).start();
        this.O.animate().alpha(0.0f).setDuration(150L).setInterpolator(lrVar).start();
        this.Y.animate().alpha(0.0f).setDuration(150L).setInterpolator(lrVar).start();
        this.j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(lrVar).start();
        this.h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(lrVar).start();
        this.i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(lrVar).start();
        this.a0.animate().alpha(0.0f).setDuration(350L).setInterpolator(lrVar).start();
        this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(lrVar).start();
        org.telegram.ui.Components.voip.h2.T = true;
        this.E0 = true;
        ValueAnimator b10 = b(false);
        this.L0.d();
        b10.addListener(new xb1(this, 1));
        b10.setDuration(350L);
        b10.setInterpolator(lrVar);
        b10.start();
    }

    public final void i(Runnable runnable) {
        if (this.f.getVisibility() == 0) {
            this.f0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f0;
            ValueAnimator valueAnimator = eVar.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.c0 = null;
                eVar.V.stop();
            }
            runnable.run();
            return;
        }
        this.n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f.animate().cancel();
        this.f0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f0;
        ValueAnimator valueAnimator2 = eVar2.c0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.c0 = null;
            eVar2.V.stop();
        }
        this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, org.telegram.messenger.gd.M0(2131743174, null), false, false);
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
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        org.telegram.messenger.g0.L(52.0f);
        final int L = org.telegram.messenger.g0.L(24.0f);
        final int L2 = org.telegram.messenger.g0.L(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.vb1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                hc1 hc1Var = hc1.this;
                hc1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                hc1Var.f0.setTranslationY(L2 * floatValue);
                int i7 = (int) (marginEnd - ((r1 + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i7;
                marginLayoutParams2.rightMargin = i7;
                hc1Var.f0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, (Property<org.telegram.ui.Components.voip.e, Float>) View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, (Property<org.telegram.ui.Components.voip.e, Float>) View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, (Property<org.telegram.ui.Components.voip.e, Float>) View.ALPHA, eVar5.getAlpha(), this.f0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.h60(17, this, runnable));
        animatorSet.start();
        org.telegram.messenger.g0.h3(new tb1(this, 7), 133L);
    }

    public final void j(org.telegram.ui.Components.voip.e3 e3Var, VoIPService voIPService) {
        if (!this.n0) {
            e3Var.d(2, false, false);
            e3Var.setOnBtnClickedListener(null);
            e3Var.setEnabled(false);
        } else {
            e3Var.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                e3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
            } else {
                e3Var.d(2, voIPService.isSwitchingCamera(), false);
            }
            e3Var.setOnBtnClickedListener(new z6(this, voIPService, e3Var, 23));
        }
    }

    public final void k(org.telegram.ui.Components.voip.e3 e3Var, VoIPService voIPService, boolean z10) {
        e3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.q1 q1Var = this.Z;
        boolean isMicMute = voIPService.isMicMute();
        if (z10) {
            ValueAnimator valueAnimator = q1Var.g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(q1Var.L, isMicMute ? 1.0f : 0.0f);
            q1Var.g0 = ofFloat;
            ofFloat.addUpdateListener(q1Var.h0);
            q1Var.g0.setDuration(150L);
            q1Var.g0.start();
        } else {
            ValueAnimator valueAnimator2 = q1Var.g0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            q1Var.L = isMicMute ? 1.0f : 0.0f;
            q1Var.invalidate();
        }
        e3Var.setOnBtnClickedListener(new sb1(this, 4));
    }

    public final void l(org.telegram.ui.Components.voip.e3 e3Var, VoIPService voIPService) {
        int i7;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i10 = 0;
        if (voIPService.isBluetoothOn()) {
            e3Var.d(4, false, false);
            i10 = 2;
        } else {
            if (!voipAudioManager.isSpeakerphoneOn()) {
                e3Var.d(5, false, false);
                i7 = 1;
                e3Var.setEnabled(true);
                e3Var.setOnBtnClickedListener(new bg.g0(this, i7, e3Var, voIPService, 9));
            }
            e3Var.d(5, true, false);
        }
        i7 = i10;
        e3Var.setEnabled(true);
        e3Var.setOnBtnClickedListener(new bg.g0(this, i7, e3Var, voIPService, 9));
    }

    public final void m(org.telegram.ui.Components.voip.e3 e3Var, VoIPService voIPService, boolean z10) {
        if (!((this.n0 || this.m0) ? true : voIPService.isVideoAvailable())) {
            e3Var.d(3, true, false);
            e3Var.setOnClickListener(null);
            e3Var.setEnabled(false);
            return;
        }
        if (!this.n0) {
            e3Var.d(3, true, z10);
        } else if (voIPService.isScreencast()) {
            e3Var.d(3, false, z10);
        } else {
            e3Var.d(3, false, z10);
        }
        e3Var.setOnBtnClickedListener(new sb1(this, 5));
        e3Var.setEnabled(true);
    }

    public final void o(boolean z10, boolean z11) {
        boolean z12 = (this.n0 || this.m0) ? false : true;
        if (!z10) {
            this.E.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.setAlpha(1.0f);
            this.E.setScaleX(1.0f);
            this.E.setScaleY(1.0f);
            this.E.setVisibility(z12 ? 0 : 8);
        } else if (z12 && this.E.getTag() == null) {
            this.E.animate().setListener(null).cancel();
            this.E.setVisibility(0);
            if (this.C0) {
                if (z11) {
                    this.E.setAlpha(0.0f);
                    this.E.setTranslationY(org.telegram.messenger.g0.L(48.0f));
                    this.E.setScaleX(0.1f);
                    this.E.setScaleY(0.1f);
                }
            } else if (z11) {
                this.E.setAlpha(0.0f);
                this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.lr.f).start();
            } else {
                this.E.setAlpha(0.0f);
                this.E.setTranslationY(-org.telegram.messenger.g0.L(135.0f));
                this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.lr.f).start();
            }
        } else if (!z12 && this.E.getTag() != null) {
            this.E.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.lr.f).setListener(new xb1(this, 8)).start();
        }
        this.E.setTag(z12 ? 1 : null);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        u(true);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        this.q0 = this.p0;
        y();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i7, int i10) {
        this.q0 = this.p0;
        if (i10 == 2 && !this.U0) {
            this.U0 = true;
        }
        org.telegram.ui.Components.voip.i2.g();
        y();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.ui.Components.voip.x2 x2Var;
        if (i7 > 0) {
            this.j1 = true;
        }
        if (this.G == null || (x2Var = this.w) == null) {
            return;
        }
        int i10 = x2Var.W;
        if ((i10 == 2 || i10 == 3) && this.j1) {
            org.telegram.messenger.g0.h3(new jw0(this, i7, 3), 400L);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i7) {
        int i10 = this.p0;
        if (i10 != i7) {
            this.q0 = i10;
            this.p0 = i7;
            if (this.u0 != null) {
                y();
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z10) {
        this.q0 = this.p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        y();
    }

    public final void p(CharSequence charSequence) {
        TextView textView;
        if (this.b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.o3 o3Var = new org.telegram.ui.ActionBar.o3(0, this.b, null);
        boolean[] zArr = new boolean[3];
        o3Var.S = org.telegram.messenger.gd.M0(2131743171, null);
        o3Var.U = charSequence;
        o3Var.m0 = org.telegram.messenger.gd.M0(2131747638, null);
        o3Var.n0 = null;
        o3Var.show();
        for (int i7 = 0; i7 < 3; i7++) {
            if (zArr[i7] && (textView = (TextView) o3Var.d(-(i7 + 1))) != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, o3Var.j1);
            }
        }
        o3Var.setCanceledOnTouchOutside(true);
        o3Var.setOnDismissListener(new q5(this, 18));
    }

    public final void q(int i7, boolean z10) {
        AnimatorSet animatorSet;
        if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
            this.Z.setUiVisible(this.x0);
        }
        if (!z10 && (animatorSet = this.A0) != null) {
            animatorSet.removeAllListeners();
            this.A0.cancel();
        }
        if (i7 != 0) {
            boolean z11 = (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() == 0) ? false : z10;
            if (!z10) {
                this.Z.setVisibility(0);
            } else if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 0) {
                if (this.Z.getVisibility() == 8) {
                    this.Z.setAlpha(0.0f);
                    this.Z.setScaleX(0.7f);
                    this.Z.setScaleY(0.7f);
                    this.Z.setVisibility(0);
                }
                AnimatorSet animatorSet2 = this.A0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.A0.cancel();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z, (Property<org.telegram.ui.Components.voip.q1, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<org.telegram.ui.Components.voip.q1, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<org.telegram.ui.Components.voip.q1, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.A0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.q1 q1Var = this.Z;
                if (q1Var.E < 0.0f) {
                    q1Var.d(1.0f, 1.0f);
                    this.b0 = true;
                }
            }
            this.Z.c(i7 == 2, z11);
            this.b0 = i7 != 2;
        } else if (!z10) {
            this.Z.setVisibility(8);
        } else if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() != 0) {
            AnimatorSet animatorSet4 = this.A0;
            if (animatorSet4 != null) {
                animatorSet4.removeAllListeners();
                this.A0.cancel();
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            org.telegram.ui.Components.voip.q1 q1Var2 = this.Z;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(q1Var2, (Property<org.telegram.ui.Components.voip.q1, Float>) View.ALPHA, q1Var2.getAlpha(), 0.0f));
            if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 2) {
                org.telegram.ui.Components.voip.q1 q1Var3 = this.Z;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q1Var3, (Property<org.telegram.ui.Components.voip.q1, Float>) View.SCALE_X, q1Var3.getScaleX(), 0.7f);
                org.telegram.ui.Components.voip.q1 q1Var4 = this.Z;
                animatorSet5.playTogether(ofFloat, ObjectAnimator.ofFloat(q1Var4, (Property<org.telegram.ui.Components.voip.q1, Float>) View.SCALE_Y, q1Var4.getScaleX(), 0.7f));
            }
            this.A0 = animatorSet5;
            animatorSet5.addListener(new xb1(this, 7));
            this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.lr.f);
            this.A0.setStartDelay(50L);
            this.A0.start();
        }
        this.Z.setTag(Integer.valueOf(i7));
    }

    public final void r(boolean z10) {
        int i7;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        iz0 iz0Var = this.Q0;
        if (z10 || !this.x0) {
            if (z10 && !this.x0) {
                this.N0.f(true);
                this.O0.f(true);
                ViewPropertyAnimator translationY = this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.f;
                translationY.setInterpolator(lrVar).start();
                this.G.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(lrVar).start();
                this.L.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(lrVar).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(lrVar).start();
                this.J.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(lrVar).start();
                this.O.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(lrVar).start();
                this.j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(lrVar).start();
                this.h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(lrVar).start();
                this.i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(lrVar).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, 1.0f);
                this.P0 = ofFloat;
                ofFloat.addUpdateListener(iz0Var);
                this.P0.setDuration(150L).setInterpolator(lrVar);
                this.P0.start();
                this.j0.setEnabled(true);
            }
            i7 = 0;
        } else {
            ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L);
            org.telegram.ui.Components.lr lrVar2 = org.telegram.ui.Components.lr.f;
            duration.setInterpolator(lrVar2).start();
            this.I.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(lrVar2).start();
            this.J.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(lrVar2).start();
            this.O.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(lrVar2).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(lrVar2).start();
            this.G.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(lrVar2).start();
            this.j0.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(lrVar2).start();
            this.h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(lrVar2).start();
            this.i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(lrVar2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y0, 0.0f);
            this.P0 = ofFloat2;
            ofFloat2.addUpdateListener(iz0Var);
            this.P0.setDuration(150L).setInterpolator(lrVar2);
            this.P0.start();
            org.telegram.messenger.g0.r(this.S0);
            this.R0 = false;
            this.j0.setEnabled(false);
            this.O0.f(true);
            i7 = org.telegram.messenger.ks.g2;
        }
        this.x0 = z10;
        ac1 ac1Var = this.u0;
        if (z10) {
            ac1Var.setSystemUiVisibility(ac1Var.getSystemUiVisibility() & (-5));
        } else {
            ac1Var.setSystemUiVisibility(ac1Var.getSystemUiVisibility() | 4);
        }
        this.M0.animate().translationY((-org.telegram.messenger.g0.L(16.0f)) - (this.x0 ? org.telegram.messenger.g0.L(80.0f) : 0)).setDuration(150L).setStartDelay(i7).setInterpolator(org.telegram.ui.Components.lr.f).start();
    }

    public final void s() {
        if (VoIPService.getSharedInstance() != null) {
            tb1 tb1Var = this.S0;
            org.telegram.messenger.g0.r(tb1Var);
            this.R0 = false;
            if (this.z0 && this.x0) {
                org.telegram.messenger.g0.h3(tb1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void t() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.w0.isTouchExplorationEnabled()) {
                this.s.announceForAccessibility(!this.n0 ? org.telegram.messenger.gd.M0(2131754732, null) : org.telegram.messenger.gd.M0(2131754733, null));
            }
            if (this.n0) {
                this.e0.c();
                sharedInstance.setVideoState(false, 0);
                sharedInstance.clearCamera();
                this.q0 = this.p0;
                y();
                return;
            }
            if (this.o0 == null) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                this.u0.setLockOnScreen(true);
                this.f.getLocationOnScreen(new int[2]);
                bc1 bc1Var = new bc1(this, this.s.getContext(), r0[0], r0[1]);
                this.o0 = bc1Var;
                WindowInsets windowInsets = this.r0;
                if (windowInsets != null) {
                    bc1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                }
                this.s.addView(this.o0);
            }
        }
    }

    public final void u(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            Transition duration = new org.telegram.ui.ActionBar.j0(4).setDuration(250L);
            org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.f;
            transitionSet.addTransition(duration.setInterpolator(lrVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(lrVar));
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.q2.class, true);
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.e3.class, true);
            TransitionManager.beginDelayedTransition(this.j0, transitionSet);
        }
        int i7 = this.p0;
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
                if (sharedInstance.isScreencast() || !(this.n0 || this.m0)) {
                    l(this.e, sharedInstance);
                    this.L.animate().alpha(0.0f).start();
                } else {
                    j(this.e, sharedInstance);
                    if (this.x0) {
                        this.L.animate().alpha(1.0f).start();
                    }
                }
                m(this.f, sharedInstance, false);
                k(this.h, sharedInstance, z10);
            } else {
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.h.setVisibility(8);
            }
            this.n.setVisibility(8);
        } else {
            if (m1 == null) {
                return;
            }
            if (sharedInstance.isScreencast() || !(this.n0 || this.m0)) {
                l(this.e, sharedInstance);
                this.L.setTag(null);
                this.L.animate().alpha(0.0f).start();
            } else {
                j(this.e, sharedInstance);
                if (this.x0) {
                    this.L.setTag(1);
                    this.L.animate().alpha(1.0f).start();
                }
            }
            m(this.f, sharedInstance, false);
            k(this.h, sharedInstance, z10);
            this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, org.telegram.messenger.gd.M0(2131743174, null), false, z10);
            this.n.setOnClickListener(new ub1(this, i10));
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
            this.n.G = i10;
        }
        w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0165  */
    /* JADX WARN: Type inference failed for: r0v25, types: [org.telegram.ui.Components.q9] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v28, types: [org.telegram.ui.Components.q9] */
    /* JADX WARN: Type inference failed for: r0v29, types: [org.telegram.ui.Components.q9] */
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
    /* JADX WARN: Type inference failed for: r5v7, types: [org.telegram.ui.Components.o5] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.q9[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(boolean z10) {
        VoIPService sharedInstance;
        byte[] bArr;
        ?? r62;
        Drawable[] drawableArr;
        boolean z11;
        fi.s2 s2Var;
        String[] strArr;
        TLRPC.Document document;
        int i7;
        ?? r52;
        if (this.B0 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean z12 = false;
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
            r62 = this.W;
            drawableArr = this.X;
            if (i10 >= 4) {
                break;
            }
            org.telegram.messenger.j6.k(emojifyForCall[i10]);
            org.telegram.messenger.f6 g10 = org.telegram.messenger.j6.g(emojifyForCall[i10]);
            if (g10 != null) {
                g10.setBounds(z12 ? 1 : 0, z12 ? 1 : 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                g10.b();
                int[] iArr = new int[1];
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(org.telegram.messenger.g0.L(28.0f));
                CharSequence m10 = org.telegram.messenger.j6.m(emojifyForCall[i10], textPaint.getFontMetricsInt(), z12, iArr, z12 ? 1 : 0);
                boolean z13 = m10 instanceof Spannable;
                int i11 = this.a;
                if (z13) {
                    Spannable spannable = (Spannable) m10;
                    org.telegram.messenger.g6[] g6VarArr = (org.telegram.messenger.g6[]) spannable.getSpans(z12 ? 1 : 0, spannable.length(), org.telegram.messenger.g6.class);
                    org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) spannable.getSpans(z12 ? 1 : 0, spannable.length(), org.telegram.ui.Components.x5.class);
                    if (g6VarArr != null) {
                        if ((iArr[z12 ? 1 : 0] - g6VarArr.length) - (x5VarArr == null ? z12 ? 1 : 0 : x5VarArr.length) <= 0) {
                            int length = g6VarArr.length;
                            int i12 = z12 ? 1 : 0;
                            ?? r32 = z12;
                            while (i12 < length) {
                                org.telegram.messenger.g6 g6Var = g6VarArr[i12];
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                tL_inputStickerSetShortName.short_name = "StaticEmoji";
                                TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.ri.d0(i11).n0(tL_inputStickerSetShortName, Integer.valueOf((int) r32), false, true, new r3(this, 28));
                                if (n02 != null) {
                                    String replace = g6Var.d.replace("️", "");
                                    ArrayList<TLRPC.Document> arrayList = n02.documents;
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
                                        if (TextUtils.equals(org.telegram.messenger.fj.V(document, null, null).replace("️", ""), replace)) {
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
                        if ((drawable instanceof org.telegram.ui.Components.o5) && ((org.telegram.ui.Components.o5) drawable).h() == document.id) {
                            r52 = (org.telegram.ui.Components.o5) drawableArr[i10];
                        } else {
                            org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(21, i11, document);
                            drawableArr[i10] = o5Var;
                            r52 = o5Var;
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
            z12 = false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            Drawable drawable2 = drawableArr[i15];
            if (drawable2 instanceof org.telegram.messenger.f6) {
                z11 = ((org.telegram.messenger.f6) drawable2).a();
            } else {
                if ((drawable2 instanceof org.telegram.ui.Components.o5) && (s2Var = ((org.telegram.ui.Components.o5) drawable2).k) != null) {
                    Drawable drawable3 = s2Var.b0;
                    if (!(drawable3 instanceof org.telegram.messenger.f6) || ((org.telegram.messenger.f6) drawable3).a()) {
                        z11 = true;
                    }
                }
                z11 = false;
            }
            if (z11) {
                i14++;
            }
        }
        if (i14 == 4) {
            this.B0 = true;
            for (int i16 = 0; i16 < 4; i16++) {
                if (r62[i16].getVisibility() != 0) {
                    r62[i16].setVisibility(0);
                    if (z10) {
                        r62[i16].setAlpha(0.0f);
                        r62[i16].setScaleX(0.0f);
                        r62[i16].setScaleY(0.0f);
                        org.telegram.messenger.n10.o(r62[i16].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.lr.k, 250L);
                    }
                }
            }
            this.O0.postDelayed(new tb1(this, 9), 1000L);
        }
    }

    public final void w() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int i7 = sharedInstance.isBluetoothOn() ? R.drawable.calls_bluetooth : VoipAudioManager.get().isSpeakerphoneOn() ? R.drawable.calls_speaker : sharedInstance.isHeadsetPlugged() ? R.drawable.calls_menu_headset : R.drawable.calls_menu_phone;
        if (this.K != i7) {
            org.telegram.messenger.g0.P3(this.L, i7);
        } else {
            this.L.setImageResource(i7);
        }
        this.K = i7;
    }

    public final void x() {
        this.k0.setColor(i0.a.o(-16777216, (int) (this.y0 * 102.0f * this.F0)));
        this.l0.setColor(i0.a.o(-16777216, (int) (127.5f * this.F0)));
        cc1 cc1Var = this.s;
        if (cc1Var != null) {
            cc1Var.invalidate();
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
    /* JADX WARN: Removed duplicated region for block: B:271:0x0c0b  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0cf5  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0d38  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0d54 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0d5f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0d64  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0d95  */
    /* JADX WARN: Removed duplicated region for block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0d78  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0c1f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:396:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x07df  */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        boolean z13;
        int L;
        boolean z14;
        int i10;
        int childsHight;
        org.telegram.ui.Components.voip.q1 q1Var;
        org.telegram.ui.Components.voip.q1 q1Var2;
        boolean z15;
        boolean z16;
        boolean z17;
        org.telegram.ui.Components.voip.n2 n2Var;
        VideoSink videoSink;
        int i11;
        int i12;
        boolean z18;
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
        boolean z19;
        boolean z20;
        TextView textView;
        int i13;
        if (this.G0 || this.E0) {
            return;
        }
        boolean z21 = true;
        boolean z22 = this.q0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i14 = this.p0;
        int i15 = 20;
        TLRPC.User user = this.d;
        int i16 = 2;
        if (i14 == 1 || i14 == 2) {
            this.G.b(org.telegram.messenger.gd.M0(2131743182, null), true, z22);
        } else {
            if (i14 != 3) {
                if (i14 == 4) {
                    this.G.b(org.telegram.messenger.gd.M0(2131743171, null), false, z22);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : Instance.ERROR_UNKNOWN;
                    if (TextUtils.equals(lastError, Instance.ERROR_UNKNOWN)) {
                        org.telegram.messenger.g0.h3(new tb1(this, 2), 1000L);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_INCOMPATIBLE)) {
                        p(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("VoipPeerIncompatible", null, 2131743026, org.telegram.messenger.i5.m(0, user.first_name, user.last_name))));
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PEER_OUTDATED)) {
                        if (this.U0) {
                            String a02 = org.telegram.messenger.gd.a0("VoipPeerVideoOutdated", null, 2131743024, org.telegram.messenger.o10.k(user, true));
                            boolean[] zArr = new boolean[1];
                            org.telegram.ui.ActionBar.o3 o3Var = new org.telegram.ui.ActionBar.o3(0, this.b, null);
                            boolean[] zArr2 = new boolean[3];
                            o3Var.S = org.telegram.messenger.gd.M0(2131743171, null);
                            o3Var.U = org.telegram.messenger.g0.W2(a02);
                            String M0 = org.telegram.messenger.gd.M0(2131752578, null);
                            sb1 sb1Var = new sb1(this, 1);
                            o3Var.o0 = M0;
                            o3Var.p0 = sb1Var;
                            String M02 = org.telegram.messenger.gd.M0(2131743023, null);
                            aj0 aj0Var = new aj0(26, this, zArr);
                            o3Var.m0 = M02;
                            o3Var.n0 = aj0Var;
                            o3Var.show();
                            for (int i17 = 0; i17 < 3; i17++) {
                                if (zArr2[i17] && (textView = (TextView) o3Var.d(-(i17 + 1))) != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, o3Var.j1);
                                }
                            }
                            o3Var.setCanceledOnTouchOutside(true);
                            o3Var.setOnDismissListener(new di.u1(this, zArr, 12));
                        } else {
                            p(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("VoipPeerOutdated", null, 2131743025, org.telegram.messenger.o10.k(user, true))));
                        }
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PRIVACY)) {
                        p(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131752595, org.telegram.messenger.i5.m(0, user.first_name, user.last_name))));
                        org.telegram.ui.Components.b5.i0(this.b, this.a, user.id);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_AUDIO_IO)) {
                        p("Error initializing audio hardware");
                    } else if (TextUtils.equals(lastError, Instance.ERROR_LOCALIZED)) {
                        this.u0.b();
                    } else if (TextUtils.equals(lastError, Instance.ERROR_CONNECTION_SERVICE)) {
                        p(org.telegram.messenger.gd.M0(2131743173, null));
                    } else {
                        org.telegram.messenger.g0.h3(new tb1(this, 1), 1000L);
                    }
                } else if (i14 != 5) {
                    switch (i14) {
                        case 11:
                            boolean z23 = sharedInstance != null && sharedInstance.hasRate();
                            this.e0.c();
                            if (!z23 || this.G0) {
                                org.telegram.messenger.g0.h3(new tb1(this, 0), 200L);
                                break;
                            } else {
                                if (this.x0) {
                                    int[] iArr = new int[2];
                                    int i18 = org.telegram.messenger.g0.q.x;
                                    this.n.getLocationOnScreen(iArr);
                                    int measuredWidth = ((i18 - iArr[0]) - ((this.n.getMeasuredWidth() - org.telegram.messenger.g0.L(52.0f)) / 2)) - org.telegram.messenger.g0.L(52.0f);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.V.getLayoutParams();
                                    marginLayoutParams.rightMargin = measuredWidth;
                                    marginLayoutParams.leftMargin = measuredWidth;
                                    this.V.setTranslationY(iArr[1]);
                                    this.V.setAlpha(1.0f);
                                    this.V.setLayoutParams(marginLayoutParams);
                                    this.j0.animate().alpha(0.0f).setDuration(80L).start();
                                    org.telegram.messenger.g0.h3(new b31(i15, this, sharedInstance), 2L);
                                    i13 = 0;
                                } else {
                                    this.j0.setVisibility(8);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.V.getLayoutParams();
                                    layoutParams.rightMargin = org.telegram.messenger.g0.L(18.0f);
                                    layoutParams.leftMargin = org.telegram.messenger.g0.L(18.0f);
                                    int L2 = org.telegram.messenger.g0.L(36.0f);
                                    layoutParams.bottomMargin = L2;
                                    WindowInsets windowInsets = this.r0;
                                    if (windowInsets != null) {
                                        layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom() + L2;
                                    }
                                    layoutParams.gravity = 80;
                                    this.V.setLayoutParams(layoutParams);
                                    this.V.animate().alpha(1.0f).setDuration(250L).start();
                                    i13 = 0;
                                    this.V.a(new rb1(this, sharedInstance, i13), false);
                                }
                                this.R.setVisibility(i13);
                                di.n4 n4Var = this.R;
                                sb1 sb1Var2 = new sb1(this, i13);
                                org.telegram.ui.Components.voip.f1[] f1VarArr = (org.telegram.ui.Components.voip.f1[]) n4Var.d;
                                n4Var.e = sb1Var2;
                                ai.k0 k0Var = (ai.k0) n4Var.b;
                                k0Var.setVisibility(i13);
                                ((FrameLayout) n4Var.c).setVisibility(i13);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.ALPHA;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(k0Var, (Property<ai.k0, Float>) property, 0.0f, 1.0f);
                                Property property2 = View.SCALE_X;
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(k0Var, (Property<ai.k0, Float>) property2, 0.7f, 1.0f);
                                Property property3 = View.SCALE_Y;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(k0Var, (Property<ai.k0, Float>) property3, 0.7f, 1.0f);
                                float f14 = 0.0f;
                                Property property4 = View.TRANSLATION_Y;
                                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(k0Var, (Property<ai.k0, Float>) property4, org.telegram.messenger.g0.L(24.0f), 0.0f));
                                animatorSet.setInterpolator(org.telegram.ui.Components.lr.f);
                                animatorSet.setDuration(250L);
                                int i19 = 0;
                                while (i19 < f1VarArr.length) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    f1VarArr[i19].setAlpha(f14);
                                    float[] fArr = new float[i16];
                                    // fill-array-data instruction
                                    fArr[0] = 0.0f;
                                    fArr[1] = 1.0f;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(f1VarArr[i19], (Property<org.telegram.ui.Components.voip.f1, Float>) property, fArr);
                                    float[] fArr2 = new float[i16];
                                    // fill-array-data instruction
                                    fArr2[0] = 0.3f;
                                    fArr2[1] = 1.0f;
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(f1VarArr[i19], (Property<org.telegram.ui.Components.voip.f1, Float>) property2, fArr2);
                                    AnimatorSet animatorSet3 = animatorSet;
                                    float[] fArr3 = new float[i16];
                                    // fill-array-data instruction
                                    fArr3[0] = 0.3f;
                                    fArr3[1] = 1.0f;
                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(f1VarArr[i19], (Property<org.telegram.ui.Components.voip.f1, Float>) property3, fArr3);
                                    org.telegram.ui.Components.voip.f1 f1Var = f1VarArr[i19];
                                    Property property5 = property3;
                                    float[] fArr4 = new float[i16];
                                    fArr4[0] = org.telegram.messenger.g0.L(30.0f);
                                    fArr4[1] = 0.0f;
                                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(f1Var, (Property<org.telegram.ui.Components.voip.f1, Float>) property4, fArr4);
                                    int i20 = i16;
                                    Animator[] animatorArr = new Animator[4];
                                    animatorArr[0] = ofFloat4;
                                    animatorArr[1] = ofFloat5;
                                    animatorArr[i20] = ofFloat6;
                                    animatorArr[3] = ofFloat7;
                                    animatorSet2.playTogether(animatorArr);
                                    animatorSet2.setDuration(250L);
                                    animatorSet2.setStartDelay(i19 * 16);
                                    animatorSet2.start();
                                    i19++;
                                    animatorSet = animatorSet3;
                                    i16 = i20;
                                    property3 = property5;
                                    f14 = 0.0f;
                                }
                                int i21 = i16;
                                animatorSet.start();
                                if (this.C0) {
                                    this.C0 = false;
                                    ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.f;
                                    duration.setInterpolator(lrVar).setListener(new on(this.P)).start();
                                    this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(lrVar).setDuration(250L).start();
                                    this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.g0.L(120.0f)).setListener(new on(this.P)).setDuration(250L).setInterpolator(lrVar).start();
                                }
                                for (org.telegram.ui.Components.q9 q9Var : this.W) {
                                    q9Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(org.telegram.ui.Components.lr.f).setDuration(250L).start();
                                }
                                this.F.animate().alpha(0.0f).setDuration(70L).setListener(new xb1(this, 5)).start();
                                ViewPropertyAnimator alpha = this.L.animate().alpha(0.0f);
                                org.telegram.ui.Components.lr lrVar2 = org.telegram.ui.Components.lr.f;
                                org.telegram.messenger.n10.o(alpha, lrVar2, 250L);
                                this.L.setVisibility(8);
                                this.G.d(false, true);
                                this.G.c(false);
                                org.telegram.ui.Components.voip.o2 o2Var = this.G.d;
                                o2Var.n = true;
                                o2Var.invalidate();
                                org.telegram.ui.Components.voip.p0 p0Var = this.E;
                                p0Var.setShowWaves(false);
                                AnimatorSet animatorSet4 = p0Var.c;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                                AnimatorSet animatorSet5 = new AnimatorSet();
                                p0Var.c = animatorSet5;
                                Property property6 = View.ALPHA;
                                float[] fArr5 = new float[i21];
                                fArr5[0] = p0Var.getAlpha();
                                fArr5[1] = 1.0f;
                                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(p0Var, (Property<org.telegram.ui.Components.voip.p0, Float>) property6, fArr5);
                                Property property7 = View.TRANSLATION_Y;
                                float[] fArr6 = new float[i21];
                                fArr6[0] = p0Var.getTranslationY();
                                fArr6[1] = -org.telegram.messenger.g0.L(24.0f);
                                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(p0Var, (Property<org.telegram.ui.Components.voip.p0, Float>) property7, fArr6);
                                Property property8 = View.SCALE_X;
                                float[] fArr7 = new float[3];
                                fArr7[0] = p0Var.getScaleX();
                                fArr7[1] = 0.9f;
                                fArr7[i21] = 1.0f;
                                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(p0Var, (Property<org.telegram.ui.Components.voip.p0, Float>) property8, fArr7);
                                Property property9 = View.SCALE_Y;
                                float[] fArr8 = new float[3];
                                fArr8[0] = p0Var.getScaleY();
                                fArr8[1] = 0.9f;
                                fArr8[i21] = 1.0f;
                                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(p0Var, (Property<org.telegram.ui.Components.voip.p0, Float>) property9, fArr8);
                                Animator[] animatorArr2 = new Animator[4];
                                animatorArr2[0] = ofFloat8;
                                animatorArr2[1] = ofFloat9;
                                animatorArr2[i21] = ofFloat10;
                                animatorArr2[3] = ofFloat11;
                                animatorSet5.playTogether(animatorArr2);
                                p0Var.c.setInterpolator(lrVar2);
                                p0Var.c.setDuration(300L);
                                p0Var.c.setStartDelay(250L);
                                p0Var.c.start();
                                u(true);
                                this.n.setVisibility(4);
                                this.a0.setAlpha(0.0f);
                                this.a0.setVisibility(8);
                                this.Z.setAlpha(0.0f);
                                this.Z.setVisibility(8);
                                bc1 bc1Var = this.o0;
                                if (bc1Var != null) {
                                    bc1Var.a(false, false);
                                }
                                this.M0.animate().alpha(0.0f).setDuration(250L).start();
                                break;
                            }
                            break;
                        case 12:
                            if (this.q0 != 12) {
                                this.G.b(org.telegram.messenger.gd.M0(2131743172, null), true, z22);
                                break;
                            }
                            break;
                        case 13:
                            this.G.b(org.telegram.messenger.gd.M0(2131742981, null), true, z22);
                            break;
                        case 14:
                            this.G.b(org.telegram.messenger.gd.M0(2131743009, null), true, z22);
                            break;
                        case 15:
                            this.f0.setRetryMod(false);
                            if (sharedState != null && sharedState.isConference()) {
                                this.G.b(org.telegram.messenger.gd.M0(2131743061, null), false, z22);
                                this.f0.setTranslationY(0.0f);
                            } else if (sharedState == null || !sharedState.isCallingVideo()) {
                                this.G.b(org.telegram.messenger.gd.M0(2131743063, null), false, z22);
                                this.f0.setTranslationY(0.0f);
                            } else {
                                this.G.b(org.telegram.messenger.gd.M0(2131743060, null), false, z22);
                                this.f0.setTranslationY(-org.telegram.messenger.g0.L(60.0f));
                            }
                            z10 = false;
                            z11 = false;
                            break;
                        case 16:
                            if (this.q0 != 16) {
                                this.G.b(org.telegram.messenger.gd.M0(2131743008, null), true, z22);
                                break;
                            }
                            break;
                        case 17:
                            this.G.b(org.telegram.messenger.gd.M0(2131743255, null), false, z22);
                            this.f0.setRetryMod(true);
                            this.n0 = false;
                            this.m0 = false;
                            z10 = false;
                            z11 = false;
                            break;
                    }
                    if (this.o0 == null) {
                        return;
                    }
                    boolean z24 = this.m0 || this.n0;
                    if (sharedInstance != null) {
                        this.m0 = sharedInstance.getRemoteVideoState() == 2;
                        if (sharedInstance.getVideoState(false) != 2) {
                            z19 = true;
                            if (sharedInstance.getVideoState(false) != 1) {
                                z20 = false;
                                this.n0 = z20;
                                if (z20 && !this.U0) {
                                    this.U0 = z19;
                                }
                            }
                        } else {
                            z19 = true;
                        }
                        z20 = z19;
                        this.n0 = z20;
                        if (z20) {
                            this.U0 = z19;
                        }
                    }
                    if (z22) {
                        this.Z.b();
                        this.a0.b();
                    }
                    if (this.m0) {
                        if (this.E0) {
                            f13 = 1.0f;
                        } else {
                            f13 = 1.0f;
                            this.w.setAlpha(1.0f);
                        }
                        if (z22) {
                            this.d0.animate().alpha(f13).setDuration(250L).start();
                        } else {
                            this.d0.animate().cancel();
                            this.d0.setAlpha(f13);
                        }
                        if (!this.d0.d.isFirstFrameRendered() && !this.I0) {
                            i7 = 0;
                            this.m0 = false;
                            if (!this.n0 || this.m0) {
                                this.w.setVisibility(4);
                            } else {
                                this.w.setVisibility(i7);
                                if (z22) {
                                    this.d0.animate().alpha(0.0f).setDuration(250L).start();
                                } else {
                                    this.d0.animate().cancel();
                                    this.d0.setAlpha(0.0f);
                                }
                            }
                            z12 = this.n0;
                            if (z12 || !this.m0) {
                                this.H0 = false;
                            }
                            z13 = (z12 || !this.H0 || org.telegram.messenger.g0.H1(this.b)) ? false : true;
                            o(z22, z24);
                            L = this.E.getTag() != null ? 0 : org.telegram.messenger.g0.L(135.0f) + org.telegram.messenger.g0.L(12.0f);
                            if (z22) {
                                this.f0.setVisibility(z21 ? 0 : 8);
                            } else {
                                if (z21 && this.f0.getTag() == null) {
                                    this.f0.animate().setListener(null).cancel();
                                    if (this.f0.getVisibility() == 8) {
                                        this.f0.setVisibility(0);
                                        this.f0.setAlpha(0.0f);
                                    }
                                    this.f0.animate().alpha(1.0f);
                                }
                                if (!z21 && this.f0.getTag() != null) {
                                    this.f0.animate().setListener(null).cancel();
                                    this.f0.animate().setListener(new xb1(this, 9)).alpha(0.0f);
                                }
                            }
                            this.f0.setEnabled(z21);
                            this.f0.setTag(!z21 ? 1 : null);
                            this.u0.setLockOnScreen(this.J0);
                            z14 = this.p0 != 3 && (this.n0 || this.m0);
                            this.z0 = z14;
                            if (!z14 && !this.x0) {
                                r(true);
                            }
                            if (this.x0 && this.z0 && !this.R0 && sharedInstance != null) {
                                org.telegram.messenger.g0.h3(this.S0, 3000L);
                                this.R0 = true;
                            }
                            int i22 = this.p0;
                            boolean z25 = i22 == 11 && this.x0;
                            boolean z26 = (!z21 || i22 == 16 || i22 == 11 || i22 == 12 || i22 == 14 || i22 == 6 || !this.x0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) ? false : true;
                            if (z22) {
                                this.I.setVisibility(z25 ? 0 : 8);
                                this.I.setAlpha(z25 ? 1.0f : 0.0f);
                                this.J.setVisibility(z26 ? 0 : 8);
                                this.J.setAlpha(z26 ? 1.0f : 0.0f);
                                this.M0.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) - (this.x0 ? org.telegram.messenger.g0.L(80.0f) : 0));
                            } else {
                                if (z25) {
                                    f10 = 80.0f;
                                    this.I.animate().alpha(1.0f).start();
                                } else {
                                    f10 = 80.0f;
                                    if (this.I.getVisibility() != 0) {
                                        this.I.setVisibility(0);
                                        f11 = 0.0f;
                                        this.I.setAlpha(0.0f);
                                    } else {
                                        f11 = 0.0f;
                                    }
                                    this.I.animate().alpha(f11).start();
                                }
                                if (z26) {
                                    this.J.animate().alpha(1.0f).start();
                                } else {
                                    if (this.J.getVisibility() != 0) {
                                        this.J.setVisibility(0);
                                        f12 = 0.0f;
                                        this.J.setAlpha(0.0f);
                                    } else {
                                        f12 = 0.0f;
                                    }
                                    this.J.animate().alpha(f12).start();
                                }
                                this.M0.animate().translationY((-org.telegram.messenger.g0.L(16.0f)) - (this.x0 ? org.telegram.messenger.g0.L(f10) : 0)).setDuration(150L).setInterpolator(org.telegram.ui.Components.lr.f).start();
                            }
                            i10 = this.p0;
                            if (i10 != 10 && i10 != 11) {
                                u(z22);
                            }
                            if (z11) {
                                this.G.e(z22);
                            }
                            this.G.d(z10, z22);
                            if (this.E.getVisibility() == 0 && this.C0) {
                                L += org.telegram.messenger.g0.L(24.0f);
                                layout = this.U.getLayout();
                                if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                                    L = com.google.android.gms.internal.vision.e2.v(lineCount, 2, org.telegram.messenger.g0.L(20.0f), L);
                                }
                            }
                            if (this.p0 == 11 && !this.n0 && !this.m0) {
                                L -= org.telegram.messenger.g0.L(24.0f);
                            }
                            if (!this.n0 || this.m0) {
                                L -= org.telegram.messenger.g0.L(60.0f);
                            }
                            if (z22) {
                                this.Y.setTranslationY(L);
                            } else {
                                if (this.C0 && (this.n0 || this.m0)) {
                                    this.Y.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.lr.f).start();
                                    j3 = 250;
                                } else {
                                    j3 = 250;
                                    this.Y.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.lr.f).start();
                                }
                                if (L != this.v0) {
                                    ViewPropertyAnimator animate = this.Y.animate();
                                    if (this.p0 != 11) {
                                        j3 = 0;
                                    }
                                    animate.setStartDelay(j3).translationY(L).setDuration(200L).setInterpolator(org.telegram.ui.Components.lr.f).start();
                                }
                            }
                            this.v0 = L;
                            boolean z27 = sharedInstance == null && sharedInstance.isScreencast();
                            int i23 = this.p0;
                            this.D0 = i23 == 11 && i23 != 17 && ((this.n0 && !z27) || this.m0);
                            if (sharedInstance != null) {
                                if (this.n0) {
                                    sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                                }
                                this.e0.setIsScreencast(sharedInstance.isScreencast());
                                this.e0.d.setMirror(sharedInstance.isFrontFaceCamera());
                                org.telegram.ui.Components.voip.m2 m2Var = (!this.n0 || sharedInstance.isScreencast()) ? null : this.e0.d;
                                if (!this.l1 || (n2Var = this.k1) == null) {
                                    if (z13) {
                                        videoSink = this.c0;
                                        sharedInstance.setSinks(m2Var, videoSink);
                                        if (z22) {
                                            org.telegram.ui.Components.voip.d2 d2Var = this.M0;
                                            d2Var.f = false;
                                            if (!d2Var.e && d2Var.getParent() != null) {
                                                TransitionManager.beginDelayedTransition(d2Var, d2Var.d);
                                            }
                                        }
                                        if (sharedInstance.isMicMute()) {
                                            this.M0.c("self-muted");
                                        } else {
                                            this.M0.a(R.drawable.calls_mute_mini, org.telegram.messenger.gd.M0(2131743049, null), "self-muted");
                                        }
                                        if ((!this.n0 || this.m0) && (((i11 = this.p0) == 3 || i11 == 5) && sharedInstance.getCallDuration() > 500)) {
                                            if (sharedInstance.getRemoteAudioState() != 0) {
                                                org.telegram.ui.Components.voip.d2 d2Var2 = this.M0;
                                                i12 = 1;
                                                d2Var2.a(R.drawable.calls_mute_mini, org.telegram.messenger.gd.a0("VoipUserMicrophoneIsOff", null, 2131742990, d2Var2.b(org.telegram.messenger.o10.k(user, true))), "muted");
                                            } else {
                                                i12 = 1;
                                                this.M0.c("muted");
                                            }
                                            if (sharedInstance.getRemoteVideoState() != 0) {
                                                org.telegram.ui.Components.voip.d2 d2Var3 = this.M0;
                                                Object[] objArr = new Object[i12];
                                                objArr[0] = d2Var3.b(org.telegram.messenger.o10.k(user, i12));
                                                d2Var3.a(R.drawable.calls_camera_mini, org.telegram.messenger.gd.a0("VoipUserCameraIsOff", null, 2131742991, objArr), MediaStreamTrack.VIDEO_TRACK_KIND);
                                            } else {
                                                this.M0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                            }
                                        } else {
                                            if (sharedInstance.getRemoteAudioState() == 0) {
                                                org.telegram.ui.Components.voip.d2 d2Var4 = this.M0;
                                                d2Var4.a(R.drawable.calls_mute_mini, org.telegram.messenger.gd.a0("VoipUserMicrophoneIsOff", null, 2131742990, d2Var4.b(org.telegram.messenger.o10.k(user, true))), "muted");
                                            } else {
                                                this.M0.c("muted");
                                            }
                                            this.M0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                        }
                                        if (this.M0.getChildCount() == 0 && this.m0 && (phoneCall = sharedInstance.privateCall) != null && !phoneCall.video) {
                                            sharedUIParams = sharedInstance.sharedUIParams;
                                            if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                                sharedUIParams.tapToVideoTooltipWasShowed = true;
                                                this.N0.setTranslationY(-((this.s.getMeasuredHeight() - this.j0.getY()) + org.telegram.messenger.g0.L(6.0f)));
                                                this.N0.p(0.0f, this.f.getX() + this.j0.getX() + org.telegram.messenger.g0.L(14.0f));
                                                this.N0.x();
                                                z18 = true;
                                                if (z22) {
                                                    org.telegram.ui.Components.voip.d2 d2Var5 = this.M0;
                                                    if (d2Var5.f) {
                                                        d2Var5.e = z18;
                                                        org.telegram.messenger.g0.h3(new oi.a2(d2Var5, 20), 700L);
                                                    }
                                                    d2Var5.f = false;
                                                }
                                            }
                                        }
                                        if (this.M0.getChildCount() != 0) {
                                            z18 = true;
                                            this.N0.f(true);
                                            if (z22) {
                                            }
                                        }
                                        z18 = true;
                                        if (z22) {
                                        }
                                    } else {
                                        n2Var = this.d0;
                                    }
                                }
                                videoSink = n2Var.d;
                                sharedInstance.setSinks(m2Var, videoSink);
                                if (z22) {
                                }
                                if (sharedInstance.isMicMute()) {
                                }
                                if (this.n0) {
                                }
                                if (sharedInstance.getRemoteAudioState() != 0) {
                                }
                                if (sharedInstance.getRemoteVideoState() != 0) {
                                }
                                if (this.M0.getChildCount() == 0) {
                                    sharedUIParams = sharedInstance.sharedUIParams;
                                    if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                    }
                                }
                                if (this.M0.getChildCount() != 0) {
                                }
                                z18 = true;
                                if (z22) {
                                }
                            }
                            childsHight = this.M0.getChildsHight();
                            q1Var = this.a0;
                            if (q1Var.getParent() == null && z22) {
                                q1Var.U = childsHight;
                            } else {
                                q1Var.U = childsHight;
                            }
                            q1Var2 = this.Z;
                            if (q1Var2.getParent() == null && z22) {
                                q1Var2.U = childsHight;
                            } else {
                                q1Var2.U = childsHight;
                            }
                            this.Z.setUiVisible(this.x0);
                            this.a0.setUiVisible(this.x0);
                            if (this.n0) {
                                z15 = true;
                                q(0, z22);
                            } else if (!this.m0 || this.H0) {
                                z15 = true;
                                q(1, z22);
                            } else {
                                q(2, z22);
                                z15 = true;
                            }
                            if (!z13 && this.a0.getTag() == null) {
                                this.a0.setIsActive(z15);
                                if (this.a0.getVisibility() != 0) {
                                    this.a0.setVisibility(0);
                                    this.a0.setAlpha(0.0f);
                                    this.a0.setScaleX(0.5f);
                                    this.a0.setScaleY(0.5f);
                                }
                                this.a0.animate().setListener(null).cancel();
                                org.telegram.ui.Components.voip.q1 q1Var3 = this.a0;
                                q1Var3.d0 = true;
                                q1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.lr.f).setStartDelay(150L).withEndAction(new tb1(this, 4)).start();
                                this.a0.setTag(1);
                            } else if (!z13 && this.a0.getTag() != null) {
                                this.a0.setIsActive(false);
                                this.a0.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new xb1(this, 6)).setDuration(150L).setInterpolator(org.telegram.ui.Components.lr.f).start();
                                this.a0.setTag(null);
                            }
                            this.Z.a();
                            this.a0.a();
                            w();
                            if (this.p0 == 3) {
                                this.x.a();
                                this.E.a();
                                int i24 = this.w.W;
                                if (i24 != 2 && i24 != 3) {
                                    int[] iArr2 = new int[2];
                                    this.E.getLocationOnScreen(iArr2);
                                    z16 = true;
                                    this.w.b(org.telegram.messenger.g0.L(106.0f) + iArr2[0], org.telegram.messenger.g0.L(106.0f) + iArr2[1], this.q0 != -1);
                                    z17 = (!this.n0 || this.m0) ? z16 : false;
                                    this.y.setState(z17);
                                    this.x.setState(z17);
                                    this.r.e(z17);
                                    if (this.m0 && !z24 && this.g0) {
                                        this.g0 = false;
                                        if (sharedInstance != null) {
                                            sharedInstance.playStartRecordSound();
                                        }
                                    }
                                    if (z17) {
                                        if (this.i0.getVisibility() != 0) {
                                            this.i0.setVisibility(0);
                                            this.h0.setVisibility(0);
                                        }
                                    } else if (this.i0.getVisibility() != 4) {
                                        this.i0.setVisibility(4);
                                        this.h0.setVisibility(4);
                                    }
                                    tb1 tb1Var = this.T0;
                                    org.telegram.messenger.g0.r(tb1Var);
                                    if (this.p0 == 3) {
                                        org.telegram.messenger.g0.h3(tb1Var, 10000L);
                                        return;
                                    }
                                    return;
                                }
                            }
                            z16 = true;
                            if (this.n0) {
                            }
                            this.y.setState(z17);
                            this.x.setState(z17);
                            this.r.e(z17);
                            if (this.m0) {
                                this.g0 = false;
                                if (sharedInstance != null) {
                                }
                            }
                            if (z17) {
                            }
                            tb1 tb1Var2 = this.T0;
                            org.telegram.messenger.g0.r(tb1Var2);
                            if (this.p0 == 3) {
                            }
                        }
                    }
                    i7 = 0;
                    if (this.n0) {
                    }
                    this.w.setVisibility(4);
                    z12 = this.n0;
                    if (z12) {
                    }
                    this.H0 = false;
                    if (z12) {
                    }
                    o(z22, z24);
                    if (this.E.getTag() != null) {
                    }
                    if (z22) {
                    }
                    this.f0.setEnabled(z21);
                    this.f0.setTag(!z21 ? 1 : null);
                    this.u0.setLockOnScreen(this.J0);
                    if (this.p0 != 3) {
                    }
                    this.z0 = z14;
                    if (!z14) {
                        r(true);
                    }
                    if (this.x0) {
                        org.telegram.messenger.g0.h3(this.S0, 3000L);
                        this.R0 = true;
                    }
                    int i222 = this.p0;
                    if (i222 == 11) {
                    }
                    if (!z21) {
                    }
                    if (z22) {
                    }
                    i10 = this.p0;
                    if (i10 != 10) {
                        u(z22);
                    }
                    if (z11) {
                    }
                    this.G.d(z10, z22);
                    if (this.E.getVisibility() == 0) {
                        L += org.telegram.messenger.g0.L(24.0f);
                        layout = this.U.getLayout();
                        if (layout != null) {
                            L = com.google.android.gms.internal.vision.e2.v(lineCount, 2, org.telegram.messenger.g0.L(20.0f), L);
                        }
                    }
                    if (this.p0 == 11) {
                        L -= org.telegram.messenger.g0.L(24.0f);
                    }
                    if (!this.n0) {
                    }
                    L -= org.telegram.messenger.g0.L(60.0f);
                    if (z22) {
                    }
                    this.v0 = L;
                    if (sharedInstance == null) {
                    }
                    int i232 = this.p0;
                    this.D0 = i232 == 11 && i232 != 17 && ((this.n0 && !z27) || this.m0);
                    if (sharedInstance != null) {
                    }
                    childsHight = this.M0.getChildsHight();
                    q1Var = this.a0;
                    if (q1Var.getParent() == null) {
                    }
                    q1Var.U = childsHight;
                    q1Var2 = this.Z;
                    if (q1Var2.getParent() == null) {
                    }
                    q1Var2.U = childsHight;
                    this.Z.setUiVisible(this.x0);
                    this.a0.setUiVisible(this.x0);
                    if (this.n0) {
                    }
                    if (!z13) {
                    }
                    if (!z13) {
                        this.a0.setIsActive(false);
                        this.a0.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new xb1(this, 6)).setDuration(150L).setInterpolator(org.telegram.ui.Components.lr.f).start();
                        this.a0.setTag(null);
                    }
                    this.Z.a();
                    this.a0.a();
                    w();
                    if (this.p0 == 3) {
                    }
                    z16 = true;
                    if (this.n0) {
                    }
                    this.y.setState(z17);
                    this.x.setState(z17);
                    this.r.e(z17);
                    if (this.m0) {
                    }
                    if (z17) {
                    }
                    tb1 tb1Var22 = this.T0;
                    org.telegram.messenger.g0.r(tb1Var22);
                    if (this.p0 == 3) {
                    }
                }
            }
            v(z22);
            if (this.p0 == 5) {
                z10 = this.s0;
                if (!z10 && this.q0 != 5) {
                    this.G.b(org.telegram.messenger.gd.M0(2131743182, null), true, z22);
                }
                z21 = false;
                z11 = false;
                if (this.o0 == null) {
                }
            } else {
                z11 = true;
                this.s0 = true;
                z10 = false;
                z21 = false;
                if (this.o0 == null) {
                }
            }
        }
        z10 = false;
        z21 = false;
        z11 = false;
        if (this.o0 == null) {
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z10) {
    }
}
