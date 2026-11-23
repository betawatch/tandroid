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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fc1 implements VoIPService.StateListener, org.telegram.messenger.fs {
    public static fc1 m1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public org.telegram.ui.Components.voip.q0 E;
    public boolean E0;
    public TextView F;
    public float F0;
    public org.telegram.ui.Components.voip.l2 G;
    public boolean G0;
    public ec1 H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public ImageView J;
    public boolean J0;
    public int K;
    public long K0;
    public kg.k L;
    public int M;
    public org.telegram.ui.Components.voip.e2 M0;
    public wg.d1 N;
    public org.telegram.ui.Components.op N0;
    public b61 O;
    public org.telegram.ui.Components.op O0;
    public FrameLayout P;
    public ValueAnimator P0;
    public gi.j Q;
    public di.n4 R;
    public boolean R0;
    public hi.i5 S;
    public TextView T;
    public org.telegram.ui.ActionBar.n2 U;
    public boolean U0;
    public org.telegram.ui.Components.voip.r V;
    public float V0;
    public float W0;
    public float X0;
    public bc1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.r1 Z;
    public float Z0;
    public final int a;
    public org.telegram.ui.Components.voip.r1 a0;
    public boolean a1;
    public Activity b;
    public boolean b0;
    public float b1;
    public final TLRPC.User c;
    public TextureViewRenderer c0;
    public float c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.o2 d0;
    public int d1;
    public org.telegram.ui.Components.voip.f3 e;
    public org.telegram.ui.Components.voip.o2 e0;
    public int e1;
    public org.telegram.ui.Components.voip.f3 f;
    public org.telegram.ui.Components.voip.e f0;
    public boolean g0;
    public boolean g1;
    public org.telegram.ui.Components.voip.f3 h;
    public View h0;
    public boolean h1;
    public View i0;
    public ValueAnimator i1;
    public org.telegram.ui.Components.voip.n1 j0;
    public boolean j1;
    public org.telegram.ui.Components.voip.o2 k1;
    public boolean l1;
    public boolean m0;
    public cc1 n;
    public boolean n0;
    public zb1 o0;
    public int p0;
    public int q0;
    public WindowInsets r0;
    public ac1 s;
    public boolean s0;
    public float t0;
    public yb1 u0;
    public int v0;
    public org.telegram.ui.Components.voip.y2 w;
    public AccessibilityManager w0;
    public org.telegram.ui.Components.voip.v2 x;
    public org.telegram.ui.Components.voip.z2 y;
    public boolean z0;
    public final org.telegram.ui.Components.voip.m1 r = new org.telegram.ui.Components.voip.m1();
    public final org.telegram.ui.Components.p9[] W = new org.telegram.ui.Components.p9[4];
    public final Drawable[] X = new Drawable[4];
    public final Paint k0 = new Paint();
    public final Paint l0 = new Paint();
    public boolean x0 = true;
    public float y0 = 1.0f;
    public final h2.f L0 = new h2.f((int[]) null);
    public final hz0 Q0 = new hz0(this, 16);
    public final rb1 S0 = new rb1(this, 12);
    public final rb1 T0 = new rb1(this, 13);
    public float f1 = 1.0f;

    public fc1(int i7) {
        this.a = i7;
        this.c = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(org.telegram.messenger.i10.i(i7).e()));
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

    public static void a(fc1 fc1Var) {
        fc1 fc1Var2;
        int i7 = 0;
        if (fc1Var.g1) {
            fc1Var.g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            fc1Var.i1 = ofFloat;
            fc1Var2 = fc1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.i0(fc1Var2, fc1Var.f1, fc1Var.Y0, fc1Var.Z0, 1));
            fc1Var2.i1.addListener(new vb1(fc1Var2, i7));
            fc1Var2.i1.setDuration(350L);
            fc1Var2.i1.setInterpolator(org.telegram.ui.Components.kr.f);
            fc1Var2.i1.start();
        } else {
            fc1Var2 = fc1Var;
        }
        fc1Var2.h1 = false;
        fc1Var2.a1 = false;
    }

    public static void h(int[] iArr, int i7) {
        fc1 fc1Var = m1;
        if (fc1Var != null) {
            if (i7 == 101) {
                if (VoIPService.getSharedState() == null) {
                    fc1Var.u0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    fc1Var.i(new cd0(7));
                } else if (!fc1Var.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.c2.h(fc1Var.b, new rb1(fc1Var, 3), i7);
                    return;
                }
            }
            if (i7 == 102) {
                if (VoIPService.getSharedState() == null) {
                    fc1Var.u0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    fc1Var.t();
                }
            }
        }
    }

    public static void n(Activity activity, int i7) {
        fc1 fc1Var = m1;
        if (fc1Var != null && fc1Var.u0.getParent() == null) {
            fc1 fc1Var2 = m1;
            if (fc1Var2 != null) {
                fc1Var2.d0.d.release();
                m1.e0.d.release();
                m1.c0.release();
                yb1 yb1Var = m1.u0;
                if (yb1Var != null) {
                    yb1Var.d();
                }
                m1.c();
            }
            m1 = null;
        }
        if (m1 != null || activity.isFinishing()) {
            return;
        }
        boolean z10 = org.telegram.ui.Components.voip.i2.d() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        fc1 fc1Var3 = new fc1(i7);
        fc1Var3.b = activity;
        m1 = fc1Var3;
        yb1 yb1Var2 = new yb1(activity, !z10, fc1Var3);
        m1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        m1.getClass();
        yb1Var2.setLockOnScreen(m1.J0);
        fc1Var3.u0 = yb1Var2;
        qb1 qb1Var = new qb1(fc1Var3, 3);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(yb1Var2, qb1Var);
        ((WindowManager) activity.getSystemService("window")).addView(yb1Var2, org.telegram.ui.Components.voip.s2.a());
        fc1Var3.t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        fc1Var3.w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
        ac1 ac1Var = new ac1(fc1Var3, activity);
        ac1Var.setClipToPadding(false);
        ac1Var.setClipChildren(false);
        ac1Var.setBackgroundColor(-16777216);
        fc1Var3.x();
        fc1Var3.s = ac1Var;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z11 = sharedState != null && sharedState.isConference();
        org.telegram.ui.Components.voip.m1 m1Var = fc1Var3.r;
        fc1Var3.w = new org.telegram.ui.Components.voip.y2(activity, z11, m1Var);
        org.telegram.ui.Components.voip.o2 o2Var = new org.telegram.ui.Components.voip.o2(activity, false, true, false, false);
        fc1Var3.d0 = o2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        o2Var.d.setScalingType(scalingType);
        fc1Var3.d0.d.setEnableHardwareScaler(true);
        fc1Var3.d0.d.setRotateTextureWithScreen(true);
        fc1Var3.d0.b0 = 1;
        ac1Var.addView(fc1Var3.w, c8.na.c(-1.0f, -1));
        TLRPC.User user = fc1Var3.d;
        org.telegram.ui.Components.voip.v2 v2Var = new org.telegram.ui.Components.voip.v2(activity, user, m1Var);
        fc1Var3.x = v2Var;
        ac1Var.addView(v2Var, c8.na.c(-1.0f, -1));
        org.telegram.ui.Components.voip.z2 z2Var = new org.telegram.ui.Components.voip.z2(activity);
        if (org.telegram.messenger.pc.e(512)) {
            int i10 = org.telegram.ui.ActionBar.n6.a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.get(12);
            calendar.get(11);
            if ((i11 == 11 && i12 >= 24 && i12 <= 31) || (i11 == 0 && i12 == 1)) {
                z2Var.a = new org.telegram.ui.Components.nu0(0);
            }
        }
        fc1Var3.y = z2Var;
        ac1Var.addView(z2Var, c8.na.c(220.0f, -1));
        ac1Var.addView(fc1Var3.d0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new org.telegram.ui.Components.o9(orientation, new int[]{-14994098, -14328963}).f(org.telegram.ui.ActionBar.i5.M(0.5f, 1), new d71(fc1Var3, 1), 0L);
        org.telegram.ui.Components.voip.r1 r1Var = new org.telegram.ui.Components.voip.r1(activity);
        fc1Var3.Z = r1Var;
        r1Var.setDelegate(new qb1(fc1Var3, 2));
        fc1Var3.Z.d(1.0f, 1.0f);
        fc1Var3.b0 = true;
        org.telegram.ui.Components.voip.o2 o2Var2 = new org.telegram.ui.Components.voip.o2(activity, true, false);
        fc1Var3.e0 = o2Var2;
        o2Var2.d.setIsCamera(true);
        fc1Var3.e0.d.setUseCameraRotation(true);
        fc1Var3.Z.setOnTapListener(new sb1(fc1Var3, 1));
        fc1Var3.e0.d.setMirror(true);
        fc1Var3.Z.addView(fc1Var3.e0);
        org.telegram.ui.Components.voip.r1 r1Var2 = new org.telegram.ui.Components.voip.r1(activity);
        fc1Var3.a0 = r1Var2;
        r1Var2.T = true;
        r1Var2.c(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        fc1Var3.c0 = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        fc1Var3.c0.setIsCamera(false);
        fc1Var3.c0.setFpsReduction(30.0f);
        fc1Var3.c0.setScalingType(scalingType);
        fc1Var3.a0.addView(fc1Var3.c0, c8.na.e(-1, -2, 17));
        fc1Var3.a0.setOnTapListener(new sb1(fc1Var3, 2));
        fc1Var3.a0.setVisibility(8);
        ac1Var.addView(fc1Var3.Z, c8.na.c(-2.0f, -2));
        ac1Var.addView(fc1Var3.a0);
        View view = new View(activity);
        fc1Var3.h0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.o(-16777216, org.telegram.messenger.ks.L1)}));
        ac1Var.addView(fc1Var3.h0, c8.na.e(-1, org.telegram.messenger.ks.q2, 80));
        View view2 = new View(activity);
        fc1Var3.i0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{i0.a.o(-16777216, org.telegram.messenger.ks.n1), 0}));
        ac1Var.addView(fc1Var3.i0, c8.na.e(-1, org.telegram.messenger.ks.q2, 48));
        b61 b61Var = new b61(23, activity, fc1Var3);
        fc1Var3.O = b61Var;
        b61Var.setOrientation(0);
        fc1Var3.O.setPadding(0, 0, 0, org.telegram.messenger.g0.L(30.0f));
        fc1Var3.O.setClipToPadding(false);
        fc1Var3.O.setContentDescription(org.telegram.messenger.gd.N0(2131743052, null));
        fc1Var3.O.setOnClickListener(new sb1(fc1Var3, 3));
        fc1Var3.Q = new gi.j(activity, m1Var);
        FrameLayout frameLayout = new FrameLayout(activity);
        fc1Var3.P = frameLayout;
        frameLayout.addView(fc1Var3.Q, c8.na.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        fc1Var3.P.setVisibility(8);
        fc1Var3.P.setOnClickListener(new sb1(fc1Var3, 4));
        hi.i5 i5Var = new hi.i5(activity, m1Var);
        fc1Var3.S = i5Var;
        i5Var.setOrientation(1);
        TextView textView = new TextView(activity);
        fc1Var3.T = textView;
        textView.setText(org.telegram.messenger.gd.N0(2131743241, null));
        fc1Var3.T.setTextSize(1, 15.0f);
        fc1Var3.T.setTypeface(org.telegram.messenger.g0.o());
        fc1Var3.T.setTextColor(-1);
        fc1Var3.T.setGravity(17);
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(8, activity, fc1Var3);
        fc1Var3.U = n2Var;
        n2Var.setTextSize(1, 15.0f);
        fc1Var3.U.setTextColor(-1);
        fc1Var3.U.setGravity(17);
        fc1Var3.U.setText(org.telegram.messenger.gd.a0("CallEmojiKeyTooltip", null, 2131752615, TextUtils.ellipsize(org.telegram.messenger.n10.k(user, true), fc1Var3.U.getPaint(), org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END)));
        fc1Var3.S.setVisibility(8);
        fc1Var3.S.addView(fc1Var3.T);
        fc1Var3.S.addView(fc1Var3.U, c8.na.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        fc1Var3.S.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
        int i13 = 0;
        while (i13 < 4) {
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(activity);
            org.telegram.ui.Components.p9[] p9VarArr = fc1Var3.W;
            p9VarArr[i13] = p9Var;
            p9VarArr[i13].getImageReceiver().S0 = true;
            fc1Var3.O.addView(p9VarArr[i13], c8.na.k(i13 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i13++;
        }
        bc1 bc1Var = new bc1(fc1Var3, activity);
        fc1Var3.Y = bc1Var;
        bc1Var.setOrientation(1);
        fc1Var3.Y.setFocusable(true);
        fc1Var3.Y.setFocusableInTouchMode(true);
        fc1Var3.E = new org.telegram.ui.Components.voip.q0(activity);
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.r(user);
        org.telegram.ui.Components.voip.q0 q0Var = fc1Var3.E;
        int i14 = fc1Var3.a;
        q0Var.b.j(org.telegram.messenger.fc.m(i14, 0, user), null, a9Var, user);
        fc1Var3.E.setRoundRadius(org.telegram.messenger.g0.L(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        fc1Var3.F = textView2;
        textView2.setTextSize(1, 28.0f);
        fc1Var3.F.setText(org.telegram.messenger.j6.m(org.telegram.messenger.i5.m(0, user.first_name, user.last_name), fc1Var3.F.getPaint().getFontMetricsInt(), false, null, 0));
        fc1Var3.F.setMaxLines(2);
        fc1Var3.F.setEllipsize(TextUtils.TruncateAt.END);
        fc1Var3.F.setTextColor(-1);
        fc1Var3.F.setGravity(1);
        fc1Var3.F.setImportantForAccessibility(2);
        fc1Var3.Y.addView(fc1Var3.F, c8.na.t(-2, -2, 1, 8, 0, 8, 6));
        org.telegram.ui.Components.voip.l2 l2Var = new org.telegram.ui.Components.voip.l2(activity);
        l2Var.a = new TextView[2];
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            l2Var.a[i15] = new TextView(activity);
            l2Var.a[i15].setTextSize(1, 15.0f);
            l2Var.a[i15].setTextColor(-1);
            l2Var.a[i15].setGravity(1);
            l2Var.addView(l2Var.a[i15]);
            i15++;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        l2Var.c = frameLayout2;
        org.telegram.ui.Components.voip.b1 b1Var = new org.telegram.ui.Components.voip.b1(l2Var, activity, m1Var);
        b1Var.setTextSize(1, 15.0f);
        b1Var.setTextColor(-1);
        b1Var.setGravity(1);
        b1Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f));
        b1Var.setText(org.telegram.messenger.gd.N0(2131742967, null));
        frameLayout2.addView(b1Var, c8.na.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        l2Var.addView(frameLayout2, c8.na.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        l2Var.b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        l2Var.addView(textView3, c8.na.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.N0(2131743003, null));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new kg.r1(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        org.telegram.ui.Components.voip.p2 p2Var = new org.telegram.ui.Components.voip.p2(activity);
        l2Var.d = p2Var;
        l2Var.addView(p2Var, c8.na.c(-2.0f, -1));
        fc1Var3.G = l2Var;
        WeakHashMap weakHashMap2 = r0.i0.a;
        l2Var.setImportantForAccessibility(4);
        fc1Var3.Y.addView(fc1Var3.G, c8.na.t(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            ec1 ec1Var = new ec1(activity);
            fc1Var3.H = ec1Var;
            long j3 = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i17 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null || i17 > 0) {
                int max = Math.max(i17, groupParticipants == null ? 0 : groupParticipants.size());
                int min = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
                org.telegram.ui.Components.c9 c9Var = ec1Var.b;
                c9Var.i(min);
                int i18 = 0;
                while (i18 < min) {
                    c9Var.j(i18, i14, org.telegram.messenger.mp.u1(i14).g2(org.telegram.messenger.n5.o(groupParticipants.get(i18).peer)));
                    i18++;
                    j3 = j3;
                }
                long j10 = j3;
                c9Var.a(false, true);
                if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && org.telegram.messenger.n5.o(groupParticipants.get(0).peer) == j10))) {
                    ec1Var.setVisibility(8);
                } else {
                    ec1Var.c = new org.telegram.ui.Components.wy0(org.telegram.messenger.gd.H(',', "Participants", max), 14.0f, org.telegram.messenger.g0.o());
                    ec1Var.setVisibility(0);
                    ec1Var.invalidate();
                }
            } else {
                ec1Var.setVisibility(8);
            }
            fc1Var3.Y.addView(fc1Var3.H, c8.na.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        fc1Var3.Y.setClipChildren(false);
        fc1Var3.Y.setClipToPadding(false);
        fc1Var3.Y.setPadding(0, 0, 0, org.telegram.messenger.g0.L(15.0f));
        fc1Var3.V = new org.telegram.ui.Components.voip.r(activity);
        fc1Var3.R = new di.n4(activity, m1Var);
        fc1Var3.V.setAlpha(0.0f);
        fc1Var3.R.setVisibility(8);
        ac1Var.addView(fc1Var3.E, c8.na.d(org.telegram.messenger.ks.i3, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        ac1Var.addView(fc1Var3.Y, c8.na.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        ac1Var.addView(fc1Var3.P, c8.na.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        ac1Var.addView(fc1Var3.S, c8.na.d(org.telegram.messenger.ks.b5, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        ac1Var.addView(fc1Var3.O, c8.na.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        ac1Var.addView(fc1Var3.V, c8.na.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        ac1Var.addView(fc1Var3.R, c8.na.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        fc1Var3.j0 = new org.telegram.ui.Components.voip.n1(activity);
        fc1Var3.e = new org.telegram.ui.Components.voip.f3(activity, m1Var);
        fc1Var3.f = new org.telegram.ui.Components.voip.f3(activity, m1Var);
        fc1Var3.h = new org.telegram.ui.Components.voip.f3(activity, m1Var);
        fc1Var3.n = new cc1(activity, 52.0f);
        fc1Var3.e.setTranslationY(org.telegram.messenger.g0.L(100.0f));
        fc1Var3.e.setScaleX(0.0f);
        fc1Var3.e.setScaleY(0.0f);
        fc1Var3.e.animate().setStartDelay(org.telegram.messenger.ks.g2).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        fc1Var3.f.setTranslationY(org.telegram.messenger.g0.L(100.0f));
        fc1Var3.f.setScaleX(0.0f);
        fc1Var3.f.setScaleY(0.0f);
        fc1Var3.f.animate().setStartDelay(org.telegram.messenger.ks.w2).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        fc1Var3.h.setTranslationY(org.telegram.messenger.g0.L(100.0f));
        fc1Var3.h.setScaleX(0.0f);
        fc1Var3.h.setScaleY(0.0f);
        fc1Var3.h.animate().setStartDelay(org.telegram.messenger.ks.M2).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        fc1Var3.n.setTranslationY(org.telegram.messenger.g0.L(100.0f));
        fc1Var3.n.setScaleX(0.0f);
        fc1Var3.n.setScaleY(0.0f);
        fc1Var3.n.animate().setStartDelay(org.telegram.messenger.ks.c3).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        fc1Var3.j0.addView(fc1Var3.e);
        fc1Var3.j0.addView(fc1Var3.f);
        fc1Var3.j0.addView(fc1Var3.h);
        fc1Var3.j0.addView(fc1Var3.n);
        org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
        fc1Var3.f0 = eVar;
        eVar.setListener(new dc1(fc1Var3));
        fc1Var3.f0.setScaleX(1.15f);
        fc1Var3.f0.setScaleY(1.15f);
        ac1Var.addView(fc1Var3.j0, c8.na.e(-1, -2, 80));
        float f10 = org.telegram.messenger.g0.Q1() ? 100 : 27;
        ac1Var.addView(fc1Var3.f0, c8.na.d(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(activity);
        fc1Var3.J = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(i0.a.o(-1, 76), 1, -1));
        fc1Var3.J.setImageResource(R.drawable.msg_addcontact);
        fc1Var3.J.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        ac1Var.addView(fc1Var3.J, c8.na.e(56, 56, 53));
        c8.sa.a(fc1Var3.J);
        ImageView imageView2 = new ImageView(activity);
        fc1Var3.I = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.n6.h0(i0.a.o(-1, 76), 1, -1));
        fc1Var3.I.setImageResource(R.drawable.msg_call_minimize_shadow);
        fc1Var3.I.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        fc1Var3.I.setContentDescription(org.telegram.messenger.gd.N0(2131753753, null));
        ac1Var.addView(fc1Var3.I, c8.na.e(56, 56, 51));
        c8.sa.a(fc1Var3.I);
        kg.k kVar = new kg.k(activity, 5);
        fc1Var3.L = kVar;
        kVar.setContentDescription(org.telegram.messenger.gd.N0(2131742989, null));
        fc1Var3.L.setBackground(org.telegram.ui.ActionBar.n6.h0(i0.a.o(-1, 76), 1, -1));
        fc1Var3.L.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        ac1Var.addView(fc1Var3.L, c8.na.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        fc1Var3.L.setAlpha(0.0f);
        fc1Var3.L.setOnClickListener(new sb1(fc1Var3, 5));
        int i19 = 6;
        fc1Var3.I.setOnClickListener(new sb1(fc1Var3, i19));
        fc1Var3.J.setOnClickListener(new ig0(17, fc1Var3, activity));
        if (fc1Var3.u0.b) {
            fc1Var3.I.setVisibility(8);
            fc1Var3.J.setVisibility(8);
        }
        org.telegram.ui.Components.voip.e2 e2Var = new org.telegram.ui.Components.voip.e2(activity);
        e2Var.a = new HashMap();
        e2Var.b = new ArrayList();
        e2Var.c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        e2Var.r = textPaint;
        e2Var.setOrientation(1);
        e2Var.n = m1Var;
        TransitionSet transitionSet = new TransitionSet();
        e2Var.d = transitionSet;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.i0(3).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        fc1Var3.M0 = e2Var;
        e2Var.setGravity(80);
        fc1Var3.M0.setOnViewsUpdated(new rb1(fc1Var3, 5));
        ac1Var.addView(fc1Var3.M0, c8.na.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(activity, 3, m1Var, true);
        opVar.r(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        opVar.L = alignment;
        opVar.d = -1L;
        opVar.r0 = new rb1(fc1Var3, i19);
        opVar.U = true;
        opVar.h = org.telegram.messenger.g0.L(320.0f);
        opVar.e = true;
        opVar.n(10.0f, 6.0f, 10.0f, 6.0f);
        opVar.s(8.0f);
        fc1Var3.N0 = opVar;
        opVar.v(org.telegram.messenger.gd.N0(2131744009, null));
        ac1Var.addView(fc1Var3.N0, c8.na.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.op opVar2 = new org.telegram.ui.Components.op(activity, 1, m1Var, false);
        opVar2.r(true);
        opVar2.L = alignment;
        opVar2.d = 4000L;
        opVar2.U = true;
        opVar2.h = org.telegram.messenger.g0.L(320.0f);
        opVar2.e = true;
        opVar2.n(10.0f, 6.0f, 10.0f, 6.0f);
        opVar2.s(8.0f);
        fc1Var3.O0 = opVar2;
        opVar2.v(org.telegram.messenger.gd.N0(2131743052, null));
        ac1Var.addView(fc1Var3.O0, c8.na.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        fc1Var3.y();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!fc1Var3.U0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                fc1Var3.U0 = phoneCall != null && phoneCall.video;
            }
            fc1Var3.f();
        }
        yb1Var2.addView(ac1Var);
        if (z10) {
            fc1Var3.F0 = 0.0f;
            fc1Var3.I0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                fc1Var3.d0.setStub(org.telegram.ui.Components.voip.i2.d().s);
                fc1Var3.e0.setStub(org.telegram.ui.Components.voip.i2.d().r);
            }
            fc1Var3.u0.setAlpha(0.0f);
            fc1Var3.y();
            fc1Var3.E0 = true;
            org.telegram.ui.Components.voip.i2.T = true;
            if (org.telegram.ui.Components.voip.i2.V != null) {
                org.telegram.ui.Components.voip.i2.U.getClass();
                throw null;
            }
            fc1Var3.L0.d();
            org.telegram.messenger.g0.h3(new rb1(fc1Var3, 11), 32L);
        } else {
            fc1Var3.F0 = 1.0f;
            fc1Var3.x();
        }
        org.telegram.ui.Components.voip.j2.d();
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
        float f16 = org.telegram.ui.Components.voip.i2.d().d.x + org.telegram.ui.Components.voip.i2.d().F;
        float f17 = org.telegram.ui.Components.voip.i2.d().d.y + org.telegram.ui.Components.voip.i2.d().G;
        final float x10 = this.Z.getX();
        final float y10 = this.Z.getY();
        final float scaleX = this.Z.getScaleX();
        org.telegram.ui.Components.voip.i2.U.getClass();
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
                measuredWidth = org.telegram.ui.Cells.c0.z(org.telegram.ui.Components.voip.i2.d().f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.i2.d().f * 0.25f) + (f16 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * f15)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
                f14 = org.telegram.ui.Cells.c0.z(org.telegram.ui.Components.voip.i2.d().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.i2.d().h * 0.25f) + (f17 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * f15)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
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
            org.telegram.ui.Components.voip.i2.U.getClass();
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ub1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f24 = 1.0f - floatValue;
                fc1 fc1Var = fc1.this;
                fc1Var.F0 = f24;
                fc1Var.x();
                if (z11) {
                    float f25 = (f11 * floatValue) + (scaleX * f24);
                    fc1Var.Z.setScaleX(f25);
                    fc1Var.Z.setScaleY(f25);
                    fc1Var.Z.setTranslationX((f19 * floatValue) + (x10 * f24));
                    fc1Var.Z.setTranslationY((measuredHeight * floatValue) + (y10 * f24));
                    fc1Var.Z.setCornerRadius((L2 * floatValue) + (L * f24));
                    fc1Var.Z.setAlpha((f18 * floatValue) + (1.0f * f24));
                }
                float f26 = (f23 * floatValue) + (1.0f * f24);
                fc1Var.d0.setScaleX(f26);
                fc1Var.d0.setScaleY(f26);
                float f27 = 0.0f * f24;
                float f28 = (measuredWidth2 * floatValue) + f27;
                float f29 = (measuredHeight2 * floatValue) + f27;
                fc1Var.d0.setTranslationX(f28);
                fc1Var.d0.setTranslationY(f29);
                fc1Var.d0.setRoundCorners(((org.telegram.messenger.g0.L(4.0f) * floatValue) * 1.0f) / f26);
                if (!fc1Var.Z.Q) {
                    fc1Var.e0.d(false, floatValue);
                }
                fc1Var.u0.invalidate();
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
            org.telegram.ui.Components.voip.v2 v2Var = this.x;
            int i7 = 1;
            if (v2Var.L && z10 != v2Var.F) {
                v2Var.F = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                v2Var.c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.u2(v2Var, i7));
                v2Var.c.setInterpolator(org.telegram.ui.Components.kr.f);
                v2Var.c.setDuration(200L);
                v2Var.c.start();
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
                    this.E.animate().setStartDelay(0L).translationY(org.telegram.messenger.g0.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.kr.f).start();
                }
                this.P.animate().setListener(null).cancel();
                this.P.setVisibility(0);
                this.P.setAlpha(0.0f);
                this.P.setScaleX(0.3f);
                this.P.setScaleY(0.3f);
                this.P.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.kr.g).start();
                ViewPropertyAnimator translationY = this.O.animate().scaleX(1.72f).scaleY(1.72f).translationY(org.telegram.messenger.g0.L(140.0f));
                org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f;
                org.telegram.messenger.m10.o(translationY, krVar, 400L);
                this.S.animate().setListener(null).cancel();
                this.S.setVisibility(0);
                this.S.setTranslationY(-org.telegram.messenger.g0.L(120.0f));
                this.S.setScaleX(0.7f);
                this.S.setScaleY(0.7f);
                this.S.setAlpha(0.0f);
                this.S.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new vb1(this, 3)).setInterpolator(krVar).start();
            } else {
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.kr.f).start();
                }
                this.P.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.kr krVar2 = org.telegram.ui.Components.kr.f;
                duration.setInterpolator(krVar2).setListener(new on(this.P)).start();
                this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(krVar2).setDuration(280L).start();
                this.S.animate().setListener(null).cancel();
                this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.g0.L(120.0f)).setListener(new vb1(this, 4)).setDuration(250L).setInterpolator(krVar2).start();
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
        this.e0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new wb1(this));
        this.d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new xb1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.c0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void g() {
        if (this.G0 || this.E0) {
            return;
        }
        zb1 zb1Var = this.o0;
        if (zb1Var != null) {
            zb1Var.a(false, false);
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
            fc1 fc1Var = m1;
            org.telegram.ui.Components.voip.i2.f(fc1Var.b, fc1Var.a, fc1Var.u0.getMeasuredWidth(), measuredHeight, 1);
            WindowInsets windowInsets = m1.r0;
            if (windowInsets != null) {
                org.telegram.ui.Components.voip.i2.W = windowInsets.getSystemWindowInsetTop();
                m1.r0.getSystemWindowInsetBottom();
            }
        }
        if (org.telegram.ui.Components.voip.i2.d() == null) {
            return;
        }
        ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).setDuration(150L);
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f;
        duration.setInterpolator(krVar).start();
        this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(krVar).start();
        this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(krVar).start();
        this.O.animate().alpha(0.0f).setDuration(150L).setInterpolator(krVar).start();
        this.Y.animate().alpha(0.0f).setDuration(150L).setInterpolator(krVar).start();
        this.j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(krVar).start();
        this.h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(krVar).start();
        this.i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(krVar).start();
        this.a0.animate().alpha(0.0f).setDuration(350L).setInterpolator(krVar).start();
        this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(krVar).start();
        org.telegram.ui.Components.voip.i2.T = true;
        this.E0 = true;
        ValueAnimator b10 = b(false);
        this.L0.d();
        b10.addListener(new vb1(this, 1));
        b10.setDuration(350L);
        b10.setInterpolator(krVar);
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
        this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, org.telegram.messenger.gd.N0(2131743161, null), false, false);
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.tb1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                fc1 fc1Var = fc1.this;
                fc1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                fc1Var.f0.setTranslationY(L2 * floatValue);
                int i7 = (int) (marginEnd - ((r1 + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i7;
                marginLayoutParams2.rightMargin = i7;
                fc1Var.f0.requestLayout();
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
        animatorSet.addListener(new org.telegram.ui.Components.f10(18, this, runnable));
        animatorSet.start();
        org.telegram.messenger.g0.h3(new rb1(this, 7), 133L);
    }

    public final void j(org.telegram.ui.Components.voip.f3 f3Var, VoIPService voIPService) {
        if (!this.n0) {
            f3Var.d(2, false, false);
            f3Var.setOnBtnClickedListener(null);
            f3Var.setEnabled(false);
        } else {
            f3Var.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                f3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
            } else {
                f3Var.d(2, voIPService.isSwitchingCamera(), false);
            }
            f3Var.setOnBtnClickedListener(new a7(this, voIPService, f3Var, 23));
        }
    }

    public final void k(org.telegram.ui.Components.voip.f3 f3Var, VoIPService voIPService, boolean z10) {
        f3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.r1 r1Var = this.Z;
        boolean isMicMute = voIPService.isMicMute();
        if (z10) {
            ValueAnimator valueAnimator = r1Var.g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(r1Var.L, isMicMute ? 1.0f : 0.0f);
            r1Var.g0 = ofFloat;
            ofFloat.addUpdateListener(r1Var.h0);
            r1Var.g0.setDuration(150L);
            r1Var.g0.start();
        } else {
            ValueAnimator valueAnimator2 = r1Var.g0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            r1Var.L = isMicMute ? 1.0f : 0.0f;
            r1Var.invalidate();
        }
        f3Var.setOnBtnClickedListener(new qb1(this, 4));
    }

    public final void l(org.telegram.ui.Components.voip.f3 f3Var, VoIPService voIPService) {
        int i7;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i10 = 0;
        if (voIPService.isBluetoothOn()) {
            f3Var.d(4, false, false);
            i10 = 2;
        } else {
            if (!voipAudioManager.isSpeakerphoneOn()) {
                f3Var.d(5, false, false);
                i7 = 1;
                f3Var.setEnabled(true);
                f3Var.setOnBtnClickedListener(new bg.g0(this, i7, f3Var, voIPService, 9));
            }
            f3Var.d(5, true, false);
        }
        i7 = i10;
        f3Var.setEnabled(true);
        f3Var.setOnBtnClickedListener(new bg.g0(this, i7, f3Var, voIPService, 9));
    }

    public final void m(org.telegram.ui.Components.voip.f3 f3Var, VoIPService voIPService, boolean z10) {
        if (!((this.n0 || this.m0) ? true : voIPService.isVideoAvailable())) {
            f3Var.d(3, true, false);
            f3Var.setOnClickListener(null);
            f3Var.setEnabled(false);
            return;
        }
        if (!this.n0) {
            f3Var.d(3, true, z10);
        } else if (voIPService.isScreencast()) {
            f3Var.d(3, false, z10);
        } else {
            f3Var.d(3, false, z10);
        }
        f3Var.setOnBtnClickedListener(new qb1(this, 5));
        f3Var.setEnabled(true);
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
                this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.kr.f).start();
            } else {
                this.E.setAlpha(0.0f);
                this.E.setTranslationY(-org.telegram.messenger.g0.L(135.0f));
                this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.kr.f).start();
            }
        } else if (!z12 && this.E.getTag() != null) {
            this.E.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.kr.f).setListener(new vb1(this, 8)).start();
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
        org.telegram.ui.Components.voip.j2.d();
        y();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.ui.Components.voip.y2 y2Var;
        if (i7 > 0) {
            this.j1 = true;
        }
        if (this.G == null || (y2Var = this.w) == null) {
            return;
        }
        int i10 = y2Var.W;
        if ((i10 == 2 || i10 == 3) && this.j1) {
            org.telegram.messenger.g0.h3(new ao0(this, i7, 5), 400L);
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
        org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3(0, this.b, null);
        boolean[] zArr = new boolean[3];
        n3Var.S = org.telegram.messenger.gd.N0(2131743158, null);
        n3Var.U = charSequence;
        n3Var.m0 = org.telegram.messenger.gd.N0(2131747637, null);
        n3Var.n0 = null;
        n3Var.show();
        for (int i7 = 0; i7 < 3; i7++) {
            if (zArr[i7] && (textView = (TextView) n3Var.d(-(i7 + 1))) != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, n3Var.j1);
            }
        }
        n3Var.setCanceledOnTouchOutside(true);
        n3Var.setOnDismissListener(new q5(this, 18));
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
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z, (Property<org.telegram.ui.Components.voip.r1, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<org.telegram.ui.Components.voip.r1, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<org.telegram.ui.Components.voip.r1, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.A0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.r1 r1Var = this.Z;
                if (r1Var.E < 0.0f) {
                    r1Var.d(1.0f, 1.0f);
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
            org.telegram.ui.Components.voip.r1 r1Var2 = this.Z;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(r1Var2, (Property<org.telegram.ui.Components.voip.r1, Float>) View.ALPHA, r1Var2.getAlpha(), 0.0f));
            if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 2) {
                org.telegram.ui.Components.voip.r1 r1Var3 = this.Z;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r1Var3, (Property<org.telegram.ui.Components.voip.r1, Float>) View.SCALE_X, r1Var3.getScaleX(), 0.7f);
                org.telegram.ui.Components.voip.r1 r1Var4 = this.Z;
                animatorSet5.playTogether(ofFloat, ObjectAnimator.ofFloat(r1Var4, (Property<org.telegram.ui.Components.voip.r1, Float>) View.SCALE_Y, r1Var4.getScaleX(), 0.7f));
            }
            this.A0 = animatorSet5;
            animatorSet5.addListener(new vb1(this, 7));
            this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.kr.f);
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
        hz0 hz0Var = this.Q0;
        if (z10 || !this.x0) {
            if (z10 && !this.x0) {
                this.N0.f(true);
                this.O0.f(true);
                ViewPropertyAnimator translationY = this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f;
                translationY.setInterpolator(krVar).start();
                this.G.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(krVar).start();
                this.L.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(krVar).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(krVar).start();
                this.J.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(krVar).start();
                this.O.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(krVar).start();
                this.j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(krVar).start();
                this.h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(krVar).start();
                this.i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(krVar).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, 1.0f);
                this.P0 = ofFloat;
                ofFloat.addUpdateListener(hz0Var);
                this.P0.setDuration(150L).setInterpolator(krVar);
                this.P0.start();
                this.j0.setEnabled(true);
            }
            i7 = 0;
        } else {
            ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L);
            org.telegram.ui.Components.kr krVar2 = org.telegram.ui.Components.kr.f;
            duration.setInterpolator(krVar2).start();
            this.I.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(krVar2).start();
            this.J.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(krVar2).start();
            this.O.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(krVar2).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(krVar2).start();
            this.G.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(krVar2).start();
            this.j0.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(krVar2).start();
            this.h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(krVar2).start();
            this.i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(krVar2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y0, 0.0f);
            this.P0 = ofFloat2;
            ofFloat2.addUpdateListener(hz0Var);
            this.P0.setDuration(150L).setInterpolator(krVar2);
            this.P0.start();
            org.telegram.messenger.g0.r(this.S0);
            this.R0 = false;
            this.j0.setEnabled(false);
            this.O0.f(true);
            i7 = org.telegram.messenger.ks.g2;
        }
        this.x0 = z10;
        yb1 yb1Var = this.u0;
        if (z10) {
            yb1Var.setSystemUiVisibility(yb1Var.getSystemUiVisibility() & (-5));
        } else {
            yb1Var.setSystemUiVisibility(yb1Var.getSystemUiVisibility() | 4);
        }
        this.M0.animate().translationY((-org.telegram.messenger.g0.L(16.0f)) - (this.x0 ? org.telegram.messenger.g0.L(80.0f) : 0)).setDuration(150L).setStartDelay(i7).setInterpolator(org.telegram.ui.Components.kr.f).start();
    }

    public final void s() {
        if (VoIPService.getSharedInstance() != null) {
            rb1 rb1Var = this.S0;
            org.telegram.messenger.g0.r(rb1Var);
            this.R0 = false;
            if (this.z0 && this.x0) {
                org.telegram.messenger.g0.h3(rb1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void t() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.w0.isTouchExplorationEnabled()) {
                this.s.announceForAccessibility(!this.n0 ? org.telegram.messenger.gd.N0(2131754731, null) : org.telegram.messenger.gd.N0(2131754732, null));
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
                zb1 zb1Var = new zb1(this, this.s.getContext(), r0[0], r0[1]);
                this.o0 = zb1Var;
                WindowInsets windowInsets = this.r0;
                if (windowInsets != null) {
                    zb1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
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
            Transition duration = new org.telegram.ui.ActionBar.i0(4).setDuration(250L);
            org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f;
            transitionSet.addTransition(duration.setInterpolator(krVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(krVar));
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.r2.class, true);
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.f3.class, true);
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
            this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, org.telegram.messenger.gd.N0(2131743161, null), false, z10);
            this.n.setOnClickListener(new sb1(this, i10));
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
    /* JADX WARN: Type inference failed for: r0v25, types: [org.telegram.ui.Components.p9] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v28, types: [org.telegram.ui.Components.p9] */
    /* JADX WARN: Type inference failed for: r0v29, types: [org.telegram.ui.Components.p9] */
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
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.p9[]] */
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
                        org.telegram.messenger.m10.o(r62[i16].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.kr.k, 250L);
                    }
                }
            }
            this.O0.postDelayed(new rb1(this, 9), 1000L);
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
        ac1 ac1Var = this.s;
        if (ac1Var != null) {
            ac1Var.invalidate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x003e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0b9e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0ad6  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0bed  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0cd3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0d16  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0d32 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0d3d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0d42  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0d73  */
    /* JADX WARN: Removed duplicated region for block: B:317:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0d56  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0c01  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:397:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07c6  */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        boolean z10;
        int i7;
        boolean z11;
        int L;
        int i10;
        boolean z12;
        boolean z13;
        int i11;
        int childsHight;
        org.telegram.ui.Components.voip.r1 r1Var;
        org.telegram.ui.Components.voip.r1 r1Var2;
        boolean z14;
        boolean z15;
        boolean z16;
        org.telegram.ui.Components.voip.o2 o2Var;
        VideoSink videoSink;
        int i12;
        int i13;
        boolean z17;
        TL_phone.PhoneCall phoneCall;
        VoIPService.SharedUIParams sharedUIParams;
        long j3;
        Layout layout;
        int lineCount;
        float f10;
        float f11;
        TL_phone.PhoneCall phoneCall2;
        float f12;
        boolean z18;
        boolean z19;
        TextView textView;
        float f13;
        if (this.G0 || this.E0) {
            return;
        }
        boolean z20 = true;
        int i14 = 0;
        boolean z21 = this.q0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i15 = this.p0;
        TLRPC.User user = this.d;
        if (i15 == 1 || i15 == 2) {
            this.G.b(org.telegram.messenger.gd.N0(2131743169, null), true, z21);
        } else {
            if (i15 != 3) {
                int i16 = 26;
                if (i15 == 4) {
                    this.G.b(org.telegram.messenger.gd.N0(2131743158, null), false, z21);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : Instance.ERROR_UNKNOWN;
                    if (TextUtils.equals(lastError, Instance.ERROR_UNKNOWN)) {
                        org.telegram.messenger.g0.h3(new rb1(this, 2), 1000L);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_INCOMPATIBLE)) {
                        p(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("VoipPeerIncompatible", null, 2131743013, org.telegram.messenger.i5.m(0, user.first_name, user.last_name))));
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PEER_OUTDATED)) {
                        if (this.U0) {
                            String a02 = org.telegram.messenger.gd.a0("VoipPeerVideoOutdated", null, 2131743011, org.telegram.messenger.n10.k(user, true));
                            boolean[] zArr = new boolean[1];
                            org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3(0, this.b, null);
                            boolean[] zArr2 = new boolean[3];
                            n3Var.S = org.telegram.messenger.gd.N0(2131743158, null);
                            n3Var.U = org.telegram.messenger.g0.W2(a02);
                            String N0 = org.telegram.messenger.gd.N0(2131752577, null);
                            qb1 qb1Var = new qb1(this, 1);
                            n3Var.o0 = N0;
                            n3Var.p0 = qb1Var;
                            String N02 = org.telegram.messenger.gd.N0(2131743010, null);
                            yi0 yi0Var = new yi0(i16, this, zArr);
                            n3Var.m0 = N02;
                            n3Var.n0 = yi0Var;
                            n3Var.show();
                            for (int i17 = 0; i17 < 3; i17++) {
                                if (zArr2[i17] && (textView = (TextView) n3Var.d(-(i17 + 1))) != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, n3Var.j1);
                                }
                            }
                            n3Var.setCanceledOnTouchOutside(true);
                            n3Var.setOnDismissListener(new di.u1(this, zArr, 12));
                        } else {
                            p(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("VoipPeerOutdated", null, 2131743012, org.telegram.messenger.n10.k(user, true))));
                        }
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PRIVACY)) {
                        p(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131752594, org.telegram.messenger.i5.m(0, user.first_name, user.last_name))));
                        org.telegram.ui.Components.b5.i0(this.b, this.a, user.id);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_AUDIO_IO)) {
                        p("Error initializing audio hardware");
                    } else if (TextUtils.equals(lastError, Instance.ERROR_LOCALIZED)) {
                        this.u0.b();
                    } else if (TextUtils.equals(lastError, Instance.ERROR_CONNECTION_SERVICE)) {
                        p(org.telegram.messenger.gd.N0(2131743160, null));
                    } else {
                        org.telegram.messenger.g0.h3(new rb1(this, 1), 1000L);
                    }
                } else if (i15 != 5) {
                    switch (i15) {
                        case 11:
                            boolean z22 = sharedInstance != null && sharedInstance.hasRate();
                            this.e0.c();
                            if (!z22 || this.G0) {
                                org.telegram.messenger.g0.h3(new rb1(this, 0), 200L);
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
                                    f13 = 0.0f;
                                    this.j0.animate().alpha(0.0f).setDuration(80L).start();
                                    org.telegram.messenger.g0.h3(new iy0(i16, this, sharedInstance), 2L);
                                } else {
                                    f13 = 0.0f;
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
                                    this.V.a(new pb1(this, sharedInstance, i14), false);
                                }
                                this.R.setVisibility(0);
                                di.n4 n4Var = this.R;
                                qb1 qb1Var2 = new qb1(this, i14);
                                org.telegram.ui.Components.voip.g1[] g1VarArr = (org.telegram.ui.Components.voip.g1[]) n4Var.d;
                                n4Var.e = qb1Var2;
                                ai.h0 h0Var = (ai.h0) n4Var.b;
                                h0Var.setVisibility(0);
                                ((FrameLayout) n4Var.c).setVisibility(0);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.ALPHA;
                                float f14 = f13;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(h0Var, (Property<ai.h0, Float>) property, 0.0f, 1.0f);
                                Property property2 = View.SCALE_X;
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(h0Var, (Property<ai.h0, Float>) property2, 0.7f, 1.0f);
                                Property property3 = View.SCALE_Y;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(h0Var, (Property<ai.h0, Float>) property3, 0.7f, 1.0f);
                                Property property4 = View.TRANSLATION_Y;
                                int i19 = 2;
                                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(h0Var, (Property<ai.h0, Float>) property4, org.telegram.messenger.g0.L(24.0f), f14));
                                animatorSet.setInterpolator(org.telegram.ui.Components.kr.f);
                                animatorSet.setDuration(250L);
                                int i20 = 0;
                                while (i20 < g1VarArr.length) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    g1VarArr[i20].setAlpha(f14);
                                    int i21 = i19;
                                    float[] fArr = new float[i21];
                                    // fill-array-data instruction
                                    fArr[0] = 0.0f;
                                    fArr[1] = 1.0f;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(g1VarArr[i20], (Property<org.telegram.ui.Components.voip.g1, Float>) property, fArr);
                                    float[] fArr2 = new float[i21];
                                    // fill-array-data instruction
                                    fArr2[0] = 0.3f;
                                    fArr2[1] = 1.0f;
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(g1VarArr[i20], (Property<org.telegram.ui.Components.voip.g1, Float>) property2, fArr2);
                                    AnimatorSet animatorSet3 = animatorSet;
                                    float[] fArr3 = new float[i21];
                                    // fill-array-data instruction
                                    fArr3[0] = 0.3f;
                                    fArr3[1] = 1.0f;
                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(g1VarArr[i20], (Property<org.telegram.ui.Components.voip.g1, Float>) property3, fArr3);
                                    org.telegram.ui.Components.voip.g1 g1Var = g1VarArr[i20];
                                    float[] fArr4 = new float[i21];
                                    fArr4[0] = org.telegram.messenger.g0.L(30.0f);
                                    fArr4[1] = 0.0f;
                                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(g1Var, (Property<org.telegram.ui.Components.voip.g1, Float>) property4, fArr4);
                                    Animator[] animatorArr = new Animator[4];
                                    animatorArr[0] = ofFloat4;
                                    animatorArr[1] = ofFloat5;
                                    animatorArr[i21] = ofFloat6;
                                    animatorArr[3] = ofFloat7;
                                    animatorSet2.playTogether(animatorArr);
                                    animatorSet2.setDuration(250L);
                                    animatorSet2.setStartDelay(i20 * 16);
                                    animatorSet2.start();
                                    i20++;
                                    animatorSet = animatorSet3;
                                    f14 = 0.0f;
                                    i19 = 2;
                                }
                                animatorSet.start();
                                if (this.C0) {
                                    this.C0 = false;
                                    ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f;
                                    duration.setInterpolator(krVar).setListener(new on(this.P)).start();
                                    this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(krVar).setDuration(250L).start();
                                    this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.g0.L(120.0f)).setListener(new on(this.P)).setDuration(250L).setInterpolator(krVar).start();
                                }
                                for (org.telegram.ui.Components.p9 p9Var : this.W) {
                                    p9Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(org.telegram.ui.Components.kr.f).setDuration(250L).start();
                                }
                                this.F.animate().alpha(0.0f).setDuration(70L).setListener(new vb1(this, 5)).start();
                                ViewPropertyAnimator alpha = this.L.animate().alpha(0.0f);
                                org.telegram.ui.Components.kr krVar2 = org.telegram.ui.Components.kr.f;
                                org.telegram.messenger.m10.o(alpha, krVar2, 250L);
                                this.L.setVisibility(8);
                                this.G.d(false, true);
                                this.G.c(false);
                                org.telegram.ui.Components.voip.p2 p2Var = this.G.d;
                                p2Var.n = true;
                                p2Var.invalidate();
                                org.telegram.ui.Components.voip.q0 q0Var = this.E;
                                q0Var.setShowWaves(false);
                                AnimatorSet animatorSet4 = q0Var.c;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                                AnimatorSet animatorSet5 = new AnimatorSet();
                                q0Var.c = animatorSet5;
                                animatorSet5.playTogether(ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.Components.voip.q0, Float>) View.ALPHA, q0Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.Components.voip.q0, Float>) View.TRANSLATION_Y, q0Var.getTranslationY(), -org.telegram.messenger.g0.L(24.0f)), ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.Components.voip.q0, Float>) View.SCALE_X, q0Var.getScaleX(), 0.9f, 1.0f), ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.Components.voip.q0, Float>) View.SCALE_Y, q0Var.getScaleY(), 0.9f, 1.0f));
                                q0Var.c.setInterpolator(krVar2);
                                q0Var.c.setDuration(300L);
                                q0Var.c.setStartDelay(250L);
                                q0Var.c.start();
                                u(true);
                                this.n.setVisibility(4);
                                this.a0.setAlpha(0.0f);
                                this.a0.setVisibility(8);
                                this.Z.setAlpha(0.0f);
                                this.Z.setVisibility(8);
                                zb1 zb1Var = this.o0;
                                if (zb1Var != null) {
                                    zb1Var.a(false, false);
                                }
                                this.M0.animate().alpha(0.0f).setDuration(250L).start();
                                break;
                            }
                            break;
                        case 12:
                            if (this.q0 != 12) {
                                this.G.b(org.telegram.messenger.gd.N0(2131743159, null), true, z21);
                                break;
                            }
                            break;
                        case 13:
                            this.G.b(org.telegram.messenger.gd.N0(2131742968, null), true, z21);
                            break;
                        case 14:
                            this.G.b(org.telegram.messenger.gd.N0(2131742996, null), true, z21);
                            break;
                        case 15:
                            this.f0.setRetryMod(false);
                            if (sharedState != null && sharedState.isConference()) {
                                this.G.b(org.telegram.messenger.gd.N0(2131743048, null), false, z21);
                                this.f0.setTranslationY(0.0f);
                            } else if (sharedState == null || !sharedState.isCallingVideo()) {
                                this.G.b(org.telegram.messenger.gd.N0(2131743050, null), false, z21);
                                this.f0.setTranslationY(0.0f);
                            } else {
                                this.G.b(org.telegram.messenger.gd.N0(2131743047, null), false, z21);
                                this.f0.setTranslationY(-org.telegram.messenger.g0.L(60.0f));
                            }
                            z10 = false;
                            break;
                        case 16:
                            if (this.q0 != 16) {
                                this.G.b(org.telegram.messenger.gd.N0(2131742995, null), true, z21);
                                break;
                            }
                            break;
                        case 17:
                            this.G.b(org.telegram.messenger.gd.N0(2131743242, null), false, z21);
                            this.f0.setRetryMod(true);
                            this.n0 = false;
                            this.m0 = false;
                            z10 = false;
                            break;
                    }
                    if (this.o0 == null) {
                        return;
                    }
                    boolean z23 = this.m0 || this.n0;
                    if (sharedInstance != null) {
                        this.m0 = sharedInstance.getRemoteVideoState() == 2;
                        if (sharedInstance.getVideoState(false) != 2) {
                            z18 = true;
                            if (sharedInstance.getVideoState(false) != 1) {
                                z19 = false;
                                this.n0 = z19;
                                if (z19 && !this.U0) {
                                    this.U0 = z18;
                                }
                            }
                        } else {
                            z18 = true;
                        }
                        z19 = z18;
                        this.n0 = z19;
                        if (z19) {
                            this.U0 = z18;
                        }
                    }
                    if (z21) {
                        this.Z.b();
                        this.a0.b();
                    }
                    if (this.m0) {
                        if (this.E0) {
                            f12 = 1.0f;
                        } else {
                            f12 = 1.0f;
                            this.w.setAlpha(1.0f);
                        }
                        if (z21) {
                            this.d0.animate().alpha(f12).setDuration(250L).start();
                        } else {
                            this.d0.animate().cancel();
                            this.d0.setAlpha(f12);
                        }
                        if (!this.d0.d.isFirstFrameRendered() && !this.I0) {
                            i7 = 0;
                            this.m0 = false;
                            if (!this.n0 || this.m0) {
                                this.w.setVisibility(4);
                            } else {
                                this.w.setVisibility(i7);
                                if (z21) {
                                    this.d0.animate().alpha(0.0f).setDuration(250L).start();
                                } else {
                                    this.d0.animate().cancel();
                                    this.d0.setAlpha(0.0f);
                                }
                            }
                            z11 = this.n0;
                            if (z11 || !this.m0) {
                                this.H0 = false;
                            }
                            boolean z24 = (z11 || !this.H0 || org.telegram.messenger.g0.H1(this.b)) ? false : true;
                            o(z21, z23);
                            L = this.E.getTag() != null ? 0 : org.telegram.messenger.g0.L(135.0f) + org.telegram.messenger.g0.L(12.0f);
                            if (z21) {
                                this.f0.setVisibility(z20 ? 0 : 8);
                                i10 = 8;
                            } else {
                                if (z20 && this.f0.getTag() == null) {
                                    this.f0.animate().setListener(null).cancel();
                                    i10 = 8;
                                    if (this.f0.getVisibility() == 8) {
                                        this.f0.setVisibility(0);
                                        this.f0.setAlpha(0.0f);
                                    }
                                    this.f0.animate().alpha(1.0f);
                                } else {
                                    i10 = 8;
                                }
                                if (!z20 && this.f0.getTag() != null) {
                                    this.f0.animate().setListener(null).cancel();
                                    this.f0.animate().setListener(new vb1(this, 9)).alpha(0.0f);
                                }
                            }
                            this.f0.setEnabled(z20);
                            this.f0.setTag(!z20 ? 1 : null);
                            this.u0.setLockOnScreen(this.J0);
                            z12 = this.p0 != 3 && (this.n0 || this.m0);
                            this.z0 = z12;
                            if (!z12 && !this.x0) {
                                r(true);
                            }
                            if (this.x0 && this.z0 && !this.R0 && sharedInstance != null) {
                                org.telegram.messenger.g0.h3(this.S0, 3000L);
                                this.R0 = true;
                            }
                            int i22 = this.p0;
                            boolean z25 = i22 == 11 && this.x0;
                            boolean z26 = (!z20 || i22 == 16 || i22 == 11 || i22 == 12 || i22 == 14 || i22 == 6 || !this.x0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) ? false : true;
                            z13 = z24;
                            if (z21) {
                                ImageView imageView = this.I;
                                if (z25) {
                                    i10 = 0;
                                }
                                imageView.setVisibility(i10);
                                this.I.setAlpha(z25 ? 1.0f : 0.0f);
                                this.J.setVisibility(z26 ? 0 : 8);
                                this.J.setAlpha(z26 ? 1.0f : 0.0f);
                                this.M0.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) - (this.x0 ? org.telegram.messenger.g0.L(80.0f) : 0));
                            } else {
                                if (z25) {
                                    this.I.animate().alpha(1.0f).start();
                                } else {
                                    if (this.I.getVisibility() != 0) {
                                        this.I.setVisibility(0);
                                        f10 = 0.0f;
                                        this.I.setAlpha(0.0f);
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    this.I.animate().alpha(f10).start();
                                }
                                if (z26) {
                                    this.J.animate().alpha(1.0f).start();
                                } else {
                                    if (this.J.getVisibility() != 0) {
                                        this.J.setVisibility(0);
                                        f11 = 0.0f;
                                        this.J.setAlpha(0.0f);
                                    } else {
                                        f11 = 0.0f;
                                    }
                                    this.J.animate().alpha(f11).start();
                                }
                                this.M0.animate().translationY((-org.telegram.messenger.g0.L(16.0f)) - (this.x0 ? org.telegram.messenger.g0.L(80.0f) : 0)).setDuration(150L).setInterpolator(org.telegram.ui.Components.kr.f).start();
                            }
                            i11 = this.p0;
                            if (i11 != 10 && i11 != 11) {
                                u(z21);
                            }
                            if (i14 != 0) {
                                this.G.e(z21);
                            }
                            this.G.d(z10, z21);
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
                            if (z21) {
                                this.Y.setTranslationY(L);
                            } else {
                                if (this.C0 && (this.n0 || this.m0)) {
                                    this.Y.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.kr.f).start();
                                    j3 = 250;
                                } else {
                                    j3 = 250;
                                    this.Y.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.kr.f).start();
                                }
                                if (L != this.v0) {
                                    this.Y.animate().setStartDelay(this.p0 == 11 ? j3 : 0L).translationY(L).setDuration(200L).setInterpolator(org.telegram.ui.Components.kr.f).start();
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
                                org.telegram.ui.Components.voip.n2 n2Var = (!this.n0 || sharedInstance.isScreencast()) ? null : this.e0.d;
                                if (!this.l1 || (o2Var = this.k1) == null) {
                                    if (z13) {
                                        videoSink = this.c0;
                                        sharedInstance.setSinks(n2Var, videoSink);
                                        if (z21) {
                                            org.telegram.ui.Components.voip.e2 e2Var = this.M0;
                                            e2Var.f = false;
                                            if (!e2Var.e && e2Var.getParent() != null) {
                                                TransitionManager.beginDelayedTransition(e2Var, e2Var.d);
                                            }
                                        }
                                        if (sharedInstance.isMicMute()) {
                                            this.M0.c("self-muted");
                                        } else {
                                            this.M0.a(R.drawable.calls_mute_mini, org.telegram.messenger.gd.N0(2131743036, null), "self-muted");
                                        }
                                        if ((!this.n0 || this.m0) && (((i12 = this.p0) == 3 || i12 == 5) && sharedInstance.getCallDuration() > 500)) {
                                            if (sharedInstance.getRemoteAudioState() != 0) {
                                                org.telegram.ui.Components.voip.e2 e2Var2 = this.M0;
                                                i13 = 1;
                                                e2Var2.a(R.drawable.calls_mute_mini, org.telegram.messenger.gd.a0("VoipUserMicrophoneIsOff", null, 2131742977, e2Var2.b(org.telegram.messenger.n10.k(user, true))), "muted");
                                            } else {
                                                i13 = 1;
                                                this.M0.c("muted");
                                            }
                                            if (sharedInstance.getRemoteVideoState() != 0) {
                                                org.telegram.ui.Components.voip.e2 e2Var3 = this.M0;
                                                Object[] objArr = new Object[i13];
                                                objArr[0] = e2Var3.b(org.telegram.messenger.n10.k(user, i13));
                                                e2Var3.a(R.drawable.calls_camera_mini, org.telegram.messenger.gd.a0("VoipUserCameraIsOff", null, 2131742978, objArr), MediaStreamTrack.VIDEO_TRACK_KIND);
                                            } else {
                                                this.M0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                            }
                                        } else {
                                            if (sharedInstance.getRemoteAudioState() == 0) {
                                                org.telegram.ui.Components.voip.e2 e2Var4 = this.M0;
                                                e2Var4.a(R.drawable.calls_mute_mini, org.telegram.messenger.gd.a0("VoipUserMicrophoneIsOff", null, 2131742977, e2Var4.b(org.telegram.messenger.n10.k(user, true))), "muted");
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
                                                z17 = true;
                                                if (z21) {
                                                    org.telegram.ui.Components.voip.e2 e2Var5 = this.M0;
                                                    if (e2Var5.f) {
                                                        e2Var5.e = z17;
                                                        org.telegram.messenger.g0.h3(new oi.c2(e2Var5, 20), 700L);
                                                    }
                                                    e2Var5.f = false;
                                                }
                                            }
                                        }
                                        if (this.M0.getChildCount() != 0) {
                                            z17 = true;
                                            this.N0.f(true);
                                            if (z21) {
                                            }
                                        }
                                        z17 = true;
                                        if (z21) {
                                        }
                                    } else {
                                        o2Var = this.d0;
                                    }
                                }
                                videoSink = o2Var.d;
                                sharedInstance.setSinks(n2Var, videoSink);
                                if (z21) {
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
                                z17 = true;
                                if (z21) {
                                }
                            }
                            childsHight = this.M0.getChildsHight();
                            r1Var = this.a0;
                            if (r1Var.getParent() == null && z21) {
                                r1Var.U = childsHight;
                            } else {
                                r1Var.U = childsHight;
                            }
                            r1Var2 = this.Z;
                            if (r1Var2.getParent() == null && z21) {
                                r1Var2.U = childsHight;
                            } else {
                                r1Var2.U = childsHight;
                            }
                            this.Z.setUiVisible(this.x0);
                            this.a0.setUiVisible(this.x0);
                            if (this.n0) {
                                z14 = true;
                                q(0, z21);
                            } else if (!this.m0 || this.H0) {
                                z14 = true;
                                q(1, z21);
                            } else {
                                q(2, z21);
                                z14 = true;
                            }
                            if (!z13 && this.a0.getTag() == null) {
                                this.a0.setIsActive(z14);
                                if (this.a0.getVisibility() != 0) {
                                    this.a0.setVisibility(0);
                                    this.a0.setAlpha(0.0f);
                                    this.a0.setScaleX(0.5f);
                                    this.a0.setScaleY(0.5f);
                                }
                                this.a0.animate().setListener(null).cancel();
                                org.telegram.ui.Components.voip.r1 r1Var3 = this.a0;
                                r1Var3.d0 = true;
                                r1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.kr.f).setStartDelay(150L).withEndAction(new rb1(this, 4)).start();
                                this.a0.setTag(1);
                            } else if (!z13 && this.a0.getTag() != null) {
                                this.a0.setIsActive(false);
                                this.a0.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new vb1(this, 6)).setDuration(150L).setInterpolator(org.telegram.ui.Components.kr.f).start();
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
                                    z15 = true;
                                    this.w.b(org.telegram.messenger.g0.L(106.0f) + iArr2[0], org.telegram.messenger.g0.L(106.0f) + iArr2[1], this.q0 != -1);
                                    z16 = (!this.n0 || this.m0) ? z15 : false;
                                    this.y.setState(z16);
                                    this.x.setState(z16);
                                    this.r.e(z16);
                                    if (this.m0 && !z23 && this.g0) {
                                        this.g0 = false;
                                        if (sharedInstance != null) {
                                            sharedInstance.playStartRecordSound();
                                        }
                                    }
                                    if (z16) {
                                        if (this.i0.getVisibility() != 0) {
                                            this.i0.setVisibility(0);
                                            this.h0.setVisibility(0);
                                        }
                                    } else if (this.i0.getVisibility() != 4) {
                                        this.i0.setVisibility(4);
                                        this.h0.setVisibility(4);
                                    }
                                    rb1 rb1Var = this.T0;
                                    org.telegram.messenger.g0.r(rb1Var);
                                    if (this.p0 == 3) {
                                        org.telegram.messenger.g0.h3(rb1Var, 10000L);
                                        return;
                                    }
                                    return;
                                }
                            }
                            z15 = true;
                            if (this.n0) {
                            }
                            this.y.setState(z16);
                            this.x.setState(z16);
                            this.r.e(z16);
                            if (this.m0) {
                                this.g0 = false;
                                if (sharedInstance != null) {
                                }
                            }
                            if (z16) {
                            }
                            rb1 rb1Var2 = this.T0;
                            org.telegram.messenger.g0.r(rb1Var2);
                            if (this.p0 == 3) {
                            }
                        }
                    }
                    i7 = 0;
                    if (this.n0) {
                    }
                    this.w.setVisibility(4);
                    z11 = this.n0;
                    if (z11) {
                    }
                    this.H0 = false;
                    if (z11) {
                    }
                    o(z21, z23);
                    if (this.E.getTag() != null) {
                    }
                    if (z21) {
                    }
                    this.f0.setEnabled(z20);
                    this.f0.setTag(!z20 ? 1 : null);
                    this.u0.setLockOnScreen(this.J0);
                    if (this.p0 != 3) {
                    }
                    this.z0 = z12;
                    if (!z12) {
                        r(true);
                    }
                    if (this.x0) {
                        org.telegram.messenger.g0.h3(this.S0, 3000L);
                        this.R0 = true;
                    }
                    int i222 = this.p0;
                    if (i222 == 11) {
                    }
                    if (!z20) {
                    }
                    z13 = z24;
                    if (z21) {
                    }
                    i11 = this.p0;
                    if (i11 != 10) {
                        u(z21);
                    }
                    if (i14 != 0) {
                    }
                    this.G.d(z10, z21);
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
                    if (z21) {
                    }
                    this.v0 = L;
                    if (sharedInstance == null) {
                    }
                    int i232 = this.p0;
                    this.D0 = i232 == 11 && i232 != 17 && ((this.n0 && !z27) || this.m0);
                    if (sharedInstance != null) {
                    }
                    childsHight = this.M0.getChildsHight();
                    r1Var = this.a0;
                    if (r1Var.getParent() == null) {
                    }
                    r1Var.U = childsHight;
                    r1Var2 = this.Z;
                    if (r1Var2.getParent() == null) {
                    }
                    r1Var2.U = childsHight;
                    this.Z.setUiVisible(this.x0);
                    this.a0.setUiVisible(this.x0);
                    if (this.n0) {
                    }
                    if (!z13) {
                    }
                    if (!z13) {
                        this.a0.setIsActive(false);
                        this.a0.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new vb1(this, 6)).setDuration(150L).setInterpolator(org.telegram.ui.Components.kr.f).start();
                        this.a0.setTag(null);
                    }
                    this.Z.a();
                    this.a0.a();
                    w();
                    if (this.p0 == 3) {
                    }
                    z15 = true;
                    if (this.n0) {
                    }
                    this.y.setState(z16);
                    this.x.setState(z16);
                    this.r.e(z16);
                    if (this.m0) {
                    }
                    if (z16) {
                    }
                    rb1 rb1Var22 = this.T0;
                    org.telegram.messenger.g0.r(rb1Var22);
                    if (this.p0 == 3) {
                    }
                }
            }
            v(z21);
            if (this.p0 == 5) {
                z10 = this.s0;
                if (!z10 && this.q0 != 5) {
                    this.G.b(org.telegram.messenger.gd.N0(2131743169, null), true, z21);
                }
                z20 = false;
                i14 = 0;
                if (this.o0 == null) {
                }
            } else {
                this.s0 = true;
                i14 = 1;
                z10 = false;
                z20 = false;
                if (this.o0 == null) {
                }
            }
        }
        z10 = false;
        z20 = false;
        i14 = 0;
        if (this.o0 == null) {
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z10) {
    }
}
