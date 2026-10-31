package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class be1 implements VoIPService.StateListener, org.telegram.messenger.us, lf.a {
    public static be1 n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public org.telegram.ui.Components.voip.b0 D;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.v1 F;
    public float F0;
    public ae1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public boolean J0;
    public ag.r K;
    public long K0;
    public int L;
    public mg.i2 M;
    public org.telegram.ui.Components.voip.o1 M0;
    public u71 N;
    public org.telegram.ui.Components.voip.k2 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.k2 O0;
    public bi.j6 P;
    public ValueAnimator P0;
    public jg.b1 Q;
    public jg.d0 R;
    public boolean R0;
    public TextView S;
    public org.telegram.ui.ActionBar.q2 T;
    public org.telegram.ui.Components.voip.j U;
    public boolean U0;
    public float V0;
    public float W0;
    public xd1 X;
    public float X0;
    public org.telegram.ui.Components.voip.b1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.b1 Z;
    public float Z0;
    public final int a;
    public boolean a0;
    public boolean a1;
    public Activity b;
    public TextureViewRenderer b0;
    public float b1;
    public final TLRPC.User c;
    public org.telegram.ui.Components.voip.y1 c0;
    public float c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.y1 d0;
    public int d1;
    public org.telegram.ui.Components.voip.r2 e;
    public org.telegram.ui.Components.voip.e e0;
    public int e1;
    public org.telegram.ui.Components.voip.r2 f;
    public boolean f0;
    public jf.f g0;
    public boolean g1;
    public org.telegram.ui.Components.voip.r2 h;
    public View h0;
    public boolean h1;
    public View i0;
    public ValueAnimator i1;
    public org.telegram.ui.Components.voip.y0 j0;
    public boolean j1;
    public org.telegram.ui.Components.voip.y1 k1;
    public com.google.android.gms.internal.cast.o l1;
    public boolean m0;
    public boolean m1;
    public yd1 n;
    public boolean n0;
    public ud1 o0;
    public int p0;
    public int q0;
    public WindowInsets r0;
    public wd1 s;
    public boolean s0;
    public float t0;
    public td1 u0;
    public int v0;
    public org.telegram.ui.Components.voip.j2 w;
    public AccessibilityManager w0;
    public org.telegram.ui.Components.voip.f2 x;
    public org.telegram.ui.Components.voip.l2 y;
    public boolean z0;
    public final org.telegram.ui.Components.voip.x0 r = new org.telegram.ui.Components.voip.x0();
    public final org.telegram.ui.Components.g9[] V = new org.telegram.ui.Components.g9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint k0 = new Paint();
    public final Paint l0 = new Paint();
    public boolean x0 = true;
    public float y0 = 1.0f;
    public final e2.f L0 = new e2.f(null);
    public final u01 Q0 = new u01(this, 16);
    public final md1 S0 = new md1(this, 12);
    public final md1 T0 = new md1(this, 13);
    public float f1 = 1.0f;

    public be1(int i10) {
        this.a = i10;
        this.c = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(org.telegram.messenger.d20.i(i10).e()));
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
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.O4);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.M4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.E2);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.G5);
    }

    public static void a(be1 be1Var) {
        be1 be1Var2;
        int i10 = 0;
        if (be1Var.g1) {
            be1Var.g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            be1Var.i1 = ofFloat;
            be1Var2 = be1Var;
            ofFloat.addUpdateListener(new lg.j(be1Var2, be1Var.f1, be1Var.Y0, be1Var.Z0, 2));
            be1Var2.i1.addListener(new qd1(be1Var2, i10));
            be1Var2.i1.setDuration(350L);
            be1Var2.i1.setInterpolator(org.telegram.ui.Components.gr.f);
            be1Var2.i1.start();
        } else {
            be1Var2 = be1Var;
        }
        be1Var2.h1 = false;
        be1Var2.a1 = false;
    }

    public static void k(int[] iArr, int i10) {
        be1 be1Var = n1;
        if (be1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    be1Var.u0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    be1Var.o(new org.telegram.ui.Components.voip.m0(17));
                } else if (!be1Var.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.m1.h(be1Var.b, new md1(be1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    be1Var.u0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    be1Var.B();
                }
            }
        }
    }

    public static void v(Activity activity, int i10) {
        be1 be1Var = n1;
        if (be1Var != null && be1Var.u0.getParent() == null) {
            be1 be1Var2 = n1;
            if (be1Var2 != null) {
                be1Var2.c0.d.release();
                n1.d0.d.release();
                n1.b0.release();
                td1 td1Var = n1.u0;
                if (td1Var != null) {
                    td1Var.d();
                }
                n1.d();
            }
            n1 = null;
        }
        if (n1 != null || activity.isFinishing()) {
            return;
        }
        boolean z10 = org.telegram.ui.Components.voip.t1.d() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        be1 be1Var3 = new be1(i10);
        be1Var3.b = activity;
        n1 = be1Var3;
        td1 td1Var2 = new td1(activity, !z10, be1Var3);
        n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        n1.getClass();
        td1Var2.setLockOnScreen(n1.J0);
        be1Var3.u0 = td1Var2;
        kd1 kd1Var = new kd1(be1Var3, 4);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(td1Var2, kd1Var);
        ((WindowManager) activity.getSystemService("window")).addView(td1Var2, org.telegram.ui.Components.voip.c2.a());
        be1Var3.t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        be1Var3.w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
        wd1 wd1Var = new wd1(be1Var3, activity);
        wd1Var.setClipToPadding(false);
        wd1Var.setClipChildren(false);
        wd1Var.setBackgroundColor(-16777216);
        be1Var3.F();
        be1Var3.s = wd1Var;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z11 = sharedState != null && sharedState.isConference();
        org.telegram.ui.Components.voip.x0 x0Var = be1Var3.r;
        be1Var3.w = new org.telegram.ui.Components.voip.j2(activity, z11, x0Var);
        org.telegram.ui.Components.voip.y1 y1Var = new org.telegram.ui.Components.voip.y1(activity, false, true, false, false);
        be1Var3.c0 = y1Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        y1Var.d.setScalingType(scalingType);
        be1Var3.c0.d.setEnableHardwareScaler(true);
        be1Var3.c0.d.setRotateTextureWithScreen(true);
        be1Var3.c0.a0 = 1;
        wd1Var.addView(be1Var3.w, w7.b6.c(-1.0f, -1));
        TLRPC.User user = be1Var3.d;
        org.telegram.ui.Components.voip.f2 f2Var = new org.telegram.ui.Components.voip.f2(activity, user, x0Var);
        be1Var3.x = f2Var;
        wd1Var.addView(f2Var, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.voip.l2 l2Var = new org.telegram.ui.Components.voip.l2(activity);
        if (org.telegram.messenger.sc.e(512)) {
            int i11 = org.telegram.ui.ActionBar.t6.a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i12 = calendar.get(2);
            int i13 = calendar.get(5);
            calendar.get(12);
            calendar.get(11);
            if ((i12 == 11 && i13 >= 24 && i13 <= 31) || (i12 == 0 && i13 == 1)) {
                l2Var.a = new org.telegram.ui.Components.fv0(0);
            }
        }
        be1Var3.y = l2Var;
        wd1Var.addView(l2Var, w7.b6.c(220.0f, -1));
        wd1Var.addView(be1Var3.c0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new org.telegram.ui.Components.f9(orientation, new int[]{-14994098, -14328963}).f(k2.m0.j0(0.5f, 1), new v81(be1Var3, 1), 0L);
        org.telegram.ui.Components.voip.b1 b1Var = new org.telegram.ui.Components.voip.b1(activity);
        be1Var3.Y = b1Var;
        int i14 = 3;
        b1Var.setDelegate(new kd1(be1Var3, i14));
        be1Var3.Y.d(1.0f, 1.0f);
        be1Var3.a0 = true;
        org.telegram.ui.Components.voip.y1 y1Var2 = new org.telegram.ui.Components.voip.y1(activity, true, false);
        be1Var3.d0 = y1Var2;
        y1Var2.d.setIsCamera(true);
        be1Var3.d0.d.setUseCameraRotation(true);
        be1Var3.Y.setOnTapListener(new nd1(be1Var3, 1));
        be1Var3.d0.d.setMirror(true);
        be1Var3.Y.addView(be1Var3.d0);
        org.telegram.ui.Components.voip.b1 b1Var2 = new org.telegram.ui.Components.voip.b1(activity);
        be1Var3.Z = b1Var2;
        b1Var2.S = true;
        b1Var2.c(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        be1Var3.b0 = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        be1Var3.b0.setIsCamera(false);
        be1Var3.b0.setFpsReduction(30.0f);
        be1Var3.b0.setScalingType(scalingType);
        be1Var3.Z.addView(be1Var3.b0, w7.b6.e(-1, -2, 17));
        be1Var3.Z.setOnTapListener(new nd1(be1Var3, 2));
        be1Var3.Z.setVisibility(8);
        wd1Var.addView(be1Var3.Y, w7.b6.c(-2.0f, -2));
        wd1Var.addView(be1Var3.Z);
        View view = new View(activity);
        be1Var3.h0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, i0.b.o(-16777216, org.telegram.messenger.zs.L1)}));
        wd1Var.addView(be1Var3.h0, w7.b6.e(-1, org.telegram.messenger.zs.q2, 80));
        View view2 = new View(activity);
        be1Var3.i0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{i0.b.o(-16777216, org.telegram.messenger.zs.n1), 0}));
        wd1Var.addView(be1Var3.i0, w7.b6.e(-1, org.telegram.messenger.zs.q2, 48));
        u71 u71Var = new u71(be1Var3, activity, 18);
        be1Var3.N = u71Var;
        u71Var.setOrientation(0);
        be1Var3.N.setPadding(0, 0, 0, org.telegram.messenger.i0.L(30.0f));
        be1Var3.N.setClipToPadding(false);
        be1Var3.N.setContentDescription(org.telegram.messenger.cd.L0(2131743328, null));
        be1Var3.N.setOnClickListener(new nd1(be1Var3, i14));
        be1Var3.P = new bi.j6(activity, x0Var);
        FrameLayout frameLayout = new FrameLayout(activity);
        be1Var3.O = frameLayout;
        frameLayout.addView(be1Var3.P, w7.b6.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        be1Var3.O.setVisibility(8);
        be1Var3.O.setOnClickListener(new nd1(be1Var3, 4));
        jg.d0 d0Var = new jg.d0(activity, x0Var);
        be1Var3.R = d0Var;
        d0Var.setOrientation(1);
        TextView textView = new TextView(activity);
        be1Var3.S = textView;
        textView.setText(org.telegram.messenger.cd.L0(2131743517, null));
        be1Var3.S.setTextSize(1, 15.0f);
        be1Var3.S.setTypeface(org.telegram.messenger.i0.o());
        be1Var3.S.setTextColor(-1);
        be1Var3.S.setGravity(17);
        org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(be1Var3, activity, 8);
        be1Var3.T = q2Var;
        q2Var.setTextSize(1, 15.0f);
        be1Var3.T.setTextColor(-1);
        be1Var3.T.setGravity(17);
        be1Var3.T.setText(org.telegram.messenger.cd.a0("CallEmojiKeyTooltip", null, 2131752627, TextUtils.ellipsize(org.telegram.messenger.h20.j(user, true), be1Var3.T.getPaint(), org.telegram.messenger.i0.L(300.0f), TextUtils.TruncateAt.END)));
        be1Var3.R.setVisibility(8);
        be1Var3.R.addView(be1Var3.S);
        be1Var3.R.addView(be1Var3.T, w7.b6.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        be1Var3.R.setPadding(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(80.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f));
        int i15 = 0;
        while (i15 < 4) {
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(activity);
            org.telegram.ui.Components.g9[] g9VarArr = be1Var3.V;
            g9VarArr[i15] = g9Var;
            g9VarArr[i15].getImageReceiver().R0 = true;
            be1Var3.N.addView(g9VarArr[i15], w7.b6.k(i15 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i15++;
        }
        xd1 xd1Var = new xd1(be1Var3, activity);
        be1Var3.X = xd1Var;
        xd1Var.setOrientation(1);
        be1Var3.X.setFocusable(true);
        be1Var3.X.setFocusableInTouchMode(true);
        be1Var3.D = new org.telegram.ui.Components.voip.b0(activity);
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.r(user);
        org.telegram.ui.Components.voip.b0 b0Var = be1Var3.D;
        int i16 = be1Var3.a;
        b0Var.b.j(org.telegram.messenger.ic.m(i16, 0, user), null, r8Var, user);
        be1Var3.D.setRoundRadius(org.telegram.messenger.i0.L(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        be1Var3.E = textView2;
        textView2.setTextSize(1, 28.0f);
        be1Var3.E.setText(org.telegram.messenger.k6.m(org.telegram.messenger.i5.m(0, user.first_name, user.last_name), be1Var3.E.getPaint().getFontMetricsInt(), false, null, 0));
        be1Var3.E.setMaxLines(2);
        be1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
        be1Var3.E.setTextColor(-1);
        be1Var3.E.setGravity(1);
        be1Var3.E.setImportantForAccessibility(2);
        be1Var3.X.addView(be1Var3.E, w7.b6.t(-2, -2, 1, 8, 0, 8, 6));
        org.telegram.ui.Components.voip.v1 v1Var = new org.telegram.ui.Components.voip.v1(activity);
        v1Var.a = new TextView[2];
        int i17 = 0;
        for (int i18 = 2; i17 < i18; i18 = 2) {
            v1Var.a[i17] = new TextView(activity);
            v1Var.a[i17].setTextSize(1, 15.0f);
            v1Var.a[i17].setTextColor(-1);
            v1Var.a[i17].setGravity(1);
            v1Var.addView(v1Var.a[i17]);
            i17++;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        v1Var.c = frameLayout2;
        org.telegram.ui.Components.voip.j0 j0Var = new org.telegram.ui.Components.voip.j0(v1Var, activity, x0Var);
        j0Var.setTextSize(1, 15.0f);
        j0Var.setTextColor(-1);
        j0Var.setGravity(1);
        j0Var.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(2.0f));
        j0Var.setText(org.telegram.messenger.cd.L0(2131743243, null));
        frameLayout2.addView(j0Var, w7.b6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        v1Var.addView(frameLayout2, w7.b6.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        v1Var.b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        v1Var.addView(textView3, w7.b6.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131743279, null));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new ag.x2(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        org.telegram.ui.Components.voip.z1 z1Var = new org.telegram.ui.Components.voip.z1(activity);
        v1Var.d = z1Var;
        v1Var.addView(z1Var, w7.b6.c(-2.0f, -1));
        be1Var3.F = v1Var;
        WeakHashMap weakHashMap2 = r0.h0.a;
        v1Var.setImportantForAccessibility(4);
        be1Var3.X.addView(be1Var3.F, w7.b6.t(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            ae1 ae1Var = new ae1(activity);
            be1Var3.G = ae1Var;
            long j10 = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i19 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null || i19 > 0) {
                int max = Math.max(i19, groupParticipants == null ? 0 : groupParticipants.size());
                int min = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
                org.telegram.ui.Components.t8 t8Var = ae1Var.b;
                t8Var.i(min);
                int i20 = 0;
                while (i20 < min) {
                    t8Var.j(i20, i16, org.telegram.messenger.vp.r1(i16).d2(org.telegram.messenger.o5.o(groupParticipants.get(i20).peer)));
                    i20++;
                    j10 = j10;
                }
                long j11 = j10;
                t8Var.a(false, true);
                if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && org.telegram.messenger.o5.o(groupParticipants.get(0).peer) == j11))) {
                    ae1Var.setVisibility(8);
                } else {
                    ae1Var.c = new org.telegram.ui.Components.qz0(org.telegram.messenger.cd.H(',', "Participants", max), 14.0f, org.telegram.messenger.i0.o());
                    ae1Var.setVisibility(0);
                    ae1Var.invalidate();
                }
            } else {
                ae1Var.setVisibility(8);
            }
            be1Var3.X.addView(be1Var3.G, w7.b6.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        be1Var3.X.setClipChildren(false);
        be1Var3.X.setClipToPadding(false);
        be1Var3.X.setPadding(0, 0, 0, org.telegram.messenger.i0.L(15.0f));
        be1Var3.U = new org.telegram.ui.Components.voip.j(activity);
        be1Var3.Q = new jg.b1(activity, x0Var);
        be1Var3.U.setAlpha(0.0f);
        be1Var3.Q.setVisibility(8);
        wd1Var.addView(be1Var3.D, w7.b6.d(org.telegram.messenger.zs.i3, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        wd1Var.addView(be1Var3.X, w7.b6.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        wd1Var.addView(be1Var3.O, w7.b6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        wd1Var.addView(be1Var3.R, w7.b6.d(org.telegram.messenger.zs.b5, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        wd1Var.addView(be1Var3.N, w7.b6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        wd1Var.addView(be1Var3.U, w7.b6.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        wd1Var.addView(be1Var3.Q, w7.b6.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        be1Var3.j0 = new org.telegram.ui.Components.voip.y0(activity);
        be1Var3.e = new org.telegram.ui.Components.voip.r2(activity, x0Var);
        be1Var3.f = new org.telegram.ui.Components.voip.r2(activity, x0Var);
        be1Var3.h = new org.telegram.ui.Components.voip.r2(activity, x0Var);
        be1Var3.n = new yd1(activity, 52.0f);
        be1Var3.e.setTranslationY(org.telegram.messenger.i0.L(100.0f));
        be1Var3.e.setScaleX(0.0f);
        be1Var3.e.setScaleY(0.0f);
        be1Var3.e.animate().setStartDelay(org.telegram.messenger.zs.g2).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        be1Var3.f.setTranslationY(org.telegram.messenger.i0.L(100.0f));
        be1Var3.f.setScaleX(0.0f);
        be1Var3.f.setScaleY(0.0f);
        be1Var3.f.animate().setStartDelay(org.telegram.messenger.zs.w2).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        be1Var3.h.setTranslationY(org.telegram.messenger.i0.L(100.0f));
        be1Var3.h.setScaleX(0.0f);
        be1Var3.h.setScaleY(0.0f);
        be1Var3.h.animate().setStartDelay(org.telegram.messenger.zs.M2).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        be1Var3.n.setTranslationY(org.telegram.messenger.i0.L(100.0f));
        be1Var3.n.setScaleX(0.0f);
        be1Var3.n.setScaleY(0.0f);
        be1Var3.n.animate().setStartDelay(org.telegram.messenger.zs.c3).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        be1Var3.j0.addView(be1Var3.e);
        be1Var3.j0.addView(be1Var3.f);
        be1Var3.j0.addView(be1Var3.h);
        be1Var3.j0.addView(be1Var3.n);
        org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
        be1Var3.e0 = eVar;
        eVar.setListener(new zd1(be1Var3));
        be1Var3.e0.setScaleX(1.15f);
        be1Var3.e0.setScaleY(1.15f);
        wd1Var.addView(be1Var3.j0, w7.b6.e(-1, -2, 80));
        float f7 = org.telegram.messenger.i0.Q1() ? 100 : 27;
        wd1Var.addView(be1Var3.e0, w7.b6.d(-1, 186.0f, 80, f7, 0.0f, f7, 0.0f));
        ImageView imageView = new ImageView(activity);
        be1Var3.I = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(i0.b.o(-1, 76), 1, -1));
        be1Var3.I.setImageResource(R.drawable.msg_addcontact);
        be1Var3.I.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        wd1Var.addView(be1Var3.I, w7.b6.e(56, 56, 53));
        w7.e6.a(be1Var3.I);
        ImageView imageView2 = new ImageView(activity);
        be1Var3.H = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.t6.h0(i0.b.o(-1, 76), 1, -1));
        be1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
        be1Var3.H.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        be1Var3.H.setContentDescription(org.telegram.messenger.cd.L0(2131753756, null));
        wd1Var.addView(be1Var3.H, w7.b6.e(56, 56, 51));
        w7.e6.a(be1Var3.H);
        int i21 = 6;
        ag.r rVar = new ag.r(activity, i21);
        be1Var3.K = rVar;
        rVar.setContentDescription(org.telegram.messenger.cd.L0(2131743265, null));
        be1Var3.K.setBackground(org.telegram.ui.ActionBar.t6.h0(i0.b.o(-1, 76), 1, -1));
        be1Var3.K.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        wd1Var.addView(be1Var3.K, w7.b6.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        be1Var3.K.setAlpha(0.0f);
        be1Var3.K.setOnClickListener(new nd1(be1Var3, 5));
        be1Var3.H.setOnClickListener(new nd1(be1Var3, i21));
        be1Var3.I.setOnClickListener(new rv0(9, be1Var3, activity));
        if (be1Var3.u0.b) {
            be1Var3.H.setVisibility(8);
            be1Var3.I.setVisibility(8);
        }
        org.telegram.ui.Components.voip.o1 o1Var = new org.telegram.ui.Components.voip.o1(activity);
        o1Var.a = new HashMap();
        o1Var.b = new ArrayList();
        o1Var.c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        o1Var.r = textPaint;
        o1Var.setOrientation(1);
        o1Var.n = x0Var;
        TransitionSet transitionSet = new TransitionSet();
        o1Var.d = transitionSet;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new kg.g0(4).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        be1Var3.M0 = o1Var;
        o1Var.setGravity(80);
        be1Var3.M0.setOnViewsUpdated(new md1(be1Var3, 5));
        wd1Var.addView(be1Var3.M0, w7.b6.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.voip.k2 k2Var = new org.telegram.ui.Components.voip.k2(activity, 3, x0Var, true);
        k2Var.p(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        k2Var.K = alignment;
        k2Var.d = -1L;
        k2Var.l0 = new md1(be1Var3, i21);
        k2Var.T = true;
        k2Var.h = org.telegram.messenger.i0.L(320.0f);
        k2Var.e = true;
        k2Var.k(10.0f, 6.0f, 10.0f, 6.0f);
        k2Var.q(8.0f);
        be1Var3.N0 = k2Var;
        k2Var.s(org.telegram.messenger.cd.L0(2131744279, null));
        wd1Var.addView(be1Var3.N0, w7.b6.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.voip.k2 k2Var2 = new org.telegram.ui.Components.voip.k2(activity, 1, x0Var, false);
        k2Var2.p(true);
        k2Var2.K = alignment;
        k2Var2.d = 4000L;
        k2Var2.T = true;
        k2Var2.h = org.telegram.messenger.i0.L(320.0f);
        k2Var2.e = true;
        k2Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
        k2Var2.q(8.0f);
        be1Var3.O0 = k2Var2;
        k2Var2.s(org.telegram.messenger.cd.L0(2131743328, null));
        wd1Var.addView(be1Var3.O0, w7.b6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        be1Var3.G();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!be1Var3.U0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                be1Var3.U0 = phoneCall != null && phoneCall.video;
            }
            be1Var3.h();
        }
        td1Var2.addView(wd1Var);
        if (z10) {
            be1Var3.F0 = 0.0f;
            be1Var3.I0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                be1Var3.c0.setStub(org.telegram.ui.Components.voip.t1.d().s);
                be1Var3.d0.setStub(org.telegram.ui.Components.voip.t1.d().r);
            }
            be1Var3.u0.setAlpha(0.0f);
            be1Var3.G();
            be1Var3.E0 = true;
            org.telegram.ui.Components.voip.t1.U = true;
            if (org.telegram.ui.Components.voip.t1.W != null) {
                org.telegram.ui.Components.voip.t1.V.getClass();
                throw null;
            }
            be1Var3.L0.d();
            org.telegram.messenger.i0.h3(new md1(be1Var3, 11), 32L);
        } else {
            be1Var3.F0 = 1.0f;
            be1Var3.F();
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && mf.b.a(activity) == 1) {
            be1 be1Var4 = n1;
            jf.e eVar2 = new jf.e(activity, be1Var4);
            eVar2.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.y1 y1Var3 = be1Var4.c0;
            eVar2.j = y1Var3.d;
            eVar2.k = y1Var3.getPlaceholderView();
            be1Var4.g0 = eVar2.a();
        }
    }

    public final void A() {
        if (VoIPService.getSharedInstance() != null) {
            md1 md1Var = this.S0;
            org.telegram.messenger.i0.r(md1Var);
            this.R0 = false;
            if (this.z0 && this.x0) {
                org.telegram.messenger.i0.h3(md1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void B() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.w0.isTouchExplorationEnabled()) {
                this.s.announceForAccessibility(!this.n0 ? org.telegram.messenger.cd.L0(2131754732, null) : org.telegram.messenger.cd.L0(2131754733, null));
            }
            if (this.n0) {
                this.d0.c();
                sharedInstance.setVideoState(false, 0);
                sharedInstance.clearCamera();
                this.q0 = this.p0;
                G();
                return;
            }
            if (this.o0 == null) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                this.u0.setLockOnScreen(true);
                this.f.getLocationOnScreen(new int[2]);
                ud1 ud1Var = new ud1(this, this.s.getContext(), r0[0], r0[1]);
                this.o0 = ud1Var;
                WindowInsets windowInsets = this.r0;
                if (windowInsets != null) {
                    ud1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                }
                this.s.addView(this.o0);
            }
        }
    }

    public final void C(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            Transition duration = new kg.g0(5).setDuration(250L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
            transitionSet.addTransition(duration.setInterpolator(grVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(grVar));
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.b2.class, true);
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.r2.class, true);
            TransitionManager.beginDelayedTransition(this.j0, transitionSet);
        }
        int i10 = this.p0;
        if (i10 == 11) {
            this.e.setVisibility(8);
            this.f.setVisibility(8);
            this.h.setVisibility(8);
            this.n.setVisibility(8);
            return;
        }
        int i11 = 0;
        if (i10 == 15 || i10 == 17) {
            TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
            if (phoneCall != null && phoneCall.video && i10 == 15) {
                if (sharedInstance.isScreencast() || !(this.n0 || this.m0)) {
                    t(this.e, sharedInstance);
                    this.K.animate().alpha(0.0f).start();
                } else {
                    p(this.e, sharedInstance);
                    if (this.x0) {
                        this.K.animate().alpha(1.0f).start();
                    }
                }
                u(this.f, sharedInstance, false);
                s(this.h, sharedInstance, z10);
            } else {
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.h.setVisibility(8);
            }
            this.n.setVisibility(8);
        } else {
            if (n1 == null) {
                return;
            }
            if (sharedInstance.isScreencast() || !(this.n0 || this.m0)) {
                t(this.e, sharedInstance);
                this.K.setTag(null);
                this.K.animate().alpha(0.0f).start();
            } else {
                p(this.e, sharedInstance);
                if (this.x0) {
                    this.K.setTag(1);
                    this.K.animate().alpha(1.0f).start();
                }
            }
            u(this.f, sharedInstance, false);
            s(this.h, sharedInstance, z10);
            this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, org.telegram.messenger.cd.L0(2131743437, null), false, z10);
            this.n.setOnClickListener(new nd1(this, i11));
        }
        if (this.e.getVisibility() == 0) {
            this.e.f = 0;
            i11 = 16;
        }
        if (this.f.getVisibility() == 0) {
            this.f.f = i11;
            i11 += 16;
        }
        if (this.h.getVisibility() == 0) {
            this.h.f = i11;
            i11 += 16;
        }
        if (this.n.getVisibility() == 0) {
            this.n.F = i11;
        }
        E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0165  */
    /* JADX WARN: Type inference failed for: r0v25, types: [org.telegram.ui.Components.g9] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v28, types: [org.telegram.ui.Components.g9] */
    /* JADX WARN: Type inference failed for: r0v29, types: [org.telegram.ui.Components.g9] */
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
    /* JADX WARN: Type inference failed for: r5v7, types: [org.telegram.ui.Components.f5] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.g9[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(boolean z10) {
        VoIPService sharedInstance;
        byte[] bArr;
        ?? r62;
        Drawable[] drawableArr;
        boolean z11;
        ag.c2 c2Var;
        String[] strArr;
        TLRPC.Document document;
        int i10;
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
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, false);
            bArr = null;
        }
        if (bArr == null) {
            return;
        }
        String[] emojifyForCall = EncryptionKeyEmojifier.emojifyForCall(Utilities.o(bArr.length, bArr));
        int i11 = 0;
        while (true) {
            r62 = this.V;
            drawableArr = this.W;
            if (i11 >= 4) {
                break;
            }
            org.telegram.messenger.k6.k(emojifyForCall[i11]);
            org.telegram.messenger.g6 g10 = org.telegram.messenger.k6.g(emojifyForCall[i11]);
            if (g10 != null) {
                g10.setBounds(z12 ? 1 : 0, z12 ? 1 : 0, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(40.0f));
                g10.b();
                int[] iArr = new int[1];
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(org.telegram.messenger.i0.L(28.0f));
                CharSequence m10 = org.telegram.messenger.k6.m(emojifyForCall[i11], textPaint.getFontMetricsInt(), z12, iArr, z12 ? 1 : 0);
                boolean z13 = m10 instanceof Spannable;
                int i12 = this.a;
                if (z13) {
                    Spannable spannable = (Spannable) m10;
                    org.telegram.messenger.h6[] h6VarArr = (org.telegram.messenger.h6[]) spannable.getSpans(z12 ? 1 : 0, spannable.length(), org.telegram.messenger.h6.class);
                    org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spannable.getSpans(z12 ? 1 : 0, spannable.length(), org.telegram.ui.Components.o5.class);
                    if (h6VarArr != null) {
                        if ((iArr[z12 ? 1 : 0] - h6VarArr.length) - (o5VarArr == null ? z12 ? 1 : 0 : o5VarArr.length) <= 0) {
                            int length = h6VarArr.length;
                            int i13 = z12 ? 1 : 0;
                            ?? r32 = z12;
                            while (i13 < length) {
                                org.telegram.messenger.h6 h6Var = h6VarArr[i13];
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                tL_inputStickerSetShortName.short_name = "StaticEmoji";
                                TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(i12).l0(tL_inputStickerSetShortName, Integer.valueOf((int) r32), false, true, new s3(this, 26));
                                if (l02 != null) {
                                    String replace = h6Var.d.replace("️", "");
                                    ArrayList<TLRPC.Document> arrayList = l02.documents;
                                    int size = arrayList.size();
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 >= size) {
                                            strArr = emojifyForCall;
                                            i10 = length;
                                            document = null;
                                            break;
                                        }
                                        TLRPC.Document document2 = arrayList.get(i14);
                                        i14++;
                                        strArr = emojifyForCall;
                                        document = document2;
                                        ArrayList<TLRPC.Document> arrayList2 = arrayList;
                                        i10 = length;
                                        if (TextUtils.equals(org.telegram.messenger.jj.V(document, null, null).replace("️", ""), replace)) {
                                            break;
                                        }
                                        length = i10;
                                        emojifyForCall = strArr;
                                        arrayList = arrayList2;
                                    }
                                    if (document != null) {
                                        break;
                                    }
                                    i13++;
                                    length = i10;
                                    emojifyForCall = strArr;
                                    r32 = 0;
                                }
                            }
                        }
                    }
                    strArr = emojifyForCall;
                    document = null;
                    if (document == null) {
                        Drawable drawable = drawableArr[i11];
                        if ((drawable instanceof org.telegram.ui.Components.f5) && ((org.telegram.ui.Components.f5) drawable).h() == document.id) {
                            r52 = (org.telegram.ui.Components.f5) drawableArr[i11];
                        } else {
                            org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5(21, i12, document);
                            drawableArr[i11] = f5Var;
                            r52 = f5Var;
                        }
                        r52.q(strArr[i11]);
                        r62[i11].setAnimatedEmojiDrawable(r52);
                        r62[i11].getImageReceiver().f();
                        g10 = r52;
                    } else {
                        r62[i11].setImageDrawable(g10);
                        g10 = g10;
                    }
                    r62[i11].setVisibility(8);
                }
                strArr = emojifyForCall;
                document = null;
                if (document == null) {
                }
                r62[i11].setVisibility(8);
            } else {
                strArr = emojifyForCall;
            }
            drawableArr[i11] = g10;
            i11++;
            emojifyForCall = strArr;
            z12 = false;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < 4; i16++) {
            Drawable drawable2 = drawableArr[i16];
            if (drawable2 instanceof org.telegram.messenger.g6) {
                z11 = ((org.telegram.messenger.g6) drawable2).a();
            } else {
                if ((drawable2 instanceof org.telegram.ui.Components.f5) && (c2Var = ((org.telegram.ui.Components.f5) drawable2).k) != null) {
                    Drawable drawable3 = c2Var.a0;
                    if (!(drawable3 instanceof org.telegram.messenger.g6) || ((org.telegram.messenger.g6) drawable3).a()) {
                        z11 = true;
                    }
                }
                z11 = false;
            }
            if (z11) {
                i15++;
            }
        }
        if (i15 == 4) {
            this.B0 = true;
            for (int i17 = 0; i17 < 4; i17++) {
                if (r62[i17].getVisibility() != 0) {
                    r62[i17].setVisibility(0);
                    if (z10) {
                        r62[i17].setAlpha(0.0f);
                        r62[i17].setScaleX(0.0f);
                        r62[i17].setScaleY(0.0f);
                        org.telegram.messenger.z20.m(r62[i17].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.gr.k, 250L);
                    }
                }
            }
            this.O0.postDelayed(new md1(this, 9), 1000L);
        }
    }

    public final void E() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int i10 = sharedInstance.isBluetoothOn() ? R.drawable.calls_bluetooth : VoipAudioManager.get().isSpeakerphoneOn() ? R.drawable.calls_speaker : sharedInstance.isHeadsetPlugged() ? R.drawable.calls_menu_headset : R.drawable.calls_menu_phone;
        if (this.J != i10) {
            org.telegram.messenger.i0.Q3(this.K, i10);
        } else {
            this.K.setImageResource(i10);
        }
        this.J = i10;
    }

    public final void F() {
        this.k0.setColor(i0.b.o(-16777216, (int) (this.y0 * 102.0f * this.F0)));
        this.l0.setColor(i0.b.o(-16777216, (int) (127.5f * this.F0)));
        wd1 wd1Var = this.s;
        if (wd1Var != null) {
            wd1Var.invalidate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0b6c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0bbd  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0bb5  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0adb  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0af5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0aad  */
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
    /* JADX WARN: Removed duplicated region for block: B:336:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:396:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x07e0  */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        int L;
        boolean z14;
        int i11;
        int childsHight;
        org.telegram.ui.Components.voip.b1 b1Var;
        org.telegram.ui.Components.voip.b1 b1Var2;
        boolean z15;
        boolean z16;
        boolean z17;
        org.telegram.ui.Components.voip.y1 y1Var;
        VideoSink videoSink;
        int i12;
        int i13;
        boolean z18;
        TL_phone.PhoneCall phoneCall;
        VoIPService.SharedUIParams sharedUIParams;
        long j10;
        Layout layout;
        int lineCount;
        float f7;
        float f10;
        float f11;
        TL_phone.PhoneCall phoneCall2;
        float f12;
        boolean z19;
        boolean z20;
        TextView textView;
        int i14;
        if (this.G0 || this.E0) {
            return;
        }
        boolean z21 = true;
        z21 = true;
        boolean z22 = this.q0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i15 = this.p0;
        TLRPC.User user = this.d;
        int i16 = 2;
        if (i15 == 1 || i15 == 2) {
            this.F.b(org.telegram.messenger.cd.L0(2131743445, null), true, z22);
        } else {
            if (i15 != 3) {
                if (i15 == 4) {
                    this.F.b(org.telegram.messenger.cd.L0(2131743434, null), false, z22);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : Instance.ERROR_UNKNOWN;
                    if (TextUtils.equals(lastError, Instance.ERROR_UNKNOWN)) {
                        org.telegram.messenger.i0.h3(new md1(this, 3), 1000L);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_INCOMPATIBLE)) {
                        x(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("VoipPeerIncompatible", null, 2131743289, org.telegram.messenger.i5.m(0, user.first_name, user.last_name))));
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PEER_OUTDATED)) {
                        if (this.U0) {
                            String a02 = org.telegram.messenger.cd.a0("VoipPeerVideoOutdated", null, 2131743287, org.telegram.messenger.h20.j(user, true));
                            boolean[] zArr = new boolean[1];
                            org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3(0, this.b, null);
                            boolean[] zArr2 = new boolean[3];
                            r3Var.R = org.telegram.messenger.cd.L0(2131743434, null);
                            r3Var.T = org.telegram.messenger.i0.W2(a02);
                            String L0 = org.telegram.messenger.cd.L0(2131752589, null);
                            kd1 kd1Var = new kd1(this, 2);
                            r3Var.p0 = L0;
                            r3Var.q0 = kd1Var;
                            String L02 = org.telegram.messenger.cd.L0(2131743286, null);
                            ep0 ep0Var = new ep0(22, this, zArr);
                            r3Var.n0 = L02;
                            r3Var.o0 = ep0Var;
                            r3Var.show();
                            for (int i17 = 0; i17 < 3; i17++) {
                                if (zArr2[i17] && (textView = (TextView) r3Var.d(-(i17 + 1))) != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, r3Var.k1);
                                }
                            }
                            r3Var.setCanceledOnTouchOutside(true);
                            r3Var.setOnDismissListener(new mg.g(10, this, zArr));
                        } else {
                            x(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("VoipPeerOutdated", null, 2131743288, org.telegram.messenger.h20.j(user, true))));
                        }
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PRIVACY)) {
                        x(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131752606, org.telegram.messenger.i5.m(0, user.first_name, user.last_name))));
                        org.telegram.ui.Components.s4.k0(this.b, this.a, user.id);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_AUDIO_IO)) {
                        x("Error initializing audio hardware");
                    } else if (TextUtils.equals(lastError, Instance.ERROR_LOCALIZED)) {
                        this.u0.b();
                    } else if (TextUtils.equals(lastError, Instance.ERROR_CONNECTION_SERVICE)) {
                        x(org.telegram.messenger.cd.L0(2131743436, null));
                    } else {
                        org.telegram.messenger.i0.h3(new md1(this, 1), 1000L);
                    }
                } else if (i15 != 5) {
                    switch (i15) {
                        case 11:
                            boolean z23 = sharedInstance != null && sharedInstance.hasRate();
                            this.d0.c();
                            if (!z23 || this.G0) {
                                org.telegram.messenger.i0.h3(new md1(this, 0), 200L);
                                break;
                            } else {
                                if (this.x0) {
                                    int[] iArr = new int[2];
                                    int i18 = org.telegram.messenger.i0.q.x;
                                    this.n.getLocationOnScreen(iArr);
                                    int measuredWidth = ((i18 - iArr[0]) - ((this.n.getMeasuredWidth() - org.telegram.messenger.i0.L(52.0f)) / 2)) - org.telegram.messenger.i0.L(52.0f);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.U.getLayoutParams();
                                    marginLayoutParams.rightMargin = measuredWidth;
                                    marginLayoutParams.leftMargin = measuredWidth;
                                    this.U.setTranslationY(iArr[1]);
                                    this.U.setAlpha(1.0f);
                                    this.U.setLayoutParams(marginLayoutParams);
                                    this.j0.animate().alpha(0.0f).setDuration(80L).start();
                                    org.telegram.messenger.i0.h3(new t11(21, this, sharedInstance), 2L);
                                    i14 = 0;
                                } else {
                                    this.j0.setVisibility(8);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U.getLayoutParams();
                                    layoutParams.rightMargin = org.telegram.messenger.i0.L(18.0f);
                                    layoutParams.leftMargin = org.telegram.messenger.i0.L(18.0f);
                                    int L2 = org.telegram.messenger.i0.L(36.0f);
                                    layoutParams.bottomMargin = L2;
                                    WindowInsets windowInsets = this.r0;
                                    if (windowInsets != null) {
                                        layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom() + L2;
                                    }
                                    layoutParams.gravity = 80;
                                    this.U.setLayoutParams(layoutParams);
                                    this.U.animate().alpha(1.0f).setDuration(250L).start();
                                    i14 = 0;
                                    this.U.a(new ld1(this, sharedInstance, i14), false);
                                }
                                this.Q.setVisibility(i14);
                                jg.b1 b1Var3 = this.Q;
                                kd1 kd1Var2 = new kd1(this, true ? 1 : 0);
                                org.telegram.ui.Components.voip.v0[] v0VarArr = (org.telegram.ui.Components.voip.v0[]) b1Var3.d;
                                b1Var3.e = kd1Var2;
                                fg.i iVar = (fg.i) b1Var3.b;
                                iVar.setVisibility(i14);
                                ((FrameLayout) b1Var3.c).setVisibility(i14);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.ALPHA;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(iVar, (Property<fg.i, Float>) property, 0.0f, 1.0f);
                                Property property2 = View.SCALE_X;
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(iVar, (Property<fg.i, Float>) property2, 0.7f, 1.0f);
                                Property property3 = View.SCALE_Y;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(iVar, (Property<fg.i, Float>) property3, 0.7f, 1.0f);
                                float f13 = 0.0f;
                                Property property4 = View.TRANSLATION_Y;
                                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(iVar, (Property<fg.i, Float>) property4, org.telegram.messenger.i0.L(24.0f), 0.0f));
                                animatorSet.setInterpolator(org.telegram.ui.Components.gr.f);
                                animatorSet.setDuration(250L);
                                int i19 = 0;
                                while (i19 < v0VarArr.length) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    v0VarArr[i19].setAlpha(f13);
                                    float[] fArr = new float[i16];
                                    // fill-array-data instruction
                                    fArr[0] = 0.0f;
                                    fArr[1] = 1.0f;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(v0VarArr[i19], (Property<org.telegram.ui.Components.voip.v0, Float>) property, fArr);
                                    float[] fArr2 = new float[i16];
                                    // fill-array-data instruction
                                    fArr2[0] = 0.3f;
                                    fArr2[1] = 1.0f;
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(v0VarArr[i19], (Property<org.telegram.ui.Components.voip.v0, Float>) property2, fArr2);
                                    AnimatorSet animatorSet3 = animatorSet;
                                    float[] fArr3 = new float[i16];
                                    // fill-array-data instruction
                                    fArr3[0] = 0.3f;
                                    fArr3[1] = 1.0f;
                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(v0VarArr[i19], (Property<org.telegram.ui.Components.voip.v0, Float>) property3, fArr3);
                                    org.telegram.ui.Components.voip.v0 v0Var = v0VarArr[i19];
                                    Property property5 = property3;
                                    float[] fArr4 = new float[i16];
                                    fArr4[0] = org.telegram.messenger.i0.L(30.0f);
                                    fArr4[1] = 0.0f;
                                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.Components.voip.v0, Float>) property4, fArr4);
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
                                    f13 = 0.0f;
                                }
                                int i21 = i16;
                                animatorSet.start();
                                if (this.C0) {
                                    this.C0 = false;
                                    ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
                                    duration.setInterpolator(grVar).setListener(new eg.m(this.O)).start();
                                    this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(grVar).setDuration(250L).start();
                                    this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.i0.L(120.0f)).setListener(new eg.m(this.O)).setDuration(250L).setInterpolator(grVar).start();
                                }
                                for (org.telegram.ui.Components.g9 g9Var : this.V) {
                                    g9Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(org.telegram.ui.Components.gr.f).setDuration(250L).start();
                                }
                                this.E.animate().alpha(0.0f).setDuration(70L).setListener(new qd1(this, 5)).start();
                                ViewPropertyAnimator alpha = this.K.animate().alpha(0.0f);
                                org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.f;
                                org.telegram.messenger.z20.m(alpha, grVar2, 250L);
                                this.K.setVisibility(8);
                                this.F.d(false, true);
                                this.F.c(false);
                                org.telegram.ui.Components.voip.z1 z1Var = this.F.d;
                                z1Var.n = true;
                                z1Var.invalidate();
                                org.telegram.ui.Components.voip.b0 b0Var = this.D;
                                b0Var.setShowWaves(false);
                                AnimatorSet animatorSet4 = b0Var.c;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                                AnimatorSet animatorSet5 = new AnimatorSet();
                                b0Var.c = animatorSet5;
                                Property property6 = View.ALPHA;
                                float[] fArr5 = new float[i21];
                                fArr5[0] = b0Var.getAlpha();
                                fArr5[1] = 1.0f;
                                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(b0Var, (Property<org.telegram.ui.Components.voip.b0, Float>) property6, fArr5);
                                Property property7 = View.TRANSLATION_Y;
                                float[] fArr6 = new float[i21];
                                fArr6[0] = b0Var.getTranslationY();
                                fArr6[1] = -org.telegram.messenger.i0.L(24.0f);
                                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(b0Var, (Property<org.telegram.ui.Components.voip.b0, Float>) property7, fArr6);
                                Property property8 = View.SCALE_X;
                                float[] fArr7 = new float[3];
                                fArr7[0] = b0Var.getScaleX();
                                fArr7[1] = 0.9f;
                                fArr7[i21] = 1.0f;
                                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(b0Var, (Property<org.telegram.ui.Components.voip.b0, Float>) property8, fArr7);
                                Property property9 = View.SCALE_Y;
                                float[] fArr8 = new float[3];
                                fArr8[0] = b0Var.getScaleY();
                                fArr8[1] = 0.9f;
                                fArr8[i21] = 1.0f;
                                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(b0Var, (Property<org.telegram.ui.Components.voip.b0, Float>) property9, fArr8);
                                Animator[] animatorArr2 = new Animator[4];
                                animatorArr2[0] = ofFloat8;
                                animatorArr2[1] = ofFloat9;
                                animatorArr2[i21] = ofFloat10;
                                animatorArr2[3] = ofFloat11;
                                animatorSet5.playTogether(animatorArr2);
                                b0Var.c.setInterpolator(grVar2);
                                b0Var.c.setDuration(300L);
                                b0Var.c.setStartDelay(250L);
                                b0Var.c.start();
                                C(true);
                                this.n.setVisibility(4);
                                this.Z.setAlpha(0.0f);
                                this.Z.setVisibility(8);
                                this.Y.setAlpha(0.0f);
                                this.Y.setVisibility(8);
                                ud1 ud1Var = this.o0;
                                if (ud1Var != null) {
                                    ud1Var.a(false, false);
                                }
                                this.M0.animate().alpha(0.0f).setDuration(250L).start();
                                break;
                            }
                            break;
                        case 12:
                            if (this.q0 != 12) {
                                this.F.b(org.telegram.messenger.cd.L0(2131743435, null), true, z22);
                                break;
                            }
                            break;
                        case 13:
                            this.F.b(org.telegram.messenger.cd.L0(2131743244, null), true, z22);
                            break;
                        case 14:
                            this.F.b(org.telegram.messenger.cd.L0(2131743272, null), true, z22);
                            break;
                        case 15:
                            this.e0.setRetryMod(false);
                            if (sharedState != null && sharedState.isConference()) {
                                this.F.b(org.telegram.messenger.cd.L0(2131743324, null), false, z22);
                                this.e0.setTranslationY(0.0f);
                            } else if (sharedState == null || !sharedState.isCallingVideo()) {
                                this.F.b(org.telegram.messenger.cd.L0(2131743326, null), false, z22);
                                this.e0.setTranslationY(0.0f);
                            } else {
                                this.F.b(org.telegram.messenger.cd.L0(2131743323, null), false, z22);
                                this.e0.setTranslationY(-org.telegram.messenger.i0.L(60.0f));
                            }
                            z10 = false;
                            z11 = false;
                            break;
                        case 16:
                            if (this.q0 != 16) {
                                this.F.b(org.telegram.messenger.cd.L0(2131743271, null), true, z22);
                                break;
                            }
                            break;
                        case 17:
                            this.F.b(org.telegram.messenger.cd.L0(2131743518, null), false, z22);
                            this.e0.setRetryMod(true);
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
                        this.Y.b();
                        this.Z.b();
                    }
                    if (this.m0) {
                        if (this.E0) {
                            f12 = 1.0f;
                        } else {
                            f12 = 1.0f;
                            this.w.setAlpha(1.0f);
                        }
                        if (z22) {
                            this.c0.animate().alpha(f12).setDuration(250L).start();
                        } else {
                            this.c0.animate().cancel();
                            this.c0.setAlpha(f12);
                        }
                        if (!this.c0.d.isFirstFrameRendered() && !this.I0) {
                            i10 = 0;
                            this.m0 = false;
                            if (!this.n0 || this.m0) {
                                this.w.setVisibility(4);
                            } else {
                                this.w.setVisibility(i10);
                                if (z22) {
                                    this.c0.animate().alpha(0.0f).setDuration(250L).start();
                                } else {
                                    this.c0.animate().cancel();
                                    this.c0.setAlpha(0.0f);
                                }
                            }
                            z12 = this.n0;
                            if (z12 || !this.m0) {
                                this.H0 = false;
                            }
                            z13 = (z12 || !this.H0 || org.telegram.messenger.i0.H1(this.b)) ? false : true;
                            w(z22, z24);
                            L = this.D.getTag() != null ? 0 : org.telegram.messenger.i0.L(135.0f) + org.telegram.messenger.i0.L(12.0f);
                            if (z22) {
                                this.e0.setVisibility(z21 ? 0 : 8);
                            } else {
                                if (z21 && this.e0.getTag() == null) {
                                    this.e0.animate().setListener(null).cancel();
                                    if (this.e0.getVisibility() == 8) {
                                        this.e0.setVisibility(0);
                                        this.e0.setAlpha(0.0f);
                                    }
                                    this.e0.animate().alpha(1.0f);
                                }
                                if (!z21 && this.e0.getTag() != null) {
                                    this.e0.animate().setListener(null).cancel();
                                    this.e0.animate().setListener(new qd1(this, 9)).alpha(0.0f);
                                }
                            }
                            this.e0.setEnabled(z21);
                            this.e0.setTag(!z21 ? 1 : null);
                            this.u0.setLockOnScreen(this.J0);
                            z14 = this.p0 != 3 && (this.n0 || this.m0);
                            this.z0 = z14;
                            if (!z14 && !this.x0) {
                                z(true);
                            }
                            if (this.x0 && this.z0 && !this.R0 && sharedInstance != null) {
                                org.telegram.messenger.i0.h3(this.S0, 3000L);
                                this.R0 = true;
                            }
                            int i22 = this.p0;
                            boolean z25 = i22 == 11 && this.x0;
                            boolean z26 = (!z21 || i22 == 16 || i22 == 11 || i22 == 12 || i22 == 14 || i22 == 6 || !this.x0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) ? false : true;
                            if (z22) {
                                this.H.setVisibility(z25 ? 0 : 8);
                                this.H.setAlpha(z25 ? 1.0f : 0.0f);
                                this.I.setVisibility(z26 ? 0 : 8);
                                this.I.setAlpha(z26 ? 1.0f : 0.0f);
                                this.M0.setTranslationY((-org.telegram.messenger.i0.L(16.0f)) - (this.x0 ? org.telegram.messenger.i0.L(80.0f) : 0));
                            } else {
                                if (z25) {
                                    f7 = 80.0f;
                                    this.H.animate().alpha(1.0f).start();
                                } else {
                                    f7 = 80.0f;
                                    if (this.H.getVisibility() != 0) {
                                        this.H.setVisibility(0);
                                        f10 = 0.0f;
                                        this.H.setAlpha(0.0f);
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    this.H.animate().alpha(f10).start();
                                }
                                if (z26) {
                                    this.I.animate().alpha(1.0f).start();
                                } else {
                                    if (this.I.getVisibility() != 0) {
                                        this.I.setVisibility(0);
                                        f11 = 0.0f;
                                        this.I.setAlpha(0.0f);
                                    } else {
                                        f11 = 0.0f;
                                    }
                                    this.I.animate().alpha(f11).start();
                                }
                                this.M0.animate().translationY((-org.telegram.messenger.i0.L(16.0f)) - (this.x0 ? org.telegram.messenger.i0.L(f7) : 0)).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).start();
                            }
                            i11 = this.p0;
                            if (i11 != 10 && i11 != 11) {
                                C(z22);
                            }
                            if (z11) {
                                this.F.e(z22);
                            }
                            this.F.d(z10, z22);
                            if (this.D.getVisibility() == 0 && this.C0) {
                                L += org.telegram.messenger.i0.L(24.0f);
                                layout = this.T.getLayout();
                                if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                                    L = i0.a.e(lineCount, 2, org.telegram.messenger.i0.L(20.0f), L);
                                }
                            }
                            if (this.p0 == 11 && !this.n0 && !this.m0) {
                                L -= org.telegram.messenger.i0.L(24.0f);
                            }
                            if (!this.n0 || this.m0) {
                                L -= org.telegram.messenger.i0.L(60.0f);
                            }
                            if (z22) {
                                this.X.setTranslationY(L);
                            } else {
                                if (this.C0 && (this.n0 || this.m0)) {
                                    this.X.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).start();
                                    j10 = 250;
                                } else {
                                    j10 = 250;
                                    this.X.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).start();
                                }
                                if (L != this.v0) {
                                    ViewPropertyAnimator animate = this.X.animate();
                                    if (this.p0 != 11) {
                                        j10 = 0;
                                    }
                                    animate.setStartDelay(j10).translationY(L).setDuration(200L).setInterpolator(org.telegram.ui.Components.gr.f).start();
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
                                this.d0.setIsScreencast(sharedInstance.isScreencast());
                                this.d0.d.setMirror(sharedInstance.isFrontFaceCamera());
                                VideoSink videoSink2 = (!this.n0 || sharedInstance.isScreencast()) ? null : this.d0.d;
                                if (!this.m1 || (y1Var = this.k1) == null) {
                                    if (z13) {
                                        videoSink = this.b0;
                                        sharedInstance.setSinks(videoSink2, videoSink);
                                        if (z22) {
                                            org.telegram.ui.Components.voip.o1 o1Var = this.M0;
                                            o1Var.f = false;
                                            if (!o1Var.e && o1Var.getParent() != null) {
                                                TransitionManager.beginDelayedTransition(o1Var, o1Var.d);
                                            }
                                        }
                                        if (sharedInstance.isMicMute()) {
                                            this.M0.c("self-muted");
                                        } else {
                                            this.M0.a(R.drawable.calls_mute_mini, org.telegram.messenger.cd.L0(2131743312, null), "self-muted");
                                        }
                                        if ((!this.n0 || this.m0) && (((i12 = this.p0) == 3 || i12 == 5) && sharedInstance.getCallDuration() > 500)) {
                                            if (sharedInstance.getRemoteAudioState() != 0) {
                                                org.telegram.ui.Components.voip.o1 o1Var2 = this.M0;
                                                i13 = 1;
                                                o1Var2.a(R.drawable.calls_mute_mini, org.telegram.messenger.cd.a0("VoipUserMicrophoneIsOff", null, 2131743253, o1Var2.b(org.telegram.messenger.h20.j(user, true))), "muted");
                                            } else {
                                                i13 = 1;
                                                this.M0.c("muted");
                                            }
                                            if (sharedInstance.getRemoteVideoState() != 0) {
                                                org.telegram.ui.Components.voip.o1 o1Var3 = this.M0;
                                                Object[] objArr = new Object[i13];
                                                objArr[0] = o1Var3.b(org.telegram.messenger.h20.j(user, i13));
                                                o1Var3.a(R.drawable.calls_camera_mini, org.telegram.messenger.cd.a0("VoipUserCameraIsOff", null, 2131743254, objArr), MediaStreamTrack.VIDEO_TRACK_KIND);
                                            } else {
                                                this.M0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                            }
                                        } else {
                                            if (sharedInstance.getRemoteAudioState() == 0) {
                                                org.telegram.ui.Components.voip.o1 o1Var4 = this.M0;
                                                o1Var4.a(R.drawable.calls_mute_mini, org.telegram.messenger.cd.a0("VoipUserMicrophoneIsOff", null, 2131743253, o1Var4.b(org.telegram.messenger.h20.j(user, true))), "muted");
                                            } else {
                                                this.M0.c("muted");
                                            }
                                            this.M0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                        }
                                        if (this.M0.getChildCount() == 0 && this.m0 && (phoneCall = sharedInstance.privateCall) != null && !phoneCall.video) {
                                            sharedUIParams = sharedInstance.sharedUIParams;
                                            if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                                sharedUIParams.tapToVideoTooltipWasShowed = true;
                                                this.N0.setTranslationY(-((this.s.getMeasuredHeight() - this.j0.getY()) + org.telegram.messenger.i0.L(6.0f)));
                                                this.N0.m(0.0f, this.f.getX() + this.j0.getX() + org.telegram.messenger.i0.L(14.0f));
                                                this.N0.u();
                                                z18 = true;
                                                if (z22) {
                                                    org.telegram.ui.Components.voip.o1 o1Var5 = this.M0;
                                                    if (o1Var5.f) {
                                                        o1Var5.e = z18;
                                                        org.telegram.messenger.i0.h3(new org.telegram.ui.ActionBar.w5(o1Var5, 7), 700L);
                                                    }
                                                    o1Var5.f = false;
                                                }
                                            }
                                        }
                                        if (this.M0.getChildCount() != 0) {
                                            z18 = true;
                                            this.N0.e(true);
                                            if (z22) {
                                            }
                                        }
                                        z18 = true;
                                        if (z22) {
                                        }
                                    } else {
                                        y1Var = this.c0;
                                    }
                                }
                                videoSink = y1Var.d;
                                sharedInstance.setSinks(videoSink2, videoSink);
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
                            b1Var = this.Z;
                            if (b1Var.getParent() == null && z22) {
                                b1Var.T = childsHight;
                            } else {
                                b1Var.T = childsHight;
                            }
                            b1Var2 = this.Y;
                            if (b1Var2.getParent() == null && z22) {
                                b1Var2.T = childsHight;
                            } else {
                                b1Var2.T = childsHight;
                            }
                            this.Y.setUiVisible(this.x0);
                            this.Z.setUiVisible(this.x0);
                            if (this.n0) {
                                z15 = true;
                                y(0, z22);
                            } else if (!this.m0 || this.H0) {
                                z15 = true;
                                y(1, z22);
                            } else {
                                y(2, z22);
                                z15 = true;
                            }
                            if (!z13 && this.Z.getTag() == null) {
                                this.Z.setIsActive(z15);
                                if (this.Z.getVisibility() != 0) {
                                    this.Z.setVisibility(0);
                                    this.Z.setAlpha(0.0f);
                                    this.Z.setScaleX(0.5f);
                                    this.Z.setScaleY(0.5f);
                                }
                                this.Z.animate().setListener(null).cancel();
                                org.telegram.ui.Components.voip.b1 b1Var4 = this.Z;
                                b1Var4.c0 = true;
                                b1Var4.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).setStartDelay(150L).withEndAction(new md1(this, 4)).start();
                                this.Z.setTag(1);
                            } else if (!z13 && this.Z.getTag() != null) {
                                this.Z.setIsActive(false);
                                this.Z.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new qd1(this, 6)).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).start();
                                this.Z.setTag(null);
                            }
                            this.Y.a();
                            this.Z.a();
                            E();
                            if (this.p0 == 3) {
                                this.x.a();
                                this.D.a();
                                int i24 = this.w.V;
                                if (i24 != 2 && i24 != 3) {
                                    int[] iArr2 = new int[2];
                                    this.D.getLocationOnScreen(iArr2);
                                    z16 = true;
                                    this.w.b(org.telegram.messenger.i0.L(106.0f) + iArr2[0], org.telegram.messenger.i0.L(106.0f) + iArr2[1], this.q0 != -1);
                                    z17 = (!this.n0 || this.m0) ? z16 : false;
                                    this.y.setState(z17);
                                    this.x.setState(z17);
                                    this.r.e(z17);
                                    if (this.m0 && !z24 && this.f0) {
                                        this.f0 = false;
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
                                    md1 md1Var = this.T0;
                                    org.telegram.messenger.i0.r(md1Var);
                                    if (this.p0 == 3) {
                                        org.telegram.messenger.i0.h3(md1Var, 10000L);
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
                                this.f0 = false;
                                if (sharedInstance != null) {
                                }
                            }
                            if (z17) {
                            }
                            md1 md1Var2 = this.T0;
                            org.telegram.messenger.i0.r(md1Var2);
                            if (this.p0 == 3) {
                            }
                        }
                    }
                    i10 = 0;
                    if (this.n0) {
                    }
                    this.w.setVisibility(4);
                    z12 = this.n0;
                    if (z12) {
                    }
                    this.H0 = false;
                    if (z12) {
                    }
                    w(z22, z24);
                    if (this.D.getTag() != null) {
                    }
                    if (z22) {
                    }
                    this.e0.setEnabled(z21);
                    this.e0.setTag(!z21 ? 1 : null);
                    this.u0.setLockOnScreen(this.J0);
                    if (this.p0 != 3) {
                    }
                    this.z0 = z14;
                    if (!z14) {
                        z(true);
                    }
                    if (this.x0) {
                        org.telegram.messenger.i0.h3(this.S0, 3000L);
                        this.R0 = true;
                    }
                    int i222 = this.p0;
                    if (i222 == 11) {
                    }
                    if (!z21) {
                    }
                    if (z22) {
                    }
                    i11 = this.p0;
                    if (i11 != 10) {
                        C(z22);
                    }
                    if (z11) {
                    }
                    this.F.d(z10, z22);
                    if (this.D.getVisibility() == 0) {
                        L += org.telegram.messenger.i0.L(24.0f);
                        layout = this.T.getLayout();
                        if (layout != null) {
                            L = i0.a.e(lineCount, 2, org.telegram.messenger.i0.L(20.0f), L);
                        }
                    }
                    if (this.p0 == 11) {
                        L -= org.telegram.messenger.i0.L(24.0f);
                    }
                    if (!this.n0) {
                    }
                    L -= org.telegram.messenger.i0.L(60.0f);
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
                    b1Var = this.Z;
                    if (b1Var.getParent() == null) {
                    }
                    b1Var.T = childsHight;
                    b1Var2 = this.Y;
                    if (b1Var2.getParent() == null) {
                    }
                    b1Var2.T = childsHight;
                    this.Y.setUiVisible(this.x0);
                    this.Z.setUiVisible(this.x0);
                    if (this.n0) {
                    }
                    if (!z13) {
                    }
                    if (!z13) {
                        this.Z.setIsActive(false);
                        this.Z.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new qd1(this, 6)).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).start();
                        this.Z.setTag(null);
                    }
                    this.Y.a();
                    this.Z.a();
                    E();
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
                    md1 md1Var22 = this.T0;
                    org.telegram.messenger.i0.r(md1Var22);
                    if (this.p0 == 3) {
                    }
                }
            }
            D(z22);
            if (this.p0 == 5) {
                z10 = this.s0;
                if (!z10 && this.q0 != 5) {
                    this.F.b(org.telegram.messenger.cd.L0(2131743445, null), true, z22);
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

    public final ValueAnimator b(boolean z10) {
        char c10;
        float f7;
        float measuredWidth;
        final float measuredHeight;
        final float f10;
        final boolean z11;
        float f11;
        float f12;
        float f13;
        boolean z12;
        float f14;
        this.Y.animate().cancel();
        float f15 = org.telegram.ui.Components.voip.t1.d().d.x + org.telegram.ui.Components.voip.t1.d().E;
        float f16 = org.telegram.ui.Components.voip.t1.d().d.y + org.telegram.ui.Components.voip.t1.d().F;
        final float x10 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.t1.V.getClass();
        final float measuredWidth2 = f15 - ((this.c0.getMeasuredWidth() - (this.c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f16 - ((this.c0.getMeasuredHeight() - (this.c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f17 = 1.0f;
        if (this.m0) {
            int measuredWidth3 = this.Y.getMeasuredWidth();
            if (!this.n0 || measuredWidth3 == 0) {
                c10 = 0;
                f7 = 4.0f;
                measuredWidth = 1.0f;
                f13 = 1.0f;
                z12 = false;
                f14 = 0.0f;
            } else {
                f14 = (this.u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c10 = 0;
                f7 = 4.0f;
                measuredWidth = org.telegram.ui.Cells.f1.x(org.telegram.ui.Components.voip.t1.d().f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.t1.d().f * 0.25f) + (f15 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f14)) / 2.0f))) - org.telegram.messenger.i0.L(4.0f);
                f13 = org.telegram.ui.Cells.f1.x(org.telegram.ui.Components.voip.t1.d().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.t1.d().h * 0.25f) + (f16 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f14)) / 2.0f))) - org.telegram.messenger.i0.L(4.0f);
                z12 = true;
            }
            measuredHeight = f13;
            z11 = z12;
            f10 = f14;
        } else {
            c10 = 0;
            f7 = 4.0f;
            measuredWidth = f15 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f16 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
            f10 = 0.25f;
            z11 = true;
        }
        final float f18 = measuredWidth;
        final float L = this.m0 ? org.telegram.messenger.i0.L(f7) : 0.0f;
        final float L2 = (org.telegram.messenger.i0.L(f7) * 1.0f) / f10;
        if (this.m0) {
            org.telegram.ui.Components.voip.t1.V.getClass();
            f11 = 1.0f;
            f17 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        float f19 = f11;
        if (z10) {
            if (z11) {
                this.Y.setScaleX(f10);
                this.Y.setScaleY(f10);
                this.Y.setTranslationX(f18);
                this.Y.setTranslationY(measuredHeight);
                this.Y.setCornerRadius(L2);
                this.Y.setAlpha(f17);
            }
            this.c0.setScaleX(0.25f);
            this.c0.setScaleY(0.25f);
            this.c0.setTranslationX(measuredWidth2);
            this.c0.setTranslationY(measuredHeight2);
            f12 = 0.25f;
            this.c0.setRoundCorners((org.telegram.messenger.i0.L(6.0f) * f19) / 0.25f);
        } else {
            f12 = 0.25f;
        }
        float f20 = z10 ? f19 : 0.0f;
        float f21 = z10 ? 0.0f : f19;
        float[] fArr = new float[2];
        fArr[c10] = f20;
        fArr[1] = f21;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.F0 = z10 ? 0.0f : f19;
        F();
        final float f22 = f12;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.pd1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f23 = 1.0f - floatValue;
                be1 be1Var = be1.this;
                be1Var.F0 = f23;
                be1Var.F();
                if (z11) {
                    float f24 = (f10 * floatValue) + (scaleX * f23);
                    be1Var.Y.setScaleX(f24);
                    be1Var.Y.setScaleY(f24);
                    be1Var.Y.setTranslationX((f18 * floatValue) + (x10 * f23));
                    be1Var.Y.setTranslationY((measuredHeight * floatValue) + (y3 * f23));
                    be1Var.Y.setCornerRadius((L2 * floatValue) + (L * f23));
                    be1Var.Y.setAlpha((f17 * floatValue) + (1.0f * f23));
                }
                float f25 = (f22 * floatValue) + (1.0f * f23);
                be1Var.c0.setScaleX(f25);
                be1Var.c0.setScaleY(f25);
                float f26 = 0.0f * f23;
                float f27 = (measuredWidth2 * floatValue) + f26;
                float f28 = (measuredHeight2 * floatValue) + f26;
                be1Var.c0.setTranslationX(f27);
                be1Var.c0.setTranslationY(f28);
                be1Var.c0.setRoundCorners(((org.telegram.messenger.i0.L(4.0f) * floatValue) * 1.0f) / f25);
                if (!be1Var.Y.P) {
                    be1Var.d0.d(false, floatValue);
                }
                be1Var.u0.invalidate();
            }
        });
        return ofFloat;
    }

    @Override // lf.a
    public final void c(com.google.android.gms.internal.cast.o oVar) {
        this.l1 = oVar;
        org.telegram.ui.Components.voip.y1 y1Var = this.c0;
        if (y1Var != null) {
            y1Var.d.clearFirstFrame();
        }
        this.m1 = true;
        G();
        try {
            ((WindowManager) this.b.getSystemService("window")).removeView(this.u0);
        } catch (IllegalArgumentException e) {
            org.telegram.messenger.f8.g(e, true);
        }
        this.u0.invalidate();
    }

    public final void d() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.O4);
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.M4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.E2);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.G5);
        jf.f fVar = this.g0;
        if (fVar != null) {
            fVar.c();
            this.g0 = null;
        }
        mg.i2 i2Var = this.M;
        if (i2Var != null) {
            i2Var.dismiss();
            this.M = null;
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.M4) {
            if (this.p0 != 17 || VoIPService.getSharedInstance() == null) {
                return;
            }
            this.d0.d.release();
            this.c0.d.release();
            this.b0.release();
            h();
            VoIPService.getSharedInstance().registerStateListener(this);
            return;
        }
        if (i10 == org.telegram.messenger.zs.i4) {
            D(true);
            return;
        }
        if (i10 == org.telegram.messenger.zs.E2) {
            this.u0.b();
            return;
        }
        if (i10 == org.telegram.messenger.zs.O4) {
            this.D.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
            return;
        }
        if (i10 == org.telegram.messenger.zs.G5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f0 = booleanValue;
            if (booleanValue) {
                this.D.b(true, true);
            }
        }
    }

    public final void e(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.f2 f2Var = this.x;
            int i10 = 1;
            if (f2Var.K && z10 != f2Var.E) {
                f2Var.E = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                f2Var.c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.e2(f2Var, i10));
                f2Var.c.setInterpolator(org.telegram.ui.Components.gr.f);
                f2Var.c.setDuration(200L);
                f2Var.c.start();
            }
            if (z10) {
                int i11 = org.telegram.messenger.tz.f1;
                if (i11 < 2) {
                    org.telegram.messenger.tz.f1 = i11 + 2;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.tz.f1);
                    edit.apply();
                }
                this.O0.e(true);
                org.telegram.messenger.i0.r(this.S0);
                this.R0 = false;
                if (this.D.getVisibility() == 0) {
                    this.D.animate().setStartDelay(0L).translationY(org.telegram.messenger.i0.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.gr.f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.gr.g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(org.telegram.messenger.i0.L(140.0f));
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
                org.telegram.messenger.z20.m(translationY, grVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-org.telegram.messenger.i0.L(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new qd1(this, 3)).setInterpolator(grVar).start();
            } else {
                if (this.D.getVisibility() == 0) {
                    this.D.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.gr.f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.f;
                duration.setInterpolator(grVar2).setListener(new eg.m(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(grVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.i0.L(120.0f)).setListener(new qd1(this, 4)).setDuration(250L).setInterpolator(grVar2).start();
            }
            this.q0 = this.p0;
            G();
        }
    }

    public final void f() {
        this.u0.b();
    }

    @Override // lf.a
    public final void g(com.google.android.gms.internal.cast.o oVar) {
        this.l1 = oVar;
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        td1 td1Var = this.u0;
        td1Var.getClass();
        windowManager.addView(td1Var, org.telegram.ui.Components.voip.c2.a());
        this.m1 = false;
        G();
        this.u0.invalidate();
        org.telegram.ui.Components.voip.y1 y1Var = this.k1;
        if (y1Var != null) {
            y1Var.d.release();
            this.k1 = null;
        }
    }

    public final void h() {
        this.d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new rd1(this));
        this.c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new sd1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    @Override // lf.a
    public final Bitmap i() {
        org.telegram.ui.Components.voip.y1 y1Var = this.k1;
        if (y1Var == null || !y1Var.d.isAvailable()) {
            return null;
        }
        return this.k1.d.getBitmap();
    }

    public final void j() {
        if (this.G0 || this.E0) {
            return;
        }
        ud1 ud1Var = this.o0;
        if (ud1Var != null) {
            ud1Var.a(false, false);
            return;
        }
        if (this.m0 && this.n0 && this.H0) {
            this.H0 = false;
            this.Y.setRelativePosition(this.Z);
            this.a0 = false;
            this.q0 = this.p0;
            G();
            return;
        }
        if (this.C0) {
            e(false);
            return;
        }
        if (this.R.getVisibility() != 8) {
            return;
        }
        if (!this.D0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isConverting()) {
            this.u0.b();
            return;
        }
        if (mf.b.a(this.b) <= 0) {
            org.telegram.ui.Components.s4.A(this.b, new kd1(this, 0), true).p();
            return;
        }
        if (this.G0 || n1 == null) {
            return;
        }
        this.G0 = true;
        if (VoIPService.getSharedInstance() != null) {
            int measuredHeight = n1.u0.getMeasuredHeight();
            be1 be1Var = n1;
            org.telegram.ui.Components.voip.t1.e(be1Var.b, be1Var.a, be1Var.u0.getMeasuredWidth(), measuredHeight, 1);
            WindowInsets windowInsets = n1.r0;
            if (windowInsets != null) {
                org.telegram.ui.Components.voip.t1.X = windowInsets.getSystemWindowInsetTop();
                n1.r0.getSystemWindowInsetBottom();
            }
        }
        if (org.telegram.ui.Components.voip.t1.d() == null) {
            return;
        }
        ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
        duration.setInterpolator(grVar).start();
        this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
        this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
        this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
        this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
        this.j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
        this.h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
        this.i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
        this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
        this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
        org.telegram.ui.Components.voip.t1.U = true;
        this.E0 = true;
        ValueAnimator b10 = b(false);
        this.L0.d();
        b10.addListener(new qd1(this, 1));
        b10.setDuration(350L);
        b10.setInterpolator(grVar);
        b10.start();
    }

    @Override // lf.a
    public final void l(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override // lf.a
    public final Bitmap m() {
        org.telegram.ui.Components.voip.y1 y1Var = this.c0;
        if (y1Var == null || !y1Var.d.isAvailable()) {
            return null;
        }
        return this.c0.d.getBitmap();
    }

    public final void o(Runnable runnable) {
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
        this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, org.telegram.messenger.cd.L0(2131743437, null), false, false);
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
        org.telegram.messenger.i0.L(52.0f);
        final int L = org.telegram.messenger.i0.L(24.0f);
        final int L2 = org.telegram.messenger.i0.L(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.od1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                be1 be1Var = be1.this;
                be1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                be1Var.e0.setTranslationY(L2 * floatValue);
                int i10 = (int) (marginEnd - ((r1 + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i10;
                marginLayoutParams2.rightMargin = i10;
                be1Var.e0.requestLayout();
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
        animatorSet.addListener(new org.telegram.ui.Components.iw0(12, this, runnable));
        animatorSet.start();
        org.telegram.messenger.i0.h3(new md1(this, 7), 133L);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        C(true);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.y0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        this.q0 = this.p0;
        G();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i10, int i11) {
        this.q0 = this.p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            jf.f fVar = this.g0;
            if (fVar != null) {
                fVar.c();
                this.g0 = null;
            }
        } else if (this.g0 == null && mf.b.a(this.b) == 1) {
            jf.e eVar = new jf.e(this.b, n1);
            eVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.y1 y1Var = this.c0;
            eVar.j = y1Var.d;
            eVar.k = y1Var.getPlaceholderView();
            this.g0 = eVar.a();
        }
        G();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.j2 j2Var;
        if (i10 > 0) {
            this.j1 = true;
        }
        if (this.F == null || (j2Var = this.w) == null) {
            return;
        }
        int i11 = j2Var.V;
        if ((i11 == 2 || i11 == 3) && this.j1) {
            org.telegram.messenger.i0.h3(new org.telegram.ui.Components.qq(this, i10, 22), 400L);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        int i11 = this.p0;
        if (i11 != i10) {
            this.q0 = i11;
            this.p0 = i10;
            if (this.u0 != null) {
                G();
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z10) {
        this.q0 = this.p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        G();
    }

    public final void p(org.telegram.ui.Components.voip.r2 r2Var, VoIPService voIPService) {
        if (!this.n0) {
            r2Var.d(2, false, false);
            r2Var.setOnBtnClickedListener(null);
            r2Var.setEnabled(false);
        } else {
            r2Var.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                r2Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
            } else {
                r2Var.d(2, voIPService.isSwitchingCamera(), false);
            }
            r2Var.setOnBtnClickedListener(new a7(this, voIPService, r2Var, 23));
        }
    }

    @Override // lf.a
    public final /* synthetic */ boolean q() {
        return true;
    }

    @Override // lf.a
    public final View r() {
        org.telegram.ui.Components.voip.y1 y1Var = new org.telegram.ui.Components.voip.y1(this.b, false, true, false, false);
        this.k1 = y1Var;
        y1Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.k1.d.setEnableHardwareScaler(true);
        this.k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.y1 y1Var2 = this.k1;
        y1Var2.a0 = 1;
        y1Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new vd1(this));
        View view = this.k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.k1;
    }

    public final void s(org.telegram.ui.Components.voip.r2 r2Var, VoIPService voIPService, boolean z10) {
        r2Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.b1 b1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        if (z10) {
            ValueAnimator valueAnimator = b1Var.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(b1Var.K, isMicMute ? 1.0f : 0.0f);
            b1Var.f0 = ofFloat;
            ofFloat.addUpdateListener(b1Var.g0);
            b1Var.f0.setDuration(150L);
            b1Var.f0.start();
        } else {
            ValueAnimator valueAnimator2 = b1Var.f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            b1Var.K = isMicMute ? 1.0f : 0.0f;
            b1Var.invalidate();
        }
        r2Var.setOnBtnClickedListener(new kd1(this, 5));
    }

    public final void t(org.telegram.ui.Components.voip.r2 r2Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i11 = 0;
        if (voIPService.isBluetoothOn()) {
            r2Var.d(4, false, false);
            i11 = 2;
        } else {
            if (!voipAudioManager.isSpeakerphoneOn()) {
                r2Var.d(5, false, false);
                i10 = 1;
                r2Var.setEnabled(true);
                r2Var.setOnBtnClickedListener(new mg.i0(this, i10, r2Var, voIPService, 9));
            }
            r2Var.d(5, true, false);
        }
        i10 = i11;
        r2Var.setEnabled(true);
        r2Var.setOnBtnClickedListener(new mg.i0(this, i10, r2Var, voIPService, 9));
    }

    public final void u(org.telegram.ui.Components.voip.r2 r2Var, VoIPService voIPService, boolean z10) {
        if (!((this.n0 || this.m0) ? true : voIPService.isVideoAvailable())) {
            r2Var.d(3, true, false);
            r2Var.setOnClickListener(null);
            r2Var.setEnabled(false);
            return;
        }
        if (!this.n0) {
            r2Var.d(3, true, z10);
        } else if (voIPService.isScreencast()) {
            r2Var.d(3, false, z10);
        } else {
            r2Var.d(3, false, z10);
        }
        r2Var.setOnBtnClickedListener(new kd1(this, 6));
        r2Var.setEnabled(true);
    }

    public final void w(boolean z10, boolean z11) {
        boolean z12 = (this.n0 || this.m0) ? false : true;
        if (!z10) {
            this.D.animate().setListener(null).cancel();
            this.D.setTranslationY(0.0f);
            this.D.setAlpha(1.0f);
            this.D.setScaleX(1.0f);
            this.D.setScaleY(1.0f);
            this.D.setVisibility(z12 ? 0 : 8);
        } else if (z12 && this.D.getTag() == null) {
            this.D.animate().setListener(null).cancel();
            this.D.setVisibility(0);
            if (this.C0) {
                if (z11) {
                    this.D.setAlpha(0.0f);
                    this.D.setTranslationY(org.telegram.messenger.i0.L(48.0f));
                    this.D.setScaleX(0.1f);
                    this.D.setScaleY(0.1f);
                }
            } else if (z11) {
                this.D.setAlpha(0.0f);
                this.D.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).start();
            } else {
                this.D.setAlpha(0.0f);
                this.D.setTranslationY(-org.telegram.messenger.i0.L(135.0f));
                this.D.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).start();
            }
        } else if (!z12 && this.D.getTag() != null) {
            this.D.animate().setListener(null).cancel();
            this.D.setTranslationY(0.0f);
            this.D.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.gr.f).setListener(new qd1(this, 8)).start();
        }
        this.D.setTag(z12 ? 1 : null);
    }

    public final void x(CharSequence charSequence) {
        TextView textView;
        if (this.b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3(0, this.b, null);
        boolean[] zArr = new boolean[3];
        r3Var.R = org.telegram.messenger.cd.L0(2131743434, null);
        r3Var.T = charSequence;
        r3Var.n0 = org.telegram.messenger.cd.L0(2131747847, null);
        r3Var.o0 = null;
        r3Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) r3Var.d(-(i10 + 1))) != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, r3Var.k1);
            }
        }
        r3Var.setCanceledOnTouchOutside(true);
        r3Var.setOnDismissListener(new q5(this, 18));
    }

    public final void y(int i10, boolean z10) {
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.x0);
        }
        if (!z10 && (animatorSet = this.A0) != null) {
            animatorSet.removeAllListeners();
            this.A0.cancel();
        }
        if (i10 != 0) {
            boolean z11 = (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() == 0) ? false : z10;
            if (!z10) {
                this.Y.setVisibility(0);
            } else if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 0) {
                if (this.Y.getVisibility() == 8) {
                    this.Y.setAlpha(0.0f);
                    this.Y.setScaleX(0.7f);
                    this.Y.setScaleY(0.7f);
                    this.Y.setVisibility(0);
                }
                AnimatorSet animatorSet2 = this.A0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.A0.cancel();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.b1, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.b1, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.b1, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.A0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.b1 b1Var = this.Y;
                if (b1Var.D < 0.0f) {
                    b1Var.d(1.0f, 1.0f);
                    this.a0 = true;
                }
            }
            this.Y.c(i10 == 2, z11);
            this.a0 = i10 != 2;
        } else if (!z10) {
            this.Y.setVisibility(8);
        } else if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() != 0) {
            AnimatorSet animatorSet4 = this.A0;
            if (animatorSet4 != null) {
                animatorSet4.removeAllListeners();
                this.A0.cancel();
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            org.telegram.ui.Components.voip.b1 b1Var2 = this.Y;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(b1Var2, (Property<org.telegram.ui.Components.voip.b1, Float>) View.ALPHA, b1Var2.getAlpha(), 0.0f));
            if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 2) {
                org.telegram.ui.Components.voip.b1 b1Var3 = this.Y;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b1Var3, (Property<org.telegram.ui.Components.voip.b1, Float>) View.SCALE_X, b1Var3.getScaleX(), 0.7f);
                org.telegram.ui.Components.voip.b1 b1Var4 = this.Y;
                animatorSet5.playTogether(ofFloat, ObjectAnimator.ofFloat(b1Var4, (Property<org.telegram.ui.Components.voip.b1, Float>) View.SCALE_Y, b1Var4.getScaleX(), 0.7f));
            }
            this.A0 = animatorSet5;
            animatorSet5.addListener(new qd1(this, 7));
            this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.gr.f);
            this.A0.setStartDelay(50L);
            this.A0.start();
        }
        this.Y.setTag(Integer.valueOf(i10));
    }

    public final void z(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        u01 u01Var = this.Q0;
        if (z10 || !this.x0) {
            if (z10 && !this.x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
                translationY.setInterpolator(grVar).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(grVar).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
                this.j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
                this.h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                this.i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, 1.0f);
                this.P0 = ofFloat;
                ofFloat.addUpdateListener(u01Var);
                this.P0.setDuration(150L).setInterpolator(grVar);
                this.P0.start();
                this.j0.setEnabled(true);
            }
            i10 = 0;
        } else {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(10.0f)).setDuration(150L);
            org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.f;
            duration.setInterpolator(grVar2).start();
            this.H.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(10.0f)).setDuration(150L).setInterpolator(grVar2).start();
            this.I.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(10.0f)).setDuration(150L).setInterpolator(grVar2).start();
            this.N.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(10.0f)).setDuration(150L).setInterpolator(grVar2).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.i0.L(10.0f)).setInterpolator(grVar2).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.i0.L(10.0f)).setInterpolator(grVar2).start();
            this.j0.animate().alpha(0.0f).translationY(org.telegram.messenger.i0.L(10.0f)).setDuration(150L).setInterpolator(grVar2).start();
            this.h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar2).start();
            this.i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y0, 0.0f);
            this.P0 = ofFloat2;
            ofFloat2.addUpdateListener(u01Var);
            this.P0.setDuration(150L).setInterpolator(grVar2);
            this.P0.start();
            org.telegram.messenger.i0.r(this.S0);
            this.R0 = false;
            this.j0.setEnabled(false);
            this.O0.e(true);
            i10 = org.telegram.messenger.zs.g2;
        }
        this.x0 = z10;
        td1 td1Var = this.u0;
        if (z10) {
            td1Var.setSystemUiVisibility(td1Var.getSystemUiVisibility() & (-5));
        } else {
            td1Var.setSystemUiVisibility(td1Var.getSystemUiVisibility() | 4);
        }
        this.M0.animate().translationY((-org.telegram.messenger.i0.L(16.0f)) - (this.x0 ? org.telegram.messenger.i0.L(80.0f) : 0)).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.gr.f).start();
    }

    @Override // lf.a
    public final /* synthetic */ void n(Canvas canvas) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z10) {
    }
}
